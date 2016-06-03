Star	"RS 8476-1353-8-11843423-363"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "L7.1 V"
	Luminosity      4.24245e-006
	MassSol         0.0394813
	RadSol          0.0644658
	Teff            2730

	Age             3.38502

	InertiaMoment   0.222597

	RotationPeriod  6.09259
	Obliquity       328.597
	EqAscendNode    102.252

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.399 0.103)

	Surface
	{
		SurfStyle       0.151281
		Randomize      (0.658, -0.027, 0.107)
		colorDistMagn   0.520676
		colorDistFreq   11.7713
		detailScale     115404
		colorConversion true
		tropicLatitude  0.6524
		icecapLatitude  1.1016
		mainFreq        0.0133702
		venusFreq       7.68201
		venusMagn       0.228505
		mareFreq        11.2733
		mareDensity     0.00895933
		erosion         1
		montesFreq      283.086
		dunesMagn       0.712832
		hillsMagn       0.03
		hillsFreq       283.086
		craterOctaves   0
		twistZones      9.84048
		twistMagn       0.665868
		cycloneMagn     11.2457
		cycloneFreq     0.233472
		cycloneDensity  0.157812
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
		BumpHeight      44.8682
		BumpOffset      44.8682
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          26.9219
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.700406
		mainOctaves     10
		Coverage        0
		twistZones      9.84048
		twistMagn       0.665868
	}

	Clouds
	{
		Height          53.8438
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.700406
		mainOctaves     10
		Coverage        0
		twistZones      9.84048
		twistMagn       0.665868
	}

	Clouds
	{
		Height          80.7617
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.700406
		mainOctaves     10
		Coverage        0
		twistZones      9.84048
		twistMagn       0.665868
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          448.682
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
		Height      2817.98
		NorthLat    81.1118
		NorthLon    73.8032
		NorthRadius 29088.9
		NorthWidth  3647
		NorthRings  5
		NorthBright 1
		NorthParticles 5000
		SouthLat    -81.4484
		SouthLon    241.576
		SouthRadius 8920
		SouthWidth  1280.76
		SouthRings  4
		SouthBright 1
		SouthParticles 5000
		TopColor    (1.000 0.000 0.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	Corona
	{
		Radius      239629
		Period      0.00281514
		Brightness  0.25
		RayDensity  2.54623
		RayCurv     5.28591
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     328.597
		AscendingNode   102.252
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Planet	"1"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Desert"

	Mass            0.525943
	Radius          5796.4
	InertiaMoment   0.327052

	Obliquity       -0.5456
	EqAscendNode    52.7429
	TidalLocked     true

	AlbedoBond      0.253666
	AlbedoGeom      0.304399
	Brightness      2
	Color          (0.638 0.632 0.628)

	Surface
	{
		SurfStyle       0.750085
		OceanStyle      0.616327
		Randomize      (-0.434, 0.703, 0.718)
		colorDistMagn   0.0424521
		colorDistFreq   791.063
		detailScale     14908.7
		colorConversion true
		seaLevel        0.165257
		snowLevel       2
		tropicLatitude  0.0170613
		icecapLatitude  10
		icecapHeight    0.0794004
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.445244
		venusFreq       1.11427
		venusMagn       0
		mareFreq        1.67868
		mareDensity     0.0821845
		terraceProb     0.133994
		erosion         0
		montesMagn      0.225638
		montesFreq      320.377
		montesSpiky     0.833467
		montesFraction  0.974756
		dunesMagn       0.0474657
		dunesFreq       63.287
		dunesFraction   0.895046
		hillsMagn       0.122452
		hillsFreq       675.651
		hillsFraction   0
		hills2Fraction  0
		riversMagn      60.1087
		riversFreq      3.68106
		riversSin       6.19159
		riversOctaves   0
		canyonsMagn     0.0412638
		canyonsFreq     140.78
		canyonFraction  0
		cracksMagn      0.0626915
		cracksFreq      0.396445
		cracksOctaves   0
		craterMagn      0.638036
		craterFreq      17.1007
		craterDensity   0.283584
		craterOctaves   4.09552
		volcanoMagn     0.731869
		volcanoFreq     3.9989
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.592881
		volcanoRadius   0.417593
		volcanoTemp     1387.99
		lavaCoverTidal  0.255928
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      1
		twistMagn       3.5
		cycloneMagn     0.736019
		cycloneDensity  0.320147
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
		Hapke           0.682893
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          12.4409
		BumpHeight      5.79583
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.08671
		mainOctaves     10
		Coverage        0.107332
		twistZones      1
		twistMagn       3.5
	}

	Clouds
	{
		Height          14.8818
		BumpHeight      5.55214
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.08671
		mainOctaves     10
		Coverage        0.107332
		twistZones      1
		twistMagn       3.5
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          177.895
		Density         0.0317107
		Pressure        0.0591611
		Greenhouse      9.58857
		Bright          7.9477
		Opacity         1
		SkyLight        2.64923
		Hue             0
		Saturation      0.866002

		Composition
		{
			H2O   	88.0611
			CO2   	8.03879
			CH4   	1.36718
			SO2   	0.960287
			C2H2  	0.563066
			H2S   	0.375262
			NH3   	0.272626
			C2H4  	0.20435
			N2    	0.138916
			C3H8  	0.0123996
			C2H6  	0.00579313
			CO    	0.000220041
		}
	}

	Aurora
	{
		Height      58.1492
		NorthLat    70.0179
		NorthLon    139.785
		NorthRadius 1873.05
		NorthWidth  1833.96
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -58.1087
		SouthLon    336.358
		SouthRadius 2044.82
		SouthWidth  2394.68
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
		SemiMajorAxis   0.0130568
		Period          0.00750851
		Eccentricity    0.00681982
		Inclination     -0.5456
		AscendingNode   52.7429
		ArgOfPericenter 111.128
		MeanAnomaly     318.592
	}
}

DwarfMoon	"1.D1"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            4.55021e-008
	Radius          51.9816
	InertiaMoment   0.395766

	Oblateness      0.249

	Obliquity       0.012286
	EqAscendNode    -5.83995
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.614 0.443 0.341)

	Surface
	{
		SurfStyle       0.507687
		OceanStyle      0.328224
		Randomize      (-0.503, -0.890, 0.337)
		colorDistMagn   0.986302
		colorDistFreq   1.69374
		detailScale     1419.44
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.280084
		terraceProb     0.329471
		erosion         0
		montesMagn      0.517821
		montesFreq      2.65342
		montesSpiky     0.952477
		montesFraction  0.333449
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.15876
		hillsFraction   0.558347
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262713
		craterFreq      0.214333
		craterDensity   0.836658
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.2068
		volcanoTemp     1507.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.151, 0.096, 0.000)
		colorShelf     (0.245, 0.155, 0.109, 0.000)
		colorBeach     (0.288, 0.182, 0.130, 0.000)
		colorDesert    (0.313, 0.195, 0.126, 0.000)
		colorLowland   (0.344, 0.208, 0.143, 0.000)
		colorUpland    (0.380, 0.253, 0.174, 0.000)
		colorRock      (0.411, 0.275, 0.188, 0.000)
		colorSnow      (0.448, 0.292, 0.198, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000108618
		Period          0.000902746
		Eccentricity    2.79708e-005
		Inclination     0.012286
		AscendingNode   -5.83995
		ArgOfPericenter 0.0132905
		MeanAnomaly     65.195
	}
}

DwarfMoon	"1.D2"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            6.18193e-008
	Radius          29.9866
	InertiaMoment   0.39826

	Oblateness      0.0428086

	Obliquity       -0.00938532
	EqAscendNode    20.4762
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.808 0.739 0.715)

	Surface
	{
		SurfStyle       0.478121
		OceanStyle      0.443404
		Randomize      (-0.685, 0.626, -0.108)
		colorDistMagn   0.904077
		colorDistFreq   0.658928
		detailScale     818.833
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.304191
		terraceProb     0.260604
		erosion         0
		montesMagn      0.604244
		montesFreq      2.71894
		montesSpiky     0.889954
		montesFraction  0.560669
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.25188
		hillsFraction   0.633405
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261736
		craterFreq      0.197575
		craterDensity   0.914419
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   18.9091
		volcanoTemp     1350.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.323, 0.296, 0.286, 0.000)
		colorShelf     (0.343, 0.314, 0.304, 0.000)
		colorBeach     (0.364, 0.333, 0.322, 0.000)
		colorDesert    (0.384, 0.351, 0.340, 0.000)
		colorLowland   (0.404, 0.369, 0.357, 0.000)
		colorUpland    (0.424, 0.388, 0.375, 0.000)
		colorRock      (0.444, 0.406, 0.393, 0.000)
		colorSnow      (0.465, 0.425, 0.411, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000125543
		Period          0.00112176
		Eccentricity    9.48979e-005
		Inclination     -0.00938532
		AscendingNode   20.4762
		ArgOfPericenter 54.8332
		MeanAnomaly     -141.537
	}
}

DwarfMoon	"1.D3"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            8.41487e-008
	Radius          31.2326
	InertiaMoment   0.399321

	Oblateness      0.0323737

	Obliquity       0.0131291
	EqAscendNode    -97.2606
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.451 0.443 0.440)

	Surface
	{
		SurfStyle       0.621168
		OceanStyle      0.464257
		Randomize      (-0.722, 0.669, -0.215)
		colorDistMagn   0.036343
		colorDistFreq   0.334005
		detailScale     852.859
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.56643
		terraceProb     0.142676
		erosion         0
		montesMagn      0.425689
		montesFreq      3.44249
		montesSpiky     0.917669
		montesFraction  0.387233
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.79206
		hillsFraction   0.45621
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236236
		craterFreq      0.22589
		craterDensity   0.945622
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   16.8807
		volcanoTemp     1619.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.151, 0.123, 0.000)
		colorShelf     (0.181, 0.155, 0.141, 0.000)
		colorBeach     (0.212, 0.182, 0.167, 0.000)
		colorDesert    (0.230, 0.195, 0.163, 0.000)
		colorLowland   (0.253, 0.208, 0.185, 0.000)
		colorUpland    (0.280, 0.253, 0.225, 0.000)
		colorRock      (0.302, 0.275, 0.242, 0.000)
		colorSnow      (0.329, 0.293, 0.255, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000129675
		Period          0.00117759
		Eccentricity    1.85962e-005
		Inclination     0.0131291
		AscendingNode   -97.2606
		ArgOfPericenter -27.0625
		MeanAnomaly     159.472
	}
}

DwarfPlanet	"2"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Selena"

	Mass            0.00231039
	Radius          1009
	InertiaMoment   0.397849

	Obliquity       0.183017
	EqAscendNode    -123.488
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.480 0.475 0.469)

	Surface
	{
		SurfStyle       0.481675
		OceanStyle      0.285097
		Randomize      (0.355, 0.451, -0.301)
		colorDistMagn   0.0603716
		colorDistFreq   152.47
		detailScale     2595.19
		colorConversion true
		drivenDarkening 0
		seaLevel        0.204776
		snowLevel       2
		tropicLatitude  0.0030297
		icecapLatitude  10
		icecapHeight    0.177898
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.50738
		venusFreq       1.48367
		venusMagn       0
		mareFreq        0.319493
		mareDensity     0.00125376
		terraceProb     0.477908
		erosion         0
		montesMagn      0.0625948
		montesFreq      55.6651
		montesSpiky     0.991295
		montesFraction  0.832265
		dunesMagn       0.0280893
		dunesFreq       1311.73
		dunesFraction   0.358303
		hillsMagn       0.130487
		hillsFreq       131.784
		hillsFraction   0.985131
		hills2Fraction  0
		riversMagn      62.9919
		riversFreq      4.07525
		riversSin       7.07196
		riversOctaves   0
		canyonsMagn     0.539915
		canyonsFreq     0.363162
		canyonFraction  0.137411
		cracksMagn      0.0693176
		cracksFreq      0.556775
		cracksOctaves   0
		craterMagn      0.642154
		craterFreq      2.56803
		craterDensity   0.98273
		craterOctaves   10
		craterRayedFactor 0
		volcanoMagn     0.202637
		volcanoFreq     1.02056
		volcanoDensity  0.325966
		volcanoOctaves  1
		volcanoActivity 1.05998
		volcanoFlows    0.145423
		volcanoRadius   0.833715
		volcanoTemp     1506.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.264, 0.271, 0.281, 0.000)
		colorDesert    (0.230, 0.218, 0.216, 0.000)
		colorLowland   (0.293, 0.290, 0.263, 0.000)
		colorUpland    (0.312, 0.309, 0.286, 0.000)
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
		SemiMajorAxis   0.0248362
		Period          0.0196984
		Eccentricity    0.0638576
		Inclination     2.35569
		AscendingNode   -124.079
		ArgOfPericenter 273.218
		MeanAnomaly     222.203
	}
}

DwarfPlanet	"3"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Desert"

	Mass            0.00773869
	Radius          1502.19
	InertiaMoment   0.381832

	Obliquity       0.606118
	EqAscendNode    9.42241
	TidalLocked     true

	AlbedoBond      0.306703
	AlbedoGeom      0.368043
	Brightness      2
	Color          (0.674 0.542 0.404)

	Surface
	{
		SurfStyle       0.45171
		OceanStyle      0.373763
		Randomize      (0.050, 0.987, 0.171)
		colorDistMagn   0.0667353
		colorDistFreq   167.543
		detailScale     3863.72
		colorConversion true
		seaLevel        0.133269
		snowLevel       0.85
		tropicLatitude  0.0210856
		icecapLatitude  0.86212
		icecapHeight    0.144023
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.79902
		venusFreq       0.707777
		venusMagn       0
		mareFreq        0.914773
		mareDensity     0.00389812
		terraceProb     0.40006
		erosion         0
		montesMagn      0.0523344
		montesFreq      88.8825
		montesSpiky     0.984719
		montesFraction  0.910154
		dunesMagn       0.0535548
		dunesFreq       8.80136
		dunesFraction   0.718211
		hillsMagn       0.129179
		hillsFreq       175.227
		hillsFraction   0
		hills2Fraction  0
		riversMagn      64.4631
		riversFreq      4.03442
		riversSin       4.58701
		riversOctaves   0
		canyonsMagn     0.0397233
		canyonsFreq     40.6781
		canyonFraction  0
		cracksMagn      0.0866067
		cracksFreq      0.143914
		cracksOctaves   0
		craterMagn      0.667288
		craterFreq      3.14243
		craterDensity   0.118704
		craterOctaves   1.36923
		volcanoMagn     0.229641
		volcanoFreq     0.7908
		volcanoDensity  0.0579688
		volcanoOctaves  1
		volcanoActivity 0
		volcanoFlows    0.399338
		volcanoRadius   0.529303
		volcanoTemp     1727.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      1
		twistMagn       3.5
		cycloneMagn     1.141
		cycloneDensity  0.283119
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
		Height          12.7189
		BumpHeight      6.88228
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.939295
		mainOctaves     10
		Coverage        0.213405
		twistZones      1
		twistMagn       3.5
	}

	Clouds
	{
		Height          15.4376
		BumpHeight      6.73431
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.939295
		mainOctaves     10
		Coverage        0.213405
		twistZones      1
		twistMagn       3.5
	}

	Clouds
	{
		Height          18.1565
		BumpHeight      6.07544
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.939295
		mainOctaves     10
		Coverage        0.213405
		twistZones      1
		twistMagn       3.5
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          75.1096
		Density         0.864525
		Pressure        0.423228
		Greenhouse      2.16195
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0126965
		Saturation      1

		Composition
		{
			CO2   	98.1734
			SO2   	1.79632
			C3H8  	0.0291218
			Ar    	0.0011505
		}
	}

	Aurora
	{
		Height      17.8079
		NorthLat    53.8966
		NorthLon    -68.988
		NorthRadius 484.119
		NorthWidth  558.449
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -49.1466
		SouthLon    90.7601
		SouthRadius 391.049
		SouthWidth  349.792
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
		SemiMajorAxis   0.0401083
		Period          0.0404257
		Eccentricity    0.00734008
		Inclination     -1.42949
		AscendingNode   9.94064
		ArgOfPericenter 267.042
		MeanAnomaly     279.825
	}
}

Planet	"4"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Desert"

	Mass            0.0240933
	Radius          2356.36
	InertiaMoment   0.359927

	Obliquity       -2.1723
	EqAscendNode    104.278
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.647 0.644 0.642)

	Surface
	{
		SurfStyle       0.721312
		OceanStyle      0.41833
		Randomize      (-0.380, 0.549, -0.708)
		colorDistMagn   0.0573091
		colorDistFreq   225.857
		detailScale     6060.7
		colorConversion true
		seaLevel        0.109293
		snowLevel       2
		tropicLatitude  0.0465153
		icecapLatitude  0.806882
		icecapHeight    0.12143
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530796
		venusFreq       0.869886
		venusMagn       0.340189
		mareFreq        1.30329
		mareDensity     0.00638996
		terraceProb     0.237527
		erosion         0
		montesMagn      0.127179
		montesFreq      104.919
		montesSpiky     0.979709
		montesFraction  0.592827
		dunesMagn       0.0658991
		dunesFreq       14.1294
		dunesFraction   0.188026
		hillsMagn       0.130542
		hillsFreq       259.184
		hillsFraction   0
		hills2Fraction  0
		riversMagn      59.0502
		riversFreq      3.11377
		riversSin       6.30615
		riversOctaves   0
		canyonsMagn     0.0485038
		canyonsFreq     57.2655
		canyonFraction  0
		cracksMagn      0.1131
		cracksFreq      0.183779
		cracksOctaves   0
		craterMagn      0.621264
		craterFreq      6.811
		craterDensity   0.423117
		craterOctaves   5.5008
		volcanoMagn     0.458316
		volcanoFreq     0.933026
		volcanoDensity  0.0928494
		volcanoOctaves  1
		volcanoActivity 0.0780047
		volcanoFlows    0.612066
		volcanoRadius   0.55518
		volcanoTemp     1476.43
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
		Model          "Titan"
		Height          117.818
		Density         0.101068
		Pressure        0.0421501
		Greenhouse      0.621089
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			CO2   	69.7937
			NH3   	11.5359
			C2H2  	9.10773
			CH4   	4.07607
			C2H6  	3.21514
			H2S   	1.62574
			C2H4  	0.267445
			C3H8  	0.255609
			N2    	0.0866667
			SO2   	0.0335906
			CO    	0.00194594
			Ar    	0.000179704
			Cl2   	0.00014893
			H2O   	0.000125123
			Ne    	1.36797e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0777199
		Period          0.109044
		Eccentricity    0.0194018
		Inclination     -2.1723
		AscendingNode   104.278
		ArgOfPericenter 59.2595
		MeanAnomaly     121.49
	}
}

DwarfMoon	"4.D1"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            6.44624e-009
	Radius          25.7291
	InertiaMoment   0.398311

	Oblateness      0.249

	Obliquity       -0.00719285
	EqAscendNode    -69.3296
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.503 0.424 0.350)

	Surface
	{
		SurfStyle       0.884847
		OceanStyle      0.276344
		Randomize      (0.383, 0.023, -0.196)
		colorDistMagn   0.936015
		colorDistFreq   0.209143
		detailScale     702.576
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600778
		terraceProb     0.365063
		erosion         0
		montesMagn      0.482055
		montesFreq      3.13527
		montesSpiky     0.900873
		montesFraction  0.407252
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.32734
		hillsFraction   0.666151
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264366
		craterFreq      0.151248
		craterDensity   1.04615
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   50.2432
		volcanoTemp     1601.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.148, 0.140, 0.050)
		colorShelf     (0.201, 0.174, 0.161, 0.040)
		colorBeach     (0.232, 0.199, 0.182, 0.030)
		colorDesert    (0.262, 0.225, 0.207, 0.020)
		colorLowland   (0.292, 0.250, 0.228, 0.030)
		colorUpland    (0.322, 0.276, 0.249, 0.050)
		colorRock      (0.352, 0.301, 0.277, 0.020)
		colorSnow      (0.352, 0.301, 0.277, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.39893e-005
		Period          0.000738319
		Eccentricity    6.23486e-005
		Inclination     -0.00719285
		AscendingNode   -69.3296
		ArgOfPericenter 144.452
		MeanAnomaly     75.0467
	}
}

DwarfMoon	"4.D2"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            8.8315e-009
	Radius          27.2022
	InertiaMoment   0.399358

	Oblateness      0.249

	Obliquity       -0.0122863
	EqAscendNode    159.466
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.600 0.455 0.325)

	Surface
	{
		SurfStyle       0.507125
		OceanStyle      0.323889
		Randomize      (-0.045, -0.289, -0.807)
		colorDistMagn   0.329278
		colorDistFreq   0.182098
		detailScale     742.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.455961
		terraceProb     0.191624
		erosion         0
		montesMagn      0.544956
		montesFreq      3.4098
		montesSpiky     0.841983
		montesFraction  0.334925
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.91281
		hillsFraction   0.633833
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260031
		craterFreq      0.195967
		craterDensity   0.987427
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   45.3829
		volcanoTemp     1244.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.155, 0.091, 0.000)
		colorShelf     (0.240, 0.159, 0.104, 0.000)
		colorBeach     (0.282, 0.187, 0.123, 0.000)
		colorDesert    (0.306, 0.200, 0.120, 0.000)
		colorLowland   (0.336, 0.214, 0.136, 0.000)
		colorUpland    (0.372, 0.260, 0.166, 0.000)
		colorRock      (0.402, 0.282, 0.179, 0.000)
		colorSnow      (0.438, 0.301, 0.188, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.59144e-005
		Period          0.000801925
		Eccentricity    6.02242e-005
		Inclination     -0.0122863
		AscendingNode   159.466
		ArgOfPericenter 112.648
		MeanAnomaly     -144.177
	}
}

DwarfMoon	"4.D3"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.20538e-008
	Radius          35.2901
	InertiaMoment   0.396693

	Oblateness      0.249

	Obliquity       0.0145634
	EqAscendNode    129.618
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.664 0.662)

	Surface
	{
		SurfStyle       0.451824
		OceanStyle      0.897249
		Randomize      (0.784, -0.918, 0.608)
		colorDistMagn   0.392295
		colorDistFreq   0.660633
		detailScale     963.656
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.445221
		terraceProb     0.154018
		erosion         0
		montesMagn      0.494272
		montesFreq      2.86704
		montesSpiky     0.942405
		montesFraction  0.650408
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.37685
		hillsFraction   0.538759
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243316
		craterFreq      0.242701
		craterDensity   0.838962
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   50.3961
		volcanoTemp     1212.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.266, 0.265, 0.000)
		colorShelf     (0.284, 0.282, 0.281, 0.000)
		colorBeach     (0.301, 0.299, 0.298, 0.000)
		colorDesert    (0.318, 0.316, 0.314, 0.000)
		colorLowland   (0.334, 0.332, 0.331, 0.000)
		colorUpland    (0.351, 0.349, 0.348, 0.000)
		colorRock      (0.368, 0.365, 0.364, 0.000)
		colorSnow      (0.385, 0.382, 0.381, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.9651e-005
		Period          0.00093028
		Eccentricity    4.87319e-005
		Inclination     0.0145634
		AscendingNode   129.618
		ArgOfPericenter 11.3952
		MeanAnomaly     -74.4059
	}
}

DwarfMoon	"4.D4"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.64059e-008
	Radius          36.8063
	InertiaMoment   0.398483

	Oblateness      0.249

	Obliquity       -0.00258785
	EqAscendNode    168.9
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.617 0.583 0.514)

	Surface
	{
		SurfStyle       0.531924
		OceanStyle      0.77551
		Randomize      (0.864, -0.821, -0.244)
		colorDistMagn   0.567108
		colorDistFreq   1.16755
		detailScale     1005.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.767924
		terraceProb     0.213994
		erosion         0
		montesMagn      0.519403
		montesFreq      2.98942
		montesSpiky     0.920857
		montesFraction  0.589971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.35228
		hillsFraction   0.692035
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241319
		craterFreq      0.256811
		craterDensity   0.788613
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   45.0534
		volcanoTemp     1746.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.198, 0.144, 0.000)
		colorShelf     (0.247, 0.204, 0.165, 0.000)
		colorBeach     (0.290, 0.239, 0.195, 0.000)
		colorDesert    (0.315, 0.257, 0.190, 0.000)
		colorLowland   (0.346, 0.274, 0.216, 0.000)
		colorUpland    (0.383, 0.332, 0.262, 0.000)
		colorRock      (0.414, 0.361, 0.283, 0.000)
		colorSnow      (0.451, 0.385, 0.298, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.72534e-005
		Period          0.00121027
		Eccentricity    1.46677e-005
		Inclination     -0.00258785
		AscendingNode   168.9
		ArgOfPericenter -110.157
		MeanAnomaly     179.862
	}
}

DwarfMoon	"4.D5"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            2.22877e-008
	Radius          39.1273
	InertiaMoment   0.399488

	RotationPeriod  287.586
	Obliquity       53.2682
	EqAscendNode    174.585

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.789 0.787 0.786)

	Surface
	{
		SurfStyle       0.767586
		OceanStyle      0.907974
		Randomize      (-0.176, -0.643, -0.449)
		colorDistMagn   0.552016
		colorDistFreq   0.620798
		detailScale     1068.44
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0756561
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.51601
		terraceProb     0.618164
		erosion         0
		montesMagn      0.30322
		montesFreq      2.87489
		montesSpiky     0.742365
		montesFraction  0.186847
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.58731
		hillsFraction   0.598948
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23862
		craterFreq      0.212896
		craterDensity   0.856974
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.0916
		volcanoTemp     1674.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.267, 0.220, 0.000)
		colorShelf     (0.316, 0.275, 0.251, 0.000)
		colorBeach     (0.371, 0.323, 0.299, 0.000)
		colorDesert    (0.402, 0.346, 0.291, 0.000)
		colorLowland   (0.442, 0.370, 0.330, 0.000)
		colorUpland    (0.489, 0.448, 0.401, 0.000)
		colorRock      (0.529, 0.488, 0.432, 0.000)
		colorSnow      (0.576, 0.519, 0.456, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00012914
		Period          0.00546795
		Eccentricity    0.40442
		Inclination     53.2682
		AscendingNode   174.585
		ArgOfPericenter -113.73
		MeanAnomaly     162.831
	}
}

Planet	"5"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "IceWorld"

	Mass            0.0714167
	Radius          3561.74
	InertiaMoment   0.339602

	Obliquity       0.829744
	EqAscendNode    106.202
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.713 0.706 0.703)

	Surface
	{
		SurfStyle       0.884358
		OceanStyle      0.665831
		Randomize      (0.281, 0.318, 0.959)
		colorDistMagn   0.0527888
		colorDistFreq   391.029
		detailScale     9160.99
		colorConversion true
		drivenDarkening 0
		seaLevel        0.290313
		snowLevel       2
		tropicLatitude  0.01739
		icecapLatitude  0.944929
		icecapHeight    0.292447
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.87547
		venusFreq       0.386686
		venusMagn       0.168079
		mareFreq        2.04833
		mareDensity     0.0103047
		terraceProb     0.208363
		erosion         0
		montesMagn      0.213442
		montesFreq      193.215
		montesSpiky     0.95522
		montesFraction  0.569203
		dunesMagn       0.0469977
		dunesFreq       4704.55
		dunesFraction   0.625645
		hillsMagn       0.129799
		hillsFreq       379.914
		hillsFraction   0.308101
		hills2Fraction  0.0546601
		riversMagn      57.8714
		riversFreq      3.06663
		riversSin       5.7118
		riversOctaves   0
		canyonsMagn     0.191808
		canyonsFreq     1.14017
		canyonFraction  0
		cracksMagn      0.0255821
		cracksFreq      0.799256
		cracksOctaves   2
		craterMagn      0.575241
		craterFreq      9.98888
		craterDensity   0.715254
		craterOctaves   9.99706
		craterRayedFactor 0.108978
		volcanoMagn     0.750683
		volcanoFreq     1.2257
		volcanoDensity  0.0588342
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.130961
		volcanoRadius   0.640313
		volcanoTemp     1402.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.713, 0.530, 0.404, 0.000)
		colorShelf     (0.677, 0.503, 0.383, 0.000)
		colorBeach     (0.356, 0.265, 0.202, 0.000)
		colorDesert    (0.606, 0.450, 0.343, 0.000)
		colorLowland   (0.577, 0.466, 0.383, 0.000)
		colorUpland    (0.663, 0.492, 0.375, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.577, 0.466, 0.383, 0.000)
		colorUpPlants  (0.663, 0.492, 0.375, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.945452
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
		Height          114.897
		Density         0.00545479
		Pressure        0.00316764
		Greenhouse      1.68767
		Bright          5.58928
		Opacity         1
		SkyLight        1.86309
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	82.1824
			CO2   	8.65649
			C2H2  	6.7764
			C2H6  	1.66931
			C2H4  	0.566384
			N2    	0.10721
			H2S   	0.0339052
			CO    	0.00412655
			Ar    	0.00370249
			Ne    	5.33486e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.159687
		Period          0.32115
		Eccentricity    0.0707632
		Inclination     0.829744
		AscendingNode   106.202
		ArgOfPericenter 220.308
		MeanAnomaly     23.572
	}
}

