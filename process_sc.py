"""Konverts solar systems exported from Space Engine into work systems in KSP

Requires accompanying sc_parser.py module to work.
Can only read .sc files of whole solar sytems as exported by Space Engine.
May work with .sc files of individual objects, but has not be designed with this in mind.

Kontains a series of helper functions that perform the appropriate unit conversions.
Space Engine typically uses AU, km, years, hours, earth radius, solar radius,
earth mass and solar mass for units, KSP uses exclusively seconds, meters, and kg.

The konversion process uses templates of Kopernicus .cfg files, using python3's
.format() for fill in the appropriate values. The konvert_to_kerbal() fuction
looks for these templates in a "cfg templates" folder. Currently there is one
template for each planet type in Space Engine: Asteroid, Desert, GasGiant, IceGiant,
IceWorld, Oceania, Selena, Terra, and Titan. N.B: Asteroid is also used for comets.

Kurrently the konvert_to_kerbal() function is parasitic to the RealSolarSystem
mod. That is, there are .dlls and .cfg files in RealSolarSystem that I do not know
how to duplicate in fuctionality and are required to load the created planet .cfg files.
Therefore konvert_to_kerbal() creates all .cfg files in an identical folder
structure and naming to RSS' RSSKopernicus folder. Merging the two folders will
load the created .cfg files without issue.

There are options to limit the number of minor bodies (Asteroids and Comets)
that are created as Space Engine often generates systems with hundreds of such
objects. I have tested loading ~250 asteroids and comets along with the normal
planets and moons and the game will load and run albeit with very high memory
usage, even when all asteroids and comets share identical textures. I do not
recommend this for actuall gameplay, and suggest limiting asteroids and comets
to either none, or at most 10-15 each.

A word about textures: As all objects generated in Space Engine are procedural
there is no way to include textures for any given object from Space Eninge.
I have included a set of "generic" textures so that objects in KSP will at least
look unique from stock or RSS, but all desert planets will look the same, all
Gas Giants will look the same, etc."""

from decimal import Decimal
import os
import re
import math
import argparse
from sc_parser import SCParser

def mass_to_kg(astro_object):
    """Takes an astronomical object and returns it's mass in kg. Will check
        first if masses are solar or earth masses and do the correct conversion"""
    if "MassSol" in astro_object['data'].keys():
        return Decimal(1.988435E+30) * Decimal(astro_object['data']['MassSol'])
    else:
        return Decimal(5.9721986E+24) * Decimal(astro_object['data']['Mass'])

def radius_to_meters(astro_object):
    """Takes an astronomical object and return it's radius in meters. Will check
        first if radii are solar or earth radii and do the correct conversion"""
    if "RadSol" in astro_object['data'].keys():
        return Decimal(6.955E+8) * Decimal(astro_object['data']["RadSol"])
    else:
        return 1000 * Decimal(astro_object['data']['Radius'])

def au_to_meters(astronomical_units):
    """Converts astronomical_units to meters, 1 AU = 1.495978707e+11 meters"""
    return Decimal(astronomical_units) * Decimal(1.495978707e+11)

def year_to_seconds(years):
    """Converts years to seconds, 1 year = 31557600 seconds"""
    return Decimal(years) * 31557600

def get_rotation_period(astro_object):
    """Returns rotation period of object in seconds, will first check to see
        if object is tidally locked, and if so, returns the orbital period in seconds"""
    if "TidalLocked" in astro_object['data']:
        return year_to_seconds(astro_object['data']['Orbit']['Period'])
    else:
        return Decimal(astro_object['data']['RotationPeriod']) * 3600

def is_tidally_locked(astro_object):
    """Returns boolean of TidalLocked, needed because formating for kerbal uses
        "true" and "false" instead of python's "True" and "False" """
    if "TidalLocked" in astro_object['data']:
        return "true"
    else:
        return "false"

def format_name(name):
    """Removes alpha characters from object names, used for testing
        will probably remove later"""
    non_decimal = re.compile(r'[^\d.]+')
    return non_decimal.sub('', name)

def check_parent(parent_body):
    """ Fixes parent body of objects from "Proxima" to "Sun", used for testing
        will be obsolete once I figure out how to rename "Sun" """
    if parent_body == "Proxima" or parent_body == "Barnard's Star":
        return "Sun"
    else:
        return parent_body

