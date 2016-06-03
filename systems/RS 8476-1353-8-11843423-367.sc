Star	"RS 8476-1353-8-11843423-367"
{
	ParentBody     "RS 8476-1353-8-11843423-367"
	Class	       "L2 V"
	Luminosity      6.99536e-005
	MassSol         0.0628374
	RadSol          0.0608276
	Teff            3941

	Age             11.5971

	InertiaMoment   0.257749

	RotationPeriod  5.69986
	Obliquity       334.434
	EqAscendNode    17.5146

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.625 0.356)

	Surface
	{
		SurfStyle       0.13282
		Randomize      (0.187, 0.006, -0.439)
		colorDistMagn   0.524657
		colorDistFreq   10.3961
		detailScale     108891
		colorConversion true
		tropicLatitude  0.50708
		icecapLatitude  1.00472
		mainFreq        0.00872554
		venusFreq       10.024
		venusMagn       0.240574
		mareFreq        23.2582
		mareDensity     0.0195801
		erosion         1
		montesFreq      537
		dunesMagn       0.506007
		hillsMagn       0.03
		hillsFreq       555.855
		craterOctaves   0
		twistZones      6.4598
		twistMagn       0.8352
		cycloneMagn     14.9474
		cycloneFreq     0.378016
		cycloneDensity  0.0715274
		cycloneOctaves  1
		colorLayer0    (0.240, 0.220, 0.240, 0.400)
		colorLayer1    (0.220, 0.200, 0.220, 0.200)
		colorLayer2    (0.180, 0.160, 0.180, 0.000)
		colorLayer3    (0.040, 0.040, 0.080, 0.000)
		colorLayer4    (0.020, 0.020, 0.040, 1.100)
		colorLayer5    (0.040, 0.040, 0.080, 0.000)
		colorLayer6    (0.140, 0.140, 0.160, 0.200)
		colorLayer7    (0.190, 0.190, 0.220, 1.000)
		colorLowPlants (0.020, 0.020, 0.040, 1.100)
		colorUpPlants  (0.040, 0.040, 0.080, 0.000)
		BumpHeight      42.336
		BumpOffset      42.336
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          25.4023
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.12123
		mainOctaves     10
		Coverage        0
		twistZones      6.4598
		twistMagn       0.8352
	}

	Clouds
	{
		Height          50.8047
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.12123
		mainOctaves     10
		Coverage        0
		twistZones      6.4598
		twistMagn       0.8352
	}

	Clouds
	{
		Height          76.2031
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.12123
		mainOctaves     10
		Coverage        0
		twistZones      6.4598
		twistMagn       0.8352
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          423.36
		Density         0
		Pressure        1
		Bright          10
		Opacity         0
		SkyLight        0
		Hue             0
		Saturation      1
	}

	Aurora
	{
		Height      2768.85
		NorthLat    83.9019
		NorthLon    153.585
		NorthRadius 31827.2
		NorthWidth  5988.9
		NorthRings  3
		NorthBright 10
		NorthParticles 5000
		SouthLat    -84.3898
		SouthLon    340.781
		SouthRadius 16751.8
		SouthWidth  2741.88
		SouthRings  2
		SouthBright 10
		SouthParticles 5000
		TopColor    (1.000 0.000 0.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	Corona
	{
		Radius      238932
		Period      0.00211502
		Brightness  0.25
		RayDensity  2.85571
		RayCurv     3.37563
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     334.434
		AscendingNode   17.5146
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Planet	"1"
{
	ParentBody     "RS 8476-1353-8-11843423-367"
	Class	       "Desert"

	Mass            0.0721689
	Radius          2727.76
	InertiaMoment   0.338925

	RotationPeriod  90.783
	Obliquity       2.08757
	EqAscendNode    -177.602

	AlbedoBond      0.333555
	AlbedoGeom      0.400265
	Brightness      2
	Color          (0.480 0.473 0.466)

	Surface
	{
		SurfStyle       0.300656
		OceanStyle      0.302747
		Randomize      (0.842, -0.523, 0.333)
		colorDistMagn   0.0419115
		colorDistFreq   369.225
		detailScale     7015.95
		colorConversion true
		seaLevel        0.172465
		snowLevel       2
		tropicLatitude  0.00150498
		icecapLatitude  10
		icecapHeight    0.186682
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.963708
		venusFreq       1.16967
		venusMagn       0.234946
		mareFreq        0.929604
		mareDensity     0.0312749
		terraceProb     0.395351
		erosion         0
		montesMagn      0.167337
		montesFreq      141.083
		montesSpiky     0.914975
		montesFraction  0.975919
		dunesMagn       0.0599222
		dunesFreq       22.8946
		dunesFraction   0.35268
		hillsMagn       0.131194
		hillsFreq       321.345
		hillsFraction   0
		hills2Fraction  0
		riversMagn      55.7557
		riversFreq      2.6185
		riversSin       4.52157
		riversOctaves   0
		canyonsMagn     0.0393008
		canyonsFreq     77.9458
		canyonFraction  0
		cracksMagn      0.0904883
		cracksFreq      0.217252
		cracksOctaves   0
		craterMagn      0.593062
		craterFreq      7.34163
		craterDensity   0.100183
		craterOctaves   1.24254
		volcanoMagn     0.641587
		volcanoFreq     3.52115
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.679524
		volcanoRadius   0.467133
		volcanoTemp     1465.39
		lavaCoverTidal  0.342379
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      2.45538
		twistMagn       0.282045
		cycloneMagn     2.44091
		cycloneFreq     0.292975
		cycloneDensity  0.00615919
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.620, 0.470, 0.000)
		colorBeach     (0.740, 0.730, 0.610, 0.000)
		colorDesert    (0.450, 0.420, 0.380, 0.000)
		colorLowland   (0.530, 0.480, 0.400, 0.000)
		colorUpland    (0.600, 0.540, 0.420, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.530, 0.480, 0.400, 0.000)
		colorUpPlants  (0.600, 0.540, 0.420, 0.000)
		BumpHeight      20
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
		Height          12.675
		BumpHeight      6.57437
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.89945
		mainOctaves     10
		Coverage        0.267109
		twistZones      2.45538
		twistMagn       0.282045
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          136.388
		Density         0.247085
		Pressure        0.355644
		Greenhouse      4.55748
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0334153
		Saturation      1

		Composition
		{
			CO2   	58.8923
			H2O   	38.8742
			SO2   	1.49573
			N2    	0.724051
			C2H2  	0.00936511
			H2S   	0.00117094
			C2H4  	0.00112237
			CO    	0.000613835
			C2H6  	0.000404567
			C3H8  	0.00034661
			Ar    	0.000339934
			Ne    	0.000298992
			NH3   	4.26323e-005
		}
	}

	Aurora
	{
		Height      75.7839
		NorthLat    66.9723
		NorthLon    -37.0988
		NorthRadius 758.5
		NorthWidth  584.767
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -66.6441
		SouthLon    128.636
		SouthRadius 690.064
		SouthWidth  720.207
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
		SemiMajorAxis   0.0155927
		Period          0.00776736
		Eccentricity    0.0977041
		Inclination     2.08757
		AscendingNode   -177.602
		ArgOfPericenter 213.248
		MeanAnomaly     275.909
	}
}

Planet	"2"
{
	ParentBody     "RS 8476-1353-8-11843423-367"
	Class	       "Desert"

	Mass            0.224411
	Radius          3911.13
	InertiaMoment   0.327297

	Obliquity       1.3894
	EqAscendNode    49.0172
	TidalLocked     true

	AlbedoBond      0.276457
	AlbedoGeom      0.331749
	Brightness      2
	Color          (0.588 0.433 0.332)

	Surface
	{
		SurfStyle       0.577794
		OceanStyle      0.286292
		Randomize      (0.936, 0.527, 0.363)
		colorDistMagn   0.0547288
		colorDistFreq   521.746
		detailScale     10059.6
		colorConversion true
		seaLevel        0.0797859
		snowLevel       2
		tropicLatitude  0.0441146
		icecapLatitude  10
		icecapHeight    0.139381
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.553755
		venusFreq       1.19244
		venusMagn       0.34956
		mareFreq        2.26677
		mareDensity     0.0722106
		terraceProb     0.314672
		erosion         0
		montesMagn      0.235453
		montesFreq      174.492
		montesSpiky     0.9094
		montesFraction  0.280219
		dunesMagn       0.0427777
		dunesFreq       37.4015
		dunesFraction   0.987009
		hillsMagn       0.123955
		hillsFreq       323.681
		hillsFraction   0
		hills2Fraction  0
		riversMagn      60.7174
		riversFreq      3.628
		riversSin       6.54812
		riversOctaves   0
		canyonsMagn     0.0230364
		canyonsFreq     96.1933
		canyonFraction  0
		cracksMagn      0.0865284
		cracksFreq      0.387835
		cracksOctaves   0
		craterMagn      0.678447
		craterFreq      12.6432
		craterDensity   0.296281
		craterOctaves   3.61719
		volcanoMagn     0.681133
		volcanoFreq     2.90767
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.540275
		volcanoRadius   0.313653
		volcanoTemp     1584.15
		lavaCoverTidal  0.0287342
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      1
		twistMagn       3.5
		cycloneMagn     1.13555
		cycloneDensity  0.353888
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.620, 0.470, 0.000)
		colorBeach     (0.740, 0.730, 0.610, 0.000)
		colorDesert    (0.450, 0.420, 0.380, 0.000)
		colorLowland   (0.530, 0.480, 0.400, 0.000)
		colorUpland    (0.600, 0.540, 0.420, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.530, 0.480, 0.400, 0.000)
		colorUpPlants  (0.600, 0.540, 0.420, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.20457
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          12.7976
		BumpHeight      5.1407
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.999528
		mainOctaves     10
		Coverage        0.152914
		twistZones      1
		twistMagn       3.5
	}

	Clouds
	{
		Height          15.5952
		BumpHeight      6.89283
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.999528
		mainOctaves     10
		Coverage        0.152914
		twistZones      1
		twistMagn       3.5
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          161.651
		Density         0.079543
		Pressure        0.11795
		Greenhouse      12.0125
		Bright          9.55258
		Opacity         1
		SkyLight        3.18419
		Hue             0.00253055
		Saturation      1

		Composition
		{
			H2O   	76.0896
			CO2   	17.258
			SO2   	4.86386
			NH3   	0.641854
			H2S   	0.605306
			N2    	0.271884
			CH4   	0.136297
			C2H6  	0.0599027
			C2H2  	0.0561178
			C3H8  	0.0124227
			C2H4  	0.00386842
			CO    	0.000517181
			Ar    	0.000309832
		}
	}

	Aurora
	{
		Height      123.245
		NorthLat    59.4127
		NorthLon    -120.758
		NorthRadius 668.554
		NorthWidth  594.257
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -62.1477
		SouthLon    70.8064
		SouthRadius 1102.36
		SouthWidth  1006.13
		SouthRings  3
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
		SemiMajorAxis   0.026334
		Period          0.0170476
		Eccentricity    0.0211952
		Inclination     1.3894
		AscendingNode   49.0172
		ArgOfPericenter 321.267
		MeanAnomaly     292.354
	}
}

DwarfMoon	"2.D1"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            2.56049e-009
	Radius          12.9764
	InertiaMoment   0.397654

	Oblateness      0.0433259

	Obliquity       -43.2014
	EqAscendNode    -77.5149
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.535 0.455 0.420)

	Surface
	{
		SurfStyle       0.646742
		OceanStyle      0.280713
		Randomize      (0.061, -0.260, 0.844)
		colorDistMagn   0.64018
		colorDistFreq   0.145091
		detailScale     354.342
		colorConversion true
		snowLevel       2
		tropicLatitude  0.9028
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.37429
		terraceProb     0.467436
		erosion         0
		montesMagn      0.590347
		montesFreq      2.8189
		montesSpiky     0.869318
		montesFraction  0.804485
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.384952
		hillsFraction   0.594254
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256263
		craterFreq      0.214182
		craterDensity   0.838694
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   40.2066
		volcanoTemp     1158.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.155, 0.118, 0.000)
		colorShelf     (0.214, 0.159, 0.134, 0.000)
		colorBeach     (0.251, 0.187, 0.160, 0.000)
		colorDesert    (0.273, 0.200, 0.155, 0.000)
		colorLowland   (0.300, 0.214, 0.176, 0.000)
		colorUpland    (0.332, 0.260, 0.214, 0.000)
		colorRock      (0.358, 0.282, 0.231, 0.000)
		colorSnow      (0.390, 0.301, 0.244, 1.000)
		BumpHeight      11.6787
		BumpOffset      2.33575
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.000117649
		Period          0.0015579
		Eccentricity    0.486216
		Inclination     -43.2014
		AscendingNode   -77.5149
		ArgOfPericenter -154.439
		MeanAnomaly     47.647
	}
}