DwarfMoon	"5.D1"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            4.51503e-007
	Radius          104.85
	InertiaMoment   0.398911

	Oblateness      0.249

	Obliquity       -0.00325324
	EqAscendNode    -34.2042
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.681 0.573 0.412)

	Surface
	{
		SurfStyle       0.230603
		OceanStyle      0.192623
		Randomize      (-0.016, -0.599, -0.195)
		colorDistMagn   0.67736
		colorDistFreq   2.07041
		detailScale     2863.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.59845
		terraceProb     0.359311
		erosion         0
		montesMagn      0.429332
		montesFreq      3.73236
		montesSpiky     0.875818
		montesFraction  0.764728
		dunesFraction   0
		hillsMagn       0
		hillsFreq       29.8105
		hillsFraction   0.85744
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227122
		craterFreq      0.39035
		craterDensity   0.958815
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.4649
		volcanoTemp     1444.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.229, 0.165, 0.000)
		colorShelf     (0.290, 0.243, 0.175, 0.000)
		colorBeach     (0.307, 0.258, 0.185, 0.000)
		colorDesert    (0.324, 0.272, 0.195, 0.000)
		colorLowland   (0.341, 0.286, 0.206, 0.000)
		colorUpland    (0.358, 0.301, 0.216, 0.000)
		colorRock      (0.375, 0.315, 0.226, 0.000)
		colorSnow      (0.392, 0.329, 0.237, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.57928e-005
		Period          0.000901874
		Eccentricity    1.5333e-005
		Inclination     -0.00325324
		AscendingNode   -34.2042
		ArgOfPericenter -108.08
		MeanAnomaly     -25.0566
	}
}

DwarfMoon	"5.D2"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            6.3717e-007
	Radius          110.262
	InertiaMoment   0.39984

	Oblateness      0.176631

	Obliquity       0.00504145
	EqAscendNode    85.2443
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.703 0.699 0.696)

	Surface
	{
		SurfStyle       0.229986
		OceanStyle      0.254149
		Randomize      (-0.378, 0.900, 0.418)
		colorDistMagn   0.642656
		colorDistFreq   7.58238
		detailScale     3010.88
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.625934
		terraceProb     0.460558
		erosion         0
		montesMagn      0.436846
		montesFreq      2.87981
		montesSpiky     0.909188
		montesFraction  0.399658
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.6533
		hillsFraction   0.791151
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252177
		craterFreq      0.499124
		craterDensity   0.891284
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.6572
		volcanoTemp     1355.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.280, 0.279, 0.000)
		colorShelf     (0.299, 0.297, 0.296, 0.000)
		colorBeach     (0.316, 0.315, 0.313, 0.000)
		colorDesert    (0.334, 0.332, 0.331, 0.000)
		colorLowland   (0.351, 0.350, 0.348, 0.000)
		colorUpland    (0.369, 0.367, 0.366, 0.000)
		colorRock      (0.387, 0.385, 0.383, 0.000)
		colorSnow      (0.404, 0.402, 0.400, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.81107e-005
		Period          0.00121647
		Eccentricity    5.87771e-005
		Inclination     0.00504145
		AscendingNode   85.2443
		ArgOfPericenter -95.7856
		MeanAnomaly     -152.365
	}
}

DwarfMoon	"5.D3"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            9.09234e-007
	Radius          145.898
	InertiaMoment   0.397866

	Oblateness      0.00190877

	Obliquity       -24.1678
	EqAscendNode    116.247
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.445 0.438 0.435)

	Surface
	{
		SurfStyle       0.81093
		OceanStyle      0.165813
		Randomize      (-0.178, 0.884, 0.370)
		colorDistMagn   0.400232
		colorDistFreq   9.64004
		detailScale     3984
		colorConversion true
		snowLevel       2
		tropicLatitude  0.422182
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.329826
		terraceProb     0.205597
		erosion         0
		montesMagn      0.543591
		montesFreq      2.68437
		montesSpiky     0.934914
		montesFraction  0.652099
		dunesFraction   0
		hillsMagn       0
		hillsFreq       36.4266
		hillsFraction   0.647465
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264056
		craterFreq      0.695291
		craterDensity   0.936898
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.9893
		volcanoTemp     1444.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.149, 0.122, 0.000)
		colorShelf     (0.178, 0.153, 0.139, 0.000)
		colorBeach     (0.209, 0.180, 0.165, 0.000)
		colorDesert    (0.227, 0.193, 0.161, 0.000)
		colorLowland   (0.249, 0.206, 0.183, 0.000)
		colorUpland    (0.276, 0.250, 0.222, 0.000)
		colorRock      (0.298, 0.272, 0.239, 0.000)
		colorSnow      (0.325, 0.289, 0.252, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00036119
		Period          0.0148552
		Eccentricity    0.0609797
		Inclination     -24.1678
		AscendingNode   116.247
		ArgOfPericenter -45.4193
		MeanAnomaly     -86
	}
}

DwarfMoon	"5.D4"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.31485e-006
	Radius          156.803
	InertiaMoment   0.399053

	RotationPeriod  825.885
	Obliquity       89.3916
	EqAscendNode    18.7507

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.649 0.643 0.639)

	Surface
	{
		SurfStyle       0.166185
		OceanStyle      0.573131
		Randomize      (-0.366, -0.976, -0.950)
		colorDistMagn   0.385545
		colorDistFreq   2.10874
		detailScale     4281.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.322097
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.425621
		terraceProb     0.455867
		erosion         0
		montesMagn      0.568525
		montesFreq      2.28004
		montesSpiky     0.876314
		montesFraction  0.531213
		dunesFraction   0
		hillsMagn       0
		hillsFreq       40.7262
		hillsFraction   0.828231
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255211
		craterFreq      0.902065
		craterDensity   0.721538
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.4399
		volcanoTemp     1447.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.257, 0.256, 0.000)
		colorShelf     (0.276, 0.273, 0.272, 0.000)
		colorBeach     (0.292, 0.289, 0.288, 0.000)
		colorDesert    (0.308, 0.305, 0.304, 0.000)
		colorLowland   (0.324, 0.321, 0.320, 0.000)
		colorUpland    (0.341, 0.337, 0.336, 0.000)
		colorRock      (0.357, 0.354, 0.352, 0.000)
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
		SemiMajorAxis   0.000880377
		Period          0.05653
		Eccentricity    0.358107
		Inclination     89.3916
		AscendingNode   18.7507
		ArgOfPericenter -82.3533
		MeanAnomaly     124.978
	}
}

Planet	"6"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "IceWorld"

	Mass            0.205254
	Radius          4686.92
	InertiaMoment   0.327743

	Oblateness      0.00587641

	RotationPeriod  24.9705
	Obliquity       -2.05877
	EqAscendNode    166.954

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.622 0.617 0.613)

	Surface
	{
		SurfStyle       0.235588
		OceanStyle      0.589712
		Randomize      (-0.675, 0.135, 0.815)
		colorDistMagn   0.0625237
		colorDistFreq   472.559
		detailScale     12055
		colorConversion true
		drivenDarkening 0
		seaLevel        0.13852
		snowLevel       2
		tropicLatitude  0.00930931
		icecapLatitude  0.611647
		icecapHeight    0.160093
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.04513
		venusFreq       0.421221
		venusMagn       0.176655
		mareFreq        2.01672
		mareDensity     0.0210263
		terraceProb     0.401855
		erosion         0
		montesMagn      0.192039
		montesFreq      169.42
		montesSpiky     0.988001
		montesFraction  0.33864
		dunesMagn       0.0590951
		dunesFreq       6152.99
		dunesFraction   0.556102
		hillsMagn       0.111937
		hillsFreq       499.603
		hillsFraction   0.485677
		hills2Fraction  0.0955231
		riversMagn      71.6786
		riversFreq      3.16021
		riversSin       4.84351
		riversOctaves   0
		canyonsMagn     0.488568
		canyonsFreq     1.68003
		canyonFraction  0
		cracksMagn      0.0519125
		cracksFreq      2.72841
		cracksOctaves   2
		craterMagn      0.507171
		craterFreq      15.3926
		craterDensity   0.821477
		craterOctaves   13
		craterRayedFactor 0.285701
		volcanoMagn     0.631294
		volcanoFreq     0.949644
		volcanoDensity  0.061097
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.282743
		volcanoRadius   0.385078
		volcanoTemp     1713.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.622, 0.617, 0.613, 0.500)
		colorShelf     (0.591, 0.586, 0.582, 0.500)
		colorBeach     (0.436, 0.432, 0.429, 0.750)
		colorDesert    (0.529, 0.524, 0.521, 1.000)
		colorLowland   (0.548, 0.543, 0.539, 1.000)
		colorUpland    (0.579, 0.573, 0.570, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.548, 0.543, 0.539, 1.000)
		colorUpPlants  (0.579, 0.573, 0.570, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.983558
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
		Height          113.217
		Density         0.00164424
		Pressure        0.000775613
		Greenhouse      0.635646
		Bright          4.39737
		Opacity         0
		SkyLight        1.46579
		Hue             0.000625074
		Saturation      1

		Composition
		{
			CH4   	97.7408
			H2    	2.128
			N2    	0.12736
			CO    	0.00360854
			Ar    	0.000153349
			He    	7.67993e-005
		}
	}

	Aurora
	{
		Height      66.885
		NorthLat    66.0674
		NorthLon    -103.289
		NorthRadius 1103.59
		NorthWidth  988.045
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -70.6082
		SouthLon    97.5617
		SouthRadius 939.062
		SouthWidth  939.758
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
		SemiMajorAxis   0.3506
		Period          1.04477
		Eccentricity    0.0295533
		Inclination     -1.71851
		AscendingNode   167.454
		ArgOfPericenter 110.931
		MeanAnomaly     38.8377
	}
}

Moon	"6.1"
{
	ParentBody     "6"
	Class	       "IceWorld"

	Mass            0.000108936
	Radius          396.55
	InertiaMoment   0.399564

	Oblateness      0.00960916

	Obliquity       -0.81051
	EqAscendNode    -119.256
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.467 0.396 0.366)

	Surface
	{
		SurfStyle       0.760697
		OceanStyle      0.986334
		Randomize      (-0.289, 0.659, 0.342)
		colorDistMagn   0.0528805
		colorDistFreq   50.8401
		detailScale     1019.95
		colorConversion true
		drivenDarkening 0
		seaLevel        0.248581
		snowLevel       2
		tropicLatitude  0.0143022
		icecapLatitude  0.617504
		icecapHeight    0.27337
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.86959
		venusFreq       0.981681
		venusMagn       0.273264
		mareFreq        0
		mareDensity     0.000100073
		terraceProb     0.463356
		erosion         0
		montesMagn      0.0566597
		montesFreq      24.3624
		montesSpiky     0.984741
		montesFraction  0.787191
		dunesMagn       0.0402747
		dunesFreq       525.026
		dunesFraction   0.667317
		hillsMagn       0.106667
		hillsFreq       48.5441
		hillsFraction   0.58064
		hills2Fraction  0.190128
		riversMagn      56.8396
		riversFreq      3.9879
		riversSin       5.47149
		riversOctaves   0
		canyonsMagn     0.563165
		canyonsFreq     0.123471
		canyonFraction  0
		cracksMagn      0.0304522
		cracksFreq      0.194125
		cracksOctaves   0
		craterMagn      0.675847
		craterFreq      1.26487
		craterDensity   0.860941
		craterOctaves   9
		craterRayedFactor 0.0755873
		volcanoMagn     0.198988
		volcanoFreq     0.65259
		volcanoDensity  0.0515804
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.0850441
		volcanoRadius   0.97185
		volcanoTemp     1460.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.254, 0.245, 0.250)
		colorShelf     (0.327, 0.289, 0.278, 0.250)
		colorBeach     (0.266, 0.214, 0.212, 0.200)
		colorDesert    (0.248, 0.194, 0.187, 0.200)
		colorLowland   (0.182, 0.151, 0.154, 0.200)
		colorUpland    (0.346, 0.293, 0.278, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.182, 0.151, 0.154, 0.200)
		colorUpPlants  (0.346, 0.293, 0.278, 0.250)
		BumpHeight      19.8275
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
		SemiMajorAxis   0.000165577
		Period          0.00271907
		Eccentricity    0.00300203
		Inclination     -0.81051
		AscendingNode   -119.256
		ArgOfPericenter 73.5904
		MeanAnomaly     69.3573
	}
}

Moon	"6.2"
{
	ParentBody     "6"
	Class	       "IceWorld"

	Mass            0.000138551
	Radius          456.322
	InertiaMoment   0.399078

	Oblateness      0.00239668

	Obliquity       1.10105
	EqAscendNode    -53.7656
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.538 0.528 0.521)

	Surface
	{
		SurfStyle       0.225884
		OceanStyle      0.620962
		Randomize      (-0.260, 0.134, -0.328)
		colorDistMagn   0.0548562
		colorDistFreq   49.8598
		detailScale     1173.69
		colorConversion true
		drivenDarkening 0
		seaLevel        0.287846
		snowLevel       2
		tropicLatitude  0.0342739
		icecapLatitude  0.655567
		icecapHeight    0.316378
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.85986
		venusFreq       1.35556
		venusMagn       0.150338
		mareFreq        0
		mareDensity     8.96002e-005
		terraceProb     0.100249
		erosion         0
		montesMagn      0.0678372
		montesFreq      25.5275
		montesSpiky     0.979521
		montesFraction  0.394127
		dunesMagn       0.0344343
		dunesFreq       609.916
		dunesFraction   0.121572
		hillsMagn       0.125832
		hillsFreq       52.8589
		hillsFraction   0.382445
		hills2Fraction  0.161009
		riversMagn      53.0304
		riversFreq      2.91187
		riversSin       7.47721
		riversOctaves   0
		canyonsMagn     0.469674
		canyonsFreq     0.179003
		canyonFraction  0
		cracksMagn      0.0410118
		cracksFreq      0.207418
		cracksOctaves   0
		craterMagn      0.609991
		craterFreq      1.23649
		craterDensity   0.990511
		craterOctaves   9
		craterRayedFactor 0.147607
		volcanoMagn     0.222885
		volcanoFreq     1.06672
		volcanoDensity  0.0564212
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.313229
		volcanoRadius   1.62092
		volcanoTemp     1653.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.538, 0.528, 0.521, 0.500)
		colorShelf     (0.511, 0.502, 0.495, 0.500)
		colorBeach     (0.377, 0.370, 0.365, 0.750)
		colorDesert    (0.458, 0.449, 0.443, 1.000)
		colorLowland   (0.474, 0.465, 0.458, 1.000)
		colorUpland    (0.501, 0.491, 0.484, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.474, 0.465, 0.458, 1.000)
		colorUpPlants  (0.501, 0.491, 0.484, 1.000)
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
		SemiMajorAxis   0.000279218
		Period          0.00595392
		Eccentricity    0.0293322
		Inclination     1.10105
		AscendingNode   -53.7656
		ArgOfPericenter -13.0792
		MeanAnomaly     67.7605
	}
}

DwarfMoon	"6.D1"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            5.98396e-010
	Radius          13.9784
	InertiaMoment   0.396923

	Obliquity       -78.5168
	EqAscendNode    -168.749
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.757 0.612 0.557)

	Surface
	{
		SurfStyle       0.626376
		OceanStyle      0.0237931
		Randomize      (-0.055, -0.809, -0.435)
		colorDistMagn   0.261418
		colorDistFreq   0.0863839
		detailScale     381.703
		colorConversion true
		snowLevel       2
		tropicLatitude  0.191241
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503112
		terraceProb     0.270512
		erosion         0
		montesMagn      0.513629
		montesFreq      2.54016
		montesSpiky     0.796558
		montesFraction  0.692664
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.425388
		hillsFraction   0.790534
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235856
		craterFreq      0.187874
		craterDensity   1.00478
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   89.5918
		volcanoTemp     1490
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.208, 0.156, 0.000)
		colorShelf     (0.303, 0.214, 0.178, 0.000)
		colorBeach     (0.356, 0.251, 0.212, 0.000)
		colorDesert    (0.386, 0.269, 0.206, 0.000)
		colorLowland   (0.424, 0.288, 0.234, 0.000)
		colorUpland    (0.469, 0.349, 0.284, 0.000)
		colorRock      (0.507, 0.379, 0.306, 0.000)
		colorSnow      (0.553, 0.404, 0.323, 1.000)
		BumpHeight      12.5805
		BumpOffset      2.51611
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00117748
		Period          0.0515781
		Eccentricity    0.116311
		Inclination     -78.5168
		AscendingNode   -168.749
		ArgOfPericenter 24.7435
		MeanAnomaly     160.132
	}
}

DwarfMoon	"6.D2"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            8.73777e-010
	Radius          14.1575
	InertiaMoment   0.398568

	Obliquity       4.30043
	EqAscendNode    -62.1734
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.715 0.712 0.710)

	Surface
	{
		SurfStyle       0.195762
		OceanStyle      0.58339
		Randomize      (-0.749, 0.559, 0.934)
		colorDistMagn   0.0500262
		colorDistFreq   0.129447
		detailScale     386.595
		colorConversion true
		snowLevel       2
		tropicLatitude  0.128169
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581659
		terraceProb     0.27878
		erosion         0
		montesMagn      0.511704
		montesFreq      3.00779
		montesSpiky     0.990561
		montesFraction  0.450491
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.563049
		hillsFraction   0.554268
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276326
		craterFreq      0.238126
		craterDensity   0.971185
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   75.0919
		volcanoTemp     1627.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.285, 0.284, 0.000)
		colorShelf     (0.304, 0.303, 0.302, 0.000)
		colorBeach     (0.322, 0.320, 0.319, 0.000)
		colorDesert    (0.340, 0.338, 0.337, 0.000)
		colorLowland   (0.358, 0.356, 0.355, 0.000)
		colorUpland    (0.375, 0.374, 0.373, 0.000)
		colorRock      (0.393, 0.392, 0.390, 0.000)
		colorSnow      (0.411, 0.409, 0.408, 1.000)
		BumpHeight      12.7418
		BumpOffset      2.54835
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00149522
		Period          0.0738057
		Eccentricity    0.0772417
		Inclination     4.30043
		AscendingNode   -62.1734
		ArgOfPericenter 156.792
		MeanAnomaly     132.812
	}
}

DwarfMoon	"6.D3"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.25698e-009
	Radius          15.2735
	InertiaMoment   0.399555

	RotationPeriod  4320.96
	Obliquity       12.5848
	EqAscendNode    -140.455

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.541 0.388 0.297)

	Surface
	{
		SurfStyle       0.715724
		OceanStyle      0.774076
		Randomize      (-0.873, 0.958, -0.436)
		colorDistMagn   0.906098
		colorDistFreq   0.144091
		detailScale     417.069
		colorConversion true
		snowLevel       2
		tropicLatitude  0.147013
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53324
		terraceProb     0.365809
		erosion         0
		montesMagn      0.496667
		montesFreq      3.32979
		montesSpiky     0.75462
		montesFraction  0.534353
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.447818
		hillsFraction   0.506635
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240755
		craterFreq      0.236333
		craterDensity   0.918402
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   67.543
		volcanoTemp     1652.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.132, 0.083, 0.000)
		colorShelf     (0.217, 0.136, 0.095, 0.000)
		colorBeach     (0.254, 0.159, 0.113, 0.000)
		colorDesert    (0.276, 0.171, 0.110, 0.000)
		colorLowland   (0.303, 0.182, 0.125, 0.000)
		colorUpland    (0.336, 0.221, 0.152, 0.000)
		colorRock      (0.363, 0.241, 0.164, 0.000)
		colorSnow      (0.395, 0.256, 0.172, 1.000)
		BumpHeight      13.7462
		BumpOffset      2.74923
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00210441
		Period          0.123233
		Eccentricity    0.281794
		Inclination     12.5848
		AscendingNode   -140.455
		ArgOfPericenter 160.958
		MeanAnomaly     137.962
	}
}

DwarfMoon	"6.D4"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.78589e-009
	Radius          16.4845
	InertiaMoment   0.39728

	RotationPeriod  4023.77
	Obliquity       -42.1081
	EqAscendNode    -146.144

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.617 0.616 0.613)

	Surface
	{
		SurfStyle       0.0558498
		OceanStyle      0.576555
		Randomize      (0.384, 0.399, -0.603)
		colorDistMagn   0.475672
		colorDistFreq   0.206926
		detailScale     450.136
		colorConversion true
		snowLevel       2
		tropicLatitude  0.382965
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.311047
		terraceProb     0.304698
		erosion         0
		montesMagn      0.389454
		montesFreq      4.01722
		montesSpiky     0.960942
		montesFraction  0.140316
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.477926
		hillsFraction   0.529872
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244753
		craterFreq      0.181376
		craterDensity   1.06423
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   61.158
		volcanoTemp     1654.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.246, 0.245, 0.000)
		colorShelf     (0.262, 0.262, 0.260, 0.000)
		colorBeach     (0.278, 0.277, 0.276, 0.000)
		colorDesert    (0.293, 0.292, 0.291, 0.000)
		colorLowland   (0.309, 0.308, 0.306, 0.000)
		colorUpland    (0.324, 0.323, 0.322, 0.000)
		colorRock      (0.340, 0.339, 0.337, 0.000)
		colorSnow      (0.355, 0.354, 0.352, 1.000)
		BumpHeight      14.836
		BumpOffset      2.9672
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00243103
		Period          0.15301
		Eccentricity    0.384261
		Inclination     -42.1081
		AscendingNode   -146.144
		ArgOfPericenter 114.344
		MeanAnomaly     -22.7343
	}
}

Planet	"7"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Titan"

	Mass            0.580636
	Radius          6896.85
	InertiaMoment   0.329183

	Oblateness      0.00881139

	RotationPeriod  21.699
	Obliquity       301.657
	EqAscendNode    -137.062

	AlbedoBond      0.643995
	AlbedoGeom      0.772794
	Brightness      2
	Color          (0.727 0.723 0.719)

	Surface
	{
		SurfStyle       0.974766
		OceanStyle      0.702807
		Randomize      (-0.612, -0.675, -0.037)
		colorDistMagn   0.0804194
		colorDistFreq   802.209
		detailScale     17739.1
		colorConversion true
		seaLevel        0.521656
		snowLevel       2
		tropicLatitude  0.846207
		icecapLatitude  0.957346
		icecapHeight    0.523629
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.89811
		venusFreq       1.39098
		venusMagn       -1
		mareFreq        2.32077
		mareDensity     0.0499247
		terraceProb     0.360848
		erosion         0.107211
		montesMagn      0.206225
		montesFreq      431.56
		montesSpiky     0.96637
		montesFraction  0.0203872
		dunesMagn       0.054839
		dunesFreq       51.5082
		dunesFraction   0.160988
		hillsMagn       0.138365
		hillsFreq       827.883
		hillsFraction   0.241463
		hills2Fraction  0.322515
		riversMagn      67.0877
		riversFreq      2.76589
		riversSin       5.41419
		riversOctaves   2
		canyonsMagn     0.0393257
		canyonsFreq     190.871
		canyonFraction  0.363178
		cracksMagn      0.0610945
		cracksFreq      1.28904
		cracksOctaves   6
		craterMagn      0.623404
		craterFreq      23.5399
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0.102395
		volcanoMagn     0.698988
		volcanoFreq     0.821373
		volcanoDensity  0.0663522
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.804216
		volcanoRadius   0.291397
		volcanoTemp     1708.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      2.66131
		twistMagn       0
		cycloneMagn     3.12118
		cycloneFreq     0.330231
		cycloneDensity  0.0123124
		colorSea       (0.150, 0.100, 0.090, 1.000)
		colorShelf     (0.640, 0.350, 0.210, 1.000)
		colorBeach     (0.727, 0.607, 0.482, 0.000)
		colorDesert    (0.444, 0.347, 0.252, 0.000)
		colorLowland   (0.487, 0.369, 0.122, 0.000)
		colorUpland    (0.502, 0.332, 0.331, 0.000)
		colorRock      (0.640, 0.710, 0.740, 0.350)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.487, 0.369, 0.122, 0.000)
		colorUpPlants  (0.502, 0.332, 0.331, 0.000)
		BumpHeight      20
		BumpOffset      10.4331
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.1
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          2.56787
		BumpHeight      5.72123
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.940883
		mainOctaves     10
		Coverage        0.11201
		twistZones      2.66131
		twistMagn       0
	}

	Ocean
	{
		Height          10.4331
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          25.092
		Density         0.31468
		Pressure        0.0640609
		Greenhouse      1.46835
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0123271
		Saturation      1

		Composition
		{
			N2    	98.8209
			Ar    	0.815227
			CO    	0.314525
			Ne    	0.0397884
			He    	0.00955286
		}
	}

	Aurora
	{
		Height      121.769
		NorthLat    71.7953
		NorthLon    113.318
		NorthRadius 1642.54
		NorthWidth  1415.06
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -70.6986
		SouthLon    304.301
		SouthRadius 1756.06
		SouthWidth  1671.51
		SouthRings  4
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     10431.1
		OuterRadius     20421.6
		RotationPeriod  8.57692
		RotationOffset  0
		FrontBright     0.664197
		BackBright      0.733535
		Density         0.828083
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.62901
		Period          2.51063
		Eccentricity    0.0517668
		Inclination     -0.977791
		AscendingNode   -123.855
		ArgOfPericenter 281.379
		MeanAnomaly     252.878
	}
}

