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
from sc_parser import SC_Parser

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
    if parent_body == "Proxima":
        return "Sun"
    else:
        return parent_body

def konvert_to_kerbal(objects):
    """Loads object template and formats with the correct values to create a
        working object in KSP"""
    template = ''
    for idx, i in enumerate(objects):
        if i['type'] != 'Star':
            with open("cfg templates/" + i['data']['Class'] + ".cfg", "r") as in_file:
                template = in_file.read()
            if i['type'] == 'Moon' or i['type'] == 'DwarfMoon':
                path = "RealSolarSystem/RSSKopernicus/" + i['data']['ParentBody'] +'/'
            elif i['type'] == 'Asteroid':
                path = "RealSolarSystem/RSSKopernicus/Asteroids/"
            elif i['type'] == 'Comet':
                path = "RealSolarSystem/RSSKopernicus/Comets/"
            else:
                path = "RealSolarSystem/RSSKopernicus/" + i['name'] + '/'

            if not os.path.exists(path):
                os.makedirs(path)
            with open(path + i['name'] + '.cfg', 'wt') as out_file:
                template = template.format(
                    name=i['name'],
                    index=idx + 3,
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

PARSER = SC_Parser("systems/Proxima.sc")
OBJECTS = PARSER.process()
konvert_to_kerbal(OBJECTS)