Planet	"3"
{
	ParentBody     "RS 8476-1353-8-11843423-367"
	Class	       "Desert"

	Mass            0.686076
	Radius          6285.24
	InertiaMoment   0.328952

	Obliquity       0.232132
	EqAscendNode    13.8615
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.554 0.549 0.547)

	Surface
	{
		SurfStyle       0.16301
		OceanStyle      0.818825
		Randomize      (-0.503, 0.395, -0.915)
		colorDistMagn   0.0888454
		colorDistFreq   724.063
		detailScale     16166
		colorConversion true
		seaLevel        0.0509603
		snowLevel       2
		tropicLatitude  0.00804547
		icecapLatitude  10
		icecapHeight    0.16812
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597002
		venusFreq       0.677793
		venusMagn       0
		mareFreq        1.40224
		mareDensity     0.103233
		terraceProb     0.434858
		erosion         0
		montesMagn      0.202773
		montesFreq      225.286
		montesSpiky     0.852028
		montesFraction  0.355915
		dunesMagn       0.0346039
		dunesFreq       58.1202
		dunesFraction   0.822681
		hillsMagn       0.14731
		hillsFreq       719.462
		hillsFraction   0
		hills2Fraction  0
		riversMagn      55.3761
		riversFreq      3.86703
		riversSin       7.18197
		riversOctaves   0
		canyonsMagn     0.0356815
		canyonsFreq     149.268
		canyonFraction  0
		cracksMagn      0.100039
		cracksFreq      0.66754
		cracksOctaves   0
		craterMagn      0.581359
		craterFreq      18.403
		craterDensity   0.441236
		craterOctaves   6.50012
		volcanoMagn     0.737457
		volcanoFreq     4.81636
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.497573
		volcanoRadius   0.477507
		volcanoTemp     1651.28
		lavaCoverTidal  0.126188
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
		Hapke           0.730494
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
		Height          58.2135
		Density         0.0269506
		Pressure        0.0203137
		Greenhouse      0.883773
		Bright          7.69332
		Opacity         1
		SkyLight        2.56444
		Hue             0.0122289
		Saturation      1

		Composition
		{
			CO2   	73.5747
			H2O   	18.5964
			SO2   	4.19923
			H2S   	2.21879
			CH4   	0.805788
			C2H2  	0.345179
			C2H6  	0.128972
			NH3   	0.0894012
			N2    	0.0216247
			C2H4  	0.0167755
			C3H8  	0.00216556
			CO    	0.0007744
			Ne    	6.98064e-005
			He    	6.82549e-005
			Ar    	5.04635e-005
		}
	}

	Aurora
	{
		Height      43.8722
		NorthLat    46.9356
		NorthLon    11.1833
		NorthRadius 1654.71
		NorthWidth  1616.82
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -52.8536
		SouthLon    187.04
		SouthRadius 1937.57
		SouthWidth  1368.52
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
		SemiMajorAxis   0.040871
		Period          0.0329616
		Eccentricity    0.0769096
		Inclination     0.232132
		AscendingNode   13.8615
		ArgOfPericenter 314.413
		MeanAnomaly     159.309
	}
}