def create_system_barycenter():
    """When I implement support for n-nary star systems they will be
    initiallized here"""
    pass

def create_star(star):
    with open("cfg templates/star.cfg", 'r') as in_file:
        template = in_file.read()
    path = "RealSolarSystem/RSSKopernicus/"
    if not os.path.exists(path):
        os.makedirs(path)
    with open(path + 'Sun.cfg', 'wt') as out_file:
        template = template.format(
            Radius=radius_to_meters(star),
            Mass=mass_to_kg(star),
            Luminosity=star['data']['Luminosity'],
            red=star['data']['Color'][0],
            green=star['data']['Color'][1],
            blue=star['data']['Color'][2])
        out_file.write(template)

def luminosity_to_watts(star):
    return Decimal(star['data']['Luminosity'] * 3.828e+26)

def get_planet_temp(star, planet):
    l_star = luminosity_to_watts(star)
    albedo = planet['data']['AlbedoBond']
    dist = au_to_meters(planet['data']['Orbit']['SemiMajorAxis'])
    return ((l_star * Decimal(1 - albedo)) / (Decimal(4 * math.pi * 5.67e-8) * dist**2))**Decimal(0.25)

def create_planet(planet):
    texture = ''
    # assign class tuple
    p_classes = [
        (0, "Asteroid"),
        (1, "Selena"),
        (2, "IceWorld"),
        (3, "Desert"),
        (4, "Terra"),
        (5, "Oceania"),
        (6, "Titan"),
        (7, "IceGiant"),
        (8, "GasGiant")]
    p_class = ''
    for i in p_classes:
        if planet['data']['Class'] == i[1]:
            p_class = i

    # Determine temperature
    temp = get_planet_temp(star, planet)
    temp_class = ''
    if temp > 800:
        temp_class = (0, "Scorched")
    elif temp > 400:
        temp_class = (1, "Hot")
    elif temp > 300:
        temp_class = (2, "Warm")
    elif temp > 250:
        temp_class = (3, "Temperate")
    elif temp > 200:
        temp_class = (4, "Cool")
    elif temp > 100:
        temo_class = (5, "Cold")
    else:
        temp_class = (6, "Frozen")

    # Determine size
    p_size = ''
    if p_class[1] == "Asteroid":
        p_size = (0, "asteroid")
    elif p_class[1] == "IceGiant":
        p_size = (5, "ice_giant")
    elif p_class[1] == "GasGiant":
        if planet['data']['Mass'] >= 2070: # 2070 earth mass = 6.5 jupiter mass
            p_size = (7, "super_giant")
        else:
            p_size = (6, "gas_giant")
    else:
        if planet['data']['Mass'] < 0.1:
            p_size = (1, "dwarf")
        elif planet['data']['Mass'] < 0.5:
            p_size = (2, "subterra")
        elif planet['data']['Mass'] <= 2:
            p_size = (3, "terra")
        else:
            p_size = (4, "superterra")

    # Tidal locking
    t_lock = ''
    if "TidalLocked" in planet['data']:
        t_lock = 1
    else:
        t_lock = 0

    # Life
    life = ''
    if "Life" in planet['data']:
        life = 1
    else:
        life = 0



    # Configure path and select texture
    with open("cfg templates/" + planet['data']['Class'] + ".cfg", "r") as in_file:
        template = in_file.read()
    if planet['type'] == 'Moon' or planet['type'] == 'DwarfMoon':
        path = "RealSolarSystem/RSSKopernicus/" + planet['data']['ParentBody'] +'/'
    elif planet['type'] == 'Asteroid':
        path = "RealSolarSystem/RSSKopernicus/Asteroids/"
    elif planet['type'] == 'Comet':
        path = "RealSolarSystem/RSSKopernicus/Comets/"
    else:
        path = "RealSolarSystem/RSSKopernicus/" + planet['name'] + '/'

    if not os.path.exists(path):
        os.makedirs(path)


    if idx == bin_idx + 1:
        with open(path + "RotationPeriod.cfg", 'wt') as out_file:
            out_file.write(rotation_period)

    with open(path + planet['name'] + '.cfg', 'wt') as out_file:
        template = template.format(
            name=i['name'],
            index=idx + 3,
            SigmaBinary=sigma_binary,
            ParentBody=check_parent(i['data']['ParentBody']),
            SemiMajorAxis=au_to_meters(i['data']['Orbit']['SemiMajorAxis']),
            Eccentricity=i['data']['Orbit']['Eccentricity'],
            Inclination=i['data']['Orbit']['Inclination'],
            MeanAnomaly=i['data']['Orbit']['MeanAnomaly'],
            AscendingNode=i['data']['Orbit']['AscendingNode'],
            ArgOfPericenter=i['data']['Orbit']['ArgOfPericenter'],
            red=i['data']['Color'][0],
            green=i['data']['Color'][1],
            blue=i['data']['Color'][2],
            description='test',
            Radius=radius_to_meters(i),
            Mass=mass_to_kg(i),
            RotationPeriod=get_rotation_period(i),
            TidalLocked=is_tidally_locked(i),
            HomeWorld="false")
        out_file.write(template)