Moon	"7.1"
{
	ParentBody     "7"
	Class	       "Selena"

	Mass            0.00377281
	Radius          1283.28
	InertiaMoment   0.397974

	Oblateness      0.0103006

	Obliquity       0.84081
	EqAscendNode    -71.11
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.496 0.487 0.483)

	Surface
	{
		SurfStyle       0.69137
		OceanStyle      0.68556
		Randomize      (-0.345, 0.912, 0.979)
		colorDistMagn   0.0697315
		colorDistFreq   163.706
		detailScale     3300.68
		colorConversion true
		drivenDarkening 0
		seaLevel        0.181475
		snowLevel       2
		tropicLatitude  0.0238742
		icecapLatitude  6.00411
		icecapHeight    0.14418
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.00134
		venusFreq       1.24481
		venusMagn       0
		mareFreq        0.559614
		mareDensity     0.000921314
		terraceProb     0.453174
		erosion         0
		montesMagn      0.0721186
		montesFreq      65.7405
		montesSpiky     0.987336
		montesFraction  0.472475
		dunesMagn       0.0567777
		dunesFreq       1689.14
		dunesFraction   0.929259
		hillsMagn       0.102152
		hillsFreq       137.303
		hillsFraction   0.669287
		hills2Fraction  0
		riversMagn      58.1326
		riversFreq      3.51349
		riversSin       7.14118
		riversOctaves   0
		canyonsMagn     0.476565
		canyonsFreq     0.461723
		canyonFraction  0.323665
		cracksMagn      0.0798472
		cracksFreq      0.563799
		cracksOctaves   0
		craterMagn      0.544851
		craterFreq      3.54623
		craterDensity   0.699894
		craterOctaves   8.02235
		craterRayedFactor 0.350879
		volcanoMagn     0.211817
		volcanoFreq     3.19821
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.147812
		volcanoRadius   0.873016
		volcanoTemp     1392.58
		lavaCoverTidal  0.300773
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.308, 0.297, 0.261, 0.000)
		colorDesert    (0.322, 0.302, 0.266, 0.000)
		colorLowland   (0.253, 0.224, 0.203, 0.000)
		colorUpland    (0.372, 0.346, 0.299, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999975
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
		Height          96.2463
		Density         2.53386e-006
		Pressure        1.74162e-006
		Greenhouse      0.0697464
		Bright          1.20436
		Opacity         0
		SkyLight        0.401453
		Hue             -0.0163155
		Saturation      1

		Composition
		{
			H2O   	52.1464
			C2H2  	21.6825
			CO2   	19.5567
			C2H4  	4.33321
			SO2   	1.08705
			C2H6  	0.48161
			H2S   	0.405668
			C3H8  	0.183194
			N2    	0.0903571
			NH3   	0.0325164
			Ar    	0.000528478
			CO    	0.000138829
			Ne    	9.17459e-005
			Cl2   	5.86215e-005
			Kr    	2.05123e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000227162
		Period          0.00259016
		Eccentricity    0.0367915
		Inclination     0.84081
		AscendingNode   -71.11
		ArgOfPericenter -88.018
		MeanAnomaly     177.754
	}
}

Moon	"7.2"
{
	ParentBody     "7"
	Class	       "IceWorld"

	Mass            0.00436681
	Radius          1430.99
	InertiaMoment   0.394113

	Obliquity       0.430966
	EqAscendNode    108.848
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.701 0.699 0.697)

	Surface
	{
		SurfStyle       0.393075
		OceanStyle      0.00983849
		Randomize      (0.730, 0.954, 0.999)
		colorDistMagn   0.0795447
		colorDistFreq   222.927
		detailScale     3680.58
		colorConversion true
		drivenDarkening 0
		seaLevel        0.102053
		snowLevel       2
		tropicLatitude  0.008755
		icecapLatitude  0.609672
		icecapHeight    0.122582
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.97945
		venusFreq       1.32733
		venusMagn       0.199233
		mareFreq        0.582545
		mareDensity     0.00109309
		terraceProb     0.274039
		erosion         0
		montesMagn      0.0679414
		montesFreq      56.4586
		montesSpiky     0.861114
		montesFraction  0.0328218
		dunesMagn       0.0458909
		dunesFreq       1896.22
		dunesFraction   0.999065
		hillsMagn       0.106824
		hillsFreq       131.511
		hillsFraction   0.41084
		hills2Fraction  0.271393
		riversMagn      64.3905
		riversFreq      1.4264
		riversSin       6.36078
		riversOctaves   0
		canyonsMagn     0.709469
		canyonsFreq     0.461815
		canyonFraction  0
		cracksMagn      0.0362743
		cracksFreq      0.882395
		cracksOctaves   1
		craterMagn      0.646625
		craterFreq      2.7072
		craterDensity   0.921757
		craterOctaves   11
		craterRayedFactor 0.123919
		volcanoMagn     0.207508
		volcanoFreq     0.773864
		volcanoDensity  0.0607025
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.489003
		volcanoRadius   0.656847
		volcanoTemp     1140.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.701, 0.699, 0.697, 0.500)
		colorShelf     (0.666, 0.664, 0.662, 0.500)
		colorBeach     (0.490, 0.489, 0.488, 0.750)
		colorDesert    (0.596, 0.594, 0.593, 1.000)
		colorLowland   (0.617, 0.615, 0.614, 1.000)
		colorUpland    (0.652, 0.650, 0.649, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.617, 0.615, 0.614, 1.000)
		colorUpPlants  (0.652, 0.650, 0.649, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999999
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
		Height          107.324
		Density         6.75548e-008
		Pressure        1.50211e-008
		Greenhouse      0.00343271
		Bright          0.583353
		Opacity         0
		SkyLight        0.194451
		Hue             -0.00856413
		Saturation      1

		Composition
		{
			N2    	71.0938
			CH4   	21.0441
			Ar    	7.73142
			CO    	0.102872
			Kr    	0.0162782
			Ne    	0.0110583
			O2    	0.000365447
			C2H4  	0.000143685
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000539296
		Period          0.00946982
		Eccentricity    0.0321031
		Inclination     0.430966
		AscendingNode   108.848
		ArgOfPericenter 155.748
		MeanAnomaly     -126.301
	}
}

DwarfMoon	"7.D1"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            6.83336e-008
	Radius          59.6913
	InertiaMoment   0.399125

	Obliquity       -19.8631
	EqAscendNode    -152.343
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.672 0.580 0.458)

	Surface
	{
		SurfStyle       0.314808
		OceanStyle      0.641376
		Randomize      (-0.586, 0.924, -0.787)
		colorDistMagn   0.962873
		colorDistFreq   1.95106
		detailScale     1629.97
		colorConversion true
		snowLevel       2
		tropicLatitude  0.161885
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.403351
		terraceProb     0.204284
		erosion         0
		montesMagn      0.647599
		montesFreq      3.15956
		montesSpiky     0.652498
		montesFraction  0.663241
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.36808
		hillsFraction   0.511552
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222667
		craterFreq      0.272433
		craterDensity   0.780092
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.8014
		volcanoTemp     1392.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.232, 0.183, 0.000)
		colorShelf     (0.286, 0.247, 0.195, 0.000)
		colorBeach     (0.302, 0.261, 0.206, 0.000)
		colorDesert    (0.319, 0.276, 0.218, 0.000)
		colorLowland   (0.336, 0.290, 0.229, 0.000)
		colorUpland    (0.353, 0.305, 0.240, 0.000)
		colorRock      (0.370, 0.319, 0.252, 0.000)
		colorSnow      (0.386, 0.334, 0.263, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00291932
		Period          0.119715
		Eccentricity    0.0419543
		Inclination     -19.8631
		AscendingNode   -152.343
		ArgOfPericenter 164.962
		MeanAnomaly     145.456
	}
}

DwarfPlanet	"8"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "IceWorld"

	Mass            0.00260327
	Radius          1135.47
	InertiaMoment   0.398814

	Oblateness      0.00155223

	RotationPeriod  58.6959
	Obliquity       -106.835
	EqAscendNode    111.958

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.588 0.583 0.573)

	Surface
	{
		SurfStyle       0.776189
		OceanStyle      0.186912
		Randomize      (-0.273, -0.126, 0.444)
		colorDistMagn   0.0507788
		colorDistFreq   131.378
		detailScale     2920.49
		colorConversion true
		drivenDarkening 0
		seaLevel        0.196341
		snowLevel       2
		tropicLatitude  0.958113
		icecapLatitude  1
		icecapHeight    0.196341
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76755
		venusFreq       0.940281
		venusMagn       0.229769
		mareFreq        0.301367
		mareDensity     0.000977025
		terraceProb     0.391986
		erosion         0
		montesMagn      0.0543668
		montesFreq      42.1545
		montesSpiky     0.900211
		montesFraction  0.853597
		dunesMagn       0.0442419
		dunesFreq       1508.37
		dunesFraction   0.276249
		hillsMagn       0.142654
		hillsFreq       134.844
		hillsFraction   0.31734
		hills2Fraction  0.272103
		riversMagn      72.6481
		riversFreq      2.39974
		riversSin       5.16112
		riversOctaves   0
		canyonsMagn     0.575384
		canyonsFreq     0.305806
		canyonFraction  0
		cracksMagn      0.0544003
		cracksFreq      0.526823
		cracksOctaves   0
		craterMagn      0.644495
		craterFreq      3.35845
		craterDensity   0.930878
		craterOctaves   10
		craterRayedFactor 0.168072
		volcanoMagn     0.214677
		volcanoFreq     0.758508
		volcanoDensity  0.0486961
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.460393
		volcanoRadius   0.661639
		volcanoTemp     1474.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.377, 0.373, 0.384, 0.250)
		colorShelf     (0.412, 0.426, 0.435, 0.250)
		colorBeach     (0.335, 0.315, 0.332, 0.200)
		colorDesert    (0.312, 0.286, 0.292, 0.200)
		colorLowland   (0.229, 0.222, 0.241, 0.200)
		colorUpland    (0.435, 0.432, 0.435, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.229, 0.222, 0.241, 0.200)
		colorUpPlants  (0.435, 0.432, 0.435, 0.250)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.99945
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
		Height          85.1601
		Density         5.50014e-005
		Pressure        8.21339e-006
		Greenhouse      0.0306155
		Bright          2.22882
		Opacity         0
		SkyLight        0.742939
		Hue             -0.0268364
		Saturation      1

		Composition
		{
			N2    	95.7577
			CO    	2.31233
			Ar    	1.57933
			O2    	0.255417
			Ne    	0.0949239
			CH4   	0.000316084
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.05304
		Period          5.4384
		Eccentricity    0.00352038
		Inclination     -6.56493
		AscendingNode   105.093
		ArgOfPericenter 287.086
		MeanAnomaly     326.755
	}
}

Asteroid	"S1"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            9.50098e-014
	Radius          0.379777
	InertiaMoment   0.398575

	RotationPeriod  964.165
	Obliquity       -0.885102
	EqAscendNode    -11.7975

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.555 0.550 0.543)

	Surface
	{
		SurfStyle       0.732141
		OceanStyle      0.704673
		Randomize      (0.192, 0.401, -0.228)
		colorDistMagn   0.200146
		colorDistFreq   0.000123218
		detailScale     10.3705
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0307271
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.62584
		terraceProb     0.43805
		erosion         0
		montesMagn      0.502952
		montesFreq      3.14023
		montesSpiky     0.966037
		montesFraction  0.199975
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000484656
		hillsFraction   0.735017
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236027
		craterFreq      0.194355
		craterDensity   0.899605
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   193.175
		volcanoTemp     1545.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.187, 0.152, 0.000)
		colorShelf     (0.222, 0.193, 0.174, 0.000)
		colorBeach     (0.261, 0.226, 0.206, 0.000)
		colorDesert    (0.283, 0.242, 0.201, 0.000)
		colorLowland   (0.311, 0.259, 0.228, 0.000)
		colorUpland    (0.344, 0.314, 0.277, 0.000)
		colorRock      (0.372, 0.341, 0.299, 0.000)
		colorSnow      (0.405, 0.363, 0.315, 1.000)
		BumpHeight      0.3418
		BumpOffset      0.0683599
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.055608
		Period          0.065995
		Eccentricity    0.126763
		Inclination     -0.885102
		AscendingNode   -11.7975
		ArgOfPericenter 8.15384
		MeanAnomaly     15.2151
	}
}

Asteroid	"S2"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.39812e-010
	Radius          3.99369
	InertiaMoment   0.399578

	RotationPeriod  861.826
	Obliquity       4.75893
	EqAscendNode    -178.558

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.551 0.472 0.368)

	Surface
	{
		SurfStyle       0.81941
		OceanStyle      0.891207
		Randomize      (-0.020, 0.858, -0.729)
		colorDistMagn   0.98747
		colorDistFreq   0.01284
		detailScale     109.054
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00210018
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.487515
		terraceProb     0.315783
		erosion         0
		montesMagn      0.357003
		montesFreq      2.82652
		montesSpiky     0.891125
		montesFraction  0.601249
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0285978
		hillsFraction   0.62827
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225112
		craterFreq      0.234826
		craterDensity   0.799344
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   52.9551
		volcanoTemp     1340.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.160, 0.103, 0.000)
		colorShelf     (0.221, 0.165, 0.118, 0.000)
		colorBeach     (0.259, 0.193, 0.140, 0.000)
		colorDesert    (0.281, 0.208, 0.136, 0.000)
		colorLowland   (0.309, 0.222, 0.154, 0.000)
		colorUpland    (0.342, 0.269, 0.187, 0.000)
		colorRock      (0.369, 0.292, 0.202, 0.000)
		colorSnow      (0.402, 0.311, 0.213, 1.000)
		BumpHeight      3.59432
		BumpOffset      0.718864
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0516
		Period          0.0589901
		Eccentricity    0.116421
		Inclination     4.75893
		AscendingNode   -178.558
		ArgOfPericenter -104.23
		MeanAnomaly     73.317
	}
}

Asteroid	"S3"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.05741e-007
	Radius          45.4167
	InertiaMoment   0.397376

	RotationPeriod  799.748
	Obliquity       -6.17022
	EqAscendNode    178.74

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.585 0.580 0.573)

	Surface
	{
		SurfStyle       0.321707
		OceanStyle      0.257338
		Randomize      (-0.774, 0.857, 0.929)
		colorDistMagn   0.28516
		colorDistFreq   1.17753
		detailScale     1240.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00236703
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.270915
		terraceProb     0.271195
		erosion         0
		montesMagn      0.412029
		montesFreq      3.32108
		montesSpiky     0.990669
		montesFraction  0.388542
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.93809
		hillsFraction   0.707103
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213859
		craterFreq      0.186524
		craterDensity   1.00302
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   15.6986
		volcanoTemp     1458.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.232, 0.229, 0.000)
		colorShelf     (0.249, 0.246, 0.243, 0.000)
		colorBeach     (0.263, 0.261, 0.258, 0.000)
		colorDesert    (0.278, 0.275, 0.272, 0.000)
		colorLowland   (0.292, 0.290, 0.286, 0.000)
		colorUpland    (0.307, 0.304, 0.301, 0.000)
		colorRock      (0.322, 0.319, 0.315, 0.000)
		colorSnow      (0.336, 0.333, 0.329, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0434728
		Period          0.0456175
		Eccentricity    0.188254
		Inclination     -6.17022
		AscendingNode   178.74
		ArgOfPericenter -17.5574
		MeanAnomaly     166.985
	}
}

Asteroid	"S4"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.20531e-015
	Radius          0.0719639
	InertiaMoment   0.398793

	Obliquity       -3.62827
	EqAscendNode    123.601
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.556 0.458 0.313)

	Surface
	{
		SurfStyle       0.474629
		OceanStyle      0.427897
		Randomize      (0.507, 0.215, 0.961)
		colorDistMagn   0.921463
		colorDistFreq   4.38782e-006
		detailScale     1.96509
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0597812
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.644777
		terraceProb     0.578358
		erosion         0
		montesMagn      0.446876
		montesFreq      3.75277
		montesSpiky     0.937558
		montesFraction  0.635078
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.02004e-005
		hillsFraction   0.646719
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203912
		craterFreq      0.225037
		craterDensity   0.948351
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   324.991
		volcanoTemp     1685.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.183, 0.125, 0.000)
		colorShelf     (0.236, 0.195, 0.133, 0.000)
		colorBeach     (0.250, 0.206, 0.141, 0.000)
		colorDesert    (0.264, 0.218, 0.149, 0.000)
		colorLowland   (0.278, 0.229, 0.156, 0.000)
		colorUpland    (0.292, 0.240, 0.164, 0.000)
		colorRock      (0.306, 0.252, 0.172, 0.000)
		colorSnow      (0.319, 0.263, 0.180, 1.000)
		BumpHeight      0.0647675
		BumpOffset      0.0129535
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0423521
		Period          0.0438649
		Eccentricity    0.112414
		Inclination     -3.62827
		AscendingNode   123.601
		ArgOfPericenter 140.268
		MeanAnomaly     -149.451
	}
}

Asteroid	"S5"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.77366e-012
	Radius          1.00746
	InertiaMoment   0.399756

	Obliquity       -0.268327
	EqAscendNode    -52.8199
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.603 0.601 0.597)

	Surface
	{
		SurfStyle       0.211814
		OceanStyle      0.21751
		Randomize      (0.565, 0.290, -0.286)
		colorDistMagn   0.578585
		colorDistFreq   0.00065643
		detailScale     27.5105
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00838643
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589283
		terraceProb     0.321639
		erosion         0
		montesMagn      0.603697
		montesFreq      3.06071
		montesSpiky     0.901037
		montesFraction  0.539453
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0015454
		hillsFraction   0.612418
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260865
		craterFreq      0.258458
		craterDensity   0.924467
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   118.604
		volcanoTemp     1870.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.240, 0.239, 0.000)
		colorShelf     (0.256, 0.255, 0.254, 0.000)
		colorBeach     (0.271, 0.271, 0.269, 0.000)
		colorDesert    (0.286, 0.286, 0.284, 0.000)
		colorLowland   (0.302, 0.301, 0.299, 0.000)
		colorUpland    (0.317, 0.316, 0.314, 0.000)
		colorRock      (0.332, 0.331, 0.328, 0.000)
		colorSnow      (0.347, 0.346, 0.343, 1.000)
		BumpHeight      0.906718
		BumpOffset      0.181344
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0488846
		Period          0.0543955
		Eccentricity    0.0946587
		Inclination     -0.268327
		AscendingNode   -52.8199
		ArgOfPericenter -118.752
		MeanAnomaly     -28.4575
	}
}

Asteroid	"S6"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.61005e-009
	Radius          10.5941
	InertiaMoment   0.397746

	Obliquity       -1.63809
	EqAscendNode    74.7689
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.628 0.562 0.434)

	Surface
	{
		SurfStyle       0.836602
		OceanStyle      0.794981
		Randomize      (-0.800, 0.897, -0.455)
		colorDistMagn   0.281837
		colorDistFreq   0.0438024
		detailScale     289.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0454168
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.321807
		terraceProb     0.340267
		erosion         0
		montesMagn      0.562976
		montesFreq      3.03471
		montesSpiky     0.95273
		montesFraction  0.61934
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.311839
		hillsFraction   0.47905
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247207
		craterFreq      0.251782
		craterDensity   0.896265
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.5122
		volcanoTemp     1520.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.191, 0.121, 0.000)
		colorShelf     (0.251, 0.197, 0.139, 0.000)
		colorBeach     (0.295, 0.230, 0.165, 0.000)
		colorDesert    (0.320, 0.247, 0.160, 0.000)
		colorLowland   (0.352, 0.264, 0.182, 0.000)
		colorUpland    (0.389, 0.320, 0.221, 0.000)
		colorRock      (0.421, 0.348, 0.238, 0.000)
		colorSnow      (0.458, 0.371, 0.251, 1.000)
		BumpHeight      9.5347
		BumpOffset      1.90694
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0582609
		Period          0.0707735
		Eccentricity    0.15505
		Inclination     -1.63809
		AscendingNode   74.7689
		ArgOfPericenter 5.65004
		MeanAnomaly     30.6956
	}
}

Asteroid	"S7"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.52906e-017
	Radius          0.0190988
	InertiaMoment   0.398999

	RotationPeriod  599.535
	Obliquity       -1.36274
	EqAscendNode    126.456

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.409 0.406 0.403)

	Surface
	{
		SurfStyle       0.505182
		OceanStyle      0.846714
		Randomize      (-0.307, 0.198, 0.240)
		colorDistMagn   0.961849
		colorDistFreq   2.54396e-007
		detailScale     0.521524
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0214248
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605784
		terraceProb     0.343743
		erosion         0
		montesMagn      0.570224
		montesFreq      2.7564
		montesSpiky     0.920542
		montesFraction  0.239796
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.07605e-007
		hillsFraction   0.675365
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24354
		craterFreq      0.246406
		craterDensity   0.671439
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   765.772
		volcanoTemp     1287.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.138, 0.113, 0.000)
		colorShelf     (0.164, 0.142, 0.129, 0.000)
		colorBeach     (0.192, 0.166, 0.153, 0.000)
		colorDesert    (0.209, 0.178, 0.149, 0.000)
		colorLowland   (0.229, 0.191, 0.169, 0.000)
		colorUpland    (0.254, 0.231, 0.205, 0.000)
		colorRock      (0.274, 0.252, 0.222, 0.000)
		colorSnow      (0.299, 0.268, 0.234, 1.000)
		BumpHeight      0.0171889
		BumpOffset      0.00343778
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0405116
		Period          0.0410369
		Eccentricity    0.101704
		Inclination     -1.36274
		AscendingNode   126.456
		ArgOfPericenter 53.513
		MeanAnomaly     -116.708
	}
}

Asteroid	"S8"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.25009e-014
	Radius          0.217235
	InertiaMoment   0.399933

	Obliquity       0.916969
	EqAscendNode    3.96792
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.777 0.776 0.775)

	Surface
	{
		SurfStyle       0.756371
		OceanStyle      0.780783
		Randomize      (0.886, -0.763, 0.761)
		colorDistMagn   0.437286
		colorDistFreq   2.52747e-005
		detailScale     5.93198
		colorConversion true
		snowLevel       2
		tropicLatitude  0.031983
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.311665
		terraceProb     0.494078
		erosion         0
		montesMagn      0.536882
		montesFreq      2.9212
		montesSpiky     0.907882
		montesFraction  0.505483
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.31738e-005
		hillsFraction   0.5947
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247637
		craterFreq      0.218274
		craterDensity   0.835866
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   227.058
		volcanoTemp     1579.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.264, 0.217, 0.000)
		colorShelf     (0.311, 0.272, 0.248, 0.000)
		colorBeach     (0.365, 0.318, 0.294, 0.000)
		colorDesert    (0.396, 0.341, 0.287, 0.000)
		colorLowland   (0.435, 0.365, 0.325, 0.000)
		colorUpland    (0.482, 0.442, 0.395, 0.000)
		colorRock      (0.521, 0.481, 0.426, 0.000)
		colorSnow      (0.567, 0.512, 0.449, 1.000)
		BumpHeight      0.195512
		BumpOffset      0.0391024
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0522861
		Period          0.0601706
		Eccentricity    0.0438196
		Inclination     0.916969
		AscendingNode   3.96792
		ArgOfPericenter 165.426
		MeanAnomaly     -130.203
	}
}

Asteroid	"S9"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            3.31113e-011
	Radius          2.67257
	InertiaMoment   0.398052

	Obliquity       -0.873182
	EqAscendNode    -156.935
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.512 0.437 0.382)

	Surface
	{
		SurfStyle       0.898145
		OceanStyle      0.759527
		Randomize      (-0.679, -0.526, -0.757)
		colorDistMagn   0.90589
		colorDistFreq   0.000673228
		detailScale     72.9791
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00608882
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610494
		terraceProb     0.128542
		erosion         0
		montesMagn      0.392264
		montesFreq      3.61123
		montesSpiky     0.907898
		montesFraction  0.646981
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0242561
		hillsFraction   0.586396
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.279196
		craterFreq      0.241103
		craterDensity   0.981492
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   72.8195
		volcanoTemp     1460.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.153, 0.153, 0.050)
		colorShelf     (0.205, 0.179, 0.176, 0.040)
		colorBeach     (0.235, 0.205, 0.198, 0.030)
		colorDesert    (0.266, 0.231, 0.225, 0.020)
		colorLowland   (0.297, 0.258, 0.248, 0.030)
		colorUpland    (0.327, 0.284, 0.271, 0.050)
		colorRock      (0.358, 0.310, 0.302, 0.020)
		colorSnow      (0.358, 0.310, 0.302, 1.000)
		BumpHeight      2.40532
		BumpOffset      0.481063
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0642862
		Period          0.0820317
		Eccentricity    0.0680714
		Inclination     -0.873182
		AscendingNode   -156.935
		ArgOfPericenter 24.9882
		MeanAnomaly     -136.819
	}
}

Asteroid	"S10"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            4.8725e-008
	Radius          24.6954
	InertiaMoment   0.399194

	RotationPeriod  583.84
	Obliquity       2.35682
	EqAscendNode    -134.885

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.647 0.645 0.643)

	Surface
	{
		SurfStyle       0.938801
		OceanStyle      0.226317
		Randomize      (-0.734, 0.189, -0.446)
		colorDistMagn   0.894196
		colorDistFreq   0.10131
		detailScale     674.348
		colorConversion true
		snowLevel       2
		tropicLatitude  0.031546
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35935
		terraceProb     0.244497
		erosion         0
		montesMagn      0.383487
		montesFreq      2.90288
		montesSpiky     0.943133
		montesFraction  0.586475
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.776337
		hillsFraction   0.814807
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227581
		craterFreq      0.233357
		craterDensity   1.00955
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   17.5406
		volcanoTemp     1364.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.226, 0.257, 0.050)
		colorShelf     (0.259, 0.265, 0.296, 0.040)
		colorBeach     (0.298, 0.303, 0.334, 0.030)
		colorDesert    (0.337, 0.342, 0.379, 0.020)
		colorLowland   (0.375, 0.381, 0.418, 0.030)
		colorUpland    (0.414, 0.420, 0.456, 0.050)
		colorRock      (0.453, 0.458, 0.508, 0.020)
		colorSnow      (0.453, 0.458, 0.508, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0426977
		Period          0.0444029
		Eccentricity    0.0961498
		Inclination     2.35682
		AscendingNode   -134.885
		ArgOfPericenter -165.563
		MeanAnomaly     68.165
	}
}

Asteroid	"S11"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.85449e-016
	Radius          0.0396387
	InertiaMoment   0.395964

	Obliquity       1.5255
	EqAscendNode    35.0927
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.799 0.730 0.646)

	Surface
	{
		SurfStyle       0.966395
		OceanStyle      0.652919
		Randomize      (-0.305, -0.041, -0.783)
		colorDistMagn   0.680242
		colorDistFreq   8.41143e-007
		detailScale     1.0824
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0507496
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508073
		terraceProb     0.329309
		erosion         0
		montesMagn      0.372551
		montesFreq      3.21398
		montesSpiky     0.902223
		montesFraction  0.632801
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.53585e-006
		hillsFraction   0.515131
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201379
		craterFreq      0.223258
		craterDensity   0.959606
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   367.842
		volcanoTemp     1638.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.255, 0.258, 0.050)
		colorShelf     (0.320, 0.299, 0.297, 0.040)
		colorBeach     (0.368, 0.343, 0.336, 0.030)
		colorDesert    (0.416, 0.387, 0.381, 0.020)
		colorLowland   (0.464, 0.431, 0.420, 0.030)
		colorUpland    (0.512, 0.474, 0.459, 0.050)
		colorRock      (0.560, 0.518, 0.510, 0.020)
		colorSnow      (0.560, 0.518, 0.510, 1.000)
		BumpHeight      0.0356748
		BumpOffset      0.00713496
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0286747
		Period          0.0244373
		Eccentricity    0.0550436
		Inclination     1.5255
		AscendingNode   35.0927
		ArgOfPericenter 52.4076
		MeanAnomaly     136.988
	}
}

Asteroid	"S12"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            4.20054e-013
	Radius          0.506427
	InertiaMoment   0.398318

	Obliquity       -0.422728
	EqAscendNode    -38.7241
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.629 0.626 0.622)

	Surface
	{
		SurfStyle       0.135846
		OceanStyle      0.32197
		Randomize      (-0.667, -0.858, 0.190)
		colorDistMagn   0.903729
		colorDistFreq   0.000100168
		detailScale     13.8288
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0139221
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.422183
		terraceProb     0.468331
		erosion         0
		montesMagn      0.440043
		montesFreq      3.72764
		montesSpiky     0.877951
		montesFraction  0.52127
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000670926
		hillsFraction   0.506601
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265161
		craterFreq      0.218081
		craterDensity   1.07579
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   122.51
		volcanoTemp     1665.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.250, 0.249, 0.000)
		colorShelf     (0.267, 0.266, 0.264, 0.000)
		colorBeach     (0.283, 0.281, 0.280, 0.000)
		colorDesert    (0.299, 0.297, 0.295, 0.000)
		colorLowland   (0.314, 0.313, 0.311, 0.000)
		colorUpland    (0.330, 0.328, 0.326, 0.000)
		colorRock      (0.346, 0.344, 0.342, 0.000)
		colorSnow      (0.361, 0.360, 0.358, 1.000)
		BumpHeight      0.455784
		BumpOffset      0.0911568
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0292526
		Period          0.0251798
		Eccentricity    0.0737118
		Inclination     -0.422728
		AscendingNode   -38.7241
		ArgOfPericenter -164.244
		MeanAnomaly     -116.032
	}
}