Moon	"3.1"
{
	ParentBody     "3"
	Class	       "Desert"

	Mass            0.00520382
	Radius          1158.74
	InertiaMoment   0.391304

	Oblateness      0.0193162

	Obliquity       0.851873
	EqAscendNode    -157.076
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.688 0.685 0.682)

	Surface
	{
		SurfStyle       0.45272
		OceanStyle      0.150544
		Randomize      (0.294, -0.428, 0.113)
		colorDistMagn   0.0581703
		colorDistFreq   127.959
		detailScale     2980.34
		colorConversion true
		seaLevel        0.102979
		snowLevel       2
		tropicLatitude  0.00590999
		icecapLatitude  10
		icecapHeight    0.143196
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.923583
		venusFreq       1.42815
		venusMagn       0
		mareFreq        0.503288
		mareDensity     0.00505403
		terraceProb     0.226385
		erosion         0
		montesMagn      0.0581046
		montesFreq      49.5013
		montesSpiky     0.975052
		montesFraction  0.93648
		dunesMagn       0.0503836
		dunesFreq       8.80191
		dunesFraction   0.763725
		hillsMagn       0.119507
		hillsFreq       105.524
		hillsFraction   0
		hills2Fraction  0
		riversMagn      59.1986
		riversFreq      2.39572
		riversSin       5.0315
		riversOctaves   0
		canyonsMagn     0.0625808
		canyonsFreq     24.9329
		canyonFraction  0
		cracksMagn      0.0930994
		cracksFreq      0.124999
		cracksOctaves   0
		craterMagn      0.620655
		craterFreq      3.38628
		craterDensity   0.457898
		craterOctaves   5.36432
		volcanoMagn     0.219015
		volcanoFreq     2.99792
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.449844
		volcanoRadius   0.629171
		volcanoTemp     1360.99
		lavaCoverTidal  0.505477
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.620, 0.470, 0.000)
		colorBeach     (0.740, 0.730, 0.610, 0.000)
		colorDesert    (0.450, 0.420, 0.380, 0.000)
		colorLowland   (0.530, 0.480, 0.400, 0.000)
		colorUpland    (0.600, 0.540, 0.420, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.530, 0.480, 0.400, 0.000)
		colorUpPlants  (0.600, 0.540, 0.420, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.985626
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          57.9369
		Density         0.00143739
		Pressure        0.00111571
		Greenhouse      0.158787
		Bright          4.2807
		Opacity         1
		SkyLight        1.4269
		Hue             -0.00218705
		Saturation      1

		Composition
		{
			SO2   	99.9992
			Kr    	0.000690066
			Xe    	0.000112519
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000156718
		Period          0.00136468
		Eccentricity    0.0458629
		Inclination     0.851873
		AscendingNode   -157.076
		ArgOfPericenter -77.3158
		MeanAnomaly     -104.178
	}
}

