Star	"RS 8476-1353-8-11843423-103"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "M8.4 V"
	Luminosity      0.000513133
	MassSol         0.0874413
	RadSol          0.0877551
	Teff            3450

	Age             4.6753

	InertiaMoment   0.0810123

	RotationPeriod  11.1584
	Obliquity       279.172
	EqAscendNode    179.149

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.540 0.243)

	Surface
	{
		Randomize      (-0.915, -0.301, -0.606)
		colorDistMagn   0.487651
		colorDistFreq   6.28564
		detailScale     157095
		colorConversion true
		tropicLatitude  0.566
		icecapLatitude  1.044
		mareFreq        18.333
		mareDensity     0.0144078
		erosion         1
		montesFreq      486.962
		dunesMagn       0.566139
		hillsMagn       0.03
		hillsFreq       486.962
		craterOctaves   0
		BumpHeight      177.779
		BumpOffset      177.779
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
		Height          610.775
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
		Radius      337816
		Period      0.0278946
		Brightness  0.5
		RayDensity  2.39727
		RayCurv     3.5753
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     279.172
		AscendingNode   179.149
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Planet	"1"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "IceGiant"

	Mass            42.9742
	Radius          27693.9
	InertiaMoment   0.240564

	Oblateness      0.00149006

	RotationPeriod  42.2302
	Obliquity       0.196123
	EqAscendNode    -131.399

	AlbedoBond      0.422095
	AlbedoGeom      0.506514
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.270367
		Randomize      (-0.371, -0.117, -0.502)
		detailScale     71230.4
		colorConversion true
		tropicLatitude  0.00282613
		icecapLatitude  0.902826
		mainFreq        0.0166334
		venusFreq       6.15799
		venusMagn       0.341423
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.583248
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      5.20627
		twistMagn       1.39694
		cycloneMagn     7.02773
		cycloneFreq     0.163061
		cycloneDensity  0.151485
		cycloneOctaves  2
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
		BumpHeight      13.247
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          65.9863
		BumpHeight      51.0955
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.30728
		mainOctaves     10
		Coverage        0.110473
		twistZones      5.20627
		twistMagn       1.39694
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          276.939
		Density         5448.49
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.00351823
		Saturation      0.713691

		Composition
		{
			H2    	91.6101
			He    	8.00767
			CH4   	0.306928
			N2    	0.0376921
			NH3   	0.0233148
			O2    	0.00697217
			C2H2  	0.00308445
			C2H4  	0.00125552
			Ne    	0.00121658
			Ar    	0.000911757
			C2H6  	0.000591118
			C3H8  	0.000307815
		}
	}

	Aurora
	{
		Height      177.507
		NorthLat    61.6393
		NorthLon    -36.5442
		NorthRadius 6409.26
		NorthWidth  7629.94
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -34.0794
		SouthLon    150.934
		SouthRadius 9138.85
		SouthWidth  10017.3
		SouthRings  2
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
		SemiMajorAxis   0.0165903
		Period          0.00722112
		Eccentricity    0.0868632
		Inclination     0.196123
		AscendingNode   -131.399
		ArgOfPericenter 245.031
		MeanAnomaly     170.304
	}
}

DwarfMoon	"1.D1"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            1.79211e-011
	Radius          1.8354
	InertiaMoment   0.399607

	Oblateness      0.246802

	Obliquity       0.00912816
	EqAscendNode    -170.388
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.589 0.586 0.582)

	Surface
	{
		SurfStyle       0.538252
		OceanStyle      0.213412
		Randomize      (-0.964, 0.600, 0.681)
		colorDistMagn   0.548781
		colorDistFreq   0.000677578
		detailScale     50.1187
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.329987
		terraceProb     0.183935
		erosion         0
		montesMagn      0.340429
		montesFreq      3.85353
		montesSpiky     0.901951
		montesFraction  0.326594
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00790571
		hillsFraction   0.397122
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224541
		craterFreq      0.185219
		craterDensity   0.908098
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   67.9759
		volcanoTemp     1458.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.199, 0.163, 0.000)
		colorShelf     (0.236, 0.205, 0.186, 0.000)
		colorBeach     (0.277, 0.240, 0.221, 0.000)
		colorDesert    (0.301, 0.258, 0.215, 0.000)
		colorLowland   (0.330, 0.276, 0.244, 0.000)
		colorUpland    (0.365, 0.334, 0.297, 0.000)
		colorRock      (0.395, 0.364, 0.320, 0.000)
		colorSnow      (0.430, 0.387, 0.338, 1.000)
		BumpHeight      1.65186
		BumpOffset      0.330372
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
		SemiMajorAxis   0.000281449
		Period          0.000416559
		Eccentricity    3.56767e-006
		Inclination     0.00912816
		AscendingNode   -170.388
		ArgOfPericenter 139.67
		MeanAnomaly     26.0864
	}
}

DwarfMoon	"1.D2"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            3.46488e-011
	Radius          5.04122
	InertiaMoment   0.397403

	Oblateness      0.249

	Obliquity       0.00894951
	EqAscendNode    109.667
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.659 0.656 0.652)

	Surface
	{
		SurfStyle       0.275115
		OceanStyle      0.58706
		Randomize      (-0.827, 0.691, -0.167)
		colorDistMagn   0.468239
		colorDistFreq   0.00874668
		detailScale     137.659
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.47369
		terraceProb     0.272044
		erosion         0
		montesMagn      0.461257
		montesFreq      3.65883
		montesSpiky     0.999413
		montesFraction  0.252225
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0639997
		hillsFraction   0.524157
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234224
		craterFreq      0.275804
		craterDensity   0.720456
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   134.276
		volcanoTemp     1682.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.262, 0.261, 0.000)
		colorShelf     (0.280, 0.279, 0.277, 0.000)
		colorBeach     (0.296, 0.295, 0.293, 0.000)
		colorDesert    (0.313, 0.311, 0.310, 0.000)
		colorLowland   (0.329, 0.328, 0.326, 0.000)
		colorUpland    (0.346, 0.344, 0.342, 0.000)
		colorRock      (0.362, 0.361, 0.358, 0.000)
		colorSnow      (0.379, 0.377, 0.375, 1.000)
		BumpHeight      4.5371
		BumpOffset      0.90742
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
		SemiMajorAxis   0.000495252
		Period          0.000972333
		Eccentricity    7.27389e-005
		Inclination     0.00894951
		AscendingNode   109.667
		ArgOfPericenter -173.669
		MeanAnomaly     -15.6035
	}
}

DwarfMoon	"1.D3"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            6.19e-011
	Radius          3.17874
	InertiaMoment   0.398787

	Oblateness      0.0461896

	Obliquity       0.00230409
	EqAscendNode    -132.168
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.672 0.667 0.663)

	Surface
	{
		SurfStyle       0.179161
		OceanStyle      0.0152271
		Randomize      (0.641, 0.240, -0.951)
		colorDistMagn   0.835638
		colorDistFreq   0.00723756
		detailScale     86.8007
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532242
		terraceProb     0.301285
		erosion         0
		montesMagn      0.667477
		montesFreq      2.54059
		montesSpiky     0.940454
		montesFraction  0.249574
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0261225
		hillsFraction   0.630397
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273071
		craterFreq      0.262798
		craterDensity   0.883934
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.3454
		volcanoTemp     1835.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.267, 0.265, 0.000)
		colorShelf     (0.285, 0.284, 0.282, 0.000)
		colorBeach     (0.302, 0.300, 0.298, 0.000)
		colorDesert    (0.319, 0.317, 0.315, 0.000)
		colorLowland   (0.336, 0.334, 0.331, 0.000)
		colorUpland    (0.353, 0.350, 0.348, 0.000)
		colorRock      (0.369, 0.367, 0.364, 0.000)
		colorSnow      (0.386, 0.384, 0.381, 1.000)
		BumpHeight      2.86086
		BumpOffset      0.572172
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
		SemiMajorAxis   0.000563168
		Period          0.00117905
		Eccentricity    1.51889e-005
		Inclination     0.00230409
		AscendingNode   -132.168
		ArgOfPericenter -139.928
		MeanAnomaly     -106.525
	}
}

DwarfMoon	"1.D4"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            0.000132838
	Radius          306.362
	InertiaMoment   0.39808

	Oblateness      0.0168216

	Obliquity       0.566117
	EqAscendNode    110.267
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.801 0.797 0.795)

	Surface
	{
		SurfStyle       0.91412
		OceanStyle      0.0750384
		Randomize      (-0.260, -0.445, 0.577)
		colorDistMagn   0.443438
		colorDistFreq   39.0576
		detailScale     8365.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0112938
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562565
		terraceProb     0.523237
		erosion         0
		montesMagn      0.492929
		montesFreq      2.39129
		montesSpiky     0.972891
		montesFraction  0.256569
		dunesFraction   0
		hillsMagn       0
		hillsFreq       264.984
		hillsFraction   0.631768
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24589
		craterFreq      2.95399
		craterDensity   0.824078
		craterOctaves   13.4618
		volcanoActivity 2
		volcanoFlows    0
		volcanoRadius   4.16755
		volcanoTemp     1481.69
		lavaCoverTidal  0.115906
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.279, 0.318, 0.050)
		colorShelf     (0.320, 0.327, 0.366, 0.040)
		colorBeach     (0.368, 0.374, 0.413, 0.030)
		colorDesert    (0.416, 0.422, 0.469, 0.020)
		colorLowland   (0.464, 0.470, 0.517, 0.030)
		colorUpland    (0.512, 0.518, 0.565, 0.050)
		colorRock      (0.560, 0.566, 0.628, 0.020)
		colorSnow      (0.560, 0.566, 0.628, 1.000)
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
		SemiMajorAxis   0.000588733
		Period          0.00126024
		Eccentricity    0.0380779
		Inclination     0.566117
		AscendingNode   110.267
		ArgOfPericenter -76.2478
		MeanAnomaly     149.271
	}
}

Planet	"2"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Desert"

	Mass            0.163689
	Radius          3541.08
	InertiaMoment   0.332241

	RotationPeriod  314.245
	Obliquity       0.2364
	EqAscendNode    -23.2084

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.752 0.749 0.748)

	Surface
	{
		SurfStyle       0.0088386
		OceanStyle      0.30288
		Randomize      (0.494, 0.694, -0.881)
		colorDistMagn   0.041665
		colorDistFreq   425.208
		detailScale     9107.85
		colorConversion true
		seaLevel        0.161457
		snowLevel       2
		tropicLatitude  0.00808243
		icecapLatitude  0.808224
		icecapHeight    0.174437
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.710934
		venusFreq       0.944266
		venusMagn       0.287947
		mareFreq        1.09429
		mareDensity     0.0565731
		terraceProb     0.10267
		erosion         0
		montesMagn      0.196629
		montesFreq      146.086
		montesSpiky     0.897194
		montesFraction  0.683461
		dunesMagn       0.0467247
		dunesFreq       31.1447
		dunesFraction   0.998161
		hillsMagn       0.146126
		hillsFreq       463.82
		hillsFraction   0
		hills2Fraction  0
		riversMagn      54.756
		riversFreq      2.23089
		riversSin       6.39569
		riversOctaves   0
		canyonsMagn     0.0498933
		canyonsFreq     97.9429
		canyonFraction  0
		cracksMagn      0.130547
		cracksFreq      0.288449
		cracksOctaves   0
		craterMagn      0.656265
		craterFreq      12.2106
		craterDensity   0.449866
		craterOctaves   5.65416
		volcanoMagn     0.64969
		volcanoFreq     3.62652
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.396329
		volcanoRadius   0.414706
		volcanoTemp     1680.55
		lavaCoverTidal  0.165602
		lavaCoverSun    0
		lavaCoverYoung  0
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
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.578499
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
		Height          53.5773
		Density         0.0421501
		Pressure        0.0218215
		Greenhouse      0.644628
		Bright          8.41317
		Opacity         1
		SkyLight        2.80439
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	85.2626
			CH4   	10.7524
			SO2   	1.43584
			NH3   	1.40544
			C2H4  	0.371234
			H2S   	0.267496
			C2H2  	0.247918
			H2O   	0.1777
			N2    	0.0381662
			C3H8  	0.0217434
			C2H6  	0.0187731
			CO    	0.000613938
			Ne    	1.52866e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0303997
		Period          0.0179245
		Eccentricity    0.0992133
		Inclination     0.2364
		AscendingNode   -23.2084
		ArgOfPericenter 161.459
		MeanAnomaly     342.84
	}
}

DwarfMoon	"2.D1"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            4.18182e-009
	Radius          22.0645
	InertiaMoment   0.399181

	Oblateness      0.249

	Obliquity       -0.00443095
	EqAscendNode    152.049
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.738 0.665 0.559)

	Surface
	{
		SurfStyle       0.0510071
		OceanStyle      0.831767
		Randomize      (-0.595, -0.956, -0.042)
		colorDistMagn   0.738619
		colorDistFreq   0.404676
		detailScale     602.509
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.619666
		terraceProb     0.178938
		erosion         0
		montesMagn      0.472502
		montesFreq      3.12958
		montesSpiky     0.892123
		montesFraction  0.695687
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.171
		hillsFraction   0.622508
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257264
		craterFreq      0.181902
		craterDensity   0.778797
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   53.4956
		volcanoTemp     1848.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.266, 0.224, 0.000)
		colorShelf     (0.314, 0.282, 0.238, 0.000)
		colorBeach     (0.332, 0.299, 0.252, 0.000)
		colorDesert    (0.351, 0.316, 0.266, 0.000)
		colorLowland   (0.369, 0.332, 0.280, 0.000)
		colorUpland    (0.388, 0.349, 0.294, 0.000)
		colorRock      (0.406, 0.366, 0.308, 0.000)
		colorSnow      (0.424, 0.382, 0.322, 1.000)
		BumpHeight      19.8581
		BumpOffset      3.97162
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
		SemiMajorAxis   7.26706e-005
		Period          0.00088554
		Eccentricity    2.91537e-005
		Inclination     -0.00443095
		AscendingNode   152.049
		ArgOfPericenter -139.945
		MeanAnomaly     -108.556
	}
}

DwarfMoon	"2.D2"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            5.76824e-009
	Radius          12.2335
	InertiaMoment   0.395712

	Oblateness      0.0309166

	Obliquity       0.0038173
	EqAscendNode    -174.194
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.788 0.741 0.678)

	Surface
	{
		SurfStyle       0.690226
		OceanStyle      0.263784
		Randomize      (-0.500, -0.660, 0.185)
		colorDistMagn   0.935665
		colorDistFreq   0.0188817
		detailScale     334.057
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.282276
		terraceProb     0.12463
		erosion         0
		montesMagn      0.31951
		montesFreq      2.47976
		montesSpiky     0.813299
		montesFraction  0.630197
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.399121
		hillsFraction   0.720407
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243538
		craterFreq      0.226886
		craterDensity   1.01977
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.2544
		volcanoTemp     1461.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.252, 0.190, 0.000)
		colorShelf     (0.315, 0.259, 0.217, 0.000)
		colorBeach     (0.370, 0.304, 0.257, 0.000)
		colorDesert    (0.402, 0.326, 0.251, 0.000)
		colorLowland   (0.441, 0.348, 0.285, 0.000)
		colorUpland    (0.488, 0.422, 0.346, 0.000)
		colorRock      (0.528, 0.459, 0.373, 0.000)
		colorSnow      (0.575, 0.489, 0.393, 1.000)
		BumpHeight      11.0102
		BumpOffset      2.20204
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
		SemiMajorAxis   8.50231e-005
		Period          0.00112066
		Eccentricity    3.25614e-005
		Inclination     0.0038173
		AscendingNode   -174.194
		ArgOfPericenter 44.1522
		MeanAnomaly     -132.46
	}
}

DwarfMoon	"2.D3"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            7.915e-009
	Radius          30.1137
	InertiaMoment   0.398252

	Oblateness      0.231334

	Obliquity       0.00180284
	EqAscendNode    45.0041
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.519 0.514 0.508)

	Surface
	{
		SurfStyle       0.825919
		OceanStyle      0.351428
		Randomize      (0.696, 0.671, -0.935)
		colorDistMagn   0.423351
		colorDistFreq   0.710383
		detailScale     822.304
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.267581
		terraceProb     0.420807
		erosion         0
		montesMagn      0.54348
		montesFreq      3.12151
		montesSpiky     0.867093
		montesFraction  0.883244
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.32734
		hillsFraction   0.776618
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230649
		craterFreq      0.180189
		craterDensity   0.806534
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   53.0694
		volcanoTemp     1707.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.175, 0.142, 0.000)
		colorShelf     (0.208, 0.180, 0.163, 0.000)
		colorBeach     (0.244, 0.211, 0.193, 0.000)
		colorDesert    (0.265, 0.226, 0.188, 0.000)
		colorLowland   (0.291, 0.242, 0.213, 0.000)
		colorUpland    (0.322, 0.293, 0.259, 0.000)
		colorRock      (0.348, 0.319, 0.279, 0.000)
		colorSnow      (0.379, 0.339, 0.295, 1.000)
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
		SemiMajorAxis   9.65995e-005
		Period          0.00135716
		Eccentricity    6.18876e-005
		Inclination     0.00180284
		AscendingNode   45.0041
		ArgOfPericenter 126.904
		MeanAnomaly     -122.094
	}
}

DwarfMoon	"2.D4"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            1.08159e-008
	Radius          17.4495
	InertiaMoment   0.399315

	Oblateness      0.00274051

	RotationPeriod  41.3254
	Obliquity       74.8995
	EqAscendNode    -168.969

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.555 0.499 0.428)

	Surface
	{
		SurfStyle       0.0937124
		OceanStyle      0.949587
		Randomize      (-0.800, 0.544, 0.044)
		colorDistMagn   0.690184
		colorDistFreq   0.185654
		detailScale     476.487
		colorConversion true
		snowLevel       2
		tropicLatitude  0.184795
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.3651
		terraceProb     0.174213
		erosion         0
		montesMagn      0.683782
		montesFreq      2.86238
		montesSpiky     0.785482
		montesFraction  0.422949
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.481252
		hillsFraction   0.74444
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253406
		craterFreq      0.197259
		craterDensity   0.897033
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.3061
		volcanoTemp     1688.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.199, 0.171, 0.000)
		colorShelf     (0.236, 0.212, 0.182, 0.000)
		colorBeach     (0.250, 0.224, 0.192, 0.000)
		colorDesert    (0.264, 0.237, 0.203, 0.000)
		colorLowland   (0.278, 0.249, 0.214, 0.000)
		colorUpland    (0.292, 0.262, 0.225, 0.000)
		colorRock      (0.306, 0.274, 0.235, 0.000)
		colorSnow      (0.319, 0.287, 0.246, 1.000)
		BumpHeight      15.7045
		BumpOffset      3.14091
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
		SemiMajorAxis   0.000106518
		Period          0.00157146
		Eccentricity    0.150306
		Inclination     74.8995
		AscendingNode   -168.969
		ArgOfPericenter -111.45
		MeanAnomaly     163.074
	}
}

Planet	"3"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Selena"

	Mass            0.781267
	Radius          7550.94
	InertiaMoment   0.327198

	Obliquity       1.01134
	EqAscendNode    -117.613
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.527 0.523 0.517)

	Surface
	{
		SurfStyle       0.769522
		OceanStyle      0.145195
		Randomize      (0.761, 0.103, 0.404)
		colorDistMagn   0.0757925
		colorDistFreq   812.149
		detailScale     19421.4
		colorConversion true
		drivenDarkening 0
		seaLevel        0.165714
		snowLevel       2
		tropicLatitude  0.0182821
		icecapLatitude  0.654998
		icecapHeight    0.184879
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.84972
		venusFreq       0.950555
		venusMagn       0
		mareFreq        1.34238
		mareDensity     0.0464151
		terraceProb     0.127403
		erosion         0
		montesMagn      0.23463
		montesFreq      327.388
		montesSpiky     0.942245
		montesFraction  0.508399
		dunesMagn       0.0477972
		dunesFreq       10078
		dunesFraction   0.777191
		hillsMagn       0.138031
		hillsFreq       801.073
		hillsFraction   0.499462
		hills2Fraction  0
		riversMagn      58.9895
		riversFreq      3.0779
		riversSin       5.13534
		riversOctaves   0
		canyonsMagn     0.391782
		canyonsFreq     2.33947
		canyonFraction  0.75621
		cracksMagn      0.0358392
		cracksFreq      2.03822
		cracksOctaves   0
		craterMagn      0.584603
		craterFreq      21.5946
		craterDensity   0.755657
		craterOctaves   12.1655
		craterRayedFactor 0.13682
		volcanoMagn     0.776577
		volcanoFreq     3.37611
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.189166
		volcanoRadius   0.376827
		volcanoTemp     1574.06
		lavaCoverTidal  0.0713251
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.332, 0.319, 0.248, 0.000)
		colorDesert    (0.353, 0.324, 0.254, 0.000)
		colorLowland   (0.290, 0.240, 0.202, 0.000)
		colorUpland    (0.411, 0.371, 0.269, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.989308
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
		Height          128.917
		Density         0.00106916
		Pressure        0.000426203
		Greenhouse      0.0991719
		Bright          4.03467
		Opacity         0
		SkyLight        1.34489
		Hue             0.0354142
		Saturation      1

		Composition
		{
			CO2   	81.1741
			NH3   	12.4104
			H2    	2.51711
			CH4   	1.34076
			SO2   	0.997334
			H2S   	0.586678
			N2    	0.53355
			C2H2  	0.263943
			H2O   	0.114831
			C2H4  	0.0344984
			C3H8  	0.0141611
			C2H6  	0.0122718
			Ar    	0.000162228
			CO    	0.000118311
			Ne    	2.85661e-005
		}
	}

	Aurora
	{
		Height      73.5695
		NorthLat    67.2955
		NorthLon    -126.134
		NorthRadius 2442.54
		NorthWidth  1579.09
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -66.2466
		SouthLon    53.8757
		SouthRadius 1784.74
		SouthWidth  1764.66
		SouthRings  2
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
		SemiMajorAxis   0.0518984
		Period          0.0399822
		Eccentricity    0.045482
		Inclination     1.01134
		AscendingNode   -117.613
		ArgOfPericenter 66.8776
		MeanAnomaly     238.26
	}
}

DwarfMoon	"3.D1"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            2.0789e-007
	Radius          83.5256
	InertiaMoment   0.398713

	Oblateness      0.249

	Obliquity       0.00460207
	EqAscendNode    -41.6214
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.586 0.442 0.364)

	Surface
	{
		SurfStyle       0.132381
		OceanStyle      0.0176109
		Randomize      (0.323, -0.404, 0.504)
		colorDistMagn   0.682759
		colorDistFreq   3.5874
		detailScale     2280.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.71992
		terraceProb     0.225494
		erosion         0
		montesMagn      0.552373
		montesFreq      3.57887
		montesSpiky     0.975539
		montesFraction  0.574269
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.4866
		hillsFraction   0.685313
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213701
		craterFreq      0.241697
		craterDensity   0.844155
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.7216
		volcanoTemp     1483.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.177, 0.146, 0.000)
		colorShelf     (0.249, 0.188, 0.155, 0.000)
		colorBeach     (0.264, 0.199, 0.164, 0.000)
		colorDesert    (0.279, 0.210, 0.173, 0.000)
		colorLowland   (0.293, 0.221, 0.182, 0.000)
		colorUpland    (0.308, 0.232, 0.191, 0.000)
		colorRock      (0.322, 0.243, 0.200, 0.000)
		colorSnow      (0.337, 0.254, 0.209, 1.000)
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
		SemiMajorAxis   0.000113937
		Period          0.000795747
		Eccentricity    8.42625e-005
		Inclination     0.00460207
		AscendingNode   -41.6214
		ArgOfPericenter -0.673798
		MeanAnomaly     10.564
	}
}

DwarfMoon	"3.D2"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            2.8776e-007
	Radius          89.3187
	InertiaMoment   0.399672

	Oblateness      0.249

	Obliquity       -0.00570462
	EqAscendNode    141.432
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.571 0.509 0.388)

	Surface
	{
		SurfStyle       0.618778
		OceanStyle      0.0937626
		Randomize      (-0.016, 0.677, 0.818)
		colorDistMagn   0.994356
		colorDistFreq   6.57362
		detailScale     2439
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.385176
		terraceProb     0.320891
		erosion         0
		montesMagn      0.49055
		montesFreq      2.98519
		montesSpiky     0.935562
		montesFraction  0.575619
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.0482
		hillsFraction   0.585439
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240284
		craterFreq      0.222148
		craterDensity   0.922996
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.1056
		volcanoTemp     1513.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.173, 0.109, 0.000)
		colorShelf     (0.228, 0.178, 0.124, 0.000)
		colorBeach     (0.268, 0.209, 0.147, 0.000)
		colorDesert    (0.291, 0.224, 0.143, 0.000)
		colorLowland   (0.320, 0.239, 0.163, 0.000)
		colorUpland    (0.354, 0.290, 0.198, 0.000)
		colorRock      (0.383, 0.315, 0.213, 0.000)
		colorSnow      (0.417, 0.336, 0.225, 1.000)
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
		SemiMajorAxis   0.000118042
		Period          0.000839141
		Eccentricity    4.26067e-005
		Inclination     -0.00570462
		AscendingNode   141.432
		ArgOfPericenter -63.0285
		MeanAnomaly     149.581
	}
}

DwarfMoon	"3.D3"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            4.01196e-007
	Radius          125.15
	InertiaMoment   0.397546

	Oblateness      0.249

	Obliquity       0.0140861
	EqAscendNode    40.6201
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.693 0.690 0.687)

	Surface
	{
		SurfStyle       0.295832
		OceanStyle      0.787207
		Randomize      (0.805, -0.816, 0.867)
		colorDistMagn   0.62736
		colorDistFreq   3.58188
		detailScale     3417.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.540485
		terraceProb     0.283219
		erosion         0
		montesMagn      0.533964
		montesFreq      2.40385
		montesSpiky     0.968308
		montesFraction  0.539507
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.0933
		hillsFraction   0.647492
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252545
		craterFreq      0.365277
		craterDensity   0.848249
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   30.9784
		volcanoTemp     1430.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.276, 0.275, 0.000)
		colorShelf     (0.294, 0.293, 0.292, 0.000)
		colorBeach     (0.312, 0.310, 0.309, 0.000)
		colorDesert    (0.329, 0.328, 0.326, 0.000)
		colorLowland   (0.346, 0.345, 0.344, 0.000)
		colorUpland    (0.364, 0.362, 0.361, 0.000)
		colorRock      (0.381, 0.379, 0.378, 0.000)
		colorSnow      (0.398, 0.397, 0.395, 1.000)
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
		SemiMajorAxis   0.00014479
		Period          0.00113996
		Eccentricity    1.7077e-005
		Inclination     0.0140861
		AscendingNode   40.6201
		ArgOfPericenter 29.7682
		MeanAnomaly     160.346
	}
}

DwarfMoon	"3.D4"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            5.64235e-007
	Radius          122.702
	InertiaMoment   0.398863

	Oblateness      0.0807846

	Obliquity       2.53652
	EqAscendNode    132.693
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.762 0.760 0.759)

	Surface
	{
		SurfStyle       0.407335
		OceanStyle      0.361918
		Randomize      (0.272, -0.934, 0.380)
		colorDistMagn   0.445284
		colorDistFreq   9.90816
		detailScale     3350.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0355066
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427245
		terraceProb     0.26241
		erosion         0
		montesMagn      0.613124
		montesFreq      4.10542
		montesSpiky     0.961832
		montesFraction  0.430774
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.0301
		hillsFraction   0.590982
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216737
		craterFreq      0.462681
		craterDensity   1.04773
		craterOctaves   15
		volcanoActivity 1.78264
		volcanoFlows    0
		volcanoRadius   25.611
		volcanoTemp     1406.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.304, 0.304, 0.000)
		colorShelf     (0.324, 0.323, 0.323, 0.000)
		colorBeach     (0.343, 0.342, 0.342, 0.000)
		colorDesert    (0.362, 0.361, 0.361, 0.000)
		colorLowland   (0.381, 0.380, 0.380, 0.000)
		colorUpland    (0.400, 0.399, 0.399, 0.000)
		colorRock      (0.419, 0.418, 0.418, 0.000)
		colorSnow      (0.438, 0.437, 0.436, 1.000)
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
		SemiMajorAxis   0.000227137
		Period          0.00223981
		Eccentricity    0.306866
		Inclination     2.53652
		AscendingNode   132.693
		ArgOfPericenter -43.1392
		MeanAnomaly     -85.7562
	}
}

Planet	"4"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Oceania"

	Mass            3.74154
	Radius          11934.1
	InertiaMoment   0.328908

	Obliquity       -0.287165
	EqAscendNode    -105.242
	TidalLocked     true

	AlbedoBond      0.390967
	AlbedoGeom      0.469161
	Brightness      2
	Color          (0.722 0.563 0.352)

	Surface
	{
		SurfStyle       0.528813
		OceanStyle      0.758568
		Randomize      (-0.157, -0.609, 0.074)
		colorDistMagn   0.0696571
		colorDistFreq   1604.46
		detailScale     30695.2
		colorConversion true
		seaLevel        0.971578
		snowLevel       2
		tropicLatitude  0.00608882
		icecapLatitude  10
		icecapHeight    1.01547
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.971177
		venusFreq       0.949754
		venusMagn       0
		mareFreq        0
		mareDensity     0
		terraceProb     0.479452
		erosion         0
		montesMagn      0.175026
		montesFreq      606.101
		montesSpiky     0.957618
		montesFraction  0.575522
		dunesMagn       0.053546
		dunesFreq       107.804
		dunesFraction   0.737671
		hillsMagn       0.12088
		hillsFreq       1347.41
		hillsFraction   0.254139
		hills2Fraction  0.194303
		riversMagn      51.8266
		riversFreq      2.04338
		riversSin       5.49763
		riversOctaves   0
		canyonsMagn     0.0520232
		canyonsFreq     293.488
		canyonFraction  0.534607
		cracksMagn      0.132743
		cracksFreq      0.928478
		cracksOctaves   0
		craterMagn      0.0147057
		craterFreq      93.7674
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.76026
		volcanoFreq     16.4851
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0
		volcanoRadius   1.37376
		volcanoTemp     1416.93
		lavaCoverTidal  0.0161322
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      1
		twistMagn       3.5
		cycloneMagn     0.814763
		cycloneDensity  0.449757
		colorSea       (0.040, 0.200, 0.200, 1.000)
		colorShelf     (0.150, 0.370, 0.370, 1.000)
		colorBeach     (0.950, 0.950, 0.950, 1.308)
		colorDesert    (0.770, 0.770, 0.470, 1.308)
		colorLowland   (0.880, 0.880, 0.880, 1.308)
		colorUpland    (1.000, 1.000, 1.000, 1.308)
		colorRock      (1.000, 1.000, 1.000, 1.308)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		BumpHeight      145.642
		BumpOffset      141.503
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          33.8262
		BumpHeight      5.25066
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.930225
		mainOctaves     10
		Coverage        0.318278
		twistZones      1
		twistMagn       3.5
	}

	Clouds
	{
		Height          67.6533
		BumpHeight      5.98026
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.930225
		mainOctaves     10
		Coverage        0.318278
		twistZones      1
		twistMagn       3.5
	}

	Ocean
	{
		Height          141.503
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          247.886
		Density         127.454
		Pressure        242.064
		Greenhouse      383.143
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0204295
		Saturation      0.540859

		Composition
		{
			H2O   	82.2202
			CO2   	14.6866
			SO2   	3.0415
			N2    	0.0401332
			CO    	0.00999685
			Ar    	0.000929875
			He    	0.000580777
			Ne    	1.36272e-005
		}
	}

	Aurora
	{
		Height      127.802
		NorthLat    59.3246
		NorthLon    -9.96371
		NorthRadius 2907.45
		NorthWidth  2428.5
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -61.3306
		SouthLon    151.781
		SouthRadius 3165.07
		SouthWidth  2678.07
		SouthRings  5
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     15347
		OuterRadius     19883.3
		RotationPeriod  3.34878
		RotationOffset  0
		FrontBright     0.939406
		BackBright      0.674834
		Density         0.533499
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0780953
		Period          0.0737992
		Eccentricity    0.0395001
		Inclination     -0.287165
		AscendingNode   -105.242
		ArgOfPericenter 187.51
		MeanAnomaly     342.55
	}
}

Planet	"5"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "IceGiant"

	Mass            18.849
	Radius          21446.4
	InertiaMoment   0.227208

	Obliquity       2.06423
	EqAscendNode    -116.203
	TidalLocked     true

	AlbedoBond      0.497151
	AlbedoGeom      0.596581
	Brightness      2
	Color          (0.477 0.407 0.262)

	Surface
	{
		SurfStyle       0.853946
		Randomize      (0.763, 0.735, -0.818)
		detailScale     55161.4
		colorConversion true
		tropicLatitude  0.0380603
		icecapLatitude  0.93806
		mainFreq        0.0253863
		venusFreq       4.51465
		venusMagn       0.347713
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      7.35005
		twistMagn       0.894256
		cycloneMagn     12.9763
		cycloneFreq     0.25976
		cycloneDensity  0.106078
		cycloneOctaves  2
		colorLayer0    (0.200, 0.260, 0.330, 1.000)
		colorLayer1    (0.250, 0.330, 0.450, 1.000)
		colorLayer2    (0.220, 0.380, 0.560, 1.000)
		colorLayer3    (0.260, 0.430, 0.530, 1.000)
		colorLayer4    (0.240, 0.430, 0.630, 1.000)
		colorLayer5    (0.240, 0.510, 0.780, 1.000)
		colorLayer6    (0.340, 0.580, 0.750, 1.000)
		colorLayer7    (1.000, 1.000, 1.000, 1.000)
		colorLowPlants (0.240, 0.430, 0.630, 1.000)
		colorUpPlants  (0.240, 0.510, 0.780, 1.000)
		BumpHeight      15.4898
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          35.3867
		BumpHeight      63.263
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.45273
		mainOctaves     10
		Coverage        0.485755
		twistZones      7.35005
		twistMagn       0.894256
	}

	Clouds
	{
		Height          55.2852
		BumpHeight      57.454
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.45273
		mainOctaves     10
		Coverage        0.485755
		twistZones      7.35005
		twistMagn       0.894256
	}

	Clouds
	{
		Height          75.1816
		BumpHeight      64.3573
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.45273
		mainOctaves     10
		Coverage        0.485755
		twistZones      7.35005
		twistMagn       0.894256
	}

	Clouds
	{
		Height          95.0801
		BumpHeight      66.1214
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.45273
		mainOctaves     10
		Coverage        0.485755
		twistZones      7.35005
		twistMagn       0.894256
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          214.464
		Density         1852.65
		Pressure        244686
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0148592
		Saturation      0.544091

		Composition
		{
			H2    	91.8074
			He    	7.85942
			CH4   	0.286363
			N2    	0.0362235
			O2    	0.00840298
			Ne    	0.00125781
			Ar    	0.000940156
		}
	}

	NoAurora        true

	Rings
	{
		InnerRadius     29614.8
		OuterRadius     36064.4
		RotationPeriod  3.79783
		RotationOffset  0
		FrontBright     0.91459
		BackBright      0.765626
		Density         0.938638
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.152995
		Period          0.20231
		Eccentricity    0.0425847
		Inclination     2.06423
		AscendingNode   -116.203
		ArgOfPericenter 278.7
		MeanAnomaly     329.783
	}
}

DwarfMoon	"5.D1"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.69226e-009
	Radius          20.8617
	InertiaMoment   0.399483

	Oblateness      0.00436532

	Obliquity       -0.588332
	EqAscendNode    -87.9827
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.476 0.416 0.367)

	Surface
	{
		SurfStyle       0.431747
		OceanStyle      0.259984
		Randomize      (0.793, 0.281, 0.776)
		colorDistMagn   0.517021
		colorDistFreq   0.0586503
		detailScale     569.663
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0147736
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.676793
		terraceProb     0.174805
		erosion         0
		montesMagn      0.536675
		montesFreq      3.23171
		montesSpiky     0.930163
		montesFraction  0.600939
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.929073
		hillsFraction   0.589023
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219066
		craterFreq      0.195419
		craterDensity   0.990637
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.0371
		volcanoTemp     1564.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.166, 0.147, 0.000)
		colorShelf     (0.202, 0.177, 0.156, 0.000)
		colorBeach     (0.214, 0.187, 0.165, 0.000)
		colorDesert    (0.226, 0.198, 0.174, 0.000)
		colorLowland   (0.238, 0.208, 0.183, 0.000)
		colorUpland    (0.250, 0.218, 0.192, 0.000)
		colorRock      (0.262, 0.229, 0.202, 0.000)
		colorSnow      (0.274, 0.239, 0.211, 1.000)
		BumpHeight      18.7755
		BumpOffset      3.7551
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
		SemiMajorAxis   0.00175457
		Period          0.0097902
		Eccentricity    0.108869
		Inclination     -0.588332
		AscendingNode   -87.9827
		ArgOfPericenter 151.39
		MeanAnomaly     160.128
	}
}

DwarfMoon	"5.D2"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            3.74689e-009
	Radius          22.1711
	InertiaMoment   0.397091

	Oblateness      0.00338185

	Obliquity       31.5092
	EqAscendNode    52.6844
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.801 0.798 0.796)

	Surface
	{
		SurfStyle       0.769236
		OceanStyle      0.440595
		Randomize      (-0.374, -0.442, 0.277)
		colorDistMagn   0.119298
		colorDistFreq   0.428103
		detailScale     605.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.827634
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622724
		terraceProb     0.330646
		erosion         0
		montesMagn      0.495152
		montesFreq      2.19864
		montesSpiky     0.936906
		montesFraction  0.602965
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.15126
		hillsFraction   0.697672
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207939
		craterFreq      0.176082
		craterDensity   0.862949
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   56.7882
		volcanoTemp     1240.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.271, 0.223, 0.000)
		colorShelf     (0.321, 0.279, 0.255, 0.000)
		colorBeach     (0.377, 0.327, 0.302, 0.000)
		colorDesert    (0.409, 0.351, 0.295, 0.000)
		colorLowland   (0.449, 0.375, 0.334, 0.000)
		colorUpland    (0.497, 0.455, 0.406, 0.000)
		colorRock      (0.537, 0.495, 0.438, 0.000)
		colorSnow      (0.585, 0.527, 0.462, 1.000)
		BumpHeight      19.954
		BumpOffset      3.9908
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
		SemiMajorAxis   0.00237579
		Period          0.0154258
		Eccentricity    0.313486
		Inclination     31.5092
		AscendingNode   52.6844
		ArgOfPericenter 82.61
		MeanAnomaly     -6.33803
	}
}

DwarfMoon	"5.D3"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            5.17882e-009
	Radius          23.7236
	InertiaMoment   0.398638

	RotationPeriod  868.475
	Obliquity       -82.2518
	EqAscendNode    -116.968

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.835 0.756 0.706)

	Surface
	{
		SurfStyle       0.236962
		OceanStyle      0.808646
		Randomize      (0.735, -0.510, 0.840)
		colorDistMagn   0.823774
		colorDistFreq   0.306342
		detailScale     647.811
		colorConversion true
		snowLevel       2
		tropicLatitude  0.886132
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578888
		terraceProb     0.42355
		erosion         0
		montesMagn      0.52264
		montesFreq      2.6386
		montesSpiky     0.863081
		montesFraction  0.593825
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.997835
		hillsFraction   0.724651
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233718
		craterFreq      0.184439
		craterDensity   1.03394
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.6857
		volcanoTemp     1352.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.334, 0.303, 0.282, 0.000)
		colorShelf     (0.355, 0.321, 0.300, 0.000)
		colorBeach     (0.376, 0.340, 0.318, 0.000)
		colorDesert    (0.396, 0.359, 0.335, 0.000)
		colorLowland   (0.417, 0.378, 0.353, 0.000)
		colorUpland    (0.438, 0.397, 0.371, 0.000)
		colorRock      (0.459, 0.416, 0.388, 0.000)
		colorSnow      (0.480, 0.435, 0.406, 1.000)
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
		SemiMajorAxis   0.00280741
		Period          0.0198151
		Eccentricity    0.327979
		Inclination     -82.2518
		AscendingNode   -116.968
		ArgOfPericenter 154.056
		MeanAnomaly     -58.4004
	}
}

DwarfMoon	"5.D4"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            7.11784e-009
	Radius          24.8857
	InertiaMoment   0.399611

	RotationPeriod  289.038
	Obliquity       -46.8052
	EqAscendNode    136.583

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.451 0.445 0.442)

	Surface
	{
		SurfStyle       0.599502
		OceanStyle      0.511165
		Randomize      (-0.924, -0.424, -0.792)
		colorDistMagn   0.791054
		colorDistFreq   0.028033
		detailScale     679.545
		colorConversion true
		snowLevel       2
		tropicLatitude  0.519338
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.538343
		terraceProb     0.318986
		erosion         0
		montesMagn      0.577157
		montesFreq      2.56395
		montesSpiky     0.897461
		montesFraction  0.299528
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.624034
		hillsFraction   0.698753
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22177
		craterFreq      0.261702
		craterDensity   0.806156
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.2467
		volcanoTemp     1602.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.151, 0.124, 0.000)
		colorShelf     (0.181, 0.156, 0.141, 0.000)
		colorBeach     (0.212, 0.183, 0.168, 0.000)
		colorDesert    (0.230, 0.196, 0.164, 0.000)
		colorLowland   (0.253, 0.209, 0.186, 0.000)
		colorUpland    (0.280, 0.254, 0.226, 0.000)
		colorRock      (0.302, 0.276, 0.243, 0.000)
		colorSnow      (0.329, 0.294, 0.256, 1.000)
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
		SemiMajorAxis   0.00325431
		Period          0.02473
		Eccentricity    0.28704
		Inclination     -46.8052
		AscendingNode   136.583
		ArgOfPericenter -20.1219
		MeanAnomaly     93.4826
	}
}

DwarfMoon	"5.D5"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            9.73903e-009
	Radius          32.3363
	InertiaMoment   0.397412

	Obliquity       41.5605
	EqAscendNode    -161.217
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.513 0.433 0.379)

	Surface
	{
		SurfStyle       0.253434
		OceanStyle      0.873904
		Randomize      (0.004, -0.816, -0.553)
		colorDistMagn   0.767801
		colorDistFreq   0.566515
		detailScale     882.997
		colorConversion true
		snowLevel       2
		tropicLatitude  0.215241
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.520466
		terraceProb     0.212606
		erosion         0
		montesMagn      0.525705
		montesFreq      2.72723
		montesSpiky     0.859363
		montesFraction  0.270295
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.74536
		hillsFraction   0.69616
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238448
		craterFreq      0.17941
		craterDensity   0.837857
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.3734
		volcanoTemp     1775.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.173, 0.152, 0.000)
		colorShelf     (0.218, 0.184, 0.161, 0.000)
		colorBeach     (0.231, 0.195, 0.170, 0.000)
		colorDesert    (0.244, 0.206, 0.180, 0.000)
		colorLowland   (0.256, 0.217, 0.189, 0.000)
		colorUpland    (0.269, 0.227, 0.199, 0.000)
		colorRock      (0.282, 0.238, 0.208, 0.000)
		colorSnow      (0.295, 0.249, 0.218, 1.000)
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
		SemiMajorAxis   0.00370962
		Period          0.0300975
		Eccentricity    0.329956
		Inclination     41.5605
		AscendingNode   -161.217
		ArgOfPericenter 170.366
		MeanAnomaly     167.733
	}
}

Planet	"6"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "IceGiant"

	Mass            18.8807
	Radius          21384.5
	InertiaMoment   0.246344

	Oblateness      0.0248089

	RotationPeriod  10.6988
	Obliquity       -33.8943
	EqAscendNode    -72.3282

	AlbedoBond      0.426645
	AlbedoGeom      0.511974
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.602411
		Randomize      (0.358, 0.724, -0.134)
		detailScale     55002.3
		colorConversion true
		tropicLatitude  0.566276
		icecapLatitude  1
		mainFreq        0.00572926
		venusFreq       5.21438
		venusMagn       0.465286
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      3.44712
		twistMagn       0.797593
		cycloneMagn     10.4499
		cycloneFreq     0.433628
		cycloneDensity  0.0601295
		cycloneOctaves  2
		colorLayer0    (0.570, 0.550, 0.480, 1.000)
		colorLayer1    (0.850, 0.860, 0.870, 1.000)
		colorLayer2    (0.450, 0.390, 0.260, 1.000)
		colorLayer3    (0.430, 0.330, 0.170, 1.000)
		colorLayer4    (0.830, 0.830, 0.830, 1.000)
		colorLayer5    (0.510, 0.400, 0.140, 1.000)
		colorLayer6    (0.370, 0.350, 0.280, 1.000)
		colorLayer7    (0.420, 0.390, 0.310, 1.000)
		colorLowPlants (0.830, 0.830, 0.830, 1.000)
		colorUpPlants  (0.510, 0.400, 0.140, 1.000)
		BumpHeight      15.4322
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          55.1152
		BumpHeight      62.6968
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.702881
		mainOctaves     10
		Coverage        0.133225
		twistZones      3.44712
		twistMagn       0.797593
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          213.845
		Density         2527.85
		Pressure        236579
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0473998
		Saturation      0.602601

		Composition
		{
			H2    	93.1597
			He    	6.76776
			N2    	0.0348579
			CH4   	0.0274893
			O2    	0.00822385
			Ne    	0.00102383
			Ar    	0.000889913
		}
	}

	Aurora
	{
		Height      431.813
		NorthLat    73.4921
		NorthLon    -173.072
		NorthRadius 5113.81
		NorthWidth  7328.44
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -90
		SouthLon    -1.6546
		SouthRadius 5122.77
		SouthWidth  5205.17
		SouthRings  2
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     34150
		OuterRadius     45732.4
		RotationPeriod  5.08985
		RotationOffset  0
		FrontBright     0.790337
		BackBright      0.907068
		Density         0.584114
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.326152
		Period          0.629697
		Eccentricity    0.0582885
		Inclination     -1.73363
		AscendingNode   -71.0738
		ArgOfPericenter 207.395
		MeanAnomaly     66.5397
	}
}

DwarfMoon	"6.D1"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.86567e-007
	Radius          84.323
	InertiaMoment   0.399959

	Oblateness      0.249

	Obliquity       -0.00427039
	EqAscendNode    8.31059
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.531 0.526 0.521)

	Surface
	{
		SurfStyle       0.240349
		OceanStyle      0.560545
		Randomize      (0.946, -0.636, -0.320)
		colorDistMagn   0.549584
		colorDistFreq   1.40784
		detailScale     2302.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.328559
		terraceProb     0.56047
		erosion         0
		montesMagn      0.53327
		montesFreq      2.26007
		montesSpiky     0.885887
		montesFraction  0.598492
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.4258
		hillsFraction   0.654099
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217576
		craterFreq      0.24883
		craterDensity   0.846346
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   30.608
		volcanoTemp     1481.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.211, 0.208, 0.000)
		colorShelf     (0.226, 0.224, 0.221, 0.000)
		colorBeach     (0.239, 0.237, 0.234, 0.000)
		colorDesert    (0.252, 0.250, 0.247, 0.000)
		colorLowland   (0.266, 0.263, 0.261, 0.000)
		colorUpland    (0.279, 0.276, 0.274, 0.000)
		colorRock      (0.292, 0.289, 0.287, 0.000)
		colorSnow      (0.306, 0.303, 0.300, 1.000)
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
		SemiMajorAxis   0.000431296
		Period          0.00119216
		Eccentricity    7.27423e-005
		Inclination     -0.00427039
		AscendingNode   8.31059
		ArgOfPericenter -24.5708
		MeanAnomaly     -84.2974
	}
}

Moon	"6.1"
{
	ParentBody     "6"
	Class	       "Desert"

	Mass            0.00328656
	Radius          1226.22
	InertiaMoment   0.399972

	Oblateness      0.011079

	Obliquity       1.07958
	EqAscendNode    -128.145
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.700 0.698 0.697)

	Surface
	{
		SurfStyle       0.746642
		OceanStyle      0.710777
		Randomize      (0.227, 0.476, -0.093)
		colorDistMagn   0.0442108
		colorDistFreq   189.128
		detailScale     3153.91
		colorConversion true
		seaLevel        0.11155
		snowLevel       2
		tropicLatitude  0.0164749
		icecapLatitude  0.796192
		icecapHeight    0.120374
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.15816
		venusFreq       0.834384
		venusMagn       0
		mareFreq        0.443292
		mareDensity     0.00158236
		terraceProb     0.482456
		erosion         0
		montesMagn      0.0482928
		montesFreq      40.4895
		montesSpiky     0.792159
		montesFraction  0.136474
		dunesMagn       0.0588085
		dunesFreq       14.4018
		dunesFraction   0.943959
		hillsMagn       0.151545
		hillsFreq       113.618
		hillsFraction   0
		hills2Fraction  0
		riversMagn      59.6831
		riversFreq      3.70885
		riversSin       5.99469
		riversOctaves   0
		canyonsMagn     0.0443608
		canyonsFreq     32.1362
		canyonFraction  0
		cracksMagn      0.0808777
		cracksFreq      0.106726
		cracksOctaves   0
		craterMagn      0.667866
		craterFreq      2.75824
		craterDensity   0.594658
		craterOctaves   7.0659
		volcanoMagn     0.22772
		volcanoFreq     3.98656
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.544758
		volcanoRadius   1.11409
		volcanoTemp     1515.58
		lavaCoverTidal  0.237151
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
		Hapke           0.93616
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          61.3111
		Density         0.00638403
		Pressure        0.00201848
		Greenhouse      0.16239
		Bright          5.76792
		Opacity         1
		SkyLight        1.92264
		Hue             0.0345193
		Saturation      1

		Composition
		{
			CO2   	95.0092
			H2S   	4.25463
			C2H2  	0.398081
			N2    	0.183262
			C2H6  	0.114816
			C2H4  	0.0330902
			SO2   	0.00441421
			C3H8  	0.00228967
			CO    	0.000143224
			Ar    	3.56662e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000708308
		Period          0.0025088
		Eccentricity    0.0177935
		Inclination     1.07958
		AscendingNode   -128.145
		ArgOfPericenter 59.6226
		MeanAnomaly     154.782
	}
}

DwarfMoon	"6.D2"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.58352e-007
	Radius          96.2245
	InertiaMoment   0.399185

	Obliquity       9.55638
	EqAscendNode    -112.248
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.535 0.437 0.359)

	Surface
	{
		SurfStyle       0.245468
		OceanStyle      0.15865
		Randomize      (-0.961, -0.896, 0.295)
		colorDistMagn   0.360966
		colorDistFreq   3.10925
		detailScale     2627.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.184282
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.410167
		terraceProb     0.162079
		erosion         0
		montesMagn      0.694385
		montesFreq      2.8529
		montesSpiky     0.983784
		montesFraction  0.319395
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.1348
		hillsFraction   0.557247
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230657
		craterFreq      0.386026
		craterDensity   1.03317
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.2021
		volcanoTemp     1563.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.175, 0.144, 0.000)
		colorShelf     (0.227, 0.186, 0.153, 0.000)
		colorBeach     (0.241, 0.197, 0.162, 0.000)
		colorDesert    (0.254, 0.208, 0.171, 0.000)
		colorLowland   (0.267, 0.218, 0.180, 0.000)
		colorUpland    (0.281, 0.229, 0.189, 0.000)
		colorRock      (0.294, 0.240, 0.198, 0.000)
		colorSnow      (0.307, 0.251, 0.207, 1.000)
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
		SemiMajorAxis   0.00368108
		Period          0.0297258
		Eccentricity    0.0108578
		Inclination     9.55638
		AscendingNode   -112.248
		ArgOfPericenter -121.46
		MeanAnomaly     161.793
	}
}

DwarfMoon	"6.D3"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            5.02415e-007
	Radius          137.869
	InertiaMoment   0.39575

	Obliquity       -19.7407
	EqAscendNode    119.914
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.687 0.683 0.678)

	Surface
	{
		SurfStyle       0.244106
		OceanStyle      0.319275
		Randomize      (-0.808, -0.922, -0.698)
		colorDistMagn   0.5207
		colorDistFreq   6.67468
		detailScale     3764.73
		colorConversion true
		snowLevel       2
		tropicLatitude  0.333332
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.318218
		terraceProb     0.368832
		erosion         0
		montesMagn      0.522192
		montesFreq      2.95018
		montesSpiky     0.971035
		montesFraction  0.589953
		dunesFraction   0
		hillsMagn       0
		hillsFreq       41.8934
		hillsFraction   0.671587
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.199533
		craterFreq      0.77568
		craterDensity   0.999208
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   30.4958
		volcanoTemp     1661.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.273, 0.271, 0.000)
		colorShelf     (0.292, 0.290, 0.288, 0.000)
		colorBeach     (0.309, 0.307, 0.305, 0.000)
		colorDesert    (0.326, 0.324, 0.322, 0.000)
		colorLowland   (0.343, 0.341, 0.339, 0.000)
		colorUpland    (0.361, 0.359, 0.356, 0.000)
		colorRock      (0.378, 0.376, 0.373, 0.000)
		colorSnow      (0.395, 0.393, 0.390, 1.000)
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
		SemiMajorAxis   0.00406057
		Period          0.034439
		Eccentricity    0.143466
		Inclination     -19.7407
		AscendingNode   119.914
		ArgOfPericenter -127.249
		MeanAnomaly     -101.259
	}
}

DwarfMoon	"6.D4"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            7.11339e-007
	Radius          132.774
	InertiaMoment   0.398257

	Obliquity       11.1027
	EqAscendNode    101.866
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.464 0.460 0.454)

	Surface
	{
		SurfStyle       0.424043
		OceanStyle      0.141917
		Randomize      (0.316, 0.860, 0.226)
		colorDistMagn   0.116704
		colorDistFreq   12.8327
		detailScale     3625.6
		colorConversion true
		snowLevel       2
		tropicLatitude  0.24093
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584395
		terraceProb     0.284843
		erosion         0
		montesMagn      0.531977
		montesFreq      2.6613
		montesSpiky     0.85363
		montesFraction  0.439474
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.85
		hillsFraction   0.690371
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250796
		craterFreq      0.57555
		craterDensity   0.993479
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.6819
		volcanoTemp     1439.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.184, 0.182, 0.000)
		colorShelf     (0.197, 0.196, 0.193, 0.000)
		colorBeach     (0.209, 0.207, 0.204, 0.000)
		colorDesert    (0.221, 0.219, 0.216, 0.000)
		colorLowland   (0.232, 0.230, 0.227, 0.000)
		colorUpland    (0.244, 0.242, 0.238, 0.000)
		colorRock      (0.255, 0.253, 0.250, 0.000)
		colorSnow      (0.267, 0.265, 0.261, 1.000)
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
		SemiMajorAxis   0.00471538
		Period          0.0430968
		Eccentricity    0.434388
		Inclination     11.1027
		AscendingNode   101.866
		ArgOfPericenter 122.637
		MeanAnomaly     129.289
	}
}

DwarfMoon	"6.D5"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.01905e-006
	Radius          142.861
	InertiaMoment   0.399319

	Obliquity       46.0647
	EqAscendNode    4.75722
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.473 0.470 0.466)

	Surface
	{
		SurfStyle       0.806542
		OceanStyle      0.799734
		Randomize      (-0.774, 0.809, 0.137)
		colorDistMagn   0.0420723
		colorDistFreq   10.2676
		detailScale     3901.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999374
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.397833
		terraceProb     0.867849
		erosion         0
		montesMagn      0.454224
		montesFreq      3.00245
		montesSpiky     0.978508
		montesFraction  0.6899
		dunesFraction   0
		hillsMagn       0
		hillsFreq       38.7622
		hillsFraction   0.564543
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208113
		craterFreq      0.763754
		craterDensity   0.846973
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.1881
		volcanoTemp     1452.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.160, 0.130, 0.000)
		colorShelf     (0.189, 0.165, 0.149, 0.000)
		colorBeach     (0.222, 0.193, 0.177, 0.000)
		colorDesert    (0.241, 0.207, 0.172, 0.000)
		colorLowland   (0.265, 0.221, 0.196, 0.000)
		colorUpland    (0.293, 0.268, 0.238, 0.000)
		colorRock      (0.317, 0.292, 0.256, 0.000)
		colorSnow      (0.345, 0.310, 0.270, 1.000)
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
		SemiMajorAxis   0.00505916
		Period          0.0478947
		Eccentricity    0.201791
		Inclination     46.0647
		AscendingNode   4.75722
		ArgOfPericenter -85.9302
		MeanAnomaly     29.8616
	}
}

DwarfMoon	"6.D6"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.48059e-006
	Radius          155.389
	InertiaMoment   0.396538

	Obliquity       -34.4054
	EqAscendNode    126.266
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.547 0.543 0.537)

	Surface
	{
		SurfStyle       0.825341
		OceanStyle      0.284695
		Randomize      (-0.335, -0.976, 0.914)
		colorDistMagn   0.276245
		colorDistFreq   12.6563
		detailScale     4243.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.493782
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.429016
		terraceProb     0.228576
		erosion         0
		montesMagn      0.368591
		montesFreq      2.30078
		montesSpiky     0.990959
		montesFraction  0.521478
		dunesFraction   0
		hillsMagn       0
		hillsFreq       66.2824
		hillsFraction   0.533611
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209975
		craterFreq      0.733451
		craterDensity   0.968098
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   20.022
		volcanoTemp     1089.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.185, 0.150, 0.000)
		colorShelf     (0.219, 0.190, 0.172, 0.000)
		colorBeach     (0.257, 0.223, 0.204, 0.000)
		colorDesert    (0.279, 0.239, 0.199, 0.000)
		colorLowland   (0.307, 0.255, 0.226, 0.000)
		colorUpland    (0.339, 0.309, 0.274, 0.000)
		colorRock      (0.367, 0.336, 0.295, 0.000)
		colorSnow      (0.400, 0.358, 0.311, 1.000)
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
		SemiMajorAxis   0.00564504
		Period          0.0564509
		Eccentricity    0.0735965
		Inclination     -34.4054
		AscendingNode   126.266
		ArgOfPericenter -148.352
		MeanAnomaly     -136.924
	}
}

DwarfMoon	"6.D7"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.18796e-006
	Radius          164.734
	InertiaMoment   0.398433

	RotationPeriod  1408.26
	Obliquity       -16.1568
	EqAscendNode    -136.737

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.581 0.429 0.357)

	Surface
	{
		SurfStyle       0.998364
		OceanStyle      0.832576
		Randomize      (0.865, -0.769, 0.670)
		colorDistMagn   0.69397
		colorDistFreq   13.7376
		detailScale     4498.33
		colorConversion true
		snowLevel       2
		tropicLatitude  0.204076
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565099
		terraceProb     0.245773
		erosion         0
		montesMagn      0.294621
		montesFreq      2.68463
		montesSpiky     0.905287
		montesFraction  0.697178
		dunesFraction   0
		hillsMagn       0
		hillsFreq       50.8147
		hillsFraction   0.644852
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249736
		craterFreq      0.831013
		craterDensity   0.938588
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   17.461
		volcanoTemp     1391.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.150, 0.143, 0.050)
		colorShelf     (0.233, 0.176, 0.164, 0.040)
		colorBeach     (0.267, 0.201, 0.186, 0.030)
		colorDesert    (0.302, 0.227, 0.211, 0.020)
		colorLowland   (0.337, 0.253, 0.232, 0.030)
		colorUpland    (0.372, 0.279, 0.254, 0.050)
		colorRock      (0.407, 0.304, 0.282, 0.020)
		colorSnow      (0.407, 0.304, 0.282, 1.000)
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
		SemiMajorAxis   0.00615443
		Period          0.0642616
		Eccentricity    0.304197
		Inclination     -16.1568
		AscendingNode   -136.737
		ArgOfPericenter -82.3269
		MeanAnomaly     44.9675
	}
}

Moon	"6.2"
{
	ParentBody     "6"
	Class	       "IceWorld"

	Mass            3.30042e-006
	Radius          223.378
	InertiaMoment   0.39945

	RotationPeriod  1942.64
	Obliquity       -59.2176
	EqAscendNode    102.243

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.503 0.500 0.493)

	Surface
	{
		SurfStyle       0.620581
		OceanStyle      0.49187
		Randomize      (0.262, 0.179, -0.737)
		colorDistMagn   0.0645957
		colorDistFreq   31.332
		detailScale     574.541
		colorConversion true
		drivenDarkening 0.296321
		seaLevel        0.249102
		snowLevel       2
		tropicLatitude  0.908244
		icecapLatitude  1
		icecapHeight    0.249102
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.53754
		venusFreq       1.12253
		venusMagn       0.157197
		mareFreq        0
		mareDensity     1.08632e-006
		terraceProb     0.331377
		erosion         0
		montesMagn      0.0588423
		montesFreq      9.35649
		montesSpiky     0.984324
		montesFraction  0.37622
		dunesMagn       0.0342981
		dunesFreq       304.362
		dunesFraction   0.324883
		hillsMagn       0.112692
		hillsFreq       28.6381
		hillsFraction   0.150388
		hills2Fraction  0.24482
		riversMagn      54.8994
		riversFreq      3.46459
		riversSin       6.29411
		riversOctaves   0
		canyonsMagn     0.430502
		canyonsFreq     0.0930034
		canyonFraction  0
		cracksMagn      0.0500295
		cracksFreq      0.107407
		cracksOctaves   0
		craterMagn      1.04555
		craterFreq      0.634465
		craterDensity   0.886292
		craterOctaves   8
		craterRayedFactor 0.0829705
		volcanoMagn     0.197756
		volcanoFreq     0.80318
		volcanoDensity  0.0585563
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.156658
		volcanoRadius   3.87092
		volcanoTemp     1352.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.131, 0.095, 0.054, 1.000)
		colorShelf     (0.171, 0.130, 0.079, 1.000)
		colorBeach     (0.276, 0.170, 0.084, 0.200)
		colorDesert    (0.302, 0.190, 0.099, 0.200)
		colorLowland   (0.327, 0.200, 0.104, 0.200)
		colorUpland    (0.352, 0.240, 0.123, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.327, 0.200, 0.104, 0.200)
		colorUpPlants  (0.352, 0.240, 0.123, 0.200)
		BumpHeight      11.1689
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
		SemiMajorAxis   0.00675367
		Period          0.073872
		Eccentricity    0.105304
		Inclination     -59.2176
		AscendingNode   102.243
		ArgOfPericenter -163.904
		MeanAnomaly     132.313
	}
}

Moon	"6.3"
{
	ParentBody     "6"
	Class	       "IceWorld"

	Mass            5.10555e-006
	Radius          245.873
	InertiaMoment   0.396997

	Obliquity       50.2526
	EqAscendNode    -91.1317
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.726 0.558 0.503)

	Surface
	{
		SurfStyle       0.158584
		OceanStyle      0.0121219
		Randomize      (-0.696, -0.720, 0.549)
		colorDistMagn   0.0803479
		colorDistFreq   26.2118
		detailScale     632.4
		colorConversion true
		drivenDarkening 0.27894
		seaLevel        0.156243
		snowLevel       2
		tropicLatitude  0.907286
		icecapLatitude  1
		icecapHeight    0.156243
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.86953
		venusFreq       0.447223
		venusMagn       0.123585
		mareFreq        0
		mareDensity     1.67598e-006
		terraceProb     0.371332
		erosion         0
		montesMagn      0.0572147
		montesFreq      12.9506
		montesSpiky     0.946454
		montesFraction  0.95074
		dunesMagn       0.0463113
		dunesFreq       321.659
		dunesFraction   0.178818
		hillsMagn       0.148062
		hillsFreq       30.1765
		hillsFraction   0.541155
		hills2Fraction  0.248973
		riversMagn      67.4414
		riversFreq      3.93122
		riversSin       5.02664
		riversOctaves   0
		canyonsMagn     0.416752
		canyonsFreq     0.0973103
		canyonFraction  0
		cracksMagn      0.0649871
		cracksFreq      0.123859
		cracksOctaves   0
		craterMagn      1.05199
		craterFreq      0.599325
		craterDensity   0.753732
		craterOctaves   8
		craterRayedFactor 0.13163
		volcanoMagn     0.230631
		volcanoFreq     0.481735
		volcanoDensity  0.0646475
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.186365
		volcanoRadius   2.05468
		volcanoTemp     1730.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.726, 0.558, 0.503, 0.500)
		colorShelf     (0.690, 0.530, 0.478, 0.500)
		colorBeach     (0.508, 0.391, 0.352, 0.750)
		colorDesert    (0.617, 0.474, 0.427, 1.000)
		colorLowland   (0.639, 0.491, 0.442, 1.000)
		colorUpland    (0.675, 0.519, 0.467, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.639, 0.491, 0.442, 1.000)
		colorUpPlants  (0.675, 0.519, 0.467, 1.000)
		BumpHeight      12.2937
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
		SemiMajorAxis   0.00717449
		Period          0.0808829
		Eccentricity    0.0047146
		Inclination     50.2526
		AscendingNode   -91.1317
		ArgOfPericenter -3.86212
		MeanAnomaly     -156.257
	}
}

DwarfMoon	"6.D8"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.51593e-011
	Radius          3.39467
	InertiaMoment   0.398598

	Obliquity       79.2059
	EqAscendNode    156.764
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.493 0.486 0.479)

	Surface
	{
		SurfStyle       0.776812
		OceanStyle      0.844699
		Randomize      (-0.385, -0.296, -0.973)
		colorDistMagn   0.90635
		colorDistFreq   0.0044505
		detailScale     92.6972
		colorConversion true
		snowLevel       2
		tropicLatitude  0.387829
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.588216
		terraceProb     0.340775
		erosion         0
		montesMagn      0.52761
		montesFreq      2.66268
		montesSpiky     0.906969
		montesFraction  0.636818
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0352669
		hillsFraction   0.659016
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231427
		craterFreq      0.21867
		craterDensity   0.898707
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   136.699
		volcanoTemp     1205.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.165, 0.134, 0.000)
		colorShelf     (0.197, 0.170, 0.153, 0.000)
		colorBeach     (0.232, 0.199, 0.182, 0.000)
		colorDesert    (0.251, 0.214, 0.177, 0.000)
		colorLowland   (0.276, 0.229, 0.201, 0.000)
		colorUpland    (0.306, 0.277, 0.244, 0.000)
		colorRock      (0.330, 0.302, 0.263, 0.000)
		colorSnow      (0.360, 0.321, 0.278, 1.000)
		BumpHeight      3.05521
		BumpOffset      0.611041
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
		SemiMajorAxis   0.0075512
		Period          0.0873362
		Eccentricity    0.0735382
		Inclination     79.2059
		AscendingNode   156.764
		ArgOfPericenter 47.8171
		MeanAnomaly     21.4251
	}
}

DwarfMoon	"6.D9"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.9984e-011
	Radius          4.02229
	InertiaMoment   0.399579

	RotationPeriod  2482.59
	Obliquity       37.9867
	EqAscendNode    -43.5825

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.737 0.707 0.672)

	Surface
	{
		SurfStyle       0.267953
		OceanStyle      0.982095
		Randomize      (0.484, -0.043, 0.389)
		colorDistMagn   0.0111606
		colorDistFreq   0.00959649
		detailScale     109.835
		colorConversion true
		snowLevel       2
		tropicLatitude  0.937947
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.320129
		terraceProb     0.106454
		erosion         0
		montesMagn      0.506
		montesFreq      3.45235
		montesSpiky     0.866661
		montesFraction  0.593763
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.049608
		hillsFraction   0.917311
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252204
		craterFreq      0.209895
		craterDensity   0.876717
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   115.169
		volcanoTemp     1781.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.283, 0.269, 0.000)
		colorShelf     (0.313, 0.301, 0.285, 0.000)
		colorBeach     (0.332, 0.318, 0.302, 0.000)
		colorDesert    (0.350, 0.336, 0.319, 0.000)
		colorLowland   (0.369, 0.354, 0.336, 0.000)
		colorUpland    (0.387, 0.371, 0.353, 0.000)
		colorRock      (0.406, 0.389, 0.369, 0.000)
		colorSnow      (0.424, 0.407, 0.386, 1.000)
		BumpHeight      3.62006
		BumpOffset      0.724012
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
		SemiMajorAxis   0.00795331
		Period          0.0944044
		Eccentricity    0.345289
		Inclination     37.9867
		AscendingNode   -43.5825
		ArgOfPericenter 18.1791
		MeanAnomaly     -100.164
	}
}

DwarfMoon	"6.D10"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            5.44288e-011
	Radius          5.74157
	InertiaMoment   0.397337

	RotationPeriod  1163.73
	Obliquity       -84.8337
	EqAscendNode    124.236

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.700 0.698 0.695)

	Surface
	{
		SurfStyle       0.0921238
		OceanStyle      0.611168
		Randomize      (-0.900, -0.669, -0.840)
		colorDistMagn   0.76313
		colorDistFreq   0.0178713
		detailScale     156.783
		colorConversion true
		snowLevel       2
		tropicLatitude  0.824306
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380111
		terraceProb     0.27253
		erosion         0
		montesMagn      0.462564
		montesFreq      2.41691
		montesSpiky     0.893723
		montesFraction  0.527485
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0659423
		hillsFraction   0.548059
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.192631
		craterFreq      0.211572
		craterDensity   1.07083
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   122.018
		volcanoTemp     1487.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.279, 0.278, 0.000)
		colorShelf     (0.298, 0.297, 0.295, 0.000)
		colorBeach     (0.315, 0.314, 0.313, 0.000)
		colorDesert    (0.333, 0.331, 0.330, 0.000)
		colorLowland   (0.350, 0.349, 0.347, 0.000)
		colorUpland    (0.368, 0.366, 0.365, 0.000)
		colorRock      (0.385, 0.384, 0.382, 0.000)
		colorSnow      (0.403, 0.401, 0.400, 1.000)
		BumpHeight      5.16742
		BumpOffset      1.03348
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
		SemiMajorAxis   0.00824074
		Period          0.099568
		Eccentricity    0.381216
		Inclination     -84.8337
		AscendingNode   124.236
		ArgOfPericenter -91.0147
		MeanAnomaly     44.1846
	}
}

DwarfMoon	"6.D11"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            9.29139e-011
	Radius          6.50592
	InertiaMoment   0.398753

	Obliquity       73.5035
	EqAscendNode    67.3424
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.408 0.403 0.399)

	Surface
	{
		SurfStyle       0.243223
		OceanStyle      0.835187
		Randomize      (0.636, 0.528, 0.701)
		colorDistMagn   0.700762
		colorDistFreq   0.0187521
		detailScale     177.655
		colorConversion true
		snowLevel       2
		tropicLatitude  0.961863
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.666971
		terraceProb     0.346614
		erosion         0
		montesMagn      0.60214
		montesFreq      2.87445
		montesSpiky     0.961604
		montesFraction  0.536401
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0847105
		hillsFraction   0.451526
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222522
		craterFreq      0.24855
		craterDensity   0.927276
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   105.822
		volcanoTemp     1273.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.161, 0.160, 0.000)
		colorShelf     (0.173, 0.171, 0.170, 0.000)
		colorBeach     (0.184, 0.181, 0.180, 0.000)
		colorDesert    (0.194, 0.191, 0.189, 0.000)
		colorLowland   (0.204, 0.202, 0.199, 0.000)
		colorUpland    (0.214, 0.212, 0.209, 0.000)
		colorRock      (0.224, 0.222, 0.219, 0.000)
		colorSnow      (0.235, 0.232, 0.229, 1.000)
		BumpHeight      5.85533
		BumpOffset      1.17107
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
		SemiMajorAxis   0.00881472
		Period          0.11015
		Eccentricity    0.0456309
		Inclination     73.5035
		AscendingNode   67.3424
		ArgOfPericenter 81.7446
		MeanAnomaly     -80.1487
	}
}

DwarfMoon	"6.D12"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.51465e-010
	Radius          7.35445
	InertiaMoment   0.399706

	Obliquity       73.9598
	EqAscendNode    -124.594
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.501 0.379 0.335)

	Surface
	{
		SurfStyle       0.217811
		OceanStyle      0.459131
		Randomize      (-0.255, -0.819, 0.527)
		colorDistMagn   0.0491102
		colorDistFreq   0.0241496
		detailScale     200.826
		colorConversion true
		snowLevel       2
		tropicLatitude  0.799429
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.715759
		terraceProb     0.268919
		erosion         0
		montesMagn      0.474434
		montesFreq      2.94033
		montesSpiky     0.921242
		montesFraction  0.731376
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.127798
		hillsFraction   0.427716
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252512
		craterFreq      0.19379
		craterDensity   0.988102
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   93.6916
		volcanoTemp     1330
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.152, 0.134, 0.000)
		colorShelf     (0.213, 0.161, 0.142, 0.000)
		colorBeach     (0.226, 0.170, 0.151, 0.000)
		colorDesert    (0.238, 0.180, 0.159, 0.000)
		colorLowland   (0.251, 0.189, 0.168, 0.000)
		colorUpland    (0.263, 0.199, 0.176, 0.000)
		colorRock      (0.276, 0.208, 0.184, 0.000)
		colorSnow      (0.288, 0.218, 0.193, 1.000)
		BumpHeight      6.61901
		BumpOffset      1.3238
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
		SemiMajorAxis   0.0093558
		Period          0.120446
		Eccentricity    0.0686195
		Inclination     73.9598
		AscendingNode   -124.594
		ArgOfPericenter -6.84675
		MeanAnomaly     -71.5556
	}
}

DwarfMoon	"6.D13"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.3824e-010
	Radius          8.12835
	InertiaMoment   0.397614

	RotationPeriod  2199.76
	Obliquity       80.301
	EqAscendNode    -142.666

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.607 0.604 0.601)

	Surface
	{
		SurfStyle       0.724433
		OceanStyle      0.845792
		Randomize      (0.859, 0.557, -0.742)
		colorDistMagn   0.658181
		colorDistFreq   0.028058
		detailScale     221.958
		colorConversion true
		snowLevel       2
		tropicLatitude  0.598761
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.416138
		terraceProb     0.413161
		erosion         0
		montesMagn      0.506776
		montesFreq      2.17589
		montesSpiky     0.954341
		montesFraction  0.46084
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.163934
		hillsFraction   0.698518
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232859
		craterFreq      0.224433
		craterDensity   0.801802
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   82.566
		volcanoTemp     1522.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.205, 0.168, 0.000)
		colorShelf     (0.243, 0.211, 0.192, 0.000)
		colorBeach     (0.285, 0.248, 0.229, 0.000)
		colorDesert    (0.310, 0.266, 0.223, 0.000)
		colorLowland   (0.340, 0.284, 0.253, 0.000)
		colorUpland    (0.376, 0.344, 0.307, 0.000)
		colorRock      (0.407, 0.375, 0.331, 0.000)
		colorSnow      (0.443, 0.399, 0.349, 1.000)
		BumpHeight      7.31552
		BumpOffset      1.4631
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
		SemiMajorAxis   0.0096144
		Period          0.125474
		Eccentricity    0.466006
		Inclination     80.301
		AscendingNode   -142.666
		ArgOfPericenter -112.027
		MeanAnomaly     -93.7367
	}
}

Planet	"7"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "IceWorld"

	Mass            0.0384147
	Radius          2915.15
	InertiaMoment   0.352313

	Oblateness      0.00374304

	RotationPeriod  37.1132
	Obliquity       -9.47668
	EqAscendNode    -68.2543

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.855 0.757 0.667)

	Surface
	{
		SurfStyle       0.619938
		OceanStyle      0.726369
		Randomize      (0.513, 0.314, -0.744)
		colorDistMagn   0.059446
		colorDistFreq   366.711
		detailScale     7497.94
		colorConversion true
		drivenDarkening 0
		seaLevel        0.135828
		snowLevel       2
		tropicLatitude  0.157883
		icecapLatitude  1
		icecapHeight    0.135828
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.78963
		venusFreq       1.38748
		venusMagn       0.216534
		mareFreq        1.47048
		mareDensity     0.00405895
		terraceProb     0.500771
		erosion         0
		montesMagn      0.153995
		montesFreq      100.289
		montesSpiky     0.947834
		montesFraction  0.368239
		dunesMagn       0.0322166
		dunesFreq       3887.67
		dunesFraction   0.103641
		hillsMagn       0.129677
		hillsFreq       337.617
		hillsFraction   0.858532
		hills2Fraction  0.132924
		riversMagn      62.9721
		riversFreq      4.74055
		riversSin       5.43516
		riversOctaves   0
		canyonsMagn     0.610343
		canyonsFreq     0.947922
		canyonFraction  0
		cracksMagn      0.0505006
		cracksFreq      1.26547
		cracksOctaves   3
		craterMagn      0.586094
		craterFreq      8.07401
		craterDensity   0.86074
		craterOctaves   12
		craterRayedFactor 0.351985
		volcanoMagn     0.683454
		volcanoFreq     0.996304
		volcanoDensity  0.0667971
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.0559734
		volcanoRadius   0.580831
		volcanoTemp     1665.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.144, 0.073, 1.000)
		colorShelf     (0.291, 0.197, 0.107, 1.000)
		colorBeach     (0.470, 0.257, 0.113, 0.200)
		colorDesert    (0.513, 0.288, 0.133, 0.200)
		colorLowland   (0.556, 0.303, 0.140, 0.200)
		colorUpland    (0.598, 0.363, 0.167, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.556, 0.303, 0.140, 0.200)
		colorUpPlants  (0.598, 0.363, 0.167, 0.200)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999992
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
		Height          176.947
		Density         8.26134e-007
		Pressure        2.04677e-007
		Greenhouse      0.00825769
		Bright          0.962521
		Opacity         0
		SkyLight        0.32084
		Hue             -0.0177778
		Saturation      1

		Composition
		{
			CH4   	67.8264
			N2    	29.7331
			Ar    	1.7515
			CO    	0.670893
			Ne    	0.0164571
			He    	0.00112396
			O2    	0.000597794
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.537627
		Period          1.3331
		Eccentricity    0.0869441
		Inclination     1.00539
		AscendingNode   -64.207
		ArgOfPericenter 260.697
		MeanAnomaly     311.429
	}
}

DwarfMoon	"7.D1"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            7.35886e-009
	Radius          33.9944
	InertiaMoment   0.395382

	Oblateness      0.249

	Obliquity       -0.00494059
	EqAscendNode    -163.503
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.404 0.401 0.397)

	Surface
	{
		SurfStyle       0.259445
		OceanStyle      0.265811
		Randomize      (-0.102, 0.206, -0.816)
		colorDistMagn   0.351121
		colorDistFreq   0.727277
		detailScale     928.273
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496882
		terraceProb     0.514441
		erosion         0
		montesMagn      0.444936
		montesFreq      2.34234
		montesSpiky     0.896136
		montesFraction  0.64871
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.94144
		hillsFraction   0.743149
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211251
		craterFreq      0.251763
		craterDensity   0.908931
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   62.1309
		volcanoTemp     1426.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.160, 0.159, 0.000)
		colorShelf     (0.172, 0.170, 0.169, 0.000)
		colorBeach     (0.182, 0.181, 0.179, 0.000)
		colorDesert    (0.192, 0.191, 0.189, 0.000)
		colorLowland   (0.202, 0.201, 0.199, 0.000)
		colorUpland    (0.212, 0.211, 0.209, 0.000)
		colorRock      (0.222, 0.221, 0.219, 0.000)
		colorSnow      (0.232, 0.231, 0.229, 1.000)
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
		SemiMajorAxis   5.14501e-005
		Period          0.00108896
		Eccentricity    3.92546e-005
		Inclination     -0.00494059
		AscendingNode   -163.503
		ArgOfPericenter -120.05
		MeanAnomaly     24.9536
	}
}

Moon	"7.1"
{
	ParentBody     "7"
	Class	       "IceWorld"

	Mass            0.000133742
	Radius          424.532
	InertiaMoment   0.397126

	Oblateness      0.0127635

	Obliquity       -1.13814
	EqAscendNode    -131.752
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.746 0.614 0.559)

	Surface
	{
		SurfStyle       0.747871
		OceanStyle      0.805443
		Randomize      (-0.249, -0.146, -0.343)
		colorDistMagn   0.0656382
		colorDistFreq   56.5561
		detailScale     1091.92
		colorConversion true
		drivenDarkening 0
		seaLevel        0.243968
		snowLevel       2
		tropicLatitude  0.0162344
		icecapLatitude  0.514514
		icecapHeight    0.284723
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.93221
		venusFreq       1.15908
		venusMagn       0
		mareFreq        0
		mareDensity     0.000121021
		terraceProb     0.440602
		erosion         0
		montesMagn      0.0522208
		montesFreq      18.3813
		montesSpiky     0.969612
		montesFraction  0.00153961
		dunesMagn       0.0540371
		dunesFreq       556.06
		dunesFraction   0.958272
		hillsMagn       0.142177
		hillsFreq       44.8196
		hillsFraction   0.363417
		hills2Fraction  0.124938
		riversMagn      60.5386
		riversFreq      2.42776
		riversSin       6.69666
		riversOctaves   0
		canyonsMagn     0.582868
		canyonsFreq     0.171927
		canyonFraction  0
		cracksMagn      0.0536486
		cracksFreq      0.295563
		cracksOctaves   0
		craterMagn      0.604942
		craterFreq      1.42001
		craterDensity   0.742656
		craterOctaves   9
		craterRayedFactor 0.331566
		volcanoMagn     0.206126
		volcanoFreq     0.795196
		volcanoDensity  0.060784
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.447548
		volcanoRadius   1.14419
		volcanoTemp     1637.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.477, 0.393, 0.375, 0.250)
		colorShelf     (0.522, 0.448, 0.425, 0.250)
		colorBeach     (0.425, 0.331, 0.324, 0.200)
		colorDesert    (0.395, 0.301, 0.285, 0.200)
		colorLowland   (0.291, 0.233, 0.235, 0.200)
		colorUpland    (0.552, 0.454, 0.425, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.291, 0.233, 0.235, 0.200)
		colorUpPlants  (0.552, 0.454, 0.425, 0.250)
		BumpHeight      20
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
		SemiMajorAxis   8.59656e-005
		Period          0.00234781
		Eccentricity    0.00246433
		Inclination     -1.13814
		AscendingNode   -131.752
		ArgOfPericenter -43.7967
		MeanAnomaly     38.6287
	}
}

Moon	"7.2"
{
	ParentBody     "7"
	Class	       "IceWorld"

	Mass            0.000155218
	Radius          473.877
	InertiaMoment   0.39992

	Oblateness      0.00190601

	Obliquity       0.85142
	EqAscendNode    -148.291
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.548 0.457 0.431)

	Surface
	{
		SurfStyle       0.651278
		OceanStyle      0.963875
		Randomize      (-0.088, 0.704, -0.271)
		colorDistMagn   0.0410251
		colorDistFreq   65.4309
		detailScale     1218.84
		colorConversion true
		drivenDarkening 0
		seaLevel        0.191893
		snowLevel       2
		tropicLatitude  0.00811921
		icecapLatitude  0.935406
		icecapHeight    0.196349
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.8961
		venusFreq       1.2441
		venusMagn       0
		mareFreq        0
		mareDensity     9.8764e-005
		terraceProb     0.305826
		erosion         0
		montesMagn      0.0750671
		montesFreq      17.6153
		montesSpiky     0.898736
		montesFraction  0.40495
		dunesMagn       0.0344328
		dunesFreq       625.683
		dunesFraction   0.495099
		hillsMagn       0.105751
		hillsFreq       58.4493
		hillsFraction   0.618231
		hills2Fraction  0.292483
		riversMagn      55.7744
		riversFreq      2.35208
		riversSin       3.94788
		riversOctaves   0
		canyonsMagn     0.479403
		canyonsFreq     0.164363
		canyonFraction  0
		cracksMagn      0.0257869
		cracksFreq      0.201539
		cracksOctaves   0
		craterMagn      0.632031
		craterFreq      1.15799
		craterDensity   0.848818
		craterOctaves   9
		craterRayedFactor 0.402401
		volcanoMagn     0.223162
		volcanoFreq     1.17215
		volcanoDensity  0.0578519
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.0805844
		volcanoRadius   1.74752
		volcanoTemp     1415.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.351, 0.293, 0.289, 0.250)
		colorShelf     (0.384, 0.334, 0.328, 0.250)
		colorBeach     (0.312, 0.247, 0.250, 0.200)
		colorDesert    (0.291, 0.224, 0.220, 0.200)
		colorLowland   (0.214, 0.174, 0.181, 0.200)
		colorUpland    (0.406, 0.338, 0.328, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.214, 0.174, 0.181, 0.200)
		colorUpPlants  (0.406, 0.338, 0.328, 0.250)
		BumpHeight      20
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
		SemiMajorAxis   0.000172743
		Period          0.00668585
		Eccentricity    0.0219321
		Inclination     0.85142
		AscendingNode   -148.291
		ArgOfPericenter 95.4389
		MeanAnomaly     35.1047
	}
}

DwarfMoon	"7.D2"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.8656e-008
	Radius          36.1705
	InertiaMoment   0.396386

	RotationPeriod  2105.94
	Obliquity       -50.3296
	EqAscendNode    137.202

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.696 0.652 0.622)

	Surface
	{
		SurfStyle       0.0320545
		OceanStyle      0.667345
		Randomize      (-0.389, 0.771, -0.753)
		colorDistMagn   0.611732
		colorDistFreq   0.471558
		detailScale     987.695
		colorConversion true
		snowLevel       2
		tropicLatitude  0.539078
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605245
		terraceProb     0.175965
		erosion         0
		montesMagn      0.405855
		montesFreq      2.69013
		montesSpiky     0.982579
		montesFraction  0.570154
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.4393
		hillsFraction   0.700591
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240172
		craterFreq      0.272273
		craterDensity   0.91275
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.5193
		volcanoTemp     1625.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.261, 0.249, 0.000)
		colorShelf     (0.296, 0.277, 0.265, 0.000)
		colorBeach     (0.313, 0.294, 0.280, 0.000)
		colorDesert    (0.330, 0.310, 0.296, 0.000)
		colorLowland   (0.348, 0.326, 0.311, 0.000)
		colorUpland    (0.365, 0.342, 0.327, 0.000)
		colorRock      (0.383, 0.359, 0.342, 0.000)
		colorSnow      (0.400, 0.375, 0.358, 1.000)
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
		SemiMajorAxis   0.000745491
		Period          0.0600612
		Eccentricity    0.248502
		Inclination     -50.3296
		AscendingNode   137.202
		ArgOfPericenter 158.267
		MeanAnomaly     85.0827
	}
}

Planet	"8"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "GasGiant"

	Mass            117.155
	Radius          61014.6
	InertiaMoment   0.19587

	Oblateness      0.0827168

	RotationPeriod  10.4291
	Obliquity       -20.5835
	EqAscendNode    -109.506

	AlbedoBond      0.463452
	AlbedoGeom      0.556142
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.62385
		Randomize      (-0.751, 0.299, 0.144)
		detailScale     156933
		colorConversion true
		tropicLatitude  0.362904
		icecapLatitude  1
		mainFreq        0.029155
		venusFreq       9.24689
		venusMagn       0.365293
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      6.73004
		twistMagn       0.801522
		cycloneMagn     12.4945
		cycloneFreq     0.21303
		cycloneDensity  0.101457
		cycloneOctaves  2
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
		BumpHeight      17.6762
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          85.1133
		BumpHeight      53.1822
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.18245
		mainOctaves     10
		Coverage        0.134516
		twistZones      6.73004
		twistMagn       0.801522
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          354.853
		Density         12259.8
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0124811
		Saturation      0.719621

		Composition
		{
			H2    	91.6161
			He    	8.38277
			Ne    	0.00113313
			N2    	1.96639e-005
		}
	}

	Aurora
	{
		Height      1595.9
		NorthLat    86.0124
		NorthLon    178.284
		NorthRadius 16296.2
		NorthWidth  8040.89
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -85.9764
		SouthLon    352.425
		SouthRadius 14283.6
		SouthWidth  8760.76
		SouthRings  4
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     78389.8
		OuterRadius     154512
		RotationPeriod  10.1722
		RotationOffset  0
		FrontBright     0.245839
		BackBright      0.450882
		Density         0.346214
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.12988
		Period          4.05343
		Eccentricity    0.04356
		Inclination     1.42118
		AscendingNode   -117.651
		ArgOfPericenter 218.284
		MeanAnomaly     286.323
	}
}

DwarfMoon	"8.D1"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.71217e-007
	Radius          96.0728
	InertiaMoment   0.399644

	Oblateness      0.249

	Obliquity       -0.00456366
	EqAscendNode    0.879886
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.728 0.692 0.665)

	Surface
	{
		SurfStyle       0.905905
		OceanStyle      0.0615894
		Randomize      (-0.973, -0.279, -0.275)
		colorDistMagn   0.323094
		colorDistFreq   6.68804
		detailScale     2623.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.365894
		terraceProb     0.312373
		erosion         0
		montesMagn      0.581178
		montesFreq      3.00991
		montesSpiky     0.976851
		montesFraction  0.58388
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.2128
		hillsFraction   0.531927
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222188
		craterFreq      0.279135
		craterDensity   1.05557
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.7225
		volcanoTemp     1699.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.242, 0.266, 0.050)
		colorShelf     (0.291, 0.284, 0.306, 0.040)
		colorBeach     (0.335, 0.325, 0.346, 0.030)
		colorDesert    (0.379, 0.367, 0.392, 0.020)
		colorLowland   (0.422, 0.408, 0.432, 0.030)
		colorUpland    (0.466, 0.450, 0.472, 0.050)
		colorRock      (0.510, 0.491, 0.526, 0.020)
		colorSnow      (0.510, 0.491, 0.526, 1.000)
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
		SemiMajorAxis   0.000578107
		Period          0.000742695
		Eccentricity    5.50821e-006
		Inclination     -0.00456366
		AscendingNode   0.879886
		ArgOfPericenter 88.5845
		MeanAnomaly     -163.033
	}
}

DwarfMoon	"8.D2"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            5.20948e-007
	Radius          127.656
	InertiaMoment   0.397486

	Oblateness      0.249

	Obliquity       -0.0114335
	EqAscendNode    -64.6663
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.495 0.487 0.483)

	Surface
	{
		SurfStyle       0.900559
		OceanStyle      0.680751
		Randomize      (-0.330, -0.401, -0.354)
		colorDistMagn   0.128868
		colorDistFreq   9.92269
		detailScale     3485.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.307209
		terraceProb     0.28811
		erosion         0
		montesMagn      0.463315
		montesFreq      2.17611
		montesSpiky     0.876834
		montesFraction  0.782473
		dunesFraction   0
		hillsMagn       0
		hillsFreq       34.4027
		hillsFraction   0.533543
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230566
		craterFreq      0.564866
		craterDensity   0.997746
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.7301
		volcanoTemp     1484.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.171, 0.193, 0.050)
		colorShelf     (0.198, 0.200, 0.222, 0.040)
		colorBeach     (0.228, 0.229, 0.251, 0.030)
		colorDesert    (0.258, 0.258, 0.285, 0.020)
		colorLowland   (0.287, 0.288, 0.314, 0.030)
		colorUpland    (0.317, 0.317, 0.343, 0.050)
		colorRock      (0.347, 0.346, 0.381, 0.020)
		colorSnow      (0.347, 0.346, 0.381, 1.000)
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
		SemiMajorAxis   0.000883549
		Period          0.00140328
		Eccentricity    5.07139e-005
		Inclination     -0.0114335
		AscendingNode   -64.6663
		ArgOfPericenter -71.9041
		MeanAnomaly     -91.7625
	}
}

Moon	"8.1"
{
	ParentBody     "8"
	Class	       "Desert"

	Mass            0.0346496
	Radius          2819.2
	InertiaMoment   0.350527

	Oblateness      0.0066821

	Obliquity       -0.198
	EqAscendNode    121.068
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.623 0.617 0.612)

	Surface
	{
		SurfStyle       0.954522
		OceanStyle      0.0148907
		Randomize      (-0.754, -0.891, 0.277)
		colorDistMagn   0.0929378
		colorDistFreq   353.139
		detailScale     7251.14
		colorConversion true
		seaLevel        0.0293681
		snowLevel       2
		tropicLatitude  0.00340048
		icecapLatitude  1
		icecapHeight    0.0293681
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.39929
		venusFreq       1.04465
		venusMagn       0.422205
		mareFreq        0.834143
		mareDensity     0.00640122
		terraceProb     0.156457
		erosion         0
		montesMagn      0.159727
		montesFreq      109.322
		montesSpiky     0.923303
		montesFraction  0.563769
		dunesMagn       0.0459357
		dunesFreq       27.6081
		dunesFraction   0.0995611
		hillsMagn       0.128656
		hillsFreq       300.489
		hillsFraction   0
		hills2Fraction  0
		riversMagn      60.2632
		riversFreq      2.89236
		riversSin       4.80691
		riversOctaves   0
		canyonsMagn     0.0435761
		canyonsFreq     68.9822
		canyonFraction  0
		cracksMagn      0.102276
		cracksFreq      0.255595
		cracksOctaves   0
		craterMagn      0.644963
		craterFreq      7.6189
		craterDensity   0.521693
		craterOctaves   6.66089
		volcanoMagn     0.70412
		volcanoFreq     3.09666
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.443531
		volcanoRadius   0.612768
		volcanoTemp     1415.45
		lavaCoverTidal  0.487188
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
		Hapke           0.990517
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
		Height          140.96
		Density         0.00094832
		Pressure        0.00108266
		Greenhouse      1.45161
		Bright          3.93904
		Opacity         1
		SkyLight        1.31301
		Hue             0
		Saturation      0.864276

		Composition
		{
			H2O   	64.0752
			CO2   	25.8623
			NH3   	5.44461
			CH4   	2.86659
			C2H4  	1.00743
			SO2   	0.287159
			C2H6  	0.184858
			C2H2  	0.146927
			H2S   	0.0745012
			N2    	0.0458787
			C3H8  	0.00406016
			CO    	0.000300058
			Ar    	0.00015406
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00151896
		Period          0.00316268
		Eccentricity    0.0416366
		Inclination     -0.198
		AscendingNode   121.068
		ArgOfPericenter 154.885
		MeanAnomaly     -173.972
	}
}

Moon	"8.2"
{
	ParentBody     "8"
	Class	       "Selena"

	Mass            0.0418258
	Radius          2818.31
	InertiaMoment   0.345452

	Oblateness      0.00127853

	Obliquity       0.155834
	EqAscendNode    127.368
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.776 0.772 0.770)

	Surface
	{
		SurfStyle       0.784776
		OceanStyle      0.294436
		Randomize      (-0.927, -0.179, 0.147)
		colorDistMagn   0.0881241
		colorDistFreq   355.958
		detailScale     7248.84
		colorConversion true
		drivenDarkening 0
		seaLevel        0.205933
		snowLevel       2
		tropicLatitude  0.00241687
		icecapLatitude  0.646818
		icecapHeight    0.22583
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.92094
		venusFreq       1.15155
		venusMagn       0
		mareFreq        1.50344
		mareDensity     0.00726883
		terraceProb     0.308902
		erosion         0
		montesMagn      0.239343
		montesFreq      141.35
		montesSpiky     0.955598
		montesFraction  0.231085
		dunesMagn       0.0347061
		dunesFreq       3673.37
		dunesFraction   0.371503
		hillsMagn       0.124633
		hillsFreq       285.853
		hillsFraction   0.471356
		hills2Fraction  0
		riversMagn      54.8643
		riversFreq      3.61465
		riversSin       4.91316
		riversOctaves   0
		canyonsMagn     0.504252
		canyonsFreq     1.05103
		canyonFraction  0.147165
		cracksMagn      0.0319407
		cracksFreq      1.48204
		cracksOctaves   0
		craterMagn      0.569634
		craterFreq      7.86353
		craterDensity   0.693594
		craterOctaves   10.4525
		craterRayedFactor 0.261151
		volcanoMagn     0.590981
		volcanoFreq     3.01851
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.194255
		volcanoRadius   0.54348
		volcanoTemp     1446.83
		lavaCoverTidal  0.143289
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.489, 0.471, 0.370, 0.000)
		colorDesert    (0.520, 0.479, 0.378, 0.000)
		colorLowland   (0.427, 0.355, 0.300, 0.000)
		colorUpland    (0.605, 0.548, 0.401, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999526
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          126.099
		Density         4.73825e-005
		Pressure        1.56259e-005
		Greenhouse      0.107993
		Bright          2.16333
		Opacity         0
		SkyLight        0.721111
		Hue             -0.0218925
		Saturation      1

		Composition
		{
			CH4   	79.1553
			N2    	17.6609
			H2    	1.96416
			Ar    	1.10269
			CO    	0.108782
			Ne    	0.00511794
			He    	0.00294099
			Kr    	5.1721e-005
			O2    	3.9213e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00245957
		Period          0.00651641
		Eccentricity    0.011679
		Inclination     0.155834
		AscendingNode   127.368
		ArgOfPericenter -97.4159
		MeanAnomaly     -132.042
	}
}

Moon	"8.3"
{
	ParentBody     "8"
	Class	       "Selena"

	Mass            0.0511186
	Radius          3197.65
	InertiaMoment   0.346923

	Obliquity       -0.864771
	EqAscendNode    3.79504
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.779 0.736 0.685)

	Surface
	{
		SurfStyle       0.34392
		OceanStyle      0.124736
		Randomize      (0.655, 0.071, -0.383)
		colorDistMagn   0.0747315
		colorDistFreq   355.086
		detailScale     8224.53
		colorConversion true
		drivenDarkening 0
		seaLevel        0.155538
		snowLevel       2
		tropicLatitude  0.0301655
		icecapLatitude  0.617724
		icecapHeight    0.191506
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.03736
		venusFreq       1.6455
		venusMagn       0
		mareFreq        1.70694
		mareDensity     0.0058402
		terraceProb     0.237211
		erosion         0
		montesMagn      0.174762
		montesFreq      192.513
		montesSpiky     0.998727
		montesFraction  0.654993
		dunesMagn       0.0446972
		dunesFreq       4254.11
		dunesFraction   0.443461
		hillsMagn       0.132417
		hillsFreq       315.799
		hillsFraction   0.336897
		hills2Fraction  0
		riversMagn      65.071
		riversFreq      2.32778
		riversSin       4.59432
		riversOctaves   0
		canyonsMagn     0.578239
		canyonsFreq     1.14219
		canyonFraction  0.309452
		cracksMagn      0.0425861
		cracksFreq      0.727803
		cracksOctaves   0
		craterMagn      0.587659
		craterFreq      7.54169
		craterDensity   0.779564
		craterOctaves   10.3753
		craterRayedFactor 0.429911
		volcanoMagn     0.694131
		volcanoFreq     3.86065
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.428701
		volcanoRadius   0.713388
		volcanoTemp     1539.3
		lavaCoverTidal  0.15044
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.429, 0.420, 0.411, 0.000)
		colorDesert    (0.374, 0.339, 0.315, 0.000)
		colorLowland   (0.475, 0.449, 0.384, 0.000)
		colorUpland    (0.507, 0.479, 0.418, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.996201
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
		Height          204.539
		Density         0.000379916
		Pressure        0.000139096
		Greenhouse      0.251913
		Bright          3.28048
		Opacity         0
		SkyLight        1.09349
		Hue             -0.0141411
		Saturation      1

		Composition
		{
			CH4   	93.7463
			H2    	3.25233
			N2    	2.97946
			CO    	0.0172834
			Ar    	0.00384708
			He    	0.000623341
			Ne    	0.000131681
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00398263
		Period          0.0134264
		Eccentricity    0.0473666
		Inclination     -0.864771
		AscendingNode   3.79504
		ArgOfPericenter -59.4331
		MeanAnomaly     99.7832
	}
}

DwarfMoon	"8.D3"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.28265e-006
	Radius          214.991
	InertiaMoment   0.398976

	RotationPeriod  10318.2
	Obliquity       79.4987
	EqAscendNode    35.8645

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.576 0.571 0.568)

	Surface
	{
		SurfStyle       0.67956
		OceanStyle      0.541628
		Randomize      (-0.708, 0.399, 0.484)
		colorDistMagn   0.259318
		colorDistFreq   36.9723
		detailScale     5870.69
		colorConversion true
		snowLevel       2
		tropicLatitude  0.661135
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52487
		terraceProb     0.169199
		erosion         0
		montesMagn      0.536981
		montesFreq      2.62255
		montesSpiky     0.958261
		montesFraction  0.514419
		dunesFraction   0
		hillsMagn       0
		hillsFreq       120.231
		hillsFraction   0.804538
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270804
		craterFreq      1.81137
		craterDensity   1.02433
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.3104
		volcanoTemp     1633.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.194, 0.159, 0.000)
		colorShelf     (0.230, 0.200, 0.182, 0.000)
		colorBeach     (0.271, 0.234, 0.216, 0.000)
		colorDesert    (0.294, 0.251, 0.210, 0.000)
		colorLowland   (0.322, 0.268, 0.239, 0.000)
		colorUpland    (0.357, 0.326, 0.290, 0.000)
		colorRock      (0.386, 0.354, 0.312, 0.000)
		colorSnow      (0.420, 0.377, 0.329, 1.000)
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
		SemiMajorAxis   0.0237999
		Period          0.196183
		Eccentricity    0.402904
		Inclination     79.4987
		AscendingNode   35.8645
		ArgOfPericenter -70.4325
		MeanAnomaly     99.8963
	}
}

Moon	"8.4"
{
	ParentBody     "8"
	Class	       "IceWorld"

	Mass            3.45159e-006
	Radius          223.195
	InertiaMoment   0.399896

	Obliquity       66.163
	EqAscendNode    -105.238
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.521 0.509 0.505)

	Surface
	{
		SurfStyle       0.778031
		OceanStyle      0.179272
		Randomize      (0.096, -0.523, 0.411)
		colorDistMagn   0.0564059
		colorDistFreq   24.7948
		detailScale     574.071
		colorConversion true
		drivenDarkening 0.236396
		seaLevel        0.153216
		snowLevel       2
		tropicLatitude  0.923656
		icecapLatitude  1
		icecapHeight    0.153216
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.88941
		venusFreq       1.45492
		venusMagn       0.202216
		mareFreq        0
		mareDensity     1.35035e-006
		terraceProb     0.45259
		erosion         0
		montesMagn      0.0678115
		montesFreq      13.8868
		montesSpiky     0.995958
		montesFraction  0.027067
		dunesMagn       0.0397637
		dunesFreq       291.147
		dunesFraction   0.965712
		hillsMagn       0.121869
		hillsFreq       29.7082
		hillsFraction   0.848872
		hills2Fraction  0.0575864
		riversMagn      63.5842
		riversFreq      3.09768
		riversSin       5.03553
		riversOctaves   0
		canyonsMagn     0.623759
		canyonsFreq     0.0594383
		canyonFraction  0
		cracksMagn      0.0344799
		cracksFreq      0.138143
		cracksOctaves   0
		craterMagn      1.04974
		craterFreq      0.668514
		craterDensity   0.928481
		craterOctaves   8
		craterRayedFactor 0
		volcanoMagn     0.168422
		volcanoFreq     0.867141
		volcanoDensity  0.0601534
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.372108
		volcanoRadius   4.0833
		volcanoTemp     1653.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.334, 0.325, 0.338, 0.250)
		colorShelf     (0.365, 0.371, 0.384, 0.250)
		colorBeach     (0.297, 0.275, 0.293, 0.200)
		colorDesert    (0.276, 0.249, 0.258, 0.200)
		colorLowland   (0.203, 0.193, 0.212, 0.200)
		colorUpland    (0.386, 0.376, 0.384, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.203, 0.193, 0.212, 0.200)
		colorUpPlants  (0.386, 0.376, 0.384, 0.250)
		BumpHeight      11.1598
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
		SemiMajorAxis   0.0241544
		Period          0.200582
		Eccentricity    0.121285
		Inclination     66.163
		AscendingNode   -105.238
		ArgOfPericenter -167.896
		MeanAnomaly     131.221
	}
}

Moon	"8.5"
{
	ParentBody     "8"
	Class	       "IceWorld"

	Mass            5.35538e-006
	Radius          247.113
	InertiaMoment   0.397963

	Obliquity       17.2267
	EqAscendNode    -115.712
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.525 0.361 0.294)

	Surface
	{
		SurfStyle       0.130772
		OceanStyle      0.0315021
		Randomize      (0.227, -0.654, -0.224)
		colorDistMagn   0.0400713
		colorDistFreq   28.7901
		detailScale     635.589
		colorConversion true
		drivenDarkening 0.231581
		seaLevel        0.25199
		snowLevel       2
		tropicLatitude  0.311199
		icecapLatitude  1
		icecapHeight    0.25199
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.57225
		venusFreq       1.1979
		venusMagn       0.256849
		mareFreq        0
		mareDensity     1.91183e-006
		terraceProb     0.259758
		erosion         0
		montesMagn      0.0687114
		montesFreq      11.4601
		montesSpiky     0.913257
		montesFraction  0.34721
		dunesMagn       0.0261231
		dunesFreq       330.542
		dunesFraction   0.221038
		hillsMagn       0.115684
		hillsFreq       26.8994
		hillsFraction   0.337275
		hills2Fraction  0.193065
		riversMagn      57.1145
		riversFreq      2.87213
		riversSin       6.25129
		riversOctaves   0
		canyonsMagn     0.449676
		canyonsFreq     0.0755878
		canyonFraction  0
		cracksMagn      0.057639
		cracksFreq      0.0811598
		cracksOctaves   0
		craterMagn      0.922375
		craterFreq      0.812124
		craterDensity   0.930764
		craterOctaves   8
		craterRayedFactor 0.482715
		volcanoMagn     0.224006
		volcanoFreq     0.930554
		volcanoDensity  0.0514096
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.208903
		volcanoRadius   3.89483
		volcanoTemp     1576.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.525, 0.361, 0.294, 0.500)
		colorShelf     (0.499, 0.343, 0.279, 0.500)
		colorBeach     (0.368, 0.253, 0.206, 0.750)
		colorDesert    (0.446, 0.307, 0.250, 1.000)
		colorLowland   (0.462, 0.318, 0.258, 1.000)
		colorUpland    (0.488, 0.336, 0.273, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.462, 0.318, 0.258, 1.000)
		colorUpPlants  (0.488, 0.336, 0.273, 1.000)
		BumpHeight      12.3557
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
		SemiMajorAxis   0.0246566
		Period          0.206871
		Eccentricity    0.194675
		Inclination     17.2267
		AscendingNode   -115.712
		ArgOfPericenter -159.919
		MeanAnomaly     -130.922
	}
}

DwarfMoon	"8.D4"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.63747e-011
	Radius          3.44246
	InertiaMoment   0.399116

	Obliquity       20.7807
	EqAscendNode    -13.8348
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.689 0.639 0.591)

	Surface
	{
		SurfStyle       0.490582
		OceanStyle      0.786064
		Randomize      (0.005, -0.034, -0.534)
		colorDistMagn   0.210752
		colorDistFreq   0.00884828
		detailScale     94.0021
		colorConversion true
		snowLevel       2
		tropicLatitude  0.659281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.625079
		terraceProb     0.152617
		erosion         0
		montesMagn      0.602821
		montesFreq      3.32587
		montesSpiky     0.826979
		montesFraction  0.27793
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0276664
		hillsFraction   0.52423
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246773
		craterFreq      0.215326
		craterDensity   0.956863
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   133.379
		volcanoTemp     1439.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.256, 0.237, 0.000)
		colorShelf     (0.293, 0.272, 0.251, 0.000)
		colorBeach     (0.310, 0.288, 0.266, 0.000)
		colorDesert    (0.327, 0.304, 0.281, 0.000)
		colorLowland   (0.344, 0.319, 0.296, 0.000)
		colorUpland    (0.362, 0.335, 0.311, 0.000)
		colorRock      (0.379, 0.351, 0.325, 0.000)
		colorSnow      (0.396, 0.367, 0.340, 1.000)
		BumpHeight      3.09822
		BumpOffset      0.619643
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
		SemiMajorAxis   0.0252087
		Period          0.213858
		Eccentricity    0.327034
		Inclination     20.7807
		AscendingNode   -13.8348
		ArgOfPericenter 164.768
		MeanAnomaly     -114.814
	}
}

DwarfMoon	"8.D5"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.20452e-011
	Radius          5.60309
	InertiaMoment   0.394723

	Obliquity       -32.8616
	EqAscendNode    -161.218
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.638 0.472 0.391)

	Surface
	{
		SurfStyle       0.132028
		OceanStyle      0.405195
		Randomize      (-0.350, 0.576, 0.558)
		colorDistMagn   0.556203
		colorDistFreq   0.0267193
		detailScale     153.002
		colorConversion true
		snowLevel       2
		tropicLatitude  0.176381
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.444339
		terraceProb     0.211651
		erosion         0
		montesMagn      0.486576
		montesFreq      2.65578
		montesSpiky     0.853093
		montesFraction  0.435163
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0681491
		hillsFraction   0.596807
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25515
		craterFreq      0.269232
		craterDensity   0.804227
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   155.186
		volcanoTemp     1619.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.189, 0.156, 0.000)
		colorShelf     (0.271, 0.201, 0.166, 0.000)
		colorBeach     (0.287, 0.212, 0.176, 0.000)
		colorDesert    (0.303, 0.224, 0.186, 0.000)
		colorLowland   (0.319, 0.236, 0.195, 0.000)
		colorUpland    (0.335, 0.248, 0.205, 0.000)
		colorRock      (0.351, 0.260, 0.215, 0.000)
		colorSnow      (0.367, 0.271, 0.225, 1.000)
		BumpHeight      5.04278
		BumpOffset      1.00856
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
		SemiMajorAxis   0.0257341
		Period          0.220578
		Eccentricity    0.328698
		Inclination     -32.8616
		AscendingNode   -161.218
		ArgOfPericenter 120.161
		MeanAnomaly     -161.325
	}
}

DwarfMoon	"8.D6"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            5.77396e-011
	Radius          5.75378
	InertiaMoment   0.398163

	RotationPeriod  7987.48
	Obliquity       -84.4091
	EqAscendNode    132.402

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.589 0.587 0.584)

	Surface
	{
		SurfStyle       0.611481
		OceanStyle      0.883564
		Randomize      (0.615, -0.089, 0.924)
		colorDistMagn   0.784771
		colorDistFreq   0.0138494
		detailScale     157.117
		colorConversion true
		snowLevel       2
		tropicLatitude  0.735593
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.611062
		terraceProb     0.278547
		erosion         0
		montesMagn      0.518747
		montesFreq      2.38175
		montesSpiky     0.932251
		montesFraction  0.429732
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0859633
		hillsFraction   0.707431
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232145
		craterFreq      0.273772
		craterDensity   0.854158
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   118.72
		volcanoTemp     1217.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.199, 0.163, 0.000)
		colorShelf     (0.236, 0.205, 0.187, 0.000)
		colorBeach     (0.277, 0.241, 0.222, 0.000)
		colorDesert    (0.301, 0.258, 0.216, 0.000)
		colorLowland   (0.330, 0.276, 0.245, 0.000)
		colorUpland    (0.365, 0.334, 0.298, 0.000)
		colorRock      (0.395, 0.364, 0.321, 0.000)
		colorSnow      (0.430, 0.387, 0.339, 1.000)
		BumpHeight      5.1784
		BumpOffset      1.03568
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
		SemiMajorAxis   0.026293
		Period          0.227802
		Eccentricity    0.0718177
		Inclination     -84.4091
		AscendingNode   132.402
		ArgOfPericenter -27.1634
		MeanAnomaly     94.6693
	}
}

DwarfMoon	"8.D7"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            9.80267e-011
	Radius          6.54971
	InertiaMoment   0.399252

	Obliquity       34.0463
	EqAscendNode    99.7559
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.504 0.393 0.328)

	Surface
	{
		SurfStyle       0.370655
		OceanStyle      0.223608
		Randomize      (0.590, 0.975, -0.255)
		colorDistMagn   0.605096
		colorDistFreq   0.0133076
		detailScale     178.851
		colorConversion true
		snowLevel       2
		tropicLatitude  0.672973
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.287669
		terraceProb     0.326324
		erosion         0
		montesMagn      0.670622
		montesFreq      2.52336
		montesSpiky     0.91868
		montesFraction  0.402285
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.131527
		hillsFraction   0.797735
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266429
		craterFreq      0.230971
		craterDensity   1.02288
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   103.718
		volcanoTemp     1703.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.157, 0.131, 0.000)
		colorShelf     (0.214, 0.167, 0.140, 0.000)
		colorBeach     (0.227, 0.177, 0.148, 0.000)
		colorDesert    (0.239, 0.187, 0.156, 0.000)
		colorLowland   (0.252, 0.197, 0.164, 0.000)
		colorUpland    (0.264, 0.207, 0.172, 0.000)
		colorRock      (0.277, 0.216, 0.181, 0.000)
		colorSnow      (0.290, 0.226, 0.189, 1.000)
		BumpHeight      5.89474
		BumpOffset      1.17895
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
		SemiMajorAxis   0.0268925
		Period          0.235638
		Eccentricity    0.221032
		Inclination     34.0463
		AscendingNode   99.7559
		ArgOfPericenter 164.247
		MeanAnomaly     -136.126
	}
}

DwarfMoon	"8.D8"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.5913e-010
	Radius          7.39273
	InertiaMoment   0.396211

	Obliquity       13.3164
	EqAscendNode    26.28
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.778 0.775 0.774)

	Surface
	{
		SurfStyle       0.42628
		OceanStyle      0.238718
		Randomize      (0.628, 0.929, 0.069)
		colorDistMagn   0.589997
		colorDistFreq   0.0224933
		detailScale     201.871
		colorConversion true
		snowLevel       2
		tropicLatitude  0.437165
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533701
		terraceProb     0.307691
		erosion         0
		montesMagn      0.58852
		montesFreq      3.47705
		montesSpiky     0.817296
		montesFraction  0.539468
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.135112
		hillsFraction   0.723274
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250529
		craterFreq      0.232518
		craterDensity   0.993764
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   91.883
		volcanoTemp     1676.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.310, 0.309, 0.000)
		colorShelf     (0.330, 0.329, 0.329, 0.000)
		colorBeach     (0.350, 0.349, 0.348, 0.000)
		colorDesert    (0.369, 0.368, 0.367, 0.000)
		colorLowland   (0.389, 0.387, 0.387, 0.000)
		colorUpland    (0.408, 0.407, 0.406, 0.000)
		colorRock      (0.428, 0.426, 0.426, 0.000)
		colorSnow      (0.447, 0.446, 0.445, 1.000)
		BumpHeight      6.65345
		BumpOffset      1.33069
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
		SemiMajorAxis   0.0275335
		Period          0.244112
		Eccentricity    0.0312163
		Inclination     13.3164
		AscendingNode   26.28
		ArgOfPericenter 87.9462
		MeanAnomaly     -103.409
	}
}

DwarfMoon	"8.D9"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.4947e-010
	Radius          8.01113
	InertiaMoment   0.398346

	Obliquity       44.395
	EqAscendNode    -46.0888
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.802 0.801 0.797)

	Surface
	{
		SurfStyle       0.409004
		OceanStyle      0.783129
		Randomize      (-0.763, 0.829, 0.795)
		colorDistMagn   0.768728
		colorDistFreq   0.0539106
		detailScale     218.757
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985252
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.463835
		terraceProb     0.309993
		erosion         0
		montesMagn      0.427937
		montesFreq      2.808
		montesSpiky     0.89943
		montesFraction  0.549866
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.11425
		hillsFraction   0.683796
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227494
		craterFreq      0.218303
		craterDensity   0.765482
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   79.5226
		volcanoTemp     1292.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.320, 0.319, 0.000)
		colorShelf     (0.341, 0.340, 0.339, 0.000)
		colorBeach     (0.361, 0.360, 0.359, 0.000)
		colorDesert    (0.381, 0.380, 0.379, 0.000)
		colorLowland   (0.401, 0.400, 0.399, 0.000)
		colorUpland    (0.421, 0.420, 0.419, 0.000)
		colorRock      (0.441, 0.440, 0.439, 0.000)
		colorSnow      (0.461, 0.460, 0.459, 1.000)
		BumpHeight      7.21002
		BumpOffset      1.442
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
		SemiMajorAxis   0.0281977
		Period          0.252999
		Eccentricity    0.20143
		Inclination     44.395
		AscendingNode   -46.0888
		ArgOfPericenter 122.284
		MeanAnomaly     168.412
	}
}

DwarfMoon	"8.D10"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.80388e-010
	Radius          10.8812
	InertiaMoment   0.399384

	Obliquity       58.6247
	EqAscendNode    -156.783
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.561 0.557 0.554)

	Surface
	{
		SurfStyle       0.536714
		OceanStyle      0.852953
		Randomize      (-0.165, -0.452, -0.394)
		colorDistMagn   0.957208
		colorDistFreq   0.0870962
		detailScale     297.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.338485
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.284136
		terraceProb     0.368709
		erosion         0
		montesMagn      0.434531
		montesFreq      2.79597
		montesSpiky     0.983886
		montesFraction  0.869362
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.297854
		hillsFraction   0.707728
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218433
		craterFreq      0.206097
		craterDensity   1.00529
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   87.4723
		volcanoTemp     1319.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.189, 0.155, 0.000)
		colorShelf     (0.224, 0.195, 0.177, 0.000)
		colorBeach     (0.264, 0.228, 0.211, 0.000)
		colorDesert    (0.286, 0.245, 0.205, 0.000)
		colorLowland   (0.314, 0.262, 0.233, 0.000)
		colorUpland    (0.348, 0.317, 0.283, 0.000)
		colorRock      (0.376, 0.345, 0.305, 0.000)
		colorSnow      (0.409, 0.367, 0.321, 1.000)
		BumpHeight      9.79311
		BumpOffset      1.95862
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
		SemiMajorAxis   0.0285897
		Period          0.258293
		Eccentricity    0.230033
		Inclination     58.6247
		AscendingNode   -156.783
		ArgOfPericenter -74.9621
		MeanAnomaly     53.482
	}
}

DwarfMoon	"8.D11"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            5.67101e-010
	Radius          11.8264
	InertiaMoment   0.396786

	Obliquity       34.1903
	EqAscendNode    112.437
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.667 0.577 0.501)

	Surface
	{
		SurfStyle       0.850787
		OceanStyle      0.803807
		Randomize      (-0.569, 0.728, 0.737)
		colorDistMagn   0.253698
		colorDistFreq   0.0894646
		detailScale     322.938
		colorConversion true
		snowLevel       2
		tropicLatitude  0.593624
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.378899
		terraceProb     0.483667
		erosion         0
		montesMagn      0.565714
		montesFreq      3.12973
		montesSpiky     0.992809
		montesFraction  0.186737
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.358537
		hillsFraction   0.622789
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213751
		craterFreq      0.238199
		craterDensity   1.0252
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   77.8622
		volcanoTemp     1419.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.202, 0.200, 0.050)
		colorShelf     (0.267, 0.236, 0.231, 0.040)
		colorBeach     (0.307, 0.271, 0.261, 0.030)
		colorDesert    (0.347, 0.306, 0.296, 0.020)
		colorLowland   (0.387, 0.340, 0.326, 0.030)
		colorUpland    (0.427, 0.375, 0.356, 0.050)
		colorRock      (0.467, 0.409, 0.396, 0.020)
		colorSnow      (0.467, 0.409, 0.396, 1.000)
		BumpHeight      10.6437
		BumpOffset      2.12874
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
		SemiMajorAxis   0.0288622
		Period          0.261995
		Eccentricity    0.0118801
		Inclination     34.1903
		AscendingNode   112.437
		ArgOfPericenter 75.4735
		MeanAnomaly     82.1134
	}
}

DwarfMoon	"8.D12"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            8.2998e-010
	Radius          12.8982
	InertiaMoment   0.398516

	Obliquity       53.3904
	EqAscendNode    37.0415
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.716 0.650 0.582)

	Surface
	{
		SurfStyle       0.503304
		OceanStyle      0.996494
		Randomize      (-0.295, -0.772, 0.117)
		colorDistMagn   0.612087
		colorDistFreq   0.0592792
		detailScale     352.208
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98733
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.476966
		terraceProb     0.307189
		erosion         0
		montesMagn      0.502156
		montesFreq      2.63922
		montesSpiky     0.909008
		montesFraction  0.782313
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.353522
		hillsFraction   0.721394
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277309
		craterFreq      0.240948
		craterDensity   0.899055
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   70.1944
		volcanoTemp     1527.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.221, 0.163, 0.000)
		colorShelf     (0.287, 0.227, 0.186, 0.000)
		colorBeach     (0.337, 0.266, 0.221, 0.000)
		colorDesert    (0.365, 0.286, 0.215, 0.000)
		colorLowland   (0.401, 0.305, 0.244, 0.000)
		colorUpland    (0.444, 0.370, 0.297, 0.000)
		colorRock      (0.480, 0.403, 0.320, 0.000)
		colorSnow      (0.523, 0.429, 0.337, 1.000)
		BumpHeight      11.6084
		BumpOffset      2.32168
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
		SemiMajorAxis   0.0294092
		Period          0.269478
		Eccentricity    0.091502
		Inclination     53.3904
		AscendingNode   37.0415
		ArgOfPericenter -65.4789
		MeanAnomaly     31.2324
	}
}

DwarfMoon	"8.D13"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.19625e-009
	Radius          13.7652
	InertiaMoment   0.399514

	RotationPeriod  4875.57
	Obliquity       -4.362
	EqAscendNode    -142.054

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.420 0.415 0.408)

	Surface
	{
		SurfStyle       0.310707
		OceanStyle      0.119688
		Randomize      (0.933, 0.283, -0.710)
		colorDistMagn   0.509314
		colorDistFreq   0.1517
		detailScale     375.882
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0494413
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.520949
		terraceProb     0.131293
		erosion         0
		montesMagn      0.655481
		montesFreq      2.99174
		montesSpiky     0.986122
		montesFraction  0.422174
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.504829
		hillsFraction   0.636116
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220742
		craterFreq      0.219872
		craterDensity   0.93679
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   62.399
		volcanoTemp     1379.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.166, 0.163, 0.000)
		colorShelf     (0.179, 0.176, 0.173, 0.000)
		colorBeach     (0.189, 0.187, 0.184, 0.000)
		colorDesert    (0.200, 0.197, 0.194, 0.000)
		colorLowland   (0.210, 0.208, 0.204, 0.000)
		colorUpland    (0.221, 0.218, 0.214, 0.000)
		colorRock      (0.231, 0.228, 0.224, 0.000)
		colorSnow      (0.242, 0.239, 0.235, 1.000)
		BumpHeight      12.3887
		BumpOffset      2.47774
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
		SemiMajorAxis   0.0300333
		Period          0.278101
		Eccentricity    0.386655
		Inclination     -4.362
		AscendingNode   -142.054
		ArgOfPericenter -46.5562
		MeanAnomaly     -14.1892
	}
}

DwarfMoon	"8.D14"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.70232e-009
	Radius          18.1098
	InertiaMoment   0.397175

	Obliquity       44.7774
	EqAscendNode    -127.147
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.625 0.622 0.620)

	Surface
	{
		SurfStyle       0.976495
		OceanStyle      0.259814
		Randomize      (-0.687, 0.481, 0.194)
		colorDistMagn   0.240751
		colorDistFreq   0.0631492
		detailScale     494.517
		colorConversion true
		snowLevel       2
		tropicLatitude  0.595349
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48233
		terraceProb     0.271703
		erosion         0
		montesMagn      0.432526
		montesFreq      3.33791
		montesSpiky     0.93882
		montesFraction  0.853793
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.756599
		hillsFraction   0.714738
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23357
		craterFreq      0.222637
		craterDensity   0.853583
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   68.8175
		volcanoTemp     1068.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.218, 0.248, 0.050)
		colorShelf     (0.250, 0.255, 0.285, 0.040)
		colorBeach     (0.288, 0.292, 0.322, 0.030)
		colorDesert    (0.325, 0.330, 0.366, 0.020)
		colorLowland   (0.363, 0.367, 0.403, 0.030)
		colorUpland    (0.400, 0.404, 0.440, 0.050)
		colorRock      (0.438, 0.442, 0.490, 0.020)
		colorSnow      (0.438, 0.442, 0.490, 1.000)
		BumpHeight      16.2988
		BumpOffset      3.25976
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
		SemiMajorAxis   0.0304403
		Period          0.283774
		Eccentricity    0.122392
		Inclination     44.7774
		AscendingNode   -127.147
		ArgOfPericenter -52.6122
		MeanAnomaly     5.74858
	}
}

DwarfMoon	"8.D15"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.39679e-009
	Radius          19.2353
	InertiaMoment   0.398675

	RotationPeriod  6381.99
	Obliquity       20.1502
	EqAscendNode    -45.78

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.750 0.643 0.569)

	Surface
	{
		SurfStyle       0.737213
		OceanStyle      0.100124
		Randomize      (-0.407, -0.391, -0.239)
		colorDistMagn   0.656131
		colorDistFreq   0.183357
		detailScale     525.253
		colorConversion true
		snowLevel       2
		tropicLatitude  0.601901
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.499053
		terraceProb     0.218885
		erosion         0
		montesMagn      0.511455
		montesFreq      2.82167
		montesSpiky     0.922448
		montesFraction  0.514868
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.721241
		hillsFraction   0.595424
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211759
		craterFreq      0.170421
		craterDensity   0.905321
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   61.6015
		volcanoTemp     1644.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.219, 0.159, 0.000)
		colorShelf     (0.300, 0.225, 0.182, 0.000)
		colorBeach     (0.353, 0.264, 0.216, 0.000)
		colorDesert    (0.383, 0.283, 0.211, 0.000)
		colorLowland   (0.420, 0.302, 0.239, 0.000)
		colorUpland    (0.465, 0.366, 0.290, 0.000)
		colorRock      (0.503, 0.399, 0.313, 0.000)
		colorSnow      (0.548, 0.424, 0.330, 1.000)
		BumpHeight      17.3118
		BumpOffset      3.46236
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
		SemiMajorAxis   0.0309706
		Period          0.291222
		Eccentricity    0.494711
		Inclination     20.1502
		AscendingNode   -45.78
		ArgOfPericenter -152.025
		MeanAnomaly     122.961
	}
}

DwarfMoon	"8.D16"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.34472e-009
	Radius          20.6457
	InertiaMoment   0.399641

	Obliquity       75.5178
	EqAscendNode    -86.926
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.694 0.690 0.685)

	Surface
	{
		SurfStyle       0.724962
		OceanStyle      0.197986
		Randomize      (-0.225, 0.982, 0.983)
		colorDistMagn   0.545212
		colorDistFreq   0.235232
		detailScale     563.764
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999925
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.321666
		terraceProb     0.136676
		erosion         0
		montesMagn      0.588143
		montesFreq      3.07495
		montesSpiky     0.927281
		montesFraction  0.419614
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.938797
		hillsFraction   0.488027
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217799
		craterFreq      0.278616
		craterDensity   0.754511
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   55.9699
		volcanoTemp     1413.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.235, 0.192, 0.000)
		colorShelf     (0.278, 0.241, 0.219, 0.000)
		colorBeach     (0.326, 0.283, 0.260, 0.000)
		colorDesert    (0.354, 0.304, 0.254, 0.000)
		colorLowland   (0.389, 0.324, 0.288, 0.000)
		colorUpland    (0.430, 0.393, 0.349, 0.000)
		colorRock      (0.465, 0.428, 0.377, 0.000)
		colorSnow      (0.507, 0.455, 0.397, 1.000)
		BumpHeight      18.5811
		BumpOffset      3.71622
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
		SemiMajorAxis   0.0316247
		Period          0.300495
		Eccentricity    0.224285
		Inclination     75.5178
		AscendingNode   -86.926
		ArgOfPericenter -74.1619
		MeanAnomaly     -13.0899
	}
}

DwarfMoon	"8.D17"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            4.63329e-009
	Radius          21.8835
	InertiaMoment   0.39748

	RotationPeriod  10816.5
	Obliquity       18.5615
	EqAscendNode    114.91

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.696 0.691 0.687)

	Surface
	{
		SurfStyle       0.301298
		OceanStyle      0.265742
		Randomize      (-0.636, 0.776, -0.831)
		colorDistMagn   0.503193
		colorDistFreq   0.144437
		detailScale     597.565
		colorConversion true
		snowLevel       2
		tropicLatitude  0.337432
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435817
		terraceProb     0.138205
		erosion         0
		montesMagn      0.337261
		montesFreq      1.8217
		montesSpiky     0.97544
		montesFraction  0.284
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.563449
		hillsFraction   0.704763
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25899
		craterFreq      0.257625
		craterDensity   0.911922
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   50.4055
		volcanoTemp     2006.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.277, 0.275, 0.000)
		colorShelf     (0.296, 0.294, 0.292, 0.000)
		colorBeach     (0.313, 0.311, 0.309, 0.000)
		colorDesert    (0.331, 0.328, 0.327, 0.000)
		colorLowland   (0.348, 0.346, 0.344, 0.000)
		colorUpland    (0.365, 0.363, 0.361, 0.000)
		colorRock      (0.383, 0.380, 0.378, 0.000)
		colorSnow      (0.400, 0.398, 0.395, 1.000)
		BumpHeight      19.6951
		BumpOffset      3.93903
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
		SemiMajorAxis   0.0321829
		Period          0.308486
		Eccentricity    0.429484
		Inclination     18.5615
		AscendingNode   114.91
		ArgOfPericenter -154.357
		MeanAnomaly     -104.622
	}
}

DwarfMoon	"8.D18"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            6.37961e-009
	Radius          28.4555
	InertiaMoment   0.398827

	RotationPeriod  5467.79
	Obliquity       -1.35458
	EqAscendNode    -147.575

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.419 0.414 0.408)

	Surface
	{
		SurfStyle       0.0875769
		OceanStyle      0.0998185
		Randomize      (-0.801, -0.273, 0.103)
		colorDistMagn   0.836804
		colorDistFreq   0.443399
		detailScale     777.026
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0132014
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.318048
		terraceProb     0.146165
		erosion         0
		montesMagn      0.594761
		montesFreq      3.23419
		montesSpiky     0.81773
		montesFraction  0.50629
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.60294
		hillsFraction   0.777887
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208783
		craterFreq      0.243332
		craterDensity   0.85446
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   55.8567
		volcanoTemp     1573.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.166, 0.163, 0.000)
		colorShelf     (0.178, 0.176, 0.173, 0.000)
		colorBeach     (0.189, 0.186, 0.184, 0.000)
		colorDesert    (0.199, 0.197, 0.194, 0.000)
		colorLowland   (0.210, 0.207, 0.204, 0.000)
		colorUpland    (0.220, 0.217, 0.214, 0.000)
		colorRock      (0.231, 0.228, 0.224, 0.000)
		colorSnow      (0.241, 0.238, 0.235, 1.000)
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
		SemiMajorAxis   0.0324186
		Period          0.311882
		Eccentricity    0.2036
		Inclination     -1.35458
		AscendingNode   -147.575
		ArgOfPericenter -26.0065
		MeanAnomaly     45.3119
	}
}

DwarfMoon	"8.D19"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            8.74145e-009
	Radius          29.7924
	InertiaMoment   0.399768

	RotationPeriod  16772.3
	Obliquity       16.7967
	EqAscendNode    70.5267

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.565 0.560 0.554)

	Surface
	{
		SurfStyle       0.402751
		OceanStyle      0.204657
		Randomize      (-0.410, 0.121, 0.320)
		colorDistMagn   0.76343
		colorDistFreq   0.188391
		detailScale     813.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.458579
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.458338
		terraceProb     0.12174
		erosion         0
		montesMagn      0.516491
		montesFreq      3.0558
		montesSpiky     0.999925
		montesFraction  0.743556
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.49266
		hillsFraction   0.78636
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261835
		craterFreq      0.267337
		craterDensity   0.940358
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   49.9596
		volcanoTemp     1578.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.224, 0.222, 0.000)
		colorShelf     (0.240, 0.238, 0.235, 0.000)
		colorBeach     (0.254, 0.252, 0.249, 0.000)
		colorDesert    (0.268, 0.266, 0.263, 0.000)
		colorLowland   (0.283, 0.280, 0.277, 0.000)
		colorUpland    (0.297, 0.294, 0.291, 0.000)
		colorRock      (0.311, 0.308, 0.305, 0.000)
		colorSnow      (0.325, 0.322, 0.319, 1.000)
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
		SemiMajorAxis   0.0329029
		Period          0.318896
		Eccentricity    0.436783
		Inclination     16.7967
		AscendingNode   70.5267
		ArgOfPericenter -47.1872
		MeanAnomaly     -15.6718
	}
}

DwarfMoon	"8.D20"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.19322e-008
	Radius          31.7269
	InertiaMoment   0.397735

	Obliquity       31.0938
	EqAscendNode    174.424
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.776 0.774 0.771)

	Surface
	{
		SurfStyle       0.333534
		OceanStyle      0.367714
		Randomize      (0.300, -0.088, -0.697)
		colorDistMagn   0.519326
		colorDistFreq   0.403124
		detailScale     866.356
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0502273
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.721029
		terraceProb     0.594823
		erosion         0
		montesMagn      0.609425
		montesFreq      3.11504
		montesSpiky     0.921287
		montesFraction  0.701158
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.14795
		hillsFraction   0.695629
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235378
		craterFreq      0.149712
		craterDensity   0.863192
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   45.5379
		volcanoTemp     1957.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.309, 0.308, 0.000)
		colorShelf     (0.330, 0.329, 0.327, 0.000)
		colorBeach     (0.349, 0.348, 0.347, 0.000)
		colorDesert    (0.368, 0.367, 0.366, 0.000)
		colorLowland   (0.388, 0.387, 0.385, 0.000)
		colorUpland    (0.407, 0.406, 0.405, 0.000)
		colorRock      (0.427, 0.426, 0.424, 0.000)
		colorSnow      (0.446, 0.445, 0.443, 1.000)
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
		SemiMajorAxis   0.0334716
		Period          0.327201
		Eccentricity    0.0614135
		Inclination     31.0938
		AscendingNode   174.424
		ArgOfPericenter 141.42
		MeanAnomaly     -110.186
	}
}

DwarfMoon	"8.D21"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.62417e-008
	Radius          33.5643
	InertiaMoment   0.398973

	Obliquity       0.801786
	EqAscendNode    -34.8381
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.464 0.460 0.455)

	Surface
	{
		SurfStyle       0.830598
		OceanStyle      0.704103
		Randomize      (0.448, 0.364, -0.172)
		colorDistMagn   0.877951
		colorDistFreq   0.644641
		detailScale     916.529
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0267017
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.529878
		terraceProb     0.388209
		erosion         0
		montesMagn      0.526907
		montesFreq      2.13262
		montesSpiky     0.836865
		montesFraction  0.610053
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.27367
		hillsFraction   0.799006
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269302
		craterFreq      0.272642
		craterDensity   0.726509
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.2922
		volcanoTemp     1846.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.156, 0.127, 0.000)
		colorShelf     (0.186, 0.161, 0.146, 0.000)
		colorBeach     (0.218, 0.189, 0.173, 0.000)
		colorDesert    (0.237, 0.202, 0.168, 0.000)
		colorLowland   (0.260, 0.216, 0.191, 0.000)
		colorUpland    (0.288, 0.262, 0.232, 0.000)
		colorRock      (0.311, 0.285, 0.250, 0.000)
		colorSnow      (0.339, 0.304, 0.264, 1.000)
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
		SemiMajorAxis   0.0336722
		Period          0.330146
		Eccentricity    0.0701476
		Inclination     0.801786
		AscendingNode   -34.8381
		ArgOfPericenter -15.7131
		MeanAnomaly     5.74169
	}
}

DwarfMoon	"8.D22"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.20655e-008
	Radius          43.6416
	InertiaMoment   0.399893

	RotationPeriod  3972.67
	Obliquity       -27.8697
	EqAscendNode    -172.835

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.520 0.455 0.358)

	Surface
	{
		SurfStyle       0.130949
		OceanStyle      0.799888
		Randomize      (-0.614, -0.213, 0.304)
		colorDistMagn   0.962055
		colorDistFreq   1.21067
		detailScale     1191.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0583946
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.469898
		terraceProb     0.315623
		erosion         0
		montesMagn      0.347868
		montesFreq      3.58653
		montesSpiky     0.800128
		montesFraction  0.305135
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.15687
		hillsFraction   0.500768
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256743
		craterFreq      0.268913
		craterDensity   1.03735
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.0627
		volcanoTemp     1577.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.182, 0.143, 0.000)
		colorShelf     (0.221, 0.193, 0.152, 0.000)
		colorBeach     (0.234, 0.205, 0.161, 0.000)
		colorDesert    (0.247, 0.216, 0.170, 0.000)
		colorLowland   (0.260, 0.227, 0.179, 0.000)
		colorUpland    (0.273, 0.239, 0.188, 0.000)
		colorRock      (0.286, 0.250, 0.197, 0.000)
		colorSnow      (0.299, 0.261, 0.206, 1.000)
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
		SemiMajorAxis   0.0343322
		Period          0.3399
		Eccentricity    0.389228
		Inclination     -27.8697
		AscendingNode   -172.835
		ArgOfPericenter -153.154
		MeanAnomaly     -118.749
	}
}

DwarfMoon	"8.D23"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.99473e-008
	Radius          45.2035
	InertiaMoment   0.397958

	RotationPeriod  15061.5
	Obliquity       39.1311
	EqAscendNode    -9.023

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.403 0.400 0.398)

	Surface
	{
		SurfStyle       0.70139
		OceanStyle      0.142503
		Randomize      (-0.708, 0.541, -0.706)
		colorDistMagn   0.548732
		colorDistFreq   1.72491
		detailScale     1234.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0.978052
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.416068
		terraceProb     0.542891
		erosion         0
		montesMagn      0.463017
		montesFreq      1.67312
		montesSpiky     0.828782
		montesFraction  0.561006
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.6947
		hillsFraction   0.636074
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236089
		craterFreq      0.238084
		craterDensity   0.864218
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   40.9542
		volcanoTemp     1601.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.157, 0.136, 0.111, 0.000)
		colorShelf     (0.161, 0.140, 0.127, 0.000)
		colorBeach     (0.189, 0.164, 0.151, 0.000)
		colorDesert    (0.206, 0.176, 0.147, 0.000)
		colorLowland   (0.226, 0.188, 0.167, 0.000)
		colorUpland    (0.250, 0.228, 0.203, 0.000)
		colorRock      (0.270, 0.248, 0.219, 0.000)
		colorSnow      (0.294, 0.264, 0.231, 1.000)
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
		SemiMajorAxis   0.0345838
		Period          0.343642
		Eccentricity    0.266968
		Inclination     39.1311
		AscendingNode   -9.023
		ArgOfPericenter -56.0586
		MeanAnomaly     -80.4507
	}
}

DwarfMoon	"8.D24"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            4.06381e-008
	Radius          48.0042
	InertiaMoment   0.399113

	Obliquity       56.2693
	EqAscendNode    172.242
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.737 0.668 0.618)

	Surface
	{
		SurfStyle       0.610383
		OceanStyle      0.286306
		Randomize      (-0.391, -0.234, -0.027)
		colorDistMagn   0.825749
		colorDistFreq   1.06438
		detailScale     1310.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.112339
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.451995
		terraceProb     0.111477
		erosion         0
		montesMagn      0.470617
		montesFreq      1.55486
		montesSpiky     0.961014
		montesFraction  0.242973
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.02401
		hillsFraction   0.700686
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233991
		craterFreq      0.229732
		craterDensity   0.958905
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.3352
		volcanoTemp     1704.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.227, 0.173, 0.000)
		colorShelf     (0.295, 0.234, 0.198, 0.000)
		colorBeach     (0.346, 0.274, 0.235, 0.000)
		colorDesert    (0.376, 0.294, 0.229, 0.000)
		colorLowland   (0.412, 0.314, 0.260, 0.000)
		colorUpland    (0.457, 0.381, 0.315, 0.000)
		colorRock      (0.493, 0.414, 0.340, 0.000)
		colorSnow      (0.538, 0.441, 0.358, 1.000)
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
		SemiMajorAxis   0.0347931
		Period          0.346767
		Eccentricity    0.485767
		Inclination     56.2693
		AscendingNode   172.242
		ArgOfPericenter -8.11539
		MeanAnomaly     -54.931
	}
}

DwarfMoon	"8.D25"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            5.51844e-008
	Radius          50.8752
	InertiaMoment   0.394629

	Obliquity       -47.6874
	EqAscendNode    136.667
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.694 0.578 0.433)

	Surface
	{
		SurfStyle       0.0499714
		OceanStyle      0.94974
		Randomize      (-0.490, 0.102, -0.255)
		colorDistMagn   0.837549
		colorDistFreq   1.67086
		detailScale     1389.23
		colorConversion true
		snowLevel       2
		tropicLatitude  0.525291
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448388
		terraceProb     0.32204
		erosion         0
		montesMagn      0.550099
		montesFreq      3.45286
		montesSpiky     0.926184
		montesFraction  0.395958
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.13204
		hillsFraction   0.404249
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212756
		craterFreq      0.232126
		craterDensity   0.920968
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   33.955
		volcanoTemp     1148.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.231, 0.173, 0.000)
		colorShelf     (0.295, 0.246, 0.184, 0.000)
		colorBeach     (0.312, 0.260, 0.195, 0.000)
		colorDesert    (0.330, 0.275, 0.206, 0.000)
		colorLowland   (0.347, 0.289, 0.216, 0.000)
		colorUpland    (0.364, 0.303, 0.227, 0.000)
		colorRock      (0.382, 0.318, 0.238, 0.000)
		colorSnow      (0.399, 0.332, 0.249, 1.000)
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
		SemiMajorAxis   0.0352975
		Period          0.354335
		Eccentricity    0.206088
		Inclination     -47.6874
		AscendingNode   136.667
		ArgOfPericenter -7.36026
		MeanAnomaly     89.4702
	}
}

DwarfMoon	"8.D26"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            7.50563e-008
	Radius          66.8532
	InertiaMoment   0.398159

	Obliquity       -50.222
	EqAscendNode    138.904
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.671 0.488 0.426)

	Surface
	{
		SurfStyle       0.678687
		OceanStyle      0.125965
		Randomize      (-0.796, -0.721, 0.567)
		colorDistMagn   0.746414
		colorDistFreq   1.82109
		detailScale     1825.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.519495
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.619596
		terraceProb     0.16499
		erosion         0
		montesMagn      0.641451
		montesFreq      4.01205
		montesSpiky     0.994824
		montesFraction  0.583274
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.02789
		hillsFraction   0.58415
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229268
		craterFreq      0.200201
		craterDensity   0.972199
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.2591
		volcanoTemp     1691.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.166, 0.119, 0.000)
		colorShelf     (0.269, 0.171, 0.136, 0.000)
		colorBeach     (0.316, 0.200, 0.162, 0.000)
		colorDesert    (0.342, 0.215, 0.158, 0.000)
		colorLowland   (0.376, 0.229, 0.179, 0.000)
		colorUpland    (0.416, 0.278, 0.217, 0.000)
		colorRock      (0.450, 0.302, 0.234, 0.000)
		colorSnow      (0.490, 0.322, 0.247, 1.000)
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
		SemiMajorAxis   0.0356781
		Period          0.360082
		Eccentricity    0.285208
		Inclination     -50.222
		AscendingNode   138.904
		ArgOfPericenter -165.739
		MeanAnomaly     -48.5318
	}
}

DwarfMoon	"8.D27"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.02338e-007
	Radius          68.5539
	InertiaMoment   0.399249

	Obliquity       -50.0161
	EqAscendNode    -121.798
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.681 0.590 0.449)

	Surface
	{
		SurfStyle       0.924901
		OceanStyle      0.151364
		Randomize      (-0.983, 0.100, 0.598)
		colorDistMagn   0.883034
		colorDistFreq   1.10068
		detailScale     1871.98
		colorConversion true
		snowLevel       2
		tropicLatitude  0.691625
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.339967
		terraceProb     0.112284
		erosion         0
		montesMagn      0.411412
		montesFreq      3.18897
		montesSpiky     0.905686
		montesFraction  0.58216
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.4424
		hillsFraction   0.804848
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224574
		craterFreq      0.261749
		craterDensity   0.850916
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   33.5984
		volcanoTemp     1223.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.207, 0.180, 0.050)
		colorShelf     (0.273, 0.242, 0.207, 0.040)
		colorBeach     (0.313, 0.277, 0.234, 0.030)
		colorDesert    (0.354, 0.313, 0.265, 0.020)
		colorLowland   (0.395, 0.348, 0.292, 0.030)
		colorUpland    (0.436, 0.384, 0.319, 0.050)
		colorRock      (0.477, 0.419, 0.355, 0.020)
		colorSnow      (0.477, 0.419, 0.355, 1.000)
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
		SemiMajorAxis   0.0361947
		Period          0.36793
		Eccentricity    0.474586
		Inclination     -50.0161
		AscendingNode   -121.798
		ArgOfPericenter 32.931
		MeanAnomaly     51.1186
	}
}

DwarfMoon	"8.D28"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.40019e-007
	Radius          72.9122
	InertiaMoment   0.396195

	RotationPeriod  16376.3
	Obliquity       -49.2095
	EqAscendNode    94.4845

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.660 0.657 0.656)

	Surface
	{
		SurfStyle       0.10282
		OceanStyle      0.908529
		Randomize      (0.156, 0.832, -0.721)
		colorDistMagn   0.562343
		colorDistFreq   1.96633
		detailScale     1990.99
		colorConversion true
		snowLevel       2
		tropicLatitude  0.881806
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.395176
		terraceProb     0.528468
		erosion         0
		montesMagn      0.455341
		montesFreq      2.38377
		montesSpiky     0.931915
		montesFraction  0.730381
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.9326
		hillsFraction   0.658145
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248522
		craterFreq      0.207703
		craterDensity   1.00069
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   30.5501
		volcanoTemp     1480.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.263, 0.262, 0.000)
		colorShelf     (0.281, 0.279, 0.279, 0.000)
		colorBeach     (0.297, 0.296, 0.295, 0.000)
		colorDesert    (0.314, 0.312, 0.311, 0.000)
		colorLowland   (0.330, 0.329, 0.328, 0.000)
		colorUpland    (0.347, 0.345, 0.344, 0.000)
		colorRock      (0.363, 0.362, 0.361, 0.000)
		colorSnow      (0.380, 0.378, 0.377, 1.000)
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
		SemiMajorAxis   0.0365681
		Period          0.373639
		Eccentricity    0.261181
		Inclination     -49.2095
		AscendingNode   94.4845
		ArgOfPericenter 56.4054
		MeanAnomaly     74.9825
	}
}

DwarfMoon	"8.D29"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.92434e-007
	Radius          77.7161
	InertiaMoment   0.398342

	RotationPeriod  16824.2
	Obliquity       -7.03226
	EqAscendNode    -162.442

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.646 0.644 0.641)

	Surface
	{
		SurfStyle       0.107306
		OceanStyle      0.978303
		Randomize      (0.277, -0.475, -0.554)
		colorDistMagn   0.473504
		colorDistFreq   1.14023
		detailScale     2122.17
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0373637
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.63929
		terraceProb     0.252236
		erosion         0
		montesMagn      0.460515
		montesFreq      2.98367
		montesSpiky     0.975158
		montesFraction  0.688197
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.5849
		hillsFraction   0.576181
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255689
		craterFreq      0.180674
		craterDensity   0.989512
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.7764
		volcanoTemp     1211.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.258, 0.256, 0.000)
		colorShelf     (0.274, 0.274, 0.272, 0.000)
		colorBeach     (0.291, 0.290, 0.288, 0.000)
		colorDesert    (0.307, 0.306, 0.304, 0.000)
		colorLowland   (0.323, 0.322, 0.320, 0.000)
		colorUpland    (0.339, 0.338, 0.336, 0.000)
		colorRock      (0.355, 0.354, 0.352, 0.000)
		colorSnow      (0.371, 0.370, 0.368, 1.000)
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
		SemiMajorAxis   0.037232
		Period          0.38386
		Eccentricity    0.451484
		Inclination     -7.03226
		AscendingNode   -162.442
		ArgOfPericenter 86.4614
		MeanAnomaly     113.763
	}
}

DwarfMoon	"8.D30"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.65958e-007
	Radius          104.818
	InertiaMoment   0.399381

	Obliquity       -32.3753
	EqAscendNode    -81.7497
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.694 0.688 0.685)

	Surface
	{
		SurfStyle       0.755366
		OceanStyle      0.740208
		Randomize      (0.369, -0.941, 0.934)
		colorDistMagn   0.939518
		colorDistFreq   7.27199
		detailScale     2862.23
		colorConversion true
		snowLevel       2
		tropicLatitude  0.740427
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566435
		terraceProb     0.404674
		erosion         0
		montesMagn      0.378126
		montesFreq      2.05501
		montesSpiky     0.950555
		montesFraction  0.394288
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.8753
		hillsFraction   0.893114
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24816
		craterFreq      0.338386
		craterDensity   1.05019
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.8665
		volcanoTemp     1288.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.234, 0.192, 0.000)
		colorShelf     (0.278, 0.241, 0.219, 0.000)
		colorBeach     (0.326, 0.282, 0.260, 0.000)
		colorDesert    (0.354, 0.303, 0.253, 0.000)
		colorLowland   (0.389, 0.323, 0.288, 0.000)
		colorUpland    (0.430, 0.392, 0.349, 0.000)
		colorRock      (0.465, 0.426, 0.377, 0.000)
		colorSnow      (0.506, 0.454, 0.397, 1.000)
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
		SemiMajorAxis   0.0377428
		Period          0.391787
		Eccentricity    0.186537
		Inclination     -32.3753
		AscendingNode   -81.7497
		ArgOfPericenter -74.7352
		MeanAnomaly     -66.6446
	}
}

DwarfMoon	"8.D31"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.7011e-007
	Radius          105.999
	InertiaMoment   0.396776

	RotationPeriod  17628.5
	Obliquity       -42.7065
	EqAscendNode    -66.2529

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.678 0.675 0.670)

	Surface
	{
		SurfStyle       0.190099
		OceanStyle      0.059783
		Randomize      (-0.580, -0.539, 0.509)
		colorDistMagn   0.890519
		colorDistFreq   5.39177
		detailScale     2894.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.934966
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.659863
		terraceProb     0.123013
		erosion         0
		montesMagn      0.445394
		montesFreq      2.75089
		montesSpiky     0.931085
		montesFraction  0.397877
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.5703
		hillsFraction   0.671366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204705
		craterFreq      0.479886
		craterDensity   0.920517
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.3175
		volcanoTemp     1489.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.270, 0.268, 0.000)
		colorShelf     (0.288, 0.287, 0.285, 0.000)
		colorBeach     (0.305, 0.304, 0.302, 0.000)
		colorDesert    (0.322, 0.320, 0.318, 0.000)
		colorLowland   (0.339, 0.337, 0.335, 0.000)
		colorUpland    (0.356, 0.354, 0.352, 0.000)
		colorRock      (0.373, 0.371, 0.369, 0.000)
		colorSnow      (0.390, 0.388, 0.386, 1.000)
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
		SemiMajorAxis   0.0384093
		Period          0.402211
		Eccentricity    0.478511
		Inclination     -42.7065
		AscendingNode   -66.2529
		ArgOfPericenter -24.9702
		MeanAnomaly     -4.99825
	}
}

DwarfMoon	"8.D32"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            5.19352e-007
	Radius          113.502
	InertiaMoment   0.398512

	RotationPeriod  17937.5
	Obliquity       49.3169
	EqAscendNode    -86.3679

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.563 0.497 0.445)

	Surface
	{
		SurfStyle       0.105854
		OceanStyle      0.0947906
		Randomize      (0.115, -0.046, 0.464)
		colorDistMagn   0.431068
		colorDistFreq   3.95855
		detailScale     3099.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0.921444
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.298
		terraceProb     0.237212
		erosion         0
		montesMagn      0.635894
		montesFreq      3.25471
		montesSpiky     0.976693
		montesFraction  0.710466
		dunesFraction   0
		hillsMagn       0
		hillsFreq       29.3381
		hillsFraction   0.654858
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233296
		craterFreq      0.524231
		craterDensity   0.798011
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.6933
		volcanoTemp     1211.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.199, 0.178, 0.000)
		colorShelf     (0.239, 0.211, 0.189, 0.000)
		colorBeach     (0.253, 0.224, 0.200, 0.000)
		colorDesert    (0.268, 0.236, 0.212, 0.000)
		colorLowland   (0.282, 0.249, 0.223, 0.000)
		colorUpland    (0.296, 0.261, 0.234, 0.000)
		colorRock      (0.310, 0.274, 0.245, 0.000)
		colorSnow      (0.324, 0.286, 0.256, 1.000)
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
		SemiMajorAxis   0.0388568
		Period          0.409259
		Eccentricity    0.465031
		Inclination     49.3169
		AscendingNode   -86.3679
		ArgOfPericenter -81.4754
		MeanAnomaly     -159.044
	}
}

DwarfMoon	"8.D33"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            7.36089e-007
	Radius          122.364
	InertiaMoment   0.399511

	RotationPeriod  14497.5
	Obliquity       -0.458773
	EqAscendNode    139.097

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.600 0.594 0.589)

	Surface
	{
		SurfStyle       0.286725
		OceanStyle      0.136097
		Randomize      (-0.807, 0.122, -0.690)
		colorDistMagn   0.553545
		colorDistFreq   11.1301
		detailScale     3341.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00559927
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.607904
		terraceProb     0.472693
		erosion         0
		montesMagn      0.489893
		montesFreq      3.0272
		montesSpiky     0.996078
		montesFraction  0.888546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       38.752
		hillsFraction   0.749416
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245505
		craterFreq      0.482966
		craterDensity   0.90775
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.3612
		volcanoTemp     1911.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.238, 0.236, 0.000)
		colorShelf     (0.255, 0.252, 0.250, 0.000)
		colorBeach     (0.270, 0.267, 0.265, 0.000)
		colorDesert    (0.285, 0.282, 0.280, 0.000)
		colorLowland   (0.300, 0.297, 0.295, 0.000)
		colorUpland    (0.315, 0.312, 0.309, 0.000)
		colorRock      (0.330, 0.327, 0.324, 0.000)
		colorSnow      (0.345, 0.342, 0.339, 1.000)
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
		SemiMajorAxis   0.0391226
		Period          0.413467
		Eccentricity    0.150206
		Inclination     -0.458773
		AscendingNode   139.097
		ArgOfPericenter -165.053
		MeanAnomaly     48.4221
	}
}

DwarfMoon	"8.D34"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.05583e-006
	Radius          178.112
	InertiaMoment   0.397168

	RotationPeriod  11004.6
	Obliquity       16.7322
	EqAscendNode    -56.6475

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.553 0.549 0.543)

	Surface
	{
		SurfStyle       0.867182
		OceanStyle      0.798217
		Randomize      (-0.506, -0.528, 0.939)
		colorDistMagn   0.968414
		colorDistFreq   0.956864
		detailScale     4863.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.490316
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661836
		terraceProb     0.392392
		erosion         0
		montesMagn      0.545216
		montesFreq      2.38796
		montesSpiky     0.861873
		montesFraction  0.302085
		dunesFraction   0
		hillsMagn       0
		hillsFreq       99.5887
		hillsFraction   0.598052
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241835
		craterFreq      0.984244
		craterDensity   0.90408
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.177
		volcanoTemp     1236.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.192, 0.217, 0.050)
		colorShelf     (0.221, 0.225, 0.250, 0.040)
		colorBeach     (0.255, 0.258, 0.282, 0.030)
		colorDesert    (0.288, 0.291, 0.320, 0.020)
		colorLowland   (0.321, 0.324, 0.353, 0.030)
		colorUpland    (0.354, 0.357, 0.385, 0.050)
		colorRock      (0.387, 0.390, 0.429, 0.020)
		colorSnow      (0.387, 0.390, 0.429, 1.000)
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
		SemiMajorAxis   0.0394375
		Period          0.418468
		Eccentricity    0.233212
		Inclination     16.7322
		AscendingNode   -56.6475
		ArgOfPericenter 100.649
		MeanAnomaly     76.2674
	}
}

DwarfMoon	"8.D35"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.53634e-006
	Radius          171.707
	InertiaMoment   0.398672

	RotationPeriod  4939.46
	Obliquity       -72.6435
	EqAscendNode    -114.37

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.744 0.742 0.739)

	Surface
	{
		SurfStyle       0.147402
		OceanStyle      0.342134
		Randomize      (0.825, -0.993, -0.407)
		colorDistMagn   0.637318
		colorDistFreq   12.9729
		detailScale     4688.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.885361
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575844
		terraceProb     0.558631
		erosion         0
		montesMagn      0.623866
		montesFreq      2.54785
		montesSpiky     0.886038
		montesFraction  0.533844
		dunesFraction   0
		hillsMagn       0
		hillsFreq       74.5858
		hillsFraction   0.777588
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216706
		craterFreq      0.723779
		craterDensity   0.908806
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.7195
		volcanoTemp     1428.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.297, 0.295, 0.000)
		colorShelf     (0.316, 0.316, 0.314, 0.000)
		colorBeach     (0.335, 0.334, 0.332, 0.000)
		colorDesert    (0.354, 0.353, 0.351, 0.000)
		colorLowland   (0.372, 0.371, 0.369, 0.000)
		colorUpland    (0.391, 0.390, 0.388, 0.000)
		colorRock      (0.409, 0.408, 0.406, 0.000)
		colorSnow      (0.428, 0.427, 0.425, 1.000)
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
		SemiMajorAxis   0.0396978
		Period          0.422618
		Eccentricity    0.440553
		Inclination     -72.6435
		AscendingNode   -114.37
		ArgOfPericenter 68.2417
		MeanAnomaly     60.714
	}
}

DwarfMoon	"8.D36"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.27446e-006
	Radius          186.759
	InertiaMoment   0.399639

	Obliquity       41.9234
	EqAscendNode    -97.793
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.731 0.729 0.727)

	Surface
	{
		SurfStyle       0.476956
		OceanStyle      0.171752
		Randomize      (0.866, -0.064, 0.486)
		colorDistMagn   0.714621
		colorDistFreq   19.7463
		detailScale     5099.78
		colorConversion true
		snowLevel       2
		tropicLatitude  0.789209
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.371992
		terraceProb     0.131077
		erosion         0
		montesMagn      0.659356
		montesFreq      3.62302
		montesSpiky     0.990174
		montesFraction  0.254459
		dunesFraction   0
		hillsMagn       0
		hillsFreq       89.0462
		hillsFraction   0.659665
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234014
		craterFreq      1.11059
		craterDensity   1.03931
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   19.4155
		volcanoTemp     1783.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.292, 0.291, 0.000)
		colorShelf     (0.311, 0.310, 0.309, 0.000)
		colorBeach     (0.329, 0.328, 0.327, 0.000)
		colorDesert    (0.347, 0.346, 0.346, 0.000)
		colorLowland   (0.366, 0.364, 0.364, 0.000)
		colorUpland    (0.384, 0.383, 0.382, 0.000)
		colorRock      (0.402, 0.401, 0.400, 0.000)
		colorSnow      (0.420, 0.419, 0.418, 1.000)
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
		SemiMajorAxis   0.040087
		Period          0.428849
		Eccentricity    0.179447
		Inclination     41.9234
		AscendingNode   -97.793
		ArgOfPericenter 161.204
		MeanAnomaly     -56.9775
	}
}

DwarfMoon	"8.D37"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.43851e-006
	Radius          205.85
	InertiaMoment   0.397474

	Obliquity       53.939
	EqAscendNode    -25.324
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.447 0.444 0.439)

	Surface
	{
		SurfStyle       0.508646
		OceanStyle      0.234627
		Randomize      (-0.060, 0.568, -0.664)
		colorDistMagn   0.221982
		colorDistFreq   33.8996
		detailScale     5621.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.969727
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.730955
		terraceProb     0.234718
		erosion         0
		montesMagn      0.504706
		montesFreq      3.23197
		montesSpiky     0.921091
		montesFraction  0.729996
		dunesFraction   0
		hillsMagn       0
		hillsFreq       114.325
		hillsFraction   0.660905
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256482
		craterFreq      1.62724
		craterDensity   1.04147
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   17.4049
		volcanoTemp     1880.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.151, 0.123, 0.000)
		colorShelf     (0.179, 0.155, 0.140, 0.000)
		colorBeach     (0.210, 0.182, 0.167, 0.000)
		colorDesert    (0.228, 0.195, 0.162, 0.000)
		colorLowland   (0.250, 0.209, 0.184, 0.000)
		colorUpland    (0.277, 0.253, 0.224, 0.000)
		colorRock      (0.299, 0.275, 0.241, 0.000)
		colorSnow      (0.326, 0.293, 0.254, 1.000)
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
		SemiMajorAxis   0.0406891
		Period          0.438546
		Eccentricity    0.48475
		Inclination     53.939
		AscendingNode   -25.324
		ArgOfPericenter -141.222
		MeanAnomaly     25.8892
	}
}

Moon	"8.6"
{
	ParentBody     "8"
	Class	       "IceWorld"

	Mass            5.33371e-006
	Radius          222.066
	InertiaMoment   0.398824

	RotationPeriod  2620.97
	Obliquity       2.40824
	EqAscendNode    -103.552

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.405 0.400 0.398)

	Surface
	{
		SurfStyle       0.121879
		OceanStyle      0.226926
		Randomize      (0.923, 0.899, 0.610)
		colorDistMagn   0.0560996
		colorDistFreq   27.0731
		detailScale     571.167
		colorConversion true
		drivenDarkening 0.138249
		seaLevel        0.220032
		snowLevel       2
		tropicLatitude  0.0519804
		icecapLatitude  0.936826
		icecapHeight    0.223325
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.71817
		venusFreq       0.833581
		venusMagn       0
		mareFreq        0
		mareDensity     3.05046e-006
		terraceProb     0.708259
		erosion         0
		montesMagn      0.0515001
		montesFreq      11.0531
		montesSpiky     0.808398
		montesFraction  0.282823
		dunesMagn       0.0531518
		dunesFreq       288.952
		dunesFraction   0.751218
		hillsMagn       0.129515
		hillsFreq       27.8664
		hillsFraction   0.228633
		hills2Fraction  0.0251719
		riversMagn      49.1001
		riversFreq      3.40566
		riversSin       5.81079
		riversOctaves   0
		canyonsMagn     0.571269
		canyonsFreq     0.0844143
		canyonFraction  0
		cracksMagn      0.0574894
		cracksFreq      0.140991
		cracksOctaves   0
		craterMagn      0.964257
		craterFreq      0.547983
		craterDensity   0.86006
		craterOctaves   8
		craterRayedFactor 0.099195
		volcanoMagn     0.197491
		volcanoFreq     1.11941
		volcanoDensity  0.0571924
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.089611
		volcanoRadius   4.21892
		volcanoTemp     1591.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.405, 0.400, 0.398, 0.500)
		colorShelf     (0.385, 0.380, 0.378, 0.500)
		colorBeach     (0.283, 0.280, 0.279, 0.750)
		colorDesert    (0.344, 0.340, 0.339, 1.000)
		colorLowland   (0.356, 0.352, 0.351, 1.000)
		colorUpland    (0.376, 0.372, 0.370, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.356, 0.352, 0.351, 1.000)
		colorUpPlants  (0.376, 0.372, 0.370, 1.000)
		BumpHeight      11.1033
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
		SemiMajorAxis   0.0413024
		Period          0.448499
		Eccentricity    0.437835
		Inclination     2.40824
		AscendingNode   -103.552
		ArgOfPericenter 40.9803
		MeanAnomaly     149.514
	}
}

DwarfMoon	"8.D38"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.62691e-011
	Radius          3.80365
	InertiaMoment   0.399765

	RotationPeriod  7983.09
	Obliquity       65.1536
	EqAscendNode    -76.02

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.747 0.639 0.590)

	Surface
	{
		SurfStyle       0.878966
		OceanStyle      0.136481
		Randomize      (-0.746, 0.705, 0.377)
		colorDistMagn   0.16054
		colorDistFreq   0.00623373
		detailScale     103.865
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99975
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536353
		terraceProb     0.574869
		erosion         0
		montesMagn      0.4133
		montesFreq      3.30599
		montesSpiky     0.892779
		montesFraction  0.443577
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0331826
		hillsFraction   0.572785
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255682
		craterFreq      0.150608
		craterDensity   1.01953
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   147.851
		volcanoTemp     1617.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.224, 0.236, 0.050)
		colorShelf     (0.299, 0.262, 0.272, 0.040)
		colorBeach     (0.343, 0.300, 0.307, 0.030)
		colorDesert    (0.388, 0.339, 0.348, 0.020)
		colorLowland   (0.433, 0.377, 0.384, 0.030)
		colorUpland    (0.478, 0.416, 0.419, 0.050)
		colorRock      (0.523, 0.454, 0.466, 0.020)
		colorSnow      (0.523, 0.454, 0.466, 1.000)
		BumpHeight      3.42328
		BumpOffset      0.684657
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
		SemiMajorAxis   0.0417222
		Period          0.455354
		Eccentricity    0.445287
		Inclination     65.1536
		AscendingNode   -76.02
		ArgOfPericenter 173.249
		MeanAnomaly     56.3874
	}
}

DwarfMoon	"8.D39"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.18667e-011
	Radius          4.52851
	InertiaMoment   0.39773

	RotationPeriod  12252
	Obliquity       11.225
	EqAscendNode    132.089

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.505 0.497 0.494)

	Surface
	{
		SurfStyle       0.506714
		OceanStyle      0.776587
		Randomize      (-0.683, -0.775, -0.421)
		colorDistMagn   0.968095
		colorDistFreq   0.00870544
		detailScale     123.659
		colorConversion true
		snowLevel       2
		tropicLatitude  0.157581
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600638
		terraceProb     0.345409
		erosion         0
		montesMagn      0.392653
		montesFreq      3.23485
		montesSpiky     0.891979
		montesFraction  0.174027
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.03694
		hillsFraction   0.660038
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235417
		craterFreq      0.167494
		craterDensity   0.686719
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   125.775
		volcanoTemp     1269.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.169, 0.138, 0.000)
		colorShelf     (0.202, 0.174, 0.158, 0.000)
		colorBeach     (0.237, 0.204, 0.188, 0.000)
		colorDesert    (0.257, 0.219, 0.183, 0.000)
		colorLowland   (0.283, 0.234, 0.207, 0.000)
		colorUpland    (0.313, 0.283, 0.252, 0.000)
		colorRock      (0.338, 0.308, 0.272, 0.000)
		colorSnow      (0.368, 0.328, 0.286, 1.000)
		BumpHeight      4.07566
		BumpOffset      0.815133
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
		SemiMajorAxis   0.042364
		Period          0.465901
		Eccentricity    0.323385
		Inclination     11.225
		AscendingNode   132.089
		ArgOfPericenter -24.289
		MeanAnomaly     -156.73
	}
}

DwarfMoon	"8.D40"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            5.74535e-011
	Radius          5.2945
	InertiaMoment   0.39897

	RotationPeriod  12439.2
	Obliquity       -65.4175
	EqAscendNode    96.1684

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.747 0.744 0.740)

	Surface
	{
		SurfStyle       0.621598
		OceanStyle      0.395281
		Randomize      (0.847, -0.662, -0.824)
		colorDistMagn   0.694819
		colorDistFreq   0.00983686
		detailScale     144.575
		colorConversion true
		snowLevel       2
		tropicLatitude  0.965091
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453732
		terraceProb     0.495033
		erosion         0
		montesMagn      0.486545
		montesFreq      2.29728
		montesSpiky     0.928109
		montesFraction  0.626695
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.076352
		hillsFraction   0.370794
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244322
		craterFreq      0.216056
		craterDensity   0.896471
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   109.515
		volcanoTemp     1566.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.253, 0.207, 0.000)
		colorShelf     (0.299, 0.261, 0.237, 0.000)
		colorBeach     (0.351, 0.305, 0.281, 0.000)
		colorDesert    (0.381, 0.328, 0.274, 0.000)
		colorLowland   (0.418, 0.350, 0.311, 0.000)
		colorUpland    (0.463, 0.424, 0.377, 0.000)
		colorRock      (0.500, 0.462, 0.407, 0.000)
		colorSnow      (0.545, 0.491, 0.429, 1.000)
		BumpHeight      4.76505
		BumpOffset      0.95301
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
		SemiMajorAxis   0.0427944
		Period          0.473019
		Eccentricity    0.316693
		Inclination     -65.4175
		AscendingNode   96.1684
		ArgOfPericenter 134.322
		MeanAnomaly     153.098
	}
}

DwarfMoon	"8.D41"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            9.75856e-011
	Radius          5.96587
	InertiaMoment   0.39989

	RotationPeriod  8472.12
	Obliquity       89.4867
	EqAscendNode    -54.1297

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.770 0.768 0.765)

	Surface
	{
		SurfStyle       0.472817
		OceanStyle      0.682757
		Randomize      (-0.112, -0.488, 0.189)
		colorDistMagn   0.436694
		colorDistFreq   0.0088688
		detailScale     162.908
		colorConversion true
		snowLevel       2
		tropicLatitude  0.810437
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.305892
		terraceProb     0.403843
		erosion         0
		montesMagn      0.325255
		montesFreq      2.57633
		montesSpiky     0.993619
		montesFraction  0.846926
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0801338
		hillsFraction   0.699509
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248004
		craterFreq      0.26739
		craterDensity   0.846322
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   94.6862
		volcanoTemp     1668.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.307, 0.306, 0.000)
		colorShelf     (0.327, 0.326, 0.325, 0.000)
		colorBeach     (0.346, 0.346, 0.344, 0.000)
		colorDesert    (0.366, 0.365, 0.363, 0.000)
		colorLowland   (0.385, 0.384, 0.382, 0.000)
		colorUpland    (0.404, 0.403, 0.402, 0.000)
		colorRock      (0.423, 0.422, 0.421, 0.000)
		colorSnow      (0.443, 0.442, 0.440, 1.000)
		BumpHeight      5.36928
		BumpOffset      1.07386
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
		SemiMajorAxis   0.0434091
		Period          0.483248
		Eccentricity    0.463031
		Inclination     89.4867
		AscendingNode   -54.1297
		ArgOfPericenter 96.7735
		MeanAnomaly     -3.07806
	}
}

DwarfMoon	"8.D42"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.58469e-010
	Radius          8.20347
	InertiaMoment   0.397954

	Obliquity       82.78
	EqAscendNode    151.077
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.682 0.627 0.595)

	Surface
	{
		SurfStyle       0.255458
		OceanStyle      0.12034
		Randomize      (0.098, 0.177, -0.966)
		colorDistMagn   0.789303
		colorDistFreq   0.0394168
		detailScale     224.009
		colorConversion true
		snowLevel       2
		tropicLatitude  0.480058
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.632394
		terraceProb     0.441931
		erosion         0
		montesMagn      0.482879
		montesFreq      3.20727
		montesSpiky     0.936618
		montesFraction  0.367849
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.180717
		hillsFraction   0.628347
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243341
		craterFreq      0.166488
		craterDensity   0.780623
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   102.172
		volcanoTemp     1244.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.251, 0.238, 0.000)
		colorShelf     (0.290, 0.266, 0.253, 0.000)
		colorBeach     (0.307, 0.282, 0.268, 0.000)
		colorDesert    (0.324, 0.298, 0.283, 0.000)
		colorLowland   (0.341, 0.314, 0.298, 0.000)
		colorUpland    (0.358, 0.329, 0.313, 0.000)
		colorRock      (0.375, 0.345, 0.327, 0.000)
		colorSnow      (0.392, 0.361, 0.342, 1.000)
		BumpHeight      7.38312
		BumpOffset      1.47662
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
		SemiMajorAxis   0.0439361
		Period          0.492074
		Eccentricity    0.423989
		Inclination     82.78
		AscendingNode   151.077
		ArgOfPericenter 145.527
		MeanAnomaly     -28.3633
	}
}

DwarfMoon	"8.D43"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.48503e-010
	Radius          9.03393
	InertiaMoment   0.39911

	RotationPeriod  6553.25
	Obliquity       -0.379896
	EqAscendNode    43.9665

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.505 0.502 0.498)

	Surface
	{
		SurfStyle       0.601068
		OceanStyle      0.611724
		Randomize      (0.404, -0.010, 0.221)
		colorDistMagn   0.884129
		colorDistFreq   0.0367684
		detailScale     246.686
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0122944
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633091
		terraceProb     0.221773
		erosion         0
		montesMagn      0.424022
		montesFreq      2.85021
		montesSpiky     0.894774
		montesFraction  0.641562
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.144866
		hillsFraction   0.847238
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252886
		craterFreq      0.238304
		craterDensity   0.940461
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   89.8497
		volcanoTemp     1652.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.171, 0.139, 0.000)
		colorShelf     (0.202, 0.176, 0.159, 0.000)
		colorBeach     (0.237, 0.206, 0.189, 0.000)
		colorDesert    (0.258, 0.221, 0.184, 0.000)
		colorLowland   (0.283, 0.236, 0.209, 0.000)
		colorUpland    (0.313, 0.286, 0.254, 0.000)
		colorRock      (0.338, 0.311, 0.274, 0.000)
		colorSnow      (0.369, 0.331, 0.289, 1.000)
		BumpHeight      8.13054
		BumpOffset      1.62611
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
		SemiMajorAxis   0.0443115
		Period          0.498394
		Eccentricity    0.34886
		Inclination     -0.379896
		AscendingNode   43.9665
		ArgOfPericenter -110.491
		MeanAnomaly     69.5328
	}
}

DwarfMoon	"8.D44"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.78997e-010
	Radius          9.98779
	InertiaMoment   0.394522

	RotationPeriod  8833.59
	Obliquity       -79.2733
	EqAscendNode    -119.041

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.434 0.431 0.425)

	Surface
	{
		SurfStyle       0.763954
		OceanStyle      0.900712
		Randomize      (-0.095, -0.286, 0.786)
		colorDistMagn   0.429375
		colorDistFreq   0.0265019
		detailScale     272.733
		colorConversion true
		snowLevel       2
		tropicLatitude  0.864137
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.59368
		terraceProb     0.117471
		erosion         0
		montesMagn      0.492657
		montesFreq      3.54939
		montesSpiky     0.921753
		montesFraction  0.67172
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.225093
		hillsFraction   0.564996
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223482
		craterFreq      0.260365
		craterDensity   0.854716
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   80.4372
		volcanoTemp     1274.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.146, 0.119, 0.000)
		colorShelf     (0.174, 0.151, 0.136, 0.000)
		colorBeach     (0.204, 0.177, 0.162, 0.000)
		colorDesert    (0.221, 0.189, 0.157, 0.000)
		colorLowland   (0.243, 0.202, 0.179, 0.000)
		colorUpland    (0.269, 0.245, 0.217, 0.000)
		colorRock      (0.291, 0.267, 0.234, 0.000)
		colorSnow      (0.317, 0.284, 0.247, 1.000)
		BumpHeight      8.98901
		BumpOffset      1.7978
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
		SemiMajorAxis   0.0446352
		Period          0.503866
		Eccentricity    0.371722
		Inclination     -79.2733
		AscendingNode   -119.041
		ArgOfPericenter -27.5617
		MeanAnomaly     -17.8244
	}
}

DwarfMoon	"8.D45"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            5.65132e-010
	Radius          10.8472
	InertiaMoment   0.398154

	RotationPeriod  13458.1
	Obliquity       -35.8946
	EqAscendNode    127.723

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.671 0.591 0.492)

	Surface
	{
		SurfStyle       0.902576
		OceanStyle      0.383823
		Randomize      (-0.519, 0.289, 0.051)
		colorDistMagn   0.406023
		colorDistFreq   0.0265585
		detailScale     296.201
		colorConversion true
		snowLevel       2
		tropicLatitude  0.49905
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399785
		terraceProb     0.467702
		erosion         0
		montesMagn      0.588853
		montesFreq      3.1563
		montesSpiky     0.959106
		montesFraction  0.401699
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.278445
		hillsFraction   0.490324
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229254
		craterFreq      0.222557
		craterDensity   0.987527
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   71.5399
		volcanoTemp     1248.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.207, 0.197, 0.050)
		colorShelf     (0.268, 0.242, 0.227, 0.040)
		colorBeach     (0.309, 0.278, 0.256, 0.030)
		colorDesert    (0.349, 0.313, 0.291, 0.020)
		colorLowland   (0.389, 0.349, 0.320, 0.030)
		colorUpland    (0.430, 0.384, 0.350, 0.050)
		colorRock      (0.470, 0.420, 0.389, 0.020)
		colorSnow      (0.470, 0.420, 0.389, 1.000)
		BumpHeight      9.76247
		BumpOffset      1.95249
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
		SemiMajorAxis   0.0451005
		Period          0.511765
		Eccentricity    0.345855
		Inclination     -35.8946
		AscendingNode   127.723
		ArgOfPericenter 55.4091
		MeanAnomaly     -149.557
	}
}

DwarfMoon	"8.D46"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            8.27221e-010
	Radius          14.3941
	InertiaMoment   0.399246

	Obliquity       -89.2537
	EqAscendNode    -100.26
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.583 0.582 0.579)

	Surface
	{
		SurfStyle       0.720037
		OceanStyle      0.179803
		Randomize      (-0.245, -0.989, 0.934)
		colorDistMagn   0.639613
		colorDistFreq   0.168627
		detailScale     393.056
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983984
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563246
		terraceProb     0.27659
		erosion         0
		montesMagn      0.397604
		montesFreq      4.00423
		montesSpiky     0.979247
		montesFraction  0.289382
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.429462
		hillsFraction   0.529643
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219689
		craterFreq      0.267818
		craterDensity   0.800533
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   78.4659
		volcanoTemp     1403.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.198, 0.162, 0.000)
		colorShelf     (0.233, 0.204, 0.185, 0.000)
		colorBeach     (0.274, 0.238, 0.220, 0.000)
		colorDesert    (0.297, 0.256, 0.214, 0.000)
		colorLowland   (0.327, 0.273, 0.243, 0.000)
		colorUpland    (0.362, 0.331, 0.295, 0.000)
		colorRock      (0.391, 0.361, 0.318, 0.000)
		colorSnow      (0.426, 0.384, 0.336, 1.000)
		BumpHeight      12.9547
		BumpOffset      2.59094
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
		SemiMajorAxis   0.0457224
		Period          0.522386
		Eccentricity    0.472432
		Inclination     -89.2537
		AscendingNode   -100.26
		ArgOfPericenter 88.2554
		MeanAnomaly     123.62
	}
}

DwarfMoon	"8.D47"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.19243e-009
	Radius          15.3317
	InertiaMoment   0.396178

	Obliquity       -49.2383
	EqAscendNode    -60.9573
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.770 0.766 0.764)

	Surface
	{
		SurfStyle       0.347607
		OceanStyle      0.24286
		Randomize      (-0.142, -0.603, 0.624)
		colorDistMagn   0.836769
		colorDistFreq   0.047509
		detailScale     418.659
		colorConversion true
		snowLevel       2
		tropicLatitude  0.989019
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.342525
		terraceProb     0.334249
		erosion         0
		montesMagn      0.429028
		montesFreq      2.96946
		montesSpiky     0.935916
		montesFraction  0.557465
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.51089
		hillsFraction   0.699341
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.299756
		craterFreq      0.232205
		craterDensity   0.864098
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   69.6116
		volcanoTemp     1688.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.307, 0.306, 0.000)
		colorShelf     (0.327, 0.326, 0.325, 0.000)
		colorBeach     (0.347, 0.345, 0.344, 0.000)
		colorDesert    (0.366, 0.364, 0.363, 0.000)
		colorLowland   (0.385, 0.383, 0.382, 0.000)
		colorUpland    (0.404, 0.402, 0.401, 0.000)
		colorRock      (0.424, 0.422, 0.420, 0.000)
		colorSnow      (0.443, 0.441, 0.439, 1.000)
		BumpHeight      13.7986
		BumpOffset      2.75971
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
		SemiMajorAxis   0.0463565
		Period          0.533292
		Eccentricity    0.195831
		Inclination     -49.2383
		AscendingNode   -60.9573
		ArgOfPericenter 159.602
		MeanAnomaly     78.4367
	}
}

DwarfMoon	"8.D48"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.69705e-009
	Radius          16.5565
	InertiaMoment   0.398338

	RotationPeriod  7851
	Obliquity       30.9219
	EqAscendNode    -134.911

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.620 0.615 0.609)

	Surface
	{
		SurfStyle       0.124443
		OceanStyle      0.491401
		Randomize      (-0.691, 0.462, -0.183)
		colorDistMagn   0.963869
		colorDistFreq   0.100988
		detailScale     452.103
		colorConversion true
		snowLevel       2
		tropicLatitude  0.386312
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496592
		terraceProb     0.388139
		erosion         0
		montesMagn      0.504521
		montesFreq      3.25132
		montesSpiky     0.847129
		montesFraction  0.545045
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.643577
		hillsFraction   0.61503
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240914
		craterFreq      0.217483
		craterDensity   0.868545
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.0127
		volcanoTemp     1578.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.246, 0.244, 0.000)
		colorShelf     (0.264, 0.261, 0.259, 0.000)
		colorBeach     (0.279, 0.277, 0.274, 0.000)
		colorDesert    (0.295, 0.292, 0.289, 0.000)
		colorLowland   (0.310, 0.307, 0.305, 0.000)
		colorUpland    (0.326, 0.323, 0.320, 0.000)
		colorRock      (0.341, 0.338, 0.335, 0.000)
		colorSnow      (0.357, 0.353, 0.350, 1.000)
		BumpHeight      14.9009
		BumpOffset      2.98017
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
		SemiMajorAxis   0.0465933
		Period          0.537383
		Eccentricity    0.457828
		Inclination     30.9219
		AscendingNode   -134.911
		ArgOfPericenter 70.047
		MeanAnomaly     165.048
	}
}

DwarfMoon	"8.D49"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.38958e-009
	Radius          17.7117
	InertiaMoment   0.399378

	Obliquity       48.1874
	EqAscendNode    -84.8215
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.517 0.510 0.505)

	Surface
	{
		SurfStyle       0.279654
		OceanStyle      0.113078
		Randomize      (-0.041, 0.404, -0.977)
		colorDistMagn   0.516508
		colorDistFreq   0.171362
		detailScale     483.647
		colorConversion true
		snowLevel       2
		tropicLatitude  0.918963
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.663914
		terraceProb     0.107709
		erosion         0
		montesMagn      0.596734
		montesFreq      2.80656
		montesSpiky     0.895566
		montesFraction  0.42215
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.35507
		hillsFraction   0.568633
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245253
		craterFreq      0.272891
		craterDensity   0.96294
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   56.8075
		volcanoTemp     1414.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.204, 0.202, 0.000)
		colorShelf     (0.220, 0.217, 0.214, 0.000)
		colorBeach     (0.233, 0.230, 0.227, 0.000)
		colorDesert    (0.246, 0.242, 0.240, 0.000)
		colorLowland   (0.259, 0.255, 0.252, 0.000)
		colorUpland    (0.272, 0.268, 0.265, 0.000)
		colorRock      (0.284, 0.281, 0.278, 0.000)
		colorSnow      (0.297, 0.293, 0.290, 1.000)
		BumpHeight      15.9405
		BumpOffset      3.1881
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
		SemiMajorAxis   0.0472024
		Period          0.547955
		Eccentricity    0.118347
		Inclination     48.1874
		AscendingNode   -84.8215
		ArgOfPericenter 81.86
		MeanAnomaly     -26.6149
	}
}

DwarfMoon	"8.D50"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.3349e-009
	Radius          23.2292
	InertiaMoment   0.396766

	Obliquity       -70.4737
	EqAscendNode    -164.071
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.408 0.402 0.397)

	Surface
	{
		SurfStyle       0.0103727
		OceanStyle      0.776532
		Randomize      (0.087, -0.007, 0.188)
		colorDistMagn   0.977202
		colorDistFreq   0.262071
		detailScale     634.313
		colorConversion true
		snowLevel       2
		tropicLatitude  0.258943
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.39575
		terraceProb     0.216697
		erosion         0
		montesMagn      0.455066
		montesFreq      2.8867
		montesSpiky     0.809222
		montesFraction  0.481781
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.885777
		hillsFraction   0.401325
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248806
		craterFreq      0.269593
		craterDensity   0.917205
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.0666
		volcanoTemp     2092.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.161, 0.159, 0.000)
		colorShelf     (0.174, 0.171, 0.169, 0.000)
		colorBeach     (0.184, 0.181, 0.179, 0.000)
		colorDesert    (0.194, 0.191, 0.189, 0.000)
		colorLowland   (0.204, 0.201, 0.199, 0.000)
		colorUpland    (0.214, 0.211, 0.209, 0.000)
		colorRock      (0.225, 0.221, 0.219, 0.000)
		colorSnow      (0.235, 0.231, 0.229, 1.000)
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
		SemiMajorAxis   0.0475755
		Period          0.554464
		Eccentricity    0.0435636
		Inclination     -70.4737
		AscendingNode   -164.071
		ArgOfPericenter -53.4873
		MeanAnomaly     -48.9289
	}
}

DwarfMoon	"8.D51"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            4.61996e-009
	Radius          24.2361
	InertiaMoment   0.398508

	Obliquity       -3.05063
	EqAscendNode    -170.878
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.562 0.558 0.554)

	Surface
	{
		SurfStyle       0.496758
		OceanStyle      0.803822
		Randomize      (0.558, 0.851, 0.630)
		colorDistMagn   0.0930709
		colorDistFreq   0.311815
		detailScale     661.807
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00846425
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.397987
		terraceProb     0.33082
		erosion         0
		montesMagn      0.442793
		montesFreq      2.88335
		montesSpiky     0.837126
		montesFraction  0.849429
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.33209
		hillsFraction   0.483646
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201024
		craterFreq      0.21808
		craterDensity   0.821195
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   55.9048
		volcanoTemp     1711.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.223, 0.222, 0.000)
		colorShelf     (0.239, 0.237, 0.235, 0.000)
		colorBeach     (0.253, 0.251, 0.249, 0.000)
		colorDesert    (0.267, 0.265, 0.263, 0.000)
		colorLowland   (0.281, 0.279, 0.277, 0.000)
		colorUpland    (0.295, 0.293, 0.291, 0.000)
		colorRock      (0.309, 0.307, 0.305, 0.000)
		colorSnow      (0.323, 0.321, 0.318, 1.000)
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
		SemiMajorAxis   0.0481232
		Period          0.564066
		Eccentricity    0.0165059
		Inclination     -3.05063
		AscendingNode   -170.878
		ArgOfPericenter 37.086
		MeanAnomaly     -27.5486
	}
}

DwarfMoon	"8.D52"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            6.36157e-009
	Radius          25.8647
	InertiaMoment   0.399508

	RotationPeriod  9966.89
	Obliquity       -43.7791
	EqAscendNode    93.5763

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.856 0.811 0.736)

	Surface
	{
		SurfStyle       0.322531
		OceanStyle      0.571798
		Randomize      (0.222, 0.542, -0.171)
		colorDistMagn   0.683845
		colorDistFreq   0.224981
		detailScale     706.279
		colorConversion true
		snowLevel       2
		tropicLatitude  0.834398
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.507835
		terraceProb     0.540791
		erosion         0
		montesMagn      0.574986
		montesFreq      2.99556
		montesSpiky     0.946709
		montesFraction  0.603491
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.83534
		hillsFraction   0.690716
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252345
		craterFreq      0.261101
		craterDensity   0.969847
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   50.843
		volcanoTemp     1570.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.342, 0.324, 0.294, 0.000)
		colorShelf     (0.364, 0.345, 0.313, 0.000)
		colorBeach     (0.385, 0.365, 0.331, 0.000)
		colorDesert    (0.407, 0.385, 0.350, 0.000)
		colorLowland   (0.428, 0.406, 0.368, 0.000)
		colorUpland    (0.449, 0.426, 0.386, 0.000)
		colorRock      (0.471, 0.446, 0.405, 0.000)
		colorSnow      (0.492, 0.466, 0.423, 1.000)
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
		SemiMajorAxis   0.0483756
		Period          0.568509
		Eccentricity    0.284794
		Inclination     -43.7791
		AscendingNode   93.5763
		ArgOfPericenter -46.6081
		MeanAnomaly     83.3742
	}
}

DwarfMoon	"8.D53"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            8.71707e-009
	Radius          27.4915
	InertiaMoment   0.39716

	RotationPeriod  30376.4
	Obliquity       59.8892
	EqAscendNode    100.091

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.475 0.473 0.470)

	Surface
	{
		SurfStyle       0.0915165
		OceanStyle      0.788014
		Randomize      (0.097, 0.348, -0.605)
		colorDistMagn   0.26612
		colorDistFreq   0.270533
		detailScale     750.701
		colorConversion true
		snowLevel       2
		tropicLatitude  0.923832
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.636181
		terraceProb     0.450488
		erosion         0
		montesMagn      0.501102
		montesFreq      3.8432
		montesSpiky     0.938759
		montesFraction  0.684088
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.68839
		hillsFraction   0.752147
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224127
		craterFreq      0.252127
		craterDensity   0.988332
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.1657
		volcanoTemp     1222.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.189, 0.188, 0.000)
		colorShelf     (0.202, 0.201, 0.200, 0.000)
		colorBeach     (0.214, 0.213, 0.212, 0.000)
		colorDesert    (0.226, 0.225, 0.223, 0.000)
		colorLowland   (0.238, 0.236, 0.235, 0.000)
		colorUpland    (0.249, 0.248, 0.247, 0.000)
		colorRock      (0.261, 0.260, 0.259, 0.000)
		colorSnow      (0.273, 0.272, 0.270, 1.000)
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
		SemiMajorAxis   0.0488873
		Period          0.577553
		Eccentricity    0.19616
		Inclination     59.8892
		AscendingNode   100.091
		ArgOfPericenter -164.62
		MeanAnomaly     117.772
	}
}

DwarfMoon	"8.D54"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.18992e-008
	Radius          36.1457
	InertiaMoment   0.398669

	Obliquity       -40.9854
	EqAscendNode    -84.6167
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.434 0.430 0.423)

	Surface
	{
		SurfStyle       0.7318
		OceanStyle      0.352996
		Randomize      (-0.725, -0.875, 0.248)
		colorDistMagn   0.863624
		colorDistFreq   0.89257
		detailScale     987.019
		colorConversion true
		snowLevel       2
		tropicLatitude  0.848321
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.389416
		terraceProb     0.269497
		erosion         0
		montesMagn      0.338573
		montesFreq      3.54491
		montesSpiky     0.81667
		montesFraction  0.723567
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.20927
		hillsFraction   0.596201
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.194342
		craterFreq      0.254762
		craterDensity   0.804678
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.9521
		volcanoTemp     1337.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.146, 0.119, 0.000)
		colorShelf     (0.174, 0.150, 0.135, 0.000)
		colorBeach     (0.204, 0.176, 0.161, 0.000)
		colorDesert    (0.221, 0.189, 0.157, 0.000)
		colorLowland   (0.243, 0.202, 0.178, 0.000)
		colorUpland    (0.269, 0.245, 0.216, 0.000)
		colorRock      (0.291, 0.266, 0.233, 0.000)
		colorSnow      (0.317, 0.284, 0.246, 1.000)
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
		SemiMajorAxis   0.0491077
		Period          0.581464
		Eccentricity    0.119181
		Inclination     -40.9854
		AscendingNode   -84.6167
		ArgOfPericenter -98.1297
		MeanAnomaly     -115.54
	}
}

DwarfMoon	"8.D55"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.61972e-008
	Radius          37.0699
	InertiaMoment   0.399636

	Obliquity       46.2217
	EqAscendNode    112.57
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.444 0.438 0.434)

	Surface
	{
		SurfStyle       0.415617
		OceanStyle      0.247916
		Randomize      (-0.048, 0.613, -0.152)
		colorDistMagn   0.571897
		colorDistFreq   1.19695
		detailScale     1012.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.734353
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.523664
		terraceProb     0.349648
		erosion         0
		montesMagn      0.455967
		montesFreq      3.44488
		montesSpiky     0.835975
		montesFraction  0.720435
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.52616
		hillsFraction   0.779584
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253384
		craterFreq      0.173113
		craterDensity   0.909109
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   45.6676
		volcanoTemp     1423.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.175, 0.174, 0.000)
		colorShelf     (0.189, 0.186, 0.184, 0.000)
		colorBeach     (0.200, 0.197, 0.195, 0.000)
		colorDesert    (0.211, 0.208, 0.206, 0.000)
		colorLowland   (0.222, 0.219, 0.217, 0.000)
		colorUpland    (0.233, 0.230, 0.228, 0.000)
		colorRock      (0.244, 0.241, 0.239, 0.000)
		colorSnow      (0.255, 0.252, 0.249, 1.000)
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
		SemiMajorAxis   0.0497203
		Period          0.592378
		Eccentricity    0.436009
		Inclination     46.2217
		AscendingNode   112.57
		ArgOfPericenter 105.036
		MeanAnomaly     122.088
	}
}

DwarfMoon	"8.D56"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.20054e-008
	Radius          39.3368
	InertiaMoment   0.397468

	Obliquity       46.1559
	EqAscendNode    179.115
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.560 0.557 0.554)

	Surface
	{
		SurfStyle       0.270421
		OceanStyle      0.725068
		Randomize      (0.557, -0.316, -0.418)
		colorDistMagn   0.211755
		colorDistFreq   1.29385
		detailScale     1074.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0111451
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.569771
		terraceProb     0.356732
		erosion         0
		montesMagn      0.481032
		montesFreq      3.02895
		montesSpiky     0.980587
		montesFraction  0.599311
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.73947
		hillsFraction   0.580706
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.286828
		craterFreq      0.267492
		craterDensity   0.853995
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.5758
		volcanoTemp     1553.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.223, 0.221, 0.000)
		colorShelf     (0.238, 0.237, 0.235, 0.000)
		colorBeach     (0.252, 0.251, 0.249, 0.000)
		colorDesert    (0.266, 0.265, 0.263, 0.000)
		colorLowland   (0.280, 0.279, 0.277, 0.000)
		colorUpland    (0.294, 0.292, 0.291, 0.000)
		colorRock      (0.308, 0.306, 0.305, 0.000)
		colorSnow      (0.322, 0.320, 0.318, 1.000)
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
		SemiMajorAxis   0.0503547
		Period          0.603752
		Eccentricity    0.469284
		Inclination     46.1559
		AscendingNode   179.115
		ArgOfPericenter 80.6309
		MeanAnomaly     -73.9809
	}
}

DwarfMoon	"8.D57"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.98658e-008
	Radius          41.7508
	InertiaMoment   0.398821

	RotationPeriod  10784
	Obliquity       -16.7766
	EqAscendNode    -8.97786

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.630 0.524 0.450)

	Surface
	{
		SurfStyle       0.973216
		OceanStyle      0.281859
		Randomize      (0.677, 0.722, -0.721)
		colorDistMagn   0.949912
		colorDistFreq   0.354935
		detailScale     1140.07
		colorConversion true
		snowLevel       2
		tropicLatitude  0.551168
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.61632
		terraceProb     0.686954
		erosion         0
		montesMagn      0.401675
		montesFreq      2.96838
		montesSpiky     0.927239
		montesFraction  0.812344
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.91096
		hillsFraction   0.504852
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233242
		craterFreq      0.187001
		craterDensity   0.737835
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.8777
		volcanoTemp     1502.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.183, 0.180, 0.050)
		colorShelf     (0.252, 0.215, 0.207, 0.040)
		colorBeach     (0.290, 0.246, 0.234, 0.030)
		colorDesert    (0.328, 0.278, 0.266, 0.020)
		colorLowland   (0.365, 0.309, 0.293, 0.030)
		colorUpland    (0.403, 0.341, 0.320, 0.050)
		colorRock      (0.441, 0.372, 0.356, 0.020)
		colorSnow      (0.441, 0.372, 0.356, 1.000)
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
		SemiMajorAxis   0.0509847
		Period          0.615117
		Eccentricity    0.407399
		Inclination     -16.7766
		AscendingNode   -8.97786
		ArgOfPericenter 97.4966
		MeanAnomaly     174.23
	}
}

DwarfMoon	"8.D58"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            4.05274e-008
	Radius          55.8895
	InertiaMoment   0.399762

	RotationPeriod  3630.51
	Obliquity       75.3585
	EqAscendNode    -3.3561

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.803 0.693 0.639)

	Surface
	{
		SurfStyle       0.279011
		OceanStyle      0.533215
		Randomize      (-0.279, -0.995, 0.811)
		colorDistMagn   0.186495
		colorDistFreq   2.06327
		detailScale     1526.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.491976
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.306265
		terraceProb     0.452389
		erosion         0
		montesMagn      0.621153
		montesFreq      1.9869
		montesSpiky     0.831854
		montesFraction  0.640149
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.73644
		hillsFraction   0.671331
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25041
		craterFreq      0.25704
		craterDensity   0.96451
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   43.5273
		volcanoTemp     1263.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.277, 0.255, 0.000)
		colorShelf     (0.341, 0.295, 0.271, 0.000)
		colorBeach     (0.361, 0.312, 0.287, 0.000)
		colorDesert    (0.381, 0.329, 0.303, 0.000)
		colorLowland   (0.402, 0.347, 0.319, 0.000)
		colorUpland    (0.422, 0.364, 0.335, 0.000)
		colorRock      (0.442, 0.381, 0.351, 0.000)
		colorSnow      (0.462, 0.399, 0.367, 1.000)
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
		SemiMajorAxis   0.051323
		Period          0.62125
		Eccentricity    0.403093
		Inclination     75.3585
		AscendingNode   -3.3561
		ArgOfPericenter 46.5321
		MeanAnomaly     -111.328
	}
}

DwarfMoon	"8.D59"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            5.50336e-008
	Radius          56.1363
	InertiaMoment   0.397725

	Obliquity       -71.1768
	EqAscendNode    -34.2577
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.612 0.605 0.602)

	Surface
	{
		SurfStyle       0.712529
		OceanStyle      0.31112
		Randomize      (-0.352, -0.610, 0.485)
		colorDistMagn   0.971547
		colorDistFreq   2.54831
		detailScale     1532.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0.771383
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.641257
		terraceProb     0.363071
		erosion         0
		montesMagn      0.378853
		montesFreq      1.93283
		montesSpiky     0.903409
		montesFraction  0.782494
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.9349
		hillsFraction   0.516411
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262809
		craterFreq      0.220958
		craterDensity   0.942375
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.5177
		volcanoTemp     1124.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.206, 0.168, 0.000)
		colorShelf     (0.245, 0.212, 0.192, 0.000)
		colorBeach     (0.288, 0.248, 0.229, 0.000)
		colorDesert    (0.312, 0.266, 0.223, 0.000)
		colorLowland   (0.343, 0.284, 0.253, 0.000)
		colorUpland    (0.379, 0.345, 0.307, 0.000)
		colorRock      (0.410, 0.375, 0.331, 0.000)
		colorSnow      (0.447, 0.399, 0.349, 1.000)
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
		SemiMajorAxis   0.0516238
		Period          0.626719
		Eccentricity    0.388612
		Inclination     -71.1768
		AscendingNode   -34.2577
		ArgOfPericenter 157.243
		MeanAnomaly     -126.19
	}
}

DwarfMoon	"8.D60"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            7.48497e-008
	Radius          59.4927
	InertiaMoment   0.398966

	Obliquity       60.5445
	EqAscendNode    -157.47
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.568 0.448 0.401)

	Surface
	{
		SurfStyle       0.958525
		OceanStyle      0.892839
		Randomize      (-0.617, -0.163, 0.256)
		colorDistMagn   0.946156
		colorDistFreq   2.08204
		detailScale     1624.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.335233
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.31496
		terraceProb     0.52636
		erosion         0
		montesMagn      0.513884
		montesFreq      3.52239
		montesSpiky     0.901785
		montesFraction  0.559224
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.54394
		hillsFraction   0.61889
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241012
		craterFreq      0.19345
		craterDensity   0.981091
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.0937
		volcanoTemp     1532.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.157, 0.161, 0.050)
		colorShelf     (0.227, 0.184, 0.185, 0.040)
		colorBeach     (0.261, 0.211, 0.209, 0.030)
		colorDesert    (0.296, 0.237, 0.237, 0.020)
		colorLowland   (0.330, 0.264, 0.261, 0.030)
		colorUpland    (0.364, 0.291, 0.285, 0.050)
		colorRock      (0.398, 0.318, 0.317, 0.020)
		colorSnow      (0.398, 0.318, 0.317, 1.000)
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
		SemiMajorAxis   0.0520047
		Period          0.633668
		Eccentricity    0.225011
		Inclination     60.5445
		AscendingNode   -157.47
		ArgOfPericenter 48.0994
		MeanAnomaly     -98.0377
	}
}

DwarfMoon	"8.D61"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.02054e-007
	Radius          63.3123
	InertiaMoment   0.399888

	Obliquity       -43.2016
	EqAscendNode    -129.567
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.521 0.516 0.514)

	Surface
	{
		SurfStyle       0.639092
		OceanStyle      0.129454
		Randomize      (0.171, 0.560, 0.450)
		colorDistMagn   0.963692
		colorDistFreq   2.0547
		detailScale     1728.85
		colorConversion true
		snowLevel       2
		tropicLatitude  0.557946
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.292717
		terraceProb     0.208399
		erosion         0
		montesMagn      0.560908
		montesFreq      2.26061
		montesSpiky     0.957033
		montesFraction  0.876891
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.2495
		hillsFraction   0.630216
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217913
		craterFreq      0.218822
		craterDensity   0.940827
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.0727
		volcanoTemp     1523.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.176, 0.144, 0.000)
		colorShelf     (0.209, 0.181, 0.164, 0.000)
		colorBeach     (0.245, 0.212, 0.195, 0.000)
		colorDesert    (0.266, 0.227, 0.190, 0.000)
		colorLowland   (0.292, 0.243, 0.216, 0.000)
		colorUpland    (0.323, 0.294, 0.262, 0.000)
		colorRock      (0.349, 0.320, 0.282, 0.000)
		colorSnow      (0.381, 0.341, 0.298, 1.000)
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
		SemiMajorAxis   0.0524426
		Period          0.64169
		Eccentricity    0.446413
		Inclination     -43.2016
		AscendingNode   -129.567
		ArgOfPericenter 112.703
		MeanAnomaly     -179.088
	}
}

DwarfMoon	"8.D62"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.39625e-007
	Radius          90.0965
	InertiaMoment   0.397949

	Obliquity       14.8577
	EqAscendNode    -119.433
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.824 0.742 0.700)

	Surface
	{
		SurfStyle       0.129813
		OceanStyle      0.660424
		Randomize      (0.591, -0.441, -0.697)
		colorDistMagn   0.660904
		colorDistFreq   5.84705
		detailScale     2460.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0.256443
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.682999
		terraceProb     0.672219
		erosion         0
		montesMagn      0.697121
		montesFreq      2.7164
		montesSpiky     0.979189
		montesFraction  0.607723
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.6768
		hillsFraction   0.660217
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257006
		craterFreq      0.29741
		craterDensity   0.861045
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.8035
		volcanoTemp     1218.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.330, 0.297, 0.280, 0.000)
		colorShelf     (0.350, 0.315, 0.298, 0.000)
		colorBeach     (0.371, 0.334, 0.315, 0.000)
		colorDesert    (0.391, 0.352, 0.333, 0.000)
		colorLowland   (0.412, 0.371, 0.350, 0.000)
		colorUpland    (0.433, 0.389, 0.368, 0.000)
		colorRock      (0.453, 0.408, 0.385, 0.000)
		colorSnow      (0.474, 0.427, 0.403, 1.000)
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
		SemiMajorAxis   0.052937
		Period          0.650785
		Eccentricity    0.219428
		Inclination     14.8577
		AscendingNode   -119.433
		ArgOfPericenter 103.07
		MeanAnomaly     23.0615
	}
}

DwarfMoon	"8.D63"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.91884e-007
	Radius          85.7963
	InertiaMoment   0.399107

	RotationPeriod  11596.8
	Obliquity       82.7557
	EqAscendNode    59.1814

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.699 0.695 0.692)

	Surface
	{
		SurfStyle       0.979818
		OceanStyle      0.511415
		Randomize      (-0.332, -0.423, 0.730)
		colorDistMagn   0.328159
		colorDistFreq   3.05703
		detailScale     2342.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.872691
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.599744
		terraceProb     0.445694
		erosion         0
		montesMagn      0.340745
		montesFreq      2.8018
		montesSpiky     0.935928
		montesFraction  0.901167
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.7552
		hillsFraction   0.771326
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216491
		craterFreq      0.161034
		craterDensity   0.943945
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   30.7083
		volcanoTemp     1601.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.243, 0.277, 0.050)
		colorShelf     (0.279, 0.285, 0.318, 0.040)
		colorBeach     (0.321, 0.327, 0.360, 0.030)
		colorDesert    (0.363, 0.368, 0.408, 0.020)
		colorLowland   (0.405, 0.410, 0.450, 0.030)
		colorUpland    (0.447, 0.452, 0.491, 0.050)
		colorRock      (0.489, 0.493, 0.546, 0.020)
		colorSnow      (0.489, 0.493, 0.546, 1.000)
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
		SemiMajorAxis   0.0535154
		Period          0.66148
		Eccentricity    0.347508
		Inclination     82.7557
		AscendingNode   59.1814
		ArgOfPericenter -5.9011
		MeanAnomaly     129.053
	}
}

DwarfMoon	"8.D64"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.65183e-007
	Radius          91.2123
	InertiaMoment   0.394395

	RotationPeriod  23336.1
	Obliquity       -53.3387
	EqAscendNode    -38.2578

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.648 0.644 0.640)

	Surface
	{
		SurfStyle       0.433305
		OceanStyle      0.555925
		Randomize      (0.048, 0.983, 0.477)
		colorDistMagn   0.607903
		colorDistFreq   3.46288
		detailScale     2490.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98887
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.281044
		terraceProb     0.523855
		erosion         0
		montesMagn      0.567846
		montesFreq      2.6233
		montesSpiky     0.870628
		montesFraction  0.683464
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.6008
		hillsFraction   0.66022
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258144
		craterFreq      0.334373
		craterDensity   0.913499
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.7707
		volcanoTemp     1362.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.258, 0.256, 0.000)
		colorShelf     (0.275, 0.274, 0.272, 0.000)
		colorBeach     (0.292, 0.290, 0.288, 0.000)
		colorDesert    (0.308, 0.306, 0.304, 0.000)
		colorLowland   (0.324, 0.322, 0.320, 0.000)
		colorUpland    (0.340, 0.338, 0.336, 0.000)
		colorRock      (0.356, 0.354, 0.352, 0.000)
		colorSnow      (0.373, 0.370, 0.368, 1.000)
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
		SemiMajorAxis   0.0537344
		Period          0.665544
		Eccentricity    0.175083
		Inclination     -53.3387
		AscendingNode   -38.2578
		ArgOfPericenter 25.6252
		MeanAnomaly     136.788
	}
}

DwarfMoon	"8.D65"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.69007e-007
	Radius          97.7941
	InertiaMoment   0.39815

	Obliquity       -11.7501
	EqAscendNode    20.8692
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.579 0.575 0.568)

	Surface
	{
		SurfStyle       0.846703
		OceanStyle      0.152062
		Randomize      (0.605, -0.990, 0.879)
		colorDistMagn   0.937562
		colorDistFreq   3.96853
		detailScale     2670.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.392437
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470041
		terraceProb     0.235831
		erosion         0
		montesMagn      0.503514
		montesFreq      2.98492
		montesSpiky     0.977382
		montesFraction  0.431006
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.2595
		hillsFraction   0.642556
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22179
		craterFreq      0.330279
		craterDensity   0.799214
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.2407
		volcanoTemp     1694.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.195, 0.159, 0.000)
		colorShelf     (0.232, 0.201, 0.182, 0.000)
		colorBeach     (0.272, 0.236, 0.216, 0.000)
		colorDesert    (0.295, 0.253, 0.210, 0.000)
		colorLowland   (0.324, 0.270, 0.238, 0.000)
		colorUpland    (0.359, 0.328, 0.290, 0.000)
		colorRock      (0.388, 0.356, 0.312, 0.000)
		colorSnow      (0.423, 0.379, 0.329, 1.000)
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
		SemiMajorAxis   0.0540677
		Period          0.671745
		Eccentricity    0.444396
		Inclination     -11.7501
		AscendingNode   20.8692
		ArgOfPericenter -152.462
		MeanAnomaly     -67.5833
	}
}

Comet	"C1"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            9.90446e-012
	Radius          3.16263
	InertiaMoment   0.397712

	Oblateness      0.249

	RotationPeriod  6.55834
	Obliquity       133.857
	EqAscendNode    344.802

	AbsMagn         11.3256
	SlopeParam      5.63356
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.514 0.508 0.500)

	Surface
	{
		SurfStyle       0.464091
		OceanStyle      0.062265
		Randomize      (-0.723, -0.209, 0.504)
		colorDistMagn   0.389387
		colorDistFreq   0.00795082
		detailScale     86.3608
		colorConversion true
		snowLevel       2
		tropicLatitude  0.840696
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.657154
		terraceProb     0.358553
		erosion         0
		montesMagn      0.495418
		montesFreq      4.33406
		montesSpiky     0.917525
		montesFraction  0.713401
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0199473
		hillsFraction   0.579121
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266965
		craterFreq      0.278115
		craterDensity   0.989397
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   157.557
		volcanoTemp     1538.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.203, 0.200, 0.000)
		colorShelf     (0.218, 0.216, 0.213, 0.000)
		colorBeach     (0.231, 0.228, 0.225, 0.000)
		colorDesert    (0.244, 0.241, 0.238, 0.000)
		colorLowland   (0.257, 0.254, 0.250, 0.000)
		colorUpland    (0.270, 0.267, 0.263, 0.000)
		colorRock      (0.283, 0.279, 0.275, 0.000)
		colorSnow      (0.295, 0.292, 0.288, 1.000)
		BumpHeight      2.84636
		BumpOffset      0.569273
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
		MaxLength   0.504484
		GasToDust   0.25
		Particles   1998
		GasBright   0.227469
		DustBright  0.358222
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.69
		Period          7.42969
		Eccentricity    0.932131
		Inclination     -97.1463
		AscendingNode   -151.322
		ArgOfPericenter 140.436
		MeanAnomaly     71.5812
	}
}

Comet	"C2"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            7.66039e-008
	Radius          57.2123
	InertiaMoment   0.399587

	Oblateness      0.249

	RotationPeriod  2.82908
	Obliquity       87.0628
	EqAscendNode    329.379

	AbsMagn         13.8834
	SlopeParam      4.47607
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.771 0.749 0.717)

	Surface
	{
		SurfStyle       0.545319
		OceanStyle      0.762368
		Randomize      (0.025, 0.697, -0.387)
		colorDistMagn   0.817857
		colorDistFreq   2.00684
		detailScale     1562.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999528
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.47757
		terraceProb     0.221133
		erosion         0
		montesMagn      0.448255
		montesFreq      2.68064
		montesSpiky     0.966423
		montesFraction  0.569673
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.02728
		hillsFraction   0.593662
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202481
		craterFreq      0.23857
		craterDensity   0.745979
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.4093
		volcanoTemp     1253.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.255, 0.201, 0.000)
		colorShelf     (0.309, 0.262, 0.229, 0.000)
		colorBeach     (0.363, 0.307, 0.272, 0.000)
		colorDesert    (0.393, 0.330, 0.265, 0.000)
		colorLowland   (0.432, 0.352, 0.301, 0.000)
		colorUpland    (0.478, 0.427, 0.366, 0.000)
		colorRock      (0.517, 0.464, 0.394, 0.000)
		colorSnow      (0.563, 0.494, 0.416, 1.000)
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
		MaxLength   0.985676
		GasToDust   0.25
		Particles   2971
		GasBright   0.120883
		DustBright  0.149294
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.51412
		Period          13.481
		Eccentricity    0.974191
		Inclination     2.38488
		AscendingNode   60.4805
		ArgOfPericenter -92.8403
		MeanAnomaly     155.031
	}
}

Comet	"C3"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.35869e-015
	Radius          0.195861
	InertiaMoment   0.398386

	Oblateness      0.00198067

	RotationPeriod  123.57
	Obliquity       40.2685
	EqAscendNode    313.957

	AbsMagn         2.06981
	SlopeParam      3.46829
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.660 0.656 0.654)

	Surface
	{
		SurfStyle       0.04562
		OceanStyle      0.93166
		Randomize      (-0.439, -0.777, -0.086)
		colorDistMagn   0.978264
		colorDistFreq   1.29533e-005
		detailScale     5.34831
		colorConversion true
		snowLevel       2
		tropicLatitude  0.464886
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.462121
		terraceProb     0.323634
		erosion         0
		montesMagn      0.4026
		montesFreq      2.56485
		montesSpiky     0.921233
		montesFraction  0.783031
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.37046e-005
		hillsFraction   0.914789
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267906
		craterFreq      0.234981
		craterDensity   0.933809
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   632.293
		volcanoTemp     1543.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.262, 0.262, 0.000)
		colorShelf     (0.280, 0.279, 0.278, 0.000)
		colorBeach     (0.297, 0.295, 0.294, 0.000)
		colorDesert    (0.313, 0.311, 0.311, 0.000)
		colorLowland   (0.330, 0.328, 0.327, 0.000)
		colorUpland    (0.346, 0.344, 0.344, 0.000)
		colorRock      (0.363, 0.361, 0.360, 0.000)
		colorSnow      (0.379, 0.377, 0.376, 1.000)
		BumpHeight      0.176275
		BumpOffset      0.035255
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
		MaxLength   0.056118
		GasToDust   0.25
		Particles   1093
		GasBright   0.00488075
		DustBright  0.749783
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.02799
		Period          9.76652
		Eccentricity    0.932015
		Inclination     12.9581
		AscendingNode   -168.007
		ArgOfPericenter 89.1324
		MeanAnomaly     -60.1762
	}
}

Comet	"C4"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.82428e-011
	Radius          3.54331
	InertiaMoment   0.39411

	Oblateness      0.00181962

	RotationPeriod  111.9
	Obliquity       353.474
	EqAscendNode    298.534

	AbsMagn         4.65208
	SlopeParam      2.29001
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.667 0.664 0.662)

	Surface
	{
		SurfStyle       0.908601
		OceanStyle      0.704264
		Randomize      (0.513, 0.155, -0.871)
		colorDistMagn   0.641826
		colorDistFreq   0.00635521
		detailScale     96.756
		colorConversion true
		snowLevel       2
		tropicLatitude  0.451855
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.676052
		terraceProb     0.23962
		erosion         0
		montesMagn      0.613905
		montesFreq      2.81228
		montesSpiky     0.941093
		montesFraction  0.245838
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0233291
		hillsFraction   0.427418
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215786
		craterFreq      0.254828
		craterDensity   0.769242
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   130.068
		volcanoTemp     1527.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.232, 0.265, 0.050)
		colorShelf     (0.267, 0.272, 0.304, 0.040)
		colorBeach     (0.307, 0.312, 0.344, 0.030)
		colorDesert    (0.347, 0.352, 0.390, 0.020)
		colorLowland   (0.387, 0.392, 0.430, 0.030)
		colorUpland    (0.427, 0.431, 0.470, 0.050)
		colorRock      (0.467, 0.471, 0.523, 0.020)
		colorSnow      (0.467, 0.471, 0.523, 1.000)
		BumpHeight      3.18898
		BumpOffset      0.637796
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
		MaxLength   0.53731
		GasToDust   0.25
		Particles   2065
		GasBright   0.0287699
		DustBright  0.41038
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.71671
		Period          7.60653
		Eccentricity    0.921601
		Inclination     -33.3684
		AscendingNode   -175.913
		ArgOfPericenter 53.7093
		MeanAnomaly     -77.7743
	}
}

Comet	"C5"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.41095e-007
	Radius          76.5335
	InertiaMoment   0.398913

	Oblateness      0.00276332

	RotationPeriod  104.585
	Obliquity       306.68
	EqAscendNode    283.112

	AbsMagn         6.27899
	SlopeParam      5.97845
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.712 0.709 0.706)

	Surface
	{
		SurfStyle       0.311086
		OceanStyle      0.684152
		Randomize      (0.571, 0.691, 0.325)
		colorDistMagn   0.81075
		colorDistFreq   5.18922
		detailScale     2089.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.793057
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.315186
		terraceProb     0.285652
		erosion         0
		montesMagn      0.559618
		montesFreq      4.17044
		montesSpiky     0.834263
		montesFraction  0.236925
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.3088
		hillsFraction   0.534479
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221589
		craterFreq      0.203408
		craterDensity   1.05251
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.9449
		volcanoTemp     1572.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.284, 0.282, 0.000)
		colorShelf     (0.302, 0.301, 0.300, 0.000)
		colorBeach     (0.320, 0.319, 0.318, 0.000)
		colorDesert    (0.338, 0.337, 0.335, 0.000)
		colorLowland   (0.356, 0.355, 0.353, 0.000)
		colorUpland    (0.374, 0.372, 0.371, 0.000)
		colorRock      (0.391, 0.390, 0.388, 0.000)
		colorSnow      (0.409, 0.408, 0.406, 1.000)
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
		GasBright   0.115046
		DustBright  0.808591
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.07799
		Period          10.13
		Eccentricity    0.916222
		Inclination     -174.331
		AscendingNode   79.288
		ArgOfPericenter -73.476
		MeanAnomaly     -105.529
	}
}

Comet	"C6"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            4.3444e-015
	Radius          0.219445
	InertiaMoment   0.397257

	Oblateness      0.00234356

	RotationPeriod  99.0601
	Obliquity       259.886
	EqAscendNode    267.689

	AbsMagn         7.65577
	SlopeParam      4.71598
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.796 0.677 0.625)

	Surface
	{
		SurfStyle       0.373313
		OceanStyle      0.429104
		Randomize      (0.778, 0.053, 0.721)
		colorDistMagn   0.678359
		colorDistFreq   2.6832e-005
		detailScale     5.9923
		colorConversion true
		snowLevel       2
		tropicLatitude  0.871657
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.383775
		terraceProb     0.40673
		erosion         0
		montesMagn      0.580406
		montesFreq      2.72852
		montesSpiky     0.864448
		montesFraction  0.849971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000145539
		hillsFraction   0.603871
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231767
		craterFreq      0.198923
		craterDensity   0.859103
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   521.994
		volcanoTemp     1482.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.271, 0.250, 0.000)
		colorShelf     (0.338, 0.288, 0.265, 0.000)
		colorBeach     (0.358, 0.305, 0.281, 0.000)
		colorDesert    (0.378, 0.321, 0.297, 0.000)
		colorLowland   (0.398, 0.338, 0.312, 0.000)
		colorUpland    (0.418, 0.355, 0.328, 0.000)
		colorRock      (0.438, 0.372, 0.344, 0.000)
		colorSnow      (0.458, 0.389, 0.359, 1.000)
		BumpHeight      0.1975
		BumpOffset      0.0395
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
		MaxLength   0.0889438
		GasToDust   0.25
		Particles   1159
		GasBright   0.111653
		DustBright  0.49647
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.26474
		Period          11.5258
		Eccentricity    0.978363
		Inclination     -21.3852
		AscendingNode   24.5207
		ArgOfPericenter -14.0566
		MeanAnomaly     16.4388
	}
}

Comet	"C7"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.36009e-011
	Radius          4.73978
	InertiaMoment   0.399373

	Oblateness      0.00337959

	RotationPeriod  94.5294
	Obliquity       213.091
	EqAscendNode    252.266

	AbsMagn         8.99181
	SlopeParam      3.70276
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.813 0.751 0.698)

	Surface
	{
		SurfStyle       0.29772
		OceanStyle      0.453442
		Randomize      (0.244, -0.447, 0.739)
		colorDistMagn   0.865373
		colorDistFreq   0.0106317
		detailScale     129.428
		colorConversion true
		snowLevel       2
		tropicLatitude  0.958676
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.522216
		terraceProb     0.367508
		erosion         0
		montesMagn      0.372206
		montesFreq      3.07541
		montesSpiky     0.965354
		montesFraction  0.603229
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0541315
		hillsFraction   0.532957
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251255
		craterFreq      0.216401
		craterDensity   0.853349
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   128.2
		volcanoTemp     1264.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.325, 0.300, 0.279, 0.000)
		colorShelf     (0.346, 0.319, 0.297, 0.000)
		colorBeach     (0.366, 0.338, 0.314, 0.000)
		colorDesert    (0.386, 0.357, 0.331, 0.000)
		colorLowland   (0.406, 0.376, 0.349, 0.000)
		colorUpland    (0.427, 0.394, 0.366, 0.000)
		colorRock      (0.447, 0.413, 0.384, 0.000)
		colorSnow      (0.467, 0.432, 0.401, 1.000)
		BumpHeight      4.2658
		BumpOffset      0.85316
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
		MaxLength   0.570136
		GasToDust   0.25
		Particles   2131
		GasBright   0.0710014
		DustBright  0.221609
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.90131
		Period          8.86589
		Eccentricity    0.946494
		Inclination     40.7878
		AscendingNode   11.2369
		ArgOfPericenter 63.4998
		MeanAnomaly     -14.9846
	}
}

Comet	"C8"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.59879e-007
	Radius          85.7507
	InertiaMoment   0.398081

	Oblateness      0.00280102

	RotationPeriod  90.6354
	Obliquity       166.297
	EqAscendNode    236.844

	AbsMagn         10.4527
	SlopeParam      2.60041
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.630 0.555 0.525)

	Surface
	{
		SurfStyle       0.517594
		OceanStyle      0.496035
		Randomize      (0.385, -0.737, 0.255)
		colorDistMagn   0.935056
		colorDistFreq   5.72303
		detailScale     2341.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998298
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.652886
		terraceProb     0.176924
		erosion         0
		montesMagn      0.416938
		montesFreq      2.67901
		montesSpiky     0.950789
		montesFraction  0.599293
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.4753
		hillsFraction   0.57718
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233484
		craterFreq      0.259512
		craterDensity   0.69094
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.3729
		volcanoTemp     1444.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.189, 0.147, 0.000)
		colorShelf     (0.252, 0.194, 0.168, 0.000)
		colorBeach     (0.296, 0.227, 0.199, 0.000)
		colorDesert    (0.322, 0.244, 0.194, 0.000)
		colorLowland   (0.353, 0.261, 0.220, 0.000)
		colorUpland    (0.391, 0.316, 0.268, 0.000)
		colorRock      (0.422, 0.344, 0.288, 0.000)
		colorSnow      (0.460, 0.366, 0.304, 1.000)
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
		GasBright   0.234445
		DustBright  0.542651
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.13412
		Period          10.5432
		Eccentricity    0.984499
		Inclination     104.808
		AscendingNode   -33.9453
		ArgOfPericenter 80.9246
		MeanAnomaly     -160.713
	}
}

Comet	"C9"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            8.00186e-015
	Radius          0.29354
	InertiaMoment   0.399801

	Oblateness      0.00396916

	RotationPeriod  87.1852
	Obliquity       119.503
	EqAscendNode    221.421

	AbsMagn         12.3633
	SlopeParam      6.3953
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.611 0.503 0.445)

	Surface
	{
		SurfStyle       0.678112
		OceanStyle      0.981421
		Randomize      (0.824, -0.033, 0.271)
		colorDistMagn   0.273899
		colorDistFreq   7.15346e-005
		detailScale     8.0156
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992167
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411644
		terraceProb     0.119453
		erosion         0
		montesMagn      0.656046
		montesFreq      2.94906
		montesSpiky     0.988869
		montesFraction  0.101064
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000211017
		hillsFraction   0.558787
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236029
		craterFreq      0.173994
		craterDensity   1.02455
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   514.491
		volcanoTemp     1350.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.171, 0.125, 0.000)
		colorShelf     (0.245, 0.176, 0.142, 0.000)
		colorBeach     (0.287, 0.206, 0.169, 0.000)
		colorDesert    (0.312, 0.221, 0.165, 0.000)
		colorLowland   (0.342, 0.236, 0.187, 0.000)
		colorUpland    (0.379, 0.287, 0.227, 0.000)
		colorRock      (0.410, 0.312, 0.245, 0.000)
		colorSnow      (0.446, 0.332, 0.258, 1.000)
		BumpHeight      0.264186
		BumpOffset      0.0528372
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
		MaxLength   0.12177
		GasToDust   0.25
		Particles   1225
		GasBright   0.166511
		DustBright  0.295072
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.08108
		Period          3.80125
		Eccentricity    0.910771
		Inclination     36.792
		AscendingNode   175.028
		ArgOfPericenter 64.4085
		MeanAnomaly     -90.3298
	}
}

Comet	"C10"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            6.18887e-011
	Radius          5.31063
	InertiaMoment   0.398664

	Oblateness      0.00325501

	RotationPeriod  84.0617
	Obliquity       72.7084
	EqAscendNode    205.999

	AbsMagn         18.1779
	SlopeParam      4.96669
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.475 0.386 0.329)

	Surface
	{
		SurfStyle       0.505507
		OceanStyle      0.904782
		Randomize      (0.222, 0.141, 0.691)
		colorDistMagn   0.640197
		colorDistFreq   0.0208204
		detailScale     145.016
		colorConversion true
		snowLevel       2
		tropicLatitude  0.881904
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.417206
		terraceProb     0.348132
		erosion         0
		montesMagn      0.474623
		montesFreq      3.41205
		montesSpiky     0.880838
		montesFraction  0.396062
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0735802
		hillsFraction   0.631414
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266785
		craterFreq      0.187324
		craterDensity   0.940392
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   105.839
		volcanoTemp     1317.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.131, 0.092, 0.000)
		colorShelf     (0.190, 0.135, 0.105, 0.000)
		colorBeach     (0.223, 0.158, 0.125, 0.000)
		colorDesert    (0.242, 0.170, 0.122, 0.000)
		colorLowland   (0.266, 0.181, 0.138, 0.000)
		colorUpland    (0.294, 0.220, 0.168, 0.000)
		colorRock      (0.318, 0.239, 0.181, 0.000)
		colorSnow      (0.346, 0.255, 0.191, 1.000)
		BumpHeight      4.77957
		BumpOffset      0.955913
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
		MaxLength   0.602962
		GasToDust   0.25
		Particles   2197
		GasBright   0.397145
		DustBright  0.548925
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.79009
		Period          8.09944
		Eccentricity    0.921657
		Inclination     63.8354
		AscendingNode   -45.3274
		ArgOfPericenter -133.286
		MeanAnomaly     29.1174
	}
}

Comet	"C11"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            4.78664e-007
	Radius          114.704
	InertiaMoment   0.396586

	Oblateness      0.00451083

	RotationPeriod  81.1885
	Obliquity       25.9141
	EqAscendNode    190.576

	AbsMagn         3.57468
	SlopeParam      3.93319
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.528 0.436 0.366)

	Surface
	{
		SurfStyle       0.866981
		OceanStyle      0.0481429
		Randomize      (0.214, 0.218, 0.738)
		colorDistMagn   0.579143
		colorDistFreq   3.43868
		detailScale     3132.2
		colorConversion true
		snowLevel       2
		tropicLatitude  0.573129
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.298026
		terraceProb     0.34457
		erosion         0
		montesMagn      0.452765
		montesFreq      2.51491
		montesSpiky     0.880057
		montesFraction  0.641982
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.8603
		hillsFraction   0.696321
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231433
		craterFreq      0.352126
		craterDensity   0.765065
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.9939
		volcanoTemp     1300.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.153, 0.146, 0.050)
		colorShelf     (0.211, 0.179, 0.168, 0.040)
		colorBeach     (0.243, 0.205, 0.190, 0.030)
		colorDesert    (0.275, 0.231, 0.216, 0.020)
		colorLowland   (0.307, 0.257, 0.238, 0.030)
		colorUpland    (0.338, 0.284, 0.260, 0.050)
		colorRock      (0.370, 0.310, 0.289, 0.020)
		colorSnow      (0.370, 0.310, 0.289, 1.000)
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
		GasBright   0.301929
		DustBright  0.328627
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.93079
		Period          9.07285
		Eccentricity    0.954868
		Inclination     -131.59
		AscendingNode   132.88
		ArgOfPericenter -2.2383
		MeanAnomaly     14.5141
	}
}

Comet	"C12"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.47384e-014
	Radius          0.32889
	InertiaMoment   0.399151

	Oblateness      0.00372851

	RotationPeriod  78.5126
	Obliquity       339.12
	EqAscendNode    175.153

	AbsMagn         5.50622
	SlopeParam      2.88023
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.637 0.498 0.421)

	Surface
	{
		SurfStyle       0.901098
		OceanStyle      0.19315
		Randomize      (0.509, -0.763, -0.629)
		colorDistMagn   0.549981
		colorDistFreq   4.43125e-005
		detailScale     8.98088
		colorConversion true
		snowLevel       2
		tropicLatitude  0.34441
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.67394
		terraceProb     0.480446
		erosion         0
		montesMagn      0.551667
		montesFreq      3.23425
		montesSpiky     0.912519
		montesFraction  0.300676
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000251528
		hillsFraction   0.527374
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25068
		craterFreq      0.192857
		craterDensity   0.805528
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   424.747
		volcanoTemp     1433.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.174, 0.168, 0.050)
		colorShelf     (0.255, 0.204, 0.193, 0.040)
		colorBeach     (0.293, 0.234, 0.219, 0.030)
		colorDesert    (0.331, 0.264, 0.248, 0.020)
		colorLowland   (0.370, 0.294, 0.273, 0.030)
		colorUpland    (0.408, 0.323, 0.299, 0.050)
		colorRock      (0.446, 0.353, 0.332, 0.020)
		colorSnow      (0.446, 0.353, 0.332, 1.000)
		BumpHeight      0.296001
		BumpOffset      0.0592002
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
		MaxLength   0.154596
		GasToDust   0.25
		Particles   1292
		GasBright   0.0119322
		DustBright  0.303111
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.97177
		Period          9.36327
		Eccentricity    0.936797
		Inclination     -24.6995
		AscendingNode   -127.165
		ArgOfPericenter 14.3236
		MeanAnomaly     -83.6006
	}
}

Comet	"C13"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.13991e-010
	Radius          7.10389
	InertiaMoment   0.397722

	Oblateness      0.00515737

	RotationPeriod  75.9955
	Obliquity       292.326
	EqAscendNode    159.731

	AbsMagn         6.97315
	SlopeParam      6.95493
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.535 0.529 0.524)

	Surface
	{
		SurfStyle       0.363856
		OceanStyle      0.210894
		Randomize      (0.866, -0.242, -0.365)
		colorDistMagn   0.271898
		colorDistFreq   0.0240684
		detailScale     193.984
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994048
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581495
		terraceProb     0.101795
		erosion         0
		montesMagn      0.493695
		montesFreq      2.42232
		montesSpiky     0.996423
		montesFraction  0.503468
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0892977
		hillsFraction   0.817136
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229088
		craterFreq      0.270178
		craterDensity   0.828011
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   104.32
		volcanoTemp     1902.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.212, 0.209, 0.000)
		colorShelf     (0.228, 0.225, 0.223, 0.000)
		colorBeach     (0.241, 0.238, 0.236, 0.000)
		colorDesert    (0.254, 0.251, 0.249, 0.000)
		colorLowland   (0.268, 0.265, 0.262, 0.000)
		colorUpland    (0.281, 0.278, 0.275, 0.000)
		colorRock      (0.295, 0.291, 0.288, 0.000)
		colorSnow      (0.308, 0.304, 0.301, 1.000)
		BumpHeight      6.3935
		BumpOffset      1.2787
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
		MaxLength   0.635788
		GasToDust   0.25
		Particles   2264
		GasBright   0.0774904
		DustBright  0.722039
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.13764
		Period          10.5693
		Eccentricity    0.94271
		Inclination     -53.2976
		AscendingNode   63.0629
		ArgOfPericenter 9.43641
		MeanAnomaly     65.1298
	}
}

Comet	"C14"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.50988e-018
	Radius          0.0203681
	InertiaMoment   0.399592

	Oblateness      0.00423776

	RotationPeriod  73.6084
	Obliquity       245.531
	EqAscendNode    144.308

	AbsMagn         8.31018
	SlopeParam      5.23366
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.621 0.618 0.615)

	Surface
	{
		SurfStyle       0.68268
		OceanStyle      0.0357053
		Randomize      (-0.631, 0.837, 0.894)
		colorDistMagn   0.741189
		colorDistFreq   1.53544e-007
		detailScale     0.556185
		colorConversion true
		snowLevel       2
		tropicLatitude  0.927966
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515359
		terraceProb     0.190981
		erosion         0
		montesMagn      0.362882
		montesFreq      3.00749
		montesSpiky     0.987833
		montesFraction  0.480667
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.34076e-007
		hillsFraction   0.576612
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224474
		craterFreq      0.270006
		craterDensity   0.828579
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1704.55
		volcanoTemp     1907.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.210, 0.172, 0.000)
		colorShelf     (0.248, 0.216, 0.197, 0.000)
		colorBeach     (0.292, 0.253, 0.234, 0.000)
		colorDesert    (0.317, 0.272, 0.228, 0.000)
		colorLowland   (0.348, 0.290, 0.258, 0.000)
		colorUpland    (0.385, 0.352, 0.314, 0.000)
		colorRock      (0.416, 0.383, 0.338, 0.000)
		colorSnow      (0.453, 0.408, 0.357, 1.000)
		BumpHeight      0.0183313
		BumpOffset      0.00366626
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
		GasBright   0.0754897
		DustBright  0.408526
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.21033
		Period          11.1129
		Eccentricity    0.945218
		Inclination     -128.886
		AscendingNode   26.7449
		ArgOfPericenter 32.1715
		MeanAnomaly     -48.3856
	}
}

Comet	"C15"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.71464e-014
	Radius          0.439962
	InertiaMoment   0.398393

	Oblateness      0.00585437

	RotationPeriod  71.329
	Obliquity       198.737
	EqAscendNode    128.886

	AbsMagn         9.68385
	SlopeParam      4.16275
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.772 0.768 0.765)

	Surface
	{
		SurfStyle       0.634535
		OceanStyle      0.976991
		Randomize      (-0.297, 0.071, 0.332)
		colorDistMagn   0.64417
		colorDistFreq   0.000129673
		detailScale     12.0139
		colorConversion true
		snowLevel       2
		tropicLatitude  0.601477
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.603064
		terraceProb     0.23944
		erosion         0
		montesMagn      0.572953
		montesFreq      3.8481
		montesSpiky     0.804975
		montesFraction  0.15248
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000427134
		hillsFraction   0.373152
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245172
		craterFreq      0.18657
		craterDensity   0.716789
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   418.663
		volcanoTemp     1156.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.261, 0.214, 0.000)
		colorShelf     (0.309, 0.269, 0.245, 0.000)
		colorBeach     (0.363, 0.315, 0.291, 0.000)
		colorDesert    (0.393, 0.338, 0.283, 0.000)
		colorLowland   (0.432, 0.361, 0.321, 0.000)
		colorUpland    (0.478, 0.438, 0.390, 0.000)
		colorRock      (0.517, 0.476, 0.421, 0.000)
		colorSnow      (0.563, 0.507, 0.443, 1.000)
		BumpHeight      0.395965
		BumpOffset      0.0791931
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
		MaxLength   0.187422
		GasToDust   0.25
		Particles   1358
		GasBright   0.208238
		DustBright  0.760264
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.35925
		Period          12.2547
		Eccentricity    0.951615
		Inclination     -158.363
		AscendingNode   -46.5944
		ArgOfPericenter -81.6213
		MeanAnomaly     110.745
	}
}

Comet	"C16"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.09957e-010
	Radius          7.95876
	InertiaMoment   0.394426

	Oblateness      0.00469866

	RotationPeriod  69.1395
	Obliquity       151.943
	EqAscendNode    113.463

	AbsMagn         11.3
	SlopeParam      3.13962
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.780 0.741 0.700)

	Surface
	{
		SurfStyle       0.570227
		OceanStyle      0.249029
		Randomize      (-0.369, 0.554, -0.463)
		colorDistMagn   0.0928373
		colorDistFreq   0.027525
		detailScale     217.327
		colorConversion true
		snowLevel       2
		tropicLatitude  0.938704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.726594
		terraceProb     0.23894
		erosion         0
		montesMagn      0.503185
		montesFreq      3.2397
		montesSpiky     0.947717
		montesFraction  0.885851
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.216447
		hillsFraction   0.530019
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221497
		craterFreq      0.197764
		craterDensity   0.83171
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   86.1165
		volcanoTemp     1756.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.252, 0.196, 0.000)
		colorShelf     (0.312, 0.260, 0.224, 0.000)
		colorBeach     (0.366, 0.304, 0.266, 0.000)
		colorDesert    (0.398, 0.326, 0.259, 0.000)
		colorLowland   (0.437, 0.348, 0.294, 0.000)
		colorUpland    (0.483, 0.423, 0.357, 0.000)
		colorRock      (0.522, 0.460, 0.385, 0.000)
		colorSnow      (0.569, 0.489, 0.406, 1.000)
		BumpHeight      7.16289
		BumpOffset      1.43258
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
		MaxLength   0.668614
		GasToDust   0.25
		Particles   2330
		GasBright   0.178955
		DustBright  0.474034
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.26462
		Period          11.5248
		Eccentricity    0.951838
		Inclination     129.321
		AscendingNode   -53.8855
		ArgOfPericenter -56.9672
		MeanAnomaly     105.646
	}
}

Comet	"C17"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            6.46474e-018
	Radius          0.0272481
	InertiaMoment   0.398919

	Oblateness      0.00662691

	RotationPeriod  67.0255
	Obliquity       105.148
	EqAscendNode    98.0405

	AbsMagn         13.8302
	SlopeParam      7.95385
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.580 0.485 0.364)

	Surface
	{
		SurfStyle       0.409364
		OceanStyle      0.512486
		Randomize      (-0.016, 0.983, 0.929)
		colorDistMagn   0.627014
		colorDistFreq   4.73853e-007
		detailScale     0.744053
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998957
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.703253
		terraceProb     0.14665
		erosion         0
		montesMagn      0.510655
		montesFreq      3.29159
		montesSpiky     0.960802
		montesFraction  0.517745
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.5212e-006
		hillsFraction   0.40853
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240226
		craterFreq      0.231013
		craterDensity   0.819647
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1680.22
		volcanoTemp     1232.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.194, 0.146, 0.000)
		colorShelf     (0.247, 0.206, 0.155, 0.000)
		colorBeach     (0.261, 0.218, 0.164, 0.000)
		colorDesert    (0.276, 0.230, 0.173, 0.000)
		colorLowland   (0.290, 0.243, 0.182, 0.000)
		colorUpland    (0.305, 0.255, 0.191, 0.000)
		colorRock      (0.319, 0.267, 0.200, 0.000)
		colorSnow      (0.334, 0.279, 0.210, 1.000)
		BumpHeight      0.0245232
		BumpOffset      0.00490465
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
		GasBright   0.112414
		DustBright  0.225062
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.09255
		Period          10.2366
		Eccentricity    0.972634
		Inclination     167.168
		AscendingNode   -12.6822
		ArgOfPericenter -85.1935
		MeanAnomaly     -159.127
	}
}

Comet	"C18"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            5.00001e-014
	Radius          0.492875
	InertiaMoment   0.397271

	Oblateness      0.00536282

	RotationPeriod  64.9752
	Obliquity       58.3541
	EqAscendNode    82.6179

	AbsMagn         2.01462
	SlopeParam      5.52471
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.778 0.776 0.774)

	Surface
	{
		SurfStyle       0.0376124
		OceanStyle      0.973189
		Randomize      (-0.624, 0.908, -0.805)
		colorDistMagn   0.426145
		colorDistFreq   0.000145049
		detailScale     13.4588
		colorConversion true
		snowLevel       2
		tropicLatitude  0.951875
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452221
		terraceProb     0.373253
		erosion         0
		montesMagn      0.412178
		montesFreq      3.73871
		montesSpiky     0.928688
		montesFraction  0.454758
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000536005
		hillsFraction   0.807949
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235826
		craterFreq      0.273569
		craterDensity   0.97237
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   345.586
		volcanoTemp     1243.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.310, 0.310, 0.000)
		colorShelf     (0.331, 0.330, 0.329, 0.000)
		colorBeach     (0.350, 0.349, 0.348, 0.000)
		colorDesert    (0.370, 0.369, 0.368, 0.000)
		colorLowland   (0.389, 0.388, 0.387, 0.000)
		colorUpland    (0.408, 0.407, 0.406, 0.000)
		colorRock      (0.428, 0.427, 0.426, 0.000)
		colorSnow      (0.447, 0.446, 0.445, 1.000)
		BumpHeight      0.443587
		BumpOffset      0.0887174
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
		MaxLength   0.220248
		GasToDust   0.25
		Particles   1424
		GasBright   0.322329
		DustBright  0.499633
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.25309
		Period          11.4369
		Eccentricity    0.911005
		Inclination     -49.5693
		AscendingNode   176.429
		ArgOfPericenter -176.506
		MeanAnomaly     2.67314
	}
}

Comet	"C19"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.86715e-010
	Radius          10.6478
	InertiaMoment   0.399378

	Oblateness      0.0075004

	RotationPeriod  62.9786
	Obliquity       11.5598
	EqAscendNode    67.1953

	AbsMagn         4.62617
	SlopeParam      4.39447
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.619 0.573 0.509)

	Surface
	{
		SurfStyle       0.796901
		OceanStyle      0.255549
		Randomize      (0.749, 0.820, 0.316)
		colorDistMagn   0.913983
		colorDistFreq   0.02404
		detailScale     290.756
		colorConversion true
		snowLevel       2
		tropicLatitude  0.127288
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.4345
		terraceProb     0.464473
		erosion         0
		montesMagn      0.654421
		montesFreq      2.83812
		montesSpiky     0.951703
		montesFraction  0.659351
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.286264
		hillsFraction   0.592907
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241927
		craterFreq      0.248515
		craterDensity   0.954654
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   84.8926
		volcanoTemp     1464.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.195, 0.142, 0.000)
		colorShelf     (0.248, 0.200, 0.163, 0.000)
		colorBeach     (0.291, 0.235, 0.193, 0.000)
		colorDesert    (0.316, 0.252, 0.188, 0.000)
		colorLowland   (0.347, 0.269, 0.214, 0.000)
		colorUpland    (0.384, 0.326, 0.259, 0.000)
		colorRock      (0.415, 0.355, 0.280, 0.000)
		colorSnow      (0.452, 0.378, 0.295, 1.000)
		BumpHeight      9.58301
		BumpOffset      1.9166
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
		MaxLength   0.70144
		GasToDust   0.25
		Particles   2396
		GasBright   0.228505
		DustBright  0.277943
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.19713
		Period          11.0135
		Eccentricity    0.957928
		Inclination     -11.1827
		AscendingNode   -37.6972
		ArgOfPericenter -159.087
		MeanAnomaly     34.453
	}
}

Comet	"C20"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.19073e-017
	Radius          0.0305227
	InertiaMoment   0.398089

	Oblateness      0.00608126

	RotationPeriod  61.0271
	Obliquity       324.765
	EqAscendNode    51.7728

	AbsMagn         6.259
	SlopeParam      3.38525
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.535 0.531 0.530)

	Surface
	{
		SurfStyle       0.179223
		OceanStyle      0.671162
		Randomize      (-0.682, 0.472, -0.870)
		colorDistMagn   0.717152
		colorDistFreq   4.29095e-007
		detailScale     0.833472
		colorConversion true
		snowLevel       2
		tropicLatitude  0.538918
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519061
		terraceProb     0.371768
		erosion         0
		montesMagn      0.536766
		montesFreq      2.96885
		montesSpiky     0.942957
		montesFraction  0.738759
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.61209e-006
		hillsFraction   0.575274
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255186
		craterFreq      0.227024
		craterDensity   0.651315
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1386.83
		volcanoTemp     1707.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.213, 0.212, 0.000)
		colorShelf     (0.227, 0.226, 0.225, 0.000)
		colorBeach     (0.241, 0.239, 0.238, 0.000)
		colorDesert    (0.254, 0.252, 0.252, 0.000)
		colorLowland   (0.267, 0.266, 0.265, 0.000)
		colorUpland    (0.281, 0.279, 0.278, 0.000)
		colorRock      (0.294, 0.292, 0.291, 0.000)
		colorSnow      (0.307, 0.306, 0.305, 1.000)
		BumpHeight      0.0274704
		BumpOffset      0.00549408
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
		GasBright   0.010144
		DustBright  0.980791
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.51782
		Period          6.32374
		Eccentricity    0.930201
		Inclination     -3.7558
		AscendingNode   -136.286
		ArgOfPericenter 85.9056
		MeanAnomaly     65.5563
	}
}

Comet	"C21"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            9.20941e-014
	Radius          0.659456
	InertiaMoment   0.399806

	Oblateness      0.00850627

	RotationPeriod  59.1132
	Obliquity       277.971
	EqAscendNode    36.3502

	AbsMagn         7.6375
	SlopeParam      2.17217
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.607 0.603 0.595)

	Surface
	{
		SurfStyle       0.389848
		OceanStyle      0.421469
		Randomize      (-0.277, 0.470, 0.616)
		colorDistMagn   0.947927
		colorDistFreq   0.000290907
		detailScale     18.0076
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995208
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.280006
		terraceProb     0.510576
		erosion         0
		montesMagn      0.548526
		montesFreq      3.41775
		montesSpiky     0.974492
		montesFraction  0.251045
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000829641
		hillsFraction   0.517419
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216789
		craterFreq      0.247226
		craterDensity   0.939838
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   340.703
		volcanoTemp     1535.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.241, 0.238, 0.000)
		colorShelf     (0.258, 0.256, 0.253, 0.000)
		colorBeach     (0.273, 0.271, 0.268, 0.000)
		colorDesert    (0.288, 0.286, 0.283, 0.000)
		colorLowland   (0.304, 0.301, 0.298, 0.000)
		colorUpland    (0.319, 0.316, 0.312, 0.000)
		colorRock      (0.334, 0.332, 0.327, 0.000)
		colorSnow      (0.349, 0.347, 0.342, 1.000)
		BumpHeight      0.593511
		BumpOffset      0.118702
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
		MaxLength   0.253074
		GasToDust   0.25
		Particles   1491
		GasBright   0.0467946
		DustBright  0.628627
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.53726
		Period          6.44561
		Eccentricity    0.918128
		Inclination     -166.253
		AscendingNode   -99.026
		ArgOfPericenter -65.9309
		MeanAnomaly     -18.5079
	}
}

Comet	"C22"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            7.1228e-010
	Radius          11.9262
	InertiaMoment   0.398671

	Oblateness      0.00691098

	RotationPeriod  57.2301
	Obliquity       231.177
	EqAscendNode    20.9276

	AbsMagn         8.97305
	SlopeParam      5.85239
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.409 0.403 0.399)

	Surface
	{
		SurfStyle       0.999933
		OceanStyle      0.28031
		Randomize      (-0.920, -0.141, -0.786)
		colorDistMagn   0.977676
		colorDistFreq   0.0994809
		detailScale     325.665
		colorConversion true
		snowLevel       2
		tropicLatitude  0.668826
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565224
		terraceProb     0.358073
		erosion         0
		montesMagn      0.572799
		montesFreq      3.03165
		montesSpiky     0.941672
		montesFraction  0.475615
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.384988
		hillsFraction   0.669693
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273504
		craterFreq      0.227325
		craterDensity   1.01217
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   70.0621
		volcanoTemp     1549.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.139, 0.141, 0.159, 0.050)
		colorShelf     (0.163, 0.165, 0.183, 0.040)
		colorBeach     (0.188, 0.189, 0.207, 0.030)
		colorDesert    (0.212, 0.213, 0.235, 0.020)
		colorLowland   (0.237, 0.238, 0.259, 0.030)
		colorUpland    (0.261, 0.262, 0.283, 0.050)
		colorRock      (0.286, 0.286, 0.315, 0.020)
		colorSnow      (0.286, 0.286, 0.315, 1.000)
		BumpHeight      10.7336
		BumpOffset      2.14672
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
		MaxLength   0.734266
		GasToDust   0.25
		Particles   2463
		GasBright   0.0461861
		DustBright  0.313723
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.02543
		Period          9.74807
		Eccentricity    0.920702
		Inclination     -168.818
		AscendingNode   -148.2
		ArgOfPericenter -17.1647
		MeanAnomaly     73.7323
	}
}

Comet	"C23"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.19317e-017
	Radius          0.0408428
	InertiaMoment   0.396608

	Oblateness      0.00955574

	RotationPeriod  55.372
	Obliquity       184.383
	EqAscendNode    5.50498

	AbsMagn         10.4308
	SlopeParam      4.63163
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.695 0.595 0.439)

	Surface
	{
		SurfStyle       0.388752
		OceanStyle      0.918429
		Randomize      (0.308, 0.594, -0.423)
		colorDistMagn   0.691399
		colorDistFreq   9.59083e-007
		detailScale     1.11528
		colorConversion true
		snowLevel       2
		tropicLatitude  0.719254
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.576666
		terraceProb     0.269976
		erosion         0
		montesMagn      0.566189
		montesFreq      2.26757
		montesSpiky     0.985135
		montesFraction  0.457957
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.34086e-006
		hillsFraction   0.484871
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270067
		craterFreq      0.252311
		craterDensity   0.892181
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1367.37
		volcanoTemp     1624.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.238, 0.176, 0.000)
		colorShelf     (0.295, 0.253, 0.186, 0.000)
		colorBeach     (0.313, 0.268, 0.197, 0.000)
		colorDesert    (0.330, 0.283, 0.208, 0.000)
		colorLowland   (0.347, 0.298, 0.219, 0.000)
		colorUpland    (0.365, 0.312, 0.230, 0.000)
		colorRock      (0.382, 0.327, 0.241, 0.000)
		colorSnow      (0.400, 0.342, 0.252, 1.000)
		BumpHeight      0.0367585
		BumpOffset      0.0073517
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
		GasBright   0.158216
		DustBright  0.686179
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.93808
		Period          9.12432
		Eccentricity    0.937074
		Inclination     -136.659
		AscendingNode   54.5702
		ArgOfPericenter 152.528
		MeanAnomaly     -122.796
	}
}

Comet	"C24"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.69626e-013
	Radius          0.738546
	InertiaMoment   0.399157

	Oblateness      0.00789071

	RotationPeriod  53.5334
	Obliquity       137.588
	EqAscendNode    350.082

	AbsMagn         12.3304
	SlopeParam      3.62192
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.770 0.768 0.763)

	Surface
	{
		SurfStyle       0.260875
		OceanStyle      0.675214
		Randomize      (-0.552, -0.215, 0.344)
		colorDistMagn   0.0578544
		colorDistFreq   0.000413075
		detailScale     20.1672
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993442
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.587629
		terraceProb     0.197983
		erosion         0
		montesMagn      0.392827
		montesFreq      3.31274
		montesSpiky     0.934777
		montesFraction  0.137532
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00130913
		hillsFraction   0.66742
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242556
		craterFreq      0.214911
		craterDensity   0.997369
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   281.15
		volcanoTemp     1023.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.307, 0.305, 0.000)
		colorShelf     (0.327, 0.326, 0.324, 0.000)
		colorBeach     (0.346, 0.345, 0.343, 0.000)
		colorDesert    (0.366, 0.365, 0.363, 0.000)
		colorLowland   (0.385, 0.384, 0.382, 0.000)
		colorUpland    (0.404, 0.403, 0.401, 0.000)
		colorRock      (0.423, 0.422, 0.420, 0.000)
		colorSnow      (0.443, 0.441, 0.439, 1.000)
		BumpHeight      0.664692
		BumpOffset      0.132938
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
		MaxLength   0.2859
		GasToDust   0.25
		Particles   1557
		GasBright   0.130326
		DustBright  0.398556
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.03425
		Period          9.81177
		Eccentricity    0.961495
		Inclination     -113.889
		AscendingNode   132.087
		ArgOfPericenter 94.0215
		MeanAnomaly     173.603
	}
}

Comet	"C25"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.31193e-009
	Radius          15.9605
	InertiaMoment   0.397732

	Oblateness      0.0109773

	RotationPeriod  51.7091
	Obliquity       90.794
	EqAscendNode    334.66

	AbsMagn         17.771
	SlopeParam      2.49671
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.489 0.433 0.399)

	Surface
	{
		SurfStyle       0.000446053
		OceanStyle      0.702032
		Randomize      (0.805, -0.448, -0.359)
		colorDistMagn   0.884259
		colorDistFreq   0.0858703
		detailScale     435.828
		colorConversion true
		snowLevel       2
		tropicLatitude  0.928733
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.429076
		terraceProb     0.158838
		erosion         0
		montesMagn      0.541739
		montesFreq      3.48595
		montesSpiky     0.841208
		montesFraction  0.544607
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.570001
		hillsFraction   0.572011
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26757
		craterFreq      0.232642
		craterDensity   0.830166
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   69.087
		volcanoTemp     1469.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.173, 0.160, 0.000)
		colorShelf     (0.208, 0.184, 0.170, 0.000)
		colorBeach     (0.220, 0.195, 0.180, 0.000)
		colorDesert    (0.232, 0.206, 0.189, 0.000)
		colorLowland   (0.245, 0.217, 0.199, 0.000)
		colorUpland    (0.257, 0.227, 0.209, 0.000)
		colorRock      (0.269, 0.238, 0.219, 0.000)
		colorSnow      (0.281, 0.249, 0.229, 1.000)
		BumpHeight      14.3644
		BumpOffset      2.87289
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
		MaxLength   0.767091
		GasToDust   0.25
		Particles   2529
		GasBright   0.0651761
		DustBright  0.148192
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.8348
		Period          8.40476
		Eccentricity    0.948426
		Inclination     48.2844
		AscendingNode   -61.0288
		ArgOfPericenter -116.374
		MeanAnomaly     -91.3491
	}
}

Comet	"C26"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            4.03953e-017
	Radius          0.0457348
	InertiaMoment   0.399597

	Oblateness      0.00907296

	RotationPeriod  49.8942
	Obliquity       43.9997
	EqAscendNode    319.237

	AbsMagn         3.54095
	SlopeParam      6.23939
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.785 0.783 0.780)

	Surface
	{
		SurfStyle       0.803503
		OceanStyle      0.371667
		Randomize      (0.284, -0.337, 0.987)
		colorDistMagn   0.143487
		colorDistFreq   1.59439e-006
		detailScale     1.24887
		colorConversion true
		snowLevel       2
		tropicLatitude  0.818415
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581764
		terraceProb     0.694114
		erosion         0
		montesMagn      0.697087
		montesFreq      3.2676
		montesSpiky     0.917732
		montesFraction  0.352344
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.30188e-006
		hillsFraction   0.72322
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253483
		craterFreq      0.207541
		craterDensity   0.855566
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1128.2
		volcanoTemp     1312.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.266, 0.218, 0.000)
		colorShelf     (0.314, 0.274, 0.250, 0.000)
		colorBeach     (0.369, 0.321, 0.296, 0.000)
		colorDesert    (0.400, 0.344, 0.289, 0.000)
		colorLowland   (0.439, 0.368, 0.327, 0.000)
		colorUpland    (0.486, 0.446, 0.398, 0.000)
		colorRock      (0.526, 0.485, 0.429, 0.000)
		colorSnow      (0.573, 0.517, 0.452, 1.000)
		BumpHeight      0.0411613
		BumpOffset      0.00823226
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
		GasBright   0.254374
		DustBright  0.443481
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.04798
		Period          9.91131
		Eccentricity    0.933915
		Inclination     24.6755
		AscendingNode   -74.1861
		ArgOfPericenter 155.826
		MeanAnomaly     21.4256
	}
}

Comet	"C27"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.12429e-013
	Radius          0.988507
	InertiaMoment   0.398401

	Oblateness      0.0126962

	RotationPeriod  48.0842
	Obliquity       357.205
	EqAscendNode    303.815

	AbsMagn         5.48407
	SlopeParam      4.87806
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.719 0.715 0.713)

	Surface
	{
		SurfStyle       0.794939
		OceanStyle      0.64435
		Randomize      (-0.701, -0.289, 0.582)
		colorDistMagn   0.794902
		colorDistFreq   0.000628296
		detailScale     26.9928
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0584457
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.591119
		terraceProb     0.178522
		erosion         0
		montesMagn      0.695755
		montesFreq      3.72111
		montesSpiky     0.865102
		montesFraction  0.880067
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00195634
		hillsFraction   0.340547
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.284012
		craterFreq      0.203242
		craterDensity   0.769937
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   277.275
		volcanoTemp     1507.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.243, 0.200, 0.000)
		colorShelf     (0.288, 0.250, 0.228, 0.000)
		colorBeach     (0.338, 0.293, 0.271, 0.000)
		colorDesert    (0.367, 0.315, 0.264, 0.000)
		colorLowland   (0.403, 0.336, 0.299, 0.000)
		colorUpland    (0.446, 0.408, 0.364, 0.000)
		colorRock      (0.482, 0.443, 0.392, 0.000)
		colorSnow      (0.525, 0.472, 0.413, 1.000)
		BumpHeight      0.889656
		BumpOffset      0.177931
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
		MaxLength   0.318725
		GasToDust   0.25
		Particles   1623
		GasBright   0.161942
		DustBright  0.220399
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.55696
		Period          6.5699
		Eccentricity    0.912684
		Inclination     -173.863
		AscendingNode   3.21374
		ArgOfPericenter -165.511
		MeanAnomaly     -6.11632
	}
}

Comet	"C28"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.41641e-009
	Radius          17.8694
	InertiaMoment   0.394645

	Oblateness      0.0103241

	RotationPeriod  46.2744
	Obliquity       310.411
	EqAscendNode    288.392

	AbsMagn         6.95433
	SlopeParam      3.85338
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.809 0.742 0.709)

	Surface
	{
		SurfStyle       0.853527
		OceanStyle      0.429967
		Randomize      (0.715, -0.093, 0.986)
		colorDistMagn   0.902737
		colorDistFreq   0.10511
		detailScale     487.953
		colorConversion true
		snowLevel       2
		tropicLatitude  0.95222
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.528578
		terraceProb     0.302688
		erosion         0
		montesMagn      0.410149
		montesFreq      3.38305
		montesSpiky     0.906322
		montesFraction  0.554387
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.597357
		hillsFraction   0.679309
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231007
		craterFreq      0.263519
		craterDensity   0.871009
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   56.9942
		volcanoTemp     1536.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.260, 0.284, 0.050)
		colorShelf     (0.323, 0.304, 0.326, 0.040)
		colorBeach     (0.372, 0.349, 0.369, 0.030)
		colorDesert    (0.420, 0.393, 0.418, 0.020)
		colorLowland   (0.469, 0.438, 0.461, 0.030)
		colorUpland    (0.517, 0.483, 0.503, 0.050)
		colorRock      (0.566, 0.527, 0.560, 0.020)
		colorSnow      (0.566, 0.527, 0.560, 1.000)
		BumpHeight      16.0824
		BumpOffset      3.21649
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
		MaxLength   0.799917
		GasToDust   0.25
		Particles   2595
		GasBright   0.41833
		DustBright  0.448498
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.1122
		Period          10.3811
		Eccentricity    0.940716
		Inclination     112.124
		AscendingNode   38.8195
		ArgOfPericenter 153.187
		MeanAnomaly     18.705
	}
}

Comet	"C29"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            7.44033e-017
	Radius          0.0612232
	InertiaMoment   0.398925

	Oblateness      0.0148443

	RotationPeriod  44.4602
	Obliquity       263.617
	EqAscendNode    272.969

	AbsMagn         8.29192
	SlopeParam      2.78574
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.428 0.422 0.418)

	Surface
	{
		SurfStyle       0.639041
		OceanStyle      0.642752
		Randomize      (0.932, -0.755, 0.816)
		colorDistMagn   0.295108
		colorDistFreq   1.98339e-006
		detailScale     1.6718
		colorConversion true
		snowLevel       2
		tropicLatitude  0.627589
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554389
		terraceProb     0.203514
		erosion         0
		montesMagn      0.640085
		montesFreq      3.19811
		montesSpiky     0.873704
		montesFraction  0.662978
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.82857e-006
		hillsFraction   0.71547
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255353
		craterFreq      0.200453
		craterDensity   0.769696
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1112.82
		volcanoTemp     1674.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.143, 0.117, 0.000)
		colorShelf     (0.171, 0.148, 0.134, 0.000)
		colorBeach     (0.201, 0.173, 0.159, 0.000)
		colorDesert    (0.218, 0.186, 0.155, 0.000)
		colorLowland   (0.240, 0.198, 0.175, 0.000)
		colorUpland    (0.265, 0.240, 0.213, 0.000)
		colorRock      (0.287, 0.261, 0.230, 0.000)
		colorSnow      (0.312, 0.278, 0.242, 1.000)
		BumpHeight      0.0551009
		BumpOffset      0.0110202
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
		GasBright   0.022959
		DustBright  0.528356
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.33469
		Period          5.21449
		Eccentricity    0.921263
		Inclination     121.416
		AscendingNode   170.507
		ArgOfPericenter -14.7683
		MeanAnomaly     173.583
	}
}

Comet	"C30"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            5.75455e-013
	Radius          1.10654
	InertiaMoment   0.397284

	Oblateness      0.0122459

	RotationPeriod  42.6369
	Obliquity       216.823
	EqAscendNode    257.547

	AbsMagn         9.66398
	SlopeParam      6.7358
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.757 0.722 0.682)

	Surface
	{
		SurfStyle       0.236969
		OceanStyle      0.614268
		Randomize      (0.970, 0.400, -0.570)
		colorDistMagn   0.59143
		colorDistFreq   0.000463389
		detailScale     30.2159
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990145
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.4036
		terraceProb     0.409746
		erosion         0
		montesMagn      0.4992
		montesFreq      3.19046
		montesSpiky     0.943831
		montesFraction  0.48254
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00303315
		hillsFraction   0.617861
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272638
		craterFreq      0.262187
		craterDensity   0.850311
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   228.7
		volcanoTemp     1564.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.289, 0.273, 0.000)
		colorShelf     (0.322, 0.307, 0.290, 0.000)
		colorBeach     (0.341, 0.325, 0.307, 0.000)
		colorDesert    (0.359, 0.343, 0.324, 0.000)
		colorLowland   (0.378, 0.361, 0.341, 0.000)
		colorUpland    (0.397, 0.379, 0.358, 0.000)
		colorRock      (0.416, 0.397, 0.375, 0.000)
		colorSnow      (0.435, 0.415, 0.392, 1.000)
		BumpHeight      0.995885
		BumpOffset      0.199177
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
		MaxLength   0.351551
		GasToDust   0.25
		Particles   1690
		GasBright   0.0237427
		DustBright  0.212059
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.74394
		Period          7.78821
		Eccentricity    0.939453
		Inclination     66.6358
		AscendingNode   -71.1886
		ArgOfPericenter -5.92739
		MeanAnomaly     -39.9175
	}
}

Comet	"C31"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            4.45073e-009
	Radius          23.9251
	InertiaMoment   0.399384

	Oblateness      0.017616

	RotationPeriod  40.7998
	Obliquity       170.028
	EqAscendNode    242.124

	AbsMagn         11.2745
	SlopeParam      5.13864
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.686 0.683 0.682)

	Surface
	{
		SurfStyle       0.0798962
		OceanStyle      0.507176
		Randomize      (0.613, 0.076, 0.911)
		colorDistMagn   0.911195
		colorDistFreq   0.208578
		detailScale     653.315
		colorConversion true
		snowLevel       2
		tropicLatitude  0.30971
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.564655
		terraceProb     0.360911
		erosion         0
		montesMagn      0.469831
		montesFreq      2.82535
		montesSpiky     0.843431
		montesFraction  0.658678
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.2707
		hillsFraction   0.626077
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.292702
		craterFreq      0.222609
		craterDensity   0.693866
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   56.2269
		volcanoTemp     1193.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.273, 0.273, 0.000)
		colorShelf     (0.291, 0.290, 0.290, 0.000)
		colorBeach     (0.309, 0.307, 0.307, 0.000)
		colorDesert    (0.326, 0.324, 0.324, 0.000)
		colorLowland   (0.343, 0.342, 0.341, 0.000)
		colorUpland    (0.360, 0.359, 0.358, 0.000)
		colorRock      (0.377, 0.376, 0.375, 0.000)
		colorSnow      (0.394, 0.393, 0.392, 1.000)
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
		MaxLength   0.832743
		GasToDust   0.25
		Particles   2662
		GasBright   0.115055
		DustBright  0.605233
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.49259
		Period          13.3082
		Eccentricity    0.939399
		Inclination     168.172
		AscendingNode   -68.2528
		ArgOfPericenter 84.6634
		MeanAnomaly     -144.802
	}
}

Comet	"C32"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.37041e-016
	Radius          0.0685198
	InertiaMoment   0.398097

	Oblateness      0.0146798

	RotationPeriod  38.9438
	Obliquity       123.234
	EqAscendNode    226.702

	AbsMagn         13.778
	SlopeParam      4.0829
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.512 0.506 0.497)

	Surface
	{
		SurfStyle       0.285325
		OceanStyle      0.346194
		Randomize      (0.579, -0.431, 0.215)
		colorDistMagn   0.403544
		colorDistFreq   1.51e-006
		detailScale     1.87105
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999891
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.473357
		terraceProb     0.183033
		erosion         0
		montesMagn      0.472232
		montesFreq      3.03882
		montesSpiky     0.962917
		montesFraction  0.675907
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.04943e-005
		hillsFraction   0.734881
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.281418
		craterFreq      0.196883
		craterDensity   1.00246
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   917.692
		volcanoTemp     1486.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.202, 0.199, 0.000)
		colorShelf     (0.218, 0.215, 0.211, 0.000)
		colorBeach     (0.230, 0.228, 0.224, 0.000)
		colorDesert    (0.243, 0.240, 0.236, 0.000)
		colorLowland   (0.256, 0.253, 0.249, 0.000)
		colorUpland    (0.269, 0.265, 0.261, 0.000)
		colorRock      (0.282, 0.278, 0.273, 0.000)
		colorSnow      (0.294, 0.291, 0.286, 1.000)
		BumpHeight      0.0616678
		BumpOffset      0.0123336
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
		GasBright   0.0885565
		DustBright  0.316218
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.82731
		Period          8.35338
		Eccentricity    0.943339
		Inclination     113.152
		AscendingNode   -74.8699
		ArgOfPericenter -73.5656
		MeanAnomaly     133.727
	}
}

Comet	"C33"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.05991e-012
	Radius          1.48182
	InertiaMoment   0.399812

	Oblateness      0.0213311

	RotationPeriod  37.0633
	Obliquity       76.4396
	EqAscendNode    211.279

	AbsMagn         1.95826
	SlopeParam      3.05134
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.488 0.484 0.478)

	Surface
	{
		SurfStyle       0.939284
		OceanStyle      0.204602
		Randomize      (-0.229, -0.298, 0.579)
		colorDistMagn   0.81822
		colorDistFreq   0.000305743
		detailScale     40.4635
		colorConversion true
		snowLevel       2
		tropicLatitude  0.241863
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464602
		terraceProb     0.284448
		erosion         0
		montesMagn      0.554617
		montesFreq      2.51934
		montesSpiky     0.978806
		montesFraction  0.266469
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00605275
		hillsFraction   0.596823
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223349
		craterFreq      0.15986
		craterDensity   0.645459
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   225.665
		volcanoTemp     1745.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.169, 0.191, 0.050)
		colorShelf     (0.195, 0.198, 0.220, 0.040)
		colorBeach     (0.224, 0.227, 0.249, 0.030)
		colorDesert    (0.254, 0.256, 0.282, 0.020)
		colorLowland   (0.283, 0.285, 0.311, 0.030)
		colorUpland    (0.312, 0.314, 0.340, 0.050)
		colorRock      (0.341, 0.343, 0.378, 0.020)
		colorSnow      (0.341, 0.343, 0.378, 1.000)
		BumpHeight      1.33363
		BumpOffset      0.266727
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
		MaxLength   0.384377
		GasToDust   0.25
		Particles   1756
		GasBright   0.247059
		DustBright  0.642202
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.80193
		Period          15.8609
		Eccentricity    0.946774
		Inclination     -64.933
		AscendingNode   -8.4642
		ArgOfPericenter 168.49
		MeanAnomaly     -130.409
	}
}

Comet	"C34"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            8.19768e-009
	Radius          26.7707
	InertiaMoment   0.398678

	Oblateness      0.0180018

	RotationPeriod  35.1525
	Obliquity       29.6453
	EqAscendNode    195.856

	AbsMagn         4.60012
	SlopeParam      7.50321
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.538 0.534 0.528)

	Surface
	{
		SurfStyle       0.528096
		OceanStyle      0.667684
		Randomize      (-0.927, 0.330, -0.480)
		colorDistMagn   0.954563
		colorDistFreq   0.132077
		detailScale     731.018
		colorConversion true
		snowLevel       2
		tropicLatitude  0.316736
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562677
		terraceProb     0.100208
		erosion         0
		montesMagn      0.308449
		montesFreq      3.77111
		montesSpiky     0.979958
		montesFraction  0.689959
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.71919
		hillsFraction   0.742908
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224546
		craterFreq      0.235256
		craterDensity   0.927118
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.3575
		volcanoTemp     1416.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.181, 0.148, 0.000)
		colorShelf     (0.215, 0.187, 0.169, 0.000)
		colorBeach     (0.253, 0.219, 0.201, 0.000)
		colorDesert    (0.274, 0.235, 0.195, 0.000)
		colorLowland   (0.301, 0.251, 0.222, 0.000)
		colorUpland    (0.333, 0.304, 0.269, 0.000)
		colorRock      (0.360, 0.331, 0.290, 0.000)
		colorSnow      (0.392, 0.352, 0.306, 1.000)
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
		MaxLength   0.865569
		GasToDust   0.25
		Particles   2728
		GasBright   0.193279
		DustBright  0.380469
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.73551
		Period          7.73187
		Eccentricity    0.933874
		Inclination     159.7
		AscendingNode   -38.9849
		ArgOfPericenter -102.341
		MeanAnomaly     -165.773
	}
}

Comet	"C35"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.52413e-016
	Radius          0.0917776
	InertiaMoment   0.39663

	Oblateness      0.0262003

	RotationPeriod  33.2048
	Obliquity       342.851
	EqAscendNode    180.434

	AbsMagn         6.23897
	SlopeParam      5.42021
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.565 0.453 0.358)

	Surface
	{
		SurfStyle       0.212559
		OceanStyle      0.868555
		Randomize      (-0.360, 0.092, -0.370)
		colorDistMagn   0.49496
		colorDistFreq   6.05168e-006
		detailScale     2.50614
		colorConversion true
		snowLevel       2
		tropicLatitude  0.743441
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.749052
		terraceProb     0.565849
		erosion         0
		montesMagn      0.404282
		montesFreq      1.84189
		montesSpiky     0.849853
		montesFraction  0.784376
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.10271e-005
		hillsFraction   0.550031
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217185
		craterFreq      0.23959
		craterDensity   1.0286
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   905.706
		volcanoTemp     1768.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.181, 0.143, 0.000)
		colorShelf     (0.240, 0.192, 0.152, 0.000)
		colorBeach     (0.254, 0.204, 0.161, 0.000)
		colorDesert    (0.269, 0.215, 0.170, 0.000)
		colorLowland   (0.283, 0.226, 0.179, 0.000)
		colorUpland    (0.297, 0.238, 0.188, 0.000)
		colorRock      (0.311, 0.249, 0.197, 0.000)
		colorSnow      (0.325, 0.260, 0.206, 1.000)
		BumpHeight      0.0825999
		BumpOffset      0.01652
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
		GasBright   0.102239
		DustBright  0.155995
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.82885
		Period          8.36393
		Eccentricity    0.967889
		Inclination     -127.047
		AscendingNode   66.6923
		ArgOfPericenter 20.0189
		MeanAnomaly     140.174
	}
}

Comet	"C36"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.95223e-012
	Radius          1.65766
	InertiaMoment   0.399163

	Oblateness      0.0228045

	RotationPeriod  31.2127
	Obliquity       296.057
	EqAscendNode    165.011

	AbsMagn         7.61921
	SlopeParam      4.31351
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.746 0.741 0.739)

	Surface
	{
		SurfStyle       0.631303
		OceanStyle      0.612611
		Randomize      (-0.460, 0.910, -0.614)
		colorDistMagn   0.629582
		colorDistFreq   0.000712742
		detailScale     45.265
		colorConversion true
		snowLevel       2
		tropicLatitude  0.663917
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406276
		terraceProb     0.234053
		erosion         0
		montesMagn      0.361625
		montesFreq      2.74653
		montesSpiky     0.902209
		montesFraction  0.618542
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00527279
		hillsFraction   0.552239
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228724
		craterFreq      0.278557
		craterDensity   0.908326
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   186.009
		volcanoTemp     1276.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.252, 0.207, 0.000)
		colorShelf     (0.298, 0.260, 0.237, 0.000)
		colorBeach     (0.351, 0.304, 0.281, 0.000)
		colorDesert    (0.381, 0.326, 0.274, 0.000)
		colorLowland   (0.418, 0.348, 0.311, 0.000)
		colorUpland    (0.463, 0.423, 0.377, 0.000)
		colorRock      (0.500, 0.460, 0.407, 0.000)
		colorSnow      (0.545, 0.489, 0.429, 1.000)
		BumpHeight      1.49189
		BumpOffset      0.298378
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
		MaxLength   0.417203
		GasToDust   0.25
		Particles   1822
		GasBright   0.337909
		DustBright  0.404812
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.06131
		Period          3.69749
		Eccentricity    0.806939
		Inclination     96.2256
		AscendingNode   -141.629
		ArgOfPericenter 16.5237
		MeanAnomaly     127.979
	}
}

Comet	"C37"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.50991e-008
	Radius          35.8659
	InertiaMoment   0.397742

	Oblateness      0.0340176

	RotationPeriod  29.1679
	Obliquity       249.262
	EqAscendNode    149.589

	AbsMagn         8.95431
	SlopeParam      3.30114
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.452 0.448 0.446)

	Surface
	{
		SurfStyle       0.456933
		OceanStyle      0.662129
		Randomize      (-0.112, 0.075, -0.835)
		colorDistMagn   0.634485
		colorDistFreq   0.586685
		detailScale     979.378
		colorConversion true
		snowLevel       2
		tropicLatitude  0.696793
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.712669
		terraceProb     0.429022
		erosion         0
		montesMagn      0.532962
		montesFreq      2.90244
		montesSpiky     0.863262
		montesFraction  0.718951
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.02298
		hillsFraction   0.579701
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258225
		craterFreq      0.202353
		craterDensity   1.05209
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   45.7627
		volcanoTemp     1449.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.179, 0.178, 0.000)
		colorShelf     (0.192, 0.190, 0.189, 0.000)
		colorBeach     (0.203, 0.202, 0.201, 0.000)
		colorDesert    (0.215, 0.213, 0.212, 0.000)
		colorLowland   (0.226, 0.224, 0.223, 0.000)
		colorUpland    (0.237, 0.235, 0.234, 0.000)
		colorRock      (0.249, 0.246, 0.245, 0.000)
		colorSnow      (0.260, 0.258, 0.256, 1.000)
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
		MaxLength   0.898395
		GasToDust   0.25
		Particles   2794
		GasBright   0.00598351
		DustBright  0.421224
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.97756
		Period          9.40454
		Eccentricity    0.939915
		Inclination     144.95
		AscendingNode   37.2714
		ArgOfPericenter 93.3588
		MeanAnomaly     164.551
	}
}

Comet	"C38"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            4.64913e-016
	Radius          0.102641
	InertiaMoment   0.399603

	Oblateness      0.0302953

	RotationPeriod  27.0603
	Obliquity       202.468
	EqAscendNode    134.166

	AbsMagn         10.4089
	SlopeParam      2.04762
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.429 0.427 0.424)

	Surface
	{
		SurfStyle       0.502524
		OceanStyle      0.891577
		Randomize      (-0.002, -0.557, -0.407)
		colorDistMagn   0.00382906
		colorDistFreq   3.59499e-006
		detailScale     2.80279
		colorConversion true
		snowLevel       2
		tropicLatitude  0.901061
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.726022
		terraceProb     0.116316
		erosion         0
		montesMagn      0.610689
		montesFreq      4.15878
		montesSpiky     0.934768
		montesFraction  0.899697
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.90337e-005
		hillsFraction   0.566071
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246373
		craterFreq      0.208084
		craterDensity   0.961958
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   746.348
		volcanoTemp     1640.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.145, 0.119, 0.000)
		colorShelf     (0.172, 0.150, 0.136, 0.000)
		colorBeach     (0.202, 0.175, 0.161, 0.000)
		colorDesert    (0.219, 0.188, 0.157, 0.000)
		colorLowland   (0.240, 0.201, 0.178, 0.000)
		colorUpland    (0.266, 0.244, 0.216, 0.000)
		colorRock      (0.288, 0.265, 0.233, 0.000)
		colorSnow      (0.313, 0.282, 0.246, 1.000)
		BumpHeight      0.092377
		BumpOffset      0.0184754
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
		GasBright   0.0666005
		DustBright  0.845093
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.32889
		Period          5.18056
		Eccentricity    0.918695
		Inclination     -64.0812
		AscendingNode   85.0307
		ArgOfPericenter -42.3539
		MeanAnomaly     71.0802
	}
}

Comet	"C39"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.59576e-012
	Radius          2.22141
	InertiaMoment   0.398408

	Oblateness      0.0467683

	RotationPeriod  24.8784
	Obliquity       155.674
	EqAscendNode    118.744

	AbsMagn         12.2979
	SlopeParam      5.73329
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.788 0.748 0.735)

	Surface
	{
		SurfStyle       0.514908
		OceanStyle      0.677786
		Randomize      (-0.688, -0.486, -0.240)
		colorDistMagn   0.80616
		colorDistFreq   0.0022714
		detailScale     60.6592
		colorConversion true
		snowLevel       2
		tropicLatitude  0.970381
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.273448
		terraceProb     0.12689
		erosion         0
		montesMagn      0.426885
		montesFreq      3.1816
		montesSpiky     0.98662
		montesFraction  0.554451
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0147341
		hillsFraction   0.628575
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224926
		craterFreq      0.261728
		craterDensity   0.965129
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   183.67
		volcanoTemp     1573.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.254, 0.206, 0.000)
		colorShelf     (0.315, 0.262, 0.235, 0.000)
		colorBeach     (0.370, 0.307, 0.279, 0.000)
		colorDesert    (0.402, 0.329, 0.272, 0.000)
		colorLowland   (0.441, 0.352, 0.309, 0.000)
		colorUpland    (0.488, 0.426, 0.375, 0.000)
		colorRock      (0.528, 0.464, 0.404, 0.000)
		colorSnow      (0.575, 0.494, 0.426, 1.000)
		BumpHeight      1.99926
		BumpOffset      0.399853
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
		MaxLength   0.450029
		GasToDust   0.25
		Particles   1888
		GasBright   0.0787534
		DustBright  0.517427
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.00421
		Period          9.59523
		Eccentricity    0.936482
		Inclination     59.0249
		AscendingNode   130.078
		ArgOfPericenter -60.8742
		MeanAnomaly     148.658
	}
}

Comet	"C40"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.78107e-008
	Radius          40.0996
	InertiaMoment   0.394814

	Oblateness      0.0424947

	RotationPeriod  22.608
	Obliquity       108.88
	EqAscendNode    103.321

	AbsMagn         17.4456
	SlopeParam      4.54839
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.692 0.690 0.688)

	Surface
	{
		SurfStyle       0.608957
		OceanStyle      0.932022
		Randomize      (-0.829, -0.766, -0.343)
		colorDistMagn   0.111619
		colorDistFreq   0.668992
		detailScale     1094.99
		colorConversion true
		snowLevel       2
		tropicLatitude  0.922056
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.352836
		terraceProb     0.174803
		erosion         0
		montesMagn      0.521468
		montesFreq      2.87718
		montesSpiky     0.960467
		montesFraction  0.505974
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.75946
		hillsFraction   0.841761
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229586
		craterFreq      0.268122
		craterDensity   0.755948
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.6999
		volcanoTemp     1480.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.234, 0.193, 0.000)
		colorShelf     (0.277, 0.241, 0.220, 0.000)
		colorBeach     (0.325, 0.283, 0.261, 0.000)
		colorDesert    (0.353, 0.303, 0.254, 0.000)
		colorLowland   (0.388, 0.324, 0.289, 0.000)
		colorUpland    (0.429, 0.393, 0.351, 0.000)
		colorRock      (0.464, 0.428, 0.378, 0.000)
		colorSnow      (0.505, 0.455, 0.399, 1.000)
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
		MaxLength   0.931221
		GasToDust   0.25
		Particles   2861
		GasBright   0.0536472
		DustBright  0.22702
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.26517
		Period          11.5291
		Eccentricity    0.967377
		Inclination     159.042
		AscendingNode   104.525
		ArgOfPericenter -171.559
		MeanAnomaly     59.7164
	}
}

Comet	"C41"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            8.5631e-016
	Radius          0.137587
	InertiaMoment   0.398931

	Oblateness      0.0706945

	RotationPeriod  20.2318
	Obliquity       62.0852
	EqAscendNode    87.8984

	AbsMagn         3.5069
	SlopeParam      3.54045
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.601 0.522 0.418)

	Surface
	{
		SurfStyle       0.962641
		OceanStyle      0.628414
		Randomize      (0.925, -0.551, -0.291)
		colorDistMagn   0.819185
		colorDistFreq   1.08261e-005
		detailScale     3.75703
		colorConversion true
		snowLevel       2
		tropicLatitude  0.642449
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.555994
		terraceProb     0.37559
		erosion         0
		montesMagn      0.611201
		montesFreq      3.87004
		montesSpiky     0.987888
		montesFraction  0.797665
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.87713e-005
		hillsFraction   0.726067
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.193034
		craterFreq      0.227879
		craterDensity   0.796174
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   737.168
		volcanoTemp     1396.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.183, 0.167, 0.050)
		colorShelf     (0.240, 0.214, 0.192, 0.040)
		colorBeach     (0.276, 0.245, 0.217, 0.030)
		colorDesert    (0.312, 0.276, 0.247, 0.020)
		colorLowland   (0.348, 0.308, 0.272, 0.030)
		colorUpland    (0.384, 0.339, 0.297, 0.050)
		colorRock      (0.421, 0.370, 0.330, 0.020)
		colorSnow      (0.421, 0.370, 0.330, 1.000)
		BumpHeight      0.123828
		BumpOffset      0.0247656
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
		GasBright   0.191432
		DustBright  0.573722
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.25767
		Period          4.76973
		Eccentricity    0.891806
		Inclination     -136.932
		AscendingNode   134.684
		ArgOfPericenter -107.355
		MeanAnomaly     -86.5938
	}
}

Comet	"C42"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            6.62294e-012
	Radius          2.48284
	InertiaMoment   0.397297

	Oblateness      0.0695307

	RotationPeriod  17.7279
	Obliquity       15.2909
	EqAscendNode    72.4758

	AbsMagn         5.46185
	SlopeParam      2.38879
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.807 0.711 0.677)

	Surface
	{
		SurfStyle       0.407559
		OceanStyle      0.898741
		Randomize      (-0.496, 0.005, 0.670)
		colorDistMagn   0.298273
		colorDistFreq   0.000884053
		detailScale     67.7981
		colorConversion true
		snowLevel       2
		tropicLatitude  0.978178
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406835
		terraceProb     0.464596
		erosion         0
		montesMagn      0.538153
		montesFreq      2.74644
		montesSpiky     0.998634
		montesFraction  0.66281
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0137974
		hillsFraction   0.695731
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208652
		craterFreq      0.231018
		craterDensity   1.05938
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   151.262
		volcanoTemp     1501.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.323, 0.284, 0.271, 0.000)
		colorShelf     (0.343, 0.302, 0.288, 0.000)
		colorBeach     (0.363, 0.320, 0.305, 0.000)
		colorDesert    (0.383, 0.338, 0.321, 0.000)
		colorLowland   (0.404, 0.356, 0.338, 0.000)
		colorUpland    (0.424, 0.373, 0.355, 0.000)
		colorRock      (0.444, 0.391, 0.372, 0.000)
		colorSnow      (0.464, 0.409, 0.389, 1.000)
		BumpHeight      2.23456
		BumpOffset      0.446911
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
		MaxLength   0.482855
		GasToDust   0.25
		Particles   1955
		GasBright   0.139043
		DustBright  0.310597
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.79053
		Period          8.10239
		Eccentricity    0.950029
		Inclination     99.2584
		AscendingNode   78.3464
		ArgOfPericenter -21.4303
		MeanAnomaly     73.056
	}
}

Comet	"C43"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            5.12237e-008
	Radius          53.7683
	InertiaMoment   0.399389

	Oblateness      0.127376

	RotationPeriod  15.0682
	Obliquity       328.497
	EqAscendNode    57.0532

	AbsMagn         6.93548
	SlopeParam      6.09601
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.691 0.688 0.683)

	Surface
	{
		SurfStyle       0.912274
		OceanStyle      0.694537
		Randomize      (0.224, -0.865, 0.657)
		colorDistMagn   0.533675
		colorDistFreq   2.00861
		detailScale     1468.23
		colorConversion true
		snowLevel       2
		tropicLatitude  0.960139
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.667283
		terraceProb     0.332964
		erosion         0
		montesMagn      0.594268
		montesFreq      2.94047
		montesSpiky     0.93651
		montesFraction  0.675594
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.37715
		hillsFraction   0.795455
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25109
		craterFreq      0.209783
		craterDensity   0.82828
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.2475
		volcanoTemp     1295.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.241, 0.273, 0.050)
		colorShelf     (0.277, 0.282, 0.314, 0.040)
		colorBeach     (0.318, 0.323, 0.355, 0.030)
		colorDesert    (0.359, 0.365, 0.403, 0.020)
		colorLowland   (0.401, 0.406, 0.444, 0.030)
		colorUpland    (0.442, 0.447, 0.485, 0.050)
		colorRock      (0.484, 0.489, 0.539, 0.020)
		colorSnow      (0.484, 0.489, 0.539, 1.000)
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
		MaxLength   0.964047
		GasToDust   0.25
		Particles   2927
		GasBright   0.344018
		DustBright  0.590109
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.20706
		Period          4.4847
		Eccentricity    0.906206
		Inclination     -137.527
		AscendingNode   171.943
		ArgOfPericenter -95.3445
		MeanAnomaly     -106.182
	}
}

Comet	"C44"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.57722e-015
	Radius          0.153726
	InertiaMoment   0.398106

	Oblateness      0.146405

	RotationPeriod  12.2153
	Obliquity       281.702
	EqAscendNode    41.6306

	AbsMagn         8.27367
	SlopeParam      4.79111
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.632 0.585 0.523)

	Surface
	{
		SurfStyle       0.927912
		OceanStyle      0.660783
		Randomize      (-0.215, -0.764, 0.506)
		colorDistMagn   0.900898
		colorDistFreq   9.21171e-006
		detailScale     4.19775
		colorConversion true
		snowLevel       2
		tropicLatitude  0.574101
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615025
		terraceProb     0.63438
		erosion         0
		montesMagn      0.565943
		montesFreq      3.01854
		montesSpiky     0.800181
		montesFraction  0.759115
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.06795e-005
		hillsFraction   0.539921
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2318
		craterFreq      0.255122
		craterDensity   0.961485
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   606.888
		volcanoTemp     1502.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.205, 0.209, 0.050)
		colorShelf     (0.253, 0.240, 0.241, 0.040)
		colorBeach     (0.291, 0.275, 0.272, 0.030)
		colorDesert    (0.328, 0.310, 0.309, 0.020)
		colorLowland   (0.366, 0.345, 0.340, 0.030)
		colorUpland    (0.404, 0.380, 0.372, 0.050)
		colorRock      (0.442, 0.415, 0.414, 0.020)
		colorSnow      (0.442, 0.415, 0.414, 1.000)
		BumpHeight      0.138354
		BumpOffset      0.0276707
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
		MaxLength   0.034489
		GasToDust   0.25
		Particles   1049
		GasBright   0.264348
		DustBright  0.354266
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.93355
		Period          9.0923
		Eccentricity    0.965349
		Inclination     132.461
		AscendingNode   160.712
		ArgOfPericenter 111.898
		MeanAnomaly     8.63837
	}
}

Comet	"C45"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.21986e-011
	Radius          3.33026
	InertiaMoment   0.399817

	Oblateness      0.249

	RotationPeriod  9.11793
	Obliquity       234.908
	EqAscendNode    26.208

	AbsMagn         9.64416
	SlopeParam      3.77334
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.748 0.745 0.741)

	Surface
	{
		SurfStyle       0.0443096
		OceanStyle      0.60445
		Randomize      (0.785, 0.010, -0.673)
		colorDistMagn   0.788077
		colorDistFreq   0.00600802
		detailScale     90.9384
		colorConversion true
		snowLevel       2
		tropicLatitude  0.883984
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439226
		terraceProb     0.500314
		erosion         0
		montesMagn      0.65031
		montesFreq      2.9861
		montesSpiky     0.825344
		montesFraction  0.664982
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0282383
		hillsFraction   0.501366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242977
		craterFreq      0.27768
		craterDensity   0.883168
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   149.496
		volcanoTemp     1364.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.298, 0.297, 0.000)
		colorShelf     (0.318, 0.317, 0.315, 0.000)
		colorBeach     (0.336, 0.335, 0.334, 0.000)
		colorDesert    (0.355, 0.354, 0.352, 0.000)
		colorLowland   (0.374, 0.373, 0.371, 0.000)
		colorUpland    (0.392, 0.391, 0.389, 0.000)
		colorRock      (0.411, 0.410, 0.408, 0.000)
		colorSnow      (0.430, 0.428, 0.426, 1.000)
		BumpHeight      2.99724
		BumpOffset      0.599448
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
		MaxLength   0.515681
		GasToDust   0.25
		Particles   2021
		GasBright   0.147418
		DustBright  0.155682
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.51454
		Period          6.30325
		Eccentricity    0.908537
		Inclination     100.212
		AscendingNode   135.003
		ArgOfPericenter -165.49
		MeanAnomaly     -89.3284
	}
}

Comet	"C46"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            9.43478e-008
	Radius          60.0534
	InertiaMoment   0.398684

	Oblateness      0.249

	RotationPeriod  5.70222
	Obliquity       188.114
	EqAscendNode    10.7854

	AbsMagn         11.2491
	SlopeParam      2.68846
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.466 0.460 0.458)

	Surface
	{
		SurfStyle       0.0416259
		OceanStyle      0.581775
		Randomize      (0.145, 0.145, 0.207)
		colorDistMagn   0.813396
		colorDistFreq   1.89292
		detailScale     1639.86
		colorConversion true
		snowLevel       2
		tropicLatitude  0.954633
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629384
		terraceProb     0.216893
		erosion         0
		montesMagn      0.610384
		montesFreq      3.05492
		montesSpiky     0.954159
		montesFraction  0.646472
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.4041
		hillsFraction   0.823895
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225282
		craterFreq      0.242104
		craterDensity   0.843262
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   30.6533
		volcanoTemp     1445.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.184, 0.183, 0.000)
		colorShelf     (0.198, 0.196, 0.195, 0.000)
		colorBeach     (0.210, 0.207, 0.206, 0.000)
		colorDesert    (0.221, 0.219, 0.218, 0.000)
		colorLowland   (0.233, 0.230, 0.229, 0.000)
		colorUpland    (0.245, 0.242, 0.241, 0.000)
		colorRock      (0.256, 0.253, 0.252, 0.000)
		colorSnow      (0.268, 0.265, 0.264, 1.000)
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
		MaxLength   0.996873
		GasToDust   0.25
		Particles   2993
		GasBright   0.035767
		DustBright  0.751819
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.63528
		Period          14.4671
		Eccentricity    0.949573
		Inclination     108.098
		AscendingNode   -94.1665
		ArgOfPericenter -139.057
		MeanAnomaly     -49.7347
	}
}

Comet	"C47"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.90504e-015
	Radius          0.206268
	InertiaMoment   0.396651

	Oblateness      0.00129639

	RotationPeriod  148.261
	Obliquity       141.319
	EqAscendNode    355.363

	AbsMagn         13.7268
	SlopeParam      6.54534
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.645 0.640 0.636)

	Surface
	{
		SurfStyle       0.813531
		OceanStyle      0.400036
		Randomize      (0.841, 0.717, 0.546)
		colorDistMagn   0.794656
		colorDistFreq   1.95909e-005
		detailScale     5.6325
		colorConversion true
		snowLevel       2
		tropicLatitude  0.563825
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.32168
		terraceProb     0.598917
		erosion         0
		montesMagn      0.622078
		montesFreq      3.17424
		montesSpiky     0.954295
		montesFraction  0.533841
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.05714e-005
		hillsFraction   0.651185
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240922
		craterFreq      0.157782
		craterDensity   0.959313
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   600.016
		volcanoTemp     1916.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.218, 0.178, 0.000)
		colorShelf     (0.258, 0.224, 0.203, 0.000)
		colorBeach     (0.303, 0.262, 0.242, 0.000)
		colorDesert    (0.329, 0.282, 0.235, 0.000)
		colorLowland   (0.361, 0.301, 0.267, 0.000)
		colorUpland    (0.400, 0.365, 0.324, 0.000)
		colorRock      (0.432, 0.397, 0.350, 0.000)
		colorSnow      (0.471, 0.423, 0.369, 1.000)
		BumpHeight      0.185642
		BumpOffset      0.0371283
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
		MaxLength   0.067315
		GasToDust   0.25
		Particles   1115
		GasBright   0.0493121
		DustBright  0.422761
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.60234
		Period          6.8592
		Eccentricity    0.949904
		Inclination     -120.58
		AscendingNode   -37.1699
		ArgOfPericenter 125.881
		MeanAnomaly     34.6402
	}
}

Comet	"C48"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.24684e-011
	Radius          3.71805
	InertiaMoment   0.399168

	Oblateness      0.00151228

	RotationPeriod  120.017
	Obliquity       94.5251
	EqAscendNode    339.94

	AbsMagn         1.90068
	SlopeParam      5.04612
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.624 0.620 0.616)

	Surface
	{
		SurfStyle       0.359321
		OceanStyle      0.804717
		Randomize      (0.173, 0.950, -0.175)
		colorDistMagn   0.40385
		colorDistFreq   0.00655818
		detailScale     101.528
		colorConversion true
		snowLevel       2
		tropicLatitude  0.952782
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.739812
		terraceProb     0.202127
		erosion         0
		montesMagn      0.457172
		montesFreq      3.81892
		montesSpiky     0.958418
		montesFraction  0.423615
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0330215
		hillsFraction   0.563944
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239957
		craterFreq      0.186592
		craterDensity   0.947271
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   122.98
		volcanoTemp     1484.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.248, 0.246, 0.000)
		colorShelf     (0.265, 0.263, 0.262, 0.000)
		colorBeach     (0.281, 0.279, 0.277, 0.000)
		colorDesert    (0.297, 0.294, 0.293, 0.000)
		colorLowland   (0.312, 0.310, 0.308, 0.000)
		colorUpland    (0.328, 0.325, 0.323, 0.000)
		colorRock      (0.343, 0.341, 0.339, 0.000)
		colorSnow      (0.359, 0.356, 0.354, 1.000)
		BumpHeight      3.34625
		BumpOffset      0.669249
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
		MaxLength   0.548507
		GasToDust   0.25
		Particles   2087
		GasBright   0.156401
		DustBright  0.800158
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.33899
		Period          12.0972
		Eccentricity    0.931499
		Inclination     143.005
		AscendingNode   -52.3196
		ArgOfPericenter 103.834
		MeanAnomaly     8.3911
	}
}

Comet	"C49"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.73777e-007
	Radius          80.6098
	InertiaMoment   0.397752

	Oblateness      0.00236393

	RotationPeriod  109.897
	Obliquity       47.7309
	EqAscendNode    324.518

	AbsMagn         4.57392
	SlopeParam      4.00319
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.753 0.663 0.632)

	Surface
	{
		SurfStyle       0.97214
		OceanStyle      0.443562
		Randomize      (0.127, 0.096, -0.302)
		colorDistMagn   0.742729
		colorDistFreq   2.84476
		detailScale     2201.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.823323
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571359
		terraceProb     0.306661
		erosion         0
		montesMagn      0.66175
		montesFreq      3.58639
		montesSpiky     0.976983
		montesFraction  0.786902
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.3891
		hillsFraction   0.715793
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23488
		craterFreq      0.259791
		craterDensity   0.81903
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   30.3178
		volcanoTemp     1860.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.232, 0.253, 0.050)
		colorShelf     (0.301, 0.272, 0.291, 0.040)
		colorBeach     (0.346, 0.312, 0.329, 0.030)
		colorDesert    (0.392, 0.352, 0.373, 0.020)
		colorLowland   (0.437, 0.391, 0.411, 0.030)
		colorUpland    (0.482, 0.431, 0.449, 0.050)
		colorRock      (0.527, 0.471, 0.499, 0.020)
		colorSnow      (0.527, 0.471, 0.499, 1.000)
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
		GasBright   0.142664
		DustBright  0.498382
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.19862
		Period          11.0247
		Eccentricity    0.910417
		Inclination     8.464
		AscendingNode   26.2148
		ArgOfPericenter -15.0364
		MeanAnomaly     -57.0677
	}
}

Comet	"C50"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            5.35071e-015
	Radius          0.230187
	InertiaMoment   0.399608

	Oblateness      0.00204402

	RotationPeriod  103.134
	Obliquity       0.936554
	EqAscendNode    309.095

	AbsMagn         6.21889
	SlopeParam      2.96118
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.458 0.455 0.451)

	Surface
	{
		SurfStyle       0.0800168
		OceanStyle      0.191511
		Randomize      (-0.102, 0.994, -0.805)
		colorDistMagn   0.399587
		colorDistFreq   4.00588e-005
		detailScale     6.28565
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0556509
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.516946
		terraceProb     0.45462
		erosion         0
		montesMagn      0.572765
		montesFreq      2.85901
		montesSpiky     0.810365
		montesFraction  0.821418
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000161206
		hillsFraction   0.775313
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225503
		craterFreq      0.164864
		craterDensity   0.879008
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   493.38
		volcanoTemp     1423.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.182, 0.180, 0.000)
		colorShelf     (0.195, 0.193, 0.192, 0.000)
		colorBeach     (0.206, 0.205, 0.203, 0.000)
		colorDesert    (0.218, 0.216, 0.214, 0.000)
		colorLowland   (0.229, 0.228, 0.225, 0.000)
		colorUpland    (0.240, 0.239, 0.237, 0.000)
		colorRock      (0.252, 0.250, 0.248, 0.000)
		colorSnow      (0.263, 0.262, 0.259, 1.000)
		BumpHeight      0.207169
		BumpOffset      0.0414337
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
		MaxLength   0.100141
		GasToDust   0.25
		Particles   1182
		GasBright   0.0916682
		DustBright  0.233864
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.60161
		Period          6.85452
		Eccentricity    0.936635
		Inclination     177.731
		AscendingNode   -167.754
		ArgOfPericenter -16.2429
		MeanAnomaly     93.0139
	}
}

Comet	"C51"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            4.13839e-011
	Radius          4.99281
	InertiaMoment   0.398415

	Oblateness      0.00297977

	RotationPeriod  97.8967
	Obliquity       314.142
	EqAscendNode    293.672

	AbsMagn         7.60092
	SlopeParam      7.18178
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.560 0.497 0.449)

	Surface
	{
		SurfStyle       0.699286
		OceanStyle      0.612366
		Randomize      (-0.662, -0.928, 0.030)
		colorDistMagn   0.495768
		colorDistFreq   0.0174703
		detailScale     136.337
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962522
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.669698
		terraceProb     0.174211
		erosion         0
		montesMagn      0.584878
		montesFreq      2.70505
		montesSpiky     0.876229
		montesFraction  0.764086
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0592173
		hillsFraction   0.665889
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215593
		craterFreq      0.210127
		craterDensity   0.931918
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   121.685
		volcanoTemp     1903.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.169, 0.126, 0.000)
		colorShelf     (0.224, 0.174, 0.144, 0.000)
		colorBeach     (0.263, 0.204, 0.171, 0.000)
		colorDesert    (0.286, 0.219, 0.166, 0.000)
		colorLowland   (0.314, 0.234, 0.189, 0.000)
		colorUpland    (0.347, 0.283, 0.229, 0.000)
		colorRock      (0.375, 0.308, 0.247, 0.000)
		colorSnow      (0.409, 0.328, 0.260, 1.000)
		BumpHeight      4.49353
		BumpOffset      0.898706
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
		MaxLength   0.581333
		GasToDust   0.25
		Particles   2154
		GasBright   0.275925
		DustBright  0.534095
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.07261
		Period          10.0906
		Eccentricity    0.955564
		Inclination     -151.471
		AscendingNode   -173.706
		ArgOfPericenter -98.8228
		MeanAnomaly     8.4329
	}
}

Comet	"C52"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.20075e-007
	Radius          89.9155
	InertiaMoment   0.394952

	Oblateness      0.00243278

	RotationPeriod  93.5433
	Obliquity       267.348
	EqAscendNode    278.25

	AbsMagn         8.93559
	SlopeParam      5.31945
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.555 0.550 0.547)

	Surface
	{
		SurfStyle       0.0406124
		OceanStyle      0.574586
		Randomize      (0.296, -0.779, 0.739)
		colorDistMagn   0.946197
		colorDistFreq   3.30837
		detailScale     2455.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0.976299
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.488472
		terraceProb     0.322552
		erosion         0
		montesMagn      0.518052
		montesFreq      3.20895
		montesSpiky     0.938453
		montesFraction  0.676618
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.3869
		hillsFraction   0.666803
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252704
		craterFreq      0.253205
		craterDensity   0.745665
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.9181
		volcanoTemp     1460.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.220, 0.219, 0.000)
		colorShelf     (0.236, 0.234, 0.233, 0.000)
		colorBeach     (0.250, 0.248, 0.246, 0.000)
		colorDesert    (0.264, 0.261, 0.260, 0.000)
		colorLowland   (0.278, 0.275, 0.274, 0.000)
		colorUpland    (0.291, 0.289, 0.287, 0.000)
		colorRock      (0.305, 0.303, 0.301, 0.000)
		colorSnow      (0.319, 0.316, 0.315, 1.000)
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
		GasBright   0.197647
		DustBright  0.296859
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.64626
		Period          14.5576
		Eccentricity    0.96313
		Inclination     95.3648
		AscendingNode   -77.6864
		ArgOfPericenter 70.9151
		MeanAnomaly     -20.9345
	}
}

Comet	"C53"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            9.85534e-015
	Radius          0.309246
	InertiaMoment   0.398937

	Oblateness      0.00354277

	RotationPeriod  89.77
	Obliquity       220.554
	EqAscendNode    262.827

	AbsMagn         10.3871
	SlopeParam      4.23307
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.475 0.467 0.464)

	Surface
	{
		SurfStyle       0.0295064
		OceanStyle      0.371481
		Randomize      (0.931, -0.720, -0.828)
		colorDistMagn   0.181425
		colorDistFreq   7.49575e-005
		detailScale     8.44447
		colorConversion true
		snowLevel       2
		tropicLatitude  0.471601
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58486
		terraceProb     0.370132
		erosion         0
		montesMagn      0.506798
		montesFreq      2.9415
		montesSpiky     0.974044
		montesFraction  0.365422
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000240979
		hillsFraction   0.614357
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234206
		craterFreq      0.263254
		craterDensity   0.948779
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   488.398
		volcanoTemp     1150.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.187, 0.186, 0.000)
		colorShelf     (0.202, 0.199, 0.197, 0.000)
		colorBeach     (0.214, 0.210, 0.209, 0.000)
		colorDesert    (0.226, 0.222, 0.220, 0.000)
		colorLowland   (0.238, 0.234, 0.232, 0.000)
		colorUpland    (0.250, 0.245, 0.244, 0.000)
		colorRock      (0.261, 0.257, 0.255, 0.000)
		colorSnow      (0.273, 0.269, 0.267, 1.000)
		BumpHeight      0.278321
		BumpOffset      0.0556643
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
		MaxLength   0.132967
		GasToDust   0.25
		Particles   1248
		GasBright   0.449093
		DustBright  0.529899
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.10764
		Period          3.94223
		Eccentricity    0.888236
		Inclination     -36.3075
		AscendingNode   45.5629
		ArgOfPericenter -129.63
		MeanAnomaly     161.344
	}
}

Comet	"C54"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            7.6224e-011
	Radius          5.5664
	InertiaMoment   0.39731

	Oblateness      0.00286581

	RotationPeriod  86.4072
	Obliquity       173.759
	EqAscendNode    247.405

	AbsMagn         12.2656
	SlopeParam      3.21577
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.433 0.429 0.426)

	Surface
	{
		SurfStyle       0.737547
		OceanStyle      0.29533
		Randomize      (0.148, 0.435, -0.009)
		colorDistMagn   0.976328
		colorDistFreq   0.00696356
		detailScale     152
		colorConversion true
		snowLevel       2
		tropicLatitude  0.755654
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.455547
		terraceProb     0.258076
		erosion         0
		montesMagn      0.382504
		montesFreq      2.65786
		montesSpiky     0.932826
		montesFraction  0.697872
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0616056
		hillsFraction   0.662322
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248021
		craterFreq      0.223553
		craterDensity   0.926652
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   99.9618
		volcanoTemp     1481.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.146, 0.119, 0.000)
		colorShelf     (0.173, 0.150, 0.136, 0.000)
		colorBeach     (0.203, 0.176, 0.162, 0.000)
		colorDesert    (0.221, 0.189, 0.158, 0.000)
		colorLowland   (0.242, 0.202, 0.179, 0.000)
		colorUpland    (0.268, 0.245, 0.217, 0.000)
		colorRock      (0.290, 0.266, 0.234, 0.000)
		colorSnow      (0.316, 0.283, 0.247, 1.000)
		BumpHeight      5.00976
		BumpOffset      1.00195
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
		MaxLength   0.614159
		GasToDust   0.25
		Particles   2220
		GasBright   0.0117936
		DustBright  0.651685
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.25938
		Period          4.77942
		Eccentricity    0.905537
		Inclination     42.8657
		AscendingNode   174.721
		ArgOfPericenter 146.977
		MeanAnomaly     24.3028
	}
}

Comet	"C55"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            5.89538e-007
	Radius          120.855
	InertiaMoment   0.399395

	Oblateness      0.00410755

	RotationPeriod  83.3498
	Obliquity       126.965
	EqAscendNode    231.982

	AbsMagn         17.1727
	SlopeParam      8.64774
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.477 0.473 0.471)

	Surface
	{
		SurfStyle       0.746209
		OceanStyle      0.0714932
		Randomize      (-0.902, 0.701, -0.185)
		colorDistMagn   0.0254871
		colorDistFreq   8.4625
		detailScale     3300.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.922645
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633392
		terraceProb     0.159859
		erosion         0
		montesMagn      0.598653
		montesFreq      3.07307
		montesSpiky     0.866325
		montesFraction  0.311231
		dunesFraction   0
		hillsMagn       0
		hillsFreq       30.3252
		hillsFraction   0.683047
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24245
		craterFreq      0.530813
		craterDensity   0.784345
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.6782
		volcanoTemp     1460.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.161, 0.132, 0.000)
		colorShelf     (0.191, 0.165, 0.151, 0.000)
		colorBeach     (0.224, 0.194, 0.179, 0.000)
		colorDesert    (0.243, 0.208, 0.174, 0.000)
		colorLowland   (0.267, 0.222, 0.198, 0.000)
		colorUpland    (0.296, 0.270, 0.240, 0.000)
		colorRock      (0.319, 0.293, 0.259, 0.000)
		colorSnow      (0.348, 0.312, 0.273, 1.000)
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
		GasBright   0.026731
		DustBright  0.321235
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.39189
		Period          12.5099
		Eccentricity    0.951294
		Inclination     -66.4975
		AscendingNode   31.3941
		ArgOfPericenter 160.52
		MeanAnomaly     123.324
	}
}

Comet	"C56"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.81523e-014
	Radius          0.344586
	InertiaMoment   0.398114

	Oblateness      0.00329679

	RotationPeriod  80.5283
	Obliquity       80.1708
	EqAscendNode    216.56

	AbsMagn         3.47253
	SlopeParam      5.62004
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.755 0.751 0.748)

	Surface
	{
		SurfStyle       0.781216
		OceanStyle      0.454278
		Randomize      (0.353, 0.982, 0.816)
		colorDistMagn   0.925383
		colorDistFreq   6.65165e-005
		detailScale     9.40951
		colorConversion true
		snowLevel       2
		tropicLatitude  0.926802
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448857
		terraceProb     0.189592
		erosion         0
		montesMagn      0.588327
		montesFreq      2.36464
		montesSpiky     0.860064
		montesFraction  0.479904
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000262172
		hillsFraction   0.845975
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241763
		craterFreq      0.255565
		craterDensity   0.744041
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   400.995
		volcanoTemp     1370.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.255, 0.209, 0.000)
		colorShelf     (0.302, 0.263, 0.239, 0.000)
		colorBeach     (0.355, 0.308, 0.284, 0.000)
		colorDesert    (0.385, 0.330, 0.277, 0.000)
		colorLowland   (0.423, 0.353, 0.314, 0.000)
		colorUpland    (0.468, 0.428, 0.382, 0.000)
		colorRock      (0.506, 0.466, 0.411, 0.000)
		colorSnow      (0.551, 0.496, 0.434, 1.000)
		BumpHeight      0.310128
		BumpOffset      0.0620256
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
		MaxLength   0.165793
		GasToDust   0.25
		Particles   1314
		GasBright   0.113102
		DustBright  0.71935
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.63859
		Period          14.4944
		Eccentricity    0.951302
		Inclination     -125.109
		AscendingNode   110.127
		ArgOfPericenter -107.967
		MeanAnomaly     19.6979
	}
}

Comet	"C57"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.40395e-010
	Radius          7.48558
	InertiaMoment   0.399822

	Oblateness      0.00470033

	RotationPeriod  77.8937
	Obliquity       33.3765
	EqAscendNode    201.137

	AbsMagn         5.43955
	SlopeParam      4.46609
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.651 0.645 0.641)

	Surface
	{
		SurfStyle       0.762772
		OceanStyle      0.452721
		Randomize      (0.431, 0.165, 0.953)
		colorDistMagn   0.360817
		colorDistFreq   0.0230018
		detailScale     204.406
		colorConversion true
		snowLevel       2
		tropicLatitude  0.602227
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.376987
		terraceProb     0.147642
		erosion         0
		montesMagn      0.412915
		montesFreq      3.12546
		montesSpiky     0.943415
		montesFraction  0.493261
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.157279
		hillsFraction   0.789947
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220342
		craterFreq      0.213819
		craterDensity   0.964392
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   99.0504
		volcanoTemp     1923.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.219, 0.180, 0.000)
		colorShelf     (0.261, 0.226, 0.205, 0.000)
		colorBeach     (0.306, 0.265, 0.244, 0.000)
		colorDesert    (0.332, 0.284, 0.237, 0.000)
		colorLowland   (0.365, 0.303, 0.269, 0.000)
		colorUpland    (0.404, 0.368, 0.327, 0.000)
		colorRock      (0.436, 0.400, 0.353, 0.000)
		colorSnow      (0.476, 0.426, 0.372, 1.000)
		BumpHeight      6.73702
		BumpOffset      1.3474
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
		MaxLength   0.646985
		GasToDust   0.25
		Particles   2286
		GasBright   0.100757
		DustBright  0.416182
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.4383
		Period          12.8758
		Eccentricity    0.949527
		Inclination     -31.9432
		AscendingNode   72.0499
		ArgOfPericenter -60.0579
		MeanAnomaly     -65.8684
	}
}

Comet	"C58"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            4.32286e-018
	Radius          0.0213308
	InertiaMoment   0.398691

	Oblateness      0.00375277

	RotationPeriod  75.4102
	Obliquity       346.582
	EqAscendNode    185.714

	AbsMagn         6.9166
	SlopeParam      3.45822
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.757 0.679 0.641)

	Surface
	{
		SurfStyle       0.158753
		OceanStyle      0.693479
		Randomize      (0.684, 0.968, 0.813)
		colorDistMagn   0.985652
		colorDistFreq   2.71279e-007
		detailScale     0.582472
		colorConversion true
		snowLevel       2
		tropicLatitude  0.744781
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615321
		terraceProb     0.557712
		erosion         0
		montesMagn      0.354003
		montesFreq      3.32728
		montesSpiky     0.974008
		montesFraction  0.524677
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.97899e-007
		hillsFraction   0.73205
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227376
		craterFreq      0.216848
		craterDensity   0.889352
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1608.52
		volcanoTemp     1592.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.272, 0.256, 0.000)
		colorShelf     (0.322, 0.289, 0.272, 0.000)
		colorBeach     (0.341, 0.306, 0.288, 0.000)
		colorDesert    (0.360, 0.323, 0.304, 0.000)
		colorLowland   (0.379, 0.340, 0.320, 0.000)
		colorUpland    (0.398, 0.357, 0.336, 0.000)
		colorRock      (0.417, 0.374, 0.352, 0.000)
		colorSnow      (0.435, 0.391, 0.368, 1.000)
		BumpHeight      0.0191977
		BumpOffset      0.00383954
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
		GasBright   0.0511532
		DustBright  0.150272
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.00281
		Period          9.58519
		Eccentricity    0.904635
		Inclination     -119.877
		AscendingNode   -24.7222
		ArgOfPericenter -45.9532
		MeanAnomaly     132.329
	}
}

Comet	"C59"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.34342e-014
	Radius          0.463649
	InertiaMoment   0.396673

	Oblateness      0.0052699

	RotationPeriod  73.0508
	Obliquity       299.788
	EqAscendNode    170.292

	AbsMagn         8.25543
	SlopeParam      2.27597
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.782 0.780 0.777)

	Surface
	{
		SurfStyle       0.0656219
		OceanStyle      0.509632
		Randomize      (0.392, -0.105, 0.474)
		colorDistMagn   0.307432
		colorDistFreq   6.96245e-005
		detailScale     12.6607
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997191
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.349105
		terraceProb     0.115194
		erosion         0
		montesMagn      0.3939
		montesFreq      2.69835
		montesSpiky     0.995167
		montesFraction  0.219267
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000503459
		hillsFraction   0.557886
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24654
		craterFreq      0.202473
		craterDensity   0.875399
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   397.557
		volcanoTemp     1217.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.312, 0.311, 0.000)
		colorShelf     (0.332, 0.331, 0.330, 0.000)
		colorBeach     (0.352, 0.351, 0.350, 0.000)
		colorDesert    (0.372, 0.370, 0.369, 0.000)
		colorLowland   (0.391, 0.390, 0.388, 0.000)
		colorUpland    (0.411, 0.409, 0.408, 0.000)
		colorRock      (0.430, 0.429, 0.427, 0.000)
		colorSnow      (0.450, 0.448, 0.447, 1.000)
		BumpHeight      0.417284
		BumpOffset      0.0834568
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
		MaxLength   0.198619
		GasToDust   0.25
		Particles   1381
		GasBright   0.214692
		DustBright  0.47122
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.25878
		Period          11.4803
		Eccentricity    0.912823
		Inclination     -154.419
		AscendingNode   -174.8
		ArgOfPericenter -112.013
		MeanAnomaly     50.7623
	}
}

Comet	"C60"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.5859e-010
	Radius          8.331
	InertiaMoment   0.399174

	Oblateness      0.00424847

	RotationPeriod  70.7945
	Obliquity       252.994
	EqAscendNode    154.869

	AbsMagn         9.62437
	SlopeParam      5.96267
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.509 0.508 0.504)

	Surface
	{
		SurfStyle       0.384888
		OceanStyle      0.984796
		Randomize      (0.112, -0.904, -0.191)
		colorDistMagn   0.731173
		colorDistFreq   0.0229079
		detailScale     227.492
		colorConversion true
		snowLevel       2
		tropicLatitude  0.655264
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.342477
		terraceProb     0.274479
		erosion         0
		montesMagn      0.403842
		montesFreq      3.5624
		montesSpiky     0.987682
		montesFraction  0.588125
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.189686
		hillsFraction   0.631355
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214545
		craterFreq      0.228296
		craterDensity   0.674752
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   81.2264
		volcanoTemp     1514.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.203, 0.202, 0.000)
		colorShelf     (0.216, 0.216, 0.214, 0.000)
		colorBeach     (0.229, 0.228, 0.227, 0.000)
		colorDesert    (0.242, 0.241, 0.240, 0.000)
		colorLowland   (0.255, 0.254, 0.252, 0.000)
		colorUpland    (0.267, 0.266, 0.265, 0.000)
		colorRock      (0.280, 0.279, 0.277, 0.000)
		colorSnow      (0.293, 0.292, 0.290, 1.000)
		BumpHeight      7.4979
		BumpOffset      1.49958
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
		MaxLength   0.679811
		GasToDust   0.25
		Particles   2353
		GasBright   0.137806
		DustBright  0.232593
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.98325
		Period          9.44513
		Eccentricity    0.950345
		Inclination     -89.9004
		AscendingNode   -142.23
		ArgOfPericenter 160.808
		MeanAnomaly     -19.2303
	}
}

Comet	"C61"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            7.96218e-018
	Radius          0.028718
	InertiaMoment   0.397762

	Oblateness      0.00598308

	RotationPeriod  68.6244
	Obliquity       206.199
	EqAscendNode    139.447

	AbsMagn         11.2238
	SlopeParam      4.70563
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.590 0.585 0.579)

	Surface
	{
		SurfStyle       0.853176
		OceanStyle      0.643857
		Randomize      (0.189, 0.022, 0.371)
		colorDistMagn   0.245028
		colorDistFreq   4.59497e-007
		detailScale     0.784192
		colorConversion true
		snowLevel       2
		tropicLatitude  0.608499
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.485915
		terraceProb     0.191428
		erosion         0
		montesMagn      0.468684
		montesFreq      3.25519
		montesSpiky     0.963094
		montesFraction  0.534473
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.53551e-006
		hillsFraction   0.383994
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210595
		craterFreq      0.180154
		craterDensity   0.702859
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1595.67
		volcanoTemp     1813.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.205, 0.232, 0.050)
		colorShelf     (0.236, 0.240, 0.267, 0.040)
		colorBeach     (0.271, 0.275, 0.301, 0.030)
		colorDesert    (0.307, 0.310, 0.342, 0.020)
		colorLowland   (0.342, 0.345, 0.377, 0.030)
		colorUpland    (0.378, 0.380, 0.411, 0.050)
		colorRock      (0.413, 0.416, 0.458, 0.020)
		colorSnow      (0.413, 0.416, 0.458, 1.000)
		BumpHeight      0.0258462
		BumpOffset      0.00516923
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
		GasBright   0.368534
		DustBright  0.486351
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.79651
		Period          15.8149
		Eccentricity    0.961582
		Inclination     -147.495
		AscendingNode   98.9355
		ArgOfPericenter 148.247
		MeanAnomaly     -60.9081
	}
}

Comet	"C62"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            6.15817e-014
	Radius          0.515666
	InertiaMoment   0.399613

	Oblateness      0.00479874

	RotationPeriod  66.5267
	Obliquity       159.405
	EqAscendNode    124.024

	AbsMagn         13.6766
	SlopeParam      3.69293
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.777 0.711 0.653)

	Surface
	{
		SurfStyle       0.176257
		OceanStyle      0.62153
		Randomize      (-0.138, -0.263, -0.722)
		colorDistMagn   0.542611
		colorDistFreq   0.000203057
		detailScale     14.0811
		colorConversion true
		snowLevel       2
		tropicLatitude  0.765683
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.396706
		terraceProb     0.360279
		erosion         0
		montesMagn      0.404642
		montesFreq      2.12936
		montesSpiky     0.921885
		montesFraction  0.261535
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00062082
		hillsFraction   0.767362
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226307
		craterFreq      0.246367
		craterDensity   0.937878
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   325.798
		volcanoTemp     1733.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.284, 0.261, 0.000)
		colorShelf     (0.330, 0.302, 0.277, 0.000)
		colorBeach     (0.350, 0.320, 0.294, 0.000)
		colorDesert    (0.369, 0.337, 0.310, 0.000)
		colorLowland   (0.389, 0.355, 0.326, 0.000)
		colorUpland    (0.408, 0.373, 0.343, 0.000)
		colorRock      (0.427, 0.391, 0.359, 0.000)
		colorSnow      (0.447, 0.409, 0.375, 1.000)
		BumpHeight      0.464099
		BumpOffset      0.0928198
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
		MaxLength   0.231445
		GasToDust   0.25
		Particles   1447
		GasBright   0.264366
		DustBright  0.275005
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.27334
		Period          11.5915
		Eccentricity    0.956294
		Inclination     150.539
		AscendingNode   -6.68093
		ArgOfPericenter -85.6146
		MeanAnomaly     162.983
	}
}

Comet	"C63"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            4.7629e-010
	Radius          11.2233
	InertiaMoment   0.398422

	Oblateness      0.00677683

	RotationPeriod  64.4903
	Obliquity       112.611
	EqAscendNode    108.601

	AbsMagn         1.8418
	SlopeParam      2.58798
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.734 0.639 0.598)

	Surface
	{
		SurfStyle       0.384467
		OceanStyle      0.972602
		Randomize      (-0.708, -0.293, 0.491)
		colorDistMagn   0.894051
		colorDistFreq   0.0784108
		detailScale     306.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996309
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.573136
		terraceProb     0.504626
		erosion         0
		montesMagn      0.409971
		montesFreq      3.20951
		montesSpiky     0.964551
		montesFraction  0.166126
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.286886
		hillsFraction   0.766989
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211407
		craterFreq      0.273888
		craterDensity   0.871149
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   80.6288
		volcanoTemp     1582.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.256, 0.239, 0.000)
		colorShelf     (0.312, 0.272, 0.254, 0.000)
		colorBeach     (0.330, 0.288, 0.269, 0.000)
		colorDesert    (0.349, 0.304, 0.284, 0.000)
		colorLowland   (0.367, 0.320, 0.299, 0.000)
		colorUpland    (0.385, 0.336, 0.314, 0.000)
		colorRock      (0.404, 0.352, 0.329, 0.000)
		colorSnow      (0.422, 0.368, 0.344, 1.000)
		BumpHeight      10.1009
		BumpOffset      2.02019
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
		MaxLength   0.712637
		GasToDust   0.25
		Particles   2419
		GasBright   0.01101
		DustBright  0.212848
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.37278
		Period          12.3603
		Eccentricity    0.970864
		Inclination     126.044
		AscendingNode   65.287
		ArgOfPericenter 104.258
		MeanAnomaly     -161.984
	}
}

Comet	"C64"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.46654e-017
	Radius          0.0319167
	InertiaMoment   0.39507

	Oblateness      0.00532106

	RotationPeriod  62.5052
	Obliquity       65.8164
	EqAscendNode    93.1788

	AbsMagn         4.54757
	SlopeParam      6.37552
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.626 0.621 0.619)

	Surface
	{
		SurfStyle       0.254267
		OceanStyle      0.717203
		Randomize      (0.943, 0.074, 0.603)
		colorDistMagn   0.768577
		colorDistFreq   5.97347e-007
		detailScale     0.87154
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998908
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.434027
		terraceProb     0.152672
		erosion         0
		montesMagn      0.408161
		montesFreq      2.55802
		montesSpiky     0.929694
		montesFraction  0.518622
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.15925e-006
		hillsFraction   0.567866
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219361
		craterFreq      0.214044
		craterDensity   0.845674
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1306.71
		volcanoTemp     1658.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.248, 0.248, 0.000)
		colorShelf     (0.266, 0.264, 0.263, 0.000)
		colorBeach     (0.282, 0.279, 0.278, 0.000)
		colorDesert    (0.297, 0.295, 0.294, 0.000)
		colorLowland   (0.313, 0.310, 0.309, 0.000)
		colorUpland    (0.329, 0.326, 0.325, 0.000)
		colorRock      (0.344, 0.341, 0.340, 0.000)
		colorSnow      (0.360, 0.357, 0.356, 1.000)
		BumpHeight      0.0287251
		BumpOffset      0.00574501
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
		GasBright   0.0766627
		DustBright  0.631682
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.76834
		Period          7.95226
		Eccentricity    0.944943
		Inclination     -64.8284
		AscendingNode   105.523
		ArgOfPericenter 48.0829
		MeanAnomaly     116.708
	}
}

Comet	"C65"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.13426e-013
	Radius          0.695164
	InertiaMoment   0.398943

	Oblateness      0.00768253

	RotationPeriod  60.5634
	Obliquity       19.0221
	EqAscendNode    77.7562

	AbsMagn         6.19876
	SlopeParam      4.95579
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.706 0.665 0.590)

	Surface
	{
		SurfStyle       0.563917
		OceanStyle      0.82435
		Randomize      (0.590, -0.058, 0.780)
		colorDistMagn   0.737192
		colorDistFreq   0.000150902
		detailScale     18.9826
		colorConversion true
		snowLevel       2
		tropicLatitude  0.615783
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.594907
		terraceProb     0.44341
		erosion         0
		montesMagn      0.306785
		montesFreq      2.80274
		montesSpiky     0.965196
		montesFraction  0.552293
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000780283
		hillsFraction   0.7106
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217461
		craterFreq      0.264852
		craterDensity   0.918379
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   323.621
		volcanoTemp     1573.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.226, 0.165, 0.000)
		colorShelf     (0.282, 0.233, 0.189, 0.000)
		colorBeach     (0.332, 0.272, 0.224, 0.000)
		colorDesert    (0.360, 0.292, 0.218, 0.000)
		colorLowland   (0.395, 0.312, 0.248, 0.000)
		colorUpland    (0.438, 0.379, 0.301, 0.000)
		colorRock      (0.473, 0.412, 0.325, 0.000)
		colorSnow      (0.515, 0.439, 0.342, 1.000)
		BumpHeight      0.625647
		BumpOffset      0.125129
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
		MaxLength   0.264271
		GasToDust   0.25
		Particles   1513
		GasBright   0.0657102
		DustBright  0.327121
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.82966
		Period          8.36949
		Eccentricity    0.911988
		Inclination     -160.727
		AscendingNode   -13.7625
		ArgOfPericenter -22.297
		MeanAnomaly     -63.9091
	}
}

Comet	"C66"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            8.77265e-010
	Radius          12.4636
	InertiaMoment   0.397323

	Oblateness      0.00606586

	RotationPeriod  58.6575
	Obliquity       332.228
	EqAscendNode    62.3336

	AbsMagn         7.58262
	SlopeParam      3.92348
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.472 0.467 0.464)

	Surface
	{
		SurfStyle       0.327913
		OceanStyle      0.817085
		Randomize      (0.580, -0.750, -0.085)
		colorDistMagn   0.429289
		colorDistFreq   0.0532175
		detailScale     340.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.451748
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.675357
		terraceProb     0.245799
		erosion         0
		montesMagn      0.454028
		montesFreq      3.88968
		montesSpiky     0.80725
		montesFraction  0.463134
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.423287
		hillsFraction   0.742505
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200558
		craterFreq      0.215237
		craterDensity   0.93698
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   65.9759
		volcanoTemp     1426.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.187, 0.186, 0.000)
		colorShelf     (0.200, 0.199, 0.197, 0.000)
		colorBeach     (0.212, 0.210, 0.209, 0.000)
		colorDesert    (0.224, 0.222, 0.221, 0.000)
		colorLowland   (0.236, 0.234, 0.232, 0.000)
		colorUpland    (0.248, 0.245, 0.244, 0.000)
		colorRock      (0.259, 0.257, 0.255, 0.000)
		colorSnow      (0.271, 0.269, 0.267, 1.000)
		BumpHeight      11.2173
		BumpOffset      2.24345
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
		MaxLength   0.745462
		GasToDust   0.25
		Particles   2485
		GasBright   0.198553
		DustBright  0.678765
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.80584
		Period          15.8941
		Eccentricity    0.958701
		Inclination     2.06407
		AscendingNode   -61.87
		ArgOfPericenter 25.889
		MeanAnomaly     -127.647
	}
}

Comet	"C67"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.70117e-017
	Radius          0.0430582
	InertiaMoment   0.3994

	Oblateness      0.00873633

	RotationPeriod  56.781
	Obliquity       285.434
	EqAscendNode    46.911

	AbsMagn         8.91689
	SlopeParam      2.86885
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.684 0.681 0.678)

	Surface
	{
		SurfStyle       0.246782
		OceanStyle      0.407776
		Randomize      (-0.674, -0.305, -0.605)
		colorDistMagn   0.822762
		colorDistFreq   1.27361e-006
		detailScale     1.17577
		colorConversion true
		snowLevel       2
		tropicLatitude  0.966319
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.382905
		terraceProb     0.111965
		erosion         0
		montesMagn      0.639314
		montesFreq      3.06565
		montesSpiky     0.928982
		montesFraction  0.672467
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.22397e-006
		hillsFraction   0.737064
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257446
		craterFreq      0.213801
		craterDensity   0.965862
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1298.93
		volcanoTemp     1728.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.272, 0.271, 0.000)
		colorShelf     (0.291, 0.289, 0.288, 0.000)
		colorBeach     (0.308, 0.306, 0.305, 0.000)
		colorDesert    (0.325, 0.323, 0.322, 0.000)
		colorLowland   (0.342, 0.341, 0.339, 0.000)
		colorUpland    (0.359, 0.358, 0.356, 0.000)
		colorRock      (0.376, 0.375, 0.373, 0.000)
		colorSnow      (0.393, 0.392, 0.390, 1.000)
		BumpHeight      0.0387523
		BumpOffset      0.00775047
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
		GasBright   0.160319
		DustBright  0.401486
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.67358
		Period          14.7837
		Eccentricity    0.971268
		Inclination     -171.29
		AscendingNode   92.2398
		ArgOfPericenter -70.8859
		MeanAnomaly     -159.326
	}
}

Comet	"C68"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.08916e-013
	Radius          0.771339
	InertiaMoment   0.398122

	Oblateness      0.0069058

	RotationPeriod  54.928
	Obliquity       238.639
	EqAscendNode    31.4884

	AbsMagn         10.3654
	SlopeParam      6.9263
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.533 0.525 0.522)

	Surface
	{
		SurfStyle       0.793275
		OceanStyle      0.0376324
		Randomize      (-0.584, -0.572, 0.509)
		colorDistMagn   0.136982
		colorDistFreq   0.000136467
		detailScale     21.0627
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99167
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479845
		terraceProb     0.233659
		erosion         0
		montesMagn      0.551816
		montesFreq      2.55468
		montesSpiky     0.981744
		montesFraction  0.394024
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00138887
		hillsFraction   0.497433
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22609
		craterFreq      0.259629
		craterDensity   0.835519
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   264.585
		volcanoTemp     1598.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.179, 0.146, 0.000)
		colorShelf     (0.213, 0.184, 0.167, 0.000)
		colorBeach     (0.251, 0.215, 0.198, 0.000)
		colorDesert    (0.272, 0.231, 0.193, 0.000)
		colorLowland   (0.298, 0.247, 0.219, 0.000)
		colorUpland    (0.330, 0.299, 0.266, 0.000)
		colorRock      (0.357, 0.326, 0.287, 0.000)
		colorSnow      (0.389, 0.347, 0.303, 1.000)
		BumpHeight      0.694205
		BumpOffset      0.138841
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
		MaxLength   0.297096
		GasToDust   0.25
		Particles   1579
		GasBright   0.0848248
		DustBright  0.161466
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.66561
		Period          7.26944
		Eccentricity    0.935343
		Inclination     -87.549
		AscendingNode   -100.199
		ArgOfPericenter -155.569
		MeanAnomaly     -61.6152
	}
}

Comet	"C69"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.61581e-009
	Radius          16.8277
	InertiaMoment   0.399827

	Oblateness      0.00998667

	RotationPeriod  53.0933
	Obliquity       191.845
	EqAscendNode    16.0658

	AbsMagn         12.2336
	SlopeParam      5.22193
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.587 0.582 0.579)

	Surface
	{
		SurfStyle       0.965555
		OceanStyle      0.445535
		Randomize      (-0.455, -0.347, 0.122)
		colorDistMagn   0.306167
		colorDistFreq   0.237186
		detailScale     459.509
		colorConversion true
		snowLevel       2
		tropicLatitude  0.513745
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.378705
		terraceProb     0.248265
		erosion         0
		montesMagn      0.528771
		montesFreq      3.75197
		montesSpiky     0.978158
		montesFraction  0.772521
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.606426
		hillsFraction   0.834505
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211894
		craterFreq      0.203447
		craterDensity   0.699758
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   65.635
		volcanoTemp     1487.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.204, 0.232, 0.050)
		colorShelf     (0.235, 0.239, 0.266, 0.040)
		colorBeach     (0.270, 0.274, 0.301, 0.030)
		colorDesert    (0.305, 0.308, 0.341, 0.020)
		colorLowland   (0.340, 0.343, 0.376, 0.030)
		colorUpland    (0.376, 0.378, 0.411, 0.050)
		colorRock      (0.411, 0.413, 0.457, 0.020)
		colorSnow      (0.411, 0.413, 0.457, 1.000)
		BumpHeight      15.1449
		BumpOffset      3.02899
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
		MaxLength   0.778288
		GasToDust   0.25
		Particles   2552
		GasBright   0.294835
		DustBright  0.435942
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.5246
		Period          6.36614
		Eccentricity    0.965974
		Inclination     24.3883
		AscendingNode   -66.7686
		ArgOfPericenter -98.922
		MeanAnomaly     139.565
	}
}

Comet	"C70"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            4.97522e-017
	Radius          0.0477328
	InertiaMoment   0.398697

	Oblateness      0.00790421

	RotationPeriod  51.2717
	Obliquity       145.051
	EqAscendNode    0.643247

	AbsMagn         16.9369
	SlopeParam      4.153
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.618 0.536 0.442)

	Surface
	{
		SurfStyle       0.273376
		OceanStyle      0.278875
		Randomize      (-0.749, -0.185, -0.965)
		colorDistMagn   0.0031746
		colorDistFreq   1.17739e-006
		detailScale     1.30342
		colorConversion true
		snowLevel       2
		tropicLatitude  0.674661
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.388478
		terraceProb     0.258655
		erosion         0
		montesMagn      0.613305
		montesFreq      3.7546
		montesSpiky     0.868494
		montesFraction  0.676693
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.51413e-006
		hillsFraction   0.814113
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245746
		craterFreq      0.207727
		craterDensity   0.845046
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1061
		volcanoTemp     1515.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.214, 0.177, 0.000)
		colorShelf     (0.263, 0.228, 0.188, 0.000)
		colorBeach     (0.278, 0.241, 0.199, 0.000)
		colorDesert    (0.293, 0.255, 0.210, 0.000)
		colorLowland   (0.309, 0.268, 0.221, 0.000)
		colorUpland    (0.324, 0.281, 0.232, 0.000)
		colorRock      (0.340, 0.295, 0.243, 0.000)
		colorSnow      (0.355, 0.308, 0.254, 1.000)
		BumpHeight      0.0429595
		BumpOffset      0.00859191
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
		GasBright   0.192059
		DustBright  0.223205
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.08056
		Period          10.1488
		Eccentricity    0.934437
		Inclination     -7.93874
		AscendingNode   21.3787
		ArgOfPericenter 157.43
		MeanAnomaly     39.2206
	}
}

Comet	"C71"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.84797e-013
	Radius          1.04231
	InertiaMoment   0.396693

	Oblateness      0.0113498

	RotationPeriod  49.4584
	Obliquity       98.2563
	EqAscendNode    345.221

	AbsMagn         3.43782
	SlopeParam      3.12895
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.535 0.410 0.329)

	Surface
	{
		SurfStyle       0.0638107
		OceanStyle      0.784258
		Randomize      (-0.083, 0.849, -0.745)
		colorDistMagn   0.599606
		colorDistFreq   0.000838547
		detailScale     28.462
		colorConversion true
		snowLevel       2
		tropicLatitude  0.872262
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505616
		terraceProb     0.706572
		erosion         0
		montesMagn      0.491258
		montesFreq      3.44038
		montesSpiky     0.998784
		montesFraction  0.364033
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0027963
		hillsFraction   0.829811
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227052
		craterFreq      0.162553
		craterDensity   0.902707
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   263.443
		volcanoTemp     1848.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.164, 0.132, 0.000)
		colorShelf     (0.227, 0.174, 0.140, 0.000)
		colorBeach     (0.241, 0.185, 0.148, 0.000)
		colorDesert    (0.254, 0.195, 0.156, 0.000)
		colorLowland   (0.268, 0.205, 0.165, 0.000)
		colorUpland    (0.281, 0.215, 0.173, 0.000)
		colorRock      (0.294, 0.226, 0.181, 0.000)
		colorSnow      (0.308, 0.236, 0.189, 1.000)
		BumpHeight      0.938078
		BumpOffset      0.187616
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
		MaxLength   0.329922
		GasToDust   0.25
		Particles   1646
		GasBright   0.0193849
		DustBright  0.880366
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.34967
		Period          12.1802
		Eccentricity    0.930024
		Inclination     -37.5617
		AscendingNode   2.15031
		ArgOfPericenter -156.063
		MeanAnomaly     -64.8537
	}
}

Comet	"C72"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.97613e-009
	Radius          18.6361
	InertiaMoment   0.39918

	Oblateness      0.00912164

	RotationPeriod  47.6489
	Obliquity       51.462
	EqAscendNode    329.798

	AbsMagn         5.41716
	SlopeParam      7.88752
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.507 0.502 0.494)

	Surface
	{
		SurfStyle       0.373004
		OceanStyle      0.817499
		Randomize      (-0.089, 0.949, 0.577)
		colorDistMagn   0.644034
		colorDistFreq   0.289537
		detailScale     508.891
		colorConversion true
		snowLevel       2
		tropicLatitude  0.847639
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.684956
		terraceProb     0.443237
		erosion         0
		montesMagn      0.559972
		montesFreq      4.26068
		montesSpiky     0.911976
		montesFraction  0.630133
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.751572
		hillsFraction   0.717723
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249434
		craterFreq      0.237315
		craterDensity   0.725823
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   53.5595
		volcanoTemp     1560.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.201, 0.198, 0.000)
		colorShelf     (0.215, 0.213, 0.210, 0.000)
		colorBeach     (0.228, 0.226, 0.222, 0.000)
		colorDesert    (0.241, 0.238, 0.235, 0.000)
		colorLowland   (0.253, 0.251, 0.247, 0.000)
		colorUpland    (0.266, 0.263, 0.259, 0.000)
		colorRock      (0.279, 0.276, 0.272, 0.000)
		colorSnow      (0.291, 0.288, 0.284, 1.000)
		BumpHeight      16.7725
		BumpOffset      3.35451
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
		MaxLength   0.811114
		GasToDust   0.25
		Particles   2618
		GasBright   0.0470837
		DustBright  0.537154
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.03724
		Period          9.83347
		Eccentricity    0.965152
		Inclination     -125.054
		AscendingNode   105.651
		ArgOfPericenter -97.3485
		MeanAnomaly     -54.3824
	}
}

Comet	"C73"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            9.1637e-017
	Radius          0.0645607
	InertiaMoment   0.397772

	Oblateness      0.0132386

	RotationPeriod  45.8384
	Obliquity       4.66772
	EqAscendNode    314.375

	AbsMagn         6.89771
	SlopeParam      5.51176
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.488 0.483 0.480)

	Surface
	{
		SurfStyle       0.392858
		OceanStyle      0.688395
		Randomize      (0.682, 0.657, 0.668)
		colorDistMagn   0.380397
		colorDistFreq   2.79378e-006
		detailScale     1.76294
		colorConversion true
		snowLevel       2
		tropicLatitude  0.606973
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489655
		terraceProb     0.307229
		erosion         0
		montesMagn      0.662104
		montesFreq      2.96644
		montesSpiky     0.929433
		montesFraction  0.53296
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.63691e-006
		hillsFraction   0.507057
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239121
		craterFreq      0.276894
		craterDensity   1.02983
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1057.4
		volcanoTemp     1649.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.193, 0.192, 0.000)
		colorShelf     (0.207, 0.205, 0.204, 0.000)
		colorBeach     (0.219, 0.218, 0.216, 0.000)
		colorDesert    (0.232, 0.230, 0.228, 0.000)
		colorLowland   (0.244, 0.242, 0.240, 0.000)
		colorUpland    (0.256, 0.254, 0.252, 0.000)
		colorRock      (0.268, 0.266, 0.264, 0.000)
		colorSnow      (0.280, 0.278, 0.276, 1.000)
		BumpHeight      0.0581046
		BumpOffset      0.0116209
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
		GasBright   0.0375233
		DustBright  0.2312
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.59073
		Period          14.1019
		Eccentricity    0.938907
		Inclination     -139.835
		AscendingNode   -129.049
		ArgOfPericenter -36.0068
		MeanAnomaly     71.0222
	}
}

Comet	"C74"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            7.08746e-013
	Radius          1.15308
	InertiaMoment   0.399619

	Oblateness      0.0106466

	RotationPeriod  44.0225
	Obliquity       317.873
	EqAscendNode    298.953

	AbsMagn         8.23719
	SlopeParam      4.38457
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.623 0.619 0.618)

	Surface
	{
		SurfStyle       0.000705042
		OceanStyle      0.796362
		Randomize      (-0.612, -0.773, 0.890)
		colorDistMagn   0.826582
		colorDistFreq   0.000418854
		detailScale     31.4867
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999488
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.586976
		terraceProb     0.221633
		erosion         0
		montesMagn      0.573515
		montesFreq      3.31614
		montesSpiky     0.908005
		montesFraction  0.491372
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00220707
		hillsFraction   0.602224
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243185
		craterFreq      0.210614
		craterDensity   0.860713
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   214.743
		volcanoTemp     1401.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.248, 0.247, 0.000)
		colorShelf     (0.265, 0.263, 0.263, 0.000)
		colorBeach     (0.280, 0.279, 0.278, 0.000)
		colorDesert    (0.296, 0.294, 0.294, 0.000)
		colorLowland   (0.311, 0.310, 0.309, 0.000)
		colorUpland    (0.327, 0.325, 0.325, 0.000)
		colorRock      (0.342, 0.341, 0.340, 0.000)
		colorSnow      (0.358, 0.356, 0.355, 1.000)
		BumpHeight      1.03777
		BumpOffset      0.207554
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
		MaxLength   0.362748
		GasToDust   0.25
		Particles   1712
		GasBright   0.149648
		DustBright  0.603562
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.32035
		Period          11.9529
		Eccentricity    0.944806
		Inclination     129.809
		AscendingNode   -10.3839
		ArgOfPericenter 71.3588
		MeanAnomaly     -122.436
	}
}

Comet	"C75"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            5.48165e-009
	Radius          25.2314
	InertiaMoment   0.398429

	Oblateness      0.015628

	RotationPeriod  42.1964
	Obliquity       271.079
	EqAscendNode    283.53

	AbsMagn         9.60462
	SlopeParam      3.37506
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.464 0.458 0.454)

	Surface
	{
		SurfStyle       0.590873
		OceanStyle      0.260915
		Randomize      (0.146, 0.611, 0.313)
		colorDistMagn   0.716157
		colorDistFreq   0.169355
		detailScale     688.986
		colorConversion true
		snowLevel       2
		tropicLatitude  0.634447
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.658695
		terraceProb     0.331875
		erosion         0
		montesMagn      0.411158
		montesFreq      2.40145
		montesSpiky     0.93255
		montesFraction  0.552313
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.56121
		hillsFraction   0.63038
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253664
		craterFreq      0.241485
		craterDensity   1.07879
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   53.4308
		volcanoTemp     1839.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.156, 0.127, 0.000)
		colorShelf     (0.185, 0.160, 0.145, 0.000)
		colorBeach     (0.218, 0.188, 0.173, 0.000)
		colorDesert    (0.236, 0.201, 0.168, 0.000)
		colorLowland   (0.260, 0.215, 0.191, 0.000)
		colorUpland    (0.287, 0.261, 0.232, 0.000)
		colorRock      (0.311, 0.284, 0.250, 0.000)
		colorSnow      (0.338, 0.302, 0.263, 1.000)
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
		MaxLength   0.84394
		GasToDust   0.25
		Particles   2684
		GasBright   0.112806
		DustBright  0.324891
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.84347
		Period          8.4644
		Eccentricity    0.900767
		Inclination     93.6254
		AscendingNode   39.1181
		ArgOfPericenter -85.789
		MeanAnomaly     171.162
	}
}

Comet	"C76"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.68784e-016
	Radius          0.0713378
	InertiaMoment   0.395173

	Oblateness      0.0123898

	RotationPeriod  40.3552
	Obliquity       224.285
	EqAscendNode    268.108

	AbsMagn         11.1987
	SlopeParam      2.15737
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.597 0.537 0.494)

	Surface
	{
		SurfStyle       0.876693
		OceanStyle      0.0920223
		Randomize      (0.119, 0.689, -0.936)
		colorDistMagn   0.156437
		colorDistFreq   1.30298e-006
		detailScale     1.948
		colorConversion true
		snowLevel       2
		tropicLatitude  0.844021
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.335861
		terraceProb     0.151683
		erosion         0
		montesMagn      0.442525
		montesFreq      3.19346
		montesSpiky     0.896488
		montesFraction  0.743108
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3238e-005
		hillsFraction   0.915859
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.279675
		craterFreq      0.258798
		craterDensity   0.852883
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   860.914
		volcanoTemp     1466.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.188, 0.198, 0.050)
		colorShelf     (0.239, 0.220, 0.227, 0.040)
		colorBeach     (0.275, 0.253, 0.257, 0.030)
		colorDesert    (0.311, 0.285, 0.292, 0.020)
		colorLowland   (0.346, 0.317, 0.321, 0.030)
		colorUpland    (0.382, 0.349, 0.351, 0.050)
		colorRock      (0.418, 0.382, 0.390, 0.020)
		colorSnow      (0.418, 0.382, 0.390, 1.000)
		BumpHeight      0.064204
		BumpOffset      0.0128408
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
		GasBright   0.292121
		DustBright  0.630062
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.89343
		Period          8.81084
		Eccentricity    0.924971
		Inclination     128.83
		AscendingNode   -80.7485
		ArgOfPericenter -59.7318
		MeanAnomaly     119.669
	}
}

Comet	"C77"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.30542e-012
	Radius          1.56285
	InertiaMoment   0.398949

	Oblateness      0.0187759

	RotationPeriod  38.4938
	Obliquity       177.491
	EqAscendNode    252.685

	AbsMagn         13.6272
	SlopeParam      5.83752
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.565 0.450 0.328)

	Surface
	{
		SurfStyle       0.836225
		OceanStyle      0.270751
		Randomize      (0.799, 0.852, 0.995)
		colorDistMagn   0.902667
		colorDistFreq   0.000995447
		detailScale     42.6761
		colorConversion true
		snowLevel       2
		tropicLatitude  0.397887
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.559237
		terraceProb     0.122259
		erosion         0
		montesMagn      0.459979
		montesFreq      3.40719
		montesSpiky     0.974293
		montesFraction  0.78988
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00630716
		hillsFraction   0.83258
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264429
		craterFreq      0.239784
		craterDensity   0.987189
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   214.46
		volcanoTemp     1679.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.153, 0.092, 0.000)
		colorShelf     (0.226, 0.157, 0.105, 0.000)
		colorBeach     (0.266, 0.184, 0.125, 0.000)
		colorDesert    (0.288, 0.198, 0.121, 0.000)
		colorLowland   (0.317, 0.211, 0.138, 0.000)
		colorUpland    (0.351, 0.256, 0.167, 0.000)
		colorRock      (0.379, 0.279, 0.180, 0.000)
		colorSnow      (0.413, 0.297, 0.190, 1.000)
		BumpHeight      1.40656
		BumpOffset      0.281312
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
		MaxLength   0.395574
		GasToDust   0.25
		Particles   1778
		GasBright   0.227997
		DustBright  0.378674
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.2038
		Period          11.0637
		Eccentricity    0.937508
		Inclination     157.707
		AscendingNode   -65.3139
		ArgOfPericenter 167.421
		MeanAnomaly     -68.4613
	}
}

Comet	"C78"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.00965e-008
	Radius          27.844
	InertiaMoment   0.397336

	Oblateness      0.0150891

	RotationPeriod  36.6066
	Obliquity       130.696
	EqAscendNode    237.263

	AbsMagn         1.78156
	SlopeParam      4.62143
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.746 0.650 0.607)

	Surface
	{
		SurfStyle       0.46363
		OceanStyle      0.577969
		Randomize      (0.000, -0.252, -0.498)
		colorDistMagn   0.393763
		colorDistFreq   0.162832
		detailScale     760.328
		colorConversion true
		snowLevel       2
		tropicLatitude  0.745286
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589277
		terraceProb     0.351032
		erosion         0
		montesMagn      0.5526
		montesFreq      2.24873
		montesSpiky     0.925489
		montesFraction  0.397394
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.70276
		hillsFraction   0.652773
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237329
		craterFreq      0.250539
		craterDensity   0.715277
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   43.4462
		volcanoTemp     1725.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.260, 0.243, 0.000)
		colorShelf     (0.317, 0.276, 0.258, 0.000)
		colorBeach     (0.336, 0.293, 0.273, 0.000)
		colorDesert    (0.354, 0.309, 0.288, 0.000)
		colorLowland   (0.373, 0.325, 0.304, 0.000)
		colorUpland    (0.392, 0.341, 0.319, 0.000)
		colorRock      (0.410, 0.358, 0.334, 0.000)
		colorSnow      (0.429, 0.374, 0.349, 1.000)
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
		MaxLength   0.876766
		GasToDust   0.25
		Particles   2751
		GasBright   0.126613
		DustBright  0.164544
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.84231
		Period          8.45645
		Eccentricity    0.913555
		Inclination     78.9989
		AscendingNode   -43.2242
		ArgOfPericenter 166
		MeanAnomaly     -150.944
	}
}

Comet	"C79"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.1088e-016
	Radius          0.0968036
	InertiaMoment   0.399406

	Oblateness      0.0231135

	RotationPeriod  34.6875
	Obliquity       83.9019
	EqAscendNode    221.84

	AbsMagn         4.52108
	SlopeParam      3.61202
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.595 0.592 0.588)

	Surface
	{
		SurfStyle       0.659112
		OceanStyle      0.167884
		Randomize      (0.846, -0.621, -0.952)
		colorDistMagn   0.513963
		colorDistFreq   4.71376e-006
		detailScale     2.64338
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955666
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404749
		terraceProb     0.418079
		erosion         0
		montesMagn      0.517089
		montesFreq      2.08603
		montesSpiky     0.885624
		montesFraction  0.410316
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.46762e-005
		hillsFraction   0.822594
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276654
		craterFreq      0.233051
		craterDensity   0.803253
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   860.798
		volcanoTemp     1660.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.201, 0.165, 0.000)
		colorShelf     (0.238, 0.207, 0.188, 0.000)
		colorBeach     (0.280, 0.243, 0.224, 0.000)
		colorDesert    (0.304, 0.261, 0.218, 0.000)
		colorLowland   (0.333, 0.278, 0.247, 0.000)
		colorUpland    (0.369, 0.338, 0.300, 0.000)
		colorRock      (0.399, 0.367, 0.324, 0.000)
		colorSnow      (0.434, 0.391, 0.341, 1.000)
		BumpHeight      0.0871232
		BumpOffset      0.0174246
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
		GasBright   0.383095
		DustBright  0.392548
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.71317
		Period          15.1133
		Eccentricity    0.937515
		Inclination     -11.2926
		AscendingNode   -12.2493
		ArgOfPericenter 172.022
		MeanAnomaly     -15.7291
	}
}

Comet	"C80"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.40443e-012
	Radius          1.72222
	InertiaMoment   0.39813

	Oblateness      0.0188112

	RotationPeriod  32.7298
	Obliquity       37.1076
	EqAscendNode    206.417

	AbsMagn         6.17859
	SlopeParam      2.48379
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.807 0.761 0.703)

	Surface
	{
		SurfStyle       0.0894405
		OceanStyle      0.220203
		Randomize      (-0.148, 0.935, -0.268)
		colorDistMagn   0.45464
		colorDistFreq   0.00135242
		detailScale     47.028
		colorConversion true
		snowLevel       2
		tropicLatitude  0.450092
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.480501
		terraceProb     0.316501
		erosion         0
		montesMagn      0.471153
		montesFreq      3.46806
		montesSpiky     0.941404
		montesFraction  0.536331
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00718383
		hillsFraction   0.885768
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262663
		craterFreq      0.17625
		craterDensity   0.764213
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   174.136
		volcanoTemp     1834.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.323, 0.304, 0.281, 0.000)
		colorShelf     (0.343, 0.323, 0.299, 0.000)
		colorBeach     (0.363, 0.342, 0.316, 0.000)
		colorDesert    (0.383, 0.361, 0.334, 0.000)
		colorLowland   (0.404, 0.380, 0.351, 0.000)
		colorUpland    (0.424, 0.399, 0.369, 0.000)
		colorRock      (0.444, 0.418, 0.386, 0.000)
		colorSnow      (0.464, 0.437, 0.404, 1.000)
		BumpHeight      1.55
		BumpOffset      0.309999
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
		MaxLength   0.4284
		GasToDust   0.25
		Particles   1845
		GasBright   0.0243648
		DustBright  0.435765
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.17411
		Period          4.30232
		Eccentricity    0.873329
		Inclination     15.9389
		AscendingNode   -139.584
		ArgOfPericenter 142.033
		MeanAnomaly     -144.252
	}
}

Comet	"C81"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.85965e-008
	Radius          37.8327
	InertiaMoment   0.399833

	Oblateness      0.0294433

	RotationPeriod  30.7259
	Obliquity       350.313
	EqAscendNode    190.995

	AbsMagn         7.56432
	SlopeParam      6.2213
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.752 0.725 0.681)

	Surface
	{
		SurfStyle       0.220796
		OceanStyle      0.294492
		Randomize      (0.869, 0.281, -0.301)
		colorDistMagn   0.898947
		colorDistFreq   0.478994
		detailScale     1033.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0.842527
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.278775
		terraceProb     0.35681
		erosion         0
		montesMagn      0.471164
		montesFreq      1.91094
		montesSpiky     0.963503
		montesFraction  0.772508
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.52547
		hillsFraction   0.499324
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210448
		craterFreq      0.216826
		craterDensity   0.922428
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   43.4968
		volcanoTemp     1692.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.290, 0.272, 0.000)
		colorShelf     (0.320, 0.308, 0.289, 0.000)
		colorBeach     (0.338, 0.326, 0.306, 0.000)
		colorDesert    (0.357, 0.344, 0.323, 0.000)
		colorLowland   (0.376, 0.362, 0.340, 0.000)
		colorUpland    (0.395, 0.380, 0.357, 0.000)
		colorRock      (0.414, 0.398, 0.374, 0.000)
		colorSnow      (0.432, 0.417, 0.391, 1.000)
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
		MaxLength   0.909592
		GasToDust   0.25
		Particles   2817
		GasBright   0.105795
		DustBright  0.838822
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.51083
		Period          6.28009
		Eccentricity    0.911065
		Inclination     49.4088
		AscendingNode   -143.513
		ArgOfPericenter 130.185
		MeanAnomaly     174.262
	}
}

Comet	"C82"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            5.726e-016
	Radius          0.106507
	InertiaMoment   0.398704

	Oblateness      0.0244066

	RotationPeriod  28.6669
	Obliquity       303.519
	EqAscendNode    175.572

	AbsMagn         8.89822
	SlopeParam      4.86737
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.622 0.496 0.401)

	Surface
	{
		SurfStyle       0.540109
		OceanStyle      0.556078
		Randomize      (-0.578, 0.884, -0.913)
		colorDistMagn   0.431973
		colorDistFreq   6.12545e-006
		detailScale     2.90835
		colorConversion true
		snowLevel       2
		tropicLatitude  0.750526
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411711
		terraceProb     0.189475
		erosion         0
		montesMagn      0.477172
		montesFreq      3.69507
		montesSpiky     0.926139
		montesFraction  0.197555
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.67986e-005
		hillsFraction   0.480979
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267688
		craterFreq      0.147336
		craterDensity   0.869169
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   697.844
		volcanoTemp     1700.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.169, 0.112, 0.000)
		colorShelf     (0.249, 0.174, 0.128, 0.000)
		colorBeach     (0.292, 0.203, 0.153, 0.000)
		colorDesert    (0.317, 0.218, 0.148, 0.000)
		colorLowland   (0.348, 0.233, 0.169, 0.000)
		colorUpland    (0.386, 0.283, 0.205, 0.000)
		colorRock      (0.417, 0.308, 0.221, 0.000)
		colorSnow      (0.454, 0.328, 0.233, 1.000)
		BumpHeight      0.0958562
		BumpOffset      0.0191713
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
		GasBright   0.107603
		DustBright  0.5215
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.67158
		Period          7.30859
		Eccentricity    0.903377
		Inclination     80.2374
		AscendingNode   156.675
		ArgOfPericenter 58.1565
		MeanAnomaly     155.565
	}
}

Comet	"C83"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            4.42866e-012
	Radius          2.34339
	InertiaMoment   0.396714

	Oblateness      0.0389154

	RotationPeriod  26.5426
	Obliquity       256.725
	EqAscendNode    160.15

	AbsMagn         10.3438
	SlopeParam      3.84365
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.446 0.441 0.436)

	Surface
	{
		SurfStyle       0.240255
		OceanStyle      0.817176
		Randomize      (0.586, 0.420, -0.564)
		colorDistMagn   0.523049
		colorDistFreq   0.00436788
		detailScale     63.9902
		colorConversion true
		snowLevel       2
		tropicLatitude  0.958327
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.713766
		terraceProb     0.525731
		erosion         0
		montesMagn      0.516651
		montesFreq      2.89172
		montesSpiky     0.980754
		montesFraction  0.4045
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0118386
		hillsFraction   0.69912
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236471
		craterFreq      0.27287
		craterDensity   0.936614
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   174.588
		volcanoTemp     1717.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.176, 0.175, 0.000)
		colorShelf     (0.189, 0.187, 0.185, 0.000)
		colorBeach     (0.201, 0.198, 0.196, 0.000)
		colorDesert    (0.212, 0.209, 0.207, 0.000)
		colorLowland   (0.223, 0.220, 0.218, 0.000)
		colorUpland    (0.234, 0.231, 0.229, 0.000)
		colorRock      (0.245, 0.242, 0.240, 0.000)
		colorSnow      (0.256, 0.254, 0.251, 1.000)
		BumpHeight      2.10905
		BumpOffset      0.421811
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
		MaxLength   0.461226
		GasToDust   0.25
		Particles   1911
		GasBright   0.0721531
		DustBright  0.241436
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.32632
		Period          11.999
		Eccentricity    0.959737
		Inclination     176.66
		AscendingNode   5.66357
		ArgOfPericenter -81.4436
		MeanAnomaly     -71.6564
	}
}

Comet	"C84"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.42524e-008
	Radius          41.5516
	InertiaMoment   0.399186

	Oblateness      0.0336647

	RotationPeriod  24.3408
	Obliquity       209.93
	EqAscendNode    144.727

	AbsMagn         12.2018
	SlopeParam      2.77404
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.485 0.480 0.476)

	Surface
	{
		SurfStyle       0.448267
		OceanStyle      0.229365
		Randomize      (0.068, -0.056, 0.120)
		colorDistMagn   0.830283
		colorDistFreq   0.518171
		detailScale     1134.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990552
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.456082
		terraceProb     0.215362
		erosion         0
		montesMagn      0.402232
		montesFreq      2.80945
		montesSpiky     0.985955
		montesFraction  0.753455
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.14095
		hillsFraction   0.727295
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269393
		craterFreq      0.20391
		craterDensity   0.821309
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.2005
		volcanoTemp     1541.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.192, 0.190, 0.000)
		colorShelf     (0.206, 0.204, 0.202, 0.000)
		colorBeach     (0.218, 0.216, 0.214, 0.000)
		colorDesert    (0.230, 0.228, 0.226, 0.000)
		colorLowland   (0.242, 0.240, 0.238, 0.000)
		colorUpland    (0.254, 0.252, 0.250, 0.000)
		colorRock      (0.267, 0.264, 0.262, 0.000)
		colorSnow      (0.279, 0.276, 0.274, 1.000)
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
		MaxLength   0.942418
		GasToDust   0.25
		Particles   2883
		GasBright   0.23075
		DustBright  0.567326
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.95705
		Period          9.25862
		Eccentricity    0.928491
		Inclination     -83.7268
		AscendingNode   85.0909
		ArgOfPericenter 102.424
		MeanAnomaly     55.5075
	}
}

Comet	"C85"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.05466e-015
	Radius          0.145152
	InertiaMoment   0.397782

	Oblateness      0.0565141

	RotationPeriod  22.0466
	Obliquity       163.136
	EqAscendNode    129.304

	AbsMagn         16.7285
	SlopeParam      6.71126
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.637 0.632 0.627)

	Surface
	{
		SurfStyle       0.776385
		OceanStyle      0.773467
		Randomize      (-0.621, 0.177, 0.906)
		colorDistMagn   0.763227
		colorDistFreq   1.52787e-005
		detailScale     3.96362
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998747
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446229
		terraceProb     0.122419
		erosion         0
		montesMagn      0.475689
		montesFreq      2.82042
		montesSpiky     0.699657
		montesFraction  0.587653
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.80767e-005
		hillsFraction   0.437486
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229413
		craterFreq      0.187694
		craterDensity   0.836417
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   700.766
		volcanoTemp     1723.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.215, 0.176, 0.000)
		colorShelf     (0.255, 0.221, 0.201, 0.000)
		colorBeach     (0.299, 0.259, 0.238, 0.000)
		colorDesert    (0.325, 0.278, 0.232, 0.000)
		colorLowland   (0.356, 0.297, 0.263, 0.000)
		colorUpland    (0.395, 0.360, 0.320, 0.000)
		colorRock      (0.426, 0.392, 0.345, 0.000)
		colorSnow      (0.465, 0.417, 0.364, 1.000)
		BumpHeight      0.130637
		BumpOffset      0.0261274
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
		MaxLength   0.01286
		GasToDust   0.25
		Particles   1005
		GasBright   0.168018
		DustBright  0.314545
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.50923
		Period          6.2701
		Eccentricity    0.908351
		Inclination     71.4513
		AscendingNode   157.66
		ArgOfPericenter -168.539
		MeanAnomaly     -3.08867
	}
}

Comet	"C86"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            8.15703e-012
	Radius          2.56862
	InertiaMoment   0.399624

	Oblateness      0.0513674

	RotationPeriod  19.6419
	Obliquity       116.342
	EqAscendNode    113.882

	AbsMagn         3.40276
	SlopeParam      5.12723
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.643 0.640 0.635)

	Surface
	{
		SurfStyle       0.4528
		OceanStyle      0.196905
		Randomize      (-0.245, -0.972, 0.470)
		colorDistMagn   0.0277083
		colorDistFreq   0.00220289
		detailScale     70.1405
		colorConversion true
		snowLevel       2
		tropicLatitude  0.419323
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.756514
		terraceProb     0.300501
		erosion         0
		montesMagn      0.679809
		montesFreq      3.36648
		montesSpiky     0.923402
		montesFraction  0.761272
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0131303
		hillsFraction   0.482346
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231179
		craterFreq      0.233314
		craterDensity   0.946437
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   141.007
		volcanoTemp     1693.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.256, 0.254, 0.000)
		colorShelf     (0.273, 0.272, 0.270, 0.000)
		colorBeach     (0.289, 0.288, 0.286, 0.000)
		colorDesert    (0.306, 0.304, 0.302, 0.000)
		colorLowland   (0.322, 0.320, 0.317, 0.000)
		colorUpland    (0.338, 0.336, 0.333, 0.000)
		colorRock      (0.354, 0.352, 0.349, 0.000)
		colorSnow      (0.370, 0.368, 0.365, 1.000)
		BumpHeight      2.31176
		BumpOffset      0.462352
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
		MaxLength   0.494052
		GasToDust   0.25
		Particles   1977
		GasBright   0.393805
		DustBright  0.573244
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.73649
		Period          7.73836
		Eccentricity    0.888549
		Inclination     73.5446
		AscendingNode   -24.4885
		ArgOfPericenter 45.6071
		MeanAnomaly     -48.3462
	}
}

Comet	"C87"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            6.30887e-008
	Radius          56.7286
	InertiaMoment   0.398437

	Oblateness      0.0939382

	RotationPeriod  17.1034
	Obliquity       69.5476
	EqAscendNode    98.4592

	AbsMagn         5.3947
	SlopeParam      4.07318
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.671 0.552 0.485)

	Surface
	{
		SurfStyle       0.172502
		OceanStyle      0.408014
		Randomize      (-0.444, -0.416, 0.703)
		colorDistMagn   0.969692
		colorDistFreq   2.34991
		detailScale     1549.07
		colorConversion true
		snowLevel       2
		tropicLatitude  0.877932
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.647602
		terraceProb     0.236621
		erosion         0
		montesMagn      0.48657
		montesFreq      2.33976
		montesSpiky     0.914746
		montesFraction  0.790735
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.66741
		hillsFraction   0.687538
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214153
		craterFreq      0.19801
		craterDensity   1.00597
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.4105
		volcanoTemp     1912.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.221, 0.194, 0.000)
		colorShelf     (0.285, 0.234, 0.206, 0.000)
		colorBeach     (0.302, 0.248, 0.218, 0.000)
		colorDesert    (0.319, 0.262, 0.230, 0.000)
		colorLowland   (0.336, 0.276, 0.243, 0.000)
		colorUpland    (0.352, 0.290, 0.255, 0.000)
		colorRock      (0.369, 0.303, 0.267, 0.000)
		colorSnow      (0.386, 0.317, 0.279, 1.000)
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
		MaxLength   0.975244
		GasToDust   0.25
		Particles   2949
		GasBright   0.303791
		DustBright  0.347745
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.47769
		Period          13.189
		Eccentricity    0.964928
		Inclination     -8.50366
		AscendingNode   15.9798
		ArgOfPericenter -93.3965
		MeanAnomaly     168.07
	}
}

Comet	"C88"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.94255e-015
	Radius          0.158741
	InertiaMoment   0.395264

	Oblateness      0.0931736

	RotationPeriod  14.401
	Obliquity       22.7533
	EqAscendNode    83.0366

	AbsMagn         6.87879
	SlopeParam      3.04046
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.617 0.533 0.495)

	Surface
	{
		SurfStyle       0.91815
		OceanStyle      0.297395
		Randomize      (-0.491, -0.272, -0.544)
		colorDistMagn   0.165758
		colorDistFreq   1.87633e-005
		detailScale     4.33469
		colorConversion true
		snowLevel       2
		tropicLatitude  0.283441
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.620018
		terraceProb     0.327299
		erosion         0
		montesMagn      0.606745
		montesFreq      3.0896
		montesSpiky     0.885917
		montesFraction  0.49546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.63774e-005
		hillsFraction   0.945544
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249595
		craterFreq      0.233577
		craterDensity   0.777809
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   564.689
		volcanoTemp     1830.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.187, 0.198, 0.050)
		colorShelf     (0.247, 0.219, 0.228, 0.040)
		colorBeach     (0.284, 0.251, 0.257, 0.030)
		colorDesert    (0.321, 0.283, 0.292, 0.020)
		colorLowland   (0.358, 0.315, 0.322, 0.030)
		colorUpland    (0.395, 0.347, 0.351, 0.050)
		colorRock      (0.432, 0.379, 0.391, 0.020)
		colorSnow      (0.432, 0.379, 0.391, 1.000)
		BumpHeight      0.142867
		BumpOffset      0.0285734
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
		MaxLength   0.045686
		GasToDust   0.25
		Particles   1072
		GasBright   0.00850611
		DustBright  0.327516
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.42212
		Period          12.7478
		Eccentricity    0.926112
		Inclination     10.4977
		AscendingNode   137.853
		ArgOfPericenter -71.8535
		MeanAnomaly     179.546
	}
}

Comet	"C89"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.50242e-011
	Radius          3.51384
	InertiaMoment   0.398955

	Oblateness      0.207947

	RotationPeriod  11.4947
	Obliquity       335.959
	EqAscendNode    67.614

	AbsMagn         8.21896
	SlopeParam      7.45904
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.785 0.781 0.779)

	Surface
	{
		SurfStyle       0.951365
		OceanStyle      0.732669
		Randomize      (-0.728, -0.046, 0.086)
		colorDistMagn   0.636337
		colorDistFreq   0.00585986
		detailScale     95.9513
		colorConversion true
		snowLevel       2
		tropicLatitude  0.621527
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.471258
		terraceProb     0.135139
		erosion         0
		montesMagn      0.457707
		montesFreq      2.66847
		montesSpiky     0.820588
		montesFraction  0.269023
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0282782
		hillsFraction   0.5312
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251328
		craterFreq      0.208619
		craterDensity   0.830632
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   142.132
		volcanoTemp     1791.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.273, 0.312, 0.050)
		colorShelf     (0.314, 0.320, 0.358, 0.040)
		colorBeach     (0.361, 0.367, 0.405, 0.030)
		colorDesert    (0.408, 0.414, 0.460, 0.020)
		colorLowland   (0.455, 0.461, 0.506, 0.030)
		colorUpland    (0.502, 0.508, 0.553, 0.050)
		colorRock      (0.549, 0.554, 0.616, 0.020)
		colorSnow      (0.549, 0.554, 0.616, 1.000)
		BumpHeight      3.16246
		BumpOffset      0.632491
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
		MaxLength   0.526878
		GasToDust   0.25
		Particles   2044
		GasBright   0.0692176
		DustBright  0.751291
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.34352
		Period          12.1324
		Eccentricity    0.948625
		Inclination     -153.694
		AscendingNode   101.269
		ArgOfPericenter -6.7249
		MeanAnomaly     154.274
	}
}

Comet	"C90"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.16201e-007
	Radius          61.8755
	InertiaMoment   0.397348

	Oblateness      0.249

	RotationPeriod  8.32856
	Obliquity       289.165
	EqAscendNode    52.1914

	AbsMagn         9.58491
	SlopeParam      5.40774
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.629 0.536 0.465)

	Surface
	{
		SurfStyle       0.0420725
		OceanStyle      0.893379
		Randomize      (-0.438, -0.537, -0.602)
		colorDistMagn   0.459547
		colorDistFreq   2.05611
		detailScale     1689.61
		colorConversion true
		snowLevel       2
		tropicLatitude  0.788937
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.357242
		terraceProb     0.319285
		erosion         0
		montesMagn      0.43287
		montesFreq      3.10393
		montesSpiky     0.988653
		montesFraction  0.285214
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.0894
		hillsFraction   0.702971
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267835
		craterFreq      0.256694
		craterDensity   0.962477
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.4589
		volcanoTemp     1461.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.214, 0.186, 0.000)
		colorShelf     (0.267, 0.228, 0.198, 0.000)
		colorBeach     (0.283, 0.241, 0.209, 0.000)
		colorDesert    (0.299, 0.254, 0.221, 0.000)
		colorLowland   (0.314, 0.268, 0.232, 0.000)
		colorUpland    (0.330, 0.281, 0.244, 0.000)
		colorRock      (0.346, 0.295, 0.256, 0.000)
		colorSnow      (0.362, 0.308, 0.267, 1.000)
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
		GasBright   0.0724187
		DustBright  0.432577
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.28101
		Period          4.90312
		Eccentricity    0.87379
		Inclination     -99.1454
		AscendingNode   -135.631
		ArgOfPericenter 49.6073
		MeanAnomaly     157.082
	}
}

Comet	"C91"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.57792e-015
	Radius          0.217652
	InertiaMoment   0.399411

	Oblateness      0.249

	RotationPeriod  4.82149
	Obliquity       242.37
	EqAscendNode    36.7689

	AbsMagn         11.1737
	SlopeParam      4.30369
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.734 0.636 0.593)

	Surface
	{
		SurfStyle       0.125677
		OceanStyle      0.542518
		Randomize      (-0.108, -0.262, -0.655)
		colorDistMagn   0.490695
		colorDistFreq   1.5901e-005
		detailScale     5.94335
		colorConversion true
		snowLevel       2
		tropicLatitude  0.792297
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366325
		terraceProb     0.357687
		erosion         0
		montesMagn      0.441555
		montesFreq      3.67595
		montesSpiky     0.930013
		montesFraction  0.525458
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.23263e-005
		hillsFraction   0.592407
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.285266
		craterFreq      0.248526
		craterDensity   0.98563
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   570.496
		volcanoTemp     1540.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.254, 0.237, 0.000)
		colorShelf     (0.312, 0.270, 0.252, 0.000)
		colorBeach     (0.330, 0.286, 0.267, 0.000)
		colorDesert    (0.348, 0.302, 0.282, 0.000)
		colorLowland   (0.367, 0.318, 0.296, 0.000)
		colorUpland    (0.385, 0.334, 0.311, 0.000)
		colorRock      (0.404, 0.350, 0.326, 0.000)
		colorSnow      (0.422, 0.366, 0.341, 1.000)
		BumpHeight      0.195887
		BumpOffset      0.0391774
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
		MaxLength   0.0785118
		GasToDust   0.25
		Particles   1138
		GasBright   0.200321
		DustBright  0.789162
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.36247
		Period          12.2798
		Eccentricity    0.960732
		Inclination     -65.2291
		AscendingNode   179.83
		ArgOfPericenter -156.947
		MeanAnomaly     51.4623
	}
}

Comet	"C92"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.76727e-011
	Radius          3.82058
	InertiaMoment   0.398138

	Oblateness      0.00104017

	RotationPeriod  135.565
	Obliquity       195.576
	EqAscendNode    21.3463

	AbsMagn         13.5786
	SlopeParam      3.29081
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.501 0.496 0.489)

	Surface
	{
		SurfStyle       0.00966422
		OceanStyle      0.5758
		Randomize      (0.875, 0.671, 0.356)
		colorDistMagn   0.559811
		colorDistFreq   0.00952451
		detailScale     104.327
		colorConversion true
		snowLevel       2
		tropicLatitude  0.943124
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.337391
		terraceProb     0.358408
		erosion         0
		montesMagn      0.386402
		montesFreq      2.99176
		montesSpiky     0.944325
		montesFraction  0.604807
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.036401
		hillsFraction   0.619634
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232521
		craterFreq      0.235157
		craterDensity   0.808931
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   113.87
		volcanoTemp     1766.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.199, 0.196, 0.000)
		colorShelf     (0.213, 0.211, 0.208, 0.000)
		colorBeach     (0.225, 0.223, 0.220, 0.000)
		colorDesert    (0.238, 0.236, 0.232, 0.000)
		colorLowland   (0.251, 0.248, 0.245, 0.000)
		colorUpland    (0.263, 0.261, 0.257, 0.000)
		colorRock      (0.276, 0.273, 0.269, 0.000)
		colorSnow      (0.288, 0.285, 0.281, 1.000)
		BumpHeight      3.43852
		BumpOffset      0.687705
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
		MaxLength   0.559704
		GasToDust   0.25
		Particles   2110
		GasBright   0.17624
		DustBright  0.497729
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.47629
		Period          6.06593
		Eccentricity    0.938257
		Inclination     122.441
		AscendingNode   144.414
		ArgOfPericenter -99.3689
		MeanAnomaly     -20.0922
	}
}

Comet	"C93"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.14029e-007
	Radius          85.0637
	InertiaMoment   0.399838

	Oblateness      0.00200372

	RotationPeriod  117.052
	Obliquity       148.782
	EqAscendNode    5.92367

	AbsMagn         1.71987
	SlopeParam      2.03192
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.561 0.467 0.383)

	Surface
	{
		SurfStyle       0.573611
		OceanStyle      0.019329
		Randomize      (0.288, -0.699, -0.784)
		colorDistMagn   0.722144
		colorDistFreq   1.90352
		detailScale     2322.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.870445
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535464
		terraceProb     0.234328
		erosion         0
		montesMagn      0.42871
		montesFreq      3.34234
		montesSpiky     0.949046
		montesFraction  0.742408
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.92
		hillsFraction   0.521839
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252591
		craterFreq      0.244144
		craterDensity   0.749965
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.828
		volcanoTemp     1428.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.159, 0.107, 0.000)
		colorShelf     (0.224, 0.163, 0.122, 0.000)
		colorBeach     (0.264, 0.191, 0.145, 0.000)
		colorDesert    (0.286, 0.205, 0.142, 0.000)
		colorLowland   (0.314, 0.219, 0.161, 0.000)
		colorUpland    (0.348, 0.266, 0.195, 0.000)
		colorRock      (0.376, 0.289, 0.210, 0.000)
		colorSnow      (0.409, 0.308, 0.222, 1.000)
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
		GasBright   0.114899
		DustBright  0.243556
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.58338
		Period          6.7378
		Eccentricity    0.933869
		Inclination     85.2344
		AscendingNode   -35.3622
		ArgOfPericenter -56.9932
		MeanAnomaly     10.7076
	}
}

Comet	"C94"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            6.5901e-015
	Radius          0.235736
	InertiaMoment   0.39871

	Oblateness      0.00161798

	RotationPeriod  108.07
	Obliquity       101.987
	EqAscendNode    350.501

	AbsMagn         4.49443
	SlopeParam      5.71919
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.406 0.401 0.395)

	Surface
	{
		SurfStyle       0.532179
		OceanStyle      0.269162
		Randomize      (0.984, 0.783, -0.832)
		colorDistMagn   0.900216
		colorDistFreq   3.07989e-005
		detailScale     6.43717
		colorConversion true
		snowLevel       2
		tropicLatitude  0.518417
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530709
		terraceProb     0.100381
		erosion         0
		montesMagn      0.431578
		montesFreq      3.16027
		montesSpiky     0.921415
		montesFraction  0.79457
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.49983e-005
		hillsFraction   0.710556
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242363
		craterFreq      0.168278
		craterDensity   0.779346
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   455.288
		volcanoTemp     1630.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.158, 0.136, 0.111, 0.000)
		colorShelf     (0.162, 0.140, 0.126, 0.000)
		colorBeach     (0.191, 0.165, 0.150, 0.000)
		colorDesert    (0.207, 0.177, 0.146, 0.000)
		colorLowland   (0.227, 0.189, 0.166, 0.000)
		colorUpland    (0.252, 0.229, 0.201, 0.000)
		colorRock      (0.272, 0.249, 0.217, 0.000)
		colorSnow      (0.296, 0.265, 0.229, 1.000)
		BumpHeight      0.212162
		BumpOffset      0.0424325
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
		MaxLength   0.111338
		GasToDust   0.25
		Particles   1204
		GasBright   0.319969
		DustBright  0.522973
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.45315
		Period          12.9936
		Eccentricity    0.955898
		Inclination     -131.484
		AscendingNode   11.7116
		ArgOfPericenter -2.61087
		MeanAnomaly     149.304
	}
}

Comet	"C95"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            5.09697e-011
	Radius          5.26898
	InertiaMoment   0.396734

	Oblateness      0.0026147

	RotationPeriod  101.768
	Obliquity       55.1932
	EqAscendNode    335.078

	AbsMagn         6.15838
	SlopeParam      4.53831
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.484 0.478 0.473)

	Surface
	{
		SurfStyle       0.63376
		OceanStyle      0.117366
		Randomize      (-0.525, -0.692, -0.306)
		colorDistMagn   0.0215946
		colorDistFreq   0.00272094
		detailScale     143.878
		colorConversion true
		snowLevel       2
		tropicLatitude  0.989913
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.71493
		terraceProb     0.281818
		erosion         0
		montesMagn      0.656586
		montesFreq      2.15442
		montesSpiky     0.996781
		montesFraction  0.354476
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0585313
		hillsFraction   0.57002
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263608
		craterFreq      0.213611
		craterDensity   0.825928
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   115.711
		volcanoTemp     1233.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.162, 0.132, 0.000)
		colorShelf     (0.193, 0.167, 0.151, 0.000)
		colorBeach     (0.227, 0.196, 0.180, 0.000)
		colorDesert    (0.247, 0.210, 0.175, 0.000)
		colorLowland   (0.271, 0.225, 0.198, 0.000)
		colorUpland    (0.300, 0.272, 0.241, 0.000)
		colorRock      (0.324, 0.296, 0.260, 0.000)
		colorSnow      (0.353, 0.315, 0.274, 1.000)
		BumpHeight      4.74208
		BumpOffset      0.948416
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
		MaxLength   0.59253
		GasToDust   0.25
		Particles   2176
		GasBright   0.231346
		DustBright  0.296082
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.56207
		Period          13.8684
		Eccentricity    0.950293
		Inclination     78.0756
		AscendingNode   -71.1458
		ArgOfPericenter -148.602
		MeanAnomaly     -157.65
	}
}

Comet	"C96"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.94214e-007
	Radius          91.6687
	InertiaMoment   0.399191

	Oblateness      0.0019866

	RotationPeriod  96.7832
	Obliquity       8.39888
	EqAscendNode    319.656

	AbsMagn         7.546
	SlopeParam      3.53048
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.784 0.691 0.607)

	Surface
	{
		SurfStyle       0.203846
		OceanStyle      0.806714
		Randomize      (0.918, 0.260, 0.967)
		colorDistMagn   0.0327636
		colorDistFreq   3.66828
		detailScale     2503.17
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997667
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605356
		terraceProb     0.334334
		erosion         0
		montesMagn      0.366155
		montesFreq      3.36261
		montesSpiky     0.973635
		montesFraction  0.728083
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.2294
		hillsFraction   0.485261
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216042
		craterFreq      0.212425
		craterDensity   0.8562
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.8908
		volcanoTemp     1345.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.277, 0.243, 0.000)
		colorShelf     (0.333, 0.294, 0.258, 0.000)
		colorBeach     (0.353, 0.311, 0.273, 0.000)
		colorDesert    (0.372, 0.328, 0.288, 0.000)
		colorLowland   (0.392, 0.346, 0.303, 0.000)
		colorUpland    (0.411, 0.363, 0.319, 0.000)
		colorRock      (0.431, 0.380, 0.334, 0.000)
		colorSnow      (0.451, 0.397, 0.349, 1.000)
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
		GasBright   0.105465
		DustBright  0.10645
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.35012
		Period          12.1836
		Eccentricity    0.955755
		Inclination     -78.4035
		AscendingNode   -155.882
		ArgOfPericenter 138.536
		MeanAnomaly     152.582
	}
}

Comet	"C97"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.21382e-014
	Radius          0.32637
	InertiaMoment   0.397791

	Oblateness      0.00316479

	RotationPeriod  92.5903
	Obliquity       321.605
	EqAscendNode    304.233

	AbsMagn         8.87956
	SlopeParam      2.37532
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.710 0.708 0.706)

	Surface
	{
		SurfStyle       0.21165
		OceanStyle      0.216552
		Randomize      (0.976, -0.963, 0.829)
		colorDistMagn   0.17526
		colorDistFreq   4.01384e-005
		detailScale     8.91206
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983157
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.543983
		terraceProb     0.213096
		erosion         0
		montesMagn      0.457312
		montesFreq      2.71215
		montesSpiky     0.747328
		montesFraction  0.491697
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000232361
		hillsFraction   0.927072
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241718
		craterFreq      0.155907
		craterDensity   0.891433
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   464.45
		volcanoTemp     1439.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.283, 0.282, 0.000)
		colorShelf     (0.302, 0.301, 0.300, 0.000)
		colorBeach     (0.320, 0.318, 0.318, 0.000)
		colorDesert    (0.337, 0.336, 0.335, 0.000)
		colorLowland   (0.355, 0.354, 0.353, 0.000)
		colorUpland    (0.373, 0.371, 0.371, 0.000)
		colorRock      (0.391, 0.389, 0.388, 0.000)
		colorSnow      (0.408, 0.407, 0.406, 1.000)
		BumpHeight      0.293733
		BumpOffset      0.0587465
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
		MaxLength   0.144164
		GasToDust   0.25
		Particles   1271
		GasBright   0.0395009
		DustBright  0.656901
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.03754
		Period          9.83563
		Eccentricity    0.940942
		Inclination     -89.2153
		AscendingNode   71.8456
		ArgOfPericenter 155.886
		MeanAnomaly     -7.35769
	}
}

Comet	"C98"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            9.38795e-011
	Radius          5.63731
	InertiaMoment   0.399629

	Oblateness      0.00230176

	RotationPeriod  88.9281
	Obliquity       274.81
	EqAscendNode    288.811

	AbsMagn         10.3222
	SlopeParam      6.07926
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.664 0.658 0.655)

	Surface
	{
		SurfStyle       0.68122
		OceanStyle      0.971922
		Randomize      (-0.076, 0.249, 0.459)
		colorDistMagn   0.929752
		colorDistFreq   0.0168778
		detailScale     153.936
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999714
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.634708
		terraceProb     0.244615
		erosion         0
		montesMagn      0.547274
		montesFreq      2.33591
		montesSpiky     0.949092
		montesFraction  0.593499
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0795575
		hillsFraction   0.497712
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.193697
		craterFreq      0.266985
		craterDensity   0.842777
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   91.2205
		volcanoTemp     1431.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.224, 0.183, 0.000)
		colorShelf     (0.266, 0.230, 0.210, 0.000)
		colorBeach     (0.312, 0.270, 0.249, 0.000)
		colorDesert    (0.339, 0.290, 0.242, 0.000)
		colorLowland   (0.372, 0.309, 0.275, 0.000)
		colorUpland    (0.412, 0.375, 0.334, 0.000)
		colorRock      (0.445, 0.408, 0.360, 0.000)
		colorSnow      (0.485, 0.434, 0.380, 1.000)
		BumpHeight      5.07358
		BumpOffset      1.01472
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
		MaxLength   0.625356
		GasToDust   0.25
		Particles   2243
		GasBright   0.0440941
		DustBright  0.336794
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.96903
		Period          9.34377
		Eccentricity    0.936478
		Inclination     -130.21
		AscendingNode   95.8875
		ArgOfPericenter -155.339
		MeanAnomaly     -144.03
	}
}

Comet	"C99"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            7.26092e-007
	Radius          127.554
	InertiaMoment   0.398444

	Oblateness      0.00370023

	RotationPeriod  85.6467
	Obliquity       228.016
	EqAscendNode    273.388

	AbsMagn         12.1703
	SlopeParam      4.78062
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.721 0.717 0.714)

	Surface
	{
		SurfStyle       0.272922
		OceanStyle      0.607063
		Randomize      (0.730, 0.857, -0.184)
		colorDistMagn   0.181175
		colorDistFreq   11.1163
		detailScale     3483.07
		colorConversion true
		snowLevel       2
		tropicLatitude  0.894024
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.672666
		terraceProb     0.262149
		erosion         0
		montesMagn      0.578964
		montesFreq      3.18871
		montesSpiky     0.944974
		montesFraction  0.654693
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.7966
		hillsFraction   0.666972
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210979
		craterFreq      0.614699
		craterDensity   0.806651
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.4695
		volcanoTemp     1353.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.287, 0.286, 0.000)
		colorShelf     (0.306, 0.305, 0.303, 0.000)
		colorBeach     (0.324, 0.322, 0.321, 0.000)
		colorDesert    (0.342, 0.340, 0.339, 0.000)
		colorLowland   (0.360, 0.358, 0.357, 0.000)
		colorUpland    (0.378, 0.376, 0.375, 0.000)
		colorRock      (0.396, 0.394, 0.393, 0.000)
		colorSnow      (0.414, 0.412, 0.411, 1.000)
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
		GasBright   0.151278
		DustBright  0.714097
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.05542
		Period          18.0612
		Eccentricity    0.966411
		Inclination     -94.458
		AscendingNode   -122.302
		ArgOfPericenter 134.23
		MeanAnomaly     -67.1138
	}
}

Comet	"C100"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.23569e-014
	Radius          0.344588
	InertiaMoment   0.395347

	Oblateness      0.00251481

	RotationPeriod  82.6515
	Obliquity       181.222
	EqAscendNode    257.966

	AbsMagn         16.5415
	SlopeParam      3.76356
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.665 0.609 0.503)

	Surface
	{
		SurfStyle       0.299915
		OceanStyle      0.436971
		Randomize      (-0.619, -0.300, 0.724)
		colorDistMagn   0.63054
		colorDistFreq   7.54019e-005
		detailScale     9.40954
		colorConversion true
		snowLevel       2
		tropicLatitude  0.417272
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.44685
		terraceProb     0.423924
		erosion         0
		montesMagn      0.571219
		montesFreq      2.94594
		montesSpiky     0.871947
		montesFraction  0.431271
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000265073
		hillsFraction   0.615959
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271173
		craterFreq      0.21599
		craterDensity   0.86045
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   361.327
		volcanoTemp     1453.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.244, 0.201, 0.000)
		colorShelf     (0.283, 0.259, 0.214, 0.000)
		colorBeach     (0.299, 0.274, 0.226, 0.000)
		colorDesert    (0.316, 0.289, 0.239, 0.000)
		colorLowland   (0.333, 0.305, 0.252, 0.000)
		colorUpland    (0.349, 0.320, 0.264, 0.000)
		colorRock      (0.366, 0.335, 0.277, 0.000)
		colorSnow      (0.382, 0.350, 0.289, 1.000)
		BumpHeight      0.310129
		BumpOffset      0.0620258
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
		MaxLength   0.17699
		GasToDust   0.25
		Particles   1337
		GasBright   0.128589
		DustBright  0.421272
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.92751
		Period          9.0498
		Eccentricity    0.974398
		Inclination     -154.38
		AscendingNode   142.441
		ArgOfPericenter -99.7549
		MeanAnomaly     110.004
	}
}

Comet	"C101"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.72915e-010
	Radius          7.90091
	InertiaMoment   0.398961

	Oblateness      0.00425345

	RotationPeriod  79.8788
	Obliquity       134.427
	EqAscendNode    242.543

	AbsMagn         3.36734
	SlopeParam      2.6764
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.617 0.612 0.605)

	Surface
	{
		SurfStyle       0.939124
		OceanStyle      0.300117
		Randomize      (-0.837, 0.877, 0.951)
		colorDistMagn   0.757852
		colorDistFreq   0.0307853
		detailScale     215.748
		colorConversion true
		snowLevel       2
		tropicLatitude  0.274279
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.31722
		terraceProb     0.142634
		erosion         0
		montesMagn      0.538779
		montesFreq      3.235
		montesSpiky     0.952602
		montesFraction  0.708178
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.176242
		hillsFraction   0.679589
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244053
		craterFreq      0.269277
		craterDensity   0.702577
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   94.2036
		volcanoTemp     1730.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.214, 0.242, 0.050)
		colorShelf     (0.247, 0.251, 0.279, 0.040)
		colorBeach     (0.284, 0.288, 0.315, 0.030)
		colorDesert    (0.321, 0.324, 0.357, 0.020)
		colorLowland   (0.358, 0.361, 0.394, 0.030)
		colorUpland    (0.395, 0.398, 0.430, 0.050)
		colorRock      (0.432, 0.434, 0.478, 0.020)
		colorSnow      (0.432, 0.434, 0.478, 1.000)
		BumpHeight      7.11082
		BumpOffset      1.42216
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
		MaxLength   0.658182
		GasToDust   0.25
		Particles   2309
		GasBright   0.0686411
		DustBright  0.165707
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.41588
		Period          5.69749
		Eccentricity    0.897809
		Inclination     -60.7042
		AscendingNode   -173.769
		ArgOfPericenter 117.494
		MeanAnomaly     81.0769
	}
}

Comet	"C102"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            5.32417e-018
	Radius          0.0324084
	InertiaMoment   0.397361

	Oblateness      0.0101239

	RotationPeriod  77.2834
	Obliquity       87.6331
	EqAscendNode    227.12

	AbsMagn         5.37215
	SlopeParam      6.52366
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.589 0.586 0.580)

	Surface
	{
		SurfStyle       0.455522
		OceanStyle      0.783991
		Randomize      (0.464, -0.880, -0.213)
		colorDistMagn   0.799049
		colorDistFreq   7.55368e-007
		detailScale     0.884965
		colorConversion true
		snowLevel       2
		tropicLatitude  0.93925
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.458852
		terraceProb     0.186251
		erosion         0
		montesMagn      0.518773
		montesFreq      3.05329
		montesSpiky     0.90453
		montesFraction  0.353261
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.37507e-006
		hillsFraction   0.549298
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265887
		craterFreq      0.225666
		craterDensity   0.987008
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   2202.1
		volcanoTemp     1481.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.234, 0.232, 0.000)
		colorShelf     (0.250, 0.249, 0.247, 0.000)
		colorBeach     (0.265, 0.264, 0.261, 0.000)
		colorDesert    (0.280, 0.278, 0.276, 0.000)
		colorLowland   (0.294, 0.293, 0.290, 0.000)
		colorUpland    (0.309, 0.307, 0.305, 0.000)
		colorRock      (0.324, 0.322, 0.319, 0.000)
		colorSnow      (0.339, 0.337, 0.334, 1.000)
		BumpHeight      0.0291675
		BumpOffset      0.00583351
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
		GasBright   0.252992
		DustBright  0.465842
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.64551
		Period          7.13825
		Eccentricity    0.976276
		Inclination     -52.6453
		AscendingNode   117.627
		ArgOfPericenter -41.8911
		MeanAnomaly     47.4227
	}
}

Comet	"C103"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            4.11786e-014
	Radius          0.489398
	InertiaMoment   0.399417

	Oblateness      0.00484491

	RotationPeriod  74.832
	Obliquity       40.8388
	EqAscendNode    211.698

	AbsMagn         6.85984
	SlopeParam      5.035
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.501 0.495 0.490)

	Surface
	{
		SurfStyle       0.313204
		OceanStyle      0.00442343
		Randomize      (0.456, 0.090, 0.020)
		colorDistMagn   0.52212
		colorDistFreq   0.000186174
		detailScale     13.3638
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97555
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.652375
		terraceProb     0.3789
		erosion         0
		montesMagn      0.543064
		montesFreq      3.42496
		montesSpiky     0.894982
		montesFraction  0.619489
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000737101
		hillsFraction   0.916974
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223256
		craterFreq      0.218459
		craterDensity   0.768155
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   378.122
		volcanoTemp     1441.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.198, 0.196, 0.000)
		colorShelf     (0.213, 0.210, 0.208, 0.000)
		colorBeach     (0.225, 0.223, 0.221, 0.000)
		colorDesert    (0.238, 0.235, 0.233, 0.000)
		colorLowland   (0.250, 0.248, 0.245, 0.000)
		colorUpland    (0.263, 0.260, 0.257, 0.000)
		colorRock      (0.276, 0.272, 0.270, 0.000)
		colorSnow      (0.288, 0.285, 0.282, 1.000)
		BumpHeight      0.440458
		BumpOffset      0.0880916
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
		MaxLength   0.209816
		GasToDust   0.25
		Particles   1403
		GasBright   0.165762
		DustBright  0.237559
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.32427
		Period          11.9832
		Eccentricity    0.948223
		Inclination     -43.6593
		AscendingNode   136.515
		ArgOfPericenter -84.2541
		MeanAnomaly     56.0416
	}
}

Comet	"C104"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.18487e-010
	Radius          12.1435
	InertiaMoment   0.398146

	Oblateness      0.0101472

	RotationPeriod  72.4992
	Obliquity       354.044
	EqAscendNode    196.275

	AbsMagn         8.20073
	SlopeParam      3.99347
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.540 0.532 0.529)

	Surface
	{
		SurfStyle       0.45146
		OceanStyle      0.182374
		Randomize      (0.178, 0.711, -0.646)
		colorDistMagn   0.655322
		colorDistFreq   0.089462
		detailScale     331.598
		colorConversion true
		snowLevel       2
		tropicLatitude  0.603975
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.4428
		terraceProb     0.257571
		erosion         0
		montesMagn      0.476924
		montesFreq      3.19561
		montesSpiky     0.856312
		montesFraction  0.780312
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.34154
		hillsFraction   0.426548
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.186987
		craterFreq      0.233932
		craterDensity   0.824215
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   106.685
		volcanoTemp     1470.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.213, 0.211, 0.000)
		colorShelf     (0.230, 0.226, 0.225, 0.000)
		colorBeach     (0.243, 0.239, 0.238, 0.000)
		colorDesert    (0.257, 0.253, 0.251, 0.000)
		colorLowland   (0.270, 0.266, 0.264, 0.000)
		colorUpland    (0.284, 0.279, 0.278, 0.000)
		colorRock      (0.297, 0.293, 0.291, 0.000)
		colorSnow      (0.311, 0.306, 0.304, 1.000)
		BumpHeight      10.9291
		BumpOffset      2.18582
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
		MaxLength   0.691007
		GasToDust   0.25
		Particles   2375
		GasBright   0.417303
		DustBright  0.470504
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.22316
		Period          11.2098
		Eccentricity    0.956598
		Inclination     -137.166
		AscendingNode   -16.5074
		ArgOfPericenter 126.37
		MeanAnomaly     73.5532
	}
}

Comet	"C105"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            9.80647e-018
	Radius          0.0303143
	InertiaMoment   0.399843

	Oblateness      0.00549279

	RotationPeriod  70.265
	Obliquity       307.25
	EqAscendNode    180.853

	AbsMagn         9.56524
	SlopeParam      2.95005
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.463 0.460 0.454)

	Surface
	{
		SurfStyle       0.955702
		OceanStyle      0.929064
		Randomize      (0.158, 0.783, -0.497)
		colorDistMagn   0.622861
		colorDistFreq   7.57995e-007
		detailScale     0.827783
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999479
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.524124
		terraceProb     0.299643
		erosion         0
		montesMagn      0.419783
		montesFreq      3.08228
		montesSpiky     0.983548
		montesFraction  0.55315
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.54137e-006
		hillsFraction   0.794956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226251
		craterFreq      0.165289
		craterDensity   0.748113
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1517.74
		volcanoTemp     1376.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.157, 0.161, 0.181, 0.050)
		colorShelf     (0.185, 0.188, 0.209, 0.040)
		colorBeach     (0.213, 0.216, 0.236, 0.030)
		colorDesert    (0.241, 0.244, 0.268, 0.020)
		colorLowland   (0.269, 0.271, 0.295, 0.030)
		colorUpland    (0.296, 0.299, 0.322, 0.050)
		colorRock      (0.324, 0.326, 0.358, 0.020)
		colorSnow      (0.324, 0.326, 0.358, 1.000)
		BumpHeight      0.0272829
		BumpOffset      0.00545658
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
		GasBright   0.0166443
		DustBright  0.55565
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.89761
		Period          8.84001
		Eccentricity    0.940679
		Inclination     -36.6047
		AscendingNode   -17.1112
		ArgOfPericenter 146.264
		MeanAnomaly     104.081
	}
}

Comet	"C106"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            7.58458e-014
	Radius          0.736475
	InertiaMoment   0.398717

	Oblateness      0.0107915

	RotationPeriod  68.1135
	Obliquity       260.456
	EqAscendNode    165.43

	AbsMagn         11.1488
	SlopeParam      7.14782
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.719 0.718 0.716)

	Surface
	{
		SurfStyle       0.619052
		OceanStyle      0.128527
		Randomize      (-0.835, -0.519, 0.487)
		colorDistMagn   0.733596
		colorDistFreq   0.000358176
		detailScale     20.1107
		colorConversion true
		snowLevel       2
		tropicLatitude  0.871038
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.653345
		terraceProb     0.386432
		erosion         0
		montesMagn      0.585443
		montesFreq      2.49763
		montesSpiky     0.91345
		montesFraction  0.610773
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00150151
		hillsFraction   0.704719
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208404
		craterFreq      0.192572
		craterDensity   0.869307
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   419.274
		volcanoTemp     1414.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.244, 0.200, 0.000)
		colorShelf     (0.288, 0.251, 0.229, 0.000)
		colorBeach     (0.338, 0.294, 0.272, 0.000)
		colorDesert    (0.367, 0.316, 0.265, 0.000)
		colorLowland   (0.403, 0.337, 0.301, 0.000)
		colorUpland    (0.446, 0.409, 0.365, 0.000)
		colorRock      (0.482, 0.445, 0.394, 0.000)
		colorSnow      (0.525, 0.474, 0.415, 1.000)
		BumpHeight      0.662827
		BumpOffset      0.132565
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
		MaxLength   0.242642
		GasToDust   0.25
		Particles   1469
		GasBright   0.0226297
		DustBright  0.234151
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.55018
		Period          6.52706
		Eccentricity    0.91591
		Inclination     135.799
		AscendingNode   152.544
		ArgOfPericenter 57.8937
		MeanAnomaly     109.204
	}
}

Comet	"C107"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            5.86613e-010
	Radius          11.8477
	InertiaMoment   0.396754

	Oblateness      0.00613557

	RotationPeriod  66.0315
	Obliquity       213.662
	EqAscendNode    150.007

	AbsMagn         13.5309
	SlopeParam      5.3074
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.706 0.593 0.550)

	Surface
	{
		SurfStyle       0.421942
		OceanStyle      0.933923
		Randomize      (-0.775, 0.197, -0.242)
		colorDistMagn   0.924733
		colorDistFreq   0.0665948
		detailScale     323.521
		colorConversion true
		snowLevel       2
		tropicLatitude  0.923286
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.717352
		terraceProb     0.305532
		erosion         0
		montesMagn      0.563213
		montesFreq      3.41474
		montesSpiky     0.945322
		montesFraction  0.720154
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.31653
		hillsFraction   0.527402
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217536
		craterFreq      0.198812
		craterDensity   0.836594
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   76.6944
		volcanoTemp     1911.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.237, 0.220, 0.000)
		colorShelf     (0.300, 0.252, 0.234, 0.000)
		colorBeach     (0.318, 0.267, 0.248, 0.000)
		colorDesert    (0.335, 0.282, 0.261, 0.000)
		colorLowland   (0.353, 0.296, 0.275, 0.000)
		colorUpland    (0.371, 0.311, 0.289, 0.000)
		colorRock      (0.388, 0.326, 0.303, 0.000)
		colorSnow      (0.406, 0.341, 0.316, 1.000)
		BumpHeight      10.6629
		BumpOffset      2.13258
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
		MaxLength   0.723834
		GasToDust   0.25
		Particles   2442
		GasBright   0.109095
		DustBright  0.632172
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.17273
		Period          10.8306
		Eccentricity    0.917351
		Inclination     -132.819
		AscendingNode   63.4695
		ArgOfPericenter -15.7592
		MeanAnomaly     -61.8914
	}
}

Comet	"C108"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.80622e-017
	Radius          0.0449811
	InertiaMoment   0.399197

	Oblateness      0.0117121

	RotationPeriod  64.0083
	Obliquity       166.867
	EqAscendNode    134.585

	AbsMagn         1.65666
	SlopeParam      4.2233
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.687 0.682 0.678)

	Surface
	{
		SurfStyle       0.906743
		OceanStyle      0.245289
		Randomize      (0.728, -0.721, -0.690)
		colorDistMagn   0.837953
		colorDistFreq   6.65509e-007
		detailScale     1.22828
		colorConversion true
		snowLevel       2
		tropicLatitude  0.51003
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470304
		terraceProb     0.318724
		erosion         0
		montesMagn      0.596175
		montesFreq      3.54497
		montesSpiky     0.771665
		montesFraction  0.600382
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.72926e-006
		hillsFraction   0.657921
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246791
		craterFreq      0.170027
		craterDensity   0.883861
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1659.4
		volcanoTemp     1534.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.239, 0.271, 0.050)
		colorShelf     (0.275, 0.279, 0.312, 0.040)
		colorBeach     (0.316, 0.320, 0.353, 0.030)
		colorDesert    (0.357, 0.361, 0.400, 0.020)
		colorLowland   (0.398, 0.402, 0.441, 0.030)
		colorUpland    (0.440, 0.443, 0.482, 0.050)
		colorRock      (0.481, 0.484, 0.536, 0.020)
		colorSnow      (0.481, 0.484, 0.536, 1.000)
		BumpHeight      0.040483
		BumpOffset      0.0080966
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
		GasBright   0.0877986
		DustBright  0.337955
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.62578
		Period          14.389
		Eccentricity    0.923951
		Inclination     34.7219
		AscendingNode   62.5156
		ArgOfPericenter -137.752
		MeanAnomaly     -73.9449
	}
}

Comet	"C109"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.39698e-013
	Radius          0.733871
	InertiaMoment   0.397801

	Oblateness      0.00696496

	RotationPeriod  62.0343
	Obliquity       120.073
	EqAscendNode    119.162

	AbsMagn         4.46762
	SlopeParam      3.20528
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.667 0.664 0.659)

	Surface
	{
		SurfStyle       0.767558
		OceanStyle      0.510699
		Randomize      (0.472, -0.976, -0.849)
		colorDistMagn   0.504806
		colorDistFreq   4.31899e-005
		detailScale     20.0396
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998814
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.714639
		terraceProb     0.312876
		erosion         0
		montesMagn      0.550908
		montesFreq      1.66789
		montesSpiky     0.715862
		montesFraction  0.206189
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00103325
		hillsFraction   0.704599
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238394
		craterFreq      0.278398
		craterDensity   0.814462
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   307.843
		volcanoTemp     1540.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.226, 0.185, 0.000)
		colorShelf     (0.267, 0.232, 0.211, 0.000)
		colorBeach     (0.314, 0.272, 0.251, 0.000)
		colorDesert    (0.340, 0.292, 0.244, 0.000)
		colorLowland   (0.374, 0.312, 0.277, 0.000)
		colorUpland    (0.414, 0.378, 0.336, 0.000)
		colorRock      (0.447, 0.411, 0.363, 0.000)
		colorSnow      (0.487, 0.438, 0.382, 1.000)
		BumpHeight      0.660484
		BumpOffset      0.132097
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
		MaxLength   0.275467
		GasToDust   0.25
		Particles   1536
		GasBright   0.241454
		DustBright  0.668786
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.80616
		Period          8.20873
		Eccentricity    0.931034
		Inclination     -125.5
		AscendingNode   -118.826
		ArgOfPericenter -24.0181
		MeanAnomaly     29.2937
	}
}

Comet	"C110"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.08047e-009
	Radius          17.396
	InertiaMoment   0.399635

	Oblateness      0.0128666

	RotationPeriod  60.1018
	Obliquity       73.2787
	EqAscendNode    103.74

	AbsMagn         6.13811
	SlopeParam      8.51403
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.527 0.522 0.514)

	Surface
	{
		SurfStyle       0.878501
		OceanStyle      0.299311
		Randomize      (-0.599, 0.605, 0.623)
		colorDistMagn   0.721267
		colorDistFreq   0.159036
		detailScale     475.027
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999676
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404456
		terraceProb     0.229319
		erosion         0
		montesMagn      0.619817
		montesFreq      3.42386
		montesSpiky     0.893288
		montesFraction  0.783226
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.840375
		hillsFraction   0.602038
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24142
		craterFreq      0.198222
		craterDensity   0.957865
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   82.9755
		volcanoTemp     1570.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.183, 0.206, 0.050)
		colorShelf     (0.211, 0.214, 0.236, 0.040)
		colorBeach     (0.242, 0.245, 0.267, 0.030)
		colorDesert    (0.274, 0.277, 0.303, 0.020)
		colorLowland   (0.306, 0.308, 0.334, 0.030)
		colorUpland    (0.337, 0.339, 0.365, 0.050)
		colorRock      (0.369, 0.371, 0.406, 0.020)
		colorSnow      (0.369, 0.371, 0.406, 1.000)
		BumpHeight      15.6564
		BumpOffset      3.13128
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
		MaxLength   0.756659
		GasToDust   0.25
		Particles   2508
		GasBright   0.192876
		DustBright  0.401851
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.70709
		Period          15.0625
		Eccentricity    0.953281
		Inclination     -55.8711
		AscendingNode   103.634
		ArgOfPericenter -39.8459
		MeanAnomaly     134.549
	}
}

Comet	"C111"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.32684e-017
	Radius          0.0454576
	InertiaMoment   0.398451

	Oblateness      0.00791523

	RotationPeriod  58.2035
	Obliquity       26.4844
	EqAscendNode    88.3171

	AbsMagn         7.52767
	SlopeParam      5.60659
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.727 0.615 0.550)

	Surface
	{
		SurfStyle       0.247084
		OceanStyle      0.70351
		Randomize      (-0.627, 0.940, -0.796)
		colorDistMagn   0.752075
		colorDistFreq   1.09771e-006
		detailScale     1.2413
		colorConversion true
		snowLevel       2
		tropicLatitude  0.202959
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.371847
		terraceProb     0.265838
		erosion         0
		montesMagn      0.554863
		montesFreq      3.25566
		montesSpiky     0.92501
		montesFraction  0.834401
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.05915e-006
		hillsFraction   0.601593
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265426
		craterFreq      0.25277
		craterDensity   0.959775
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1235.65
		volcanoTemp     1794.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.246, 0.220, 0.000)
		colorShelf     (0.309, 0.261, 0.234, 0.000)
		colorBeach     (0.327, 0.277, 0.248, 0.000)
		colorDesert    (0.345, 0.292, 0.261, 0.000)
		colorLowland   (0.364, 0.307, 0.275, 0.000)
		colorUpland    (0.382, 0.323, 0.289, 0.000)
		colorRock      (0.400, 0.338, 0.303, 0.000)
		colorSnow      (0.418, 0.353, 0.316, 1.000)
		BumpHeight      0.0409119
		BumpOffset      0.00818237
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
		GasBright   0.107038
		DustBright  0.172176
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.58671
		Period          6.75911
		Eccentricity    0.901564
		Inclination     14.8121
		AscendingNode   177.23
		ArgOfPericenter -165.387
		MeanAnomaly     -48.8004
	}
}

Comet	"C112"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.57307e-013
	Radius          1.06857
	InertiaMoment   0.395422

	Oblateness      0.0140305

	RotationPeriod  56.3332
	Obliquity       339.69
	EqAscendNode    72.8945

	AbsMagn         8.86092
	SlopeParam      4.45612
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.682 0.679 0.675)

	Surface
	{
		SurfStyle       0.718716
		OceanStyle      0.638678
		Randomize      (-0.158, -0.364, 0.261)
		colorDistMagn   0.68116
		colorDistFreq   0.000327238
		detailScale     29.1792
		colorConversion true
		snowLevel       2
		tropicLatitude  0.361158
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.307162
		terraceProb     0.266686
		erosion         0
		montesMagn      0.306063
		montesFreq      2.65199
		montesSpiky     0.936343
		montesFraction  0.39541
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00230583
		hillsFraction   0.338012
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260441
		craterFreq      0.244349
		craterDensity   0.807205
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   330.282
		volcanoTemp     1441.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.231, 0.189, 0.000)
		colorShelf     (0.273, 0.238, 0.216, 0.000)
		colorBeach     (0.320, 0.278, 0.257, 0.000)
		colorDesert    (0.348, 0.299, 0.250, 0.000)
		colorLowland   (0.382, 0.319, 0.284, 0.000)
		colorUpland    (0.423, 0.387, 0.344, 0.000)
		colorRock      (0.457, 0.421, 0.371, 0.000)
		colorSnow      (0.497, 0.448, 0.392, 1.000)
		BumpHeight      0.961717
		BumpOffset      0.192343
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
		MaxLength   0.308293
		GasToDust   0.25
		Particles   1602
		GasBright   0.337861
		DustBright  0.425839
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.66362
		Period          7.25644
		Eccentricity    0.909344
		Inclination     -1.56652
		AscendingNode   58.385
		ArgOfPericenter -119.557
		MeanAnomaly     -135.72
	}
}

Comet	"C113"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.99008e-009
	Radius          17.7662
	InertiaMoment   0.398967

	Oblateness      0.0090317

	RotationPeriod  54.4851
	Obliquity       292.896
	EqAscendNode    57.4719

	AbsMagn         10.3007
	SlopeParam      3.44814
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.506 0.501 0.500)

	Surface
	{
		SurfStyle       0.880551
		OceanStyle      0.430633
		Randomize      (-0.657, 0.643, 0.170)
		colorDistMagn   0.869982
		colorDistFreq   0.130372
		detailScale     485.135
		colorConversion true
		snowLevel       2
		tropicLatitude  0.908109
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.687427
		terraceProb     0.387526
		erosion         0
		montesMagn      0.61663
		montesFreq      3.0018
		montesSpiky     0.990791
		montesFraction  0.696368
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.755811
		hillsFraction   0.643852
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239065
		craterFreq      0.220844
		craterDensity   0.798099
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   62.4402
		volcanoTemp     1445.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.176, 0.200, 0.050)
		colorShelf     (0.202, 0.206, 0.230, 0.040)
		colorBeach     (0.233, 0.236, 0.260, 0.030)
		colorDesert    (0.263, 0.266, 0.295, 0.020)
		colorLowland   (0.294, 0.296, 0.325, 0.030)
		colorUpland    (0.324, 0.326, 0.355, 0.050)
		colorRock      (0.354, 0.356, 0.395, 0.020)
		colorSnow      (0.354, 0.356, 0.395, 1.000)
		BumpHeight      15.9896
		BumpOffset      3.19791
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
		MaxLength   0.789485
		GasToDust   0.25
		Particles   2574
		GasBright   0.000647845
		DustBright  0.447539
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.91652
		Period          8.97247
		Eccentricity    0.935647
		Inclination     -134.685
		AscendingNode   77.1966
		ArgOfPericenter -141.717
		MeanAnomaly     -103.574
	}
}

Comet	"C114"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            6.12763e-017
	Radius          0.0657335
	InertiaMoment   0.397373

	Oblateness      0.0158133

	RotationPeriod  52.654
	Obliquity       246.102
	EqAscendNode    42.0493

	AbsMagn         12.1391
	SlopeParam      2.26184
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.576 0.411 0.320)

	Surface
	{
		SurfStyle       0.474651
		OceanStyle      0.992306
		Randomize      (0.406, -0.615, 0.738)
		colorDistMagn   0.0910027
		colorDistFreq   1.16303e-006
		detailScale     1.79496
		colorConversion true
		snowLevel       2
		tropicLatitude  0.926066
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.447299
		terraceProb     0.23251
		erosion         0
		montesMagn      0.548744
		montesFreq      3.64192
		montesSpiky     0.939143
		montesFraction  0.308176
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.19552e-005
		hillsFraction   0.421805
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220167
		craterFreq      0.202231
		craterDensity   0.935616
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1316.58
		volcanoTemp     1521.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.164, 0.128, 0.000)
		colorShelf     (0.245, 0.175, 0.136, 0.000)
		colorBeach     (0.259, 0.185, 0.144, 0.000)
		colorDesert    (0.274, 0.195, 0.152, 0.000)
		colorLowland   (0.288, 0.205, 0.160, 0.000)
		colorUpland    (0.302, 0.216, 0.168, 0.000)
		colorRock      (0.317, 0.226, 0.176, 0.000)
		colorSnow      (0.331, 0.236, 0.184, 1.000)
		BumpHeight      0.0591601
		BumpOffset      0.011832
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
		GasBright   0.0564181
		DustBright  0.876255
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.83439
		Period          8.40196
		Eccentricity    0.924763
		Inclination     -1.73817
		AscendingNode   173.777
		ArgOfPericenter -40.4952
		MeanAnomaly     136.888
	}
}

Comet	"C115"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            4.73928e-013
	Radius          1.10048
	InertiaMoment   0.399422

	Oblateness      0.0103721

	RotationPeriod  50.8348
	Obliquity       199.307
	EqAscendNode    26.6267

	AbsMagn         16.3714
	SlopeParam      5.94701
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.798 0.754 0.708)

	Surface
	{
		SurfStyle       0.958506
		OceanStyle      0.310531
		Randomize      (-0.880, 0.392, 0.281)
		colorDistMagn   0.630629
		colorDistFreq   0.000467207
		detailScale     30.0504
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999525
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.518657
		terraceProb     0.194401
		erosion         0
		montesMagn      0.546233
		montesFreq      2.64217
		montesSpiky     0.888989
		montesFraction  0.37983
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.002478
		hillsFraction   0.553483
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252091
		craterFreq      0.147539
		craterDensity   0.938259
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   250.629
		volcanoTemp     1134.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.264, 0.283, 0.050)
		colorShelf     (0.319, 0.309, 0.326, 0.040)
		colorBeach     (0.367, 0.354, 0.368, 0.030)
		colorDesert    (0.415, 0.399, 0.418, 0.020)
		colorLowland   (0.463, 0.445, 0.460, 0.030)
		colorUpland    (0.511, 0.490, 0.503, 0.050)
		colorRock      (0.559, 0.535, 0.560, 0.020)
		colorSnow      (0.559, 0.535, 0.560, 1.000)
		BumpHeight      0.990431
		BumpOffset      0.198086
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
		MaxLength   0.341119
		GasToDust   0.25
		Particles   1668
		GasBright   0.0737728
		DustBright  0.543387
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.58443
		Period          6.74455
		Eccentricity    0.936844
		Inclination     -81.4788
		AscendingNode   109.475
		ArgOfPericenter -149.137
		MeanAnomaly     -34.2525
	}
}

Comet	"C116"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.66549e-009
	Radius          25.5398
	InertiaMoment   0.398154

	Oblateness      0.0179397

	RotationPeriod  49.0229
	Obliquity       152.513
	EqAscendNode    11.2041

	AbsMagn         3.33155
	SlopeParam      4.69531
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.507 0.502 0.497)

	Surface
	{
		SurfStyle       0.940396
		OceanStyle      0.319704
		Randomize      (-0.926, 0.269, 0.826)
		colorDistMagn   0.440219
		colorDistFreq   0.298997
		detailScale     697.407
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993318
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439128
		terraceProb     0.496947
		erosion         0
		montesMagn      0.503995
		montesFreq      3.16695
		montesSpiky     0.897857
		montesFraction  0.714388
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.06716
		hillsFraction   0.520601
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23677
		craterFreq      0.194628
		craterDensity   0.885321
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   66.139
		volcanoTemp     1410.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.176, 0.199, 0.050)
		colorShelf     (0.203, 0.206, 0.228, 0.040)
		colorBeach     (0.233, 0.236, 0.258, 0.030)
		colorDesert    (0.263, 0.266, 0.293, 0.020)
		colorLowland   (0.294, 0.296, 0.323, 0.030)
		colorUpland    (0.324, 0.326, 0.353, 0.050)
		colorRock      (0.355, 0.356, 0.392, 0.020)
		colorSnow      (0.355, 0.356, 0.392, 1.000)
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
		MaxLength   0.822311
		GasToDust   0.25
		Particles   2641
		GasBright   0.0538684
		DustBright  0.247778
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.8668
		Period          8.62559
		Eccentricity    0.940242
		Inclination     -110.718
		AscendingNode   -173.891
		ArgOfPericenter -176.754
		MeanAnomaly     -28.5553
	}
}

Comet	"C117"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.12863e-016
	Radius          0.0681663
	InertiaMoment   0.399849

	Oblateness      0.0120192

	RotationPeriod  47.2135
	Obliquity       105.719
	EqAscendNode    355.781

	AbsMagn         5.34952
	SlopeParam      3.6831
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.495 0.491 0.487)

	Surface
	{
		SurfStyle       0.20922
		OceanStyle      0.088487
		Randomize      (0.830, 0.443, -0.659)
		colorDistMagn   0.53447
		colorDistFreq   2.07897e-006
		detailScale     1.8614
		colorConversion true
		snowLevel       2
		tropicLatitude  0.909587
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.455567
		terraceProb     0.234534
		erosion         0
		montesMagn      0.478038
		montesFreq      2.73702
		montesSpiky     0.950039
		montesFraction  0.854279
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.21644e-005
		hillsFraction   0.547941
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245366
		craterFreq      0.255828
		craterDensity   0.776733
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1006
		volcanoTemp     1395.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.196, 0.195, 0.000)
		colorShelf     (0.210, 0.209, 0.207, 0.000)
		colorBeach     (0.223, 0.221, 0.219, 0.000)
		colorDesert    (0.235, 0.233, 0.231, 0.000)
		colorLowland   (0.247, 0.245, 0.244, 0.000)
		colorUpland    (0.260, 0.258, 0.256, 0.000)
		colorRock      (0.272, 0.270, 0.268, 0.000)
		colorSnow      (0.284, 0.282, 0.280, 1.000)
		BumpHeight      0.0613497
		BumpOffset      0.0122699
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
		GasBright   0.186806
		DustBright  0.599327
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.39899
		Period          5.59581
		Eccentricity    0.885387
		Inclination     -87.6642
		AscendingNode   -63.673
		ArgOfPericenter -134.845
		MeanAnomaly     109.757
	}
}

Comet	"C118"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            8.72915e-013
	Radius          1.57394
	InertiaMoment   0.398723

	Oblateness      0.0205994

	RotationPeriod  45.4021
	Obliquity       58.9243
	EqAscendNode    340.359

	AbsMagn         6.84087
	SlopeParam      2.57549
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.641 0.635 0.633)

	Surface
	{
		SurfStyle       0.360658
		OceanStyle      0.967091
		Randomize      (0.159, -0.145, 0.846)
		colorDistMagn   0.877934
		colorDistFreq   0.00156819
		detailScale     42.979
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972787
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.335478
		terraceProb     0.501115
		erosion         0
		montesMagn      0.436014
		montesFreq      2.43507
		montesSpiky     0.856795
		montesFraction  0.615426
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00502809
		hillsFraction   0.725335
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250319
		craterFreq      0.249152
		craterDensity   0.985213
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   264.124
		volcanoTemp     1656.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.254, 0.253, 0.000)
		colorShelf     (0.272, 0.270, 0.269, 0.000)
		colorBeach     (0.288, 0.286, 0.285, 0.000)
		colorDesert    (0.304, 0.302, 0.301, 0.000)
		colorLowland   (0.320, 0.317, 0.316, 0.000)
		colorUpland    (0.336, 0.333, 0.332, 0.000)
		colorRock      (0.352, 0.349, 0.348, 0.000)
		colorSnow      (0.368, 0.365, 0.364, 1.000)
		BumpHeight      1.41654
		BumpOffset      0.283309
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
		MaxLength   0.373945
		GasToDust   0.25
		Particles   1735
		GasBright   0.13962
		DustBright  0.331
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.58876
		Period          6.77219
		Eccentricity    0.97713
		Inclination     83.5307
		AscendingNode   -101.766
		ArgOfPericenter 131.537
		MeanAnomaly     -17.6523
	}
}

Comet	"C119"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            6.75137e-009
	Radius          26.6415
	InertiaMoment   0.396773

	Oblateness      0.0139145

	RotationPeriod  43.5842
	Obliquity       12.1301
	EqAscendNode    324.936

	AbsMagn         8.1825
	SlopeParam      6.35598
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.640 0.635 0.629)

	Surface
	{
		SurfStyle       0.0754698
		OceanStyle      0.667373
		Randomize      (0.845, -0.270, 0.427)
		colorDistMagn   0.558011
		colorDistFreq   0.33875
		detailScale     727.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.783284
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629997
		terraceProb     0.107316
		erosion         0
		montesMagn      0.509275
		montesFreq      2.10992
		montesSpiky     0.919197
		montesFraction  0.773346
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.55358
		hillsFraction   0.509066
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213636
		craterFreq      0.266304
		craterDensity   0.758452
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   50.8357
		volcanoTemp     1636.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.254, 0.252, 0.000)
		colorShelf     (0.272, 0.270, 0.267, 0.000)
		colorBeach     (0.288, 0.286, 0.283, 0.000)
		colorDesert    (0.304, 0.302, 0.299, 0.000)
		colorLowland   (0.320, 0.318, 0.314, 0.000)
		colorUpland    (0.336, 0.333, 0.330, 0.000)
		colorRock      (0.352, 0.349, 0.346, 0.000)
		colorSnow      (0.368, 0.365, 0.362, 1.000)
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
		MaxLength   0.855137
		GasToDust   0.25
		Particles   2707
		GasBright   0.339747
		DustBright  0.615359
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.72651
		Period          7.67178
		Eccentricity    0.923655
		Inclination     -117.365
		AscendingNode   157.39
		ArgOfPericenter -111.409
		MeanAnomaly     3.00524
	}
}

Comet	"C120"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.0788e-016
	Radius          0.0970559
	InertiaMoment   0.399203

	Oblateness      0.0240235

	RotationPeriod  41.7549
	Obliquity       325.336
	EqAscendNode    309.514

	AbsMagn         9.5456
	SlopeParam      4.94492
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.577 0.572 0.567)

	Surface
	{
		SurfStyle       0.0712142
		OceanStyle      0.0860358
		Randomize      (0.943, 0.217, -0.818)
		colorDistMagn   0.385914
		colorDistFreq   6.09196e-006
		detailScale     2.65027
		colorConversion true
		snowLevel       2
		tropicLatitude  0.599726
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.437262
		terraceProb     0.224316
		erosion         0
		montesMagn      0.410186
		montesFreq      2.85379
		montesSpiky     0.985624
		montesFraction  0.685045
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.04058e-005
		hillsFraction   0.7182
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245751
		craterFreq      0.201176
		craterDensity   0.815156
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1055.41
		volcanoTemp     1687.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.229, 0.227, 0.000)
		colorShelf     (0.245, 0.243, 0.241, 0.000)
		colorBeach     (0.260, 0.257, 0.255, 0.000)
		colorDesert    (0.274, 0.272, 0.269, 0.000)
		colorLowland   (0.288, 0.286, 0.284, 0.000)
		colorUpland    (0.303, 0.300, 0.298, 0.000)
		colorRock      (0.317, 0.315, 0.312, 0.000)
		colorSnow      (0.332, 0.329, 0.326, 1.000)
		BumpHeight      0.0873503
		BumpOffset      0.0174701
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
		GasBright   0.265279
		DustBright  0.374314
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.68229
		Period          14.856
		Eccentricity    0.97366
		Inclination     -176.756
		AscendingNode   -130.673
		ArgOfPericenter 25.1733
		MeanAnomaly     149.71
	}
}

Comet	"C121"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.6078e-012
	Radius          1.65024
	InertiaMoment   0.397811

	Oblateness      0.0166262

	RotationPeriod  39.9093
	Obliquity       278.541
	EqAscendNode    294.091

	AbsMagn         11.1241
	SlopeParam      3.91376
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.417 0.409 0.406)

	Surface
	{
		SurfStyle       0.654725
		OceanStyle      0.62989
		Randomize      (-0.219, -0.810, -0.592)
		colorDistMagn   0.450442
		colorDistFreq   0.000757544
		detailScale     45.0626
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986217
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.671423
		terraceProb     0.33655
		erosion         0
		montesMagn      0.431102
		montesFreq      4.10784
		montesSpiky     0.927546
		montesFraction  0.5435
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00764026
		hillsFraction   0.575091
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214646
		craterFreq      0.254528
		craterDensity   0.881997
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   204.05
		volcanoTemp     1441.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.139, 0.114, 0.000)
		colorShelf     (0.167, 0.143, 0.130, 0.000)
		colorBeach     (0.196, 0.168, 0.154, 0.000)
		colorDesert    (0.213, 0.180, 0.150, 0.000)
		colorLowland   (0.234, 0.192, 0.170, 0.000)
		colorUpland    (0.259, 0.233, 0.207, 0.000)
		colorRock      (0.280, 0.254, 0.223, 0.000)
		colorSnow      (0.305, 0.270, 0.235, 1.000)
		BumpHeight      1.48522
		BumpOffset      0.297043
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
		MaxLength   0.406771
		GasToDust   0.25
		Particles   1801
		GasBright   0.153551
		DustBright  0.170528
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.43054
		Period          5.78618
		Eccentricity    0.920993
		Inclination     -21.6543
		AscendingNode   -94.3081
		ArgOfPericenter -88.5622
		MeanAnomaly     -69.3608
	}
}

Comet	"C122"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.24352e-008
	Radius          37.7805
	InertiaMoment   0.39964

	Oblateness      0.0285844

	RotationPeriod  38.0422
	Obliquity       231.747
	EqAscendNode    278.669

	AbsMagn         13.4839
	SlopeParam      2.85743
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.499 0.497 0.492)

	Surface
	{
		SurfStyle       0.35788
		OceanStyle      0.916311
		Randomize      (-0.213, -0.662, 0.582)
		colorDistMagn   0.234009
		colorDistFreq   0.42953
		detailScale     1031.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988297
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.3706
		terraceProb     0.186246
		erosion         0
		montesMagn      0.552784
		montesFreq      3.68973
		montesSpiky     0.92069
		montesFraction  0.599504
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.2451
		hillsFraction   0.546123
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238491
		craterFreq      0.257527
		craterDensity   0.924126
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   53.1187
		volcanoTemp     1218.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.199, 0.197, 0.000)
		colorShelf     (0.212, 0.211, 0.209, 0.000)
		colorBeach     (0.225, 0.224, 0.222, 0.000)
		colorDesert    (0.237, 0.236, 0.234, 0.000)
		colorLowland   (0.250, 0.248, 0.246, 0.000)
		colorUpland    (0.262, 0.261, 0.259, 0.000)
		colorRock      (0.274, 0.273, 0.271, 0.000)
		colorSnow      (0.287, 0.286, 0.283, 1.000)
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
		MaxLength   0.887963
		GasToDust   0.25
		Particles   2773
		GasBright   0.0265636
		DustBright  0.782002
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.60862
		Period          14.2481
		Eccentricity    0.943753
		Inclination     67.1824
		AscendingNode   57.1494
		ArgOfPericenter -4.68028
		MeanAnomaly     42.2493
	}
}

Comet	"C123"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.82889e-016
	Radius          0.10222
	InertiaMoment   0.398458

	Oblateness      0.0202747

	RotationPeriod  36.1479
	Obliquity       184.953
	EqAscendNode    263.246

	AbsMagn         1.59182
	SlopeParam      6.89827
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.712 0.710 0.709)

	Surface
	{
		SurfStyle       0.158333
		OceanStyle      0.562465
		Randomize      (0.057, -0.005, 0.884)
		colorDistMagn   0.747031
		colorDistFreq   2.86089e-006
		detailScale     2.79129
		colorConversion true
		snowLevel       2
		tropicLatitude  0.843092
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.667365
		terraceProb     0.364634
		erosion         0
		montesMagn      0.635484
		montesFreq      2.38139
		montesSpiky     0.974754
		montesFraction  0.36807
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.12184e-005
		hillsFraction   0.705318
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261764
		craterFreq      0.22557
		craterDensity   0.796562
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   819.042
		volcanoTemp     1156.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.284, 0.284, 0.000)
		colorShelf     (0.303, 0.302, 0.301, 0.000)
		colorBeach     (0.321, 0.320, 0.319, 0.000)
		colorDesert    (0.338, 0.337, 0.337, 0.000)
		colorLowland   (0.356, 0.355, 0.355, 0.000)
		colorUpland    (0.374, 0.373, 0.372, 0.000)
		colorRock      (0.392, 0.391, 0.390, 0.000)
		colorSnow      (0.410, 0.408, 0.408, 1.000)
		BumpHeight      0.0919982
		BumpOffset      0.0183996
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
		GasBright   0.0453105
		DustBright  0.447742
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.60355
		Period          14.2066
		Eccentricity    0.961007
		Inclination     119.02
		AscendingNode   -43.8318
		ArgOfPericenter 17.5
		MeanAnomaly     167.546
	}
}

Comet	"C124"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.96137e-012
	Radius          2.33178
	InertiaMoment   0.395491

	Oblateness      0.0343365

	RotationPeriod  34.2202
	Obliquity       138.159
	EqAscendNode    247.823

	AbsMagn         4.44066
	SlopeParam      5.21025
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.687 0.683)

	Surface
	{
		SurfStyle       0.76997
		OceanStyle      0.437966
		Randomize      (-0.077, 0.455, 0.719)
		colorDistMagn   0.698981
		colorDistFreq   0.00203402
		detailScale     63.673
		colorConversion true
		snowLevel       2
		tropicLatitude  0.854684
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.349424
		terraceProb     0.112063
		erosion         0
		montesMagn      0.561913
		montesFreq      2.1721
		montesSpiky     0.984529
		montesFraction  0.449229
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0137423
		hillsFraction   0.523305
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225298
		craterFreq      0.221852
		craterDensity   0.852063
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   212.445
		volcanoTemp     1402.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.234, 0.191, 0.000)
		colorShelf     (0.277, 0.240, 0.219, 0.000)
		colorBeach     (0.326, 0.282, 0.260, 0.000)
		colorDesert    (0.353, 0.302, 0.253, 0.000)
		colorLowland   (0.388, 0.323, 0.287, 0.000)
		colorUpland    (0.429, 0.392, 0.349, 0.000)
		colorRock      (0.464, 0.426, 0.376, 0.000)
		colorSnow      (0.506, 0.453, 0.396, 1.000)
		BumpHeight      2.0986
		BumpOffset      0.41972
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
		MaxLength   0.439597
		GasToDust   0.25
		Particles   1867
		GasBright   0.147553
		DustBright  0.829986
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.73476
		Period          7.72682
		Eccentricity    0.932929
		Inclination     99.4612
		AscendingNode   12.814
		ArgOfPericenter 95.4698
		MeanAnomaly     52.6817
	}
}

Comet	"C125"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.2904e-008
	Radius          39.9508
	InertiaMoment   0.398973

	Oblateness      0.0254666

	RotationPeriod  32.2522
	Obliquity       91.3643
	EqAscendNode    232.401

	AbsMagn         6.1178
	SlopeParam      4.14326
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.789 0.723 0.638)

	Surface
	{
		SurfStyle       0.554861
		OceanStyle      0.515385
		Randomize      (-0.564, 0.154, 0.132)
		colorDistMagn   0.315005
		colorDistFreq   0.943036
		detailScale     1090.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.83593
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495971
		terraceProb     0.243005
		erosion         0
		montesMagn      0.541039
		montesFreq      2.90307
		montesSpiky     0.917657
		montesFraction  0.27603
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.17746
		hillsFraction   0.525679
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2127
		craterFreq      0.245202
		craterDensity   1.02298
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.3881
		volcanoTemp     1508.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.246, 0.179, 0.000)
		colorShelf     (0.316, 0.253, 0.204, 0.000)
		colorBeach     (0.371, 0.296, 0.242, 0.000)
		colorDesert    (0.403, 0.318, 0.236, 0.000)
		colorLowland   (0.442, 0.340, 0.268, 0.000)
		colorUpland    (0.489, 0.412, 0.325, 0.000)
		colorRock      (0.529, 0.448, 0.351, 0.000)
		colorSnow      (0.576, 0.477, 0.370, 1.000)
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
		MaxLength   0.920789
		GasToDust   0.25
		Particles   2839
		GasBright   0.139018
		DustBright  0.523008
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.4905
		Period          13.2915
		Eccentricity    0.927232
		Inclination     -145.082
		AscendingNode   -173.324
		ArgOfPericenter 137.323
		MeanAnomaly     -70.0076
	}
}

Comet	"C126"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            7.05232e-016
	Radius          0.143963
	InertiaMoment   0.397386

	Oblateness      0.0437739

	RotationPeriod  30.2358
	Obliquity       44.57
	EqAscendNode    216.978

	AbsMagn         7.50934
	SlopeParam      3.11826
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.800 0.770 0.751)

	Surface
	{
		SurfStyle       0.929858
		OceanStyle      0.871251
		Randomize      (-0.368, -0.738, 0.896)
		colorDistMagn   0.909601
		colorDistFreq   1.62997e-005
		detailScale     3.93114
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99382
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.454372
		terraceProb     0.241553
		erosion         0
		montesMagn      0.412419
		montesFreq      3.34622
		montesSpiky     0.854317
		montesFraction  0.880086
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.6732e-005
		hillsFraction   0.801225
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247016
		craterFreq      0.225111
		craterDensity   0.985254
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   849.944
		volcanoTemp     1779.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.269, 0.300, 0.050)
		colorShelf     (0.320, 0.316, 0.345, 0.040)
		colorBeach     (0.368, 0.362, 0.391, 0.030)
		colorDesert    (0.416, 0.408, 0.443, 0.020)
		colorLowland   (0.464, 0.454, 0.488, 0.030)
		colorUpland    (0.512, 0.500, 0.533, 0.050)
		colorRock      (0.560, 0.547, 0.593, 0.020)
		colorSnow      (0.560, 0.547, 0.593, 1.000)
		BumpHeight      0.129567
		BumpOffset      0.0259133
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
		GasBright   0.0932235
		DustBright  0.253289
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.36788
		Period          12.322
		Eccentricity    0.942568
		Inclination     100.878
		AscendingNode   -91.9485
		ArgOfPericenter -24.1035
		MeanAnomaly     45.6094
	}
}

Comet	"C127"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            5.45446e-012
	Radius          2.47466
	InertiaMoment   0.399428

	Oblateness      0.0333908

	RotationPeriod  28.1621
	Obliquity       357.776
	EqAscendNode    201.556

	AbsMagn         8.8423
	SlopeParam      7.8252
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.472 0.468 0.458)

	Surface
	{
		SurfStyle       0.192643
		OceanStyle      0.122254
		Randomize      (0.081, 0.215, -0.222)
		colorDistMagn   0.118271
		colorDistFreq   0.00520095
		detailScale     67.5747
		colorConversion true
		snowLevel       2
		tropicLatitude  0.739573
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.541556
		terraceProb     0.357489
		erosion         0
		montesMagn      0.568122
		montesFreq      3.24118
		montesSpiky     0.826862
		montesFraction  0.776181
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0123408
		hillsFraction   0.674495
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239446
		craterFreq      0.20841
		craterDensity   0.988177
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   166.129
		volcanoTemp     1450.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.187, 0.183, 0.000)
		colorShelf     (0.201, 0.199, 0.195, 0.000)
		colorBeach     (0.213, 0.210, 0.206, 0.000)
		colorDesert    (0.224, 0.222, 0.218, 0.000)
		colorLowland   (0.236, 0.234, 0.229, 0.000)
		colorUpland    (0.248, 0.246, 0.241, 0.000)
		colorRock      (0.260, 0.257, 0.252, 0.000)
		colorSnow      (0.272, 0.269, 0.264, 1.000)
		BumpHeight      2.22719
		BumpOffset      0.445438
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
		MaxLength   0.472423
		GasToDust   0.25
		Particles   1934
		GasBright   0.272633
		DustBright  0.558365
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.77751
		Period          8.01421
		Eccentricity    0.968481
		Inclination     -130.419
		AscendingNode   31.5113
		ArgOfPericenter -176.106
		MeanAnomaly     -140.236
	}
}

Comet	"C128"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            4.21864e-008
	Radius          56.0967
	InertiaMoment   0.398162

	Oblateness      0.0586295

	RotationPeriod  26.0204
	Obliquity       310.981
	EqAscendNode    186.133

	AbsMagn         10.2792
	SlopeParam      5.49887
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.629 0.622 0.618)

	Surface
	{
		SurfStyle       0.100006
		OceanStyle      0.85948
		Randomize      (0.631, -0.359, -0.611)
		colorDistMagn   0.282505
		colorDistFreq   1.52604
		detailScale     1531.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.620417
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.54536
		terraceProb     0.272383
		erosion         0
		montesMagn      0.519862
		montesFreq      3.45597
		montesSpiky     0.939936
		montesFraction  0.6128
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.48665
		hillsFraction   0.662083
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242578
		craterFreq      0.213149
		craterDensity   0.924112
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.821
		volcanoTemp     1682.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.249, 0.247, 0.000)
		colorShelf     (0.267, 0.264, 0.262, 0.000)
		colorBeach     (0.283, 0.280, 0.278, 0.000)
		colorDesert    (0.299, 0.295, 0.293, 0.000)
		colorLowland   (0.314, 0.311, 0.309, 0.000)
		colorUpland    (0.330, 0.327, 0.324, 0.000)
		colorRock      (0.346, 0.342, 0.340, 0.000)
		colorSnow      (0.361, 0.358, 0.355, 1.000)
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
		MaxLength   0.953615
		GasToDust   0.25
		Particles   2906
		GasBright   0.199557
		DustBright  0.315928
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.17404
		Period          10.8403
		Eccentricity    0.931422
		Inclination     -37.2611
		AscendingNode   -125.024
		ArgOfPericenter 20.6055
		MeanAnomaly     97.9127
	}
}

Comet	"C129"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.29895e-015
	Radius          0.153287
	InertiaMoment   0.399854

	Oblateness      0.046742

	RotationPeriod  23.7978
	Obliquity       264.187
	EqAscendNode    170.71

	AbsMagn         12.1082
	SlopeParam      4.37468
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.677 0.674 0.673)

	Surface
	{
		SurfStyle       0.959264
		OceanStyle      0.316877
		Randomize      (0.953, -0.331, 0.476)
		colorDistMagn   0.470146
		colorDistFreq   1.19651e-005
		detailScale     4.18575
		colorConversion true
		snowLevel       2
		tropicLatitude  0.791505
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.753786
		terraceProb     0.44592
		erosion         0
		montesMagn      0.600921
		montesFreq      3.9939
		montesSpiky     0.980872
		montesFraction  0.394383
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.1528e-005
		hillsFraction   0.4815
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240383
		craterFreq      0.168213
		craterDensity   0.853469
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   666.829
		volcanoTemp     1558.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.236, 0.269, 0.050)
		colorShelf     (0.271, 0.276, 0.310, 0.040)
		colorBeach     (0.311, 0.317, 0.350, 0.030)
		colorDesert    (0.352, 0.357, 0.397, 0.020)
		colorLowland   (0.392, 0.398, 0.437, 0.030)
		colorUpland    (0.433, 0.438, 0.478, 0.050)
		colorRock      (0.474, 0.479, 0.532, 0.020)
		colorSnow      (0.474, 0.479, 0.532, 1.000)
		BumpHeight      0.137958
		BumpOffset      0.0275916
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
		MaxLength   0.024057
		GasToDust   0.25
		Particles   1028
		GasBright   0.446157
		DustBright  0.553815
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.33435
		Period          5.21251
		Eccentricity    0.885032
		Inclination     84.914
		AscendingNode   127.423
		ArgOfPericenter -149.148
		MeanAnomaly     120.808
	}
}

Comet	"C130"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.00464e-011
	Radius          3.46521
	InertiaMoment   0.398729

	Oblateness      0.0853451

	RotationPeriod  21.4789
	Obliquity       217.393
	EqAscendNode    155.288

	AbsMagn         16.2153
	SlopeParam      3.36486
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.602 0.599 0.596)

	Surface
	{
		SurfStyle       0.465093
		OceanStyle      0.721674
		Randomize      (-0.361, -0.851, 0.220)
		colorDistMagn   0.977266
		colorDistFreq   0.00711374
		detailScale     94.6232
		colorConversion true
		snowLevel       2
		tropicLatitude  0.912218
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.434248
		terraceProb     0.1323
		erosion         0
		montesMagn      0.600461
		montesFreq      2.78852
		montesSpiky     0.999604
		montesFraction  0.362734
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0347128
		hillsFraction   0.758575
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.290406
		craterFreq      0.193513
		craterDensity   0.866172
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   171.407
		volcanoTemp     1580.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.240, 0.238, 0.000)
		colorShelf     (0.256, 0.255, 0.253, 0.000)
		colorBeach     (0.271, 0.270, 0.268, 0.000)
		colorDesert    (0.286, 0.285, 0.283, 0.000)
		colorLowland   (0.301, 0.300, 0.298, 0.000)
		colorUpland    (0.316, 0.315, 0.313, 0.000)
		colorRock      (0.331, 0.330, 0.328, 0.000)
		colorSnow      (0.346, 0.345, 0.342, 1.000)
		BumpHeight      3.11869
		BumpOffset      0.623737
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
		MaxLength   0.505249
		GasToDust   0.25
		Particles   2000
		GasBright   0.00356932
		DustBright  0.680889
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.94168
		Period          9.14972
		Eccentricity    0.941043
		Inclination     103.191
		AscendingNode   178.35
		ArgOfPericenter -13.2113
		MeanAnomaly     91.6402
	}
}

Comet	"C131"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            7.77019e-008
	Radius          59.9094
	InertiaMoment   0.396792

	Oblateness      0.0720104

	RotationPeriod  19.0443
	Obliquity       170.598
	EqAscendNode    139.865

	AbsMagn         3.29539
	SlopeParam      2.14248
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.611 0.493 0.444)

	Surface
	{
		SurfStyle       0.743739
		OceanStyle      0.789779
		Randomize      (-0.005, 0.811, 0.779)
		colorDistMagn   0.587057
		colorDistFreq   2.41713
		detailScale     1635.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.746266
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.370324
		terraceProb     0.127127
		erosion         0
		montesMagn      0.458469
		montesFreq      2.83923
		montesSpiky     0.976606
		montesFraction  0.462489
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.55659
		hillsFraction   0.783202
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228041
		craterFreq      0.241037
		craterDensity   1.03562
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   33.6965
		volcanoTemp     1571.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.168, 0.124, 0.000)
		colorShelf     (0.244, 0.172, 0.142, 0.000)
		colorBeach     (0.287, 0.202, 0.169, 0.000)
		colorDesert    (0.312, 0.217, 0.164, 0.000)
		colorLowland   (0.342, 0.232, 0.186, 0.000)
		colorUpland    (0.379, 0.281, 0.226, 0.000)
		colorRock      (0.409, 0.305, 0.244, 0.000)
		colorSnow      (0.446, 0.325, 0.258, 1.000)
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
		MaxLength   0.986441
		GasToDust   0.25
		Particles   2972
		GasBright   0.0237084
		DustBright  0.345237
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.00841
		Period          9.62542
		Eccentricity    0.949889
		Inclination     128.761
		AscendingNode   112.128
		ArgOfPericenter -126.82
		MeanAnomaly     -131.627
	}
}

Comet	"C132"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.3925e-015
	Radius          0.214098
	InertiaMoment   0.399208

	Oblateness      0.144024

	RotationPeriod  16.4694
	Obliquity       123.804
	EqAscendNode    124.443

	AbsMagn         5.32681
	SlopeParam      5.82276
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.516 0.510 0.505)

	Surface
	{
		SurfStyle       0.822241
		OceanStyle      0.221392
		Randomize      (0.080, -0.007, -0.088)
		colorDistMagn   0.759249
		colorDistFreq   2.30187e-005
		detailScale     5.84629
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972736
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366596
		terraceProb     0.227754
		erosion         0
		montesMagn      0.504096
		montesFreq      3.4755
		montesSpiky     0.958378
		montesFraction  0.586296
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000107335
		hillsFraction   0.486481
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244457
		craterFreq      0.265328
		craterDensity   0.936782
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   686.266
		volcanoTemp     1401.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.173, 0.141, 0.000)
		colorShelf     (0.207, 0.178, 0.161, 0.000)
		colorBeach     (0.243, 0.209, 0.192, 0.000)
		colorDesert    (0.263, 0.224, 0.187, 0.000)
		colorLowland   (0.289, 0.240, 0.212, 0.000)
		colorUpland    (0.320, 0.291, 0.257, 0.000)
		colorRock      (0.346, 0.316, 0.278, 0.000)
		colorSnow      (0.377, 0.336, 0.293, 1.000)
		BumpHeight      0.192688
		BumpOffset      0.0385376
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
		MaxLength   0.0568828
		GasToDust   0.25
		Particles   1094
		GasBright   0.105233
		DustBright  0.748199
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.08089
		Period          10.1512
		Eccentricity    0.951348
		Inclination     -33.9537
		AscendingNode   60.352
		ArgOfPericenter -173.223
		MeanAnomaly     -40.6002
	}
}

Comet	"C133"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.85042e-011
	Radius          3.71095
	InertiaMoment   0.39782

	Oblateness      0.138958

	RotationPeriod  13.7222
	Obliquity       77.0099
	EqAscendNode    109.02

	AbsMagn         6.82187
	SlopeParam      4.61125
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.535 0.449 0.347)

	Surface
	{
		SurfStyle       0.93294
		OceanStyle      0.382246
		Randomize      (-0.355, -0.143, -0.059)
		colorDistMagn   0.4685
		colorDistFreq   0.00973965
		detailScale     101.334
		colorConversion true
		snowLevel       2
		tropicLatitude  0.958779
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35643
		terraceProb     0.607317
		erosion         0
		montesMagn      0.675648
		montesFreq      2.26661
		montesSpiky     0.919017
		montesFraction  0.476216
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0274694
		hillsFraction   0.5148
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222799
		craterFreq      0.143821
		craterDensity   0.91746
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   135.255
		volcanoTemp     1417.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.157, 0.139, 0.050)
		colorShelf     (0.214, 0.184, 0.160, 0.040)
		colorBeach     (0.246, 0.211, 0.180, 0.030)
		colorDesert    (0.278, 0.238, 0.205, 0.020)
		colorLowland   (0.310, 0.265, 0.226, 0.030)
		colorUpland    (0.342, 0.292, 0.246, 0.050)
		colorRock      (0.374, 0.319, 0.274, 0.020)
		colorSnow      (0.374, 0.319, 0.274, 1.000)
		BumpHeight      3.33985
		BumpOffset      0.66797
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
		MaxLength   0.538075
		GasToDust   0.25
		Particles   2066
		GasBright   0.0980897
		DustBright  0.439828
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.14432
		Period          4.13964
		Eccentricity    0.931743
		Inclination     4.98524
		AscendingNode   135.332
		ArgOfPericenter 70.4195
		MeanAnomaly     -109.352
	}
}

Comet	"C134"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.43117e-007
	Radius          83.4787
	InertiaMoment   0.399645

	Oblateness      0.249

	RotationPeriod  10.7592
	Obliquity       30.2156
	EqAscendNode    93.5975

	AbsMagn         8.16428
	SlopeParam      3.60212
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.440 0.436 0.429)

	Surface
	{
		SurfStyle       0.20924
		OceanStyle      0.678043
		Randomize      (-0.775, 0.842, 0.501)
		colorDistMagn   0.750166
		colorDistFreq   5.51798
		detailScale     2279.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.563212
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.350707
		terraceProb     0.524026
		erosion         0
		montesMagn      0.679
		montesFreq      2.97364
		montesSpiky     0.908372
		montesFraction  0.472767
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.1022
		hillsFraction   0.612134
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2319
		craterFreq      0.236738
		craterDensity   1.02551
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.5967
		volcanoTemp     1310.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.174, 0.171, 0.000)
		colorShelf     (0.187, 0.185, 0.182, 0.000)
		colorBeach     (0.198, 0.196, 0.193, 0.000)
		colorDesert    (0.209, 0.207, 0.204, 0.000)
		colorLowland   (0.220, 0.218, 0.214, 0.000)
		colorUpland    (0.231, 0.229, 0.225, 0.000)
		colorRock      (0.242, 0.240, 0.236, 0.000)
		colorSnow      (0.253, 0.251, 0.246, 1.000)
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
		GasBright   0.0536876
		DustBright  0.168717
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.80114
		Period          8.17452
		Eccentricity    0.919811
		Inclination     -37.8883
		AscendingNode   -62.1612
		ArgOfPericenter 172.494
		MeanAnomaly     -137.751
	}
}

Comet	"C135"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            4.40668e-015
	Radius          0.229866
	InertiaMoment   0.398465

	Oblateness      0.249

	RotationPeriod  7.51964
	Obliquity       343.421
	EqAscendNode    78.1749

	AbsMagn         9.52601
	SlopeParam      2.47081
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.811 0.723 0.659)

	Surface
	{
		SurfStyle       0.209987
		OceanStyle      0.0854757
		Randomize      (-0.143, 0.676, 0.633)
		colorDistMagn   0.169638
		colorDistFreq   3.1905e-005
		detailScale     6.27688
		colorConversion true
		snowLevel       2
		tropicLatitude  0.803514
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404149
		terraceProb     0.416933
		erosion         0
		montesMagn      0.662811
		montesFreq      3.12893
		montesSpiky     0.90218
		montesFraction  0.412784
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000184433
		hillsFraction   0.556265
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249916
		craterFreq      0.271464
		craterDensity   0.950348
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   542.906
		volcanoTemp     1708.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.325, 0.289, 0.263, 0.000)
		colorShelf     (0.345, 0.307, 0.280, 0.000)
		colorBeach     (0.365, 0.325, 0.296, 0.000)
		colorDesert    (0.385, 0.343, 0.313, 0.000)
		colorLowland   (0.406, 0.361, 0.329, 0.000)
		colorUpland    (0.426, 0.380, 0.346, 0.000)
		colorRock      (0.446, 0.398, 0.362, 0.000)
		colorSnow      (0.467, 0.416, 0.379, 1.000)
		BumpHeight      0.206879
		BumpOffset      0.0413759
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
		MaxLength   0.0897088
		GasToDust   0.25
		Particles   1161
		GasBright   0.212379
		DustBright  0.494512
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.69869
		Period          7.48712
		Eccentricity    0.965533
		Inclination     -113.956
		AscendingNode   -37.7639
		ArgOfPericenter -67.635
		MeanAnomaly     142.907
	}
}

Comet	"C136"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.40826e-011
	Radius          5.15952
	InertiaMoment   0.395556

	Oblateness      0.249

	RotationPeriod  3.91412
	Obliquity       296.627
	EqAscendNode    62.7523

	AbsMagn         11.0994
	SlopeParam      6.20339
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.454 0.451 0.447)

	Surface
	{
		SurfStyle       0.501672
		OceanStyle      0.259679
		Randomize      (-0.552, -0.391, 0.485)
		colorDistMagn   0.539244
		colorDistFreq   0.0134776
		detailScale     140.889
		colorConversion true
		snowLevel       2
		tropicLatitude  0.932618
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.671301
		terraceProb     0.315027
		erosion         0
		montesMagn      0.535263
		montesFreq      2.65516
		montesSpiky     0.965274
		montesFraction  0.769655
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0700127
		hillsFraction   0.64471
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.189705
		craterFreq      0.269047
		craterDensity   0.949382
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   138.564
		volcanoTemp     1795.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.153, 0.125, 0.000)
		colorShelf     (0.182, 0.158, 0.143, 0.000)
		colorBeach     (0.213, 0.185, 0.170, 0.000)
		colorDesert    (0.232, 0.198, 0.165, 0.000)
		colorLowland   (0.254, 0.212, 0.188, 0.000)
		colorUpland    (0.282, 0.257, 0.228, 0.000)
		colorRock      (0.304, 0.279, 0.246, 0.000)
		colorSnow      (0.332, 0.297, 0.259, 1.000)
		BumpHeight      4.64357
		BumpOffset      0.928714
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
		MaxLength   0.570901
		GasToDust   0.25
		Particles   2133
		GasBright   0.140695
		DustBright  0.250683
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.35313
		Period          5.32295
		Eccentricity    0.934181
		Inclination     13.0169
		AscendingNode   112.114
		ArgOfPericenter -37.5918
		MeanAnomaly     -59.9144
	}
}

Comet	"C137"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.63604e-007
	Radius          89.839
	InertiaMoment   0.398979

	Oblateness      0.00157564

	RotationPeriod  128.887
	Obliquity       249.833
	EqAscendNode    47.3297

	AbsMagn         13.4377
	SlopeParam      4.85672
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.553 0.548 0.541)

	Surface
	{
		SurfStyle       0.341235
		OceanStyle      0.258746
		Randomize      (-0.804, 0.172, -0.400)
		colorDistMagn   0.817317
		colorDistFreq   6.4651
		detailScale     2453.2
		colorConversion true
		snowLevel       2
		tropicLatitude  0.175036
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.714326
		terraceProb     0.476814
		erosion         0
		montesMagn      0.607437
		montesFreq      2.17231
		montesSpiky     0.93991
		montesFraction  0.309794
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.88195
		hillsFraction   0.70507
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273054
		craterFreq      0.317205
		craterDensity   0.802165
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.4344
		volcanoTemp     1641.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.219, 0.216, 0.000)
		colorShelf     (0.235, 0.233, 0.230, 0.000)
		colorBeach     (0.249, 0.247, 0.244, 0.000)
		colorDesert    (0.263, 0.260, 0.257, 0.000)
		colorLowland   (0.277, 0.274, 0.271, 0.000)
		colorUpland    (0.290, 0.288, 0.284, 0.000)
		colorRock      (0.304, 0.301, 0.298, 0.000)
		colorSnow      (0.318, 0.315, 0.311, 1.000)
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
		GasBright   0.366577
		DustBright  0.509287
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.07634
		Period          10.1179
		Eccentricity    0.951205
		Inclination     108.072
		AscendingNode   -10.4385
		ArgOfPericenter -52.7283
		MeanAnomaly     94.1443
	}
}

Comet	"C138"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            8.11657e-015
	Radius          0.318938
	InertiaMoment   0.397398

	Oblateness      0.00288438

	RotationPeriod  114.492
	Obliquity       203.038
	EqAscendNode    31.9071

	AbsMagn         1.52524
	SlopeParam      3.8339
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.501 0.495 0.487)

	Surface
	{
		SurfStyle       0.237332
		OceanStyle      0.754245
		Randomize      (0.283, 0.471, -0.992)
		colorDistMagn   0.507101
		colorDistFreq   4.91394e-005
		detailScale     8.70913
		colorConversion true
		snowLevel       2
		tropicLatitude  0.926497
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.357549
		terraceProb     0.721207
		erosion         0
		montesMagn      0.347499
		montesFreq      3.61481
		montesSpiky     0.911182
		montesFraction  0.327302
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000145347
		hillsFraction   0.841158
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235824
		craterFreq      0.161498
		craterDensity   0.863349
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   555.042
		volcanoTemp     1739.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.198, 0.195, 0.000)
		colorShelf     (0.213, 0.211, 0.207, 0.000)
		colorBeach     (0.226, 0.223, 0.219, 0.000)
		colorDesert    (0.238, 0.235, 0.231, 0.000)
		colorLowland   (0.251, 0.248, 0.243, 0.000)
		colorUpland    (0.263, 0.260, 0.256, 0.000)
		colorRock      (0.276, 0.272, 0.268, 0.000)
		colorSnow      (0.288, 0.285, 0.280, 1.000)
		BumpHeight      0.287044
		BumpOffset      0.0574088
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
		MaxLength   0.122535
		GasToDust   0.25
		Particles   1227
		GasBright   0.267611
		DustBright  0.29274
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.67549
		Period          7.33425
		Eccentricity    0.940435
		Inclination     97.5426
		AscendingNode   -48.8071
		ArgOfPericenter -149.013
		MeanAnomaly     -5.46154
	}
}

Comet	"C139"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            6.27759e-011
	Radius          5.56487
	InertiaMoment   0.399433

	Oblateness      0.00231197

	RotationPeriod  106.385
	Obliquity       156.244
	EqAscendNode    16.4845

	AbsMagn         4.41353
	SlopeParam      2.7623
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.495 0.421 0.338)

	Surface
	{
		SurfStyle       0.752772
		OceanStyle      0.66583
		Randomize      (-0.262, 0.852, -0.677)
		colorDistMagn   0.291611
		colorDistFreq   0.00893146
		detailScale     151.958
		colorConversion true
		snowLevel       2
		tropicLatitude  0.795255
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450027
		terraceProb     0.321905
		erosion         0
		montesMagn      0.407278
		montesFreq      2.8566
		montesSpiky     0.926076
		montesFraction  0.682363
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0732747
		hillsFraction   0.458383
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254159
		craterFreq      0.222712
		craterDensity   0.974928
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   110.12
		volcanoTemp     1489.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.143, 0.095, 0.000)
		colorShelf     (0.198, 0.147, 0.108, 0.000)
		colorBeach     (0.233, 0.173, 0.129, 0.000)
		colorDesert    (0.252, 0.185, 0.125, 0.000)
		colorLowland   (0.277, 0.198, 0.142, 0.000)
		colorUpland    (0.307, 0.240, 0.173, 0.000)
		colorRock      (0.332, 0.261, 0.186, 0.000)
		colorSnow      (0.361, 0.278, 0.196, 1.000)
		BumpHeight      5.00839
		BumpOffset      1.00168
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
		MaxLength   0.603727
		GasToDust   0.25
		Particles   2199
		GasBright   0.00896647
		DustBright  0.235871
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.00999
		Period          9.63678
		Eccentricity    0.918365
		Inclination     -71.5477
		AscendingNode   -145.941
		ArgOfPericenter 72.5574
		MeanAnomaly     86.2204
	}
}

Comet	"C140"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            4.85525e-007
	Radius          124.411
	InertiaMoment   0.39817

	Oblateness      0.00372706

	RotationPeriod  100.475
	Obliquity       109.45
	EqAscendNode    1.06194

	AbsMagn         6.09744
	SlopeParam      6.68711
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.472 0.468 0.465)

	Surface
	{
		SurfStyle       0.442989
		OceanStyle      0.332131
		Randomize      (-0.766, -0.028, 0.165)
		colorDistMagn   0.153913
		colorDistFreq   4.02678
		detailScale     3397.25
		colorConversion true
		snowLevel       2
		tropicLatitude  0.941201
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.456583
		terraceProb     0.450703
		erosion         0
		montesMagn      0.434146
		montesFreq      2.53046
		montesSpiky     0.904001
		montesFraction  0.870681
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.142
		hillsFraction   0.5345
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244002
		craterFreq      0.533232
		craterDensity   0.870123
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.9936
		volcanoTemp     1516.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.187, 0.186, 0.000)
		colorShelf     (0.201, 0.199, 0.197, 0.000)
		colorBeach     (0.212, 0.211, 0.209, 0.000)
		colorDesert    (0.224, 0.222, 0.221, 0.000)
		colorLowland   (0.236, 0.234, 0.232, 0.000)
		colorUpland    (0.248, 0.246, 0.244, 0.000)
		colorRock      (0.260, 0.257, 0.255, 0.000)
		colorSnow      (0.271, 0.269, 0.267, 1.000)
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
		GasBright   0.0697725
		DustBright  0.659552
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.67438
		Period          14.7903
		Eccentricity    0.953715
		Inclination     -79.5518
		AscendingNode   64.5671
		ArgOfPericenter -119.351
		MeanAnomaly     -175.642
	}
}

Comet	"C141"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.49497e-014
	Radius          0.344703
	InertiaMoment   0.399859

	Oblateness      0.00285506

	RotationPeriod  95.7145
	Obliquity       62.6555
	EqAscendNode    345.639

	AbsMagn         7.49099
	SlopeParam      5.11587
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.631 0.628 0.624)

	Surface
	{
		SurfStyle       0.819386
		OceanStyle      0.0158232
		Randomize      (-0.346, 0.926, -0.159)
		colorDistMagn   0.491236
		colorDistFreq   3.93495e-005
		detailScale     9.41269
		colorConversion true
		snowLevel       2
		tropicLatitude  0.708462
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.656585
		terraceProb     0.456436
		erosion         0
		montesMagn      0.450835
		montesFreq      2.79824
		montesSpiky     0.979376
		montesFraction  0.539715
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000259367
		hillsFraction   0.377518
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252174
		craterFreq      0.143346
		craterDensity   0.781857
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   442.013
		volcanoTemp     1437.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.213, 0.175, 0.000)
		colorShelf     (0.252, 0.220, 0.200, 0.000)
		colorBeach     (0.296, 0.257, 0.237, 0.000)
		colorDesert    (0.322, 0.276, 0.231, 0.000)
		colorLowland   (0.353, 0.295, 0.262, 0.000)
		colorUpland    (0.391, 0.358, 0.318, 0.000)
		colorRock      (0.423, 0.389, 0.343, 0.000)
		colorSnow      (0.460, 0.414, 0.362, 1.000)
		BumpHeight      0.310233
		BumpOffset      0.0620465
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
		MaxLength   0.155361
		GasToDust   0.25
		Particles   1293
		GasBright   0.0640217
		DustBright  0.349789
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.90172
		Period          8.86875
		Eccentricity    0.932375
		Inclination     85.9023
		AscendingNode   33.5285
		ArgOfPericenter 28.0054
		MeanAnomaly     105.499
	}
}

Comet	"C142"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.15625e-010
	Radius          7.69242
	InertiaMoment   0.398736

	Oblateness      0.00445392

	RotationPeriod  91.6676
	Obliquity       15.8612
	EqAscendNode    330.217

	AbsMagn         8.82369
	SlopeParam      4.06346
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.540 0.533 0.528)

	Surface
	{
		SurfStyle       0.106674
		OceanStyle      0.59895
		Randomize      (-0.528, 0.207, 0.322)
		colorDistMagn   0.699319
		colorDistFreq   0.0314552
		detailScale     210.054
		colorConversion true
		snowLevel       2
		tropicLatitude  0.721209
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.567666
		terraceProb     0.362597
		erosion         0
		montesMagn      0.306927
		montesFreq      3.30189
		montesSpiky     0.904562
		montesFraction  0.820154
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.129591
		hillsFraction   0.841832
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234228
		craterFreq      0.219624
		craterDensity   0.876631
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   112.161
		volcanoTemp     1403.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.213, 0.211, 0.000)
		colorShelf     (0.230, 0.226, 0.224, 0.000)
		colorBeach     (0.243, 0.240, 0.237, 0.000)
		colorDesert    (0.257, 0.253, 0.251, 0.000)
		colorLowland   (0.270, 0.266, 0.264, 0.000)
		colorUpland    (0.284, 0.280, 0.277, 0.000)
		colorRock      (0.297, 0.293, 0.290, 0.000)
		colorSnow      (0.311, 0.306, 0.303, 1.000)
		BumpHeight      6.92317
		BumpOffset      1.38463
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
		MaxLength   0.636553
		GasToDust   0.25
		Particles   2265
		GasBright   0.192018
		DustBright  0.706279
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.36344
		Period          5.38387
		Eccentricity    0.912952
		Inclination     -136.199
		AscendingNode   -89.5287
		ArgOfPericenter 56.2178
		MeanAnomaly     -146.693
	}
}

Comet	"C143"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.56018e-018
	Radius          0.0213518
	InertiaMoment   0.396811

	Oblateness      0.00332435

	RotationPeriod  88.108
	Obliquity       329.067
	EqAscendNode    314.794

	AbsMagn         10.2578
	SlopeParam      3.02955
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.535 0.455 0.373)

	Surface
	{
		SurfStyle       0.731377
		OceanStyle      0.445513
		Randomize      (-0.391, 0.191, -0.837)
		colorDistMagn   0.0798223
		colorDistFreq   1.93881e-007
		detailScale     0.583048
		colorConversion true
		snowLevel       2
		tropicLatitude  0.709097
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.334134
		terraceProb     0.40314
		erosion         0
		montesMagn      0.501778
		montesFreq      2.89798
		montesSpiky     0.828492
		montesFraction  0.520611
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.48606e-006
		hillsFraction   0.584472
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24066
		craterFreq      0.240449
		craterDensity   0.927212
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1774.21
		volcanoTemp     1121.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.155, 0.105, 0.000)
		colorShelf     (0.214, 0.159, 0.119, 0.000)
		colorBeach     (0.251, 0.187, 0.142, 0.000)
		colorDesert    (0.273, 0.200, 0.138, 0.000)
		colorLowland   (0.299, 0.214, 0.157, 0.000)
		colorUpland    (0.331, 0.259, 0.190, 0.000)
		colorRock      (0.358, 0.282, 0.205, 0.000)
		colorSnow      (0.390, 0.300, 0.216, 1.000)
		BumpHeight      0.0192167
		BumpOffset      0.00384333
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
		GasBright   0.158985
		DustBright  0.423799
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.55908
		Period          6.58334
		Eccentricity    0.935625
		Inclination     163.046
		AscendingNode   -39.6693
		ArgOfPericenter -28.5319
		MeanAnomaly     -73.0112
	}
}

Comet	"C144"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.75354e-014
	Radius          0.475677
	InertiaMoment   0.399214

	Oblateness      0.0051644

	RotationPeriod  84.9026
	Obliquity       282.273
	EqAscendNode    299.372

	AbsMagn         12.0774
	SlopeParam      7.41649
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.460 0.454 0.452)

	Surface
	{
		SurfStyle       0.720902
		OceanStyle      0.906453
		Randomize      (0.222, -0.041, -0.427)
		colorDistMagn   0.801273
		colorDistFreq   0.00016922
		detailScale     12.9892
		colorConversion true
		snowLevel       2
		tropicLatitude  0.860082
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.693641
		terraceProb     0.203577
		erosion         0
		montesMagn      0.586291
		montesFreq      2.85164
		montesSpiky     0.839855
		montesFraction  0.461374
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000769065
		hillsFraction   0.571263
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22501
		craterFreq      0.27948
		craterDensity   0.891073
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   449.441
		volcanoTemp     1341.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.154, 0.127, 0.000)
		colorShelf     (0.184, 0.159, 0.145, 0.000)
		colorBeach     (0.216, 0.186, 0.172, 0.000)
		colorDesert    (0.234, 0.200, 0.167, 0.000)
		colorLowland   (0.257, 0.213, 0.190, 0.000)
		colorUpland    (0.285, 0.259, 0.231, 0.000)
		colorRock      (0.308, 0.282, 0.249, 0.000)
		colorSnow      (0.336, 0.300, 0.262, 1.000)
		BumpHeight      0.42811
		BumpOffset      0.0856219
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
		MaxLength   0.188187
		GasToDust   0.25
		Particles   1359
		GasBright   0.0886933
		DustBright  0.178577
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.70642
		Period          7.53824
		Eccentricity    0.912602
		Inclination     -19.1983
		AscendingNode   -164.351
		ArgOfPericenter -138.124
		MeanAnomaly     -109.45
	}
}

Comet	"C145"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.12967e-010
	Radius          8.34498
	InertiaMoment   0.39783

	Oblateness      0.00384821

	RotationPeriod  81.9659
	Obliquity       235.478
	EqAscendNode    283.949

	AbsMagn         16.0707
	SlopeParam      5.39533
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.721 0.717 0.713)

	Surface
	{
		SurfStyle       0.87975
		OceanStyle      0.857966
		Randomize      (-0.538, 0.443, 0.377)
		colorDistMagn   0.649583
		colorDistFreq   0.0608601
		detailScale     227.874
		colorConversion true
		snowLevel       2
		tropicLatitude  0.881114
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.468851
		terraceProb     0.200562
		erosion         0
		montesMagn      0.577287
		montesFreq      3.91118
		montesSpiky     0.883119
		montesFraction  0.403898
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.171437
		hillsFraction   0.603085
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260785
		craterFreq      0.198824
		craterDensity   0.873826
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   89.6552
		volcanoTemp     1836.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.251, 0.285, 0.050)
		colorShelf     (0.289, 0.294, 0.328, 0.040)
		colorBeach     (0.332, 0.337, 0.371, 0.030)
		colorDesert    (0.375, 0.380, 0.421, 0.020)
		colorLowland   (0.418, 0.423, 0.464, 0.030)
		colorUpland    (0.462, 0.466, 0.506, 0.050)
		colorRock      (0.505, 0.509, 0.563, 0.020)
		colorSnow      (0.505, 0.509, 0.563, 1.000)
		BumpHeight      7.51048
		BumpOffset      1.5021
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
		MaxLength   0.669379
		GasToDust   0.25
		Particles   2332
		GasBright   0.293857
		DustBright  0.4579
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.47755
		Period          6.07373
		Eccentricity    0.930022
		Inclination     111.495
		AscendingNode   -152.594
		ArgOfPericenter 117.07
		MeanAnomaly     -89.0153
	}
}

Comet	"C146"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            6.55742e-018
	Radius          0.0294174
	InertiaMoment   0.399651

	Oblateness      0.00589825

	RotationPeriod  79.2395
	Obliquity       188.684
	EqAscendNode    268.526

	AbsMagn         3.25884
	SlopeParam      4.29387
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.776 0.743 0.715)

	Surface
	{
		SurfStyle       0.0810303
		OceanStyle      0.253733
		Randomize      (0.462, 0.335, -0.584)
		colorDistMagn   0.409904
		colorDistFreq   4.40026e-007
		detailScale     0.803291
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982947
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.632025
		terraceProb     0.553338
		erosion         0
		montesMagn      0.495619
		montesFreq      3.94542
		montesSpiky     0.918708
		montesFraction  0.787322
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.33015e-006
		hillsFraction   0.580053
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266103
		craterFreq      0.241708
		craterDensity   1.05616
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1801.12
		volcanoTemp     1333.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.297, 0.286, 0.000)
		colorShelf     (0.330, 0.316, 0.304, 0.000)
		colorBeach     (0.349, 0.334, 0.322, 0.000)
		colorDesert    (0.368, 0.353, 0.340, 0.000)
		colorLowland   (0.388, 0.372, 0.357, 0.000)
		colorUpland    (0.407, 0.390, 0.375, 0.000)
		colorRock      (0.427, 0.409, 0.393, 0.000)
		colorSnow      (0.446, 0.427, 0.411, 1.000)
		BumpHeight      0.0264756
		BumpOffset      0.00529513
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
		GasBright   0.196283
		DustBright  0.239961
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.88099
		Period          8.72413
		Eccentricity    0.95882
		Inclination     -87.8831
		AscendingNode   -12.3844
		ArgOfPericenter -39.3856
		MeanAnomaly     -16.4535
	}
}

Comet	"C147"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            5.07169e-014
	Radius          0.516911
	InertiaMoment   0.398472

	Oblateness      0.00439866

	RotationPeriod  76.6815
	Obliquity       141.89
	EqAscendNode    253.104

	AbsMagn         5.304
	SlopeParam      3.28046
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.779 0.778 0.776)

	Surface
	{
		SurfStyle       0.720859
		OceanStyle      0.798607
		Randomize      (-0.402, 0.924, -0.408)
		colorDistMagn   0.663024
		colorDistFreq   0.00021762
		detailScale     14.1151
		colorConversion true
		snowLevel       2
		tropicLatitude  0.614945
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.668031
		terraceProb     0.356694
		erosion         0
		montesMagn      0.604898
		montesFreq      2.93742
		montesSpiky     0.927377
		montesFraction  0.506058
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000689282
		hillsFraction   0.495383
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239257
		craterFreq      0.200128
		craterDensity   0.84396
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   359.87
		volcanoTemp     1384.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.264, 0.217, 0.000)
		colorShelf     (0.312, 0.272, 0.248, 0.000)
		colorBeach     (0.366, 0.319, 0.295, 0.000)
		colorDesert    (0.398, 0.342, 0.287, 0.000)
		colorLowland   (0.436, 0.366, 0.326, 0.000)
		colorUpland    (0.483, 0.443, 0.396, 0.000)
		colorRock      (0.522, 0.482, 0.427, 0.000)
		colorSnow      (0.569, 0.513, 0.450, 1.000)
		BumpHeight      0.46522
		BumpOffset      0.0930439
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
		MaxLength   0.221013
		GasToDust   0.25
		Particles   1426
		GasBright   0.00827197
		DustBright  0.912458
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.48854
		Period          13.2758
		Eccentricity    0.944665
		Inclination     179.426
		AscendingNode   106.79
		ArgOfPericenter 15.9093
		MeanAnomaly     -67.7927
	}
}

Comet	"C148"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.92258e-010
	Radius          11.4798
	InertiaMoment   0.395616

	Oblateness      0.00657153

	RotationPeriod  74.2607
	Obliquity       95.0954
	EqAscendNode    237.681

	AbsMagn         6.80285
	SlopeParam      2.0161
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.633 0.627 0.623)

	Surface
	{
		SurfStyle       0.820831
		OceanStyle      0.482931
		Randomize      (-0.834, 0.107, 0.068)
		colorDistMagn   0.876147
		colorDistFreq   0.0803867
		detailScale     313.474
		colorConversion true
		snowLevel       2
		tropicLatitude  0.858608
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553046
		terraceProb     0.337939
		erosion         0
		montesMagn      0.323022
		montesFreq      3.49017
		montesSpiky     0.96588
		montesFraction  0.533383
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.338987
		hillsFraction   0.618992
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244479
		craterFreq      0.259334
		craterDensity   0.891804
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   90.8769
		volcanoTemp     1527.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.213, 0.174, 0.000)
		colorShelf     (0.253, 0.219, 0.199, 0.000)
		colorBeach     (0.298, 0.257, 0.237, 0.000)
		colorDesert    (0.323, 0.276, 0.230, 0.000)
		colorLowland   (0.354, 0.295, 0.261, 0.000)
		colorUpland    (0.392, 0.357, 0.318, 0.000)
		colorRock      (0.424, 0.389, 0.342, 0.000)
		colorSnow      (0.462, 0.414, 0.361, 1.000)
		BumpHeight      10.3318
		BumpOffset      2.06636
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
		MaxLength   0.702204
		GasToDust   0.25
		Particles   2398
		GasBright   0.0411725
		DustBright  0.564044
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.23413
		Period          11.2929
		Eccentricity    0.948359
		Inclination     84.7031
		AscendingNode   59.429
		ArgOfPericenter -43.8086
		MeanAnomaly     123.44
	}
}

Comet	"C149"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.20779e-017
	Radius          0.0320188
	InertiaMoment   0.398985

	Oblateness      0.00499535

	RotationPeriod  71.9533
	Obliquity       48.3011
	EqAscendNode    222.259

	AbsMagn         8.14606
	SlopeParam      5.70518
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.709 0.631 0.605)

	Surface
	{
		SurfStyle       0.359871
		OceanStyle      0.668225
		Randomize      (0.326, 0.015, 0.529)
		colorDistMagn   0.251511
		colorDistFreq   5.99163e-007
		detailScale     0.874326
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996399
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.474201
		terraceProb     0.224526
		erosion         0
		montesMagn      0.625195
		montesFreq      2.74469
		montesSpiky     0.828058
		montesFraction  0.390133
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.62385e-006
		hillsFraction   0.603651
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229907
		craterFreq      0.204625
		craterDensity   0.955398
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1444.49
		volcanoTemp     1308.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.252, 0.242, 0.000)
		colorShelf     (0.301, 0.268, 0.257, 0.000)
		colorBeach     (0.319, 0.284, 0.272, 0.000)
		colorDesert    (0.337, 0.300, 0.287, 0.000)
		colorLowland   (0.354, 0.316, 0.302, 0.000)
		colorUpland    (0.372, 0.331, 0.318, 0.000)
		colorRock      (0.390, 0.347, 0.333, 0.000)
		colorSnow      (0.408, 0.363, 0.348, 1.000)
		BumpHeight      0.0288169
		BumpOffset      0.00576338
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
		GasBright   0.036814
		DustBright  0.252889
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.29756
		Period          11.7772
		Eccentricity    0.964995
		Inclination     -38.3417
		AscendingNode   160.627
		ArgOfPericenter 19.2647
		MeanAnomaly     41.4443
	}
}

Comet	"C150"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            9.34139e-014
	Radius          0.710064
	InertiaMoment   0.39741

	Oblateness      0.00745406

	RotationPeriod  69.7403
	Obliquity       1.50684
	EqAscendNode    206.836

	AbsMagn         9.50645
	SlopeParam      4.52825
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.711 0.707 0.705)

	Surface
	{
		SurfStyle       0.0667124
		OceanStyle      0.66607
		Randomize      (-0.726, 0.663, -0.776)
		colorDistMagn   0.623855
		colorDistFreq   0.000226352
		detailScale     19.3895
		colorConversion true
		snowLevel       2
		tropicLatitude  0.789257
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512557
		terraceProb     0.325365
		erosion         0
		montesMagn      0.370593
		montesFreq      3.15279
		montesSpiky     0.953742
		montesFraction  0.47492
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000691896
		hillsFraction   0.579261
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252451
		craterFreq      0.182551
		craterDensity   0.886396
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   364.249
		volcanoTemp     1444.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.283, 0.282, 0.000)
		colorShelf     (0.302, 0.300, 0.300, 0.000)
		colorBeach     (0.320, 0.318, 0.317, 0.000)
		colorDesert    (0.338, 0.336, 0.335, 0.000)
		colorLowland   (0.355, 0.353, 0.353, 0.000)
		colorUpland    (0.373, 0.371, 0.370, 0.000)
		colorRock      (0.391, 0.389, 0.388, 0.000)
		colorSnow      (0.409, 0.406, 0.406, 1.000)
		BumpHeight      0.639058
		BumpOffset      0.127812
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
		MaxLength   0.253838
		GasToDust   0.25
		Particles   1492
		GasBright   0.144092
		DustBright  0.630098
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.74023
		Period          7.76339
		Eccentricity    0.926115
		Inclination     -126.863
		AscendingNode   -133.05
		ArgOfPericenter 137.581
		MeanAnomaly     -117.053
	}
}

Comet	"C151"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            7.2249e-010
	Radius          12.514
	InertiaMoment   0.399438

	Oblateness      0.0056566

	RotationPeriod  67.6066
	Obliquity       314.713
	EqAscendNode    191.413

	AbsMagn         11.0749
	SlopeParam      3.52049
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.659 0.655 0.650)

	Surface
	{
		SurfStyle       0.441074
		OceanStyle      0.104573
		Randomize      (0.659, 0.530, 0.957)
		colorDistMagn   0.787476
		colorDistFreq   0.0995127
		detailScale     341.714
		colorConversion true
		snowLevel       2
		tropicLatitude  0.674622
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.743425
		terraceProb     0.175409
		erosion         0
		montesMagn      0.465954
		montesFreq      1.45766
		montesSpiky     0.91694
		montesFraction  0.542561
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.370333
		hillsFraction   0.604965
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22943
		craterFreq      0.278285
		craterDensity   0.994174
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   72.9936
		volcanoTemp     1285.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.262, 0.260, 0.000)
		colorShelf     (0.280, 0.278, 0.276, 0.000)
		colorBeach     (0.296, 0.295, 0.293, 0.000)
		colorDesert    (0.313, 0.311, 0.309, 0.000)
		colorLowland   (0.329, 0.328, 0.325, 0.000)
		colorUpland    (0.346, 0.344, 0.341, 0.000)
		colorRock      (0.362, 0.360, 0.358, 0.000)
		colorSnow      (0.379, 0.377, 0.374, 1.000)
		BumpHeight      11.2626
		BumpOffset      2.25251
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
		MaxLength   0.73503
		GasToDust   0.25
		Particles   2464
		GasBright   0.112452
		DustBright  0.346225
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.51051
		Period          13.4519
		Eccentricity    0.923476
		Inclination     172.232
		AscendingNode   -115.313
		ArgOfPericenter -115.705
		MeanAnomaly     -20.3088
	}
}

Comet	"C152"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            2.2246e-017
	Radius          0.0439233
	InertiaMoment   0.398178

	Oblateness      0.00841302

	RotationPeriod  65.5397
	Obliquity       267.918
	EqAscendNode    175.991

	AbsMagn         13.3922
	SlopeParam      2.36177
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.724 0.723 0.721)

	Surface
	{
		SurfStyle       0.655569
		OceanStyle      0.904794
		Randomize      (0.583, -0.574, -0.933)
		colorDistMagn   0.549003
		colorDistFreq   8.26015e-007
		detailScale     1.1994
		colorConversion true
		snowLevel       2
		tropicLatitude  0.640532
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.526031
		terraceProb     0.330917
		erosion         0
		montesMagn      0.625466
		montesFreq      2.10469
		montesSpiky     0.916135
		montesFraction  0.488237
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.74231e-006
		hillsFraction   0.61265
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222157
		craterFreq      0.227698
		craterDensity   0.836555
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1460.07
		volcanoTemp     1226.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.246, 0.202, 0.000)
		colorShelf     (0.290, 0.253, 0.231, 0.000)
		colorBeach     (0.340, 0.296, 0.274, 0.000)
		colorDesert    (0.369, 0.318, 0.267, 0.000)
		colorLowland   (0.406, 0.340, 0.303, 0.000)
		colorUpland    (0.449, 0.412, 0.368, 0.000)
		colorRock      (0.485, 0.448, 0.396, 0.000)
		colorSnow      (0.529, 0.477, 0.418, 1.000)
		BumpHeight      0.0395309
		BumpOffset      0.00790619
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
		GasBright   0.28692
		DustBright  0.656243
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.81423
		Period          8.26381
		Eccentricity    0.947342
		Inclination     -76.5581
		AscendingNode   38.6116
		ArgOfPericenter 5.92627
		MeanAnomaly     146.751
	}
}

Comet	"C153"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.72057e-013
	Radius          0.775147
	InertiaMoment   0.399864

	Oblateness      0.00640339

	RotationPeriod  63.5291
	Obliquity       221.124
	EqAscendNode    160.568

	AbsMagn         1.45683
	SlopeParam      6.06266
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.408 0.400 0.396)

	Surface
	{
		SurfStyle       0.664479
		OceanStyle      0.373021
		Randomize      (0.193, -0.703, 0.320)
		colorDistMagn   0.496356
		colorDistFreq   0.00026763
		detailScale     21.1667
		colorConversion true
		snowLevel       2
		tropicLatitude  0.904321
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.626023
		terraceProb     0.323675
		erosion         0
		montesMagn      0.444774
		montesFreq      2.64138
		montesSpiky     0.982598
		montesFraction  0.742985
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00167032
		hillsFraction   0.653458
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214686
		craterFreq      0.214183
		craterDensity   0.973931
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   292.991
		volcanoTemp     1439.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.159, 0.136, 0.111, 0.000)
		colorShelf     (0.163, 0.140, 0.127, 0.000)
		colorBeach     (0.192, 0.164, 0.151, 0.000)
		colorDesert    (0.208, 0.176, 0.147, 0.000)
		colorLowland   (0.228, 0.188, 0.166, 0.000)
		colorUpland    (0.253, 0.228, 0.202, 0.000)
		colorRock      (0.273, 0.248, 0.218, 0.000)
		colorSnow      (0.298, 0.264, 0.230, 1.000)
		BumpHeight      0.697632
		BumpOffset      0.139526
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
		MaxLength   0.286664
		GasToDust   0.25
		Particles   1558
		GasBright   0.227997
		DustBright  0.399652
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.69247
		Period          14.9406
		Eccentricity    0.94257
		Inclination     -60.5128
		AscendingNode   84.3803
		ArgOfPericenter -77.7573
		MeanAnomaly     64.7912
	}
}

Comet	"C154"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            1.33073e-009
	Radius          17.1443
	InertiaMoment   0.398742

	Oblateness      0.00949815

	RotationPeriod  61.5658
	Obliquity       174.33
	EqAscendNode    145.146

	AbsMagn         4.38624
	SlopeParam      4.77015
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.700 0.699 0.696)

	Surface
	{
		SurfStyle       0.651221
		OceanStyle      0.0353484
		Randomize      (0.387, 0.815, 0.614)
		colorDistMagn   0.591076
		colorDistFreq   0.137673
		detailScale     468.155
		colorConversion true
		snowLevel       2
		tropicLatitude  0.103876
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.482566
		terraceProb     0.237952
		erosion         0
		montesMagn      0.606096
		montesFreq      3.24982
		montesSpiky     0.890148
		montesFraction  0.719062
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.633418
		hillsFraction   0.588259
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268361
		craterFreq      0.159736
		craterDensity   0.820251
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   73.6853
		volcanoTemp     1559.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.238, 0.195, 0.000)
		colorShelf     (0.280, 0.245, 0.223, 0.000)
		colorBeach     (0.329, 0.286, 0.264, 0.000)
		colorDesert    (0.357, 0.307, 0.257, 0.000)
		colorLowland   (0.392, 0.328, 0.292, 0.000)
		colorUpland    (0.434, 0.398, 0.355, 0.000)
		colorRock      (0.469, 0.433, 0.383, 0.000)
		colorSnow      (0.511, 0.461, 0.403, 1.000)
		BumpHeight      15.4299
		BumpOffset      3.08598
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
		MaxLength   0.767856
		GasToDust   0.25
		Particles   2531
		GasBright   0.131815
		DustBright  0.180321
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.78127
		Period          15.6858
		Eccentricity    0.963962
		Inclination     -0.581011
		AscendingNode   -62.3179
		ArgOfPericenter 63.9966
		MeanAnomaly     94.3919
	}
}

Comet	"C155"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            4.09744e-017
	Radius          0.0480146
	InertiaMoment   0.39683

	Oblateness      0.0071686

	RotationPeriod  59.6421
	Obliquity       127.535
	EqAscendNode    129.723

	AbsMagn         6.07704
	SlopeParam      3.75378
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.522 0.417 0.323)

	Surface
	{
		SurfStyle       0.174941
		OceanStyle      0.154557
		Randomize      (0.181, 0.827, -0.934)
		colorDistMagn   0.793417
		colorDistFreq   1.36951e-006
		detailScale     1.31112
		colorConversion true
		snowLevel       2
		tropicLatitude  0.924077
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536055
		terraceProb     0.470735
		erosion         0
		montesMagn      0.600647
		montesFreq      2.84501
		montesSpiky     0.876585
		montesFraction  0.509986
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.22809e-006
		hillsFraction   0.841494
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229092
		craterFreq      0.238711
		craterDensity   1.0713
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1176.04
		volcanoTemp     1542.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.167, 0.129, 0.000)
		colorShelf     (0.222, 0.177, 0.137, 0.000)
		colorBeach     (0.235, 0.188, 0.145, 0.000)
		colorDesert    (0.248, 0.198, 0.154, 0.000)
		colorLowland   (0.261, 0.209, 0.162, 0.000)
		colorUpland    (0.274, 0.219, 0.170, 0.000)
		colorRock      (0.287, 0.230, 0.178, 0.000)
		colorSnow      (0.300, 0.240, 0.186, 1.000)
		BumpHeight      0.0432132
		BumpOffset      0.00864263
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
		GasBright   0.383451
		DustBright  0.413171
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.25284
		Period          11.4351
		Eccentricity    0.955924
		Inclination     63.6414
		AscendingNode   -156.724
		ArgOfPericenter 9.13955
		MeanAnomaly     -149.423
	}
}

Comet	"C156"
{
	ParentBody     "RS 8476-1353-8-11843423-103"
	Class	       "Asteroid"

	Mass            3.16907e-013
	Radius          1.06066
	InertiaMoment   0.39922

	Oblateness      0.0107522

	RotationPeriod  57.7511
	Obliquity       80.7411
	EqAscendNode    114.3

	AbsMagn         7.47263
	SlopeParam      2.66428
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.753 0.685 0.610)

	Surface
	{
		SurfStyle       0.973544
		OceanStyle      0.259403
		Randomize      (0.581, -0.444, -0.352)
		colorDistMagn   0.849373
		colorDistFreq   0.000616122
		detailScale     28.963
		colorConversion true
		snowLevel       2
		tropicLatitude  0.319746
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.284501
		terraceProb     0.326896
		erosion         0
		montesMagn      0.656055
		montesFreq      2.55255
		montesSpiky     0.940373
		montesFraction  0.594643
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00207249
		hillsFraction   0.675513
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217216
		craterFreq      0.250222
		craterDensity   0.918024
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   295.403
		volcanoTemp     1333.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.240, 0.244, 0.050)
		colorShelf     (0.301, 0.281, 0.281, 0.040)
		colorBeach     (0.347, 0.322, 0.317, 0.030)
		colorDesert    (0.392, 0.363, 0.360, 0.020)
		colorLowland   (0.437, 0.404, 0.397, 0.030)
		colorUpland    (0.482, 0.446, 0.433, 0.050)
		colorRock      (0.527, 0.487, 0.482, 0.020)
		colorSnow      (0.527, 0.487, 0.482, 1.000)
		BumpHeight      0.954591
		BumpOffset      0.190918
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
		MaxLength   0.31949
		GasToDust   0.25
		Particles   1625
		GasBright   0.0194327
		DustBright  0.461677
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.76382
		Period          15.5384
		Eccentricity    0.961457
		Inclination     -88.528
		AscendingNode   17.0325
		ArgOfPericenter 28.1363
		MeanAnomaly     -124.346
	}
}

