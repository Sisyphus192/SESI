import math

class System:
    def __init__(self):
        self.astronomical_objects = { # Dict of all objects in system
                                    "Barycenter":[],
                                    "Star":[],
                                    "Planet":[],
                                    "DwarfPlanet":[],
                                    "Moon":[],
                                    "DwarfMoon":[],
                                    "Asteroid":[],
                                    "Comet":[]}
        self.import_system()

    def list_objects(self):
        for a in self.astronomical_objects:
            for b in self.astronomical_objects[a]:
                print(b["Name"])

    def add_object(self, astro_object):
        a = astro_object['Name']
        self.astronomical_objects[a] = astro_object

    def import_system(self):
        read_data = []
        with open('Proxima.sc', 'r') as f:
            read_data = f.readlines()

        line = 0
        while line < len(read_data):
            print("start", line, read_data[line])
            if read_data[line].split("\t")[0].strip() in self.astronomical_objects.keys():
                body_end = False
                body = {}
                body["Type"] = read_data[line].split("\t")[0].strip()
                body["Name"] = read_data[line].split("\t")[-1].strip('\n "')
                line += 2
                while not body_end:
                    #print(read_data[line])
                    if "{" in read_data[line+1]:
                        key = read_data[line].strip()
                        key_offset = 1
                        while key in body.keys():
                            key = key.strip('1234567890') + str(key_offset)
                            key_offset += 1
                        body[key] = {}
                        line += 2
                        section_end = False
                        while not section_end:
                            if "}" in read_data[line]:
                                if "}" in read_data[line+1]:
                                    body_end = True
                                    section_end = True
                                    line += 2
                                else:
                                    section_end = True
                                    line += 1
                            if "Composition" in read_data[line]:
                                composition_end = False
                                body[key]["Composition"] = {}
                                line += 2
                                while not composition_end:
                                    if "}" in read_data[line]:
                                        composition_end = True
                                        line += 1
                                    else:
                                        body[key]["Composition"][read_data[line].split(' ')[0].strip(' "')] = read_data[line].split(' ')[-1].strip('\n "')
                                        line += 1
                            elif "Randomize" in read_data[line]:
                                body[key][read_data[line].split('  ')[0].strip('\t "')] = read_data[line].split('  ')[-1].strip('\n\t "')
                                line += 1
                            else:
                                body[key][read_data[line].split(' ')[0].strip('\t "')] = read_data[line].split(' ')[-1].strip('\n\t "')
                                line += 1
                    elif '' == read_data[line]:
                        line += 1
                    elif "Class" in read_data[line]:
                        body[read_data[line].split('\t')[1].strip(' "\t')] = read_data[line].split('\t')[-1].strip('\n "')
                        line += 1
                    elif "Color" in read_data[line]:
                        body[read_data[line].split('  ')[0].strip(' "\t')] = read_data[line].split('  ')[-1].strip('\n "')
                        line += 1
                    else:
                        body[read_data[line].split(' ')[0].strip(' "\t')] = read_data[line].split(' ')[-1].strip('\n "')
                        line += 1

                self.astronomical_objects[body["Type"]].append(body)
                #print(body["Name"])
        self.list_objects()

    def total_stellar_masses(self):
        self.stellar_masses = 0
        for i in self.astronomical_objects["Star"]:
            self.stellar_masses += float(i["MassSol"])
        print(self.stellar_masses)

    def total_non_stellar_masses(self):
        self.non_stellar_masses = 0
        for i in self.astronomical_objects.keys():
            if i != "Star" and i != "Barycenter":
                for j in self.astronomical_objects[i]:
                    self.non_stellar_masses += float(j["Mass"])
        print(self.non_stellar_masses)

    def num_of_types(self):
        self.num_stars = len(self.astronomical_objects["Star"])
        self.num_barycenters = len(self.astronomical_objects["Barycenter"])
        self.num_planets = len(self.astronomical_objects["Planet"])
        self.num_dwarf_planets = len(self.astronomical_objects["DwarfPlanet"])
        self.num_moons = len(self.astronomical_objects["Moon"])
        self.num_dwarf_moons = len(self.astronomical_objects["DwarfMoon"])
        self.num_asteroids = len(self.astronomical_objects["Asteroid"])
        self.num_comets = len(self.astronomical_objects["Comet"])
        print(self.num_stars)
        print(self.num_barycenters)
        print(self.num_planets)
        print(self.num_dwarf_planets)
        print(self.num_moons)
        print(self.num_dwarf_moons)
        print(self.num_asteroids)
        print(self.num_comets)

    def life(self):
        self.has_life = False
        for i in self.astronomical_objects["Planet"]:
            if "Life" in i.keys():
                print(i["Name"], i["Life"])
                self.has_life = True
        if not self.has_life:
            print("No life in system")

    def num_of_classes(self):
        self.num_selenas = 0
        self.num_deserts = 0
        self.num_ice_worlds = 0
        self.num_titans = 0
        self.num_oceanas = 0
        self.num_terrans = 0
        self.num_gas_giants = 0
        self.num_ice_giants = 0
        for i in self.astronomical_objects.keys():
            if i == "Planet" or i == "Moon" or i == "DwarfPlanet":
                for j in self.astronomical_objects[i]:
                    if j["Class"] == "Selena":
                        self.num_selenas += 1
                    elif j["Class"] == "Desert":
                        self.num_deserts += 1
                    elif j["Class"] == "IceWorld":
                        self.num_ice_worlds += 1
                    elif j["Class"] == "Titan":
                        self.num_titans += 1
                    elif j["Class"] == "Oceanas":
                        self.num_oceanas += 1
                    elif j["Class"] == "Terran":
                        self.num_terrans += 1
                    elif j["Class"] == "GasGiant":
                        self.num_gas_giants += 1
                    elif j["Class"] == "IceGiant":
                        self.num_ice_giants += 1
        print("Selenas: ", self.num_selenas)
        print("Deserts: ", self.num_deserts)
        print("Ice Worlds: ", self.num_ice_worlds)
        print("Titans: ", self.num_titans)
        print("Oceanas: ", self.num_oceanas)
        print("Terrans: ", self.num_terrans)
        print("Gas Giants: ", self.num_gas_giants)
        print("Ice Giants: ", self.num_ice_giants)

    def largest_planet(self):
        radius = 0.0
        planet = ''
        for i in self.astronomical_objects["Planet"]:
            if float(i["Radius"]) > float(radius):
                radius = i["Radius"]
                planet = i
        print(planet["Name"], radius)

    def smallest_planet(self):
        radius = 9e+99
        planet = ''
        for i in self.astronomical_objects["Planet"]:
            if float(i["Radius"]) < float(radius):
                radius = i["Radius"]
                planet = i
        print(planet["Name"], radius)

    def largest_terrestrial_planet(self):
        radius = 0.0
        planet = ''
        for i in self.astronomical_objects["Planet"]:
            if i["Class"] != "IceGiant" and i["Class"] != "GasGiant":
                if float(i["Radius"]) > float(radius):
                    radius = i["Radius"]
                    planet = i
        print(planet["Name"], radius)

    def most_massive_planet(self):
        planet = {"Mass":0.0}
        for i in self.astronomical_objects["Planet"]:
            if float(i["Mass"]) > float(planet["Mass"]):
                planet = i
        print(planet["Name"], planet["Mass"])

    def least_massive_planet(self):
        planet = {"Mass":9e+99}
        for i in self.astronomical_objects["Planet"]:
            if float(i["Mass"]) < float(planet["Mass"]):
                planet = i
        print(planet["Name"], planet["Mass"])

    def largest_moon(self):
        moon = {"Radius":0.0}
        for i in self.astronomical_objects["Moon"]:
            if float(i["Radius"]) > float(moon["Radius"]):
                moon = i
        print(moon["Name"], moon["Radius"])

    def mass_to_kg(self, astro_object):
        if "MassSol" in astro_object.keys():
            return 1.988435E+30 * float(astro_object["MassSol"])
        else:
            return 5.9721986E+24 * float(astro_object["Mass"])

    def radius_to_meters(self, astro_object):
        if "RadSol" in astro_object.keys():
            return 6.955E+8 * float(astro_object["RadSol"])
        else:
            return 1000 * float(astro_object["Radius"])

    def get_density(self, astro_object):
        radius = self.radius_to_meters(astro_object)
        volume = (4 * math.pi * (radius*100)**3) / 3
        mass = self.mass_to_kg(astro_object) * 1000 # convert from kg to g
        return mass / volume

    def densest_object(self):
        density = 0.0
        astro_object= ''
        for i in self.astronomical_objects["Planet"]:
            d = self.get_density(i)
            if d > density:
                density = d
                astro_object = i
        print(astro_object["Name"], density)

    def get_star_classification(self, astro_object):
        color = ''
        size = ''
        astro_object = self.astronomical_objects["Star"][0]
        if "O" in astro_object["Class"]:
            color = "Blue"
        elif "B" in astro_object["Class"]:
            color = "Blue white"
        elif "A" in astro_object["Class"]:
            color = "White"
        elif "F" in astro_object["Class"]:
            color = "Yellow white"
        elif "G" in astro_object["Class"]:
            color = "Yellow"
        elif "K" in astro_object["Class"]:
            color = "Orange"
        elif "M" in astro_object["Class"]:
            color = "Red"

        if "0" in astro_object["Class"]:
            size = "Hypergiant"
        elif "Ia" in astro_object["Class"]:
            size = "Luminous Supergiant"
        elif "Iab" in astro_object["Class"]:
            size = "Intermediate Luminous Supergiant"
        elif "Ib" in astro_object["Class"]:
            size = "Less Luminous Supergiant"
        elif "III" in astro_object["Class"]:
            size = "Normal Giant"
        elif "II" in astro_object["Class"]:
            size = "Bright Giant"
        elif "IV" in astro_object["Class"]:
            size = "Subgiant"
        elif "VI" in astro_object["Class"]:
            size = "Subdwarf"
        elif "V" in astro_object["Class"]:
            size = "Main Sequence"
        print(color + ' ' + size)
        return color + ' ' + size

    def generate_toc(self):
        toc = ''
        bodies = []
        for i in self.astronomical_objects["Star"]:
            toc += "<a href = #{}>{}</a> - {}<br />&nbsp&nbsp".format(i["Name"], i["Name"], self.get_star_classification(i))
            for j in self.astronomical_objects:
                if j != "Star" and j != "Barycenter" and j != "Asteroid" and j != "Comet":
                    for k in self.astronomical_objects[j]:
                        if k["ParentBody"] == i["Name"]:
                            bodies.append(k)
            newlist = sorted(bodies, key=lambda k: k["Orbit"]["SemiMajorAxis"])
            for j in newlist:
                toc += "<a href = #{}>{}</a> - {}<br />&nbsp&nbsp".format(j["Name"], j["Name"], j["Class"])
        return toc