DwarfMoon	"3.D1"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            6.95644e-008
	Radius          33.018
	InertiaMoment   0.398239

	Oblateness      0.00862019

	RotationPeriod  23.8665
	Obliquity       6.21701
	EqAscendNode    30.8813

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.587 0.583 0.577)

	Surface
	{
		SurfStyle       0.904001
		OceanStyle      0.162046
		Randomize      (-0.205, 0.188, 0.717)
		colorDistMagn   0.213256
		colorDistFreq   0.552286
		detailScale     901.612
		colorConversion true
		snowLevel       2
		tropicLatitude  0.207631
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.650592
		terraceProb     0.52558
		erosion         0
		montesMagn      0.54572
		montesFreq      3.13461
		montesSpiky     0.944657
		montesFraction  0.719138
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.86879
		hillsFraction   0.638523
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251208
		craterFreq      0.179713
		craterDensity   0.825045
		craterOctaves   13
		volcanoActivity 0.650222
		volcanoFlows    0
		volcanoRadius   19.6274
		volcanoTemp     1553.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.204, 0.231, 0.050)
		colorShelf     (0.235, 0.239, 0.266, 0.040)
		colorBeach     (0.270, 0.274, 0.300, 0.030)
		colorDesert    (0.305, 0.309, 0.341, 0.020)
		colorLowland   (0.341, 0.344, 0.375, 0.030)
		colorUpland    (0.376, 0.379, 0.410, 0.050)
		colorRock      (0.411, 0.414, 0.456, 0.020)
		colorSnow      (0.411, 0.414, 0.456, 1.000)
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
		SemiMajorAxis   0.000189064
		Period          0.00181512
		Eccentricity    0.32411
		Inclination     6.21701
		AscendingNode   30.8813
		ArgOfPericenter 4.23034
		MeanAnomaly     -113.961
	}
}