Asteroid	"S13"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            6.18131e-010
	Radius          7.08966
	InertiaMoment   0.399381

	Obliquity       2.30743
	EqAscendNode    -9.32728
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.619 0.535 0.428)

	Surface
	{
		SurfStyle       0.580621
		OceanStyle      0.622706
		Randomize      (0.882, -0.705, -0.580)
		colorDistMagn   0.418981
		colorDistFreq   0.0207546
		detailScale     193.595
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0801919
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.583083
		terraceProb     0.345696
		erosion         0
		montesMagn      0.440876
		montesFreq      2.41589
		montesSpiky     0.995537
		montesFraction  0.79546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.140059
		hillsFraction   0.635594
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231394
		craterFreq      0.226029
		craterDensity   1.0445
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   44.7086
		volcanoTemp     1734.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.182, 0.120, 0.000)
		colorShelf     (0.248, 0.187, 0.137, 0.000)
		colorBeach     (0.291, 0.219, 0.162, 0.000)
		colorDesert    (0.316, 0.236, 0.158, 0.000)
		colorLowland   (0.347, 0.252, 0.180, 0.000)
		colorUpland    (0.384, 0.305, 0.218, 0.000)
		colorRock      (0.415, 0.332, 0.235, 0.000)
		colorSnow      (0.452, 0.353, 0.248, 1.000)
		BumpHeight      6.38069
		BumpOffset      1.27614
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0540569
		Period          0.063253
		Eccentricity    0.106326
		Inclination     2.30743
		AscendingNode   -9.32728
		ArgOfPericenter 147.139
		MeanAnomaly     140.038
	}
}

Asteroid	"S14"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            3.62124e-018
	Radius          0.0103841
	InertiaMoment   0.396838

	RotationPeriod  1219.8
	Obliquity       2.10113
	EqAscendNode    147.821

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.834 0.776 0.717)

	Surface
	{
		SurfStyle       0.714535
		OceanStyle      0.20511
		Randomize      (0.803, -0.637, 0.936)
		colorDistMagn   0.678045
		colorDistFreq   8.01966e-008
		detailScale     0.283554
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0203199
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48914
		terraceProb     0.565606
		erosion         0
		montesMagn      0.563292
		montesFreq      3.28115
		montesSpiky     0.969771
		montesFraction  0.211436
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.8817e-007
		hillsFraction   0.644673
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206242
		craterFreq      0.272049
		craterDensity   0.928205
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   855.549
		volcanoTemp     1580.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.325, 0.264, 0.201, 0.000)
		colorShelf     (0.334, 0.272, 0.229, 0.000)
		colorBeach     (0.392, 0.318, 0.272, 0.000)
		colorDesert    (0.425, 0.342, 0.265, 0.000)
		colorLowland   (0.467, 0.365, 0.301, 0.000)
		colorUpland    (0.517, 0.442, 0.366, 0.000)
		colorRock      (0.559, 0.481, 0.394, 0.000)
		colorSnow      (0.609, 0.512, 0.416, 1.000)
		BumpHeight      0.00934566
		BumpOffset      0.00186913
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0439589
		Period          0.0463847
		Eccentricity    0.102339
		Inclination     2.10113
		AscendingNode   147.821
		ArgOfPericenter -149.499
		MeanAnomaly     -44.0986
	}
}

Asteroid	"S15"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            5.32883e-015
	Radius          0.134403
	InertiaMoment   0.398557

	Obliquity       -1.21659
	EqAscendNode    -81.481
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.714 0.630 0.570)

	Surface
	{
		SurfStyle       0.25247
		OceanStyle      0.910014
		Randomize      (0.589, 0.698, -0.390)
		colorDistMagn   0.29757
		colorDistFreq   1.09332e-005
		detailScale     3.67009
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0321687
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.719996
		terraceProb     0.243243
		erosion         0
		montesMagn      0.379492
		montesFreq      2.55777
		montesSpiky     0.970385
		montesFraction  0.38542
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.22641e-005
		hillsFraction   0.614662
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240487
		craterFreq      0.251135
		craterDensity   0.972795
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   288.668
		volcanoTemp     1828.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.252, 0.228, 0.000)
		colorShelf     (0.303, 0.268, 0.242, 0.000)
		colorBeach     (0.321, 0.283, 0.256, 0.000)
		colorDesert    (0.339, 0.299, 0.271, 0.000)
		colorLowland   (0.357, 0.315, 0.285, 0.000)
		colorUpland    (0.375, 0.331, 0.299, 0.000)
		colorRock      (0.393, 0.346, 0.313, 0.000)
		colorSnow      (0.411, 0.362, 0.328, 1.000)
		BumpHeight      0.120962
		BumpOffset      0.0241925
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0349031
		Period          0.0328172
		Eccentricity    0.000831091
		Inclination     -1.21659
		AscendingNode   -81.481
		ArgOfPericenter -9.43912
		MeanAnomaly     -40.1441
	}
}

Asteroid	"S16"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            7.84167e-012
	Radius          1.34344
	InertiaMoment   0.399564

	RotationPeriod  665.186
	Obliquity       0.00590567
	EqAscendNode    -124.284

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.536 0.454 0.349)

	Surface
	{
		SurfStyle       0.415207
		OceanStyle      0.148281
		Randomize      (-0.164, -0.443, 0.141)
		colorDistMagn   0.759165
		colorDistFreq   0.000830864
		detailScale     36.6848
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436848
		terraceProb     0.232387
		erosion         0
		montesMagn      0.515237
		montesFreq      3.34082
		montesSpiky     0.997354
		montesFraction  0.751935
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00393245
		hillsFraction   0.495834
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244171
		craterFreq      0.221309
		craterDensity   0.860206
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   75.2174
		volcanoTemp     1357.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.181, 0.140, 0.000)
		colorShelf     (0.228, 0.193, 0.148, 0.000)
		colorBeach     (0.241, 0.204, 0.157, 0.000)
		colorDesert    (0.254, 0.215, 0.166, 0.000)
		colorLowland   (0.268, 0.227, 0.174, 0.000)
		colorUpland    (0.281, 0.238, 0.183, 0.000)
		colorRock      (0.295, 0.250, 0.192, 0.000)
		colorSnow      (0.308, 0.261, 0.201, 1.000)
		BumpHeight      1.20909
		BumpOffset      0.241818
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0465769
		Period          0.0505895
		Eccentricity    0.115065
		Inclination     0.00590567
		AscendingNode   -124.284
		ArgOfPericenter 62.0236
		MeanAnomaly     98.7265
	}
}

Asteroid	"S17"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.15394e-008
	Radius          17.3872
	InertiaMoment   0.397344

	RotationPeriod  662.77
	Obliquity       0.0854135
	EqAscendNode    -89.361

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.813 0.737 0.696)

	Surface
	{
		SurfStyle       0.970022
		OceanStyle      0.2849
		Randomize      (-0.108, 0.951, 0.342)
		colorDistMagn   0.302202
		colorDistFreq   0.0849018
		detailScale     474.787
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00212837
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.694401
		terraceProb     0.292433
		erosion         0
		montesMagn      0.385455
		montesFreq      3.56905
		montesSpiky     0.90036
		montesFraction  0.422063
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.425391
		hillsFraction   0.822007
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244252
		craterFreq      0.213599
		craterDensity   0.824319
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.3772
		volcanoTemp     1422.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.258, 0.278, 0.050)
		colorShelf     (0.325, 0.302, 0.320, 0.040)
		colorBeach     (0.374, 0.346, 0.362, 0.030)
		colorDesert    (0.423, 0.391, 0.410, 0.020)
		colorLowland   (0.471, 0.435, 0.452, 0.030)
		colorUpland    (0.520, 0.479, 0.494, 0.050)
		colorRock      (0.569, 0.523, 0.550, 0.020)
		colorSnow      (0.569, 0.523, 0.550, 1.000)
		BumpHeight      15.6485
		BumpOffset      3.1297
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0383552
		Period          0.0378043
		Eccentricity    0.0942549
		Inclination     0.0854135
		AscendingNode   -89.361
		ArgOfPericenter 133.278
		MeanAnomaly     -104.796
	}
}

Asteroid	"S18"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            6.76021e-017
	Radius          0.0245243
	InertiaMoment   0.398777

	Obliquity       -0.897321
	EqAscendNode    99.172
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.449 0.405 0.360)

	Surface
	{
		SurfStyle       0.13608
		OceanStyle      0.394263
		Randomize      (0.089, -0.179, 0.632)
		colorDistMagn   0.927822
		colorDistFreq   2.44259e-007
		detailScale     0.669677
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0203052
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.421199
		terraceProb     0.14794
		erosion         0
		montesMagn      0.622051
		montesFreq      2.92833
		montesSpiky     0.926493
		montesFraction  0.525015
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.07093e-007
		hillsFraction   0.691538
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245107
		craterFreq      0.151275
		craterDensity   0.966293
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   467.652
		volcanoTemp     1761.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.162, 0.144, 0.000)
		colorShelf     (0.191, 0.172, 0.153, 0.000)
		colorBeach     (0.202, 0.182, 0.162, 0.000)
		colorDesert    (0.213, 0.193, 0.171, 0.000)
		colorLowland   (0.224, 0.203, 0.180, 0.000)
		colorUpland    (0.236, 0.213, 0.189, 0.000)
		colorRock      (0.247, 0.223, 0.198, 0.000)
		colorSnow      (0.258, 0.233, 0.207, 1.000)
		BumpHeight      0.0220719
		BumpOffset      0.00441437
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0281517
		Period          0.0237717
		Eccentricity    0.0374874
		Inclination     -0.897321
		AscendingNode   99.172
		ArgOfPericenter -101.579
		MeanAnomaly     -114.378
	}
}

Asteroid	"S19"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            9.94801e-014
	Radius          0.385643
	InertiaMoment   0.399743

	Obliquity       -2.54277
	EqAscendNode    105.508
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.548 0.540 0.536)

	Surface
	{
		SurfStyle       0.379834
		OceanStyle      0.64636
		Randomize      (-0.152, 0.565, 0.996)
		colorDistMagn   0.660411
		colorDistFreq   0.000109855
		detailScale     10.5306
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0536838
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.602188
		terraceProb     0.408121
		erosion         0
		montesMagn      0.556013
		montesFreq      3.49296
		montesSpiky     0.805355
		montesFraction  0.674379
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000295457
		hillsFraction   0.536242
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262965
		craterFreq      0.234295
		craterDensity   1.01192
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   191.701
		volcanoTemp     1450.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.216, 0.214, 0.000)
		colorShelf     (0.233, 0.230, 0.228, 0.000)
		colorBeach     (0.246, 0.243, 0.241, 0.000)
		colorDesert    (0.260, 0.257, 0.255, 0.000)
		colorLowland   (0.274, 0.270, 0.268, 0.000)
		colorUpland    (0.288, 0.284, 0.282, 0.000)
		colorRock      (0.301, 0.297, 0.295, 0.000)
		colorSnow      (0.315, 0.311, 0.308, 1.000)
		BumpHeight      0.347079
		BumpOffset      0.0694158
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0483555
		Period          0.0535148
		Eccentricity    0.086816
		Inclination     -2.54277
		AscendingNode   105.508
		ArgOfPericenter -41.3631
		MeanAnomaly     -50.9699
	}
}

Asteroid	"S20"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.4639e-010
	Radius          4.05537
	InertiaMoment   0.39772

	RotationPeriod  651.739
	Obliquity       -1.18508
	EqAscendNode    -51.6593

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.695 0.691 0.688)

	Surface
	{
		SurfStyle       0.858511
		OceanStyle      0.812444
		Randomize      (-0.678, 0.913, 0.977)
		colorDistMagn   0.297272
		colorDistFreq   0.013222
		detailScale     110.739
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0372248
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.418703
		terraceProb     0.110583
		erosion         0
		montesMagn      0.44294
		montesFreq      2.98068
		montesSpiky     0.851141
		montesFraction  0.919424
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0373768
		hillsFraction   0.609241
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234764
		craterFreq      0.279141
		craterDensity   0.883947
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   52.5509
		volcanoTemp     1482.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.242, 0.275, 0.050)
		colorShelf     (0.278, 0.283, 0.316, 0.040)
		colorBeach     (0.320, 0.325, 0.358, 0.030)
		colorDesert    (0.361, 0.366, 0.406, 0.020)
		colorLowland   (0.403, 0.407, 0.447, 0.030)
		colorUpland    (0.445, 0.449, 0.488, 0.050)
		colorRock      (0.486, 0.490, 0.543, 0.020)
		colorSnow      (0.486, 0.490, 0.543, 1.000)
		BumpHeight      3.64983
		BumpOffset      0.729966
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0289448
		Period          0.0247834
		Eccentricity    0.0638624
		Inclination     -1.18508
		AscendingNode   -51.6593
		ArgOfPericenter 117.111
		MeanAnomaly     -162.546
	}
}

Asteroid	"S21"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.15421e-007
	Radius          46.1179
	InertiaMoment   0.398983

	Obliquity       2.45025
	EqAscendNode    110.328
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.785 0.783 0.779)

	Surface
	{
		SurfStyle       0.0720286
		OceanStyle      0.610333
		Randomize      (-0.068, 0.781, -0.905)
		colorDistMagn   0.357354
		colorDistFreq   0.554583
		detailScale     1259.33
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0488282
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52875
		terraceProb     0.170406
		erosion         0
		montesMagn      0.434099
		montesFreq      3.65324
		montesSpiky     0.95515
		montesFraction  0.667258
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.32139
		hillsFraction   0.637204
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275145
		craterFreq      0.221983
		craterDensity   0.854946
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   15.5787
		volcanoTemp     1665.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.313, 0.312, 0.000)
		colorShelf     (0.334, 0.333, 0.331, 0.000)
		colorBeach     (0.353, 0.352, 0.351, 0.000)
		colorDesert    (0.373, 0.372, 0.370, 0.000)
		colorLowland   (0.393, 0.392, 0.389, 0.000)
		colorUpland    (0.412, 0.411, 0.409, 0.000)
		colorRock      (0.432, 0.431, 0.428, 0.000)
		colorSnow      (0.451, 0.450, 0.448, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0397377
		Period          0.0398665
		Eccentricity    0.0436194
		Inclination     2.45025
		AscendingNode   110.328
		ArgOfPericenter -69.7751
		MeanAnomaly     46.65
	}
}

Asteroid	"S22"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.26202e-015
	Radius          0.0730752
	InertiaMoment   0.399919

	RotationPeriod  601.902
	Obliquity       -3.00118
	EqAscendNode    110.11

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.672 0.577 0.504)

	Surface
	{
		SurfStyle       0.175977
		OceanStyle      0.583148
		Randomize      (-0.409, -0.010, -0.450)
		colorDistMagn   0.838094
		colorDistFreq   1.02732e-006
		detailScale     1.99544
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0599512
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.762927
		terraceProb     0.552325
		erosion         0
		montesMagn      0.405637
		montesFreq      4.12319
		montesSpiky     0.942459
		montesFraction  0.497195
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.48869e-005
		hillsFraction   0.512933
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231906
		craterFreq      0.239503
		craterDensity   1.01982
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   322.51
		volcanoTemp     1500.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.231, 0.201, 0.000)
		colorShelf     (0.285, 0.245, 0.214, 0.000)
		colorBeach     (0.302, 0.259, 0.227, 0.000)
		colorDesert    (0.319, 0.274, 0.239, 0.000)
		colorLowland   (0.336, 0.288, 0.252, 0.000)
		colorUpland    (0.353, 0.303, 0.264, 0.000)
		colorRock      (0.369, 0.317, 0.277, 0.000)
		colorSnow      (0.386, 0.332, 0.290, 1.000)
		BumpHeight      0.0657677
		BumpOffset      0.0131535
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0435738
		Period          0.0457765
		Eccentricity    0.198267
		Inclination     -3.00118
		AscendingNode   110.11
		ArgOfPericenter -135.442
		MeanAnomaly     -126.388
	}
}

Asteroid	"S23"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.85712e-012
	Radius          1.02303
	InertiaMoment   0.39803

	RotationPeriod  1324.84
	Obliquity       -0.44272
	EqAscendNode    36.049

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.777 0.734 0.707)

	Surface
	{
		SurfStyle       0.788377
		OceanStyle      0.182484
		Randomize      (-0.765, 0.989, -0.531)
		colorDistMagn   0.586646
		colorDistFreq   0.000855168
		detailScale     27.9354
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0146968
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565269
		terraceProb     0.187567
		erosion         0
		montesMagn      0.452896
		montesFreq      3.21152
		montesSpiky     0.924636
		montesFraction  0.375873
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00263189
		hillsFraction   0.728073
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247362
		craterFreq      0.276432
		craterDensity   0.833273
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   117.699
		volcanoTemp     1805.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.249, 0.198, 0.000)
		colorShelf     (0.311, 0.257, 0.226, 0.000)
		colorBeach     (0.365, 0.301, 0.269, 0.000)
		colorDesert    (0.396, 0.323, 0.262, 0.000)
		colorLowland   (0.435, 0.345, 0.297, 0.000)
		colorUpland    (0.482, 0.418, 0.360, 0.000)
		colorRock      (0.521, 0.455, 0.389, 0.000)
		colorSnow      (0.567, 0.484, 0.410, 1.000)
		BumpHeight      0.920723
		BumpOffset      0.184145
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0608637
		Period          0.0755687
		Eccentricity    0.080018
		Inclination     -0.44272
		AscendingNode   36.049
		ArgOfPericenter -74.2355
		MeanAnomaly     21.4629
	}
}

Asteroid	"S24"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.73285e-009
	Radius          8.41651
	InertiaMoment   0.399179

	RotationPeriod  660.033
	Obliquity       -2.79131
	EqAscendNode    80.8882

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.528 0.523 0.521)

	Surface
	{
		SurfStyle       0.621222
		OceanStyle      0.125401
		Randomize      (-0.484, -0.787, -0.485)
		colorDistMagn   0.794954
		colorDistFreq   0.0409247
		detailScale     229.827
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0740722
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496786
		terraceProb     0.306367
		erosion         0
		montesMagn      0.331598
		montesFreq      3.18987
		montesSpiky     0.997942
		montesFraction  0.769241
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.162983
		hillsFraction   0.450697
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248329
		craterFreq      0.227358
		craterDensity   0.983285
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.2423
		volcanoTemp     1516.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.178, 0.146, 0.000)
		colorShelf     (0.211, 0.183, 0.167, 0.000)
		colorBeach     (0.248, 0.215, 0.198, 0.000)
		colorDesert    (0.269, 0.230, 0.193, 0.000)
		colorLowland   (0.295, 0.246, 0.219, 0.000)
		colorUpland    (0.327, 0.298, 0.266, 0.000)
		colorRock      (0.353, 0.324, 0.287, 0.000)
		colorSnow      (0.385, 0.345, 0.302, 1.000)
		BumpHeight      7.57486
		BumpOffset      1.51497
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0329624
		Period          0.0301186
		Eccentricity    0.177964
		Inclination     -2.79131
		AscendingNode   80.8882
		ArgOfPericenter -114.096
		MeanAnomaly     174.603
	}
}

Asteroid	"S25"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.60101e-017
	Radius          0.0193938
	InertiaMoment   0.395853

	Obliquity       0.844193
	EqAscendNode    -18.9735
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.638 0.509 0.462)

	Surface
	{
		SurfStyle       0.663349
		OceanStyle      0.88311
		Randomize      (-0.996, 0.431, 0.095)
		colorDistMagn   0.860058
		colorDistFreq   9.50388e-008
		detailScale     0.529579
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0290609
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.433931
		terraceProb     0.152753
		erosion         0
		montesMagn      0.537951
		montesFreq      3.21867
		montesSpiky     0.902954
		montesFraction  0.486746
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.7112e-007
		hillsFraction   0.906122
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204414
		craterFreq      0.184482
		craterDensity   0.942335
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   759.926
		volcanoTemp     1766.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.173, 0.129, 0.000)
		colorShelf     (0.255, 0.178, 0.148, 0.000)
		colorBeach     (0.300, 0.209, 0.176, 0.000)
		colorDesert    (0.325, 0.224, 0.171, 0.000)
		colorLowland   (0.357, 0.239, 0.194, 0.000)
		colorUpland    (0.396, 0.290, 0.236, 0.000)
		colorRock      (0.428, 0.316, 0.254, 0.000)
		colorSnow      (0.466, 0.336, 0.268, 1.000)
		BumpHeight      0.0174544
		BumpOffset      0.00349088
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0395605
		Period          0.0396003
		Eccentricity    0.072869
		Inclination     0.844193
		AscendingNode   -18.9735
		ArgOfPericenter 58.4253
		MeanAnomaly     101.169
	}
}

Asteroid	"S26"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.35596e-014
	Radius          0.193853
	InertiaMoment   0.398298

	Obliquity       3.3912
	EqAscendNode    127.011
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.666 0.661 0.657)

	Surface
	{
		SurfStyle       0.9128
		OceanStyle      0.0314153
		Randomize      (-0.543, 0.784, -0.016)
		colorDistMagn   0.550061
		colorDistFreq   2.48417e-005
		detailScale     5.29347
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0527601
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.705775
		terraceProb     0.306199
		erosion         0
		montesMagn      0.466295
		montesFreq      2.22798
		montesSpiky     0.888602
		montesFraction  0.644224
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.28051e-005
		hillsFraction   0.730707
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233331
		craterFreq      0.203587
		craterDensity   0.957631
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   198.013
		volcanoTemp     1557.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.231, 0.263, 0.050)
		colorShelf     (0.267, 0.271, 0.302, 0.040)
		colorBeach     (0.307, 0.310, 0.342, 0.030)
		colorDesert    (0.347, 0.350, 0.388, 0.020)
		colorLowland   (0.386, 0.390, 0.427, 0.030)
		colorUpland    (0.426, 0.429, 0.467, 0.050)
		colorRock      (0.466, 0.469, 0.519, 0.020)
		colorSnow      (0.466, 0.469, 0.519, 1.000)
		BumpHeight      0.174467
		BumpOffset      0.0348935
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.033854
		Period          0.0313487
		Eccentricity    0.0434332
		Inclination     3.3912
		AscendingNode   127.011
		ArgOfPericenter -84.519
		MeanAnomaly     -24.4983
	}
}

Asteroid	"S27"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            3.46693e-011
	Radius          1.96301
	InertiaMoment   0.399367

	RotationPeriod  408.165
	Obliquity       0.0108751
	EqAscendNode    -168.855

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.582 0.478 0.332)

	Surface
	{
		SurfStyle       0.687224
		OceanStyle      0.219759
		Randomize      (0.997, -0.295, 0.620)
		colorDistMagn   0.837824
		colorDistFreq   0.00188158
		detailScale     53.6031
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.585994
		terraceProb     0.44858
		erosion         0
		montesMagn      0.355926
		montesFreq      3.62647
		montesSpiky     0.803964
		montesFraction  0.4714
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00800392
		hillsFraction   0.927851
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221658
		craterFreq      0.264972
		craterDensity   0.805778
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   52.2703
		volcanoTemp     1774.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.163, 0.093, 0.000)
		colorShelf     (0.233, 0.167, 0.106, 0.000)
		colorBeach     (0.273, 0.196, 0.126, 0.000)
		colorDesert    (0.297, 0.211, 0.123, 0.000)
		colorLowland   (0.326, 0.225, 0.139, 0.000)
		colorUpland    (0.361, 0.273, 0.169, 0.000)
		colorRock      (0.390, 0.297, 0.183, 0.000)
		colorSnow      (0.425, 0.316, 0.192, 1.000)
		BumpHeight      1.76671
		BumpOffset      0.353341
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.033633
		Period          0.0310422
		Eccentricity    0.18447
		Inclination     0.0108751
		AscendingNode   -168.855
		ArgOfPericenter 153.657
		MeanAnomaly     -139.704
	}
}

Asteroid	"S28"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            5.10177e-008
	Radius          25.0767
	InertiaMoment   0.396789

	RotationPeriod  778.914
	Obliquity       -1.55832
	EqAscendNode    123.61

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.685 0.682 0.677)

	Surface
	{
		SurfStyle       0.676783
		OceanStyle      0.920528
		Randomize      (0.682, 0.407, -0.164)
		colorDistMagn   0.825735
		colorDistFreq   0.219713
		detailScale     684.761
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0256942
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600795
		terraceProb     0.22491
		erosion         0
		montesMagn      0.395876
		montesFreq      3.01105
		montesSpiky     0.889245
		montesFraction  0.590055
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.868017
		hillsFraction   0.598735
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265694
		craterFreq      0.21547
		craterDensity   0.775792
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   17.4067
		volcanoTemp     1480.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.232, 0.190, 0.000)
		colorShelf     (0.274, 0.239, 0.217, 0.000)
		colorBeach     (0.322, 0.279, 0.257, 0.000)
		colorDesert    (0.350, 0.300, 0.250, 0.000)
		colorLowland   (0.384, 0.320, 0.284, 0.000)
		colorUpland    (0.425, 0.388, 0.345, 0.000)
		colorRock      (0.459, 0.423, 0.372, 0.000)
		colorSnow      (0.500, 0.450, 0.393, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0427145
		Period          0.0444291
		Eccentricity    0.164326
		Inclination     -1.55832
		AscendingNode   123.61
		ArgOfPericenter -47.2751
		MeanAnomaly     -35.7432
	}
}

Asteroid	"S29"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.9888e-016
	Radius          0.0514474
	InertiaMoment   0.398539

	RotationPeriod  1131.88
	Obliquity       5.7772
	EqAscendNode    -71.6986

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.416 0.412 0.406)

	Surface
	{
		SurfStyle       0.511021
		OceanStyle      0.00185738
		Randomize      (-0.081, -0.067, 0.245)
		colorDistMagn   0.967896
		colorDistFreq   1.78128e-006
		detailScale     1.40486
		colorConversion true
		snowLevel       2
		tropicLatitude  0.162639
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.375222
		terraceProb     0.32867
		erosion         0
		montesMagn      0.411526
		montesFreq      2.90999
		montesSpiky     0.997687
		montesFraction  0.75338
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.30629e-006
		hillsFraction   0.895178
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257194
		craterFreq      0.265194
		craterDensity   1.01666
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   466.574
		volcanoTemp     1592.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.140, 0.114, 0.000)
		colorShelf     (0.166, 0.144, 0.130, 0.000)
		colorBeach     (0.196, 0.169, 0.154, 0.000)
		colorDesert    (0.212, 0.181, 0.150, 0.000)
		colorLowland   (0.233, 0.194, 0.171, 0.000)
		colorUpland    (0.258, 0.235, 0.207, 0.000)
		colorRock      (0.279, 0.256, 0.223, 0.000)
		colorSnow      (0.304, 0.272, 0.236, 1.000)
		BumpHeight      0.0463027
		BumpOffset      0.00926053
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.034522
		Period          0.0322811
		Eccentricity    0.072311
		Inclination     5.7772
		AscendingNode   -71.6986
		ArgOfPericenter 137.651
		MeanAnomaly     -97.5956
	}
}

