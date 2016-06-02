# SESI
Space Engine System Importer (SESI) is a python script to convert the .sc files
exported by space engine into working solar systems for KSP.

There are two main files: sc_parser.py which handles all the parsing of the .sc
file, and does not (should not) need to be modified, and process_sc.py which
handles all the work required to convert the data parsed from the .sc file into
usable kopernicus .cfg files. Any new features or functionality should be added
to the process_sc.py.

WHAT THIS DOES:
It will take an exported solar system (and only an entire solar system, not
individual objects) from Space Engine in the form of a .sc file, and process it
into a collection of .cfg files usable by Kopernicus to implement new objects
into a solar system in KSP. At the moment this process is parasitic to the
RealSolarSystem mod (RSS). That is it piggy backs upon the .cfg and .dll files
present in RSS to add implement a new solar system.

To be more exact the body in KSP that it creates will have the same physical
characteristics (mass, radius, rotationPeriod) and orbital characteristics
(eccentricity, inclination, meanAnomaly, AscendingNode, ArgOfPericenter,
semiMajorAxis, parentBody) as the body in Space Engine it is derived from.

Every body is paired with a generic texture to that body type, i.e. all desert
planets will look the same, all gas giants will look the same, all asteroids
look the same. This applies to biomes as well.

WHAT THIS DOES NOT DO:
It does not procedurally generate planets, planet textures, or biomes.
It does not generate contracts for new systems (yet)
It does not generate KSPedia entries for new systems (yet)
It does not generate science reports or science for new systems (yet)


TODO

Merge individual planet class config templates into one generic config template
that is then specifically built for each planet when parsing a system

Add support for scatterer

Add support for eve

Add support for oblate planets

Add support for binary objects

Add PQS generation