Planet	"4"
{
	ParentBody     "RS 8476-1353-8-11843423-367"
	Class	       "Desert"

	Mass            2.09707
	Radius          7682.76
	InertiaMoment   0.33006

	Obliquity       0.222651
	EqAscendNode    1.49447
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.684 0.612 0.579)

	Surface
	{
		SurfStyle       0.871994
		OceanStyle      0.918968
		Randomize      (0.681, 0.290, -0.933)
		colorDistMagn   0.0460149
		colorDistFreq   903.722
		detailScale     19760.5
		colorConversion true
		seaLevel        0.0453618
		snowLevel       2
		tropicLatitude  0.0077742
		icecapLatitude  0.947815
		icecapHeight    0.0471502
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.23398
		venusFreq       0.753461
		venusMagn       0.372567
		mareFreq        1.01679
		mareDensity     0.200829
		terraceProb     0.324455
		erosion         0
		montesMagn      0.17704
		montesFreq      267.451
		montesSpiky     0.982478
		montesFraction  0.897397
		dunesMagn       0.0328397
		dunesFreq       66.2054
		dunesFraction   0.983489
		hillsMagn       0.109315
		hillsFreq       862.628
		hillsFraction   0
		hills2Fraction  0
		riversMagn      61.259
		riversFreq      4.20894
		riversSin       5.88492
		riversOctaves   0
		canyonsMagn     0.0163731
		canyonsFreq     195.321
		canyonFraction  0
		cracksMagn      0.0914813
		cracksFreq      0.75665
		cracksOctaves   0
		craterMagn      0.824498
		craterFreq      16.1179
		craterDensity   0.526947
		craterOctaves   9.42881
		volcanoMagn     0.672344
		volcanoFreq     1.85688
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 1.4343
		volcanoFlows    0.517351
		volcanoRadius   0.337066
		volcanoTemp     1504.66
		lavaCoverTidal  0
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
		BumpHeight      16.6359
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.862794
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          16.4187
		Density         0.0137206
		Pressure        0.00666993
		Greenhouse      0.403515
		Bright          6.72163
		Opacity         1
		SkyLight        2.24054
		Hue             0.0259346
		Saturation      1

		Composition
		{
			CO2   	96.8858
			H2O   	1.33682
			SO2   	0.775777
			NH3   	0.49016
			N2    	0.263816
			H2    	0.0916141
			C2H2  	0.0637552
			CH4   	0.050489
			C3H8  	0.0166009
			H2S   	0.0132716
			C2H6  	0.00719077
			C2H4  	0.00381866
			CO    	0.000633255
			Ar    	0.000174577
			He    	2.42067e-005
		}
	}

	Aurora
	{
		Height      63.4988
		NorthLat    79.0385
		NorthLon    -140.739
		NorthRadius 749.327
		NorthWidth  794.552
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -88.4345
		SouthLon    -2.39547
		SouthRadius 1363.65
		SouthWidth  1584.57
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
		SemiMajorAxis   0.0746762
		Period          0.0814036
		Eccentricity    0.00569116
		Inclination     0.222651
		AscendingNode   1.49447
		ArgOfPericenter 239.001
		MeanAnomaly     34.0777
	}
}

