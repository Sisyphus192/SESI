Barycenter	"ALF Cen/Toliman/Bungula/Rigel Kentaurus/Gliese 559"
{
	ParentBody     "ALF Cen"
	Mass            672288
	Radius          4.59953e+007
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      -1e+038
	Color          (1.000 1.000 1.000)

	Surface
	{
		DiffTileSize    131070
		DiffTileBorder  65535
		BumpTileSize    131070
		BumpTileBorder  65535
		GlowTileSize    131070
		GlowTileBorder  65535
		SpecularPower   -1e+038
		Hapke           -1e+038
		SpotBright      -1e+038
		SpotWidth       -1e+038
		DayAmbient      -1e+038
		ModulateColor  (-99999996802856925000000000000000000000.000 0.000 0.000 0.000)
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"ALF Cen A/Toliman A/Bungula A/Rigel Kentaurus A/Gliese 559 A/HD 128620/HIP 71683"
{
	ParentBody     "ALF Cen"
	Class	       "G2 V"
	Luminosity      1.47761
	MassSol         1.09
	RadSol          1.227
	Teff            5860

	Age             6

	InertiaMoment   0.0600226

	RotationPeriod  923.6
	Obliquity       82
	EqAscendNode    67.726

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.876 0.835)

	Surface
	{
		Randomize      (-0.467, -0.834, -0.787)
		colorDistMagn   0.414576
		colorDistFreq   8.67575
		detailScale     2.19652e+006
		colorConversion true
		tropicLatitude  0.5
		icecapLatitude  1
		mareFreq        43.3088
		mareDensity     0.0102982
		erosion         1
		montesFreq      537
		dunesMagn       0.5
		hillsMagn       0.03
		hillsFreq       5724.49
		craterOctaves   0
		BumpHeight      704.041
		BumpOffset      704.041
		SpecularPower   -1e+038
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          8539.92
		Density         0
		Pressure        1
		Bright          10
		Opacity         0
		SkyLight        0
		Hue             0
		Saturation      1
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	Corona
	{
		Radius      5.00548e+006
		Period      0.0165759
		Brightness  0.5
		RayDensity  4.39876
		RayCurv     17.8395
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Extrasolar"
		SemiMajorAxis   10.765
		Period          79.914
		Eccentricity    0.5179
		Inclination     82.986
		AscendingNode   67.726
		ArgOfPericenter 3.772
		MeanAnomaly     200.119
	}
}

Star	"ALF Cen B/Toliman B/Bungula B/Rigel Kentaurus B/Gliese 559 B/HD 128621/HIP 71681"
{
	ParentBody     "ALF Cen"
	Class	       "K0 V"
	Luminosity      0.434071
	MassSol         0.92
	RadSol          0.865
	Teff            5250

	Age             6

	InertiaMoment   0.0402603

	RotationPeriod  850.5
	Obliquity       83
	EqAscendNode    67.726

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.808 0.683)

	Surface
	{
		Randomize      (-0.270, -0.485, 0.382)
		colorDistMagn   0.464224
		colorDistFreq   6.06447
		detailScale     1.54848e+006
		colorConversion true
		tropicLatitude  0.5
		icecapLatitude  1
		mareFreq        54.4317
		mareDensity     0.0139232
		erosion         1
		montesFreq      537
		dunesMagn       0.5
		hillsMagn       0.03
		hillsFreq       2942.42
		craterOctaves   0
		BumpHeight      540.242
		BumpOffset      540.242
		SpecularPower   -1e+038
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          6020.4
		Density         0
		Pressure        1
		Bright          10
		Opacity         0
		SkyLight        0
		Hue             0
		Saturation      1
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	Corona
	{
		Radius      3.27468e+006
		Period      0.0411713
		Brightness  0.5
		RayDensity  3.79219
		RayCurv     10.9712
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Extrasolar"
		SemiMajorAxis   12.755
		Period          79.914
		Eccentricity    0.5179
		Inclination     82.986
		AscendingNode   67.726
		ArgOfPericenter 183.772
		MeanAnomaly     200.119
	}
}

Planet	"ALF Cen B b"
{
	ParentBody     "ALF Cen B"
	Class	       "Desert"

	Mass            2.52992
	Radius          7215.02
	InertiaMoment   0.332913

	Obliquity       26.9228
	EqAscendNode    131.317
	TidalLocked     true

	AbsMagn         -3.87936
	SlopeParam      5.63253
	AlbedoBond      0.391326
	AlbedoGeom      0.469591
	Brightness      2
	Color          (0.618 0.613 0.610)

	Surface
	{
		SurfStyle       0.157706
		OceanStyle      0.558235
		Randomize      (0.306, 0.192, 0.706)
		colorDistMagn   0.065349
		colorDistFreq   814.51
		detailScale     18557.4
		colorConversion true
		seaLevel        0.0196174
		snowLevel       2
		tropicLatitude  0.366695
		icecapLatitude  10
		icecapHeight    0.226069
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.676659
		venusFreq       1.17113
		venusMagn       0.304196
		mareFreq        1.45258
		mareDensity     0.200289
		terraceProb     0.37674
		erosion         0
		montesMagn      0.178427
		montesFreq      305.084
		montesSpiky     0.870481
		montesFraction  0.55301
		dunesMagn       0.0485075
		dunesFreq       75.9387
		dunesFraction   0.463628
		hillsMagn       0.135931
		hillsFreq       941.857
		hillsFraction   0
		hills2Fraction  0
		riversMagn      67.5847
		riversFreq      3.21693
		riversSin       3.83904
		riversOctaves   0
		canyonsMagn     0.049852
		canyonsFreq     193.567
		canyonFraction  0
		cracksMagn      0.0788131
		cracksFreq      0.724938
		cracksOctaves   0
		craterMagn      0.972307
		craterFreq      18.5475
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.705831
		volcanoFreq     0.736245
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 1.14051
		volcanoFlows    0.524432
		volcanoRadius   0.177069
		volcanoTemp     1405.89
		lavaCoverTidal  0
		lavaCoverSun    0.0336716
		lavaCoverYoung  0
		twistZones      1
		twistMagn       3.5
		cycloneMagn     0.848356
		cycloneDensity  0.34023
		colorSea       (0.240, 0.230, 0.230, 0.000)
		colorShelf     (0.380, 0.360, 0.350, 0.000)
		colorBeach     (0.550, 0.520, 0.480, 0.000)
		colorDesert    (0.520, 0.490, 0.470, 0.000)
		colorLowland   (0.460, 0.440, 0.410, 0.000)
		colorUpland    (0.390, 0.360, 0.330, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.460, 0.440, 0.410, 0.000)
		colorUpPlants  (0.390, 0.360, 0.330, 0.000)
		BumpHeight      14.2239
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          28.8906
		BumpHeight      6.92452
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04955
		mainOctaves     10
		Coverage        0.382652
		twistZones      1
		twistMagn       3.5
	}

	Clouds
	{
		Height          50.6694
		BumpHeight      5.40298
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04955
		mainOctaves     10
		Coverage        0.382652
		twistZones      1
		twistMagn       3.5
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          182.642
		Density         29.2805
		Pressure        84.2377
		Greenhouse      464.67
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			SO2   	43.9819
			H2O   	40.2143
			CO2   	15.6479
			N2    	0.150323
			CO    	0.00542941
			Ne    	6.58629e-005
			Ar    	5.303e-005
		}
	}

	Aurora
	{
		Height      130.238
		NorthLat    61.8203
		NorthLon    -119.646
		NorthRadius 2346.26
		NorthWidth  2353.09
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -63.2585
		SouthLon    58.155
		SouthRadius 2389.1
		SouthWidth  2686.51
		SouthRings  3
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1.37694
		GasToDust   0
		Particles   3052
		GasBright   0.0987546
		DustBright  0.142736
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Extrasolar"
		SemiMajorAxis   0.04
		Period          0.00885905
		Eccentricity    0
		Inclination     26.9228
		AscendingNode   131.317
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