planetary_system = System()
planetary_system.total_stellar_masses()
planetary_system.total_non_stellar_masses()
planetary_system.num_of_types()
planetary_system.life()
planetary_system.num_of_classes()
planetary_system.largest_planet()
planetary_system.smallest_planet()
planetary_system.largest_terrestrial_planet()
planetary_system.most_massive_planet()
planetary_system.least_massive_planet()
planetary_system.largest_moon()
planetary_system.densest_object()
planetary_system.get_star_classification(1)
#planetary_system.generate_toc()




"""
for i in planetary_system.astronomical_objects:
    if i["Name"] == "1":
        print(i["Type"], i["Name"])
        print(i["ParentBody"])
        print(i["Class"])
        #print(i["Luminosity"])
        #print(i["MassSol"])
        print(i["Mass"])
        #print(i["RadSol"])
        print(i["Radius"])
        #print(i["Teff"])
        #print(i["Age"])
        print(i["InertiaMoment"])
        #print(i["RotationPeriod"])
        print(i["Obliquity"])
        print(i["EqAscendNode"])
        print(i["TidalLocked"])
        print(i["AlbedoBond"])
        print(i["AlbedoGeom"])
        print(i["Brightness"])
        print(i["Color"])
        print(i["Surface"])
        print(i["Surface"]["SurfStyle"])
        print(i["Surface"]["Randomize"])
        #print(i["Surface"]["colorDistMagn"])
        #print(i["Surface"]["colorDistFreq"])
        print(i["Surface"]["detailScale"])
        print(i["Surface"]["colorConversion"])
        print(i["Surface"]["tropicLatitude"])
        print(i["Surface"]["icecapLatitude"])
        #print(i["Surface"]["mareFreq"])
        #print(i["Surface"]["mareDensity"])
        #print(i["Surface"]["erosion"])
        #print(i["Surface"]["montesFreq"])
        #print(i["Surface"]["dunesMagn"])
        #print(i["Surface"]["hillsMagn"])
        #print(i["Surface"]["hillsFreq"])
        print(i["Surface"]["mainFreq"])
        print(i["Surface"]["venusFreq"])
        print(i["Surface"]["venusMagn"])
        print(i["Surface"]["craterOctaves"])
        print(i["Surface"]["BumpHeight"])
        #print(i["Surface"]["BumpOffset"])
        print(i["Surface"]["SpecularPower"])
        print(i["Surface"]["Hapke"])
        print(i["Surface"]["SpotBright"])
        print(i["Surface"]["SpotWidth"])
        print(i["Surface"]["DayAmbient"])
        #print(i["NoClouds"])
        print(i["NoOcean"])
        print(i["NoLava"])
        print(i["Atmosphere"])
        print(i["Atmosphere"]["Model"])
        print(i["Atmosphere"]["Height"])
        print(i["Atmosphere"]["Density"])
        print(i["Atmosphere"]["Pressure"])
        print(i["Atmosphere"]["Bright"])
        print(i["Atmosphere"]["Opacity"])
        print(i["Atmosphere"]["SkyLight"])
        print(i["Atmosphere"]["Hue"])
        print(i["Atmosphere"]["Saturation"])
        #print(i["NoAurora"])
        print(i["NoRings"])
        print(i["NoAccretionDisk"])
        #print(i["Corona"])
        #print(i["Corona"]["Radius"])
        #print(i["Corona"]["Period"])
        #print(i["Corona"]["Brightness"])
        #print(i["Corona"]["RayDensity"])
        #print(i["Corona"]["RayCurv"])
        print(i["NoCometTail"])
        print(i["Orbit"])
        print(i["Orbit"]["RefPlane"])
        print(i["Orbit"]["SemiMajorAxis"])
        print(i["Orbit"]["Period"])
        print(i["Orbit"]["Eccentricity"])
        print(i["Orbit"]["Inclination"])
        print(i["Orbit"]["AscendingNode"])
        print(i["Orbit"]["ArgOfPericenter"])
        print(i["Orbit"]["MeanAnomaly"])
        print(i.keys())
"""
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
    out_file.write(planetary_system.generate_toc())