DwarfMoon	"4.D1"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.73213e-006
	Radius          93.8444
	InertiaMoment   0.397234

	Obliquity       55.6354
	EqAscendNode    139.278
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.619 0.617 0.613)

	Surface
	{
		SurfStyle       0.377875
		OceanStyle      0.640993
		Randomize      (0.271, -0.543, -0.367)
		colorDistMagn   0.661357
		colorDistFreq   5.18541
		detailScale     2562.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.550217
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.520804
		terraceProb     0.205368
		erosion         0
		montesMagn      0.503482
		montesFreq      2.91596
		montesSpiky     0.987828
		montesFraction  0.345458
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.981
		hillsFraction   0.624452
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242929
		craterFreq      0.253683
		craterDensity   0.930532
		craterOctaves   15
		volcanoActivity 0.526844
		volcanoFlows    0
		volcanoRadius   11.1795
		volcanoTemp     877.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.247, 0.245, 0.000)
		colorShelf     (0.263, 0.262, 0.260, 0.000)
		colorBeach     (0.279, 0.278, 0.276, 0.000)
		colorDesert    (0.294, 0.293, 0.291, 0.000)
		colorLowland   (0.310, 0.308, 0.306, 0.000)
		colorUpland    (0.325, 0.324, 0.322, 0.000)
		colorRock      (0.341, 0.339, 0.337, 0.000)
		colorSnow      (0.356, 0.355, 0.352, 1.000)
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
		SemiMajorAxis   0.000477572
		Period          0.00416803
		Eccentricity    0.162005
		Inclination     55.6354
		AscendingNode   139.278
		ArgOfPericenter 162.9
		MeanAnomaly     84.4302
	}
}

DwarfMoon	"4.D2"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            2.57994e-006
	Radius          187.728
	InertiaMoment   0.398703

	Oblateness      0.00498906

	Obliquity       72.2042
	EqAscendNode    -170.584
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.503 0.494 0.488)

	Surface
	{
		SurfStyle       0.582264
		OceanStyle      0.780821
		Randomize      (0.183, 0.401, 0.488)
		colorDistMagn   0.442978
		colorDistFreq   27.1769
		detailScale     5126.23
		colorConversion true
		snowLevel       2
		tropicLatitude  0.155825
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.454469
		terraceProb     0.259574
		erosion         0
		montesMagn      0.467103
		montesFreq      3.41348
		montesSpiky     0.919343
		montesFraction  0.886889
		dunesFraction   0
		hillsMagn       0
		hillsFreq       75.0044
		hillsFraction   0.604642
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253399
		craterFreq      1.35534
		craterDensity   0.925288
		craterOctaves   16
		volcanoActivity 0.6518
		volcanoFlows    0
		volcanoRadius   18.3244
		volcanoTemp     1558.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.168, 0.137, 0.000)
		colorShelf     (0.201, 0.173, 0.156, 0.000)
		colorBeach     (0.236, 0.203, 0.186, 0.000)
		colorDesert    (0.256, 0.217, 0.181, 0.000)
		colorLowland   (0.281, 0.232, 0.205, 0.000)
		colorUpland    (0.312, 0.282, 0.249, 0.000)
		colorRock      (0.337, 0.306, 0.268, 0.000)
		colorSnow      (0.367, 0.326, 0.283, 1.000)
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
		SemiMajorAxis   0.000964417
		Period          0.0119611
		Eccentricity    0.447219
		Inclination     72.2042
		AscendingNode   -170.584
		ArgOfPericenter 164.544
		MeanAnomaly     30.2056
	}
}

DwarfMoon	"4.D3"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            3.92938e-006
	Radius          107.458
	InertiaMoment   0.399664

	RotationPeriod  104.887
	Obliquity       -0.68028
	EqAscendNode    -8.48253

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.516 0.413 0.372)

	Surface
	{
		SurfStyle       0.410532
		OceanStyle      0.199523
		Randomize      (0.798, 0.742, 0.322)
		colorDistMagn   0.876595
		colorDistFreq   4.65068
		detailScale     2934.33
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0236787
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584699
		terraceProb     0.537101
		erosion         0
		montesMagn      0.427128
		montesFreq      3.06772
		montesSpiky     0.861536
		montesFraction  0.731476
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.7102
		hillsFraction   0.642984
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270555
		craterFreq      0.366916
		craterDensity   0.753571
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   8.49931
		volcanoTemp     1573.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.165, 0.149, 0.000)
		colorShelf     (0.219, 0.176, 0.158, 0.000)
		colorBeach     (0.232, 0.186, 0.167, 0.000)
		colorDesert    (0.245, 0.196, 0.177, 0.000)
		colorLowland   (0.258, 0.207, 0.186, 0.000)
		colorUpland    (0.271, 0.217, 0.195, 0.000)
		colorRock      (0.284, 0.227, 0.205, 0.000)
		colorSnow      (0.296, 0.238, 0.214, 1.000)
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
		SemiMajorAxis   0.00126406
		Period          0.0179482
		Eccentricity    0.266592
		Inclination     -0.68028
		AscendingNode   -8.48253
		ArgOfPericenter -3.72665
		MeanAnomaly     -99.2647
	}
}

