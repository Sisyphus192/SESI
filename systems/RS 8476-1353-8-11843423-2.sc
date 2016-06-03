Star	"RS 8476-1353-8-11843423-2"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "M9.4 V"
	Luminosity      0.000296988
	MassSol         0.0798615
	RadSol          0.145897
	Teff            2014

	Age             3.50326

	InertiaMoment   0.0777816

	Oblateness      0.0047329

	RotationPeriod  5.18882
	Obliquity       204.78
	EqAscendNode    218.597

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.237 0.011)

	Surface
	{
		Randomize      (-0.696, -0.714, 0.852)
		colorDistMagn   0.433684
		colorDistFreq   7.84288
		detailScale     261177
		colorConversion true
		tropicLatitude  0.73832
		icecapLatitude  1.15888
		mareFreq        7.51189
		mareDensity     0.00365494
		erosion         1
		montesFreq      40.2151
		dunesMagn       1.1027
		hillsMagn       0.03
		hillsFreq       40.2151
		craterOctaves   0
		BumpHeight      309.274
		BumpOffset      309.274
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
		Height          1015.44
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
		Radius      539845
		Period      0.016268
		Brightness  0.5
		RayDensity  2.35558
		RayCurv     8.75333
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     204.78
		AscendingNode   218.597
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Planet	"1"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Desert"

	Mass            3.32611
	Radius          9956.13
	InertiaMoment   0.329483

	Obliquity       -2.30269
	EqAscendNode    63.5376
	TidalLocked     true

	AlbedoBond      0.7
	AlbedoGeom      0.84
	Brightness      2
	Color          (0.764 0.736 0.686)

	Surface
	{
		SurfStyle       0.15914
		OceanStyle      0.403607
		Randomize      (-0.216, -0.633, -0.566)
		colorDistMagn   0.0663079
		colorDistFreq   1333.39
		detailScale     25607.7
		colorConversion true
		seaLevel        0.0607729
		snowLevel       2
		tropicLatitude  0.0682785
		icecapLatitude  10
		icecapHeight    0.133496
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.14045
		venusFreq       1.0473
		venusMagn       0.297179
		mareFreq        2.25147
		mareDensity     0.200269
		terraceProb     0.523935
		erosion         0
		montesMagn      0.255709
		montesFreq      558.787
		montesSpiky     0.980787
		montesFraction  0.265076
		dunesMagn       0.0621685
		dunesFreq       96.1441
		dunesFraction   0.00799245
		hillsMagn       0.170955
		hillsFreq       943.492
		hillsFraction   0
		hills2Fraction  0
		riversMagn      59.2881
		riversFreq      2.1505
		riversSin       7.99754
		riversOctaves   0
		canyonsMagn     0.0507259
		canyonsFreq     244.584
		canyonFraction  0
		cracksMagn      0.0829429
		cracksFreq      0.676631
		cracksOctaves   0
		craterMagn      0.641381
		craterFreq      32.3264
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.649023
		volcanoFreq     2.24917
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.813664
		volcanoRadius   0.187431
		volcanoTemp     1501.3
		lavaCoverTidal  0.66528
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      1
		twistMagn       3.5
		cycloneMagn     0.576613
		cycloneDensity  0.32197
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
		BumpHeight      17.1182
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
		Height          30.8574
		BumpHeight      6.54929
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.904054
		mainOctaves     10
		Coverage        1
		twistZones      1
		twistMagn       3.5
	}

	Clouds
	{
		Height          53.1563
		BumpHeight      6.92175
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.904054
		mainOctaves     10
		Coverage        1
		twistZones      1
		twistMagn       3.5
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          212.006
		Density         403.917
		Pressure        748.549
		Greenhouse      470.241
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0114951
		Saturation      0.5

		Composition
		{
			CO2   	53.437
			H2O   	29.1677
			SO2   	17.3515
			N2    	0.042457
			CO    	0.00129237
			Ne    	7.95724e-005
			Ar    	6.3129e-005
		}
	}

	Aurora
	{
		Height      159.894
		NorthLat    63.8533
		NorthLon    -101.924
		NorthRadius 2334.56
		NorthWidth  2563.01
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -75.9019
		SouthLon    76.1139
		SouthRadius 2828.12
		SouthWidth  3519.04
		SouthRings  5
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0169215
		Period          0.00778867
		Eccentricity    0.0752755
		Inclination     -2.30269
		AscendingNode   63.5376
		ArgOfPericenter 44.205
		MeanAnomaly     156.307
	}
}

Planet	"2"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "GasGiant"

	Mass            1760.72
	Radius          76246.4
	InertiaMoment   0.236269

	Obliquity       -0.30415
	EqAscendNode    49.3743
	TidalLocked     true

	AlbedoBond      0.508825
	AlbedoGeom      0.61059
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.757217
		Randomize      (0.167, 0.130, 0.098)
		detailScale     196110
		colorConversion true
		tropicLatitude  0.00964885
		icecapLatitude  0.909649
		mainFreq        0.00639712
		venusFreq       9.84244
		venusMagn       0.45026
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.344212
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      4.41163
		twistMagn       1.24185
		cycloneMagn     5.4522
		cycloneFreq     0.310649
		cycloneDensity  0.135234
		cycloneOctaves  1
		colorLayer0    (0.120, 0.200, 0.480, 1.100)
		colorLayer1    (0.330, 0.400, 0.720, 0.700)
		colorLayer2    (0.330, 0.400, 0.720, 0.200)
		colorLayer3    (0.600, 0.600, 0.600, 0.050)
		colorLayer4    (0.350, 0.430, 0.770, 0.000)
		colorLayer5    (0.470, 0.540, 0.850, 0.000)
		colorLayer6    (0.600, 0.650, 0.910, 0.000)
		colorLayer7    (0.990, 0.990, 1.000, 1.000)
		colorLowPlants (0.350, 0.430, 0.770, 0.000)
		colorUpPlants  (0.470, 0.540, 0.850, 0.000)
		BumpHeight      5.69784
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          24.5547
		BumpHeight      60.0576
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.42563
		mainOctaves     10
		Coverage        0.588249
		twistZones      4.41163
		twistMagn       1.24185
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          100
		Density         5408.31
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0467123
		Saturation      0.597546

		Composition
		{
			H2    	92.4002
			He    	7.22568
			CH4   	0.318034
			N2    	0.0390511
			O2    	0.00865995
			C2H2  	0.00299924
			C2H4  	0.00147373
			Ne    	0.00123218
			Ar    	0.000940273
			NH3   	0.00090261
			C2H6  	0.000733481
			C3H8  	9.45636e-005
		}
	}

	Aurora
	{
		Height      3673.41
		NorthLat    82.2408
		NorthLon    -58.2446
		NorthRadius 13655.3
		NorthWidth  8429.19
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -81.6414
		SouthLon    116.076
		SouthRadius 22556.2
		SouthWidth  13815
		SouthRings  3
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0360454
		Period          0.0234555
		Eccentricity    0.0162298
		Inclination     -0.30415
		AscendingNode   49.3743
		ArgOfPericenter 208.937
		MeanAnomaly     181.464
	}
}

DwarfMoon	"2.D1"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            1.43841e-008
	Radius          33.336
	InertiaMoment   0.399162

	Oblateness      0.249

	Obliquity       0.00436272
	EqAscendNode    80.9917
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.632 0.629)

	Surface
	{
		SurfStyle       0.403683
		OceanStyle      0.882414
		Randomize      (-0.481, 0.813, -0.854)
		colorDistMagn   0.900766
		colorDistFreq   0.928262
		detailScale     910.294
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.625712
		terraceProb     0.153664
		erosion         0
		montesMagn      0.530818
		montesFreq      3.0414
		montesSpiky     0.90722
		montesFraction  0.452477
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.20841
		hillsFraction   0.561562
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251043
		craterFreq      0.238374
		craterDensity   0.898406
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   43.579
		volcanoTemp     1554.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.253, 0.252, 0.000)
		colorShelf     (0.270, 0.268, 0.267, 0.000)
		colorBeach     (0.285, 0.284, 0.283, 0.000)
		colorDesert    (0.301, 0.300, 0.299, 0.000)
		colorLowland   (0.317, 0.316, 0.314, 0.000)
		colorUpland    (0.333, 0.332, 0.330, 0.000)
		colorRock      (0.349, 0.347, 0.346, 0.000)
		colorSnow      (0.365, 0.363, 0.362, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00142436
		Period          0.000740907
		Eccentricity    6.84756e-005
		Inclination     0.00436272
		AscendingNode   80.9917
		ArgOfPericenter -111.278
		MeanAnomaly     -43.2073
	}
}

DwarfMoon	"2.D2"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            1.95545e-008
	Radius          34.8222
	InertiaMoment   0.395522

	Oblateness      0.249

	Obliquity       -0.00960205
	EqAscendNode    -111.324
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.709 0.640 0.582)

	Surface
	{
		SurfStyle       0.880122
		OceanStyle      0.956806
		Randomize      (-0.106, -0.293, -0.228)
		colorDistMagn   0.701592
		colorDistFreq   0.584671
		detailScale     950.879
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622711
		terraceProb     0.386055
		erosion         0
		montesMagn      0.485684
		montesFreq      3.24482
		montesSpiky     0.842483
		montesFraction  0.646
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.52057
		hillsFraction   0.617855
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240698
		craterFreq      0.230877
		craterDensity   0.796413
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   39.0426
		volcanoTemp     1583.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.224, 0.233, 0.050)
		colorShelf     (0.284, 0.262, 0.268, 0.040)
		colorBeach     (0.326, 0.301, 0.303, 0.030)
		colorDesert    (0.369, 0.339, 0.344, 0.020)
		colorLowland   (0.411, 0.378, 0.379, 0.030)
		colorUpland    (0.454, 0.416, 0.413, 0.050)
		colorRock      (0.496, 0.454, 0.460, 0.020)
		colorSnow      (0.496, 0.454, 0.460, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00165916
		Period          0.000931463
		Eccentricity    9.41653e-005
		Inclination     -0.00960205
		AscendingNode   -111.324
		ArgOfPericenter 163.966
		MeanAnomaly     -42.8059
	}
}

DwarfMoon	"2.D3"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            2.65472e-008
	Radius          45.1437
	InertiaMoment   0.398226

	Oblateness      0.249

	Obliquity       -0.0124643
	EqAscendNode    137.419
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.583 0.581 0.577)

	Surface
	{
		SurfStyle       0.655582
		OceanStyle      0.592228
		Randomize      (-0.313, -0.705, -0.177)
		colorDistMagn   0.600083
		colorDistFreq   1.05366
		detailScale     1232.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536074
		terraceProb     0.265232
		erosion         0
		montesMagn      0.428591
		montesFreq      2.91328
		montesSpiky     0.937334
		montesFraction  0.66722
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.75678
		hillsFraction   0.470999
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227066
		craterFreq      0.234202
		craterDensity   0.889946
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   43.4404
		volcanoTemp     1343.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.198, 0.162, 0.000)
		colorShelf     (0.233, 0.203, 0.185, 0.000)
		colorBeach     (0.274, 0.238, 0.219, 0.000)
		colorDesert    (0.298, 0.256, 0.214, 0.000)
		colorLowland   (0.327, 0.273, 0.242, 0.000)
		colorUpland    (0.362, 0.331, 0.294, 0.000)
		colorRock      (0.391, 0.360, 0.317, 0.000)
		colorSnow      (0.426, 0.384, 0.335, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00180286
		Period          0.00105506
		Eccentricity    9.65069e-006
		Inclination     -0.0124643
		AscendingNode   137.419
		ArgOfPericenter -121.09
		MeanAnomaly     16.8086
	}
}

DwarfMoon	"2.D4"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            3.60227e-008
	Radius          47.4079
	InertiaMoment   0.399297

	Oblateness      0.249

	Obliquity       -0.0125371
	EqAscendNode    92.9594
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.579 0.577 0.574)

	Surface
	{
		SurfStyle       0.363345
		OceanStyle      0.19072
		Randomize      (-0.007, 0.962, 0.159)
		colorDistMagn   0.53337
		colorDistFreq   0.663023
		detailScale     1294.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.456734
		terraceProb     0.146274
		erosion         0
		montesMagn      0.636099
		montesFreq      3.04907
		montesSpiky     0.938054
		montesFraction  0.793471
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.90084
		hillsFraction   0.939025
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235757
		craterFreq      0.167228
		craterDensity   0.78366
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   39.1623
		volcanoTemp     1579.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.231, 0.229, 0.000)
		colorShelf     (0.246, 0.245, 0.244, 0.000)
		colorBeach     (0.261, 0.260, 0.258, 0.000)
		colorDesert    (0.275, 0.274, 0.272, 0.000)
		colorLowland   (0.290, 0.289, 0.287, 0.000)
		colorUpland    (0.304, 0.303, 0.301, 0.000)
		colorRock      (0.319, 0.317, 0.315, 0.000)
		colorSnow      (0.333, 0.332, 0.330, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00194159
		Period          0.00117915
		Eccentricity    8.33087e-005
		Inclination     -0.0125371
		AscendingNode   92.9594
		ArgOfPericenter -177.992
		MeanAnomaly     -105.764
	}
}

DwarfMoon	"2.D5"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            4.88983e-008
	Radius          50.4197
	InertiaMoment   0.396439

	Oblateness      0.216664

	Obliquity       0.000790218
	EqAscendNode    92.7752
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.800 0.756 0.720)

	Surface
	{
		SurfStyle       0.260655
		OceanStyle      0.807896
		Randomize      (0.709, 0.192, -0.367)
		colorDistMagn   0.778769
		colorDistFreq   1.30749
		detailScale     1376.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390029
		terraceProb     0.581373
		erosion         0
		montesMagn      0.603273
		montesFreq      3.23291
		montesSpiky     0.992209
		montesFraction  0.415493
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.89783
		hillsFraction   0.725847
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264933
		craterFreq      0.215666
		craterDensity   0.896327
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.7486
		volcanoTemp     1340.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.302, 0.288, 0.000)
		colorShelf     (0.340, 0.321, 0.306, 0.000)
		colorBeach     (0.360, 0.340, 0.324, 0.000)
		colorDesert    (0.380, 0.359, 0.342, 0.000)
		colorLowland   (0.400, 0.378, 0.360, 0.000)
		colorUpland    (0.420, 0.397, 0.378, 0.000)
		colorRock      (0.440, 0.416, 0.396, 0.000)
		colorSnow      (0.460, 0.435, 0.414, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00198421
		Period          0.00121819
		Eccentricity    3.28105e-005
		Inclination     0.000790218
		AscendingNode   92.7752
		ArgOfPericenter -101.191
		MeanAnomaly     76.4818
	}
}

DwarfMoon	"2.D6"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            6.64579e-008
	Radius          53.0456
	InertiaMoment   0.398404

	Oblateness      0.0151766

	Obliquity       -14.7819
	EqAscendNode    -175.376
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.786 0.784 0.780)

	Surface
	{
		SurfStyle       0.513606
		OceanStyle      0.68149
		Randomize      (-0.101, -0.020, 0.563)
		colorDistMagn   0.324849
		colorDistFreq   1.08494
		detailScale     1448.5
		colorConversion true
		snowLevel       2
		tropicLatitude  0.020585
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592257
		terraceProb     0.621226
		erosion         0
		montesMagn      0.459737
		montesFreq      2.44816
		montesSpiky     0.957793
		montesFraction  0.412567
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.88003
		hillsFraction   0.927666
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236472
		craterFreq      0.199546
		craterDensity   0.924791
		craterOctaves   14
		volcanoActivity 0.900448
		volcanoFlows    0
		volcanoRadius   32.2613
		volcanoTemp     1616.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.266, 0.218, 0.000)
		colorShelf     (0.314, 0.274, 0.250, 0.000)
		colorBeach     (0.370, 0.321, 0.296, 0.000)
		colorDesert    (0.401, 0.345, 0.289, 0.000)
		colorLowland   (0.440, 0.368, 0.328, 0.000)
		colorUpland    (0.487, 0.447, 0.398, 0.000)
		colorRock      (0.527, 0.486, 0.429, 0.000)
		colorSnow      (0.574, 0.517, 0.452, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00288715
		Period          0.00213816
		Eccentricity    0.261775
		Inclination     -14.7819
		AscendingNode   -175.376
		ArgOfPericenter 26.2659
		MeanAnomaly     148.386
	}
}

DwarfMoon	"2.D7"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            9.05156e-008
	Radius          68.7054
	InertiaMoment   0.399428

	Oblateness      0.00157287

	RotationPeriod  147.354
	Obliquity       57.1773
	EqAscendNode    114.635

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.408 0.403 0.401)

	Surface
	{
		SurfStyle       0.0101848
		OceanStyle      0.139927
		Randomize      (0.508, 0.999, -0.256)
		colorDistMagn   0.472704
		colorDistFreq   2.34738
		detailScale     1876.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.808734
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.526762
		terraceProb     0.556551
		erosion         0
		montesMagn      0.330429
		montesFreq      2.11778
		montesSpiky     0.875095
		montesFraction  0.373872
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.84778
		hillsFraction   0.953203
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230468
		craterFreq      0.261632
		craterDensity   0.918157
		craterOctaves   14
		volcanoActivity 0.932399
		volcanoFlows    0
		volcanoRadius   35.8043
		volcanoTemp     1635.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.161, 0.160, 0.000)
		colorShelf     (0.173, 0.171, 0.170, 0.000)
		colorBeach     (0.184, 0.181, 0.180, 0.000)
		colorDesert    (0.194, 0.191, 0.190, 0.000)
		colorLowland   (0.204, 0.201, 0.200, 0.000)
		colorUpland    (0.214, 0.211, 0.210, 0.000)
		colorRock      (0.225, 0.222, 0.220, 0.000)
		colorSnow      (0.235, 0.232, 0.230, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00345718
		Period          0.00280167
		Eccentricity    0.316988
		Inclination     57.1773
		AscendingNode   114.635
		ArgOfPericenter -140.41
		MeanAnomaly     -70.4977
	}
}

DwarfMoon	"2.D8"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            1.2366e-007
	Radius          71.9558
	InertiaMoment   0.39693

	Oblateness      0.0385206

	Obliquity       -15.0451
	EqAscendNode    5.24546
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.596 0.590 0.586)

	Surface
	{
		SurfStyle       0.542207
		OceanStyle      0.391318
		Randomize      (-0.678, 0.013, 0.603)
		colorDistMagn   0.464603
		colorDistFreq   2.16664
		detailScale     1964.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.500875
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530428
		terraceProb     0.25532
		erosion         0
		montesMagn      0.568532
		montesFreq      4.23094
		montesSpiky     0.915881
		montesFraction  0.25268
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.8315
		hillsFraction   0.48537
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259686
		craterFreq      0.2746
		craterDensity   0.945766
		craterOctaves   15
		volcanoActivity 0.483363
		volcanoFlows    0
		volcanoRadius   32.0817
		volcanoTemp     1595.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.201, 0.164, 0.000)
		colorShelf     (0.238, 0.207, 0.188, 0.000)
		colorBeach     (0.280, 0.242, 0.223, 0.000)
		colorDesert    (0.304, 0.260, 0.217, 0.000)
		colorLowland   (0.334, 0.277, 0.246, 0.000)
		colorUpland    (0.369, 0.336, 0.299, 0.000)
		colorRock      (0.399, 0.366, 0.322, 0.000)
		colorSnow      (0.435, 0.390, 0.340, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00369862
		Period          0.00310023
		Eccentricity    0.140282
		Inclination     -15.0451
		AscendingNode   5.24545
		ArgOfPericenter -55.3047
		MeanAnomaly     -164
	}
}

DwarfMoon	"2.D9"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            1.69629e-007
	Radius          76.7639
	InertiaMoment   0.398571

	Oblateness      0.00349486

	RotationPeriod  85.1442
	Obliquity       8.11023
	EqAscendNode    -73.0952

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.768 0.766 0.764)

	Surface
	{
		SurfStyle       0.307204
		OceanStyle      0.180268
		Randomize      (0.241, -0.832, 0.355)
		colorDistMagn   0.417931
		colorDistFreq   1.38709
		detailScale     2096.17
		colorConversion true
		snowLevel       2
		tropicLatitude  0.225213
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.585734
		terraceProb     0.419581
		erosion         0
		montesMagn      0.373153
		montesFreq      2.52321
		montesSpiky     0.926302
		montesFraction  0.510786
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.6578
		hillsFraction   0.51793
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269021
		craterFreq      0.207618
		craterDensity   1.05979
		craterOctaves   15
		volcanoActivity 0.904228
		volcanoFlows    0
		volcanoRadius   29.2222
		volcanoTemp     1629.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.306, 0.305, 0.000)
		colorShelf     (0.326, 0.325, 0.324, 0.000)
		colorBeach     (0.346, 0.345, 0.344, 0.000)
		colorDesert    (0.365, 0.364, 0.363, 0.000)
		colorLowland   (0.384, 0.383, 0.382, 0.000)
		colorUpland    (0.403, 0.402, 0.401, 0.000)
		colorRock      (0.422, 0.421, 0.420, 0.000)
		colorSnow      (0.441, 0.440, 0.439, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00429924
		Period          0.00388529
		Eccentricity    0.473107
		Inclination     8.11023
		AscendingNode   -73.0952
		ArgOfPericenter -94.4113
		MeanAnomaly     158.851
	}
}

DwarfMoon	"2.D10"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            2.33887e-007
	Radius          81.5016
	InertiaMoment   0.399557

	Oblateness      0.00361301

	Obliquity       5.25291
	EqAscendNode    -168.883
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.791 0.788 0.787)

	Surface
	{
		SurfStyle       0.000934706
		OceanStyle      0.0776884
		Randomize      (0.840, 0.039, -0.195)
		colorDistMagn   0.163351
		colorDistFreq   1.95996
		detailScale     2225.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0177361
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544151
		terraceProb     0.203418
		erosion         0
		montesMagn      0.521507
		montesFreq      2.15524
		montesSpiky     0.996306
		montesFraction  0.762825
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.9113
		hillsFraction   0.761435
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202281
		craterFreq      0.22165
		craterDensity   0.792488
		craterOctaves   15
		volcanoActivity 0.0909953
		volcanoFlows    0
		volcanoRadius   26.4222
		volcanoTemp     1207
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.315, 0.315, 0.000)
		colorShelf     (0.336, 0.335, 0.334, 0.000)
		colorBeach     (0.356, 0.355, 0.354, 0.000)
		colorDesert    (0.376, 0.374, 0.374, 0.000)
		colorLowland   (0.396, 0.394, 0.393, 0.000)
		colorUpland    (0.416, 0.414, 0.413, 0.000)
		colorRock      (0.435, 0.434, 0.433, 0.000)
		colorSnow      (0.455, 0.453, 0.452, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00471225
		Period          0.00445838
		Eccentricity    0.0959759
		Inclination     5.25291
		AscendingNode   -168.883
		ArgOfPericenter 57.183
		MeanAnomaly     -60.6904
	}
}

DwarfMoon	"2.D11"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            3.24545e-007
	Radius          106.574
	InertiaMoment   0.397285

	Oblateness      0.00603408

	RotationPeriod  76.4494
	Obliquity       -80.4507
	EqAscendNode    -139.363

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.424 0.421 0.419)

	Surface
	{
		SurfStyle       0.689759
		OceanStyle      0.397504
		Randomize      (0.649, -0.394, -0.956)
		colorDistMagn   0.772679
		colorDistFreq   7.10403
		detailScale     2910.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.643451
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.593263
		terraceProb     0.418634
		erosion         0
		montesMagn      0.447623
		montesFreq      2.79373
		montesSpiky     0.917989
		montesFraction  0.717951
		dunesFraction   0
		hillsMagn       0
		hillsFreq       30.2046
		hillsFraction   0.770211
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222592
		craterFreq      0.4655
		craterDensity   0.6407
		craterOctaves   15
		volcanoActivity 0.604062
		volcanoFlows    0
		volcanoRadius   29.3306
		volcanoTemp     1622.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.143, 0.117, 0.000)
		colorShelf     (0.170, 0.147, 0.134, 0.000)
		colorBeach     (0.199, 0.173, 0.159, 0.000)
		colorDesert    (0.216, 0.185, 0.155, 0.000)
		colorLowland   (0.237, 0.198, 0.176, 0.000)
		colorUpland    (0.263, 0.240, 0.214, 0.000)
		colorRock      (0.284, 0.261, 0.230, 0.000)
		colorSnow      (0.309, 0.278, 0.243, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00524323
		Period          0.00523279
		Eccentricity    0.260595
		Inclination     -80.4507
		AscendingNode   -139.363
		ArgOfPericenter 131.266
		MeanAnomaly     93.3438
	}
}

DwarfPlanet	"3"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "IceWorld"

	Mass            0.0061952
	Radius          1396.37
	InertiaMoment   0.388215

	Obliquity       1.24325
	EqAscendNode    13.4967
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.736 0.549 0.461)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Subglacial"
	}

	Surface
	{
		SurfStyle       0.690914
		OceanStyle      0.434198
		Randomize      (0.514, 0.324, 0.189)
		colorDistMagn   0.0983768
		colorDistFreq   168.404
		detailScale     3591.53
		colorConversion true
		drivenDarkening 0
		seaLevel        0.192023
		snowLevel       2
		tropicLatitude  0.0430834
		icecapLatitude  0.956003
		icecapHeight    0.195853
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.79621
		venusFreq       0.940604
		venusMagn       0.213573
		mareFreq        0.656566
		mareDensity     0.0032759
		terraceProb     0.26231
		erosion         0
		montesMagn      0.0709838
		montesFreq      87.6276
		montesSpiky     0.935404
		montesFraction  0.293219
		dunesMagn       0.044609
		dunesFreq       1862.62
		dunesFraction   0.668172
		hillsMagn       0.129878
		hillsFreq       195.145
		hillsFraction   0.426281
		hills2Fraction  0.0243426
		riversMagn      63.3564
		riversFreq      3.275
		riversSin       5.99948
		riversOctaves   0
		canyonsMagn     0.418254
		canyonsFreq     0.334349
		canyonFraction  0
		cracksMagn      0.0305194
		cracksFreq      0.268813
		cracksOctaves   1
		craterMagn      0.652962
		craterFreq      4.9533
		craterDensity   0.793641
		craterOctaves   11
		craterRayedFactor 0.277489
		volcanoMagn     0.203792
		volcanoFreq     1.32632
		volcanoDensity  0.0641204
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.362124
		volcanoRadius   0.922289
		volcanoTemp     1418.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.471, 0.352, 0.309, 0.250)
		colorShelf     (0.515, 0.401, 0.350, 0.250)
		colorBeach     (0.419, 0.297, 0.267, 0.200)
		colorDesert    (0.390, 0.269, 0.235, 0.200)
		colorLowland   (0.287, 0.209, 0.194, 0.200)
		colorUpland    (0.544, 0.406, 0.350, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.287, 0.209, 0.194, 0.200)
		colorUpPlants  (0.544, 0.406, 0.350, 0.250)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.986266
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          69.8183
		Density         0.00137341
		Pressure        0.000498977
		Greenhouse      0.398559
		Bright          4.2419
		Opacity         0
		SkyLight        1.41397
		Hue             0.0326918
		Saturation      1

		Composition
		{
			C2H6  	66.3885
			C2H4  	12.5627
			C2H2  	11.2102
			N2    	9.05106
			CO2   	0.598801
			H2S   	0.170695
			CO    	0.012632
			Ar    	0.00464712
			Kr    	0.000459884
			O2    	0.000124047
			C3H8  	8.48413e-005
			Xe    	8.38808e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0634289
		Period          0.0565279
		Eccentricity    0.0397594
		Inclination     0.598174
		AscendingNode   13.6485
		ArgOfPericenter 284.44
		MeanAnomaly     231.104
	}
}

Planet	"4"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "IceGiant"

	Mass            42.931
	Radius          26911.7
	InertiaMoment   0.184312

	RotationPeriod  1995.43
	Obliquity       -0.0403631
	EqAscendNode    53.7506

	AlbedoBond      0.51363
	AlbedoGeom      0.616356
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.758047
		Randomize      (0.951, 0.831, 0.472)
		detailScale     69218.5
		colorConversion true
		tropicLatitude  0.00124488
		icecapLatitude  0.901245
		mainFreq        0.0329878
		venusFreq       2.05947
		venusMagn       0.395711
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      8.36363
		twistMagn       1.14731
		cycloneMagn     19.5651
		cycloneFreq     0.365837
		cycloneDensity  0.0974619
		cycloneOctaves  1
		colorLayer0    (0.120, 0.200, 0.480, 1.000)
		colorLayer1    (0.330, 0.400, 0.720, 1.000)
		colorLayer2    (0.330, 0.400, 0.720, 1.000)
		colorLayer3    (0.600, 0.600, 0.600, 1.000)
		colorLayer4    (0.350, 0.430, 0.770, 1.000)
		colorLayer5    (0.470, 0.540, 0.850, 1.000)
		colorLayer6    (0.600, 0.650, 0.910, 1.000)
		colorLayer7    (0.990, 0.990, 1.000, 1.000)
		colorLowPlants (0.350, 0.430, 0.770, 1.000)
		colorUpPlants  (0.470, 0.540, 0.850, 1.000)
		BumpHeight      12.8793
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          64.127
		BumpHeight      63.3409
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.39223
		mainOctaves     10
		Coverage        0.56815
		twistZones      8.36363
		twistMagn       1.14731
	}

	Clouds
	{
		Height          115.375
		BumpHeight      57.5079
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.39223
		mainOctaves     10
		Coverage        0.56815
		twistZones      8.36363
		twistMagn       1.14731
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          269.117
		Density         5383.33
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0200149
		Saturation      0.593913

		Composition
		{
			H2    	92.4917
			He    	7.18883
			CH4   	0.279407
			N2    	0.0311483
			O2    	0.00724625
			Ne    	0.00105223
			Ar    	0.000662581
		}
	}

	NoAurora        true

	Rings
	{
		InnerRadius     35377.8
		OuterRadius     82478.5
		RotationPeriod  6.04897
		RotationOffset  0
		FrontBright     0.865371
		BackBright      0.909292
		Density         0.682686
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.10114
		Period          0.113728
		Eccentricity    0.0937373
		Inclination     -0.0403631
		AscendingNode   53.7506
		ArgOfPericenter 323.832
		MeanAnomaly     182.03
	}
}

DwarfMoon	"4.D1"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.53901e-009
	Radius          18.2732
	InertiaMoment   0.39832

	Oblateness      0.249

	Obliquity       0.00797143
	EqAscendNode    -34.7724
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.583 0.541 0.467)

	Surface
	{
		SurfStyle       0.448806
		OceanStyle      0.260926
		Randomize      (0.536, 0.415, -0.612)
		colorDistMagn   0.904444
		colorDistFreq   0.098206
		detailScale     498.98
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.531522
		terraceProb     0.590493
		erosion         0
		montesMagn      0.582638
		montesFreq      3.15827
		montesSpiky     0.993184
		montesFraction  0.349469
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.621178
		hillsFraction   0.458249
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263524
		craterFreq      0.230172
		craterDensity   0.889422
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   73.0297
		volcanoTemp     1510.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.216, 0.187, 0.000)
		colorShelf     (0.248, 0.230, 0.199, 0.000)
		colorBeach     (0.262, 0.243, 0.210, 0.000)
		colorDesert    (0.277, 0.257, 0.222, 0.000)
		colorLowland   (0.291, 0.270, 0.234, 0.000)
		colorUpland    (0.306, 0.284, 0.245, 0.000)
		colorRock      (0.320, 0.297, 0.257, 0.000)
		colorSnow      (0.335, 0.311, 0.269, 1.000)
		BumpHeight      16.4459
		BumpOffset      3.28918
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.000491055
		Period          0.000960482
		Eccentricity    9.7057e-005
		Inclination     0.00797143
		AscendingNode   -34.7724
		ArgOfPericenter 174.081
		MeanAnomaly     -84.1087
	}
}

DwarfMoon	"4.D2"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            2.17313e-009
	Radius          18.9752
	InertiaMoment   0.399365

	Oblateness      0.0151632

	Obliquity       9.51996
	EqAscendNode    -143.314
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.770 0.767 0.766)

	Surface
	{
		SurfStyle       0.385195
		OceanStyle      0.458777
		Randomize      (0.993, 0.841, -0.977)
		colorDistMagn   0.735663
		colorDistFreq   0.0830585
		detailScale     518.151
		colorConversion true
		snowLevel       2
		tropicLatitude  0.103957
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501219
		terraceProb     0.38554
		erosion         0
		montesMagn      0.392345
		montesFreq      3.72242
		montesSpiky     0.913856
		montesFraction  0.51771
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.870764
		hillsFraction   0.369839
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223292
		craterFreq      0.201485
		craterDensity   0.836137
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.8191
		volcanoTemp     1405.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.307, 0.306, 0.000)
		colorShelf     (0.327, 0.326, 0.325, 0.000)
		colorBeach     (0.346, 0.345, 0.345, 0.000)
		colorDesert    (0.366, 0.364, 0.364, 0.000)
		colorLowland   (0.385, 0.384, 0.383, 0.000)
		colorUpland    (0.404, 0.403, 0.402, 0.000)
		colorRock      (0.423, 0.422, 0.421, 0.000)
		colorSnow      (0.443, 0.441, 0.440, 1.000)
		BumpHeight      17.0777
		BumpOffset      3.41554
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00148888
		Period          0.00507086
		Eccentricity    0.118484
		Inclination     9.51996
		AscendingNode   -143.314
		ArgOfPericenter 101.426
		MeanAnomaly     158.915
	}
}

DwarfMoon	"4.D3"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            3.0399e-009
	Radius          20.3331
	InertiaMoment   0.396717

	Oblateness      0.0131679

	RotationPeriod  44.5135
	Obliquity       46.4396
	EqAscendNode    -109.716

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.588 0.582 0.578)

	Surface
	{
		SurfStyle       0.200318
		OceanStyle      0.305899
		Randomize      (0.816, -0.434, 0.093)
		colorDistMagn   0.703795
		colorDistFreq   0.236622
		detailScale     555.229
		colorConversion true
		snowLevel       2
		tropicLatitude  0.758185
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446894
		terraceProb     0.542968
		erosion         0
		montesMagn      0.580509
		montesFreq      3.16428
		montesSpiky     0.955575
		montesFraction  0.908933
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.748371
		hillsFraction   0.707613
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271576
		craterFreq      0.170344
		craterDensity   0.875035
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.8201
		volcanoTemp     1165.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.233, 0.231, 0.000)
		colorShelf     (0.250, 0.247, 0.245, 0.000)
		colorBeach     (0.264, 0.262, 0.260, 0.000)
		colorDesert    (0.279, 0.276, 0.274, 0.000)
		colorLowland   (0.294, 0.291, 0.289, 0.000)
		colorUpland    (0.309, 0.305, 0.303, 0.000)
		colorRock      (0.323, 0.320, 0.318, 0.000)
		colorSnow      (0.338, 0.334, 0.332, 1.000)
		BumpHeight      18.2998
		BumpOffset      3.65995
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00195283
		Period          0.00761712
		Eccentricity    0.225348
		Inclination     46.4396
		AscendingNode   -109.716
		ArgOfPericenter 84.6092
		MeanAnomaly     -76.1363
	}
}

DwarfMoon	"4.D4"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            4.21942e-009
	Radius          21.7424
	InertiaMoment   0.398491

	Oblateness      0.00106441

	Obliquity       -79.192
	EqAscendNode    -124.344
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.408 0.403 0.401)

	Surface
	{
		SurfStyle       0.631423
		OceanStyle      0.983417
		Randomize      (-0.207, 0.759, 0.771)
		colorDistMagn   0.750391
		colorDistFreq   0.22514
		detailScale     593.714
		colorConversion true
		snowLevel       2
		tropicLatitude  0.814983
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58507
		terraceProb     0.148858
		erosion         0
		montesMagn      0.646614
		montesFreq      3.05839
		montesSpiky     0.828449
		montesFraction  0.572475
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.12045
		hillsFraction   0.670381
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237573
		craterFreq      0.23587
		craterDensity   0.784931
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   52.4793
		volcanoTemp     1367.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.159, 0.137, 0.112, 0.000)
		colorShelf     (0.163, 0.141, 0.128, 0.000)
		colorBeach     (0.192, 0.165, 0.152, 0.000)
		colorDesert    (0.208, 0.177, 0.148, 0.000)
		colorLowland   (0.229, 0.190, 0.168, 0.000)
		colorUpland    (0.253, 0.230, 0.205, 0.000)
		colorRock      (0.273, 0.250, 0.221, 0.000)
		colorSnow      (0.298, 0.266, 0.233, 1.000)
		BumpHeight      19.5682
		BumpOffset      3.91364
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00235565
		Period          0.0100916
		Eccentricity    0.499931
		Inclination     -79.192
		AscendingNode   -124.344
		ArgOfPericenter 117.884
		MeanAnomaly     -169.852
	}
}

DwarfMoon	"4.D5"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            5.81918e-009
	Radius          29.2494
	InertiaMoment   0.399495

	Oblateness      0.00304784

	Obliquity       -66.1947
	EqAscendNode    -99.3677
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.474 0.470 0.466)

	Surface
	{
		SurfStyle       0.320351
		OceanStyle      0.45247
		Randomize      (0.852, 0.159, 0.644)
		colorDistMagn   0.669132
		colorDistFreq   0.575422
		detailScale     798.704
		colorConversion true
		snowLevel       2
		tropicLatitude  0.9542
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.32125
		terraceProb     0.443413
		erosion         0
		montesMagn      0.350321
		montesFreq      2.77671
		montesSpiky     0.971538
		montesFraction  0.511782
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.10773
		hillsFraction   0.735961
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243303
		craterFreq      0.252805
		craterDensity   0.823085
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   60.1163
		volcanoTemp     1695.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.188, 0.186, 0.000)
		colorShelf     (0.201, 0.200, 0.198, 0.000)
		colorBeach     (0.213, 0.212, 0.210, 0.000)
		colorDesert    (0.225, 0.223, 0.221, 0.000)
		colorLowland   (0.237, 0.235, 0.233, 0.000)
		colorUpland    (0.249, 0.247, 0.245, 0.000)
		colorRock      (0.261, 0.259, 0.256, 0.000)
		colorSnow      (0.273, 0.270, 0.268, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00282184
		Period          0.013231
		Eccentricity    0.0724905
		Inclination     -66.1947
		AscendingNode   -99.3677
		ArgOfPericenter 165.393
		MeanAnomaly     -169.346
	}
}

DwarfMoon	"4.D6"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            7.98386e-009
	Radius          29.493
	InertiaMoment   0.397125

	RotationPeriod  889.449
	Obliquity       -64.1192
	EqAscendNode    6.20543

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.784 0.782 0.781)

	Surface
	{
		SurfStyle       0.306801
		OceanStyle      0.706933
		Randomize      (-0.909, 0.820, -0.050)
		colorDistMagn   0.306234
		colorDistFreq   0.367046
		detailScale     805.356
		colorConversion true
		snowLevel       2
		tropicLatitude  0.789157
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35478
		terraceProb     0.418159
		erosion         0
		montesMagn      0.427294
		montesFreq      3.63331
		montesSpiky     0.903348
		montesFraction  0.330999
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.69613
		hillsFraction   0.927175
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214541
		craterFreq      0.22014
		craterDensity   1.09365
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.751
		volcanoTemp     1233.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.313, 0.313, 0.000)
		colorShelf     (0.333, 0.332, 0.332, 0.000)
		colorBeach     (0.353, 0.352, 0.352, 0.000)
		colorDesert    (0.372, 0.372, 0.371, 0.000)
		colorLowland   (0.392, 0.391, 0.391, 0.000)
		colorUpland    (0.411, 0.411, 0.410, 0.000)
		colorRock      (0.431, 0.430, 0.430, 0.000)
		colorSnow      (0.451, 0.450, 0.449, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00332345
		Period          0.0169113
		Eccentricity    0.319121
		Inclination     -64.1192
		AscendingNode   6.20543
		ArgOfPericenter -37.29
		MeanAnomaly     59.2436
	}
}

DwarfMoon	"4.D7"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.09089e-008
	Radius          31.3056
	InertiaMoment   0.398652

	Obliquity       -57.1775
	EqAscendNode    -101.928
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.617 0.576 0.517)

	Surface
	{
		SurfStyle       0.160779
		OceanStyle      0.817764
		Randomize      (-0.856, 0.514, 0.562)
		colorDistMagn   0.714184
		colorDistFreq   0.72903
		detailScale     854.851
		colorConversion true
		snowLevel       2
		tropicLatitude  0.898114
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562025
		terraceProb     0.46003
		erosion         0
		montesMagn      0.428131
		montesFreq      2.99471
		montesSpiky     0.977864
		montesFraction  0.709995
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.87905
		hillsFraction   0.58159
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232511
		craterFreq      0.23803
		craterDensity   0.93761
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.9933
		volcanoTemp     1823.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.231, 0.207, 0.000)
		colorShelf     (0.262, 0.245, 0.220, 0.000)
		colorBeach     (0.278, 0.259, 0.232, 0.000)
		colorDesert    (0.293, 0.274, 0.245, 0.000)
		colorLowland   (0.309, 0.288, 0.258, 0.000)
		colorUpland    (0.324, 0.303, 0.271, 0.000)
		colorRock      (0.339, 0.317, 0.284, 0.000)
		colorSnow      (0.355, 0.331, 0.297, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00356574
		Period          0.018794
		Eccentricity    0.159535
		Inclination     -57.1775
		AscendingNode   -101.928
		ArgOfPericenter 45.9029
		MeanAnomaly     -26.9344
	}
}

Planet	"5"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "IceWorld"

	Mass            0.169199
	Radius          4692.05
	InertiaMoment   0.328622

	RotationPeriod  287.876
	Obliquity       0.270691
	EqAscendNode    -68.8581

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.780 0.745 0.680)

	Surface
	{
		SurfStyle       0.398113
		OceanStyle      0.798995
		Randomize      (0.034, 0.765, -0.819)
		colorDistMagn   0.0662476
		colorDistFreq   575.351
		detailScale     12068.2
		colorConversion true
		drivenDarkening 0
		seaLevel        0.201635
		snowLevel       2
		tropicLatitude  0.00757224
		icecapLatitude  0.991324
		icecapHeight    0.202124
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.69567
		venusFreq       1.28057
		venusMagn       0.174535
		mareFreq        1.76772
		mareDensity     0.0128641
		terraceProb     0.36679
		erosion         0
		montesMagn      0.251671
		montesFreq      183.777
		montesSpiky     0.995265
		montesFraction  0.244855
		dunesMagn       0.0467431
		dunesFreq       6134.65
		dunesFraction   0.926886
		hillsMagn       0.124345
		hillsFreq       556.471
		hillsFraction   0.148971
		hills2Fraction  0.121509
		riversMagn      70.084
		riversFreq      3.28615
		riversSin       5.32505
		riversOctaves   0
		canyonsMagn     0.404113
		canyonsFreq     1.46353
		canyonFraction  0
		cracksMagn      0.0625774
		cracksFreq      1.18216
		cracksOctaves   2
		craterMagn      0.57825
		craterFreq      13.0335
		craterDensity   0.887431
		craterOctaves   13
		craterRayedFactor 0.199228
		volcanoMagn     0.619351
		volcanoFreq     1.36479
		volcanoDensity  0.0691206
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.185897
		volcanoRadius   0.610204
		volcanoTemp     1573.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.780, 0.745, 0.680, 0.500)
		colorShelf     (0.741, 0.708, 0.646, 0.500)
		colorBeach     (0.546, 0.521, 0.476, 0.750)
		colorDesert    (0.663, 0.633, 0.578, 1.000)
		colorLowland   (0.687, 0.656, 0.598, 1.000)
		colorUpland    (0.726, 0.693, 0.632, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.687, 0.656, 0.598, 1.000)
		colorUpPlants  (0.726, 0.693, 0.632, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999954
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Pluto"
		Height          171.13
		Density         4.62607e-006
		Pressure        1.82261e-006
		Greenhouse      0.0436213
		Bright          1.35845
		Opacity         0
		SkyLight        0.452815
		Hue             0.00461519
		Saturation      1

		Composition
		{
			CH4   	60.2824
			H2    	24.408
			N2    	14.9358
			Ar    	0.304743
			CO    	0.0678363
			He    	0.00103575
			Ne    	0.000169394
			Kr    	3.59636e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.216852
		Period          0.357334
		Eccentricity    0.0240569
		Inclination     0.255456
		AscendingNode   -68.8579
		ArgOfPericenter 239.206
		MeanAnomaly     21.7256
	}
}

DwarfMoon	"5.D1"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.09745e-007
	Radius          82.488
	InertiaMoment   0.397877

	Oblateness      0.249

	Obliquity       -0.00155049
	EqAscendNode    -79.1462
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.610 0.491 0.409)

	Surface
	{
		SurfStyle       0.629966
		OceanStyle      0.390438
		Randomize      (-0.961, 0.435, -0.932)
		colorDistMagn   0.808611
		colorDistFreq   4.74688
		detailScale     2252.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.54058
		terraceProb     0.193121
		erosion         0
		montesMagn      0.463211
		montesFreq      3.14867
		montesSpiky     0.898046
		montesFraction  0.488795
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.9181
		hillsFraction   0.82974
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225073
		craterFreq      0.232185
		craterDensity   0.73574
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.2391
		volcanoTemp     1739.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.167, 0.114, 0.000)
		colorShelf     (0.244, 0.172, 0.131, 0.000)
		colorBeach     (0.287, 0.201, 0.155, 0.000)
		colorDesert    (0.311, 0.216, 0.151, 0.000)
		colorLowland   (0.341, 0.231, 0.172, 0.000)
		colorUpland    (0.378, 0.280, 0.208, 0.000)
		colorRock      (0.408, 0.305, 0.225, 0.000)
		colorSnow      (0.445, 0.324, 0.237, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   7.56454e-005
		Period          0.000925025
		Eccentricity    7.1022e-006
		Inclination     -0.00155049
		AscendingNode   -79.1462
		ArgOfPericenter 66.9006
		MeanAnomaly     -162.068
	}
}

DwarfMoon	"5.D2"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.9038e-007
	Radius          87.7568
	InertiaMoment   0.39906

	Oblateness      0.249

	Obliquity       0.0112125
	EqAscendNode    67.8397
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.539 0.432 0.317)

	Surface
	{
		SurfStyle       0.496517
		OceanStyle      0.808364
		Randomize      (-0.936, -0.168, -0.390)
		colorDistMagn   0.742085
		colorDistFreq   4.53013
		detailScale     2396.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.607841
		terraceProb     0.208019
		erosion         0
		montesMagn      0.454862
		montesFreq      3.50383
		montesSpiky     0.961701
		montesFraction  0.387738
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.7718
		hillsFraction   0.860964
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245287
		craterFreq      0.224797
		craterDensity   0.871586
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.5331
		volcanoTemp     1675.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.173, 0.127, 0.000)
		colorShelf     (0.229, 0.183, 0.135, 0.000)
		colorBeach     (0.242, 0.194, 0.142, 0.000)
		colorDesert    (0.256, 0.205, 0.150, 0.000)
		colorLowland   (0.269, 0.216, 0.158, 0.000)
		colorUpland    (0.283, 0.227, 0.166, 0.000)
		colorRock      (0.296, 0.237, 0.174, 0.000)
		colorSnow      (0.310, 0.248, 0.182, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   8.12564e-005
		Period          0.00102983
		Eccentricity    3.40436e-005
		Inclination     0.0112125
		AscendingNode   67.8397
		ArgOfPericenter -42.6858
		MeanAnomaly     84.1156
	}
}

DwarfMoon	"5.D3"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            4.04938e-007
	Radius          115.093
	InertiaMoment   0.399971

	Oblateness      0.00147854

	Obliquity       74.4729
	EqAscendNode    -43.9923
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.705 0.667 0.605)

	Surface
	{
		SurfStyle       0.387282
		OceanStyle      0.362353
		Randomize      (0.794, -0.286, 0.710)
		colorDistMagn   0.771814
		colorDistFreq   0.231331
		detailScale     3142.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.802823
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.713536
		terraceProb     0.14596
		erosion         0
		montesMagn      0.484493
		montesFreq      3.35994
		montesSpiky     0.986455
		montesFraction  0.622382
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.0355
		hillsFraction   0.680589
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260478
		craterFreq      0.458366
		craterDensity   0.753542
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.3571
		volcanoTemp     1370.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.267, 0.242, 0.000)
		colorShelf     (0.300, 0.284, 0.257, 0.000)
		colorBeach     (0.317, 0.300, 0.272, 0.000)
		colorDesert    (0.335, 0.317, 0.287, 0.000)
		colorLowland   (0.353, 0.334, 0.303, 0.000)
		colorUpland    (0.370, 0.350, 0.318, 0.000)
		colorRock      (0.388, 0.367, 0.333, 0.000)
		colorSnow      (0.405, 0.384, 0.348, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.000543014
		Period          0.0177908
		Eccentricity    0.16483
		Inclination     74.4729
		AscendingNode   -43.9923
		ArgOfPericenter 8.8599
		MeanAnomaly     -100.718
	}
}

DwarfMoon	"5.D4"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            5.69647e-007
	Radius          120.658
	InertiaMoment   0.398085

	Obliquity       -78.6011
	EqAscendNode    -115.344
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.628 0.624 0.618)

	Surface
	{
		SurfStyle       0.526759
		OceanStyle      0.584643
		Randomize      (0.803, -0.991, 0.050)
		colorDistMagn   0.885775
		colorDistFreq   3.88837
		detailScale     3294.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.892827
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.681922
		terraceProb     0.207789
		erosion         0
		montesMagn      0.343529
		montesFreq      3.75964
		montesSpiky     0.940548
		montesFraction  0.866964
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.2029
		hillsFraction   0.742138
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245113
		craterFreq      0.609578
		craterDensity   0.878585
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.0645
		volcanoTemp     1063.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.212, 0.173, 0.000)
		colorShelf     (0.251, 0.218, 0.198, 0.000)
		colorBeach     (0.295, 0.256, 0.235, 0.000)
		colorDesert    (0.320, 0.274, 0.229, 0.000)
		colorLowland   (0.352, 0.293, 0.260, 0.000)
		colorUpland    (0.389, 0.355, 0.315, 0.000)
		colorRock      (0.421, 0.387, 0.340, 0.000)
		colorSnow      (0.458, 0.412, 0.359, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.000790226
		Period          0.0312325
		Eccentricity    0.0636841
		Inclination     -78.6011
		AscendingNode   -115.344
		ArgOfPericenter -27.7985
		MeanAnomaly     147.557
	}
}

Planet	"6"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "GasGiant"

	Mass            266.359
	Radius          70368.3
	InertiaMoment   0.223311

	Oblateness      0.0904573

	RotationPeriod  8.56718
	Obliquity       12.9028
	EqAscendNode    -159.485

	AlbedoBond      0.45591
	AlbedoGeom      0.547092
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.581924
		Randomize      (-0.523, -0.897, -0.042)
		detailScale     180991
		colorConversion true
		tropicLatitude  0.224325
		icecapLatitude  1
		mainFreq        0.0206457
		venusFreq       3.93765
		venusMagn       0.320235
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      3.31663
		twistMagn       1.05581
		cycloneMagn     13.1228
		cycloneFreq     0.258774
		cycloneDensity  0.133248
		cycloneOctaves  1
		colorLayer0    (0.570, 0.550, 0.480, 1.100)
		colorLayer1    (0.850, 0.860, 0.870, 0.700)
		colorLayer2    (0.450, 0.390, 0.260, 0.200)
		colorLayer3    (0.430, 0.330, 0.170, 0.020)
		colorLayer4    (0.830, 0.830, 0.830, 0.000)
		colorLayer5    (0.510, 0.400, 0.140, 0.000)
		colorLayer6    (0.370, 0.350, 0.280, 0.000)
		colorLayer7    (0.420, 0.390, 0.310, 1.000)
		colorLowPlants (0.830, 0.830, 0.830, 0.000)
		colorUpPlants  (0.510, 0.400, 0.140, 0.000)
		BumpHeight      13.5201
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          63.1563
		BumpHeight      64.3815
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.33611
		mainOctaves     10
		Coverage        0.0590999
		twistZones      3.31663
		twistMagn       1.05581
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          261.687
		Density         9725.92
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0231252
		Saturation      0.831586

		Composition
		{
			H2    	93.3666
			He    	6.62224
			N2    	0.00998315
			Ne    	0.00119238
			O2    	2.21658e-005
		}
	}

	Aurora
	{
		Height      3207.5
		NorthLat    79.457
		NorthLon    74.4228
		NorthRadius 18285.2
		NorthWidth  10760.2
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -79.1837
		SouthLon    258.62
		SouthRadius 20189.2
		SouthWidth  10363.2
		SouthRings  4
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     78907.2
		OuterRadius     193738
		RotationPeriod  8.54478
		RotationOffset  0
		FrontBright     0.704019
		BackBright      0.719446
		Density         0.651806
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.406088
		Period          0.911188
		Eccentricity    0.0976562
		Inclination     -0.0636989
		AscendingNode   -161.418
		ArgOfPericenter 164.369
		MeanAnomaly     55.5616
	}
}

DwarfMoon	"6.D1"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            8.92794e-011
	Radius          6.38734
	InertiaMoment   0.396943

	Oblateness      0.249

	Obliquity       0.000809214
	EqAscendNode    145.561
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.559 0.556 0.554)

	Surface
	{
		SurfStyle       0.880876
		OceanStyle      0.638798
		Randomize      (-0.328, -0.667, -0.128)
		colorDistMagn   0.490795
		colorDistFreq   0.0144762
		detailScale     174.417
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.580584
		terraceProb     0.256145
		erosion         0
		montesMagn      0.538798
		montesFreq      3.31381
		montesSpiky     0.852635
		montesFraction  0.575806
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.100085
		hillsFraction   0.537488
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251301
		craterFreq      0.214823
		craterDensity   0.959513
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   105.986
		volcanoTemp     1653.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.195, 0.222, 0.050)
		colorShelf     (0.223, 0.228, 0.255, 0.040)
		colorBeach     (0.257, 0.261, 0.288, 0.030)
		colorDesert    (0.290, 0.295, 0.327, 0.020)
		colorLowland   (0.324, 0.328, 0.360, 0.030)
		colorUpland    (0.358, 0.361, 0.393, 0.050)
		colorRock      (0.391, 0.395, 0.438, 0.020)
		colorSnow      (0.391, 0.395, 0.438, 1.000)
		BumpHeight      5.7486
		BumpOffset      1.14972
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.000880571
		Period          0.000925961
		Eccentricity    2.76931e-005
		Inclination     0.000809214
		AscendingNode   145.561
		ArgOfPericenter -105.511
		MeanAnomaly     79.035
	}
}

DwarfMoon	"6.D2"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.46003e-010
	Radius          7.22882
	InertiaMoment   0.398575

	Oblateness      0.249

	Obliquity       0.00227924
	EqAscendNode    11.049
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.454 0.450 0.443)

	Surface
	{
		SurfStyle       0.972973
		OceanStyle      0.275119
		Randomize      (0.275, -0.162, 0.468)
		colorDistMagn   0.176988
		colorDistFreq   0.0305791
		detailScale     197.395
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57625
		terraceProb     0.143606
		erosion         0
		montesMagn      0.526157
		montesFreq      2.2328
		montesSpiky     0.942098
		montesFraction  0.761708
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.110804
		hillsFraction   0.530338
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267552
		craterFreq      0.235606
		craterDensity   0.922983
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   93.7978
		volcanoTemp     1681.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.154, 0.158, 0.177, 0.050)
		colorShelf     (0.182, 0.185, 0.204, 0.040)
		colorBeach     (0.209, 0.212, 0.230, 0.030)
		colorDesert    (0.236, 0.239, 0.261, 0.020)
		colorLowland   (0.263, 0.266, 0.288, 0.030)
		colorUpland    (0.291, 0.293, 0.315, 0.050)
		colorRock      (0.318, 0.320, 0.350, 0.020)
		colorSnow      (0.318, 0.320, 0.350, 1.000)
		BumpHeight      6.50593
		BumpOffset      1.30119
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.000909014
		Period          0.000971186
		Eccentricity    6.57747e-005
		Inclination     0.00227924
		AscendingNode   11.049
		ArgOfPericenter 162.12
		MeanAnomaly     122.694
	}
}

DwarfMoon	"6.D3"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.30222e-010
	Radius          7.95205
	InertiaMoment   0.399561

	Oblateness      0.249

	Obliquity       -0.000100093
	EqAscendNode    -106.897
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.734 0.733 0.731)

	Surface
	{
		SurfStyle       0.627176
		OceanStyle      0.948975
		Randomize      (0.867, -0.138, 0.675)
		colorDistMagn   0.0972326
		colorDistFreq   0.0253985
		detailScale     217.144
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496927
		terraceProb     0.381314
		erosion         0
		montesMagn      0.449772
		montesFreq      3.25274
		montesSpiky     0.80045
		montesFraction  0.463765
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.15118
		hillsFraction   0.796581
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219973
		craterFreq      0.254257
		craterDensity   0.898278
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   82.1696
		volcanoTemp     1336.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.249, 0.205, 0.000)
		colorShelf     (0.294, 0.256, 0.234, 0.000)
		colorBeach     (0.345, 0.300, 0.278, 0.000)
		colorDesert    (0.375, 0.322, 0.271, 0.000)
		colorLowland   (0.411, 0.344, 0.307, 0.000)
		colorUpland    (0.455, 0.418, 0.373, 0.000)
		colorRock      (0.492, 0.454, 0.402, 0.000)
		colorSnow      (0.536, 0.484, 0.424, 1.000)
		BumpHeight      7.15685
		BumpOffset      1.43137
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.000940661
		Period          0.00102234
		Eccentricity    1.54743e-005
		Inclination     -0.000100093
		AscendingNode   -106.897
		ArgOfPericenter 79.3265
		MeanAnomaly     157.779
	}
}

DwarfMoon	"6.D4"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.52679e-010
	Radius          10.7205
	InertiaMoment   0.397295

	Oblateness      0.249

	Obliquity       -0.0110724
	EqAscendNode    -123.52
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.676 0.673 0.669)

	Surface
	{
		SurfStyle       0.0413505
		OceanStyle      0.108417
		Randomize      (0.157, 0.932, -0.877)
		colorDistMagn   0.2746
		colorDistFreq   0.0792938
		detailScale     292.742
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.287482
		terraceProb     0.283095
		erosion         0
		montesMagn      0.469901
		montesFreq      3.34226
		montesSpiky     0.933358
		montesFraction  0.494318
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.213193
		hillsFraction   0.672027
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215473
		craterFreq      0.257142
		craterDensity   0.866767
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   89.502
		volcanoTemp     1793.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.269, 0.268, 0.000)
		colorShelf     (0.287, 0.286, 0.284, 0.000)
		colorBeach     (0.304, 0.303, 0.301, 0.000)
		colorDesert    (0.321, 0.320, 0.318, 0.000)
		colorLowland   (0.338, 0.336, 0.335, 0.000)
		colorUpland    (0.355, 0.353, 0.351, 0.000)
		colorRock      (0.372, 0.370, 0.368, 0.000)
		colorSnow      (0.389, 0.387, 0.385, 1.000)
		BumpHeight      9.64848
		BumpOffset      1.9297
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00095978
		Period          0.00105367
		Eccentricity    1.71474e-005
		Inclination     -0.0110724
		AscendingNode   -123.52
		ArgOfPericenter -40.2801
		MeanAnomaly     119.973
	}
}

DwarfMoon	"6.D5"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            5.27793e-010
	Radius          11.6186
	InertiaMoment   0.398732

	Oblateness      0.249

	Obliquity       -0.0065043
	EqAscendNode    63.4557
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.508 0.412)

	Surface
	{
		SurfStyle       0.336846
		OceanStyle      0.00451185
		Randomize      (-0.585, -0.315, 0.136)
		colorDistMagn   0.657137
		colorDistFreq   0.0874554
		detailScale     317.265
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533232
		terraceProb     0.150634
		erosion         0
		montesMagn      0.441676
		montesFreq      3.5188
		montesSpiky     0.817786
		montesFraction  0.616487
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.391195
		hillsFraction   0.582307
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239351
		craterFreq      0.224936
		craterDensity   1.01153
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   79.2917
		volcanoTemp     1557.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.203, 0.165, 0.000)
		colorShelf     (0.284, 0.216, 0.175, 0.000)
		colorBeach     (0.301, 0.228, 0.185, 0.000)
		colorDesert    (0.318, 0.241, 0.196, 0.000)
		colorLowland   (0.334, 0.254, 0.206, 0.000)
		colorUpland    (0.351, 0.267, 0.216, 0.000)
		colorRock      (0.368, 0.279, 0.227, 0.000)
		colorSnow      (0.385, 0.292, 0.237, 1.000)
		BumpHeight      10.4567
		BumpOffset      2.09135
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.000984175
		Period          0.00109409
		Eccentricity    8.92329e-005
		Inclination     -0.0065043
		AscendingNode   63.4557
		ArgOfPericenter -139.822
		MeanAnomaly     6.55655
	}
}

DwarfMoon	"6.D6"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            7.74875e-010
	Radius          12.683
	InertiaMoment   0.399688

	Oblateness      0.249

	Obliquity       -0.0116884
	EqAscendNode    73.2443
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.750 0.633 0.560)

	Surface
	{
		SurfStyle       0.436357
		OceanStyle      0.576748
		Randomize      (0.619, 0.446, -0.123)
		colorDistMagn   0.318207
		colorDistFreq   0.0591968
		detailScale     346.331
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.719977
		terraceProb     0.12362
		erosion         0
		montesMagn      0.460792
		montesFreq      3.63314
		montesSpiky     0.840911
		montesFraction  0.362493
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.296914
		hillsFraction   0.595534
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237949
		craterFreq      0.214089
		craterDensity   0.86666
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   71.4352
		volcanoTemp     1656.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.253, 0.224, 0.000)
		colorShelf     (0.319, 0.269, 0.238, 0.000)
		colorBeach     (0.337, 0.285, 0.252, 0.000)
		colorDesert    (0.356, 0.301, 0.266, 0.000)
		colorLowland   (0.375, 0.316, 0.280, 0.000)
		colorUpland    (0.394, 0.332, 0.294, 0.000)
		colorRock      (0.412, 0.348, 0.308, 0.000)
		colorSnow      (0.431, 0.364, 0.322, 1.000)
		BumpHeight      11.4147
		BumpOffset      2.28294
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.000999864
		Period          0.00112036
		Eccentricity    7.50623e-005
		Inclination     -0.0116884
		AscendingNode   73.2443
		ArgOfPericenter -118.64
		MeanAnomaly     -146.577
	}
}

DwarfMoon	"6.D7"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.11975e-009
	Radius          13.6369
	InertiaMoment   0.397579

	Oblateness      0.214319

	Obliquity       -0.0114214
	EqAscendNode    -122.069
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.765 0.761 0.759)

	Surface
	{
		SurfStyle       0.934522
		OceanStyle      0.809787
		Randomize      (0.077, -0.208, -0.683)
		colorDistMagn   0.324364
		colorDistFreq   0.123215
		detailScale     372.379
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536387
		terraceProb     0.45221
		erosion         0
		montesMagn      0.594374
		montesFreq      2.50719
		montesSpiky     0.846293
		montesFraction  0.493163
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.437184
		hillsFraction   0.903953
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251344
		craterFreq      0.277561
		craterDensity   0.989728
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.8943
		volcanoTemp     1518.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.266, 0.304, 0.050)
		colorShelf     (0.306, 0.312, 0.349, 0.040)
		colorBeach     (0.352, 0.358, 0.395, 0.030)
		colorDesert    (0.398, 0.403, 0.448, 0.020)
		colorLowland   (0.444, 0.449, 0.494, 0.030)
		colorUpland    (0.490, 0.495, 0.539, 0.050)
		colorRock      (0.535, 0.540, 0.600, 0.020)
		colorSnow      (0.535, 0.540, 0.600, 1.000)
		BumpHeight      12.2732
		BumpOffset      2.45465
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00101208
		Period          0.00114096
		Eccentricity    7.86354e-005
		Inclination     -0.0114214
		AscendingNode   -122.069
		ArgOfPericenter 163.505
		MeanAnomaly     107.701
	}
}

DwarfMoon	"6.D8"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.59691e-009
	Radius          17.9427
	InertiaMoment   0.398881

	Oblateness      0.249

	Obliquity       -0.00198308
	EqAscendNode    47.6079
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.663 0.657 0.654)

	Surface
	{
		SurfStyle       0.726291
		OceanStyle      0.730142
		Randomize      (0.491, 0.090, 0.744)
		colorDistMagn   0.490834
		colorDistFreq   0.0599928
		detailScale     489.955
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.337746
		terraceProb     0.285114
		erosion         0
		montesMagn      0.415463
		montesFreq      3.2188
		montesSpiky     0.948196
		montesFraction  0.559824
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.835858
		hillsFraction   0.523423
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246309
		craterFreq      0.257114
		craterDensity   0.875053
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   70.397
		volcanoTemp     1873.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.223, 0.183, 0.000)
		colorShelf     (0.265, 0.230, 0.209, 0.000)
		colorBeach     (0.312, 0.269, 0.248, 0.000)
		colorDesert    (0.338, 0.289, 0.242, 0.000)
		colorLowland   (0.371, 0.309, 0.275, 0.000)
		colorUpland    (0.411, 0.374, 0.333, 0.000)
		colorRock      (0.444, 0.407, 0.360, 0.000)
		colorSnow      (0.484, 0.433, 0.379, 1.000)
		BumpHeight      16.1484
		BumpOffset      3.22969
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00102264
		Period          0.00115886
		Eccentricity    6.83033e-006
		Inclination     -0.00198308
		AscendingNode   47.6079
		ArgOfPericenter -12.7893
		MeanAnomaly     -46.5091
	}
}

DwarfMoon	"6.D9"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.25246e-009
	Radius          18.9631
	InertiaMoment   0.399814

	Oblateness      0.249

	Obliquity       -0.00515144
	EqAscendNode    -120.052
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.731 0.674 0.643)

	Surface
	{
		SurfStyle       0.893386
		OceanStyle      0.0260343
		Randomize      (0.099, -0.735, -0.301)
		colorDistMagn   0.747278
		colorDistFreq   0.265527
		detailScale     517.819
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.473708
		terraceProb     0.465948
		erosion         0
		montesMagn      0.598416
		montesFreq      2.71252
		montesSpiky     0.998861
		montesFraction  0.463503
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.03296
		hillsFraction   0.740495
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246445
		craterFreq      0.205636
		craterDensity   0.885804
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   62.645
		volcanoTemp     1373.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.236, 0.257, 0.050)
		colorShelf     (0.292, 0.276, 0.296, 0.040)
		colorBeach     (0.336, 0.317, 0.335, 0.030)
		colorDesert    (0.380, 0.357, 0.380, 0.020)
		colorLowland   (0.424, 0.398, 0.418, 0.030)
		colorUpland    (0.468, 0.438, 0.457, 0.050)
		colorRock      (0.512, 0.479, 0.508, 0.020)
		colorSnow      (0.512, 0.479, 0.508, 1.000)
		BumpHeight      17.0668
		BumpOffset      3.41336
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00106129
		Period          0.00122518
		Eccentricity    1.84269e-005
		Inclination     -0.00515144
		AscendingNode   -120.052
		ArgOfPericenter 57.9591
		MeanAnomaly     161.173
	}
}

DwarfMoon	"6.D10"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.14807e-009
	Radius          20.3534
	InertiaMoment   0.397821

	Oblateness      0.197736

	Obliquity       -0.0111962
	EqAscendNode    -60.8368
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.519 0.470 0.376)

	Surface
	{
		SurfStyle       0.483817
		OceanStyle      0.78758
		Randomize      (-0.255, -0.188, -0.777)
		colorDistMagn   0.287812
		colorDistFreq   0.156476
		detailScale     555.783
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.680111
		terraceProb     0.263957
		erosion         0
		montesMagn      0.482934
		montesFreq      3.27952
		montesSpiky     0.995359
		montesFraction  0.721932
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.974345
		hillsFraction   0.748472
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233393
		craterFreq      0.244567
		craterDensity   0.741752
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   56.8749
		volcanoTemp     1697.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.188, 0.150, 0.000)
		colorShelf     (0.221, 0.200, 0.160, 0.000)
		colorBeach     (0.234, 0.211, 0.169, 0.000)
		colorDesert    (0.246, 0.223, 0.178, 0.000)
		colorLowland   (0.259, 0.235, 0.188, 0.000)
		colorUpland    (0.272, 0.247, 0.197, 0.000)
		colorRock      (0.285, 0.258, 0.207, 0.000)
		colorSnow      (0.298, 0.270, 0.216, 1.000)
		BumpHeight      18.3181
		BumpOffset      3.66361
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00109972
		Period          0.00129233
		Eccentricity    6.87002e-005
		Inclination     -0.0111962
		AscendingNode   -60.8368
		ArgOfPericenter 136.976
		MeanAnomaly     177.229
	}
}

DwarfMoon	"6.D11"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            4.36633e-009
	Radius          21.6702
	InertiaMoment   0.399025

	Oblateness      0.0388854

	Obliquity       0.831832
	EqAscendNode    -158.047
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.593 0.590 0.588)

	Surface
	{
		SurfStyle       0.027761
		OceanStyle      0.188188
		Randomize      (-0.007, 0.484, 0.706)
		colorDistMagn   0.206831
		colorDistFreq   0.231233
		detailScale     591.742
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00552425
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.569502
		terraceProb     0.37536
		erosion         0
		montesMagn      0.585644
		montesFreq      3.50257
		montesSpiky     0.902492
		montesFraction  0.50252
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.26833
		hillsFraction   0.466953
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237554
		craterFreq      0.187527
		craterDensity   0.840262
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.4175
		volcanoTemp     1244.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.236, 0.235, 0.000)
		colorShelf     (0.252, 0.251, 0.250, 0.000)
		colorBeach     (0.267, 0.265, 0.265, 0.000)
		colorDesert    (0.282, 0.280, 0.279, 0.000)
		colorLowland   (0.296, 0.295, 0.294, 0.000)
		colorUpland    (0.311, 0.310, 0.309, 0.000)
		colorRock      (0.326, 0.324, 0.324, 0.000)
		colorSnow      (0.341, 0.339, 0.338, 1.000)
		BumpHeight      19.5032
		BumpOffset      3.90064
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00180817
		Period          0.00272462
		Eccentricity    0.00121406
		Inclination     0.831832
		AscendingNode   -158.047
		ArgOfPericenter -0.746694
		MeanAnomaly     93.3658
	}
}

DwarfMoon	"6.D12"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            6.01816e-009
	Radius          28.3205
	InertiaMoment   0.399939

	Obliquity       -6.92751
	EqAscendNode    138.868
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.770 0.681 0.646)

	Surface
	{
		SurfStyle       0.566838
		OceanStyle      0.00218297
		Randomize      (0.395, 0.384, -0.139)
		colorDistMagn   0.621988
		colorDistFreq   0.211248
		detailScale     773.339
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0846643
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.573271
		terraceProb     0.532451
		erosion         0
		montesMagn      0.69637
		montesFreq      2.71365
		montesSpiky     0.968621
		montesFraction  0.718155
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.87654
		hillsFraction   0.369058
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253974
		craterFreq      0.256257
		craterDensity   1.00346
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.2368
		volcanoTemp     1492.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.232, 0.181, 0.000)
		colorShelf     (0.308, 0.238, 0.207, 0.000)
		colorBeach     (0.362, 0.279, 0.245, 0.000)
		colorDesert    (0.393, 0.300, 0.239, 0.000)
		colorLowland   (0.431, 0.320, 0.271, 0.000)
		colorUpland    (0.477, 0.388, 0.329, 0.000)
		colorRock      (0.516, 0.422, 0.355, 0.000)
		colorSnow      (0.562, 0.450, 0.374, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0109372
		Period          0.0405327
		Eccentricity    0.268389
		Inclination     -6.92751
		AscendingNode   138.868
		ArgOfPericenter -115.518
		MeanAnomaly     -138.837
	}
}

DwarfMoon	"6.D13"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            8.25287e-009
	Radius          29.4243
	InertiaMoment   0.398034

	RotationPeriod  246.593
	Obliquity       -31.7228
	EqAscendNode    -154.844

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.754 0.707 0.637)

	Surface
	{
		SurfStyle       0.669151
		OceanStyle      0.242359
		Randomize      (-0.881, -0.102, 0.495)
		colorDistMagn   0.189023
		colorDistFreq   0.573448
		detailScale     803.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0.227501
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.586423
		terraceProb     0.314859
		erosion         0
		montesMagn      0.478203
		montesFreq      2.85675
		montesSpiky     0.971956
		montesFraction  0.350718
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.08501
		hillsFraction   0.730442
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248196
		craterFreq      0.180951
		craterDensity   1.01928
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   50.782
		volcanoTemp     1084.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.240, 0.178, 0.000)
		colorShelf     (0.302, 0.248, 0.204, 0.000)
		colorBeach     (0.354, 0.290, 0.242, 0.000)
		colorDesert    (0.384, 0.311, 0.236, 0.000)
		colorLowland   (0.422, 0.332, 0.267, 0.000)
		colorUpland    (0.467, 0.403, 0.325, 0.000)
		colorRock      (0.505, 0.438, 0.350, 0.000)
		colorSnow      (0.550, 0.467, 0.369, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0112345
		Period          0.0421968
		Eccentricity    0.443649
		Inclination     -31.7228
		AscendingNode   -154.844
		ArgOfPericenter 174.344
		MeanAnomaly     -57.2202
	}
}

DwarfMoon	"6.D14"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.12723e-008
	Radius          31.3141
	InertiaMoment   0.399163

	Obliquity       6.45348
	EqAscendNode    120.164
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.714 0.710 0.707)

	Surface
	{
		SurfStyle       0.980251
		OceanStyle      0.19511
		Randomize      (-0.644, -0.361, -0.882)
		colorDistMagn   0.774959
		colorDistFreq   0.506352
		detailScale     855.082
		colorConversion true
		snowLevel       2
		tropicLatitude  0.111942
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.312422
		terraceProb     0.404735
		erosion         0
		montesMagn      0.357871
		montesFreq      2.76179
		montesSpiky     0.947755
		montesFraction  0.514975
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.60424
		hillsFraction   0.825235
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236156
		craterFreq      0.254957
		craterDensity   1.0119
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.2423
		volcanoTemp     1566.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.248, 0.283, 0.050)
		colorShelf     (0.286, 0.291, 0.325, 0.040)
		colorBeach     (0.329, 0.334, 0.367, 0.030)
		colorDesert    (0.371, 0.376, 0.417, 0.020)
		colorLowland   (0.414, 0.419, 0.459, 0.030)
		colorUpland    (0.457, 0.461, 0.502, 0.050)
		colorRock      (0.500, 0.504, 0.558, 0.020)
		colorSnow      (0.500, 0.504, 0.558, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0118342
		Period          0.0456198
		Eccentricity    0.218797
		Inclination     6.45348
		AscendingNode   120.164
		ArgOfPericenter -170.983
		MeanAnomaly     -37.0315
	}
}

DwarfMoon	"6.D15"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.53503e-008
	Radius          33.2208
	InertiaMoment   0.395535

	RotationPeriod  1667.09
	Obliquity       17.4571
	EqAscendNode    -116.654

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.759 0.755 0.753)

	Surface
	{
		SurfStyle       0.909912
		OceanStyle      0.236102
		Randomize      (-0.277, -0.066, -0.919)
		colorDistMagn   0.949812
		colorDistFreq   0.312647
		detailScale     907.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.311099
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.407464
		terraceProb     0.139304
		erosion         0
		montesMagn      0.472188
		montesFreq      3.06155
		montesSpiky     0.977904
		montesFraction  0.631923
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.06204
		hillsFraction   0.538732
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247374
		craterFreq      0.232056
		craterDensity   0.913919
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.0395
		volcanoTemp     1490.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.264, 0.301, 0.050)
		colorShelf     (0.304, 0.310, 0.346, 0.040)
		colorBeach     (0.349, 0.355, 0.391, 0.030)
		colorDesert    (0.395, 0.400, 0.444, 0.020)
		colorLowland   (0.440, 0.446, 0.489, 0.030)
		colorUpland    (0.486, 0.491, 0.534, 0.050)
		colorRock      (0.531, 0.536, 0.595, 0.020)
		colorSnow      (0.531, 0.536, 0.595, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0121648
		Period          0.0475451
		Eccentricity    0.25676
		Inclination     17.4571
		AscendingNode   -116.654
		ArgOfPericenter 13.7265
		MeanAnomaly     -152.6
	}
}

DwarfMoon	"6.D16"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.08604e-008
	Radius          43.6678
	InertiaMoment   0.398228

	RotationPeriod  658.275
	Obliquity       -83.4376
	EqAscendNode    -106.707

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.809 0.694 0.648)

	Surface
	{
		SurfStyle       0.779652
		OceanStyle      0.139446
		Randomize      (0.522, -0.124, 0.704)
		colorDistMagn   0.786098
		colorDistFreq   0.730953
		detailScale     1192.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.954944
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.756818
		terraceProb     0.44915
		erosion         0
		montesMagn      0.448787
		montesFreq      3.12679
		montesSpiky     0.9519
		montesFraction  0.577235
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.27735
		hillsFraction   0.584883
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261163
		craterFreq      0.217557
		craterDensity   1.09238
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.4029
		volcanoTemp     1396.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.236, 0.182, 0.000)
		colorShelf     (0.324, 0.243, 0.207, 0.000)
		colorBeach     (0.380, 0.285, 0.246, 0.000)
		colorDesert    (0.412, 0.306, 0.240, 0.000)
		colorLowland   (0.453, 0.326, 0.272, 0.000)
		colorUpland    (0.501, 0.396, 0.331, 0.000)
		colorRock      (0.542, 0.431, 0.357, 0.000)
		colorSnow      (0.590, 0.458, 0.376, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0125908
		Period          0.0500638
		Eccentricity    0.354056
		Inclination     -83.4376
		AscendingNode   -106.707
		ArgOfPericenter 147.464
		MeanAnomaly     91.4181
	}
}

DwarfMoon	"6.D17"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.83151e-008
	Radius          44.684
	InertiaMoment   0.399298

	RotationPeriod  945.271
	Obliquity       61.275
	EqAscendNode    -131.667

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.694 0.692 0.689)

	Surface
	{
		SurfStyle       0.896632
		OceanStyle      0.365685
		Randomize      (-0.378, 0.223, 0.230)
		colorDistMagn   0.114934
		colorDistFreq   1.24151
		detailScale     1220.17
		colorConversion true
		snowLevel       2
		tropicLatitude  0.670151
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.382916
		terraceProb     0.352252
		erosion         0
		montesMagn      0.647909
		montesFreq      2.71379
		montesSpiky     0.914966
		montesFraction  0.787049
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.90706
		hillsFraction   0.539784
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230053
		craterFreq      0.24885
		craterDensity   0.784344
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.634
		volcanoTemp     1578.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.242, 0.276, 0.050)
		colorShelf     (0.278, 0.284, 0.317, 0.040)
		colorBeach     (0.319, 0.325, 0.358, 0.030)
		colorDesert    (0.361, 0.367, 0.407, 0.020)
		colorLowland   (0.403, 0.409, 0.448, 0.030)
		colorUpland    (0.444, 0.450, 0.489, 0.050)
		colorRock      (0.486, 0.492, 0.545, 0.020)
		colorSnow      (0.486, 0.492, 0.545, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0132289
		Period          0.053918
		Eccentricity    0.392248
		Inclination     61.275
		AscendingNode   -131.667
		ArgOfPericenter -48.7933
		MeanAnomaly     129.908
	}
}

DwarfMoon	"6.D18"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.84219e-008
	Radius          47.3912
	InertiaMoment   0.396444

	RotationPeriod  337.421
	Obliquity       -62.3622
	EqAscendNode    4.35375

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.522 0.514 0.508)

	Surface
	{
		SurfStyle       0.756365
		OceanStyle      0.0935227
		Randomize      (0.574, 0.628, 0.188)
		colorDistMagn   0.63441
		colorDistFreq   0.444665
		detailScale     1294.1
		colorConversion true
		snowLevel       2
		tropicLatitude  0.823466
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.4013
		terraceProb     0.212511
		erosion         0
		montesMagn      0.479975
		montesFreq      3.03215
		montesSpiky     0.925192
		montesFraction  0.682835
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.73494
		hillsFraction   0.622212
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256491
		craterFreq      0.262307
		craterDensity   0.844422
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.9066
		volcanoTemp     1638.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.175, 0.142, 0.000)
		colorShelf     (0.209, 0.180, 0.163, 0.000)
		colorBeach     (0.245, 0.211, 0.193, 0.000)
		colorDesert    (0.266, 0.226, 0.188, 0.000)
		colorLowland   (0.292, 0.242, 0.213, 0.000)
		colorUpland    (0.324, 0.293, 0.259, 0.000)
		colorRock      (0.350, 0.319, 0.279, 0.000)
		colorSnow      (0.381, 0.339, 0.295, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0138468
		Period          0.0577392
		Eccentricity    0.453785
		Inclination     -62.3622
		AscendingNode   4.35375
		ArgOfPericenter 72.4477
		MeanAnomaly     -153.446
	}
}

DwarfMoon	"6.D19"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            5.21648e-008
	Radius          50.3116
	InertiaMoment   0.398406

	Obliquity       -74.2329
	EqAscendNode    84.135
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.781 0.729 0.703)

	Surface
	{
		SurfStyle       0.0546706
		OceanStyle      0.776982
		Randomize      (-0.241, -0.930, 0.924)
		colorDistMagn   0.834054
		colorDistFreq   0.338596
		detailScale     1373.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999784
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.677325
		terraceProb     0.177001
		erosion         0
		montesMagn      0.317513
		montesFreq      2.65885
		montesSpiky     0.913287
		montesFraction  0.428059
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.37989
		hillsFraction   0.514388
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25857
		craterFreq      0.19211
		craterDensity   0.880363
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.5371
		volcanoTemp     1848.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.291, 0.281, 0.000)
		colorShelf     (0.332, 0.310, 0.299, 0.000)
		colorBeach     (0.352, 0.328, 0.316, 0.000)
		colorDesert    (0.371, 0.346, 0.334, 0.000)
		colorLowland   (0.391, 0.364, 0.352, 0.000)
		colorUpland    (0.410, 0.383, 0.369, 0.000)
		colorRock      (0.430, 0.401, 0.387, 0.000)
		colorSnow      (0.449, 0.419, 0.404, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0143846
		Period          0.0611355
		Eccentricity    0.490422
		Inclination     -74.2329
		AscendingNode   84.135
		ArgOfPericenter -114.623
		MeanAnomaly     -125.79
	}
}

DwarfMoon	"6.D20"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            7.0924e-008
	Radius          67.5728
	InertiaMoment   0.399429

	Obliquity       83.2883
	EqAscendNode    6.0375
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.840 0.793 0.752)

	Surface
	{
		SurfStyle       0.991813
		OceanStyle      0.815334
		Randomize      (0.758, -0.843, -0.931)
		colorDistMagn   0.68289
		colorDistFreq   2.6234
		detailScale     1845.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.253977
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.372176
		terraceProb     0.403811
		erosion         0
		montesMagn      0.300614
		montesFreq      2.40141
		montesSpiky     0.938732
		montesFraction  0.255265
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.9654
		hillsFraction   0.592313
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220513
		craterFreq      0.201872
		craterDensity   0.908895
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   39.7815
		volcanoTemp     1562.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.278, 0.301, 0.050)
		colorShelf     (0.336, 0.325, 0.346, 0.040)
		colorBeach     (0.386, 0.373, 0.391, 0.030)
		colorDesert    (0.437, 0.420, 0.443, 0.020)
		colorLowland   (0.487, 0.468, 0.488, 0.030)
		colorUpland    (0.537, 0.516, 0.534, 0.050)
		colorRock      (0.588, 0.563, 0.594, 0.020)
		colorSnow      (0.588, 0.563, 0.594, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0145872
		Period          0.0624315
		Eccentricity    0.27948
		Inclination     83.2883
		AscendingNode   6.0375
		ArgOfPericenter 126.689
		MeanAnomaly     -103.053
	}
}

DwarfMoon	"6.D21"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            9.66532e-008
	Radius          67.7742
	InertiaMoment   0.396934

	Obliquity       -58.125
	EqAscendNode    -77.5511
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.539 0.535 0.530)

	Surface
	{
		SurfStyle       0.188817
		OceanStyle      0.841782
		Randomize      (0.798, -0.988, 0.197)
		colorDistMagn   0.633171
		colorDistFreq   2.74502
		detailScale     1850.69
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992357
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.405236
		terraceProb     0.2544
		erosion         0
		montesMagn      0.403944
		montesFreq      3.18751
		montesSpiky     0.943701
		montesFraction  0.810936
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.1478
		hillsFraction   0.473981
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209413
		craterFreq      0.279776
		craterDensity   0.723711
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.1792
		volcanoTemp     1530.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.214, 0.212, 0.000)
		colorShelf     (0.229, 0.228, 0.225, 0.000)
		colorBeach     (0.243, 0.241, 0.239, 0.000)
		colorDesert    (0.256, 0.254, 0.252, 0.000)
		colorLowland   (0.270, 0.268, 0.265, 0.000)
		colorUpland    (0.283, 0.281, 0.278, 0.000)
		colorRock      (0.297, 0.294, 0.292, 0.000)
		colorSnow      (0.310, 0.308, 0.305, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0151683
		Period          0.0661993
		Eccentricity    0.096512
		Inclination     -58.125
		AscendingNode   -77.5511
		ArgOfPericenter -132.84
		MeanAnomaly     -39.7697
	}
}

DwarfMoon	"6.D22"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.32147e-007
	Radius          71.9399
	InertiaMoment   0.398572

	RotationPeriod  1812.9
	Obliquity       37.8261
	EqAscendNode    61.2793

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.759 0.729 0.697)

	Surface
	{
		SurfStyle       0.10068
		OceanStyle      0.398497
		Randomize      (-0.581, 0.370, 0.670)
		colorDistMagn   0.412845
		colorDistFreq   0.325126
		detailScale     1964.44
		colorConversion true
		snowLevel       2
		tropicLatitude  0.896435
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.720789
		terraceProb     0.492522
		erosion         0
		montesMagn      0.36898
		montesFreq      2.69943
		montesSpiky     0.77961
		montesFraction  0.400423
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.0094
		hillsFraction   0.489609
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218955
		craterFreq      0.174401
		craterDensity   0.860647
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.0276
		volcanoTemp     1499.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.292, 0.279, 0.000)
		colorShelf     (0.322, 0.310, 0.296, 0.000)
		colorBeach     (0.341, 0.328, 0.313, 0.000)
		colorDesert    (0.360, 0.346, 0.331, 0.000)
		colorLowland   (0.379, 0.364, 0.348, 0.000)
		colorUpland    (0.398, 0.383, 0.366, 0.000)
		colorRock      (0.417, 0.401, 0.383, 0.000)
		colorSnow      (0.436, 0.419, 0.401, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0155839
		Period          0.0689383
		Eccentricity    0.123573
		Inclination     37.8261
		AscendingNode   61.2793
		ArgOfPericenter -157.618
		MeanAnomaly     57.7923
	}
}

DwarfMoon	"6.D23"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.81451e-007
	Radius          76.7446
	InertiaMoment   0.399558

	RotationPeriod  1262.36
	Obliquity       -42.7595
	EqAscendNode    77.5716

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.788 0.783 0.782)

	Surface
	{
		SurfStyle       0.695045
		OceanStyle      0.901819
		Randomize      (0.584, 0.542, -0.566)
		colorDistMagn   0.537106
		colorDistFreq   2.87409
		detailScale     2095.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.898065
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.44677
		terraceProb     0.207821
		erosion         0
		montesMagn      0.554851
		montesFreq      2.43336
		montesSpiky     0.949111
		montesFraction  0.26087
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.3055
		hillsFraction   0.626449
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239765
		craterFreq      0.166018
		craterDensity   0.987168
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.2471
		volcanoTemp     1738.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.266, 0.219, 0.000)
		colorShelf     (0.315, 0.274, 0.250, 0.000)
		colorBeach     (0.370, 0.321, 0.297, 0.000)
		colorDesert    (0.402, 0.345, 0.289, 0.000)
		colorLowland   (0.441, 0.368, 0.328, 0.000)
		colorUpland    (0.488, 0.446, 0.399, 0.000)
		colorRock      (0.528, 0.486, 0.430, 0.000)
		colorSnow      (0.575, 0.517, 0.453, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0160426
		Period          0.0720045
		Eccentricity    0.177726
		Inclination     -42.7595
		AscendingNode   77.5716
		ArgOfPericenter -80.1814
		MeanAnomaly     -150.558
	}
}

DwarfMoon	"6.D24"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.50497e-007
	Radius          111.071
	InertiaMoment   0.397288

	Obliquity       72.2028
	EqAscendNode    135.543
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.589 0.586 0.584)

	Surface
	{
		SurfStyle       0.909095
		OceanStyle      0.818065
		Randomize      (0.329, 0.936, -0.635)
		colorDistMagn   0.405059
		colorDistFreq   9.50252
		detailScale     3032.98
		colorConversion true
		snowLevel       2
		tropicLatitude  0.672045
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.676202
		terraceProb     0.34947
		erosion         0
		montesMagn      0.495047
		montesFreq      2.96111
		montesSpiky     0.902801
		montesFraction  0.255929
		dunesFraction   0
		hillsMagn       0
		hillsFreq       30.7474
		hillsFraction   0.466997
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230852
		craterFreq      0.381569
		craterDensity   0.925143
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.7941
		volcanoTemp     1527.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.205, 0.233, 0.050)
		colorShelf     (0.235, 0.240, 0.269, 0.040)
		colorBeach     (0.271, 0.275, 0.304, 0.030)
		colorDesert    (0.306, 0.311, 0.344, 0.020)
		colorLowland   (0.341, 0.346, 0.379, 0.030)
		colorUpland    (0.377, 0.381, 0.414, 0.050)
		colorRock      (0.412, 0.416, 0.461, 0.020)
		colorSnow      (0.412, 0.416, 0.461, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0166733
		Period          0.0762917
		Eccentricity    0.037102
		Inclination     72.2028
		AscendingNode   135.543
		ArgOfPericenter -88.827
		MeanAnomaly     -150.293
	}
}

DwarfMoon	"6.D25"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.4812e-007
	Radius          104.717
	InertiaMoment   0.398729

	Obliquity       16.675
	EqAscendNode    -86.6405
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.593 0.591 0.589)

	Surface
	{
		SurfStyle       0.197455
		OceanStyle      0.00117316
		Randomize      (0.210, -0.182, -0.616)
		colorDistMagn   0.440607
		colorDistFreq   6.35604
		detailScale     2859.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.408319
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.459912
		terraceProb     0.167879
		erosion         0
		montesMagn      0.549437
		montesFreq      3.07384
		montesSpiky     0.815649
		montesFraction  0.407899
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.5551
		hillsFraction   0.674936
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242215
		craterFreq      0.337663
		craterDensity   1.0115
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.8265
		volcanoTemp     1745.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.236, 0.235, 0.000)
		colorShelf     (0.252, 0.251, 0.250, 0.000)
		colorBeach     (0.267, 0.266, 0.265, 0.000)
		colorDesert    (0.282, 0.281, 0.280, 0.000)
		colorLowland   (0.297, 0.295, 0.294, 0.000)
		colorUpland    (0.312, 0.310, 0.309, 0.000)
		colorRock      (0.326, 0.325, 0.324, 0.000)
		colorSnow      (0.341, 0.340, 0.339, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.017216
		Period          0.0800467
		Eccentricity    0.0537001
		Inclination     16.675
		AscendingNode   -86.6405
		ArgOfPericenter 6.73135
		MeanAnomaly     160.779
	}
}

DwarfMoon	"6.D26"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            4.87691e-007
	Radius          111.808
	InertiaMoment   0.399685

	Obliquity       9.46894
	EqAscendNode    138.241
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.744 0.670 0.528)

	Surface
	{
		SurfStyle       0.748605
		OceanStyle      0.223925
		Randomize      (0.178, 0.855, -0.137)
		colorDistMagn   0.146673
		colorDistFreq   10.3615
		detailScale     3053.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.117066
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.364988
		terraceProb     0.363191
		erosion         0
		montesMagn      0.471333
		montesFreq      2.73922
		montesSpiky     0.836013
		montesFraction  0.708481
		dunesFraction   0
		hillsMagn       0
		hillsFreq       41.2423
		hillsFraction   0.49459
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.194035
		craterFreq      0.480742
		craterDensity   0.88353
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.102
		volcanoTemp     1404.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.228, 0.148, 0.000)
		colorShelf     (0.297, 0.235, 0.169, 0.000)
		colorBeach     (0.349, 0.275, 0.200, 0.000)
		colorDesert    (0.379, 0.295, 0.195, 0.000)
		colorLowland   (0.416, 0.315, 0.222, 0.000)
		colorUpland    (0.461, 0.382, 0.269, 0.000)
		colorRock      (0.498, 0.416, 0.290, 0.000)
		colorSnow      (0.543, 0.442, 0.306, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0176892
		Period          0.0833699
		Eccentricity    0.209384
		Inclination     9.46894
		AscendingNode   138.241
		ArgOfPericenter 48.991
		MeanAnomaly     74.8869
	}
}

DwarfMoon	"6.D27"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            6.89855e-007
	Radius          120.538
	InertiaMoment   0.397573

	Obliquity       46.798
	EqAscendNode    5.09227
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.409 0.406 0.401)

	Surface
	{
		SurfStyle       0.855154
		OceanStyle      0.726278
		Randomize      (0.186, 0.420, -0.195)
		colorDistMagn   0.9187
		colorDistFreq   5.31019
		detailScale     3291.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998161
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.334074
		terraceProb     0.405466
		erosion         0
		montesMagn      0.511267
		montesFreq      3.32376
		montesSpiky     0.9613
		montesFraction  0.511815
		dunesFraction   0
		hillsMagn       0
		hillsFreq       30.5776
		hillsFraction   0.61368
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248788
		craterFreq      0.450668
		craterDensity   0.982516
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.7537
		volcanoTemp     1274.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.139, 0.142, 0.160, 0.050)
		colorShelf     (0.163, 0.166, 0.185, 0.040)
		colorBeach     (0.188, 0.191, 0.209, 0.030)
		colorDesert    (0.212, 0.215, 0.237, 0.020)
		colorLowland   (0.237, 0.239, 0.261, 0.030)
		colorUpland    (0.262, 0.264, 0.285, 0.050)
		colorRock      (0.286, 0.288, 0.317, 0.020)
		colorSnow      (0.286, 0.288, 0.317, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0182979
		Period          0.0877095
		Eccentricity    0.0696614
		Inclination     46.798
		AscendingNode   5.09227
		ArgOfPericenter -61.6214
		MeanAnomaly     90.0509
	}
}

DwarfMoon	"6.D28"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            9.8718e-007
	Radius          126.693
	InertiaMoment   0.398878

	RotationPeriod  1602.93
	Obliquity       -11.7051
	EqAscendNode    158.649

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.622 0.619 0.614)

	Surface
	{
		SurfStyle       0.301622
		OceanStyle      0.332953
		Randomize      (-0.121, 0.245, 0.715)
		colorDistMagn   0.984159
		colorDistFreq   12.78
		detailScale     3459.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0751105
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.326882
		terraceProb     0.644171
		erosion         0
		montesMagn      0.494224
		montesFreq      3.19922
		montesSpiky     0.911119
		montesFraction  0.558248
		dunesFraction   0
		hillsMagn       0
		hillsFreq       40.6444
		hillsFraction   0.702646
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220157
		craterFreq      0.673004
		craterDensity   0.922779
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   19.9921
		volcanoTemp     1363.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.248, 0.245, 0.000)
		colorShelf     (0.265, 0.263, 0.261, 0.000)
		colorBeach     (0.280, 0.279, 0.276, 0.000)
		colorDesert    (0.296, 0.294, 0.292, 0.000)
		colorLowland   (0.311, 0.310, 0.307, 0.000)
		colorUpland    (0.327, 0.325, 0.322, 0.000)
		colorRock      (0.342, 0.341, 0.338, 0.000)
		colorSnow      (0.358, 0.356, 0.353, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0188118
		Period          0.091431
		Eccentricity    0.393345
		Inclination     -11.7051
		AscendingNode   158.649
		ArgOfPericenter -122.652
		MeanAnomaly     20.6659
	}
}

DwarfMoon	"6.D29"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.43238e-006
	Radius          169.277
	InertiaMoment   0.399811

	RotationPeriod  4079.96
	Obliquity       -8.26904
	EqAscendNode    32.9642

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.540 0.401 0.308)

	Surface
	{
		SurfStyle       0.928547
		OceanStyle      0.254267
		Randomize      (0.546, 0.234, -0.476)
		colorDistMagn   0.837141
		colorDistFreq   18.1878
		detailScale     4622.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.273188
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.400919
		terraceProb     0.544489
		erosion         0
		montesMagn      0.505494
		montesFreq      2.91094
		montesSpiky     0.923635
		montesFraction  0.509526
		dunesFraction   0
		hillsMagn       0
		hillsFreq       45.839
		hillsFraction   0.655115
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250915
		craterFreq      0.91386
		craterDensity   0.821771
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.1756
		volcanoTemp     1547.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.140, 0.123, 0.050)
		colorShelf     (0.216, 0.164, 0.142, 0.040)
		colorBeach     (0.248, 0.188, 0.160, 0.030)
		colorDesert    (0.281, 0.213, 0.182, 0.020)
		colorLowland   (0.313, 0.237, 0.200, 0.030)
		colorUpland    (0.345, 0.261, 0.219, 0.050)
		colorRock      (0.378, 0.285, 0.243, 0.020)
		colorSnow      (0.378, 0.285, 0.243, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0190385
		Period          0.0930881
		Eccentricity    0.482879
		Inclination     -8.26904
		AscendingNode   32.9642
		ArgOfPericenter 39.7886
		MeanAnomaly     13.972
	}
}

DwarfMoon	"6.D30"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.11332e-006
	Radius          183.346
	InertiaMoment   0.397816

	RotationPeriod  1688.88
	Obliquity       -9.20781
	EqAscendNode    -113.211

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.591 0.588 0.584)

	Surface
	{
		SurfStyle       0.321704
		OceanStyle      0.811179
		Randomize      (0.949, -0.778, 0.942)
		colorDistMagn   0.61067
		colorDistFreq   14.505
		detailScale     5006.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.175461
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.486544
		terraceProb     0.132918
		erosion         0
		montesMagn      0.487377
		montesFreq      2.86597
		montesSpiky     0.998744
		montesFraction  0.364759
		dunesFraction   0
		hillsMagn       0
		hillsFreq       71.3096
		hillsFraction   0.847619
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24024
		craterFreq      1.1243
		craterDensity   0.763895
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   19.774
		volcanoTemp     1374.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.235, 0.234, 0.000)
		colorShelf     (0.251, 0.250, 0.248, 0.000)
		colorBeach     (0.266, 0.264, 0.263, 0.000)
		colorDesert    (0.281, 0.279, 0.277, 0.000)
		colorLowland   (0.295, 0.294, 0.292, 0.000)
		colorUpland    (0.310, 0.308, 0.307, 0.000)
		colorRock      (0.325, 0.323, 0.321, 0.000)
		colorSnow      (0.340, 0.338, 0.336, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0194784
		Period          0.0963334
		Eccentricity    0.416042
		Inclination     -9.20781
		AscendingNode   -113.211
		ArgOfPericenter -30.426
		MeanAnomaly     118.493
	}
}

Moon	"6.1"
{
	ParentBody     "6"
	Class	       "IceWorld"

	Mass            3.1816e-006
	Radius          201.856
	InertiaMoment   0.399022

	Obliquity       12.0782
	EqAscendNode    -43.4828
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.560 0.556 0.554)

	Surface
	{
		SurfStyle       0.0158145
		OceanStyle      0.887103
		Randomize      (-0.843, -0.663, 0.217)
		colorDistMagn   0.0661821
		colorDistFreq   21.8783
		detailScale     519.184
		colorConversion true
		drivenDarkening 0.329192
		seaLevel        0.263142
		snowLevel       2
		tropicLatitude  0.38131
		icecapLatitude  1
		icecapHeight    0.263142
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.68645
		venusFreq       0.866633
		venusMagn       0.166747
		mareFreq        0
		mareDensity     1.39631e-006
		terraceProb     0.414882
		erosion         0
		montesMagn      0.0525441
		montesFreq      7.92912
		montesSpiky     0.940432
		montesFraction  0.761221
		dunesMagn       0.0503288
		dunesFreq       263.758
		dunesFraction   0.367508
		hillsMagn       0.13984
		hillsFreq       20.9155
		hillsFraction   0.381246
		hills2Fraction  0.00749598
		riversMagn      66.9226
		riversFreq      3.58598
		riversSin       7.63419
		riversOctaves   0
		canyonsMagn     0.625182
		canyonsFreq     0.0675518
		canyonFraction  0
		cracksMagn      0.0563529
		cracksFreq      0.0620684
		cracksOctaves   0
		craterMagn      1.28183
		craterFreq      0.590999
		craterDensity   0.877488
		craterOctaves   7
		craterRayedFactor 0.21397
		volcanoMagn     0.202742
		volcanoFreq     1.07795
		volcanoDensity  0.060096
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.0875106
		volcanoRadius   4.78146
		volcanoTemp     1452.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.560, 0.556, 0.554, 0.500)
		colorShelf     (0.532, 0.528, 0.526, 0.500)
		colorBeach     (0.392, 0.389, 0.388, 0.750)
		colorDesert    (0.476, 0.472, 0.471, 1.000)
		colorLowland   (0.493, 0.489, 0.487, 1.000)
		colorUpland    (0.521, 0.517, 0.515, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.493, 0.489, 0.487, 1.000)
		colorUpPlants  (0.521, 0.517, 0.515, 1.000)
		BumpHeight      10.0928
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0200046
		Period          0.100263
		Eccentricity    0.0674262
		Inclination     12.0782
		AscendingNode   -43.4828
		ArgOfPericenter -60.4245
		MeanAnomaly     -113.765
	}
}

Moon	"6.2"
{
	ParentBody     "6"
	Class	       "IceWorld"

	Mass            4.9099e-006
	Radius          220.375
	InertiaMoment   0.399937

	RotationPeriod  2726.77
	Obliquity       -48.2295
	EqAscendNode    -105.227

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.473 0.463 0.457)

	Surface
	{
		SurfStyle       0.272063
		OceanStyle      0.628791
		Randomize      (0.589, -0.444, -0.285)
		colorDistMagn   0.0449204
		colorDistFreq   28.4934
		detailScale     566.817
		colorConversion true
		drivenDarkening 0.321899
		seaLevel        0.189936
		snowLevel       2
		tropicLatitude  0.807514
		icecapLatitude  1
		icecapHeight    0.189936
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.77689
		venusFreq       0.632356
		venusMagn       0.179015
		mareFreq        0
		mareDensity     2.94022e-006
		terraceProb     0.208709
		erosion         0
		montesMagn      0.0516436
		montesFreq      7.82035
		montesSpiky     0.945225
		montesFraction  0.0335531
		dunesMagn       0.0466102
		dunesFreq       297.14
		dunesFraction   0.196987
		hillsMagn       0.118979
		hillsFreq       24.9837
		hillsFraction   0.537904
		hills2Fraction  0.120461
		riversMagn      62.4778
		riversFreq      2.74273
		riversSin       7.07641
		riversOctaves   0
		canyonsMagn     0.496803
		canyonsFreq     0.0818935
		canyonFraction  0
		cracksMagn      0.0663
		cracksFreq      0.0683119
		cracksOctaves   0
		craterMagn      1.07332
		craterFreq      0.52457
		craterDensity   0.875643
		craterOctaves   8
		craterRayedFactor 0.270453
		volcanoMagn     0.183679
		volcanoFreq     1.18957
		volcanoDensity  0.0574183
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.0334302
		volcanoRadius   4.63728
		volcanoTemp     1566.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.473, 0.463, 0.457, 0.500)
		colorShelf     (0.450, 0.440, 0.434, 0.500)
		colorBeach     (0.331, 0.324, 0.320, 0.750)
		colorDesert    (0.402, 0.394, 0.388, 1.000)
		colorLowland   (0.417, 0.408, 0.402, 1.000)
		colorUpland    (0.440, 0.431, 0.425, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.417, 0.408, 0.402, 1.000)
		colorUpPlants  (0.440, 0.431, 0.425, 1.000)
		BumpHeight      11.0187
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0204578
		Period          0.10369
		Eccentricity    0.226849
		Inclination     -48.2295
		AscendingNode   -105.227
		ArgOfPericenter 90.7302
		MeanAnomaly     -133.977
	}
}

DwarfMoon	"6.D31"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.42118e-011
	Radius          3.67357
	InertiaMoment   0.39803

	RotationPeriod  2834.07
	Obliquity       21.3965
	EqAscendNode    157.624

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.571 0.568 0.566)

	Surface
	{
		SurfStyle       0.687006
		OceanStyle      0.755151
		Randomize      (-0.057, -0.658, 0.835)
		colorDistMagn   0.26655
		colorDistFreq   0.000962035
		detailScale     100.313
		colorConversion true
		snowLevel       2
		tropicLatitude  0.141215
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.45212
		terraceProb     0.345561
		erosion         0
		montesMagn      0.341524
		montesFreq      2.43472
		montesSpiky     0.904889
		montesFraction  0.334696
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0273815
		hillsFraction   0.485471
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228497
		craterFreq      0.252379
		craterDensity   0.873896
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   152.781
		volcanoTemp     1689.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.193, 0.158, 0.000)
		colorShelf     (0.228, 0.199, 0.181, 0.000)
		colorBeach     (0.268, 0.233, 0.215, 0.000)
		colorDesert    (0.291, 0.250, 0.209, 0.000)
		colorLowland   (0.320, 0.267, 0.238, 0.000)
		colorUpland    (0.354, 0.324, 0.288, 0.000)
		colorRock      (0.382, 0.352, 0.311, 0.000)
		colorSnow      (0.417, 0.375, 0.328, 1.000)
		BumpHeight      3.30621
		BumpOffset      0.661243
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.020991
		Period          0.10777
		Eccentricity    0.497023
		Inclination     21.3965
		AscendingNode   157.624
		ArgOfPericenter 179.917
		MeanAnomaly     78.388
	}
}

DwarfMoon	"6.D32"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.83668e-011
	Radius          4.3834
	InertiaMoment   0.39916

	RotationPeriod  2936.33
	Obliquity       -77.0047
	EqAscendNode    -42.2998

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.625 0.622 0.618)

	Surface
	{
		SurfStyle       0.708814
		OceanStyle      0.29776
		Randomize      (-0.421, -0.155, 0.404)
		colorDistMagn   0.271767
		colorDistFreq   0.0103572
		detailScale     119.696
		colorConversion true
		snowLevel       2
		tropicLatitude  0.758507
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.767165
		terraceProb     0.275667
		erosion         0
		montesMagn      0.558993
		montesFreq      2.1187
		montesSpiky     0.963554
		montesFraction  0.565788
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0295438
		hillsFraction   0.663309
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241758
		craterFreq      0.219691
		craterDensity   0.687422
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   129.036
		volcanoTemp     1514.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.211, 0.173, 0.000)
		colorShelf     (0.250, 0.218, 0.198, 0.000)
		colorBeach     (0.294, 0.255, 0.235, 0.000)
		colorDesert    (0.319, 0.274, 0.229, 0.000)
		colorLowland   (0.350, 0.292, 0.260, 0.000)
		colorUpland    (0.388, 0.354, 0.315, 0.000)
		colorRock      (0.419, 0.385, 0.340, 0.000)
		colorSnow      (0.457, 0.410, 0.359, 1.000)
		BumpHeight      3.94506
		BumpOffset      0.789012
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.021493
		Period          0.111658
		Eccentricity    0.353507
		Inclination     -77.0047
		AscendingNode   -42.2998
		ArgOfPericenter 53.8825
		MeanAnomaly     145.442
	}
}

DwarfMoon	"6.D33"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            5.18196e-011
	Radius          5.14665
	InertiaMoment   0.395502

	RotationPeriod  5957.35
	Obliquity       51.9561
	EqAscendNode    -61.6412

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.801 0.774 0.740)

	Surface
	{
		SurfStyle       0.176438
		OceanStyle      0.339506
		Randomize      (-0.441, -0.099, 0.390)
		colorDistMagn   0.825835
		colorDistFreq   0.00465281
		detailScale     140.538
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996365
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.337721
		terraceProb     0.421781
		erosion         0
		montesMagn      0.312889
		montesFreq      3.15706
		montesSpiky     0.963014
		montesFraction  0.43548
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0726222
		hillsFraction   0.501974
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256975
		craterFreq      0.245009
		craterDensity   0.827801
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   112.094
		volcanoTemp     1229.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.310, 0.296, 0.000)
		colorShelf     (0.340, 0.329, 0.314, 0.000)
		colorBeach     (0.360, 0.348, 0.333, 0.000)
		colorDesert    (0.380, 0.368, 0.351, 0.000)
		colorLowland   (0.400, 0.387, 0.370, 0.000)
		colorUpland    (0.420, 0.406, 0.388, 0.000)
		colorRock      (0.440, 0.426, 0.407, 0.000)
		colorSnow      (0.460, 0.445, 0.425, 1.000)
		BumpHeight      4.63199
		BumpOffset      0.926398
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0216991
		Period          0.113269
		Eccentricity    0.358509
		Inclination     51.9561
		AscendingNode   -61.6412
		ArgOfPericenter 76.5367
		MeanAnomaly     83.6178
	}
}

DwarfMoon	"6.D34"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            8.8871e-011
	Radius          5.8575
	InertiaMoment   0.398224

	Obliquity       -83.6137
	EqAscendNode    -142.185
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.494 0.486 0.484)

	Surface
	{
		SurfStyle       0.792608
		OceanStyle      0.105811
		Randomize      (0.200, -0.517, 0.313)
		colorDistMagn   0.732209
		colorDistFreq   0.0113352
		detailScale     159.949
		colorConversion true
		snowLevel       2
		tropicLatitude  0.609749
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.458411
		terraceProb     0.159419
		erosion         0
		montesMagn      0.659816
		montesFreq      3.87395
		montesSpiky     0.977044
		montesFraction  0.729809
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0819494
		hillsFraction   0.534931
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228024
		craterFreq      0.256079
		craterDensity   0.658146
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   97.4178
		volcanoTemp     1573.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.165, 0.135, 0.000)
		colorShelf     (0.197, 0.170, 0.155, 0.000)
		colorBeach     (0.232, 0.199, 0.184, 0.000)
		colorDesert    (0.252, 0.214, 0.179, 0.000)
		colorLowland   (0.276, 0.229, 0.203, 0.000)
		colorUpland    (0.306, 0.277, 0.247, 0.000)
		colorRock      (0.331, 0.302, 0.266, 0.000)
		colorSnow      (0.360, 0.321, 0.281, 1.000)
		BumpHeight      5.27175
		BumpOffset      1.05435
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0220256
		Period          0.115835
		Eccentricity    0.0402717
		Inclination     -83.6137
		AscendingNode   -142.185
		ArgOfPericenter 148.476
		MeanAnomaly     131.05
	}
}

DwarfMoon	"6.D35"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.45388e-010
	Radius          8.067
	InertiaMoment   0.399295

	Obliquity       14.1391
	EqAscendNode    135.707
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.789 0.701 0.669)

	Surface
	{
		SurfStyle       0.24802
		OceanStyle      0.442975
		Randomize      (-0.205, -0.102, 0.726)
		colorDistMagn   0.856347
		colorDistFreq   0.0447466
		detailScale     220.283
		colorConversion true
		snowLevel       2
		tropicLatitude  0.183392
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.376107
		terraceProb     0.137401
		erosion         0
		montesMagn      0.622404
		montesFreq      2.80073
		montesSpiky     0.897714
		montesFraction  0.834125
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.124023
		hillsFraction   0.725103
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231147
		craterFreq      0.176715
		craterDensity   0.959098
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   104.895
		volcanoTemp     1294.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.280, 0.268, 0.000)
		colorShelf     (0.335, 0.298, 0.285, 0.000)
		colorBeach     (0.355, 0.316, 0.301, 0.000)
		colorDesert    (0.375, 0.333, 0.318, 0.000)
		colorLowland   (0.394, 0.351, 0.335, 0.000)
		colorUpland    (0.414, 0.368, 0.351, 0.000)
		colorRock      (0.434, 0.386, 0.368, 0.000)
		colorSnow      (0.453, 0.403, 0.385, 1.000)
		BumpHeight      7.2603
		BumpOffset      1.45206
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0226004
		Period          0.120399
		Eccentricity    0.0722175
		Inclination     14.1391
		AscendingNode   135.707
		ArgOfPericenter -121.311
		MeanAnomaly     -57.0121
	}
}

DwarfMoon	"6.D36"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.2932e-010
	Radius          8.85199
	InertiaMoment   0.396431

	RotationPeriod  4282.88
	Obliquity       47.1802
	EqAscendNode    19.2293

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.546 0.538 0.534)

	Surface
	{
		SurfStyle       0.0787051
		OceanStyle      0.779657
		Randomize      (-0.672, -0.868, -0.173)
		colorDistMagn   0.735113
		colorDistFreq   0.0446036
		detailScale     241.718
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998941
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.680696
		terraceProb     0.160972
		erosion         0
		montesMagn      0.686498
		montesFreq      3.81954
		montesSpiky     0.940693
		montesFraction  0.561929
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.204893
		hillsFraction   0.70662
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.294188
		craterFreq      0.150086
		craterDensity   1.04452
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   91.6487
		volcanoTemp     1473.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.215, 0.214, 0.000)
		colorShelf     (0.232, 0.229, 0.227, 0.000)
		colorBeach     (0.246, 0.242, 0.241, 0.000)
		colorDesert    (0.259, 0.256, 0.254, 0.000)
		colorLowland   (0.273, 0.269, 0.267, 0.000)
		colorUpland    (0.287, 0.282, 0.281, 0.000)
		colorRock      (0.300, 0.296, 0.294, 0.000)
		colorSnow      (0.314, 0.309, 0.307, 1.000)
		BumpHeight      7.96679
		BumpOffset      1.59336
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0228187
		Period          0.122147
		Eccentricity    0.446368
		Inclination     47.1802
		AscendingNode   19.2293
		ArgOfPericenter -69.203
		MeanAnomaly     103.189
	}
}

DwarfMoon	"6.D37"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.51377e-010
	Radius          9.79709
	InertiaMoment   0.398402

	RotationPeriod  1646.79
	Obliquity       0.301123
	EqAscendNode    172.38

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.695 0.643 0.621)

	Surface
	{
		SurfStyle       0.453608
		OceanStyle      0.47443
		Randomize      (-0.904, -0.035, -0.866)
		colorDistMagn   0.901744
		colorDistFreq   0.0586657
		detailScale     267.526
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000690534
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.465301
		terraceProb     0.53938
		erosion         0
		montesMagn      0.257441
		montesFreq      3.73568
		montesSpiky     0.949655
		montesFraction  0.466421
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.272851
		hillsFraction   0.652296
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262038
		craterFreq      0.223059
		craterDensity   0.802045
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   81.9439
		volcanoTemp     1630.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.257, 0.248, 0.000)
		colorShelf     (0.296, 0.273, 0.264, 0.000)
		colorBeach     (0.313, 0.289, 0.279, 0.000)
		colorDesert    (0.330, 0.306, 0.295, 0.000)
		colorLowland   (0.348, 0.322, 0.310, 0.000)
		colorUpland    (0.365, 0.338, 0.326, 0.000)
		colorRock      (0.382, 0.354, 0.341, 0.000)
		colorSnow      (0.400, 0.370, 0.357, 1.000)
		BumpHeight      8.81738
		BumpOffset      1.76348
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0232028
		Period          0.125244
		Eccentricity    0.165049
		Inclination     0.301123
		AscendingNode   172.38
		ArgOfPericenter -84.9454
		MeanAnomaly     38.5884
	}
}

DwarfMoon	"6.D38"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            5.25944e-010
	Radius          10.6977
	InertiaMoment   0.399426

	Obliquity       86.9468
	EqAscendNode    -74.2503
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.673 0.667 0.663)

	Surface
	{
		SurfStyle       0.780582
		OceanStyle      0.205989
		Randomize      (0.227, 0.995, -0.672)
		colorDistMagn   0.726597
		colorDistFreq   0.0840399
		detailScale     292.119
		colorConversion true
		snowLevel       2
		tropicLatitude  0.963466
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504285
		terraceProb     0.606327
		erosion         0
		montesMagn      0.419222
		montesFreq      2.93779
		montesSpiky     0.761776
		montesFraction  0.81815
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.334857
		hillsFraction   0.620574
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241775
		craterFreq      0.228086
		craterDensity   1.05387
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   73.1353
		volcanoTemp     1680.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.227, 0.186, 0.000)
		colorShelf     (0.269, 0.234, 0.212, 0.000)
		colorBeach     (0.316, 0.274, 0.252, 0.000)
		colorDesert    (0.343, 0.294, 0.245, 0.000)
		colorLowland   (0.377, 0.314, 0.279, 0.000)
		colorUpland    (0.417, 0.380, 0.338, 0.000)
		colorRock      (0.451, 0.414, 0.365, 0.000)
		colorSnow      (0.491, 0.441, 0.385, 1.000)
		BumpHeight      9.62794
		BumpOffset      1.92559
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0235509
		Period          0.128073
		Eccentricity    0.203896
		Inclination     86.9468
		AscendingNode   -74.2503
		ArgOfPericenter -147.47
		MeanAnomaly     -79.3147
	}
}

DwarfMoon	"6.D39"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            7.72281e-010
	Radius          14.274
	InertiaMoment   0.396925

	RotationPeriod  1721.99
	Obliquity       82.1999
	EqAscendNode    -35.8198

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.715 0.574 0.479)

	Surface
	{
		SurfStyle       0.235606
		OceanStyle      0.649714
		Randomize      (0.876, -0.788, -0.728)
		colorDistMagn   0.515558
		colorDistFreq   0.0837126
		detailScale     389.776
		colorConversion true
		snowLevel       2
		tropicLatitude  0.628874
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391862
		terraceProb     0.37502
		erosion         0
		montesMagn      0.485638
		montesFreq      3.70442
		montesSpiky     0.978477
		montesFraction  0.343314
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.473491
		hillsFraction   0.654948
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210738
		craterFreq      0.203225
		craterDensity   0.860869
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   80.5313
		volcanoTemp     1168.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.230, 0.192, 0.000)
		colorShelf     (0.304, 0.244, 0.204, 0.000)
		colorBeach     (0.322, 0.258, 0.215, 0.000)
		colorDesert    (0.340, 0.273, 0.227, 0.000)
		colorLowland   (0.358, 0.287, 0.239, 0.000)
		colorUpland    (0.376, 0.301, 0.251, 0.000)
		colorRock      (0.393, 0.316, 0.263, 0.000)
		colorSnow      (0.411, 0.330, 0.275, 1.000)
		BumpHeight      12.8466
		BumpOffset      2.56932
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0239038
		Period          0.130962
		Eccentricity    0.110993
		Inclination     82.1999
		AscendingNode   -35.8198
		ArgOfPericenter -115.717
		MeanAnomaly     -25.1189
	}
}

DwarfMoon	"6.D40"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.11614e-009
	Radius          15.0988
	InertiaMoment   0.398568

	Obliquity       -66.1895
	EqAscendNode    -56.9141
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.484 0.480 0.473)

	Surface
	{
		SurfStyle       0.944846
		OceanStyle      0.773953
		Randomize      (0.716, -0.591, 0.000)
		colorDistMagn   0.0777897
		colorDistFreq   0.179403
		detailScale     412.297
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955824
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.510255
		terraceProb     0.166865
		erosion         0
		montesMagn      0.509289
		montesFreq      2.88824
		montesSpiky     0.972667
		montesFraction  0.513227
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.489339
		hillsFraction   0.590175
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235432
		craterFreq      0.160115
		craterDensity   1.02992
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   70.8579
		volcanoTemp     1897.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.168, 0.189, 0.050)
		colorShelf     (0.193, 0.197, 0.218, 0.040)
		colorBeach     (0.222, 0.226, 0.246, 0.030)
		colorDesert    (0.251, 0.254, 0.279, 0.020)
		colorLowland   (0.280, 0.283, 0.307, 0.030)
		colorUpland    (0.309, 0.312, 0.336, 0.050)
		colorRock      (0.338, 0.341, 0.374, 0.020)
		colorSnow      (0.338, 0.341, 0.374, 1.000)
		BumpHeight      13.5889
		BumpOffset      2.71778
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0243733
		Period          0.13484
		Eccentricity    0.13252
		Inclination     -66.1895
		AscendingNode   -56.9141
		ArgOfPericenter -152.692
		MeanAnomaly     -133.326
	}
}

DwarfMoon	"6.D41"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.59193e-009
	Radius          16.3028
	InertiaMoment   0.399555

	RotationPeriod  4894.2
	Obliquity       45.0706
	EqAscendNode    12.7738

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.707 0.703 0.701)

	Surface
	{
		SurfStyle       0.758123
		OceanStyle      0.56131
		Randomize      (-0.011, 0.421, -0.812)
		colorDistMagn   0.70736
		colorDistFreq   0.204397
		detailScale     445.175
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999951
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492068
		terraceProb     0.179599
		erosion         0
		montesMagn      0.633974
		montesFreq      2.73726
		montesSpiky     0.951398
		montesFraction  0.567254
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.780099
		hillsFraction   0.792212
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267047
		craterFreq      0.211139
		craterDensity   0.964372
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   64.0627
		volcanoTemp     1591.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.239, 0.196, 0.000)
		colorShelf     (0.283, 0.246, 0.224, 0.000)
		colorBeach     (0.332, 0.288, 0.267, 0.000)
		colorDesert    (0.361, 0.309, 0.260, 0.000)
		colorLowland   (0.396, 0.331, 0.295, 0.000)
		colorUpland    (0.438, 0.401, 0.358, 0.000)
		colorRock      (0.474, 0.436, 0.386, 0.000)
		colorSnow      (0.516, 0.464, 0.407, 1.000)
		BumpHeight      14.6725
		BumpOffset      2.9345
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0249415
		Period          0.139582
		Eccentricity    0.336497
		Inclination     45.0706
		AscendingNode   12.7738
		ArgOfPericenter 136.697
		MeanAnomaly     58.7857
	}
}

DwarfMoon	"6.D42"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.24565e-009
	Radius          17.4982
	InertiaMoment   0.397281

	RotationPeriod  1882.48
	Obliquity       -13.564
	EqAscendNode    175.983

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.642 0.637 0.634)

	Surface
	{
		SurfStyle       0.375462
		OceanStyle      0.924281
		Randomize      (-0.115, 0.078, -0.054)
		colorDistMagn   0.769697
		colorDistFreq   0.00978479
		detailScale     477.818
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0164423
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552232
		terraceProb     0.145883
		erosion         0
		montesMagn      0.362231
		montesFreq      3.20167
		montesSpiky     0.937114
		montesFraction  0.462326
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.544661
		hillsFraction   0.41568
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257788
		craterFreq      0.240159
		craterDensity   0.988226
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.8934
		volcanoTemp     1481.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.255, 0.254, 0.000)
		colorShelf     (0.273, 0.271, 0.270, 0.000)
		colorBeach     (0.289, 0.287, 0.285, 0.000)
		colorDesert    (0.305, 0.303, 0.301, 0.000)
		colorLowland   (0.321, 0.318, 0.317, 0.000)
		colorUpland    (0.337, 0.334, 0.333, 0.000)
		colorRock      (0.353, 0.350, 0.349, 0.000)
		colorSnow      (0.369, 0.366, 0.365, 1.000)
		BumpHeight      15.7484
		BumpOffset      3.14968
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0253669
		Period          0.143169
		Eccentricity    0.221705
		Inclination     -13.564
		AscendingNode   175.983
		ArgOfPericenter -108.663
		MeanAnomaly     -124.834
	}
}

DwarfMoon	"6.D43"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.13878e-009
	Radius          23.2019
	InertiaMoment   0.398726

	Obliquity       -55.0687
	EqAscendNode    19.3012
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.545 0.542 0.538)

	Surface
	{
		SurfStyle       0.653177
		OceanStyle      0.542166
		Randomize      (-0.026, 0.807, 0.572)
		colorDistMagn   0.567558
		colorDistFreq   0.232543
		detailScale     633.566
		colorConversion true
		snowLevel       2
		tropicLatitude  0.951872
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.38023
		terraceProb     0.202867
		erosion         0
		montesMagn      0.548411
		montesFreq      2.91727
		montesSpiky     0.916649
		montesFraction  0.435745
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.42808
		hillsFraction   0.612634
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247036
		craterFreq      0.242993
		craterDensity   0.907196
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   64.9305
		volcanoTemp     1607.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.184, 0.151, 0.000)
		colorShelf     (0.218, 0.190, 0.172, 0.000)
		colorBeach     (0.256, 0.222, 0.204, 0.000)
		colorDesert    (0.278, 0.238, 0.199, 0.000)
		colorLowland   (0.305, 0.255, 0.226, 0.000)
		colorUpland    (0.338, 0.309, 0.274, 0.000)
		colorRock      (0.365, 0.336, 0.296, 0.000)
		colorSnow      (0.398, 0.357, 0.312, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0260237
		Period          0.148764
		Eccentricity    0.260991
		Inclination     -55.0687
		AscendingNode   19.3012
		ArgOfPericenter -80.3614
		MeanAnomaly     -40.1789
	}
}

DwarfMoon	"6.D44"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            4.35372e-009
	Radius          23.9307
	InertiaMoment   0.399683

	Obliquity       -80.7913
	EqAscendNode    -64.3593
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.762 0.761 0.759)

	Surface
	{
		SurfStyle       0.764723
		OceanStyle      0.815741
		Randomize      (0.336, -0.452, 0.679)
		colorDistMagn   0.419244
		colorDistFreq   0.310479
		detailScale     653.466
		colorConversion true
		snowLevel       2
		tropicLatitude  0.918236
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.64047
		terraceProb     0.248473
		erosion         0
		montesMagn      0.485211
		montesFreq      2.22398
		montesSpiky     0.975588
		montesFraction  0.573798
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.31219
		hillsFraction   0.632867
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241216
		craterFreq      0.168768
		craterDensity   0.900966
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   56.863
		volcanoTemp     1201.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.259, 0.213, 0.000)
		colorShelf     (0.305, 0.266, 0.243, 0.000)
		colorBeach     (0.358, 0.312, 0.288, 0.000)
		colorDesert    (0.388, 0.335, 0.281, 0.000)
		colorLowland   (0.427, 0.357, 0.319, 0.000)
		colorUpland    (0.472, 0.434, 0.387, 0.000)
		colorRock      (0.510, 0.472, 0.418, 0.000)
		colorSnow      (0.556, 0.502, 0.440, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0264572
		Period          0.152497
		Eccentricity    0.126731
		Inclination     -80.7913
		AscendingNode   -64.3593
		ArgOfPericenter -63.44
		MeanAnomaly     159.915
	}
}

DwarfMoon	"6.D45"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            6.00108e-009
	Radius          25.5152
	InertiaMoment   0.397567

	Obliquity       -40.8964
	EqAscendNode    -110.539
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.738 0.681 0.643)

	Surface
	{
		SurfStyle       0.638633
		OceanStyle      0.697793
		Randomize      (-0.328, -0.238, -0.349)
		colorDistMagn   0.0662318
		colorDistFreq   0.210425
		detailScale     696.736
		colorConversion true
		snowLevel       2
		tropicLatitude  0.692147
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.262365
		terraceProb     0.439143
		erosion         0
		montesMagn      0.352171
		montesFreq      2.70859
		montesSpiky     0.992078
		montesFraction  0.567913
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.02519
		hillsFraction   0.651872
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213871
		craterFreq      0.254397
		craterDensity   0.764315
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.6405
		volcanoTemp     1240.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.232, 0.180, 0.000)
		colorShelf     (0.295, 0.238, 0.206, 0.000)
		colorBeach     (0.347, 0.279, 0.244, 0.000)
		colorDesert    (0.376, 0.300, 0.238, 0.000)
		colorLowland   (0.413, 0.320, 0.270, 0.000)
		colorUpland    (0.458, 0.388, 0.328, 0.000)
		colorRock      (0.494, 0.422, 0.354, 0.000)
		colorSnow      (0.539, 0.450, 0.373, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0267722
		Period          0.155229
		Eccentricity    0.191526
		Inclination     -40.8964
		AscendingNode   -110.539
		ArgOfPericenter 144.312
		MeanAnomaly     -54.5236
	}
}

DwarfMoon	"6.D46"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            8.2298e-009
	Radius          27.1766
	InertiaMoment   0.398875

	Obliquity       -33.8694
	EqAscendNode    -30.8414
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.644 0.642 0.639)

	Surface
	{
		SurfStyle       0.877756
		OceanStyle      0.804837
		Randomize      (-0.963, 0.950, -0.839)
		colorDistMagn   0.497015
		colorDistFreq   0.517884
		detailScale     742.103
		colorConversion true
		snowLevel       2
		tropicLatitude  0.906247
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554852
		terraceProb     0.517201
		erosion         0
		montesMagn      0.404102
		montesFreq      4.04295
		montesSpiky     0.943308
		montesFraction  0.425844
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.43171
		hillsFraction   0.89317
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263391
		craterFreq      0.239672
		craterDensity   0.679194
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.9685
		volcanoTemp     1734.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.225, 0.256, 0.050)
		colorShelf     (0.258, 0.263, 0.294, 0.040)
		colorBeach     (0.296, 0.302, 0.332, 0.030)
		colorDesert    (0.335, 0.340, 0.377, 0.020)
		colorLowland   (0.373, 0.379, 0.416, 0.030)
		colorUpland    (0.412, 0.417, 0.454, 0.050)
		colorRock      (0.451, 0.456, 0.505, 0.020)
		colorSnow      (0.451, 0.456, 0.505, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0273366
		Period          0.160163
		Eccentricity    0.00101574
		Inclination     -33.8694
		AscendingNode   -30.8414
		ArgOfPericenter -2.12442
		MeanAnomaly     -142.867
	}
}

DwarfMoon	"6.D47"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.12411e-008
	Radius          36.5037
	InertiaMoment   0.399809

	RotationPeriod  8667.75
	Obliquity       -37.6902
	EqAscendNode    -161.236

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.453 0.414 0.364)

	Surface
	{
		SurfStyle       0.973297
		OceanStyle      0.0950716
		Randomize      (-0.817, -0.795, -0.385)
		colorDistMagn   0.672208
		colorDistFreq   0.650339
		detailScale     996.795
		colorConversion true
		snowLevel       2
		tropicLatitude  0.198341
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.564905
		terraceProb     0.438813
		erosion         0
		montesMagn      0.545895
		montesFreq      3.67015
		montesSpiky     0.95431
		montesFraction  0.55233
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.49625
		hillsFraction   0.642797
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248024
		craterFreq      0.231399
		craterDensity   0.651842
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   53.9807
		volcanoTemp     1444.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.154, 0.145, 0.146, 0.050)
		colorShelf     (0.181, 0.170, 0.167, 0.040)
		colorBeach     (0.208, 0.195, 0.189, 0.030)
		colorDesert    (0.235, 0.220, 0.215, 0.020)
		colorLowland   (0.263, 0.244, 0.237, 0.030)
		colorUpland    (0.290, 0.269, 0.258, 0.050)
		colorRock      (0.317, 0.294, 0.288, 0.020)
		colorSnow      (0.317, 0.294, 0.288, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0278619
		Period          0.164802
		Eccentricity    0.282271
		Inclination     -37.6902
		AscendingNode   -161.236
		ArgOfPericenter 15.5018
		MeanAnomaly     -167.105
	}
}

DwarfMoon	"6.D48"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.53082e-008
	Radius          36.656
	InertiaMoment   0.397811

	RotationPeriod  2991.45
	Obliquity       1.36932
	EqAscendNode    -139.84

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.500 0.495 0.493)

	Surface
	{
		SurfStyle       0.90789
		OceanStyle      0.451284
		Randomize      (0.135, 0.365, -0.915)
		colorDistMagn   0.169254
		colorDistFreq   0.775098
		detailScale     1000.95
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0164096
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544143
		terraceProb     0.311408
		erosion         0
		montesMagn      0.501756
		montesFreq      3.20558
		montesSpiky     0.885202
		montesFraction  0.541067
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.70624
		hillsFraction   0.598457
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224101
		craterFreq      0.209836
		craterDensity   0.896845
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.4503
		volcanoTemp     1531.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.173, 0.197, 0.050)
		colorShelf     (0.200, 0.203, 0.227, 0.040)
		colorBeach     (0.230, 0.233, 0.256, 0.030)
		colorDesert    (0.260, 0.263, 0.291, 0.020)
		colorLowland   (0.290, 0.292, 0.320, 0.030)
		colorUpland    (0.320, 0.322, 0.350, 0.050)
		colorRock      (0.350, 0.352, 0.389, 0.020)
		colorSnow      (0.350, 0.352, 0.389, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0285151
		Period          0.170632
		Eccentricity    0.154883
		Inclination     1.36932
		AscendingNode   -139.84
		ArgOfPericenter 139.049
		MeanAnomaly     139.441
	}
}

DwarfMoon	"6.D49"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.08035e-008
	Radius          38.8342
	InertiaMoment   0.399019

	RotationPeriod  3782.59
	Obliquity       -61.3326
	EqAscendNode    -13.2482

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.662 0.587 0.549)

	Surface
	{
		SurfStyle       0.262504
		OceanStyle      0.21821
		Randomize      (0.172, -0.705, 0.320)
		colorDistMagn   0.348261
		colorDistFreq   0.995946
		detailScale     1060.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.854628
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.43044
		terraceProb     0.34089
		erosion         0
		montesMagn      0.459343
		montesFreq      3.26561
		montesSpiky     0.994302
		montesFraction  0.24125
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.0906
		hillsFraction   0.726932
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227165
		craterFreq      0.201284
		craterDensity   0.896142
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.2135
		volcanoTemp     1567.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.235, 0.220, 0.000)
		colorShelf     (0.281, 0.250, 0.233, 0.000)
		colorBeach     (0.298, 0.264, 0.247, 0.000)
		colorDesert    (0.314, 0.279, 0.261, 0.000)
		colorLowland   (0.331, 0.294, 0.274, 0.000)
		colorUpland    (0.347, 0.308, 0.288, 0.000)
		colorRock      (0.364, 0.323, 0.302, 0.000)
		colorSnow      (0.380, 0.338, 0.316, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0287347
		Period          0.172606
		Eccentricity    0.344733
		Inclination     -61.3326
		AscendingNode   -13.2482
		ArgOfPericenter -47.2124
		MeanAnomaly     -87.1769
	}
}

Barycenter	"7-7.1"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Mass            3.98463
	Radius          6019.37
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
		ModulateColor  (-99999996802856925000000000000000000000.000 1.000 1.000 1.000)
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
		RefPlane        "Equator"
		SemiMajorAxis   0.703234
		Period          2.08665
		Eccentricity    0.0747289
		Inclination     0.933152
		AscendingNode   120.461
		ArgOfPericenter 172.529
		MeanAnomaly     352.768
	}
}

Planet	"7"
{
	ParentBody     "7-7.1"
	Class	       "IceWorld"

	Mass            3.86814
	Radius          12045
	InertiaMoment   0.330875

	Obliquity       -0.264129
	EqAscendNode    -126.608
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.694 0.691 0.686)

	Surface
	{
		SurfStyle       0.648503
		OceanStyle      0.129939
		Randomize      (0.772, -0.690, -0.702)
		colorDistMagn   0.0685805
		colorDistFreq   1491.68
		detailScale     30980.3
		colorConversion true
		drivenDarkening 0
		seaLevel        0.120778
		snowLevel       2
		tropicLatitude  0.0041432
		icecapLatitude  0.669661
		icecapHeight    0.146555
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.00613
		venusFreq       0.478223
		venusMagn       0.222983
		mareFreq        1.78468
		mareDensity     0.152949
		terraceProb     0.140346
		erosion         0
		montesMagn      0.212819
		montesFreq      534.541
		montesSpiky     0.890583
		montesFraction  0.288244
		dunesMagn       0.0385609
		dunesFreq       15985.2
		dunesFraction   0.963856
		hillsMagn       0.100949
		hillsFreq       1382.69
		hillsFraction   0.0832714
		hills2Fraction  0.155146
		riversMagn      49.2873
		riversFreq      2.2718
		riversSin       4.65881
		riversOctaves   0
		canyonsMagn     0.474405
		canyonsFreq     4.63741
		canyonFraction  0
		cracksMagn      0.0473131
		cracksFreq      6.78936
		cracksOctaves   4
		craterMagn      0.601388
		craterFreq      40.4952
		craterDensity   0.790219
		craterOctaves   14
		craterRayedFactor 0.398445
		volcanoMagn     0.785852
		volcanoFreq     3.44259
		volcanoDensity  0.4
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0.444712
		volcanoRadius   0.286882
		volcanoTemp     1366.19
		lavaCoverTidal  0.066156
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.131, 0.076, 1.000)
		colorShelf     (0.236, 0.180, 0.110, 1.000)
		colorBeach     (0.382, 0.235, 0.117, 0.200)
		colorDesert    (0.416, 0.263, 0.137, 0.200)
		colorLowland   (0.451, 0.276, 0.144, 0.200)
		colorUpland    (0.486, 0.332, 0.172, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.451, 0.276, 0.144, 0.200)
		colorUpPlants  (0.486, 0.332, 0.172, 0.200)
		BumpHeight      19.2039
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.9941
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Pluto"
		Height          88.4515
		Density         0.000590028
		Pressure        0.000215443
		Greenhouse      0.219984
		Bright          3.5824
		Opacity         0
		SkyLight        1.19413
		Hue             0.0280192
		Saturation      1

		Composition
		{
			He    	74.9167
			N2    	23.1641
			Ne    	1.91757
			Ar    	0.0008005
			CO    	0.000775142
		}
	}

	Aurora
	{
		Height      253.216
		NorthLat    52.1842
		NorthLon    93.1685
		NorthRadius 2595.47
		NorthWidth  2858.98
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -43.5815
		SouthLon    254.919
		SouthRadius 2013.13
		SouthWidth  1828.56
		SouthRings  4
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.45782e-005
		Period          0.00706222
		Eccentricity    0.0139386
		Inclination     -0.264129
		AscendingNode   -126.608
		ArgOfPericenter 96.7407
		MeanAnomaly     -148.125
	}
}

Moon	"7.1"
{
	ParentBody     "7-7.1"
	Class	       "Selena"

	Mass            0.116493
	Radius          4166.6
	InertiaMoment   0.332094

	Oblateness      0.00120247

	Obliquity       -0.264129
	EqAscendNode    -126.608
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.791 0.789 0.788)

	Surface
	{
		SurfStyle       0.259279
		OceanStyle      0.0446797
		Randomize      (-0.750, -0.033, -0.761)
		colorDistMagn   0.0433999
		colorDistFreq   567.938
		detailScale     10716.7
		colorConversion true
		drivenDarkening 0
		seaLevel        0.164547
		snowLevel       2
		tropicLatitude  0.0041432
		icecapLatitude  0.408768
		icecapHeight    0.212966
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.95174
		venusFreq       0.996941
		venusMagn       0
		mareFreq        1.31393
		mareDensity     0.0123934
		terraceProb     0.131247
		erosion         0
		montesMagn      0.207454
		montesFreq      171.178
		montesSpiky     0.955798
		montesFraction  0.72561
		dunesMagn       0.0293102
		dunesFreq       5559.66
		dunesFraction   0.612106
		hillsMagn       0.130092
		hillsFreq       547.67
		hillsFraction   0.384708
		hills2Fraction  0
		riversMagn      54.3685
		riversFreq      3.75593
		riversSin       6.19093
		riversOctaves   0
		canyonsMagn     0.573987
		canyonsFreq     1.51126
		canyonFraction  0.848307
		cracksMagn      0.0408437
		cracksFreq      1.54757
		cracksOctaves   0
		craterMagn      0.561118
		craterFreq      12.8199
		craterDensity   0.748155
		craterOctaves   9.12712
		craterRayedFactor 0.0557699
		volcanoMagn     0.719306
		volcanoFreq     2.86051
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.344472
		volcanoRadius   0.456247
		volcanoTemp     1438.41
		lavaCoverTidal  0.266007
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.435, 0.450, 0.473, 0.000)
		colorDesert    (0.380, 0.363, 0.362, 0.000)
		colorLowland   (0.482, 0.481, 0.441, 0.000)
		colorUpland    (0.514, 0.513, 0.481, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.985199
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Pluto"
		Height          211.665
		Density         0.00148015
		Pressure        0.00077893
		Greenhouse      0.730207
		Bright          4.30587
		Opacity         0
		SkyLight        1.43529
		Hue             0.0489827
		Saturation      1

		Composition
		{
			CH4   	56.7709
			N2    	22.882
			H2    	19.2584
			CO    	0.898257
			Ne    	0.0937375
			C2H4  	0.0509052
			He    	0.0266618
			Ar    	0.0178978
			C2H6  	0.000805826
			Kr    	0.000274821
			C2H2  	6.15412e-005
			Xe    	3.86702e-005
			CO2   	1.51742e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000816114
		Period          0.00706222
		Eccentricity    0.0139386
		Inclination     -0.264129
		AscendingNode   -126.608
		ArgOfPericenter -83.2593
		MeanAnomaly     -148.125
	}
}

Planet	"8"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "GasGiant"

	Mass            1949.19
	Radius          75399.5
	InertiaMoment   0.266965

	Oblateness      0.015506

	RotationPeriod  9.13528
	Obliquity       -8.50998
	EqAscendNode    -38.7522

	AlbedoBond      0.456492
	AlbedoGeom      0.547791
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.584327
		Randomize      (0.104, 0.879, 0.807)
		detailScale     193932
		colorConversion true
		tropicLatitude  0.129583
		icecapLatitude  1
		mainFreq        0.0498159
		venusFreq       4.49471
		venusMagn       0.492476
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      2.34561
		twistMagn       0.684358
		cycloneMagn     6.12619
		cycloneFreq     0.228807
		cycloneDensity  0.140836
		cycloneOctaves  1
		colorLayer0    (0.570, 0.550, 0.480, 1.100)
		colorLayer1    (0.850, 0.860, 0.870, 0.700)
		colorLayer2    (0.450, 0.390, 0.260, 0.200)
		colorLayer3    (0.430, 0.330, 0.170, 0.020)
		colorLayer4    (0.830, 0.830, 0.830, 0.000)
		colorLayer5    (0.510, 0.400, 0.140, 0.000)
		colorLayer6    (0.370, 0.350, 0.280, 0.000)
		colorLayer7    (0.420, 0.390, 0.310, 1.000)
		colorLowPlants (0.830, 0.830, 0.830, 0.000)
		colorUpPlants  (0.510, 0.400, 0.140, 0.000)
		BumpHeight      5.35523
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          24.2813
		BumpHeight      54.8669
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.18184
		mainOctaves     10
		Coverage        0.0649246
		twistZones      2.34561
		twistMagn       0.684358
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          100
		Density         9051.47
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0419561
		Saturation      0.948606

		Composition
		{
			H2    	91.7633
			He    	8.1975
			N2    	0.0373071
			Ne    	0.00131887
			O2    	0.000417218
			Ar    	0.000106557
			CH4   	2.21044e-005
		}
	}

	Aurora
	{
		Height      1507.65
		NorthLat    89.0459
		NorthLon    65.7781
		NorthRadius 21773
		NorthWidth  9649.93
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -90
		SouthLon    247.523
		SouthRadius 21245.7
		SouthWidth  13058.3
		SouthRings  2
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     98710.8
		OuterRadius     109103
		RotationPeriod  2.10195
		RotationOffset  0
		FrontBright     0.693452
		BackBright      0.563848
		Density         0.990855
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.11667
		Period          4.03111
		Eccentricity    0.0404845
		Inclination     1.64425
		AscendingNode   -45.3193
		ArgOfPericenter 169.34
		MeanAnomaly     34.045
	}
}

DwarfMoon	"8.D1"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            9.38007e-011
	Radius          5.7964
	InertiaMoment   0.398803

	Oblateness      0.249

	Obliquity       -0.0120341
	EqAscendNode    -134.237
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.675 0.671 0.668)

	Surface
	{
		SurfStyle       0.175063
		OceanStyle      0.768401
		Randomize      (0.521, -0.461, 0.993)
		colorDistMagn   0.742561
		colorDistFreq   0.00633894
		detailScale     158.281
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661766
		terraceProb     0.286176
		erosion         0
		montesMagn      0.531222
		montesFreq      2.65143
		montesSpiky     0.984693
		montesFraction  0.824383
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0529001
		hillsFraction   0.664777
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228076
		craterFreq      0.195045
		craterDensity   0.817183
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   93.8343
		volcanoTemp     1753.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.269, 0.267, 0.000)
		colorShelf     (0.287, 0.285, 0.284, 0.000)
		colorBeach     (0.304, 0.302, 0.301, 0.000)
		colorDesert    (0.320, 0.319, 0.317, 0.000)
		colorLowland   (0.337, 0.336, 0.334, 0.000)
		colorUpland    (0.354, 0.352, 0.351, 0.000)
		colorRock      (0.371, 0.369, 0.368, 0.000)
		colorSnow      (0.388, 0.386, 0.384, 1.000)
		BumpHeight      5.21676
		BumpOffset      1.04335
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0013768
		Period          0.000669205
		Eccentricity    2.56919e-005
		Inclination     -0.0120341
		AscendingNode   -134.237
		ArgOfPericenter -2.13017
		MeanAnomaly     36.0195
	}
}

DwarfMoon	"8.D2"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.52796e-010
	Radius          8.03598
	InertiaMoment   0.399748

	Oblateness      0.249

	Obliquity       0.00226846
	EqAscendNode    165.529
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.608 0.606 0.601)

	Surface
	{
		SurfStyle       0.765199
		OceanStyle      0.778738
		Randomize      (-0.766, -0.524, -0.136)
		colorDistMagn   0.702693
		colorDistFreq   0.0276885
		detailScale     219.436
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.624691
		terraceProb     0.298902
		erosion         0
		montesMagn      0.522999
		montesFreq      3.16324
		montesSpiky     0.937687
		montesFraction  0.693198
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.150694
		hillsFraction   0.705591
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238496
		craterFreq      0.195814
		craterDensity   0.861317
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   101.927
		volcanoTemp     1638.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.206, 0.168, 0.000)
		colorShelf     (0.243, 0.212, 0.192, 0.000)
		colorBeach     (0.286, 0.248, 0.228, 0.000)
		colorDesert    (0.310, 0.266, 0.222, 0.000)
		colorLowland   (0.340, 0.285, 0.252, 0.000)
		colorUpland    (0.377, 0.345, 0.306, 0.000)
		colorRock      (0.407, 0.375, 0.330, 0.000)
		colorSnow      (0.444, 0.400, 0.349, 1.000)
		BumpHeight      7.23238
		BumpOffset      1.44648
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0017967
		Period          0.000997619
		Eccentricity    1.55108e-005
		Inclination     0.00226846
		AscendingNode   165.529
		ArgOfPericenter 100.057
		MeanAnomaly     161.537
	}
}

DwarfMoon	"8.D3"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.40192e-010
	Radius          8.8866
	InertiaMoment   0.397697

	Oblateness      0.248447

	Obliquity       -0.0108999
	EqAscendNode    -71.8132
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.658 0.652 0.648)

	Surface
	{
		SurfStyle       0.505052
		OceanStyle      0.636913
		Randomize      (0.490, -0.749, 0.974)
		colorDistMagn   0.529344
		colorDistFreq   0.0495093
		detailScale     242.663
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.475869
		terraceProb     0.318128
		erosion         0
		montesMagn      0.267765
		montesFreq      3.03407
		montesSpiky     0.990592
		montesFraction  0.378664
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.173026
		hillsFraction   0.566865
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210168
		craterFreq      0.212095
		craterDensity   0.93631
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   89.9006
		volcanoTemp     1287.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.222, 0.181, 0.000)
		colorShelf     (0.263, 0.228, 0.207, 0.000)
		colorBeach     (0.309, 0.267, 0.246, 0.000)
		colorDesert    (0.336, 0.287, 0.240, 0.000)
		colorLowland   (0.369, 0.307, 0.272, 0.000)
		colorUpland    (0.408, 0.372, 0.331, 0.000)
		colorRock      (0.441, 0.405, 0.356, 0.000)
		colorSnow      (0.480, 0.431, 0.376, 1.000)
		BumpHeight      7.99794
		BumpOffset      1.59959
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.00203653
		Period          0.00120389
		Eccentricity    6.31278e-005
		Inclination     -0.0108999
		AscendingNode   -71.8132
		ArgOfPericenter 125.803
		MeanAnomaly     -26.853
	}
}

Moon	"8.1"
{
	ParentBody     "8"
	Class	       "Desert"

	Mass            0.130993
	Radius          4065.75
	InertiaMoment   0.329407

	Oblateness      0.00565265

	Obliquity       -0.388481
	EqAscendNode    -42.4658
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.672 0.625 0.581)

	Surface
	{
		SurfStyle       0.69921
		OceanStyle      0.345073
		Randomize      (-0.280, -0.801, 0.120)
		colorDistMagn   0.0931591
		colorDistFreq   430.61
		detailScale     10457.3
		colorConversion true
		seaLevel        0.111104
		snowLevel       2
		tropicLatitude  0.0126386
		icecapLatitude  0.796155
		icecapHeight    0.128395
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.09514
		venusFreq       1.42619
		venusMagn       0.57348
		mareFreq        1.23158
		mareDensity     0.0223633
		terraceProb     0.322185
		erosion         0
		montesMagn      0.206517
		montesFreq      141.098
		montesSpiky     0.837699
		montesFraction  0.60486
		dunesMagn       0.0536841
		dunesFreq       30.3604
		dunesFraction   0.186961
		hillsMagn       0.15491
		hillsFreq       492.083
		hillsFraction   0
		hills2Fraction  0
		riversMagn      63.0096
		riversFreq      3.00785
		riversSin       6.42934
		riversOctaves   0
		canyonsMagn     0.0171217
		canyonsFreq     123.497
		canyonFraction  0
		cracksMagn      0.107548
		cracksFreq      0.46186
		cracksOctaves   0
		craterMagn      0.565184
		craterFreq      12.738
		craterDensity   0.280077
		craterOctaves   4.45011
		volcanoMagn     0.684803
		volcanoFreq     2.35235
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.630987
		volcanoRadius   0.345258
		volcanoTemp     1415.3
		lavaCoverTidal  0.32857
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.620, 0.470, 0.000)
		colorBeach     (0.400, 0.380, 0.270, 0.000)
		colorDesert    (0.800, 0.680, 0.500, 0.000)
		colorLowland   (0.670, 0.600, 0.490, 0.000)
		colorUpland    (0.580, 0.490, 0.350, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.670, 0.600, 0.490, 0.000)
		colorUpPlants  (0.580, 0.490, 0.350, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.408939
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          77.3645
		Density         0.0591061
		Pressure        0.026324
		Greenhouse      2.08819
		Bright          9.00174
		Opacity         1
		SkyLight        3.00058
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	49.4783
			CO2   	27.7406
			C2H4  	18.1171
			H2    	2.31664
			C2H2  	1.50291
			C2H6  	0.446931
			N2    	0.384854
			CO    	0.0068535
			H2S   	0.00368535
			He    	0.00090085
			Ne    	0.000610522
			Ar    	0.000537555
			C3H8  	7.83588e-005
			Xe    	1.03914e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00369854
		Period          0.00294635
		Eccentricity    0.0032664
		Inclination     -0.388481
		AscendingNode   -42.4658
		ArgOfPericenter 110.257
		MeanAnomaly     -88.6603
	}
}

Moon	"8.2"
{
	ParentBody     "8"
	Class	       "Desert"

	Mass            0.0163736
	Radius          2208.32
	InertiaMoment   0.364997

	Oblateness      0.00176192

	Obliquity       0.401488
	EqAscendNode    -90.5739
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.768 0.716 0.689)

	Surface
	{
		SurfStyle       0.945026
		OceanStyle      0.105382
		Randomize      (-0.094, -0.819, -0.830)
		colorDistMagn   0.073758
		colorDistFreq   213.673
		detailScale     5679.93
		colorConversion true
		seaLevel        0.136502
		snowLevel       2
		tropicLatitude  0.00986268
		icecapLatitude  0.748798
		icecapHeight    0.155171
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.01363
		venusFreq       0.459374
		venusMagn       0.583516
		mareFreq        0.961511
		mareDensity     0.00374911
		terraceProb     0.258605
		erosion         0
		montesMagn      0.139097
		montesFreq      117.588
		montesSpiky     0.809454
		montesFraction  0.0530759
		dunesMagn       0.0654673
		dunesFreq       21.0629
		dunesFraction   0.371501
		hillsMagn       0.122834
		hillsFreq       320.491
		hillsFraction   0
		hills2Fraction  0
		riversMagn      62.3185
		riversFreq      3.12177
		riversSin       5.77982
		riversOctaves   0
		canyonsMagn     0.013476
		canyonsFreq     56.2878
		canyonFraction  0
		cracksMagn      0.0858017
		cracksFreq      0.195003
		cracksOctaves   0
		craterMagn      0.665115
		craterFreq      5.99037
		craterDensity   0.367441
		craterOctaves   4.2922
		volcanoMagn     0.458768
		volcanoFreq     2.83957
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.68132
		volcanoRadius   0.640277
		volcanoTemp     1474.05
		lavaCoverTidal  0.213735
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.640, 0.500, 0.420, 0.000)
		colorShelf     (0.680, 0.500, 0.470, 0.000)
		colorBeach     (0.480, 0.380, 0.280, 0.000)
		colorDesert    (0.410, 0.280, 0.180, 0.000)
		colorLowland   (0.310, 0.230, 0.170, 0.000)
		colorUpland    (0.510, 0.330, 0.190, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.310, 0.230, 0.170, 0.000)
		colorUpPlants  (0.510, 0.330, 0.190, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.393023
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          110.416
		Density         0.0606977
		Pressure        0.0355295
		Greenhouse      3.61814
		Bright          9.0497
		Opacity         1
		SkyLight        3.01657
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	99.9017
			N2    	0.0812069
			C2H4  	0.015216
			CO    	0.00136194
			He    	0.000238792
			Ar    	0.00023457
			Ne    	1.96472e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00619065
		Period          0.00638052
		Eccentricity    0.0397953
		Inclination     0.401488
		AscendingNode   -90.5739
		ArgOfPericenter 30.8801
		MeanAnomaly     -155.774
	}
}

Moon	"8.3"
{
	ParentBody     "8"
	Class	       "IceWorld"

	Mass            0.0201122
	Radius          2221.73
	InertiaMoment   0.358331

	Obliquity       -0.165211
	EqAscendNode    130.431
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.619 0.529 0.449)

	Surface
	{
		SurfStyle       0.350842
		OceanStyle      0.807145
		Randomize      (0.853, -0.712, 0.437)
		colorDistMagn   0.0716912
		colorDistFreq   285.587
		detailScale     5714.42
		colorConversion true
		drivenDarkening 0
		seaLevel        0.228017
		snowLevel       2
		tropicLatitude  0.00241687
		icecapLatitude  0.969151
		icecapHeight    0.228721
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.79652
		venusFreq       1.26671
		venusMagn       0
		mareFreq        0.966185
		mareDensity     0.00364751
		terraceProb     0.36619
		erosion         0
		montesMagn      0.144414
		montesFreq      72.3315
		montesSpiky     0.87846
		montesFraction  0.236505
		dunesMagn       0.031328
		dunesFreq       2922.06
		dunesFraction   0.411019
		hillsMagn       0.141654
		hillsFreq       268.941
		hillsFraction   0.765697
		hills2Fraction  0.290541
		riversMagn      67.7816
		riversFreq      2.19384
		riversSin       6.42236
		riversOctaves   0
		canyonsMagn     0.544538
		canyonsFreq     0.978776
		canyonFraction  0
		cracksMagn      0.0667706
		cracksFreq      0.799241
		cracksOctaves   1
		craterMagn      0.599663
		craterFreq      6.86519
		craterDensity   0.956196
		craterOctaves   11
		craterRayedFactor 0.26029
		volcanoMagn     0.462489
		volcanoFreq     1.13296
		volcanoDensity  0.0589089
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.36935
		volcanoRadius   0.6957
		volcanoTemp     1593.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.619, 0.529, 0.449, 0.500)
		colorShelf     (0.588, 0.503, 0.427, 0.500)
		colorBeach     (0.433, 0.370, 0.314, 0.750)
		colorDesert    (0.526, 0.450, 0.382, 1.000)
		colorLowland   (0.544, 0.466, 0.395, 1.000)
		colorUpland    (0.575, 0.492, 0.418, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.544, 0.466, 0.395, 1.000)
		colorUpPlants  (0.575, 0.492, 0.418, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.99996
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Pluto"
		Height          166.63
		Density         3.99159e-006
		Pressure        9.04557e-007
		Greenhouse      0.015822
		Bright          1.31895
		Opacity         0
		SkyLight        0.439651
		Hue             0.0242684
		Saturation      1

		Composition
		{
			He    	50.0269
			Ne    	49.9622
			N2    	0.0108564
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.010362
		Period          0.013817
		Eccentricity    0.00814742
		Inclination     -0.165211
		AscendingNode   130.431
		ArgOfPericenter 62.296
		MeanAnomaly     8.9859
	}
}

DwarfMoon	"8.D4"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.15946e-009
	Radius          15.109
	InertiaMoment   0.399091

	Obliquity       67.9048
	EqAscendNode    -20.3998
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.513 0.506 0.502)

	Surface
	{
		SurfStyle       0.546082
		OceanStyle      0.411248
		Randomize      (0.274, 0.025, 0.697)
		colorDistMagn   0.508829
		colorDistFreq   0.0268835
		detailScale     412.577
		colorConversion true
		snowLevel       2
		tropicLatitude  0.748457
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5972
		terraceProb     0.110981
		erosion         0
		montesMagn      0.51915
		montesFreq      2.48045
		montesSpiky     0.757803
		montesFraction  0.597722
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.429086
		hillsFraction   0.552044
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245765
		craterFreq      0.180023
		craterDensity   0.933173
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   69.5687
		volcanoTemp     1653.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.172, 0.141, 0.000)
		colorShelf     (0.205, 0.177, 0.161, 0.000)
		colorBeach     (0.241, 0.207, 0.191, 0.000)
		colorDesert    (0.262, 0.223, 0.186, 0.000)
		colorLowland   (0.287, 0.238, 0.211, 0.000)
		colorUpland    (0.318, 0.288, 0.256, 0.000)
		colorRock      (0.344, 0.314, 0.276, 0.000)
		colorSnow      (0.375, 0.334, 0.291, 1.000)
		BumpHeight      13.5981
		BumpOffset      2.71962
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0620896
		Period          0.202666
		Eccentricity    0.426035
		Inclination     67.9048
		AscendingNode   -20.3998
		ArgOfPericenter -32.7632
		MeanAnomaly     -33.9155
	}
}

DwarfMoon	"8.D5"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.65164e-009
	Radius          16.3278
	InertiaMoment   0.399998

	RotationPeriod  7212.24
	Obliquity       -3.51995
	EqAscendNode    -46.0037

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.742 0.740 0.737)

	Surface
	{
		SurfStyle       0.432749
		OceanStyle      0.217923
		Randomize      (-0.159, 0.204, 0.381)
		colorDistMagn   0.242842
		colorDistFreq   0.176635
		detailScale     445.857
		colorConversion true
		snowLevel       2
		tropicLatitude  0.112848
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.702637
		terraceProb     0.572639
		erosion         0
		montesMagn      0.403799
		montesFreq      2.63079
		montesSpiky     0.87627
		montesFraction  0.186814
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.718222
		hillsFraction   0.74735
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261307
		craterFreq      0.238492
		craterDensity   1.00038
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   62.9906
		volcanoTemp     1650.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.296, 0.295, 0.000)
		colorShelf     (0.315, 0.315, 0.313, 0.000)
		colorBeach     (0.334, 0.333, 0.332, 0.000)
		colorDesert    (0.352, 0.352, 0.350, 0.000)
		colorLowland   (0.371, 0.370, 0.368, 0.000)
		colorUpland    (0.390, 0.389, 0.387, 0.000)
		colorRock      (0.408, 0.407, 0.405, 0.000)
		colorSnow      (0.427, 0.426, 0.424, 1.000)
		BumpHeight      14.695
		BumpOffset      2.939
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0627061
		Period          0.205692
		Eccentricity    0.248995
		Inclination     -3.51995
		AscendingNode   -46.0037
		ArgOfPericenter -152.139
		MeanAnomaly     -64.6746
	}
}

DwarfMoon	"8.D6"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.32741e-009
	Radius          17.4139
	InertiaMoment   0.398128

	Obliquity       77.8867
	EqAscendNode    -118.48
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.696 0.567 0.468)

	Surface
	{
		SurfStyle       0.193264
		OceanStyle      0.486233
		Randomize      (0.883, -0.682, 0.969)
		colorDistMagn   0.4429
		colorDistFreq   0.139477
		detailScale     475.515
		colorConversion true
		snowLevel       2
		tropicLatitude  0.866091
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552088
		terraceProb     0.158048
		erosion         0
		montesMagn      0.538713
		montesFreq      2.25335
		montesSpiky     0.812443
		montesFraction  0.610664
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.641211
		hillsFraction   0.784874
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250934
		craterFreq      0.236996
		craterDensity   0.725822
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   56.5932
		volcanoTemp     1383.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.227, 0.187, 0.000)
		colorShelf     (0.296, 0.241, 0.199, 0.000)
		colorBeach     (0.313, 0.255, 0.211, 0.000)
		colorDesert    (0.331, 0.269, 0.222, 0.000)
		colorLowland   (0.348, 0.283, 0.234, 0.000)
		colorUpland    (0.366, 0.298, 0.246, 0.000)
		colorRock      (0.383, 0.312, 0.257, 0.000)
		colorSnow      (0.400, 0.326, 0.269, 1.000)
		BumpHeight      15.6725
		BumpOffset      3.1345
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0631311
		Period          0.207787
		Eccentricity    0.0120843
		Inclination     77.8867
		AscendingNode   -118.48
		ArgOfPericenter -95.4584
		MeanAnomaly     78.2094
	}
}

DwarfMoon	"8.D7"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.25022e-009
	Radius          22.7553
	InertiaMoment   0.399227

	Obliquity       -1.43184
	EqAscendNode    23.2063
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.688 0.568 0.464)

	Surface
	{
		SurfStyle       0.501018
		OceanStyle      0.660953
		Randomize      (0.711, 0.995, 0.419)
		colorDistMagn   0.891849
		colorDistFreq   0.204268
		detailScale     621.372
		colorConversion true
		snowLevel       2
		tropicLatitude  0.048939
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.691255
		terraceProb     0.219863
		erosion         0
		montesMagn      0.402974
		montesFreq      2.70248
		montesSpiky     0.987364
		montesFraction  0.790419
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.37042
		hillsFraction   0.394405
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275278
		craterFreq      0.22043
		craterDensity   0.783557
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   62.5796
		volcanoTemp     1516.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.193, 0.130, 0.000)
		colorShelf     (0.275, 0.199, 0.149, 0.000)
		colorBeach     (0.323, 0.233, 0.176, 0.000)
		colorDesert    (0.351, 0.250, 0.172, 0.000)
		colorLowland   (0.385, 0.267, 0.195, 0.000)
		colorUpland    (0.427, 0.324, 0.237, 0.000)
		colorRock      (0.461, 0.352, 0.255, 0.000)
		colorSnow      (0.502, 0.375, 0.269, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0635289
		Period          0.209754
		Eccentricity    0.00408513
		Inclination     -1.43184
		AscendingNode   23.2063
		ArgOfPericenter 7.33487
		MeanAnomaly     -143.789
	}
}

DwarfMoon	"8.D8"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            4.50502e-009
	Radius          23.9009
	InertiaMoment   0.396065

	Obliquity       -84.0676
	EqAscendNode    -25.7561
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.739 0.735 0.732)

	Surface
	{
		SurfStyle       0.841979
		OceanStyle      0.783075
		Randomize      (0.619, 0.298, 0.665)
		colorDistMagn   0.851377
		colorDistFreq   0.439274
		detailScale     652.653
		colorConversion true
		snowLevel       2
		tropicLatitude  0.474327
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380402
		terraceProb     0.293369
		erosion         0
		montesMagn      0.601997
		montesFreq      2.65928
		montesSpiky     0.926992
		montesFraction  0.807664
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.30624
		hillsFraction   0.667982
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245219
		craterFreq      0.220291
		craterDensity   0.731461
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   55.8304
		volcanoTemp     1084.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.250, 0.205, 0.000)
		colorShelf     (0.296, 0.257, 0.234, 0.000)
		colorBeach     (0.347, 0.301, 0.278, 0.000)
		colorDesert    (0.377, 0.323, 0.271, 0.000)
		colorLowland   (0.414, 0.345, 0.307, 0.000)
		colorUpland    (0.458, 0.419, 0.373, 0.000)
		colorRock      (0.495, 0.455, 0.402, 0.000)
		colorSnow      (0.540, 0.485, 0.424, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0641147
		Period          0.212662
		Eccentricity    0.246033
		Inclination     -84.0676
		AscendingNode   -25.7561
		ArgOfPericenter 136.353
		MeanAnomaly     117.905
	}
}

DwarfMoon	"8.D9"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            6.20595e-009
	Radius          25.5289
	InertiaMoment   0.398313

	Obliquity       63.269
	EqAscendNode    160.049
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.785 0.749 0.708)

	Surface
	{
		SurfStyle       0.975814
		OceanStyle      0.468872
		Randomize      (-0.534, 0.195, -0.870)
		colorDistMagn   0.660964
		colorDistFreq   0.426696
		detailScale     697.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.305695
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.568147
		terraceProb     0.127149
		erosion         0
		montesMagn      0.626446
		montesFreq      2.94282
		montesSpiky     0.967749
		montesFraction  0.572452
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.85694
		hillsFraction   0.666026
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241991
		craterFreq      0.277965
		craterDensity   0.982225
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   50.8083
		volcanoTemp     1254.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.262, 0.283, 0.050)
		colorShelf     (0.314, 0.307, 0.326, 0.040)
		colorBeach     (0.361, 0.352, 0.368, 0.030)
		colorDesert    (0.408, 0.397, 0.418, 0.020)
		colorLowland   (0.455, 0.442, 0.460, 0.030)
		colorUpland    (0.502, 0.487, 0.503, 0.050)
		colorRock      (0.549, 0.532, 0.559, 0.020)
		colorSnow      (0.549, 0.532, 0.559, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0645092
		Period          0.214627
		Eccentricity    0.174981
		Inclination     63.269
		AscendingNode   160.049
		ArgOfPericenter 56.6765
		MeanAnomaly     -65.7342
	}
}

DwarfMoon	"8.D10"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            8.50673e-009
	Radius          27.0788
	InertiaMoment   0.39936

	RotationPeriod  11412.7
	Obliquity       17.7022
	EqAscendNode    164.904

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.476 0.471 0.468)

	Surface
	{
		SurfStyle       0.960008
		OceanStyle      0.830182
		Randomize      (-0.429, 0.291, 0.814)
		colorDistMagn   0.720531
		colorDistFreq   0.494552
		detailScale     739.431
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0798206
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.683556
		terraceProb     0.2957
		erosion         0
		montesMagn      0.607944
		montesFreq      3.2243
		montesSpiky     0.891829
		montesFraction  0.542745
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.81696
		hillsFraction   0.495883
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.280009
		craterFreq      0.249145
		craterDensity   0.783097
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.0313
		volcanoTemp     1208.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.165, 0.187, 0.050)
		colorShelf     (0.191, 0.193, 0.215, 0.040)
		colorBeach     (0.219, 0.221, 0.243, 0.030)
		colorDesert    (0.248, 0.249, 0.276, 0.020)
		colorLowland   (0.276, 0.278, 0.304, 0.030)
		colorUpland    (0.305, 0.306, 0.332, 0.050)
		colorRock      (0.334, 0.334, 0.370, 0.020)
		colorSnow      (0.334, 0.334, 0.370, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0649823
		Period          0.216993
		Eccentricity    0.21216
		Inclination     17.7022
		AscendingNode   164.904
		ArgOfPericenter -76.9837
		MeanAnomaly     159.208
	}
}

DwarfMoon	"8.D11"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.16152e-008
	Radius          35.293
	InertiaMoment   0.3967

	Obliquity       76.509
	EqAscendNode    171.188
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.741 0.738 0.735)

	Surface
	{
		SurfStyle       0.187119
		OceanStyle      0.653414
		Randomize      (-0.767, -0.039, -0.938)
		colorDistMagn   0.824876
		colorDistFreq   0.941737
		detailScale     963.735
		colorConversion true
		snowLevel       2
		tropicLatitude  0.148983
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.257671
		terraceProb     0.153424
		erosion         0
		montesMagn      0.440413
		montesFreq      3.52561
		montesSpiky     0.965659
		montesFraction  0.852404
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.05642
		hillsFraction   0.816847
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252061
		craterFreq      0.257909
		craterDensity   0.910366
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.3431
		volcanoTemp     1996.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.295, 0.294, 0.000)
		colorShelf     (0.315, 0.314, 0.312, 0.000)
		colorBeach     (0.334, 0.332, 0.331, 0.000)
		colorDesert    (0.352, 0.351, 0.349, 0.000)
		colorLowland   (0.371, 0.369, 0.367, 0.000)
		colorUpland    (0.389, 0.388, 0.386, 0.000)
		colorRock      (0.408, 0.406, 0.404, 0.000)
		colorSnow      (0.426, 0.424, 0.422, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0652324
		Period          0.218247
		Eccentricity    0.108736
		Inclination     76.509
		AscendingNode   171.188
		ArgOfPericenter -118.456
		MeanAnomaly     -97.8064
	}
}

DwarfMoon	"8.D12"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.58134e-008
	Radius          36.5606
	InertiaMoment   0.398485

	RotationPeriod  3858.33
	Obliquity       -3.6498
	EqAscendNode    14.4891

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.539 0.387 0.308)

	Surface
	{
		SurfStyle       0.850571
		OceanStyle      0.614677
		Randomize      (-0.710, 0.725, 0.107)
		colorDistMagn   0.764342
		colorDistFreq   0.382521
		detailScale     998.347
		colorConversion true
		snowLevel       2
		tropicLatitude  0.126048
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502605
		terraceProb     0.257945
		erosion         0
		montesMagn      0.459708
		montesFreq      2.6835
		montesSpiky     0.994088
		montesFraction  0.604107
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.65889
		hillsFraction   0.774847
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227932
		craterFreq      0.215252
		craterDensity   0.71293
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   45.5833
		volcanoTemp     1449
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.135, 0.123, 0.050)
		colorShelf     (0.216, 0.159, 0.142, 0.040)
		colorBeach     (0.248, 0.182, 0.160, 0.030)
		colorDesert    (0.280, 0.205, 0.182, 0.020)
		colorLowland   (0.313, 0.228, 0.200, 0.030)
		colorUpland    (0.345, 0.252, 0.219, 0.050)
		colorRock      (0.377, 0.275, 0.243, 0.020)
		colorSnow      (0.377, 0.275, 0.243, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0655969
		Period          0.220078
		Eccentricity    0.385037
		Inclination     -3.6498
		AscendingNode   14.4891
		ArgOfPericenter 87.13
		MeanAnomaly     128.401
	}
}

DwarfMoon	"8.D13"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.14866e-008
	Radius          38.8386
	InertiaMoment   0.39949

	RotationPeriod  7788.48
	Obliquity       37.2399
	EqAscendNode    139.569

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.804 0.708 0.667)

	Surface
	{
		SurfStyle       0.680687
		OceanStyle      0.145507
		Randomize      (0.094, -0.933, 0.684)
		colorDistMagn   0.527165
		colorDistFreq   0.811552
		detailScale     1060.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.408975
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.386306
		terraceProb     0.171449
		erosion         0
		montesMagn      0.631568
		montesFreq      3.74306
		montesSpiky     0.866575
		montesFraction  0.63023
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.20493
		hillsFraction   0.508185
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236181
		craterFreq      0.164024
		craterDensity   0.797336
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.5419
		volcanoTemp     1155.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.241, 0.187, 0.000)
		colorShelf     (0.322, 0.248, 0.213, 0.000)
		colorBeach     (0.378, 0.290, 0.254, 0.000)
		colorDesert    (0.410, 0.311, 0.247, 0.000)
		colorLowland   (0.450, 0.333, 0.280, 0.000)
		colorUpland    (0.498, 0.403, 0.340, 0.000)
		colorRock      (0.539, 0.439, 0.367, 0.000)
		colorSnow      (0.587, 0.467, 0.387, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0660032
		Period          0.222127
		Eccentricity    0.32052
		Inclination     37.2399
		AscendingNode   139.569
		ArgOfPericenter -24.3524
		MeanAnomaly     84.5164
	}
}

DwarfMoon	"8.D14"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.9163e-008
	Radius          41.1629
	InertiaMoment   0.397112

	Obliquity       -8.35655
	EqAscendNode    -58.5253
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.720 0.646 0.614)

	Surface
	{
		SurfStyle       0.665961
		OceanStyle      0.438372
		Randomize      (0.373, 0.176, 0.629)
		colorDistMagn   0.530951
		colorDistFreq   0.302758
		detailScale     1124.02
		colorConversion true
		snowLevel       2
		tropicLatitude  0.251527
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.477019
		terraceProb     0.169893
		erosion         0
		montesMagn      0.417016
		montesFreq      3.39488
		montesSpiky     0.996709
		montesFraction  0.487695
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.8525
		hillsFraction   0.740282
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203252
		craterFreq      0.206537
		craterDensity   1.00127
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.7917
		volcanoTemp     1762.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.220, 0.172, 0.000)
		colorShelf     (0.288, 0.226, 0.196, 0.000)
		colorBeach     (0.338, 0.265, 0.233, 0.000)
		colorDesert    (0.367, 0.284, 0.227, 0.000)
		colorLowland   (0.403, 0.304, 0.258, 0.000)
		colorUpland    (0.446, 0.368, 0.313, 0.000)
		colorRock      (0.482, 0.401, 0.337, 0.000)
		colorSnow      (0.525, 0.426, 0.356, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0664175
		Period          0.224221
		Eccentricity    0.352567
		Inclination     -8.35655
		AscendingNode   -58.5253
		ArgOfPericenter -147.327
		MeanAnomaly     -6.97294
	}
}

DwarfMoon	"8.D15"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.95731e-008
	Radius          54.1267
	InertiaMoment   0.398647

	RotationPeriod  3951.99
	Obliquity       -17.4034
	EqAscendNode    -54.1714

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.451 0.392 0.356)

	Surface
	{
		SurfStyle       0.590197
		OceanStyle      0.300198
		Randomize      (0.750, 0.550, 0.538)
		colorDistMagn   0.297194
		colorDistFreq   2.20618
		detailScale     1478.02
		colorConversion true
		snowLevel       2
		tropicLatitude  0.513357
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.587845
		terraceProb     0.219666
		erosion         0
		montesMagn      0.48312
		montesFreq      2.7959
		montesSpiky     0.857471
		montesFraction  0.0972392
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.87916
		hillsFraction   0.721563
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240524
		craterFreq      0.177483
		craterDensity   0.996215
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.6597
		volcanoTemp     1674.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.133, 0.100, 0.000)
		colorShelf     (0.181, 0.137, 0.114, 0.000)
		colorBeach     (0.212, 0.161, 0.135, 0.000)
		colorDesert    (0.230, 0.172, 0.132, 0.000)
		colorLowland   (0.253, 0.184, 0.150, 0.000)
		colorUpland    (0.280, 0.223, 0.182, 0.000)
		colorRock      (0.302, 0.243, 0.196, 0.000)
		colorSnow      (0.330, 0.259, 0.206, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0666541
		Period          0.225421
		Eccentricity    0.313215
		Inclination     -17.4034
		AscendingNode   -54.1714
		ArgOfPericenter -157.44
		MeanAnomaly     30.0073
	}
}

DwarfMoon	"8.D16"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            5.37331e-008
	Radius          55.3439
	InertiaMoment   0.399618

	Obliquity       29.0935
	EqAscendNode    -21.2628
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.516 0.509 0.502)

	Surface
	{
		SurfStyle       0.694999
		OceanStyle      0.294331
		Randomize      (-0.590, 0.564, 0.677)
		colorDistMagn   0.871582
		colorDistFreq   0.567319
		detailScale     1511.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.839576
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.700828
		terraceProb     0.193006
		erosion         0
		montesMagn      0.581932
		montesFreq      3.61167
		montesSpiky     0.974155
		montesFraction  0.490214
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.4902
		hillsFraction   0.661948
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276109
		craterFreq      0.225161
		craterDensity   0.781364
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.433
		volcanoTemp     1098.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.173, 0.141, 0.000)
		colorShelf     (0.206, 0.178, 0.161, 0.000)
		colorBeach     (0.242, 0.209, 0.191, 0.000)
		colorDesert    (0.263, 0.224, 0.186, 0.000)
		colorLowland   (0.289, 0.239, 0.211, 0.000)
		colorUpland    (0.320, 0.290, 0.256, 0.000)
		colorRock      (0.346, 0.316, 0.276, 0.000)
		colorSnow      (0.377, 0.336, 0.291, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.067082
		Period          0.227594
		Eccentricity    0.401584
		Inclination     29.0935
		AscendingNode   -21.2628
		ArgOfPericenter -16.3713
		MeanAnomaly     -66.3855
	}
}

DwarfMoon	"8.D17"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            7.30697e-008
	Radius          58.7341
	InertiaMoment   0.397429

	RotationPeriod  2694.66
	Obliquity       -50.3757
	EqAscendNode    158.446

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.582 0.574 0.571)

	Surface
	{
		SurfStyle       0.188673
		OceanStyle      0.974345
		Randomize      (0.315, 0.756, -0.547)
		colorDistMagn   0.217041
		colorDistFreq   1.0243
		detailScale     1603.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.285052
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.558108
		terraceProb     0.157064
		erosion         0
		montesMagn      0.579182
		montesFreq      3.61072
		montesSpiky     0.916467
		montesFraction  0.520234
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.5939
		hillsFraction   0.615965
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240087
		craterFreq      0.258041
		craterDensity   0.970776
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.0665
		volcanoTemp     1120.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.229, 0.228, 0.000)
		colorShelf     (0.247, 0.244, 0.243, 0.000)
		colorBeach     (0.262, 0.258, 0.257, 0.000)
		colorDesert    (0.276, 0.273, 0.271, 0.000)
		colorLowland   (0.291, 0.287, 0.285, 0.000)
		colorUpland    (0.305, 0.301, 0.300, 0.000)
		colorRock      (0.320, 0.316, 0.314, 0.000)
		colorSnow      (0.335, 0.330, 0.328, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0676623
		Period          0.230554
		Eccentricity    0.361304
		Inclination     -50.3757
		AscendingNode   158.446
		ArgOfPericenter -139.084
		MeanAnomaly     60.6094
	}
}

DwarfMoon	"8.D18"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            9.96044e-008
	Radius          62.4418
	InertiaMoment   0.3988

	Obliquity       21.6655
	EqAscendNode    100.442
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.530 0.526 0.523)

	Surface
	{
		SurfStyle       0.551871
		OceanStyle      0.859833
		Randomize      (-0.460, -0.268, -0.603)
		colorDistMagn   0.915332
		colorDistFreq   2.28468
		detailScale     1705.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.459063
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622394
		terraceProb     0.249904
		erosion         0
		montesMagn      0.451698
		montesFreq      2.81002
		montesSpiky     0.887597
		montesFraction  0.595292
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.01407
		hillsFraction   0.794416
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.282254
		craterFreq      0.22502
		craterDensity   1.02001
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.02
		volcanoTemp     1561.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.179, 0.146, 0.000)
		colorShelf     (0.212, 0.184, 0.167, 0.000)
		colorBeach     (0.249, 0.216, 0.199, 0.000)
		colorDesert    (0.270, 0.232, 0.194, 0.000)
		colorLowland   (0.297, 0.247, 0.220, 0.000)
		colorUpland    (0.329, 0.300, 0.267, 0.000)
		colorRock      (0.355, 0.326, 0.288, 0.000)
		colorSnow      (0.387, 0.347, 0.303, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0682399
		Period          0.233513
		Eccentricity    0.0469601
		Inclination     21.6655
		AscendingNode   100.442
		ArgOfPericenter 18.5569
		MeanAnomaly     15.5588
	}
}

DwarfMoon	"8.D19"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.36232e-007
	Radius          84.1871
	InertiaMoment   0.399745

	Obliquity       -14.6874
	EqAscendNode    -34.315
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.613 0.425 0.357)

	Surface
	{
		SurfStyle       0.781417
		OceanStyle      0.473586
		Randomize      (0.577, 0.840, 0.268)
		colorDistMagn   0.179903
		colorDistFreq   4.09869
		detailScale     2298.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.470091
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.723093
		terraceProb     0.299443
		erosion         0
		montesMagn      0.553413
		montesFreq      2.77337
		montesSpiky     0.97526
		montesFraction  0.51552
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.3673
		hillsFraction   0.493161
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205249
		craterFreq      0.224013
		craterDensity   0.942853
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.7612
		volcanoTemp     1840.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.145, 0.100, 0.000)
		colorShelf     (0.245, 0.149, 0.114, 0.000)
		colorBeach     (0.288, 0.174, 0.136, 0.000)
		colorDesert    (0.313, 0.187, 0.132, 0.000)
		colorLowland   (0.343, 0.200, 0.150, 0.000)
		colorUpland    (0.380, 0.242, 0.182, 0.000)
		colorRock      (0.411, 0.264, 0.196, 0.000)
		colorSnow      (0.447, 0.281, 0.207, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0688544
		Period          0.236674
		Eccentricity    0.313893
		Inclination     -14.6874
		AscendingNode   -34.315
		ArgOfPericenter -154.851
		MeanAnomaly     -70.1795
	}
}

DwarfMoon	"8.D20"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.87148e-007
	Radius          84.5105
	InertiaMoment   0.397692

	Obliquity       26.0771
	EqAscendNode    166.039
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.554 0.549 0.547)

	Surface
	{
		SurfStyle       0.051138
		OceanStyle      0.745521
		Randomize      (0.254, -0.772, -0.023)
		colorDistMagn   0.228221
		colorDistFreq   5.63054
		detailScale     2307.7
		colorConversion true
		snowLevel       2
		tropicLatitude  0.106691
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.396501
		terraceProb     0.387063
		erosion         0
		montesMagn      0.611566
		montesFreq      3.51213
		montesSpiky     0.995547
		montesFraction  0.608755
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.9041
		hillsFraction   0.729843
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252934
		craterFreq      0.267422
		craterDensity   0.785543
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   30.6284
		volcanoTemp     1515.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.220, 0.219, 0.000)
		colorShelf     (0.236, 0.233, 0.232, 0.000)
		colorBeach     (0.249, 0.247, 0.246, 0.000)
		colorDesert    (0.263, 0.261, 0.260, 0.000)
		colorLowland   (0.277, 0.275, 0.273, 0.000)
		colorUpland    (0.291, 0.288, 0.287, 0.000)
		colorRock      (0.305, 0.302, 0.301, 0.000)
		colorSnow      (0.319, 0.316, 0.314, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0694719
		Period          0.239865
		Eccentricity    0.420427
		Inclination     26.0771
		AscendingNode   166.039
		ArgOfPericenter -124.407
		MeanAnomaly     -112.519
	}
}

DwarfMoon	"8.D21"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.58514e-007
	Radius          90.0023
	InertiaMoment   0.398947

	Obliquity       -14.5881
	EqAscendNode    -115.072
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.683 0.609 0.491)

	Surface
	{
		SurfStyle       0.0528729
		OceanStyle      0.517634
		Randomize      (0.224, 0.069, 0.824)
		colorDistMagn   0.804613
		colorDistFreq   4.16512
		detailScale     2457.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0.267907
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.277407
		terraceProb     0.162883
		erosion         0
		montesMagn      0.524125
		montesFreq      3.74418
		montesSpiky     0.89231
		montesFraction  0.839579
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.8026
		hillsFraction   0.544147
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261562
		craterFreq      0.260453
		craterDensity   0.914974
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.7535
		volcanoTemp     1792.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.244, 0.196, 0.000)
		colorShelf     (0.290, 0.259, 0.209, 0.000)
		colorBeach     (0.307, 0.274, 0.221, 0.000)
		colorDesert    (0.325, 0.289, 0.233, 0.000)
		colorLowland   (0.342, 0.305, 0.245, 0.000)
		colorUpland    (0.359, 0.320, 0.258, 0.000)
		colorRock      (0.376, 0.335, 0.270, 0.000)
		colorSnow      (0.393, 0.350, 0.282, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0697888
		Period          0.241508
		Eccentricity    0.129791
		Inclination     -14.5881
		AscendingNode   -115.072
		ArgOfPericenter -168.398
		MeanAnomaly     90.6698
	}
}

DwarfMoon	"8.D22"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.59517e-007
	Radius          96.4264
	InertiaMoment   0.39987

	Obliquity       19.0121
	EqAscendNode    -90.5377
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.712 0.709 0.708)

	Surface
	{
		SurfStyle       0.687498
		OceanStyle      0.87976
		Randomize      (0.660, 0.581, 0.779)
		colorDistMagn   0.227141
		colorDistFreq   6.01991
		detailScale     2633.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.446325
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.583211
		terraceProb     0.177777
		erosion         0
		montesMagn      0.524446
		montesFreq      3.47934
		montesSpiky     0.890617
		montesFraction  0.801485
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.1718
		hillsFraction   0.658189
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236775
		craterFreq      0.311675
		craterDensity   0.847936
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.214
		volcanoTemp     1739.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.241, 0.198, 0.000)
		colorShelf     (0.285, 0.248, 0.226, 0.000)
		colorBeach     (0.335, 0.291, 0.269, 0.000)
		colorDesert    (0.363, 0.312, 0.262, 0.000)
		colorLowland   (0.399, 0.333, 0.297, 0.000)
		colorUpland    (0.441, 0.404, 0.361, 0.000)
		colorRock      (0.477, 0.440, 0.389, 0.000)
		colorSnow      (0.520, 0.468, 0.410, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0703802
		Period          0.244584
		Eccentricity    0.444468
		Inclination     19.0121
		AscendingNode   -90.5377
		ArgOfPericenter -93.4275
		MeanAnomaly     1.96045
	}
}

DwarfMoon	"8.D23"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            5.04091e-007
	Radius          142.005
	InertiaMoment   0.39792

	RotationPeriod  4326.38
	Obliquity       -44.8973
	EqAscendNode    154.628

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.786 0.700 0.616)

	Surface
	{
		SurfStyle       0.875359
		OceanStyle      0.514551
		Randomize      (-0.971, -0.205, 0.887)
		colorDistMagn   0.114712
		colorDistFreq   5.48641
		detailScale     3877.69
		colorConversion true
		snowLevel       2
		tropicLatitude  0.306273
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.350975
		terraceProb     0.295563
		erosion         0
		montesMagn      0.426737
		montesFreq      2.35425
		montesSpiky     0.945514
		montesFraction  0.520687
		dunesFraction   0
		hillsMagn       0
		hillsFreq       56.0684
		hillsFraction   0.679913
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215746
		craterFreq      0.710275
		craterDensity   0.987662
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.3585
		volcanoTemp     1257.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.245, 0.247, 0.050)
		colorShelf     (0.314, 0.287, 0.284, 0.040)
		colorBeach     (0.362, 0.329, 0.321, 0.030)
		colorDesert    (0.409, 0.371, 0.364, 0.020)
		colorLowland   (0.456, 0.413, 0.401, 0.030)
		colorUpland    (0.503, 0.455, 0.438, 0.050)
		colorRock      (0.550, 0.497, 0.487, 0.020)
		colorSnow      (0.550, 0.497, 0.487, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0708
		Period          0.246776
		Eccentricity    0.479643
		Inclination     -44.8973
		AscendingNode   154.628
		ArgOfPericenter 173.246
		MeanAnomaly     -134.255
	}
}

DwarfMoon	"8.D24"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            7.13787e-007
	Radius          133.098
	InertiaMoment   0.399088

	RotationPeriod  4373.94
	Obliquity       -0.977181
	EqAscendNode    -155.228

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.486 0.481 0.480)

	Surface
	{
		SurfStyle       0.311727
		OceanStyle      0.154294
		Randomize      (0.792, 0.718, 0.975)
		colorDistMagn   0.34393
		colorDistFreq   8.38704
		detailScale     3634.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00731603
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.384976
		terraceProb     0.33715
		erosion         0
		montesMagn      0.460566
		montesFreq      2.8264
		montesSpiky     0.993506
		montesFraction  0.627396
		dunesFraction   0
		hillsMagn       0
		hillsFreq       52.7996
		hillsFraction   0.79608
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263857
		craterFreq      0.643393
		craterDensity   0.855101
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.6998
		volcanoTemp     1353.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.193, 0.192, 0.000)
		colorShelf     (0.207, 0.205, 0.204, 0.000)
		colorBeach     (0.219, 0.217, 0.216, 0.000)
		colorDesert    (0.231, 0.229, 0.228, 0.000)
		colorLowland   (0.243, 0.241, 0.240, 0.000)
		colorUpland    (0.255, 0.253, 0.252, 0.000)
		colorRock      (0.268, 0.265, 0.264, 0.000)
		colorSnow      (0.280, 0.277, 0.276, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0713179
		Period          0.249489
		Eccentricity    0.194058
		Inclination     -0.977181
		AscendingNode   -155.228
		ArgOfPericenter 75.1499
		MeanAnomaly     112.283
	}
}

DwarfMoon	"8.D25"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.02269e-006
	Radius          143.158
	InertiaMoment   0.399995

	RotationPeriod  3317
	Obliquity       -7.59327
	EqAscendNode    8.0039

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.506 0.499 0.492)

	Surface
	{
		SurfStyle       0.740926
		OceanStyle      0.927804
		Randomize      (-0.047, -0.627, 0.001)
		colorDistMagn   0.354419
		colorDistFreq   5.05808
		detailScale     3909.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.261335
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.379465
		terraceProb     0.199326
		erosion         0
		montesMagn      0.435376
		montesFreq      2.80221
		montesSpiky     0.931992
		montesFraction  0.377848
		dunesFraction   0
		hillsMagn       0
		hillsFreq       63.6462
		hillsFraction   0.534608
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223245
		craterFreq      0.580026
		craterDensity   1.05836
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.1948
		volcanoTemp     1850.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.170, 0.138, 0.000)
		colorShelf     (0.202, 0.175, 0.157, 0.000)
		colorBeach     (0.238, 0.204, 0.187, 0.000)
		colorDesert    (0.258, 0.219, 0.182, 0.000)
		colorLowland   (0.283, 0.234, 0.207, 0.000)
		colorUpland    (0.314, 0.284, 0.251, 0.000)
		colorRock      (0.339, 0.309, 0.270, 0.000)
		colorSnow      (0.369, 0.329, 0.285, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
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
		RefPlane        "Equator"
		SemiMajorAxis   0.0718466
		Period          0.252268
		Eccentricity    0.233824
		Inclination     -7.59327
		AscendingNode   8.0039
		ArgOfPericenter 44.9526
		MeanAnomaly     -101.903
	}
}

Comet	"C1"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.91101e-008
	Radius          35.1901
	InertiaMoment   0.399679

	Oblateness      0.0100247

	RotationPeriod  46.5856
	Obliquity       240.731
	EqAscendNode    60.4625

	AbsMagn         10.8337
	SlopeParam      3.94742
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.773 0.685 0.616)

	Surface
	{
		SurfStyle       0.868652
		OceanStyle      0.524702
		Randomize      (-0.768, 0.670, -0.705)
		colorDistMagn   0.487417
		colorDistFreq   0.504258
		detailScale     960.926
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996022
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536306
		terraceProb     0.586135
		erosion         0
		montesMagn      0.596046
		montesFreq      3.81922
		montesSpiky     0.941982
		montesFraction  0.515617
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.93207
		hillsFraction   0.691848
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219044
		craterFreq      0.22308
		craterDensity   0.848979
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   39.9112
		volcanoTemp     1415.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.240, 0.246, 0.050)
		colorShelf     (0.309, 0.281, 0.283, 0.040)
		colorBeach     (0.356, 0.322, 0.320, 0.030)
		colorDesert    (0.402, 0.363, 0.363, 0.020)
		colorLowland   (0.448, 0.404, 0.400, 0.030)
		colorUpland    (0.495, 0.445, 0.437, 0.050)
		colorRock      (0.541, 0.486, 0.487, 0.020)
		colorSnow      (0.541, 0.486, 0.487, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.911056
		GasToDust   0.25
		Particles   2820
		GasBright   0.0941904
		DustBright  0.168998
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.12198
		Period          10.9381
		Eccentricity    0.894735
		Inclination     111.193
		AscendingNode   -109.079
		ArgOfPericenter 37.8245
		MeanAnomaly     -98.1053
	}
}

Comet	"C2"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            5.88416e-016
	Radius          0.120966
	InertiaMoment   0.39851

	Oblateness      0.0142546

	RotationPeriod  44.7725
	Obliquity       193.937
	EqAscendNode    45.0399

	AbsMagn         12.9676
	SlopeParam      2.89682
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.405 0.399 0.397)

	Surface
	{
		SurfStyle       0.201221
		OceanStyle      0.927155
		Randomize      (-0.356, -0.753, -0.549)
		colorDistMagn   0.40708
		colorDistFreq   9.25692e-006
		detailScale     3.30318
		colorConversion true
		snowLevel       2
		tropicLatitude  0.659396
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615185
		terraceProb     0.442066
		erosion         0
		montesMagn      0.427381
		montesFreq      3.0021
		montesSpiky     0.889808
		montesFraction  0.825255
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.76511e-005
		hillsFraction   0.716402
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240504
		craterFreq      0.15998
		craterDensity   0.752204
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   781.857
		volcanoTemp     1641.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.160, 0.159, 0.000)
		colorShelf     (0.172, 0.170, 0.169, 0.000)
		colorBeach     (0.182, 0.180, 0.178, 0.000)
		colorDesert    (0.192, 0.190, 0.188, 0.000)
		colorLowland   (0.202, 0.200, 0.198, 0.000)
		colorUpland    (0.212, 0.210, 0.208, 0.000)
		colorRock      (0.223, 0.220, 0.218, 0.000)
		colorSnow      (0.233, 0.230, 0.228, 1.000)
		BumpHeight      0.108869
		BumpOffset      0.0217739
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.311726
		DustBright  0.435949
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.83858
		Period          8.82177
		Eccentricity    0.940476
		Inclination     -46.4427
		AscendingNode   -61.6055
		ArgOfPericenter 57.6883
		MeanAnomaly     136.446
	}
}

Comet	"C3"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            4.55097e-012
	Radius          2.17859
	InertiaMoment   0.395885

	Oblateness      0.0115843

	RotationPeriod  42.9511
	Obliquity       147.142
	EqAscendNode    29.6174

	AbsMagn         0.625926
	SlopeParam      6.99797
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.720 0.662 0.611)

	Surface
	{
		SurfStyle       0.501467
		OceanStyle      0.959308
		Randomize      (-0.908, -0.630, -0.694)
		colorDistMagn   0.295135
		colorDistFreq   0.000348231
		detailScale     59.4901
		colorConversion true
		snowLevel       2
		tropicLatitude  0.583618
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.652034
		terraceProb     0.514989
		erosion         0
		montesMagn      0.548973
		montesFreq      3.28497
		montesSpiky     0.868813
		montesFraction  0.694536
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0106504
		hillsFraction   0.737808
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223962
		craterFreq      0.277327
		craterDensity   0.854626
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   160.114
		volcanoTemp     1322.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.225, 0.171, 0.000)
		colorShelf     (0.288, 0.232, 0.196, 0.000)
		colorBeach     (0.338, 0.271, 0.232, 0.000)
		colorDesert    (0.367, 0.291, 0.226, 0.000)
		colorLowland   (0.403, 0.311, 0.257, 0.000)
		colorUpland    (0.446, 0.377, 0.312, 0.000)
		colorRock      (0.482, 0.410, 0.336, 0.000)
		colorSnow      (0.525, 0.437, 0.354, 1.000)
		BumpHeight      1.96073
		BumpOffset      0.392147
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.46269
		GasToDust   0.25
		Particles   1914
		GasBright   0.205697
		DustBright  0.226465
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.61879
		Period          7.28815
		Eccentricity    0.92922
		Inclination     -35.2368
		AscendingNode   113.72
		ArgOfPericenter -122.41
		MeanAnomaly     -102.891
	}
}

Comet	"C4"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.51984e-008
	Radius          47.274
	InertiaMoment   0.399017

	Oblateness      0.0168967

	RotationPeriod  41.1168
	Obliquity       100.348
	EqAscendNode    14.1948

	AbsMagn         4.10082
	SlopeParam      5.2509
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.676 0.674 0.670)

	Surface
	{
		SurfStyle       0.306702
		OceanStyle      0.898211
		Randomize      (-0.926, -0.525, 0.394)
		colorDistMagn   0.940996
		colorDistFreq   1.45292
		detailScale     1290.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.951253
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.761334
		terraceProb     0.409014
		erosion         0
		montesMagn      0.57023
		montesFreq      3.95018
		montesSpiky     0.919973
		montesFraction  0.536467
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.67771
		hillsFraction   0.604312
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248768
		craterFreq      0.210518
		craterDensity   0.930333
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   39.5063
		volcanoTemp     1803.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.270, 0.268, 0.000)
		colorShelf     (0.287, 0.287, 0.285, 0.000)
		colorBeach     (0.304, 0.303, 0.302, 0.000)
		colorDesert    (0.321, 0.320, 0.318, 0.000)
		colorLowland   (0.338, 0.337, 0.335, 0.000)
		colorUpland    (0.355, 0.354, 0.352, 0.000)
		colorRock      (0.372, 0.371, 0.369, 0.000)
		colorSnow      (0.389, 0.388, 0.386, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.943882
		GasToDust   0.25
		Particles   2886
		GasBright   0.0320986
		DustBright  0.88455
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.90331
		Period          9.2917
		Eccentricity    0.931989
		Inclination     164.911
		AscendingNode   121.808
		ArgOfPericenter -29.2085
		MeanAnomaly     91.114
	}
}

Comet	"C5"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.08378e-015
	Radius          0.13487
	InertiaMoment   0.397474

	Oblateness      0.0138929

	RotationPeriod  39.2643
	Obliquity       53.5539
	EqAscendNode    358.772

	AbsMagn         5.86821
	SlopeParam      4.17702
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.612 0.610 0.608)

	Surface
	{
		SurfStyle       0.991763
		OceanStyle      0.775753
		Randomize      (-0.238, -0.641, 0.656)
		colorDistMagn   0.584064
		colorDistFreq   7.69587e-006
		detailScale     3.68286
		colorConversion true
		snowLevel       2
		tropicLatitude  0.639069
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52177
		terraceProb     0.39905
		erosion         0
		montesMagn      0.412836
		montesFreq      3.03089
		montesSpiky     0.805866
		montesFraction  0.448638
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.25635e-005
		hillsFraction   0.657144
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239787
		craterFreq      0.260867
		craterDensity   0.973747
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   642.319
		volcanoTemp     1703.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.213, 0.243, 0.050)
		colorShelf     (0.245, 0.250, 0.280, 0.040)
		colorBeach     (0.281, 0.287, 0.316, 0.030)
		colorDesert    (0.318, 0.323, 0.359, 0.020)
		colorLowland   (0.355, 0.360, 0.395, 0.030)
		colorUpland    (0.392, 0.396, 0.432, 0.050)
		colorRock      (0.428, 0.433, 0.480, 0.020)
		colorSnow      (0.428, 0.433, 0.480, 1.000)
		BumpHeight      0.121383
		BumpOffset      0.0242766
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0143242
		GasToDust   0.25
		Particles   1008
		GasBright   0.0565443
		DustBright  0.544591
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.69601
		Period          7.81582
		Eccentricity    0.87719
		Inclination     163.126
		AscendingNode   30.7535
		ArgOfPericenter 148.092
		MeanAnomaly     63.9012
	}
}

Comet	"C6"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            8.3823e-012
	Radius          2.92807
	InertiaMoment   0.399468

	Oblateness      0.0204238

	RotationPeriod  37.3885
	Obliquity       6.75956
	EqAscendNode    343.35

	AbsMagn         7.28676
	SlopeParam      3.1552
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.584 0.581 0.575)

	Surface
	{
		SurfStyle       0.838281
		OceanStyle      0.308301
		Randomize      (-0.919, 0.837, 0.154)
		colorDistMagn   0.592374
		colorDistFreq   0.00318966
		detailScale     79.9559
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0900799
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.355053
		terraceProb     0.286038
		erosion         0
		montesMagn      0.661749
		montesFreq      2.77127
		montesSpiky     0.861779
		montesFraction  0.652646
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0190584
		hillsFraction   0.601715
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226258
		craterFreq      0.18315
		craterDensity   0.82846
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   158.565
		volcanoTemp     1584.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.197, 0.161, 0.000)
		colorShelf     (0.234, 0.203, 0.184, 0.000)
		colorBeach     (0.274, 0.238, 0.219, 0.000)
		colorDesert    (0.298, 0.256, 0.213, 0.000)
		colorLowland   (0.327, 0.273, 0.242, 0.000)
		colorUpland    (0.362, 0.331, 0.293, 0.000)
		colorRock      (0.391, 0.360, 0.316, 0.000)
		colorSnow      (0.426, 0.383, 0.334, 1.000)
		BumpHeight      2.63527
		BumpOffset      0.527053
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.495516
		GasToDust   0.25
		Particles   1980
		GasBright   0.0437309
		DustBright  0.241891
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.41108
		Period          5.93142
		Eccentricity    0.861725
		Inclination     -1.65826
		AscendingNode   -14.2306
		ArgOfPericenter 147.772
		MeanAnomaly     82.1444
	}
}

Comet	"C7"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            6.48312e-008
	Radius          52.6796
	InertiaMoment   0.398221

	Oblateness      0.016994

	RotationPeriod  35.4833
	Obliquity       319.965
	EqAscendNode    327.927

	AbsMagn         8.61853
	SlopeParam      8.05961
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.561 0.556 0.551)

	Surface
	{
		SurfStyle       0.958722
		OceanStyle      0.307708
		Randomize      (-0.492, -0.332, 0.607)
		colorDistMagn   0.1922
		colorDistFreq   2.29046
		detailScale     1438.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.898923
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.572802
		terraceProb     0.324972
		erosion         0
		montesMagn      0.325397
		montesFreq      3.47203
		montesSpiky     0.823266
		montesFraction  0.264553
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.41664
		hillsFraction   0.676092
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223358
		craterFreq      0.150142
		craterDensity   0.918016
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.4382
		volcanoTemp     1533.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.195, 0.220, 0.050)
		colorShelf     (0.224, 0.228, 0.254, 0.040)
		colorBeach     (0.258, 0.261, 0.287, 0.030)
		colorDesert    (0.292, 0.295, 0.325, 0.020)
		colorLowland   (0.325, 0.328, 0.358, 0.030)
		colorUpland    (0.359, 0.361, 0.391, 0.050)
		colorRock      (0.393, 0.395, 0.435, 0.020)
		colorSnow      (0.393, 0.395, 0.435, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.976708
		GasToDust   0.25
		Particles   2952
		GasBright   0.163381
		DustBright  0.606727
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.38261
		Period          13.014
		Eccentricity    0.952829
		Inclination     -82.6896
		AscendingNode   -32.9273
		ArgOfPericenter -103.177
		MeanAnomaly     83.5276
	}
}

Comet	"C8"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.9962e-015
	Radius          0.181361
	InertiaMoment   0.399893

	Oblateness      0.0253606

	RotationPeriod  33.5424
	Obliquity       273.171
	EqAscendNode    312.504

	AbsMagn         10.0249
	SlopeParam      5.5438
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.493 0.485 0.480)

	Surface
	{
		SurfStyle       0.434066
		OceanStyle      0.9508
		Randomize      (0.640, -0.146, 0.617)
		colorDistMagn   0.975361
		colorDistFreq   1.89324e-005
		detailScale     4.95236
		colorConversion true
		snowLevel       2
		tropicLatitude  0.964127
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.601734
		terraceProb     0.452622
		erosion         0
		montesMagn      0.436328
		montesFreq      3.1649
		montesSpiky     0.825059
		montesFraction  0.893312
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.65486e-005
		hillsFraction   0.565381
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.171002
		craterFreq      0.227439
		craterDensity   0.874672
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   636.426
		volcanoTemp     1644.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.194, 0.192, 0.000)
		colorShelf     (0.210, 0.206, 0.204, 0.000)
		colorBeach     (0.222, 0.218, 0.216, 0.000)
		colorDesert    (0.234, 0.230, 0.228, 0.000)
		colorLowland   (0.247, 0.242, 0.240, 0.000)
		colorUpland    (0.259, 0.255, 0.252, 0.000)
		colorRock      (0.271, 0.267, 0.264, 0.000)
		colorSnow      (0.283, 0.279, 0.276, 1.000)
		BumpHeight      0.163225
		BumpOffset      0.032645
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0471502
		GasToDust   0.25
		Particles   1075
		GasBright   0.123285
		DustBright  0.331309
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.70764
		Period          7.89637
		Eccentricity    0.883228
		Inclination     40.4649
		AscendingNode   69.8369
		ArgOfPericenter -100.9
		MeanAnomaly     -103.594
	}
}

Comet	"C9"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.54392e-011
	Radius          3.26101
	InertiaMoment   0.398776

	Oblateness      0.0214439

	RotationPeriod  31.5586
	Obliquity       226.377
	EqAscendNode    297.082

	AbsMagn         11.7516
	SlopeParam      4.40898
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.547 0.539 0.535)

	Surface
	{
		SurfStyle       0.546615
		OceanStyle      0.317887
		Randomize      (-0.487, 0.168, 0.654)
		colorDistMagn   0.483498
		colorDistFreq   0.00908184
		detailScale     89.0474
		colorConversion true
		snowLevel       2
		tropicLatitude  0.975329
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560993
		terraceProb     0.216002
		erosion         0
		montesMagn      0.489505
		montesFreq      2.80894
		montesSpiky     0.944309
		montesFraction  0.383995
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0285743
		hillsFraction   0.782616
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254576
		craterFreq      0.252806
		craterDensity   0.865923
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   130.121
		volcanoTemp     1980.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.183, 0.150, 0.000)
		colorShelf     (0.219, 0.189, 0.171, 0.000)
		colorBeach     (0.257, 0.221, 0.203, 0.000)
		colorDesert    (0.279, 0.237, 0.198, 0.000)
		colorLowland   (0.306, 0.253, 0.225, 0.000)
		colorUpland    (0.339, 0.307, 0.273, 0.000)
		colorRock      (0.366, 0.334, 0.294, 0.000)
		colorSnow      (0.399, 0.356, 0.310, 1.000)
		BumpHeight      2.93491
		BumpOffset      0.586982
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.528342
		GasToDust   0.25
		Particles   2047
		GasBright   0.310126
		DustBright  0.628956
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.39939
		Period          13.1517
		Eccentricity    0.923067
		Inclination     -123.743
		AscendingNode   74.3415
		ArgOfPericenter 136.003
		MeanAnomaly     102.473
	}
}

Comet	"C10"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.19411e-007
	Radius          70.8773
	InertiaMoment   0.396925

	Oblateness      0.0323022

	RotationPeriod  29.5234
	Obliquity       179.582
	EqAscendNode    281.659

	AbsMagn         14.9143
	SlopeParam      3.40015
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.659 0.656 0.651)

	Surface
	{
		SurfStyle       0.343742
		OceanStyle      0.278452
		Randomize      (-0.250, -0.666, 0.855)
		colorDistMagn   0.192916
		colorDistFreq   2.9351
		detailScale     1935.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962692
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.604073
		terraceProb     0.116066
		erosion         0
		montesMagn      0.462277
		montesFreq      2.68241
		montesSpiky     0.980792
		montesFraction  0.0938241
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.8632
		hillsFraction   0.495224
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215032
		craterFreq      0.226238
		craterDensity   0.891743
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.1581
		volcanoTemp     1133.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.262, 0.261, 0.000)
		colorShelf     (0.280, 0.279, 0.277, 0.000)
		colorBeach     (0.296, 0.295, 0.293, 0.000)
		colorDesert    (0.313, 0.312, 0.309, 0.000)
		colorLowland   (0.329, 0.328, 0.326, 0.000)
		colorUpland    (0.346, 0.344, 0.342, 0.000)
		colorRock      (0.362, 0.361, 0.358, 0.000)
		colorSnow      (0.379, 0.377, 0.374, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.242748
		DustBright  0.38082
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.26768
		Period          12.0838
		Eccentricity    0.928702
		Inclination     -105.402
		AscendingNode   44.4407
		ArgOfPericenter -84.6712
		MeanAnomaly     -74.4365
	}
}

Comet	"C11"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.67675e-015
	Radius          0.201858
	InertiaMoment   0.39925

	Oblateness      0.0283254

	RotationPeriod  27.4274
	Obliquity       132.788
	EqAscendNode    266.237

	AbsMagn         2.82373
	SlopeParam      2.19366
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.492 0.425 0.402)

	Surface
	{
		SurfStyle       0.0494461
		OceanStyle      0.429937
		Randomize      (0.041, -0.569, 0.561)
		colorDistMagn   0.936354
		colorDistFreq   8.57548e-006
		detailScale     5.51206
		colorConversion true
		snowLevel       2
		tropicLatitude  0.79667
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464764
		terraceProb     0.196534
		erosion         0
		montesMagn      0.440769
		montesFreq      3.78812
		montesSpiky     0.932972
		montesFraction  0.289516
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000105886
		hillsFraction   0.387499
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27104
		craterFreq      0.244839
		craterDensity   0.934255
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   521.938
		volcanoTemp     1284.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.170, 0.161, 0.000)
		colorShelf     (0.209, 0.181, 0.171, 0.000)
		colorBeach     (0.221, 0.191, 0.181, 0.000)
		colorDesert    (0.234, 0.202, 0.191, 0.000)
		colorLowland   (0.246, 0.213, 0.201, 0.000)
		colorUpland    (0.258, 0.223, 0.211, 0.000)
		colorRock      (0.270, 0.234, 0.221, 0.000)
		colorSnow      (0.283, 0.245, 0.231, 1.000)
		BumpHeight      0.181672
		BumpOffset      0.0363344
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0799762
		GasToDust   0.25
		Particles   1141
		GasBright   0.138111
		DustBright  0.169943
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.76691
		Period          8.311
		Eccentricity    0.901714
		Inclination     -99.9766
		AscendingNode   -177.522
		ArgOfPericenter 113.91
		MeanAnomaly     139.713
	}
}

Comet	"C12"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.8437e-011
	Radius          4.39007
	InertiaMoment   0.397889

	Oblateness      0.0441926

	RotationPeriod  25.2592
	Obliquity       85.9938
	EqAscendNode    250.814

	AbsMagn         5.04495
	SlopeParam      5.87434
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.488 0.478 0.474)

	Surface
	{
		SurfStyle       0.805832
		OceanStyle      0.451301
		Randomize      (0.152, -0.089, -0.396)
		colorDistMagn   0.202607
		colorDistFreq   0.0105197
		detailScale     119.878
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997665
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.321829
		terraceProb     0.118564
		erosion         0
		montesMagn      0.585512
		montesFreq      2.41181
		montesSpiky     0.850822
		montesFraction  0.627364
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0453134
		hillsFraction   0.630322
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27604
		craterFreq      0.213454
		craterDensity   0.864925
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   129.073
		volcanoTemp     1555.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.163, 0.133, 0.000)
		colorShelf     (0.195, 0.167, 0.152, 0.000)
		colorBeach     (0.229, 0.196, 0.180, 0.000)
		colorDesert    (0.249, 0.210, 0.175, 0.000)
		colorLowland   (0.273, 0.225, 0.199, 0.000)
		colorUpland    (0.302, 0.273, 0.242, 0.000)
		colorRock      (0.327, 0.296, 0.261, 0.000)
		colorSnow      (0.356, 0.316, 0.275, 1.000)
		BumpHeight      3.95106
		BumpOffset      0.790213
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.561168
		GasToDust   0.25
		Particles   2113
		GasBright   0.0058485
		DustBright  0.786692
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.25792
		Period          12.0059
		Eccentricity    0.935222
		Inclination     -164.787
		AscendingNode   58.773
		ArgOfPericenter -10.3319
		MeanAnomaly     -0.402703
	}
}

Comet	"C13"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.1994e-007
	Radius          78.8348
	InertiaMoment   0.399685

	Oblateness      0.0401591

	RotationPeriod  23.0051
	Obliquity       39.1995
	EqAscendNode    235.391

	AbsMagn         6.58998
	SlopeParam      4.6466
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.601 0.598 0.593)

	Surface
	{
		SurfStyle       0.11788
		OceanStyle      0.903537
		Randomize      (-0.420, -0.291, -0.488)
		colorDistMagn   0.628055
		colorDistFreq   3.96515
		detailScale     2152.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.90565
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495731
		terraceProb     0.216938
		erosion         0
		montesMagn      0.571536
		montesFreq      2.47443
		montesSpiky     0.99529
		montesFraction  0.616848
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.539
		hillsFraction   0.598657
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226385
		craterFreq      0.178421
		craterDensity   0.848796
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.3556
		volcanoTemp     1400.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.239, 0.237, 0.000)
		colorShelf     (0.256, 0.254, 0.252, 0.000)
		colorBeach     (0.271, 0.269, 0.267, 0.000)
		colorDesert    (0.286, 0.284, 0.282, 0.000)
		colorLowland   (0.301, 0.299, 0.297, 0.000)
		colorUpland    (0.316, 0.314, 0.312, 0.000)
		colorRock      (0.331, 0.329, 0.326, 0.000)
		colorSnow      (0.346, 0.344, 0.341, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0316864
		DustBright  0.445341
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.54647
		Period          6.80525
		Eccentricity    0.883069
		Inclination     95.4847
		AscendingNode   -56.2027
		ArgOfPericenter -91.2936
		MeanAnomaly     -33.516
	}
}

Comet	"C14"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            6.7721e-015
	Radius          0.271917
	InertiaMoment   0.398516

	Oblateness      0.066144

	RotationPeriod  20.6485
	Obliquity       352.405
	EqAscendNode    219.969

	AbsMagn         7.94419
	SlopeParam      3.63639
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.542 0.468 0.352)

	Surface
	{
		SurfStyle       0.751082
		OceanStyle      0.428963
		Randomize      (0.688, 0.221, 0.172)
		colorDistMagn   0.220127
		colorDistFreq   4.31282e-005
		detailScale     7.42516
		colorConversion true
		snowLevel       2
		tropicLatitude  0.496411
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.47982
		terraceProb     0.145532
		erosion         0
		montesMagn      0.505433
		montesFreq      2.94054
		montesSpiky     0.992555
		montesFraction  0.450567
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000159179
		hillsFraction   0.733322
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240615
		craterFreq      0.211779
		craterDensity   0.934684
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   518.062
		volcanoTemp     1814.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.159, 0.098, 0.000)
		colorShelf     (0.217, 0.164, 0.113, 0.000)
		colorBeach     (0.255, 0.192, 0.134, 0.000)
		colorDesert    (0.276, 0.206, 0.130, 0.000)
		colorLowland   (0.303, 0.220, 0.148, 0.000)
		colorUpland    (0.336, 0.267, 0.179, 0.000)
		colorRock      (0.363, 0.290, 0.193, 0.000)
		colorSnow      (0.396, 0.309, 0.204, 1.000)
		BumpHeight      0.244726
		BumpOffset      0.0489451
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.112802
		GasToDust   0.25
		Particles   1207
		GasBright   0.120641
		DustBright  0.840873
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.45782
		Period          6.22859
		Eccentricity    0.904102
		Inclination     -35.1098
		AscendingNode   -138.821
		ArgOfPericenter -176.935
		MeanAnomaly     132.815
	}
}

Comet	"C15"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            5.23773e-011
	Radius          4.87944
	InertiaMoment   0.395928

	Oblateness      0.0632122

	RotationPeriod  18.1684
	Obliquity       305.611
	EqAscendNode    204.546

	AbsMagn         9.29185
	SlopeParam      2.5155
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.788 0.784 0.782)

	Surface
	{
		SurfStyle       0.428968
		OceanStyle      0.63663
		Randomize      (0.792, 0.130, 0.783)
		colorDistMagn   0.342779
		colorDistFreq   0.014433
		detailScale     133.241
		colorConversion true
		snowLevel       2
		tropicLatitude  0.377425
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.688504
		terraceProb     0.444962
		erosion         0
		montesMagn      0.54307
		montesFreq      2.80645
		montesSpiky     0.997477
		montesFraction  0.461643
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0465788
		hillsFraction   0.537149
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261638
		craterFreq      0.248963
		craterDensity   0.770071
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   105.707
		volcanoTemp     1499.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.314, 0.313, 0.000)
		colorShelf     (0.335, 0.333, 0.332, 0.000)
		colorBeach     (0.355, 0.353, 0.352, 0.000)
		colorDesert    (0.374, 0.373, 0.371, 0.000)
		colorLowland   (0.394, 0.392, 0.391, 0.000)
		colorUpland    (0.414, 0.412, 0.411, 0.000)
		colorRock      (0.433, 0.431, 0.430, 0.000)
		colorSnow      (0.453, 0.451, 0.450, 1.000)
		BumpHeight      4.3915
		BumpOffset      0.8783
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.593994
		GasToDust   0.25
		Particles   2179
		GasBright   0.119197
		DustBright  0.526804
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.88169
		Period          9.13384
		Eccentricity    0.903598
		Inclination     74.5386
		AscendingNode   -10.3529
		ArgOfPericenter -15.2311
		MeanAnomaly     178.545
	}
}

Comet	"C16"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            4.05101e-007
	Radius          106.268
	InertiaMoment   0.399023

	Oblateness      0.116782

	RotationPeriod  15.5378
	Obliquity       258.817
	EqAscendNode    189.124

	AbsMagn         10.8103
	SlopeParam      6.26621
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.595 0.589 0.584)

	Surface
	{
		SurfStyle       0.00104339
		OceanStyle      0.992587
		Randomize      (0.229, -0.625, -0.112)
		colorDistMagn   0.236795
		colorDistFreq   2.46255
		detailScale     2901.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.292736
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.311895
		terraceProb     0.121599
		erosion         0
		montesMagn      0.393758
		montesFreq      3.38067
		montesSpiky     0.99795
		montesFraction  0.568906
		dunesFraction   0
		hillsMagn       0
		hillsFreq       32.2857
		hillsFraction   0.795651
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219247
		craterFreq      0.472001
		craterDensity   0.783302
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.1775
		volcanoTemp     1653.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.236, 0.234, 0.000)
		colorShelf     (0.253, 0.250, 0.248, 0.000)
		colorBeach     (0.268, 0.265, 0.263, 0.000)
		colorDesert    (0.282, 0.280, 0.278, 0.000)
		colorLowland   (0.297, 0.295, 0.292, 0.000)
		colorUpland    (0.312, 0.309, 0.307, 0.000)
		colorRock      (0.327, 0.324, 0.321, 0.000)
		colorSnow      (0.342, 0.339, 0.336, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0804936
		DustBright  0.249994
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.48392
		Period          6.39659
		Eccentricity    0.881439
		Inclination     113.77
		AscendingNode   12.0473
		ArgOfPericenter 31.783
		MeanAnomaly     -57.6329
	}
}

Comet	"C17"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.24734e-014
	Radius          0.301995
	InertiaMoment   0.397486

	Oblateness      0.129108

	RotationPeriod  12.7213
	Obliquity       212.022
	EqAscendNode    173.701

	AbsMagn         12.9285
	SlopeParam      4.89374
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.779 0.708 0.670)

	Surface
	{
		SurfStyle       0.0360493
		OceanStyle      0.158572
		Randomize      (0.450, -0.152, -0.899)
		colorDistMagn   0.784026
		colorDistFreq   1.87235e-005
		detailScale     8.24648
		colorConversion true
		snowLevel       2
		tropicLatitude  0.37634
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.282271
		terraceProb     0.274853
		erosion         0
		montesMagn      0.48515
		montesFreq      3.0775
		montesSpiky     0.957925
		montesFraction  0.325108
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00019583
		hillsFraction   0.772955
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217756
		craterFreq      0.261419
		craterDensity   1.04094
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   423.949
		volcanoTemp     1654.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.283, 0.268, 0.000)
		colorShelf     (0.331, 0.301, 0.285, 0.000)
		colorBeach     (0.351, 0.318, 0.301, 0.000)
		colorDesert    (0.370, 0.336, 0.318, 0.000)
		colorLowland   (0.390, 0.354, 0.335, 0.000)
		colorUpland    (0.409, 0.372, 0.352, 0.000)
		colorRock      (0.429, 0.389, 0.368, 0.000)
		colorSnow      (0.448, 0.407, 0.385, 1.000)
		BumpHeight      0.271795
		BumpOffset      0.0543591
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.145628
		GasToDust   0.25
		Particles   1273
		GasBright   0.246616
		DustBright  0.568358
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.36385
		Period          5.63614
		Eccentricity    0.917834
		Inclination     34.808
		AscendingNode   139.554
		ArgOfPericenter -128.485
		MeanAnomaly     140.943
	}
}

Comet	"C18"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            9.64726e-011
	Radius          6.58223
	InertiaMoment   0.399473

	Oblateness      0.249

	RotationPeriod  9.67044
	Obliquity       165.228
	EqAscendNode    158.278

	AbsMagn         0.523982
	SlopeParam      3.86764
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.727 0.726 0.724)

	Surface
	{
		SurfStyle       0.167042
		OceanStyle      0.551632
		Randomize      (0.717, -0.033, 0.449)
		colorDistMagn   0.709604
		colorDistFreq   0.0303766
		detailScale     179.739
		colorConversion true
		snowLevel       2
		tropicLatitude  0.721823
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505585
		terraceProb     0.351466
		erosion         0
		montesMagn      0.37825
		montesFreq      3.06444
		montesSpiky     0.997794
		montesFraction  0.556926
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.112365
		hillsFraction   0.688125
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250452
		craterFreq      0.230986
		craterDensity   1.09082
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   105.07
		volcanoTemp     1312.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.290, 0.290, 0.000)
		colorShelf     (0.309, 0.308, 0.308, 0.000)
		colorBeach     (0.327, 0.326, 0.326, 0.000)
		colorDesert    (0.345, 0.345, 0.344, 0.000)
		colorLowland   (0.364, 0.363, 0.362, 0.000)
		colorUpland    (0.382, 0.381, 0.380, 0.000)
		colorRock      (0.400, 0.399, 0.398, 0.000)
		colorSnow      (0.418, 0.417, 0.416, 1.000)
		BumpHeight      5.924
		BumpOffset      1.1848
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.62682
		GasToDust   0.25
		Particles   2246
		GasBright   0.18063
		DustBright  0.31883
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.20705
		Period          11.6025
		Eccentricity    0.919487
		Inclination     121.509
		AscendingNode   149.2
		ArgOfPericenter 117.476
		MeanAnomaly     -20.7333
	}
}

Comet	"C19"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            7.46146e-007
	Radius          117.924
	InertiaMoment   0.398229

	Oblateness      0.249

	RotationPeriod  6.31605
	Obliquity       118.434
	EqAscendNode    142.856

	AbsMagn         4.07144
	SlopeParam      2.8028
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.524 0.521 0.516)

	Surface
	{
		SurfStyle       0.617241
		OceanStyle      0.890693
		Randomize      (0.913, 0.641, 0.224)
		colorDistMagn   0.274061
		colorDistFreq   8.87045
		detailScale     3220.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.818681
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554629
		terraceProb     0.198239
		erosion         0
		montesMagn      0.535434
		montesFreq      2.52837
		montesSpiky     0.901836
		montesFraction  0.546337
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.8828
		hillsFraction   0.51624
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230562
		craterFreq      0.507311
		craterDensity   0.788128
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.4041
		volcanoTemp     1416.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.177, 0.144, 0.000)
		colorShelf     (0.210, 0.182, 0.165, 0.000)
		colorBeach     (0.246, 0.214, 0.196, 0.000)
		colorDesert    (0.267, 0.229, 0.191, 0.000)
		colorLowland   (0.294, 0.245, 0.217, 0.000)
		colorUpland    (0.325, 0.297, 0.263, 0.000)
		colorRock      (0.351, 0.323, 0.284, 0.000)
		colorSnow      (0.383, 0.344, 0.299, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.413943
		DustBright  0.570004
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.47477
		Period          6.33751
		Eccentricity    0.871398
		Inclination     62.8439
		AscendingNode   62.8591
		ArgOfPericenter -75.2674
		MeanAnomaly     5.28414
	}
}

Comet	"C20"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.29744e-014
	Radius          0.407702
	InertiaMoment   0.399898

	Oblateness      0.249

	RotationPeriod  2.55439
	Obliquity       71.6394
	EqAscendNode    127.433

	AbsMagn         5.8472
	SlopeParam      6.77251
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.453 0.446 0.443)

	Surface
	{
		SurfStyle       0.373696
		OceanStyle      0.0368307
		Randomize      (0.265, 0.539, -0.433)
		colorDistMagn   0.817151
		colorDistFreq   9.16252e-006
		detailScale     11.133
		colorConversion true
		snowLevel       2
		tropicLatitude  0.872615
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5883
		terraceProb     0.235636
		erosion         0
		montesMagn      0.320016
		montesFreq      3.11102
		montesSpiky     0.984438
		montesFraction  0.402726
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000410493
		hillsFraction   0.663668
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201357
		craterFreq      0.2069
		craterDensity   0.835749
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   421.722
		volcanoTemp     1397.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.178, 0.177, 0.000)
		colorShelf     (0.193, 0.189, 0.188, 0.000)
		colorBeach     (0.204, 0.201, 0.199, 0.000)
		colorDesert    (0.215, 0.212, 0.210, 0.000)
		colorLowland   (0.227, 0.223, 0.221, 0.000)
		colorUpland    (0.238, 0.234, 0.232, 0.000)
		colorRock      (0.249, 0.245, 0.243, 0.000)
		colorSnow      (0.261, 0.256, 0.255, 1.000)
		BumpHeight      0.366932
		BumpOffset      0.0733863
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.178454
		GasToDust   0.25
		Particles   1340
		GasBright   0.320675
		DustBright  0.347758
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.53308
		Period          6.71703
		Eccentricity    0.891387
		Inclination     141.728
		AscendingNode   65.7858
		ArgOfPericenter -120.228
		MeanAnomaly     -68.0994
	}
}

Comet	"C21"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.7769e-010
	Radius          7.29757
	InertiaMoment   0.398783

	Oblateness      0.00138631

	RotationPeriod  122.479
	Obliquity       24.8451
	EqAscendNode    112.011

	AbsMagn         7.26826
	SlopeParam      5.1554
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.545 0.540 0.531)

	Surface
	{
		SurfStyle       0.568417
		OceanStyle      0.908767
		Randomize      (-0.309, 0.610, 0.943)
		colorDistMagn   0.642359
		colorDistFreq   0.0271252
		detailScale     199.272
		colorConversion true
		snowLevel       2
		tropicLatitude  0.421812
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.746205
		terraceProb     0.132579
		erosion         0
		montesMagn      0.428881
		montesFreq      2.66652
		montesSpiky     0.788927
		montesFraction  0.259397
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.141664
		hillsFraction   0.507216
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226385
		craterFreq      0.256526
		craterDensity   1.02981
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   85.8326
		volcanoTemp     1590.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.183, 0.149, 0.000)
		colorShelf     (0.218, 0.189, 0.170, 0.000)
		colorBeach     (0.256, 0.221, 0.202, 0.000)
		colorDesert    (0.278, 0.237, 0.197, 0.000)
		colorLowland   (0.305, 0.254, 0.223, 0.000)
		colorUpland    (0.338, 0.308, 0.271, 0.000)
		colorRock      (0.365, 0.335, 0.292, 0.000)
		colorSnow      (0.398, 0.356, 0.308, 1.000)
		BumpHeight      6.56781
		BumpOffset      1.31356
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.659646
		GasToDust   0.25
		Particles   2312
		GasBright   0.0136886
		DustBright  0.339231
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.46143
		Period          6.2517
		Eccentricity    0.914803
		Inclination     179.828
		AscendingNode   -127.136
		ArgOfPericenter 50.4065
		MeanAnomaly     -40.5085
	}
}

Comet	"C22"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            5.47123e-018
	Radius          0.025253
	InertiaMoment   0.396942

	Oblateness      0.00224349

	RotationPeriod  111.307
	Obliquity       338.051
	EqAscendNode    96.5881

	AbsMagn         8.60011
	SlopeParam      4.09714
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.673 0.603 0.496)

	Surface
	{
		SurfStyle       0.545367
		OceanStyle      0.666104
		Randomize      (0.420, -0.112, 0.358)
		colorDistMagn   0.834708
		colorDistFreq   2.77439e-007
		detailScale     0.689576
		colorConversion true
		snowLevel       2
		tropicLatitude  0.731639
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.513789
		terraceProb     0.441124
		erosion         0
		montesMagn      0.461328
		montesFreq      2.86021
		montesSpiky     0.903448
		montesFraction  0.487118
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.30638e-006
		hillsFraction   0.611555
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223023
		craterFreq      0.183204
		craterDensity   1.02538
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1692.69
		volcanoTemp     996.922
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.205, 0.139, 0.000)
		colorShelf     (0.269, 0.211, 0.159, 0.000)
		colorBeach     (0.316, 0.247, 0.188, 0.000)
		colorDesert    (0.343, 0.265, 0.183, 0.000)
		colorLowland   (0.377, 0.283, 0.208, 0.000)
		colorUpland    (0.417, 0.344, 0.253, 0.000)
		colorRock      (0.451, 0.374, 0.273, 0.000)
		colorSnow      (0.491, 0.398, 0.287, 1.000)
		BumpHeight      0.0227277
		BumpOffset      0.00454555
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0819251
		DustBright  0.755481
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.03743
		Period          10.291
		Eccentricity    0.983609
		Inclination     -111.029
		AscendingNode   0.666056
		ArgOfPericenter -48.6549
		MeanAnomaly     -177.953
	}
}

Comet	"C23"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            4.23159e-014
	Radius          0.451566
	InertiaMoment   0.399256

	Oblateness      0.00191044

	RotationPeriod  104.161
	Obliquity       291.257
	EqAscendNode    81.1656

	AbsMagn         10.0042
	SlopeParam      3.06723
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.798 0.796 0.794)

	Surface
	{
		SurfStyle       0.903208
		OceanStyle      0.157704
		Randomize      (-0.051, -0.808, 0.238)
		colorDistMagn   0.458261
		colorDistFreq   0.000103722
		detailScale     12.3308
		colorConversion true
		snowLevel       2
		tropicLatitude  0.855704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.257373
		terraceProb     0.299083
		erosion         0
		montesMagn      0.625236
		montesFreq      2.62682
		montesSpiky     0.988364
		montesFraction  0.604994
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000225144
		hillsFraction   0.802379
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275324
		craterFreq      0.230746
		craterDensity   1.00511
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   344.172
		volcanoTemp     1330.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.279, 0.318, 0.050)
		colorShelf     (0.319, 0.326, 0.365, 0.040)
		colorBeach     (0.367, 0.374, 0.413, 0.030)
		colorDesert    (0.415, 0.422, 0.468, 0.020)
		colorLowland   (0.463, 0.470, 0.516, 0.030)
		colorUpland    (0.511, 0.518, 0.564, 0.050)
		colorRock      (0.558, 0.565, 0.627, 0.020)
		colorSnow      (0.558, 0.565, 0.627, 1.000)
		BumpHeight      0.406409
		BumpOffset      0.0812818
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.21128
		GasToDust   0.25
		Particles   1406
		GasBright   0.0818732
		DustBright  0.44002
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.14903
		Period          4.35842
		Eccentricity    0.816766
		Inclination     49.7787
		AscendingNode   -66.5349
		ArgOfPericenter 71.0479
		MeanAnomaly     -49.9237
	}
}

Comet	"C24"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.27284e-010
	Radius          9.86928
	InertiaMoment   0.397898

	Oblateness      0.00285612

	RotationPeriod  98.7221
	Obliquity       244.462
	EqAscendNode    65.743

	AbsMagn         11.7234
	SlopeParam      7.57115
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.758 0.697 0.622)

	Surface
	{
		SurfStyle       0.616031
		OceanStyle      0.957066
		Randomize      (0.854, -0.531, -0.007)
		colorDistMagn   0.393122
		colorDistFreq   0.0272917
		detailScale     269.497
		colorConversion true
		snowLevel       2
		tropicLatitude  0.580692
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504853
		terraceProb     0.151598
		erosion         0
		montesMagn      0.537459
		montesFreq      3.57604
		montesSpiky     0.845549
		montesFraction  0.68452
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.268407
		hillsFraction   0.884849
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232334
		craterFreq      0.206607
		craterDensity   0.726003
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   85.5321
		volcanoTemp     1235.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.237, 0.174, 0.000)
		colorShelf     (0.303, 0.244, 0.199, 0.000)
		colorBeach     (0.356, 0.286, 0.236, 0.000)
		colorDesert    (0.386, 0.307, 0.230, 0.000)
		colorLowland   (0.424, 0.328, 0.261, 0.000)
		colorUpland    (0.470, 0.397, 0.317, 0.000)
		colorRock      (0.508, 0.432, 0.342, 0.000)
		colorSnow      (0.553, 0.460, 0.361, 1.000)
		BumpHeight      8.88235
		BumpOffset      1.77647
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.692472
		GasToDust   0.25
		Particles   2378
		GasBright   0.044562
		DustBright  0.161818
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.74338
		Period          8.14553
		Eccentricity    0.901491
		Inclination     68.1546
		AscendingNode   141.31
		ArgOfPericenter 15.4999
		MeanAnomaly     -126.609
	}
}

Comet	"C25"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.00773e-017
	Radius          0.0279401
	InertiaMoment   0.39969

	Oblateness      0.002325

	RotationPeriod  94.244
	Obliquity       197.668
	EqAscendNode    50.3204

	AbsMagn         14.8346
	SlopeParam      5.43857
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.766 0.764 0.762)

	Surface
	{
		SurfStyle       0.290721
		OceanStyle      0.354918
		Randomize      (-0.071, -0.131, -0.619)
		colorDistMagn   0.35782
		colorDistFreq   4.01118e-007
		detailScale     0.762951
		colorConversion true
		snowLevel       2
		tropicLatitude  0.663588
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.329529
		terraceProb     0.130765
		erosion         0
		montesMagn      0.625475
		montesFreq      1.91972
		montesSpiky     0.999828
		montesFraction  0.567703
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.03708e-006
		hillsFraction   0.498534
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244151
		craterFreq      0.206788
		craterDensity   0.777518
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1379.94
		volcanoTemp     1670.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.306, 0.305, 0.000)
		colorShelf     (0.325, 0.325, 0.324, 0.000)
		colorBeach     (0.344, 0.344, 0.343, 0.000)
		colorDesert    (0.364, 0.363, 0.362, 0.000)
		colorLowland   (0.383, 0.382, 0.381, 0.000)
		colorUpland    (0.402, 0.401, 0.400, 0.000)
		colorRock      (0.421, 0.420, 0.419, 0.000)
		colorSnow      (0.440, 0.439, 0.438, 1.000)
		BumpHeight      0.0251461
		BumpOffset      0.00502922
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.189966
		DustBright  0.5009
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.02972
		Period          10.2326
		Eccentricity    0.925614
		Inclination     150.249
		AscendingNode   -121.699
		ArgOfPericenter -65.4783
		MeanAnomaly     -123.098
	}
}

Comet	"C26"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            7.79407e-014
	Radius          0.611306
	InertiaMoment   0.398523

	Oblateness      0.00340804

	RotationPeriod  90.3856
	Obliquity       150.874
	EqAscendNode    34.8978

	AbsMagn         2.78139
	SlopeParam      4.32792
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.835 0.767 0.736)

	Surface
	{
		SurfStyle       0.465429
		OceanStyle      0.610757
		Randomize      (-0.038, 0.996, -0.569)
		colorDistMagn   0.412745
		colorDistFreq   0.000144066
		detailScale     16.6927
		colorConversion true
		snowLevel       2
		tropicLatitude  0.623257
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.752634
		terraceProb     0.107693
		erosion         0
		montesMagn      0.366239
		montesFreq      2.55503
		montesSpiky     0.859807
		montesFraction  0.417791
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00101002
		hillsFraction   0.609031
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246715
		craterFreq      0.220566
		craterDensity   1.08483
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   343.307
		volcanoTemp     1695.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.334, 0.307, 0.294, 0.000)
		colorShelf     (0.355, 0.326, 0.313, 0.000)
		colorBeach     (0.376, 0.345, 0.331, 0.000)
		colorDesert    (0.397, 0.365, 0.350, 0.000)
		colorLowland   (0.418, 0.384, 0.368, 0.000)
		colorUpland    (0.439, 0.403, 0.386, 0.000)
		colorRock      (0.459, 0.422, 0.405, 0.000)
		colorSnow      (0.480, 0.441, 0.423, 1.000)
		BumpHeight      0.550175
		BumpOffset      0.110035
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.244106
		GasToDust   0.25
		Particles   1472
		GasBright   0.125373
		DustBright  0.24998
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.49421
		Period          6.46324
		Eccentricity    0.912023
		Inclination     -133.479
		AscendingNode   59.1825
		ArgOfPericenter 106.245
		MeanAnomaly     132.541
	}
}

Comet	"C27"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            6.02815e-010
	Radius          10.9067
	InertiaMoment   0.395969

	Oblateness      0.0026778

	RotationPeriod  86.9609
	Obliquity       104.079
	EqAscendNode    19.4752

	AbsMagn         5.02098
	SlopeParam      3.31624
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.439 0.434 0.426)

	Surface
	{
		SurfStyle       0.843878
		OceanStyle      0.987765
		Randomize      (-0.006, 0.806, -0.030)
		colorDistMagn   0.90963
		colorDistFreq   0.0612548
		detailScale     297.826
		colorConversion true
		snowLevel       2
		tropicLatitude  0.989126
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.541859
		terraceProb     0.234212
		erosion         0
		montesMagn      0.646557
		montesFreq      3.75747
		montesSpiky     0.92331
		montesFraction  0.822671
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.266857
		hillsFraction   0.747225
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26886
		craterFreq      0.199232
		craterDensity   0.855121
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   69.6478
		volcanoTemp     1579.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.148, 0.119, 0.000)
		colorShelf     (0.175, 0.152, 0.136, 0.000)
		colorBeach     (0.206, 0.178, 0.162, 0.000)
		colorDesert    (0.224, 0.191, 0.158, 0.000)
		colorLowland   (0.246, 0.204, 0.179, 0.000)
		colorUpland    (0.272, 0.247, 0.217, 0.000)
		colorRock      (0.294, 0.269, 0.234, 0.000)
		colorSnow      (0.320, 0.286, 0.247, 1.000)
		BumpHeight      9.81603
		BumpOffset      1.96321
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.725298
		GasToDust   0.25
		Particles   2445
		GasBright   0.337967
		DustBright  0.521872
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.662
		Period          7.58193
		Eccentricity    0.916008
		Inclination     85.534
		AscendingNode   82.3861
		ArgOfPericenter 125.375
		MeanAnomaly     -99.5513
	}
}

Comet	"C28"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.85611e-017
	Radius          0.0378646
	InertiaMoment   0.399029

	Oblateness      0.00395852

	RotationPeriod  83.8568
	Obliquity       57.285
	EqAscendNode    4.0526

	AbsMagn         6.57059
	SlopeParam      2.07039
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.640 0.633 0.630)

	Surface
	{
		SurfStyle       0.959524
		OceanStyle      0.868792
		Randomize      (-0.734, -0.144, 0.709)
		colorDistMagn   0.553135
		colorDistFreq   7.78399e-007
		detailScale     1.03395
		colorConversion true
		snowLevel       2
		tropicLatitude  0.717879
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.614619
		terraceProb     0.529294
		erosion         0
		montesMagn      0.537897
		montesFreq      3.05134
		montesSpiky     0.905892
		montesFraction  0.721815
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.38256e-006
		hillsFraction   0.805189
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262034
		craterFreq      0.177588
		craterDensity   0.808725
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1377.96
		volcanoTemp     1707.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.222, 0.252, 0.050)
		colorShelf     (0.256, 0.260, 0.290, 0.040)
		colorBeach     (0.294, 0.298, 0.328, 0.030)
		colorDesert    (0.333, 0.336, 0.372, 0.020)
		colorLowland   (0.371, 0.374, 0.410, 0.030)
		colorUpland    (0.410, 0.412, 0.448, 0.050)
		colorRock      (0.448, 0.450, 0.498, 0.020)
		colorSnow      (0.448, 0.450, 0.498, 1.000)
		BumpHeight      0.0340781
		BumpOffset      0.00681562
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.246092
		DustBright  0.298234
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.857546
		Period          2.81008
		Eccentricity    0.892334
		Inclination     -131.906
		AscendingNode   -122.364
		ArgOfPericenter -49.1275
		MeanAnomaly     -157.459
	}
}

Comet	"C29"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.43557e-013
	Radius          0.674701
	InertiaMoment   0.397498

	Oblateness      0.00308585

	RotationPeriod  80.9987
	Obliquity       10.4907
	EqAscendNode    348.63

	AbsMagn         7.92599
	SlopeParam      5.75408
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.765 0.763 0.761)

	Surface
	{
		SurfStyle       0.53008
		OceanStyle      0.674707
		Randomize      (-0.219, 0.357, 0.849)
		colorDistMagn   0.499617
		colorDistFreq   0.000163508
		detailScale     18.4238
		colorConversion true
		snowLevel       2
		tropicLatitude  0.470665
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.352752
		terraceProb     0.417843
		erosion         0
		montesMagn      0.360907
		montesFreq      4.07607
		montesSpiky     0.930631
		montesFraction  0.75405
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000976594
		hillsFraction   0.776887
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246882
		craterFreq      0.253415
		craterDensity   0.790817
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   279.193
		volcanoTemp     1490.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.259, 0.213, 0.000)
		colorShelf     (0.306, 0.267, 0.243, 0.000)
		colorBeach     (0.360, 0.313, 0.289, 0.000)
		colorDesert    (0.390, 0.336, 0.281, 0.000)
		colorLowland   (0.428, 0.358, 0.319, 0.000)
		colorUpland    (0.474, 0.435, 0.388, 0.000)
		colorRock      (0.513, 0.473, 0.418, 0.000)
		colorSnow      (0.558, 0.503, 0.441, 1.000)
		BumpHeight      0.607231
		BumpOffset      0.121446
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.276932
		GasToDust   0.25
		Particles   1539
		GasBright   0.00255098
		DustBright  0.226262
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.99066
		Period          9.93863
		Eccentricity    0.896559
		Inclination     162.373
		AscendingNode   -173.742
		ArgOfPericenter 118.666
		MeanAnomaly     141.581
	}
}

Comet	"C30"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.11031e-009
	Radius          14.7982
	InertiaMoment   0.399479

	Oblateness      0.00453438

	RotationPeriod  78.3348
	Obliquity       323.696
	EqAscendNode    333.207

	AbsMagn         9.27269
	SlopeParam      4.56317
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.796 0.753 0.699)

	Surface
	{
		SurfStyle       0.993864
		OceanStyle      0.212676
		Randomize      (0.289, -0.244, -0.713)
		colorDistMagn   0.653385
		colorDistFreq   0.190282
		detailScale     404.089
		colorConversion true
		snowLevel       2
		tropicLatitude  0.935152
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.650176
		terraceProb     0.126487
		erosion         0
		montesMagn      0.489178
		montesFreq      2.76921
		montesSpiky     0.927962
		montesFraction  0.391372
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.466795
		hillsFraction   0.67015
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25939
		craterFreq      0.277924
		craterDensity   0.794143
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   69.6293
		volcanoTemp     1325.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.264, 0.280, 0.050)
		colorShelf     (0.318, 0.309, 0.321, 0.040)
		colorBeach     (0.366, 0.354, 0.363, 0.030)
		colorDesert    (0.414, 0.399, 0.412, 0.020)
		colorLowland   (0.462, 0.444, 0.454, 0.030)
		colorUpland    (0.510, 0.490, 0.496, 0.050)
		colorRock      (0.557, 0.535, 0.552, 0.020)
		colorSnow      (0.557, 0.535, 0.552, 1.000)
		BumpHeight      13.3183
		BumpOffset      2.66367
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.758124
		GasToDust   0.25
		Particles   2511
		GasBright   0.0500693
		DustBright  0.66323
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.71852
		Period          7.97193
		Eccentricity    0.914118
		Inclination     -49.3709
		AscendingNode   -67.6983
		ArgOfPericenter -44.9626
		MeanAnomaly     168.89
	}
}

Comet	"C31"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.41872e-017
	Radius          0.0417324
	InertiaMoment   0.398236

	Oblateness      0.00350856

	RotationPeriod  75.8275
	Obliquity       276.902
	EqAscendNode    317.785

	AbsMagn         10.7871
	SlopeParam      3.55504
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.521 0.517 0.515)

	Surface
	{
		SurfStyle       0.873769
		OceanStyle      0.0319185
		Randomize      (-0.438, 0.004, -0.777)
		colorDistMagn   0.561766
		colorDistFreq   8.86595e-007
		detailScale     1.13957
		colorConversion true
		snowLevel       2
		tropicLatitude  0.969663
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.339384
		terraceProb     0.227674
		erosion         0
		montesMagn      0.566937
		montesFreq      2.73842
		montesSpiky     0.911714
		montesFraction  0.610696
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.03158e-006
		hillsFraction   0.88757
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259159
		craterFreq      0.224909
		craterDensity   0.775481
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1119.05
		volcanoTemp     1582.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.181, 0.206, 0.050)
		colorShelf     (0.209, 0.212, 0.237, 0.040)
		colorBeach     (0.240, 0.243, 0.268, 0.030)
		colorDesert    (0.271, 0.274, 0.304, 0.020)
		colorLowland   (0.302, 0.305, 0.335, 0.030)
		colorUpland    (0.334, 0.336, 0.366, 0.050)
		colorRock      (0.365, 0.367, 0.407, 0.020)
		colorSnow      (0.365, 0.367, 0.407, 1.000)
		BumpHeight      0.0375592
		BumpOffset      0.00751184
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0514095
		DustBright  0.346376
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.15832
		Period          11.2203
		Eccentricity    0.872002
		Inclination     108.153
		AscendingNode   72.6135
		ArgOfPericenter -83.7101
		MeanAnomaly     133.811
	}
}

Comet	"C32"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.64414e-013
	Radius          0.916609
	InertiaMoment   0.399903

	Oblateness      0.00515516

	RotationPeriod  73.4484
	Obliquity       230.108
	EqAscendNode    302.362

	AbsMagn         12.8898
	SlopeParam      2.40839
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.688 0.685 0.684)

	Surface
	{
		SurfStyle       0.216692
		OceanStyle      0.892242
		Randomize      (0.749, -0.357, -0.325)
		colorDistMagn   0.480983
		colorDistFreq   0.000652366
		detailScale     25.0295
		colorConversion true
		snowLevel       2
		tropicLatitude  0.706782
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.631531
		terraceProb     0.376835
		erosion         0
		montesMagn      0.343894
		montesFreq      3.56752
		montesSpiky     0.97619
		montesFraction  0.371033
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00244356
		hillsFraction   0.860365
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230499
		craterFreq      0.234308
		craterDensity   1.04455
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   279.478
		volcanoTemp     1799.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.274, 0.274, 0.000)
		colorShelf     (0.292, 0.291, 0.291, 0.000)
		colorBeach     (0.309, 0.308, 0.308, 0.000)
		colorDesert    (0.327, 0.326, 0.325, 0.000)
		colorLowland   (0.344, 0.343, 0.342, 0.000)
		colorUpland    (0.361, 0.360, 0.359, 0.000)
		colorRock      (0.378, 0.377, 0.376, 0.000)
		colorSnow      (0.395, 0.394, 0.393, 1.000)
		BumpHeight      0.824948
		BumpOffset      0.16499
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.309758
		GasToDust   0.25
		Particles   1605
		GasBright   0.166118
		DustBright  0.716154
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.8453
		Period          8.87015
		Eccentricity    0.915878
		Inclination     85.0679
		AscendingNode   3.97722
		ArgOfPericenter -129.666
		MeanAnomaly     -161.942
	}
}

Comet	"C33"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.04505e-009
	Radius          16.2844
	InertiaMoment   0.398789

	Oblateness      0.00396343

	RotationPeriod  71.1757
	Obliquity       183.314
	EqAscendNode    286.94

	AbsMagn         0.416936
	SlopeParam      6.1208
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.759 0.726 0.696)

	Surface
	{
		SurfStyle       0.0198319
		OceanStyle      0.879453
		Randomize      (0.885, -0.983, 0.630)
		colorDistMagn   0.91105
		colorDistFreq   0.138386
		detailScale     444.673
		colorConversion true
		snowLevel       2
		tropicLatitude  0.448406
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.74125
		terraceProb     0.166858
		erosion         0
		montesMagn      0.468944
		montesFreq      3.61424
		montesSpiky     0.895097
		montesFraction  0.838382
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.734338
		hillsFraction   0.71648
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243558
		craterFreq      0.254348
		craterDensity   0.941965
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   56.458
		volcanoTemp     1744.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.291, 0.279, 0.000)
		colorShelf     (0.322, 0.309, 0.296, 0.000)
		colorBeach     (0.341, 0.327, 0.313, 0.000)
		colorDesert    (0.360, 0.345, 0.331, 0.000)
		colorLowland   (0.379, 0.363, 0.348, 0.000)
		colorUpland    (0.398, 0.381, 0.366, 0.000)
		colorRock      (0.417, 0.399, 0.383, 0.000)
		colorSnow      (0.436, 0.418, 0.400, 1.000)
		BumpHeight      14.656
		BumpOffset      2.93119
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.79095
		GasToDust   0.25
		Particles   2577
		GasBright   0.140176
		DustBright  0.426583
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.84122
		Period          8.84081
		Eccentricity    0.928891
		Inclination     -28.3921
		AscendingNode   55.4504
		ArgOfPericenter -14.191
		MeanAnomaly     -171.932
	}
}

Comet	"C34"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            6.29686e-017
	Radius          0.0567755
	InertiaMoment   0.396959

	Oblateness      0.00576645

	RotationPeriod  68.9918
	Obliquity       136.519
	EqAscendNode    271.517

	AbsMagn         4.04185
	SlopeParam      4.80651
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.649 0.452 0.384)

	Surface
	{
		SurfStyle       0.957339
		OceanStyle      0.302371
		Randomize      (-0.271, -0.853, 0.859)
		colorDistMagn   0.564399
		colorDistFreq   9.68961e-007
		detailScale     1.55035
		colorConversion true
		snowLevel       2
		tropicLatitude  0.947449
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.564576
		terraceProb     0.258556
		erosion         0
		montesMagn      0.502191
		montesFreq      3.22921
		montesSpiky     0.877906
		montesFraction  0.506574
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.109e-006
		hillsFraction   0.457412
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227679
		craterFreq      0.210925
		craterDensity   0.733208
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1121.77
		volcanoTemp     1964.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.158, 0.154, 0.050)
		colorShelf     (0.260, 0.186, 0.177, 0.040)
		colorBeach     (0.299, 0.213, 0.200, 0.030)
		colorDesert    (0.338, 0.240, 0.227, 0.020)
		colorLowland   (0.376, 0.267, 0.250, 0.030)
		colorUpland    (0.415, 0.294, 0.273, 0.050)
		colorRock      (0.454, 0.321, 0.304, 0.020)
		colorSnow      (0.454, 0.321, 0.304, 1.000)
		BumpHeight      0.051098
		BumpOffset      0.0102196
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0769753
		DustBright  0.17427
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.39199
		Period          5.81149
		Eccentricity    0.848829
		Inclination     77.4916
		AscendingNode   -75.9792
		ArgOfPericenter -175.626
		MeanAnomaly     -111.504
	}
}

Comet	"C35"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            4.87017e-013
	Radius          1.00691
	InertiaMoment   0.399261

	Oblateness      0.00446371

	RotationPeriod  66.8826
	Obliquity       89.7249
	EqAscendNode    256.094

	AbsMagn         5.82613
	SlopeParam      3.78765
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.798 0.727 0.700)

	Surface
	{
		SurfStyle       0.790316
		OceanStyle      0.446261
		Randomize      (0.563, -0.937, 0.465)
		colorDistMagn   0.564302
		colorDistFreq   0.000302902
		detailScale     27.4954
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993087
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.370021
		terraceProb     0.419287
		erosion         0
		montesMagn      0.670601
		montesFreq      3.84576
		montesSpiky     0.975817
		montesFraction  0.483121
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00227431
		hillsFraction   0.720754
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245049
		craterFreq      0.181961
		craterDensity   0.952612
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   226.217
		volcanoTemp     1332.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.247, 0.196, 0.000)
		colorShelf     (0.319, 0.255, 0.224, 0.000)
		colorBeach     (0.375, 0.298, 0.266, 0.000)
		colorDesert    (0.407, 0.320, 0.259, 0.000)
		colorLowland   (0.447, 0.342, 0.294, 0.000)
		colorUpland    (0.495, 0.414, 0.357, 0.000)
		colorRock      (0.535, 0.451, 0.385, 0.000)
		colorSnow      (0.583, 0.480, 0.406, 1.000)
		BumpHeight      0.906219
		BumpOffset      0.181244
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.342584
		GasToDust   0.25
		Particles   1671
		GasBright   0.268851
		DustBright  0.466881
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.15716
		Period          11.2113
		Eccentricity    0.90199
		Inclination     -33.9715
		AscendingNode   -78.2912
		ArgOfPericenter -38.2196
		MeanAnomaly     -10.0425
	}
}

Comet	"C36"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.76673e-009
	Radius          22.1891
	InertiaMoment   0.397907

	Oblateness      0.00653892

	RotationPeriod  64.8363
	Obliquity       42.9306
	EqAscendNode    240.672

	AbsMagn         7.24974
	SlopeParam      2.70604
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.623 0.618 0.614)

	Surface
	{
		SurfStyle       0.116852
		OceanStyle      0.735942
		Randomize      (0.941, -0.878, -0.697)
		colorDistMagn   0.620369
		colorDistFreq   0.225005
		detailScale     605.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0.766551
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.61144
		terraceProb     0.480802
		erosion         0
		montesMagn      0.662217
		montesFreq      3.67195
		montesSpiky     0.975153
		montesFraction  0.566185
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.998025
		hillsFraction   0.664612
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255982
		craterFreq      0.274777
		craterDensity   0.850239
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   56.6844
		volcanoTemp     1740.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.247, 0.246, 0.000)
		colorShelf     (0.265, 0.263, 0.261, 0.000)
		colorBeach     (0.280, 0.278, 0.276, 0.000)
		colorDesert    (0.296, 0.293, 0.292, 0.000)
		colorLowland   (0.311, 0.309, 0.307, 0.000)
		colorUpland    (0.327, 0.324, 0.323, 0.000)
		colorRock      (0.343, 0.340, 0.338, 0.000)
		colorSnow      (0.358, 0.355, 0.353, 1.000)
		BumpHeight      19.9702
		BumpOffset      3.99404
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.823776
		GasToDust   0.25
		Particles   2643
		GasBright   0.178368
		DustBright  0.24185
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.14382
		Period          11.1074
		Eccentricity    0.898345
		Inclination     53.5736
		AscendingNode   112.24
		ArgOfPericenter 113.366
		MeanAnomaly     -105.841
	}
}

Comet	"C37"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.1598e-016
	Radius          0.0622465
	InertiaMoment   0.399695

	Oblateness      0.00502394

	RotationPeriod  62.8431
	Obliquity       356.136
	EqAscendNode    225.249

	AbsMagn         8.58171
	SlopeParam      6.57764
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.474 0.431 0.369)

	Surface
	{
		SurfStyle       0.156925
		OceanStyle      0.00387176
		Randomize      (0.692, 0.224, -0.987)
		colorDistMagn   0.807875
		colorDistFreq   2.14972e-006
		detailScale     1.69974
		colorConversion true
		snowLevel       2
		tropicLatitude  0.451865
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.312907
		terraceProb     0.310346
		erosion         0
		montesMagn      0.676641
		montesFreq      2.85263
		montesSpiky     0.938905
		montesFraction  0.547587
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.97792e-006
		hillsFraction   0.696994
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222737
		craterFreq      0.240906
		craterDensity   0.868828
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   906.209
		volcanoTemp     1631.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.172, 0.148, 0.000)
		colorShelf     (0.201, 0.183, 0.157, 0.000)
		colorBeach     (0.213, 0.194, 0.166, 0.000)
		colorDesert    (0.225, 0.205, 0.175, 0.000)
		colorLowland   (0.237, 0.215, 0.185, 0.000)
		colorUpland    (0.249, 0.226, 0.194, 0.000)
		colorRock      (0.260, 0.237, 0.203, 0.000)
		colorSnow      (0.272, 0.248, 0.212, 1.000)
		BumpHeight      0.0560218
		BumpOffset      0.0112044
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.437435
		DustBright  0.46727
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.92531
		Period          9.45329
		Eccentricity    0.92519
		Inclination     -25.04
		AscendingNode   65.4115
		ArgOfPericenter 69.5838
		MeanAnomaly     -170.466
	}
}

Comet	"C38"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            8.97024e-013
	Radius          1.37442
	InertiaMoment   0.39853

	Oblateness      0.0074148

	RotationPeriod  60.8944
	Obliquity       309.342
	EqAscendNode    209.827

	AbsMagn         9.9836
	SlopeParam      5.06246
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.794 0.792 0.789)

	Surface
	{
		SurfStyle       0.204571
		OceanStyle      0.0888346
		Randomize      (0.540, -0.068, -0.624)
		colorDistMagn   0.546231
		colorDistFreq   0.00150942
		detailScale     37.5307
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999957
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.625498
		terraceProb     0.271595
		erosion         0
		montesMagn      0.509939
		montesFreq      3.03903
		montesSpiky     0.930005
		montesFraction  0.732398
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00396279
		hillsFraction   0.477598
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254409
		craterFreq      0.219965
		craterDensity   0.931827
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   227.521
		volcanoTemp     1182.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.317, 0.316, 0.000)
		colorShelf     (0.338, 0.337, 0.335, 0.000)
		colorBeach     (0.357, 0.357, 0.355, 0.000)
		colorDesert    (0.377, 0.376, 0.375, 0.000)
		colorLowland   (0.397, 0.396, 0.395, 0.000)
		colorUpland    (0.417, 0.416, 0.414, 0.000)
		colorRock      (0.437, 0.436, 0.434, 0.000)
		colorSnow      (0.457, 0.456, 0.454, 1.000)
		BumpHeight      1.23697
		BumpOffset      0.247395
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.375409
		GasToDust   0.25
		Particles   1738
		GasBright   0.0250737
		DustBright  0.564118
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.56551
		Period          6.93132
		Eccentricity    0.889321
		Inclination     -114.468
		AscendingNode   -112.718
		ArgOfPericenter 117.194
		MeanAnomaly     60.5163
	}
}

Comet	"C39"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            6.93784e-009
	Radius          24.2727
	InertiaMoment   0.396008

	Oblateness      0.0055754

	RotationPeriod  58.9827
	Obliquity       262.548
	EqAscendNode    194.404

	AbsMagn         11.6955
	SlopeParam      4.01741
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.649 0.646 0.643)

	Surface
	{
		SurfStyle       0.13089
		OceanStyle      0.386877
		Randomize      (0.326, 0.597, 0.116)
		colorDistMagn   0.290989
		colorDistFreq   0.420967
		detailScale     662.807
		colorConversion true
		snowLevel       2
		tropicLatitude  0.917883
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.751059
		terraceProb     0.120041
		erosion         0
		montesMagn      0.416702
		montesFreq      2.67502
		montesSpiky     0.998304
		montesFraction  0.618293
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.997238
		hillsFraction   0.469226
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212129
		craterFreq      0.261887
		craterDensity   0.935035
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   45.689
		volcanoTemp     1330.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.258, 0.257, 0.000)
		colorShelf     (0.276, 0.275, 0.273, 0.000)
		colorBeach     (0.292, 0.291, 0.289, 0.000)
		colorDesert    (0.308, 0.307, 0.306, 0.000)
		colorLowland   (0.324, 0.323, 0.322, 0.000)
		colorUpland    (0.341, 0.339, 0.338, 0.000)
		colorRock      (0.357, 0.355, 0.354, 0.000)
		colorSnow      (0.373, 0.372, 0.370, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.856601
		GasToDust   0.25
		Particles   2710
		GasBright   0.0278061
		DustBright  0.245872
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.22522
		Period          11.7461
		Eccentricity    0.931278
		Inclination     160.407
		AscendingNode   34.3041
		ArgOfPericenter -128.25
		MeanAnomaly     143.563
	}
}

Comet	"C40"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.13621e-016
	Radius          0.085133
	InertiaMoment   0.399035

	Oblateness      0.00843099

	RotationPeriod  57.1016
	Obliquity       215.753
	EqAscendNode    178.982

	AbsMagn         14.7575
	SlopeParam      2.97742
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.701 0.699 0.697)

	Surface
	{
		SurfStyle       0.638942
		OceanStyle      0.74218
		Randomize      (-0.814, -0.388, -0.660)
		colorDistMagn   0.73889
		colorDistFreq   4.46112e-006
		detailScale     2.3247
		colorConversion true
		snowLevel       2
		tropicLatitude  0.923257
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.480145
		terraceProb     0.155742
		erosion         0
		montesMagn      0.392422
		montesFreq      2.85498
		montesSpiky     0.824187
		montesFraction  0.596562
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.08605e-005
		hillsFraction   0.669487
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231646
		craterFreq      0.228211
		craterDensity   0.877061
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   913.234
		volcanoTemp     1059.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.238, 0.195, 0.000)
		colorShelf     (0.281, 0.245, 0.223, 0.000)
		colorBeach     (0.330, 0.287, 0.265, 0.000)
		colorDesert    (0.358, 0.308, 0.258, 0.000)
		colorLowland   (0.393, 0.329, 0.293, 0.000)
		colorUpland    (0.435, 0.399, 0.355, 0.000)
		colorRock      (0.470, 0.434, 0.383, 0.000)
		colorSnow      (0.512, 0.462, 0.404, 1.000)
		BumpHeight      0.0766197
		BumpOffset      0.0153239
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.121797
		DustBright  0.636368
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.40986
		Period          5.92376
		Eccentricity    0.876315
		Inclination     81.5854
		AscendingNode   29.5268
		ArgOfPericenter -63.0075
		MeanAnomaly     -166.93
	}
}

Comet	"C41"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.6522e-012
	Radius          1.49957
	InertiaMoment   0.397509

	Oblateness      0.00632832

	RotationPeriod  55.245
	Obliquity       168.959
	EqAscendNode    163.559

	AbsMagn         2.73845
	SlopeParam      7.23324
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.459 0.455 0.447)

	Surface
	{
		SurfStyle       0.502466
		OceanStyle      0.956964
		Randomize      (-0.827, 0.933, -0.733)
		colorDistMagn   0.331609
		colorDistFreq   0.00188356
		detailScale     40.9482
		colorConversion true
		snowLevel       2
		tropicLatitude  0.416247
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.392501
		terraceProb     0.150523
		erosion         0
		montesMagn      0.459028
		montesFreq      2.89942
		montesSpiky     0.962852
		montesFraction  0.228978
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00544438
		hillsFraction   0.64011
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252139
		craterFreq      0.243355
		craterDensity   0.910905
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   182.911
		volcanoTemp     1329.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.155, 0.125, 0.000)
		colorShelf     (0.184, 0.159, 0.143, 0.000)
		colorBeach     (0.216, 0.187, 0.170, 0.000)
		colorDesert    (0.234, 0.200, 0.165, 0.000)
		colorLowland   (0.257, 0.214, 0.188, 0.000)
		colorUpland    (0.285, 0.259, 0.228, 0.000)
		colorRock      (0.308, 0.282, 0.246, 0.000)
		colorSnow      (0.335, 0.300, 0.259, 1.000)
		BumpHeight      1.34961
		BumpOffset      0.269922
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.408235
		GasToDust   0.25
		Particles   1804
		GasBright   0.0972469
		DustBright  0.345405
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.83596
		Period          16.8998
		Eccentricity    0.955226
		Inclination     153.539
		AscendingNode   -111.004
		ArgOfPericenter 96.788
		MeanAnomaly     90.2857
	}
}

Comet	"C42"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.27786e-008
	Radius          33.272
	InertiaMoment   0.399484

	Oblateness      0.00963394

	RotationPeriod  53.4075
	Obliquity       122.165
	EqAscendNode    148.136

	AbsMagn         4.9969
	SlopeParam      5.33718
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.554 0.546 0.542)

	Surface
	{
		SurfStyle       0.685738
		OceanStyle      0.66058
		Randomize      (0.428, -0.451, -0.597)
		colorDistMagn   0.535332
		colorDistFreq   0.440376
		detailScale     908.548
		colorConversion true
		snowLevel       2
		tropicLatitude  0.835743
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.444984
		terraceProb     0.370305
		erosion         0
		montesMagn      0.450309
		montesFreq      2.05759
		montesSpiky     0.957355
		montesFraction  0.411736
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.79673
		hillsFraction   0.716455
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243451
		craterFreq      0.2357
		craterDensity   1.01956
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.1469
		volcanoTemp     1615.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.186, 0.152, 0.000)
		colorShelf     (0.222, 0.191, 0.173, 0.000)
		colorBeach     (0.260, 0.224, 0.206, 0.000)
		colorDesert    (0.282, 0.240, 0.200, 0.000)
		colorLowland   (0.310, 0.256, 0.228, 0.000)
		colorUpland    (0.343, 0.311, 0.276, 0.000)
		colorRock      (0.371, 0.338, 0.298, 0.000)
		colorSnow      (0.404, 0.360, 0.314, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.889427
		GasToDust   0.25
		Particles   2776
		GasBright   0.258428
		DustBright  0.66871
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.8681
		Period          9.03509
		Eccentricity    0.946578
		Inclination     177.901
		AscendingNode   -123.526
		ArgOfPericenter 75.2274
		MeanAnomaly     -141.632
	}
}

Comet	"C43"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.93463e-016
	Radius          0.0925986
	InertiaMoment   0.398244

	Oblateness      0.00719642

	RotationPeriod  51.584
	Obliquity       75.3706
	EqAscendNode    132.714

	AbsMagn         6.55117
	SlopeParam      4.2474
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.479 0.477 0.474)

	Surface
	{
		SurfStyle       0.707032
		OceanStyle      0.0487208
		Randomize      (-0.967, -0.241, -0.206)
		colorDistMagn   0.108319
		colorDistFreq   5.07289e-006
		detailScale     2.52856
		colorConversion true
		snowLevel       2
		tropicLatitude  0.905581
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570441
		terraceProb     0.234242
		erosion         0
		montesMagn      0.569081
		montesFreq      2.95631
		montesSpiky     0.909336
		montesFraction  0.798453
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.23032e-005
		hillsFraction   0.572438
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239644
		craterFreq      0.202355
		craterDensity   0.777853
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   731.911
		volcanoTemp     1581.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.162, 0.133, 0.000)
		colorShelf     (0.192, 0.167, 0.152, 0.000)
		colorBeach     (0.225, 0.196, 0.180, 0.000)
		colorDesert    (0.245, 0.210, 0.176, 0.000)
		colorLowland   (0.268, 0.224, 0.199, 0.000)
		colorUpland    (0.297, 0.272, 0.242, 0.000)
		colorRock      (0.321, 0.296, 0.261, 0.000)
		colorSnow      (0.350, 0.315, 0.275, 1.000)
		BumpHeight      0.0833388
		BumpOffset      0.0166678
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.206596
		DustBright  0.405029
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.42767
		Period          6.03636
		Eccentricity    0.903948
		Inclination     67.8868
		AscendingNode   54.6017
		ArgOfPericenter -9.4848
		MeanAnomaly     -163.313
	}
}

Comet	"C44"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.04316e-012
	Radius          2.06092
	InertiaMoment   0.399908

	Oblateness      0.0110885

	RotationPeriod  49.7696
	Obliquity       28.5763
	EqAscendNode    117.291

	AbsMagn         7.90778
	SlopeParam      3.23111
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.615 0.608 0.605)

	Surface
	{
		SurfStyle       0.294543
		OceanStyle      0.785014
		Randomize      (-0.994, 0.412, 0.131)
		colorDistMagn   0.202161
		colorDistFreq   0.00170779
		detailScale     56.2767
		colorConversion true
		snowLevel       2
		tropicLatitude  0.560728
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629762
		terraceProb     0.411145
		erosion         0
		montesMagn      0.447993
		montesFreq      2.59257
		montesSpiky     0.910888
		montesFraction  0.556503
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0105637
		hillsFraction   0.61332
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274337
		craterFreq      0.248928
		craterDensity   0.776906
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   185.227
		volcanoTemp     1682.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.243, 0.242, 0.000)
		colorShelf     (0.261, 0.258, 0.257, 0.000)
		colorBeach     (0.277, 0.274, 0.272, 0.000)
		colorDesert    (0.292, 0.289, 0.287, 0.000)
		colorLowland   (0.307, 0.304, 0.302, 0.000)
		colorUpland    (0.323, 0.319, 0.318, 0.000)
		colorRock      (0.338, 0.334, 0.333, 0.000)
		colorSnow      (0.353, 0.350, 0.348, 1.000)
		BumpHeight      1.85482
		BumpOffset      0.370965
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.441061
		GasToDust   0.25
		Particles   1870
		GasBright   0.117505
		DustBright  0.178606
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.63109
		Period          7.37138
		Eccentricity    0.90721
		Inclination     33.0542
		AscendingNode   110.636
		ArgOfPericenter -121.727
		MeanAnomaly     97.5221
	}
}

Comet	"C45"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.35366e-008
	Radius          36.053
	InertiaMoment   0.398795

	Oblateness      0.00823114

	RotationPeriod  47.9598
	Obliquity       341.782
	EqAscendNode    101.869

	AbsMagn         9.25355
	SlopeParam      8.89132
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.660 0.560 0.461)

	Surface
	{
		SurfStyle       0.416056
		OceanStyle      0.612168
		Randomize      (0.099, 0.245, 0.311)
		colorDistMagn   0.682619
		colorDistFreq   0.200644
		detailScale     984.487
		colorConversion true
		snowLevel       2
		tropicLatitude  0.980033
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552856
		terraceProb     0.36693
		erosion         0
		montesMagn      0.466603
		montesFreq      3.26986
		montesSpiky     0.879422
		montesFraction  0.653034
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.5827
		hillsFraction   0.538949
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235798
		craterFreq      0.259061
		craterDensity   0.880535
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   36.8447
		volcanoTemp     1300.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.224, 0.184, 0.000)
		colorShelf     (0.281, 0.238, 0.196, 0.000)
		colorBeach     (0.297, 0.252, 0.207, 0.000)
		colorDesert    (0.314, 0.266, 0.219, 0.000)
		colorLowland   (0.330, 0.280, 0.230, 0.000)
		colorUpland    (0.347, 0.294, 0.242, 0.000)
		colorRock      (0.363, 0.308, 0.253, 0.000)
		colorSnow      (0.380, 0.322, 0.265, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.922253
		GasToDust   0.25
		Particles   2842
		GasBright   0.355853
		DustBright  0.424744
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.83176
		Period          8.77275
		Eccentricity    0.983296
		Inclination     95.0543
		AscendingNode   24.8794
		ArgOfPericenter -90.1167
		MeanAnomaly     78.2593
	}
}

Comet	"C46"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            7.24711e-016
	Radius          0.127656
	InertiaMoment   0.396976

	Oblateness      0.012729

	RotationPeriod  46.1498
	Obliquity       294.988
	EqAscendNode    86.446

	AbsMagn         10.7639
	SlopeParam      5.63986
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.725 0.723 0.721)

	Surface
	{
		SurfStyle       0.42739
		OceanStyle      0.628278
		Randomize      (0.559, 0.535, 0.704)
		colorDistMagn   0.279842
		colorDistFreq   1.64822e-006
		detailScale     3.48587
		colorConversion true
		snowLevel       2
		tropicLatitude  0.946634
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.616671
		terraceProb     0.199064
		erosion         0
		montesMagn      0.301277
		montesFreq      2.58888
		montesSpiky     0.977997
		montesFraction  0.581489
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.08841e-005
		hillsFraction   0.931202
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250661
		craterFreq      0.230806
		craterDensity   0.978263
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   743.474
		volcanoTemp     1393.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.289, 0.288, 0.000)
		colorShelf     (0.308, 0.307, 0.306, 0.000)
		colorBeach     (0.326, 0.326, 0.324, 0.000)
		colorDesert    (0.344, 0.344, 0.342, 0.000)
		colorLowland   (0.363, 0.362, 0.360, 0.000)
		colorUpland    (0.381, 0.380, 0.378, 0.000)
		colorRock      (0.399, 0.398, 0.396, 0.000)
		colorSnow      (0.417, 0.416, 0.414, 1.000)
		BumpHeight      0.114891
		BumpOffset      0.0229782
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.00693817
		DustBright  0.458146
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.94105
		Period          9.56946
		Eccentricity    0.934274
		Inclination     64.9753
		AscendingNode   79.929
		ArgOfPericenter 141.492
		MeanAnomaly     -147.776
	}
}

Comet	"C47"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            5.60512e-012
	Radius          2.22231
	InertiaMoment   0.399267

	Oblateness      0.00948928

	RotationPeriod  44.3351
	Obliquity       248.193
	EqAscendNode    71.0234

	AbsMagn         12.8516
	SlopeParam      4.48072
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.426 0.423 0.419)

	Surface
	{
		SurfStyle       0.811551
		OceanStyle      0.951563
		Randomize      (-0.496, -0.176, 0.659)
		colorDistMagn   0.999269
		colorDistFreq   0.00370536
		detailScale     60.6838
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979585
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.541296
		terraceProb     0.256005
		erosion         0
		montesMagn      0.554811
		montesFreq      3.84977
		montesSpiky     0.87819
		montesFraction  0.589785
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0153866
		hillsFraction   0.65639
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248886
		craterFreq      0.275076
		craterDensity   0.879405
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   147.169
		volcanoTemp     1625.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.144, 0.117, 0.000)
		colorShelf     (0.171, 0.148, 0.134, 0.000)
		colorBeach     (0.200, 0.174, 0.159, 0.000)
		colorDesert    (0.218, 0.186, 0.155, 0.000)
		colorLowland   (0.239, 0.199, 0.176, 0.000)
		colorUpland    (0.264, 0.241, 0.214, 0.000)
		colorRock      (0.286, 0.262, 0.231, 0.000)
		colorSnow      (0.311, 0.279, 0.243, 1.000)
		BumpHeight      2.00008
		BumpOffset      0.400015
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.473887
		GasToDust   0.25
		Particles   1937
		GasBright   0.0702334
		DustBright  0.879337
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.9356
		Period          9.52919
		Eccentricity    0.930898
		Inclination     122.915
		AscendingNode   -121.126
		ArgOfPericenter 159.308
		MeanAnomaly     -128.73
	}
}

Comet	"C48"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            4.33515e-008
	Radius          49.8913
	InertiaMoment   0.397916

	Oblateness      0.0150235

	RotationPeriod  42.5111
	Obliquity       201.399
	EqAscendNode    55.6008

	AbsMagn         0.304168
	SlopeParam      3.47296
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.565 0.483 0.447)

	Surface
	{
		SurfStyle       0.564218
		OceanStyle      0.661452
		Randomize      (0.546, 0.164, 0.280)
		colorDistMagn   0.646821
		colorDistFreq   1.27373
		detailScale     1362.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.948899
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48638
		terraceProb     0.384112
		erosion         0
		montesMagn      0.453322
		montesFreq      3.02832
		montesSpiky     0.996828
		montesFraction  0.609767
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.45088
		hillsFraction   0.719319
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25979
		craterFreq      0.192818
		craterDensity   0.966167
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.569
		volcanoTemp     1684.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.164, 0.125, 0.000)
		colorShelf     (0.226, 0.169, 0.143, 0.000)
		colorBeach     (0.265, 0.198, 0.170, 0.000)
		colorDesert    (0.288, 0.213, 0.165, 0.000)
		colorLowland   (0.316, 0.227, 0.188, 0.000)
		colorUpland    (0.350, 0.275, 0.228, 0.000)
		colorRock      (0.378, 0.300, 0.246, 0.000)
		colorSnow      (0.412, 0.319, 0.259, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.955079
		GasToDust   0.25
		Particles   2909
		GasBright   0.0843351
		DustBright  0.549722
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.8306
		Period          8.76439
		Eccentricity    0.88436
		Inclination     70.4073
		AscendingNode   90.5612
		ArgOfPericenter 156.809
		MeanAnomaly     63.2568
	}
}

Comet	"C49"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.33482e-015
	Radius          0.136708
	InertiaMoment   0.399701

	Oblateness      0.0110397

	RotationPeriod  40.6729
	Obliquity       154.605
	EqAscendNode    40.1782

	AbsMagn         4.01203
	SlopeParam      2.2965
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.689 0.686 0.684)

	Surface
	{
		SurfStyle       0.964547
		OceanStyle      0.964887
		Randomize      (0.051, 0.460, -0.482)
		colorDistMagn   0.68994
		colorDistFreq   7.4719e-006
		detailScale     3.73304
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998907
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.428934
		terraceProb     0.231575
		erosion         0
		montesMagn      0.58391
		montesFreq      2.59127
		montesSpiky     0.94991
		montesFraction  0.746919
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.2145e-005
		hillsFraction   0.618849
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268762
		craterFreq      0.169487
		craterDensity   0.82464
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   586.662
		volcanoTemp     1662.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.240, 0.274, 0.050)
		colorShelf     (0.275, 0.281, 0.315, 0.040)
		colorBeach     (0.317, 0.322, 0.356, 0.030)
		colorDesert    (0.358, 0.364, 0.404, 0.020)
		colorLowland   (0.399, 0.405, 0.445, 0.030)
		colorUpland    (0.441, 0.446, 0.486, 0.050)
		colorRock      (0.482, 0.487, 0.540, 0.020)
		colorSnow      (0.482, 0.487, 0.540, 1.000)
		BumpHeight      0.123037
		BumpOffset      0.0246075
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0255211
		GasToDust   0.25
		Particles   1031
		GasBright   0.0611776
		DustBright  0.257366
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.25105
		Period          11.9511
		Eccentricity    0.955528
		Inclination     96.3193
		AscendingNode   -69.9437
		ArgOfPericenter 29.4951
		MeanAnomaly     -22.4744
	}
}

Comet	"C50"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.03239e-011
	Radius          3.09036
	InertiaMoment   0.398537

	Oblateness      0.0180256

	RotationPeriod  38.8153
	Obliquity       107.81
	EqAscendNode    24.7556

	AbsMagn         5.805
	SlopeParam      5.98582
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.524 0.519 0.513)

	Surface
	{
		SurfStyle       0.731001
		OceanStyle      0.174627
		Randomize      (0.115, 0.869, 0.223)
		colorDistMagn   0.247364
		colorDistFreq   0.00618495
		detailScale     84.3873
		colorConversion true
		snowLevel       2
		tropicLatitude  0.605914
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512237
		terraceProb     0.212845
		erosion         0
		montesMagn      0.395918
		montesFreq      3.08557
		montesSpiky     0.998163
		montesFraction  0.563716
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0208707
		hillsFraction   0.688677
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247313
		craterFreq      0.178743
		craterDensity   0.86758
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   150.797
		volcanoTemp     1214.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.176, 0.144, 0.000)
		colorShelf     (0.210, 0.182, 0.164, 0.000)
		colorBeach     (0.246, 0.213, 0.195, 0.000)
		colorDesert    (0.267, 0.228, 0.190, 0.000)
		colorLowland   (0.293, 0.244, 0.215, 0.000)
		colorUpland    (0.325, 0.296, 0.261, 0.000)
		colorRock      (0.351, 0.322, 0.282, 0.000)
		colorSnow      (0.382, 0.343, 0.297, 1.000)
		BumpHeight      2.78132
		BumpOffset      0.556264
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.506713
		GasToDust   0.25
		Particles   2003
		GasBright   0.20164
		DustBright  0.60139
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.55931
		Period          6.8902
		Eccentricity    0.934011
		Inclination     -133.143
		AscendingNode   32.4258
		ArgOfPericenter 2.79489
		MeanAnomaly     -38.4839
	}
}

Comet	"C51"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            7.9848e-008
	Radius          52.786
	InertiaMoment   0.396046

	Oblateness      0.0127092

	RotationPeriod  36.933
	Obliquity       61.0162
	EqAscendNode    9.33303

	AbsMagn         7.2312
	SlopeParam      4.72079
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.617 0.613 0.605)

	Surface
	{
		SurfStyle       0.864091
		OceanStyle      0.426136
		Randomize      (0.723, -0.543, 0.513)
		colorDistMagn   0.831569
		colorDistFreq   2.3328
		detailScale     1441.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999767
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.432102
		terraceProb     0.215123
		erosion         0
		montesMagn      0.400378
		montesFreq      3.02742
		montesSpiky     0.980964
		montesFraction  0.723176
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.01418
		hillsFraction   0.684135
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21832
		craterFreq      0.200265
		craterDensity   0.797121
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.2882
		volcanoTemp     1431.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.214, 0.242, 0.050)
		colorShelf     (0.247, 0.251, 0.278, 0.040)
		colorBeach     (0.284, 0.288, 0.315, 0.030)
		colorDesert    (0.321, 0.325, 0.357, 0.020)
		colorLowland   (0.358, 0.362, 0.393, 0.030)
		colorUpland    (0.395, 0.398, 0.430, 0.050)
		colorRock      (0.432, 0.435, 0.478, 0.020)
		colorSnow      (0.432, 0.435, 0.478, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.987905
		GasToDust   0.25
		Particles   2975
		GasBright   0.151201
		DustBright  0.336316
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.31423
		Period          5.33137
		Eccentricity    0.922298
		Inclination     40.2936
		AscendingNode   -52.0359
		ArgOfPericenter -81.2279
		MeanAnomaly     -158.363
	}
}

Comet	"C52"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.45858e-015
	Radius          0.191422
	InertiaMoment   0.399041

	Oblateness      0.0221412

	RotationPeriod  35.0198
	Obliquity       14.2219
	EqAscendNode    353.91

	AbsMagn         8.56331
	SlopeParam      3.70732
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.607 0.602 0.595)

	Surface
	{
		SurfStyle       0.940299
		OceanStyle      0.866411
		Randomize      (0.239, -0.712, -0.734)
		colorDistMagn   0.796901
		colorDistFreq   2.67402e-006
		detailScale     5.22711
		colorConversion true
		snowLevel       2
		tropicLatitude  0.72464
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.583749
		terraceProb     0.453058
		erosion         0
		montesMagn      0.4041
		montesFreq      2.78618
		montesSpiky     0.908425
		montesFraction  0.539298
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.60858e-005
		hillsFraction   0.740278
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273687
		craterFreq      0.211303
		craterDensity   0.820682
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   605.28
		volcanoTemp     1895.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.211, 0.238, 0.050)
		colorShelf     (0.243, 0.247, 0.274, 0.040)
		colorBeach     (0.279, 0.283, 0.309, 0.030)
		colorDesert    (0.315, 0.319, 0.351, 0.020)
		colorLowland   (0.352, 0.355, 0.387, 0.030)
		colorUpland    (0.388, 0.391, 0.422, 0.050)
		colorRock      (0.425, 0.428, 0.470, 0.020)
		colorSnow      (0.425, 0.428, 0.470, 1.000)
		BumpHeight      0.17228
		BumpOffset      0.034456
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0583472
		GasToDust   0.25
		Particles   1097
		GasBright   0.358854
		DustBright  0.61315
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.07784
		Period          10.5986
		Eccentricity    0.917274
		Inclination     -42.9513
		AscendingNode   96.9905
		ArgOfPericenter 157.239
		MeanAnomaly     -48.4782
	}
}

Comet	"C53"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.90154e-011
	Radius          4.99466
	InertiaMoment   0.39752

	Oblateness      0.0567051

	RotationPeriod  33.0693
	Obliquity       327.428
	EqAscendNode    338.488

	AbsMagn         9.96304
	SlopeParam      2.60616
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.731 0.729 0.727)

	Surface
	{
		SurfStyle       0.495829
		OceanStyle      0.435533
		Randomize      (0.810, -0.874, -0.461)
		colorDistMagn   0.477711
		colorDistFreq   0.0124557
		detailScale     136.388
		colorConversion true
		snowLevel       2
		tropicLatitude  0.904874
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.6352
		terraceProb     0.262382
		erosion         0
		montesMagn      0.238784
		montesFreq      3.30039
		montesSpiky     0.873787
		montesFraction  0.56141
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0508143
		hillsFraction   0.796153
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243374
		craterFreq      0.18741
		craterDensity   0.99005
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   179.581
		volcanoTemp     1597.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.292, 0.291, 0.000)
		colorShelf     (0.311, 0.310, 0.309, 0.000)
		colorBeach     (0.329, 0.328, 0.327, 0.000)
		colorDesert    (0.347, 0.346, 0.345, 0.000)
		colorLowland   (0.366, 0.365, 0.363, 0.000)
		colorUpland    (0.384, 0.383, 0.381, 0.000)
		colorRock      (0.402, 0.401, 0.400, 0.000)
		colorSnow      (0.421, 0.419, 0.418, 1.000)
		BumpHeight      4.4952
		BumpOffset      0.899039
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.539539
		GasToDust   0.25
		Particles   2069
		GasBright   0.281132
		DustBright  0.375358
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.02456
		Period          10.1936
		Eccentricity    0.898377
		Inclination     105.747
		AscendingNode   112.343
		ArgOfPericenter 56.9131
		MeanAnomaly     80.7878
	}
}

Comet	"C54"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.4707e-007
	Radius          74.8131
	InertiaMoment   0.39949

	Oblateness      0.0281114

	RotationPeriod  31.0739
	Obliquity       280.633
	EqAscendNode    323.065

	AbsMagn         11.6677
	SlopeParam      6.40457
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.677 0.598 0.470)

	Surface
	{
		SurfStyle       0.173271
		OceanStyle      0.0270679
		Randomize      (-0.094, -0.838, -0.049)
		colorDistMagn   0.170768
		colorDistFreq   1.83843
		detailScale     2042.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0.439142
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.417668
		terraceProb     0.291933
		erosion         0
		montesMagn      0.357803
		montesFreq      2.66867
		montesSpiky     0.945292
		montesFraction  0.594506
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.3231
		hillsFraction   0.631028
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229461
		craterFreq      0.265821
		craterDensity   0.772539
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   30.5859
		volcanoTemp     1474.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.239, 0.188, 0.000)
		colorShelf     (0.288, 0.254, 0.200, 0.000)
		colorBeach     (0.304, 0.269, 0.211, 0.000)
		colorDesert    (0.321, 0.284, 0.223, 0.000)
		colorLowland   (0.338, 0.299, 0.235, 0.000)
		colorUpland    (0.355, 0.314, 0.247, 0.000)
		colorRock      (0.372, 0.329, 0.258, 0.000)
		colorSnow      (0.389, 0.344, 0.270, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.166151
		DustBright  0.174826
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.15853
		Period          11.222
		Eccentricity    0.916179
		Inclination     55.8766
		AscendingNode   -12.3117
		ArgOfPericenter -127.767
		MeanAnomaly     -72.5652
	}
}

Comet	"C55"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            4.5284e-015
	Radius          0.295095
	InertiaMoment   0.398252

	Oblateness      0.0639213

	RotationPeriod  29.025
	Obliquity       233.839
	EqAscendNode    307.643

	AbsMagn         14.6828
	SlopeParam      4.97177
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.753 0.751 0.750)

	Surface
	{
		SurfStyle       0.510801
		OceanStyle      0.503603
		Randomize      (-0.991, 0.426, -0.174)
		colorDistMagn   0.659509
		colorDistFreq   3.1212e-005
		detailScale     8.05807
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998363
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544865
		terraceProb     0.144966
		erosion         0
		montesMagn      0.609197
		montesFreq      3.30046
		montesSpiky     0.891953
		montesFraction  0.292203
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000202378
		hillsFraction   0.705787
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.279016
		craterFreq      0.271778
		craterDensity   1.0094
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   687.536
		volcanoTemp     1337.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.255, 0.210, 0.000)
		colorShelf     (0.301, 0.263, 0.240, 0.000)
		colorBeach     (0.354, 0.308, 0.285, 0.000)
		colorDesert    (0.384, 0.331, 0.277, 0.000)
		colorLowland   (0.422, 0.353, 0.315, 0.000)
		colorUpland    (0.467, 0.428, 0.382, 0.000)
		colorRock      (0.505, 0.466, 0.412, 0.000)
		colorSnow      (0.550, 0.496, 0.435, 1.000)
		BumpHeight      0.265586
		BumpOffset      0.0531172
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0911732
		GasToDust   0.25
		Particles   1163
		GasBright   0.0382399
		DustBright  0.787224
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.32775
		Period          5.41383
		Eccentricity    0.914197
		Inclination     -82.3266
		AscendingNode   99.785
		ArgOfPericenter 151.468
		MeanAnomaly     46.9957
	}
}

Comet	"C56"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.50239e-011
	Radius          4.63408
	InertiaMoment   0.399914

	Oblateness      0.0374597

	RotationPeriod  26.9128
	Obliquity       187.045
	EqAscendNode    292.22

	AbsMagn         2.6949
	SlopeParam      3.93771
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.599 0.593 0.587)

	Surface
	{
		SurfStyle       0.279242
		OceanStyle      0.892096
		Randomize      (-0.494, 0.648, 0.017)
		colorDistMagn   0.412722
		colorDistFreq   0.0135519
		detailScale     126.541
		colorConversion true
		snowLevel       2
		tropicLatitude  0.43428
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.567389
		terraceProb     0.158723
		erosion         0
		montesMagn      0.548645
		montesFreq      3.24062
		montesSpiky     0.985928
		montesFraction  0.410197
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0610167
		hillsFraction   0.534163
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272406
		craterFreq      0.196756
		craterDensity   1.0501
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   122.768
		volcanoTemp     1146.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.237, 0.235, 0.000)
		colorShelf     (0.254, 0.252, 0.250, 0.000)
		colorBeach     (0.269, 0.267, 0.264, 0.000)
		colorDesert    (0.284, 0.282, 0.279, 0.000)
		colorLowland   (0.299, 0.297, 0.294, 0.000)
		colorUpland    (0.314, 0.312, 0.308, 0.000)
		colorRock      (0.329, 0.326, 0.323, 0.000)
		colorSnow      (0.344, 0.341, 0.338, 1.000)
		BumpHeight      4.17067
		BumpOffset      0.834134
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.572365
		GasToDust   0.25
		Particles   2136
		GasBright   0.0537338
		DustBright  0.456216
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.60538
		Period          7.19775
		Eccentricity    0.936134
		Inclination     159.859
		AscendingNode   -137.192
		ArgOfPericenter 71.7421
		MeanAnomaly     -138.427
	}
}

Comet	"C57"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.70884e-007
	Radius          112.788
	InertiaMoment   0.398802

	Oblateness      0.082389

	RotationPeriod  24.7253
	Obliquity       140.25
	EqAscendNode    276.797

	AbsMagn         4.97272
	SlopeParam      2.8855
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.553 0.548 0.543)

	Surface
	{
		SurfStyle       0.518289
		OceanStyle      0.646197
		Randomize      (-0.705, 0.115, -0.443)
		colorDistMagn   0.722369
		colorDistFreq   7.12373
		detailScale     3079.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.958129
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.397915
		terraceProb     0.171245
		erosion         0
		montesMagn      0.617961
		montesFreq      3.04067
		montesSpiky     0.91837
		montesFraction  0.656792
		dunesFraction   0
		hillsMagn       0
		hillsFreq       29.5922
		hillsFraction   0.85532
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231405
		craterFreq      0.402244
		craterDensity   0.810246
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   33.9764
		volcanoTemp     1418.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.186, 0.152, 0.000)
		colorShelf     (0.221, 0.192, 0.174, 0.000)
		colorBeach     (0.260, 0.225, 0.206, 0.000)
		colorDesert    (0.282, 0.241, 0.201, 0.000)
		colorLowland   (0.310, 0.257, 0.228, 0.000)
		colorUpland    (0.343, 0.312, 0.277, 0.000)
		colorRock      (0.371, 0.340, 0.299, 0.000)
		colorSnow      (0.404, 0.361, 0.315, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.163501
		DustBright  0.830935
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.33759
		Period          12.6469
		Eccentricity    0.967336
		Inclination     105.853
		AscendingNode   -97.1262
		ArgOfPericenter -43.4089
		MeanAnomaly     -178.118
	}
}

Comet	"C58"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            8.34073e-015
	Radius          0.287044
	InertiaMoment   0.396992

	Oblateness      0.0531469

	RotationPeriod  22.4482
	Obliquity       93.4561
	EqAscendNode    261.375

	AbsMagn         6.53172
	SlopeParam      6.96843
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.570 0.566 0.562)

	Surface
	{
		SurfStyle       0.236313
		OceanStyle      0.118976
		Randomize      (0.084, 0.088, 0.975)
		colorDistMagn   0.0804276
		colorDistFreq   3.37608e-005
		detailScale     7.83822
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987644
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.393665
		terraceProb     0.386148
		erosion         0
		montesMagn      0.501104
		montesFreq      3.3208
		montesSpiky     0.992504
		montesFraction  0.405381
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000205179
		hillsFraction   0.500598
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230586
		craterFreq      0.217003
		craterDensity   0.853775
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   492.78
		volcanoTemp     1241.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.226, 0.225, 0.000)
		colorShelf     (0.242, 0.241, 0.239, 0.000)
		colorBeach     (0.257, 0.255, 0.253, 0.000)
		colorDesert    (0.271, 0.269, 0.267, 0.000)
		colorLowland   (0.285, 0.283, 0.281, 0.000)
		colorUpland    (0.299, 0.297, 0.295, 0.000)
		colorRock      (0.314, 0.311, 0.309, 0.000)
		colorSnow      (0.328, 0.326, 0.323, 1.000)
		BumpHeight      0.25834
		BumpOffset      0.051668
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.123999
		GasToDust   0.25
		Particles   1230
		GasBright   0.151713
		DustBright  0.52721
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.06417
		Period          10.4942
		Eccentricity    0.976273
		Inclination     -160.91
		AscendingNode   130.885
		ArgOfPericenter -28.3094
		MeanAnomaly     145.427
	}
}

Comet	"C59"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            6.45096e-011
	Radius          6.88508
	InertiaMoment   0.399273

	Oblateness      0.119725

	RotationPeriod  20.0639
	Obliquity       46.6618
	EqAscendNode    245.952

	AbsMagn         7.88957
	SlopeParam      5.23912
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.613 0.609 0.603)

	Surface
	{
		SurfStyle       0.443732
		OceanStyle      0.661464
		Randomize      (-0.746, -0.940, -0.678)
		colorDistMagn   0.397072
		colorDistFreq   0.0269089
		detailScale     188.009
		colorConversion true
		snowLevel       2
		tropicLatitude  0.740279
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.677848
		terraceProb     0.13262
		erosion         0
		montesMagn      0.455032
		montesFreq      2.75719
		montesSpiky     0.949193
		montesFraction  0.603919
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0541127
		hillsFraction   0.456969
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240648
		craterFreq      0.2578
		craterDensity   0.950864
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   134.401
		volcanoTemp     1634.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.244, 0.241, 0.000)
		colorShelf     (0.260, 0.259, 0.256, 0.000)
		colorBeach     (0.276, 0.274, 0.271, 0.000)
		colorDesert    (0.291, 0.289, 0.286, 0.000)
		colorLowland   (0.306, 0.304, 0.302, 0.000)
		colorUpland    (0.322, 0.320, 0.317, 0.000)
		colorRock      (0.337, 0.335, 0.332, 0.000)
		colorSnow      (0.352, 0.350, 0.347, 1.000)
		BumpHeight      6.19657
		BumpOffset      1.23931
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.605191
		GasToDust   0.25
		Particles   2202
		GasBright   0.102666
		DustBright  0.260744
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.65938
		Period          7.56401
		Eccentricity    0.872309
		Inclination     -101.942
		AscendingNode   -138.18
		ArgOfPericenter 44.3686
		MeanAnomaly     163.935
	}
}

Comet	"C60"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            4.98935e-007
	Radius          112.185
	InertiaMoment   0.397925

	Oblateness      0.0870783

	RotationPeriod  17.5503
	Obliquity       359.868
	EqAscendNode    230.53

	AbsMagn         9.23445
	SlopeParam      4.16727
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.760 0.730 0.705)

	Surface
	{
		SurfStyle       0.416679
		OceanStyle      0.442415
		Randomize      (0.735, 0.102, 0.988)
		colorDistMagn   0.485261
		colorDistFreq   9.42945
		detailScale     3063.4
		colorConversion true
		snowLevel       2
		tropicLatitude  0.949506
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.764172
		terraceProb     0.19197
		erosion         0
		montesMagn      0.435691
		montesFreq      2.87034
		montesSpiky     0.94225
		montesFraction  0.450751
		dunesFraction   0
		hillsMagn       0
		hillsFreq       34.5637
		hillsFraction   0.606656
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231863
		craterFreq      0.517586
		craterDensity   0.877907
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.9011
		volcanoTemp     1773.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.292, 0.282, 0.000)
		colorShelf     (0.323, 0.310, 0.300, 0.000)
		colorBeach     (0.342, 0.328, 0.317, 0.000)
		colorDesert    (0.361, 0.347, 0.335, 0.000)
		colorLowland   (0.380, 0.365, 0.353, 0.000)
		colorUpland    (0.399, 0.383, 0.370, 0.000)
		colorRock      (0.418, 0.401, 0.388, 0.000)
		colorSnow      (0.437, 0.420, 0.405, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.2896
		DustBright  0.558296
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.62912
		Period          7.35802
		Eccentricity    0.921963
		Inclination     71.6948
		AscendingNode   98.5928
		ArgOfPericenter 22.5347
		MeanAnomaly     -116.826
	}
}

Comet	"C61"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.53626e-014
	Radius          0.421892
	InertiaMoment   0.399706

	Oblateness      0.210682

	RotationPeriod  14.8787
	Obliquity       313.073
	EqAscendNode    215.107

	AbsMagn         10.7409
	SlopeParam      3.14457
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.708 0.705 0.704)

	Surface
	{
		SurfStyle       0.776555
		OceanStyle      0.249078
		Randomize      (-0.309, 0.280, -0.122)
		colorDistMagn   0.406368
		colorDistFreq   0.000112408
		detailScale     11.5205
		colorConversion true
		snowLevel       2
		tropicLatitude  0.86509
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.509232
		terraceProb     0.481522
		erosion         0
		montesMagn      0.491284
		montesFreq      2.22744
		montesSpiky     0.944035
		montesFraction  0.491404
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000409092
		hillsFraction   0.552304
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252902
		craterFreq      0.258713
		craterDensity   0.864828
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   533.672
		volcanoTemp     1281.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.240, 0.197, 0.000)
		colorShelf     (0.283, 0.247, 0.225, 0.000)
		colorBeach     (0.333, 0.289, 0.267, 0.000)
		colorDesert    (0.361, 0.310, 0.260, 0.000)
		colorLowland   (0.396, 0.331, 0.295, 0.000)
		colorUpland    (0.439, 0.402, 0.359, 0.000)
		colorRock      (0.474, 0.437, 0.387, 0.000)
		colorSnow      (0.517, 0.465, 0.408, 1.000)
		BumpHeight      0.379702
		BumpOffset      0.0759405
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.156825
		GasToDust   0.25
		Particles   1296
		GasBright   0.213271
		DustBright  0.319112
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.11986
		Period          10.9217
		Eccentricity    0.885879
		Inclination     135.754
		AscendingNode   -91.3935
		ArgOfPericenter -101.353
		MeanAnomaly     48.2771
	}
}

Comet	"C62"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.18818e-010
	Radius          6.949
	InertiaMoment   0.398544

	Oblateness      0.185978

	RotationPeriod  12.0108
	Obliquity       266.279
	EqAscendNode    199.685

	AbsMagn         12.8138
	SlopeParam      7.9862
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.574 0.476 0.431)

	Surface
	{
		SurfStyle       0.645852
		OceanStyle      0.95496
		Randomize      (-0.522, -0.035, 0.470)
		colorDistMagn   0.939569
		colorDistFreq   0.0386849
		detailScale     189.754
		colorConversion true
		snowLevel       2
		tropicLatitude  0.607439
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.704773
		terraceProb     0.284916
		erosion         0
		montesMagn      0.56657
		montesFreq      2.40439
		montesSpiky     0.973761
		montesFraction  0.552112
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.155703
		hillsFraction   0.68404
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250326
		craterFreq      0.275032
		craterDensity   0.669684
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   99.9508
		volcanoTemp     1283.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.162, 0.121, 0.000)
		colorShelf     (0.229, 0.167, 0.138, 0.000)
		colorBeach     (0.270, 0.195, 0.164, 0.000)
		colorDesert    (0.293, 0.209, 0.159, 0.000)
		colorLowland   (0.321, 0.224, 0.181, 0.000)
		colorUpland    (0.356, 0.271, 0.220, 0.000)
		colorRock      (0.384, 0.295, 0.237, 0.000)
		colorSnow      (0.419, 0.314, 0.250, 1.000)
		BumpHeight      6.2541
		BumpOffset      1.25082
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.638017
		GasToDust   0.25
		Particles   2268
		GasBright   0.0996824
		DustBright  0.117187
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.54136
		Period          6.77155
		Eccentricity    0.885155
		Inclination     60.7804
		AscendingNode   151.131
		ArgOfPericenter 14.3431
		MeanAnomaly     -22.3023
	}
}

Comet	"C63"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.65852e-018
	Radius          0.0259104
	InertiaMoment   0.396082

	Oblateness      0.249

	RotationPeriod  8.89423
	Obliquity       219.485
	EqAscendNode    184.262

	AbsMagn         0.184928
	SlopeParam      5.53075
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.678 0.619 0.582)

	Surface
	{
		SurfStyle       0.455586
		OceanStyle      0.129038
		Randomize      (-0.888, -0.780, 0.306)
		colorDistMagn   0.32754
		colorDistFreq   5.02516e-007
		detailScale     0.707526
		colorConversion true
		snowLevel       2
		tropicLatitude  0.457331
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.272725
		terraceProb     0.22211
		erosion         0
		montesMagn      0.608362
		montesFreq      3.25191
		montesSpiky     0.983096
		montesFraction  0.578299
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.95208e-006
		hillsFraction   0.512745
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259554
		craterFreq      0.236265
		craterDensity   0.876817
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   2123.87
		volcanoTemp     1611.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.248, 0.233, 0.000)
		colorShelf     (0.288, 0.263, 0.247, 0.000)
		colorBeach     (0.305, 0.279, 0.262, 0.000)
		colorDesert    (0.322, 0.294, 0.276, 0.000)
		colorLowland   (0.339, 0.310, 0.291, 0.000)
		colorUpland    (0.356, 0.325, 0.305, 0.000)
		colorRock      (0.373, 0.341, 0.320, 0.000)
		colorSnow      (0.390, 0.356, 0.335, 1.000)
		BumpHeight      0.0233193
		BumpOffset      0.00466387
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0131065
		DustBright  0.68825
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.02349
		Period          10.1855
		Eccentricity    0.897922
		Inclination     -167.696
		AscendingNode   -176.376
		ArgOfPericenter 171.361
		MeanAnomaly     78.9285
	}
}

Comet	"C64"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.8296e-014
	Radius          0.430437
	InertiaMoment   0.399047

	Oblateness      0.249

	RotationPeriod  5.45309
	Obliquity       172.69
	EqAscendNode    168.839

	AbsMagn         3.982
	SlopeParam      4.39907
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.447 0.443 0.438)

	Surface
	{
		SurfStyle       0.248288
		OceanStyle      0.203064
		Randomize      (-0.641, -0.911, -0.221)
		colorDistMagn   0.882999
		colorDistFreq   9.50172e-005
		detailScale     11.7538
		colorConversion true
		snowLevel       2
		tropicLatitude  0.279074
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.564687
		terraceProb     0.35907
		erosion         0
		montesMagn      0.371377
		montesFreq      2.855
		montesSpiky     0.981944
		montesFraction  0.475383
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00049323
		hillsFraction   0.655056
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207891
		craterFreq      0.197122
		craterDensity   0.915057
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   401.193
		volcanoTemp     1570.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.177, 0.175, 0.000)
		colorShelf     (0.190, 0.188, 0.186, 0.000)
		colorBeach     (0.201, 0.199, 0.197, 0.000)
		colorDesert    (0.212, 0.210, 0.208, 0.000)
		colorLowland   (0.223, 0.222, 0.219, 0.000)
		colorUpland    (0.234, 0.233, 0.230, 0.000)
		colorRock      (0.246, 0.244, 0.241, 0.000)
		colorSnow      (0.257, 0.255, 0.252, 1.000)
		BumpHeight      0.387393
		BumpOffset      0.0774787
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.189651
		GasToDust   0.25
		Particles   1362
		GasBright   0.0299926
		DustBright  0.35585
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.35758
		Period          5.5973
		Eccentricity    0.887685
		Inclination     -166.11
		AscendingNode   -94.8804
		ArgOfPericenter -95.6261
		MeanAnomaly     -150.902
	}
}

Comet	"C65"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.18849e-010
	Radius          10.0554
	InertiaMoment   0.397532

	Oblateness      0.00214083

	RotationPeriod  143.309
	Obliquity       125.896
	EqAscendNode    153.417

	AbsMagn         5.78381
	SlopeParam      3.38998
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.613 0.553 0.440)

	Surface
	{
		SurfStyle       0.664154
		OceanStyle      0.634798
		Randomize      (0.938, 0.686, -0.725)
		colorDistMagn   0.482122
		colorDistFreq   0.0554472
		detailScale     274.579
		colorConversion true
		snowLevel       2
		tropicLatitude  0.467932
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.318792
		terraceProb     0.33384
		erosion         0
		montesMagn      0.461863
		montesFreq      3.22363
		montesSpiky     0.906612
		montesFraction  0.495013
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.214498
		hillsFraction   0.562237
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239433
		craterFreq      0.175817
		craterDensity   0.861419
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   106.569
		volcanoTemp     1753.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.188, 0.123, 0.000)
		colorShelf     (0.245, 0.194, 0.141, 0.000)
		colorBeach     (0.288, 0.227, 0.167, 0.000)
		colorDesert    (0.312, 0.243, 0.163, 0.000)
		colorLowland   (0.343, 0.260, 0.185, 0.000)
		colorUpland    (0.380, 0.315, 0.224, 0.000)
		colorRock      (0.410, 0.343, 0.242, 0.000)
		colorSnow      (0.447, 0.365, 0.255, 1.000)
		BumpHeight      9.04984
		BumpOffset      1.80997
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.670843
		GasToDust   0.25
		Particles   2335
		GasBright   0.119042
		DustBright  0.751287
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.64563
		Period          7.47019
		Eccentricity    0.956821
		Inclination     -46.3312
		AscendingNode   144.817
		ArgOfPericenter 101.362
		MeanAnomaly     -106.425
	}
}

Comet	"C66"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            6.73851e-018
	Radius          0.0266623
	InertiaMoment   0.399495

	Oblateness      0.00188989

	RotationPeriod  119.119
	Obliquity       79.1017
	EqAscendNode    137.994

	AbsMagn         7.21265
	SlopeParam      2.17901
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.644 0.640 0.639)

	Surface
	{
		SurfStyle       0.745551
		OceanStyle      0.945883
		Randomize      (0.593, 0.894, 0.940)
		colorDistMagn   0.84935
		colorDistFreq   2.96528e-007
		detailScale     0.728058
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993677
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.383316
		terraceProb     0.45287
		erosion         0
		montesMagn      0.570752
		montesFreq      3.74067
		montesSpiky     0.988503
		montesFraction  0.904602
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.73768e-006
		hillsFraction   0.574624
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250557
		craterFreq      0.213288
		craterDensity   0.912392
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1610.35
		volcanoTemp     1343.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.218, 0.179, 0.000)
		colorShelf     (0.257, 0.224, 0.204, 0.000)
		colorBeach     (0.303, 0.263, 0.243, 0.000)
		colorDesert    (0.328, 0.282, 0.236, 0.000)
		colorLowland   (0.360, 0.301, 0.268, 0.000)
		colorUpland    (0.399, 0.365, 0.326, 0.000)
		colorRock      (0.431, 0.397, 0.351, 0.000)
		colorSnow      (0.470, 0.423, 0.370, 1.000)
		BumpHeight      0.023996
		BumpOffset      0.00479921
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.108646
		DustBright  0.44617
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.7327
		Period          8.07078
		Eccentricity    0.901594
		Inclination     -15.0431
		AscendingNode   -106.014
		ArgOfPericenter 127.154
		MeanAnomaly     25.7102
	}
}

Comet	"C67"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            5.21176e-014
	Radius          0.619139
	InertiaMoment   0.398259

	Oblateness      0.00361355

	RotationPeriod  109.359
	Obliquity       32.3074
	EqAscendNode    122.572

	AbsMagn         8.54494
	SlopeParam      5.85932
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.587 0.583 0.580)

	Surface
	{
		SurfStyle       0.495441
		OceanStyle      0.705641
		Randomize      (-0.434, -0.931, -0.634)
		colorDistMagn   0.782873
		colorDistFreq   0.000131071
		detailScale     16.9066
		colorConversion true
		snowLevel       2
		tropicLatitude  0.413484
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423219
		terraceProb     0.156345
		erosion         0
		montesMagn      0.470023
		montesFreq      2.96944
		montesSpiky     0.920013
		montesFraction  0.304037
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00092773
		hillsFraction   0.599011
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213994
		craterFreq      0.256494
		craterDensity   0.851958
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   425.208
		volcanoTemp     1239.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.233, 0.232, 0.000)
		colorShelf     (0.250, 0.248, 0.246, 0.000)
		colorBeach     (0.264, 0.262, 0.261, 0.000)
		colorDesert    (0.279, 0.277, 0.275, 0.000)
		colorLowland   (0.294, 0.292, 0.290, 0.000)
		colorUpland    (0.308, 0.306, 0.304, 0.000)
		colorRock      (0.323, 0.321, 0.319, 0.000)
		colorSnow      (0.338, 0.335, 0.333, 1.000)
		BumpHeight      0.557225
		BumpOffset      0.111445
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.222477
		GasToDust   0.25
		Particles   1429
		GasBright   0.0609906
		DustBright  0.178312
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.92357
		Period          9.44047
		Eccentricity    0.972015
		Inclination     21.6157
		AscendingNode   129.32
		ArgOfPericenter 175.747
		MeanAnomaly     0.831321
	}
}

Comet	"C68"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            4.03092e-010
	Radius          10.4204
	InertiaMoment   0.399919

	Oblateness      0.00253965

	RotationPeriod  102.736
	Obliquity       345.513
	EqAscendNode    107.149

	AbsMagn         9.94253
	SlopeParam      4.63637
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.495 0.492 0.488)

	Surface
	{
		SurfStyle       0.729612
		OceanStyle      0.0578898
		Randomize      (-0.719, -0.080, 0.811)
		colorDistMagn   0.0371004
		colorDistFreq   0.0434846
		detailScale     284.547
		colorConversion true
		snowLevel       2
		tropicLatitude  0.26301
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.338736
		terraceProb     0.268825
		erosion         0
		montesMagn      0.512581
		montesFreq      3.02559
		montesSpiky     0.945966
		montesFraction  0.591497
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.285124
		hillsFraction   0.485074
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224996
		craterFreq      0.270776
		craterDensity   0.916659
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   81.3746
		volcanoTemp     1387.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.167, 0.137, 0.000)
		colorShelf     (0.198, 0.172, 0.156, 0.000)
		colorBeach     (0.232, 0.202, 0.186, 0.000)
		colorDesert    (0.252, 0.216, 0.181, 0.000)
		colorLowland   (0.277, 0.231, 0.205, 0.000)
		colorUpland    (0.307, 0.280, 0.249, 0.000)
		colorRock      (0.331, 0.305, 0.269, 0.000)
		colorSnow      (0.361, 0.324, 0.283, 1.000)
		BumpHeight      9.37838
		BumpOffset      1.87568
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.703669
		GasToDust   0.25
		Particles   2401
		GasBright   0.227207
		DustBright  0.496582
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.918184
		Period          3.11334
		Eccentricity    0.865062
		Inclination     -1.24476
		AscendingNode   -54.1418
		ArgOfPericenter -52.945
		MeanAnomaly     167.622
	}
}

Comet	"C69"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.24115e-017
	Radius          0.0381528
	InertiaMoment   0.398808

	Oblateness      0.00446935

	RotationPeriod  97.5736
	Obliquity       298.719
	EqAscendNode    91.7264

	AbsMagn         11.64
	SlopeParam      3.62651
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.560 0.552 0.548)

	Surface
	{
		SurfStyle       0.363707
		OceanStyle      0.598725
		Randomize      (-0.778, -0.011, 0.968)
		colorDistMagn   0.81326
		colorDistFreq   1.12697e-006
		detailScale     1.04183
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993156
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.68073
		terraceProb     0.35262
		erosion         0
		montesMagn      0.592248
		montesFreq      2.96872
		montesSpiky     0.959136
		montesFraction  0.345324
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.38884e-006
		hillsFraction   0.533155
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26939
		craterFreq      0.197404
		craterDensity   0.891459
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1697.93
		volcanoTemp     1422.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.221, 0.219, 0.000)
		colorShelf     (0.238, 0.235, 0.233, 0.000)
		colorBeach     (0.252, 0.248, 0.247, 0.000)
		colorDesert    (0.266, 0.262, 0.260, 0.000)
		colorLowland   (0.280, 0.276, 0.274, 0.000)
		colorUpland    (0.294, 0.290, 0.288, 0.000)
		colorRock      (0.308, 0.304, 0.301, 0.000)
		colorSnow      (0.322, 0.317, 0.315, 1.000)
		BumpHeight      0.0343375
		BumpOffset      0.0068675
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.15227
		DustBright  0.256005
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.64937
		Period          7.49567
		Eccentricity    0.934374
		Inclination     139.417
		AscendingNode   -32.3981
		ArgOfPericenter -46.3165
		MeanAnomaly     130.009
	}
}

Comet	"C70"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            9.59942e-014
	Radius          0.645467
	InertiaMoment   0.397008

	Oblateness      0.00304185

	RotationPeriod  93.2677
	Obliquity       251.925
	EqAscendNode    76.3038

	AbsMagn         14.6104
	SlopeParam      2.50268
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.726 0.722 0.719)

	Surface
	{
		SurfStyle       0.4856
		OceanStyle      0.229233
		Randomize      (0.794, 0.359, -0.530)
		colorDistMagn   0.682082
		colorDistFreq   0.000307761
		detailScale     17.6255
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999923
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545297
		terraceProb     0.611222
		erosion         0
		montesMagn      0.324191
		montesFreq      3.10089
		montesSpiky     0.967394
		montesFraction  0.777828
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00115022
		hillsFraction   0.585059
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214953
		craterFreq      0.229099
		craterDensity   1.02792
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   326.631
		volcanoTemp     1468.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.289, 0.288, 0.000)
		colorShelf     (0.308, 0.307, 0.306, 0.000)
		colorBeach     (0.327, 0.325, 0.324, 0.000)
		colorDesert    (0.345, 0.343, 0.341, 0.000)
		colorLowland   (0.363, 0.361, 0.359, 0.000)
		colorUpland    (0.381, 0.379, 0.377, 0.000)
		colorRock      (0.399, 0.397, 0.395, 0.000)
		colorSnow      (0.417, 0.415, 0.413, 1.000)
		BumpHeight      0.58092
		BumpOffset      0.116184
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.255303
		GasToDust   0.25
		Particles   1495
		GasBright   0.385677
		DustBright  0.507085
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.64534
		Period          7.46817
		Eccentricity    0.925259
		Inclination     -162.144
		AscendingNode   13.9544
		ArgOfPericenter -26.6251
		MeanAnomaly     82.6853
	}
}

Comet	"C71"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            7.42444e-010
	Radius          14.8434
	InertiaMoment   0.399278

	Oblateness      0.00523543

	RotationPeriod  89.5271
	Obliquity       205.13
	EqAscendNode    60.8812

	AbsMagn         2.65071
	SlopeParam      6.24785
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.635 0.536 0.385)

	Surface
	{
		SurfStyle       0.741078
		OceanStyle      0.294581
		Randomize      (-0.230, 0.423, -0.379)
		colorDistMagn   0.95568
		colorDistFreq   0.038849
		detailScale     405.325
		colorConversion true
		snowLevel       2
		tropicLatitude  0.330065
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.611245
		terraceProb     0.401574
		erosion         0
		montesMagn      0.381131
		montesFreq      2.30155
		montesSpiky     0.765137
		montesFraction  0.408285
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.409738
		hillsFraction   0.519317
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247001
		craterFreq      0.210857
		craterDensity   0.987094
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   85.41
		volcanoTemp     1514.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.182, 0.108, 0.000)
		colorShelf     (0.254, 0.188, 0.123, 0.000)
		colorBeach     (0.298, 0.220, 0.146, 0.000)
		colorDesert    (0.324, 0.236, 0.142, 0.000)
		colorLowland   (0.355, 0.252, 0.162, 0.000)
		colorUpland    (0.394, 0.305, 0.196, 0.000)
		colorRock      (0.425, 0.332, 0.212, 0.000)
		colorSnow      (0.463, 0.354, 0.223, 1.000)
		BumpHeight      13.3591
		BumpOffset      2.67182
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.736495
		GasToDust   0.25
		Particles   2467
		GasBright   0.283458
		DustBright  0.293791
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.90086
		Period          9.27381
		Eccentricity    0.9223
		Inclination     160.053
		AscendingNode   50.1031
		ArgOfPericenter 52.7416
		MeanAnomaly     -146.618
	}
}

Comet	"C72"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.28605e-017
	Radius          0.0399818
	InertiaMoment   0.397934

	Oblateness      0.00356731

	RotationPeriod  86.188
	Obliquity       158.336
	EqAscendNode    45.4586

	AbsMagn         4.94842
	SlopeParam      4.88302
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.442 0.433 0.430)

	Surface
	{
		SurfStyle       0.497945
		OceanStyle      0.89218
		Randomize      (-0.548, 0.921, 0.098)
		colorDistMagn   0.80402
		colorDistFreq   8.11181e-007
		detailScale     1.09177
		colorConversion true
		snowLevel       2
		tropicLatitude  0.789797
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.660354
		terraceProb     0.30943
		erosion         0
		montesMagn      0.39687
		montesFreq      2.2305
		montesSpiky     0.984938
		montesFraction  0.490455
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.71522e-006
		hillsFraction   0.799762
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233404
		craterFreq      0.162665
		craterDensity   0.958477
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1311.07
		volcanoTemp     1586.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.173, 0.172, 0.000)
		colorShelf     (0.188, 0.184, 0.183, 0.000)
		colorBeach     (0.199, 0.195, 0.194, 0.000)
		colorDesert    (0.210, 0.206, 0.204, 0.000)
		colorLowland   (0.221, 0.217, 0.215, 0.000)
		colorUpland    (0.232, 0.228, 0.226, 0.000)
		colorRock      (0.243, 0.238, 0.237, 0.000)
		colorSnow      (0.254, 0.249, 0.248, 1.000)
		BumpHeight      0.0359837
		BumpOffset      0.00719673
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0131116
		DustBright  0.248624
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.11581
		Period          10.8905
		Eccentricity    0.908135
		Inclination     112.077
		AscendingNode   -140.526
		ArgOfPericenter -162.087
		MeanAnomaly     135.035
	}
}

Comet	"C73"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.76809e-013
	Radius          0.915714
	InertiaMoment   0.399711

	Oblateness      0.00599361

	RotationPeriod  83.1489
	Obliquity       111.542
	EqAscendNode    30.036

	AbsMagn         6.51223
	SlopeParam      3.85791
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.648 0.596 0.536)

	Surface
	{
		SurfStyle       0.355297
		OceanStyle      0.293419
		Randomize      (-0.365, -0.045, -0.323)
		colorDistMagn   0.657099
		colorDistFreq   0.000576087
		detailScale     25.0051
		colorConversion true
		snowLevel       2
		tropicLatitude  0.464384
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.540143
		terraceProb     0.1838
		erosion         0
		montesMagn      0.401783
		montesFreq      2.59474
		montesSpiky     0.902222
		montesFraction  0.326449
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00200033
		hillsFraction   0.679942
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232509
		craterFreq      0.18992
		craterDensity   0.907641
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   341.439
		volcanoTemp     1361.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.238, 0.214, 0.000)
		colorShelf     (0.275, 0.253, 0.228, 0.000)
		colorBeach     (0.292, 0.268, 0.241, 0.000)
		colorDesert    (0.308, 0.283, 0.254, 0.000)
		colorLowland   (0.324, 0.298, 0.268, 0.000)
		colorUpland    (0.340, 0.313, 0.281, 0.000)
		colorRock      (0.356, 0.328, 0.295, 0.000)
		colorSnow      (0.373, 0.343, 0.308, 1.000)
		BumpHeight      0.824143
		BumpOffset      0.164829
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.288129
		GasToDust   0.25
		Particles   1561
		GasBright   0.0814426
		DustBright  0.664779
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.67447
		Period          7.66741
		Eccentricity    0.933709
		Inclination     -43.0808
		AscendingNode   166.379
		ArgOfPericenter 17.7201
		MeanAnomaly     40.9486
	}
}

Comet	"C74"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.36749e-009
	Radius          15.6261
	InertiaMoment   0.398551

	Oblateness      0.00410663

	RotationPeriod  80.3416
	Obliquity       64.7474
	EqAscendNode    14.6135

	AbsMagn         7.87136
	SlopeParam      2.79116
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.490 0.431 0.397)

	Surface
	{
		SurfStyle       0.853681
		OceanStyle      0.740478
		Randomize      (0.712, -0.300, -0.723)
		colorDistMagn   0.465709
		colorDistFreq   0.196626
		detailScale     426.698
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995125
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.694222
		terraceProb     0.145406
		erosion         0
		montesMagn      0.431018
		montesFreq      2.70773
		montesSpiky     0.86562
		montesFraction  0.640353
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.674991
		hillsFraction   0.817183
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252695
		craterFreq      0.190804
		craterDensity   0.976096
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   66.2514
		volcanoTemp     1584.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.151, 0.159, 0.050)
		colorShelf     (0.196, 0.177, 0.183, 0.040)
		colorBeach     (0.225, 0.203, 0.206, 0.030)
		colorDesert    (0.255, 0.228, 0.234, 0.020)
		colorLowland   (0.284, 0.254, 0.258, 0.030)
		colorUpland    (0.314, 0.280, 0.282, 0.050)
		colorRock      (0.343, 0.306, 0.314, 0.020)
		colorSnow      (0.343, 0.306, 0.314, 1.000)
		BumpHeight      14.0635
		BumpOffset      2.8127
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.769321
		GasToDust   0.25
		Particles   2533
		GasBright   0.0724388
		DustBright  0.35827
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.96005
		Period          9.71028
		Eccentricity    0.911106
		Inclination     110.439
		AscendingNode   106.987
		ArgOfPericenter 35.0484
		MeanAnomaly     -33.8985
	}
}

Comet	"C75"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            4.2106e-017
	Radius          0.0565148
	InertiaMoment   0.396117

	Oblateness      0.00668139

	RotationPeriod  77.7184
	Obliquity       17.9531
	EqAscendNode    359.191

	AbsMagn         9.21537
	SlopeParam      6.74734
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.440 0.437 0.432)

	Surface
	{
		SurfStyle       0.953531
		OceanStyle      0.6061
		Randomize      (0.564, -0.037, -0.836)
		colorDistMagn   0.496312
		colorDistFreq   2.90335e-007
		detailScale     1.54323
		colorConversion true
		snowLevel       2
		tropicLatitude  0.989478
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.262817
		terraceProb     0.446444
		erosion         0
		montesMagn      0.627453
		montesFreq      2.8758
		montesSpiky     0.894965
		montesFraction  0.529234
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.12813e-006
		hillsFraction   0.471921
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270427
		craterFreq      0.274993
		craterDensity   0.933841
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1365.51
		volcanoTemp     1244.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.149, 0.153, 0.173, 0.050)
		colorShelf     (0.176, 0.179, 0.199, 0.040)
		colorBeach     (0.202, 0.205, 0.225, 0.030)
		colorDesert    (0.229, 0.232, 0.255, 0.020)
		colorLowland   (0.255, 0.258, 0.281, 0.030)
		colorUpland    (0.281, 0.284, 0.307, 0.050)
		colorRock      (0.308, 0.310, 0.341, 0.020)
		colorSnow      (0.308, 0.310, 0.341, 1.000)
		BumpHeight      0.0508633
		BumpOffset      0.0101727
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.20796
		DustBright  0.707235
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.37445
		Period          5.70196
		Eccentricity    0.958408
		Inclination     77.0252
		AscendingNode   76.7377
		ArgOfPericenter -8.02541
		MeanAnomaly     107.702
	}
}

Comet	"C76"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.2566e-013
	Radius          0.967923
	InertiaMoment   0.399053

	Oblateness      0.00468128

	RotationPeriod  75.2442
	Obliquity       331.159
	EqAscendNode    343.768

	AbsMagn         10.7179
	SlopeParam      5.14394
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.729 0.726 0.724)

	Surface
	{
		SurfStyle       0.0694151
		OceanStyle      0.373481
		Randomize      (-0.135, -0.922, 0.650)
		colorDistMagn   0.668692
		colorDistFreq   0.000474352
		detailScale     26.4307
		colorConversion true
		snowLevel       2
		tropicLatitude  0.547404
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.42257
		terraceProb     0.311206
		erosion         0
		montesMagn      0.464802
		montesFreq      3.1992
		montesSpiky     0.859068
		montesFraction  0.381273
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00233472
		hillsFraction   0.728258
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258332
		craterFreq      0.171424
		craterDensity   0.911519
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   265.928
		volcanoTemp     1738.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.290, 0.289, 0.000)
		colorShelf     (0.310, 0.308, 0.308, 0.000)
		colorBeach     (0.328, 0.327, 0.326, 0.000)
		colorDesert    (0.346, 0.345, 0.344, 0.000)
		colorLowland   (0.365, 0.363, 0.362, 0.000)
		colorUpland    (0.383, 0.381, 0.380, 0.000)
		colorRock      (0.401, 0.399, 0.398, 0.000)
		colorSnow      (0.419, 0.417, 0.416, 1.000)
		BumpHeight      0.871131
		BumpOffset      0.174226
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.320955
		GasToDust   0.25
		Particles   1628
		GasBright   0.171674
		DustBright  0.428007
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.08754
		Period          10.6729
		Eccentricity    0.94844
		Inclination     175.618
		AscendingNode   -7.67337
		ArgOfPericenter 4.32066
		MeanAnomaly     -151.869
	}
}

Comet	"C77"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.51875e-009
	Radius          22.0146
	InertiaMoment   0.397543

	Oblateness      0.00754533

	RotationPeriod  72.8926
	Obliquity       284.364
	EqAscendNode    328.346

	AbsMagn         12.7765
	SlopeParam      4.08741
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.604 0.601 0.597)

	Surface
	{
		SurfStyle       0.183616
		OceanStyle      0.0453514
		Randomize      (-0.337, -0.315, 0.621)
		colorDistMagn   0.715437
		colorDistFreq   0.261963
		detailScale     601.146
		colorConversion true
		snowLevel       2
		tropicLatitude  0.274657
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.334663
		terraceProb     0.536789
		erosion         0
		montesMagn      0.392745
		montesFreq      2.56845
		montesSpiky     0.992488
		montesFraction  0.373027
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.01973
		hillsFraction   0.615408
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212392
		craterFreq      0.238768
		craterDensity   0.944055
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   68.7742
		volcanoTemp     1648
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.240, 0.239, 0.000)
		colorShelf     (0.256, 0.255, 0.254, 0.000)
		colorBeach     (0.272, 0.270, 0.269, 0.000)
		colorDesert    (0.287, 0.285, 0.284, 0.000)
		colorLowland   (0.302, 0.300, 0.298, 0.000)
		colorUpland    (0.317, 0.315, 0.313, 0.000)
		colorRock      (0.332, 0.330, 0.328, 0.000)
		colorSnow      (0.347, 0.346, 0.343, 1.000)
		BumpHeight      19.8132
		BumpOffset      3.96264
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.802147
		GasToDust   0.25
		Particles   2600
		GasBright   0.0981292
		DustBright  0.186039
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.3667
		Period          12.8839
		Eccentricity    0.927161
		Inclination     -103.3
		AscendingNode   16.3846
		ArgOfPericenter 71.2463
		MeanAnomaly     53.3921
	}
}

Comet	"C78"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            7.75541e-017
	Radius          0.0599557
	InertiaMoment   0.3995

	Oblateness      0.00530927

	RotationPeriod  70.6427
	Obliquity       237.57
	EqAscendNode    312.923

	AbsMagn         0.0583105
	SlopeParam      3.05639
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.455 0.450 0.444)

	Surface
	{
		SurfStyle       0.82645
		OceanStyle      0.551014
		Randomize      (-0.597, -0.644, 0.340)
		colorDistMagn   0.209605
		colorDistFreq   1.52804e-006
		detailScale     1.63719
		colorConversion true
		snowLevel       2
		tropicLatitude  0.876601
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.460746
		terraceProb     0.264788
		erosion         0
		montesMagn      0.589523
		montesFreq      3.10867
		montesSpiky     0.89681
		montesFraction  0.749874
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.01154e-005
		hillsFraction   0.843202
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232207
		craterFreq      0.186064
		craterDensity   0.77056
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1067.42
		volcanoTemp     1322.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.153, 0.124, 0.000)
		colorShelf     (0.182, 0.158, 0.142, 0.000)
		colorBeach     (0.214, 0.185, 0.169, 0.000)
		colorDesert    (0.232, 0.198, 0.164, 0.000)
		colorLowland   (0.255, 0.212, 0.186, 0.000)
		colorUpland    (0.282, 0.257, 0.226, 0.000)
		colorRock      (0.305, 0.279, 0.244, 0.000)
		colorSnow      (0.332, 0.297, 0.258, 1.000)
		BumpHeight      0.0539601
		BumpOffset      0.010792
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.310818
		DustBright  0.457837
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.36931
		Period          5.67002
		Eccentricity    0.881018
		Inclination     140.896
		AscendingNode   82.9789
		ArgOfPericenter 15.5049
		MeanAnomaly     -9.80472
	}
}

Comet	"C79"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            5.99824e-013
	Radius          1.35952
	InertiaMoment   0.398267

	Oblateness      0.00847825

	RotationPeriod  68.4779
	Obliquity       190.776
	EqAscendNode    297.5

	AbsMagn         3.95173
	SlopeParam      7.52432
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.588 0.582 0.579)

	Surface
	{
		SurfStyle       0.629499
		OceanStyle      0.732389
		Randomize      (-0.411, 0.087, -0.139)
		colorDistMagn   0.991262
		colorDistFreq   0.00106161
		detailScale     37.124
		colorConversion true
		snowLevel       2
		tropicLatitude  0.808949
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.330047
		terraceProb     0.223661
		erosion         0
		montesMagn      0.565247
		montesFreq      3.03992
		montesSpiky     0.989822
		montesFraction  0.413351
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00455606
		hillsFraction   0.811272
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232697
		craterFreq      0.242582
		craterDensity   0.958098
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   275.22
		volcanoTemp     1687.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.198, 0.162, 0.000)
		colorShelf     (0.235, 0.204, 0.185, 0.000)
		colorBeach     (0.276, 0.239, 0.220, 0.000)
		colorDesert    (0.300, 0.256, 0.214, 0.000)
		colorLowland   (0.329, 0.273, 0.243, 0.000)
		colorUpland    (0.365, 0.332, 0.295, 0.000)
		colorRock      (0.394, 0.361, 0.319, 0.000)
		colorSnow      (0.429, 0.384, 0.336, 1.000)
		BumpHeight      1.22357
		BumpOffset      0.244714
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.35378
		GasToDust   0.25
		Particles   1694
		GasBright   0.209991
		DustBright  0.24315
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.01596
		Period          10.1287
		Eccentricity    0.894159
		Inclination     119.794
		AscendingNode   52.059
		ArgOfPericenter -140.011
		MeanAnomaly     94.7945
	}
}

Comet	"C80"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            4.63921e-009
	Radius          23.4326
	InertiaMoment   0.399924

	Oblateness      0.00600967

	RotationPeriod  66.3849
	Obliquity       143.982
	EqAscendNode    282.078

	AbsMagn         5.76255
	SlopeParam      5.42602
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.593 0.589 0.586)

	Surface
	{
		SurfStyle       0.814387
		OceanStyle      0.350589
		Randomize      (-0.243, 0.359, 0.531)
		colorDistMagn   0.904274
		colorDistFreq   0.203749
		detailScale     639.865
		colorConversion true
		snowLevel       2
		tropicLatitude  0.748227
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562499
		terraceProb     0.212084
		erosion         0
		montesMagn      0.461959
		montesFreq      3.59826
		montesSpiky     0.880706
		montesFraction  0.707886
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3148
		hillsFraction   0.726663
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240066
		craterFreq      0.27562
		craterDensity   0.733378
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   53.9391
		volcanoTemp     1778.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.200, 0.164, 0.000)
		colorShelf     (0.237, 0.206, 0.187, 0.000)
		colorBeach     (0.279, 0.242, 0.223, 0.000)
		colorDesert    (0.302, 0.259, 0.217, 0.000)
		colorLowland   (0.332, 0.277, 0.246, 0.000)
		colorUpland    (0.368, 0.336, 0.299, 0.000)
		colorRock      (0.397, 0.365, 0.322, 0.000)
		colorSnow      (0.433, 0.389, 0.340, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.834972
		GasToDust   0.25
		Particles   2666
		GasBright   0.0210561
		DustBright  0.916572
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.59564
		Period          7.13236
		Eccentricity    0.898941
		Inclination     -50.3818
		AscendingNode   -109.027
		ArgOfPericenter 16.1916
		MeanAnomaly     -43.2871
	}
}

Comet	"C81"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.42845e-016
	Radius          0.0839783
	InertiaMoment   0.398814

	Oblateness      0.00952085

	RotationPeriod  64.3522
	Obliquity       97.1873
	EqAscendNode    266.655

	AbsMagn         7.19408
	SlopeParam      4.31808
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.701 0.633 0.580)

	Surface
	{
		SurfStyle       0.624528
		OceanStyle      0.863995
		Randomize      (-0.356, -0.453, -0.099)
		colorDistMagn   0.330175
		colorDistFreq   4.26129e-006
		detailScale     2.29317
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999986
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.561935
		terraceProb     0.446866
		erosion         0
		montesMagn      0.356335
		montesFreq      2.79415
		montesSpiky     0.964308
		montesFraction  0.639932
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.5359e-005
		hillsFraction   0.695864
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233944
		craterFreq      0.186584
		craterDensity   1.0013
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1101.64
		volcanoTemp     1720.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.215, 0.162, 0.000)
		colorShelf     (0.280, 0.221, 0.185, 0.000)
		colorBeach     (0.329, 0.259, 0.220, 0.000)
		colorDesert    (0.357, 0.278, 0.214, 0.000)
		colorLowland   (0.392, 0.297, 0.243, 0.000)
		colorUpland    (0.434, 0.361, 0.296, 0.000)
		colorRock      (0.469, 0.392, 0.319, 0.000)
		colorSnow      (0.512, 0.418, 0.336, 1.000)
		BumpHeight      0.0755804
		BumpOffset      0.0151161
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0507036
		DustBright  0.571411
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.25602
		Period          11.9908
		Eccentricity    0.971725
		Inclination     -101.617
		AscendingNode   91.1773
		ArgOfPericenter 30.2002
		MeanAnomaly     50.4731
	}
}

Comet	"C82"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.1048e-012
	Radius          1.45148
	InertiaMoment   0.397024

	Oblateness      0.00672106

	RotationPeriod  62.3704
	Obliquity       50.393
	EqAscendNode    251.233

	AbsMagn         8.52657
	SlopeParam      3.30593
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.790 0.786 0.784)

	Surface
	{
		SurfStyle       0.169644
		OceanStyle      0.738344
		Randomize      (0.291, -0.708, 0.400)
		colorDistMagn   0.510532
		colorDistFreq   0.00149693
		detailScale     39.635
		colorConversion true
		snowLevel       2
		tropicLatitude  0.981354
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566448
		terraceProb     0.103661
		erosion         0
		montesMagn      0.430504
		montesFreq      2.983
		montesSpiky     0.889335
		montesFraction  0.270437
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0045191
		hillsFraction   0.539532
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255184
		craterFreq      0.247959
		craterDensity   0.917182
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   216.508
		volcanoTemp     1495.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.314, 0.314, 0.000)
		colorShelf     (0.336, 0.334, 0.333, 0.000)
		colorBeach     (0.355, 0.354, 0.353, 0.000)
		colorDesert    (0.375, 0.373, 0.372, 0.000)
		colorLowland   (0.395, 0.393, 0.392, 0.000)
		colorUpland    (0.415, 0.413, 0.411, 0.000)
		colorRock      (0.434, 0.432, 0.431, 0.000)
		colorSnow      (0.454, 0.452, 0.451, 1.000)
		BumpHeight      1.30633
		BumpOffset      0.261266
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.386606
		GasToDust   0.25
		Particles   1760
		GasBright   0.0430919
		DustBright  0.263509
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.01289
		Period          10.1056
		Eccentricity    0.946101
		Inclination     -62.8575
		AscendingNode   98.2715
		ArgOfPericenter 121.864
		MeanAnomaly     -1.53903
	}
}

Comet	"C83"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            8.54486e-009
	Radius          32.7372
	InertiaMoment   0.399284

	Oblateness      0.0107109

	RotationPeriod  60.4313
	Obliquity       3.59868
	EqAscendNode    235.81

	AbsMagn         9.92207
	SlopeParam      2.05487
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.771 0.716 0.612)

	Surface
	{
		SurfStyle       0.717219
		OceanStyle      0.547789
		Randomize      (-0.614, -0.304, 0.156)
		colorDistMagn   0.813896
		colorDistFreq   0.640704
		detailScale     893.944
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999138
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.642331
		terraceProb     0.151917
		erosion         0
		montesMagn      0.509888
		montesFreq      3.07263
		montesSpiky     0.891062
		montesFraction  0.443926
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.88027
		hillsFraction   0.773248
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25115
		craterFreq      0.232265
		craterDensity   1.01214
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   55.5258
		volcanoTemp     1444.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.244, 0.171, 0.000)
		colorShelf     (0.308, 0.251, 0.196, 0.000)
		colorBeach     (0.362, 0.294, 0.233, 0.000)
		colorDesert    (0.393, 0.315, 0.227, 0.000)
		colorLowland   (0.432, 0.337, 0.257, 0.000)
		colorUpland    (0.478, 0.408, 0.312, 0.000)
		colorRock      (0.516, 0.444, 0.337, 0.000)
		colorSnow      (0.563, 0.473, 0.355, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.867798
		GasToDust   0.25
		Particles   2732
		GasBright   0.157895
		DustBright  0.633192
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.69317
		Period          15.6397
		Eccentricity    0.931592
		Inclination     95.9714
		AscendingNode   -176.528
		ArgOfPericenter 122.744
		MeanAnomaly     -81.9527
	}
}

Comet	"C84"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.63102e-016
	Radius          0.0899083
	InertiaMoment   0.397943

	Oblateness      0.00764366

	RotationPeriod  58.5275
	Obliquity       316.804
	EqAscendNode    220.388

	AbsMagn         11.6126
	SlopeParam      5.73986
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.498 0.495 0.491)

	Surface
	{
		SurfStyle       0.164309
		OceanStyle      0.761322
		Randomize      (-0.700, 0.350, 0.105)
		colorDistMagn   0.896913
		colorDistFreq   5.71465e-006
		detailScale     2.4551
		colorConversion true
		snowLevel       2
		tropicLatitude  0.478825
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.591307
		terraceProb     0.309162
		erosion         0
		montesMagn      0.470184
		montesFreq      2.86659
		montesSpiky     0.920472
		montesFraction  0.736119
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.53971e-005
		hillsFraction   0.858362
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.192072
		craterFreq      0.165286
		craterDensity   0.805513
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   869.048
		volcanoTemp     1405.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.198, 0.197, 0.000)
		colorShelf     (0.212, 0.211, 0.209, 0.000)
		colorBeach     (0.224, 0.223, 0.221, 0.000)
		colorDesert    (0.237, 0.235, 0.233, 0.000)
		colorLowland   (0.249, 0.248, 0.246, 0.000)
		colorUpland    (0.262, 0.260, 0.258, 0.000)
		colorRock      (0.274, 0.272, 0.270, 0.000)
		colorSnow      (0.286, 0.285, 0.283, 1.000)
		BumpHeight      0.0809175
		BumpOffset      0.0161835
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.123001
		DustBright  0.352573
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.94072
		Period          9.56699
		Eccentricity    0.947505
		Inclination     55.2947
		AscendingNode   34.6632
		ArgOfPericenter -131.523
		MeanAnomaly     -23.9078
	}
}

Comet	"C85"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.03491e-012
	Radius          2.023
	InertiaMoment   0.399717

	Oblateness      0.0120959

	RotationPeriod  56.6528
	Obliquity       270.01
	EqAscendNode    204.965

	AbsMagn         14.5401
	SlopeParam      4.55307
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.541 0.537 0.535)

	Surface
	{
		SurfStyle       0.641679
		OceanStyle      0.721429
		Randomize      (-0.135, 0.366, 0.149)
		colorDistMagn   0.614091
		colorDistFreq   0.00193198
		detailScale     55.2415
		colorConversion true
		snowLevel       2
		tropicLatitude  0.577321
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606189
		terraceProb     0.67113
		erosion         0
		montesMagn      0.68272
		montesFreq      2.6118
		montesSpiky     0.95261
		montesFraction  0.514884
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.011028
		hillsFraction   0.679434
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221056
		craterFreq      0.190162
		craterDensity   0.747736
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   222.346
		volcanoTemp     1399.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.183, 0.150, 0.000)
		colorShelf     (0.216, 0.188, 0.171, 0.000)
		colorBeach     (0.254, 0.220, 0.203, 0.000)
		colorDesert    (0.276, 0.236, 0.198, 0.000)
		colorLowland   (0.303, 0.253, 0.225, 0.000)
		colorUpland    (0.335, 0.306, 0.273, 0.000)
		colorRock      (0.363, 0.333, 0.294, 0.000)
		colorSnow      (0.395, 0.355, 0.310, 1.000)
		BumpHeight      1.8207
		BumpOffset      0.364141
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.419432
		GasToDust   0.25
		Particles   1827
		GasBright   0.304995
		DustBright  0.655066
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.9131
		Period          9.36348
		Eccentricity    0.952791
		Inclination     93.1948
		AscendingNode   35.135
		ArgOfPericenter 151.184
		MeanAnomaly     -156.043
	}
}

Comet	"C86"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.57385e-008
	Radius          35.139
	InertiaMoment   0.398558

	Oblateness      0.00872109

	RotationPeriod  54.8013
	Obliquity       223.216
	EqAscendNode    189.542

	AbsMagn         2.60586
	SlopeParam      3.54508
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.684 0.678 0.676)

	Surface
	{
		SurfStyle       0.664949
		OceanStyle      0.304109
		Randomize      (0.422, -0.482, 0.086)
		colorDistMagn   0.314448
		colorDistFreq   0.0535067
		detailScale     959.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.561192
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595446
		terraceProb     0.343802
		erosion         0
		montesMagn      0.379244
		montesFreq      2.16484
		montesSpiky     0.87567
		montesFraction  0.61738
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.44529
		hillsFraction   0.551166
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236996
		craterFreq      0.160338
		craterDensity   0.927978
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   43.9151
		volcanoTemp     1425.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.231, 0.189, 0.000)
		colorShelf     (0.273, 0.237, 0.216, 0.000)
		colorBeach     (0.321, 0.278, 0.257, 0.000)
		colorDesert    (0.349, 0.298, 0.250, 0.000)
		colorLowland   (0.383, 0.319, 0.284, 0.000)
		colorUpland    (0.424, 0.386, 0.345, 0.000)
		colorRock      (0.458, 0.420, 0.372, 0.000)
		colorSnow      (0.499, 0.447, 0.392, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.900624
		GasToDust   0.25
		Particles   2799
		GasBright   0.242819
		DustBright  0.401728
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.74481
		Period          8.1556
		Eccentricity    0.902456
		Inclination     -160.679
		AscendingNode   128.151
		ArgOfPericenter -172.465
		MeanAnomaly     -163.849
	}
}

Comet	"C87"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            4.84602e-016
	Radius          0.125033
	InertiaMoment   0.396151

	Oblateness      0.0135361

	RotationPeriod  52.9676
	Obliquity       176.421
	EqAscendNode    174.12

	AbsMagn         4.92401
	SlopeParam      2.39502
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.797 0.793 0.791)

	Surface
	{
		SurfStyle       0.911456
		OceanStyle      0.137326
		Randomize      (0.402, -0.333, 0.047)
		colorDistMagn   0.0438311
		colorDistFreq   1.00534e-005
		detailScale     3.41422
		colorConversion true
		snowLevel       2
		tropicLatitude  0.296765
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.458051
		terraceProb     0.117571
		erosion         0
		montesMagn      0.443587
		montesFreq      2.88978
		montesSpiky     0.961454
		montesFraction  0.636699
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.62045e-005
		hillsFraction   0.752298
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247074
		craterFreq      0.204311
		craterDensity   0.72354
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   890.506
		volcanoTemp     1392.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.278, 0.317, 0.050)
		colorShelf     (0.319, 0.325, 0.364, 0.040)
		colorBeach     (0.366, 0.373, 0.412, 0.030)
		colorDesert    (0.414, 0.420, 0.467, 0.020)
		colorLowland   (0.462, 0.468, 0.514, 0.030)
		colorUpland    (0.510, 0.516, 0.562, 0.050)
		colorRock      (0.558, 0.563, 0.625, 0.020)
		colorSnow      (0.558, 0.563, 0.625, 1.000)
		BumpHeight      0.112529
		BumpOffset      0.0225059
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.143384
		DustBright  0.18565
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.80569
		Period          8.5861
		Eccentricity    0.961658
		Inclination     16.0228
		AscendingNode   -104.546
		ArgOfPericenter -111.89
		MeanAnomaly     -154.27
	}
}

Comet	"C88"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.74805e-012
	Radius          2.17661
	InertiaMoment   0.399058

	Oblateness      0.0100106

	RotationPeriod  51.1468
	Obliquity       129.627
	EqAscendNode    158.697

	AbsMagn         6.4927
	SlopeParam      6.10384
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.510 0.506 0.504)

	Surface
	{
		SurfStyle       0.753134
		OceanStyle      0.189713
		Randomize      (0.556, 0.378, -0.492)
		colorDistMagn   0.346444
		colorDistFreq   0.00398701
		detailScale     59.4359
		colorConversion true
		snowLevel       2
		tropicLatitude  0.595781
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.434514
		terraceProb     0.585782
		erosion         0
		montesMagn      0.39136
		montesFreq      3.09117
		montesSpiky     0.971496
		montesFraction  0.643776
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0114121
		hillsFraction   0.745923
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.296418
		craterFreq      0.194423
		craterDensity   0.90317
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   176.272
		volcanoTemp     1334.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.172, 0.141, 0.000)
		colorShelf     (0.204, 0.177, 0.161, 0.000)
		colorBeach     (0.240, 0.208, 0.192, 0.000)
		colorDesert    (0.260, 0.223, 0.186, 0.000)
		colorLowland   (0.286, 0.238, 0.212, 0.000)
		colorUpland    (0.316, 0.289, 0.257, 0.000)
		colorRock      (0.342, 0.314, 0.277, 0.000)
		colorSnow      (0.372, 0.334, 0.292, 1.000)
		BumpHeight      1.95895
		BumpOffset      0.391789
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.452258
		GasToDust   0.25
		Particles   1893
		GasBright   0.402545
		DustBright  0.410975
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.4132
		Period          5.94477
		Eccentricity    0.863028
		Inclination     -162.66
		AscendingNode   -32.1557
		ArgOfPericenter -176.332
		MeanAnomaly     -160.413
	}
}

Comet	"C89"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.89884e-008
	Radius          48.7656
	InertiaMoment   0.397554

	Oblateness      0.0155574

	RotationPeriod  49.3339
	Obliquity       82.8329
	EqAscendNode    143.275

	AbsMagn         7.85314
	SlopeParam      4.79599
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.540 0.469 0.375)

	Surface
	{
		SurfStyle       0.773759
		OceanStyle      0.930568
		Randomize      (0.450, -0.101, -0.138)
		colorDistMagn   0.687486
		colorDistFreq   1.12325
		detailScale     1331.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.892111
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.703284
		terraceProb     0.272831
		erosion         0
		montesMagn      0.40889
		montesFreq      2.57407
		montesSpiky     0.867408
		montesFraction  0.5171
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.5749
		hillsFraction   0.725717
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243709
		craterFreq      0.200775
		craterDensity   0.812592
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   44.9063
		volcanoTemp     1744.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.160, 0.105, 0.000)
		colorShelf     (0.216, 0.164, 0.120, 0.000)
		colorBeach     (0.254, 0.192, 0.143, 0.000)
		colorDesert    (0.276, 0.206, 0.139, 0.000)
		colorLowland   (0.303, 0.221, 0.158, 0.000)
		colorUpland    (0.335, 0.267, 0.191, 0.000)
		colorRock      (0.362, 0.291, 0.206, 0.000)
		colorSnow      (0.395, 0.310, 0.218, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.93345
		GasToDust   0.25
		Particles   2865
		GasBright   0.0268247
		DustBright  0.471182
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.04648
		Period          10.3596
		Eccentricity    0.908427
		Inclination     106.463
		AscendingNode   -64.044
		ArgOfPericenter 153.964
		MeanAnomaly     6.74317
	}
}

Comet	"C90"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            8.92573e-016
	Radius          0.134825
	InertiaMoment   0.399506

	Oblateness      0.0115911

	RotationPeriod  47.5244
	Obliquity       36.0386
	EqAscendNode    127.852

	AbsMagn         9.19632
	SlopeParam      3.77788
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.790 0.786 0.783)

	Surface
	{
		SurfStyle       0.591751
		OceanStyle      0.905593
		Randomize      (0.065, 0.094, 0.485)
		colorDistMagn   0.563861
		colorDistFreq   1.16666e-005
		detailScale     3.68162
		colorConversion true
		snowLevel       2
		tropicLatitude  0.583195
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.521749
		terraceProb     0.188
		erosion         0
		montesMagn      0.39819
		montesFreq      3.16431
		montesSpiky     0.880825
		montesFraction  0.42614
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.66617e-005
		hillsFraction   0.692264
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217878
		craterFreq      0.176701
		craterDensity   0.831564
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   707.545
		volcanoTemp     1520.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.267, 0.219, 0.000)
		colorShelf     (0.316, 0.275, 0.251, 0.000)
		colorBeach     (0.371, 0.322, 0.298, 0.000)
		colorDesert    (0.403, 0.346, 0.290, 0.000)
		colorLowland   (0.442, 0.370, 0.329, 0.000)
		colorUpland    (0.490, 0.448, 0.400, 0.000)
		colorRock      (0.529, 0.487, 0.431, 0.000)
		colorSnow      (0.577, 0.519, 0.454, 1.000)
		BumpHeight      0.121342
		BumpOffset      0.0242685
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.110933
		DustBright  0.871561
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.51216
		Period          6.58001
		Eccentricity    0.894428
		Inclination     -177.701
		AscendingNode   -100.651
		ArgOfPericenter -125.285
		MeanAnomaly     -177.226
	}
}

Comet	"C91"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            6.90342e-012
	Radius          3.01482
	InertiaMoment   0.398275

	Oblateness      0.0180265

	RotationPeriod  45.7138
	Obliquity       349.244
	EqAscendNode    112.429

	AbsMagn         10.695
	SlopeParam      2.69405
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.684 0.680 0.676)

	Surface
	{
		SurfStyle       0.793206
		OceanStyle      0.706681
		Randomize      (-0.701, 0.334, 0.879)
		colorDistMagn   0.109797
		colorDistFreq   0.00299906
		detailScale     82.3246
		colorConversion true
		snowLevel       2
		tropicLatitude  0.919989
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.398035
		terraceProb     0.277311
		erosion         0
		montesMagn      0.502714
		montesFreq      3.40704
		montesSpiky     0.893453
		montesFraction  0.648169
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0124521
		hillsFraction   0.707927
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256244
		craterFreq      0.239986
		craterDensity   0.828034
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   179.902
		volcanoTemp     1681.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.231, 0.189, 0.000)
		colorShelf     (0.274, 0.238, 0.216, 0.000)
		colorBeach     (0.322, 0.279, 0.257, 0.000)
		colorDesert    (0.349, 0.299, 0.250, 0.000)
		colorLowland   (0.383, 0.319, 0.284, 0.000)
		colorUpland    (0.424, 0.387, 0.345, 0.000)
		colorRock      (0.459, 0.421, 0.372, 0.000)
		colorSnow      (0.500, 0.449, 0.392, 1.000)
		BumpHeight      2.71333
		BumpOffset      0.542667
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.485084
		GasToDust   0.25
		Particles   1959
		GasBright   0.11469
		DustBright  0.55229
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.94908
		Period          9.62888
		Eccentricity    0.908031
		Inclination     115.764
		AscendingNode   -77.9512
		ArgOfPericenter -11.6278
		MeanAnomaly     63.4941
	}
}

Comet	"C92"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            5.3393e-008
	Radius          52.6939
	InertiaMoment   0.399929

	Oblateness      0.0135801

	RotationPeriod  43.8973
	Obliquity       302.45
	EqAscendNode    97.0068

	AbsMagn         12.7396
	SlopeParam      6.55551
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.735 0.731 0.730)

	Surface
	{
		SurfStyle       0.446432
		OceanStyle      0.463237
		Randomize      (-0.018, 0.756, -0.134)
		colorDistMagn   0.20651
		colorDistFreq   1.53725
		detailScale     1438.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.669807
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.548932
		terraceProb     0.351753
		erosion         0
		montesMagn      0.573168
		montesFreq      3.40011
		montesSpiky     0.89392
		montesFraction  0.61405
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.46603
		hillsFraction   0.824648
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265605
		craterFreq      0.176599
		craterDensity   0.788274
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.754
		volcanoTemp     1597.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.292, 0.292, 0.000)
		colorShelf     (0.312, 0.311, 0.310, 0.000)
		colorBeach     (0.331, 0.329, 0.328, 0.000)
		colorDesert    (0.349, 0.347, 0.347, 0.000)
		colorLowland   (0.367, 0.365, 0.365, 0.000)
		colorUpland    (0.386, 0.384, 0.383, 0.000)
		colorRock      (0.404, 0.402, 0.401, 0.000)
		colorSnow      (0.423, 0.420, 0.420, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.966276
		GasToDust   0.25
		Particles   2931
		GasBright   0.0811887
		DustBright  0.270278
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.2374
		Period          11.8426
		Eccentricity    0.919581
		Inclination     -93.5759
		AscendingNode   32.6579
		ArgOfPericenter -105.705
		MeanAnomaly     11.0233
	}
}

Comet	"C93"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.64401e-015
	Radius          0.186406
	InertiaMoment   0.39882

	Oblateness      0.0211689

	RotationPeriod  42.0703
	Obliquity       255.656
	EqAscendNode    81.5842

	AbsMagn         -0.0768042
	SlopeParam      5.0513
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.462 0.456 0.452)

	Surface
	{
		SurfStyle       0.843062
		OceanStyle      0.200162
		Randomize      (0.691, -0.877, -0.677)
		colorDistMagn   0.146521
		colorDistFreq   2.39518e-005
		detailScale     5.09012
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987157
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489829
		terraceProb     0.180669
		erosion         0
		montesMagn      0.371923
		montesFreq      3.17497
		montesSpiky     0.96755
		montesFraction  0.530241
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.81147e-005
		hillsFraction   0.772823
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226363
		craterFreq      0.218176
		craterDensity   0.935751
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   720.797
		volcanoTemp     1376
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.155, 0.127, 0.000)
		colorShelf     (0.185, 0.160, 0.145, 0.000)
		colorBeach     (0.217, 0.187, 0.172, 0.000)
		colorDesert    (0.236, 0.201, 0.167, 0.000)
		colorLowland   (0.259, 0.214, 0.190, 0.000)
		colorUpland    (0.286, 0.260, 0.231, 0.000)
		colorRock      (0.310, 0.283, 0.249, 0.000)
		colorSnow      (0.337, 0.301, 0.262, 1.000)
		BumpHeight      0.167765
		BumpOffset      0.0335531
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0367181
		GasToDust   0.25
		Particles   1053
		GasBright   0.242464
		DustBright  0.593489
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.10017
		Period          10.7699
		Eccentricity    0.95928
		Inclination     160.117
		AscendingNode   -102.841
		ArgOfPericenter 143.97
		MeanAnomaly     -174.638
	}
}

Comet	"C94"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.27152e-011
	Radius          3.264
	InertiaMoment   0.39704

	Oblateness      0.0159642

	RotationPeriod  40.2279
	Obliquity       208.861
	EqAscendNode    66.1617

	AbsMagn         3.92124
	SlopeParam      4.0077
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.791 0.788 0.787)

	Surface
	{
		SurfStyle       0.541893
		OceanStyle      0.416331
		Randomize      (0.193, 0.543, -0.101)
		colorDistMagn   0.414196
		colorDistFreq   0.00469178
		detailScale     89.129
		colorConversion true
		snowLevel       2
		tropicLatitude  0.857143
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498292
		terraceProb     0.349883
		erosion         0
		montesMagn      0.646364
		montesFreq      3.20454
		montesSpiky     0.919894
		montesFraction  0.338812
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0262378
		hillsFraction   0.4985
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218439
		craterFreq      0.240541
		craterDensity   0.849466
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   143.514
		volcanoTemp     1501.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.268, 0.220, 0.000)
		colorShelf     (0.316, 0.276, 0.252, 0.000)
		colorBeach     (0.372, 0.323, 0.299, 0.000)
		colorDesert    (0.403, 0.347, 0.291, 0.000)
		colorLowland   (0.443, 0.370, 0.330, 0.000)
		colorUpland    (0.490, 0.449, 0.401, 0.000)
		colorRock      (0.530, 0.489, 0.433, 0.000)
		colorSnow      (0.577, 0.520, 0.456, 1.000)
		BumpHeight      2.9376
		BumpOffset      0.58752
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.51791
		GasToDust   0.25
		Particles   2026
		GasBright   0.181681
		DustBright  0.338759
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.32216
		Period          12.5219
		Eccentricity    0.955553
		Inclination     -121.826
		AscendingNode   -97.4579
		ArgOfPericenter -43.1085
		MeanAnomaly     144.599
	}
}

Comet	"C95"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            9.83431e-008
	Radius          72.7285
	InertiaMoment   0.399289

	Oblateness      0.0253187

	RotationPeriod  38.3649
	Obliquity       162.067
	EqAscendNode    50.7391

	AbsMagn         5.74123
	SlopeParam      2.96633
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.571 0.568 0.566)

	Surface
	{
		SurfStyle       0.329763
		OceanStyle      0.676731
		Randomize      (-0.522, 0.714, -0.878)
		colorDistMagn   0.576643
		colorDistFreq   1.93112
		detailScale     1985.97
		colorConversion true
		snowLevel       2
		tropicLatitude  0.49843
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481781
		terraceProb     0.383939
		erosion         0
		montesMagn      0.365935
		montesFreq      2.44201
		montesSpiky     0.887882
		montesFraction  0.620152
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.2102
		hillsFraction   0.765932
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260281
		craterFreq      0.248817
		craterDensity   0.856092
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   36.3612
		volcanoTemp     1364.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.227, 0.226, 0.000)
		colorShelf     (0.243, 0.241, 0.241, 0.000)
		colorBeach     (0.257, 0.256, 0.255, 0.000)
		colorDesert    (0.271, 0.270, 0.269, 0.000)
		colorLowland   (0.286, 0.284, 0.283, 0.000)
		colorUpland    (0.300, 0.298, 0.297, 0.000)
		colorRock      (0.314, 0.312, 0.311, 0.000)
		colorSnow      (0.328, 0.327, 0.326, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.999102
		GasToDust   0.25
		Particles   2998
		GasBright   0.0836378
		DustBright  0.121289
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.92479
		Period          9.44945
		Eccentricity    0.948644
		Inclination     158.862
		AscendingNode   79.3741
		ArgOfPericenter -57.2682
		MeanAnomaly     66.8759
	}
}

Comet	"C96"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.02807e-015
	Radius          0.202181
	InertiaMoment   0.397952

	Oblateness      0.0194452

	RotationPeriod  36.4757
	Obliquity       115.273
	EqAscendNode    35.3165

	AbsMagn         7.1755
	SlopeParam      7.19788
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.570 0.566 0.562)

	Surface
	{
		SurfStyle       0.461322
		OceanStyle      0.930703
		Randomize      (-0.736, -0.667, 0.304)
		colorDistMagn   0.839455
		colorDistFreq   3.01377e-005
		detailScale     5.52089
		colorConversion true
		snowLevel       2
		tropicLatitude  0.913553
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399278
		terraceProb     0.270618
		erosion         0
		montesMagn      0.622982
		montesFreq      2.58946
		montesSpiky     0.889435
		montesFraction  0.466859
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.76712e-005
		hillsFraction   0.715302
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268947
		craterFreq      0.192058
		craterDensity   0.905984
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   576.055
		volcanoTemp     1295.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.227, 0.225, 0.000)
		colorShelf     (0.242, 0.241, 0.239, 0.000)
		colorBeach     (0.256, 0.255, 0.253, 0.000)
		colorDesert    (0.271, 0.269, 0.267, 0.000)
		colorLowland   (0.285, 0.283, 0.281, 0.000)
		colorUpland    (0.299, 0.297, 0.295, 0.000)
		colorRock      (0.313, 0.312, 0.309, 0.000)
		colorSnow      (0.328, 0.326, 0.323, 1.000)
		BumpHeight      0.181963
		BumpOffset      0.0363926
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0695442
		GasToDust   0.25
		Particles   1120
		GasBright   0.322081
		DustBright  0.367332
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.34156
		Period          12.6791
		Eccentricity    0.921269
		Inclination     1.69267
		AscendingNode   -138.559
		ArgOfPericenter 45.4264
		MeanAnomaly     157.236
	}
}

Comet	"C97"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.34199e-011
	Radius          4.49771
	InertiaMoment   0.399722

	Oblateness      0.0310479

	RotationPeriod  34.5542
	Obliquity       68.4785
	EqAscendNode    19.8939

	AbsMagn         8.50821
	SlopeParam      5.32506
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.418 0.414 0.409)

	Surface
	{
		SurfStyle       0.125958
		OceanStyle      0.194668
		Randomize      (0.992, -0.636, 0.519)
		colorDistMagn   0.889361
		colorDistFreq   0.00835746
		detailScale     122.818
		colorConversion true
		snowLevel       2
		tropicLatitude  0.989905
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494336
		terraceProb     0.14146
		erosion         0
		montesMagn      0.494547
		montesFreq      2.48744
		montesSpiky     0.927694
		montesFraction  0.508223
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0365875
		hillsFraction   0.541489
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242524
		craterFreq      0.201263
		craterDensity   0.922008
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   145.715
		volcanoTemp     1432.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.166, 0.164, 0.000)
		colorShelf     (0.178, 0.176, 0.174, 0.000)
		colorBeach     (0.188, 0.186, 0.184, 0.000)
		colorDesert    (0.199, 0.197, 0.194, 0.000)
		colorLowland   (0.209, 0.207, 0.205, 0.000)
		colorUpland    (0.219, 0.218, 0.215, 0.000)
		colorRock      (0.230, 0.228, 0.225, 0.000)
		colorSnow      (0.240, 0.238, 0.235, 1.000)
		BumpHeight      4.04794
		BumpOffset      0.809588
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.550736
		GasToDust   0.25
		Particles   2092
		GasBright   0.00980593
		DustBright  0.364094
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.04376
		Period          10.339
		Eccentricity    0.915147
		Inclination     15.1883
		AscendingNode   -29.417
		ArgOfPericenter 94.7973
		MeanAnomaly     -67.5216
	}
}

Comet	"C98"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.81136e-007
	Radius          79.0188
	InertiaMoment   0.398564

	Oblateness      0.0243602

	RotationPeriod  32.5936
	Obliquity       21.6842
	EqAscendNode    4.47129

	AbsMagn         9.90167
	SlopeParam      4.23761
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.476 0.473 0.470)

	Surface
	{
		SurfStyle       0.895569
		OceanStyle      0.581445
		Randomize      (-0.131, -0.935, -0.900)
		colorDistMagn   0.663988
		colorDistFreq   5.28958
		detailScale     2157.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.568259
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560579
		terraceProb     0.150071
		erosion         0
		montesMagn      0.49471
		montesFreq      3.95475
		montesSpiky     0.997855
		montesFraction  0.461863
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.8192
		hillsFraction   0.760548
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247874
		craterFreq      0.229805
		craterDensity   0.996668
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.1095
		volcanoTemp     1274.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.165, 0.188, 0.050)
		colorShelf     (0.191, 0.194, 0.216, 0.040)
		colorBeach     (0.219, 0.222, 0.244, 0.030)
		colorDesert    (0.248, 0.250, 0.277, 0.020)
		colorLowland   (0.276, 0.279, 0.306, 0.030)
		colorUpland    (0.305, 0.307, 0.334, 0.050)
		colorRock      (0.333, 0.336, 0.371, 0.020)
		colorSnow      (0.333, 0.336, 0.371, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0731957
		DustBright  0.78519
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.82473
		Period          8.72226
		Eccentricity    0.930803
		Inclination     38.7655
		AscendingNode   -115.147
		ArgOfPericenter 1.34037
		MeanAnomaly     -112.849
	}
}

Comet	"C99"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            5.5773e-015
	Radius          0.278174
	InertiaMoment   0.396184

	Oblateness      0.0388472

	RotationPeriod  30.5861
	Obliquity       334.89
	EqAscendNode    349.049

	AbsMagn         11.5853
	SlopeParam      3.22064
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.433 0.430 0.426)

	Surface
	{
		SurfStyle       0.500753
		OceanStyle      0.915793
		Randomize      (-0.780, -0.196, -0.227)
		colorDistMagn   0.39659
		colorDistFreq   4.01446e-005
		detailScale     7.59601
		colorConversion true
		snowLevel       2
		tropicLatitude  0.425963
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.322734
		terraceProb     0.336085
		erosion         0
		montesMagn      0.427082
		montesFreq      3.19355
		montesSpiky     0.989207
		montesFraction  0.452666
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000212329
		hillsFraction   0.602397
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229682
		craterFreq      0.213454
		craterDensity   0.851496
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   583.997
		volcanoTemp     1495.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.146, 0.119, 0.000)
		colorShelf     (0.173, 0.150, 0.136, 0.000)
		colorBeach     (0.204, 0.176, 0.162, 0.000)
		colorDesert    (0.221, 0.189, 0.158, 0.000)
		colorLowland   (0.243, 0.202, 0.179, 0.000)
		colorUpland    (0.269, 0.245, 0.217, 0.000)
		colorRock      (0.290, 0.267, 0.235, 0.000)
		colorSnow      (0.316, 0.284, 0.247, 1.000)
		BumpHeight      0.250357
		BumpOffset      0.0500714
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.10237
		GasToDust   0.25
		Particles   1186
		GasBright   0.0783455
		DustBright  0.464527
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.33653
		Period          5.46762
		Eccentricity    0.892683
		Inclination     179.337
		AscendingNode   -81.8838
		ArgOfPericenter -40.198
		MeanAnomaly     -146.207
	}
}

Comet	"C100"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            4.31364e-011
	Radius          4.89463
	InertiaMoment   0.399064

	Oblateness      0.0318052

	RotationPeriod  28.523
	Obliquity       288.096
	EqAscendNode    333.626

	AbsMagn         14.4718
	SlopeParam      8.71764
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.749 0.745 0.744)

	Surface
	{
		SurfStyle       0.0303565
		OceanStyle      0.311441
		Randomize      (-0.234, -0.018, -0.744)
		colorDistMagn   0.98196
		colorDistFreq   0.0103175
		detailScale     133.656
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94391
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404034
		terraceProb     0.33526
		erosion         0
		montesMagn      0.426227
		montesFreq      2.481
		montesSpiky     0.961207
		montesFraction  0.629298
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0654381
		hillsFraction   0.567772
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235267
		craterFreq      0.20358
		craterDensity   1.05391
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   116.843
		volcanoTemp     1600.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.298, 0.298, 0.000)
		colorShelf     (0.318, 0.317, 0.316, 0.000)
		colorBeach     (0.337, 0.335, 0.335, 0.000)
		colorDesert    (0.356, 0.354, 0.353, 0.000)
		colorLowland   (0.374, 0.373, 0.372, 0.000)
		colorUpland    (0.393, 0.391, 0.391, 0.000)
		colorRock      (0.412, 0.410, 0.409, 0.000)
		colorSnow      (0.430, 0.429, 0.428, 1.000)
		BumpHeight      4.40517
		BumpOffset      0.881034
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.583562
		GasToDust   0.25
		Particles   2158
		GasBright   0.0462362
		DustBright  0.181123
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.77279
		Period          8.35249
		Eccentricity    0.908469
		Inclination     93.2686
		AscendingNode   109.226
		ArgOfPericenter 37.1701
		MeanAnomaly     -19.4345
	}
}

Comet	"C101"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.33629e-007
	Radius          108.562
	InertiaMoment   0.397565

	Oblateness      0.0521072

	RotationPeriod  26.3938
	Obliquity       241.301
	EqAscendNode    318.204

	AbsMagn         2.56032
	SlopeParam      5.62631
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.601 0.598 0.593)

	Surface
	{
		SurfStyle       0.375902
		OceanStyle      0.677134
		Randomize      (-0.936, -0.190, 0.955)
		colorDistMagn   0.435023
		colorDistFreq   5.30625
		detailScale     2964.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993541
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.499723
		terraceProb     0.477717
		erosion         0
		montesMagn      0.613644
		montesFreq      3.75792
		montesSpiky     0.9678
		montesFraction  0.566287
		dunesFraction   0
		hillsMagn       0
		hillsFreq       35.4785
		hillsFraction   0.766129
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240489
		craterFreq      0.411235
		craterDensity   1.01798
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.4681
		volcanoTemp     1787.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.239, 0.237, 0.000)
		colorShelf     (0.256, 0.254, 0.252, 0.000)
		colorBeach     (0.271, 0.269, 0.267, 0.000)
		colorDesert    (0.286, 0.284, 0.282, 0.000)
		colorLowland   (0.301, 0.299, 0.296, 0.000)
		colorUpland    (0.316, 0.314, 0.311, 0.000)
		colorRock      (0.331, 0.329, 0.326, 0.000)
		colorSnow      (0.346, 0.344, 0.341, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.186793
		DustBright  0.525052
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.85945
		Period          8.97239
		Eccentricity    0.925866
		Inclination     74.3083
		AscendingNode   88.8872
		ArgOfPericenter 50.7037
		MeanAnomaly     -100.611
	}
}

Comet	"C102"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.02727e-014
	Radius          0.303187
	InertiaMoment   0.399511

	Oblateness      0.0442194

	RotationPeriod  24.1861
	Obliquity       194.507
	EqAscendNode    302.781

	AbsMagn         4.89949
	SlopeParam      4.47073
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.564 0.557 0.554)

	Surface
	{
		SurfStyle       0.53647
		OceanStyle      0.283328
		Randomize      (0.071, 0.469, 0.846)
		colorDistMagn   0.399346
		colorDistFreq   3.44211e-005
		detailScale     8.27901
		colorConversion true
		snowLevel       2
		tropicLatitude  0.482504
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.705658
		terraceProb     0.225612
		erosion         0
		montesMagn      0.513304
		montesFreq      3.27591
		montesSpiky     0.912712
		montesFraction  0.539184
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000158343
		hillsFraction   0.648537
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240826
		craterFreq      0.190835
		craterDensity   0.940094
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   469.001
		volcanoTemp     1264.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.189, 0.155, 0.000)
		colorShelf     (0.226, 0.195, 0.177, 0.000)
		colorBeach     (0.265, 0.228, 0.211, 0.000)
		colorDesert    (0.288, 0.245, 0.205, 0.000)
		colorLowland   (0.316, 0.262, 0.233, 0.000)
		colorUpland    (0.350, 0.317, 0.283, 0.000)
		colorRock      (0.378, 0.345, 0.305, 0.000)
		colorSnow      (0.412, 0.367, 0.321, 1.000)
		BumpHeight      0.272868
		BumpOffset      0.0545736
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.135196
		GasToDust   0.25
		Particles   1252
		GasBright   0.127402
		DustBright  0.26893
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.52711
		Period          6.67784
		Eccentricity    0.912916
		Inclination     38.1236
		AscendingNode   -137.652
		ArgOfPericenter 11.6266
		MeanAnomaly     27.7137
	}
}

Comet	"C103"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            7.9452e-011
	Radius          6.71539
	InertiaMoment   0.398282

	Oblateness      0.0755292

	RotationPeriod  21.885
	Obliquity       147.713
	EqAscendNode    287.358

	AbsMagn         6.47314
	SlopeParam      3.4629
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.684 0.682 0.677)

	Surface
	{
		SurfStyle       0.0657744
		OceanStyle      0.312679
		Randomize      (-0.647, 0.689, -0.438)
		colorDistMagn   0.965456
		colorDistFreq   0.0277556
		detailScale     183.375
		colorConversion true
		snowLevel       2
		tropicLatitude  0.696672
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.419067
		terraceProb     0.670637
		erosion         0
		montesMagn      0.67512
		montesFreq      2.93822
		montesSpiky     0.828
		montesFraction  0.469517
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0952346
		hillsFraction   0.766304
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217397
		craterFreq      0.210413
		craterDensity   0.86584
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   118.12
		volcanoTemp     1661.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.273, 0.271, 0.000)
		colorShelf     (0.291, 0.290, 0.288, 0.000)
		colorBeach     (0.308, 0.307, 0.305, 0.000)
		colorDesert    (0.325, 0.324, 0.322, 0.000)
		colorLowland   (0.342, 0.341, 0.339, 0.000)
		colorUpland    (0.359, 0.358, 0.356, 0.000)
		colorRock      (0.376, 0.375, 0.372, 0.000)
		colorSnow      (0.393, 0.392, 0.389, 1.000)
		BumpHeight      6.04385
		BumpOffset      1.20877
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.616388
		GasToDust   0.25
		Particles   2225
		GasBright   0.33515
		DustBright  0.545669
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.60872
		Period          7.22024
		Eccentricity    0.953157
		Inclination     144.059
		AscendingNode   96.0321
		ArgOfPericenter 60.111
		MeanAnomaly     37.0467
	}
}

Comet	"C104"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            6.14503e-007
	Radius          118.495
	InertiaMoment   0.399935

	Oblateness      0.0681942

	RotationPeriod  19.4719
	Obliquity       100.918
	EqAscendNode    271.936

	AbsMagn         7.83492
	SlopeParam      2.2825
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.725 0.722 0.719)

	Surface
	{
		SurfStyle       0.312465
		OceanStyle      0.256391
		Randomize      (0.366, 0.194, -0.862)
		colorDistMagn   0.483234
		colorDistFreq   10.0593
		detailScale     3235.7
		colorConversion true
		snowLevel       2
		tropicLatitude  0.939115
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.658712
		terraceProb     0.101788
		erosion         0
		montesMagn      0.389028
		montesFreq      2.10753
		montesSpiky     0.959443
		montesFraction  0.688365
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.8528
		hillsFraction   0.410036
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23632
		craterFreq      0.541027
		craterDensity   0.961295
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.6997
		volcanoTemp     1406.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.289, 0.287, 0.000)
		colorShelf     (0.308, 0.307, 0.305, 0.000)
		colorBeach     (0.326, 0.325, 0.323, 0.000)
		colorDesert    (0.344, 0.343, 0.341, 0.000)
		colorLowland   (0.362, 0.361, 0.359, 0.000)
		colorUpland    (0.380, 0.379, 0.377, 0.000)
		colorRock      (0.398, 0.397, 0.395, 0.000)
		colorSnow      (0.417, 0.415, 0.413, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.248476
		DustBright  0.31683
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.34648
		Period          12.7191
		Eccentricity    0.920236
		Inclination     44.751
		AscendingNode   -133.76
		ArgOfPericenter -12.8266
		MeanAnomaly     51.3629
	}
}

Comet	"C105"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.8921e-014
	Radius          0.415427
	InertiaMoment   0.398827

	Oblateness      0.125824

	RotationPeriod  16.9232
	Obliquity       54.1241
	EqAscendNode    256.513

	AbsMagn         9.1773
	SlopeParam      5.96998
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.479 0.475 0.471)

	Surface
	{
		SurfStyle       0.339607
		OceanStyle      0.563213
		Randomize      (0.537, -0.572, -0.224)
		colorDistMagn   0.134796
		colorDistFreq   0.00010063
		detailScale     11.3439
		colorConversion true
		snowLevel       2
		tropicLatitude  0.31541
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.344872
		terraceProb     0.262922
		erosion         0
		montesMagn      0.485819
		montesFreq      2.45011
		montesSpiky     0.880744
		montesFraction  0.490954
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000425167
		hillsFraction   0.721239
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245345
		craterFreq      0.193934
		craterDensity   0.968815
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   473.509
		volcanoTemp     1316.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.190, 0.188, 0.000)
		colorShelf     (0.204, 0.202, 0.200, 0.000)
		colorBeach     (0.216, 0.214, 0.212, 0.000)
		colorDesert    (0.228, 0.226, 0.224, 0.000)
		colorLowland   (0.240, 0.238, 0.235, 0.000)
		colorUpland    (0.251, 0.250, 0.247, 0.000)
		colorRock      (0.263, 0.261, 0.259, 0.000)
		colorSnow      (0.275, 0.273, 0.271, 1.000)
		BumpHeight      0.373884
		BumpOffset      0.0747768
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.168022
		GasToDust   0.25
		Particles   1319
		GasBright   0.124543
		DustBright  0.125249
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.05722
		Period          10.4413
		Eccentricity    0.934729
		Inclination     -35.7884
		AscendingNode   -1.94873
		ArgOfPericenter -30.8883
		MeanAnomaly     148.524
	}
}

Comet	"C106"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.46341e-010
	Radius          7.33987
	InertiaMoment   0.397056

	Oblateness      0.126451

	RotationPeriod  14.2082
	Obliquity       7.32985
	EqAscendNode    241.091

	AbsMagn         10.6722
	SlopeParam      4.71044
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.435 0.431 0.426)

	Surface
	{
		SurfStyle       0.634315
		OceanStyle      0.183307
		Randomize      (0.992, 0.220, -0.047)
		colorDistMagn   0.290094
		colorDistFreq   0.0151852
		detailScale     200.427
		colorConversion true
		snowLevel       2
		tropicLatitude  0.863127
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.764036
		terraceProb     0.49542
		erosion         0
		montesMagn      0.648015
		montesFreq      3.38993
		montesSpiky     0.946291
		montesFraction  0.741366
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0643105
		hillsFraction   0.525355
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22773
		craterFreq      0.197115
		craterDensity   0.756186
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   95.1288
		volcanoTemp     1786.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.146, 0.119, 0.000)
		colorShelf     (0.174, 0.151, 0.136, 0.000)
		colorBeach     (0.204, 0.177, 0.162, 0.000)
		colorDesert    (0.222, 0.190, 0.158, 0.000)
		colorLowland   (0.243, 0.202, 0.179, 0.000)
		colorUpland    (0.269, 0.246, 0.217, 0.000)
		colorRock      (0.291, 0.267, 0.234, 0.000)
		colorSnow      (0.317, 0.284, 0.247, 1.000)
		BumpHeight      6.60588
		BumpOffset      1.32118
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.649214
		GasToDust   0.25
		Particles   2291
		GasBright   0.042319
		DustBright  0.69196
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.9336
		Period          9.51444
		Eccentricity    0.899452
		Inclination     55.0228
		AscendingNode   52.5418
		ArgOfPericenter -89.8956
		MeanAnomaly     -52.1724
	}
}

Comet	"C107"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            4.50593e-018
	Radius          0.0257007
	InertiaMoment   0.399295

	Oblateness      0.249

	RotationPeriod  11.286
	Obliquity       320.536
	EqAscendNode    225.668

	AbsMagn         12.703
	SlopeParam      3.6975
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.695 0.692 0.690)

	Surface
	{
		SurfStyle       0.739262
		OceanStyle      0.143702
		Randomize      (0.854, 0.776, 0.597)
		colorDistMagn   0.845935
		colorDistFreq   5.31329e-007
		detailScale     0.701801
		colorConversion true
		snowLevel       2
		tropicLatitude  0.36095
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.370875
		terraceProb     0.245847
		erosion         0
		montesMagn      0.589769
		montesFreq      3.24406
		montesSpiky     0.880467
		montesFraction  0.496843
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.4128e-006
		hillsFraction   0.692297
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222187
		craterFreq      0.17785
		craterDensity   0.923884
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1898.28
		volcanoTemp     1575.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.235, 0.193, 0.000)
		colorShelf     (0.278, 0.242, 0.221, 0.000)
		colorBeach     (0.326, 0.284, 0.262, 0.000)
		colorDesert    (0.354, 0.304, 0.255, 0.000)
		colorLowland   (0.389, 0.325, 0.290, 0.000)
		colorUpland    (0.431, 0.394, 0.352, 0.000)
		colorRock      (0.465, 0.429, 0.379, 0.000)
		colorSnow      (0.507, 0.457, 0.400, 1.000)
		BumpHeight      0.0231307
		BumpOffset      0.00462613
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.048861
		DustBright  0.369904
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.92361
		Period          9.44078
		Eccentricity    0.906282
		Inclination     -24.7489
		AscendingNode   150.449
		ArgOfPericenter -81.3994
		MeanAnomaly     156.82
	}
}

Comet	"C108"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.48501e-014
	Radius          0.45465
	InertiaMoment   0.397961

	Oblateness      0.249

	RotationPeriod  8.09941
	Obliquity       273.741
	EqAscendNode    210.245

	AbsMagn         -0.221816
	SlopeParam      2.59376
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.792 0.711 0.680)

	Surface
	{
		SurfStyle       0.504105
		OceanStyle      0.0117462
		Randomize      (0.971, -0.565, -0.115)
		colorDistMagn   0.397509
		colorDistFreq   0.000139405
		detailScale     12.415
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990378
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.270424
		terraceProb     0.129921
		erosion         0
		montesMagn      0.234313
		montesFreq      3.56948
		montesSpiky     0.996846
		montesFraction  0.565165
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000427344
		hillsFraction   0.774843
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256076
		craterFreq      0.261487
		craterDensity   1.03797
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   381.84
		volcanoTemp     1431.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.242, 0.190, 0.000)
		colorShelf     (0.317, 0.249, 0.218, 0.000)
		colorBeach     (0.372, 0.292, 0.258, 0.000)
		colorDesert    (0.404, 0.313, 0.252, 0.000)
		colorLowland   (0.444, 0.334, 0.286, 0.000)
		colorUpland    (0.491, 0.405, 0.347, 0.000)
		colorRock      (0.531, 0.441, 0.374, 0.000)
		colorSnow      (0.578, 0.469, 0.394, 1.000)
		BumpHeight      0.409185
		BumpOffset      0.081837
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.200848
		GasToDust   0.25
		Particles   1385
		GasBright   0.158723
		DustBright  0.744529
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.3635
		Period          5.63399
		Eccentricity    0.892247
		Inclination     -4.28419
		AscendingNode   -169.593
		ArgOfPericenter -146.878
		MeanAnomaly     120.485
	}
}

Comet	"C109"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.69541e-010
	Radius          10.0328
	InertiaMoment   0.399727

	Oblateness      0.249

	RotationPeriod  4.56496
	Obliquity       226.947
	EqAscendNode    194.823

	AbsMagn         3.8905
	SlopeParam      6.38468
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.631 0.624 0.621)

	Surface
	{
		SurfStyle       0.65701
		OceanStyle      0.464441
		Randomize      (0.649, -0.179, -0.895)
		colorDistMagn   0.103219
		colorDistFreq   0.0512897
		detailScale     273.962
		colorConversion true
		snowLevel       2
		tropicLatitude  0.731071
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.405407
		terraceProb     0.478716
		erosion         0
		montesMagn      0.295396
		montesFreq      2.75625
		montesSpiky     0.921439
		montesFraction  0.633053
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.279878
		hillsFraction   0.56817
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233124
		craterFreq      0.231947
		craterDensity   0.771196
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   95.8112
		volcanoTemp     1405.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.212, 0.174, 0.000)
		colorShelf     (0.252, 0.218, 0.199, 0.000)
		colorBeach     (0.296, 0.256, 0.236, 0.000)
		colorDesert    (0.322, 0.275, 0.230, 0.000)
		colorLowland   (0.353, 0.293, 0.261, 0.000)
		colorUpland    (0.391, 0.356, 0.317, 0.000)
		colorRock      (0.423, 0.387, 0.342, 0.000)
		colorSnow      (0.460, 0.412, 0.360, 1.000)
		BumpHeight      9.02953
		BumpOffset      1.80591
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.68204
		GasToDust   0.25
		Particles   2357
		GasBright   0.137983
		DustBright  0.449756
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.51981
		Period          6.63005
		Eccentricity    0.917592
		Inclination     -1.76645
		AscendingNode   -90.1248
		ArgOfPericenter -76.8921
		MeanAnomaly     -94.055
	}
}

Comet	"C110"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            8.29936e-018
	Radius          0.0281622
	InertiaMoment   0.398571

	Oblateness      0.00143809

	RotationPeriod  133.342
	Obliquity       180.153
	EqAscendNode    179.4

	AbsMagn         5.71985
	SlopeParam      4.96085
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.498 0.402 0.359)

	Surface
	{
		SurfStyle       0.572897
		OceanStyle      0.754909
		Randomize      (0.333, 0.510, 0.687)
		colorDistMagn   0.412143
		colorDistFreq   4.40851e-007
		detailScale     0.769015
		colorConversion true
		snowLevel       2
		tropicLatitude  0.266797
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.700111
		terraceProb     0.318513
		erosion         0
		montesMagn      0.475481
		montesFreq      3.62989
		montesSpiky     0.9097
		montesFraction  0.59295
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.78254e-006
		hillsFraction   0.503894
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240528
		craterFreq      0.215115
		craterDensity   0.984302
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1532.67
		volcanoTemp     1272.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.137, 0.101, 0.000)
		colorShelf     (0.199, 0.141, 0.115, 0.000)
		colorBeach     (0.234, 0.165, 0.136, 0.000)
		colorDesert    (0.254, 0.177, 0.133, 0.000)
		colorLowland   (0.279, 0.189, 0.151, 0.000)
		colorUpland    (0.309, 0.229, 0.183, 0.000)
		colorRock      (0.334, 0.250, 0.197, 0.000)
		colorSnow      (0.364, 0.266, 0.208, 1.000)
		BumpHeight      0.0253459
		BumpOffset      0.00506919
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0799836
		DustBright  0.192241
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.30355
		Period          12.3716
		Eccentricity    0.918203
		Inclination     15.4647
		AscendingNode   86.8912
		ArgOfPericenter 100.417
		MeanAnomaly     65.7921
	}
}

Comet	"C111"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            6.41896e-014
	Radius          0.620759
	InertiaMoment   0.396216

	Oblateness      0.00259535

	RotationPeriod  116.285
	Obliquity       133.358
	EqAscendNode    163.978

	AbsMagn         7.15689
	SlopeParam      3.92799
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.534 0.410 0.334)

	Surface
	{
		SurfStyle       0.288207
		OceanStyle      0.93675
		Randomize      (-0.715, -0.093, -0.384)
		colorDistMagn   0.452344
		colorDistFreq   9.25555e-005
		detailScale     16.9509
		colorConversion true
		snowLevel       2
		tropicLatitude  0.722403
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539664
		terraceProb     0.442317
		erosion         0
		montesMagn      0.579654
		montesFreq      3.41086
		montesSpiky     0.795381
		montesFraction  0.311789
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000815644
		hillsFraction   0.765357
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239428
		craterFreq      0.276339
		craterDensity   0.891071
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   384.146
		volcanoTemp     1313.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.164, 0.133, 0.000)
		colorShelf     (0.227, 0.174, 0.142, 0.000)
		colorBeach     (0.240, 0.184, 0.150, 0.000)
		colorDesert    (0.254, 0.195, 0.158, 0.000)
		colorLowland   (0.267, 0.205, 0.167, 0.000)
		colorUpland    (0.280, 0.215, 0.175, 0.000)
		colorRock      (0.294, 0.225, 0.184, 0.000)
		colorSnow      (0.307, 0.235, 0.192, 1.000)
		BumpHeight      0.558683
		BumpOffset      0.111737
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.233674
		GasToDust   0.25
		Particles   1451
		GasBright   0.267013
		DustBright  0.489699
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.35921
		Period          12.8227
		Eccentricity    0.929031
		Inclination     -67.0138
		AscendingNode   -129.235
		ArgOfPericenter 147.127
		MeanAnomaly     -126.82
	}
}

Comet	"C112"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            4.96461e-010
	Radius          11.0066
	InertiaMoment   0.39907

	Oblateness      0.00220921

	RotationPeriod  107.575
	Obliquity       86.5641
	EqAscendNode    148.555

	AbsMagn         8.48986
	SlopeParam      2.87414
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.667 0.493 0.415)

	Surface
	{
		SurfStyle       0.353722
		OceanStyle      0.825745
		Randomize      (0.484, 0.411, -0.603)
		colorDistMagn   0.422124
		colorDistFreq   0.0110305
		detailScale     300.554
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999846
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.63217
		terraceProb     0.173664
		erosion         0
		montesMagn      0.470583
		montesFreq      2.74384
		montesSpiky     0.935811
		montesFraction  0.452604
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.330946
		hillsFraction   0.767535
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228186
		craterFreq      0.221718
		craterDensity   0.73511
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   77.4493
		volcanoTemp     1167.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.197, 0.166, 0.000)
		colorShelf     (0.284, 0.209, 0.176, 0.000)
		colorBeach     (0.300, 0.222, 0.187, 0.000)
		colorDesert    (0.317, 0.234, 0.197, 0.000)
		colorLowland   (0.334, 0.246, 0.207, 0.000)
		colorUpland    (0.350, 0.259, 0.218, 0.000)
		colorRock      (0.367, 0.271, 0.228, 0.000)
		colorSnow      (0.384, 0.283, 0.239, 1.000)
		BumpHeight      9.90597
		BumpOffset      1.98119
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.714866
		GasToDust   0.25
		Particles   2423
		GasBright   0.181732
		DustBright  0.259466
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.92605
		Period          9.45875
		Eccentricity    0.951481
		Inclination     24.2153
		AscendingNode   79.8443
		ArgOfPericenter -4.75755
		MeanAnomaly     -48.2018
	}
}

Comet	"C113"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.52864e-017
	Radius          0.0384102
	InertiaMoment   0.397576

	Oblateness      0.00341335

	RotationPeriod  101.391
	Obliquity       39.7698
	EqAscendNode    133.132

	AbsMagn         9.88131
	SlopeParam      6.93952
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.780 0.740 0.719)

	Surface
	{
		SurfStyle       0.285647
		OceanStyle      0.54889
		Randomize      (0.160, 0.059, -0.006)
		colorDistMagn   0.730041
		colorDistFreq   8.69577e-007
		detailScale     1.04885
		colorConversion true
		snowLevel       2
		tropicLatitude  0.853918
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413185
		terraceProb     0.434232
		erosion         0
		montesMagn      0.514474
		montesFreq      3.79189
		montesSpiky     0.981384
		montesFraction  0.766556
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.27432e-006
		hillsFraction   0.68074
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254978
		craterFreq      0.196359
		craterDensity   0.888836
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1540.28
		volcanoTemp     1517.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.296, 0.287, 0.000)
		colorShelf     (0.332, 0.314, 0.305, 0.000)
		colorBeach     (0.351, 0.333, 0.323, 0.000)
		colorDesert    (0.371, 0.351, 0.341, 0.000)
		colorLowland   (0.390, 0.370, 0.359, 0.000)
		colorUpland    (0.410, 0.388, 0.377, 0.000)
		colorRock      (0.429, 0.407, 0.395, 0.000)
		colorSnow      (0.449, 0.425, 0.413, 1.000)
		BumpHeight      0.0345692
		BumpOffset      0.00691384
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.435951
		DustBright  0.489733
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.03677
		Period          10.286
		Eccentricity    0.954535
		Inclination     118.811
		AscendingNode   74.4791
		ArgOfPericenter -56.057
		MeanAnomaly     -166.151
	}
}

Comet	"C114"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.18229e-013
	Radius          0.681777
	InertiaMoment   0.399517

	Oblateness      0.00274597

	RotationPeriod  96.4734
	Obliquity       352.975
	EqAscendNode    117.71

	AbsMagn         11.5582
	SlopeParam      5.22737
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.463 0.457 0.455)

	Surface
	{
		SurfStyle       0.351746
		OceanStyle      0.974348
		Randomize      (0.644, 0.770, 0.777)
		colorDistMagn   0.848562
		colorDistFreq   0.000250543
		detailScale     18.617
		colorConversion true
		snowLevel       2
		tropicLatitude  0.520852
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.608118
		terraceProb     0.587462
		erosion         0
		montesMagn      0.498862
		montesFreq      2.45934
		montesSpiky     0.948996
		montesFraction  0.532765
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000925845
		hillsFraction   0.782945
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243535
		craterFreq      0.184068
		craterDensity   0.817788
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   310.875
		volcanoTemp     1550.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.183, 0.182, 0.000)
		colorShelf     (0.197, 0.194, 0.193, 0.000)
		colorBeach     (0.208, 0.206, 0.205, 0.000)
		colorDesert    (0.220, 0.217, 0.216, 0.000)
		colorLowland   (0.231, 0.228, 0.227, 0.000)
		colorUpland    (0.243, 0.240, 0.239, 0.000)
		colorRock      (0.255, 0.251, 0.250, 0.000)
		colorSnow      (0.266, 0.263, 0.262, 1.000)
		BumpHeight      0.613599
		BumpOffset      0.12272
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.2665
		GasToDust   0.25
		Particles   1518
		GasBright   0.0183023
		DustBright  0.591869
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.6273
		Period          7.34572
		Eccentricity    0.92932
		Inclination     -24.8225
		AscendingNode   23.2999
		ArgOfPericenter -130.004
		MeanAnomaly     149.164
	}
}

Comet	"C115"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            9.14418e-010
	Radius          14.9965
	InertiaMoment   0.39829

	Oblateness      0.00410688

	RotationPeriod  92.3236
	Obliquity       306.181
	EqAscendNode    102.287

	AbsMagn         14.4053
	SlopeParam      4.15753
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.749 0.660 0.628)

	Surface
	{
		SurfStyle       0.318349
		OceanStyle      0.785558
		Randomize      (-0.527, 0.662, 0.492)
		colorDistMagn   0.607111
		colorDistFreq   0.137833
		detailScale     409.505
		colorConversion true
		snowLevel       2
		tropicLatitude  0.89542
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589294
		terraceProb     0.291003
		erosion         0
		montesMagn      0.560286
		montesFreq      3.38181
		montesSpiky     0.949283
		montesFraction  0.776614
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.42708
		hillsFraction   0.686814
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227447
		craterFreq      0.16994
		craterDensity   1.00898
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   77.7542
		volcanoTemp     1405.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.264, 0.251, 0.000)
		colorShelf     (0.319, 0.280, 0.267, 0.000)
		colorBeach     (0.337, 0.297, 0.283, 0.000)
		colorDesert    (0.356, 0.313, 0.298, 0.000)
		colorLowland   (0.375, 0.330, 0.314, 0.000)
		colorUpland    (0.393, 0.346, 0.330, 0.000)
		colorRock      (0.412, 0.363, 0.345, 0.000)
		colorSnow      (0.431, 0.379, 0.361, 1.000)
		BumpHeight      13.4969
		BumpOffset      2.69937
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.747692
		GasToDust   0.25
		Particles   2490
		GasBright   0.0262365
		DustBright  0.268421
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.09829
		Period          4.07293
		Eccentricity    0.973218
		Inclination     -82.3101
		AscendingNode   -49.0532
		ArgOfPericenter -23.0396
		MeanAnomaly     158.577
	}
}

Comet	"C116"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.81556e-017
	Radius          0.0422308
	InertiaMoment   0.39994

	Oblateness      0.00324757

	RotationPeriod  88.6915
	Obliquity       259.387
	EqAscendNode    86.8647

	AbsMagn         2.51406
	SlopeParam      3.13391
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.740 0.738 0.736)

	Surface
	{
		SurfStyle       0.532664
		OceanStyle      0.989266
		Randomize      (0.509, -0.084, -0.563)
		colorDistMagn   0.924852
		colorDistFreq   1.38294e-006
		detailScale     1.15318
		colorConversion true
		snowLevel       2
		tropicLatitude  0.931784
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52695
		terraceProb     0.400723
		erosion         0
		montesMagn      0.698225
		montesFreq      2.65092
		montesSpiky     0.844627
		montesFraction  0.850976
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.85256e-006
		hillsFraction   0.648114
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225447
		craterFreq      0.217203
		craterDensity   0.736398
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1247.82
		volcanoTemp     1485.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.251, 0.206, 0.000)
		colorShelf     (0.296, 0.258, 0.235, 0.000)
		colorBeach     (0.348, 0.302, 0.280, 0.000)
		colorDesert    (0.377, 0.325, 0.272, 0.000)
		colorLowland   (0.414, 0.347, 0.309, 0.000)
		colorUpland    (0.459, 0.420, 0.375, 0.000)
		colorRock      (0.496, 0.457, 0.405, 0.000)
		colorSnow      (0.540, 0.487, 0.427, 1.000)
		BumpHeight      0.0380077
		BumpOffset      0.00760155
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.11538
		DustBright  0.663764
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.71268
		Period          7.93132
		Eccentricity    0.880476
		Inclination     169.279
		AscendingNode   5.3662
		ArgOfPericenter -61.2023
		MeanAnomaly     154.675
	}
}

Comet	"C117"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.17763e-013
	Radius          0.928013
	InertiaMoment   0.398833

	Oblateness      0.0047822

	RotationPeriod  85.4324
	Obliquity       212.593
	EqAscendNode    71.4421

	AbsMagn         4.87484
	SlopeParam      7.91779
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.449 0.445 0.442)

	Surface
	{
		SurfStyle       0.840074
		OceanStyle      0.797337
		Randomize      (-0.850, -0.996, 0.911)
		colorDistMagn   0.994908
		colorDistFreq   0.000744873
		detailScale     25.3409
		colorConversion true
		snowLevel       2
		tropicLatitude  0.740194
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.687828
		terraceProb     0.329706
		erosion         0
		montesMagn      0.646589
		montesFreq      4.23573
		montesSpiky     0.963662
		montesFraction  0.645977
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00266413
		hillsFraction   0.521289
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239553
		craterFreq      0.149065
		craterDensity   0.98915
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   311.794
		volcanoTemp     1207.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.151, 0.124, 0.000)
		colorShelf     (0.179, 0.156, 0.142, 0.000)
		colorBeach     (0.211, 0.182, 0.168, 0.000)
		colorDesert    (0.229, 0.196, 0.164, 0.000)
		colorLowland   (0.251, 0.209, 0.186, 0.000)
		colorUpland    (0.278, 0.254, 0.226, 0.000)
		colorRock      (0.301, 0.276, 0.243, 0.000)
		colorSnow      (0.327, 0.294, 0.257, 1.000)
		BumpHeight      0.835211
		BumpOffset      0.167042
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.299326
		GasToDust   0.25
		Particles   1584
		GasBright   0.0960324
		DustBright  0.367599
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.49971
		Period          6.49892
		Eccentricity    0.85676
		Inclination     -80.0162
		AscendingNode   -7.19635
		ArgOfPericenter -136.468
		MeanAnomaly     -16.9376
	}
}

Comet	"C118"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.68424e-009
	Radius          16.505
	InertiaMoment   0.397071

	Oblateness      0.00370975

	RotationPeriod  82.4543
	Obliquity       165.798
	EqAscendNode    56.0195

	AbsMagn         6.45354
	SlopeParam      5.51777
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.771 0.769 0.769)

	Surface
	{
		SurfStyle       0.0395674
		OceanStyle      0.183873
		Randomize      (0.213, -0.492, -0.186)
		colorDistMagn   0.640432
		colorDistFreq   0.162729
		detailScale     450.698
		colorConversion true
		snowLevel       2
		tropicLatitude  0.669778
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.657269
		terraceProb     0.359838
		erosion         0
		montesMagn      0.423574
		montesFreq      2.44874
		montesSpiky     0.97235
		montesFraction  0.676644
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.831577
		hillsFraction   0.568321
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239884
		craterFreq      0.213113
		craterDensity   0.881939
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.0551
		volcanoTemp     1370.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.308, 0.307, 0.000)
		colorShelf     (0.328, 0.327, 0.327, 0.000)
		colorBeach     (0.347, 0.346, 0.346, 0.000)
		colorDesert    (0.366, 0.365, 0.365, 0.000)
		colorLowland   (0.386, 0.385, 0.384, 0.000)
		colorUpland    (0.405, 0.404, 0.404, 0.000)
		colorRock      (0.424, 0.423, 0.423, 0.000)
		colorSnow      (0.443, 0.442, 0.442, 1.000)
		BumpHeight      14.8545
		BumpOffset      2.97091
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.780518
		GasToDust   0.25
		Particles   2556
		GasBright   0.252367
		DustBright  0.695751
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.84799
		Period          8.88955
		Eccentricity    0.949797
		Inclination     142.116
		AscendingNode   -81.3832
		ArgOfPericenter 112.564
		MeanAnomaly     147.257
	}
}

Comet	"C119"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            5.18591e-017
	Radius          0.0574296
	InertiaMoment   0.399301

	Oblateness      0.0054787

	RotationPeriod  79.6951
	Obliquity       119.004
	EqAscendNode    40.5969

	AbsMagn         7.8167
	SlopeParam      4.38917
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.619 0.573 0.526)

	Surface
	{
		SurfStyle       0.764473
		OceanStyle      0.317296
		Randomize      (0.343, -0.399, 0.167)
		colorDistMagn   0.426097
		colorDistFreq   1.70985e-006
		detailScale     1.56821
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987424
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.417631
		terraceProb     0.344931
		erosion         0
		montesMagn      0.665529
		montesFreq      3.08328
		montesSpiky     0.872807
		montesFraction  0.543935
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.02799e-005
		hillsFraction   0.592645
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259495
		craterFreq      0.24226
		craterDensity   1.07538
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1250.34
		volcanoTemp     1173.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.195, 0.147, 0.000)
		colorShelf     (0.248, 0.200, 0.168, 0.000)
		colorBeach     (0.291, 0.235, 0.200, 0.000)
		colorDesert    (0.316, 0.252, 0.195, 0.000)
		colorLowland   (0.347, 0.269, 0.221, 0.000)
		colorUpland    (0.384, 0.327, 0.268, 0.000)
		colorRock      (0.415, 0.355, 0.289, 0.000)
		colorSnow      (0.452, 0.378, 0.305, 1.000)
		BumpHeight      0.0516867
		BumpOffset      0.0103373
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.205737
		DustBright  0.426868
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.99612
		Period          9.97959
		Eccentricity    0.882836
		Inclination     -147.361
		AscendingNode   122.034
		ArgOfPericenter -18.7151
		MeanAnomaly     170.341
	}
}

Comet	"C120"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            4.01093e-013
	Radius          1.02236
	InertiaMoment   0.39797

	Oblateness      0.00424744

	RotationPeriod  77.1105
	Obliquity       72.2097
	EqAscendNode    25.1743

	AbsMagn         9.1583
	SlopeParam      3.3798
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.463 0.457 0.455)

	Surface
	{
		SurfStyle       0.565662
		OceanStyle      0.650822
		Randomize      (0.572, 0.399, -0.020)
		colorDistMagn   0.48717
		colorDistFreq   0.00048515
		detailScale     27.9172
		colorConversion true
		snowLevel       2
		tropicLatitude  0.700618
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.692411
		terraceProb     0.295869
		erosion         0
		montesMagn      0.482012
		montesFreq      2.14038
		montesSpiky     0.840277
		montesFraction  0.369509
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00261764
		hillsFraction   0.718863
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237763
		craterFreq      0.18878
		craterDensity   0.898925
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   253.097
		volcanoTemp     1482.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.155, 0.127, 0.000)
		colorShelf     (0.185, 0.160, 0.146, 0.000)
		colorBeach     (0.218, 0.187, 0.173, 0.000)
		colorDesert    (0.236, 0.201, 0.168, 0.000)
		colorLowland   (0.259, 0.215, 0.191, 0.000)
		colorUpland    (0.287, 0.261, 0.232, 0.000)
		colorRock      (0.310, 0.283, 0.250, 0.000)
		colorSnow      (0.338, 0.302, 0.264, 1.000)
		BumpHeight      0.920123
		BumpOffset      0.184025
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.332152
		GasToDust   0.25
		Particles   1650
		GasBright   0.121847
		DustBright  0.195243
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.83714
		Period          8.81143
		Eccentricity    0.897731
		Inclination     93.4108
		AscendingNode   42.9813
		ArgOfPericenter 16.5916
		MeanAnomaly     136.495
	}
}

Comet	"C121"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.10217e-009
	Radius          22.4252
	InertiaMoment   0.399732

	Oblateness      0.00622203

	RotationPeriod  74.6681
	Obliquity       25.4154
	EqAscendNode    9.75172

	AbsMagn         10.6495
	SlopeParam      2.16426
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.755 0.751 0.748)

	Surface
	{
		SurfStyle       0.486939
		OceanStyle      0.983056
		Randomize      (0.861, -0.820, -0.858)
		colorDistMagn   0.859443
		colorDistFreq   0.36302
		detailScale     612.356
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999238
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.396374
		terraceProb     0.51829
		erosion         0
		montesMagn      0.628757
		montesFreq      3.06718
		montesSpiky     0.881745
		montesFraction  0.435843
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.27523
		hillsFraction   0.497667
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264458
		craterFreq      0.215163
		craterDensity   1.04208
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.1261
		volcanoTemp     1387.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.300, 0.299, 0.000)
		colorShelf     (0.321, 0.319, 0.318, 0.000)
		colorBeach     (0.340, 0.338, 0.337, 0.000)
		colorDesert    (0.359, 0.357, 0.356, 0.000)
		colorLowland   (0.378, 0.375, 0.374, 0.000)
		colorUpland    (0.396, 0.394, 0.393, 0.000)
		colorRock      (0.415, 0.413, 0.412, 0.000)
		colorSnow      (0.434, 0.432, 0.430, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.813344
		GasToDust   0.25
		Particles   2622
		GasBright   0.355349
		DustBright  0.446228
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.1697
		Period          11.3092
		Eccentricity    0.951366
		Inclination     109.891
		AscendingNode   149.11
		ArgOfPericenter -123.048
		MeanAnomaly     -94.4522
	}
}

Comet	"C122"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            9.55181e-017
	Radius          0.0633271
	InertiaMoment   0.398578

	Oblateness      0.00482697

	RotationPeriod  72.3426
	Obliquity       338.621
	EqAscendNode    354.329

	AbsMagn         12.6669
	SlopeParam      5.84441
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.468 0.462 0.459)

	Surface
	{
		SurfStyle       0.107549
		OceanStyle      0.893581
		Randomize      (0.561, 0.898, 0.330)
		colorDistMagn   0.144623
		colorDistFreq   2.59044e-006
		detailScale     1.72925
		colorConversion true
		snowLevel       2
		tropicLatitude  0.356083
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.322119
		terraceProb     0.1986
		erosion         0
		montesMagn      0.480113
		montesFreq      3.33766
		montesSpiky     0.912411
		montesFraction  0.545456
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.17066e-005
		hillsFraction   0.6664
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232807
		craterFreq      0.233746
		craterDensity   0.746229
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1015.9
		volcanoTemp     1579.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.185, 0.184, 0.000)
		colorShelf     (0.199, 0.196, 0.195, 0.000)
		colorBeach     (0.211, 0.208, 0.207, 0.000)
		colorDesert    (0.222, 0.219, 0.218, 0.000)
		colorLowland   (0.234, 0.231, 0.230, 0.000)
		colorUpland    (0.246, 0.243, 0.241, 0.000)
		colorRock      (0.257, 0.254, 0.253, 0.000)
		colorSnow      (0.269, 0.266, 0.264, 1.000)
		BumpHeight      0.0569944
		BumpOffset      0.0113989
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.00114588
		DustBright  0.484918
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.45313
		Period          6.19854
		Eccentricity    0.919119
		Inclination     178.961
		AscendingNode   121.136
		ArgOfPericenter -69.3693
		MeanAnomaly     -56.3551
	}
}

Comet	"C123"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            7.38761e-013
	Radius          1.38788
	InertiaMoment   0.396247

	Oblateness      0.00693292

	RotationPeriod  70.1145
	Obliquity       291.827
	EqAscendNode    338.907

	AbsMagn         -0.378515
	SlopeParam      4.62616
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.785 0.783 0.781)

	Surface
	{
		SurfStyle       0.350429
		OceanStyle      0.766604
		Randomize      (0.304, 0.752, 0.646)
		colorDistMagn   0.261718
		colorDistFreq   0.00112732
		detailScale     37.8983
		colorConversion true
		snowLevel       2
		tropicLatitude  0.740385
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.7148
		terraceProb     0.266217
		erosion         0
		montesMagn      0.431767
		montesFreq      2.91242
		montesSpiky     0.938158
		montesFraction  0.527364
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00538073
		hillsFraction   0.473356
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229725
		craterFreq      0.203779
		craterDensity   0.937134
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   253.166
		volcanoTemp     1120.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.313, 0.313, 0.000)
		colorShelf     (0.333, 0.333, 0.332, 0.000)
		colorBeach     (0.353, 0.352, 0.352, 0.000)
		colorDesert    (0.373, 0.372, 0.371, 0.000)
		colorLowland   (0.392, 0.391, 0.391, 0.000)
		colorUpland    (0.412, 0.411, 0.410, 0.000)
		colorRock      (0.432, 0.431, 0.430, 0.000)
		colorSnow      (0.451, 0.450, 0.449, 1.000)
		BumpHeight      1.24909
		BumpOffset      0.249818
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.364977
		GasToDust   0.25
		Particles   1717
		GasBright   0.0595944
		DustBright  0.910956
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.93132
		Period          9.49761
		Eccentricity    0.913069
		Inclination     66.4633
		AscendingNode   164.634
		ArgOfPericenter 117.699
		MeanAnomaly     -116.812
	}
}

Comet	"C124"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            5.7138e-009
	Radius          24.75
	InertiaMoment   0.399076

	Oblateness      0.00546737

	RotationPeriod  67.9682
	Obliquity       245.032
	EqAscendNode    323.484

	AbsMagn         3.85952
	SlopeParam      3.61662
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.795 0.792 0.791)

	Surface
	{
		SurfStyle       0.274003
		OceanStyle      0.796613
		Randomize      (-0.860, -0.077, -0.418)
		colorDistMagn   0.58092
		colorDistFreq   0.493398
		detailScale     675.839
		colorConversion true
		snowLevel       2
		tropicLatitude  0.866789
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.573484
		terraceProb     0.617192
		erosion         0
		montesMagn      0.592423
		montesFreq      2.66056
		montesSpiky     0.848055
		montesFraction  0.425097
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.08983
		hillsFraction   0.322623
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234988
		craterFreq      0.216346
		craterDensity   1.02984
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.3355
		volcanoTemp     1586.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.317, 0.316, 0.000)
		colorShelf     (0.338, 0.337, 0.336, 0.000)
		colorBeach     (0.358, 0.356, 0.356, 0.000)
		colorDesert    (0.377, 0.376, 0.376, 0.000)
		colorLowland   (0.397, 0.396, 0.396, 0.000)
		colorUpland    (0.417, 0.416, 0.415, 0.000)
		colorRock      (0.437, 0.436, 0.435, 0.000)
		colorSnow      (0.457, 0.455, 0.455, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.846169
		GasToDust   0.25
		Particles   2689
		GasBright   0.0788979
		DustBright  0.576139
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.83155
		Period          8.7712
		Eccentricity    0.880084
		Inclination     -174.906
		AscendingNode   166.394
		ArgOfPericenter 131.466
		MeanAnomaly     15.1496
	}
}

Comet	"C125"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.75932e-016
	Radius          0.0858978
	InertiaMoment   0.397587

	Oblateness      0.00785454

	RotationPeriod  65.8906
	Obliquity       198.238
	EqAscendNode    308.061

	AbsMagn         5.6984
	SlopeParam      2.4898
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.522 0.519 0.513)

	Surface
	{
		SurfStyle       0.286363
		OceanStyle      0.953375
		Randomize      (0.235, 0.695, 0.049)
		colorDistMagn   0.333584
		colorDistFreq   3.76218e-006
		detailScale     2.34558
		colorConversion true
		snowLevel       2
		tropicLatitude  0.18816
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.68978
		terraceProb     0.426775
		erosion         0
		montesMagn      0.503137
		montesFreq      3.04583
		montesSpiky     0.925359
		montesFraction  0.458553
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.04904e-005
		hillsFraction   0.478912
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265258
		craterFreq      0.250288
		craterDensity   0.871452
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1015.35
		volcanoTemp     1636.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.208, 0.205, 0.000)
		colorShelf     (0.222, 0.221, 0.218, 0.000)
		colorBeach     (0.235, 0.234, 0.231, 0.000)
		colorDesert    (0.248, 0.247, 0.244, 0.000)
		colorLowland   (0.261, 0.260, 0.257, 0.000)
		colorUpland    (0.274, 0.273, 0.269, 0.000)
		colorRock      (0.287, 0.285, 0.282, 0.000)
		colorSnow      (0.300, 0.298, 0.295, 1.000)
		BumpHeight      0.077308
		BumpOffset      0.0154616
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0609422
		DustBright  0.278581
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.08001
		Period          3.97169
		Eccentricity    0.867139
		Inclination     13.275
		AscendingNode   143.478
		ArgOfPericenter 24.9484
		MeanAnomaly     -153.101
	}
}

Comet	"C126"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.36071e-012
	Radius          1.53306
	InertiaMoment   0.399522

	Oblateness      0.00618904

	RotationPeriod  63.871
	Obliquity       151.444
	EqAscendNode    292.639

	AbsMagn         7.13827
	SlopeParam      6.22968
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.592 0.587 0.583)

	Surface
	{
		SurfStyle       0.720685
		OceanStyle      0.537341
		Randomize      (0.061, 0.019, 0.322)
		colorDistMagn   0.30108
		colorDistFreq   0.00192396
		detailScale     41.8628
		colorConversion true
		snowLevel       2
		tropicLatitude  0.69006
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.614852
		terraceProb     0.312603
		erosion         0
		montesMagn      0.368377
		montesFreq      2.84059
		montesSpiky     0.929948
		montesFraction  0.34713
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00493241
		hillsFraction   0.708001
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260731
		craterFreq      0.234125
		craterDensity   0.94915
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   206.055
		volcanoTemp     1549.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.199, 0.163, 0.000)
		colorShelf     (0.237, 0.205, 0.187, 0.000)
		colorBeach     (0.278, 0.240, 0.222, 0.000)
		colorDesert    (0.302, 0.258, 0.216, 0.000)
		colorLowland   (0.331, 0.276, 0.245, 0.000)
		colorUpland    (0.367, 0.334, 0.297, 0.000)
		colorRock      (0.397, 0.364, 0.321, 0.000)
		colorSnow      (0.432, 0.387, 0.338, 1.000)
		BumpHeight      1.37975
		BumpOffset      0.275951
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.397803
		GasToDust   0.25
		Particles   1783
		GasBright   0.196558
		DustBright  0.627452
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.43591
		Period          13.4532
		Eccentricity    0.983832
		Inclination     -54.3789
		AscendingNode   123.097
		ArgOfPericenter 77.9953
		MeanAnomaly     -171.343
	}
}

Comet	"C127"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.05241e-008
	Radius          33.545
	InertiaMoment   0.398297

	Oblateness      0.0088846

	RotationPeriod  61.9002
	Obliquity       104.65
	EqAscendNode    277.216

	AbsMagn         8.47153
	SlopeParam      4.87233
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.790 0.736 0.643)

	Surface
	{
		SurfStyle       0.534508
		OceanStyle      0.859202
		Randomize      (0.104, -0.885, 0.224)
		colorDistMagn   0.622935
		colorDistFreq   0.611031
		detailScale     916.002
		colorConversion true
		snowLevel       2
		tropicLatitude  0.799432
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.315466
		terraceProb     0.571627
		erosion         0
		montesMagn      0.322874
		montesFreq      2.94905
		montesSpiky     0.956737
		montesFraction  0.450237
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.51872
		hillsFraction   0.70836
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208003
		craterFreq      0.272929
		craterDensity   0.946976
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.2674
		volcanoTemp     1368.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.250, 0.180, 0.000)
		colorShelf     (0.316, 0.258, 0.206, 0.000)
		colorBeach     (0.371, 0.302, 0.244, 0.000)
		colorDesert    (0.403, 0.324, 0.238, 0.000)
		colorLowland   (0.443, 0.346, 0.270, 0.000)
		colorUpland    (0.490, 0.420, 0.328, 0.000)
		colorRock      (0.530, 0.456, 0.354, 0.000)
		colorSnow      (0.577, 0.486, 0.373, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.878995
		GasToDust   0.25
		Particles   2755
		GasBright   0.15132
		DustBright  0.357176
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.11811
		Period          4.1837
		Eccentricity    0.839439
		Inclination     -124.358
		AscendingNode   -158.574
		ArgOfPericenter -69.2856
		MeanAnomaly     -158.284
	}
}

Comet	"C128"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.24045e-016
	Radius          0.0949606
	InertiaMoment   0.399945

	Oblateness      0.00701716

	RotationPeriod  59.9702
	Obliquity       57.8553
	EqAscendNode    261.794

	AbsMagn         9.861
	SlopeParam      3.84817
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.663 0.660 0.657)

	Surface
	{
		SurfStyle       0.934532
		OceanStyle      0.0362197
		Randomize      (-0.774, 0.657, -0.229)
		colorDistMagn   0.65822
		colorDistFreq   3.23412e-006
		detailScale     2.59306
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99344
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436783
		terraceProb     0.336278
		erosion         0
		montesMagn      0.436163
		montesFreq      3.63757
		montesSpiky     0.991969
		montesFraction  0.129762
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.30564e-005
		hillsFraction   0.644861
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250643
		craterFreq      0.277061
		craterDensity   0.840194
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   827.079
		volcanoTemp     1306.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.231, 0.263, 0.050)
		colorShelf     (0.265, 0.271, 0.302, 0.040)
		colorBeach     (0.305, 0.310, 0.342, 0.030)
		colorDesert    (0.345, 0.350, 0.388, 0.020)
		colorLowland   (0.384, 0.389, 0.427, 0.030)
		colorUpland    (0.424, 0.429, 0.466, 0.050)
		colorRock      (0.464, 0.469, 0.519, 0.020)
		colorSnow      (0.464, 0.469, 0.519, 1.000)
		BumpHeight      0.0854645
		BumpOffset      0.0170929
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.354127
		DustBright  0.638857
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.47207
		Period          6.32013
		Eccentricity    0.921191
		Inclination     141.288
		AscendingNode   179.503
		ArgOfPericenter -41.1962
		MeanAnomaly     11.5337
	}
}

Comet	"C129"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.50626e-012
	Radius          2.07629
	InertiaMoment   0.398839

	Oblateness      0.0100711

	RotationPeriod  58.074
	Obliquity       11.061
	EqAscendNode    246.371

	AbsMagn         11.5312
	SlopeParam      2.77948
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.599 0.595 0.588)

	Surface
	{
		SurfStyle       0.120212
		OceanStyle      0.0411181
		Randomize      (0.304, 0.269, -0.439)
		colorDistMagn   0.701499
		colorDistFreq   0.00346619
		detailScale     56.6965
		colorConversion true
		snowLevel       2
		tropicLatitude  0.880073
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.712822
		terraceProb     0.335979
		erosion         0
		montesMagn      0.560949
		montesFreq      2.92041
		montesSpiky     0.953408
		montesFraction  0.794505
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0106412
		hillsFraction   0.728044
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24796
		craterFreq      0.229798
		craterDensity   0.873701
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   205.627
		volcanoTemp     1767.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.238, 0.235, 0.000)
		colorShelf     (0.255, 0.253, 0.250, 0.000)
		colorBeach     (0.270, 0.268, 0.265, 0.000)
		colorDesert    (0.285, 0.282, 0.279, 0.000)
		colorLowland   (0.300, 0.297, 0.294, 0.000)
		colorUpland    (0.315, 0.312, 0.309, 0.000)
		colorRock      (0.330, 0.327, 0.323, 0.000)
		colorSnow      (0.345, 0.342, 0.338, 1.000)
		BumpHeight      1.86866
		BumpOffset      0.373732
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.430629
		GasToDust   0.25
		Particles   1849
		GasBright   0.281607
		DustBright  0.395863
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.60321
		Period          7.18322
		Eccentricity    0.948344
		Inclination     113.979
		AscendingNode   64.3111
		ArgOfPericenter 36.4262
		MeanAnomaly     138.841
	}
}

Comet	"C130"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.9384e-008
	Radius          37.1131
	InertiaMoment   0.397086

	Oblateness      0.00788734

	RotationPeriod  56.2054
	Obliquity       324.267
	EqAscendNode    230.948

	AbsMagn         14.3406
	SlopeParam      6.7226
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.771 0.768 0.766)

	Surface
	{
		SurfStyle       0.31523
		OceanStyle      0.448439
		Randomize      (-0.282, -0.853, 0.526)
		colorDistMagn   0.409158
		colorDistFreq   0.423833
		detailScale     1013.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.809621
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.477789
		terraceProb     0.326408
		erosion         0
		montesMagn      0.467959
		montesFreq      3.3502
		montesSpiky     0.906288
		montesFraction  0.507093
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.3382
		hillsFraction   0.580449
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224505
		craterFreq      0.235371
		craterDensity   1.02296
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.7937
		volcanoTemp     1452.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.307, 0.306, 0.000)
		colorShelf     (0.328, 0.326, 0.326, 0.000)
		colorBeach     (0.347, 0.346, 0.345, 0.000)
		colorDesert    (0.366, 0.365, 0.364, 0.000)
		colorLowland   (0.386, 0.384, 0.383, 0.000)
		colorUpland    (0.405, 0.403, 0.402, 0.000)
		colorRock      (0.424, 0.422, 0.421, 0.000)
		colorSnow      (0.443, 0.441, 0.440, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.911821
		GasToDust   0.25
		Particles   2821
		GasBright   0.171828
		DustBright  0.190129
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.08161
		Period          10.6275
		Eccentricity    0.897033
		Inclination     -118.27
		AscendingNode   -66.8166
		ArgOfPericenter -77.7535
		MeanAnomaly     -108.119
	}
}

Comet	"C131"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            5.96848e-016
	Radius          0.128517
	InertiaMoment   0.399306

	Oblateness      0.0114668

	RotationPeriod  54.3587
	Obliquity       277.472
	EqAscendNode    215.526

	AbsMagn         2.46706
	SlopeParam      5.13252
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.568 0.479 0.391)

	Surface
	{
		SurfStyle       0.705789
		OceanStyle      0.458187
		Randomize      (0.548, 0.462, -0.400)
		colorDistMagn   0.709227
		colorDistFreq   9.26062e-006
		detailScale     3.50936
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996551
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605978
		terraceProb     0.172276
		erosion         0
		montesMagn      0.350193
		montesFreq      2.36445
		montesSpiky     0.917541
		montesFraction  0.590126
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.51248e-005
		hillsFraction   0.71345
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210831
		craterFreq      0.21577
		craterDensity   0.930124
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   824.771
		volcanoTemp     1350.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.163, 0.110, 0.000)
		colorShelf     (0.227, 0.168, 0.125, 0.000)
		colorBeach     (0.267, 0.196, 0.149, 0.000)
		colorDesert    (0.290, 0.211, 0.145, 0.000)
		colorLowland   (0.318, 0.225, 0.164, 0.000)
		colorUpland    (0.352, 0.273, 0.199, 0.000)
		colorRock      (0.380, 0.297, 0.215, 0.000)
		colorSnow      (0.415, 0.316, 0.227, 1.000)
		BumpHeight      0.115665
		BumpOffset      0.023133
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0285799
		DustBright  0.817863
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.70058
		Period          7.84741
		Eccentricity    0.934891
		Inclination     127.006
		AscendingNode   -90.3405
		ArgOfPericenter -165.742
		MeanAnomaly     -167.095
	}
}

Comet	"C132"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            4.61619e-012
	Radius          2.29884
	InertiaMoment   0.397979

	Oblateness      0.00904186

	RotationPeriod  52.5285
	Obliquity       230.678
	EqAscendNode    200.103

	AbsMagn         4.85008
	SlopeParam      4.07769
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.785 0.755 0.702)

	Surface
	{
		SurfStyle       0.607588
		OceanStyle      0.0846075
		Randomize      (-0.152, 0.575, 0.008)
		colorDistMagn   0.43462
		colorDistFreq   0.00326908
		detailScale     62.7737
		colorConversion true
		snowLevel       2
		tropicLatitude  0.865825
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.527742
		terraceProb     0.376999
		erosion         0
		montesMagn      0.626293
		montesFreq      2.86917
		montesSpiky     0.896366
		montesFraction  0.223127
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00987593
		hillsFraction   0.690428
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.183081
		craterFreq      0.20552
		craterDensity   0.961149
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   167.754
		volcanoTemp     1636.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.257, 0.196, 0.000)
		colorShelf     (0.314, 0.264, 0.225, 0.000)
		colorBeach     (0.369, 0.309, 0.267, 0.000)
		colorDesert    (0.400, 0.332, 0.260, 0.000)
		colorLowland   (0.440, 0.355, 0.295, 0.000)
		colorUpland    (0.487, 0.430, 0.358, 0.000)
		colorRock      (0.526, 0.468, 0.386, 0.000)
		colorSnow      (0.573, 0.498, 0.407, 1.000)
		BumpHeight      2.06896
		BumpOffset      0.413792
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.463455
		GasToDust   0.25
		Particles   1916
		GasBright   0.0492756
		DustBright  0.481654
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.13143
		Period          11.0113
		Eccentricity    0.94796
		Inclination     69.9261
		AscendingNode   8.9049
		ArgOfPericenter -130.976
		MeanAnomaly     -157.948
	}
}

Comet	"C133"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.5703e-008
	Radius          50.1931
	InertiaMoment   0.399738

	Oblateness      0.0131435

	RotationPeriod  50.71
	Obliquity       183.884
	EqAscendNode    184.681

	AbsMagn         6.43391
	SlopeParam      3.04552
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.630 0.509 0.413)

	Surface
	{
		SurfStyle       0.597929
		OceanStyle      0.684044
		Randomize      (0.090, 0.879, -0.185)
		colorDistMagn   0.565846
		colorDistFreq   0.958611
		detailScale     1370.61
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986781
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530264
		terraceProb     0.192609
		erosion         0
		montesMagn      0.500781
		montesFreq      2.48673
		montesSpiky     0.886332
		montesFraction  0.392622
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.02841
		hillsFraction   0.662759
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.285628
		craterFreq      0.24121
		craterDensity   0.831748
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.6484
		volcanoTemp     1442.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.173, 0.116, 0.000)
		colorShelf     (0.252, 0.178, 0.132, 0.000)
		colorBeach     (0.296, 0.209, 0.157, 0.000)
		colorDesert    (0.321, 0.224, 0.153, 0.000)
		colorLowland   (0.353, 0.239, 0.173, 0.000)
		colorUpland    (0.391, 0.290, 0.210, 0.000)
		colorRock      (0.422, 0.315, 0.227, 0.000)
		colorSnow      (0.460, 0.336, 0.239, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.944647
		GasToDust   0.25
		Particles   2888
		GasBright   0.0327121
		DustBright  0.182704
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.82075
		Period          8.69374
		Eccentricity    0.912163
		Inclination     -82.5522
		AscendingNode   60.8298
		ArgOfPericenter -109.043
		MeanAnomaly     -128.265
	}
}

Comet	"C134"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.09932e-015
	Radius          0.142394
	InertiaMoment   0.398585

	Oblateness      0.0104364

	RotationPeriod  48.8984
	Obliquity       137.09
	EqAscendNode    169.258

	AbsMagn         7.79848
	SlopeParam      7.47934
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.448 0.445 0.443)

	Surface
	{
		SurfStyle       0.0404081
		OceanStyle      0.570579
		Randomize      (-0.368, 0.017, 0.196)
		colorDistMagn   0.0276164
		colorDistFreq   1.19313e-005
		detailScale     3.8883
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998254
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478405
		terraceProb     0.181461
		erosion         0
		montesMagn      0.500747
		montesFreq      2.88482
		montesSpiky     0.826972
		montesFraction  0.535862
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.82601e-005
		hillsFraction   0.599753
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240056
		craterFreq      0.208796
		craterDensity   0.823031
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   673.341
		volcanoTemp     1789.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.178, 0.177, 0.000)
		colorShelf     (0.190, 0.189, 0.188, 0.000)
		colorBeach     (0.202, 0.200, 0.199, 0.000)
		colorDesert    (0.213, 0.211, 0.210, 0.000)
		colorLowland   (0.224, 0.223, 0.222, 0.000)
		colorUpland    (0.235, 0.234, 0.233, 0.000)
		colorRock      (0.246, 0.245, 0.244, 0.000)
		colorSnow      (0.258, 0.256, 0.255, 1.000)
		BumpHeight      0.128155
		BumpOffset      0.0256309
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0150891
		GasToDust   0.25
		Particles   1010
		GasBright   0.14761
		DustBright  0.552293
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.61808
		Period          14.9902
		Eccentricity    0.922177
		Inclination     -50.8509
		AscendingNode   9.02662
		ArgOfPericenter 167.262
		MeanAnomaly     134.664
	}
}

Comet	"C135"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            8.50246e-012
	Radius          3.107
	InertiaMoment   0.396277

	Oblateness      0.0149856

	RotationPeriod  47.089
	Obliquity       90.2952
	EqAscendNode    153.835

	AbsMagn         9.13933
	SlopeParam      5.41352
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.529 0.524 0.519)

	Surface
	{
		SurfStyle       0.647094
		OceanStyle      0.176157
		Randomize      (0.994, 0.220, -0.970)
		colorDistMagn   0.0981522
		colorDistFreq   0.00706709
		detailScale     84.8418
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994987
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.335046
		terraceProb     0.155653
		erosion         0
		montesMagn      0.431342
		montesFreq      3.36949
		montesSpiky     0.90603
		montesFraction  0.653395
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0180632
		hillsFraction   0.58727
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209799
		craterFreq      0.279218
		craterDensity   0.848464
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   167.061
		volcanoTemp     1545.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.178, 0.145, 0.000)
		colorShelf     (0.212, 0.183, 0.166, 0.000)
		colorBeach     (0.249, 0.215, 0.197, 0.000)
		colorDesert    (0.270, 0.231, 0.192, 0.000)
		colorLowland   (0.296, 0.246, 0.218, 0.000)
		colorUpland    (0.328, 0.299, 0.264, 0.000)
		colorRock      (0.354, 0.325, 0.285, 0.000)
		colorSnow      (0.386, 0.346, 0.301, 1.000)
		BumpHeight      2.7963
		BumpOffset      0.55926
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.496281
		GasToDust   0.25
		Particles   1982
		GasBright   0.103764
		DustBright  0.280625
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.75685
		Period          8.24016
		Eccentricity    0.913821
		Inclination     -19.7606
		AscendingNode   -106.346
		ArgOfPericenter -125.83
		MeanAnomaly     78.6197
	}
}

Comet	"C136"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            6.57603e-008
	Radius          55.6509
	InertiaMoment   0.399082

	Oblateness      0.01217

	RotationPeriod  45.2774
	Obliquity       43.5009
	EqAscendNode    138.413

	AbsMagn         10.6269
	SlopeParam      4.30825
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.787 0.785 0.784)

	Surface
	{
		SurfStyle       0.33702
		OceanStyle      0.0810299
		Randomize      (-0.867, -0.499, 0.241)
		colorDistMagn   0.963612
		colorDistFreq   2.08387
		detailScale     1519.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.276539
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503918
		terraceProb     0.299846
		erosion         0
		montesMagn      0.405727
		montesFreq      3.78353
		montesSpiky     0.992885
		montesFraction  0.51781
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.76153
		hillsFraction   0.455564
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212741
		craterFreq      0.244945
		craterDensity   0.916697
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.0249
		volcanoTemp     1702.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.314, 0.314, 0.000)
		colorShelf     (0.334, 0.334, 0.333, 0.000)
		colorBeach     (0.354, 0.353, 0.353, 0.000)
		colorDesert    (0.374, 0.373, 0.373, 0.000)
		colorLowland   (0.393, 0.393, 0.392, 0.000)
		colorUpland    (0.413, 0.412, 0.412, 0.000)
		colorRock      (0.433, 0.432, 0.431, 0.000)
		colorSnow      (0.452, 0.451, 0.451, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.977473
		GasToDust   0.25
		Particles   2954
		GasBright   0.285852
		DustBright  0.583023
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.60962
		Period          7.22634
		Eccentricity    0.917859
		Inclination     152.421
		AscendingNode   -3.61165
		ArgOfPericenter 50.0871
		MeanAnomaly     -88.8828
	}
}

Comet	"C137"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.02482e-015
	Radius          0.192331
	InertiaMoment   0.397598

	Oblateness      0.0176113

	RotationPeriod  43.4588
	Obliquity       356.707
	EqAscendNode    122.99

	AbsMagn         12.6311
	SlopeParam      3.29561
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.509 0.502 0.495)

	Surface
	{
		SurfStyle       0.580517
		OceanStyle      0.580432
		Randomize      (0.177, 0.077, 0.363)
		colorDistMagn   0.583602
		colorDistFreq   2.80307e-005
		detailScale     5.25192
		colorConversion true
		snowLevel       2
		tropicLatitude  0.733484
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503904
		terraceProb     0.507237
		erosion         0
		montesMagn      0.688523
		montesFreq      3.56297
		montesSpiky     0.928825
		montesFraction  0.173899
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000112838
		hillsFraction   0.670645
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250208
		craterFreq      0.170831
		craterDensity   0.879829
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   670.135
		volcanoTemp     1231.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.171, 0.139, 0.000)
		colorShelf     (0.203, 0.176, 0.159, 0.000)
		colorBeach     (0.239, 0.206, 0.188, 0.000)
		colorDesert    (0.259, 0.221, 0.183, 0.000)
		colorLowland   (0.285, 0.236, 0.208, 0.000)
		colorUpland    (0.315, 0.286, 0.253, 0.000)
		colorRock      (0.341, 0.311, 0.272, 0.000)
		colorSnow      (0.371, 0.331, 0.287, 1.000)
		BumpHeight      0.173098
		BumpOffset      0.0346196
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0479151
		GasToDust   0.25
		Particles   1076
		GasBright   0.214725
		DustBright  0.338638
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.25587
		Period          11.9896
		Eccentricity    0.893777
		Inclination     133.228
		AscendingNode   -84.4235
		ArgOfPericenter 21.2754
		MeanAnomaly     -112.927
	}
}

Comet	"C138"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.56605e-011
	Radius          3.44709
	InertiaMoment   0.399527

	Oblateness      0.0143912

	RotationPeriod  41.6286
	Obliquity       309.912
	EqAscendNode    107.568

	AbsMagn         -0.549238
	SlopeParam      2.03922
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.655 0.653 0.651)

	Surface
	{
		SurfStyle       0.892509
		OceanStyle      0.669854
		Randomize      (-0.813, -0.556, -0.310)
		colorDistMagn   0.568583
		colorDistFreq   0.00849535
		detailScale     94.1286
		colorConversion true
		snowLevel       2
		tropicLatitude  0.830727
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.460829
		terraceProb     0.540059
		erosion         0
		montesMagn      0.488239
		montesFreq      3.07394
		montesSpiky     0.910759
		montesFraction  0.543593
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0320736
		hillsFraction   0.546331
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210809
		craterFreq      0.175338
		craterDensity   0.87985
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   136.57
		volcanoTemp     1563.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.229, 0.260, 0.050)
		colorShelf     (0.262, 0.268, 0.300, 0.040)
		colorBeach     (0.301, 0.307, 0.339, 0.030)
		colorDesert    (0.341, 0.346, 0.384, 0.020)
		colorLowland   (0.380, 0.385, 0.423, 0.030)
		colorUpland    (0.419, 0.424, 0.462, 0.050)
		colorRock      (0.459, 0.464, 0.514, 0.020)
		colorSnow      (0.459, 0.464, 0.514, 1.000)
		BumpHeight      3.10238
		BumpOffset      0.620476
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.529107
		GasToDust   0.25
		Particles   2048
		GasBright   0.106338
		DustBright  0.131511
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.63184
		Period          7.37647
		Eccentricity    0.914215
		Inclination     14.4658
		AscendingNode   109.701
		ArgOfPericenter 175.708
		MeanAnomaly     -137.391
	}
}

Comet	"C139"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.21122e-007
	Radius          75.1221
	InertiaMoment   0.398305

	Oblateness      0.0209917

	RotationPeriod  39.7817
	Obliquity       263.118
	EqAscendNode    92.1451

	AbsMagn         3.82829
	SlopeParam      5.72573
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.654 0.537 0.438)

	Surface
	{
		SurfStyle       0.530166
		OceanStyle      0.406276
		Randomize      (-0.970, 0.714, -0.826)
		colorDistMagn   0.521869
		colorDistFreq   1.94871
		detailScale     2051.33
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998865
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.330244
		terraceProb     0.123339
		erosion         0
		montesMagn      0.60648
		montesFreq      3.00732
		montesSpiky     0.910759
		montesFraction  0.603212
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.6268
		hillsFraction   0.647054
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235292
		craterFreq      0.212488
		craterDensity   0.773326
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   33.8424
		volcanoTemp     1473.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.183, 0.123, 0.000)
		colorShelf     (0.261, 0.188, 0.140, 0.000)
		colorBeach     (0.307, 0.220, 0.166, 0.000)
		colorDesert    (0.333, 0.236, 0.162, 0.000)
		colorLowland   (0.366, 0.252, 0.184, 0.000)
		colorUpland    (0.405, 0.306, 0.223, 0.000)
		colorRock      (0.438, 0.333, 0.241, 0.000)
		colorSnow      (0.477, 0.355, 0.254, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0044256
		DustBright  0.71791
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.17373
		Period          4.49969
		Eccentricity    0.826052
		Inclination     170.377
		AscendingNode   177.298
		ArgOfPericenter -69.2943
		MeanAnomaly     -91.8951
	}
}

Comet	"C140"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            3.72944e-015
	Radius          0.213517
	InertiaMoment   0.39995

	Oblateness      0.0173418

	RotationPeriod  37.9129
	Obliquity       216.324
	EqAscendNode    76.7225

	AbsMagn         5.67689
	SlopeParam      4.54299
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.455 0.450 0.448)

	Surface
	{
		SurfStyle       0.175394
		OceanStyle      0.135478
		Randomize      (-0.653, -0.835, 0.585)
		colorDistMagn   0.223486
		colorDistFreq   1.14499e-005
		detailScale     5.83043
		colorConversion true
		snowLevel       2
		tropicLatitude  0.953751
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606193
		terraceProb     0.167462
		erosion         0
		montesMagn      0.484716
		montesFreq      3.02776
		montesSpiky     0.940612
		montesFraction  0.614395
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00011155
		hillsFraction   0.585118
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232282
		craterFreq      0.279971
		craterDensity   0.822449
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   548.171
		volcanoTemp     1668.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.180, 0.179, 0.000)
		colorShelf     (0.193, 0.191, 0.190, 0.000)
		colorBeach     (0.205, 0.202, 0.202, 0.000)
		colorDesert    (0.216, 0.214, 0.213, 0.000)
		colorLowland   (0.227, 0.225, 0.224, 0.000)
		colorUpland    (0.239, 0.236, 0.235, 0.000)
		colorRock      (0.250, 0.247, 0.246, 0.000)
		colorSnow      (0.261, 0.259, 0.258, 1.000)
		BumpHeight      0.192165
		BumpOffset      0.038433
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0807409
		GasToDust   0.25
		Particles   1142
		GasBright   0.0265134
		DustBright  0.380309
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.69273
		Period          7.79313
		Eccentricity    0.90791
		Inclination     -53.8387
		AscendingNode   111.439
		ArgOfPericenter -10.0088
		MeanAnomaly     -16.3512
	}
}

Comet	"C141"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.88446e-011
	Radius          4.65047
	InertiaMoment   0.398845

	Oblateness      0.0255645

	RotationPeriod  36.0165
	Obliquity       169.529
	EqAscendNode    61.2999

	AbsMagn         7.11963
	SlopeParam      3.53511
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.781 0.716 0.677)

	Surface
	{
		SurfStyle       0.213314
		OceanStyle      0.958913
		Randomize      (0.593, -0.524, -0.171)
		colorDistMagn   0.499736
		colorDistFreq   0.0109934
		detailScale     126.989
		colorConversion true
		snowLevel       2
		tropicLatitude  0.208577
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535265
		terraceProb     0.355095
		erosion         0
		montesMagn      0.411861
		montesFreq      1.87556
		montesSpiky     0.893492
		montesFraction  0.174555
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0618217
		hillsFraction   0.582711
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246695
		craterFreq      0.270211
		craterDensity   0.887044
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   135.759
		volcanoTemp     1735.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.286, 0.271, 0.000)
		colorShelf     (0.332, 0.304, 0.288, 0.000)
		colorBeach     (0.351, 0.322, 0.305, 0.000)
		colorDesert    (0.371, 0.340, 0.322, 0.000)
		colorLowland   (0.390, 0.358, 0.339, 0.000)
		colorUpland    (0.410, 0.376, 0.355, 0.000)
		colorRock      (0.430, 0.394, 0.372, 0.000)
		colorSnow      (0.449, 0.411, 0.389, 1.000)
		BumpHeight      4.18542
		BumpOffset      0.837084
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.561933
		GasToDust   0.25
		Particles   2115
		GasBright   0.110716
		DustBright  0.780593
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.36778
		Period          12.8927
		Eccentricity    0.923535
		Inclination     177.468
		AscendingNode   56.9137
		ArgOfPericenter 75.7807
		MeanAnomaly     9.98045
	}
}

Comet	"C142"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            2.23092e-007
	Radius          83.4469
	InertiaMoment   0.397101

	Oblateness      0.0211818

	RotationPeriod  34.0863
	Obliquity       122.735
	EqAscendNode    45.8773

	AbsMagn         8.4532
	SlopeParam      2.38159
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.506 0.429 0.331)

	Surface
	{
		SurfStyle       0.619489
		OceanStyle      0.0633271
		Randomize      (0.492, 0.229, 0.630)
		colorDistMagn   0.435864
		colorDistFreq   5.99072
		detailScale     2278.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0.668177
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450104
		terraceProb     0.460604
		erosion         0
		montesMagn      0.485997
		montesFreq      3.24444
		montesSpiky     0.888801
		montesFraction  0.523553
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.6759
		hillsFraction   0.580736
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240189
		craterFreq      0.299055
		craterDensity   1.07332
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.6996
		volcanoTemp     1311.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.146, 0.093, 0.000)
		colorShelf     (0.202, 0.150, 0.106, 0.000)
		colorBeach     (0.238, 0.176, 0.126, 0.000)
		colorDesert    (0.258, 0.189, 0.122, 0.000)
		colorLowland   (0.283, 0.202, 0.139, 0.000)
		colorUpland    (0.314, 0.245, 0.169, 0.000)
		colorRock      (0.339, 0.266, 0.182, 0.000)
		colorSnow      (0.369, 0.283, 0.192, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.105522
		DustBright  0.470274
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.90897
		Period          9.33319
		Eccentricity    0.911705
		Inclination     -128.506
		AscendingNode   -51.7716
		ArgOfPericenter -28.4594
		MeanAnomaly     -41.9235
	}
}

Comet	"C143"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            6.86918e-015
	Radius          0.287896
	InertiaMoment   0.399312

	Oblateness      0.032089

	RotationPeriod  32.1151
	Obliquity       75.9408
	EqAscendNode    30.4547

	AbsMagn         9.84074
	SlopeParam      6.08702
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.576 0.571 0.566)

	Surface
	{
		SurfStyle       0.958696
		OceanStyle      0.475413
		Randomize      (0.240, 0.554, 0.805)
		colorDistMagn   0.561903
		colorDistFreq   6.93118e-005
		detailScale     7.86147
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990452
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470633
		terraceProb     0.25458
		erosion         0
		montesMagn      0.384983
		montesFreq      3.27514
		montesSpiky     0.976246
		montesFraction  0.409806
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000193505
		hillsFraction   0.494394
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264154
		craterFreq      0.26355
		craterDensity   0.994759
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   544.614
		volcanoTemp     927.202
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.200, 0.226, 0.050)
		colorShelf     (0.230, 0.234, 0.260, 0.040)
		colorBeach     (0.265, 0.268, 0.294, 0.030)
		colorDesert    (0.299, 0.303, 0.334, 0.020)
		colorLowland   (0.334, 0.337, 0.368, 0.030)
		colorUpland    (0.368, 0.371, 0.402, 0.050)
		colorRock      (0.403, 0.406, 0.447, 0.020)
		colorSnow      (0.403, 0.406, 0.447, 1.000)
		BumpHeight      0.259106
		BumpOffset      0.0518212
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.113567
		GasToDust   0.25
		Particles   1209
		GasBright   0.0630683
		DustBright  0.197214
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.05689
		Period          10.4388
		Eccentricity    0.957961
		Inclination     150.305
		AscendingNode   136.553
		ArgOfPericenter -78.9672
		MeanAnomaly     30.4903
	}
}

Comet	"C144"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            5.31282e-011
	Radius          5.16878
	InertiaMoment   0.397987

	Oblateness      0.027206

	RotationPeriod  30.0952
	Obliquity       29.1466
	EqAscendNode    15.0321

	AbsMagn         11.5044
	SlopeParam      4.78549
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.473 0.468 0.461)

	Surface
	{
		SurfStyle       0.237521
		OceanStyle      0.743293
		Randomize      (0.630, -0.571, 0.166)
		colorDistMagn   0.452194
		colorDistFreq   0.0162648
		detailScale     141.142
		colorConversion true
		snowLevel       2
		tropicLatitude  0.482348
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435499
		terraceProb     0.135666
		erosion         0
		montesMagn      0.586908
		montesFreq      2.96839
		montesSpiky     0.981284
		montesFraction  0.632041
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0729884
		hillsFraction   0.5113
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242917
		craterFreq      0.213581
		craterDensity   0.918812
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   111.181
		volcanoTemp     1684.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.187, 0.184, 0.000)
		colorShelf     (0.201, 0.199, 0.196, 0.000)
		colorBeach     (0.213, 0.210, 0.207, 0.000)
		colorDesert    (0.225, 0.222, 0.219, 0.000)
		colorLowland   (0.237, 0.234, 0.231, 0.000)
		colorUpland    (0.249, 0.246, 0.242, 0.000)
		colorRock      (0.260, 0.257, 0.254, 0.000)
		colorSnow      (0.272, 0.269, 0.265, 1.000)
		BumpHeight      4.6519
		BumpOffset      0.93038
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.594759
		GasToDust   0.25
		Particles   2181
		GasBright   0.224438
		DustBright  0.52033
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.11777
		Period          4.18177
		Eccentricity    0.918481
		Inclination     -152.989
		AscendingNode   -116.261
		ArgOfPericenter 119.274
		MeanAnomaly     17.5749
	}
}

Comet	"C145"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            4.10908e-007
	Radius          112.456
	InertiaMoment   0.399743

	Oblateness      0.042076

	RotationPeriod  28.0171
	Obliquity       342.352
	EqAscendNode    359.61

	AbsMagn         14.2774
	SlopeParam      3.76811
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.662 0.659 0.656)

	Surface
	{
		SurfStyle       0.608183
		OceanStyle      0.79069
		Randomize      (0.183, 0.479, -0.553)
		colorDistMagn   0.500202
		colorDistFreq   10.5893
		detailScale     3070.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.355119
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.555412
		terraceProb     0.270332
		erosion         0
		montesMagn      0.614686
		montesFreq      2.65902
		montesSpiky     0.846267
		montesFraction  0.833287
		dunesFraction   0
		hillsMagn       0
		hillsFreq       40.9047
		hillsFraction   0.675246
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246493
		craterFreq      0.460342
		craterDensity   0.87506
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.5053
		volcanoTemp     1539.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.224, 0.184, 0.000)
		colorShelf     (0.265, 0.231, 0.210, 0.000)
		colorBeach     (0.311, 0.270, 0.249, 0.000)
		colorDesert    (0.338, 0.290, 0.243, 0.000)
		colorLowland   (0.371, 0.310, 0.276, 0.000)
		colorUpland    (0.411, 0.376, 0.335, 0.000)
		colorRock      (0.444, 0.409, 0.361, 0.000)
		colorSnow      (0.483, 0.435, 0.381, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.154703
		DustBright  0.274552
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.67436
		Period          7.66665
		Eccentricity    0.876162
		Inclination     -4.58273
		AscendingNode   51.5242
		ArgOfPericenter -158.964
		MeanAnomaly     -118.286
	}
}

Comet	"C146"
{
	ParentBody     "RS 8476-1353-8-11843423-2"
	Class	       "Asteroid"

	Mass            1.26522e-014
	Radius          0.320158
	InertiaMoment   0.398591

	Oblateness      0.0368238

	RotationPeriod  25.8703
	Obliquity       295.558
	EqAscendNode    344.187

	AbsMagn         2.41928
	SlopeParam      2.682
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.721 0.719 0.715)

	Surface
	{
		SurfStyle       0.724207
		OceanStyle      0.129833
		Randomize      (-0.899, -0.258, 0.932)
		colorDistMagn   0.0365987
		colorDistFreq   5.65371e-005
		detailScale     8.74245
		colorConversion true
		snowLevel       2
		tropicLatitude  0.764697
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.681896
		terraceProb     0.327744
		erosion         0
		montesMagn      0.439587
		montesFreq      3.14088
		montesSpiky     0.792936
		montesFraction  0.44588
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000303299
		hillsFraction   0.613126
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253083
		craterFreq      0.180586
		craterDensity   0.930511
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   446.259
		volcanoTemp     1374.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.244, 0.200, 0.000)
		colorShelf     (0.288, 0.251, 0.229, 0.000)
		colorBeach     (0.339, 0.295, 0.272, 0.000)
		colorDesert    (0.368, 0.316, 0.264, 0.000)
		colorLowland   (0.404, 0.338, 0.300, 0.000)
		colorUpland    (0.447, 0.410, 0.364, 0.000)
		colorRock      (0.483, 0.445, 0.393, 0.000)
		colorSnow      (0.526, 0.474, 0.414, 1.000)
		BumpHeight      0.288142
		BumpOffset      0.0576284
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.146393
		GasToDust   0.25
		Particles   1275
		GasBright   0.383263
		DustBright  0.530479
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.84934
		Period          8.89932
		Eccentricity    0.871548
		Inclination     -16.2253
		AscendingNode   -155.926
		ArgOfPericenter 82.5044
		MeanAnomaly     112.687
	}
}