Asteroid	"S30"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            4.39818e-013
	Radius          0.457825
	InertiaMoment   0.39955

	RotationPeriod  1161.5
	Obliquity       -1.77656
	EqAscendNode    -6.09195

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.816 0.773 0.702)

	Surface
	{
		SurfStyle       0.95432
		OceanStyle      0.438785
		Randomize      (0.959, -0.323, 0.089)
		colorDistMagn   0.83023
		colorDistFreq   0.000101406
		detailScale     12.5017
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0618868
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.525077
		terraceProb     0.497182
		erosion         0
		montesMagn      0.581384
		montesFreq      3.40271
		montesSpiky     0.889603
		montesFraction  0.474769
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00035504
		hillsFraction   0.517985
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222553
		craterFreq      0.16055
		craterDensity   0.819726
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   108.235
		volcanoTemp     1670.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.270, 0.281, 0.050)
		colorShelf     (0.326, 0.317, 0.323, 0.040)
		colorBeach     (0.375, 0.363, 0.365, 0.030)
		colorDesert    (0.424, 0.409, 0.414, 0.020)
		colorLowland   (0.473, 0.456, 0.456, 0.030)
		colorUpland    (0.522, 0.502, 0.498, 0.050)
		colorRock      (0.571, 0.549, 0.555, 0.020)
		colorSnow      (0.571, 0.549, 0.555, 1.000)
		BumpHeight      0.412043
		BumpOffset      0.0824086
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.030267
		Period          0.0265008
		Eccentricity    0.104756
		Inclination     -1.77656
		AscendingNode   -6.09195
		ArgOfPericenter 101.118
		MeanAnomaly     -87.8103
	}
}

Asteroid	"S31"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            6.47215e-010
	Radius          5.8491
	InertiaMoment   0.39731

	Obliquity       -0.70123
	EqAscendNode    17.9522
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.662 0.656 0.654)

	Surface
	{
		SurfStyle       0.0577148
		OceanStyle      0.973035
		Randomize      (0.503, 0.386, -0.530)
		colorDistMagn   0.665391
		colorDistFreq   0.0181064
		detailScale     159.719
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0241743
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.722746
		terraceProb     0.205608
		erosion         0
		montesMagn      0.34472
		montesFreq      3.11372
		montesSpiky     0.956521
		montesFraction  0.512049
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0809824
		hillsFraction   0.577408
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221129
		craterFreq      0.15513
		craterDensity   0.984581
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   36.0471
		volcanoTemp     1350.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.262, 0.261, 0.000)
		colorShelf     (0.281, 0.279, 0.278, 0.000)
		colorBeach     (0.298, 0.295, 0.294, 0.000)
		colorDesert    (0.314, 0.312, 0.310, 0.000)
		colorLowland   (0.331, 0.328, 0.327, 0.000)
		colorUpland    (0.347, 0.344, 0.343, 0.000)
		colorRock      (0.364, 0.361, 0.359, 0.000)
		colorSnow      (0.381, 0.377, 0.376, 1.000)
		BumpHeight      5.26419
		BumpOffset      1.05284
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0295297
		Period          0.0255384
		Eccentricity    0.0824048
		Inclination     -0.70123
		AscendingNode   17.9522
		ArgOfPericenter 14.9863
		MeanAnomaly     0.0267764
	}
}

Asteroid	"S32"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            3.79162e-018
	Radius          0.0105444
	InertiaMoment   0.39876

	Obliquity       -0.712035
	EqAscendNode    130.483
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.485 0.373 0.325)

	Surface
	{
		SurfStyle       0.193393
		OceanStyle      0.170397
		Randomize      (-0.454, 0.033, -0.510)
		colorDistMagn   0.649376
		colorDistFreq   2.35165e-008
		detailScale     0.287933
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0104095
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.274367
		terraceProb     0.251984
		erosion         0
		montesMagn      0.562999
		montesFreq      3.73781
		montesSpiky     0.923183
		montesFraction  0.418596
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.40377e-007
		hillsFraction   0.415571
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224211
		craterFreq      0.198536
		craterDensity   0.862407
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   849.017
		volcanoTemp     1869.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.149, 0.130, 0.000)
		colorShelf     (0.206, 0.158, 0.138, 0.000)
		colorBeach     (0.218, 0.168, 0.146, 0.000)
		colorDesert    (0.231, 0.177, 0.154, 0.000)
		colorLowland   (0.243, 0.186, 0.163, 0.000)
		colorUpland    (0.255, 0.196, 0.171, 0.000)
		colorRock      (0.267, 0.205, 0.179, 0.000)
		colorSnow      (0.279, 0.214, 0.187, 1.000)
		BumpHeight      0.00948999
		BumpOffset      0.001898
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0354185
		Period          0.0335467
		Eccentricity    0.138066
		Inclination     -0.712035
		AscendingNode   130.483
		ArgOfPericenter -96.8261
		MeanAnomaly     108.243
	}
}

Asteroid	"S33"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            5.57958e-015
	Radius          0.147618
	InertiaMoment   0.399729

	Obliquity       -2.78069
	EqAscendNode    102.399
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.455 0.450 0.443)

	Surface
	{
		SurfStyle       0.225503
		OceanStyle      0.41362
		Randomize      (0.273, 0.213, -0.197)
		colorDistMagn   0.801165
		colorDistFreq   8.34527e-006
		detailScale     4.03097
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0607693
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.712317
		terraceProb     0.243663
		erosion         0
		montesMagn      0.598956
		montesFreq      3.76046
		montesSpiky     0.960637
		montesFraction  0.463047
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.20178e-005
		hillsFraction   0.503621
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2111
		craterFreq      0.228403
		craterDensity   0.894578
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   309.846
		volcanoTemp     1028.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.180, 0.177, 0.000)
		colorShelf     (0.193, 0.191, 0.188, 0.000)
		colorBeach     (0.205, 0.202, 0.199, 0.000)
		colorDesert    (0.216, 0.214, 0.210, 0.000)
		colorLowland   (0.227, 0.225, 0.221, 0.000)
		colorUpland    (0.239, 0.236, 0.232, 0.000)
		colorRock      (0.250, 0.247, 0.243, 0.000)
		colorSnow      (0.261, 0.259, 0.255, 1.000)
		BumpHeight      0.132857
		BumpOffset      0.0265713
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.064927
		Period          0.0832614
		Eccentricity    0.0266017
		Inclination     -2.78069
		AscendingNode   102.399
		ArgOfPericenter 100.394
		MeanAnomaly     -145.133
	}
}

Asteroid	"S34"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            8.21063e-012
	Radius          1.36418
	InertiaMoment   0.397694

	RotationPeriod  1056.67
	Obliquity       5.38927
	EqAscendNode    -99.4616

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.584 0.580 0.573)

	Surface
	{
		SurfStyle       0.256166
		OceanStyle      0.556431
		Randomize      (-0.544, -0.684, 0.186)
		colorDistMagn   0.400194
		colorDistFreq   0.000768853
		detailScale     37.2513
		colorConversion true
		snowLevel       2
		tropicLatitude  0.121195
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.740546
		terraceProb     0.35026
		erosion         0
		montesMagn      0.579518
		montesFreq      3.50836
		montesSpiky     0.943436
		montesFraction  0.473297
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00389914
		hillsFraction   0.381892
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227352
		craterFreq      0.245159
		craterDensity   0.89272
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   74.6432
		volcanoTemp     1618.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.232, 0.229, 0.000)
		colorShelf     (0.248, 0.246, 0.244, 0.000)
		colorBeach     (0.263, 0.261, 0.258, 0.000)
		colorDesert    (0.277, 0.275, 0.272, 0.000)
		colorLowland   (0.292, 0.290, 0.287, 0.000)
		colorUpland    (0.307, 0.304, 0.301, 0.000)
		colorRock      (0.321, 0.319, 0.315, 0.000)
		colorSnow      (0.336, 0.333, 0.330, 1.000)
		BumpHeight      1.22776
		BumpOffset      0.245553
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0329752
		Period          0.0301361
		Eccentricity    0.121944
		Inclination     5.38927
		AscendingNode   -99.4616
		ArgOfPericenter -75.4904
		MeanAnomaly     36.2604
	}
}

Asteroid	"S35"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.20824e-008
	Radius          17.6557
	InertiaMoment   0.398968

	RotationPeriod  1209.73
	Obliquity       1.71274
	EqAscendNode    -77.8475

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.635 0.588 0.514)

	Surface
	{
		SurfStyle       0.829256
		OceanStyle      0.0503396
		Randomize      (0.207, 0.667, 0.495)
		colorDistMagn   0.752236
		colorDistFreq   0.104876
		detailScale     482.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0464935
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.388736
		terraceProb     0.615753
		erosion         0
		montesMagn      0.419471
		montesFreq      3.5205
		montesSpiky     0.976904
		montesFraction  0.698227
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.650437
		hillsFraction   0.844518
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237043
		craterFreq      0.247177
		craterDensity   0.830536
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.1835
		volcanoTemp     1607.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.200, 0.144, 0.000)
		colorShelf     (0.254, 0.206, 0.165, 0.000)
		colorBeach     (0.298, 0.241, 0.195, 0.000)
		colorDesert    (0.324, 0.259, 0.190, 0.000)
		colorLowland   (0.355, 0.276, 0.216, 0.000)
		colorUpland    (0.393, 0.335, 0.262, 0.000)
		colorRock      (0.425, 0.364, 0.283, 0.000)
		colorSnow      (0.463, 0.388, 0.298, 1.000)
		BumpHeight      15.8902
		BumpOffset      3.17803
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0310991
		Period          0.0276011
		Eccentricity    0.128711
		Inclination     1.71274
		AscendingNode   -77.8475
		ArgOfPericenter -64.604
		MeanAnomaly     147.332
	}
}

Asteroid	"S36"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            7.07832e-017
	Radius          0.0318304
	InertiaMoment   0.399906

	RotationPeriod  3304.36
	Obliquity       -3.29014
	EqAscendNode    -148.818

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.690 0.687 0.683)

	Surface
	{
		SurfStyle       0.564091
		OceanStyle      0.0966967
		Randomize      (0.167, 0.261, -0.899)
		colorDistMagn   0.394735
		colorDistFreq   8.12752e-008
		detailScale     0.869181
		colorConversion true
		snowLevel       2
		tropicLatitude  0.030847
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.456715
		terraceProb     0.181278
		erosion         0
		montesMagn      0.442457
		montesFreq      2.71816
		montesSpiky     0.927713
		montesFraction  0.189309
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.75556e-006
		hillsFraction   0.646355
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238375
		craterFreq      0.236152
		craterDensity   1.07001
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   593.174
		volcanoTemp     1651.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.234, 0.191, 0.000)
		colorShelf     (0.276, 0.240, 0.219, 0.000)
		colorBeach     (0.324, 0.282, 0.260, 0.000)
		colorDesert    (0.352, 0.302, 0.253, 0.000)
		colorLowland   (0.386, 0.323, 0.287, 0.000)
		colorUpland    (0.428, 0.392, 0.348, 0.000)
		colorRock      (0.462, 0.426, 0.376, 0.000)
		colorSnow      (0.503, 0.453, 0.396, 1.000)
		BumpHeight      0.0286473
		BumpOffset      0.00572946
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0538137
		Period          0.0628268
		Eccentricity    0.0643583
		Inclination     -3.29014
		AscendingNode   -148.818
		ArgOfPericenter -12.7385
		MeanAnomaly     38.2067
	}
}

Asteroid	"S37"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.04161e-013
	Radius          0.391599
	InertiaMoment   0.398008

	Obliquity       3.20781
	EqAscendNode    65.558
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.794 0.791 0.790)

	Surface
	{
		SurfStyle       0.888171
		OceanStyle      0.615145
		Randomize      (-0.862, 0.077, 0.365)
		colorDistMagn   0.711151
		colorDistFreq   9.22576e-005
		detailScale     10.6933
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0939904
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49766
		terraceProb     0.325494
		erosion         0
		montesMagn      0.630702
		montesFreq      3.23316
		montesSpiky     0.892382
		montesFraction  0.593353
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000449636
		hillsFraction   0.486261
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220718
		craterFreq      0.215872
		craterDensity   0.936437
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   190.237
		volcanoTemp     1275.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.277, 0.316, 0.050)
		colorShelf     (0.317, 0.324, 0.363, 0.040)
		colorBeach     (0.365, 0.372, 0.411, 0.030)
		colorDesert    (0.413, 0.419, 0.466, 0.020)
		colorLowland   (0.460, 0.467, 0.513, 0.030)
		colorUpland    (0.508, 0.514, 0.561, 0.050)
		colorRock      (0.556, 0.562, 0.624, 0.020)
		colorSnow      (0.556, 0.562, 0.624, 1.000)
		BumpHeight      0.352439
		BumpOffset      0.0704878
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0493346
		Period          0.0551484
		Eccentricity    0.0687284
		Inclination     3.20781
		AscendingNode   65.5581
		ArgOfPericenter -142.663
		MeanAnomaly     45.7926
	}
}

Asteroid	"S38"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.53278e-010
	Radius          4.118
	InertiaMoment   0.399164

	Obliquity       -0.741328
	EqAscendNode    -149.419
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.694 0.550 0.461)

	Surface
	{
		SurfStyle       0.664122
		OceanStyle      0.705601
		Randomize      (0.880, -0.948, 0.178)
		colorDistMagn   0.740958
		colorDistFreq   0.0126908
		detailScale     112.449
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00682717
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.683838
		terraceProb     0.153413
		erosion         0
		montesMagn      0.514803
		montesFreq      3.18497
		montesSpiky     0.973382
		montesFraction  0.356294
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0226659
		hillsFraction   0.423437
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231275
		craterFreq      0.228844
		craterDensity   0.874635
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   52.1497
		volcanoTemp     1739.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.187, 0.129, 0.000)
		colorShelf     (0.278, 0.193, 0.148, 0.000)
		colorBeach     (0.326, 0.226, 0.175, 0.000)
		colorDesert    (0.354, 0.242, 0.171, 0.000)
		colorLowland   (0.389, 0.259, 0.194, 0.000)
		colorUpland    (0.430, 0.314, 0.235, 0.000)
		colorRock      (0.465, 0.341, 0.254, 0.000)
		colorSnow      (0.506, 0.363, 0.268, 1.000)
		BumpHeight      3.7062
		BumpOffset      0.741239
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.028303
		Period          0.0239636
		Eccentricity    0.0426328
		Inclination     -0.741328
		AscendingNode   -149.419
		ArgOfPericenter 10.041
		MeanAnomaly     -101.707
	}
}

Asteroid	"S39"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.25557e-007
	Radius          36.6383
	InertiaMoment   0.395729

	RotationPeriod  755.505
	Obliquity       0.171754
	EqAscendNode    9.42577

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.472 0.466 0.462)

	Surface
	{
		SurfStyle       0.993635
		OceanStyle      0.032773
		Randomize      (0.361, 0.853, -0.577)
		colorDistMagn   0.863994
		colorDistFreq   0.0822343
		detailScale     1000.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0059702
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.477102
		terraceProb     0.138011
		erosion         0
		montesMagn      0.355171
		montesFreq      3.12491
		montesSpiky     0.972897
		montesFraction  0.117644
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.37038
		hillsFraction   0.833494
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205558
		craterFreq      0.264091
		craterDensity   0.922371
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   12.0952
		volcanoTemp     1735.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.163, 0.185, 0.050)
		colorShelf     (0.189, 0.191, 0.212, 0.040)
		colorBeach     (0.217, 0.219, 0.240, 0.030)
		colorDesert    (0.245, 0.247, 0.272, 0.020)
		colorLowland   (0.274, 0.275, 0.300, 0.030)
		colorUpland    (0.302, 0.303, 0.328, 0.050)
		colorRock      (0.330, 0.331, 0.365, 0.020)
		colorSnow      (0.330, 0.331, 0.365, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0319408
		Period          0.0287293
		Eccentricity    0.151671
		Inclination     0.171754
		AscendingNode   9.42577
		ArgOfPericenter 108.515
		MeanAnomaly     64.437
	}
}

Asteroid	"S40"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.3214e-015
	Radius          0.0742038
	InertiaMoment   0.398279

	Obliquity       0.913384
	EqAscendNode    19.182
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.713 0.645 0.559)

	Surface
	{
		SurfStyle       0.543292
		OceanStyle      0.163948
		Randomize      (-0.953, -0.977, -0.094)
		colorDistMagn   0.137033
		colorDistFreq   2.48783e-006
		detailScale     2.02626
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0314325
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.293577
		terraceProb     0.382909
		erosion         0
		montesMagn      0.43293
		montesFreq      2.9297
		montesSpiky     0.869907
		montesFraction  0.695191
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.40556e-005
		hillsFraction   0.62351
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229163
		craterFreq      0.181072
		craterDensity   0.873062
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   320.048
		volcanoTemp     1501.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.219, 0.156, 0.000)
		colorShelf     (0.285, 0.226, 0.179, 0.000)
		colorBeach     (0.335, 0.264, 0.212, 0.000)
		colorDesert    (0.363, 0.284, 0.207, 0.000)
		colorLowland   (0.399, 0.303, 0.235, 0.000)
		colorUpland    (0.442, 0.367, 0.285, 0.000)
		colorRock      (0.477, 0.400, 0.307, 0.000)
		colorSnow      (0.520, 0.425, 0.324, 1.000)
		BumpHeight      0.0667834
		BumpOffset      0.0133567
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0362555
		Period          0.0347428
		Eccentricity    0.0787252
		Inclination     0.913384
		AscendingNode   19.182
		ArgOfPericenter -139.295
		MeanAnomaly     -4.00084
	}
}

Asteroid	"S41"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.94451e-012
	Radius          1.03882
	InertiaMoment   0.399353

	RotationPeriod  2600.24
	Obliquity       3.10676
	EqAscendNode    -136.893

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.468 0.389 0.337)

	Surface
	{
		SurfStyle       0.843864
		OceanStyle      0.299671
		Randomize      (0.141, -0.797, -0.120)
		colorDistMagn   0.927649
		colorDistFreq   0.000122619
		detailScale     28.3668
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0398132
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.663054
		terraceProb     0.364293
		erosion         0
		montesMagn      0.583076
		montesFreq      3.24796
		montesSpiky     0.948009
		montesFraction  0.590871
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.002989
		hillsFraction   0.360556
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272225
		craterFreq      0.218898
		craterDensity   0.857764
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   116.8
		volcanoTemp     1002.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.132, 0.094, 0.000)
		colorShelf     (0.187, 0.136, 0.108, 0.000)
		colorBeach     (0.220, 0.159, 0.128, 0.000)
		colorDesert    (0.239, 0.171, 0.125, 0.000)
		colorLowland   (0.262, 0.183, 0.141, 0.000)
		colorUpland    (0.290, 0.222, 0.172, 0.000)
		colorRock      (0.313, 0.241, 0.185, 0.000)
		colorSnow      (0.342, 0.257, 0.195, 1.000)
		BumpHeight      0.934942
		BumpOffset      0.186988
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0517962
		Period          0.0593269
		Eccentricity    0.0954789
		Inclination     3.10676
		AscendingNode   -136.893
		ArgOfPericenter 109.259
		MeanAnomaly     -143.266
	}
}

Asteroid	"S42"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.86144e-009
	Radius          10.9239
	InertiaMoment   0.396739

	RotationPeriod  1447.31
	Obliquity       -1.19055
	EqAscendNode    34.4665

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.714 0.600 0.547)

	Surface
	{
		SurfStyle       0.758184
		OceanStyle      0.719082
		Randomize      (0.287, 0.316, -0.145)
		colorDistMagn   0.934621
		colorDistFreq   0.0994154
		detailScale     298.294
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0396814
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.55008
		terraceProb     0.221217
		erosion         0
		montesMagn      0.467945
		montesFreq      3.1345
		montesSpiky     0.818271
		montesFraction  0.348767
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.268246
		hillsFraction   0.53506
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24447
		craterFreq      0.277567
		craterDensity   1.00909
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.0177
		volcanoTemp     1892.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.204, 0.153, 0.000)
		colorShelf     (0.286, 0.210, 0.175, 0.000)
		colorBeach     (0.336, 0.246, 0.208, 0.000)
		colorDesert    (0.364, 0.264, 0.202, 0.000)
		colorLowland   (0.400, 0.282, 0.230, 0.000)
		colorUpland    (0.443, 0.342, 0.279, 0.000)
		colorRock      (0.478, 0.372, 0.301, 0.000)
		colorSnow      (0.521, 0.396, 0.317, 1.000)
		BumpHeight      9.83148
		BumpOffset      1.9663
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0310368
		Period          0.0275182
		Eccentricity    0.12696
		Inclination     -1.19055
		AscendingNode   34.4665
		ArgOfPericenter 172.021
		MeanAnomaly     122.423
	}
}

Asteroid	"S43"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.67634e-017
	Radius          0.0196933
	InertiaMoment   0.398521

	RotationPeriod  647.47
	Obliquity       -0.465802
	EqAscendNode    -132.102

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.601 0.598 0.596)

	Surface
	{
		SurfStyle       0.673441
		OceanStyle      0.957722
		Randomize      (0.380, 0.064, 0.942)
		colorDistMagn   0.374878
		colorDistFreq   2.48936e-007
		detailScale     0.537759
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00659628
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.267424
		terraceProb     0.517254
		erosion         0
		montesMagn      0.458576
		montesFreq      3.6685
		montesSpiky     0.961522
		montesFraction  0.450683
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.18741e-007
		hillsFraction   0.664928
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250043
		craterFreq      0.153357
		craterDensity   0.887869
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   754.126
		volcanoTemp     1310.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.203, 0.167, 0.000)
		colorShelf     (0.240, 0.209, 0.191, 0.000)
		colorBeach     (0.283, 0.245, 0.227, 0.000)
		colorDesert    (0.307, 0.263, 0.221, 0.000)
		colorLowland   (0.337, 0.281, 0.250, 0.000)
		colorUpland    (0.373, 0.341, 0.304, 0.000)
		colorRock      (0.403, 0.371, 0.328, 0.000)
		colorSnow      (0.439, 0.395, 0.346, 1.000)
		BumpHeight      0.017724
		BumpOffset      0.0035448
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0377626
		Period          0.0369316
		Eccentricity    0.0588834
		Inclination     -0.465802
		AscendingNode   -132.102
		ArgOfPericenter 163.358
		MeanAnomaly     151.898
	}
}

Asteroid	"S44"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.46682e-014
	Radius          0.196847
	InertiaMoment   0.399536

	RotationPeriod  724.417
	Obliquity       0.977914
	EqAscendNode    165.366

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.701 0.698 0.693)

	Surface
	{
		SurfStyle       0.192898
		OceanStyle      0.0976335
		Randomize      (0.263, 0.362, 0.278)
		colorDistMagn   0.289037
		colorDistFreq   2.62878e-005
		detailScale     5.37523
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00435364
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.394285
		terraceProb     0.215532
		erosion         0
		montesMagn      0.444028
		montesFreq      3.42158
		montesSpiky     0.889154
		montesFraction  0.616297
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.29466e-005
		hillsFraction   0.411553
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266586
		craterFreq      0.250423
		craterDensity   0.892401
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   196.501
		volcanoTemp     1488.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.279, 0.277, 0.000)
		colorShelf     (0.298, 0.297, 0.295, 0.000)
		colorBeach     (0.316, 0.314, 0.312, 0.000)
		colorDesert    (0.333, 0.332, 0.329, 0.000)
		colorLowland   (0.351, 0.349, 0.347, 0.000)
		colorUpland    (0.368, 0.366, 0.364, 0.000)
		colorRock      (0.386, 0.384, 0.381, 0.000)
		colorSnow      (0.403, 0.401, 0.399, 1.000)
		BumpHeight      0.177162
		BumpOffset      0.0354324
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0310585
		Period          0.0275471
		Eccentricity    0.127572
		Inclination     0.977914
		AscendingNode   165.366
		ArgOfPericenter 91.2652
		MeanAnomaly     106.758
	}
}

Asteroid	"S45"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            3.63006e-011
	Radius          2.54781
	InertiaMoment   0.397276

	RotationPeriod  1013.92
	Obliquity       -3.04368
	EqAscendNode    175.234

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.721 0.718 0.716)

	Surface
	{
		SurfStyle       0.29909
		OceanStyle      0.47735
		Randomize      (-0.910, -0.850, -0.912)
		colorDistMagn   0.945996
		colorDistFreq   0.00373747
		detailScale     69.5721
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00442156
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464091
		terraceProb     0.231217
		erosion         0
		montesMagn      0.588362
		montesFreq      3.66785
		montesSpiky     0.993044
		montesFraction  0.383927
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.016204
		hillsFraction   0.617229
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218529
		craterFreq      0.232165
		craterDensity   0.884082
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   66.3003
		volcanoTemp     1349.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.287, 0.286, 0.000)
		colorShelf     (0.306, 0.305, 0.304, 0.000)
		colorBeach     (0.324, 0.323, 0.322, 0.000)
		colorDesert    (0.342, 0.341, 0.340, 0.000)
		colorLowland   (0.361, 0.359, 0.358, 0.000)
		colorUpland    (0.379, 0.377, 0.376, 0.000)
		colorRock      (0.397, 0.395, 0.394, 0.000)
		colorSnow      (0.415, 0.413, 0.411, 1.000)
		BumpHeight      2.29303
		BumpOffset      0.458605
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0320798
		Period          0.028917
		Eccentricity    0.155346
		Inclination     -3.04368
		AscendingNode   175.234
		ArgOfPericenter -110.227
		MeanAnomaly     106.753
	}
}

Asteroid	"S46"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            5.34182e-008
	Radius          22.6701
	InertiaMoment   0.398744

	Obliquity       3.0518
	EqAscendNode    121.135
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.523 0.520 0.516)

	Surface
	{
		SurfStyle       0.826495
		OceanStyle      0.0711445
		Randomize      (-0.492, -0.760, 0.379)
		colorDistMagn   0.983059
		colorDistFreq   0.357974
		detailScale     619.045
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0523046
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.513913
		terraceProb     0.454921
		erosion         0
		montesMagn      0.341554
		montesFreq      2.96978
		montesSpiky     0.938925
		montesFraction  0.688547
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.943386
		hillsFraction   0.830267
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247629
		craterFreq      0.201502
		craterDensity   0.960858
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   15.3785
		volcanoTemp     1268.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.177, 0.144, 0.000)
		colorShelf     (0.209, 0.182, 0.165, 0.000)
		colorBeach     (0.246, 0.213, 0.196, 0.000)
		colorDesert    (0.267, 0.229, 0.191, 0.000)
		colorLowland   (0.293, 0.244, 0.217, 0.000)
		colorUpland    (0.324, 0.296, 0.263, 0.000)
		colorRock      (0.350, 0.322, 0.284, 0.000)
		colorSnow      (0.382, 0.343, 0.299, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0304636
		Period          0.0267594
		Eccentricity    0.110534
		Inclination     3.0518
		AscendingNode   121.135
		ArgOfPericenter 155.489
		MeanAnomaly     70.543
	}
}

Asteroid	"S47"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            3.12943e-016
	Radius          0.0565062
	InertiaMoment   0.399715

	Obliquity       1.34376
	EqAscendNode    173.443
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.491 0.423 0.400)

	Surface
	{
		SurfStyle       0.410212
		OceanStyle      0.158522
		Randomize      (-0.739, -0.863, 0.973)
		colorDistMagn   0.0958697
		colorDistFreq   1.7142e-006
		detailScale     1.543
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00267442
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.262483
		terraceProb     0.566746
		erosion         0
		montesMagn      0.440568
		montesFreq      3.69185
		montesSpiky     0.962696
		montesFraction  0.410159
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.96946e-006
		hillsFraction   0.638423
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240456
		craterFreq      0.173568
		craterDensity   0.877509
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   500.806
		volcanoTemp     1626.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.169, 0.160, 0.000)
		colorShelf     (0.209, 0.180, 0.170, 0.000)
		colorBeach     (0.221, 0.190, 0.180, 0.000)
		colorDesert    (0.233, 0.201, 0.190, 0.000)
		colorLowland   (0.246, 0.211, 0.200, 0.000)
		colorUpland    (0.258, 0.222, 0.210, 0.000)
		colorRock      (0.270, 0.233, 0.220, 0.000)
		colorSnow      (0.282, 0.243, 0.230, 1.000)
		BumpHeight      0.0508556
		BumpOffset      0.0101711
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0660928
		Period          0.0855139
		Eccentricity    0.125209
		Inclination     1.34376
		AscendingNode   173.443
		ArgOfPericenter 93.4868
		MeanAnomaly     37.6674
	}
}

