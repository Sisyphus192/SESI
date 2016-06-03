Star	"WISE 08551-07144"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Y V"
	Luminosity      9.27308e-014
	MassSol         0.00665175
	RadSol          0.0889689
	Teff            248

	Age             12.2435

	InertiaMoment   0.290968

	Oblateness      0.0230811

	RotationPeriod  5.43993
	Obliquity       157.258
	EqAscendNode    131.771

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.000 0.003)

	Surface
	{
		SurfStyle       0.826133
		Randomize      (0.822, -0.978, -0.800)
		colorDistMagn   0.386226
		colorDistFreq   12.4904
		detailScale     159268
		colorConversion true
		tropicLatitude  0.8
		icecapLatitude  1.2
		mainFreq        0.0296601
		venusFreq       6.54858
		venusMagn       0.245552
		mareFreq        0
		mareDensity     0
		erosion         0
		montesFreq      0
		dunesMagn       5
		hillsMagn       0.03
		hillsFreq       0
		craterOctaves   0
		twistZones      7.00445
		twistMagn       1.14981
		cycloneMagn     11.1113
		cycloneFreq     0.394212
		cycloneDensity  0.0913913
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
		BumpHeight      61.9223
		BumpOffset      61.9223
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          37.1523
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.848343
		mainOctaves     10
		Coverage        1
		twistZones      7.00445
		twistMagn       1.14981
	}

	Clouds
	{
		Height          74.3086
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.848343
		mainOctaves     10
		Coverage        1
		twistZones      7.00445
		twistMagn       1.14981
	}

	Clouds
	{
		Height          111.461
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.848343
		mainOctaves     10
		Coverage        1
		twistZones      7.00445
		twistMagn       1.14981
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Thick"
		Height          619.223
		Density         0
		Pressure        1
		Bright          10
		Opacity         0.7
		SkyLight        0
		Hue             -0.0189
		Saturation      1
	}

	Aurora
	{
		Height      4477.44
		NorthLat    85.2187
		NorthLon    26.1978
		NorthRadius 37226
		NorthWidth  7075.86
		NorthRings  5
		NorthBright 10
		NorthParticles 5000
		SouthLat    -85.4908
		SouthLon    204.42
		SouthRadius 26287.2
		SouthWidth  2818.09
		SouthRings  4
		SouthBright 10
		SouthParticles 5000
		TopColor    (1.000 0.000 0.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	Corona
	{
		Radius      329780
		Period      0.00186706
		Brightness  0.25
		RayDensity  0.657017
		RayCurv     19.2291
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     157.258
		AscendingNode   131.771
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Planet	"1"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Selena"

	Mass            0.0587407
	Radius          2905.28
	InertiaMoment   0.340439

	RotationPeriod  423.605
	Obliquity       1.78577
	EqAscendNode    -130.394

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.032 0.000 0.000)

	Surface
	{
		SurfStyle       0.913298
		OceanStyle      0.223086
		Randomize      (0.942, 0.669, -0.102)
		colorDistMagn   0.0918763
		colorDistFreq   337.725
		detailScale     7472.54
		colorConversion true
		drivenDarkening 0
		seaLevel        0.181171
		snowLevel       2
		tropicLatitude  0.0261425
		icecapLatitude  10
		icecapHeight    0.153111
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.90891
		venusFreq       1.04802
		venusMagn       0
		mareFreq        1.57026
		mareDensity     0.0100803
		terraceProb     0.288943
		erosion         0
		montesMagn      0.158113
		montesFreq      132.797
		montesSpiky     0.968259
		montesFraction  0.955047
		dunesMagn       0.0415427
		dunesFreq       3805.09
		dunesFraction   0.299176
		hillsMagn       0.119548
		hillsFreq       339.645
		hillsFraction   0.877949
		hills2Fraction  0
		riversMagn      53.4252
		riversFreq      4.41155
		riversSin       5.43659
		riversOctaves   0
		canyonsMagn     0.489328
		canyonsFreq     0.645452
		canyonFraction  0.624497
		cracksMagn      0.0366817
		cracksFreq      0.875367
		cracksOctaves   0
		craterMagn      0.531193
		craterFreq      6.7097
		craterDensity   0.0823994
		craterOctaves   1.2
		craterRayedFactor 0
		volcanoMagn     0.682653
		volcanoFreq     3.99639
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 1.91268
		volcanoFlows    0.404227
		volcanoRadius   0.704333
		volcanoTemp     1899.33
		lavaCoverTidal  0
		lavaCoverSun    3.67866
		lavaCoverYoung  0
		colorSea       (0.440, 0.450, 0.370, 0.000)
		colorShelf     (0.580, 0.550, 0.430, 0.000)
		colorBeach     (0.371, 0.339, 0.295, 0.000)
		colorDesert    (0.434, 0.395, 0.325, 0.000)
		colorLowland   (0.345, 0.298, 0.244, 0.000)
		colorUpland    (0.308, 0.267, 0.229, 0.000)
		colorRock      (0.330, 0.250, 0.230, 0.000)
		colorSnow      (0.940, 0.910, 0.870, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0157183
		Period          0.024162
		Eccentricity    0.0566333
		Inclination     1.78577
		AscendingNode   -130.394
		ArgOfPericenter 133.668
		MeanAnomaly     87.425
	}
}

Planet	"2"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Selena"

	Mass            0.124944
	Radius          3698.82
	InertiaMoment   0.330737

	Obliquity       -2.39568
	EqAscendNode    -46.9931
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.498 0.496 0.493)

	Surface
	{
		SurfStyle       0.74963
		OceanStyle      0.471428
		Randomize      (0.888, 0.131, 0.866)
		colorDistMagn   0.0771022
		colorDistFreq   526.691
		detailScale     9513.58
		colorConversion true
		drivenDarkening 0
		seaLevel        0.23956
		snowLevel       2
		tropicLatitude  0.0766124
		icecapLatitude  10
		icecapHeight    0.190086
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.68961
		venusFreq       0.544247
		venusMagn       0
		mareFreq        1.66678
		mareDensity     0.0256515
		terraceProb     0.12027
		erosion         0
		montesMagn      0.153364
		montesFreq      159.575
		montesSpiky     0.953119
		montesFraction  0.401697
		dunesMagn       0.0487097
		dunesFreq       4870.92
		dunesFraction   0.044321
		hillsMagn       0.126531
		hillsFreq       366.596
		hillsFraction   0.655365
		hills2Fraction  0
		riversMagn      59.8844
		riversFreq      1.03031
		riversSin       4.18007
		riversOctaves   0
		canyonsMagn     0.6399
		canyonsFreq     1.04281
		canyonFraction  0.758828
		cracksMagn      0.0652841
		cracksFreq      2.45097
		cracksOctaves   0
		craterMagn      0.585764
		craterFreq      11.2866
		craterDensity   0.0832816
		craterOctaves   1.2
		craterRayedFactor 0
		volcanoMagn     0.642197
		volcanoFreq     1.28498
		volcanoDensity  0.320781
		volcanoOctaves  1
		volcanoActivity 0.945761
		volcanoFlows    0.271839
		volcanoRadius   0.527047
		volcanoTemp     1485.31
		lavaCoverTidal  0
		lavaCoverSun    1.46352
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.314, 0.303, 0.236, 0.000)
		colorDesert    (0.334, 0.308, 0.241, 0.000)
		colorLowland   (0.274, 0.228, 0.192, 0.000)
		colorUpland    (0.388, 0.352, 0.256, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999985
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
		Height          184.941
		Density         1.49477e-006
		Pressure        2.2975e-006
		Greenhouse      0.0264914
		Bright          1.08371
		Opacity         0
		SkyLight        0.361238
		Hue             -0.0436213
		Saturation      1

		Composition
		{
			SO2   	100
			Cl2   	1.99322e-005
			Kr    	1.0863e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0288937
		Period          0.0602178
		Eccentricity    0.0263074
		Inclination     -2.39568
		AscendingNode   -46.9931
		ArgOfPericenter 356.039
		MeanAnomaly     65.8652
	}
}

DwarfMoon	"2.D1"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            1.06095e-010
	Radius          6.50658
	InertiaMoment   0.397179

	Oblateness      0.212598

	Obliquity       0.00748849
	EqAscendNode    171.267
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.639 0.634 0.630)

	Surface
	{
		SurfStyle       0.415959
		OceanStyle      0.777523
		Randomize      (0.365, 0.117, -0.611)
		colorDistMagn   0.612757
		colorDistFreq   0.0106085
		detailScale     177.673
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.569153
		terraceProb     0.127709
		erosion         0
		montesMagn      0.659521
		montesFreq      4.26116
		montesSpiky     0.945248
		montesFraction  0.229089
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.096356
		hillsFraction   0.619327
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205093
		craterFreq      0.206645
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   99.0401
		volcanoTemp     1397.06
		lavaCoverTidal  0
		lavaCoverSun    1.46352
		lavaCoverYoung  0
		colorSea       (0.256, 0.253, 0.252, 0.000)
		colorShelf     (0.272, 0.269, 0.268, 0.000)
		colorBeach     (0.288, 0.285, 0.284, 0.000)
		colorDesert    (0.304, 0.301, 0.299, 0.000)
		colorLowland   (0.320, 0.317, 0.315, 0.000)
		colorUpland    (0.336, 0.333, 0.331, 0.000)
		colorRock      (0.352, 0.348, 0.347, 0.000)
		colorSnow      (0.368, 0.364, 0.362, 1.000)
		BumpHeight      5.85593
		BumpOffset      1.17119
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   8.2482e-005
		Period          0.00122563
		Eccentricity    1.41547e-005
		Inclination     0.00748849
		AscendingNode   171.267
		ArgOfPericenter 116.295
		MeanAnomaly     -56.0988
	}
}

DwarfMoon	"2.D2"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            5.08896e-005
	Radius          250.134
	InertiaMoment   0.399098

	Oblateness      0.0209146

	Obliquity       -0.895733
	EqAscendNode    99.1593
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.842 0.799 0.740)

	Surface
	{
		SurfStyle       0.138307
		OceanStyle      0.446006
		Randomize      (-0.956, 0.936, -0.087)
		colorDistMagn   0.0755975
		colorDistFreq   32.4343
		detailScale     6830.31
		colorConversion true
		snowLevel       2
		tropicLatitude  0.02027
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.604353
		terraceProb     0.438896
		erosion         0
		montesMagn      0.425501
		montesFreq      3.06779
		montesSpiky     0.893688
		montesFraction  0.626616
		dunesFraction   0
		hillsMagn       0
		hillsFreq       204.191
		hillsFraction   0.667606
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248822
		craterFreq      1.79094
		craterDensity   0
		craterOctaves   0
		volcanoActivity 1.53725
		volcanoFlows    0
		volcanoRadius   5.49748
		volcanoTemp     1453.97
		lavaCoverTidal  0
		lavaCoverSun    1.46352
		lavaCoverYoung  0
		colorSea       (0.337, 0.319, 0.296, 0.000)
		colorShelf     (0.358, 0.339, 0.315, 0.000)
		colorBeach     (0.379, 0.359, 0.333, 0.000)
		colorDesert    (0.400, 0.379, 0.352, 0.000)
		colorLowland   (0.421, 0.399, 0.370, 0.000)
		colorUpland    (0.442, 0.419, 0.389, 0.000)
		colorRock      (0.463, 0.439, 0.407, 0.000)
		colorSnow      (0.484, 0.459, 0.426, 1.000)
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
		SemiMajorAxis   8.79706e-005
		Period          0.00134971
		Eccentricity    0.00810674
		Inclination     -0.895733
		AscendingNode   99.1593
		ArgOfPericenter 46.2399
		MeanAnomaly     20.9476
	}
}

DwarfPlanet	"3"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Selena"

	Mass            0.00245142
	Radius          804.998
	InertiaMoment   0.399636

	Obliquity       -2.07135
	EqAscendNode    -71.0029
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.752 0.723 0.685)

	Surface
	{
		SurfStyle       0.368661
		OceanStyle      0.0411955
		Randomize      (0.870, 0.903, 0.155)
		colorDistMagn   0.0511754
		colorDistFreq   84.629
		detailScale     2070.5
		colorConversion true
		drivenDarkening 0
		seaLevel        0.211895
		snowLevel       2
		tropicLatitude  0.0588241
		icecapLatitude  10
		icecapHeight    0.171104
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.80703
		venusFreq       1.44887
		venusMagn       0
		mareFreq        0.127546
		mareDensity     0.00333081
		terraceProb     0.347161
		erosion         0
		montesMagn      0.0572768
		montesFreq      27.3635
		montesSpiky     0.928052
		montesFraction  0.168636
		dunesMagn       0.0443658
		dunesFreq       1038.06
		dunesFraction   0.406243
		hillsMagn       0.137592
		hillsFreq       83.4934
		hillsFraction   0.774867
		hills2Fraction  0
		riversMagn      49.7324
		riversFreq      3.0356
		riversSin       6.19417
		riversOctaves   0
		canyonsMagn     0.376511
		canyonsFreq     0.233023
		canyonFraction  0.701436
		cracksMagn      0.0501148
		cracksFreq      0.366051
		cracksOctaves   0
		craterMagn      0.616276
		craterFreq      2.43534
		craterDensity   0.302577
		craterOctaves   3.3215
		craterRayedFactor 0.0763498
		volcanoMagn     0.204664
		volcanoFreq     1.15093
		volcanoDensity  0.0710477
		volcanoOctaves  1
		volcanoActivity 0
		volcanoFlows    0.17453
		volcanoRadius   0.733467
		volcanoTemp     1583.23
		lavaCoverTidal  0
		lavaCoverSun    0.742056
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.413, 0.412, 0.411, 0.000)
		colorDesert    (0.361, 0.333, 0.315, 0.000)
		colorLowland   (0.459, 0.441, 0.383, 0.000)
		colorUpland    (0.489, 0.470, 0.418, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0458253
		Period          0.120279
		Eccentricity    0.0742723
		Inclination     2.15258
		AscendingNode   -69.9386
		ArgOfPericenter 220.081
		MeanAnomaly     163.028
	}
}

DwarfPlanet	"4"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Selena"

	Mass            0.00581278
	Radius          1201.68
	InertiaMoment   0.384671

	Obliquity       -0.608663
	EqAscendNode    148.236
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.758 0.753 0.751)

	Surface
	{
		SurfStyle       0.894556
		OceanStyle      0.519884
		Randomize      (0.055, -0.542, 0.212)
		colorDistMagn   0.0520187
		colorDistFreq   145.914
		detailScale     3090.79
		colorConversion true
		drivenDarkening 0
		seaLevel        0.214459
		snowLevel       2
		tropicLatitude  0.00581852
		icecapLatitude  10
		icecapHeight    0.102107
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.94715
		venusFreq       1.16609
		venusMagn       0
		mareFreq        0.556767
		mareDensity     0.00374426
		terraceProb     0.725224
		erosion         0
		montesMagn      0.0557253
		montesFreq      44.6743
		montesSpiky     0.995044
		montesFraction  0.476435
		dunesMagn       0.0283231
		dunesFreq       1576.19
		dunesFraction   0.919218
		hillsMagn       0.102309
		hillsFreq       117.089
		hillsFraction   0.967939
		hills2Fraction  0
		riversMagn      61.3149
		riversFreq      4.31017
		riversSin       6.22913
		riversOctaves   0
		canyonsMagn     0.462832
		canyonsFreq     0.353047
		canyonFraction  0.701801
		cracksMagn      0.0644918
		cracksFreq      0.419811
		cracksOctaves   0
		craterMagn      0.575402
		craterFreq      3.26693
		craterDensity   0.758457
		craterOctaves   7.77738
		craterRayedFactor 0.261061
		volcanoMagn     0.172057
		volcanoFreq     0.779003
		volcanoDensity  0.0701679
		volcanoOctaves  1
		volcanoActivity 0
		volcanoFlows    0.250423
		volcanoRadius   0.481262
		volcanoTemp     2102.31
		lavaCoverTidal  0
		lavaCoverSun    0.246957
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.425, 0.354, 0.315, 0.000)
		colorDesert    (0.387, 0.331, 0.278, 0.000)
		colorLowland   (0.296, 0.256, 0.210, 0.000)
		colorUpland    (0.500, 0.452, 0.391, 0.000)
		colorRock      (0.670, 0.620, 0.550, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0748989
		Period          0.25133
		Eccentricity    0.0232247
		Inclination     -2.53659
		AscendingNode   147.693
		ArgOfPericenter 242.188
		MeanAnomaly     182.771
	}
}

DwarfPlanet	"5"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Selena"

	Mass            0.0132404
	Radius          1791.13
	InertiaMoment   0.369808

	Obliquity       0.0760089
	EqAscendNode    -2.41748
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.818 0.789 0.767)

	Surface
	{
		SurfStyle       0.260114
		OceanStyle      0.487565
		Randomize      (0.094, -0.898, 0.860)
		colorDistMagn   0.0808687
		colorDistFreq   220.865
		detailScale     4606.9
		colorConversion true
		drivenDarkening 0
		seaLevel        0.227923
		snowLevel       2
		tropicLatitude  0.00265204
		icecapLatitude  10
		icecapHeight    0.196542
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.01267
		venusFreq       1.09529
		venusMagn       0
		mareFreq        0.978394
		mareDensity     0.00286595
		terraceProb     0.18528
		erosion         0
		montesMagn      0.102274
		montesFreq      84.6169
		montesSpiky     0.952383
		montesFraction  0.506175
		dunesMagn       0.0407803
		dunesFreq       2354.68
		dunesFraction   0.907684
		hillsMagn       0.137555
		hillsFreq       180.81
		hillsFraction   0.497343
		hills2Fraction  0
		riversMagn      55.3512
		riversFreq      4.38413
		riversSin       6.95936
		riversOctaves   0
		canyonsMagn     0.284677
		canyonsFreq     0.755882
		canyonFraction  0.347533
		cracksMagn      0.0255317
		cracksFreq      0.3903
		cracksOctaves   0
		craterMagn      0.605236
		craterFreq      6.6263
		craterDensity   0.849653
		craterOctaves   10.3867
		craterRayedFactor 0.382075
		volcanoMagn     0.294354
		volcanoFreq     0.945245
		volcanoDensity  0.054959
		volcanoOctaves  1
		volcanoActivity 0
		volcanoFlows    0.315128
		volcanoRadius   0.576724
		volcanoTemp     1271.1
		lavaCoverTidal  0
		lavaCoverSun    0.0619465
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.450, 0.450, 0.460, 0.000)
		colorDesert    (0.393, 0.363, 0.353, 0.000)
		colorLowland   (0.499, 0.481, 0.430, 0.000)
		colorUpland    (0.532, 0.513, 0.468, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.1207
		Period          0.514154
		Eccentricity    0.0209399
		Inclination     2.24881
		AscendingNode   -3.81685
		ArgOfPericenter 344.02
		MeanAnomaly     159.902
	}
}

DwarfMoon	"5.D1"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.43955e-006
	Radius          82.3691
	InertiaMoment   0.397272

	Oblateness      0.115068

	Obliquity       0.00817069
	EqAscendNode    21.8424
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.650 0.646)

	Surface
	{
		SurfStyle       0.204674
		OceanStyle      0.252527
		Randomize      (-0.144, 0.356, 0.334)
		colorDistMagn   0.219767
		colorDistFreq   5.67416
		detailScale     2249.23
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615803
		terraceProb     0.124031
		erosion         0
		montesMagn      0.306429
		montesFreq      2.35783
		montesSpiky     0.91712
		montesFraction  0.710127
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.4119
		hillsFraction   0.443376
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254479
		craterFreq      0.215249
		craterDensity   0.849423
		craterOctaves   13.2863
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   10.7636
		volcanoTemp     1275.96
		lavaCoverTidal  0
		lavaCoverSun    0.0619465
		lavaCoverYoung  0
		colorSea       (0.262, 0.260, 0.258, 0.000)
		colorShelf     (0.278, 0.276, 0.275, 0.000)
		colorBeach     (0.294, 0.293, 0.291, 0.000)
		colorDesert    (0.311, 0.309, 0.307, 0.000)
		colorLowland   (0.327, 0.325, 0.323, 0.000)
		colorUpland    (0.343, 0.341, 0.339, 0.000)
		colorRock      (0.360, 0.358, 0.355, 0.000)
		colorSnow      (0.376, 0.374, 0.371, 1.000)
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
		SemiMajorAxis   2.54248e-005
		Period          0.000644305
		Eccentricity    5.6278e-005
		Inclination     0.00817069
		AscendingNode   21.8424
		ArgOfPericenter 52.376
		MeanAnomaly     -155.238
	}
}

DwarfMoon	"5.D2"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.1244e-006
	Radius          85.3387
	InertiaMoment   0.398721

	Oblateness      0.0746412

	Obliquity       0.00912396
	EqAscendNode    -105.933
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.501 0.377 0.302)

	Surface
	{
		SurfStyle       0.695708
		OceanStyle      0.686399
		Randomize      (-0.179, 0.194, -0.476)
		colorDistMagn   0.368295
		colorDistFreq   4.81257
		detailScale     2330.31
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.377768
		terraceProb     0.127192
		erosion         0
		montesMagn      0.465698
		montesFreq      2.77319
		montesSpiky     0.900036
		montesFraction  0.514992
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.2063
		hillsFraction   0.691494
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244453
		craterFreq      0.286116
		craterDensity   0.990623
		craterOctaves   13.2863
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   9.17981
		volcanoTemp     1363.21
		lavaCoverTidal  0
		lavaCoverSun    0.0619465
		lavaCoverYoung  0
		colorSea       (0.195, 0.128, 0.085, 0.000)
		colorShelf     (0.200, 0.132, 0.097, 0.000)
		colorBeach     (0.235, 0.155, 0.115, 0.000)
		colorDesert    (0.255, 0.166, 0.112, 0.000)
		colorLowland   (0.280, 0.177, 0.127, 0.000)
		colorUpland    (0.310, 0.215, 0.154, 0.000)
		colorRock      (0.335, 0.234, 0.166, 0.000)
		colorSnow      (0.365, 0.249, 0.175, 1.000)
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
		SemiMajorAxis   2.67765e-005
		Period          0.000696347
		Eccentricity    3.28272e-005
		Inclination     0.00912397
		AscendingNode   -105.933
		ArgOfPericenter 20.7473
		MeanAnomaly     161.095
	}
}

DwarfPlanet	"6"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Selena"

	Mass            0.0292521
	Radius          1814.31
	InertiaMoment   0.354868

	Oblateness      0.00216896

	RotationPeriod  27.5623
	Obliquity       46.4718
	EqAscendNode    61.9786

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.781 0.779 0.778)

	Surface
	{
		SurfStyle       0.968498
		OceanStyle      0.643036
		Randomize      (-0.684, -0.889, 0.016)
		colorDistMagn   0.0785294
		colorDistFreq   230.374
		detailScale     4666.52
		colorConversion true
		drivenDarkening 0
		seaLevel        0.237812
		snowLevel       2
		tropicLatitude  0.723703
		icecapLatitude  10
		icecapHeight    0.0971549
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.95423
		venusFreq       1.17272
		venusMagn       0
		mareFreq        0.949415
		mareDensity     0.0165049
		terraceProb     0.502602
		erosion         0
		montesMagn      0.10497
		montesFreq      72.7945
		montesSpiky     0.94981
		montesFraction  0.446618
		dunesMagn       0.0371462
		dunesFreq       2416.89
		dunesFraction   0.893506
		hillsMagn       0.1304
		hillsFreq       182.354
		hillsFraction   0.272823
		hills2Fraction  0
		riversMagn      61.2137
		riversFreq      1.73599
		riversSin       5.70037
		riversOctaves   0
		canyonsMagn     0.64774
		canyonsFreq     0.577128
		canyonFraction  0.245303
		cracksMagn      0.0281037
		cracksFreq      0.919154
		cracksOctaves   0
		craterMagn      0.6473
		craterFreq      3.85322
		craterDensity   0.924186
		craterOctaves   10.9481
		craterRayedFactor 0.200687
		volcanoMagn     0.32602
		volcanoFreq     1.08244
		volcanoDensity  0.0552404
		volcanoOctaves  1
		volcanoActivity 0
		volcanoFlows    0.175334
		volcanoRadius   0.450075
		volcanoTemp     1414.44
		lavaCoverTidal  0
		lavaCoverSun    0.00524415
		lavaCoverYoung  0
		colorSea       (0.390, 0.400, 0.160, 0.000)
		colorShelf     (0.580, 0.550, 0.240, 0.000)
		colorBeach     (0.554, 0.530, 0.327, 0.000)
		colorDesert    (0.640, 0.592, 0.334, 0.000)
		colorLowland   (0.492, 0.428, 0.241, 0.000)
		colorUpland    (0.461, 0.397, 0.226, 0.000)
		colorRock      (0.330, 0.240, 0.130, 0.000)
		colorSnow      (0.900, 0.890, 0.760, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999594
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
		Height          90.7157
		Density         4.0583e-005
		Pressure        6.44561e-005
		Greenhouse      0.0743023
		Bright          2.09734
		Opacity         0
		SkyLight        0.699113
		Hue             -0.00853498
		Saturation      1

		Composition
		{
			CO2   	90.9435
			SO2   	9.05303
			C3H8  	0.00351419
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.192152
		Period          1.03276
		Eccentricity    0.0562521
		Inclination     3.25201
		AscendingNode   55.8854
		ArgOfPericenter 241.653
		MeanAnomaly     221.85
	}
}

Asteroid	"S1"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.45219e-016
	Radius          0.0587565
	InertiaMoment   0.395381

	RotationPeriod  4399.96
	Obliquity       0.976354
	EqAscendNode    -9.71038

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.582 0.576 0.573)

	Surface
	{
		SurfStyle       0.90214
		OceanStyle      0.355507
		Randomize      (-0.488, 0.321, -0.625)
		colorDistMagn   0.142673
		colorDistFreq   1.86746e-006
		detailScale     1.60444
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0339526
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.72678
		terraceProb     0.367177
		erosion         0
		montesMagn      0.557575
		montesFreq      3.61518
		montesSpiky     0.982562
		montesFraction  0.421071
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.28031e-006
		hillsFraction   0.929895
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241438
		craterFreq      0.223449
		craterDensity   0
		craterOctaves   0.798886
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   436.591
		volcanoTemp     1666.67
		lavaCoverTidal  0
		lavaCoverSun    0.508774
		lavaCoverYoung  0
		colorSea       (0.198, 0.201, 0.229, 0.050)
		colorShelf     (0.233, 0.236, 0.264, 0.040)
		colorBeach     (0.268, 0.271, 0.298, 0.030)
		colorDesert    (0.303, 0.305, 0.338, 0.020)
		colorLowland   (0.338, 0.340, 0.373, 0.030)
		colorUpland    (0.373, 0.374, 0.407, 0.050)
		colorRock      (0.408, 0.409, 0.453, 0.020)
		colorSnow      (0.408, 0.409, 0.453, 1.000)
		BumpHeight      0.0528808
		BumpOffset      0.0105762
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0571043
		Period          0.167315
		Eccentricity    0.0976849
		Inclination     0.976354
		AscendingNode   -9.71038
		ArgOfPericenter -27.8895
		MeanAnomaly     16.9905
	}
}

Asteroid	"S2"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            6.55162e-013
	Radius          0.522867
	InertiaMoment   0.398236

	Obliquity       1.37496
	EqAscendNode    -156.759
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.475 0.470 0.466)

	Surface
	{
		SurfStyle       0.0679802
		OceanStyle      0.0103393
		Randomize      (0.531, -0.956, -0.349)
		colorDistMagn   0.68502
		colorDistFreq   0.000225214
		detailScale     14.2778
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00966736
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.724642
		terraceProb     0.145268
		erosion         0
		montesMagn      0.448522
		montesFreq      2.29474
		montesSpiky     0.926854
		montesFraction  0.554911
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000598627
		hillsFraction   0.727699
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237723
		craterFreq      0.242427
		craterDensity   0.565249
		craterOctaves   3.36416
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   101.28
		volcanoTemp     1288.3
		lavaCoverTidal  0
		lavaCoverSun    0.264305
		lavaCoverYoung  0
		colorSea       (0.190, 0.188, 0.187, 0.000)
		colorShelf     (0.202, 0.200, 0.198, 0.000)
		colorBeach     (0.214, 0.211, 0.210, 0.000)
		colorDesert    (0.226, 0.223, 0.222, 0.000)
		colorLowland   (0.238, 0.235, 0.233, 0.000)
		colorUpland    (0.250, 0.247, 0.245, 0.000)
		colorRock      (0.262, 0.258, 0.257, 0.000)
		colorSnow      (0.273, 0.270, 0.268, 1.000)
		BumpHeight      0.470581
		BumpOffset      0.0941161
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0776008
		Period          0.265052
		Eccentricity    0.0921603
		Inclination     1.37496
		AscendingNode   -156.759
		ArgOfPericenter -47.7986
		MeanAnomaly     -170.737
	}
}

Asteroid	"S3"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            9.64105e-010
	Radius          6.68005
	InertiaMoment   0.399321

	Obliquity       0.80124
	EqAscendNode    -175.67
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.539 0.532 0.529)

	Surface
	{
		SurfStyle       0.570358
		OceanStyle      0.133329
		Randomize      (0.069, -0.359, 0.223)
		colorDistMagn   0.424964
		colorDistFreq   0.0251185
		detailScale     182.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0010358
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.602469
		terraceProb     0.343396
		erosion         0
		montesMagn      0.558043
		montesFreq      2.43466
		montesSpiky     0.842831
		montesFraction  0.613631
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.122191
		hillsFraction   0.500182
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237201
		craterFreq      0.222216
		craterDensity   0.575095
		craterOctaves   7.38508
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   33.7305
		volcanoTemp     1736.4
		lavaCoverTidal  0
		lavaCoverSun    0.190076
		lavaCoverYoung  0
		colorSea       (0.210, 0.181, 0.148, 0.000)
		colorShelf     (0.216, 0.186, 0.169, 0.000)
		colorBeach     (0.253, 0.218, 0.201, 0.000)
		colorDesert    (0.275, 0.234, 0.196, 0.000)
		colorLowland   (0.302, 0.250, 0.222, 0.000)
		colorUpland    (0.334, 0.303, 0.270, 0.000)
		colorRock      (0.361, 0.330, 0.291, 0.000)
		colorSnow      (0.393, 0.351, 0.307, 1.000)
		BumpHeight      6.01204
		BumpOffset      1.20241
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0864778
		Period          0.31181
		Eccentricity    0.0614079
		Inclination     0.80124
		AscendingNode   -175.67
		ArgOfPericenter 107.435
		MeanAnomaly     159.215
	}
}

Asteroid	"S4"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.64807e-018
	Radius          0.0137035
	InertiaMoment   0.396621

	Obliquity       -5.42116
	EqAscendNode    58.1023
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.406 0.403 0.397)

	Surface
	{
		SurfStyle       0.109661
		OceanStyle      0.40025
		Randomize      (-0.945, 0.194, 0.313)
		colorDistMagn   0.428542
		colorDistFreq   1.49261e-007
		detailScale     0.374196
		colorConversion true
		snowLevel       2
		tropicLatitude  0.164615
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.534296
		terraceProb     0.216052
		erosion         0
		montesMagn      0.41347
		montesFreq      2.2618
		montesSpiky     0.978282
		montesFraction  0.769949
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.33132e-007
		hillsFraction   0.499027
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255109
		craterFreq      0.218381
		craterDensity   0
		craterOctaves   0.398538
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   904.038
		volcanoTemp     1401.78
		lavaCoverTidal  0
		lavaCoverSun    0.387793
		lavaCoverYoung  0
		colorSea       (0.163, 0.161, 0.159, 0.000)
		colorShelf     (0.173, 0.171, 0.169, 0.000)
		colorBeach     (0.183, 0.181, 0.178, 0.000)
		colorDesert    (0.193, 0.191, 0.188, 0.000)
		colorLowland   (0.203, 0.201, 0.198, 0.000)
		colorUpland    (0.213, 0.212, 0.208, 0.000)
		colorRock      (0.224, 0.222, 0.218, 0.000)
		colorSnow      (0.234, 0.232, 0.228, 1.000)
		BumpHeight      0.0123331
		BumpOffset      0.00246663
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0636752
		Period          0.19701
		Eccentricity    0.0686807
		Inclination     -5.42116
		AscendingNode   58.1023
		ArgOfPericenter 162.474
		MeanAnomaly     87.1434
	}
}

Asteroid	"S5"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            8.31144e-015
	Radius          0.121946
	InertiaMoment   0.398482

	Obliquity       0.596721
	EqAscendNode    11.1411
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.606 0.488 0.346)

	Surface
	{
		SurfStyle       0.743968
		OceanStyle      0.80912
		Randomize      (0.635, -0.028, -0.371)
		colorDistMagn   0.561895
		colorDistFreq   7.21618e-006
		detailScale     3.32994
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0207293
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406707
		terraceProb     0.305408
		erosion         0
		montesMagn      0.537102
		montesFreq      3.2948
		montesSpiky     0.8901
		montesFraction  0.597303
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.22186e-005
		hillsFraction   0.568984
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225414
		craterFreq      0.205701
		craterDensity   0.760409
		craterOctaves   2.88611
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   209.718
		volcanoTemp     1046.18
		lavaCoverTidal  0
		lavaCoverSun    0.158458
		lavaCoverYoung  0
		colorSea       (0.236, 0.166, 0.097, 0.000)
		colorShelf     (0.242, 0.171, 0.111, 0.000)
		colorBeach     (0.285, 0.200, 0.131, 0.000)
		colorDesert    (0.309, 0.215, 0.128, 0.000)
		colorLowland   (0.339, 0.229, 0.145, 0.000)
		colorUpland    (0.375, 0.278, 0.176, 0.000)
		colorRock      (0.406, 0.303, 0.190, 0.000)
		colorSnow      (0.442, 0.322, 0.201, 1.000)
		BumpHeight      0.109751
		BumpOffset      0.0219503
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0943026
		Period          0.355073
		Eccentricity    0.0792086
		Inclination     0.596721
		AscendingNode   11.1411
		ArgOfPericenter 171.785
		MeanAnomaly     -23.436
	}
}

Asteroid	"S6"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.22307e-011
	Radius          1.55799
	InertiaMoment   0.399505

	RotationPeriod  7345.44
	Obliquity       1.70256
	EqAscendNode    -138.777

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.546 0.439 0.382)

	Surface
	{
		SurfStyle       0.0296963
		OceanStyle      0.522799
		Randomize      (-0.322, 0.226, 0.004)
		colorDistMagn   0.139286
		colorDistFreq   0.00172559
		detailScale     42.5435
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0209182
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.767933
		terraceProb     0.394943
		erosion         0
		montesMagn      0.543721
		montesFreq      2.34821
		montesSpiky     0.867877
		montesFraction  0.547238
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00601053
		hillsFraction   0.555776
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243235
		craterFreq      0.204101
		craterDensity   0.488067
		craterOctaves   2.13187
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   69.8464
		volcanoTemp     1626.65
		lavaCoverTidal  0
		lavaCoverSun    0.508582
		lavaCoverYoung  0
		colorSea       (0.218, 0.176, 0.153, 0.000)
		colorShelf     (0.232, 0.186, 0.162, 0.000)
		colorBeach     (0.246, 0.197, 0.172, 0.000)
		colorDesert    (0.259, 0.208, 0.181, 0.000)
		colorLowland   (0.273, 0.219, 0.191, 0.000)
		colorUpland    (0.287, 0.230, 0.200, 0.000)
		colorRock      (0.300, 0.241, 0.210, 0.000)
		colorSnow      (0.314, 0.252, 0.219, 1.000)
		BumpHeight      1.40219
		BumpOffset      0.280438
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0571675
		Period          0.167593
		Eccentricity    0.0986825
		Inclination     1.70256
		AscendingNode   -138.777
		ArgOfPericenter -118.806
		MeanAnomaly     -4.84302
	}
}

Asteroid	"S7"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.79982e-008
	Radius          20.1638
	InertiaMoment   0.397199

	RotationPeriod  11630.3
	Obliquity       -2.33045
	EqAscendNode    -155.989

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.681 0.677 0.673)

	Surface
	{
		SurfStyle       0.229642
		OceanStyle      0.708222
		Randomize      (-0.637, -0.577, -0.799)
		colorDistMagn   0.291807
		colorDistFreq   0.135375
		detailScale     550.607
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0169175
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.585091
		terraceProb     0.383947
		erosion         0
		montesMagn      0.433807
		montesFreq      3.03188
		montesSpiky     0.853172
		montesFraction  0.437835
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.931494
		hillsFraction   0.826724
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258358
		craterFreq      0.237359
		craterDensity   0.71455
		craterOctaves   5.81593
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.5649
		volcanoTemp     1167.47
		lavaCoverTidal  0
		lavaCoverSun    0.319622
		lavaCoverYoung  0
		colorSea       (0.272, 0.271, 0.269, 0.000)
		colorShelf     (0.289, 0.288, 0.286, 0.000)
		colorBeach     (0.306, 0.304, 0.303, 0.000)
		colorDesert    (0.323, 0.321, 0.320, 0.000)
		colorLowland   (0.340, 0.338, 0.337, 0.000)
		colorUpland    (0.357, 0.355, 0.353, 0.000)
		colorRock      (0.374, 0.372, 0.370, 0.000)
		colorSnow      (0.391, 0.389, 0.387, 1.000)
		BumpHeight      18.1474
		BumpOffset      3.62949
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0687718
		Period          0.22113
		Eccentricity    0.053788
		Inclination     -2.33045
		AscendingNode   -155.989
		ArgOfPericenter 145.653
		MeanAnomaly     155.985
	}
}

Asteroid	"S8"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.0544e-016
	Radius          0.028441
	InertiaMoment   0.398708

	RotationPeriod  3903.36
	Obliquity       -1.23457
	EqAscendNode    141.202

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.569 0.565 0.564)

	Surface
	{
		SurfStyle       0.613161
		OceanStyle      0.323249
		Randomize      (0.468, 0.110, -0.799)
		colorDistMagn   0.741723
		colorDistFreq   5.54107e-007
		detailScale     0.776629
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0143105
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.636796
		terraceProb     0.148611
		erosion         0
		montesMagn      0.579803
		montesFreq      3.48682
		montesSpiky     0.852561
		montesFraction  0.111731
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.40435e-006
		hillsFraction   0.647154
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234866
		craterFreq      0.271767
		craterDensity   0
		craterOctaves   0.885675
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   434.258
		volcanoTemp     1686.23
		lavaCoverTidal  0
		lavaCoverSun    0.351902
		lavaCoverYoung  0
		colorSea       (0.222, 0.192, 0.158, 0.000)
		colorShelf     (0.228, 0.198, 0.180, 0.000)
		colorBeach     (0.268, 0.232, 0.214, 0.000)
		colorDesert    (0.290, 0.249, 0.209, 0.000)
		colorLowland   (0.319, 0.266, 0.237, 0.000)
		colorUpland    (0.353, 0.322, 0.287, 0.000)
		colorRock      (0.381, 0.350, 0.310, 0.000)
		colorSnow      (0.416, 0.373, 0.327, 1.000)
		BumpHeight      0.0255969
		BumpOffset      0.00511938
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0690859
		Period          0.222647
		Eccentricity    0.106922
		Inclination     -1.23457
		AscendingNode   141.202
		ArgOfPericenter -111.94
		MeanAnomaly     -13.4889
	}
}

Asteroid	"S9"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.5516e-013
	Radius          0.363364
	InertiaMoment   0.399685

	RotationPeriod  5577.08
	Obliquity       4.88518
	EqAscendNode    138.396

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.559 0.551 0.547)

	Surface
	{
		SurfStyle       0.168319
		OceanStyle      0.769388
		Randomize      (0.274, 0.651, -0.025)
		colorDistMagn   0.71072
		colorDistFreq   9.13035e-005
		detailScale     9.92226
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0604591
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.392004
		terraceProb     0.129482
		erosion         0
		montesMagn      0.35857
		montesFreq      2.94879
		montesSpiky     0.957335
		montesFraction  0.78745
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000278442
		hillsFraction   0.710374
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238245
		craterFreq      0.159559
		craterDensity   0.63282
		craterOctaves   2.52572
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   144.63
		volcanoTemp     1230.89
		lavaCoverTidal  0
		lavaCoverSun    0.369399
		lavaCoverYoung  0
		colorSea       (0.223, 0.220, 0.219, 0.000)
		colorShelf     (0.237, 0.234, 0.233, 0.000)
		colorBeach     (0.251, 0.248, 0.246, 0.000)
		colorDesert    (0.265, 0.262, 0.260, 0.000)
		colorLowland   (0.279, 0.275, 0.274, 0.000)
		colorUpland    (0.293, 0.289, 0.287, 0.000)
		colorRock      (0.307, 0.303, 0.301, 0.000)
		colorSnow      (0.321, 0.317, 0.315, 1.000)
		BumpHeight      0.327028
		BumpOffset      0.0654055
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0668818
		Period          0.212077
		Eccentricity    0.0965678
		Inclination     4.88518
		AscendingNode   138.396
		ArgOfPericenter 79.6223
		MeanAnomaly     -38.7533
	}
}

Asteroid	"S10"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.28327e-010
	Radius          4.70303
	InertiaMoment   0.397608

	RotationPeriod  12376.7
	Obliquity       -1.47117
	EqAscendNode    53.498

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.681 0.637 0.609)

	Surface
	{
		SurfStyle       0.215916
		OceanStyle      0.677735
		Randomize      (-0.382, 0.430, -0.273)
		colorDistMagn   0.792585
		colorDistFreq   0.0103388
		detailScale     128.424
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0458409
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562343
		terraceProb     0.239
		erosion         0
		montesMagn      0.520497
		montesFreq      2.05917
		montesSpiky     0.999517
		montesFraction  0.931658
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0416535
		hillsFraction   0.81332
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216838
		craterFreq      0.157609
		craterDensity   0.65733
		craterOctaves   6.75906
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   48.7983
		volcanoTemp     1742.3
		lavaCoverTidal  0
		lavaCoverSun    0.18717
		lavaCoverYoung  0
		colorSea       (0.272, 0.255, 0.244, 0.000)
		colorShelf     (0.289, 0.271, 0.259, 0.000)
		colorBeach     (0.307, 0.287, 0.274, 0.000)
		colorDesert    (0.324, 0.303, 0.289, 0.000)
		colorLowland   (0.341, 0.318, 0.304, 0.000)
		colorUpland    (0.358, 0.334, 0.320, 0.000)
		colorRock      (0.375, 0.350, 0.335, 0.000)
		colorSnow      (0.392, 0.366, 0.350, 1.000)
		BumpHeight      4.23272
		BumpOffset      0.846545
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0939323
		Period          0.352984
		Eccentricity    0.145541
		Inclination     -1.47117
		AscendingNode   53.498
		ArgOfPericenter -155.334
		MeanAnomaly     77.696
	}
}

Asteroid	"S11"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.35995e-007
	Radius          41.8419
	InertiaMoment   0.398918

	Obliquity       -1.84864
	EqAscendNode    -159.538
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.522 0.519 0.517)

	Surface
	{
		SurfStyle       0.185345
		OceanStyle      0.597205
		Randomize      (0.179, 0.911, 0.318)
		colorDistMagn   0.469088
		colorDistFreq   1.23723
		detailScale     1142.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0114614
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.731211
		terraceProb     0.134791
		erosion         0
		montesMagn      0.521522
		montesFreq      2.78859
		montesSpiky     0.999732
		montesFraction  0.265995
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.789
		hillsFraction   0.587408
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251134
		craterFreq      0.230584
		craterDensity   0.464415
		craterOctaves   3.71206
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   11.3175
		volcanoTemp     1369.37
		lavaCoverTidal  0
		lavaCoverSun    0.509942
		lavaCoverYoung  0
		colorSea       (0.209, 0.207, 0.207, 0.000)
		colorShelf     (0.222, 0.220, 0.220, 0.000)
		colorBeach     (0.235, 0.233, 0.233, 0.000)
		colorDesert    (0.248, 0.246, 0.245, 0.000)
		colorLowland   (0.261, 0.259, 0.258, 0.000)
		colorUpland    (0.274, 0.272, 0.271, 0.000)
		colorRock      (0.287, 0.285, 0.284, 0.000)
		colorSnow      (0.300, 0.298, 0.297, 1.000)
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
		SemiMajorAxis   0.0567085
		Period          0.165579
		Eccentricity    0.0913873
		Inclination     -1.84864
		AscendingNode   -159.538
		ArgOfPericenter -68.5332
		MeanAnomaly     17.4122
	}
}

Asteroid	"S12"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.96838e-015
	Radius          0.0847458
	InertiaMoment   0.399863

	Obliquity       -1.55633
	EqAscendNode    -29.9745
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.712 0.709 0.707)

	Surface
	{
		SurfStyle       0.619336
		OceanStyle      0.156029
		Randomize      (0.261, 0.264, -0.096)
		colorDistMagn   0.564754
		colorDistFreq   3.95888e-006
		detailScale     2.31413
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0524534
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.632
		terraceProb     0.135613
		erosion         0
		montesMagn      0.687667
		montesFreq      2.19287
		montesSpiky     0.936918
		montesFraction  0.623605
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.03482e-005
		hillsFraction   0.584029
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219885
		craterFreq      0.192668
		craterDensity   0.628207
		craterOctaves   1.53027
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   299.481
		volcanoTemp     1684.01
		lavaCoverTidal  0
		lavaCoverSun    0.300668
		lavaCoverYoung  0
		colorSea       (0.278, 0.241, 0.198, 0.000)
		colorShelf     (0.285, 0.248, 0.226, 0.000)
		colorBeach     (0.335, 0.291, 0.269, 0.000)
		colorDesert    (0.363, 0.312, 0.262, 0.000)
		colorLowland   (0.399, 0.333, 0.297, 0.000)
		colorUpland    (0.442, 0.404, 0.361, 0.000)
		colorRock      (0.477, 0.440, 0.389, 0.000)
		colorSnow      (0.520, 0.468, 0.410, 1.000)
		BumpHeight      0.0762713
		BumpOffset      0.0152543
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0702352
		Period          0.228226
		Eccentricity    0.0466866
		Inclination     -1.55633
		AscendingNode   -29.9745
		ArgOfPericenter -75.3121
		MeanAnomaly     -118.643
	}
}

Asteroid	"S13"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.89658e-012
	Radius          1.09688
	InertiaMoment   0.397936

	RotationPeriod  19054.2
	Obliquity       -1.64388
	EqAscendNode    29.7056

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.837 0.775 0.709)

	Surface
	{
		SurfStyle       0.186748
		OceanStyle      0.750173
		Randomize      (-0.282, -0.441, 0.585)
		colorDistMagn   0.592391
		colorDistFreq   0.000581943
		detailScale     29.9521
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0554357
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.474637
		terraceProb     0.112414
		erosion         0
		montesMagn      0.336922
		montesFreq      2.0982
		montesSpiky     0.926159
		montesFraction  0.396456
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00276492
		hillsFraction   0.756646
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255911
		craterFreq      0.266074
		craterDensity   0.898153
		craterOctaves   5.64043
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   101.047
		volcanoTemp     1218.47
		lavaCoverTidal  0
		lavaCoverSun    0.168719
		lavaCoverYoung  0
		colorSea       (0.335, 0.310, 0.284, 0.000)
		colorShelf     (0.356, 0.329, 0.301, 0.000)
		colorBeach     (0.377, 0.349, 0.319, 0.000)
		colorDesert    (0.398, 0.368, 0.337, 0.000)
		colorLowland   (0.419, 0.387, 0.354, 0.000)
		colorUpland    (0.440, 0.407, 0.372, 0.000)
		colorRock      (0.460, 0.426, 0.390, 0.000)
		colorSnow      (0.481, 0.445, 0.408, 1.000)
		BumpHeight      0.987191
		BumpOffset      0.197438
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0955748
		Period          0.362283
		Eccentricity    0.119847
		Inclination     -1.64388
		AscendingNode   29.7056
		ArgOfPericenter -41.6106
		MeanAnomaly     -122.442
	}
}

Asteroid	"S14"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.26246e-009
	Radius          9.76061
	InertiaMoment   0.399117

	RotationPeriod  5066.84
	Obliquity       -0.522585
	EqAscendNode    -121.048

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.667 0.665)

	Surface
	{
		SurfStyle       0.662206
		OceanStyle      0.504784
		Randomize      (-0.558, -0.737, 0.364)
		colorDistMagn   0.551899
		colorDistFreq   0.0260823
		detailScale     266.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00897685
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413682
		terraceProb     0.299175
		erosion         0
		montesMagn      0.612167
		montesFreq      3.13132
		montesSpiky     0.749622
		montesFraction  0.656655
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.184593
		hillsFraction   0.680443
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245424
		craterFreq      0.173818
		craterDensity   0.673031
		craterOctaves   6.86271
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.4397
		volcanoTemp     1530.07
		lavaCoverTidal  0
		lavaCoverSun    0.221116
		lavaCoverYoung  0
		colorSea       (0.261, 0.227, 0.186, 0.000)
		colorShelf     (0.267, 0.233, 0.213, 0.000)
		colorBeach     (0.314, 0.273, 0.253, 0.000)
		colorDesert    (0.341, 0.293, 0.246, 0.000)
		colorLowland   (0.374, 0.313, 0.279, 0.000)
		colorUpland    (0.415, 0.380, 0.339, 0.000)
		colorRock      (0.448, 0.413, 0.366, 0.000)
		colorSnow      (0.488, 0.440, 0.386, 1.000)
		BumpHeight      8.78454
		BumpOffset      1.75691
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0822095
		Period          0.289012
		Eccentricity    0.0726703
		Inclination     -0.522585
		AscendingNode   -121.048
		ArgOfPericenter 90.9486
		MeanAnomaly     -154.51
	}
}

Asteroid	"S15"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.4971e-017
	Radius          0.0197649
	InertiaMoment   0.395157

	RotationPeriod  4598.6
	Obliquity       -0.202925
	EqAscendNode    -104.294

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.786 0.784 0.781)

	Surface
	{
		SurfStyle       0.931162
		OceanStyle      0.88569
		Randomize      (0.474, 0.836, -0.922)
		colorDistMagn   0.714871
		colorDistFreq   1.73293e-007
		detailScale     0.539713
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00433993
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.699856
		terraceProb     0.22426
		erosion         0
		montesMagn      0.469481
		montesFreq      3.69437
		montesSpiky     0.719518
		montesFraction  0.559465
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.29155e-007
		hillsFraction   0.493635
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225734
		craterFreq      0.215794
		craterDensity   0
		craterOctaves   0.271883
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   620.129
		volcanoTemp     1636.1
		lavaCoverTidal  0
		lavaCoverSun    0.503125
		lavaCoverYoung  0
		colorSea       (0.267, 0.274, 0.312, 0.050)
		colorShelf     (0.314, 0.321, 0.359, 0.040)
		colorBeach     (0.361, 0.368, 0.406, 0.030)
		colorDesert    (0.409, 0.415, 0.461, 0.020)
		colorLowland   (0.456, 0.462, 0.508, 0.030)
		colorUpland    (0.503, 0.509, 0.555, 0.050)
		colorRock      (0.550, 0.556, 0.617, 0.020)
		colorSnow      (0.550, 0.556, 0.617, 1.000)
		BumpHeight      0.0177884
		BumpOffset      0.00355768
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0588103
		Period          0.174869
		Eccentricity    0.12386
		Inclination     -0.202925
		AscendingNode   -104.294
		ArgOfPericenter -91.1619
		MeanAnomaly     -65.8018
	}
}

Asteroid	"S16"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.67462e-014
	Radius          0.224812
	InertiaMoment   0.398215

	Obliquity       1.74984
	EqAscendNode    93.0991
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.670 0.666 0.661)

	Surface
	{
		SurfStyle       0.149918
		OceanStyle      0.54033
		Randomize      (-0.723, 0.434, -0.961)
		colorDistMagn   0.027648
		colorDistFreq   4.27769e-005
		detailScale     6.13887
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0419914
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.715709
		terraceProb     0.162811
		erosion         0
		montesMagn      0.462516
		montesFreq      3.07397
		montesSpiky     0.862861
		montesFraction  0.743253
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000117285
		hillsFraction   0.703545
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247101
		craterFreq      0.267609
		craterDensity   0.74749
		craterOctaves   3.54183
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   183.874
		volcanoTemp     1606.75
		lavaCoverTidal  0
		lavaCoverSun    0.166646
		lavaCoverYoung  0
		colorSea       (0.268, 0.266, 0.264, 0.000)
		colorShelf     (0.285, 0.283, 0.281, 0.000)
		colorBeach     (0.301, 0.300, 0.297, 0.000)
		colorDesert    (0.318, 0.316, 0.314, 0.000)
		colorLowland   (0.335, 0.333, 0.330, 0.000)
		colorUpland    (0.352, 0.350, 0.347, 0.000)
		colorRock      (0.368, 0.366, 0.363, 0.000)
		colorSnow      (0.385, 0.383, 0.380, 1.000)
		BumpHeight      0.202331
		BumpOffset      0.0404662
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0906249
		Period          0.334506
		Eccentricity    0.0570212
		Inclination     1.74984
		AscendingNode   93.0991
		ArgOfPericenter 16.7209
		MeanAnomaly     -67.5932
	}
}

Asteroid	"S17"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.4074e-011
	Radius          2.90976
	InertiaMoment   0.399307

	Obliquity       0.571975
	EqAscendNode    10.076
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.586 0.582 0.575)

	Surface
	{
		SurfStyle       0.11727
		OceanStyle      0.817694
		Randomize      (0.815, 0.027, 0.301)
		colorDistMagn   0.698226
		colorDistFreq   0.00528868
		detailScale     79.4559
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0198871
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.417651
		terraceProb     0.111298
		erosion         0
		montesMagn      0.349845
		montesFreq      3.14864
		montesSpiky     0.977192
		montesFraction  0.47363
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0184637
		hillsFraction   0.682384
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264784
		craterFreq      0.256404
		craterDensity   0.781746
		craterOctaves   7.03849
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   62.0396
		volcanoTemp     1404.33
		lavaCoverTidal  0
		lavaCoverSun    0.121727
		lavaCoverYoung  0
		colorSea       (0.234, 0.233, 0.230, 0.000)
		colorShelf     (0.249, 0.247, 0.244, 0.000)
		colorBeach     (0.264, 0.262, 0.259, 0.000)
		colorDesert    (0.278, 0.276, 0.273, 0.000)
		colorLowland   (0.293, 0.291, 0.287, 0.000)
		colorUpland    (0.308, 0.306, 0.302, 0.000)
		colorRock      (0.322, 0.320, 0.316, 0.000)
		colorSnow      (0.337, 0.335, 0.330, 1.000)
		BumpHeight      2.61878
		BumpOffset      0.523757
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0989659
		Period          0.381734
		Eccentricity    0.0304068
		Inclination     0.571975
		AscendingNode   10.076
		ArgOfPericenter -9.29459
		MeanAnomaly     -162.723
	}
}

Asteroid	"S18"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            7.95728e-008
	Radius          25.8903
	InertiaMoment   0.396563

	Obliquity       -5.33142
	EqAscendNode    -89.1337
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.506 0.413 0.324)

	Surface
	{
		SurfStyle       0.881907
		OceanStyle      0.0707907
		Randomize      (-0.817, 0.865, 0.186)
		colorDistMagn   0.996805
		colorDistFreq   0.424255
		detailScale     706.977
		colorConversion true
		snowLevel       2
		tropicLatitude  0.132103
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492143
		terraceProb     0.348987
		erosion         0
		montesMagn      0.484125
		montesFreq      2.65753
		montesSpiky     0.989426
		montesFraction  0.226988
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.49266
		hillsFraction   0.869728
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257516
		craterFreq      0.220349
		craterDensity   0.671146
		craterOctaves   7.65737
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   14.39
		volcanoTemp     1564.13
		lavaCoverTidal  0
		lavaCoverSun    0.244653
		lavaCoverYoung  0
		colorSea       (0.172, 0.145, 0.130, 0.050)
		colorShelf     (0.202, 0.169, 0.149, 0.040)
		colorBeach     (0.233, 0.194, 0.169, 0.030)
		colorDesert    (0.263, 0.219, 0.191, 0.020)
		colorLowland   (0.293, 0.244, 0.211, 0.030)
		colorUpland    (0.324, 0.268, 0.230, 0.050)
		colorRock      (0.354, 0.293, 0.256, 0.020)
		colorSnow      (0.354, 0.293, 0.256, 1.000)
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
		SemiMajorAxis   0.0852167
		Period          0.305014
		Eccentricity    0.159591
		Inclination     -5.33142
		AscendingNode   -89.1337
		ArgOfPericenter -166.308
		MeanAnomaly     83.6239
	}
}

Asteroid	"S19"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.66167e-016
	Radius          0.0524319
	InertiaMoment   0.398464

	Obliquity       3.92821
	EqAscendNode    115.312
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.710 0.569 0.505)

	Surface
	{
		SurfStyle       0.438547
		OceanStyle      0.29766
		Randomize      (0.268, 0.400, -0.981)
		colorDistMagn   0.746279
		colorDistFreq   1.01659e-006
		detailScale     1.43174
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0732531
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.534854
		terraceProb     0.317219
		erosion         0
		montesMagn      0.531827
		montesFreq      3.13682
		montesSpiky     0.863076
		montesFraction  0.3668
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.58604e-006
		hillsFraction   0.510442
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239739
		craterFreq      0.205353
		craterDensity   0.617256
		craterOctaves   1.32074
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   380.742
		volcanoTemp     1075.77
		lavaCoverTidal  0
		lavaCoverSun    0.353951
		lavaCoverYoung  0
		colorSea       (0.284, 0.227, 0.202, 0.000)
		colorShelf     (0.302, 0.242, 0.214, 0.000)
		colorBeach     (0.319, 0.256, 0.227, 0.000)
		colorDesert    (0.337, 0.270, 0.240, 0.000)
		colorLowland   (0.355, 0.284, 0.252, 0.000)
		colorUpland    (0.373, 0.299, 0.265, 0.000)
		colorRock      (0.390, 0.313, 0.278, 0.000)
		colorSnow      (0.408, 0.327, 0.290, 1.000)
		BumpHeight      0.0471887
		BumpOffset      0.00943774
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0720406
		Period          0.237082
		Eccentricity    0.157006
		Inclination     3.92821
		AscendingNode   115.312
		ArgOfPericenter -96.4552
		MeanAnomaly     172.214
	}
}

Asteroid	"S20"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            6.85989e-013
	Radius          0.678635
	InertiaMoment   0.399491

	RotationPeriod  8390.6
	Obliquity       3.23566
	EqAscendNode    132.557

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.723 0.721 0.717)

	Surface
	{
		SurfStyle       0.549408
		OceanStyle      0.811986
		Randomize      (0.463, -0.013, -0.749)
		colorDistMagn   0.688899
		colorDistFreq   0.00022062
		detailScale     18.5313
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0454011
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501912
		terraceProb     0.110706
		erosion         0
		montesMagn      0.307427
		montesFreq      3.19359
		montesSpiky     0.797783
		montesFraction  0.611426
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000761427
		hillsFraction   0.555057
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23052
		craterFreq      0.199291
		craterDensity   0.72398
		craterOctaves   4.42888
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   128.465
		volcanoTemp     1293.12
		lavaCoverTidal  0
		lavaCoverSun    0.215268
		lavaCoverYoung  0
		colorSea       (0.282, 0.245, 0.201, 0.000)
		colorShelf     (0.289, 0.252, 0.230, 0.000)
		colorBeach     (0.340, 0.296, 0.273, 0.000)
		colorDesert    (0.369, 0.317, 0.265, 0.000)
		colorLowland   (0.405, 0.339, 0.301, 0.000)
		colorUpland    (0.448, 0.411, 0.366, 0.000)
		colorRock      (0.485, 0.447, 0.395, 0.000)
		colorSnow      (0.528, 0.476, 0.416, 1.000)
		BumpHeight      0.610772
		BumpOffset      0.122154
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0878142
		Period          0.319066
		Eccentricity    0.132975
		Inclination     3.23566
		AscendingNode   132.557
		ArgOfPericenter 61.2341
		MeanAnomaly     -94.5459
	}
}

Asteroid	"S21"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.00947e-009
	Radius          6.03897
	InertiaMoment   0.397163

	RotationPeriod  13163.3
	Obliquity       4.93992
	EqAscendNode    95.1175

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.448 0.441 0.436)

	Surface
	{
		SurfStyle       0.433058
		OceanStyle      0.717296
		Randomize      (0.282, 0.943, -0.236)
		colorDistMagn   0.505323
		colorDistFreq   0.0291206
		detailScale     164.904
		colorConversion true
		snowLevel       2
		tropicLatitude  0.116025
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606731
		terraceProb     0.374962
		erosion         0
		montesMagn      0.453071
		montesFreq      2.54164
		montesSpiky     0.965158
		montesFraction  0.477658
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.12159
		hillsFraction   0.539548
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242772
		craterFreq      0.228012
		craterDensity   0.834234
		craterOctaves   6.94092
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.8004
		volcanoTemp     1326.88
		lavaCoverTidal  0
		lavaCoverSun    0.175613
		lavaCoverYoung  0
		colorSea       (0.179, 0.176, 0.175, 0.000)
		colorShelf     (0.190, 0.187, 0.185, 0.000)
		colorBeach     (0.202, 0.198, 0.196, 0.000)
		colorDesert    (0.213, 0.209, 0.207, 0.000)
		colorLowland   (0.224, 0.221, 0.218, 0.000)
		colorUpland    (0.235, 0.232, 0.229, 0.000)
		colorRock      (0.246, 0.243, 0.240, 0.000)
		colorSnow      (0.258, 0.254, 0.251, 1.000)
		BumpHeight      5.43507
		BumpOffset      1.08701
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.097871
		Period          0.375417
		Eccentricity    0.164046
		Inclination     4.93992
		AscendingNode   95.1175
		ArgOfPericenter 144.194
		MeanAnomaly     97.7419
	}
}

Asteroid	"S22"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.91385e-018
	Radius          0.0122285
	InertiaMoment   0.398691

	RotationPeriod  9069.52
	Obliquity       1.14575
	EqAscendNode    19.8413

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.553 0.499)

	Surface
	{
		SurfStyle       0.0495402
		OceanStyle      0.0828911
		Randomize      (0.644, -0.624, 0.203)
		colorDistMagn   0.666788
		colorDistFreq   9.52219e-008
		detailScale     0.333918
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0393861
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.523538
		terraceProb     0.20826
		erosion         0
		montesMagn      0.534652
		montesFreq      2.76027
		montesSpiky     0.884656
		montesFraction  0.769196
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.40458e-007
		hillsFraction   0.730214
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233182
		craterFreq      0.241967
		craterDensity   0
		craterOctaves   0.557295
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   788.392
		volcanoTemp     1205.8
		lavaCoverTidal  0
		lavaCoverSun    0.266694
		lavaCoverYoung  0
		colorSea       (0.262, 0.221, 0.200, 0.000)
		colorShelf     (0.278, 0.235, 0.212, 0.000)
		colorBeach     (0.294, 0.249, 0.225, 0.000)
		colorDesert    (0.311, 0.263, 0.237, 0.000)
		colorLowland   (0.327, 0.277, 0.250, 0.000)
		colorUpland    (0.343, 0.290, 0.262, 0.000)
		colorRock      (0.360, 0.304, 0.275, 0.000)
		colorSnow      (0.376, 0.318, 0.287, 1.000)
		BumpHeight      0.0110056
		BumpOffset      0.00220112
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0763484
		Period          0.258662
		Eccentricity    0.078785
		Inclination     1.14575
		AscendingNode   19.8413
		ArgOfPericenter -126.466
		MeanAnomaly     -12.8533
	}
}

Asteroid	"S23"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            8.7025e-015
	Radius          0.158275
	InertiaMoment   0.399671

	RotationPeriod  7674.82
	Obliquity       0.846122
	EqAscendNode    98.3022

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.653 0.650 0.646)

	Surface
	{
		SurfStyle       0.0586248
		OceanStyle      0.764327
		Randomize      (0.067, -0.269, -0.186)
		colorDistMagn   0.903798
		colorDistFreq   1.53803e-005
		detailScale     4.32197
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0193155
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.580573
		terraceProb     0.414995
		erosion         0
		montesMagn      0.329509
		montesFreq      3.28243
		montesSpiky     0.984676
		montesFraction  0.477547
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.80503e-005
		hillsFraction   0.808118
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228392
		craterFreq      0.261834
		craterDensity   0.557741
		craterOctaves   1.21318
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   266.009
		volcanoTemp     1580.92
		lavaCoverTidal  0
		lavaCoverSun    0.472391
		lavaCoverYoung  0
		colorSea       (0.261, 0.260, 0.258, 0.000)
		colorShelf     (0.278, 0.276, 0.275, 0.000)
		colorBeach     (0.294, 0.292, 0.291, 0.000)
		colorDesert    (0.310, 0.309, 0.307, 0.000)
		colorLowland   (0.327, 0.325, 0.323, 0.000)
		colorUpland    (0.343, 0.341, 0.339, 0.000)
		colorRock      (0.359, 0.357, 0.355, 0.000)
		colorSnow      (0.376, 0.374, 0.371, 1.000)
		BumpHeight      0.142448
		BumpOffset      0.0284895
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0588639
		Period          0.175108
		Eccentricity    0.0893328
		Inclination     0.846122
		AscendingNode   98.3022
		ArgOfPericenter -139.613
		MeanAnomaly     6.8031
	}
}

Asteroid	"S24"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.28062e-011
	Radius          1.40847
	InertiaMoment   0.39758

	Obliquity       -0.0352685
	EqAscendNode    -110.569
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.623 0.621 0.618)

	Surface
	{
		SurfStyle       0.251013
		OceanStyle      0.92677
		Randomize      (-0.109, -0.658, 0.746)
		colorDistMagn   0.41248
		colorDistFreq   0.001275
		detailScale     38.4607
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000690534
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.635962
		terraceProb     0.375208
		erosion         0
		montesMagn      0.464943
		montesFreq      3.94073
		montesSpiky     0.847045
		montesFraction  0.524033
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00500604
		hillsFraction   0.741759
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215067
		craterFreq      0.204342
		craterDensity   0.744621
		craterOctaves   6.01918
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   61.7083
		volcanoTemp     1541.55
		lavaCoverTidal  0
		lavaCoverSun    0.139541
		lavaCoverYoung  0
		colorSea       (0.249, 0.248, 0.247, 0.000)
		colorShelf     (0.265, 0.264, 0.263, 0.000)
		colorBeach     (0.280, 0.279, 0.278, 0.000)
		colorDesert    (0.296, 0.295, 0.294, 0.000)
		colorLowland   (0.311, 0.310, 0.309, 0.000)
		colorUpland    (0.327, 0.326, 0.325, 0.000)
		colorRock      (0.342, 0.341, 0.340, 0.000)
		colorSnow      (0.358, 0.357, 0.355, 1.000)
		BumpHeight      1.26762
		BumpOffset      0.253525
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.102132
		Period          0.400197
		Eccentricity    0.115483
		Inclination     -0.0352685
		AscendingNode   -110.569
		ArgOfPericenter -84.7523
		MeanAnomaly     121.44
	}
}

Asteroid	"S25"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.88451e-008
	Radius          17.9934
	InertiaMoment   0.398902

	Obliquity       -0.307945
	EqAscendNode    103.084
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.693 0.689 0.686)

	Surface
	{
		SurfStyle       0.315234
		OceanStyle      0.653541
		Randomize      (0.159, -0.879, -0.026)
		colorDistMagn   0.402822
		colorDistFreq   0.142069
		detailScale     491.339
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00668603
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501137
		terraceProb     0.489628
		erosion         0
		montesMagn      0.515903
		montesFreq      2.87915
		montesSpiky     0.976441
		montesFraction  0.362927
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.634677
		hillsFraction   0.682993
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246989
		craterFreq      0.256929
		craterDensity   0.55354
		craterOctaves   3.11066
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   20.5504
		volcanoTemp     1462.85
		lavaCoverTidal  0
		lavaCoverSun    0.516009
		lavaCoverYoung  0
		colorSea       (0.277, 0.276, 0.275, 0.000)
		colorShelf     (0.294, 0.293, 0.292, 0.000)
		colorBeach     (0.312, 0.310, 0.309, 0.000)
		colorDesert    (0.329, 0.327, 0.326, 0.000)
		colorLowland   (0.346, 0.345, 0.343, 0.000)
		colorUpland    (0.364, 0.362, 0.360, 0.000)
		colorRock      (0.381, 0.379, 0.378, 0.000)
		colorSnow      (0.398, 0.396, 0.395, 1.000)
		BumpHeight      16.194
		BumpOffset      3.23881
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0540675
		Period          0.154148
		Eccentricity    0.0470059
		Inclination     -0.307945
		AscendingNode   103.084
		ArgOfPericenter -31.9194
		MeanAnomaly     96.8756
	}
}

Asteroid	"S26"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.10401e-016
	Radius          0.0369138
	InertiaMoment   0.399849

	Obliquity       -2.18629
	EqAscendNode    126.298
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.787 0.756 0.707)

	Surface
	{
		SurfStyle       0.74379
		OceanStyle      0.266017
		Randomize      (-0.255, -0.870, 0.650)
		colorDistMagn   0.383064
		colorDistFreq   1.63889e-007
		detailScale     1.00799
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0344559
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.385697
		terraceProb     0.372028
		erosion         0
		montesMagn      0.633938
		montesFreq      2.43155
		montesSpiky     0.776895
		montesFraction  0.260411
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.5773e-006
		hillsFraction   0.592879
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259973
		craterFreq      0.273448
		craterDensity   0
		craterOctaves   0.703933
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   550.818
		volcanoTemp     1561.38
		lavaCoverTidal  0
		lavaCoverSun    0.427734
		lavaCoverYoung  0
		colorSea       (0.307, 0.257, 0.198, 0.000)
		colorShelf     (0.315, 0.264, 0.226, 0.000)
		colorBeach     (0.370, 0.310, 0.269, 0.000)
		colorDesert    (0.401, 0.332, 0.262, 0.000)
		colorLowland   (0.441, 0.355, 0.297, 0.000)
		colorUpland    (0.488, 0.431, 0.361, 0.000)
		colorRock      (0.527, 0.468, 0.389, 0.000)
		colorSnow      (0.574, 0.499, 0.410, 1.000)
		BumpHeight      0.0332224
		BumpOffset      0.00664448
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0600961
		Period          0.180635
		Eccentricity    0.0581563
		Inclination     -2.18629
		AscendingNode   126.298
		ArgOfPericenter -134.881
		MeanAnomaly     -111.173
	}
}

Asteroid	"S27"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.62461e-013
	Radius          0.328492
	InertiaMoment   0.397912

	Obliquity       4.31808
	EqAscendNode    -146.958
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.559 0.553 0.547)

	Surface
	{
		SurfStyle       0.979776
		OceanStyle      0.716438
		Randomize      (-0.675, -0.123, 0.312)
		colorDistMagn   0.725339
		colorDistFreq   1.84562e-005
		detailScale     8.97003
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0428116
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.529849
		terraceProb     0.646258
		erosion         0
		montesMagn      0.594909
		montesFreq      3.43924
		montesSpiky     0.91346
		montesFraction  0.309558
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000262716
		hillsFraction   0.583176
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263919
		craterFreq      0.216293
		craterDensity   0.769638
		craterOctaves   3.28919
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   127.778
		volcanoTemp     1448.82
		lavaCoverTidal  0
		lavaCoverSun    0.273127
		lavaCoverYoung  0
		colorSea       (0.190, 0.194, 0.219, 0.050)
		colorShelf     (0.224, 0.227, 0.252, 0.040)
		colorBeach     (0.257, 0.260, 0.285, 0.030)
		colorDesert    (0.291, 0.293, 0.323, 0.020)
		colorLowland   (0.324, 0.326, 0.356, 0.030)
		colorUpland    (0.358, 0.360, 0.389, 0.050)
		colorRock      (0.392, 0.393, 0.432, 0.020)
		colorSnow      (0.392, 0.393, 0.432, 1.000)
		BumpHeight      0.295643
		BumpOffset      0.0591286
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.071021
		Period          0.232067
		Eccentricity    0.0140708
		Inclination     4.31808
		AscendingNode   -146.958
		ArgOfPericenter -42.2271
		MeanAnomaly     1.50392
	}
}

Asteroid	"S28"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.3907e-010
	Radius          4.19679
	InertiaMoment   0.399102

	Obliquity       -1.66054
	EqAscendNode    79.4479
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.769 0.708 0.635)

	Surface
	{
		SurfStyle       0.422453
		OceanStyle      0.324712
		Randomize      (0.369, 0.189, -0.510)
		colorDistMagn   0.0442704
		colorDistFreq   0.00748345
		detailScale     114.6
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0445645
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.702511
		terraceProb     0.360107
		erosion         0
		montesMagn      0.603012
		montesFreq      2.56036
		montesSpiky     0.989797
		montesFraction  0.347114
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0464424
		hillsFraction   0.714663
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238814
		craterFreq      0.219069
		craterDensity   0.713451
		craterOctaves   5.77709
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.556
		volcanoTemp     1493.14
		lavaCoverTidal  0
		lavaCoverSun    0.252446
		lavaCoverYoung  0
		colorSea       (0.308, 0.283, 0.254, 0.000)
		colorShelf     (0.327, 0.301, 0.270, 0.000)
		colorBeach     (0.346, 0.319, 0.286, 0.000)
		colorDesert    (0.365, 0.336, 0.302, 0.000)
		colorLowland   (0.385, 0.354, 0.318, 0.000)
		colorUpland    (0.404, 0.372, 0.333, 0.000)
		colorRock      (0.423, 0.390, 0.349, 0.000)
		colorSnow      (0.442, 0.407, 0.365, 1.000)
		BumpHeight      3.77711
		BumpOffset      0.755422
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0761579
		Period          0.257694
		Eccentricity    0.0508298
		Inclination     -1.66054
		AscendingNode   79.448
		ArgOfPericenter -147
		MeanAnomaly     144.222
	}
}

Asteroid	"S29"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.51804e-007
	Radius          54.3068
	InertiaMoment   0.39485

	RotationPeriod  3319.91
	Obliquity       2.98673
	EqAscendNode    -27.4267

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.626 0.533 0.364)

	Surface
	{
		SurfStyle       0.175391
		OceanStyle      0.176745
		Randomize      (0.822, -0.084, 0.906)
		colorDistMagn   0.650608
		colorDistFreq   1.91091
		detailScale     1482.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.101109
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.529683
		terraceProb     0.21216
		erosion         0
		montesMagn      0.499919
		montesFreq      3.59022
		montesSpiky     0.758735
		montesFraction  0.415419
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.50866
		hillsFraction   0.527221
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220319
		craterFreq      0.209257
		craterDensity   0.446119
		craterOctaves   3.98513
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   14.3552
		volcanoTemp     1872.63
		lavaCoverTidal  0
		lavaCoverSun    0.490431
		lavaCoverYoung  0
		colorSea       (0.250, 0.213, 0.146, 0.000)
		colorShelf     (0.266, 0.227, 0.155, 0.000)
		colorBeach     (0.282, 0.240, 0.164, 0.000)
		colorDesert    (0.297, 0.253, 0.173, 0.000)
		colorLowland   (0.313, 0.267, 0.182, 0.000)
		colorUpland    (0.329, 0.280, 0.191, 0.000)
		colorRock      (0.344, 0.293, 0.200, 0.000)
		colorSnow      (0.360, 0.307, 0.209, 1.000)
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
		SemiMajorAxis   0.0620176
		Period          0.189367
		Eccentricity    0.16917
		Inclination     2.98673
		AscendingNode   -27.4267
		ArgOfPericenter 25.6163
		MeanAnomaly     64.8169
	}
}

Asteroid	"S30"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.061e-015
	Radius          0.0766129
	InertiaMoment   0.398195

	RotationPeriod  1361.76
	Obliquity       -2.92393
	EqAscendNode    96.9181

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.485 0.480 0.474)

	Surface
	{
		SurfStyle       0.203181
		OceanStyle      0.905438
		Randomize      (0.672, -0.762, -0.526)
		colorDistMagn   0.7993
		colorDistFreq   3.59942e-006
		detailScale     2.09204
		colorConversion true
		snowLevel       2
		tropicLatitude  0.067616
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.389693
		terraceProb     0.4222
		erosion         0
		montesMagn      0.465235
		montesFreq      3.43061
		montesSpiky     0.955662
		montesFraction  0.498394
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.98183e-006
		hillsFraction   0.727621
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233896
		craterFreq      0.224816
		craterDensity   0.629498
		craterOctaves   1.40864
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   264.587
		volcanoTemp     1289.95
		lavaCoverTidal  0
		lavaCoverSun    0.33112
		lavaCoverYoung  0
		colorSea       (0.194, 0.192, 0.190, 0.000)
		colorShelf     (0.206, 0.204, 0.201, 0.000)
		colorBeach     (0.218, 0.216, 0.213, 0.000)
		colorDesert    (0.230, 0.228, 0.225, 0.000)
		colorLowland   (0.242, 0.240, 0.237, 0.000)
		colorUpland    (0.254, 0.252, 0.249, 0.000)
		colorRock      (0.267, 0.264, 0.261, 0.000)
		colorSnow      (0.279, 0.276, 0.272, 1.000)
		BumpHeight      0.0689516
		BumpOffset      0.0137903
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.071216
		Period          0.233023
		Eccentricity    0.109058
		Inclination     -2.92393
		AscendingNode   96.9181
		ArgOfPericenter 101.344
		MeanAnomaly     0.535298
	}
}

Asteroid	"S31"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.03286e-012
	Radius          0.97881
	InertiaMoment   0.399293

	Obliquity       2.77823
	EqAscendNode    60.9741
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.446 0.441 0.438)

	Surface
	{
		SurfStyle       0.131503
		OceanStyle      0.678325
		Randomize      (-0.388, 0.852, -0.586)
		colorDistMagn   0.222019
		colorDistFreq   0.000645409
		detailScale     26.728
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0834646
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.401206
		terraceProb     0.210565
		erosion         0
		montesMagn      0.439897
		montesFreq      2.80679
		montesSpiky     0.855483
		montesFraction  0.296126
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00242953
		hillsFraction   0.809712
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271569
		craterFreq      0.192165
		craterDensity   0.832754
		craterOctaves   5.11148
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   88.1207
		volcanoTemp     1851.8
		lavaCoverTidal  0
		lavaCoverSun    0.153096
		lavaCoverYoung  0
		colorSea       (0.178, 0.177, 0.175, 0.000)
		colorShelf     (0.190, 0.188, 0.186, 0.000)
		colorBeach     (0.201, 0.199, 0.197, 0.000)
		colorDesert    (0.212, 0.210, 0.208, 0.000)
		colorLowland   (0.223, 0.221, 0.219, 0.000)
		colorUpland    (0.234, 0.232, 0.230, 0.000)
		colorRock      (0.245, 0.243, 0.241, 0.000)
		colorSnow      (0.257, 0.254, 0.252, 1.000)
		BumpHeight      0.880929
		BumpOffset      0.176186
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0964094
		Period          0.367039
		Eccentricity    0.0892657
		Inclination     2.77823
		AscendingNode   60.9741
		ArgOfPericenter 49.0665
		MeanAnomaly     178.053
	}
}

Asteroid	"S32"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.46302e-009
	Radius          12.6684
	InertiaMoment   0.396502

	Obliquity       1.34591
	EqAscendNode    38.7112
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.416 0.412 0.410)

	Surface
	{
		SurfStyle       0.569789
		OceanStyle      0.748517
		Randomize      (-0.804, 0.347, 0.859)
		colorDistMagn   0.981589
		colorDistFreq   0.0742138
		detailScale     345.931
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0443112
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.686622
		terraceProb     0.116251
		erosion         0
		montesMagn      0.662054
		montesFreq      3.01953
		montesSpiky     0.889913
		montesFraction  0.529053
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.284804
		hillsFraction   0.596184
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218732
		craterFreq      0.20895
		craterDensity   0.630362
		craterOctaves   4.43592
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.7312
		volcanoTemp     1464.41
		lavaCoverTidal  0
		lavaCoverSun    0.412267
		lavaCoverYoung  0
		colorSea       (0.162, 0.140, 0.115, 0.000)
		colorShelf     (0.166, 0.144, 0.131, 0.000)
		colorBeach     (0.195, 0.169, 0.156, 0.000)
		colorDesert    (0.212, 0.181, 0.152, 0.000)
		colorLowland   (0.233, 0.194, 0.172, 0.000)
		colorUpland    (0.258, 0.235, 0.209, 0.000)
		colorRock      (0.278, 0.256, 0.225, 0.000)
		colorSnow      (0.303, 0.272, 0.238, 1.000)
		BumpHeight      11.4015
		BumpOffset      2.28031
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0602464
		Period          0.181313
		Eccentricity    0.0417261
		Inclination     1.34591
		AscendingNode   38.7112
		ArgOfPericenter -109.866
		MeanAnomaly     -29.583
	}
}

Asteroid	"S33"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.6146e-017
	Radius          0.0178681
	InertiaMoment   0.398446

	Obliquity       -3.93153
	EqAscendNode    -147.227
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.759 0.712 0.664)

	Surface
	{
		SurfStyle       0.663471
		OceanStyle      0.879081
		Randomize      (-0.535, -0.154, -0.634)
		colorDistMagn   0.430642
		colorDistFreq   7.94111e-008
		detailScale     0.487917
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0386796
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.630708
		terraceProb     0.258289
		erosion         0
		montesMagn      0.558
		montesFreq      3.16009
		montesSpiky     0.80399
		montesFraction  0.457907
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.36025e-007
		hillsFraction   0.830029
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237583
		craterFreq      0.225346
		craterDensity   0
		craterOctaves   0.295713
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   547.875
		volcanoTemp     1495.56
		lavaCoverTidal  0
		lavaCoverSun    0.479659
		lavaCoverYoung  0
		colorSea       (0.296, 0.242, 0.186, 0.000)
		colorShelf     (0.303, 0.249, 0.212, 0.000)
		colorBeach     (0.357, 0.292, 0.252, 0.000)
		colorDesert    (0.387, 0.313, 0.246, 0.000)
		colorLowland   (0.425, 0.334, 0.279, 0.000)
		colorUpland    (0.470, 0.406, 0.338, 0.000)
		colorRock      (0.508, 0.441, 0.365, 0.000)
		colorSnow      (0.554, 0.470, 0.385, 1.000)
		BumpHeight      0.0160813
		BumpOffset      0.00321625
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0577056
		Period          0.169965
		Eccentricity    0.076246
		Inclination     -3.93153
		AscendingNode   -147.227
		ArgOfPericenter -83.3119
		MeanAnomaly     144.024
	}
}

Asteroid	"S34"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.84752e-014
	Radius          0.228284
	InertiaMoment   0.399477

	RotationPeriod  4034.31
	Obliquity       1.35944
	EqAscendNode    129.409

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.837 0.757 0.730)

	Surface
	{
		SurfStyle       0.297576
		OceanStyle      0.194965
		Randomize      (0.595, 0.709, 0.853)
		colorDistMagn   0.565625
		colorDistFreq   4.62157e-005
		detailScale     6.23367
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0202729
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.363954
		terraceProb     0.196853
		erosion         0
		montesMagn      0.465174
		montesFreq      3.76019
		montesSpiky     0.868244
		montesFraction  0.369778
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000143479
		hillsFraction   0.666016
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267995
		craterFreq      0.238102
		craterDensity   0.570653
		craterOctaves   2.73509
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   182.47
		volcanoTemp     1461.16
		lavaCoverTidal  0
		lavaCoverSun    0.273964
		lavaCoverYoung  0
		colorSea       (0.335, 0.303, 0.292, 0.000)
		colorShelf     (0.356, 0.322, 0.310, 0.000)
		colorBeach     (0.377, 0.341, 0.329, 0.000)
		colorDesert    (0.398, 0.360, 0.347, 0.000)
		colorLowland   (0.418, 0.379, 0.365, 0.000)
		colorUpland    (0.439, 0.398, 0.383, 0.000)
		colorRock      (0.460, 0.416, 0.402, 0.000)
		colorSnow      (0.481, 0.435, 0.420, 1.000)
		BumpHeight      0.205456
		BumpOffset      0.0410911
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.07975
		Period          0.27614
		Eccentricity    0.139911
		Inclination     1.35944
		AscendingNode   129.409
		ArgOfPericenter 136.704
		MeanAnomaly     -22.3633
	}
}

Asteroid	"S35"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.66183e-011
	Radius          2.9547
	InertiaMoment   0.397125

	RotationPeriod  4155.73
	Obliquity       -2.31918
	EqAscendNode    40.0846

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.706 0.624 0.568)

	Surface
	{
		SurfStyle       0.675215
		OceanStyle      0.991841
		Randomize      (-0.374, 0.792, 0.186)
		colorDistMagn   0.86724
		colorDistFreq   0.00450436
		detailScale     80.683
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0759767
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464841
		terraceProb     0.485875
		erosion         0
		montesMagn      0.508173
		montesFreq      3.11091
		montesSpiky     0.991629
		montesFraction  0.620221
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.026696
		hillsFraction   0.544814
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232579
		craterFreq      0.183109
		craterDensity   0.733672
		craterOctaves   4.38659
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   61.566
		volcanoTemp     1557.53
		lavaCoverTidal  0
		lavaCoverSun    0.317558
		lavaCoverYoung  0
		colorSea       (0.275, 0.212, 0.159, 0.000)
		colorShelf     (0.282, 0.218, 0.182, 0.000)
		colorBeach     (0.332, 0.256, 0.216, 0.000)
		colorDesert    (0.360, 0.275, 0.210, 0.000)
		colorLowland   (0.395, 0.293, 0.238, 0.000)
		colorUpland    (0.438, 0.356, 0.290, 0.000)
		colorRock      (0.473, 0.387, 0.312, 0.000)
		colorSnow      (0.515, 0.412, 0.329, 1.000)
		BumpHeight      2.65923
		BumpOffset      0.531846
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0720325
		Period          0.237042
		Eccentricity    0.100402
		Inclination     -2.31918
		AscendingNode   40.0846
		ArgOfPericenter -89.9366
		MeanAnomaly     34.5572
	}
}

Asteroid	"S36"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            8.33169e-008
	Radius          26.29
	InertiaMoment   0.398674

	RotationPeriod  1592.03
	Obliquity       -1.09585
	EqAscendNode    -91.3598

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.804 0.763 0.730)

	Surface
	{
		SurfStyle       0.42737
		OceanStyle      0.281717
		Randomize      (0.054, -0.316, 0.039)
		colorDistMagn   0.7246
		colorDistFreq   0.611438
		detailScale     717.893
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0267218
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.474645
		terraceProb     0.159538
		erosion         0
		montesMagn      0.334183
		montesFreq      1.57311
		montesSpiky     0.936548
		montesFraction  0.320126
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.78372
		hillsFraction   0.41265
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22988
		craterFreq      0.164986
		craterDensity   0.583853
		craterOctaves   6.79196
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   14.2801
		volcanoTemp     1430.13
		lavaCoverTidal  0
		lavaCoverSun    0.291621
		lavaCoverYoung  0
		colorSea       (0.322, 0.305, 0.292, 0.000)
		colorShelf     (0.342, 0.324, 0.310, 0.000)
		colorBeach     (0.362, 0.343, 0.329, 0.000)
		colorDesert    (0.382, 0.362, 0.347, 0.000)
		colorLowland   (0.402, 0.382, 0.365, 0.000)
		colorUpland    (0.422, 0.401, 0.383, 0.000)
		colorRock      (0.442, 0.420, 0.402, 0.000)
		colorSnow      (0.462, 0.439, 0.420, 1.000)
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
		SemiMajorAxis   0.0790336
		Period          0.272427
		Eccentricity    0.161157
		Inclination     -1.09585
		AscendingNode   -91.3598
		ArgOfPericenter -118.326
		MeanAnomaly     -64.3147
	}
}

Asteroid	"S37"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.88101e-016
	Radius          0.0532416
	InertiaMoment   0.399658

	Obliquity       1.42397
	EqAscendNode    -16.8877
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.412 0.407 0.405)

	Surface
	{
		SurfStyle       0.926611
		OceanStyle      0.853384
		Randomize      (-0.564, -0.476, -0.272)
		colorDistMagn   0.717286
		colorDistFreq   2.26547e-006
		detailScale     1.45385
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0491478
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.568643
		terraceProb     0.543723
		erosion         0
		montesMagn      0.443104
		montesFreq      3.6728
		montesSpiky     0.960687
		montesFraction  0.36799
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.23411e-006
		hillsFraction   0.66926
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23069
		craterFreq      0.152519
		craterDensity   0.560151
		craterOctaves   1.21582
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   377.835
		volcanoTemp     1295.25
		lavaCoverTidal  0
		lavaCoverSun    0.382212
		lavaCoverYoung  0
		colorSea       (0.140, 0.143, 0.162, 0.050)
		colorShelf     (0.165, 0.167, 0.186, 0.040)
		colorBeach     (0.189, 0.191, 0.211, 0.030)
		colorDesert    (0.214, 0.216, 0.239, 0.020)
		colorLowland   (0.239, 0.240, 0.263, 0.030)
		colorUpland    (0.263, 0.265, 0.288, 0.050)
		colorRock      (0.288, 0.289, 0.320, 0.020)
		colorSnow      (0.288, 0.289, 0.320, 1.000)
		BumpHeight      0.0479175
		BumpOffset      0.00958349
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0675524
		Period          0.215275
		Eccentricity    0.125664
		Inclination     1.42397
		AscendingNode   -16.8877
		ArgOfPericenter 175.006
		MeanAnomaly     -40.2696
	}
}

Asteroid	"S38"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            7.18266e-013
	Radius          0.689116
	InertiaMoment   0.397551

	RotationPeriod  2483.9
	Obliquity       3.71181
	EqAscendNode    179.962

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.547 0.495 0.426)

	Surface
	{
		SurfStyle       0.668611
		OceanStyle      0.281447
		Randomize      (0.264, 0.769, 0.278)
		colorDistMagn   0.2696
		colorDistFreq   0.000386268
		detailScale     18.8175
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.429504
		terraceProb     0.149465
		erosion         0
		montesMagn      0.466055
		montesFreq      2.12882
		montesSpiky     0.979953
		montesFraction  0.458645
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00102131
		hillsFraction   0.744841
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276676
		craterFreq      0.229142
		craterDensity   0.403686
		craterOctaves   2.64628
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   127.484
		volcanoTemp     1663.12
		lavaCoverTidal  0
		lavaCoverSun    0.40507
		lavaCoverYoung  0
		colorSea       (0.213, 0.168, 0.119, 0.000)
		colorShelf     (0.219, 0.173, 0.136, 0.000)
		colorBeach     (0.257, 0.203, 0.162, 0.000)
		colorDesert    (0.279, 0.218, 0.158, 0.000)
		colorLowland   (0.306, 0.233, 0.179, 0.000)
		colorUpland    (0.339, 0.282, 0.217, 0.000)
		colorRock      (0.366, 0.307, 0.234, 0.000)
		colorSnow      (0.399, 0.327, 0.247, 1.000)
		BumpHeight      0.620204
		BumpOffset      0.124041
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0669752
		Period          0.212522
		Eccentricity    0.147723
		Inclination     3.71181
		AscendingNode   179.962
		ArgOfPericenter -18.3827
		MeanAnomaly     -114.235
	}
}

Asteroid	"S39"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.05697e-009
	Radius          6.13224
	InertiaMoment   0.398886

	Obliquity       -0.556642
	EqAscendNode    129.969
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.671 0.668 0.666)

	Surface
	{
		SurfStyle       0.472551
		OceanStyle      0.748313
		Randomize      (-0.279, -0.279, -0.868)
		colorDistMagn   0.22236
		colorDistFreq   0.00779093
		detailScale     167.451
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00821409
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.579487
		terraceProb     0.266112
		erosion         0
		montesMagn      0.468221
		montesFreq      3.45614
		montesSpiky     0.970746
		montesFraction  0.716313
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.075962
		hillsFraction   0.681526
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227101
		craterFreq      0.237684
		craterDensity   0.611807
		craterOctaves   4.92796
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.5729
		volcanoTemp     1499.38
		lavaCoverTidal  0
		lavaCoverSun    0.313506
		lavaCoverYoung  0
		colorSea       (0.269, 0.267, 0.266, 0.000)
		colorShelf     (0.285, 0.284, 0.283, 0.000)
		colorBeach     (0.302, 0.301, 0.300, 0.000)
		colorDesert    (0.319, 0.317, 0.316, 0.000)
		colorLowland   (0.336, 0.334, 0.333, 0.000)
		colorUpland    (0.352, 0.351, 0.350, 0.000)
		colorRock      (0.369, 0.367, 0.366, 0.000)
		colorSnow      (0.386, 0.384, 0.383, 1.000)
		BumpHeight      5.51901
		BumpOffset      1.1038
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0764511
		Period          0.259184
		Eccentricity    0.160567
		Inclination     -0.556642
		AscendingNode   129.969
		ArgOfPericenter 61.9775
		MeanAnomaly     -21.2934
	}
}

Asteroid	"S40"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            6.1921e-018
	Radius          0.0124173
	InertiaMoment   0.399835

	Obliquity       5.01156
	EqAscendNode    139.542
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.611 0.608 0.603)

	Surface
	{
		SurfStyle       0.712047
		OceanStyle      0.122165
		Randomize      (-0.393, 0.004, 0.929)
		colorDistMagn   0.764811
		colorDistFreq   5.83397e-008
		detailScale     0.339076
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0603833
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.445827
		terraceProb     0.340203
		erosion         0
		montesMagn      0.475576
		montesFreq      3.23162
		montesSpiky     0.996757
		montesFraction  0.544767
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.50631e-007
		hillsFraction   0.847127
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237811
		craterFreq      0.217856
		craterDensity   0
		craterOctaves   0.428274
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   782.375
		volcanoTemp     1156.15
		lavaCoverTidal  0
		lavaCoverSun    0.363496
		lavaCoverYoung  0
		colorSea       (0.238, 0.207, 0.169, 0.000)
		colorShelf     (0.245, 0.213, 0.193, 0.000)
		colorBeach     (0.287, 0.249, 0.229, 0.000)
		colorDesert    (0.312, 0.267, 0.223, 0.000)
		colorLowland   (0.342, 0.286, 0.253, 0.000)
		colorUpland    (0.379, 0.346, 0.307, 0.000)
		colorRock      (0.410, 0.377, 0.331, 0.000)
		colorSnow      (0.446, 0.401, 0.349, 1.000)
		BumpHeight      0.0111756
		BumpOffset      0.00223512
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0690058
		Period          0.22226
		Eccentricity    0.122635
		Inclination     5.01156
		AscendingNode   139.542
		ArgOfPericenter -129.332
		MeanAnomaly     -38.1598
	}
}

Asteroid	"S41"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            9.11201e-015
	Radius          0.16072
	InertiaMoment   0.397889

	RotationPeriod  4682.96
	Obliquity       -2.1283
	EqAscendNode    109.208

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.642 0.637 0.631)

	Surface
	{
		SurfStyle       0.134596
		OceanStyle      0.117768
		Randomize      (0.367, -0.338, -0.291)
		colorDistMagn   0.523779
		colorDistFreq   1.67028e-005
		detailScale     4.38872
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0430115
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.551109
		terraceProb     0.57245
		erosion         0
		montesMagn      0.559098
		montesFreq      2.88468
		montesSpiky     0.985426
		montesFraction  0.549848
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.8113e-005
		hillsFraction   0.693719
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231555
		craterFreq      0.17174
		craterDensity   0.589532
		craterOctaves   2.31029
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   263.978
		volcanoTemp     1454.88
		lavaCoverTidal  0
		lavaCoverSun    0.25254
		lavaCoverYoung  0
		colorSea       (0.257, 0.255, 0.252, 0.000)
		colorShelf     (0.273, 0.271, 0.268, 0.000)
		colorBeach     (0.289, 0.287, 0.284, 0.000)
		colorDesert    (0.305, 0.303, 0.300, 0.000)
		colorLowland   (0.321, 0.319, 0.316, 0.000)
		colorUpland    (0.337, 0.334, 0.331, 0.000)
		colorRock      (0.353, 0.350, 0.347, 0.000)
		colorSnow      (0.369, 0.366, 0.363, 1.000)
		BumpHeight      0.144648
		BumpOffset      0.0289296
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0780029
		Period          0.267115
		Eccentricity    0.0764381
		Inclination     -2.1283
		AscendingNode   109.208
		ArgOfPericenter -65.766
		MeanAnomaly     -127.37
	}
}

Asteroid	"S42"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.34088e-011
	Radius          1.43023
	InertiaMoment   0.399086

	RotationPeriod  929.015
	Obliquity       -6.33733
	EqAscendNode    -42.2215

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.752 0.748 0.745)

	Surface
	{
		SurfStyle       0.742218
		OceanStyle      0.14618
		Randomize      (0.233, -0.467, -0.764)
		colorDistMagn   0.529794
		colorDistFreq   0.000841325
		detailScale     39.0547
		colorConversion true
		snowLevel       2
		tropicLatitude  0.204853
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.477197
		terraceProb     0.317536
		erosion         0
		montesMagn      0.538092
		montesFreq      3.54037
		montesSpiky     0.985614
		montesFraction  0.247054
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.004209
		hillsFraction   0.569838
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270217
		craterFreq      0.255806
		craterDensity   0.464969
		craterOctaves   2.09074
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   61.2372
		volcanoTemp     1760.12
		lavaCoverTidal  0
		lavaCoverSun    0.51383
		lavaCoverYoung  0
		colorSea       (0.293, 0.254, 0.209, 0.000)
		colorShelf     (0.301, 0.262, 0.238, 0.000)
		colorBeach     (0.353, 0.307, 0.283, 0.000)
		colorDesert    (0.383, 0.329, 0.276, 0.000)
		colorLowland   (0.421, 0.351, 0.313, 0.000)
		colorUpland    (0.466, 0.426, 0.380, 0.000)
		colorRock      (0.504, 0.464, 0.410, 0.000)
		colorSnow      (0.549, 0.493, 0.432, 1.000)
		BumpHeight      1.2872
		BumpOffset      0.257441
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0551899
		Period          0.158973
		Eccentricity    0.0663868
		Inclination     -6.33733
		AscendingNode   -42.2215
		ArgOfPericenter -30.3982
		MeanAnomaly     -0.642198
	}
}

Asteroid	"S43"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.97317e-008
	Radius          18.2713
	InertiaMoment   0.394331

	Obliquity       1.41705
	EqAscendNode    -169.626
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.777 0.774 0.773)

	Surface
	{
		SurfStyle       0.171868
		OceanStyle      0.256613
		Randomize      (0.098, -0.005, -0.980)
		colorDistMagn   0.611878
		colorDistFreq   0.111531
		detailScale     498.927
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00447516
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.616345
		terraceProb     0.45925
		erosion         0
		montesMagn      0.410852
		montesFreq      3.72335
		montesSpiky     0.961019
		montesFraction  0.546623
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.787581
		hillsFraction   0.600791
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211501
		craterFreq      0.192139
		craterDensity   0.758972
		craterOctaves   9.16102
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   20.3935
		volcanoTemp     1396.69
		lavaCoverTidal  0
		lavaCoverSun    0.132881
		lavaCoverYoung  0
		colorSea       (0.311, 0.310, 0.309, 0.000)
		colorShelf     (0.330, 0.329, 0.329, 0.000)
		colorBeach     (0.349, 0.348, 0.348, 0.000)
		colorDesert    (0.369, 0.368, 0.367, 0.000)
		colorLowland   (0.388, 0.387, 0.387, 0.000)
		colorUpland    (0.408, 0.407, 0.406, 0.000)
		colorRock      (0.427, 0.426, 0.425, 0.000)
		colorSnow      (0.447, 0.445, 0.445, 1.000)
		BumpHeight      16.4441
		BumpOffset      3.28883
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0980354
		Period          0.376363
		Eccentricity    0.0523815
		Inclination     1.41705
		AscendingNode   -169.626
		ArgOfPericenter 149.31
		MeanAnomaly     -127.104
	}
}

Asteroid	"S44"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.15595e-016
	Radius          0.0329404
	InertiaMoment   0.398174

	Obliquity       2.36663
	EqAscendNode    -117.81
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.679 0.621 0.538)

	Surface
	{
		SurfStyle       0.569768
		OceanStyle      0.856512
		Randomize      (-0.191, 0.293, -0.148)
		colorDistMagn   0.590139
		colorDistFreq   8.19102e-007
		detailScale     0.899492
		colorConversion true
		snowLevel       2
		tropicLatitude  0.042643
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491505
		terraceProb     0.301008
		erosion         0
		montesMagn      0.465538
		montesFreq      2.98476
		montesSpiky     0.950805
		montesFraction  0.720233
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.32232e-006
		hillsFraction   0.897202
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253255
		craterFreq      0.192547
		craterDensity   0
		craterOctaves   0.517539
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   480.357
		volcanoTemp     1782.19
		lavaCoverTidal  0
		lavaCoverSun    0.516475
		lavaCoverYoung  0
		colorSea       (0.265, 0.211, 0.151, 0.000)
		colorShelf     (0.271, 0.217, 0.172, 0.000)
		colorBeach     (0.319, 0.255, 0.205, 0.000)
		colorDesert    (0.346, 0.273, 0.199, 0.000)
		colorLowland   (0.380, 0.292, 0.226, 0.000)
		colorUpland    (0.421, 0.354, 0.275, 0.000)
		colorRock      (0.455, 0.385, 0.296, 0.000)
		colorSnow      (0.495, 0.410, 0.312, 1.000)
		BumpHeight      0.0296463
		BumpOffset      0.00592927
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0537697
		Period          0.152876
		Eccentricity    0.0417273
		Inclination     2.36663
		AscendingNode   -117.81
		ArgOfPericenter -105.64
		MeanAnomaly     -60.8512
	}
}

Asteroid	"S45"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.70105e-013
	Radius          0.426353
	InertiaMoment   0.399278

	RotationPeriod  4809.98
	Obliquity       -5.47743
	EqAscendNode    71.975

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.691 0.638 0.604)

	Surface
	{
		SurfStyle       0.537535
		OceanStyle      0.459197
		Randomize      (-0.533, -0.557, -0.150)
		colorDistMagn   0.130803
		colorDistFreq   7.02344e-005
		detailScale     11.6423
		colorConversion true
		snowLevel       2
		tropicLatitude  0.15401
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381788
		terraceProb     0.201333
		erosion         0
		montesMagn      0.584615
		montesFreq      3.18719
		montesSpiky     0.950554
		montesFraction  0.724886
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000474122
		hillsFraction   0.866394
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218665
		craterFreq      0.260995
		craterDensity   0.525934
		craterOctaves   2.25462
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   162.075
		volcanoTemp     1022.53
		lavaCoverTidal  0
		lavaCoverSun    0.407012
		lavaCoverYoung  0
		colorSea       (0.269, 0.217, 0.169, 0.000)
		colorShelf     (0.276, 0.223, 0.193, 0.000)
		colorBeach     (0.325, 0.262, 0.229, 0.000)
		colorDesert    (0.352, 0.281, 0.223, 0.000)
		colorLowland   (0.387, 0.300, 0.254, 0.000)
		colorUpland    (0.428, 0.364, 0.308, 0.000)
		colorRock      (0.463, 0.396, 0.332, 0.000)
		colorSnow      (0.504, 0.421, 0.350, 1.000)
		BumpHeight      0.383718
		BumpOffset      0.0767435
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.068431
		Period          0.219488
		Eccentricity    0.175
		Inclination     -5.47743
		AscendingNode   71.975
		ArgOfPericenter -12.5612
		MeanAnomaly     -164.342
	}
}

Asteroid	"S46"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.50319e-010
	Radius          3.79403
	InertiaMoment   0.396437

	Obliquity       -1.46769
	EqAscendNode    21.0487
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.758 0.754 0.751)

	Surface
	{
		SurfStyle       0.566322
		OceanStyle      0.713851
		Randomize      (-0.986, 0.687, -0.983)
		colorDistMagn   0.086992
		colorDistFreq   0.00115856
		detailScale     103.602
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0503492
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.626028
		terraceProb     0.160379
		erosion         0
		montesMagn      0.417073
		montesFreq      2.9343
		montesSpiky     0.975375
		montesFraction  0.347906
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.029723
		hillsFraction   0.550043
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205754
		craterFreq      0.176224
		craterDensity   0.657011
		craterOctaves   5.12193
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.5976
		volcanoTemp     1300.49
		lavaCoverTidal  0
		lavaCoverSun    0.299123
		lavaCoverYoung  0
		colorSea       (0.296, 0.256, 0.210, 0.000)
		colorShelf     (0.303, 0.264, 0.240, 0.000)
		colorBeach     (0.356, 0.309, 0.285, 0.000)
		colorDesert    (0.387, 0.332, 0.278, 0.000)
		colorLowland   (0.424, 0.355, 0.315, 0.000)
		colorUpland    (0.470, 0.430, 0.383, 0.000)
		colorRock      (0.508, 0.468, 0.413, 0.000)
		colorSnow      (0.553, 0.498, 0.436, 1.000)
		BumpHeight      3.41463
		BumpOffset      0.682926
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0723984
		Period          0.238851
		Eccentricity    0.0763965
		Inclination     -1.46769
		AscendingNode   21.0487
		ArgOfPericenter 169.174
		MeanAnomaly     -168.682
	}
}

Asteroid	"S47"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.68357e-007
	Radius          48.461
	InertiaMoment   0.398427

	Obliquity       3.3221
	EqAscendNode    35.091
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.757 0.756 0.753)

	Surface
	{
		SurfStyle       0.803514
		OceanStyle      0.625501
		Randomize      (-0.679, -0.084, 0.169)
		colorDistMagn   0.726278
		colorDistFreq   0.62837
		detailScale     1323.31
		colorConversion true
		snowLevel       2
		tropicLatitude  0.110338
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.625713
		terraceProb     0.199697
		erosion         0
		montesMagn      0.545857
		montesFreq      2.646
		montesSpiky     0.901927
		montesFraction  0.633847
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.18781
		hillsFraction   0.365265
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245765
		craterFreq      0.227896
		craterDensity   0.470106
		craterOctaves   3.78562
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   12.5188
		volcanoTemp     1625.11
		lavaCoverTidal  0
		lavaCoverSun    0.504618
		lavaCoverYoung  0
		colorSea       (0.295, 0.257, 0.211, 0.000)
		colorShelf     (0.303, 0.264, 0.241, 0.000)
		colorBeach     (0.356, 0.310, 0.286, 0.000)
		colorDesert    (0.386, 0.332, 0.278, 0.000)
		colorLowland   (0.424, 0.355, 0.316, 0.000)
		colorUpland    (0.470, 0.431, 0.384, 0.000)
		colorRock      (0.508, 0.468, 0.414, 0.000)
		colorSnow      (0.553, 0.499, 0.436, 1.000)
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
		SemiMajorAxis   0.0583854
		Period          0.172977
		Eccentricity    0.117484
		Inclination     3.3221
		AscendingNode   35.091
		ArgOfPericenter -138.026
		MeanAnomaly     -161.86
	}
}

Asteroid	"S48"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.15797e-015
	Radius          0.0994367
	InertiaMoment   0.399463

	Obliquity       0.160688
	EqAscendNode    -113.212
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.779 0.688 0.627)

	Surface
	{
		SurfStyle       0.792678
		OceanStyle      0.251283
		Randomize      (-0.526, -0.751, 0.841)
		colorDistMagn   0.715614
		colorDistFreq   3.18192e-006
		detailScale     2.71528
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00308816
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.3512
		terraceProb     0.51637
		erosion         0
		montesMagn      0.468233
		montesFreq      2.12604
		montesSpiky     0.89061
		montesFraction  0.842831
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.21208e-005
		hillsFraction   0.507201
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268346
		craterFreq      0.245798
		craterDensity   0.50018
		craterOctaves   1.46687
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   335.606
		volcanoTemp     1454.64
		lavaCoverTidal  0
		lavaCoverSun    0.414813
		lavaCoverYoung  0
		colorSea       (0.304, 0.234, 0.176, 0.000)
		colorShelf     (0.312, 0.241, 0.201, 0.000)
		colorBeach     (0.366, 0.282, 0.238, 0.000)
		colorDesert    (0.397, 0.303, 0.232, 0.000)
		colorLowland   (0.436, 0.323, 0.264, 0.000)
		colorUpland    (0.483, 0.392, 0.320, 0.000)
		colorRock      (0.522, 0.427, 0.345, 0.000)
		colorSnow      (0.569, 0.454, 0.364, 1.000)
		BumpHeight      0.089493
		BumpOffset      0.0178986
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0591623
		Period          0.176441
		Eccentricity    0.0260786
		Inclination     0.160688
		AscendingNode   -113.212
		ArgOfPericenter -15.2071
		MeanAnomaly     -111.795
	}
}

Asteroid	"S49"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.17557e-012
	Radius          0.884877
	InertiaMoment   0.397086

	RotationPeriod  6056.38
	Obliquity       3.54929
	EqAscendNode    56.7715

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.755 0.681 0.652)

	Surface
	{
		SurfStyle       0.571397
		OceanStyle      0.39912
		Randomize      (0.923, -0.974, -0.163)
		colorDistMagn   0.886791
		colorDistFreq   0.00049175
		detailScale     24.163
		colorConversion true
		snowLevel       2
		tropicLatitude  0.108766
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.520465
		terraceProb     0.199148
		erosion         0
		montesMagn      0.536314
		montesFreq      3.37023
		montesSpiky     0.960459
		montesFraction  0.524887
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00170591
		hillsFraction   0.610045
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260168
		craterFreq      0.207292
		craterDensity   0.646342
		craterOctaves   5.00421
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   77.8534
		volcanoTemp     1606.48
		lavaCoverTidal  0
		lavaCoverSun    0.16258
		lavaCoverYoung  0
		colorSea       (0.295, 0.232, 0.183, 0.000)
		colorShelf     (0.302, 0.238, 0.209, 0.000)
		colorBeach     (0.355, 0.279, 0.248, 0.000)
		colorDesert    (0.385, 0.300, 0.241, 0.000)
		colorLowland   (0.423, 0.320, 0.274, 0.000)
		colorUpland    (0.468, 0.388, 0.333, 0.000)
		colorRock      (0.506, 0.422, 0.359, 0.000)
		colorSnow      (0.551, 0.449, 0.378, 1.000)
		BumpHeight      0.796389
		BumpOffset      0.159278
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0925919
		Period          0.345455
		Eccentricity    0.0699066
		Inclination     3.54929
		AscendingNode   56.7715
		ArgOfPericenter 74.2376
		MeanAnomaly     146.758
	}
}

Asteroid	"S50"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.67302e-009
	Radius          11.3048
	InertiaMoment   0.398657

	Obliquity       -1.62211
	EqAscendNode    -81.2579
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.615 0.501 0.342)

	Surface
	{
		SurfStyle       0.676878
		OceanStyle      0.829655
		Randomize      (-0.061, 0.339, -0.325)
		colorDistMagn   0.0584829
		colorDistFreq   0.0788342
		detailScale     308.695
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0429574
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.376641
		terraceProb     0.134801
		erosion         0
		montesMagn      0.518049
		montesFreq      2.2951
		montesSpiky     0.973113
		montesFraction  0.666666
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.282311
		hillsFraction   0.576915
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25536
		craterFreq      0.18326
		craterDensity   0.828605
		craterOctaves   8.05879
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.9279
		volcanoTemp     1174.42
		lavaCoverTidal  0
		lavaCoverSun    0.151617
		lavaCoverYoung  0
		colorSea       (0.240, 0.170, 0.096, 0.000)
		colorShelf     (0.246, 0.175, 0.110, 0.000)
		colorBeach     (0.289, 0.205, 0.130, 0.000)
		colorDesert    (0.314, 0.220, 0.127, 0.000)
		colorLowland   (0.345, 0.235, 0.144, 0.000)
		colorUpland    (0.381, 0.285, 0.175, 0.000)
		colorRock      (0.412, 0.310, 0.188, 0.000)
		colorSnow      (0.449, 0.330, 0.199, 1.000)
		BumpHeight      10.1743
		BumpOffset      2.03486
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0896344
		Period          0.329037
		Eccentricity    0.00914309
		Inclination     -1.62211
		AscendingNode   -81.2579
		ArgOfPericenter -57.644
		MeanAnomaly     123.19
	}
}

Asteroid	"S51"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.73763e-017
	Radius          0.0231912
	InertiaMoment   0.399644

	Obliquity       2.58536
	EqAscendNode    153.08
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.833 0.753 0.702)

	Surface
	{
		SurfStyle       0.0245175
		OceanStyle      0.288338
		Randomize      (0.307, -0.416, -0.391)
		colorDistMagn   0.48412
		colorDistFreq   3.16259e-007
		detailScale     0.633274
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0209978
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498482
		terraceProb     0.238348
		erosion         0
		montesMagn      0.414082
		montesFreq      3.28195
		montesSpiky     0.878538
		montesFraction  0.60405
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.43636e-006
		hillsFraction   0.433203
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225117
		craterFreq      0.157942
		craterDensity   0
		craterOctaves   0.470036
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   694.93
		volcanoTemp     1736.87
		lavaCoverTidal  0
		lavaCoverSun    0.330746
		lavaCoverYoung  0
		colorSea       (0.333, 0.301, 0.281, 0.000)
		colorShelf     (0.354, 0.320, 0.298, 0.000)
		colorBeach     (0.375, 0.339, 0.316, 0.000)
		colorDesert    (0.396, 0.358, 0.333, 0.000)
		colorLowland   (0.416, 0.376, 0.351, 0.000)
		colorUpland    (0.437, 0.395, 0.368, 0.000)
		colorRock      (0.458, 0.414, 0.386, 0.000)
		colorSnow      (0.479, 0.433, 0.403, 1.000)
		BumpHeight      0.0208721
		BumpOffset      0.00417441
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0696118
		Period          0.225194
		Eccentricity    0.0835836
		Inclination     2.58536
		AscendingNode   153.08
		ArgOfPericenter -78.942
		MeanAnomaly     -86.3497
	}
}

Asteroid	"S52"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.02857e-014
	Radius          0.206376
	InertiaMoment   0.397522

	Obliquity       2.72511
	EqAscendNode    138.69
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.664 0.659)

	Surface
	{
		SurfStyle       0.134858
		OceanStyle      0.826182
		Randomize      (-0.882, -0.511, -0.207)
		colorDistMagn   0.452707
		colorDistFreq   3.52915e-005
		detailScale     5.63545
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0335377
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.363374
		terraceProb     0.331067
		erosion         0
		montesMagn      0.425854
		montesFreq      2.53491
		montesSpiky     0.98977
		montesFraction  0.655167
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000123687
		hillsFraction   0.8661
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257988
		craterFreq      0.24119
		craterDensity   0.679013
		craterOctaves   2.21813
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   161.209
		volcanoTemp     1209.41
		lavaCoverTidal  0
		lavaCoverSun    0.35128
		lavaCoverYoung  0
		colorSea       (0.268, 0.266, 0.264, 0.000)
		colorShelf     (0.284, 0.282, 0.280, 0.000)
		colorBeach     (0.301, 0.299, 0.297, 0.000)
		colorDesert    (0.318, 0.316, 0.313, 0.000)
		colorLowland   (0.334, 0.332, 0.330, 0.000)
		colorUpland    (0.351, 0.349, 0.346, 0.000)
		colorRock      (0.368, 0.365, 0.363, 0.000)
		colorSnow      (0.385, 0.382, 0.379, 1.000)
		BumpHeight      0.185739
		BumpOffset      0.0371477
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0679417
		Period          0.217139
		Eccentricity    0.0877405
		Inclination     2.72511
		AscendingNode   138.69
		ArgOfPericenter 110.682
		MeanAnomaly     75.7466
	}
}

Asteroid	"S53"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.92824e-011
	Radius          2.63666
	InertiaMoment   0.39887

	Obliquity       2.70165
	EqAscendNode    159.463
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.517 0.513 0.508)

	Surface
	{
		SurfStyle       0.77701
		OceanStyle      0.234306
		Randomize      (0.773, 0.486, -0.654)
		colorDistMagn   0.613203
		colorDistFreq   0.00337316
		detailScale     71.9983
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0168044
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494059
		terraceProb     0.32568
		erosion         0
		montesMagn      0.505997
		montesFreq      3.16949
		montesSpiky     0.873581
		montesFraction  0.577193
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.011068
		hillsFraction   0.476216
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237594
		craterFreq      0.176419
		craterDensity   0.628438
		craterOctaves   4.21627
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   53.6904
		volcanoTemp     1320.54
		lavaCoverTidal  0
		lavaCoverSun    0.331944
		lavaCoverYoung  0
		colorSea       (0.202, 0.174, 0.142, 0.000)
		colorShelf     (0.207, 0.180, 0.162, 0.000)
		colorBeach     (0.243, 0.210, 0.193, 0.000)
		colorDesert    (0.264, 0.226, 0.188, 0.000)
		colorLowland   (0.290, 0.241, 0.213, 0.000)
		colorUpland    (0.321, 0.292, 0.259, 0.000)
		colorRock      (0.347, 0.318, 0.279, 0.000)
		colorSnow      (0.378, 0.339, 0.294, 1.000)
		BumpHeight      2.37299
		BumpOffset      0.474598
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0730063
		Period          0.241865
		Eccentricity    0.138058
		Inclination     2.70165
		AscendingNode   159.463
		ArgOfPericenter -159.986
		MeanAnomaly     -160.511
	}
}

Asteroid	"S54"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            8.72372e-008
	Radius          34.122
	InertiaMoment   0.399822

	Obliquity       -3.23629
	EqAscendNode    -147.401
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.536 0.531 0.523)

	Surface
	{
		SurfStyle       0.445335
		OceanStyle      0.995192
		Randomize      (-0.001, 0.683, 0.686)
		colorDistMagn   0.715217
		colorDistFreq   0.788969
		detailScale     931.759
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0316854
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.709466
		terraceProb     0.163975
		erosion         0
		montesMagn      0.651176
		montesFreq      3.96476
		montesSpiky     0.936019
		montesFraction  0.621836
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.55864
		hillsFraction   0.689954
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269153
		craterFreq      0.18446
		craterDensity   0.566518
		craterOctaves   6.64171
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   18.113
		volcanoTemp     1321.75
		lavaCoverTidal  0
		lavaCoverSun    0.300073
		lavaCoverYoung  0
		colorSea       (0.215, 0.213, 0.209, 0.000)
		colorShelf     (0.228, 0.226, 0.222, 0.000)
		colorBeach     (0.241, 0.239, 0.235, 0.000)
		colorDesert    (0.255, 0.252, 0.248, 0.000)
		colorLowland   (0.268, 0.266, 0.262, 0.000)
		colorUpland    (0.282, 0.279, 0.275, 0.000)
		colorRock      (0.295, 0.292, 0.288, 0.000)
		colorSnow      (0.308, 0.306, 0.301, 1.000)
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
		SemiMajorAxis   0.0763291
		Period          0.258564
		Eccentricity    0.136194
		Inclination     -3.23629
		AscendingNode   -147.401
		ArgOfPericenter 141.651
		MeanAnomaly     95.2166
	}
}

Asteroid	"S55"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.11066e-016
	Radius          0.0481322
	InertiaMoment   0.397865

	RotationPeriod  3853.7
	Obliquity       1.01784
	EqAscendNode    78.6861

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.815 0.728 0.688)

	Surface
	{
		SurfStyle       0.403322
		OceanStyle      0.548317
		Randomize      (-0.542, 0.485, 0.011)
		colorDistMagn   0.254862
		colorDistFreq   1.60586e-006
		detailScale     1.31433
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0274738
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.625326
		terraceProb     0.187801
		erosion         0
		montesMagn      0.473197
		montesFreq      2.88838
		montesSpiky     0.833276
		montesFraction  0.413108
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.22256e-006
		hillsFraction   0.390053
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208561
		craterFreq      0.209312
		craterDensity   0
		craterOctaves   0.789631
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   333.813
		volcanoTemp     1831.18
		lavaCoverTidal  0
		lavaCoverSun    0.390898
		lavaCoverYoung  0
		colorSea       (0.326, 0.291, 0.275, 0.000)
		colorShelf     (0.347, 0.309, 0.293, 0.000)
		colorBeach     (0.367, 0.328, 0.310, 0.000)
		colorDesert    (0.387, 0.346, 0.327, 0.000)
		colorLowland   (0.408, 0.364, 0.344, 0.000)
		colorUpland    (0.428, 0.382, 0.361, 0.000)
		colorRock      (0.448, 0.400, 0.379, 0.000)
		colorSnow      (0.469, 0.419, 0.396, 1.000)
		BumpHeight      0.043319
		BumpOffset      0.00866379
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0684987
		Period          0.219814
		Eccentricity    0.153609
		Inclination     1.01784
		AscendingNode   78.6861
		ArgOfPericenter 17.5875
		MeanAnomaly     -61.0471
	}
}

Asteroid	"S56"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            7.52062e-013
	Radius          0.61494
	InertiaMoment   0.399071

	RotationPeriod  4863.81
	Obliquity       -4.27847
	EqAscendNode    -169.75

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.516 0.513 0.508)

	Surface
	{
		SurfStyle       0.304812
		OceanStyle      0.725244
		Randomize      (-0.377, 0.347, -0.745)
		colorDistMagn   0.461375
		colorDistFreq   0.000198623
		detailScale     16.792
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0133272
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5273
		terraceProb     0.325068
		erosion         0
		montesMagn      0.448906
		montesFreq      2.79901
		montesSpiky     0.922841
		montesFraction  0.715878
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000793346
		hillsFraction   0.687311
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235157
		craterFreq      0.240176
		craterDensity   0.55163
		craterOctaves   3.0876
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   111.176
		volcanoTemp     1504.74
		lavaCoverTidal  0
		lavaCoverSun    0.353287
		lavaCoverYoung  0
		colorSea       (0.207, 0.205, 0.203, 0.000)
		colorShelf     (0.219, 0.218, 0.216, 0.000)
		colorBeach     (0.232, 0.231, 0.229, 0.000)
		colorDesert    (0.245, 0.244, 0.241, 0.000)
		colorLowland   (0.258, 0.256, 0.254, 0.000)
		colorUpland    (0.271, 0.269, 0.267, 0.000)
		colorRock      (0.284, 0.282, 0.280, 0.000)
		colorSnow      (0.297, 0.295, 0.292, 1.000)
		BumpHeight      0.553446
		BumpOffset      0.110689
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0689405
		Period          0.221945
		Eccentricity    0.106639
		Inclination     -4.27847
		AscendingNode   -169.75
		ArgOfPericenter -102.533
		MeanAnomaly     -91.2047
	}
}

Asteroid	"S57"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.1067e-009
	Radius          7.95908
	InertiaMoment   0.399998

	Obliquity       -0.494409
	EqAscendNode    96.2737
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.528 0.363 0.285)

	Surface
	{
		SurfStyle       0.548173
		OceanStyle      0.355992
		Randomize      (-0.798, -0.048, -0.455)
		colorDistMagn   0.0644149
		colorDistFreq   0.0382488
		detailScale     217.336
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0115185
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.396445
		terraceProb     0.473818
		erosion         0
		montesMagn      0.429235
		montesFreq      2.53712
		montesSpiky     0.991792
		montesFraction  0.421246
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.131355
		hillsFraction   0.736796
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234774
		craterFreq      0.153852
		craterDensity   0.874758
		craterOctaves   7.86309
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.5106
		volcanoTemp     1379.34
		lavaCoverTidal  0
		lavaCoverSun    0.162618
		lavaCoverYoung  0
		colorSea       (0.206, 0.123, 0.080, 0.000)
		colorShelf     (0.211, 0.127, 0.091, 0.000)
		colorBeach     (0.248, 0.149, 0.108, 0.000)
		colorDesert    (0.270, 0.160, 0.106, 0.000)
		colorLowland   (0.296, 0.171, 0.120, 0.000)
		colorUpland    (0.328, 0.207, 0.145, 0.000)
		colorRock      (0.354, 0.225, 0.157, 0.000)
		colorSnow      (0.386, 0.240, 0.165, 1.000)
		BumpHeight      7.16317
		BumpOffset      1.43263
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0909455
		Period          0.336282
		Eccentricity    0.0509881
		Inclination     -0.494409
		AscendingNode   96.2737
		ArgOfPericenter 41.5779
		MeanAnomaly     63.3688
	}
}

Asteroid	"S58"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            6.48345e-018
	Radius          0.0112257
	InertiaMoment   0.398154

	Obliquity       -4.45684
	EqAscendNode    -176.308
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.787 0.783 0.782)

	Surface
	{
		SurfStyle       0.610689
		OceanStyle      0.00378431
		Randomize      (0.462, -0.342, 0.322)
		colorDistMagn   0.314052
		colorDistFreq   6.81937e-008
		detailScale     0.306535
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00500338
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.326746
		terraceProb     0.421224
		erosion         0
		montesMagn      0.376929
		montesFreq      3.46477
		montesSpiky     0.898571
		montesFraction  0.503
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.47751e-007
		hillsFraction   0.715868
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219864
		craterFreq      0.211272
		craterDensity   0
		craterOctaves   0.258707
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   691.217
		volcanoTemp     1489.78
		lavaCoverTidal  0
		lavaCoverSun    0.516539
		lavaCoverYoung  0
		colorSea       (0.307, 0.266, 0.219, 0.000)
		colorShelf     (0.315, 0.274, 0.250, 0.000)
		colorBeach     (0.370, 0.321, 0.297, 0.000)
		colorDesert    (0.401, 0.345, 0.289, 0.000)
		colorLowland   (0.441, 0.368, 0.328, 0.000)
		colorUpland    (0.488, 0.446, 0.399, 0.000)
		colorRock      (0.527, 0.486, 0.430, 0.000)
		colorSnow      (0.575, 0.517, 0.453, 1.000)
		BumpHeight      0.0101031
		BumpOffset      0.00202062
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0537257
		Period          0.152688
		Eccentricity    0.0409421
		Inclination     -4.45683
		AscendingNode   -176.308
		ArgOfPericenter 87.3779
		MeanAnomaly     -14.3498
	}
}

Asteroid	"S59"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            9.54074e-015
	Radius          0.14342
	InertiaMoment   0.399263

	Obliquity       5.26949
	EqAscendNode    142.845
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.463 0.458 0.455)

	Surface
	{
		SurfStyle       0.385172
		OceanStyle      0.472323
		Randomize      (-0.926, 0.877, 0.806)
		colorDistMagn   0.937832
		colorDistFreq   5.92995e-006
		detailScale     3.91632
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0584944
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.357797
		terraceProb     0.689977
		erosion         0
		montesMagn      0.563186
		montesFreq      2.74496
		montesSpiky     0.973097
		montesFraction  0.549153
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.05585e-005
		hillsFraction   0.74118
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230101
		craterFreq      0.235317
		craterDensity   0.708423
		craterOctaves   2.51704
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   230.21
		volcanoTemp     1774.42
		lavaCoverTidal  0
		lavaCoverSun    0.217544
		lavaCoverYoung  0
		colorSea       (0.185, 0.183, 0.182, 0.000)
		colorShelf     (0.197, 0.195, 0.193, 0.000)
		colorBeach     (0.208, 0.206, 0.205, 0.000)
		colorDesert    (0.220, 0.218, 0.216, 0.000)
		colorLowland   (0.232, 0.229, 0.227, 0.000)
		colorUpland    (0.243, 0.240, 0.239, 0.000)
		colorRock      (0.255, 0.252, 0.250, 0.000)
		colorSnow      (0.266, 0.263, 0.262, 1.000)
		BumpHeight      0.129078
		BumpOffset      0.0258156
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0802933
		Period          0.278966
		Eccentricity    0.0406707
		Inclination     5.26949
		AscendingNode   142.845
		ArgOfPericenter 43.6791
		MeanAnomaly     35.4181
	}
}

Asteroid	"S60"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.40397e-011
	Radius          1.8563
	InertiaMoment   0.396369

	Obliquity       2.56249
	EqAscendNode    158.188
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.709 0.706 0.701)

	Surface
	{
		SurfStyle       0.462845
		OceanStyle      0.651469
		Randomize      (-0.252, 0.665, 0.145)
		colorDistMagn   0.0453914
		colorDistFreq   0.00200356
		detailScale     50.6894
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0169175
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.510152
		terraceProb     0.213138
		erosion         0
		montesMagn      0.628875
		montesFreq      3.40118
		montesSpiky     0.952459
		montesFraction  0.430252
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0091953
		hillsFraction   0.383965
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236236
		craterFreq      0.206067
		craterDensity   0.716843
		craterOctaves   5.16165
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   77.674
		volcanoTemp     1803.97
		lavaCoverTidal  0
		lavaCoverSun    0.207038
		lavaCoverYoung  0
		colorSea       (0.284, 0.283, 0.280, 0.000)
		colorShelf     (0.301, 0.300, 0.298, 0.000)
		colorBeach     (0.319, 0.318, 0.315, 0.000)
		colorDesert    (0.337, 0.336, 0.333, 0.000)
		colorLowland   (0.355, 0.353, 0.350, 0.000)
		colorUpland    (0.372, 0.371, 0.368, 0.000)
		colorRock      (0.390, 0.388, 0.386, 0.000)
		colorSnow      (0.408, 0.406, 0.403, 1.000)
		BumpHeight      1.67067
		BumpOffset      0.334134
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.086797
		Period          0.313538
		Eccentricity    0.102349
		Inclination     2.56249
		AscendingNode   158.188
		ArgOfPericenter -147.605
		MeanAnomaly     -78.5118
	}
}

Asteroid	"S61"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.06602e-008
	Radius          16.5178
	InertiaMoment   0.398408

	Obliquity       -5.91679
	EqAscendNode    -25.7008
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.519 0.512 0.507)

	Surface
	{
		SurfStyle       0.97449
		OceanStyle      0.300485
		Randomize      (0.623, 0.231, -0.079)
		colorDistMagn   0.771275
		colorDistFreq   0.110295
		detailScale     451.045
		colorConversion true
		snowLevel       2
		tropicLatitude  0.199987
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.587063
		terraceProb     0.481489
		erosion         0
		montesMagn      0.661915
		montesFreq      2.47889
		montesSpiky     0.928412
		montesFraction  0.690425
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.71214
		hillsFraction   0.661591
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214133
		craterFreq      0.23671
		craterDensity   0.535923
		craterOctaves   3.88241
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   18.0173
		volcanoTemp     1343.65
		lavaCoverTidal  0
		lavaCoverSun    0.453419
		lavaCoverYoung  0
		colorSea       (0.176, 0.179, 0.203, 0.050)
		colorShelf     (0.207, 0.210, 0.233, 0.040)
		colorBeach     (0.239, 0.241, 0.264, 0.030)
		colorDesert    (0.270, 0.271, 0.299, 0.020)
		colorLowland   (0.301, 0.302, 0.330, 0.030)
		colorUpland    (0.332, 0.333, 0.360, 0.050)
		colorRock      (0.363, 0.363, 0.401, 0.020)
		colorSnow      (0.363, 0.363, 0.401, 1.000)
		BumpHeight      14.866
		BumpOffset      2.9732
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.060064
		Period          0.180491
		Eccentricity    0.0887677
		Inclination     -5.91679
		AscendingNode   -25.7008
		ArgOfPericenter -56.3489
		MeanAnomaly     95.8112
	}
}

Asteroid	"S62"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.21035e-016
	Radius          0.0334492
	InertiaMoment   0.399449

	RotationPeriod  13023.9
	Obliquity       -0.160046
	EqAscendNode    37.9256

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.521 0.438 0.313)

	Surface
	{
		SurfStyle       0.949215
		OceanStyle      0.865829
		Randomize      (-0.468, 0.221, -0.722)
		colorDistMagn   0.549565
		colorDistFreq   3.80951e-007
		detailScale     0.913385
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00528155
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544898
		terraceProb     0.238613
		erosion         0
		montesMagn      0.512777
		montesFreq      2.47478
		montesSpiky     0.931217
		montesFraction  0.630571
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.68026e-006
		hillsFraction   0.805457
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220517
		craterFreq      0.181864
		craterDensity   0.756848
		craterOctaves   1.17688
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   476.69
		volcanoTemp     1641.11
		lavaCoverTidal  0
		lavaCoverSun    0.245058
		lavaCoverYoung  0
		colorSea       (0.177, 0.153, 0.125, 0.050)
		colorShelf     (0.208, 0.180, 0.144, 0.040)
		colorBeach     (0.240, 0.206, 0.163, 0.030)
		colorDesert    (0.271, 0.232, 0.184, 0.020)
		colorLowland   (0.302, 0.259, 0.203, 0.030)
		colorUpland    (0.334, 0.285, 0.222, 0.050)
		colorRock      (0.365, 0.311, 0.247, 0.020)
		colorSnow      (0.365, 0.311, 0.247, 1.000)
		BumpHeight      0.0301042
		BumpOffset      0.00602085
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0837459
		Period          0.297152
		Eccentricity    0.140604
		Inclination     -0.160046
		AscendingNode   37.9256
		ArgOfPericenter -82.7698
		MeanAnomaly     -81.2985
	}
}

Asteroid	"S63"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.78109e-013
	Radius          0.432938
	InertiaMoment   0.397046

	RotationPeriod  10425.3
	Obliquity       2.49894
	EqAscendNode    -172.874

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.564 0.560 0.558)

	Surface
	{
		SurfStyle       0.828802
		OceanStyle      0.711549
		Randomize      (-0.277, -0.521, 0.384)
		colorDistMagn   0.231069
		colorDistFreq   0.000111092
		detailScale     11.8221
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00541528
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381882
		terraceProb     0.247264
		erosion         0
		montesMagn      0.468637
		montesFreq      2.85275
		montesSpiky     0.83904
		montesFraction  0.711521
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000498149
		hillsFraction   0.532394
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24604
		craterFreq      0.246308
		craterDensity   0.554247
		craterOctaves   1.94976
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   160.838
		volcanoTemp     1270.58
		lavaCoverTidal  0
		lavaCoverSun    0.452105
		lavaCoverYoung  0
		colorSea       (0.220, 0.191, 0.156, 0.000)
		colorShelf     (0.226, 0.196, 0.179, 0.000)
		colorBeach     (0.265, 0.230, 0.212, 0.000)
		colorDesert    (0.288, 0.247, 0.207, 0.000)
		colorLowland   (0.316, 0.263, 0.234, 0.000)
		colorUpland    (0.350, 0.319, 0.285, 0.000)
		colorRock      (0.378, 0.347, 0.307, 0.000)
		colorSnow      (0.412, 0.370, 0.324, 1.000)
		BumpHeight      0.389644
		BumpOffset      0.0779289
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0639356
		Period          0.19822
		Eccentricity    0.156784
		Inclination     2.49894
		AscendingNode   -172.874
		ArgOfPericenter -114.554
		MeanAnomaly     -5.91943
	}
}

Asteroid	"S64"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.62097e-010
	Radius          3.85263
	InertiaMoment   0.39864

	RotationPeriod  6239.03
	Obliquity       2.75003
	EqAscendNode    85.8314

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.682 0.525 0.431)

	Surface
	{
		SurfStyle       0.30145
		OceanStyle      0.880552
		Randomize      (0.009, -0.517, -0.829)
		colorDistMagn   0.913445
		colorDistFreq   0.0104024
		detailScale     105.202
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0702318
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.457169
		terraceProb     0.27226
		erosion         0
		montesMagn      0.542189
		montesFreq      3.07005
		montesSpiky     0.938255
		montesFraction  0.541035
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0292329
		hillsFraction   0.58633
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243147
		craterFreq      0.233674
		craterDensity   0.827985
		craterOctaves   7.02222
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.3106
		volcanoTemp     1608.39
		lavaCoverTidal  0
		lavaCoverSun    0.170494
		lavaCoverYoung  0
		colorSea       (0.273, 0.210, 0.172, 0.000)
		colorShelf     (0.290, 0.223, 0.183, 0.000)
		colorBeach     (0.307, 0.236, 0.194, 0.000)
		colorDesert    (0.324, 0.249, 0.205, 0.000)
		colorLowland   (0.341, 0.262, 0.216, 0.000)
		colorUpland    (0.358, 0.276, 0.226, 0.000)
		colorRock      (0.375, 0.289, 0.237, 0.000)
		colorSnow      (0.392, 0.302, 0.248, 1.000)
		BumpHeight      3.46737
		BumpOffset      0.693473
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0944442
		Period          0.355874
		Eccentricity    0.111076
		Inclination     2.75003
		AscendingNode   85.8314
		ArgOfPericenter 151.52
		MeanAnomaly     98.9827
	}
}

Asteroid	"S65"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.85689e-007
	Radius          49.2092
	InertiaMoment   0.39963

	Obliquity       -2.46856
	EqAscendNode    -110.437
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.434 0.431 0.429)

	Surface
	{
		SurfStyle       0.294555
		OceanStyle      0.234333
		Randomize      (0.489, -0.294, -0.418)
		colorDistMagn   0.975167
		colorDistFreq   1.41549
		detailScale     1343.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0491248
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.392817
		terraceProb     0.529073
		erosion         0
		montesMagn      0.565733
		montesFreq      2.38245
		montesSpiky     0.876044
		montesFraction  0.633148
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.70184
		hillsFraction   0.913773
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244947
		craterFreq      0.229857
		craterDensity   0.580228
		craterOctaves   8.2264
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   12.4232
		volcanoTemp     1415.7
		lavaCoverTidal  0
		lavaCoverSun    0.245633
		lavaCoverYoung  0
		colorSea       (0.174, 0.172, 0.172, 0.000)
		colorShelf     (0.184, 0.183, 0.182, 0.000)
		colorBeach     (0.195, 0.194, 0.193, 0.000)
		colorDesert    (0.206, 0.205, 0.204, 0.000)
		colorLowland   (0.217, 0.215, 0.215, 0.000)
		colorUpland    (0.228, 0.226, 0.225, 0.000)
		colorRock      (0.239, 0.237, 0.236, 0.000)
		colorSnow      (0.250, 0.248, 0.247, 1.000)
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
		SemiMajorAxis   0.0786376
		Period          0.270382
		Eccentricity    0.0723947
		Inclination     -2.46856
		AscendingNode   -110.437
		ArgOfPericenter -99.4592
		MeanAnomaly     -2.45249
	}
}

Asteroid	"S66"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.25951e-015
	Radius          0.100972
	InertiaMoment   0.397493

	Obliquity       5.41602
	EqAscendNode    -45.1297
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.432 0.427 0.422)

	Surface
	{
		SurfStyle       0.285026
		OceanStyle      0.664817
		Randomize      (-0.161, -0.568, 0.583)
		colorDistMagn   0.220727
		colorDistFreq   8.82948e-006
		detailScale     2.75722
		colorConversion true
		snowLevel       2
		tropicLatitude  0.173658
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.522117
		terraceProb     0.109262
		erosion         0
		montesMagn      0.555119
		montesFreq      2.92197
		montesSpiky     0.865299
		montesFraction  0.434762
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.15793e-005
		hillsFraction   0.838412
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234853
		craterFreq      0.2791
		craterDensity   0.664302
		craterOctaves   2.56408
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   333.044
		volcanoTemp     1611.42
		lavaCoverTidal  0
		lavaCoverSun    0.209783
		lavaCoverYoung  0
		colorSea       (0.173, 0.171, 0.169, 0.000)
		colorShelf     (0.184, 0.181, 0.179, 0.000)
		colorBeach     (0.195, 0.192, 0.190, 0.000)
		colorDesert    (0.205, 0.203, 0.200, 0.000)
		colorLowland   (0.216, 0.213, 0.211, 0.000)
		colorUpland    (0.227, 0.224, 0.221, 0.000)
		colorRock      (0.238, 0.235, 0.232, 0.000)
		colorSnow      (0.249, 0.245, 0.243, 1.000)
		BumpHeight      0.0908751
		BumpOffset      0.018175
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0831276
		Period          0.293867
		Eccentricity    0.0614906
		Inclination     5.41602
		AscendingNode   -45.1297
		ArgOfPericenter -90.0669
		MeanAnomaly     -89.5065
	}
}

Asteroid	"S67"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.32499e-012
	Radius          0.898542
	InertiaMoment   0.398854

	Obliquity       -2.30451
	EqAscendNode    72.5161
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.639 0.634 0.631)

	Surface
	{
		SurfStyle       0.255025
		OceanStyle      0.0769965
		Randomize      (-0.292, 0.512, 0.792)
		colorDistMagn   0.238959
		colorDistFreq   0.000474704
		detailScale     24.5362
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0648145
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.347026
		terraceProb     0.196791
		erosion         0
		montesMagn      0.52545
		montesFreq      2.30762
		montesSpiky     0.923478
		montesFraction  0.566553
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00181295
		hillsFraction   0.379802
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237837
		craterFreq      0.260185
		craterDensity   0.915221
		craterOctaves   5.16357
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   77.2591
		volcanoTemp     1381.47
		lavaCoverTidal  0
		lavaCoverSun    0.148527
		lavaCoverYoung  0
		colorSea       (0.256, 0.254, 0.252, 0.000)
		colorShelf     (0.272, 0.269, 0.268, 0.000)
		colorBeach     (0.288, 0.285, 0.284, 0.000)
		colorDesert    (0.304, 0.301, 0.300, 0.000)
		colorLowland   (0.320, 0.317, 0.316, 0.000)
		colorUpland    (0.336, 0.333, 0.331, 0.000)
		colorRock      (0.352, 0.349, 0.347, 0.000)
		colorSnow      (0.368, 0.364, 0.363, 1.000)
		BumpHeight      0.808688
		BumpOffset      0.161738
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0980403
		Period          0.376392
		Eccentricity    0.0953926
		Inclination     -2.30451
		AscendingNode   72.5161
		ArgOfPericenter -22.9594
		MeanAnomaly     -73.3765
	}
}

Asteroid	"S68"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.8929e-009
	Radius          11.4793
	InertiaMoment   0.399808

	Obliquity       4.81983
	EqAscendNode    139.614
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.653 0.650 0.645)

	Surface
	{
		SurfStyle       0.0368167
		OceanStyle      0.619346
		Randomize      (0.978, -0.966, -0.763)
		colorDistMagn   0.478905
		colorDistFreq   0.0577755
		detailScale     313.462
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0579815
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.574238
		terraceProb     0.205595
		erosion         0
		montesMagn      0.641201
		montesFreq      2.74162
		montesSpiky     0.817044
		montesFraction  0.698471
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.366549
		hillsFraction   0.784456
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22233
		craterFreq      0.23083
		craterDensity   0.581814
		craterOctaves   3.87243
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.73
		volcanoTemp     1740.04
		lavaCoverTidal  0
		lavaCoverSun    0.427669
		lavaCoverYoung  0
		colorSea       (0.261, 0.260, 0.258, 0.000)
		colorShelf     (0.277, 0.276, 0.274, 0.000)
		colorBeach     (0.294, 0.292, 0.290, 0.000)
		colorDesert    (0.310, 0.309, 0.306, 0.000)
		colorLowland   (0.326, 0.325, 0.323, 0.000)
		colorUpland    (0.343, 0.341, 0.339, 0.000)
		colorRock      (0.359, 0.357, 0.355, 0.000)
		colorSnow      (0.375, 0.374, 0.371, 1.000)
		BumpHeight      10.3314
		BumpOffset      2.06628
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0579462
		Period          0.171029
		Eccentricity    0.0202335
		Inclination     4.81983
		AscendingNode   139.614
		ArgOfPericenter -24.5051
		MeanAnomaly     112.805
	}
}

Asteroid	"S69"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.86644e-017
	Radius          0.0235493
	InertiaMoment   0.39784

	RotationPeriod  10925.7
	Obliquity       -1.20318
	EqAscendNode    169.485

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.594 0.465 0.333)

	Surface
	{
		SurfStyle       0.725115
		OceanStyle      0.827179
		Randomize      (0.213, -0.225, 0.706)
		colorDistMagn   0.803144
		colorDistFreq   2.38168e-007
		detailScale     0.643053
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00384472
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.696755
		terraceProb     0.3865
		erosion         0
		montesMagn      0.512018
		montesFreq      3.3618
		montesSpiky     0.846899
		montesFraction  0.354402
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.02026e-007
		hillsFraction   0.591044
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227388
		craterFreq      0.209623
		craterDensity   0
		craterOctaves   0.362477
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   689.625
		volcanoTemp     1384.49
		lavaCoverTidal  0
		lavaCoverSun    0.418501
		lavaCoverYoung  0
		colorSea       (0.232, 0.158, 0.093, 0.000)
		colorShelf     (0.238, 0.163, 0.107, 0.000)
		colorBeach     (0.279, 0.191, 0.127, 0.000)
		colorDesert    (0.303, 0.205, 0.123, 0.000)
		colorLowland   (0.333, 0.219, 0.140, 0.000)
		colorUpland    (0.368, 0.265, 0.170, 0.000)
		colorRock      (0.398, 0.289, 0.183, 0.000)
		colorSnow      (0.434, 0.307, 0.193, 1.000)
		BumpHeight      0.0211944
		BumpOffset      0.00423888
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0659654
		Period          0.207734
		Eccentricity    0.148638
		Inclination     -1.20318
		AscendingNode   169.485
		ArgOfPericenter -152.611
		MeanAnomaly     -106.607
	}
}

Asteroid	"S70"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.21812e-014
	Radius          0.209563
	InertiaMoment   0.399056

	RotationPeriod  4776.9
	Obliquity       -1.38635
	EqAscendNode    -65.7231

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.679 0.675 0.671)

	Surface
	{
		SurfStyle       0.294584
		OceanStyle      0.234638
		Randomize      (0.044, -0.033, 0.324)
		colorDistMagn   0.0971544
		colorDistFreq   2.09161e-005
		detailScale     5.72248
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0406364
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508729
		terraceProb     0.295636
		erosion         0
		montesMagn      0.387671
		montesFreq      2.46791
		montesSpiky     0.897235
		montesFraction  0.833349
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.5313e-005
		hillsFraction   0.537567
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230975
		craterFreq      0.209861
		craterDensity   0.546674
		craterOctaves   2.80131
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   159.979
		volcanoTemp     1417.32
		lavaCoverTidal  0
		lavaCoverSun    0.264607
		lavaCoverYoung  0
		colorSea       (0.272, 0.270, 0.268, 0.000)
		colorShelf     (0.289, 0.287, 0.285, 0.000)
		colorBeach     (0.306, 0.304, 0.302, 0.000)
		colorDesert    (0.323, 0.321, 0.319, 0.000)
		colorLowland   (0.340, 0.338, 0.335, 0.000)
		colorUpland    (0.356, 0.354, 0.352, 0.000)
		colorRock      (0.373, 0.371, 0.369, 0.000)
		colorSnow      (0.390, 0.388, 0.386, 1.000)
		BumpHeight      0.188607
		BumpOffset      0.0377214
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0790426
		Period          0.272474
		Eccentricity    0.112933
		Inclination     -1.38635
		AscendingNode   -65.7231
		ArgOfPericenter -5.11874
		MeanAnomaly     152.399
	}
}

Asteroid	"S71"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            6.20719e-011
	Radius          2.67738
	InertiaMoment   0.399984

	Obliquity       -1.90902
	EqAscendNode    64.7927
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.694 0.692 0.689)

	Surface
	{
		SurfStyle       0.197875
		OceanStyle      0.947985
		Randomize      (-0.702, -0.385, 0.834)
		colorDistMagn   0.923528
		colorDistFreq   0.002503
		detailScale     73.1103
		colorConversion true
		snowLevel       2
		tropicLatitude  0.056234
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554022
		terraceProb     0.261568
		erosion         0
		montesMagn      0.689443
		montesFreq      1.91401
		montesSpiky     0.875069
		montesFraction  0.623634
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0178844
		hillsFraction   0.541584
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245906
		craterFreq      0.236542
		craterDensity   0.632842
		craterOctaves   4.29172
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   53.2805
		volcanoTemp     1497.09
		lavaCoverTidal  0
		lavaCoverSun    0.325537
		lavaCoverYoung  0
		colorSea       (0.278, 0.277, 0.276, 0.000)
		colorShelf     (0.295, 0.294, 0.293, 0.000)
		colorBeach     (0.312, 0.311, 0.310, 0.000)
		colorDesert    (0.330, 0.329, 0.328, 0.000)
		colorLowland   (0.347, 0.346, 0.345, 0.000)
		colorUpland    (0.364, 0.363, 0.362, 0.000)
		colorRock      (0.382, 0.381, 0.379, 0.000)
		colorSnow      (0.399, 0.398, 0.396, 1.000)
		BumpHeight      2.40964
		BumpOffset      0.481928
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0674595
		Period          0.214831
		Eccentricity    0.0424393
		Inclination     -1.90902
		AscendingNode   64.7927
		ArgOfPericenter -134.8
		MeanAnomaly     -53.5986
	}
}

Asteroid	"S72"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            9.13419e-008
	Radius          34.6489
	InertiaMoment   0.398133

	Obliquity       -6.42177
	EqAscendNode    -120.784
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.696 0.694 0.693)

	Surface
	{
		SurfStyle       0.889612
		OceanStyle      0.224671
		Randomize      (0.509, 0.960, 0.622)
		colorDistMagn   0.963423
		colorDistFreq   0.803546
		detailScale     946.146
		colorConversion true
		snowLevel       2
		tropicLatitude  0.110349
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.400616
		terraceProb     0.405271
		erosion         0
		montesMagn      0.4563
		montesFreq      3.73196
		montesSpiky     0.997985
		montesFraction  0.593783
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.64511
		hillsFraction   0.585753
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24871
		craterFreq      0.203688
		craterDensity   0.721077
		craterOctaves   6.25529
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   17.9747
		volcanoTemp     1474.52
		lavaCoverTidal  0
		lavaCoverSun    0.322257
		lavaCoverYoung  0
		colorSea       (0.237, 0.243, 0.277, 0.050)
		colorShelf     (0.279, 0.285, 0.319, 0.040)
		colorBeach     (0.320, 0.326, 0.360, 0.030)
		colorDesert    (0.362, 0.368, 0.409, 0.020)
		colorLowland   (0.404, 0.410, 0.451, 0.030)
		colorUpland    (0.446, 0.451, 0.492, 0.050)
		colorRock      (0.488, 0.493, 0.548, 0.020)
		colorSnow      (0.488, 0.493, 0.548, 1.000)
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
		SemiMajorAxis   0.0696093
		Period          0.225182
		Eccentricity    0.0706392
		Inclination     -6.42177
		AscendingNode   -120.784
		ArgOfPericenter 111.018
		MeanAnomaly     -67.9787
	}
}

Asteroid	"S73"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.35115e-016
	Radius          0.0624713
	InertiaMoment   0.399249

	RotationPeriod  12424.9
	Obliquity       3.98382
	EqAscendNode    -153.365

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.752 0.700 0.679)

	Surface
	{
		SurfStyle       0.681836
		OceanStyle      0.715457
		Randomize      (0.118, -0.377, 0.262)
		colorDistMagn   0.0282609
		colorDistFreq   1.60543e-006
		detailScale     1.70588
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0320035
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589264
		terraceProb     0.225635
		erosion         0
		montesMagn      0.571618
		montesFreq      3.15048
		montesSpiky     0.905974
		montesFraction  0.510741
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.14378e-006
		hillsFraction   0.608353
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242148
		craterFreq      0.221384
		craterDensity   0.706247
		craterOctaves   1.66101
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   423.412
		volcanoTemp     1221.09
		lavaCoverTidal  0
		lavaCoverSun    0.269251
		lavaCoverYoung  0
		colorSea       (0.293, 0.238, 0.190, 0.000)
		colorShelf     (0.301, 0.245, 0.217, 0.000)
		colorBeach     (0.353, 0.287, 0.258, 0.000)
		colorDesert    (0.383, 0.308, 0.251, 0.000)
		colorLowland   (0.421, 0.329, 0.285, 0.000)
		colorUpland    (0.466, 0.399, 0.346, 0.000)
		colorRock      (0.504, 0.434, 0.373, 0.000)
		colorSnow      (0.549, 0.462, 0.394, 1.000)
		BumpHeight      0.0562242
		BumpOffset      0.0112448
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0811581
		Period          0.283485
		Eccentricity    0.151119
		Inclination     3.98382
		AscendingNode   -153.365
		ArgOfPericenter -4.63433
		MeanAnomaly     -9.75743
	}
}

Asteroid	"S74"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            7.87449e-013
	Radius          0.555925
	InertiaMoment   0.396295

	Obliquity       -0.940607
	EqAscendNode    164.671
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.731 0.730 0.728)

	Surface
	{
		SurfStyle       0.808266
		OceanStyle      0.798807
		Randomize      (0.333, -0.751, 0.215)
		colorDistMagn   0.235537
		colorDistFreq   0.000162273
		detailScale     15.1805
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00438094
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.708577
		terraceProb     0.434467
		erosion         0
		montesMagn      0.557599
		montesFreq      2.92896
		montesSpiky     0.998471
		montesFraction  0.464633
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000547928
		hillsFraction   0.724515
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227991
		craterFreq      0.225603
		craterDensity   0.463867
		craterOctaves   1.66504
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   98.2225
		volcanoTemp     1414.13
		lavaCoverTidal  0
		lavaCoverSun    0.4975
		lavaCoverYoung  0
		colorSea       (0.285, 0.248, 0.204, 0.000)
		colorShelf     (0.292, 0.255, 0.233, 0.000)
		colorBeach     (0.344, 0.299, 0.277, 0.000)
		colorDesert    (0.373, 0.321, 0.269, 0.000)
		colorLowland   (0.409, 0.343, 0.306, 0.000)
		colorUpland    (0.453, 0.416, 0.371, 0.000)
		colorRock      (0.490, 0.452, 0.400, 0.000)
		colorSnow      (0.534, 0.482, 0.422, 1.000)
		BumpHeight      0.500332
		BumpOffset      0.100066
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0603027
		Period          0.181567
		Eccentricity    0.145543
		Inclination     -0.940607
		AscendingNode   164.671
		ArgOfPericenter -130.374
		MeanAnomaly     81.1361
	}
}

Asteroid	"S75"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.15877e-009
	Radius          7.10236
	InertiaMoment   0.39839

	RotationPeriod  5643.85
	Obliquity       1.09897
	EqAscendNode    -11.6185

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.641 0.636 0.631)

	Surface
	{
		SurfStyle       0.298903
		OceanStyle      0.841793
		Randomize      (-0.128, 0.668, -0.030)
		colorDistMagn   0.075519
		colorDistFreq   0.0250769
		detailScale     193.942
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0381556
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.409303
		terraceProb     0.597559
		erosion         0
		montesMagn      0.635513
		montesFreq      1.98747
		montesSpiky     0.835078
		montesFraction  0.432986
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.119638
		hillsFraction   0.658102
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253406
		craterFreq      0.202302
		craterDensity   0.614297
		craterOctaves   6.93138
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.7122
		volcanoTemp     1955.93
		lavaCoverTidal  0
		lavaCoverSun    0.21697
		lavaCoverYoung  0
		colorSea       (0.256, 0.254, 0.252, 0.000)
		colorShelf     (0.272, 0.270, 0.268, 0.000)
		colorBeach     (0.288, 0.286, 0.284, 0.000)
		colorDesert    (0.304, 0.302, 0.299, 0.000)
		colorLowland   (0.320, 0.318, 0.315, 0.000)
		colorUpland    (0.336, 0.334, 0.331, 0.000)
		colorRock      (0.352, 0.350, 0.347, 0.000)
		colorSnow      (0.368, 0.366, 0.363, 1.000)
		BumpHeight      6.39212
		BumpOffset      1.27842
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.088338
		Period          0.321925
		Eccentricity    0.143331
		Inclination     1.09897
		AscendingNode   -11.6185
		ArgOfPericenter 43.6783
		MeanAnomaly     -23.623
	}
}

Asteroid	"S76"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            6.7885e-018
	Radius          0.0145699
	InertiaMoment   0.399435

	RotationPeriod  9371.22
	Obliquity       5.31979
	EqAscendNode    -29.3017

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.822 0.801 0.773)

	Surface
	{
		SurfStyle       0.883134
		OceanStyle      0.0480993
		Randomize      (0.946, -0.860, -0.802)
		colorDistMagn   0.517793
		colorDistFreq   1.39298e-007
		detailScale     0.397854
		colorConversion true
		snowLevel       2
		tropicLatitude  0.178676
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446876
		terraceProb     0.300521
		erosion         0
		montesMagn      0.452071
		montesFreq      1.86645
		montesSpiky     0.856515
		montesFraction  0.350482
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.68477e-007
		hillsFraction   0.441936
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225611
		craterFreq      0.187385
		craterDensity   0
		craterOctaves   0.714848
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   876.747
		volcanoTemp     1523.83
		lavaCoverTidal  0
		lavaCoverSun    0.162604
		lavaCoverYoung  0
		colorSea       (0.280, 0.281, 0.309, 0.050)
		colorShelf     (0.329, 0.329, 0.356, 0.040)
		colorBeach     (0.378, 0.377, 0.402, 0.030)
		colorDesert    (0.427, 0.425, 0.456, 0.020)
		colorLowland   (0.477, 0.473, 0.502, 0.030)
		colorUpland    (0.526, 0.521, 0.549, 0.050)
		colorRock      (0.575, 0.569, 0.611, 0.020)
		colorSnow      (0.575, 0.569, 0.611, 1.000)
		BumpHeight      0.0131129
		BumpOffset      0.00262258
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0945294
		Period          0.356355
		Eccentricity    0.0923165
		Inclination     5.31979
		AscendingNode   -29.3017
		ArgOfPericenter 104.829
		MeanAnomaly     84.5991
	}
}

Asteroid	"S77"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            9.98965e-015
	Radius          0.129656
	InertiaMoment   0.397005

	RotationPeriod  9149.68
	Obliquity       -0.9657
	EqAscendNode    40.661

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.590 0.519 0.427)

	Surface
	{
		SurfStyle       0.657291
		OceanStyle      0.010014
		Randomize      (0.816, -0.389, 0.693)
		colorDistMagn   0.829215
		colorDistFreq   1.27822e-005
		detailScale     3.54047
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0316045
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.591406
		terraceProb     0.339426
		erosion         0
		montesMagn      0.48898
		montesFreq      3.67285
		montesSpiky     0.947787
		montesFraction  0.252929
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.78295e-005
		hillsFraction   0.587335
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255827
		craterFreq      0.159234
		craterDensity   0.615664
		craterOctaves   2.02654
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   203.387
		volcanoTemp     1723.98
		lavaCoverTidal  0
		lavaCoverSun    0.303217
		lavaCoverYoung  0
		colorSea       (0.230, 0.176, 0.119, 0.000)
		colorShelf     (0.236, 0.182, 0.137, 0.000)
		colorBeach     (0.277, 0.213, 0.162, 0.000)
		colorDesert    (0.301, 0.228, 0.158, 0.000)
		colorLowland   (0.330, 0.244, 0.179, 0.000)
		colorUpland    (0.366, 0.296, 0.218, 0.000)
		colorRock      (0.395, 0.322, 0.235, 0.000)
		colorSnow      (0.430, 0.343, 0.247, 1.000)
		BumpHeight      0.11669
		BumpOffset      0.0233381
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0767976
		Period          0.260948
		Eccentricity    0.14844
		Inclination     -0.9657
		AscendingNode   40.661
		ArgOfPericenter 35.1804
		MeanAnomaly     134.17
	}
}

Asteroid	"S78"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.47003e-011
	Radius          1.65649
	InertiaMoment   0.398623

	RotationPeriod  11024
	Obliquity       -1.68293
	EqAscendNode    -71.612

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.738 0.735 0.733)

	Surface
	{
		SurfStyle       0.56214
		OceanStyle      0.962218
		Randomize      (0.086, -0.166, -0.453)
		colorDistMagn   0.390851
		colorDistFreq   0.0009881
		detailScale     45.2332
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0476221
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.551756
		terraceProb     0.261257
		erosion         0
		montesMagn      0.430357
		montesFreq      3.51174
		montesSpiky     0.873008
		montesFraction  0.800295
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00605016
		hillsFraction   0.524271
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259029
		craterFreq      0.238091
		craterDensity   0.745366
		craterOctaves   4.97393
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   67.7379
		volcanoTemp     1703.68
		lavaCoverTidal  0
		lavaCoverSun    0.222543
		lavaCoverYoung  0
		colorSea       (0.288, 0.250, 0.205, 0.000)
		colorShelf     (0.295, 0.257, 0.234, 0.000)
		colorBeach     (0.347, 0.302, 0.278, 0.000)
		colorDesert    (0.376, 0.324, 0.271, 0.000)
		colorLowland   (0.413, 0.346, 0.308, 0.000)
		colorUpland    (0.457, 0.419, 0.374, 0.000)
		colorRock      (0.494, 0.456, 0.403, 0.000)
		colorSnow      (0.539, 0.485, 0.425, 1.000)
		BumpHeight      1.49084
		BumpOffset      0.298168
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0869569
		Period          0.314405
		Eccentricity    0.137359
		Inclination     -1.68293
		AscendingNode   -71.612
		ArgOfPericenter -122.91
		MeanAnomaly     -125.005
	}
}

Asteroid	"S79"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.16323e-008
	Radius          21.4385
	InertiaMoment   0.399616

	RotationPeriod  8579.69
	Obliquity       0.218854
	EqAscendNode    90.5626

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.540 0.537 0.534)

	Surface
	{
		SurfStyle       0.0352638
		OceanStyle      0.722555
		Randomize      (0.638, 0.058, -0.063)
		colorDistMagn   0.126485
		colorDistFreq   0.24044
		detailScale     585.415
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00537107
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.537646
		terraceProb     0.364364
		erosion         0
		montesMagn      0.608824
		montesFreq      3.04249
		montesSpiky     0.851036
		montesFraction  0.51299
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.15603
		hillsFraction   0.627025
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27758
		craterFreq      0.20813
		craterDensity   0.51939
		craterOctaves   4.41681
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.8533
		volcanoTemp     1515.27
		lavaCoverTidal  0
		lavaCoverSun    0.438635
		lavaCoverYoung  0
		colorSea       (0.216, 0.215, 0.214, 0.000)
		colorShelf     (0.230, 0.228, 0.227, 0.000)
		colorBeach     (0.243, 0.242, 0.240, 0.000)
		colorDesert    (0.257, 0.255, 0.254, 0.000)
		colorLowland   (0.270, 0.269, 0.267, 0.000)
		colorUpland    (0.284, 0.282, 0.280, 0.000)
		colorRock      (0.297, 0.295, 0.294, 0.000)
		colorSnow      (0.311, 0.309, 0.307, 1.000)
		BumpHeight      19.2947
		BumpOffset      3.85894
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0634043
		Period          0.195754
		Eccentricity    0.130215
		Inclination     0.218854
		AscendingNode   90.5626
		ArgOfPericenter 166.938
		MeanAnomaly     150.847
	}
}

Asteroid	"S80"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.2673e-016
	Radius          0.0302391
	InertiaMoment   0.397462

	Obliquity       -6.28725
	EqAscendNode    82.0354
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.648 0.584 0.503)

	Surface
	{
		SurfStyle       0.0369755
		OceanStyle      0.922351
		Randomize      (-0.174, -0.959, 0.489)
		colorDistMagn   0.861992
		colorDistFreq   7.32944e-007
		detailScale     0.82573
		colorConversion true
		snowLevel       2
		tropicLatitude  0.164692
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.723157
		terraceProb     0.466792
		erosion         0
		montesMagn      0.585245
		montesFreq      2.23558
		montesSpiky     0.844707
		montesFraction  0.699017
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.13514e-006
		hillsFraction   0.449344
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235773
		craterFreq      0.223568
		craterDensity   0.786691
		craterOctaves   1.15372
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   421.149
		volcanoTemp     1069.12
		lavaCoverTidal  0
		lavaCoverSun    0.253035
		lavaCoverYoung  0
		colorSea       (0.259, 0.233, 0.201, 0.000)
		colorShelf     (0.276, 0.248, 0.214, 0.000)
		colorBeach     (0.292, 0.263, 0.226, 0.000)
		colorDesert    (0.308, 0.277, 0.239, 0.000)
		colorLowland   (0.324, 0.292, 0.251, 0.000)
		colorUpland    (0.340, 0.306, 0.264, 0.000)
		colorRock      (0.357, 0.321, 0.276, 0.000)
		colorSnow      (0.373, 0.336, 0.289, 1.000)
		BumpHeight      0.0272152
		BumpOffset      0.00544305
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0788261
		Period          0.271355
		Eccentricity    0.0886922
		Inclination     -6.28725
		AscendingNode   82.0354
		ArgOfPericenter 67.1149
		MeanAnomaly     -146.654
	}
}

Asteroid	"S81"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.8649e-013
	Radius          0.386337
	InertiaMoment   0.398838

	Obliquity       4.71556
	EqAscendNode    -64.7581
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.635 0.633 0.629)

	Surface
	{
		SurfStyle       0.271802
		OceanStyle      0.55081
		Randomize      (-0.072, -0.955, 0.700)
		colorDistMagn   0.375709
		colorDistFreq   7.89279e-005
		detailScale     10.5496
		colorConversion true
		snowLevel       2
		tropicLatitude  0.13852
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.459989
		terraceProb     0.481026
		erosion         0
		montesMagn      0.698569
		montesFreq      3.63824
		montesSpiky     0.918279
		montesFraction  0.567411
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000428572
		hillsFraction   0.472081
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217831
		craterFreq      0.18241
		craterDensity   0.701135
		craterOctaves   3.32153
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   140.264
		volcanoTemp     1614.32
		lavaCoverTidal  0
		lavaCoverSun    0.269308
		lavaCoverYoung  0
		colorSea       (0.254, 0.253, 0.252, 0.000)
		colorShelf     (0.270, 0.269, 0.267, 0.000)
		colorBeach     (0.286, 0.285, 0.283, 0.000)
		colorDesert    (0.302, 0.300, 0.299, 0.000)
		colorLowland   (0.317, 0.316, 0.315, 0.000)
		colorUpland    (0.333, 0.332, 0.330, 0.000)
		colorRock      (0.349, 0.348, 0.346, 0.000)
		colorSnow      (0.365, 0.364, 0.362, 1.000)
		BumpHeight      0.347704
		BumpOffset      0.0695407
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0783186
		Period          0.268738
		Eccentricity    0.111257
		Inclination     4.71556
		AscendingNode   -64.7581
		ArgOfPericenter 83.2924
		MeanAnomaly     -41.5018
	}
}

Asteroid	"S82"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.74429e-010
	Radius          5.00036
	InertiaMoment   0.399794

	Obliquity       4.67761
	EqAscendNode    -12.5683
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.612 0.605 0.600)

	Surface
	{
		SurfStyle       0.603055
		OceanStyle      0.696071
		Randomize      (0.502, -0.791, 0.543)
		colorDistMagn   0.903041
		colorDistFreq   0.0172592
		detailScale     136.543
		colorConversion true
		snowLevel       2
		tropicLatitude  0.161584
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.335254
		terraceProb     0.338716
		erosion         0
		montesMagn      0.515827
		montesFreq      3.12784
		montesSpiky     0.970982
		montesFraction  0.363414
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0470898
		hillsFraction   0.595584
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257042
		craterFreq      0.217134
		craterDensity   0.540147
		craterOctaves   2.9227
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.3252
		volcanoTemp     1192.19
		lavaCoverTidal  0
		lavaCoverSun    0.482991
		lavaCoverYoung  0
		colorSea       (0.238, 0.206, 0.168, 0.000)
		colorShelf     (0.245, 0.212, 0.192, 0.000)
		colorBeach     (0.287, 0.248, 0.228, 0.000)
		colorDesert    (0.312, 0.266, 0.222, 0.000)
		colorLowland   (0.342, 0.284, 0.252, 0.000)
		colorUpland    (0.379, 0.345, 0.306, 0.000)
		colorRock      (0.410, 0.375, 0.330, 0.000)
		colorSnow      (0.446, 0.399, 0.348, 1.000)
		BumpHeight      4.50032
		BumpOffset      0.900065
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0563256
		Period          0.163905
		Eccentricity    0.0542432
		Inclination     4.67761
		AscendingNode   -12.5683
		ArgOfPericenter 4.38325
		MeanAnomaly     -174.423
	}
}

Asteroid	"S83"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.03837e-007
	Radius          44.4865
	InertiaMoment   0.397816

	RotationPeriod  3713.82
	Obliquity       -3.65779
	EqAscendNode    167.903

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.773 0.683 0.619)

	Surface
	{
		SurfStyle       0.222222
		OceanStyle      0.877547
		Randomize      (0.074, -0.589, -0.516)
		colorDistMagn   0.257988
		colorDistFreq   0.47317
		detailScale     1214.78
		colorConversion true
		snowLevel       2
		tropicLatitude  0.013443
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.574311
		terraceProb     0.114971
		erosion         0
		montesMagn      0.350913
		montesFreq      2.65812
		montesSpiky     0.94317
		montesFraction  0.688551
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.18227
		hillsFraction   0.545798
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241288
		craterFreq      0.212971
		craterDensity   0.595546
		craterOctaves   9.14646
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   10.9757
		volcanoTemp     1671.5
		lavaCoverTidal  0
		lavaCoverSun    0.201743
		lavaCoverYoung  0
		colorSea       (0.309, 0.273, 0.248, 0.000)
		colorShelf     (0.328, 0.290, 0.263, 0.000)
		colorBeach     (0.348, 0.307, 0.279, 0.000)
		colorDesert    (0.367, 0.324, 0.294, 0.000)
		colorLowland   (0.386, 0.341, 0.310, 0.000)
		colorUpland    (0.406, 0.359, 0.325, 0.000)
		colorRock      (0.425, 0.376, 0.340, 0.000)
		colorSnow      (0.444, 0.393, 0.356, 1.000)
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
		SemiMajorAxis   0.0875734
		Period          0.317754
		Eccentricity    0.100633
		Inclination     -3.65779
		AscendingNode   167.903
		ArgOfPericenter 162.469
		MeanAnomaly     -152.166
	}
}

Asteroid	"S84"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.36582e-015
	Radius          0.0901036
	InertiaMoment   0.399041

	RotationPeriod  2904.62
	Obliquity       -1.95996
	EqAscendNode    110.393

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.768 0.718 0.633)

	Surface
	{
		SurfStyle       0.284323
		OceanStyle      0.554902
		Randomize      (0.118, 0.010, 0.835)
		colorDistMagn   0.416734
		colorDistFreq   1.11789e-006
		detailScale     2.46043
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0390337
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.275323
		terraceProb     0.591971
		erosion         0
		montesMagn      0.631519
		montesFreq      3.11359
		montesSpiky     0.769339
		montesFraction  0.665799
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.74622e-005
		hillsFraction   0.802986
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201923
		craterFreq      0.226185
		craterDensity   0.638065
		craterOctaves   1.1143
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   290.44
		volcanoTemp     1643.58
		lavaCoverTidal  0
		lavaCoverSun    0.410739
		lavaCoverYoung  0
		colorSea       (0.307, 0.287, 0.253, 0.000)
		colorShelf     (0.326, 0.305, 0.269, 0.000)
		colorBeach     (0.346, 0.323, 0.285, 0.000)
		colorDesert    (0.365, 0.341, 0.301, 0.000)
		colorLowland   (0.384, 0.359, 0.317, 0.000)
		colorUpland    (0.403, 0.377, 0.333, 0.000)
		colorRock      (0.422, 0.395, 0.348, 0.000)
		colorSnow      (0.442, 0.413, 0.364, 1.000)
		BumpHeight      0.0810932
		BumpOffset      0.0162186
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0640635
		Period          0.198815
		Eccentricity    0.105611
		Inclination     -1.95996
		AscendingNode   110.393
		ArgOfPericenter 31.2029
		MeanAnomaly     60.7866
	}
}

Asteroid	"S85"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.48144e-012
	Radius          1.16623
	InertiaMoment   0.399971

	RotationPeriod  4761.42
	Obliquity       5.85443
	EqAscendNode    126.968

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.671 0.666 0.662)

	Surface
	{
		SurfStyle       0.262763
		OceanStyle      0.861817
		Randomize      (-0.455, 0.634, -0.222)
		colorDistMagn   0.636217
		colorDistFreq   0.000653071
		detailScale     31.8458
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0909827
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.295185
		terraceProb     0.485682
		erosion         0
		montesMagn      0.466916
		montesFreq      2.91431
		montesSpiky     0.853744
		montesFraction  0.683758
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00277211
		hillsFraction   0.825183
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238022
		craterFreq      0.213483
		craterDensity   0.504793
		craterOctaves   4.3856
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   97.9964
		volcanoTemp     1481.32
		lavaCoverTidal  0
		lavaCoverSun    0.273125
		lavaCoverYoung  0
		colorSea       (0.268, 0.267, 0.265, 0.000)
		colorShelf     (0.285, 0.283, 0.281, 0.000)
		colorBeach     (0.302, 0.300, 0.298, 0.000)
		colorDesert    (0.319, 0.317, 0.314, 0.000)
		colorLowland   (0.335, 0.333, 0.331, 0.000)
		colorUpland    (0.352, 0.350, 0.347, 0.000)
		colorRock      (0.369, 0.367, 0.364, 0.000)
		colorSnow      (0.386, 0.383, 0.381, 1.000)
		BumpHeight      1.04961
		BumpOffset      0.209921
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0788717
		Period          0.271591
		Eccentricity    0.125949
		Inclination     5.85443
		AscendingNode   126.968
		ArgOfPericenter -144.811
		MeanAnomaly     44.7285
	}
}

Asteroid	"S86"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.12313e-009
	Radius          10.3777
	InertiaMoment   0.398111

	RotationPeriod  1788
	Obliquity       2.27304
	EqAscendNode    164.525

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.778 0.752 0.716)

	Surface
	{
		SurfStyle       0.800173
		OceanStyle      0.206589
		Randomize      (-0.542, -0.334, -0.347)
		colorDistMagn   0.464141
		colorDistFreq   0.03201
		detailScale     283.38
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0106808
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.475194
		terraceProb     0.30337
		erosion         0
		montesMagn      0.440587
		montesFreq      3.67196
		montesSpiky     0.954837
		montesFraction  0.567777
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.253172
		hillsFraction   0.811334
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253617
		craterFreq      0.261423
		craterDensity   0.659552
		craterOctaves   6.54845
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.7321
		volcanoTemp     1698
		lavaCoverTidal  0
		lavaCoverSun    0.240359
		lavaCoverYoung  0
		colorSea       (0.303, 0.256, 0.200, 0.000)
		colorShelf     (0.311, 0.263, 0.229, 0.000)
		colorBeach     (0.366, 0.308, 0.272, 0.000)
		colorDesert    (0.397, 0.331, 0.265, 0.000)
		colorLowland   (0.436, 0.353, 0.301, 0.000)
		colorUpland    (0.482, 0.428, 0.365, 0.000)
		colorRock      (0.521, 0.466, 0.394, 0.000)
		colorSnow      (0.568, 0.496, 0.415, 1.000)
		BumpHeight      9.33991
		BumpOffset      1.86798
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0853933
		Period          0.305963
		Eccentricity    0.153369
		Inclination     2.27304
		AscendingNode   164.525
		ArgOfPericenter -144.905
		MeanAnomaly     -35.593
	}
}

Asteroid	"S87"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.00131e-017
	Radius          0.0210145
	InertiaMoment   0.399234

	Obliquity       1.89905
	EqAscendNode    76.7913
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.583 0.580 0.576)

	Surface
	{
		SurfStyle       0.68069
		OceanStyle      0.438971
		Randomize      (-0.233, 0.331, 0.131)
		colorDistMagn   0.0856005
		colorDistFreq   3.84348e-007
		detailScale     0.573836
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0519265
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431629
		terraceProb     0.189206
		erosion         0
		montesMagn      0.582137
		montesFreq      2.3749
		montesSpiky     0.940647
		montesFraction  0.50896
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.09139e-006
		hillsFraction   0.659356
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240875
		craterFreq      0.224343
		craterDensity   0
		craterOctaves   0.653038
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   601.409
		volcanoTemp     1630.44
		lavaCoverTidal  0
		lavaCoverSun    0.201926
		lavaCoverYoung  0
		colorSea       (0.227, 0.197, 0.161, 0.000)
		colorShelf     (0.233, 0.203, 0.184, 0.000)
		colorBeach     (0.274, 0.238, 0.219, 0.000)
		colorDesert    (0.297, 0.255, 0.213, 0.000)
		colorLowland   (0.327, 0.272, 0.242, 0.000)
		colorUpland    (0.362, 0.330, 0.294, 0.000)
		colorRock      (0.391, 0.359, 0.317, 0.000)
		colorSnow      (0.426, 0.383, 0.334, 1.000)
		BumpHeight      0.018913
		BumpOffset      0.00378261
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0798661
		Period          0.276743
		Eccentricity    0.00421011
		Inclination     1.89905
		AscendingNode   76.7913
		ArgOfPericenter 51.1168
		MeanAnomaly     -40.9871
	}
}

Asteroid	"S88"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.41659e-014
	Radius          0.271995
	InertiaMoment   0.396217

	Obliquity       3.4832
	EqAscendNode    100.545
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.755 0.690 0.665)

	Surface
	{
		SurfStyle       0.691013
		OceanStyle      0.344459
		Randomize      (0.526, -0.603, -0.555)
		colorDistMagn   0.648723
		colorDistFreq   4.27146e-005
		detailScale     7.42727
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0776042
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.643815
		terraceProb     0.392089
		erosion         0
		montesMagn      0.535967
		montesFreq      3.95739
		montesSpiky     0.970378
		montesFraction  0.574558
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000247001
		hillsFraction   0.576798
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252516
		craterFreq      0.227769
		craterDensity   0.535629
		craterOctaves   1.67373
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   202.919
		volcanoTemp     1865.2
		lavaCoverTidal  0
		lavaCoverSun    0.443162
		lavaCoverYoung  0
		colorSea       (0.294, 0.235, 0.186, 0.000)
		colorShelf     (0.302, 0.242, 0.213, 0.000)
		colorBeach     (0.355, 0.283, 0.253, 0.000)
		colorDesert    (0.385, 0.304, 0.246, 0.000)
		colorLowland   (0.423, 0.325, 0.279, 0.000)
		colorUpland    (0.468, 0.394, 0.339, 0.000)
		colorRock      (0.506, 0.428, 0.366, 0.000)
		colorSnow      (0.551, 0.456, 0.386, 1.000)
		BumpHeight      0.244795
		BumpOffset      0.048959
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.064102
		Period          0.198994
		Eccentricity    0.148351
		Inclination     3.4832
		AscendingNode   100.545
		ArgOfPericenter -53.58
		MeanAnomaly     -92.6328
	}
}

Asteroid	"S89"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            6.49924e-011
	Radius          2.42043
	InertiaMoment   0.398371

	RotationPeriod  3333.58
	Obliquity       -1.24496
	EqAscendNode    133

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.510 0.502 0.497)

	Surface
	{
		SurfStyle       0.428056
		OceanStyle      0.00922958
		Randomize      (0.344, 0.390, 0.680)
		colorDistMagn   0.354657
		colorDistFreq   0.00232485
		detailScale     66.094
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0173282
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.385882
		terraceProb     0.155001
		erosion         0
		montesMagn      0.339409
		montesFreq      3.50394
		montesSpiky     0.978749
		montesFraction  0.61826
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0123463
		hillsFraction   0.611568
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234376
		craterFreq      0.274531
		craterDensity   0.8484
		craterOctaves   5.50019
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.0726
		volcanoTemp     1777.49
		lavaCoverTidal  0
		lavaCoverSun    0.229649
		lavaCoverYoung  0
		colorSea       (0.204, 0.201, 0.199, 0.000)
		colorShelf     (0.217, 0.213, 0.211, 0.000)
		colorBeach     (0.229, 0.226, 0.224, 0.000)
		colorDesert    (0.242, 0.239, 0.236, 0.000)
		colorLowland   (0.255, 0.251, 0.249, 0.000)
		colorUpland    (0.268, 0.264, 0.261, 0.000)
		colorRock      (0.280, 0.276, 0.274, 0.000)
		colorSnow      (0.293, 0.289, 0.286, 1.000)
		BumpHeight      2.17839
		BumpOffset      0.435678
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0814889
		Period          0.28522
		Eccentricity    0.080134
		Inclination     -1.24496
		AscendingNode   133
		ArgOfPericenter -159.892
		MeanAnomaly     -71.8107
	}
}

Asteroid	"S90"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            9.56398e-008
	Radius          30.9192
	InertiaMoment   0.399421

	RotationPeriod  5462.94
	Obliquity       -4.29774
	EqAscendNode    123.734

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.424 0.418 0.416)

	Surface
	{
		SurfStyle       0.166078
		OceanStyle      0.828138
		Randomize      (0.388, -0.593, -0.183)
		colorDistMagn   0.462275
		colorDistFreq   0.529392
		detailScale     844.301
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0706269
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.522073
		terraceProb     0.446823
		erosion         0
		montesMagn      0.38867
		montesFreq      3.95984
		montesSpiky     0.941483
		montesFraction  0.715999
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.23056
		hillsFraction   0.645611
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210676
		craterFreq      0.213902
		craterDensity   0.729768
		craterOctaves   9.24326
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   15.6753
		volcanoTemp     1309.44
		lavaCoverTidal  0
		lavaCoverSun    0.164989
		lavaCoverYoung  0
		colorSea       (0.170, 0.167, 0.166, 0.000)
		colorShelf     (0.180, 0.178, 0.177, 0.000)
		colorBeach     (0.191, 0.188, 0.187, 0.000)
		colorDesert    (0.201, 0.199, 0.198, 0.000)
		colorLowland   (0.212, 0.209, 0.208, 0.000)
		colorUpland    (0.223, 0.220, 0.218, 0.000)
		colorRock      (0.233, 0.230, 0.229, 0.000)
		colorSnow      (0.244, 0.240, 0.239, 1.000)
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
		SemiMajorAxis   0.0976118
		Period          0.373926
		Eccentricity    0.133942
		Inclination     -4.29774
		AscendingNode   123.734
		ArgOfPericenter 16.9389
		MeanAnomaly     -106.182
	}
}

Asteroid	"S91"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.60293e-016
	Radius          0.0634361
	InertiaMoment   0.396962

	Obliquity       -4.71859
	EqAscendNode    159.95
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.680 0.597 0.550)

	Surface
	{
		SurfStyle       0.710438
		OceanStyle      0.879382
		Randomize      (0.776, -0.830, -0.635)
		colorDistMagn   0.342442
		colorDistFreq   1.61821e-006
		detailScale     1.73223
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0286376
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.568488
		terraceProb     0.367704
		erosion         0
		montesMagn      0.470351
		montesFreq      3.13024
		montesSpiky     0.954205
		montesFraction  0.757624
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.17614e-005
		hillsFraction   0.602522
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250337
		craterFreq      0.229108
		craterDensity   0
		craterOctaves   0.773073
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   420.179
		volcanoTemp     1727.64
		lavaCoverTidal  0
		lavaCoverSun    0.517587
		lavaCoverYoung  0
		colorSea       (0.265, 0.203, 0.154, 0.000)
		colorShelf     (0.272, 0.209, 0.176, 0.000)
		colorBeach     (0.320, 0.245, 0.209, 0.000)
		colorDesert    (0.347, 0.263, 0.204, 0.000)
		colorLowland   (0.381, 0.281, 0.231, 0.000)
		colorUpland    (0.422, 0.340, 0.281, 0.000)
		colorRock      (0.456, 0.370, 0.303, 0.000)
		colorSnow      (0.497, 0.394, 0.319, 1.000)
		BumpHeight      0.0570925
		BumpOffset      0.0114185
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0528463
		Period          0.148955
		Eccentricity    0.024982
		Inclination     -4.71859
		AscendingNode   159.95
		ArgOfPericenter 134.8
		MeanAnomaly     134.056
	}
}

Asteroid	"S92"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            8.24502e-013
	Radius          0.564512
	InertiaMoment   0.398605

	Obliquity       5.13676
	EqAscendNode    63.7968
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.690 0.657 0.599)

	Surface
	{
		SurfStyle       0.804466
		OceanStyle      0.385896
		Randomize      (0.889, -0.080, -0.363)
		colorDistMagn   0.535676
		colorDistFreq   0.000110588
		detailScale     15.4149
		colorConversion true
		snowLevel       2
		tropicLatitude  0.151585
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.459601
		terraceProb     0.428317
		erosion         0
		montesMagn      0.568386
		montesFreq      2.48936
		montesSpiky     0.943751
		montesFraction  0.312454
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000844851
		hillsFraction   0.69255
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220671
		craterFreq      0.224058
		craterDensity   0.707146
		craterOctaves   3.47608
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   97.4727
		volcanoTemp     1419.59
		lavaCoverTidal  0
		lavaCoverSun    0.310676
		lavaCoverYoung  0
		colorSea       (0.269, 0.223, 0.168, 0.000)
		colorShelf     (0.276, 0.230, 0.192, 0.000)
		colorBeach     (0.324, 0.269, 0.228, 0.000)
		colorDesert    (0.352, 0.289, 0.222, 0.000)
		colorLowland   (0.387, 0.309, 0.252, 0.000)
		colorUpland    (0.428, 0.375, 0.305, 0.000)
		colorRock      (0.462, 0.408, 0.329, 0.000)
		colorSnow      (0.504, 0.434, 0.347, 1.000)
		BumpHeight      0.50806
		BumpOffset      0.101612
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0703977
		Period          0.229019
		Eccentricity    0.0647872
		Inclination     5.13676
		AscendingNode   63.7968
		ArgOfPericenter -129.009
		MeanAnomaly     97.3481
	}
}

Asteroid	"S93"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.2133e-009
	Radius          7.21205
	InertiaMoment   0.399602

	Obliquity       1.7376
	EqAscendNode    -25.5979
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.586 0.517 0.429)

	Surface
	{
		SurfStyle       0.7892
		OceanStyle      0.81613
		Randomize      (0.754, 0.272, 0.441)
		colorDistMagn   0.961171
		colorDistFreq   0.0447558
		detailScale     196.937
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0591116
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.346577
		terraceProb     0.351371
		erosion         0
		montesMagn      0.454687
		montesFreq      2.49696
		montesSpiky     0.982124
		montesFraction  0.709258
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.129795
		hillsFraction   0.666743
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232758
		craterFreq      0.209874
		craterDensity   0.666189
		craterOctaves   4.73253
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.4625
		volcanoTemp     1464
		lavaCoverTidal  0
		lavaCoverSun    0.361927
		lavaCoverYoung  0
		colorSea       (0.228, 0.176, 0.120, 0.000)
		colorShelf     (0.234, 0.181, 0.137, 0.000)
		colorBeach     (0.275, 0.212, 0.163, 0.000)
		colorDesert    (0.299, 0.227, 0.159, 0.000)
		colorLowland   (0.328, 0.243, 0.180, 0.000)
		colorUpland    (0.363, 0.295, 0.219, 0.000)
		colorRock      (0.392, 0.321, 0.236, 0.000)
		colorSnow      (0.427, 0.341, 0.249, 1.000)
		BumpHeight      6.49085
		BumpOffset      1.29817
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0658524
		Period          0.2072
		Eccentricity    0.0693004
		Inclination     1.7376
		AscendingNode   -25.5979
		ArgOfPericenter 61.5866
		MeanAnomaly     30.291
	}
}

Asteroid	"S94"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            7.10794e-018
	Radius          0.0147949
	InertiaMoment   0.397432

	Obliquity       -0.644077
	EqAscendNode    -74.9669
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.809 0.755 0.684)

	Surface
	{
		SurfStyle       0.940576
		OceanStyle      0.331401
		Randomize      (-0.538, 0.530, -0.762)
		colorDistMagn   0.864932
		colorDistFreq   5.43951e-008
		detailScale     0.404
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0178399
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.393729
		terraceProb     0.289664
		erosion         0
		montesMagn      0.550762
		montesFreq      3.45954
		montesSpiky     0.985495
		montesFraction  0.318879
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.34046e-007
		hillsFraction   0.432762
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247089
		craterFreq      0.216815
		craterDensity   0
		craterOctaves   0.356423
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   870.054
		volcanoTemp     1592.61
		lavaCoverTidal  0
		lavaCoverSun    0.423803
		lavaCoverYoung  0
		colorSea       (0.275, 0.264, 0.274, 0.050)
		colorShelf     (0.324, 0.309, 0.315, 0.040)
		colorBeach     (0.372, 0.355, 0.356, 0.030)
		colorDesert    (0.421, 0.400, 0.404, 0.020)
		colorLowland   (0.469, 0.445, 0.445, 0.030)
		colorUpland    (0.518, 0.491, 0.486, 0.050)
		colorRock      (0.567, 0.536, 0.540, 0.020)
		colorSnow      (0.567, 0.536, 0.540, 1.000)
		BumpHeight      0.0133154
		BumpOffset      0.00266308
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.064103
		Period          0.198999
		Eccentricity    0.123379
		Inclination     -0.644077
		AscendingNode   -74.9669
		ArgOfPericenter -63.378
		MeanAnomaly     -58.5463
	}
}

Asteroid	"S95"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.04597e-014
	Radius          0.131659
	InertiaMoment   0.398822

	Obliquity       -1.01823
	EqAscendNode    -149.202
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.527 0.517 0.513)

	Surface
	{
		SurfStyle       0.259584
		OceanStyle      0.0588651
		Randomize      (-0.793, 0.356, 0.170)
		colorDistMagn   0.744684
		colorDistFreq   5.38982e-006
		detailScale     3.59516
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00943649
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536253
		terraceProb     0.591543
		erosion         0
		montesMagn      0.490505
		montesFreq      2.86263
		montesSpiky     0.851288
		montesFraction  0.768273
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.06791e-005
		hillsFraction   0.90623
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230691
		craterFreq      0.201657
		craterDensity   0.78927
		craterOctaves   2.36273
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   201.835
		volcanoTemp     1298.72
		lavaCoverTidal  0
		lavaCoverSun    0.243521
		lavaCoverYoung  0
		colorSea       (0.211, 0.207, 0.205, 0.000)
		colorShelf     (0.224, 0.220, 0.218, 0.000)
		colorBeach     (0.237, 0.233, 0.231, 0.000)
		colorDesert    (0.250, 0.245, 0.244, 0.000)
		colorLowland   (0.263, 0.258, 0.256, 0.000)
		colorUpland    (0.277, 0.271, 0.269, 0.000)
		colorRock      (0.290, 0.284, 0.282, 0.000)
		colorSnow      (0.303, 0.297, 0.295, 1.000)
		BumpHeight      0.118493
		BumpOffset      0.0236985
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.085849
		Period          0.308415
		Eccentricity    0.165797
		Inclination     -1.01823
		AscendingNode   -149.202
		ArgOfPericenter 60.9757
		MeanAnomaly     106.264
	}
}

Asteroid	"S96"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.5392e-011
	Radius          1.68207
	InertiaMoment   0.39978

	Obliquity       4.44063
	EqAscendNode    -83.2083
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.580 0.575 0.570)

	Surface
	{
		SurfStyle       0.210636
		OceanStyle      0.679306
		Randomize      (0.201, 0.193, 0.018)
		colorDistMagn   0.976086
		colorDistFreq   0.0015551
		detailScale     45.9318
		colorConversion true
		snowLevel       2
		tropicLatitude  0.115596
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.69278
		terraceProb     0.348894
		erosion         0
		montesMagn      0.539772
		montesFreq      2.46374
		montesSpiky     0.973148
		montesFraction  0.249919
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00619126
		hillsFraction   0.567699
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245108
		craterFreq      0.263748
		craterDensity   0.705333
		craterOctaves   6.00608
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   67.2208
		volcanoTemp     1492.8
		lavaCoverTidal  0
		lavaCoverSun    0.140534
		lavaCoverYoung  0
		colorSea       (0.232, 0.230, 0.228, 0.000)
		colorShelf     (0.246, 0.244, 0.242, 0.000)
		colorBeach     (0.261, 0.259, 0.256, 0.000)
		colorDesert    (0.275, 0.273, 0.271, 0.000)
		colorLowland   (0.290, 0.287, 0.285, 0.000)
		colorUpland    (0.304, 0.302, 0.299, 0.000)
		colorRock      (0.319, 0.316, 0.313, 0.000)
		colorSnow      (0.333, 0.331, 0.327, 1.000)
		BumpHeight      1.51387
		BumpOffset      0.302773
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0945157
		Period          0.356278
		Eccentricity    0.0350754
		Inclination     4.44063
		AscendingNode   -83.2083
		ArgOfPericenter 21.8518
		MeanAnomaly     96.7716
	}
}

Asteroid	"S97"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.26502e-008
	Radius          21.7696
	InertiaMoment   0.397791

	RotationPeriod  3323.91
	Obliquity       -3.26414
	EqAscendNode    2.00278

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.437 0.433 0.428)

	Surface
	{
		SurfStyle       0.489848
		OceanStyle      0.136715
		Randomize      (0.089, -0.657, -0.859)
		colorDistMagn   0.475562
		colorDistFreq   0.219752
		detailScale     594.455
		colorConversion true
		snowLevel       2
		tropicLatitude  0.113677
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.422696
		terraceProb     0.364889
		erosion         0
		montesMagn      0.454926
		montesFreq      3.13409
		montesSpiky     0.918083
		montesFraction  0.428149
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.31517
		hillsFraction   0.659528
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254141
		craterFreq      0.220251
		craterDensity   0.594207
		craterOctaves   3.89132
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.6788
		volcanoTemp     1505.97
		lavaCoverTidal  0
		lavaCoverSun    0.476179
		lavaCoverYoung  0
		colorSea       (0.175, 0.173, 0.171, 0.000)
		colorShelf     (0.186, 0.184, 0.182, 0.000)
		colorBeach     (0.197, 0.195, 0.193, 0.000)
		colorDesert    (0.208, 0.206, 0.203, 0.000)
		colorLowland   (0.219, 0.216, 0.214, 0.000)
		colorUpland    (0.230, 0.227, 0.225, 0.000)
		colorRock      (0.241, 0.238, 0.236, 0.000)
		colorSnow      (0.252, 0.249, 0.246, 1.000)
		BumpHeight      19.5926
		BumpOffset      3.91853
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0620674
		Period          0.189595
		Eccentricity    0.152866
		Inclination     -3.26414
		AscendingNode   2.00278
		ArgOfPericenter 18.195
		MeanAnomaly     -70.7443
	}
}

Asteroid	"S98"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.32693e-016
	Radius          0.0307061
	InertiaMoment   0.399025

	Obliquity       -4.37182
	EqAscendNode    -102.803
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.671 0.666 0.663)

	Surface
	{
		SurfStyle       0.640318
		OceanStyle      0.287204
		Randomize      (-0.163, 0.055, 0.677)
		colorDistMagn   0.969531
		colorDistFreq   4.34022e-007
		detailScale     0.838482
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0950045
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584255
		terraceProb     0.19045
		erosion         0
		montesMagn      0.340989
		montesFreq      4.08676
		montesSpiky     0.992027
		montesFraction  0.553269
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.76126e-006
		hillsFraction   0.643761
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204119
		craterFreq      0.160641
		craterDensity   0
		craterOctaves   0.973322
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   417.934
		volcanoTemp     1649.23
		lavaCoverTidal  0
		lavaCoverSun    0.318113
		lavaCoverYoung  0
		colorSea       (0.262, 0.226, 0.186, 0.000)
		colorShelf     (0.268, 0.233, 0.212, 0.000)
		colorBeach     (0.315, 0.273, 0.252, 0.000)
		colorDesert    (0.342, 0.293, 0.245, 0.000)
		colorLowland   (0.376, 0.313, 0.279, 0.000)
		colorUpland    (0.416, 0.380, 0.338, 0.000)
		colorRock      (0.450, 0.413, 0.365, 0.000)
		colorSnow      (0.490, 0.440, 0.385, 1.000)
		BumpHeight      0.0276355
		BumpOffset      0.0055271
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0677861
		Period          0.216393
		Eccentricity    0.036439
		Inclination     -4.37182
		AscendingNode   -102.803
		ArgOfPericenter 103.818
		MeanAnomaly     167.789
	}
}

Asteroid	"S99"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.95264e-013
	Radius          0.392304
	InertiaMoment   0.399957

	Obliquity       1.88384
	EqAscendNode    7.53753
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.803 0.764 0.689)

	Surface
	{
		SurfStyle       0.931005
		OceanStyle      0.652101
		Randomize      (0.134, -0.668, 0.301)
		colorDistMagn   0.719759
		colorDistFreq   6.746e-005
		detailScale     10.7125
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0655691
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479612
		terraceProb     0.292829
		erosion         0
		montesMagn      0.37418
		montesFreq      2.59616
		montesSpiky     0.858605
		montesFraction  0.568456
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000333623
		hillsFraction   0.636125
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208861
		craterFreq      0.190246
		craterDensity   0.756883
		craterOctaves   3.39022
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   139.193
		volcanoTemp     999.625
		lavaCoverTidal  0
		lavaCoverSun    0.261261
		lavaCoverYoung  0
		colorSea       (0.273, 0.267, 0.276, 0.050)
		colorShelf     (0.321, 0.313, 0.317, 0.040)
		colorBeach     (0.370, 0.359, 0.358, 0.030)
		colorDesert    (0.418, 0.405, 0.407, 0.020)
		colorLowland   (0.466, 0.451, 0.448, 0.030)
		colorUpland    (0.514, 0.496, 0.489, 0.050)
		colorRock      (0.562, 0.542, 0.545, 0.020)
		colorSnow      (0.562, 0.542, 0.545, 1.000)
		BumpHeight      0.353073
		BumpOffset      0.0706147
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0857543
		Period          0.307905
		Eccentricity    0.199472
		Inclination     1.88384
		AscendingNode   7.53753
		ArgOfPericenter 43.2449
		MeanAnomaly     -103.634
	}
}

Asteroid	"S100"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.87342e-010
	Radius          5.07759
	InertiaMoment   0.39809

	Obliquity       2.71797
	EqAscendNode    -150.425
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.644 0.525 0.485)

	Surface
	{
		SurfStyle       0.627088
		OceanStyle      0.808768
		Randomize      (-0.697, 0.790, 0.908)
		colorDistMagn   0.603281
		colorDistFreq   0.0152007
		detailScale     138.652
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0242039
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494528
		terraceProb     0.245791
		erosion         0
		montesMagn      0.453855
		montesFreq      2.77172
		montesSpiky     0.785408
		montesFraction  0.861611
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0753117
		hillsFraction   0.648936
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223704
		craterFreq      0.25451
		craterDensity   0.736881
		craterOctaves   5.70218
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.9639
		volcanoTemp     1654.14
		lavaCoverTidal  0
		lavaCoverSun    0.257645
		lavaCoverYoung  0
		colorSea       (0.251, 0.179, 0.136, 0.000)
		colorShelf     (0.258, 0.184, 0.155, 0.000)
		colorBeach     (0.303, 0.215, 0.184, 0.000)
		colorDesert    (0.328, 0.231, 0.179, 0.000)
		colorLowland   (0.361, 0.247, 0.204, 0.000)
		colorUpland    (0.399, 0.299, 0.247, 0.000)
		colorRock      (0.432, 0.326, 0.267, 0.000)
		colorSnow      (0.470, 0.347, 0.281, 1.000)
		BumpHeight      4.56983
		BumpOffset      0.913966
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.0782299
		Period          0.268282
		Eccentricity    0.0889008
		Inclination     2.71797
		AscendingNode   -150.425
		ArgOfPericenter 68.2472
		MeanAnomaly     137.873
	}
}

Asteroid	"S101"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.18342e-014
	Radius          0.214312
	InertiaMoment   0.397358

	RotationPeriod  32559.5
	Obliquity       -0.481531
	EqAscendNode    -102.958

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.624 0.547 0.468)

	Surface
	{
		SurfStyle       0.195266
		OceanStyle      0.143226
		Randomize      (-0.948, -0.267, 0.044)
		colorDistMagn   0.642868
		colorDistFreq   2.01206e-005
		detailScale     5.85215
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0104666
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.354127
		terraceProb     0.169069
		erosion         0
		montesMagn      0.502184
		montesFreq      2.94827
		montesSpiky     0.971847
		montesFraction  0.442697
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.74999e-005
		hillsFraction   0.599159
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218221
		craterFreq      0.264681
		craterDensity   0.860203
		craterOctaves   4.85138
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   188.324
		volcanoTemp     1817.79
		lavaCoverTidal  0
		lavaCoverSun    0.0157616
		lavaCoverYoung  0
		colorSea       (0.250, 0.219, 0.187, 0.000)
		colorShelf     (0.265, 0.232, 0.199, 0.000)
		colorBeach     (0.281, 0.246, 0.210, 0.000)
		colorDesert    (0.297, 0.260, 0.222, 0.000)
		colorLowland   (0.312, 0.273, 0.234, 0.000)
		colorUpland    (0.328, 0.287, 0.246, 0.000)
		colorRock      (0.343, 0.301, 0.257, 0.000)
		colorSnow      (0.359, 0.314, 0.269, 1.000)
		BumpHeight      0.192881
		BumpOffset      0.0385762
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.179004
		Period          0.928594
		Eccentricity    0.133839
		Inclination     -0.481531
		AscendingNode   -102.958
		ArgOfPericenter 65.2527
		MeanAnomaly     109.548
	}
}

Asteroid	"S102"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.68457e-011
	Radius          2.77386
	InertiaMoment   0.398784

	RotationPeriod  38719.7
	Obliquity       1.69099
	EqAscendNode    83.7533

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.722 0.627 0.583)

	Surface
	{
		SurfStyle       0.527365
		OceanStyle      0.376635
		Randomize      (0.283, 0.650, -0.176)
		colorDistMagn   0.775168
		colorDistFreq   0.00296113
		detailScale     75.7449
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0439333
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508257
		terraceProb     0.39304
		erosion         0
		montesMagn      0.478319
		montesFreq      3.87852
		montesSpiky     0.929795
		montesFraction  0.265526
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0239958
		hillsFraction   0.748735
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230448
		craterFreq      0.150547
		craterDensity   0.807691
		craterOctaves   8.60672
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.5412
		volcanoTemp     1224.41
		lavaCoverTidal  0
		lavaCoverSun    0.0232549
		lavaCoverYoung  0
		colorSea       (0.282, 0.213, 0.163, 0.000)
		colorShelf     (0.289, 0.219, 0.187, 0.000)
		colorBeach     (0.339, 0.257, 0.222, 0.000)
		colorDesert    (0.368, 0.276, 0.216, 0.000)
		colorLowland   (0.404, 0.295, 0.245, 0.000)
		colorUpland    (0.448, 0.357, 0.297, 0.000)
		colorRock      (0.484, 0.389, 0.321, 0.000)
		colorSnow      (0.527, 0.414, 0.338, 1.000)
		BumpHeight      2.49647
		BumpOffset      0.499295
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.173151
		Period          0.883428
		Eccentricity    0.172162
		Inclination     1.69099
		AscendingNode   83.7533
		ArgOfPericenter 132.016
		MeanAnomaly     39.2562
	}
}

Asteroid	"S103"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            6.8936e-008
	Radius          24.6812
	InertiaMoment   0.399749

	RotationPeriod  467.74
	Obliquity       22.5557
	EqAscendNode    123.974

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.534 0.530 0.526)

	Surface
	{
		SurfStyle       0.216284
		OceanStyle      0.033435
		Randomize      (-0.472, 0.606, -0.790)
		colorDistMagn   0.903745
		colorDistFreq   0.433208
		detailScale     673.962
		colorConversion true
		snowLevel       2
		tropicLatitude  0.393888
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.506173
		terraceProb     0.320007
		erosion         0
		montesMagn      0.440745
		montesFreq      2.39608
		montesSpiky     0.952123
		montesFraction  0.459063
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.23427
		hillsFraction   0.668994
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.282224
		craterFreq      0.203276
		craterDensity   0.693445
		craterOctaves   12.7846
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   14.7384
		volcanoTemp     1377.01
		lavaCoverTidal  0
		lavaCoverSun    0.00875564
		lavaCoverYoung  0
		colorSea       (0.214, 0.212, 0.210, 0.000)
		colorShelf     (0.227, 0.225, 0.224, 0.000)
		colorBeach     (0.240, 0.238, 0.237, 0.000)
		colorDesert    (0.254, 0.252, 0.250, 0.000)
		colorLowland   (0.267, 0.265, 0.263, 0.000)
		colorUpland    (0.280, 0.278, 0.276, 0.000)
		colorRock      (0.294, 0.291, 0.289, 0.000)
		colorSnow      (0.307, 0.305, 0.302, 1.000)
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
		SemiMajorAxis   0.186514
		Period          0.987641
		Eccentricity    0.088184
		Inclination     -3.41085
		AscendingNode   96.8275
		ArgOfPericenter -9.61874
		MeanAnomaly     -71.3015
	}
}

Asteroid	"S104"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.03852e-016
	Radius          0.049983
	InertiaMoment   0.397732

	RotationPeriod  15906.3
	Obliquity       0.48581
	EqAscendNode    -177.31

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.541 0.536 0.531)

	Surface
	{
		SurfStyle       0.110334
		OceanStyle      0.606474
		Randomize      (0.749, 0.796, -0.217)
		colorDistMagn   0.69116
		colorDistFreq   1.93325e-006
		detailScale     1.36487
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470528
		terraceProb     0.323753
		erosion         0
		montesMagn      0.449874
		montesFreq      3.1185
		montesSpiky     0.955334
		montesFraction  0.808512
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.98515e-006
		hillsFraction   0.702584
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260922
		craterFreq      0.234786
		craterDensity   0.797359
		craterOctaves   1.92833
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   389.958
		volcanoTemp     1188.99
		lavaCoverTidal  0
		lavaCoverSun    0.0190327
		lavaCoverYoung  0
		colorSea       (0.216, 0.214, 0.213, 0.000)
		colorShelf     (0.230, 0.228, 0.226, 0.000)
		colorBeach     (0.243, 0.241, 0.239, 0.000)
		colorDesert    (0.257, 0.255, 0.252, 0.000)
		colorLowland   (0.270, 0.268, 0.266, 0.000)
		colorUpland    (0.284, 0.282, 0.279, 0.000)
		colorRock      (0.297, 0.295, 0.292, 0.000)
		colorSnow      (0.311, 0.308, 0.306, 1.000)
		BumpHeight      0.0449847
		BumpOffset      0.00899695
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.176256
		Period          0.907294
		Eccentricity    0.151516
		Inclination     0.48581
		AscendingNode   -177.31
		ArgOfPericenter -18.1822
		MeanAnomaly     -64.0471
	}
}

Asteroid	"S105"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.9429e-013
	Radius          0.646939
	InertiaMoment   0.39899

	RotationPeriod  26541.7
	Obliquity       1.65925
	EqAscendNode    -70.0097

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.468 0.466 0.463)

	Surface
	{
		SurfStyle       0.00840516
		OceanStyle      0.828693
		Randomize      (-0.490, 0.172, -0.713)
		colorDistMagn   0.646033
		colorDistFreq   0.000226312
		detailScale     17.6658
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0474216
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.558736
		terraceProb     0.144102
		erosion         0
		montesMagn      0.573416
		montesFreq      2.51652
		montesSpiky     0.920509
		montesFraction  0.375812
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00121785
		hillsFraction   0.504524
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237048
		craterFreq      0.213402
		craterDensity   0.776856
		craterOctaves   6.90944
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   131.574
		volcanoTemp     1058.42
		lavaCoverTidal  0
		lavaCoverSun    0.00683127
		lavaCoverYoung  0
		colorSea       (0.187, 0.186, 0.185, 0.000)
		colorShelf     (0.199, 0.198, 0.197, 0.000)
		colorBeach     (0.211, 0.210, 0.209, 0.000)
		colorDesert    (0.222, 0.221, 0.220, 0.000)
		colorLowland   (0.234, 0.233, 0.232, 0.000)
		colorUpland    (0.246, 0.245, 0.243, 0.000)
		colorRock      (0.258, 0.256, 0.255, 0.000)
		colorSnow      (0.269, 0.268, 0.266, 1.000)
		BumpHeight      0.582245
		BumpOffset      0.116449
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.18923
		Period          1.00929
		Eccentricity    0.0725665
		Inclination     1.65925
		AscendingNode   -70.0098
		ArgOfPericenter -49.3143
		MeanAnomaly     62.9095
	}
}

Asteroid	"S106"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            8.74528e-010
	Radius          5.75692
	InertiaMoment   0.399926

	RotationPeriod  31052.4
	Obliquity       -1.4517
	EqAscendNode    50.8041

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.721 0.678 0.641)

	Surface
	{
		SurfStyle       0.199827
		OceanStyle      0.788082
		Randomize      (-0.062, 0.210, -0.247)
		colorDistMagn   0.639219
		colorDistFreq   0.0178394
		detailScale     157.202
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0457577
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.458176
		terraceProb     0.386629
		erosion         0
		montesMagn      0.33961
		montesFreq      2.99004
		montesSpiky     0.949876
		montesFraction  0.586422
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0676399
		hillsFraction   0.563788
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23213
		craterFreq      0.207001
		craterDensity   0.932091
		craterOctaves   9.5707
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   30.5217
		volcanoTemp     1464.48
		lavaCoverTidal  0
		lavaCoverSun    0.0228418
		lavaCoverYoung  0
		colorSea       (0.288, 0.271, 0.256, 0.000)
		colorShelf     (0.306, 0.288, 0.272, 0.000)
		colorBeach     (0.324, 0.305, 0.288, 0.000)
		colorDesert    (0.342, 0.322, 0.304, 0.000)
		colorLowland   (0.360, 0.339, 0.321, 0.000)
		colorUpland    (0.378, 0.356, 0.337, 0.000)
		colorRock      (0.396, 0.373, 0.353, 0.000)
		colorSnow      (0.414, 0.390, 0.369, 1.000)
		BumpHeight      5.18123
		BumpOffset      1.03625
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.173437
		Period          0.885613
		Eccentricity    0.170233
		Inclination     -1.4517
		AscendingNode   50.8041
		ArgOfPericenter -129.559
		MeanAnomaly     -170.952
	}
}

Asteroid	"S107"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.12329e-018
	Radius          0.0116573
	InertiaMoment   0.39804

	Obliquity       -4.97485
	EqAscendNode    164.627
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.632 0.470 0.394)

	Surface
	{
		SurfStyle       0.597821
		OceanStyle      0.94808
		Randomize      (0.361, 0.968, -0.971)
		colorDistMagn   0.215783
		colorDistFreq   7.25604e-008
		detailScale     0.318323
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0231957
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.711749
		terraceProb     0.267837
		erosion         0
		montesMagn      0.33898
		montesFreq      2.05681
		montesSpiky     0.777998
		montesFraction  0.386424
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.27977e-007
		hillsFraction   0.696519
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245108
		craterFreq      0.24061
		craterDensity   0
		craterOctaves   0.988903
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   807.477
		volcanoTemp     1488.48
		lavaCoverTidal  0
		lavaCoverSun    0.00585697
		lavaCoverYoung  0
		colorSea       (0.247, 0.160, 0.110, 0.000)
		colorShelf     (0.253, 0.165, 0.126, 0.000)
		colorBeach     (0.297, 0.193, 0.150, 0.000)
		colorDesert    (0.322, 0.207, 0.146, 0.000)
		colorLowland   (0.354, 0.221, 0.165, 0.000)
		colorUpland    (0.392, 0.268, 0.201, 0.000)
		colorRock      (0.424, 0.292, 0.217, 0.000)
		colorSnow      (0.462, 0.310, 0.228, 1.000)
		BumpHeight      0.0104916
		BumpOffset      0.00209832
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.190787
		Period          1.02178
		Eccentricity    0.06381
		Inclination     -4.97485
		AscendingNode   164.627
		ArgOfPericenter 5.59819
		MeanAnomaly     139.589
	}
}

Asteroid	"S108"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            7.5392e-015
	Radius          0.132594
	InertiaMoment   0.399185

	Obliquity       -5.88818
	EqAscendNode    10.0345
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.828 0.781 0.740)

	Surface
	{
		SurfStyle       0.205554
		OceanStyle      0.567828
		Randomize      (0.904, 0.204, 0.014)
		colorDistMagn   0.681446
		colorDistFreq   1.25139e-005
		detailScale     3.6207
		colorConversion true
		snowLevel       2
		tropicLatitude  0.203319
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.356232
		terraceProb     0.315131
		erosion         0
		montesMagn      0.597062
		montesFreq      2.72299
		montesSpiky     0.933412
		montesFraction  0.715967
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.64156e-005
		hillsFraction   0.715184
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238617
		craterFreq      0.233935
		craterDensity   0.865453
		craterOctaves   3.92397
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   239.424
		volcanoTemp     1281.58
		lavaCoverTidal  0
		lavaCoverSun    0.0100516
		lavaCoverYoung  0
		colorSea       (0.331, 0.312, 0.296, 0.000)
		colorShelf     (0.352, 0.332, 0.314, 0.000)
		colorBeach     (0.372, 0.352, 0.333, 0.000)
		colorDesert    (0.393, 0.371, 0.351, 0.000)
		colorLowland   (0.414, 0.391, 0.370, 0.000)
		colorUpland    (0.435, 0.410, 0.388, 0.000)
		colorRock      (0.455, 0.430, 0.407, 0.000)
		colorSnow      (0.476, 0.449, 0.425, 1.000)
		BumpHeight      0.119335
		BumpOffset      0.0238669
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.18489
		Period          0.974771
		Eccentricity    0.0977415
		Inclination     -5.88818
		AscendingNode   10.0345
		ArgOfPericenter 44.7316
		MeanAnomaly     -44.0357
	}
}

Asteroid	"S109"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.10944e-011
	Radius          1.71618
	InertiaMoment   0.395904

	Obliquity       -0.214382
	EqAscendNode    -48.6523
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.574 0.567 0.562)

	Surface
	{
		SurfStyle       0.168206
		OceanStyle      0.178626
		Randomize      (-0.048, 0.391, -0.241)
		colorDistMagn   0.418729
		colorDistFreq   0.00149522
		detailScale     46.8632
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00681844
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.342725
		terraceProb     0.337756
		erosion         0
		montesMagn      0.37379
		montesFreq      3.44933
		montesSpiky     0.99077
		montesFraction  0.410671
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00864807
		hillsFraction   0.659729
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232591
		craterFreq      0.185557
		craterDensity   0.860002
		craterOctaves   7.93463
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   80.7827
		volcanoTemp     1476.72
		lavaCoverTidal  0
		lavaCoverSun    0.0043095
		lavaCoverYoung  0
		colorSea       (0.229, 0.227, 0.225, 0.000)
		colorShelf     (0.244, 0.241, 0.239, 0.000)
		colorBeach     (0.258, 0.255, 0.253, 0.000)
		colorDesert    (0.273, 0.269, 0.267, 0.000)
		colorLowland   (0.287, 0.283, 0.281, 0.000)
		colorUpland    (0.301, 0.298, 0.295, 0.000)
		colorRock      (0.316, 0.312, 0.309, 0.000)
		colorSnow      (0.330, 0.326, 0.323, 1.000)
		BumpHeight      1.54456
		BumpOffset      0.308913
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.193622
		Period          1.04464
		Eccentricity    0.0482349
		Inclination     -0.214382
		AscendingNode   -48.6523
		ArgOfPericenter 118.419
		MeanAnomaly     -137.995
	}
}

Asteroid	"S110"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.63259e-008
	Radius          15.2711
	InertiaMoment   0.398307

	RotationPeriod  890.139
	Obliquity       0.002896
	EqAscendNode    135.392

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.732 0.662 0.635)

	Surface
	{
		SurfStyle       0.257693
		OceanStyle      0.0918035
		Randomize      (-0.507, -0.051, -0.982)
		colorDistMagn   0.624783
		colorDistFreq   0.176889
		detailScale     417.002
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0711076
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.375486
		terraceProb     0.721874
		erosion         0
		montesMagn      0.3244
		montesFreq      3.21924
		montesSpiky     0.99095
		montesFraction  0.696966
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.511091
		hillsFraction   0.466739
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250885
		craterFreq      0.265591
		craterDensity   0.95125
		craterOctaves   11.7565
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   18.7386
		volcanoTemp     1124.8
		lavaCoverTidal  0
		lavaCoverSun    0.010734
		lavaCoverYoung  0
		colorSea       (0.293, 0.265, 0.254, 0.000)
		colorShelf     (0.311, 0.281, 0.270, 0.000)
		colorBeach     (0.329, 0.298, 0.286, 0.000)
		colorDesert    (0.348, 0.314, 0.301, 0.000)
		colorLowland   (0.366, 0.331, 0.317, 0.000)
		colorUpland    (0.384, 0.347, 0.333, 0.000)
		colorRock      (0.403, 0.364, 0.349, 0.000)
		colorSnow      (0.421, 0.381, 0.365, 1.000)
		BumpHeight      13.7439
		BumpOffset      2.74879
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.184088
		Period          0.968434
		Eccentricity    0.102525
		Inclination     -4.07555
		AscendingNode   134.946
		ArgOfPericenter 54.926
		MeanAnomaly     -121.804
	}
}

Asteroid	"S111"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            9.56432e-017
	Radius          0.0309243
	InertiaMoment   0.399373

	RotationPeriod  26566.6
	Obliquity       -1.24338
	EqAscendNode    -40.1849

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.539 0.413 0.327)

	Surface
	{
		SurfStyle       0.409738
		OceanStyle      0.547581
		Randomize      (-0.479, 0.395, 0.512)
		colorDistMagn   0.00585121
		colorDistFreq   3.24282e-007
		detailScale     0.84444
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0407491
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.445776
		terraceProb     0.443624
		erosion         0
		montesMagn      0.418673
		montesFreq      3.14518
		montesSpiky     0.988867
		montesFraction  0.761873
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.36722e-006
		hillsFraction   0.521726
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275244
		craterFreq      0.252327
		craterDensity   0.878585
		craterOctaves   1.97442
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   495.768
		volcanoTemp     1772.98
		lavaCoverTidal  0
		lavaCoverSun    0.00675409
		lavaCoverYoung  0
		colorSea       (0.215, 0.165, 0.131, 0.000)
		colorShelf     (0.229, 0.176, 0.139, 0.000)
		colorBeach     (0.242, 0.186, 0.147, 0.000)
		colorDesert    (0.256, 0.196, 0.155, 0.000)
		colorLowland   (0.269, 0.207, 0.164, 0.000)
		colorUpland    (0.283, 0.217, 0.172, 0.000)
		colorRock      (0.296, 0.227, 0.180, 0.000)
		colorSnow      (0.310, 0.238, 0.188, 1.000)
		BumpHeight      0.0278319
		BumpOffset      0.00556637
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.189348
		Period          1.01024
		Eccentricity    0.0718968
		Inclination     -1.24338
		AscendingNode   -40.1849
		ArgOfPericenter 87.1072
		MeanAnomaly     90.9678
	}
}

Asteroid	"S112"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.40744e-013
	Radius          0.400259
	InertiaMoment   0.396811

	RotationPeriod  35050.6
	Obliquity       0.846029
	EqAscendNode    2.58628

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.407 0.400 0.398)

	Surface
	{
		SurfStyle       0.116818
		OceanStyle      0.0331468
		Randomize      (-0.212, 0.106, -0.318)
		colorDistMagn   0.174161
		colorDistFreq   0.000124516
		detailScale     10.9297
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0295206
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.671803
		terraceProb     0.530389
		erosion         0
		montesMagn      0.662391
		montesFreq      3.81676
		montesSpiky     0.732297
		montesFraction  0.220177
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000279857
		hillsFraction   0.738069
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.177769
		craterFreq      0.187016
		craterDensity   1.04919
		craterOctaves   5.9131
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   167.275
		volcanoTemp     1647.87
		lavaCoverTidal  0
		lavaCoverSun    0.00765079
		lavaCoverYoung  0
		colorSea       (0.163, 0.160, 0.159, 0.000)
		colorShelf     (0.173, 0.170, 0.169, 0.000)
		colorBeach     (0.183, 0.180, 0.179, 0.000)
		colorDesert    (0.193, 0.190, 0.189, 0.000)
		colorLowland   (0.203, 0.200, 0.199, 0.000)
		colorUpland    (0.214, 0.210, 0.209, 0.000)
		colorRock      (0.224, 0.220, 0.219, 0.000)
		colorSnow      (0.234, 0.230, 0.229, 1.000)
		BumpHeight      0.360233
		BumpOffset      0.0720466
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.188022
		Period          0.999642
		Eccentricity    0.0794571
		Inclination     0.846029
		AscendingNode   2.58628
		ArgOfPericenter 34.8676
		MeanAnomaly     108.029
	}
}

Asteroid	"S113"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.07113e-010
	Radius          3.56182
	InertiaMoment   0.398547

	RotationPeriod  42893.6
	Obliquity       -1.96304
	EqAscendNode    -130.812

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.480 0.477 0.471)

	Surface
	{
		SurfStyle       0.0457551
		OceanStyle      0.714781
		Randomize      (-0.462, 0.168, 0.334)
		colorDistMagn   0.862197
		colorDistFreq   0.00786773
		detailScale     97.2615
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0285104
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.752257
		terraceProb     0.109288
		erosion         0
		montesMagn      0.559718
		montesFreq      3.62493
		montesSpiky     0.956568
		montesFraction  0.651116
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0255256
		hillsFraction   0.71122
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249361
		craterFreq      0.237067
		craterDensity   0.947672
		craterOctaves   9.81753
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.8039
		volcanoTemp     1806.76
		lavaCoverTidal  0
		lavaCoverSun    0.00964763
		lavaCoverYoung  0
		colorSea       (0.192, 0.191, 0.188, 0.000)
		colorShelf     (0.204, 0.203, 0.200, 0.000)
		colorBeach     (0.216, 0.215, 0.212, 0.000)
		colorDesert    (0.228, 0.227, 0.224, 0.000)
		colorLowland   (0.240, 0.238, 0.236, 0.000)
		colorUpland    (0.252, 0.250, 0.247, 0.000)
		colorRock      (0.264, 0.262, 0.259, 0.000)
		colorSnow      (0.276, 0.274, 0.271, 1.000)
		BumpHeight      3.20564
		BumpOffset      0.641128
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.185381
		Period          0.978658
		Eccentricity    0.0948326
		Inclination     -1.96304
		AscendingNode   -130.812
		ArgOfPericenter 79.4275
		MeanAnomaly     124.85
	}
}

Asteroid	"S114"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.04777e-007
	Radius          45.4958
	InertiaMoment   0.399556

	RotationPeriod  430.308
	Obliquity       20.4663
	EqAscendNode    -38.8959

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.682 0.533 0.447)

	Surface
	{
		SurfStyle       0.246988
		OceanStyle      0.232663
		Randomize      (-0.413, -0.853, -0.609)
		colorDistMagn   0.659937
		colorDistFreq   1.27299
		detailScale     1242.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.353251
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.728256
		terraceProb     0.431053
		erosion         0
		montesMagn      0.424415
		montesFreq      3.48895
		montesSpiky     0.999087
		montesFraction  0.369723
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.91861
		hillsFraction   0.614886
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21956
		craterFreq      0.213489
		craterDensity   0.909903
		craterOctaves   13.6424
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   12.9207
		volcanoTemp     1627.58
		lavaCoverTidal  0
		lavaCoverSun    0.0135294
		lavaCoverYoung  0
		colorSea       (0.273, 0.213, 0.179, 0.000)
		colorShelf     (0.290, 0.226, 0.190, 0.000)
		colorBeach     (0.307, 0.240, 0.201, 0.000)
		colorDesert    (0.324, 0.253, 0.212, 0.000)
		colorLowland   (0.341, 0.266, 0.223, 0.000)
		colorUpland    (0.358, 0.280, 0.235, 0.000)
		colorRock      (0.375, 0.293, 0.246, 0.000)
		colorSnow      (0.392, 0.306, 0.257, 1.000)
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
		SemiMajorAxis   0.181106
		Period          0.945002
		Eccentricity    0.120676
		Inclination     0.345142
		AscendingNode   -50.7516
		ArgOfPericenter 122.68
		MeanAnomaly     -40.4478
	}
}

Asteroid	"S115"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.7855e-015
	Radius          0.0933506
	InertiaMoment   0.397325

	Obliquity       -2.57458
	EqAscendNode    3.80398
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.455 0.452 0.447)

	Surface
	{
		SurfStyle       0.598188
		OceanStyle      0.617655
		Randomize      (0.716, -0.324, -0.645)
		colorDistMagn   0.190379
		colorDistFreq   3.26858e-006
		detailScale     2.54909
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0896995
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.603773
		terraceProb     0.519819
		erosion         0
		montesMagn      0.505701
		montesFreq      2.90918
		montesSpiky     0.904718
		montesFraction  0.937694
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.81519e-005
		hillsFraction   0.574451
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25846
		craterFreq      0.233613
		craterDensity   0.925677
		craterOctaves   3.96514
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   346.373
		volcanoTemp     1571.04
		lavaCoverTidal  0
		lavaCoverSun    0.00459649
		lavaCoverYoung  0
		colorSea       (0.177, 0.154, 0.125, 0.000)
		colorShelf     (0.182, 0.158, 0.143, 0.000)
		colorBeach     (0.214, 0.185, 0.170, 0.000)
		colorDesert    (0.232, 0.199, 0.166, 0.000)
		colorLowland   (0.255, 0.212, 0.188, 0.000)
		colorUpland    (0.282, 0.258, 0.228, 0.000)
		colorRock      (0.305, 0.280, 0.246, 0.000)
		colorSnow      (0.332, 0.298, 0.259, 1.000)
		BumpHeight      0.0840155
		BumpOffset      0.0168031
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.193055
		Period          1.04005
		Eccentricity    0.0513128
		Inclination     -2.57458
		AscendingNode   3.80398
		ArgOfPericenter 73.1488
		MeanAnomaly     -58.3457
	}
}

Asteroid	"S116"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.62745e-012
	Radius          0.830717
	InertiaMoment   0.398768

	Obliquity       -0.291663
	EqAscendNode    128.816
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.580 0.575 0.573)

	Surface
	{
		SurfStyle       0.225953
		OceanStyle      0.401589
		Randomize      (0.705, -0.947, -0.233)
		colorDistMagn   0.331469
		colorDistFreq   0.000340075
		detailScale     22.6841
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00439452
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446009
		terraceProb     0.223266
		erosion         0
		montesMagn      0.542975
		montesFreq      3.5618
		montesSpiky     0.94096
		montesFraction  0.78225
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00168845
		hillsFraction   0.65678
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261879
		craterFreq      0.183813
		craterDensity   0.930213
		craterOctaves   6.88352
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   80.3512
		volcanoTemp     1618.28
		lavaCoverTidal  0
		lavaCoverSun    0.00879422
		lavaCoverYoung  0
		colorSea       (0.232, 0.230, 0.229, 0.000)
		colorShelf     (0.246, 0.244, 0.244, 0.000)
		colorBeach     (0.261, 0.259, 0.258, 0.000)
		colorDesert    (0.275, 0.273, 0.272, 0.000)
		colorLowland   (0.290, 0.288, 0.287, 0.000)
		colorUpland    (0.304, 0.302, 0.301, 0.000)
		colorRock      (0.319, 0.316, 0.315, 0.000)
		colorSnow      (0.333, 0.331, 0.330, 1.000)
		BumpHeight      0.747645
		BumpOffset      0.149529
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.186463
		Period          0.98724
		Eccentricity    0.0884785
		Inclination     -0.291663
		AscendingNode   128.816
		ArgOfPericenter 40.5273
		MeanAnomaly     -136.343
	}
}

Asteroid	"S117"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.86643e-009
	Radius          10.6129
	InertiaMoment   0.399735

	RotationPeriod  5612.1
	Obliquity       5.38699
	EqAscendNode    36.4058

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.477 0.475 0.471)

	Surface
	{
		SurfStyle       0.203915
		OceanStyle      0.364111
		Randomize      (0.138, -0.713, 0.118)
		colorDistMagn   0.913934
		colorDistFreq   0.0712493
		detailScale     289.802
		colorConversion true
		snowLevel       2
		tropicLatitude  0.177647
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.604342
		terraceProb     0.229696
		erosion         0
		montesMagn      0.313865
		montesFreq      2.84107
		montesSpiky     0.911604
		montesFraction  0.730715
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.365522
		hillsFraction   0.514579
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255479
		craterFreq      0.230383
		craterDensity   0.903636
		craterOctaves   10.8623
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.7599
		volcanoTemp     1613.13
		lavaCoverTidal  0
		lavaCoverSun    0.00660817
		lavaCoverYoung  0
		colorSea       (0.191, 0.190, 0.188, 0.000)
		colorShelf     (0.203, 0.202, 0.200, 0.000)
		colorBeach     (0.214, 0.214, 0.212, 0.000)
		colorDesert    (0.226, 0.225, 0.224, 0.000)
		colorLowland   (0.238, 0.237, 0.236, 0.000)
		colorUpland    (0.250, 0.249, 0.247, 0.000)
		colorRock      (0.262, 0.261, 0.259, 0.000)
		colorSnow      (0.274, 0.273, 0.271, 1.000)
		BumpHeight      9.55159
		BumpOffset      1.91032
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.184219
		Period          0.96947
		Eccentricity    0.0403964
		Inclination     5.38615
		AscendingNode   36.3995
		ArgOfPericenter 64.339
		MeanAnomaly     116.245
	}
}

Asteroid	"S118"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.26509e-017
	Radius          0.0217717
	InertiaMoment   0.397706

	RotationPeriod  11093.2
	Obliquity       4.34759
	EqAscendNode    2.85209

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.688 0.609 0.521)

	Surface
	{
		SurfStyle       0.335367
		OceanStyle      0.531657
		Randomize      (-0.323, -0.766, -0.199)
		colorDistMagn   0.468579
		colorDistFreq   6.3988e-008
		detailScale     0.594513
		colorConversion true
		snowLevel       2
		tropicLatitude  0.151131
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.733525
		terraceProb     0.458991
		erosion         0
		montesMagn      0.420235
		montesFreq      2.74994
		montesSpiky     0.862351
		montesFraction  0.500317
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.23146e-006
		hillsFraction   0.637541
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247207
		craterFreq      0.251811
		craterDensity   0
		craterOctaves   0.975444
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   717.226
		volcanoTemp     1769.71
		lavaCoverTidal  0
		lavaCoverSun    0.0130045
		lavaCoverYoung  0
		colorSea       (0.275, 0.244, 0.208, 0.000)
		colorShelf     (0.292, 0.259, 0.222, 0.000)
		colorBeach     (0.310, 0.274, 0.235, 0.000)
		colorDesert    (0.327, 0.289, 0.248, 0.000)
		colorLowland   (0.344, 0.304, 0.261, 0.000)
		colorUpland    (0.361, 0.320, 0.274, 0.000)
		colorRock      (0.378, 0.335, 0.287, 0.000)
		colorSnow      (0.396, 0.350, 0.300, 1.000)
		BumpHeight      0.0195946
		BumpOffset      0.00391891
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.181633
		Period          0.949131
		Eccentricity    0.117423
		Inclination     4.34759
		AscendingNode   2.85209
		ArgOfPericenter 107.131
		MeanAnomaly     -50.5675
	}
}

Asteroid	"S119"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.3332e-014
	Radius          0.193745
	InertiaMoment   0.398974

	RotationPeriod  12690.7
	Obliquity       3.34904
	EqAscendNode    171.822

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.514 0.429 0.299)

	Surface
	{
		SurfStyle       0.771712
		OceanStyle      0.076547
		Randomize      (-0.996, 0.288, 0.779)
		colorDistMagn   0.595867
		colorDistFreq   2.11998e-005
		detailScale     5.29053
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00832938
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.449691
		terraceProb     0.219265
		erosion         0
		montesMagn      0.519619
		montesFreq      2.9012
		montesSpiky     0.794957
		montesFraction  0.561215
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000112433
		hillsFraction   0.437628
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263114
		craterFreq      0.236929
		craterDensity   0.829031
		craterOctaves   4.8708
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   166.382
		volcanoTemp     1495.1
		lavaCoverTidal  0
		lavaCoverSun    0.0136888
		lavaCoverYoung  0
		colorSea       (0.201, 0.146, 0.084, 0.000)
		colorShelf     (0.206, 0.150, 0.096, 0.000)
		colorBeach     (0.242, 0.176, 0.114, 0.000)
		colorDesert    (0.262, 0.189, 0.111, 0.000)
		colorLowland   (0.288, 0.202, 0.126, 0.000)
		colorUpland    (0.319, 0.245, 0.152, 0.000)
		colorRock      (0.345, 0.266, 0.164, 0.000)
		colorSnow      (0.375, 0.283, 0.173, 1.000)
		BumpHeight      0.17437
		BumpOffset      0.0348741
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.171215
		Period          0.86865
		Eccentricity    0.061476
		Inclination     3.34904
		AscendingNode   171.822
		ArgOfPericenter 87.6482
		MeanAnomaly     147.473
	}
}

Asteroid	"S120"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.90499e-011
	Radius          2.47528
	InertiaMoment   0.399912

	RotationPeriod  16097.6
	Obliquity       -0.114692
	EqAscendNode    -98.4549

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.674 0.598 0.522)

	Surface
	{
		SurfStyle       0.538156
		OceanStyle      0.892935
		Randomize      (0.190, 0.511, -0.538)
		colorDistMagn   0.859714
		colorDistFreq   0.00417986
		detailScale     67.5917
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00260671
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575048
		terraceProb     0.465807
		erosion         0
		montesMagn      0.433879
		montesFreq      2.98631
		montesSpiky     0.876433
		montesFraction  0.511215
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0153798
		hillsFraction   0.616688
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204954
		craterFreq      0.23936
		craterDensity   1.01631
		craterOctaves   8.70656
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   55.413
		volcanoTemp     1470.58
		lavaCoverTidal  0
		lavaCoverSun    0.0173018
		lavaCoverYoung  0
		colorSea       (0.263, 0.203, 0.146, 0.000)
		colorShelf     (0.270, 0.209, 0.167, 0.000)
		colorBeach     (0.317, 0.245, 0.198, 0.000)
		colorDesert    (0.344, 0.263, 0.193, 0.000)
		colorLowland   (0.378, 0.281, 0.219, 0.000)
		colorUpland    (0.418, 0.341, 0.266, 0.000)
		colorRock      (0.452, 0.371, 0.287, 0.000)
		colorSnow      (0.492, 0.395, 0.303, 1.000)
		BumpHeight      2.22775
		BumpOffset      0.445551
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.177666
		Period          0.918205
		Eccentricity    0.142375
		Inclination     -0.114692
		AscendingNode   -98.4549
		ArgOfPericenter 158.934
		MeanAnomaly     -147.021
	}
}

Asteroid	"S121"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            7.21797e-008
	Radius          32.0339
	InertiaMoment   0.398018

	RotationPeriod  762.888
	Obliquity       7.06851
	EqAscendNode    -83.9118

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.617 0.552 0.528)

	Surface
	{
		SurfStyle       0.536058
		OceanStyle      0.856053
		Randomize      (0.271, -0.785, -0.138)
		colorDistMagn   0.807317
		colorDistFreq   0.464246
		detailScale     874.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.119933
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57408
		terraceProb     0.168417
		erosion         0
		montesMagn      0.551814
		montesFreq      2.37746
		montesSpiky     0.932282
		montesFraction  0.898424
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.64547
		hillsFraction   0.599674
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213887
		craterFreq      0.216156
		craterDensity   0.958185
		craterOctaves   12.8582
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   18.6943
		volcanoTemp     1686.22
		lavaCoverTidal  0
		lavaCoverSun    0.00575792
		lavaCoverYoung  0
		colorSea       (0.241, 0.188, 0.148, 0.000)
		colorShelf     (0.247, 0.193, 0.169, 0.000)
		colorBeach     (0.290, 0.226, 0.201, 0.000)
		colorDesert    (0.315, 0.243, 0.195, 0.000)
		colorLowland   (0.346, 0.260, 0.222, 0.000)
		colorUpland    (0.383, 0.315, 0.269, 0.000)
		colorRock      (0.414, 0.342, 0.291, 0.000)
		colorSnow      (0.451, 0.365, 0.306, 1.000)
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
		SemiMajorAxis   0.18679
		Period          0.989838
		Eccentricity    0.0397139
		Inclination     1.56507
		AscendingNode   -102.937
		ArgOfPericenter 84.217
		MeanAnomaly     146.195
	}
}

Asteroid	"S122"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.22854e-016
	Radius          0.0451862
	InertiaMoment   0.399171

	Obliquity       -1.54218
	EqAscendNode    -110.474
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.808 0.758 0.691)

	Surface
	{
		SurfStyle       0.422284
		OceanStyle      0.836858
		Randomize      (-0.815, 0.340, -0.507)
		colorDistMagn   0.104319
		colorDistFreq   1.40403e-006
		detailScale     1.23389
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0306863
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637366
		terraceProb     0.147739
		erosion         0
		montesMagn      0.466205
		montesFreq      3.67426
		montesSpiky     0.96256
		montesFraction  0.346967
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.31745e-006
		hillsFraction   0.585079
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267628
		craterFreq      0.259539
		craterDensity   0.828781
		craterOctaves   1.95086
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   344.522
		volcanoTemp     1480.51
		lavaCoverTidal  0
		lavaCoverSun    0.0130123
		lavaCoverYoung  0
		colorSea       (0.323, 0.303, 0.277, 0.000)
		colorShelf     (0.343, 0.322, 0.294, 0.000)
		colorBeach     (0.364, 0.341, 0.311, 0.000)
		colorDesert    (0.384, 0.360, 0.328, 0.000)
		colorLowland   (0.404, 0.379, 0.346, 0.000)
		colorUpland    (0.424, 0.398, 0.363, 0.000)
		colorRock      (0.444, 0.417, 0.380, 0.000)
		colorSnow      (0.465, 0.436, 0.397, 1.000)
		BumpHeight      0.0406676
		BumpOffset      0.00813352
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.177454
		Period          0.916562
		Eccentricity    0.0919063
		Inclination     -1.54218
		AscendingNode   -110.474
		ArgOfPericenter 47.7192
		MeanAnomaly     -118.263
	}
}

Asteroid	"S123"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            6.22253e-013
	Radius          0.577302
	InertiaMoment   0.395786

	Obliquity       -0.735489
	EqAscendNode    0.952455
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.629 0.584 0.520)

	Surface
	{
		SurfStyle       0.182259
		OceanStyle      0.0720131
		Randomize      (-0.882, 0.557, 0.803)
		colorDistMagn   0.577916
		colorDistFreq   0.000190739
		detailScale     15.7642
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0256687
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.59553
		terraceProb     0.431658
		erosion         0
		montesMagn      0.377584
		montesFreq      3.31503
		montesSpiky     0.917674
		montesFraction  0.316141
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000765434
		hillsFraction   0.650317
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206102
		craterFreq      0.241671
		craterDensity   0.923589
		craterOctaves   6.83251
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   114.743
		volcanoTemp     1649.88
		lavaCoverTidal  0
		lavaCoverSun    0.0126689
		lavaCoverYoung  0
		colorSea       (0.252, 0.234, 0.208, 0.000)
		colorShelf     (0.267, 0.248, 0.221, 0.000)
		colorBeach     (0.283, 0.263, 0.234, 0.000)
		colorDesert    (0.299, 0.277, 0.247, 0.000)
		colorLowland   (0.315, 0.292, 0.260, 0.000)
		colorUpland    (0.330, 0.307, 0.273, 0.000)
		colorRock      (0.346, 0.321, 0.286, 0.000)
		colorSnow      (0.362, 0.336, 0.299, 1.000)
		BumpHeight      0.519572
		BumpOffset      0.103914
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.181978
		Period          0.951831
		Eccentricity    0.115309
		Inclination     -0.735489
		AscendingNode   0.952455
		ArgOfPericenter 68.0442
		MeanAnomaly     108.682
	}
}

Asteroid	"S124"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            9.15678e-010
	Radius          7.47196
	InertiaMoment   0.398288

	Obliquity       -5.34136
	EqAscendNode    163.857
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.560 0.557 0.552)

	Surface
	{
		SurfStyle       0.882495
		OceanStyle      0.622842
		Randomize      (-0.709, 0.807, 0.927)
		colorDistMagn   0.428478
		colorDistFreq   0.00172095
		detailScale     204.034
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0261379
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448803
		terraceProb     0.216832
		erosion         0
		montesMagn      0.509548
		montesFreq      3.09302
		montesSpiky     0.968558
		montesFraction  0.827419
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.125258
		hillsFraction   0.628033
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248982
		craterFreq      0.189263
		craterDensity   0.804531
		craterOctaves   10.8094
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.7141
		volcanoTemp     1412.65
		lavaCoverTidal  0
		lavaCoverSun    0.0091584
		lavaCoverYoung  0
		colorSea       (0.191, 0.195, 0.221, 0.050)
		colorShelf     (0.224, 0.228, 0.254, 0.040)
		colorBeach     (0.258, 0.262, 0.287, 0.030)
		colorDesert    (0.291, 0.295, 0.326, 0.020)
		colorLowland   (0.325, 0.329, 0.359, 0.030)
		colorUpland    (0.359, 0.362, 0.392, 0.050)
		colorRock      (0.392, 0.395, 0.436, 0.020)
		colorSnow      (0.392, 0.395, 0.436, 1.000)
		BumpHeight      6.72477
		BumpOffset      1.34495
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.185994
		Period          0.983514
		Eccentricity    0.0912264
		Inclination     -5.34136
		AscendingNode   163.857
		ArgOfPericenter 106.594
		MeanAnomaly     30.455
	}
}

Asteroid	"S125"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.36438e-018
	Radius          0.0105386
	InertiaMoment   0.399359

	RotationPeriod  16261.4
	Obliquity       -0.763737
	EqAscendNode    151.611

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.461 0.457 0.450)

	Surface
	{
		SurfStyle       0.749525
		OceanStyle      0.101242
		Randomize      (-0.643, -0.243, -0.810)
		colorDistMagn   0.55408
		colorDistFreq   2.68213e-008
		detailScale     0.287774
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00653272
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.344777
		terraceProb     0.428538
		erosion         0
		montesMagn      0.59107
		montesFreq      3.02137
		montesSpiky     0.900026
		montesFraction  0.689718
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.68381e-007
		hillsFraction   0.634966
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250932
		craterFreq      0.27028
		craterDensity   0
		craterOctaves   0.975158
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   713.394
		volcanoTemp     1287.61
		lavaCoverTidal  0
		lavaCoverSun    0.013157
		lavaCoverYoung  0
		colorSea       (0.180, 0.156, 0.126, 0.000)
		colorShelf     (0.184, 0.160, 0.144, 0.000)
		colorBeach     (0.217, 0.188, 0.171, 0.000)
		colorDesert    (0.235, 0.201, 0.167, 0.000)
		colorLowland   (0.258, 0.215, 0.189, 0.000)
		colorUpland    (0.286, 0.261, 0.230, 0.000)
		colorRock      (0.309, 0.284, 0.248, 0.000)
		colorSnow      (0.337, 0.302, 0.261, 1.000)
		BumpHeight      0.00948474
		BumpOffset      0.00189695
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.178869
		Period          0.927548
		Eccentricity    0.102365
		Inclination     -0.763737
		AscendingNode   151.611
		ArgOfPericenter -87.2171
		MeanAnomaly     93.0654
	}
}

Asteroid	"S126"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            7.89397e-015
	Radius          0.134642
	InertiaMoment   0.396761

	Obliquity       -0.50779
	EqAscendNode    35.7858
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.698 0.572 0.495)

	Surface
	{
		SurfStyle       0.63686
		OceanStyle      0.214386
		Randomize      (-0.811, -0.011, -0.067)
		colorDistMagn   0.908568
		colorDistFreq   1.02243e-005
		detailScale     3.67662
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0168681
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.56997
		terraceProb     0.253724
		erosion         0
		montesMagn      0.658568
		montesFreq      2.76799
		montesSpiky     0.866401
		montesFraction  0.630489
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.85369e-005
		hillsFraction   0.619469
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2486
		craterFreq      0.190111
		craterDensity   1.03435
		craterOctaves   3.95174
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   237.596
		volcanoTemp     1629.62
		lavaCoverTidal  0
		lavaCoverSun    0.00636971
		lavaCoverYoung  0
		colorSea       (0.272, 0.194, 0.139, 0.000)
		colorShelf     (0.279, 0.200, 0.158, 0.000)
		colorBeach     (0.328, 0.235, 0.188, 0.000)
		colorDesert    (0.356, 0.252, 0.183, 0.000)
		colorLowland   (0.391, 0.269, 0.208, 0.000)
		colorUpland    (0.433, 0.326, 0.252, 0.000)
		colorRock      (0.468, 0.355, 0.272, 0.000)
		colorSnow      (0.509, 0.378, 0.287, 1.000)
		BumpHeight      0.121178
		BumpOffset      0.0242356
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.184848
		Period          0.974438
		Eccentricity    0.0398202
		Inclination     -0.50779
		AscendingNode   35.7858
		ArgOfPericenter 75.0378
		MeanAnomaly     -153.672
	}
}

Asteroid	"S127"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.16164e-011
	Radius          1.74269
	InertiaMoment   0.398529

	RotationPeriod  5014.45
	Obliquity       4.91216
	EqAscendNode    -5.8587

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.506 0.436 0.317)

	Surface
	{
		SurfStyle       0.527488
		OceanStyle      0.255063
		Randomize      (0.241, 0.634, -0.894)
		colorDistMagn   0.673058
		colorDistFreq   0.0012151
		detailScale     47.587
		colorConversion true
		snowLevel       2
		tropicLatitude  0.170406
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.525868
		terraceProb     0.417195
		erosion         0
		montesMagn      0.628418
		montesFreq      3.44038
		montesSpiky     0.904474
		montesFraction  0.556449
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00914694
		hillsFraction   0.676666
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258802
		craterFreq      0.217988
		craterDensity   1.01032
		craterOctaves   7.57306
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   80.166
		volcanoTemp     1302.61
		lavaCoverTidal  0
		lavaCoverSun    0.0284724
		lavaCoverYoung  0
		colorSea       (0.198, 0.148, 0.089, 0.000)
		colorShelf     (0.203, 0.152, 0.101, 0.000)
		colorBeach     (0.238, 0.179, 0.120, 0.000)
		colorDesert    (0.258, 0.192, 0.117, 0.000)
		colorLowland   (0.284, 0.205, 0.133, 0.000)
		colorUpland    (0.314, 0.248, 0.162, 0.000)
		colorRock      (0.339, 0.270, 0.174, 0.000)
		colorSnow      (0.370, 0.288, 0.184, 1.000)
		BumpHeight      1.56842
		BumpOffset      0.313684
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.169822
		Period          0.85807
		Eccentricity    0.195143
		Inclination     4.91216
		AscendingNode   -5.8587
		ArgOfPericenter 20.5022
		MeanAnomaly     71.8202
	}
}

Asteroid	"S128"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.70941e-008
	Radius          15.5069
	InertiaMoment   0.399542

	RotationPeriod  7183.18
	Obliquity       0.37662
	EqAscendNode    95.5241

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.768 0.767 0.764)

	Surface
	{
		SurfStyle       0.945419
		OceanStyle      0.00720453
		Randomize      (-0.258, -0.526, 0.239)
		colorDistMagn   0.463102
		colorDistFreq   0.12419
		detailScale     423.442
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00883632
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35188
		terraceProb     0.152532
		erosion         0
		montesMagn      0.462492
		montesFreq      2.61379
		montesSpiky     0.993463
		montesFraction  0.904314
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.408069
		hillsFraction   0.519977
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22735
		craterFreq      0.244126
		craterDensity   0.801101
		craterOctaves   11.7775
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   18.5955
		volcanoTemp     1615.3
		lavaCoverTidal  0
		lavaCoverSun    0.00980274
		lavaCoverYoung  0
		colorSea       (0.261, 0.268, 0.306, 0.050)
		colorShelf     (0.307, 0.314, 0.352, 0.040)
		colorBeach     (0.353, 0.360, 0.397, 0.030)
		colorDesert    (0.399, 0.406, 0.451, 0.020)
		colorLowland   (0.446, 0.452, 0.497, 0.030)
		colorUpland    (0.492, 0.498, 0.543, 0.050)
		colorRock      (0.538, 0.544, 0.604, 0.020)
		colorSnow      (0.538, 0.544, 0.604, 1.000)
		BumpHeight      13.9562
		BumpOffset      2.79124
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.172657
		Period          0.879646
		Eccentricity    0.0218437
		Inclination     0.376621
		AscendingNode   95.5241
		ArgOfPericenter 109.689
		MeanAnomaly     168.266
	}
}

Asteroid	"S129"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.00143e-016
	Radius          0.0314019
	InertiaMoment   0.397291

	RotationPeriod  10993.1
	Obliquity       -6.65187
	EqAscendNode    -2.33988

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.519 0.425 0.363)

	Surface
	{
		SurfStyle       0.709435
		OceanStyle      0.254809
		Randomize      (-0.823, 0.480, 0.813)
		colorDistMagn   0.274161
		colorDistFreq   2.49315e-007
		detailScale     0.857481
		colorConversion true
		snowLevel       2
		tropicLatitude  0.230066
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436335
		terraceProb     0.302707
		erosion         0
		montesMagn      0.42132
		montesFreq      3.17151
		montesSpiky     0.993516
		montesFraction  0.463745
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.08236e-006
		hillsFraction   0.57682
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.282613
		craterFreq      0.202322
		craterDensity   0.785891
		craterOctaves   1.94674
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   491.983
		volcanoTemp     845.302
		lavaCoverTidal  0
		lavaCoverSun    0.0141092
		lavaCoverYoung  0
		colorSea       (0.203, 0.145, 0.102, 0.000)
		colorShelf     (0.208, 0.149, 0.116, 0.000)
		colorBeach     (0.244, 0.174, 0.138, 0.000)
		colorDesert    (0.265, 0.187, 0.134, 0.000)
		colorLowland   (0.291, 0.200, 0.152, 0.000)
		colorUpland    (0.322, 0.242, 0.185, 0.000)
		colorRock      (0.348, 0.264, 0.200, 0.000)
		colorSnow      (0.379, 0.281, 0.211, 1.000)
		BumpHeight      0.0282617
		BumpOffset      0.00565234
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.180539
		Period          0.940569
		Eccentricity    0.124194
		Inclination     -6.65187
		AscendingNode   -2.33988
		ArgOfPericenter -105.539
		MeanAnomaly     53.336
	}
}

Asteroid	"S130"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.47366e-013
	Radius          0.40644
	InertiaMoment   0.398751

	Obliquity       2.37068
	EqAscendNode    -17.0346
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.778 0.776 0.775)

	Surface
	{
		SurfStyle       0.42656
		OceanStyle      0.820061
		Randomize      (-0.553, 0.078, -0.501)
		colorDistMagn   0.670444
		colorDistFreq   0.000137769
		detailScale     11.0985
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0817474
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505287
		terraceProb     0.120981
		erosion         0
		montesMagn      0.445169
		montesFreq      2.62511
		montesSpiky     0.875748
		montesFraction  0.718788
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000456896
		hillsFraction   0.532752
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225092
		craterFreq      0.219092
		craterDensity   0.807803
		craterOctaves   5.83525
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   165.998
		volcanoTemp     1484.75
		lavaCoverTidal  0
		lavaCoverSun    0.0145519
		lavaCoverYoung  0
		colorSea       (0.311, 0.311, 0.310, 0.000)
		colorShelf     (0.331, 0.330, 0.329, 0.000)
		colorBeach     (0.350, 0.349, 0.349, 0.000)
		colorDesert    (0.369, 0.369, 0.368, 0.000)
		colorLowland   (0.389, 0.388, 0.388, 0.000)
		colorUpland    (0.408, 0.408, 0.407, 0.000)
		colorRock      (0.428, 0.427, 0.426, 0.000)
		colorSnow      (0.447, 0.446, 0.446, 1.000)
		BumpHeight      0.365796
		BumpOffset      0.0731592
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.180117
		Period          0.937268
		Eccentricity    0.126832
		Inclination     2.37068
		AscendingNode   -17.0346
		ArgOfPericenter -116.793
		MeanAnomaly     131.033
	}
}

Asteroid	"S131"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.16857e-010
	Radius          3.61683
	InertiaMoment   0.399721

	Obliquity       6.89667
	EqAscendNode    22.0628
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.725 0.681 0.610)

	Surface
	{
		SurfStyle       0.714995
		OceanStyle      0.0585858
		Randomize      (0.380, -0.688, 0.877)
		colorDistMagn   0.20832
		colorDistFreq   0.00579737
		detailScale     98.7637
		colorConversion true
		snowLevel       2
		tropicLatitude  0.234078
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.73954
		terraceProb     0.356322
		erosion         0
		montesMagn      0.480026
		montesFreq      3.44308
		montesSpiky     0.978758
		montesFraction  0.338426
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0232106
		hillsFraction   0.786662
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251726
		craterFreq      0.265624
		craterDensity   1.05293
		craterOctaves   9.91347
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.5077
		volcanoTemp     1403.4
		lavaCoverTidal  0
		lavaCoverSun    0.00456404
		lavaCoverYoung  0
		colorSea       (0.283, 0.231, 0.171, 0.000)
		colorShelf     (0.290, 0.238, 0.195, 0.000)
		colorBeach     (0.341, 0.279, 0.232, 0.000)
		colorDesert    (0.370, 0.300, 0.226, 0.000)
		colorLowland   (0.406, 0.320, 0.256, 0.000)
		colorUpland    (0.450, 0.388, 0.311, 0.000)
		colorRock      (0.486, 0.422, 0.336, 0.000)
		colorSnow      (0.529, 0.449, 0.354, 1.000)
		BumpHeight      3.25515
		BumpOffset      0.65103
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.193118
		Period          1.04056
		Eccentricity    0.0509697
		Inclination     6.89667
		AscendingNode   22.0628
		ArgOfPericenter -128.116
		MeanAnomaly     -87.1647
	}
}

Asteroid	"S132"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.19117e-007
	Radius          46.1983
	InertiaMoment   0.397679

	RotationPeriod  290.581
	Obliquity       31.6722
	EqAscendNode    62.5441

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.495 0.489 0.482)

	Surface
	{
		SurfStyle       0.465396
		OceanStyle      0.761237
		Randomize      (-0.967, 0.408, -0.168)
		colorDistMagn   0.539801
		colorDistFreq   1.31683
		detailScale     1261.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.527231
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366595
		terraceProb     0.258721
		erosion         0
		montesMagn      0.621282
		montesFreq      3.21811
		montesSpiky     0.884609
		montesFraction  0.892379
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.05532
		hillsFraction   0.485854
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234925
		craterFreq      0.241097
		craterDensity   0.805424
		craterOctaves   13.9558
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   12.822
		volcanoTemp     1295.1
		lavaCoverTidal  0
		lavaCoverSun    0.00166151
		lavaCoverYoung  0
		colorSea       (0.198, 0.196, 0.193, 0.000)
		colorShelf     (0.211, 0.208, 0.205, 0.000)
		colorBeach     (0.223, 0.220, 0.217, 0.000)
		colorDesert    (0.235, 0.232, 0.229, 0.000)
		colorLowland   (0.248, 0.245, 0.241, 0.000)
		colorUpland    (0.260, 0.257, 0.253, 0.000)
		colorRock      (0.273, 0.269, 0.265, 0.000)
		colorSnow      (0.285, 0.281, 0.277, 1.000)
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
		SemiMajorAxis   0.200433
		Period          1.10023
		Eccentricity    0.0126163
		Inclination     -0.844005
		AscendingNode   99.313
		ArgOfPericenter -148.603
		MeanAnomaly     -118.221
	}
}

Asteroid	"S133"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.86951e-015
	Radius          0.0947925
	InertiaMoment   0.398959

	Obliquity       -0.388728
	EqAscendNode    173.373
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.596 0.506 0.387)

	Surface
	{
		SurfStyle       0.408476
		OceanStyle      0.41737
		Randomize      (-0.053, -0.812, -0.623)
		colorDistMagn   0.188105
		colorDistFreq   6.86839e-006
		detailScale     2.58847
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00077204
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.573523
		terraceProb     0.367913
		erosion         0
		montesMagn      0.490416
		montesFreq      2.89134
		montesSpiky     0.841845
		montesFraction  0.587232
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.23308e-005
		hillsFraction   0.716296
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227584
		craterFreq      0.204315
		craterDensity   1.03205
		craterOctaves   3.96554
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   343.729
		volcanoTemp     1499.07
		lavaCoverTidal  0
		lavaCoverSun    0.00454441
		lavaCoverYoung  0
		colorSea       (0.238, 0.202, 0.155, 0.000)
		colorShelf     (0.253, 0.215, 0.165, 0.000)
		colorBeach     (0.268, 0.228, 0.174, 0.000)
		colorDesert    (0.283, 0.240, 0.184, 0.000)
		colorLowland   (0.298, 0.253, 0.194, 0.000)
		colorUpland    (0.313, 0.266, 0.203, 0.000)
		colorRock      (0.328, 0.278, 0.213, 0.000)
		colorSnow      (0.342, 0.291, 0.223, 1.000)
		BumpHeight      0.0853132
		BumpOffset      0.0170626
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.189094
		Period          1.0082
		Eccentricity    0.0286653
		Inclination     -0.388728
		AscendingNode   173.373
		ArgOfPericenter 52.6172
		MeanAnomaly     -150.172
	}
}

Asteroid	"S134"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.75108e-012
	Radius          0.843548
	InertiaMoment   0.399898

	RotationPeriod  15737.5
	Obliquity       2.62916
	EqAscendNode    -52.3977

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.554 0.547 0.543)

	Surface
	{
		SurfStyle       0.689831
		OceanStyle      0.842325
		Randomize      (0.030, 0.806, -0.510)
		colorDistMagn   0.610683
		colorDistFreq   0.000487168
		detailScale     23.0345
		colorConversion true
		snowLevel       2
		tropicLatitude  0.082248
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.483168
		terraceProb     0.415036
		erosion         0
		montesMagn      0.655786
		montesFreq      2.73378
		montesSpiky     0.9378
		montesFraction  0.642785
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00181776
		hillsFraction   0.515992
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26208
		craterFreq      0.154926
		craterDensity   1.0454
		craterOctaves   6.7279
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   79.7378
		volcanoTemp     1219.54
		lavaCoverTidal  0
		lavaCoverSun    0.020661
		lavaCoverYoung  0
		colorSea       (0.216, 0.186, 0.152, 0.000)
		colorShelf     (0.222, 0.191, 0.174, 0.000)
		colorBeach     (0.260, 0.224, 0.206, 0.000)
		colorDesert    (0.282, 0.241, 0.201, 0.000)
		colorLowland   (0.310, 0.257, 0.228, 0.000)
		colorUpland    (0.343, 0.312, 0.277, 0.000)
		colorRock      (0.371, 0.339, 0.299, 0.000)
		colorSnow      (0.404, 0.361, 0.315, 1.000)
		BumpHeight      0.759193
		BumpOffset      0.151839
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.175007
		Period          0.897667
		Eccentricity    0.159734
		Inclination     2.62916
		AscendingNode   -52.3977
		ArgOfPericenter -8.65704
		MeanAnomaly     -63.3299
	}
}

Asteroid	"S135"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.04835e-009
	Radius          10.7768
	InertiaMoment   0.397995

	RotationPeriod  1302.52
	Obliquity       2.32724
	EqAscendNode    21.7668

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.785 0.731 0.709)

	Surface
	{
		SurfStyle       0.97907
		OceanStyle      0.0589836
		Randomize      (0.000, 0.228, -0.430)
		colorDistMagn   0.725289
		colorDistFreq   0.0455561
		detailScale     294.278
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0616682
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.526556
		terraceProb     0.126149
		erosion         0
		montesMagn      0.545743
		montesFreq      2.82885
		montesSpiky     0.923883
		montesFraction  0.590842
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.134659
		hillsFraction   0.793845
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25053
		craterFreq      0.227449
		craterDensity   0.847664
		craterOctaves   10.9142
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.5556
		volcanoTemp     1355.53
		lavaCoverTidal  0
		lavaCoverSun    0.00411227
		lavaCoverYoung  0
		colorSea       (0.267, 0.256, 0.284, 0.050)
		colorShelf     (0.314, 0.300, 0.326, 0.040)
		colorBeach     (0.361, 0.344, 0.369, 0.030)
		colorDesert    (0.408, 0.388, 0.418, 0.020)
		colorLowland   (0.455, 0.431, 0.461, 0.030)
		colorUpland    (0.502, 0.475, 0.503, 0.050)
		colorRock      (0.549, 0.519, 0.560, 0.020)
		colorSnow      (0.549, 0.519, 0.560, 1.000)
		BumpHeight      9.6991
		BumpOffset      1.93982
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.194025
		Period          1.0479
		Eccentricity    0.0460599
		Inclination     -5.73699
		AscendingNode   14.7076
		ArgOfPericenter 37.8512
		MeanAnomaly     38.3824
	}
}

Asteroid	"S136"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.37168e-017
	Radius          0.022108
	InertiaMoment   0.399156

	Obliquity       3.00187
	EqAscendNode    76.5476
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.675 0.611 0.512)

	Surface
	{
		SurfStyle       0.166816
		OceanStyle      0.00890861
		Randomize      (0.928, 0.734, 0.198)
		colorDistMagn   0.356348
		colorDistFreq   2.85938e-007
		detailScale     0.603696
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0821555
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.752195
		terraceProb     0.276894
		erosion         0
		montesMagn      0.452255
		montesFreq      3.74923
		montesSpiky     0.964562
		montesFraction  0.463418
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.64919e-006
		hillsFraction   0.572191
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211433
		craterFreq      0.252325
		craterDensity   0
		craterOctaves   0.982285
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   711.75
		volcanoTemp     1447.2
		lavaCoverTidal  0
		lavaCoverSun    0.00936545
		lavaCoverYoung  0
		colorSea       (0.270, 0.244, 0.205, 0.000)
		colorShelf     (0.287, 0.260, 0.217, 0.000)
		colorBeach     (0.304, 0.275, 0.230, 0.000)
		colorDesert    (0.321, 0.290, 0.243, 0.000)
		colorLowland   (0.337, 0.305, 0.256, 0.000)
		colorUpland    (0.354, 0.321, 0.269, 0.000)
		colorRock      (0.371, 0.336, 0.281, 0.000)
		colorSnow      (0.388, 0.351, 0.294, 1.000)
		BumpHeight      0.0198972
		BumpOffset      0.00397944
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.185732
		Period          0.981438
		Eccentricity    0.0927641
		Inclination     3.00187
		AscendingNode   76.5476
		ArgOfPericenter -97.0171
		MeanAnomaly     161.464
	}
}

Asteroid	"S137"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.49004e-014
	Radius          0.251464
	InertiaMoment   0.395651

	Obliquity       0.0333971
	EqAscendNode    -59.7588
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.849 0.808 0.745)

	Surface
	{
		SurfStyle       0.578292
		OceanStyle      0.176835
		Randomize      (0.931, 0.225, -0.902)
		colorDistMagn   0.646612
		colorDistFreq   3.55401e-005
		detailScale     6.86663
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0010358
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.614458
		terraceProb     0.228387
		erosion         0
		montesMagn      0.519246
		montesFreq      2.85169
		montesSpiky     0.966953
		montesFraction  0.582524
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000143388
		hillsFraction   0.592146
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247052
		craterFreq      0.191911
		craterDensity   0.7199
		craterOctaves   4.95103
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   211.04
		volcanoTemp     1295.78
		lavaCoverTidal  0
		lavaCoverSun    0.00516778
		lavaCoverYoung  0
		colorSea       (0.331, 0.275, 0.209, 0.000)
		colorShelf     (0.340, 0.283, 0.238, 0.000)
		colorBeach     (0.399, 0.331, 0.283, 0.000)
		colorDesert    (0.433, 0.355, 0.276, 0.000)
		colorLowland   (0.476, 0.380, 0.313, 0.000)
		colorUpland    (0.527, 0.460, 0.380, 0.000)
		colorRock      (0.569, 0.501, 0.410, 0.000)
		colorSnow      (0.620, 0.533, 0.432, 1.000)
		BumpHeight      0.226317
		BumpOffset      0.0452634
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.191719
		Period          1.02928
		Eccentricity    0.0556967
		Inclination     0.0333971
		AscendingNode   -59.7588
		ArgOfPericenter 102.371
		MeanAnomaly     -19.7122
	}
}

Asteroid	"S138"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.13577e-011
	Radius          2.23773
	InertiaMoment   0.398268

	Obliquity       2.81878
	EqAscendNode    -105.478
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.508 0.500 0.495)

	Surface
	{
		SurfStyle       0.655792
		OceanStyle      0.657097
		Randomize      (-0.651, 0.705, 0.476)
		colorDistMagn   0.715817
		colorDistFreq   0.00158533
		detailScale     61.105
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0595219
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.347634
		terraceProb     0.201885
		erosion         0
		montesMagn      0.382203
		montesFreq      3.92352
		montesSpiky     0.903446
		montesFraction  0.705908
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0119651
		hillsFraction   0.472298
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245687
		craterFreq      0.241409
		craterDensity   0.833143
		craterOctaves   8.93459
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   48.9566
		volcanoTemp     1271.32
		lavaCoverTidal  0
		lavaCoverSun    0.00383198
		lavaCoverYoung  0
		colorSea       (0.198, 0.170, 0.139, 0.000)
		colorShelf     (0.203, 0.175, 0.158, 0.000)
		colorBeach     (0.239, 0.205, 0.188, 0.000)
		colorDesert    (0.259, 0.220, 0.183, 0.000)
		colorLowland   (0.285, 0.235, 0.208, 0.000)
		colorUpland    (0.315, 0.285, 0.252, 0.000)
		colorRock      (0.341, 0.310, 0.272, 0.000)
		colorSnow      (0.371, 0.330, 0.287, 1.000)
		BumpHeight      2.01396
		BumpOffset      0.402792
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.193515
		Period          1.04377
		Eccentricity    0.0369748
		Inclination     2.81878
		AscendingNode   -105.478
		ArgOfPericenter 86.0106
		MeanAnomaly     -75.5578
	}
}

Asteroid	"S139"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            7.55758e-008
	Radius          28.5857
	InertiaMoment   0.399345

	RotationPeriod  630.855
	Obliquity       0.800315
	EqAscendNode    -38.7557

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.505 0.502 0.496)

	Surface
	{
		SurfStyle       0.99062
		OceanStyle      0.748937
		Randomize      (-0.921, -0.536, 0.963)
		colorDistMagn   0.437781
		colorDistFreq   0.480991
		detailScale     780.581
		colorConversion true
		snowLevel       2
		tropicLatitude  0.016511
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.550177
		terraceProb     0.350335
		erosion         0
		montesMagn      0.303051
		montesFreq      3.13682
		montesSpiky     0.940211
		montesFraction  0.455521
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.27561
		hillsFraction   0.734583
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253744
		craterFreq      0.220645
		craterDensity   1.01547
		craterOctaves   12.7667
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   16.3029
		volcanoTemp     1435.76
		lavaCoverTidal  0
		lavaCoverSun    0.0094863
		lavaCoverYoung  0
		colorSea       (0.172, 0.176, 0.199, 0.050)
		colorShelf     (0.202, 0.206, 0.228, 0.040)
		colorBeach     (0.232, 0.236, 0.258, 0.030)
		colorDesert    (0.262, 0.266, 0.293, 0.020)
		colorLowland   (0.293, 0.296, 0.323, 0.030)
		colorUpland    (0.323, 0.326, 0.352, 0.050)
		colorRock      (0.353, 0.356, 0.392, 0.020)
		colorSnow      (0.353, 0.356, 0.392, 1.000)
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
		SemiMajorAxis   0.183984
		Period          0.967617
		Eccentricity    0.0842654
		Inclination     0.22472
		AscendingNode   -55.4263
		ArgOfPericenter -43.5245
		MeanAnomaly     12.1589
	}
}

Asteroid	"S140"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.4275e-016
	Radius          0.0586477
	InertiaMoment   0.39671

	Obliquity       -1.96694
	EqAscendNode    -28.6931
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.535 0.531 0.527)

	Surface
	{
		SurfStyle       0.26127
		OceanStyle      0.268359
		Randomize      (0.445, 0.791, -0.850)
		colorDistMagn   0.787163
		colorDistFreq   6.38087e-007
		detailScale     1.60147
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0664681
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.632059
		terraceProb     0.248933
		erosion         0
		montesMagn      0.42431
		montesFreq      2.64231
		montesSpiky     0.901947
		montesFraction  0.371398
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.9601e-006
		hillsFraction   0.614889
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242797
		craterFreq      0.208211
		craterDensity   0.629861
		craterOctaves   2.93322
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   436.996
		volcanoTemp     1428.11
		lavaCoverTidal  0
		lavaCoverSun    0.0117812
		lavaCoverYoung  0
		colorSea       (0.214, 0.212, 0.211, 0.000)
		colorShelf     (0.227, 0.226, 0.224, 0.000)
		colorBeach     (0.241, 0.239, 0.237, 0.000)
		colorDesert    (0.254, 0.252, 0.250, 0.000)
		colorLowland   (0.267, 0.266, 0.263, 0.000)
		colorUpland    (0.281, 0.279, 0.277, 0.000)
		colorRock      (0.294, 0.292, 0.290, 0.000)
		colorSnow      (0.307, 0.305, 0.303, 1.000)
		BumpHeight      0.0527829
		BumpOffset      0.0105566
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.168701
		Period          0.849593
		Eccentricity    0.0234501
		Inclination     -1.96694
		AscendingNode   -28.6931
		ArgOfPericenter 75.5726
		MeanAnomaly     -164.38
	}
}

Asteroid	"S141"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            6.5153e-013
	Radius          0.5219
	InertiaMoment   0.398511

	RotationPeriod  20660.8
	Obliquity       -2.54968
	EqAscendNode    -7.84278

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.827 0.746 0.713)

	Surface
	{
		SurfStyle       0.208099
		OceanStyle      0.444159
		Randomize      (-0.028, -0.106, 0.847)
		colorDistMagn   0.536775
		colorDistFreq   0.000148336
		detailScale     14.2514
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0886757
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.650049
		terraceProb     0.110921
		erosion         0
		montesMagn      0.37112
		montesFreq      3.12103
		montesSpiky     0.910361
		montesFraction  0.811227
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000710014
		hillsFraction   0.644522
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252736
		craterFreq      0.203849
		craterDensity   0.864143
		craterOctaves   5.84352
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   101.374
		volcanoTemp     1234.67
		lavaCoverTidal  0
		lavaCoverSun    0.0138165
		lavaCoverYoung  0
		colorSea       (0.331, 0.299, 0.285, 0.000)
		colorShelf     (0.351, 0.317, 0.303, 0.000)
		colorBeach     (0.372, 0.336, 0.321, 0.000)
		colorDesert    (0.393, 0.354, 0.339, 0.000)
		colorLowland   (0.413, 0.373, 0.356, 0.000)
		colorUpland    (0.434, 0.392, 0.374, 0.000)
		colorRock      (0.455, 0.410, 0.392, 0.000)
		colorSnow      (0.475, 0.429, 0.410, 1.000)
		BumpHeight      0.46971
		BumpOffset      0.0939421
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.180824
		Period          0.942791
		Eccentricity    0.122427
		Inclination     -2.54968
		AscendingNode   -7.84278
		ArgOfPericenter -177.651
		MeanAnomaly     -161.806
	}
}

Asteroid	"S142"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            9.58762e-010
	Radius          6.66768
	InertiaMoment   0.399528

	RotationPeriod  22733.7
	Obliquity       -0.0207796
	EqAscendNode    166.993

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.674 0.595 0.486)

	Surface
	{
		SurfStyle       0.464138
		OceanStyle      0.585152
		Randomize      (0.854, 0.433, 0.527)
		colorDistMagn   0.533812
		colorDistFreq   0.0169052
		detailScale     182.072
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.383468
		terraceProb     0.327045
		erosion         0
		montesMagn      0.599604
		montesFreq      2.08377
		montesSpiky     0.993296
		montesFraction  0.70766
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0961528
		hillsFraction   0.761534
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248468
		craterFreq      0.186143
		craterDensity   0.908202
		craterOctaves   10.4414
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   33.7618
		volcanoTemp     1748.99
		lavaCoverTidal  0
		lavaCoverSun    0.0270755
		lavaCoverYoung  0
		colorSea       (0.270, 0.238, 0.194, 0.000)
		colorShelf     (0.287, 0.253, 0.207, 0.000)
		colorBeach     (0.303, 0.268, 0.219, 0.000)
		colorDesert    (0.320, 0.283, 0.231, 0.000)
		colorLowland   (0.337, 0.298, 0.243, 0.000)
		colorUpland    (0.354, 0.313, 0.255, 0.000)
		colorRock      (0.371, 0.327, 0.267, 0.000)
		colorSnow      (0.388, 0.342, 0.280, 1.000)
		BumpHeight      6.00091
		BumpOffset      1.20018
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.170667
		Period          0.864485
		Eccentricity    0.189223
		Inclination     -0.0207796
		AscendingNode   166.993
		ArgOfPericenter -93.48
		MeanAnomaly     -94.9033
	}
}

Asteroid	"S143"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.61678e-018
	Radius          0.0136781
	InertiaMoment   0.397257

	Obliquity       -0.517983
	EqAscendNode    153.334
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.532 0.527 0.522)

	Surface
	{
		SurfStyle       0.850887
		OceanStyle      0.29943
		Randomize      (0.225, -0.904, -0.568)
		colorDistMagn   0.911988
		colorDistFreq   7.09934e-008
		detailScale     0.373504
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00417187
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.461742
		terraceProb     0.154156
		erosion         0
		montesMagn      0.410043
		montesFreq      3.05531
		montesSpiky     0.912095
		montesFraction  0.457711
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.09973e-007
		hillsFraction   0.484696
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239508
		craterFreq      0.184252
		craterDensity   0
		craterOctaves   0.967731
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   904.876
		volcanoTemp     1264.66
		lavaCoverTidal  0
		lavaCoverSun    0.0171224
		lavaCoverYoung  0
		colorSea       (0.181, 0.184, 0.209, 0.050)
		colorShelf     (0.213, 0.216, 0.240, 0.040)
		colorBeach     (0.245, 0.248, 0.271, 0.030)
		colorDesert    (0.277, 0.279, 0.308, 0.020)
		colorLowland   (0.309, 0.311, 0.339, 0.030)
		colorUpland    (0.341, 0.342, 0.371, 0.050)
		colorRock      (0.373, 0.374, 0.412, 0.020)
		colorSnow      (0.373, 0.374, 0.412, 1.000)
		BumpHeight      0.0123103
		BumpOffset      0.00246206
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.173446
		Period          0.885684
		Eccentricity    0.113535
		Inclination     -0.517983
		AscendingNode   153.334
		ArgOfPericenter -153.267
		MeanAnomaly     -36.8459
	}
}

Asteroid	"S144"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            8.26539e-015
	Radius          0.121721
	InertiaMoment   0.398735

	Obliquity       -1.49965
	EqAscendNode    -167.371
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.562 0.466 0.358)

	Surface
	{
		SurfStyle       0.59434
		OceanStyle      0.328911
		Randomize      (0.845, -0.857, -0.599)
		colorDistMagn   0.339474
		colorDistFreq   3.07835e-006
		detailScale     3.32378
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00575673
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552867
		terraceProb     0.192953
		erosion         0
		montesMagn      0.465396
		montesFreq      2.69149
		montesSpiky     0.929821
		montesFraction  0.617643
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.20565e-005
		hillsFraction   0.793194
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257123
		craterFreq      0.264286
		craterDensity   0.85961
		craterOctaves   3.90653
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   209.912
		volcanoTemp     1388.53
		lavaCoverTidal  0
		lavaCoverSun    0.0123716
		lavaCoverYoung  0
		colorSea       (0.219, 0.159, 0.100, 0.000)
		colorShelf     (0.225, 0.163, 0.115, 0.000)
		colorBeach     (0.264, 0.191, 0.136, 0.000)
		colorDesert    (0.287, 0.205, 0.132, 0.000)
		colorLowland   (0.315, 0.219, 0.150, 0.000)
		colorUpland    (0.348, 0.266, 0.182, 0.000)
		colorRock      (0.376, 0.289, 0.197, 0.000)
		colorSnow      (0.410, 0.308, 0.208, 1.000)
		BumpHeight      0.109549
		BumpOffset      0.0219097
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.182288
		Period          0.954264
		Eccentricity    0.113412
		Inclination     -1.49965
		AscendingNode   -167.371
		ArgOfPericenter 19.4521
		MeanAnomaly     -81.6949
	}
}

Asteroid	"S145"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.2163e-011
	Radius          1.55511
	InertiaMoment   0.399707

	Obliquity       -3.00944
	EqAscendNode    -32.3554
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.581 0.577 0.570)

	Surface
	{
		SurfStyle       0.486152
		OceanStyle      0.286173
		Randomize      (0.870, 0.757, -0.160)
		colorDistMagn   0.858223
		colorDistFreq   0.00193892
		detailScale     42.4647
		colorConversion true
		snowLevel       2
		tropicLatitude  0.100715
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.645747
		terraceProb     0.140647
		erosion         0
		montesMagn      0.570854
		montesFreq      3.63438
		montesSpiky     0.911091
		montesFraction  0.437073
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0039593
		hillsFraction   0.659257
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247903
		craterFreq      0.231795
		craterDensity   0.999083
		craterOctaves   7.92463
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   69.9111
		volcanoTemp     1762.71
		lavaCoverTidal  0
		lavaCoverSun    0.00497053
		lavaCoverYoung  0
		colorSea       (0.232, 0.231, 0.228, 0.000)
		colorShelf     (0.247, 0.245, 0.242, 0.000)
		colorBeach     (0.261, 0.260, 0.256, 0.000)
		colorDesert    (0.276, 0.274, 0.271, 0.000)
		colorLowland   (0.290, 0.288, 0.285, 0.000)
		colorUpland    (0.305, 0.303, 0.299, 0.000)
		colorRock      (0.319, 0.317, 0.313, 0.000)
		colorSnow      (0.334, 0.332, 0.328, 1.000)
		BumpHeight      1.39959
		BumpOffset      0.279919
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.192347
		Period          1.03433
		Eccentricity    0.0551832
		Inclination     -3.00944
		AscendingNode   -32.3554
		ArgOfPericenter 49.7612
		MeanAnomaly     -72.3327
	}
}

Asteroid	"S146"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.78985e-008
	Radius          20.1265
	InertiaMoment   0.397652

	RotationPeriod  787.033
	Obliquity       28.2817
	EqAscendNode    -96.9429

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.641 0.503 0.421)

	Surface
	{
		SurfStyle       0.648349
		OceanStyle      0.892675
		Randomize      (-0.808, 0.481, -0.652)
		colorDistMagn   0.497685
		colorDistFreq   0.120677
		detailScale     549.588
		colorConversion true
		snowLevel       2
		tropicLatitude  0.477441
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600001
		terraceProb     0.224715
		erosion         0
		montesMagn      0.523174
		montesFreq      2.21777
		montesSpiky     0.978159
		montesFraction  0.725864
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.17543
		hillsFraction   0.400369
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232221
		craterFreq      0.202046
		craterDensity   0.867011
		craterOctaves   11.9524
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.5867
		volcanoTemp     1490.76
		lavaCoverTidal  0
		lavaCoverSun    0.00209017
		lavaCoverYoung  0
		colorSea       (0.250, 0.171, 0.118, 0.000)
		colorShelf     (0.257, 0.176, 0.135, 0.000)
		colorBeach     (0.301, 0.206, 0.160, 0.000)
		colorDesert    (0.327, 0.222, 0.156, 0.000)
		colorLowland   (0.359, 0.237, 0.177, 0.000)
		colorUpland    (0.398, 0.287, 0.215, 0.000)
		colorRock      (0.430, 0.312, 0.231, 0.000)
		colorSnow      (0.468, 0.332, 0.244, 1.000)
		BumpHeight      18.1139
		BumpOffset      3.62277
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.199038
		Period          1.08877
		Eccentricity    0.0197114
		Inclination     -0.62614
		AscendingNode   -111.677
		ArgOfPericenter -55.0448
		MeanAnomaly     -10.7843
	}
}

Asteroid	"S147"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.04856e-016
	Radius          0.0283883
	InertiaMoment   0.398943

	RotationPeriod  18823
	Obliquity       5.56726
	EqAscendNode    -76.1443

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.772 0.771 0.770)

	Surface
	{
		SurfStyle       0.109569
		OceanStyle      0.139155
		Randomize      (-0.963, -0.294, -0.158)
		colorDistMagn   0.627472
		colorDistFreq   5.93889e-007
		detailScale     0.775191
		colorConversion true
		snowLevel       2
		tropicLatitude  0.1523
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.51548
		terraceProb     0.340205
		erosion         0
		montesMagn      0.387708
		montesFreq      3.30031
		montesSpiky     0.990063
		montesFraction  0.78321
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.61103e-006
		hillsFraction   0.499045
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257
		craterFreq      0.17204
		craterDensity   0.898265
		craterOctaves   1.89397
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   434.66
		volcanoTemp     1326.9
		lavaCoverTidal  0
		lavaCoverSun    0.0282827
		lavaCoverYoung  0
		colorSea       (0.309, 0.308, 0.308, 0.000)
		colorShelf     (0.328, 0.328, 0.327, 0.000)
		colorBeach     (0.348, 0.347, 0.346, 0.000)
		colorDesert    (0.367, 0.366, 0.366, 0.000)
		colorLowland   (0.386, 0.386, 0.385, 0.000)
		colorUpland    (0.405, 0.405, 0.404, 0.000)
		colorRock      (0.425, 0.424, 0.423, 0.000)
		colorSnow      (0.444, 0.443, 0.442, 1.000)
		BumpHeight      0.0255495
		BumpOffset      0.0051099
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.169935
		Period          0.858927
		Eccentricity    0.194348
		Inclination     5.56726
		AscendingNode   -76.1443
		ArgOfPericenter -118.745
		MeanAnomaly     -157.312
	}
}

Asteroid	"S148"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.543e-013
	Radius          0.362691
	InertiaMoment   0.399885

	RotationPeriod  25167
	Obliquity       5.28533
	EqAscendNode    -25.9016

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.774 0.660 0.613)

	Surface
	{
		SurfStyle       0.766023
		OceanStyle      0.28531
		Randomize      (0.651, -0.976, -0.239)
		colorDistMagn   0.114896
		colorDistFreq   3.9942e-005
		detailScale     9.90389
		colorConversion true
		snowLevel       2
		tropicLatitude  0.17882
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.542088
		terraceProb     0.219504
		erosion         0
		montesMagn      0.452143
		montesFreq      2.65064
		montesSpiky     0.996762
		montesFraction  0.626945
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000193538
		hillsFraction   0.691424
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239218
		craterFreq      0.176994
		craterDensity   1.02111
		craterOctaves   5.86351
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   144.764
		volcanoTemp     1356.17
		lavaCoverTidal  0
		lavaCoverSun    0.0120412
		lavaCoverYoung  0
		colorSea       (0.302, 0.224, 0.172, 0.000)
		colorShelf     (0.310, 0.231, 0.196, 0.000)
		colorBeach     (0.364, 0.270, 0.233, 0.000)
		colorDesert    (0.395, 0.290, 0.227, 0.000)
		colorLowland   (0.434, 0.310, 0.258, 0.000)
		colorUpland    (0.480, 0.376, 0.313, 0.000)
		colorRock      (0.519, 0.409, 0.337, 0.000)
		colorSnow      (0.565, 0.435, 0.356, 1.000)
		BumpHeight      0.326422
		BumpOffset      0.0652844
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.182638
		Period          0.957016
		Eccentricity    0.111277
		Inclination     5.28533
		AscendingNode   -25.9016
		ArgOfPericenter -72.2127
		MeanAnomaly     86.8351
	}
}

Asteroid	"S149"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.27061e-010
	Radius          4.69432
	InertiaMoment   0.397973

	Obliquity       2.41105
	EqAscendNode    -147.867
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.691 0.625 0.582)

	Surface
	{
		SurfStyle       0.929691
		OceanStyle      0.708597
		Randomize      (-0.003, -0.876, -0.420)
		colorDistMagn   0.303957
		colorDistFreq   0.00851072
		detailScale     128.186
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0232828
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.761991
		terraceProb     0.140302
		erosion         0
		montesMagn      0.627687
		montesFreq      3.0132
		montesSpiky     0.999055
		montesFraction  0.783724
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0616926
		hillsFraction   0.629763
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261857
		craterFreq      0.14663
		craterDensity   0.700961
		craterOctaves   9.87728
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   48.8435
		volcanoTemp     1519.86
		lavaCoverTidal  0
		lavaCoverSun    0.00647888
		lavaCoverYoung  0
		colorSea       (0.235, 0.219, 0.233, 0.050)
		colorShelf     (0.276, 0.256, 0.268, 0.040)
		colorBeach     (0.318, 0.294, 0.303, 0.030)
		colorDesert    (0.359, 0.331, 0.343, 0.020)
		colorLowland   (0.401, 0.369, 0.378, 0.030)
		colorUpland    (0.442, 0.406, 0.413, 0.050)
		colorRock      (0.484, 0.444, 0.460, 0.020)
		colorSnow      (0.484, 0.444, 0.460, 1.000)
		BumpHeight      4.22489
		BumpOffset      0.844978
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.189776
		Period          1.01367
		Eccentricity    0.0694766
		Inclination     2.41105
		AscendingNode   -147.867
		ArgOfPericenter -26.8273
		MeanAnomaly     124.358
	}
}

Asteroid	"S150"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.34132e-007
	Radius          41.7645
	InertiaMoment   0.399141

	RotationPeriod  575.972
	Obliquity       16.5001
	EqAscendNode    -108.548

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.811 0.774 0.759)

	Surface
	{
		SurfStyle       0.975355
		OceanStyle      0.925597
		Randomize      (-0.905, -0.548, 0.859)
		colorDistMagn   0.658421
		colorDistFreq   1.21801
		detailScale     1140.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.246343
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.671306
		terraceProb     0.365206
		erosion         0
		montesMagn      0.522325
		montesFreq      3.12374
		montesSpiky     0.981844
		montesFraction  0.465057
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.39881
		hillsFraction   0.666284
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247454
		craterFreq      0.175474
		craterDensity   0.959872
		craterOctaves   13.4588
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   11.328
		volcanoTemp     1572.04
		lavaCoverTidal  0
		lavaCoverSun    0.0205446
		lavaCoverYoung  0
		colorSea       (0.276, 0.271, 0.304, 0.050)
		colorShelf     (0.324, 0.317, 0.349, 0.040)
		colorBeach     (0.373, 0.364, 0.395, 0.030)
		colorDesert    (0.422, 0.410, 0.448, 0.020)
		colorLowland   (0.470, 0.457, 0.494, 0.030)
		colorUpland    (0.519, 0.503, 0.539, 0.050)
		colorRock      (0.568, 0.550, 0.600, 0.020)
		colorSnow      (0.568, 0.550, 0.600, 1.000)
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
		SemiMajorAxis   0.168839
		Period          0.850633
		Eccentricity    0.118129
		Inclination     6.67407
		AscendingNode   -120.717
		ArgOfPericenter 42.8024
		MeanAnomaly     -71.9857
	}
}

Asteroid	"S151"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.95747e-015
	Radius          0.0845889
	InertiaMoment   0.395493

	Obliquity       1.65523
	EqAscendNode    -150.555
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.493 0.487 0.483)

	Surface
	{
		SurfStyle       0.197993
		OceanStyle      0.429429
		Randomize      (-0.665, -0.596, 0.968)
		colorDistMagn   0.849172
		colorDistFreq   1.65599e-006
		detailScale     2.30984
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0146806
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.422862
		terraceProb     0.199685
		erosion         0
		montesMagn      0.447131
		montesFreq      2.6402
		montesSpiky     0.947272
		montesFraction  0.524233
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.11659e-005
		hillsFraction   0.557889
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245092
		craterFreq      0.204648
		craterDensity   0.866335
		craterOctaves   2.94908
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   299.759
		volcanoTemp     1741.59
		lavaCoverTidal  0
		lavaCoverSun    0.00897228
		lavaCoverYoung  0
		colorSea       (0.197, 0.195, 0.193, 0.000)
		colorShelf     (0.209, 0.207, 0.205, 0.000)
		colorBeach     (0.222, 0.219, 0.217, 0.000)
		colorDesert    (0.234, 0.231, 0.229, 0.000)
		colorLowland   (0.246, 0.243, 0.241, 0.000)
		colorUpland    (0.259, 0.256, 0.253, 0.000)
		colorRock      (0.271, 0.268, 0.266, 0.000)
		colorSnow      (0.283, 0.280, 0.278, 1.000)
		BumpHeight      0.07613
		BumpOffset      0.015226
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.186232
		Period          0.985406
		Eccentricity    0.089829
		Inclination     1.65523
		AscendingNode   -150.555
		ArgOfPericenter 52.7133
		MeanAnomaly     -32.8866
	}
}

Asteroid	"S152"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.88052e-012
	Radius          1.09485
	InertiaMoment   0.398248

	Obliquity       -0.432866
	EqAscendNode    100.192
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.721 0.716 0.713)

	Surface
	{
		SurfStyle       0.802907
		OceanStyle      0.244817
		Randomize      (-0.768, -0.881, -0.270)
		colorDistMagn   0.35681
		colorDistFreq   0.000213421
		detailScale     29.8967
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00969199
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.455023
		terraceProb     0.515545
		erosion         0
		montesMagn      0.424735
		montesFreq      3.3829
		montesSpiky     0.855791
		montesFraction  0.503917
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00273626
		hillsFraction   0.801059
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240529
		craterFreq      0.166542
		craterDensity   0.711875
		craterOctaves   7.93681
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   101.14
		volcanoTemp     1168.55
		lavaCoverTidal  0
		lavaCoverSun    0.00416559
		lavaCoverYoung  0
		colorSea       (0.281, 0.243, 0.200, 0.000)
		colorShelf     (0.288, 0.251, 0.228, 0.000)
		colorBeach     (0.339, 0.293, 0.271, 0.000)
		colorDesert    (0.368, 0.315, 0.264, 0.000)
		colorLowland   (0.404, 0.336, 0.299, 0.000)
		colorUpland    (0.447, 0.408, 0.364, 0.000)
		colorRock      (0.483, 0.444, 0.392, 0.000)
		colorSnow      (0.526, 0.472, 0.413, 1.000)
		BumpHeight      0.985363
		BumpOffset      0.197073
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.188979
		Period          1.00729
		Eccentricity    0.0200184
		Inclination     -0.432866
		AscendingNode   100.192
		ArgOfPericenter 11.6314
		MeanAnomaly     63.2238
	}
}

Asteroid	"S153"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.23884e-009
	Radius          9.74255
	InertiaMoment   0.39933

	RotationPeriod  1572.8
	Obliquity       3.09554
	EqAscendNode    -109.823

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.642 0.638 0.635)

	Surface
	{
		SurfStyle       0.718983
		OceanStyle      0.592385
		Randomize      (0.072, 0.485, 0.231)
		colorDistMagn   0.722645
		colorDistFreq   0.033463
		detailScale     266.037
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0497653
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.346223
		terraceProb     0.371875
		erosion         0
		montesMagn      0.407629
		montesFreq      3.70668
		montesSpiky     0.86515
		montesFraction  0.360764
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.165398
		hillsFraction   0.731045
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226324
		craterFreq      0.218561
		craterDensity   0.92179
		craterOctaves   10.8159
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.4615
		volcanoTemp     1534.44
		lavaCoverTidal  0
		lavaCoverSun    0.00884464
		lavaCoverYoung  0
		colorSea       (0.250, 0.217, 0.178, 0.000)
		colorShelf     (0.257, 0.223, 0.203, 0.000)
		colorBeach     (0.302, 0.261, 0.241, 0.000)
		colorDesert    (0.327, 0.281, 0.235, 0.000)
		colorLowland   (0.359, 0.300, 0.267, 0.000)
		colorUpland    (0.398, 0.363, 0.324, 0.000)
		colorRock      (0.430, 0.395, 0.349, 0.000)
		colorSnow      (0.468, 0.421, 0.368, 1.000)
		BumpHeight      8.76829
		BumpOffset      1.75366
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.186398
		Period          0.986718
		Eccentricity    0.0888623
		Inclination     1.2414
		AscendingNode   -112.856
		ArgOfPericenter 167.344
		MeanAnomaly     164.18
	}
}

Asteroid	"S154"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.48327e-017
	Radius          0.0197283
	InertiaMoment   0.396656

	RotationPeriod  50317.9
	Obliquity       4.78027
	EqAscendNode    5.71524

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.733 0.654 0.618)

	Surface
	{
		SurfStyle       0.344763
		OceanStyle      0.518346
		Randomize      (0.793, 0.070, -0.761)
		colorDistMagn   0.868739
		colorDistFreq   1.04182e-007
		detailScale     0.538714
		colorConversion true
		snowLevel       2
		tropicLatitude  0.165885
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498908
		terraceProb     0.176092
		erosion         0
		montesMagn      0.486202
		montesFreq      2.62518
		montesSpiky     0.993472
		montesFraction  0.575213
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.07915e-006
		hillsFraction   0.393475
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228264
		craterFreq      0.252829
		craterDensity   0
		craterOctaves   0.977183
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   620.703
		volcanoTemp     1063.17
		lavaCoverTidal  0
		lavaCoverSun    0.0120778
		lavaCoverYoung  0
		colorSea       (0.293, 0.262, 0.247, 0.000)
		colorShelf     (0.312, 0.278, 0.263, 0.000)
		colorBeach     (0.330, 0.295, 0.278, 0.000)
		colorDesert    (0.348, 0.311, 0.294, 0.000)
		colorLowland   (0.367, 0.327, 0.309, 0.000)
		colorUpland    (0.385, 0.344, 0.324, 0.000)
		colorRock      (0.403, 0.360, 0.340, 0.000)
		colorSnow      (0.422, 0.376, 0.355, 1.000)
		BumpHeight      0.0177555
		BumpOffset      0.00355109
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.182599
		Period          0.956708
		Eccentricity    0.111516
		Inclination     4.78027
		AscendingNode   5.71524
		ArgOfPericenter 176.055
		MeanAnomaly     104.022
	}
}

Asteroid	"S155"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.65426e-014
	Radius          0.255347
	InertiaMoment   0.398493

	Obliquity       1.27583
	EqAscendNode    -37.8039
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.773 0.771 0.769)

	Surface
	{
		SurfStyle       0.917942
		OceanStyle      0.762742
		Randomize      (-0.558, -0.626, 0.840)
		colorDistMagn   0.863318
		colorDistFreq   2.87096e-005
		detailScale     6.97268
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0421203
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404054
		terraceProb     0.192967
		erosion         0
		montesMagn      0.500381
		montesFreq      4.09841
		montesSpiky     0.971325
		montesFraction  0.507927
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000135578
		hillsFraction   0.807103
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244933
		craterFreq      0.245406
		craterDensity   0.748925
		craterOctaves   4.90783
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   209.429
		volcanoTemp     1482.55
		lavaCoverTidal  0
		lavaCoverSun    0.00974684
		lavaCoverYoung  0
		colorSea       (0.263, 0.270, 0.308, 0.050)
		colorShelf     (0.309, 0.316, 0.354, 0.040)
		colorBeach     (0.355, 0.362, 0.400, 0.030)
		colorDesert    (0.402, 0.409, 0.454, 0.020)
		colorLowland   (0.448, 0.455, 0.500, 0.030)
		colorUpland    (0.494, 0.501, 0.546, 0.050)
		colorRock      (0.541, 0.547, 0.608, 0.020)
		colorSnow      (0.541, 0.547, 0.608, 1.000)
		BumpHeight      0.229812
		BumpOffset      0.0459625
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.179014
		Period          0.928671
		Eccentricity    0.0586749
		Inclination     1.27583
		AscendingNode   -37.8039
		ArgOfPericenter 143.211
		MeanAnomaly     -106.942
	}
}

Asteroid	"S156"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.37744e-011
	Radius          2.27229
	InertiaMoment   0.399514

	Obliquity       -2.65539
	EqAscendNode    -41.244
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.641 0.504 0.421)

	Surface
	{
		SurfStyle       0.21024
		OceanStyle      0.47278
		Randomize      (-0.017, 0.085, -0.244)
		colorDistMagn   0.939782
		colorDistFreq   0.000533617
		detailScale     62.0488
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0866389
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.50206
		terraceProb     0.179222
		erosion         0
		montesMagn      0.534458
		montesFreq      3.11327
		montesSpiky     0.922672
		montesFraction  0.425288
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.013607
		hillsFraction   0.632188
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220968
		craterFreq      0.245087
		craterDensity   0.963354
		craterOctaves   8.83289
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   48.5828
		volcanoTemp     1855.81
		lavaCoverTidal  0
		lavaCoverSun    0.00981837
		lavaCoverYoung  0
		colorSea       (0.256, 0.202, 0.168, 0.000)
		colorShelf     (0.272, 0.214, 0.179, 0.000)
		colorBeach     (0.288, 0.227, 0.190, 0.000)
		colorDesert    (0.304, 0.239, 0.200, 0.000)
		colorLowland   (0.320, 0.252, 0.211, 0.000)
		colorUpland    (0.336, 0.265, 0.221, 0.000)
		colorRock      (0.352, 0.277, 0.232, 0.000)
		colorSnow      (0.368, 0.290, 0.242, 1.000)
		BumpHeight      2.04507
		BumpOffset      0.409013
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.177632
		Period          0.917938
		Eccentricity    0.051499
		Inclination     -2.65539
		AscendingNode   -41.244
		ArgOfPericenter 23.096
		MeanAnomaly     43.9481
	}
}

Asteroid	"S157"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            7.91318e-008
	Radius          29.0271
	InertiaMoment   0.397222

	RotationPeriod  479.698
	Obliquity       39.3939
	EqAscendNode    168.619

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.472 0.466 0.463)

	Surface
	{
		SurfStyle       0.501096
		OceanStyle      0.236509
		Randomize      (-0.519, 0.187, 0.044)
		colorDistMagn   0.778529
		colorDistFreq   0.336213
		detailScale     792.634
		colorConversion true
		snowLevel       2
		tropicLatitude  0.678136
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.397649
		terraceProb     0.360064
		erosion         0
		montesMagn      0.668077
		montesFreq      2.32534
		montesSpiky     0.885305
		montesFraction  0.480436
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.66001
		hillsFraction   0.733073
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220032
		craterFreq      0.150162
		craterDensity   0.855863
		craterOctaves   12.8672
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   16.1784
		volcanoTemp     1468.38
		lavaCoverTidal  0
		lavaCoverSun    0.00539034
		lavaCoverYoung  0
		colorSea       (0.184, 0.158, 0.130, 0.000)
		colorShelf     (0.189, 0.163, 0.148, 0.000)
		colorBeach     (0.222, 0.191, 0.176, 0.000)
		colorDesert    (0.241, 0.205, 0.171, 0.000)
		colorLowland   (0.264, 0.219, 0.195, 0.000)
		colorUpland    (0.292, 0.266, 0.236, 0.000)
		colorRock      (0.316, 0.289, 0.255, 0.000)
		colorSnow      (0.344, 0.308, 0.269, 1.000)
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
		SemiMajorAxis   0.191589
		Period          1.02823
		Eccentricity    0.0593573
		Inclination     -3.32569
		AscendingNode   173.27
		ArgOfPericenter 24.5188
		MeanAnomaly     -8.21816
	}
}

Asteroid	"S158"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.63582e-016
	Radius          0.0595534
	InertiaMoment   0.398718

	Obliquity       2.46721
	EqAscendNode    40.7259
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.605 0.599 0.594)

	Surface
	{
		SurfStyle       0.700786
		OceanStyle      0.0676408
		Randomize      (0.220, 0.576, -0.025)
		colorDistMagn   0.86051
		colorDistFreq   4.78954e-007
		detailScale     1.62621
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0806492
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.603177
		terraceProb     0.298645
		erosion         0
		montesMagn      0.557364
		montesFreq      2.86153
		montesSpiky     0.997108
		montesFraction  0.533972
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.26102e-006
		hillsFraction   0.66582
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232981
		craterFreq      0.209424
		craterDensity   0.870478
		craterOctaves   2.8918
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   433.66
		volcanoTemp     1837.29
		lavaCoverTidal  0
		lavaCoverSun    0.0191562
		lavaCoverYoung  0
		colorSea       (0.236, 0.204, 0.166, 0.000)
		colorShelf     (0.242, 0.210, 0.190, 0.000)
		colorBeach     (0.284, 0.246, 0.226, 0.000)
		colorDesert    (0.309, 0.264, 0.220, 0.000)
		colorLowland   (0.339, 0.282, 0.250, 0.000)
		colorUpland    (0.375, 0.342, 0.303, 0.000)
		colorRock      (0.405, 0.372, 0.327, 0.000)
		colorSnow      (0.442, 0.396, 0.345, 1.000)
		BumpHeight      0.0535981
		BumpOffset      0.0107196
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.176159
		Period          0.906543
		Eccentricity    0.152151
		Inclination     2.46721
		AscendingNode   40.7259
		ArgOfPericenter -109.332
		MeanAnomaly     161.021
	}
}

Asteroid	"S159"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            6.82187e-013
	Radius          0.52996
	InertiaMoment   0.399694

	Obliquity       1.36651
	EqAscendNode    72.3121
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.620 0.464 0.405)

	Surface
	{
		SurfStyle       0.876775
		OceanStyle      0.663058
		Randomize      (0.155, 0.494, 0.932)
		colorDistMagn   0.932087
		colorDistFreq   6.37793e-005
		detailScale     14.4714
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0385037
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.523839
		terraceProb     0.102336
		erosion         0
		montesMagn      0.462723
		montesFreq      2.77971
		montesSpiky     0.817105
		montesFraction  0.365974
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00084705
		hillsFraction   0.690797
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220638
		craterFreq      0.177986
		craterDensity   0.668637
		craterOctaves   5.90096
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   100.6
		volcanoTemp     1448.68
		lavaCoverTidal  0
		lavaCoverSun    0.00872375
		lavaCoverYoung  0
		colorSea       (0.211, 0.162, 0.162, 0.050)
		colorShelf     (0.248, 0.190, 0.186, 0.040)
		colorBeach     (0.285, 0.218, 0.211, 0.030)
		colorDesert    (0.322, 0.246, 0.239, 0.020)
		colorLowland   (0.359, 0.274, 0.263, 0.030)
		colorUpland    (0.397, 0.302, 0.288, 0.050)
		colorRock      (0.434, 0.329, 0.320, 0.020)
		colorSnow      (0.434, 0.329, 0.320, 1.000)
		BumpHeight      0.476964
		BumpOffset      0.0953928
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.186556
		Period          0.987973
		Eccentricity    0.0879403
		Inclination     1.36651
		AscendingNode   72.3121
		ArgOfPericenter 16.0575
		MeanAnomaly     -37.9194
	}
}

Asteroid	"S160"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.00388e-009
	Radius          6.77066
	InertiaMoment   0.397625

	RotationPeriod  4996.44
	Obliquity       1.51894
	EqAscendNode    -150.978

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.827 0.769 0.745)

	Surface
	{
		SurfStyle       0.481994
		OceanStyle      0.9923
		Randomize      (0.633, 0.731, -0.043)
		colorDistMagn   0.589759
		colorDistFreq   0.0298393
		detailScale     184.884
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0131969
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.671032
		terraceProb     0.352302
		erosion         0
		montesMagn      0.478252
		montesFreq      4.10676
		montesSpiky     0.868506
		montesFraction  0.447584
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0797622
		hillsFraction   0.537281
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257111
		craterFreq      0.273367
		craterDensity   0.952678
		craterOctaves   10.8998
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   33.504
		volcanoTemp     1673.54
		lavaCoverTidal  0
		lavaCoverSun    0.00480616
		lavaCoverYoung  0
		colorSea       (0.331, 0.308, 0.298, 0.000)
		colorShelf     (0.351, 0.327, 0.316, 0.000)
		colorBeach     (0.372, 0.346, 0.335, 0.000)
		colorDesert    (0.393, 0.365, 0.354, 0.000)
		colorLowland   (0.414, 0.384, 0.372, 0.000)
		colorUpland    (0.434, 0.404, 0.391, 0.000)
		colorRock      (0.455, 0.423, 0.409, 0.000)
		colorSnow      (0.476, 0.442, 0.428, 1.000)
		BumpHeight      6.09359
		BumpOffset      1.21872
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.191934
		Period          1.03101
		Eccentricity    0.049567
		Inclination     1.50157
		AscendingNode   -151.007
		ArgOfPericenter -166.438
		MeanAnomaly     172.405
	}
}

Asteroid	"S161"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.88106e-018
	Radius          0.0138894
	InertiaMoment   0.398927

	Obliquity       0.139494
	EqAscendNode    163.811
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.415 0.414 0.411)

	Surface
	{
		SurfStyle       0.179022
		OceanStyle      0.210317
		Randomize      (0.070, -0.880, -0.971)
		colorDistMagn   0.347282
		colorDistFreq   1.18846e-007
		detailScale     0.379272
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000690534
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.672931
		terraceProb     0.294044
		erosion         0
		montesMagn      0.483219
		montesFreq      3.87789
		montesSpiky     0.911776
		montesFraction  0.461109
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.88905e-007
		hillsFraction   0.503238
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243131
		craterFreq      0.208435
		craterDensity   0
		craterOctaves   0.984002
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   897.968
		volcanoTemp     1312.59
		lavaCoverTidal  0
		lavaCoverSun    0.00845411
		lavaCoverYoung  0
		colorSea       (0.166, 0.165, 0.164, 0.000)
		colorShelf     (0.177, 0.176, 0.174, 0.000)
		colorBeach     (0.187, 0.186, 0.185, 0.000)
		colorDesert    (0.197, 0.197, 0.195, 0.000)
		colorLowland   (0.208, 0.207, 0.205, 0.000)
		colorUpland    (0.218, 0.217, 0.216, 0.000)
		colorRock      (0.228, 0.228, 0.226, 0.000)
		colorSnow      (0.239, 0.238, 0.236, 1.000)
		BumpHeight      0.0125004
		BumpOffset      0.00250009
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.179687
		Period          0.933919
		Eccentricity    0.0439238
		Inclination     0.139494
		AscendingNode   163.811
		ArgOfPericenter -73.4711
		MeanAnomaly     -149.395
	}
}

Asteroid	"S162"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            8.65429e-015
	Radius          0.1236
	InertiaMoment   0.399871

	RotationPeriod  24197.3
	Obliquity       2.04091
	EqAscendNode    -104.19

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.500 0.448 0.367)

	Surface
	{
		SurfStyle       0.15999
		OceanStyle      0.911947
		Randomize      (0.803, -0.344, -0.054)
		colorDistMagn   0.959299
		colorDistFreq   9.51838e-006
		detailScale     3.37511
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0437473
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.280316
		terraceProb     0.41778
		erosion         0
		montesMagn      0.530805
		montesFreq      2.23107
		montesSpiky     0.748006
		montesFraction  0.489113
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.74659e-005
		hillsFraction   0.518076
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246072
		craterFreq      0.188718
		craterDensity   0.780499
		craterOctaves   3.87179
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   208.31
		volcanoTemp     1628.14
		lavaCoverTidal  0
		lavaCoverSun    0.017007
		lavaCoverYoung  0
		colorSea       (0.200, 0.179, 0.147, 0.000)
		colorShelf     (0.212, 0.191, 0.156, 0.000)
		colorBeach     (0.225, 0.202, 0.165, 0.000)
		colorDesert    (0.237, 0.213, 0.174, 0.000)
		colorLowland   (0.250, 0.224, 0.183, 0.000)
		colorUpland    (0.262, 0.235, 0.192, 0.000)
		colorRock      (0.275, 0.247, 0.202, 0.000)
		colorSnow      (0.287, 0.258, 0.211, 1.000)
		BumpHeight      0.11124
		BumpOffset      0.0222481
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.177916
		Period          0.920142
		Eccentricity    0.140771
		Inclination     2.04091
		AscendingNode   -104.19
		ArgOfPericenter 140.247
		MeanAnomaly     -7.3798
	}
}

Asteroid	"S163"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.27353e-011
	Radius          1.57912
	InertiaMoment   0.39795

	RotationPeriod  33409.6
	Obliquity       -1.89785
	EqAscendNode    -139.717

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.780 0.778 0.777)

	Surface
	{
		SurfStyle       0.00946185
		OceanStyle      0.716006
		Randomize      (-0.422, 0.044, 0.593)
		colorDistMagn   0.546577
		colorDistFreq   0.00136285
		detailScale     43.1206
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0228071
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.608596
		terraceProb     0.588237
		erosion         0
		montesMagn      0.430615
		montesFreq      4.09308
		montesSpiky     0.928749
		montesFraction  0.25202
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00524904
		hillsFraction   0.696729
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226746
		craterFreq      0.156559
		craterDensity   0.895884
		craterOctaves   7.81045
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   69.3774
		volcanoTemp     1184.21
		lavaCoverTidal  0
		lavaCoverSun    0.0125451
		lavaCoverYoung  0
		colorSea       (0.312, 0.311, 0.311, 0.000)
		colorShelf     (0.332, 0.331, 0.330, 0.000)
		colorBeach     (0.351, 0.350, 0.349, 0.000)
		colorDesert    (0.371, 0.370, 0.369, 0.000)
		colorLowland   (0.390, 0.389, 0.388, 0.000)
		colorUpland    (0.410, 0.409, 0.408, 0.000)
		colorRock      (0.429, 0.428, 0.427, 0.000)
		colorSnow      (0.449, 0.447, 0.446, 1.000)
		BumpHeight      1.42121
		BumpOffset      0.284242
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.182106
		Period          0.952839
		Eccentricity    0.114522
		Inclination     -1.89785
		AscendingNode   -139.717
		ArgOfPericenter 179.303
		MeanAnomaly     -138.386
	}
}

Asteroid	"S164"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.87406e-008
	Radius          20.4373
	InertiaMoment   0.399126

	RotationPeriod  1398.94
	Obliquity       -0.263632
	EqAscendNode    127.211

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.713 0.621 0.590)

	Surface
	{
		SurfStyle       0.397076
		OceanStyle      0.903633
		Randomize      (0.707, 0.249, 0.572)
		colorDistMagn   0.776507
		colorDistFreq   0.248691
		detailScale     558.076
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0481096
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.46884
		terraceProb     0.314342
		erosion         0
		montesMagn      0.529526
		montesFreq      2.55966
		montesSpiky     0.974198
		montesFraction  0.506857
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.808524
		hillsFraction   0.905229
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207546
		craterFreq      0.217096
		craterDensity   0.93151
		craterOctaves   11.8966
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.4066
		volcanoTemp     1585.58
		lavaCoverTidal  0
		lavaCoverSun    0.00454642
		lavaCoverYoung  0
		colorSea       (0.285, 0.248, 0.236, 0.000)
		colorShelf     (0.303, 0.264, 0.251, 0.000)
		colorBeach     (0.321, 0.279, 0.265, 0.000)
		colorDesert    (0.339, 0.295, 0.280, 0.000)
		colorLowland   (0.356, 0.310, 0.295, 0.000)
		colorUpland    (0.374, 0.326, 0.310, 0.000)
		colorRock      (0.392, 0.341, 0.324, 0.000)
		colorSnow      (0.410, 0.357, 0.339, 1.000)
		BumpHeight      18.3936
		BumpOffset      3.67872
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.187559
		Period          0.995958
		Eccentricity    0.0203607
		Inclination     -2.8976
		AscendingNode   124.329
		ArgOfPericenter 3.80241
		MeanAnomaly     -141.557
	}
}

Asteroid	"S165"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.09789e-016
	Radius          0.0288268
	InertiaMoment   0.395301

	Obliquity       3.49881
	EqAscendNode    135.954
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.472 0.466 0.462)

	Surface
	{
		SurfStyle       0.451779
		OceanStyle      0.46858
		Randomize      (0.797, 0.709, 0.498)
		colorDistMagn   0.705137
		colorDistFreq   1.88167e-007
		detailScale     0.787164
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0457564
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.326696
		terraceProb     0.103224
		erosion         0
		montesMagn      0.660387
		montesFreq      2.74318
		montesSpiky     0.980325
		montesFraction  0.425636
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.48532e-006
		hillsFraction   0.715308
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225074
		craterFreq      0.23208
		craterDensity   0.834653
		craterOctaves   1.98406
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   431.343
		volcanoTemp     1332.23
		lavaCoverTidal  0
		lavaCoverSun    0.00420323
		lavaCoverYoung  0
		colorSea       (0.189, 0.186, 0.185, 0.000)
		colorShelf     (0.200, 0.198, 0.196, 0.000)
		colorBeach     (0.212, 0.210, 0.208, 0.000)
		colorDesert    (0.224, 0.221, 0.220, 0.000)
		colorLowland   (0.236, 0.233, 0.231, 0.000)
		colorUpland    (0.248, 0.245, 0.243, 0.000)
		colorRock      (0.259, 0.256, 0.254, 0.000)
		colorSnow      (0.271, 0.268, 0.266, 1.000)
		BumpHeight      0.0259441
		BumpOffset      0.00518883
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.193838
		Period          1.04638
		Eccentricity    0.0470694
		Inclination     3.49881
		AscendingNode   135.954
		ArgOfPericenter -127.901
		MeanAnomaly     86.4319
	}
}

Asteroid	"S166"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.61561e-013
	Radius          0.327885
	InertiaMoment   0.398228

	Obliquity       0.194906
	EqAscendNode    -154.695
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.601 0.598 0.595)

	Surface
	{
		SurfStyle       0.807982
		OceanStyle      0.907221
		Randomize      (0.111, -0.421, -0.932)
		colorDistMagn   0.984562
		colorDistFreq   5.26524e-005
		detailScale     8.95344
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00150498
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58314
		terraceProb     0.522005
		erosion         0
		montesMagn      0.552431
		montesFreq      2.59545
		montesSpiky     0.983027
		montesFraction  0.171844
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000227783
		hillsFraction   0.478
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219386
		craterFreq      0.191381
		craterDensity   0.861986
		craterOctaves   5.90172
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   127.897
		volcanoTemp     1337.86
		lavaCoverTidal  0
		lavaCoverSun    0.00865693
		lavaCoverYoung  0
		colorSea       (0.234, 0.203, 0.167, 0.000)
		colorShelf     (0.241, 0.209, 0.191, 0.000)
		colorBeach     (0.283, 0.245, 0.226, 0.000)
		colorDesert    (0.307, 0.263, 0.220, 0.000)
		colorLowland   (0.337, 0.281, 0.250, 0.000)
		colorUpland    (0.373, 0.341, 0.304, 0.000)
		colorRock      (0.403, 0.371, 0.327, 0.000)
		colorSnow      (0.439, 0.395, 0.345, 1.000)
		BumpHeight      0.295096
		BumpOffset      0.0590193
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.186644
		Period          0.988672
		Eccentricity    0.0874278
		Inclination     0.194906
		AscendingNode   -154.695
		ArgOfPericenter -152.175
		MeanAnomaly     -21.1694
	}
}

Asteroid	"S167"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.37745e-010
	Radius          4.18902
	InertiaMoment   0.399316

	RotationPeriod  23802.1
	Obliquity       -1.06029
	EqAscendNode    -46.2139

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.746 0.704 0.631)

	Surface
	{
		SurfStyle       0.578154
		OceanStyle      0.407077
		Randomize      (0.460, 0.045, -0.369)
		colorDistMagn   0.219924
		colorDistFreq   0.00731522
		detailScale     114.388
		colorConversion true
		snowLevel       2
		tropicLatitude  0.034035
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.416058
		terraceProb     0.189531
		erosion         0
		montesMagn      0.624559
		montesFreq      2.69879
		montesSpiky     0.900547
		montesFraction  0.526699
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0268895
		hillsFraction   0.642324
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232854
		craterFreq      0.230025
		craterDensity   0.888912
		craterOctaves   9.63492
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.5954
		volcanoTemp     1449.07
		lavaCoverTidal  0
		lavaCoverSun    0.019393
		lavaCoverYoung  0
		colorSea       (0.291, 0.239, 0.177, 0.000)
		colorShelf     (0.298, 0.246, 0.202, 0.000)
		colorBeach     (0.351, 0.288, 0.240, 0.000)
		colorDesert    (0.381, 0.310, 0.234, 0.000)
		colorLowland   (0.418, 0.331, 0.265, 0.000)
		colorUpland    (0.463, 0.401, 0.322, 0.000)
		colorRock      (0.500, 0.436, 0.347, 0.000)
		colorSnow      (0.545, 0.464, 0.366, 1.000)
		BumpHeight      3.77012
		BumpOffset      0.754024
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.175973
		Period          0.905113
		Eccentricity    0.153364
		Inclination     -1.06029
		AscendingNode   -46.2139
		ArgOfPericenter 140.403
		MeanAnomaly     159.078
	}
}

Asteroid	"S168"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.49855e-007
	Radius          54.2063
	InertiaMoment   0.396599

	RotationPeriod  539.127
	Obliquity       19.1894
	EqAscendNode    17.8236

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.545 0.474 0.426)

	Surface
	{
		SurfStyle       0.679784
		OceanStyle      0.938932
		Randomize      (0.683, -0.594, -0.066)
		colorDistMagn   0.623474
		colorDistFreq   0.469406
		detailScale     1480.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.338657
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.475485
		terraceProb     0.106785
		erosion         0
		montesMagn      0.520756
		montesFreq      2.94372
		montesSpiky     0.863768
		montesFraction  0.847468
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.11537
		hillsFraction   0.697402
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248017
		craterFreq      0.216468
		craterDensity   0.807366
		craterOctaves   13.635
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   14.3685
		volcanoTemp     1996.83
		lavaCoverTidal  0
		lavaCoverSun    0.0138117
		lavaCoverYoung  0
		colorSea       (0.212, 0.161, 0.119, 0.000)
		colorShelf     (0.218, 0.166, 0.136, 0.000)
		colorBeach     (0.256, 0.194, 0.162, 0.000)
		colorDesert    (0.278, 0.209, 0.158, 0.000)
		colorLowland   (0.305, 0.223, 0.179, 0.000)
		colorUpland    (0.338, 0.270, 0.217, 0.000)
		colorRock      (0.365, 0.294, 0.234, 0.000)
		colorSnow      (0.398, 0.313, 0.247, 1.000)
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
		SemiMajorAxis   0.180828
		Period          0.942827
		Eccentricity    0.122398
		Inclination     0.605687
		AscendingNode   -0.457259
		ArgOfPericenter -67.1007
		MeanAnomaly     -0.667741
	}
}

Asteroid	"S169"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.04958e-015
	Radius          0.0764712
	InertiaMoment   0.398475

	RotationPeriod  42541.5
	Obliquity       -2.20013
	EqAscendNode    -23.6319

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.650 0.643)

	Surface
	{
		SurfStyle       0.12111
		OceanStyle      0.932368
		Randomize      (-0.825, -0.016, 0.662)
		colorDistMagn   0.743917
		colorDistFreq   4.43374e-006
		detailScale     2.08817
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0751002
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.602645
		terraceProb     0.252132
		erosion         0
		montesMagn      0.437892
		montesFreq      3.51221
		montesSpiky     0.858943
		montesFraction  0.598983
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.77068e-005
		hillsFraction   0.727759
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.285655
		craterFreq      0.224297
		craterDensity   0.927419
		craterOctaves   2.94048
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   264.832
		volcanoTemp     1462.07
		lavaCoverTidal  0
		lavaCoverSun    0.0104947
		lavaCoverYoung  0
		colorSea       (0.262, 0.260, 0.257, 0.000)
		colorShelf     (0.278, 0.276, 0.273, 0.000)
		colorBeach     (0.294, 0.292, 0.290, 0.000)
		colorDesert    (0.311, 0.309, 0.306, 0.000)
		colorLowland   (0.327, 0.325, 0.322, 0.000)
		colorUpland    (0.343, 0.341, 0.338, 0.000)
		colorRock      (0.360, 0.357, 0.354, 0.000)
		colorSnow      (0.376, 0.373, 0.370, 1.000)
		BumpHeight      0.0688241
		BumpOffset      0.0137648
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.184365
		Period          0.970625
		Eccentricity    0.100866
		Inclination     -2.20013
		AscendingNode   -23.6319
		ArgOfPericenter 43.7164
		MeanAnomaly     6.27723
	}
}

Asteroid	"S170"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.01606e-012
	Radius          0.977
	InertiaMoment   0.3995

	RotationPeriod  15408
	Obliquity       1.25314
	EqAscendNode    18.5336

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.701 0.697 0.693)

	Surface
	{
		SurfStyle       0.868179
		OceanStyle      0.339565
		Randomize      (-0.852, 0.678, 0.538)
		colorDistMagn   0.682517
		colorDistFreq   0.00051506
		detailScale     26.6786
		colorConversion true
		snowLevel       2
		tropicLatitude  0.043158
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.677999
		terraceProb     0.321243
		erosion         0
		montesMagn      0.542879
		montesFreq      2.30484
		montesSpiky     0.99442
		montesFraction  0.409357
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00138589
		hillsFraction   0.698052
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255269
		craterFreq      0.204444
		craterDensity   0.823965
		craterOctaves   6.68268
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   88.2024
		volcanoTemp     1594.82
		lavaCoverTidal  0
		lavaCoverSun    0.0241344
		lavaCoverYoung  0
		colorSea       (0.238, 0.244, 0.277, 0.050)
		colorShelf     (0.280, 0.286, 0.319, 0.040)
		colorBeach     (0.322, 0.327, 0.360, 0.030)
		colorDesert    (0.365, 0.369, 0.409, 0.020)
		colorLowland   (0.407, 0.411, 0.451, 0.030)
		colorUpland    (0.449, 0.453, 0.492, 0.050)
		colorRock      (0.491, 0.495, 0.548, 0.020)
		colorSnow      (0.491, 0.495, 0.548, 1.000)
		BumpHeight      0.8793
		BumpOffset      0.17586
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.172555
		Period          0.878869
		Eccentricity    0.176213
		Inclination     1.25314
		AscendingNode   18.5336
		ArgOfPericenter 123.629
		MeanAnomaly     -29.9683
	}
}

Asteroid	"S171"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.43829e-009
	Radius          12.6449
	InertiaMoment   0.397185

	RotationPeriod  5054.92
	Obliquity       0.315248
	EqAscendNode    -88.8102

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.812 0.762 0.732)

	Surface
	{
		SurfStyle       0.289922
		OceanStyle      0.99595
		Randomize      (0.196, -0.744, -0.554)
		colorDistMagn   0.51544
		colorDistFreq   0.0539712
		detailScale     345.291
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00785808
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.417035
		terraceProb     0.149983
		erosion         0
		montesMagn      0.51381
		montesFreq      3.21073
		montesSpiky     0.998856
		montesFraction  0.805757
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.405882
		hillsFraction   0.513287
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244104
		craterFreq      0.152548
		craterDensity   0.875919
		craterOctaves   11.393
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.7588
		volcanoTemp     1439.17
		lavaCoverTidal  0
		lavaCoverSun    0.0269664
		lavaCoverYoung  0
		colorSea       (0.325, 0.305, 0.293, 0.000)
		colorShelf     (0.345, 0.324, 0.311, 0.000)
		colorBeach     (0.366, 0.343, 0.329, 0.000)
		colorDesert    (0.386, 0.362, 0.348, 0.000)
		colorLowland   (0.406, 0.381, 0.366, 0.000)
		colorUpland    (0.426, 0.400, 0.384, 0.000)
		colorRock      (0.447, 0.419, 0.403, 0.000)
		colorSnow      (0.467, 0.438, 0.421, 1.000)
		BumpHeight      11.3804
		BumpOffset      2.27609
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.170734
		Period          0.864997
		Eccentricity    0.188754
		Inclination     0.315248
		AscendingNode   -88.8102
		ArgOfPericenter 81.389
		MeanAnomaly     -103.98
	}
}

Asteroid	"S172"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.60011e-017
	Radius          0.017835
	InertiaMoment   0.398701

	Obliquity       -3.31666
	EqAscendNode    21.5208
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.584 0.450 0.332)

	Surface
	{
		SurfStyle       0.85265
		OceanStyle      0.017979
		Randomize      (-0.133, 0.113, 0.241)
		colorDistMagn   0.756374
		colorDistFreq   2.00076e-007
		detailScale     0.487015
		colorConversion true
		snowLevel       2
		tropicLatitude  0.11349
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.507204
		terraceProb     0.112156
		erosion         0
		montesMagn      0.654867
		montesFreq      1.96182
		montesSpiky     0.93364
		montesFraction  0.801664
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.62133e-007
		hillsFraction   0.758546
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259373
		craterFreq      0.211853
		craterDensity   0
		craterOctaves   0.989942
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   548.383
		volcanoTemp     1336.07
		lavaCoverTidal  0
		lavaCoverSun    0.00530693
		lavaCoverYoung  0
		colorSea       (0.199, 0.158, 0.133, 0.050)
		colorShelf     (0.234, 0.185, 0.153, 0.040)
		colorBeach     (0.269, 0.212, 0.173, 0.030)
		colorDesert    (0.304, 0.239, 0.196, 0.020)
		colorLowland   (0.339, 0.266, 0.216, 0.030)
		colorUpland    (0.374, 0.293, 0.236, 0.050)
		colorRock      (0.409, 0.320, 0.262, 0.020)
		colorSnow      (0.409, 0.320, 0.262, 1.000)
		BumpHeight      0.0160515
		BumpOffset      0.0032103
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.191737
		Period          1.02942
		Eccentricity    0.0585413
		Inclination     -3.31666
		AscendingNode   21.5208
		ArgOfPericenter -97.1819
		MeanAnomaly     86.5625
	}
}

Asteroid	"S173"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.8262e-014
	Radius          0.227862
	InertiaMoment   0.39968

	Obliquity       0.525844
	EqAscendNode    68.0876
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.791 0.789 0.787)

	Surface
	{
		SurfStyle       0.430411
		OceanStyle      0.988865
		Randomize      (0.876, 0.009, 0.915)
		colorDistMagn   0.398982
		colorDistFreq   3.66559e-005
		detailScale     6.22215
		colorConversion true
		snowLevel       2
		tropicLatitude  0.015207
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.517178
		terraceProb     0.422068
		erosion         0
		montesMagn      0.348994
		montesFreq      3.31598
		montesSpiky     0.994576
		montesFraction  0.80234
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000133298
		hillsFraction   0.581317
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210903
		craterFreq      0.249173
		craterDensity   0.792464
		craterOctaves   4.86286
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   182.639
		volcanoTemp     1551.73
		lavaCoverTidal  0
		lavaCoverSun    0.0145357
		lavaCoverYoung  0
		colorSea       (0.317, 0.316, 0.315, 0.000)
		colorShelf     (0.336, 0.336, 0.334, 0.000)
		colorBeach     (0.356, 0.355, 0.354, 0.000)
		colorDesert    (0.376, 0.375, 0.374, 0.000)
		colorLowland   (0.396, 0.395, 0.393, 0.000)
		colorUpland    (0.415, 0.414, 0.413, 0.000)
		colorRock      (0.435, 0.434, 0.433, 0.000)
		colorSnow      (0.455, 0.454, 0.453, 1.000)
		BumpHeight      0.205076
		BumpOffset      0.0410151
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.180132
		Period          0.937388
		Eccentricity    0.126736
		Inclination     0.525844
		AscendingNode   68.0876
		ArgOfPericenter -111.548
		MeanAnomaly     -95.4903
	}
}

Asteroid	"S174"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.63046e-011
	Radius          2.94923
	InertiaMoment   0.397597

	RotationPeriod  10950.6
	Obliquity       0.987124
	EqAscendNode    -35.9753

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.782 0.690 0.643)

	Surface
	{
		SurfStyle       0.195757
		OceanStyle      0.565432
		Randomize      (0.566, 0.845, -0.799)
		colorDistMagn   0.835551
		colorDistFreq   0.00761257
		detailScale     80.5337
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0327669
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.551007
		terraceProb     0.246597
		erosion         0
		montesMagn      0.427259
		montesFreq      2.74777
		montesSpiky     0.929341
		montesFraction  0.414666
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0221789
		hillsFraction   0.66016
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271034
		craterFreq      0.168297
		craterDensity   0.995032
		craterOctaves   8.76019
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   61.623
		volcanoTemp     1561.42
		lavaCoverTidal  0
		lavaCoverSun    0.0141185
		lavaCoverYoung  0
		colorSea       (0.313, 0.276, 0.257, 0.000)
		colorShelf     (0.332, 0.293, 0.273, 0.000)
		colorBeach     (0.352, 0.310, 0.290, 0.000)
		colorDesert    (0.372, 0.328, 0.306, 0.000)
		colorLowland   (0.391, 0.345, 0.322, 0.000)
		colorUpland    (0.411, 0.362, 0.338, 0.000)
		colorRock      (0.430, 0.379, 0.354, 0.000)
		colorSnow      (0.450, 0.397, 0.370, 1.000)
		BumpHeight      2.65431
		BumpOffset      0.530862
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.180074
		Period          0.936933
		Eccentricity    0.121425
		Inclination     0.987124
		AscendingNode   -35.9753
		ArgOfPericenter 0.692449
		MeanAnomaly     -152.31
	}
}

Asteroid	"S175"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            8.28553e-008
	Radius          26.2414
	InertiaMoment   0.398912

	RotationPeriod  537.975
	Obliquity       17.9909
	EqAscendNode    -64.4671

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.747 0.691 0.624)

	Surface
	{
		SurfStyle       0.423285
		OceanStyle      0.00508002
		Randomize      (0.158, -0.643, -0.363)
		colorDistMagn   0.533745
		colorDistFreq   0.541025
		detailScale     716.565
		colorConversion true
		snowLevel       2
		tropicLatitude  0.341187
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406709
		terraceProb     0.220537
		erosion         0
		montesMagn      0.512812
		montesFreq      3.17493
		montesSpiky     0.935344
		montesFraction  0.476726
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.13098
		hillsFraction   0.628914
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251025
		craterFreq      0.263708
		craterDensity   0.755171
		craterOctaves   12.6593
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   14.2933
		volcanoTemp     1256.71
		lavaCoverTidal  0
		lavaCoverSun    0.0138861
		lavaCoverYoung  0
		colorSea       (0.299, 0.277, 0.250, 0.000)
		colorShelf     (0.318, 0.294, 0.265, 0.000)
		colorBeach     (0.336, 0.311, 0.281, 0.000)
		colorDesert    (0.355, 0.328, 0.297, 0.000)
		colorLowland   (0.374, 0.346, 0.312, 0.000)
		colorUpland    (0.392, 0.363, 0.328, 0.000)
		colorRock      (0.411, 0.380, 0.343, 0.000)
		colorSnow      (0.430, 0.398, 0.359, 1.000)
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
		SemiMajorAxis   0.180756
		Period          0.942259
		Eccentricity    0.122849
		Inclination     5.43083
		AscendingNode   -76.4665
		ArgOfPericenter -46.0705
		MeanAnomaly     -20.8125
	}
}

Asteroid	"S176"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.85396e-016
	Radius          0.0531432
	InertiaMoment   0.399857

	RotationPeriod  17058
	Obliquity       -1.66737
	EqAscendNode    53.0285

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.783 0.781 0.780)

	Surface
	{
		SurfStyle       0.3598
		OceanStyle      0.820508
		Randomize      (0.517, -0.741, -0.094)
		colorDistMagn   0.415728
		colorDistFreq   1.80631e-006
		detailScale     1.45116
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0520559
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.348712
		terraceProb     0.193757
		erosion         0
		montesMagn      0.585705
		montesFreq      3.50492
		montesSpiky     0.905459
		montesFraction  0.684872
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.05639e-006
		hillsFraction   0.54349
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223805
		craterFreq      0.180879
		craterDensity   1.06121
		craterOctaves   2.94595
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   378.186
		volcanoTemp     1488.77
		lavaCoverTidal  0
		lavaCoverSun    0.00952524
		lavaCoverYoung  0
		colorSea       (0.313, 0.312, 0.312, 0.000)
		colorShelf     (0.333, 0.332, 0.331, 0.000)
		colorBeach     (0.352, 0.351, 0.351, 0.000)
		colorDesert    (0.372, 0.371, 0.370, 0.000)
		colorLowland   (0.392, 0.390, 0.390, 0.000)
		colorUpland    (0.411, 0.410, 0.409, 0.000)
		colorRock      (0.431, 0.429, 0.429, 0.000)
		colorSnow      (0.450, 0.449, 0.448, 1.000)
		BumpHeight      0.0478288
		BumpOffset      0.00956577
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.184665
		Period          0.972989
		Eccentricity    0.0888339
		Inclination     -1.66737
		AscendingNode   53.0285
		ArgOfPericenter 105.526
		MeanAnomaly     -87.1686
	}
}

Asteroid	"S177"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            7.14287e-013
	Radius          0.687841
	InertiaMoment   0.397927

	Obliquity       2.27875
	EqAscendNode    155.555
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.789 0.710 0.619)

	Surface
	{
		SurfStyle       0.951513
		OceanStyle      0.613254
		Randomize      (0.442, -0.543, -0.026)
		colorDistMagn   0.791234
		colorDistFreq   0.000187996
		detailScale     18.7827
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0168363
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.538605
		terraceProb     0.418927
		erosion         0
		montesMagn      0.432626
		montesFreq      2.73919
		montesSpiky     0.964709
		montesFraction  0.76396
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000920456
		hillsFraction   0.516177
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238633
		craterFreq      0.268235
		craterDensity   0.813073
		craterOctaves   6.7691
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   127.602
		volcanoTemp     1461.06
		lavaCoverTidal  0
		lavaCoverSun    0.0175061
		lavaCoverYoung  0
		colorSea       (0.268, 0.249, 0.248, 0.050)
		colorShelf     (0.315, 0.291, 0.285, 0.040)
		colorBeach     (0.363, 0.334, 0.322, 0.030)
		colorDesert    (0.410, 0.376, 0.365, 0.020)
		colorLowland   (0.457, 0.419, 0.402, 0.030)
		colorUpland    (0.505, 0.462, 0.440, 0.050)
		colorRock      (0.552, 0.504, 0.489, 0.020)
		colorSnow      (0.552, 0.504, 0.489, 1.000)
		BumpHeight      0.619057
		BumpOffset      0.123811
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.16785
		Period          0.843166
		Eccentricity    0.081649
		Inclination     2.27875
		AscendingNode   155.555
		ArgOfPericenter -62.9024
		MeanAnomaly     18.0738
	}
}

Asteroid	"S178"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.05111e-009
	Radius          6.12089
	InertiaMoment   0.399111

	Obliquity       1.19476
	EqAscendNode    -99.829
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.691 0.685 0.683)

	Surface
	{
		SurfStyle       0.299937
		OceanStyle      0.019982
		Randomize      (0.592, 0.194, 0.079)
		colorDistMagn   0.839976
		colorDistFreq   0.0175387
		detailScale     167.141
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0268508
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562559
		terraceProb     0.178313
		erosion         0
		montesMagn      0.278746
		montesFreq      3.41015
		montesSpiky     0.987541
		montesFraction  0.510452
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.106398
		hillsFraction   0.860064
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220181
		craterFreq      0.233664
		craterDensity   0.994344
		craterOctaves   9.74509
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.6003
		volcanoTemp     1791.89
		lavaCoverTidal  0
		lavaCoverSun    0.0135026
		lavaCoverYoung  0
		colorSea       (0.276, 0.274, 0.273, 0.000)
		colorShelf     (0.294, 0.291, 0.290, 0.000)
		colorBeach     (0.311, 0.308, 0.307, 0.000)
		colorDesert    (0.328, 0.325, 0.325, 0.000)
		colorLowland   (0.345, 0.343, 0.342, 0.000)
		colorUpland    (0.363, 0.360, 0.359, 0.000)
		colorRock      (0.380, 0.377, 0.376, 0.000)
		colorSnow      (0.397, 0.394, 0.393, 1.000)
		BumpHeight      5.5088
		BumpOffset      1.10176
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.181133
		Period          0.94521
		Eccentricity    0.120511
		Inclination     1.19476
		AscendingNode   -99.829
		ArgOfPericenter 40.1917
		MeanAnomaly     -98.7882
	}
}

Asteroid	"S179"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            6.15777e-018
	Radius          0.0123943
	InertiaMoment   0.395052

	Obliquity       0.568679
	EqAscendNode    176.859
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.677 0.675 0.674)

	Surface
	{
		SurfStyle       0.104143
		OceanStyle      0.150665
		Randomize      (-0.503, 0.359, -0.531)
		colorDistMagn   0.152464
		colorDistFreq   1.20064e-007
		detailScale     0.338448
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.320292
		terraceProb     0.136489
		erosion         0
		montesMagn      0.534538
		montesFreq      3.54206
		montesSpiky     0.992989
		montesFraction  0.461923
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.27147e-007
		hillsFraction   0.757549
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235004
		craterFreq      0.214482
		craterDensity   0
		craterOctaves   0.986512
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   783.101
		volcanoTemp     1630.5
		lavaCoverTidal  0
		lavaCoverSun    0.00712289
		lavaCoverYoung  0
		colorSea       (0.271, 0.270, 0.269, 0.000)
		colorShelf     (0.288, 0.287, 0.286, 0.000)
		colorBeach     (0.305, 0.304, 0.303, 0.000)
		colorDesert    (0.322, 0.321, 0.320, 0.000)
		colorLowland   (0.338, 0.338, 0.337, 0.000)
		colorUpland    (0.355, 0.355, 0.354, 0.000)
		colorRock      (0.372, 0.371, 0.370, 0.000)
		colorSnow      (0.389, 0.388, 0.387, 1.000)
		BumpHeight      0.0111549
		BumpOffset      0.00223098
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.184921
		Period          0.975018
		Eccentricity    0.0530517
		Inclination     0.568679
		AscendingNode   176.859
		ArgOfPericenter -96.3595
		MeanAnomaly     -124.632
	}
}

Asteroid	"S180"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            9.06149e-015
	Radius          0.160422
	InertiaMoment   0.398207

	Obliquity       -5.0313
	EqAscendNode    -171.142
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.515 0.510 0.507)

	Surface
	{
		SurfStyle       0.288931
		OceanStyle      0.640757
		Randomize      (0.258, -0.762, -0.229)
		colorDistMagn   0.040091
		colorDistFreq   1.29862e-005
		detailScale     4.3806
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0135445
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.516528
		terraceProb     0.385865
		erosion         0
		montesMagn      0.630756
		montesFreq      2.55402
		montesSpiky     0.997857
		montesFraction  0.668867
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.47587e-005
		hillsFraction   0.539408
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229617
		craterFreq      0.198234
		craterDensity   0.811968
		craterOctaves   3.95014
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   264.223
		volcanoTemp     1679.9
		lavaCoverTidal  0
		lavaCoverSun    0.00658148
		lavaCoverYoung  0
		colorSea       (0.206, 0.204, 0.203, 0.000)
		colorShelf     (0.219, 0.217, 0.215, 0.000)
		colorBeach     (0.232, 0.230, 0.228, 0.000)
		colorDesert    (0.245, 0.242, 0.241, 0.000)
		colorLowland   (0.258, 0.255, 0.253, 0.000)
		colorUpland    (0.271, 0.268, 0.266, 0.000)
		colorRock      (0.283, 0.281, 0.279, 0.000)
		colorSnow      (0.296, 0.293, 0.291, 1.000)
		BumpHeight      0.14438
		BumpOffset      0.028876
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.189615
		Period          1.01238
		Eccentricity    0.0703847
		Inclination     -5.0313
		AscendingNode   -171.142
		ArgOfPericenter -90.4781
		MeanAnomaly     -156.396
	}
}

Asteroid	"S181"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.33345e-011
	Radius          1.42758
	InertiaMoment   0.399301

	RotationPeriod  14334.5
	Obliquity       4.83396
	EqAscendNode    74.7095

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.690 0.549 0.484)

	Surface
	{
		SurfStyle       0.784938
		OceanStyle      0.0658049
		Randomize      (0.477, -0.394, -0.465)
		colorDistMagn   0.473087
		colorDistFreq   0.00103436
		detailScale     38.9824
		colorConversion true
		snowLevel       2
		tropicLatitude  0.133668
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.531859
		terraceProb     0.259262
		erosion         0
		montesMagn      0.554352
		montesFreq      2.44974
		montesSpiky     0.902133
		montesFraction  0.458657
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00533368
		hillsFraction   0.74381
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235345
		craterFreq      0.19407
		craterDensity   0.769912
		craterOctaves   7.85786
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   61.294
		volcanoTemp     1605.43
		lavaCoverTidal  0
		lavaCoverSun    0.00939301
		lavaCoverYoung  0
		colorSea       (0.269, 0.187, 0.135, 0.000)
		colorShelf     (0.276, 0.192, 0.155, 0.000)
		colorBeach     (0.324, 0.225, 0.184, 0.000)
		colorDesert    (0.352, 0.242, 0.179, 0.000)
		colorLowland   (0.386, 0.258, 0.203, 0.000)
		colorUpland    (0.428, 0.313, 0.247, 0.000)
		colorRock      (0.462, 0.340, 0.266, 0.000)
		colorSnow      (0.504, 0.362, 0.281, 1.000)
		BumpHeight      1.28482
		BumpOffset      0.256964
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.185697
		Period          0.981164
		Eccentricity    0.0929675
		Inclination     4.83396
		AscendingNode   74.7095
		ArgOfPericenter -124.004
		MeanAnomaly     -17.3114
	}
}

Asteroid	"S182"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.96224e-008
	Radius          18.2374
	InertiaMoment   0.39654

	RotationPeriod  1234.95
	Obliquity       -0.423581
	EqAscendNode    -38.9122

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.484 0.475 0.470)

	Surface
	{
		SurfStyle       0.347701
		OceanStyle      0.484233
		Randomize      (-0.070, -0.457, -0.412)
		colorDistMagn   0.306082
		colorDistFreq   0.0615366
		detailScale     498.004
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0366442
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565044
		terraceProb     0.698679
		erosion         0
		montesMagn      0.504092
		montesFreq      2.94844
		montesSpiky     0.967547
		montesFraction  0.640641
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.674676
		hillsFraction   0.682423
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210262
		craterFreq      0.189831
		craterDensity   0.861905
		craterOctaves   11.7395
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   20.4124
		volcanoTemp     1540.14
		lavaCoverTidal  0
		lavaCoverSun    0.011489
		lavaCoverYoung  0
		colorSea       (0.194, 0.190, 0.188, 0.000)
		colorShelf     (0.206, 0.202, 0.200, 0.000)
		colorBeach     (0.218, 0.214, 0.212, 0.000)
		colorDesert    (0.230, 0.226, 0.223, 0.000)
		colorLowland   (0.242, 0.238, 0.235, 0.000)
		colorUpland    (0.254, 0.249, 0.247, 0.000)
		colorRock      (0.266, 0.261, 0.259, 0.000)
		colorSnow      (0.278, 0.273, 0.271, 1.000)
		BumpHeight      16.4137
		BumpOffset      3.28274
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.183237
		Period          0.961732
		Eccentricity    0.107641
		Inclination     -1.77153
		AscendingNode   -43.2874
		ArgOfPericenter 8.38956
		MeanAnomaly     70.305
	}
}

Asteroid	"S183"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.14955e-016
	Radius          0.0374145
	InertiaMoment   0.398457

	RotationPeriod  5287.27
	Obliquity       0.370271
	EqAscendNode    -173.23

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.723 0.665 0.595)

	Surface
	{
		SurfStyle       0.121765
		OceanStyle      0.794127
		Randomize      (-0.914, 0.759, 0.118)
		colorDistMagn   0.543231
		colorDistFreq   6.35999e-007
		detailScale     1.02167
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00077204
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597489
		terraceProb     0.138047
		erosion         0
		montesMagn      0.568772
		montesFreq      3.22574
		montesSpiky     0.935031
		montesFraction  0.462885
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.93056e-006
		hillsFraction   0.532232
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235214
		craterFreq      0.204578
		craterDensity   0.86402
		craterOctaves   1.92676
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   547.12
		volcanoTemp     1486.29
		lavaCoverTidal  0
		lavaCoverSun    0.0194526
		lavaCoverYoung  0
		colorSea       (0.289, 0.266, 0.238, 0.000)
		colorShelf     (0.307, 0.283, 0.253, 0.000)
		colorBeach     (0.325, 0.299, 0.268, 0.000)
		colorDesert    (0.343, 0.316, 0.283, 0.000)
		colorLowland   (0.362, 0.333, 0.298, 0.000)
		colorUpland    (0.380, 0.349, 0.312, 0.000)
		colorRock      (0.398, 0.366, 0.327, 0.000)
		colorSnow      (0.416, 0.382, 0.342, 1.000)
		BumpHeight      0.0336731
		BumpOffset      0.00673462
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.175927
		Period          0.904755
		Eccentricity    0.153669
		Inclination     0.370271
		AscendingNode   -173.23
		ArgOfPericenter -96.9666
		MeanAnomaly     46.9136
	}
}

Asteroid	"S184"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.69163e-013
	Radius          0.332949
	InertiaMoment   0.399486

	Obliquity       0.185098
	EqAscendNode    -126.265
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.765 0.763 0.762)

	Surface
	{
		SurfStyle       0.270055
		OceanStyle      0.0398768
		Randomize      (-0.696, 0.051, 0.958)
		colorDistMagn   0.28704
		colorDistFreq   7.50352e-005
		detailScale     9.09171
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00292968
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.480236
		terraceProb     0.147201
		erosion         0
		montesMagn      0.629931
		montesFreq      3.96442
		montesSpiky     0.864525
		montesFraction  0.677745
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000312561
		hillsFraction   0.787273
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244592
		craterFreq      0.269187
		craterDensity   0.694934
		craterOctaves   5.8579
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   126.92
		volcanoTemp     1406.75
		lavaCoverTidal  0
		lavaCoverSun    0.0125396
		lavaCoverYoung  0
		colorSea       (0.306, 0.305, 0.305, 0.000)
		colorShelf     (0.325, 0.324, 0.324, 0.000)
		colorBeach     (0.344, 0.343, 0.343, 0.000)
		colorDesert    (0.363, 0.363, 0.362, 0.000)
		colorLowland   (0.382, 0.382, 0.381, 0.000)
		colorUpland    (0.402, 0.401, 0.400, 0.000)
		colorRock      (0.421, 0.420, 0.419, 0.000)
		colorSnow      (0.440, 0.439, 0.438, 1.000)
		BumpHeight      0.299654
		BumpOffset      0.0599307
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.168471
		Period          0.847855
		Eccentricity    0.0311421
		Inclination     0.185098
		AscendingNode   -126.265
		ArgOfPericenter -7.34255
		MeanAnomaly     -172.379
	}
}

Asteroid	"S185"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.48932e-010
	Radius          4.25372
	InertiaMoment   0.397148

	Obliquity       -4.49682
	EqAscendNode    -155.016
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.759 0.755 0.753)

	Surface
	{
		SurfStyle       0.089255
		OceanStyle      0.367272
		Randomize      (-0.754, -0.459, -0.417)
		colorDistMagn   0.356967
		colorDistFreq   0.00861999
		detailScale     116.155
		colorConversion true
		snowLevel       2
		tropicLatitude  0.033914
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.444329
		terraceProb     0.373413
		erosion         0
		montesMagn      0.538247
		montesFreq      2.98928
		montesSpiky     0.908937
		montesFraction  0.479824
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0410936
		hillsFraction   0.82031
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258643
		craterFreq      0.201545
		craterDensity   0.949477
		craterOctaves   9.78582
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.2702
		volcanoTemp     1551.03
		lavaCoverTidal  0
		lavaCoverSun    0.0113333
		lavaCoverYoung  0
		colorSea       (0.304, 0.302, 0.301, 0.000)
		colorShelf     (0.323, 0.321, 0.320, 0.000)
		colorBeach     (0.342, 0.340, 0.339, 0.000)
		colorDesert    (0.361, 0.359, 0.358, 0.000)
		colorLowland   (0.380, 0.377, 0.376, 0.000)
		colorUpland    (0.399, 0.396, 0.395, 0.000)
		colorRock      (0.418, 0.415, 0.414, 0.000)
		colorSnow      (0.437, 0.434, 0.433, 1.000)
		BumpHeight      3.82835
		BumpOffset      0.76567
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.18341
		Period          0.963089
		Eccentricity    0.106601
		Inclination     -4.49682
		AscendingNode   -155.016
		ArgOfPericenter 155.95
		MeanAnomaly     -68.1022
	}
}

Asteroid	"S186"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.66316e-007
	Radius          55.0433
	InertiaMoment   0.398684

	RotationPeriod  583.573
	Obliquity       11.3266
	EqAscendNode    -63.4416

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.509 0.504 0.502)

	Surface
	{
		SurfStyle       0.852093
		OceanStyle      0.75163
		Randomize      (-0.564, -0.127, 0.475)
		colorDistMagn   0.647369
		colorDistFreq   2.11206
		detailScale     1503.05
		colorConversion true
		snowLevel       2
		tropicLatitude  0.210177
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.434995
		terraceProb     0.478519
		erosion         0
		montesMagn      0.429442
		montesFreq      3.34652
		montesSpiky     0.963678
		montesFraction  0.503959
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.20297
		hillsFraction   0.701906
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.284648
		craterFreq      0.229715
		craterDensity   0.906708
		craterOctaves   13.5794
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   14.2588
		volcanoTemp     1517.55
		lavaCoverTidal  0
		lavaCoverSun    0.0159314
		lavaCoverYoung  0
		colorSea       (0.173, 0.177, 0.201, 0.050)
		colorShelf     (0.204, 0.207, 0.231, 0.040)
		colorBeach     (0.234, 0.237, 0.261, 0.030)
		colorDesert    (0.265, 0.267, 0.296, 0.020)
		colorLowland   (0.295, 0.298, 0.326, 0.030)
		colorUpland    (0.326, 0.328, 0.357, 0.050)
		colorRock      (0.356, 0.358, 0.397, 0.020)
		colorSnow      (0.356, 0.358, 0.397, 1.000)
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
		SemiMajorAxis   0.178852
		Period          0.927414
		Eccentricity    0.1348
		Inclination     2.65993
		AscendingNode   -78.5857
		ArgOfPericenter -42.9481
		MeanAnomaly     72.2218
	}
}

Asteroid	"S187"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.14602e-015
	Radius          0.0776521
	InertiaMoment   0.399666

	Obliquity       2.51771
	EqAscendNode    147.089
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.558 0.385)

	Surface
	{
		SurfStyle       0.925424
		OceanStyle      0.242218
		Randomize      (-0.252, 0.486, 0.102)
		colorDistMagn   0.722933
		colorDistFreq   2.00895e-006
		detailScale     2.12042
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0248861
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.455313
		terraceProb     0.171589
		erosion         0
		montesMagn      0.483133
		montesFreq      3.60255
		montesSpiky     0.959449
		montesFraction  0.382938
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.14682e-005
		hillsFraction   0.619739
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261034
		craterFreq      0.235746
		craterDensity   0.958439
		craterOctaves   2.88924
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   262.811
		volcanoTemp     1767.05
		lavaCoverTidal  0
		lavaCoverSun    0.0196135
		lavaCoverYoung  0
		colorSea       (0.222, 0.195, 0.154, 0.050)
		colorShelf     (0.262, 0.229, 0.177, 0.040)
		colorBeach     (0.301, 0.262, 0.200, 0.030)
		colorDesert    (0.340, 0.296, 0.227, 0.020)
		colorLowland   (0.379, 0.329, 0.251, 0.030)
		colorUpland    (0.418, 0.363, 0.274, 0.050)
		colorRock      (0.458, 0.396, 0.304, 0.020)
		colorSnow      (0.458, 0.396, 0.304, 1.000)
		BumpHeight      0.0698869
		BumpOffset      0.0139774
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.175802
		Period          0.903793
		Eccentricity    0.154487
		Inclination     2.51771
		AscendingNode   147.089
		ArgOfPericenter 162.47
		MeanAnomaly     -25.2121
	}
}

Asteroid	"S188"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            3.15797e-012
	Radius          0.992088
	InertiaMoment   0.397569

	Obliquity       -0.130263
	EqAscendNode    -58.6364
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.719 0.717 0.715)

	Surface
	{
		SurfStyle       0.37913
		OceanStyle      0.0618089
		Randomize      (-0.472, 0.418, 0.650)
		colorDistMagn   0.815725
		colorDistFreq   0.000571175
		detailScale     27.0906
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00396681
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.324276
		terraceProb     0.14406
		erosion         0
		montesMagn      0.549498
		montesFreq      4.18317
		montesSpiky     0.855639
		montesFraction  0.761834
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0029398
		hillsFraction   0.352375
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21752
		craterFreq      0.255739
		craterDensity   0.89179
		craterOctaves   6.76334
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   87.529
		volcanoTemp     1221.73
		lavaCoverTidal  0
		lavaCoverSun    0.0179465
		lavaCoverYoung  0
		colorSea       (0.288, 0.287, 0.286, 0.000)
		colorShelf     (0.305, 0.305, 0.304, 0.000)
		colorBeach     (0.323, 0.323, 0.322, 0.000)
		colorDesert    (0.341, 0.340, 0.339, 0.000)
		colorLowland   (0.359, 0.358, 0.357, 0.000)
		colorUpland    (0.377, 0.376, 0.375, 0.000)
		colorRock      (0.395, 0.394, 0.393, 0.000)
		colorSnow      (0.413, 0.412, 0.411, 1.000)
		BumpHeight      0.892879
		BumpOffset      0.178576
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.157002
		Period          0.762767
		Eccentricity    0.0159744
		Inclination     -0.130263
		AscendingNode   -58.6364
		ArgOfPericenter -21.8805
		MeanAnomaly     -69.2817
	}
}

Asteroid	"S189"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.64712e-009
	Radius          12.8402
	InertiaMoment   0.398896

	RotationPeriod  12704.8
	Obliquity       -3.25636
	EqAscendNode    -49.9032

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.786 0.784 0.781)

	Surface
	{
		SurfStyle       0.205167
		OceanStyle      0.00574592
		Randomize      (-0.920, 0.844, 0.040)
		colorDistMagn   0.579923
		colorDistFreq   0.0758965
		detailScale     350.623
		colorConversion true
		snowLevel       2
		tropicLatitude  0.102867
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.394406
		terraceProb     0.54585
		erosion         0
		montesMagn      0.493789
		montesFreq      4.05061
		montesSpiky     0.898361
		montesFraction  0.556893
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.390273
		hillsFraction   0.530238
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27835
		craterFreq      0.221367
		craterDensity   0.715644
		craterOctaves   11.751
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.5315
		volcanoTemp     1460.2
		lavaCoverTidal  0
		lavaCoverSun    0.0109777
		lavaCoverYoung  0
		colorSea       (0.314, 0.313, 0.312, 0.000)
		colorShelf     (0.334, 0.333, 0.332, 0.000)
		colorBeach     (0.354, 0.353, 0.351, 0.000)
		colorDesert    (0.373, 0.372, 0.371, 0.000)
		colorLowland   (0.393, 0.392, 0.391, 0.000)
		colorUpland    (0.412, 0.411, 0.410, 0.000)
		colorRock      (0.432, 0.431, 0.430, 0.000)
		colorSnow      (0.452, 0.451, 0.449, 1.000)
		BumpHeight      11.5562
		BumpOffset      2.31124
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.183809
		Period          0.966236
		Eccentricity    0.104196
		Inclination     -3.25636
		AscendingNode   -49.9032
		ArgOfPericenter 112.567
		MeanAnomaly     150.847
	}
}

Asteroid	"S190"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.72245e-017
	Radius          0.0181105
	InertiaMoment   0.399844

	RotationPeriod  11852.7
	Obliquity       -2.73087
	EqAscendNode    -63.6874

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.504 0.497 0.491)

	Surface
	{
		SurfStyle       0.998199
		OceanStyle      0.0846458
		Randomize      (0.846, 0.428, 0.007)
		colorDistMagn   0.251467
		colorDistFreq   1.16255e-007
		detailScale     0.494536
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0808809
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.521641
		terraceProb     0.315382
		erosion         0
		montesMagn      0.538969
		montesFreq      2.0018
		montesSpiky     0.842613
		montesFraction  0.844283
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.06703e-007
		hillsFraction   0.551825
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213371
		craterFreq      0.191255
		craterDensity   0
		craterOctaves   0.962338
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   544.196
		volcanoTemp     1500.77
		lavaCoverTidal  0
		lavaCoverSun    0.020012
		lavaCoverYoung  0
		colorSea       (0.171, 0.174, 0.196, 0.050)
		colorShelf     (0.201, 0.204, 0.226, 0.040)
		colorBeach     (0.232, 0.233, 0.255, 0.030)
		colorDesert    (0.262, 0.263, 0.290, 0.020)
		colorLowland   (0.292, 0.293, 0.319, 0.030)
		colorUpland    (0.322, 0.323, 0.349, 0.050)
		colorRock      (0.353, 0.353, 0.388, 0.020)
		colorSnow      (0.353, 0.353, 0.388, 1.000)
		BumpHeight      0.0162994
		BumpOffset      0.00325988
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.175496
		Period          0.901435
		Eccentricity    0.1565
		Inclination     -2.73087
		AscendingNode   -63.6874
		ArgOfPericenter 89.2165
		MeanAnomaly     3.26082
	}
}

Asteroid	"S191"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            4.00623e-014
	Radius          0.231381
	InertiaMoment   0.397903

	RotationPeriod  15705.2
	Obliquity       1.25497
	EqAscendNode    -55.5048

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.562 0.455 0.394)

	Surface
	{
		SurfStyle       0.692334
		OceanStyle      0.473889
		Randomize      (-0.564, -0.850, 0.793)
		colorDistMagn   0.938613
		colorDistFreq   4.45407e-005
		detailScale     6.31824
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0387581
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.40032
		terraceProb     0.519463
		erosion         0
		montesMagn      0.541069
		montesFreq      3.60566
		montesSpiky     0.990386
		montesFraction  0.570104
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00010698
		hillsFraction   0.835884
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245914
		craterFreq      0.209923
		craterDensity   0.743415
		craterOctaves   4.80263
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   181.245
		volcanoTemp     1303.31
		lavaCoverTidal  0
		lavaCoverSun    0.0209843
		lavaCoverYoung  0
		colorSea       (0.219, 0.155, 0.110, 0.000)
		colorShelf     (0.225, 0.159, 0.126, 0.000)
		colorBeach     (0.264, 0.186, 0.150, 0.000)
		colorDesert    (0.287, 0.200, 0.146, 0.000)
		colorLowland   (0.315, 0.214, 0.166, 0.000)
		colorUpland    (0.348, 0.259, 0.201, 0.000)
		colorRock      (0.377, 0.282, 0.217, 0.000)
		colorSnow      (0.410, 0.300, 0.229, 1.000)
		BumpHeight      0.208243
		BumpOffset      0.0416485
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.174767
		Period          0.895823
		Eccentricity    0.161325
		Inclination     1.25497
		AscendingNode   -55.5048
		ArgOfPericenter 18.4975
		MeanAnomaly     66.0391
	}
}

Asteroid	"S192"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.89538e-011
	Radius          2.99478
	InertiaMoment   0.399096

	RotationPeriod  20597.5
	Obliquity       0.363809
	EqAscendNode    143.969

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.560 0.411 0.329)

	Surface
	{
		SurfStyle       0.124685
		OceanStyle      0.0282699
		Randomize      (0.910, -0.227, 0.574)
		colorDistMagn   0.167422
		colorDistFreq   0.00517257
		detailScale     81.7775
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00392147
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.396794
		terraceProb     0.21154
		erosion         0
		montesMagn      0.569298
		montesFreq      3.60794
		montesSpiky     0.991607
		montesFraction  0.461712
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0200869
		hillsFraction   0.774352
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252182
		craterFreq      0.233144
		craterDensity   0.885857
		craterOctaves   8.75885
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   61.1526
		volcanoTemp     1365.18
		lavaCoverTidal  0
		lavaCoverSun    0.014198
		lavaCoverYoung  0
		colorSea       (0.224, 0.164, 0.132, 0.000)
		colorShelf     (0.238, 0.175, 0.140, 0.000)
		colorBeach     (0.252, 0.185, 0.148, 0.000)
		colorDesert    (0.266, 0.195, 0.156, 0.000)
		colorLowland   (0.280, 0.205, 0.164, 0.000)
		colorUpland    (0.294, 0.216, 0.173, 0.000)
		colorRock      (0.308, 0.226, 0.181, 0.000)
		colorSnow      (0.322, 0.236, 0.189, 1.000)
		BumpHeight      2.6953
		BumpOffset      0.53906
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.180454
		Period          0.939901
		Eccentricity    0.124727
		Inclination     0.363809
		AscendingNode   143.969
		ArgOfPericenter 140.454
		MeanAnomaly     -132.644
	}
}

Asteroid	"S193"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            8.67537e-008
	Radius          26.6466
	InertiaMoment   0.394689

	RotationPeriod  652.399
	Obliquity       5.8657
	EqAscendNode    -148.503

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.539 0.536 0.534)

	Surface
	{
		SurfStyle       0.889944
		OceanStyle      0.578069
		Randomize      (0.491, -0.451, -0.127)
		colorDistMagn   0.746733
		colorDistFreq   0.212852
		detailScale     727.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0594309
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629828
		terraceProb     0.528524
		erosion         0
		montesMagn      0.437863
		montesFreq      3.12802
		montesSpiky     0.933551
		montesFraction  0.882793
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.88048
		hillsFraction   0.537438
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204918
		craterFreq      0.194652
		craterDensity   0.911331
		craterOctaves   12.5372
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   14.1842
		volcanoTemp     1586.74
		lavaCoverTidal  0
		lavaCoverSun    0.0189055
		lavaCoverYoung  0
		colorSea       (0.183, 0.188, 0.214, 0.050)
		colorShelf     (0.216, 0.220, 0.246, 0.040)
		colorBeach     (0.248, 0.252, 0.278, 0.030)
		colorDesert    (0.280, 0.284, 0.315, 0.020)
		colorLowland   (0.313, 0.316, 0.347, 0.030)
		colorUpland    (0.345, 0.348, 0.379, 0.050)
		colorRock      (0.378, 0.380, 0.422, 0.020)
		colorSnow      (0.378, 0.380, 0.422, 1.000)
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
		SemiMajorAxis   0.176356
		Period          0.908071
		Eccentricity    0.150859
		Inclination     2.95075
		AscendingNode   -155.499
		ArgOfPericenter 62.4332
		MeanAnomaly     -113.338
	}
}

Asteroid	"S194"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            5.08235e-016
	Radius          0.0539639
	InertiaMoment   0.398187

	Obliquity       -4.45492
	EqAscendNode    157.909
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.529 0.521 0.516)

	Surface
	{
		SurfStyle       0.809966
		OceanStyle      0.102048
		Randomize      (-0.675, -0.398, -0.554)
		colorDistMagn   0.215023
		colorDistFreq   2.00631e-006
		detailScale     1.47357
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0297598
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578272
		terraceProb     0.136392
		erosion         0
		montesMagn      0.497947
		montesFreq      3.18
		montesSpiky     0.944736
		montesFraction  0.625114
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.67003e-006
		hillsFraction   0.761981
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21517
		craterFreq      0.20413
		craterDensity   0.851648
		craterOctaves   2.98725
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   375.298
		volcanoTemp     1389.54
		lavaCoverTidal  0
		lavaCoverSun    0.00223966
		lavaCoverYoung  0
		colorSea       (0.206, 0.177, 0.145, 0.000)
		colorShelf     (0.211, 0.182, 0.165, 0.000)
		colorBeach     (0.248, 0.213, 0.196, 0.000)
		colorDesert    (0.270, 0.229, 0.191, 0.000)
		colorLowland   (0.296, 0.245, 0.217, 0.000)
		colorUpland    (0.328, 0.297, 0.263, 0.000)
		colorRock      (0.354, 0.323, 0.284, 0.000)
		colorSnow      (0.386, 0.344, 0.299, 1.000)
		BumpHeight      0.0485675
		BumpOffset      0.0097135
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.195555
		Period          1.06032
		Eccentricity    0.00639151
		Inclination     -4.45492
		AscendingNode   157.909
		ArgOfPericenter -77.8109
		MeanAnomaly     13.9009
	}
}

Asteroid	"S195"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            7.47895e-013
	Radius          0.613802
	InertiaMoment   0.399287

	RotationPeriod  11239.4
	Obliquity       2.1865
	EqAscendNode    -138.987

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.544 0.537 0.534)

	Surface
	{
		SurfStyle       0.607495
		OceanStyle      0.122042
		Randomize      (0.517, 0.652, -0.574)
		colorDistMagn   0.896324
		colorDistFreq   5.20866e-005
		detailScale     16.7609
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0267285
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.71623
		terraceProb     0.458143
		erosion         0
		montesMagn      0.49058
		montesFreq      2.2784
		montesSpiky     0.906397
		montesFraction  0.438123
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00102998
		hillsFraction   0.674262
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251319
		craterFreq      0.253266
		craterDensity   0.869736
		craterOctaves   6.61693
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   111.279
		volcanoTemp     1333.45
		lavaCoverTidal  0
		lavaCoverSun    0.0292067
		lavaCoverYoung  0
		colorSea       (0.212, 0.182, 0.150, 0.000)
		colorShelf     (0.218, 0.188, 0.171, 0.000)
		colorBeach     (0.256, 0.220, 0.203, 0.000)
		colorDesert    (0.277, 0.236, 0.198, 0.000)
		colorLowland   (0.305, 0.252, 0.224, 0.000)
		colorUpland    (0.337, 0.306, 0.272, 0.000)
		colorRock      (0.364, 0.333, 0.294, 0.000)
		colorSnow      (0.397, 0.354, 0.310, 1.000)
		BumpHeight      0.552421
		BumpOffset      0.110484
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.169389
		Period          0.854795
		Eccentricity    0.198193
		Inclination     2.1865
		AscendingNode   -138.987
		ArgOfPericenter -71.0515
		MeanAnomaly     -7.4446
	}
}

Asteroid	"S196"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.10057e-009
	Radius          7.94435
	InertiaMoment   0.396477

	RotationPeriod  3424.99
	Obliquity       -1.15165
	EqAscendNode    -47.6683

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.741 0.740 0.737)

	Surface
	{
		SurfStyle       0.845593
		OceanStyle      0.178461
		Randomize      (-0.606, -0.422, -0.527)
		colorDistMagn   0.334758
		colorDistFreq   0.048322
		detailScale     216.934
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0447299
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.276894
		terraceProb     0.202309
		erosion         0
		montesMagn      0.546664
		montesFreq      4.13221
		montesSpiky     0.716213
		montesFraction  0.318429
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.16606
		hillsFraction   0.73689
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250437
		craterFreq      0.225315
		craterDensity   0.9086
		craterOctaves   10.9487
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.5454
		volcanoTemp     1848.23
		lavaCoverTidal  0
		lavaCoverSun    0.0024574
		lavaCoverYoung  0
		colorSea       (0.289, 0.251, 0.206, 0.000)
		colorShelf     (0.297, 0.259, 0.236, 0.000)
		colorBeach     (0.348, 0.303, 0.280, 0.000)
		colorDesert    (0.378, 0.325, 0.273, 0.000)
		colorLowland   (0.415, 0.348, 0.310, 0.000)
		colorUpland    (0.460, 0.422, 0.376, 0.000)
		colorRock      (0.497, 0.459, 0.406, 0.000)
		colorSnow      (0.541, 0.488, 0.428, 1.000)
		BumpHeight      7.14991
		BumpOffset      1.42998
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.197967
		Period          1.08
		Eccentricity    0.0252277
		Inclination     -1.64879
		AscendingNode   -48.2692
		ArgOfPericenter -1.49759
		MeanAnomaly     134.203
	}
}

Asteroid	"S197"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            6.44753e-018
	Radius          0.0112049
	InertiaMoment   0.398438

	RotationPeriod  19664.1
	Obliquity       3.372
	EqAscendNode    12.3773

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.574 0.570 0.567)

	Surface
	{
		SurfStyle       0.427839
		OceanStyle      0.318951
		Randomize      (-0.591, -0.350, -0.645)
		colorDistMagn   0.777019
		colorDistFreq   5.9472e-008
		detailScale     0.305968
		colorConversion true
		snowLevel       2
		tropicLatitude  0.116752
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.419784
		terraceProb     0.111302
		erosion         0
		montesMagn      0.580906
		montesFreq      2.18226
		montesSpiky     0.991346
		montesFraction  0.740112
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.20375e-007
		hillsFraction   0.822969
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260163
		craterFreq      0.146828
		craterDensity   0
		craterOctaves   0.961012
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   691.858
		volcanoTemp     1621.19
		lavaCoverTidal  0
		lavaCoverSun    0.0207236
		lavaCoverYoung  0
		colorSea       (0.230, 0.228, 0.227, 0.000)
		colorShelf     (0.244, 0.242, 0.241, 0.000)
		colorBeach     (0.258, 0.256, 0.255, 0.000)
		colorDesert    (0.273, 0.271, 0.269, 0.000)
		colorLowland   (0.287, 0.285, 0.283, 0.000)
		colorUpland    (0.302, 0.299, 0.298, 0.000)
		colorRock      (0.316, 0.313, 0.312, 0.000)
		colorSnow      (0.330, 0.327, 0.326, 1.000)
		BumpHeight      0.0100844
		BumpOffset      0.00201688
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.17496
		Period          0.897308
		Eccentricity    0.160043
		Inclination     3.372
		AscendingNode   12.3773
		ArgOfPericenter 169.473
		MeanAnomaly     -32.6958
	}
}

Asteroid	"S198"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            9.48788e-015
	Radius          0.143155
	InertiaMoment   0.399472

	RotationPeriod  24307.5
	Obliquity       2.88579
	EqAscendNode    5.6836

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.777 0.732 0.711)

	Surface
	{
		SurfStyle       0.610945
		OceanStyle      0.98746
		Randomize      (-0.863, -0.731, -0.668)
		colorDistMagn   0.876683
		colorDistFreq   2.93217e-006
		detailScale     3.90908
		colorConversion true
		snowLevel       2
		tropicLatitude  0.100439
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.689843
		terraceProb     0.341835
		erosion         0
		montesMagn      0.61725
		montesFreq      1.58191
		montesSpiky     0.85004
		montesFraction  0.565802
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.14096e-005
		hillsFraction   0.700623
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244982
		craterFreq      0.233399
		craterDensity   0.846488
		craterOctaves   3.87647
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   230.423
		volcanoTemp     1714.54
		lavaCoverTidal  0
		lavaCoverSun    0.0163811
		lavaCoverYoung  0
		colorSea       (0.303, 0.249, 0.199, 0.000)
		colorShelf     (0.311, 0.256, 0.227, 0.000)
		colorBeach     (0.365, 0.300, 0.270, 0.000)
		colorDesert    (0.396, 0.322, 0.263, 0.000)
		colorLowland   (0.435, 0.344, 0.299, 0.000)
		colorUpland    (0.482, 0.417, 0.362, 0.000)
		colorRock      (0.521, 0.454, 0.391, 0.000)
		colorSnow      (0.567, 0.483, 0.412, 1.000)
		BumpHeight      0.128839
		BumpOffset      0.0257678
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.178456
		Period          0.924332
		Eccentricity    0.137321
		Inclination     2.88579
		AscendingNode   5.6836
		ArgOfPericenter -130.36
		MeanAnomaly     -93.0563
	}
}

Asteroid	"S199"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            1.39619e-011
	Radius          1.85287
	InertiaMoment   0.39711

	Obliquity       -1.20938
	EqAscendNode    -123.774
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.536 0.483 0.428)

	Surface
	{
		SurfStyle       0.746078
		OceanStyle      0.788287
		Randomize      (0.809, -0.346, -0.486)
		colorDistMagn   0.465177
		colorDistFreq   0.00255706
		detailScale     50.5957
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0198901
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.468706
		terraceProb     0.409729
		erosion         0
		montesMagn      0.613679
		montesFreq      3.10948
		montesSpiky     0.861925
		montesFraction  0.380183
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00913882
		hillsFraction   0.467638
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256936
		craterFreq      0.254394
		craterDensity   0.901785
		craterOctaves   7.81154
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   77.746
		volcanoTemp     1474.04
		lavaCoverTidal  0
		lavaCoverSun    0.0124724
		lavaCoverYoung  0
		colorSea       (0.209, 0.164, 0.120, 0.000)
		colorShelf     (0.214, 0.169, 0.137, 0.000)
		colorBeach     (0.252, 0.198, 0.162, 0.000)
		colorDesert    (0.273, 0.213, 0.158, 0.000)
		colorLowland   (0.300, 0.227, 0.180, 0.000)
		colorUpland    (0.332, 0.275, 0.218, 0.000)
		colorRock      (0.359, 0.300, 0.235, 0.000)
		colorSnow      (0.391, 0.319, 0.248, 1.000)
		BumpHeight      1.66758
		BumpOffset      0.333516
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.178811
		Period          0.927096
		Eccentricity    0.0935221
		Inclination     -1.20938
		AscendingNode   -123.774
		ArgOfPericenter 134.164
		MeanAnomaly     137.986
	}
}

Asteroid	"S200"
{
	ParentBody     "WISE 08551-07144"
	Class	       "Asteroid"

	Mass            2.05457e-008
	Radius          16.4872
	InertiaMoment   0.398667

	RotationPeriod  1380.49
	Obliquity       -2.79557
	EqAscendNode    52.5541

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.693 0.610 0.482)

	Surface
	{
		SurfStyle       0.0980907
		OceanStyle      0.669127
		Randomize      (0.680, 0.847, -0.661)
		colorDistMagn   0.603203
		colorDistFreq   0.163809
		detailScale     450.211
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0883867
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436438
		terraceProb     0.111312
		erosion         0
		montesMagn      0.525104
		montesFreq      3.69917
		montesSpiky     0.882648
		montesFraction  0.333485
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.532106
		hillsFraction   0.673102
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220135
		craterFreq      0.214884
		craterDensity   0.865063
		craterOctaves   11.7417
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   18.034
		volcanoTemp     1185.52
		lavaCoverTidal  0
		lavaCoverSun    0.0113917
		lavaCoverYoung  0
		colorSea       (0.277, 0.244, 0.193, 0.000)
		colorShelf     (0.294, 0.259, 0.205, 0.000)
		colorBeach     (0.312, 0.274, 0.217, 0.000)
		colorDesert    (0.329, 0.290, 0.229, 0.000)
		colorLowland   (0.346, 0.305, 0.241, 0.000)
		colorUpland    (0.364, 0.320, 0.253, 0.000)
		colorRock      (0.381, 0.335, 0.265, 0.000)
		colorSnow      (0.398, 0.351, 0.277, 1.000)
		BumpHeight      14.8385
		BumpOffset      2.9677
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
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
		SemiMajorAxis   0.177512
		Period          0.917009
		Eccentricity    0.0718582
		Inclination     -2.8341
		AscendingNode   51.4751
		ArgOfPericenter 22.1285
		MeanAnomaly     -119.822
	}
}

