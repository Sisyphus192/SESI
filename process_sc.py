from decimal import Decimal
import os
import re
from sc_parser import SC_Parser

class System:
    def __init__(self, parsed):
        self.objects = parsed

    def mass_to_kg(self, astro_object):
        if "MassSol" in astro_object['data'].keys():
            return Decimal(1.988435E+30) * Decimal(astro_object['data']['MassSol'])
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

    def format_name(self, name):
        non_decimal = re.compile(r'[^\d.]+')
        return non_decimal.sub('', name)

    def check_parent(self, parentBody):
        if parentBody == "Proxima":
            return "Sun"
        else:
            return parentBody

    def konvert_to_kerbal(self):
        template = ''
        for idx, i in enumerate(self.objects):
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
                        ParentBody=self.check_parent(i['data']['ParentBody']),
                        SemiMajorAxis=self.AU_to_meters(i['data']['Orbit']['SemiMajorAxis']),
                        Eccentricity=i['data']['Orbit']['Eccentricity'],
                        Inclination=i['data']['Orbit']['Inclination'],
                        MeanAnomaly=i['data']['Orbit']['MeanAnomaly'],
                        AscendingNode=i['data']['Orbit']['AscendingNode'],
                        ArgOfPericenter=i['data']['Orbit']['ArgOfPericenter'],
                        red=i['data']['Color'][0],
                        green=i['data']['Color'][1],
                        blue=i['data']['Color'][2],
                        description='test',
                        Radius=self.radius_to_meters(i),
                        Mass=self.mass_to_kg(i),
                        RotationPeriod=self.get_rotation_period(i),
                        TidalLocked=self.is_tidally_locked(i),
                        HomeWorld="false")
                    out_file.write(template)



parser = SC_Parser("systems/Proxima.sc")
system = System(parser.process())
system.konvert_to_kerbal()