Asteroid	"S48"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            4.60512e-013
	Radius          0.522189
	InertiaMoment   0.397667

	RotationPeriod  784.521
	Obliquity       -2.7525
	EqAscendNode    16.5232

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.635 0.519 0.373)

	Surface
	{
		SurfStyle       0.591093
		OceanStyle      0.31736
		Randomize      (0.891, -0.333, 0.740)
		colorDistMagn   0.309694
		colorDistFreq   0.000160659
		detailScale     14.2592
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0949395
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.593343
		terraceProb     0.10177
		erosion         0
		montesMagn      0.51451
		montesFreq      2.85831
		montesSpiky     0.955086
		montesFraction  0.466171
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000664945
		hillsFraction   0.668099
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252702
		craterFreq      0.211739
		craterDensity   0.896247
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   120.646
		volcanoTemp     1419.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.176, 0.104, 0.000)
		colorShelf     (0.254, 0.182, 0.119, 0.000)
		colorBeach     (0.298, 0.213, 0.142, 0.000)
		colorDesert    (0.324, 0.228, 0.138, 0.000)
		colorLowland   (0.355, 0.244, 0.157, 0.000)
		colorUpland    (0.394, 0.296, 0.190, 0.000)
		colorRock      (0.425, 0.322, 0.205, 0.000)
		colorSnow      (0.463, 0.342, 0.216, 1.000)
		BumpHeight      0.46997
		BumpOffset      0.0939941
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0429192
		Period          0.044749
		Eccentricity    0.163696
		Inclination     -2.7525
		AscendingNode   16.5232
		ArgOfPericenter -33.0069
		MeanAnomaly     -70.9358
	}
}

Asteroid	"S49"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            6.77669e-010
	Radius          6.75867
	InertiaMoment   0.398952

	RotationPeriod  287.125
	Obliquity       0.349539
	EqAscendNode    36.288

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.692 0.612 0.573)

	Surface
	{
		SurfStyle       0.616518
		OceanStyle      0.147429
		Randomize      (0.791, 0.953, 0.307)
		colorDistMagn   0.998638
		colorDistFreq   0.0240312
		detailScale     184.557
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0115958
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391246
		terraceProb     0.330516
		erosion         0
		montesMagn      0.544222
		montesFreq      2.41644
		montesSpiky     0.927669
		montesFraction  0.477458
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.10115
		hillsFraction   0.41735
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.283079
		craterFreq      0.181639
		craterDensity   0.820983
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   40.706
		volcanoTemp     1781.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.208, 0.160, 0.000)
		colorShelf     (0.277, 0.214, 0.183, 0.000)
		colorBeach     (0.325, 0.251, 0.218, 0.000)
		colorDesert    (0.353, 0.269, 0.212, 0.000)
		colorLowland   (0.387, 0.288, 0.240, 0.000)
		colorUpland    (0.429, 0.349, 0.292, 0.000)
		colorRock      (0.464, 0.380, 0.315, 0.000)
		colorSnow      (0.505, 0.404, 0.332, 1.000)
		BumpHeight      6.0828
		BumpOffset      1.21656
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0456783
		Period          0.0491327
		Eccentricity    0.0695761
		Inclination     0.349539
		AscendingNode   36.288
		ArgOfPericenter -166.749
		MeanAnomaly     139.084
	}
}

Asteroid	"S50"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            3.97003e-018
	Radius          0.0121842
	InertiaMoment   0.399892

	Obliquity       -2.56664
	EqAscendNode    -106.891
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.749 0.719 0.666)

	Surface
	{
		SurfStyle       0.0472958
		OceanStyle      0.211587
		Randomize      (-0.578, 0.425, -0.284)
		colorDistMagn   0.912556
		colorDistFreq   8.62101e-008
		detailScale     0.332709
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0533234
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.682692
		terraceProb     0.184082
		erosion         0
		montesMagn      0.565019
		montesFreq      3.27623
		montesSpiky     0.907109
		montesFraction  0.565508
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.60717e-007
		hillsFraction   0.618867
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231071
		craterFreq      0.144381
		craterDensity   0.882447
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   958.75
		volcanoTemp     1461.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.288, 0.267, 0.000)
		colorShelf     (0.318, 0.306, 0.283, 0.000)
		colorBeach     (0.337, 0.324, 0.300, 0.000)
		colorDesert    (0.356, 0.342, 0.317, 0.000)
		colorLowland   (0.375, 0.360, 0.333, 0.000)
		colorUpland    (0.393, 0.378, 0.350, 0.000)
		colorRock      (0.412, 0.396, 0.367, 0.000)
		colorSnow      (0.431, 0.414, 0.383, 1.000)
		BumpHeight      0.0109658
		BumpOffset      0.00219315
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0509253
		Period          0.0578369
		Eccentricity    0.103807
		Inclination     -2.56664
		AscendingNode   -106.891
		ArgOfPericenter 51.131
		MeanAnomaly     64.5029
	}
}

Asteroid	"S51"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            5.84211e-015
	Radius          0.138587
	InertiaMoment   0.397985

	RotationPeriod  421.759
	Obliquity       -1.05364
	EqAscendNode    149.707

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.670 0.666 0.662)

	Surface
	{
		SurfStyle       0.187935
		OceanStyle      0.163688
		Randomize      (-0.035, 0.026, 0.688)
		colorDistMagn   0.859035
		colorDistFreq   1.18389e-005
		detailScale     3.78434
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00961171
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.668618
		terraceProb     0.2197
		erosion         0
		montesMagn      0.601989
		montesFreq      2.69936
		montesSpiky     0.874864
		montesFraction  0.644333
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.81669e-005
		hillsFraction   0.563179
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.20817
		craterFreq      0.182588
		craterDensity   0.986059
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   284.277
		volcanoTemp     1464.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.266, 0.265, 0.000)
		colorShelf     (0.285, 0.283, 0.281, 0.000)
		colorBeach     (0.301, 0.300, 0.298, 0.000)
		colorDesert    (0.318, 0.316, 0.314, 0.000)
		colorLowland   (0.335, 0.333, 0.331, 0.000)
		colorUpland    (0.352, 0.350, 0.347, 0.000)
		colorRock      (0.368, 0.366, 0.364, 0.000)
		colorSnow      (0.385, 0.383, 0.380, 1.000)
		BumpHeight      0.124728
		BumpOffset      0.0249456
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0371837
		Period          0.0360856
		Eccentricity    0.190869
		Inclination     -1.05364
		AscendingNode   149.707
		ArgOfPericenter -32.7055
		MeanAnomaly     49.3327
	}
}

Asteroid	"S52"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            8.59697e-012
	Radius          1.38525
	InertiaMoment   0.399149

	RotationPeriod  630.493
	Obliquity       -1.32852
	EqAscendNode    108.097

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.603 0.475 0.367)

	Surface
	{
		SurfStyle       0.50697
		OceanStyle      0.425691
		Randomize      (-0.487, -0.043, -0.484)
		colorDistMagn   0.364934
		colorDistFreq   0.00107695
		detailScale     37.8266
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0272211
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406955
		terraceProb     0.246774
		erosion         0
		montesMagn      0.495372
		montesFreq      2.13805
		montesSpiky     0.957807
		montesFraction  0.482375
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00288213
		hillsFraction   0.488544
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26107
		craterFreq      0.17915
		craterDensity   1.02261
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   74.0733
		volcanoTemp     1426.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.161, 0.103, 0.000)
		colorShelf     (0.241, 0.166, 0.117, 0.000)
		colorBeach     (0.283, 0.195, 0.139, 0.000)
		colorDesert    (0.308, 0.209, 0.136, 0.000)
		colorLowland   (0.338, 0.223, 0.154, 0.000)
		colorUpland    (0.374, 0.271, 0.187, 0.000)
		colorRock      (0.404, 0.294, 0.202, 0.000)
		colorSnow      (0.440, 0.313, 0.213, 1.000)
		BumpHeight      1.24673
		BumpOffset      0.249345
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0418944
		Period          0.0431559
		Eccentricity    0.173116
		Inclination     -1.32852
		AscendingNode   108.097
		ArgOfPericenter -6.72861
		MeanAnomaly     96.5384
	}
}

Asteroid	"S53"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.26509e-008
	Radius          15.7553
	InertiaMoment   0.395585

	Obliquity       0.273821
	EqAscendNode    58.4965
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.591 0.588 0.586)

	Surface
	{
		SurfStyle       0.446388
		OceanStyle      0.350309
		Randomize      (0.221, 0.297, -0.047)
		colorDistMagn   0.64598
		colorDistFreq   0.114364
		detailScale     430.224
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00833653
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.260187
		terraceProb     0.524062
		erosion         0
		montesMagn      0.598721
		montesFreq      2.93557
		montesSpiky     0.965173
		montesFraction  0.535599
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.382584
		hillsFraction   0.711375
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221632
		craterFreq      0.168921
		craterDensity   1.00239
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.962
		volcanoTemp     1582.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.235, 0.235, 0.000)
		colorShelf     (0.251, 0.250, 0.249, 0.000)
		colorBeach     (0.266, 0.264, 0.264, 0.000)
		colorDesert    (0.281, 0.279, 0.279, 0.000)
		colorLowland   (0.296, 0.294, 0.293, 0.000)
		colorUpland    (0.311, 0.309, 0.308, 0.000)
		colorRock      (0.325, 0.323, 0.323, 0.000)
		colorSnow      (0.340, 0.338, 0.337, 1.000)
		BumpHeight      14.1797
		BumpOffset      2.83595
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0316105
		Period          0.0282847
		Eccentricity    0.142805
		Inclination     0.273821
		AscendingNode   58.4965
		ArgOfPericenter 92.3193
		MeanAnomaly     -6.84325
	}
}

Asteroid	"S54"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            7.41136e-017
	Radius          0.0323219
	InertiaMoment   0.398259

	Obliquity       -3.08783
	EqAscendNode    139.266
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.760 0.758 0.756)

	Surface
	{
		SurfStyle       0.206998
		OceanStyle      0.369508
		Randomize      (0.894, 0.265, -0.686)
		colorDistMagn   0.856442
		colorDistFreq   3.34198e-007
		detailScale     0.882604
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0374879
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.75292
		terraceProb     0.481285
		erosion         0
		montesMagn      0.377404
		montesFreq      3.7058
		montesSpiky     0.88539
		montesFraction  0.76817
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.49565e-006
		hillsFraction   0.934421
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225783
		craterFreq      0.209576
		craterDensity   0.854612
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   588.646
		volcanoTemp     1576.98
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
		BumpHeight      0.0290897
		BumpOffset      0.00581795
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0292097
		Period          0.0251244
		Eccentricity    0.072352
		Inclination     -3.08783
		AscendingNode   139.266
		ArgOfPericenter -3.84258
		MeanAnomaly     105.7
	}
}

Asteroid	"S55"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.09062e-013
	Radius          0.28763
	InertiaMoment   0.399338

	Obliquity       -1.08432
	EqAscendNode    124.738
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.473 0.467 0.462)

	Surface
	{
		SurfStyle       0.957518
		OceanStyle      0.608837
		Randomize      (-0.833, 0.018, -0.104)
		colorDistMagn   0.391912
		colorDistFreq   1.57372e-005
		detailScale     7.85421
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0175537
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412165
		terraceProb     0.169343
		erosion         0
		montesMagn      0.585009
		montesFreq      2.53949
		montesSpiky     0.853654
		montesFraction  0.409896
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000172135
		hillsFraction   0.678518
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250605
		craterFreq      0.266629
		craterDensity   0.950785
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   136.553
		volcanoTemp     1728.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.161, 0.163, 0.185, 0.050)
		colorShelf     (0.189, 0.191, 0.213, 0.040)
		colorBeach     (0.218, 0.219, 0.240, 0.030)
		colorDesert    (0.246, 0.247, 0.273, 0.020)
		colorLowland   (0.274, 0.275, 0.301, 0.030)
		colorUpland    (0.303, 0.303, 0.328, 0.050)
		colorRock      (0.331, 0.331, 0.365, 0.020)
		colorSnow      (0.331, 0.331, 0.365, 1.000)
		BumpHeight      0.258867
		BumpOffset      0.0517734
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0317245
		Period          0.0284379
		Eccentricity    0.145886
		Inclination     -1.08432
		AscendingNode   124.738
		ArgOfPericenter -11.1908
		MeanAnomaly     96.3857
	}
}

Asteroid	"S56"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.60491e-010
	Radius          4.1816
	InertiaMoment   0.396686

	RotationPeriod  829.003
	Obliquity       0.281737
	EqAscendNode    -149.428

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.511 0.421 0.348)

	Surface
	{
		SurfStyle       0.494094
		OceanStyle      0.643267
		Randomize      (-0.915, -0.150, -0.852)
		colorDistMagn   0.466871
		colorDistFreq   0.0105671
		detailScale     114.186
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00258374
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.676727
		terraceProb     0.177988
		erosion         0
		montesMagn      0.553792
		montesFreq      3.16099
		montesSpiky     0.951997
		montesFraction  0.857806
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0330762
		hillsFraction   0.812042
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22548
		craterFreq      0.25404
		craterDensity   0.971089
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.7516
		volcanoTemp     1804.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.168, 0.139, 0.000)
		colorShelf     (0.217, 0.179, 0.148, 0.000)
		colorBeach     (0.230, 0.189, 0.157, 0.000)
		colorDesert    (0.243, 0.200, 0.165, 0.000)
		colorLowland   (0.255, 0.210, 0.174, 0.000)
		colorUpland    (0.268, 0.221, 0.183, 0.000)
		colorRock      (0.281, 0.231, 0.191, 0.000)
		colorSnow      (0.294, 0.242, 0.200, 1.000)
		BumpHeight      3.76344
		BumpOffset      0.752688
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0583464
		Period          0.0709293
		Eccentricity    0.0897842
		Inclination     0.281737
		AscendingNode   -149.428
		ArgOfPericenter -84.4846
		MeanAnomaly     -164.737
	}
}

Asteroid	"S57"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.3617e-007
	Radius          47.5531
	InertiaMoment   0.398503

	RotationPeriod  312.213
	Obliquity       -5.64512
	EqAscendNode    106.976

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.486 0.481 0.476)

	Surface
	{
		SurfStyle       0.0854589
		OceanStyle      0.677621
		Randomize      (-0.292, -0.178, 0.717)
		colorDistMagn   0.408233
		colorDistFreq   0.183025
		detailScale     1298.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.116855
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.42975
		terraceProb     0.198442
		erosion         0
		montesMagn      0.558447
		montesFreq      2.88089
		montesSpiky     0.879247
		montesFraction  0.360022
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.26893
		hillsFraction   0.56811
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219585
		craterFreq      0.235734
		craterDensity   0.851648
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   15.3416
		volcanoTemp     1015.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.192, 0.190, 0.000)
		colorShelf     (0.206, 0.204, 0.202, 0.000)
		colorBeach     (0.219, 0.216, 0.214, 0.000)
		colorDesert    (0.231, 0.228, 0.226, 0.000)
		colorLowland   (0.243, 0.240, 0.238, 0.000)
		colorUpland    (0.255, 0.252, 0.250, 0.000)
		colorRock      (0.267, 0.264, 0.262, 0.000)
		colorSnow      (0.279, 0.276, 0.273, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0304282
		Period          0.0267129
		Eccentricity    0.0889575
		Inclination     -5.64512
		AscendingNode   106.976
		ArgOfPericenter -80.695
		MeanAnomaly     -106.16
	}
}

Asteroid	"S58"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.38357e-015
	Radius          0.0753499
	InertiaMoment   0.399522

	RotationPeriod  631.981
	Obliquity       1.38517
	EqAscendNode    -70.3209

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.565 0.461 0.318)

	Surface
	{
		SurfStyle       0.532524
		OceanStyle      0.342433
		Randomize      (0.894, 0.737, -0.211)
		colorDistMagn   0.208793
		colorDistFreq   2.17338e-006
		detailScale     2.05755
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0395174
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.461735
		terraceProb     0.317412
		erosion         0
		montesMagn      0.525875
		montesFreq      2.86151
		montesSpiky     0.966511
		montesFraction  0.668558
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.12534e-005
		hillsFraction   0.625048
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223297
		craterFreq      0.262788
		craterDensity   0.955047
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   317.605
		volcanoTemp     1396.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.157, 0.089, 0.000)
		colorShelf     (0.226, 0.161, 0.102, 0.000)
		colorBeach     (0.266, 0.189, 0.121, 0.000)
		colorDesert    (0.288, 0.203, 0.117, 0.000)
		colorLowland   (0.316, 0.217, 0.133, 0.000)
		colorUpland    (0.350, 0.263, 0.162, 0.000)
		colorRock      (0.379, 0.286, 0.175, 0.000)
		colorSnow      (0.412, 0.304, 0.184, 1.000)
		BumpHeight      0.0678149
		BumpOffset      0.013563
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0419604
		Period          0.0432578
		Eccentricity    0.127378
		Inclination     1.38517
		AscendingNode   -70.3209
		ArgOfPericenter -56.9532
		MeanAnomaly     81.4238
	}
}

Asteroid	"S59"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.036e-012
	Radius          0.857052
	InertiaMoment   0.397241

	Obliquity       3.7248
	EqAscendNode    156.092
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.772 0.678 0.636)

	Surface
	{
		SurfStyle       0.67787
		OceanStyle      0.364443
		Randomize      (0.286, -0.484, -0.020)
		colorDistMagn   0.943499
		colorDistFreq   0.000408478
		detailScale     23.4032
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0269107
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532236
		terraceProb     0.130759
		erosion         0
		montesMagn      0.477694
		montesFreq      3.88554
		montesSpiky     0.904139
		montesFraction  0.693026
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00161819
		hillsFraction   0.497867
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22979
		craterFreq      0.234089
		craterDensity   1.03437
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   94.1724
		volcanoTemp     1514.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.231, 0.178, 0.000)
		colorShelf     (0.309, 0.237, 0.204, 0.000)
		colorBeach     (0.363, 0.278, 0.242, 0.000)
		colorDesert    (0.394, 0.298, 0.235, 0.000)
		colorLowland   (0.432, 0.319, 0.267, 0.000)
		colorUpland    (0.479, 0.387, 0.325, 0.000)
		colorRock      (0.517, 0.421, 0.350, 0.000)
		colorSnow      (0.564, 0.448, 0.369, 1.000)
		BumpHeight      0.771346
		BumpOffset      0.154269
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0288431
		Period          0.0246529
		Eccentricity    0.0605616
		Inclination     3.7248
		AscendingNode   156.092
		ArgOfPericenter 48.3728
		MeanAnomaly     -60.5888
	}
}

Asteroid	"S60"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.99608e-009
	Radius          9.74801
	InertiaMoment   0.398727

	Obliquity       -2.00575
	EqAscendNode    18.864
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.714 0.711 0.706)

	Surface
	{
		SurfStyle       0.10614
		OceanStyle      0.33084
		Randomize      (-0.051, 0.395, -0.796)
		colorDistMagn   0.845315
		colorDistFreq   0.0357919
		detailScale     266.186
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0690122
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.66394
		terraceProb     0.160258
		erosion         0
		montesMagn      0.497805
		montesFreq      2.77334
		montesSpiky     0.999393
		montesFraction  0.736856
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.241029
		hillsFraction   0.577869
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257877
		craterFreq      0.259111
		craterDensity   0.999511
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.9219
		volcanoTemp     1902.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.284, 0.283, 0.000)
		colorShelf     (0.303, 0.302, 0.300, 0.000)
		colorBeach     (0.321, 0.320, 0.318, 0.000)
		colorDesert    (0.339, 0.338, 0.336, 0.000)
		colorLowland   (0.357, 0.355, 0.353, 0.000)
		colorUpland    (0.375, 0.373, 0.371, 0.000)
		colorRock      (0.393, 0.391, 0.388, 0.000)
		colorSnow      (0.411, 0.409, 0.406, 1.000)
		BumpHeight      8.77321
		BumpOffset      1.75464
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0383095
		Period          0.0377367
		Eccentricity    0.0961763
		Inclination     -2.00575
		AscendingNode   18.864
		ArgOfPericenter 114.416
		MeanAnomaly     71.3936
	}
}

Asteroid	"S61"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.75521e-017
	Radius          0.0199974
	InertiaMoment   0.399701

	Obliquity       1.94045
	EqAscendNode    -97.1006
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.530 0.520 0.516)

	Surface
	{
		SurfStyle       0.70412
		OceanStyle      0.568426
		Randomize      (0.283, 0.595, -0.202)
		colorDistMagn   0.46384
		colorDistFreq   1.66197e-007
		detailScale     0.546063
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0448176
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562944
		terraceProb     0.280683
		erosion         0
		montesMagn      0.523065
		montesFreq      3.02616
		montesSpiky     0.818688
		montesFraction  0.450901
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.47482e-007
		hillsFraction   0.735129
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247733
		craterFreq      0.263576
		craterDensity   0.818979
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   748.368
		volcanoTemp     1718.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.177, 0.145, 0.000)
		colorShelf     (0.212, 0.182, 0.165, 0.000)
		colorBeach     (0.249, 0.213, 0.196, 0.000)
		colorDesert    (0.270, 0.229, 0.191, 0.000)
		colorLowland   (0.297, 0.244, 0.217, 0.000)
		colorUpland    (0.328, 0.296, 0.263, 0.000)
		colorRock      (0.355, 0.322, 0.284, 0.000)
		colorSnow      (0.387, 0.343, 0.299, 1.000)
		BumpHeight      0.0179977
		BumpOffset      0.00359954
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0377582
		Period          0.0369252
		Eccentricity    0.0665983
		Inclination     1.94045
		AscendingNode   -97.1006
		ArgOfPericenter -104.003
		MeanAnomaly     179.791
	}
}

Asteroid	"S62"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.58289e-014
	Radius          0.199887
	InertiaMoment   0.39764

	RotationPeriod  321.288
	Obliquity       0.15963
	EqAscendNode    166.904

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.760 0.700 0.652)

	Surface
	{
		SurfStyle       0.466025
		OceanStyle      0.0364095
		Randomize      (0.841, -0.939, -0.080)
		colorDistMagn   0.5521
		colorDistFreq   2.40677e-005
		detailScale     5.45824
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00059802
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578387
		terraceProb     0.308857
		erosion         0
		montesMagn      0.470147
		montesFreq      3.17972
		montesSpiky     0.971492
		montesFraction  0.141801
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.07577e-005
		hillsFraction   0.686323
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238203
		craterFreq      0.153582
		craterDensity   0.912274
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   195.001
		volcanoTemp     1395.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.280, 0.261, 0.000)
		colorShelf     (0.323, 0.298, 0.277, 0.000)
		colorBeach     (0.342, 0.315, 0.293, 0.000)
		colorDesert    (0.361, 0.333, 0.310, 0.000)
		colorLowland   (0.380, 0.350, 0.326, 0.000)
		colorUpland    (0.399, 0.368, 0.342, 0.000)
		colorRock      (0.418, 0.385, 0.359, 0.000)
		colorSnow      (0.437, 0.403, 0.375, 1.000)
		BumpHeight      0.179898
		BumpOffset      0.0359796
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0310151
		Period          0.0274893
		Eccentricity    0.126349
		Inclination     0.159631
		AscendingNode   166.904
		ArgOfPericenter 8.00796
		MeanAnomaly     57.3329
	}
}

Asteroid	"S63"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            3.80086e-011
	Radius          2.58715
	InertiaMoment   0.398936

	RotationPeriod  543.181
	Obliquity       -1.39857
	EqAscendNode    -173.712

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.727 0.726 0.724)

	Surface
	{
		SurfStyle       0.139202
		OceanStyle      0.332519
		Randomize      (0.191, 0.691, -0.972)
		colorDistMagn   0.76601
		colorDistFreq   0.00231433
		detailScale     70.6465
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00267442
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404589
		terraceProb     0.288073
		erosion         0
		montesMagn      0.379881
		montesFreq      2.64308
		montesSpiky     0.991745
		montesFraction  0.533748
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0169672
		hillsFraction   0.662225
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222065
		craterFreq      0.255904
		craterDensity   0.888458
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   65.7941
		volcanoTemp     1640.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.290, 0.290, 0.000)
		colorShelf     (0.309, 0.308, 0.308, 0.000)
		colorBeach     (0.327, 0.327, 0.326, 0.000)
		colorDesert    (0.345, 0.345, 0.344, 0.000)
		colorLowland   (0.364, 0.363, 0.362, 0.000)
		colorUpland    (0.382, 0.381, 0.380, 0.000)
		colorRock      (0.400, 0.399, 0.398, 0.000)
		colorSnow      (0.418, 0.417, 0.416, 1.000)
		BumpHeight      2.32844
		BumpOffset      0.465687
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0379314
		Period          0.0371796
		Eccentricity    0.105913
		Inclination     -1.39857
		AscendingNode   -173.712
		ArgOfPericenter 152.58
		MeanAnomaly     -126.937
	}
}

Asteroid	"S64"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            5.59317e-008
	Radius          25.8572
	InertiaMoment   0.399879

	RotationPeriod  696.768
	Obliquity       -1.0777
	EqAscendNode    164.095

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.786 0.781 0.779)

	Surface
	{
		SurfStyle       0.187728
		OceanStyle      0.988841
		Randomize      (-0.732, 0.411, 0.620)
		colorDistMagn   0.696064
		colorDistFreq   0.1022
		detailScale     706.073
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00520195
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577768
		terraceProb     0.3503
		erosion         0
		montesMagn      0.448464
		montesFreq      4.4676
		montesSpiky     0.852299
		montesFraction  0.760386
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.14743
		hillsFraction   0.603573
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233884
		craterFreq      0.224083
		craterDensity   0.874203
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   17.1419
		volcanoTemp     1259.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.312, 0.312, 0.000)
		colorShelf     (0.334, 0.332, 0.331, 0.000)
		colorBeach     (0.354, 0.351, 0.351, 0.000)
		colorDesert    (0.373, 0.371, 0.370, 0.000)
		colorLowland   (0.393, 0.391, 0.390, 0.000)
		colorUpland    (0.413, 0.410, 0.409, 0.000)
		colorRock      (0.432, 0.430, 0.429, 0.000)
		colorSnow      (0.452, 0.449, 0.448, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0396559
		Period          0.0397435
		Eccentricity    0.085719
		Inclination     -1.0777
		AscendingNode   164.095
		ArgOfPericenter -89.4075
		MeanAnomaly     -26.6512
	}
}

Asteroid	"S65"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            3.27668e-016
	Radius          0.0530488
	InertiaMoment   0.397962

	RotationPeriod  223.629
	Obliquity       1.46139
	EqAscendNode    -38.289

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.794 0.792 0.788)

	Surface
	{
		SurfStyle       0.332292
		OceanStyle      0.969679
		Randomize      (-0.153, -0.744, 0.098)
		colorDistMagn   0.630483
		colorDistFreq   1.80614e-006
		detailScale     1.44859
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0481715
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566839
		terraceProb     0.298234
		erosion         0
		montesMagn      0.475377
		montesFreq      3.02019
		montesSpiky     0.954282
		montesFraction  0.500173
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.80493e-006
		hillsFraction   0.558842
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245965
		craterFreq      0.18838
		craterDensity   0.699128
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   459.478
		volcanoTemp     1558.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.317, 0.315, 0.000)
		colorShelf     (0.337, 0.337, 0.335, 0.000)
		colorBeach     (0.357, 0.356, 0.355, 0.000)
		colorDesert    (0.377, 0.376, 0.374, 0.000)
		colorLowland   (0.397, 0.396, 0.394, 0.000)
		colorUpland    (0.417, 0.416, 0.414, 0.000)
		colorRock      (0.437, 0.435, 0.434, 0.000)
		colorSnow      (0.456, 0.455, 0.453, 1.000)
		BumpHeight      0.0477439
		BumpOffset      0.00954879
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0386677
		Period          0.0382673
		Eccentricity    0.147036
		Inclination     1.46139
		AscendingNode   -38.289
		ArgOfPericenter -33.8939
		MeanAnomaly     -157.226
	}
}

