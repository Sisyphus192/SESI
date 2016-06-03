Star	"Lalande 21185"
{
	ParentBody     "Lalande 21185"
	Class	       "M2 V"
	Luminosity      0.00546046
	MassSol         0.196651
	RadSol          0.305242
	Teff            3580

	Age             10.8181

	InertiaMoment   0.0650153

	RotationPeriod  294.889
	Obliquity       57.7063
	EqAscendNode    192.61

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.564 0.272)

	Surface
	{
		Randomize      (-0.840, 0.469, 0.178)
		colorDistMagn   0.59084
		colorDistFreq   7.02969
		detailScale     546429
		colorConversion true
		tropicLatitude  0.5504
		icecapLatitude  1.0336
		mareFreq        18.5129
		mareDensity     0.0118743
		erosion         1
		montesFreq      537
		dunesMagn       0.548161
		hillsMagn       0.03
		hillsFreq       2140.92
		craterOctaves   0
		BumpHeight      412.346
		BumpOffset      412.346
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
		Height          2124.48
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
		Radius      1.26379e+006
		Period      0.0194441
		Brightness  0.5
		RayDensity  2.20976
		RayCurv     9.6336
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     57.7063
		AscendingNode   192.61
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Planet	"1"
{
	ParentBody     "Lalande 21185"
	Class	       "GasGiant"

	Mass            181.82
	Radius          68869.3
	InertiaMoment   0.190867

	Oblateness      0.00184403

	Obliquity       -1.09432
	EqAscendNode    21.3815
	TidalLocked     true

	AlbedoBond      0.504217
	AlbedoGeom      0.605061
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.20503
		Randomize      (-0.649, 0.366, 0.782)
		detailScale     177136
		colorConversion true
		tropicLatitude  0.0375276
		icecapLatitude  0.937528
		mainFreq        0.0274709
		venusFreq       3.31309
		venusMagn       0.426595
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.655113
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      5.05187
		twistMagn       0.60067
		cycloneMagn     10.3372
		cycloneFreq     0.413765
		cycloneDensity  0.111922
		cycloneOctaves  1
		colorLayer0    (0.810, 0.810, 0.810, 1.100)
		colorLayer1    (0.630, 0.650, 0.650, 0.800)
		colorLayer2    (0.580, 0.560, 0.580, 0.200)
		colorLayer3    (0.610, 0.610, 0.630, 0.050)
		colorLayer4    (0.720, 0.720, 0.720, 0.000)
		colorLayer5    (0.780, 0.780, 0.780, 0.000)
		colorLayer6    (0.540, 0.540, 0.560, 0.000)
		colorLayer7    (0.690, 0.660, 0.620, 1.000)
		colorLowPlants (0.720, 0.720, 0.720, 0.000)
		colorUpPlants  (0.780, 0.780, 0.780, 0.000)
		BumpHeight      16.0155
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          144.68
		BumpHeight      59.7306
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.47472
		mainOctaves     10
		Coverage        0.542175
		twistZones      5.05187
		twistMagn       0.60067
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          659.339
		Density         5416.58
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0370655
		Saturation      0.652786

		Composition
		{
			H2    	92.0956
			He    	7.54549
			CH4   	0.283172
			N2    	0.032668
			NH3   	0.0294692
			O2    	0.00676295
			C2H2  	0.00280604
			C2H4  	0.00132634
			Ne    	0.00104847
			Ar    	0.000733312
			C2H6  	0.000578324
			C3H8  	0.000352462
		}
	}

	Aurora
	{
		Height      2789.68
		NorthLat    82.4471
		NorthLon    -61.3824
		NorthRadius 16612.6
		NorthWidth  6260.6
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -81.7276
		SouthLon    122.552
		SouthRadius 15783.2
		SouthWidth  10076.4
		SouthRings  4
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
		SemiMajorAxis   0.0224968
		Period          0.0075986
		Eccentricity    0.021388
		Inclination     -1.09432
		AscendingNode   21.3815
		ArgOfPericenter 306.538
		MeanAnomaly     117.488
	}
}

DwarfMoon	"1.D1"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            9.6736e-011
	Radius          3.2254
	InertiaMoment   0.399581

	Oblateness      0.0358587

	Obliquity       0.0138011
	EqAscendNode    -56.4501
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.717 0.713 0.709)

	Surface
	{
		SurfStyle       0.496246
		OceanStyle      0.346489
		Randomize      (0.849, 0.934, -0.943)
		colorDistMagn   0.441777
		colorDistFreq   0.00280462
		detailScale     88.0749
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.59909
		terraceProb     0.118796
		erosion         0
		montesMagn      0.513033
		montesFreq      2.90334
		montesSpiky     0.935654
		montesFraction  0.805878
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0207928
		hillsFraction   0.599484
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240621
		craterFreq      0.233165
		craterDensity   0.868671
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.4156
		volcanoTemp     1459.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.285, 0.283, 0.000)
		colorShelf     (0.305, 0.303, 0.301, 0.000)
		colorBeach     (0.323, 0.321, 0.319, 0.000)
		colorDesert    (0.340, 0.339, 0.337, 0.000)
		colorLowland   (0.358, 0.356, 0.354, 0.000)
		colorUpland    (0.376, 0.374, 0.372, 0.000)
		colorRock      (0.394, 0.392, 0.390, 0.000)
		colorSnow      (0.412, 0.410, 0.407, 1.000)
		BumpHeight      2.90286
		BumpOffset      0.580572
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000867415
		Period          0.00109572
		Eccentricity    5.64355e-005
		Inclination     0.0138011
		AscendingNode   -56.4501
		ArgOfPericenter 2.68495
		MeanAnomaly     26.8357
	}
}

DwarfMoon	"1.D2"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            1.57196e-010
	Radius          8.3638
	InertiaMoment   0.397343

	Oblateness      0.249

	Obliquity       -0.012771
	EqAscendNode    -134.054
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.640 0.636 0.632)

	Surface
	{
		SurfStyle       0.0698351
		OceanStyle      0.542088
		Randomize      (0.727, -0.523, -0.272)
		colorDistMagn   0.269402
		colorDistFreq   0.0256429
		detailScale     228.387
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545608
		terraceProb     0.300255
		erosion         0
		montesMagn      0.519608
		montesFreq      3.58803
		montesSpiky     0.991961
		montesFraction  0.625527
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.139593
		hillsFraction   0.671302
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267519
		craterFreq      0.215042
		craterDensity   0.822085
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   104.59
		volcanoTemp     1411.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.255, 0.253, 0.000)
		colorShelf     (0.272, 0.270, 0.269, 0.000)
		colorBeach     (0.288, 0.286, 0.284, 0.000)
		colorDesert    (0.304, 0.302, 0.300, 0.000)
		colorLowland   (0.320, 0.318, 0.316, 0.000)
		colorUpland    (0.336, 0.334, 0.332, 0.000)
		colorRock      (0.352, 0.350, 0.348, 0.000)
		colorSnow      (0.368, 0.366, 0.363, 1.000)
		BumpHeight      7.52742
		BumpOffset      1.50548
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000907161
		Period          0.00117188
		Eccentricity    3.7439e-005
		Inclination     -0.012771
		AscendingNode   -134.054
		ArgOfPericenter -148.616
		MeanAnomaly     -89.1525
	}
}

DwarfMoon	"1.D3"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            2.4664e-010
	Radius          5.04687
	InertiaMoment   0.398756

	Oblateness      0.0449291

	Obliquity       0.014832
	EqAscendNode    36.9979
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.622 0.485 0.434)

	Surface
	{
		SurfStyle       0.824636
		OceanStyle      0.689521
		Randomize      (-0.812, 0.746, 0.110)
		colorDistMagn   0.960744
		colorDistFreq   0.00943381
		detailScale     137.813
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.601852
		terraceProb     0.366369
		erosion         0
		montesMagn      0.564217
		montesFreq      3.0428
		montesSpiky     0.98672
		montesFraction  0.853254
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0575393
		hillsFraction   0.576128
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277211
		craterFreq      0.181801
		craterDensity   0.994258
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   50.3844
		volcanoTemp     1487.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.165, 0.122, 0.000)
		colorShelf     (0.249, 0.170, 0.139, 0.000)
		colorBeach     (0.292, 0.199, 0.165, 0.000)
		colorDesert    (0.317, 0.214, 0.161, 0.000)
		colorLowland   (0.348, 0.228, 0.182, 0.000)
		colorUpland    (0.385, 0.277, 0.221, 0.000)
		colorRock      (0.416, 0.301, 0.239, 0.000)
		colorSnow      (0.454, 0.320, 0.252, 1.000)
		BumpHeight      4.54218
		BumpOffset      0.908436
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000920623
		Period          0.00119807
		Eccentricity    8.0211e-005
		Inclination     0.014832
		AscendingNode   36.9979
		ArgOfPericenter -139.074
		MeanAnomaly     -52.8267
	}
}

DwarfMoon	"1.D4"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            3.76319e-010
	Radius          5.4615
	InertiaMoment   0.399708

	Oblateness      0.0295727

	Obliquity       0.00977222
	EqAscendNode    32.2988
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.549 0.546 0.541)

	Surface
	{
		SurfStyle       0.130907
		OceanStyle      0.983093
		Randomize      (0.375, 0.721, -0.271)
		colorDistMagn   0.512473
		colorDistFreq   0.0169151
		detailScale     149.135
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.441642
		terraceProb     0.280155
		erosion         0
		montesMagn      0.527025
		montesFreq      3.16153
		montesSpiky     0.880758
		montesFraction  0.619654
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0655529
		hillsFraction   0.578991
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267868
		craterFreq      0.228773
		craterDensity   0.875962
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   44.1407
		volcanoTemp     1471.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.218, 0.216, 0.000)
		colorShelf     (0.233, 0.232, 0.230, 0.000)
		colorBeach     (0.247, 0.246, 0.243, 0.000)
		colorDesert    (0.261, 0.259, 0.257, 0.000)
		colorLowland   (0.274, 0.273, 0.271, 0.000)
		colorUpland    (0.288, 0.287, 0.284, 0.000)
		colorRock      (0.302, 0.300, 0.298, 0.000)
		colorSnow      (0.316, 0.314, 0.311, 1.000)
		BumpHeight      4.91535
		BumpOffset      0.983069
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000996023
		Period          0.00134822
		Eccentricity    2.87728e-005
		Inclination     0.00977222
		AscendingNode   32.2988
		ArgOfPericenter -55.7709
		MeanAnomaly     -92.6659
	}
}

DwarfMoon	"1.D5"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            5.61335e-010
	Radius          11.0006
	InertiaMoment   0.397619

	Oblateness      0.150038

	Obliquity       0.010263
	EqAscendNode    -63.2117
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.631 0.628)

	Surface
	{
		SurfStyle       0.687536
		OceanStyle      0.911287
		Randomize      (0.057, -0.378, -0.953)
		colorDistMagn   0.686158
		colorDistFreq   0.0605672
		detailScale     300.389
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.315639
		terraceProb     0.277269
		erosion         0
		montesMagn      0.651118
		montesFreq      2.73726
		montesSpiky     0.967778
		montesFraction  0.641176
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.354454
		hillsFraction   0.576672
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.283962
		craterFreq      0.233174
		craterDensity   0.924809
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   72.7964
		volcanoTemp     1307.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.214, 0.176, 0.000)
		colorShelf     (0.254, 0.221, 0.201, 0.000)
		colorBeach     (0.298, 0.259, 0.238, 0.000)
		colorDesert    (0.323, 0.277, 0.232, 0.000)
		colorLowland   (0.355, 0.296, 0.264, 0.000)
		colorUpland    (0.393, 0.359, 0.320, 0.000)
		colorRock      (0.425, 0.391, 0.345, 0.000)
		colorSnow      (0.463, 0.416, 0.364, 1.000)
		BumpHeight      9.9005
		BumpOffset      1.9801
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00101917
		Period          0.0013955
		Eccentricity    7.89898e-005
		Inclination     0.010263
		AscendingNode   -63.2117
		ArgOfPericenter 70.4419
		MeanAnomaly     -105.475
	}
}

Planet	"2"
{
	ParentBody     "Lalande 21185"
	Class	       "Desert"

	Mass            1.47578
	Radius          7897
	InertiaMoment   0.328968

	RotationPeriod  353.929
	Obliquity       -2.13294
	EqAscendNode    -131.724

	AlbedoBond      0.37812
	AlbedoGeom      0.453744
	Brightness      2
	Color          (0.478 0.469 0.466)

	Surface
	{
		SurfStyle       0.295442
		OceanStyle      0.0138223
		Randomize      (0.771, -0.592, -0.414)
		colorDistMagn   0.0525875
		colorDistFreq   1012.93
		detailScale     20311.5
		colorConversion true
		seaLevel        0.107074
		snowLevel       2
		tropicLatitude  0.0304368
		icecapLatitude  10
		icecapHeight    0.0866529
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.41629
		venusFreq       1.03858
		venusMagn       0.424656
		mareFreq        1.68204
		mareDensity     0.186003
		terraceProb     0.330877
		erosion         0
		montesMagn      0.252498
		montesFreq      448.184
		montesSpiky     0.906137
		montesFraction  0.464157
		dunesMagn       0.0711072
		dunesFreq       86.4033
		dunesFraction   0.537027
		hillsMagn       0.148759
		hillsFreq       928.71
		hillsFraction   0
		hills2Fraction  0
		riversMagn      54.4842
		riversFreq      3.57967
		riversSin       6.23379
		riversOctaves   0
		canyonsMagn     0.0343373
		canyonsFreq     216.816
		canyonFraction  0
		cracksMagn      0.0885749
		cracksFreq      0.888318
		cracksOctaves   0
		craterMagn      0.576666
		craterFreq      17.6922
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.68385
		volcanoFreq     3.70691
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.76662
		volcanoRadius   0.314839
		volcanoTemp     1892.43
		lavaCoverTidal  0.309416
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      1.87608
		twistMagn       0.735465
		cycloneMagn     2.92799
		cycloneFreq     0.268119
		cycloneDensity  0.00915584
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
		Height          29.25
		BumpHeight      6.10126
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.0443
		mainOctaves     10
		Coverage        0.356239
		twistZones      1.87608
		twistMagn       0.735465
	}

	Clouds
	{
		Height          48.5
		BumpHeight      6.75264
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.0443
		mainOctaves     10
		Coverage        0.356239
		twistZones      1.87608
		twistMagn       0.735465
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          155.258
		Density         91.6542
		Pressure        106.604
		Greenhouse      204.526
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.449653
		Saturation      0.998614

		Composition
		{
			CO2   	35.311
			SO2   	34.5029
			H2O   	28.3987
			N2    	1.7863
			Ne    	0.000665952
			CO    	0.000242595
			Ar    	0.000229677
		}
	}

	Aurora
	{
		Height      133.922
		NorthLat    45.7122
		NorthLon    117.454
		NorthRadius 2356.58
		NorthWidth  1735.6
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -37.7677
		SouthLon    323.118
		SouthRadius 1903.61
		SouthWidth  1599.57
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
		SemiMajorAxis   0.043115
		Period          0.0201878
		Eccentricity    0.0658797
		Inclination     -2.13294
		AscendingNode   -131.724
		ArgOfPericenter 260.858
		MeanAnomaly     160.952
	}
}

DwarfMoon	"2.D1"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            1.40591e-008
	Radius          16.5066
	InertiaMoment   0.395417

	Oblateness      0.249

	Obliquity       0.0118451
	EqAscendNode    122.302
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.558 0.442 0.318)

	Surface
	{
		SurfStyle       0.304658
		OceanStyle      0.937542
		Randomize      (0.420, -0.479, -0.878)
		colorDistMagn   0.542197
		colorDistFreq   0.0933027
		detailScale     450.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496004
		terraceProb     0.13612
		erosion         0
		montesMagn      0.377955
		montesFreq      3.19296
		montesSpiky     0.709448
		montesFraction  0.835768
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.414759
		hillsFraction   0.750068
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25477
		craterFreq      0.194817
		craterDensity   0.839393
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.8265
		volcanoTemp     1685.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.177, 0.127, 0.000)
		colorShelf     (0.237, 0.188, 0.135, 0.000)
		colorBeach     (0.251, 0.199, 0.143, 0.000)
		colorDesert    (0.265, 0.210, 0.151, 0.000)
		colorLowland   (0.279, 0.221, 0.159, 0.000)
		colorUpland    (0.293, 0.232, 0.167, 0.000)
		colorRock      (0.307, 0.243, 0.175, 0.000)
		colorSnow      (0.321, 0.254, 0.183, 1.000)
		BumpHeight      14.8559
		BumpOffset      2.97119
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.60638e-005
		Period          0.000315817
		Eccentricity    9.95698e-005
		Inclination     0.0118451
		AscendingNode   122.302
		ArgOfPericenter 46.8155
		MeanAnomaly     -154.467
	}
}

DwarfMoon	"2.D2"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            1.91153e-008
	Radius          22.8537
	InertiaMoment   0.398214

	Oblateness      0.2374

	Obliquity       0.010736
	EqAscendNode    -35.2176
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.794 0.776 0.742)

	Surface
	{
		SurfStyle       0.490398
		OceanStyle      0.890661
		Randomize      (0.894, 0.172, 0.977)
		colorDistMagn   0.726958
		colorDistFreq   0.38085
		detailScale     624.059
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.583481
		terraceProb     0.600374
		erosion         0
		montesMagn      0.41461
		montesFreq      2.29839
		montesSpiky     0.990505
		montesFraction  0.488983
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.900659
		hillsFraction   0.729239
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249548
		craterFreq      0.220597
		craterDensity   0.888057
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.9163
		volcanoTemp     1510.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.310, 0.297, 0.000)
		colorShelf     (0.337, 0.330, 0.315, 0.000)
		colorBeach     (0.357, 0.349, 0.334, 0.000)
		colorDesert    (0.377, 0.368, 0.352, 0.000)
		colorLowland   (0.397, 0.388, 0.371, 0.000)
		colorUpland    (0.417, 0.407, 0.389, 0.000)
		colorRock      (0.437, 0.427, 0.408, 0.000)
		colorSnow      (0.456, 0.446, 0.427, 1.000)
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
		SemiMajorAxis   0.000112743
		Period          0.00056991
		Eccentricity    4.88982e-005
		Inclination     0.010736
		AscendingNode   -35.2176
		ArgOfPericenter -100.469
		MeanAnomaly     154.131
	}
}

DwarfMoon	"2.D3"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            2.59528e-008
	Radius          42.501
	InertiaMoment   0.399288

	Oblateness      0.249

	Obliquity       -0.00613496
	EqAscendNode    -156.672
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.741 0.692 0.642)

	Surface
	{
		SurfStyle       0.283463
		OceanStyle      0.0346746
		Randomize      (-0.408, 0.504, 0.311)
		colorDistMagn   0.0359784
		colorDistFreq   0.686685
		detailScale     1160.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436923
		terraceProb     0.396342
		erosion         0
		montesMagn      0.551636
		montesFreq      2.23857
		montesSpiky     0.901683
		montesFraction  0.0850792
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.47135
		hillsFraction   0.904562
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235783
		craterFreq      0.198044
		craterDensity   0.867703
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.3631
		volcanoTemp     1105.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.277, 0.257, 0.000)
		colorShelf     (0.315, 0.294, 0.273, 0.000)
		colorBeach     (0.333, 0.311, 0.289, 0.000)
		colorDesert    (0.352, 0.329, 0.305, 0.000)
		colorLowland   (0.371, 0.346, 0.321, 0.000)
		colorUpland    (0.389, 0.363, 0.337, 0.000)
		colorRock      (0.408, 0.380, 0.353, 0.000)
		colorSnow      (0.426, 0.398, 0.369, 1.000)
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
		SemiMajorAxis   0.000145806
		Period          0.000838173
		Eccentricity    3.53198e-005
		Inclination     -0.00613496
		AscendingNode   -156.672
		ArgOfPericenter 0.197629
		MeanAnomaly     66.2935
	}
}

DwarfMoon	"2.D4"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            3.52164e-008
	Radius          24.3982
	InertiaMoment   0.396399

	Oblateness      0.0458115

	Obliquity       0.000250299
	EqAscendNode    -12.0749
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.648 0.646 0.642)

	Surface
	{
		SurfStyle       0.77357
		OceanStyle      0.718562
		Randomize      (-0.504, 0.007, -0.898)
		colorDistMagn   0.807731
		colorDistFreq   0.332633
		detailScale     666.234
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.598637
		terraceProb     0.443977
		erosion         0
		montesMagn      0.394028
		montesFreq      3.29108
		montesSpiky     0.903011
		montesFraction  0.618666
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.14452
		hillsFraction   0.441603
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237647
		craterFreq      0.232449
		craterDensity   0.867696
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   20.3841
		volcanoTemp     1541.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.220, 0.180, 0.000)
		colorShelf     (0.259, 0.226, 0.205, 0.000)
		colorBeach     (0.305, 0.265, 0.244, 0.000)
		colorDesert    (0.331, 0.284, 0.237, 0.000)
		colorLowland   (0.363, 0.304, 0.269, 0.000)
		colorUpland    (0.402, 0.368, 0.327, 0.000)
		colorRock      (0.434, 0.400, 0.353, 0.000)
		colorSnow      (0.473, 0.426, 0.372, 1.000)
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
		SemiMajorAxis   0.00016952
		Period          0.00105075
		Eccentricity    3.8818e-005
		Inclination     0.000250299
		AscendingNode   -12.0749
		ArgOfPericenter -162.952
		MeanAnomaly     -170.625
	}
}

DwarfMoon	"2.D5"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            4.78011e-008
	Radius          47.5302
	InertiaMoment   0.398393

	Oblateness      0.157047

	Obliquity       -0.00745372
	EqAscendNode    -67.5957
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.636 0.631 0.626)

	Surface
	{
		SurfStyle       0.710183
		OceanStyle      0.964963
		Randomize      (-0.060, 0.925, 0.135)
		colorDistMagn   0.57069
		colorDistFreq   1.1145
		detailScale     1297.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.712791
		terraceProb     0.325372
		erosion         0
		montesMagn      0.301036
		montesFreq      3.64449
		montesSpiky     0.873988
		montesFraction  0.661496
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.91505
		hillsFraction   0.651713
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229938
		craterFreq      0.191161
		craterDensity   0.898922
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.0845
		volcanoTemp     1609.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.214, 0.175, 0.000)
		colorShelf     (0.255, 0.221, 0.200, 0.000)
		colorBeach     (0.299, 0.259, 0.238, 0.000)
		colorDesert    (0.324, 0.277, 0.232, 0.000)
		colorLowland   (0.356, 0.296, 0.263, 0.000)
		colorUpland    (0.394, 0.359, 0.319, 0.000)
		colorRock      (0.426, 0.391, 0.344, 0.000)
		colorSnow      (0.464, 0.416, 0.363, 1.000)
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
		SemiMajorAxis   0.000198305
		Period          0.00132944
		Eccentricity    3.41791e-005
		Inclination     -0.00745372
		AscendingNode   -67.5957
		ArgOfPericenter -26.6939
		MeanAnomaly     176.966
	}
}

Moon	"2.1"
{
	ParentBody     "2"
	Class	       "Selena"

	Mass            0.0125495
	Radius          1546.68
	InertiaMoment   0.373574

	Oblateness      0.0186867

	Obliquity       0.993696
	EqAscendNode    60.8099
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.743 0.689 0.603)

	Surface
	{
		SurfStyle       0.988613
		OceanStyle      0.570326
		Randomize      (-0.978, -0.394, 0.261)
		colorDistMagn   0.0536216
		colorDistFreq   170.15
		detailScale     3978.16
		colorConversion true
		drivenDarkening 0
		seaLevel        0.191095
		snowLevel       2
		tropicLatitude  0.0299116
		icecapLatitude  10
		icecapHeight    0.240669
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.89449
		venusFreq       0.983318
		venusMagn       0
		mareFreq        0.795572
		mareDensity     0.00748068
		terraceProb     0.272157
		erosion         0
		montesMagn      0.081423
		montesFreq      91.1603
		montesSpiky     0.944095
		montesFraction  0.680936
		dunesMagn       0.0445104
		dunesFreq       2003.58
		dunesFraction   0.807614
		hillsMagn       0.146209
		hillsFreq       176.863
		hillsFraction   0.722546
		hills2Fraction  0
		riversMagn      56.8705
		riversFreq      1.52354
		riversSin       6.27525
		riversOctaves   0
		canyonsMagn     0.531818
		canyonsFreq     0.517424
		canyonFraction  0.595516
		cracksMagn      0.0577826
		cracksFreq      0.858151
		cracksOctaves   0
		craterMagn      0.616681
		craterFreq      4.49583
		craterDensity   0.465618
		craterOctaves   5.66633
		craterRayedFactor 0.0504188
		volcanoMagn     0.202719
		volcanoFreq     3.10244
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.281559
		volcanoRadius   0.559649
		volcanoTemp     1445.38
		lavaCoverTidal  0.538755
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.390, 0.400, 0.160, 0.000)
		colorShelf     (0.580, 0.550, 0.240, 0.000)
		colorBeach     (0.528, 0.469, 0.253, 0.000)
		colorDesert    (0.609, 0.524, 0.259, 0.000)
		colorLowland   (0.468, 0.379, 0.187, 0.000)
		colorUpland    (0.438, 0.351, 0.175, 0.000)
		colorRock      (0.330, 0.240, 0.130, 0.000)
		colorSnow      (0.900, 0.890, 0.760, 1.000)
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
		SemiMajorAxis   0.000199209
		Period          0.00133288
		Eccentricity    0.0366393
		Inclination     0.993696
		AscendingNode   60.8099
		ArgOfPericenter 49.2006
		MeanAnomaly     -125.334
	}
}

DwarfMoon	"2.D6"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            8.8457e-008
	Radius          35.5313
	InertiaMoment   0.396904

	Oblateness      0.00738398

	Obliquity       -11.2556
	EqAscendNode    -103.839
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.442 0.436 0.432)

	Surface
	{
		SurfStyle       0.556814
		OceanStyle      0.667505
		Randomize      (0.863, 0.023, 0.031)
		colorDistMagn   0.658233
		colorDistFreq   0.632973
		detailScale     970.242
		colorConversion true
		snowLevel       2
		tropicLatitude  0.239018
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.433984
		terraceProb     0.205689
		erosion         0
		montesMagn      0.477902
		montesFreq      3.2413
		montesSpiky     0.893578
		montesFraction  0.696267
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.20013
		hillsFraction   0.763971
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269415
		craterFreq      0.206228
		craterDensity   0.707678
		craterOctaves   13
		volcanoActivity 0.654402
		volcanoFlows    0
		volcanoRadius   18.7306
		volcanoTemp     1749.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.148, 0.121, 0.000)
		colorShelf     (0.177, 0.153, 0.138, 0.000)
		colorBeach     (0.208, 0.179, 0.164, 0.000)
		colorDesert    (0.225, 0.192, 0.160, 0.000)
		colorLowland   (0.247, 0.205, 0.181, 0.000)
		colorUpland    (0.274, 0.249, 0.220, 0.000)
		colorRock      (0.296, 0.270, 0.237, 0.000)
		colorSnow      (0.323, 0.288, 0.250, 1.000)
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
		SemiMajorAxis   0.000237547
		Period          0.00174298
		Eccentricity    0.276145
		Inclination     -11.2556
		AscendingNode   -103.839
		ArgOfPericenter -10.3047
		MeanAnomaly     -82.2865
	}
}

Planet	"3"
{
	ParentBody     "Lalande 21185"
	Class	       "GasGiant"

	Mass            1458.85
	Radius          77362
	InertiaMoment   0.228081

	RotationPeriod  772.847
	Obliquity       0.970445
	EqAscendNode    121.917

	AlbedoBond      0.4977
	AlbedoGeom      0.59724
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.477568
		Randomize      (0.261, -0.880, 0.082)
		detailScale     198979
		colorConversion true
		tropicLatitude  0.0164423
		icecapLatitude  0.916442
		mainFreq        0.0420394
		venusFreq       4.58138
		venusMagn       0.403438
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.302363
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      7.29567
		twistMagn       1.33241
		cycloneMagn     11.6675
		cycloneFreq     0.308765
		cycloneDensity  0.0864074
		cycloneOctaves  2
		colorLayer0    (0.120, 0.200, 0.480, 1.100)
		colorLayer1    (0.330, 0.400, 0.720, 0.600)
		colorLayer2    (0.330, 0.400, 0.720, 0.100)
		colorLayer3    (0.600, 0.600, 0.600, 0.000)
		colorLayer4    (0.350, 0.430, 0.770, 0.000)
		colorLayer5    (0.470, 0.540, 0.850, 0.000)
		colorLayer6    (0.600, 0.650, 0.910, 0.000)
		colorLayer7    (0.990, 0.990, 1.000, 1.000)
		colorLowPlants (0.350, 0.430, 0.770, 0.000)
		colorUpPlants  (0.470, 0.540, 0.850, 0.000)
		BumpHeight      6.35124
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          25.7109
		BumpHeight      57.4687
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.32536
		mainOctaves     10
		Coverage        0.477003
		twistZones      7.29567
		twistMagn       1.33241
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          103.151
		Density         5444.98
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0262542
		Saturation      0.540257

		Composition
		{
			H2    	92.1946
			He    	7.34522
			CH4   	0.372377
			N2    	0.0422903
			NH3   	0.0296699
			O2    	0.00735167
			C2H2  	0.00397302
			C2H4  	0.00140776
			Ne    	0.00128243
			Ar    	0.000874627
			C2H6  	0.000645602
			C3H8  	0.000337512
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0879101
		Period          0.0581363
		Eccentricity    0.0843361
		Inclination     0.970445
		AscendingNode   121.917
		ArgOfPericenter 311.501
		MeanAnomaly     289.967
	}
}

Moon	"3.1"
{
	ParentBody     "3"
	Class	       "Desert"

	Mass            8.04822
	Radius          11067.2
	InertiaMoment   0.329942

	Oblateness      0.0101212

	Obliquity       -0.218875
	EqAscendNode    24.2303
	TidalLocked     true

	AlbedoBond      0.7
	AlbedoGeom      0.84
	Brightness      2
	Color          (0.770 0.721 0.691)

	Surface
	{
		SurfStyle       0.117597
		OceanStyle      0.549486
		Randomize      (-0.643, 0.554, 0.189)
		colorDistMagn   0.0440949
		colorDistFreq   1366.35
		detailScale     28465.6
		colorConversion true
		seaLevel        0.124564
		snowLevel       2
		tropicLatitude  0.00746921
		icecapLatitude  10
		icecapHeight    0.29556
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.528533
		venusFreq       0.793306
		venusMagn       0
		mareFreq        1.31739
		mareDensity     0.201986
		terraceProb     0.394381
		erosion         0
		montesMagn      0.211651
		montesFreq      541.306
		montesSpiky     0.989459
		montesFraction  0.59129
		dunesMagn       0.0541767
		dunesFreq       119.332
		dunesFraction   0.0525051
		hillsMagn       0.123448
		hillsFreq       1071.46
		hillsFraction   0
		hills2Fraction  0
		riversMagn      63.2132
		riversFreq      3.28654
		riversSin       6.72461
		riversOctaves   0
		canyonsMagn     0.0609496
		canyonsFreq     277.939
		canyonFraction  0
		cracksMagn      0.110616
		cracksFreq      0.79758
		cracksOctaves   0
		craterMagn      0.951289
		craterFreq      30.3285
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.65083
		volcanoFreq     2.6131
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.8823
		volcanoRadius   0.217758
		volcanoTemp     1838.32
		lavaCoverTidal  0.998806
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      2.60592
		twistMagn       0
		cycloneMagn     2.74893
		cycloneFreq     0.317465
		cycloneDensity  0.00871731
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
		BumpHeight      12.2328
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
		Height          43.8477
		BumpHeight      5.07214
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.897012
		mainOctaves     10
		Coverage        1
		twistZones      2.60592
		twistMagn       0
	}

	Clouds
	{
		Height          81.5801
		BumpHeight      5.91843
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.897012
		mainOctaves     10
		Coverage        1
		twistZones      2.60592
		twistMagn       0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          268.728
		Density         118.736
		Pressure        562.061
		Greenhouse      456.966
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.478547
		Saturation      0.557094

		Composition
		{
			H2O   	57.1764
			CO2   	40.4737
			SO2   	1.93582
			N2    	0.409231
			CO    	0.00443098
			Ne    	0.000238975
			Ar    	0.000156729
			He    	1.35386e-005
		}
	}

	Aurora
	{
		Height      227.552
		NorthLat    75.2458
		NorthLon    -37.0672
		NorthRadius 2425.19
		NorthWidth  2936.79
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    144.898
		SouthRadius 3485.32
		SouthWidth  3364.32
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
		SemiMajorAxis   0.00191238
		Period          0.00126282
		Eccentricity    0.0168132
		Inclination     -0.218875
		AscendingNode   24.2303
		ArgOfPericenter 50.9168
		MeanAnomaly     90.9461
	}
}

DwarfMoon	"3.D1"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            3.57044e-006
	Radius          111.89
	InertiaMoment   0.397745

	Oblateness      0.00683745

	Obliquity       31.8096
	EqAscendNode    34.7767
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.744 0.641 0.596)

	Surface
	{
		SurfStyle       0.453692
		OceanStyle      0.172353
		Randomize      (0.490, -0.822, 0.826)
		colorDistMagn   0.408484
		colorDistFreq   1.31473
		detailScale     3055.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.869484
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545869
		terraceProb     0.369727
		erosion         0
		montesMagn      0.506433
		montesFreq      2.90642
		montesSpiky     0.894186
		montesFraction  0.395992
		dunesFraction   0
		hillsMagn       0
		hillsFreq       26.8877
		hillsFraction   0.523067
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237729
		craterFreq      0.473097
		craterDensity   1.06041
		craterOctaves   15
		volcanoActivity 1.49077
		volcanoFlows    0
		volcanoRadius   9.28403
		volcanoTemp     1735.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.256, 0.239, 0.000)
		colorShelf     (0.316, 0.272, 0.253, 0.000)
		colorBeach     (0.335, 0.288, 0.268, 0.000)
		colorDesert    (0.353, 0.304, 0.283, 0.000)
		colorLowland   (0.372, 0.320, 0.298, 0.000)
		colorUpland    (0.391, 0.336, 0.313, 0.000)
		colorRock      (0.409, 0.352, 0.328, 0.000)
		colorSnow      (0.428, 0.368, 0.343, 1.000)
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
		SemiMajorAxis   0.00313629
		Period          0.00265949
		Eccentricity    0.301966
		Inclination     31.8096
		AscendingNode   34.7767
		ArgOfPericenter 131.238
		MeanAnomaly     145.543
	}
}

DwarfMoon	"3.D2"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            5.55249e-006
	Radius          224.338
	InertiaMoment   0.398979

	Oblateness      0.0255553

	Obliquity       63.2813
	EqAscendNode    89.8676
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.668 0.666 0.663)

	Surface
	{
		SurfStyle       0.255003
		OceanStyle      0.204871
		Randomize      (0.936, -0.063, -0.015)
		colorDistMagn   0.98262
		colorDistFreq   37.3741
		detailScale     6125.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979733
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489762
		terraceProb     0.148565
		erosion         0
		montesMagn      0.395724
		montesFreq      2.96032
		montesSpiky     0.971382
		montesFraction  0.586617
		dunesFraction   0
		hillsMagn       0
		hillsFreq       101.765
		hillsFraction   0.692612
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246331
		craterFreq      1.78405
		craterDensity   0.830616
		craterOctaves   16
		volcanoActivity 1.77843
		volcanoFlows    0
		volcanoRadius   14.9267
		volcanoTemp     1321.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.266, 0.265, 0.000)
		colorShelf     (0.284, 0.283, 0.282, 0.000)
		colorBeach     (0.301, 0.300, 0.298, 0.000)
		colorDesert    (0.317, 0.316, 0.315, 0.000)
		colorLowland   (0.334, 0.333, 0.331, 0.000)
		colorUpland    (0.351, 0.349, 0.348, 0.000)
		colorRock      (0.368, 0.366, 0.365, 0.000)
		colorSnow      (0.384, 0.383, 0.381, 1.000)
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
		SemiMajorAxis   0.00350278
		Period          0.00313902
		Eccentricity    0.171599
		Inclination     63.2813
		AscendingNode   89.8676
		ArgOfPericenter 141.726
		MeanAnomaly     57.9543
	}
}

DwarfMoon	"3.D3"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.73366e-011
	Radius          2.18302
	InertiaMoment   0.399898

	Oblateness      0.00119535

	Obliquity       -61.9149
	EqAscendNode    7.66232
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.803 0.719 0.675)

	Surface
	{
		SurfStyle       0.370308
		OceanStyle      0.912221
		Randomize      (-0.941, 0.445, -0.180)
		colorDistMagn   0.78391
		colorDistFreq   0.00209319
		detailScale     59.6109
		colorConversion true
		snowLevel       2
		tropicLatitude  0.835311
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479407
		terraceProb     0.448686
		erosion         0
		montesMagn      0.32338
		montesFreq      2.62963
		montesSpiky     0.840261
		montesFraction  0.363383
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0108787
		hillsFraction   0.689395
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251926
		craterFreq      0.233333
		craterDensity   0.876924
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   82.2017
		volcanoTemp     1604
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.288, 0.270, 0.000)
		colorShelf     (0.341, 0.306, 0.287, 0.000)
		colorBeach     (0.362, 0.324, 0.304, 0.000)
		colorDesert    (0.382, 0.342, 0.321, 0.000)
		colorLowland   (0.402, 0.359, 0.338, 0.000)
		colorUpland    (0.422, 0.377, 0.354, 0.000)
		colorRock      (0.442, 0.395, 0.371, 0.000)
		colorSnow      (0.462, 0.413, 0.388, 1.000)
		BumpHeight      1.96471
		BumpOffset      0.392943
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00408209
		Period          0.00394911
		Eccentricity    0.101733
		Inclination     -61.9149
		AscendingNode   7.66232
		ArgOfPericenter -145.133
		MeanAnomaly     129.945
	}
}

DwarfMoon	"3.D4"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            3.36671e-011
	Radius          4.60924
	InertiaMoment   0.397967

	Oblateness      0.00492706

	RotationPeriod  74.8068
	Obliquity       65.7738
	EqAscendNode    28.883

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.691 0.646 0.592)

	Surface
	{
		SurfStyle       0.552274
		OceanStyle      0.226591
		Randomize      (-0.244, 0.243, 0.216)
		colorDistMagn   0.455361
		colorDistFreq   0.0100261
		detailScale     125.863
		colorConversion true
		snowLevel       2
		tropicLatitude  0.828631
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.465588
		terraceProb     0.523361
		erosion         0
		montesMagn      0.50368
		montesFreq      2.65484
		montesSpiky     0.948139
		montesFraction  0.510098
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0626644
		hillsFraction   0.934531
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221373
		craterFreq      0.213353
		craterDensity   0.921242
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   124.547
		volcanoTemp     1568.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.220, 0.166, 0.000)
		colorShelf     (0.277, 0.226, 0.189, 0.000)
		colorBeach     (0.325, 0.265, 0.225, 0.000)
		colorDesert    (0.353, 0.284, 0.219, 0.000)
		colorLowland   (0.387, 0.304, 0.249, 0.000)
		colorUpland    (0.429, 0.368, 0.302, 0.000)
		colorRock      (0.463, 0.400, 0.325, 0.000)
		colorSnow      (0.505, 0.426, 0.343, 1.000)
		BumpHeight      4.14832
		BumpOffset      0.829664
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00429829
		Period          0.00426696
		Eccentricity    0.436716
		Inclination     65.7738
		AscendingNode   28.883
		ArgOfPericenter 174.785
		MeanAnomaly     58.0062
	}
}

DwarfMoon	"3.D5"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            6.0334e-011
	Radius          2.89617
	InertiaMoment   0.399118

	RotationPeriod  67.2684
	Obliquity       76.1881
	EqAscendNode    143.35

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.677 0.630 0.594)

	Surface
	{
		SurfStyle       0.724911
		OceanStyle      0.935174
		Randomize      (-0.967, -0.707, -0.373)
		colorDistMagn   0.908458
		colorDistFreq   0.00449325
		detailScale     79.0846
		colorConversion true
		snowLevel       2
		tropicLatitude  0.581473
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.708949
		terraceProb     0.442492
		erosion         0
		montesMagn      0.4566
		montesFreq      3.40074
		montesSpiky     0.975837
		montesFraction  0.807903
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0104134
		hillsFraction   0.495526
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245727
		craterFreq      0.168378
		craterDensity   1.03619
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   58.4586
		volcanoTemp     1071.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.214, 0.166, 0.000)
		colorShelf     (0.271, 0.220, 0.190, 0.000)
		colorBeach     (0.318, 0.258, 0.226, 0.000)
		colorDesert    (0.346, 0.277, 0.220, 0.000)
		colorLowland   (0.379, 0.296, 0.249, 0.000)
		colorUpland    (0.420, 0.359, 0.303, 0.000)
		colorRock      (0.454, 0.391, 0.326, 0.000)
		colorSnow      (0.495, 0.416, 0.344, 1.000)
		BumpHeight      2.60655
		BumpOffset      0.52131
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.004522
		Period          0.00460437
		Eccentricity    0.305167
		Inclination     76.1881
		AscendingNode   143.35
		ArgOfPericenter 94.6872
		MeanAnomaly     44.8385
	}
}

DwarfMoon	"3.D6"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.02021e-010
	Radius          6.0449
	InertiaMoment   0.3948

	Oblateness      0.00299956

	RotationPeriod  82.2289
	Obliquity       47.5408
	EqAscendNode    144.392

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.612 0.607 0.604)

	Surface
	{
		SurfStyle       0.930845
		OceanStyle      0.641928
		Randomize      (0.284, 0.046, -0.282)
		colorDistMagn   0.76414
		colorDistFreq   0.0316514
		detailScale     165.066
		colorConversion true
		snowLevel       2
		tropicLatitude  0.439524
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.635348
		terraceProb     0.124723
		erosion         0
		montesMagn      0.550385
		montesFreq      2.98223
		montesSpiky     0.984213
		montesFraction  0.597699
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.114325
		hillsFraction   0.590423
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219837
		craterFreq      0.186057
		craterDensity   0.874293
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   93.8319
		volcanoTemp     1757.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.213, 0.242, 0.050)
		colorShelf     (0.245, 0.249, 0.278, 0.040)
		colorBeach     (0.282, 0.285, 0.314, 0.030)
		colorDesert    (0.318, 0.322, 0.356, 0.020)
		colorLowland   (0.355, 0.358, 0.392, 0.030)
		colorUpland    (0.392, 0.395, 0.429, 0.050)
		colorRock      (0.428, 0.431, 0.477, 0.020)
		colorSnow      (0.428, 0.431, 0.477, 1.000)
		BumpHeight      5.44041
		BumpOffset      1.08808
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00516979
		Period          0.00562838
		Eccentricity    0.444361
		Inclination     47.5408
		AscendingNode   144.392
		ArgOfPericenter -155.875
		MeanAnomaly     132.777
	}
}

DwarfMoon	"3.D7"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.65104e-010
	Radius          4.69265
	InertiaMoment   0.398167

	Obliquity       20.2158
	EqAscendNode    -80.9495
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.776 0.772 0.770)

	Surface
	{
		SurfStyle       0.190239
		OceanStyle      0.0245228
		Randomize      (0.256, 0.084, -0.394)
		colorDistMagn   0.109206
		colorDistFreq   0.000847336
		detailScale     128.141
		colorConversion true
		snowLevel       2
		tropicLatitude  0.507237
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.573372
		terraceProb     0.107328
		erosion         0
		montesMagn      0.550362
		montesFreq      3.08747
		montesSpiky     0.979617
		montesFraction  0.361963
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0537287
		hillsFraction   0.541484
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.297607
		craterFreq      0.223183
		craterDensity   0.781952
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.2593
		volcanoTemp     1983.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.309, 0.308, 0.000)
		colorShelf     (0.330, 0.328, 0.327, 0.000)
		colorBeach     (0.349, 0.348, 0.347, 0.000)
		colorDesert    (0.369, 0.367, 0.366, 0.000)
		colorLowland   (0.388, 0.386, 0.385, 0.000)
		colorUpland    (0.408, 0.406, 0.404, 0.000)
		colorRock      (0.427, 0.425, 0.424, 0.000)
		colorSnow      (0.446, 0.444, 0.443, 1.000)
		BumpHeight      4.22339
		BumpOffset      0.844677
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00556512
		Period          0.00628618
		Eccentricity    0.371905
		Inclination     20.2158
		AscendingNode   -80.9495
		ArgOfPericenter 99.7696
		MeanAnomaly     154.895
	}
}

DwarfMoon	"3.D8"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            2.58206e-010
	Radius          9.14388
	InertiaMoment   0.399254

	RotationPeriod  385.656
	Obliquity       78.369
	EqAscendNode    -106.745

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.590 0.584 0.581)

	Surface
	{
		SurfStyle       0.929423
		OceanStyle      0.418336
		Randomize      (-0.963, 0.192, 0.536)
		colorDistMagn   0.518736
		colorDistFreq   0.0100932
		detailScale     249.689
		colorConversion true
		snowLevel       2
		tropicLatitude  0.948408
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597304
		terraceProb     0.280501
		erosion         0
		montesMagn      0.508683
		montesFreq      3.23096
		montesSpiky     0.918855
		montesFraction  0.201094
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.157475
		hillsFraction   0.860197
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244852
		craterFreq      0.206262
		craterDensity   0.739793
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   89.2181
		volcanoTemp     1483.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.204, 0.233, 0.050)
		colorShelf     (0.236, 0.239, 0.267, 0.040)
		colorBeach     (0.271, 0.275, 0.302, 0.030)
		colorDesert    (0.307, 0.310, 0.343, 0.020)
		colorLowland   (0.342, 0.345, 0.378, 0.030)
		colorUpland    (0.378, 0.380, 0.413, 0.050)
		colorRock      (0.413, 0.415, 0.459, 0.020)
		colorSnow      (0.413, 0.415, 0.459, 1.000)
		BumpHeight      8.22949
		BumpOffset      1.6459
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00616672
		Period          0.00733257
		Eccentricity    0.188604
		Inclination     78.369
		AscendingNode   -106.745
		ArgOfPericenter 143.874
		MeanAnomaly     -157.091
	}
}

DwarfMoon	"3.D9"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            3.92937e-010
	Radius          5.45433
	InertiaMoment   0.396226

	RotationPeriod  437.28
	Obliquity       52.0125
	EqAscendNode    -63.0298

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.550 0.542 0.538)

	Surface
	{
		SurfStyle       0.467604
		OceanStyle      0.480916
		Randomize      (-0.253, 0.580, 0.818)
		colorDistMagn   0.454585
		colorDistFreq   0.0201306
		detailScale     148.939
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995274
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450816
		terraceProb     0.366529
		erosion         0
		montesMagn      0.525737
		montesFreq      3.09969
		montesSpiky     0.940657
		montesFraction  0.190177
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0575811
		hillsFraction   0.823636
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21782
		craterFreq      0.196293
		craterDensity   0.965216
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   43.1405
		volcanoTemp     1473.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.217, 0.215, 0.000)
		colorShelf     (0.234, 0.230, 0.229, 0.000)
		colorBeach     (0.247, 0.244, 0.242, 0.000)
		colorDesert    (0.261, 0.257, 0.256, 0.000)
		colorLowland   (0.275, 0.271, 0.269, 0.000)
		colorUpland    (0.289, 0.284, 0.283, 0.000)
		colorRock      (0.302, 0.298, 0.296, 0.000)
		colorSnow      (0.316, 0.312, 0.309, 1.000)
		BumpHeight      4.90889
		BumpOffset      0.981779
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00670544
		Period          0.00831411
		Eccentricity    0.213459
		Inclination     52.0125
		AscendingNode   -63.0298
		ArgOfPericenter 154.424
		MeanAnomaly     145.981
	}
}

DwarfMoon	"3.D10"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            5.84874e-010
	Radius          10.9588
	InertiaMoment   0.398349

	Oblateness      0.00735878

	Obliquity       -76.2102
	EqAscendNode    45.6629
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.768 0.766 0.764)

	Surface
	{
		SurfStyle       0.112023
		OceanStyle      0.494774
		Randomize      (-0.863, -0.761, 0.132)
		colorDistMagn   0.488205
		colorDistFreq   0.0750567
		detailScale     299.249
		colorConversion true
		snowLevel       2
		tropicLatitude  0.798229
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.542636
		terraceProb     0.126389
		erosion         0
		montesMagn      0.572098
		montesFreq      2.9956
		montesSpiky     0.900262
		montesFraction  0.478939
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.221131
		hillsFraction   0.82787
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247761
		craterFreq      0.252339
		craterDensity   0.795493
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   71.0459
		volcanoTemp     1538.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.306, 0.305, 0.000)
		colorShelf     (0.327, 0.326, 0.325, 0.000)
		colorBeach     (0.346, 0.345, 0.344, 0.000)
		colorDesert    (0.365, 0.364, 0.363, 0.000)
		colorLowland   (0.384, 0.383, 0.382, 0.000)
		colorUpland    (0.403, 0.402, 0.401, 0.000)
		colorRock      (0.423, 0.421, 0.420, 0.000)
		colorSnow      (0.442, 0.441, 0.439, 1.000)
		BumpHeight      9.86294
		BumpOffset      1.97259
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0071839
		Period          0.00921966
		Eccentricity    0.469927
		Inclination     -76.2102
		AscendingNode   45.6629
		ArgOfPericenter -15.8081
		MeanAnomaly     -8.35769
	}
}

DwarfMoon	"3.D11"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            8.54861e-010
	Radius          8.2476
	InertiaMoment   0.399387

	RotationPeriod  171.419
	Obliquity       -75.8546
	EqAscendNode    -27.2597

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.424 0.421 0.419)

	Surface
	{
		SurfStyle       0.208718
		OceanStyle      0.386323
		Randomize      (-0.304, -0.156, 0.896)
		colorDistMagn   0.0614634
		colorDistFreq   0.0371448
		detailScale     225.214
		colorConversion true
		snowLevel       2
		tropicLatitude  0.630578
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.76367
		terraceProb     0.182784
		erosion         0
		montesMagn      0.49508
		montesFreq      2.8736
		montesSpiky     0.975605
		montesFraction  0.631732
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.110167
		hillsFraction   0.789441
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240787
		craterFreq      0.169936
		craterDensity   0.91479
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   44.2268
		volcanoTemp     1467.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.168, 0.168, 0.000)
		colorShelf     (0.180, 0.179, 0.178, 0.000)
		colorBeach     (0.191, 0.189, 0.188, 0.000)
		colorDesert    (0.201, 0.200, 0.199, 0.000)
		colorLowland   (0.212, 0.210, 0.209, 0.000)
		colorUpland    (0.222, 0.221, 0.220, 0.000)
		colorRock      (0.233, 0.231, 0.230, 0.000)
		colorSnow      (0.244, 0.242, 0.241, 1.000)
		BumpHeight      7.42284
		BumpOffset      1.48457
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00747093
		Period          0.00977771
		Eccentricity    0.40187
		Inclination     -75.8546
		AscendingNode   -27.2597
		ArgOfPericenter -20.3459
		MeanAnomaly     -21.3073
	}
}

DwarfMoon	"3.D12"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.23076e-009
	Radius          15.4835
	InertiaMoment   0.396795

	Obliquity       86.579
	EqAscendNode    12.3024
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.509 0.369 0.306)

	Surface
	{
		SurfStyle       0.904281
		OceanStyle      0.390989
		Randomize      (0.044, 0.687, -0.523)
		colorDistMagn   0.396232
		colorDistFreq   0.0406794
		detailScale     422.804
		colorConversion true
		snowLevel       2
		tropicLatitude  0.243117
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.682583
		terraceProb     0.210221
		erosion         0
		montesMagn      0.344136
		montesFreq      3.32868
		montesSpiky     0.991051
		montesFraction  0.355212
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.451103
		hillsFraction   0.367554
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246545
		craterFreq      0.188956
		craterDensity   0.844035
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   69.1972
		volcanoTemp     1708.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.129, 0.122, 0.050)
		colorShelf     (0.203, 0.151, 0.141, 0.040)
		colorBeach     (0.234, 0.173, 0.159, 0.030)
		colorDesert    (0.265, 0.195, 0.180, 0.020)
		colorLowland   (0.295, 0.218, 0.199, 0.030)
		colorUpland    (0.326, 0.240, 0.217, 0.050)
		colorRock      (0.356, 0.262, 0.242, 0.020)
		colorSnow      (0.356, 0.262, 0.242, 1.000)
		BumpHeight      13.9352
		BumpOffset      2.78703
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00811231
		Period          0.0110635
		Eccentricity    0.344576
		Inclination     86.579
		AscendingNode   12.3024
		ArgOfPericenter 147.907
		MeanAnomaly     138.508
	}
}

DwarfPlanet	"4"
{
	ParentBody     "Lalande 21185"
	Class	       "Selena"

	Mass            0.00240772
	Radius          1106.57
	InertiaMoment   0.399301

	RotationPeriod  2612.45
	Obliquity       0.00572911
	EqAscendNode    175.311

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.542 0.440 0.365)

	Surface
	{
		SurfStyle       0.861492
		OceanStyle      0.567222
		Randomize      (-0.498, -0.534, 0.533)
		colorDistMagn   0.0509031
		colorDistFreq   141.558
		detailScale     2846.17
		colorConversion true
		drivenDarkening 0
		seaLevel        0.215515
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  4.34276
		icecapHeight    0.176329
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.02593
		venusFreq       0.993802
		venusMagn       0
		mareFreq        0.453747
		mareDensity     0.00124377
		terraceProb     0.342538
		erosion         0
		montesMagn      0.0772001
		montesFreq      51.5523
		montesSpiky     0.903643
		montesFraction  0.757065
		dunesMagn       0.0412344
		dunesFreq       1511.59
		dunesFraction   0.720346
		hillsMagn       0.13803
		hillsFreq       129.425
		hillsFraction   0.434358
		hills2Fraction  0
		riversMagn      64.4225
		riversFreq      2.76039
		riversSin       5.93749
		riversOctaves   0
		canyonsMagn     0.522859
		canyonsFreq     0.419402
		canyonFraction  0.76327
		cracksMagn      0.0717525
		cracksFreq      0.367278
		cracksOctaves   0
		craterMagn      0.658063
		craterFreq      3.58227
		craterDensity   0.86263
		craterOctaves   10
		craterRayedFactor 0.173083
		volcanoMagn     0.20491
		volcanoFreq     1.32062
		volcanoDensity  0.0647913
		volcanoOctaves  1
		volcanoActivity 0
		volcanoFlows    0.322829
		volcanoRadius   1.16735
		volcanoTemp     1471.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.303, 0.207, 0.153, 0.000)
		colorDesert    (0.276, 0.194, 0.135, 0.000)
		colorLowland   (0.211, 0.150, 0.102, 0.000)
		colorUpland    (0.358, 0.264, 0.190, 0.000)
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
		SemiMajorAxis   0.163449
		Period          0.149014
		Eccentricity    0.0958722
		Inclination     -3.31379
		AscendingNode   175.106
		ArgOfPericenter 1.09075
		MeanAnomaly     162.676
	}
}

Planet	"5"
{
	ParentBody     "Lalande 21185"
	Class	       "IceGiant"

	Mass            28.8538
	Radius          24351.5
	InertiaMoment   0.278122

	RotationPeriod  4487.31
	Obliquity       -0.8918
	EqAscendNode    -158.909

	AlbedoBond      0.488435
	AlbedoGeom      0.586122
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.84208
		Randomize      (-0.985, 0.695, 0.324)
		detailScale     62633.5
		colorConversion true
		tropicLatitude  0.00569427
		icecapLatitude  0.905694
		mainFreq        0.0153963
		venusFreq       4.55675
		venusMagn       0.36007
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      6.54507
		twistMagn       1.21805
		cycloneMagn     11.523
		cycloneFreq     0.31795
		cycloneDensity  0.0837158
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
		BumpHeight      14.2154
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          37.1445
		BumpHeight      64.9817
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.67687
		mainOctaves     10
		Coverage        0.442175
		twistZones      6.54507
		twistMagn       1.21805
	}

	Clouds
	{
		Height          60.0762
		BumpHeight      67.9898
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.67687
		mainOctaves     10
		Coverage        0.442175
		twistZones      6.54507
		twistMagn       1.21805
	}

	Clouds
	{
		Height          83.0059
		BumpHeight      69.5467
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.67687
		mainOctaves     10
		Coverage        0.442175
		twistZones      6.54507
		twistMagn       1.21805
	}

	Clouds
	{
		Height          105.936
		BumpHeight      50.4133
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.67687
		mainOctaves     10
		Coverage        0.442175
		twistZones      6.54507
		twistMagn       1.21805
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          243.515
		Density         3620.69
		Pressure        669420
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.00393686
		Saturation      0.663032

		Composition
		{
			H2    	92.3917
			He    	7.23368
			CH4   	0.319426
			N2    	0.0392554
			O2    	0.00847062
			C2H2  	0.0029829
			C2H4  	0.0012406
			Ne    	0.00112328
			Ar    	0.000936998
			C2H6  	0.000587554
			NH3   	0.000579734
			C3H8  	4.67642e-005
		}
	}

	NoAurora        true

	Rings
	{
		InnerRadius     37665.3
		OuterRadius     55649.8
		RotationPeriod  5.19834
		RotationOffset  0
		FrontBright     0.54936
		BackBright      0.573244
		Density         0.582491
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.264725
		Period          0.307079
		Eccentricity    0.0772961
		Inclination     -0.8918
		AscendingNode   -158.909
		ArgOfPericenter 243.394
		MeanAnomaly     222.255
	}
}

DwarfMoon	"5.D1"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            3.94962e-007
	Radius          106.796
	InertiaMoment   0.398072

	Oblateness      0.249

	Obliquity       -0.00903591
	EqAscendNode    -17.6825
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.477 0.417 0.374)

	Surface
	{
		SurfStyle       0.746854
		OceanStyle      0.912883
		Randomize      (0.265, 0.467, -0.501)
		colorDistMagn   0.446457
		colorDistFreq   4.79967
		detailScale     2916.23
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.485479
		terraceProb     0.102895
		erosion         0
		montesMagn      0.629681
		montesFreq      2.70045
		montesSpiky     0.953514
		montesFraction  0.332555
		dunesFraction   0
		hillsMagn       0
		hillsFreq       38.0358
		hillsFraction   0.555528
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224687
		craterFreq      0.385695
		craterDensity   1.01754
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.6429
		volcanoTemp     1584.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.142, 0.105, 0.000)
		colorShelf     (0.191, 0.146, 0.120, 0.000)
		colorBeach     (0.224, 0.171, 0.142, 0.000)
		colorDesert    (0.243, 0.183, 0.139, 0.000)
		colorLowland   (0.267, 0.196, 0.157, 0.000)
		colorUpland    (0.296, 0.238, 0.191, 0.000)
		colorRock      (0.319, 0.258, 0.206, 0.000)
		colorSnow      (0.348, 0.275, 0.217, 1.000)
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
		SemiMajorAxis   0.000390231
		Period          0.000829966
		Eccentricity    6.46161e-007
		Inclination     -0.00903591
		AscendingNode   -17.6825
		ArgOfPericenter 58.0126
		MeanAnomaly     63.6538
	}
}

DwarfMoon	"5.D2"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            5.55223e-007
	Radius          114.756
	InertiaMoment   0.399189

	Oblateness      0.249

	Obliquity       0.00168453
	EqAscendNode    -145.196
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.567 0.557 0.554)

	Surface
	{
		SurfStyle       0.910667
		OceanStyle      0.623325
		Randomize      (0.449, 0.951, 0.555)
		colorDistMagn   0.663094
		colorDistFreq   3.20096
		detailScale     3133.6
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.296163
		terraceProb     0.547972
		erosion         0
		montesMagn      0.569396
		montesFreq      3.29647
		montesSpiky     0.954459
		montesFraction  0.381414
		dunesFraction   0
		hillsMagn       0
		hillsFreq       32.8155
		hillsFraction   0.674365
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208728
		craterFreq      0.438409
		craterDensity   0.761201
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.1461
		volcanoTemp     1212.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.195, 0.222, 0.050)
		colorShelf     (0.227, 0.229, 0.255, 0.040)
		colorBeach     (0.261, 0.262, 0.288, 0.030)
		colorDesert    (0.295, 0.295, 0.327, 0.020)
		colorLowland   (0.329, 0.329, 0.360, 0.030)
		colorUpland    (0.363, 0.362, 0.393, 0.050)
		colorRock      (0.397, 0.396, 0.438, 0.020)
		colorSnow      (0.397, 0.396, 0.438, 1.000)
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
		SemiMajorAxis   0.00043113
		Period          0.000963806
		Eccentricity    6.89537e-005
		Inclination     0.00168453
		AscendingNode   -145.196
		ArgOfPericenter -124.494
		MeanAnomaly     -44.5034
	}
}

DwarfMoon	"5.D3"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            7.88628e-007
	Radius          123.454
	InertiaMoment   0.395783

	Oblateness      0.249

	Obliquity       -0.000603987
	EqAscendNode    -80.7477
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.549 0.545 0.543)

	Surface
	{
		SurfStyle       0.44363
		OceanStyle      0.595708
		Randomize      (0.967, -0.456, -0.505)
		colorDistMagn   0.819839
		colorDistFreq   6.05407
		detailScale     3371.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.361436
		terraceProb     0.259783
		erosion         0
		montesMagn      0.47629
		montesFreq      2.22702
		montesSpiky     0.73456
		montesFraction  0.132667
		dunesFraction   0
		hillsMagn       0
		hillsFreq       39.9668
		hillsFraction   0.626787
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250235
		craterFreq      0.426882
		craterDensity   0.940025
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.7958
		volcanoTemp     1759.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.218, 0.217, 0.000)
		colorShelf     (0.233, 0.231, 0.231, 0.000)
		colorBeach     (0.247, 0.245, 0.244, 0.000)
		colorDesert    (0.261, 0.259, 0.258, 0.000)
		colorLowland   (0.274, 0.272, 0.271, 0.000)
		colorUpland    (0.288, 0.286, 0.285, 0.000)
		colorRock      (0.302, 0.300, 0.298, 0.000)
		colorSnow      (0.316, 0.313, 0.312, 1.000)
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
		SemiMajorAxis   0.000459254
		Period          0.00105964
		Eccentricity    9.97471e-005
		Inclination     -0.000603987
		AscendingNode   -80.7477
		ArgOfPericenter 41.8984
		MeanAnomaly     -55.7115
	}
}

DwarfMoon	"5.D4"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.13411e-006
	Radius          165.255
	InertiaMoment   0.398262

	Oblateness      0.249

	Obliquity       0.00506084
	EqAscendNode    -137.771
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.528 0.525 0.520)

	Surface
	{
		SurfStyle       0.0418334
		OceanStyle      0.894476
		Randomize      (-0.230, 0.761, 0.502)
		colorDistMagn   0.799498
		colorDistFreq   11.8531
		detailScale     4512.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5101
		terraceProb     0.216225
		erosion         0
		montesMagn      0.300809
		montesFreq      2.98361
		montesSpiky     0.825636
		montesFraction  0.656944
		dunesFraction   0
		hillsMagn       0
		hillsFreq       71.489
		hillsFraction   0.710878
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275489
		craterFreq      0.841762
		craterDensity   0.925942
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.3294
		volcanoTemp     1183.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.210, 0.208, 0.000)
		colorShelf     (0.224, 0.223, 0.221, 0.000)
		colorBeach     (0.238, 0.236, 0.234, 0.000)
		colorDesert    (0.251, 0.249, 0.247, 0.000)
		colorLowland   (0.264, 0.262, 0.260, 0.000)
		colorUpland    (0.277, 0.276, 0.273, 0.000)
		colorRock      (0.290, 0.289, 0.286, 0.000)
		colorSnow      (0.304, 0.302, 0.299, 1.000)
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
		SemiMajorAxis   0.000485036
		Period          0.00115011
		Eccentricity    4.3796e-005
		Inclination     0.00506084
		AscendingNode   -137.771
		ArgOfPericenter 22.7114
		MeanAnomaly     162.981
	}
}

DwarfMoon	"5.D5"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.65537e-006
	Radius          173.367
	InertiaMoment   0.399323

	RotationPeriod  308.075
	Obliquity       -13.9455
	EqAscendNode    40.289

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.722 0.592 0.491)

	Surface
	{
		SurfStyle       0.575841
		OceanStyle      0.524825
		Randomize      (-0.935, 0.467, -0.385)
		colorDistMagn   0.405721
		colorDistFreq   5.87287
		detailScale     4734.07
		colorConversion true
		snowLevel       2
		tropicLatitude  0.440777
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.601855
		terraceProb     0.284028
		erosion         0
		montesMagn      0.370064
		montesFreq      2.47983
		montesSpiky     0.966045
		montesFraction  0.175253
		dunesFraction   0
		hillsMagn       0
		hillsFreq       48.8454
		hillsFraction   0.871582
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228256
		craterFreq      1.20227
		craterDensity   0.956499
		craterOctaves   16
		volcanoActivity 0.377139
		volcanoFlows    0
		volcanoRadius   21.1263
		volcanoTemp     1491.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.201, 0.138, 0.000)
		colorShelf     (0.289, 0.207, 0.157, 0.000)
		colorBeach     (0.339, 0.243, 0.187, 0.000)
		colorDesert    (0.368, 0.260, 0.182, 0.000)
		colorLowland   (0.404, 0.278, 0.206, 0.000)
		colorUpland    (0.447, 0.337, 0.251, 0.000)
		colorRock      (0.483, 0.367, 0.270, 0.000)
		colorSnow      (0.527, 0.391, 0.285, 1.000)
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
		SemiMajorAxis   0.00257374
		Period          0.014058
		Eccentricity    0.491924
		Inclination     -13.9455
		AscendingNode   40.289
		ArgOfPericenter 47.2479
		MeanAnomaly     -85.4901
	}
}

DwarfMoon	"5.D6"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.45988e-006
	Radius          189.537
	InertiaMoment   0.396553

	Obliquity       -44.5241
	EqAscendNode    -89.1815
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.685 0.681 0.679)

	Surface
	{
		SurfStyle       0.973715
		OceanStyle      0.0255631
		Randomize      (0.425, -0.971, -0.612)
		colorDistMagn   0.982205
		colorDistFreq   20.6808
		detailScale     5175.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.865284
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481773
		terraceProb     0.250008
		erosion         0
		montesMagn      0.409831
		montesFreq      3.23748
		montesSpiky     0.909753
		montesFraction  0.738696
		dunesFraction   0
		hillsMagn       0
		hillsFreq       55.1254
		hillsFraction   0.688502
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25067
		craterFreq      0.881759
		craterDensity   0.884717
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   18.9471
		volcanoTemp     1612.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.238, 0.272, 0.050)
		colorShelf     (0.274, 0.279, 0.312, 0.040)
		colorBeach     (0.315, 0.320, 0.353, 0.030)
		colorDesert    (0.356, 0.361, 0.401, 0.020)
		colorLowland   (0.397, 0.402, 0.441, 0.030)
		colorUpland    (0.438, 0.442, 0.482, 0.050)
		colorRock      (0.480, 0.483, 0.537, 0.020)
		colorSnow      (0.480, 0.483, 0.537, 1.000)
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
		SemiMajorAxis   0.00290617
		Period          0.0168679
		Eccentricity    0.241106
		Inclination     -44.5241
		AscendingNode   -89.1815
		ArgOfPericenter 113.786
		MeanAnomaly     -155.498
	}
}

Moon	"5.1"
{
	ParentBody     "5"
	Class	       "IceWorld"

	Mass            3.73587e-006
	Radius          208.863
	InertiaMoment   0.398438

	Obliquity       69.5122
	EqAscendNode    -116.283
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.520 0.516 0.512)

	Surface
	{
		SurfStyle       0.719015
		OceanStyle      0.330404
		Randomize      (-0.401, 0.948, -0.993)
		colorDistMagn   0.0432542
		colorDistFreq   27.0276
		detailScale     537.209
		colorConversion true
		drivenDarkening -0.640343
		seaLevel        0.168562
		snowLevel       2
		tropicLatitude  0.859538
		icecapLatitude  1
		icecapHeight    0.168562
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.61692
		venusFreq       1.13136
		venusMagn       0.19041
		mareFreq        0
		mareDensity     1.73718e-006
		terraceProb     0.410047
		erosion         0
		montesMagn      0.0690731
		montesFreq      12.9725
		montesSpiky     0.959528
		montesFraction  0.0360428
		dunesMagn       0.0414168
		dunesFreq       279.72
		dunesFraction   0.378026
		hillsMagn       0.118217
		hillsFreq       26.0271
		hillsFraction   0.3094
		hills2Fraction  0.145571
		riversMagn      63.4789
		riversFreq      2.34281
		riversSin       7.23529
		riversOctaves   0
		canyonsMagn     0.472846
		canyonsFreq     0.0696522
		canyonFraction  0
		cracksMagn      0.073231
		cracksFreq      0.0693337
		cracksOctaves   0
		craterMagn      1.16041
		craterFreq      0.637758
		craterDensity   0.845634
		craterOctaves   8
		craterRayedFactor 0.332498
		volcanoMagn     0.219206
		volcanoFreq     1.08615
		volcanoDensity  0.0596828
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.155409
		volcanoRadius   4.60046
		volcanoTemp     1405.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.333, 0.330, 0.343, 0.250)
		colorShelf     (0.364, 0.377, 0.389, 0.250)
		colorBeach     (0.297, 0.279, 0.297, 0.200)
		colorDesert    (0.276, 0.253, 0.261, 0.200)
		colorLowland   (0.203, 0.196, 0.215, 0.200)
		colorUpland    (0.385, 0.382, 0.389, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.203, 0.196, 0.215, 0.200)
		colorUpPlants  (0.385, 0.382, 0.389, 0.250)
		BumpHeight      10.4432
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
		SemiMajorAxis   0.0035589
		Period          0.0228587
		Eccentricity    0.00807822
		Inclination     69.5122
		AscendingNode   -116.283
		ArgOfPericenter 157.43
		MeanAnomaly     -168.846
	}
}

Moon	"5.2"
{
	ParentBody     "5"
	Class	       "IceWorld"

	Mass            5.82787e-006
	Radius          293.248
	InertiaMoment   0.399454

	RotationPeriod  654.922
	Obliquity       -83.8486
	EqAscendNode    31.5483

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.526 0.455 0.352)

	Surface
	{
		SurfStyle       0.950904
		OceanStyle      0.283023
		Randomize      (0.014, 0.252, 0.996)
		colorDistMagn   0.0693522
		colorDistFreq   38.9572
		detailScale     754.25
		colorConversion true
		drivenDarkening -0.604778
		seaLevel        0.230912
		snowLevel       2
		tropicLatitude  0.556374
		icecapLatitude  1
		icecapHeight    0.230912
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.99863
		venusFreq       1.19925
		venusMagn       0.205751
		mareFreq        0
		mareDensity     1.14999e-006
		terraceProb     0.233067
		erosion         0
		montesMagn      0.0518941
		montesFreq      13.2537
		montesSpiky     0.970646
		montesFraction  0.449686
		dunesMagn       0.0285363
		dunesFreq       385.47
		dunesFraction   0.321491
		hillsMagn       0.114476
		hillsFreq       32.0809
		hillsFraction   0.790175
		hills2Fraction  0.0520938
		riversMagn      64.5771
		riversFreq      3.24536
		riversSin       7.24274
		riversOctaves   0
		canyonsMagn     0.350304
		canyonsFreq     0.0943404
		canyonFraction  0
		cracksMagn      0.0382665
		cracksFreq      0.079517
		cracksOctaves   0
		craterMagn      0.893218
		craterFreq      0.985581
		craterDensity   0.886392
		craterOctaves   8
		craterRayedFactor 0.466081
		volcanoMagn     0.206394
		volcanoFreq     1.31293
		volcanoDensity  0.0547088
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.267487
		volcanoRadius   6.25127
		volcanoTemp     1577.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.400, 0.323, 0.204, 1.000)
		colorShelf     (0.400, 0.323, 0.204, 1.000)
		colorBeach     (0.368, 0.282, 0.176, 1.000)
		colorDesert    (0.368, 0.282, 0.176, 1.000)
		colorLowland   (0.447, 0.369, 0.268, 1.000)
		colorUpland    (0.468, 0.405, 0.303, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.447, 0.369, 0.268, 1.000)
		colorUpPlants  (0.468, 0.405, 0.303, 1.000)
		BumpHeight      14.6624
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
		SemiMajorAxis   0.00376819
		Period          0.0249044
		Eccentricity    0.109708
		Inclination     -83.8486
		AscendingNode   31.5483
		ArgOfPericenter 10.7914
		MeanAnomaly     173.343
	}
}

DwarfMoon	"5.D7"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.86835e-011
	Radius          3.91732
	InertiaMoment   0.397008

	RotationPeriod  450.388
	Obliquity       33.5146
	EqAscendNode    -134.986

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.825 0.774 0.688)

	Surface
	{
		SurfStyle       0.225206
		OceanStyle      0.140881
		Randomize      (-0.151, 0.789, -0.387)
		colorDistMagn   0.378861
		colorDistFreq   0.0097046
		detailScale     106.969
		colorConversion true
		snowLevel       2
		tropicLatitude  0.413167
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.474056
		terraceProb     0.306417
		erosion         0
		montesMagn      0.64357
		montesFreq      2.49083
		montesSpiky     0.960548
		montesFraction  0.267227
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.041299
		hillsFraction   0.518235
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276588
		craterFreq      0.14527
		craterDensity   0.794903
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   142.091
		volcanoTemp     1212.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.330, 0.310, 0.275, 0.000)
		colorShelf     (0.351, 0.329, 0.293, 0.000)
		colorBeach     (0.371, 0.348, 0.310, 0.000)
		colorDesert    (0.392, 0.368, 0.327, 0.000)
		colorLowland   (0.412, 0.387, 0.344, 0.000)
		colorUpland    (0.433, 0.406, 0.361, 0.000)
		colorRock      (0.454, 0.426, 0.379, 0.000)
		colorSnow      (0.474, 0.445, 0.396, 1.000)
		BumpHeight      3.52559
		BumpOffset      0.705117
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00434422
		Period          0.030828
		Eccentricity    0.155191
		Inclination     33.5146
		AscendingNode   -134.986
		ArgOfPericenter 65.7559
		MeanAnomaly     -69.0604
	}
}

DwarfMoon	"5.D8"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            3.59252e-011
	Radius          4.65909
	InertiaMoment   0.398602

	Obliquity       31.6667
	EqAscendNode    -128.558
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.756 0.754 0.751)

	Surface
	{
		SurfStyle       0.236462
		OceanStyle      0.471212
		Randomize      (-0.561, -0.084, 0.180)
		colorDistMagn   0.945097
		colorDistFreq   0.0088672
		detailScale     127.224
		colorConversion true
		snowLevel       2
		tropicLatitude  0.443685
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.638894
		terraceProb     0.520431
		erosion         0
		montesMagn      0.444967
		montesFreq      3.1261
		montesSpiky     0.919779
		montesFraction  0.595501
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0592732
		hillsFraction   0.683725
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242561
		craterFreq      0.195549
		craterDensity   0.913768
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   121.873
		volcanoTemp     1548.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.302, 0.301, 0.000)
		colorShelf     (0.321, 0.321, 0.319, 0.000)
		colorBeach     (0.340, 0.339, 0.338, 0.000)
		colorDesert    (0.359, 0.358, 0.357, 0.000)
		colorLowland   (0.378, 0.377, 0.376, 0.000)
		colorUpland    (0.397, 0.396, 0.394, 0.000)
		colorRock      (0.416, 0.415, 0.413, 0.000)
		colorSnow      (0.435, 0.434, 0.432, 1.000)
		BumpHeight      4.19318
		BumpOffset      0.838636
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00479077
		Period          0.0357014
		Eccentricity    0.209828
		Inclination     31.6667
		AscendingNode   -128.558
		ArgOfPericenter 123.766
		MeanAnomaly     -173.843
	}
}

DwarfMoon	"5.D9"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            6.39313e-011
	Radius          5.41875
	InertiaMoment   0.399582

	RotationPeriod  712.712
	Obliquity       -3.52935
	EqAscendNode    -34.9559

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.770 0.768 0.766)

	Surface
	{
		SurfStyle       0.807914
		OceanStyle      0.702884
		Randomize      (0.212, 0.935, -0.081)
		colorDistMagn   0.0586823
		colorDistFreq   0.0247636
		detailScale     147.968
		colorConversion true
		snowLevel       2
		tropicLatitude  0.117233
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366624
		terraceProb     0.270763
		erosion         0
		montesMagn      0.489474
		montesFreq      2.75809
		montesSpiky     0.941397
		montesFraction  0.728449
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0446424
		hillsFraction   0.800168
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260416
		craterFreq      0.172134
		craterDensity   0.920943
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   106.255
		volcanoTemp     1570.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.261, 0.214, 0.000)
		colorShelf     (0.308, 0.269, 0.245, 0.000)
		colorBeach     (0.362, 0.315, 0.291, 0.000)
		colorDesert    (0.392, 0.338, 0.283, 0.000)
		colorLowland   (0.431, 0.361, 0.322, 0.000)
		colorUpland    (0.477, 0.438, 0.391, 0.000)
		colorRock      (0.516, 0.476, 0.421, 0.000)
		colorSnow      (0.562, 0.507, 0.444, 1.000)
		BumpHeight      4.87687
		BumpOffset      0.975374
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00522407
		Period          0.0406529
		Eccentricity    0.260962
		Inclination     -3.52935
		AscendingNode   -34.9559
		ArgOfPericenter -160.575
		MeanAnomaly     165.4
	}
}

DwarfMoon	"5.D10"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.07542e-010
	Radius          8.30977
	InertiaMoment   0.397346

	RotationPeriod  593.482
	Obliquity       -88.5961
	EqAscendNode    -17.0116

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.770 0.654 0.591)

	Surface
	{
		SurfStyle       0.893924
		OceanStyle      0.427549
		Randomize      (0.088, -0.802, -0.111)
		colorDistMagn   0.567828
		colorDistFreq   0.0283037
		detailScale     226.912
		colorConversion true
		snowLevel       2
		tropicLatitude  0.296375
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615872
		terraceProb     0.127752
		erosion         0
		montesMagn      0.510541
		montesFreq      3.29104
		montesSpiky     0.883057
		montesFraction  0.432362
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.160639
		hillsFraction   0.758817
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251432
		craterFreq      0.205525
		craterDensity   0.727724
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   125.633
		volcanoTemp     1161.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.229, 0.236, 0.050)
		colorShelf     (0.308, 0.268, 0.272, 0.040)
		colorBeach     (0.354, 0.307, 0.307, 0.030)
		colorDesert    (0.401, 0.346, 0.349, 0.020)
		colorLowland   (0.447, 0.386, 0.384, 0.030)
		colorUpland    (0.493, 0.425, 0.420, 0.050)
		colorRock      (0.539, 0.464, 0.467, 0.020)
		colorSnow      (0.539, 0.464, 0.467, 1.000)
		BumpHeight      7.47879
		BumpOffset      1.49576
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00560141
		Period          0.0451361
		Eccentricity    0.368892
		Inclination     -88.5961
		AscendingNode   -17.0116
		ArgOfPericenter -79.1174
		MeanAnomaly     82.995
	}
}

DwarfMoon	"5.D11"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.73342e-010
	Radius          8.29669
	InertiaMoment   0.398758

	RotationPeriod  1732.39
	Obliquity       -42.2094
	EqAscendNode    171.737

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.711 0.705 0.702)

	Surface
	{
		SurfStyle       0.436775
		OceanStyle      0.844525
		Randomize      (-0.385, 0.592, 0.661)
		colorDistMagn   0.852075
		colorDistFreq   0.012413
		detailScale     226.555
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0966888
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.674665
		terraceProb     0.132604
		erosion         0
		montesMagn      0.382466
		montesFreq      3.16729
		montesSpiky     0.919623
		montesFraction  0.38218
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.179422
		hillsFraction   0.612062
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213699
		craterFreq      0.226652
		craterDensity   0.910429
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   98.8003
		volcanoTemp     1331.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.282, 0.281, 0.000)
		colorShelf     (0.302, 0.300, 0.299, 0.000)
		colorBeach     (0.320, 0.317, 0.316, 0.000)
		colorDesert    (0.338, 0.335, 0.334, 0.000)
		colorLowland   (0.356, 0.352, 0.351, 0.000)
		colorUpland    (0.373, 0.370, 0.369, 0.000)
		colorRock      (0.391, 0.388, 0.386, 0.000)
		colorSnow      (0.409, 0.405, 0.404, 1.000)
		BumpHeight      7.46702
		BumpOffset      1.4934
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00594945
		Period          0.0494075
		Eccentricity    0.399455
		Inclination     -42.2094
		AscendingNode   171.737
		ArgOfPericenter 61.6804
		MeanAnomaly     -4.80246
	}
}

DwarfMoon	"5.D12"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.70233e-010
	Radius          9.18093
	InertiaMoment   0.399709

	RotationPeriod  621.24
	Obliquity       51.229
	EqAscendNode    114.98

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.667 0.662 0.658)

	Surface
	{
		SurfStyle       0.842768
		OceanStyle      0.451983
		Randomize      (0.370, 0.229, -0.004)
		colorDistMagn   0.907453
		colorDistFreq   0.0493596
		detailScale     250.701
		colorConversion true
		snowLevel       2
		tropicLatitude  0.760926
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503851
		terraceProb     0.379225
		erosion         0
		montesMagn      0.456185
		montesFreq      3.271
		montesSpiky     0.959474
		montesFraction  0.36427
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.222417
		hillsFraction   0.586178
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243681
		craterFreq      0.153565
		craterDensity   0.968448
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   87.5637
		volcanoTemp     1535.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.225, 0.184, 0.000)
		colorShelf     (0.267, 0.232, 0.211, 0.000)
		colorBeach     (0.314, 0.271, 0.250, 0.000)
		colorDesert    (0.340, 0.291, 0.244, 0.000)
		colorLowland   (0.374, 0.311, 0.277, 0.000)
		colorUpland    (0.414, 0.377, 0.336, 0.000)
		colorRock      (0.447, 0.410, 0.362, 0.000)
		colorSnow      (0.487, 0.437, 0.382, 1.000)
		BumpHeight      8.26284
		BumpOffset      1.65257
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00624646
		Period          0.0531531
		Eccentricity    0.470259
		Inclination     51.229
		AscendingNode   114.98
		ArgOfPericenter -177.531
		MeanAnomaly     -22.8119
	}
}

DwarfMoon	"5.D13"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            4.1019e-010
	Radius          10.133
	InertiaMoment   0.397622

	Obliquity       -50.7657
	EqAscendNode    -85.4083
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.436 0.429 0.426)

	Surface
	{
		SurfStyle       0.256416
		OceanStyle      0.259389
		Randomize      (-0.587, 0.009, -0.585)
		colorDistMagn   0.851287
		colorDistFreq   0.0636559
		detailScale     276.699
		colorConversion true
		snowLevel       2
		tropicLatitude  0.935993
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.557673
		terraceProb     0.280623
		erosion         0
		montesMagn      0.627424
		montesFreq      3.64578
		montesSpiky     0.854621
		montesFraction  0.674324
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.274803
		hillsFraction   0.635755
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261726
		craterFreq      0.193064
		craterDensity   0.852194
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   78.4428
		volcanoTemp     1728.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.172, 0.171, 0.000)
		colorShelf     (0.185, 0.183, 0.181, 0.000)
		colorBeach     (0.196, 0.193, 0.192, 0.000)
		colorDesert    (0.207, 0.204, 0.203, 0.000)
		colorLowland   (0.218, 0.215, 0.213, 0.000)
		colorUpland    (0.229, 0.225, 0.224, 0.000)
		colorRock      (0.240, 0.236, 0.235, 0.000)
		colorSnow      (0.251, 0.247, 0.245, 1.000)
		BumpHeight      9.11973
		BumpOffset      1.82395
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00661186
		Period          0.0578846
		Eccentricity    0.0101007
		Inclination     -50.7657
		AscendingNode   -85.4083
		ArgOfPericenter -111.234
		MeanAnomaly     -165.129
	}
}

Planet	"6"
{
	ParentBody     "Lalande 21185"
	Class	       "IceWorld"

	Mass            0.0743581
	Radius          3133.9
	InertiaMoment   0.333935

	Oblateness      0.00364999

	RotationPeriod  29.109
	Obliquity       -14.9951
	EqAscendNode    -104.745

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.529 0.420 0.360)

	Surface
	{
		SurfStyle       0.174449
		OceanStyle      0.858649
		Randomize      (-0.453, -0.106, -0.998)
		colorDistMagn   0.0776766
		colorDistFreq   382.619
		detailScale     8060.57
		colorConversion true
		drivenDarkening 0
		seaLevel        0.139232
		snowLevel       2
		tropicLatitude  0.267473
		icecapLatitude  0.753222
		icecapHeight    0.151264
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.91302
		venusFreq       0.393084
		venusMagn       0.212754
		mareFreq        2.0603
		mareDensity     0.0138917
		terraceProb     0.258852
		erosion         0
		montesMagn      0.168854
		montesFreq      122.314
		montesSpiky     0.906969
		montesFraction  0.532542
		dunesMagn       0.0334603
		dunesFreq       4109.26
		dunesFraction   0.144713
		hillsMagn       0.129932
		hillsFreq       391.408
		hillsFraction   0.183412
		hills2Fraction  0.173164
		riversMagn      57.8053
		riversFreq      3.811
		riversSin       6.14081
		riversOctaves   0
		canyonsMagn     0.457366
		canyonsFreq     0.87347
		canyonFraction  0
		cracksMagn      0.0480483
		cracksFreq      1.32394
		cracksOctaves   4
		craterMagn      0.639741
		craterFreq      9.10544
		craterDensity   0.598945
		craterOctaves   7.93693
		craterRayedFactor 0.201687
		volcanoMagn     0.728932
		volcanoFreq     0.84288
		volcanoDensity  0.0684223
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.387591
		volcanoRadius   0.379694
		volcanoTemp     1650.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.529, 0.420, 0.360, 0.500)
		colorShelf     (0.503, 0.399, 0.342, 0.500)
		colorBeach     (0.370, 0.294, 0.252, 0.750)
		colorDesert    (0.450, 0.357, 0.306, 1.000)
		colorLowland   (0.466, 0.370, 0.317, 1.000)
		colorUpland    (0.492, 0.391, 0.334, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.466, 0.370, 0.317, 1.000)
		colorUpPlants  (0.492, 0.391, 0.334, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.685799
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          54.668
		Density         0.0314201
		Pressure        0.0103697
		Greenhouse      1.15823
		Bright          7.93307
		Opacity         1
		SkyLight        2.64436
		Hue             0.0390673
		Saturation      1

		Composition
		{
			N2    	99.9342
			Ar    	0.0423828
			CO    	0.0176857
			Kr    	0.00507184
			CO2   	0.000711028
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.576534
		Period          0.987165
		Eccentricity    0.062561
		Inclination     1.50263
		AscendingNode   -107.593
		ArgOfPericenter 349.634
		MeanAnomaly     69.7822
	}
}

DwarfMoon	"6.D1"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.10159e-008
	Radius          29.7437
	InertiaMoment   0.395432

	Oblateness      0.249

	Obliquity       0.0147642
	EqAscendNode    0.129528
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.428 0.424 0.422)

	Surface
	{
		SurfStyle       0.988862
		OceanStyle      0.647229
		Randomize      (-0.922, -0.643, 0.973)
		colorDistMagn   0.452022
		colorDistFreq   0.302399
		detailScale     812.201
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.351989
		terraceProb     0.477178
		erosion         0
		montesMagn      0.618631
		montesFreq      2.6887
		montesSpiky     0.872275
		montesFraction  0.283491
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.14108
		hillsFraction   0.841962
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218582
		craterFreq      0.231085
		craterDensity   1.03243
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   44.4314
		volcanoTemp     1624.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.145, 0.148, 0.169, 0.050)
		colorShelf     (0.171, 0.174, 0.194, 0.040)
		colorBeach     (0.197, 0.199, 0.219, 0.030)
		colorDesert    (0.222, 0.224, 0.249, 0.020)
		colorLowland   (0.248, 0.250, 0.274, 0.030)
		colorUpland    (0.274, 0.275, 0.300, 0.050)
		colorRock      (0.299, 0.301, 0.333, 0.020)
		colorSnow      (0.299, 0.301, 0.333, 1.000)
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
		SemiMajorAxis   6.10223e-005
		Period          0.00101099
		Eccentricity    9.47353e-005
		Inclination     0.0147642
		AscendingNode   0.129528
		ArgOfPericenter 92.1151
		MeanAnomaly     47.2671
	}
}

Moon	"6.1"
{
	ParentBody     "6"
	Class	       "IceWorld"

	Mass            0.000313631
	Radius          520.868
	InertiaMoment   0.398427

	Oblateness      0.00800048

	Obliquity       0.875119
	EqAscendNode    128.325
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.613 0.609 0.607)

	Surface
	{
		SurfStyle       0.197475
		OceanStyle      0.918211
		Randomize      (-0.379, -0.721, -0.874)
		colorDistMagn   0.0591432
		colorDistFreq   59.4861
		detailScale     1339.7
		colorConversion true
		drivenDarkening 0
		seaLevel        0.246428
		snowLevel       2
		tropicLatitude  0.0133138
		icecapLatitude  0.697658
		icecapHeight    0.258702
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.80071
		venusFreq       0.387182
		venusMagn       0.218882
		mareFreq        0
		mareDensity     0.000295893
		terraceProb     0.470904
		erosion         0
		montesMagn      0.0475003
		montesFreq      17.2913
		montesSpiky     0.975469
		montesFraction  0.910959
		dunesMagn       0.0331519
		dunesFreq       677.164
		dunesFraction   0.113236
		hillsMagn       0.100998
		hillsFreq       62.4511
		hillsFraction   0.529367
		hills2Fraction  0.0759639
		riversMagn      57.5374
		riversFreq      3.54284
		riversSin       5.04943
		riversOctaves   0
		canyonsMagn     0.728336
		canyonsFreq     0.189897
		canyonFraction  0
		cracksMagn      0.046055
		cracksFreq      0.283249
		cracksOctaves   0
		craterMagn      0.586392
		craterFreq      1.43392
		craterDensity   0.83081
		craterOctaves   9
		craterRayedFactor 0.183741
		volcanoMagn     0.208773
		volcanoFreq     1.52126
		volcanoDensity  0.0637429
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.248771
		volcanoRadius   1.75374
		volcanoTemp     1522.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.613, 0.609, 0.607, 0.500)
		colorShelf     (0.583, 0.579, 0.577, 0.500)
		colorBeach     (0.429, 0.427, 0.425, 0.750)
		colorDesert    (0.521, 0.518, 0.516, 1.000)
		colorLowland   (0.540, 0.536, 0.534, 1.000)
		colorUpland    (0.570, 0.567, 0.565, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.540, 0.536, 0.534, 1.000)
		colorUpPlants  (0.570, 0.567, 0.565, 1.000)
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
		SemiMajorAxis   0.000115824
		Period          0.00263815
		Eccentricity    0.00799128
		Inclination     0.875119
		AscendingNode   128.325
		ArgOfPericenter 17.7711
		MeanAnomaly     140.151
	}
}

Moon	"6.2"
{
	ParentBody     "6"
	Class	       "IceWorld"

	Mass            0.000363272
	Radius          628.505
	InertiaMoment   0.397695

	Oblateness      0.00265761

	Obliquity       -0.709431
	EqAscendNode    -35.5289
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.434 0.425 0.419)

	Surface
	{
		SurfStyle       0.499597
		OceanStyle      0.846774
		Randomize      (-0.999, -0.589, 0.661)
		colorDistMagn   0.0581812
		colorDistFreq   67.7912
		detailScale     1616.55
		colorConversion true
		drivenDarkening 0
		seaLevel        0.190416
		snowLevel       2
		tropicLatitude  0.0235804
		icecapLatitude  0.520157
		icecapHeight    0.226276
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.05829
		venusFreq       1.6569
		venusMagn       0.241067
		mareFreq        0.0237095
		mareDensity     0.000216141
		terraceProb     0.299518
		erosion         0
		montesMagn      0.0678964
		montesFreq      25.7352
		montesSpiky     0.856782
		montesFraction  0.622244
		dunesMagn       0.050027
		dunesFreq       819.935
		dunesFraction   0.395955
		hillsMagn       0.139069
		hillsFreq       71.4893
		hillsFraction   0.810519
		hills2Fraction  0.0221311
		riversMagn      63.1575
		riversFreq      3.15544
		riversSin       5.79396
		riversOctaves   0
		canyonsMagn     0.376858
		canyonsFreq     0.257336
		canyonFraction  0
		cracksMagn      0.0624353
		cracksFreq      0.299526
		cracksOctaves   0
		craterMagn      0.512124
		craterFreq      1.79172
		craterDensity   0.807184
		craterOctaves   9
		craterRayedFactor 0.051477
		volcanoMagn     0.201704
		volcanoFreq     0.846699
		volcanoDensity  0.0581862
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.157156
		volcanoRadius   1.09438
		volcanoTemp     1322.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.130, 0.106, 0.092, 0.000)
		colorShelf     (0.161, 0.132, 0.117, 0.000)
		colorBeach     (0.243, 0.200, 0.176, 0.200)
		colorDesert    (0.222, 0.187, 0.155, 0.500)
		colorLowland   (0.169, 0.145, 0.117, 0.800)
		colorUpland    (0.287, 0.255, 0.218, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.169, 0.145, 0.117, 0.800)
		colorUpPlants  (0.287, 0.255, 0.218, 1.000)
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
		SemiMajorAxis   0.000192021
		Period          0.00562965
		Eccentricity    0.0173281
		Inclination     -0.709431
		AscendingNode   -35.5289
		ArgOfPericenter 27.2148
		MeanAnomaly     50.4727
	}
}

DwarfMoon	"6.D2"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.76814e-008
	Radius          42.486
	InertiaMoment   0.396405

	RotationPeriod  2027.92
	Obliquity       -23.9701
	EqAscendNode    75.1516

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.405 0.402 0.398)

	Surface
	{
		SurfStyle       0.834708
		OceanStyle      0.0229293
		Randomize      (-0.074, 0.123, 0.581)
		colorDistMagn   0.253377
		colorDistFreq   1.13
		detailScale     1160.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.609667
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570824
		terraceProb     0.359263
		erosion         0
		montesMagn      0.412494
		montesFreq      2.3107
		montesSpiky     0.877129
		montesFraction  0.524393
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.83172
		hillsFraction   0.643372
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243202
		craterFreq      0.228949
		craterDensity   0.850064
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   40.0367
		volcanoTemp     1502.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.158, 0.137, 0.111, 0.000)
		colorShelf     (0.162, 0.141, 0.127, 0.000)
		colorBeach     (0.190, 0.165, 0.151, 0.000)
		colorDesert    (0.206, 0.177, 0.147, 0.000)
		colorLowland   (0.227, 0.189, 0.167, 0.000)
		colorUpland    (0.251, 0.229, 0.203, 0.000)
		colorRock      (0.271, 0.249, 0.219, 0.000)
		colorSnow      (0.295, 0.265, 0.231, 1.000)
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
		SemiMajorAxis   0.000780757
		Period          0.0462689
		Eccentricity    0.335717
		Inclination     -23.9701
		AscendingNode   75.1516
		ArgOfPericenter 109.717
		MeanAnomaly     123.023
	}
}

DwarfMoon	"6.D3"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.75617e-008
	Radius          45.0961
	InertiaMoment   0.398395

	Obliquity       -85.5004
	EqAscendNode    -98.4354
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.626 0.500 0.361)

	Surface
	{
		SurfStyle       0.139104
		OceanStyle      0.685679
		Randomize      (0.963, 0.558, -0.845)
		colorDistMagn   0.0669884
		colorDistFreq   1.13953
		detailScale     1231.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988389
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53163
		terraceProb     0.524425
		erosion         0
		montesMagn      0.422712
		montesFreq      2.4633
		montesSpiky     0.915204
		montesFraction  0.499778
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.04284
		hillsFraction   0.586545
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260922
		craterFreq      0.229555
		craterDensity   1.03569
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   36.4815
		volcanoTemp     1194.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.200, 0.144, 0.000)
		colorShelf     (0.266, 0.213, 0.153, 0.000)
		colorBeach     (0.282, 0.225, 0.162, 0.000)
		colorDesert    (0.297, 0.238, 0.171, 0.000)
		colorLowland   (0.313, 0.250, 0.181, 0.000)
		colorUpland    (0.329, 0.263, 0.190, 0.000)
		colorRock      (0.344, 0.275, 0.199, 0.000)
		colorSnow      (0.360, 0.288, 0.208, 1.000)
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
		SemiMajorAxis   0.00102578
		Period          0.0696786
		Eccentricity    0.323305
		Inclination     -85.5004
		AscendingNode   -98.4354
		ArgOfPericenter -97.2445
		MeanAnomaly     148.755
	}
}

DwarfMoon	"6.D4"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            5.09933e-008
	Radius          60.5472
	InertiaMoment   0.399421

	Obliquity       -24.0519
	EqAscendNode    -68.6543
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.420 0.416 0.411)

	Surface
	{
		SurfStyle       0.146682
		OceanStyle      0.177414
		Randomize      (-0.839, -0.246, -0.033)
		colorDistMagn   0.494028
		colorDistFreq   0.467142
		detailScale     1653.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.633882
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504043
		terraceProb     0.122633
		erosion         0
		montesMagn      0.480792
		montesFreq      3.3167
		montesSpiky     0.936418
		montesFraction  0.324789
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.0786
		hillsFraction   0.553226
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254342
		craterFreq      0.240599
		craterDensity   0.779526
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.0382
		volcanoTemp     1695.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.166, 0.164, 0.000)
		colorShelf     (0.179, 0.177, 0.175, 0.000)
		colorBeach     (0.189, 0.187, 0.185, 0.000)
		colorDesert    (0.200, 0.198, 0.195, 0.000)
		colorLowland   (0.210, 0.208, 0.205, 0.000)
		colorUpland    (0.221, 0.218, 0.216, 0.000)
		colorRock      (0.231, 0.229, 0.226, 0.000)
		colorSnow      (0.242, 0.239, 0.236, 1.000)
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
		SemiMajorAxis   0.00148948
		Period          0.121918
		Eccentricity    0.0244029
		Inclination     -24.0519
		AscendingNode   -68.6543
		ArgOfPericenter 142.806
		MeanAnomaly     -123.292
	}
}

DwarfMoon	"6.D5"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            6.93217e-008
	Radius          60.6688
	InertiaMoment   0.396908

	Obliquity       -25.4719
	EqAscendNode    -39.6007
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.718 0.714 0.710)

	Surface
	{
		SurfStyle       0.111142
		OceanStyle      0.0430109
		Randomize      (0.936, 0.365, -0.503)
		colorDistMagn   0.871763
		colorDistFreq   2.83985
		detailScale     1656.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0.74007
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.568508
		terraceProb     0.110116
		erosion         0
		montesMagn      0.44048
		montesFreq      2.60426
		montesSpiky     0.837551
		montesFraction  0.61413
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.7921
		hillsFraction   0.711531
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220582
		craterFreq      0.234582
		craterDensity   0.736144
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   36.1274
		volcanoTemp     1588.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.286, 0.284, 0.000)
		colorShelf     (0.305, 0.303, 0.302, 0.000)
		colorBeach     (0.323, 0.321, 0.319, 0.000)
		colorDesert    (0.341, 0.339, 0.337, 0.000)
		colorLowland   (0.359, 0.357, 0.355, 0.000)
		colorUpland    (0.377, 0.375, 0.373, 0.000)
		colorRock      (0.395, 0.393, 0.390, 0.000)
		colorSnow      (0.413, 0.411, 0.408, 1.000)
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
		SemiMajorAxis   0.00202223
		Period          0.192869
		Eccentricity    0.00423501
		Inclination     -25.4719
		AscendingNode   -39.6007
		ArgOfPericenter 172.956
		MeanAnomaly     160.956
	}
}

Barycenter	"7-7.1"
{
	ParentBody     "Lalande 21185"
	Mass            0.385786
	Radius          4385.94
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
		SemiMajorAxis   1.16528
		Period          2.83659
		Eccentricity    0.0679302
		Inclination     -2.24448
		AscendingNode   122.036
		ArgOfPericenter 111.95
		MeanAnomaly     3.60861
	}
}

Planet	"7"
{
	ParentBody     "7-7.1"
	Class	       "IceWorld"

	Mass            0.360364
	Radius          5589.43
	InertiaMoment   0.329295

	Obliquity       0.491922
	EqAscendNode    -28.7502
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.432 0.422 0.420)

	Surface
	{
		SurfStyle       0.704645
		OceanStyle      0.963437
		Randomize      (-0.883, 0.882, -0.191)
		colorDistMagn   0.0439169
		colorDistFreq   665.308
		detailScale     14376.3
		colorConversion true
		drivenDarkening 0
		seaLevel        0.214873
		snowLevel       2
		tropicLatitude  0.0166333
		icecapLatitude  0.980674
		icecapHeight    0.216114
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.8257
		venusFreq       1.29686
		venusMagn       0.26873
		mareFreq        1.99889
		mareDensity     0.0289312
		terraceProb     0.101099
		erosion         0
		montesMagn      0.157166
		montesFreq      241.793
		montesSpiky     0.99832
		montesFraction  0.85685
		dunesMagn       0.0448632
		dunesFreq       7487.04
		dunesFraction   0.0158686
		hillsMagn       0.104859
		hillsFreq       718.656
		hillsFraction   0.838797
		hills2Fraction  0.205033
		riversMagn      67.7728
		riversFreq      4.04417
		riversSin       5.87915
		riversOctaves   0
		canyonsMagn     0.513048
		canyonsFreq     2.25824
		canyonFraction  0
		cracksMagn      0.0739495
		cracksFreq      2.5622
		cracksOctaves   6
		craterMagn      0.501248
		craterFreq      13.9702
		craterDensity   0.763884
		craterOctaves   11.207
		craterRayedFactor 0.329474
		volcanoMagn     0.624171
		volcanoFreq     2.90378
		volcanoDensity  0.4
		volcanoOctaves  0
		volcanoActivity 1.92499
		volcanoFlows    0.196863
		volcanoRadius   0.390882
		volcanoTemp     1693.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.270, 0.281, 0.250)
		colorShelf     (0.302, 0.308, 0.319, 0.250)
		colorBeach     (0.246, 0.228, 0.243, 0.200)
		colorDesert    (0.229, 0.207, 0.214, 0.200)
		colorLowland   (0.168, 0.161, 0.176, 0.200)
		colorUpland    (0.319, 0.313, 0.319, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.168, 0.161, 0.176, 0.200)
		colorUpPlants  (0.319, 0.313, 0.319, 0.250)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.888888
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          22.0873
		Density         0.0111112
		Pressure        0.00259286
		Greenhouse      0.470688
		Bright          6.44395
		Opacity         1
		SkyLight        2.14798
		Hue             0
		Saturation      1

		Composition
		{
			N2    	98.4302
			CH4   	1.09041
			Ar    	0.279907
			CO    	0.195705
			Ne    	0.00376946
			Kr    	3.13199e-005
		}
	}

	Aurora
	{
		Height      118.449
		NorthLat    82.668
		NorthLon    150.165
		NorthRadius 1181.71
		NorthWidth  1503.02
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    296.065
		SouthRadius 1440.51
		SouthWidth  1770.11
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
		SemiMajorAxis   4.31237e-005
		Period          0.0155877
		Eccentricity    0.0407724
		Inclination     0.491922
		AscendingNode   -28.7502
		ArgOfPericenter 23.8128
		MeanAnomaly     129.433
	}
}

Moon	"7.1"
{
	ParentBody     "7-7.1"
	Class	       "Selena"

	Mass            0.0254222
	Radius          2549.18
	InertiaMoment   0.354471

	Obliquity       0.491922
	EqAscendNode    -28.7502
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.659 0.656 0.654)

	Surface
	{
		SurfStyle       0.958175
		OceanStyle      0.241596
		Randomize      (-0.630, 0.553, 0.586)
		colorDistMagn   0.0582774
		colorDistFreq   338.182
		detailScale     6556.63
		colorConversion true
		drivenDarkening 0
		seaLevel        0.275255
		snowLevel       2
		tropicLatitude  0.0166333
		icecapLatitude  0.568672
		icecapHeight    0.310364
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.69765
		venusFreq       0.863708
		venusMagn       0
		mareFreq        1.70115
		mareDensity     0.00467932
		terraceProb     0.269873
		erosion         0
		montesMagn      0.12663
		montesFreq      135.912
		montesSpiky     0.971815
		montesFraction  0.0517224
		dunesMagn       0.0478966
		dunesFreq       3331.77
		dunesFraction   0.436229
		hillsMagn       0.146473
		hillsFreq       311.965
		hillsFraction   0.905804
		hills2Fraction  0
		riversMagn      56.7471
		riversFreq      3.39814
		riversSin       6.35567
		riversOctaves   0
		canyonsMagn     0.476718
		canyonsFreq     1.02118
		canyonFraction  0.0277707
		cracksMagn      0.0296143
		cracksFreq      1.27878
		cracksOctaves   0
		craterMagn      0.605086
		craterFreq      6.10752
		craterDensity   0.889695
		craterOctaves   11.8459
		craterRayedFactor 0.384887
		volcanoMagn     0.520268
		volcanoFreq     2.53336
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.29003
		volcanoRadius   0.529195
		volcanoTemp     1537.12
		lavaCoverTidal  0.0142668
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.390, 0.400, 0.160, 0.000)
		colorShelf     (0.580, 0.550, 0.240, 0.000)
		colorBeach     (0.468, 0.446, 0.275, 0.000)
		colorDesert    (0.540, 0.499, 0.281, 0.000)
		colorLowland   (0.415, 0.361, 0.203, 0.000)
		colorUpland    (0.389, 0.335, 0.190, 0.000)
		colorRock      (0.330, 0.240, 0.130, 0.000)
		colorSnow      (0.900, 0.890, 0.760, 1.000)
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
		SemiMajorAxis   0.000611287
		Period          0.0155877
		Eccentricity    0.0407724
		Inclination     0.491922
		AscendingNode   -28.7502
		ArgOfPericenter -156.187
		MeanAnomaly     129.433
	}
}

Barycenter	"8-8.1"
{
	ParentBody     "Lalande 21185"
	Mass            2.3312
	Radius          5435.18
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
		SemiMajorAxis   2.35506
		Period          8.14987
		Eccentricity    0.0630418
		Inclination     1.02618
		AscendingNode   -179.535
		ArgOfPericenter 232.213
		MeanAnomaly     106.706
	}
}

Planet	"8"
{
	ParentBody     "8-8.1"
	Class	       "IceWorld"

	Mass            1.71323
	Radius          9545.44
	InertiaMoment   0.330373

	Obliquity       -1.17811
	EqAscendNode    -124.326
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.645 0.391 0.322)

	Surface
	{
		SurfStyle       0.335263
		OceanStyle      0.414586
		Randomize      (0.112, -0.060, 0.438)
		colorDistMagn   0.047958
		colorDistFreq   1179.77
		detailScale     24551.4
		colorConversion true
		drivenDarkening 0
		seaLevel        0.214509
		snowLevel       2
		tropicLatitude  0.019201
		icecapLatitude  0.688626
		icecapHeight    0.238506
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.82777
		venusFreq       0.852746
		venusMagn       0.222688
		mareFreq        1.89685
		mareDensity     0.0741984
		terraceProb     0.38841
		erosion         0
		montesMagn      0.209266
		montesFreq      376.22
		montesSpiky     0.994354
		montesFraction  0.979708
		dunesMagn       0.0439428
		dunesFreq       12556.2
		dunesFraction   0.567019
		hillsMagn       0.123156
		hillsFreq       1169.47
		hillsFraction   0.926064
		hills2Fraction  0.265631
		riversMagn      55.0395
		riversFreq      3.53637
		riversSin       5.37953
		riversOctaves   0
		canyonsMagn     0.645795
		canyonsFreq     3.32797
		canyonFraction  0
		cracksMagn      0.0487294
		cracksFreq      4.15362
		cracksOctaves   5
		craterMagn      0.513406
		craterFreq      30.0314
		craterDensity   0.610268
		craterOctaves   9.12876
		craterRayedFactor 0.129635
		volcanoMagn     0.682022
		volcanoFreq     2.94936
		volcanoDensity  0.4
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0.303
		volcanoRadius   0.281022
		volcanoTemp     1340.34
		lavaCoverTidal  0.218809
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.645, 0.391, 0.322, 0.500)
		colorShelf     (0.613, 0.372, 0.306, 0.500)
		colorBeach     (0.451, 0.274, 0.226, 0.750)
		colorDesert    (0.548, 0.333, 0.274, 1.000)
		colorLowland   (0.567, 0.344, 0.284, 1.000)
		colorUpland    (0.600, 0.364, 0.300, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.567, 0.344, 0.284, 1.000)
		colorUpPlants  (0.600, 0.364, 0.300, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.341612
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          12
		Density         0.0658388
		Pressure        0.0110621
		Greenhouse      0.60064
		Bright          9.19806
		Opacity         1
		SkyLight        3.06602
		Hue             0.550561
		Saturation      1

		Composition
		{
			N2    	99.9082
			Ne    	0.0507369
			He    	0.0369568
			Ar    	0.00263111
			CO    	0.00148703
		}
	}

	Aurora
	{
		Height      212.113
		NorthLat    71.3992
		NorthLon    147.821
		NorthRadius 2666.63
		NorthWidth  1982.04
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -83.2159
		SouthLon    332.417
		SouthRadius 2745.64
		SouthWidth  2909
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
		SemiMajorAxis   0.000268319
		Period          0.0121979
		Eccentricity    0.0231686
		Inclination     -1.17811
		AscendingNode   -124.326
		ArgOfPericenter 156.342
		MeanAnomaly     -8.22966
	}
}

Moon	"8.1"
{
	ParentBody     "8-8.1"
	Class	       "Desert"

	Mass            0.61797
	Radius          6599.14
	InertiaMoment   0.33041

	Obliquity       -1.17811
	EqAscendNode    -124.326
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.461 0.458 0.453)

	Surface
	{
		SurfStyle       0.807333
		OceanStyle      0.454072
		Randomize      (0.440, 0.327, 0.497)
		colorDistMagn   0.0963182
		colorDistFreq   754.681
		detailScale     16973.4
		colorConversion true
		seaLevel        0.109756
		snowLevel       2
		tropicLatitude  0.019201
		icecapLatitude  0.800069
		icecapHeight    0.122775
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.955551
		venusFreq       1.34286
		venusMagn       0
		mareFreq        1.32143
		mareDensity     0.068421
		terraceProb     0.115645
		erosion         0
		montesMagn      0.195002
		montesFreq      248.408
		montesSpiky     0.877024
		montesFraction  0.762443
		dunesMagn       0.0642441
		dunesFreq       44.5
		dunesFraction   0.20234
		hillsMagn       0.157934
		hillsFreq       836.162
		hillsFraction   0
		hills2Fraction  0
		riversMagn      58.9966
		riversFreq      3.34693
		riversSin       6.31233
		riversOctaves   0
		canyonsMagn     0.0273817
		canyonsFreq     172.11
		canyonFraction  0
		cracksMagn      0.0827599
		cracksFreq      0.570845
		cracksOctaves   0
		craterMagn      0.531772
		craterFreq      19.0401
		craterDensity   0.595389
		craterOctaves   9.78253
		volcanoMagn     0.65294
		volcanoFreq     2.7425
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.828266
		volcanoRadius   0.300798
		volcanoTemp     1340.31
		lavaCoverTidal  0.260742
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
		Hapke           0.97201
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
		Height          28.3846
		Density         0.00279897
		Pressure        0.00112277
		Greenhouse      0.688278
		Bright          4.89102
		Opacity         1
		SkyLight        1.63034
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	89.3343
			N2    	10.5576
			Ar    	0.0568379
			CO    	0.0490187
			Ne    	0.0020532
			Kr    	0.000225994
		}
	}

	Aurora
	{
		Height      63.8058
		NorthLat    73.4315
		NorthLon    30.804
		NorthRadius 1483.32
		NorthWidth  1576.27
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -69.0283
		SouthLon    215.419
		SouthRadius 2112.06
		SouthWidth  1785.21
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
		SemiMajorAxis   0.000743872
		Period          0.0121979
		Eccentricity    0.0231686
		Inclination     -1.17811
		AscendingNode   -124.326
		ArgOfPericenter -23.6583
		MeanAnomaly     -8.22966
	}
}

Planet	"9"
{
	ParentBody     "Lalande 21185"
	Class	       "IceWorld"

	Mass            8.36339
	Radius          13832.7
	InertiaMoment   0.331585

	Oblateness      0.0176769

	RotationPeriod  11.5161
	Obliquity       -50.2014
	EqAscendNode    -123.337

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.571 0.567 0.558)

	Surface
	{
		SurfStyle       0.72982
		OceanStyle      0.227354
		Randomize      (-0.373, -0.036, -0.952)
		colorDistMagn   0.0744113
		colorDistFreq   1268.23
		detailScale     35578.4
		colorConversion true
		drivenDarkening 0
		seaLevel        0.23558
		snowLevel       2
		tropicLatitude  0.779892
		icecapLatitude  1
		icecapHeight    0.23558
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.58878
		venusFreq       0.666594
		venusMagn       0.22047
		mareFreq        2.00831
		mareDensity     0.131177
		terraceProb     0.157756
		erosion         0
		montesMagn      0.1805
		montesFreq      744.122
		montesSpiky     0.884674
		montesFraction  0.479855
		dunesMagn       0.0399136
		dunesFreq       17717.8
		dunesFraction   0.645543
		hillsMagn       0.145847
		hillsFreq       1356.66
		hillsFraction   0.211702
		hills2Fraction  0.151646
		riversMagn      60.4014
		riversFreq      2.93898
		riversSin       5.82642
		riversOctaves   0
		canyonsMagn     0.439248
		canyonsFreq     4.96144
		canyonFraction  0
		cracksMagn      0.0630269
		cracksFreq      4.80043
		cracksOctaves   6
		craterMagn      0.74248
		craterFreq      34.9953
		craterDensity   0.960511
		craterOctaves   14
		craterRayedFactor 0
		volcanoMagn     0.692085
		volcanoFreq     1.18652
		volcanoDensity  0.0555469
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.151585
		volcanoRadius   0.29663
		volcanoTemp     1468.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.365, 0.363, 0.374, 0.250)
		colorShelf     (0.400, 0.414, 0.424, 0.250)
		colorBeach     (0.325, 0.306, 0.324, 0.200)
		colorDesert    (0.303, 0.278, 0.285, 0.200)
		colorLowland   (0.223, 0.215, 0.234, 0.200)
		colorUpland    (0.423, 0.419, 0.424, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.223, 0.215, 0.234, 0.200)
		colorUpPlants  (0.423, 0.419, 0.424, 0.250)
		BumpHeight      14.9986
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999229
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
		Height          32.633
		Density         7.71433e-005
		Pressure        1.41424e-005
		Greenhouse      0.034393
		Bright          2.38484
		Opacity         0
		SkyLight        0.794947
		Hue             -0.0258267
		Saturation      1

		Composition
		{
			N2    	60.7223
			He    	25.3055
			Ne    	13.7439
			CO    	0.186849
			Ar    	0.0415169
		}
	}

	Aurora
	{
		Height      323.423
		NorthLat    63.0101
		NorthLon    -90.1212
		NorthRadius 2826.88
		NorthWidth  2469.67
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -79.6014
		SouthLon    78.89
		SouthRadius 4693.03
		SouthWidth  4368.73
		SouthRings  5
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     18572.9
		OuterRadius     35183.7
		RotationPeriod  4.22176
		RotationOffset  0
		FrontBright     0.65374
		BackBright      0.989198
		Density         0.730723
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.01625
		Period          18.1491
		Eccentricity    0.0603698
		Inclination     2.1432
		AscendingNode   -118.543
		ArgOfPericenter 27.1662
		MeanAnomaly     112.353
	}
}

DwarfMoon	"9.D1"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            1.83916e-008
	Radius          42.0754
	InertiaMoment   0.397355

	Oblateness      0.249

	Obliquity       -0.00290383
	EqAscendNode    -72.3629
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.668 0.629 0.573)

	Surface
	{
		SurfStyle       0.51409
		OceanStyle      0.292922
		Randomize      (-0.232, 0.252, 0.595)
		colorDistMagn   0.595273
		colorDistFreq   1.15046
		detailScale     1148.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.457034
		terraceProb     0.286193
		erosion         0
		montesMagn      0.493669
		montesFreq      2.27619
		montesSpiky     0.99091
		montesFraction  0.306441
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.77672
		hillsFraction   0.692435
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238518
		craterFreq      0.162273
		craterDensity   0.749195
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   48.6435
		volcanoTemp     1564.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.214, 0.160, 0.000)
		colorShelf     (0.267, 0.220, 0.183, 0.000)
		colorBeach     (0.314, 0.258, 0.218, 0.000)
		colorDesert    (0.340, 0.277, 0.212, 0.000)
		colorLowland   (0.374, 0.296, 0.241, 0.000)
		colorUpland    (0.414, 0.359, 0.292, 0.000)
		colorRock      (0.447, 0.390, 0.315, 0.000)
		colorSnow      (0.487, 0.415, 0.332, 1.000)
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
		SemiMajorAxis   0.00029525
		Period          0.00101455
		Eccentricity    2.10813e-005
		Inclination     -0.00290383
		AscendingNode   -72.3629
		ArgOfPericenter -104.901
		MeanAnomaly     -179.866
	}
}

Moon	"9.1"
{
	ParentBody     "9"
	Class	       "Selena"

	Mass            0.000472122
	Radius          645.335
	InertiaMoment   0.399119

	Oblateness      0.00944254

	Obliquity       1.20262
	EqAscendNode    13.3549
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.613 0.609 0.606)

	Surface
	{
		SurfStyle       0.297458
		OceanStyle      0.242645
		Randomize      (-0.407, 0.150, -0.616)
		colorDistMagn   0.0486729
		colorDistFreq   75.1763
		detailScale     1659.84
		colorConversion true
		drivenDarkening 0
		seaLevel        0.182797
		snowLevel       2
		tropicLatitude  0.0416826
		icecapLatitude  0.731363
		icecapHeight    0.202772
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.8256
		venusFreq       0.43036
		venusMagn       0
		mareFreq        0.0290159
		mareDensity     0.000334175
		terraceProb     0.279013
		erosion         0
		montesMagn      0.0641472
		montesFreq      25.3124
		montesSpiky     0.950004
		montesFraction  0.192551
		dunesMagn       0.0236781
		dunesFreq       855.822
		dunesFraction   0.676684
		hillsMagn       0.111028
		hillsFreq       69.9651
		hillsFraction   0.561984
		hills2Fraction  0
		riversMagn      54.2514
		riversFreq      2.51792
		riversSin       5.28711
		riversOctaves   0
		canyonsMagn     0.315279
		canyonsFreq     0.223343
		canyonFraction  0.983136
		cracksMagn      0.029039
		cracksFreq      0.168075
		cracksOctaves   0
		craterMagn      0.588012
		craterFreq      2.20138
		craterDensity   0.771831
		craterOctaves   8.44826
		craterRayedFactor 0.3361
		volcanoMagn     0.237844
		volcanoFreq     2.31696
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.422789
		volcanoRadius   0.899087
		volcanoTemp     1444.44
		lavaCoverTidal  0.0681158
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.337, 0.347, 0.363, 0.000)
		colorDesert    (0.294, 0.280, 0.279, 0.000)
		colorLowland   (0.374, 0.371, 0.339, 0.000)
		colorUpland    (0.399, 0.396, 0.369, 0.000)
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
		SemiMajorAxis   0.000571627
		Period          0.00273303
		Eccentricity    0.0241739
		Inclination     1.20262
		AscendingNode   13.3549
		ArgOfPericenter -91.1054
		MeanAnomaly     35.6942
	}
}

Moon	"9.2"
{
	ParentBody     "9"
	Class	       "IceWorld"

	Mass            0.00054628
	Radius          719.602
	InertiaMoment   0.398578

	Oblateness      0.00296103

	Obliquity       0.389983
	EqAscendNode    -108.897
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.793 0.608 0.546)

	Surface
	{
		SurfStyle       0.951767
		OceanStyle      0.132987
		Randomize      (0.947, 0.980, -0.553)
		colorDistMagn   0.0730834
		colorDistFreq   85.8472
		detailScale     1850.86
		colorConversion true
		drivenDarkening 0
		seaLevel        0.193226
		snowLevel       2
		tropicLatitude  0.00791853
		icecapLatitude  0.598947
		icecapHeight    0.202848
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.97731
		venusFreq       1.19751
		venusMagn       0.1664
		mareFreq        0.0999807
		mareDensity     0.000346678
		terraceProb     0.449546
		erosion         0
		montesMagn      0.0610243
		montesFreq      25.5616
		montesSpiky     0.875612
		montesFraction  0.452627
		dunesMagn       0.0517349
		dunesFreq       957.367
		dunesFraction   0.921845
		hillsMagn       0.128969
		hillsFreq       76.3085
		hillsFraction   0.624971
		hills2Fraction  0.187173
		riversMagn      53.7259
		riversFreq      3.07447
		riversSin       6.49156
		riversOctaves   0
		canyonsMagn     0.442888
		canyonsFreq     0.317411
		canyonFraction  0
		cracksMagn      0.0569837
		cracksFreq      0.333986
		cracksOctaves   0
		craterMagn      0.599163
		craterFreq      2.48166
		craterDensity   0.959419
		craterOctaves   10
		craterRayedFactor 0.326755
		volcanoMagn     0.206597
		volcanoFreq     0.928802
		volcanoDensity  0.0581918
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.139326
		volcanoRadius   1.12087
		volcanoTemp     1310.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.603, 0.432, 0.316, 1.000)
		colorShelf     (0.603, 0.432, 0.316, 1.000)
		colorBeach     (0.555, 0.377, 0.273, 1.000)
		colorDesert    (0.555, 0.377, 0.273, 1.000)
		colorLowland   (0.674, 0.493, 0.415, 1.000)
		colorUpland    (0.706, 0.541, 0.469, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.674, 0.493, 0.415, 1.000)
		colorUpPlants  (0.706, 0.541, 0.469, 1.000)
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
		SemiMajorAxis   0.000893077
		Period          0.00533713
		Eccentricity    0.0389035
		Inclination     0.389983
		AscendingNode   -108.897
		ArgOfPericenter -90.813
		MeanAnomaly     -49.5122
	}
}

Moon	"9.3"
{
	ParentBody     "9"
	Class	       "IceWorld"

	Mass            0.000632187
	Radius          710.927
	InertiaMoment   0.397904

	Obliquity       0.732383
	EqAscendNode    -24.1001
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.659 0.514 0.311)

	Surface
	{
		SurfStyle       0.811265
		OceanStyle      0.938744
		Randomize      (-0.584, -0.725, 0.862)
		colorDistMagn   0.089548
		colorDistFreq   71.633
		detailScale     1828.54
		colorConversion true
		drivenDarkening 0
		seaLevel        0.132303
		snowLevel       2
		tropicLatitude  0.0249983
		icecapLatitude  0.485013
		icecapHeight    0.160988
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.58588
		venusFreq       0.667961
		venusMagn       0
		mareFreq        0.0779003
		mareDensity     0.000506243
		terraceProb     0.526109
		erosion         0
		montesMagn      0.0581447
		montesFreq      32.9876
		montesSpiky     0.916592
		montesFraction  0.42263
		dunesMagn       0.0342481
		dunesFreq       942.453
		dunesFraction   0.764683
		hillsMagn       0.108923
		hillsFreq       93.632
		hillsFraction   0.394408
		hills2Fraction  0.272844
		riversMagn      57.0246
		riversFreq      3.28488
		riversSin       8.08242
		riversOctaves   0
		canyonsMagn     0.560567
		canyonsFreq     0.241101
		canyonFraction  0
		cracksMagn      0.0781889
		cracksFreq      0.251284
		cracksOctaves   0
		craterMagn      0.641326
		craterFreq      1.6916
		craterDensity   0.782331
		craterOctaves   10
		craterRayedFactor 0.340802
		volcanoMagn     0.211076
		volcanoFreq     1.01839
		volcanoDensity  0.0648629
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.361803
		volcanoRadius   1.12866
		volcanoTemp     1201.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.659, 0.385, 0.179, 0.000)
		colorShelf     (0.626, 0.366, 0.170, 0.000)
		colorBeach     (0.330, 0.193, 0.089, 0.000)
		colorDesert    (0.560, 0.328, 0.152, 0.000)
		colorLowland   (0.534, 0.339, 0.170, 0.000)
		colorUpland    (0.613, 0.358, 0.166, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.534, 0.339, 0.170, 0.000)
		colorUpPlants  (0.613, 0.358, 0.166, 0.000)
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
		SemiMajorAxis   0.00139529
		Period          0.0104224
		Eccentricity    0.0038603
		Inclination     0.732383
		AscendingNode   -24.1
		ArgOfPericenter -73.2424
		MeanAnomaly     107.872
	}
}

Moon	"9.4"
{
	ParentBody     "9"
	Class	       "IceWorld"

	Mass            0.000732155
	Radius          792.975
	InertiaMoment   0.396823

	Obliquity       0.722351
	EqAscendNode    93.2778
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.469 0.463 0.460)

	Surface
	{
		SurfStyle       0.40657
		OceanStyle      0.985172
		Randomize      (0.986, 0.111, -0.264)
		colorDistMagn   0.0799887
		colorDistFreq   121.185
		detailScale     2039.58
		colorConversion true
		drivenDarkening 0
		seaLevel        0.300446
		snowLevel       2
		tropicLatitude  0.017311
		icecapLatitude  0.524679
		icecapHeight    0.32926
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.07692
		venusFreq       0.553978
		venusMagn       0.230622
		mareFreq        0.144671
		mareDensity     0.000377733
		terraceProb     0.299853
		erosion         0
		montesMagn      0.0542427
		montesFreq      30.1521
		montesSpiky     0.901147
		montesFraction  0.711201
		dunesMagn       0.0343278
		dunesFreq       1028.1
		dunesFraction   0.786874
		hillsMagn       0.103492
		hillsFreq       86.1277
		hillsFraction   0.301476
		hills2Fraction  0.157547
		riversMagn      60.7642
		riversFreq      2.86699
		riversSin       5.06849
		riversOctaves   0
		canyonsMagn     0.499202
		canyonsFreq     0.275133
		canyonFraction  0
		cracksMagn      0.0737104
		cracksFreq      0.461808
		cracksOctaves   0
		craterMagn      0.588693
		craterFreq      2.74294
		craterDensity   0.891827
		craterOctaves   10
		craterRayedFactor 0.23725
		volcanoMagn     0.233447
		volcanoFreq     1.06945
		volcanoDensity  0.0617925
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.0517823
		volcanoRadius   1.22847
		volcanoTemp     1353.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.469, 0.463, 0.460, 0.500)
		colorShelf     (0.446, 0.440, 0.437, 0.500)
		colorBeach     (0.329, 0.324, 0.322, 0.750)
		colorDesert    (0.399, 0.393, 0.391, 1.000)
		colorLowland   (0.413, 0.407, 0.405, 1.000)
		colorUpland    (0.436, 0.430, 0.428, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.413, 0.407, 0.405, 1.000)
		colorUpPlants  (0.436, 0.430, 0.428, 1.000)
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
		SemiMajorAxis   0.00217992
		Period          0.0203531
		Eccentricity    0.00593456
		Inclination     0.722351
		AscendingNode   93.2778
		ArgOfPericenter 166.756
		MeanAnomaly     13.1348
	}
}

Moon	"9.5"
{
	ParentBody     "9"
	Class	       "IceWorld"

	Mass            0.00849089
	Radius          1675.64
	InertiaMoment   0.382928

	Obliquity       -0.663052
	EqAscendNode    -148.373
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.827 0.786 0.734)

	Surface
	{
		SurfStyle       0.327665
		OceanStyle      0.527961
		Randomize      (0.546, 0.516, 0.708)
		colorDistMagn   0.0423464
		colorDistFreq   184.34
		detailScale     4309.84
		colorConversion true
		drivenDarkening 0
		seaLevel        0.267408
		snowLevel       2
		tropicLatitude  0.00630995
		icecapLatitude  0.421024
		icecapHeight    0.319407
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.72272
		venusFreq       1.62042
		venusMagn       0.265323
		mareFreq        0.774812
		mareDensity     0.00189377
		terraceProb     0.306714
		erosion         0
		montesMagn      0.090741
		montesFreq      53.1474
		montesSpiky     0.805713
		montesFraction  0.577084
		dunesMagn       0.0517744
		dunesFreq       2257.11
		dunesFraction   0.656769
		hillsMagn       0.135198
		hillsFreq       201.448
		hillsFraction   0.995666
		hills2Fraction  0.12195
		riversMagn      61.8423
		riversFreq      3.08795
		riversSin       5.29364
		riversOctaves   0
		canyonsMagn     0.406321
		canyonsFreq     0.63158
		canyonFraction  0
		cracksMagn      0.0593503
		cracksFreq      0.681703
		cracksOctaves   1
		craterMagn      0.612784
		craterFreq      3.73064
		craterDensity   0.728337
		craterOctaves   11
		craterRayedFactor 0.358078
		volcanoMagn     0.252344
		volcanoFreq     0.609302
		volcanoDensity  0.0610939
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.143173
		volcanoRadius   0.434292
		volcanoTemp     1268.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.827, 0.786, 0.734, 0.500)
		colorShelf     (0.786, 0.747, 0.697, 0.500)
		colorBeach     (0.579, 0.550, 0.514, 0.750)
		colorDesert    (0.703, 0.668, 0.624, 1.000)
		colorLowland   (0.728, 0.692, 0.646, 1.000)
		colorUpland    (0.769, 0.731, 0.683, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.728, 0.692, 0.646, 1.000)
		colorUpPlants  (0.769, 0.731, 0.683, 1.000)
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
		SemiMajorAxis   0.00340579
		Period          0.0397278
		Eccentricity    0.0115946
		Inclination     -0.663052
		AscendingNode   -148.373
		ArgOfPericenter -150.082
		MeanAnomaly     -73.4122
	}
}

DwarfMoon	"9.D2"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            1.16141e-007
	Radius          68.9913
	InertiaMoment   0.397865

	Obliquity       -0.954385
	EqAscendNode    138.714
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.501 0.459 0.395)

	Surface
	{
		SurfStyle       0.063943
		OceanStyle      0.0151875
		Randomize      (0.963, 0.236, 0.787)
		colorDistMagn   0.161928
		colorDistFreq   3.92712
		detailScale     1883.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.011744
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505758
		terraceProb     0.520835
		erosion         0
		montesMagn      0.441662
		montesFreq      3.29605
		montesSpiky     0.913971
		montesFraction  0.446042
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.8875
		hillsFraction   0.638078
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247479
		craterFreq      0.160195
		craterDensity   1.05372
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.74
		volcanoTemp     1365.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.184, 0.158, 0.000)
		colorShelf     (0.213, 0.195, 0.168, 0.000)
		colorBeach     (0.226, 0.207, 0.178, 0.000)
		colorDesert    (0.238, 0.218, 0.188, 0.000)
		colorLowland   (0.251, 0.230, 0.198, 0.000)
		colorUpland    (0.263, 0.241, 0.207, 0.000)
		colorRock      (0.276, 0.252, 0.217, 0.000)
		colorSnow      (0.288, 0.264, 0.227, 1.000)
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
		SemiMajorAxis   0.005321
		Period          0.0776209
		Eccentricity    0.0197139
		Inclination     -0.954385
		AscendingNode   138.714
		ArgOfPericenter -126.678
		MeanAnomaly     113.72
	}
}

DwarfMoon	"9.D3"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            1.59172e-007
	Radius          73.5648
	InertiaMoment   0.399052

	RotationPeriod  22450
	Obliquity       41.8163
	EqAscendNode    -117.683

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.489 0.481 0.477)

	Surface
	{
		SurfStyle       0.343434
		OceanStyle      0.555892
		Randomize      (-0.239, 0.019, 0.574)
		colorDistMagn   0.82138
		colorDistFreq   1.02823
		detailScale     2008.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.647604
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.257158
		terraceProb     0.168454
		erosion         0
		montesMagn      0.369335
		montesFreq      2.55817
		montesSpiky     0.985476
		montesFraction  0.752417
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.5863
		hillsFraction   0.624307
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244744
		craterFreq      0.202343
		craterDensity   0.980135
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.9096
		volcanoTemp     1525.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.193, 0.191, 0.000)
		colorShelf     (0.208, 0.205, 0.203, 0.000)
		colorBeach     (0.220, 0.217, 0.215, 0.000)
		colorDesert    (0.232, 0.229, 0.227, 0.000)
		colorLowland   (0.245, 0.241, 0.238, 0.000)
		colorUpland    (0.257, 0.253, 0.250, 0.000)
		colorRock      (0.269, 0.265, 0.262, 0.000)
		colorSnow      (0.281, 0.277, 0.274, 1.000)
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
		SemiMajorAxis   0.0263154
		Period          0.853697
		Eccentricity    0.195384
		Inclination     41.8163
		AscendingNode   -117.683
		ArgOfPericenter 43.2006
		MeanAnomaly     -17.9567
	}
}

DwarfMoon	"9.D4"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            2.19223e-007
	Radius          71.2942
	InertiaMoment   0.399964

	RotationPeriod  15342.9
	Obliquity       15.511
	EqAscendNode    75.463

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.545 0.540 0.537)

	Surface
	{
		SurfStyle       0.137101
		OceanStyle      0.451735
		Randomize      (0.976, 0.133, -0.200)
		colorDistMagn   0.522888
		colorDistFreq   4.16137
		detailScale     1946.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.413434
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.693681
		terraceProb     0.213936
		erosion         0
		montesMagn      0.582617
		montesFreq      2.39232
		montesSpiky     0.862947
		montesFraction  0.2192
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.2227
		hillsFraction   0.60209
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230641
		craterFreq      0.241323
		craterDensity   0.935957
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.8736
		volcanoTemp     1581.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.216, 0.215, 0.000)
		colorShelf     (0.232, 0.229, 0.228, 0.000)
		colorBeach     (0.245, 0.243, 0.242, 0.000)
		colorDesert    (0.259, 0.256, 0.255, 0.000)
		colorLowland   (0.273, 0.270, 0.269, 0.000)
		colorUpland    (0.286, 0.283, 0.282, 0.000)
		colorRock      (0.300, 0.297, 0.295, 0.000)
		colorSnow      (0.314, 0.310, 0.309, 1.000)
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
		SemiMajorAxis   0.0267545
		Period          0.875153
		Eccentricity    0.238518
		Inclination     15.511
		AscendingNode   75.463
		ArgOfPericenter 136.485
		MeanAnomaly     -54.2109
	}
}

DwarfMoon	"9.D5"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            3.03778e-007
	Radius          100.243
	InertiaMoment   0.398074

	RotationPeriod  31756.9
	Obliquity       -40.4061
	EqAscendNode    111.907

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.498 0.488 0.485)

	Surface
	{
		SurfStyle       0.158458
		OceanStyle      0.703812
		Randomize      (0.718, 0.320, 0.910)
		colorDistMagn   0.267898
		colorDistFreq   3.24187
		detailScale     2737.31
		colorConversion true
		snowLevel       2
		tropicLatitude  0.676326
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411898
		terraceProb     0.289979
		erosion         0
		montesMagn      0.692853
		montesFreq      3.56357
		montesSpiky     0.870527
		montesFraction  0.662572
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.597
		hillsFraction   0.603899
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211303
		craterFreq      0.309471
		craterDensity   0.964149
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.5156
		volcanoTemp     1636.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.195, 0.194, 0.000)
		colorShelf     (0.212, 0.207, 0.206, 0.000)
		colorBeach     (0.224, 0.220, 0.218, 0.000)
		colorDesert    (0.237, 0.232, 0.230, 0.000)
		colorLowland   (0.249, 0.244, 0.242, 0.000)
		colorUpland    (0.262, 0.256, 0.255, 0.000)
		colorRock      (0.274, 0.268, 0.267, 0.000)
		colorSnow      (0.287, 0.281, 0.279, 1.000)
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
		SemiMajorAxis   0.0273736
		Period          0.905704
		Eccentricity    0.377352
		Inclination     -40.4061
		AscendingNode   111.907
		ArgOfPericenter 46.6546
		MeanAnomaly     -142.268
	}
}

DwarfMoon	"9.D6"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            4.2409e-007
	Radius          106.848
	InertiaMoment   0.39919

	Obliquity       35.2572
	EqAscendNode    171.973
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.586 0.578 0.574)

	Surface
	{
		SurfStyle       0.886769
		OceanStyle      0.853489
		Randomize      (-0.096, 0.974, 0.583)
		colorDistMagn   0.70941
		colorDistFreq   7.19537
		detailScale     2917.67
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0807368
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566536
		terraceProb     0.275293
		erosion         0
		montesMagn      0.332857
		montesFreq      2.35416
		montesSpiky     0.853632
		montesFraction  0.582952
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.7455
		hillsFraction   0.669473
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216546
		craterFreq      0.410398
		craterDensity   1.02637
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.7244
		volcanoTemp     1466.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.202, 0.229, 0.050)
		colorShelf     (0.234, 0.237, 0.264, 0.040)
		colorBeach     (0.270, 0.272, 0.298, 0.030)
		colorDesert    (0.305, 0.306, 0.338, 0.020)
		colorLowland   (0.340, 0.341, 0.373, 0.030)
		colorUpland    (0.375, 0.376, 0.407, 0.050)
		colorRock      (0.410, 0.410, 0.453, 0.020)
		colorSnow      (0.410, 0.410, 0.453, 1.000)
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
		SemiMajorAxis   0.0279106
		Period          0.932487
		Eccentricity    0.18306
		Inclination     35.2572
		AscendingNode   171.973
		ArgOfPericenter -107.957
		MeanAnomaly     172.288
	}
}

DwarfMoon	"9.D7"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            5.97382e-007
	Radius          115.039
	InertiaMoment   0.395793

	RotationPeriod  16854.6
	Obliquity       -36.6257
	EqAscendNode    4.75222

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.647 0.585 0.505)

	Surface
	{
		SurfStyle       0.908581
		OceanStyle      0.596938
		Randomize      (0.263, 0.898, -0.303)
		colorDistMagn   0.289963
		colorDistFreq   7.50749
		detailScale     3141.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.95721
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.419852
		terraceProb     0.295771
		erosion         0
		montesMagn      0.388784
		montesFreq      2.87731
		montesSpiky     0.866835
		montesFraction  0.43208
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.9058
		hillsFraction   0.766217
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262049
		craterFreq      0.507139
		craterDensity   0.798185
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.336
		volcanoTemp     1646.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.205, 0.202, 0.050)
		colorShelf     (0.259, 0.240, 0.232, 0.040)
		colorBeach     (0.298, 0.275, 0.262, 0.030)
		colorDesert    (0.337, 0.310, 0.298, 0.020)
		colorLowland   (0.375, 0.345, 0.328, 0.030)
		colorUpland    (0.414, 0.380, 0.358, 0.050)
		colorRock      (0.453, 0.415, 0.399, 0.020)
		colorSnow      (0.453, 0.415, 0.399, 1.000)
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
		SemiMajorAxis   0.0284842
		Period          0.96138
		Eccentricity    0.131277
		Inclination     -36.6257
		AscendingNode   4.75222
		ArgOfPericenter -29.1967
		MeanAnomaly     -12.9973
	}
}

Planet	"10"
{
	ParentBody     "Lalande 21185"
	Class	       "IceGiant"

	Mass            12.1043
	Radius          18692.1
	InertiaMoment   0.298679

	Oblateness      0.0235457

	RotationPeriod  12.2774
	Obliquity       -21.0382
	EqAscendNode    -129.392

	AlbedoBond      0.412051
	AlbedoGeom      0.494461
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.556349
		Randomize      (-0.240, 0.918, -0.932)
		detailScale     48077.1
		colorConversion true
		tropicLatitude  0.357123
		icecapLatitude  1
		mainFreq        0.0588657
		venusFreq       0.0156381
		venusMagn       0.00402376
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      0.0777683
		twistMagn       1.11972
		cycloneMagn     5.09065
		cycloneFreq     0.269126
		cycloneDensity  0.0601796
		cycloneOctaves  0
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
		BumpHeight      16.8471
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          186.921
		Density         3249.38
		Pressure        129616
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0299312
		Saturation      0.679376

		Composition
		{
			H2    	92.9668
			He    	7.03219
			Ne    	0.00102978
		}
	}

	Aurora
	{
		Height      168.378
		NorthLat    59.0844
		NorthLon    -69.8944
		NorthRadius 5834.09
		NorthWidth  4791.62
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -49.1047
		SouthLon    85.5835
		SouthRadius 5188.08
		SouthWidth  5001.74
		SouthRings  3
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     26998.2
		OuterRadius     60510.4
		RotationPeriod  7.2886
		RotationOffset  0
		FrontBright     0.850869
		BackBright      0.570008
		Density         0.733914
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.25526
		Period          53.4822
		Eccentricity    0.0517747
		Inclination     -0.157224
		AscendingNode   -136.896
		ArgOfPericenter 124.39
		MeanAnomaly     223.568
	}
}

DwarfMoon	"10.D1"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            9.57436e-011
	Radius          6.12727
	InertiaMoment   0.399554

	Oblateness      0.249

	Obliquity       -0.0112076
	EqAscendNode    35.4766
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.503 0.405 0.355)

	Surface
	{
		SurfStyle       0.81834
		OceanStyle      0.81458
		Randomize      (0.991, 0.139, 0.577)
		colorDistMagn   0.702836
		colorDistFreq   0.00712593
		detailScale     167.315
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.34156
		terraceProb     0.17483
		erosion         0
		montesMagn      0.519377
		montesFreq      3.51804
		montesSpiky     0.817043
		montesFraction  0.772636
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0876661
		hillsFraction   0.772535
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256213
		craterFreq      0.197831
		craterDensity   0.855699
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   98.1789
		volcanoTemp     1717.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.138, 0.099, 0.000)
		colorShelf     (0.201, 0.142, 0.114, 0.000)
		colorBeach     (0.236, 0.166, 0.135, 0.000)
		colorDesert    (0.256, 0.178, 0.131, 0.000)
		colorLowland   (0.282, 0.190, 0.149, 0.000)
		colorUpland    (0.312, 0.231, 0.181, 0.000)
		colorRock      (0.337, 0.251, 0.195, 0.000)
		colorSnow      (0.367, 0.267, 0.206, 1.000)
		BumpHeight      5.51454
		BumpOffset      1.10291
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0002977
		Period          0.000853844
		Eccentricity    4.05725e-005
		Inclination     -0.0112076
		AscendingNode   35.4766
		ArgOfPericenter -75.3004
		MeanAnomaly     -59.5972
	}
}

DwarfMoon	"10.D2"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.55709e-010
	Radius          8.58652
	InertiaMoment   0.397277

	Oblateness      0.249

	Obliquity       0.0140749
	EqAscendNode    -7.06525
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.465 0.457 0.454)

	Surface
	{
		SurfStyle       0.639494
		OceanStyle      0.92829
		Randomize      (0.086, 0.768, -0.565)
		colorDistMagn   0.351088
		colorDistFreq   0.0654873
		detailScale     234.469
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.626679
		terraceProb     0.324836
		erosion         0
		montesMagn      0.653608
		montesFreq      2.31381
		montesSpiky     0.895414
		montesFraction  0.451669
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.158739
		hillsFraction   0.675486
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23334
		craterFreq      0.253835
		craterDensity   0.826657
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   107.886
		volcanoTemp     1648.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.155, 0.127, 0.000)
		colorShelf     (0.186, 0.160, 0.145, 0.000)
		colorBeach     (0.219, 0.187, 0.173, 0.000)
		colorDesert    (0.237, 0.201, 0.168, 0.000)
		colorLowland   (0.260, 0.215, 0.191, 0.000)
		colorUpland    (0.288, 0.261, 0.232, 0.000)
		colorRock      (0.312, 0.283, 0.250, 0.000)
		colorSnow      (0.340, 0.302, 0.263, 1.000)
		BumpHeight      7.72787
		BumpOffset      1.54557
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000386333
		Period          0.00126227
		Eccentricity    1.91798e-005
		Inclination     0.0140749
		AscendingNode   -7.06525
		ArgOfPericenter 59.6023
		MeanAnomaly     -74.3003
	}
}

DwarfMoon	"10.D3"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            2.44461e-010
	Radius          9.18386
	InertiaMoment   0.398724

	Oblateness      0.225393

	Obliquity       0.000812232
	EqAscendNode    -102.668
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.460 0.404 0.349)

	Surface
	{
		SurfStyle       0.326833
		OceanStyle      0.468294
		Randomize      (0.382, -0.090, -0.197)
		colorDistMagn   0.195735
		colorDistFreq   0.0577729
		detailScale     250.781
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.735576
		terraceProb     0.188945
		erosion         0
		montesMagn      0.49033
		montesFreq      2.30825
		montesSpiky     0.932914
		montesFraction  0.476656
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.237412
		hillsFraction   0.600043
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22907
		craterFreq      0.160893
		craterDensity   0.822312
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   92.0929
		volcanoTemp     1466.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.162, 0.140, 0.000)
		colorShelf     (0.195, 0.172, 0.148, 0.000)
		colorBeach     (0.207, 0.182, 0.157, 0.000)
		colorDesert    (0.218, 0.192, 0.166, 0.000)
		colorLowland   (0.230, 0.202, 0.174, 0.000)
		colorUpland    (0.241, 0.212, 0.183, 0.000)
		colorRock      (0.253, 0.222, 0.192, 0.000)
		colorSnow      (0.264, 0.233, 0.201, 1.000)
		BumpHeight      8.26547
		BumpOffset      1.65309
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000397783
		Period          0.0013188
		Eccentricity    7.56937e-005
		Inclination     0.000812232
		AscendingNode   -102.668
		ArgOfPericenter -83.781
		MeanAnomaly     -83.5067
	}
}

Moon	"10.1"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            8.21145e-005
	Radius          360.986
	InertiaMoment   0.397338

	Oblateness      0.0142549

	Obliquity       -0.217788
	EqAscendNode    -177.523
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.575 0.456 0.384)

	Surface
	{
		SurfStyle       0.142261
		OceanStyle      0.988829
		Randomize      (-0.088, -0.298, 0.872)
		colorDistMagn   0.0887555
		colorDistFreq   47.1624
		detailScale     928.476
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.231791
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  0.813677
		icecapHeight    0.24476
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.84155
		venusFreq       0.485246
		venusMagn       0.159387
		mareFreq        0
		mareDensity     9.13075e-005
		terraceProb     0.178798
		erosion         0
		montesMagn      0.0766308
		montesFreq      11.9997
		montesSpiky     0.991011
		montesFraction  0.775464
		dunesMagn       0.0456631
		dunesFreq       476.849
		dunesFraction   0.770814
		hillsMagn       0.137899
		hillsFreq       42.6586
		hillsFraction   0.881843
		hills2Fraction  0.118049
		riversMagn      53.2684
		riversFreq      2.33893
		riversSin       6.43796
		riversOctaves   0
		canyonsMagn     0.610247
		canyonsFreq     0.113585
		canyonFraction  0
		cracksMagn      0.032723
		cracksFreq      0.138796
		cracksOctaves   0
		craterMagn      0.742135
		craterFreq      1.04808
		craterDensity   0.846263
		craterOctaves   8
		craterRayedFactor 0.0836337
		volcanoMagn     0.229104
		volcanoFreq     0.868681
		volcanoDensity  0.0542636
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.0871477
		volcanoRadius   1.3564
		volcanoTemp     1300.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.575, 0.456, 0.384, 0.500)
		colorShelf     (0.547, 0.433, 0.365, 0.500)
		colorBeach     (0.403, 0.319, 0.269, 0.750)
		colorDesert    (0.489, 0.388, 0.326, 1.000)
		colorLowland   (0.506, 0.401, 0.338, 1.000)
		colorUpland    (0.535, 0.424, 0.357, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.506, 0.401, 0.338, 1.000)
		colorUpPlants  (0.535, 0.424, 0.357, 1.000)
		BumpHeight      18.0493
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
		SemiMajorAxis   0.000563572
		Period          0.00222399
		Eccentricity    0.00286237
		Inclination     -0.217788
		AscendingNode   -177.523
		ArgOfPericenter 87.0694
		MeanAnomaly     149.456
	}
}

Moon	"10.2"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            0.000102558
	Radius          412.901
	InertiaMoment   0.393271

	Oblateness      0.0059916

	Obliquity       -1.45484
	EqAscendNode    -48.8359
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.600 0.595 0.591)

	Surface
	{
		SurfStyle       0.854104
		OceanStyle      0.817824
		Randomize      (0.323, -0.961, -0.834)
		colorDistMagn   0.0902259
		colorDistFreq   46.8847
		detailScale     1062.01
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.283346
		snowLevel       2
		tropicLatitude  0.0462238
		icecapLatitude  0.93832
		icecapHeight    0.287061
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.06299
		venusFreq       0.332915
		venusMagn       0
		mareFreq        0
		mareDensity     9.49377e-005
		terraceProb     0.441355
		erosion         0
		montesMagn      0.0473382
		montesFreq      13.4914
		montesSpiky     0.994926
		montesFraction  0.0313756
		dunesMagn       0.0403085
		dunesFreq       551.657
		dunesFraction   0.758244
		hillsMagn       0.108354
		hillsFreq       41.6115
		hillsFraction   0.588127
		hills2Fraction  0.0150243
		riversMagn      64.1105
		riversFreq      1.56963
		riversSin       7.05887
		riversOctaves   0
		canyonsMagn     0.737258
		canyonsFreq     0.140668
		canyonFraction  0
		cracksMagn      0.050073
		cracksFreq      0.200283
		cracksOctaves   0
		craterMagn      0.640343
		craterFreq      0.932857
		craterDensity   0.884381
		craterOctaves   9
		craterRayedFactor 0.448068
		volcanoMagn     0.207366
		volcanoFreq     1.04444
		volcanoDensity  0.0626887
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.196984
		volcanoRadius   1.66913
		volcanoTemp     1396.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.600, 0.446, 0.339, 0.000)
		colorShelf     (0.570, 0.423, 0.322, 0.000)
		colorBeach     (0.300, 0.223, 0.170, 0.000)
		colorDesert    (0.510, 0.379, 0.288, 0.000)
		colorLowland   (0.486, 0.392, 0.322, 0.000)
		colorUpland    (0.558, 0.414, 0.315, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.486, 0.392, 0.322, 0.000)
		colorUpPlants  (0.558, 0.414, 0.315, 0.000)
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
		SemiMajorAxis   0.00079504
		Period          0.00372641
		Eccentricity    0.00527541
		Inclination     -1.45484
		AscendingNode   -48.8359
		ArgOfPericenter -165.215
		MeanAnomaly     -150.216
	}
}

Moon	"10.3"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            0.000125898
	Radius          416.09
	InertiaMoment   0.399541

	Oblateness      0.00182141

	Obliquity       0.066076
	EqAscendNode    15.1161
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.569 0.564 0.553)

	Surface
	{
		SurfStyle       0.283622
		OceanStyle      0.371008
		Randomize      (0.957, -0.616, 0.808)
		colorDistMagn   0.0513468
		colorDistFreq   43.6222
		detailScale     1070.21
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.210426
		snowLevel       2
		tropicLatitude  0.00229024
		icecapLatitude  0.904654
		icecapHeight    0.218244
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.84327
		venusFreq       1.04887
		venusMagn       0
		mareFreq        0
		mareDensity     0.000119749
		terraceProb     0.424245
		erosion         0
		montesMagn      0.0728607
		montesFreq      14.0198
		montesSpiky     0.876375
		montesFraction  0.6732
		dunesMagn       0.0455465
		dunesFreq       542.215
		dunesFraction   0.217001
		hillsMagn       0.116913
		hillsFreq       51.1664
		hillsFraction   0.392232
		hills2Fraction  0.122516
		riversMagn      60.7748
		riversFreq      1.87366
		riversSin       5.72263
		riversOctaves   0
		canyonsMagn     0.497451
		canyonsFreq     0.132121
		canyonFraction  0
		cracksMagn      0.0562646
		cracksFreq      0.115074
		cracksOctaves   0
		craterMagn      0.585052
		craterFreq      1.05165
		craterDensity   0.894817
		craterOctaves   9
		craterRayedFactor 0.269874
		volcanoMagn     0.201486
		volcanoFreq     1.19123
		volcanoDensity  0.0596489
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.129237
		volcanoRadius   1.73148
		volcanoTemp     1729.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.569, 0.564, 0.553, 0.500)
		colorShelf     (0.541, 0.536, 0.525, 0.500)
		colorBeach     (0.398, 0.395, 0.387, 0.750)
		colorDesert    (0.484, 0.479, 0.470, 1.000)
		colorLowland   (0.501, 0.496, 0.487, 1.000)
		colorUpland    (0.529, 0.525, 0.514, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.501, 0.496, 0.487, 1.000)
		colorUpPlants  (0.529, 0.525, 0.514, 1.000)
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
		SemiMajorAxis   0.00112157
		Period          0.00624381
		Eccentricity    0.0171224
		Inclination     0.066076
		AscendingNode   15.1161
		ArgOfPericenter -93.8656
		MeanAnomaly     171.613
	}
}

Moon	"10.4"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            0.0001525
	Radius          471.103
	InertiaMoment   0.399053

	Obliquity       0.12244
	EqAscendNode    -33.5615
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.532 0.524 0.522)

	Surface
	{
		SurfStyle       0.667952
		OceanStyle      0.84835
		Randomize      (-0.171, -0.801, -0.330)
		colorDistMagn   0.0676349
		colorDistFreq   61.3216
		detailScale     1211.7
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.23023
		snowLevel       2
		tropicLatitude  0.00408525
		icecapLatitude  0.743876
		icecapHeight    0.251082
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.67392
		venusFreq       0.860793
		venusMagn       0.120651
		mareFreq        0
		mareDensity     0.000102365
		terraceProb     0.246021
		erosion         0
		montesMagn      0.0645258
		montesFreq      17.9129
		montesSpiky     0.917629
		montesFraction  0.104638
		dunesMagn       0.048366
		dunesFreq       613.231
		dunesFraction   0.856144
		hillsMagn       0.137397
		hillsFreq       51.8478
		hillsFraction   0.504134
		hills2Fraction  0.0289616
		riversMagn      56.5368
		riversFreq      2.90245
		riversSin       6.92811
		riversOctaves   0
		canyonsMagn     0.614495
		canyonsFreq     0.166936
		canyonFraction  0
		cracksMagn      0.0491844
		cracksFreq      0.178204
		cracksOctaves   0
		craterMagn      0.51948
		craterFreq      1.09588
		craterDensity   0.956863
		craterOctaves   9
		craterRayedFactor 0.150426
		volcanoMagn     0.205804
		volcanoFreq     0.947469
		volcanoDensity  0.0568542
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.230129
		volcanoRadius   1.41675
		volcanoTemp     1120.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.341, 0.336, 0.350, 0.250)
		colorShelf     (0.372, 0.383, 0.397, 0.250)
		colorBeach     (0.303, 0.283, 0.303, 0.200)
		colorDesert    (0.282, 0.257, 0.266, 0.200)
		colorLowland   (0.207, 0.199, 0.219, 0.200)
		colorUpland    (0.394, 0.388, 0.397, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.207, 0.199, 0.219, 0.200)
		colorUpPlants  (0.394, 0.388, 0.397, 0.250)
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
		SemiMajorAxis   0.00158222
		Period          0.0104618
		Eccentricity    0.0261661
		Inclination     0.12244
		AscendingNode   -33.5615
		ArgOfPericenter 166.855
		MeanAnomaly     -127.726
	}
}

Moon	"10.5"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            0.000182785
	Radius          470.965
	InertiaMoment   0.3985

	Obliquity       0.0839928
	EqAscendNode    57.8583
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.768 0.578 0.476)

	Surface
	{
		SurfStyle       0.249115
		OceanStyle      0.0132902
		Randomize      (0.797, -0.060, -0.457)
		colorDistMagn   0.0723995
		colorDistFreq   42.6813
		detailScale     1211.35
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.162308
		snowLevel       2
		tropicLatitude  0.00256057
		icecapLatitude  0.998925
		icecapHeight    0.1624
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.66452
		venusFreq       0.811051
		venusMagn       0.134165
		mareFreq        0
		mareDensity     0.000140158
		terraceProb     0.672503
		erosion         0
		montesMagn      0.0578491
		montesFreq      19.8581
		montesSpiky     0.964029
		montesFraction  0.956931
		dunesMagn       0.0514103
		dunesFreq       629.841
		dunesFraction   0.842743
		hillsMagn       0.113232
		hillsFreq       42.5241
		hillsFraction   0.587909
		hills2Fraction  0.0437965
		riversMagn      54.8933
		riversFreq      2.32024
		riversSin       6.98117
		riversOctaves   0
		canyonsMagn     0.432126
		canyonsFreq     0.149838
		canyonFraction  0
		cracksMagn      0.051355
		cracksFreq      0.152759
		cracksOctaves   0
		craterMagn      0.648297
		craterFreq      0.990046
		craterDensity   0.984407
		craterOctaves   9
		craterRayedFactor 0.0809956
		volcanoMagn     0.224745
		volcanoFreq     1.08524
		volcanoDensity  0.0655955
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.311606
		volcanoRadius   1.4818
		volcanoTemp     1070.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.768, 0.578, 0.476, 0.500)
		colorShelf     (0.729, 0.549, 0.453, 0.500)
		colorBeach     (0.537, 0.405, 0.333, 0.750)
		colorDesert    (0.653, 0.491, 0.405, 1.000)
		colorLowland   (0.676, 0.509, 0.419, 1.000)
		colorUpland    (0.714, 0.537, 0.443, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.676, 0.509, 0.419, 1.000)
		colorUpPlants  (0.714, 0.537, 0.443, 1.000)
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
		SemiMajorAxis   0.00223206
		Period          0.0175294
		Eccentricity    0.0442683
		Inclination     0.0839928
		AscendingNode   57.8583
		ArgOfPericenter 46.6407
		MeanAnomaly     -110.084
	}
}

Moon	"10.6"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            0.00217248
	Radius          1136.55
	InertiaMoment   0.397798

	Obliquity       0.381576
	EqAscendNode    -151.161
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.783 0.780 0.775)

	Surface
	{
		SurfStyle       0.586511
		OceanStyle      0.25525
		Randomize      (-0.310, -0.318, -0.730)
		colorDistMagn   0.0643305
		colorDistFreq   140.983
		detailScale     2923.26
		colorConversion true
		drivenDarkening 0.555539
		seaLevel        0.190045
		snowLevel       2
		tropicLatitude  0.00331168
		icecapLatitude  0.751566
		icecapHeight    0.206955
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.6809
		venusFreq       0.849922
		venusMagn       0.243772
		mareFreq        0.379044
		mareDensity     0.000685884
		terraceProb     0.265371
		erosion         0
		montesMagn      0.0563114
		montesFreq      40.881
		montesSpiky     0.948068
		montesFraction  0.651359
		dunesMagn       0.0389821
		dunesFreq       1444.28
		dunesFraction   0.114373
		hillsMagn       0.107921
		hillsFreq       112.668
		hillsFraction   0.824239
		hills2Fraction  0.241201
		riversMagn      65.5187
		riversFreq      4.23619
		riversSin       5.25645
		riversOctaves   0
		canyonsMagn     0.437074
		canyonsFreq     0.394861
		canyonFraction  0
		cracksMagn      0.0385442
		cracksFreq      0.521573
		cracksOctaves   0
		craterMagn      0.581152
		craterFreq      3.96528
		craterDensity   0.893816
		craterOctaves   10
		craterRayedFactor 0.393716
		volcanoMagn     0.220824
		volcanoFreq     1.46912
		volcanoDensity  0.0634957
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.256758
		volcanoRadius   1.40414
		volcanoTemp     1323.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.195, 0.170, 0.000)
		colorShelf     (0.290, 0.242, 0.217, 0.000)
		colorBeach     (0.438, 0.366, 0.325, 0.200)
		colorDesert    (0.399, 0.343, 0.287, 0.500)
		colorLowland   (0.305, 0.265, 0.217, 0.800)
		colorUpland    (0.517, 0.468, 0.403, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.305, 0.265, 0.217, 0.800)
		colorUpPlants  (0.517, 0.468, 0.403, 1.000)
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
		SemiMajorAxis   0.0031488
		Period          0.029369
		Eccentricity    0.04884
		Inclination     0.381576
		AscendingNode   -151.161
		ArgOfPericenter -139.005
		MeanAnomaly     173.883
	}
}

Moon	"10.7"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            0.000256465
	Radius          527.031
	InertiaMoment   0.396592

	Obliquity       -0.449336
	EqAscendNode    -173.798
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.672 0.557 0.443)

	Surface
	{
		SurfStyle       0.869428
		OceanStyle      0.652125
		Randomize      (0.433, 0.746, -0.134)
		colorDistMagn   0.0464955
		colorDistFreq   64.7187
		detailScale     1355.55
		colorConversion true
		drivenDarkening 0.393799
		seaLevel        0.247843
		snowLevel       2
		tropicLatitude  0.000845728
		icecapLatitude  0.744156
		icecapHeight    0.265336
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.06812
		venusFreq       1.29766
		venusMagn       0
		mareFreq        0
		mareDensity     0.000183502
		terraceProb     0.225753
		erosion         0
		montesMagn      0.0620829
		montesFreq      30.8353
		montesSpiky     0.921261
		montesFraction  0.96174
		dunesMagn       0.0457746
		dunesFreq       697.268
		dunesFraction   0.691619
		hillsMagn       0.121824
		hillsFreq       72.0096
		hillsFraction   0.972903
		hills2Fraction  0.103852
		riversMagn      63.5599
		riversFreq      2.1996
		riversSin       7.26328
		riversOctaves   0
		canyonsMagn     0.616116
		canyonsFreq     0.212685
		canyonFraction  0
		cracksMagn      0.0203127
		cracksFreq      0.142465
		cracksOctaves   0
		craterMagn      0.551538
		craterFreq      1.51707
		craterDensity   0.936718
		craterOctaves   9
		craterRayedFactor 0.443617
		volcanoMagn     0.227411
		volcanoFreq     0.974603
		volcanoDensity  0.0614381
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.280638
		volcanoRadius   1.25718
		volcanoTemp     1650.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.672, 0.418, 0.254, 0.000)
		colorShelf     (0.639, 0.397, 0.241, 0.000)
		colorBeach     (0.336, 0.209, 0.127, 0.000)
		colorDesert    (0.571, 0.356, 0.216, 0.000)
		colorLowland   (0.545, 0.368, 0.241, 0.000)
		colorUpland    (0.625, 0.388, 0.237, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.545, 0.368, 0.241, 0.000)
		colorUpPlants  (0.625, 0.388, 0.237, 0.000)
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
		SemiMajorAxis   0.00444207
		Period          0.0492133
		Eccentricity    0.0420615
		Inclination     -0.449336
		AscendingNode   -173.798
		ArgOfPericenter 46.6002
		MeanAnomaly     -37.123
	}
}

Moon	"10.8"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            0.00030111
	Radius          590.546
	InertiaMoment   0.399764

	Obliquity       0.232861
	EqAscendNode    -150.092
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.576 0.572 0.571)

	Surface
	{
		SurfStyle       0.229532
		OceanStyle      0.0327871
		Randomize      (-0.829, -0.679, -0.353)
		colorDistMagn   0.0969466
		colorDistFreq   70.2772
		detailScale     1518.92
		colorConversion true
		drivenDarkening 0.279149
		seaLevel        0.226275
		snowLevel       2
		tropicLatitude  0.00210018
		icecapLatitude  0.590658
		icecapHeight    0.24068
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.87333
		venusFreq       0.891317
		venusMagn       0.229001
		mareFreq        0
		mareDensity     0.000235494
		terraceProb     0.13325
		erosion         0
		montesMagn      0.046068
		montesFreq      31.5542
		montesSpiky     0.898805
		montesFraction  0.576933
		dunesMagn       0.0410672
		dunesFreq       801.882
		dunesFraction   0.990572
		hillsMagn       0.118087
		hillsFreq       74.5405
		hillsFraction   0.435285
		hills2Fraction  0.266672
		riversMagn      52.172
		riversFreq      2.43531
		riversSin       5.09246
		riversOctaves   0
		canyonsMagn     0.382689
		canyonsFreq     0.149113
		canyonFraction  0
		cracksMagn      0.0416305
		cracksFreq      0.162661
		cracksOctaves   0
		craterMagn      0.687205
		craterFreq      1.42934
		craterDensity   0.834141
		craterOctaves   9
		craterRayedFactor 0.166663
		volcanoMagn     0.222507
		volcanoFreq     1.13745
		volcanoDensity  0.0675666
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.202993
		volcanoRadius   1.51729
		volcanoTemp     1611.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.576, 0.572, 0.571, 0.500)
		colorShelf     (0.547, 0.544, 0.542, 0.500)
		colorBeach     (0.403, 0.401, 0.400, 0.750)
		colorDesert    (0.490, 0.486, 0.485, 1.000)
		colorLowland   (0.507, 0.504, 0.502, 1.000)
		colorUpland    (0.536, 0.532, 0.531, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.507, 0.504, 0.502, 1.000)
		colorUpPlants  (0.536, 0.532, 0.531, 1.000)
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
		SemiMajorAxis   0.00626649
		Period          0.0824595
		Eccentricity    0.0344254
		Inclination     0.232861
		AscendingNode   -150.092
		ArgOfPericenter -97.592
		MeanAnomaly     62.5457
	}
}

Comet	"C1"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.58152e-012
	Radius          1.58871
	InertiaMoment   0.399616

	Oblateness      0.00892909

	RotationPeriod  52.0429
	Obliquity       353.023
	EqAscendNode    342.836

	AbsMagn         4.15283
	SlopeParam      4.16922
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.722 0.719 0.717)

	Surface
	{
		SurfStyle       0.0533749
		OceanStyle      0.0395866
		Randomize      (0.396, -0.911, -0.649)
		colorDistMagn   0.646187
		colorDistFreq   0.00112526
		detailScale     43.3824
		colorConversion true
		snowLevel       2
		tropicLatitude  0.787559
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413835
		terraceProb     0.176901
		erosion         0
		montesMagn      0.4681
		montesFreq      3.24331
		montesSpiky     0.994663
		montesFraction  0.579337
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00689482
		hillsFraction   0.660219
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233787
		craterFreq      0.239316
		craterDensity   0.804825
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   198.067
		volcanoTemp     1662.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.288, 0.287, 0.000)
		colorShelf     (0.307, 0.306, 0.305, 0.000)
		colorBeach     (0.325, 0.324, 0.323, 0.000)
		colorDesert    (0.343, 0.342, 0.340, 0.000)
		colorLowland   (0.361, 0.360, 0.358, 0.000)
		colorUpland    (0.379, 0.378, 0.376, 0.000)
		colorRock      (0.397, 0.396, 0.394, 0.000)
		colorSnow      (0.415, 0.414, 0.412, 1.000)
		BumpHeight      1.42984
		BumpOffset      0.285968
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.405886
		GasToDust   0.25
		Particles   1799
		GasBright   0.154101
		DustBright  0.695198
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.20234
		Period          26.7579
		Eccentricity    0.972386
		Inclination     -58.9346
		AscendingNode   -179.817
		ArgOfPericenter -113.915
		MeanAnomaly     -178.687
	}
}

Comet	"C2"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.2232e-008
	Radius          34.4063
	InertiaMoment   0.398426

	Oblateness      0.0125338

	RotationPeriod  50.2266
	Obliquity       306.229
	EqAscendNode    327.414

	AbsMagn         5.90563
	SlopeParam      3.14669
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.560 0.417 0.348)

	Surface
	{
		SurfStyle       0.591338
		OceanStyle      0.742312
		Randomize      (-0.596, 0.884, 0.126)
		colorDistMagn   0.314923
		colorDistFreq   0.31761
		detailScale     939.521
		colorConversion true
		snowLevel       2
		tropicLatitude  0.963802
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.747209
		terraceProb     0.215467
		erosion         0
		montesMagn      0.562449
		montesFreq      2.81378
		montesSpiky     0.888968
		montesFraction  0.721847
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.98304
		hillsFraction   0.615662
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224498
		craterFreq      0.193022
		craterDensity   0.979473
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   48.7748
		volcanoTemp     1519.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.142, 0.098, 0.000)
		colorShelf     (0.224, 0.146, 0.112, 0.000)
		colorBeach     (0.263, 0.171, 0.132, 0.000)
		colorDesert    (0.285, 0.183, 0.129, 0.000)
		colorLowland   (0.313, 0.196, 0.146, 0.000)
		colorUpland    (0.347, 0.238, 0.178, 0.000)
		colorRock      (0.375, 0.259, 0.192, 0.000)
		colorSnow      (0.409, 0.275, 0.202, 1.000)
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
		MaxLength   0.887078
		GasToDust   0.25
		Particles   2771
		GasBright   0.12837
		DustBright  0.405415
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.53523
		Period          21.7796
		Eccentricity    0.997775
		Inclination     40.628
		AscendingNode   110.266
		ArgOfPericenter 35.7126
		MeanAnomaly     -120.985
	}
}

Comet	"C3"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            3.76632e-016
	Radius          0.0984022
	InertiaMoment   0.395119

	Oblateness      0.010122

	RotationPeriod  48.4161
	Obliquity       259.435
	EqAscendNode    311.991

	AbsMagn         7.3198
	SlopeParam      8.00045
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.417 0.415 0.410)

	Surface
	{
		SurfStyle       0.13583
		OceanStyle      0.427382
		Randomize      (-0.734, -0.410, -0.618)
		colorDistMagn   0.639764
		colorDistFreq   8.08373e-006
		detailScale     2.68704
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993639
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.357724
		terraceProb     0.209105
		erosion         0
		montesMagn      0.53473
		montesFreq      3.85329
		montesSpiky     0.964378
		montesFraction  0.339706
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.86677e-005
		hillsFraction   0.913836
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229201
		craterFreq      0.15133
		craterDensity   0.956817
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   794.973
		volcanoTemp     1816.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.166, 0.164, 0.000)
		colorShelf     (0.177, 0.176, 0.174, 0.000)
		colorBeach     (0.188, 0.187, 0.185, 0.000)
		colorDesert    (0.198, 0.197, 0.195, 0.000)
		colorLowland   (0.209, 0.207, 0.205, 0.000)
		colorUpland    (0.219, 0.218, 0.215, 0.000)
		colorRock      (0.230, 0.228, 0.226, 0.000)
		colorSnow      (0.240, 0.239, 0.236, 1.000)
		BumpHeight      0.088562
		BumpOffset      0.0177124
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0653804
		DustBright  0.152892
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.03328
		Period          33.4182
		Eccentricity    0.995702
		Inclination     116.135
		AscendingNode   87.9318
		ArgOfPericenter -51.3281
		MeanAnomaly     131.859
	}
}

Comet	"C4"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.91297e-012
	Radius          2.13047
	InertiaMoment   0.398946

	Oblateness      0.0145403

	RotationPeriod  46.6066
	Obliquity       212.64
	EqAscendNode    296.569

	AbsMagn         8.65148
	SlopeParam      5.53336
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.686 0.587 0.531)

	Surface
	{
		SurfStyle       0.785222
		OceanStyle      0.927047
		Randomize      (0.595, 0.803, 0.718)
		colorDistMagn   0.787866
		colorDistFreq   0.00393978
		detailScale     58.1759
		colorConversion true
		snowLevel       2
		tropicLatitude  0.663707
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.647955
		terraceProb     0.5595
		erosion         0
		montesMagn      0.53873
		montesFreq      3.28681
		montesSpiky     0.833874
		montesFraction  0.0996667
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0117087
		hillsFraction   0.474922
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212317
		craterFreq      0.259912
		craterDensity   1.02876
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   195.71
		volcanoTemp     1725.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.200, 0.149, 0.000)
		colorShelf     (0.274, 0.205, 0.170, 0.000)
		colorBeach     (0.322, 0.241, 0.202, 0.000)
		colorDesert    (0.350, 0.258, 0.196, 0.000)
		colorLowland   (0.384, 0.276, 0.223, 0.000)
		colorUpland    (0.425, 0.335, 0.271, 0.000)
		colorRock      (0.460, 0.364, 0.292, 0.000)
		colorSnow      (0.501, 0.387, 0.308, 1.000)
		BumpHeight      1.91742
		BumpOffset      0.383484
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.438711
		GasToDust   0.25
		Particles   1866
		GasBright   0.251996
		DustBright  0.450763
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.07264
		Period          33.7457
		Eccentricity    0.968107
		Inclination     134.39
		AscendingNode   -65.6476
		ArgOfPericenter -21.8335
		MeanAnomaly     47.7824
	}
}

Comet	"C5"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.25297e-008
	Radius          38.4559
	InertiaMoment   0.397329

	Oblateness      0.0118973

	RotationPeriod  44.7935
	Obliquity       165.846
	EqAscendNode    281.146

	AbsMagn         10.062
	SlopeParam      4.40105
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.674 0.671 0.667)

	Surface
	{
		SurfStyle       0.873714
		OceanStyle      0.65508
		Randomize      (0.887, -0.926, 0.356)
		colorDistMagn   0.218007
		colorDistFreq   0.938691
		detailScale     1050.1
		colorConversion true
		snowLevel       2
		tropicLatitude  0.772818
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.442897
		terraceProb     0.400333
		erosion         0
		montesMagn      0.534489
		montesFreq      2.47571
		montesSpiky     0.890643
		montesFraction  0.342004
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.52113
		hillsFraction   0.579351
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.198641
		craterFreq      0.262476
		craterDensity   0.871416
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   40.169
		volcanoTemp     1610.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.235, 0.267, 0.050)
		colorShelf     (0.270, 0.275, 0.307, 0.040)
		colorBeach     (0.310, 0.315, 0.347, 0.030)
		colorDesert    (0.350, 0.356, 0.393, 0.020)
		colorLowland   (0.391, 0.396, 0.433, 0.030)
		colorUpland    (0.431, 0.436, 0.473, 0.050)
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

	CometTail
	{
		MaxLength   0.919904
		GasToDust   0.25
		Particles   2838
		GasBright   0.161724
		DustBright  0.225522
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.87238
		Period          40.6269
		Eccentricity    0.984853
		Inclination     -57.2407
		AscendingNode   122.321
		ArgOfPericenter 164.352
		MeanAnomaly     -8.73833
	}
}

Comet	"C6"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            6.93706e-016
	Radius          0.131922
	InertiaMoment   0.399403

	Oblateness      0.0170813

	RotationPeriod  42.9723
	Obliquity       119.052
	EqAscendNode    265.723

	AbsMagn         11.8024
	SlopeParam      3.39201
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.619 0.613 0.609)

	Surface
	{
		SurfStyle       0.356295
		OceanStyle      0.960995
		Randomize      (-0.104, 0.834, -0.234)
		colorDistMagn   0.621377
		colorDistFreq   1.08085e-005
		detailScale     3.60234
		colorConversion true
		snowLevel       2
		tropicLatitude  0.887623
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.367809
		terraceProb     0.101538
		erosion         0
		montesMagn      0.437139
		montesFreq      2.61361
		montesSpiky     0.933053
		montesFraction  0.449099
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.92805e-005
		hillsFraction   0.801639
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260019
		craterFreq      0.197028
		craterDensity   0.910691
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   785.298
		volcanoTemp     1553.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.245, 0.244, 0.000)
		colorShelf     (0.263, 0.260, 0.259, 0.000)
		colorBeach     (0.279, 0.276, 0.274, 0.000)
		colorDesert    (0.294, 0.291, 0.289, 0.000)
		colorLowland   (0.310, 0.306, 0.304, 0.000)
		colorUpland    (0.325, 0.322, 0.320, 0.000)
		colorRock      (0.341, 0.337, 0.335, 0.000)
		colorSnow      (0.356, 0.352, 0.350, 1.000)
		BumpHeight      0.11873
		BumpOffset      0.0237459
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.41553
		DustBright  0.456202
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.29409
		Period          27.4688
		Eccentricity    0.965323
		Inclination     3.87277
		AscendingNode   -113.901
		ArgOfPericenter 86.0855
		MeanAnomaly     4.82089
	}
}

Comet	"C7"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            5.36532e-012
	Radius          2.38187
	InertiaMoment   0.398126

	Oblateness      0.0141161

	RotationPeriod  41.1381
	Obliquity       72.2576
	EqAscendNode    250.301

	AbsMagn         15.064
	SlopeParam      2.18195
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.705 0.701 0.699)

	Surface
	{
		SurfStyle       0.322379
		OceanStyle      0.339617
		Randomize      (-0.221, -0.864, -0.189)
		colorDistMagn   0.505068
		colorDistFreq   0.00306554
		detailScale     65.041
		colorConversion true
		snowLevel       2
		tropicLatitude  0.968953
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472391
		terraceProb     0.153059
		erosion         0
		montesMagn      0.376623
		montesFreq      2.69483
		montesSpiky     0.990464
		montesFraction  0.570395
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.013698
		hillsFraction   0.590648
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225916
		craterFreq      0.229421
		craterDensity   0.849451
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   161.223
		volcanoTemp     1511.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.280, 0.280, 0.000)
		colorShelf     (0.300, 0.298, 0.297, 0.000)
		colorBeach     (0.317, 0.315, 0.314, 0.000)
		colorDesert    (0.335, 0.333, 0.332, 0.000)
		colorLowland   (0.353, 0.350, 0.349, 0.000)
		colorUpland    (0.370, 0.368, 0.367, 0.000)
		colorRock      (0.388, 0.385, 0.384, 0.000)
		colorSnow      (0.405, 0.403, 0.402, 1.000)
		BumpHeight      2.14369
		BumpOffset      0.428737
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.471537
		GasToDust   0.25
		Particles   1932
		GasBright   0.0198664
		DustBright  0.536352
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.194
		Period          43.5119
		Eccentricity    0.97143
		Inclination     168.956
		AscendingNode   -106.51
		ArgOfPericenter -118.378
		MeanAnomaly     -73.1735
	}
}

Comet	"C8"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            4.14969e-008
	Radius          51.5423
	InertiaMoment   0.39983

	Oblateness      0.020409

	RotationPeriod  39.2859
	Obliquity       25.4633
	EqAscendNode    234.878

	AbsMagn         2.89801
	SlopeParam      5.86232
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.471 0.468 0.465)

	Surface
	{
		SurfStyle       0.501331
		OceanStyle      0.13805
		Randomize      (0.600, -0.915, -0.948)
		colorDistMagn   0.445219
		colorDistFreq   0.739992
		detailScale     1407.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.156522
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.297796
		terraceProb     0.306876
		erosion         0
		montesMagn      0.386838
		montesFreq      3.21421
		montesSpiky     0.742277
		montesFraction  0.505456
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.04964
		hillsFraction   0.745188
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230641
		craterFreq      0.223241
		craterDensity   0.780868
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   39.67
		volcanoTemp     1377.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.159, 0.130, 0.000)
		colorShelf     (0.188, 0.164, 0.149, 0.000)
		colorBeach     (0.221, 0.192, 0.177, 0.000)
		colorDesert    (0.240, 0.206, 0.172, 0.000)
		colorLowland   (0.264, 0.220, 0.195, 0.000)
		colorUpland    (0.292, 0.267, 0.237, 0.000)
		colorRock      (0.315, 0.290, 0.256, 0.000)
		colorSnow      (0.344, 0.309, 0.270, 1.000)
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
		MaxLength   0.952729
		GasToDust   0.25
		Particles   2904
		GasBright   0.0228097
		DustBright  0.217895
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.53342
		Period          29.3524
		Eccentricity    0.976763
		Inclination     162.921
		AscendingNode   -9.23726
		ArgOfPericenter 36.3815
		MeanAnomaly     -138.803
	}
}

Comet	"C9"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.27772e-015
	Radius          0.147527
	InertiaMoment   0.3987

	Oblateness      0.0170678

	RotationPeriod  37.4104
	Obliquity       338.669
	EqAscendNode    219.456

	AbsMagn         5.08753
	SlopeParam      4.63842
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.512 0.503 0.498)

	Surface
	{
		SurfStyle       0.635429
		OceanStyle      0.248185
		Randomize      (-0.423, 0.836, 0.035)
		colorDistMagn   0.416945
		colorDistFreq   7.87011e-006
		detailScale     4.02848
		colorConversion true
		snowLevel       2
		tropicLatitude  0.613367
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.569903
		terraceProb     0.133826
		erosion         0
		montesMagn      0.371256
		montesFreq      3.63423
		montesSpiky     0.803322
		montesFraction  0.717317
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.34338e-005
		hillsFraction   0.736176
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268192
		craterFreq      0.2061
		craterDensity   0.82571
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   647.084
		volcanoTemp     1462.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.171, 0.140, 0.000)
		colorShelf     (0.205, 0.176, 0.159, 0.000)
		colorBeach     (0.241, 0.206, 0.189, 0.000)
		colorDesert    (0.261, 0.221, 0.184, 0.000)
		colorLowland   (0.287, 0.236, 0.209, 0.000)
		colorUpland    (0.317, 0.286, 0.254, 0.000)
		colorRock      (0.343, 0.312, 0.274, 0.000)
		colorSnow      (0.374, 0.332, 0.289, 1.000)
		BumpHeight      0.132775
		BumpOffset      0.0265549
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0231714
		GasToDust   0.25
		Particles   1026
		GasBright   0.11154
		DustBright  0.613652
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.23072
		Period          26.977
		Eccentricity    0.967854
		Inclination     144.339
		AscendingNode   -98.9465
		ArgOfPericenter 145.907
		MeanAnomaly     104.651
	}
}

Comet	"C10"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            9.88226e-012
	Radius          3.19166
	InertiaMoment   0.396703

	Oblateness      0.0246222

	RotationPeriod  35.5056
	Obliquity       291.875
	EqAscendNode    204.033

	AbsMagn         6.62456
	SlopeParam      3.62848
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.745 0.742 0.739)

	Surface
	{
		SurfStyle       0.766222
		OceanStyle      0.587875
		Randomize      (0.078, -0.016, 0.749)
		colorDistMagn   0.931884
		colorDistFreq   0.00786522
		detailScale     87.1536
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998784
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.706002
		terraceProb     0.156878
		erosion         0
		montesMagn      0.516959
		montesFreq      2.79688
		montesSpiky     0.75969
		montesFraction  0.382914
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0192213
		hillsFraction   0.552498
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223585
		craterFreq      0.140967
		craterDensity   0.899013
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   159.182
		volcanoTemp     1316.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.252, 0.207, 0.000)
		colorShelf     (0.298, 0.260, 0.236, 0.000)
		colorBeach     (0.350, 0.304, 0.281, 0.000)
		colorDesert    (0.380, 0.326, 0.273, 0.000)
		colorLowland   (0.417, 0.349, 0.310, 0.000)
		colorUpland    (0.462, 0.423, 0.377, 0.000)
		colorRock      (0.499, 0.460, 0.406, 0.000)
		colorSnow      (0.544, 0.490, 0.429, 1.000)
		BumpHeight      2.87249
		BumpOffset      0.574499
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.504363
		GasToDust   0.25
		Particles   1998
		GasBright   0.0872011
		DustBright  0.322477
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.89721
		Period          50.0453
		Eccentricity    0.974682
		Inclination     153.42
		AscendingNode   46.8668
		ArgOfPericenter -167.849
		MeanAnomaly     87.1207
	}
}

Comet	"C11"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            7.6432e-008
	Radius          57.6533
	InertiaMoment   0.399182

	Oblateness      0.0211927

	RotationPeriod  33.5652
	Obliquity       245.08
	EqAscendNode    188.61

	AbsMagn         7.97674
	SlopeParam      2.50525
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.750 0.746 0.743)

	Surface
	{
		SurfStyle       0.124971
		OceanStyle      0.287457
		Randomize      (0.914, -0.952, 0.139)
		colorDistMagn   0.972305
		colorDistFreq   2.53847
		detailScale     1574.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.808625
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533636
		terraceProb     0.201761
		erosion         0
		montesMagn      0.381065
		montesFreq      3.95393
		montesSpiky     0.880041
		montesFraction  0.372494
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.96094
		hillsFraction   0.400406
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242885
		craterFreq      0.23244
		craterDensity   0.876997
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.6959
		volcanoTemp     1456.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.298, 0.297, 0.000)
		colorShelf     (0.319, 0.317, 0.316, 0.000)
		colorBeach     (0.338, 0.336, 0.335, 0.000)
		colorDesert    (0.356, 0.354, 0.353, 0.000)
		colorLowland   (0.375, 0.373, 0.372, 0.000)
		colorUpland    (0.394, 0.392, 0.390, 0.000)
		colorRock      (0.413, 0.410, 0.409, 0.000)
		colorSnow      (0.431, 0.429, 0.427, 1.000)
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
		MaxLength   0.985555
		GasToDust   0.25
		Particles   2970
		GasBright   0.243122
		DustBright  0.651043
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.76876
		Period          31.2447
		Eccentricity    0.974225
		Inclination     -128.87
		AscendingNode   117.305
		ArgOfPericenter 41.1972
		MeanAnomaly     -69.0475
	}
}

Comet	"C12"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.35341e-015
	Radius          0.19764
	InertiaMoment   0.397776

	Oblateness      0.0311549

	RotationPeriod  31.5818
	Obliquity       198.286
	EqAscendNode    173.188

	AbsMagn         9.32619
	SlopeParam      6.25151
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.757 0.753 0.751)

	Surface
	{
		SurfStyle       0.315291
		OceanStyle      0.67442
		Randomize      (-0.506, -0.102, -0.351)
		colorDistMagn   0.111288
		colorDistFreq   1.38488e-005
		detailScale     5.39688
		colorConversion true
		snowLevel       2
		tropicLatitude  0.551156
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.358282
		terraceProb     0.101707
		erosion         0
		montesMagn      0.543999
		montesFreq      3.91367
		montesSpiky     0.951698
		montesFraction  0.529827
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000117591
		hillsFraction   0.633989
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241687
		craterFreq      0.140759
		craterDensity   0.772352
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   638.751
		volcanoTemp     1320.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.301, 0.300, 0.000)
		colorShelf     (0.322, 0.320, 0.319, 0.000)
		colorBeach     (0.341, 0.339, 0.338, 0.000)
		colorDesert    (0.360, 0.358, 0.357, 0.000)
		colorLowland   (0.379, 0.377, 0.376, 0.000)
		colorUpland    (0.398, 0.395, 0.394, 0.000)
		colorRock      (0.417, 0.414, 0.413, 0.000)
		colorSnow      (0.436, 0.433, 0.432, 1.000)
		BumpHeight      0.177876
		BumpOffset      0.0355751
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0559974
		GasToDust   0.25
		Particles   1092
		GasBright   0.191501
		DustBright  0.387151
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.51788
		Period          37.5243
		Eccentricity    0.983459
		Inclination     -157.441
		AscendingNode   -69.3493
		ArgOfPericenter 160.564
		MeanAnomaly     44.5234
	}
}

Comet	"C13"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.82018e-011
	Radius          3.57087
	InertiaMoment   0.399621

	Oblateness      0.0273306

	RotationPeriod  29.5473
	Obliquity       151.492
	EqAscendNode    157.765

	AbsMagn         10.8521
	SlopeParam      4.88517
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.649 0.646 0.642)

	Surface
	{
		SurfStyle       0.537631
		OceanStyle      0.602563
		Randomize      (0.237, 0.173, -0.919)
		colorDistMagn   0.892366
		colorDistFreq   0.00669734
		detailScale     97.5085
		colorConversion true
		snowLevel       2
		tropicLatitude  0.381437
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.646765
		terraceProb     0.578647
		erosion         0
		montesMagn      0.64311
		montesFreq      3.76568
		montesSpiky     0.908906
		montesFraction  0.570897
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.034089
		hillsFraction   0.572808
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244714
		craterFreq      0.254575
		craterDensity   0.929794
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   131.227
		volcanoTemp     1578.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.220, 0.180, 0.000)
		colorShelf     (0.260, 0.226, 0.206, 0.000)
		colorBeach     (0.305, 0.265, 0.244, 0.000)
		colorDesert    (0.331, 0.284, 0.238, 0.000)
		colorLowland   (0.363, 0.304, 0.270, 0.000)
		colorUpland    (0.402, 0.368, 0.328, 0.000)
		colorRock      (0.435, 0.401, 0.353, 0.000)
		colorSnow      (0.474, 0.427, 0.373, 1.000)
		BumpHeight      3.21378
		BumpOffset      0.642757
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.537189
		GasToDust   0.25
		Particles   2065
		GasBright   0.102621
		DustBright  0.160517
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.06808
		Period          51.6782
		Eccentricity    0.981001
		Inclination     7.67719
		AscendingNode   32.9199
		ArgOfPericenter 164.191
		MeanAnomaly     15.8956
	}
}

Comet	"C14"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.40778e-007
	Radius          77.2211
	InertiaMoment   0.398433

	Oblateness      0.0412158

	RotationPeriod  27.4521
	Obliquity       104.697
	EqAscendNode    142.343

	AbsMagn         12.9987
	SlopeParam      3.85985
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.560 0.492 0.380)

	Surface
	{
		SurfStyle       0.822563
		OceanStyle      0.190897
		Randomize      (0.509, 0.195, -0.375)
		colorDistMagn   0.583078
		colorDistFreq   4.19267
		detailScale     2108.65
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994602
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496
		terraceProb     0.460926
		erosion         0
		montesMagn      0.27818
		montesFreq      2.93746
		montesSpiky     0.894797
		montesFraction  0.769559
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.1926
		hillsFraction   0.684915
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241952
		craterFreq      0.165091
		craterDensity   0.920229
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.2681
		volcanoTemp     1446.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.167, 0.106, 0.000)
		colorShelf     (0.224, 0.172, 0.122, 0.000)
		colorBeach     (0.263, 0.202, 0.144, 0.000)
		colorDesert    (0.286, 0.216, 0.141, 0.000)
		colorLowland   (0.314, 0.231, 0.160, 0.000)
		colorUpland    (0.347, 0.280, 0.194, 0.000)
		colorRock      (0.375, 0.305, 0.209, 0.000)
		colorSnow      (0.409, 0.325, 0.220, 1.000)
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
		GasBright   0.335709
		DustBright  0.411916
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.52626
		Period          21.7151
		Eccentricity    0.975379
		Inclination     112.598
		AscendingNode   -76.9754
		ArgOfPericenter 163.257
		MeanAnomaly     -37.8646
	}
}

Comet	"C15"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            4.33467e-015
	Radius          0.221168
	InertiaMoment   0.395216

	Oblateness      0.0366265

	RotationPeriod  25.2848
	Obliquity       57.9032
	EqAscendNode    126.92

	AbsMagn         0.702983
	SlopeParam      2.79349
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.623 0.480 0.381)

	Surface
	{
		SurfStyle       0.613848
		OceanStyle      0.350885
		Randomize      (0.086, -0.195, -0.258)
		colorDistMagn   0.654065
		colorDistFreq   3.6549e-005
		detailScale     6.03935
		colorConversion true
		snowLevel       2
		tropicLatitude  0.804788
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.347246
		terraceProb     0.157085
		erosion         0
		montesMagn      0.530447
		montesFreq      2.67247
		montesSpiky     0.993353
		montesFraction  0.789201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000114712
		hillsFraction   0.521297
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226865
		craterFreq      0.156076
		craterDensity   0.854469
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   526.684
		volcanoTemp     1625.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.163, 0.107, 0.000)
		colorShelf     (0.249, 0.168, 0.122, 0.000)
		colorBeach     (0.293, 0.197, 0.145, 0.000)
		colorDesert    (0.318, 0.211, 0.141, 0.000)
		colorLowland   (0.349, 0.226, 0.160, 0.000)
		colorUpland    (0.387, 0.274, 0.194, 0.000)
		colorRock      (0.418, 0.298, 0.210, 0.000)
		colorSnow      (0.455, 0.317, 0.221, 1.000)
		BumpHeight      0.199051
		BumpOffset      0.0398102
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0888232
		GasToDust   0.25
		Particles   1159
		GasBright   0.00349098
		DustBright  0.42862
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.80899
		Period          49.209
		Eccentricity    0.983905
		Inclination     -175.53
		AscendingNode   165.156
		ArgOfPericenter -89.0654
		MeanAnomaly     19.9211
	}
}

Comet	"C16"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            3.35255e-011
	Radius          4.78192
	InertiaMoment   0.398952

	Oblateness      0.0585011

	RotationPeriod  23.0318
	Obliquity       11.1089
	EqAscendNode    111.497

	AbsMagn         4.12382
	SlopeParam      6.75234
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.447 0.440 0.436)

	Surface
	{
		SurfStyle       0.632103
		OceanStyle      0.700952
		Randomize      (0.554, 0.945, 0.800)
		colorDistMagn   0.599745
		colorDistFreq   0.00760674
		detailScale     130.578
		colorConversion true
		snowLevel       2
		tropicLatitude  0.959136
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.64084
		terraceProb     0.346519
		erosion         0
		montesMagn      0.547487
		montesFreq      2.56657
		montesSpiky     0.799349
		montesFraction  0.396982
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0482546
		hillsFraction   0.682376
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228576
		craterFreq      0.238291
		craterDensity   0.913634
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   129.485
		volcanoTemp     1752.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.150, 0.122, 0.000)
		colorShelf     (0.179, 0.154, 0.140, 0.000)
		colorBeach     (0.210, 0.181, 0.166, 0.000)
		colorDesert    (0.228, 0.194, 0.161, 0.000)
		colorLowland   (0.250, 0.207, 0.183, 0.000)
		colorUpland    (0.277, 0.251, 0.222, 0.000)
		colorRock      (0.299, 0.273, 0.240, 0.000)
		colorSnow      (0.326, 0.291, 0.253, 1.000)
		BumpHeight      4.30373
		BumpOffset      0.860745
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.570015
		GasToDust   0.25
		Particles   2131
		GasBright   0.0615258
		DustBright  0.855072
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.0561
		Period          33.6079
		Eccentricity    0.975476
		Inclination     63.1345
		AscendingNode   -20.978
		ArgOfPericenter 179.222
		MeanAnomaly     -126.935
	}
}

Comet	"C17"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.59296e-007
	Radius          86.4305
	InertiaMoment   0.397342

	Oblateness      0.055083

	RotationPeriod  20.6765
	Obliquity       324.315
	EqAscendNode    96.0749

	AbsMagn         5.88472
	SlopeParam      5.14623
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.721 0.648 0.564)

	Surface
	{
		SurfStyle       0.471592
		OceanStyle      0.372972
		Randomize      (0.367, -0.619, 0.754)
		colorDistMagn   0.919324
		colorDistFreq   2.3595
		detailScale     2360.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991531
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.691589
		terraceProb     0.422594
		erosion         0
		montesMagn      0.443611
		montesFreq      3.18973
		montesSpiky     0.76511
		montesFraction  0.62404
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.1356
		hillsFraction   0.572403
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230673
		craterFreq      0.223672
		craterDensity   1.02918
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.6118
		volcanoTemp     1221.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.259, 0.226, 0.000)
		colorShelf     (0.306, 0.275, 0.240, 0.000)
		colorBeach     (0.324, 0.292, 0.254, 0.000)
		colorDesert    (0.342, 0.308, 0.268, 0.000)
		colorLowland   (0.360, 0.324, 0.282, 0.000)
		colorUpland    (0.378, 0.340, 0.296, 0.000)
		colorRock      (0.397, 0.356, 0.310, 0.000)
		colorSnow      (0.415, 0.373, 0.324, 1.000)
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
		GasBright   0.0758385
		DustBright  0.525246
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.31825
		Period          44.644
		Eccentricity    0.987264
		Inclination     -47.3446
		AscendingNode   -11.4398
		ArgOfPericenter 95.9637
		MeanAnomaly     -57.4261
	}
}

Comet	"C18"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            7.98392e-015
	Radius          0.296124
	InertiaMoment   0.399408

	Oblateness      0.0936036

	RotationPeriod  18.1979
	Obliquity       277.52
	EqAscendNode    80.6523

	AbsMagn         7.30132
	SlopeParam      4.08936
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.654 0.652 0.648)

	Surface
	{
		SurfStyle       0.522977
		OceanStyle      0.825966
		Randomize      (0.538, 0.621, -0.879)
		colorDistMagn   0.664118
		colorDistFreq   6.63259e-005
		detailScale     8.08615
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987426
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.631135
		terraceProb     0.134689
		erosion         0
		montesMagn      0.521666
		montesFreq      3.51178
		montesSpiky     0.928622
		montesFraction  0.450997
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000231865
		hillsFraction   0.43208
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250241
		craterFreq      0.265193
		craterDensity   0.928988
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   519.602
		volcanoTemp     1608.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.222, 0.181, 0.000)
		colorShelf     (0.262, 0.228, 0.207, 0.000)
		colorBeach     (0.307, 0.267, 0.246, 0.000)
		colorDesert    (0.334, 0.287, 0.240, 0.000)
		colorLowland   (0.366, 0.306, 0.272, 0.000)
		colorUpland    (0.406, 0.372, 0.330, 0.000)
		colorRock      (0.438, 0.404, 0.356, 0.000)
		colorSnow      (0.478, 0.430, 0.376, 1.000)
		BumpHeight      0.266511
		BumpOffset      0.0533023
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.121649
		GasToDust   0.25
		Particles   1225
		GasBright   0.0528919
		DustBright  0.232679
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.36073
		Period          45.0333
		Eccentricity    0.984385
		Inclination     85.8675
		AscendingNode   99.7532
		ArgOfPericenter 100.198
		MeanAnomaly     -165.125
	}
}

Comet	"C19"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            6.17499e-011
	Radius          5.35315
	InertiaMoment   0.398134

	Oblateness      0.0972103

	RotationPeriod  15.5693
	Obliquity       230.726
	EqAscendNode    65.2297

	AbsMagn         8.63304
	SlopeParam      3.05856
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.784 0.782 0.778)

	Surface
	{
		SurfStyle       0.21208
		OceanStyle      0.616629
		Randomize      (-0.074, 0.410, 0.245)
		colorDistMagn   0.107086
		colorDistFreq   0.00942774
		detailScale     146.177
		colorConversion true
		snowLevel       2
		tropicLatitude  0.506162
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.725628
		terraceProb     0.166021
		erosion         0
		montesMagn      0.50743
		montesFreq      3.15726
		montesSpiky     0.917272
		montesFraction  0.458854
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0624174
		hillsFraction   0.377387
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244195
		craterFreq      0.201991
		craterDensity   0.93883
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   106.806
		volcanoTemp     1331.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.313, 0.311, 0.000)
		colorShelf     (0.333, 0.332, 0.331, 0.000)
		colorBeach     (0.353, 0.352, 0.350, 0.000)
		colorDesert    (0.372, 0.371, 0.370, 0.000)
		colorLowland   (0.392, 0.391, 0.389, 0.000)
		colorUpland    (0.412, 0.410, 0.409, 0.000)
		colorRock      (0.431, 0.430, 0.428, 0.000)
		colorSnow      (0.451, 0.450, 0.448, 1.000)
		BumpHeight      4.81784
		BumpOffset      0.963567
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.602841
		GasToDust   0.25
		Particles   2197
		GasBright   0.188094
		DustBright  0.581963
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.56702
		Period          46.9396
		Eccentricity    0.974762
		Inclination     -154.949
		AscendingNode   -151.83
		ArgOfPericenter 103.943
		MeanAnomaly     173.831
	}
}

Comet	"C20"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            4.7759e-007
	Radius          115.704
	InertiaMoment   0.399835

	Oblateness      0.190301

	RotationPeriod  12.7552
	Obliquity       183.932
	EqAscendNode    49.8071

	AbsMagn         10.0412
	SlopeParam      7.53353
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.719 0.714 0.711)

	Surface
	{
		SurfStyle       0.329458
		OceanStyle      0.673899
		Randomize      (0.702, 0.696, 0.585)
		colorDistMagn   0.440019
		colorDistFreq   7.85213
		detailScale     3159.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.271845
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.569375
		terraceProb     0.642765
		erosion         0
		montesMagn      0.504384
		montesFreq      3.36457
		montesSpiky     0.964095
		montesFraction  0.465561
		dunesFraction   0
		hillsMagn       0
		hillsFreq       38.1432
		hillsFraction   0.634662
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266712
		craterFreq      0.433198
		craterDensity   0.901352
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.2498
		volcanoTemp     1243.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.286, 0.284, 0.000)
		colorShelf     (0.306, 0.303, 0.302, 0.000)
		colorBeach     (0.324, 0.321, 0.320, 0.000)
		colorDesert    (0.342, 0.339, 0.338, 0.000)
		colorLowland   (0.360, 0.357, 0.356, 0.000)
		colorUpland    (0.378, 0.375, 0.373, 0.000)
		colorRock      (0.396, 0.393, 0.391, 0.000)
		colorSnow      (0.414, 0.411, 0.409, 1.000)
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
		GasBright   0.137866
		DustBright  0.316678
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.46545
		Period          14.5476
		Eccentricity    0.951573
		Inclination     11.8637
		AscendingNode   6.85845
		ArgOfPericenter 178.56
		MeanAnomaly     -7.836
	}
}

Comet	"C21"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.47053e-014
	Radius          0.33155
	InertiaMoment   0.398707

	Oblateness      0.249

	RotationPeriod  9.70738
	Obliquity       137.137
	EqAscendNode    34.3845

	AbsMagn         11.7739
	SlopeParam      5.42853
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.776 0.773 0.771)

	Surface
	{
		SurfStyle       0.196827
		OceanStyle      0.343142
		Randomize      (-0.742, 0.222, 0.014)
		colorDistMagn   0.377508
		colorDistFreq   9.78756e-005
		detailScale     9.05353
		colorConversion true
		snowLevel       2
		tropicLatitude  0.273839
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.523839
		terraceProb     0.207151
		erosion         0
		montesMagn      0.573943
		montesFreq      2.47919
		montesSpiky     0.895028
		montesFraction  0.476363
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000216489
		hillsFraction   0.402658
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205586
		craterFreq      0.254962
		craterDensity   0.928583
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   428.665
		volcanoTemp     1695.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.309, 0.308, 0.000)
		colorShelf     (0.330, 0.329, 0.328, 0.000)
		colorBeach     (0.349, 0.348, 0.347, 0.000)
		colorDesert    (0.369, 0.367, 0.366, 0.000)
		colorLowland   (0.388, 0.387, 0.386, 0.000)
		colorUpland    (0.407, 0.406, 0.405, 0.000)
		colorRock      (0.427, 0.425, 0.424, 0.000)
		colorSnow      (0.446, 0.445, 0.443, 1.000)
		BumpHeight      0.298395
		BumpOffset      0.059679
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.154475
		GasToDust   0.25
		Particles   1291
		GasBright   0.340258
		DustBright  0.598772
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.41006
		Period          20.8843
		Eccentricity    0.958449
		Inclination     29.6623
		AscendingNode   15.2162
		ArgOfPericenter 13.8071
		MeanAnomaly     -52.0712
	}
}

Comet	"C22"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.13736e-010
	Radius          7.16519
	InertiaMoment   0.396723

	Oblateness      0.249

	RotationPeriod  6.35702
	Obliquity       90.3431
	EqAscendNode    18.962

	AbsMagn         14.9791
	SlopeParam      4.32005
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.826 0.788 0.755)

	Surface
	{
		SurfStyle       0.371174
		OceanStyle      0.258453
		Randomize      (0.517, 0.938, -0.227)
		colorDistMagn   0.746143
		colorDistFreq   0.0235917
		detailScale     195.657
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987498
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.647264
		terraceProb     0.621105
		erosion         0
		montesMagn      0.597977
		montesFreq      3.11735
		montesSpiky     0.81166
		montesFraction  0.48762
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.130894
		hillsFraction   0.418775
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206566
		craterFreq      0.21605
		craterDensity   0.888407
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   105.338
		volcanoTemp     1745.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.330, 0.315, 0.302, 0.000)
		colorShelf     (0.351, 0.335, 0.321, 0.000)
		colorBeach     (0.372, 0.355, 0.340, 0.000)
		colorDesert    (0.392, 0.374, 0.358, 0.000)
		colorLowland   (0.413, 0.394, 0.377, 0.000)
		colorUpland    (0.433, 0.414, 0.396, 0.000)
		colorRock      (0.454, 0.434, 0.415, 0.000)
		colorSnow      (0.475, 0.453, 0.434, 1.000)
		BumpHeight      6.44867
		BumpOffset      1.28973
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.635667
		GasToDust   0.25
		Particles   2263
		GasBright   0.262747
		DustBright  0.36077
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.12412
		Period          34.1757
		Eccentricity    0.967793
		Inclination     -108.677
		AscendingNode   -80.5394
		ArgOfPericenter -32.2868
		MeanAnomaly     121.64
	}
}

Comet	"C23"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            3.502e-018
	Radius          0.0205346
	InertiaMoment   0.399188

	Oblateness      0.249

	RotationPeriod  2.60087
	Obliquity       43.5488
	EqAscendNode    3.53936

	AbsMagn         2.85668
	SlopeParam      3.308
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.474 0.466 0.462)

	Surface
	{
		SurfStyle       0.00495978
		OceanStyle      0.918951
		Randomize      (0.728, -0.103, -0.823)
		colorDistMagn   0.817615
		colorDistFreq   2.1619e-007
		detailScale     0.560732
		colorConversion true
		snowLevel       2
		tropicLatitude  0.86796
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431558
		terraceProb     0.23764
		erosion         0
		montesMagn      0.549978
		montesFreq      3.01257
		montesSpiky     0.885027
		montesFraction  0.305051
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.91816e-007
		hillsFraction   0.601461
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209476
		craterFreq      0.275778
		craterDensity   0.961759
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1720.42
		volcanoTemp     1890.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.186, 0.185, 0.000)
		colorShelf     (0.201, 0.198, 0.197, 0.000)
		colorBeach     (0.213, 0.210, 0.208, 0.000)
		colorDesert    (0.225, 0.221, 0.220, 0.000)
		colorLowland   (0.237, 0.233, 0.231, 0.000)
		colorUpland    (0.249, 0.244, 0.243, 0.000)
		colorRock      (0.261, 0.256, 0.254, 0.000)
		colorSnow      (0.273, 0.268, 0.266, 1.000)
		BumpHeight      0.0184812
		BumpOffset      0.00369623
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.147978
		DustBright  0.160026
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.80807
		Period          16.7576
		Eccentricity    0.966576
		Inclination     155.7
		AscendingNode   125.327
		ArgOfPericenter 135.401
		MeanAnomaly     -40.3064
	}
}

Comet	"C24"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.70854e-014
	Radius          0.443721
	InertiaMoment   0.397786

	Oblateness      0.00203092

	RotationPeriod  122.658
	Obliquity       356.755
	EqAscendNode    348.117

	AbsMagn         5.06375
	SlopeParam      2.05798
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.538 0.483 0.437)

	Surface
	{
		SurfStyle       0.2036
		OceanStyle      0.480931
		Randomize      (0.540, 0.790, -0.712)
		colorDistMagn   0.198225
		colorDistFreq   8.48856e-005
		detailScale     12.1166
		colorConversion true
		snowLevel       2
		tropicLatitude  0.254
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.425368
		terraceProb     0.593334
		erosion         0
		montesMagn      0.660211
		montesFreq      3.21688
		montesSpiky     0.995728
		montesFraction  0.46198
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000463533
		hillsFraction   0.790543
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259199
		craterFreq      0.160058
		craterDensity   0.968094
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   422.716
		volcanoTemp     1511.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.193, 0.175, 0.000)
		colorShelf     (0.228, 0.205, 0.186, 0.000)
		colorBeach     (0.242, 0.217, 0.197, 0.000)
		colorDesert    (0.255, 0.229, 0.208, 0.000)
		colorLowland   (0.269, 0.242, 0.218, 0.000)
		colorUpland    (0.282, 0.254, 0.229, 0.000)
		colorRock      (0.296, 0.266, 0.240, 0.000)
		colorSnow      (0.309, 0.278, 0.251, 1.000)
		BumpHeight      0.399349
		BumpOffset      0.0798699
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.187301
		GasToDust   0.25
		Particles   1358
		GasBright   0.0312924
		DustBright  0.761198
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.73236
		Period          48.4865
		Eccentricity    0.983554
		Inclination     165.844
		AscendingNode   -86.3812
		ArgOfPericenter 74.9786
		MeanAnomaly     99.7021
	}
}

Comet	"C25"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.09486e-010
	Radius          8.02456
	InertiaMoment   0.399626

	Oblateness      0.00189574

	RotationPeriod  111.406
	Obliquity       309.96
	EqAscendNode    332.694

	AbsMagn         6.60523
	SlopeParam      5.7427
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.503 0.499 0.496)

	Surface
	{
		SurfStyle       0.959565
		OceanStyle      0.934624
		Randomize      (-0.730, -0.224, 0.944)
		colorDistMagn   0.218493
		colorDistFreq   0.0272358
		detailScale     219.124
		colorConversion true
		snowLevel       2
		tropicLatitude  0.784448
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.454931
		terraceProb     0.26524
		erosion         0
		montesMagn      0.515593
		montesFreq      3.27963
		montesSpiky     0.882234
		montesFraction  0.395438
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.153773
		hillsFraction   0.605551
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205742
		craterFreq      0.21853
		craterDensity   1.03299
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   86.9259
		volcanoTemp     1135.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.175, 0.198, 0.050)
		colorShelf     (0.201, 0.205, 0.228, 0.040)
		colorBeach     (0.231, 0.235, 0.258, 0.030)
		colorDesert    (0.261, 0.265, 0.293, 0.020)
		colorLowland   (0.292, 0.295, 0.322, 0.030)
		colorUpland    (0.322, 0.325, 0.352, 0.050)
		colorRock      (0.352, 0.355, 0.392, 0.020)
		colorSnow      (0.352, 0.355, 0.392, 1.000)
		BumpHeight      7.22211
		BumpOffset      1.44442
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.668493
		GasToDust   0.25
		Particles   2330
		GasBright   0.0469972
		DustBright  0.42998
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.81117
		Period          31.5899
		Eccentricity    0.971265
		Inclination     32.0943
		AscendingNode   79.2313
		ArgOfPericenter 118.622
		MeanAnomaly     143.367
	}
}

Comet	"C26"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            6.45025e-018
	Radius          0.0274788
	InertiaMoment   0.39844

	Oblateness      0.00281171

	RotationPeriod  104.232
	Obliquity       263.166
	EqAscendNode    317.272

	AbsMagn         7.95853
	SlopeParam      4.55509
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.543 0.446 0.330)

	Surface
	{
		SurfStyle       0.168962
		OceanStyle      0.353629
		Randomize      (0.700, 0.425, 0.739)
		colorDistMagn   0.0975959
		colorDistFreq   1.48658e-007
		detailScale     0.750354
		colorConversion true
		snowLevel       2
		tropicLatitude  0.857544
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.353057
		terraceProb     0.158105
		erosion         0
		montesMagn      0.46686
		montesFreq      2.66099
		montesSpiky     0.955199
		montesFraction  0.589702
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.07443e-006
		hillsFraction   0.528138
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249487
		craterFreq      0.235562
		craterDensity   0.855077
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1696.35
		volcanoTemp     1381.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.179, 0.132, 0.000)
		colorShelf     (0.231, 0.190, 0.140, 0.000)
		colorBeach     (0.245, 0.201, 0.148, 0.000)
		colorDesert    (0.258, 0.212, 0.157, 0.000)
		colorLowland   (0.272, 0.223, 0.165, 0.000)
		colorUpland    (0.285, 0.234, 0.173, 0.000)
		colorRock      (0.299, 0.245, 0.181, 0.000)
		colorSnow      (0.312, 0.257, 0.190, 1.000)
		BumpHeight      0.0247309
		BumpOffset      0.00494618
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.151504
		DustBright  0.809959
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.87276
		Period          49.813
		Eccentricity    0.979308
		Inclination     153.19
		AscendingNode   24.2812
		ArgOfPericenter -113.012
		MeanAnomaly     -147.482
	}
}

Comet	"C27"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            4.9888e-014
	Radius          0.496996
	InertiaMoment   0.395303

	Oblateness      0.00236692

	RotationPeriod  98.7788
	Obliquity       216.372
	EqAscendNode    301.849

	AbsMagn         9.30697
	SlopeParam      3.54708
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.405 0.403 0.401)

	Surface
	{
		SurfStyle       0.624582
		OceanStyle      0.557966
		Randomize      (0.318, 0.365, 0.236)
		colorDistMagn   0.273091
		colorDistFreq   0.000200489
		detailScale     13.5713
		colorConversion true
		snowLevel       2
		tropicLatitude  0.779329
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.335972
		terraceProb     0.312719
		erosion         0
		montesMagn      0.455687
		montesFreq      4.11042
		montesSpiky     0.885194
		montesFraction  0.903214
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000582411
		hillsFraction   0.579624
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231482
		craterFreq      0.225867
		craterDensity   0.947219
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   348.868
		volcanoTemp     1742.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.158, 0.137, 0.112, 0.000)
		colorShelf     (0.162, 0.141, 0.128, 0.000)
		colorBeach     (0.190, 0.165, 0.152, 0.000)
		colorDesert    (0.207, 0.177, 0.148, 0.000)
		colorLowland   (0.227, 0.189, 0.168, 0.000)
		colorUpland    (0.251, 0.230, 0.205, 0.000)
		colorRock      (0.272, 0.250, 0.221, 0.000)
		colorSnow      (0.296, 0.266, 0.233, 1.000)
		BumpHeight      0.447297
		BumpOffset      0.0894593
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.220127
		GasToDust   0.25
		Particles   1424
		GasBright   0.139927
		DustBright  0.506023
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.85239
		Period          40.4497
		Eccentricity    0.977081
		Inclination     58.508
		AscendingNode   -114.04
		ArgOfPericenter 155.059
		MeanAnomaly     173.936
	}
}

Comet	"C28"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            3.85847e-010
	Radius          10.7371
	InertiaMoment   0.398958

	Oblateness      0.0034332

	RotationPeriod  94.2919
	Obliquity       169.577
	EqAscendNode    286.426

	AbsMagn         10.8287
	SlopeParam      2.3977
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.772 0.769 0.767)

	Surface
	{
		SurfStyle       0.673977
		OceanStyle      0.445345
		Randomize      (0.211, -0.872, -0.214)
		colorDistMagn   0.183766
		colorDistFreq   0.0716054
		detailScale     293.195
		colorConversion true
		snowLevel       2
		tropicLatitude  0.812079
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.45503
		terraceProb     0.449482
		erosion         0
		montesMagn      0.493691
		montesFreq      3.27473
		montesSpiky     0.930599
		montesFraction  0.345599
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.28567
		hillsFraction   0.717841
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220266
		craterFreq      0.274225
		craterDensity   0.931042
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   85.7011
		volcanoTemp     1247.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.261, 0.215, 0.000)
		colorShelf     (0.309, 0.269, 0.245, 0.000)
		colorBeach     (0.363, 0.315, 0.291, 0.000)
		colorDesert    (0.394, 0.338, 0.284, 0.000)
		colorLowland   (0.433, 0.361, 0.322, 0.000)
		colorUpland    (0.479, 0.438, 0.391, 0.000)
		colorRock      (0.518, 0.477, 0.422, 0.000)
		colorSnow      (0.564, 0.508, 0.445, 1.000)
		BumpHeight      9.66341
		BumpOffset      1.93268
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.701319
		GasToDust   0.25
		Particles   2396
		GasBright   0.0910905
		DustBright  0.239346
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.81991
		Period          49.3123
		Eccentricity    0.984119
		Inclination     -115.444
		AscendingNode   9.73824
		ArgOfPericenter -92.4284
		MeanAnomaly     -131.4
	}
}

Comet	"C29"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.18806e-017
	Radius          0.0307809
	InertiaMoment   0.397354

	Oblateness      0.00283919

	RotationPeriod  90.4276
	Obliquity       122.783
	EqAscendNode    271.004

	AbsMagn         12.9592
	SlopeParam      6.10722
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.712 0.645 0.539)

	Surface
	{
		SurfStyle       0.631724
		OceanStyle      0.982243
		Randomize      (-0.131, -0.944, -0.741)
		colorDistMagn   0.586826
		colorDistFreq   5.60559e-007
		detailScale     0.840525
		colorConversion true
		snowLevel       2
		tropicLatitude  0.782681
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.614978
		terraceProb     0.252177
		erosion         0
		montesMagn      0.51119
		montesFreq      2.64837
		montesSpiky     0.940405
		montesFraction  0.46861
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.4594e-006
		hillsFraction   0.765396
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237612
		craterFreq      0.260187
		craterDensity   0.997127
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1400.13
		volcanoTemp     1747.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.219, 0.151, 0.000)
		colorShelf     (0.285, 0.226, 0.172, 0.000)
		colorBeach     (0.335, 0.265, 0.205, 0.000)
		colorDesert    (0.363, 0.284, 0.199, 0.000)
		colorLowland   (0.399, 0.303, 0.226, 0.000)
		colorUpland    (0.442, 0.368, 0.275, 0.000)
		colorRock      (0.477, 0.400, 0.296, 0.000)
		colorSnow      (0.520, 0.426, 0.312, 1.000)
		BumpHeight      0.0277028
		BumpOffset      0.00554057
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.272765
		DustBright  0.542158
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.95649
		Period          11.4635
		Eccentricity    0.953096
		Inclination     -31.1439
		AscendingNode   -111.45
		ArgOfPericenter -47.8685
		MeanAnomaly     170.96
	}
}

Comet	"C30"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            9.18875e-014
	Radius          0.66494
	InertiaMoment   0.399414

	Oblateness      0.0040291

	RotationPeriod  86.9986
	Obliquity       75.9887
	EqAscendNode    255.581

	AbsMagn         0.604683
	SlopeParam      4.79809
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.664 0.662 0.659)

	Surface
	{
		SurfStyle       0.606151
		OceanStyle      0.339181
		Randomize      (-0.275, 0.703, 0.970)
		colorDistMagn   0.813509
		colorDistFreq   7.51149e-005
		detailScale     18.1573
		colorConversion true
		snowLevel       2
		tropicLatitude  0.605657
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.54584
		terraceProb     0.180399
		erosion         0
		montesMagn      0.430595
		montesFreq      2.55026
		montesSpiky     0.974989
		montesFraction  0.179609
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00127252
		hillsFraction   0.437708
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270099
		craterFreq      0.206537
		craterDensity   0.866916
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   343.922
		volcanoTemp     1370.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.225, 0.185, 0.000)
		colorShelf     (0.266, 0.232, 0.211, 0.000)
		colorBeach     (0.312, 0.271, 0.251, 0.000)
		colorDesert    (0.339, 0.291, 0.244, 0.000)
		colorLowland   (0.372, 0.311, 0.277, 0.000)
		colorUpland    (0.412, 0.377, 0.336, 0.000)
		colorRock      (0.445, 0.410, 0.363, 0.000)
		colorSnow      (0.485, 0.437, 0.382, 1.000)
		BumpHeight      0.598446
		BumpOffset      0.119689
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.252953
		GasToDust   0.25
		Particles   1490
		GasBright   0.196646
		DustBright  0.302763
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.94287
		Period          24.7811
		Eccentricity    0.952315
		Inclination     -105.67
		AscendingNode   -141.424
		ArgOfPericenter 68.1514
		MeanAnomaly     113.886
	}
}

Comet	"C31"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            7.10684e-010
	Radius          12.0284
	InertiaMoment   0.398142

	Oblateness      0.00330051

	RotationPeriod  83.8913
	Obliquity       29.1944
	EqAscendNode    240.159

	AbsMagn         4.0946
	SlopeParam      3.77983
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.641 0.639 0.637)

	Surface
	{
		SurfStyle       0.912747
		OceanStyle      0.636132
		Randomize      (0.139, -0.334, 0.232)
		colorDistMagn   0.898787
		colorDistFreq   0.0148498
		detailScale     328.455
		colorConversion true
		snowLevel       2
		tropicLatitude  0.723013
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581369
		terraceProb     0.148218
		erosion         0
		montesMagn      0.533409
		montesFreq      3.02358
		montesSpiky     0.965306
		montesFraction  0.627692
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.35245
		hillsFraction   0.723897
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257985
		craterFreq      0.179486
		craterDensity   0.809197
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   70.7416
		volcanoTemp     1607.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.223, 0.255, 0.050)
		colorShelf     (0.256, 0.262, 0.293, 0.040)
		colorBeach     (0.295, 0.300, 0.331, 0.030)
		colorDesert    (0.333, 0.338, 0.376, 0.020)
		colorLowland   (0.372, 0.377, 0.414, 0.030)
		colorUpland    (0.410, 0.415, 0.452, 0.050)
		colorRock      (0.449, 0.453, 0.503, 0.020)
		colorSnow      (0.449, 0.453, 0.503, 1.000)
		BumpHeight      10.8255
		BumpOffset      2.16511
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.734145
		GasToDust   0.25
		Particles   2462
		GasBright   0.445511
		DustBright  0.538385
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.31024
		Period          35.7455
		Eccentricity    0.974895
		Inclination     -152.681
		AscendingNode   -67.7494
		ArgOfPericenter 159.735
		MeanAnomaly     164.899
	}
}

Comet	"C32"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.18824e-017
	Radius          0.0411794
	InertiaMoment   0.39984

	Oblateness      0.00463962

	RotationPeriod  81.0306
	Obliquity       342.4
	EqAscendNode    224.736

	AbsMagn         5.86376
	SlopeParam      2.69645
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.496 0.491 0.486)

	Surface
	{
		SurfStyle       0.887303
		OceanStyle      0.0226593
		Randomize      (0.236, 0.680, -0.709)
		colorDistMagn   0.474607
		colorDistFreq   9.96375e-007
		detailScale     1.12447
		colorConversion true
		snowLevel       2
		tropicLatitude  0.513032
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.434988
		terraceProb     0.401394
		erosion         0
		montesMagn      0.445936
		montesFreq      2.84086
		montesSpiky     0.997901
		montesFraction  0.264915
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.6581e-006
		hillsFraction   0.851779
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246344
		craterFreq      0.228226
		craterDensity   0.9773
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1380.19
		volcanoTemp     1395.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.172, 0.194, 0.050)
		colorShelf     (0.198, 0.201, 0.224, 0.040)
		colorBeach     (0.228, 0.231, 0.253, 0.030)
		colorDesert    (0.258, 0.260, 0.287, 0.020)
		colorLowland   (0.288, 0.290, 0.316, 0.030)
		colorUpland    (0.317, 0.319, 0.345, 0.050)
		colorRock      (0.347, 0.348, 0.384, 0.020)
		colorSnow      (0.347, 0.348, 0.384, 1.000)
		BumpHeight      0.0370615
		BumpOffset      0.00741229
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00791915
		DustBright  0.660464
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.12455
		Period          62.1541
		Eccentricity    0.984162
		Inclination     42.3631
		AscendingNode   -40.8715
		ArgOfPericenter 130.629
		MeanAnomaly     -130.683
	}
}

Comet	"C33"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.69245e-013
	Radius          0.744953
	InertiaMoment   0.398713

	Oblateness      0.0037812

	RotationPeriod  78.3647
	Obliquity       295.606
	EqAscendNode    209.313

	AbsMagn         7.28283
	SlopeParam      6.55991
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.538 0.530 0.526)

	Surface
	{
		SurfStyle       0.698523
		OceanStyle      0.0417719
		Randomize      (0.444, 0.817, -0.828)
		colorDistMagn   0.934971
		colorDistFreq   0.000342959
		detailScale     20.3422
		colorConversion true
		snowLevel       2
		tropicLatitude  0.924038
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.704008
		terraceProb     0.353337
		erosion         0
		montesMagn      0.674148
		montesFreq      3.44148
		montesSpiky     0.719331
		montesFraction  0.513478
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00148672
		hillsFraction   0.573972
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243095
		craterFreq      0.256579
		craterDensity   0.779821
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   283.907
		volcanoTemp     1697.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.180, 0.147, 0.000)
		colorShelf     (0.215, 0.186, 0.168, 0.000)
		colorBeach     (0.253, 0.217, 0.200, 0.000)
		colorDesert    (0.275, 0.233, 0.195, 0.000)
		colorLowland   (0.301, 0.249, 0.221, 0.000)
		colorUpland    (0.334, 0.302, 0.268, 0.000)
		colorRock      (0.361, 0.329, 0.289, 0.000)
		colorSnow      (0.393, 0.350, 0.305, 1.000)
		BumpHeight      0.670458
		BumpOffset      0.134092
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.285779
		GasToDust   0.25
		Particles   1557
		GasBright   0.0250161
		DustBright  0.327853
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.28966
		Period          27.4343
		Eccentricity    0.980956
		Inclination     176.86
		AscendingNode   -4.77993
		ArgOfPericenter 129.376
		MeanAnomaly     125.942
	}
}

Comet	"C34"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.30899e-009
	Radius          16.0909
	InertiaMoment   0.396743

	Oblateness      0.00521943

	RotationPeriod  75.8558
	Obliquity       248.812
	EqAscendNode    193.891

	AbsMagn         8.61462
	SlopeParam      5.05353
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.723 0.663 0.596)

	Surface
	{
		SurfStyle       0.413941
		OceanStyle      0.892919
		Randomize      (0.091, 0.380, 0.398)
		colorDistMagn   0.732233
		colorDistFreq   0.0702159
		detailScale     439.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.488624
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.643185
		terraceProb     0.158971
		erosion         0
		montesMagn      0.433663
		montesFreq      2.9302
		montesSpiky     0.98341
		montesFraction  0.634996
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.707624
		hillsFraction   0.698709
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223328
		craterFreq      0.274835
		craterDensity   0.863433
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   69.7299
		volcanoTemp     1701.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.265, 0.238, 0.000)
		colorShelf     (0.307, 0.282, 0.253, 0.000)
		colorBeach     (0.326, 0.298, 0.268, 0.000)
		colorDesert    (0.344, 0.315, 0.283, 0.000)
		colorLowland   (0.362, 0.331, 0.298, 0.000)
		colorUpland    (0.380, 0.348, 0.313, 0.000)
		colorRock      (0.398, 0.364, 0.328, 0.000)
		colorSnow      (0.416, 0.381, 0.343, 1.000)
		BumpHeight      14.4818
		BumpOffset      2.89637
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.766971
		GasToDust   0.25
		Particles   2529
		GasBright   0.108805
		DustBright  0.728551
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.64675
		Period          38.6426
		Eccentricity    0.977768
		Inclination     -111.266
		AscendingNode   -148.568
		ArgOfPericenter 22.7794
		MeanAnomaly     -69.088
	}
}

Comet	"C35"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            4.03048e-017
	Radius          0.0461368
	InertiaMoment   0.399194

	Oblateness      0.00429819

	RotationPeriod  73.4754
	Obliquity       202.017
	EqAscendNode    178.468

	AbsMagn         10.0205
	SlopeParam      4.00964
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.740 0.689 0.624)

	Surface
	{
		SurfStyle       0.815307
		OceanStyle      0.903524
		Randomize      (0.806, 0.419, -0.794)
		colorDistMagn   0.414604
		colorDistFreq   1.59225e-006
		detailScale     1.25984
		colorConversion true
		snowLevel       2
		tropicLatitude  0.346504
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.564404
		terraceProb     0.173854
		erosion         0
		montesMagn      0.59713
		montesFreq      3.39851
		montesSpiky     0.933459
		montesFraction  0.552265
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.38646e-006
		hillsFraction   0.53609
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221051
		craterFreq      0.219484
		craterDensity   1.01438
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1139.4
		volcanoTemp     1304.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.234, 0.175, 0.000)
		colorShelf     (0.296, 0.241, 0.200, 0.000)
		colorBeach     (0.348, 0.283, 0.237, 0.000)
		colorDesert    (0.377, 0.303, 0.231, 0.000)
		colorLowland   (0.414, 0.324, 0.262, 0.000)
		colorUpland    (0.459, 0.393, 0.318, 0.000)
		colorRock      (0.496, 0.427, 0.343, 0.000)
		colorSnow      (0.540, 0.455, 0.362, 1.000)
		BumpHeight      0.0415231
		BumpOffset      0.00830462
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0986199
		DustBright  0.423223
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.52746
		Period          37.6071
		Eccentricity    0.979832
		Inclination     -159.763
		AscendingNode   121.735
		ArgOfPericenter -74.1811
		MeanAnomaly     -164.664
	}
}

Comet	"C36"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            3.11729e-013
	Radius          0.99652
	InertiaMoment   0.397796

	Oblateness      0.00593212

	RotationPeriod  71.2015
	Obliquity       155.223
	EqAscendNode    163.046

	AbsMagn         11.7456
	SlopeParam      2.96855
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.443 0.436 0.434)

	Surface
	{
		SurfStyle       0.611668
		OceanStyle      0.267714
		Randomize      (0.979, -0.441, 0.388)
		colorDistMagn   0.633201
		colorDistFreq   0.00058028
		detailScale     27.2116
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998512
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.735512
		terraceProb     0.304506
		erosion         0
		montesMagn      0.4323
		montesFreq      2.6222
		montesSpiky     0.976191
		montesFraction  0.794827
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00251198
		hillsFraction   0.474025
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256741
		craterFreq      0.230966
		craterDensity   0.863523
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   279.836
		volcanoTemp     1475.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.148, 0.121, 0.000)
		colorShelf     (0.177, 0.153, 0.139, 0.000)
		colorBeach     (0.208, 0.179, 0.165, 0.000)
		colorDesert    (0.226, 0.192, 0.160, 0.000)
		colorLowland   (0.248, 0.205, 0.182, 0.000)
		colorUpland    (0.275, 0.249, 0.221, 0.000)
		colorRock      (0.297, 0.270, 0.239, 0.000)
		colorSnow      (0.324, 0.288, 0.252, 1.000)
		BumpHeight      0.896868
		BumpOffset      0.179374
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.318605
		GasToDust   0.25
		Particles   1623
		GasBright   0.0511757
		DustBright  0.155154
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.71603
		Period          39.2484
		Eccentricity    0.971899
		Inclination     -98.9884
		AscendingNode   -118.322
		ArgOfPericenter 106.137
		MeanAnomaly     -27.6486
	}
}

Comet	"C37"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.41099e-009
	Radius          18.0286
	InertiaMoment   0.399632

	Oblateness      0.00486721

	RotationPeriod  69.0166
	Obliquity       108.429
	EqAscendNode    147.623

	AbsMagn         14.8971
	SlopeParam      7.20487
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.731 0.727 0.724)

	Surface
	{
		SurfStyle       0.67285
		OceanStyle      0.745468
		Randomize      (0.434, -0.562, 0.410)
		colorDistMagn   0.190277
		colorDistFreq   0.200194
		detailScale     492.301
		colorConversion true
		snowLevel       2
		tropicLatitude  0.977205
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380455
		terraceProb     0.514813
		erosion         0
		montesMagn      0.45458
		montesFreq      2.70131
		montesSpiky     0.923791
		montesFraction  0.60039
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.880959
		hillsFraction   0.533264
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272428
		craterFreq      0.263241
		craterDensity   0.941781
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.5666
		volcanoTemp     1647.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.247, 0.203, 0.000)
		colorShelf     (0.292, 0.254, 0.232, 0.000)
		colorBeach     (0.343, 0.298, 0.275, 0.000)
		colorDesert    (0.373, 0.320, 0.268, 0.000)
		colorLowland   (0.409, 0.342, 0.304, 0.000)
		colorUpland    (0.453, 0.414, 0.369, 0.000)
		colorRock      (0.490, 0.451, 0.398, 0.000)
		colorSnow      (0.533, 0.480, 0.420, 1.000)
		BumpHeight      16.2257
		BumpOffset      3.24515
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.799797
		GasToDust   0.25
		Particles   2595
		GasBright   0.212132
		DustBright  0.478684
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.84497
		Period          17.0017
		Eccentricity    0.982406
		Inclination     -6.47475
		AscendingNode   17.8884
		ArgOfPericenter 111.22
		MeanAnomaly     39.2128
	}
}

Comet	"C38"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            7.42365e-017
	Radius          0.0617154
	InertiaMoment   0.398447

	Oblateness      0.00671727

	RotationPeriod  66.9066
	Obliquity       61.6343
	EqAscendNode    132.201

	AbsMagn         2.81479
	SlopeParam      5.32748
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.703 0.570 0.495)

	Surface
	{
		SurfStyle       0.097396
		OceanStyle      0.258803
		Randomize      (0.540, 0.412, -0.721)
		colorDistMagn   0.510123
		colorDistFreq   1.66182e-006
		detailScale     1.68524
		colorConversion true
		snowLevel       2
		tropicLatitude  0.698998
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.484921
		terraceProb     0.520979
		erosion         0
		montesMagn      0.639949
		montesFreq      2.54989
		montesSpiky     0.997746
		montesFraction  0.193375
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.35141e-006
		hillsFraction   0.708358
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214022
		craterFreq      0.213063
		craterDensity   0.919548
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1123.03
		volcanoTemp     945.196
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.228, 0.198, 0.000)
		colorShelf     (0.299, 0.242, 0.210, 0.000)
		colorBeach     (0.316, 0.256, 0.223, 0.000)
		colorDesert    (0.334, 0.271, 0.235, 0.000)
		colorLowland   (0.351, 0.285, 0.248, 0.000)
		colorUpland    (0.369, 0.299, 0.260, 0.000)
		colorRock      (0.387, 0.313, 0.272, 0.000)
		colorSnow      (0.404, 0.328, 0.285, 1.000)
		BumpHeight      0.0555439
		BumpOffset      0.0111088
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.137406
		DustBright  0.237897
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.70752
		Period          39.1738
		Eccentricity    0.987641
		Inclination     -105.974
		AscendingNode   -0.835787
		ArgOfPericenter -63.6076
		MeanAnomaly     70.0509
	}
}

Comet	"C39"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            5.74165e-013
	Radius          1.11654
	InertiaMoment   0.395382

	Oblateness      0.00541016

	RotationPeriod  64.8597
	Obliquity       14.84
	EqAscendNode    116.778

	AbsMagn         5.03987
	SlopeParam      4.23957
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.423 0.419 0.415)

	Surface
	{
		SurfStyle       0.211088
		OceanStyle      0.252522
		Randomize      (0.943, 0.507, 0.772)
		colorDistMagn   0.0802215
		colorDistFreq   0.000590846
		detailScale     30.4889
		colorConversion true
		snowLevel       2
		tropicLatitude  0.811733
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.370644
		terraceProb     0.361904
		erosion         0
		montesMagn      0.491858
		montesFreq      3.09422
		montesSpiky     0.921802
		montesFraction  0.235349
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00254478
		hillsFraction   0.679023
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24481
		craterFreq      0.245223
		craterDensity   0.933292
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   231.026
		volcanoTemp     1213.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.168, 0.166, 0.000)
		colorShelf     (0.180, 0.178, 0.176, 0.000)
		colorBeach     (0.191, 0.189, 0.187, 0.000)
		colorDesert    (0.201, 0.199, 0.197, 0.000)
		colorLowland   (0.212, 0.209, 0.207, 0.000)
		colorUpland    (0.222, 0.220, 0.218, 0.000)
		colorRock      (0.233, 0.230, 0.228, 0.000)
		colorSnow      (0.243, 0.241, 0.238, 1.000)
		BumpHeight      1.00488
		BumpOffset      0.200977
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.351431
		GasToDust   0.25
		Particles   1689
		GasBright   0.365552
		DustBright  0.494237
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.89107
		Period          32.2436
		Eccentricity    0.956973
		Inclination     132.124
		AscendingNode   109.798
		ArgOfPericenter 21.7715
		MeanAnomaly     -155.083
	}
}

Comet	"C40"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            4.44075e-009
	Radius          24.1159
	InertiaMoment   0.398964

	Oblateness      0.00760387

	RotationPeriod  62.8659
	Obliquity       328.046
	EqAscendNode    101.355

	AbsMagn         6.58587
	SlopeParam      3.22274
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.506 0.504 0.501)

	Surface
	{
		SurfStyle       0.561297
		OceanStyle      0.40041
		Randomize      (0.917, 0.361, -0.265)
		colorDistMagn   0.266889
		colorDistFreq   0.303847
		detailScale     658.526
		colorConversion true
		snowLevel       2
		tropicLatitude  0.947519
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.738594
		terraceProb     0.295464
		erosion         0
		montesMagn      0.497434
		montesFreq      3.52044
		montesSpiky     0.964385
		montesFraction  0.558365
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.05561
		hillsFraction   0.603197
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24839
		craterFreq      0.190259
		craterDensity   0.784389
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   56.739
		volcanoTemp     1761.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.171, 0.140, 0.000)
		colorShelf     (0.203, 0.176, 0.160, 0.000)
		colorBeach     (0.238, 0.207, 0.190, 0.000)
		colorDesert    (0.258, 0.222, 0.185, 0.000)
		colorLowland   (0.284, 0.237, 0.210, 0.000)
		colorUpland    (0.314, 0.287, 0.255, 0.000)
		colorRock      (0.339, 0.312, 0.275, 0.000)
		colorSnow      (0.370, 0.333, 0.290, 1.000)
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
		MaxLength   0.832623
		GasToDust   0.25
		Particles   2661
		GasBright   0.263544
		DustBright  0.280732
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.94915
		Period          60.3706
		Eccentricity    0.982794
		Inclination     102.131
		AscendingNode   15.7512
		ArgOfPericenter -163.723
		MeanAnomaly     -89.2584
	}
}

Comet	"C41"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.36734e-016
	Radius          0.0691481
	InertiaMoment   0.397367

	Oblateness      0.00616311

	RotationPeriod  60.9167
	Obliquity       281.251
	EqAscendNode    85.9327

	AbsMagn         7.94033
	SlopeParam      8.74961
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.724 0.668 0.625)

	Surface
	{
		SurfStyle       0.76451
		OceanStyle      0.971074
		Randomize      (-0.192, 0.315, -0.357)
		colorDistMagn   0.771981
		colorDistFreq   1.00632e-006
		detailScale     1.8882
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998664
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.588276
		terraceProb     0.255098
		erosion         0
		montesMagn      0.504452
		montesFreq      3.72281
		montesSpiky     0.90613
		montesFraction  0.289478
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.27718e-006
		hillsFraction   0.649024
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235809
		craterFreq      0.216468
		craterDensity   1.05605
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   927.146
		volcanoTemp     1548.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.227, 0.175, 0.000)
		colorShelf     (0.290, 0.234, 0.200, 0.000)
		colorBeach     (0.340, 0.274, 0.238, 0.000)
		colorDesert    (0.369, 0.294, 0.231, 0.000)
		colorLowland   (0.406, 0.314, 0.263, 0.000)
		colorUpland    (0.449, 0.381, 0.319, 0.000)
		colorRock      (0.485, 0.414, 0.344, 0.000)
		colorSnow      (0.529, 0.441, 0.363, 1.000)
		BumpHeight      0.0622333
		BumpOffset      0.0124467
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00989522
		DustBright  0.218867
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.99604
		Period          33.1093
		Eccentricity    0.975151
		Inclination     29.2806
		AscendingNode   104.305
		ArgOfPericenter -63.1562
		MeanAnomaly     79.835
	}
}

Comet	"C42"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.05754e-012
	Radius          1.49354
	InertiaMoment   0.399419

	Oblateness      0.0086245

	RotationPeriod  59.0047
	Obliquity       234.457
	EqAscendNode    70.5102

	AbsMagn         9.28778
	SlopeParam      5.62901
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.760 0.758 0.757)

	Surface
	{
		SurfStyle       0.512661
		OceanStyle      0.844419
		Randomize      (-0.262, -0.548, 0.368)
		colorDistMagn   0.477016
		colorDistFreq   0.00172157
		detailScale     40.7837
		colorConversion true
		snowLevel       2
		tropicLatitude  0.754753
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.334482
		terraceProb     0.104749
		erosion         0
		montesMagn      0.476187
		montesFreq      3.20555
		montesSpiky     0.805209
		montesFraction  0.0877355
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00491346
		hillsFraction   0.345859
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265179
		craterFreq      0.278188
		craterDensity   1.06588
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   227.707
		volcanoTemp     1361.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.258, 0.212, 0.000)
		colorShelf     (0.304, 0.265, 0.242, 0.000)
		colorBeach     (0.357, 0.311, 0.288, 0.000)
		colorDesert    (0.388, 0.334, 0.280, 0.000)
		colorLowland   (0.426, 0.356, 0.318, 0.000)
		colorUpland    (0.471, 0.432, 0.386, 0.000)
		colorRock      (0.509, 0.470, 0.416, 0.000)
		colorSnow      (0.555, 0.501, 0.439, 1.000)
		BumpHeight      1.34419
		BumpOffset      0.268838
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.384257
		GasToDust   0.25
		Particles   1756
		GasBright   0.0729659
		DustBright  0.640283
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.85979
		Period          31.9871
		Eccentricity    0.973239
		Inclination     -156.034
		AscendingNode   -112.187
		ArgOfPericenter -119.044
		MeanAnomaly     1.54763
	}
}

Comet	"C43"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            8.1793e-009
	Radius          27.0199
	InertiaMoment   0.39815

	Oblateness      0.00701119

	RotationPeriod  57.1233
	Obliquity       187.663
	EqAscendNode    55.0876

	AbsMagn         10.8054
	SlopeParam      4.47272
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.742 0.739 0.738)

	Surface
	{
		SurfStyle       0.628502
		OceanStyle      0.252546
		Randomize      (-0.439, 0.697, 0.218)
		colorDistMagn   0.48198
		colorDistFreq   0.402713
		detailScale     737.823
		colorConversion true
		snowLevel       2
		tropicLatitude  0.262538
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.551939
		terraceProb     0.340419
		erosion         0
		montesMagn      0.642473
		montesFreq      3.27964
		montesSpiky     0.929852
		montesFraction  0.432156
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.83004
		hillsFraction   0.524985
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266644
		craterFreq      0.238127
		craterDensity   0.825793
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.8415
		volcanoTemp     1589.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.251, 0.207, 0.000)
		colorShelf     (0.297, 0.259, 0.236, 0.000)
		colorBeach     (0.349, 0.303, 0.280, 0.000)
		colorDesert    (0.378, 0.325, 0.273, 0.000)
		colorLowland   (0.415, 0.347, 0.310, 0.000)
		colorUpland    (0.460, 0.421, 0.376, 0.000)
		colorRock      (0.497, 0.458, 0.406, 0.000)
		colorSnow      (0.541, 0.488, 0.428, 1.000)
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
		MaxLength   0.865449
		GasToDust   0.25
		Particles   2728
		GasBright   0.064173
		DustBright  0.333562
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.66391
		Period          22.7132
		Eccentricity    0.971353
		Inclination     -12.9008
		AscendingNode   92.1789
		ArgOfPericenter -59.3772
		MeanAnomaly     12.7233
	}
}

Comet	"C44"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.51847e-016
	Radius          0.0924984
	InertiaMoment   0.399846

	Oblateness      0.00982175

	RotationPeriod  55.2664
	Obliquity       140.869
	EqAscendNode    39.665

	AbsMagn         12.9202
	SlopeParam      3.46491
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.715 0.714 0.712)

	Surface
	{
		SurfStyle       0.0426175
		OceanStyle      0.0481962
		Randomize      (0.346, -0.669, -0.637)
		colorDistMagn   0.529804
		colorDistFreq   6.21204e-006
		detailScale     2.52582
		colorConversion true
		snowLevel       2
		tropicLatitude  0.694783
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.737243
		terraceProb     0.244903
		erosion         0
		montesMagn      0.266759
		montesFreq      2.8824
		montesSpiky     0.953457
		montesFraction  0.628877
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.48551e-005
		hillsFraction   0.633893
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237746
		craterFreq      0.182014
		craterDensity   1.0738
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   913.844
		volcanoTemp     1510.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.286, 0.285, 0.000)
		colorShelf     (0.304, 0.303, 0.303, 0.000)
		colorBeach     (0.322, 0.321, 0.321, 0.000)
		colorDesert    (0.340, 0.339, 0.338, 0.000)
		colorLowland   (0.358, 0.357, 0.356, 0.000)
		colorUpland    (0.376, 0.375, 0.374, 0.000)
		colorRock      (0.393, 0.393, 0.392, 0.000)
		colorSnow      (0.411, 0.411, 0.410, 1.000)
		BumpHeight      0.0832486
		BumpOffset      0.0166497
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.194434
		DustBright  0.687788
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.43754
		Period          28.5927
		Eccentricity    0.977423
		Inclination     -100.268
		AscendingNode   20.6899
		ArgOfPericenter -104.077
		MeanAnomaly     -157.436
	}
}

Comet	"C45"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.94786e-012
	Radius          1.67333
	InertiaMoment   0.398719

	Oblateness      0.00801034

	RotationPeriod  53.4287
	Obliquity       94.0743
	EqAscendNode    24.2424

	AbsMagn         0.501702
	SlopeParam      2.28531
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.763 0.762 0.759)

	Surface
	{
		SurfStyle       0.882487
		OceanStyle      0.839927
		Randomize      (-0.583, 0.639, -0.875)
		colorDistMagn   0.362959
		colorDistFreq   0.0012669
		detailScale     45.6931
		colorConversion true
		snowLevel       2
		tropicLatitude  0.838301
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.484476
		terraceProb     0.13585
		erosion         0
		montesMagn      0.486257
		montesFreq      2.62703
		montesSpiky     0.991397
		montesFraction  0.623073
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00781544
		hillsFraction   0.906405
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253562
		craterFreq      0.232995
		craterDensity   0.975762
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   187.979
		volcanoTemp     1477.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.267, 0.304, 0.050)
		colorShelf     (0.305, 0.312, 0.349, 0.040)
		colorBeach     (0.351, 0.358, 0.395, 0.030)
		colorDesert    (0.397, 0.404, 0.448, 0.020)
		colorLowland   (0.443, 0.449, 0.493, 0.030)
		colorUpland    (0.488, 0.495, 0.539, 0.050)
		colorRock      (0.534, 0.541, 0.599, 0.020)
		colorSnow      (0.534, 0.541, 0.599, 1.000)
		BumpHeight      1.506
		BumpOffset      0.3012
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.417083
		GasToDust   0.25
		Particles   1822
		GasBright   0.158359
		DustBright  0.408349
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.62937
		Period          47.521
		Eccentricity    0.973842
		Inclination     120.061
		AscendingNode   -126.179
		ArgOfPericenter 156.252
		MeanAnomaly     37.5358
	}
}

Comet	"C46"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.50652e-008
	Radius          36.1454
	InertiaMoment   0.396763

	Oblateness      0.0111077

	RotationPeriod  51.6051
	Obliquity       47.28
	EqAscendNode    8.81979

	AbsMagn         4.06518
	SlopeParam      5.97314
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.680 0.674 0.672)

	Surface
	{
		SurfStyle       0.80452
		OceanStyle      0.00301694
		Randomize      (0.179, 0.955, -0.938)
		colorDistMagn   0.189933
		colorDistFreq   0.519161
		detailScale     987.011
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994461
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.487942
		terraceProb     0.158991
		erosion         0
		montesMagn      0.331636
		montesFreq      3.39816
		montesSpiky     0.978945
		montesFraction  0.363658
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.21353
		hillsFraction   0.798342
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230366
		craterFreq      0.204966
		craterDensity   0.854809
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.1712
		volcanoTemp     1246.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.229, 0.188, 0.000)
		colorShelf     (0.272, 0.236, 0.215, 0.000)
		colorBeach     (0.319, 0.276, 0.255, 0.000)
		colorDesert    (0.347, 0.297, 0.248, 0.000)
		colorLowland   (0.381, 0.317, 0.282, 0.000)
		colorUpland    (0.421, 0.384, 0.343, 0.000)
		colorRock      (0.455, 0.418, 0.369, 0.000)
		colorSnow      (0.496, 0.445, 0.390, 1.000)
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
		MaxLength   0.898275
		GasToDust   0.25
		Particles   2794
		GasBright   0.0850249
		DustBright  0.16617
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.20905
		Period          43.6485
		Eccentricity    0.972031
		Inclination     -39.0556
		AscendingNode   155.645
		ArgOfPericenter 107.383
		MeanAnomaly     -98.0641
	}
}

Comet	"C47"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            4.63869e-016
	Radius          0.103628
	InertiaMoment   0.3992

	Oblateness      0.00921571

	RotationPeriod  49.7906
	Obliquity       0.485665
	EqAscendNode    353.397

	AbsMagn         5.84274
	SlopeParam      4.71251
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.562 0.558 0.556)

	Surface
	{
		SurfStyle       0.0529798
		OceanStyle      0.365443
		Randomize      (0.768, -0.432, 0.380)
		colorDistMagn   0.030425
		colorDistFreq   8.21144e-006
		detailScale     2.82973
		colorConversion true
		snowLevel       2
		tropicLatitude  0.934251
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.45313
		terraceProb     0.183694
		erosion         0
		montesMagn      0.500672
		montesFreq      2.32397
		montesSpiky     0.913826
		montesFraction  0.698971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.09328e-005
		hillsFraction   0.548874
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238449
		craterFreq      0.215577
		craterDensity   1.04042
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   754.369
		volcanoTemp     1329.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.223, 0.223, 0.000)
		colorShelf     (0.239, 0.237, 0.236, 0.000)
		colorBeach     (0.253, 0.251, 0.250, 0.000)
		colorDesert    (0.267, 0.265, 0.264, 0.000)
		colorLowland   (0.281, 0.279, 0.278, 0.000)
		colorUpland    (0.295, 0.293, 0.292, 0.000)
		colorRock      (0.309, 0.307, 0.306, 0.000)
		colorSnow      (0.323, 0.321, 0.320, 1.000)
		BumpHeight      0.0932649
		BumpOffset      0.018653
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.292453
		DustBright  0.443228
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.92348
		Period          50.2952
		Eccentricity    0.982607
		Inclination     111.039
		AscendingNode   107.467
		ArgOfPericenter -167.526
		MeanAnomaly     -120.248
	}
}

Comet	"C48"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            3.5877e-012
	Radius          2.23859
	InertiaMoment   0.397805

	Oblateness      0.0128676

	RotationPeriod  47.9807
	Obliquity       313.691
	EqAscendNode    337.975

	AbsMagn         7.26433
	SlopeParam      3.69946
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.731 0.620 0.536)

	Surface
	{
		SurfStyle       0.0622224
		OceanStyle      0.99345
		Randomize      (-0.306, 0.369, -0.033)
		colorDistMagn   0.81335
		colorDistFreq   0.0025663
		detailScale     61.1285
		colorConversion true
		snowLevel       2
		tropicLatitude  0.833579
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57682
		terraceProb     0.16828
		erosion         0
		montesMagn      0.606689
		montesFreq      3.25496
		montesSpiky     0.937787
		montesFraction  0.299179
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0109323
		hillsFraction   0.693678
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26075
		craterFreq      0.170014
		craterDensity   0.91342
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   185.299
		volcanoTemp     1434.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.248, 0.214, 0.000)
		colorShelf     (0.311, 0.264, 0.228, 0.000)
		colorBeach     (0.329, 0.279, 0.241, 0.000)
		colorDesert    (0.347, 0.295, 0.255, 0.000)
		colorLowland   (0.366, 0.310, 0.268, 0.000)
		colorUpland    (0.384, 0.326, 0.281, 0.000)
		colorRock      (0.402, 0.341, 0.295, 0.000)
		colorSnow      (0.421, 0.357, 0.308, 1.000)
		BumpHeight      2.01473
		BumpOffset      0.402947
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.449908
		GasToDust   0.25
		Particles   1888
		GasBright   0.191837
		DustBright  0.228331
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.40848
		Period          36.5835
		Eccentricity    0.981217
		Inclination     152.71
		AscendingNode   79.312
		ArgOfPericenter -74.852
		MeanAnomaly     -166.565
	}
}

Comet	"C49"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.77483e-008
	Radius          40.4916
	InertiaMoment   0.399637

	Oblateness      0.0107061

	RotationPeriod  46.1708
	Obliquity       266.897
	EqAscendNode    322.552

	AbsMagn         8.5962
	SlopeParam      2.59624
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.615 0.532 0.485)

	Surface
	{
		SurfStyle       0.29833
		OceanStyle      0.809796
		Randomize      (-0.744, -0.008, -0.177)
		colorDistMagn   0.827046
		colorDistFreq   0.817536
		detailScale     1105.69
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99252
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498282
		terraceProb     0.4561
		erosion         0
		montesMagn      0.570583
		montesFreq      3.13537
		montesSpiky     0.980611
		montesFraction  0.802919
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.47655
		hillsFraction   0.520829
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228289
		craterFreq      0.228272
		craterDensity   1.08535
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.1112
		volcanoTemp     1326.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.213, 0.194, 0.000)
		colorShelf     (0.262, 0.226, 0.206, 0.000)
		colorBeach     (0.277, 0.240, 0.218, 0.000)
		colorDesert    (0.292, 0.253, 0.230, 0.000)
		colorLowland   (0.308, 0.266, 0.242, 0.000)
		colorUpland    (0.323, 0.280, 0.255, 0.000)
		colorRock      (0.338, 0.293, 0.267, 0.000)
		colorSnow      (0.354, 0.306, 0.279, 1.000)
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
		MaxLength   0.931101
		GasToDust   0.25
		Particles   2860
		GasBright   0.0141285
		DustBright  0.890526
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.03764
		Period          33.4544
		Eccentricity    0.968746
		Inclination     159.811
		AscendingNode   -120.111
		ArgOfPericenter -37.2321
		MeanAnomaly     -114.793
	}
}

Comet	"C50"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            8.5439e-016
	Radius          0.138644
	InertiaMoment   0.398454

	Oblateness      0.0150562

	RotationPeriod  44.3562
	Obliquity       220.103
	EqAscendNode    307.129

	AbsMagn         9.99983
	SlopeParam      6.38864
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.547 0.545 0.542)

	Surface
	{
		SurfStyle       0.469932
		OceanStyle      0.953256
		Randomize      (-0.305, 0.346, -0.809)
		colorDistMagn   0.345309
		colorDistFreq   1.57797e-005
		detailScale     3.7859
		colorConversion true
		snowLevel       2
		tropicLatitude  0.155581
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.580292
		terraceProb     0.116706
		erosion         0
		montesMagn      0.625492
		montesFreq      2.68015
		montesSpiky     0.817609
		montesFraction  0.46292
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.95666e-005
		hillsFraction   0.823151
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243948
		craterFreq      0.223849
		craterDensity   0.998603
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   743.666
		volcanoTemp     1136.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.218, 0.217, 0.000)
		colorShelf     (0.232, 0.231, 0.230, 0.000)
		colorBeach     (0.246, 0.245, 0.244, 0.000)
		colorDesert    (0.260, 0.259, 0.257, 0.000)
		colorLowland   (0.273, 0.272, 0.271, 0.000)
		colorUpland    (0.287, 0.286, 0.285, 0.000)
		colorRock      (0.301, 0.300, 0.298, 0.000)
		colorSnow      (0.314, 0.313, 0.312, 1.000)
		BumpHeight      0.124779
		BumpOffset      0.0249559
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0439869
		DustBright  0.545154
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.94399
		Period          41.2635
		Eccentricity    0.974076
		Inclination     148.484
		AscendingNode   -4.346
		ArgOfPericenter -101.972
		MeanAnomaly     136.539
	}
}

Comet	"C51"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            6.6081e-012
	Radius          2.50755
	InertiaMoment   0.395454

	Oblateness      0.0123859

	RotationPeriod  42.5323
	Obliquity       173.308
	EqAscendNode    291.707

	AbsMagn         11.7175
	SlopeParam      4.96303
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.715 0.619 0.576)

	Surface
	{
		SurfStyle       0.278351
		OceanStyle      0.732172
		Randomize      (0.092, 0.366, -0.161)
		colorDistMagn   0.645592
		colorDistFreq   0.00304216
		detailScale     68.4727
		colorConversion true
		snowLevel       2
		tropicLatitude  0.873297
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.291389
		terraceProb     0.205468
		erosion         0
		montesMagn      0.501375
		montesFreq      3.29534
		montesSpiky     0.983499
		montesFraction  0.654678
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0132119
		hillsFraction   0.568047
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26404
		craterFreq      0.278947
		craterDensity   0.956671
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   152.939
		volcanoTemp     1182.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.248, 0.230, 0.000)
		colorShelf     (0.304, 0.263, 0.245, 0.000)
		colorBeach     (0.322, 0.279, 0.259, 0.000)
		colorDesert    (0.340, 0.294, 0.274, 0.000)
		colorLowland   (0.358, 0.309, 0.288, 0.000)
		colorUpland    (0.376, 0.325, 0.302, 0.000)
		colorRock      (0.393, 0.340, 0.317, 0.000)
		colorSnow      (0.411, 0.356, 0.331, 1.000)
		BumpHeight      2.25679
		BumpOffset      0.451358
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.482734
		GasToDust   0.25
		Particles   1955
		GasBright   0.0365862
		DustBright  0.237042
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.57259
		Period          46.9915
		Eccentricity    0.97182
		Inclination     -115.921
		AscendingNode   59.6023
		ArgOfPericenter 76.9949
		MeanAnomaly     -8.5853
	}
}

Comet	"C52"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            5.11089e-008
	Radius          54.1786
	InertiaMoment   0.39897

	Oblateness      0.0178788

	RotationPeriod  40.6943
	Obliquity       126.514
	EqAscendNode    276.284

	AbsMagn         14.818
	SlopeParam      3.92993
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.653 0.623 0.573)

	Surface
	{
		SurfStyle       0.287385
		OceanStyle      0.503857
		Randomize      (0.093, -0.584, 0.096)
		colorDistMagn   0.814248
		colorDistFreq   1.60539
		detailScale     1479.44
		colorConversion true
		snowLevel       2
		tropicLatitude  0.939169
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.579687
		terraceProb     0.192029
		erosion         0
		montesMagn      0.487249
		montesFreq      3.44969
		montesSpiky     0.898596
		montesFraction  0.274513
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.58074
		hillsFraction   0.696116
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2373
		craterFreq      0.257357
		craterDensity   0.747443
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.5738
		volcanoTemp     1429.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.249, 0.229, 0.000)
		colorShelf     (0.277, 0.265, 0.243, 0.000)
		colorBeach     (0.294, 0.280, 0.258, 0.000)
		colorDesert    (0.310, 0.296, 0.272, 0.000)
		colorLowland   (0.326, 0.311, 0.286, 0.000)
		colorUpland    (0.343, 0.327, 0.301, 0.000)
		colorRock      (0.359, 0.342, 0.315, 0.000)
		colorSnow      (0.375, 0.358, 0.329, 1.000)
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
		MaxLength   0.963926
		GasToDust   0.25
		Particles   2927
		GasBright   0.146129
		DustBright  0.611985
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.6219
		Period          22.407
		Eccentricity    0.9654
		Inclination     -162.658
		AscendingNode   -159.588
		ArgOfPericenter 1.71831
		MeanAnomaly     59.0087
	}
}

Comet	"C53"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.57368e-015
	Radius          0.155284
	InertiaMoment   0.397379

	Oblateness      0.0149212

	RotationPeriod  38.837
	Obliquity       79.7199
	EqAscendNode    260.862

	AbsMagn         2.77232
	SlopeParam      2.87641
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.851 0.788 0.726)

	Surface
	{
		SurfStyle       0.548806
		OceanStyle      0.378065
		Randomize      (-0.833, -0.352, 0.809)
		colorDistMagn   0.169603
		colorDistFreq   2.00285e-006
		detailScale     4.2403
		colorConversion true
		snowLevel       2
		tropicLatitude  0.740098
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552817
		terraceProb     0.451723
		erosion         0
		montesMagn      0.368263
		montesFreq      2.74234
		montesSpiky     0.918457
		montesFraction  0.514741
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.03789e-005
		hillsFraction   0.764279
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226273
		craterFreq      0.209976
		craterDensity   0.939122
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   613.727
		volcanoTemp     1943.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.332, 0.268, 0.203, 0.000)
		colorShelf     (0.341, 0.276, 0.232, 0.000)
		colorBeach     (0.400, 0.323, 0.276, 0.000)
		colorDesert    (0.434, 0.347, 0.268, 0.000)
		colorLowland   (0.477, 0.370, 0.305, 0.000)
		colorUpland    (0.528, 0.449, 0.370, 0.000)
		colorRock      (0.570, 0.489, 0.399, 0.000)
		colorSnow      (0.621, 0.520, 0.421, 1.000)
		BumpHeight      0.139756
		BumpOffset      0.0279512
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0343684
		GasToDust   0.25
		Particles   1049
		GasBright   0.111446
		DustBright  0.331155
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.22992
		Period          35.0652
		Eccentricity    0.986089
		Inclination     -147.019
		AscendingNode   -167.436
		ArgOfPericenter 5.53471
		MeanAnomaly     -18.5973
	}
}

Comet	"C54"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.21713e-011
	Radius          3.3555
	InertiaMoment   0.399425

	Oblateness      0.0216646

	RotationPeriod  36.9549
	Obliquity       32.9256
	EqAscendNode    245.439

	AbsMagn         5.01588
	SlopeParam      6.94526
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.787 0.785 0.784)

	Surface
	{
		SurfStyle       0.563173
		OceanStyle      0.0397577
		Randomize      (0.503, -0.992, 0.587)
		colorDistMagn   0.0712155
		colorDistFreq   0.00924746
		detailScale     91.6276
		colorConversion true
		snowLevel       2
		tropicLatitude  0.87798
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.377052
		terraceProb     0.132859
		erosion         0
		montesMagn      0.374298
		montesFreq      2.64078
		montesSpiky     0.9585
		montesFraction  0.472027
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.029443
		hillsFraction   0.53845
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258392
		craterFreq      0.182191
		craterDensity   0.963941
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   150.798
		volcanoTemp     1656.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.267, 0.219, 0.000)
		colorShelf     (0.315, 0.275, 0.251, 0.000)
		colorBeach     (0.370, 0.322, 0.298, 0.000)
		colorDesert    (0.402, 0.345, 0.290, 0.000)
		colorLowland   (0.441, 0.369, 0.329, 0.000)
		colorUpland    (0.488, 0.447, 0.400, 0.000)
		colorRock      (0.528, 0.487, 0.431, 0.000)
		colorSnow      (0.575, 0.518, 0.455, 1.000)
		BumpHeight      3.01995
		BumpOffset      0.60399
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.51556
		GasToDust   0.25
		Particles   2021
		GasBright   0.288179
		DustBright  0.638908
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.56672
		Period          46.9368
		Eccentricity    0.985761
		Inclination     103.741
		AscendingNode   58.0611
		ArgOfPericenter 19.1935
		MeanAnomaly     21.9679
	}
}

Comet	"C55"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            9.41361e-008
	Radius          60.6738
	InertiaMoment   0.398158

	Oblateness      0.0183299

	RotationPeriod  35.0422
	Obliquity       346.131
	EqAscendNode    230.016

	AbsMagn         6.56647
	SlopeParam      5.22972
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.812 0.779 0.717)

	Surface
	{
		SurfStyle       0.505294
		OceanStyle      0.6714
		Randomize      (0.191, 0.986, 0.459)
		colorDistMagn   0.568109
		colorDistFreq   0.736486
		detailScale     1656.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.246991
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.327903
		terraceProb     0.282148
		erosion         0
		montesMagn      0.618535
		montesFreq      3.64106
		montesSpiky     0.915208
		montesFraction  0.537556
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.62726
		hillsFraction   0.382776
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242959
		craterFreq      0.279464
		craterDensity   0.792141
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.0048
		volcanoTemp     1614.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.265, 0.201, 0.000)
		colorShelf     (0.325, 0.273, 0.229, 0.000)
		colorBeach     (0.381, 0.319, 0.272, 0.000)
		colorDesert    (0.414, 0.343, 0.265, 0.000)
		colorLowland   (0.454, 0.366, 0.301, 0.000)
		colorUpland    (0.503, 0.444, 0.366, 0.000)
		colorRock      (0.544, 0.483, 0.394, 0.000)
		colorSnow      (0.592, 0.514, 0.416, 1.000)
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
		MaxLength   0.996752
		GasToDust   0.25
		Particles   2993
		GasBright   0.226215
		DustBright  0.38536
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.63694
		Period          22.5164
		Eccentricity    0.945267
		Inclination     -6.88909
		AscendingNode   100.379
		ArgOfPericenter 135.928
		MeanAnomaly     -59.9648
	}
}

Comet	"C56"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.89852e-015
	Radius          0.207821
	InertiaMoment   0.399851

	Oblateness      0.0269957

	RotationPeriod  33.0921
	Obliquity       299.337
	EqAscendNode    214.594

	AbsMagn         7.92212
	SlopeParam      4.15948
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.562 0.476 0.366)

	Surface
	{
		SurfStyle       0.499731
		OceanStyle      0.573929
		Randomize      (0.373, -0.753, -0.349)
		colorDistMagn   0.779164
		colorDistFreq   2.50532e-005
		detailScale     5.67489
		colorConversion true
		snowLevel       2
		tropicLatitude  0.79457
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.364756
		terraceProb     0.240142
		erosion         0
		montesMagn      0.447343
		montesFreq      2.85025
		montesSpiky     0.976236
		montesFraction  0.29564
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.71651e-005
		hillsFraction   0.440384
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242942
		craterFreq      0.264849
		craterDensity   0.816092
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   605.211
		volcanoTemp     1552.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.191, 0.146, 0.000)
		colorShelf     (0.239, 0.202, 0.155, 0.000)
		colorBeach     (0.253, 0.214, 0.165, 0.000)
		colorDesert    (0.267, 0.226, 0.174, 0.000)
		colorLowland   (0.281, 0.238, 0.183, 0.000)
		colorUpland    (0.295, 0.250, 0.192, 0.000)
		colorRock      (0.309, 0.262, 0.201, 0.000)
		colorSnow      (0.323, 0.274, 0.210, 1.000)
		BumpHeight      0.187039
		BumpOffset      0.0374078
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0671942
		GasToDust   0.25
		Particles   1115
		GasBright   0.126991
		DustBright  0.16907
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.8655
		Period          24.2016
		Eccentricity    0.968153
		Inclination     119.789
		AscendingNode   -118.739
		ArgOfPericenter -146.404
		MeanAnomaly     -72.5205
	}
}

Comet	"C57"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.24179e-011
	Radius          3.75723
	InertiaMoment   0.398726

	Oblateness      0.0232587

	RotationPeriod  31.0973
	Obliquity       252.543
	EqAscendNode    199.171

	AbsMagn         9.26862
	SlopeParam      3.13604
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.788 0.721 0.633)

	Surface
	{
		SurfStyle       0.405933
		OceanStyle      0.160893
		Randomize      (-0.991, -0.002, -0.799)
		colorDistMagn   0.572562
		colorDistFreq   0.00888516
		detailScale     102.598
		colorConversion true
		snowLevel       2
		tropicLatitude  0.894883
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.43559
		terraceProb     0.116662
		erosion         0
		montesMagn      0.470478
		montesFreq      2.72171
		montesSpiky     0.922642
		montesFraction  0.603596
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.029958
		hillsFraction   0.544969
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.193711
		craterFreq      0.223346
		craterDensity   0.819216
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   124.416
		volcanoTemp     1119.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.288, 0.253, 0.000)
		colorShelf     (0.335, 0.306, 0.269, 0.000)
		colorBeach     (0.354, 0.324, 0.285, 0.000)
		colorDesert    (0.374, 0.342, 0.301, 0.000)
		colorLowland   (0.394, 0.360, 0.316, 0.000)
		colorUpland    (0.413, 0.378, 0.332, 0.000)
		colorRock      (0.433, 0.396, 0.348, 0.000)
		colorSnow      (0.453, 0.414, 0.364, 1.000)
		BumpHeight      3.38151
		BumpOffset      0.676302
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.548386
		GasToDust   0.25
		Particles   2087
		GasBright   0.380891
		DustBright  0.399656
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.43542
		Period          28.576
		Eccentricity    0.98196
		Inclination     -92.9697
		AscendingNode   61.001
		ArgOfPericenter 162.017
		MeanAnomaly     -167.157
	}
}

Comet	"C58"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.73387e-007
	Radius          81.2127
	InertiaMoment   0.396782

	Oblateness      0.0345497

	RotationPeriod  29.0491
	Obliquity       205.748
	EqAscendNode    183.749

	AbsMagn         10.7822
	SlopeParam      7.93111
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.710 0.590 0.546)

	Surface
	{
		SurfStyle       0.308201
		OceanStyle      0.787615
		Randomize      (0.179, 0.385, -0.890)
		colorDistMagn   0.539269
		colorDistFreq   2.28338
		detailScale     2217.65
		colorConversion true
		snowLevel       2
		tropicLatitude  0.373392
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.608824
		terraceProb     0.211009
		erosion         0
		montesMagn      0.5748
		montesFreq      3.0893
		montesSpiky     0.777499
		montesFraction  0.46571
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.9231
		hillsFraction   0.578127
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256145
		craterFreq      0.221916
		craterDensity   0.771839
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   30.5789
		volcanoTemp     1827.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.236, 0.218, 0.000)
		colorShelf     (0.302, 0.251, 0.232, 0.000)
		colorBeach     (0.320, 0.265, 0.246, 0.000)
		colorDesert    (0.337, 0.280, 0.259, 0.000)
		colorLowland   (0.355, 0.295, 0.273, 0.000)
		colorUpland    (0.373, 0.310, 0.286, 0.000)
		colorRock      (0.391, 0.324, 0.300, 0.000)
		colorSnow      (0.409, 0.339, 0.314, 1.000)
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
		GasBright   0.0218681
		DustBright  0.443166
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.28897
		Period          27.4289
		Eccentricity    0.979383
		Inclination     150.006
		AscendingNode   -47.1873
		ArgOfPericenter 133.627
		MeanAnomaly     -171.375
	}
}

Comet	"C59"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            5.33871e-015
	Radius          0.232664
	InertiaMoment   0.399205

	Oblateness      0.0309623

	RotationPeriod  26.9377
	Obliquity       158.954
	EqAscendNode    168.326

	AbsMagn         12.8817
	SlopeParam      5.52036
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.738 0.736 0.734)

	Surface
	{
		SurfStyle       0.139983
		OceanStyle      0.280636
		Randomize      (0.245, 0.688, -0.198)
		colorDistMagn   0.701803
		colorDistFreq   4.06684e-005
		detailScale     6.35328
		colorConversion true
		snowLevel       2
		tropicLatitude  0.423525
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.517443
		terraceProb     0.112923
		erosion         0
		montesMagn      0.371898
		montesFreq      2.83103
		montesSpiky     0.93848
		montesFraction  0.484825
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.27541e-005
		hillsFraction   0.611199
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.199824
		craterFreq      0.204746
		craterDensity   1.00326
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   499.249
		volcanoTemp     1525.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.295, 0.294, 0.000)
		colorShelf     (0.314, 0.313, 0.312, 0.000)
		colorBeach     (0.332, 0.331, 0.330, 0.000)
		colorDesert    (0.351, 0.350, 0.349, 0.000)
		colorLowland   (0.369, 0.368, 0.367, 0.000)
		colorUpland    (0.387, 0.387, 0.385, 0.000)
		colorRock      (0.406, 0.405, 0.404, 0.000)
		colorSnow      (0.424, 0.423, 0.422, 1.000)
		BumpHeight      0.209398
		BumpOffset      0.0418795
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.10002
		GasToDust   0.25
		Particles   1181
		GasBright   0.100716
		DustBright  0.848805
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.75727
		Period          23.3985
		Eccentricity    0.948261
		Inclination     24.2862
		AscendingNode   -68.0606
		ArgOfPericenter -74.4154
		MeanAnomaly     7.35284
	}
}

Comet	"C60"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            4.12911e-011
	Radius          5.02991
	InertiaMoment   0.397815

	Oblateness      0.0476622

	RotationPeriod  24.7511
	Obliquity       112.16
	EqAscendNode    152.904

	AbsMagn         0.393497
	SlopeParam      4.39115
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.460 0.454 0.452)

	Surface
	{
		SurfStyle       0.432703
		OceanStyle      0.655778
		Randomize      (-0.884, -0.796, 0.596)
		colorDistMagn   0.824943
		colorDistFreq   0.0095517
		detailScale     137.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987755
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431527
		terraceProb     0.529943
		erosion         0
		montesMagn      0.623944
		montesFreq      2.7296
		montesSpiky     0.98088
		montesFraction  0.892393
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0363963
		hillsFraction   0.487991
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231574
		craterFreq      0.241255
		craterDensity   0.883686
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   122.726
		volcanoTemp     1448.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.182, 0.181, 0.000)
		colorShelf     (0.195, 0.193, 0.192, 0.000)
		colorBeach     (0.207, 0.204, 0.203, 0.000)
		colorDesert    (0.218, 0.216, 0.215, 0.000)
		colorLowland   (0.230, 0.227, 0.226, 0.000)
		colorUpland    (0.241, 0.238, 0.237, 0.000)
		colorRock      (0.253, 0.250, 0.248, 0.000)
		colorSnow      (0.264, 0.261, 0.260, 1.000)
		BumpHeight      4.52692
		BumpOffset      0.905385
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.581212
		GasToDust   0.25
		Particles   2153
		GasBright   0.104684
		DustBright  0.529323
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.32571
		Period          35.877
		Eccentricity    0.98556
		Inclination     148.593
		AscendingNode   -69.8927
		ArgOfPericenter -128.562
		MeanAnomaly     82.0804
	}
}

Comet	"C61"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            3.19356e-007
	Radius          90.9041
	InertiaMoment   0.399642

	Oblateness      0.0444206

	RotationPeriod  22.4751
	Obliquity       65.3655
	EqAscendNode    137.481

	AbsMagn         4.03553
	SlopeParam      3.38183
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.708 0.705 0.701)

	Surface
	{
		SurfStyle       0.992512
		OceanStyle      0.363986
		Randomize      (-0.167, 0.000, -0.563)
		colorDistMagn   0.0712636
		colorDistFreq   6.52973
		detailScale     2482.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0.925827
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.684737
		terraceProb     0.258993
		erosion         0
		montesMagn      0.580062
		montesFreq      2.65513
		montesSpiky     0.943203
		montesFraction  0.512632
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.5521
		hillsFraction   0.620386
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204774
		craterFreq      0.339517
		craterDensity   1.06154
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.2204
		volcanoTemp     1626.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.247, 0.280, 0.050)
		colorShelf     (0.283, 0.289, 0.322, 0.040)
		colorBeach     (0.326, 0.331, 0.365, 0.030)
		colorDesert    (0.368, 0.373, 0.414, 0.020)
		colorLowland   (0.411, 0.416, 0.456, 0.030)
		colorUpland    (0.453, 0.458, 0.498, 0.050)
		colorRock      (0.496, 0.500, 0.554, 0.020)
		colorSnow      (0.496, 0.500, 0.554, 1.000)
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
		GasBright   0.0713937
		DustBright  0.2471
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.9654
		Period          17.8067
		Eccentricity    0.950704
		Inclination     -15.0741
		AscendingNode   95.958
		ArgOfPericenter -169.502
		MeanAnomaly     96.9121
	}
}

Comet	"C62"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            9.83325e-015
	Radius          0.31153
	InertiaMoment   0.398461

	Oblateness      0.0723327

	RotationPeriod  20.0923
	Obliquity       18.5712
	EqAscendNode    122.058

	AbsMagn         5.82165
	SlopeParam      2.16722
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.631 0.629 0.627)

	Surface
	{
		SurfStyle       0.63387
		OceanStyle      0.453965
		Randomize      (-0.530, -0.024, 0.271)
		colorDistMagn   0.846885
		colorDistFreq   8.4552e-005
		detailScale     8.50684
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996405
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610657
		terraceProb     0.187283
		erosion         0
		montesMagn      0.395257
		montesFreq      3.17193
		montesSpiky     0.882032
		montesFraction  0.342395
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000276297
		hillsFraction   0.718298
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261715
		craterFreq      0.22688
		craterDensity   1.00103
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   492.558
		volcanoTemp     1010.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.214, 0.175, 0.000)
		colorShelf     (0.252, 0.220, 0.201, 0.000)
		colorBeach     (0.297, 0.258, 0.238, 0.000)
		colorDesert    (0.322, 0.277, 0.232, 0.000)
		colorLowland   (0.353, 0.296, 0.263, 0.000)
		colorUpland    (0.391, 0.359, 0.320, 0.000)
		colorRock      (0.423, 0.390, 0.345, 0.000)
		colorSnow      (0.461, 0.415, 0.363, 1.000)
		BumpHeight      0.280377
		BumpOffset      0.0560754
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.132846
		GasToDust   0.25
		Particles   1248
		GasBright   0.227409
		DustBright  0.575571
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.70719
		Period          48.2499
		Eccentricity    0.983421
		Inclination     -90.801
		AscendingNode   72.0825
		ArgOfPericenter 173.021
		MeanAnomaly     -96.8013
	}
}

Comet	"C63"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            7.6053e-011
	Radius          5.629
	InertiaMoment   0.395521

	Oblateness      0.0712736

	RotationPeriod  17.5803
	Obliquity       331.777
	EqAscendNode    106.636

	AbsMagn         7.2458
	SlopeParam      5.84739
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.634 0.485 0.416)

	Surface
	{
		SurfStyle       0.99605
		OceanStyle      0.780532
		Randomize      (-0.202, -0.246, 0.453)
		colorDistMagn   0.465943
		colorDistFreq   0.00703217
		detailScale     153.709
		colorConversion true
		snowLevel       2
		tropicLatitude  0.530913
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.315522
		terraceProb     0.397106
		erosion         0
		montesMagn      0.413426
		montesFreq      3.1199
		montesSpiky     0.981845
		montesFraction  0.795985
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0693502
		hillsFraction   0.801903
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214415
		craterFreq      0.184772
		craterDensity   0.671391
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   101.2
		volcanoTemp     1609.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.170, 0.167, 0.050)
		colorShelf     (0.254, 0.199, 0.192, 0.040)
		colorBeach     (0.292, 0.228, 0.216, 0.030)
		colorDesert    (0.330, 0.257, 0.246, 0.020)
		colorLowland   (0.368, 0.286, 0.271, 0.030)
		colorUpland    (0.406, 0.315, 0.296, 0.050)
		colorRock      (0.444, 0.344, 0.329, 0.020)
		colorSnow      (0.444, 0.344, 0.329, 1.000)
		BumpHeight      5.0661
		BumpOffset      1.01322
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.614038
		GasToDust   0.25
		Particles   2220
		GasBright   0.166836
		DustBright  0.320631
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.15379
		Period          34.4244
		Eccentricity    0.961761
		Inclination     15.5129
		AscendingNode   -90.7193
		ArgOfPericenter 109.347
		MeanAnomaly     -72.9795
	}
}

Comet	"C64"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            5.88214e-007
	Radius          121.742
	InertiaMoment   0.398976

	Oblateness      0.131286

	RotationPeriod  14.9107
	Obliquity       284.983
	EqAscendNode    91.2132

	AbsMagn         8.5778
	SlopeParam      4.62821
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.829 0.797 0.755)

	Surface
	{
		SurfStyle       0.133437
		OceanStyle      0.707272
		Randomize      (0.949, 0.898, 0.286)
		colorDistMagn   0.67628
		colorDistFreq   1.28376
		detailScale     3324.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.624537
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553152
		terraceProb     0.540278
		erosion         0
		montesMagn      0.443559
		montesFreq      2.28692
		montesSpiky     0.896724
		montesFraction  0.422722
		dunesFraction   0
		hillsMagn       0
		hillsFreq       30.8517
		hillsFraction   0.605484
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222082
		craterFreq      0.459451
		craterDensity   0.85828
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.8873
		volcanoTemp     1623.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.331, 0.319, 0.302, 0.000)
		colorShelf     (0.352, 0.339, 0.321, 0.000)
		colorBeach     (0.373, 0.359, 0.340, 0.000)
		colorDesert    (0.394, 0.379, 0.359, 0.000)
		colorLowland   (0.414, 0.399, 0.378, 0.000)
		colorUpland    (0.435, 0.419, 0.396, 0.000)
		colorRock      (0.456, 0.439, 0.415, 0.000)
		colorSnow      (0.476, 0.459, 0.434, 1.000)
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
		GasBright   0.390041
		DustBright  0.581912
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.09901
		Period          42.6529
		Eccentricity    0.980615
		Inclination     47.1814
		AscendingNode   -31.3258
		ArgOfPericenter -38.9019
		MeanAnomaly     83.5835
	}
}

Comet	"C65"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.81116e-014
	Radius          0.348555
	InertiaMoment   0.397392

	Oblateness      0.152428

	RotationPeriod  12.0454
	Obliquity       238.188
	EqAscendNode    75.7906

	AbsMagn         9.97923
	SlopeParam      3.6186
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.599 0.467 0.397)

	Surface
	{
		SurfStyle       0.371309
		OceanStyle      0.910581
		Randomize      (0.088, -0.942, -0.840)
		colorDistMagn   0.658361
		colorDistFreq   8.32467e-005
		detailScale     9.51788
		colorConversion true
		snowLevel       2
		tropicLatitude  0.741084
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.354111
		terraceProb     0.477366
		erosion         0
		montesMagn      0.550431
		montesFreq      3.13153
		montesSpiky     0.882131
		montesFraction  0.849551
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000345104
		hillsFraction   0.79785
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252048
		craterFreq      0.211957
		craterDensity   0.914782
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   406.069
		volcanoTemp     1710.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.187, 0.159, 0.000)
		colorShelf     (0.255, 0.199, 0.169, 0.000)
		colorBeach     (0.270, 0.210, 0.179, 0.000)
		colorDesert    (0.285, 0.222, 0.189, 0.000)
		colorLowland   (0.300, 0.234, 0.199, 0.000)
		colorUpland    (0.315, 0.245, 0.209, 0.000)
		colorRock      (0.330, 0.257, 0.219, 0.000)
		colorSnow      (0.345, 0.269, 0.229, 1.000)
		BumpHeight      0.3137
		BumpOffset      0.0627399
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.165672
		GasToDust   0.25
		Particles   1314
		GasBright   0.302187
		DustBright  0.354253
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.63384
		Period          57.2082
		Eccentricity    0.988592
		Inclination     -102.358
		AscendingNode   132.294
		ArgOfPericenter 22.5834
		MeanAnomaly     -95.8437
	}
}

Comet	"C66"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.4008e-010
	Radius          7.54021
	InertiaMoment   0.39943

	Oblateness      0.249

	RotationPeriod  8.93204
	Obliquity       191.394
	EqAscendNode    60.368

	AbsMagn         11.6895
	SlopeParam      2.49238
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.570 0.562 0.558)

	Surface
	{
		SurfStyle       0.397632
		OceanStyle      0.0297586
		Randomize      (0.349, -0.492, 0.119)
		colorDistMagn   0.117514
		colorDistFreq   0.0307473
		detailScale     205.898
		colorConversion true
		snowLevel       2
		tropicLatitude  0.39253
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.314019
		terraceProb     0.500216
		erosion         0
		montesMagn      0.363119
		montesFreq      3.22905
		montesSpiky     0.945892
		montesFraction  0.349014
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.135552
		hillsFraction   0.81587
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233399
		craterFreq      0.259281
		craterDensity   0.779343
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   99.8853
		volcanoTemp     1915.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.225, 0.223, 0.000)
		colorShelf     (0.242, 0.239, 0.237, 0.000)
		colorBeach     (0.257, 0.253, 0.251, 0.000)
		colorDesert    (0.271, 0.267, 0.265, 0.000)
		colorLowland   (0.285, 0.281, 0.279, 0.000)
		colorUpland    (0.299, 0.295, 0.293, 0.000)
		colorRock      (0.314, 0.309, 0.307, 0.000)
		colorSnow      (0.328, 0.323, 0.321, 1.000)
		BumpHeight      6.78619
		BumpOffset      1.35724
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.646864
		GasToDust   0.25
		Particles   2286
		GasBright   0.0066095
		DustBright  0.334317
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.08559
		Period          42.532
		Eccentricity    0.978826
		Inclination     -145.624
		AscendingNode   172.77
		ArgOfPericenter -89.4867
		MeanAnomaly     151.169
	}
}

Comet	"C67"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            4.31317e-018
	Radius          0.0215826
	InertiaMoment   0.398166

	Oblateness      0.249

	RotationPeriod  5.49522
	Obliquity       144.6
	EqAscendNode    44.9454

	AbsMagn         14.7414
	SlopeParam      6.2333
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.562 0.557 0.554)

	Surface
	{
		SurfStyle       0.352996
		OceanStyle      0.49297
		Randomize      (0.336, 0.696, 0.787)
		colorDistMagn   0.334354
		colorDistFreq   1.57333e-007
		detailScale     0.589349
		colorConversion true
		snowLevel       2
		tropicLatitude  0.193664
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.596229
		terraceProb     0.152238
		erosion         0
		montesMagn      0.47591
		montesFreq      2.34518
		montesSpiky     0.909841
		montesFraction  0.164472
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.00943e-006
		hillsFraction   0.677151
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263682
		craterFreq      0.223716
		craterDensity   0.724998
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1629.34
		volcanoTemp     1172.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.223, 0.222, 0.000)
		colorShelf     (0.239, 0.237, 0.235, 0.000)
		colorBeach     (0.253, 0.251, 0.249, 0.000)
		colorDesert    (0.267, 0.264, 0.263, 0.000)
		colorLowland   (0.281, 0.278, 0.277, 0.000)
		colorUpland    (0.295, 0.292, 0.291, 0.000)
		colorRock      (0.309, 0.306, 0.305, 0.000)
		colorSnow      (0.323, 0.320, 0.319, 1.000)
		BumpHeight      0.0194244
		BumpOffset      0.00388487
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0647389
		DustBright  0.760674
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.66541
		Period          22.7241
		Eccentricity    0.956706
		Inclination     -151.043
		AscendingNode   -17.2502
		ArgOfPericenter -129.834
		MeanAnomaly     167.105
	}
}

Comet	"C68"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            3.33593e-014
	Radius          0.467013
	InertiaMoment   0.399856

	Oblateness      0.00140526

	RotationPeriod  144.025
	Obliquity       97.8054
	EqAscendNode    29.5228

	AbsMagn         2.72926
	SlopeParam      4.87447
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.676 0.672 0.667)

	Surface
	{
		SurfStyle       0.239681
		OceanStyle      0.635699
		Randomize      (0.722, -0.585, -0.674)
		colorDistMagn   0.685054
		colorDistFreq   0.000105776
		detailScale     12.7526
		colorConversion true
		snowLevel       2
		tropicLatitude  0.956558
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.256188
		terraceProb     0.275525
		erosion         0
		montesMagn      0.456964
		montesFreq      3.38682
		montesSpiky     0.894967
		montesFraction  0.806287
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000493548
		hillsFraction   0.720106
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23998
		craterFreq      0.242207
		craterDensity   0.787247
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   400.891
		volcanoTemp     1376.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.269, 0.267, 0.000)
		colorShelf     (0.287, 0.286, 0.283, 0.000)
		colorBeach     (0.304, 0.303, 0.300, 0.000)
		colorDesert    (0.321, 0.319, 0.317, 0.000)
		colorLowland   (0.338, 0.336, 0.333, 0.000)
		colorUpland    (0.355, 0.353, 0.350, 0.000)
		colorRock      (0.372, 0.370, 0.367, 0.000)
		colorSnow      (0.388, 0.387, 0.383, 1.000)
		BumpHeight      0.420312
		BumpOffset      0.0840623
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.198498
		GasToDust   0.25
		Particles   1380
		GasBright   0.0700997
		DustBright  0.4398
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.90328
		Period          32.3439
		Eccentricity    0.985472
		Inclination     -53.6381
		AscendingNode   -105.337
		ArgOfPericenter -163.877
		MeanAnomaly     52.7999
	}
}

Comet	"C69"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.5801e-010
	Radius          8.43196
	InertiaMoment   0.398732

	Oblateness      0.00155287

	RotationPeriod  119.268
	Obliquity       51.0111
	EqAscendNode    14.1002

	AbsMagn         4.99178
	SlopeParam      3.85012
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.714 0.711 0.708)

	Surface
	{
		SurfStyle       0.185979
		OceanStyle      0.74229
		Randomize      (-0.605, 0.239, -0.507)
		colorDistMagn   0.138929
		colorDistFreq   0.0374665
		detailScale     230.249
		colorConversion true
		snowLevel       2
		tropicLatitude  0.854582
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.323783
		terraceProb     0.219605
		erosion         0
		montesMagn      0.36864
		montesFreq      3.19334
		montesSpiky     0.856094
		montesFraction  0.648789
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.111559
		hillsFraction   0.766127
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200099
		craterFreq      0.176296
		craterDensity   0.67549
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   82.3031
		volcanoTemp     1226.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.284, 0.283, 0.000)
		colorShelf     (0.303, 0.302, 0.301, 0.000)
		colorBeach     (0.321, 0.320, 0.319, 0.000)
		colorDesert    (0.339, 0.338, 0.336, 0.000)
		colorLowland   (0.357, 0.355, 0.354, 0.000)
		colorUpland    (0.375, 0.373, 0.372, 0.000)
		colorRock      (0.393, 0.391, 0.390, 0.000)
		colorSnow      (0.410, 0.409, 0.407, 1.000)
		BumpHeight      7.58876
		BumpOffset      1.51775
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.67969
		GasToDust   0.25
		Particles   2352
		GasBright   0.195419
		DustBright  0.798967
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.74067
		Period          16.3146
		Eccentricity    0.965978
		Inclination     76.6625
		AscendingNode   -28.5308
		ArgOfPericenter 55.6978
		MeanAnomaly     -59.2124
	}
}

Comet	"C70"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            7.94433e-018
	Radius          0.0289252
	InertiaMoment   0.396801

	Oblateness      0.00240014

	RotationPeriod  109.449
	Obliquity       4.21683
	EqAscendNode    358.678

	AbsMagn         6.54704
	SlopeParam      2.78182
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.718 0.598 0.524)

	Surface
	{
		SurfStyle       0.313321
		OceanStyle      0.89485
		Randomize      (0.222, 0.056, -0.459)
		colorDistMagn   0.503034
		colorDistFreq   3.16714e-007
		detailScale     0.78985
		colorConversion true
		snowLevel       2
		tropicLatitude  0.34446
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.659427
		terraceProb     0.454148
		erosion         0
		montesMagn      0.565342
		montesFreq      3.34983
		montesSpiky     0.993289
		montesFraction  0.491661
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.41639e-006
		hillsFraction   0.778051
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226862
		craterFreq      0.197286
		craterDensity   0.885445
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1608.99
		volcanoTemp     1247.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.239, 0.210, 0.000)
		colorShelf     (0.305, 0.254, 0.223, 0.000)
		colorBeach     (0.323, 0.269, 0.236, 0.000)
		colorDesert    (0.341, 0.284, 0.249, 0.000)
		colorLowland   (0.359, 0.299, 0.262, 0.000)
		colorUpland    (0.377, 0.314, 0.275, 0.000)
		colorRock      (0.395, 0.329, 0.288, 0.000)
		colorSnow      (0.413, 0.344, 0.301, 1.000)
		BumpHeight      0.0260327
		BumpOffset      0.00520653
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.173498
		DustBright  0.505375
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.08076
		Period          25.8253
		Eccentricity    0.960711
		Inclination     -17.775
		AscendingNode   119.003
		ArgOfPericenter -26.8132
		MeanAnomaly     -120.695
	}
}

Comet	"C71"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            6.14436e-014
	Radius          0.522088
	InertiaMoment   0.399211

	Oblateness      0.00208718

	RotationPeriod  102.802
	Obliquity       317.423
	EqAscendNode    343.255

	AbsMagn         7.90391
	SlopeParam      6.72752
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.819 0.783 0.734)

	Surface
	{
		SurfStyle       0.574176
		OceanStyle      0.593567
		Randomize      (0.382, 0.207, 0.196)
		colorDistMagn   0.182522
		colorDistFreq   0.000150324
		detailScale     14.2565
		colorConversion true
		snowLevel       2
		tropicLatitude  0.98115
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.459317
		terraceProb     0.281701
		erosion         0
		montesMagn      0.624985
		montesFreq      3.44255
		montesSpiky     0.943662
		montesFraction  0.260435
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000637709
		hillsFraction   0.688893
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240201
		craterFreq      0.224039
		craterDensity   0.880284
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   330.226
		volcanoTemp     1192.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.266, 0.206, 0.000)
		colorShelf     (0.327, 0.274, 0.235, 0.000)
		colorBeach     (0.385, 0.321, 0.279, 0.000)
		colorDesert    (0.417, 0.345, 0.272, 0.000)
		colorLowland   (0.458, 0.368, 0.308, 0.000)
		colorUpland    (0.507, 0.446, 0.375, 0.000)
		colorRock      (0.548, 0.486, 0.404, 0.000)
		colorSnow      (0.598, 0.517, 0.426, 1.000)
		BumpHeight      0.469879
		BumpOffset      0.0939759
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.231324
		GasToDust   0.25
		Particles   1447
		GasBright   0.114318
		DustBright  0.249042
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.74775
		Period          23.3284
		Eccentricity    0.985608
		Inclination     83.5427
		AscendingNode   80.5454
		ArgOfPericenter 83.0662
		MeanAnomaly     -27.4121
	}
}

Comet	"C72"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            4.75222e-010
	Radius          11.3038
	InertiaMoment   0.397825

	Oblateness      0.00302124

	RotationPeriod  97.6278
	Obliquity       270.628
	EqAscendNode    327.832

	AbsMagn         9.2495
	SlopeParam      5.13481
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.501 0.495 0.491)

	Surface
	{
		SurfStyle       0.812373
		OceanStyle      0.465067
		Randomize      (-0.284, 0.054, 0.352)
		colorDistMagn   0.855831
		colorDistFreq   0.0737143
		detailScale     308.669
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994911
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.591378
		terraceProb     0.706164
		erosion         0
		montesMagn      0.319664
		montesFreq      2.92921
		montesSpiky     0.918073
		montesFraction  0.475076
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.223667
		hillsFraction   0.808092
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251552
		craterFreq      0.268121
		craterDensity   0.882864
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   81.2985
		volcanoTemp     1570.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.168, 0.138, 0.000)
		colorShelf     (0.200, 0.173, 0.157, 0.000)
		colorBeach     (0.236, 0.203, 0.187, 0.000)
		colorDesert    (0.256, 0.218, 0.182, 0.000)
		colorLowland   (0.281, 0.232, 0.206, 0.000)
		colorUpland    (0.311, 0.282, 0.251, 0.000)
		colorRock      (0.336, 0.307, 0.270, 0.000)
		colorSnow      (0.366, 0.326, 0.285, 1.000)
		BumpHeight      10.1734
		BumpOffset      2.03469
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.712516
		GasToDust   0.25
		Particles   2419
		GasBright   0.316805
		DustBright  0.531041
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.74544
		Period          39.5065
		Eccentricity    0.984356
		Inclination     96.8262
		AscendingNode   -95.7491
		ArgOfPericenter 30.2569
		MeanAnomaly     153.08
	}
}

Comet	"C73"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.46324e-017
	Radius          0.0323259
	InertiaMoment   0.399648

	Oblateness      0.00252909

	RotationPeriod  93.314
	Obliquity       223.834
	EqAscendNode    312.41

	AbsMagn         10.759
	SlopeParam      4.07964
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.542 0.538 0.534)

	Surface
	{
		SurfStyle       0.181881
		OceanStyle      0.0584195
		Randomize      (0.911, 0.239, -0.012)
		colorDistMagn   0.705106
		colorDistFreq   8.04303e-007
		detailScale     0.882711
		colorConversion true
		snowLevel       2
		tropicLatitude  0.765505
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.418951
		terraceProb     0.447079
		erosion         0
		montesMagn      0.444152
		montesFreq      3.24984
		montesSpiky     0.904888
		montesFraction  0.709344
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.12837e-006
		hillsFraction   0.811495
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262023
		craterFreq      0.27206
		craterDensity   0.86264
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1324.95
		volcanoTemp     1630.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.215, 0.214, 0.000)
		colorShelf     (0.230, 0.229, 0.227, 0.000)
		colorBeach     (0.244, 0.242, 0.240, 0.000)
		colorDesert    (0.258, 0.255, 0.254, 0.000)
		colorLowland   (0.271, 0.269, 0.267, 0.000)
		colorUpland    (0.285, 0.282, 0.280, 0.000)
		colorRock      (0.298, 0.296, 0.294, 0.000)
		colorSnow      (0.312, 0.309, 0.307, 1.000)
		BumpHeight      0.0290933
		BumpOffset      0.00581865
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.230342
		DustBright  0.30199
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.67512
		Period          30.4871
		Eccentricity    0.974939
		Inclination     -113.524
		AscendingNode   124.046
		ArgOfPericenter 5.58627
		MeanAnomaly     131.182
	}
}

Comet	"C74"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.13171e-013
	Radius          0.700125
	InertiaMoment   0.398468

	Oblateness      0.00358995

	RotationPeriod  89.5679
	Obliquity       177.04
	EqAscendNode    296.987

	AbsMagn         12.8435
	SlopeParam      3.04769
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.776 0.738 0.675)

	Surface
	{
		SurfStyle       0.848686
		OceanStyle      0.579536
		Randomize      (0.692, -0.594, 0.638)
		colorDistMagn   0.835602
		colorDistFreq   0.000134836
		detailScale     19.1181
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962117
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.30012
		terraceProb     0.199859
		erosion         0
		montesMagn      0.636202
		montesFreq      2.65537
		montesSpiky     0.893468
		montesFraction  0.836863
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00112381
		hillsFraction   0.551325
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.19503
		craterFreq      0.231476
		craterDensity   0.914073
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   326.297
		volcanoTemp     1810.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.251, 0.189, 0.000)
		colorShelf     (0.310, 0.258, 0.216, 0.000)
		colorBeach     (0.365, 0.303, 0.256, 0.000)
		colorDesert    (0.396, 0.325, 0.250, 0.000)
		colorLowland   (0.434, 0.347, 0.283, 0.000)
		colorUpland    (0.481, 0.421, 0.344, 0.000)
		colorRock      (0.520, 0.457, 0.371, 0.000)
		colorSnow      (0.566, 0.487, 0.391, 1.000)
		BumpHeight      0.630113
		BumpOffset      0.126023
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.26415
		GasToDust   0.25
		Particles   1513
		GasBright   0.10662
		DustBright  0.110198
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.83503
		Period          40.2961
		Eccentricity    0.976924
		Inclination     -74.4343
		AscendingNode   -95.367
		ArgOfPericenter -25.4299
		MeanAnomaly     158.163
	}
}

Comet	"C75"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            8.75299e-010
	Radius          12.6283
	InertiaMoment   0.395584

	Oblateness      0.00290752

	RotationPeriod  86.2249
	Obliquity       130.245
	EqAscendNode    281.565

	AbsMagn         0.279422
	SlopeParam      7.48819
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.643 0.640 0.638)

	Surface
	{
		SurfStyle       0.237469
		OceanStyle      0.0292128
		Randomize      (0.399, -0.509, 0.334)
		colorDistMagn   0.256346
		colorDistFreq   0.118943
		detailScale     344.838
		colorConversion true
		snowLevel       2
		tropicLatitude  0.880673
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.754958
		terraceProb     0.120593
		erosion         0
		montesMagn      0.625373
		montesFreq      3.08162
		montesSpiky     0.799316
		montesFraction  0.623018
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.441525
		hillsFraction   0.620176
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252956
		craterFreq      0.173747
		craterDensity   1.08145
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   66.9228
		volcanoTemp     1437.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.256, 0.255, 0.000)
		colorShelf     (0.273, 0.272, 0.271, 0.000)
		colorBeach     (0.289, 0.288, 0.287, 0.000)
		colorDesert    (0.305, 0.304, 0.303, 0.000)
		colorLowland   (0.322, 0.320, 0.319, 0.000)
		colorUpland    (0.338, 0.336, 0.335, 0.000)
		colorRock      (0.354, 0.352, 0.351, 0.000)
		colorSnow      (0.370, 0.368, 0.367, 1.000)
		BumpHeight      11.3655
		BumpOffset      2.2731
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.745342
		GasToDust   0.25
		Particles   2485
		GasBright   0.0356222
		DustBright  0.665683
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.71305
		Period          23.073
		Eccentricity    0.964969
		Inclination     -92.5483
		AscendingNode   131.218
		ArgOfPericenter 7.63937
		MeanAnomaly     87.8639
	}
}

Comet	"C76"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.69511e-017
	Radius          0.0433639
	InertiaMoment   0.398982

	Oblateness      0.00416085

	RotationPeriod  83.1826
	Obliquity       83.451
	EqAscendNode    266.142

	AbsMagn         4.00568
	SlopeParam      5.41602
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.596 0.532 0.453)

	Surface
	{
		SurfStyle       0.614511
		OceanStyle      0.805155
		Randomize      (0.561, -0.869, 0.661)
		colorDistMagn   0.287163
		colorDistFreq   1.55958e-006
		detailScale     1.18412
		colorConversion true
		snowLevel       2
		tropicLatitude  0.426621
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.745865
		terraceProb     0.300122
		erosion         0
		montesMagn      0.481
		montesFreq      2.41052
		montesSpiky     0.725116
		montesFraction  0.680265
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.47979e-006
		hillsFraction   0.735762
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249397
		craterFreq      0.192665
		craterDensity   0.833236
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1309.62
		volcanoTemp     1663.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.181, 0.127, 0.000)
		colorShelf     (0.238, 0.186, 0.145, 0.000)
		colorBeach     (0.280, 0.218, 0.172, 0.000)
		colorDesert    (0.304, 0.234, 0.167, 0.000)
		colorLowland   (0.334, 0.250, 0.190, 0.000)
		colorUpland    (0.369, 0.303, 0.231, 0.000)
		colorRock      (0.399, 0.330, 0.249, 0.000)
		colorSnow      (0.435, 0.351, 0.262, 1.000)
		BumpHeight      0.0390275
		BumpOffset      0.0078055
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0423752
		DustBright  0.343417
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.16124
		Period          26.4414
		Eccentricity    0.970672
		Inclination     -98.3513
		AscendingNode   154.592
		ArgOfPericenter 29.9378
		MeanAnomaly     72.8127
	}
}

Comet	"C77"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.08448e-013
	Radius          0.781866
	InertiaMoment   0.397404

	Oblateness      0.00335775

	RotationPeriod  80.373
	Obliquity       36.6567
	EqAscendNode    250.719

	AbsMagn         5.80051
	SlopeParam      4.31022
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.422 0.419 0.415)

	Surface
	{
		SurfStyle       0.684898
		OceanStyle      0.509391
		Randomize      (-0.175, -0.007, -0.965)
		colorDistMagn   0.203626
		colorDistFreq   0.000300091
		detailScale     21.3501
		colorConversion true
		snowLevel       2
		tropicLatitude  0.949709
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.367922
		terraceProb     0.606458
		erosion         0
		montesMagn      0.672729
		montesFreq      2.70984
		montesSpiky     0.974623
		montesFraction  0.853254
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00129278
		hillsFraction   0.739478
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236957
		craterFreq      0.149503
		craterDensity   0.811964
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   268.497
		volcanoTemp     1217.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.142, 0.116, 0.000)
		colorShelf     (0.169, 0.147, 0.133, 0.000)
		colorBeach     (0.198, 0.172, 0.158, 0.000)
		colorDesert    (0.215, 0.184, 0.154, 0.000)
		colorLowland   (0.236, 0.197, 0.174, 0.000)
		colorUpland    (0.262, 0.239, 0.212, 0.000)
		colorRock      (0.283, 0.260, 0.228, 0.000)
		colorSnow      (0.308, 0.276, 0.241, 1.000)
		BumpHeight      0.703679
		BumpOffset      0.140736
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.296976
		GasToDust   0.25
		Particles   1579
		GasBright   0.146977
		DustBright  0.723302
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.14227
		Period          43.0435
		Eccentricity    0.975301
		Inclination     -102.918
		AscendingNode   32.1883
		ArgOfPericenter -81.1855
		MeanAnomaly     -159.622
	}
}

Comet	"C78"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.61219e-009
	Radius          16.9466
	InertiaMoment   0.399436

	Oblateness      0.00476027

	RotationPeriod  77.7479
	Obliquity       349.862
	EqAscendNode    235.297

	AbsMagn         7.22726
	SlopeParam      3.29768
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.533 0.529 0.525)

	Surface
	{
		SurfStyle       0.608256
		OceanStyle      0.335658
		Randomize      (-0.214, -0.567, 0.323)
		colorDistMagn   0.824588
		colorDistFreq   0.124195
		detailScale     462.755
		colorConversion true
		snowLevel       2
		tropicLatitude  0.67864
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.654953
		terraceProb     0.1612
		erosion         0
		montesMagn      0.388042
		montesFreq      3.5579
		montesSpiky     0.887587
		montesFraction  0.65767
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.588801
		hillsFraction   0.49926
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274896
		craterFreq      0.192744
		craterDensity   0.733174
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   66.173
		volcanoTemp     1859.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.180, 0.147, 0.000)
		colorShelf     (0.213, 0.185, 0.168, 0.000)
		colorBeach     (0.250, 0.217, 0.199, 0.000)
		colorDesert    (0.272, 0.233, 0.194, 0.000)
		colorLowland   (0.298, 0.249, 0.220, 0.000)
		colorUpland    (0.330, 0.302, 0.268, 0.000)
		colorRock      (0.357, 0.328, 0.289, 0.000)
		colorSnow      (0.389, 0.349, 0.304, 1.000)
		BumpHeight      15.2519
		BumpOffset      3.05039
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.778168
		GasToDust   0.25
		Particles   2551
		GasBright   0.126448
		DustBright  0.428318
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.94821
		Period          32.7139
		Eccentricity    0.967479
		Inclination     145.852
		AscendingNode   35.7409
		ArgOfPericenter -112.863
		MeanAnomaly     64.5886
	}
}

Comet	"C79"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            4.96406e-017
	Radius          0.0484068
	InertiaMoment   0.398174

	Oblateness      0.00382592

	RotationPeriod  75.2722
	Obliquity       303.068
	EqAscendNode    219.874

	AbsMagn         8.55941
	SlopeParam      2.04236
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.810 0.775 0.743)

	Surface
	{
		SurfStyle       0.981779
		OceanStyle      0.241277
		Randomize      (0.256, -0.866, 0.380)
		colorDistMagn   0.000133812
		colorDistFreq   1.42341e-006
		detailScale     1.32183
		colorConversion true
		snowLevel       2
		tropicLatitude  0.949831
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.756685
		terraceProb     0.211723
		erosion         0
		montesMagn      0.373612
		montesFreq      3.07512
		montesSpiky     0.943771
		montesFraction  0.410324
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.41264e-006
		hillsFraction   0.511844
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236099
		craterFreq      0.197928
		craterDensity   0.998488
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1077.19
		volcanoTemp     1226.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.271, 0.297, 0.050)
		colorShelf     (0.324, 0.318, 0.342, 0.040)
		colorBeach     (0.372, 0.364, 0.387, 0.030)
		colorDesert    (0.421, 0.411, 0.439, 0.020)
		colorLowland   (0.470, 0.457, 0.483, 0.030)
		colorUpland    (0.518, 0.504, 0.528, 0.050)
		colorRock      (0.567, 0.550, 0.587, 0.020)
		colorSnow      (0.567, 0.550, 0.587, 1.000)
		BumpHeight      0.0435661
		BumpOffset      0.00871323
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0686593
		DustBright  0.170592
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.68432
		Period          38.9707
		Eccentricity    0.988064
		Inclination     130.623
		AscendingNode   86.1695
		ArgOfPericenter 100.549
		MeanAnomaly     79.2423
	}
}

Comet	"C80"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            3.83934e-013
	Radius          1.04964
	InertiaMoment   0.399861

	Oblateness      0.00540812

	RotationPeriod  72.9192
	Obliquity       256.274
	EqAscendNode    204.452

	AbsMagn         9.95868
	SlopeParam      5.72855
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.654 0.511 0.405)

	Surface
	{
		SurfStyle       0.976939
		OceanStyle      0.450457
		Randomize      (0.003, -0.124, 0.078)
		colorDistMagn   0.58475
		colorDistFreq   0.000521043
		detailScale     28.6621
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984588
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.573828
		terraceProb     0.259651
		erosion         0
		montesMagn      0.494437
		montesFreq      2.95109
		montesSpiky     0.93759
		montesFraction  0.656515
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00216245
		hillsFraction   0.427857
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229673
		craterFreq      0.179827
		craterDensity   0.718272
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   265.593
		volcanoTemp     1382.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.179, 0.162, 0.050)
		colorShelf     (0.262, 0.209, 0.186, 0.040)
		colorBeach     (0.301, 0.240, 0.211, 0.030)
		colorDesert    (0.340, 0.271, 0.239, 0.020)
		colorLowland   (0.379, 0.301, 0.263, 0.030)
		colorUpland    (0.419, 0.332, 0.288, 0.050)
		colorRock      (0.458, 0.363, 0.320, 0.020)
		colorSnow      (0.458, 0.363, 0.320, 1.000)
		BumpHeight      0.944673
		BumpOffset      0.188935
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.329802
		GasToDust   0.25
		Particles   1646
		GasBright   0.250428
		DustBright  0.47331
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.62531
		Period          15.5658
		Eccentricity    0.956694
		Inclination     -171.213
		AscendingNode   66.3166
		ArgOfPericenter 6.79991
		MeanAnomaly     -52.0734
	}
}

Comet	"C81"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.96945e-009
	Radius          18.909
	InertiaMoment   0.398739

	Oblateness      0.00433433

	RotationPeriod  70.6682
	Obliquity       209.48
	EqAscendNode    189.029

	AbsMagn         11.6618
	SlopeParam      4.54501
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.650 0.645 0.641)

	Surface
	{
		SurfStyle       0.36639
		OceanStyle      0.609888
		Randomize      (0.012, 0.347, -1.000)
		colorDistMagn   0.360637
		colorDistFreq   0.170515
		detailScale     516.342
		colorConversion true
		snowLevel       2
		tropicLatitude  0.479533
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.756248
		terraceProb     0.428106
		erosion         0
		montesMagn      0.499391
		montesFreq      3.01641
		montesSpiky     0.953696
		montesFraction  0.395306
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.03586
		hillsFraction   0.770334
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225827
		craterFreq      0.206342
		craterDensity   0.94431
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   54.4047
		volcanoTemp     1410.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.258, 0.257, 0.000)
		colorShelf     (0.276, 0.274, 0.273, 0.000)
		colorBeach     (0.292, 0.290, 0.289, 0.000)
		colorDesert    (0.309, 0.306, 0.305, 0.000)
		colorLowland   (0.325, 0.323, 0.321, 0.000)
		colorUpland    (0.341, 0.339, 0.337, 0.000)
		colorRock      (0.357, 0.355, 0.353, 0.000)
		colorSnow      (0.374, 0.371, 0.369, 1.000)
		BumpHeight      17.0181
		BumpOffset      3.40362
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.810994
		GasToDust   0.25
		Particles   2618
		GasBright   0.165358
		DustBright  0.242867
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.97772
		Period          32.9576
		Eccentricity    0.980066
		Inclination     -163.514
		AscendingNode   -107.839
		ArgOfPericenter 105.268
		MeanAnomaly     -123.42
	}
}

Comet	"C82"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            9.14316e-017
	Radius          0.0650124
	InertiaMoment   0.39682

	Oblateness      0.00604499

	RotationPeriod  68.5026
	Obliquity       162.685
	EqAscendNode    173.607

	AbsMagn         14.6673
	SlopeParam      3.53711
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.701 0.698 0.697)

	Surface
	{
		SurfStyle       0.967196
		OceanStyle      0.470404
		Randomize      (-0.952, -0.226, 0.813)
		colorDistMagn   0.955442
		colorDistFreq   1.76933e-006
		detailScale     1.77527
		colorConversion true
		snowLevel       2
		tropicLatitude  0.957989
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.623235
		terraceProb     0.294808
		erosion         0
		montesMagn      0.525017
		montesFreq      2.78803
		montesSpiky     0.978918
		montesFraction  0.528406
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.54464e-006
		hillsFraction   0.571051
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258774
		craterFreq      0.211651
		craterDensity   0.853109
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1065.99
		volcanoTemp     1501.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.244, 0.279, 0.050)
		colorShelf     (0.280, 0.286, 0.321, 0.040)
		colorBeach     (0.322, 0.328, 0.362, 0.030)
		colorDesert    (0.365, 0.370, 0.411, 0.020)
		colorLowland   (0.407, 0.412, 0.453, 0.030)
		colorUpland    (0.449, 0.454, 0.495, 0.050)
		colorRock      (0.491, 0.496, 0.551, 0.020)
		colorSnow      (0.491, 0.496, 0.551, 1.000)
		BumpHeight      0.0585112
		BumpOffset      0.0117022
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.414317
		DustBright  0.478394
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.18534
		Period          26.6268
		Eccentricity    0.963201
		Inclination     -114.331
		AscendingNode   113.133
		ArgOfPericenter -25.1938
		MeanAnomaly     124.218
	}
}

Comet	"C83"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            7.07158e-013
	Radius          1.17062
	InertiaMoment   0.399217

	Oblateness      0.00489897

	RotationPeriod  66.4088
	Obliquity       115.891
	EqAscendNode    158.184

	AbsMagn         2.68557
	SlopeParam      2.38428
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.751 0.697 0.622)

	Surface
	{
		SurfStyle       0.522475
		OceanStyle      0.585104
		Randomize      (0.572, -0.826, 0.878)
		colorDistMagn   0.811558
		colorDistFreq   0.00058417
		detailScale     31.9658
		colorConversion true
		snowLevel       2
		tropicLatitude  0.769309
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.700146
		terraceProb     0.172788
		erosion         0
		montesMagn      0.467427
		montesFreq      3.88154
		montesSpiky     0.985685
		montesFraction  0.596886
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00346337
		hillsFraction   0.534941
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247386
		craterFreq      0.169604
		craterDensity   0.825489
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   218.255
		volcanoTemp     1845
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.237, 0.174, 0.000)
		colorShelf     (0.300, 0.244, 0.199, 0.000)
		colorBeach     (0.353, 0.286, 0.237, 0.000)
		colorDesert    (0.383, 0.307, 0.230, 0.000)
		colorLowland   (0.420, 0.328, 0.261, 0.000)
		colorUpland    (0.465, 0.397, 0.317, 0.000)
		colorRock      (0.503, 0.432, 0.342, 0.000)
		colorSnow      (0.548, 0.460, 0.361, 1.000)
		BumpHeight      1.05356
		BumpOffset      0.210712
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.362628
		GasToDust   0.25
		Particles   1712
		GasBright   0.0133657
		DustBright  0.563832
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.8729
		Period          17.1873
		Eccentricity    0.953457
		Inclination     57.2554
		AscendingNode   -57.8465
		ArgOfPericenter 148.028
		MeanAnomaly     -22.5535
	}
}

Comet	"C84"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            5.46936e-009
	Radius          25.4071
	InertiaMoment   0.397834

	Oblateness      0.00685581

	RotationPeriod  64.3755
	Obliquity       69.0967
	EqAscendNode    142.761

	AbsMagn         4.96757
	SlopeParam      6.09037
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.772 0.771 0.769)

	Surface
	{
		SurfStyle       0.641668
		OceanStyle      0.187121
		Randomize      (-0.825, 0.959, -0.029)
		colorDistMagn   0.980058
		colorDistFreq   0.433731
		detailScale     693.784
		colorConversion true
		snowLevel       2
		tropicLatitude  0.586704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.51126
		terraceProb     0.321183
		erosion         0
		montesMagn      0.540609
		montesFreq      3.57603
		montesSpiky     0.997394
		montesFraction  0.383115
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.18615
		hillsFraction   0.662649
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243063
		craterFreq      0.191258
		craterDensity   0.664676
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   53.8634
		volcanoTemp     1250.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.262, 0.215, 0.000)
		colorShelf     (0.309, 0.270, 0.246, 0.000)
		colorBeach     (0.363, 0.316, 0.292, 0.000)
		colorDesert    (0.394, 0.339, 0.285, 0.000)
		colorLowland   (0.432, 0.362, 0.323, 0.000)
		colorUpland    (0.479, 0.439, 0.392, 0.000)
		colorRock      (0.517, 0.478, 0.423, 0.000)
		colorSnow      (0.564, 0.509, 0.446, 1.000)
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
		MaxLength   0.84382
		GasToDust   0.25
		Particles   2684
		GasBright   0.0215109
		DustBright  0.240174
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.51575
		Period          21.6395
		Eccentricity    0.975934
		Inclination     83.5798
		AscendingNode   146.032
		ArgOfPericenter 30.1724
		MeanAnomaly     -155.611
	}
}

Comet	"C85"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.68406e-016
	Radius          0.0724689
	InertiaMoment   0.399653

	Oblateness      0.00553805

	RotationPeriod  62.3931
	Obliquity       22.3024
	EqAscendNode    127.339

	AbsMagn         6.52758
	SlopeParam      4.78759
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.574 0.571 0.569)

	Surface
	{
		SurfStyle       0.872409
		OceanStyle      0.887353
		Randomize      (-0.627, -0.312, -0.112)
		colorDistMagn   0.38709
		colorDistFreq   3.11341e-006
		detailScale     1.97889
		colorConversion true
		snowLevel       2
		tropicLatitude  0.421898
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.658937
		terraceProb     0.327259
		erosion         0
		montesMagn      0.51061
		montesFreq      2.8412
		montesSpiky     0.983301
		montesFraction  0.598155
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.40715e-005
		hillsFraction   0.937079
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271452
		craterFreq      0.213118
		craterDensity   0.878862
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   875.547
		volcanoTemp     1497.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.200, 0.227, 0.050)
		colorShelf     (0.230, 0.234, 0.262, 0.040)
		colorBeach     (0.264, 0.268, 0.296, 0.030)
		colorDesert    (0.299, 0.302, 0.336, 0.020)
		colorLowland   (0.333, 0.337, 0.370, 0.030)
		colorUpland    (0.368, 0.371, 0.404, 0.050)
		colorRock      (0.402, 0.405, 0.449, 0.020)
		colorSnow      (0.402, 0.405, 0.449, 1.000)
		BumpHeight      0.065222
		BumpOffset      0.0130444
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.105394
		DustBright  0.640777
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.62384
		Period          30.0747
		Eccentricity    0.972941
		Inclination     143.202
		AscendingNode   -43.1689
		ArgOfPericenter -9.34596
		MeanAnomaly     173.657
	}
}

Comet	"C86"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.3025e-012
	Radius          1.57368
	InertiaMoment   0.398475

	Oblateness      0.00777576

	RotationPeriod  60.4535
	Obliquity       335.508
	EqAscendNode    111.916

	AbsMagn         7.8857
	SlopeParam      3.77006
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.632 0.628 0.626)

	Surface
	{
		SurfStyle       0.971756
		OceanStyle      0.645934
		Randomize      (-0.588, 0.591, -0.847)
		colorDistMagn   0.927861
		colorDistFreq   0.000575137
		detailScale     42.972
		colorConversion true
		snowLevel       2
		tropicLatitude  0.592419
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637609
		terraceProb     0.384406
		erosion         0
		montesMagn      0.391888
		montesFreq      3.02903
		montesSpiky     0.99701
		montesFraction  0.341186
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00470135
		hillsFraction   0.949568
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246847
		craterFreq      0.155181
		craterDensity   0.993893
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   216.189
		volcanoTemp     1745.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.220, 0.251, 0.050)
		colorShelf     (0.253, 0.258, 0.288, 0.040)
		colorBeach     (0.291, 0.295, 0.326, 0.030)
		colorDesert    (0.329, 0.333, 0.369, 0.020)
		colorLowland   (0.367, 0.371, 0.407, 0.030)
		colorUpland    (0.405, 0.408, 0.445, 0.050)
		colorRock      (0.443, 0.446, 0.495, 0.020)
		colorSnow      (0.443, 0.446, 0.495, 1.000)
		BumpHeight      1.41631
		BumpOffset      0.283263
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.395454
		GasToDust   0.25
		Particles   1778
		GasBright   0.0862573
		DustBright  0.3444
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.21898
		Period          26.8863
		Eccentricity    0.964479
		Inclination     161.236
		AscendingNode   -65.1592
		ArgOfPericenter 5.44258
		MeanAnomaly     -6.02375
	}
}

Comet	"C87"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.00739e-008
	Radius          28.3055
	InertiaMoment   0.395642

	Oblateness      0.00617122

	RotationPeriod  58.5494
	Obliquity       288.714
	EqAscendNode    96.4936

	AbsMagn         9.2304
	SlopeParam      2.68442
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.698 0.642 0.535)

	Surface
	{
		SurfStyle       0.538905
		OceanStyle      0.586424
		Randomize      (-0.306, -0.479, -0.839)
		colorDistMagn   0.587509
		colorDistFreq   0.286395
		detailScale     772.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.787966
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504615
		terraceProb     0.340711
		erosion         0
		montesMagn      0.61843
		montesFreq      3.0335
		montesSpiky     0.989465
		montesFraction  0.252761
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.3584
		hillsFraction   0.725352
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257423
		craterFreq      0.276416
		craterDensity   0.960226
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   44.2159
		volcanoTemp     1409
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.218, 0.150, 0.000)
		colorShelf     (0.279, 0.225, 0.171, 0.000)
		colorBeach     (0.328, 0.263, 0.203, 0.000)
		colorDesert    (0.356, 0.282, 0.198, 0.000)
		colorLowland   (0.391, 0.302, 0.225, 0.000)
		colorUpland    (0.433, 0.366, 0.273, 0.000)
		colorRock      (0.468, 0.398, 0.294, 0.000)
		colorSnow      (0.510, 0.424, 0.310, 1.000)
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
		MaxLength   0.876646
		GasToDust   0.25
		Particles   2750
		GasBright   0.237331
		DustBright  0.677813
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.77666
		Period          23.5418
		Eccentricity    0.967348
		Inclination     118.303
		AscendingNode   123.775
		ArgOfPericenter -81.6185
		MeanAnomaly     120.114
	}
}

Comet	"C88"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            3.10181e-016
	Radius          0.0974717
	InertiaMoment   0.398988

	Oblateness      0.00884491

	RotationPeriod  56.6744
	Obliquity       241.919
	EqAscendNode    81.071

	AbsMagn         10.736
	SlopeParam      6.53803
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.635 0.632 0.631)

	Surface
	{
		SurfStyle       0.22336
		OceanStyle      0.136033
		Randomize      (-0.457, -0.326, -0.165)
		colorDistMagn   0.315185
		colorDistFreq   4.31075e-006
		detailScale     2.66163
		colorConversion true
		snowLevel       2
		tropicLatitude  0.873136
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.440132
		terraceProb     0.176967
		erosion         0
		montesMagn      0.478007
		montesFreq      2.63587
		montesSpiky     0.904422
		montesFraction  0.716553
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.88248e-005
		hillsFraction   0.551376
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256462
		craterFreq      0.26938
		craterDensity   0.946517
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   867.714
		volcanoTemp     1364.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.253, 0.252, 0.000)
		colorShelf     (0.270, 0.269, 0.268, 0.000)
		colorBeach     (0.286, 0.285, 0.284, 0.000)
		colorDesert    (0.302, 0.300, 0.300, 0.000)
		colorLowland   (0.317, 0.316, 0.315, 0.000)
		colorUpland    (0.333, 0.332, 0.331, 0.000)
		colorRock      (0.349, 0.348, 0.347, 0.000)
		colorSnow      (0.365, 0.364, 0.363, 1.000)
		BumpHeight      0.0877245
		BumpOffset      0.0175449
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.190912
		DustBright  0.408719
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.73283
		Period          23.2185
		Eccentricity    0.966472
		Inclination     1.25103
		AscendingNode   -151.179
		ArgOfPericenter -0.420303
		MeanAnomaly     -39.2933
	}
}

Comet	"C89"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.39903e-012
	Radius          1.75216
	InertiaMoment   0.397416

	Oblateness      0.00705752

	RotationPeriod  54.8227
	Obliquity       195.125
	EqAscendNode    65.6484

	AbsMagn         12.8059
	SlopeParam      5.04239
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.772 0.768 0.766)

	Surface
	{
		SurfStyle       0.145289
		OceanStyle      0.531466
		Randomize      (0.897, 0.946, -0.203)
		colorDistMagn   0.466827
		colorDistFreq   0.000381027
		detailScale     47.8456
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995171
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.342359
		terraceProb     0.499666
		erosion         0
		montesMagn      0.351592
		montesFreq      2.51121
		montesSpiky     0.954533
		montesFraction  0.542307
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00741455
		hillsFraction   0.614109
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215025
		craterFreq      0.151043
		craterDensity   1.00867
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   177.362
		volcanoTemp     1025.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.307, 0.307, 0.000)
		colorShelf     (0.328, 0.326, 0.326, 0.000)
		colorBeach     (0.347, 0.346, 0.345, 0.000)
		colorDesert    (0.367, 0.365, 0.364, 0.000)
		colorLowland   (0.386, 0.384, 0.383, 0.000)
		colorUpland    (0.405, 0.403, 0.402, 0.000)
		colorRock      (0.424, 0.422, 0.421, 0.000)
		colorSnow      (0.444, 0.441, 0.441, 1.000)
		BumpHeight      1.57694
		BumpOffset      0.315389
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.428279
		GasToDust   0.25
		Particles   1845
		GasBright   0.107234
		DustBright  0.176884
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.91251
		Period          40.9833
		Eccentricity    0.988812
		Inclination     -81.2484
		AscendingNode   -161.833
		ArgOfPericenter -151.002
		MeanAnomaly     -6.36148
	}
}

Comet	"C90"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.85548e-008
	Radius          38.0928
	InertiaMoment   0.399441

	Oblateness      0.0101132

	RotationPeriod  52.9888
	Obliquity       148.331
	EqAscendNode    50.2258

	AbsMagn         0.158699
	SlopeParam      3.99993
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.614 0.612 0.610)

	Surface
	{
		SurfStyle       0.771949
		OceanStyle      0.597942
		Randomize      (0.252, -0.314, 0.444)
		colorDistMagn   0.0624789
		colorDistFreq   1.17422
		detailScale     1040.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.938564
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.326971
		terraceProb     0.409273
		erosion         0
		montesMagn      0.522912
		montesFreq      2.59817
		montesSpiky     0.921529
		montesFraction  0.605173
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.29544
		hillsFraction   0.620443
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266646
		craterFreq      0.193902
		craterDensity   0.870713
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   43.845
		volcanoTemp     1805.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.208, 0.171, 0.000)
		colorShelf     (0.245, 0.214, 0.195, 0.000)
		colorBeach     (0.288, 0.251, 0.232, 0.000)
		colorDesert    (0.313, 0.269, 0.226, 0.000)
		colorLowland   (0.344, 0.288, 0.256, 0.000)
		colorUpland    (0.380, 0.349, 0.311, 0.000)
		colorRock      (0.411, 0.379, 0.335, 0.000)
		colorSnow      (0.448, 0.404, 0.354, 1.000)
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
		MaxLength   0.909472
		GasToDust   0.25
		Particles   2817
		GasBright   0.335475
		DustBright  0.433129
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.59483
		Period          47.1987
		Eccentricity    0.986678
		Inclination     -85.0953
		AscendingNode   -121.375
		ArgOfPericenter -96.6444
		MeanAnomaly     104.576
	}
}

Comet	"C91"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            5.71316e-016
	Radius          0.108457
	InertiaMoment   0.398182

	Oblateness      0.0080917

	RotationPeriod  51.1678
	Obliquity       101.537
	EqAscendNode    34.8032

	AbsMagn         3.97559
	SlopeParam      2.95744
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.598 0.595 0.593)

	Surface
	{
		SurfStyle       0.387101
		OceanStyle      0.425295
		Randomize      (0.598, 0.392, -0.090)
		colorDistMagn   0.364149
		colorDistFreq   4.96402e-006
		detailScale     2.9616
		colorConversion true
		snowLevel       2
		tropicLatitude  0.973855
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.677112
		terraceProb     0.416619
		erosion         0
		montesMagn      0.485183
		montesFreq      2.74501
		montesSpiky     0.953958
		montesFraction  0.581377
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.42222e-005
		hillsFraction   0.587138
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238352
		craterFreq      0.254688
		craterDensity   0.903081
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   711.42
		volcanoTemp     1578.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.238, 0.237, 0.000)
		colorShelf     (0.254, 0.253, 0.252, 0.000)
		colorBeach     (0.269, 0.268, 0.267, 0.000)
		colorDesert    (0.284, 0.283, 0.282, 0.000)
		colorLowland   (0.299, 0.298, 0.297, 0.000)
		colorUpland    (0.314, 0.312, 0.311, 0.000)
		colorRock      (0.329, 0.327, 0.326, 0.000)
		colorSnow      (0.344, 0.342, 0.341, 1.000)
		BumpHeight      0.0976114
		BumpOffset      0.0195223
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.224515
		DustBright  0.228576
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.3974
		Period          28.2767
		Eccentricity    0.96952
		Inclination     -176.021
		AscendingNode   65.991
		ArgOfPericenter 174.483
		MeanAnomaly     -85.7045
	}
}

Comet	"C92"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            4.41872e-012
	Radius          2.35943
	InertiaMoment   0.399867

	Oblateness      0.0116505

	RotationPeriod  49.3549
	Obliquity       54.7423
	EqAscendNode    19.3806

	AbsMagn         5.7793
	SlopeParam      7.17028
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.639 0.635 0.632)

	Surface
	{
		SurfStyle       0.179612
		OceanStyle      0.210149
		Randomize      (-0.830, 0.313, 0.325)
		colorDistMagn   0.890633
		colorDistFreq   0.00244325
		detailScale     64.4282
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986008
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.748768
		terraceProb     0.211933
		erosion         0
		montesMagn      0.468522
		montesFreq      2.47302
		montesSpiky     0.857153
		montesFraction  0.485646
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0107243
		hillsFraction   0.603404
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230474
		craterFreq      0.234196
		craterDensity   0.914494
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   175.981
		volcanoTemp     1620.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.254, 0.253, 0.000)
		colorShelf     (0.272, 0.270, 0.269, 0.000)
		colorBeach     (0.288, 0.286, 0.284, 0.000)
		colorDesert    (0.304, 0.302, 0.300, 0.000)
		colorLowland   (0.319, 0.318, 0.316, 0.000)
		colorUpland    (0.335, 0.334, 0.332, 0.000)
		colorRock      (0.351, 0.349, 0.347, 0.000)
		colorSnow      (0.367, 0.365, 0.363, 1.000)
		BumpHeight      2.12349
		BumpOffset      0.424698
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.461105
		GasToDust   0.25
		Particles   1911
		GasBright   0.0511575
		DustBright  0.88642
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.82003
		Period          40.1635
		Eccentricity    0.967143
		Inclination     -40.594
		AscendingNode   120.745
		ArgOfPericenter -62.7582
		MeanAnomaly     110.425
	}
}

Comet	"C93"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            3.41756e-008
	Radius          42.3568
	InertiaMoment   0.398745

	Oblateness      0.00935163

	RotationPeriod  47.5454
	Obliquity       7.948
	EqAscendNode    3.95806

	AbsMagn         7.20871
	SlopeParam      5.3154
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.702 0.599 0.498)

	Surface
	{
		SurfStyle       0.51575
		OceanStyle      0.560215
		Randomize      (0.976, -0.126, 0.961)
		colorDistMagn   0.301853
		colorDistFreq   0.674742
		detailScale     1156.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.956319
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.382207
		terraceProb     0.166287
		erosion         0
		montesMagn      0.509262
		montesFreq      3.89566
		montesSpiky     0.876966
		montesFraction  0.732725
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.51481
		hillsFraction   0.642983
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248166
		craterFreq      0.252067
		craterDensity   0.916643
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.9228
		volcanoTemp     1635.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.204, 0.139, 0.000)
		colorShelf     (0.281, 0.210, 0.159, 0.000)
		colorBeach     (0.330, 0.246, 0.189, 0.000)
		colorDesert    (0.358, 0.264, 0.184, 0.000)
		colorLowland   (0.393, 0.282, 0.209, 0.000)
		colorUpland    (0.435, 0.342, 0.254, 0.000)
		colorRock      (0.470, 0.371, 0.274, 0.000)
		colorSnow      (0.512, 0.395, 0.289, 1.000)
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
		MaxLength   0.942297
		GasToDust   0.25
		Particles   2883
		GasBright   0.0706719
		DustBright  0.551392
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.81153
		Period          40.0884
		Eccentricity    0.983068
		Inclination     -79.8363
		AscendingNode   -30.2616
		ArgOfPericenter 15.1469
		MeanAnomaly     -70.7778
	}
}

Comet	"C94"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.05229e-015
	Radius          0.146142
	InertiaMoment   0.396838

	Oblateness      0.0133856

	RotationPeriod  45.7348
	Obliquity       321.154
	EqAscendNode    348.535

	AbsMagn         8.54103
	SlopeParam      4.22979
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.602 0.597 0.591)

	Surface
	{
		SurfStyle       0.102081
		OceanStyle      0.976294
		Randomize      (0.526, -0.239, -0.081)
		colorDistMagn   0.505233
		colorDistFreq   7.98055e-006
		detailScale     3.99064
		colorConversion true
		snowLevel       2
		tropicLatitude  0.842555
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.555965
		terraceProb     0.404918
		erosion         0
		montesMagn      0.472049
		montesFreq      2.86506
		montesSpiky     0.938131
		montesFraction  0.603215
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.00363e-005
		hillsFraction   0.69956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223056
		craterFreq      0.183129
		craterDensity   0.931928
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   706.336
		volcanoTemp     1454.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.239, 0.236, 0.000)
		colorShelf     (0.256, 0.254, 0.251, 0.000)
		colorBeach     (0.271, 0.268, 0.266, 0.000)
		colorDesert    (0.286, 0.283, 0.281, 0.000)
		colorLowland   (0.301, 0.298, 0.296, 0.000)
		colorUpland    (0.316, 0.313, 0.310, 0.000)
		colorRock      (0.331, 0.328, 0.325, 0.000)
		colorSnow      (0.346, 0.343, 0.340, 1.000)
		BumpHeight      0.131527
		BumpOffset      0.0263055
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0127394
		GasToDust   0.25
		Particles   1005
		GasBright   0.0529272
		DustBright  0.253623
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.49211
		Period          14.7158
		Eccentricity    0.944929
		Inclination     87.6599
		AscendingNode   -155.529
		ArgOfPericenter 41.8002
		MeanAnomaly     63.0197
	}
}

Comet	"C95"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            8.13874e-012
	Radius          2.62159
	InertiaMoment   0.399222

	Oblateness      0.0109314

	RotationPeriod  43.9184
	Obliquity       274.359
	EqAscendNode    333.113

	AbsMagn         9.93818
	SlopeParam      3.21225
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.608 0.545 0.495)

	Surface
	{
		SurfStyle       0.840809
		OceanStyle      0.288221
		Randomize      (0.499, 0.908, 0.872)
		colorDistMagn   0.648224
		colorDistFreq   0.00515925
		detailScale     71.587
		colorConversion true
		snowLevel       2
		tropicLatitude  0.845093
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492193
		terraceProb     0.365986
		erosion         0
		montesMagn      0.37118
		montesFreq      2.86656
		montesSpiky     0.932924
		montesFraction  0.583055
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0202331
		hillsFraction   0.65192
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.280538
		craterFreq      0.220034
		craterDensity   1.07984
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   144.076
		volcanoTemp     1723.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.185, 0.139, 0.000)
		colorShelf     (0.243, 0.191, 0.158, 0.000)
		colorBeach     (0.286, 0.223, 0.188, 0.000)
		colorDesert    (0.310, 0.240, 0.183, 0.000)
		colorLowland   (0.341, 0.256, 0.208, 0.000)
		colorUpland    (0.377, 0.310, 0.252, 0.000)
		colorRock      (0.408, 0.338, 0.272, 0.000)
		colorSnow      (0.444, 0.359, 0.287, 1.000)
		BumpHeight      2.35944
		BumpOffset      0.471887
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.493931
		GasToDust   0.25
		Particles   1977
		GasBright   0.183283
		DustBright  0.607754
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.50645
		Period          46.3772
		Eccentricity    0.98608
		Inclination     36.2536
		AscendingNode   36.6094
		ArgOfPericenter 86.2759
		MeanAnomaly     -161.043
	}
}

Comet	"C96"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            6.29472e-008
	Radius          57.1139
	InertiaMoment   0.397843

	Oblateness      0.0158286

	RotationPeriod  42.0915
	Obliquity       227.565
	EqAscendNode    317.69

	AbsMagn         11.6342
	SlopeParam      8.60054
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.781 0.778 0.777)

	Surface
	{
		SurfStyle       0.430635
		OceanStyle      0.514219
		Randomize      (0.458, 0.757, 0.163)
		colorDistMagn   0.86641
		colorDistFreq   2.23531
		detailScale     1559.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0547018
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381781
		terraceProb     0.291504
		erosion         0
		montesMagn      0.49397
		montesFreq      3.42627
		montesSpiky     0.8414
		montesFraction  0.723064
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.55064
		hillsFraction   0.739541
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231389
		craterFreq      0.223135
		craterDensity   1.0487
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.6911
		volcanoTemp     1590.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.311, 0.311, 0.000)
		colorShelf     (0.332, 0.331, 0.330, 0.000)
		colorBeach     (0.351, 0.350, 0.350, 0.000)
		colorDesert    (0.371, 0.369, 0.369, 0.000)
		colorLowland   (0.390, 0.389, 0.388, 0.000)
		colorUpland    (0.410, 0.408, 0.408, 0.000)
		colorRock      (0.429, 0.428, 0.427, 0.000)
		colorSnow      (0.449, 0.447, 0.447, 1.000)
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
		MaxLength   0.975123
		GasToDust   0.25
		Particles   2949
		GasBright   0.138256
		DustBright  0.337268
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.06418
		Period          25.699
		Eccentricity    0.964447
		Inclination     50.533
		AscendingNode   -178.659
		ArgOfPericenter -79.4262
		MeanAnomaly     -75.3717
	}
}

Comet	"C97"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.93819e-015
	Radius          0.16225
	InertiaMoment   0.399658

	Oblateness      0.0129771

	RotationPeriod  40.2493
	Obliquity       180.771
	EqAscendNode    302.268

	AbsMagn         14.5953
	SlopeParam      5.61552
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.556 0.549 0.546)

	Surface
	{
		SurfStyle       0.893634
		OceanStyle      0.768207
		Randomize      (-0.994, -0.999, 0.644)
		colorDistMagn   0.685614
		colorDistFreq   1.78705e-005
		detailScale     4.43049
		colorConversion true
		snowLevel       2
		tropicLatitude  0.473859
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.528011
		terraceProb     0.187123
		erosion         0
		montesMagn      0.525024
		montesFreq      2.55351
		montesSpiky     0.893719
		montesFraction  0.393307
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.05477e-005
		hillsFraction   0.746364
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224998
		craterFreq      0.215549
		craterDensity   1.05285
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   577.819
		volcanoTemp     1351.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.192, 0.218, 0.050)
		colorShelf     (0.223, 0.225, 0.251, 0.040)
		colorBeach     (0.256, 0.258, 0.284, 0.030)
		colorDesert    (0.289, 0.291, 0.322, 0.020)
		colorLowland   (0.323, 0.324, 0.355, 0.030)
		colorUpland    (0.356, 0.357, 0.388, 0.050)
		colorRock      (0.389, 0.390, 0.431, 0.020)
		colorSnow      (0.389, 0.390, 0.431, 1.000)
		BumpHeight      0.146025
		BumpOffset      0.0292049
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0455652
		GasToDust   0.25
		Particles   1071
		GasBright   0.335802
		DustBright  0.624208
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.67832
		Period          47.979
		Eccentricity    0.991481
		Inclination     152.476
		AscendingNode   -170.783
		ArgOfPericenter 97.2681
		MeanAnomaly     -53.7325
	}
}

Comet	"C98"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.49905e-011
	Radius          3.53761
	InertiaMoment   0.398482

	Oblateness      0.0190362

	RotationPeriod  38.3866
	Obliquity       133.977
	EqAscendNode    286.845

	AbsMagn         2.64124
	SlopeParam      4.46274
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.579 0.573 0.570)

	Surface
	{
		SurfStyle       0.574759
		OceanStyle      0.260864
		Randomize      (-0.594, 0.104, -0.465)
		colorDistMagn   0.768679
		colorDistFreq   0.010455
		detailScale     96.6004
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997099
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570136
		terraceProb     0.241254
		erosion         0
		montesMagn      0.538554
		montesFreq      2.48105
		montesSpiky     0.83377
		montesFraction  0.20693
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.027748
		hillsFraction   0.533944
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265299
		craterFreq      0.23796
		craterDensity   0.993937
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   143.255
		volcanoTemp     1620.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.195, 0.160, 0.000)
		colorShelf     (0.232, 0.201, 0.182, 0.000)
		colorBeach     (0.272, 0.235, 0.217, 0.000)
		colorDesert    (0.295, 0.252, 0.211, 0.000)
		colorLowland   (0.324, 0.269, 0.240, 0.000)
		colorUpland    (0.359, 0.327, 0.291, 0.000)
		colorRock      (0.388, 0.355, 0.314, 0.000)
		colorSnow      (0.423, 0.378, 0.331, 1.000)
		BumpHeight      3.18385
		BumpOffset      0.63677
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.526757
		GasToDust   0.25
		Particles   2043
		GasBright   0.263493
		DustBright  0.381004
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.38394
		Period          28.171
		Eccentricity    0.980578
		Inclination     131.619
		AscendingNode   -2.90763
		ArgOfPericenter 95.4769
		MeanAnomaly     -64.9006
	}
}

Comet	"C99"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.15941e-007
	Radius          63.3542
	InertiaMoment   0.395697

	Oblateness      0.0154756

	RotationPeriod  36.4977
	Obliquity       87.1822
	EqAscendNode    271.423

	AbsMagn         4.94325
	SlopeParam      3.45484
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.792 0.709 0.619)

	Surface
	{
		SurfStyle       0.313962
		OceanStyle      0.479048
		Randomize      (0.450, 0.515, 0.259)
		colorDistMagn   0.903045
		colorDistFreq   2.74453
		detailScale     1729.99
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999689
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553415
		terraceProb     0.356716
		erosion         0
		montesMagn      0.416633
		montesFreq      3.36501
		montesSpiky     0.901907
		montesFraction  0.651887
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.3703
		hillsFraction   0.701973
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.282203
		craterFreq      0.259847
		craterDensity   0.835465
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.1718
		volcanoTemp     1533.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.283, 0.248, 0.000)
		colorShelf     (0.337, 0.301, 0.263, 0.000)
		colorBeach     (0.357, 0.319, 0.278, 0.000)
		colorDesert    (0.376, 0.337, 0.294, 0.000)
		colorLowland   (0.396, 0.354, 0.309, 0.000)
		colorUpland    (0.416, 0.372, 0.325, 0.000)
		colorRock      (0.436, 0.390, 0.340, 0.000)
		colorSnow      (0.456, 0.407, 0.356, 1.000)
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
		GasBright   0.153925
		DustBright  0.175058
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.41126
		Period          45.4979
		Eccentricity    0.985514
		Inclination     -158.644
		AscendingNode   78.79
		ArgOfPericenter 43.2764
		MeanAnomaly     -152.522
	}
}

Comet	"C100"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            3.5699e-015
	Radius          0.219119
	InertiaMoment   0.398994

	Oblateness      0.0234573

	RotationPeriod  34.5767
	Obliquity       40.3879
	EqAscendNode    256

	AbsMagn         6.50808
	SlopeParam      2.27124
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.719 0.718 0.715)

	Surface
	{
		SurfStyle       0.0189943
		OceanStyle      0.765011
		Randomize      (-0.977, 0.826, 0.825)
		colorDistMagn   0.986537
		colorDistFreq   2.32567e-005
		detailScale     5.98342
		colorConversion true
		snowLevel       2
		tropicLatitude  0.740812
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.299985
		terraceProb     0.435859
		erosion         0
		montesMagn      0.580682
		montesFreq      2.83759
		montesSpiky     0.965022
		montesFraction  0.495894
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000144458
		hillsFraction   0.542949
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222106
		craterFreq      0.243337
		craterDensity   0.741186
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   574.987
		volcanoTemp     1247.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.287, 0.286, 0.000)
		colorShelf     (0.306, 0.305, 0.304, 0.000)
		colorBeach     (0.324, 0.323, 0.322, 0.000)
		colorDesert    (0.341, 0.341, 0.340, 0.000)
		colorLowland   (0.359, 0.359, 0.358, 0.000)
		colorUpland    (0.377, 0.377, 0.376, 0.000)
		colorRock      (0.395, 0.395, 0.393, 0.000)
		colorSnow      (0.413, 0.413, 0.411, 1.000)
		BumpHeight      0.197207
		BumpOffset      0.0394415
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0783912
		GasToDust   0.25
		Particles   1138
		GasBright   0.0219031
		DustBright  0.791567
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.75371
		Period          23.3723
		Eccentricity    0.968408
		Inclination     -165.497
		AscendingNode   66.1204
		ArgOfPericenter 14.6862
		MeanAnomaly     134.44
	}
}

Comet	"C101"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.76107e-011
	Radius          3.92046
	InertiaMoment   0.397428

	Oblateness      0.0194074

	RotationPeriod  32.6165
	Obliquity       353.594
	EqAscendNode    240.577

	AbsMagn         7.86749
	SlopeParam      5.9574
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.818 0.800 0.769)

	Surface
	{
		SurfStyle       0.635393
		OceanStyle      0.972816
		Randomize      (0.795, 0.184, 0.686)
		colorDistMagn   0.449223
		colorDistFreq   0.0127429
		detailScale     107.055
		colorConversion true
		snowLevel       2
		tropicLatitude  0.282233
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.325998
		terraceProb     0.638971
		erosion         0
		montesMagn      0.615016
		montesFreq      2.53592
		montesSpiky     0.801953
		montesFraction  0.629717
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0497461
		hillsFraction   0.884247
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226541
		craterFreq      0.18219
		craterDensity   1.02598
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   116.978
		volcanoTemp     1523.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.272, 0.215, 0.000)
		colorShelf     (0.327, 0.280, 0.246, 0.000)
		colorBeach     (0.385, 0.328, 0.292, 0.000)
		colorDesert    (0.417, 0.352, 0.284, 0.000)
		colorLowland   (0.458, 0.376, 0.323, 0.000)
		colorUpland    (0.507, 0.456, 0.392, 0.000)
		colorRock      (0.548, 0.496, 0.423, 0.000)
		colorSnow      (0.597, 0.528, 0.446, 1.000)
		BumpHeight      3.52842
		BumpOffset      0.705683
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.559583
		GasToDust   0.25
		Particles   2110
		GasBright   0.0428097
		DustBright  0.455147
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.60797
		Period          22.3058
		Eccentricity    0.954741
		Inclination     -18.7666
		AscendingNode   120.876
		ArgOfPericenter -10.6511
		MeanAnomaly     -53.7015
	}
}

Comet	"C102"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.13548e-007
	Radius          85.6351
	InertiaMoment   0.399446

	Oblateness      0.0299183

	RotationPeriod  30.6097
	Obliquity       306.799
	EqAscendNode    225.155

	AbsMagn         9.21132
	SlopeParam      4.70217
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.654 0.493 0.367)

	Surface
	{
		SurfStyle       0.803997
		OceanStyle      0.955684
		Randomize      (0.314, -0.520, -0.777)
		colorDistMagn   0.540073
		colorDistFreq   6.10465
		detailScale     2338.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987529
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.754036
		terraceProb     0.249847
		erosion         0
		montesMagn      0.450369
		montesFreq      2.26786
		montesSpiky     0.905924
		montesFraction  0.581645
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.129
		hillsFraction   0.855173
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234819
		craterFreq      0.234668
		craterDensity   0.968698
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.0543
		volcanoTemp     1242.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.168, 0.103, 0.000)
		colorShelf     (0.262, 0.173, 0.117, 0.000)
		colorBeach     (0.308, 0.202, 0.139, 0.000)
		colorDesert    (0.334, 0.217, 0.136, 0.000)
		colorLowland   (0.366, 0.232, 0.154, 0.000)
		colorUpland    (0.406, 0.281, 0.187, 0.000)
		colorRock      (0.438, 0.306, 0.202, 0.000)
		colorSnow      (0.478, 0.326, 0.213, 1.000)
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
		GasBright   0.14247
		DustBright  0.839973
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.45507
		Period          36.9832
		Eccentricity    0.973283
		Inclination     -77.4688
		AscendingNode   68.4269
		ArgOfPericenter 53.0311
		MeanAnomaly     87.8957
	}
}

Comet	"C103"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            6.57532e-015
	Radius          0.242586
	InertiaMoment   0.39819

	Oblateness      0.0252754

	RotationPeriod  28.5473
	Obliquity       260.005
	EqAscendNode    209.732

	AbsMagn         10.713
	SlopeParam      3.68963
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.759 0.758 0.756)

	Surface
	{
		SurfStyle       0.26772
		OceanStyle      0.429281
		Randomize      (0.696, 0.383, 0.878)
		colorDistMagn   0.957138
		colorDistFreq   4.42281e-005
		detailScale     6.62421
		colorConversion true
		snowLevel       2
		tropicLatitude  0.613076
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.356915
		terraceProb     0.161717
		erosion         0
		montesMagn      0.549154
		montesFreq      2.48484
		montesSpiky     0.986504
		montesFraction  0.441482
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000181974
		hillsFraction   0.700184
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249273
		craterFreq      0.239205
		craterDensity   0.861963
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   469.043
		volcanoTemp     1887.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.303, 0.302, 0.000)
		colorShelf     (0.323, 0.322, 0.321, 0.000)
		colorBeach     (0.342, 0.341, 0.340, 0.000)
		colorDesert    (0.361, 0.360, 0.359, 0.000)
		colorLowland   (0.380, 0.379, 0.378, 0.000)
		colorUpland    (0.399, 0.398, 0.397, 0.000)
		colorRock      (0.418, 0.417, 0.416, 0.000)
		colorSnow      (0.437, 0.436, 0.435, 1.000)
		BumpHeight      0.218327
		BumpOffset      0.0436654
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.111217
		GasToDust   0.25
		Particles   1204
		GasBright   0.136095
		DustBright  0.530835
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.65842
		Period          15.7795
		Eccentricity    0.959343
		Inclination     -97.7263
		AscendingNode   33.5443
		ArgOfPericenter 147.069
		MeanAnomaly     -69.8479
	}
}

Comet	"C104"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            5.08553e-011
	Radius          5.30426
	InertiaMoment   0.399872

	Oblateness      0.0401417

	RotationPeriod  26.4189
	Obliquity       213.211
	EqAscendNode    194.31

	AbsMagn         12.7686
	SlopeParam      2.58379
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.540 0.537 0.532)

	Surface
	{
		SurfStyle       0.449993
		OceanStyle      0.0601698
		Randomize      (-0.130, 0.404, -0.595)
		colorDistMagn   0.502148
		colorDistFreq   0.0199125
		detailScale     144.842
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994774
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519927
		terraceProb     0.210681
		erosion         0
		montesMagn      0.438574
		montesFreq      3.90147
		montesSpiky     0.80269
		montesFraction  0.368919
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0521135
		hillsFraction   0.671059
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264914
		craterFreq      0.220337
		craterDensity   0.828931
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   116.617
		volcanoTemp     1747.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.215, 0.213, 0.000)
		colorShelf     (0.230, 0.228, 0.226, 0.000)
		colorBeach     (0.243, 0.242, 0.239, 0.000)
		colorDesert    (0.257, 0.255, 0.253, 0.000)
		colorLowland   (0.270, 0.269, 0.266, 0.000)
		colorUpland    (0.284, 0.282, 0.279, 0.000)
		colorRock      (0.297, 0.295, 0.293, 0.000)
		colorSnow      (0.311, 0.309, 0.306, 1.000)
		BumpHeight      4.77383
		BumpOffset      0.954766
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.592409
		GasToDust   0.25
		Particles   2176
		GasBright   0.0924599
		DustBright  0.258956
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.71306
		Period          30.7932
		Eccentricity    0.986886
		Inclination     -108.929
		AscendingNode   -70.9255
		ArgOfPericenter -155.115
		MeanAnomaly     -106.476
	}
}

Comet	"C105"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            3.93329e-007
	Radius          94.701
	InertiaMoment   0.398752

	Oblateness      0.0350188

	RotationPeriod  24.2122
	Obliquity       166.416
	EqAscendNode    178.887

	AbsMagn         0.0303788
	SlopeParam      6.36894
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.721 0.717 0.714)

	Surface
	{
		SurfStyle       0.916472
		OceanStyle      0.323821
		Randomize      (0.821, -0.853, -0.030)
		colorDistMagn   0.721724
		colorDistFreq   1.177
		detailScale     2585.97
		colorConversion true
		snowLevel       2
		tropicLatitude  0.703365
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.651773
		terraceProb     0.422104
		erosion         0
		montesMagn      0.432584
		montesFreq      3.58429
		montesSpiky     0.964496
		montesFraction  0.470681
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.5789
		hillsFraction   0.843399
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269547
		craterFreq      0.20008
		craterDensity   0.726679
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.6746
		volcanoTemp     1610.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.251, 0.286, 0.050)
		colorShelf     (0.288, 0.294, 0.328, 0.040)
		colorBeach     (0.332, 0.337, 0.371, 0.030)
		colorDesert    (0.375, 0.380, 0.421, 0.020)
		colorLowland   (0.418, 0.423, 0.464, 0.030)
		colorUpland    (0.462, 0.466, 0.507, 0.050)
		colorRock      (0.505, 0.509, 0.564, 0.020)
		colorSnow      (0.505, 0.509, 0.564, 1.000)
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
		GasBright   0.269288
		DustBright  0.566615
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.08097
		Period          18.5908
		Eccentricity    0.957795
		Inclination     44.9887
		AscendingNode   -81.9102
		ArgOfPericenter 163.697
		MeanAnomaly     -30.9966
	}
}

Comet	"C106"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.21109e-014
	Radius          0.328547
	InertiaMoment   0.396856

	Oblateness      0.057573

	RotationPeriod  21.9123
	Obliquity       119.622
	EqAscendNode    163.464

	AbsMagn         3.94528
	SlopeParam      4.95214
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.663 0.657 0.654)

	Surface
	{
		SurfStyle       0.62305
		OceanStyle      0.51454
		Randomize      (0.768, -0.496, -0.531)
		colorDistMagn   0.726636
		colorDistFreq   2.32899e-005
		detailScale     8.97153
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983422
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.259137
		terraceProb     0.225337
		erosion         0
		montesMagn      0.609538
		montesFreq      2.67966
		montesSpiky     0.994184
		montesFraction  0.604652
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000316972
		hillsFraction   0.453637
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241813
		craterFreq      0.1874
		craterDensity   0.967967
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   468.075
		volcanoTemp     1370.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.224, 0.183, 0.000)
		colorShelf     (0.265, 0.230, 0.209, 0.000)
		colorBeach     (0.311, 0.270, 0.248, 0.000)
		colorDesert    (0.338, 0.289, 0.242, 0.000)
		colorLowland   (0.371, 0.309, 0.275, 0.000)
		colorUpland    (0.411, 0.375, 0.333, 0.000)
		colorRock      (0.444, 0.408, 0.360, 0.000)
		colorSnow      (0.484, 0.434, 0.379, 1.000)
		BumpHeight      0.295693
		BumpOffset      0.0591385
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.144043
		GasToDust   0.25
		Particles   1270
		GasBright   0.198371
		DustBright  0.322018
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.74093
		Period          31.0189
		Eccentricity    0.988857
		Inclination     -127.72
		AscendingNode   100.141
		ArgOfPericenter 149.554
		MeanAnomaly     -47.7217
	}
}

Comet	"C107"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            9.36691e-011
	Radius          5.85869
	InertiaMoment   0.399228

	Oblateness      0.0537712

	RotationPeriod  19.5006
	Obliquity       72.8278
	EqAscendNode    148.042

	AbsMagn         5.75803
	SlopeParam      3.92021
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.548 0.467 0.379)

	Surface
	{
		SurfStyle       0.755215
		OceanStyle      0.998439
		Randomize      (0.092, 0.439, 0.505)
		colorDistMagn   0.512569
		colorDistFreq   0.0267449
		detailScale     159.981
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999638
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.613479
		terraceProb     0.144869
		erosion         0
		montesMagn      0.554023
		montesFreq      4.03164
		montesSpiky     0.999823
		montesFraction  0.628442
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.100993
		hillsFraction   0.757474
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26849
		craterFreq      0.23621
		craterDensity   1.05301
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   94.9092
		volcanoTemp     1563.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.159, 0.106, 0.000)
		colorShelf     (0.219, 0.163, 0.121, 0.000)
		colorBeach     (0.258, 0.192, 0.144, 0.000)
		colorDesert    (0.280, 0.206, 0.140, 0.000)
		colorLowland   (0.307, 0.220, 0.159, 0.000)
		colorUpland    (0.340, 0.266, 0.193, 0.000)
		colorRock      (0.367, 0.290, 0.209, 0.000)
		colorSnow      (0.400, 0.308, 0.220, 1.000)
		BumpHeight      5.27282
		BumpOffset      1.05456
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.625235
		GasToDust   0.25
		Particles   2242
		GasBright   0.090195
		DustBright  0.114681
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.73631
		Period          39.4263
		Eccentricity    0.978426
		Inclination     51.2495
		AscendingNode   -77.7649
		ArgOfPericenter 143.809
		MeanAnomaly     -43.3133
	}
}

Comet	"C108"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            7.24463e-007
	Radius          128.402
	InertiaMoment   0.397853

	Oblateness      0.0963337

	RotationPeriod  16.9536
	Obliquity       26.0335
	EqAscendNode    132.619

	AbsMagn         7.19014
	SlopeParam      2.86502
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.621 0.616 0.612)

	Surface
	{
		SurfStyle       0.60336
		OceanStyle      0.573838
		Randomize      (-0.497, -0.113, 0.564)
		colorDistMagn   0.495491
		colorDistFreq   7.40037
		detailScale     3506.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0.670696
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.550736
		terraceProb     0.144769
		erosion         0
		montesMagn      0.398154
		montesFreq      2.49128
		montesSpiky     0.927625
		montesFraction  0.801116
		dunesFraction   0
		hillsMagn       0
		hillsFreq       49.2106
		hillsFraction   0.679412
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200997
		craterFreq      0.519562
		craterDensity   0.886362
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.6521
		volcanoTemp     1447.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.209, 0.171, 0.000)
		colorShelf     (0.248, 0.216, 0.196, 0.000)
		colorBeach     (0.292, 0.253, 0.233, 0.000)
		colorDesert    (0.317, 0.271, 0.226, 0.000)
		colorLowland   (0.348, 0.290, 0.257, 0.000)
		colorUpland    (0.385, 0.351, 0.312, 0.000)
		colorRock      (0.416, 0.382, 0.337, 0.000)
		colorSnow      (0.453, 0.407, 0.355, 1.000)
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
		GasBright   0.34419
		DustBright  0.345172
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.91469
		Period          32.4377
		Eccentricity    0.970939
		Inclination     132.373
		AscendingNode   65.1694
		ArgOfPericenter -30.8295
		MeanAnomaly     -139.419
	}
}

Comet	"C109"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.23068e-014
	Radius          0.362407
	InertiaMoment   0.399664

	Oblateness      0.100376

	RotationPeriod  14.2408
	Obliquity       339.239
	EqAscendNode    117.197

	AbsMagn         8.52267
	SlopeParam      6.91683
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.709 0.704 0.701)

	Surface
	{
		SurfStyle       0.686684
		OceanStyle      0.692131
		Randomize      (0.871, -0.079, 0.589)
		colorDistMagn   0.449531
		colorDistFreq   8.69317e-005
		detailScale     9.89612
		colorConversion true
		snowLevel       2
		tropicLatitude  0.489085
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.683713
		terraceProb     0.319516
		erosion         0
		montesMagn      0.442313
		montesFreq      3.07801
		montesSpiky     0.960201
		montesFraction  0.126834
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000232747
		hillsFraction   0.898329
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.280222
		craterFreq      0.235966
		craterDensity   0.905395
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   380.438
		volcanoTemp     1426.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.239, 0.196, 0.000)
		colorShelf     (0.284, 0.246, 0.224, 0.000)
		colorBeach     (0.333, 0.289, 0.266, 0.000)
		colorDesert    (0.361, 0.310, 0.259, 0.000)
		colorLowland   (0.397, 0.331, 0.294, 0.000)
		colorUpland    (0.439, 0.401, 0.357, 0.000)
		colorRock      (0.475, 0.437, 0.385, 0.000)
		colorSnow      (0.517, 0.465, 0.407, 1.000)
		BumpHeight      0.326166
		BumpOffset      0.0652332
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.176869
		GasToDust   0.25
		Particles   1337
		GasBright   0.0218077
		DustBright  0.352041
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.67995
		Period          30.5259
		Eccentricity    0.971985
		Inclination     -152.197
		AscendingNode   -74.1653
		ArgOfPericenter 163.441
		MeanAnomaly     34.7342
	}
}

Comet	"C110"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.72527e-010
	Radius          7.95332
	InertiaMoment   0.398489

	Oblateness      0.216089

	RotationPeriod  11.3213
	Obliquity       292.445
	EqAscendNode    101.774

	AbsMagn         9.91774
	SlopeParam      5.218
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.849 0.766 0.737)

	Surface
	{
		SurfStyle       0.912603
		OceanStyle      0.701147
		Randomize      (0.929, 0.288, 0.367)
		colorDistMagn   0.629975
		colorDistFreq   0.0264992
		detailScale     217.179
		colorConversion true
		snowLevel       2
		tropicLatitude  0.888682
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530809
		terraceProb     0.124626
		erosion         0
		montesMagn      0.405005
		montesFreq      3.59917
		montesSpiky     0.829741
		montesFraction  0.555006
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.134835
		hillsFraction   0.90622
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233192
		craterFreq      0.253179
		craterDensity   0.742914
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   94.9349
		volcanoTemp     1917.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.268, 0.295, 0.050)
		colorShelf     (0.340, 0.314, 0.339, 0.040)
		colorBeach     (0.391, 0.360, 0.383, 0.030)
		colorDesert    (0.441, 0.406, 0.435, 0.020)
		colorLowland   (0.492, 0.452, 0.479, 0.030)
		colorUpland    (0.543, 0.498, 0.523, 0.050)
		colorRock      (0.594, 0.544, 0.582, 0.020)
		colorSnow      (0.594, 0.544, 0.582, 1.000)
		BumpHeight      7.15799
		BumpOffset      1.4316
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.658061
		GasToDust   0.25
		Particles   2309
		GasBright   0.10075
		DustBright  0.757586
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.21169
		Period          43.6725
		Eccentricity    0.973791
		Inclination     -38.6181
		AscendingNode   106.126
		ArgOfPericenter 79.0816
		MeanAnomaly     25.406
	}
}

Comet	"C111"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            5.31224e-018
	Radius          0.0224147
	InertiaMoment   0.395748

	Oblateness      0.249

	RotationPeriod  8.13815
	Obliquity       245.651
	EqAscendNode    86.3514

	AbsMagn         11.6068
	SlopeParam      4.14973
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.716 0.715 0.713)

	Surface
	{
		SurfStyle       0.307105
		OceanStyle      0.705071
		Randomize      (0.342, 0.192, 0.547)
		colorDistMagn   0.537579
		colorDistFreq   2.33101e-007
		detailScale     0.61207
		colorConversion true
		snowLevel       2
		tropicLatitude  0.473219
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.765296
		terraceProb     0.122031
		erosion         0
		montesMagn      0.497323
		montesFreq      2.87631
		montesSpiky     0.843046
		montesFraction  0.430853
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.36558e-006
		hillsFraction   0.721048
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218464
		craterFreq      0.204087
		craterDensity   1.04902
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1524.75
		volcanoTemp     1404.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.286, 0.285, 0.000)
		colorShelf     (0.304, 0.304, 0.303, 0.000)
		colorBeach     (0.322, 0.322, 0.321, 0.000)
		colorDesert    (0.340, 0.339, 0.339, 0.000)
		colorLowland   (0.358, 0.357, 0.356, 0.000)
		colorUpland    (0.376, 0.375, 0.374, 0.000)
		colorRock      (0.394, 0.393, 0.392, 0.000)
		colorSnow      (0.412, 0.411, 0.410, 1.000)
		BumpHeight      0.0201732
		BumpOffset      0.00403464
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0957665
		DustBright  0.447056
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.93541
		Period          41.1871
		Eccentricity    0.981153
		Inclination     122.286
		AscendingNode   -30.923
		ArgOfPericenter 76.723
		MeanAnomaly     -121.296
	}
}

Comet	"C112"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            4.10862e-014
	Radius          0.492635
	InertiaMoment   0.399

	Oblateness      0.249

	RotationPeriod  4.60835
	Obliquity       198.856
	EqAscendNode    70.9288

	AbsMagn         14.5255
	SlopeParam      3.12537
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.803 0.775 0.725)

	Surface
	{
		SurfStyle       0.356845
		OceanStyle      0.00715502
		Randomize      (-0.854, -0.035, 0.984)
		colorDistMagn   0.835551
		colorDistFreq   7.77326e-005
		detailScale     13.4522
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983523
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464426
		terraceProb     0.241911
		erosion         0
		montesMagn      0.468673
		montesFreq      2.27767
		montesSpiky     0.943081
		montesFraction  0.343263
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000475866
		hillsFraction   0.439322
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261456
		craterFreq      0.189302
		craterDensity   0.992129
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   381.051
		volcanoTemp     1390.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.310, 0.290, 0.000)
		colorShelf     (0.341, 0.329, 0.308, 0.000)
		colorBeach     (0.361, 0.349, 0.326, 0.000)
		colorDesert    (0.381, 0.368, 0.345, 0.000)
		colorLowland   (0.401, 0.387, 0.363, 0.000)
		colorUpland    (0.421, 0.407, 0.381, 0.000)
		colorRock      (0.441, 0.426, 0.399, 0.000)
		colorSnow      (0.461, 0.445, 0.417, 1.000)
		BumpHeight      0.443371
		BumpOffset      0.0886742
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.209695
		GasToDust   0.25
		Particles   1403
		GasBright   0.0535241
		DustBright  0.173785
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.06032
		Period          18.4499
		Eccentricity    0.974066
		Inclination     -84.5717
		AscendingNode   -147.152
		ArgOfPericenter 10.74
		MeanAnomaly     -118.147
	}
}

Comet	"C113"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            3.17773e-010
	Radius          8.74577
	InertiaMoment   0.39744

	Oblateness      0.00111423

	RotationPeriod  133.695
	Obliquity       152.062
	EqAscendNode    55.5063

	AbsMagn         2.59625
	SlopeParam      7.86619
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.747 0.706 0.634)

	Surface
	{
		SurfStyle       0.536735
		OceanStyle      0.403252
		Randomize      (-0.919, -0.411, -0.996)
		colorDistMagn   0.532225
		colorDistFreq   0.0520328
		detailScale     238.818
		colorConversion true
		snowLevel       2
		tropicLatitude  0.159118
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.61609
		terraceProb     0.188297
		erosion         0
		montesMagn      0.398984
		montesFreq      3.14496
		montesSpiky     0.861131
		montesFraction  0.430214
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.165107
		hillsFraction   0.804762
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221585
		craterFreq      0.243701
		craterDensity   0.9802
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   76.9211
		volcanoTemp     1622.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.240, 0.178, 0.000)
		colorShelf     (0.299, 0.247, 0.203, 0.000)
		colorBeach     (0.351, 0.290, 0.241, 0.000)
		colorDesert    (0.381, 0.311, 0.235, 0.000)
		colorLowland   (0.418, 0.332, 0.266, 0.000)
		colorUpland    (0.463, 0.403, 0.323, 0.000)
		colorRock      (0.501, 0.438, 0.349, 0.000)
		colorSnow      (0.545, 0.466, 0.368, 1.000)
		BumpHeight      7.87119
		BumpOffset      1.57424
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.690887
		GasToDust   0.25
		Particles   2375
		GasBright   0.209634
		DustBright  0.502162
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.84497
		Period          24.0486
		Eccentricity    0.974006
		Inclination     31.7439
		AscendingNode   -16.8116
		ArgOfPericenter -24.9722
		MeanAnomaly     -12.9928
	}
}

Comet	"C114"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            9.78444e-018
	Radius          0.0305142
	InertiaMoment   0.399452

	Oblateness      0.00204259

	RotationPeriod  116.412
	Obliquity       105.268
	EqAscendNode    40.0837

	AbsMagn         4.91881
	SlopeParam      5.50743
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.591 0.588 0.585)

	Surface
	{
		SurfStyle       0.804931
		OceanStyle      0.337007
		Randomize      (0.279, 0.631, 0.810)
		colorDistMagn   0.348243
		colorDistFreq   3.59591e-007
		detailScale     0.833242
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983549
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562017
		terraceProb     0.298113
		erosion         0
		montesMagn      0.560246
		montesFreq      2.72986
		montesSpiky     0.942294
		montesFraction  0.305554
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.20596e-006
		hillsFraction   0.57861
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225782
		craterFreq      0.211249
		craterDensity   0.814225
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1529.47
		volcanoTemp     1860.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.200, 0.164, 0.000)
		colorShelf     (0.236, 0.206, 0.187, 0.000)
		colorBeach     (0.278, 0.241, 0.222, 0.000)
		colorDesert    (0.301, 0.259, 0.216, 0.000)
		colorLowland   (0.331, 0.276, 0.246, 0.000)
		colorUpland    (0.366, 0.335, 0.298, 0.000)
		colorRock      (0.396, 0.365, 0.322, 0.000)
		colorSnow      (0.431, 0.388, 0.339, 1.000)
		BumpHeight      0.0274628
		BumpOffset      0.00549256
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.140109
		DustBright  0.256173
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.80203
		Period          49.1432
		Eccentricity    0.977829
		Inclination     -148.516
		AscendingNode   95.0013
		ArgOfPericenter 7.09554
		MeanAnomaly     -86.7733
	}
}

Comet	"C115"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            7.56757e-014
	Radius          0.540728
	InertiaMoment   0.398198

	Oblateness      0.00171022

	RotationPeriod  107.658
	Obliquity       58.4735
	EqAscendNode    24.6611

	AbsMagn         6.48855
	SlopeParam      4.38125
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.724 0.720 0.718)

	Surface
	{
		SurfStyle       0.611079
		OceanStyle      0.779064
		Randomize      (0.352, 0.006, -0.487)
		colorDistMagn   0.450948
		colorDistFreq   0.000120343
		detailScale     14.7655
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94849
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492397
		terraceProb     0.314333
		erosion         0
		montesMagn      0.530286
		montesFreq      2.80926
		montesSpiky     0.948317
		montesFraction  0.626605
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000803071
		hillsFraction   0.594189
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.20491
		craterFreq      0.213709
		craterDensity   0.932157
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   308.181
		volcanoTemp     1532.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.245, 0.201, 0.000)
		colorShelf     (0.289, 0.252, 0.230, 0.000)
		colorBeach     (0.340, 0.295, 0.273, 0.000)
		colorDesert    (0.369, 0.317, 0.266, 0.000)
		colorLowland   (0.405, 0.338, 0.302, 0.000)
		colorUpland    (0.449, 0.410, 0.366, 0.000)
		colorRock      (0.485, 0.446, 0.395, 0.000)
		colorSnow      (0.528, 0.475, 0.417, 1.000)
		BumpHeight      0.486655
		BumpOffset      0.097331
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.242521
		GasToDust   0.25
		Particles   1469
		GasBright   0.363409
		DustBright  0.517359
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.42343
		Period          45.6099
		Eccentricity    0.991319
		Inclination     63.6431
		AscendingNode   -96.3641
		ArgOfPericenter -141.394
		MeanAnomaly     -67.7612
	}
}

Comet	"C116"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            5.85297e-010
	Radius          11.9256
	InertiaMoment   0.399877

	Oblateness      0.00268795

	RotationPeriod  101.454
	Obliquity       11.6792
	EqAscendNode    9.23848

	AbsMagn         7.84927
	SlopeParam      3.37164
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.495 0.490 0.486)

	Surface
	{
		SurfStyle       0.31235
		OceanStyle      0.871764
		Randomize      (0.723, 0.296, 0.207)
		colorDistMagn   0.127911
		colorDistFreq   0.104353
		detailScale     325.649
		colorConversion true
		snowLevel       2
		tropicLatitude  0.658659
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.668304
		terraceProb     0.19728
		erosion         0
		montesMagn      0.542144
		montesFreq      2.22282
		montesSpiky     0.789245
		montesFraction  0.641149
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.371322
		hillsFraction   0.639716
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263433
		craterFreq      0.167375
		craterDensity   0.912014
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   77.2856
		volcanoTemp     1027.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.196, 0.194, 0.000)
		colorShelf     (0.210, 0.208, 0.207, 0.000)
		colorBeach     (0.223, 0.220, 0.219, 0.000)
		colorDesert    (0.235, 0.233, 0.231, 0.000)
		colorLowland   (0.247, 0.245, 0.243, 0.000)
		colorUpland    (0.260, 0.257, 0.255, 0.000)
		colorRock      (0.272, 0.269, 0.267, 0.000)
		colorSnow      (0.285, 0.281, 0.280, 1.000)
		BumpHeight      10.7331
		BumpOffset      2.14661
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.723713
		GasToDust   0.25
		Particles   2441
		GasBright   0.266602
		DustBright  0.298653
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.14626
		Period          43.0795
		Eccentricity    0.981058
		Inclination     -45.3598
		AscendingNode   -63.4698
		ArgOfPericenter 30.4849
		MeanAnomaly     -86.3821
	}
}

Comet	"C117"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.80217e-017
	Radius          0.0334237
	InertiaMoment   0.398758

	Oblateness      0.00211426

	RotationPeriod  96.5254
	Obliquity       324.885
	EqAscendNode    353.816

	AbsMagn         9.19228
	SlopeParam      2.15239
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.664 0.573 0.482)

	Surface
	{
		SurfStyle       0.0539875
		OceanStyle      0.831091
		Randomize      (-0.082, 0.255, -0.026)
		colorDistMagn   0.391814
		colorDistFreq   3.28887e-007
		detailScale     0.91269
		colorConversion true
		snowLevel       2
		tropicLatitude  0.15445
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.717182
		terraceProb     0.360221
		erosion         0
		montesMagn      0.560886
		montesFreq      2.86527
		montesSpiky     0.922383
		montesFraction  0.668749
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.37418e-006
		hillsFraction   0.593096
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254503
		craterFreq      0.237287
		craterDensity   0.975278
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1234.42
		volcanoTemp     1231.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.229, 0.193, 0.000)
		colorShelf     (0.282, 0.244, 0.205, 0.000)
		colorBeach     (0.299, 0.258, 0.217, 0.000)
		colorDesert    (0.315, 0.272, 0.229, 0.000)
		colorLowland   (0.332, 0.287, 0.241, 0.000)
		colorUpland    (0.348, 0.301, 0.253, 0.000)
		colorRock      (0.365, 0.315, 0.265, 0.000)
		colorSnow      (0.382, 0.329, 0.277, 1.000)
		BumpHeight      0.0300813
		BumpOffset      0.00601627
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00766579
		DustBright  0.242076
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.90186
		Period          32.3322
		Eccentricity    0.990473
		Inclination     -30.6115
		AscendingNode   165.83
		ArgOfPericenter -39.2724
		MeanAnomaly     55.0027
	}
}

Comet	"C118"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.39385e-013
	Radius          0.738687
	InertiaMoment   0.396874

	Oblateness      0.00319981

	RotationPeriod  92.3684
	Obliquity       278.091
	EqAscendNode    338.393

	AbsMagn         10.6902
	SlopeParam      5.83256
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.670 0.668 0.664)

	Surface
	{
		SurfStyle       0.279663
		OceanStyle      0.640093
		Randomize      (0.320, -0.457, -0.030)
		colorDistMagn   0.506625
		colorDistFreq   5.88127e-005
		detailScale     20.1711
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999894
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.694063
		terraceProb     0.357307
		erosion         0
		montesMagn      0.406016
		montesFreq      3.27437
		montesSpiky     0.781462
		montesFraction  0.583852
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00127929
		hillsFraction   0.485497
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222368
		craterFreq      0.243232
		craterDensity   0.959094
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   310.212
		volcanoTemp     1891.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.267, 0.266, 0.000)
		colorShelf     (0.285, 0.284, 0.282, 0.000)
		colorBeach     (0.302, 0.300, 0.299, 0.000)
		colorDesert    (0.318, 0.317, 0.316, 0.000)
		colorLowland   (0.335, 0.334, 0.332, 0.000)
		colorUpland    (0.352, 0.351, 0.349, 0.000)
		colorRock      (0.369, 0.367, 0.365, 0.000)
		colorSnow      (0.385, 0.384, 0.382, 1.000)
		BumpHeight      0.664818
		BumpOffset      0.132964
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.275347
		GasToDust   0.25
		Particles   1536
		GasBright   0.0658897
		DustBright  0.668338
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.04241
		Period          25.5335
		Eccentricity    0.974683
		Inclination     77.8691
		AscendingNode   92.6124
		ArgOfPericenter 143.023
		MeanAnomaly     -27.0226
	}
}

Comet	"C119"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.07805e-009
	Radius          13.0316
	InertiaMoment   0.399234

	Oblateness      0.00248341

	RotationPeriod  88.7313
	Obliquity       231.296
	EqAscendNode    322.971

	AbsMagn         12.7318
	SlopeParam      4.61801
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.615 0.611 0.608)

	Surface
	{
		SurfStyle       0.688434
		OceanStyle      0.175865
		Randomize      (0.475, -0.023, 0.343)
		colorDistMagn   0.428424
		colorDistFreq   0.08975
		detailScale     355.849
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991588
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.405694
		terraceProb     0.295153
		erosion         0
		montesMagn      0.525393
		montesFreq      3.23912
		montesSpiky     0.930308
		montesFraction  0.362009
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.367281
		hillsFraction   0.85043
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219219
		craterFreq      0.251889
		craterDensity   0.9242
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   62.2278
		volcanoTemp     1212.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.208, 0.170, 0.000)
		colorShelf     (0.246, 0.214, 0.194, 0.000)
		colorBeach     (0.289, 0.250, 0.231, 0.000)
		colorDesert    (0.314, 0.269, 0.225, 0.000)
		colorLowland   (0.345, 0.287, 0.255, 0.000)
		colorUpland    (0.381, 0.348, 0.310, 0.000)
		colorRock      (0.412, 0.379, 0.334, 0.000)
		colorSnow      (0.449, 0.403, 0.353, 1.000)
		BumpHeight      11.7284
		BumpOffset      2.34568
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.756539
		GasToDust   0.25
		Particles   2508
		GasBright   0.0622986
		DustBright  0.356416
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.43703
		Period          45.7353
		Eccentricity    0.979274
		Inclination     50.3385
		AscendingNode   63.3295
		ArgOfPericenter -75.6756
		MeanAnomaly     120.242
	}
}

Comet	"C120"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            3.31938e-017
	Radius          0.0457552
	InertiaMoment   0.397862

	Oblateness      0.00374342

	RotationPeriod  85.4684
	Obliquity       184.502
	EqAscendNode    307.548

	AbsMagn         -0.106709
	SlopeParam      3.6087
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.430 0.422 0.419)

	Surface
	{
		SurfStyle       0.265236
		OceanStyle      0.934454
		Randomize      (-0.248, -0.923, 0.295)
		colorDistMagn   0.757075
		colorDistFreq   1.31608e-006
		detailScale     1.24942
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997119
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578584
		terraceProb     0.536457
		erosion         0
		montesMagn      0.492914
		montesFreq      3.5541
		montesSpiky     0.952925
		montesFraction  0.483609
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.11871e-006
		hillsFraction   0.743971
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243726
		craterFreq      0.161498
		craterDensity   0.97516
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1245.14
		volcanoTemp     1392.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.169, 0.167, 0.000)
		colorShelf     (0.183, 0.179, 0.178, 0.000)
		colorBeach     (0.194, 0.190, 0.188, 0.000)
		colorDesert    (0.204, 0.201, 0.199, 0.000)
		colorLowland   (0.215, 0.211, 0.209, 0.000)
		colorUpland    (0.226, 0.222, 0.220, 0.000)
		colorRock      (0.237, 0.232, 0.230, 0.000)
		colorSnow      (0.247, 0.243, 0.241, 1.000)
		BumpHeight      0.0411797
		BumpOffset      0.00823594
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.187713
		DustBright  0.715488
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.38667
		Period          20.7184
		Eccentricity    0.971059
		Inclination     -85.7064
		AscendingNode   89.1117
		ArgOfPericenter 99.4922
		MeanAnomaly     -135.304
	}
}

Comet	"C121"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            2.5673e-013
	Radius          0.804939
	InertiaMoment   0.399669

	Oblateness      0.00284836

	RotationPeriod  82.4874
	Obliquity       137.708
	EqAscendNode    292.126

	AbsMagn         3.91473
	SlopeParam      2.47944
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.527 0.459 0.326)

	Surface
	{
		SurfStyle       0.495628
		OceanStyle      0.617752
		Randomize      (0.134, -0.386, -0.477)
		colorDistMagn   0.576907
		colorDistFreq   0.000298857
		detailScale     21.9802
		colorConversion true
		snowLevel       2
		tropicLatitude  0.79535
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.671408
		terraceProb     0.34246
		erosion         0
		montesMagn      0.366263
		montesFreq      2.47592
		montesSpiky     0.959682
		montesFraction  0.758677
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00143601
		hillsFraction   0.486443
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246093
		craterFreq      0.191012
		craterDensity   1.02428
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   249.075
		volcanoTemp     1654.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.184, 0.131, 0.000)
		colorShelf     (0.224, 0.195, 0.139, 0.000)
		colorBeach     (0.237, 0.207, 0.147, 0.000)
		colorDesert    (0.250, 0.218, 0.155, 0.000)
		colorLowland   (0.263, 0.229, 0.163, 0.000)
		colorUpland    (0.277, 0.241, 0.171, 0.000)
		colorRock      (0.290, 0.252, 0.179, 0.000)
		colorSnow      (0.303, 0.264, 0.188, 1.000)
		BumpHeight      0.724445
		BumpOffset      0.144889
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.308173
		GasToDust   0.25
		Particles   1602
		GasBright   0.15684
		DustBright  0.430848
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.61926
		Period          30.038
		Eccentricity    0.96776
		Inclination     36.3206
		AscendingNode   88.5414
		ArgOfPericenter 71.1288
		MeanAnomaly     -23.9349
	}
}

Comet	"C122"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            1.98562e-009
	Radius          17.8822
	InertiaMoment   0.398496

	Oblateness      0.00430344

	RotationPeriod  79.726
	Obliquity       90.9134
	EqAscendNode    276.703

	AbsMagn         5.7367
	SlopeParam      6.21527
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.770 0.768 0.766)

	Surface
	{
		SurfStyle       0.416774
		OceanStyle      0.607484
		Randomize      (-0.298, 0.377, -0.273)
		colorDistMagn   0.461686
		colorDistFreq   0.127778
		detailScale     488.304
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999858
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.2746
		terraceProb     0.144415
		erosion         0
		montesMagn      0.409598
		montesFreq      2.94315
		montesSpiky     0.880021
		montesFraction  0.620031
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.7046
		hillsFraction   0.748636
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247618
		craterFreq      0.218618
		craterDensity   0.742705
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   62.9186
		volcanoTemp     2123.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.307, 0.307, 0.000)
		colorShelf     (0.327, 0.326, 0.326, 0.000)
		colorBeach     (0.347, 0.346, 0.345, 0.000)
		colorDesert    (0.366, 0.365, 0.364, 0.000)
		colorLowland   (0.385, 0.384, 0.383, 0.000)
		colorUpland    (0.404, 0.403, 0.402, 0.000)
		colorRock      (0.424, 0.422, 0.421, 0.000)
		colorSnow      (0.443, 0.442, 0.441, 1.000)
		BumpHeight      16.094
		BumpOffset      3.2188
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.789365
		GasToDust   0.25
		Particles   2574
		GasBright   0.0887074
		DustBright  0.183467
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.39618
		Period          14.1136
		Eccentricity    0.944929
		Inclination     1.95044
		AscendingNode   164.531
		ArgOfPericenter -47.2645
		MeanAnomaly     75.684
	}
}

Comet	"C123"
{
	ParentBody     "Lalande 21185"
	Class	       "Asteroid"

	Mass            6.11387e-017
	Radius          0.049692
	InertiaMoment   0.395797

	Oblateness      0.00317132

	RotationPeriod  77.1396
	Obliquity       44.1191
	EqAscendNode    261.28

	AbsMagn         7.17155
	SlopeParam      4.86379
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.454 0.451 0.448)

	Surface
	{
		SurfStyle       0.520843
		OceanStyle      0.943239
		Randomize      (0.930, 0.064, -0.905)
		colorDistMagn   0.361644
		colorDistFreq   2.86742e-007
		detailScale     1.35692
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990677
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.672178
		terraceProb     0.333684
		erosion         0
		montesMagn      0.547297
		montesFreq      2.83938
		montesSpiky     0.97198
		montesFraction  0.569419
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.52665e-006
		hillsFraction   0.556249
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220513
		craterFreq      0.274529
		craterDensity   0.850842
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   996.401
		volcanoTemp     1566.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.153, 0.125, 0.000)
		colorShelf     (0.181, 0.158, 0.143, 0.000)
		colorBeach     (0.213, 0.185, 0.170, 0.000)
		colorDesert    (0.231, 0.198, 0.166, 0.000)
		colorLowland   (0.254, 0.212, 0.188, 0.000)
		colorUpland    (0.281, 0.257, 0.228, 0.000)
		colorRock      (0.304, 0.280, 0.246, 0.000)
		colorSnow      (0.331, 0.298, 0.260, 1.000)
		BumpHeight      0.0447228
		BumpOffset      0.00894456
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.291289
		DustBright  0.465372
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.89974
		Period          24.4575
		Eccentricity    0.961742
		Inclination     -123.352
		AscendingNode   -24.073
		ArgOfPericenter 83.3152
		MeanAnomaly     55.0766
	}
}

