 
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
