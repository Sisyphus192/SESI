import math
import copy
from decimal import *
from sc_parser import SC_Parser
import os
import re

class System:
    def __init__(self, parsed):
        self.objects = parsed
    def list_objects(self):
        for i in self.objects:
            print(i['name'])

    def total_stellar_masses(self):
        self.stellar_masses = 0
        for i in self.objects:
            if i['type'] == 'Star':
                self.stellar_masses += i['data']['MassSol']
        return self.stellar_masses

    def list_objects(self):
        for i in self.objects:
            print(i['name'])

    def total_stellar_masses(self):
        self.stellar_masses = 0
        for i in self.objects:
            if i['type'] == 'Star':
                self.stellar_masses += i['data']['MassSol']
        return self.stellar_masses

    def total_non_stellar_masses(self):
        self.non_stellar_masses = 0
        for i in self.objects:
            if i['type'] != "Star" and i['type'] != "Barycenter":
                self.non_stellar_masses += float(i['data']['Mass'])
        return self.non_stellar_masses

    def num_of_types(self):
        self.types = {}
        for i in self.objects:
            if i['type'] in self.types.keys():
                self.types[i['type']] += 1
            else:
                self.types[i['type']] = 1
        return self.types

    def life(self):
        self.has_life = False
        for i in self.objects:
            if i['data']['Life'] != False:
                self.has_life = True
        return self.has_life

    def num_of_planet_classes(self):
        self.planet_classes = {}
        for i in self.objects:
            if i['type'] == 'Planet' or i['type'] == 'DwarfPlanet':
                if i['data']['Class'] in self.planet_classes.keys():
                    self.planet_classes[i['data']['Class']] += 1
                else:
                    self.planet_classes[i['data']['Class']] = 1
        return self.planet_classes

    def num_of_moon_classes(self):
        self.moon_classes = {}
        for i in self.objects:
            if i['type'] == 'Moon' or i['type'] == 'DwarfMoon':
                if i['data']['Class'] in self.moon_classes.keys():
                    self.moon_classes[i['data']['Class']] += 1
                else:
                    self.moon_classes[i['data']['Class']] = 1
        return self.moon_classes

    def largest_planet(self):
        radius = 0.0
        planet = ''
        for i in self.objects:
            if i['type'] == 'Planet' or i['type'] == 'DwarfPlanet':
                if float(i['data']['Radius']) > radius:
                    radius = float(i['data']['Radius'])
                    planet = i
        return planet['name'], planet['type'], radius

    def smallest_planet(self):
        radius = 9e+99
        planet = ''
        for i in self.objects:
            if i['type'] == 'Planet' or i['type'] == 'DwarfPlanet':
                if float(i['data']['Radius']) < radius:
                    radius = float(i['data']['Radius'])
                    planet = i
        return planet['name'], planet['type'], radius

    def largest_terrestrial_planet(self):
        radius = 0.0
        planet = ''
        for i in self.objects:
            if i['type'] == 'Planet' or i['type'] == 'DwarfPlanet':
                if i['data']['Class'] != 'GasGiant' and i['data']['Class'] != 'IceGiant':
                    if float(i['data']['Radius']) > radius:
                        radius = float(i['data']['Radius'])
                        planet = i
        return planet['name'], planet['type'], radius

    def most_massive_planet(self):
        mass = 0.0
        planet = ''
        for i in self.objects:
            if i['type'] == 'Planet' or i['type'] == 'DwarfPlanet':
                if float(i['data']['Mass']) > mass:
                    mass = float(i['data']['Mass'])
                    planet = i
        return planet['name'], planet['type'], mass

    def least_massive_planet(self):
        mass = 9e+99
        planet = ''
        for i in self.objects:
            if i['type'] == 'Planet' or i['type'] == 'DwarfPlanet':
                if float(i['data']['Mass']) < mass:
                    mass = float(i['data']['Mass'])
                    planet = i
        return planet['name'], planet['type'], mass

    def largest_moon(self):
        radius = 0.0
        moon = ''
        for i in self.objects:
            if i['type'] == 'Moon' or i['type'] == 'DwarfMoon':
                if float(i['data']['Radius']) > radius:
                    radius = float(i['data']['Radius'])
                    moon = i
        return moon['name'], moon['type'], radius

    def mass_to_kg(self, astro_object):
        if "MassSol" in astro_object['data'].keys():
            return Decima(1.988435E+30) * Decimal(astro_object['data']['MassSol'])
        else:
            return Decimal(5.9721986E+24) * Decimal(astro_object['data']['Mass'])

    def radius_to_meters(self, astro_object):
        if "RadSol" in astro_object['data'].keys():
            return Decimal(6.955E+8) * Decimal(astro_object['data']["RadSol"])
        else:
            return 1000 * Decimal(astro_object['data']['Radius'])

    def AU_to_meters(self, AU):
        return Decimal(AU) * Decimal(1.495978707e+11)

    def year_to_seconds(self, year):
        return Decimal(year) * 31557600

    def get_rotation_period(self):
        self.non_stellar_masses = 0
        for i in self.objects:
            if i['type'] != "Star" and i['type'] != "Barycenter":
                self.non_stellar_masses += float(i['data']['Mass'])
        return self.non_stellar_masses

    def num_of_types(self):
        self.types = {}
        for i in self.objects:
            if i['type'] in self.types.keys():
                self.types[i['type']] += 1
            else:
                self.types[i['type']] = 1
        return self.types

    def life(self):
        self.has_life = False
        for i in self.objects:
            if i['data']['Life'] != False:
                self.has_life = True
        return self.has_life

    def num_of_planet_classes(self):
        self.planet_classes = {}
        for i in self.objects:
            if i['type'] == 'Planet' or i['type'] == 'DwarfPlanet':
                if i['data']['Class'] in self.planet_classes.keys():
                    self.planet_classes[i['data']['Class']] += 1
                else:
                    self.planet_classes[i['data']['Class']] = 1
        return self.planet_classes

    def num_of_moon_classes(self):
        self.moon_classes = {}
        for i in self.objects:
            if i['type'] == 'Moon' or i['type'] == 'DwarfMoon':
                if i['data']['Class'] in self.moon_classes.keys():
                    self.moon_classes[i['data']['Class']] += 1
                else:
                    self.moon_classes[i['data']['Class']] = 1
        return self.moon_classes

    def largest_planet(self):
        radius = 0.0
        planet = ''
        for i in self.objects:
            if i['type'] == 'Planet' or i['type'] == 'DwarfPlanet':
                if float(i['data']['Radius']) > radius:
                    radius = float(i['data']['Radius'])
                    planet = i
        return planet['name'], planet['type'], radius

    def smallest_planet(self):
        radius = 9e+99
        planet = ''
        for i in self.objects:
            if i['type'] == 'Planet' or i['type'] == 'DwarfPlanet':
                if float(i['data']['Radius']) < radius:
                    radius = float(i['data']['Radius'])
                    planet = i
        return planet['name'], planet['type'], radius

    def largest_terrestrial_planet(self):
        radius = 0.0
        planet = ''
        for i in self.objects:
            if i['type'] == 'Planet' or i['type'] == 'DwarfPlanet':
                if i['data']['Class'] != 'GasGiant' and i['data']['Class'] != 'IceGiant':
                    if float(i['data']['Radius']) > radius:
                        radius = float(i['data']['Radius'])
                        planet = i
        return planet['name'], planet['type'], radius

    def most_massive_planet(self):
        mass = 0.0
        planet = ''
        for i in self.objects:
            if i['type'] == 'Planet' or i['type'] == 'DwarfPlanet':
                if float(i['data']['Mass']) > mass:
                    mass = float(i['data']['Mass'])
                    planet = i
        return planet['name'], planet['type'], mass

    def least_massive_planet(self):
        mass = 9e+99
        planet = ''
        for i in self.objects:
            if i['type'] == 'Planet' or i['type'] == 'DwarfPlanet':
                if float(i['data']['Mass']) < mass:
                    mass = float(i['data']['Mass'])
                    planet = i
        return planet['name'], planet['type'], mass

    def largest_moon(self):
        radius = 0.0
        moon = ''
        for i in self.objects:
            if i['type'] == 'Moon' or i['type'] == 'DwarfMoon':
                if float(i['data']['Radius']) > radius:
                    radius = float(i['data']['Radius'])
                    moon = i
        return moon['name'], moon['type'], radius

    def mass_to_kg(self, astro_object):
        if "MassSol" in astro_object['data'].keys():
            return Decima(1.988435E+30) * Decimal(astro_object['data']['MassSol'])
        else:
            return Decimal(5.9721986E+24) * Decimal(astro_object['data']['Mass'])

    def radius_to_meters(self, astro_object):
        if "RadSol" in astro_object['data'].keys():
            return Decimal(6.955E+8) * Decimal(astro_object['data']["RadSol"])
        else:
            return 1000 * Decimal(astro_object['data']['Radius'])

    def AU_to_meters(self, AU):
        return Decimal(AU) * Decimal(1.495978707e+11)

    def year_to_seconds(self, year):
        return Decimal(year) * 31557600

    def get_rotation_period(self, astro_object):
        if "TidalLocked" in astro_object['data']:
            return self.year_to_seconds(astro_object['data']['Orbit']['Period'])
        else:
            return Decimal(astro_object['data']['RotationPeriod']) * 3600

    def is_tidally_locked(self, astro_object):
        if "TidalLocked" in astro_object['data']:
            return "true"
        else:
            return "false"
    def get_density(self, astro_object):
        radius = self.radius_to_meters(astro_object)
        volume = (4 * math.pi * (radius*100)**3 / 3) # increase by facotor of 100 to convert m to cm
        mass = self.mass_to_kg(astro_object) * 1000 # convert from kg to g
        return mass / volume

    def densest_object(self):
        density = 0.0
        astro_object = ''
        for i in self.objects:
            if i['type'] != 'Star' and i['type'] != 'Barycenter':
                d = self.get_density(i)
                if d > density:
                    density = d
                    astro_object = i
        return astro_object['name'], astro_object['type'], density

    def format_name(self, name):
        non_decimal = re.compile(r'[^\d.]+')
        return non_decimal.sub('', name)

    def check_parent(self, parentBody):
        if parentBody == "Proxima":
            return "Sun"
        else:
            return parentBody

    def get_star_classification(self, astro_object):
        color = ''
        size = ''
        if "O" in astro_object['data']["Class"]:
            color = "Blue"
        elif "B" in astro_object['data']["Class"]:
            color = "Blue white"
        elif "A" in astro_object['data']["Class"]:
            color = "White"
        elif "F" in astro_object['data']["Class"]:
            color = "Yellow white"
        elif "G" in astro_object['data']["Class"]:
            color = "Yellow"
        elif "K" in astro_object['data']["Class"]:
            color = "Orange"
        elif "M" in astro_object['data']["Class"]:
            color = "Red"

        if "0" in astro_object['data']["Class"]:
            size = "Hypergiant"
        elif "Ia" in astro_object['data']["Class"]:
            size = "Luminous Supergiant"
        elif "Iab" in astro_object['data']["Class"]:
            size = "Intermediate Luminous Supergiant"
        elif "Ib" in astro_object['data']["Class"]:
            size = "Less Luminous Supergiant"
        elif "III" in astro_object['data']["Class"]:
            size = "Normal Giant"
        elif "II" in astro_object['data']["Class"]:
            size = "Bright Giant"
        elif "IV" in astro_object['data']["Class"]:
            size = "Subgiant"
        elif "VI" in astro_object['data']["Class"]:
            size = "Subdwarf"
        elif "V" in astro_object['data']["Class"]:
            size = "Main Sequence"

        return color + ' ' + size

    def generate_toc(self):
        toc = ''
        template = "{}<a href = #{}>{}</a> - {}<br />"
        bodies = []
        star = ''
        for i in self.objects:
            if i['type'] == 'Star':
                toc += template.format('', i['name'], i['name'], self.get_star_classification(i))
                star = i['name']
            elif i['type'] != 'Asteroid' and i['type'] != 'Comet' and i['type'] != 'DwarfMoon':
                if i['type'] == 'Moon':
                    temp = copy.deepcopy(i)
                    for j in self.objects:
                        if j['name'] == i['data']['ParentBody']:
                            temp['data']['Orbit']['SemiMajorAxis'] += j['data']['Orbit']['SemiMajorAxis']
                            bodies.append(temp)
                elif i['type'] == 'Barycenter':
                    temp = copy.deepcopy(i)
                    temp['data']['Class'] = ''
                    bodies.append(temp)
                    #for j in self.objects:
                        #if j['data']['ParentBody'] == i['name']:

                else:
                    bodies.append(i)
        newlist = sorted(bodies, key=lambda k: k['data']['Orbit']['SemiMajorAxis'])
        for j in newlist:
            if j['type'] == 'Moon':
                toc += template.format("&nbsp"*4, j['name'], j['name'], j['data']['Class'])
            else:
                toc += template.format("&nbsp"*2, j['name'], j['name'], j['data']['Class'])
        return toc

    def konvert_to_kerbal(self):
        template = ''
        for i in self.objects:
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
                                    name = i['name'],
                                    index = int(float(self.format_name(i['name']))*100),
                                    ParentBody = self.check_parent(i['data']['ParentBody']),
                                    SemiMajorAxis = self.AU_to_meters(i['data']['Orbit']['SemiMajorAxis']),
                                    Eccentricity = i['data']['Orbit']['Eccentricity'],
                                    Inclination = i['data']['Orbit']['Inclination'],
                                    MeanAnomaly = i['data']['Orbit']['MeanAnomaly'],
                                    AscendingNode = i['data']['Orbit']['AscendingNode'],
                                    ArgOfPericenter = i['data']['Orbit']['ArgOfPericenter'],
                                    red = i['data']['Color'][0],
                                    green = i['data']['Color'][1],
                                    blue = i['data']['Color'][2],
                                    description = 'test',
                                    Radius = self.radius_to_meters(i),
                                    Mass = self.mass_to_kg(i),
                                    RotationPeriod = self.get_rotation_period(i),
                                    TidalLocked = self.is_tidally_locked(i),
                                    HomeWorld = "false")
                    out_file.write(template)



parser = SC_Parser("systems/Proxima.sc")
system = System(parser.process())
system.konvert_to_kerbal()
header = """
<html>
<head>
<link rel="stylesheet" type="text/css" href="styles.css" />
<meta charset="UTF-8" />
"""

with open("system.html", "wt") as out_file:
    out_file.write(header)
    out_file.write("<title>Proxima</title>\n")
    out_file.write("</head>\n")
    out_file.write("<body>\n")
    out_file.write("""<div class = "left">\n""")
    out_file.write(system.generate_toc())