DwarfPlanet	"5"
{
	ParentBody     "RS 8476-1353-8-11843423-367"
	Class	       "Desert"

	Mass            0.00739603
	Radius          1601.4
	InertiaMoment   0.383969

	Obliquity       -1.60469
	EqAscendNode    -139.897
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.589 0.455 0.380)

	Surface
	{
		SurfStyle       0.709808
		OceanStyle      0.771473
		Randomize      (0.109, -0.700, 0.790)
		colorDistMagn   0.0539539
		colorDistFreq   244.204
		detailScale     4118.89
		colorConversion true
		seaLevel        0.0858545
		snowLevel       2
		tropicLatitude  0.019201
		icecapLatitude  0.843608
		icecapHeight    0.094639
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.758571
		venusFreq       0.567944
		venusMagn       0.278296
		mareFreq        0.608653
		mareDensity     0.00281989
		terraceProb     0.131994
		erosion         0
		montesMagn      0.0742608
		montesFreq      50.8266
		montesSpiky     0.912836
		montesFraction  0.686719
		dunesMagn       0.0469607
		dunesFreq       11.9729
		dunesFraction   0.975868
		hillsMagn       0.128023
		hillsFreq       203.603
		hillsFraction   0
		hills2Fraction  0
		riversMagn      53.8635
		riversFreq      1.60094
		riversSin       4.59556
		riversOctaves   0
		canyonsMagn     0.058229
		canyonsFreq     38.196
		canyonFraction  0
		cracksMagn      0.13023
		cracksFreq      0.0868475
		cracksOctaves   0
		craterMagn      0.577934
		craterFreq      3.14913
		craterDensity   0.319573
		craterOctaves   4.81334
		volcanoMagn     0.225216
		volcanoFreq     0.795599
		volcanoDensity  0.0537278
		volcanoOctaves  1
		volcanoActivity 0
		volcanoFlows    0.372594
		volcanoRadius   0.580685
		volcanoTemp     1577.18
		lavaCoverTidal  0
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
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          80.07
		Density         0.130371
		Pressure        0.048671
		Greenhouse      0.245323
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0435842
		Saturation      1

		Composition
		{
			CO2   	92.5192
			SO2   	7.40884
			C3H8  	0.0440885
			H2S   	0.0276738
			Ar    	0.000166821
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.117406
		Period          0.160483
		Eccentricity    0.0170075
		Inclination     -1.06611
		AscendingNode   -140.933
		ArgOfPericenter 350.871
		MeanAnomaly     45.0467
	}
}

Planet	"6"
{
	ParentBody     "RS 8476-1353-8-11843423-367"
	Class	       "IceWorld"

	Mass            0.0250965
	Radius          2538.5
	InertiaMoment   0.361057

	Obliquity       0.0681527
	EqAscendNode    -139.538
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.406 0.403 0.398)

	Surface
	{
		SurfStyle       0.10553
		OceanStyle      0.32522
		Randomize      (0.594, -0.326, 0.176)
		colorDistMagn   0.0542149
		colorDistFreq   335.159
		detailScale     6529.15
		colorConversion true
		drivenDarkening 0
		seaLevel        0.215247
		snowLevel       2
		tropicLatitude  0.000845728
		icecapLatitude  0.430819
		icecapHeight    0.248226
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.65624
		venusFreq       1.0992
		venusMagn       0.247911
		mareFreq        1.6702
		mareDensity     0.00450716
		terraceProb     0.148208
		erosion         0
		montesMagn      0.143885
		montesFreq      115.476
		montesSpiky     0.990918
		montesFraction  0.669003
		dunesMagn       0.0338532
		dunesFreq       3317.94
		dunesFraction   0.889506
		hillsMagn       0.125385
		hillsFreq       335.758
		hillsFraction   0.409029
		hills2Fraction  0.199461
		riversMagn      56.2001
		riversFreq      3.11572
		riversSin       5.57537
		riversOctaves   0
		canyonsMagn     0.364743
		canyonsFreq     0.658264
		canyonFraction  0
		cracksMagn      0.0511545
		cracksFreq      1.16603
		cracksOctaves   2
		craterMagn      0.615352
		craterFreq      6.90334
		craterDensity   0.669893
		craterOctaves   9.66314
		craterRayedFactor 0
		volcanoMagn     0.59734
		volcanoFreq     0.961408
		volcanoDensity  0.0505085
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.290438
		volcanoRadius   0.603842
		volcanoTemp     1551.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.406, 0.403, 0.398, 0.500)
		colorShelf     (0.386, 0.383, 0.378, 0.500)
		colorBeach     (0.284, 0.282, 0.279, 0.750)
		colorDesert    (0.345, 0.343, 0.339, 1.000)
		colorLowland   (0.358, 0.355, 0.350, 1.000)
		colorUpland    (0.378, 0.375, 0.370, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.358, 0.355, 0.350, 1.000)
		colorUpPlants  (0.378, 0.375, 0.370, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.881292
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          94.2863
		Density         0.0118709
		Pressure        0.00383897
		Greenhouse      0.210178
		Bright          6.52975
		Opacity         1
		SkyLight        2.17658
		Hue             0
		Saturation      0.958417

		Composition
		{
			CO2   	94.0305
			CH4   	4.40932
			C2H6  	0.900875
			H2S   	0.250573
			NH3   	0.15338
			C2H2  	0.153228
			N2    	0.0587842
			C2H4  	0.0315473
			C3H8  	0.00393812
			Ar    	0.00278306
			SO2   	0.00233621
			CO    	0.00206669
			Ne    	0.000592366
			Kr    	5.03064e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.195277
		Period          0.344246
		Eccentricity    0.0991597
		Inclination     0.0681527
		AscendingNode   -139.538
		ArgOfPericenter 199.507
		MeanAnomaly     59.866
	}
}