Asteroid	"S66"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            4.82181e-013
	Radius          0.530255
	InertiaMoment   0.399134

	Obliquity       -5.84497
	EqAscendNode    -1.91506
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.559 0.552 0.547)

	Surface
	{
		SurfStyle       0.460108
		OceanStyle      0.772711
		Randomize      (0.703, -0.871, -0.288)
		colorDistMagn   0.253289
		colorDistFreq   7.47242e-005
		detailScale     14.4795
		colorConversion true
		snowLevel       2
		tropicLatitude  0.202587
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.543474
		terraceProb     0.12782
		erosion         0
		montesMagn      0.422065
		montesFreq      2.24261
		montesSpiky     0.819117
		montesFraction  0.725575
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000564555
		hillsFraction   0.844221
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252474
		craterFreq      0.238251
		craterDensity   0.98141
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   119.725
		volcanoTemp     1401.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.221, 0.219, 0.000)
		colorShelf     (0.238, 0.235, 0.232, 0.000)
		colorBeach     (0.252, 0.249, 0.246, 0.000)
		colorDesert    (0.266, 0.262, 0.260, 0.000)
		colorLowland   (0.280, 0.276, 0.273, 0.000)
		colorUpland    (0.294, 0.290, 0.287, 0.000)
		colorRock      (0.308, 0.304, 0.301, 0.000)
		colorSnow      (0.322, 0.318, 0.314, 1.000)
		BumpHeight      0.477229
		BumpOffset      0.0954459
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0402592
		Period          0.040654
		Eccentricity    0.0824529
		Inclination     -5.84497
		AscendingNode   -1.91506
		ArgOfPericenter -158.954
		MeanAnomaly     65.4421
	}
}

Asteroid	"S67"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            7.09555e-010
	Radius          6.86305
	InertiaMoment   0.395413

	Obliquity       0.504216
	EqAscendNode    80.4915
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.781 0.731 0.659)

	Surface
	{
		SurfStyle       0.0841816
		OceanStyle      0.615387
		Randomize      (0.500, 0.772, 0.319)
		colorDistMagn   0.121861
		colorDistFreq   0.014635
		detailScale     187.407
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0134341
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.751483
		terraceProb     0.297818
		erosion         0
		montesMagn      0.669368
		montesFreq      3.14821
		montesSpiky     0.982429
		montesFraction  0.220906
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0734285
		hillsFraction   0.731446
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236579
		craterFreq      0.197978
		craterDensity   1.02157
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   40.3952
		volcanoTemp     1622.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.293, 0.264, 0.000)
		colorShelf     (0.332, 0.311, 0.280, 0.000)
		colorBeach     (0.352, 0.329, 0.297, 0.000)
		colorDesert    (0.371, 0.347, 0.313, 0.000)
		colorLowland   (0.391, 0.366, 0.330, 0.000)
		colorUpland    (0.410, 0.384, 0.346, 0.000)
		colorRock      (0.430, 0.402, 0.363, 0.000)
		colorSnow      (0.449, 0.420, 0.379, 1.000)
		BumpHeight      6.17674
		BumpOffset      1.23535
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0440058
		Period          0.046459
		Eccentricity    0.146578
		Inclination     0.504216
		AscendingNode   80.4915
		ArgOfPericenter -27.1476
		MeanAnomaly     -140.297
	}
}

Asteroid	"S68"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            4.15682e-018
	Radius          0.0123723
	InertiaMoment   0.398239

	Obliquity       -2.61107
	EqAscendNode    -102.873
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.456 0.453 0.449)

	Surface
	{
		SurfStyle       0.443573
		OceanStyle      0.375124
		Randomize      (-0.335, 0.489, -0.308)
		colorDistMagn   0.125993
		colorDistFreq   7.73163e-008
		detailScale     0.337847
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0567743
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515429
		terraceProb     0.612459
		erosion         0
		montesMagn      0.577342
		montesFreq      3.12096
		montesSpiky     0.955097
		montesFraction  0.505183
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.51381e-007
		hillsFraction   0.75466
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226016
		craterFreq      0.27776
		craterDensity   0.936452
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   951.43
		volcanoTemp     1598.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.181, 0.180, 0.000)
		colorShelf     (0.194, 0.193, 0.191, 0.000)
		colorBeach     (0.205, 0.204, 0.202, 0.000)
		colorDesert    (0.217, 0.215, 0.213, 0.000)
		colorLowland   (0.228, 0.227, 0.224, 0.000)
		colorUpland    (0.240, 0.238, 0.236, 0.000)
		colorRock      (0.251, 0.249, 0.247, 0.000)
		colorSnow      (0.262, 0.261, 0.258, 1.000)
		BumpHeight      0.0111351
		BumpOffset      0.00222702
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0534808
		Period          0.0622446
		Eccentricity    0.124065
		Inclination     -2.61107
		AscendingNode   -102.873
		ArgOfPericenter 85.5426
		MeanAnomaly     62.9362
	}
}

Asteroid	"S69"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            6.11699e-015
	Radius          0.140727
	InertiaMoment   0.399324

	Obliquity       -5.49241
	EqAscendNode    3.24691
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.450 0.385 0.352)

	Surface
	{
		SurfStyle       0.744743
		OceanStyle      0.189069
		Randomize      (-0.676, -0.100, -0.217)
		colorDistMagn   0.901946
		colorDistFreq   1.30481e-005
		detailScale     3.84278
		colorConversion true
		snowLevel       2
		tropicLatitude  0.190473
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.634712
		terraceProb     0.416006
		erosion         0
		montesMagn      0.466337
		montesFreq      2.1892
		montesSpiky     0.916356
		montesFraction  0.411942
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.64143e-005
		hillsFraction   0.560001
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235382
		craterFreq      0.270501
		craterDensity   0.877496
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   282.107
		volcanoTemp     1732.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.131, 0.099, 0.000)
		colorShelf     (0.180, 0.135, 0.113, 0.000)
		colorBeach     (0.211, 0.158, 0.134, 0.000)
		colorDesert    (0.229, 0.170, 0.130, 0.000)
		colorLowland   (0.252, 0.181, 0.148, 0.000)
		colorUpland    (0.279, 0.220, 0.179, 0.000)
		colorRock      (0.301, 0.239, 0.194, 0.000)
		colorSnow      (0.328, 0.254, 0.204, 1.000)
		BumpHeight      0.126654
		BumpOffset      0.0253308
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0284984
		Period          0.0242123
		Eccentricity    0.0491976
		Inclination     -5.49241
		AscendingNode   3.24691
		ArgOfPericenter -165.208
		MeanAnomaly     -140.157
	}
}

Asteroid	"S70"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            9.00147e-012
	Radius          1.40664
	InertiaMoment   0.396631

	RotationPeriod  1043.74
	Obliquity       -1.47703
	EqAscendNode    122.259

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.821 0.756 0.733)

	Surface
	{
		SurfStyle       0.121697
		OceanStyle      0.626766
		Randomize      (0.870, -0.878, 0.830)
		colorDistMagn   0.479807
		colorDistFreq   0.000931372
		detailScale     38.4108
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0248884
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.387084
		terraceProb     0.304558
		erosion         0
		montesMagn      0.628378
		montesFreq      3.16834
		montesSpiky     0.988148
		montesFraction  0.581033
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00529736
		hillsFraction   0.807657
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200728
		craterFreq      0.196006
		craterDensity   0.908462
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   73.5078
		volcanoTemp     1913.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.328, 0.302, 0.293, 0.000)
		colorShelf     (0.349, 0.321, 0.312, 0.000)
		colorBeach     (0.369, 0.340, 0.330, 0.000)
		colorDesert    (0.390, 0.359, 0.348, 0.000)
		colorLowland   (0.410, 0.378, 0.367, 0.000)
		colorUpland    (0.431, 0.397, 0.385, 0.000)
		colorRock      (0.451, 0.416, 0.403, 0.000)
		colorSnow      (0.472, 0.435, 0.422, 1.000)
		BumpHeight      1.26598
		BumpOffset      0.253196
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0396201
		Period          0.0396897
		Eccentricity    0.131227
		Inclination     -1.47703
		AscendingNode   122.259
		ArgOfPericenter -130.494
		MeanAnomaly     -33.0093
	}
}

Asteroid	"S71"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.32462e-008
	Radius          18.2053
	InertiaMoment   0.398485

	Obliquity       -0.842343
	EqAscendNode    148.3
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.583 0.579 0.575)

	Surface
	{
		SurfStyle       0.392567
		OceanStyle      0.00963119
		Randomize      (0.869, 0.265, -0.184)
		colorDistMagn   0.510258
		colorDistFreq   0.196553
		detailScale     497.125
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00803064
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.587788
		terraceProb     0.224085
		erosion         0
		montesMagn      0.640392
		montesFreq      4.02952
		montesSpiky     0.910946
		montesFraction  0.45838
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.56696
		hillsFraction   0.398043
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240789
		craterFreq      0.250036
		craterDensity   0.803612
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.8004
		volcanoTemp     1500.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.231, 0.230, 0.000)
		colorShelf     (0.248, 0.246, 0.244, 0.000)
		colorBeach     (0.262, 0.260, 0.259, 0.000)
		colorDesert    (0.277, 0.275, 0.273, 0.000)
		colorLowland   (0.291, 0.289, 0.287, 0.000)
		colorUpland    (0.306, 0.304, 0.302, 0.000)
		colorRock      (0.320, 0.318, 0.316, 0.000)
		colorSnow      (0.335, 0.333, 0.330, 1.000)
		BumpHeight      16.3847
		BumpOffset      3.27695
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0363935
		Period          0.0349415
		Eccentricity    0.121112
		Inclination     -0.842343
		AscendingNode   148.3
		ArgOfPericenter 162.013
		MeanAnomaly     -79.4176
	}
}

Asteroid	"S72"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            7.76008e-017
	Radius          0.0288428
	InertiaMoment   0.399508

	Obliquity       -2.17387
	EqAscendNode    123.228
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.732 0.731 0.729)

	Surface
	{
		SurfStyle       0.739084
		OceanStyle      0.631488
		Randomize      (0.348, 0.320, 0.268)
		colorDistMagn   0.232831
		colorDistFreq   3.06089e-007
		detailScale     0.7876
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0360609
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.765099
		terraceProb     0.427336
		erosion         0
		montesMagn      0.355554
		montesFreq      3.17322
		montesSpiky     0.874122
		montesFraction  0.587638
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.17934e-006
		hillsFraction   0.729697
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253344
		craterFreq      0.249135
		craterDensity   1.08916
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   513.346
		volcanoTemp     1861.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.248, 0.204, 0.000)
		colorShelf     (0.293, 0.256, 0.233, 0.000)
		colorBeach     (0.344, 0.300, 0.277, 0.000)
		colorDesert    (0.373, 0.321, 0.270, 0.000)
		colorLowland   (0.410, 0.343, 0.306, 0.000)
		colorUpland    (0.454, 0.416, 0.372, 0.000)
		colorRock      (0.491, 0.453, 0.401, 0.000)
		colorSnow      (0.535, 0.482, 0.423, 1.000)
		BumpHeight      0.0259585
		BumpOffset      0.0051917
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0282387
		Period          0.0238821
		Eccentricity    0.040454
		Inclination     -2.17387
		AscendingNode   123.228
		ArgOfPericenter 95.7463
		MeanAnomaly     -80.195
	}
}

Asteroid	"S73"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.14194e-013
	Radius          0.403788
	InertiaMoment   0.397206

	RotationPeriod  1106.95
	Obliquity       -1.94373
	EqAscendNode    -19.3493

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.615 0.611 0.608)

	Surface
	{
		SurfStyle       0.636439
		OceanStyle      0.0183782
		Randomize      (0.440, 0.202, 0.127)
		colorDistMagn   0.738639
		colorDistFreq   2.27961e-005
		detailScale     11.0261
		colorConversion true
		snowLevel       2
		tropicLatitude  0.066834
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.316765
		terraceProb     0.282114
		erosion         0
		montesMagn      0.470372
		montesFreq      2.09987
		montesSpiky     0.954767
		montesFraction  0.788672
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000385271
		hillsFraction   0.712278
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229873
		craterFreq      0.205892
		craterDensity   0.977891
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   187.343
		volcanoTemp     1717.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.208, 0.170, 0.000)
		colorShelf     (0.246, 0.214, 0.195, 0.000)
		colorBeach     (0.289, 0.251, 0.231, 0.000)
		colorDesert    (0.313, 0.269, 0.225, 0.000)
		colorLowland   (0.344, 0.287, 0.255, 0.000)
		colorUpland    (0.381, 0.348, 0.310, 0.000)
		colorRock      (0.412, 0.379, 0.334, 0.000)
		colorSnow      (0.449, 0.403, 0.353, 1.000)
		BumpHeight      0.36341
		BumpOffset      0.0726819
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0539926
		Period          0.0631403
		Eccentricity    0.137357
		Inclination     -1.94373
		AscendingNode   -19.3493
		ArgOfPericenter 109.637
		MeanAnomaly     -49.7632
	}
}

Asteroid	"S74"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.68042e-010
	Radius          3.32208
	InertiaMoment   0.398711

	Obliquity       0.37247
	EqAscendNode    117.228
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.435 0.431 0.428)

	Surface
	{
		SurfStyle       0.282649
		OceanStyle      0.314936
		Randomize      (0.353, 0.215, 0.174)
		colorDistMagn   0.623304
		colorDistFreq   0.00614225
		detailScale     90.715
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00677459
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.567801
		terraceProb     0.279306
		erosion         0
		montesMagn      0.22786
		montesFreq      3.17935
		montesSpiky     0.939169
		montesFraction  0.704507
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0256433
		hillsFraction   0.784029
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230237
		craterFreq      0.175726
		craterDensity   0.950386
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   40.1797
		volcanoTemp     1264.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.172, 0.171, 0.000)
		colorShelf     (0.185, 0.183, 0.182, 0.000)
		colorBeach     (0.196, 0.194, 0.193, 0.000)
		colorDesert    (0.207, 0.205, 0.203, 0.000)
		colorLowland   (0.218, 0.215, 0.214, 0.000)
		colorUpland    (0.229, 0.226, 0.225, 0.000)
		colorRock      (0.239, 0.237, 0.236, 0.000)
		colorSnow      (0.250, 0.248, 0.246, 1.000)
		BumpHeight      2.98987
		BumpOffset      0.597975
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0303038
		Period          0.0265491
		Eccentricity    0.105843
		Inclination     0.37247
		AscendingNode   117.228
		ArgOfPericenter 156.965
		MeanAnomaly     59.5686
	}
}

Asteroid	"S75"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.47283e-007
	Radius          52.229
	InertiaMoment   0.399688

	Obliquity       1.08312
	EqAscendNode    -38.4968
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.410 0.408 0.404)

	Surface
	{
		SurfStyle       0.344936
		OceanStyle      0.0283768
		Randomize      (0.182, 0.872, 0.827)
		colorDistMagn   0.598887
		colorDistFreq   0.857843
		detailScale     1426.2
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0356873
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.407149
		terraceProb     0.582062
		erosion         0
		montesMagn      0.608523
		montesFreq      2.7663
		montesSpiky     0.956129
		montesFraction  0.363653
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.42013
		hillsFraction   0.496699
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223687
		craterFreq      0.215876
		craterDensity   0.857204
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   16.4672
		volcanoTemp     1316.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.163, 0.162, 0.000)
		colorShelf     (0.174, 0.173, 0.172, 0.000)
		colorBeach     (0.185, 0.184, 0.182, 0.000)
		colorDesert    (0.195, 0.194, 0.192, 0.000)
		colorLowland   (0.205, 0.204, 0.202, 0.000)
		colorUpland    (0.215, 0.214, 0.212, 0.000)
		colorRock      (0.226, 0.224, 0.222, 0.000)
		colorSnow      (0.236, 0.235, 0.232, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0545238
		Period          0.0640743
		Eccentricity    0.0812658
		Inclination     1.08312
		AscendingNode   -38.4968
		ArgOfPericenter -101.745
		MeanAnomaly     1.43273
	}
}

Asteroid	"S76"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.44868e-015
	Radius          0.0870673
	InertiaMoment   0.397613

	RotationPeriod  2236.67
	Obliquity       -5.2518
	EqAscendNode    37.2425

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.773 0.769 0.768)

	Surface
	{
		SurfStyle       0.835533
		OceanStyle      0.559615
		Randomize      (0.505, 0.502, -0.855)
		colorDistMagn   0.455475
		colorDistFreq   4.63289e-006
		detailScale     2.37752
		colorConversion true
		snowLevel       2
		tropicLatitude  0.172829
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404355
		terraceProb     0.39508
		erosion         0
		montesMagn      0.438528
		montesFreq      3.332
		montesSpiky     0.998773
		montesFraction  0.419573
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.37831e-005
		hillsFraction   0.742402
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244699
		craterFreq      0.144701
		craterDensity   0.980255
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   358.654
		volcanoTemp     1497.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.262, 0.215, 0.000)
		colorShelf     (0.309, 0.269, 0.246, 0.000)
		colorBeach     (0.363, 0.315, 0.292, 0.000)
		colorDesert    (0.394, 0.339, 0.284, 0.000)
		colorLowland   (0.433, 0.362, 0.323, 0.000)
		colorUpland    (0.479, 0.439, 0.392, 0.000)
		colorRock      (0.518, 0.477, 0.422, 0.000)
		colorSnow      (0.564, 0.508, 0.445, 1.000)
		BumpHeight      0.0783606
		BumpOffset      0.0156721
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0658551
		Period          0.0850529
		Eccentricity    0.108223
		Inclination     -5.2518
		AscendingNode   37.2425
		ArgOfPericenter -13.1837
		MeanAnomaly     -166.408
	}
}

Asteroid	"S77"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.1318e-012
	Radius          0.774801
	InertiaMoment   0.398921

	Obliquity       -2.70994
	EqAscendNode    -35.0494
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.635 0.633 0.630)

	Surface
	{
		SurfStyle       0.728567
		OceanStyle      0.455458
		Randomize      (-0.699, -0.177, 0.031)
		colorDistMagn   0.47366
		colorDistFreq   0.000359319
		detailScale     21.1572
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0900792
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.458474
		terraceProb     0.20394
		erosion         0
		montesMagn      0.430319
		montesFreq      2.98353
		montesSpiky     0.926841
		montesFraction  0.19948
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0012795
		hillsFraction   0.636498
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232209
		craterFreq      0.178495
		craterDensity   1.0888
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   83.2
		volcanoTemp     1075.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.215, 0.177, 0.000)
		colorShelf     (0.254, 0.221, 0.202, 0.000)
		colorBeach     (0.298, 0.259, 0.240, 0.000)
		colorDesert    (0.324, 0.278, 0.233, 0.000)
		colorLowland   (0.356, 0.297, 0.265, 0.000)
		colorUpland    (0.394, 0.361, 0.322, 0.000)
		colorRock      (0.425, 0.392, 0.347, 0.000)
		colorSnow      (0.464, 0.418, 0.366, 1.000)
		BumpHeight      0.697321
		BumpOffset      0.139464
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0286508
		Period          0.0244068
		Eccentricity    0.0531041
		Inclination     -2.70994
		AscendingNode   -35.0494
		ArgOfPericenter 127.445
		MeanAnomaly     158.887
	}
}

Asteroid	"S78"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            3.13706e-009
	Radius          11.2639
	InertiaMoment   0.399865

	Obliquity       -3.71167
	EqAscendNode    40.3735
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.776 0.772 0.770)

	Surface
	{
		SurfStyle       0.825255
		OceanStyle      0.394775
		Randomize      (0.321, -0.231, 0.874)
		colorDistMagn   0.772803
		colorDistFreq   0.0663447
		detailScale     307.579
		colorConversion true
		snowLevel       2
		tropicLatitude  0.121293
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.30249
		terraceProb     0.318592
		erosion         0
		montesMagn      0.538479
		montesFreq      3.0534
		montesSpiky     0.867677
		montesFraction  0.781355
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.327758
		hillsFraction   0.721719
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.194886
		craterFreq      0.245084
		craterDensity   0.911511
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.5307
		volcanoTemp     2032.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.263, 0.216, 0.000)
		colorShelf     (0.310, 0.270, 0.246, 0.000)
		colorBeach     (0.365, 0.317, 0.293, 0.000)
		colorDesert    (0.396, 0.340, 0.285, 0.000)
		colorLowland   (0.435, 0.363, 0.323, 0.000)
		colorUpland    (0.481, 0.440, 0.393, 0.000)
		colorRock      (0.520, 0.479, 0.423, 0.000)
		colorSnow      (0.567, 0.510, 0.447, 1.000)
		BumpHeight      10.1375
		BumpOffset      2.0275
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0530005
		Period          0.0614081
		Eccentricity    0.0156217
		Inclination     -3.71167
		AscendingNode   40.3735
		ArgOfPericenter -90.646
		MeanAnomaly     -52.1239
	}
}

Asteroid	"S79"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.8378e-017
	Radius          0.0203063
	InertiaMoment   0.397939

	RotationPeriod  667.117
	Obliquity       -5.43659
	EqAscendNode    -150.304

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.729 0.727 0.723)

	Surface
	{
		SurfStyle       0.231149
		OceanStyle      0.905014
		Randomize      (0.051, 0.399, 0.490)
		colorDistMagn   0.191919
		colorDistFreq   2.361e-007
		detailScale     0.554496
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0485421
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.318831
		terraceProb     0.116717
		erosion         0
		montesMagn      0.492325
		montesFreq      2.45343
		montesSpiky     0.934194
		montesFraction  0.627928
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.54288e-007
		hillsFraction   0.796626
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257951
		craterFreq      0.218803
		craterDensity   0.962648
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   742.655
		volcanoTemp     1439.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.291, 0.289, 0.000)
		colorShelf     (0.310, 0.309, 0.307, 0.000)
		colorBeach     (0.328, 0.327, 0.325, 0.000)
		colorDesert    (0.346, 0.345, 0.343, 0.000)
		colorLowland   (0.365, 0.363, 0.361, 0.000)
		colorUpland    (0.383, 0.382, 0.380, 0.000)
		colorRock      (0.401, 0.400, 0.398, 0.000)
		colorSnow      (0.419, 0.418, 0.416, 1.000)
		BumpHeight      0.0182756
		BumpOffset      0.00365513
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0385227
		Period          0.0380523
		Eccentricity    0.153946
		Inclination     -5.43659
		AscendingNode   -150.304
		ArgOfPericenter -34.1446
		MeanAnomaly     139.35
	}
}

Asteroid	"S80"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.70442e-014
	Radius          0.202974
	InertiaMoment   0.399119

	Obliquity       -0.0131471
	EqAscendNode    178.651
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.748 0.714 0.661)

	Surface
	{
		SurfStyle       0.512917
		OceanStyle      0.437054
		Randomize      (-0.753, 0.476, 0.235)
		colorDistMagn   0.424674
		colorDistFreq   2.23157e-005
		detailScale     5.54253
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366641
		terraceProb     0.104353
		erosion         0
		montesMagn      0.48662
		montesFreq      2.69522
		montesSpiky     0.960791
		montesFraction  0.824764
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000107718
		hillsFraction   0.815185
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272129
		craterFreq      0.254099
		craterDensity   0.726514
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   193.512
		volcanoTemp     1406.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.243, 0.185, 0.000)
		colorShelf     (0.299, 0.250, 0.212, 0.000)
		colorBeach     (0.352, 0.293, 0.251, 0.000)
		colorDesert    (0.382, 0.314, 0.245, 0.000)
		colorLowland   (0.419, 0.335, 0.278, 0.000)
		colorUpland    (0.464, 0.407, 0.337, 0.000)
		colorRock      (0.501, 0.443, 0.364, 0.000)
		colorSnow      (0.546, 0.471, 0.384, 1.000)
		BumpHeight      0.182676
		BumpOffset      0.0365352
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0433219
		Period          0.0453802
		Eccentricity    0.0859314
		Inclination     -0.0131471
		AscendingNode   178.651
		ArgOfPericenter -175.44
		MeanAnomaly     8.13687
	}
}

Asteroid	"S81"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            3.9797e-011
	Radius          2.84154
	InertiaMoment   0.3952

	Obliquity       -0.557512
	EqAscendNode    -107.824
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.628 0.620 0.617)

	Surface
	{
		SurfStyle       0.695838
		OceanStyle      0.60298
		Randomize      (0.415, -0.358, 0.129)
		colorDistMagn   0.718714
		colorDistFreq   0.00392441
		detailScale     77.5931
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0114614
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610544
		terraceProb     0.335998
		erosion         0
		montesMagn      0.537849
		montesFreq      3.9527
		montesSpiky     0.950447
		montesFraction  0.538368
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0137024
		hillsFraction   0.631179
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238638
		craterFreq      0.21483
		craterDensity   0.804239
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   70.6212
		volcanoTemp     1502.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.211, 0.173, 0.000)
		colorShelf     (0.251, 0.217, 0.197, 0.000)
		colorBeach     (0.295, 0.254, 0.234, 0.000)
		colorDesert    (0.320, 0.273, 0.228, 0.000)
		colorLowland   (0.352, 0.291, 0.259, 0.000)
		colorUpland    (0.390, 0.353, 0.315, 0.000)
		colorRock      (0.421, 0.384, 0.339, 0.000)
		colorSnow      (0.459, 0.409, 0.358, 1.000)
		BumpHeight      2.55739
		BumpOffset      0.511478
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0542189
		Period          0.0635376
		Eccentricity    0.115431
		Inclination     -0.557512
		AscendingNode   -107.824
		ArgOfPericenter 21.2245
		MeanAnomaly     38.3949
	}
}

Asteroid	"S82"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            5.85634e-008
	Radius          26.2565
	InertiaMoment   0.398219

	Obliquity       3.32987
	EqAscendNode    87.7991
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.812 0.745 0.658)

	Surface
	{
		SurfStyle       0.340749
		OceanStyle      0.794384
		Randomize      (0.515, 0.933, -0.509)
		colorDistMagn   0.223977
		colorDistFreq   0.227191
		detailScale     716.976
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0836331
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.640199
		terraceProb     0.380514
		erosion         0
		montesMagn      0.36863
		montesFreq      3.47816
		montesSpiky     0.933205
		montesFraction  0.599263
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.50281
		hillsFraction   0.723213
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226623
		craterFreq      0.218604
		craterDensity   0.981699
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   17.011
		volcanoTemp     1710.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.325, 0.298, 0.263, 0.000)
		colorShelf     (0.345, 0.317, 0.280, 0.000)
		colorBeach     (0.365, 0.335, 0.296, 0.000)
		colorDesert    (0.386, 0.354, 0.313, 0.000)
		colorLowland   (0.406, 0.373, 0.329, 0.000)
		colorUpland    (0.426, 0.391, 0.346, 0.000)
		colorRock      (0.446, 0.410, 0.362, 0.000)
		colorSnow      (0.467, 0.429, 0.378, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0466452
		Period          0.050701
		Eccentricity    0.0686136
		Inclination     3.32987
		AscendingNode   87.7991
		ArgOfPericenter 30.1801
		MeanAnomaly     127.49
	}
}