def konvert_to_kerbal(objects, args):
    """Loads object template and formats with the correct values to create a
        working object in KSP"""
    # Load cfg templates for any barycenters that may be in the systems
    template = ''
    sigma_binary = ''
    sigma_binary_cfg = ''
    bin_idx = -10
    with open("cfg templates/SigmaBinary.cfg", 'r') as in_file:
        sigma_binary_cfg = in_file.read()
    rotation_period = ''
    rotation_period_cfg = ''
    with open("cfg templates/RotationPeriod.cfg", 'r') as in_file:
        rotation_period_cfg = in_file.read()

    for idx, i in enumerate(objects):
        # If the first object is a Barycenter, then we know this is a N-nary
        # star sytem which is currently not supported so throw an error. We
        # check for it in the loop because later the logic to support N-nary
        # star sytems will go here anyways.
        if objects[0]['type'] == "Barycenter":
            print("This is an N-nary star system and cannot be konverted to a KSP system (yet)")
            break

        # Create star (not setup to handle more than one star)
        if i['type'] == 'Star':
            create_star(i)
            continue

        # Check to see if we've exceeded our asteroid/comet quota
        if i["type"] == "Asteroid":
            num = format_name(i["name"])
            if int(num) > int(args.num_asteroids):
                continue
        if i["type"] == "Comet":
            num = format_name(i["name"])
            if int(num) > int(args.num_comets):
                continue

        # Check for barycenters
        if i["type"] == "Barycenter":
            objects[idx+2]['data']['Orbit']['SemiMajorAxis'] +=\
                objects[idx+1]['data']['Orbit']['SemiMajorAxis']
            objects[idx+1]['data']['Orbit'] = i['data']['Orbit']
            objects[idx+1]['data']['ParentBody'] = "Sun"
            objects[idx+2]['data']['ParentBody'] = objects[idx+1]['name']
            rotation_period = rotation_period_cfg.format(
                name_minor=objects[idx+2]['name'],
                name_major=objects[idx+1]['name'])
            bin_idx = idx
            continue

        if idx == bin_idx + 2:
            sigma_binary = sigma_binary_cfg.format(description='test')
            print(sigma_binary)


 
        if idx == bin_idx + 2:
            sigma_binary = ''

def main(args):
    """Even a file meant to be used as a script should be importable and a mere
    import should not have the side effect of executing the script's main functionality.
    The main functionality should be in a main() function."""
    sc_parsed = SCParser("systems/" + args.sc_file)
    objects = sc_parsed.process()
    konvert_to_kerbal(objects, args)

if __name__ == '__main__':
    PARSER = argparse.ArgumentParser(
        description="Select .sc file and number of asteroids and comets to include")
    PARSER.add_argument(
        "-s", dest="sc_file", action="store", help="Filename of system to parse from Space Engine")
    PARSER.add_argument(
        "-a", dest="num_asteroids", action="store", help="Number of asteroids to include in system")
    PARSER.add_argument(
        "-c", dest="num_comets", action="store", help="Number of comets to include in system")
    ARGS = PARSER.parse_args()
    main(ARGS)
