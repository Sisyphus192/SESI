Star	"RS 8476-1353-8-11843423-374"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "M9.2 V"
	Luminosity      0.000323681
	MassSol         0.0810094
	RadSol          0.0558133
	Teff            3733

	Age             11.9254

	InertiaMoment   0.0728746

	RotationPeriod  5.85609
	Obliquity       141.633
	EqAscendNode    239.934

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.590 0.307)

	Surface
	{
		Randomize      (-0.578, 0.935, -0.222)
		colorDistMagn   0.363539
		colorDistFreq   8.31112
		detailScale     99914.2
		colorConversion true
		tropicLatitude  0.53204
		icecapLatitude  1.02136
		mareFreq        29.7293
		mareDensity     0.0177602
		erosion         1
		montesFreq      537
		dunesMagn       0.529049
		hillsMagn       0.03
		hillsFreq       805.001
		craterOctaves   0
		BumpHeight      117.473
		BumpOffset      117.473
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
		Height          388.461
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
		Radius      220908
		Period      0.0223001
		Brightness  0.5
		RayDensity  3.03003
		RayCurv     3
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     141.633
		AscendingNode   239.934
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Planet	"1"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "GasGiant"

	Mass            84.2218
	Radius          58110
	InertiaMoment   0.234885

	RotationPeriod  189.205
	Obliquity       1.6215
	EqAscendNode    -176.321

	AlbedoBond      0.508194
	AlbedoGeom      0.609833
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.215784
		Randomize      (0.628, 0.061, 0.984)
		detailScale     149462
		colorConversion true
		tropicLatitude  0.00182698
		icecapLatitude  0.901827
		mainFreq        0.0207818
		venusFreq       4.13231
		venusMagn       0.44223
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.835271
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      9.89658
		twistMagn       0.772455
		cycloneMagn     6.18293
		cycloneFreq     0.25207
		cycloneDensity  0.111467
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
		BumpHeight      19.8552
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          132.105
		BumpHeight      65.1086
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.07465
		mainOctaves     10
		Coverage        0.58194
		twistZones      9.89658
		twistMagn       0.772455
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          581.1
		Density         5331.62
		Pressure        977532
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.193247
		Saturation      0.963027

		Composition
		{
			H2    	91.6935
			He    	7.88974
			CH4   	0.340298
			N2    	0.0350364
			NH3   	0.0260142
			O2    	0.00754077
			C2H2  	0.00343754
			C2H4  	0.00135652
			Ne    	0.00122121
			Ar    	0.000829267
			C2H6  	0.000652173
			C3H8  	0.000334832
		}
	}

	Aurora
	{
		Height      4100.52
		NorthLat    83.4011
		NorthLon    -50.9218
		NorthRadius 12901.3
		NorthWidth  7214.21
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -83.6532
		SouthLon    132.582
		SouthRadius 14998.6
		SouthWidth  6990.85
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
		SemiMajorAxis   0.0161259
		Period          0.00718365
		Eccentricity    0.0853737
		Inclination     1.6215
		AscendingNode   -176.321
		ArgOfPericenter 323.79
		MeanAnomaly     71.3106
	}
}

DwarfMoon	"1.D1"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            1.24441e-008
	Radius          18.7461
	InertiaMoment   0.399804

	Oblateness      0.0447756

	Obliquity       0.0126405
	EqAscendNode    48.7161
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.757 0.755 0.753)

	Surface
	{
		SurfStyle       0.207513
		OceanStyle      0.466777
		Randomize      (0.215, 0.610, 0.485)
		colorDistMagn   0.941358
		colorDistFreq   0.198951
		detailScale     511.895
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.630747
		terraceProb     0.218885
		erosion         0
		montesMagn      0.592082
		montesFreq      2.95985
		montesSpiky     0.99005
		montesFraction  0.21447
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.852687
		hillsFraction   0.591083
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225171
		craterFreq      0.199397
		craterDensity   0.801096
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.3473
		volcanoTemp     1739.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.302, 0.301, 0.000)
		colorShelf     (0.322, 0.321, 0.320, 0.000)
		colorBeach     (0.341, 0.340, 0.339, 0.000)
		colorDesert    (0.360, 0.359, 0.358, 0.000)
		colorLowland   (0.379, 0.378, 0.376, 0.000)
		colorUpland    (0.398, 0.397, 0.395, 0.000)
		colorRock      (0.417, 0.415, 0.414, 0.000)
		colorSnow      (0.436, 0.434, 0.433, 1.000)
		BumpHeight      16.8715
		BumpOffset      3.37431
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000717788
		Period          0.00121189
		Eccentricity    1.83372e-005
		Inclination     0.0126405
		AscendingNode   48.7161
		ArgOfPericenter -13.293
		MeanAnomaly     -89.7602
	}
}

DwarfMoon	"1.D2"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            1.69332e-008
	Radius          19.5091
	InertiaMoment   0.397803

	Oblateness      0.0347417

	Obliquity       -0.0043548
	EqAscendNode    -0.161655
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.710 0.708 0.707)

	Surface
	{
		SurfStyle       0.0265948
		OceanStyle      0.903588
		Randomize      (-0.277, 0.998, 0.895)
		colorDistMagn   0.762736
		colorDistFreq   0.139442
		detailScale     532.73
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504017
		terraceProb     0.209711
		erosion         0
		montesMagn      0.491272
		montesFreq      3.26713
		montesSpiky     0.977532
		montesFraction  0.395806
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.999269
		hillsFraction   0.891697
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205514
		craterFreq      0.226119
		craterDensity   0.925283
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.5058
		volcanoTemp     1366.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.283, 0.283, 0.000)
		colorShelf     (0.302, 0.301, 0.300, 0.000)
		colorBeach     (0.319, 0.319, 0.318, 0.000)
		colorDesert    (0.337, 0.336, 0.336, 0.000)
		colorLowland   (0.355, 0.354, 0.353, 0.000)
		colorUpland    (0.373, 0.372, 0.371, 0.000)
		colorRock      (0.390, 0.390, 0.389, 0.000)
		colorSnow      (0.408, 0.407, 0.406, 1.000)
		BumpHeight      17.5582
		BumpOffset      3.51165
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00073177
		Period          0.00124747
		Eccentricity    2.59043e-005
		Inclination     -0.0043548
		AscendingNode   -0.161655
		ArgOfPericenter -64.7342
		MeanAnomaly     -74.4639
	}
}

Planet	"2"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Desert"

	Mass            0.541269
	Radius          6337.02
	InertiaMoment   0.331727

	Obliquity       2.39155
	EqAscendNode    84.0117
	TidalLocked     true

	AlbedoBond      0.264201
	AlbedoGeom      0.317041
	Brightness      2
	Color          (0.560 0.457 0.388)

	Surface
	{
		SurfStyle       0.263417
		OceanStyle      0.371793
		Randomize      (-0.561, -0.820, -0.146)
		colorDistMagn   0.0435885
		colorDistFreq   696.064
		detailScale     16299.2
		colorConversion true
		seaLevel        0.100221
		snowLevel       2
		tropicLatitude  0.0619848
		icecapLatitude  0.861344
		icecapHeight    0.103914
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.77956
		venusFreq       0.515694
		venusMagn       0.453012
		mareFreq        1.49538
		mareDensity     0.0650245
		terraceProb     0.104534
		erosion         0
		montesMagn      0.174981
		montesFreq      234.168
		montesSpiky     0.615301
		montesFraction  0.919907
		dunesMagn       0.0443095
		dunesFreq       41.3586
		dunesFraction   0.313024
		hillsMagn       0.112886
		hillsFreq       910.932
		hillsFraction   0
		hills2Fraction  0
		riversMagn      58.2096
		riversFreq      2.37836
		riversSin       4.21263
		riversOctaves   0
		canyonsMagn     0.0452063
		canyonsFreq     181.123
		canyonFraction  0
		cracksMagn      0.106954
		cracksFreq      0.647422
		cracksOctaves   0
		craterMagn      0.551503
		craterFreq      14.4315
		craterDensity   0.24884
		craterOctaves   3.67058
		volcanoMagn     0.65644
		volcanoFreq     2.38079
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.646915
		volcanoRadius   0.267932
		volcanoTemp     1587.29
		lavaCoverTidal  0.172016
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      1
		twistMagn       3.5
		cycloneMagn     1.05923
		cycloneDensity  0.377282
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
		Height          12.9434
		BumpHeight      6.038
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.996657
		mainOctaves     10
		Coverage        0.128401
		twistZones      1
		twistMagn       3.5
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          51.893
		Density         0.223648
		Pressure        0.0994911
		Greenhouse      1.09037
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.00664081
		Saturation      1

		Composition
		{
			CO2   	97.7902
			SO2   	0.587863
			NH3   	0.351259
			N2    	0.329783
			CH4   	0.281024
			C2H2  	0.258426
			C2H4  	0.143481
			C2H6  	0.131842
			H2O   	0.0840144
			H2S   	0.027295
			CO    	0.00921511
			C3H8  	0.0049654
			Ne    	0.000403211
			Ar    	0.000172101
			He    	9.27459e-005
		}
	}

	Aurora
	{
		Height      130.599
		NorthLat    59.7188
		NorthLon    143.628
		NorthRadius 2204.35
		NorthWidth  2223.07
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -52.8748
		SouthLon    337.984
		SouthRadius 2164.9
		SouthWidth  2352.46
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
		SemiMajorAxis   0.0242571
		Period          0.0132736
		Eccentricity    0.0123991
		Inclination     2.39155
		AscendingNode   84.0117
		ArgOfPericenter 37.9727
		MeanAnomaly     310.316
	}
}

Planet	"3"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Desert"

	Mass            2.57958
	Radius          10065.4
	InertiaMoment   0.325804

	RotationPeriod  428.199
	Obliquity       0.0967593
	EqAscendNode    -44.1572

	AlbedoBond      0.25
	AlbedoGeom      0.3
	Brightness      2
	Color          (0.726 0.721 0.717)

	Surface
	{
		SurfStyle       0.620463
		OceanStyle      0.504784
		Randomize      (0.771, -0.542, -0.767)
		colorDistMagn   0.0412899
		colorDistFreq   1236.9
		detailScale     25888.8
		colorConversion true
		seaLevel        0.108549
		snowLevel       2
		tropicLatitude  0.00312652
		icecapLatitude  0.798779
		icecapHeight    0.125479
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.878103
		venusFreq       1.1178
		venusMagn       0.49706
		mareFreq        2.16355
		mareDensity     0.207171
		terraceProb     0.391875
		erosion         0
		montesMagn      0.221233
		montesFreq      389.456
		montesSpiky     0.854532
		montesFraction  0.461336
		dunesMagn       0.043592
		dunesFreq       94.7446
		dunesFraction   0.348559
		hillsMagn       0.127745
		hillsFreq       1461.89
		hillsFraction   0
		hills2Fraction  0
		riversMagn      60.5084
		riversFreq      1.79008
		riversSin       7.60276
		riversOctaves   0
		canyonsMagn     0.047628
		canyonsFreq     291.444
		canyonFraction  0
		cracksMagn      0.0932051
		cracksFreq      1.05563
		cracksOctaves   0
		craterMagn      0.53838
		craterFreq      29.879
		craterDensity   0.227005
		craterOctaves   3.76068
		volcanoMagn     0.607397
		volcanoFreq     2.63044
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.63043
		volcanoRadius   0.219203
		volcanoTemp     1591.74
		lavaCoverTidal  0.214547
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      1.65738
		twistMagn       0.972509
		cycloneMagn     1.97388
		cycloneFreq     0.294613
		cycloneDensity  0.0109085
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
		BumpHeight      19.6514
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
		Height          12.2139
		BumpHeight      5.5849
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.00598
		mainOctaves     10
		Coverage        0.1
		twistZones      1.65738
		twistMagn       0.972509
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          20.5576
		Density         0.301526
		Pressure        0.1003
		Greenhouse      0.804611
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0328398
		Saturation      1

		Composition
		{
			CO2   	95.6607
			N2    	4.32238
			CH4   	0.00491481
			C2H2  	0.00412137
			H2    	0.0028363
			Ar    	0.001773
			CO    	0.00145565
			SO2   	0.000920032
			He    	0.000490308
			C2H4  	0.000138441
			C2H6  	0.000128836
			H2S   	9.33145e-005
			Ne    	3.80761e-005
			Kr    	2.64881e-005
		}
	}

	Aurora
	{
		Height      217.22
		NorthLat    51.6722
		NorthLon    -18.5225
		NorthRadius 2536.96
		NorthWidth  2772.94
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -48.0722
		SouthLon    159.3
		SouthRadius 2134.65
		SouthWidth  2043.76
		SouthRings  2
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     14341
		OuterRadius     35022.9
		RotationPeriod  6.68925
		RotationOffset  0
		FrontBright     0.684705
		BackBright      0.961654
		Density         0.829945
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0477296
		Period          0.0366349
		Eccentricity    0.0692688
		Inclination     0.0967593
		AscendingNode   -44.1572
		ArgOfPericenter 160.024
		MeanAnomaly     313.833
	}
}

DwarfMoon	"3.D1"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.94353e-011
	Radius          3.78384
	InertiaMoment   0.398645

	Oblateness      0.002661

	RotationPeriod  99.7759
	Obliquity       81.2441
	EqAscendNode    -138.707

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.711 0.623 0.488)

	Surface
	{
		SurfStyle       0.187913
		OceanStyle      0.385077
		Randomize      (-0.164, 0.670, 0.414)
		colorDistMagn   0.997158
		colorDistFreq   0.00451202
		detailScale     103.324
		colorConversion true
		snowLevel       2
		tropicLatitude  0.653288
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.727079
		terraceProb     0.303746
		erosion         0
		montesMagn      0.544822
		montesFreq      2.5767
		montesSpiky     0.971503
		montesFraction  0.65914
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0331064
		hillsFraction   0.721543
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231557
		craterFreq      0.238386
		craterDensity   0.798761
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   134.568
		volcanoTemp     1425.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.249, 0.195, 0.000)
		colorShelf     (0.302, 0.265, 0.207, 0.000)
		colorBeach     (0.320, 0.280, 0.220, 0.000)
		colorDesert    (0.338, 0.296, 0.232, 0.000)
		colorLowland   (0.355, 0.311, 0.244, 0.000)
		colorUpland    (0.373, 0.327, 0.256, 0.000)
		colorRock      (0.391, 0.342, 0.268, 0.000)
		colorSnow      (0.409, 0.358, 0.281, 1.000)
		BumpHeight      3.40546
		BumpOffset      0.681091
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000302774
		Period          0.00189706
		Eccentricity    0.322367
		Inclination     81.244
		AscendingNode   -138.707
		ArgOfPericenter 160.435
		MeanAnomaly     42.6081
	}
}

Planet	"4"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "IceGiant"

	Mass            12.7815
	Radius          19147.4
	InertiaMoment   0.204238

	Obliquity       2.01839
	EqAscendNode    65.5686
	TidalLocked     true

	AlbedoBond      0.492097
	AlbedoGeom      0.590516
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.80316
		Randomize      (-0.836, 0.496, 0.650)
		detailScale     49248.3
		colorConversion true
		tropicLatitude  0.0591941
		icecapLatitude  0.959194
		mainFreq        0.0148201
		venusFreq       4.57188
		venusMagn       0.46025
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      9.02305
		twistMagn       0.902575
		cycloneMagn     5.75807
		cycloneFreq     0.24853
		cycloneDensity  0.0830824
		cycloneOctaves  1
		colorLayer0    (0.190, 0.430, 0.850, 1.000)
		colorLayer1    (0.170, 0.450, 0.800, 1.000)
		colorLayer2    (0.180, 0.450, 0.830, 1.000)
		colorLayer3    (0.160, 0.460, 0.890, 1.000)
		colorLayer4    (0.180, 0.480, 0.860, 1.000)
		colorLayer5    (0.100, 0.450, 0.830, 1.000)
		colorLayer6    (0.190, 0.440, 0.860, 1.000)
		colorLayer7    (0.180, 0.430, 0.850, 1.000)
		colorLowPlants (0.180, 0.480, 0.860, 1.000)
		colorUpPlants  (0.100, 0.450, 0.830, 1.000)
		BumpHeight      16.794
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          86.666
		BumpHeight      56.378
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.885085
		mainOctaves     10
		Coverage        0.460484
		twistZones      9.02305
		twistMagn       0.902575
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          191.474
		Density         1077.12
		Pressure        134854
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0370655
		Saturation      0.647188

		Composition
		{
			H2    	92.866
			He    	6.76898
			CH4   	0.313881
			N2    	0.0418341
			O2    	0.00711934
			Ne    	0.00101064
			Ar    	0.000928313
			C2H4  	0.000267328
			C2H2  	1.35219e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0932322
		Period          0.0999953
		Eccentricity    0.0556817
		Inclination     2.01839
		AscendingNode   65.5686
		ArgOfPericenter 281.736
		MeanAnomaly     162.244
	}
}

DwarfMoon	"4.D1"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.58703e-009
	Radius          16.1456
	InertiaMoment   0.397866

	Oblateness      0.249

	Obliquity       -0.00252592
	EqAscendNode    -41.5561
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.787 0.746 0.699)

	Surface
	{
		SurfStyle       0.955765
		OceanStyle      0.346539
		Randomize      (-0.198, 0.977, 0.335)
		colorDistMagn   0.993143
		colorDistFreq   0.117553
		detailScale     440.881
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.43894
		terraceProb     0.147791
		erosion         0
		montesMagn      0.401716
		montesFreq      2.30849
		montesSpiky     0.980914
		montesFraction  0.704704
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.562358
		hillsFraction   0.693729
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245634
		craterFreq      0.225058
		craterDensity   1.08624
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.5427
		volcanoTemp     1335.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.261, 0.280, 0.050)
		colorShelf     (0.315, 0.306, 0.322, 0.040)
		colorBeach     (0.362, 0.351, 0.364, 0.030)
		colorDesert    (0.409, 0.396, 0.412, 0.020)
		colorLowland   (0.456, 0.440, 0.454, 0.030)
		colorUpland    (0.504, 0.485, 0.496, 0.050)
		colorRock      (0.551, 0.530, 0.552, 0.020)
		colorSnow      (0.551, 0.530, 0.552, 1.000)
		BumpHeight      14.531
		BumpOffset      2.9062
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000300461
		Period          0.000842501
		Eccentricity    1.69444e-005
		Inclination     -0.00252592
		AscendingNode   -41.5561
		ArgOfPericenter 75.9108
		MeanAnomaly     -10.4209
	}
}

DwarfMoon	"4.D2"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            2.23893e-009
	Radius          17.2528
	InertiaMoment   0.399053

	Oblateness      0.249

	Obliquity       0.0102035
	EqAscendNode    65.413
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.509 0.434 0.322)

	Surface
	{
		SurfStyle       0.720018
		OceanStyle      0.361247
		Randomize      (-0.348, 0.372, -0.992)
		colorDistMagn   0.388952
		colorDistFreq   0.219826
		detailScale     471.118
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.382053
		terraceProb     0.222118
		erosion         0
		montesMagn      0.425043
		montesFreq      2.69085
		montesSpiky     0.900148
		montesFraction  0.458116
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.722953
		hillsFraction   0.741895
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202664
		craterFreq      0.263912
		craterDensity   1.09458
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.1671
		volcanoTemp     1365.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.147, 0.090, 0.000)
		colorShelf     (0.203, 0.152, 0.103, 0.000)
		colorBeach     (0.239, 0.178, 0.123, 0.000)
		colorDesert    (0.259, 0.191, 0.119, 0.000)
		colorLowland   (0.285, 0.204, 0.135, 0.000)
		colorUpland    (0.315, 0.247, 0.164, 0.000)
		colorRock      (0.341, 0.269, 0.177, 0.000)
		colorSnow      (0.371, 0.286, 0.187, 1.000)
		BumpHeight      15.5276
		BumpOffset      3.10551
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00033395
		Period          0.000987211
		Eccentricity    8.39731e-005
		Inclination     0.0102035
		AscendingNode   65.413
		ArgOfPericenter -114.734
		MeanAnomaly     -22.9273
	}
}

DwarfMoon	"4.D3"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            3.12963e-009
	Radius          22.5791
	InertiaMoment   0.399965

	Oblateness      0.249

	Obliquity       -0.00236205
	EqAscendNode    -147.788
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.539 0.535 0.533)

	Surface
	{
		SurfStyle       0.811483
		OceanStyle      0.881204
		Randomize      (0.426, 0.405, -0.176)
		colorDistMagn   0.878742
		colorDistFreq   0.321331
		detailScale     616.561
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.438566
		terraceProb     0.185526
		erosion         0
		montesMagn      0.427756
		montesFreq      2.67236
		montesSpiky     0.900527
		montesFraction  0.835788
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.835117
		hillsFraction   0.62732
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228838
		craterFreq      0.204996
		craterDensity   0.936036
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.2801
		volcanoTemp     1408.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.182, 0.149, 0.000)
		colorShelf     (0.215, 0.187, 0.171, 0.000)
		colorBeach     (0.253, 0.220, 0.203, 0.000)
		colorDesert    (0.275, 0.236, 0.197, 0.000)
		colorLowland   (0.302, 0.252, 0.224, 0.000)
		colorUpland    (0.334, 0.305, 0.272, 0.000)
		colorRock      (0.361, 0.332, 0.293, 0.000)
		colorSnow      (0.393, 0.353, 0.309, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000345606
		Period          0.00103935
		Eccentricity    2.34646e-005
		Inclination     -0.00236205
		AscendingNode   -147.788
		ArgOfPericenter 86.6417
		MeanAnomaly     21.2043
	}
}

DwarfMoon	"4.D4"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            4.34129e-009
	Radius          23.6626
	InertiaMoment   0.398075

	Oblateness      0.227763

	Obliquity       -0.00664933
	EqAscendNode    46.4258
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.624 0.622 0.620)

	Surface
	{
		SurfStyle       0.380469
		OceanStyle      0.776216
		Randomize      (-0.222, -0.254, -0.135)
		colorDistMagn   0.622081
		colorDistFreq   0.263398
		detailScale     646.146
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.736497
		terraceProb     0.234901
		erosion         0
		montesMagn      0.488487
		montesFreq      3.90898
		montesSpiky     0.932241
		montesFraction  0.82724
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.44205
		hillsFraction   0.597784
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250645
		craterFreq      0.222742
		craterDensity   0.927853
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   56.3065
		volcanoTemp     1511.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.249, 0.248, 0.000)
		colorShelf     (0.265, 0.264, 0.263, 0.000)
		colorBeach     (0.281, 0.280, 0.279, 0.000)
		colorDesert    (0.296, 0.296, 0.294, 0.000)
		colorLowland   (0.312, 0.311, 0.310, 0.000)
		colorUpland    (0.327, 0.327, 0.325, 0.000)
		colorRock      (0.343, 0.342, 0.341, 0.000)
		colorSnow      (0.359, 0.358, 0.356, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000398316
		Period          0.00128597
		Eccentricity    4.45126e-005
		Inclination     -0.00664933
		AscendingNode   46.4258
		ArgOfPericenter 76.0035
		MeanAnomaly     84.1159
	}
}

DwarfMoon	"4.D5"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            5.98424e-009
	Radius          25.2729
	InertiaMoment   0.399191

	Oblateness      0.182051

	Obliquity       0.00247175
	EqAscendNode    -100.435
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.631 0.627 0.621)

	Surface
	{
		SurfStyle       0.19765
		OceanStyle      0.527887
		Randomize      (-0.850, -0.764, 0.504)
		colorDistMagn   0.42104
		colorDistFreq   0.233355
		detailScale     690.119
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.467802
		terraceProb     0.421629
		erosion         0
		montesMagn      0.41929
		montesFreq      3.4448
		montesSpiky     0.804049
		montesFraction  0.265521
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.46021
		hillsFraction   0.38707
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267836
		craterFreq      0.147351
		craterDensity   0.958274
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.222
		volcanoTemp     1540.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.251, 0.248, 0.000)
		colorShelf     (0.268, 0.266, 0.264, 0.000)
		colorBeach     (0.284, 0.282, 0.279, 0.000)
		colorDesert    (0.300, 0.298, 0.295, 0.000)
		colorLowland   (0.316, 0.313, 0.311, 0.000)
		colorUpland    (0.331, 0.329, 0.326, 0.000)
		colorRock      (0.347, 0.345, 0.342, 0.000)
		colorSnow      (0.363, 0.360, 0.357, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000412471
		Period          0.00135512
		Eccentricity    7.82463e-005
		Inclination     0.00247175
		AscendingNode   -100.435
		ArgOfPericenter -88.2876
		MeanAnomaly     -158.08
	}
}

DwarfMoon	"4.D6"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            8.20702e-009
	Radius          26.839
	InertiaMoment   0.395802

	Oblateness      0.00320804

	RotationPeriod  83.0933
	Obliquity       -20.5487
	EqAscendNode    152.092

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.567 0.422 0.367)

	Surface
	{
		SurfStyle       0.0834484
		OceanStyle      0.156212
		Randomize      (0.953, 0.124, -0.965)
		colorDistMagn   0.332782
		colorDistFreq   0.619375
		detailScale     732.884
		colorConversion true
		snowLevel       2
		tropicLatitude  0.168679
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589754
		terraceProb     0.130803
		erosion         0
		montesMagn      0.334979
		montesFreq      3.05799
		montesSpiky     0.699206
		montesFraction  0.342261
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.5444
		hillsFraction   0.688716
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259478
		craterFreq      0.198131
		craterDensity   0.960043
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.4493
		volcanoTemp     1637.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.169, 0.147, 0.000)
		colorShelf     (0.241, 0.179, 0.156, 0.000)
		colorBeach     (0.255, 0.190, 0.165, 0.000)
		colorDesert    (0.270, 0.200, 0.174, 0.000)
		colorLowland   (0.284, 0.211, 0.184, 0.000)
		colorUpland    (0.298, 0.221, 0.193, 0.000)
		colorRock      (0.312, 0.232, 0.202, 0.000)
		colorSnow      (0.326, 0.242, 0.211, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000950394
		Period          0.00473963
		Eccentricity    0.240964
		Inclination     -20.5487
		AscendingNode   152.092
		ArgOfPericenter 32.5264
		MeanAnomaly     -57.7181
	}
}

DwarfMoon	"4.D7"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.12104e-008
	Radius          35.0947
	InertiaMoment   0.398265

	Oblateness      0.00164161

	RotationPeriod  149.298
	Obliquity       42.1823
	EqAscendNode    -3.13343

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.526 0.465 0.427)

	Surface
	{
		SurfStyle       0.216038
		OceanStyle      0.681457
		Randomize      (0.293, -0.603, 0.822)
		colorDistMagn   0.500316
		colorDistFreq   0.209048
		detailScale     958.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.9951
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381927
		terraceProb     0.328257
		erosion         0
		montesMagn      0.404663
		montesFreq      2.95257
		montesSpiky     0.926209
		montesFraction  0.55983
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.72809
		hillsFraction   0.726229
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24822
		craterFreq      0.243634
		craterDensity   0.859451
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.9682
		volcanoTemp     1224.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.186, 0.171, 0.000)
		colorShelf     (0.223, 0.198, 0.182, 0.000)
		colorBeach     (0.236, 0.209, 0.192, 0.000)
		colorDesert    (0.250, 0.221, 0.203, 0.000)
		colorLowland   (0.263, 0.233, 0.214, 0.000)
		colorUpland    (0.276, 0.244, 0.224, 0.000)
		colorRock      (0.289, 0.256, 0.235, 0.000)
		colorSnow      (0.302, 0.268, 0.246, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00140463
		Period          0.00851592
		Eccentricity    0.392675
		Inclination     42.1823
		AscendingNode   -3.13343
		ArgOfPericenter -119.57
		MeanAnomaly     89.7684
	}
}

DwarfMoon	"4.D8"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.52667e-008
	Radius          36.2227
	InertiaMoment   0.399325

	Oblateness      0.00176323

	Obliquity       36.8108
	EqAscendNode    12.8024
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.542 0.538 0.532)

	Surface
	{
		SurfStyle       0.744424
		OceanStyle      0.909724
		Randomize      (-0.775, 0.078, -0.167)
		colorDistMagn   0.622464
		colorDistFreq   0.675257
		detailScale     989.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.956752
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.513891
		terraceProb     0.257162
		erosion         0
		montesMagn      0.616871
		montesFreq      2.13058
		montesSpiky     0.971177
		montesFraction  0.496473
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.85165
		hillsFraction   0.406614
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228509
		craterFreq      0.194242
		craterDensity   0.908613
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   45.9636
		volcanoTemp     1576.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.183, 0.149, 0.000)
		colorShelf     (0.217, 0.188, 0.170, 0.000)
		colorBeach     (0.255, 0.221, 0.202, 0.000)
		colorDesert    (0.277, 0.237, 0.197, 0.000)
		colorLowland   (0.304, 0.253, 0.223, 0.000)
		colorUpland    (0.336, 0.307, 0.271, 0.000)
		colorRock      (0.363, 0.334, 0.293, 0.000)
		colorSnow      (0.396, 0.355, 0.309, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00203006
		Period          0.0147962
		Eccentricity    0.0521704
		Inclination     36.8108
		AscendingNode   12.8024
		ArgOfPericenter -76.3948
		MeanAnomaly     135.37
	}
}

DwarfMoon	"4.D9"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            2.07474e-008
	Radius          38.4662
	InertiaMoment   0.396562

	Oblateness      0.0010891

	Obliquity       -70.2961
	EqAscendNode    33.7479
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.708 0.703 0.701)

	Surface
	{
		SurfStyle       0.911334
		OceanStyle      0.899795
		Randomize      (0.022, -0.006, -0.404)
		colorDistMagn   0.268539
		colorDistFreq   0.40693
		detailScale     1050.38
		colorConversion true
		snowLevel       2
		tropicLatitude  0.781988
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.701585
		terraceProb     0.154881
		erosion         0
		montesMagn      0.534834
		montesFreq      2.90679
		montesSpiky     0.909185
		montesFraction  0.478423
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.13915
		hillsFraction   0.548234
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220597
		craterFreq      0.21452
		craterDensity   0.918047
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.8701
		volcanoTemp     1347.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.246, 0.280, 0.050)
		colorShelf     (0.283, 0.288, 0.322, 0.040)
		colorBeach     (0.326, 0.330, 0.365, 0.030)
		colorDesert    (0.368, 0.373, 0.414, 0.020)
		colorLowland   (0.411, 0.415, 0.456, 0.030)
		colorUpland    (0.453, 0.457, 0.498, 0.050)
		colorRock      (0.496, 0.499, 0.554, 0.020)
		colorSnow      (0.496, 0.499, 0.554, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00227745
		Period          0.0175817
		Eccentricity    0.0404385
		Inclination     -70.2961
		AscendingNode   33.7479
		ArgOfPericenter 31.076
		MeanAnomaly     -31.0807
	}
}

DwarfPlanet	"5"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "IceWorld"

	Mass            0.00464174
	Radius          1373.96
	InertiaMoment   0.391928

	Obliquity       0.393969
	EqAscendNode    123.464
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.703 0.698 0.695)

	Surface
	{
		SurfStyle       0.836544
		OceanStyle      0.393252
		Randomize      (-0.953, -0.428, -0.852)
		colorDistMagn   0.0421965
		colorDistFreq   158.393
		detailScale     3533.89
		colorConversion true
		drivenDarkening 0
		seaLevel        0.117583
		snowLevel       2
		tropicLatitude  0.00651445
		icecapLatitude  0.497296
		icecapHeight    0.131592
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.58453
		venusFreq       1.56764
		venusMagn       0.137719
		mareFreq        0.593567
		mareDensity     0.00162185
		terraceProb     0.327535
		erosion         0
		montesMagn      0.0612317
		montesFreq      70.2258
		montesSpiky     0.988695
		montesFraction  0.532503
		dunesMagn       0.039511
		dunesFreq       1816.94
		dunesFraction   0.379004
		hillsMagn       0.120224
		hillsFreq       147.374
		hillsFraction   0.207983
		hills2Fraction  0.00208187
		riversMagn      64.7372
		riversFreq      2.88865
		riversSin       3.82736
		riversOctaves   0
		canyonsMagn     0.613928
		canyonsFreq     0.543761
		canyonFraction  0
		cracksMagn      0.0661965
		cracksFreq      0.496737
		cracksOctaves   0
		craterMagn      0.616244
		craterFreq      4.71098
		craterDensity   0.929875
		craterOctaves   11
		craterRayedFactor 0.444434
		volcanoMagn     0.226014
		volcanoFreq     1.23258
		volcanoDensity  0.0593342
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.214866
		volcanoRadius   0.974302
		volcanoTemp     1398.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.703, 0.523, 0.399, 0.000)
		colorShelf     (0.668, 0.497, 0.379, 0.000)
		colorBeach     (0.352, 0.262, 0.200, 0.000)
		colorDesert    (0.598, 0.445, 0.339, 0.000)
		colorLowland   (0.569, 0.461, 0.379, 0.000)
		colorUpland    (0.654, 0.486, 0.371, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.569, 0.461, 0.379, 0.000)
		colorUpPlants  (0.654, 0.486, 0.371, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.995234
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
		Height          103.047
		Density         0.000476648
		Pressure        0.000130766
		Greenhouse      0.169357
		Bright          3.43273
		Opacity         0
		SkyLight        1.14424
		Hue             0.0305025
		Saturation      1

		Composition
		{
			N2    	97.4713
			CO    	1.80098
			Ar    	0.71868
			Kr    	0.00851421
			C2H4  	0.000488258
			C2H6  	1.94111e-005
			C2H2  	1.11588e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.162265
		Period          0.229651
		Eccentricity    0.0636301
		Inclination     1.5125
		AscendingNode   124.646
		ArgOfPericenter 244.719
		MeanAnomaly     271.617
	}
}

DwarfMoon	"5.D1"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            4.17104e-007
	Radius          102.857
	InertiaMoment   0.399682

	Oblateness      0.249

	Obliquity       -0.000326598
	EqAscendNode    35.1854
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.565 0.560 0.559)

	Surface
	{
		SurfStyle       0.923874
		OceanStyle      0.452865
		Randomize      (-0.042, -0.469, 0.461)
		colorDistMagn   0.948342
		colorDistFreq   7.81774
		detailScale     2808.67
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.328965
		terraceProb     0.459266
		erosion         0
		montesMagn      0.55183
		montesFreq      3.92187
		montesSpiky     0.867189
		montesFraction  0.589539
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.3099
		hillsFraction   0.732981
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243337
		craterFreq      0.382279
		craterDensity   1.06159
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.9699
		volcanoTemp     1637.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.196, 0.223, 0.050)
		colorShelf     (0.226, 0.230, 0.257, 0.040)
		colorBeach     (0.260, 0.263, 0.290, 0.030)
		colorDesert    (0.294, 0.297, 0.330, 0.020)
		colorLowland   (0.327, 0.331, 0.363, 0.030)
		colorUpland    (0.361, 0.364, 0.397, 0.050)
		colorRock      (0.395, 0.398, 0.441, 0.020)
		colorSnow      (0.395, 0.398, 0.441, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.10211e-005
		Period          0.000818091
		Eccentricity    7.17414e-005
		Inclination     -0.000326598
		AscendingNode   35.1854
		ArgOfPericenter 127.85
		MeanAnomaly     178.672
	}
}

DwarfMoon	"5.D2"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            5.87259e-007
	Radius          109.322
	InertiaMoment   0.397566

	RotationPeriod  282.56
	Obliquity       -76.0861
	EqAscendNode    -176.051

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.571 0.562 0.558)

	Surface
	{
		SurfStyle       0.532777
		OceanStyle      0.48779
		Randomize      (-0.508, -0.890, -0.258)
		colorDistMagn   0.588231
		colorDistFreq   3.08108
		detailScale     2985.23
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0668518
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.596522
		terraceProb     0.182473
		erosion         0
		montesMagn      0.367175
		montesFreq      3.94687
		montesSpiky     0.961076
		montesFraction  0.447217
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.5992
		hillsFraction   0.514027
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260819
		craterFreq      0.489591
		craterDensity   0.779954
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.3666
		volcanoTemp     1837.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.191, 0.156, 0.000)
		colorShelf     (0.229, 0.197, 0.179, 0.000)
		colorBeach     (0.269, 0.231, 0.212, 0.000)
		colorDesert    (0.291, 0.247, 0.207, 0.000)
		colorLowland   (0.320, 0.264, 0.235, 0.000)
		colorUpland    (0.354, 0.321, 0.285, 0.000)
		colorRock      (0.383, 0.349, 0.307, 0.000)
		colorSnow      (0.417, 0.371, 0.324, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000117019
		Period          0.0107448
		Eccentricity    0.17173
		Inclination     -76.0861
		AscendingNode   -176.051
		ArgOfPericenter 102.223
		MeanAnomaly     53.0526
	}
}

Planet	"6"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "IceGiant"

	Mass            37.2577
	Radius          25843.3
	InertiaMoment   0.240245

	Oblateness      0.0228037

	RotationPeriod  10.4455
	Obliquity       -20.2031
	EqAscendNode    -100.794

	AlbedoBond      0.420164
	AlbedoGeom      0.504197
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.554174
		Randomize      (-0.681, 0.642, 0.669)
		detailScale     66470.5
		colorConversion true
		tropicLatitude  0.343293
		icecapLatitude  1
		mainFreq        0.0161732
		venusFreq       1.48454
		venusMagn       0.3945
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      4.7277
		twistMagn       1.45446
		cycloneMagn     15.1427
		cycloneFreq     0.380584
		cycloneDensity  0.0895002
		cycloneOctaves  1
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
		BumpHeight      13.2763
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          62.3086
		BumpHeight      64.863
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.957755
		mainOctaves     10
		Coverage        0.100822
		twistZones      4.7277
		twistMagn       1.45446
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          258.433
		Density         7818.6
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0430156
		Saturation      0.517244

		Composition
		{
			H2    	92.436
			He    	7.51684
			N2    	0.0351152
			O2    	0.00765183
			CH4   	0.0023986
			Ne    	0.00105483
			Ar    	0.000911208
		}
	}

	Aurora
	{
		Height      489.603
		NorthLat    68.4902
		NorthLon    70.0378
		NorthRadius 5958.65
		NorthWidth  7239.38
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -68.3702
		SouthLon    244.294
		SouthRadius 8398.11
		SouthWidth  6978.95
		SouthRings  5
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
		SemiMajorAxis   0.291814
		Period          0.55347
		Eccentricity    0.0385604
		Inclination     -0.750288
		AscendingNode   -100.632
		ArgOfPericenter 250.144
		MeanAnomaly     79.5486
	}
}

DwarfMoon	"6.D1"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            9.33798e-011
	Radius          7.62449
	InertiaMoment   0.394954

	Oblateness      0.249

	Obliquity       -0.685142
	EqAscendNode    -132.181
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.626 0.426 0.340)

	Surface
	{
		SurfStyle       0.724095
		OceanStyle      0.710527
		Randomize      (-0.636, 0.312, -0.470)
		colorDistMagn   0.812751
		colorDistFreq   0.0179399
		detailScale     208.199
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00969199
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.609389
		terraceProb     0.321618
		erosion         0
		montesMagn      0.578592
		montesFreq      2.59631
		montesSpiky     0.971249
		montesFraction  0.469662
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.160125
		hillsFraction   0.806289
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263563
		craterFreq      0.193155
		craterDensity   0.926475
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   123.706
		volcanoTemp     1457.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.145, 0.095, 0.000)
		colorShelf     (0.250, 0.149, 0.109, 0.000)
		colorBeach     (0.294, 0.175, 0.129, 0.000)
		colorDesert    (0.319, 0.187, 0.126, 0.000)
		colorLowland   (0.351, 0.200, 0.143, 0.000)
		colorUpland    (0.388, 0.243, 0.173, 0.000)
		colorRock      (0.419, 0.264, 0.187, 0.000)
		colorSnow      (0.457, 0.281, 0.197, 1.000)
		BumpHeight      6.86204
		BumpOffset      1.37241
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000555741
		Period          0.00124131
		Eccentricity    0.0154311
		Inclination     -0.685142
		AscendingNode   -132.181
		ArgOfPericenter -106.084
		MeanAnomaly     -5.54591
	}
}

DwarfMoon	"6.D2"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.52164e-010
	Radius          7.91949
	InertiaMoment   0.398175

	Oblateness      0.0740143

	Obliquity       0.566451
	EqAscendNode    30.9045
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.662 0.658 0.656)

	Surface
	{
		SurfStyle       0.1975
		OceanStyle      0.170454
		Randomize      (0.187, 0.163, 0.718)
		colorDistMagn   0.131265
		colorDistFreq   0.0234202
		detailScale     216.255
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0190577
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423
		terraceProb     0.16511
		erosion         0
		montesMagn      0.602611
		montesFreq      2.94368
		montesSpiky     0.878019
		montesFraction  0.895311
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.142462
		hillsFraction   0.657177
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243324
		craterFreq      0.24521
		craterDensity   0.676115
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   100.658
		volcanoTemp     1437.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.263, 0.262, 0.000)
		colorShelf     (0.281, 0.279, 0.279, 0.000)
		colorBeach     (0.298, 0.296, 0.295, 0.000)
		colorDesert    (0.314, 0.312, 0.312, 0.000)
		colorLowland   (0.331, 0.329, 0.328, 0.000)
		colorUpland    (0.347, 0.345, 0.344, 0.000)
		colorRock      (0.364, 0.362, 0.361, 0.000)
		colorSnow      (0.381, 0.378, 0.377, 1.000)
		BumpHeight      7.12754
		BumpOffset      1.42551
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000846487
		Period          0.00233347
		Eccentricity    0.000160266
		Inclination     0.566451
		AscendingNode   30.9045
		ArgOfPericenter -58.1644
		MeanAnomaly     -93.5468
	}
}

DwarfMoon	"6.D3"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.39266e-010
	Radius          8.79674
	InertiaMoment   0.39926

	RotationPeriod  472.696
	Obliquity       -66.9569
	EqAscendNode    125.86

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.580 0.512 0.417)

	Surface
	{
		SurfStyle       0.627167
		OceanStyle      0.876286
		Randomize      (0.682, -0.122, 0.087)
		colorDistMagn   0.808701
		colorDistFreq   0.0285044
		detailScale     240.21
		colorConversion true
		snowLevel       2
		tropicLatitude  0.760563
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.639308
		terraceProb     0.38425
		erosion         0
		montesMagn      0.565714
		montesFreq      3.10654
		montesSpiky     0.956932
		montesFraction  0.666405
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.236425
		hillsFraction   0.512875
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254339
		craterFreq      0.198163
		craterDensity   0.852293
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   89.1636
		volcanoTemp     1560.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.174, 0.117, 0.000)
		colorShelf     (0.232, 0.179, 0.134, 0.000)
		colorBeach     (0.272, 0.210, 0.159, 0.000)
		colorDesert    (0.296, 0.225, 0.154, 0.000)
		colorLowland   (0.325, 0.241, 0.175, 0.000)
		colorUpland    (0.359, 0.292, 0.213, 0.000)
		colorRock      (0.388, 0.317, 0.230, 0.000)
		colorSnow      (0.423, 0.338, 0.242, 1.000)
		BumpHeight      7.91707
		BumpOffset      1.58341
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00432638
		Period          0.0269625
		Eccentricity    0.100514
		Inclination     -66.9569
		AscendingNode   125.86
		ArgOfPericenter 138.71
		MeanAnomaly     -11.2596
	}
}

DwarfMoon	"6.D4"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.65708e-010
	Radius          9.72955
	InertiaMoment   0.39626

	Obliquity       25.0894
	EqAscendNode    38.6306
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.422 0.418 0.411)

	Surface
	{
		SurfStyle       0.0923817
		OceanStyle      0.821605
		Randomize      (0.215, -0.853, -0.919)
		colorDistMagn   0.69206
		colorDistFreq   0.0693383
		detailScale     265.682
		colorConversion true
		snowLevel       2
		tropicLatitude  0.733456
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615974
		terraceProb     0.201771
		erosion         0
		montesMagn      0.269453
		montesFreq      3.04973
		montesSpiky     0.925807
		montesFraction  0.667455
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.308073
		hillsFraction   0.470631
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226387
		craterFreq      0.244264
		craterDensity   1.08907
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   79.7686
		volcanoTemp     1603.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.167, 0.164, 0.000)
		colorShelf     (0.179, 0.178, 0.174, 0.000)
		colorBeach     (0.190, 0.188, 0.185, 0.000)
		colorDesert    (0.201, 0.199, 0.195, 0.000)
		colorLowland   (0.211, 0.209, 0.205, 0.000)
		colorUpland    (0.222, 0.220, 0.216, 0.000)
		colorRock      (0.232, 0.230, 0.226, 0.000)
		colorSnow      (0.243, 0.241, 0.236, 1.000)
		BumpHeight      8.7566
		BumpOffset      1.75132
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00487486
		Period          0.0322489
		Eccentricity    0.343564
		Inclination     25.0894
		AscendingNode   38.6306
		ArgOfPericenter -19.1923
		MeanAnomaly     -42.0756
	}
}

DwarfMoon	"6.D5"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            5.46287e-010
	Radius          10.2478
	InertiaMoment   0.398357

	Obliquity       -25.4346
	EqAscendNode    -85.2387
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.573 0.528 0.438)

	Surface
	{
		SurfStyle       0.166329
		OceanStyle      0.467308
		Randomize      (-0.747, 0.934, -0.811)
		colorDistMagn   0.516912
		colorDistFreq   0.0339543
		detailScale     279.833
		colorConversion true
		snowLevel       2
		tropicLatitude  0.599686
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391509
		terraceProb     0.349412
		erosion         0
		montesMagn      0.594718
		montesFreq      3.52907
		montesSpiky     0.825139
		montesFraction  0.430825
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.314602
		hillsFraction   0.765801
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246705
		craterFreq      0.241478
		craterDensity   1.05296
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   68.7425
		volcanoTemp     1068.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.211, 0.175, 0.000)
		colorShelf     (0.244, 0.224, 0.186, 0.000)
		colorBeach     (0.258, 0.238, 0.197, 0.000)
		colorDesert    (0.272, 0.251, 0.208, 0.000)
		colorLowland   (0.286, 0.264, 0.219, 0.000)
		colorUpland    (0.301, 0.277, 0.230, 0.000)
		colorRock      (0.315, 0.290, 0.241, 0.000)
		colorSnow      (0.329, 0.303, 0.252, 1.000)
		BumpHeight      9.22301
		BumpOffset      1.8446
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0051456
		Period          0.0349724
		Eccentricity    0.295123
		Inclination     -25.4346
		AscendingNode   -85.2387
		ArgOfPericenter -14.7817
		MeanAnomaly     -162.214
	}
}

DwarfMoon	"6.D6"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            8.00816e-010
	Radius          13.8913
	InertiaMoment   0.399393

	RotationPeriod  233.696
	Obliquity       -88.6547
	EqAscendNode    -3.81913

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.442 0.439 0.436)

	Surface
	{
		SurfStyle       0.410851
		OceanStyle      0.488944
		Randomize      (0.774, 0.781, 0.044)
		colorDistMagn   0.663493
		colorDistFreq   0.0972278
		detailScale     379.325
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0814409
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.322385
		terraceProb     0.567229
		erosion         0
		montesMagn      0.403992
		montesFreq      2.93601
		montesSpiky     0.90772
		montesFraction  0.619529
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.355649
		hillsFraction   0.683404
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234705
		craterFreq      0.157555
		craterDensity   0.825944
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   76.9631
		volcanoTemp     1462.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.176, 0.175, 0.000)
		colorShelf     (0.188, 0.187, 0.185, 0.000)
		colorBeach     (0.199, 0.198, 0.196, 0.000)
		colorDesert    (0.210, 0.209, 0.207, 0.000)
		colorLowland   (0.221, 0.220, 0.218, 0.000)
		colorUpland    (0.232, 0.231, 0.229, 0.000)
		colorRock      (0.243, 0.242, 0.240, 0.000)
		colorSnow      (0.254, 0.253, 0.251, 1.000)
		BumpHeight      12.5022
		BumpOffset      2.50044
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00562668
		Period          0.0399899
		Eccentricity    0.199815
		Inclination     -88.6547
		AscendingNode   -3.81913
		ArgOfPericenter -156.826
		MeanAnomaly     -76.6073
	}
}

DwarfMoon	"6.D7"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.15578e-009
	Radius          14.9561
	InertiaMoment   0.396815

	Obliquity       48.4719
	EqAscendNode    -158.887
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.730 0.727 0.726)

	Surface
	{
		SurfStyle       0.378607
		OceanStyle      0.934138
		Randomize      (-0.217, 0.161, -0.020)
		colorDistMagn   0.484295
		colorDistFreq   0.0522633
		detailScale     408.403
		colorConversion true
		snowLevel       2
		tropicLatitude  0.271715
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.649578
		terraceProb     0.379314
		erosion         0
		montesMagn      0.37566
		montesFreq      2.6029
		montesSpiky     0.940832
		montesFraction  0.579209
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.70627
		hillsFraction   0.504382
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247304
		craterFreq      0.218985
		craterDensity   1.05949
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   68.9744
		volcanoTemp     1451.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.291, 0.290, 0.000)
		colorShelf     (0.310, 0.309, 0.309, 0.000)
		colorBeach     (0.328, 0.327, 0.327, 0.000)
		colorDesert    (0.347, 0.346, 0.345, 0.000)
		colorLowland   (0.365, 0.364, 0.363, 0.000)
		colorUpland    (0.383, 0.382, 0.381, 0.000)
		colorRock      (0.401, 0.400, 0.399, 0.000)
		colorSnow      (0.420, 0.418, 0.418, 1.000)
		BumpHeight      13.4605
		BumpOffset      2.69211
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00587457
		Period          0.0426614
		Eccentricity    0.22112
		Inclination     48.4719
		AscendingNode   -158.887
		ArgOfPericenter -80.216
		MeanAnomaly     82.7057
	}
}

DwarfMoon	"6.D8"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.64657e-009
	Radius          16.165
	InertiaMoment   0.398526

	Obliquity       -81.0655
	EqAscendNode    -82.7338
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.608 0.535 0.427)

	Surface
	{
		SurfStyle       0.600919
		OceanStyle      0.394859
		Randomize      (-0.357, -0.639, 0.600)
		colorDistMagn   0.511569
		colorDistFreq   0.148451
		detailScale     441.412
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995057
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.340575
		terraceProb     0.126627
		erosion         0
		montesMagn      0.488517
		montesFreq      2.90752
		montesSpiky     0.931592
		montesFraction  0.549645
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.777274
		hillsFraction   0.636771
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236534
		craterFreq      0.235145
		craterDensity   0.892361
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   62.4586
		volcanoTemp     1403.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.182, 0.120, 0.000)
		colorShelf     (0.243, 0.187, 0.137, 0.000)
		colorBeach     (0.286, 0.219, 0.162, 0.000)
		colorDesert    (0.310, 0.235, 0.158, 0.000)
		colorLowland   (0.341, 0.251, 0.179, 0.000)
		colorUpland    (0.377, 0.305, 0.218, 0.000)
		colorRock      (0.408, 0.331, 0.235, 0.000)
		colorSnow      (0.444, 0.353, 0.248, 1.000)
		BumpHeight      14.5485
		BumpOffset      2.9097
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00627539
		Period          0.0471013
		Eccentricity    0.00145611
		Inclination     -81.0655
		AscendingNode   -82.7338
		ArgOfPericenter -178.295
		MeanAnomaly     -146.022
	}
}

DwarfMoon	"6.D9"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.32047e-009
	Radius          17.0501
	InertiaMoment   0.399522

	RotationPeriod  1397.68
	Obliquity       -32.5967
	EqAscendNode    21.6697

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.515 0.432 0.358)

	Surface
	{
		SurfStyle       0.456309
		OceanStyle      0.691703
		Randomize      (0.661, 0.551, 0.314)
		colorDistMagn   0.808357
		colorDistFreq   0.247346
		detailScale     465.583
		colorConversion true
		snowLevel       2
		tropicLatitude  0.897964
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.686958
		terraceProb     0.255872
		erosion         0
		montesMagn      0.526005
		montesFreq      2.9906
		montesSpiky     0.973768
		montesFraction  0.758842
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.558183
		hillsFraction   0.49141
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244042
		craterFreq      0.210879
		craterDensity   0.966074
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   55.494
		volcanoTemp     1554.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.173, 0.143, 0.000)
		colorShelf     (0.219, 0.184, 0.152, 0.000)
		colorBeach     (0.232, 0.194, 0.161, 0.000)
		colorDesert    (0.245, 0.205, 0.170, 0.000)
		colorLowland   (0.258, 0.216, 0.179, 0.000)
		colorUpland    (0.270, 0.227, 0.188, 0.000)
		colorRock      (0.283, 0.238, 0.197, 0.000)
		colorSnow      (0.296, 0.248, 0.206, 1.000)
		BumpHeight      15.3451
		BumpOffset      3.06903
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00680165
		Period          0.0531488
		Eccentricity    0.389996
		Inclination     -32.5967
		AscendingNode   21.6697
		ArgOfPericenter 17.6485
		MeanAnomaly     59.9773
	}
}

DwarfMoon	"6.D10"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.24076e-009
	Radius          22.3449
	InertiaMoment   0.397198

	Obliquity       -87.315
	EqAscendNode    172.214
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.489 0.483 0.476)

	Surface
	{
		SurfStyle       0.513436
		OceanStyle      0.25731
		Randomize      (-0.665, -0.524, -0.225)
		colorDistMagn   0.301467
		colorDistFreq   0.194868
		detailScale     610.165
		colorConversion true
		snowLevel       2
		tropicLatitude  0.135333
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.490456
		terraceProb     0.203805
		erosion         0
		montesMagn      0.398338
		montesFreq      3.3706
		montesSpiky     0.973824
		montesFraction  0.788011
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.23613
		hillsFraction   0.781336
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228419
		craterFreq      0.197639
		craterDensity   0.694997
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   61.5405
		volcanoTemp     1867.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.164, 0.133, 0.000)
		colorShelf     (0.196, 0.169, 0.152, 0.000)
		colorBeach     (0.230, 0.198, 0.181, 0.000)
		colorDesert    (0.250, 0.213, 0.176, 0.000)
		colorLowland   (0.274, 0.227, 0.200, 0.000)
		colorUpland    (0.303, 0.276, 0.243, 0.000)
		colorRock      (0.328, 0.300, 0.262, 0.000)
		colorSnow      (0.357, 0.319, 0.276, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00717445
		Period          0.0575778
		Eccentricity    0.242278
		Inclination     -87.315
		AscendingNode   172.214
		ArgOfPericenter 116.938
		MeanAnomaly     -99.5246
	}
}

DwarfMoon	"6.D11"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            4.49218e-009
	Radius          23.6541
	InertiaMoment   0.398686

	Obliquity       19.593
	EqAscendNode    26.3342
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.714 0.712 0.709)

	Surface
	{
		SurfStyle       0.96129
		OceanStyle      0.239635
		Randomize      (-0.136, 0.869, 0.790)
		colorDistMagn   0.66096
		colorDistFreq   0.219926
		detailScale     645.916
		colorConversion true
		snowLevel       2
		tropicLatitude  0.617248
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.542687
		terraceProb     0.192566
		erosion         0
		montesMagn      0.464829
		montesFreq      3.15899
		montesSpiky     0.889049
		montesFraction  0.515058
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.31487
		hillsFraction   0.590287
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251221
		craterFreq      0.208193
		craterDensity   1.03396
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   55.333
		volcanoTemp     1382.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.249, 0.283, 0.050)
		colorShelf     (0.286, 0.292, 0.326, 0.040)
		colorBeach     (0.329, 0.335, 0.369, 0.030)
		colorDesert    (0.371, 0.377, 0.418, 0.020)
		colorLowland   (0.414, 0.420, 0.461, 0.030)
		colorUpland    (0.457, 0.463, 0.503, 0.050)
		colorRock      (0.500, 0.505, 0.560, 0.020)
		colorSnow      (0.500, 0.505, 0.560, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00753828
		Period          0.0620126
		Eccentricity    0.136282
		Inclination     19.593
		AscendingNode   26.3342
		ArgOfPericenter 43.6458
		MeanAnomaly     -16.9093
	}
}

DwarfMoon	"6.D12"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            6.18856e-009
	Radius          25.2821
	InertiaMoment   0.39965

	RotationPeriod  2445.62
	Obliquity       61.6468
	EqAscendNode    87.515

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.631 0.629 0.627)

	Surface
	{
		SurfStyle       0.497568
		OceanStyle      0.729264
		Randomize      (0.667, -0.590, 0.014)
		colorDistMagn   0.849215
		colorDistFreq   0.280094
		detailScale     690.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.981404
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.603266
		terraceProb     0.204629
		erosion         0
		montesMagn      0.480125
		montesFreq      2.34784
		montesSpiky     0.78863
		montesFraction  0.648583
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.44726
		hillsFraction   0.6675
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253826
		craterFreq      0.256843
		craterDensity   0.99044
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   50.3877
		volcanoTemp     1489.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.251, 0.251, 0.000)
		colorShelf     (0.268, 0.267, 0.267, 0.000)
		colorBeach     (0.284, 0.283, 0.282, 0.000)
		colorDesert    (0.300, 0.299, 0.298, 0.000)
		colorLowland   (0.315, 0.314, 0.314, 0.000)
		colorUpland    (0.331, 0.330, 0.329, 0.000)
		colorRock      (0.347, 0.346, 0.345, 0.000)
		colorSnow      (0.363, 0.361, 0.361, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00815285
		Period          0.0697487
		Eccentricity    0.138584
		Inclination     61.6468
		AscendingNode   87.515
		ArgOfPericenter 153.565
		MeanAnomaly     -141.945
	}
}

DwarfMoon	"6.D13"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            8.48323e-009
	Radius          26.6415
	InertiaMoment   0.397498

	RotationPeriod  2749.69
	Obliquity       72.1478
	EqAscendNode    -68.8991

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.464 0.462 0.459)

	Surface
	{
		SurfStyle       0.951205
		OceanStyle      0.349556
		Randomize      (-0.513, 0.807, -0.701)
		colorDistMagn   0.872683
		colorDistFreq   0.0470402
		detailScale     727.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972669
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.513296
		terraceProb     0.143013
		erosion         0
		montesMagn      0.547999
		montesFreq      2.40137
		montesSpiky     0.994365
		montesFraction  0.541309
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.11613
		hillsFraction   0.487921
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259729
		craterFreq      0.211466
		craterDensity   1.01072
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   45.3506
		volcanoTemp     1298.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.158, 0.162, 0.183, 0.050)
		colorShelf     (0.186, 0.189, 0.211, 0.040)
		colorBeach     (0.213, 0.217, 0.238, 0.030)
		colorDesert    (0.241, 0.245, 0.271, 0.020)
		colorLowland   (0.269, 0.272, 0.298, 0.030)
		colorUpland    (0.297, 0.300, 0.326, 0.050)
		colorRock      (0.325, 0.328, 0.362, 0.020)
		colorSnow      (0.325, 0.328, 0.362, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00881536
		Period          0.0784208
		Eccentricity    0.321937
		Inclination     72.1478
		AscendingNode   -68.8991
		ArgOfPericenter -170.284
		MeanAnomaly     -21.2843
	}
}

DwarfMoon	"6.D14"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.15834e-008
	Radius          34.5332
	InertiaMoment   0.398837

	Obliquity       1.34994
	EqAscendNode    124.749
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.786 0.706 0.639)

	Surface
	{
		SurfStyle       0.706309
		OceanStyle      0.0607961
		Randomize      (0.107, -0.408, 0.768)
		colorDistMagn   0.323735
		colorDistFreq   0.934633
		detailScale     942.987
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0218462
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.602067
		terraceProb     0.203388
		erosion         0
		montesMagn      0.53121
		montesFreq      3.27459
		montesSpiky     0.958382
		montesFraction  0.559368
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.7622
		hillsFraction   0.423096
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242795
		craterFreq      0.273688
		craterDensity   1.04757
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   50.3065
		volcanoTemp     1562.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.240, 0.179, 0.000)
		colorShelf     (0.314, 0.247, 0.204, 0.000)
		colorBeach     (0.369, 0.289, 0.243, 0.000)
		colorDesert    (0.401, 0.311, 0.236, 0.000)
		colorLowland   (0.440, 0.332, 0.268, 0.000)
		colorUpland    (0.487, 0.402, 0.326, 0.000)
		colorRock      (0.526, 0.438, 0.351, 0.000)
		colorSnow      (0.574, 0.466, 0.371, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0090211
		Period          0.0811822
		Eccentricity    0.164122
		Inclination     1.34994
		AscendingNode   124.749
		ArgOfPericenter 143.763
		MeanAnomaly     -125.505
	}
}

DwarfMoon	"6.D15"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.57706e-008
	Radius          36.1698
	InertiaMoment   0.399776

	Obliquity       57.8565
	EqAscendNode    -130.84
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.534 0.528 0.522)

	Surface
	{
		SurfStyle       0.453938
		OceanStyle      0.926884
		Randomize      (0.741, 0.481, -0.556)
		colorDistMagn   0.249568
		colorDistFreq   1.14075
		detailScale     987.677
		colorConversion true
		snowLevel       2
		tropicLatitude  0.659267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.700953
		terraceProb     0.574598
		erosion         0
		montesMagn      0.430854
		montesFreq      3.0544
		montesSpiky     0.984188
		montesFraction  0.270662
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.98512
		hillsFraction   0.633232
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274699
		craterFreq      0.206486
		craterDensity   0.879743
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   45.1574
		volcanoTemp     1491.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.211, 0.209, 0.000)
		colorShelf     (0.227, 0.225, 0.222, 0.000)
		colorBeach     (0.240, 0.238, 0.235, 0.000)
		colorDesert    (0.253, 0.251, 0.248, 0.000)
		colorLowland   (0.267, 0.264, 0.261, 0.000)
		colorUpland    (0.280, 0.277, 0.274, 0.000)
		colorRock      (0.293, 0.291, 0.287, 0.000)
		colorSnow      (0.307, 0.304, 0.300, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00966977
		Period          0.090094
		Eccentricity    0.0451513
		Inclination     57.8565
		AscendingNode   -130.84
		ArgOfPericenter 16.487
		MeanAnomaly     -110.837
	}
}

DwarfMoon	"6.D16"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.14286e-008
	Radius          38.4693
	InertiaMoment   0.397751

	Obliquity       84.7516
	EqAscendNode    -22.2715
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.695 0.653 0.604)

	Surface
	{
		SurfStyle       0.660982
		OceanStyle      0.807719
		Randomize      (0.391, 0.500, -0.949)
		colorDistMagn   0.715754
		colorDistFreq   0.454686
		detailScale     1050.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.416168
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53581
		terraceProb     0.191732
		erosion         0
		montesMagn      0.570096
		montesFreq      2.63949
		montesSpiky     0.969522
		montesFraction  0.187173
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.04444
		hillsFraction   0.81587
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.281279
		craterFreq      0.239762
		craterDensity   0.976372
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.2025
		volcanoTemp     1581.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.222, 0.169, 0.000)
		colorShelf     (0.278, 0.228, 0.193, 0.000)
		colorBeach     (0.327, 0.268, 0.229, 0.000)
		colorDesert    (0.354, 0.287, 0.223, 0.000)
		colorLowland   (0.389, 0.307, 0.254, 0.000)
		colorUpland    (0.431, 0.372, 0.308, 0.000)
		colorRock      (0.465, 0.405, 0.332, 0.000)
		colorSnow      (0.507, 0.431, 0.350, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0099897
		Period          0.094602
		Eccentricity    0.139372
		Inclination     84.7516
		AscendingNode   -22.2715
		ArgOfPericenter -34.6918
		MeanAnomaly     25.113
	}
}

DwarfMoon	"6.D17"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.90845e-008
	Radius          40.5978
	InertiaMoment   0.398982

	RotationPeriod  1737.93
	Obliquity       -3.2897
	EqAscendNode    113.549

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.609 0.606 0.601)

	Surface
	{
		SurfStyle       0.477307
		OceanStyle      0.417385
		Randomize      (-0.824, 0.220, 0.041)
		colorDistMagn   0.774515
		colorDistFreq   1.14081
		detailScale     1108.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0628549
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.572342
		terraceProb     0.112196
		erosion         0
		montesMagn      0.60239
		montesFreq      2.81242
		montesSpiky     0.893971
		montesFraction  0.406478
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.8279
		hillsFraction   0.714645
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229242
		craterFreq      0.227029
		craterDensity   0.863033
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.3231
		volcanoTemp     1386.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.242, 0.241, 0.000)
		colorShelf     (0.259, 0.258, 0.256, 0.000)
		colorBeach     (0.274, 0.273, 0.271, 0.000)
		colorDesert    (0.289, 0.288, 0.286, 0.000)
		colorLowland   (0.304, 0.303, 0.301, 0.000)
		colorUpland    (0.320, 0.318, 0.316, 0.000)
		colorRock      (0.335, 0.333, 0.331, 0.000)
		colorSnow      (0.350, 0.348, 0.346, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0103061
		Period          0.0991313
		Eccentricity    0.328965
		Inclination     -3.2897
		AscendingNode   113.549
		ArgOfPericenter -38.9917
		MeanAnomaly     -121.17
	}
}

DwarfMoon	"6.D18"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.94665e-008
	Radius          52.6327
	InertiaMoment   0.399901

	Obliquity       -2.82605
	EqAscendNode    104.639
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.751 0.703 0.673)

	Surface
	{
		SurfStyle       0.792623
		OceanStyle      0.606875
		Randomize      (0.768, 0.647, -0.663)
		colorDistMagn   0.430926
		colorDistFreq   1.18227
		detailScale     1437.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0602472
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.682817
		terraceProb     0.355933
		erosion         0
		montesMagn      0.388085
		montesFreq      3.64221
		montesSpiky     0.986237
		montesFraction  0.259218
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.79731
		hillsFraction   0.559072
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24901
		craterFreq      0.225828
		craterDensity   0.778092
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.5382
		volcanoTemp     1435.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.239, 0.189, 0.000)
		colorShelf     (0.300, 0.246, 0.215, 0.000)
		colorBeach     (0.353, 0.288, 0.256, 0.000)
		colorDesert    (0.383, 0.309, 0.249, 0.000)
		colorLowland   (0.420, 0.330, 0.283, 0.000)
		colorUpland    (0.465, 0.401, 0.343, 0.000)
		colorRock      (0.503, 0.436, 0.370, 0.000)
		colorSnow      (0.548, 0.464, 0.390, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0107588
		Period          0.105735
		Eccentricity    0.132767
		Inclination     -2.82605
		AscendingNode   104.639
		ArgOfPericenter 15.067
		MeanAnomaly     -103.198
	}
}

DwarfMoon	"6.D19"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            5.35878e-008
	Radius          54.7232
	InertiaMoment   0.397972

	RotationPeriod  2901.25
	Obliquity       -74.0767
	EqAscendNode    122.32

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.853 0.787 0.744)

	Surface
	{
		SurfStyle       0.218754
		OceanStyle      0.336737
		Randomize      (0.357, 0.221, -0.894)
		colorDistMagn   0.354985
		colorDistFreq   1.83725
		detailScale     1494.31
		colorConversion true
		snowLevel       2
		tropicLatitude  0.821872
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.373001
		terraceProb     0.424437
		erosion         0
		montesMagn      0.672919
		montesFreq      2.95523
		montesSpiky     0.965968
		montesFraction  0.383051
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.55129
		hillsFraction   0.808259
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244368
		craterFreq      0.249824
		craterDensity   0.76639
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.0633
		volcanoTemp     1458.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.341, 0.315, 0.298, 0.000)
		colorShelf     (0.363, 0.334, 0.316, 0.000)
		colorBeach     (0.384, 0.354, 0.335, 0.000)
		colorDesert    (0.405, 0.374, 0.354, 0.000)
		colorLowland   (0.427, 0.393, 0.372, 0.000)
		colorUpland    (0.448, 0.413, 0.391, 0.000)
		colorRock      (0.469, 0.433, 0.409, 0.000)
		colorSnow      (0.491, 0.452, 0.428, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0110679
		Period          0.110324
		Eccentricity    0.344374
		Inclination     -74.0767
		AscendingNode   122.32
		ArgOfPericenter -22.2929
		MeanAnomaly     -150.837
	}
}

DwarfMoon	"6.D20"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            7.28709e-008
	Radius          58.1781
	InertiaMoment   0.399122

	Obliquity       31.4136
	EqAscendNode    70.5872
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.692 0.613 0.523)

	Surface
	{
		SurfStyle       0.0424013
		OceanStyle      0.273589
		Randomize      (0.953, 0.212, 0.646)
		colorDistMagn   0.45848
		colorDistFreq   1.58934
		detailScale     1588.65
		colorConversion true
		snowLevel       2
		tropicLatitude  0.77
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.688284
		terraceProb     0.476892
		erosion         0
		montesMagn      0.44251
		montesFreq      2.31677
		montesSpiky     0.945561
		montesFraction  0.30619
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.60318
		hillsFraction   0.713619
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277542
		craterFreq      0.242481
		craterDensity   0.957697
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   33.79
		volcanoTemp     1407.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.245, 0.209, 0.000)
		colorShelf     (0.294, 0.260, 0.222, 0.000)
		colorBeach     (0.311, 0.276, 0.235, 0.000)
		colorDesert    (0.329, 0.291, 0.248, 0.000)
		colorLowland   (0.346, 0.306, 0.261, 0.000)
		colorUpland    (0.363, 0.322, 0.274, 0.000)
		colorRock      (0.380, 0.337, 0.288, 0.000)
		colorSnow      (0.398, 0.352, 0.301, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0113777
		Period          0.114988
		Eccentricity    0.00991952
		Inclination     31.4136
		AscendingNode   70.5872
		ArgOfPericenter 175.925
		MeanAnomaly     -53.0484
	}
}

Barycenter	"7-7.1"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Mass            0.254508
	Radius          868.846
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
		SemiMajorAxis   0.440313
		Period          1.02653
		Eccentricity    0.0140592
		Inclination     -0.0434167
		AscendingNode   -145.79
		ArgOfPericenter 332.925
		MeanAnomaly     188.102
	}
}

Planet	"7"
{
	ParentBody     "7-7.1"
	Class	       "IceWorld"

	Mass            0.131163
	Radius          4067.43
	InertiaMoment   0.332209

	Oblateness      0.0030792

	Obliquity       -1.49926
	EqAscendNode    69.0938
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.762 0.656 0.586)

	Surface
	{
		SurfStyle       0.906259
		OceanStyle      0.967153
		Randomize      (0.035, -0.267, -0.272)
		colorDistMagn   0.0546795
		colorDistFreq   489.785
		detailScale     10461.7
		colorConversion true
		drivenDarkening 0
		seaLevel        0.218005
		snowLevel       2
		tropicLatitude  0.0430903
		icecapLatitude  0.531162
		icecapHeight    0.229611
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.68279
		venusFreq       1.29212
		venusMagn       0.154332
		mareFreq        1.61636
		mareDensity     0.0195457
		terraceProb     0.305183
		erosion         0
		montesMagn      0.214452
		montesFreq      239.604
		montesSpiky     0.731292
		montesFraction  0.472389
		dunesMagn       0.0293673
		dunesFreq       5334.25
		dunesFraction   0.980432
		hillsMagn       0.116234
		hillsFreq       527.963
		hillsFraction   0.601221
		hills2Fraction  0.0674266
		riversMagn      60.2505
		riversFreq      1.46159
		riversSin       7.54747
		riversOctaves   0
		canyonsMagn     0.530652
		canyonsFreq     1.60674
		canyonFraction  0
		cracksMagn      0.0314855
		cracksFreq      1.13666
		cracksOctaves   2
		craterMagn      0.536124
		craterFreq      9.31793
		craterDensity   0.927604
		craterOctaves   12
		craterRayedFactor 0.238259
		volcanoMagn     0.791098
		volcanoFreq     3.641
		volcanoDensity  0.4
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0.171297
		volcanoRadius   0.534268
		volcanoTemp     1389.54
		lavaCoverTidal  0.357051
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.579, 0.466, 0.340, 1.000)
		colorShelf     (0.579, 0.466, 0.340, 1.000)
		colorBeach     (0.533, 0.407, 0.293, 1.000)
		colorDesert    (0.533, 0.407, 0.293, 1.000)
		colorLowland   (0.647, 0.532, 0.445, 1.000)
		colorUpland    (0.678, 0.584, 0.504, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.647, 0.532, 0.445, 1.000)
		colorUpPlants  (0.678, 0.584, 0.504, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999781
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
		Height          274.61
		Density         2.19136e-005
		Pressure        2.29339e-005
		Greenhouse      0.114896
		Bright          1.85414
		Opacity         0
		SkyLight        0.618047
		Hue             -0.0348492
		Saturation      1

		Composition
		{
			H2    	91.0668
			N2    	8.13192
			Ar    	0.626524
			CH4   	0.140701
			CO    	0.0259739
			Ne    	0.00651871
			He    	0.00154737
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000111721
		Period          0.00401237
		Eccentricity    0.0222629
		Inclination     -1.49926
		AscendingNode   69.0938
		ArgOfPericenter 172.561
		MeanAnomaly     49.1186
	}
}

Moon	"7.1"
{
	ParentBody     "7-7.1"
	Class	       "Desert"

	Mass            0.123345
	Radius          3988.66
	InertiaMoment   0.327152

	Oblateness      0.00303135

	Obliquity       -1.49926
	EqAscendNode    69.0938
	TidalLocked     true

	AlbedoBond      0.381994
	AlbedoGeom      0.458393
	Brightness      2
	Color          (0.524 0.520 0.512)

	Surface
	{
		SurfStyle       0.0442764
		OceanStyle      0.412722
		Randomize      (-0.365, 0.812, -0.521)
		colorDistMagn   0.0823313
		colorDistFreq   485.301
		detailScale     10259.1
		colorConversion true
		seaLevel        0.135203
		snowLevel       0.85
		tropicLatitude  0.0430903
		icecapLatitude  0.847276
		icecapHeight    0.139125
		climatePole     0.9375
		climateTropic   0.528877
		climateEquator  0.6875
		heightTempGrad  0.408623
		tropicWidth     0.392116
		mainFreq        0.900163
		venusFreq       1.09756
		venusMagn       0.444932
		mareFreq        2.21927
		mareDensity     0.020029
		terraceProb     0.299551
		erosion         0
		montesMagn      0.21735
		montesFreq      183.326
		montesSpiky     0.983471
		montesFraction  0.617507
		dunesMagn       0.0371951
		dunesFreq       32.1328
		dunesFraction   0.486531
		hillsMagn       0.100267
		hillsFreq       550.855
		hillsFraction   0
		hills2Fraction  0
		riversMagn      70.2757
		riversFreq      3.61329
		riversSin       5.5043
		riversOctaves   0
		canyonsMagn     0.0485228
		canyonsFreq     110.933
		canyonFraction  0
		cracksMagn      0.100464
		cracksFreq      0.465291
		cracksOctaves   0
		craterMagn      0.580754
		craterFreq      12.9751
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.637079
		volcanoFreq     2.67624
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.889419
		volcanoRadius   0.397114
		volcanoTemp     1253.86
		lavaCoverTidal  0.370569
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      2.63179
		twistMagn       0.0878977
		cycloneMagn     1.97802
		cycloneFreq     0.211126
		cycloneDensity  0.00942343
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
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          12.3406
		BumpHeight      6.44825
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.996196
		mainOctaves     10
		Coverage        0.363989
		twistZones      2.63179
		twistMagn       0.0878977
	}

	Clouds
	{
		Height          14.6812
		BumpHeight      5.64834
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.996196
		mainOctaves     10
		Coverage        0.363989
		twistZones      2.63179
		twistMagn       0.0878977
	}

	Clouds
	{
		Height          17.0217
		BumpHeight      6.19557
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.996196
		mainOctaves     10
		Coverage        0.363989
		twistZones      2.63179
		twistMagn       0.0878977
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          92.0944
		Density         8.30011
		Pressure        2.70866
		Greenhouse      2.94301
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0307232
		Saturation      0.991191

		Composition
		{
			CO2   	96.8245
			N2    	3.15275
			CO    	0.0222839
			Ar    	0.000342118
			Ne    	5.34422e-005
			He    	3.68035e-005
			Kr    	1.66367e-005
		}
	}

	Aurora
	{
		Height      77.7424
		NorthLat    63.4118
		NorthLon    179.47
		NorthRadius 499.584
		NorthWidth  578.183
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -75.1115
		SouthLon    366.645
		SouthRadius 956.722
		SouthWidth  802.901
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
		SemiMajorAxis   0.000118802
		Period          0.00401237
		Eccentricity    0.0222629
		Inclination     -1.49926
		AscendingNode   69.0938
		ArgOfPericenter -7.43899
		MeanAnomaly     49.1186
	}
}

Planet	"8"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "GasGiant"

	Mass            230.648
	Radius          68873.7
	InertiaMoment   0.189363

	Oblateness      0.0945641

	RotationPeriod  8.25068
	Obliquity       23.4158
	EqAscendNode    -176.268

	AlbedoBond      0.456415
	AlbedoGeom      0.547698
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.594359
		Randomize      (0.646, -0.476, 0.072)
		detailScale     177147
		colorConversion true
		tropicLatitude  0.383463
		icecapLatitude  1
		mainFreq        0.0456734
		venusFreq       7.34819
		venusMagn       0.378086
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      7.39476
		twistMagn       1.4142
		cycloneMagn     12.0723
		cycloneFreq     0.150286
		cycloneDensity  0.0494088
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
		BumpHeight      14.2205
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          59.2031
		BumpHeight      55.3485
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.06345
		mainOctaves     10
		Coverage        0.0641489
		twistZones      7.39476
		twistMagn       1.4142
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          239.12
		Density         11775.1
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0220657
		Saturation      0.634264

		Composition
		{
			H2    	92.8112
			He    	7.18784
			Ne    	0.000901273
			N2    	4.09808e-005
		}
	}

	Aurora
	{
		Height      1550.14
		NorthLat    85.1257
		NorthLon    -147.773
		NorthRadius 17842.6
		NorthWidth  8224.57
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -83.5337
		SouthLon    27.7997
		SouthRadius 21704.9
		SouthWidth  11122.2
		SouthRings  5
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     78178.5
		OuterRadius     158054
		RotationPeriod  7.40581
		RotationOffset  0
		FrontBright     0.917781
		BackBright      0.757231
		Density         0.593589
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.934934
		Period          3.16274
		Eccentricity    0.0905607
		Inclination     0.87009
		AscendingNode   -175.578
		ArgOfPericenter 300.698
		MeanAnomaly     264.634
	}
}

DwarfMoon	"8.D1"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            5.69273e-010
	Radius          13.3801
	InertiaMoment   0.398912

	Oblateness      0.249

	Obliquity       0.0101946
	EqAscendNode    -28.3042
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.638 0.537 0.491)

	Surface
	{
		SurfStyle       0.607909
		OceanStyle      0.68954
		Randomize      (-0.893, 0.887, 0.630)
		colorDistMagn   0.167912
		colorDistFreq   0.0574222
		detailScale     365.366
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.42176
		terraceProb     0.458258
		erosion         0
		montesMagn      0.520955
		montesFreq      2.64047
		montesSpiky     0.977456
		montesFraction  0.405713
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.317027
		hillsFraction   0.785605
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201002
		craterFreq      0.241096
		craterDensity   0.810392
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   87.9236
		volcanoTemp     1757.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.183, 0.137, 0.000)
		colorShelf     (0.255, 0.188, 0.157, 0.000)
		colorBeach     (0.300, 0.220, 0.186, 0.000)
		colorDesert    (0.325, 0.236, 0.182, 0.000)
		colorLowland   (0.357, 0.252, 0.206, 0.000)
		colorUpland    (0.395, 0.306, 0.250, 0.000)
		colorRock      (0.427, 0.333, 0.270, 0.000)
		colorSnow      (0.466, 0.355, 0.285, 1.000)
		BumpHeight      12.0421
		BumpOffset      2.40842
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000859446
		Period          0.000959472
		Eccentricity    6.11925e-006
		Inclination     0.0101946
		AscendingNode   -28.3042
		ArgOfPericenter -87.7113
		MeanAnomaly     -171.476
	}
}

DwarfMoon	"8.D2"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            8.33021e-010
	Radius          13.8619
	InertiaMoment   0.399841

	Oblateness      0.249

	Obliquity       0.00360616
	EqAscendNode    -96.2365
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.455 0.450 0.442)

	Surface
	{
		SurfStyle       0.092853
		OceanStyle      0.376538
		Randomize      (-0.848, -0.535, 0.066)
		colorDistMagn   0.726963
		colorDistFreq   0.0672471
		detailScale     378.523
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.588641
		terraceProb     0.483953
		erosion         0
		montesMagn      0.664197
		montesFreq      2.48488
		montesSpiky     0.850621
		montesFraction  0.487085
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.362776
		hillsFraction   0.54544
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255957
		craterFreq      0.243983
		craterDensity   0.868784
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   75.3011
		volcanoTemp     1856.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.180, 0.177, 0.000)
		colorShelf     (0.193, 0.191, 0.188, 0.000)
		colorBeach     (0.205, 0.202, 0.199, 0.000)
		colorDesert    (0.216, 0.214, 0.210, 0.000)
		colorLowland   (0.228, 0.225, 0.221, 0.000)
		colorUpland    (0.239, 0.236, 0.232, 0.000)
		colorRock      (0.250, 0.247, 0.243, 0.000)
		colorSnow      (0.262, 0.259, 0.254, 1.000)
		BumpHeight      12.4757
		BumpOffset      2.49514
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000905784
		Period          0.00103811
		Eccentricity    3.73795e-005
		Inclination     0.00360616
		AscendingNode   -96.2365
		ArgOfPericenter -87.0026
		MeanAnomaly     106.06
	}
}

DwarfMoon	"8.D3"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.20048e-009
	Radius          14.9833
	InertiaMoment   0.397868

	Oblateness      0.249

	Obliquity       0.00211584
	EqAscendNode    -112.082
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.645 0.640 0.637)

	Surface
	{
		SurfStyle       0.942974
		OceanStyle      0.278474
		Randomize      (-0.915, -0.123, -0.017)
		colorDistMagn   0.351395
		colorDistFreq   0.0907886
		detailScale     409.145
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.69712
		terraceProb     0.114683
		erosion         0
		montesMagn      0.56006
		montesFreq      2.7622
		montesSpiky     0.902072
		montesFraction  0.463922
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.447714
		hillsFraction   0.820241
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.28396
		craterFreq      0.219383
		craterDensity   0.835142
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   67.8013
		volcanoTemp     1368.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.224, 0.255, 0.050)
		colorShelf     (0.258, 0.262, 0.293, 0.040)
		colorBeach     (0.297, 0.301, 0.331, 0.030)
		colorDesert    (0.335, 0.339, 0.376, 0.020)
		colorLowland   (0.374, 0.377, 0.414, 0.030)
		colorUpland    (0.413, 0.416, 0.452, 0.050)
		colorRock      (0.452, 0.454, 0.503, 0.020)
		colorSnow      (0.452, 0.454, 0.503, 1.000)
		BumpHeight      13.485
		BumpOffset      2.697
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000920762
		Period          0.00106396
		Eccentricity    2.4154e-005
		Inclination     0.00211584
		AscendingNode   -112.082
		ArgOfPericenter 176.543
		MeanAnomaly     25.2351
	}
}

DwarfMoon	"8.D4"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.70813e-009
	Radius          16.1701
	InertiaMoment   0.399055

	Oblateness      0.249

	Obliquity       -0.0132291
	EqAscendNode    -165.324
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.550 0.543 0.537)

	Surface
	{
		SurfStyle       0.678349
		OceanStyle      0.591953
		Randomize      (0.527, 0.210, -0.083)
		colorDistMagn   0.37944
		colorDistFreq   0.0674238
		detailScale     441.552
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.599696
		terraceProb     0.191193
		erosion         0
		montesMagn      0.609592
		montesFreq      2.76556
		montesSpiky     0.923276
		montesFraction  0.801933
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.661748
		hillsFraction   0.730566
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223523
		craterFreq      0.203128
		craterDensity   0.9988
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   61.3421
		volcanoTemp     1807.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.185, 0.150, 0.000)
		colorShelf     (0.220, 0.190, 0.172, 0.000)
		colorBeach     (0.258, 0.223, 0.204, 0.000)
		colorDesert    (0.280, 0.239, 0.199, 0.000)
		colorLowland   (0.308, 0.255, 0.225, 0.000)
		colorUpland    (0.341, 0.310, 0.274, 0.000)
		colorRock      (0.368, 0.337, 0.295, 0.000)
		colorSnow      (0.401, 0.358, 0.311, 1.000)
		BumpHeight      14.5531
		BumpOffset      2.91062
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000945296
		Period          0.00110677
		Eccentricity    4.42219e-005
		Inclination     -0.0132291
		AscendingNode   -165.324
		ArgOfPericenter 58.0982
		MeanAnomaly     70.9681
	}
}

DwarfMoon	"8.D5"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.40474e-009
	Radius          22.6944
	InertiaMoment   0.399966

	Oblateness      0.249

	Obliquity       -0.00873565
	EqAscendNode    -129.006
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.691 0.633 0.519)

	Surface
	{
		SurfStyle       0.358932
		OceanStyle      0.650296
		Randomize      (0.576, 0.298, 0.570)
		colorDistMagn   0.18815
		colorDistFreq   0.119436
		detailScale     619.707
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.42861
		terraceProb     0.100396
		erosion         0
		montesMagn      0.456091
		montesFreq      2.91406
		montesSpiky     0.926555
		montesFraction  0.478148
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.53388
		hillsFraction   0.597717
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.281574
		craterFreq      0.21866
		craterDensity   0.673105
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   72.5587
		volcanoTemp     1346.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.253, 0.208, 0.000)
		colorShelf     (0.294, 0.269, 0.221, 0.000)
		colorBeach     (0.311, 0.285, 0.234, 0.000)
		colorDesert    (0.328, 0.301, 0.247, 0.000)
		colorLowland   (0.345, 0.317, 0.260, 0.000)
		colorUpland    (0.363, 0.332, 0.273, 0.000)
		colorRock      (0.380, 0.348, 0.286, 0.000)
		colorSnow      (0.397, 0.364, 0.299, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000959941
		Period          0.00113259
		Eccentricity    2.54096e-005
		Inclination     -0.00873565
		AscendingNode   -129.006
		ArgOfPericenter 153.397
		MeanAnomaly     -19.6557
	}
}

DwarfMoon	"8.D6"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.35556e-009
	Radius          22.2269
	InertiaMoment   0.398077

	Oblateness      0.249

	Obliquity       0.00351471
	EqAscendNode    0.0771198
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.783 0.781 0.779)

	Surface
	{
		SurfStyle       0.00660599
		OceanStyle      0.0766079
		Randomize      (0.144, -0.281, -0.349)
		colorDistMagn   0.908046
		colorDistFreq   0.311063
		detailScale     606.943
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.272838
		terraceProb     0.149606
		erosion         0
		montesMagn      0.415446
		montesFreq      3.26891
		montesSpiky     0.804386
		montesFraction  0.44457
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.1585
		hillsFraction   0.723515
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267437
		craterFreq      0.217519
		craterDensity   0.701013
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   60.1593
		volcanoTemp     1417.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.312, 0.312, 0.000)
		colorShelf     (0.333, 0.332, 0.331, 0.000)
		colorBeach     (0.352, 0.351, 0.351, 0.000)
		colorDesert    (0.372, 0.371, 0.370, 0.000)
		colorLowland   (0.391, 0.390, 0.390, 0.000)
		colorUpland    (0.411, 0.410, 0.409, 0.000)
		colorRock      (0.431, 0.429, 0.429, 0.000)
		colorSnow      (0.450, 0.449, 0.448, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00101453
		Period          0.00123055
		Eccentricity    4.7231e-005
		Inclination     0.00351471
		AscendingNode   0.0771198
		ArgOfPericenter -163.692
		MeanAnomaly     -67.1878
	}
}

DwarfMoon	"8.D7"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            4.648e-009
	Radius          23.6615
	InertiaMoment   0.399192

	Oblateness      0.220703

	Obliquity       -0.0065038
	EqAscendNode    -108.777
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.666 0.509 0.453)

	Surface
	{
		SurfStyle       0.839774
		OceanStyle      0.343797
		Randomize      (-0.713, 0.774, 0.072)
		colorDistMagn   0.985906
		colorDistFreq   0.393295
		detailScale     646.118
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.717869
		terraceProb     0.167975
		erosion         0
		montesMagn      0.315564
		montesFreq      3.06885
		montesSpiky     0.901146
		montesFraction  0.41552
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.00175
		hillsFraction   0.701483
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217352
		craterFreq      0.184206
		craterDensity   0.949403
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   54.4147
		volcanoTemp     1603.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.173, 0.127, 0.000)
		colorShelf     (0.266, 0.178, 0.145, 0.000)
		colorBeach     (0.313, 0.209, 0.172, 0.000)
		colorDesert    (0.340, 0.224, 0.167, 0.000)
		colorLowland   (0.373, 0.239, 0.190, 0.000)
		colorUpland    (0.413, 0.290, 0.231, 0.000)
		colorRock      (0.446, 0.315, 0.249, 0.000)
		colorSnow      (0.486, 0.336, 0.263, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00103343
		Period          0.0012651
		Eccentricity    7.31494e-008
		Inclination     -0.0065038
		AscendingNode   -108.777
		ArgOfPericenter 27.486
		MeanAnomaly     -93.1682
	}
}

Moon	"8.1"
{
	ParentBody     "8"
	Class	       "Selena"

	Mass            0.00676561
	Radius          1652.79
	InertiaMoment   0.386919

	Oblateness      0.011758

	Obliquity       0.208797
	EqAscendNode    152.24
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.686 0.614 0.536)

	Surface
	{
		SurfStyle       0.51596
		OceanStyle      0.127193
		Randomize      (-0.602, -0.098, -0.457)
		colorDistMagn   0.083897
		colorDistFreq   235.601
		detailScale     4251.07
		colorConversion true
		drivenDarkening 0
		seaLevel        0.229958
		snowLevel       2
		tropicLatitude  0.00176052
		icecapLatitude  10
		icecapHeight    0.127511
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.57135
		venusFreq       0.213423
		venusMagn       0
		mareFreq        0.754972
		mareDensity     0.00132808
		terraceProb     0.641529
		erosion         0
		montesMagn      0.0695019
		montesFreq      88.1004
		montesSpiky     0.944949
		montesFraction  0.129405
		dunesMagn       0.0202211
		dunesFreq       2180.06
		dunesFraction   0.577884
		hillsMagn       0.13642
		hillsFreq       195.523
		hillsFraction   0.232924
		hills2Fraction  0
		riversMagn      57.3952
		riversFreq      3.64108
		riversSin       5.92652
		riversOctaves   0
		canyonsMagn     0.644085
		canyonsFreq     0.650229
		canyonFraction  0.540658
		cracksMagn      0.0409733
		cracksFreq      0.824681
		cracksOctaves   0
		craterMagn      0.600764
		craterFreq      5.20706
		craterDensity   0.596288
		craterOctaves   6.97967
		craterRayedFactor 0.0507011
		volcanoMagn     0.238348
		volcanoFreq     3.07209
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.321276
		volcanoRadius   0.806533
		volcanoTemp     1402.79
		lavaCoverTidal  0.406094
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.425, 0.374, 0.290, 0.000)
		colorDesert    (0.446, 0.380, 0.295, 0.000)
		colorLowland   (0.350, 0.282, 0.225, 0.000)
		colorUpland    (0.514, 0.436, 0.333, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999754
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
		Height          82.6395
		Density         2.45766e-005
		Pressure        2.14823e-005
		Greenhouse      0.272056
		Bright          1.89716
		Opacity         0
		SkyLight        0.632387
		Hue             -0.0399347
		Saturation      1

		Composition
		{
			H2O   	52.5496
			CO2   	35.9823
			CH4   	4.76234
			SO2   	3.44874
			N2    	1.50137
			C2H2  	1.14927
			NH3   	0.195603
			C2H4  	0.15168
			H2S   	0.146852
			C2H6  	0.099592
			Ar    	0.0053211
			CO    	0.003787
			C3H8  	0.00343069
			Ne    	5.33185e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00166703
		Period          0.00259188
		Eccentricity    0.0376797
		Inclination     0.208797
		AscendingNode   152.24
		ArgOfPericenter 102.272
		MeanAnomaly     137.554
	}
}

Moon	"8.2"
{
	ParentBody     "8"
	Class	       "IceWorld"

	Mass            0.00787998
	Radius          1635.07
	InertiaMoment   0.38252

	Oblateness      0.00246411

	Obliquity       0.867162
	EqAscendNode    -83.2017
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.763 0.629 0.473)

	Surface
	{
		SurfStyle       0.489988
		OceanStyle      0.135172
		Randomize      (-0.947, -0.384, -0.526)
		colorDistMagn   0.0623349
		colorDistFreq   183.107
		detailScale     4205.5
		colorConversion true
		drivenDarkening 0
		seaLevel        0.208542
		snowLevel       2
		tropicLatitude  0.022634
		icecapLatitude  0.770547
		icecapHeight    0.221781
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76407
		venusFreq       1.22343
		venusMagn       0.131379
		mareFreq        0.66489
		mareDensity     0.00221568
		terraceProb     0.173447
		erosion         0
		montesMagn      0.0714867
		montesFreq      75.2497
		montesSpiky     0.965143
		montesFraction  0.753399
		dunesMagn       0.0449961
		dunesFreq       2186.49
		dunesFraction   0.09222
		hillsMagn       0.118455
		hillsFreq       188.284
		hillsFraction   0.720702
		hills2Fraction  0.279178
		riversMagn      70.0171
		riversFreq      2.30082
		riversSin       6.26619
		riversOctaves   0
		canyonsMagn     0.459607
		canyonsFreq     0.437593
		canyonFraction  0
		cracksMagn      0.0204311
		cracksFreq      1.04835
		cracksOctaves   1
		craterMagn      0.610017
		craterFreq      4.44685
		craterDensity   0.798904
		craterOctaves   11
		craterRayedFactor 0.375977
		volcanoMagn     0.269979
		volcanoFreq     1.05849
		volcanoDensity  0.0545574
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.317156
		volcanoRadius   0.764202
		volcanoTemp     1857.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.157, 0.104, 0.000)
		colorShelf     (0.282, 0.195, 0.133, 0.000)
		colorBeach     (0.427, 0.296, 0.199, 0.200)
		colorDesert    (0.389, 0.277, 0.175, 0.500)
		colorLowland   (0.298, 0.214, 0.133, 0.800)
		colorUpland    (0.504, 0.377, 0.246, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.298, 0.214, 0.133, 0.800)
		colorUpPlants  (0.504, 0.377, 0.246, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999967
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
		Height          122.631
		Density         3.28032e-006
		Pressure        4.86222e-007
		Greenhouse      0.0097453
		Bright          1.26819
		Opacity         0
		SkyLight        0.422729
		Hue             -0.0321833
		Saturation      1

		Composition
		{
			N2    	99.7191
			CO    	0.151377
			CH4   	0.0530412
			Ar    	0.0419932
			Ne    	0.0345139
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00262442
		Period          0.00511972
		Eccentricity    0.00505811
		Inclination     0.867162
		AscendingNode   -83.2017
		ArgOfPericenter -6.81028
		MeanAnomaly     110.228
	}
}

Moon	"8.3"
{
	ParentBody     "8"
	Class	       "Selena"

	Mass            0.00915384
	Radius          1825.35
	InertiaMoment   0.378525

	Obliquity       -0.37147
	EqAscendNode    -31.3952
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.534 0.447 0.340)

	Surface
	{
		SurfStyle       0.945465
		OceanStyle      0.728633
		Randomize      (0.453, 0.063, 0.416)
		colorDistMagn   0.0759289
		colorDistFreq   221.395
		detailScale     4694.89
		colorConversion true
		drivenDarkening 0
		seaLevel        0.197235
		snowLevel       2
		tropicLatitude  0.012482
		icecapLatitude  0.965995
		icecapHeight    0.198427
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.71048
		venusFreq       1.64805
		venusMagn       0
		mareFreq        0.888538
		mareDensity     0.00140009
		terraceProb     0.557583
		erosion         0
		montesMagn      0.110497
		montesFreq      67.8754
		montesSpiky     0.880719
		montesFraction  0.434311
		dunesMagn       0.0492356
		dunesFreq       2387.15
		dunesFraction   0.973747
		hillsMagn       0.12966
		hillsFreq       222.83
		hillsFraction   0.010683
		hills2Fraction  0
		riversMagn      62.3479
		riversFreq      3.46243
		riversSin       5.26551
		riversOctaves   0
		canyonsMagn     0.393446
		canyonsFreq     0.773529
		canyonFraction  0.36299
		cracksMagn      0.0280368
		cracksFreq      0.556533
		cracksOctaves   0
		craterMagn      0.598992
		craterFreq      5.01291
		craterDensity   0.738218
		craterOctaves   10.9627
		craterRayedFactor 0.459348
		volcanoMagn     0.282167
		volcanoFreq     2.36402
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.248406
		volcanoRadius   0.589277
		volcanoTemp     1814.96
		lavaCoverTidal  0.00376928
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.440, 0.450, 0.370, 0.000)
		colorShelf     (0.580, 0.550, 0.430, 0.000)
		colorBeach     (0.379, 0.295, 0.197, 0.000)
		colorDesert    (0.443, 0.344, 0.218, 0.000)
		colorLowland   (0.353, 0.259, 0.163, 0.000)
		colorUpland    (0.315, 0.233, 0.153, 0.000)
		colorRock      (0.330, 0.250, 0.230, 0.000)
		colorSnow      (0.940, 0.910, 0.870, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999582
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
		Height          136.901
		Density         4.17778e-005
		Pressure        6.33589e-006
		Greenhouse      0.0278479
		Bright          2.10955
		Opacity         0
		SkyLight        0.703182
		Hue             -0.0244319
		Saturation      1

		Composition
		{
			N2    	99.7642
			CO    	0.142628
			Ar    	0.0868815
			Ne    	0.00526615
			CH4   	0.00103229
			O2    	2.94309e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00413163
		Period          0.0101129
		Eccentricity    0.0272971
		Inclination     -0.37147
		AscendingNode   -31.3952
		ArgOfPericenter -16.4778
		MeanAnomaly     -52.1514
	}
}

DwarfMoon	"8.D8"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.62907e-008
	Radius          36.1498
	InertiaMoment   0.396567

	RotationPeriod  6234.65
	Obliquity       73.5812
	EqAscendNode    -53.6531

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.798 0.797 0.795)

	Surface
	{
		SurfStyle       0.543505
		OceanStyle      0.686057
		Randomize      (-0.973, -0.518, -0.402)
		colorDistMagn   0.592387
		colorDistFreq   1.16344
		detailScale     987.132
		colorConversion true
		snowLevel       2
		tropicLatitude  0.885086
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661015
		terraceProb     0.313669
		erosion         0
		montesMagn      0.46875
		montesFreq      2.28982
		montesSpiky     0.966781
		montesFraction  0.412173
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.3751
		hillsFraction   0.515236
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227638
		craterFreq      0.234441
		craterDensity   0.943551
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   44.406
		volcanoTemp     1446.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.271, 0.223, 0.000)
		colorShelf     (0.319, 0.279, 0.255, 0.000)
		colorBeach     (0.375, 0.327, 0.302, 0.000)
		colorDesert    (0.407, 0.351, 0.294, 0.000)
		colorLowland   (0.447, 0.374, 0.334, 0.000)
		colorUpland    (0.495, 0.454, 0.406, 0.000)
		colorRock      (0.535, 0.494, 0.437, 0.000)
		colorSnow      (0.583, 0.526, 0.461, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0240748
		Period          0.142249
		Eccentricity    0.4914
		Inclination     73.5812
		AscendingNode   -53.6531
		ArgOfPericenter -67.9271
		MeanAnomaly     142.689
	}
}

DwarfMoon	"8.D9"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.21319e-008
	Radius          38.4587
	InertiaMoment   0.398442

	Obliquity       73.1665
	EqAscendNode    3.09929
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.619 0.616 0.613)

	Surface
	{
		SurfStyle       0.203889
		OceanStyle      0.573012
		Randomize      (0.071, 0.419, 0.034)
		colorDistMagn   0.8608
		colorDistFreq   0.454535
		detailScale     1050.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.556372
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443042
		terraceProb     0.38055
		erosion         0
		montesMagn      0.586514
		montesFreq      3.04079
		montesSpiky     0.964492
		montesFraction  0.639388
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.44082
		hillsFraction   0.380432
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230237
		craterFreq      0.142938
		craterDensity   0.85649
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   40.5314
		volcanoTemp     1546.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.247, 0.245, 0.000)
		colorShelf     (0.263, 0.262, 0.261, 0.000)
		colorBeach     (0.279, 0.277, 0.276, 0.000)
		colorDesert    (0.294, 0.293, 0.291, 0.000)
		colorLowland   (0.310, 0.308, 0.307, 0.000)
		colorUpland    (0.325, 0.324, 0.322, 0.000)
		colorRock      (0.341, 0.339, 0.337, 0.000)
		colorSnow      (0.356, 0.354, 0.353, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0247195
		Period          0.148
		Eccentricity    0.344979
		Inclination     73.1665
		AscendingNode   3.09929
		ArgOfPericenter 154.58
		MeanAnomaly     132.908
	}
}

DwarfMoon	"8.D10"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.00372e-008
	Radius          40.1047
	InertiaMoment   0.399457

	RotationPeriod  2638.51
	Obliquity       -48.806
	EqAscendNode    6.40328

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.809 0.757 0.698)

	Surface
	{
		SurfStyle       0.577582
		OceanStyle      0.196577
		Randomize      (-0.006, 0.037, 0.226)
		colorDistMagn   0.899044
		colorDistFreq   0.847746
		detailScale     1095.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991653
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.599173
		terraceProb     0.461946
		erosion         0
		montesMagn      0.475955
		montesFreq      2.4764
		montesSpiky     0.950128
		montesFraction  0.800815
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.31969
		hillsFraction   0.696356
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242554
		craterFreq      0.171427
		craterDensity   0.864673
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   36.2803
		volcanoTemp     1712.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.258, 0.195, 0.000)
		colorShelf     (0.324, 0.265, 0.223, 0.000)
		colorBeach     (0.380, 0.311, 0.265, 0.000)
		colorDesert    (0.413, 0.333, 0.258, 0.000)
		colorLowland   (0.453, 0.356, 0.293, 0.000)
		colorUpland    (0.502, 0.432, 0.356, 0.000)
		colorRock      (0.542, 0.470, 0.384, 0.000)
		colorSnow      (0.591, 0.500, 0.405, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.024997
		Period          0.1505
		Eccentricity    0.32947
		Inclination     -48.806
		AscendingNode   6.40328
		ArgOfPericenter 23.7479
		MeanAnomaly     -21.9414
	}
}

DwarfMoon	"8.D11"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            4.07602e-008
	Radius          52.0193
	InertiaMoment   0.397018

	Obliquity       10.0191
	EqAscendNode    -91.3539
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.626 0.623 0.621)

	Surface
	{
		SurfStyle       0.227709
		OceanStyle      0.852008
		Randomize      (-0.086, 0.361, -0.235)
		colorDistMagn   0.656295
		colorDistFreq   1.38872
		detailScale     1420.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.241313
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605813
		terraceProb     0.449984
		erosion         0
		montesMagn      0.30933
		montesFreq      3.31228
		montesSpiky     0.984235
		montesFraction  0.0833242
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.1456
		hillsFraction   0.414116
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215867
		craterFreq      0.202912
		craterDensity   0.928498
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   40.3973
		volcanoTemp     1914.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.249, 0.248, 0.000)
		colorShelf     (0.266, 0.265, 0.264, 0.000)
		colorBeach     (0.281, 0.280, 0.279, 0.000)
		colorDesert    (0.297, 0.296, 0.295, 0.000)
		colorLowland   (0.313, 0.312, 0.310, 0.000)
		colorUpland    (0.328, 0.327, 0.326, 0.000)
		colorRock      (0.344, 0.343, 0.341, 0.000)
		colorSnow      (0.360, 0.358, 0.357, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0255602
		Period          0.155615
		Eccentricity    0.462059
		Inclination     10.0191
		AscendingNode   -91.3539
		ArgOfPericenter -126.831
		MeanAnomaly     13.5856
	}
}

DwarfMoon	"8.D12"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            5.53508e-008
	Radius          54.6682
	InertiaMoment   0.398606

	RotationPeriod  4218.32
	Obliquity       -65.3442
	EqAscendNode    -39.2468

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.491 0.486 0.479)

	Surface
	{
		SurfStyle       0.183634
		OceanStyle      0.000326389
		Randomize      (0.722, 0.035, -0.542)
		colorDistMagn   0.773569
		colorDistFreq   1.41944
		detailScale     1492.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.88498
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.650282
		terraceProb     0.292125
		erosion         0
		montesMagn      0.410748
		montesFreq      3.20255
		montesSpiky     0.956316
		montesFraction  0.4917
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.093
		hillsFraction   0.507778
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258126
		craterFreq      0.257014
		craterDensity   1.01099
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   36.4317
		volcanoTemp     1796.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.194, 0.192, 0.000)
		colorShelf     (0.209, 0.206, 0.204, 0.000)
		colorBeach     (0.221, 0.219, 0.216, 0.000)
		colorDesert    (0.233, 0.231, 0.228, 0.000)
		colorLowland   (0.246, 0.243, 0.240, 0.000)
		colorUpland    (0.258, 0.255, 0.252, 0.000)
		colorRock      (0.270, 0.267, 0.264, 0.000)
		colorSnow      (0.283, 0.279, 0.276, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0260824
		Period          0.160408
		Eccentricity    0.154555
		Inclination     -65.3442
		AscendingNode   -39.2468
		ArgOfPericenter -22.5673
		MeanAnomaly     140.676
	}
}

Moon	"8.4"
{
	ParentBody     "8"
	Class	       "IceWorld"

	Mass            0.220799
	Radius          5104.03
	InertiaMoment   0.329588

	Obliquity       -3.46537
	EqAscendNode    -17.3302
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.765 0.687 0.621)

	Surface
	{
		SurfStyle       0.430302
		OceanStyle      0.134539
		Randomize      (-0.777, -0.202, 0.111)
		colorDistMagn   0.059937
		colorDistFreq   608.736
		detailScale     13127.9
		colorConversion true
		drivenDarkening 0
		seaLevel        0.232076
		snowLevel       2
		tropicLatitude  0.119297
		icecapLatitude  0.709422
		icecapHeight    0.260676
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.71356
		venusFreq       0.880561
		venusMagn       0.155624
		mareFreq        1.67038
		mareDensity     0.0169644
		terraceProb     0.260733
		erosion         0
		montesMagn      0.202648
		montesFreq      318.836
		montesSpiky     0.925596
		montesFraction  0.56862
		dunesMagn       0.047335
		dunesFreq       6834.52
		dunesFraction   0.296681
		hillsMagn       0.113486
		hillsFreq       500.544
		hillsFraction   0.0259264
		hills2Fraction  0.129374
		riversMagn      68.4415
		riversFreq      2.86367
		riversSin       6.95379
		riversOctaves   0
		canyonsMagn     0.646178
		canyonsFreq     1.66443
		canyonFraction  0
		cracksMagn      0.0445759
		cracksFreq      1.6512
		cracksOctaves   5
		craterMagn      0.587872
		craterFreq      19.4457
		craterDensity   0.903547
		craterOctaves   13
		craterRayedFactor 0.429445
		volcanoMagn     0.737106
		volcanoFreq     0.960062
		volcanoDensity  0.0581228
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.155791
		volcanoRadius   0.408753
		volcanoTemp     1272.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.765, 0.687, 0.621, 0.500)
		colorShelf     (0.727, 0.653, 0.590, 0.500)
		colorBeach     (0.535, 0.481, 0.435, 0.750)
		colorDesert    (0.650, 0.584, 0.528, 1.000)
		colorLowland   (0.673, 0.605, 0.546, 1.000)
		colorUpland    (0.711, 0.639, 0.578, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.673, 0.605, 0.546, 1.000)
		colorUpPlants  (0.711, 0.639, 0.578, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999809
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
		Height          304.019
		Density         1.91174e-005
		Pressure        2.62155e-005
		Greenhouse      0.0888647
		Bright          1.80421
		Opacity         0
		SkyLight        0.601402
		Hue             -0.0158113
		Saturation      1

		Composition
		{
			H2    	95.2807
			He    	3.24986
			N2    	1.43218
			Ne    	0.0370667
			Ar    	0.000134893
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0266815
		Period          0.165887
		Eccentricity    0.112672
		Inclination     -3.46537
		AscendingNode   -17.3302
		ArgOfPericenter 87.2387
		MeanAnomaly     -22.8867
	}
}

DwarfMoon	"8.D13"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.02652e-007
	Radius          61.2387
	InertiaMoment   0.397353

	RotationPeriod  2462.7
	Obliquity       -38.8663
	EqAscendNode    -163.992

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.562 0.557 0.552)

	Surface
	{
		SurfStyle       0.58755
		OceanStyle      0.542471
		Randomize      (-0.398, -0.345, -0.950)
		colorDistMagn   0.11638
		colorDistFreq   2.63931
		detailScale     1672.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.174077
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.336832
		terraceProb     0.155948
		erosion         0
		montesMagn      0.623659
		montesFreq      3.04803
		montesSpiky     0.973252
		montesFraction  0.68214
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.61674
		hillsFraction   0.604507
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216771
		craterFreq      0.188116
		craterDensity   0.742601
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.9673
		volcanoTemp     1213.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.190, 0.155, 0.000)
		colorShelf     (0.225, 0.195, 0.177, 0.000)
		colorBeach     (0.264, 0.229, 0.210, 0.000)
		colorDesert    (0.286, 0.245, 0.204, 0.000)
		colorLowland   (0.315, 0.262, 0.232, 0.000)
		colorUpland    (0.348, 0.318, 0.282, 0.000)
		colorRock      (0.376, 0.346, 0.304, 0.000)
		colorSnow      (0.410, 0.368, 0.320, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0269594
		Period          0.168566
		Eccentricity    0.2071
		Inclination     -38.8663
		AscendingNode   -163.992
		ArgOfPericenter -5.12413
		MeanAnomaly     -160.232
	}
}

DwarfMoon	"8.D14"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.40454e-007
	Radius          79.4332
	InertiaMoment   0.398761

	RotationPeriod  2030.78
	Obliquity       -9.13177
	EqAscendNode    -73.5188

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.740 0.737 0.733)

	Surface
	{
		SurfStyle       0.657669
		OceanStyle      0.902462
		Randomize      (-0.448, -0.320, 0.950)
		colorDistMagn   0.0408123
		colorDistFreq   3.94299
		detailScale     2169.05
		colorConversion true
		snowLevel       2
		tropicLatitude  0.252232
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565857
		terraceProb     0.299094
		erosion         0
		montesMagn      0.592027
		montesFreq      3.0219
		montesSpiky     0.975633
		montesFraction  0.453819
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.096
		hillsFraction   0.745458
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231963
		craterFreq      0.18082
		craterDensity   0.782959
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   33.2308
		volcanoTemp     1302.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.251, 0.205, 0.000)
		colorShelf     (0.296, 0.258, 0.234, 0.000)
		colorBeach     (0.348, 0.302, 0.278, 0.000)
		colorDesert    (0.378, 0.324, 0.271, 0.000)
		colorLowland   (0.415, 0.347, 0.308, 0.000)
		colorUpland    (0.459, 0.420, 0.374, 0.000)
		colorRock      (0.496, 0.457, 0.403, 0.000)
		colorSnow      (0.540, 0.487, 0.425, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0275096
		Period          0.173753
		Eccentricity    0.483064
		Inclination     -9.13177
		AscendingNode   -73.5188
		ArgOfPericenter -126.665
		MeanAnomaly     -36.1012
	}
}

DwarfMoon	"8.D15"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.93041e-007
	Radius          83.4122
	InertiaMoment   0.399712

	Obliquity       -38.0627
	EqAscendNode    -42.8161
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.752 0.747 0.744)

	Surface
	{
		SurfStyle       0.846917
		OceanStyle      0.51582
		Randomize      (0.489, 0.570, 0.855)
		colorDistMagn   0.80326
		colorDistFreq   4.75118
		detailScale     2277.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.940035
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381324
		terraceProb     0.256586
		erosion         0
		montesMagn      0.332328
		montesFreq      2.9534
		montesSpiky     0.903637
		montesFraction  0.316676
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.132
		hillsFraction   0.672386
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243167
		craterFreq      0.267429
		craterDensity   0.994739
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.7653
		volcanoTemp     1886.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.254, 0.208, 0.000)
		colorShelf     (0.301, 0.262, 0.238, 0.000)
		colorBeach     (0.353, 0.306, 0.283, 0.000)
		colorDesert    (0.383, 0.329, 0.275, 0.000)
		colorLowland   (0.421, 0.351, 0.313, 0.000)
		colorUpland    (0.466, 0.426, 0.380, 0.000)
		colorRock      (0.504, 0.463, 0.409, 0.000)
		colorSnow      (0.549, 0.493, 0.432, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0281747
		Period          0.180092
		Eccentricity    0.372783
		Inclination     -38.0627
		AscendingNode   -42.8161
		ArgOfPericenter -143.658
		MeanAnomaly     147.073
	}
}

DwarfMoon	"8.D16"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            2.66813e-007
	Radius          89.2163
	InertiaMoment   0.397628

	RotationPeriod  4789.28
	Obliquity       34.7944
	EqAscendNode    83.9303

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.748 0.650 0.615)

	Surface
	{
		SurfStyle       0.23843
		OceanStyle      0.330848
		Randomize      (-0.548, -0.417, -0.224)
		colorDistMagn   0.744779
		colorDistFreq   1.27798
		detailScale     2436.2
		colorConversion true
		snowLevel       2
		tropicLatitude  0.76842
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.506982
		terraceProb     0.195375
		erosion         0
		montesMagn      0.581433
		montesFreq      3.16216
		montesSpiky     0.943778
		montesFraction  0.517424
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.524
		hillsFraction   0.643259
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246144
		craterFreq      0.285204
		craterDensity   0.869414
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.0799
		volcanoTemp     1606.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.260, 0.246, 0.000)
		colorShelf     (0.318, 0.276, 0.261, 0.000)
		colorBeach     (0.337, 0.293, 0.277, 0.000)
		colorDesert    (0.355, 0.309, 0.292, 0.000)
		colorLowland   (0.374, 0.325, 0.308, 0.000)
		colorUpland    (0.393, 0.341, 0.323, 0.000)
		colorRock      (0.412, 0.358, 0.338, 0.000)
		colorSnow      (0.430, 0.374, 0.354, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0283858
		Period          0.18212
		Eccentricity    0.179733
		Inclination     34.7944
		AscendingNode   83.9303
		ArgOfPericenter 156.822
		MeanAnomaly     -24.1686
	}
}

DwarfMoon	"8.D17"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.71327e-007
	Radius          94.9788
	InertiaMoment   0.398909

	Obliquity       15.9126
	EqAscendNode    -159.017
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.559 0.475 0.412)

	Surface
	{
		SurfStyle       0.596598
		OceanStyle      0.112042
		Randomize      (-0.252, 0.187, -0.439)
		colorDistMagn   0.472716
		colorDistFreq   7.303
		detailScale     2593.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0997204
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.716733
		terraceProb     0.179538
		erosion         0
		montesMagn      0.509081
		montesFreq      2.52906
		montesSpiky     0.866076
		montesFraction  0.576988
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.7242
		hillsFraction   0.624608
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231648
		craterFreq      0.264744
		craterDensity   0.824099
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.4374
		volcanoTemp     1274.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.162, 0.115, 0.000)
		colorShelf     (0.223, 0.166, 0.132, 0.000)
		colorBeach     (0.263, 0.195, 0.157, 0.000)
		colorDesert    (0.285, 0.209, 0.152, 0.000)
		colorLowland   (0.313, 0.223, 0.173, 0.000)
		colorUpland    (0.346, 0.271, 0.210, 0.000)
		colorRock      (0.374, 0.295, 0.227, 0.000)
		colorSnow      (0.408, 0.314, 0.239, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0286298
		Period          0.184473
		Eccentricity    0.0632357
		Inclination     15.9126
		AscendingNode   -159.017
		ArgOfPericenter -0.746198
		MeanAnomaly     117.979
	}
}

DwarfMoon	"8.D18"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            5.21107e-007
	Radius          124.587
	InertiaMoment   0.399838

	Obliquity       -48.6957
	EqAscendNode    65.2061
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.511 0.505 0.502)

	Surface
	{
		SurfStyle       0.60177
		OceanStyle      0.967189
		Randomize      (0.621, -0.733, -0.290)
		colorDistMagn   0.676794
		colorDistFreq   6.10921
		detailScale     3402.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979995
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390355
		terraceProb     0.3313
		erosion         0
		montesMagn      0.444653
		montesFreq      2.55587
		montesSpiky     0.889657
		montesFraction  0.161871
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.0685
		hillsFraction   0.802498
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240783
		craterFreq      0.377275
		craterDensity   0.780041
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.0593
		volcanoTemp     1439.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.172, 0.141, 0.000)
		colorShelf     (0.204, 0.177, 0.161, 0.000)
		colorBeach     (0.240, 0.207, 0.191, 0.000)
		colorDesert    (0.260, 0.222, 0.186, 0.000)
		colorLowland   (0.286, 0.237, 0.211, 0.000)
		colorUpland    (0.317, 0.288, 0.256, 0.000)
		colorRock      (0.342, 0.313, 0.276, 0.000)
		colorSnow      (0.373, 0.333, 0.291, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0292721
		Period          0.190715
		Eccentricity    0.344782
		Inclination     -48.6957
		AscendingNode   65.2061
		ArgOfPericenter -146.321
		MeanAnomaly     111.894
	}
}

DwarfMoon	"8.D19"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            7.38657e-007
	Radius          131.298
	InertiaMoment   0.397864

	RotationPeriod  10221.3
	Obliquity       61.4375
	EqAscendNode    -127.982

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.574 0.570 0.565)

	Surface
	{
		SurfStyle       0.802807
		OceanStyle      0.0465614
		Randomize      (0.293, 0.982, 0.951)
		colorDistMagn   0.604066
		colorDistFreq   12.6741
		detailScale     3585.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.71087
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.400359
		terraceProb     0.350595
		erosion         0
		montesMagn      0.382591
		montesFreq      3.21297
		montesSpiky     0.904122
		montesFraction  0.369877
		dunesFraction   0
		hillsMagn       0
		hillsFreq       41.2248
		hillsFraction   0.503446
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225104
		craterFreq      0.57015
		craterDensity   0.863429
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.9521
		volcanoTemp     1414.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.194, 0.158, 0.000)
		colorShelf     (0.230, 0.200, 0.181, 0.000)
		colorBeach     (0.270, 0.234, 0.215, 0.000)
		colorDesert    (0.293, 0.251, 0.209, 0.000)
		colorLowland   (0.322, 0.268, 0.237, 0.000)
		colorUpland    (0.356, 0.325, 0.288, 0.000)
		colorRock      (0.385, 0.353, 0.310, 0.000)
		colorSnow      (0.419, 0.376, 0.327, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0296418
		Period          0.19434
		Eccentricity    0.27174
		Inclination     61.4375
		AscendingNode   -127.982
		ArgOfPericenter 151.965
		MeanAnomaly     -172.866
	}
}

DwarfMoon	"8.D20"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.05965e-006
	Radius          142.086
	InertiaMoment   0.399052

	Obliquity       28.3491
	EqAscendNode    -176.816
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.786 0.784 0.780)

	Surface
	{
		SurfStyle       0.327409
		OceanStyle      0.105849
		Randomize      (-0.268, -0.370, 0.977)
		colorDistMagn   0.663986
		colorDistFreq   7.43038
		detailScale     3879.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0.026383
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.323646
		terraceProb     0.26209
		erosion         0
		montesMagn      0.479389
		montesFreq      2.48094
		montesSpiky     0.949312
		montesFraction  0.516788
		dunesFraction   0
		hillsMagn       0
		hillsFreq       44.5327
		hillsFraction   0.343161
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.195079
		craterFreq      0.844825
		craterDensity   0.970481
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.6409
		volcanoTemp     1425.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.314, 0.312, 0.000)
		colorShelf     (0.334, 0.333, 0.332, 0.000)
		colorBeach     (0.354, 0.353, 0.351, 0.000)
		colorDesert    (0.374, 0.372, 0.371, 0.000)
		colorLowland   (0.393, 0.392, 0.390, 0.000)
		colorUpland    (0.413, 0.412, 0.410, 0.000)
		colorRock      (0.433, 0.431, 0.429, 0.000)
		colorSnow      (0.452, 0.451, 0.449, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0302658
		Period          0.200508
		Eccentricity    0.0509979
		Inclination     28.3491
		AscendingNode   -176.816
		ArgOfPericenter -18.6787
		MeanAnomaly     -142.014
	}
}

DwarfMoon	"8.D21"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.54213e-006
	Radius          153.987
	InertiaMoment   0.399963

	Obliquity       -13.8802
	EqAscendNode    131.752
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.497 0.494 0.492)

	Surface
	{
		SurfStyle       0.611153
		OceanStyle      0.0186831
		Randomize      (0.944, -0.465, -0.648)
		colorDistMagn   0.560174
		colorDistFreq   9.37354
		detailScale     4204.86
		colorConversion true
		snowLevel       2
		tropicLatitude  0.195148
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431163
		terraceProb     0.254644
		erosion         0
		montesMagn      0.322194
		montesFreq      2.88031
		montesSpiky     0.958677
		montesFraction  0.775647
		dunesFraction   0
		hillsMagn       0
		hillsFreq       59.0258
		hillsFraction   0.498178
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24962
		craterFreq      0.729103
		craterDensity   0.905911
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   19.4414
		volcanoTemp     1724.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.168, 0.138, 0.000)
		colorShelf     (0.199, 0.173, 0.157, 0.000)
		colorBeach     (0.234, 0.203, 0.187, 0.000)
		colorDesert    (0.254, 0.217, 0.182, 0.000)
		colorLowland   (0.278, 0.232, 0.207, 0.000)
		colorUpland    (0.308, 0.282, 0.251, 0.000)
		colorRock      (0.333, 0.306, 0.271, 0.000)
		colorSnow      (0.363, 0.326, 0.285, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0308004
		Period          0.205844
		Eccentricity    0.0991751
		Inclination     -13.8802
		AscendingNode   131.753
		ArgOfPericenter 72.1456
		MeanAnomaly     -108.141
	}
}

Planet	"9"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "IceWorld"

	Mass            2.9979
	Radius          10501.6
	InertiaMoment   0.328888

	Oblateness      0.0134019

	RotationPeriod  14.541
	Obliquity       52.587
	EqAscendNode    54.1539

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.489 0.486 0.481)

	Surface
	{
		SurfStyle       0.644496
		OceanStyle      0.970153
		Randomize      (-0.719, 0.645, -0.391)
		colorDistMagn   0.0555156
		colorDistFreq   1357.47
		detailScale     27010.7
		colorConversion true
		drivenDarkening 0
		seaLevel        0.238322
		snowLevel       2
		tropicLatitude  0.79124
		icecapLatitude  1
		icecapHeight    0.238322
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.83213
		venusFreq       1.0359
		venusMagn       0
		mareFreq        1.7293
		mareDensity     0.109093
		terraceProb     0.440339
		erosion         0
		montesMagn      0.168216
		montesFreq      524.461
		montesSpiky     0.958403
		montesFraction  0.114211
		dunesMagn       0.0499193
		dunesFreq       13984.2
		dunesFraction   0.771392
		hillsMagn       0.113881
		hillsFreq       1232.52
		hillsFraction   0.984892
		hills2Fraction  0.151191
		riversMagn      57.192
		riversFreq      2.0178
		riversSin       5.21164
		riversOctaves   0
		canyonsMagn     0.5631
		canyonsFreq     3.97693
		canyonFraction  0
		cracksMagn      0.0374273
		cracksFreq      4.3269
		cracksOctaves   6
		craterMagn      0.64989
		craterFreq      36.7513
		craterDensity   0.836249
		craterOctaves   14
		craterRayedFactor 0.289773
		volcanoMagn     0.689373
		volcanoFreq     1.05336
		volcanoDensity  0.0618555
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.419994
		volcanoRadius   0.26334
		volcanoTemp     1470.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.127, 0.092, 0.053, 1.000)
		colorShelf     (0.166, 0.126, 0.077, 1.000)
		colorBeach     (0.269, 0.165, 0.082, 0.200)
		colorDesert    (0.294, 0.185, 0.096, 0.200)
		colorLowland   (0.318, 0.194, 0.101, 0.200)
		colorUpland    (0.342, 0.233, 0.120, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.318, 0.194, 0.101, 0.200)
		colorUpPlants  (0.342, 0.233, 0.120, 0.200)
		BumpHeight      19.0188
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.99068
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
		Height          79.1974
		Density         0.000932008
		Pressure        0.000278168
		Greenhouse      0.178554
		Bright          3.9254
		Opacity         0
		SkyLight        1.30847
		Hue             -0.0114452
		Saturation      1

		Composition
		{
			He    	59.966
			Ne    	39.537
			N2    	0.496965
			Ar    	4.10437e-005
		}
	}

	Aurora
	{
		Height      70.2978
		NorthLat    78.0584
		NorthLon    9.44136
		NorthRadius 2530.34
		NorthWidth  2774.74
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    170.736
		SouthRadius 2821.38
		SouthWidth  3334.75
		SouthRings  3
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     15260.1
		OuterRadius     22271.5
		RotationPeriod  4.11363
		RotationOffset  0
		FrontBright     0.732413
		BackBright      0.662497
		Density         0.679433
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.53475
		Period          6.67983
		Eccentricity    0.060997
		Inclination     -0.534606
		AscendingNode   57.5462
		ArgOfPericenter 246.386
		MeanAnomaly     108.049
	}
}

Planet	"10"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "GasGiant"

	Mass            1663.14
	Radius          76156.1
	InertiaMoment   0.226923

	Oblateness      0.0188435

	RotationPeriod  8.50833
	Obliquity       -38.2476
	EqAscendNode    41.1769

	AlbedoBond      0.462539
	AlbedoGeom      0.555047
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.544657
		Randomize      (0.458, 0.938, 0.476)
		detailScale     195878
		colorConversion true
		tropicLatitude  0.595917
		icecapLatitude  1
		mainFreq        0.0246163
		venusFreq       7.15675
		venusMagn       0.41265
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      5.49066
		twistMagn       1.23524
		cycloneMagn     10.6292
		cycloneFreq     0.316466
		cycloneDensity  0.105467
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
		BumpHeight      5.85567
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          24.6875
		BumpHeight      65.8339
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.92184
		mainOctaves     10
		Coverage        0.125392
		twistZones      5.49066
		twistMagn       1.23524
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          100
		Density         9052.92
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.542361
		Saturation      0.751284

		Composition
		{
			H2    	93.0944
			He    	6.86634
			N2    	0.0378284
			Ne    	0.00101739
			O2    	0.000280602
			Ar    	8.59904e-005
			CH4   	1.17632e-005
		}
	}

	Aurora
	{
		Height      3412.25
		NorthLat    84.5733
		NorthLon    -19.4953
		NorthRadius 21926.8
		NorthWidth  12843.5
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -84.8646
		SouthLon    150.705
		SouthRadius 23440.4
		SouthWidth  14347.9
		SouthRings  5
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
		SemiMajorAxis   2.62498
		Period          14.504
		Eccentricity    0.0162887
		Inclination     2.12201
		AscendingNode   37.2716
		ArgOfPericenter 315.148
		MeanAnomaly     109.928
	}
}

DwarfMoon	"10.D1"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            6.6173e-009
	Radius          25.2406
	InertiaMoment   0.397501

	Oblateness      0.249

	Obliquity       -0.0083278
	EqAscendNode    -123.577
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.774 0.704 0.624)

	Surface
	{
		SurfStyle       0.666245
		OceanStyle      0.422583
		Randomize      (-0.455, -0.310, -0.322)
		colorDistMagn   0.248596
		colorDistFreq   0.0845881
		detailScale     689.238
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.734766
		terraceProb     0.129951
		erosion         0
		montesMagn      0.479044
		montesFreq      3.4363
		montesSpiky     0.877691
		montesFraction  0.740095
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.93625
		hillsFraction   0.920562
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24401
		craterFreq      0.278838
		craterDensity   0.928684
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   48.6481
		volcanoTemp     1162.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.239, 0.175, 0.000)
		colorShelf     (0.310, 0.246, 0.200, 0.000)
		colorBeach     (0.364, 0.288, 0.237, 0.000)
		colorDesert    (0.395, 0.310, 0.231, 0.000)
		colorLowland   (0.433, 0.331, 0.262, 0.000)
		colorUpland    (0.480, 0.401, 0.318, 0.000)
		colorRock      (0.519, 0.436, 0.343, 0.000)
		colorSnow      (0.565, 0.464, 0.362, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0016423
		Period          0.00094383
		Eccentricity    4.7597e-005
		Inclination     -0.0083278
		AscendingNode   -123.577
		ArgOfPericenter -168.459
		MeanAnomaly     -15.7002
	}
}

DwarfMoon	"10.D2"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            9.06267e-009
	Radius          33.7717
	InertiaMoment   0.398838

	Oblateness      0.249

	Obliquity       0.013072
	EqAscendNode    159.17
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.734 0.693 0.645)

	Surface
	{
		SurfStyle       0.893863
		OceanStyle      0.465104
		Randomize      (-0.432, -0.792, 0.797)
		colorDistMagn   0.758952
		colorDistFreq   0.779236
		detailScale     922.192
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.414936
		terraceProb     0.470982
		erosion         0
		montesMagn      0.482661
		montesFreq      3.52975
		montesSpiky     0.959034
		montesFraction  0.449907
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.63068
		hillsFraction   0.739709
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242631
		craterFreq      0.233043
		craterDensity   0.99371
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   55.62
		volcanoTemp     1552.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.243, 0.258, 0.050)
		colorShelf     (0.294, 0.284, 0.297, 0.040)
		colorBeach     (0.338, 0.326, 0.335, 0.030)
		colorDesert    (0.382, 0.367, 0.380, 0.020)
		colorLowland   (0.426, 0.409, 0.419, 0.030)
		colorUpland    (0.470, 0.451, 0.458, 0.050)
		colorRock      (0.514, 0.492, 0.509, 0.020)
		colorSnow      (0.514, 0.492, 0.509, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00171376
		Period          0.0010061
		Eccentricity    4.42444e-005
		Inclination     0.013072
		AscendingNode   159.17
		ArgOfPericenter -37.8185
		MeanAnomaly     -130.684
	}
}

Moon	"10.1"
{
	ParentBody     "10"
	Class	       "Desert"

	Mass            0.0670501
	Radius          3490.13
	InertiaMoment   0.337519

	Oblateness      0.00823419

	Obliquity       -0.87658
	EqAscendNode    12.0938
	TidalLocked     true

	AlbedoBond      0.32637
	AlbedoGeom      0.391644
	Brightness      2
	Color          (0.613 0.609 0.605)

	Surface
	{
		SurfStyle       0.531224
		OceanStyle      0.765125
		Randomize      (0.813, -0.908, -0.852)
		colorDistMagn   0.0899522
		colorDistFreq   394.453
		detailScale     8976.82
		colorConversion true
		seaLevel        0.0993222
		snowLevel       0.85
		tropicLatitude  0.0304231
		icecapLatitude  0.917592
		icecapHeight    0.102814
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.989701
		venusFreq       1.2544
		venusMagn       0.385251
		mareFreq        1.71982
		mareDensity     0.0101285
		terraceProb     0.489571
		erosion         0
		montesMagn      0.151336
		montesFreq      202.145
		montesSpiky     0.93967
		montesFraction  0.605346
		dunesMagn       0.0505577
		dunesFreq       39.9725
		dunesFraction   0.88796
		hillsMagn       0.124587
		hillsFreq       501.736
		hillsFraction   0
		hills2Fraction  0
		riversMagn      65.0643
		riversFreq      3.95782
		riversSin       7.99047
		riversOctaves   0
		canyonsMagn     0.053036
		canyonsFreq     90.9992
		canyonFraction  0
		cracksMagn      0.108367
		cracksFreq      0.332414
		cracksOctaves   0
		craterMagn      0.633893
		craterFreq      12.3105
		craterDensity   0.107995
		craterOctaves   1.3659
		volcanoMagn     0.746902
		volcanoFreq     2.22357
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.364054
		volcanoRadius   0.391578
		volcanoTemp     1413.83
		lavaCoverTidal  0.462617
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      2.44624
		twistMagn       0.00175016
		cycloneMagn     2.83529
		cycloneFreq     0.220014
		cycloneDensity  0.00835608
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
		Height          12.646
		BumpHeight      5.01341
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.871739
		mainOctaves     10
		Coverage        0.25274
		twistZones      2.44624
		twistMagn       0.00175016
	}

	Clouds
	{
		Height          15.292
		BumpHeight      5.26627
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.871739
		mainOctaves     10
		Coverage        0.25274
		twistZones      2.44624
		twistMagn       0.00175016
	}

	Clouds
	{
		Height          17.9377
		BumpHeight      5.65666
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.871739
		mainOctaves     10
		Coverage        0.25274
		twistZones      2.44624
		twistMagn       0.00175016
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          146.01
		Density         0.559854
		Pressure        0.259972
		Greenhouse      0.64254
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0118493
		Saturation      1

		Composition
		{
			CO2   	73.0613
			SO2   	26.1317
			N2    	0.31617
			H2O   	0.297779
			CH4   	0.148591
			H2    	0.0264951
			NH3   	0.0144606
			H2S   	0.00126391
			C2H4  	0.00105127
			C2H2  	0.000772901
			C2H6  	0.00014725
			Ar    	9.34973e-005
			CO    	7.08647e-005
			C3H8  	4.68366e-005
			He    	1.81944e-005
		}
	}

	Aurora
	{
		Height      61.8588
		NorthLat    62.3196
		NorthLon    -148.866
		NorthRadius 1020.13
		NorthWidth  1101.03
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -63.9655
		SouthLon    20.0402
		SouthRadius 1205.44
		SouthWidth  1095.17
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
		SemiMajorAxis   0.00335385
		Period          0.00275437
		Eccentricity    0.0150637
		Inclination     -0.87658
		AscendingNode   12.0938
		ArgOfPericenter -65.7959
		MeanAnomaly     48.4343
	}
}

Moon	"10.2"
{
	ParentBody     "10"
	Class	       "Oceania"

	Mass            0.777271
	Radius          7075.33
	InertiaMoment   0.328338

	Oblateness      0.00133508

	Obliquity       0.419443
	EqAscendNode    165.278
	TidalLocked     true

	AlbedoBond      0.424632
	AlbedoGeom      0.509558
	Brightness      2
	Color          (0.788 0.786 0.783)

	Surface
	{
		SurfStyle       0.0271343
		OceanStyle      0.971076
		Randomize      (-0.488, -0.036, 0.698)
		colorDistMagn   0.0728985
		colorDistFreq   879.582
		detailScale     18198.2
		colorConversion true
		seaLevel        0.970943
		snowLevel       2
		tropicLatitude  0.0018911
		icecapLatitude  10
		icecapHeight    0.998035
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.35669
		venusFreq       1.22792
		venusMagn       0
		mareFreq        0
		mareDensity     0
		terraceProb     0.164657
		erosion         0
		montesMagn      0.243313
		montesFreq      382.992
		montesSpiky     0.986248
		montesFraction  0.782855
		dunesMagn       0.0406671
		dunesFreq       71.1281
		dunesFraction   0.203669
		hillsMagn       0.149573
		hillsFreq       864.862
		hillsFraction   0.856179
		hills2Fraction  0.329281
		riversMagn      60.5341
		riversFreq      2.9553
		riversSin       5.38968
		riversOctaves   0
		canyonsMagn     0.0349446
		canyonsFreq     157.482
		canyonFraction  0.642523
		cracksMagn      0.0884816
		cracksFreq      0.608855
		cracksOctaves   2
		craterMagn      0.0181305
		craterFreq      54.316
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.635646
		volcanoFreq     14.1423
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0
		volcanoRadius   1.48288
		volcanoTemp     1443.14
		lavaCoverTidal  0.597585
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      2.34157
		twistMagn       0.196025
		cycloneMagn     2.72694
		cycloneFreq     0.336976
		cycloneDensity  0.0119003
		colorSea       (0.170, 0.070, 0.040, 1.000)
		colorShelf     (0.320, 0.110, 0.000, 1.000)
		colorBeach     (0.950, 0.950, 0.950, 1.308)
		colorDesert    (0.770, 0.770, 0.470, 1.308)
		colorLowland   (0.880, 0.880, 0.880, 1.308)
		colorUpland    (1.000, 1.000, 1.000, 1.308)
		colorRock      (1.000, 1.000, 1.000, 1.308)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		BumpHeight      108.539
		BumpOffset      105.385
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
		Height          21.6143
		BumpHeight      6.21522
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.93689
		mainOctaves     10
		Coverage        0.374386
		twistZones      2.34157
		twistMagn       0.196025
	}

	Ocean
	{
		Height          105.385
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          95.3733
		Density         21.3163
		Pressure        12.3922
		Greenhouse      7.7777
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0040979
		Saturation      0.763676

		Composition
		{
			SO2   	47.596
			CO2   	46.5907
			H2O   	3.986
			N2    	1.78777
			CO    	0.0377372
			Ar    	0.00109331
			Ne    	0.000534818
			He    	0.000129252
		}
	}

	Aurora
	{
		Height      219.066
		NorthLat    57.5807
		NorthLon    21.2809
		NorthRadius 1616.26
		NorthWidth  1350.57
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -65.74
		SouthLon    217.657
		SouthRadius 1251.85
		SouthWidth  882.773
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
		SemiMajorAxis   0.00544873
		Period          0.0057024
		Eccentricity    0.0470285
		Inclination     0.419443
		AscendingNode   165.278
		ArgOfPericenter -105.949
		MeanAnomaly     42.6023
	}
}

Moon	"10.3"
{
	ParentBody     "10"
	Class	       "Desert"

	Mass            0.0899957
	Radius          3836.36
	InertiaMoment   0.328051

	Obliquity       -0.529509
	EqAscendNode    155.73
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.761 0.760 0.758)

	Surface
	{
		SurfStyle       0.860468
		OceanStyle      0.333715
		Randomize      (0.974, -0.502, -0.741)
		colorDistMagn   0.0439439
		colorDistFreq   455.586
		detailScale     9867.32
		colorConversion true
		seaLevel        0.0490729
		snowLevel       2
		tropicLatitude  0.00389095
		icecapLatitude  0.909106
		icecapHeight    0.0566344
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.81937
		venusFreq       1.39458
		venusMagn       0.427571
		mareFreq        1.74683
		mareDensity     0.0123958
		terraceProb     0.180871
		erosion         0
		montesMagn      0.24039
		montesFreq      217.729
		montesSpiky     0.972451
		montesFraction  0.0764353
		dunesMagn       0.056215
		dunesFreq       46.0428
		dunesFraction   0.667464
		hillsMagn       0.137362
		hillsFreq       467.603
		hillsFraction   0
		hills2Fraction  0
		riversMagn      52.9493
		riversFreq      3.42332
		riversSin       5.5728
		riversOctaves   0
		canyonsMagn     0.0451669
		canyonsFreq     118.236
		canyonFraction  0
		cracksMagn      0.0998383
		cracksFreq      0.436408
		cracksOctaves   0
		craterMagn      0.672789
		craterFreq      12.7108
		craterDensity   0.474333
		craterOctaves   6.39045
		volcanoMagn     0.762271
		volcanoFreq     3.23282
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.665998
		volcanoRadius   0.540149
		volcanoTemp     1642.74
		lavaCoverTidal  0.230274
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
		Hapke           0.640432
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
		Height          54.6752
		Density         0.0359569
		Pressure        0.00965449
		Greenhouse      0.916137
		Bright          8.14998
		Opacity         1
		SkyLight        2.71666
		Hue             0.00365349
		Saturation      1

		Composition
		{
			N2    	97.916
			CO    	1.94652
			Ar    	0.123833
			He    	0.00889376
			Ne    	0.00446735
			Kr    	0.00032174
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00885213
		Period          0.0118107
		Eccentricity    0.0492564
		Inclination     -0.529509
		AscendingNode   155.73
		ArgOfPericenter 179.661
		MeanAnomaly     -4.83938
	}
}

Moon	"10.4"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            0.104138
	Radius          3779.09
	InertiaMoment   0.331973

	Obliquity       0.615928
	EqAscendNode    -158.68
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.434 0.429 0.428)

	Surface
	{
		SurfStyle       0.332685
		OceanStyle      0.789613
		Randomize      (-0.640, -0.343, 0.371)
		colorDistMagn   0.0485778
		colorDistFreq   445.218
		detailScale     9720.03
		colorConversion true
		drivenDarkening 0
		seaLevel        0.237359
		snowLevel       2
		tropicLatitude  0.0039818
		icecapLatitude  0.580251
		icecapHeight    0.26993
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.07176
		venusFreq       1.36473
		venusMagn       0.141366
		mareFreq        1.74315
		mareDensity     0.0142592
		terraceProb     0.377873
		erosion         0
		montesMagn      0.214265
		montesFreq      156.694
		montesSpiky     0.978578
		montesFraction  0.318505
		dunesMagn       0.0328659
		dunesFreq       4842.11
		dunesFraction   0.805448
		hillsMagn       0.147882
		hillsFreq       429.309
		hillsFraction   0.186673
		hills2Fraction  0.216565
		riversMagn      54.6771
		riversFreq      1.78678
		riversSin       4.43174
		riversOctaves   0
		canyonsMagn     0.406128
		canyonsFreq     1.4469
		canyonFraction  0
		cracksMagn      0.0588791
		cracksFreq      2.14192
		cracksOctaves   4
		craterMagn      0.593128
		craterFreq      9.02725
		craterDensity   0.962241
		craterOctaves   12
		craterRayedFactor 0.23295
		volcanoMagn     0.68539
		volcanoFreq     0.736659
		volcanoDensity  0.0584565
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.217603
		volcanoRadius   0.338138
		volcanoTemp     1577.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.434, 0.429, 0.428, 0.500)
		colorShelf     (0.412, 0.408, 0.407, 0.500)
		colorBeach     (0.304, 0.301, 0.300, 0.750)
		colorDesert    (0.369, 0.365, 0.364, 1.000)
		colorLowland   (0.382, 0.378, 0.377, 1.000)
		colorUpland    (0.403, 0.399, 0.398, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.382, 0.378, 0.377, 1.000)
		colorUpPlants  (0.403, 0.399, 0.398, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.985235
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
		Height          110.485
		Density         0.00147648
		Pressure        0.000230053
		Greenhouse      0.147088
		Bright          4.30373
		Opacity         0
		SkyLight        1.43458
		Hue             0.0114049
		Saturation      1

		Composition
		{
			Ne    	85.9097
			He    	14.0891
			N2    	0.00119679
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0143814
		Period          0.0244569
		Eccentricity    0.0348738
		Inclination     0.615928
		AscendingNode   -158.68
		ArgOfPericenter 150.639
		MeanAnomaly     14.8125
	}
}

Moon	"10.5"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            0.120502
	Radius          4211.85
	InertiaMoment   0.330801

	Obliquity       -0.406329
	EqAscendNode    -75.2739
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.565 0.504 0.410)

	Surface
	{
		SurfStyle       0.368016
		OceanStyle      0.32022
		Randomize      (0.150, -0.854, -0.907)
		colorDistMagn   0.0562492
		colorDistFreq   593.488
		detailScale     10833.1
		colorConversion true
		drivenDarkening 0
		seaLevel        0.228072
		snowLevel       2
		tropicLatitude  0.0112303
		icecapLatitude  0.790913
		icecapHeight    0.237149
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.82762
		venusFreq       1.21874
		venusMagn       0.225434
		mareFreq        2.10053
		mareDensity     0.00896249
		terraceProb     0.1523
		erosion         0
		montesMagn      0.188447
		montesFreq      139.966
		montesSpiky     0.956904
		montesFraction  0.812977
		dunesMagn       0.0498231
		dunesFreq       5470.66
		dunesFraction   0.266819
		hillsMagn       0.140039
		hillsFreq       455.523
		hillsFraction   0.937898
		hills2Fraction  0.287634
		riversMagn      58.9756
		riversFreq      2.96293
		riversSin       6.47175
		riversOctaves   0
		canyonsMagn     0.462623
		canyonsFreq     1.16443
		canyonFraction  0
		cracksMagn      0.0469326
		cracksFreq      1.04267
		cracksOctaves   2
		craterMagn      0.591189
		craterFreq      12.7839
		craterDensity   0.771545
		craterOctaves   12
		craterRayedFactor 0.412979
		volcanoMagn     0.712477
		volcanoFreq     1.19972
		volcanoDensity  0.0529597
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.36994
		volcanoRadius   0.570558
		volcanoTemp     1060.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.565, 0.504, 0.410, 0.500)
		colorShelf     (0.536, 0.479, 0.389, 0.500)
		colorBeach     (0.395, 0.353, 0.287, 0.750)
		colorDesert    (0.480, 0.428, 0.348, 1.000)
		colorLowland   (0.497, 0.444, 0.361, 1.000)
		colorUpland    (0.525, 0.469, 0.381, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.497, 0.444, 0.361, 1.000)
		colorUpPlants  (0.525, 0.469, 0.381, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999997
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
		Height          306.735
		Density         2.85634e-007
		Pressure        3.19555e-007
		Greenhouse      0.0102155
		Bright          0.778327
		Opacity         0
		SkyLight        0.259442
		Hue             0.0191563
		Saturation      1

		Composition
		{
			H2    	99.9925
			He    	0.00431765
			Ne    	0.00319596
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0233642
		Period          0.0506439
		Eccentricity    0.0499741
		Inclination     -0.406329
		AscendingNode   -75.2739
		ArgOfPericenter -33.8057
		MeanAnomaly     -44.2616
	}
}

DwarfMoon	"10.D3"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            5.71729e-008
	Radius          54.6526
	InertiaMoment   0.399123

	Obliquity       -48.8221
	EqAscendNode    151.595
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.584 0.580 0.577)

	Surface
	{
		SurfStyle       0.267921
		OceanStyle      0.417312
		Randomize      (0.927, -0.923, -0.311)
		colorDistMagn   0.097802
		colorDistFreq   1.7029
		detailScale     1492.38
		colorConversion true
		snowLevel       2
		tropicLatitude  0.362979
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571288
		terraceProb     0.299198
		erosion         0
		montesMagn      0.645583
		montesFreq      3.58798
		montesSpiky     0.939913
		montesFraction  0.907939
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.35258
		hillsFraction   0.706968
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242394
		craterFreq      0.251801
		craterDensity   0.94475
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.8362
		volcanoTemp     1396.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.232, 0.231, 0.000)
		colorShelf     (0.248, 0.247, 0.245, 0.000)
		colorBeach     (0.263, 0.261, 0.260, 0.000)
		colorDesert    (0.277, 0.276, 0.274, 0.000)
		colorLowland   (0.292, 0.290, 0.289, 0.000)
		colorUpland    (0.307, 0.305, 0.303, 0.000)
		colorRock      (0.321, 0.319, 0.318, 0.000)
		colorSnow      (0.336, 0.334, 0.332, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.141252
		Period          0.75285
		Eccentricity    0.00582771
		Inclination     -48.8221
		AscendingNode   151.595
		ArgOfPericenter 96.0964
		MeanAnomaly     58.9829
	}
}

DwarfMoon	"10.D4"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            7.77795e-008
	Radius          58.153
	InertiaMoment   0.394914

	RotationPeriod  19937.1
	Obliquity       -23.6895
	EqAscendNode    -83.399

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.645 0.639 0.636)

	Surface
	{
		SurfStyle       0.047389
		OceanStyle      0.482529
		Randomize      (0.376, -0.512, 0.662)
		colorDistMagn   0.910422
		colorDistFreq   1.69853
		detailScale     1587.96
		colorConversion true
		snowLevel       2
		tropicLatitude  0.57234
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502195
		terraceProb     0.401368
		erosion         0
		montesMagn      0.443796
		montesFreq      3.01146
		montesSpiky     0.975083
		montesFraction  0.218693
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.73698
		hillsFraction   0.619574
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236855
		craterFreq      0.24693
		craterDensity   0.746604
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.6923
		volcanoTemp     1559.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.256, 0.254, 0.000)
		colorShelf     (0.274, 0.272, 0.270, 0.000)
		colorBeach     (0.290, 0.288, 0.286, 0.000)
		colorDesert    (0.306, 0.303, 0.302, 0.000)
		colorLowland   (0.322, 0.319, 0.318, 0.000)
		colorUpland    (0.339, 0.335, 0.334, 0.000)
		colorRock      (0.355, 0.351, 0.350, 0.000)
		colorSnow      (0.371, 0.367, 0.366, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.141913
		Period          0.758137
		Eccentricity    0.246333
		Inclination     -23.6895
		AscendingNode   -83.399
		ArgOfPericenter 54.8247
		MeanAnomaly     -8.22269
	}
}

DwarfMoon	"10.D5"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.06088e-007
	Radius          59.8445
	InertiaMoment   0.398173

	Obliquity       73.2617
	EqAscendNode    35.9723
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.440 0.435 0.429)

	Surface
	{
		SurfStyle       0.362563
		OceanStyle      0.615386
		Randomize      (-0.794, -0.310, 0.895)
		colorDistMagn   0.338219
		colorDistFreq   1.07525
		detailScale     1634.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.751942
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.643991
		terraceProb     0.464177
		erosion         0
		montesMagn      0.400638
		montesFreq      2.90208
		montesSpiky     0.84269
		montesFraction  0.55071
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.87722
		hillsFraction   0.536005
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257129
		craterFreq      0.15779
		craterDensity   0.986391
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.8069
		volcanoTemp     1500.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.174, 0.172, 0.000)
		colorShelf     (0.187, 0.185, 0.183, 0.000)
		colorBeach     (0.198, 0.196, 0.193, 0.000)
		colorDesert    (0.209, 0.207, 0.204, 0.000)
		colorLowland   (0.220, 0.217, 0.215, 0.000)
		colorUpland    (0.231, 0.228, 0.225, 0.000)
		colorRock      (0.242, 0.239, 0.236, 0.000)
		colorSnow      (0.253, 0.250, 0.247, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.14245
		Period          0.762445
		Eccentricity    0.420836
		Inclination     73.2617
		AscendingNode   35.9723
		ArgOfPericenter -15.4712
		MeanAnomaly     165.967
	}
}

DwarfMoon	"10.D6"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.45217e-007
	Radius          78.7738
	InertiaMoment   0.399259

	RotationPeriod  13403.8
	Obliquity       54.645
	EqAscendNode    74.4067

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.759 0.706 0.668)

	Surface
	{
		SurfStyle       0.435791
		OceanStyle      0.697621
		Randomize      (-0.602, -0.601, 0.455)
		colorDistMagn   0.462487
		colorDistFreq   3.79678
		detailScale     2151.05
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987754
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479051
		terraceProb     0.193285
		erosion         0
		montesMagn      0.47707
		montesFreq      3.48129
		montesSpiky     0.983329
		montesFraction  0.282587
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.0181
		hillsFraction   0.827279
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241618
		craterFreq      0.252372
		craterDensity   0.762047
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.41
		volcanoTemp     1196.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.282, 0.267, 0.000)
		colorShelf     (0.322, 0.300, 0.284, 0.000)
		colorBeach     (0.341, 0.318, 0.301, 0.000)
		colorDesert    (0.360, 0.335, 0.317, 0.000)
		colorLowland   (0.379, 0.353, 0.334, 0.000)
		colorUpland    (0.398, 0.371, 0.351, 0.000)
		colorRock      (0.417, 0.388, 0.367, 0.000)
		colorSnow      (0.436, 0.406, 0.384, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.142712
		Period          0.764552
		Eccentricity    0.315451
		Inclination     54.645
		AscendingNode   74.4067
		ArgOfPericenter 119.996
		MeanAnomaly     -20.5942
	}
}

DwarfMoon	"10.D7"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.99695e-007
	Radius          83.4027
	InertiaMoment   0.39625

	Obliquity       -24.7357
	EqAscendNode    -100.862
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.418 0.411 0.408)

	Surface
	{
		SurfStyle       0.810474
		OceanStyle      0.184804
		Randomize      (0.260, -0.083, 0.759)
		colorDistMagn   0.6293
		colorDistFreq   4.30265
		detailScale     2277.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.513805
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554013
		terraceProb     0.366737
		erosion         0
		montesMagn      0.531154
		montesFreq      2.97635
		montesSpiky     0.906871
		montesFraction  0.776454
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.0519
		hillsFraction   0.701073
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245209
		craterFreq      0.237801
		craterDensity   1.07465
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.2619
		volcanoTemp     1654.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.140, 0.114, 0.000)
		colorShelf     (0.167, 0.144, 0.131, 0.000)
		colorBeach     (0.196, 0.169, 0.155, 0.000)
		colorDesert    (0.213, 0.181, 0.151, 0.000)
		colorLowland   (0.234, 0.193, 0.171, 0.000)
		colorUpland    (0.259, 0.235, 0.208, 0.000)
		colorRock      (0.280, 0.255, 0.224, 0.000)
		colorSnow      (0.305, 0.272, 0.237, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.143273
		Period          0.769063
		Eccentricity    0.398518
		Inclination     -24.7357
		AscendingNode   -100.862
		ArgOfPericenter 27.2417
		MeanAnomaly     0.890382
	}
}

DwarfMoon	"10.D8"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            2.76193e-007
	Radius          89.2616
	InertiaMoment   0.398355

	RotationPeriod  9012.43
	Obliquity       61.2382
	EqAscendNode    -113.929

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.565 0.561 0.558)

	Surface
	{
		SurfStyle       0.99872
		OceanStyle      0.456044
		Randomize      (-0.496, 0.473, -0.890)
		colorDistMagn   0.571913
		colorDistFreq   4.15315
		detailScale     2437.44
		colorConversion true
		snowLevel       2
		tropicLatitude  0.839587
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.588099
		terraceProb     0.366074
		erosion         0
		montesMagn      0.562196
		montesFreq      2.5224
		montesSpiky     0.932398
		montesFraction  0.378003
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.5102
		hillsFraction   0.562775
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227857
		craterFreq      0.280106
		craterDensity   0.912124
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.6296
		volcanoTemp     1381.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.196, 0.223, 0.050)
		colorShelf     (0.226, 0.230, 0.257, 0.040)
		colorBeach     (0.260, 0.264, 0.290, 0.030)
		colorDesert    (0.294, 0.297, 0.329, 0.020)
		colorLowland   (0.328, 0.331, 0.363, 0.030)
		colorUpland    (0.362, 0.365, 0.396, 0.050)
		colorRock      (0.396, 0.398, 0.441, 0.020)
		colorSnow      (0.396, 0.398, 0.441, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.143526
		Period          0.771101
		Eccentricity    0.0709176
		Inclination     61.2382
		AscendingNode   -113.929
		ArgOfPericenter 1.72613
		MeanAnomaly     129.962
	}
}

DwarfMoon	"10.D9"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            3.84693e-007
	Radius          93.9898
	InertiaMoment   0.399391

	RotationPeriod  10182.6
	Obliquity       23.2516
	EqAscendNode    16.8354

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.644 0.637 0.635)

	Surface
	{
		SurfStyle       0.314553
		OceanStyle      0.51109
		Randomize      (-0.566, -0.438, 0.872)
		colorDistMagn   0.567038
		colorDistFreq   1.2804
		detailScale     2566.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.719017
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.660108
		terraceProb     0.230492
		erosion         0
		montesMagn      0.601999
		montesFreq      3.36977
		montesSpiky     0.997449
		montesFraction  0.604748
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.526
		hillsFraction   0.751942
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25052
		craterFreq      0.315224
		craterDensity   0.916314
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.7591
		volcanoTemp     1199.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.255, 0.254, 0.000)
		colorShelf     (0.274, 0.271, 0.270, 0.000)
		colorBeach     (0.290, 0.287, 0.286, 0.000)
		colorDesert    (0.306, 0.303, 0.301, 0.000)
		colorLowland   (0.322, 0.319, 0.317, 0.000)
		colorUpland    (0.338, 0.335, 0.333, 0.000)
		colorRock      (0.354, 0.351, 0.349, 0.000)
		colorSnow      (0.370, 0.367, 0.365, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.143937
		Period          0.774418
		Eccentricity    0.475344
		Inclination     23.2516
		AscendingNode   16.8354
		ArgOfPericenter -86.4549
		MeanAnomaly     -96.6342
	}
}

DwarfMoon	"10.D10"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            5.4039e-007
	Radius          123.249
	InertiaMoment   0.39681

	Obliquity       -16.8655
	EqAscendNode    128.507
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.734 0.729 0.727)

	Surface
	{
		SurfStyle       0.561959
		OceanStyle      0.890292
		Randomize      (-0.624, -0.089, -0.198)
		colorDistMagn   0.156538
		colorDistFreq   9.78122
		detailScale     3365.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.250044
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.267087
		terraceProb     0.29338
		erosion         0
		montesMagn      0.504794
		montesFreq      3.38901
		montesSpiky     0.816647
		montesFraction  0.502917
		dunesFraction   0
		hillsMagn       0
		hillsFreq       35.6746
		hillsFraction   0.675748
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227492
		craterFreq      0.618449
		craterDensity   0.934973
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.2867
		volcanoTemp     1118.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.248, 0.203, 0.000)
		colorShelf     (0.293, 0.255, 0.233, 0.000)
		colorBeach     (0.345, 0.299, 0.276, 0.000)
		colorDesert    (0.374, 0.321, 0.269, 0.000)
		colorLowland   (0.411, 0.343, 0.305, 0.000)
		colorUpland    (0.455, 0.416, 0.371, 0.000)
		colorRock      (0.492, 0.452, 0.400, 0.000)
		colorSnow      (0.536, 0.481, 0.421, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.144487
		Period          0.778856
		Eccentricity    0.160598
		Inclination     -16.8655
		AscendingNode   128.507
		ArgOfPericenter 93.8474
		MeanAnomaly     -179.288
	}
}

DwarfMoon	"10.D11"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            7.66883e-007
	Radius          131.384
	InertiaMoment   0.398524

	RotationPeriod  13734.8
	Obliquity       -37.8621
	EqAscendNode    68.0383

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.601 0.598 0.592)

	Surface
	{
		SurfStyle       0.65525
		OceanStyle      0.355986
		Randomize      (0.598, -0.641, 0.569)
		colorDistMagn   0.0957609
		colorDistFreq   9.8451
		detailScale     3587.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0.875945
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.50937
		terraceProb     0.183669
		erosion         0
		montesMagn      0.292923
		montesFreq      2.49361
		montesSpiky     0.777571
		montesFraction  0.662163
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.0167
		hillsFraction   0.636279
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249277
		craterFreq      0.621443
		craterDensity   0.93055
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.5226
		volcanoTemp     1356.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.203, 0.166, 0.000)
		colorShelf     (0.240, 0.209, 0.190, 0.000)
		colorBeach     (0.282, 0.245, 0.225, 0.000)
		colorDesert    (0.306, 0.263, 0.219, 0.000)
		colorLowland   (0.337, 0.281, 0.249, 0.000)
		colorUpland    (0.373, 0.341, 0.302, 0.000)
		colorRock      (0.403, 0.371, 0.326, 0.000)
		colorSnow      (0.439, 0.395, 0.344, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.145052
		Period          0.783432
		Eccentricity    0.384373
		Inclination     -37.8621
		AscendingNode   68.0383
		ArgOfPericenter 123.103
		MeanAnomaly     -152.24
	}
}

DwarfMoon	"10.D12"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.10168e-006
	Radius          142.396
	InertiaMoment   0.399521

	RotationPeriod  10343
	Obliquity       16.6749
	EqAscendNode    -53.9029

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.733 0.600 0.547)

	Surface
	{
		SurfStyle       0.382142
		OceanStyle      0.936461
		Randomize      (0.215, -0.821, 0.983)
		colorDistMagn   0.518177
		colorDistFreq   12.4688
		detailScale     3888.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.494538
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.393989
		terraceProb     0.718437
		erosion         0
		montesMagn      0.378506
		montesFreq      2.60054
		montesSpiky     0.853393
		montesFraction  0.559735
		dunesFraction   0
		hillsMagn       0
		hillsFreq       54.4715
		hillsFraction   0.732517
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241721
		craterFreq      0.623923
		craterDensity   0.928813
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.2704
		volcanoTemp     1322.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.240, 0.219, 0.000)
		colorShelf     (0.311, 0.255, 0.233, 0.000)
		colorBeach     (0.330, 0.270, 0.246, 0.000)
		colorDesert    (0.348, 0.285, 0.260, 0.000)
		colorLowland   (0.366, 0.300, 0.274, 0.000)
		colorUpland    (0.385, 0.315, 0.287, 0.000)
		colorRock      (0.403, 0.330, 0.301, 0.000)
		colorSnow      (0.421, 0.345, 0.315, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.145445
		Period          0.786617
		Eccentricity    0.486654
		Inclination     16.6749
		AscendingNode   -53.9029
		ArgOfPericenter 151.694
		MeanAnomaly     -129.98
	}
}

DwarfMoon	"10.D13"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.60599e-006
	Radius          153.344
	InertiaMoment   0.397193

	RotationPeriod  20748.7
	Obliquity       68.9577
	EqAscendNode    -69.4121

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.440 0.435 0.428)

	Surface
	{
		SurfStyle       0.835116
		OceanStyle      0.309824
		Randomize      (0.269, -0.740, 0.651)
		colorDistMagn   0.158821
		colorDistFreq   6.71049
		detailScale     4187.33
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984141
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.458748
		terraceProb     0.414396
		erosion         0
		montesMagn      0.611509
		montesFreq      2.72003
		montesSpiky     0.952005
		montesFraction  0.741938
		dunesFraction   0
		hillsMagn       0
		hillsFreq       73.4074
		hillsFraction   0.565532
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263137
		craterFreq      0.728318
		craterDensity   0.835272
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   18.9715
		volcanoTemp     1319.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.148, 0.120, 0.000)
		colorShelf     (0.176, 0.152, 0.137, 0.000)
		colorBeach     (0.207, 0.179, 0.163, 0.000)
		colorDesert    (0.224, 0.192, 0.158, 0.000)
		colorLowland   (0.247, 0.205, 0.180, 0.000)
		colorUpland    (0.273, 0.248, 0.218, 0.000)
		colorRock      (0.295, 0.270, 0.236, 0.000)
		colorSnow      (0.321, 0.287, 0.248, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.145739
		Period          0.789001
		Eccentricity    0.469495
		Inclination     68.9577
		AscendingNode   -69.4121
		ArgOfPericenter 19.9858
		MeanAnomaly     25.6289
	}
}

DwarfMoon	"10.D14"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            2.38284e-006
	Radius          204.361
	InertiaMoment   0.398684

	Obliquity       77.5986
	EqAscendNode    75.3185
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.633 0.630 0.627)

	Surface
	{
		SurfStyle       0.700021
		OceanStyle      0.947569
		Randomize      (-0.331, 0.206, 0.168)
		colorDistMagn   0.497708
		colorDistFreq   19.928
		detailScale     5580.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.980677
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.511038
		terraceProb     0.164062
		erosion         0
		montesMagn      0.407809
		montesFreq      2.37525
		montesSpiky     0.990192
		montesFraction  0.429978
		dunesFraction   0
		hillsMagn       0
		hillsFreq       109.664
		hillsFraction   0.532175
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243238
		craterFreq      1.49112
		craterDensity   0.931725
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   20.7566
		volcanoTemp     1692.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.214, 0.176, 0.000)
		colorShelf     (0.253, 0.220, 0.201, 0.000)
		colorBeach     (0.297, 0.258, 0.238, 0.000)
		colorDesert    (0.323, 0.277, 0.232, 0.000)
		colorLowland   (0.354, 0.296, 0.263, 0.000)
		colorUpland    (0.392, 0.359, 0.320, 0.000)
		colorRock      (0.424, 0.391, 0.345, 0.000)
		colorSnow      (0.462, 0.416, 0.364, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.146273
		Period          0.793347
		Eccentricity    0.306817
		Inclination     77.5986
		AscendingNode   75.3185
		ArgOfPericenter -165.742
		MeanAnomaly     -40.9891
	}
}

Moon	"10.6"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            3.6121e-006
	Radius          221.59
	InertiaMoment   0.399648

	Obliquity       -44.7646
	EqAscendNode    -127.538
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.414 0.408 0.399)

	Surface
	{
		SurfStyle       0.443152
		OceanStyle      0.593524
		Randomize      (-0.806, -0.235, -0.849)
		colorDistMagn   0.0629936
		colorDistFreq   22.1063
		detailScale     569.942
		colorConversion true
		drivenDarkening 0.0485117
		seaLevel        0.108359
		snowLevel       2
		tropicLatitude  0.591577
		icecapLatitude  1
		icecapHeight    0.108359
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.85476
		venusFreq       1.23924
		venusMagn       0.18699
		mareFreq        0
		mareDensity     1.48966e-006
		terraceProb     0.374036
		erosion         0
		montesMagn      0.0608254
		montesFreq      10.6617
		montesSpiky     0.932684
		montesFraction  0.1797
		dunesMagn       0.0216071
		dunesFreq       285.802
		dunesFraction   0.121083
		hillsMagn       0.104131
		hillsFreq       30.5341
		hillsFraction   0.0472088
		hills2Fraction  0.128111
		riversMagn      51.9061
		riversFreq      3.21397
		riversSin       6.63859
		riversOctaves   0
		canyonsMagn     0.440999
		canyonsFreq     0.0818234
		canyonFraction  0
		cracksMagn      0.0593388
		cracksFreq      0.149191
		cracksOctaves   0
		craterMagn      1.13642
		craterFreq      0.759332
		craterDensity   0.851445
		craterOctaves   8
		craterRayedFactor 0
		volcanoMagn     0.226921
		volcanoFreq     0.88309
		volcanoDensity  0.0584356
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.0859246
		volcanoRadius   4.03572
		volcanoTemp     1021.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.414, 0.408, 0.399, 0.500)
		colorShelf     (0.394, 0.387, 0.379, 0.500)
		colorBeach     (0.290, 0.285, 0.280, 0.750)
		colorDesert    (0.352, 0.347, 0.339, 1.000)
		colorLowland   (0.365, 0.359, 0.351, 1.000)
		colorUpland    (0.385, 0.379, 0.371, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.365, 0.359, 0.351, 1.000)
		colorUpPlants  (0.385, 0.379, 0.371, 1.000)
		BumpHeight      11.0795
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
		SemiMajorAxis   0.146913
		Period          0.798557
		Eccentricity    0.173755
		Inclination     -44.7646
		AscendingNode   -127.538
		ArgOfPericenter -78.751
		MeanAnomaly     137.994
	}
}

Moon	"10.7"
{
	ParentBody     "10"
	Class	       "IceWorld"

	Mass            5.62173e-006
	Radius          246.561
	InertiaMoment   0.397495

	Obliquity       36.0488
	EqAscendNode    54.0121
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.574 0.570 0.564)

	Surface
	{
		SurfStyle       0.490171
		OceanStyle      0.792575
		Randomize      (-0.985, 0.655, -0.693)
		colorDistMagn   0.0624078
		colorDistFreq   37.69
		detailScale     634.168
		colorConversion true
		drivenDarkening 0.0483272
		seaLevel        0.215534
		snowLevel       2
		tropicLatitude  0.892924
		icecapLatitude  1
		icecapHeight    0.215534
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.79269
		venusFreq       0.595069
		venusMagn       0.296607
		mareFreq        0
		mareDensity     1.67397e-006
		terraceProb     0.466359
		erosion         0
		montesMagn      0.0503783
		montesFreq      8.26299
		montesSpiky     0.977572
		montesFraction  0.487193
		dunesMagn       0.0431382
		dunesFreq       321.697
		dunesFraction   0.377336
		hillsMagn       0.127344
		hillsFreq       23.9654
		hillsFraction   0.361786
		hills2Fraction  0.250632
		riversMagn      66.4502
		riversFreq      2.37834
		riversSin       5.39867
		riversOctaves   0
		canyonsMagn     0.417251
		canyonsFreq     0.0886037
		canyonFraction  0
		cracksMagn      0.0634029
		cracksFreq      0.0816765
		cracksOctaves   0
		craterMagn      1.09245
		craterFreq      0.574996
		craterDensity   0.804754
		craterOctaves   8
		craterRayedFactor 0.129688
		volcanoMagn     0.207487
		volcanoFreq     1.03444
		volcanoDensity  0.0497951
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.0716794
		volcanoRadius   4.21637
		volcanoTemp     1678.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.143, 0.124, 0.000)
		colorShelf     (0.212, 0.177, 0.158, 0.000)
		colorBeach     (0.322, 0.268, 0.237, 0.200)
		colorDesert    (0.293, 0.251, 0.209, 0.500)
		colorLowland   (0.224, 0.194, 0.158, 0.800)
		colorUpland    (0.379, 0.342, 0.293, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.224, 0.194, 0.158, 0.800)
		colorUpPlants  (0.379, 0.342, 0.293, 1.000)
		BumpHeight      12.328
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
		SemiMajorAxis   0.147474
		Period          0.803135
		Eccentricity    0.487648
		Inclination     36.0488
		AscendingNode   54.0121
		ArgOfPericenter -80.9434
		MeanAnomaly     58.608
	}
}

DwarfMoon	"10.D15"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.7675e-011
	Radius          3.44545
	InertiaMoment   0.398835

	RotationPeriod  14173.8
	Obliquity       -46.1081
	EqAscendNode    -122.71

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.842 0.755 0.707)

	Surface
	{
		SurfStyle       0.672145
		OceanStyle      0.0359664
		Randomize      (0.809, -0.228, 0.196)
		colorDistMagn   0.244047
		colorDistFreq   0.00986966
		detailScale     94.0838
		colorConversion true
		snowLevel       2
		tropicLatitude  0.648395
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.398155
		terraceProb     0.126707
		erosion         0
		montesMagn      0.598627
		montesFreq      3.64211
		montesSpiky     0.903315
		montesFraction  0.514437
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0420686
		hillsFraction   0.658078
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238841
		craterFreq      0.218061
		craterDensity   0.929682
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   128.491
		volcanoTemp     1218.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.328, 0.257, 0.198, 0.000)
		colorShelf     (0.337, 0.264, 0.226, 0.000)
		colorBeach     (0.396, 0.309, 0.269, 0.000)
		colorDesert    (0.429, 0.332, 0.261, 0.000)
		colorLowland   (0.471, 0.355, 0.297, 0.000)
		colorUpland    (0.522, 0.430, 0.360, 0.000)
		colorRock      (0.564, 0.468, 0.389, 0.000)
		colorSnow      (0.615, 0.498, 0.410, 1.000)
		BumpHeight      3.10091
		BumpOffset      0.620181
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.148127
		Period          0.808472
		Eccentricity    0.369513
		Inclination     -46.1081
		AscendingNode   -122.71
		ArgOfPericenter -165.57
		MeanAnomaly     -2.85004
	}
}

DwarfMoon	"10.D16"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            3.42358e-011
	Radius          5.03493
	InertiaMoment   0.399774

	Obliquity       52.5564
	EqAscendNode    142.204
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.710 0.706 0.704)

	Surface
	{
		SurfStyle       0.158975
		OceanStyle      0.462015
		Randomize      (0.900, -0.410, -0.192)
		colorDistMagn   0.979349
		colorDistFreq   0.011108
		detailScale     137.487
		colorConversion true
		snowLevel       2
		tropicLatitude  0.497
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.559216
		terraceProb     0.499902
		erosion         0
		montesMagn      0.566878
		montesFreq      3.31797
		montesSpiky     0.997991
		montesFraction  0.434648
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0747513
		hillsFraction   0.612441
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202803
		craterFreq      0.226016
		craterDensity   0.840658
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   134.915
		volcanoTemp     1595.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.282, 0.282, 0.000)
		colorShelf     (0.302, 0.300, 0.299, 0.000)
		colorBeach     (0.319, 0.318, 0.317, 0.000)
		colorDesert    (0.337, 0.335, 0.334, 0.000)
		colorLowland   (0.355, 0.353, 0.352, 0.000)
		colorUpland    (0.373, 0.371, 0.370, 0.000)
		colorRock      (0.390, 0.388, 0.387, 0.000)
		colorSnow      (0.408, 0.406, 0.405, 1.000)
		BumpHeight      4.53144
		BumpOffset      0.906287
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.14858
		Period          0.812186
		Eccentricity    0.0334078
		Inclination     52.5564
		AscendingNode   142.204
		ArgOfPericenter -49.0984
		MeanAnomaly     115.786
	}
}

DwarfMoon	"10.D17"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            6.12416e-011
	Radius          5.72916
	InertiaMoment   0.397748

	Obliquity       -46.8363
	EqAscendNode    -38.9479
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.487 0.481 0.477)

	Surface
	{
		SurfStyle       0.793951
		OceanStyle      0.589597
		Randomize      (0.026, 0.954, 0.195)
		colorDistMagn   0.515611
		colorDistFreq   0.0203397
		detailScale     156.444
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99853
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553527
		terraceProb     0.300406
		erosion         0
		montesMagn      0.458026
		montesFreq      2.80131
		montesSpiky     0.897705
		montesFraction  0.416112
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.102601
		hillsFraction   0.563678
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233036
		craterFreq      0.236387
		craterDensity   0.933403
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   114.782
		volcanoTemp     1365.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.163, 0.134, 0.000)
		colorShelf     (0.195, 0.168, 0.153, 0.000)
		colorBeach     (0.229, 0.197, 0.181, 0.000)
		colorDesert    (0.249, 0.212, 0.176, 0.000)
		colorLowland   (0.273, 0.226, 0.200, 0.000)
		colorUpland    (0.302, 0.274, 0.243, 0.000)
		colorRock      (0.327, 0.298, 0.262, 0.000)
		colorSnow      (0.356, 0.317, 0.277, 1.000)
		BumpHeight      5.15624
		BumpOffset      1.03125
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.148982
		Period          0.815483
		Eccentricity    0.401807
		Inclination     -46.8363
		AscendingNode   -38.9479
		ArgOfPericenter -88.4423
		MeanAnomaly     139.12
	}
}

DwarfMoon	"10.D18"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.03416e-010
	Radius          6.54558
	InertiaMoment   0.39898

	Obliquity       -6.47122
	EqAscendNode    -159.342
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.800 0.797 0.795)

	Surface
	{
		SurfStyle       0.967739
		OceanStyle      0.417953
		Randomize      (0.396, 0.138, 0.077)
		colorDistMagn   0.546395
		colorDistFreq   0.0153009
		detailScale     178.738
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0404072
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.613272
		terraceProb     0.1252
		erosion         0
		montesMagn      0.578336
		montesFreq      2.00005
		montesSpiky     0.982609
		montesFraction  0.144971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.067814
		hillsFraction   0.565933
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256721
		craterFreq      0.254019
		craterDensity   0.825231
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   100.916
		volcanoTemp     1589.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.279, 0.318, 0.050)
		colorShelf     (0.320, 0.327, 0.366, 0.040)
		colorBeach     (0.368, 0.375, 0.414, 0.030)
		colorDesert    (0.416, 0.423, 0.469, 0.020)
		colorLowland   (0.464, 0.470, 0.517, 0.030)
		colorUpland    (0.512, 0.518, 0.565, 0.050)
		colorRock      (0.560, 0.566, 0.628, 0.020)
		colorSnow      (0.560, 0.566, 0.628, 1.000)
		BumpHeight      5.89102
		BumpOffset      1.1782
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.149185
		Period          0.817152
		Eccentricity    0.0125339
		Inclination     -6.47122
		AscendingNode   -159.342
		ArgOfPericenter 139.711
		MeanAnomaly     133.798
	}
}

DwarfMoon	"10.D19"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.67187e-010
	Radius          7.34861
	InertiaMoment   0.3999

	Obliquity       -50.9131
	EqAscendNode    -7.85986
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.503 0.462 0.386)

	Surface
	{
		SurfStyle       0.667796
		OceanStyle      0.221668
		Randomize      (-0.201, -0.601, -0.855)
		colorDistMagn   0.568588
		colorDistFreq   0.0196573
		detailScale     200.666
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979942
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.738046
		terraceProb     0.617283
		erosion         0
		montesMagn      0.458903
		montesFreq      3.49366
		montesSpiky     0.952705
		montesFraction  0.588493
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.10342
		hillsFraction   0.585911
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240124
		craterFreq      0.244768
		craterDensity   0.792338
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   89.1067
		volcanoTemp     1468.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.157, 0.108, 0.000)
		colorShelf     (0.201, 0.162, 0.124, 0.000)
		colorBeach     (0.236, 0.189, 0.147, 0.000)
		colorDesert    (0.256, 0.203, 0.143, 0.000)
		colorLowland   (0.282, 0.217, 0.162, 0.000)
		colorUpland    (0.312, 0.263, 0.197, 0.000)
		colorRock      (0.337, 0.286, 0.212, 0.000)
		colorSnow      (0.367, 0.305, 0.224, 1.000)
		BumpHeight      6.61375
		BumpOffset      1.32275
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.149423
		Period          0.81911
		Eccentricity    0.293755
		Inclination     -50.9131
		AscendingNode   -7.85986
		ArgOfPericenter 146.957
		MeanAnomaly     -91.7797
	}
}

DwarfMoon	"10.D20"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            2.61249e-010
	Radius          10.0842
	InertiaMoment   0.39797

	RotationPeriod  18039.4
	Obliquity       44.8717
	EqAscendNode    -105.166

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.629 0.624)

	Surface
	{
		SurfStyle       0.421941
		OceanStyle      0.184124
		Randomize      (-0.951, -0.616, -0.607)
		colorDistMagn   0.549729
		colorDistFreq   0.0872325
		detailScale     275.365
		colorConversion true
		snowLevel       2
		tropicLatitude  0.774593
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.331649
		terraceProb     0.174784
		erosion         0
		montesMagn      0.396852
		montesFreq      2.98342
		montesSpiky     0.937656
		montesFraction  0.683155
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.181548
		hillsFraction   0.664919
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234375
		craterFreq      0.276031
		craterDensity   0.884144
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   97.818
		volcanoTemp     1551.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.252, 0.249, 0.000)
		colorShelf     (0.269, 0.267, 0.265, 0.000)
		colorBeach     (0.285, 0.283, 0.281, 0.000)
		colorDesert    (0.301, 0.299, 0.296, 0.000)
		colorLowland   (0.317, 0.314, 0.312, 0.000)
		colorUpland    (0.333, 0.330, 0.327, 0.000)
		colorRock      (0.349, 0.346, 0.343, 0.000)
		colorSnow      (0.365, 0.362, 0.359, 1.000)
		BumpHeight      9.07576
		BumpOffset      1.81515
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.149916
		Period          0.82317
		Eccentricity    0.437057
		Inclination     44.8717
		AscendingNode   -105.166
		ArgOfPericenter 116.227
		MeanAnomaly     -147.718
	}
}

DwarfMoon	"10.D21"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            3.97306e-010
	Radius          10.7575
	InertiaMoment   0.39912

	RotationPeriod  21725.3
	Obliquity       -67.4188
	EqAscendNode    95.2814

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.631 0.628)

	Surface
	{
		SurfStyle       0.0579154
		OceanStyle      0.86534
		Randomize      (0.899, -0.985, 0.449)
		colorDistMagn   0.718003
		colorDistFreq   0.0298935
		detailScale     293.751
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974145
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.523375
		terraceProb     0.332132
		erosion         0
		montesMagn      0.441584
		montesFreq      3.00333
		montesSpiky     0.950564
		montesFraction  0.742261
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.231663
		hillsFraction   0.397013
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244542
		craterFreq      0.256523
		craterDensity   0.787325
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   84.6165
		volcanoTemp     1327.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.253, 0.251, 0.000)
		colorShelf     (0.270, 0.268, 0.267, 0.000)
		colorBeach     (0.285, 0.284, 0.282, 0.000)
		colorDesert    (0.301, 0.300, 0.298, 0.000)
		colorLowland   (0.317, 0.316, 0.314, 0.000)
		colorUpland    (0.333, 0.332, 0.330, 0.000)
		colorRock      (0.349, 0.347, 0.345, 0.000)
		colorSnow      (0.365, 0.363, 0.361, 1.000)
		BumpHeight      9.68175
		BumpOffset      1.93635
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.150277
		Period          0.826138
		Eccentricity    0.0728937
		Inclination     -67.4188
		AscendingNode   95.2814
		ArgOfPericenter 3.24421
		MeanAnomaly     -40.396
	}
}

DwarfMoon	"10.D22"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            5.91056e-010
	Radius          11.7688
	InertiaMoment   0.394842

	RotationPeriod  9675.41
	Obliquity       -21.7994
	EqAscendNode    67.9888

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.564 0.408 0.340)

	Surface
	{
		SurfStyle       0.138151
		OceanStyle      0.402979
		Randomize      (0.682, 0.185, 0.168)
		colorDistMagn   0.892844
		colorDistFreq   0.057063
		detailScale     321.367
		colorConversion true
		snowLevel       2
		tropicLatitude  0.585867
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48517
		terraceProb     0.263275
		erosion         0
		montesMagn      0.435741
		montesFreq      3.54776
		montesSpiky     0.942241
		montesFraction  0.104923
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.309757
		hillsFraction   0.567194
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240756
		craterFreq      0.239391
		craterDensity   0.890161
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   75.897
		volcanoTemp     1139.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.163, 0.136, 0.000)
		colorShelf     (0.240, 0.173, 0.145, 0.000)
		colorBeach     (0.254, 0.183, 0.153, 0.000)
		colorDesert    (0.268, 0.194, 0.162, 0.000)
		colorLowland   (0.282, 0.204, 0.170, 0.000)
		colorUpland    (0.296, 0.214, 0.179, 0.000)
		colorRock      (0.310, 0.224, 0.187, 0.000)
		colorSnow      (0.324, 0.234, 0.196, 1.000)
		BumpHeight      10.5919
		BumpOffset      2.11839
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.150481
		Period          0.827825
		Eccentricity    0.295843
		Inclination     -21.7994
		AscendingNode   67.9888
		ArgOfPericenter -8.10227
		MeanAnomaly     -54.7448
	}
}

DwarfMoon	"10.D23"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            8.63511e-010
	Radius          12.7982
	InertiaMoment   0.398169

	RotationPeriod  18253.3
	Obliquity       55.3904
	EqAscendNode    -13.1045

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.457 0.449 0.447)

	Surface
	{
		SurfStyle       0.917117
		OceanStyle      0.954884
		Randomize      (-0.135, 0.504, -0.931)
		colorDistMagn   0.409764
		colorDistFreq   0.0879005
		detailScale     349.477
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94145
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.574938
		terraceProb     0.169524
		erosion         0
		montesMagn      0.441596
		montesFreq      3.00118
		montesSpiky     0.90518
		montesFraction  0.489317
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.379648
		hillsFraction   0.364416
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205552
		craterFreq      0.272784
		craterDensity   1.03
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   68.2845
		volcanoTemp     1756.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.155, 0.157, 0.179, 0.050)
		colorShelf     (0.183, 0.184, 0.206, 0.040)
		colorBeach     (0.210, 0.211, 0.232, 0.030)
		colorDesert    (0.237, 0.238, 0.264, 0.020)
		colorLowland   (0.265, 0.265, 0.290, 0.030)
		colorUpland    (0.292, 0.292, 0.317, 0.050)
		colorRock      (0.320, 0.319, 0.353, 0.020)
		colorSnow      (0.320, 0.319, 0.353, 1.000)
		BumpHeight      11.5184
		BumpOffset      2.30368
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.151099
		Period          0.83293
		Eccentricity    0.448716
		Inclination     55.3904
		AscendingNode   -13.1045
		ArgOfPericenter -120.849
		MeanAnomaly     10.5445
	}
}

DwarfMoon	"10.D24"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.24275e-009
	Radius          17.3886
	InertiaMoment   0.399256

	Obliquity       47.7254
	EqAscendNode    150.694
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.630 0.627 0.622)

	Surface
	{
		SurfStyle       0.0351392
		OceanStyle      0.271942
		Randomize      (0.662, -0.784, 0.917)
		colorDistMagn   0.518518
		colorDistFreq   0.0922574
		detailScale     474.824
		colorConversion true
		snowLevel       2
		tropicLatitude  0.367741
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.400425
		terraceProb     0.27086
		erosion         0
		montesMagn      0.508076
		montesFreq      3.18502
		montesSpiky     0.941398
		montesFraction  0.0804124
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.5917
		hillsFraction   0.80456
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262547
		craterFreq      0.277823
		craterDensity   0.972887
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   77.3352
		volcanoTemp     1530.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.251, 0.249, 0.000)
		colorShelf     (0.268, 0.266, 0.264, 0.000)
		colorBeach     (0.284, 0.282, 0.280, 0.000)
		colorDesert    (0.299, 0.298, 0.296, 0.000)
		colorLowland   (0.315, 0.313, 0.311, 0.000)
		colorUpland    (0.331, 0.329, 0.327, 0.000)
		colorRock      (0.347, 0.345, 0.342, 0.000)
		colorSnow      (0.362, 0.360, 0.358, 1.000)
		BumpHeight      15.6497
		BumpOffset      3.12994
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.151641
		Period          0.837418
		Eccentricity    0.35399
		Inclination     47.7254
		AscendingNode   150.694
		ArgOfPericenter -19.3021
		MeanAnomaly     39.2083
	}
}

DwarfMoon	"10.D25"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.76632e-009
	Radius          17.8161
	InertiaMoment   0.396235

	Obliquity       -78.8684
	EqAscendNode    -66.5294
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.475 0.467 0.461)

	Surface
	{
		SurfStyle       0.9655
		OceanStyle      0.662929
		Randomize      (0.499, 0.587, 0.445)
		colorDistMagn   0.383361
		colorDistFreq   0.22571
		detailScale     486.498
		colorConversion true
		snowLevel       2
		tropicLatitude  0.938175
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.712312
		terraceProb     0.143804
		erosion         0
		montesMagn      0.441814
		montesFreq      3.05635
		montesSpiky     0.756306
		montesFraction  0.85903
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.60728
		hillsFraction   0.545354
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248696
		craterFreq      0.183979
		craterDensity   0.997691
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   66.4637
		volcanoTemp     1443.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.164, 0.184, 0.050)
		colorShelf     (0.190, 0.192, 0.212, 0.040)
		colorBeach     (0.219, 0.220, 0.240, 0.030)
		colorDesert    (0.247, 0.248, 0.272, 0.020)
		colorLowland   (0.276, 0.276, 0.300, 0.030)
		colorUpland    (0.304, 0.304, 0.327, 0.050)
		colorRock      (0.333, 0.332, 0.364, 0.020)
		colorSnow      (0.333, 0.332, 0.364, 1.000)
		BumpHeight      16.0345
		BumpOffset      3.2069
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.152206
		Period          0.842098
		Eccentricity    0.167908
		Inclination     -78.8684
		AscendingNode   -66.5294
		ArgOfPericenter -76.2526
		MeanAnomaly     -96.8907
	}
}

DwarfMoon	"10.D26"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            2.48435e-009
	Radius          19.1001
	InertiaMoment   0.398351

	RotationPeriod  22235.6
	Obliquity       -30.4062
	EqAscendNode    2.14772

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.559 0.556 0.552)

	Surface
	{
		SurfStyle       0.788234
		OceanStyle      0.199055
		Randomize      (0.691, 0.413, 0.701)
		colorDistMagn   0.704412
		colorDistFreq   0.248604
		detailScale     521.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.872928
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.650313
		terraceProb     0.373224
		erosion         0
		montesMagn      0.608442
		montesFreq      3.43191
		montesSpiky     0.914953
		montesFraction  0.722276
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.681948
		hillsFraction   0.633662
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259149
		craterFreq      0.218592
		craterDensity   0.933472
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   60.0808
		volcanoTemp     1188.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.189, 0.155, 0.000)
		colorShelf     (0.224, 0.195, 0.177, 0.000)
		colorBeach     (0.263, 0.228, 0.210, 0.000)
		colorDesert    (0.285, 0.245, 0.204, 0.000)
		colorLowland   (0.313, 0.261, 0.232, 0.000)
		colorUpland    (0.347, 0.317, 0.282, 0.000)
		colorRock      (0.375, 0.345, 0.304, 0.000)
		colorSnow      (0.408, 0.367, 0.320, 1.000)
		BumpHeight      17.1901
		BumpOffset      3.43802
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.15262
		Period          0.845541
		Eccentricity    0.180596
		Inclination     -30.4062
		AscendingNode   2.14772
		ArgOfPericenter -39.6571
		MeanAnomaly     -145.941
	}
}

DwarfMoon	"10.D27"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            3.46396e-009
	Radius          20.4752
	InertiaMoment   0.399388

	RotationPeriod  18650.1
	Obliquity       43.1304
	EqAscendNode    115.768

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.501 0.498 0.494)

	Surface
	{
		SurfStyle       0.451631
		OceanStyle      0.62675
		Randomize      (0.694, 0.965, -0.268)
		colorDistMagn   0.216513
		colorDistFreq   0.3196
		detailScale     559.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.677204
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.510444
		terraceProb     0.232509
		erosion         0
		montesMagn      0.456579
		montesFreq      3.07587
		montesSpiky     0.881573
		montesFraction  0.673991
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.26318
		hillsFraction   0.713566
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245459
		craterFreq      0.24538
		craterDensity   0.837291
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   54.5442
		volcanoTemp     1171.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.199, 0.198, 0.000)
		colorShelf     (0.213, 0.212, 0.210, 0.000)
		colorBeach     (0.225, 0.224, 0.222, 0.000)
		colorDesert    (0.238, 0.237, 0.235, 0.000)
		colorLowland   (0.250, 0.249, 0.247, 0.000)
		colorUpland    (0.263, 0.261, 0.259, 0.000)
		colorRock      (0.275, 0.274, 0.272, 0.000)
		colorSnow      (0.288, 0.286, 0.284, 1.000)
		BumpHeight      18.4277
		BumpOffset      3.68554
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.153281
		Period          0.851039
		Eccentricity    0.340397
		Inclination     43.1304
		AscendingNode   115.768
		ArgOfPericenter -8.01984
		MeanAnomaly     157.831
	}
}

DwarfMoon	"10.D28"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            4.79509e-009
	Radius          28.707
	InertiaMoment   0.3968

	RotationPeriod  22429.8
	Obliquity       -37.27
	EqAscendNode    -4.7501

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.741 0.738 0.736)

	Surface
	{
		SurfStyle       0.421632
		OceanStyle      0.525467
		Randomize      (0.623, -0.945, -0.383)
		colorDistMagn   0.180081
		colorDistFreq   0.426678
		detailScale     783.893
		colorConversion true
		snowLevel       2
		tropicLatitude  0.963467
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.510873
		terraceProb     0.316661
		erosion         0
		montesMagn      0.263374
		montesFreq      3.69136
		montesSpiky     0.956852
		montesFraction  0.727882
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.2927
		hillsFraction   0.592555
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239182
		craterFreq      0.224271
		craterDensity   0.851179
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   64.9973
		volcanoTemp     1617.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.295, 0.295, 0.000)
		colorShelf     (0.315, 0.313, 0.313, 0.000)
		colorBeach     (0.334, 0.332, 0.331, 0.000)
		colorDesert    (0.352, 0.350, 0.350, 0.000)
		colorLowland   (0.371, 0.369, 0.368, 0.000)
		colorUpland    (0.389, 0.387, 0.387, 0.000)
		colorRock      (0.408, 0.406, 0.405, 0.000)
		colorSnow      (0.426, 0.424, 0.423, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.153508
		Period          0.852927
		Eccentricity    0.366117
		Inclination     -37.27
		AscendingNode   -4.7501
		ArgOfPericenter -128.531
		MeanAnomaly     100.795
	}
}

DwarfMoon	"10.D29"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            6.59862e-009
	Radius          27.8597
	InertiaMoment   0.398521

	RotationPeriod  45146
	Obliquity       34.1243
	EqAscendNode    -74.2094

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.555 0.551 0.547)

	Surface
	{
		SurfStyle       0.119719
		OceanStyle      0.657351
		Randomize      (0.520, 0.644, 0.138)
		colorDistMagn   0.800964
		colorDistFreq   0.484074
		detailScale     760.756
		colorConversion true
		snowLevel       2
		tropicLatitude  0.800263
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.655359
		terraceProb     0.504109
		erosion         0
		montesMagn      0.483752
		montesFreq      3.37077
		montesSpiky     0.806764
		montesFraction  0.419329
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.68901
		hillsFraction   0.328535
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224726
		craterFreq      0.206922
		craterDensity   1.04468
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   53.772
		volcanoTemp     1488.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.221, 0.219, 0.000)
		colorShelf     (0.236, 0.234, 0.232, 0.000)
		colorBeach     (0.250, 0.248, 0.246, 0.000)
		colorDesert    (0.264, 0.262, 0.260, 0.000)
		colorLowland   (0.278, 0.276, 0.273, 0.000)
		colorUpland    (0.292, 0.290, 0.287, 0.000)
		colorRock      (0.305, 0.303, 0.301, 0.000)
		colorSnow      (0.319, 0.317, 0.314, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.154161
		Period          0.858372
		Eccentricity    0.40038
		Inclination     34.1243
		AscendingNode   -74.2094
		ArgOfPericenter -84.7142
		MeanAnomaly     -40.6616
	}
}

DwarfMoon	"10.D30"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            9.03743e-009
	Radius          29.5424
	InertiaMoment   0.399518

	Obliquity       -61.0314
	EqAscendNode    169.147
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.579 0.496)

	Surface
	{
		SurfStyle       0.333217
		OceanStyle      0.581493
		Randomize      (-0.357, 0.319, 0.881)
		colorDistMagn   0.843917
		colorDistFreq   0.400077
		detailScale     806.703
		colorConversion true
		snowLevel       2
		tropicLatitude  0.164912
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.697447
		terraceProb     0.192919
		erosion         0
		montesMagn      0.533283
		montesFreq      1.8676
		montesSpiky     0.901936
		montesFraction  0.636
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.06736
		hillsFraction   0.630476
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230299
		craterFreq      0.21428
		craterDensity   0.826249
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   48.7224
		volcanoTemp     1457.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.232, 0.198, 0.000)
		colorShelf     (0.284, 0.246, 0.211, 0.000)
		colorBeach     (0.301, 0.261, 0.223, 0.000)
		colorDesert    (0.318, 0.275, 0.236, 0.000)
		colorLowland   (0.334, 0.290, 0.248, 0.000)
		colorUpland    (0.351, 0.304, 0.260, 0.000)
		colorRock      (0.368, 0.319, 0.273, 0.000)
		colorSnow      (0.385, 0.333, 0.285, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.154634
		Period          0.862327
		Eccentricity    0.237998
		Inclination     -61.0314
		AscendingNode   169.147
		ArgOfPericenter -12.4226
		MeanAnomaly     34.7482
	}
}

DwarfMoon	"10.D31"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.23319e-008
	Radius          31.4654
	InertiaMoment   0.397186

	RotationPeriod  10125.5
	Obliquity       62.6576
	EqAscendNode    -145.638

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.518 0.409 0.357)

	Surface
	{
		SurfStyle       0.184688
		OceanStyle      0.543291
		Randomize      (-0.352, 0.958, -0.181)
		colorDistMagn   0.0978901
		colorDistFreq   0.449384
		detailScale     859.214
		colorConversion true
		snowLevel       2
		tropicLatitude  0.506398
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.432232
		terraceProb     0.555649
		erosion         0
		montesMagn      0.497231
		montesFreq      3.2852
		montesSpiky     0.994809
		montesFraction  0.803063
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.26578
		hillsFraction   0.691642
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266611
		craterFreq      0.213553
		craterDensity   1.00171
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   44.4245
		volcanoTemp     1276.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.163, 0.143, 0.000)
		colorShelf     (0.220, 0.174, 0.152, 0.000)
		colorBeach     (0.233, 0.184, 0.161, 0.000)
		colorDesert    (0.246, 0.194, 0.170, 0.000)
		colorLowland   (0.259, 0.204, 0.178, 0.000)
		colorUpland    (0.272, 0.215, 0.187, 0.000)
		colorRock      (0.285, 0.225, 0.196, 0.000)
		colorSnow      (0.298, 0.235, 0.205, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.155113
		Period          0.866337
		Eccentricity    0.32921
		Inclination     62.6576
		AscendingNode   -145.638
		ArgOfPericenter 154.368
		MeanAnomaly     -92.7828
	}
}

DwarfMoon	"10.D32"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.67816e-008
	Radius          32.312
	InertiaMoment   0.39868

	Obliquity       -89.5313
	EqAscendNode    -173.128
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.486 0.479 0.476)

	Surface
	{
		SurfStyle       0.445862
		OceanStyle      0.035363
		Randomize      (0.127, -0.165, -0.569)
		colorDistMagn   0.621817
		colorDistFreq   0.484739
		detailScale     882.332
		colorConversion true
		snowLevel       2
		tropicLatitude  0.119644
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399958
		terraceProb     0.119948
		erosion         0
		montesMagn      0.531575
		montesFreq      3.59732
		montesSpiky     0.978768
		montesFraction  0.345098
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.00715
		hillsFraction   0.357785
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217348
		craterFreq      0.155625
		craterDensity   0.863479
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   39.1068
		volcanoTemp     1289.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.192, 0.190, 0.000)
		colorShelf     (0.207, 0.204, 0.202, 0.000)
		colorBeach     (0.219, 0.216, 0.214, 0.000)
		colorDesert    (0.231, 0.228, 0.226, 0.000)
		colorLowland   (0.243, 0.240, 0.238, 0.000)
		colorUpland    (0.255, 0.252, 0.250, 0.000)
		colorRock      (0.267, 0.264, 0.262, 0.000)
		colorSnow      (0.280, 0.276, 0.274, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.155359
		Period          0.868398
		Eccentricity    0.449563
		Inclination     -89.5313
		AscendingNode   -173.128
		ArgOfPericenter 132.43
		MeanAnomaly     -131.8
	}
}

DwarfMoon	"10.D33"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            2.27958e-008
	Radius          42.4759
	InertiaMoment   0.399645

	RotationPeriod  15319.4
	Obliquity       -16.5719
	EqAscendNode    98.826

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.531 0.377)

	Surface
	{
		SurfStyle       0.965645
		OceanStyle      0.593422
		Randomize      (-0.951, -0.230, -0.890)
		colorDistMagn   0.727634
		colorDistFreq   1.45033
		detailScale     1159.88
		colorConversion true
		snowLevel       2
		tropicLatitude  0.364682
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.64306
		terraceProb     0.138052
		erosion         0
		montesMagn      0.406961
		montesFreq      3.93135
		montesSpiky     0.878905
		montesFraction  0.414828
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.16408
		hillsFraction   0.554522
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202248
		craterFreq      0.249368
		craterDensity   0.697002
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   44.1085
		volcanoTemp     1476.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.186, 0.151, 0.050)
		colorShelf     (0.254, 0.218, 0.174, 0.040)
		colorBeach     (0.292, 0.250, 0.196, 0.030)
		colorDesert    (0.330, 0.282, 0.223, 0.020)
		colorLowland   (0.368, 0.314, 0.245, 0.030)
		colorUpland    (0.406, 0.345, 0.268, 0.050)
		colorRock      (0.444, 0.377, 0.298, 0.020)
		colorSnow      (0.444, 0.377, 0.298, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.156004
		Period          0.873814
		Eccentricity    0.499997
		Inclination     -16.5719
		AscendingNode   98.826
		ArgOfPericenter -73.866
		MeanAnomaly     41.3488
	}
}

DwarfMoon	"10.D34"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            3.09365e-008
	Radius          44.7812
	InertiaMoment   0.397489

	Obliquity       -68.996
	EqAscendNode    161.217
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.574 0.571 0.568)

	Surface
	{
		SurfStyle       0.742655
		OceanStyle      0.318937
		Randomize      (0.511, -0.279, -0.011)
		colorDistMagn   0.376948
		colorDistFreq   1.13729
		detailScale     1222.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.301118
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.603456
		terraceProb     0.483652
		erosion         0
		montesMagn      0.509213
		montesFreq      3.22243
		montesSpiky     0.888938
		montesFraction  0.504517
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.91288
		hillsFraction   0.648222
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205663
		craterFreq      0.255867
		craterDensity   1.00847
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   39.9177
		volcanoTemp     1703.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.194, 0.159, 0.000)
		colorShelf     (0.230, 0.200, 0.182, 0.000)
		colorBeach     (0.270, 0.234, 0.216, 0.000)
		colorDesert    (0.293, 0.251, 0.210, 0.000)
		colorLowland   (0.322, 0.269, 0.239, 0.000)
		colorUpland    (0.356, 0.326, 0.290, 0.000)
		colorRock      (0.385, 0.354, 0.312, 0.000)
		colorSnow      (0.419, 0.377, 0.329, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.156287
		Period          0.876192
		Eccentricity    0.187087
		Inclination     -68.996
		AscendingNode   161.217
		ArgOfPericenter -172.81
		MeanAnomaly     148.968
	}
}

DwarfMoon	"10.D35"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            4.19819e-008
	Radius          47.6239
	InertiaMoment   0.398832

	Obliquity       -20.2043
	EqAscendNode    11.6458
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.705 0.598 0.513)

	Surface
	{
		SurfStyle       0.0597136
		OceanStyle      0.071479
		Randomize      (-0.699, -0.334, -0.898)
		colorDistMagn   0.430395
		colorDistFreq   1.59852
		detailScale     1300.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.645338
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.677214
		terraceProb     0.414765
		erosion         0
		montesMagn      0.591879
		montesFreq      3.09009
		montesSpiky     0.876728
		montesFraction  0.756135
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.4868
		hillsFraction   0.718432
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235322
		craterFreq      0.181348
		craterDensity   0.945619
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   36.4418
		volcanoTemp     1248.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.239, 0.205, 0.000)
		colorShelf     (0.300, 0.254, 0.218, 0.000)
		colorBeach     (0.317, 0.269, 0.231, 0.000)
		colorDesert    (0.335, 0.284, 0.243, 0.000)
		colorLowland   (0.353, 0.299, 0.256, 0.000)
		colorUpland    (0.370, 0.314, 0.269, 0.000)
		colorRock      (0.388, 0.329, 0.282, 0.000)
		colorSnow      (0.406, 0.344, 0.295, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.156753
		Period          0.880116
		Eccentricity    0.348133
		Inclination     -20.2043
		AscendingNode   11.6458
		ArgOfPericenter 109.378
		MeanAnomaly     -72.091
	}
}

DwarfMoon	"10.D36"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            5.70165e-008
	Radius          49.703
	InertiaMoment   0.399772

	Obliquity       39.9483
	EqAscendNode    -50.0442
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.714 0.711 0.706)

	Surface
	{
		SurfStyle       0.233537
		OceanStyle      0.685223
		Randomize      (0.096, 0.808, 0.781)
		colorDistMagn   0.032543
		colorDistFreq   2.0669
		detailScale     1357.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.946418
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.599953
		terraceProb     0.109374
		erosion         0
		montesMagn      0.46906
		montesFreq      3.62056
		montesSpiky     0.882842
		montesFraction  0.570441
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.70383
		hillsFraction   0.352157
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245392
		craterFreq      0.213701
		craterDensity   1.00544
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.6353
		volcanoTemp     1411.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.284, 0.283, 0.000)
		colorShelf     (0.304, 0.302, 0.300, 0.000)
		colorBeach     (0.321, 0.320, 0.318, 0.000)
		colorDesert    (0.339, 0.338, 0.336, 0.000)
		colorLowland   (0.357, 0.355, 0.353, 0.000)
		colorUpland    (0.375, 0.373, 0.371, 0.000)
		colorRock      (0.393, 0.391, 0.389, 0.000)
		colorSnow      (0.411, 0.409, 0.406, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.157087
		Period          0.882928
		Eccentricity    0.153441
		Inclination     39.9483
		AscendingNode   -50.0442
		ArgOfPericenter 83.7332
		MeanAnomaly     -126.348
	}
}

DwarfMoon	"10.D37"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            7.75652e-008
	Radius          64.5002
	InertiaMoment   0.397743

	Obliquity       71.6312
	EqAscendNode    134.174
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.535 0.477 0.413)

	Surface
	{
		SurfStyle       0.364936
		OceanStyle      0.723347
		Randomize      (-0.763, -0.938, 0.691)
		colorDistMagn   0.845683
		colorDistFreq   1.78624
		detailScale     1761.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0.68669
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.557851
		terraceProb     0.308948
		erosion         0
		montesMagn      0.566951
		montesFreq      2.93675
		montesSpiky     0.94126
		montesFraction  0.652712
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.35846
		hillsFraction   0.869131
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215362
		craterFreq      0.226989
		craterDensity   0.848765
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   36.3106
		volcanoTemp     1213.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.191, 0.165, 0.000)
		colorShelf     (0.227, 0.203, 0.176, 0.000)
		colorBeach     (0.241, 0.215, 0.186, 0.000)
		colorDesert    (0.254, 0.226, 0.196, 0.000)
		colorLowland   (0.267, 0.238, 0.207, 0.000)
		colorUpland    (0.281, 0.250, 0.217, 0.000)
		colorRock      (0.294, 0.262, 0.227, 0.000)
		colorSnow      (0.307, 0.274, 0.238, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.157354
		Period          0.885178
		Eccentricity    0.126888
		Inclination     71.6312
		AscendingNode   134.174
		ArgOfPericenter -15.6141
		MeanAnomaly     -118.781
	}
}

DwarfMoon	"10.D38"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.05793e-007
	Radius          67.8676
	InertiaMoment   0.398977

	Obliquity       -44.8227
	EqAscendNode    73.1153
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.473 0.468 0.461)

	Surface
	{
		SurfStyle       0.979942
		OceanStyle      0.480803
		Randomize      (-0.338, 0.474, -0.699)
		colorDistMagn   0.99783
		colorDistFreq   3.38365
		detailScale     1853.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0.933426
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.360951
		terraceProb     0.130918
		erosion         0
		montesMagn      0.48482
		montesFreq      2.74909
		montesSpiky     0.942127
		montesFraction  0.484873
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.1258
		hillsFraction   0.617231
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235114
		craterFreq      0.203098
		craterDensity   0.94753
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.7145
		volcanoTemp     1738.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.161, 0.164, 0.185, 0.050)
		colorShelf     (0.189, 0.192, 0.212, 0.040)
		colorBeach     (0.218, 0.220, 0.240, 0.030)
		colorDesert    (0.246, 0.248, 0.272, 0.020)
		colorLowland   (0.274, 0.276, 0.300, 0.030)
		colorUpland    (0.303, 0.304, 0.328, 0.050)
		colorRock      (0.331, 0.332, 0.365, 0.020)
		colorSnow      (0.331, 0.332, 0.365, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.157601
		Period          0.887268
		Eccentricity    0.389022
		Inclination     -44.8227
		AscendingNode   73.1153
		ArgOfPericenter -14.8896
		MeanAnomaly     -20.9063
	}
}

DwarfMoon	"10.D39"
{
	ParentBody     "10"
	Class	       "Asteroid"

	Mass            1.44808e-007
	Radius          72.3808
	InertiaMoment   0.399897

	RotationPeriod  23437.1
	Obliquity       -24.5793
	EqAscendNode    -117.987

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.563 0.560 0.558)

	Surface
	{
		SurfStyle       0.19554
		OceanStyle      0.247204
		Randomize      (-0.126, 0.589, -0.552)
		colorDistMagn   0.840007
		colorDistFreq   4.39025
		detailScale     1976.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0.418593
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497458
		terraceProb     0.186402
		erosion         0
		montesMagn      0.455683
		montesFreq      2.7738
		montesSpiky     0.897239
		montesFraction  0.421907
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.36075
		hillsFraction   0.41677
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23685
		craterFreq      0.223218
		craterDensity   1.02207
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.8218
		volcanoTemp     1853.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.224, 0.223, 0.000)
		colorShelf     (0.239, 0.238, 0.237, 0.000)
		colorBeach     (0.253, 0.252, 0.251, 0.000)
		colorDesert    (0.267, 0.266, 0.265, 0.000)
		colorLowland   (0.282, 0.280, 0.279, 0.000)
		colorUpland    (0.296, 0.294, 0.293, 0.000)
		colorRock      (0.310, 0.308, 0.307, 0.000)
		colorSnow      (0.324, 0.322, 0.321, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.15807
		Period          0.891232
		Eccentricity    0.385322
		Inclination     -24.5793
		AscendingNode   -117.987
		ArgOfPericenter 123.139
		MeanAnomaly     -164.038
	}
}

Asteroid	"S1"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            6.81623e-015
	Radius          0.157805
	InertiaMoment   0.399473

	RotationPeriod  8529.31
	Obliquity       -0.678753
	EqAscendNode    52.4508

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.428 0.425 0.420)

	Surface
	{
		SurfStyle       0.23468
		OceanStyle      0.314956
		Randomize      (0.512, 0.810, 0.166)
		colorDistMagn   0.653525
		colorDistFreq   1.45345e-005
		detailScale     4.30914
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0212517
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.309451
		terraceProb     0.190535
		erosion         0
		montesMagn      0.488858
		montesFreq      2.68027
		montesSpiky     0.9939
		montesFraction  0.86607
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.88545e-005
		hillsFraction   0.735843
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250164
		craterFreq      0.189307
		craterDensity   0.821832
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   299.679
		volcanoTemp     1684.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.170, 0.168, 0.000)
		colorShelf     (0.182, 0.181, 0.179, 0.000)
		colorBeach     (0.193, 0.191, 0.189, 0.000)
		colorDesert    (0.203, 0.202, 0.200, 0.000)
		colorLowland   (0.214, 0.213, 0.210, 0.000)
		colorUpland    (0.225, 0.223, 0.221, 0.000)
		colorRock      (0.236, 0.234, 0.231, 0.000)
		colorSnow      (0.246, 0.244, 0.242, 1.000)
		BumpHeight      0.142025
		BumpOffset      0.028405
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.168611
		Period          0.243255
		Eccentricity    0.163665
		Inclination     -0.678753
		AscendingNode   52.4508
		ArgOfPericenter 35.3013
		MeanAnomaly     9.15134
	}
}

Asteroid	"S2"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.00304e-011
	Radius          1.90662
	InertiaMoment   0.397113

	RotationPeriod  10242.3
	Obliquity       3.6848
	EqAscendNode    -72.5717

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.566 0.561 0.559)

	Surface
	{
		SurfStyle       0.987739
		OceanStyle      0.370257
		Randomize      (0.937, 0.646, 0.112)
		colorDistMagn   0.455503
		colorDistFreq   0.000699719
		detailScale     52.0633
		colorConversion true
		snowLevel       2
		tropicLatitude  0.10347
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.683618
		terraceProb     0.480616
		erosion         0
		montesMagn      0.642731
		montesFreq      3.62131
		montesSpiky     0.937123
		montesFraction  0.630321
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00991466
		hillsFraction   0.603377
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233547
		craterFreq      0.277076
		craterDensity   0.964223
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   94.3863
		volcanoTemp     1512.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.196, 0.224, 0.050)
		colorShelf     (0.227, 0.230, 0.257, 0.040)
		colorBeach     (0.261, 0.264, 0.291, 0.030)
		colorDesert    (0.295, 0.297, 0.330, 0.020)
		colorLowland   (0.328, 0.331, 0.363, 0.030)
		colorUpland    (0.362, 0.365, 0.397, 0.050)
		colorRock      (0.396, 0.398, 0.442, 0.020)
		colorSnow      (0.396, 0.398, 0.442, 1.000)
		BumpHeight      1.71595
		BumpOffset      0.343191
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.16416
		Period          0.233687
		Eccentricity    0.114308
		Inclination     3.6848
		AscendingNode   -72.5717
		ArgOfPericenter -71.9333
		MeanAnomaly     40.6439
	}
}

Asteroid	"S3"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.47603e-008
	Radius          20.4146
	InertiaMoment   0.398669

	RotationPeriod  10495.2
	Obliquity       1.22941
	EqAscendNode    86.2247

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.774 0.773 0.772)

	Surface
	{
		SurfStyle       0.599054
		OceanStyle      0.288656
		Randomize      (-0.084, -0.212, -0.047)
		colorDistMagn   0.712312
		colorDistFreq   0.179217
		detailScale     557.456
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0313224
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.337184
		terraceProb     0.675545
		erosion         0
		montesMagn      0.496959
		montesFreq      2.85097
		montesSpiky     0.899919
		montesFraction  0.478134
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.14072
		hillsFraction   0.674513
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271149
		craterFreq      0.257273
		craterDensity   0.722564
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.3451
		volcanoTemp     1698.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.263, 0.216, 0.000)
		colorShelf     (0.310, 0.271, 0.247, 0.000)
		colorBeach     (0.364, 0.317, 0.293, 0.000)
		colorDesert    (0.395, 0.340, 0.286, 0.000)
		colorLowland   (0.433, 0.363, 0.324, 0.000)
		colorUpland    (0.480, 0.441, 0.394, 0.000)
		colorRock      (0.519, 0.479, 0.424, 0.000)
		colorSnow      (0.565, 0.510, 0.448, 1.000)
		BumpHeight      18.3732
		BumpOffset      3.67463
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.166852
		Period          0.239459
		Eccentricity    0.198998
		Inclination     1.22941
		AscendingNode   86.2247
		ArgOfPericenter -15.0612
		MeanAnomaly     0.670618
	}
}

Asteroid	"S4"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            8.64715e-017
	Radius          0.0390945
	InertiaMoment   0.399653

	RotationPeriod  12902.6
	Obliquity       1.18688
	EqAscendNode    -15.708

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.501 0.407 0.321)

	Surface
	{
		SurfStyle       0.981921
		OceanStyle      0.235787
		Randomize      (0.840, -0.876, 0.199)
		colorDistMagn   0.259972
		colorDistFreq   8.49693e-007
		detailScale     1.06754
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0410302
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.358863
		terraceProb     0.21706
		erosion         0
		montesMagn      0.562825
		montesFreq      2.69644
		montesSpiky     0.99014
		montesFraction  0.90154
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.19766e-006
		hillsFraction   0.495445
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264111
		craterFreq      0.217719
		craterDensity   0.935312
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   659.151
		volcanoTemp     1285.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.142, 0.129, 0.050)
		colorShelf     (0.200, 0.167, 0.148, 0.040)
		colorBeach     (0.230, 0.191, 0.167, 0.030)
		colorDesert    (0.260, 0.216, 0.190, 0.020)
		colorLowland   (0.290, 0.240, 0.209, 0.030)
		colorUpland    (0.320, 0.264, 0.228, 0.050)
		colorRock      (0.350, 0.289, 0.254, 0.020)
		colorSnow      (0.350, 0.289, 0.254, 1.000)
		BumpHeight      0.035185
		BumpOffset      0.00703701
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.169564
		Period          0.245321
		Eccentricity    0.0973878
		Inclination     1.18688
		AscendingNode   -15.708
		ArgOfPericenter -178.226
		MeanAnomaly     -88.0514
	}
}

Asteroid	"S5"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.27247e-013
	Radius          0.418623
	InertiaMoment   0.397542

	Obliquity       -0.523312
	EqAscendNode    -54.0797
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.575 0.568 0.564)

	Surface
	{
		SurfStyle       0.420465
		OceanStyle      0.123439
		Randomize      (0.320, -0.040, 0.467)
		colorDistMagn   0.326607
		colorDistFreq   0.000144769
		detailScale     11.4312
		colorConversion true
		snowLevel       2
		tropicLatitude  0.016271
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.461882
		terraceProb     0.371187
		erosion         0
		montesMagn      0.448617
		montesFreq      3.41486
		montesSpiky     0.908405
		montesFraction  0.49949
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000486274
		hillsFraction   0.666658
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228244
		craterFreq      0.17151
		craterDensity   0.881912
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   183.994
		volcanoTemp     1335.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.227, 0.225, 0.000)
		colorShelf     (0.245, 0.241, 0.240, 0.000)
		colorBeach     (0.259, 0.255, 0.254, 0.000)
		colorDesert    (0.273, 0.270, 0.268, 0.000)
		colorLowland   (0.288, 0.284, 0.282, 0.000)
		colorUpland    (0.302, 0.298, 0.296, 0.000)
		colorRock      (0.317, 0.312, 0.310, 0.000)
		colorSnow      (0.331, 0.326, 0.324, 1.000)
		BumpHeight      0.37676
		BumpOffset      0.0753521
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.149378
		Period          0.202845
		Eccentricity    0.057645
		Inclination     -0.523312
		AscendingNode   -54.0797
		ArgOfPericenter 87.0747
		MeanAnomaly     -172.553
	}
}

Asteroid	"S6"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.87251e-010
	Radius          5.05779
	InertiaMoment   0.398881

	Obliquity       2.92292
	EqAscendNode    123.559
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.795 0.769 0.718)

	Surface
	{
		SurfStyle       0.600108
		OceanStyle      0.633352
		Randomize      (0.848, -0.278, -0.497)
		colorDistMagn   0.70019
		colorDistFreq   0.00505589
		detailScale     138.111
		colorConversion true
		snowLevel       2
		tropicLatitude  0.048211
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.699419
		terraceProb     0.261734
		erosion         0
		montesMagn      0.518564
		montesFreq      1.7094
		montesSpiky     0.900936
		montesFraction  0.881203
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0498135
		hillsFraction   0.792717
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259973
		craterFreq      0.201336
		craterDensity   0.705996
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.9502
		volcanoTemp     2042.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.261, 0.201, 0.000)
		colorShelf     (0.318, 0.269, 0.230, 0.000)
		colorBeach     (0.374, 0.315, 0.273, 0.000)
		colorDesert    (0.405, 0.338, 0.266, 0.000)
		colorLowland   (0.445, 0.361, 0.301, 0.000)
		colorUpland    (0.493, 0.438, 0.366, 0.000)
		colorRock      (0.532, 0.477, 0.395, 0.000)
		colorSnow      (0.580, 0.507, 0.416, 1.000)
		BumpHeight      4.55201
		BumpOffset      0.910402
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.184407
		Period          0.278226
		Eccentricity    0.0522001
		Inclination     2.92292
		AscendingNode   123.559
		ArgOfPericenter 143.088
		MeanAnomaly     -42.6162
	}
}

Asteroid	"S7"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.7555e-007
	Radius          54.1472
	InertiaMoment   0.399831

	Obliquity       -1.51961
	EqAscendNode    84.8909
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.640 0.636 0.629)

	Surface
	{
		SurfStyle       0.0141362
		OceanStyle      0.214657
		Randomize      (-0.040, 0.944, -0.090)
		colorDistMagn   0.605474
		colorDistFreq   1.46641
		detailScale     1478.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0391297
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502353
		terraceProb     0.200241
		erosion         0
		montesMagn      0.390656
		montesFreq      2.62141
		montesSpiky     0.934488
		montesFraction  0.616027
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.68564
		hillsFraction   0.671166
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228014
		craterFreq      0.248284
		craterDensity   0.94218
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   16.1727
		volcanoTemp     1564
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.254, 0.252, 0.000)
		colorShelf     (0.272, 0.270, 0.268, 0.000)
		colorBeach     (0.288, 0.286, 0.283, 0.000)
		colorDesert    (0.304, 0.302, 0.299, 0.000)
		colorLowland   (0.320, 0.318, 0.315, 0.000)
		colorUpland    (0.336, 0.334, 0.330, 0.000)
		colorRock      (0.352, 0.350, 0.346, 0.000)
		colorSnow      (0.368, 0.366, 0.362, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.166255
		Period          0.238175
		Eccentricity    0.0735791
		Inclination     -1.51961
		AscendingNode   84.8909
		ArgOfPericenter 160.094
		MeanAnomaly     -23.7927
	}
}

Asteroid	"S8"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.61428e-015
	Radius          0.103709
	InertiaMoment   0.397881

	RotationPeriod  8353.43
	Obliquity       -1.61064
	EqAscendNode    6.99712

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.799 0.745 0.657)

	Surface
	{
		SurfStyle       0.328375
		OceanStyle      0.285649
		Randomize      (0.488, 0.548, -0.029)
		colorDistMagn   0.872562
		colorDistFreq   6.389e-006
		detailScale     2.83195
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0560878
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489153
		terraceProb     0.265234
		erosion         0
		montesMagn      0.519318
		montesFreq      2.40053
		montesSpiky     0.902309
		montesFraction  0.392168
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.70321e-005
		hillsFraction   0.4966
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237024
		craterFreq      0.204848
		craterDensity   0.968342
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   404.701
		volcanoTemp     1446.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.298, 0.263, 0.000)
		colorShelf     (0.340, 0.317, 0.279, 0.000)
		colorBeach     (0.360, 0.335, 0.295, 0.000)
		colorDesert    (0.380, 0.354, 0.312, 0.000)
		colorLowland   (0.400, 0.372, 0.328, 0.000)
		colorUpland    (0.420, 0.391, 0.345, 0.000)
		colorRock      (0.440, 0.410, 0.361, 0.000)
		colorSnow      (0.460, 0.428, 0.378, 1.000)
		BumpHeight      0.0933382
		BumpOffset      0.0186676
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.1433
		Period          0.190591
		Eccentricity    0.0673513
		Inclination     -1.61064
		AscendingNode   6.99712
		ArgOfPericenter 118.5
		MeanAnomaly     -84.4533
	}
}

Asteroid	"S9"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.37549e-012
	Radius          1.11051
	InertiaMoment   0.399082

	RotationPeriod  11611
	Obliquity       2.19
	EqAscendNode    15.6697

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.735 0.668 0.551)

	Surface
	{
		SurfStyle       0.754472
		OceanStyle      0.138547
		Randomize      (-0.936, 0.832, -0.634)
		colorDistMagn   0.0148787
		colorDistFreq   0.000769317
		detailScale     30.3244
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0756592
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.590225
		terraceProb     0.16109
		erosion         0
		montesMagn      0.37247
		montesFreq      3.1597
		montesSpiky     0.930736
		montesFraction  0.677447
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00333277
		hillsFraction   0.60517
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242417
		craterFreq      0.234831
		craterDensity   1.0005
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   112.967
		volcanoTemp     1468.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.227, 0.154, 0.000)
		colorShelf     (0.294, 0.234, 0.176, 0.000)
		colorBeach     (0.346, 0.274, 0.210, 0.000)
		colorDesert    (0.375, 0.294, 0.204, 0.000)
		colorLowland   (0.412, 0.314, 0.232, 0.000)
		colorUpland    (0.456, 0.381, 0.281, 0.000)
		colorRock      (0.493, 0.414, 0.303, 0.000)
		colorSnow      (0.537, 0.441, 0.320, 1.000)
		BumpHeight      0.999461
		BumpOffset      0.199892
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.15805
		Period          0.220763
		Eccentricity    0.154391
		Inclination     2.19
		AscendingNode   15.6697
		ArgOfPericenter 100.996
		MeanAnomaly     -116.811
	}
}

Asteroid	"S10"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.49566e-009
	Radius          13.4169
	InertiaMoment   0.39404

	RotationPeriod  3854.66
	Obliquity       3.52814
	EqAscendNode    139.797

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.645 0.641 0.637)

	Surface
	{
		SurfStyle       0.57505
		OceanStyle      0.500259
		Randomize      (-0.810, 0.531, 0.991)
		colorDistMagn   0.979963
		colorDistFreq   0.0296204
		detailScale     366.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.042291
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491535
		terraceProb     0.139513
		erosion         0
		montesMagn      0.477217
		montesFreq      4.14283
		montesSpiky     0.907745
		montesFraction  0.498423
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.478471
		hillsFraction   0.737981
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235552
		craterFreq      0.254887
		craterDensity   0.891346
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.5789
		volcanoTemp     1444.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.218, 0.178, 0.000)
		colorShelf     (0.258, 0.224, 0.204, 0.000)
		colorBeach     (0.303, 0.263, 0.242, 0.000)
		colorDesert    (0.329, 0.282, 0.236, 0.000)
		colorLowland   (0.361, 0.301, 0.268, 0.000)
		colorUpland    (0.400, 0.365, 0.325, 0.000)
		colorRock      (0.432, 0.397, 0.350, 0.000)
		colorSnow      (0.471, 0.423, 0.370, 1.000)
		BumpHeight      12.0752
		BumpOffset      2.41503
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.157624
		Period          0.219869
		Eccentricity    0.136593
		Inclination     3.52814
		AscendingNode   139.797
		ArgOfPericenter -68.9074
		MeanAnomaly     50.2447
	}
}

Asteroid	"S11"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.04788e-017
	Radius          0.0227707
	InertiaMoment   0.398168

	RotationPeriod  7184.36
	Obliquity       -4.5522
	EqAscendNode    5.26913

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.521 0.372 0.287)

	Surface
	{
		SurfStyle       0.207577
		OceanStyle      0.280216
		Randomize      (-0.506, -0.321, -0.303)
		colorDistMagn   0.69367
		colorDistFreq   2.72187e-007
		detailScale     0.621791
		colorConversion true
		snowLevel       2
		tropicLatitude  0.158068
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492109
		terraceProb     0.422354
		erosion         0
		montesMagn      0.537291
		montesFreq      2.68146
		montesSpiky     0.994105
		montesFraction  0.129611
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.03551e-006
		hillsFraction   0.747799
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21138
		craterFreq      0.215978
		craterDensity   0.885638
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   788.914
		volcanoTemp     1333.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.149, 0.115, 0.000)
		colorShelf     (0.222, 0.158, 0.122, 0.000)
		colorBeach     (0.235, 0.167, 0.129, 0.000)
		colorDesert    (0.248, 0.177, 0.136, 0.000)
		colorLowland   (0.261, 0.186, 0.143, 0.000)
		colorUpland    (0.274, 0.195, 0.150, 0.000)
		colorRock      (0.287, 0.205, 0.158, 0.000)
		colorSnow      (0.300, 0.214, 0.165, 1.000)
		BumpHeight      0.0204936
		BumpOffset      0.00409872
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.182178
		Period          0.273197
		Eccentricity    0.166185
		Inclination     -4.5522
		AscendingNode   5.26913
		ArgOfPericenter 168.95
		MeanAnomaly     -148.125
	}
}

Asteroid	"S12"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.01357e-014
	Radius          0.275117
	InertiaMoment   0.399273

	RotationPeriod  6000.65
	Obliquity       0.728406
	EqAscendNode    72.2071

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.546 0.539 0.533)

	Surface
	{
		SurfStyle       0.519471
		OceanStyle      0.0657817
		Randomize      (0.719, -0.920, -0.618)
		colorDistMagn   0.109956
		colorDistFreq   4.03033e-005
		detailScale     7.51254
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0205416
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.692229
		terraceProb     0.214099
		erosion         0
		montesMagn      0.368269
		montesFreq      2.35245
		montesSpiky     0.974037
		montesFraction  0.297248
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000152481
		hillsFraction   0.684156
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234441
		craterFreq      0.216284
		craterDensity   0.898161
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   248.476
		volcanoTemp     1878.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.183, 0.149, 0.000)
		colorShelf     (0.218, 0.189, 0.171, 0.000)
		colorBeach     (0.257, 0.221, 0.203, 0.000)
		colorDesert    (0.279, 0.237, 0.197, 0.000)
		colorLowland   (0.306, 0.253, 0.224, 0.000)
		colorUpland    (0.339, 0.307, 0.272, 0.000)
		colorRock      (0.366, 0.334, 0.293, 0.000)
		colorSnow      (0.399, 0.356, 0.309, 1.000)
		BumpHeight      0.247606
		BumpOffset      0.0495211
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.161573
		Period          0.228184
		Eccentricity    0.172827
		Inclination     0.728406
		AscendingNode   72.2071
		ArgOfPericenter 42.5053
		MeanAnomaly     7.71028
	}
}

Asteroid	"S13"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.43462e-011
	Radius          2.94593
	InertiaMoment   0.396416

	Obliquity       -3.76142
	EqAscendNode    -124.587
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.799 0.768 0.739)

	Surface
	{
		SurfStyle       0.328975
		OceanStyle      0.832693
		Randomize      (-0.097, 0.628, -0.196)
		colorDistMagn   0.798047
		colorDistFreq   0.00446236
		detailScale     80.4436
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0609736
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497594
		terraceProb     0.244117
		erosion         0
		montesMagn      0.600356
		montesFreq      2.78725
		montesSpiky     0.824982
		montesFraction  0.599458
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0214605
		hillsFraction   0.419896
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227301
		craterFreq      0.233959
		craterDensity   0.829647
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   69.3587
		volcanoTemp     1654.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.307, 0.295, 0.000)
		colorShelf     (0.340, 0.326, 0.314, 0.000)
		colorBeach     (0.360, 0.346, 0.332, 0.000)
		colorDesert    (0.380, 0.365, 0.351, 0.000)
		colorLowland   (0.400, 0.384, 0.369, 0.000)
		colorUpland    (0.420, 0.403, 0.388, 0.000)
		colorRock      (0.440, 0.422, 0.406, 0.000)
		colorSnow      (0.460, 0.442, 0.425, 1.000)
		BumpHeight      2.65134
		BumpOffset      0.530268
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.146944
		Period          0.197906
		Eccentricity    0.0436072
		Inclination     -3.76142
		AscendingNode   -124.587
		ArgOfPericenter 134.25
		MeanAnomaly     -56.0445
	}
}

Asteroid	"S14"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            6.52579e-008
	Radius          35.589
	InertiaMoment   0.398421

	Obliquity       0.201041
	EqAscendNode    62.6366
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.411 0.405 0.401)

	Surface
	{
		SurfStyle       0.205328
		OceanStyle      0.882256
		Randomize      (-0.553, -0.824, -0.303)
		colorDistMagn   0.0637709
		colorDistFreq   1.11693
		detailScale     971.817
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00599013
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544453
		terraceProb     0.48789
		erosion         0
		montesMagn      0.584086
		montesFreq      3.4751
		montesSpiky     0.859537
		montesFraction  0.475352
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.91651
		hillsFraction   0.770902
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223359
		craterFreq      0.204893
		craterDensity   0.728687
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.8426
		volcanoTemp     1484.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.162, 0.160, 0.000)
		colorShelf     (0.175, 0.172, 0.170, 0.000)
		colorBeach     (0.185, 0.182, 0.180, 0.000)
		colorDesert    (0.195, 0.192, 0.190, 0.000)
		colorLowland   (0.206, 0.203, 0.200, 0.000)
		colorUpland    (0.216, 0.213, 0.210, 0.000)
		colorRock      (0.226, 0.223, 0.220, 0.000)
		colorSnow      (0.237, 0.233, 0.230, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.162571
		Period          0.230301
		Eccentricity    0.0854643
		Inclination     0.201041
		AscendingNode   62.6366
		ArgOfPericenter -147.181
		MeanAnomaly     28.8732
	}
}

Asteroid	"S15"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.82304e-016
	Radius          0.0604056
	InertiaMoment   0.399459

	RotationPeriod  11464.9
	Obliquity       0.810404
	EqAscendNode    159.296

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.668 0.563 0.528)

	Surface
	{
		SurfStyle       0.892176
		OceanStyle      0.757949
		Randomize      (0.032, -0.965, -0.957)
		colorDistMagn   0.429353
		colorDistFreq   1.73343e-006
		detailScale     1.64948
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00508608
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.511729
		terraceProb     0.132704
		erosion         0
		montesMagn      0.450356
		montesFreq      3.09451
		montesSpiky     0.757055
		montesFraction  0.840003
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.445e-006
		hillsFraction   0.667219
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215738
		craterFreq      0.249149
		craterDensity   0.851858
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   484.371
		volcanoTemp     1641.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.197, 0.211, 0.050)
		colorShelf     (0.267, 0.231, 0.243, 0.040)
		colorBeach     (0.307, 0.265, 0.274, 0.030)
		colorDesert    (0.347, 0.298, 0.311, 0.020)
		colorLowland   (0.387, 0.332, 0.343, 0.030)
		colorUpland    (0.427, 0.366, 0.375, 0.050)
		colorRock      (0.467, 0.400, 0.417, 0.020)
		colorSnow      (0.467, 0.400, 0.417, 1.000)
		BumpHeight      0.054365
		BumpOffset      0.010873
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.156722
		Period          0.217986
		Eccentricity    0.0925511
		Inclination     0.810404
		AscendingNode   159.296
		ArgOfPericenter -172.776
		MeanAnomaly     -120.94
	}
}

Asteroid	"S16"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            5.62581e-013
	Radius          0.729825
	InertiaMoment   0.397074

	RotationPeriod  3745.78
	Obliquity       -1.30582
	EqAscendNode    177.627

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.808 0.783 0.761)

	Surface
	{
		SurfStyle       0.379682
		OceanStyle      0.527617
		Randomize      (0.860, -0.828, -0.242)
		colorDistMagn   0.373749
		colorDistFreq   0.000267655
		detailScale     19.9291
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00091349
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.62308
		terraceProb     0.127951
		erosion         0
		montesMagn      0.454803
		montesFreq      3.76835
		montesSpiky     0.910114
		montesFraction  0.838088
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000951056
		hillsFraction   0.622001
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.159805
		craterFreq      0.261337
		craterDensity   0.773006
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   152.557
		volcanoTemp     1546.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.323, 0.313, 0.304, 0.000)
		colorShelf     (0.344, 0.333, 0.323, 0.000)
		colorBeach     (0.364, 0.352, 0.343, 0.000)
		colorDesert    (0.384, 0.372, 0.362, 0.000)
		colorLowland   (0.404, 0.391, 0.381, 0.000)
		colorUpland    (0.424, 0.411, 0.400, 0.000)
		colorRock      (0.445, 0.431, 0.419, 0.000)
		colorSnow      (0.465, 0.450, 0.438, 1.000)
		BumpHeight      0.656843
		BumpOffset      0.131369
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.154641
		Period          0.213659
		Eccentricity    0.135749
		Inclination     -1.30582
		AscendingNode   177.627
		ArgOfPericenter -176.792
		MeanAnomaly     -0.0540105
	}
}

Asteroid	"S17"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            8.27867e-010
	Radius          7.81479
	InertiaMoment   0.398652

	Obliquity       2.39442
	EqAscendNode    -172.239
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.431 0.427 0.420)

	Surface
	{
		SurfStyle       0.806904
		OceanStyle      0.212001
		Randomize      (0.172, 0.389, 0.850)
		colorDistMagn   0.0692436
		colorDistFreq   0.0142119
		detailScale     213.396
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00565224
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.482665
		terraceProb     0.253963
		erosion         0
		montesMagn      0.367376
		montesFreq      2.91353
		montesSpiky     0.933303
		montesFraction  0.389161
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.115915
		hillsFraction   0.71221
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210041
		craterFreq      0.190876
		craterDensity   0.84346
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.5837
		volcanoTemp     1181.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.145, 0.118, 0.000)
		colorShelf     (0.173, 0.149, 0.134, 0.000)
		colorBeach     (0.203, 0.175, 0.160, 0.000)
		colorDesert    (0.220, 0.188, 0.155, 0.000)
		colorLowland   (0.242, 0.201, 0.176, 0.000)
		colorUpland    (0.267, 0.243, 0.214, 0.000)
		colorRock      (0.289, 0.265, 0.231, 0.000)
		colorSnow      (0.315, 0.282, 0.244, 1.000)
		BumpHeight      7.03331
		BumpOffset      1.40666
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.176633
		Period          0.260821
		Eccentricity    0.033347
		Inclination     2.39442
		AscendingNode   -172.239
		ArgOfPericenter 155.58
		MeanAnomaly     126.031
	}
}

Asteroid	"S18"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.84996e-018
	Radius          0.0149648
	InertiaMoment   0.399639

	RotationPeriod  7986.44
	Obliquity       1.34217
	EqAscendNode    56.1781

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.737 0.681 0.598)

	Surface
	{
		SurfStyle       0.646152
		OceanStyle      0.337965
		Randomize      (0.200, 0.674, 0.906)
		colorDistMagn   0.318052
		colorDistFreq   8.26502e-008
		detailScale     0.408639
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0413195
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.604436
		terraceProb     0.183365
		erosion         0
		montesMagn      0.538449
		montesFreq      2.85468
		montesSpiky     0.93874
		montesFraction  0.292971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.40055e-007
		hillsFraction   0.721523
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237472
		craterFreq      0.238815
		craterDensity   0.762746
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1065.39
		volcanoTemp     1460.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.232, 0.167, 0.000)
		colorShelf     (0.295, 0.238, 0.191, 0.000)
		colorBeach     (0.346, 0.279, 0.227, 0.000)
		colorDesert    (0.376, 0.300, 0.221, 0.000)
		colorLowland   (0.413, 0.320, 0.251, 0.000)
		colorUpland    (0.457, 0.388, 0.305, 0.000)
		colorRock      (0.494, 0.422, 0.329, 0.000)
		colorSnow      (0.538, 0.449, 0.347, 1.000)
		BumpHeight      0.0134683
		BumpOffset      0.00269366
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.161379
		Period          0.227773
		Eccentricity    0.159718
		Inclination     1.34217
		AscendingNode   56.1781
		ArgOfPericenter 4.04524
		MeanAnomaly     61.3379
	}
}

Asteroid	"S19"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            7.13694e-015
	Radius          0.160242
	InertiaMoment   0.397513

	RotationPeriod  9726.52
	Obliquity       6.59158
	EqAscendNode    -143.748

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.553 0.475 0.435)

	Surface
	{
		SurfStyle       0.39304
		OceanStyle      0.730092
		Randomize      (-0.240, -0.071, -0.902)
		colorDistMagn   0.129901
		colorDistFreq   1.4495e-005
		detailScale     4.37569
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0713797
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.699139
		terraceProb     0.302496
		erosion         0
		montesMagn      0.271135
		montesFreq      3.34395
		montesSpiky     0.875244
		montesFraction  0.700593
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.24459e-005
		hillsFraction   0.686623
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232191
		craterFreq      0.234267
		craterDensity   1.00752
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   297.391
		volcanoTemp     1425.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.190, 0.174, 0.000)
		colorShelf     (0.235, 0.202, 0.185, 0.000)
		colorBeach     (0.249, 0.214, 0.196, 0.000)
		colorDesert    (0.263, 0.226, 0.206, 0.000)
		colorLowland   (0.277, 0.238, 0.217, 0.000)
		colorUpland    (0.290, 0.249, 0.228, 0.000)
		colorRock      (0.304, 0.261, 0.239, 0.000)
		colorSnow      (0.318, 0.273, 0.250, 1.000)
		BumpHeight      0.144218
		BumpOffset      0.0288436
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.158602
		Period          0.22192
		Eccentricity    0.137259
		Inclination     6.59158
		AscendingNode   -143.748
		ArgOfPericenter 178.563
		MeanAnomaly     -94.5867
	}
}

Asteroid	"S20"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.05024e-011
	Radius          1.93606
	InertiaMoment   0.398865

	Obliquity       1.98355
	EqAscendNode    58.9013
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.609 0.606 0.603)

	Surface
	{
		SurfStyle       0.700938
		OceanStyle      0.681949
		Randomize      (0.784, 0.684, -0.663)
		colorDistMagn   0.836073
		colorDistFreq   0.00238094
		detailScale     52.8673
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0602521
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.594103
		terraceProb     0.597677
		erosion         0
		montesMagn      0.451179
		montesFreq      3.10549
		montesSpiky     0.994387
		montesFraction  0.104398
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00948972
		hillsFraction   0.44813
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236836
		craterFreq      0.228025
		craterDensity   0.867804
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   93.6657
		volcanoTemp     1274.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.206, 0.169, 0.000)
		colorShelf     (0.244, 0.212, 0.193, 0.000)
		colorBeach     (0.286, 0.249, 0.229, 0.000)
		colorDesert    (0.311, 0.267, 0.223, 0.000)
		colorLowland   (0.341, 0.285, 0.253, 0.000)
		colorUpland    (0.378, 0.346, 0.307, 0.000)
		colorRock      (0.408, 0.376, 0.332, 0.000)
		colorSnow      (0.445, 0.400, 0.350, 1.000)
		BumpHeight      1.74245
		BumpOffset      0.348491
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.173009
		Period          0.252834
		Eccentricity    0.0193697
		Inclination     1.98355
		AscendingNode   58.9013
		ArgOfPericenter -166.306
		MeanAnomaly     115.107
	}
}

Asteroid	"S21"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.54549e-008
	Radius          20.7299
	InertiaMoment   0.399817

	Obliquity       -0.822202
	EqAscendNode    -97.9329
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.720 0.716 0.713)

	Surface
	{
		SurfStyle       0.0600824
		OceanStyle      0.957236
		Randomize      (0.138, -0.238, -0.072)
		colorDistMagn   0.332034
		colorDistFreq   0.189091
		detailScale     566.065
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0188407
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.414732
		terraceProb     0.236613
		erosion         0
		montesMagn      0.225594
		montesFreq      2.36752
		montesSpiky     0.929695
		montesFraction  0.502597
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.915957
		hillsFraction   0.738863
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263357
		craterFreq      0.264706
		craterDensity   0.928306
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.1439
		volcanoTemp     1546.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.287, 0.285, 0.000)
		colorShelf     (0.306, 0.304, 0.303, 0.000)
		colorBeach     (0.324, 0.322, 0.321, 0.000)
		colorDesert    (0.342, 0.340, 0.339, 0.000)
		colorLowland   (0.360, 0.358, 0.356, 0.000)
		colorUpland    (0.378, 0.376, 0.374, 0.000)
		colorRock      (0.396, 0.394, 0.392, 0.000)
		colorSnow      (0.414, 0.412, 0.410, 1.000)
		BumpHeight      18.6569
		BumpOffset      3.73138
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.156729
		Period          0.218001
		Eccentricity    0.113626
		Inclination     -0.822202
		AscendingNode   -97.9329
		ArgOfPericenter -95.365
		MeanAnomaly     51.9546
	}
}

Asteroid	"S22"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            9.05401e-017
	Radius          0.0396982
	InertiaMoment   0.397857

	RotationPeriod  1258.12
	Obliquity       3.29502
	EqAscendNode    -91.0622

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.786 0.783 0.781)

	Surface
	{
		SurfStyle       0.565873
		OceanStyle      0.501145
		Randomize      (0.591, 0.160, 0.190)
		colorDistMagn   0.823108
		colorDistFreq   5.03069e-007
		detailScale     1.08403
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0804626
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.549951
		terraceProb     0.228032
		erosion         0
		montesMagn      0.432647
		montesFreq      2.74311
		montesSpiky     0.817721
		montesFraction  0.56566
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.09787e-006
		hillsFraction   0.505142
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278318
		craterFreq      0.271215
		craterDensity   0.794526
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   654.119
		volcanoTemp     1666.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.266, 0.219, 0.000)
		colorShelf     (0.314, 0.274, 0.250, 0.000)
		colorBeach     (0.369, 0.321, 0.297, 0.000)
		colorDesert    (0.401, 0.344, 0.289, 0.000)
		colorLowland   (0.440, 0.368, 0.328, 0.000)
		colorUpland    (0.487, 0.446, 0.398, 0.000)
		colorRock      (0.526, 0.485, 0.430, 0.000)
		colorSnow      (0.574, 0.516, 0.453, 1.000)
		BumpHeight      0.0357284
		BumpOffset      0.00714568
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.155427
		Period          0.215289
		Eccentricity    0.140118
		Inclination     3.29502
		AscendingNode   -91.0622
		ArgOfPericenter -117.062
		MeanAnomaly     -112.708
	}
}

Asteroid	"S23"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.33235e-013
	Radius          0.425088
	InertiaMoment   0.399067

	Obliquity       4.85629
	EqAscendNode    -158.203
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.494 0.488 0.485)

	Surface
	{
		SurfStyle       0.764834
		OceanStyle      0.206483
		Randomize      (-0.645, -0.742, -0.621)
		colorDistMagn   0.668823
		colorDistFreq   0.000107989
		detailScale     11.6077
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0320072
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.677958
		terraceProb     0.366654
		erosion         0
		montesMagn      0.506069
		montesFreq      2.28453
		montesSpiky     0.94343
		montesFraction  0.130006
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000381385
		hillsFraction   0.718179
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215698
		craterFreq      0.267536
		craterDensity   0.842697
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   182.59
		volcanoTemp     1253.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.166, 0.136, 0.000)
		colorShelf     (0.198, 0.171, 0.155, 0.000)
		colorBeach     (0.232, 0.200, 0.184, 0.000)
		colorDesert    (0.252, 0.215, 0.179, 0.000)
		colorLowland   (0.277, 0.229, 0.204, 0.000)
		colorUpland    (0.306, 0.278, 0.247, 0.000)
		colorRock      (0.331, 0.303, 0.267, 0.000)
		colorSnow      (0.361, 0.322, 0.281, 1.000)
		BumpHeight      0.38258
		BumpOffset      0.0765159
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.157869
		Period          0.220384
		Eccentricity    0.0950885
		Inclination     4.8563
		AscendingNode   -158.203
		ArgOfPericenter -171.403
		MeanAnomaly     -70.3186
	}
}

Asteroid	"S24"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.96062e-010
	Radius          5.13591
	InertiaMoment   0.399994

	RotationPeriod  2270.41
	Obliquity       -2.68078
	EqAscendNode    163.946

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.830 0.797 0.759)

	Surface
	{
		SurfStyle       0.135999
		OceanStyle      0.931513
		Randomize      (0.099, 0.098, -0.990)
		colorDistMagn   0.165914
		colorDistFreq   0.00665449
		detailScale     140.244
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0130607
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.541898
		terraceProb     0.155752
		erosion         0
		montesMagn      0.422119
		montesFreq      3.37893
		montesSpiky     0.962997
		montesFraction  0.716912
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0527014
		hillsFraction   0.462211
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227904
		craterFreq      0.244267
		craterDensity   0.814429
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.5078
		volcanoTemp     1625.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.332, 0.319, 0.303, 0.000)
		colorShelf     (0.353, 0.339, 0.322, 0.000)
		colorBeach     (0.374, 0.359, 0.341, 0.000)
		colorDesert    (0.394, 0.379, 0.360, 0.000)
		colorLowland   (0.415, 0.399, 0.379, 0.000)
		colorUpland    (0.436, 0.419, 0.398, 0.000)
		colorRock      (0.457, 0.439, 0.417, 0.000)
		colorSnow      (0.477, 0.458, 0.436, 1.000)
		BumpHeight      4.62231
		BumpOffset      0.924463
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.145131
		Period          0.194256
		Eccentricity    0.0791185
		Inclination     -2.68078
		AscendingNode   163.946
		ArgOfPericenter 159.42
		MeanAnomaly     -53.9591
	}
}

Asteroid	"S25"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.88516e-007
	Radius          54.9833
	InertiaMoment   0.398147

	RotationPeriod  3575.48
	Obliquity       1.10703
	EqAscendNode    163.86

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.822 0.728 0.679)

	Surface
	{
		SurfStyle       0.14439
		OceanStyle      0.444616
		Randomize      (-0.892, 0.369, -0.222)
		colorDistMagn   0.356872
		colorDistFreq   1.24232
		detailScale     1501.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00542628
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575586
		terraceProb     0.199617
		erosion         0
		montesMagn      0.436006
		montesFreq      2.74312
		montesSpiky     0.949464
		montesFraction  0.660533
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.69338
		hillsFraction   0.776909
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231717
		craterFreq      0.219448
		craterDensity   0.816633
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   16.0491
		volcanoTemp     1602.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.329, 0.291, 0.272, 0.000)
		colorShelf     (0.349, 0.309, 0.289, 0.000)
		colorBeach     (0.370, 0.328, 0.306, 0.000)
		colorDesert    (0.390, 0.346, 0.323, 0.000)
		colorLowland   (0.411, 0.364, 0.340, 0.000)
		colorUpland    (0.431, 0.382, 0.357, 0.000)
		colorRock      (0.452, 0.400, 0.374, 0.000)
		colorSnow      (0.473, 0.419, 0.391, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.169294
		Period          0.244734
		Eccentricity    0.156995
		Inclination     1.10703
		AscendingNode   163.86
		ArgOfPericenter 136.837
		MeanAnomaly     -126.896
	}
}

Asteroid	"S26"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.69023e-015
	Radius          0.105311
	InertiaMoment   0.399259

	Obliquity       -1.83689
	EqAscendNode    -50.7037
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.609 0.606 0.601)

	Surface
	{
		SurfStyle       0.832814
		OceanStyle      0.478213
		Randomize      (-0.553, 0.657, -0.231)
		colorDistMagn   0.842937
		colorDistFreq   5.20551e-006
		detailScale     2.87569
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0579106
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.422345
		terraceProb     0.140607
		erosion         0
		montesMagn      0.441653
		montesFreq      3.31118
		montesSpiky     0.985033
		montesFraction  0.622416
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.55839e-005
		hillsFraction   0.742988
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223109
		craterFreq      0.236323
		craterDensity   0.94089
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   401.612
		volcanoTemp     1293.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.206, 0.168, 0.000)
		colorShelf     (0.243, 0.212, 0.192, 0.000)
		colorBeach     (0.286, 0.248, 0.228, 0.000)
		colorDesert    (0.310, 0.266, 0.222, 0.000)
		colorLowland   (0.341, 0.285, 0.252, 0.000)
		colorUpland    (0.377, 0.345, 0.306, 0.000)
		colorRock      (0.408, 0.375, 0.331, 0.000)
		colorSnow      (0.444, 0.400, 0.349, 1.000)
		BumpHeight      0.0947798
		BumpOffset      0.018956
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.144983
		Period          0.193959
		Eccentricity    0.0781784
		Inclination     -1.83689
		AscendingNode   -50.7037
		ArgOfPericenter 38.0687
		MeanAnomaly     -118.047
	}
}

Asteroid	"S27"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.48726e-012
	Radius          1.12766
	InertiaMoment   0.396346

	Obliquity       5.49801
	EqAscendNode    43.2812
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.461 0.458 0.451)

	Surface
	{
		SurfStyle       0.910006
		OceanStyle      0.755235
		Randomize      (0.174, -0.210, -0.898)
		colorDistMagn   0.514121
		colorDistFreq   0.000627674
		detailScale     30.7928
		colorConversion true
		snowLevel       2
		tropicLatitude  0.177408
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.352603
		terraceProb     0.55878
		erosion         0
		montesMagn      0.468935
		montesFreq      4.14294
		montesSpiky     0.977779
		montesFraction  0.561395
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00292472
		hillsFraction   0.695366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230883
		craterFreq      0.230876
		craterDensity   0.942219
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   112.105
		volcanoTemp     1487.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.157, 0.160, 0.181, 0.050)
		colorShelf     (0.184, 0.188, 0.208, 0.040)
		colorBeach     (0.212, 0.215, 0.235, 0.030)
		colorDesert    (0.240, 0.243, 0.266, 0.020)
		colorLowland   (0.267, 0.270, 0.293, 0.030)
		colorUpland    (0.295, 0.297, 0.321, 0.050)
		colorRock      (0.323, 0.325, 0.357, 0.020)
		colorSnow      (0.323, 0.325, 0.357, 1.000)
		BumpHeight      1.0149
		BumpOffset      0.20298
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.158348
		Period          0.221387
		Eccentricity    0.0817184
		Inclination     5.49801
		AscendingNode   43.2812
		ArgOfPericenter 97.9509
		MeanAnomaly     -91.2338
	}
}

Asteroid	"S28"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.66013e-009
	Radius          13.6241
	InertiaMoment   0.398403

	Obliquity       -6.43828
	EqAscendNode    44.355
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.793 0.789 0.787)

	Surface
	{
		SurfStyle       0.010768
		OceanStyle      0.849855
		Randomize      (0.704, 0.431, 0.117)
		colorDistMagn   0.748092
		colorDistFreq   0.103884
		detailScale     372.028
		colorConversion true
		snowLevel       2
		tropicLatitude  0.206552
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.441561
		terraceProb     0.469726
		erosion         0
		montesMagn      0.526519
		montesFreq      2.90618
		montesSpiky     0.968088
		montesFraction  0.283007
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.401375
		hillsFraction   0.576099
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241509
		craterFreq      0.233075
		craterDensity   1.01744
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.3073
		volcanoTemp     1633.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.316, 0.315, 0.000)
		colorShelf     (0.337, 0.335, 0.335, 0.000)
		colorBeach     (0.357, 0.355, 0.354, 0.000)
		colorDesert    (0.377, 0.375, 0.374, 0.000)
		colorLowland   (0.397, 0.395, 0.394, 0.000)
		colorUpland    (0.416, 0.414, 0.413, 0.000)
		colorRock      (0.436, 0.434, 0.433, 0.000)
		colorSnow      (0.456, 0.454, 0.453, 1.000)
		BumpHeight      12.2617
		BumpOffset      2.45233
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.161501
		Period          0.228033
		Eccentricity    0.142746
		Inclination     -6.43828
		AscendingNode   44.355
		ArgOfPericenter 9.75995
		MeanAnomaly     -63.9991
	}
}

Asteroid	"S29"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.14424e-017
	Radius          0.0231223
	InertiaMoment   0.399445

	Obliquity       2.3818
	EqAscendNode    107.767
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.513 0.448 0.345)

	Surface
	{
		SurfStyle       0.00246045
		OceanStyle      0.724633
		Randomize      (0.553, -0.698, 0.064)
		colorDistMagn   0.423735
		colorDistFreq   2.6666e-007
		detailScale     0.631394
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0489767
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.306199
		terraceProb     0.310742
		erosion         0
		montesMagn      0.466978
		montesFreq      2.46978
		montesSpiky     0.965221
		montesFraction  0.506159
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.2759e-007
		hillsFraction   0.562112
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230421
		craterFreq      0.222838
		craterDensity   0.807997
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   782.891
		volcanoTemp     1352.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.179, 0.138, 0.000)
		colorShelf     (0.218, 0.190, 0.146, 0.000)
		colorBeach     (0.231, 0.202, 0.155, 0.000)
		colorDesert    (0.244, 0.213, 0.164, 0.000)
		colorLowland   (0.257, 0.224, 0.172, 0.000)
		colorUpland    (0.269, 0.235, 0.181, 0.000)
		colorRock      (0.282, 0.246, 0.190, 0.000)
		colorSnow      (0.295, 0.258, 0.198, 1.000)
		BumpHeight      0.0208101
		BumpOffset      0.00416202
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.173559
		Period          0.254042
		Eccentricity    0.0309037
		Inclination     2.3818
		AscendingNode   107.767
		ArgOfPericenter 73.1188
		MeanAnomaly     -65.8028
	}
}

Asteroid	"S30"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.15537e-014
	Radius          0.279367
	InertiaMoment   0.397033

	RotationPeriod  2945.54
	Obliquity       0.388892
	EqAscendNode    -141.047

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.780 0.742 0.674)

	Surface
	{
		SurfStyle       0.816352
		OceanStyle      0.731123
		Randomize      (0.585, 0.296, 0.886)
		colorDistMagn   0.891292
		colorDistFreq   4.14561e-005
		detailScale     7.62858
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00452812
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.458695
		terraceProb     0.649174
		erosion         0
		montesMagn      0.611651
		montesFreq      3.54572
		montesSpiky     0.973387
		montesFraction  0.478834
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000146878
		hillsFraction   0.573419
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253405
		craterFreq      0.22144
		craterDensity   0.934279
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   246.579
		volcanoTemp     1588.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.252, 0.189, 0.000)
		colorShelf     (0.312, 0.260, 0.216, 0.000)
		colorBeach     (0.367, 0.304, 0.256, 0.000)
		colorDesert    (0.398, 0.326, 0.249, 0.000)
		colorLowland   (0.437, 0.349, 0.283, 0.000)
		colorUpland    (0.483, 0.423, 0.344, 0.000)
		colorRock      (0.522, 0.460, 0.371, 0.000)
		colorSnow      (0.569, 0.490, 0.391, 1.000)
		BumpHeight      0.25143
		BumpOffset      0.050286
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.148774
		Period          0.201616
		Eccentricity    0.0769844
		Inclination     0.388892
		AscendingNode   -141.047
		ArgOfPericenter 23.9663
		MeanAnomaly     105.284
	}
}

Asteroid	"S31"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.64328e-011
	Radius          2.99143
	InertiaMoment   0.398634

	Obliquity       0.552872
	EqAscendNode    18.2393
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.492 0.428 0.352)

	Surface
	{
		SurfStyle       0.713612
		OceanStyle      0.849238
		Randomize      (0.719, 0.644, -0.947)
		colorDistMagn   0.565582
		colorDistFreq   0.00152183
		detailScale     81.686
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0190546
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.36784
		terraceProb     0.229184
		erosion         0
		montesMagn      0.381993
		montesFreq      3.67288
		montesSpiky     0.916917
		montesFraction  0.305091
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0231561
		hillsFraction   0.696365
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25604
		craterFreq      0.217658
		craterDensity   1.04219
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   68.8292
		volcanoTemp     1508.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.146, 0.098, 0.000)
		colorShelf     (0.197, 0.150, 0.113, 0.000)
		colorBeach     (0.231, 0.176, 0.134, 0.000)
		colorDesert    (0.251, 0.188, 0.130, 0.000)
		colorLowland   (0.276, 0.201, 0.148, 0.000)
		colorUpland    (0.305, 0.244, 0.179, 0.000)
		colorRock      (0.330, 0.266, 0.193, 0.000)
		colorSnow      (0.359, 0.283, 0.204, 1.000)
		BumpHeight      2.69229
		BumpOffset      0.538458
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.163772
		Period          0.232858
		Eccentricity    0.0192552
		Inclination     0.552872
		AscendingNode   18.2393
		ArgOfPericenter 178.565
		MeanAnomaly     138.883
	}
}

Asteroid	"S32"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            6.83283e-008
	Radius          36.1385
	InertiaMoment   0.399626

	Obliquity       -6.19801
	EqAscendNode    98.2459
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.653 0.557 0.439)

	Surface
	{
		SurfStyle       0.758682
		OceanStyle      0.547114
		Randomize      (0.493, -0.998, -0.644)
		colorDistMagn   0.447054
		colorDistFreq   0.751416
		detailScale     986.823
		colorConversion true
		snowLevel       2
		tropicLatitude  0.140959
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.660159
		terraceProb     0.571909
		erosion         0
		montesMagn      0.58334
		montesFreq      3.42786
		montesSpiky     0.858162
		montesFraction  0.369525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.84502
		hillsFraction   0.731398
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230131
		craterFreq      0.226104
		craterDensity   0.939081
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.6759
		volcanoTemp     1588.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.189, 0.123, 0.000)
		colorShelf     (0.261, 0.195, 0.140, 0.000)
		colorBeach     (0.307, 0.228, 0.167, 0.000)
		colorDesert    (0.333, 0.245, 0.162, 0.000)
		colorLowland   (0.366, 0.262, 0.184, 0.000)
		colorUpland    (0.405, 0.317, 0.224, 0.000)
		colorRock      (0.438, 0.345, 0.241, 0.000)
		colorSnow      (0.477, 0.368, 0.254, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.182476
		Period          0.273867
		Eccentricity    0.0713528
		Inclination     -6.19801
		AscendingNode   98.2459
		ArgOfPericenter 4.28231
		MeanAnomaly     20.1832
	}
}

Asteroid	"S33"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.00292e-016
	Radius          0.0613385
	InertiaMoment   0.397483

	Obliquity       -3.06237
	EqAscendNode    75.7809
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.411 0.405 0.400)

	Surface
	{
		SurfStyle       0.534541
		OceanStyle      0.787008
		Randomize      (0.388, 0.775, 0.050)
		colorDistMagn   0.241601
		colorDistFreq   3.21427e-006
		detailScale     1.67495
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0842465
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637396
		terraceProb     0.315246
		erosion         0
		montesMagn      0.507867
		montesFreq      3.1242
		montesSpiky     0.796157
		montesFraction  0.643345
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.05968e-006
		hillsFraction   0.724721
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239005
		craterFreq      0.260132
		craterDensity   0.804163
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   480.674
		volcanoTemp     1197.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.138, 0.112, 0.000)
		colorShelf     (0.164, 0.142, 0.128, 0.000)
		colorBeach     (0.193, 0.166, 0.152, 0.000)
		colorDesert    (0.210, 0.178, 0.148, 0.000)
		colorLowland   (0.230, 0.190, 0.168, 0.000)
		colorUpland    (0.255, 0.231, 0.204, 0.000)
		colorRock      (0.275, 0.251, 0.220, 0.000)
		colorSnow      (0.300, 0.267, 0.232, 1.000)
		BumpHeight      0.0552046
		BumpOffset      0.0110409
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.144892
		Period          0.193775
		Eccentricity    0.0775952
		Inclination     -3.06237
		AscendingNode   75.7809
		ArgOfPericenter 3.9302
		MeanAnomaly     -93.4226
	}
}

Asteroid	"S34"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            5.89052e-013
	Radius          0.741098
	InertiaMoment   0.398849

	Obliquity       -0.718196
	EqAscendNode    -76.2374
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.814 0.782 0.769)

	Surface
	{
		SurfStyle       0.130391
		OceanStyle      0.21121
		Randomize      (-0.651, 0.414, 0.489)
		colorDistMagn   0.713293
		colorDistFreq   0.000274783
		detailScale     20.2369
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0197216
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.379422
		terraceProb     0.296462
		erosion         0
		montesMagn      0.558611
		montesFreq      2.68473
		montesSpiky     0.962415
		montesFraction  0.254638
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00106481
		hillsFraction   0.726367
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24461
		craterFreq      0.194767
		craterDensity   0.810398
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   151.393
		volcanoTemp     1468.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.326, 0.313, 0.308, 0.000)
		colorShelf     (0.346, 0.332, 0.327, 0.000)
		colorBeach     (0.366, 0.352, 0.346, 0.000)
		colorDesert    (0.387, 0.371, 0.365, 0.000)
		colorLowland   (0.407, 0.391, 0.385, 0.000)
		colorUpland    (0.427, 0.411, 0.404, 0.000)
		colorRock      (0.448, 0.430, 0.423, 0.000)
		colorSnow      (0.468, 0.450, 0.442, 1.000)
		BumpHeight      0.666988
		BumpOffset      0.133398
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.149584
		Period          0.203264
		Eccentricity    0.106529
		Inclination     -0.718196
		AscendingNode   -76.2374
		ArgOfPericenter -118.913
		MeanAnomaly     -59.2622
	}
}

Asteroid	"S35"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            8.66821e-010
	Radius          7.93549
	InertiaMoment   0.399804

	Obliquity       -2.52125
	EqAscendNode    -127.094
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.478 0.395 0.344)

	Surface
	{
		SurfStyle       0.460368
		OceanStyle      0.381596
		Randomize      (-0.216, -0.379, 0.654)
		colorDistMagn   0.439965
		colorDistFreq   0.0409558
		detailScale     216.692
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0391845
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.765736
		terraceProb     0.181291
		erosion         0
		montesMagn      0.445413
		montesFreq      2.79708
		montesSpiky     0.89047
		montesFraction  0.691994
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.165016
		hillsFraction   0.94365
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242405
		craterFreq      0.241583
		craterDensity   0.675863
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.2586
		volcanoTemp     1385.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.158, 0.138, 0.000)
		colorShelf     (0.203, 0.168, 0.146, 0.000)
		colorBeach     (0.215, 0.178, 0.155, 0.000)
		colorDesert    (0.227, 0.188, 0.164, 0.000)
		colorLowland   (0.239, 0.197, 0.172, 0.000)
		colorUpland    (0.251, 0.207, 0.181, 0.000)
		colorRock      (0.263, 0.217, 0.189, 0.000)
		colorSnow      (0.275, 0.227, 0.198, 1.000)
		BumpHeight      7.14194
		BumpOffset      1.42839
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.175845
		Period          0.259077
		Eccentricity    0.0812951
		Inclination     -2.52125
		AscendingNode   -127.094
		ArgOfPericenter -72.2783
		MeanAnomaly     22.6989
	}
}

Asteroid	"S36"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            5.07816e-018
	Radius          0.0151959
	InertiaMoment   0.397833

	Obliquity       1.12186
	EqAscendNode    88.932
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.719 0.666 0.603)

	Surface
	{
		SurfStyle       0.930293
		OceanStyle      0.0133484
		Randomize      (0.470, 0.705, 0.297)
		colorDistMagn   0.60161
		colorDistFreq   1.72193e-007
		detailScale     0.41495
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0279426
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.29599
		terraceProb     0.318377
		erosion         0
		montesMagn      0.428333
		montesFreq      3.05436
		montesSpiky     0.900597
		montesFraction  0.328094
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.23981e-007
		hillsFraction   0.625792
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277683
		craterFreq      0.197967
		craterDensity   0.989514
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1057.25
		volcanoTemp     1468.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.233, 0.241, 0.050)
		colorShelf     (0.288, 0.273, 0.277, 0.040)
		colorBeach     (0.331, 0.313, 0.313, 0.030)
		colorDesert    (0.374, 0.353, 0.356, 0.020)
		colorLowland   (0.417, 0.393, 0.392, 0.030)
		colorUpland    (0.460, 0.433, 0.428, 0.050)
		colorRock      (0.503, 0.473, 0.476, 0.020)
		colorSnow      (0.503, 0.473, 0.476, 1.000)
		BumpHeight      0.0136763
		BumpOffset      0.00273526
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.156002
		Period          0.216484
		Eccentricity    0.0489733
		Inclination     1.12186
		AscendingNode   88.932
		ArgOfPericenter 15.6308
		MeanAnomaly     -122.223
	}
}

Asteroid	"S37"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            7.47278e-015
	Radius          0.162717
	InertiaMoment   0.399051

	RotationPeriod  4130.94
	Obliquity       0.808899
	EqAscendNode    172.757

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.515 0.511 0.509)

	Surface
	{
		SurfStyle       0.928145
		OceanStyle      0.6899
		Randomize      (-0.913, 0.467, -0.772)
		colorDistMagn   0.528439
		colorDistFreq   4.76106e-006
		detailScale     4.44327
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00179406
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.285851
		terraceProb     0.326935
		erosion         0
		montesMagn      0.391429
		montesFreq      3.02157
		montesSpiky     0.846993
		montesFraction  0.785105
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.29059e-005
		hillsFraction   0.648911
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271122
		craterFreq      0.269437
		craterDensity   1.08883
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   295.12
		volcanoTemp     1428.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.179, 0.204, 0.050)
		colorShelf     (0.206, 0.209, 0.234, 0.040)
		colorBeach     (0.237, 0.240, 0.265, 0.030)
		colorDesert    (0.268, 0.271, 0.300, 0.020)
		colorLowland   (0.299, 0.301, 0.331, 0.030)
		colorUpland    (0.330, 0.332, 0.362, 0.050)
		colorRock      (0.360, 0.363, 0.402, 0.020)
		colorSnow      (0.360, 0.363, 0.402, 1.000)
		BumpHeight      0.146446
		BumpOffset      0.0292891
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.165068
		Period          0.235628
		Eccentricity    0.131366
		Inclination     0.808899
		AscendingNode   172.757
		ArgOfPericenter 86.8689
		MeanAnomaly     107.169
	}
}

Asteroid	"S38"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.09966e-011
	Radius          1.96596
	InertiaMoment   0.39998

	RotationPeriod  1308.66
	Obliquity       -0.316935
	EqAscendNode    -8.66784

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.705 0.702 0.701)

	Surface
	{
		SurfStyle       0.897339
		OceanStyle      0.759647
		Randomize      (-0.112, 0.426, 0.987)
		colorDistMagn   0.455849
		colorDistFreq   0.00188462
		detailScale     53.6839
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0110322
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.275727
		terraceProb     0.148187
		erosion         0
		montesMagn      0.42015
		montesFreq      2.19215
		montesSpiky     0.911987
		montesFraction  0.627796
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0102619
		hillsFraction   0.524705
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25359
		craterFreq      0.142624
		craterDensity   0.744345
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   92.9506
		volcanoTemp     1768.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.246, 0.280, 0.050)
		colorShelf     (0.282, 0.288, 0.322, 0.040)
		colorBeach     (0.324, 0.330, 0.364, 0.030)
		colorDesert    (0.367, 0.372, 0.414, 0.020)
		colorLowland   (0.409, 0.414, 0.456, 0.030)
		colorUpland    (0.451, 0.456, 0.498, 0.050)
		colorRock      (0.493, 0.499, 0.554, 0.020)
		colorSnow      (0.493, 0.499, 0.554, 1.000)
		BumpHeight      1.76937
		BumpOffset      0.353873
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.159562
		Period          0.223938
		Eccentricity    0.135227
		Inclination     -0.316935
		AscendingNode   -8.66784
		ArgOfPericenter -152.93
		MeanAnomaly     -62.0501
	}
}

Asteroid	"S39"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.6182e-008
	Radius          21.05
	InertiaMoment   0.398126

	RotationPeriod  3277.84
	Obliquity       0.83665
	EqAscendNode    -132.344

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.776 0.773 0.770)

	Surface
	{
		SurfStyle       0.04956
		OceanStyle      0.0531388
		Randomize      (-0.812, -0.812, -0.609)
		colorDistMagn   0.589075
		colorDistFreq   0.0148546
		detailScale     574.807
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0117996
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533679
		terraceProb     0.225299
		erosion         0
		montesMagn      0.664272
		montesFreq      2.72297
		montesSpiky     0.937037
		montesFraction  0.483471
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.791986
		hillsFraction   0.797747
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229199
		craterFreq      0.211582
		craterDensity   0.906217
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.9443
		volcanoTemp     1592.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.309, 0.308, 0.000)
		colorShelf     (0.330, 0.329, 0.327, 0.000)
		colorBeach     (0.349, 0.348, 0.347, 0.000)
		colorDesert    (0.369, 0.367, 0.366, 0.000)
		colorLowland   (0.388, 0.387, 0.385, 0.000)
		colorUpland    (0.407, 0.406, 0.404, 0.000)
		colorRock      (0.427, 0.425, 0.424, 0.000)
		colorSnow      (0.446, 0.445, 0.443, 1.000)
		BumpHeight      18.945
		BumpOffset      3.78901
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.171388
		Period          0.24929
		Eccentricity    0.0937787
		Inclination     0.83665
		AscendingNode   -132.344
		ArgOfPericenter -55.8695
		MeanAnomaly     -35.6829
	}
}

Asteroid	"S40"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            9.48001e-017
	Radius          0.0403114
	InertiaMoment   0.399244

	RotationPeriod  3155.43
	Obliquity       -0.28998
	EqAscendNode    -166.214

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.691 0.685 0.683)

	Surface
	{
		SurfStyle       0.98117
		OceanStyle      0.0800188
		Randomize      (0.080, 0.958, -0.425)
		colorDistMagn   0.1841
		colorDistFreq   2.72917e-007
		detailScale     1.10077
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00119604
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.626338
		terraceProb     0.277665
		erosion         0
		montesMagn      0.609606
		montesFreq      2.93999
		montesSpiky     0.944319
		montesFraction  0.396259
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.85675e-006
		hillsFraction   0.849337
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262393
		craterFreq      0.233423
		craterDensity   0.780733
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   649.127
		volcanoTemp     1422.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.240, 0.273, 0.050)
		colorShelf     (0.276, 0.281, 0.314, 0.040)
		colorBeach     (0.318, 0.322, 0.355, 0.030)
		colorDesert    (0.359, 0.363, 0.403, 0.020)
		colorLowland   (0.401, 0.404, 0.444, 0.030)
		colorUpland    (0.442, 0.445, 0.485, 0.050)
		colorRock      (0.484, 0.486, 0.540, 0.020)
		colorSnow      (0.484, 0.486, 0.540, 1.000)
		BumpHeight      0.0362803
		BumpOffset      0.00725605
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.167094
		Period          0.23998
		Eccentricity    0.143751
		Inclination     -0.28998
		AscendingNode   -166.214
		ArgOfPericenter 100.878
		MeanAnomaly     -66.1066
	}
}

Asteroid	"S41"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.39503e-013
	Radius          0.431653
	InertiaMoment   0.396271

	Obliquity       2.73797
	EqAscendNode    161.007
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.429 0.427 0.424)

	Surface
	{
		SurfStyle       0.387117
		OceanStyle      0.381504
		Randomize      (0.762, -0.420, -0.677)
		colorDistMagn   0.719084
		colorDistFreq   7.7432e-005
		detailScale     11.787
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0157612
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.764224
		terraceProb     0.725052
		erosion         0
		montesMagn      0.563305
		montesFreq      3.90061
		montesSpiky     0.960601
		montesFraction  0.732084
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000357365
		hillsFraction   0.695483
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271047
		craterFreq      0.238173
		craterDensity   0.984432
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   181.196
		volcanoTemp     1572.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.171, 0.170, 0.000)
		colorShelf     (0.183, 0.181, 0.180, 0.000)
		colorBeach     (0.193, 0.192, 0.191, 0.000)
		colorDesert    (0.204, 0.203, 0.202, 0.000)
		colorLowland   (0.215, 0.213, 0.212, 0.000)
		colorUpland    (0.225, 0.224, 0.223, 0.000)
		colorRock      (0.236, 0.235, 0.233, 0.000)
		colorSnow      (0.247, 0.245, 0.244, 1.000)
		BumpHeight      0.388488
		BumpOffset      0.0776976
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.178298
		Period          0.264517
		Eccentricity    0.143274
		Inclination     2.73797
		AscendingNode   161.007
		ArgOfPericenter 147.324
		MeanAnomaly     -110.032
	}
}

Asteroid	"S42"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.05287e-010
	Radius          5.21522
	InertiaMoment   0.398384

	Obliquity       -2.04531
	EqAscendNode    134.747
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.509 0.504 0.500)

	Surface
	{
		SurfStyle       0.860716
		OceanStyle      0.0401179
		Randomize      (-0.771, -0.126, 0.363)
		colorDistMagn   0.831885
		colorDistFreq   0.0118169
		detailScale     142.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0274586
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498366
		terraceProb     0.455456
		erosion         0
		montesMagn      0.53263
		montesFreq      3.53344
		montesSpiky     0.922292
		montesFraction  0.388346
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0714187
		hillsFraction   0.73945
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244613
		craterFreq      0.254095
		craterDensity   0.789856
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.0687
		volcanoTemp     1157.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.177, 0.200, 0.050)
		colorShelf     (0.204, 0.207, 0.230, 0.040)
		colorBeach     (0.234, 0.237, 0.260, 0.030)
		colorDesert    (0.265, 0.267, 0.295, 0.020)
		colorLowland   (0.295, 0.298, 0.325, 0.030)
		colorUpland    (0.326, 0.328, 0.355, 0.050)
		colorRock      (0.356, 0.358, 0.395, 0.020)
		colorSnow      (0.356, 0.358, 0.395, 1.000)
		BumpHeight      4.6937
		BumpOffset      0.93874
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.184177
		Period          0.277707
		Eccentricity    0.142542
		Inclination     -2.04531
		AscendingNode   134.747
		ArgOfPericenter -63.8374
		MeanAnomaly     3.75385
	}
}

Asteroid	"S43"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.02091e-007
	Radius          55.8322
	InertiaMoment   0.39943

	RotationPeriod  6838.18
	Obliquity       -4.18803
	EqAscendNode    -103.769

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.439 0.433 0.427)

	Surface
	{
		SurfStyle       0.77342
		OceanStyle      0.585135
		Randomize      (-0.499, 0.380, 0.243)
		colorDistMagn   0.289869
		colorDistFreq   2.7211
		detailScale     1524.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0900634
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519046
		terraceProb     0.192439
		erosion         0
		montesMagn      0.560187
		montesFreq      1.44419
		montesSpiky     0.98259
		montesFraction  0.29153
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.9383
		hillsFraction   0.788855
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260994
		craterFreq      0.231891
		craterDensity   0.69889
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   15.9266
		volcanoTemp     1984.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.147, 0.120, 0.000)
		colorShelf     (0.176, 0.151, 0.137, 0.000)
		colorBeach     (0.206, 0.177, 0.162, 0.000)
		colorDesert    (0.224, 0.190, 0.158, 0.000)
		colorLowland   (0.246, 0.203, 0.179, 0.000)
		colorUpland    (0.272, 0.247, 0.218, 0.000)
		colorRock      (0.294, 0.268, 0.235, 0.000)
		colorSnow      (0.321, 0.285, 0.248, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.176277
		Period          0.260033
		Eccentricity    0.120438
		Inclination     -4.18803
		AscendingNode   -103.769
		ArgOfPericenter -179.53
		MeanAnomaly     63.9945
	}
}

Asteroid	"S44"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.76976e-015
	Radius          0.106937
	InertiaMoment   0.396992

	Obliquity       -2.97906
	EqAscendNode    -12.324
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.424 0.421 0.417)

	Surface
	{
		SurfStyle       0.291249
		OceanStyle      0.890266
		Randomize      (0.023, 0.958, 0.259)
		colorDistMagn   0.69895
		colorDistFreq   5.31436e-006
		detailScale     2.9201
		colorConversion true
		snowLevel       2
		tropicLatitude  0.103204
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.294119
		terraceProb     0.188332
		erosion         0
		montesMagn      0.57987
		montesFreq      2.46518
		montesSpiky     0.861238
		montesFraction  0.343316
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.17142e-005
		hillsFraction   0.760652
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248841
		craterFreq      0.229719
		craterDensity   0.980656
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   398.546
		volcanoTemp     1701.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.168, 0.167, 0.000)
		colorShelf     (0.180, 0.179, 0.177, 0.000)
		colorBeach     (0.191, 0.189, 0.187, 0.000)
		colorDesert    (0.202, 0.200, 0.198, 0.000)
		colorLowland   (0.212, 0.210, 0.208, 0.000)
		colorUpland    (0.223, 0.221, 0.219, 0.000)
		colorRock      (0.233, 0.231, 0.229, 0.000)
		colorSnow      (0.244, 0.242, 0.240, 1.000)
		BumpHeight      0.0962436
		BumpOffset      0.0192487
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.169397
		Period          0.244958
		Eccentricity    0.152858
		Inclination     -2.97906
		AscendingNode   -12.324
		ArgOfPericenter -96.7695
		MeanAnomaly     -179.241
	}
}

Asteroid	"S45"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.60429e-012
	Radius          1.14508
	InertiaMoment   0.398617

	RotationPeriod  2652.22
	Obliquity       -3.03207
	EqAscendNode    -54.1221

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.467 0.464 0.460)

	Surface
	{
		SurfStyle       0.650736
		OceanStyle      0.292149
		Randomize      (0.890, 0.162, -0.434)
		colorDistMagn   0.324674
		colorDistFreq   0.000407692
		detailScale     31.2683
		colorConversion true
		snowLevel       2
		tropicLatitude  0.094104
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.27292
		terraceProb     0.472165
		erosion         0
		montesMagn      0.562821
		montesFreq      3.5263
		montesSpiky     0.869545
		montesFraction  0.298955
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00315411
		hillsFraction   0.725753
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245873
		craterFreq      0.225274
		craterDensity   0.973382
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   111.249
		volcanoTemp     1790.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.158, 0.129, 0.000)
		colorShelf     (0.187, 0.162, 0.147, 0.000)
		colorBeach     (0.220, 0.190, 0.175, 0.000)
		colorDesert    (0.238, 0.204, 0.170, 0.000)
		colorLowland   (0.262, 0.218, 0.193, 0.000)
		colorUpland    (0.290, 0.264, 0.234, 0.000)
		colorRock      (0.313, 0.288, 0.253, 0.000)
		colorSnow      (0.341, 0.306, 0.267, 1.000)
		BumpHeight      1.03057
		BumpOffset      0.206114
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.14882
		Period          0.20171
		Eccentricity    0.101945
		Inclination     -3.03207
		AscendingNode   -54.1221
		ArgOfPericenter -18.4977
		MeanAnomaly     -33.0514
	}
}

Asteroid	"S46"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.83236e-009
	Radius          13.8345
	InertiaMoment   0.399612

	RotationPeriod  4336.66
	Obliquity       -1.51977
	EqAscendNode    -88.1914

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.786 0.783 0.781)

	Surface
	{
		SurfStyle       0.924523
		OceanStyle      0.519351
		Randomize      (0.652, 0.571, 0.442)
		colorDistMagn   0.616077
		colorDistFreq   0.137975
		detailScale     377.773
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0380884
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.623955
		terraceProb     0.574295
		erosion         0
		montesMagn      0.512138
		montesFreq      3.12665
		montesSpiky     0.969398
		montesFraction  0.257029
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.437241
		hillsFraction   0.392808
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247253
		craterFreq      0.232702
		craterDensity   0.978182
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.0377
		volcanoTemp     1292.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.274, 0.312, 0.050)
		colorShelf     (0.315, 0.321, 0.359, 0.040)
		colorBeach     (0.362, 0.368, 0.406, 0.030)
		colorDesert    (0.409, 0.415, 0.461, 0.020)
		colorLowland   (0.456, 0.462, 0.507, 0.030)
		colorUpland    (0.503, 0.509, 0.554, 0.050)
		colorRock      (0.550, 0.556, 0.617, 0.020)
		colorSnow      (0.550, 0.556, 0.617, 1.000)
		BumpHeight      12.451
		BumpOffset      2.4902
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.170504
		Period          0.247363
		Eccentricity    0.124015
		Inclination     -1.51977
		AscendingNode   -88.1914
		ArgOfPericenter 33.6744
		MeanAnomaly     55.8879
	}
}

Asteroid	"S47"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.24513e-017
	Radius          0.0234795
	InertiaMoment   0.397453

	RotationPeriod  5136.35
	Obliquity       -0.986957
	EqAscendNode    115.625

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.698 0.597 0.492)

	Surface
	{
		SurfStyle       0.674613
		OceanStyle      0.960314
		Randomize      (0.676, -0.590, -0.720)
		colorDistMagn   0.369489
		colorDistFreq   2.73024e-007
		detailScale     0.641146
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0183504
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637302
		terraceProb     0.145896
		erosion         0
		montesMagn      0.468099
		montesFreq      1.91245
		montesSpiky     0.974563
		montesFraction  0.331208
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.33397e-006
		hillsFraction   0.578387
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251839
		craterFreq      0.224858
		craterDensity   0.871928
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   776.914
		volcanoTemp     1815
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.203, 0.138, 0.000)
		colorShelf     (0.279, 0.209, 0.157, 0.000)
		colorBeach     (0.328, 0.245, 0.187, 0.000)
		colorDesert    (0.356, 0.263, 0.182, 0.000)
		colorLowland   (0.391, 0.281, 0.207, 0.000)
		colorUpland    (0.433, 0.340, 0.251, 0.000)
		colorRock      (0.468, 0.370, 0.270, 0.000)
		colorSnow      (0.509, 0.394, 0.285, 1.000)
		BumpHeight      0.0211315
		BumpOffset      0.0042263
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.164485
		Period          0.234382
		Eccentricity    0.151119
		Inclination     -0.986957
		AscendingNode   115.625
		ArgOfPericenter -123.26
		MeanAnomaly     174.456
	}
}

Asteroid	"S48"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.30383e-014
	Radius          0.283681
	InertiaMoment   0.398833

	Obliquity       -0.335698
	EqAscendNode    -144.656
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.681 0.679 0.677)

	Surface
	{
		SurfStyle       0.118749
		OceanStyle      0.0186018
		Randomize      (0.334, 0.432, -0.554)
		colorDistMagn   0.628392
		colorDistFreq   5.02192e-005
		detailScale     7.74639
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00355474
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.319822
		terraceProb     0.13475
		erosion         0
		montesMagn      0.553011
		montesFreq      2.95966
		montesSpiky     0.930741
		montesFraction  0.66436
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000167586
		hillsFraction   0.775892
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224535
		craterFreq      0.220683
		craterDensity   1.00205
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   244.696
		volcanoTemp     1645.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.271, 0.271, 0.000)
		colorShelf     (0.289, 0.288, 0.288, 0.000)
		colorBeach     (0.306, 0.305, 0.305, 0.000)
		colorDesert    (0.323, 0.322, 0.322, 0.000)
		colorLowland   (0.340, 0.339, 0.339, 0.000)
		colorUpland    (0.357, 0.356, 0.356, 0.000)
		colorRock      (0.374, 0.373, 0.372, 0.000)
		colorSnow      (0.391, 0.390, 0.389, 1.000)
		BumpHeight      0.255313
		BumpOffset      0.0510626
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.154655
		Period          0.213687
		Eccentricity    0.135824
		Inclination     -0.335698
		AscendingNode   -144.656
		ArgOfPericenter -84.0347
		MeanAnomaly     97.5319
	}
}

Asteroid	"S49"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.86176e-011
	Radius          3.03763
	InertiaMoment   0.39979

	Obliquity       -2.8436
	EqAscendNode    -5.82789
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.472 0.467 0.464)

	Surface
	{
		SurfStyle       0.943485
		OceanStyle      0.0250361
		Randomize      (0.824, -0.304, -0.344)
		colorDistMagn   0.817604
		colorDistFreq   0.00449156
		detailScale     82.9476
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0989693
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.738449
		terraceProb     0.479386
		erosion         0
		montesMagn      0.484144
		montesFreq      3.6645
		montesSpiky     0.875464
		montesFraction  0.549306
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.025698
		hillsFraction   0.770972
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258271
		craterFreq      0.179475
		craterDensity   0.702484
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   68.3037
		volcanoTemp     1320.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.161, 0.163, 0.185, 0.050)
		colorShelf     (0.189, 0.191, 0.213, 0.040)
		colorBeach     (0.217, 0.220, 0.241, 0.030)
		colorDesert    (0.246, 0.248, 0.274, 0.020)
		colorLowland   (0.274, 0.276, 0.301, 0.030)
		colorUpland    (0.302, 0.304, 0.329, 0.050)
		colorRock      (0.331, 0.332, 0.366, 0.020)
		colorSnow      (0.331, 0.332, 0.366, 1.000)
		BumpHeight      2.73387
		BumpOffset      0.546774
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.144485
		Period          0.192959
		Eccentricity    0.0749961
		Inclination     -2.8436
		AscendingNode   -5.82789
		ArgOfPericenter 111.207
		MeanAnomaly     125.255
	}
}

Asteroid	"S50"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            7.15433e-008
	Radius          36.6966
	InertiaMoment   0.397808

	Obliquity       -1.13528
	EqAscendNode    39.1511
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.750 0.748 0.745)

	Surface
	{
		SurfStyle       0.94749
		OceanStyle      0.261126
		Randomize      (-0.581, 0.231, -0.430)
		colorDistMagn   0.642799
		colorDistFreq   0.969825
		detailScale     1002.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0373287
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452438
		terraceProb     0.252674
		erosion         0
		montesMagn      0.369771
		montesFreq      2.35344
		montesSpiky     0.853733
		montesFraction  0.629948
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.01066
		hillsFraction   0.628297
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.192272
		craterFreq      0.20193
		craterDensity   0.836217
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.5103
		volcanoTemp     1626.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.262, 0.298, 0.050)
		colorShelf     (0.300, 0.307, 0.343, 0.040)
		colorBeach     (0.345, 0.351, 0.388, 0.030)
		colorDesert    (0.390, 0.396, 0.440, 0.020)
		colorLowland   (0.435, 0.441, 0.485, 0.030)
		colorUpland    (0.480, 0.486, 0.529, 0.050)
		colorRock      (0.525, 0.531, 0.589, 0.020)
		colorSnow      (0.525, 0.531, 0.589, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.146462
		Period          0.196934
		Eccentricity    0.0874854
		Inclination     -1.13528
		AscendingNode   39.1511
		ArgOfPericenter 162.357
		MeanAnomaly     -16.2253
	}
}

Asteroid	"S51"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.19127e-016
	Radius          0.0622859
	InertiaMoment   0.399036

	Obliquity       -4.01539
	EqAscendNode    133.522
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.763 0.723 0.686)

	Surface
	{
		SurfStyle       0.748442
		OceanStyle      0.145342
		Randomize      (-0.017, 0.262, 0.085)
		colorDistMagn   0.697149
		colorDistFreq   1.21834e-006
		detailScale     1.70082
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0552378
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.55027
		terraceProb     0.313857
		erosion         0
		montesMagn      0.28045
		montesFreq      3.02819
		montesSpiky     0.97091
		montesFraction  0.490228
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.61677e-006
		hillsFraction   0.566143
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249194
		craterFreq      0.199905
		craterDensity   0.697761
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   477.005
		volcanoTemp     1804.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.246, 0.192, 0.000)
		colorShelf     (0.305, 0.253, 0.220, 0.000)
		colorBeach     (0.358, 0.296, 0.261, 0.000)
		colorDesert    (0.389, 0.318, 0.254, 0.000)
		colorLowland   (0.427, 0.340, 0.288, 0.000)
		colorUpland    (0.473, 0.412, 0.350, 0.000)
		colorRock      (0.511, 0.448, 0.377, 0.000)
		colorSnow      (0.557, 0.477, 0.398, 1.000)
		BumpHeight      0.0560573
		BumpOffset      0.0112115
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.140888
		Period          0.185798
		Eccentricity    0.05138
		Inclination     -4.01539
		AscendingNode   133.522
		ArgOfPericenter -111.18
		MeanAnomaly     -149.311
	}
}

Asteroid	"S52"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            6.16767e-013
	Radius          0.752543
	InertiaMoment   0.399966

	RotationPeriod  5106.34
	Obliquity       -0.287653
	EqAscendNode    57.108

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.577 0.574 0.570)

	Surface
	{
		SurfStyle       0.441789
		OceanStyle      0.630635
		Randomize      (0.014, -0.492, -0.393)
		colorDistMagn   0.153109
		colorDistFreq   0.000433993
		detailScale     20.5494
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00882282
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.564703
		terraceProb     0.676821
		erosion         0
		montesMagn      0.52445
		montesFreq      3.38136
		montesSpiky     0.961741
		montesFraction  0.369459
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00114721
		hillsFraction   0.445711
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276099
		craterFreq      0.239037
		craterDensity   1.0834
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   150.237
		volcanoTemp     1510.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.230, 0.228, 0.000)
		colorShelf     (0.245, 0.244, 0.242, 0.000)
		colorBeach     (0.260, 0.258, 0.257, 0.000)
		colorDesert    (0.274, 0.273, 0.271, 0.000)
		colorLowland   (0.289, 0.287, 0.285, 0.000)
		colorUpland    (0.303, 0.302, 0.299, 0.000)
		colorRock      (0.317, 0.316, 0.314, 0.000)
		colorSnow      (0.332, 0.330, 0.328, 1.000)
		BumpHeight      0.677289
		BumpOffset      0.135458
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.190124
		Period          0.291265
		Eccentricity    0.108924
		Inclination     -0.287653
		AscendingNode   57.108
		ArgOfPericenter 170.461
		MeanAnomaly     158.136
	}
}

Asteroid	"S53"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            9.07606e-010
	Radius          8.05804
	InertiaMoment   0.398105

	RotationPeriod  4576.48
	Obliquity       2.34796
	EqAscendNode    37.3024

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.508 0.501 0.494)

	Surface
	{
		SurfStyle       0.246104
		OceanStyle      0.723728
		Randomize      (-0.249, -0.483, -0.694)
		colorDistMagn   0.21022
		colorDistFreq   0.046293
		detailScale     220.038
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0775744
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448922
		terraceProb     0.293484
		erosion         0
		montesMagn      0.577935
		montesFreq      3.71752
		montesSpiky     0.96317
		montesFraction  0.575441
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.167881
		hillsFraction   0.767449
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.192054
		craterFreq      0.239416
		craterDensity   0.788556
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.936
		volcanoTemp     1571.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.201, 0.198, 0.000)
		colorShelf     (0.216, 0.213, 0.210, 0.000)
		colorBeach     (0.229, 0.226, 0.223, 0.000)
		colorDesert    (0.241, 0.238, 0.235, 0.000)
		colorLowland   (0.254, 0.251, 0.247, 0.000)
		colorUpland    (0.267, 0.263, 0.260, 0.000)
		colorRock      (0.279, 0.276, 0.272, 0.000)
		colorSnow      (0.292, 0.288, 0.284, 1.000)
		BumpHeight      7.25224
		BumpOffset      1.45045
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.152304
		Period          0.208834
		Eccentricity    0.105254
		Inclination     2.34796
		AscendingNode   37.3024
		ArgOfPericenter 149.758
		MeanAnomaly     97.5652
	}
}

Asteroid	"S54"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            5.31709e-018
	Radius          0.0154306
	InertiaMoment   0.39923

	Obliquity       -1.97867
	EqAscendNode    -49.3804
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.498 0.421 0.392)

	Surface
	{
		SurfStyle       0.870339
		OceanStyle      0.549377
		Randomize      (0.378, -0.491, 0.508)
		colorDistMagn   0.0750943
		colorDistFreq   1.62455e-007
		detailScale     0.421358
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0627109
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.38908
		terraceProb     0.625952
		erosion         0
		montesMagn      0.466215
		montesFreq      2.95859
		montesSpiky     0.894717
		montesFraction  0.715707
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.12396e-007
		hillsFraction   0.640159
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231183
		craterFreq      0.206117
		craterDensity   1.00317
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1049.18
		volcanoTemp     1067.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.147, 0.157, 0.050)
		colorShelf     (0.199, 0.173, 0.180, 0.040)
		colorBeach     (0.229, 0.198, 0.204, 0.030)
		colorDesert    (0.259, 0.223, 0.231, 0.020)
		colorLowland   (0.289, 0.248, 0.255, 0.030)
		colorUpland    (0.318, 0.274, 0.279, 0.050)
		colorRock      (0.348, 0.299, 0.310, 0.020)
		colorSnow      (0.348, 0.299, 0.310, 1.000)
		BumpHeight      0.0138875
		BumpOffset      0.0027775
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.175039
		Period          0.257298
		Eccentricity    0.134507
		Inclination     -1.97867
		AscendingNode   -49.3804
		ArgOfPericenter -52.4328
		MeanAnomaly     170.745
	}
}

Asteroid	"S55"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            7.82438e-015
	Radius          0.165231
	InertiaMoment   0.396191

	Obliquity       1.87355
	EqAscendNode    10.1287
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.620 0.543 0.482)

	Surface
	{
		SurfStyle       0.505413
		OceanStyle      0.997866
		Randomize      (0.158, -0.946, 0.151)
		colorDistMagn   0.90741
		colorDistFreq   1.16551e-005
		detailScale     4.5119
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0650975
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.717368
		terraceProb     0.22068
		erosion         0
		montesMagn      0.595889
		montesFreq      2.13061
		montesSpiky     0.998378
		montesFraction  0.384013
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.04575e-005
		hillsFraction   0.752211
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236538
		craterFreq      0.226085
		craterDensity   0.782459
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   292.868
		volcanoTemp     1462.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.185, 0.135, 0.000)
		colorShelf     (0.248, 0.190, 0.154, 0.000)
		colorBeach     (0.291, 0.223, 0.183, 0.000)
		colorDesert    (0.316, 0.239, 0.178, 0.000)
		colorLowland   (0.347, 0.255, 0.202, 0.000)
		colorUpland    (0.384, 0.310, 0.246, 0.000)
		colorRock      (0.415, 0.337, 0.265, 0.000)
		colorSnow      (0.452, 0.359, 0.279, 1.000)
		BumpHeight      0.148708
		BumpOffset      0.0297415
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.195663
		Period          0.304085
		Eccentricity    0.0433421
		Inclination     1.87355
		AscendingNode   10.1287
		ArgOfPericenter -63.4151
		MeanAnomaly     55.082
	}
}

Asteroid	"S56"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.1514e-011
	Radius          1.99633
	InertiaMoment   0.398365

	Obliquity       0.112734
	EqAscendNode    -37.7417
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.840 0.780 0.721)

	Surface
	{
		SurfStyle       0.89082
		OceanStyle      0.323467
		Randomize      (0.987, -0.109, -0.283)
		colorDistMagn   0.131859
		colorDistFreq   0.00186622
		detailScale     54.513
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00371863
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.416379
		terraceProb     0.539054
		erosion         0
		montesMagn      0.485064
		montesFreq      4.0057
		montesSpiky     0.947771
		montesFraction  0.84415
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00923482
		hillsFraction   0.650066
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275339
		craterFreq      0.216144
		craterDensity   0.921488
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   92.2411
		volcanoTemp     1558.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.273, 0.289, 0.050)
		colorShelf     (0.336, 0.320, 0.332, 0.040)
		colorBeach     (0.387, 0.367, 0.375, 0.030)
		colorDesert    (0.437, 0.413, 0.426, 0.020)
		colorLowland   (0.487, 0.460, 0.469, 0.030)
		colorUpland    (0.538, 0.507, 0.512, 0.050)
		colorRock      (0.588, 0.554, 0.570, 0.020)
		colorSnow      (0.588, 0.554, 0.570, 1.000)
		BumpHeight      1.79669
		BumpOffset      0.359339
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.170627
		Period          0.24763
		Eccentricity    0.102118
		Inclination     0.112734
		AscendingNode   -37.7417
		ArgOfPericenter -79.7876
		MeanAnomaly     106.472
	}
}

Asteroid	"S57"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.69434e-008
	Radius          21.3751
	InertiaMoment   0.399416

	Obliquity       2.94262
	EqAscendNode    -98.9557
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.691 0.689 0.686)

	Surface
	{
		SurfStyle       0.0285659
		OceanStyle      0.944526
		Randomize      (-0.744, 0.070, -0.220)
		colorDistMagn   0.145834
		colorDistFreq   0.265281
		detailScale     583.683
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0666727
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.656492
		terraceProb     0.28234
		erosion         0
		montesMagn      0.548948
		montesFreq      2.81392
		montesSpiky     0.799484
		montesFraction  0.0847678
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.06717
		hillsFraction   0.386149
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221824
		craterFreq      0.217635
		craterDensity   0.772377
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.7462
		volcanoTemp     1273.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.276, 0.275, 0.000)
		colorShelf     (0.294, 0.293, 0.292, 0.000)
		colorBeach     (0.311, 0.310, 0.309, 0.000)
		colorDesert    (0.328, 0.327, 0.326, 0.000)
		colorLowland   (0.346, 0.345, 0.343, 0.000)
		colorUpland    (0.363, 0.362, 0.360, 0.000)
		colorRock      (0.380, 0.379, 0.378, 0.000)
		colorSnow      (0.398, 0.396, 0.395, 1.000)
		BumpHeight      19.2376
		BumpOffset      3.84752
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.151779
		Period          0.207755
		Eccentricity    0.0428905
		Inclination     2.94262
		AscendingNode   -98.9557
		ArgOfPericenter -51.5895
		MeanAnomaly     -87.5156
	}
}

Asteroid	"S58"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            9.9261e-017
	Radius          0.040934
	InertiaMoment   0.396949

	RotationPeriod  7562.61
	Obliquity       0.332278
	EqAscendNode    -80.7215

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.468 0.464 0.462)

	Surface
	{
		SurfStyle       0.504171
		OceanStyle      0.606032
		Randomize      (-0.523, 0.839, 0.805)
		colorDistMagn   0.666529
		colorDistFreq   6.39758e-007
		detailScale     1.11777
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00883632
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.540191
		terraceProb     0.204975
		erosion         0
		montesMagn      0.687684
		montesFreq      2.79911
		montesSpiky     0.842157
		montesFraction  0.56666
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.85245e-006
		hillsFraction   0.763173
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229925
		craterFreq      0.230339
		craterDensity   0.831658
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   644.171
		volcanoTemp     1485.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.158, 0.129, 0.000)
		colorShelf     (0.187, 0.162, 0.148, 0.000)
		colorBeach     (0.220, 0.190, 0.175, 0.000)
		colorDesert    (0.239, 0.204, 0.171, 0.000)
		colorLowland   (0.262, 0.218, 0.194, 0.000)
		colorUpland    (0.290, 0.264, 0.236, 0.000)
		colorRock      (0.313, 0.287, 0.254, 0.000)
		colorSnow      (0.342, 0.306, 0.268, 1.000)
		BumpHeight      0.0368406
		BumpOffset      0.00736813
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.155617
		Period          0.215685
		Eccentricity    0.141129
		Inclination     0.332278
		AscendingNode   -80.7215
		ArgOfPericenter -1.90918
		MeanAnomaly     -37.9181
	}
}

Asteroid	"S59"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.46068e-013
	Radius          0.43832
	InertiaMoment   0.3986

	RotationPeriod  11086.2
	Obliquity       -4.31548
	EqAscendNode    -58.6831

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.753 0.721 0.670)

	Surface
	{
		SurfStyle       0.659772
		OceanStyle      0.311251
		Randomize      (-0.832, 0.449, 0.917)
		colorDistMagn   0.319156
		colorDistFreq   0.000141609
		detailScale     11.9691
		colorConversion true
		snowLevel       2
		tropicLatitude  0.130907
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.671023
		terraceProb     0.282061
		erosion         0
		montesMagn      0.500405
		montesFreq      2.87308
		montesSpiky     0.846824
		montesFraction  0.388486
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000440947
		hillsFraction   0.609812
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23342
		craterFreq      0.174591
		craterDensity   0.943227
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   179.813
		volcanoTemp     1860.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.245, 0.187, 0.000)
		colorShelf     (0.301, 0.252, 0.214, 0.000)
		colorBeach     (0.354, 0.296, 0.254, 0.000)
		colorDesert    (0.384, 0.317, 0.248, 0.000)
		colorLowland   (0.421, 0.339, 0.281, 0.000)
		colorUpland    (0.467, 0.411, 0.341, 0.000)
		colorRock      (0.504, 0.447, 0.368, 0.000)
		colorSnow      (0.549, 0.476, 0.388, 1.000)
		BumpHeight      0.394488
		BumpOffset      0.0788977
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.173058
		Period          0.252942
		Eccentricity    0.168817
		Inclination     -4.31548
		AscendingNode   -58.6831
		ArgOfPericenter -54.0226
		MeanAnomaly     -70.1968
	}
}

Asteroid	"S60"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.14946e-010
	Radius          5.29577
	InertiaMoment   0.399598

	Obliquity       2.89434
	EqAscendNode    54.5228
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.426 0.420 0.418)

	Surface
	{
		SurfStyle       0.225003
		OceanStyle      0.537373
		Randomize      (-0.324, -0.030, 0.697)
		colorDistMagn   0.636475
		colorDistFreq   0.0184858
		detailScale     144.61
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0896809
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562122
		terraceProb     0.349223
		erosion         0
		montesMagn      0.642766
		montesFreq      2.89034
		montesSpiky     0.97843
		montesFraction  0.316815
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0507444
		hillsFraction   0.497418
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236121
		craterFreq      0.190912
		craterDensity   0.96694
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   56.6331
		volcanoTemp     1381.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.168, 0.167, 0.000)
		colorShelf     (0.181, 0.179, 0.178, 0.000)
		colorBeach     (0.192, 0.189, 0.188, 0.000)
		colorDesert    (0.202, 0.200, 0.199, 0.000)
		colorLowland   (0.213, 0.210, 0.209, 0.000)
		colorUpland    (0.224, 0.221, 0.220, 0.000)
		colorRock      (0.234, 0.231, 0.230, 0.000)
		colorSnow      (0.245, 0.242, 0.241, 1.000)
		BumpHeight      4.76619
		BumpOffset      0.953238
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.146517
		Period          0.197046
		Eccentricity    0.0878305
		Inclination     2.89434
		AscendingNode   54.5228
		ArgOfPericenter -177.311
		MeanAnomaly     68.3843
	}
}

Asteroid	"S61"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.16305e-007
	Radius          56.6943
	InertiaMoment   0.397422

	Obliquity       -2.40203
	EqAscendNode    -86.2334
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.524 0.519 0.515)

	Surface
	{
		SurfStyle       0.835586
		OceanStyle      0.111857
		Randomize      (0.144, 0.543, -0.659)
		colorDistMagn   0.974828
		colorDistFreq   1.37051
		detailScale     1548.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0611587
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.556056
		terraceProb     0.35358
		erosion         0
		montesMagn      0.582185
		montesFreq      2.57841
		montesSpiky     0.975612
		montesFraction  0.50517
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.15548
		hillsFraction   0.915516
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265795
		craterFreq      0.247557
		craterDensity   0.933027
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   15.8049
		volcanoTemp     1666.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.176, 0.144, 0.000)
		colorShelf     (0.209, 0.181, 0.165, 0.000)
		colorBeach     (0.246, 0.213, 0.196, 0.000)
		colorDesert    (0.267, 0.228, 0.191, 0.000)
		colorLowland   (0.293, 0.244, 0.216, 0.000)
		colorUpland    (0.325, 0.296, 0.263, 0.000)
		colorRock      (0.351, 0.321, 0.283, 0.000)
		colorSnow      (0.382, 0.342, 0.299, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.160963
		Period          0.226894
		Eccentricity    0.0430132
		Inclination     -2.40203
		AscendingNode   -86.2334
		ArgOfPericenter 142.667
		MeanAnomaly     101.86
	}
}

Asteroid	"S62"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.85303e-015
	Radius          0.108589
	InertiaMoment   0.398817

	Obliquity       -1.92856
	EqAscendNode    -47.5712
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.601 0.596 0.590)

	Surface
	{
		SurfStyle       0.558116
		OceanStyle      0.919198
		Randomize      (-0.292, -0.012, -0.557)
		colorDistMagn   0.806255
		colorDistFreq   5.40885e-006
		detailScale     2.9652
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0615601
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.528852
		terraceProb     0.328193
		erosion         0
		montesMagn      0.512492
		montesFreq      3.70118
		montesSpiky     0.903436
		montesFraction  0.578282
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.80844e-005
		hillsFraction   0.747284
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256059
		craterFreq      0.215952
		craterDensity   0.906073
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   395.503
		volcanoTemp     1670.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.202, 0.165, 0.000)
		colorShelf     (0.240, 0.208, 0.189, 0.000)
		colorBeach     (0.282, 0.244, 0.224, 0.000)
		colorDesert    (0.306, 0.262, 0.218, 0.000)
		colorLowland   (0.336, 0.280, 0.248, 0.000)
		colorUpland    (0.372, 0.339, 0.301, 0.000)
		colorRock      (0.402, 0.369, 0.325, 0.000)
		colorSnow      (0.438, 0.393, 0.342, 1.000)
		BumpHeight      0.0977299
		BumpOffset      0.019546
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.192541
		Period          0.296837
		Eccentricity    0.0560241
		Inclination     -1.92856
		AscendingNode   -47.5712
		ArgOfPericenter 89.5135
		MeanAnomaly     -166.738
	}
}

Asteroid	"S63"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.72683e-012
	Radius          1.16277
	InertiaMoment   0.399776

	Obliquity       -2.43707
	EqAscendNode    -100.087
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.809 0.770 0.738)

	Surface
	{
		SurfStyle       0.959642
		OceanStyle      0.200138
		Randomize      (-0.496, 0.897, -0.408)
		colorDistMagn   0.733027
		colorDistFreq   0.00105984
		detailScale     31.7513
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0545952
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35566
		terraceProb     0.516692
		erosion         0
		montesMagn      0.61186
		montesFreq      2.12095
		montesSpiky     0.979334
		montesFraction  0.381616
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00236491
		hillsFraction   0.761603
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231983
		craterFreq      0.158824
		craterDensity   0.963908
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   110.4
		volcanoTemp     1646.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.269, 0.295, 0.050)
		colorShelf     (0.324, 0.316, 0.339, 0.040)
		colorBeach     (0.372, 0.362, 0.384, 0.030)
		colorDesert    (0.421, 0.408, 0.435, 0.020)
		colorLowland   (0.469, 0.454, 0.480, 0.030)
		colorUpland    (0.518, 0.500, 0.524, 0.050)
		colorRock      (0.566, 0.546, 0.583, 0.020)
		colorSnow      (0.566, 0.546, 0.583, 1.000)
		BumpHeight      1.04649
		BumpOffset      0.209298
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.170675
		Period          0.247735
		Eccentricity    0.0356695
		Inclination     -2.43707
		AscendingNode   -100.087
		ArgOfPericenter -10.6055
		MeanAnomaly     38.2664
	}
}

Asteroid	"S64"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.01267e-009
	Radius          14.0481
	InertiaMoment   0.397783

	RotationPeriod  9501.7
	Obliquity       -5.14644
	EqAscendNode    43.979

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.462 0.454 0.450)

	Surface
	{
		SurfStyle       0.0556624
		OceanStyle      0.6794
		Randomize      (-0.036, -0.956, 0.204)
		colorDistMagn   0.347612
		colorDistFreq   0.139973
		detailScale     383.608
		colorConversion true
		snowLevel       2
		tropicLatitude  0.165776
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.756185
		terraceProb     0.339928
		erosion         0
		montesMagn      0.462187
		montesFreq      3.06508
		montesSpiky     0.914348
		montesFraction  0.480478
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.53891
		hillsFraction   0.810537
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259803
		craterFreq      0.179198
		craterDensity   0.756885
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.7702
		volcanoTemp     1693.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.182, 0.180, 0.000)
		colorShelf     (0.196, 0.193, 0.191, 0.000)
		colorBeach     (0.208, 0.204, 0.202, 0.000)
		colorDesert    (0.219, 0.216, 0.214, 0.000)
		colorLowland   (0.231, 0.227, 0.225, 0.000)
		colorUpland    (0.242, 0.238, 0.236, 0.000)
		colorRock      (0.254, 0.250, 0.247, 0.000)
		colorSnow      (0.265, 0.261, 0.258, 1.000)
		BumpHeight      12.6433
		BumpOffset      2.52866
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.156148
		Period          0.21679
		Eccentricity    0.0847267
		Inclination     -5.14644
		AscendingNode   43.979
		ArgOfPericenter -69.0705
		MeanAnomaly     -140.23
	}
}

Asteroid	"S65"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.35077e-017
	Radius          0.0238421
	InertiaMoment   0.399021

	Obliquity       1.00232
	EqAscendNode    -124.988
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.820 0.788 0.727)

	Surface
	{
		SurfStyle       0.365294
		OceanStyle      0.884781
		Randomize      (-0.316, 0.912, 0.991)
		colorDistMagn   0.359156
		colorDistFreq   3.23982e-007
		detailScale     0.651047
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0161571
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.718366
		terraceProb     0.111825
		erosion         0
		montesMagn      0.646693
		montesFreq      2.59866
		montesSpiky     0.932376
		montesFraction  0.771356
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.69014e-006
		hillsFraction   0.847042
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232892
		craterFreq      0.278479
		craterDensity   1.08992
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   770.983
		volcanoTemp     1150.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.328, 0.315, 0.291, 0.000)
		colorShelf     (0.348, 0.335, 0.309, 0.000)
		colorBeach     (0.369, 0.355, 0.327, 0.000)
		colorDesert    (0.389, 0.374, 0.346, 0.000)
		colorLowland   (0.410, 0.394, 0.364, 0.000)
		colorUpland    (0.430, 0.414, 0.382, 0.000)
		colorRock      (0.451, 0.433, 0.400, 0.000)
		colorSnow      (0.471, 0.453, 0.418, 1.000)
		BumpHeight      0.0214579
		BumpOffset      0.00429157
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.174858
		Period          0.256898
		Eccentricity    0.0494558
		Inclination     1.00232
		AscendingNode   -124.988
		ArgOfPericenter -112.166
		MeanAnomaly     71.8807
	}
}

Asteroid	"S66"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.45929e-014
	Radius          0.288063
	InertiaMoment   0.399953

	RotationPeriod  3998.11
	Obliquity       -1.72384
	EqAscendNode    -0.992017

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.584 0.580 0.571)

	Surface
	{
		SurfStyle       0.734367
		OceanStyle      0.947321
		Randomize      (0.539, -0.268, 0.031)
		colorDistMagn   0.922737
		colorDistFreq   4.31293e-005
		detailScale     7.86603
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0601345
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.603518
		terraceProb     0.351254
		erosion         0
		montesMagn      0.450852
		montesFreq      3.39401
		montesSpiky     0.918707
		montesFraction  0.420987
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00018546
		hillsFraction   0.636472
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2362
		craterFreq      0.194983
		craterDensity   0.868504
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   242.829
		volcanoTemp     1540.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.197, 0.160, 0.000)
		colorShelf     (0.234, 0.203, 0.183, 0.000)
		colorBeach     (0.275, 0.238, 0.217, 0.000)
		colorDesert    (0.298, 0.255, 0.211, 0.000)
		colorLowland   (0.327, 0.272, 0.240, 0.000)
		colorUpland    (0.362, 0.330, 0.291, 0.000)
		colorRock      (0.391, 0.359, 0.314, 0.000)
		colorSnow      (0.426, 0.383, 0.331, 1.000)
		BumpHeight      0.259256
		BumpOffset      0.0518513
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.16151
		Period          0.228052
		Eccentricity    0.136214
		Inclination     -1.72384
		AscendingNode   -0.992017
		ArgOfPericenter -73.0006
		MeanAnomaly     142.762
	}
}

Asteroid	"S67"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            5.09051e-011
	Radius          3.08454
	InertiaMoment   0.398083

	Obliquity       0.542688
	EqAscendNode    -117.964
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.667 0.665)

	Surface
	{
		SurfStyle       0.42439
		OceanStyle      0.279953
		Randomize      (-0.594, -0.013, -0.573)
		colorDistMagn   0.871168
		colorDistFreq   0.00495586
		detailScale     84.2286
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0097594
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.506578
		terraceProb     0.136611
		erosion         0
		montesMagn      0.514105
		montesFreq      3.15623
		montesSpiky     0.807462
		montesFraction  0.268938
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.022311
		hillsFraction   0.575304
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240662
		craterFreq      0.262759
		craterDensity   0.821911
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   67.7823
		volcanoTemp     1521.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.267, 0.266, 0.000)
		colorShelf     (0.284, 0.283, 0.283, 0.000)
		colorBeach     (0.301, 0.300, 0.299, 0.000)
		colorDesert    (0.318, 0.317, 0.316, 0.000)
		colorLowland   (0.335, 0.333, 0.333, 0.000)
		colorUpland    (0.351, 0.350, 0.349, 0.000)
		colorRock      (0.368, 0.367, 0.366, 0.000)
		colorSnow      (0.385, 0.383, 0.382, 1.000)
		BumpHeight      2.77609
		BumpOffset      0.555218
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.194429
		Period          0.301213
		Eccentricity    0.0838391
		Inclination     0.542688
		AscendingNode   -117.964
		ArgOfPericenter -101.229
		MeanAnomaly     167.582
	}
}

Asteroid	"S68"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            7.49097e-008
	Radius          37.2633
	InertiaMoment   0.399215

	Obliquity       1.40851
	EqAscendNode    -170.214
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.592 0.586 0.580)

	Surface
	{
		SurfStyle       0.769928
		OceanStyle      0.349497
		Randomize      (-0.168, 0.299, 0.298)
		colorDistMagn   0.65898
		colorDistFreq   1.04675
		detailScale     1017.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00420034
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.555829
		terraceProb     0.22392
		erosion         0
		montesMagn      0.474316
		montesFreq      2.98683
		montesSpiky     0.930888
		montesFraction  0.547319
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.97321
		hillsFraction   0.625409
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248376
		craterFreq      0.267851
		craterDensity   0.882688
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.3461
		volcanoTemp     1757.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.199, 0.162, 0.000)
		colorShelf     (0.237, 0.205, 0.186, 0.000)
		colorBeach     (0.278, 0.240, 0.220, 0.000)
		colorDesert    (0.302, 0.258, 0.215, 0.000)
		colorLowland   (0.331, 0.276, 0.244, 0.000)
		colorUpland    (0.367, 0.334, 0.296, 0.000)
		colorRock      (0.396, 0.364, 0.319, 0.000)
		colorSnow      (0.432, 0.387, 0.336, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.158847
		Period          0.222435
		Eccentricity    0.0813185
		Inclination     1.40851
		AscendingNode   -170.214
		ArgOfPericenter -143.272
		MeanAnomaly     -139.815
	}
}

Asteroid	"S69"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.38849e-016
	Radius          0.0632479
	InertiaMoment   0.396104

	Obliquity       -1.54346
	EqAscendNode    -23.6934
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.610 0.544 0.520)

	Surface
	{
		SurfStyle       0.931698
		OceanStyle      0.012775
		Randomize      (-0.089, 0.921, -0.562)
		colorDistMagn   0.593649
		colorDistFreq   2.6634e-006
		detailScale     1.72709
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0527047
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.542767
		terraceProb     0.214293
		erosion         0
		montesMagn      0.350558
		montesFreq      2.88938
		montesSpiky     0.998886
		montesFraction  0.661221
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.47491e-006
		hillsFraction   0.539926
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240741
		craterFreq      0.197808
		craterDensity   0.787194
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   473.363
		volcanoTemp     1381.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.191, 0.208, 0.050)
		colorShelf     (0.244, 0.223, 0.239, 0.040)
		colorBeach     (0.280, 0.256, 0.270, 0.030)
		colorDesert    (0.317, 0.288, 0.307, 0.020)
		colorLowland   (0.354, 0.321, 0.338, 0.030)
		colorUpland    (0.390, 0.354, 0.369, 0.050)
		colorRock      (0.427, 0.386, 0.411, 0.020)
		colorSnow      (0.427, 0.386, 0.411, 1.000)
		BumpHeight      0.0569231
		BumpOffset      0.0113846
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.174795
		Period          0.256759
		Eccentricity    0.0959832
		Inclination     -1.54346
		AscendingNode   -23.6934
		ArgOfPericenter 103.227
		MeanAnomaly     -125.156
	}
}

Asteroid	"S70"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            6.45789e-013
	Radius          0.764166
	InertiaMoment   0.398346

	RotationPeriod  11662.1
	Obliquity       1.25578
	EqAscendNode    -21.2521

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.628 0.624 0.621)

	Surface
	{
		SurfStyle       0.968714
		OceanStyle      0.214953
		Randomize      (0.329, -0.449, -0.676)
		colorDistMagn   0.209796
		colorDistFreq   0.000354049
		detailScale     20.8668
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0430696
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.301768
		terraceProb     0.424356
		erosion         0
		montesMagn      0.571288
		montesFreq      3.11069
		montesSpiky     0.974862
		montesFraction  0.397734
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00107893
		hillsFraction   0.698626
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262677
		craterFreq      0.173726
		craterDensity   0.720099
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   149.09
		volcanoTemp     1797.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.218, 0.248, 0.050)
		colorShelf     (0.251, 0.256, 0.286, 0.040)
		colorBeach     (0.289, 0.293, 0.323, 0.030)
		colorDesert    (0.326, 0.331, 0.366, 0.020)
		colorLowland   (0.364, 0.368, 0.403, 0.030)
		colorUpland    (0.402, 0.406, 0.441, 0.050)
		colorRock      (0.439, 0.443, 0.490, 0.020)
		colorSnow      (0.439, 0.443, 0.490, 1.000)
		BumpHeight      0.68775
		BumpOffset      0.13755
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.179001
		Period          0.266081
		Eccentricity    0.12844
		Inclination     1.25578
		AscendingNode   -21.2521
		ArgOfPericenter 74.3619
		MeanAnomaly     -116.18
	}
}

Asteroid	"S71"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            9.50313e-010
	Radius          8.18249
	InertiaMoment   0.399402

	RotationPeriod  12686.3
	Obliquity       -3.80359
	EqAscendNode    55.3481

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.457 0.452 0.447)

	Surface
	{
		SurfStyle       0.504846
		OceanStyle      0.343476
		Randomize      (0.928, -0.306, -0.409)
		colorDistMagn   0.683368
		colorDistFreq   0.0595971
		detailScale     223.437
		colorConversion true
		snowLevel       2
		tropicLatitude  0.117292
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.50879
		terraceProb     0.147716
		erosion         0
		montesMagn      0.591881
		montesFreq      3.86963
		montesSpiky     0.847303
		montesFraction  0.752178
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.127093
		hillsFraction   0.809706
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22788
		craterFreq      0.227592
		craterDensity   1.07679
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.6158
		volcanoTemp     955.726
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.154, 0.125, 0.000)
		colorShelf     (0.183, 0.158, 0.143, 0.000)
		colorBeach     (0.215, 0.185, 0.170, 0.000)
		colorDesert    (0.233, 0.199, 0.166, 0.000)
		colorLowland   (0.256, 0.213, 0.188, 0.000)
		colorUpland    (0.284, 0.258, 0.228, 0.000)
		colorRock      (0.306, 0.280, 0.246, 0.000)
		colorSnow      (0.334, 0.299, 0.260, 1.000)
		BumpHeight      7.36424
		BumpOffset      1.47285
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.167664
		Period          0.241209
		Eccentricity    0.118896
		Inclination     -3.80359
		AscendingNode   55.3481
		ArgOfPericenter 75.7353
		MeanAnomaly     33.8579
	}
}

Asteroid	"S72"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            5.56727e-018
	Radius          0.0156689
	InertiaMoment   0.396904

	RotationPeriod  4069.56
	Obliquity       3.30879
	EqAscendNode    68.1121

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.406 0.400 0.397)

	Surface
	{
		SurfStyle       0.857701
		OceanStyle      0.309822
		Randomize      (0.455, 0.703, 0.016)
		colorDistMagn   0.991701
		colorDistFreq   1.87977e-007
		detailScale     0.427866
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0955271
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.460139
		terraceProb     0.459561
		erosion         0
		montesMagn      0.4108
		montesFreq      2.68436
		montesSpiky     0.955988
		montesFraction  0.564105
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.27625e-007
		hillsFraction   0.806998
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242403
		craterFreq      0.170907
		craterDensity   0.985033
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1041.18
		volcanoTemp     1667.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.138, 0.140, 0.159, 0.050)
		colorShelf     (0.163, 0.164, 0.183, 0.040)
		colorBeach     (0.187, 0.188, 0.207, 0.030)
		colorDesert    (0.211, 0.212, 0.234, 0.020)
		colorLowland   (0.236, 0.236, 0.258, 0.030)
		colorUpland    (0.260, 0.260, 0.282, 0.050)
		colorRock      (0.285, 0.284, 0.314, 0.020)
		colorSnow      (0.285, 0.284, 0.314, 1.000)
		BumpHeight      0.014102
		BumpOffset      0.0028204
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.163429
		Period          0.232127
		Eccentricity    0.0687846
		Inclination     3.30879
		AscendingNode   68.1121
		ArgOfPericenter -2.6957
		MeanAnomaly     71.339
	}
}

Asteroid	"S73"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            8.19253e-015
	Radius          0.167782
	InertiaMoment   0.398582

	RotationPeriod  6042.97
	Obliquity       1.20188
	EqAscendNode    -43.9321

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.477 0.473 0.465)

	Surface
	{
		SurfStyle       0.451564
		OceanStyle      0.508881
		Randomize      (0.173, -0.962, 0.671)
		colorDistMagn   0.789622
		colorDistFreq   2.33321e-005
		detailScale     4.58158
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0388977
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.55524
		terraceProb     0.312405
		erosion         0
		montesMagn      0.568566
		montesFreq      3.72725
		montesSpiky     0.976092
		montesFraction  0.43254
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.14184e-005
		hillsFraction   0.448825
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228507
		craterFreq      0.179981
		craterDensity   0.883999
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   290.632
		volcanoTemp     1411.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.189, 0.186, 0.000)
		colorShelf     (0.203, 0.201, 0.197, 0.000)
		colorBeach     (0.215, 0.213, 0.209, 0.000)
		colorDesert    (0.227, 0.225, 0.221, 0.000)
		colorLowland   (0.239, 0.236, 0.232, 0.000)
		colorUpland    (0.251, 0.248, 0.244, 0.000)
		colorRock      (0.263, 0.260, 0.256, 0.000)
		colorSnow      (0.274, 0.272, 0.267, 1.000)
		BumpHeight      0.151004
		BumpOffset      0.0302008
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.162332
		Period          0.229794
		Eccentricity    0.176693
		Inclination     1.20188
		AscendingNode   -43.9321
		ArgOfPericenter 114.367
		MeanAnomaly     -91.5433
	}
}

Asteroid	"S74"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.20558e-011
	Radius          2.02716
	InertiaMoment   0.399584

	Obliquity       -3.07553
	EqAscendNode    32.4649
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.655 0.651 0.645)

	Surface
	{
		SurfStyle       0.144724
		OceanStyle      0.0657416
		Randomize      (-0.210, -0.234, 0.360)
		colorDistMagn   0.965543
		colorDistFreq   0.00230733
		detailScale     55.355
		colorConversion true
		snowLevel       2
		tropicLatitude  0.102891
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530871
		terraceProb     0.306149
		erosion         0
		montesMagn      0.49249
		montesFreq      3.00697
		montesSpiky     0.925484
		montesFraction  0.493063
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00787662
		hillsFraction   0.673423
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243967
		craterFreq      0.269856
		craterDensity   0.83379
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   91.537
		volcanoTemp     1638.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.260, 0.258, 0.000)
		colorShelf     (0.278, 0.277, 0.274, 0.000)
		colorBeach     (0.295, 0.293, 0.290, 0.000)
		colorDesert    (0.311, 0.309, 0.306, 0.000)
		colorLowland   (0.328, 0.325, 0.323, 0.000)
		colorUpland    (0.344, 0.342, 0.339, 0.000)
		colorRock      (0.360, 0.358, 0.355, 0.000)
		colorSnow      (0.377, 0.374, 0.371, 1.000)
		BumpHeight      1.82444
		BumpOffset      0.364889
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.136128
		Period          0.176462
		Eccentricity    0.0182089
		Inclination     -3.07553
		AscendingNode   32.4649
		ArgOfPericenter 6.29668
		MeanAnomaly     19.505
	}
}

Asteroid	"S75"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.77407e-008
	Radius          21.7052
	InertiaMoment   0.39739

	Obliquity       -2.37462
	EqAscendNode    -163.91
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.664 0.662 0.660)

	Surface
	{
		SurfStyle       0.931992
		OceanStyle      0.487615
		Randomize      (0.238, -0.205, 0.305)
		colorDistMagn   0.56035
		colorDistFreq   0.359617
		detailScale     592.697
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0115958
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.726669
		terraceProb     0.210852
		erosion         0
		montesMagn      0.428745
		montesFreq      2.64745
		montesSpiky     0.968578
		montesFraction  0.691447
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.888464
		hillsFraction   0.609754
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224809
		craterFreq      0.152516
		craterDensity   0.919892
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.5496
		volcanoTemp     1358.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.232, 0.264, 0.050)
		colorShelf     (0.266, 0.271, 0.303, 0.040)
		colorBeach     (0.305, 0.311, 0.343, 0.030)
		colorDesert    (0.345, 0.351, 0.389, 0.020)
		colorLowland   (0.385, 0.391, 0.429, 0.030)
		colorUpland    (0.425, 0.430, 0.468, 0.050)
		colorRock      (0.465, 0.470, 0.521, 0.020)
		colorSnow      (0.465, 0.470, 0.521, 1.000)
		BumpHeight      19.5347
		BumpOffset      3.90694
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.176128
		Period          0.259702
		Eccentricity    0.0955937
		Inclination     -2.37462
		AscendingNode   -163.91
		ArgOfPericenter 73.2043
		MeanAnomaly     162.224
	}
}

Asteroid	"S76"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.03931e-016
	Radius          0.0415662
	InertiaMoment   0.398801

	Obliquity       2.88816
	EqAscendNode    -90.3688
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.777 0.740 0.711)

	Surface
	{
		SurfStyle       0.0950667
		OceanStyle      0.0878216
		Randomize      (-0.975, 0.474, -0.618)
		colorDistMagn   0.578163
		colorDistFreq   9.55413e-007
		detailScale     1.13503
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0709829
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.42626
		terraceProb     0.448465
		erosion         0
		montesMagn      0.418791
		montesFreq      4.04064
		montesSpiky     0.880454
		montesFraction  0.469891
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.66846e-006
		hillsFraction   0.8356
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220292
		craterFreq      0.201517
		craterDensity   1.02725
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   639.253
		volcanoTemp     1486.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.296, 0.284, 0.000)
		colorShelf     (0.330, 0.314, 0.302, 0.000)
		colorBeach     (0.350, 0.333, 0.320, 0.000)
		colorDesert    (0.369, 0.351, 0.338, 0.000)
		colorLowland   (0.389, 0.370, 0.356, 0.000)
		colorUpland    (0.408, 0.388, 0.373, 0.000)
		colorRock      (0.428, 0.407, 0.391, 0.000)
		colorSnow      (0.447, 0.425, 0.409, 1.000)
		BumpHeight      0.0374096
		BumpOffset      0.00748191
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.163968
		Period          0.233278
		Eccentricity    0.143365
		Inclination     2.88816
		AscendingNode   -90.3688
		ArgOfPericenter -72.6773
		MeanAnomaly     -170.151
	}
}

Asteroid	"S77"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.52941e-013
	Radius          0.445089
	InertiaMoment   0.399762

	RotationPeriod  3735.58
	Obliquity       -0.568472
	EqAscendNode    60.4922

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.533 0.438 0.352)

	Surface
	{
		SurfStyle       0.346331
		OceanStyle      0.218377
		Randomize      (-0.446, 0.909, 0.068)
		colorDistMagn   0.0433335
		colorDistFreq   8.93211e-006
		detailScale     12.1539
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0171415
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.683117
		terraceProb     0.268606
		erosion         0
		montesMagn      0.474328
		montesFreq      2.41612
		montesSpiky     0.881758
		montesFraction  0.686418
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000396882
		hillsFraction   0.835241
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25718
		craterFreq      0.254478
		craterDensity   0.987352
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   178.44
		volcanoTemp     1288.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.175, 0.141, 0.000)
		colorShelf     (0.226, 0.186, 0.150, 0.000)
		colorBeach     (0.240, 0.197, 0.158, 0.000)
		colorDesert    (0.253, 0.208, 0.167, 0.000)
		colorLowland   (0.266, 0.219, 0.176, 0.000)
		colorUpland    (0.280, 0.230, 0.185, 0.000)
		colorRock      (0.293, 0.241, 0.194, 0.000)
		colorSnow      (0.306, 0.252, 0.202, 1.000)
		BumpHeight      0.400581
		BumpOffset      0.0801161
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.15436
		Period          0.213077
		Eccentricity    0.134176
		Inclination     -0.568472
		AscendingNode   60.4922
		ArgOfPericenter 152.573
		MeanAnomaly     -0.442248
	}
}

Asteroid	"S78"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.2506e-010
	Radius          5.37756
	InertiaMoment   0.397758

	RotationPeriod  1286.19
	Obliquity       0.145607
	EqAscendNode    42.8586

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.484 0.478 0.474)

	Surface
	{
		SurfStyle       0.859665
		OceanStyle      0.588271
		Randomize      (-0.992, 0.999, -0.015)
		colorDistMagn   0.918192
		colorDistFreq   0.00867233
		detailScale     146.843
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00473405
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.421994
		terraceProb     0.278416
		erosion         0
		montesMagn      0.564993
		montesFreq      3.03451
		montesSpiky     0.965874
		montesFraction  0.664088
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0773709
		hillsFraction   0.642974
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216184
		craterFreq      0.267154
		craterDensity   0.830697
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   56.2007
		volcanoTemp     1312.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.167, 0.189, 0.050)
		colorShelf     (0.194, 0.196, 0.218, 0.040)
		colorBeach     (0.223, 0.225, 0.246, 0.030)
		colorDesert    (0.252, 0.254, 0.280, 0.020)
		colorLowland   (0.281, 0.282, 0.308, 0.030)
		colorUpland    (0.310, 0.311, 0.336, 0.050)
		colorRock      (0.339, 0.340, 0.374, 0.020)
		colorSnow      (0.339, 0.340, 0.374, 1.000)
		BumpHeight      4.8398
		BumpOffset      0.967961
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.15773
		Period          0.220092
		Eccentricity    0.140288
		Inclination     0.145607
		AscendingNode   42.8586
		ArgOfPericenter 50.6553
		MeanAnomaly     -124.509
	}
}

Asteroid	"S79"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.31188e-007
	Radius          57.5696
	InertiaMoment   0.399005

	Obliquity       -0.773122
	EqAscendNode    51.7873
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.819 0.719 0.665)

	Surface
	{
		SurfStyle       0.269764
		OceanStyle      0.893495
		Randomize      (0.081, 0.246, -0.605)
		colorDistMagn   0.965847
		colorDistFreq   1.51042
		detailScale     1572.03
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0242752
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.669071
		terraceProb     0.327443
		erosion         0
		montesMagn      0.545013
		montesFreq      3.11387
		montesSpiky     0.96643
		montesFraction  0.477024
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.40292
		hillsFraction   0.559809
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224661
		craterFreq      0.250112
		craterDensity   0.851163
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   15.6842
		volcanoTemp     1702.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.328, 0.287, 0.266, 0.000)
		colorShelf     (0.348, 0.305, 0.283, 0.000)
		colorBeach     (0.368, 0.323, 0.299, 0.000)
		colorDesert    (0.389, 0.341, 0.316, 0.000)
		colorLowland   (0.409, 0.359, 0.333, 0.000)
		colorUpland    (0.430, 0.377, 0.349, 0.000)
		colorRock      (0.450, 0.395, 0.366, 0.000)
		colorSnow      (0.471, 0.413, 0.383, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.148038
		Period          0.200121
		Eccentricity    0.0625575
		Inclination     -0.773122
		AscendingNode   51.7873
		ArgOfPericenter -107.193
		MeanAnomaly     -56.5352
	}
}

Asteroid	"S80"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.94021e-015
	Radius          0.110266
	InertiaMoment   0.399939

	RotationPeriod  2895.03
	Obliquity       -1.45232
	EqAscendNode    0.967227

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.614 0.611 0.608)

	Surface
	{
		SurfStyle       0.287272
		OceanStyle      0.353742
		Randomize      (-0.897, -0.726, -0.101)
		colorDistMagn   0.639049
		colorDistFreq   9.01478e-006
		detailScale     3.011
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0506722
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413994
		terraceProb     0.386293
		erosion         0
		montesMagn      0.486193
		montesFreq      3.34679
		montesSpiky     0.832606
		montesFraction  0.772047
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.9723e-005
		hillsFraction   0.621212
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24253
		craterFreq      0.203823
		craterDensity   0.97452
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   392.485
		volcanoTemp     1625.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.244, 0.243, 0.000)
		colorShelf     (0.261, 0.259, 0.259, 0.000)
		colorBeach     (0.276, 0.275, 0.274, 0.000)
		colorDesert    (0.292, 0.290, 0.289, 0.000)
		colorLowland   (0.307, 0.305, 0.304, 0.000)
		colorUpland    (0.322, 0.321, 0.319, 0.000)
		colorRock      (0.338, 0.336, 0.335, 0.000)
		colorSnow      (0.353, 0.351, 0.350, 1.000)
		BumpHeight      0.0992394
		BumpOffset      0.0198479
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.170658
		Period          0.247698
		Eccentricity    0.114284
		Inclination     -1.45232
		AscendingNode   0.967227
		ArgOfPericenter -131.863
		MeanAnomaly     13.62
	}
}

Asteroid	"S81"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.85513e-012
	Radius          1.18072
	InertiaMoment   0.398062

	Obliquity       -0.0769176
	EqAscendNode    -87.7079
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.578 0.448 0.346)

	Surface
	{
		SurfStyle       0.999691
		OceanStyle      0.111071
		Randomize      (-0.663, -0.656, -0.568)
		colorDistMagn   0.401391
		colorDistFreq   0.000653046
		detailScale     32.2416
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00192236
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.277148
		terraceProb     0.222442
		erosion         0
		montesMagn      0.552923
		montesFreq      2.22223
		montesSpiky     0.873788
		montesFraction  0.383757
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00325806
		hillsFraction   0.829879
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254674
		craterFreq      0.224224
		craterDensity   0.817924
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   109.557
		volcanoTemp     1701.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.157, 0.138, 0.050)
		colorShelf     (0.231, 0.184, 0.159, 0.040)
		colorBeach     (0.266, 0.211, 0.180, 0.030)
		colorDesert    (0.301, 0.238, 0.204, 0.020)
		colorLowland   (0.335, 0.264, 0.225, 0.030)
		colorUpland    (0.370, 0.291, 0.245, 0.050)
		colorRock      (0.405, 0.318, 0.273, 0.020)
		colorSnow      (0.405, 0.318, 0.273, 1.000)
		BumpHeight      1.06265
		BumpOffset      0.21253
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.154249
		Period          0.212847
		Eccentricity    0.00983412
		Inclination     -0.0769176
		AscendingNode   -87.7079
		ArgOfPericenter -58.6936
		MeanAnomaly     139.122
	}
}

Asteroid	"S82"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.20149e-009
	Radius          14.2651
	InertiaMoment   0.3992

	RotationPeriod  3887.94
	Obliquity       -3.72442
	EqAscendNode    85.1929

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.678 0.534 0.474)

	Surface
	{
		SurfStyle       0.0703205
		OceanStyle      0.480384
		Randomize      (-0.940, 0.393, -0.946)
		colorDistMagn   0.752302
		colorDistFreq   0.120466
		detailScale     389.532
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0955264
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.400991
		terraceProb     0.2047
		erosion         0
		montesMagn      0.525313
		montesFreq      3.06277
		montesSpiky     0.93944
		montesFraction  0.528379
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.50957
		hillsFraction   0.404258
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212274
		craterFreq      0.178522
		craterDensity   0.888178
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.5047
		volcanoTemp     1925.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.213, 0.190, 0.000)
		colorShelf     (0.288, 0.227, 0.201, 0.000)
		colorBeach     (0.305, 0.240, 0.213, 0.000)
		colorDesert    (0.322, 0.253, 0.225, 0.000)
		colorLowland   (0.339, 0.267, 0.237, 0.000)
		colorUpland    (0.356, 0.280, 0.249, 0.000)
		colorRock      (0.373, 0.293, 0.261, 0.000)
		colorSnow      (0.390, 0.307, 0.273, 1.000)
		BumpHeight      12.8386
		BumpOffset      2.56771
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.158529
		Period          0.221767
		Eccentricity    0.156946
		Inclination     -3.72442
		AscendingNode   85.1929
		ArgOfPericenter 37.6319
		MeanAnomaly     -5.10246
	}
}

Asteroid	"S83"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.46138e-017
	Radius          0.0242103
	InertiaMoment   0.396008

	Obliquity       1.67637
	EqAscendNode    -163.511
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.436 0.429 0.427)

	Surface
	{
		SurfStyle       0.43757
		OceanStyle      0.712994
		Randomize      (0.785, -0.210, 0.915)
		colorDistMagn   0.620581
		colorDistFreq   2.52148e-007
		detailScale     0.661103
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00838643
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.712819
		terraceProb     0.1068
		erosion         0
		montesMagn      0.393214
		montesFreq      3.71737
		montesSpiky     0.940137
		montesFraction  0.640374
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.20893e-006
		hillsFraction   0.472269
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23865
		craterFreq      0.212087
		craterDensity   0.938296
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   765.098
		volcanoTemp     1790.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.172, 0.171, 0.000)
		colorShelf     (0.185, 0.182, 0.181, 0.000)
		colorBeach     (0.196, 0.193, 0.192, 0.000)
		colorDesert    (0.207, 0.204, 0.203, 0.000)
		colorLowland   (0.218, 0.215, 0.213, 0.000)
		colorUpland    (0.229, 0.225, 0.224, 0.000)
		colorRock      (0.240, 0.236, 0.235, 0.000)
		colorSnow      (0.250, 0.247, 0.245, 1.000)
		BumpHeight      0.0217893
		BumpOffset      0.00435786
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.161756
		Period          0.228572
		Eccentricity    0.173762
		Inclination     1.67637
		AscendingNode   -163.511
		ArgOfPericenter 32.4973
		MeanAnomaly     39.119
	}
}

Asteroid	"S84"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.62205e-014
	Radius          0.292511
	InertiaMoment   0.398326

	Obliquity       1.15682
	EqAscendNode    -145.544
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.615 0.610 0.603)

	Surface
	{
		SurfStyle       0.524404
		OceanStyle      0.463164
		Randomize      (0.766, 0.793, -0.972)
		colorDistMagn   0.579139
		colorDistFreq   2.6615e-005
		detailScale     7.98751
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0119602
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610255
		terraceProb     0.222551
		erosion         0
		montesMagn      0.498661
		montesFreq      2.95297
		montesSpiky     0.971352
		montesFraction  0.84468
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000142298
		hillsFraction   0.435617
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210809
		craterFreq      0.158378
		craterDensity   0.870142
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   240.975
		volcanoTemp     1676.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.207, 0.169, 0.000)
		colorShelf     (0.246, 0.214, 0.193, 0.000)
		colorBeach     (0.289, 0.250, 0.229, 0.000)
		colorDesert    (0.313, 0.268, 0.223, 0.000)
		colorLowland   (0.344, 0.287, 0.253, 0.000)
		colorUpland    (0.381, 0.348, 0.308, 0.000)
		colorRock      (0.412, 0.378, 0.332, 0.000)
		colorSnow      (0.449, 0.403, 0.350, 1.000)
		BumpHeight      0.26326
		BumpOffset      0.0526521
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.15864
		Period          0.222
		Eccentricity    0.0996753
		Inclination     1.15682
		AscendingNode   -145.544
		ArgOfPericenter 76.1362
		MeanAnomaly     -48.7601
	}
}

Asteroid	"S85"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            5.33004e-011
	Radius          3.13219
	InertiaMoment   0.399388

	Obliquity       -3.77021
	EqAscendNode    119.161
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.506 0.416 0.383)

	Surface
	{
		SurfStyle       0.661458
		OceanStyle      0.875356
		Randomize      (0.169, 0.377, -0.135)
		colorDistMagn   0.817794
		colorDistFreq   0.00443216
		detailScale     85.5296
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0665504
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.711132
		terraceProb     0.182261
		erosion         0
		montesMagn      0.334018
		montesFreq      2.69748
		montesSpiky     0.793219
		montesFraction  0.479975
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.020491
		hillsFraction   0.661931
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255974
		craterFreq      0.205094
		craterDensity   0.908933
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   67.2648
		volcanoTemp     1872.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.141, 0.107, 0.000)
		colorShelf     (0.202, 0.146, 0.122, 0.000)
		colorBeach     (0.238, 0.171, 0.145, 0.000)
		colorDesert    (0.258, 0.183, 0.142, 0.000)
		colorLowland   (0.283, 0.195, 0.161, 0.000)
		colorUpland    (0.313, 0.237, 0.195, 0.000)
		colorRock      (0.339, 0.258, 0.210, 0.000)
		colorSnow      (0.369, 0.275, 0.222, 1.000)
		BumpHeight      2.81897
		BumpOffset      0.563793
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.154599
		Period          0.213571
		Eccentricity    0.0217061
		Inclination     -3.77022
		AscendingNode   119.161
		ArgOfPericenter -111.352
		MeanAnomaly     -174.568
	}
}

Asteroid	"S86"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            7.84344e-008
	Radius          37.8387
	InertiaMoment   0.396858

	Obliquity       -1.90586
	EqAscendNode    -42.7652
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.572 0.565 0.559)

	Surface
	{
		SurfStyle       0.696813
		OceanStyle      0.867599
		Randomize      (-0.242, 0.469, 0.086)
		colorDistMagn   0.574604
		colorDistFreq   0.186867
		detailScale     1033.25
		colorConversion true
		snowLevel       2
		tropicLatitude  0.061907
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.46434
		terraceProb     0.19003
		erosion         0
		montesMagn      0.525832
		montesFreq      2.71617
		montesSpiky     0.981285
		montesFraction  0.779844
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.13884
		hillsFraction   0.597425
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243122
		craterFreq      0.226712
		craterDensity   0.86982
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.1831
		volcanoTemp     1302.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.192, 0.157, 0.000)
		colorShelf     (0.229, 0.198, 0.179, 0.000)
		colorBeach     (0.269, 0.232, 0.212, 0.000)
		colorDesert    (0.292, 0.248, 0.207, 0.000)
		colorLowland   (0.320, 0.265, 0.235, 0.000)
		colorUpland    (0.355, 0.322, 0.285, 0.000)
		colorRock      (0.383, 0.350, 0.308, 0.000)
		colorSnow      (0.417, 0.373, 0.324, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.173249
		Period          0.253362
		Eccentricity    0.0471012
		Inclination     -1.90586
		AscendingNode   -42.7652
		ArgOfPericenter 162.74
		MeanAnomaly     109.578
	}
}

Asteroid	"S87"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.59498e-016
	Radius          0.0642247
	InertiaMoment   0.398565

	RotationPeriod  3527.17
	Obliquity       5.56203
	EqAscendNode    155.426

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.600 0.598 0.596)

	Surface
	{
		SurfStyle       0.718161
		OceanStyle      0.764848
		Randomize      (0.747, 0.588, 1.000)
		colorDistMagn   0.796425
		colorDistFreq   4.84056e-007
		detailScale     1.75376
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0412445
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581244
		terraceProb     0.283826
		erosion         0
		montesMagn      0.60568
		montesFreq      2.42705
		montesSpiky     0.962406
		montesFraction  0.599505
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.03469e-006
		hillsFraction   0.582468
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250866
		craterFreq      0.217255
		craterDensity   0.843232
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   469.749
		volcanoTemp     1577.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.203, 0.167, 0.000)
		colorShelf     (0.240, 0.209, 0.191, 0.000)
		colorBeach     (0.282, 0.245, 0.226, 0.000)
		colorDesert    (0.306, 0.263, 0.220, 0.000)
		colorLowland   (0.336, 0.281, 0.250, 0.000)
		colorUpland    (0.372, 0.341, 0.304, 0.000)
		colorRock      (0.402, 0.371, 0.328, 0.000)
		colorSnow      (0.438, 0.395, 0.345, 1.000)
		BumpHeight      0.0578022
		BumpOffset      0.0115604
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.167765
		Period          0.241427
		Eccentricity    0.124979
		Inclination     5.56203
		AscendingNode   155.426
		ArgOfPericenter 8.7394
		MeanAnomaly     -163.06
	}
}

Asteroid	"S88"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            6.76175e-013
	Radius          0.775968
	InertiaMoment   0.39957

	RotationPeriod  3715.44
	Obliquity       -1.9399
	EqAscendNode    20.6047

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.497 0.439 0.405)

	Surface
	{
		SurfStyle       0.152886
		OceanStyle      0.805212
		Randomize      (-0.676, -0.133, 0.712)
		colorDistMagn   0.736406
		colorDistFreq   0.000527683
		detailScale     21.1891
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0665736
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.546299
		terraceProb     0.324005
		erosion         0
		montesMagn      0.564998
		montesFreq      2.73745
		montesSpiky     0.978917
		montesFraction  0.561022
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0013024
		hillsFraction   0.644921
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26437
		craterFreq      0.261621
		craterDensity   0.756823
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   147.952
		volcanoTemp     1496.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.176, 0.162, 0.000)
		colorShelf     (0.211, 0.187, 0.172, 0.000)
		colorBeach     (0.224, 0.198, 0.182, 0.000)
		colorDesert    (0.236, 0.209, 0.192, 0.000)
		colorLowland   (0.248, 0.219, 0.202, 0.000)
		colorUpland    (0.261, 0.230, 0.212, 0.000)
		colorRock      (0.273, 0.241, 0.223, 0.000)
		colorSnow      (0.286, 0.252, 0.233, 1.000)
		BumpHeight      0.698371
		BumpOffset      0.139674
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.153805
		Period          0.211928
		Eccentricity    0.13105
		Inclination     -1.9399
		AscendingNode   20.6047
		ArgOfPericenter -77.9278
		MeanAnomaly     53.7532
	}
}

Asteroid	"S89"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            9.95026e-010
	Radius          8.30886
	InertiaMoment   0.397358

	RotationPeriod  1303.09
	Obliquity       1.36775
	EqAscendNode    23.8383

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.752 0.749 0.748)

	Surface
	{
		SurfStyle       0.938354
		OceanStyle      0.64215
		Randomize      (-0.923, 0.405, -0.114)
		colorDistMagn   0.525146
		colorDistFreq   0.0118057
		detailScale     226.887
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0466967
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.75147
		terraceProb     0.306245
		erosion         0
		montesMagn      0.384736
		montesFreq      3.48759
		montesSpiky     0.995449
		montesFraction  0.750912
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.12328
		hillsFraction   0.809837
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261103
		craterFreq      0.168048
		craterDensity   0.821686
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.2981
		volcanoTemp     1105.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.262, 0.299, 0.050)
		colorShelf     (0.301, 0.307, 0.344, 0.040)
		colorBeach     (0.346, 0.352, 0.389, 0.030)
		colorDesert    (0.391, 0.397, 0.442, 0.020)
		colorLowland   (0.436, 0.442, 0.487, 0.030)
		colorUpland    (0.481, 0.487, 0.531, 0.050)
		colorRock      (0.526, 0.532, 0.591, 0.020)
		colorSnow      (0.526, 0.532, 0.591, 1.000)
		BumpHeight      7.47797
		BumpOffset      1.49559
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.159109
		Period          0.222984
		Eccentricity    0.160017
		Inclination     1.36775
		AscendingNode   23.8383
		ArgOfPericenter -24.715
		MeanAnomaly     -97.7084
	}
}

Asteroid	"S90"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            5.82924e-018
	Radius          0.0159109
	InertiaMoment   0.398784

	Obliquity       1.30908
	EqAscendNode    -12.1738
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.495 0.491 0.488)

	Surface
	{
		SurfStyle       0.512554
		OceanStyle      0.341259
		Randomize      (-0.450, -0.950, -0.343)
		colorDistMagn   0.741889
		colorDistFreq   1.55755e-007
		detailScale     0.434474
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0454221
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.6028
		terraceProb     0.116272
		erosion         0
		montesMagn      0.612964
		montesFreq      4.04495
		montesSpiky     0.925861
		montesFraction  0.684359
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.77355e-007
		hillsFraction   0.582562
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219755
		craterFreq      0.223207
		craterDensity   0.834211
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1033.23
		volcanoTemp     1689.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.167, 0.137, 0.000)
		colorShelf     (0.198, 0.172, 0.156, 0.000)
		colorBeach     (0.233, 0.201, 0.185, 0.000)
		colorDesert    (0.253, 0.216, 0.181, 0.000)
		colorLowland   (0.277, 0.231, 0.205, 0.000)
		colorUpland    (0.307, 0.280, 0.249, 0.000)
		colorRock      (0.332, 0.304, 0.268, 0.000)
		colorSnow      (0.362, 0.324, 0.283, 1.000)
		BumpHeight      0.0143198
		BumpOffset      0.00286397
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.167913
		Period          0.241746
		Eccentricity    0.125999
		Inclination     1.30908
		AscendingNode   -12.1738
		ArgOfPericenter -59.55
		MeanAnomaly     52.2237
	}
}

Asteroid	"S91"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            8.57804e-015
	Radius          0.170374
	InertiaMoment   0.399749

	RotationPeriod  2562.47
	Obliquity       0.109094
	EqAscendNode    25.9529

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.680 0.604 0.475)

	Surface
	{
		SurfStyle       0.0164874
		OceanStyle      0.993454
		Randomize      (-0.231, -0.858, 0.600)
		colorDistMagn   0.69863
		colorDistFreq   6.32036e-006
		detailScale     4.65234
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00371863
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.308742
		terraceProb     0.134376
		erosion         0
		montesMagn      0.42978
		montesFreq      3.0383
		montesSpiky     0.995117
		montesFraction  0.282013
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.36546e-005
		hillsFraction   0.555326
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234882
		craterFreq      0.234308
		craterDensity   0.877025
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   288.413
		volcanoTemp     1539.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.242, 0.190, 0.000)
		colorShelf     (0.289, 0.257, 0.202, 0.000)
		colorBeach     (0.306, 0.272, 0.214, 0.000)
		colorDesert    (0.323, 0.287, 0.226, 0.000)
		colorLowland   (0.340, 0.302, 0.238, 0.000)
		colorUpland    (0.357, 0.317, 0.250, 0.000)
		colorRock      (0.374, 0.332, 0.262, 0.000)
		colorSnow      (0.391, 0.348, 0.273, 1.000)
		BumpHeight      0.153337
		BumpOffset      0.0306673
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.157325
		Period          0.219244
		Eccentricity    0.150491
		Inclination     0.109094
		AscendingNode   25.9529
		ArgOfPericenter -152.362
		MeanAnomaly     -171.421
	}
}

Asteroid	"S92"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.2623e-011
	Radius          2.05847
	InertiaMoment   0.397732

	RotationPeriod  3870.98
	Obliquity       1.37661
	EqAscendNode    147.62

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.528 0.398)

	Surface
	{
		SurfStyle       0.91592
		OceanStyle      0.847047
		Randomize      (-0.081, 0.800, 0.460)
		colorDistMagn   0.81151
		colorDistFreq   0.000974852
		detailScale     56.2099
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0133986
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.655193
		terraceProb     0.50925
		erosion         0
		montesMagn      0.541552
		montesFreq      2.51924
		montesSpiky     0.942721
		montesFraction  0.648094
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0118195
		hillsFraction   0.768807
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202116
		craterFreq      0.234203
		craterDensity   0.703426
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   90.8381
		volcanoTemp     1340.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.185, 0.159, 0.050)
		colorShelf     (0.254, 0.217, 0.183, 0.040)
		colorBeach     (0.292, 0.248, 0.207, 0.030)
		colorDesert    (0.330, 0.280, 0.235, 0.020)
		colorLowland   (0.368, 0.312, 0.259, 0.030)
		colorUpland    (0.406, 0.343, 0.283, 0.050)
		colorRock      (0.444, 0.375, 0.315, 0.020)
		colorSnow      (0.444, 0.375, 0.315, 1.000)
		BumpHeight      1.85262
		BumpOffset      0.370524
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.178497
		Period          0.26496
		Eccentricity    0.100285
		Inclination     1.37661
		AscendingNode   147.62
		ArgOfPericenter -36.7687
		MeanAnomaly     38.1937
	}
}

Asteroid	"S93"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.85754e-008
	Radius          22.0404
	InertiaMoment   0.39899

	RotationPeriod  4956.62
	Obliquity       -0.0631905
	EqAscendNode    -152.347

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.517 0.417 0.287)

	Surface
	{
		SurfStyle       0.262333
		OceanStyle      0.91684
		Randomize      (-0.008, -0.028, 0.704)
		colorDistMagn   0.802158
		colorDistFreq   0.302168
		detailScale     601.85
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.569311
		terraceProb     0.4172
		erosion         0
		montesMagn      0.471824
		montesFreq      3.35654
		montesSpiky     0.928162
		montesFraction  0.38045
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.01214
		hillsFraction   0.383234
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260395
		craterFreq      0.269416
		craterDensity   1.01399
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.3546
		volcanoTemp     1580.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.167, 0.115, 0.000)
		colorShelf     (0.220, 0.177, 0.122, 0.000)
		colorBeach     (0.233, 0.188, 0.129, 0.000)
		colorDesert    (0.245, 0.198, 0.137, 0.000)
		colorLowland   (0.258, 0.208, 0.144, 0.000)
		colorUpland    (0.271, 0.219, 0.151, 0.000)
		colorRock      (0.284, 0.229, 0.158, 0.000)
		colorSnow      (0.297, 0.240, 0.165, 1.000)
		BumpHeight      19.8364
		BumpOffset      3.96727
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.186389
		Period          0.282725
		Eccentricity    0.06793
		Inclination     -0.0631905
		AscendingNode   -152.347
		ArgOfPericenter 157.378
		MeanAnomaly     69.1458
	}
}

Asteroid	"S94"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.08822e-016
	Radius          0.0422081
	InertiaMoment   0.399925

	RotationPeriod  1133.92
	Obliquity       -2.17746
	EqAscendNode    13.4638

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.676 0.673 0.671)

	Surface
	{
		SurfStyle       0.898458
		OceanStyle      0.73203
		Randomize      (0.117, -0.857, -0.695)
		colorDistMagn   0.862383
		colorDistFreq   1.07536e-006
		detailScale     1.15256
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0754114
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496819
		terraceProb     0.415311
		erosion         0
		montesMagn      0.399291
		montesFreq      3.86387
		montesSpiky     0.847657
		montesFraction  0.377546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.58961e-006
		hillsFraction   0.466997
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243151
		craterFreq      0.191838
		craterDensity   0.946693
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   634.373
		volcanoTemp     1719.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.235, 0.268, 0.050)
		colorShelf     (0.270, 0.276, 0.309, 0.040)
		colorBeach     (0.311, 0.316, 0.349, 0.030)
		colorDesert    (0.352, 0.356, 0.396, 0.020)
		colorLowland   (0.392, 0.397, 0.436, 0.030)
		colorUpland    (0.433, 0.437, 0.476, 0.050)
		colorRock      (0.473, 0.478, 0.530, 0.020)
		colorSnow      (0.473, 0.478, 0.530, 1.000)
		BumpHeight      0.0379873
		BumpOffset      0.00759746
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.145021
		Period          0.194036
		Eccentricity    0.0784208
		Inclination     -2.17746
		AscendingNode   13.4638
		ArgOfPericenter -144.627
		MeanAnomaly     3.66837
	}
}

Asteroid	"S95"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.60137e-013
	Radius          0.451964
	InertiaMoment   0.39804

	Obliquity       0.431591
	EqAscendNode    31.6604
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.794 0.735 0.679)

	Surface
	{
		SurfStyle       0.385147
		OceanStyle      0.893488
		Randomize      (-0.816, 0.306, -0.737)
		colorDistMagn   0.581473
		colorDistFreq   0.000104442
		detailScale     12.3416
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0144926
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600384
		terraceProb     0.255169
		erosion         0
		montesMagn      0.372004
		montesFreq      3.29992
		montesSpiky     0.896285
		montesFraction  0.581346
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000593688
		hillsFraction   0.585735
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209852
		craterFreq      0.220394
		craterDensity   0.929226
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   177.078
		volcanoTemp     1494.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.294, 0.272, 0.000)
		colorShelf     (0.337, 0.312, 0.289, 0.000)
		colorBeach     (0.357, 0.331, 0.306, 0.000)
		colorDesert    (0.377, 0.349, 0.323, 0.000)
		colorLowland   (0.397, 0.367, 0.340, 0.000)
		colorUpland    (0.417, 0.386, 0.356, 0.000)
		colorRock      (0.437, 0.404, 0.373, 0.000)
		colorSnow      (0.457, 0.422, 0.390, 1.000)
		BumpHeight      0.406768
		BumpOffset      0.0813535
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.178151
		Period          0.26419
		Eccentricity    0.0670294
		Inclination     0.431591
		AscendingNode   31.6604
		ArgOfPericenter 129.389
		MeanAnomaly     151.367
	}
}

Asteroid	"S96"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.3565e-010
	Radius          5.46061
	InertiaMoment   0.399185

	Obliquity       -0.719954
	EqAscendNode    -57.6179
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.772 0.769 0.766)

	Surface
	{
		SurfStyle       0.965997
		OceanStyle      0.0152765
		Randomize      (-0.257, 0.036, 0.023)
		colorDistMagn   0.609316
		colorDistFreq   0.0144879
		detailScale     149.111
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0220201
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58564
		terraceProb     0.2609
		erosion         0
		montesMagn      0.374108
		montesFreq      3.53803
		montesSpiky     0.779748
		montesFraction  0.287268
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0683419
		hillsFraction   0.568164
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.294398
		craterFreq      0.211954
		craterDensity   0.921284
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   55.7717
		volcanoTemp     1242.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.269, 0.306, 0.050)
		colorShelf     (0.309, 0.315, 0.352, 0.040)
		colorBeach     (0.355, 0.362, 0.398, 0.030)
		colorDesert    (0.401, 0.408, 0.452, 0.020)
		colorLowland   (0.448, 0.454, 0.498, 0.030)
		colorUpland    (0.494, 0.500, 0.544, 0.050)
		colorRock      (0.540, 0.546, 0.605, 0.020)
		colorSnow      (0.540, 0.546, 0.605, 1.000)
		BumpHeight      4.91455
		BumpOffset      0.98291
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.153007
		Period          0.210281
		Eccentricity    0.0785153
		Inclination     -0.719954
		AscendingNode   -57.6179
		ArgOfPericenter -39.6624
		MeanAnomaly     -17.7494
	}
}

Asteroid	"S97"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.46771e-007
	Radius          58.4585
	InertiaMoment   0.395903

	Obliquity       -2.38753
	EqAscendNode    89.4171
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.581 0.578 0.576)

	Surface
	{
		SurfStyle       0.977061
		OceanStyle      0.047364
		Randomize      (-0.055, 0.195, -0.961)
		colorDistMagn   0.210896
		colorDistFreq   2.36083
		detailScale     1596.31
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0591861
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.618254
		terraceProb     0.362776
		erosion         0
		montesMagn      0.631404
		montesFreq      3.27748
		montesSpiky     0.928226
		montesFraction  0.883705
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.01962
		hillsFraction   0.684757
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214402
		craterFreq      0.270269
		craterDensity   0.974467
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   15.5644
		volcanoTemp     1197.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.202, 0.230, 0.050)
		colorShelf     (0.232, 0.237, 0.265, 0.040)
		colorBeach     (0.267, 0.272, 0.299, 0.030)
		colorDesert    (0.302, 0.306, 0.340, 0.020)
		colorLowland   (0.337, 0.341, 0.374, 0.030)
		colorUpland    (0.372, 0.376, 0.409, 0.050)
		colorRock      (0.406, 0.410, 0.455, 0.020)
		colorSnow      (0.406, 0.410, 0.455, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.183079
		Period          0.275227
		Eccentricity    0.125652
		Inclination     -2.38753
		AscendingNode   89.4171
		ArgOfPericenter 73.6883
		MeanAnomaly     89.9978
	}
}

Asteroid	"S98"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.03151e-015
	Radius          0.111969
	InertiaMoment   0.398307

	Obliquity       -4.05333
	EqAscendNode    -17.739
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.640 0.536 0.391)

	Surface
	{
		SurfStyle       0.289534
		OceanStyle      0.384376
		Randomize      (0.678, 0.185, -0.755)
		colorDistMagn   0.153424
		colorDistFreq   5.71094e-006
		detailScale     3.0575
		colorConversion true
		snowLevel       2
		tropicLatitude  0.139339
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.343789
		terraceProb     0.271445
		erosion         0
		montesMagn      0.591581
		montesFreq      3.81127
		montesSpiky     0.689621
		montesFraction  0.357115
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.82135e-005
		hillsFraction   0.771206
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252689
		craterFreq      0.24215
		craterDensity   0.841131
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   389.488
		volcanoTemp     1413.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.214, 0.156, 0.000)
		colorShelf     (0.272, 0.228, 0.166, 0.000)
		colorBeach     (0.288, 0.241, 0.176, 0.000)
		colorDesert    (0.304, 0.255, 0.186, 0.000)
		colorLowland   (0.320, 0.268, 0.195, 0.000)
		colorUpland    (0.336, 0.281, 0.205, 0.000)
		colorRock      (0.352, 0.295, 0.215, 0.000)
		colorSnow      (0.368, 0.308, 0.225, 1.000)
		BumpHeight      0.100772
		BumpOffset      0.0201544
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.157072
		Period          0.218716
		Eccentricity    0.034864
		Inclination     -4.05333
		AscendingNode   -17.739
		ArgOfPericenter -32.1496
		MeanAnomaly     159.76
	}
}

Asteroid	"S99"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.98948e-012
	Radius          1.19896
	InertiaMoment   0.399373

	RotationPeriod  5757.26
	Obliquity       3.74887
	EqAscendNode    96.5205

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.695 0.692 0.688)

	Surface
	{
		SurfStyle       0.0820625
		OceanStyle      0.353478
		Randomize      (-0.842, -0.347, 0.605)
		colorDistMagn   0.0196025
		colorDistFreq   0.000785186
		detailScale     32.7396
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0869754
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.609636
		terraceProb     0.259653
		erosion         0
		montesMagn      0.54488
		montesFreq      3.20896
		montesSpiky     0.969694
		montesFraction  0.526197
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00459598
		hillsFraction   0.774237
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245845
		craterFreq      0.15076
		craterDensity   0.78683
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   108.721
		volcanoTemp     1875.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.277, 0.275, 0.000)
		colorShelf     (0.295, 0.294, 0.292, 0.000)
		colorBeach     (0.313, 0.311, 0.310, 0.000)
		colorDesert    (0.330, 0.329, 0.327, 0.000)
		colorLowland   (0.347, 0.346, 0.344, 0.000)
		colorUpland    (0.365, 0.363, 0.361, 0.000)
		colorRock      (0.382, 0.381, 0.378, 0.000)
		colorSnow      (0.399, 0.398, 0.396, 1.000)
		BumpHeight      1.07906
		BumpOffset      0.215813
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.157174
		Period          0.218929
		Eccentricity    0.123034
		Inclination     3.74887
		AscendingNode   96.5205
		ArgOfPericenter -139.573
		MeanAnomaly     -53.9228
	}
}

Asteroid	"S100"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.39917e-009
	Radius          14.4854
	InertiaMoment   0.396811

	Obliquity       -2.05328
	EqAscendNode    57.2402
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.507 0.433 0.389)

	Surface
	{
		SurfStyle       0.702608
		OceanStyle      0.804902
		Randomize      (0.202, 0.839, -0.794)
		colorDistMagn   0.62688
		colorDistFreq   0.102315
		detailScale     395.548
		colorConversion true
		snowLevel       2
		tropicLatitude  0.062871
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489829
		terraceProb     0.136631
		erosion         0
		montesMagn      0.53951
		montesFreq      2.20885
		montesSpiky     0.906957
		montesFraction  0.785213
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.716535
		hillsFraction   0.466956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276444
		craterFreq      0.147339
		craterDensity   0.934765
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.2413
		volcanoTemp     1249.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.147, 0.109, 0.000)
		colorShelf     (0.203, 0.151, 0.124, 0.000)
		colorBeach     (0.238, 0.177, 0.148, 0.000)
		colorDesert    (0.258, 0.190, 0.144, 0.000)
		colorLowland   (0.284, 0.203, 0.163, 0.000)
		colorUpland    (0.314, 0.247, 0.198, 0.000)
		colorRock      (0.339, 0.268, 0.214, 0.000)
		colorSnow      (0.370, 0.286, 0.226, 1.000)
		BumpHeight      13.0368
		BumpOffset      2.60737
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.159573
		Period          0.22396
		Eccentricity    0.162458
		Inclination     -2.05328
		AscendingNode   57.2402
		ArgOfPericenter -78.9436
		MeanAnomaly     19.4413
	}
}

Comet	"C1"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.00845e-014
	Radius          0.418628
	InertiaMoment   0.397811

	Oblateness      0.0040298

	RotationPeriod  75.7173
	Obliquity       355.284
	EqAscendNode    27.3983

	AbsMagn         7.48493
	SlopeParam      6.63319
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.671 0.668 0.665)

	Surface
	{
		SurfStyle       0.9332
		OceanStyle      0.806541
		Randomize      (-0.424, 0.396, 0.414)
		colorDistMagn   0.151759
		colorDistFreq   0.00010442
		detailScale     11.4313
		colorConversion true
		snowLevel       2
		tropicLatitude  0.189694
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.447261
		terraceProb     0.31905
		erosion         0
		montesMagn      0.600192
		montesFreq      4.54285
		montesSpiky     0.887523
		montesFraction  0.296343
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000289979
		hillsFraction   0.572791
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206032
		craterFreq      0.182103
		craterDensity   0.879881
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   378.41
		volcanoTemp     1474.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.234, 0.266, 0.050)
		colorShelf     (0.268, 0.274, 0.306, 0.040)
		colorBeach     (0.309, 0.314, 0.346, 0.030)
		colorDesert    (0.349, 0.354, 0.393, 0.020)
		colorLowland   (0.389, 0.394, 0.432, 0.030)
		colorUpland    (0.429, 0.434, 0.472, 0.050)
		colorRock      (0.470, 0.474, 0.526, 0.020)
		colorSnow      (0.470, 0.474, 0.526, 1.000)
		BumpHeight      0.376765
		BumpOffset      0.075353
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.192945
		GasToDust   0.25
		Particles   1369
		GasBright   0.134467
		DustBright  0.424268
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.58533
		Period          14.6052
		Eccentricity    0.978432
		Inclination     12.6429
		AscendingNode   -58.5336
		ArgOfPericenter 127.739
		MeanAnomaly     -176.652
	}
}

Comet	"C2"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.32682e-010
	Radius          9.04212
	InertiaMoment   0.39964

	Oblateness      0.00563425

	RotationPeriod  73.3435
	Obliquity       308.49
	EqAscendNode    11.9757

	AbsMagn         8.81755
	SlopeParam      5.08995
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.730 0.728 0.726)

	Surface
	{
		SurfStyle       0.391992
		OceanStyle      0.947635
		Randomize      (-0.438, 0.579, -0.349)
		colorDistMagn   0.651372
		colorDistFreq   0.0400348
		detailScale     246.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0.906226
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.669779
		terraceProb     0.321561
		erosion         0
		montesMagn      0.418395
		montesFreq      2.67514
		montesSpiky     0.904788
		montesFraction  0.591329
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.206404
		hillsFraction   0.573804
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244926
		craterFreq      0.195021
		craterDensity   0.777559
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   92.9384
		volcanoTemp     1439.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.291, 0.290, 0.000)
		colorShelf     (0.310, 0.309, 0.309, 0.000)
		colorBeach     (0.329, 0.328, 0.327, 0.000)
		colorDesert    (0.347, 0.346, 0.345, 0.000)
		colorLowland   (0.365, 0.364, 0.363, 0.000)
		colorUpland    (0.383, 0.382, 0.381, 0.000)
		colorRock      (0.402, 0.400, 0.399, 0.000)
		colorSnow      (0.420, 0.419, 0.417, 1.000)
		BumpHeight      8.13791
		BumpOffset      1.62758
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.674137
		GasToDust   0.25
		Particles   2341
		GasBright   0.0728957
		DustBright  0.170326
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.1338
		Period          19.4912
		Eccentricity    0.97558
		Inclination     -96.6867
		AscendingNode   -129.574
		ArgOfPericenter -5.37785
		MeanAnomaly     -72.744
	}
}

Comet	"C3"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            7.16445e-018
	Radius          0.0259265
	InertiaMoment   0.398458

	Oblateness      0.00457299

	RotationPeriod  71.0751
	Obliquity       261.695
	EqAscendNode    356.553

	AbsMagn         10.2508
	SlopeParam      4.04119
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.526 0.520 0.516)

	Surface
	{
		SurfStyle       0.676014
		OceanStyle      0.621435
		Randomize      (0.077, -0.017, 0.642)
		colorDistMagn   0.646918
		colorDistFreq   1.51788e-007
		detailScale     0.707967
		colorConversion true
		snowLevel       2
		tropicLatitude  0.683135
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.754772
		terraceProb     0.320663
		erosion         0
		montesMagn      0.39708
		montesFreq      2.28716
		montesSpiky     0.815252
		montesFraction  0.589134
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.16544e-006
		hillsFraction   0.789108
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254536
		craterFreq      0.165966
		craterDensity   0.885347
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1518.65
		volcanoTemp     1445.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.177, 0.144, 0.000)
		colorShelf     (0.210, 0.182, 0.165, 0.000)
		colorBeach     (0.247, 0.213, 0.196, 0.000)
		colorDesert    (0.268, 0.229, 0.191, 0.000)
		colorLowland   (0.294, 0.244, 0.217, 0.000)
		colorUpland    (0.326, 0.296, 0.263, 0.000)
		colorRock      (0.352, 0.322, 0.284, 0.000)
		colorSnow      (0.384, 0.343, 0.299, 1.000)
		BumpHeight      0.0233339
		BumpOffset      0.00466677
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.261068
		DustBright  0.46664
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.11229
		Period          10.7861
		Eccentricity    0.988867
		Inclination     104.606
		AscendingNode   -143.199
		ArgOfPericenter -171.381
		MeanAnomaly     116.704
	}
}

Comet	"C4"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            5.54119e-014
	Radius          0.559986
	InertiaMoment   0.395496

	Oblateness      0.0062707

	RotationPeriod  68.8949
	Obliquity       214.901
	EqAscendNode    341.13

	AbsMagn         12.0673
	SlopeParam      3.00443
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.433 0.428 0.425)

	Surface
	{
		SurfStyle       0.638267
		OceanStyle      0.75643
		Randomize      (-0.234, 0.144, 0.830)
		colorDistMagn   0.858863
		colorDistFreq   0.000272046
		detailScale     15.2913
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999619
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5367
		terraceProb     0.276531
		erosion         0
		montesMagn      0.41725
		montesFreq      2.48791
		montesSpiky     0.916603
		montesFraction  0.544268
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000686456
		hillsFraction   0.484967
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240669
		craterFreq      0.236
		craterDensity   0.96813
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   372.976
		volcanoTemp     1505.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.146, 0.119, 0.000)
		colorShelf     (0.173, 0.150, 0.136, 0.000)
		colorBeach     (0.204, 0.176, 0.162, 0.000)
		colorDesert    (0.221, 0.189, 0.157, 0.000)
		colorLowland   (0.243, 0.201, 0.179, 0.000)
		colorUpland    (0.269, 0.244, 0.217, 0.000)
		colorRock      (0.290, 0.266, 0.234, 0.000)
		colorSnow      (0.316, 0.283, 0.247, 1.000)
		BumpHeight      0.503987
		BumpOffset      0.100797
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.225771
		GasToDust   0.25
		Particles   1435
		GasBright   0.172215
		DustBright  0.23998
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.51665
		Period          14.0271
		Eccentricity    0.976936
		Inclination     -61.5399
		AscendingNode   -146.289
		ArgOfPericenter -104.205
		MeanAnomaly     -45.1686
	}
}

Comet	"C5"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.2857e-010
	Radius          10.1311
	InertiaMoment   0.398974

	Oblateness      0.00517565

	RotationPeriod  66.7888
	Obliquity       168.107
	EqAscendNode    325.708

	AbsMagn         16.0252
	SlopeParam      7.3244
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.675 0.670 0.666)

	Surface
	{
		SurfStyle       0.733092
		OceanStyle      0.916796
		Randomize      (-0.867, -0.062, 0.311)
		colorDistMagn   0.399322
		colorDistFreq   0.0535434
		detailScale     276.646
		colorConversion true
		snowLevel       2
		tropicLatitude  0.897405
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.687154
		terraceProb     0.23768
		erosion         0
		montesMagn      0.486486
		montesFreq      3.7647
		montesSpiky     0.89696
		montesFraction  0.276345
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.287054
		hillsFraction   0.682673
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265553
		craterFreq      0.243407
		craterDensity   0.973176
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   76.7275
		volcanoTemp     1688.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.228, 0.186, 0.000)
		colorShelf     (0.270, 0.234, 0.213, 0.000)
		colorBeach     (0.317, 0.275, 0.253, 0.000)
		colorDesert    (0.344, 0.295, 0.246, 0.000)
		colorLowland   (0.378, 0.315, 0.280, 0.000)
		colorUpland    (0.419, 0.382, 0.340, 0.000)
		colorRock      (0.452, 0.415, 0.366, 0.000)
		colorSnow      (0.493, 0.442, 0.386, 1.000)
		BumpHeight      9.11798
		BumpOffset      1.8236
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.706963
		GasToDust   0.25
		Particles   2408
		GasBright   0.427578
		DustBright  0.469104
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.99428
		Period          18.2042
		Eccentricity    0.975479
		Inclination     73.996
		AscendingNode   30.0811
		ArgOfPericenter 159.176
		MeanAnomaly     14.5564
	}
}

Comet	"C6"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.3196e-017
	Radius          0.0346806
	InertiaMoment   0.397387

	Oblateness      0.00713253

	RotationPeriod  64.7451
	Obliquity       121.312
	EqAscendNode    310.285

	AbsMagn         3.24668
	SlopeParam      5.36707
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.714 0.712 0.708)

	Surface
	{
		SurfStyle       0.498973
		OceanStyle      0.949322
		Randomize      (-0.950, -0.105, 0.809)
		colorDistMagn   0.761837
		colorDistFreq   1.0379e-006
		detailScale     0.947012
		colorConversion true
		snowLevel       2
		tropicLatitude  0.752853
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.655222
		terraceProb     0.196455
		erosion         0
		montesMagn      0.5345
		montesFreq      3.32202
		montesSpiky     0.943292
		montesFraction  0.815793
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.04068e-006
		hillsFraction   0.750953
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229575
		craterFreq      0.242063
		craterDensity   0.820537
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1496.82
		volcanoTemp     1823.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.285, 0.283, 0.000)
		colorShelf     (0.304, 0.302, 0.301, 0.000)
		colorBeach     (0.321, 0.320, 0.319, 0.000)
		colorDesert    (0.339, 0.338, 0.336, 0.000)
		colorLowland   (0.357, 0.356, 0.354, 0.000)
		colorUpland    (0.375, 0.374, 0.372, 0.000)
		colorRock      (0.393, 0.391, 0.389, 0.000)
		colorSnow      (0.411, 0.409, 0.407, 1.000)
		BumpHeight      0.0312126
		BumpOffset      0.00624251
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0208581
		DustBright  0.56031
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.44445
		Period          6.09941
		Eccentricity    0.963462
		Inclination     168.293
		AscendingNode   149.451
		ArgOfPericenter 157.04
		MeanAnomaly     15.1375
	}
}

Comet	"C7"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.02062e-013
	Radius          0.62743
	InertiaMoment   0.399428

	Oblateness      0.00585751

	RotationPeriod  62.754
	Obliquity       74.5181
	EqAscendNode    294.863

	AbsMagn         5.29645
	SlopeParam      4.27138
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.799 0.798 0.795)

	Surface
	{
		SurfStyle       0.965641
		OceanStyle      0.345689
		Randomize      (-0.565, 0.261, 0.628)
		colorDistMagn   0.182985
		colorDistFreq   0.000231268
		detailScale     17.133
		colorConversion true
		snowLevel       2
		tropicLatitude  0.659196
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.761515
		terraceProb     0.143564
		erosion         0
		montesMagn      0.522265
		montesFreq      2.63283
		montesSpiky     0.797381
		montesFraction  0.72035
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000904529
		hillsFraction   0.644709
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2413
		craterFreq      0.228695
		craterDensity   0.912749
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   307.921
		volcanoTemp     1671.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.279, 0.318, 0.050)
		colorShelf     (0.320, 0.327, 0.366, 0.040)
		colorBeach     (0.368, 0.375, 0.414, 0.030)
		colorDesert    (0.416, 0.423, 0.469, 0.020)
		colorLowland   (0.464, 0.471, 0.517, 0.030)
		colorUpland    (0.512, 0.519, 0.565, 0.050)
		colorRock      (0.560, 0.566, 0.628, 0.020)
		colorSnow      (0.560, 0.566, 0.628, 1.000)
		BumpHeight      0.564687
		BumpOffset      0.112937
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.258597
		GasToDust   0.25
		Particles   1502
		GasBright   0.0252199
		DustBright  0.240434
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.31968
		Period          12.4129
		Eccentricity    0.950688
		Inclination     145.48
		AscendingNode   -13.0444
		ArgOfPericenter -42.6546
		MeanAnomaly     -31.5331
	}
}

Comet	"C8"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            7.89374e-010
	Radius          13.5519
	InertiaMoment   0.398163

	Oblateness      0.00808929

	RotationPeriod  60.8072
	Obliquity       27.7238
	EqAscendNode    279.44

	AbsMagn         6.79656
	SlopeParam      3.25665
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.710 0.670 0.640)

	Surface
	{
		SurfStyle       0.745989
		OceanStyle      0.191773
		Randomize      (0.818, 0.225, -0.614)
		colorDistMagn   0.183507
		colorDistFreq   0.14119
		detailScale     370.057
		colorConversion true
		snowLevel       2
		tropicLatitude  0.93929
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.626252
		terraceProb     0.267538
		erosion         0
		montesMagn      0.444476
		montesFreq      3.57082
		montesSpiky     0.965549
		montesFraction  0.576329
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.331529
		hillsFraction   0.552647
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26943
		craterFreq      0.271804
		craterDensity   0.884619
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   75.6247
		volcanoTemp     1380.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.228, 0.179, 0.000)
		colorShelf     (0.284, 0.235, 0.205, 0.000)
		colorBeach     (0.334, 0.275, 0.243, 0.000)
		colorDesert    (0.362, 0.295, 0.237, 0.000)
		colorLowland   (0.397, 0.315, 0.269, 0.000)
		colorUpland    (0.440, 0.382, 0.326, 0.000)
		colorRock      (0.476, 0.416, 0.352, 0.000)
		colorSnow      (0.518, 0.442, 0.371, 1.000)
		BumpHeight      12.1967
		BumpOffset      2.43934
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.739789
		GasToDust   0.25
		Particles   2474
		GasBright   0.115507
		DustBright  0.634634
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.08718
		Period          10.5943
		Eccentricity    0.975376
		Inclination     102.28
		AscendingNode   70.0831
		ArgOfPericenter 101.415
		MeanAnomaly     -114.287
	}
}

Comet	"C9"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.43054e-017
	Radius          0.038857
	InertiaMoment   0.399854

	Oblateness      0.00664319

	RotationPeriod  58.897
	Obliquity       340.93
	EqAscendNode    264.018

	AbsMagn         8.14005
	SlopeParam      9.61776
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.622 0.618 0.612)

	Surface
	{
		SurfStyle       0.0154911
		OceanStyle      0.595385
		Randomize      (-0.407, -0.177, -0.896)
		colorDistMagn   0.655899
		colorDistFreq   4.76314e-007
		detailScale     1.06105
		colorConversion true
		snowLevel       2
		tropicLatitude  0.445116
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496881
		terraceProb     0.206324
		erosion         0
		montesMagn      0.537463
		montesFreq      2.95909
		montesSpiky     0.978944
		montesFraction  0.490711
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.9112e-006
		hillsFraction   0.462393
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236866
		craterFreq      0.260774
		craterDensity   1.00847
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1235.73
		volcanoTemp     1477.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.247, 0.245, 0.000)
		colorShelf     (0.264, 0.263, 0.260, 0.000)
		colorBeach     (0.280, 0.278, 0.275, 0.000)
		colorDesert    (0.296, 0.294, 0.291, 0.000)
		colorLowland   (0.311, 0.309, 0.306, 0.000)
		colorUpland    (0.327, 0.325, 0.321, 0.000)
		colorRock      (0.342, 0.340, 0.336, 0.000)
		colorSnow      (0.358, 0.356, 0.352, 1.000)
		BumpHeight      0.0349713
		BumpOffset      0.00699426
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0925868
		DustBright  0.342041
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.84846
		Period          16.8907
		Eccentricity    0.972153
		Inclination     38.1144
		AscendingNode   -41.1422
		ArgOfPericenter -19.9996
		MeanAnomaly     164.94
	}
}

Comet	"C10"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.87985e-013
	Radius          0.839295
	InertiaMoment   0.39873

	Oblateness      0.00919684

	RotationPeriod  57.0171
	Obliquity       294.135
	EqAscendNode    248.595

	AbsMagn         9.5
	SlopeParam      5.67337
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.571 0.567 0.559)

	Surface
	{
		SurfStyle       0.483044
		OceanStyle      0.666286
		Randomize      (0.041, -0.330, -0.092)
		colorDistMagn   0.132241
		colorDistFreq   0.000501582
		detailScale     22.9184
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999114
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.50973
		terraceProb     0.257166
		erosion         0
		montesMagn      0.622894
		montesFreq      3.09263
		montesSpiky     0.953728
		montesFraction  0.473009
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00140224
		hillsFraction   0.654126
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21251
		craterFreq      0.238875
		craterDensity   1.08092
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   303.5
		volcanoTemp     1705.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.227, 0.224, 0.000)
		colorShelf     (0.243, 0.241, 0.238, 0.000)
		colorBeach     (0.257, 0.255, 0.252, 0.000)
		colorDesert    (0.271, 0.269, 0.266, 0.000)
		colorLowland   (0.285, 0.283, 0.279, 0.000)
		colorUpland    (0.300, 0.298, 0.293, 0.000)
		colorRock      (0.314, 0.312, 0.307, 0.000)
		colorSnow      (0.328, 0.326, 0.321, 1.000)
		BumpHeight      0.755366
		BumpOffset      0.151073
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.291423
		GasToDust   0.25
		Particles   1568
		GasBright   0.250064
		DustBright  0.66905
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.42677
		Period          22.2875
		Eccentricity    0.972508
		Inclination     -22.0883
		AscendingNode   11.055
		ArgOfPericenter -65.1387
		MeanAnomaly     -169.671
	}
}

Comet	"C11"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.45393e-009
	Radius          15.1834
	InertiaMoment   0.396794

	Oblateness      0.00746735

	RotationPeriod  55.1615
	Obliquity       247.341
	EqAscendNode    233.172

	AbsMagn         11.0668
	SlopeParam      4.50523
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.652 0.530 0.488)

	Surface
	{
		SurfStyle       0.727557
		OceanStyle      0.894041
		Randomize      (0.118, -0.244, 0.559)
		colorDistMagn   0.936748
		colorDistFreq   0.111432
		detailScale     414.608
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987808
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494242
		terraceProb     0.483798
		erosion         0
		montesMagn      0.550325
		montesFreq      3.86415
		montesSpiky     0.987443
		montesFraction  0.632465
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.620636
		hillsFraction   0.634398
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252089
		craterFreq      0.23363
		craterDensity   0.886508
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   62.4315
		volcanoTemp     1546.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.180, 0.137, 0.000)
		colorShelf     (0.261, 0.186, 0.156, 0.000)
		colorBeach     (0.306, 0.217, 0.185, 0.000)
		colorDesert    (0.332, 0.233, 0.181, 0.000)
		colorLowland   (0.365, 0.249, 0.205, 0.000)
		colorUpland    (0.404, 0.302, 0.249, 0.000)
		colorRock      (0.437, 0.329, 0.268, 0.000)
		colorSnow      (0.476, 0.350, 0.283, 1.000)
		BumpHeight      13.6651
		BumpOffset      2.73301
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.772615
		GasToDust   0.25
		Particles   2540
		GasBright   0.199862
		DustBright  0.403739
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.57295
		Period          23.7287
		Eccentricity    0.974492
		Inclination     65.732
		AscendingNode   68.0829
		ArgOfPericenter -131.032
		MeanAnomaly     -36.3735
	}
}

Comet	"C12"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.47675e-017
	Radius          0.0519796
	InertiaMoment   0.399209

	Oblateness      0.0105072

	RotationPeriod  53.3248
	Obliquity       200.547
	EqAscendNode    217.75

	AbsMagn         13.3773
	SlopeParam      3.49754
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.594 0.436 0.336)

	Surface
	{
		SurfStyle       0.991329
		OceanStyle      0.849566
		Randomize      (0.266, 0.347, 0.411)
		colorDistMagn   0.963913
		colorDistFreq   2.20568e-006
		detailScale     1.41939
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94112
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.408305
		terraceProb     0.408963
		erosion         0
		montesMagn      0.579691
		montesFreq      3.2876
		montesSpiky     0.978152
		montesFraction  0.710577
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.63317e-006
		hillsFraction   0.677267
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213402
		craterFreq      0.182381
		craterDensity   0.816768
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1218.03
		volcanoTemp     1260.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.153, 0.134, 0.050)
		colorShelf     (0.238, 0.179, 0.154, 0.040)
		colorBeach     (0.273, 0.205, 0.175, 0.030)
		colorDesert    (0.309, 0.231, 0.198, 0.020)
		colorLowland   (0.345, 0.257, 0.218, 0.030)
		colorUpland    (0.380, 0.283, 0.238, 0.050)
		colorRock      (0.416, 0.310, 0.265, 0.020)
		colorSnow      (0.416, 0.310, 0.265, 1.000)
		BumpHeight      0.0467817
		BumpOffset      0.00935634
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.112401
		DustBright  0.175687
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.41601
		Period          22.1826
		Eccentricity    0.96291
		Inclination     -62.6622
		AscendingNode   107.153
		ArgOfPericenter -161.529
		MeanAnomaly     -41.557
	}
}

Comet	"C13"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.46245e-013
	Radius          0.940296
	InertiaMoment   0.397821

	Oblateness      0.00857658

	RotationPeriod  51.5018
	Obliquity       153.752
	EqAscendNode    202.327

	AbsMagn         1.43381
	SlopeParam      2.33044
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.651 0.593 0.545)

	Surface
	{
		SurfStyle       0.420956
		OceanStyle      0.448254
		Randomize      (-0.915, 0.076, -0.822)
		colorDistMagn   0.493777
		colorDistFreq   0.000457543
		detailScale     25.6764
		colorConversion true
		snowLevel       2
		tropicLatitude  0.43007
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.761772
		terraceProb     0.304937
		erosion         0
		montesMagn      0.437493
		montesFreq      2.41781
		montesSpiky     0.887578
		montesFraction  0.747237
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00233452
		hillsFraction   0.769172
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256855
		craterFreq      0.217376
		craterDensity   0.988218
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   250.541
		volcanoTemp     1478.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.237, 0.218, 0.000)
		colorShelf     (0.277, 0.252, 0.232, 0.000)
		colorBeach     (0.293, 0.267, 0.245, 0.000)
		colorDesert    (0.309, 0.281, 0.259, 0.000)
		colorLowland   (0.325, 0.296, 0.272, 0.000)
		colorUpland    (0.342, 0.311, 0.286, 0.000)
		colorRock      (0.358, 0.326, 0.300, 0.000)
		colorSnow      (0.374, 0.341, 0.313, 1.000)
		BumpHeight      0.846267
		BumpOffset      0.169253
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.324249
		GasToDust   0.25
		Particles   1634
		GasBright   0.347045
		DustBright  0.425528
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.27816
		Period          20.8535
		Eccentricity    0.972163
		Inclination     9.83502
		AscendingNode   75.3656
		ArgOfPericenter -90.4543
		MeanAnomaly     -121.971
	}
}

Comet	"C14"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.67795e-009
	Radius          20.3121
	InertiaMoment   0.399646

	Oblateness      0.0120915

	RotationPeriod  49.6877
	Obliquity       106.958
	EqAscendNode    186.905

	AbsMagn         4.37718
	SlopeParam      6.02513
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.481 0.475 0.467)

	Surface
	{
		SurfStyle       0.293574
		OceanStyle      0.0593382
		Randomize      (-0.440, 0.199, 0.757)
		colorDistMagn   0.326765
		colorDistFreq   0.349509
		detailScale     554.655
		colorConversion true
		snowLevel       2
		tropicLatitude  0.944624
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.316072
		terraceProb     0.339109
		erosion         0
		montesMagn      0.494992
		montesFreq      3.53963
		montesSpiky     0.96329
		montesFraction  0.555209
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.42307
		hillsFraction   0.579511
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248355
		craterFreq      0.221534
		craterDensity   0.894495
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   61.5402
		volcanoTemp     1544
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.190, 0.187, 0.000)
		colorShelf     (0.204, 0.202, 0.199, 0.000)
		colorBeach     (0.216, 0.214, 0.210, 0.000)
		colorDesert    (0.228, 0.226, 0.222, 0.000)
		colorLowland   (0.241, 0.238, 0.234, 0.000)
		colorUpland    (0.253, 0.249, 0.245, 0.000)
		colorRock      (0.265, 0.261, 0.257, 0.000)
		colorSnow      (0.277, 0.273, 0.269, 1.000)
		BumpHeight      18.2809
		BumpOffset      3.65617
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.80544
		GasToDust   0.25
		Particles   2606
		GasBright   0.00377163
		DustBright  0.453289
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.38372
		Period          12.9305
		Eccentricity    0.964031
		Inclination     -143.49
		AscendingNode   171.331
		ArgOfPericenter -106.75
		MeanAnomaly     -32.8481
	}
}

Comet	"C15"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            8.24563e-017
	Radius          0.0582312
	InertiaMoment   0.398465

	Oblateness      0.00992132

	RotationPeriod  47.878
	Obliquity       60.1637
	EqAscendNode    171.482

	AbsMagn         6.07028
	SlopeParam      4.74623
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.536 0.528 0.525)

	Surface
	{
		SurfStyle       0.559178
		OceanStyle      0.404362
		Randomize      (0.494, 0.668, -0.001)
		colorDistMagn   0.309422
		colorDistFreq   5.29489e-007
		detailScale     1.5901
		colorConversion true
		snowLevel       2
		tropicLatitude  0.858732
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.400177
		terraceProb     0.211148
		erosion         0
		montesMagn      0.622626
		montesFreq      2.00509
		montesSpiky     0.890746
		montesFraction  0.152191
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.5818e-006
		hillsFraction   0.409744
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247065
		craterFreq      0.19457
		craterDensity   0.792423
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1005.43
		volcanoTemp     1052.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.179, 0.147, 0.000)
		colorShelf     (0.214, 0.185, 0.168, 0.000)
		colorBeach     (0.252, 0.216, 0.199, 0.000)
		colorDesert    (0.273, 0.232, 0.194, 0.000)
		colorLowland   (0.300, 0.248, 0.220, 0.000)
		colorUpland    (0.332, 0.301, 0.267, 0.000)
		colorRock      (0.359, 0.327, 0.288, 0.000)
		colorSnow      (0.391, 0.348, 0.304, 1.000)
		BumpHeight      0.0524081
		BumpOffset      0.0104816
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0633635
		DustBright  0.878184
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.98626
		Period          18.1311
		Eccentricity    0.972513
		Inclination     84.9842
		AscendingNode   49.9591
		ArgOfPericenter 21.5138
		MeanAnomaly     -21.2983
	}
}

Comet	"C16"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            6.37739e-013
	Radius          1.25799
	InertiaMoment   0.39556

	Oblateness      0.0138185

	RotationPeriod  46.0679
	Obliquity       13.3694
	EqAscendNode    156.059

	AbsMagn         7.46657
	SlopeParam      3.73133
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.433 0.425 0.422)

	Surface
	{
		SurfStyle       0.00212648
		OceanStyle      0.810518
		Randomize      (0.204, 0.048, 0.118)
		colorDistMagn   0.878332
		colorDistFreq   0.000867934
		detailScale     34.3516
		colorConversion true
		snowLevel       2
		tropicLatitude  0.123006
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.613114
		terraceProb     0.168335
		erosion         0
		montesMagn      0.509486
		montesFreq      2.59825
		montesSpiky     0.964228
		montesFraction  0.407935
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00420871
		hillsFraction   0.678592
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264116
		craterFreq      0.250378
		craterDensity   0.931791
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   246.981
		volcanoTemp     1369.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.170, 0.169, 0.000)
		colorShelf     (0.184, 0.181, 0.179, 0.000)
		colorBeach     (0.195, 0.191, 0.190, 0.000)
		colorDesert    (0.205, 0.202, 0.200, 0.000)
		colorLowland   (0.216, 0.213, 0.211, 0.000)
		colorUpland    (0.227, 0.223, 0.221, 0.000)
		colorRock      (0.238, 0.234, 0.232, 0.000)
		colorSnow      (0.249, 0.245, 0.242, 1.000)
		BumpHeight      1.13219
		BumpOffset      0.226439
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.357075
		GasToDust   0.25
		Particles   1701
		GasBright   0.0790946
		DustBright  0.546939
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.99196
		Period          18.1831
		Eccentricity    0.965719
		Inclination     -173.18
		AscendingNode   -163.964
		ArgOfPericenter 117.384
		MeanAnomaly     -14.3555
	}
}

Comet	"C17"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.93245e-009
	Radius          22.7531
	InertiaMoment   0.39898

	Oblateness      0.0116041

	RotationPeriod  44.2529
	Obliquity       326.575
	EqAscendNode    140.637

	AbsMagn         8.79897
	SlopeParam      2.63632
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.678 0.676 0.674)

	Surface
	{
		SurfStyle       0.128532
		OceanStyle      0.29066
		Randomize      (-0.745, -0.570, -0.874)
		colorDistMagn   0.561903
		colorDistFreq   0.364804
		detailScale     621.312
		colorConversion true
		snowLevel       2
		tropicLatitude  0.934538
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.506414
		terraceProb     0.462486
		erosion         0
		montesMagn      0.532615
		montesFreq      2.72204
		montesSpiky     0.914169
		montesFraction  0.362932
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.34639
		hillsFraction   0.550387
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234405
		craterFreq      0.224
		craterDensity   0.848753
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   50.7944
		volcanoTemp     1427.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.270, 0.270, 0.000)
		colorShelf     (0.288, 0.287, 0.286, 0.000)
		colorBeach     (0.305, 0.304, 0.303, 0.000)
		colorDesert    (0.322, 0.321, 0.320, 0.000)
		colorLowland   (0.339, 0.338, 0.337, 0.000)
		colorUpland    (0.356, 0.355, 0.354, 0.000)
		colorRock      (0.373, 0.372, 0.371, 0.000)
		colorSnow      (0.390, 0.389, 0.387, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.838266
		GasToDust   0.25
		Particles   2673
		GasBright   0.0575666
		DustBright  0.252954
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.68921
		Period          15.4942
		Eccentricity    0.976605
		Inclination     36.6903
		AscendingNode   162.212
		ArgOfPericenter -57.3459
		MeanAnomaly     118.956
	}
}

Comet	"C18"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.51874e-016
	Radius          0.077912
	InertiaMoment   0.397399

	Oblateness      0.0163636

	RotationPeriod  42.4283
	Obliquity       279.781
	EqAscendNode    125.214

	AbsMagn         10.2295
	SlopeParam      6.4543
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.758 0.722 0.704)

	Surface
	{
		SurfStyle       0.037116
		OceanStyle      0.786987
		Randomize      (0.638, -0.776, -0.797)
		colorDistMagn   0.52089
		colorDistFreq   4.51531e-006
		detailScale     2.12752
		colorConversion true
		snowLevel       2
		tropicLatitude  0.806284
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.33927
		terraceProb     0.506324
		erosion         0
		montesMagn      0.318917
		montesFreq      2.07751
		montesSpiky     0.845226
		montesFraction  0.742413
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.2188e-005
		hillsFraction   0.568049
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222581
		craterFreq      0.258095
		craterDensity   0.961636
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   991.218
		volcanoTemp     1579.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.289, 0.282, 0.000)
		colorShelf     (0.322, 0.307, 0.299, 0.000)
		colorBeach     (0.341, 0.325, 0.317, 0.000)
		colorDesert    (0.360, 0.343, 0.334, 0.000)
		colorLowland   (0.379, 0.361, 0.352, 0.000)
		colorUpland    (0.398, 0.379, 0.370, 0.000)
		colorRock      (0.417, 0.397, 0.387, 0.000)
		colorSnow      (0.436, 0.415, 0.405, 1.000)
		BumpHeight      0.0701208
		BumpOffset      0.0140242
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.194326
		DustBright  0.600681
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.47086
		Period          13.646
		Eccentricity    0.967564
		Inclination     -150.754
		AscendingNode   -22.9623
		ArgOfPericenter -103.996
		MeanAnomaly     2.15514
	}
}

Comet	"C19"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.17463e-012
	Radius          1.40903
	InertiaMoment   0.399433

	Oblateness      0.0137788

	RotationPeriod  40.5893
	Obliquity       232.987
	EqAscendNode    109.792

	AbsMagn         12.0369
	SlopeParam      4.99861
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.763 0.663 0.626)

	Surface
	{
		SurfStyle       0.33191
		OceanStyle      0.269758
		Randomize      (-0.781, -0.981, -0.614)
		colorDistMagn   0.617158
		colorDistFreq   0.00103905
		detailScale     38.476
		colorConversion true
		snowLevel       2
		tropicLatitude  0.58117
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.703307
		terraceProb     0.453406
		erosion         0
		montesMagn      0.392872
		montesFreq      3.42186
		montesSpiky     0.842423
		montesFraction  0.732384
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00500056
		hillsFraction   0.495607
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246262
		craterFreq      0.1611
		craterDensity   0.773164
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   203.834
		volcanoTemp     1689.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.265, 0.250, 0.000)
		colorShelf     (0.324, 0.282, 0.266, 0.000)
		colorBeach     (0.343, 0.298, 0.282, 0.000)
		colorDesert    (0.362, 0.315, 0.297, 0.000)
		colorLowland   (0.381, 0.332, 0.313, 0.000)
		colorUpland    (0.400, 0.348, 0.329, 0.000)
		colorRock      (0.419, 0.365, 0.344, 0.000)
		colorSnow      (0.439, 0.381, 0.360, 1.000)
		BumpHeight      1.26813
		BumpOffset      0.253626
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.3899
		GasToDust   0.25
		Particles   1767
		GasBright   0.145516
		DustBright  0.333978
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.49089
		Period          13.8122
		Eccentricity    0.945181
		Inclination     -28.1958
		AscendingNode   -41.3507
		ArgOfPericenter -115.235
		MeanAnomaly     -176.937
	}
}

Comet	"C20"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            9.08496e-009
	Radius          30.4462
	InertiaMoment   0.398171

	Oblateness      0.0196464

	RotationPeriod  38.7308
	Obliquity       186.192
	EqAscendNode    94.369

	AbsMagn         15.8934
	SlopeParam      3.9615
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.700 0.666 0.627)

	Surface
	{
		SurfStyle       0.0790575
		OceanStyle      0.353432
		Randomize      (-0.595, 0.213, -0.701)
		colorDistMagn   0.928934
		colorDistFreq   0.712721
		detailScale     831.385
		colorConversion true
		snowLevel       2
		tropicLatitude  0.124059
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.310756
		terraceProb     0.387434
		erosion         0
		montesMagn      0.66645
		montesFreq      3.93233
		montesSpiky     0.982379
		montesFraction  0.142188
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.87953
		hillsFraction   0.733871
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224207
		craterFreq      0.235421
		craterDensity   0.874005
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   50.0816
		volcanoTemp     1664.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.266, 0.251, 0.000)
		colorShelf     (0.298, 0.283, 0.267, 0.000)
		colorBeach     (0.315, 0.300, 0.282, 0.000)
		colorDesert    (0.333, 0.316, 0.298, 0.000)
		colorLowland   (0.350, 0.333, 0.314, 0.000)
		colorUpland    (0.368, 0.350, 0.329, 0.000)
		colorRock      (0.385, 0.366, 0.345, 0.000)
		colorSnow      (0.403, 0.383, 0.361, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.871092
		GasToDust   0.25
		Particles   2739
		GasBright   0.349465
		DustBright  0.614515
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.29226
		Period          12.1935
		Eccentricity    0.96054
		Inclination     -179.016
		AscendingNode   19.7583
		ArgOfPericenter 43.4528
		MeanAnomaly     33.4166
	}
}

Comet	"C21"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.79733e-016
	Radius          0.0872563
	InertiaMoment   0.399859

	Oblateness      0.0166996

	RotationPeriod  36.8471
	Obliquity       139.398
	EqAscendNode    78.9464

	AbsMagn         3.2096
	SlopeParam      2.91317
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.473 0.469 0.466)

	Surface
	{
		SurfStyle       0.104347
		OceanStyle      0.722666
		Randomize      (0.735, 0.373, 0.448)
		colorDistMagn   0.981746
		colorDistFreq   5.00467e-006
		detailScale     2.38268
		colorConversion true
		snowLevel       2
		tropicLatitude  0.014994
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.534883
		terraceProb     0.291573
		erosion         0
		montesMagn      0.65524
		montesFreq      3.40797
		montesSpiky     0.925533
		montesFraction  0.505771
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.66718e-005
		hillsFraction   0.549326
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257517
		craterFreq      0.235745
		craterDensity   0.892127
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   817.958
		volcanoTemp     1704.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.187, 0.186, 0.000)
		colorShelf     (0.201, 0.199, 0.198, 0.000)
		colorBeach     (0.213, 0.211, 0.210, 0.000)
		colorDesert    (0.225, 0.223, 0.221, 0.000)
		colorLowland   (0.237, 0.234, 0.233, 0.000)
		colorUpland    (0.248, 0.246, 0.244, 0.000)
		colorRock      (0.260, 0.258, 0.256, 0.000)
		colorSnow      (0.272, 0.269, 0.268, 1.000)
		BumpHeight      0.0785307
		BumpOffset      0.0157061
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.273373
		DustBright  0.375093
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.79013
		Period          16.3745
		Eccentricity    0.987316
		Inclination     41.4079
		AscendingNode   -0.454534
		ArgOfPericenter -137.825
		MeanAnomaly     -3.04427
	}
}

Comet	"C22"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.16353e-012
	Radius          1.88567
	InertiaMoment   0.398736

	Oblateness      0.0241441

	RotationPeriod  34.9325
	Obliquity       92.6037
	EqAscendNode    63.5239

	AbsMagn         5.27353
	SlopeParam      7.04196
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.637 0.548 0.456)

	Surface
	{
		SurfStyle       0.968925
		OceanStyle      0.563898
		Randomize      (0.612, 0.934, -0.457)
		colorDistMagn   0.0385441
		colorDistFreq   0.00305376
		detailScale     51.4913
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994657
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.257738
		terraceProb     0.101012
		erosion         0
		montesMagn      0.585317
		montesFreq      2.28789
		montesSpiky     0.960824
		montesFraction  0.506514
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00959576
		hillsFraction   0.625596
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256476
		craterFreq      0.230981
		craterDensity   1.04778
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   200.997
		volcanoTemp     1739.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.192, 0.183, 0.050)
		colorShelf     (0.255, 0.225, 0.210, 0.040)
		colorBeach     (0.293, 0.258, 0.237, 0.030)
		colorDesert    (0.331, 0.291, 0.269, 0.020)
		colorLowland   (0.370, 0.324, 0.297, 0.030)
		colorUpland    (0.408, 0.356, 0.324, 0.050)
		colorRock      (0.446, 0.389, 0.361, 0.020)
		colorSnow      (0.446, 0.389, 0.361, 1.000)
		BumpHeight      1.6971
		BumpOffset      0.33942
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.422726
		GasToDust   0.25
		Particles   1833
		GasBright   0.160022
		DustBright  0.172931
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.94975
		Period          9.56538
		Eccentricity    0.947622
		Inclination     174.599
		AscendingNode   128.098
		ArgOfPericenter -61.9486
		MeanAnomaly     -43.3864
	}
}

Comet	"C23"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.67333e-008
	Radius          34.0931
	InertiaMoment   0.396812

	Oblateness      0.0205502

	RotationPeriod  32.9801
	Obliquity       45.8094
	EqAscendNode    48.1013

	AbsMagn         6.7775
	SlopeParam      5.26806
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.525 0.394 0.334)

	Surface
	{
		SurfStyle       0.0203138
		OceanStyle      0.0114386
		Randomize      (0.158, 0.097, -0.525)
		colorDistMagn   0.946789
		colorDistFreq   0.764423
		detailScale     930.968
		colorConversion true
		snowLevel       2
		tropicLatitude  0.876716
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.315499
		terraceProb     0.269367
		erosion         0
		montesMagn      0.39667
		montesFreq      2.67377
		montesSpiky     0.910468
		montesFraction  0.230465
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.99612
		hillsFraction   0.874457
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262839
		craterFreq      0.248101
		craterDensity   0.800297
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.3219
		volcanoTemp     1440.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.157, 0.134, 0.000)
		colorShelf     (0.223, 0.167, 0.142, 0.000)
		colorBeach     (0.236, 0.177, 0.150, 0.000)
		colorDesert    (0.250, 0.187, 0.159, 0.000)
		colorLowland   (0.263, 0.197, 0.167, 0.000)
		colorUpland    (0.276, 0.207, 0.175, 0.000)
		colorRock      (0.289, 0.216, 0.184, 0.000)
		colorSnow      (0.302, 0.226, 0.192, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.903918
		GasToDust   0.25
		Particles   2805
		GasBright   0.032419
		DustBright  0.785021
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.29824
		Period          12.2413
		Eccentricity    0.964707
		Inclination     56.2048
		AscendingNode   99.0076
		ArgOfPericenter -147.237
		MeanAnomaly     -18.5669
	}
}

Comet	"C24"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            5.15233e-016
	Radius          0.116788
	InertiaMoment   0.399214

	Oblateness      0.0306746

	RotationPeriod  30.9824
	Obliquity       359.015
	EqAscendNode    32.6787

	AbsMagn         8.12183
	SlopeParam      4.19115
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.593 0.586 0.584)

	Surface
	{
		SurfStyle       0.000144423
		OceanStyle      0.632513
		Randomize      (0.918, 0.598, 0.057)
		colorDistMagn   0.554998
		colorDistFreq   8.68514e-006
		detailScale     3.1891
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94735
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.401722
		terraceProb     0.304443
		erosion         0
		montesMagn      0.626903
		montesFreq      3.09352
		montesSpiky     0.901103
		montesFraction  0.72433
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.43422e-005
		hillsFraction   0.595804
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241948
		craterFreq      0.266123
		craterDensity   0.801436
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   806.683
		volcanoTemp     1557.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.235, 0.234, 0.000)
		colorShelf     (0.252, 0.249, 0.248, 0.000)
		colorBeach     (0.267, 0.264, 0.263, 0.000)
		colorDesert    (0.282, 0.278, 0.277, 0.000)
		colorLowland   (0.296, 0.293, 0.292, 0.000)
		colorUpland    (0.311, 0.308, 0.307, 0.000)
		colorRock      (0.326, 0.322, 0.321, 0.000)
		colorSnow      (0.341, 0.337, 0.336, 1.000)
		BumpHeight      0.105109
		BumpOffset      0.0210219
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0495424
		DustBright  0.452384
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.66073
		Period          7.51939
		Eccentricity    0.932775
		Inclination     -70.3427
		AscendingNode   -4.23683
		ArgOfPericenter 169.362
		MeanAnomaly     83.8352
	}
}

Comet	"C25"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.98495e-012
	Radius          2.1112
	InertiaMoment   0.39783

	Oblateness      0.0267302

	RotationPeriod  28.931
	Obliquity       312.221
	EqAscendNode    17.2561

	AbsMagn         9.48048
	SlopeParam      3.17055
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.681 0.678 0.677)

	Surface
	{
		SurfStyle       0.452745
		OceanStyle      0.537655
		Randomize      (-0.627, -0.943, 0.651)
		colorDistMagn   0.817502
		colorDistFreq   0.00310729
		detailScale     57.6498
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997231
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575281
		terraceProb     0.347325
		erosion         0
		montesMagn      0.365595
		montesFreq      3.3967
		montesSpiky     0.995831
		montesFraction  0.627772
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00664354
		hillsFraction   0.62134
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263539
		craterFreq      0.156379
		craterDensity   0.850086
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   165.815
		volcanoTemp     1725.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.271, 0.271, 0.000)
		colorShelf     (0.290, 0.288, 0.288, 0.000)
		colorBeach     (0.307, 0.305, 0.304, 0.000)
		colorDesert    (0.324, 0.322, 0.321, 0.000)
		colorLowland   (0.341, 0.339, 0.338, 0.000)
		colorUpland    (0.358, 0.356, 0.355, 0.000)
		colorRock      (0.375, 0.373, 0.372, 0.000)
		colorSnow      (0.392, 0.390, 0.389, 1.000)
		BumpHeight      1.90008
		BumpOffset      0.380016
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.455552
		GasToDust   0.25
		Particles   1900
		GasBright   0.155606
		DustBright  0.830806
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.58658
		Period          14.6158
		Eccentricity    0.969048
		Inclination     114.411
		AscendingNode   -72.4492
		ArgOfPericenter 71.4668
		MeanAnomaly     27.8631
	}
}

Comet	"C26"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.08208e-008
	Radius          45.6389
	InertiaMoment   0.399651

	Oblateness      0.0409181

	RotationPeriod  26.8156
	Obliquity       265.426
	EqAscendNode    1.8335

	AbsMagn         11.0425
	SlopeParam      8.17677
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.715 0.710 0.708)

	Surface
	{
		SurfStyle       0.973728
		OceanStyle      0.379702
		Randomize      (0.352, 0.172, -0.307)
		colorDistMagn   0.702503
		colorDistFreq   0.685723
		detailScale     1246.25
		colorConversion true
		snowLevel       2
		tropicLatitude  0.304087
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571497
		terraceProb     0.11935
		erosion         0
		montesMagn      0.446606
		montesFreq      3.08126
		montesSpiky     0.908254
		montesFraction  0.484832
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.23454
		hillsFraction   0.922215
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247796
		craterFreq      0.263333
		craterDensity   0.921307
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   40.7586
		volcanoTemp     1395.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.249, 0.283, 0.050)
		colorShelf     (0.286, 0.291, 0.326, 0.040)
		colorBeach     (0.329, 0.334, 0.368, 0.030)
		colorDesert    (0.372, 0.376, 0.418, 0.020)
		colorLowland   (0.414, 0.419, 0.460, 0.030)
		colorUpland    (0.457, 0.462, 0.503, 0.050)
		colorRock      (0.500, 0.504, 0.559, 0.020)
		colorSnow      (0.500, 0.504, 0.559, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.936744
		GasToDust   0.25
		Particles   2872
		GasBright   0.145448
		DustBright  0.525452
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.18332
		Period          11.3347
		Eccentricity    0.952479
		Inclination     76.8705
		AscendingNode   0.097429
		ArgOfPericenter -102.044
		MeanAnomaly     -40.9713
	}
}

Comet	"C27"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            9.48993e-016
	Radius          0.130733
	InertiaMoment   0.398472

	Oblateness      0.0368786

	RotationPeriod  24.6243
	Obliquity       218.632
	EqAscendNode    346.411

	AbsMagn         13.3327
	SlopeParam      5.56282
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.760 0.757 0.754)

	Surface
	{
		SurfStyle       0.922866
		OceanStyle      0.742399
		Randomize      (-0.663, -0.771, -0.937)
		colorDistMagn   0.12551
		colorDistFreq   4.26952e-006
		detailScale     3.56989
		colorConversion true
		snowLevel       2
		tropicLatitude  0.689296
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.643194
		terraceProb     0.444142
		erosion         0
		montesMagn      0.461682
		montesFreq      2.66605
		montesSpiky     0.931373
		montesFraction  0.494371
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.21896e-005
		hillsFraction   0.768769
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223183
		craterFreq      0.225578
		craterDensity   0.981004
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   665.365
		volcanoTemp     1593.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.265, 0.302, 0.050)
		colorShelf     (0.304, 0.310, 0.347, 0.040)
		colorBeach     (0.349, 0.356, 0.392, 0.030)
		colorDesert    (0.395, 0.401, 0.445, 0.020)
		colorLowland   (0.441, 0.446, 0.490, 0.030)
		colorUpland    (0.486, 0.492, 0.535, 0.050)
		colorRock      (0.532, 0.537, 0.596, 0.020)
		colorSnow      (0.532, 0.537, 0.596, 1.000)
		BumpHeight      0.11766
		BumpOffset      0.023532
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0980297
		DustBright  0.257356
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.8322
		Period          8.71349
		Eccentricity    0.966941
		Inclination     82.1441
		AscendingNode   177.177
		ArgOfPericenter -83.6936
		MeanAnomaly     -163.614
	}
}

Comet	"C28"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            7.33978e-012
	Radius          2.82666
	InertiaMoment   0.39562

	Oblateness      0.0579193

	RotationPeriod  22.3428
	Obliquity       171.838
	EqAscendNode    330.988

	AbsMagn         1.36275
	SlopeParam      4.42336
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.576 0.572 0.570)

	Surface
	{
		SurfStyle       0.322329
		OceanStyle      0.316586
		Randomize      (-0.429, 0.954, 0.373)
		colorDistMagn   0.574832
		colorDistFreq   0.00432292
		detailScale     77.1865
		colorConversion true
		snowLevel       2
		tropicLatitude  0.749215
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.265043
		terraceProb     0.378246
		erosion         0
		montesMagn      0.482396
		montesFreq      2.68726
		montesSpiky     0.902676
		montesFraction  0.758273
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0225235
		hillsFraction   0.827614
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.192594
		craterFreq      0.249359
		craterDensity   0.880628
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   163.583
		volcanoTemp     1506.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.229, 0.228, 0.000)
		colorShelf     (0.245, 0.243, 0.242, 0.000)
		colorBeach     (0.259, 0.258, 0.256, 0.000)
		colorDesert    (0.274, 0.272, 0.271, 0.000)
		colorLowland   (0.288, 0.286, 0.285, 0.000)
		colorUpland    (0.302, 0.301, 0.299, 0.000)
		colorRock      (0.317, 0.315, 0.313, 0.000)
		colorSnow      (0.331, 0.329, 0.328, 1.000)
		BumpHeight      2.54399
		BumpOffset      0.508798
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.488378
		GasToDust   0.25
		Particles   1966
		GasBright   0.281261
		DustBright  0.558611
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.11937
		Period          10.8404
		Eccentricity    0.932419
		Inclination     54.7367
		AscendingNode   38.4064
		ArgOfPericenter 87.6786
		MeanAnomaly     57.4525
	}
}

Comet	"C29"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            5.67679e-008
	Radius          51.0782
	InertiaMoment   0.398986

	Oblateness      0.0561077

	RotationPeriod  19.9532
	Obliquity       125.044
	EqAscendNode    315.566

	AbsMagn         4.34966
	SlopeParam      3.41485
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.553 0.551 0.547)

	Surface
	{
		SurfStyle       0.51059
		OceanStyle      0.291967
		Randomize      (-0.626, 0.131, -0.852)
		colorDistMagn   0.332872
		colorDistFreq   0.827578
		detailScale     1394.78
		colorConversion true
		snowLevel       2
		tropicLatitude  0.676035
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.636495
		terraceProb     0.649786
		erosion         0
		montesMagn      0.654778
		montesFreq      3.8576
		montesSpiky     0.909037
		montesFraction  0.618027
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.42926
		hillsFraction   0.576347
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251005
		craterFreq      0.212745
		craterDensity   0.876101
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   33.6117
		volcanoTemp     1192.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.187, 0.153, 0.000)
		colorShelf     (0.221, 0.193, 0.175, 0.000)
		colorBeach     (0.260, 0.226, 0.208, 0.000)
		colorDesert    (0.282, 0.242, 0.203, 0.000)
		colorLowland   (0.310, 0.259, 0.230, 0.000)
		colorUpland    (0.343, 0.314, 0.279, 0.000)
		colorRock      (0.371, 0.341, 0.301, 0.000)
		colorSnow      (0.404, 0.363, 0.318, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.96957
		GasToDust   0.25
		Particles   2938
		GasBright   0.206561
		DustBright  0.317798
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.90017
		Period          17.3527
		Eccentricity    0.971788
		Inclination     86.3171
		AscendingNode   -31.0464
		ArgOfPericenter -93.106
		MeanAnomaly     -3.38463
	}
}

Comet	"C30"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.74793e-015
	Radius          0.175071
	InertiaMoment   0.397411

	Oblateness      0.0955533

	RotationPeriod  17.4331
	Obliquity       78.2493
	EqAscendNode    300.143

	AbsMagn         6.04981
	SlopeParam      2.21471
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.462 0.455 0.451)

	Surface
	{
		SurfStyle       0.363887
		OceanStyle      0.343786
		Randomize      (-0.532, -0.731, -0.581)
		colorDistMagn   0.497588
		colorDistFreq   1.75326e-005
		detailScale     4.7806
		colorConversion true
		snowLevel       2
		tropicLatitude  0.127952
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.368478
		terraceProb     0.246557
		erosion         0
		montesMagn      0.549193
		montesFreq      2.99542
		montesSpiky     0.810965
		montesFraction  0.83276
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.05029e-005
		hillsFraction   0.591493
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247381
		craterFreq      0.235873
		craterDensity   0.916299
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   656.534
		volcanoTemp     1372.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.182, 0.180, 0.000)
		colorShelf     (0.196, 0.193, 0.192, 0.000)
		colorBeach     (0.208, 0.205, 0.203, 0.000)
		colorDesert    (0.219, 0.216, 0.214, 0.000)
		colorLowland   (0.231, 0.227, 0.225, 0.000)
		colorUpland    (0.242, 0.239, 0.237, 0.000)
		colorRock      (0.254, 0.250, 0.248, 0.000)
		colorSnow      (0.266, 0.261, 0.259, 1.000)
		BumpHeight      0.157564
		BumpOffset      0.0315127
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0400122
		GasToDust   0.25
		Particles   1060
		GasBright   0.094602
		DustBright  0.114244
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.64117
		Period          15.0809
		Eccentricity    0.9628
		Inclination     -81.3203
		AscendingNode   6.78762
		ArgOfPericenter 10.4137
		MeanAnomaly     -92.3711
	}
}

Comet	"C31"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.3519e-011
	Radius          3.16285
	InertiaMoment   0.399439

	Oblateness      0.10249

	RotationPeriod  14.7535
	Obliquity       31.455
	EqAscendNode    284.721

	AbsMagn         7.44819
	SlopeParam      5.89628
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.635 0.570 0.493)

	Surface
	{
		SurfStyle       0.539953
		OceanStyle      0.675047
		Randomize      (0.321, -0.835, -0.327)
		colorDistMagn   0.860449
		colorDistFreq   0.00855802
		detailScale     86.3669
		colorConversion true
		snowLevel       2
		tropicLatitude  0.439356
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.389253
		terraceProb     0.228279
		erosion         0
		montesMagn      0.442537
		montesFreq      2.47953
		montesSpiky     0.967993
		montesFraction  0.48586
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0195758
		hillsFraction   0.549179
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26364
		craterFreq      0.269278
		craterDensity   1.04989
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   134.869
		volcanoTemp     1611.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.194, 0.138, 0.000)
		colorShelf     (0.254, 0.200, 0.158, 0.000)
		colorBeach     (0.298, 0.234, 0.187, 0.000)
		colorDesert    (0.324, 0.251, 0.183, 0.000)
		colorLowland   (0.356, 0.268, 0.207, 0.000)
		colorUpland    (0.394, 0.325, 0.252, 0.000)
		colorRock      (0.426, 0.354, 0.271, 0.000)
		colorSnow      (0.464, 0.376, 0.286, 1.000)
		BumpHeight      2.84656
		BumpOffset      0.569313
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.521204
		GasToDust   0.25
		Particles   2032
		GasBright   0.00833473
		DustBright  0.684997
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.40848
		Period          5.87296
		Eccentricity    0.940278
		Inclination     -139.974
		AscendingNode   -136.91
		ArgOfPericenter 135.453
		MeanAnomaly     -149.154
	}
}

Comet	"C32"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.04559e-007
	Radius          68.4157
	InertiaMoment   0.398179

	Oblateness      0.206023

	RotationPeriod  11.8757
	Obliquity       344.661
	EqAscendNode    269.298

	AbsMagn         8.78041
	SlopeParam      4.66144
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.420 0.414 0.410)

	Surface
	{
		SurfStyle       0.133241
		OceanStyle      0.580857
		Randomize      (-0.366, -0.586, 0.053)
		colorDistMagn   0.857275
		colorDistFreq   2.87442
		detailScale     1868.2
		colorConversion true
		snowLevel       2
		tropicLatitude  0.938036
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.461273
		terraceProb     0.333726
		erosion         0
		montesMagn      0.54638
		montesFreq      2.92633
		montesSpiky     0.825529
		montesFraction  0.483368
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.76947
		hillsFraction   0.65719
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218203
		craterFreq      0.202834
		craterDensity   0.868913
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   33.1727
		volcanoTemp     1243.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.166, 0.164, 0.000)
		colorShelf     (0.179, 0.176, 0.174, 0.000)
		colorBeach     (0.189, 0.186, 0.185, 0.000)
		colorDesert    (0.200, 0.197, 0.195, 0.000)
		colorLowland   (0.210, 0.207, 0.205, 0.000)
		colorUpland    (0.221, 0.217, 0.215, 0.000)
		colorRock      (0.231, 0.228, 0.226, 0.000)
		colorSnow      (0.242, 0.238, 0.236, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0268503
		DustBright  0.350968
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.05025
		Period          18.717
		Eccentricity    0.986609
		Inclination     -77.3096
		AscendingNode   121.458
		ArgOfPericenter -16.6488
		MeanAnomaly     -164.202
	}
}

Comet	"C33"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.21945e-015
	Radius          0.195845
	InertiaMoment   0.399865

	Oblateness      0.249

	RotationPeriod  8.7463
	Obliquity       297.866
	EqAscendNode    253.875

	AbsMagn         10.2083
	SlopeParam      3.65068
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.672 0.557 0.417)

	Surface
	{
		SurfStyle       0.575351
		OceanStyle      0.6138
		Randomize      (0.025, 0.995, 0.880)
		colorDistMagn   0.0378824
		colorDistFreq   2.22826e-005
		detailScale     5.34788
		colorConversion true
		snowLevel       2
		tropicLatitude  0.880959
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.664892
		terraceProb     0.282742
		erosion         0
		montesMagn      0.507488
		montesFreq      2.14411
		montesSpiky     0.931032
		montesFraction  0.538829
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.92411e-005
		hillsFraction   0.701288
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258474
		craterFreq      0.262999
		craterDensity   0.817197
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   541.163
		volcanoTemp     1385.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.190, 0.117, 0.000)
		colorShelf     (0.269, 0.195, 0.133, 0.000)
		colorBeach     (0.316, 0.229, 0.158, 0.000)
		colorDesert    (0.343, 0.245, 0.154, 0.000)
		colorLowland   (0.376, 0.262, 0.175, 0.000)
		colorUpland    (0.417, 0.318, 0.213, 0.000)
		colorRock      (0.450, 0.346, 0.229, 0.000)
		colorSnow      (0.490, 0.368, 0.242, 1.000)
		BumpHeight      0.176261
		BumpOffset      0.0352522
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.072838
		GasToDust   0.25
		Particles   1126
		GasBright   0.112196
		DustBright  0.750109
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.69479
		Period          15.5425
		Eccentricity    0.968278
		Inclination     -179.559
		AscendingNode   31.5183
		ArgOfPericenter -89.6699
		MeanAnomaly     59.7513
	}
}

Comet	"C34"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.49002e-011
	Radius          4.23741
	InertiaMoment   0.398743

	Oblateness      0.249

	RotationPeriod  5.28814
	Obliquity       251.072
	EqAscendNode    238.453

	AbsMagn         12.0067
	SlopeParam      2.53397
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.583 0.577 0.574)

	Surface
	{
		SurfStyle       0.0730568
		OceanStyle      0.171681
		Randomize      (-0.988, -0.603, 0.385)
		colorDistMagn   0.682677
		colorDistFreq   0.0127516
		detailScale     115.709
		colorConversion true
		snowLevel       2
		tropicLatitude  0.968113
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539538
		terraceProb     0.476175
		erosion         0
		montesMagn      0.546713
		montesFreq      3.89611
		montesSpiky     0.999787
		montesFraction  0.8661
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.048552
		hillsFraction   0.537844
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243698
		craterFreq      0.204199
		craterDensity   0.813752
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   133.139
		volcanoTemp     1405.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.231, 0.230, 0.000)
		colorShelf     (0.248, 0.245, 0.244, 0.000)
		colorBeach     (0.262, 0.260, 0.258, 0.000)
		colorDesert    (0.277, 0.274, 0.273, 0.000)
		colorLowland   (0.292, 0.288, 0.287, 0.000)
		colorUpland    (0.306, 0.303, 0.301, 0.000)
		colorRock      (0.321, 0.317, 0.316, 0.000)
		colorSnow      (0.335, 0.332, 0.330, 1.000)
		BumpHeight      3.81366
		BumpOffset      0.762733
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.55403
		GasToDust   0.25
		Particles   2099
		GasBright   0.10343
		DustBright  0.443362
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.34744
		Period          12.6365
		Eccentricity    0.942757
		Inclination     33.4672
		AscendingNode   2.5829
		ArgOfPericenter -101.248
		MeanAnomaly     -147.131
	}
}

Comet	"C35"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.92585e-007
	Radius          76.514
	InertiaMoment   0.396831

	Oblateness      0.00110706

	RotationPeriod  140.826
	Obliquity       204.278
	EqAscendNode    223.03

	AbsMagn         15.7697
	SlopeParam      6.29315
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.462 0.457 0.452)

	Surface
	{
		SurfStyle       0.624709
		OceanStyle      0.375908
		Randomize      (0.936, -0.146, 0.331)
		colorDistMagn   0.431441
		colorDistFreq   1.89458
		detailScale     2089.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.96436
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.256583
		terraceProb     0.109524
		erosion         0
		montesMagn      0.515921
		montesFreq      3.31909
		montesSpiky     0.906823
		montesFraction  0.433886
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.6784
		hillsFraction   0.570695
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244446
		craterFreq      0.263382
		craterDensity   0.783171
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.336
		volcanoTemp     1452.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.155, 0.126, 0.000)
		colorShelf     (0.185, 0.160, 0.144, 0.000)
		colorBeach     (0.217, 0.187, 0.172, 0.000)
		colorDesert    (0.236, 0.201, 0.167, 0.000)
		colorLowland   (0.259, 0.215, 0.190, 0.000)
		colorUpland    (0.286, 0.260, 0.230, 0.000)
		colorRock      (0.309, 0.283, 0.248, 0.000)
		colorSnow      (0.337, 0.302, 0.262, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0574038
		DustBright  0.173875
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.79154
		Period          8.42502
		Eccentricity    0.935769
		Inclination     -80.8019
		AscendingNode   72.9682
		ArgOfPericenter 32.0159
		MeanAnomaly     150.591
	}
}

Comet	"C36"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            5.92984e-015
	Radius          0.26245
	InertiaMoment   0.39922

	Oblateness      0.00206587

	RotationPeriod  118.552
	Obliquity       157.484
	EqAscendNode    207.608

	AbsMagn         3.1721
	SlopeParam      4.90932
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.535 0.532 0.529)

	Surface
	{
		SurfStyle       0.45629
		OceanStyle      0.0918405
		Randomize      (-0.554, 0.294, 0.085)
		colorDistMagn   0.351705
		colorDistFreq   3.57031e-005
		detailScale     7.16664
		colorConversion true
		snowLevel       2
		tropicLatitude  0.951722
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.257017
		terraceProb     0.311515
		erosion         0
		montesMagn      0.611798
		montesFreq      3.95238
		montesSpiky     0.986181
		montesFraction  0.637168
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000126469
		hillsFraction   0.815244
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207526
		craterFreq      0.22816
		craterDensity   0.923936
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   534.356
		volcanoTemp     1657.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.213, 0.212, 0.000)
		colorShelf     (0.227, 0.226, 0.225, 0.000)
		colorBeach     (0.241, 0.240, 0.238, 0.000)
		colorDesert    (0.254, 0.253, 0.251, 0.000)
		colorLowland   (0.267, 0.266, 0.264, 0.000)
		colorUpland    (0.281, 0.279, 0.278, 0.000)
		colorRock      (0.294, 0.293, 0.291, 0.000)
		colorSnow      (0.308, 0.306, 0.304, 1.000)
		BumpHeight      0.236205
		BumpOffset      0.047241
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.105664
		GasToDust   0.25
		Particles   1193
		GasBright   0.219917
		DustBright  0.495848
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.10449
		Period          10.7264
		Eccentricity    0.960186
		Inclination     97.0567
		AscendingNode   120.603
		ArgOfPericenter 26.2122
		MeanAnomaly     3.87578
	}
}

Comet	"C37"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.58631e-011
	Radius          4.73761
	InertiaMoment   0.39784

	Oblateness      0.0018486

	RotationPeriod  109.012
	Obliquity       110.689
	EqAscendNode    192.185

	AbsMagn         5.25052
	SlopeParam      3.88174
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.407 0.403 0.396)

	Surface
	{
		SurfStyle       0.407603
		OceanStyle      0.0794912
		Randomize      (-0.867, 0.543, -0.953)
		colorDistMagn   0.637512
		colorDistFreq   0.0056899
		detailScale     129.368
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999885
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491757
		terraceProb     0.13415
		erosion         0
		montesMagn      0.462343
		montesFreq      3.21513
		montesSpiky     0.985008
		montesFraction  0.539946
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.048404
		hillsFraction   0.703788
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233247
		craterFreq      0.216826
		craterDensity   0.929102
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   109.681
		volcanoTemp     1308.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.161, 0.158, 0.000)
		colorShelf     (0.173, 0.171, 0.168, 0.000)
		colorBeach     (0.183, 0.181, 0.178, 0.000)
		colorDesert    (0.193, 0.191, 0.188, 0.000)
		colorLowland   (0.203, 0.202, 0.198, 0.000)
		colorUpland    (0.213, 0.212, 0.208, 0.000)
		colorRock      (0.224, 0.222, 0.218, 0.000)
		colorSnow      (0.234, 0.232, 0.228, 1.000)
		BumpHeight      4.26385
		BumpOffset      0.852769
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.586856
		GasToDust   0.25
		Particles   2165
		GasBright   0.146609
		DustBright  0.253642
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.44296
		Period          13.4155
		Eccentricity    0.963687
		Inclination     -134.71
		AscendingNode   110.548
		ArgOfPericenter 141.656
		MeanAnomaly     47.9111
	}
}

Comet	"C38"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.54718e-007
	Radius          102.564
	InertiaMoment   0.399656

	Oblateness      0.00276302

	RotationPeriod  102.477
	Obliquity       63.8949
	EqAscendNode    176.762

	AbsMagn         6.75841
	SlopeParam      2.81958
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.700 0.550 0.455)

	Surface
	{
		SurfStyle       0.573487
		OceanStyle      0.578677
		Randomize      (-0.281, 0.857, -0.680)
		colorDistMagn   0.691253
		colorDistFreq   2.60967
		detailScale     2800.68
		colorConversion true
		snowLevel       2
		tropicLatitude  0.859146
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.600397
		terraceProb     0.177781
		erosion         0
		montesMagn      0.379088
		montesFreq      3.14838
		montesSpiky     0.868283
		montesFraction  0.210761
		dunesFraction   0
		hillsMagn       0
		hillsFreq       32.2768
		hillsFraction   0.545122
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270097
		craterFreq      0.449909
		craterDensity   0.791408
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.9997
		volcanoTemp     1447.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.187, 0.128, 0.000)
		colorShelf     (0.280, 0.192, 0.146, 0.000)
		colorBeach     (0.329, 0.225, 0.173, 0.000)
		colorDesert    (0.357, 0.242, 0.169, 0.000)
		colorLowland   (0.392, 0.258, 0.191, 0.000)
		colorUpland    (0.434, 0.313, 0.232, 0.000)
		colorRock      (0.469, 0.341, 0.250, 0.000)
		colorSnow      (0.511, 0.363, 0.264, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.376313
		DustBright  0.508425
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.03987
		Period          10.2362
		Eccentricity    0.960731
		Inclination     -62.0059
		AscendingNode   -154.938
		ArgOfPericenter 127.432
		MeanAnomaly     19.9293
	}
}

Comet	"C39"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.0922e-014
	Radius          0.293338
	InertiaMoment   0.39848

	Oblateness      0.00231543

	RotationPeriod  97.3633
	Obliquity       17.1006
	EqAscendNode    161.34

	AbsMagn         8.10362
	SlopeParam      6.80976
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.609 0.508 0.350)

	Surface
	{
		SurfStyle       0.172341
		OceanStyle      0.720515
		Randomize      (0.725, 0.894, 0.113)
		colorDistMagn   0.944535
		colorDistFreq   6.46545e-005
		detailScale     8.01009
		colorConversion true
		snowLevel       2
		tropicLatitude  0.296958
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.350581
		terraceProb     0.129851
		erosion         0
		montesMagn      0.500092
		montesFreq      2.9685
		montesSpiky     0.914939
		montesFraction  0.407479
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000147591
		hillsFraction   0.672742
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232417
		craterFreq      0.220087
		craterDensity   0.763255
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   440.071
		volcanoTemp     1340.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.203, 0.140, 0.000)
		colorShelf     (0.259, 0.216, 0.149, 0.000)
		colorBeach     (0.274, 0.228, 0.157, 0.000)
		colorDesert    (0.289, 0.241, 0.166, 0.000)
		colorLowland   (0.304, 0.254, 0.175, 0.000)
		colorUpland    (0.320, 0.267, 0.183, 0.000)
		colorRock      (0.335, 0.279, 0.192, 0.000)
		colorSnow      (0.350, 0.292, 0.201, 1.000)
		BumpHeight      0.264004
		BumpOffset      0.0528009
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.13849
		GasToDust   0.25
		Particles   1259
		GasBright   0.275723
		DustBright  0.293502
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.04503
		Period          3.75342
		Eccentricity    0.978278
		Inclination     0.455606
		AscendingNode   -68.1786
		ArgOfPericenter 142.069
		MeanAnomaly     -173.251
	}
}

Comet	"C40"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            8.44742e-011
	Radius          6.35251
	InertiaMoment   0.395676

	Oblateness      0.00329141

	RotationPeriod  93.0879
	Obliquity       330.306
	EqAscendNode    145.917

	AbsMagn         9.46101
	SlopeParam      5.17207
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.732 0.694 0.632)

	Surface
	{
		SurfStyle       0.762203
		OceanStyle      0.87607
		Randomize      (0.277, -0.036, -0.065)
		colorDistMagn   0.313376
		colorDistFreq   0.0227012
		detailScale     173.466
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990936
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.716061
		terraceProb     0.366306
		erosion         0
		montesMagn      0.441929
		montesFreq      2.77571
		montesSpiky     0.954106
		montesFraction  0.790716
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0954082
		hillsFraction   0.559496
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229131
		craterFreq      0.185467
		craterDensity   0.965184
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   108.365
		volcanoTemp     1732.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.236, 0.177, 0.000)
		colorShelf     (0.293, 0.243, 0.202, 0.000)
		colorBeach     (0.344, 0.284, 0.240, 0.000)
		colorDesert    (0.373, 0.305, 0.234, 0.000)
		colorLowland   (0.410, 0.326, 0.265, 0.000)
		colorUpland    (0.454, 0.396, 0.322, 0.000)
		colorRock      (0.490, 0.430, 0.348, 0.000)
		colorSnow      (0.534, 0.458, 0.367, 1.000)
		BumpHeight      5.71726
		BumpOffset      1.14345
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.619682
		GasToDust   0.25
		Particles   2231
		GasBright   0.0110183
		DustBright  0.242693
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.72537
		Period          15.8078
		Eccentricity    0.966184
		Inclination     110.944
		AscendingNode   15.938
		ArgOfPericenter 123.477
		MeanAnomaly     72.6693
	}
}

Comet	"C41"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            6.53346e-007
	Radius          114.596
	InertiaMoment   0.398992

	Oblateness      0.0027444

	RotationPeriod  89.3683
	Obliquity       283.512
	EqAscendNode    130.495

	AbsMagn         11.0182
	SlopeParam      4.11122
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.539 0.497 0.420)

	Surface
	{
		SurfStyle       0.898573
		OceanStyle      0.735306
		Randomize      (0.861, -0.107, 0.875)
		colorDistMagn   0.689319
		colorDistFreq   3.67488
		detailScale     3129.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.756711
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.457244
		terraceProb     0.362798
		erosion         0
		montesMagn      0.520747
		montesFreq      2.96326
		montesSpiky     0.980932
		montesFraction  0.91875
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.6046
		hillsFraction   0.786119
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233336
		craterFreq      0.418788
		craterDensity   0.816755
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.2281
		volcanoTemp     1685.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.174, 0.168, 0.050)
		colorShelf     (0.216, 0.204, 0.193, 0.040)
		colorBeach     (0.248, 0.234, 0.218, 0.030)
		colorDesert    (0.280, 0.264, 0.248, 0.020)
		colorLowland   (0.313, 0.293, 0.273, 0.030)
		colorUpland    (0.345, 0.323, 0.298, 0.050)
		colorRock      (0.377, 0.353, 0.332, 0.020)
		colorSnow      (0.377, 0.353, 0.332, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.075646
		DustBright  0.662552
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.71845
		Period          15.7476
		Eccentricity    0.965099
		Inclination     -52.9299
		AscendingNode   131.385
		ArgOfPericenter -68.7395
		MeanAnomaly     -151.663
	}
}

Comet	"C42"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.0117e-014
	Radius          0.393457
	InertiaMoment   0.397423

	Oblateness      0.00386884

	RotationPeriod  86.0447
	Obliquity       236.718
	EqAscendNode    115.072

	AbsMagn         13.2887
	SlopeParam      3.08289
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.474 0.468 0.464)

	Surface
	{
		SurfStyle       0.0950751
		OceanStyle      0.0962917
		Randomize      (0.309, -0.801, 0.076)
		colorDistMagn   0.327293
		colorDistFreq   0.000111453
		detailScale     10.744
		colorConversion true
		snowLevel       2
		tropicLatitude  0.945956
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.339815
		terraceProb     0.572862
		erosion         0
		montesMagn      0.566332
		montesFreq      3.82161
		montesSpiky     0.89743
		montesFraction  0.376619
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000462343
		hillsFraction   0.673205
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226717
		craterFreq      0.2322
		craterDensity   0.861977
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   434.933
		volcanoTemp     1430.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.187, 0.185, 0.000)
		colorShelf     (0.202, 0.199, 0.197, 0.000)
		colorBeach     (0.213, 0.211, 0.209, 0.000)
		colorDesert    (0.225, 0.222, 0.220, 0.000)
		colorLowland   (0.237, 0.234, 0.232, 0.000)
		colorUpland    (0.249, 0.246, 0.243, 0.000)
		colorRock      (0.261, 0.258, 0.255, 0.000)
		colorSnow      (0.273, 0.269, 0.267, 1.000)
		BumpHeight      0.354111
		BumpOffset      0.0708222
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.171316
		GasToDust   0.25
		Particles   1325
		GasBright   0.0682716
		DustBright  0.354413
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.8925
		Period          9.14715
		Eccentricity    0.953393
		Inclination     64.8413
		AscendingNode   -42.5323
		ArgOfPericenter 154.547
		MeanAnomaly     111.219
	}
}

Comet	"C43"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.5559e-010
	Radius          7.09507
	InertiaMoment   0.399444

	Oblateness      0.00317499

	RotationPeriod  83.0173
	Obliquity       189.923
	EqAscendNode    99.6495

	AbsMagn         1.28953
	SlopeParam      7.64268
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.570 0.387 0.309)

	Surface
	{
		SurfStyle       0.363544
		OceanStyle      0.751625
		Randomize      (-0.932, -0.562, 0.598)
		colorDistMagn   0.944202
		colorDistFreq   0.00832669
		detailScale     193.743
		colorConversion true
		snowLevel       2
		tropicLatitude  0.87158
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545778
		terraceProb     0.270772
		erosion         0
		montesMagn      0.40133
		montesFreq      2.02792
		montesSpiky     0.94891
		montesFraction  0.477465
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.175024
		hillsFraction   0.56266
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245814
		craterFreq      0.211157
		craterDensity   1.03281
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   89.1808
		volcanoTemp     1985.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.155, 0.124, 0.000)
		colorShelf     (0.242, 0.165, 0.131, 0.000)
		colorBeach     (0.257, 0.174, 0.139, 0.000)
		colorDesert    (0.271, 0.184, 0.147, 0.000)
		colorLowland   (0.285, 0.194, 0.155, 0.000)
		colorUpland    (0.299, 0.203, 0.162, 0.000)
		colorRock      (0.314, 0.213, 0.170, 0.000)
		colorSnow      (0.328, 0.223, 0.178, 1.000)
		BumpHeight      6.38557
		BumpOffset      1.27711
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.652508
		GasToDust   0.25
		Particles   2297
		GasBright   0.20009
		DustBright  0.707081
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.74336
		Period          25.4464
		Eccentricity    0.976573
		Inclination     68.5375
		AscendingNode   -144.051
		ArgOfPericenter -31.5588
		MeanAnomaly     -161.699
	}
}

Comet	"C44"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.79075e-018
	Radius          0.0243698
	InertiaMoment   0.398187

	Oblateness      0.00445386

	RotationPeriod  80.2193
	Obliquity       143.129
	EqAscendNode    84.2269

	AbsMagn         4.32197
	SlopeParam      5.45685
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.802 0.742 0.658)

	Surface
	{
		SurfStyle       0.290126
		OceanStyle      0.213226
		Randomize      (-0.800, -0.045, -0.191)
		colorDistMagn   0.677807
		colorDistFreq   1.55745e-007
		detailScale     0.665457
		colorConversion true
		snowLevel       2
		tropicLatitude  0.674472
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399811
		terraceProb     0.177922
		erosion         0
		montesMagn      0.440817
		montesFreq      3.02139
		montesSpiky     0.944502
		montesFraction  0.333335
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.12595e-006
		hillsFraction   0.452503
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222505
		craterFreq      0.14693
		craterDensity   0.813941
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1745.64
		volcanoTemp     1521.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.297, 0.263, 0.000)
		colorShelf     (0.341, 0.315, 0.279, 0.000)
		colorBeach     (0.361, 0.334, 0.296, 0.000)
		colorDesert    (0.381, 0.352, 0.312, 0.000)
		colorLowland   (0.401, 0.371, 0.329, 0.000)
		colorUpland    (0.421, 0.389, 0.345, 0.000)
		colorRock      (0.441, 0.408, 0.362, 0.000)
		colorSnow      (0.461, 0.427, 0.378, 1.000)
		BumpHeight      0.0219328
		BumpOffset      0.00438656
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.165433
		DustBright  0.426224
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.31976
		Period          12.4136
		Eccentricity    0.94912
		Inclination     -160.469
		AscendingNode   94.4767
		ArgOfPericenter 32.242
		MeanAnomaly     -58.3633
	}
}

Comet	"C45"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.7053e-014
	Radius          0.439274
	InertiaMoment   0.39987

	Oblateness      0.00362664

	RotationPeriod  77.6035
	Obliquity       96.3348
	EqAscendNode    68.8043

	AbsMagn         6.02928
	SlopeParam      4.34219
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.748 0.747 0.745)

	Surface
	{
		SurfStyle       0.543341
		OceanStyle      0.592862
		Randomize      (0.098, -0.838, 0.802)
		colorDistMagn   0.285514
		colorDistFreq   9.23577e-005
		detailScale     11.9951
		colorConversion true
		snowLevel       2
		tropicLatitude  0.927677
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.529618
		terraceProb     0.304713
		erosion         0
		montesMagn      0.553948
		montesFreq      3.10109
		montesSpiky     0.91574
		montesFraction  0.431512
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000423247
		hillsFraction   0.710424
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207856
		craterFreq      0.189716
		craterDensity   0.924913
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   357.791
		volcanoTemp     1604.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.254, 0.209, 0.000)
		colorShelf     (0.299, 0.261, 0.238, 0.000)
		colorBeach     (0.351, 0.306, 0.283, 0.000)
		colorDesert    (0.381, 0.329, 0.276, 0.000)
		colorLowland   (0.419, 0.351, 0.313, 0.000)
		colorUpland    (0.464, 0.426, 0.380, 0.000)
		colorRock      (0.501, 0.463, 0.410, 0.000)
		colorSnow      (0.546, 0.493, 0.432, 1.000)
		BumpHeight      0.395346
		BumpOffset      0.0790692
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.204142
		GasToDust   0.25
		Particles   1392
		GasBright   0.0935176
		DustBright  0.182627
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.77169
		Period          16.2125
		Eccentricity    0.97125
		Inclination     -17.8202
		AscendingNode   151.912
		ArgOfPericenter 152.54
		MeanAnomaly     147.371
	}
}

Comet	"C46"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.86578e-010
	Radius          9.52372
	InertiaMoment   0.398749

	Oblateness      0.00507629

	RotationPeriod  75.1354
	Obliquity       49.5405
	EqAscendNode    53.3817

	AbsMagn         7.42981
	SlopeParam      3.33114
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.426 0.420 0.417)

	Surface
	{
		SurfStyle       0.974306
		OceanStyle      0.0772126
		Randomize      (0.885, 0.597, 0.859)
		colorDistMagn   0.972962
		colorDistFreq   0.0451004
		detailScale     260.061
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982851
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.651864
		terraceProb     0.310056
		erosion         0
		montesMagn      0.433283
		montesFreq      2.86762
		montesSpiky     0.983579
		montesFraction  0.317414
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.254489
		hillsFraction   0.628637
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.284005
		craterFreq      0.164927
		craterDensity   1.02246
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   88.2046
		volcanoTemp     1465.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.145, 0.147, 0.167, 0.050)
		colorShelf     (0.170, 0.172, 0.192, 0.040)
		colorBeach     (0.196, 0.197, 0.217, 0.030)
		colorDesert    (0.222, 0.223, 0.246, 0.020)
		colorLowland   (0.247, 0.248, 0.271, 0.030)
		colorUpland    (0.273, 0.273, 0.296, 0.050)
		colorRock      (0.298, 0.298, 0.329, 0.020)
		colorSnow      (0.298, 0.298, 0.329, 1.000)
		BumpHeight      8.57135
		BumpOffset      1.71427
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.685334
		GasToDust   0.25
		Particles   2364
		GasBright   0.302503
		DustBright  0.458128
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.82299
		Period          8.64787
		Eccentricity    0.939952
		Inclination     -105.089
		AscendingNode   91.2069
		ArgOfPericenter -115.675
		MeanAnomaly     48.8713
	}
}

Comet	"C47"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            8.82397e-018
	Radius          0.0271958
	InertiaMoment   0.396849

	Oblateness      0.00406141

	RotationPeriod  72.7888
	Obliquity       2.74623
	EqAscendNode    37.9591

	AbsMagn         8.76187
	SlopeParam      2.09268
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.516 0.465 0.420)

	Surface
	{
		SurfStyle       0.727648
		OceanStyle      0.893883
		Randomize      (0.347, 0.834, 0.901)
		colorDistMagn   0.398237
		colorDistFreq   4.11055e-007
		detailScale     0.742626
		colorConversion true
		snowLevel       2
		tropicLatitude  0.917754
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.273148
		terraceProb     0.164546
		erosion         0
		montesMagn      0.348214
		montesFreq      2.44346
		montesSpiky     0.990485
		montesFraction  0.845501
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.58199e-006
		hillsFraction   0.575259
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231007
		craterFreq      0.199551
		craterDensity   0.90967
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1435.41
		volcanoTemp     1654.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.158, 0.117, 0.000)
		colorShelf     (0.206, 0.163, 0.134, 0.000)
		colorBeach     (0.243, 0.191, 0.159, 0.000)
		colorDesert    (0.263, 0.204, 0.155, 0.000)
		colorLowland   (0.289, 0.218, 0.176, 0.000)
		colorUpland    (0.320, 0.265, 0.214, 0.000)
		colorRock      (0.346, 0.288, 0.231, 0.000)
		colorSnow      (0.377, 0.307, 0.243, 1.000)
		BumpHeight      0.0244762
		BumpOffset      0.00489524
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.203305
		DustBright  0.241812
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.26666
		Period          11.9898
		Eccentricity    0.962652
		Inclination     -115.372
		AscendingNode   -44.5596
		ArgOfPericenter -106.779
		MeanAnomaly     154.578
	}
}

Comet	"C48"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            6.82471e-014
	Radius          0.589881
	InertiaMoment   0.399226

	Oblateness      0.0057562

	RotationPeriod  70.543
	Obliquity       315.952
	EqAscendNode    22.5365

	AbsMagn         10.1871
	SlopeParam      5.77485
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.453 0.450 0.447)

	Surface
	{
		SurfStyle       0.131427
		OceanStyle      0.944303
		Randomize      (0.275, 0.942, -0.575)
		colorDistMagn   0.334563
		colorDistFreq   0.000117268
		detailScale     16.1077
		colorConversion true
		snowLevel       2
		tropicLatitude  0.840126
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.558826
		terraceProb     0.528288
		erosion         0
		montesMagn      0.506237
		montesFreq      3.50426
		montesSpiky     0.904189
		montesFraction  0.398435
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000650549
		hillsFraction   0.674369
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256089
		craterFreq      0.21314
		craterDensity   0.905041
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   354.02
		volcanoTemp     1788.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.180, 0.179, 0.000)
		colorShelf     (0.192, 0.191, 0.190, 0.000)
		colorBeach     (0.204, 0.203, 0.201, 0.000)
		colorDesert    (0.215, 0.214, 0.212, 0.000)
		colorLowland   (0.226, 0.225, 0.224, 0.000)
		colorUpland    (0.238, 0.236, 0.235, 0.000)
		colorRock      (0.249, 0.248, 0.246, 0.000)
		colorSnow      (0.260, 0.259, 0.257, 1.000)
		BumpHeight      0.530892
		BumpOffset      0.106178
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.236968
		GasToDust   0.25
		Particles   1458
		GasBright   0.014679
		DustBright  0.914925
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.59396
		Period          23.9383
		Eccentricity    0.975664
		Inclination     152.568
		AscendingNode   72.645
		ArgOfPericenter -168.011
		MeanAnomaly     -78.7868
	}
}

Comet	"C49"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            5.27841e-010
	Radius          10.6232
	InertiaMoment   0.397849

	Oblateness      0.00460227

	RotationPeriod  68.3818
	Obliquity       269.158
	EqAscendNode    7.11392

	AbsMagn         11.9768
	SlopeParam      4.57783
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.713 0.709 0.707)

	Surface
	{
		SurfStyle       0.61034
		OceanStyle      0.676306
		Randomize      (0.027, 0.796, 0.016)
		colorDistMagn   0.732602
		colorDistFreq   0.0272561
		detailScale     290.084
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985899
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584964
		terraceProb     0.142773
		erosion         0
		montesMagn      0.555462
		montesFreq      2.82828
		montesSpiky     0.993666
		montesFraction  0.579878
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.307867
		hillsFraction   0.603463
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225324
		craterFreq      0.19306
		craterDensity   0.927723
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   72.4951
		volcanoTemp     1415.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.241, 0.198, 0.000)
		colorShelf     (0.285, 0.248, 0.226, 0.000)
		colorBeach     (0.335, 0.291, 0.269, 0.000)
		colorDesert    (0.364, 0.312, 0.262, 0.000)
		colorLowland   (0.399, 0.333, 0.297, 0.000)
		colorUpland    (0.442, 0.404, 0.360, 0.000)
		colorRock      (0.478, 0.440, 0.389, 0.000)
		colorSnow      (0.521, 0.468, 0.410, 1.000)
		BumpHeight      9.56086
		BumpOffset      1.91217
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.71816
		GasToDust   0.25
		Particles   2430
		GasBright   0.045956
		DustBright  0.568134
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.06512
		Period          18.854
		Eccentricity    0.96551
		Inclination     9.7142
		AscendingNode   -154.952
		ArgOfPericenter 94.3996
		MeanAnomaly     -67.0401
	}
}

Comet	"C50"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.62526e-017
	Radius          0.0365361
	InertiaMoment   0.399662

	Oblateness      0.00651436

	RotationPeriod  66.2917
	Obliquity       222.363
	EqAscendNode    351.691

	AbsMagn         15.653
	SlopeParam      3.56945
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.686 0.684 0.682)

	Surface
	{
		SurfStyle       0.211195
		OceanStyle      0.904344
		Randomize      (0.959, 0.366, -0.582)
		colorDistMagn   0.453706
		colorDistFreq   5.73167e-007
		detailScale     0.997679
		colorConversion true
		snowLevel       2
		tropicLatitude  0.74602
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.56042
		terraceProb     0.553971
		erosion         0
		montesMagn      0.64128
		montesFreq      2.63641
		montesSpiky     0.965331
		montesFraction  0.946104
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.84021e-006
		hillsFraction   0.42307
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.28477
		craterFreq      0.246536
		craterDensity   0.955358
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1420.91
		volcanoTemp     1511.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.274, 0.273, 0.000)
		colorShelf     (0.291, 0.291, 0.290, 0.000)
		colorBeach     (0.308, 0.308, 0.307, 0.000)
		colorDesert    (0.326, 0.325, 0.324, 0.000)
		colorLowland   (0.343, 0.342, 0.341, 0.000)
		colorUpland    (0.360, 0.359, 0.358, 0.000)
		colorRock      (0.377, 0.376, 0.375, 0.000)
		colorSnow      (0.394, 0.394, 0.392, 1.000)
		BumpHeight      0.0328825
		BumpOffset      0.0065765
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0399738
		DustBright  0.258603
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.83429
		Period          16.7648
		Eccentricity    0.974072
		Inclination     49.9235
		AscendingNode   -111.65
		ArgOfPericenter 139.624
		MeanAnomaly     -2.75196
	}
}

Comet	"C51"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.25702e-013
	Radius          0.657648
	InertiaMoment   0.398487

	Oblateness      0.00520436

	RotationPeriod  64.2615
	Obliquity       175.569
	EqAscendNode    336.269

	AbsMagn         3.13417
	SlopeParam      2.42763
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.798 0.748 0.671)

	Surface
	{
		SurfStyle       0.0411198
		OceanStyle      0.228049
		Randomize      (-0.921, -0.211, 0.427)
		colorDistMagn   0.836536
		colorDistFreq   0.000293262
		detailScale     17.9582
		colorConversion true
		snowLevel       2
		tropicLatitude  0.368138
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615248
		terraceProb     0.181703
		erosion         0
		montesMagn      0.483952
		montesFreq      3.39426
		montesSpiky     0.980476
		montesFraction  0.67131
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000676965
		hillsFraction   0.582963
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215996
		craterFreq      0.272107
		craterDensity   0.926649
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   290.823
		volcanoTemp     1289.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.299, 0.269, 0.000)
		colorShelf     (0.339, 0.318, 0.285, 0.000)
		colorBeach     (0.359, 0.336, 0.302, 0.000)
		colorDesert    (0.379, 0.355, 0.319, 0.000)
		colorLowland   (0.399, 0.374, 0.336, 0.000)
		colorUpland    (0.419, 0.393, 0.353, 0.000)
		colorRock      (0.439, 0.411, 0.369, 0.000)
		colorSnow      (0.459, 0.430, 0.386, 1.000)
		BumpHeight      0.591883
		BumpOffset      0.118377
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.269794
		GasToDust   0.25
		Particles   1524
		GasBright   0.151074
		DustBright  0.63199
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.86863
		Period          17.0704
		Eccentricity    0.967313
		Inclination     18.8584
		AscendingNode   -123.328
		ArgOfPericenter -149.745
		MeanAnomaly     137.764
	}
}

Comet	"C52"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            9.72216e-010
	Radius          14.2785
	InertiaMoment   0.395729

	Oblateness      0.0072561

	RotationPeriod  62.2818
	Obliquity       128.775
	EqAscendNode    320.846

	AbsMagn         5.22742
	SlopeParam      6.14565
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.688 0.687 0.684)

	Surface
	{
		SurfStyle       0.27932
		OceanStyle      0.835439
		Randomize      (0.802, -0.228, -0.689)
		colorDistMagn   0.972267
		colorDistFreq   0.0884259
		detailScale     389.898
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992641
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.485319
		terraceProb     0.156773
		erosion         0
		montesMagn      0.403654
		montesFreq      2.9534
		montesSpiky     0.913473
		montesFraction  0.307926
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.568764
		hillsFraction   0.571401
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232281
		craterFreq      0.229419
		craterDensity   0.772645
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   71.7971
		volcanoTemp     1283.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.275, 0.273, 0.000)
		colorShelf     (0.293, 0.292, 0.291, 0.000)
		colorBeach     (0.310, 0.309, 0.308, 0.000)
		colorDesert    (0.327, 0.326, 0.325, 0.000)
		colorLowland   (0.344, 0.343, 0.342, 0.000)
		colorUpland    (0.361, 0.361, 0.359, 0.000)
		colorRock      (0.379, 0.378, 0.376, 0.000)
		colorSnow      (0.396, 0.395, 0.393, 1.000)
		BumpHeight      12.8507
		BumpOffset      2.57013
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.750986
		GasToDust   0.25
		Particles   2496
		GasBright   0.117809
		DustBright  0.349741
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.11708
		Period          10.8228
		Eccentricity    0.958287
		Inclination     -33.1275
		AscendingNode   18.7835
		ArgOfPericenter 37.0815
		MeanAnomaly     35.3104
	}
}

Comet	"C53"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.99353e-017
	Radius          0.0407116
	InertiaMoment   0.398998

	Oblateness      0.00589062

	RotationPeriod  60.3444
	Obliquity       81.9804
	EqAscendNode    305.424

	AbsMagn         6.73929
	SlopeParam      4.8218
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.538 0.472 0.389)

	Surface
	{
		SurfStyle       0.147758
		OceanStyle      0.449382
		Randomize      (0.051, 0.502, -0.275)
		colorDistMagn   0.674351
		colorDistFreq   1.30405e-006
		detailScale     1.1117
		colorConversion true
		snowLevel       2
		tropicLatitude  0.826733
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431865
		terraceProb     0.371335
		erosion         0
		montesMagn      0.610796
		montesFreq      3.03151
		montesSpiky     0.982386
		montesFraction  0.225735
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.04166e-006
		hillsFraction   0.820319
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25326
		craterFreq      0.253361
		craterDensity   0.907796
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1166.63
		volcanoTemp     1471.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.189, 0.156, 0.000)
		colorShelf     (0.229, 0.200, 0.165, 0.000)
		colorBeach     (0.242, 0.212, 0.175, 0.000)
		colorDesert    (0.256, 0.224, 0.185, 0.000)
		colorLowland   (0.269, 0.236, 0.195, 0.000)
		colorUpland    (0.283, 0.248, 0.204, 0.000)
		colorRock      (0.296, 0.259, 0.214, 0.000)
		colorSnow      (0.310, 0.271, 0.224, 1.000)
		BumpHeight      0.0366404
		BumpOffset      0.00732809
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.296099
		DustBright  0.655937
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.88604
		Period          17.2261
		Eccentricity    0.972218
		Inclination     123.963
		AscendingNode   141.253
		ArgOfPericenter 93.7509
		MeanAnomaly     117.149
	}
}

Comet	"C54"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.31528e-013
	Radius          0.884392
	InertiaMoment   0.397435

	Oblateness      0.00827556

	RotationPeriod  58.4422
	Obliquity       35.1861
	EqAscendNode    290.001

	AbsMagn         8.08541
	SlopeParam      3.80179
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.752 0.749 0.745)

	Surface
	{
		SurfStyle       0.56237
		OceanStyle      0.669579
		Randomize      (0.136, -0.964, -0.536)
		colorDistMagn   0.760798
		colorDistFreq   0.000588215
		detailScale     24.1498
		colorConversion true
		snowLevel       2
		tropicLatitude  0.529302
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.69235
		terraceProb     0.124401
		erosion         0
		montesMagn      0.60623
		montesFreq      2.75352
		montesSpiky     0.981982
		montesFraction  0.746563
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00220499
		hillsFraction   0.696442
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241458
		craterFreq      0.198164
		craterDensity   0.853362
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   288.17
		volcanoTemp     1471.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.255, 0.209, 0.000)
		colorShelf     (0.301, 0.262, 0.239, 0.000)
		colorBeach     (0.353, 0.307, 0.283, 0.000)
		colorDesert    (0.383, 0.329, 0.276, 0.000)
		colorLowland   (0.421, 0.352, 0.313, 0.000)
		colorUpland    (0.466, 0.427, 0.380, 0.000)
		colorRock      (0.504, 0.464, 0.410, 0.000)
		colorSnow      (0.549, 0.494, 0.432, 1.000)
		BumpHeight      0.795952
		BumpOffset      0.159191
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.30262
		GasToDust   0.25
		Particles   1591
		GasBright   0.235553
		DustBright  0.40097
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.24102
		Period          11.787
		Eccentricity    0.931006
		Inclination     64.9224
		AscendingNode   164.133
		ArgOfPericenter -105.562
		MeanAnomaly     25.4364
	}
}

Comet	"C55"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.7907e-009
	Radius          15.9011
	InertiaMoment   0.39945

	Oblateness      0.00668814

	RotationPeriod  56.5686
	Obliquity       348.392
	EqAscendNode    274.578

	AbsMagn         9.44156
	SlopeParam      2.72334
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.671 0.557 0.471)

	Surface
	{
		SurfStyle       0.727037
		OceanStyle      0.777925
		Randomize      (0.421, 0.321, -0.977)
		colorDistMagn   0.652368
		colorDistFreq   0.144137
		detailScale     434.206
		colorConversion true
		snowLevel       2
		tropicLatitude  0.366612
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.516546
		terraceProb     0.352659
		erosion         0
		montesMagn      0.3372
		montesFreq      3.26986
		montesSpiky     0.95383
		montesFraction  0.407546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.341664
		hillsFraction   0.667512
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240569
		craterFreq      0.202887
		craterDensity   1.04112
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   58.9143
		volcanoTemp     1280.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.189, 0.132, 0.000)
		colorShelf     (0.268, 0.195, 0.151, 0.000)
		colorBeach     (0.315, 0.228, 0.179, 0.000)
		colorDesert    (0.342, 0.245, 0.174, 0.000)
		colorLowland   (0.376, 0.262, 0.198, 0.000)
		colorUpland    (0.416, 0.317, 0.240, 0.000)
		colorRock      (0.450, 0.345, 0.259, 0.000)
		colorSnow      (0.490, 0.367, 0.273, 1.000)
		BumpHeight      14.311
		BumpOffset      2.86219
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.783812
		GasToDust   0.25
		Particles   2563
		GasBright   0.137748
		DustBright  0.183262
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.74627
		Period          15.99
		Eccentricity    0.985025
		Inclination     -17.1971
		AscendingNode   84.8113
		ArgOfPericenter 157.646
		MeanAnomaly     5.39206
	}
}

Comet	"C56"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            5.51371e-017
	Radius          0.0547782
	InertiaMoment   0.398195

	Oblateness      0.00944659

	RotationPeriod  54.7181
	Obliquity       301.598
	EqAscendNode    259.156

	AbsMagn         10.9941
	SlopeParam      6.61026
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.664 0.662 0.660)

	Surface
	{
		SurfStyle       0.0974276
		OceanStyle      0.888035
		Randomize      (-0.061, 0.193, -0.830)
		colorDistMagn   0.998734
		colorDistFreq   2.13434e-006
		detailScale     1.49581
		colorConversion true
		snowLevel       2
		tropicLatitude  0.35647
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.442109
		terraceProb     0.452198
		erosion         0
		montesMagn      0.310971
		montesFreq      3.36145
		montesSpiky     0.962445
		montesFraction  0.663468
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.62306e-006
		hillsFraction   0.757951
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234763
		craterFreq      0.200757
		craterDensity   0.878666
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1156.62
		volcanoTemp     1680.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.265, 0.264, 0.000)
		colorShelf     (0.282, 0.281, 0.280, 0.000)
		colorBeach     (0.299, 0.298, 0.297, 0.000)
		colorDesert    (0.316, 0.314, 0.313, 0.000)
		colorLowland   (0.332, 0.331, 0.330, 0.000)
		colorUpland    (0.349, 0.347, 0.346, 0.000)
		colorRock      (0.365, 0.364, 0.363, 0.000)
		colorSnow      (0.382, 0.380, 0.379, 1.000)
		BumpHeight      0.0493004
		BumpOffset      0.00986008
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.393205
		DustBright  0.412291
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.92
		Period          17.531
		Eccentricity    0.967164
		Inclination     138.836
		AscendingNode   -164.353
		ArgOfPericenter -90.7349
		MeanAnomaly     43.8168
	}
}

Comet	"C57"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.26445e-013
	Radius          0.984276
	InertiaMoment   0.399875

	Oblateness      0.00763335

	RotationPeriod  52.8851
	Obliquity       254.803
	EqAscendNode    243.733

	AbsMagn         13.2454
	SlopeParam      5.0787
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.735 0.732 0.731)

	Surface
	{
		SurfStyle       0.217491
		OceanStyle      0.700498
		Randomize      (-0.281, -0.697, 0.084)
		colorDistMagn   0.440345
		colorDistFreq   0.000371396
		detailScale     26.8773
		colorConversion true
		snowLevel       2
		tropicLatitude  0.491576
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479113
		terraceProb     0.193677
		erosion         0
		montesMagn      0.371057
		montesFreq      2.96994
		montesSpiky     0.97248
		montesFraction  0.875574
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00206303
		hillsFraction   0.67524
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.283857
		craterFreq      0.201291
		craterDensity   0.7328
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   236.315
		volcanoTemp     1729.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.293, 0.292, 0.000)
		colorShelf     (0.312, 0.311, 0.311, 0.000)
		colorBeach     (0.331, 0.330, 0.329, 0.000)
		colorDesert    (0.349, 0.348, 0.347, 0.000)
		colorLowland   (0.368, 0.366, 0.366, 0.000)
		colorUpland    (0.386, 0.384, 0.384, 0.000)
		colorRock      (0.404, 0.403, 0.402, 0.000)
		colorSnow      (0.423, 0.421, 0.420, 1.000)
		BumpHeight      0.885849
		BumpOffset      0.17717
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.335446
		GasToDust   0.25
		Particles   1657
		GasBright   0.0231262
		DustBright  0.466857
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.91548
		Period          17.4903
		Eccentricity    0.96576
		Inclination     46.9129
		AscendingNode   -168.974
		ArgOfPericenter -151.986
		MeanAnomaly     -41.4131
	}
}

Comet	"C58"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.29825e-009
	Radius          21.4078
	InertiaMoment   0.398755

	Oblateness      0.0108458

	RotationPeriod  51.0646
	Obliquity       208.009
	EqAscendNode    228.311

	AbsMagn         1.21398
	SlopeParam      4.03148
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.530 0.386 0.300)

	Surface
	{
		SurfStyle       0.748405
		OceanStyle      0.837921
		Randomize      (-0.014, 0.892, 0.113)
		colorDistMagn   0.0384732
		colorDistFreq   0.16512
		detailScale     584.576
		colorConversion true
		snowLevel       2
		tropicLatitude  0.981906
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.701152
		terraceProb     0.167259
		erosion         0
		montesMagn      0.601145
		montesFreq      3.09607
		montesSpiky     0.927174
		montesFraction  0.544022
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.897188
		hillsFraction   0.683016
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264468
		craterFreq      0.252898
		craterDensity   0.888636
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   58.4436
		volcanoTemp     1759.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.131, 0.084, 0.000)
		colorShelf     (0.212, 0.135, 0.096, 0.000)
		colorBeach     (0.249, 0.158, 0.114, 0.000)
		colorDesert    (0.270, 0.170, 0.111, 0.000)
		colorLowland   (0.297, 0.181, 0.126, 0.000)
		colorUpland    (0.329, 0.220, 0.153, 0.000)
		colorRock      (0.355, 0.239, 0.165, 0.000)
		colorSnow      (0.387, 0.255, 0.174, 1.000)
		BumpHeight      19.267
		BumpOffset      3.85341
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.816638
		GasToDust   0.25
		Particles   2629
		GasBright   0.103531
		DustBright  0.870939
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.15953
		Period          11.1499
		Eccentricity    0.961945
		Inclination     120.769
		AscendingNode   -130.545
		ArgOfPericenter -13.6088
		MeanAnomaly     129.75
	}
}

Comet	"C59"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.01555e-016
	Radius          0.060924
	InertiaMoment   0.396867

	Oblateness      0.00866577

	RotationPeriod  49.252
	Obliquity       161.215
	EqAscendNode    212.888

	AbsMagn         4.2941
	SlopeParam      2.99342
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.515 0.511 0.509)

	Surface
	{
		SurfStyle       0.771163
		OceanStyle      0.013105
		Randomize      (-0.058, -0.699, 0.650)
		colorDistMagn   0.802006
		colorDistFreq   1.75124e-006
		detailScale     1.66363
		colorConversion true
		snowLevel       2
		tropicLatitude  0.651548
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535131
		terraceProb     0.213097
		erosion         0
		montesMagn      0.499066
		montesFreq      2.48343
		montesSpiky     0.90869
		montesFraction  0.283402
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.02007e-006
		hillsFraction   0.57235
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2262
		craterFreq      0.184619
		craterDensity   0.843158
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   947.857
		volcanoTemp     1684.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.174, 0.142, 0.000)
		colorShelf     (0.206, 0.179, 0.163, 0.000)
		colorBeach     (0.242, 0.210, 0.193, 0.000)
		colorDesert    (0.263, 0.225, 0.188, 0.000)
		colorLowland   (0.289, 0.240, 0.214, 0.000)
		colorUpland    (0.320, 0.292, 0.259, 0.000)
		colorRock      (0.345, 0.317, 0.280, 0.000)
		colorSnow      (0.376, 0.338, 0.295, 1.000)
		BumpHeight      0.0548316
		BumpOffset      0.0109663
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.108918
		DustBright  0.550038
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.21859
		Period          11.6104
		Eccentricity    0.960502
		Inclination     -38.0177
		AscendingNode   -93.6866
		ArgOfPericenter -169.744
		MeanAnomaly     132.85
	}
}

Comet	"C60"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            7.85458e-013
	Radius          1.32598
	InertiaMoment   0.399231

	Oblateness      0.0125603

	RotationPeriod  47.4426
	Obliquity       114.42
	EqAscendNode    197.465

	AbsMagn         6.0087
	SlopeParam      7.28635
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.811 0.772 0.709)

	Surface
	{
		SurfStyle       0.910423
		OceanStyle      0.735792
		Randomize      (-0.535, 0.429, 0.346)
		colorDistMagn   0.697607
		colorDistFreq   0.000837581
		detailScale     36.2082
		colorConversion true
		snowLevel       2
		tropicLatitude  0.676047
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.416204
		terraceProb     0.144027
		erosion         0
		montesMagn      0.20323
		montesFreq      3.07814
		montesSpiky     0.976825
		montesFraction  0.534513
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00337299
		hillsFraction   0.518721
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232061
		craterFreq      0.269178
		craterDensity   0.906833
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   234.576
		volcanoTemp     1559.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.270, 0.283, 0.050)
		colorShelf     (0.324, 0.317, 0.326, 0.040)
		colorBeach     (0.373, 0.363, 0.369, 0.030)
		colorDesert    (0.422, 0.409, 0.418, 0.020)
		colorLowland   (0.470, 0.455, 0.461, 0.030)
		colorUpland    (0.519, 0.502, 0.503, 0.050)
		colorRock      (0.567, 0.548, 0.560, 0.020)
		colorSnow      (0.567, 0.548, 0.560, 1.000)
		BumpHeight      1.19339
		BumpOffset      0.238677
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.368271
		GasToDust   0.25
		Particles   1723
		GasBright   0.0770458
		DustBright  0.266397
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.5936
		Period          14.6754
		Eccentricity    0.965447
		Inclination     156.917
		AscendingNode   -177.097
		ArgOfPericenter 90.1691
		MeanAnomaly     -174.903
	}
}

Comet	"C61"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            6.07495e-009
	Radius          23.7924
	InertiaMoment   0.397859

	Oblateness      0.0100889

	RotationPeriod  45.6318
	Obliquity       67.6261
	EqAscendNode    182.043

	AbsMagn         7.41141
	SlopeParam      5.35483
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.704 0.701 0.699)

	Surface
	{
		SurfStyle       0.997253
		OceanStyle      0.213928
		Randomize      (0.830, 0.756, -0.822)
		colorDistMagn   0.392345
		colorDistFreq   0.342466
		detailScale     649.691
		colorConversion true
		snowLevel       2
		tropicLatitude  0.946997
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.658469
		terraceProb     0.284265
		erosion         0
		montesMagn      0.575569
		montesFreq      2.22424
		montesSpiky     0.977064
		montesFraction  0.729665
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.37335
		hillsFraction   0.709763
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237593
		craterFreq      0.202272
		craterDensity   0.890794
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.86
		volcanoTemp     1589.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.245, 0.280, 0.050)
		colorShelf     (0.282, 0.287, 0.322, 0.040)
		colorBeach     (0.324, 0.329, 0.364, 0.030)
		colorDesert    (0.366, 0.371, 0.412, 0.020)
		colorLowland   (0.408, 0.413, 0.454, 0.030)
		colorUpland    (0.451, 0.456, 0.496, 0.050)
		colorRock      (0.493, 0.498, 0.552, 0.020)
		colorSnow      (0.493, 0.498, 0.552, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.849463
		GasToDust   0.25
		Particles   2695
		GasBright   0.234618
		DustBright  0.593312
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.86571
		Period          8.95365
		Eccentricity    0.963124
		Inclination     140.743
		AscendingNode   87.4045
		ArgOfPericenter -32.3829
		MeanAnomaly     -34.977
	}
}

Comet	"C62"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.87052e-016
	Radius          0.0821307
	InertiaMoment   0.399667

	Oblateness      0.0147185

	RotationPeriod  43.8149
	Obliquity       20.8318
	EqAscendNode    166.62

	AbsMagn         8.74334
	SlopeParam      4.26158
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.710 0.706 0.703)

	Surface
	{
		SurfStyle       0.603543
		OceanStyle      0.662587
		Randomize      (0.140, 0.382, 0.626)
		colorDistMagn   0.447754
		colorDistFreq   4.78456e-006
		detailScale     2.24272
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94915
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.715412
		terraceProb     0.163784
		erosion         0
		montesMagn      0.513733
		montesFreq      2.90398
		montesSpiky     0.921318
		montesFraction  0.060268
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.10874e-006
		hillsFraction   0.722758
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240449
		craterFreq      0.200224
		craterDensity   0.949493
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   941.521
		volcanoTemp     1303.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.240, 0.197, 0.000)
		colorShelf     (0.284, 0.247, 0.225, 0.000)
		colorBeach     (0.334, 0.290, 0.267, 0.000)
		colorDesert    (0.362, 0.311, 0.260, 0.000)
		colorLowland   (0.398, 0.332, 0.295, 0.000)
		colorUpland    (0.440, 0.403, 0.359, 0.000)
		colorRock      (0.476, 0.438, 0.387, 0.000)
		colorSnow      (0.519, 0.466, 0.408, 1.000)
		BumpHeight      0.0739176
		BumpOffset      0.0147835
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.175464
		DustBright  0.336952
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.17802
		Period          19.9053
		Eccentricity    0.982583
		Inclination     -103.352
		AscendingNode   -106.622
		ArgOfPericenter -10.7586
		MeanAnomaly     -103.769
	}
}

Comet	"C63"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.44672e-012
	Radius          1.47253
	InertiaMoment   0.398493

	Oblateness      0.011891

	RotationPeriod  41.9873
	Obliquity       334.037
	EqAscendNode    151.198

	AbsMagn         10.166
	SlopeParam      3.24624
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.504 0.496 0.493)

	Surface
	{
		SurfStyle       0.420253
		OceanStyle      0.0206615
		Randomize      (-0.915, 0.852, -0.724)
		colorDistMagn   0.710393
		colorDistFreq   0.00067122
		detailScale     40.21
		colorConversion true
		snowLevel       2
		tropicLatitude  0.688855
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.524033
		terraceProb     0.162437
		erosion         0
		montesMagn      0.43047
		montesFreq      1.99256
		montesSpiky     0.950122
		montesFraction  0.562361
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00519571
		hillsFraction   0.562121
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244646
		craterFreq      0.249136
		craterDensity   0.935903
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   191.946
		volcanoTemp     1496.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.199, 0.197, 0.000)
		colorShelf     (0.214, 0.211, 0.209, 0.000)
		colorBeach     (0.227, 0.223, 0.222, 0.000)
		colorDesert    (0.240, 0.236, 0.234, 0.000)
		colorLowland   (0.252, 0.248, 0.246, 0.000)
		colorUpland    (0.265, 0.261, 0.259, 0.000)
		colorRock      (0.277, 0.273, 0.271, 0.000)
		colorSnow      (0.290, 0.285, 0.283, 1.000)
		BumpHeight      1.32528
		BumpOffset      0.265056
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.401097
		GasToDust   0.25
		Particles   1790
		GasBright   0.400226
		DustBright  0.596677
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.21818
		Period          11.6072
		Eccentricity    0.977446
		Inclination     28.3628
		AscendingNode   -108.577
		ArgOfPericenter -67.7967
		MeanAnomaly     -4.12455
	}
}

Comet	"C64"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.11893e-008
	Radius          32.0977
	InertiaMoment   0.395779

	Oblateness      0.0172424

	RotationPeriod  40.1441
	Obliquity       287.243
	EqAscendNode    135.775

	AbsMagn         11.9471
	SlopeParam      9.23591
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.566 0.564 0.560)

	Surface
	{
		SurfStyle       0.669858
		OceanStyle      0.51928
		Randomize      (0.963, -0.730, -0.097)
		colorDistMagn   0.205018
		colorDistFreq   0.788595
		detailScale     876.482
		colorConversion true
		snowLevel       2
		tropicLatitude  0.833782
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.506116
		terraceProb     0.727258
		erosion         0
		montesMagn      0.473245
		montesFreq      2.32889
		montesSpiky     0.835031
		montesFraction  0.399974
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.87357
		hillsFraction   0.584143
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249361
		craterFreq      0.266024
		craterDensity   0.852309
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.575
		volcanoTemp     1235.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.192, 0.157, 0.000)
		colorShelf     (0.226, 0.197, 0.179, 0.000)
		colorBeach     (0.266, 0.231, 0.213, 0.000)
		colorDesert    (0.289, 0.248, 0.207, 0.000)
		colorLowland   (0.317, 0.265, 0.235, 0.000)
		colorUpland    (0.351, 0.321, 0.286, 0.000)
		colorRock      (0.379, 0.349, 0.308, 0.000)
		colorSnow      (0.413, 0.372, 0.325, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.882289
		GasToDust   0.25
		Particles   2762
		GasBright   0.31379
		DustBright  0.367599
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.50179
		Period          13.903
		Eccentricity    0.953693
		Inclination     -125.853
		AscendingNode   159.635
		ArgOfPericenter -166.195
		MeanAnomaly     118.493
	}
}

Comet	"C65"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.44528e-016
	Radius          0.091131
	InertiaMoment   0.399004

	Oblateness      0.014266

	RotationPeriod  38.28
	Obliquity       240.449
	EqAscendNode    120.352

	AbsMagn         15.5424
	SlopeParam      5.65963
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.504 0.495 0.490)

	Surface
	{
		SurfStyle       0.641475
		OceanStyle      0.805281
		Randomize      (0.352, -0.147, 0.965)
		colorDistMagn   0.528593
		colorDistFreq   5.85498e-006
		detailScale     2.48848
		colorConversion true
		snowLevel       2
		tropicLatitude  0.652944
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.741096
		terraceProb     0.219037
		erosion         0
		montesMagn      0.46722
		montesFreq      3.07854
		montesSpiky     0.930316
		montesFraction  0.595553
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.1243e-005
		hillsFraction   0.65203
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234644
		craterFreq      0.171827
		craterDensity   0.907301
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   769.768
		volcanoTemp     1394.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.168, 0.137, 0.000)
		colorShelf     (0.202, 0.173, 0.157, 0.000)
		colorBeach     (0.237, 0.203, 0.186, 0.000)
		colorDesert    (0.257, 0.218, 0.181, 0.000)
		colorLowland   (0.282, 0.233, 0.206, 0.000)
		colorUpland    (0.312, 0.282, 0.250, 0.000)
		colorRock      (0.338, 0.307, 0.269, 0.000)
		colorSnow      (0.368, 0.327, 0.284, 1.000)
		BumpHeight      0.0820179
		BumpOffset      0.0164036
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0071565
		DustBright  0.358719
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.969047
		Period          3.35159
		Eccentricity    0.958051
		Inclination     -99.6687
		AscendingNode   -11.5346
		ArgOfPericenter -71.5045
		MeanAnomaly     115.809
	}
}

Comet	"C66"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.66467e-012
	Radius          1.98813
	InertiaMoment   0.397447

	Oblateness      0.0210705

	RotationPeriod  36.3895
	Obliquity       193.655
	EqAscendNode    104.93

	AbsMagn         3.09579
	SlopeParam      4.49521
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.759 0.675 0.632)

	Surface
	{
		SurfStyle       0.245917
		OceanStyle      0.366706
		Randomize      (0.134, 0.300, -0.773)
		colorDistMagn   0.472414
		colorDistFreq   0.00348913
		detailScale     54.2891
		colorConversion true
		snowLevel       2
		tropicLatitude  0.711824
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.521083
		terraceProb     0.186039
		erosion         0
		montesMagn      0.539079
		montesFreq      3.52602
		montesSpiky     0.77477
		montesFraction  0.69463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00826406
		hillsFraction   0.755264
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250227
		craterFreq      0.21997
		craterDensity   1.04878
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   190.954
		volcanoTemp     1604.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.270, 0.253, 0.000)
		colorShelf     (0.323, 0.287, 0.269, 0.000)
		colorBeach     (0.342, 0.304, 0.285, 0.000)
		colorDesert    (0.361, 0.321, 0.300, 0.000)
		colorLowland   (0.380, 0.337, 0.316, 0.000)
		colorUpland    (0.399, 0.354, 0.332, 0.000)
		colorRock      (0.418, 0.371, 0.348, 0.000)
		colorSnow      (0.437, 0.388, 0.364, 1.000)
		BumpHeight      1.78931
		BumpOffset      0.357863
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.433923
		GasToDust   0.25
		Particles   1856
		GasBright   0.0668429
		DustBright  0.783519
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.1825
		Period          11.3283
		Eccentricity    0.956703
		Inclination     -57.4402
		AscendingNode   25.6294
		ArgOfPericenter 125.379
		MeanAnomaly     -36.8551
	}
}

Comet	"C67"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.06093e-008
	Radius          35.5826
	InertiaMoment   0.399455

	Oblateness      0.0175415

	RotationPeriod  34.4664
	Obliquity       146.86
	EqAscendNode    89.5073

	AbsMagn         5.20423
	SlopeParam      3.48751
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.830 0.755 0.710)

	Surface
	{
		SurfStyle       0.178203
		OceanStyle      0.0489118
		Randomize      (-0.787, -0.609, 0.104)
		colorDistMagn   0.14145
		colorDistFreq   0.62232
		detailScale     971.642
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985072
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.608024
		terraceProb     0.47661
		erosion         0
		montesMagn      0.288099
		montesFreq      2.72015
		montesSpiky     0.883959
		montesFraction  0.814007
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.99792
		hillsFraction   0.784022
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256501
		craterFreq      0.207351
		craterDensity   1.03507
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.8608
		volcanoTemp     1368.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.332, 0.302, 0.284, 0.000)
		colorShelf     (0.353, 0.321, 0.302, 0.000)
		colorBeach     (0.374, 0.340, 0.320, 0.000)
		colorDesert    (0.394, 0.359, 0.337, 0.000)
		colorLowland   (0.415, 0.378, 0.355, 0.000)
		colorUpland    (0.436, 0.396, 0.373, 0.000)
		colorRock      (0.457, 0.415, 0.391, 0.000)
		colorSnow      (0.477, 0.434, 0.408, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.915115
		GasToDust   0.25
		Particles   2828
		GasBright   0.0736222
		DustBright  0.461227
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.68934
		Period          15.4954
		Eccentricity    0.962699
		Inclination     72.8555
		AscendingNode   -143.325
		ArgOfPericenter 89.3658
		MeanAnomaly     -6.94226
	}
}

Comet	"C68"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            6.34575e-016
	Radius          0.123144
	InertiaMoment   0.398203

	Oblateness      0.0264278

	RotationPeriod  32.5038
	Obliquity       100.066
	EqAscendNode    74.0847

	AbsMagn         6.72015
	SlopeParam      2.31664
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.602 0.426 0.357)

	Surface
	{
		SurfStyle       0.898319
		OceanStyle      0.878676
		Randomize      (0.212, 0.824, 0.382)
		colorDistMagn   0.100128
		colorDistFreq   1.04366e-005
		detailScale     3.36266
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991962
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.529658
		terraceProb     0.305933
		erosion         0
		montesMagn      0.480442
		montesFreq      3.46281
		montesSpiky     0.923847
		montesFraction  0.813095
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.04996e-005
		hillsFraction   0.859142
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250403
		craterFreq      0.202008
		craterDensity   0.956599
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   766.442
		volcanoTemp     1448.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.149, 0.143, 0.050)
		colorShelf     (0.241, 0.175, 0.164, 0.040)
		colorBeach     (0.277, 0.200, 0.185, 0.030)
		colorDesert    (0.313, 0.226, 0.210, 0.020)
		colorLowland   (0.349, 0.251, 0.232, 0.030)
		colorUpland    (0.385, 0.277, 0.253, 0.050)
		colorRock      (0.421, 0.302, 0.282, 0.020)
		colorSnow      (0.421, 0.302, 0.282, 1.000)
		BumpHeight      0.11083
		BumpOffset      0.022166
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0431423
		DustBright  0.176193
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.12149
		Period          10.8566
		Eccentricity    0.958145
		Inclination     160.627
		AscendingNode   26.84
		ArgOfPericenter -0.931544
		MeanAnomaly     26.8221
	}
}

Comet	"C69"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.90798e-012
	Radius          2.20179
	InertiaMoment   0.39988

	Oblateness      0.0223305

	RotationPeriod  30.4941
	Obliquity       53.2717
	EqAscendNode    58.6621

	AbsMagn         8.06721
	SlopeParam      6.00898
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.609 0.481 0.433)

	Surface
	{
		SurfStyle       0.0416253
		OceanStyle      0.549336
		Randomize      (-0.680, 0.648, -0.407)
		colorDistMagn   0.189942
		colorDistFreq   0.00175047
		detailScale     60.1237
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999773
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.34218
		terraceProb     0.338722
		erosion         0
		montesMagn      0.442033
		montesFreq      2.11689
		montesSpiky     0.933645
		montesFraction  0.935867
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0142691
		hillsFraction   0.750042
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240552
		craterFreq      0.223742
		craterDensity   0.901504
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   155.823
		volcanoTemp     1574.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.192, 0.173, 0.000)
		colorShelf     (0.259, 0.204, 0.184, 0.000)
		colorBeach     (0.274, 0.216, 0.195, 0.000)
		colorDesert    (0.289, 0.228, 0.206, 0.000)
		colorLowland   (0.304, 0.240, 0.217, 0.000)
		colorUpland    (0.320, 0.252, 0.228, 0.000)
		colorRock      (0.335, 0.265, 0.238, 0.000)
		colorSnow      (0.350, 0.277, 0.249, 1.000)
		BumpHeight      1.98162
		BumpOffset      0.396323
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.466749
		GasToDust   0.25
		Particles   1922
		GasBright   0.179996
		DustBright  0.523826
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.20267
		Period          11.4857
		Eccentricity    0.976845
		Inclination     45.7477
		AscendingNode   -40.1756
		ArgOfPericenter -15.4071
		MeanAnomaly     -115.604
	}
}

Comet	"C70"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.79597e-008
	Radius          48.1268
	InertiaMoment   0.398762

	Oblateness      0.0345477

	RotationPeriod  28.4282
	Obliquity       6.47739
	EqAscendNode    43.2395

	AbsMagn         9.42216
	SlopeParam      4.73582
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.798 0.796 0.793)

	Surface
	{
		SurfStyle       0.596416
		OceanStyle      0.357249
		Randomize      (-0.963, 0.152, -0.717)
		colorDistMagn   0.571151
		colorDistFreq   1.52735
		detailScale     1314.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.220896
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.653731
		terraceProb     0.524992
		erosion         0
		montesMagn      0.366933
		montesFreq      2.92523
		montesSpiky     0.995584
		montesFraction  0.382035
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.9427
		hillsFraction   0.816014
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26629
		craterFreq      0.241891
		craterDensity   1.02155
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.7286
		volcanoTemp     1445.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.271, 0.222, 0.000)
		colorShelf     (0.319, 0.279, 0.254, 0.000)
		colorBeach     (0.375, 0.327, 0.301, 0.000)
		colorDesert    (0.407, 0.350, 0.294, 0.000)
		colorLowland   (0.447, 0.374, 0.333, 0.000)
		colorUpland    (0.495, 0.454, 0.405, 0.000)
		colorRock      (0.535, 0.494, 0.436, 0.000)
		colorSnow      (0.583, 0.526, 0.460, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.947941
		GasToDust   0.25
		Particles   2894
		GasBright   0.122234
		DustBright  0.266074
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.68502
		Period          15.4581
		Eccentricity    0.96156
		Inclination     171.829
		AscendingNode   -120.899
		ArgOfPericenter -61.6709
		MeanAnomaly     -116.514
	}
}

Comet	"C71"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.16881e-015
	Radius          0.136232
	InertiaMoment   0.396885

	Oblateness      0.0295358

	RotationPeriod  26.2957
	Obliquity       319.683
	EqAscendNode    27.8169

	AbsMagn         10.97
	SlopeParam      3.72153
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.481 0.477 0.473)

	Surface
	{
		SurfStyle       0.865691
		OceanStyle      0.376374
		Randomize      (-0.352, -0.406, -0.181)
		colorDistMagn   0.153825
		colorDistFreq   1.05505e-005
		detailScale     3.72005
		colorConversion true
		snowLevel       2
		tropicLatitude  0.684251
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.32987
		terraceProb     0.448118
		erosion         0
		montesMagn      0.625108
		montesFreq      3.29423
		montesSpiky     0.964838
		montesFraction  0.440539
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.22606e-005
		hillsFraction   0.577063
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242138
		craterFreq      0.185731
		craterDensity   0.74837
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   624.761
		volcanoTemp     1381.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.167, 0.189, 0.050)
		colorShelf     (0.192, 0.196, 0.218, 0.040)
		colorBeach     (0.221, 0.224, 0.246, 0.030)
		colorDesert    (0.250, 0.253, 0.279, 0.020)
		colorLowland   (0.279, 0.282, 0.308, 0.030)
		colorUpland    (0.308, 0.310, 0.336, 0.050)
		colorRock      (0.336, 0.339, 0.374, 0.020)
		colorSnow      (0.336, 0.339, 0.374, 1.000)
		BumpHeight      0.122609
		BumpOffset      0.0245218
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0183832
		GasToDust   0.25
		Particles   1016
		GasBright   0.326278
		DustBright  0.546517
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.98188
		Period          18.0913
		Eccentricity    0.957317
		Inclination     97.8169
		AscendingNode   167.391
		ArgOfPericenter 41.8781
		MeanAnomaly     28.338
	}
}

Comet	"C72"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            9.0399e-012
	Radius          2.98099
	InertiaMoment   0.399237

	Oblateness      0.0481179

	RotationPeriod  24.0842
	Obliquity       272.889
	EqAscendNode    12.3944

	AbsMagn         13.2027
	SlopeParam      2.62405
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.546 0.542 0.538)

	Surface
	{
		SurfStyle       0.365024
		OceanStyle      0.955289
		Randomize      (0.059, 0.601, -0.272)
		colorDistMagn   0.834428
		colorDistFreq   0.000139116
		detailScale     81.4009
		colorConversion true
		snowLevel       2
		tropicLatitude  0.825893
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478558
		terraceProb     0.245011
		erosion         0
		montesMagn      0.539146
		montesFreq      2.36227
		montesSpiky     0.875926
		montesFraction  0.670642
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0210111
		hillsFraction   0.732738
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258163
		craterFreq      0.254395
		craterDensity   1.05764
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   155.448
		volcanoTemp     1688.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.217, 0.215, 0.000)
		colorShelf     (0.232, 0.230, 0.229, 0.000)
		colorBeach     (0.246, 0.244, 0.242, 0.000)
		colorDesert    (0.260, 0.258, 0.255, 0.000)
		colorLowland   (0.273, 0.271, 0.269, 0.000)
		colorUpland    (0.287, 0.285, 0.282, 0.000)
		colorRock      (0.301, 0.298, 0.296, 0.000)
		colorSnow      (0.314, 0.312, 0.309, 1.000)
		BumpHeight      2.68289
		BumpOffset      0.536578
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.499575
		GasToDust   0.25
		Particles   1989
		GasBright   0.241234
		DustBright  0.316047
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.66827
		Period          15.3136
		Eccentricity    0.956683
		Inclination     -43.9728
		AscendingNode   -30.0718
		ArgOfPericenter -77.7641
		MeanAnomaly     -81.1207
	}
}

Comet	"C73"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            6.99172e-008
	Radius          53.1791
	InertiaMoment   0.397868

	Oblateness      0.0429742

	RotationPeriod  21.7785
	Obliquity       226.094
	EqAscendNode    356.972

	AbsMagn         1.13594
	SlopeParam      6.43381
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.708 0.703 0.700)

	Surface
	{
		SurfStyle       0.876557
		OceanStyle      0.2784
		Randomize      (-0.631, 0.135, -0.014)
		colorDistMagn   0.147813
		colorDistFreq   1.63309
		detailScale     1452.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.931787
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498164
		terraceProb     0.203333
		erosion         0
		montesMagn      0.508059
		montesFreq      3.87819
		montesSpiky     0.916169
		montesFraction  0.742757
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.96331
		hillsFraction   0.578485
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250859
		craterFreq      0.163341
		craterDensity   0.983636
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.5322
		volcanoTemp     1241.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.246, 0.280, 0.050)
		colorShelf     (0.283, 0.288, 0.322, 0.040)
		colorBeach     (0.326, 0.330, 0.364, 0.030)
		colorDesert    (0.368, 0.373, 0.413, 0.020)
		colorLowland   (0.410, 0.415, 0.455, 0.030)
		colorUpland    (0.453, 0.457, 0.497, 0.050)
		colorRock      (0.495, 0.499, 0.553, 0.020)
		colorSnow      (0.495, 0.499, 0.553, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.980767
		GasToDust   0.25
		Particles   2961
		GasBright   0.118931
		DustBright  0.122837
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.91663
		Period          9.32264
		Eccentricity    0.953539
		Inclination     -65.2406
		AscendingNode   177.136
		ArgOfPericenter -159.639
		MeanAnomaly     60.8405
	}
}

Comet	"C74"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.1528e-015
	Radius          0.184644
	InertiaMoment   0.399672

	Oblateness      0.0744328

	RotationPeriod  19.3597
	Obliquity       179.3
	EqAscendNode    341.549

	AbsMagn         4.26605
	SlopeParam      4.98763
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.778 0.776 0.773)

	Surface
	{
		SurfStyle       0.824299
		OceanStyle      0.986808
		Randomize      (-0.602, -0.395, 0.631)
		colorDistMagn   0.841456
		colorDistFreq   1.7857e-005
		detailScale     5.04201
		colorConversion true
		snowLevel       2
		tropicLatitude  0.43376
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.288415
		terraceProb     0.266958
		erosion         0
		montesMagn      0.449627
		montesFreq      2.40874
		montesSpiky     0.972171
		montesFraction  0.675392
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.40496e-005
		hillsFraction   0.612653
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244083
		craterFreq      0.237301
		craterDensity   0.888535
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   623.934
		volcanoTemp     1647.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.264, 0.216, 0.000)
		colorShelf     (0.311, 0.271, 0.247, 0.000)
		colorBeach     (0.366, 0.318, 0.294, 0.000)
		colorDesert    (0.397, 0.341, 0.286, 0.000)
		colorLowland   (0.436, 0.365, 0.325, 0.000)
		colorUpland    (0.482, 0.442, 0.394, 0.000)
		colorRock      (0.521, 0.481, 0.425, 0.000)
		colorSnow      (0.568, 0.512, 0.448, 1.000)
		BumpHeight      0.166179
		BumpOffset      0.0332359
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0512092
		GasToDust   0.25
		Particles   1083
		GasBright   0.0370152
		DustBright  0.68924
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.25571
		Period          20.6396
		Eccentricity    0.965417
		Inclination     153.6
		AscendingNode   172.348
		ArgOfPericenter -154.753
		MeanAnomaly     -52.5246
	}
}

Comet	"C75"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.66503e-011
	Radius          3.28968
	InertiaMoment   0.3985

	Oblateness      0.0719207

	RotationPeriod  16.8042
	Obliquity       132.506
	EqAscendNode    326.127

	AbsMagn         5.98807
	SlopeParam      3.95178
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.811 0.747 0.678)

	Surface
	{
		SurfStyle       0.7589
		OceanStyle      0.709044
		Randomize      (-0.386, 0.068, -0.002)
		colorDistMagn   0.0111322
		colorDistFreq   0.00928276
		detailScale     89.8301
		colorConversion true
		snowLevel       2
		tropicLatitude  0.494034
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52752
		terraceProb     0.171709
		erosion         0
		montesMagn      0.314398
		montesFreq      3.82693
		montesSpiky     0.922178
		montesFraction  0.883428
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0246741
		hillsFraction   0.521588
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24021
		craterFreq      0.236896
		craterDensity   0.923594
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   126.4
		volcanoTemp     1464.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.254, 0.190, 0.000)
		colorShelf     (0.325, 0.261, 0.217, 0.000)
		colorBeach     (0.381, 0.306, 0.258, 0.000)
		colorDesert    (0.414, 0.328, 0.251, 0.000)
		colorLowland   (0.454, 0.351, 0.285, 0.000)
		colorUpland    (0.503, 0.426, 0.346, 0.000)
		colorRock      (0.544, 0.463, 0.373, 0.000)
		colorSnow      (0.592, 0.493, 0.393, 1.000)
		BumpHeight      2.96071
		BumpOffset      0.592142
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.532401
		GasToDust   0.25
		Particles   2055
		GasBright   0.0451867
		DustBright  0.365555
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.30941
		Period          12.3306
		Eccentricity    0.95764
		Inclination     149.549
		AscendingNode   140.184
		ArgOfPericenter 116.633
		MeanAnomaly     -106.491
	}
}

Comet	"C76"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.28779e-007
	Radius          72.1622
	InertiaMoment   0.395826

	Oblateness      0.138396

	RotationPeriod  14.0809
	Obliquity       85.7116
	EqAscendNode    310.704

	AbsMagn         7.39301
	SlopeParam      2.90189
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.597 0.516 0.404)

	Surface
	{
		SurfStyle       0.195991
		OceanStyle      0.542502
		Randomize      (-0.433, 0.058, 0.451)
		colorDistMagn   0.745399
		colorDistFreq   3.86928
		detailScale     1970.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97316
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563427
		terraceProb     0.200736
		erosion         0
		montesMagn      0.534382
		montesFreq      3.08817
		montesSpiky     0.931176
		montesFraction  0.690118
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.14
		hillsFraction   0.714301
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237322
		craterFreq      0.185987
		craterDensity   0.921005
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.5278
		volcanoTemp     1383.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.206, 0.162, 0.000)
		colorShelf     (0.254, 0.219, 0.172, 0.000)
		colorBeach     (0.269, 0.232, 0.182, 0.000)
		colorDesert    (0.284, 0.245, 0.192, 0.000)
		colorLowland   (0.299, 0.258, 0.202, 0.000)
		colorUpland    (0.314, 0.271, 0.212, 0.000)
		colorRock      (0.329, 0.284, 0.222, 0.000)
		colorSnow      (0.343, 0.297, 0.232, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.151345
		DustBright  0.743883
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.11694
		Period          19.3342
		Eccentricity    0.984936
		Inclination     162.089
		AscendingNode   -58.7755
		ArgOfPericenter 49.4679
		MeanAnomaly     11.9355
	}
}

Comet	"C77"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.96518e-015
	Radius          0.203474
	InertiaMoment   0.399009

	Oblateness      0.162684

	RotationPeriod  11.1481
	Obliquity       38.9173
	EqAscendNode    295.281

	AbsMagn         8.72482
	SlopeParam      7.01144
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.467 0.463 0.455)

	Surface
	{
		SurfStyle       0.593531
		OceanStyle      0.679292
		Randomize      (-0.937, 0.406, -0.882)
		colorDistMagn   0.0240009
		colorDistFreq   1.30808e-005
		detailScale     5.55621
		colorConversion true
		snowLevel       2
		tropicLatitude  0.767921
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.54636
		terraceProb     0.318021
		erosion         0
		montesMagn      0.634745
		montesFreq      2.52143
		montesSpiky     0.987045
		montesFraction  0.559654
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.56588e-005
		hillsFraction   0.802868
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267315
		craterFreq      0.200771
		craterDensity   0.7202
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   506.622
		volcanoTemp     1434.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.157, 0.128, 0.000)
		colorShelf     (0.187, 0.162, 0.146, 0.000)
		colorBeach     (0.219, 0.190, 0.173, 0.000)
		colorDesert    (0.238, 0.204, 0.168, 0.000)
		colorLowland   (0.261, 0.217, 0.191, 0.000)
		colorUpland    (0.289, 0.264, 0.232, 0.000)
		colorRock      (0.313, 0.287, 0.250, 0.000)
		colorSnow      (0.341, 0.305, 0.264, 1.000)
		BumpHeight      0.183127
		BumpOffset      0.0366254
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.084035
		GasToDust   0.25
		Particles   1149
		GasBright   0.132235
		DustBright  0.44748
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.55631
		Period          14.36
		Eccentricity    0.963934
		Inclination     15.3285
		AscendingNode   48.5956
		ArgOfPericenter -156.743
		MeanAnomaly     -105.703
	}
}

Comet	"C78"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.06678e-011
	Radius          4.46978
	InertiaMoment   0.397459

	Oblateness      0.249

	RotationPeriod  7.94783
	Obliquity       352.123
	EqAscendNode    279.859

	AbsMagn         10.1449
	SlopeParam      5.25621
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.459 0.453 0.448)

	Surface
	{
		SurfStyle       0.547696
		OceanStyle      0.628856
		Randomize      (0.534, 0.440, 0.321)
		colorDistMagn   0.0921978
		colorDistFreq   0.0156857
		detailScale     122.055
		colorConversion true
		snowLevel       2
		tropicLatitude  0.863575
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595602
		terraceProb     0.247468
		erosion         0
		montesMagn      0.545763
		montesFreq      3.37867
		montesSpiky     0.929784
		montesFraction  0.70765
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.054051
		hillsFraction   0.773156
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242276
		craterFreq      0.234356
		craterDensity   0.726689
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   126.547
		volcanoTemp     1276.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.154, 0.125, 0.000)
		colorShelf     (0.184, 0.159, 0.143, 0.000)
		colorBeach     (0.216, 0.186, 0.170, 0.000)
		colorDesert    (0.234, 0.199, 0.166, 0.000)
		colorLowland   (0.257, 0.213, 0.188, 0.000)
		colorUpland    (0.285, 0.258, 0.228, 0.000)
		colorRock      (0.308, 0.281, 0.246, 0.000)
		colorSnow      (0.335, 0.299, 0.260, 1.000)
		BumpHeight      4.0228
		BumpOffset      0.804561
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.565227
		GasToDust   0.25
		Particles   2121
		GasBright   0.0758649
		DustBright  0.188336
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.24009
		Period          20.4912
		Eccentricity    0.977026
		Inclination     125.336
		AscendingNode   52.0893
		ArgOfPericenter 169.421
		MeanAnomaly     125.059
	}
}

Comet	"C79"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.37194e-007
	Radius          79.3963
	InertiaMoment   0.399461

	Oblateness      0.249

	RotationPeriod  4.39505
	Obliquity       305.329
	EqAscendNode    264.436

	AbsMagn         11.9176
	SlopeParam      4.18139
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.625 0.621 0.619)

	Surface
	{
		SurfStyle       0.0729826
		OceanStyle      0.559122
		Randomize      (0.484, 0.008, 0.343)
		colorDistMagn   0.768279
		colorDistFreq   2.76851
		detailScale     2168.05
		colorConversion true
		snowLevel       2
		tropicLatitude  0.68275
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.345091
		terraceProb     0.309494
		erosion         0
		montesMagn      0.525072
		montesFreq      3.45088
		montesSpiky     0.964924
		montesFraction  0.452019
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.0395
		hillsFraction   0.596626
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271066
		craterFreq      0.199055
		craterDensity   0.954449
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.5596
		volcanoTemp     1664.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.248, 0.248, 0.000)
		colorShelf     (0.266, 0.264, 0.263, 0.000)
		colorBeach     (0.281, 0.280, 0.279, 0.000)
		colorDesert    (0.297, 0.295, 0.294, 0.000)
		colorLowland   (0.313, 0.311, 0.310, 0.000)
		colorUpland    (0.328, 0.326, 0.325, 0.000)
		colorRock      (0.344, 0.342, 0.340, 0.000)
		colorSnow      (0.360, 0.357, 0.356, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.259191
		DustBright  0.489497
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.00768
		Period          18.3265
		Eccentricity    0.989837
		Inclination     -109.201
		AscendingNode   45.4535
		ArgOfPericenter -100.219
		MeanAnomaly     10.7141
	}
}

Comet	"C80"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            7.30338e-015
	Radius          0.276862
	InertiaMoment   0.398211

	Oblateness      0.00158137

	RotationPeriod  132.041
	Obliquity       258.534
	EqAscendNode    249.014

	AbsMagn         15.4373
	SlopeParam      3.15996
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.655 0.582 0.555)

	Surface
	{
		SurfStyle       0.3719
		OceanStyle      0.776751
		Randomize      (-0.294, -0.703, -0.469)
		colorDistMagn   0.921239
		colorDistFreq   4.64396e-005
		detailScale     7.56018
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992312
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.538652
		terraceProb     0.181254
		erosion         0
		montesMagn      0.499696
		montesFreq      2.91378
		montesSpiky     0.958031
		montesFraction  0.461806
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000171312
		hillsFraction   0.478184
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235519
		craterFreq      0.228648
		craterDensity   0.9269
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   507.934
		volcanoTemp     1329.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.233, 0.222, 0.000)
		colorShelf     (0.278, 0.248, 0.236, 0.000)
		colorBeach     (0.295, 0.262, 0.250, 0.000)
		colorDesert    (0.311, 0.277, 0.264, 0.000)
		colorLowland   (0.327, 0.291, 0.278, 0.000)
		colorUpland    (0.344, 0.306, 0.292, 0.000)
		colorRock      (0.360, 0.320, 0.305, 0.000)
		colorSnow      (0.377, 0.335, 0.319, 1.000)
		BumpHeight      0.249176
		BumpOffset      0.0498352
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.116861
		GasToDust   0.25
		Particles   1215
		GasBright   0.175539
		DustBright  0.257635
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.11325
		Period          19.2999
		Eccentricity    0.970638
		Inclination     -24.8753
		AscendingNode   -137.532
		ArgOfPericenter -110.692
		MeanAnomaly     34.2384
	}
}

Comet	"C81"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            5.64864e-011
	Radius          4.9092
	InertiaMoment   0.399886

	Oblateness      0.00149145

	RotationPeriod  115.796
	Obliquity       211.74
	EqAscendNode    233.591

	AbsMagn         3.05696
	SlopeParam      8.09441
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.644 0.641 0.636)

	Surface
	{
		SurfStyle       0.210519
		OceanStyle      0.567084
		Randomize      (0.661, -0.375, 0.869)
		colorDistMagn   0.264541
		colorDistFreq   0.013374
		detailScale     134.054
		colorConversion true
		snowLevel       2
		tropicLatitude  0.935164
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504168
		terraceProb     0.489952
		erosion         0
		montesMagn      0.547381
		montesFreq      2.46809
		montesSpiky     0.854493
		montesFraction  0.494772
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0607914
		hillsFraction   0.743271
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.281443
		craterFreq      0.232292
		craterDensity   0.880555
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   102.411
		volcanoTemp     1414.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.256, 0.255, 0.000)
		colorShelf     (0.274, 0.272, 0.270, 0.000)
		colorBeach     (0.290, 0.288, 0.286, 0.000)
		colorDesert    (0.306, 0.304, 0.302, 0.000)
		colorLowland   (0.322, 0.320, 0.318, 0.000)
		colorUpland    (0.338, 0.336, 0.334, 0.000)
		colorRock      (0.354, 0.352, 0.350, 0.000)
		colorSnow      (0.370, 0.368, 0.366, 1.000)
		BumpHeight      4.41828
		BumpOffset      0.883656
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.598053
		GasToDust   0.25
		Particles   2187
		GasBright   0.426055
		DustBright  0.491606
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.35029
		Period          12.6595
		Eccentricity    0.956114
		Inclination     -41.8878
		AscendingNode   -142.565
		ArgOfPericenter 16.2506
		MeanAnomaly     -4.47623
	}
}

Comet	"C82"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.36881e-007
	Radius          108.204
	InertiaMoment   0.398768

	Oblateness      0.00239669

	RotationPeriod  107.256
	Obliquity       164.946
	EqAscendNode    218.168

	AbsMagn         5.18094
	SlopeParam      5.54968
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.726 0.721 0.719)

	Surface
	{
		SurfStyle       0.86712
		OceanStyle      0.0820966
		Randomize      (0.692, 0.893, -0.430)
		colorDistMagn   0.0552098
		colorDistFreq   8.65532
		detailScale     2954.68
		colorConversion true
		snowLevel       2
		tropicLatitude  0.647428
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478546
		terraceProb     0.314288
		erosion         0
		montesMagn      0.616742
		montesFreq      3.20987
		montesSpiky     0.940063
		montesFraction  0.792394
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.6905
		hillsFraction   0.696649
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278137
		craterFreq      0.288328
		craterDensity   0.999485
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.6665
		volcanoTemp     1506.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.252, 0.288, 0.050)
		colorShelf     (0.290, 0.296, 0.331, 0.040)
		colorBeach     (0.334, 0.339, 0.374, 0.030)
		colorDesert    (0.378, 0.382, 0.424, 0.020)
		colorLowland   (0.421, 0.425, 0.467, 0.030)
		colorUpland    (0.465, 0.469, 0.510, 0.050)
		colorRock      (0.508, 0.512, 0.568, 0.020)
		colorSnow      (0.508, 0.512, 0.568, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0140477
		DustBright  0.5881
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.29096
		Period          12.1831
		Eccentricity    0.94798
		Inclination     -154.679
		AscendingNode   175.709
		ArgOfPericenter 172.775
		MeanAnomaly     88.4109
	}
}

Comet	"C83"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.34519e-014
	Radius          0.303475
	InertiaMoment   0.396903

	Oblateness      0.00191749

	RotationPeriod  101.147
	Obliquity       118.152
	EqAscendNode    202.746

	AbsMagn         6.70097
	SlopeParam      4.41343
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.450 0.441 0.438)

	Surface
	{
		SurfStyle       0.305872
		OceanStyle      0.3083
		Randomize      (-0.760, 0.621, 0.895)
		colorDistMagn   0.495731
		colorDistFreq   2.16625e-005
		detailScale     8.2869
		colorConversion true
		snowLevel       2
		tropicLatitude  0.736044
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.518395
		terraceProb     0.387216
		erosion         0
		montesMagn      0.583008
		montesFreq      2.16922
		montesSpiky     0.972216
		montesFraction  0.513505
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000179638
		hillsFraction   0.569065
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233146
		craterFreq      0.172385
		craterDensity   0.932684
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   410.239
		volcanoTemp     1269.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.176, 0.175, 0.000)
		colorShelf     (0.191, 0.188, 0.186, 0.000)
		colorBeach     (0.203, 0.199, 0.197, 0.000)
		colorDesert    (0.214, 0.210, 0.208, 0.000)
		colorLowland   (0.225, 0.221, 0.219, 0.000)
		colorUpland    (0.236, 0.232, 0.230, 0.000)
		colorRock      (0.248, 0.243, 0.241, 0.000)
		colorSnow      (0.259, 0.254, 0.252, 1.000)
		BumpHeight      0.273128
		BumpOffset      0.0546256
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.149687
		GasToDust   0.25
		Particles   1282
		GasBright   0.0236113
		DustBright  0.263023
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.79296
		Period          16.3995
		Eccentricity    0.982544
		Inclination     -26.7405
		AscendingNode   -130.109
		ArgOfPericenter 149.23
		MeanAnomaly     14.95
	}
}

Comet	"C84"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.04041e-010
	Radius          6.70225
	InertiaMoment   0.399243

	Oblateness      0.0029739

	RotationPeriod  96.2716
	Obliquity       71.3572
	EqAscendNode    187.323

	AbsMagn         8.049
	SlopeParam      3.4047
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.596 0.591 0.584)

	Surface
	{
		SurfStyle       0.816783
		OceanStyle      0.00916484
		Randomize      (0.373, 0.044, -0.886)
		colorDistMagn   0.398753
		colorDistFreq   0.0339601
		detailScale     183.016
		colorConversion true
		snowLevel       2
		tropicLatitude  0.249332
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584377
		terraceProb     0.488561
		erosion         0
		montesMagn      0.540782
		montesFreq      3.01153
		montesSpiky     0.909865
		montesFraction  0.690128
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.15831
		hillsFraction   0.5823
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273859
		craterFreq      0.249898
		craterDensity   0.881761
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   103.021
		volcanoTemp     1576.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.201, 0.163, 0.000)
		colorShelf     (0.238, 0.207, 0.187, 0.000)
		colorBeach     (0.280, 0.242, 0.222, 0.000)
		colorDesert    (0.304, 0.260, 0.216, 0.000)
		colorLowland   (0.334, 0.278, 0.245, 0.000)
		colorUpland    (0.369, 0.337, 0.298, 0.000)
		colorRock      (0.399, 0.366, 0.321, 0.000)
		colorSnow      (0.435, 0.390, 0.339, 1.000)
		BumpHeight      6.03202
		BumpOffset      1.2064
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.630879
		GasToDust   0.25
		Particles   2254
		GasBright   0.109052
		DustBright  0.662069
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.36339
		Period          21.672
		Eccentricity    0.976256
		Inclination     58.5156
		AscendingNode   -172.689
		ArgOfPericenter -74.819
		MeanAnomaly     -32.4876
	}
}

Comet	"C85"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.20349e-018
	Radius          0.0187548
	InertiaMoment   0.397877

	Oblateness      0.0022981

	RotationPeriod  92.1495
	Obliquity       24.5629
	EqAscendNode    171.901

	AbsMagn         9.40278
	SlopeParam      2.2002
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.433 0.430 0.428)

	Surface
	{
		SurfStyle       0.0804301
		OceanStyle      0.163728
		Randomize      (0.499, 0.853, -0.118)
		colorDistMagn   0.583603
		colorDistFreq   9.65844e-008
		detailScale     0.512131
		colorConversion true
		snowLevel       2
		tropicLatitude  0.470033
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.371585
		terraceProb     0.360647
		erosion         0
		montesMagn      0.587049
		montesFreq      3.10131
		montesSpiky     0.969682
		montesFraction  0.481747
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.43856e-007
		hillsFraction   0.520221
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245862
		craterFreq      0.213752
		craterDensity   0.988383
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1642.88
		volcanoTemp     1612.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.172, 0.171, 0.000)
		colorShelf     (0.184, 0.183, 0.182, 0.000)
		colorBeach     (0.195, 0.194, 0.193, 0.000)
		colorDesert    (0.206, 0.204, 0.203, 0.000)
		colorLowland   (0.217, 0.215, 0.214, 0.000)
		colorUpland    (0.228, 0.226, 0.225, 0.000)
		colorRock      (0.238, 0.237, 0.236, 0.000)
		colorSnow      (0.249, 0.247, 0.246, 1.000)
		BumpHeight      0.0168793
		BumpOffset      0.00337587
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0913333
		DustBright  0.364274
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.84104
		Period          16.8247
		Eccentricity    0.960302
		Inclination     28.9634
		AscendingNode   -115.574
		ArgOfPericenter 170.315
		MeanAnomaly     -160.621
	}
}

Comet	"C86"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.47767e-014
	Radius          0.415146
	InertiaMoment   0.399678

	Oblateness      0.00351464

	RotationPeriod  88.5369
	Obliquity       337.769
	EqAscendNode    156.478

	AbsMagn         10.9461
	SlopeParam      5.88111
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.673 0.670 0.669)

	Surface
	{
		SurfStyle       0.560101
		OceanStyle      0.569558
		Randomize      (0.129, 0.813, 0.201)
		colorDistMagn   0.334651
		colorDistFreq   6.01243e-005
		detailScale     11.3362
		colorConversion true
		snowLevel       2
		tropicLatitude  0.81459
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.389436
		terraceProb     0.231633
		erosion         0
		montesMagn      0.470918
		montesFreq      3.1447
		montesSpiky     0.878935
		montesFraction  0.631404
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000316447
		hillsFraction   0.697158
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266525
		craterFreq      0.188396
		craterDensity   0.791484
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   413.509
		volcanoTemp     1519.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.228, 0.187, 0.000)
		colorShelf     (0.269, 0.235, 0.214, 0.000)
		colorBeach     (0.316, 0.275, 0.254, 0.000)
		colorDesert    (0.343, 0.295, 0.248, 0.000)
		colorLowland   (0.377, 0.315, 0.281, 0.000)
		colorUpland    (0.417, 0.382, 0.341, 0.000)
		colorRock      (0.451, 0.416, 0.368, 0.000)
		colorSnow      (0.491, 0.443, 0.388, 1.000)
		BumpHeight      0.373631
		BumpOffset      0.0747262
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.182513
		GasToDust   0.25
		Particles   1348
		GasBright   0.243964
		DustBright  0.69613
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.4115
		Period          13.1572
		Eccentricity    0.978269
		Inclination     -34.8394
		AscendingNode   33.7538
		ArgOfPericenter -31.6379
		MeanAnomaly     -45.5693
	}
}

Comet	"C87"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.9163e-010
	Radius          7.31042
	InertiaMoment   0.398507

	Oblateness      0.00266202

	RotationPeriod  85.2922
	Obliquity       290.974
	EqAscendNode    141.056

	AbsMagn         13.1606
	SlopeParam      4.65119
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.444 0.437 0.433)

	Surface
	{
		SurfStyle       0.208069
		OceanStyle      0.908758
		Randomize      (0.553, -0.396, 0.878)
		colorDistMagn   0.425884
		colorDistFreq   0.0341888
		detailScale     199.623
		colorConversion true
		snowLevel       2
		tropicLatitude  0.900144
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411583
		terraceProb     0.641086
		erosion         0
		montesMagn      0.267836
		montesFreq      2.66484
		montesSpiky     0.900995
		montesFraction  0.210575
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.168701
		hillsFraction   0.594385
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228213
		craterFreq      0.202478
		craterDensity   0.905208
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   82.7974
		volcanoTemp     1376.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.175, 0.173, 0.000)
		colorShelf     (0.189, 0.186, 0.184, 0.000)
		colorBeach     (0.200, 0.196, 0.195, 0.000)
		colorDesert    (0.211, 0.207, 0.206, 0.000)
		colorLowland   (0.222, 0.218, 0.216, 0.000)
		colorUpland    (0.233, 0.229, 0.227, 0.000)
		colorRock      (0.244, 0.240, 0.238, 0.000)
		colorSnow      (0.255, 0.251, 0.249, 1.000)
		BumpHeight      6.57938
		BumpOffset      1.31588
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.663705
		GasToDust   0.25
		Particles   2320
		GasBright   0.198963
		DustBright  0.425617
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.64114
		Period          7.38673
		Eccentricity    0.97405
		Inclination     170.068
		AscendingNode   -121.025
		ArgOfPericenter 27.1471
		MeanAnomaly     -143.436
	}
}

Comet	"C88"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            5.90043e-018
	Radius          0.0257147
	InertiaMoment   0.395872

	Oblateness      0.00399916

	RotationPeriod  82.3251
	Obliquity       244.18
	EqAscendNode    125.633

	AbsMagn         1.05519
	SlopeParam      3.64081
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.602 0.444 0.332)

	Surface
	{
		SurfStyle       0.530645
		OceanStyle      0.748501
		Randomize      (0.030, -0.425, 0.513)
		colorDistMagn   0.982491
		colorDistFreq   5.71273e-007
		detailScale     0.702183
		colorConversion true
		snowLevel       2
		tropicLatitude  0.749425
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.688359
		terraceProb     0.186058
		erosion         0
		montesMagn      0.525199
		montesFreq      2.42433
		montesSpiky     0.944787
		montesFraction  0.787576
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.62645e-006
		hillsFraction   0.683205
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229181
		craterFreq      0.198226
		craterDensity   0.974673
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1659.76
		volcanoTemp     1556.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.151, 0.093, 0.000)
		colorShelf     (0.241, 0.156, 0.106, 0.000)
		colorBeach     (0.283, 0.182, 0.126, 0.000)
		colorDesert    (0.307, 0.196, 0.123, 0.000)
		colorLowland   (0.337, 0.209, 0.139, 0.000)
		colorUpland    (0.373, 0.253, 0.169, 0.000)
		colorRock      (0.403, 0.275, 0.182, 0.000)
		colorSnow      (0.439, 0.293, 0.192, 1.000)
		BumpHeight      0.0231432
		BumpOffset      0.00462865
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.116704
		DustBright  0.192363
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.68847
		Period          15.4878
		Eccentricity    0.959714
		Inclination     -44.7858
		AscendingNode   -56.1783
		ArgOfPericenter -72.1034
		MeanAnomaly     69.4582
	}
}

Comet	"C89"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.56356e-014
	Radius          0.451393
	InertiaMoment   0.399015

	Oblateness      0.00302904

	RotationPeriod  79.5747
	Obliquity       197.386
	EqAscendNode    110.21

	AbsMagn         4.23781
	SlopeParam      2.52124
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.791 0.701 0.667)

	Surface
	{
		SurfStyle       0.00786544
		OceanStyle      0.459689
		Randomize      (0.619, 0.242, 0.314)
		colorDistMagn   0.9855
		colorDistFreq   0.000164644
		detailScale     12.326
		colorConversion true
		snowLevel       2
		tropicLatitude  0.911173
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.693192
		terraceProb     0.419891
		erosion         0
		montesMagn      0.609621
		montesFreq      2.71685
		montesSpiky     0.956689
		montesFraction  0.554829
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000433168
		hillsFraction   0.490514
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234669
		craterFreq      0.1971
		craterDensity   1.06816
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   331.291
		volcanoTemp     1620.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.281, 0.267, 0.000)
		colorShelf     (0.336, 0.298, 0.283, 0.000)
		colorBeach     (0.356, 0.316, 0.300, 0.000)
		colorDesert    (0.376, 0.333, 0.317, 0.000)
		colorLowland   (0.395, 0.351, 0.333, 0.000)
		colorUpland    (0.415, 0.368, 0.350, 0.000)
		colorRock      (0.435, 0.386, 0.367, 0.000)
		colorSnow      (0.455, 0.403, 0.383, 1.000)
		BumpHeight      0.406254
		BumpOffset      0.0812508
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.215339
		GasToDust   0.25
		Particles   1414
		GasBright   0.346502
		DustBright  0.447051
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.47758
		Period          13.7017
		Eccentricity    0.969097
		Inclination     -58.5701
		AscendingNode   -109.619
		ArgOfPericenter 16.9325
		MeanAnomaly     -52.676
	}
}

Comet	"C90"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.52958e-010
	Radius          10.0499
	InertiaMoment   0.397471

	Oblateness      0.00458978

	RotationPeriod  76.9972
	Obliquity       150.591
	EqAscendNode    94.7877

	AbsMagn         5.96738
	SlopeParam      6.27451
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.652 0.649 0.644)

	Surface
	{
		SurfStyle       0.0150918
		OceanStyle      0.848022
		Randomize      (-0.376, 0.528, 0.349)
		colorDistMagn   0.0327681
		colorDistFreq   0.0322361
		detailScale     274.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.684565
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.432986
		terraceProb     0.187767
		erosion         0
		montesMagn      0.657521
		montesFreq      2.29686
		montesSpiky     0.851968
		montesFraction  0.368663
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.242567
		hillsFraction   0.594103
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232837
		craterFreq      0.226255
		craterDensity   0.836663
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   83.8701
		volcanoTemp     1470.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.259, 0.257, 0.000)
		colorShelf     (0.277, 0.276, 0.274, 0.000)
		colorBeach     (0.293, 0.292, 0.290, 0.000)
		colorDesert    (0.310, 0.308, 0.306, 0.000)
		colorLowland   (0.326, 0.324, 0.322, 0.000)
		colorUpland    (0.342, 0.341, 0.338, 0.000)
		colorRock      (0.358, 0.357, 0.354, 0.000)
		colorSnow      (0.375, 0.373, 0.370, 1.000)
		BumpHeight      9.04493
		BumpOffset      1.80899
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.696531
		GasToDust   0.25
		Particles   2386
		GasBright   0.23696
		DustBright  0.24108
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.36546
		Period          21.692
		Eccentricity    0.961978
		Inclination     162.279
		AscendingNode   -47.5642
		ArgOfPericenter -87.1289
		MeanAnomaly     -52.7548
	}
}

Comet	"C91"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.08679e-017
	Radius          0.0278518
	InertiaMoment   0.399466

	Oblateness      0.00340898

	RotationPeriod  74.5605
	Obliquity       103.797
	EqAscendNode    79.3651

	AbsMagn         7.37458
	SlopeParam      4.89856
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.515 0.511 0.506)

	Surface
	{
		SurfStyle       0.394028
		OceanStyle      0.424968
		Randomize      (-0.611, -0.559, 0.334)
		colorDistMagn   0.365581
		colorDistFreq   2.56918e-007
		detailScale     0.76054
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990959
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.454532
		terraceProb     0.204753
		erosion         0
		montesMagn      0.533973
		montesFreq      2.58617
		montesSpiky     0.836426
		montesFraction  0.453258
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.63206e-006
		hillsFraction   0.772115
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272249
		craterFreq      0.225818
		craterDensity   0.984814
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1324.61
		volcanoTemp     1710.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.204, 0.202, 0.000)
		colorShelf     (0.219, 0.217, 0.215, 0.000)
		colorBeach     (0.232, 0.230, 0.228, 0.000)
		colorDesert    (0.244, 0.243, 0.240, 0.000)
		colorLowland   (0.257, 0.255, 0.253, 0.000)
		colorUpland    (0.270, 0.268, 0.266, 0.000)
		colorRock      (0.283, 0.281, 0.278, 0.000)
		colorSnow      (0.296, 0.294, 0.291, 1.000)
		BumpHeight      0.0250666
		BumpOffset      0.00501333
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0526854
		DustBright  0.909841
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.11959
		Period          10.842
		Eccentricity    0.940699
		Inclination     28.308
		AscendingNode   99.4738
		ArgOfPericenter 92.4554
		MeanAnomaly     -176.246
	}
}

Comet	"C92"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            8.4055e-014
	Radius          0.622508
	InertiaMoment   0.398218

	Oblateness      0.0052181

	RotationPeriod  72.2399
	Obliquity       57.0029
	EqAscendNode    63.9425

	AbsMagn         8.70633
	SlopeParam      3.87201
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.434 0.427 0.423)

	Surface
	{
		SurfStyle       0.469171
		OceanStyle      0.815988
		Randomize      (-0.272, 0.750, 0.565)
		colorDistMagn   0.792415
		colorDistFreq   0.000238741
		detailScale     16.9986
		colorConversion true
		snowLevel       2
		tropicLatitude  0.836383
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.256222
		terraceProb     0.274541
		erosion         0
		montesMagn      0.541338
		montesFreq      3.39961
		montesSpiky     0.885721
		montesFraction  0.818705
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00117293
		hillsFraction   0.652989
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252409
		craterFreq      0.246121
		craterDensity   0.92771
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   336.643
		volcanoTemp     1472.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.171, 0.169, 0.000)
		colorShelf     (0.184, 0.182, 0.180, 0.000)
		colorBeach     (0.195, 0.192, 0.190, 0.000)
		colorDesert    (0.206, 0.203, 0.201, 0.000)
		colorLowland   (0.217, 0.214, 0.211, 0.000)
		colorUpland    (0.228, 0.224, 0.222, 0.000)
		colorRock      (0.239, 0.235, 0.233, 0.000)
		colorSnow      (0.249, 0.246, 0.243, 1.000)
		BumpHeight      0.560257
		BumpOffset      0.112051
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.248165
		GasToDust   0.25
		Particles   1481
		GasBright   0.0736183
		DustBright  0.573395
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.05098
		Period          10.3199
		Eccentricity    0.947589
		Inclination     -179.757
		AscendingNode   176.98
		ArgOfPericenter 148.146
		MeanAnomaly     176.253
	}
}

Comet	"C93"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            6.50104e-010
	Radius          10.8306
	InertiaMoment   0.399891

	Oblateness      0.00380624

	RotationPeriod  70.0158
	Obliquity       10.2086
	EqAscendNode    48.52

	AbsMagn         10.1239
	SlopeParam      2.808
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.728 0.724 0.723)

	Surface
	{
		SurfStyle       0.359046
		OceanStyle      0.986709
		Randomize      (-0.172, 0.639, -0.104)
		colorDistMagn   0.374924
		colorDistFreq   0.0445451
		detailScale     295.747
		colorConversion true
		snowLevel       2
		tropicLatitude  0.843267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.70904
		terraceProb     0.164582
		erosion         0
		montesMagn      0.475404
		montesFreq      2.84915
		montesSpiky     0.96669
		montesFraction  0.659333
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.212365
		hillsFraction   0.768882
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259928
		craterFreq      0.250406
		craterDensity   0.851623
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   66.5987
		volcanoTemp     1041.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.290, 0.289, 0.000)
		colorShelf     (0.309, 0.308, 0.307, 0.000)
		colorBeach     (0.328, 0.326, 0.325, 0.000)
		colorDesert    (0.346, 0.344, 0.343, 0.000)
		colorLowland   (0.364, 0.362, 0.361, 0.000)
		colorUpland    (0.382, 0.380, 0.380, 0.000)
		colorRock      (0.400, 0.398, 0.398, 0.000)
		colorSnow      (0.419, 0.417, 0.416, 1.000)
		BumpHeight      9.74751
		BumpOffset      1.9495
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.729357
		GasToDust   0.25
		Particles   2453
		GasBright   0.0572921
		DustBright  0.274208
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.04803
		Period          10.2977
		Eccentricity    0.952137
		Inclination     -130.745
		AscendingNode   38.649
		ArgOfPericenter 0.59413
		MeanAnomaly     109.92
	}
}

Comet	"C94"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.00172e-017
	Radius          0.0385592
	InertiaMoment   0.398775

	Oblateness      0.00591138

	RotationPeriod  67.8728
	Obliquity       323.414
	EqAscendNode    33.0974

	AbsMagn         11.8882
	SlopeParam      6.78394
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.435 0.429 0.426)

	Surface
	{
		SurfStyle       0.732745
		OceanStyle      0.193441
		Randomize      (-0.540, 0.831, -0.284)
		colorDistMagn   0.698601
		colorDistFreq   8.87247e-008
		detailScale     1.05292
		colorConversion true
		snowLevel       2
		tropicLatitude  0.355703
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.625266
		terraceProb     0.373808
		erosion         0
		montesMagn      0.454282
		montesFreq      3.96622
		montesSpiky     0.875917
		montesFraction  0.0778779
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.09602e-006
		hillsFraction   0.425497
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272063
		craterFreq      0.174724
		craterDensity   0.999014
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1351.24
		volcanoTemp     1290.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.146, 0.119, 0.000)
		colorShelf     (0.174, 0.150, 0.136, 0.000)
		colorBeach     (0.204, 0.176, 0.162, 0.000)
		colorDesert    (0.222, 0.189, 0.158, 0.000)
		colorLowland   (0.243, 0.202, 0.179, 0.000)
		colorUpland    (0.270, 0.244, 0.217, 0.000)
		colorRock      (0.291, 0.266, 0.234, 0.000)
		colorSnow      (0.317, 0.283, 0.247, 1.000)
		BumpHeight      0.0347033
		BumpOffset      0.00694065
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.189205
		DustBright  0.626782
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.08732
		Period          10.5954
		Eccentricity    0.961938
		Inclination     152.421
		AscendingNode   -143.869
		ArgOfPericenter -0.878103
		MeanAnomaly     60.7076
	}
}

Comet	"C95"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.54819e-013
	Radius          0.666053
	InertiaMoment   0.39692

	Oblateness      0.00416251

	RotationPeriod  65.7981
	Obliquity       276.62
	EqAscendNode    17.6748

	AbsMagn         15.3372
	SlopeParam      5.16055
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.533 0.468 0.343)

	Surface
	{
		SurfStyle       0.86078
		OceanStyle      0.869447
		Randomize      (0.545, 0.824, -0.785)
		colorDistMagn   0.0217077
		colorDistFreq   0.000300068
		detailScale     18.1877
		colorConversion true
		snowLevel       2
		tropicLatitude  0.631916
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575483
		terraceProb     0.266862
		erosion         0
		montesMagn      0.547316
		montesFreq      2.96172
		montesSpiky     0.877729
		montesFraction  0.762095
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00107762
		hillsFraction   0.41703
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227978
		craterFreq      0.267541
		craterDensity   1.04408
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   265.401
		volcanoTemp     1297.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.164, 0.137, 0.050)
		colorShelf     (0.213, 0.192, 0.158, 0.040)
		colorBeach     (0.245, 0.220, 0.178, 0.030)
		colorDesert    (0.277, 0.248, 0.202, 0.020)
		colorLowland   (0.309, 0.276, 0.223, 0.030)
		colorUpland    (0.341, 0.304, 0.243, 0.050)
		colorRock      (0.373, 0.332, 0.271, 0.020)
		colorSnow      (0.373, 0.332, 0.271, 1.000)
		BumpHeight      0.599447
		BumpOffset      0.119889
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.280991
		GasToDust   0.25
		Particles   1547
		GasBright   0.145596
		DustBright  0.354876
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.36648
		Period          21.7018
		Eccentricity    0.961556
		Inclination     -118.492
		AscendingNode   161.945
		ArgOfPericenter -106.663
		MeanAnomaly     -154.929
	}
}

Comet	"C96"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.19741e-009
	Radius          15.0699
	InertiaMoment   0.399248

	Oblateness      0.00669241

	RotationPeriod  63.7809
	Obliquity       229.826
	EqAscendNode    2.25219

	AbsMagn         3.01766
	SlopeParam      4.1015
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.478 0.469 0.465)

	Surface
	{
		SurfStyle       0.123617
		OceanStyle      0.102717
		Randomize      (-0.191, -0.193, -0.146)
		colorDistMagn   0.437898
		colorDistFreq   0.14671
		detailScale     411.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.834007
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.353059
		terraceProb     0.262367
		erosion         0
		montesMagn      0.657297
		montesFreq      3.25934
		montesSpiky     0.824296
		montesFraction  0.122097
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.462678
		hillsFraction   0.492671
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232315
		craterFreq      0.179126
		craterDensity   1.0114
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   68.2804
		volcanoTemp     1925.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.187, 0.186, 0.000)
		colorShelf     (0.203, 0.199, 0.198, 0.000)
		colorBeach     (0.215, 0.211, 0.209, 0.000)
		colorDesert    (0.227, 0.223, 0.221, 0.000)
		colorLowland   (0.239, 0.234, 0.233, 0.000)
		colorUpland    (0.251, 0.246, 0.244, 0.000)
		colorRock      (0.263, 0.258, 0.256, 0.000)
		colorSnow      (0.275, 0.269, 0.267, 1.000)
		BumpHeight      13.5629
		BumpOffset      2.71259
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.762183
		GasToDust   0.25
		Particles   2519
		GasBright   0.344699
		DustBright  0.64026
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.54683
		Period          6.75925
		Eccentricity    0.933323
		Inclination     -6.8049
		AscendingNode   -168.818
		ArgOfPericenter -10.9962
		MeanAnomaly     85.0513
	}
}

Comet	"C97"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.68692e-017
	Radius          0.0407155
	InertiaMoment   0.397886

	Oblateness      0.00454068

	RotationPeriod  61.8121
	Obliquity       183.031
	EqAscendNode    346.83

	AbsMagn         5.15756
	SlopeParam      3.07208
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.615 0.612 0.606)

	Surface
	{
		SurfStyle       0.0555242
		OceanStyle      0.579835
		Randomize      (0.812, -0.864, 0.207)
		colorDistMagn   0.767146
		colorDistFreq   9.83305e-007
		detailScale     1.1118
		colorConversion true
		snowLevel       2
		tropicLatitude  0.371127
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.608404
		terraceProb     0.322525
		erosion         0
		montesMagn      0.614953
		montesFreq      3.46241
		montesSpiky     0.896971
		montesFraction  0.502546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.34953e-006
		hillsFraction   0.558582
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242664
		craterFreq      0.225046
		craterDensity   0.831332
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1051.32
		volcanoTemp     1779.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.245, 0.242, 0.000)
		colorShelf     (0.262, 0.260, 0.257, 0.000)
		colorBeach     (0.277, 0.275, 0.273, 0.000)
		colorDesert    (0.292, 0.291, 0.288, 0.000)
		colorLowland   (0.308, 0.306, 0.303, 0.000)
		colorUpland    (0.323, 0.321, 0.318, 0.000)
		colorRock      (0.338, 0.337, 0.333, 0.000)
		colorSnow      (0.354, 0.352, 0.348, 1.000)
		BumpHeight      0.0366439
		BumpOffset      0.00732878
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.273809
		DustBright  0.395637
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.58211
		Period          14.5779
		Eccentricity    0.972098
		Inclination     18.8773
		AscendingNode   17.6201
		ArgOfPericenter -28.7022
		MeanAnomaly     129.332
	}
}

Comet	"C98"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.85157e-013
	Radius          0.933461
	InertiaMoment   0.399683

	Oblateness      0.00758867

	RotationPeriod  59.8838
	Obliquity       136.237
	EqAscendNode    331.407

	AbsMagn         6.68177
	SlopeParam      7.59281
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.559 0.557 0.554)

	Surface
	{
		SurfStyle       0.472707
		OceanStyle      0.277949
		Randomize      (0.415, -0.012, -0.843)
		colorDistMagn   0.320185
		colorDistFreq   0.000450032
		detailScale     25.4897
		colorConversion true
		snowLevel       2
		tropicLatitude  0.443468
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.445287
		terraceProb     0.294741
		erosion         0
		montesMagn      0.581333
		montesFreq      2.77702
		montesSpiky     0.989958
		montesFraction  0.66704
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00170919
		hillsFraction   0.745519
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215492
		craterFreq      0.177748
		craterDensity   0.973228
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   274.069
		volcanoTemp     1347.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.223, 0.222, 0.000)
		colorShelf     (0.238, 0.237, 0.235, 0.000)
		colorBeach     (0.252, 0.251, 0.249, 0.000)
		colorDesert    (0.266, 0.265, 0.263, 0.000)
		colorLowland   (0.280, 0.279, 0.277, 0.000)
		colorUpland    (0.294, 0.293, 0.291, 0.000)
		colorRock      (0.308, 0.307, 0.305, 0.000)
		colorSnow      (0.322, 0.320, 0.319, 1.000)
		BumpHeight      0.840115
		BumpOffset      0.168023
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.313817
		GasToDust   0.25
		Particles   1613
		GasBright   0.165659
		DustBright  0.188273
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.92836
		Period          17.6064
		Eccentricity    0.983968
		Inclination     -17.8465
		AscendingNode   -170.122
		ArgOfPericenter -31.4321
		MeanAnomaly     80.8974
	}
}

Comet	"C99"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.20548e-009
	Radius          24.1665
	InertiaMoment   0.398514

	Oblateness      0.0180769

	RotationPeriod  57.989
	Obliquity       89.4428
	EqAscendNode    315.984

	AbsMagn         8.0308
	SlopeParam      5.44422
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.608 0.603 0.597)

	Surface
	{
		SurfStyle       0.929391
		OceanStyle      0.0355874
		Randomize      (0.023, 0.958, -0.938)
		colorDistMagn   0.377967
		colorDistFreq   0.217174
		detailScale     659.907
		colorConversion true
		snowLevel       2
		tropicLatitude  0.761099
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.576387
		terraceProb     0.510852
		erosion         0
		montesMagn      0.531109
		montesFreq      2.76644
		montesSpiky     0.886591
		montesFraction  0.677251
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.18318
		hillsFraction   0.677512
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250424
		craterFreq      0.273475
		craterDensity   0.912049
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   80.6804
		volcanoTemp     1785.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.211, 0.239, 0.050)
		colorShelf     (0.243, 0.247, 0.275, 0.040)
		colorBeach     (0.280, 0.283, 0.310, 0.030)
		colorDesert    (0.316, 0.320, 0.352, 0.020)
		colorLowland   (0.353, 0.356, 0.388, 0.030)
		colorUpland    (0.389, 0.392, 0.424, 0.050)
		colorRock      (0.426, 0.428, 0.471, 0.020)
		colorSnow      (0.426, 0.428, 0.471, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.795008
		GasToDust   0.25
		Particles   2585
		GasBright   0.02272
		DustBright  0.815699
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.74308
		Period          15.9622
		Eccentricity    0.972772
		Inclination     62.1408
		AscendingNode   -136.766
		ArgOfPericenter -120.269
		MeanAnomaly     -128.083
	}
}

Comet	"C100"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            6.79083e-017
	Radius          0.0578203
	InertiaMoment   0.395915

	Oblateness      0.00850166

	RotationPeriod  56.1215
	Obliquity       42.6485
	EqAscendNode    300.562

	AbsMagn         9.38344
	SlopeParam      4.33234
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.451 0.446 0.442)

	Surface
	{
		SurfStyle       0.00402597
		OceanStyle      0.570183
		Randomize      (0.059, 0.063, 0.852)
		colorDistMagn   0.433449
		colorDistFreq   1.71446e-006
		detailScale     1.57888
		colorConversion true
		snowLevel       2
		tropicLatitude  0.787986
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.442971
		terraceProb     0.151812
		erosion         0
		montesMagn      0.442309
		montesFreq      2.21695
		montesSpiky     0.954922
		montesFraction  0.45085
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.81708e-006
		hillsFraction   0.482208
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225963
		craterFreq      0.22744
		craterDensity   0.840032
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1100.08
		volcanoTemp     1599.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.178, 0.177, 0.000)
		colorShelf     (0.192, 0.189, 0.188, 0.000)
		colorBeach     (0.203, 0.201, 0.199, 0.000)
		colorDesert    (0.214, 0.212, 0.210, 0.000)
		colorLowland   (0.226, 0.223, 0.221, 0.000)
		colorUpland    (0.237, 0.234, 0.232, 0.000)
		colorRock      (0.248, 0.245, 0.243, 0.000)
		colorSnow      (0.259, 0.256, 0.254, 1.000)
		BumpHeight      0.0520383
		BumpOffset      0.0104077
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0450451
		DustBright  0.477861
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.2146
		Period          20.25
		Eccentricity    0.980191
		Inclination     -149.266
		AscendingNode   -87.2637
		ArgOfPericenter -81.5732
		MeanAnomaly     -63.5171
	}
}

Comet	"C101"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            5.25222e-013
	Radius          1.43488
	InertiaMoment   0.399021

	Oblateness      0.0181717

	RotationPeriod  54.2756
	Obliquity       355.854
	EqAscendNode    285.139

	AbsMagn         10.9223
	SlopeParam      3.32086
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.571 0.568 0.565)

	Surface
	{
		SurfStyle       0.592313
		OceanStyle      0.956822
		Randomize      (0.499, -0.419, 0.567)
		colorDistMagn   0.742685
		colorDistFreq   0.00110926
		detailScale     39.1817
		colorConversion true
		snowLevel       2
		tropicLatitude  0.321719
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.759156
		terraceProb     0.191343
		erosion         0
		montesMagn      0.441781
		montesFreq      2.62444
		montesSpiky     0.914615
		montesFraction  0.472166
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00549757
		hillsFraction   0.742694
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235209
		craterFreq      0.214568
		craterDensity   0.960598
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   310.42
		volcanoTemp     1591.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.193, 0.158, 0.000)
		colorShelf     (0.228, 0.199, 0.181, 0.000)
		colorBeach     (0.268, 0.233, 0.215, 0.000)
		colorDesert    (0.291, 0.250, 0.209, 0.000)
		colorLowland   (0.320, 0.267, 0.237, 0.000)
		colorUpland    (0.354, 0.324, 0.288, 0.000)
		colorRock      (0.383, 0.352, 0.311, 0.000)
		colorSnow      (0.417, 0.375, 0.328, 1.000)
		BumpHeight      1.29139
		BumpOffset      0.258278
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.346642
		GasToDust   0.25
		Particles   1680
		GasBright   0.0301111
		DustBright  0.177281
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.62554
		Period          14.9472
		Eccentricity    0.966577
		Inclination     -158.069
		AscendingNode   -36.7777
		ArgOfPericenter 17.0495
		MeanAnomaly     -158.176
	}
}

Comet	"C102"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.06222e-009
	Radius          22.5978
	InertiaMoment   0.397482

	Oblateness      0.00977249

	RotationPeriod  52.4461
	Obliquity       309.06
	EqAscendNode    269.717

	AbsMagn         13.119
	SlopeParam      2.07732
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.573 0.566 0.563)

	Surface
	{
		SurfStyle       0.374034
		OceanStyle      0.204104
		Randomize      (0.776, 0.188, -0.128)
		colorDistMagn   0.424673
		colorDistFreq   0.381639
		detailScale     617.07
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993848
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.314463
		terraceProb     0.16224
		erosion         0
		montesMagn      0.334209
		montesFreq      3.36539
		montesSpiky     0.975811
		montesFraction  0.329759
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.12415
		hillsFraction   0.541186
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264796
		craterFreq      0.199498
		craterDensity   0.793234
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   55.5892
		volcanoTemp     1752.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.227, 0.225, 0.000)
		colorShelf     (0.243, 0.241, 0.239, 0.000)
		colorBeach     (0.258, 0.255, 0.253, 0.000)
		colorDesert    (0.272, 0.269, 0.267, 0.000)
		colorLowland   (0.286, 0.283, 0.281, 0.000)
		colorUpland    (0.301, 0.297, 0.295, 0.000)
		colorRock      (0.315, 0.311, 0.309, 0.000)
		colorSnow      (0.329, 0.326, 0.323, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.827834
		GasToDust   0.25
		Particles   2652
		GasBright   0.141305
		DustBright  0.550573
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.7742
		Period          8.30303
		Eccentricity    0.966105
		Inclination     -38.6388
		AscendingNode   -38.1192
		ArgOfPericenter 143.795
		MeanAnomaly     -31.3789
	}
}

Comet	"C103"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.25079e-016
	Radius          0.087018
	InertiaMoment   0.399472

	Oblateness      0.0195929

	RotationPeriod  50.628
	Obliquity       262.266
	EqAscendNode    254.294

	AbsMagn         0.971509
	SlopeParam      5.76049
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.697 0.694 0.688)

	Surface
	{
		SurfStyle       0.374914
		OceanStyle      0.280673
		Randomize      (-0.349, -0.959, 0.959)
		colorDistMagn   0.916046
		colorDistFreq   6.13406e-006
		detailScale     2.37617
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997465
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.677149
		terraceProb     0.212887
		erosion         0
		montesMagn      0.252056
		montesFreq      3.96641
		montesSpiky     0.871328
		montesFraction  0.545862
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.43659e-005
		hillsFraction   0.648595
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222351
		craterFreq      0.202248
		craterDensity   0.795049
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1219.9
		volcanoTemp     1010.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.277, 0.275, 0.000)
		colorShelf     (0.296, 0.295, 0.292, 0.000)
		colorBeach     (0.314, 0.312, 0.309, 0.000)
		colorDesert    (0.331, 0.330, 0.327, 0.000)
		colorLowland   (0.348, 0.347, 0.344, 0.000)
		colorUpland    (0.366, 0.364, 0.361, 0.000)
		colorRock      (0.383, 0.382, 0.378, 0.000)
		colorSnow      (0.401, 0.399, 0.395, 1.000)
		BumpHeight      0.0783162
		BumpOffset      0.0156632
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0990893
		DustBright  0.277276
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.43985
		Period          13.3899
		Eccentricity    0.950176
		Inclination     114.127
		AscendingNode   88.9769
		ArgOfPericenter 75.836
		MeanAnomaly     -98.9546
	}
}

Comet	"C104"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            9.67395e-013
	Radius          1.39976
	InertiaMoment   0.398226

	Oblateness      0.0112882

	RotationPeriod  48.8165
	Obliquity       215.471
	EqAscendNode    238.871

	AbsMagn         4.20938
	SlopeParam      4.56771
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.541 0.536 0.534)

	Surface
	{
		SurfStyle       0.478889
		OceanStyle      0.384629
		Randomize      (0.603, 0.200, 0.494)
		colorDistMagn   0.235682
		colorDistFreq   0.00145458
		detailScale     38.2226
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984096
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.336191
		terraceProb     0.344326
		erosion         0
		montesMagn      0.403009
		montesFreq      2.58735
		montesSpiky     0.990093
		montesFraction  0.639315
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00596937
		hillsFraction   0.741806
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230859
		craterFreq      0.166025
		craterDensity   1.03028
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   223.129
		volcanoTemp     997.153
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.215, 0.214, 0.000)
		colorShelf     (0.230, 0.228, 0.227, 0.000)
		colorBeach     (0.244, 0.241, 0.240, 0.000)
		colorDesert    (0.257, 0.255, 0.254, 0.000)
		colorLowland   (0.271, 0.268, 0.267, 0.000)
		colorUpland    (0.284, 0.282, 0.280, 0.000)
		colorRock      (0.298, 0.295, 0.294, 0.000)
		colorSnow      (0.311, 0.308, 0.307, 1.000)
		BumpHeight      1.25978
		BumpOffset      0.251956
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.379468
		GasToDust   0.25
		Particles   1746
		GasBright   0.277474
		DustBright  0.583378
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.6996
		Period          15.5841
		Eccentricity    0.965932
		Inclination     -100.908
		AscendingNode   92.3663
		ArgOfPericenter 141.755
		MeanAnomaly     -122.845
	}
}

Comet	"C105"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            7.4821e-009
	Radius          33.533
	InertiaMoment   0.399896

	Oblateness      0.0217768

	RotationPeriod  47.0072
	Obliquity       168.677
	EqAscendNode    223.449

	AbsMagn         5.94664
	SlopeParam      3.55951
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.747 0.745 0.743)

	Surface
	{
		SurfStyle       0.471051
		OceanStyle      0.19305
		Randomize      (-0.714, -0.401, -0.549)
		colorDistMagn   0.205077
		colorDistFreq   0.579976
		detailScale     915.675
		colorConversion true
		snowLevel       2
		tropicLatitude  0.8546
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.693289
		terraceProb     0.505915
		erosion         0
		montesMagn      0.365246
		montesFreq      1.92627
		montesSpiky     0.982441
		montesFraction  0.54577
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.07165
		hillsFraction   0.672915
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257251
		craterFreq      0.188278
		craterDensity   0.890103
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   60.7809
		volcanoTemp     1475.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.298, 0.297, 0.000)
		colorShelf     (0.317, 0.317, 0.316, 0.000)
		colorBeach     (0.336, 0.335, 0.334, 0.000)
		colorDesert    (0.355, 0.354, 0.353, 0.000)
		colorLowland   (0.373, 0.372, 0.372, 0.000)
		colorUpland    (0.392, 0.391, 0.390, 0.000)
		colorRock      (0.411, 0.410, 0.409, 0.000)
		colorSnow      (0.429, 0.428, 0.427, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.86066
		GasToDust   0.25
		Particles   2718
		GasBright   0.207976
		DustBright  0.337363
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.1183
		Period          19.3468
		Eccentricity    0.969452
		Inclination     127.745
		AscendingNode   -58.5768
		ArgOfPericenter -143.637
		MeanAnomaly     -139.736
	}
}

Comet	"C106"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.3038e-016
	Radius          0.0867039
	InertiaMoment   0.398781

	Oblateness      0.0131703

	RotationPeriod  45.1953
	Obliquity       121.883
	EqAscendNode    208.026

	AbsMagn         7.35615
	SlopeParam      2.41436
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.532 0.419 0.320)

	Surface
	{
		SurfStyle       0.62738
		OceanStyle      0.211982
		Randomize      (-0.070, 0.316, 0.002)
		colorDistMagn   0.62109
		colorDistFreq   3.46169e-006
		detailScale     2.36759
		colorConversion true
		snowLevel       2
		tropicLatitude  0.916176
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49007
		terraceProb     0.338634
		erosion         0
		montesMagn      0.580584
		montesFreq      3.4055
		montesSpiky     0.913003
		montesFraction  0.695184
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.78929e-005
		hillsFraction   0.848746
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228133
		craterFreq      0.163174
		craterDensity   0.794261
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   895.617
		volcanoTemp     1317.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.142, 0.090, 0.000)
		colorShelf     (0.213, 0.147, 0.102, 0.000)
		colorBeach     (0.250, 0.172, 0.122, 0.000)
		colorDesert    (0.271, 0.184, 0.118, 0.000)
		colorLowland   (0.298, 0.197, 0.134, 0.000)
		colorUpland    (0.330, 0.239, 0.163, 0.000)
		colorRock      (0.356, 0.260, 0.176, 0.000)
		colorSnow      (0.388, 0.276, 0.186, 1.000)
		BumpHeight      0.0780335
		BumpOffset      0.0156067
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.101219
		DustBright  0.128607
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.96315
		Period          17.921
		Eccentricity    0.958498
		Inclination     -124.249
		AscendingNode   -173.992
		ArgOfPericenter 101.022
		MeanAnomaly     -118.089
	}
}

Comet	"C107"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.78182e-012
	Radius          2.05535
	InertiaMoment   0.396937

	Oblateness      0.0244568

	RotationPeriod  43.3763
	Obliquity       75.0884
	EqAscendNode    192.604

	AbsMagn         8.68784
	SlopeParam      6.12846
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.711 0.709 0.706)

	Surface
	{
		SurfStyle       0.760427
		OceanStyle      0.462221
		Randomize      (0.848, -0.294, -0.104)
		colorDistMagn   0.486004
		colorDistFreq   0.00125222
		detailScale     56.1249
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997361
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.650739
		terraceProb     0.13731
		erosion         0
		montesMagn      0.505102
		montesFreq      2.46056
		montesSpiky     0.872527
		montesFraction  0.444706
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00889735
		hillsFraction   0.915503
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227679
		craterFreq      0.199802
		craterDensity   0.776458
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   241.413
		volcanoTemp     1421.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.241, 0.198, 0.000)
		colorShelf     (0.285, 0.248, 0.226, 0.000)
		colorBeach     (0.334, 0.291, 0.268, 0.000)
		colorDesert    (0.363, 0.312, 0.261, 0.000)
		colorLowland   (0.398, 0.333, 0.296, 0.000)
		colorUpland    (0.441, 0.404, 0.360, 0.000)
		colorRock      (0.477, 0.439, 0.388, 0.000)
		colorSnow      (0.519, 0.468, 0.409, 1.000)
		BumpHeight      1.84982
		BumpOffset      0.369964
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.412294
		GasToDust   0.25
		Particles   1812
		GasBright   0.356771
		DustBright  0.357541
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.82619
		Period          16.6931
		Eccentricity    0.959479
		Inclination     165.329
		AscendingNode   136.098
		ArgOfPericenter -167.394
		MeanAnomaly     -2.93846
	}
}

Comet	"C108"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.37811e-008
	Radius          33.8864
	InertiaMoment   0.399254

	Oblateness      0.0155822

	RotationPeriod  41.5454
	Obliquity       28.2941
	EqAscendNode    177.181

	AbsMagn         10.103
	SlopeParam      4.81124
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.685 0.680 0.677)

	Surface
	{
		SurfStyle       0.674377
		OceanStyle      0.325797
		Randomize      (-0.691, 0.271, 0.224)
		colorDistMagn   0.669204
		colorDistFreq   0.822933
		detailScale     925.324
		colorConversion true
		snowLevel       2
		tropicLatitude  0.912227
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.367054
		terraceProb     0.273385
		erosion         0
		montesMagn      0.626086
		montesFreq      3.05177
		montesSpiky     0.994463
		montesFraction  0.752928
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.81692
		hillsFraction   0.730796
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250966
		craterFreq      0.187861
		craterDensity   1.07344
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   45.2574
		volcanoTemp     1617.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.231, 0.189, 0.000)
		colorShelf     (0.274, 0.238, 0.216, 0.000)
		colorBeach     (0.322, 0.279, 0.257, 0.000)
		colorDesert    (0.349, 0.299, 0.250, 0.000)
		colorLowland   (0.383, 0.319, 0.284, 0.000)
		colorUpland    (0.425, 0.387, 0.345, 0.000)
		colorRock      (0.459, 0.421, 0.372, 0.000)
		colorSnow      (0.500, 0.448, 0.392, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.893486
		GasToDust   0.25
		Particles   2784
		GasBright   0.023332
		DustBright  0.375466
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.12214
		Period          10.8616
		Eccentricity    0.935972
		Inclination     -93.4261
		AscendingNode   -12.2907
		ArgOfPericenter -5.78846
		MeanAnomaly     82.1518
	}
}

Comet	"C109"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.24329e-016
	Radius          0.126252
	InertiaMoment   0.397895

	Oblateness      0.0285199

	RotationPeriod  39.6977
	Obliquity       341.5
	EqAscendNode    161.759

	AbsMagn         11.8592
	SlopeParam      3.79203
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.680 0.548 0.470)

	Surface
	{
		SurfStyle       0.688833
		OceanStyle      0.42007
		Randomize      (-0.677, 0.141, -0.156)
		colorDistMagn   0.54395
		colorDistFreq   3.2749e-007
		detailScale     3.44752
		colorConversion true
		snowLevel       2
		tropicLatitude  0.952865
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427438
		terraceProb     0.164037
		erosion         0
		montesMagn      0.292831
		montesFreq      3.57474
		montesSpiky     0.89146
		montesFraction  0.800667
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.44449e-005
		hillsFraction   0.435475
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.199908
		craterFreq      0.224012
		craterDensity   0.854845
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   960.931
		volcanoTemp     1122.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.186, 0.132, 0.000)
		colorShelf     (0.272, 0.192, 0.151, 0.000)
		colorBeach     (0.320, 0.225, 0.179, 0.000)
		colorDesert    (0.347, 0.241, 0.174, 0.000)
		colorLowland   (0.381, 0.258, 0.198, 0.000)
		colorUpland    (0.422, 0.312, 0.240, 0.000)
		colorRock      (0.456, 0.340, 0.259, 0.000)
		colorSnow      (0.496, 0.362, 0.273, 1.000)
		BumpHeight      0.113627
		BumpOffset      0.0227253
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.103831
		DustBright  0.779454
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.48837
		Period          13.7913
		Eccentricity    0.962512
		Inclination     55.8434
		AscendingNode   150.729
		ArgOfPericenter 30.76
		MeanAnomaly     156.619
	}
}

Comet	"C110"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            3.28188e-012
	Radius          2.099
	InertiaMoment   0.399688

	Oblateness      0.0187881

	RotationPeriod  37.8278
	Obliquity       294.706
	EqAscendNode    146.336

	AbsMagn         15.2414
	SlopeParam      2.71141
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.663 0.661 0.659)

	Surface
	{
		SurfStyle       0.527052
		OceanStyle      0.824741
		Randomize      (-0.465, 0.485, 0.885)
		colorDistMagn   0.831763
		colorDistFreq   0.00208786
		detailScale     57.3167
		colorConversion true
		snowLevel       2
		tropicLatitude  0.905781
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.367351
		terraceProb     0.376802
		erosion         0
		montesMagn      0.58558
		montesFreq      3.55823
		montesSpiky     0.890224
		montesFraction  0.471596
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0112545
		hillsFraction   0.494487
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211594
		craterFreq      0.208389
		craterDensity   1.04708
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   181.659
		volcanoTemp     1161.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.225, 0.184, 0.000)
		colorShelf     (0.265, 0.231, 0.211, 0.000)
		colorBeach     (0.312, 0.271, 0.250, 0.000)
		colorDesert    (0.338, 0.291, 0.244, 0.000)
		colorLowland   (0.371, 0.311, 0.277, 0.000)
		colorUpland    (0.411, 0.377, 0.336, 0.000)
		colorRock      (0.444, 0.410, 0.362, 0.000)
		colorSnow      (0.484, 0.436, 0.382, 1.000)
		BumpHeight      1.8891
		BumpOffset      0.37782
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.44512
		GasToDust   0.25
		Particles   1879
		GasBright   0.100266
		DustBright  0.467505
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.41309
		Period          22.1542
		Eccentricity    0.968959
		Inclination     -0.651405
		AscendingNode   124.291
		ArgOfPericenter -137.398
		MeanAnomaly     -161.472
	}
}

Comet	"C111"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            2.5383e-008
	Radius          49.0024
	InertiaMoment   0.398521

	Oblateness      0.03411

	RotationPeriod  35.93
	Obliquity       247.911
	EqAscendNode    130.913

	AbsMagn         2.97787
	SlopeParam      6.58767
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.705 0.702 0.700)

	Surface
	{
		SurfStyle       0.240813
		OceanStyle      0.480766
		Randomize      (-0.046, -0.312, 0.204)
		colorDistMagn   0.73455
		colorDistFreq   0.783275
		detailScale     1338.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0.89841
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.540758
		terraceProb     0.377275
		erosion         0
		montesMagn      0.580736
		montesFreq      3.60673
		montesSpiky     0.858422
		montesFraction  0.369999
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.15689
		hillsFraction   0.814781
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217898
		craterFreq      0.192104
		craterDensity   0.830824
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   48.2227
		volcanoTemp     1548.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.281, 0.280, 0.000)
		colorShelf     (0.300, 0.298, 0.298, 0.000)
		colorBeach     (0.317, 0.316, 0.315, 0.000)
		colorDesert    (0.335, 0.333, 0.333, 0.000)
		colorLowland   (0.352, 0.351, 0.350, 0.000)
		colorUpland    (0.370, 0.369, 0.368, 0.000)
		colorRock      (0.388, 0.386, 0.385, 0.000)
		colorSnow      (0.405, 0.404, 0.403, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.926312
		GasToDust   0.25
		Particles   2851
		GasBright   0.0594425
		DustBright  0.192815
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.22113
		Period          20.3117
		Eccentricity    0.972263
		Inclination     140.059
		AscendingNode   75.311
		ArgOfPericenter 100.254
		MeanAnomaly     -45.078
	}
}

Comet	"C112"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            7.81563e-016
	Radius          0.130017
	InertiaMoment   0.395956

	Oblateness      0.0228897

	RotationPeriod  33.9981
	Obliquity       201.117
	EqAscendNode    115.491

	AbsMagn         5.13408
	SlopeParam      5.06748
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.800 0.711 0.653)

	Surface
	{
		SurfStyle       0.386266
		OceanStyle      0.860718
		Randomize      (0.003, -0.906, -0.954)
		colorDistMagn   0.544969
		colorDistFreq   9.58148e-006
		detailScale     3.55033
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992218
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.309692
		terraceProb     0.641114
		erosion         0
		montesMagn      0.566323
		montesFreq      2.73278
		montesSpiky     0.781002
		montesFraction  0.409311
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.89453e-005
		hillsFraction   0.617588
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246665
		craterFreq      0.193341
		craterDensity   0.815226
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   729.163
		volcanoTemp     1391.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.284, 0.261, 0.000)
		colorShelf     (0.340, 0.302, 0.278, 0.000)
		colorBeach     (0.360, 0.320, 0.294, 0.000)
		colorDesert    (0.380, 0.338, 0.310, 0.000)
		colorLowland   (0.400, 0.355, 0.326, 0.000)
		colorUpland    (0.420, 0.373, 0.343, 0.000)
		colorRock      (0.440, 0.391, 0.359, 0.000)
		colorSnow      (0.460, 0.409, 0.375, 1.000)
		BumpHeight      0.117015
		BumpOffset      0.0234031
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.217109
		DustBright  0.519636
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.15034
		Period          11.0788
		Eccentricity    0.981153
		Inclination     -83.9461
		AscendingNode   85.8168
		ArgOfPericenter -146.598
		MeanAnomaly     57.5329
	}
}

Comet	"C113"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            6.04483e-012
	Radius          3.0175
	InertiaMoment   0.399027

	Oblateness      0.0421788

	RotationPeriod  32.0249
	Obliquity       154.323
	EqAscendNode    100.068

	AbsMagn         6.66253
	SlopeParam      4.02177
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.743 0.741 0.739)

	Surface
	{
		SurfStyle       0.173332
		OceanStyle      0.325909
		Randomize      (0.487, 0.099, -0.577)
		colorDistMagn   0.933188
		colorDistFreq   0.00557545
		detailScale     82.3979
		colorConversion true
		snowLevel       2
		tropicLatitude  0.350066
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.305011
		terraceProb     0.231351
		erosion         0
		montesMagn      0.414826
		montesFreq      3.0187
		montesSpiky     0.955987
		montesFraction  0.672302
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0226417
		hillsFraction   0.637932
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243
		craterFreq      0.183278
		craterDensity   0.88176
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   192.425
		volcanoTemp     1605.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.296, 0.296, 0.000)
		colorShelf     (0.316, 0.315, 0.314, 0.000)
		colorBeach     (0.334, 0.333, 0.333, 0.000)
		colorDesert    (0.353, 0.352, 0.351, 0.000)
		colorLowland   (0.371, 0.370, 0.370, 0.000)
		colorUpland    (0.390, 0.389, 0.388, 0.000)
		colorRock      (0.409, 0.407, 0.407, 0.000)
		colorSnow      (0.427, 0.426, 0.425, 1.000)
		BumpHeight      2.71575
		BumpOffset      0.54315
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.477946
		GasToDust   0.25
		Particles   1945
		GasBright   0.149003
		DustBright  0.272228
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.74187
		Period          15.9516
		Eccentricity    0.964629
		Inclination     8.44693
		AscendingNode   44.6855
		ArgOfPericenter -142.73
		MeanAnomaly     84.4603
	}
}

Comet	"C114"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            4.67524e-008
	Radius          50.8146
	InertiaMoment   0.397494

	Oblateness      0.0295027

	RotationPeriod  30.0025
	Obliquity       107.528
	EqAscendNode    84.6456

	AbsMagn         8.01259
	SlopeParam      2.98238
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.509 0.502 0.494)

	Surface
	{
		SurfStyle       0.981088
		OceanStyle      0.448296
		Randomize      (-0.162, 0.207, -0.220)
		colorDistMagn   0.538155
		colorDistFreq   0.0555384
		detailScale     1387.58
		colorConversion true
		snowLevel       2
		tropicLatitude  0.821645
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.388504
		terraceProb     0.218249
		erosion         0
		montesMagn      0.551624
		montesFreq      2.7996
		montesSpiky     0.962543
		montesFraction  0.493012
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.18989
		hillsFraction   0.632294
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235707
		craterFreq      0.238673
		craterDensity   0.880258
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   36.8462
		volcanoTemp     1575.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.176, 0.198, 0.050)
		colorShelf     (0.204, 0.206, 0.227, 0.040)
		colorBeach     (0.234, 0.236, 0.257, 0.030)
		colorDesert    (0.265, 0.266, 0.292, 0.020)
		colorLowland   (0.295, 0.296, 0.321, 0.030)
		colorUpland    (0.326, 0.326, 0.351, 0.050)
		colorRock      (0.356, 0.357, 0.390, 0.020)
		colorSnow      (0.356, 0.357, 0.390, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.959138
		GasToDust   0.25
		Particles   2917
		GasBright   0.37386
		DustBright  0.531858
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.73937
		Period          8.05973
		Eccentricity    0.979207
		Inclination     -52.9985
		AscendingNode   9.42513
		ArgOfPericenter 9.51689
		MeanAnomaly     98.4562
	}
}

Comet	"C115"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.43954e-015
	Radius          0.185959
	InertiaMoment   0.399477

	Oblateness      0.0546245

	RotationPeriod  27.9216
	Obliquity       60.734
	EqAscendNode    69.223

	AbsMagn         9.36413
	SlopeParam      7.24944
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.585 0.581 0.575)

	Surface
	{
		SurfStyle       0.351876
		OceanStyle      0.132217
		Randomize      (0.017, -0.480, -0.781)
		colorDistMagn   0.482425
		colorDistFreq   5.19355e-006
		detailScale     5.07791
		colorConversion true
		snowLevel       2
		tropicLatitude  0.704994
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.627475
		terraceProb     0.411287
		erosion         0
		montesMagn      0.506738
		montesFreq      3.44029
		montesSpiky     0.809403
		montesFraction  0.423943
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.45393e-005
		hillsFraction   0.678355
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257621
		craterFreq      0.230802
		craterDensity   0.957206
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   768.44
		volcanoTemp     1520.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.233, 0.230, 0.000)
		colorShelf     (0.249, 0.247, 0.244, 0.000)
		colorBeach     (0.263, 0.262, 0.259, 0.000)
		colorDesert    (0.278, 0.276, 0.273, 0.000)
		colorLowland   (0.293, 0.291, 0.287, 0.000)
		colorUpland    (0.307, 0.305, 0.302, 0.000)
		colorRock      (0.322, 0.320, 0.316, 0.000)
		colorSnow      (0.336, 0.334, 0.330, 1.000)
		BumpHeight      0.167363
		BumpOffset      0.0334725
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0295802
		GasToDust   0.25
		Particles   1039
		GasBright   0.278472
		DustBright  0.311733
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.09052
		Period          19.0889
		Eccentricity    0.974085
		Inclination     51.5698
		AscendingNode   -126.382
		ArgOfPericenter -59.2478
		MeanAnomaly     42.4349
	}
}

Comet	"C116"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            1.11338e-011
	Radius          3.14758
	InertiaMoment   0.398234

	Oblateness      0.040016

	RotationPeriod  25.7713
	Obliquity       13.9397
	EqAscendNode    53.8004

	AbsMagn         10.8986
	SlopeParam      5.34263
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.459 0.452 0.449)

	Surface
	{
		SurfStyle       0.207683
		OceanStyle      0.523171
		Randomize      (0.253, -0.817, -0.396)
		colorDistMagn   0.674953
		colorDistFreq   0.00343615
		detailScale     85.95
		colorConversion true
		snowLevel       2
		tropicLatitude  0.27707
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.319355
		terraceProb     0.200593
		erosion         0
		montesMagn      0.34243
		montesFreq      2.31529
		montesSpiky     0.723968
		montesFraction  0.392934
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0291003
		hillsFraction   0.593433
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271517
		craterFreq      0.231016
		craterDensity   0.879056
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   147.898
		volcanoTemp     1166.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.181, 0.179, 0.000)
		colorShelf     (0.195, 0.192, 0.191, 0.000)
		colorBeach     (0.207, 0.203, 0.202, 0.000)
		colorDesert    (0.218, 0.215, 0.213, 0.000)
		colorLowland   (0.230, 0.226, 0.224, 0.000)
		colorUpland    (0.241, 0.237, 0.235, 0.000)
		colorRock      (0.252, 0.248, 0.247, 0.000)
		colorSnow      (0.264, 0.260, 0.258, 1.000)
		BumpHeight      2.83282
		BumpOffset      0.566565
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.510772
		GasToDust   0.25
		Particles   2011
		GasBright   0.00847914
		DustBright  0.266212
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.48455
		Period          13.7595
		Eccentricity    0.976775
		Inclination     177.476
		AscendingNode   145.654
		ArgOfPericenter 171.814
		MeanAnomaly     102.835
	}
}

Comet	"C117"
{
	ParentBody     "RS 8476-1353-8-11843423-374"
	Class	       "Asteroid"

	Mass            8.6112e-008
	Radius          72.3517
	InertiaMoment   0.399902

	Oblateness      0.0757977

	RotationPeriod  23.5386
	Obliquity       327.145
	EqAscendNode    38.3778

	AbsMagn         13.078
	SlopeParam      4.25179
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.752 0.750 0.748)

	Surface
	{
		SurfStyle       0.304828
		OceanStyle      0.28526
		Randomize      (-0.789, -0.981, 0.991)
		colorDistMagn   0.103328
		colorDistFreq   1.78475
		detailScale     1975.68
		colorConversion true
		snowLevel       2
		tropicLatitude  0.575942
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470313
		terraceProb     0.203806
		erosion         0
		montesMagn      0.653809
		montesFreq      3.34684
		montesSpiky     0.99976
		montesFraction  0.420813
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.1565
		hillsFraction   0.610873
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24591
		craterFreq      0.226592
		craterDensity   0.899046
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.6565
		volcanoTemp     1530.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.300, 0.299, 0.000)
		colorShelf     (0.319, 0.319, 0.318, 0.000)
		colorBeach     (0.338, 0.338, 0.337, 0.000)
		colorDesert    (0.357, 0.356, 0.355, 0.000)
		colorLowland   (0.376, 0.375, 0.374, 0.000)
		colorUpland    (0.395, 0.394, 0.393, 0.000)
		colorRock      (0.413, 0.413, 0.412, 0.000)
		colorSnow      (0.432, 0.431, 0.430, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.991964
		GasToDust   0.25
		Particles   2983
		GasBright   0.0682601
		DustBright  0.690917
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.41884
		Period          13.2173
		Eccentricity    0.950968
		Inclination     62.9703
		AscendingNode   -25.6229
		ArgOfPericenter 60.9297
		MeanAnomaly     -158.541
	}
}