Asteroid	"S83"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            3.43086e-016
	Radius          0.0421448
	InertiaMoment   0.399309

	RotationPeriod  322.913
	Obliquity       1.47853
	EqAscendNode    -174.383

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.489 0.482 0.474)

	Surface
	{
		SurfStyle       0.819158
		OceanStyle      0.281491
		Randomize      (-0.474, 0.428, -0.767)
		colorDistMagn   0.327598
		colorDistFreq   1.09671e-006
		detailScale     1.15083
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00253718
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.567776
		terraceProb     0.357565
		erosion         0
		montesMagn      0.628002
		montesFreq      2.88011
		montesSpiky     0.789918
		montesFraction  0.600848
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.67176e-006
		hillsFraction   0.572999
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252836
		craterFreq      0.220918
		craterDensity   0.821344
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   356.737
		volcanoTemp     1542.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.164, 0.133, 0.000)
		colorShelf     (0.196, 0.169, 0.152, 0.000)
		colorBeach     (0.230, 0.198, 0.180, 0.000)
		colorDesert    (0.249, 0.212, 0.175, 0.000)
		colorLowland   (0.274, 0.227, 0.199, 0.000)
		colorUpland    (0.303, 0.275, 0.242, 0.000)
		colorRock      (0.327, 0.299, 0.261, 0.000)
		colorSnow      (0.357, 0.318, 0.275, 1.000)
		BumpHeight      0.0379303
		BumpOffset      0.00758607
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0287694
		Period          0.0245585
		Eccentricity    0.0581561
		Inclination     1.47853
		AscendingNode   -174.383
		ArgOfPericenter -107.965
		MeanAnomaly     47.839
	}
}

Asteroid	"S84"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            5.04869e-013
	Radius          0.538445
	InertiaMoment   0.396573

	Obliquity       -2.62441
	EqAscendNode    -24.1169
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.725 0.671 0.635)

	Surface
	{
		SurfStyle       0.283645
		OceanStyle      0.0138609
		Randomize      (0.881, 0.763, -0.494)
		colorDistMagn   0.625521
		colorDistFreq   9.57306e-005
		detailScale     14.7031
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0894669
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.397464
		terraceProb     0.419682
		erosion         0
		montesMagn      0.580065
		montesFreq      3.73856
		montesSpiky     0.826787
		montesFraction  0.494008
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000482459
		hillsFraction   0.692352
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234561
		craterFreq      0.253908
		craterDensity   0.878936
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   118.811
		volcanoTemp     1726.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.268, 0.254, 0.000)
		colorShelf     (0.308, 0.285, 0.270, 0.000)
		colorBeach     (0.326, 0.302, 0.286, 0.000)
		colorDesert    (0.345, 0.319, 0.302, 0.000)
		colorLowland   (0.363, 0.335, 0.317, 0.000)
		colorUpland    (0.381, 0.352, 0.333, 0.000)
		colorRock      (0.399, 0.369, 0.349, 0.000)
		colorSnow      (0.417, 0.386, 0.365, 1.000)
		BumpHeight      0.4846
		BumpOffset      0.0969201
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0381148
		Period          0.0374494
		Eccentricity    0.0230871
		Inclination     -2.62441
		AscendingNode   -24.1169
		ArgOfPericenter -10.1712
		MeanAnomaly     12.1457
	}
}

Asteroid	"S85"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            7.4294e-010
	Radius          6.96904
	InertiaMoment   0.398467

	Obliquity       2.10828
	EqAscendNode    -90.1107
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.454 0.450 0.441)

	Surface
	{
		SurfStyle       0.055711
		OceanStyle      0.572055
		Randomize      (0.318, 0.821, -0.102)
		colorDistMagn   0.566366
		colorDistFreq   0.0165137
		detailScale     190.301
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0519586
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533169
		terraceProb     0.302759
		erosion         0
		montesMagn      0.385585
		montesFreq      3.12239
		montesSpiky     0.948996
		montesFraction  0.391672
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.126974
		hillsFraction   0.547681
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277971
		craterFreq      0.244477
		craterDensity   1.04506
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   40.0868
		volcanoTemp     1330.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.180, 0.176, 0.000)
		colorShelf     (0.193, 0.191, 0.187, 0.000)
		colorBeach     (0.204, 0.202, 0.199, 0.000)
		colorDesert    (0.216, 0.214, 0.210, 0.000)
		colorLowland   (0.227, 0.225, 0.221, 0.000)
		colorUpland    (0.238, 0.236, 0.232, 0.000)
		colorRock      (0.250, 0.247, 0.243, 0.000)
		colorSnow      (0.261, 0.258, 0.254, 1.000)
		BumpHeight      6.27213
		BumpOffset      1.25443
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0282712
		Period          0.0239233
		Eccentricity    0.00812026
		Inclination     2.10828
		AscendingNode   -90.1107
		ArgOfPericenter -88.2454
		MeanAnomaly     171.366
	}
}

Asteroid	"S86"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            4.35243e-018
	Radius          0.00982924
	InertiaMoment   0.399494

	RotationPeriod  1232.16
	Obliquity       0.197693
	EqAscendNode    106.162

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.505 0.498 0.494)

	Surface
	{
		SurfStyle       0.948946
		OceanStyle      0.936495
		Randomize      (0.576, -0.954, 0.710)
		colorDistMagn   0.681044
		colorDistFreq   6.25684e-008
		detailScale     0.268404
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0041432
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.362885
		terraceProb     0.225593
		erosion         0
		montesMagn      0.358375
		montesFreq      4.04323
		montesSpiky     0.964573
		montesFraction  0.462733
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.96098e-007
		hillsFraction   0.57745
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.279685
		craterFreq      0.233702
		craterDensity   0.889267
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   738.687
		volcanoTemp     1413.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.174, 0.198, 0.050)
		colorShelf     (0.202, 0.204, 0.227, 0.040)
		colorBeach     (0.232, 0.234, 0.257, 0.030)
		colorDesert    (0.263, 0.264, 0.291, 0.020)
		colorLowland   (0.293, 0.294, 0.321, 0.030)
		colorUpland    (0.323, 0.324, 0.351, 0.050)
		colorRock      (0.354, 0.354, 0.390, 0.020)
		colorSnow      (0.354, 0.354, 0.390, 1.000)
		BumpHeight      0.00884632
		BumpOffset      0.00176926
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0314823
		Period          0.0281129
		Eccentricity    0.125729
		Inclination     0.197693
		AscendingNode   106.162
		ArgOfPericenter 56.7247
		MeanAnomaly     21.0161
	}
}

Asteroid	"S87"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            6.40483e-015
	Radius          0.1429
	InertiaMoment   0.397169

	Obliquity       -2.05014
	EqAscendNode    142.092
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.708 0.704 0.700)

	Surface
	{
		SurfStyle       0.449796
		OceanStyle      0.534303
		Randomize      (0.425, -0.953, 0.870)
		colorDistMagn   0.149633
		colorDistFreq   1.22483e-005
		detailScale     3.90214
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0232367
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.548826
		terraceProb     0.209811
		erosion         0
		montesMagn      0.469842
		montesFreq      2.34864
		montesSpiky     0.927378
		montesFraction  0.496742
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.4754e-005
		hillsFraction   0.506483
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230999
		craterFreq      0.238176
		craterDensity   0.896167
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   279.953
		volcanoTemp     1429.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.282, 0.280, 0.000)
		colorShelf     (0.301, 0.299, 0.298, 0.000)
		colorBeach     (0.318, 0.317, 0.315, 0.000)
		colorDesert    (0.336, 0.335, 0.333, 0.000)
		colorLowland   (0.354, 0.352, 0.350, 0.000)
		colorUpland    (0.372, 0.370, 0.368, 0.000)
		colorRock      (0.389, 0.387, 0.385, 0.000)
		colorSnow      (0.407, 0.405, 0.403, 1.000)
		BumpHeight      0.12861
		BumpOffset      0.0257221
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0344717
		Period          0.0322106
		Eccentricity    0.025511
		Inclination     -2.05014
		AscendingNode   142.092
		ArgOfPericenter 69.3128
		MeanAnomaly     -153.098
	}
}

Asteroid	"S88"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            9.42503e-012
	Radius          1.42837
	InertiaMoment   0.398694

	Obliquity       -3.92932
	EqAscendNode    -100.738
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.503 0.496 0.491)

	Surface
	{
		SurfStyle       0.150166
		OceanStyle      0.58053
		Randomize      (0.789, 0.135, -0.767)
		colorDistMagn   0.384735
		colorDistFreq   0.000545096
		detailScale     39.0041
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0873331
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.462835
		terraceProb     0.236908
		erosion         0
		montesMagn      0.397967
		montesFreq      3.0672
		montesSpiky     0.835706
		montesFraction  0.351404
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00495352
		hillsFraction   0.520289
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249447
		craterFreq      0.238483
		craterDensity   0.870034
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   72.9467
		volcanoTemp     1468.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.198, 0.197, 0.000)
		colorShelf     (0.214, 0.211, 0.209, 0.000)
		colorBeach     (0.226, 0.223, 0.221, 0.000)
		colorDesert    (0.239, 0.236, 0.233, 0.000)
		colorLowland   (0.251, 0.248, 0.246, 0.000)
		colorUpland    (0.264, 0.260, 0.258, 0.000)
		colorRock      (0.277, 0.273, 0.270, 0.000)
		colorSnow      (0.289, 0.285, 0.282, 1.000)
		BumpHeight      1.28553
		BumpOffset      0.257107
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0420655
		Period          0.0434204
		Eccentricity    0.065446
		Inclination     -3.92932
		AscendingNode   -100.738
		ArgOfPericenter 14.0363
		MeanAnomaly     -179.329
	}
}

Asteroid	"S89"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.38694e-008
	Radius          18.4864
	InertiaMoment   0.399674

	Obliquity       1.45598
	EqAscendNode    -9.99643
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.500 0.496 0.488)

	Surface
	{
		SurfStyle       0.41015
		OceanStyle      0.468871
		Randomize      (0.455, -0.746, -0.344)
		colorDistMagn   0.399398
		colorDistFreq   0.231492
		detailScale     504.803
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0506087
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406981
		terraceProb     0.174574
		erosion         0
		montesMagn      0.514806
		montesFreq      3.08201
		montesSpiky     0.963091
		montesFraction  0.563198
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.684039
		hillsFraction   0.543138
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227099
		craterFreq      0.253598
		craterDensity   0.93198
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.611
		volcanoTemp     1679.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.198, 0.195, 0.000)
		colorShelf     (0.212, 0.211, 0.208, 0.000)
		colorBeach     (0.225, 0.223, 0.220, 0.000)
		colorDesert    (0.237, 0.235, 0.232, 0.000)
		colorLowland   (0.250, 0.248, 0.244, 0.000)
		colorUpland    (0.262, 0.260, 0.256, 0.000)
		colorRock      (0.275, 0.273, 0.269, 0.000)
		colorSnow      (0.287, 0.285, 0.281, 1.000)
		BumpHeight      16.6378
		BumpOffset      3.32756
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0420723
		Period          0.0434309
		Eccentricity    0.0828103
		Inclination     1.45598
		AscendingNode   -9.99643
		ArgOfPericenter -1.91347
		MeanAnomaly     64.964
	}
}

Asteroid	"S90"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            8.1252e-017
	Radius          0.0292883
	InertiaMoment   0.397585

	RotationPeriod  1321.44
	Obliquity       -1.7441
	EqAscendNode    121.575

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.660 0.626 0.564)

	Surface
	{
		SurfStyle       0.857148
		OceanStyle      0.97291
		Randomize      (0.806, -0.249, -0.710)
		colorDistMagn   0.447538
		colorDistFreq   9.85893e-008
		detailScale     0.799765
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0297057
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.288649
		terraceProb     0.266282
		erosion         0
		montesMagn      0.627852
		montesFreq      2.96049
		montesSpiky     0.890318
		montesFraction  0.421482
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.89501e-006
		hillsFraction   0.865207
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261073
		craterFreq      0.21494
		craterDensity   0.852514
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   509.428
		volcanoTemp     1449.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.219, 0.226, 0.050)
		colorShelf     (0.264, 0.257, 0.260, 0.040)
		colorBeach     (0.304, 0.294, 0.293, 0.030)
		colorDesert    (0.343, 0.332, 0.333, 0.020)
		colorLowland   (0.383, 0.369, 0.367, 0.030)
		colorUpland    (0.423, 0.407, 0.401, 0.050)
		colorRock      (0.462, 0.445, 0.446, 0.020)
		colorSnow      (0.462, 0.445, 0.446, 1.000)
		BumpHeight      0.0263594
		BumpOffset      0.00527189
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0382761
		Period          0.0376874
		Eccentricity    0.0924973
		Inclination     -1.7441
		AscendingNode   121.575
		ArgOfPericenter -20.9056
		MeanAnomaly     -24.0073
	}
}

Asteroid	"S91"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.19567e-013
	Radius          0.379083
	InertiaMoment   0.398905

	RotationPeriod  1148.82
	Obliquity       -1.26934
	EqAscendNode    -147.55

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.549 0.544 0.537)

	Surface
	{
		SurfStyle       0.773163
		OceanStyle      0.941299
		Randomize      (-0.815, -0.601, -0.512)
		colorDistMagn   0.585622
		colorDistFreq   9.33362e-005
		detailScale     10.3515
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0123813
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.646547
		terraceProb     0.306809
		erosion         0
		montesMagn      0.469689
		montesFreq      2.69103
		montesSpiky     0.739666
		montesFraction  0.323489
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000260936
		hillsFraction   0.580559
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206066
		craterFreq      0.14775
		craterDensity   1.00462
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   171.884
		volcanoTemp     1510.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.185, 0.150, 0.000)
		colorShelf     (0.219, 0.190, 0.172, 0.000)
		colorBeach     (0.258, 0.223, 0.204, 0.000)
		colorDesert    (0.280, 0.239, 0.199, 0.000)
		colorLowland   (0.307, 0.256, 0.225, 0.000)
		colorUpland    (0.340, 0.310, 0.274, 0.000)
		colorRock      (0.368, 0.337, 0.295, 0.000)
		colorSnow      (0.400, 0.359, 0.311, 1.000)
		BumpHeight      0.341175
		BumpOffset      0.068235
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0300463
		Period          0.0262115
		Eccentricity    0.098181
		Inclination     -1.26934
		AscendingNode   -147.55
		ArgOfPericenter 82.7543
		MeanAnomaly     155.034
	}
}

Asteroid	"S92"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.75949e-010
	Radius          4.31176
	InertiaMoment   0.399851

	RotationPeriod  4209.61
	Obliquity       -0.303518
	EqAscendNode    71.9607

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.769 0.766 0.762)

	Surface
	{
		SurfStyle       0.109667
		OceanStyle      0.247843
		Randomize      (-0.287, 0.904, 0.603)
		colorDistMagn   0.432021
		colorDistFreq   0.00930202
		detailScale     117.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00857618
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.46169
		terraceProb     0.288136
		erosion         0
		montesMagn      0.582232
		montesFreq      3.56146
		montesSpiky     0.941435
		montesFraction  0.694763
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0336482
		hillsFraction   0.621854
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22926
		craterFreq      0.226254
		craterDensity   0.942627
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   50.9644
		volcanoTemp     1411.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.306, 0.305, 0.000)
		colorShelf     (0.327, 0.326, 0.324, 0.000)
		colorBeach     (0.346, 0.345, 0.343, 0.000)
		colorDesert    (0.365, 0.364, 0.362, 0.000)
		colorLowland   (0.384, 0.383, 0.381, 0.000)
		colorUpland    (0.404, 0.402, 0.400, 0.000)
		colorRock      (0.423, 0.421, 0.419, 0.000)
		colorSnow      (0.442, 0.440, 0.438, 1.000)
		BumpHeight      3.88058
		BumpOffset      0.776117
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0632406
		Period          0.0800385
		Eccentricity    0.0825631
		Inclination     -0.303518
		AscendingNode   71.9607
		ArgOfPericenter -157.79
		MeanAnomaly     -78.2101
	}
}

Asteroid	"S93"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.58918e-007
	Radius          49.0329
	InertiaMoment   0.397916

	RotationPeriod  567.396
	Obliquity       0.780481
	EqAscendNode    84.7686

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.518 0.510 0.504)

	Surface
	{
		SurfStyle       0.680552
		OceanStyle      0.792455
		Randomize      (-0.511, -0.575, -0.128)
		colorDistMagn   0.207197
		colorDistFreq   1.16708
		detailScale     1338.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0201224
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.308195
		terraceProb     0.324875
		erosion         0
		montesMagn      0.585193
		montesFreq      2.73213
		montesSpiky     0.84701
		montesFraction  0.625953
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.47704
		hillsFraction   0.657227
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272885
		craterFreq      0.250472
		craterDensity   0.962357
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   15.1082
		volcanoTemp     1458.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.174, 0.141, 0.000)
		colorShelf     (0.207, 0.179, 0.161, 0.000)
		colorBeach     (0.243, 0.209, 0.192, 0.000)
		colorDesert    (0.264, 0.225, 0.187, 0.000)
		colorLowland   (0.290, 0.240, 0.212, 0.000)
		colorUpland    (0.321, 0.291, 0.257, 0.000)
		colorRock      (0.347, 0.316, 0.277, 0.000)
		colorSnow      (0.378, 0.337, 0.293, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0345812
		Period          0.0323642
		Eccentricity    0.0927291
		Inclination     0.780481
		AscendingNode   84.7686
		ArgOfPericenter 11.371
		MeanAnomaly     -140.424
	}
}

Asteroid	"S94"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.51684e-015
	Radius          0.0776953
	InertiaMoment   0.399104

	Obliquity       4.09726
	EqAscendNode    -100.038
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.605 0.601 0.599)

	Surface
	{
		SurfStyle       0.486417
		OceanStyle      0.894915
		Randomize      (-0.595, 0.237, -0.424)
		colorDistMagn   0.49342
		colorDistFreq   3.94999e-006
		detailScale     2.1216
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0917208
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464262
		terraceProb     0.18122
		erosion         0
		montesMagn      0.543309
		montesFreq      3.48181
		montesSpiky     0.671401
		montesFraction  0.445571
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.6796e-005
		hillsFraction   0.58414
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.288255
		craterFreq      0.201729
		craterDensity   0.805977
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   312.774
		volcanoTemp     1527.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.240, 0.240, 0.000)
		colorShelf     (0.257, 0.255, 0.255, 0.000)
		colorBeach     (0.272, 0.270, 0.270, 0.000)
		colorDesert    (0.287, 0.285, 0.285, 0.000)
		colorLowland   (0.303, 0.300, 0.300, 0.000)
		colorUpland    (0.318, 0.315, 0.315, 0.000)
		colorRock      (0.333, 0.330, 0.329, 0.000)
		colorSnow      (0.348, 0.345, 0.344, 1.000)
		BumpHeight      0.0699258
		BumpOffset      0.0139852
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0473307
		Period          0.0518227
		Eccentricity    0.102793
		Inclination     4.09727
		AscendingNode   -100.038
		ArgOfPericenter -106.003
		MeanAnomaly     63.9347
	}
}

Asteroid	"S95"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.2321e-012
	Radius          1.00562
	InertiaMoment   0.394911

	Obliquity       -8.72006
	EqAscendNode    -83.709
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.512 0.508 0.505)

	Surface
	{
		SurfStyle       0.392245
		OceanStyle      0.14244
		Randomize      (-0.343, -0.653, -0.215)
		colorDistMagn   0.936335
		colorDistFreq   0.000184934
		detailScale     27.4602
		colorConversion true
		snowLevel       2
		tropicLatitude  0.224402
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435337
		terraceProb     0.257446
		erosion         0
		montesMagn      0.601676
		montesFreq      3.28477
		montesSpiky     0.968151
		montesFraction  0.23305
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00341509
		hillsFraction   0.670164
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278394
		craterFreq      0.230223
		craterDensity   0.625757
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   105.532
		volcanoTemp     1732.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.203, 0.202, 0.000)
		colorShelf     (0.218, 0.216, 0.215, 0.000)
		colorBeach     (0.230, 0.229, 0.227, 0.000)
		colorDesert    (0.243, 0.241, 0.240, 0.000)
		colorLowland   (0.256, 0.254, 0.253, 0.000)
		colorUpland    (0.269, 0.267, 0.265, 0.000)
		colorRock      (0.282, 0.280, 0.278, 0.000)
		colorSnow      (0.294, 0.292, 0.290, 1.000)
		BumpHeight      0.905061
		BumpOffset      0.181012
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.045206
		Period          0.0483726
		Eccentricity    0.124421
		Inclination     -8.72006
		AscendingNode   -83.709
		ArgOfPericenter 31.4703
		MeanAnomaly     -149.984
	}
}

Asteroid	"S96"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            3.28466e-009
	Radius          10.0514
	InertiaMoment   0.398198

	Obliquity       -0.497617
	EqAscendNode    -121.659
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.682 0.601 0.474)

	Surface
	{
		SurfStyle       0.358971
		OceanStyle      0.829251
		Randomize      (0.698, -0.041, 0.196)
		colorDistMagn   0.148242
		colorDistFreq   0.0398718
		detailScale     274.471
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00846425
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.462127
		terraceProb     0.325042
		erosion         0
		montesMagn      0.54835
		montesFreq      2.81888
		montesSpiky     0.911933
		montesFraction  0.836215
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.192986
		hillsFraction   0.661558
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258425
		craterFreq      0.274941
		craterDensity   0.933242
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.4972
		volcanoTemp     1038.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.240, 0.190, 0.000)
		colorShelf     (0.290, 0.255, 0.202, 0.000)
		colorBeach     (0.307, 0.270, 0.213, 0.000)
		colorDesert    (0.324, 0.285, 0.225, 0.000)
		colorLowland   (0.341, 0.300, 0.237, 0.000)
		colorUpland    (0.358, 0.315, 0.249, 0.000)
		colorRock      (0.375, 0.330, 0.261, 0.000)
		colorSnow      (0.392, 0.345, 0.273, 1.000)
		BumpHeight      9.04628
		BumpOffset      1.80926
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0418506
		Period          0.0430882
		Eccentricity    0.0696055
		Inclination     -0.497617
		AscendingNode   -121.659
		ArgOfPericenter -59.5408
		MeanAnomaly     -147.148
	}
}

Asteroid	"S97"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            1.92428e-017
	Radius          0.0206199
	InertiaMoment   0.399295

	RotationPeriod  1171.14
	Obliquity       0.832822
	EqAscendNode    32.7927

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.631 0.584 0.491)

	Surface
	{
		SurfStyle       0.226459
		OceanStyle      0.821702
		Randomize      (-0.333, 0.197, 0.694)
		colorDistMagn   0.081995
		colorDistFreq   3.53248e-007
		detailScale     0.563061
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0278849
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.549606
		terraceProb     0.287011
		erosion         0
		montesMagn      0.614678
		montesFreq      2.37602
		montesSpiky     0.862902
		montesFraction  0.577019
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.02852e-006
		hillsFraction   0.589977
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226937
		craterFreq      0.193155
		craterDensity   0.92602
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   736.985
		volcanoTemp     1617.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.233, 0.196, 0.000)
		colorShelf     (0.268, 0.248, 0.209, 0.000)
		colorBeach     (0.284, 0.263, 0.221, 0.000)
		colorDesert    (0.300, 0.277, 0.233, 0.000)
		colorLowland   (0.316, 0.292, 0.245, 0.000)
		colorUpland    (0.331, 0.306, 0.258, 0.000)
		colorRock      (0.347, 0.321, 0.270, 0.000)
		colorSnow      (0.363, 0.336, 0.282, 1.000)
		BumpHeight      0.0185579
		BumpOffset      0.00371158
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0304342
		Period          0.0267208
		Eccentricity    0.109677
		Inclination     0.832822
		AscendingNode   32.7927
		ArgOfPericenter -173.621
		MeanAnomaly     63.4435
	}
}

Asteroid	"S98"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            2.83167e-014
	Radius          0.206109
	InertiaMoment   0.396513

	RotationPeriod  2442.53
	Obliquity       1.33892
	EqAscendNode    -36.7822

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.761 0.758 0.758)

	Surface
	{
		SurfStyle       0.243371
		OceanStyle      0.535287
		Randomize      (-0.295, -0.504, -0.671)
		colorDistMagn   0.611288
		colorDistFreq   2.05795e-005
		detailScale     5.62814
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0443354
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.525808
		terraceProb     0.106853
		erosion         0
		montesMagn      0.557987
		montesFreq      3.45168
		montesSpiky     0.993671
		montesFraction  0.744439
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000111907
		hillsFraction   0.50336
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23884
		craterFreq      0.253443
		craterDensity   0.950227
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   192.035
		volcanoTemp     1625.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.303, 0.303, 0.000)
		colorShelf     (0.323, 0.322, 0.322, 0.000)
		colorBeach     (0.342, 0.341, 0.341, 0.000)
		colorDesert    (0.361, 0.360, 0.360, 0.000)
		colorLowland   (0.380, 0.379, 0.379, 0.000)
		colorUpland    (0.399, 0.398, 0.398, 0.000)
		colorRock      (0.418, 0.417, 0.417, 0.000)
		colorSnow      (0.437, 0.436, 0.436, 1.000)
		BumpHeight      0.185498
		BumpOffset      0.0370996
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0439941
		Period          0.0464405
		Eccentricity    0.104239
		Inclination     1.33892
		AscendingNode   -36.7822
		ArgOfPericenter -104.879
		MeanAnomaly     129.881
	}
}

Asteroid	"S99"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            4.16695e-011
	Radius          2.66768
	InertiaMoment   0.398449

	RotationPeriod  664.232
	Obliquity       -0.54239
	EqAscendNode    -157.517

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.660 0.657 0.655)

	Surface
	{
		SurfStyle       0.929379
		OceanStyle      0.597623
		Randomize      (-0.279, 0.035, 0.004)
		colorDistMagn   0.942925
		colorDistFreq   0.00623873
		detailScale     72.8455
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00368644
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.618757
		terraceProb     0.179193
		erosion         0
		montesMagn      0.393904
		montesFreq      2.54529
		montesSpiky     0.954068
		montesFraction  0.483533
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0240506
		hillsFraction   0.941333
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24505
		craterFreq      0.174285
		craterDensity   1.01726
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   64.7934
		volcanoTemp     1548.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.230, 0.262, 0.050)
		colorShelf     (0.264, 0.269, 0.301, 0.040)
		colorBeach     (0.304, 0.309, 0.341, 0.030)
		colorDesert    (0.343, 0.348, 0.387, 0.020)
		colorLowland   (0.383, 0.388, 0.426, 0.030)
		colorUpland    (0.422, 0.427, 0.465, 0.050)
		colorRock      (0.462, 0.467, 0.518, 0.020)
		colorSnow      (0.462, 0.467, 0.518, 1.000)
		BumpHeight      2.40091
		BumpOffset      0.480183
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0384116
		Period          0.0378877
		Eccentricity    0.12924
		Inclination     -0.54239
		AscendingNode   -157.517
		ArgOfPericenter -156.248
		MeanAnomaly     -24.6364
	}
}

Asteroid	"S100"
{
	ParentBody     "RS 8476-1353-8-11843423-363"
	Class	       "Asteroid"

	Mass            6.13189e-008
	Radius          26.6619
	InertiaMoment   0.39948

	Obliquity       -2.28098
	EqAscendNode    -40.9524
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.512 0.359 0.306)

	Surface
	{
		SurfStyle       0.40275
		OceanStyle      0.966427
		Randomize      (-0.501, -0.275, 0.367)
		colorDistMagn   0.553223
		colorDistFreq   0.509313
		detailScale     728.047
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0745186
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.671832
		terraceProb     0.214327
		erosion         0
		montesMagn      0.584525
		montesFreq      2.52453
		montesSpiky     0.915963
		montesFraction  0.477736
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3584
		hillsFraction   0.441619
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219127
		craterFreq      0.199288
		craterDensity   0.822269
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   16.8811
		volcanoTemp     1726.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.144, 0.122, 0.000)
		colorShelf     (0.217, 0.153, 0.130, 0.000)
		colorBeach     (0.230, 0.162, 0.138, 0.000)
		colorDesert    (0.243, 0.171, 0.145, 0.000)
		colorLowland   (0.256, 0.179, 0.153, 0.000)
		colorUpland    (0.269, 0.188, 0.160, 0.000)
		colorRock      (0.281, 0.197, 0.168, 0.000)
		colorSnow      (0.294, 0.206, 0.176, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0286358
		Period          0.0243875
		Eccentricity    0.053759
		Inclination     -2.28098
		AscendingNode   -40.9524
		ArgOfPericenter -5.2645
		MeanAnomaly     20.6701
	}
}