DwarfMoon	"6.D1"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.35709e-008
	Radius          31.2056
	InertiaMoment   0.396638

	Oblateness      0.249

	Obliquity       0.00407817
	EqAscendNode    -51.0557
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.674 0.671 0.667)

	Surface
	{
		SurfStyle       0.94165
		OceanStyle      0.713506
		Randomize      (0.055, 0.619, -0.894)
		colorDistMagn   0.900968
		colorDistFreq   0.822557
		detailScale     852.122
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.259831
		terraceProb     0.245817
		erosion         0
		montesMagn      0.548804
		montesFreq      3.59253
		montesSpiky     0.898621
		montesFraction  0.418555
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.10177
		hillsFraction   0.586318
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220012
		craterFreq      0.229717
		craterDensity   0.974556
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.9985
		volcanoTemp     1456.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.235, 0.267, 0.050)
		colorShelf     (0.270, 0.275, 0.307, 0.040)
		colorBeach     (0.310, 0.316, 0.347, 0.030)
		colorDesert    (0.350, 0.356, 0.394, 0.020)
		colorLowland   (0.391, 0.396, 0.434, 0.030)
		colorUpland    (0.431, 0.436, 0.474, 0.050)
		colorRock      (0.472, 0.477, 0.527, 0.020)
		colorSnow      (0.472, 0.477, 0.527, 1.000)
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
		SemiMajorAxis   3.7169e-005
		Period          0.000827264
		Eccentricity    3.85629e-005
		Inclination     0.00407817
		AscendingNode   -51.0557
		ArgOfPericenter 136.566
		MeanAnomaly     63.2111
	}
}

DwarfMoon	"6.D2"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.84556e-008
	Radius          40.3953
	InertiaMoment   0.398465

	RotationPeriod  532.938
	Obliquity       26.6251
	EqAscendNode    -34.9965

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.744 0.741 0.739)

	Surface
	{
		SurfStyle       0.737019
		OceanStyle      0.0749035
		Randomize      (0.860, 0.390, -0.718)
		colorDistMagn   0.580709
		colorDistFreq   0.673352
		detailScale     1103.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.772811
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.262593
		terraceProb     0.5981
		erosion         0
		montesMagn      0.651928
		montesFreq      3.64365
		montesSpiky     0.949888
		montesFraction  0.711969
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.67337
		hillsFraction   0.825458
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228553
		craterFreq      0.213375
		craterDensity   0.895403
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.62
		volcanoTemp     1332.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.252, 0.207, 0.000)
		colorShelf     (0.297, 0.259, 0.237, 0.000)
		colorBeach     (0.350, 0.304, 0.281, 0.000)
		colorDesert    (0.379, 0.326, 0.273, 0.000)
		colorLowland   (0.416, 0.348, 0.310, 0.000)
		colorUpland    (0.461, 0.423, 0.377, 0.000)
		colorRock      (0.498, 0.460, 0.407, 0.000)
		colorSnow      (0.543, 0.489, 0.429, 1.000)
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
		SemiMajorAxis   0.000258802
		Period          0.0151993
		Eccentricity    0.389341
		Inclination     26.6251
		AscendingNode   -34.9965
		ArgOfPericenter 102.484
		MeanAnomaly     -158.093
	}
}

