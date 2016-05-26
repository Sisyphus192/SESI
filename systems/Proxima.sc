Star	"Proxima"
{
	ParentBody     "Proxima"
	Class	       "M5 V"
	Luminosity      4.97992e-005
	MassSol         0.123
	RadSol          0.141
	Teff            3042

	Age             3.64538

	InertiaMoment   0.0879504

	RotationPeriod  32.2989
	Obliquity       150.48
	EqAscendNode    58.7303

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.463 0.159)

	Surface
	{
		Randomize      (0.416, 0.984, 0.546)
		colorDistMagn   0.377159
		colorDistFreq   11.0037
		detailScale     252411
		colorConversion true
		tropicLatitude  0.61496
		icecapLatitude  1.07664
		mareFreq        27.5729
		mareDensity     0.0098216
		erosion         1
		montesFreq      426.792
		dunesMagn       0.636646
		hillsMagn       0.03
		hillsFreq       426.792
		craterOctaves   0
		BumpHeight      240.842
		BumpOffset      240.842
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
		Height          981.36
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
		Radius      504820
		Period      0.0215238
		Brightness  0.5
		RayDensity  3.15124
		RayCurv     7.04238
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     150.48
		AscendingNode   58.7303
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Planet	"1"
{
	ParentBody     "Proxima"
	Class	       "IceGiant"

	Mass            29.3207
	Radius          24600.7
	InertiaMoment   0.190439

	Obliquity       1.22832
	EqAscendNode    -79.2263
	TidalLocked     true

	AlbedoBond      0.507252
	AlbedoGeom      0.608703
	Brightness      2
	Color          (0.810 0.498 0.178)

	Surface
	{
		SurfStyle       0.635364
		Randomize      (-0.904, -0.458, 0.924)
		detailScale     63274.3
		colorConversion true
		tropicLatitude  0.033024
		icecapLatitude  0.933024
		mainFreq        0.00693907
		venusFreq       3.8911
		venusMagn       0.324252
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.511998
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      5.38609
		twistMagn       0.566305
		cycloneMagn     10.7058
		cycloneFreq     0.415421
		cycloneDensity  0.0832426
		cycloneOctaves  1
		colorLayer0    (0.620, 0.550, 0.430, 1.000)
		colorLayer1    (0.710, 0.630, 0.480, 1.000)
		colorLayer2    (0.490, 0.400, 0.310, 1.000)
		colorLayer3    (0.720, 0.710, 0.500, 1.000)
		colorLayer4    (0.640, 0.520, 0.350, 1.000)
		colorLayer5    (0.490, 0.400, 0.310, 1.000)
		colorLayer6    (0.560, 0.460, 0.340, 1.000)
		colorLayer7    (0.560, 0.460, 0.340, 1.000)
		colorLowPlants (0.640, 0.520, 0.350, 1.000)
		colorUpPlants  (0.490, 0.400, 0.310, 1.000)
		BumpHeight      14.2461
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          45.1484
		BumpHeight      54.7115
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.653303
		mainOctaves     10
		Coverage        0.536262
		twistZones      5.38609
		twistMagn       0.566305
	}

	Clouds
	{
		Height          76.0488
		BumpHeight      54.7448
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.653303
		mainOctaves     10
		Coverage        0.536262
		twistZones      5.38609
		twistMagn       0.566305
	}

	Clouds
	{
		Height          106.951
		BumpHeight      53.1242
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.653303
		mainOctaves     10
		Coverage        0.536262
		twistZones      5.38609
		twistMagn       0.566305
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          246.007
		Density         3573.03
		Pressure        662918
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0306768
		Saturation      0.713401

		Composition
		{
			H2    	92.5825
			He    	7.06888
			CH4   	0.279513
			N2    	0.0323472
			NH3   	0.0229049
			O2    	0.00688853
			C2H2  	0.00286393
			C2H4  	0.00124424
			Ne    	0.000954526
			Ar    	0.000879375
			C2H6  	0.000624105
			C3H8  	0.00035048
		}
	}

	Aurora
	{
		Height      517.016
		NorthLat    77.4614
		NorthLon    36.0656
		NorthRadius 6788.35
		NorthWidth  6021.99
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -58.0492
		SouthLon    210.445
		SouthRadius 5693.4
		SouthWidth  7659.66
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
		SemiMajorAxis   0.0185361
		Period          0.00719319
		Eccentricity    0.0491353
		Inclination     1.22832
		AscendingNode   -79.2263
		ArgOfPericenter 229.168
		MeanAnomaly     45.7818
	}
}

DwarfMoon	"1.D1"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            4.18871e-011
	Radius          4.917
	InertiaMoment   0.397337

	Oblateness      0.249

	Obliquity       -0.00225298
	EqAscendNode    74.8577
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.666 0.662)

	Surface
	{
		SurfStyle       0.627726
		OceanStyle      0.285297
		Randomize      (0.038, -0.414, 0.669)
		colorDistMagn   0.898515
		colorDistFreq   0.0121721
		detailScale     134.267
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58353
		terraceProb     0.214607
		erosion         0
		montesMagn      0.492435
		montesFreq      3.69739
		montesSpiky     0.87005
		montesFraction  0.34746
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.047214
		hillsFraction   0.834406
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243358
		craterFreq      0.211884
		craterDensity   1.06729
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   119.115
		volcanoTemp     1783.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.226, 0.185, 0.000)
		colorShelf     (0.268, 0.233, 0.212, 0.000)
		colorBeach     (0.314, 0.273, 0.252, 0.000)
		colorDesert    (0.341, 0.293, 0.245, 0.000)
		colorLowland   (0.375, 0.313, 0.278, 0.000)
		colorUpland    (0.415, 0.380, 0.338, 0.000)
		colorRock      (0.448, 0.413, 0.364, 0.000)
		colorSnow      (0.488, 0.440, 0.384, 1.000)
		BumpHeight      4.4253
		BumpOffset      0.885061
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000369155
		Period          0.000757541
		Eccentricity    8.64633e-005
		Inclination     -0.00225298
		AscendingNode   74.8577
		ArgOfPericenter -51.7262
		MeanAnomaly     -179.447
	}
}

DwarfMoon	"1.D2"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            7.33573e-011
	Radius          5.69032
	InertiaMoment   0.398753

	Oblateness      0.249

	Obliquity       -0.00825667
	EqAscendNode    147.996
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.818 0.738 0.686)

	Surface
	{
		SurfStyle       0.768386
		OceanStyle      0.418087
		Randomize      (-0.282, -0.771, 0.063)
		colorDistMagn   0.841585
		colorDistFreq   0.0173957
		detailScale     155.384
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.61314
		terraceProb     0.496438
		erosion         0
		montesMagn      0.545525
		montesFreq      2.67348
		montesSpiky     0.870881
		montesFraction  0.386799
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0749499
		hillsFraction   0.857196
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275156
		craterFreq      0.264392
		craterDensity   0.814374
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   104.165
		volcanoTemp     1290.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.251, 0.192, 0.000)
		colorShelf     (0.327, 0.258, 0.220, 0.000)
		colorBeach     (0.385, 0.303, 0.261, 0.000)
		colorDesert    (0.417, 0.325, 0.254, 0.000)
		colorLowland   (0.458, 0.347, 0.288, 0.000)
		colorUpland    (0.507, 0.421, 0.350, 0.000)
		colorRock      (0.548, 0.458, 0.377, 0.000)
		colorSnow      (0.597, 0.487, 0.398, 1.000)
		BumpHeight      5.12129
		BumpOffset      1.02426
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000417509
		Period          0.000911151
		Eccentricity    4.1104e-005
		Inclination     -0.00825667
		AscendingNode   147.996
		ArgOfPericenter -54.4112
		MeanAnomaly     103.711
	}
}

DwarfMoon	"1.D3"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            1.21928e-010
	Radius          6.16404
	InertiaMoment   0.399706

	Oblateness      0.194792

	Obliquity       0.00176033
	EqAscendNode    48.7776
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.653 0.650 0.644)

	Surface
	{
		SurfStyle       0.242283
		OceanStyle      0.190313
		Randomize      (-0.707, 0.493, -0.405)
		colorDistMagn   0.0902588
		colorDistFreq   0.0157297
		detailScale     168.319
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544506
		terraceProb     0.116996
		erosion         0
		montesMagn      0.443132
		montesFreq      2.61097
		montesSpiky     0.955462
		montesFraction  0.925361
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0964196
		hillsFraction   0.767053
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228677
		craterFreq      0.2383
		craterDensity   0.823699
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   87.5225
		volcanoTemp     1420.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.260, 0.258, 0.000)
		colorShelf     (0.278, 0.276, 0.274, 0.000)
		colorBeach     (0.294, 0.292, 0.290, 0.000)
		colorDesert    (0.310, 0.309, 0.306, 0.000)
		colorLowland   (0.327, 0.325, 0.322, 0.000)
		colorUpland    (0.343, 0.341, 0.338, 0.000)
		colorRock      (0.359, 0.357, 0.354, 0.000)
		colorSnow      (0.376, 0.374, 0.370, 1.000)
		BumpHeight      5.54764
		BumpOffset      1.10953
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000475252
		Period          0.00110657
		Eccentricity    7.98315e-006
		Inclination     0.00176033
		AscendingNode   48.7776
		ArgOfPericenter 115.233
		MeanAnomaly     32.1681
	}
}

Planet	"2"
{
	ParentBody     "Proxima"
	Class	       "Selena"

	Mass            0.0767296
	Radius          3427.05
	InertiaMoment   0.334314

	Obliquity       -0.766324
	EqAscendNode    100.367
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.624 0.617 0.615)

	Surface
	{
		SurfStyle       0.330125
		OceanStyle      0.610759
		Randomize      (0.857, 0.750, 0.667)
		colorDistMagn   0.0598027
		colorDistFreq   396.245
		detailScale     8814.56
		colorConversion true
		drivenDarkening 0
		seaLevel        0.260672
		snowLevel       2
		tropicLatitude  0.0171275
		icecapLatitude  0.851558
		icecapHeight    0.269641
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.7757
		venusFreq       0.971195
		venusMagn       0
		mareFreq        1.91317
		mareDensity     0.00893971
		terraceProb     0.183572
		erosion         0
		montesMagn      0.253247
		montesFreq      157.152
		montesSpiky     0.987307
		montesFraction  0.965671
		dunesMagn       0.0288152
		dunesFreq       4612.96
		dunesFraction   0.339177
		hillsMagn       0.133415
		hillsFreq       334.341
		hillsFraction   0.0495822
		hills2Fraction  0
		riversMagn      67.4109
		riversFreq      2.74157
		riversSin       3.70248
		riversOctaves   0
		canyonsMagn     0.726841
		canyonsFreq     1.25371
		canyonFraction  0.0364918
		cracksMagn      0.0660907
		cracksFreq      0.894554
		cracksOctaves   0
		craterMagn      0.669769
		craterFreq      9.04586
		craterDensity   0.875453
		craterOctaves   10.783
		craterRayedFactor 0.0673404
		volcanoMagn     0.684386
		volcanoFreq     2.87982
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.0836262
		volcanoRadius   0.46551
		volcanoTemp     1536.48
		lavaCoverTidal  0.112682
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.343, 0.352, 0.369, 0.000)
		colorDesert    (0.300, 0.284, 0.283, 0.000)
		colorLowland   (0.381, 0.376, 0.344, 0.000)
		colorUpland    (0.406, 0.401, 0.375, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.988613
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
		Height          105.382
		Density         0.00113867
		Pressure        0.000325378
		Greenhouse      0.0711993
		Bright          4.08582
		Opacity         0
		SkyLight        1.36194
		Hue             -0.0435137
		Saturation      1

		Composition
		{
			CO2   	98.6077
			CH4   	0.614929
			C2H6  	0.371507
			H2S   	0.258802
			N2    	0.0841051
			C2H2  	0.0447645
			C2H4  	0.0154552
			C3H8  	0.0021441
			NH3   	0.000536905
			Ne    	4.61108e-005
			CO    	2.11023e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.036924
		Period          0.0202307
		Eccentricity    0.0816898
		Inclination     -0.766324
		AscendingNode   100.367
		ArgOfPericenter 152.935
		MeanAnomaly     250.869
	}
}

Planet	"3"
{
	ParentBody     "Proxima"
	Class	       "GasGiant"

	Mass            202.166
	Radius          67776.9
	InertiaMoment   0.227748

	Obliquity       1.60286
	EqAscendNode    152.334
	TidalLocked     true

	AlbedoBond      0.508651
	AlbedoGeom      0.610381
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.761567
		Randomize      (-0.816, -0.770, 0.055)
		detailScale     174326
		colorConversion true
		tropicLatitude  0.0133763
		icecapLatitude  0.913376
		mainFreq        0.0347819
		venusFreq       9.23722
		venusMagn       0.386371
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.34164
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      5.86316
		twistMagn       0.731593
		cycloneMagn     8.23361
		cycloneFreq     0.32207
		cycloneDensity  0.0483176
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
		BumpHeight      14.9473
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          70.875
		BumpHeight      65.2302
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.26174
		mainOctaves     10
		Coverage        0.586509
		twistZones      5.86316
		twistMagn       0.731593
	}

	Clouds
	{
		Height          126.805
		BumpHeight      64.4889
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.26174
		mainOctaves     10
		Coverage        0.586509
		twistZones      5.86316
		twistMagn       0.731593
	}

	Clouds
	{
		Height          182.734
		BumpHeight      59.5995
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.26174
		mainOctaves     10
		Coverage        0.586509
		twistZones      5.86316
		twistMagn       0.731593
	}

	Clouds
	{
		Height          238.664
		BumpHeight      68.4216
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.26174
		mainOctaves     10
		Coverage        0.586509
		twistZones      5.86316
		twistMagn       0.731593
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          574.235
		Density         5417.4
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0160843
		Saturation      0.892899

		Composition
		{
			H2    	92.2166
			He    	7.40594
			CH4   	0.325114
			N2    	0.0413036
			O2    	0.00874333
			Ne    	0.00112104
			Ar    	0.000979507
			C2H4  	0.000137983
		}
	}

	Aurora
	{
		Height      1909.87
		NorthLat    86.6703
		NorthLon    79.7008
		NorthRadius 21011.5
		NorthWidth  11977.1
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -87.0654
		SouthLon    255.33
		SouthRadius 15329.6
		SouthWidth  6933.9
		SouthRings  3
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     85578.7
		OuterRadius     147423
		RotationPeriod  7.7486
		RotationOffset  0
		FrontBright     0.900573
		BackBright      0.616603
		Density         0.892767
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0577208
		Period          0.0394441
		Eccentricity    0.058411
		Inclination     1.60286
		AscendingNode   152.334
		ArgOfPericenter 65.2622
		MeanAnomaly     278.516
	}
}

DwarfMoon	"3.D1"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            6.54367e-008
	Radius          51.9049
	InertiaMoment   0.396796

	Oblateness      0.249

	Obliquity       0.0126333
	EqAscendNode    -140.398
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.764 0.731 0.703)

	Surface
	{
		SurfStyle       0.571575
		OceanStyle      0.700893
		Randomize      (0.835, -0.750, 0.934)
		colorDistMagn   0.168566
		colorDistFreq   2.10428
		detailScale     1417.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501344
		terraceProb     0.290579
		erosion         0
		montesMagn      0.479363
		montesFreq      3.02768
		montesSpiky     0.95872
		montesFraction  0.322095
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.76724
		hillsFraction   0.756932
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217552
		craterFreq      0.215917
		craterDensity   0.956638
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.8129
		volcanoTemp     1726.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.249, 0.197, 0.000)
		colorShelf     (0.306, 0.256, 0.225, 0.000)
		colorBeach     (0.359, 0.300, 0.267, 0.000)
		colorDesert    (0.390, 0.322, 0.260, 0.000)
		colorLowland   (0.428, 0.344, 0.295, 0.000)
		colorUpland    (0.474, 0.417, 0.358, 0.000)
		colorRock      (0.512, 0.453, 0.386, 0.000)
		colorSnow      (0.558, 0.483, 0.408, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000843633
		Period          0.000996681
		Eccentricity    3.69447e-005
		Inclination     0.0126333
		AscendingNode   -140.398
		ArgOfPericenter -169.636
		MeanAnomaly     -85.2496
	}
}

DwarfMoon	"3.D2"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            8.91132e-008
	Radius          67.4498
	InertiaMoment   0.398519

	Oblateness      0.249

	Obliquity       0.000161333
	EqAscendNode    -136.156
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.567 0.565 0.560)

	Surface
	{
		SurfStyle       0.312226
		OceanStyle      0.628491
		Randomize      (0.456, -0.535, 0.490)
		colorDistMagn   0.543888
		colorDistFreq   2.796
		detailScale     1841.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545483
		terraceProb     0.169731
		erosion         0
		montesMagn      0.34858
		montesFreq      3.40589
		montesSpiky     0.97093
		montesFraction  0.627952
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.4014
		hillsFraction   0.506487
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253631
		craterFreq      0.147643
		craterDensity   0.666385
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.4255
		volcanoTemp     1854.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.226, 0.224, 0.000)
		colorShelf     (0.241, 0.240, 0.238, 0.000)
		colorBeach     (0.255, 0.254, 0.252, 0.000)
		colorDesert    (0.270, 0.268, 0.266, 0.000)
		colorLowland   (0.284, 0.282, 0.280, 0.000)
		colorUpland    (0.298, 0.297, 0.294, 0.000)
		colorRock      (0.312, 0.311, 0.308, 0.000)
		colorSnow      (0.326, 0.325, 0.322, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000883733
		Period          0.00106858
		Eccentricity    1.52681e-005
		Inclination     0.000161333
		AscendingNode   -136.156
		ArgOfPericenter -67.6988
		MeanAnomaly     -13.939
	}
}

DwarfMoon	"3.D3"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.21723e-007
	Radius          71.0506
	InertiaMoment   0.399517

	Oblateness      0.249

	Obliquity       -0.0128785
	EqAscendNode    36.8613
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.789 0.788 0.785)

	Surface
	{
		SurfStyle       0.145109
		OceanStyle      0.306614
		Randomize      (0.641, -0.989, 0.214)
		colorDistMagn   0.713875
		colorDistFreq   4.09784
		detailScale     1940.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.340227
		terraceProb     0.144937
		erosion         0
		montesMagn      0.403208
		montesFreq      2.35146
		montesSpiky     0.914245
		montesFraction  0.545749
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.9189
		hillsFraction   0.60845
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240134
		craterFreq      0.18721
		craterDensity   0.834899
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.9292
		volcanoTemp     1017.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.315, 0.314, 0.000)
		colorShelf     (0.335, 0.335, 0.334, 0.000)
		colorBeach     (0.355, 0.354, 0.353, 0.000)
		colorDesert    (0.375, 0.374, 0.373, 0.000)
		colorLowland   (0.395, 0.394, 0.392, 0.000)
		colorUpland    (0.414, 0.413, 0.412, 0.000)
		colorRock      (0.434, 0.433, 0.432, 0.000)
		colorSnow      (0.454, 0.453, 0.451, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000905074
		Period          0.00110752
		Eccentricity    6.44552e-005
		Inclination     -0.0128785
		AscendingNode   36.8613
		ArgOfPericenter 173.838
		MeanAnomaly     -14.7228
	}
}

DwarfMoon	"3.D4"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.66933e-007
	Radius          75.8262
	InertiaMoment   0.397183

	Oblateness      0.235633

	Obliquity       0.00870317
	EqAscendNode    -13.8898
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.548 0.427 0.330)

	Surface
	{
		SurfStyle       0.928261
		OceanStyle      0.0308923
		Randomize      (-0.607, -0.367, -0.154)
		colorDistMagn   0.198807
		colorDistFreq   2.07664
		detailScale     2070.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.61635
		terraceProb     0.329039
		erosion         0
		montesMagn      0.531757
		montesFreq      2.81157
		montesSpiky     0.862073
		montesFraction  0.45981
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.6269
		hillsFraction   0.700987
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242546
		craterFreq      0.194819
		craterDensity   0.794988
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.0974
		volcanoTemp     1393.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.149, 0.132, 0.050)
		colorShelf     (0.219, 0.175, 0.152, 0.040)
		colorBeach     (0.252, 0.201, 0.172, 0.030)
		colorDesert    (0.285, 0.226, 0.195, 0.020)
		colorLowland   (0.318, 0.252, 0.215, 0.030)
		colorUpland    (0.351, 0.277, 0.235, 0.050)
		colorRock      (0.384, 0.303, 0.261, 0.020)
		colorSnow      (0.384, 0.303, 0.261, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000937529
		Period          0.00116762
		Eccentricity    6.55371e-006
		Inclination     0.00870317
		AscendingNode   -13.8898
		ArgOfPericenter 93.9123
		MeanAnomaly     24.6341
	}
}

DwarfMoon	"3.D5"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            2.30104e-007
	Radius          80.0554
	InertiaMoment   0.398679

	Oblateness      0.188719

	Obliquity       -0.0136902
	EqAscendNode    139.228
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.628 0.522 0.468)

	Surface
	{
		SurfStyle       0.176952
		OceanStyle      0.491764
		Randomize      (-0.603, -0.651, 0.269)
		colorDistMagn   0.931141
		colorDistFreq   0.940878
		detailScale     2186.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.634736
		terraceProb     0.335347
		erosion         0
		montesMagn      0.389604
		montesFreq      2.89143
		montesSpiky     0.88204
		montesFraction  0.53965
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.2088
		hillsFraction   0.624266
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221919
		craterFreq      0.262285
		craterDensity   0.972107
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.1658
		volcanoTemp     1617.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.209, 0.187, 0.000)
		colorShelf     (0.267, 0.222, 0.199, 0.000)
		colorBeach     (0.283, 0.235, 0.211, 0.000)
		colorDesert    (0.298, 0.248, 0.222, 0.000)
		colorLowland   (0.314, 0.261, 0.234, 0.000)
		colorUpland    (0.330, 0.274, 0.246, 0.000)
		colorRock      (0.346, 0.287, 0.258, 0.000)
		colorSnow      (0.361, 0.300, 0.269, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000959505
		Period          0.00120892
		Eccentricity    5.14826e-005
		Inclination     -0.0136902
		AscendingNode   139.228
		ArgOfPericenter 111.317
		MeanAnomaly     -51.4069
	}
}

DwarfMoon	"3.D6"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            3.19183e-007
	Radius          104.315
	InertiaMoment   0.399644

	Oblateness      0.249

	Obliquity       -0.0142828
	EqAscendNode    141.062
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.619 0.612 0.609)

	Surface
	{
		SurfStyle       0.135386
		OceanStyle      0.849459
		Randomize      (-0.954, -0.438, -0.381)
		colorDistMagn   0.758525
		colorDistFreq   4.89201
		detailScale     2848.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.737081
		terraceProb     0.249763
		erosion         0
		montesMagn      0.47016
		montesFreq      3.37547
		montesSpiky     0.892817
		montesFraction  0.855281
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.2717
		hillsFraction   0.719148
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234548
		craterFreq      0.310816
		craterDensity   0.819934
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.949
		volcanoTemp     1400.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.245, 0.244, 0.000)
		colorShelf     (0.263, 0.260, 0.259, 0.000)
		colorBeach     (0.279, 0.275, 0.274, 0.000)
		colorDesert    (0.294, 0.291, 0.289, 0.000)
		colorLowland   (0.310, 0.306, 0.305, 0.000)
		colorUpland    (0.325, 0.321, 0.320, 0.000)
		colorRock      (0.341, 0.337, 0.335, 0.000)
		colorSnow      (0.356, 0.352, 0.350, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000969501
		Period          0.00122786
		Eccentricity    4.84317e-005
		Inclination     -0.0142828
		AscendingNode   141.062
		ArgOfPericenter -26.0699
		MeanAnomaly     -19.7177
	}
}

DwarfMoon	"3.D7"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            4.46149e-007
	Radius          110.217
	InertiaMoment   0.397486

	Oblateness      0.233808

	Obliquity       0.00804169
	EqAscendNode    54.9695
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.435 0.432 0.429)

	Surface
	{
		SurfStyle       0.434671
		OceanStyle      0.243352
		Randomize      (0.438, -0.996, 0.355)
		colorDistMagn   0.44519
		colorDistFreq   7.45366
		detailScale     3009.65
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.357786
		terraceProb     0.544784
		erosion         0
		montesMagn      0.466245
		montesFreq      2.56049
		montesSpiky     0.949294
		montesFraction  0.213633
		dunesFraction   0
		hillsMagn       0
		hillsFreq       30.2933
		hillsFraction   0.65325
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242462
		craterFreq      0.459738
		craterDensity   0.964248
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.871
		volcanoTemp     1496.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.173, 0.172, 0.000)
		colorShelf     (0.185, 0.183, 0.182, 0.000)
		colorBeach     (0.196, 0.194, 0.193, 0.000)
		colorDesert    (0.206, 0.205, 0.204, 0.000)
		colorLowland   (0.217, 0.216, 0.214, 0.000)
		colorUpland    (0.228, 0.227, 0.225, 0.000)
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
		SemiMajorAxis   0.000984895
		Period          0.00125722
		Eccentricity    1.97275e-005
		Inclination     0.00804169
		AscendingNode   54.9695
		ArgOfPericenter -4.26575
		MeanAnomaly     -69.4214
	}
}

DwarfMoon	"3.D8"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            6.29391e-007
	Radius          118.698
	InertiaMoment   0.398831

	Oblateness      0.0234566

	Obliquity       -19.7877
	EqAscendNode    49.1269
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.434 0.428 0.422)

	Surface
	{
		SurfStyle       0.663172
		OceanStyle      0.444302
		Randomize      (-0.418, 0.076, 0.800)
		colorDistMagn   0.562513
		colorDistFreq   2.06654
		detailScale     3241.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.585881
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.651051
		terraceProb     0.18038
		erosion         0
		montesMagn      0.463291
		montesFreq      2.92622
		montesSpiky     0.957494
		montesFraction  0.101183
		dunesFraction   0
		hillsMagn       0
		hillsFreq       36.2425
		hillsFraction   0.863605
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233773
		craterFreq      0.55856
		craterDensity   0.937828
		craterOctaves   15
		volcanoActivity 1.3514
		volcanoFlows    0
		volcanoRadius   23.458
		volcanoTemp     1780.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.146, 0.118, 0.000)
		colorShelf     (0.174, 0.150, 0.135, 0.000)
		colorBeach     (0.204, 0.175, 0.160, 0.000)
		colorDesert    (0.221, 0.188, 0.156, 0.000)
		colorLowland   (0.243, 0.201, 0.177, 0.000)
		colorUpland    (0.269, 0.244, 0.215, 0.000)
		colorRock      (0.291, 0.265, 0.232, 0.000)
		colorSnow      (0.317, 0.283, 0.245, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00203877
		Period          0.00374437
		Eccentricity    0.435833
		Inclination     -19.7877
		AscendingNode   49.1269
		ArgOfPericenter 103.994
		MeanAnomaly     120.186
	}
}

DwarfMoon	"3.D9"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            8.97752e-007
	Radius          127.361
	InertiaMoment   0.399771

	Oblateness      0.00718403

	Obliquity       16.9801
	EqAscendNode    -134.77
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.558 0.550 0.546)

	Surface
	{
		SurfStyle       0.671098
		OceanStyle      0.387488
		Randomize      (-0.568, -0.353, -0.937)
		colorDistMagn   0.550607
		colorDistFreq   5.47176
		detailScale     3477.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.223181
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.72362
		terraceProb     0.398201
		erosion         0
		montesMagn      0.635625
		montesFreq      2.74788
		montesSpiky     0.967477
		montesFraction  0.261335
		dunesFraction   0
		hillsMagn       0
		hillsFreq       44.7389
		hillsFraction   0.65264
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250081
		craterFreq      0.619358
		craterDensity   0.856206
		craterOctaves   15
		volcanoActivity 1.04666
		volcanoFlows    0
		volcanoRadius   21.0748
		volcanoTemp     1437.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.187, 0.153, 0.000)
		colorShelf     (0.223, 0.192, 0.175, 0.000)
		colorBeach     (0.262, 0.225, 0.208, 0.000)
		colorDesert    (0.285, 0.242, 0.202, 0.000)
		colorLowland   (0.312, 0.258, 0.229, 0.000)
		colorUpland    (0.346, 0.313, 0.279, 0.000)
		colorRock      (0.374, 0.341, 0.300, 0.000)
		colorSnow      (0.407, 0.363, 0.317, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00238267
		Period          0.00473066
		Eccentricity    0.351693
		Inclination     16.9801
		AscendingNode   -134.77
		ArgOfPericenter -24.8083
		MeanAnomaly     21.7739
	}
}

DwarfMoon	"3.D10"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.29758e-006
	Radius          168.634
	InertiaMoment   0.397741

	Oblateness      0.0147206

	Obliquity       0.43401
	EqAscendNode    -77.7389
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.747 0.745 0.744)

	Surface
	{
		SurfStyle       0.63453
		OceanStyle      0.495793
		Randomize      (-0.203, -0.682, 0.440)
		colorDistMagn   0.673266
		colorDistFreq   8.4641
		detailScale     4604.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0117946
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592848
		terraceProb     0.109212
		erosion         0
		montesMagn      0.664115
		montesFreq      3.42827
		montesSpiky     0.978463
		montesFraction  0.819653
		dunesFraction   0
		hillsMagn       0
		hillsFreq       69.4591
		hillsFraction   0.603974
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207603
		craterFreq      0.712497
		craterDensity   0.891475
		craterOctaves   16
		volcanoActivity 0.653817
		volcanoFlows    0
		volcanoRadius   23.2104
		volcanoTemp     1303.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.253, 0.208, 0.000)
		colorShelf     (0.299, 0.261, 0.238, 0.000)
		colorBeach     (0.351, 0.306, 0.283, 0.000)
		colorDesert    (0.381, 0.328, 0.275, 0.000)
		colorLowland   (0.419, 0.350, 0.312, 0.000)
		colorUpland    (0.463, 0.425, 0.379, 0.000)
		colorRock      (0.501, 0.462, 0.409, 0.000)
		colorSnow      (0.546, 0.492, 0.431, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00265451
		Period          0.00556292
		Eccentricity    0.0904734
		Inclination     0.43401
		AscendingNode   -77.7389
		ArgOfPericenter 110.774
		MeanAnomaly     -157.248
	}
}

DwarfMoon	"3.D11"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.90552e-006
	Radius          179.961
	InertiaMoment   0.398976

	Oblateness      0.00175731

	RotationPeriod  128.692
	Obliquity       62.7755
	EqAscendNode    -125.698

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.748 0.716 0.678)

	Surface
	{
		SurfStyle       0.848247
		OceanStyle      0.0461965
		Randomize      (-0.179, 0.925, -0.646)
		colorDistMagn   0.866908
		colorDistFreq   16.4704
		detailScale     4914.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.741746
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.362436
		terraceProb     0.2129
		erosion         0
		montesMagn      0.460684
		montesFreq      2.76635
		montesSpiky     0.981897
		montesFraction  0.401617
		dunesFraction   0
		hillsMagn       0
		hillsFreq       54.4374
		hillsFraction   0.671275
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210659
		craterFreq      1.24392
		craterDensity   0.760498
		craterOctaves   16
		volcanoActivity 0.874589
		volcanoFlows    0
		volcanoRadius   20.4398
		volcanoTemp     1638.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.243, 0.190, 0.000)
		colorShelf     (0.299, 0.251, 0.217, 0.000)
		colorBeach     (0.352, 0.294, 0.258, 0.000)
		colorDesert    (0.382, 0.315, 0.251, 0.000)
		colorLowland   (0.419, 0.336, 0.285, 0.000)
		colorUpland    (0.464, 0.408, 0.346, 0.000)
		colorRock      (0.501, 0.444, 0.373, 0.000)
		colorSnow      (0.546, 0.473, 0.394, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00319351
		Period          0.00734054
		Eccentricity    0.278692
		Inclination     62.7755
		AscendingNode   -125.698
		ArgOfPericenter 57.5287
		MeanAnomaly     166.139
	}
}

Planet	"4"
{
	ParentBody     "Proxima"
	Class	       "Titan"

	Mass            1.76655
	Radius          9631.42
	InertiaMoment   0.331181

	RotationPeriod  6051.87
	Obliquity       -0.708169
	EqAscendNode    108.503

	AlbedoBond      0.615243
	AlbedoGeom      0.738292
	Brightness      2
	Color          (0.735 0.678 0.616)

	Life
	{
		Class   "Exotic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		SurfStyle       0.825281
		OceanStyle      0.361665
		Randomize      (0.963, 0.527, 0.279)
		colorDistMagn   0.0706383
		colorDistFreq   978.631
		detailScale     24772.6
		colorConversion true
		seaLevel        0.463588
		snowLevel       2
		tropicLatitude  0.0144432
		icecapLatitude  0.958048
		icecapHeight    0.467262
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.50093
		venusFreq       1.19192
		venusMagn       -1
		mareFreq        1.78951
		mareDensity     0.121785
		terraceProb     0.147048
		erosion         0.108692
		montesMagn      0.171382
		montesFreq      434.62
		montesSpiky     0.854063
		montesFraction  0.206385
		dunesMagn       0.0513433
		dunesFreq       80.076
		dunesFraction   0.416394
		hillsMagn       0.149345
		hillsFreq       1433.93
		hillsFraction   0.892104
		hills2Fraction  0.406414
		riversMagn      65.247
		riversFreq      3.02264
		riversSin       5.83135
		riversOctaves   2
		canyonsMagn     0.0614221
		canyonsFreq     265.45
		canyonFraction  0.200756
		cracksMagn      0.0231011
		cracksFreq      2.89037
		cracksOctaves   5
		craterMagn      0.576031
		craterFreq      26.6523
		craterDensity   0.00910182
		craterOctaves   4.346
		craterRayedFactor 0.149949
		volcanoMagn     0.736247
		volcanoFreq     0.956672
		volcanoDensity  0.0614436
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.549537
		volcanoRadius   0.271729
		volcanoTemp     1773.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      1.4093
		twistMagn       1.65125
		cycloneMagn     2.41635
		cycloneFreq     0.316226
		cycloneDensity  0.0062603
		colorSea       (0.090, 0.110, 0.150, 1.000)
		colorShelf     (0.250, 0.480, 0.460, 1.000)
		colorBeach     (0.735, 0.570, 0.413, 0.000)
		colorDesert    (0.448, 0.326, 0.216, 0.000)
		colorLowland   (0.492, 0.346, 0.105, 0.000)
		colorUpland    (0.507, 0.312, 0.283, 0.000)
		colorRock      (0.640, 0.710, 0.740, 0.350)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.280, 0.370, 0.290, 0.000)
		colorUpPlants  (0.370, 0.450, 0.280, 0.000)
		BumpHeight      20
		BumpOffset      9.27176
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
		Height          2.81445
		BumpHeight      5.42742
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.857322
		mainOctaves     10
		Coverage        0.169514
		twistZones      1.4093
		twistMagn       1.65125
	}

	Ocean
	{
		Height          9.27176
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          21.7309
		Density         0.452394
		Pressure        0.117142
		Greenhouse      2.35737
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.520856
		Saturation      1

		Composition
		{
			N2    	99.758
			Ar    	0.133558
			CO    	0.0648114
			Ne    	0.0416341
			He    	0.0019291
			Kr    	5.43834e-005
		}
	}

	NoAurora        true

	Rings
	{
		InnerRadius     11987
		OuterRadius     28598.8
		RotationPeriod  6.0261
		RotationOffset  0
		FrontBright     0.872933
		BackBright      0.939722
		Density         0.604155
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.117652
		Period          0.115064
		Eccentricity    0.0993804
		Inclination     -0.708169
		AscendingNode   108.503
		ArgOfPericenter 263.353
		MeanAnomaly     162.591
	}
}

DwarfMoon	"4.D1"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            3.96776e-010
	Radius          10.476
	InertiaMoment   0.398305

	Oblateness      0.249

	Obliquity       -0.00633162
	EqAscendNode    -37.3193
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.622 0.619 0.617)

	Surface
	{
		SurfStyle       0.765746
		OceanStyle      0.295573
		Randomize      (0.581, 0.927, -0.325)
		colorDistMagn   0.738924
		colorDistFreq   0.0617823
		detailScale     286.066
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577327
		terraceProb     0.343627
		erosion         0
		montesMagn      0.512051
		montesFreq      3.05782
		montesSpiky     0.858057
		montesFraction  0.522768
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.176866
		hillsFraction   0.822279
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235378
		craterFreq      0.20816
		craterDensity   0.914705
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   82.4576
		volcanoTemp     1375.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.211, 0.173, 0.000)
		colorShelf     (0.249, 0.217, 0.197, 0.000)
		colorBeach     (0.293, 0.254, 0.234, 0.000)
		colorDesert    (0.317, 0.273, 0.228, 0.000)
		colorLowland   (0.349, 0.291, 0.259, 0.000)
		colorUpland    (0.386, 0.353, 0.315, 0.000)
		colorRock      (0.417, 0.384, 0.339, 0.000)
		colorSnow      (0.454, 0.409, 0.358, 1.000)
		BumpHeight      9.42844
		BumpOffset      1.88569
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000159811
		Period          0.000879076
		Eccentricity    2.67274e-005
		Inclination     -0.00633162
		AscendingNode   -37.3193
		ArgOfPericenter -19.5527
		MeanAnomaly     -130.655
	}
}

DwarfMoon	"4.D2"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            5.90305e-010
	Radius          11.4877
	InertiaMoment   0.399354

	RotationPeriod  178.072
	Obliquity       -29.1318
	EqAscendNode    -16.8832

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.842 0.780 0.753)

	Surface
	{
		SurfStyle       0.365644
		OceanStyle      0.300004
		Randomize      (0.799, 0.645, 0.007)
		colorDistMagn   0.893434
		colorDistFreq   0.110648
		detailScale     313.691
		colorConversion true
		snowLevel       2
		tropicLatitude  0.844074
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.676232
		terraceProb     0.181786
		erosion         0
		montesMagn      0.606912
		montesFreq      3.21161
		montesSpiky     0.894861
		montesFraction  0.479586
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.344034
		hillsFraction   0.939594
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246958
		craterFreq      0.262903
		craterDensity   0.849334
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   74.1313
		volcanoTemp     1750.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.337, 0.312, 0.301, 0.000)
		colorShelf     (0.358, 0.331, 0.320, 0.000)
		colorBeach     (0.379, 0.351, 0.339, 0.000)
		colorDesert    (0.400, 0.370, 0.358, 0.000)
		colorLowland   (0.421, 0.390, 0.376, 0.000)
		colorUpland    (0.442, 0.409, 0.395, 0.000)
		colorRock      (0.463, 0.429, 0.414, 0.000)
		colorSnow      (0.484, 0.448, 0.433, 1.000)
		BumpHeight      10.3389
		BumpOffset      2.06779
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000514538
		Period          0.00507859
		Eccentricity    0.175937
		Inclination     -29.1318
		AscendingNode   -16.8832
		ArgOfPericenter -107.017
		MeanAnomaly     -155.981
	}
}

Planet	"5"
{
	ParentBody     "Proxima"
	Class	       "GasGiant"

	Mass            1635.74
	Radius          76300.3
	InertiaMoment   0.277198

	Oblateness      0.00992737

	RotationPeriod  12.915
	Obliquity       16.0657
	EqAscendNode    2.33462

	AlbedoBond      0.464348
	AlbedoGeom      0.557218
	Brightness      2
	Color          (0.510 0.301 0.145)

	Surface
	{
		SurfStyle       0.516873
		Randomize      (0.660, -0.126, -0.020)
		detailScale     196249
		colorConversion true
		tropicLatitude  0.238229
		icecapLatitude  1
		mainFreq        0.0218166
		venusFreq       4.58387
		venusMagn       0.466363
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      2.11377
		twistMagn       1.10667
		cycloneMagn     11.4401
		cycloneFreq     0.313088
		cycloneDensity  0.0676802
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
		BumpHeight      5.9157
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          24.7344
		BumpHeight      55.7157
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.831559
		mainOctaves     10
		Coverage        0.143481
		twistZones      2.11377
		twistMagn       1.10667
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          100
		Density         8054.63
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.000514239
		Saturation      0.947441

		Composition
		{
			H2    	93.4812
			He    	6.47371
			N2    	0.0349359
			O2    	0.00795942
			Ne    	0.000923008
			Ar    	0.000672291
			CH4   	0.000601002
		}
	}

	Aurora
	{
		Height      3787.84
		NorthLat    86.0585
		NorthLon    99.7678
		NorthRadius 13526.5
		NorthWidth  5679.75
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -85.2608
		SouthLon    270.216
		SouthRadius 16735.3
		SouthWidth  9006.83
		SouthRings  4
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     116572
		OuterRadius     164822
		RotationPeriod  3.61538
		RotationOffset  0
		FrontBright     0.652085
		BackBright      0.529055
		Density         0.827601
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.258111
		Period          0.366684
		Eccentricity    0.0966431
		Inclination     -2.28576
		AscendingNode   2.3057
		ArgOfPericenter 354.647
		MeanAnomaly     154.54
	}
}

DwarfMoon	"5.D1"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.46311e-008
	Radius          32.86
	InertiaMoment   0.398758

	Oblateness      0.249

	Obliquity       0.00518755
	EqAscendNode    9.52107
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.522 0.518 0.509)

	Surface
	{
		SurfStyle       0.356768
		OceanStyle      0.990335
		Randomize      (0.491, 0.235, 0.052)
		colorDistMagn   0.421382
		colorDistFreq   0.734938
		detailScale     897.298
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.646682
		terraceProb     0.307937
		erosion         0
		montesMagn      0.458655
		montesFreq      2.35863
		montesSpiky     0.977941
		montesFraction  0.63841
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.07663
		hillsFraction   0.675575
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22463
		craterFreq      0.174092
		craterDensity   1.0122
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.5928
		volcanoTemp     1267.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.207, 0.204, 0.000)
		colorShelf     (0.222, 0.220, 0.216, 0.000)
		colorBeach     (0.235, 0.233, 0.229, 0.000)
		colorDesert    (0.248, 0.246, 0.242, 0.000)
		colorLowland   (0.261, 0.259, 0.255, 0.000)
		colorUpland    (0.274, 0.272, 0.267, 0.000)
		colorRock      (0.287, 0.285, 0.280, 0.000)
		colorSnow      (0.300, 0.298, 0.293, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00152848
		Period          0.000854502
		Eccentricity    7.46727e-005
		Inclination     0.00518755
		AscendingNode   9.52107
		ArgOfPericenter 92.381
		MeanAnomaly     -136.483
	}
}

DwarfMoon	"5.D2"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.98883e-008
	Radius          43.7523
	InertiaMoment   0.39971

	Oblateness      0.249

	Obliquity       -0.0103407
	EqAscendNode    -102.637
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.780 0.778 0.776)

	Surface
	{
		SurfStyle       0.730194
		OceanStyle      0.176527
		Randomize      (0.066, 0.573, -0.771)
		colorDistMagn   0.518589
		colorDistFreq   0.898627
		detailScale     1194.73
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.428489
		terraceProb     0.207865
		erosion         0
		montesMagn      0.68292
		montesFreq      3.63058
		montesSpiky     0.84275
		montesFraction  0.773423
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.16264
		hillsFraction   0.610575
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.279119
		craterFreq      0.238067
		craterDensity   1.06144
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   48.6417
		volcanoTemp     1657.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.265, 0.217, 0.000)
		colorShelf     (0.312, 0.272, 0.248, 0.000)
		colorBeach     (0.367, 0.319, 0.295, 0.000)
		colorDesert    (0.398, 0.342, 0.287, 0.000)
		colorLowland   (0.437, 0.366, 0.326, 0.000)
		colorUpland    (0.484, 0.444, 0.396, 0.000)
		colorRock      (0.523, 0.482, 0.427, 0.000)
		colorSnow      (0.570, 0.514, 0.450, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00186286
		Period          0.00114972
		Eccentricity    2.66442e-005
		Inclination     -0.0103407
		AscendingNode   -102.637
		ArgOfPericenter -120.449
		MeanAnomaly     -131.285
	}
}

DwarfMoon	"5.D3"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.6999e-008
	Radius          44.1992
	InertiaMoment   0.397622

	RotationPeriod  193.759
	Obliquity       -63.327
	EqAscendNode    102.758

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.798 0.796 0.795)

	Surface
	{
		SurfStyle       0.0396226
		OceanStyle      0.0485253
		Randomize      (0.250, -0.399, 0.981)
		colorDistMagn   0.829902
		colorDistFreq   0.948488
		detailScale     1206.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.925869
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.47502
		terraceProb     0.390093
		erosion         0
		montesMagn      0.495479
		montesFreq      2.93736
		montesSpiky     0.96081
		montesFraction  0.569625
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.58667
		hillsFraction   0.654658
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232367
		craterFreq      0.207944
		craterDensity   1.06241
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.1742
		volcanoTemp     1424.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.318, 0.318, 0.000)
		colorShelf     (0.339, 0.338, 0.338, 0.000)
		colorBeach     (0.359, 0.358, 0.358, 0.000)
		colorDesert    (0.379, 0.378, 0.378, 0.000)
		colorLowland   (0.399, 0.398, 0.397, 0.000)
		colorUpland    (0.419, 0.418, 0.417, 0.000)
		colorRock      (0.439, 0.438, 0.437, 0.000)
		colorSnow      (0.459, 0.458, 0.457, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0110359
		Period          0.016578
		Eccentricity    0.150551
		Inclination     -63.327
		AscendingNode   102.758
		ArgOfPericenter -111.076
		MeanAnomaly     -164.809
	}
}

DwarfMoon	"5.D4"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            3.66356e-008
	Radius          46.8253
	InertiaMoment   0.398906

	Oblateness      0.0011908

	Obliquity       -27.1093
	EqAscendNode    57.2068
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.691 0.687 0.682)

	Surface
	{
		SurfStyle       0.582268
		OceanStyle      0.79331
		Randomize      (0.120, -0.087, 0.299)
		colorDistMagn   0.778988
		colorDistFreq   1.28349
		detailScale     1278.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.733322
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.546493
		terraceProb     0.217934
		erosion         0
		montesMagn      0.418238
		montesFreq      3.06374
		montesSpiky     0.979119
		montesFraction  0.57209
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.23591
		hillsFraction   0.610505
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22306
		craterFreq      0.218415
		craterDensity   0.914027
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.3561
		volcanoTemp     1509.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.234, 0.191, 0.000)
		colorShelf     (0.276, 0.241, 0.218, 0.000)
		colorBeach     (0.325, 0.282, 0.259, 0.000)
		colorDesert    (0.352, 0.302, 0.252, 0.000)
		colorLowland   (0.387, 0.323, 0.286, 0.000)
		colorUpland    (0.428, 0.392, 0.348, 0.000)
		colorRock      (0.463, 0.426, 0.375, 0.000)
		colorSnow      (0.504, 0.454, 0.396, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0112528
		Period          0.0170692
		Eccentricity    0.247794
		Inclination     -27.1093
		AscendingNode   57.2068
		ArgOfPericenter -105.667
		MeanAnomaly     128.078
	}
}

DwarfMoon	"5.D5"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            4.97326e-008
	Radius          49.7483
	InertiaMoment   0.399835

	RotationPeriod  259.882
	Obliquity       85.0633
	EqAscendNode    -79.7409

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.559 0.551 0.546)

	Surface
	{
		SurfStyle       0.617111
		OceanStyle      0.455452
		Randomize      (0.771, 0.959, 0.716)
		colorDistMagn   0.884606
		colorDistFreq   0.716438
		detailScale     1358.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985552
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491902
		terraceProb     0.434754
		erosion         0
		montesMagn      0.454183
		montesFreq      2.91189
		montesSpiky     0.940013
		montesFraction  0.290013
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.63234
		hillsFraction   0.522983
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268409
		craterFreq      0.268056
		craterDensity   0.885926
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.9755
		volcanoTemp     1847.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.187, 0.153, 0.000)
		colorShelf     (0.223, 0.193, 0.175, 0.000)
		colorBeach     (0.263, 0.226, 0.208, 0.000)
		colorDesert    (0.285, 0.242, 0.202, 0.000)
		colorLowland   (0.313, 0.259, 0.229, 0.000)
		colorUpland    (0.346, 0.314, 0.279, 0.000)
		colorRock      (0.374, 0.341, 0.300, 0.000)
		colorSnow      (0.408, 0.364, 0.317, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0115667
		Period          0.0177883
		Eccentricity    0.381696
		Inclination     85.0633
		AscendingNode   -79.7409
		ArgOfPericenter 57.6668
		MeanAnomaly     -52.8025
	}
}

DwarfMoon	"5.D6"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            6.75981e-008
	Radius          69.0533
	InertiaMoment   0.397859

	RotationPeriod  281.973
	Obliquity       39.028
	EqAscendNode    163.922

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.684 0.679 0.677)

	Surface
	{
		SurfStyle       0.759283
		OceanStyle      0.948984
		Randomize      (0.575, 0.622, -0.825)
		colorDistMagn   0.254035
		colorDistFreq   1.40435
		detailScale     1885.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.175443
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.433095
		terraceProb     0.392663
		erosion         0
		montesMagn      0.436742
		montesFreq      2.90715
		montesSpiky     0.884203
		montesFraction  0.538164
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.337
		hillsFraction   0.58035
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245646
		craterFreq      0.227859
		craterDensity   0.930091
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.6412
		volcanoTemp     1716.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.231, 0.189, 0.000)
		colorShelf     (0.274, 0.238, 0.217, 0.000)
		colorBeach     (0.322, 0.278, 0.257, 0.000)
		colorDesert    (0.349, 0.299, 0.250, 0.000)
		colorLowland   (0.383, 0.319, 0.284, 0.000)
		colorUpland    (0.424, 0.387, 0.345, 0.000)
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

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0122132
		Period          0.0193004
		Eccentricity    0.368011
		Inclination     39.028
		AscendingNode   163.922
		ArgOfPericenter 144.053
		MeanAnomaly     -179.39
	}
}

DwarfMoon	"5.D7"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            9.20818e-008
	Radius          67.047
	InertiaMoment   0.399049

	RotationPeriod  721.326
	Obliquity       46.7547
	EqAscendNode    76.2854

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.637 0.630 0.627)

	Surface
	{
		SurfStyle       0.696026
		OceanStyle      0.479207
		Randomize      (-0.140, -0.993, -0.204)
		colorDistMagn   0.562737
		colorDistFreq   0.120119
		detailScale     1830.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.939118
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.315637
		terraceProb     0.373653
		erosion         0
		montesMagn      0.267219
		montesFreq      3.89354
		montesSpiky     0.888564
		montesFraction  0.60097
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.93045
		hillsFraction   0.634891
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23981
		craterFreq      0.231854
		craterDensity   0.966884
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.6416
		volcanoTemp     1582.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.214, 0.176, 0.000)
		colorShelf     (0.255, 0.220, 0.201, 0.000)
		colorBeach     (0.300, 0.258, 0.238, 0.000)
		colorDesert    (0.325, 0.277, 0.232, 0.000)
		colorLowland   (0.357, 0.296, 0.263, 0.000)
		colorUpland    (0.395, 0.359, 0.320, 0.000)
		colorRock      (0.427, 0.391, 0.345, 0.000)
		colorSnow      (0.465, 0.416, 0.364, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.012744
		Period          0.0205721
		Eccentricity    0.37599
		Inclination     46.7547
		AscendingNode   76.2854
		ArgOfPericenter -44.3337
		MeanAnomaly     142.146
	}
}

DwarfMoon	"5.D8"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.25825e-007
	Radius          71.0501
	InertiaMoment   0.39996

	Obliquity       67.9674
	EqAscendNode    28.3123
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.455 0.450 0.448)

	Surface
	{
		SurfStyle       0.196207
		OceanStyle      0.492943
		Randomize      (-0.266, 0.381, 0.534)
		colorDistMagn   0.494014
		colorDistFreq   3.4981
		detailScale     1940.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.787936
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629762
		terraceProb     0.155264
		erosion         0
		montesMagn      0.317409
		montesFreq      2.86842
		montesSpiky     0.944895
		montesFraction  0.480783
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.56952
		hillsFraction   0.709395
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236753
		craterFreq      0.208971
		craterDensity   0.941765
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.4042
		volcanoTemp     1230.43
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
		colorSnow      (0.262, 0.259, 0.258, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0129526
		Period          0.0210795
		Eccentricity    0.234115
		Inclination     67.9674
		AscendingNode   28.3123
		ArgOfPericenter -108.61
		MeanAnomaly     135.76
	}
}

DwarfMoon	"5.D9"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.72642e-007
	Radius          75.8122
	InertiaMoment   0.398068

	Obliquity       -33.0029
	EqAscendNode    45.5285
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.676 0.672 0.667)

	Surface
	{
		SurfStyle       0.0114733
		OceanStyle      0.850796
		Randomize      (-0.446, 0.844, -0.270)
		colorDistMagn   0.440279
		colorDistFreq   4.37089
		detailScale     2070.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.868617
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.54803
		terraceProb     0.250781
		erosion         0
		montesMagn      0.356646
		montesFreq      3.84884
		montesSpiky     0.966745
		montesFraction  0.652095
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.72685
		hillsFraction   0.489682
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247239
		craterFreq      0.202887
		craterDensity   1.04472
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.607
		volcanoTemp     1520.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.269, 0.267, 0.000)
		colorShelf     (0.287, 0.285, 0.283, 0.000)
		colorBeach     (0.304, 0.302, 0.300, 0.000)
		colorDesert    (0.321, 0.319, 0.317, 0.000)
		colorLowland   (0.338, 0.336, 0.333, 0.000)
		colorUpland    (0.355, 0.353, 0.350, 0.000)
		colorRock      (0.372, 0.369, 0.367, 0.000)
		colorSnow      (0.389, 0.386, 0.383, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0134813
		Period          0.022383
		Eccentricity    0.0781542
		Inclination     -33.0029
		AscendingNode   45.5285
		ArgOfPericenter 86.3322
		MeanAnomaly     -134.922
	}
}

DwarfMoon	"5.D10"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.38118e-007
	Radius          78.0826
	InertiaMoment   0.399186

	RotationPeriod  339.945
	Obliquity       -79.1662
	EqAscendNode    29.9062

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.660 0.654 0.651)

	Surface
	{
		SurfStyle       0.494662
		OceanStyle      0.722688
		Randomize      (0.749, 0.404, -0.571)
		colorDistMagn   0.661768
		colorDistFreq   2.727
		detailScale     2132.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.598814
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532866
		terraceProb     0.333026
		erosion         0
		montesMagn      0.60368
		montesFreq      2.21868
		montesSpiky     0.916147
		montesFraction  0.358265
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.8368
		hillsFraction   0.498282
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212012
		craterFreq      0.200049
		craterDensity   0.933262
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.0879
		volcanoTemp     1410.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.261, 0.261, 0.000)
		colorShelf     (0.280, 0.278, 0.277, 0.000)
		colorBeach     (0.297, 0.294, 0.293, 0.000)
		colorDesert    (0.313, 0.311, 0.309, 0.000)
		colorLowland   (0.330, 0.327, 0.326, 0.000)
		colorUpland    (0.346, 0.343, 0.342, 0.000)
		colorRock      (0.363, 0.360, 0.358, 0.000)
		colorSnow      (0.379, 0.376, 0.375, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0138345
		Period          0.0232685
		Eccentricity    0.332878
		Inclination     -79.1662
		AscendingNode   29.9062
		ArgOfPericenter -89.8812
		MeanAnomaly     -22.1684
	}
}

DwarfMoon	"5.D11"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            3.30544e-007
	Radius          103.533
	InertiaMoment   0.395761

	RotationPeriod  639.258
	Obliquity       -19.0617
	EqAscendNode    131.318

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.508 0.503 0.499)

	Surface
	{
		SurfStyle       0.664123
		OceanStyle      0.929377
		Randomize      (0.906, 0.856, -0.193)
		colorDistMagn   0.761648
		colorDistFreq   6.64956
		detailScale     2827.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.266767
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.291798
		terraceProb     0.34571
		erosion         0
		montesMagn      0.564872
		montesFreq      3.40264
		montesSpiky     0.951917
		montesFraction  0.644988
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.2303
		hillsFraction   0.679391
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242365
		craterFreq      0.245063
		craterDensity   0.871888
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.2338
		volcanoTemp     1311.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.171, 0.140, 0.000)
		colorShelf     (0.203, 0.176, 0.160, 0.000)
		colorBeach     (0.239, 0.206, 0.190, 0.000)
		colorDesert    (0.259, 0.221, 0.185, 0.000)
		colorLowland   (0.285, 0.236, 0.209, 0.000)
		colorUpland    (0.315, 0.287, 0.254, 0.000)
		colorRock      (0.340, 0.312, 0.274, 0.000)
		colorSnow      (0.371, 0.332, 0.289, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0142438
		Period          0.0243088
		Eccentricity    0.276601
		Inclination     -19.0617
		AscendingNode   131.318
		ArgOfPericenter -42.6477
		MeanAnomaly     153.788
	}
}

DwarfMoon	"5.D12"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            4.62443e-007
	Radius          110.281
	InertiaMoment   0.398259

	Obliquity       -31.6428
	EqAscendNode    -61.9417
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.630 0.628 0.623)

	Surface
	{
		SurfStyle       0.00107084
		OceanStyle      0.672229
		Randomize      (-0.909, -0.566, -0.805)
		colorDistMagn   0.469863
		colorDistFreq   9.11281
		detailScale     3011.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.803495
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.648956
		terraceProb     0.425395
		erosion         0
		montesMagn      0.442878
		montesFreq      3.447
		montesSpiky     0.996096
		montesFraction  0.707099
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.1138
		hillsFraction   0.808879
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253225
		craterFreq      0.403761
		craterDensity   0.865653
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.426
		volcanoTemp     1199.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.251, 0.249, 0.000)
		colorShelf     (0.268, 0.267, 0.265, 0.000)
		colorBeach     (0.284, 0.282, 0.280, 0.000)
		colorDesert    (0.299, 0.298, 0.296, 0.000)
		colorLowland   (0.315, 0.314, 0.312, 0.000)
		colorUpland    (0.331, 0.330, 0.327, 0.000)
		colorRock      (0.347, 0.345, 0.343, 0.000)
		colorSnow      (0.362, 0.361, 0.358, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0147118
		Period          0.0255166
		Eccentricity    0.0992923
		Inclination     -31.6428
		AscendingNode   -61.9417
		ArgOfPericenter -176.692
		MeanAnomaly     -66.4732
	}
}

DwarfMoon	"5.D13"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            6.53079e-007
	Radius          118.85
	InertiaMoment   0.39932

	Obliquity       25.0405
	EqAscendNode    -141.452
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.729 0.727 0.726)

	Surface
	{
		SurfStyle       0.76268
		OceanStyle      0.440161
		Randomize      (-0.676, -0.068, -0.496)
		colorDistMagn   0.647773
		colorDistFreq   9.55247
		detailScale     3245.4
		colorConversion true
		snowLevel       2
		tropicLatitude  0.276684
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.61937
		terraceProb     0.338285
		erosion         0
		montesMagn      0.651823
		montesFreq      3.16142
		montesSpiky     0.889218
		montesFraction  0.860518
		dunesFraction   0
		hillsMagn       0
		hillsFreq       36.1413
		hillsFraction   0.564461
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24276
		craterFreq      0.442568
		craterDensity   1.07286
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.0581
		volcanoTemp     1421.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.247, 0.203, 0.000)
		colorShelf     (0.292, 0.255, 0.232, 0.000)
		colorBeach     (0.343, 0.298, 0.276, 0.000)
		colorDesert    (0.372, 0.320, 0.269, 0.000)
		colorLowland   (0.408, 0.342, 0.305, 0.000)
		colorUpland    (0.452, 0.415, 0.370, 0.000)
		colorRock      (0.488, 0.451, 0.399, 0.000)
		colorSnow      (0.532, 0.480, 0.421, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0149895
		Period          0.0262424
		Eccentricity    0.447365
		Inclination     25.0405
		AscendingNode   -141.452
		ArgOfPericenter 126.301
		MeanAnomaly     165.8
	}
}

DwarfMoon	"5.D14"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            9.3274e-007
	Radius          126.074
	InertiaMoment   0.396543

	Obliquity       4.61319
	EqAscendNode    179.837
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.612 0.608 0.602)

	Surface
	{
		SurfStyle       0.782164
		OceanStyle      0.77704
		Randomize      (-0.922, 0.459, 0.104)
		colorDistMagn   0.547738
		colorDistFreq   9.83993
		detailScale     3442.65
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.483297
		terraceProb     0.416192
		erosion         0
		montesMagn      0.332577
		montesFreq      2.55794
		montesSpiky     0.772272
		montesFraction  0.599917
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.7634
		hillsFraction   0.48391
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233139
		craterFreq      0.433388
		craterDensity   0.890174
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   20.4668
		volcanoTemp     1508.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.207, 0.169, 0.000)
		colorShelf     (0.245, 0.213, 0.193, 0.000)
		colorBeach     (0.288, 0.249, 0.229, 0.000)
		colorDesert    (0.312, 0.267, 0.223, 0.000)
		colorLowland   (0.343, 0.286, 0.253, 0.000)
		colorUpland    (0.380, 0.346, 0.307, 0.000)
		colorRock      (0.410, 0.377, 0.331, 0.000)
		colorSnow      (0.447, 0.401, 0.349, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.015566
		Period          0.0277708
		Eccentricity    0.273309
		Inclination     4.61319
		AscendingNode   179.837
		ArgOfPericenter 139.087
		MeanAnomaly     -13.882
	}
}

DwarfMoon	"5.D15"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.35023e-006
	Radius          167.081
	InertiaMoment   0.398435

	Obliquity       -41.6637
	EqAscendNode    -165.566
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.625 0.446 0.372)

	Surface
	{
		SurfStyle       0.492212
		OceanStyle      0.740641
		Randomize      (-0.740, -0.725, 0.119)
		colorDistMagn   0.253725
		colorDistFreq   12.9538
		detailScale     4562.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.166445
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.418415
		terraceProb     0.137023
		erosion         0
		montesMagn      0.423703
		montesFreq      3.88815
		montesSpiky     0.894724
		montesFraction  0.384315
		dunesFraction   0
		hillsMagn       0
		hillsFreq       45.9151
		hillsFraction   0.508375
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254289
		craterFreq      0.901596
		craterDensity   0.960423
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.5438
		volcanoTemp     1333.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.178, 0.149, 0.000)
		colorShelf     (0.266, 0.189, 0.158, 0.000)
		colorBeach     (0.281, 0.200, 0.167, 0.000)
		colorDesert    (0.297, 0.212, 0.177, 0.000)
		colorLowland   (0.313, 0.223, 0.186, 0.000)
		colorUpland    (0.328, 0.234, 0.195, 0.000)
		colorRock      (0.344, 0.245, 0.205, 0.000)
		colorSnow      (0.359, 0.256, 0.214, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0159431
		Period          0.0287861
		Eccentricity    0.209708
		Inclination     -41.6637
		AscendingNode   -165.566
		ArgOfPericenter -62.9718
		MeanAnomaly     -81.0515
	}
}

DwarfMoon	"5.D16"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.98652e-006
	Radius          180.335
	InertiaMoment   0.399451

	Obliquity       -9.56972
	EqAscendNode    155.638
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.490 0.483 0.481)

	Surface
	{
		SurfStyle       0.0355565
		OceanStyle      0.843402
		Randomize      (-0.245, -0.143, 0.125)
		colorDistMagn   0.869178
		colorDistFreq   10.0198
		detailScale     4924.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0701149
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.748853
		terraceProb     0.233119
		erosion         0
		montesMagn      0.348447
		montesFreq      2.98618
		montesSpiky     0.86569
		montesFraction  0.58971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       99.6612
		hillsFraction   0.797793
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219506
		craterFreq      1.39996
		craterDensity   0.94658
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   20.0604
		volcanoTemp     1938.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.193, 0.192, 0.000)
		colorShelf     (0.208, 0.205, 0.204, 0.000)
		colorBeach     (0.220, 0.217, 0.216, 0.000)
		colorDesert    (0.233, 0.229, 0.228, 0.000)
		colorLowland   (0.245, 0.242, 0.240, 0.000)
		colorUpland    (0.257, 0.254, 0.252, 0.000)
		colorRock      (0.269, 0.266, 0.264, 0.000)
		colorSnow      (0.282, 0.278, 0.276, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0162502
		Period          0.0296219
		Eccentricity    0.0332584
		Inclination     -9.56972
		AscendingNode   155.638
		ArgOfPericenter 87.2842
		MeanAnomaly     34.899
	}
}

DwarfMoon	"5.D17"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.98051e-006
	Radius          198.305
	InertiaMoment   0.397001

	RotationPeriod  796.462
	Obliquity       -86.4437
	EqAscendNode    -4.72699

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.791 0.764 0.730)

	Surface
	{
		SurfStyle       0.227608
		OceanStyle      0.853069
		Randomize      (-0.669, -0.274, -0.878)
		colorDistMagn   0.615661
		colorDistFreq   29.6501
		detailScale     5415.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.148473
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.457958
		terraceProb     0.190976
		erosion         0
		montesMagn      0.431352
		montesFreq      2.48057
		montesSpiky     0.9826
		montesFraction  0.632223
		dunesFraction   0
		hillsMagn       0
		hillsFreq       95.1036
		hillsFraction   0.619582
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212682
		craterFreq      1.23249
		craterDensity   0.829955
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   18.0092
		volcanoTemp     1310
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.306, 0.292, 0.000)
		colorShelf     (0.336, 0.325, 0.310, 0.000)
		colorBeach     (0.356, 0.344, 0.328, 0.000)
		colorDesert    (0.376, 0.363, 0.347, 0.000)
		colorLowland   (0.396, 0.382, 0.365, 0.000)
		colorUpland    (0.415, 0.401, 0.383, 0.000)
		colorRock      (0.435, 0.420, 0.401, 0.000)
		colorSnow      (0.455, 0.439, 0.420, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0164925
		Period          0.0302867
		Eccentricity    0.308872
		Inclination     -86.4437
		AscendingNode   -4.72699
		ArgOfPericenter 71.7979
		MeanAnomaly     57.7287
	}
}

Moon	"5.1"
{
	ParentBody     "5"
	Class	       "IceWorld"

	Mass            4.58025e-006
	Radius          217.225
	InertiaMoment   0.398599

	Obliquity       -71.6689
	EqAscendNode    -138.837
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.567 0.465 0.313)

	Surface
	{
		SurfStyle       0.786595
		OceanStyle      0.825203
		Randomize      (0.841, 0.135, 0.660)
		colorDistMagn   0.0803307
		colorDistFreq   22.4887
		detailScale     558.715
		colorConversion true
		drivenDarkening 0.421979
		seaLevel        0.192315
		snowLevel       2
		tropicLatitude  0.62914
		icecapLatitude  1
		icecapHeight    0.192315
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.04428
		venusFreq       0.893993
		venusMagn       0.20683
		mareFreq        0
		mareDensity     1.96739e-006
		terraceProb     0.347705
		erosion         0
		montesMagn      0.0467008
		montesFreq      8.91369
		montesSpiky     0.991845
		montesFraction  0.273951
		dunesMagn       0.0348406
		dunesFreq       285.86
		dunesFraction   0.0848575
		hillsMagn       0.138872
		hillsFreq       28.8899
		hillsFraction   0.717288
		hills2Fraction  0.139334
		riversMagn      61.8392
		riversFreq      3.13092
		riversSin       6.19921
		riversOctaves   0
		canyonsMagn     0.618064
		canyonsFreq     0.0719923
		canyonFraction  0
		cracksMagn      0.0602988
		cracksFreq      0.0410907
		cracksOctaves   0
		craterMagn      1.02148
		craterFreq      0.593459
		craterDensity   0.747693
		craterOctaves   8
		craterRayedFactor 0.314367
		volcanoMagn     0.224586
		volcanoFreq     0.935765
		volcanoDensity  0.0578148
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.360531
		volcanoRadius   3.72287
		volcanoTemp     1769.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.363, 0.298, 0.210, 0.250)
		colorShelf     (0.397, 0.339, 0.238, 0.250)
		colorBeach     (0.323, 0.251, 0.181, 0.200)
		colorDesert    (0.301, 0.228, 0.159, 0.200)
		colorLowland   (0.221, 0.177, 0.131, 0.200)
		colorUpland    (0.420, 0.344, 0.238, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.221, 0.177, 0.131, 0.200)
		colorUpPlants  (0.420, 0.344, 0.238, 0.250)
		BumpHeight      10.8612
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
		SemiMajorAxis   0.0169215
		Period          0.031476
		Eccentricity    0.3932
		Inclination     -71.6689
		AscendingNode   -138.837
		ArgOfPericenter 175.472
		MeanAnomaly     158.998
	}
}

DwarfMoon	"5.D18"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.2627e-011
	Radius          3.55879
	InertiaMoment   0.39958

	RotationPeriod  728.158
	Obliquity       19.9603
	EqAscendNode    34.2216

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.739 0.629 0.564)

	Surface
	{
		SurfStyle       0.58151
		OceanStyle      0.954272
		Randomize      (-0.375, 0.734, -0.338)
		colorDistMagn   0.439024
		colorDistFreq   0.010101
		detailScale     97.1786
		colorConversion true
		snowLevel       2
		tropicLatitude  0.616812
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661693
		terraceProb     0.222742
		erosion         0
		montesMagn      0.536465
		montesFreq      3.38679
		montesSpiky     0.890863
		montesFraction  0.716172
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0174099
		hillsFraction   0.549436
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203577
		craterFreq      0.193755
		craterDensity   0.977966
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   157.021
		volcanoTemp     1313.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.214, 0.158, 0.000)
		colorShelf     (0.296, 0.220, 0.180, 0.000)
		colorBeach     (0.347, 0.258, 0.214, 0.000)
		colorDesert    (0.377, 0.277, 0.209, 0.000)
		colorLowland   (0.414, 0.296, 0.237, 0.000)
		colorUpland    (0.458, 0.359, 0.287, 0.000)
		colorRock      (0.495, 0.390, 0.310, 0.000)
		colorSnow      (0.540, 0.415, 0.327, 1.000)
		BumpHeight      3.20291
		BumpOffset      0.640581
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0175434
		Period          0.0332272
		Eccentricity    0.262738
		Inclination     19.9603
		AscendingNode   34.2216
		ArgOfPericenter 73.3148
		MeanAnomaly     -43.5491
	}
}

DwarfMoon	"5.D19"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.56392e-011
	Radius          4.25603
	InertiaMoment   0.39734

	RotationPeriod  607.532
	Obliquity       -79.5235
	EqAscendNode    -77.5233

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.656 0.652 0.649)

	Surface
	{
		SurfStyle       0.342395
		OceanStyle      0.0883441
		Randomize      (0.417, 0.646, 0.227)
		colorDistMagn   0.66344
		colorDistFreq   0.0139566
		detailScale     116.218
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984419
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.316848
		terraceProb     0.432622
		erosion         0
		montesMagn      0.406529
		montesFreq      3.16178
		montesSpiky     0.901395
		montesFraction  0.449881
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0526632
		hillsFraction   0.496656
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258443
		craterFreq      0.204684
		craterDensity   0.860901
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   131.783
		volcanoTemp     1830.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.261, 0.260, 0.000)
		colorShelf     (0.279, 0.277, 0.276, 0.000)
		colorBeach     (0.295, 0.293, 0.292, 0.000)
		colorDesert    (0.311, 0.310, 0.308, 0.000)
		colorLowland   (0.328, 0.326, 0.325, 0.000)
		colorUpland    (0.344, 0.342, 0.341, 0.000)
		colorRock      (0.361, 0.358, 0.357, 0.000)
		colorSnow      (0.377, 0.375, 0.373, 1.000)
		BumpHeight      3.83043
		BumpOffset      0.766085
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0180419
		Period          0.0346535
		Eccentricity    0.393621
		Inclination     -79.5235
		AscendingNode   -77.5233
		ArgOfPericenter 150.087
		MeanAnomaly     169.942
	}
}

DwarfMoon	"5.D20"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            4.7393e-011
	Radius          5.01535
	InertiaMoment   0.398755

	Obliquity       -11.5796
	EqAscendNode    -100.961
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.768 0.766 0.764)

	Surface
	{
		SurfStyle       0.00810282
		OceanStyle      0.58334
		Randomize      (0.850, 0.013, 0.337)
		colorDistMagn   0.937916
		colorDistFreq   0.0114823
		detailScale     136.953
		colorConversion true
		snowLevel       2
		tropicLatitude  0.253372
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.467564
		terraceProb     0.379151
		erosion         0
		montesMagn      0.44902
		montesFreq      2.93593
		montesSpiky     0.802003
		montesFraction  0.505631
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0698337
		hillsFraction   0.733203
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2156
		craterFreq      0.155834
		craterDensity   0.875829
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   114.222
		volcanoTemp     1558.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.306, 0.306, 0.000)
		colorShelf     (0.326, 0.325, 0.325, 0.000)
		colorBeach     (0.346, 0.345, 0.344, 0.000)
		colorDesert    (0.365, 0.364, 0.363, 0.000)
		colorLowland   (0.384, 0.383, 0.382, 0.000)
		colorUpland    (0.403, 0.402, 0.401, 0.000)
		colorRock      (0.422, 0.421, 0.420, 0.000)
		colorSnow      (0.442, 0.440, 0.440, 1.000)
		BumpHeight      4.51382
		BumpOffset      0.902764
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0183328
		Period          0.0354949
		Eccentricity    0.131413
		Inclination     -11.5796
		AscendingNode   -100.961
		ArgOfPericenter -158.219
		MeanAnomaly     -62.27
	}
}

DwarfMoon	"5.D21"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            8.19832e-011
	Radius          5.74096
	InertiaMoment   0.399707

	Obliquity       59.6067
	EqAscendNode    46.7677
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.534 0.459 0.376)

	Surface
	{
		SurfStyle       0.407354
		OceanStyle      0.655341
		Randomize      (-0.083, 0.072, 0.201)
		colorDistMagn   0.567504
		colorDistFreq   0.0185856
		detailScale     156.766
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967293
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.490818
		terraceProb     0.454925
		erosion         0
		montesMagn      0.488516
		montesFreq      2.58522
		montesSpiky     0.943843
		montesFraction  0.72948
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0755905
		hillsFraction   0.735827
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243327
		craterFreq      0.203874
		craterDensity   0.942341
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   99.4095
		volcanoTemp     1474.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.184, 0.150, 0.000)
		colorShelf     (0.227, 0.195, 0.160, 0.000)
		colorBeach     (0.240, 0.207, 0.169, 0.000)
		colorDesert    (0.253, 0.218, 0.178, 0.000)
		colorLowland   (0.267, 0.229, 0.188, 0.000)
		colorUpland    (0.280, 0.241, 0.197, 0.000)
		colorRock      (0.293, 0.252, 0.207, 0.000)
		colorSnow      (0.307, 0.264, 0.216, 1.000)
		BumpHeight      5.16686
		BumpOffset      1.03337
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0189406
		Period          0.0372747
		Eccentricity    0.176066
		Inclination     59.6067
		AscendingNode   46.7677
		ArgOfPericenter -144.227
		MeanAnomaly     19.6487
	}
}

DwarfMoon	"5.D22"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.35002e-010
	Radius          7.94327
	InertiaMoment   0.397617

	Obliquity       -21.6166
	EqAscendNode    121.895
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.635 0.583 0.544)

	Surface
	{
		SurfStyle       0.658866
		OceanStyle      0.77893
		Randomize      (-0.072, -0.837, 0.800)
		colorDistMagn   0.752494
		colorDistFreq   0.0274617
		detailScale     216.904
		colorConversion true
		snowLevel       2
		tropicLatitude  0.352019
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.287982
		terraceProb     0.319227
		erosion         0
		montesMagn      0.360036
		montesFreq      3.50903
		montesSpiky     0.958748
		montesFraction  0.378278
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.110767
		hillsFraction   0.712977
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245514
		craterFreq      0.186177
		craterDensity   0.974385
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   107.185
		volcanoTemp     1472.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.198, 0.152, 0.000)
		colorShelf     (0.254, 0.204, 0.174, 0.000)
		colorBeach     (0.299, 0.239, 0.207, 0.000)
		colorDesert    (0.324, 0.257, 0.201, 0.000)
		colorLowland   (0.356, 0.274, 0.229, 0.000)
		colorUpland    (0.394, 0.333, 0.277, 0.000)
		colorRock      (0.426, 0.362, 0.299, 0.000)
		colorSnow      (0.464, 0.385, 0.316, 1.000)
		BumpHeight      7.14895
		BumpOffset      1.42979
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0193517
		Period          0.0384948
		Eccentricity    0.0405167
		Inclination     -21.6166
		AscendingNode   121.895
		ArgOfPericenter 48.465
		MeanAnomaly     -48.087
	}
}

DwarfMoon	"5.D23"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.14033e-010
	Radius          8.68887
	InertiaMoment   0.398903

	Obliquity       67.4565
	EqAscendNode    65.7034
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.660 0.495 0.406)

	Surface
	{
		SurfStyle       0.916788
		OceanStyle      0.574171
		Randomize      (0.392, -0.843, -0.819)
		colorDistMagn   0.807777
		colorDistFreq   0.053609
		detailScale     237.264
		colorConversion true
		snowLevel       2
		tropicLatitude  0.978971
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.559769
		terraceProb     0.127438
		erosion         0
		montesMagn      0.57933
		montesFreq      2.6266
		montesSpiky     0.79843
		montesFraction  0.289815
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0865965
		hillsFraction   0.67833
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235011
		craterFreq      0.201732
		craterDensity   0.885777
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   93.1169
		volcanoTemp     1159.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.173, 0.162, 0.050)
		colorShelf     (0.264, 0.203, 0.187, 0.040)
		colorBeach     (0.304, 0.233, 0.211, 0.030)
		colorDesert    (0.343, 0.262, 0.239, 0.020)
		colorLowland   (0.383, 0.292, 0.264, 0.030)
		colorUpland    (0.422, 0.322, 0.288, 0.050)
		colorRock      (0.462, 0.351, 0.321, 0.020)
		colorSnow      (0.462, 0.351, 0.321, 1.000)
		BumpHeight      7.81998
		BumpOffset      1.564
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0197206
		Period          0.0396006
		Eccentricity    0.305537
		Inclination     67.4565
		AscendingNode   65.7034
		ArgOfPericenter -69.9529
		MeanAnomaly     -92.2132
	}
}

DwarfMoon	"5.D24"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            3.29305e-010
	Radius          9.62464
	InertiaMoment   0.399833

	Obliquity       -74.7116
	EqAscendNode    -61.8046
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.405 0.401 0.398)

	Surface
	{
		SurfStyle       0.230887
		OceanStyle      0.00697191
		Randomize      (-0.789, 0.510, 0.051)
		colorDistMagn   0.705989
		colorDistFreq   0.0493076
		detailScale     262.817
		colorConversion true
		snowLevel       2
		tropicLatitude  0.92899
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.257166
		terraceProb     0.308291
		erosion         0
		montesMagn      0.565401
		montesFreq      2.85963
		montesSpiky     0.867951
		montesFraction  0.257936
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.239397
		hillsFraction   0.680251
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238011
		craterFreq      0.258069
		craterDensity   0.827388
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   83.1556
		volcanoTemp     1576.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.161, 0.159, 0.000)
		colorShelf     (0.172, 0.171, 0.169, 0.000)
		colorBeach     (0.182, 0.181, 0.179, 0.000)
		colorDesert    (0.193, 0.191, 0.189, 0.000)
		colorLowland   (0.203, 0.201, 0.199, 0.000)
		colorUpland    (0.213, 0.211, 0.209, 0.000)
		colorRock      (0.223, 0.221, 0.219, 0.000)
		colorSnow      (0.233, 0.231, 0.229, 1.000)
		BumpHeight      8.66217
		BumpOffset      1.73243
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0199411
		Period          0.0402668
		Eccentricity    0.164967
		Inclination     -74.7116
		AscendingNode   -61.8046
		ArgOfPericenter 36.5868
		MeanAnomaly     148.329
	}
}

DwarfMoon	"5.D25"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            4.94557e-010
	Radius          10.5409
	InertiaMoment   0.397854

	RotationPeriod  1812.87
	Obliquity       -68.9919
	EqAscendNode    -109.22

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.752 0.682 0.651)

	Surface
	{
		SurfStyle       0.201468
		OceanStyle      0.473728
		Randomize      (-0.366, 0.121, -0.523)
		colorDistMagn   0.341894
		colorDistFreq   0.0693661
		detailScale     287.837
		colorConversion true
		snowLevel       2
		tropicLatitude  0.909636
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.679876
		terraceProb     0.103905
		erosion         0
		montesMagn      0.646354
		montesFreq      2.57862
		montesSpiky     0.942793
		montesFraction  0.610895
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.333687
		hillsFraction   0.681421
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240889
		craterFreq      0.153428
		craterDensity   0.825732
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   74.3149
		volcanoTemp     1122.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.273, 0.260, 0.000)
		colorShelf     (0.319, 0.290, 0.276, 0.000)
		colorBeach     (0.338, 0.307, 0.293, 0.000)
		colorDesert    (0.357, 0.324, 0.309, 0.000)
		colorLowland   (0.376, 0.341, 0.325, 0.000)
		colorUpland    (0.395, 0.358, 0.342, 0.000)
		colorRock      (0.413, 0.375, 0.358, 0.000)
		colorSnow      (0.432, 0.392, 0.374, 1.000)
		BumpHeight      9.48682
		BumpOffset      1.89736
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0203012
		Period          0.0413623
		Eccentricity    0.239376
		Inclination     -68.9919
		AscendingNode   -109.22
		ArgOfPericenter -161.257
		MeanAnomaly     100.111
	}
}

DwarfMoon	"5.D26"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            7.28195e-010
	Radius          14.165
	InertiaMoment   0.399045

	Obliquity       -89.6712
	EqAscendNode    -74.8347
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.717 0.715 0.713)

	Surface
	{
		SurfStyle       0.206223
		OceanStyle      0.203991
		Randomize      (-0.623, 0.164, 0.954)
		colorDistMagn   0.637536
		colorDistFreq   0.106209
		detailScale     386.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.965187
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.314304
		terraceProb     0.34007
		erosion         0
		montesMagn      0.531321
		montesFreq      2.46704
		montesSpiky     0.915276
		montesFraction  0.839242
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.716461
		hillsFraction   0.879411
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24253
		craterFreq      0.258458
		craterDensity   0.890026
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   82.3
		volcanoTemp     1513.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.286, 0.285, 0.000)
		colorShelf     (0.305, 0.304, 0.303, 0.000)
		colorBeach     (0.323, 0.322, 0.321, 0.000)
		colorDesert    (0.341, 0.340, 0.339, 0.000)
		colorLowland   (0.358, 0.358, 0.356, 0.000)
		colorUpland    (0.376, 0.376, 0.374, 0.000)
		colorRock      (0.394, 0.393, 0.392, 0.000)
		colorSnow      (0.412, 0.411, 0.410, 1.000)
		BumpHeight      12.7485
		BumpOffset      2.5497
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0207122
		Period          0.0426247
		Eccentricity    0.0474389
		Inclination     -89.6712
		AscendingNode   -74.8347
		ArgOfPericenter -91.4902
		MeanAnomaly     97.9085
	}
}

DwarfMoon	"5.D27"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.05484e-009
	Radius          14.8859
	InertiaMoment   0.399958

	RotationPeriod  1938.98
	Obliquity       -39.1434
	EqAscendNode    39.9415

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.547 0.542 0.536)

	Surface
	{
		SurfStyle       0.699942
		OceanStyle      0.0567744
		Randomize      (0.755, -0.301, 0.986)
		colorDistMagn   0.464882
		colorDistFreq   0.0621399
		detailScale     406.485
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955194
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.407935
		terraceProb     0.308325
		erosion         0
		montesMagn      0.419635
		montesFreq      3.31433
		montesSpiky     0.92284
		montesFraction  0.179005
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.483574
		hillsFraction   0.70593
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238318
		craterFreq      0.259219
		craterDensity   0.972264
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   71.8604
		volcanoTemp     1271.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.184, 0.150, 0.000)
		colorShelf     (0.219, 0.190, 0.172, 0.000)
		colorBeach     (0.257, 0.222, 0.204, 0.000)
		colorDesert    (0.279, 0.238, 0.198, 0.000)
		colorLowland   (0.306, 0.255, 0.225, 0.000)
		colorUpland    (0.339, 0.309, 0.274, 0.000)
		colorRock      (0.366, 0.336, 0.295, 0.000)
		colorSnow      (0.399, 0.358, 0.311, 1.000)
		BumpHeight      13.3973
		BumpOffset      2.67947
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.021232
		Period          0.0442395
		Eccentricity    0.0992693
		Inclination     -39.1434
		AscendingNode   39.9415
		ArgOfPericenter 26.4999
		MeanAnomaly     -28.0411
	}
}

DwarfMoon	"5.D28"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.50737e-009
	Radius          16.0705
	InertiaMoment   0.398064

	RotationPeriod  2407.57
	Obliquity       -5.37908
	EqAscendNode    -17.1889

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.494 0.489 0.483)

	Surface
	{
		SurfStyle       0.520138
		OceanStyle      0.111658
		Randomize      (-0.057, -0.543, -0.354)
		colorDistMagn   0.788897
		colorDistFreq   0.0255827
		detailScale     438.831
		colorConversion true
		snowLevel       2
		tropicLatitude  0.184586
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.763829
		terraceProb     0.200526
		erosion         0
		montesMagn      0.663383
		montesFreq      2.33265
		montesSpiky     0.929596
		montesFraction  0.570186
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.701474
		hillsFraction   0.657965
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216283
		craterFreq      0.177582
		craterDensity   1.01304
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   64.8971
		volcanoTemp     1214.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.166, 0.135, 0.000)
		colorShelf     (0.197, 0.171, 0.155, 0.000)
		colorBeach     (0.232, 0.200, 0.184, 0.000)
		colorDesert    (0.252, 0.215, 0.179, 0.000)
		colorLowland   (0.276, 0.230, 0.203, 0.000)
		colorUpland    (0.306, 0.279, 0.246, 0.000)
		colorRock      (0.331, 0.303, 0.266, 0.000)
		colorSnow      (0.360, 0.323, 0.280, 1.000)
		BumpHeight      14.4634
		BumpOffset      2.89269
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0217208
		Period          0.0457758
		Eccentricity    0.229197
		Inclination     -5.37908
		AscendingNode   -17.1889
		ArgOfPericenter 177.638
		MeanAnomaly     142.398
	}
}

DwarfMoon	"5.D29"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.12974e-009
	Radius          17.2797
	InertiaMoment   0.399183

	Obliquity       38.7977
	EqAscendNode    -170.207
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.832 0.773 0.718)

	Surface
	{
		SurfStyle       0.123715
		OceanStyle      0.507997
		Randomize      (-0.881, -0.318, 0.548)
		colorDistMagn   0.877119
		colorDistFreq   0.144841
		detailScale     471.852
		colorConversion true
		snowLevel       2
		tropicLatitude  0.106809
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.319104
		terraceProb     0.232987
		erosion         0
		montesMagn      0.607977
		montesFreq      3.24031
		montesSpiky     0.973794
		montesFraction  0.503026
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.83265
		hillsFraction   0.644584
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264838
		craterFreq      0.223492
		craterDensity   0.941686
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   58.7057
		volcanoTemp     1405.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.333, 0.309, 0.287, 0.000)
		colorShelf     (0.354, 0.328, 0.305, 0.000)
		colorBeach     (0.374, 0.348, 0.323, 0.000)
		colorDesert    (0.395, 0.367, 0.341, 0.000)
		colorLowland   (0.416, 0.386, 0.359, 0.000)
		colorUpland    (0.437, 0.406, 0.377, 0.000)
		colorRock      (0.458, 0.425, 0.395, 0.000)
		colorSnow      (0.478, 0.444, 0.413, 1.000)
		BumpHeight      15.5518
		BumpOffset      3.11035
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0221031
		Period          0.0469897
		Eccentricity    0.0787622
		Inclination     38.7977
		AscendingNode   -170.207
		ArgOfPericenter 108.825
		MeanAnomaly     -114.857
	}
}

DwarfMoon	"5.D30"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.98072e-009
	Radius          23.2068
	InertiaMoment   0.395734

	RotationPeriod  1279.71
	Obliquity       15.0988
	EqAscendNode    148.85

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.755 0.754 0.753)

	Surface
	{
		SurfStyle       0.652087
		OceanStyle      0.817964
		Randomize      (-0.540, 0.872, 0.683)
		colorDistMagn   0.724855
		colorDistFreq   0.406843
		detailScale     633.701
		colorConversion true
		snowLevel       2
		tropicLatitude  0.139539
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412596
		terraceProb     0.481465
		erosion         0
		montesMagn      0.568605
		montesFreq      3.4926
		montesSpiky     0.992802
		montesFraction  0.39546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.30747
		hillsFraction   0.788644
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238951
		craterFreq      0.145079
		craterDensity   1.04712
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   66.6439
		volcanoTemp     1175.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.256, 0.211, 0.000)
		colorShelf     (0.302, 0.264, 0.241, 0.000)
		colorBeach     (0.355, 0.309, 0.286, 0.000)
		colorDesert    (0.385, 0.332, 0.278, 0.000)
		colorLowland   (0.423, 0.354, 0.316, 0.000)
		colorUpland    (0.468, 0.430, 0.384, 0.000)
		colorRock      (0.506, 0.467, 0.414, 0.000)
		colorSnow      (0.551, 0.498, 0.436, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0226248
		Period          0.048663
		Eccentricity    0.355982
		Inclination     15.0988
		AscendingNode   148.85
		ArgOfPericenter -133.526
		MeanAnomaly     -109.115
	}
}

DwarfMoon	"5.D31"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            4.13903e-009
	Radius          23.6472
	InertiaMoment   0.398255

	Obliquity       0.573984
	EqAscendNode    -169.646
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.587 0.491 0.455)

	Surface
	{
		SurfStyle       0.440867
		OceanStyle      0.533921
		Randomize      (0.997, -0.824, -0.797)
		colorDistMagn   0.461888
		colorDistFreq   0.321149
		detailScale     645.727
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00179406
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.688443
		terraceProb     0.116264
		erosion         0
		montesMagn      0.450301
		montesFreq      2.21472
		montesSpiky     0.845297
		montesFraction  0.896673
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.15272
		hillsFraction   0.895701
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223166
		craterFreq      0.177421
		craterDensity   0.843977
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.6284
		volcanoTemp     1574.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.196, 0.182, 0.000)
		colorShelf     (0.250, 0.208, 0.193, 0.000)
		colorBeach     (0.264, 0.221, 0.205, 0.000)
		colorDesert    (0.279, 0.233, 0.216, 0.000)
		colorLowland   (0.294, 0.245, 0.227, 0.000)
		colorUpland    (0.308, 0.258, 0.239, 0.000)
		colorRock      (0.323, 0.270, 0.250, 0.000)
		colorSnow      (0.338, 0.282, 0.262, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0231365
		Period          0.0503232
		Eccentricity    0.286362
		Inclination     0.573984
		AscendingNode   -169.646
		ArgOfPericenter 105.318
		MeanAnomaly     15.0958
	}
}

DwarfMoon	"5.D32"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            5.71027e-009
	Radius          25.1931
	InertiaMoment   0.399317

	RotationPeriod  2721.52
	Obliquity       26.0747
	EqAscendNode    145.43

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.518 0.512 0.506)

	Surface
	{
		SurfStyle       0.567784
		OceanStyle      0.0109837
		Randomize      (0.280, 0.699, 0.213)
		colorDistMagn   0.356925
		colorDistFreq   0.317644
		detailScale     687.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.258959
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.760501
		terraceProb     0.296026
		erosion         0
		montesMagn      0.28278
		montesFreq      3.07629
		montesSpiky     0.765084
		montesFraction  0.550511
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.73872
		hillsFraction   0.72728
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214433
		craterFreq      0.224427
		craterDensity   1.01426
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   52.2709
		volcanoTemp     1344.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.174, 0.142, 0.000)
		colorShelf     (0.207, 0.179, 0.162, 0.000)
		colorBeach     (0.243, 0.210, 0.192, 0.000)
		colorDesert    (0.264, 0.225, 0.187, 0.000)
		colorLowland   (0.290, 0.241, 0.213, 0.000)
		colorUpland    (0.321, 0.292, 0.258, 0.000)
		colorRock      (0.347, 0.317, 0.278, 0.000)
		colorSnow      (0.378, 0.338, 0.294, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0235702
		Period          0.051745
		Eccentricity    0.292635
		Inclination     26.0747
		AscendingNode   145.43
		ArgOfPericenter 58.7188
		MeanAnomaly     -5.17706
	}
}

DwarfMoon	"5.D33"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            7.83662e-009
	Radius          26.862
	InertiaMoment   0.39653

	RotationPeriod  310.738
	Obliquity       48.5772
	EqAscendNode    -143.439

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.739 0.737 0.735)

	Surface
	{
		SurfStyle       0.375485
		OceanStyle      0.288211
		Randomize      (0.597, -0.586, -0.387)
		colorDistMagn   0.728715
		colorDistFreq   0.0170031
		detailScale     733.511
		colorConversion true
		snowLevel       2
		tropicLatitude  0.457207
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.416802
		terraceProb     0.55992
		erosion         0
		montesMagn      0.363043
		montesFreq      2.5966
		montesSpiky     0.94082
		montesFraction  0.461216
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.51093
		hillsFraction   0.846472
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227671
		craterFreq      0.248395
		craterDensity   0.87518
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.5751
		volcanoTemp     1573.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.295, 0.294, 0.000)
		colorShelf     (0.314, 0.313, 0.312, 0.000)
		colorBeach     (0.333, 0.332, 0.331, 0.000)
		colorDesert    (0.351, 0.350, 0.349, 0.000)
		colorLowland   (0.370, 0.369, 0.367, 0.000)
		colorUpland    (0.388, 0.387, 0.386, 0.000)
		colorRock      (0.406, 0.406, 0.404, 0.000)
		colorSnow      (0.425, 0.424, 0.422, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.024002
		Period          0.0531732
		Eccentricity    0.117961
		Inclination     48.5772
		AscendingNode   -143.439
		ArgOfPericenter -162.763
		MeanAnomaly     131.028
	}
}

Moon	"5.2"
{
	ParentBody     "5"
	Class	       "IceWorld"

	Mass            0.0615405
	Radius          3192.45
	InertiaMoment   0.339636

	Obliquity       -17.4273
	EqAscendNode    24.1097
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.675 0.371 0.131)

	Surface
	{
		SurfStyle       0.87919
		OceanStyle      0.151429
		Randomize      (-0.417, -0.632, -0.814)
		colorDistMagn   0.0722682
		colorDistFreq   362.439
		detailScale     8211.17
		colorConversion true
		drivenDarkening 0
		seaLevel        0.234253
		snowLevel       2
		tropicLatitude  0.560093
		icecapLatitude  1
		icecapHeight    0.234253
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76556
		venusFreq       1.08784
		venusMagn       0.198338
		mareFreq        1.94649
		mareDensity     0.00965531
		terraceProb     0.294152
		erosion         0
		montesMagn      0.182239
		montesFreq      130.394
		montesSpiky     0.733646
		montesFraction  0.767996
		dunesMagn       0.0582633
		dunesFreq       4140.57
		dunesFraction   0.092985
		hillsMagn       0.118113
		hillsFreq       382.521
		hillsFraction   0.124578
		hills2Fraction  0.192994
		riversMagn      62.8542
		riversFreq      3.5302
		riversSin       6.11599
		riversOctaves   0
		canyonsMagn     0.432946
		canyonsFreq     1.30959
		canyonFraction  0
		cracksMagn      0.0458059
		cracksFreq      1.27256
		cracksOctaves   3
		craterMagn      0.553817
		craterFreq      12.3184
		craterDensity   0.817947
		craterOctaves   12
		craterRayedFactor 0.256761
		volcanoMagn     0.763181
		volcanoFreq     1.01584
		volcanoDensity  0.0519974
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.455357
		volcanoRadius   0.512407
		volcanoTemp     1434.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.449, 0.329, 0.248, 0.000)
		colorShelf     (0.427, 0.313, 0.235, 0.000)
		colorBeach     (0.224, 0.165, 0.124, 0.000)
		colorDesert    (0.382, 0.280, 0.211, 0.000)
		colorLowland   (0.364, 0.290, 0.235, 0.000)
		colorUpland    (0.418, 0.306, 0.231, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.364, 0.290, 0.235, 0.000)
		colorUpPlants  (0.418, 0.306, 0.231, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.99942
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
		Height          138.973
		Density         5.79826e-005
		Pressure        1.18367e-005
		Greenhouse      0.0401729
		Bright          2.25247
		Opacity         0
		SkyLight        0.750824
		Hue             0.00661207
		Saturation      1

		Composition
		{
			N2    	54.0927
			CH4   	42.1067
			Ar    	3.53892
			CO    	0.249681
			Ne    	0.00622916
			O2    	0.00332894
			He    	0.00245595
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0244841
		Period          0.0547825
		Eccentricity    0.0531816
		Inclination     -17.4273
		AscendingNode   24.1097
		ArgOfPericenter -76.1619
		MeanAnomaly     -157.69
	}
}

DwarfMoon	"5.D34"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.45909e-008
	Radius          36.2674
	InertiaMoment   0.399448

	Obliquity       -12.2007
	EqAscendNode    -84.1338
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.763 0.760 0.759)

	Surface
	{
		SurfStyle       0.695546
		OceanStyle      0.332424
		Randomize      (-0.891, -0.128, 0.682)
		colorDistMagn   0.146992
		colorDistFreq   0.298582
		detailScale     990.343
		colorConversion true
		snowLevel       2
		tropicLatitude  0.309893
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560308
		terraceProb     0.34036
		erosion         0
		montesMagn      0.507083
		montesFreq      3.39727
		montesSpiky     0.997998
		montesFraction  0.444972
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.9039
		hillsFraction   0.541276
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260833
		craterFreq      0.222071
		craterDensity   0.929501
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.0741
		volcanoTemp     1279.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.258, 0.212, 0.000)
		colorShelf     (0.305, 0.266, 0.243, 0.000)
		colorBeach     (0.358, 0.312, 0.288, 0.000)
		colorDesert    (0.389, 0.334, 0.281, 0.000)
		colorLowland   (0.427, 0.357, 0.319, 0.000)
		colorUpland    (0.473, 0.433, 0.387, 0.000)
		colorRock      (0.511, 0.471, 0.417, 0.000)
		colorSnow      (0.557, 0.502, 0.440, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0249109
		Period          0.0562223
		Eccentricity    0.023975
		Inclination     -12.2007
		AscendingNode   -84.1338
		ArgOfPericenter -128.6
		MeanAnomaly     -151.131
	}
}

DwarfMoon	"5.D35"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.9834e-008
	Radius          38.3703
	InertiaMoment   0.396992

	RotationPeriod  2998.77
	Obliquity       84.4636
	EqAscendNode    -50.5284

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.702 0.644 0.569)

	Surface
	{
		SurfStyle       0.271119
		OceanStyle      0.90566
		Randomize      (-0.034, -0.361, 0.938)
		colorDistMagn   0.777019
		colorDistFreq   0.839688
		detailScale     1047.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.78423
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.579777
		terraceProb     0.340399
		erosion         0
		montesMagn      0.492192
		montesFreq      3.2987
		montesSpiky     0.94563
		montesFraction  0.60003
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.64525
		hillsFraction   0.676316
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248634
		craterFreq      0.262408
		craterDensity   0.843436
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.7166
		volcanoTemp     1731.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.258, 0.227, 0.000)
		colorShelf     (0.298, 0.274, 0.242, 0.000)
		colorBeach     (0.316, 0.290, 0.256, 0.000)
		colorDesert    (0.334, 0.306, 0.270, 0.000)
		colorLowland   (0.351, 0.322, 0.284, 0.000)
		colorUpland    (0.369, 0.338, 0.299, 0.000)
		colorRock      (0.386, 0.354, 0.313, 0.000)
		colorSnow      (0.404, 0.370, 0.327, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.025145
		Period          0.0570163
		Eccentricity    0.399316
		Inclination     84.4636
		AscendingNode   -50.5284
		ArgOfPericenter 171.846
		MeanAnomaly     -16.2852
	}
}

DwarfMoon	"5.D36"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.69255e-008
	Radius          40.7959
	InertiaMoment   0.398596

	Obliquity       -87.5705
	EqAscendNode    169.673
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.795 0.756 0.739)

	Surface
	{
		SurfStyle       0.653848
		OceanStyle      0.100861
		Randomize      (0.510, 0.564, -0.686)
		colorDistMagn   0.115876
		colorDistFreq   1.04945
		detailScale     1114
		colorConversion true
		snowLevel       2
		tropicLatitude  0.179105
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.440774
		terraceProb     0.42534
		erosion         0
		montesMagn      0.468628
		montesFreq      2.36555
		montesSpiky     0.962358
		montesFraction  0.447084
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.98034
		hillsFraction   0.527291
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201365
		craterFreq      0.186935
		craterDensity   1.08119
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.9799
		volcanoTemp     1175.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.257, 0.207, 0.000)
		colorShelf     (0.318, 0.265, 0.236, 0.000)
		colorBeach     (0.374, 0.310, 0.281, 0.000)
		colorDesert    (0.406, 0.333, 0.273, 0.000)
		colorLowland   (0.445, 0.355, 0.310, 0.000)
		colorUpland    (0.493, 0.431, 0.377, 0.000)
		colorRock      (0.533, 0.469, 0.406, 0.000)
		colorSnow      (0.581, 0.499, 0.429, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0256081
		Period          0.0585988
		Eccentricity    0.478411
		Inclination     -87.5705
		AscendingNode   169.673
		ArgOfPericenter 7.80618
		MeanAnomaly     64.6603
	}
}

DwarfMoon	"5.D37"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            3.65359e-008
	Radius          41.7218
	InertiaMoment   0.399577

	Obliquity       -56.6015
	EqAscendNode    145.686
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.818 0.778 0.763)

	Surface
	{
		SurfStyle       0.51728
		OceanStyle      0.912979
		Randomize      (0.114, -0.244, -0.675)
		colorDistMagn   0.79145
		colorDistFreq   1.18409
		detailScale     1139.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0.477388
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.409701
		terraceProb     0.382436
		erosion         0
		montesMagn      0.331299
		montesFreq      3.00232
		montesSpiky     0.909972
		montesFraction  0.731244
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.75535
		hillsFraction   0.648152
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228268
		craterFreq      0.225719
		craterDensity   0.927434
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.2222
		volcanoTemp     1487.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.265, 0.214, 0.000)
		colorShelf     (0.327, 0.272, 0.244, 0.000)
		colorBeach     (0.385, 0.319, 0.290, 0.000)
		colorDesert    (0.417, 0.342, 0.282, 0.000)
		colorLowland   (0.458, 0.366, 0.320, 0.000)
		colorUpland    (0.507, 0.443, 0.389, 0.000)
		colorRock      (0.548, 0.482, 0.419, 0.000)
		colorSnow      (0.597, 0.513, 0.442, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0259451
		Period          0.0597595
		Eccentricity    0.0973131
		Inclination     -56.6015
		AscendingNode   145.686
		ArgOfPericenter -51.3503
		MeanAnomaly     -84.5137
	}
}

DwarfMoon	"5.D38"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            4.95968e-008
	Radius          54.9925
	InertiaMoment   0.397334

	Obliquity       -18.7694
	EqAscendNode    59.2279
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.703 0.699 0.696)

	Surface
	{
		SurfStyle       0.526627
		OceanStyle      0.341197
		Randomize      (-0.255, 0.919, 0.150)
		colorDistMagn   0.834111
		colorDistFreq   1.82586
		detailScale     1501.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0.537126
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.428611
		terraceProb     0.344943
		erosion         0
		montesMagn      0.487769
		montesFreq      3.16957
		montesSpiky     0.913324
		montesFraction  0.559516
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.35518
		hillsFraction   0.665435
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236915
		craterFreq      0.245472
		craterDensity   0.910651
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.7153
		volcanoTemp     1310.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.238, 0.195, 0.000)
		colorShelf     (0.281, 0.245, 0.223, 0.000)
		colorBeach     (0.331, 0.287, 0.264, 0.000)
		colorDesert    (0.359, 0.308, 0.257, 0.000)
		colorLowland   (0.394, 0.329, 0.292, 0.000)
		colorUpland    (0.436, 0.399, 0.355, 0.000)
		colorRock      (0.471, 0.434, 0.383, 0.000)
		colorSnow      (0.513, 0.462, 0.404, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0263929
		Period          0.0613131
		Eccentricity    0.189548
		Inclination     -18.7694
		AscendingNode   59.2279
		ArgOfPericenter 76.1889
		MeanAnomaly     -24.6479
	}
}

DwarfMoon	"5.D39"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            6.74126e-008
	Radius          58.0242
	InertiaMoment   0.398751

	Obliquity       -38.7357
	EqAscendNode    -164.289
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.770 0.668 0.631)

	Surface
	{
		SurfStyle       0.116606
		OceanStyle      0.279167
		Randomize      (0.156, 0.828, 0.591)
		colorDistMagn   0.114139
		colorDistFreq   2.18296
		detailScale     1584.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.17042
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.414666
		terraceProb     0.520918
		erosion         0
		montesMagn      0.467984
		montesFreq      2.45205
		montesSpiky     0.949297
		montesFraction  0.728399
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.49179
		hillsFraction   0.650858
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.196818
		craterFreq      0.189102
		craterDensity   0.796336
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.0384
		volcanoTemp     1396.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.267, 0.252, 0.000)
		colorShelf     (0.327, 0.284, 0.268, 0.000)
		colorBeach     (0.347, 0.301, 0.284, 0.000)
		colorDesert    (0.366, 0.317, 0.300, 0.000)
		colorLowland   (0.385, 0.334, 0.315, 0.000)
		colorUpland    (0.404, 0.351, 0.331, 0.000)
		colorRock      (0.424, 0.368, 0.347, 0.000)
		colorSnow      (0.443, 0.384, 0.363, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.027007
		Period          0.0634655
		Eccentricity    0.294181
		Inclination     -38.7357
		AscendingNode   -164.289
		ArgOfPericenter 6.41289
		MeanAnomaly     -52.0214
	}
}

DwarfMoon	"5.D40"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            9.18269e-008
	Radius          61.7843
	InertiaMoment   0.399704

	Obliquity       -59.915
	EqAscendNode    -0.853444
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.413 0.408 0.404)

	Surface
	{
		SurfStyle       0.959125
		OceanStyle      0.304353
		Randomize      (-0.466, -0.417, -0.190)
		colorDistMagn   0.334726
		colorDistFreq   2.33259
		detailScale     1687.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.867552
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.699045
		terraceProb     0.129576
		erosion         0
		montesMagn      0.663602
		montesFreq      2.6784
		montesSpiky     0.924683
		montesFraction  0.682852
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.3526
		hillsFraction   0.565457
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246218
		craterFreq      0.229369
		craterDensity   0.869723
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.9668
		volcanoTemp     1690.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.140, 0.143, 0.161, 0.050)
		colorShelf     (0.165, 0.167, 0.186, 0.040)
		colorBeach     (0.190, 0.192, 0.210, 0.030)
		colorDesert    (0.215, 0.216, 0.238, 0.020)
		colorLowland   (0.239, 0.240, 0.262, 0.030)
		colorUpland    (0.264, 0.265, 0.287, 0.050)
		colorRock      (0.289, 0.289, 0.319, 0.020)
		colorSnow      (0.289, 0.289, 0.319, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0273627
		Period          0.0647233
		Eccentricity    0.340078
		Inclination     -59.915
		AscendingNode   -0.853444
		ArgOfPericenter 128.07
		MeanAnomaly     66.6022
	}
}

DwarfMoon	"5.D41"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.25472e-007
	Radius          64.5472
	InertiaMoment   0.397611

	RotationPeriod  1756.13
	Obliquity       -88.884
	EqAscendNode    115.123

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.500 0.495 0.494)

	Surface
	{
		SurfStyle       0.554608
		OceanStyle      0.549077
		Randomize      (0.968, -0.972, 0.124)
		colorDistMagn   0.259567
		colorDistFreq   0.57341
		detailScale     1762.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.905298
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.403751
		terraceProb     0.33922
		erosion         0
		montesMagn      0.644767
		montesFreq      3.12611
		montesSpiky     0.910968
		montesFraction  0.82454
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.3061
		hillsFraction   0.744566
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257159
		craterFreq      0.228332
		craterDensity   0.864557
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.57
		volcanoTemp     1773.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.168, 0.138, 0.000)
		colorShelf     (0.200, 0.173, 0.158, 0.000)
		colorBeach     (0.235, 0.203, 0.188, 0.000)
		colorDesert    (0.255, 0.218, 0.183, 0.000)
		colorLowland   (0.280, 0.233, 0.207, 0.000)
		colorUpland    (0.310, 0.282, 0.252, 0.000)
		colorRock      (0.335, 0.307, 0.272, 0.000)
		colorSnow      (0.365, 0.327, 0.286, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0279392
		Period          0.0667795
		Eccentricity    0.346822
		Inclination     -88.884
		AscendingNode   115.123
		ArgOfPericenter 10.0679
		MeanAnomaly     -28.3087
	}
}

DwarfMoon	"5.D42"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.72152e-007
	Radius          84.053
	InertiaMoment   0.3989

	RotationPeriod  3007.99
	Obliquity       -17.7916
	EqAscendNode    -151.935

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.677 0.626 0.598)

	Surface
	{
		SurfStyle       0.910025
		OceanStyle      0.066371
		Randomize      (-0.561, 0.744, -0.129)
		colorDistMagn   0.946092
		colorDistFreq   3.82978
		detailScale     2295.21
		colorConversion true
		snowLevel       2
		tropicLatitude  0.147771
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.322714
		terraceProb     0.463877
		erosion         0
		montesMagn      0.56986
		montesFreq      1.99993
		montesSpiky     0.85035
		montesFraction  0.668638
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.4687
		hillsFraction   0.427996
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217967
		craterFreq      0.271155
		craterDensity   0.920993
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.7617
		volcanoTemp     1744.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.219, 0.239, 0.050)
		colorShelf     (0.271, 0.257, 0.275, 0.040)
		colorBeach     (0.311, 0.294, 0.311, 0.030)
		colorDesert    (0.352, 0.332, 0.353, 0.020)
		colorLowland   (0.393, 0.369, 0.389, 0.030)
		colorUpland    (0.433, 0.407, 0.424, 0.050)
		colorRock      (0.474, 0.444, 0.472, 0.020)
		colorSnow      (0.474, 0.444, 0.472, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0284529
		Period          0.06863
		Eccentricity    0.254471
		Inclination     -17.7916
		AscendingNode   -151.935
		ArgOfPericenter 142.943
		MeanAnomaly     -167.52
	}
}

DwarfMoon	"5.D43"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.37429e-007
	Radius          88.8051
	InertiaMoment   0.39983

	Obliquity       -58.9878
	EqAscendNode    -153.49
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.646 0.640 0.636)

	Surface
	{
		SurfStyle       0.123827
		OceanStyle      0.228546
		Randomize      (0.817, -0.881, -0.222)
		colorDistMagn   0.678409
		colorDistFreq   5.53104
		detailScale     2424.97
		colorConversion true
		snowLevel       2
		tropicLatitude  0.385353
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.55094
		terraceProb     0.120939
		erosion         0
		montesMagn      0.36855
		montesFreq      3.92451
		montesSpiky     0.923106
		montesFraction  0.824234
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.9093
		hillsFraction   0.565392
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238408
		craterFreq      0.257709
		craterDensity   1.05336
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.5744
		volcanoTemp     1641.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.256, 0.254, 0.000)
		colorShelf     (0.274, 0.272, 0.270, 0.000)
		colorBeach     (0.290, 0.288, 0.286, 0.000)
		colorDesert    (0.307, 0.304, 0.302, 0.000)
		colorLowland   (0.323, 0.320, 0.318, 0.000)
		colorUpland    (0.339, 0.336, 0.334, 0.000)
		colorRock      (0.355, 0.352, 0.350, 0.000)
		colorSnow      (0.371, 0.368, 0.366, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0287334
		Period          0.069647
		Eccentricity    0.0355204
		Inclination     -58.9878
		AscendingNode   -153.49
		ArgOfPericenter 29.6448
		MeanAnomaly     -161.625
	}
}

DwarfMoon	"5.D44"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            3.29567e-007
	Radius          95.1551
	InertiaMoment   0.397849

	Obliquity       -44.4195
	EqAscendNode    -129.574
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.663 0.657 0.654)

	Surface
	{
		SurfStyle       0.0660313
		OceanStyle      0.940352
		Randomize      (0.491, 0.833, -0.666)
		colorDistMagn   0.852434
		colorDistFreq   6.39317
		detailScale     2598.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.569179
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.749682
		terraceProb     0.263305
		erosion         0
		montesMagn      0.516871
		montesFreq      2.53016
		montesSpiky     0.982962
		montesFraction  0.587459
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.3412
		hillsFraction   0.566057
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2413
		craterFreq      0.301444
		craterDensity   0.754127
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.9876
		volcanoTemp     1407.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.263, 0.261, 0.000)
		colorShelf     (0.282, 0.279, 0.278, 0.000)
		colorBeach     (0.298, 0.296, 0.294, 0.000)
		colorDesert    (0.315, 0.312, 0.310, 0.000)
		colorLowland   (0.331, 0.328, 0.327, 0.000)
		colorUpland    (0.348, 0.345, 0.343, 0.000)
		colorRock      (0.364, 0.361, 0.359, 0.000)
		colorSnow      (0.381, 0.378, 0.376, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0290568
		Period          0.0708262
		Eccentricity    0.104502
		Inclination     -44.4195
		AscendingNode   -129.574
		ArgOfPericenter 139.793
		MeanAnomaly     160.05
	}
}

DwarfPlanet	"6"
{
	ParentBody     "Proxima"
	Class	       "IceWorld"

	Mass            0.00298482
	Radius          1262.25
	InertiaMoment   0.397095

	Oblateness      0.00165791

	RotationPeriod  61.9668
	Obliquity       32.2546
	EqAscendNode    -17.2408

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.670 0.616 0.537)

	Surface
	{
		SurfStyle       0.385168
		OceanStyle      0.905362
		Randomize      (0.739, 0.456, 0.206)
		colorDistMagn   0.0832022
		colorDistFreq   172.617
		detailScale     3246.57
		colorConversion true
		drivenDarkening 0
		seaLevel        0.207196
		snowLevel       2
		tropicLatitude  0.530266
		icecapLatitude  1
		icecapHeight    0.207196
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.84304
		venusFreq       0.597338
		venusMagn       0
		mareFreq        0.467963
		mareDensity     0.000728539
		terraceProb     0.440704
		erosion         0
		montesMagn      0.0732237
		montesFreq      70.3275
		montesSpiky     0.904264
		montesFraction  0.961719
		dunesMagn       0.0516241
		dunesFreq       1710.31
		dunesFraction   0.018193
		hillsMagn       0.107216
		hillsFreq       145.416
		hillsFraction   0.872728
		hills2Fraction  0.0957364
		riversMagn      73.0822
		riversFreq      2.63868
		riversSin       5.4129
		riversOctaves   0
		canyonsMagn     0.508414
		canyonsFreq     0.429557
		canyonFraction  0
		cracksMagn      0.0511724
		cracksFreq      0.719326
		cracksOctaves   1
		craterMagn      0.630587
		craterFreq      4.44711
		craterDensity   0.806428
		craterOctaves   10
		craterRayedFactor 0.274063
		volcanoMagn     0.208429
		volcanoFreq     0.866675
		volcanoDensity  0.0536597
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.263656
		volcanoRadius   0.784851
		volcanoTemp     1393.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.670, 0.616, 0.537, 0.500)
		colorShelf     (0.637, 0.586, 0.510, 0.500)
		colorBeach     (0.469, 0.431, 0.376, 0.750)
		colorDesert    (0.570, 0.524, 0.456, 1.000)
		colorLowland   (0.590, 0.542, 0.472, 1.000)
		colorUpland    (0.623, 0.573, 0.499, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.590, 0.542, 0.472, 1.000)
		colorUpPlants  (0.623, 0.573, 0.499, 1.000)
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
		Height          94.6686
		Density         1.08153e-007
		Pressure        1.27229e-008
		Greenhouse      0.00180143
		Bright          0.640925
		Opacity         0
		SkyLight        0.213642
		Hue             0.04486
		Saturation      1

		Composition
		{
			N2    	99.9753
			Ne    	0.0224881
			Ar    	0.00119562
			CO    	0.000713761
			O2    	0.00034682
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.528698
		Period          1.09612
		Eccentricity    0.0729384
		Inclination     -6.23741
		AscendingNode   -12.4425
		ArgOfPericenter 126.642
		MeanAnomaly     222.753
	}
}

DwarfMoon	"6.D1"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.62533e-011
	Radius          4.47743
	InertiaMoment   0.396378

	Oblateness      0.249

	Obliquity       0.0106825
	EqAscendNode    160.354
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.757 0.754 0.751)

	Surface
	{
		SurfStyle       0.642967
		OceanStyle      0.268865
		Randomize      (-0.320, -0.111, 0.488)
		colorDistMagn   0.760627
		colorDistFreq   0.0032665
		detailScale     122.264
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.319671
		terraceProb     0.613615
		erosion         0
		montesMagn      0.61975
		montesFreq      3.08341
		montesSpiky     0.93482
		montesFraction  0.487179
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0600973
		hillsFraction   0.492138
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241842
		craterFreq      0.21999
		craterDensity   0.872816
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   116.59
		volcanoTemp     1328.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.256, 0.210, 0.000)
		colorShelf     (0.303, 0.264, 0.240, 0.000)
		colorBeach     (0.356, 0.309, 0.285, 0.000)
		colorDesert    (0.386, 0.332, 0.278, 0.000)
		colorLowland   (0.424, 0.354, 0.315, 0.000)
		colorUpland    (0.469, 0.430, 0.383, 0.000)
		colorRock      (0.507, 0.467, 0.413, 0.000)
		colorSnow      (0.552, 0.498, 0.435, 1.000)
		BumpHeight      4.02968
		BumpOffset      0.805937
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.8558e-005
		Period          0.000846289
		Eccentricity    4.96459e-005
		Inclination     0.0106825
		AscendingNode   160.354
		ArgOfPericenter 76.7396
		MeanAnomaly     -4.08722
	}
}

Planet	"7"
{
	ParentBody     "Proxima"
	Class	       "IceWorld"

	Mass            0.0174004
	Radius          2119.2
	InertiaMoment   0.364714

	Oblateness      0.00278849

	RotationPeriod  40.5214
	Obliquity       -72.5753
	EqAscendNode    -69.205

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.563 0.556 0.546)

	Surface
	{
		SurfStyle       0.106317
		OceanStyle      0.124258
		Randomize      (-0.867, 0.244, 0.466)
		colorDistMagn   0.0492527
		colorDistFreq   271.648
		detailScale     5450.71
		colorConversion true
		drivenDarkening 0
		seaLevel        0.178317
		snowLevel       2
		tropicLatitude  0.958715
		icecapLatitude  1
		icecapHeight    0.178317
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.85117
		venusFreq       0.824859
		venusMagn       0.134686
		mareFreq        1.27161
		mareDensity     0.00464889
		terraceProb     0.135493
		erosion         0
		montesMagn      0.143329
		montesFreq      125.121
		montesSpiky     0.868817
		montesFraction  0.443731
		dunesMagn       0.0351474
		dunesFreq       2852.28
		dunesFraction   0.45164
		hillsMagn       0.126832
		hillsFreq       223.238
		hillsFraction   0.277007
		hills2Fraction  0.242787
		riversMagn      58.0359
		riversFreq      2.5301
		riversSin       6.43542
		riversOctaves   0
		canyonsMagn     0.490827
		canyonsFreq     0.671999
		canyonFraction  0
		cracksMagn      0.0314284
		cracksFreq      1.4139
		cracksOctaves   2
		craterMagn      0.579648
		craterFreq      6.43095
		craterDensity   0.991512
		craterOctaves   11
		craterRayedFactor 0.143215
		volcanoMagn     0.393295
		volcanoFreq     1.0554
		volcanoDensity  0.0552519
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.268696
		volcanoRadius   0.664592
		volcanoTemp     1567.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.563, 0.556, 0.546, 0.500)
		colorShelf     (0.535, 0.528, 0.518, 0.500)
		colorBeach     (0.394, 0.389, 0.382, 0.750)
		colorDesert    (0.479, 0.473, 0.464, 1.000)
		colorLowland   (0.496, 0.489, 0.480, 1.000)
		colorUpland    (0.524, 0.517, 0.508, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.496, 0.489, 0.480, 1.000)
		colorUpPlants  (0.524, 0.517, 0.508, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999836
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
		Height          158.94
		Density         1.63721e-005
		Pressure        8.84136e-006
		Greenhouse      0.0400577
		Bright          1.74913
		Opacity         0
		SkyLight        0.583042
		Hue             -0.0371077
		Saturation      1

		Composition
		{
			He    	97.8803
			Ne    	2.11969
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.1382
		Period          3.46237
		Eccentricity    0.0297827
		Inclination     -2.46749
		AscendingNode   -68.8758
		ArgOfPericenter 239.995
		MeanAnomaly     129.337
	}
}

DwarfMoon	"7.D1"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.20762e-009
	Radius          17.224
	InertiaMoment   0.399643

	Oblateness      0.249

	Obliquity       0.00480938
	EqAscendNode    -145.388
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.697 0.695 0.693)

	Surface
	{
		SurfStyle       0.454574
		OceanStyle      0.175101
		Randomize      (0.593, -0.038, 0.330)
		colorDistMagn   0.46654
		colorDistFreq   0.254292
		detailScale     470.331
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.564365
		terraceProb     0.327877
		erosion         0
		montesMagn      0.507139
		montesFreq      2.30457
		montesSpiky     0.91948
		montesFraction  0.691901
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.763197
		hillsFraction   0.363039
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261798
		craterFreq      0.157887
		craterDensity   0.945914
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.475
		volcanoTemp     1583.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.278, 0.277, 0.000)
		colorShelf     (0.296, 0.295, 0.295, 0.000)
		colorBeach     (0.314, 0.313, 0.312, 0.000)
		colorDesert    (0.331, 0.330, 0.329, 0.000)
		colorLowland   (0.349, 0.347, 0.347, 0.000)
		colorUpland    (0.366, 0.365, 0.364, 0.000)
		colorRock      (0.384, 0.382, 0.381, 0.000)
		colorSnow      (0.401, 0.400, 0.399, 1.000)
		BumpHeight      15.5016
		BumpOffset      3.10033
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.95925e-005
		Period          0.000705784
		Eccentricity    9.48213e-006
		Inclination     0.00480938
		AscendingNode   -145.388
		ArgOfPericenter 6.88648
		MeanAnomaly     -90.4604
	}
}

DwarfMoon	"7.D2"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            3.08694e-009
	Radius          22.5804
	InertiaMoment   0.397483

	Oblateness      0.249

	Obliquity       0.00418954
	EqAscendNode    -100.809
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.721 0.718 0.713)

	Surface
	{
		SurfStyle       0.63704
		OceanStyle      0.536628
		Randomize      (0.194, 0.920, -0.039)
		colorDistMagn   0.660386
		colorDistFreq   0.219976
		detailScale     616.595
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.473382
		terraceProb     0.473093
		erosion         0
		montesMagn      0.55161
		montesFreq      3.28049
		montesSpiky     0.869674
		montesFraction  0.404478
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.25605
		hillsFraction   0.502729
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215937
		craterFreq      0.200166
		craterDensity   0.885943
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.7197
		volcanoTemp     1185.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.244, 0.200, 0.000)
		colorShelf     (0.288, 0.251, 0.228, 0.000)
		colorBeach     (0.339, 0.294, 0.271, 0.000)
		colorDesert    (0.368, 0.316, 0.264, 0.000)
		colorLowland   (0.404, 0.337, 0.299, 0.000)
		colorUpland    (0.447, 0.409, 0.363, 0.000)
		colorRock      (0.483, 0.445, 0.392, 0.000)
		colorSnow      (0.526, 0.474, 0.413, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.41832e-005
		Period          0.000876233
		Eccentricity    6.11052e-005
		Inclination     0.00418954
		AscendingNode   -100.809
		ArgOfPericenter 124.886
		MeanAnomaly     -120.803
	}
}

DwarfMoon	"7.D3"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            4.28331e-009
	Radius          23.6062
	InertiaMoment   0.398829

	Oblateness      0.249

	Obliquity       -0.00674641
	EqAscendNode    -17.8191
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.503 0.498 0.496)

	Surface
	{
		SurfStyle       0.57363
		OceanStyle      0.024571
		Randomize      (0.263, 0.917, 0.263)
		colorDistMagn   0.87963
		colorDistFreq   0.358934
		detailScale     644.607
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.613195
		terraceProb     0.324403
		erosion         0
		montesMagn      0.400183
		montesFreq      3.07378
		montesSpiky     0.939552
		montesFraction  0.276317
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.7746
		hillsFraction   0.82288
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244053
		craterFreq      0.196586
		craterDensity   0.901301
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   56.5513
		volcanoTemp     1520.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.169, 0.139, 0.000)
		colorShelf     (0.201, 0.174, 0.159, 0.000)
		colorBeach     (0.237, 0.204, 0.188, 0.000)
		colorDesert    (0.257, 0.219, 0.184, 0.000)
		colorLowland   (0.282, 0.234, 0.208, 0.000)
		colorUpland    (0.312, 0.284, 0.253, 0.000)
		colorRock      (0.337, 0.309, 0.273, 0.000)
		colorSnow      (0.367, 0.329, 0.288, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.77936e-005
		Period          0.00101866
		Eccentricity    8.48903e-005
		Inclination     -0.00674641
		AscendingNode   -17.8191
		ArgOfPericenter 10.9244
		MeanAnomaly     101.758
	}
}

Moon	"7.1"
{
	ParentBody     "7"
	Class	       "IceWorld"

	Mass            4.6804e-005
	Radius          299.43
	InertiaMoment   0.39922

	Oblateness      0.012729

	Obliquity       1.28912
	EqAscendNode    51.3236
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.771 0.769 0.768)

	Surface
	{
		SurfStyle       0.754042
		OceanStyle      0.538104
		Randomize      (-0.603, -0.555, 0.488)
		colorDistMagn   0.0576268
		colorDistFreq   33.6763
		detailScale     770.15
		colorConversion true
		drivenDarkening 0
		seaLevel        0.251112
		snowLevel       2
		tropicLatitude  0.0405484
		icecapLatitude  0.60932
		icecapHeight    0.279642
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.67377
		venusFreq       1.07396
		venusMagn       0.185438
		mareFreq        0
		mareDensity     6.30912e-005
		terraceProb     0.273259
		erosion         0
		montesMagn      0.0733976
		montesFreq      15.4991
		montesSpiky     0.921042
		montesFraction  0.506909
		dunesMagn       0.0585573
		dunesFreq       392.562
		dunesFraction   0.326942
		hillsMagn       0.110931
		hillsFreq       39.9974
		hillsFraction   0.554103
		hills2Fraction  0.041876
		riversMagn      59.0527
		riversFreq      2.93974
		riversSin       6.36899
		riversOctaves   0
		canyonsMagn     0.594478
		canyonsFreq     0.0869609
		canyonFraction  0
		cracksMagn      0.0275567
		cracksFreq      0.145623
		cracksOctaves   0
		craterMagn      0.781593
		craterFreq      0.705878
		craterDensity   0.977431
		craterOctaves   8
		craterRayedFactor 0.163955
		volcanoMagn     0.195727
		volcanoFreq     0.668225
		volcanoDensity  0.0657016
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.229615
		volcanoRadius   1.14636
		volcanoTemp     1788.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.494, 0.492, 0.515, 0.250)
		colorShelf     (0.540, 0.561, 0.584, 0.250)
		colorBeach     (0.440, 0.415, 0.445, 0.200)
		colorDesert    (0.409, 0.377, 0.392, 0.200)
		colorLowland   (0.301, 0.292, 0.323, 0.200)
		colorUpland    (0.571, 0.569, 0.584, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.301, 0.292, 0.323, 0.200)
		colorUpPlants  (0.571, 0.569, 0.584, 0.250)
		BumpHeight      14.9715
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
		SemiMajorAxis   6.62937e-005
		Period          0.00236333
		Eccentricity    0.00784871
		Inclination     1.28912
		AscendingNode   51.3236
		ArgOfPericenter 139.364
		MeanAnomaly     109.016
	}
}

Moon	"7.2"
{
	ParentBody     "7"
	Class	       "IceWorld"

	Mass            5.45559e-005
	Radius          334.722
	InertiaMoment   0.398695

	Oblateness      0.00106214

	Obliquity       -0.526526
	EqAscendNode    -131.558
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.626 0.625 0.621)

	Surface
	{
		SurfStyle       0.685842
		OceanStyle      0.0684731
		Randomize      (0.664, -0.831, 0.876)
		colorDistMagn   0.067853
		colorDistFreq   36.3689
		detailScale     860.923
		colorConversion true
		drivenDarkening 0
		seaLevel        0.190156
		snowLevel       2
		tropicLatitude  0.00754069
		icecapLatitude  0.538026
		icecapHeight    0.232498
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.8416
		venusFreq       0.658579
		venusMagn       0.19917
		mareFreq        0
		mareDensity     4.92617e-005
		terraceProb     0.49732
		erosion         0
		montesMagn      0.0460844
		montesFreq      17.7469
		montesSpiky     0.985171
		montesFraction  0.176099
		dunesMagn       0.0379615
		dunesFreq       439.572
		dunesFraction   0.445413
		hillsMagn       0.130426
		hillsFreq       45.3891
		hillsFraction   0.760921
		hills2Fraction  0.255472
		riversMagn      57.7626
		riversFreq      2.39759
		riversSin       5.04726
		riversOctaves   0
		canyonsMagn     0.607802
		canyonsFreq     0.149197
		canyonFraction  0
		cracksMagn      0.0667145
		cracksFreq      0.232453
		cracksOctaves   0
		craterMagn      0.707025
		craterFreq      1.16254
		craterDensity   0.795095
		craterOctaves   8
		craterRayedFactor 0.345959
		volcanoMagn     0.220408
		volcanoFreq     1.18776
		volcanoDensity  0.0599696
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.176328
		volcanoRadius   2.10978
		volcanoTemp     1184.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.401, 0.400, 0.416, 0.250)
		colorShelf     (0.438, 0.456, 0.472, 0.250)
		colorBeach     (0.357, 0.337, 0.360, 0.200)
		colorDesert    (0.332, 0.306, 0.317, 0.200)
		colorLowland   (0.244, 0.237, 0.261, 0.200)
		colorUpland    (0.463, 0.462, 0.472, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.244, 0.237, 0.261, 0.200)
		colorUpPlants  (0.463, 0.462, 0.472, 0.250)
		BumpHeight      16.7361
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
		SemiMajorAxis   0.000161061
		Period          0.00894762
		Eccentricity    0.0378372
		Inclination     -0.526526
		AscendingNode   -131.558
		ArgOfPericenter 107.597
		MeanAnomaly     68.3501
	}
}

Moon	"7.3"
{
	ParentBody     "7"
	Class	       "IceWorld"

	Mass            6.34129e-005
	Radius          331.257
	InertiaMoment   0.398059

	Obliquity       0.745404
	EqAscendNode    96.5237
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.642 0.639 0.635)

	Surface
	{
		SurfStyle       0.743445
		OceanStyle      0.636493
		Randomize      (0.053, -0.486, -0.023)
		colorDistMagn   0.0632573
		colorDistFreq   47.5427
		detailScale     852.013
		colorConversion true
		drivenDarkening 0
		seaLevel        0.230275
		snowLevel       2
		tropicLatitude  0.0173213
		icecapLatitude  0.722281
		icecapHeight    0.235512
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.80163
		venusFreq       1.05045
		venusMagn       0.232406
		mareFreq        0
		mareDensity     7.29967e-005
		terraceProb     0.250699
		erosion         0
		montesMagn      0.047359
		montesFreq      15.1358
		montesSpiky     0.98316
		montesFraction  0.846787
		dunesMagn       0.0358191
		dunesFreq       441.347
		dunesFraction   0.201883
		hillsMagn       0.111502
		hillsFreq       33.2182
		hillsFraction   0.365105
		hills2Fraction  0.265779
		riversMagn      62.3709
		riversFreq      2.36781
		riversSin       5.36907
		riversOctaves   0
		canyonsMagn     0.440484
		canyonsFreq     0.102013
		canyonFraction  0
		cracksMagn      0.0296122
		cracksFreq      0.0910364
		cracksOctaves   0
		craterMagn      0.798786
		craterFreq      0.959988
		craterDensity   0.810523
		craterOctaves   8
		craterRayedFactor 0.354739
		volcanoMagn     0.219567
		volcanoFreq     1.07545
		volcanoDensity  0.0663412
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.155395
		volcanoRadius   1.75353
		volcanoTemp     978.149
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.411, 0.409, 0.426, 0.250)
		colorShelf     (0.449, 0.466, 0.483, 0.250)
		colorBeach     (0.366, 0.345, 0.368, 0.200)
		colorDesert    (0.340, 0.313, 0.324, 0.200)
		colorLowland   (0.250, 0.243, 0.267, 0.200)
		colorUpland    (0.475, 0.473, 0.483, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.250, 0.243, 0.267, 0.200)
		colorUpPlants  (0.475, 0.473, 0.483, 0.250)
		BumpHeight      16.5629
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
		SemiMajorAxis   0.000251045
		Period          0.0174075
		Eccentricity    0.00361928
		Inclination     0.745404
		AscendingNode   96.5237
		ArgOfPericenter 117.012
		MeanAnomaly     56.2128
	}
}

DwarfMoon	"7.D4"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.5073e-008
	Radius          36.1489
	InertiaMoment   0.399894

	RotationPeriod  998.531
	Obliquity       -77.5468
	EqAscendNode    134.338

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.781 0.779 0.777)

	Surface
	{
		SurfStyle       0.20598
		OceanStyle      0.488029
		Randomize      (-0.551, 0.292, 0.207)
		colorDistMagn   0.577203
		colorDistFreq   0.0672677
		detailScale     987.107
		colorConversion true
		snowLevel       2
		tropicLatitude  0.701273
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495859
		terraceProb     0.452987
		erosion         0
		montesMagn      0.429003
		montesFreq      3.16423
		montesSpiky     0.961712
		montesFraction  0.596047
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.38005
		hillsFraction   0.463492
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252947
		craterFreq      0.215282
		craterDensity   0.817847
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.1638
		volcanoTemp     1401.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.312, 0.311, 0.000)
		colorShelf     (0.332, 0.331, 0.330, 0.000)
		colorBeach     (0.351, 0.350, 0.350, 0.000)
		colorDesert    (0.371, 0.370, 0.369, 0.000)
		colorLowland   (0.390, 0.389, 0.389, 0.000)
		colorUpland    (0.410, 0.409, 0.408, 0.000)
		colorRock      (0.429, 0.428, 0.428, 0.000)
		colorSnow      (0.449, 0.448, 0.447, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0011495
		Period          0.170868
		Eccentricity    0.331237
		Inclination     -77.5468
		AscendingNode   134.338
		ArgOfPericenter -12.4176
		MeanAnomaly     -165.257
	}
}

DwarfMoon	"7.D5"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.04856e-008
	Radius          38.3731
	InertiaMoment   0.39796

	Obliquity       14.9858
	EqAscendNode    -29.7713
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.662 0.659 0.654)

	Surface
	{
		SurfStyle       0.0994128
		OceanStyle      0.341791
		Randomize      (-0.721, 0.960, -0.270)
		colorDistMagn   0.862766
		colorDistFreq   0.609945
		detailScale     1047.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.483946
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.748262
		terraceProb     0.417036
		erosion         0
		montesMagn      0.514697
		montesFreq      3.54231
		montesSpiky     0.97638
		montesFraction  0.558367
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.05618
		hillsFraction   0.68195
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239301
		craterFreq      0.24232
		craterDensity   0.923645
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.0348
		volcanoTemp     1327.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.264, 0.261, 0.000)
		colorShelf     (0.281, 0.280, 0.278, 0.000)
		colorBeach     (0.298, 0.296, 0.294, 0.000)
		colorDesert    (0.314, 0.313, 0.310, 0.000)
		colorLowland   (0.331, 0.329, 0.327, 0.000)
		colorUpland    (0.347, 0.346, 0.343, 0.000)
		colorRock      (0.364, 0.362, 0.360, 0.000)
		colorSnow      (0.381, 0.379, 0.376, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00141056
		Period          0.232266
		Eccentricity    0.215809
		Inclination     14.9858
		AscendingNode   -29.7713
		ArgOfPericenter 140.268
		MeanAnomaly     70.6526
	}
}

DwarfMoon	"7.D6"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.78076e-008
	Radius          40.7201
	InertiaMoment   0.399114

	RotationPeriod  2057.53
	Obliquity       -21.3706
	EqAscendNode    -11.2791

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.694 0.692 0.690)

	Surface
	{
		SurfStyle       0.0323896
		OceanStyle      0.499845
		Randomize      (0.777, -0.910, -0.260)
		colorDistMagn   0.343799
		colorDistFreq   0.988836
		detailScale     1111.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.675902
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.34326
		terraceProb     0.15612
		erosion         0
		montesMagn      0.536722
		montesFreq      2.5485
		montesSpiky     0.943136
		montesFraction  0.53586
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.49642
		hillsFraction   0.745323
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231217
		craterFreq      0.212248
		craterDensity   0.962207
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.2854
		volcanoTemp     1648.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.277, 0.276, 0.000)
		colorShelf     (0.295, 0.294, 0.293, 0.000)
		colorBeach     (0.312, 0.312, 0.310, 0.000)
		colorDesert    (0.330, 0.329, 0.328, 0.000)
		colorLowland   (0.347, 0.346, 0.345, 0.000)
		colorUpland    (0.364, 0.363, 0.362, 0.000)
		colorRock      (0.382, 0.381, 0.379, 0.000)
		colorSnow      (0.399, 0.398, 0.397, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00186136
		Period          0.352084
		Eccentricity    0.0756809
		Inclination     -21.3706
		AscendingNode   -11.2791
		ArgOfPericenter -121.232
		MeanAnomaly     27.0454
	}
}

DwarfMoon	"7.D7"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            3.7733e-008
	Radius          54.262
	InertiaMoment   0.39467

	Obliquity       -34.0376
	EqAscendNode    -159.672
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.445 0.441 0.435)

	Surface
	{
		SurfStyle       0.733634
		OceanStyle      0.872095
		Randomize      (0.695, -0.146, -0.601)
		colorDistMagn   0.362407
		colorDistFreq   2.09795
		detailScale     1481.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.196582
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.328437
		terraceProb     0.476059
		erosion         0
		montesMagn      0.653191
		montesFreq      3.06176
		montesSpiky     0.982265
		montesFraction  0.675924
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.51178
		hillsFraction   0.583887
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228449
		craterFreq      0.225289
		craterDensity   0.923321
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   43.7967
		volcanoTemp     1730.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.150, 0.122, 0.000)
		colorShelf     (0.178, 0.154, 0.139, 0.000)
		colorBeach     (0.209, 0.181, 0.165, 0.000)
		colorDesert    (0.227, 0.194, 0.161, 0.000)
		colorLowland   (0.249, 0.207, 0.183, 0.000)
		colorUpland    (0.276, 0.251, 0.222, 0.000)
		colorRock      (0.298, 0.274, 0.239, 0.000)
		colorSnow      (0.325, 0.291, 0.252, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00237123
		Period          0.506245
		Eccentricity    0.394317
		Inclination     -34.0376
		AscendingNode   -159.672
		ArgOfPericenter 78.1826
		MeanAnomaly     79.6344
	}
}

DwarfMoon	"7.D8"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            5.12266e-008
	Radius          54.7414
	InertiaMoment   0.39816

	Obliquity       -16.7589
	EqAscendNode    84.2259
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.832 0.775 0.698)

	Surface
	{
		SurfStyle       0.818597
		OceanStyle      0.734856
		Randomize      (0.185, -0.639, -0.278)
		colorDistMagn   0.460034
		colorDistFreq   0.729993
		detailScale     1494.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.417902
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496709
		terraceProb     0.104724
		erosion         0
		montesMagn      0.541579
		montesFreq      2.90257
		montesSpiky     0.858285
		montesFraction  0.538776
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.64216
		hillsFraction   0.690911
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242627
		craterFreq      0.182543
		craterDensity   0.842922
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.9205
		volcanoTemp     1265.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.325, 0.263, 0.195, 0.000)
		colorShelf     (0.333, 0.271, 0.223, 0.000)
		colorBeach     (0.391, 0.318, 0.265, 0.000)
		colorDesert    (0.425, 0.341, 0.258, 0.000)
		colorLowland   (0.466, 0.364, 0.293, 0.000)
		colorUpland    (0.516, 0.441, 0.356, 0.000)
		colorRock      (0.558, 0.480, 0.384, 0.000)
		colorSnow      (0.608, 0.511, 0.405, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0028325
		Period          0.660927
		Eccentricity    0.373438
		Inclination     -16.7589
		AscendingNode   84.2258
		ArgOfPericenter 125.874
		MeanAnomaly     -127.651
	}
}

Planet	"8"
{
	ParentBody     "Proxima"
	Class	       "IceWorld"

	Mass            0.0893802
	Radius          3827.92
	InertiaMoment   0.332628

	Oblateness      0.00489792

	RotationPeriod  30.8666
	Obliquity       13.0278
	EqAscendNode    36.3434

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.443 0.435 0.429)

	Surface
	{
		SurfStyle       0.701528
		OceanStyle      0.686317
		Randomize      (0.742, -0.613, -0.121)
		colorDistMagn   0.0542095
		colorDistFreq   376
		detailScale     9845.63
		colorConversion true
		drivenDarkening 0
		seaLevel        0.18228
		snowLevel       2
		tropicLatitude  0.22177
		icecapLatitude  1
		icecapHeight    0.18228
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.77546
		venusFreq       0.97893
		venusMagn       0.283759
		mareFreq        1.58502
		mareDensity     0.00972631
		terraceProb     0.216301
		erosion         0
		montesMagn      0.222526
		montesFreq      147.73
		montesSpiky     0.944494
		montesFraction  0.96493
		dunesMagn       0.0336067
		dunesFreq       4994.96
		dunesFraction   0.15367
		hillsMagn       0.13667
		hillsFreq       371.46
		hillsFraction   0.104379
		hills2Fraction  0.216569
		riversMagn      60.4102
		riversFreq      2.46024
		riversSin       5.41955
		riversOctaves   0
		canyonsMagn     0.577888
		canyonsFreq     1.46075
		canyonFraction  0
		cracksMagn      0.0499917
		cracksFreq      2.16142
		cracksOctaves   4
		craterMagn      0.560875
		craterFreq      12.8055
		craterDensity   0.780641
		craterOctaves   9.38738
		craterRayedFactor 0.208916
		volcanoMagn     0.691979
		volcanoFreq     0.732446
		volcanoDensity  0.0503758
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.473189
		volcanoRadius   0.36759
		volcanoTemp     1809.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.278, 0.287, 0.250)
		colorShelf     (0.310, 0.317, 0.326, 0.250)
		colorBeach     (0.253, 0.235, 0.249, 0.200)
		colorDesert    (0.235, 0.213, 0.219, 0.200)
		colorLowland   (0.173, 0.165, 0.180, 0.200)
		colorUpland    (0.328, 0.322, 0.326, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.173, 0.165, 0.180, 0.200)
		colorUpPlants  (0.328, 0.322, 0.326, 0.250)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.956365
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          191.396
		Density         0.0043635
		Pressure        0.00449941
		Greenhouse      0.422715
		Bright          5.34524
		Opacity         1
		SkyLight        1.78175
		Hue             -0.0254057
		Saturation      1

		Composition
		{
			H2    	99.9976
			He    	0.00127492
			Ne    	0.00109226
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.23689
		Period          9.53924
		Eccentricity    0.0756783
		Inclination     -0.279437
		AscendingNode   39.375
		ArgOfPericenter 246.468
		MeanAnomaly     115
	}
}

DwarfMoon	"8.D1"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            1.18599e-006
	Radius          152.929
	InertiaMoment   0.39709

	Oblateness      0.22863

	Obliquity       -0.00230341
	EqAscendNode    -1.97222
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.477 0.471 0.464)

	Surface
	{
		SurfStyle       0.0499212
		OceanStyle      0.314376
		Randomize      (0.443, -0.671, 0.176)
		colorDistMagn   0.56784
		colorDistFreq   5.70842
		detailScale     4175.98
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.387726
		terraceProb     0.300056
		erosion         0
		montesMagn      0.424015
		montesFreq      2.14078
		montesSpiky     0.858621
		montesFraction  0.614555
		dunesFraction   0
		hillsMagn       0
		hillsFreq       45.3613
		hillsFraction   0.622654
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272345
		craterFreq      0.801454
		craterDensity   1.03732
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.0168
		volcanoTemp     1573.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.188, 0.186, 0.000)
		colorShelf     (0.203, 0.200, 0.197, 0.000)
		colorBeach     (0.215, 0.212, 0.209, 0.000)
		colorDesert    (0.227, 0.224, 0.220, 0.000)
		colorLowland   (0.239, 0.235, 0.232, 0.000)
		colorUpland    (0.250, 0.247, 0.244, 0.000)
		colorRock      (0.262, 0.259, 0.255, 0.000)
		colorSnow      (0.274, 0.271, 0.267, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   7.56783e-005
		Period          0.00127354
		Eccentricity    7.25645e-005
		Inclination     -0.00230341
		AscendingNode   -1.97222
		ArgOfPericenter 173.032
		MeanAnomaly     122.481
	}
}

Planet	"9"
{
	ParentBody     "Proxima"
	Class	       "IceWorld"

	Mass            0.431188
	Radius          5908.81
	InertiaMoment   0.331557

	Oblateness      0.0075513

	RotationPeriod  21.6634
	Obliquity       9.86007
	EqAscendNode    29.5221

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.657 0.472 0.424)

	Surface
	{
		SurfStyle       0.557354
		OceanStyle      0.233888
		Randomize      (0.056, -0.433, -0.815)
		colorDistMagn   0.0930049
		colorDistFreq   694.639
		detailScale     15197.8
		colorConversion true
		drivenDarkening 0
		seaLevel        0.141015
		snowLevel       2
		tropicLatitude  0.151845
		icecapLatitude  1
		icecapHeight    0.141015
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.85871
		venusFreq       1.02355
		venusMagn       0.239659
		mareFreq        1.78251
		mareDensity     0.0375972
		terraceProb     0.271356
		erosion         0
		montesMagn      0.185913
		montesFreq      343.683
		montesSpiky     0.977596
		montesFraction  0.691713
		dunesMagn       0.039408
		dunesFreq       7767.08
		dunesFraction   0.248382
		hillsMagn       0.120993
		hillsFreq       671.801
		hillsFraction   0.460327
		hills2Fraction  0.248002
		riversMagn      67.3196
		riversFreq      3.48965
		riversSin       7.06883
		riversOctaves   0
		canyonsMagn     0.537113
		canyonsFreq     2.20468
		canyonFraction  0
		cracksMagn      0.0609007
		cracksFreq      3.84861
		cracksOctaves   6
		craterMagn      0.55242
		craterFreq      21.202
		craterDensity   0.896844
		craterOctaves   13
		craterRayedFactor 0.0691105
		volcanoMagn     0.638354
		volcanoFreq     1.59573
		volcanoDensity  0.0516903
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.344881
		volcanoRadius   0.562823
		volcanoTemp     1686.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.118, 0.093, 0.000)
		colorShelf     (0.243, 0.146, 0.119, 0.000)
		colorBeach     (0.368, 0.222, 0.178, 0.200)
		colorDesert    (0.335, 0.207, 0.157, 0.500)
		colorLowland   (0.256, 0.160, 0.119, 0.800)
		colorUpland    (0.434, 0.283, 0.221, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.256, 0.160, 0.119, 0.800)
		colorUpPlants  (0.434, 0.283, 0.221, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.996145
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
		Height          231.583
		Density         0.000385505
		Pressure        0.000446958
		Greenhouse      0.190652
		Bright          3.29008
		Opacity         0
		SkyLight        1.09669
		Hue             -0.0137037
		Saturation      1

		Composition
		{
			H2    	99.9931
			He    	0.00512737
			Ne    	0.00173782
		}
	}

	Aurora
	{
		Height      179.199
		NorthLat    57.9931
		NorthLon    -175.897
		NorthRadius 1271.09
		NorthWidth  1148
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -50.1934
		SouthLon    3.96495
		SouthRadius 1231.25
		SouthWidth  1300.3
		SouthRings  5
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     7767.59
		OuterRadius     16248
		RotationPeriod  5.55195
		RotationOffset  0
		FrontBright     0.51904
		BackBright      0.630951
		Density         0.717861
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.07554
		Period          23.4598
		Eccentricity    0.0701523
		Inclination     -1.4263
		AscendingNode   35.256
		ArgOfPericenter 7.80568
		MeanAnomaly     128.535
	}
}

DwarfMoon	"9.D1"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            2.34956e-010
	Radius          8.75975
	InertiaMoment   0.399834

	Oblateness      0.249

	Obliquity       -0.00879636
	EqAscendNode    96.8646
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.487 0.444 0.387)

	Surface
	{
		SurfStyle       0.918035
		OceanStyle      0.511263
		Randomize      (-0.788, 0.248, -0.381)
		colorDistMagn   0.319829
		colorDistFreq   0.020588
		detailScale     239.2
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.607272
		terraceProb     0.187561
		erosion         0
		montesMagn      0.481455
		montesFreq      2.65072
		montesSpiky     0.836993
		montesFraction  0.442486
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.187272
		hillsFraction   0.60753
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23593
		craterFreq      0.198029
		craterDensity   1.02711
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   89.5992
		volcanoTemp     975.338
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.155, 0.155, 0.050)
		colorShelf     (0.195, 0.182, 0.178, 0.040)
		colorBeach     (0.224, 0.209, 0.201, 0.030)
		colorDesert    (0.253, 0.235, 0.228, 0.020)
		colorLowland   (0.282, 0.262, 0.251, 0.030)
		colorUpland    (0.312, 0.289, 0.274, 0.050)
		colorRock      (0.341, 0.315, 0.305, 0.020)
		colorSnow      (0.341, 0.315, 0.305, 1.000)
		BumpHeight      7.88377
		BumpOffset      1.57675
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.11636e-005
		Period          0.000766616
		Eccentricity    8.40238e-005
		Inclination     -0.00879636
		AscendingNode   96.8646
		ArgOfPericenter -138.822
		MeanAnomaly     5.76454
	}
}

DwarfMoon	"9.D2"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            3.59502e-010
	Radius          9.69369
	InertiaMoment   0.397856

	Oblateness      0.249

	Obliquity       0.0113196
	EqAscendNode    -45.1593
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.799 0.713 0.682)

	Surface
	{
		SurfStyle       0.636867
		OceanStyle      0.483909
		Randomize      (-0.604, -0.328, 0.015)
		colorDistMagn   0.360295
		colorDistFreq   0.037904
		detailScale     264.702
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563785
		terraceProb     0.174743
		erosion         0
		montesMagn      0.582749
		montesFreq      3.41352
		montesSpiky     0.814108
		montesFraction  0.380919
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.170501
		hillsFraction   0.680821
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240031
		craterFreq      0.235036
		craterDensity   0.937711
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   80.1576
		volcanoTemp     1308.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.243, 0.191, 0.000)
		colorShelf     (0.320, 0.250, 0.218, 0.000)
		colorBeach     (0.376, 0.292, 0.259, 0.000)
		colorDesert    (0.407, 0.314, 0.252, 0.000)
		colorLowland   (0.447, 0.335, 0.286, 0.000)
		colorUpland    (0.495, 0.407, 0.348, 0.000)
		colorRock      (0.535, 0.442, 0.375, 0.000)
		colorSnow      (0.583, 0.471, 0.395, 1.000)
		BumpHeight      8.72432
		BumpOffset      1.74486
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000101547
		Period          0.000901256
		Eccentricity    9.51078e-005
		Inclination     0.0113196
		AscendingNode   -45.1593
		ArgOfPericenter -70.5323
		MeanAnomaly     -20.0021
	}
}

DwarfMoon	"9.D3"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            5.37481e-010
	Radius          10.315
	InertiaMoment   0.399047

	Oblateness      0.249

	Obliquity       0.0115716
	EqAscendNode    79.8674
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.775 0.772 0.769)

	Surface
	{
		SurfStyle       0.939897
		OceanStyle      0.0169202
		Randomize      (-0.202, -0.963, 0.079)
		colorDistMagn   0.789122
		colorDistFreq   0.074577
		detailScale     281.668
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.355501
		terraceProb     0.195718
		erosion         0
		montesMagn      0.548463
		montesFreq      2.73739
		montesSpiky     0.987634
		montesFraction  0.380006
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.2549
		hillsFraction   0.558648
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231807
		craterFreq      0.160571
		craterDensity   0.956848
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   69.758
		volcanoTemp     1575.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.270, 0.308, 0.050)
		colorShelf     (0.310, 0.316, 0.354, 0.040)
		colorBeach     (0.357, 0.363, 0.400, 0.030)
		colorDesert    (0.403, 0.409, 0.454, 0.020)
		colorLowland   (0.450, 0.455, 0.500, 0.030)
		colorUpland    (0.496, 0.502, 0.546, 0.050)
		colorRock      (0.543, 0.548, 0.608, 0.020)
		colorSnow      (0.543, 0.548, 0.608, 1.000)
		BumpHeight      9.2835
		BumpOffset      1.8567
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000105589
		Period          0.000955599
		Eccentricity    6.68251e-005
		Inclination     0.0115716
		AscendingNode   79.8674
		ArgOfPericenter 170.828
		MeanAnomaly     -83.1223
	}
}

DwarfMoon	"9.D4"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            7.88466e-010
	Radius          13.8596
	InertiaMoment   0.399959

	Oblateness      0.249

	Obliquity       9.28355e-006
	EqAscendNode    112.924
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.552 0.545 0.540)

	Surface
	{
		SurfStyle       0.172082
		OceanStyle      0.884797
		Randomize      (0.930, -0.308, -0.342)
		colorDistMagn   0.28486
		colorDistFreq   0.107288
		detailScale     378.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.659649
		terraceProb     0.375122
		erosion         0
		montesMagn      0.371791
		montesFreq      3.58858
		montesSpiky     0.95645
		montesFraction  0.656266
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.398413
		hillsFraction   0.748316
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200908
		craterFreq      0.211181
		craterDensity   0.870501
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   77.3865
		volcanoTemp     1429.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.221, 0.218, 0.216, 0.000)
		colorShelf     (0.235, 0.232, 0.230, 0.000)
		colorBeach     (0.248, 0.245, 0.243, 0.000)
		colorDesert    (0.262, 0.259, 0.257, 0.000)
		colorLowland   (0.276, 0.273, 0.270, 0.000)
		colorUpland    (0.290, 0.286, 0.284, 0.000)
		colorRock      (0.304, 0.300, 0.297, 0.000)
		colorSnow      (0.317, 0.313, 0.311, 1.000)
		BumpHeight      12.4736
		BumpOffset      2.49473
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000110069
		Period          0.00101705
		Eccentricity    8.26186e-005
		Inclination     9.28355e-006
		AscendingNode   112.924
		ArgOfPericenter -111.498
		MeanAnomaly     -156.761
	}
}

DwarfMoon	"9.D5"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            1.13863e-009
	Radius          14.9099
	InertiaMoment   0.398066

	Oblateness      0.248393

	Obliquity       -0.00241233
	EqAscendNode    57.9145
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.684 0.681 0.677)

	Surface
	{
		SurfStyle       0.802783
		OceanStyle      0.0878536
		Randomize      (-0.326, -0.131, -0.593)
		colorDistMagn   0.608816
		colorDistFreq   0.0152433
		detailScale     407.139
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.667496
		terraceProb     0.339136
		erosion         0
		montesMagn      0.45986
		montesFreq      3.17494
		montesSpiky     0.888357
		montesFraction  0.608241
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.512704
		hillsFraction   0.34713
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24673
		craterFreq      0.228422
		craterDensity   1.01576
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   69.2769
		volcanoTemp     1613.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.232, 0.190, 0.000)
		colorShelf     (0.273, 0.238, 0.217, 0.000)
		colorBeach     (0.321, 0.279, 0.257, 0.000)
		colorDesert    (0.349, 0.300, 0.251, 0.000)
		colorLowland   (0.383, 0.320, 0.284, 0.000)
		colorUpland    (0.424, 0.388, 0.345, 0.000)
		colorRock      (0.458, 0.422, 0.372, 0.000)
		colorSnow      (0.499, 0.450, 0.393, 1.000)
		BumpHeight      13.4189
		BumpOffset      2.68378
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000123081
		Period          0.00120263
		Eccentricity    6.97771e-005
		Inclination     -0.00241233
		AscendingNode   57.9145
		ArgOfPericenter -89.9796
		MeanAnomaly     -175.375
	}
}

Moon	"9.1"
{
	ParentBody     "9"
	Class	       "Selena"

	Mass            0.000610965
	Radius          702.926
	InertiaMoment   0.397922

	Oblateness      0.0106043

	Obliquity       -1.17479
	EqAscendNode    -137.59
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.758 0.756 0.753)

	Surface
	{
		SurfStyle       0.738623
		OceanStyle      0.0960348
		Randomize      (0.462, -0.365, 0.424)
		colorDistMagn   0.0798279
		colorDistFreq   100.22
		detailScale     1807.96
		colorConversion true
		drivenDarkening 0
		seaLevel        0.225493
		snowLevel       2
		tropicLatitude  0.01483
		icecapLatitude  0.674381
		icecapHeight    0.249448
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.73506
		venusFreq       1.17783
		venusMagn       0
		mareFreq        0.0923369
		mareDensity     0.000419635
		terraceProb     0.177877
		erosion         0
		montesMagn      0.0560178
		montesFreq      27.2705
		montesSpiky     0.906869
		montesFraction  0.6184
		dunesMagn       0.0393877
		dunesFreq       917.77
		dunesFraction   0.292548
		hillsMagn       0.113948
		hillsFreq       88.2283
		hillsFraction   0.260736
		hills2Fraction  0
		riversMagn      60.431
		riversFreq      2.91298
		riversSin       5.98193
		riversOctaves   0
		canyonsMagn     0.505049
		canyonsFreq     0.318492
		canyonFraction  0.521005
		cracksMagn      0.0735032
		cracksFreq      0.369745
		cracksOctaves   0
		craterMagn      0.55434
		craterFreq      1.49173
		craterDensity   0.821094
		craterOctaves   9.22979
		craterRayedFactor 0.199555
		volcanoMagn     0.218725
		volcanoFreq     3.21237
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.33886
		volcanoRadius   1.19358
		volcanoTemp     1470.7
		lavaCoverTidal  0.085579
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.478, 0.461, 0.361, 0.000)
		colorDesert    (0.508, 0.469, 0.369, 0.000)
		colorLowland   (0.417, 0.348, 0.294, 0.000)
		colorUpland    (0.591, 0.537, 0.391, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999998
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
		Height          52.7194
		Density         1.6934e-007
		Pressure        5.61393e-008
		Greenhouse      0.00883669
		Bright          0.701055
		Opacity         0
		SkyLight        0.233685
		Hue             0.0373315
		Saturation      1

		Composition
		{
			C2H2  	61.3186
			C2H4  	20.5966
			N2    	12.4817
			C2H6  	5.5297
			H2S   	0.0457725
			CO2   	0.0117996
			CO    	0.00764845
			Ar    	0.00586997
			Ne    	0.00211979
			Kr    	0.000168602
			C3H8  	1.573e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000204375
		Period          0.00257146
		Eccentricity    0.0203395
		Inclination     -1.17479
		AscendingNode   -137.59
		ArgOfPericenter -157.448
		MeanAnomaly     56.7782
	}
}

Moon	"9.2"
{
	ParentBody     "9"
	Class	       "IceWorld"

	Mass            0.000726659
	Radius          790.997
	InertiaMoment   0.396859

	Oblateness      0.00303721

	Obliquity       -1.49014
	EqAscendNode    -173.789
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.644 0.638 0.636)

	Surface
	{
		SurfStyle       0.994962
		OceanStyle      0.683318
		Randomize      (-0.924, -0.549, -0.242)
		colorDistMagn   0.0754037
		colorDistFreq   92.8783
		detailScale     2034.49
		colorConversion true
		drivenDarkening 0
		seaLevel        0.222648
		snowLevel       2
		tropicLatitude  0.00282613
		icecapLatitude  0.915996
		icecapHeight    0.227468
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.77184
		venusFreq       1.47207
		venusMagn       0
		mareFreq        0.133704
		mareDensity     0.000307193
		terraceProb     0.344337
		erosion         0
		montesMagn      0.0782971
		montesFreq      42.0447
		montesSpiky     0.974625
		montesFraction  0.279546
		dunesMagn       0.0469705
		dunesFreq       1031.75
		dunesFraction   0.320029
		hillsMagn       0.140317
		hillsFreq       79.3471
		hillsFraction   0.190364
		hills2Fraction  0.0675151
		riversMagn      65.6751
		riversFreq      2.99921
		riversSin       7.75745
		riversOctaves   0
		canyonsMagn     0.453584
		canyonsFreq     0.280512
		canyonFraction  0
		cracksMagn      0.0680584
		cracksFreq      0.285771
		cracksOctaves   0
		craterMagn      0.567922
		craterFreq      2.04724
		craterDensity   0.704428
		craterOctaves   10
		craterRayedFactor 0.139033
		volcanoMagn     0.220822
		volcanoFreq     0.834519
		volcanoDensity  0.0657411
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.233943
		volcanoRadius   0.959824
		volcanoTemp     1796.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.489, 0.453, 0.369, 1.000)
		colorShelf     (0.489, 0.453, 0.369, 1.000)
		colorBeach     (0.451, 0.395, 0.318, 1.000)
		colorDesert    (0.451, 0.395, 0.318, 1.000)
		colorLowland   (0.547, 0.517, 0.484, 1.000)
		colorUpland    (0.573, 0.568, 0.547, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.547, 0.517, 0.484, 1.000)
		colorUpPlants  (0.573, 0.568, 0.547, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999996
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
		Height          59.3248
		Density         3.85036e-007
		Pressure        8.29296e-008
		Greenhouse      0.00556994
		Bright          0.826229
		Opacity         0
		SkyLight        0.27541
		Hue             0.0450829
		Saturation      1

		Composition
		{
			N2    	52.1002
			CH4   	47.5886
			Ar    	0.291132
			CO    	0.0192138
			Ne    	0.000866523
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00032889
		Period          0.00524876
		Eccentricity    0.0234755
		Inclination     -1.49014
		AscendingNode   -173.789
		ArgOfPericenter -87.2116
		MeanAnomaly     -111.005
	}
}

Moon	"9.3"
{
	ParentBody     "9"
	Class	       "IceWorld"

	Mass            0.000858307
	Radius          786.731
	InertiaMoment   0.399834

	Obliquity       1.46964
	EqAscendNode    90.7501
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.605 0.600 0.597)

	Surface
	{
		SurfStyle       0.20795
		OceanStyle      0.869468
		Randomize      (0.092, -0.271, 0.681)
		colorDistMagn   0.0840381
		colorDistFreq   90.4427
		detailScale     2023.52
		colorConversion true
		drivenDarkening 0
		seaLevel        0.210316
		snowLevel       2
		tropicLatitude  0.0360262
		icecapLatitude  0.7919
		icecapHeight    0.222798
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.03374
		venusFreq       0.957436
		venusMagn       0.140796
		mareFreq        0.157767
		mareDensity     0.000420761
		terraceProb     0.41023
		erosion         0
		montesMagn      0.067456
		montesFreq      40.209
		montesSpiky     0.94165
		montesFraction  0.0206879
		dunesMagn       0.0421101
		dunesFreq       1044.62
		dunesFraction   0.803926
		hillsMagn       0.147609
		hillsFreq       98.9095
		hillsFraction   0.000227107
		hills2Fraction  0.0785044
		riversMagn      54.6745
		riversFreq      3.71959
		riversSin       4.96527
		riversOctaves   0
		canyonsMagn     0.480099
		canyonsFreq     0.272211
		canyonFraction  0
		cracksMagn      0.0472333
		cracksFreq      0.411393
		cracksOctaves   0
		craterMagn      0.584736
		craterFreq      2.23274
		craterDensity   0.791873
		craterOctaves   10
		craterRayedFactor 0.158231
		volcanoMagn     0.210481
		volcanoFreq     1.04458
		volcanoDensity  0.0553702
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.445247
		volcanoRadius   1.09949
		volcanoTemp     1176.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.605, 0.600, 0.597, 0.500)
		colorShelf     (0.575, 0.570, 0.567, 0.500)
		colorBeach     (0.423, 0.420, 0.418, 0.750)
		colorDesert    (0.514, 0.510, 0.508, 1.000)
		colorLowland   (0.532, 0.528, 0.526, 1.000)
		colorUpland    (0.563, 0.558, 0.555, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.532, 0.528, 0.526, 1.000)
		colorUpPlants  (0.563, 0.558, 0.555, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999998
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
		Height          59.0048
		Density         1.68508e-007
		Pressure        1.48016e-008
		Greenhouse      0.0010295
		Bright          0.700364
		Opacity         0
		SkyLight        0.233455
		Hue             -0.0471657
		Saturation      1

		Composition
		{
			Ne    	100
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000529268
		Period          0.0107134
		Eccentricity    0.00208623
		Inclination     1.46964
		AscendingNode   90.7501
		ArgOfPericenter 47.2306
		MeanAnomaly     -29.6933
	}
}

DwarfMoon	"9.D6"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            4.43231e-009
	Radius          23.5943
	InertiaMoment   0.399318

	Obliquity       -0.462338
	EqAscendNode    -1.05741
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.509 0.502 0.499)

	Surface
	{
		SurfStyle       0.961183
		OceanStyle      0.854564
		Randomize      (0.459, -0.188, 0.753)
		colorDistMagn   0.436203
		colorDistFreq   0.270614
		detailScale     644.282
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0161386
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.547513
		terraceProb     0.111908
		erosion         0
		montesMagn      0.476675
		montesFreq      3.10564
		montesSpiky     0.885387
		montesFraction  0.627787
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.43603
		hillsFraction   0.629079
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250962
		craterFreq      0.214114
		craterDensity   1.04996
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   55.5646
		volcanoTemp     1395.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.176, 0.200, 0.050)
		colorShelf     (0.204, 0.206, 0.229, 0.040)
		colorBeach     (0.234, 0.236, 0.259, 0.030)
		colorDesert    (0.265, 0.266, 0.294, 0.020)
		colorLowland   (0.295, 0.296, 0.324, 0.030)
		colorUpland    (0.326, 0.326, 0.354, 0.050)
		colorRock      (0.357, 0.356, 0.394, 0.020)
		colorSnow      (0.357, 0.356, 0.394, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000851725
		Period          0.0218925
		Eccentricity    0.0296833
		Inclination     -0.462338
		AscendingNode   -1.05741
		ArgOfPericenter -165.063
		MeanAnomaly     40.9562
	}
}

Moon	"9.4"
{
	ParentBody     "9"
	Class	       "IceWorld"

	Mass            0.00117893
	Radius          873.905
	InertiaMoment   0.398861

	Obliquity       0.103934
	EqAscendNode    33.9669
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.866 0.788 0.702)

	Surface
	{
		SurfStyle       0.528713
		OceanStyle      0.209075
		Randomize      (-0.834, 0.938, 0.599)
		colorDistMagn   0.0538979
		colorDistFreq   106.83
		detailScale     2247.73
		colorConversion true
		drivenDarkening 0
		seaLevel        0.171049
		snowLevel       2
		tropicLatitude  0.00346989
		icecapLatitude  0.732113
		icecapHeight    0.189193
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.08619
		venusFreq       0.981393
		venusMagn       0
		mareFreq        0.200229
		mareDensity     0.000559683
		terraceProb     0.193089
		erosion         0
		montesMagn      0.0759313
		montesFreq      52.6968
		montesSpiky     0.951985
		montesFraction  0.432312
		dunesMagn       0.0491776
		dunesFreq       1150.04
		dunesFraction   0.903321
		hillsMagn       0.133026
		hillsFreq       96.4352
		hillsFraction   0.862794
		hills2Fraction  0.225642
		riversMagn      53.9497
		riversFreq      2.10617
		riversSin       6.66012
		riversOctaves   0
		canyonsMagn     0.39863
		canyonsFreq     0.252706
		canyonFraction  0
		cracksMagn      0.0421096
		cracksFreq      0.426136
		cracksOctaves   0
		craterMagn      0.638097
		craterFreq      2.62625
		craterDensity   0.877315
		craterOctaves   10
		craterRayedFactor 0.127041
		volcanoMagn     0.224313
		volcanoFreq     0.677378
		volcanoDensity  0.0635806
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.216844
		volcanoRadius   0.675768
		volcanoTemp     1658.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.197, 0.154, 0.000)
		colorShelf     (0.320, 0.244, 0.197, 0.000)
		colorBeach     (0.485, 0.370, 0.295, 0.200)
		colorDesert    (0.441, 0.347, 0.260, 0.500)
		colorLowland   (0.338, 0.268, 0.197, 0.800)
		colorUpland    (0.571, 0.473, 0.365, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.338, 0.268, 0.197, 0.800)
		colorUpPlants  (0.571, 0.473, 0.365, 1.000)
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

	Atmosphere
	{
		Model          "Sun"
		Height          43.6952
		Density         2.65451e-008
		Pressure        2.34279e-009
		Greenhouse      0.000494844
		Bright          0.5
		Opacity         0
		SkyLight        0.166667
		Hue             -0.0316629
		Saturation      1

		Composition
		{
			Ne    	100
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00137064
		Period          0.0446312
		Eccentricity    0.00801251
		Inclination     0.103934
		AscendingNode   33.9669
		ArgOfPericenter 94.2642
		MeanAnomaly     50.5922
	}
}

Moon	"9.5"
{
	ParentBody     "9"
	Class	       "IceWorld"

	Mass            0.00137373
	Radius          976.714
	InertiaMoment   0.398268

	Obliquity       -0.102226
	EqAscendNode    10.5657
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.746 0.660 0.559)

	Surface
	{
		SurfStyle       0.654707
		OceanStyle      0.298487
		Randomize      (0.290, -0.019, 0.447)
		colorDistMagn   0.0598927
		colorDistFreq   107.98
		detailScale     2512.16
		colorConversion true
		drivenDarkening 0
		seaLevel        0.249715
		snowLevel       2
		tropicLatitude  0.00355474
		icecapLatitude  1
		icecapHeight    0.249715
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.89475
		venusFreq       1.01801
		venusMagn       0.239058
		mareFreq        0.319782
		mareDensity     0.00049989
		terraceProb     0.249754
		erosion         0
		montesMagn      0.0512236
		montesFreq      41.3299
		montesSpiky     0.931937
		montesFraction  0.149596
		dunesMagn       0.0351177
		dunesFreq       1283.62
		dunesFraction   0.190522
		hillsMagn       0.145048
		hillsFreq       124.842
		hillsFraction   0.273935
		hills2Fraction  0.165126
		riversMagn      65.9416
		riversFreq      2.546
		riversSin       6.38018
		riversOctaves   0
		canyonsMagn     0.532666
		canyonsFreq     0.259643
		canyonFraction  0
		cracksMagn      0.0339182
		cracksFreq      0.351798
		cracksOctaves   0
		craterMagn      0.531881
		craterFreq      2.41885
		craterDensity   0.907834
		craterOctaves   10
		craterRayedFactor 0.339833
		volcanoMagn     0.203461
		volcanoFreq     0.741641
		volcanoDensity  0.0712118
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.361734
		volcanoRadius   0.76605
		volcanoTemp     1613.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.477, 0.422, 0.375, 0.250)
		colorShelf     (0.522, 0.482, 0.425, 0.250)
		colorBeach     (0.425, 0.356, 0.324, 0.200)
		colorDesert    (0.395, 0.323, 0.285, 0.200)
		colorLowland   (0.291, 0.251, 0.235, 0.200)
		colorUpland    (0.552, 0.488, 0.425, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.291, 0.251, 0.235, 0.200)
		colorUpPlants  (0.552, 0.488, 0.425, 0.250)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999998
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
		Height          48.8357
		Density         1.66508e-007
		Pressure        1.46751e-008
		Greenhouse      0.00102942
		Bright          0.698694
		Opacity         0
		SkyLight        0.232898
		Hue             -0.0239115
		Saturation      1

		Composition
		{
			Ne    	100
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00220571
		Period          0.0910914
		Eccentricity    0.0230683
		Inclination     -0.102226
		AscendingNode   10.5657
		ArgOfPericenter -91.3341
		MeanAnomaly     178.737
	}
}

Asteroid	"S1"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            8.00819e-009
	Radius          16.6505
	InertiaMoment   0.395187

	RotationPeriod  483.585
	Obliquity       334.684
	EqAscendNode    14.4668

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.676 0.670 0.667)

	Surface
	{
		SurfStyle       0.0208163
		OceanStyle      0.480957
		Randomize      (0.418, 0.322, 0.539)
		colorDistMagn   0.856099
		colorDistFreq   0.122194
		detailScale     454.67
		colorConversion true
		snowLevel       2
		tropicLatitude  0.416952
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498502
		terraceProb     0.156687
		erosion         0
		montesMagn      0.420503
		montesFreq      2.79775
		montesSpiky     0.81821
		montesFraction  0.933641
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.65049
		hillsFraction   0.464528
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267864
		craterFreq      0.262146
		craterDensity   0.919079
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.172
		volcanoTemp     1959.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.268, 0.267, 0.000)
		colorShelf     (0.287, 0.285, 0.284, 0.000)
		colorBeach     (0.304, 0.302, 0.300, 0.000)
		colorDesert    (0.321, 0.318, 0.317, 0.000)
		colorLowland   (0.338, 0.335, 0.334, 0.000)
		colorUpland    (0.355, 0.352, 0.350, 0.000)
		colorRock      (0.372, 0.369, 0.367, 0.000)
		colorSnow      (0.389, 0.385, 0.384, 1.000)
		BumpHeight      14.9855
		BumpOffset      2.99709
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.800593
		Period          2.04252
		Eccentricity    0.112367
		Inclination     -0.735551
		AscendingNode   156.606
		ArgOfPericenter 144.776
		MeanAnomaly     -122.309
	}
}

Asteroid	"S2"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.69149e-017
	Radius          0.0318856
	InertiaMoment   0.398218

	RotationPeriod  8950.36
	Obliquity       86.685
	EqAscendNode    235.515

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.538 0.535 0.532)

	Surface
	{
		SurfStyle       0.712485
		OceanStyle      0.956633
		Randomize      (-0.032, 0.672, -0.608)
		colorDistMagn   0.686274
		colorDistFreq   7.20928e-007
		detailScale     0.870689
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999829
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.432679
		terraceProb     0.356491
		erosion         0
		montesMagn      0.462657
		montesFreq      2.90177
		montesSpiky     0.882562
		montesFraction  0.803612
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.0017e-006
		hillsFraction   0.74445
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266687
		craterFreq      0.223995
		craterDensity   1.02768
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   729.869
		volcanoTemp     1540.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.182, 0.149, 0.000)
		colorShelf     (0.215, 0.187, 0.170, 0.000)
		colorBeach     (0.253, 0.219, 0.202, 0.000)
		colorDesert    (0.274, 0.235, 0.197, 0.000)
		colorLowland   (0.301, 0.251, 0.223, 0.000)
		colorUpland    (0.334, 0.305, 0.271, 0.000)
		colorRock      (0.360, 0.331, 0.292, 0.000)
		colorSnow      (0.393, 0.353, 0.308, 1.000)
		BumpHeight      0.028697
		BumpOffset      0.00573941
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.887991
		Period          2.38595
		Eccentricity    0.199729
		Inclination     -6.35045
		AscendingNode   133.465
		ArgOfPericenter 112.056
		MeanAnomaly     -153.473
	}
}

Asteroid	"S3"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.90378e-014
	Radius          0.341431
	InertiaMoment   0.399309

	RotationPeriod  3264.44
	Obliquity       11.2947
	EqAscendNode    240.835

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.564 0.561 0.559)

	Surface
	{
		SurfStyle       0.877977
		OceanStyle      0.488887
		Randomize      (0.127, 0.058, 0.069)
		colorDistMagn   0.802703
		colorDistFreq   6.57174e-005
		detailScale     9.32333
		colorConversion true
		snowLevel       2
		tropicLatitude  0.221484
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592035
		terraceProb     0.486341
		erosion         0
		montesMagn      0.444587
		montesFreq      3.09789
		montesSpiky     0.970345
		montesFraction  0.287602
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000377252
		hillsFraction   0.727378
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273359
		craterFreq      0.215353
		craterDensity   0.888483
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   203.735
		volcanoTemp     1554.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.196, 0.224, 0.050)
		colorShelf     (0.226, 0.230, 0.257, 0.040)
		colorBeach     (0.260, 0.264, 0.291, 0.030)
		colorDesert    (0.293, 0.297, 0.330, 0.020)
		colorLowland   (0.327, 0.331, 0.364, 0.030)
		colorUpland    (0.361, 0.364, 0.397, 0.050)
		colorRock      (0.395, 0.398, 0.442, 0.020)
		colorSnow      (0.395, 0.398, 0.442, 1.000)
		BumpHeight      0.307288
		BumpOffset      0.0614575
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.756673
		Period          1.87677
		Eccentricity    0.0608454
		Inclination     -2.57563
		AscendingNode   120.584
		ArgOfPericenter -172.763
		MeanAnomaly     -116.957
	}
}

Asteroid	"S4"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.01593e-010
	Radius          4.12517
	InertiaMoment   0.39657

	RotationPeriod  1062.06
	Obliquity       184.472
	EqAscendNode    227.999

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.590 0.476 0.376)

	Surface
	{
		SurfStyle       0.801727
		OceanStyle      0.651264
		Randomize      (0.815, 0.332, -0.108)
		colorDistMagn   0.988244
		colorDistFreq   0.000802352
		detailScale     112.645
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0198422
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.593146
		terraceProb     0.188223
		erosion         0
		montesMagn      0.614231
		montesFreq      2.98244
		montesSpiky     0.863324
		montesFraction  0.433622
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0407143
		hillsFraction   0.69662
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232176
		craterFreq      0.167388
		craterDensity   1.01205
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   64.1677
		volcanoTemp     1109.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.162, 0.105, 0.000)
		colorShelf     (0.236, 0.167, 0.120, 0.000)
		colorBeach     (0.277, 0.195, 0.143, 0.000)
		colorDesert    (0.301, 0.210, 0.139, 0.000)
		colorLowland   (0.331, 0.224, 0.158, 0.000)
		colorUpland    (0.366, 0.272, 0.192, 0.000)
		colorRock      (0.396, 0.295, 0.207, 0.000)
		colorSnow      (0.431, 0.314, 0.218, 1.000)
		BumpHeight      3.71265
		BumpOffset      0.74253
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.750999
		Period          1.8557
		Eccentricity    0.0537492
		Inclination     5.60851
		AscendingNode   -179.866
		ArgOfPericenter -79.9289
		MeanAnomaly     123.841
	}
}

Asteroid	"S5"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.49499e-007
	Radius          44.1648
	InertiaMoment   0.398466

	RotationPeriod  299.145
	Obliquity       48.6014
	EqAscendNode    267.462

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.496 0.420 0.314)

	Surface
	{
		SurfStyle       0.177073
		OceanStyle      0.793083
		Randomize      (0.868, 0.189, 0.577)
		colorDistMagn   0.0497415
		colorDistFreq   1.63479
		detailScale     1205.99
		colorConversion true
		snowLevel       2
		tropicLatitude  0.72311
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.685548
		terraceProb     0.122282
		erosion         0
		montesMagn      0.50776
		montesFreq      3.94813
		montesSpiky     0.990866
		montesFraction  0.354702
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.88052
		hillsFraction   0.676491
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249622
		craterFreq      0.230255
		craterDensity   0.854151
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   17.9087
		volcanoTemp     1437.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.168, 0.125, 0.000)
		colorShelf     (0.211, 0.178, 0.133, 0.000)
		colorBeach     (0.223, 0.189, 0.141, 0.000)
		colorDesert    (0.236, 0.199, 0.149, 0.000)
		colorLowland   (0.248, 0.210, 0.157, 0.000)
		colorUpland    (0.261, 0.220, 0.165, 0.000)
		colorRock      (0.273, 0.231, 0.172, 0.000)
		colorSnow      (0.285, 0.241, 0.180, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.823647
		Period          2.13138
		Eccentricity    0.137212
		Inclination     -2.74404
		AscendingNode   -32.7656
		ArgOfPericenter -152.81
		MeanAnomaly     -157.458
	}
}

Asteroid	"S6"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            8.75821e-016
	Radius          0.0845857
	InertiaMoment   0.399493

	RotationPeriod  6632.3
	Obliquity       83.2059
	EqAscendNode    90.8811

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.592 0.584 0.580)

	Surface
	{
		SurfStyle       0.423839
		OceanStyle      0.573633
		Randomize      (0.516, -0.514, 0.465)
		colorDistMagn   0.953252
		colorDistFreq   4.32911e-006
		detailScale     2.30975
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99735
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.71265
		terraceProb     0.421994
		erosion         0
		montesMagn      0.484259
		montesFreq      3.23307
		montesSpiky     0.97498
		montesFraction  0.688729
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.31637e-005
		hillsFraction   0.626718
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242872
		craterFreq      0.197279
		craterDensity   0.813552
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   448.121
		volcanoTemp     1349.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.234, 0.232, 0.000)
		colorShelf     (0.252, 0.248, 0.247, 0.000)
		colorBeach     (0.267, 0.263, 0.261, 0.000)
		colorDesert    (0.281, 0.277, 0.276, 0.000)
		colorLowland   (0.296, 0.292, 0.290, 0.000)
		colorUpland    (0.311, 0.307, 0.305, 0.000)
		colorRock      (0.326, 0.321, 0.319, 0.000)
		colorSnow      (0.341, 0.336, 0.334, 1.000)
		BumpHeight      0.0761271
		BumpOffset      0.0152254
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.771654
		Period          1.93278
		Eccentricity    0.0790782
		Inclination     2.6661
		AscendingNode   10.4868
		ArgOfPericenter 130.648
		MeanAnomaly     -81.1959
	}
}

Asteroid	"S7"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.28882e-012
	Radius          0.90574
	InertiaMoment   0.397167

	RotationPeriod  1988.64
	Obliquity       66.5131
	EqAscendNode    217.957

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.568 0.565 0.562)

	Surface
	{
		SurfStyle       0.734896
		OceanStyle      0.959402
		Randomize      (-0.045, 0.570, 0.158)
		colorDistMagn   0.319618
		colorDistFreq   0.000573138
		detailScale     24.7327
		colorConversion true
		snowLevel       2
		tropicLatitude  0.948116
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.461979
		terraceProb     0.187895
		erosion         0
		montesMagn      0.34988
		montesFreq      2.48337
		montesSpiky     0.739564
		montesFraction  0.562858
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00178074
		hillsFraction   0.604024
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25944
		craterFreq      0.160369
		craterDensity   0.905814
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   125.087
		volcanoTemp     1342.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.192, 0.157, 0.000)
		colorShelf     (0.227, 0.198, 0.180, 0.000)
		colorBeach     (0.267, 0.231, 0.214, 0.000)
		colorDesert    (0.290, 0.248, 0.208, 0.000)
		colorLowland   (0.318, 0.265, 0.236, 0.000)
		colorUpland    (0.352, 0.322, 0.287, 0.000)
		colorRock      (0.381, 0.350, 0.309, 0.000)
		colorSnow      (0.415, 0.373, 0.326, 1.000)
		BumpHeight      0.815166
		BumpOffset      0.163033
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.835988
		Period          2.17946
		Eccentricity    0.149948
		Inclination     -5.38464
		AscendingNode   156.382
		ArgOfPericenter -160.803
		MeanAnomaly     -40.7586
	}
}

Asteroid	"S8"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.89656e-009
	Radius          10.9429
	InertiaMoment   0.398693

	RotationPeriod  652.44
	Obliquity       258.361
	EqAscendNode    194.079

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.776 0.774 0.773)

	Surface
	{
		SurfStyle       0.29316
		OceanStyle      0.331781
		Randomize      (-0.237, 0.820, -0.821)
		colorDistMagn   0.617755
		colorDistFreq   0.0899156
		detailScale     298.815
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967908
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.6812
		terraceProb     0.233128
		erosion         0
		montesMagn      0.445795
		montesFreq      2.79615
		montesSpiky     0.960447
		montesFraction  0.237405
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.236367
		hillsFraction   0.85709
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233036
		craterFreq      0.214371
		craterDensity   1.06578
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   39.3964
		volcanoTemp     1394.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.310, 0.309, 0.000)
		colorShelf     (0.330, 0.329, 0.328, 0.000)
		colorBeach     (0.349, 0.349, 0.348, 0.000)
		colorDesert    (0.369, 0.368, 0.367, 0.000)
		colorLowland   (0.388, 0.387, 0.386, 0.000)
		colorUpland    (0.408, 0.407, 0.406, 0.000)
		colorRock      (0.427, 0.426, 0.425, 0.000)
		colorSnow      (0.446, 0.445, 0.444, 1.000)
		BumpHeight      9.84864
		BumpOffset      1.96973
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.817517
		Period          2.10763
		Eccentricity    0.130742
		Inclination     -2.91833
		AscendingNode   -2.19863
		ArgOfPericenter 21.6892
		MeanAnomaly     -170.756
	}
}

Asteroid	"S9"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.11108e-017
	Radius          0.0185719
	InertiaMoment   0.399673

	RotationPeriod  11725
	Obliquity       6.58003
	EqAscendNode    -131.402

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.708 0.706 0.703)

	Surface
	{
		SurfStyle       0.212568
		OceanStyle      0.480056
		Randomize      (-0.873, 0.745, 0.663)
		colorDistMagn   0.489955
		colorDistFreq   1.63748e-007
		detailScale     0.507136
		colorConversion true
		snowLevel       2
		tropicLatitude  0.103908
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411773
		terraceProb     0.844658
		erosion         0
		montesMagn      0.370383
		montesFreq      2.86953
		montesSpiky     0.99051
		montesFraction  0.793886
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.89899e-007
		hillsFraction   0.513243
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272366
		craterFreq      0.25232
		craterDensity   0.79656
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   873.554
		volcanoTemp     1368.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.282, 0.281, 0.000)
		colorShelf     (0.301, 0.300, 0.299, 0.000)
		colorBeach     (0.319, 0.318, 0.317, 0.000)
		colorDesert    (0.336, 0.335, 0.334, 0.000)
		colorLowland   (0.354, 0.353, 0.352, 0.000)
		colorUpland    (0.372, 0.370, 0.369, 0.000)
		colorRock      (0.389, 0.388, 0.387, 0.000)
		colorSnow      (0.407, 0.406, 0.404, 1.000)
		BumpHeight      0.0167147
		BumpOffset      0.00334294
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.76682
		Period          1.91464
		Eccentricity    0.0732719
		Inclination     0.72854
		AscendingNode   -149.422
		ArgOfPericenter -153.201
		MeanAnomaly     165.03
	}
}

Asteroid	"S10"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.63501e-014
	Radius          0.224387
	InertiaMoment   0.397583

	RotationPeriod  4100.8
	Obliquity       210.699
	EqAscendNode    135.29

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.584 0.580 0.574)

	Surface
	{
		SurfStyle       0.209263
		OceanStyle      0.535715
		Randomize      (-0.069, 0.826, 0.984)
		colorDistMagn   0.182866
		colorDistFreq   4.37326e-005
		detailScale     6.12727
		colorConversion true
		snowLevel       2
		tropicLatitude  0.499698
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565002
		terraceProb     0.272758
		erosion         0
		montesMagn      0.362282
		montesFreq      2.12583
		montesSpiky     0.986274
		montesFraction  0.68017
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000183736
		hillsFraction   0.446192
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251341
		craterFreq      0.199709
		craterDensity   0.867529
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   275.134
		volcanoTemp     1555.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.232, 0.230, 0.000)
		colorShelf     (0.248, 0.247, 0.244, 0.000)
		colorBeach     (0.263, 0.261, 0.258, 0.000)
		colorDesert    (0.278, 0.276, 0.273, 0.000)
		colorLowland   (0.292, 0.290, 0.287, 0.000)
		colorUpland    (0.307, 0.305, 0.301, 0.000)
		colorRock      (0.321, 0.319, 0.316, 0.000)
		colorSnow      (0.336, 0.334, 0.330, 1.000)
		BumpHeight      0.201948
		BumpOffset      0.0403897
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.842114
		Period          2.20345
		Eccentricity    0.156131
		Inclination     -7.18124
		AscendingNode   78.1739
		ArgOfPericenter 91.0759
		MeanAnomaly     -40.9209
	}
}

Asteroid	"S11"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.40599e-011
	Radius          2.40272
	InertiaMoment   0.398904

	RotationPeriod  1246.87
	Obliquity       127.211
	EqAscendNode    134.699

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.787 0.706 0.608)

	Surface
	{
		SurfStyle       0.539079
		OceanStyle      0.88412
		Randomize      (0.633, -0.481, -0.395)
		colorDistMagn   0.82534
		colorDistFreq   0.00303182
		detailScale     65.6103
		colorConversion true
		snowLevel       2
		tropicLatitude  0.814474
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481618
		terraceProb     0.548982
		erosion         0
		montesMagn      0.467742
		montesFreq      2.59155
		montesSpiky     0.963159
		montesFraction  0.695337
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0133135
		hillsFraction   0.612576
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269145
		craterFreq      0.14485
		craterDensity   0.740761
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   76.8001
		volcanoTemp     1406.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.240, 0.170, 0.000)
		colorShelf     (0.315, 0.247, 0.195, 0.000)
		colorBeach     (0.370, 0.290, 0.231, 0.000)
		colorDesert    (0.402, 0.311, 0.225, 0.000)
		colorLowland   (0.441, 0.332, 0.255, 0.000)
		colorUpland    (0.488, 0.403, 0.310, 0.000)
		colorRock      (0.528, 0.438, 0.334, 0.000)
		colorSnow      (0.575, 0.466, 0.353, 1.000)
		BumpHeight      2.16245
		BumpOffset      0.43249
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.860599
		Period          2.2764
		Eccentricity    0.174257
		Inclination     3.9964
		AscendingNode   114.571
		ArgOfPericenter 175.282
		MeanAnomaly     131.239
	}
}

Asteroid	"S12"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.54056e-008
	Radius          29.0273
	InertiaMoment   0.39985

	RotationPeriod  404.712
	Obliquity       316.678
	EqAscendNode    111.378

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.738 0.735 0.733)

	Surface
	{
		SurfStyle       0.328906
		OceanStyle      0.15992
		Randomize      (-0.825, -0.300, -0.083)
		colorDistMagn   0.789381
		colorDistFreq   0.397926
		detailScale     792.639
		colorConversion true
		snowLevel       2
		tropicLatitude  0.700292
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.732388
		terraceProb     0.131329
		erosion         0
		montesMagn      0.641
		montesFreq      3.36446
		montesSpiky     0.851998
		montesFraction  0.765105
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.89355
		hillsFraction   0.633222
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215762
		craterFreq      0.157375
		craterDensity   0.9237
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.1867
		volcanoTemp     1699.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.294, 0.293, 0.000)
		colorShelf     (0.314, 0.312, 0.311, 0.000)
		colorBeach     (0.332, 0.331, 0.330, 0.000)
		colorDesert    (0.351, 0.349, 0.348, 0.000)
		colorLowland   (0.369, 0.368, 0.366, 0.000)
		colorUpland    (0.388, 0.386, 0.385, 0.000)
		colorRock      (0.406, 0.404, 0.403, 0.000)
		colorSnow      (0.425, 0.423, 0.421, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.776134
		Period          1.94963
		Eccentricity    0.0843932
		Inclination     -3.32095
		AscendingNode   71.7774
		ArgOfPericenter 62.3019
		MeanAnomaly     166.633
	}
}

Asteroid	"S13"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.07418e-016
	Radius          0.049267
	InertiaMoment   0.397915

	RotationPeriod  7712.3
	Obliquity       47.2721
	EqAscendNode    -49.9639

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.700 0.694 0.692)

	Surface
	{
		SurfStyle       0.999457
		OceanStyle      0.230387
		Randomize      (0.922, -0.070, -0.652)
		colorDistMagn   0.663926
		colorDistFreq   9.3248e-007
		detailScale     1.34532
		colorConversion true
		snowLevel       2
		tropicLatitude  0.727219
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.6702
		terraceProb     0.285343
		erosion         0
		montesMagn      0.402607
		montesFreq      2.5618
		montesSpiky     0.931812
		montesFraction  0.647215
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.90339e-006
		hillsFraction   0.524048
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242156
		craterFreq      0.219866
		craterDensity   0.766181
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   536.338
		volcanoTemp     1567.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.243, 0.277, 0.050)
		colorShelf     (0.280, 0.285, 0.318, 0.040)
		colorBeach     (0.322, 0.326, 0.360, 0.030)
		colorDesert    (0.364, 0.368, 0.408, 0.020)
		colorLowland   (0.406, 0.410, 0.450, 0.030)
		colorUpland    (0.448, 0.451, 0.491, 0.050)
		colorRock      (0.490, 0.493, 0.546, 0.020)
		colorSnow      (0.490, 0.493, 0.546, 1.000)
		BumpHeight      0.0443403
		BumpOffset      0.00886806
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.773876
		Period          1.94113
		Eccentricity    0.0817225
		Inclination     4.74716
		AscendingNode   -99.6732
		ArgOfPericenter 51.056
		MeanAnomaly     -30.8938
	}
}

Asteroid	"S14"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.05227e-013
	Radius          0.595249
	InertiaMoment   0.399103

	RotationPeriod  2801.62
	Obliquity       -0.695978
	EqAscendNode    77.8311

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.750 0.684 0.627)

	Surface
	{
		SurfStyle       0.055187
		OceanStyle      0.32796
		Randomize      (0.704, 0.151, -0.833)
		colorDistMagn   0.880733
		colorDistFreq   5.05939e-005
		detailScale     16.2543
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0732426
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.679857
		terraceProb     0.349611
		erosion         0
		montesMagn      0.367203
		montesFreq      2.44414
		montesSpiky     0.944402
		montesFraction  0.614523
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000719627
		hillsFraction   0.79311
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254665
		craterFreq      0.209298
		craterDensity   1.00862
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   168.925
		volcanoTemp     1961.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.274, 0.251, 0.000)
		colorShelf     (0.319, 0.291, 0.267, 0.000)
		colorBeach     (0.337, 0.308, 0.282, 0.000)
		colorDesert    (0.356, 0.325, 0.298, 0.000)
		colorLowland   (0.375, 0.342, 0.314, 0.000)
		colorUpland    (0.394, 0.359, 0.329, 0.000)
		colorRock      (0.412, 0.376, 0.345, 0.000)
		colorSnow      (0.431, 0.393, 0.361, 1.000)
		BumpHeight      0.535724
		BumpOffset      0.107145
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.724546
		Period          1.75852
		Eccentricity    0.0192024
		Inclination     -4.1698
		AscendingNode   92.2582
		ArgOfPericenter 22.0084
		MeanAnomaly     21.0036
	}
}

Asteroid	"S15"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.49158e-010
	Radius          6.37381
	InertiaMoment   0.394893

	RotationPeriod  778.141
	Obliquity       178.68
	EqAscendNode    43.4506

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.579 0.574 0.572)

	Surface
	{
		SurfStyle       0.251355
		OceanStyle      0.599384
		Randomize      (0.641, -0.224, -0.953)
		colorDistMagn   0.871825
		colorDistFreq   0.025541
		detailScale     174.047
		colorConversion true
		snowLevel       2
		tropicLatitude  0.104808
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.428376
		terraceProb     0.279594
		erosion         0
		montesMagn      0.292842
		montesFreq      3.77926
		montesSpiky     0.996697
		montesFraction  0.624312
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0814844
		hillsFraction   0.406406
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23872
		craterFreq      0.206572
		craterDensity   0.943369
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.1526
		volcanoTemp     1361.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.230, 0.229, 0.000)
		colorShelf     (0.246, 0.244, 0.243, 0.000)
		colorBeach     (0.261, 0.258, 0.257, 0.000)
		colorDesert    (0.275, 0.273, 0.272, 0.000)
		colorLowland   (0.290, 0.287, 0.286, 0.000)
		colorUpland    (0.304, 0.301, 0.300, 0.000)
		colorRock      (0.318, 0.316, 0.315, 0.000)
		colorSnow      (0.333, 0.330, 0.329, 1.000)
		BumpHeight      5.73643
		BumpOffset      1.14729
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.778397
		Period          1.95817
		Eccentricity    0.0870552
		Inclination     -4.91421
		AscendingNode   37.3912
		ArgOfPericenter 78.1875
		MeanAnomaly     -109.277
	}
}

Asteroid	"S16"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.60959e-007
	Radius          76.9869
	InertiaMoment   0.398197

	RotationPeriod  249.439
	Obliquity       29.8587
	EqAscendNode    18.4306

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.790 0.786 0.785)

	Surface
	{
		SurfStyle       0.899004
		OceanStyle      0.572974
		Randomize      (0.456, 0.479, 0.426)
		colorDistMagn   0.902888
		colorDistFreq   4.33191
		detailScale     2102.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.491964
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.660241
		terraceProb     0.491433
		erosion         0
		montesMagn      0.539242
		montesFreq      2.7731
		montesSpiky     0.907395
		montesFraction  0.689873
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.654
		hillsFraction   0.591449
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250373
		craterFreq      0.185797
		craterDensity   0.820654
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   14.8469
		volcanoTemp     1282.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.275, 0.314, 0.050)
		colorShelf     (0.316, 0.322, 0.361, 0.040)
		colorBeach     (0.363, 0.370, 0.408, 0.030)
		colorDesert    (0.411, 0.417, 0.463, 0.020)
		colorLowland   (0.458, 0.464, 0.510, 0.030)
		colorUpland    (0.506, 0.511, 0.557, 0.050)
		colorRock      (0.553, 0.558, 0.620, 0.020)
		colorSnow      (0.553, 0.558, 0.620, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.728145
		Period          1.77164
		Eccentricity    0.0240501
		Inclination     -0.495827
		AscendingNode   -38.0585
		ArgOfPericenter 0.586472
		MeanAnomaly     56.384
	}
}

Asteroid	"S17"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.87215e-015
	Radius          0.130695
	InertiaMoment   0.399294

	RotationPeriod  4909.54
	Obliquity       125.665
	EqAscendNode    162.137

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.661 0.657 0.656)

	Surface
	{
		SurfStyle       0.0465461
		OceanStyle      0.366406
		Randomize      (-0.523, 0.243, 0.755)
		colorDistMagn   0.481027
		colorDistFreq   4.05426e-007
		detailScale     3.56883
		colorConversion true
		snowLevel       2
		tropicLatitude  0.810594
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.38837
		terraceProb     0.273324
		erosion         0
		montesMagn      0.599982
		montesFreq      3.36602
		montesSpiky     0.998145
		montesFraction  0.409759
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.22659e-005
		hillsFraction   0.535514
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253243
		craterFreq      0.233643
		craterDensity   1.00915
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   329.297
		volcanoTemp     1600.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.263, 0.262, 0.000)
		colorShelf     (0.281, 0.279, 0.279, 0.000)
		colorBeach     (0.297, 0.296, 0.295, 0.000)
		colorDesert    (0.314, 0.312, 0.312, 0.000)
		colorLowland   (0.330, 0.329, 0.328, 0.000)
		colorUpland    (0.347, 0.345, 0.345, 0.000)
		colorRock      (0.363, 0.362, 0.361, 0.000)
		colorSnow      (0.380, 0.378, 0.377, 1.000)
		BumpHeight      0.117625
		BumpOffset      0.023525
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.802133
		Period          2.04841
		Eccentricity    0.11407
		Inclination     1.20529
		AscendingNode   -80.9311
		ArgOfPericenter 43.4919
		MeanAnomaly     -97.3203
	}
}

Asteroid	"S18"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.69806e-012
	Radius          1.57906
	InertiaMoment   0.396509

	RotationPeriod  1671.3
	Obliquity       50.745
	EqAscendNode    292.61

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.801 0.800 0.798)

	Surface
	{
		SurfStyle       0.114213
		OceanStyle      0.929672
		Randomize      (0.111, -0.668, -0.248)
		colorDistMagn   0.538142
		colorDistFreq   0.00123227
		detailScale     43.1189
		colorConversion true
		snowLevel       2
		tropicLatitude  0.755424
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.441415
		terraceProb     0.626162
		erosion         0
		montesMagn      0.598909
		montesFreq      3.49571
		montesSpiky     0.969005
		montesFraction  0.509089
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00656537
		hillsFraction   0.594518
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222413
		craterFreq      0.222863
		craterDensity   0.846593
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   103.715
		volcanoTemp     1019.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.319, 0.000)
		colorShelf     (0.340, 0.340, 0.339, 0.000)
		colorBeach     (0.360, 0.360, 0.359, 0.000)
		colorDesert    (0.381, 0.380, 0.379, 0.000)
		colorLowland   (0.401, 0.400, 0.399, 0.000)
		colorUpland    (0.421, 0.420, 0.419, 0.000)
		colorRock      (0.441, 0.440, 0.439, 0.000)
		colorSnow      (0.461, 0.460, 0.459, 1.000)
		BumpHeight      1.42116
		BumpOffset      0.284231
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.807568
		Period          2.06927
		Eccentricity    0.120033
		Inclination     -3.43901
		AscendingNode   59.4612
		ArgOfPericenter -150.762
		MeanAnomaly     172.87
	}
}

Asteroid	"S19"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            8.385e-009
	Radius          16.9077
	InertiaMoment   0.398448

	RotationPeriod  484.941
	Obliquity       236.304
	EqAscendNode    284.254

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.732 0.620 0.573)

	Surface
	{
		SurfStyle       0.391835
		OceanStyle      0.991534
		Randomize      (0.462, -0.171, 0.588)
		colorDistMagn   0.553558
		colorDistFreq   0.113849
		detailScale     461.692
		colorConversion true
		snowLevel       2
		tropicLatitude  0.855908
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.76242
		terraceProb     0.443314
		erosion         0
		montesMagn      0.274549
		montesFreq      2.92525
		montesSpiky     0.985738
		montesFraction  0.465967
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.384939
		hillsFraction   0.518879
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245395
		craterFreq      0.224189
		craterDensity   0.944475
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.9493
		volcanoTemp     1377.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.248, 0.229, 0.000)
		colorShelf     (0.311, 0.264, 0.243, 0.000)
		colorBeach     (0.329, 0.279, 0.258, 0.000)
		colorDesert    (0.348, 0.295, 0.272, 0.000)
		colorLowland   (0.366, 0.310, 0.286, 0.000)
		colorUpland    (0.384, 0.326, 0.301, 0.000)
		colorRock      (0.403, 0.341, 0.315, 0.000)
		colorSnow      (0.421, 0.357, 0.329, 1.000)
		BumpHeight      15.2169
		BumpOffset      3.04338
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.738646
		Period          1.8101
		Eccentricity    0.0379243
		Inclination     4.08322
		AscendingNode   -52.2744
		ArgOfPericenter -86.6931
		MeanAnomaly     -39.0807
	}
}

Asteroid	"S20"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.91223e-017
	Radius          0.0323781
	InertiaMoment   0.399479

	RotationPeriod  9911.37
	Obliquity       11.4392
	EqAscendNode    178.732

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.625 0.622 0.619)

	Surface
	{
		SurfStyle       0.393219
		OceanStyle      0.0229944
		Randomize      (0.825, -0.416, 0.442)
		colorDistMagn   0.657587
		colorDistFreq   3.22313e-007
		detailScale     0.884138
		colorConversion true
		snowLevel       2
		tropicLatitude  0.214584
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.686911
		terraceProb     0.324445
		erosion         0
		montesMagn      0.557355
		montesFreq      2.68125
		montesSpiky     0.972585
		montesFraction  0.307167
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.81541e-006
		hillsFraction   0.392201
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23302
		craterFreq      0.223368
		craterDensity   0.942913
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   724.299
		volcanoTemp     1488.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.249, 0.247, 0.000)
		colorShelf     (0.266, 0.264, 0.263, 0.000)
		colorBeach     (0.281, 0.280, 0.278, 0.000)
		colorDesert    (0.297, 0.295, 0.294, 0.000)
		colorLowland   (0.312, 0.311, 0.309, 0.000)
		colorUpland    (0.328, 0.326, 0.325, 0.000)
		colorRock      (0.344, 0.342, 0.340, 0.000)
		colorSnow      (0.359, 0.357, 0.356, 1.000)
		BumpHeight      0.0291403
		BumpOffset      0.00582806
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.774659
		Period          1.94408
		Eccentricity    0.0826507
		Inclination     -1.00051
		AscendingNode   161.315
		ArgOfPericenter -1.19078
		MeanAnomaly     59.3447
	}
}

Asteroid	"S21"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            7.22863e-014
	Radius          0.346704
	InertiaMoment   0.397129

	RotationPeriod  3182.33
	Obliquity       187.619
	EqAscendNode    215.901

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.636 0.588 0.500)

	Surface
	{
		SurfStyle       0.599686
		OceanStyle      0.868258
		Randomize      (0.966, -0.702, -0.110)
		colorDistMagn   0.551128
		colorDistFreq   7.09138e-005
		detailScale     9.46732
		colorConversion true
		snowLevel       2
		tropicLatitude  0.131388
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.569366
		terraceProb     0.5819
		erosion         0
		montesMagn      0.376111
		montesFreq      2.76322
		montesSpiky     0.971633
		montesFraction  0.537897
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000226274
		hillsFraction   0.561456
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222466
		craterFreq      0.194617
		craterDensity   0.797263
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   202.179
		volcanoTemp     1501.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.200, 0.140, 0.000)
		colorShelf     (0.254, 0.206, 0.160, 0.000)
		colorBeach     (0.299, 0.241, 0.190, 0.000)
		colorDesert    (0.324, 0.259, 0.185, 0.000)
		colorLowland   (0.356, 0.276, 0.210, 0.000)
		colorUpland    (0.394, 0.335, 0.255, 0.000)
		colorRock      (0.426, 0.364, 0.275, 0.000)
		colorSnow      (0.464, 0.388, 0.290, 1.000)
		BumpHeight      0.312033
		BumpOffset      0.0624066
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.779748
		Period          1.96327
		Eccentricity    0.0886374
		Inclination     0.139053
		AscendingNode   120.073
		ArgOfPericenter -139.71
		MeanAnomaly     -171.202
	}
}

Asteroid	"S22"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.06373e-010
	Radius          4.18888
	InertiaMoment   0.398676

	RotationPeriod  1052.11
	Obliquity       104.537
	EqAscendNode    192.649

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.508 0.504 0.496)

	Surface
	{
		SurfStyle       0.496678
		OceanStyle      0.448467
		Randomize      (0.921, -0.165, 0.622)
		colorDistMagn   0.638201
		colorDistFreq   0.0110852
		detailScale     114.384
		colorConversion true
		snowLevel       2
		tropicLatitude  0.981444
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.428355
		terraceProb     0.191249
		erosion         0
		montesMagn      0.441311
		montesFreq      3.13494
		montesSpiky     0.891892
		montesFraction  0.528268
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0410037
		hillsFraction   0.481981
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255187
		craterFreq      0.166625
		craterDensity   0.809641
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.6778
		volcanoTemp     1716.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.202, 0.199, 0.000)
		colorShelf     (0.216, 0.214, 0.211, 0.000)
		colorBeach     (0.229, 0.227, 0.223, 0.000)
		colorDesert    (0.241, 0.239, 0.236, 0.000)
		colorLowland   (0.254, 0.252, 0.248, 0.000)
		colorUpland    (0.267, 0.265, 0.261, 0.000)
		colorRock      (0.279, 0.277, 0.273, 0.000)
		colorSnow      (0.292, 0.290, 0.285, 1.000)
		BumpHeight      3.76999
		BumpOffset      0.753998
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.769254
		Period          1.92377
		Eccentricity    0.0762049
		Inclination     4.10204
		AscendingNode   -147.841
		ArgOfPericenter 29.7934
		MeanAnomaly     -177.939
	}
}

Asteroid	"S23"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.56533e-007
	Radius          44.8468
	InertiaMoment   0.399659

	RotationPeriod  297.007
	Obliquity       308.313
	EqAscendNode    215.001

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.585 0.499 0.463)

	Surface
	{
		SurfStyle       0.965027
		OceanStyle      0.992075
		Randomize      (-0.227, 0.456, 0.040)
		colorDistMagn   0.802727
		colorDistFreq   0.543193
		detailScale     1224.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.80506
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.276394
		terraceProb     0.406429
		erosion         0
		montesMagn      0.40441
		montesFreq      3.02779
		montesSpiky     0.97803
		montesFraction  0.35404
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.18184
		hillsFraction   0.600221
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242199
		craterFreq      0.276827
		craterDensity   0.927716
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   17.7719
		volcanoTemp     1723.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.175, 0.185, 0.050)
		colorShelf     (0.234, 0.204, 0.213, 0.040)
		colorBeach     (0.269, 0.234, 0.241, 0.030)
		colorDesert    (0.304, 0.264, 0.273, 0.020)
		colorLowland   (0.339, 0.294, 0.301, 0.030)
		colorUpland    (0.374, 0.324, 0.328, 0.050)
		colorRock      (0.409, 0.354, 0.365, 0.020)
		colorSnow      (0.409, 0.354, 0.365, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.87105
		Period          2.31799
		Eccentricity    0.184164
		Inclination     -2.07579
		AscendingNode   -21.9852
		ArgOfPericenter -30.2915
		MeanAnomaly     -46.5117
	}
}

Asteroid	"S24"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            9.1703e-016
	Radius          0.085892
	InertiaMoment   0.397555

	RotationPeriod  6222.57
	Obliquity       82.4755
	EqAscendNode    86.1557

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.581 0.574 0.570)

	Surface
	{
		SurfStyle       0.941917
		OceanStyle      0.502001
		Randomize      (-0.332, 0.395, 0.167)
		colorDistMagn   0.642344
		colorDistFreq   2.52104e-006
		detailScale     2.34542
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999916
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58792
		terraceProb     0.448561
		erosion         0
		montesMagn      0.50622
		montesFreq      4.00239
		montesSpiky     0.771958
		montesFraction  0.656302
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.28836e-005
		hillsFraction   0.351511
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227236
		craterFreq      0.191183
		craterDensity   0.838709
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   444.7
		volcanoTemp     1453.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.201, 0.228, 0.050)
		colorShelf     (0.232, 0.235, 0.262, 0.040)
		colorBeach     (0.267, 0.270, 0.297, 0.030)
		colorDesert    (0.302, 0.304, 0.337, 0.020)
		colorLowland   (0.337, 0.339, 0.371, 0.030)
		colorUpland    (0.372, 0.373, 0.405, 0.050)
		colorRock      (0.407, 0.407, 0.451, 0.020)
		colorSnow      (0.407, 0.407, 0.451, 1.000)
		BumpHeight      0.0773028
		BumpOffset      0.0154606
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.833322
		Period          2.16904
		Eccentricity    0.147229
		Inclination     8.47443
		AscendingNode   -37.068
		ArgOfPericenter -178.281
		MeanAnomaly     -76.0355
	}
}

Asteroid	"S25"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.34946e-012
	Radius          0.919727
	InertiaMoment   0.398888

	RotationPeriod  2014.92
	Obliquity       262.637
	EqAscendNode    161.671

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.411 0.405 0.403)

	Surface
	{
		SurfStyle       0.973628
		OceanStyle      0.906671
		Randomize      (-0.552, 0.725, -0.862)
		colorDistMagn   0.792004
		colorDistFreq   0.000340172
		detailScale     25.1147
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987464
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.742444
		terraceProb     0.443336
		erosion         0
		montesMagn      0.422161
		montesFreq      2.10121
		montesSpiky     0.879754
		montesFraction  0.642491
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00242123
		hillsFraction   0.699723
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259844
		craterFreq      0.278456
		craterDensity   0.750986
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   124.132
		volcanoTemp     1347.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.140, 0.142, 0.161, 0.050)
		colorShelf     (0.165, 0.166, 0.186, 0.040)
		colorBeach     (0.189, 0.191, 0.210, 0.030)
		colorDesert    (0.214, 0.215, 0.238, 0.020)
		colorLowland   (0.239, 0.239, 0.262, 0.030)
		colorUpland    (0.263, 0.264, 0.286, 0.050)
		colorRock      (0.288, 0.288, 0.319, 0.020)
		colorSnow      (0.288, 0.288, 0.319, 1.000)
		BumpHeight      0.827755
		BumpOffset      0.165551
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.769877
		Period          1.92611
		Eccentricity    0.0769522
		Inclination     3.00633
		AscendingNode   125.051
		ArgOfPericenter -125.748
		MeanAnomaly     -48.7602
	}
}

Asteroid	"S26"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.9858e-009
	Radius          11.1119
	InertiaMoment   0.399837

	RotationPeriod  653.46
	Obliquity       161.564
	EqAscendNode    134.651

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.409 0.404 0.399)

	Surface
	{
		SurfStyle       0.852263
		OceanStyle      0.524881
		Randomize      (0.743, -0.837, 0.705)
		colorDistMagn   0.380375
		colorDistFreq   0.0297461
		detailScale     303.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.307741
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.490674
		terraceProb     0.291155
		erosion         0
		montesMagn      0.578705
		montesFreq      3.09564
		montesSpiky     0.918995
		montesFraction  0.284921
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.324609
		hillsFraction   0.788997
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238325
		craterFreq      0.192557
		craterDensity   0.943555
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   39.0956
		volcanoTemp     1305.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.139, 0.141, 0.160, 0.050)
		colorShelf     (0.163, 0.166, 0.184, 0.040)
		colorBeach     (0.188, 0.190, 0.208, 0.030)
		colorDesert    (0.213, 0.214, 0.236, 0.020)
		colorLowland   (0.237, 0.238, 0.260, 0.030)
		colorUpland    (0.262, 0.263, 0.284, 0.050)
		colorRock      (0.286, 0.287, 0.316, 0.020)
		colorSnow      (0.286, 0.287, 0.316, 1.000)
		BumpHeight      10.0007
		BumpOffset      2.00015
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.750673
		Period          1.85449
		Eccentricity    0.0533387
		Inclination     0.535192
		AscendingNode   -16.4421
		ArgOfPericenter 46.0829
		MeanAnomaly     -92.801
	}
}

Asteroid	"S27"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.16336e-017
	Radius          0.0188587
	InertiaMoment   0.397891

	RotationPeriod  10371.5
	Obliquity       4.67376
	EqAscendNode    89.3288

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.558 0.555 0.551)

	Surface
	{
		SurfStyle       0.811698
		OceanStyle      0.120716
		Randomize      (-0.045, -0.505, -0.687)
		colorDistMagn   0.632433
		colorDistFreq   2.53386e-007
		detailScale     0.514968
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0931322
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.60632
		terraceProb     0.236336
		erosion         0
		montesMagn      0.408198
		montesFreq      3.55851
		montesSpiky     0.939198
		montesFraction  0.523338
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.0301e-006
		hillsFraction   0.881067
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260999
		craterFreq      0.218062
		craterDensity   0.878894
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   866.885
		volcanoTemp     1562.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.189, 0.154, 0.000)
		colorShelf     (0.223, 0.194, 0.176, 0.000)
		colorBeach     (0.262, 0.228, 0.209, 0.000)
		colorDesert    (0.284, 0.244, 0.204, 0.000)
		colorLowland   (0.312, 0.261, 0.231, 0.000)
		colorUpland    (0.346, 0.317, 0.281, 0.000)
		colorRock      (0.374, 0.344, 0.303, 0.000)
		colorSnow      (0.407, 0.367, 0.319, 1.000)
		BumpHeight      0.0169728
		BumpOffset      0.00339456
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.843728
		Period          2.20979
		Eccentricity    0.157746
		Inclination     1.64313
		AscendingNode   74.8339
		ArgOfPericenter -93.0713
		MeanAnomaly     132.033
	}
}

Asteroid	"S28"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.71194e-014
	Radius          0.227853
	InertiaMoment   0.399088

	RotationPeriod  4048.3
	Obliquity       156.988
	EqAscendNode    68.6007

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.466 0.458 0.455)

	Surface
	{
		SurfStyle       0.336053
		OceanStyle      0.0955078
		Randomize      (-0.207, -0.024, -0.502)
		colorDistMagn   0.187597
		colorDistFreq   1.03939e-005
		detailScale     6.22189
		colorConversion true
		snowLevel       2
		tropicLatitude  0.357377
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.737266
		terraceProb     0.43515
		erosion         0
		montesMagn      0.473524
		montesFreq      2.74995
		montesSpiky     0.958324
		montesFraction  0.583913
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000156923
		hillsFraction   0.627581
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256527
		craterFreq      0.190026
		craterDensity   0.918062
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   273.033
		volcanoTemp     1666.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.183, 0.182, 0.000)
		colorShelf     (0.198, 0.195, 0.193, 0.000)
		colorBeach     (0.210, 0.206, 0.205, 0.000)
		colorDesert    (0.221, 0.218, 0.216, 0.000)
		colorLowland   (0.233, 0.229, 0.227, 0.000)
		colorUpland    (0.245, 0.241, 0.239, 0.000)
		colorRock      (0.256, 0.252, 0.250, 0.000)
		colorSnow      (0.268, 0.263, 0.261, 1.000)
		BumpHeight      0.205067
		BumpOffset      0.0410134
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.872175
		Period          2.32249
		Eccentricity    0.185217
		Inclination     2.77022
		AscendingNode   -39.339
		ArgOfPericenter -37.3299
		MeanAnomaly     157.053
	}
}

Asteroid	"S29"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.51921e-011
	Radius          2.43983
	InertiaMoment   0.394415

	RotationPeriod  1250.62
	Obliquity       35.5624
	EqAscendNode    55.0341

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.773 0.770 0.768)

	Surface
	{
		SurfStyle       0.818436
		OceanStyle      0.0251507
		Randomize      (-0.925, 0.528, 0.984)
		colorDistMagn   0.902756
		colorDistFreq   0.00176455
		detailScale     66.6237
		colorConversion true
		snowLevel       2
		tropicLatitude  0.588207
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411205
		terraceProb     0.216975
		erosion         0
		montesMagn      0.260151
		montesFreq      3.22668
		montesSpiky     0.921264
		montesFraction  0.588666
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0163513
		hillsFraction   0.492624
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204743
		craterFreq      0.248023
		craterDensity   0.866427
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   76.2138
		volcanoTemp     1476.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.262, 0.215, 0.000)
		colorShelf     (0.309, 0.270, 0.246, 0.000)
		colorBeach     (0.363, 0.316, 0.292, 0.000)
		colorDesert    (0.394, 0.339, 0.284, 0.000)
		colorLowland   (0.433, 0.362, 0.323, 0.000)
		colorUpland    (0.479, 0.439, 0.392, 0.000)
		colorRock      (0.518, 0.478, 0.422, 0.000)
		colorSnow      (0.564, 0.508, 0.446, 1.000)
		BumpHeight      2.19585
		BumpOffset      0.43917
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.761553
		Period          1.89495
		Eccentricity    0.0668635
		Inclination     2.36814
		AscendingNode   -80.2313
		ArgOfPericenter 95.5162
		MeanAnomaly     81.3977
	}
}

Asteroid	"S30"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.70715e-008
	Radius          29.4755
	InertiaMoment   0.398177

	RotationPeriod  400.781
	Obliquity       225.522
	EqAscendNode    62.4172

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.803 0.738 0.704)

	Surface
	{
		SurfStyle       0.382256
		OceanStyle      0.8356
		Randomize      (0.160, 0.579, -0.438)
		colorDistMagn   0.673208
		colorDistFreq   0.434625
		detailScale     804.879
		colorConversion true
		snowLevel       2
		tropicLatitude  0.712951
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479309
		terraceProb     0.194508
		erosion         0
		montesMagn      0.483272
		montesFreq      3.02784
		montesSpiky     0.951299
		montesFraction  0.728989
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.30308
		hillsFraction   0.576071
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250476
		craterFreq      0.258901
		craterDensity   0.803677
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.002
		volcanoTemp     1888.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.295, 0.282, 0.000)
		colorShelf     (0.341, 0.314, 0.299, 0.000)
		colorBeach     (0.361, 0.332, 0.317, 0.000)
		colorDesert    (0.381, 0.351, 0.334, 0.000)
		colorLowland   (0.401, 0.369, 0.352, 0.000)
		colorUpland    (0.421, 0.388, 0.370, 0.000)
		colorRock      (0.442, 0.406, 0.387, 0.000)
		colorSnow      (0.462, 0.425, 0.405, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.777106
		Period          1.9533
		Eccentricity    0.0855388
		Inclination     0.0491313
		AscendingNode   162.746
		ArgOfPericenter 176.961
		MeanAnomaly     122.358
	}
}

Asteroid	"S31"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.17178e-016
	Radius          0.050028
	InertiaMoment   0.39928

	RotationPeriod  8300.3
	Obliquity       7.73443
	EqAscendNode    -59.5445

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.784 0.782 0.781)

	Surface
	{
		SurfStyle       0.215629
		OceanStyle      0.841869
		Randomize      (0.937, 0.103, -0.776)
		colorDistMagn   0.318908
		colorDistFreq   1.66752e-006
		detailScale     1.3661
		colorConversion true
		snowLevel       2
		tropicLatitude  0.129381
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472323
		terraceProb     0.114266
		erosion         0
		montesMagn      0.427488
		montesFreq      2.97994
		montesSpiky     0.820896
		montesFraction  0.529923
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.87924e-006
		hillsFraction   0.65731
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254903
		craterFreq      0.205002
		craterDensity   1.04531
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   532.245
		volcanoTemp     1799.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.313, 0.312, 0.000)
		colorShelf     (0.333, 0.333, 0.332, 0.000)
		colorBeach     (0.353, 0.352, 0.352, 0.000)
		colorDesert    (0.373, 0.372, 0.371, 0.000)
		colorLowland   (0.392, 0.391, 0.391, 0.000)
		colorUpland    (0.412, 0.411, 0.410, 0.000)
		colorRock      (0.431, 0.430, 0.430, 0.000)
		colorSnow      (0.451, 0.450, 0.449, 1.000)
		BumpHeight      0.0450252
		BumpOffset      0.00900503
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.734687
		Period          1.79557
		Eccentricity    0.0327407
		Inclination     -2.01765
		AscendingNode   -73.9906
		ArgOfPericenter -78.0381
		MeanAnomaly     54.0774
	}
}

Asteroid	"S32"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.19589e-013
	Radius          0.604442
	InertiaMoment   0.396445

	RotationPeriod  2671.6
	Obliquity       186.31
	EqAscendNode    34.301

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.673 0.669 0.666)

	Surface
	{
		SurfStyle       0.791879
		OceanStyle      0.0174948
		Randomize      (-0.012, -0.203, 0.071)
		colorDistMagn   0.445879
		colorDistFreq   0.000141395
		detailScale     16.5053
		colorConversion true
		snowLevel       2
		tropicLatitude  0.110303
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519938
		terraceProb     0.306436
		erosion         0
		montesMagn      0.484242
		montesFreq      3.15796
		montesSpiky     0.938529
		montesFraction  0.252476
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00105535
		hillsFraction   0.656905
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241099
		craterFreq      0.15177
		craterDensity   0.852911
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   167.635
		volcanoTemp     1575.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.227, 0.187, 0.000)
		colorShelf     (0.269, 0.234, 0.213, 0.000)
		colorBeach     (0.316, 0.274, 0.253, 0.000)
		colorDesert    (0.343, 0.294, 0.246, 0.000)
		colorLowland   (0.377, 0.314, 0.280, 0.000)
		colorUpland    (0.417, 0.381, 0.340, 0.000)
		colorRock      (0.451, 0.415, 0.366, 0.000)
		colorSnow      (0.491, 0.441, 0.386, 1.000)
		BumpHeight      0.543998
		BumpOffset      0.1088
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.775064
		Period          1.9456
		Eccentricity    0.0831297
		Inclination     -0.751118
		AscendingNode   88.339
		ArgOfPericenter 58.8401
		MeanAnomaly     -172.453
	}
}

Asteroid	"S33"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.70292e-010
	Radius          6.47225
	InertiaMoment   0.398429

	RotationPeriod  777.305
	Obliquity       90.5258
	EqAscendNode    318.05

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.819 0.765 0.698)

	Surface
	{
		SurfStyle       0.273607
		OceanStyle      0.362206
		Randomize      (-0.151, 0.593, 0.482)
		colorDistMagn   0.044277
		colorDistFreq   0.00467444
		detailScale     176.736
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999925
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.469737
		terraceProb     0.180459
		erosion         0
		montesMagn      0.484812
		montesFreq      2.87879
		montesSpiky     0.969964
		montesFraction  0.565509
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.117726
		hillsFraction   0.341899
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245382
		craterFreq      0.171517
		craterDensity   1.03398
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.7926
		volcanoTemp     1556
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.327, 0.306, 0.279, 0.000)
		colorShelf     (0.348, 0.325, 0.297, 0.000)
		colorBeach     (0.368, 0.344, 0.314, 0.000)
		colorDesert    (0.389, 0.363, 0.332, 0.000)
		colorLowland   (0.409, 0.383, 0.349, 0.000)
		colorUpland    (0.430, 0.402, 0.367, 0.000)
		colorRock      (0.450, 0.421, 0.384, 0.000)
		colorSnow      (0.471, 0.440, 0.401, 1.000)
		BumpHeight      5.82502
		BumpOffset      1.165
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.765072
		Period          1.9081
		Eccentricity    0.0711553
		Inclination     -1.59013
		AscendingNode   39.3885
		ArgOfPericenter 8.41037
		MeanAnomaly     123.324
	}
}

Asteroid	"S34"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.9206e-007
	Radius          78.1755
	InertiaMoment   0.399465

	RotationPeriod  247.324
	Obliquity       285.696
	EqAscendNode    311.543

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.650 0.645 0.642)

	Surface
	{
		SurfStyle       0.173111
		OceanStyle      0.273455
		Randomize      (0.319, 0.640, -0.443)
		colorDistMagn   0.165236
		colorDistFreq   0.512082
		detailScale     2134.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.961023
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.522546
		terraceProb     0.453041
		erosion         0
		montesMagn      0.662463
		montesFreq      3.13321
		montesSpiky     0.950987
		montesFraction  0.383436
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.0203
		hillsFraction   0.597088
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232538
		craterFreq      0.233561
		craterDensity   0.980551
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   14.7335
		volcanoTemp     1847.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.258, 0.257, 0.000)
		colorShelf     (0.276, 0.274, 0.273, 0.000)
		colorBeach     (0.293, 0.290, 0.289, 0.000)
		colorDesert    (0.309, 0.306, 0.305, 0.000)
		colorLowland   (0.325, 0.322, 0.321, 0.000)
		colorUpland    (0.341, 0.338, 0.337, 0.000)
		colorRock      (0.358, 0.355, 0.353, 0.000)
		colorSnow      (0.374, 0.371, 0.369, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.763659
		Period          1.90282
		Eccentricity    0.0694369
		Inclination     -1.90167
		AscendingNode   -100.988
		ArgOfPericenter 172.576
		MeanAnomaly     -12.2726
	}
}

Asteroid	"S35"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.05434e-015
	Radius          0.132713
	InertiaMoment   0.397091

	RotationPeriod  5055.04
	Obliquity       55.2778
	EqAscendNode    42.4521

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.763 0.762 0.761)

	Surface
	{
		SurfStyle       0.84337
		OceanStyle      0.750261
		Randomize      (-0.068, 0.412, -0.489)
		colorDistMagn   0.939623
		colorDistFreq   6.07921e-006
		detailScale     3.62396
		colorConversion true
		snowLevel       2
		tropicLatitude  0.829075
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.588047
		terraceProb     0.256789
		erosion         0
		montesMagn      0.43693
		montesFreq      2.9581
		montesSpiky     0.925638
		montesFraction  0.47103
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.3377e-005
		hillsFraction   0.730514
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244575
		craterFreq      0.21714
		craterDensity   1.03693
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   326.783
		volcanoTemp     1171.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.259, 0.213, 0.000)
		colorShelf     (0.305, 0.267, 0.244, 0.000)
		colorBeach     (0.359, 0.313, 0.289, 0.000)
		colorDesert    (0.389, 0.335, 0.282, 0.000)
		colorLowland   (0.428, 0.358, 0.320, 0.000)
		colorUpland    (0.473, 0.435, 0.388, 0.000)
		colorRock      (0.511, 0.473, 0.419, 0.000)
		colorSnow      (0.557, 0.503, 0.441, 1.000)
		BumpHeight      0.119442
		BumpOffset      0.0238884
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.759415
		Period          1.88698
		Eccentricity    0.0642363
		Inclination     -0.81503
		AscendingNode   -152.85
		ArgOfPericenter 120.82
		MeanAnomaly     -86.6022
	}
}

Asteroid	"S36"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.96618e-012
	Radius          1.60345
	InertiaMoment   0.398659

	RotationPeriod  1659.79
	Obliquity       278.596
	EqAscendNode    244.018

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.596 0.504 0.415)

	Surface
	{
		SurfStyle       0.0760046
		OceanStyle      0.829954
		Randomize      (-0.205, 0.218, -0.715)
		colorDistMagn   0.534596
		colorDistFreq   0.00115346
		detailScale     43.7848
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990282
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411377
		terraceProb     0.213773
		erosion         0
		montesMagn      0.491298
		montesFreq      3.31223
		montesSpiky     0.820039
		montesFraction  0.673097
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0077578
		hillsFraction   0.69018
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2454
		craterFreq      0.243529
		craterDensity   0.784193
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   102.923
		volcanoTemp     1244.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.202, 0.166, 0.000)
		colorShelf     (0.253, 0.214, 0.176, 0.000)
		colorBeach     (0.268, 0.227, 0.187, 0.000)
		colorDesert    (0.283, 0.240, 0.197, 0.000)
		colorLowland   (0.298, 0.252, 0.208, 0.000)
		colorUpland    (0.313, 0.265, 0.218, 0.000)
		colorRock      (0.328, 0.277, 0.228, 0.000)
		colorSnow      (0.343, 0.290, 0.239, 1.000)
		BumpHeight      1.4431
		BumpOffset      0.288621
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.818473
		Period          2.11132
		Eccentricity    0.131757
		Inclination     -0.706046
		AscendingNode   31.6072
		ArgOfPericenter -32.5672
		MeanAnomaly     -177.339
	}
}

Asteroid	"S37"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            8.77955e-009
	Radius          17.1688
	InertiaMoment   0.399645

	RotationPeriod  483.608
	Obliquity       145.017
	EqAscendNode    246.09

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.679 0.676 0.674)

	Surface
	{
		SurfStyle       0.212999
		OceanStyle      0.554246
		Randomize      (-0.298, -0.520, -0.491)
		colorDistMagn   0.987908
		colorDistFreq   0.118101
		detailScale     468.822
		colorConversion true
		snowLevel       2
		tropicLatitude  0.558496
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.40922
		terraceProb     0.103906
		erosion         0
		montesMagn      0.651471
		montesFreq      4.09705
		montesSpiky     0.891851
		montesFraction  0.727568
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.6964
		hillsFraction   0.53886
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.193681
		craterFreq      0.178608
		craterDensity   0.929
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.7282
		volcanoTemp     1307.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.271, 0.269, 0.000)
		colorShelf     (0.289, 0.287, 0.286, 0.000)
		colorBeach     (0.306, 0.304, 0.303, 0.000)
		colorDesert    (0.323, 0.321, 0.320, 0.000)
		colorLowland   (0.340, 0.338, 0.337, 0.000)
		colorUpland    (0.357, 0.355, 0.354, 0.000)
		colorRock      (0.374, 0.372, 0.371, 0.000)
		colorSnow      (0.391, 0.389, 0.387, 1.000)
		BumpHeight      15.4519
		BumpOffset      3.09038
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.718126
		Period          1.7352
		Eccentricity    0.010434
		Inclination     -1.26015
		AscendingNode   145.407
		ArgOfPericenter 153.814
		MeanAnomaly     -96.1826
	}
}

Asteroid	"S38"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.14338e-017
	Radius          0.0328782
	InertiaMoment   0.397526

	RotationPeriod  11189.2
	Obliquity       13.8186
	EqAscendNode    118.003

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.801 0.800 0.798)

	Surface
	{
		SurfStyle       0.991921
		OceanStyle      0.632297
		Randomize      (-0.882, -0.416, 0.021)
		colorDistMagn   0.977641
		colorDistFreq   4.25206e-007
		detailScale     0.897794
		colorConversion true
		snowLevel       2
		tropicLatitude  0.218538
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552188
		terraceProb     0.292708
		erosion         0
		montesMagn      0.35827
		montesFreq      3.75106
		montesSpiky     0.973068
		montesFraction  0.152207
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.16406e-006
		hillsFraction   0.739367
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225736
		craterFreq      0.207079
		craterDensity   0.69654
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   718.769
		volcanoTemp     1330.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.280, 0.319, 0.050)
		colorShelf     (0.321, 0.328, 0.367, 0.040)
		colorBeach     (0.369, 0.376, 0.415, 0.030)
		colorDesert    (0.417, 0.424, 0.471, 0.020)
		colorLowland   (0.465, 0.472, 0.519, 0.030)
		colorUpland    (0.513, 0.520, 0.567, 0.050)
		colorRock      (0.561, 0.568, 0.631, 0.020)
		colorSnow      (0.561, 0.568, 0.631, 1.000)
		BumpHeight      0.0295904
		BumpOffset      0.00591807
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.727541
		Period          1.76943
		Eccentricity    0.0232401
		Inclination     4.29248
		AscendingNode   114.789
		ArgOfPericenter 69.8889
		MeanAnomaly     71.0949
	}
}

Asteroid	"S39"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            7.56876e-014
	Radius          0.352059
	InertiaMoment   0.398872

	RotationPeriod  3136.87
	Obliquity       133.882
	EqAscendNode    102.817

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.494 0.491 0.488)

	Surface
	{
		SurfStyle       0.345134
		OceanStyle      0.851267
		Randomize      (0.069, 0.998, -0.668)
		colorDistMagn   0.37872
		colorDistFreq   6.79653e-005
		detailScale     9.61355
		colorConversion true
		snowLevel       2
		tropicLatitude  0.787232
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.679347
		terraceProb     0.213875
		erosion         0
		montesMagn      0.550357
		montesFreq      2.30765
		montesSpiky     0.89054
		montesFraction  0.374374
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000254958
		hillsFraction   0.617978
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214528
		craterFreq      0.170857
		craterDensity   0.881905
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   200.636
		volcanoTemp     1799.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.196, 0.195, 0.000)
		colorShelf     (0.210, 0.209, 0.207, 0.000)
		colorBeach     (0.222, 0.221, 0.220, 0.000)
		colorDesert    (0.235, 0.233, 0.232, 0.000)
		colorLowland   (0.247, 0.245, 0.244, 0.000)
		colorUpland    (0.259, 0.258, 0.256, 0.000)
		colorRock      (0.272, 0.270, 0.268, 0.000)
		colorSnow      (0.284, 0.282, 0.281, 1.000)
		BumpHeight      0.316853
		BumpOffset      0.0633705
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.797821
		Period          2.03192
		Eccentricity    0.109283
		Inclination     6.9086
		AscendingNode   -145.534
		ArgOfPericenter 69.0405
		MeanAnomaly     54.5814
	}
}

Asteroid	"S40"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.11378e-010
	Radius          4.25357
	InertiaMoment   0.399823

	RotationPeriod  1035.12
	Obliquity       21.4488
	EqAscendNode    167.741

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.753 0.750 0.746)

	Surface
	{
		SurfStyle       0.756434
		OceanStyle      0.800127
		Randomize      (-0.099, -0.973, -0.041)
		colorDistMagn   0.591948
		colorDistFreq   0.00578559
		detailScale     116.151
		colorConversion true
		snowLevel       2
		tropicLatitude  0.369481
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391914
		terraceProb     0.209549
		erosion         0
		montesMagn      0.671109
		montesFreq      3.13893
		montesSpiky     0.874795
		montesFraction  0.682803
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.043022
		hillsFraction   0.58835
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261241
		craterFreq      0.205568
		craterDensity   0.823648
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.1917
		volcanoTemp     1461.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.255, 0.209, 0.000)
		colorShelf     (0.301, 0.262, 0.239, 0.000)
		colorBeach     (0.354, 0.307, 0.283, 0.000)
		colorDesert    (0.384, 0.330, 0.276, 0.000)
		colorLowland   (0.422, 0.352, 0.313, 0.000)
		colorUpland    (0.467, 0.427, 0.380, 0.000)
		colorRock      (0.504, 0.465, 0.410, 0.000)
		colorSnow      (0.550, 0.495, 0.433, 1.000)
		BumpHeight      3.82822
		BumpOffset      0.765643
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.841589
		Period          2.2014
		Eccentricity    0.155605
		Inclination     0.51047
		AscendingNode   -63.1855
		ArgOfPericenter -35.2735
		MeanAnomaly     -14.2074
	}
}

Asteroid	"S41"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.63899e-007
	Radius          45.5393
	InertiaMoment   0.397867

	RotationPeriod  295.072
	Obliquity       209.966
	EqAscendNode    154.948

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.741 0.739 0.738)

	Surface
	{
		SurfStyle       0.0337135
		OceanStyle      0.209758
		Randomize      (0.198, -0.834, -0.666)
		colorDistMagn   0.795444
		colorDistFreq   1.49504
		detailScale     1243.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.491625
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.405886
		terraceProb     0.40442
		erosion         0
		montesMagn      0.40273
		montesFreq      2.67759
		montesSpiky     0.98608
		montesFraction  0.875196
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.90599
		hillsFraction   0.475103
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244454
		craterFreq      0.250579
		craterDensity   0.974821
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   17.6362
		volcanoTemp     1471.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.296, 0.295, 0.000)
		colorShelf     (0.315, 0.314, 0.314, 0.000)
		colorBeach     (0.333, 0.333, 0.332, 0.000)
		colorDesert    (0.352, 0.351, 0.350, 0.000)
		colorLowland   (0.371, 0.370, 0.369, 0.000)
		colorUpland    (0.389, 0.388, 0.387, 0.000)
		colorRock      (0.408, 0.407, 0.406, 0.000)
		colorSnow      (0.426, 0.425, 0.424, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.771761
		Period          1.93318
		Eccentricity    0.0792053
		Inclination     -2.09718
		AscendingNode   -73.9253
		ArgOfPericenter -83.5978
		MeanAnomaly     164.42
	}
}

Asteroid	"S42"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            9.60178e-016
	Radius          0.0872184
	InertiaMoment   0.399073

	RotationPeriod  6394.94
	Obliquity       22.2735
	EqAscendNode    138.113

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.640 0.594 0.518)

	Surface
	{
		SurfStyle       0.934425
		OceanStyle      0.874881
		Randomize      (-0.350, 0.089, -0.683)
		colorDistMagn   0.461105
		colorDistFreq   2.48363e-006
		detailScale     2.38164
		colorConversion true
		snowLevel       2
		tropicLatitude  0.359447
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.64159
		terraceProb     0.296187
		erosion         0
		montesMagn      0.536198
		montesFreq      3.79065
		montesSpiky     0.981817
		montesFraction  0.450335
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.85438e-005
		hillsFraction   0.517651
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21888
		craterFreq      0.250045
		craterDensity   1.03766
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   441.304
		volcanoTemp     1781.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.208, 0.207, 0.050)
		colorShelf     (0.256, 0.244, 0.238, 0.040)
		colorBeach     (0.295, 0.279, 0.269, 0.030)
		colorDesert    (0.333, 0.315, 0.305, 0.020)
		colorLowland   (0.371, 0.350, 0.336, 0.030)
		colorUpland    (0.410, 0.386, 0.368, 0.050)
		colorRock      (0.448, 0.422, 0.409, 0.020)
		colorSnow      (0.448, 0.422, 0.409, 1.000)
		BumpHeight      0.0784966
		BumpOffset      0.0156993
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.791151
		Period          2.00649
		Eccentricity    0.101773
		Inclination     1.7038
		AscendingNode   136.61
		ArgOfPericenter -164.277
		MeanAnomaly     114.522
	}
}

Asteroid	"S43"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.41295e-012
	Radius          0.933933
	InertiaMoment   0.399999

	RotationPeriod  2009.12
	Obliquity       185.646
	EqAscendNode    88.3324

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.694 0.691 0.689)

	Surface
	{
		SurfStyle       0.194945
		OceanStyle      0.451597
		Randomize      (-0.526, -0.938, 0.037)
		colorDistMagn   0.0879394
		colorDistFreq   0.00031561
		detailScale     25.5026
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0844479
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496858
		terraceProb     0.103373
		erosion         0
		montesMagn      0.58976
		montesFreq      2.51065
		montesSpiky     0.998269
		montesFraction  0.30926
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00236431
		hillsFraction   0.896265
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215168
		craterFreq      0.215815
		craterDensity   0.937089
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   123.185
		volcanoTemp     1777.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.276, 0.275, 0.000)
		colorShelf     (0.295, 0.294, 0.293, 0.000)
		colorBeach     (0.312, 0.311, 0.310, 0.000)
		colorDesert    (0.329, 0.328, 0.327, 0.000)
		colorLowland   (0.347, 0.345, 0.344, 0.000)
		colorUpland    (0.364, 0.363, 0.361, 0.000)
		colorRock      (0.382, 0.380, 0.379, 0.000)
		colorSnow      (0.399, 0.397, 0.396, 1.000)
		BumpHeight      0.84054
		BumpOffset      0.168108
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.762557
		Period          1.8987
		Eccentricity    0.0680914
		Inclination     -0.802188
		AscendingNode   0.754264
		ArgOfPericenter -134.493
		MeanAnomaly     -18.3143
	}
}

Asteroid	"S44"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.07924e-009
	Radius          11.2836
	InertiaMoment   0.398156

	RotationPeriod  644.891
	Obliquity       75.9849
	EqAscendNode    98.4488

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.411 0.407 0.404)

	Surface
	{
		SurfStyle       0.595207
		OceanStyle      0.598566
		Randomize      (0.059, 0.808, -0.213)
		colorDistMagn   0.452385
		colorDistFreq   0.0728168
		detailScale     308.116
		colorConversion true
		snowLevel       2
		tropicLatitude  0.949834
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610278
		terraceProb     0.451057
		erosion         0
		montesMagn      0.401436
		montesFreq      3.69167
		montesSpiky     0.927859
		montesFraction  0.675252
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.3863
		hillsFraction   0.538629
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229779
		craterFreq      0.207306
		craterDensity   0.788999
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.7972
		volcanoTemp     1700.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.138, 0.113, 0.000)
		colorShelf     (0.164, 0.143, 0.129, 0.000)
		colorBeach     (0.193, 0.167, 0.154, 0.000)
		colorDesert    (0.209, 0.179, 0.150, 0.000)
		colorLowland   (0.230, 0.191, 0.170, 0.000)
		colorUpland    (0.255, 0.232, 0.206, 0.000)
		colorRock      (0.275, 0.252, 0.222, 0.000)
		colorSnow      (0.300, 0.269, 0.234, 1.000)
		BumpHeight      10.1552
		BumpOffset      2.03104
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.774845
		Period          1.94478
		Eccentricity    0.0828709
		Inclination     4.81161
		AscendingNode   151.366
		ArgOfPericenter -140.149
		MeanAnomaly     -104.433
	}
}

Asteroid	"S45"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.21809e-017
	Radius          0.0191499
	InertiaMoment   0.399265

	RotationPeriod  10923.8
	Obliquity       38.4186
	EqAscendNode    -110.155

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.750 0.682 0.623)

	Surface
	{
		SurfStyle       0.692045
		OceanStyle      0.0954068
		Randomize      (-0.381, 0.884, 0.534)
		colorDistMagn   0.341102
		colorDistFreq   3.03876e-007
		detailScale     0.522921
		colorConversion true
		snowLevel       2
		tropicLatitude  0.600753
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545256
		terraceProb     0.528455
		erosion         0
		montesMagn      0.451328
		montesFreq      3.78357
		montesSpiky     0.909687
		montesFraction  0.28284
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.5301e-007
		hillsFraction   0.749136
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260381
		craterFreq      0.220835
		craterDensity   1.07597
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   860.266
		volcanoTemp     1634.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.232, 0.174, 0.000)
		colorShelf     (0.300, 0.239, 0.199, 0.000)
		colorBeach     (0.353, 0.280, 0.237, 0.000)
		colorDesert    (0.383, 0.300, 0.231, 0.000)
		colorLowland   (0.420, 0.321, 0.262, 0.000)
		colorUpland    (0.465, 0.389, 0.318, 0.000)
		colorRock      (0.503, 0.423, 0.343, 0.000)
		colorSnow      (0.548, 0.450, 0.361, 1.000)
		BumpHeight      0.0172349
		BumpOffset      0.00344699
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.79565
		Period          2.02363
		Eccentricity    0.106852
		Inclination     2.04567
		AscendingNode   -137.836
		ArgOfPericenter 106.145
		MeanAnomaly     142.209
	}
}

Asteroid	"S46"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.79249e-014
	Radius          0.231372
	InertiaMoment   0.396377

	RotationPeriod  4093.88
	Obliquity       68.6161
	EqAscendNode    31.8723

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.523 0.423 0.373)

	Surface
	{
		SurfStyle       0.566184
		OceanStyle      0.31188
		Randomize      (-0.931, 0.439, -0.781)
		colorDistMagn   0.199728
		colorDistFreq   4.4671e-005
		detailScale     6.31799
		colorConversion true
		snowLevel       2
		tropicLatitude  0.8822
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.543587
		terraceProb     0.316024
		erosion         0
		montesMagn      0.371556
		montesFreq      3.10793
		montesSpiky     0.993271
		montesFraction  0.702367
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000151571
		hillsFraction   0.873584
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238939
		craterFreq      0.239096
		craterDensity   0.960227
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   270.949
		volcanoTemp     1727.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.144, 0.104, 0.000)
		colorShelf     (0.209, 0.148, 0.119, 0.000)
		colorBeach     (0.246, 0.173, 0.142, 0.000)
		colorDesert    (0.267, 0.186, 0.138, 0.000)
		colorLowland   (0.293, 0.199, 0.157, 0.000)
		colorUpland    (0.324, 0.241, 0.190, 0.000)
		colorRock      (0.350, 0.262, 0.205, 0.000)
		colorSnow      (0.382, 0.279, 0.216, 1.000)
		BumpHeight      0.208235
		BumpOffset      0.0416469
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.809602
		Period          2.07709
		Eccentricity    0.122244
		Inclination     -6.72003
		AscendingNode   3.44573
		ArgOfPericenter 14.236
		MeanAnomaly     -89.4082
	}
}

Asteroid	"S47"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.63774e-011
	Radius          2.47751
	InertiaMoment   0.398411

	RotationPeriod  1230.65
	Obliquity       277.181
	EqAscendNode    31.9731

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.792 0.789 0.788)

	Surface
	{
		SurfStyle       0.598167
		OceanStyle      0.425957
		Randomize      (-0.189, 0.726, 0.485)
		colorDistMagn   0.526702
		colorDistFreq   0.00248534
		detailScale     67.6526
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991918
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.475559
		terraceProb     0.439629
		erosion         0
		montesMagn      0.539461
		montesFreq      3.43504
		montesSpiky     0.835543
		montesFraction  0.522464
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0111682
		hillsFraction   0.526566
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.290824
		craterFreq      0.190355
		craterDensity   0.829461
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   75.6319
		volcanoTemp     1421.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.268, 0.221, 0.000)
		colorShelf     (0.317, 0.276, 0.252, 0.000)
		colorBeach     (0.372, 0.323, 0.299, 0.000)
		colorDesert    (0.404, 0.347, 0.292, 0.000)
		colorLowland   (0.444, 0.371, 0.331, 0.000)
		colorUpland    (0.491, 0.450, 0.402, 0.000)
		colorRock      (0.531, 0.489, 0.433, 0.000)
		colorSnow      (0.578, 0.521, 0.457, 1.000)
		BumpHeight      2.22976
		BumpOffset      0.445952
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.83524
		Period          2.17653
		Eccentricity    0.149187
		Inclination     -0.547369
		AscendingNode   101.42
		ArgOfPericenter -146.025
		MeanAnomaly     72.8747
	}
}

Asteroid	"S48"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.88157e-008
	Radius          29.9307
	InertiaMoment   0.399451

	RotationPeriod  396.947
	Obliquity       136.683
	EqAscendNode    -0.999874

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.472 0.469 0.464)

	Surface
	{
		SurfStyle       0.348264
		OceanStyle      0.791132
		Randomize      (0.935, 0.417, -0.773)
		colorDistMagn   0.0566471
		colorDistFreq   0.629752
		detailScale     817.308
		colorConversion true
		snowLevel       2
		tropicLatitude  0.683099
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.596043
		terraceProb     0.379976
		erosion         0
		montesMagn      0.348124
		montesFreq      2.8235
		montesSpiky     0.911089
		montesFraction  0.464905
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.27913
		hillsFraction   0.64181
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232876
		craterFreq      0.250962
		craterDensity   0.816242
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.8188
		volcanoTemp     1721.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.187, 0.186, 0.000)
		colorShelf     (0.201, 0.199, 0.197, 0.000)
		colorBeach     (0.212, 0.211, 0.209, 0.000)
		colorDesert    (0.224, 0.223, 0.220, 0.000)
		colorLowland   (0.236, 0.234, 0.232, 0.000)
		colorUpland    (0.248, 0.246, 0.244, 0.000)
		colorRock      (0.260, 0.258, 0.255, 0.000)
		colorSnow      (0.271, 0.270, 0.267, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.852532
		Period          2.24447
		Eccentricity    0.166443
		Inclination     -1.42041
		AscendingNode   -100.106
		ArgOfPericenter 145.167
		MeanAnomaly     175.381
	}
}

Asteroid	"S49"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.27397e-016
	Radius          0.0508007
	InertiaMoment   0.397051

	RotationPeriod  7332.74
	Obliquity       123.365
	EqAscendNode    30.6004

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.526 0.519 0.514)

	Surface
	{
		SurfStyle       0.939625
		OceanStyle      0.42467
		Randomize      (-0.271, -0.267, -0.218)
		colorDistMagn   0.372832
		colorDistFreq   1.35701e-006
		detailScale     1.3872
		colorConversion true
		snowLevel       2
		tropicLatitude  0.828256
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.323647
		terraceProb     0.368038
		erosion         0
		montesMagn      0.406708
		montesFreq      3.31594
		montesSpiky     0.859554
		montesFraction  0.483746
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.67397e-006
		hillsFraction   0.845802
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257268
		craterFreq      0.239362
		craterDensity   0.836577
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   528.181
		volcanoTemp     1291.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.182, 0.206, 0.050)
		colorShelf     (0.210, 0.213, 0.237, 0.040)
		colorBeach     (0.242, 0.244, 0.267, 0.030)
		colorDesert    (0.273, 0.275, 0.303, 0.020)
		colorLowland   (0.305, 0.306, 0.334, 0.030)
		colorUpland    (0.336, 0.337, 0.365, 0.050)
		colorRock      (0.368, 0.368, 0.406, 0.020)
		colorSnow      (0.368, 0.368, 0.406, 1.000)
		BumpHeight      0.0457206
		BumpOffset      0.00914412
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.803793
		Period          2.05478
		Eccentricity    0.1159
		Inclination     -0.826953
		AscendingNode   -150.036
		ArgOfPericenter -66.5579
		MeanAnomaly     -143.752
	}
}

Asteroid	"S50"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.34626e-013
	Radius          0.613778
	InertiaMoment   0.398642

	RotationPeriod  2727.19
	Obliquity       106.221
	EqAscendNode    240.76

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.738 0.735 0.733)

	Surface
	{
		SurfStyle       0.447546
		OceanStyle      0.270163
		Randomize      (0.530, 0.633, 0.490)
		colorDistMagn   0.63917
		colorDistFreq   0.000177131
		detailScale     16.7602
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972304
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.54397
		terraceProb     0.354883
		erosion         0
		montesMagn      0.550997
		montesFreq      2.77995
		montesSpiky     0.985866
		montesFraction  0.760526
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00103115
		hillsFraction   0.576237
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236427
		craterFreq      0.178254
		craterDensity   1.09129
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   166.355
		volcanoTemp     1405.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.294, 0.293, 0.000)
		colorShelf     (0.314, 0.313, 0.312, 0.000)
		colorBeach     (0.332, 0.331, 0.330, 0.000)
		colorDesert    (0.351, 0.349, 0.348, 0.000)
		colorLowland   (0.369, 0.368, 0.367, 0.000)
		colorUpland    (0.387, 0.386, 0.385, 0.000)
		colorRock      (0.406, 0.405, 0.403, 0.000)
		colorSnow      (0.424, 0.423, 0.422, 1.000)
		BumpHeight      0.5524
		BumpOffset      0.11048
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.736942
		Period          1.80384
		Eccentricity    0.0356996
		Inclination     5.04986
		AscendingNode   121.799
		ArgOfPericenter -114.325
		MeanAnomaly     -137.397
	}
}

Asteroid	"S51"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.92421e-010
	Radius          6.57221
	InertiaMoment   0.399632

	RotationPeriod  772.91
	Obliquity       4.34806
	EqAscendNode    258.293

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.667 0.661 0.658)

	Surface
	{
		SurfStyle       0.544547
		OceanStyle      0.875314
		Randomize      (-0.165, -0.645, -0.310)
		colorDistMagn   0.619847
		colorDistFreq   0.0230064
		detailScale     179.465
		colorConversion true
		snowLevel       2
		tropicLatitude  0.120102
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.758
		terraceProb     0.201732
		erosion         0
		montesMagn      0.482564
		montesFreq      2.87328
		montesSpiky     0.850049
		montesFraction  0.901458
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.131839
		hillsFraction   0.524541
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233465
		craterFreq      0.241603
		craterDensity   0.659794
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.4354
		volcanoTemp     1565.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.225, 0.184, 0.000)
		colorShelf     (0.267, 0.231, 0.211, 0.000)
		colorBeach     (0.313, 0.271, 0.250, 0.000)
		colorDesert    (0.340, 0.291, 0.244, 0.000)
		colorLowland   (0.374, 0.311, 0.276, 0.000)
		colorUpland    (0.414, 0.377, 0.336, 0.000)
		colorRock      (0.447, 0.410, 0.362, 0.000)
		colorSnow      (0.487, 0.436, 0.382, 1.000)
		BumpHeight      5.91499
		BumpOffset      1.183
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.762693
		Period          1.89921
		Eccentricity    0.0682577
		Inclination     3.33063
		AscendingNode   -52.5866
		ArgOfPericenter 136.662
		MeanAnomaly     -57.093
	}
}

Asteroid	"S52"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            7.24624e-007
	Radius          79.3825
	InertiaMoment   0.397496

	RotationPeriod  244.042
	Obliquity       196.422
	EqAscendNode    264.76

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.799 0.796 0.793)

	Surface
	{
		SurfStyle       0.488161
		OceanStyle      0.828079
		Randomize      (0.793, 0.352, -0.990)
		colorDistMagn   0.338159
		colorDistFreq   2.72605
		detailScale     2167.67
		colorConversion true
		snowLevel       2
		tropicLatitude  0.273069
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.593489
		terraceProb     0.517973
		erosion         0
		montesMagn      0.547487
		montesFreq      3.51866
		montesSpiky     0.867179
		montesFraction  0.388457
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.5156
		hillsFraction   0.657915
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241259
		craterFreq      0.216718
		craterDensity   0.797814
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   14.6209
		volcanoTemp     1234.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.319, 0.317, 0.000)
		colorShelf     (0.340, 0.339, 0.337, 0.000)
		colorBeach     (0.360, 0.358, 0.357, 0.000)
		colorDesert    (0.380, 0.378, 0.377, 0.000)
		colorLowland   (0.400, 0.398, 0.397, 0.000)
		colorUpland    (0.420, 0.418, 0.416, 0.000)
		colorRock      (0.440, 0.438, 0.436, 0.000)
		colorSnow      (0.459, 0.458, 0.456, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.881292
		Period          2.359
		Eccentricity    0.193646
		Inclination     -1.91171
		AscendingNode   -69.3795
		ArgOfPericenter 115.119
		MeanAnomaly     -127.163
	}
}

Asteroid	"S53"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.2451e-015
	Radius          0.134763
	InertiaMoment   0.398856

	RotationPeriod  4790.85
	Obliquity       21.7949
	EqAscendNode    102.869

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.732 0.653 0.594)

	Surface
	{
		SurfStyle       0.962889
		OceanStyle      0.889634
		Randomize      (0.991, 0.196, -0.453)
		colorDistMagn   0.170253
		colorDistFreq   1.43822e-005
		detailScale     3.67992
		colorConversion true
		snowLevel       2
		tropicLatitude  0.349841
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.480578
		terraceProb     0.308937
		erosion         0
		montesMagn      0.506112
		montesFreq      3.35368
		montesSpiky     0.772171
		montesFraction  0.594717
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.43524e-005
		hillsFraction   0.64971
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236224
		craterFreq      0.205696
		craterDensity   1.01957
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   324.289
		volcanoTemp     1773.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.229, 0.238, 0.050)
		colorShelf     (0.293, 0.268, 0.273, 0.040)
		colorBeach     (0.337, 0.307, 0.309, 0.030)
		colorDesert    (0.381, 0.346, 0.351, 0.020)
		colorLowland   (0.425, 0.386, 0.386, 0.030)
		colorUpland    (0.469, 0.425, 0.422, 0.050)
		colorRock      (0.513, 0.464, 0.469, 0.020)
		colorSnow      (0.513, 0.464, 0.469, 1.000)
		BumpHeight      0.121286
		BumpOffset      0.0242573
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.81987
		Period          2.11673
		Eccentricity    0.133236
		Inclination     3.43036
		AscendingNode   -116.62
		ArgOfPericenter 27.2682
		MeanAnomaly     -173.423
	}
}

Asteroid	"S54"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.24689e-012
	Radius          1.62821
	InertiaMoment   0.399809

	RotationPeriod  1655.23
	Obliquity       192.136
	EqAscendNode    204.897

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.498 0.495 0.490)

	Surface
	{
		SurfStyle       0.18302
		OceanStyle      0.0784458
		Randomize      (-0.653, 0.464, -0.910)
		colorDistMagn   0.124258
		colorDistFreq   0.00216445
		detailScale     44.4611
		colorConversion true
		snowLevel       2
		tropicLatitude  0.231953
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.620369
		terraceProb     0.174731
		erosion         0
		montesMagn      0.386126
		montesFreq      4.00942
		montesSpiky     0.982341
		montesFraction  0.413435
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00613679
		hillsFraction   0.642735
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251521
		craterFreq      0.187755
		craterDensity   0.9961
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   102.138
		volcanoTemp     1649.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.198, 0.196, 0.000)
		colorShelf     (0.212, 0.210, 0.208, 0.000)
		colorBeach     (0.224, 0.223, 0.221, 0.000)
		colorDesert    (0.237, 0.235, 0.233, 0.000)
		colorLowland   (0.249, 0.247, 0.245, 0.000)
		colorUpland    (0.262, 0.260, 0.258, 0.000)
		colorRock      (0.274, 0.272, 0.270, 0.000)
		colorSnow      (0.287, 0.284, 0.282, 1.000)
		BumpHeight      1.46539
		BumpOffset      0.293079
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.802639
		Period          2.05035
		Eccentricity    0.114629
		Inclination     -3.19014
		AscendingNode   106.934
		ArgOfPericenter 173.299
		MeanAnomaly     53.0822
	}
}

Asteroid	"S55"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            9.19264e-009
	Radius          17.4339
	InertiaMoment   0.397843

	RotationPeriod  473.645
	Obliquity       60.8411
	EqAscendNode    196.59

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.693 0.687 0.684)

	Surface
	{
		SurfStyle       0.334888
		OceanStyle      0.442389
		Randomize      (-0.026, 0.318, 0.081)
		colorDistMagn   0.251245
		colorDistFreq   0.223915
		detailScale     476.062
		colorConversion true
		snowLevel       2
		tropicLatitude  0.859312
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.363484
		terraceProb     0.108063
		erosion         0
		montesMagn      0.524797
		montesFreq      3.78135
		montesSpiky     0.916175
		montesFraction  0.383267
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.764918
		hillsFraction   0.777829
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253948
		craterFreq      0.166566
		craterDensity   0.762552
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.5089
		volcanoTemp     1702.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.275, 0.274, 0.000)
		colorShelf     (0.294, 0.292, 0.291, 0.000)
		colorBeach     (0.312, 0.309, 0.308, 0.000)
		colorDesert    (0.329, 0.326, 0.325, 0.000)
		colorLowland   (0.346, 0.344, 0.342, 0.000)
		colorUpland    (0.364, 0.361, 0.359, 0.000)
		colorRock      (0.381, 0.378, 0.376, 0.000)
		colorSnow      (0.398, 0.395, 0.393, 1.000)
		BumpHeight      15.6905
		BumpOffset      3.1381
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.824241
		Period          2.13368
		Eccentricity    0.137834
		Inclination     4.52014
		AscendingNode   111.958
		ArgOfPericenter 64.2824
		MeanAnomaly     85.3497
	}
}

Asteroid	"S56"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.38539e-017
	Radius          0.0333859
	InertiaMoment   0.399058

	RotationPeriod  10134.3
	Obliquity       23.2301
	EqAscendNode    -112.987

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.821 0.789 0.776)

	Surface
	{
		SurfStyle       0.615267
		OceanStyle      0.483316
		Randomize      (0.430, 0.297, 0.895)
		colorDistMagn   0.59227
		colorDistFreq   5.63592e-007
		detailScale     0.911659
		colorConversion true
		snowLevel       2
		tropicLatitude  0.415608
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.474774
		terraceProb     0.300911
		erosion         0
		montesMagn      0.446474
		montesFreq      2.94397
		montesSpiky     0.994445
		montesFraction  0.652977
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.23695e-006
		hillsFraction   0.410112
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248404
		craterFreq      0.21495
		craterDensity   0.90678
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   713.282
		volcanoTemp     1405.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.268, 0.217, 0.000)
		colorShelf     (0.329, 0.276, 0.248, 0.000)
		colorBeach     (0.386, 0.323, 0.295, 0.000)
		colorDesert    (0.419, 0.347, 0.287, 0.000)
		colorLowland   (0.460, 0.371, 0.326, 0.000)
		colorUpland    (0.509, 0.450, 0.396, 0.000)
		colorRock      (0.550, 0.489, 0.427, 0.000)
		colorSnow      (0.600, 0.521, 0.450, 1.000)
		BumpHeight      0.0300473
		BumpOffset      0.00600947
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.758241
		Period          1.8826
		Eccentricity    0.0627865
		Inclination     -1.62497
		AscendingNode   -143.706
		ArgOfPericenter -144.556
		MeanAnomaly     -61.5665
	}
}

Asteroid	"S57"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            7.92488e-014
	Radius          0.357496
	InertiaMoment   0.399986

	RotationPeriod  3128.68
	Obliquity       64.0993
	EqAscendNode    70.3274

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.758 0.757 0.754)

	Surface
	{
		SurfStyle       0.878985
		OceanStyle      0.326586
		Randomize      (-0.481, -0.770, -0.764)
		colorDistMagn   0.0794595
		colorDistFreq   5.88147e-005
		detailScale     9.76201
		colorConversion true
		snowLevel       2
		tropicLatitude  0.894065
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.330227
		terraceProb     0.218401
		erosion         0
		montesMagn      0.435607
		montesFreq      2.70614
		montesSpiky     0.924255
		montesFraction  0.632814
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000350551
		hillsFraction   0.540487
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210768
		craterFreq      0.175987
		craterDensity   0.889588
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   199.104
		volcanoTemp     1612.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.265, 0.302, 0.050)
		colorShelf     (0.303, 0.310, 0.347, 0.040)
		colorBeach     (0.349, 0.356, 0.392, 0.030)
		colorDesert    (0.394, 0.401, 0.445, 0.020)
		colorLowland   (0.440, 0.446, 0.490, 0.030)
		colorUpland    (0.485, 0.492, 0.536, 0.050)
		colorRock      (0.531, 0.537, 0.596, 0.020)
		colorSnow      (0.531, 0.537, 0.596, 1.000)
		BumpHeight      0.321746
		BumpOffset      0.0643492
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.791028
		Period          2.00602
		Eccentricity    0.101633
		Inclination     1.85153
		AscendingNode   -112.994
		ArgOfPericenter -164.306
		MeanAnomaly     42.62
	}
}

Asteroid	"S58"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.16619e-010
	Radius          4.31927
	InertiaMoment   0.398135

	RotationPeriod  1023.84
	Obliquity       268.158
	EqAscendNode    133.87

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.734 0.732 0.728)

	Surface
	{
		SurfStyle       0.385695
		OceanStyle      0.448461
		Randomize      (-0.954, -0.903, 0.909)
		colorDistMagn   0.393308
		colorDistFreq   0.000868053
		detailScale     117.945
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99734
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502374
		terraceProb     0.232084
		erosion         0
		montesMagn      0.597228
		montesFreq      2.72551
		montesSpiky     0.906702
		montesFraction  0.244553
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0469333
		hillsFraction   0.658963
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266396
		craterFreq      0.275723
		craterDensity   0.832633
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   62.7092
		volcanoTemp     1420.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.293, 0.291, 0.000)
		colorShelf     (0.312, 0.311, 0.310, 0.000)
		colorBeach     (0.330, 0.329, 0.328, 0.000)
		colorDesert    (0.348, 0.348, 0.346, 0.000)
		colorLowland   (0.367, 0.366, 0.364, 0.000)
		colorUpland    (0.385, 0.384, 0.382, 0.000)
		colorRock      (0.403, 0.402, 0.401, 0.000)
		colorSnow      (0.422, 0.421, 0.419, 1.000)
		BumpHeight      3.88734
		BumpOffset      0.777468
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.862206
		Period          2.28278
		Eccentricity    0.175796
		Inclination     -6.02191
		AscendingNode   179.61
		ArgOfPericenter 145.34
		MeanAnomaly     -25.0077
	}
}

Asteroid	"S59"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.71611e-007
	Radius          46.2424
	InertiaMoment   0.399251

	RotationPeriod  293.087
	Obliquity       117.955
	EqAscendNode    102.586

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.783 0.781 0.779)

	Surface
	{
		SurfStyle       0.159476
		OceanStyle      0.799995
		Randomize      (0.475, -0.923, -0.847)
		colorDistMagn   0.865503
		colorDistFreq   1.64972
		detailScale     1262.73
		colorConversion true
		snowLevel       2
		tropicLatitude  0.88169
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478051
		terraceProb     0.364926
		erosion         0
		montesMagn      0.488491
		montesFreq      3.24837
		montesSpiky     0.949146
		montesFraction  0.640546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.38283
		hillsFraction   0.655676
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232249
		craterFreq      0.275126
		craterDensity   0.908907
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   17.5015
		volcanoTemp     1585.2
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
		SemiMajorAxis   0.787659
		Period          1.99322
		Eccentricity    0.0977903
		Inclination     0.322014
		AscendingNode   -52.0606
		ArgOfPericenter 126.906
		MeanAnomaly     -163.605
	}
}

Asteroid	"S60"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.00536e-015
	Radius          0.0885656
	InertiaMoment   0.396304

	RotationPeriod  6375.55
	Obliquity       124.872
	EqAscendNode    84.239

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.608 0.531)

	Surface
	{
		SurfStyle       0.573058
		OceanStyle      0.947001
		Randomize      (0.256, -0.379, -0.153)
		colorDistMagn   0.326954
		colorDistFreq   2.48018e-006
		detailScale     2.41843
		colorConversion true
		snowLevel       2
		tropicLatitude  0.818044
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.713159
		terraceProb     0.214411
		erosion         0
		montesMagn      0.527639
		montesFreq      2.58652
		montesSpiky     0.986853
		montesFraction  0.217912
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.28671e-005
		hillsFraction   0.949839
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260085
		craterFreq      0.174803
		craterDensity   0.784049
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   437.935
		volcanoTemp     1414.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.207, 0.149, 0.000)
		colorShelf     (0.262, 0.213, 0.170, 0.000)
		colorBeach     (0.308, 0.249, 0.202, 0.000)
		colorDesert    (0.334, 0.268, 0.196, 0.000)
		colorLowland   (0.366, 0.286, 0.223, 0.000)
		colorUpland    (0.406, 0.347, 0.271, 0.000)
		colorRock      (0.438, 0.377, 0.292, 0.000)
		colorSnow      (0.478, 0.401, 0.308, 1.000)
		BumpHeight      0.079709
		BumpOffset      0.0159418
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.784858
		Period          1.9826
		Eccentricity    0.0945708
		Inclination     2.74919
		AscendingNode   84.0683
		ArgOfPericenter 134.603
		MeanAnomaly     -117.119
	}
}

Asteroid	"S61"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.47944e-012
	Radius          0.948356
	InertiaMoment   0.398392

	RotationPeriod  1969.94
	Obliquity       120.093
	EqAscendNode    16.9737

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.787 0.786 0.785)

	Surface
	{
		SurfStyle       0.791258
		OceanStyle      0.156014
		Randomize      (-0.443, 0.091, 0.799)
		colorDistMagn   0.591207
		colorDistFreq   0.000241433
		detailScale     25.8964
		colorConversion true
		snowLevel       2
		tropicLatitude  0.848645
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.676143
		terraceProb     0.137981
		erosion         0
		montesMagn      0.638325
		montesFreq      3.34052
		montesSpiky     0.99091
		montesFraction  0.438645
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00158425
		hillsFraction   0.819268
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210316
		craterFreq      0.212151
		craterDensity   0.880728
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   122.244
		volcanoTemp     1366.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.267, 0.220, 0.000)
		colorShelf     (0.315, 0.275, 0.251, 0.000)
		colorBeach     (0.370, 0.322, 0.298, 0.000)
		colorDesert    (0.401, 0.346, 0.290, 0.000)
		colorLowland   (0.441, 0.369, 0.330, 0.000)
		colorUpland    (0.488, 0.448, 0.400, 0.000)
		colorRock      (0.527, 0.487, 0.432, 0.000)
		colorSnow      (0.575, 0.519, 0.455, 1.000)
		BumpHeight      0.85352
		BumpOffset      0.170704
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.789891
		Period          2.0017
		Eccentricity    0.100341
		Inclination     -1.99084
		AscendingNode   -157.951
		ArgOfPericenter 158.17
		MeanAnomaly     87.8811
	}
}

Asteroid	"S62"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.17707e-009
	Radius          11.4578
	InertiaMoment   0.399436

	RotationPeriod  638.242
	Obliquity       327.283
	EqAscendNode    32.953

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.794 0.792 0.791)

	Surface
	{
		SurfStyle       0.19732
		OceanStyle      0.579754
		Randomize      (-0.542, 0.184, -0.578)
		colorDistMagn   0.538181
		colorDistFreq   0.0413935
		detailScale     312.875
		colorConversion true
		snowLevel       2
		tropicLatitude  0.552454
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.546981
		terraceProb     0.551566
		erosion         0
		montesMagn      0.581199
		montesFreq      2.91109
		montesSpiky     0.919947
		montesFraction  0.59256
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.269121
		hillsFraction   0.576171
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227502
		craterFreq      0.259888
		craterDensity   0.736549
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.5009
		volcanoTemp     1594.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.317, 0.317, 0.000)
		colorShelf     (0.338, 0.337, 0.336, 0.000)
		colorBeach     (0.357, 0.357, 0.356, 0.000)
		colorDesert    (0.377, 0.376, 0.376, 0.000)
		colorLowland   (0.397, 0.396, 0.396, 0.000)
		colorUpland    (0.417, 0.416, 0.416, 0.000)
		colorRock      (0.437, 0.436, 0.435, 0.000)
		colorSnow      (0.457, 0.456, 0.455, 1.000)
		BumpHeight      10.312
		BumpOffset      2.06241
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.821904
		Period          2.12461
		Eccentricity    0.135382
		Inclination     -1.69585
		AscendingNode   -62.2987
		ArgOfPericenter -71.125
		MeanAnomaly     90.0115
	}
}

Asteroid	"S63"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.27541e-017
	Radius          0.0194457
	InertiaMoment   0.39701

	RotationPeriod  10137.5
	Obliquity       61.8578
	EqAscendNode    -59.461

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.808 0.757 0.690)

	Surface
	{
		SurfStyle       0.556393
		OceanStyle      0.0778584
		Randomize      (0.145, 0.027, -0.207)
		colorDistMagn   0.51542
		colorDistFreq   1.70829e-007
		detailScale     0.530998
		colorConversion true
		snowLevel       2
		tropicLatitude  0.879891
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.468857
		terraceProb     0.319055
		erosion         0
		montesMagn      0.431385
		montesFreq      2.41554
		montesSpiky     0.889221
		montesFraction  0.554603
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.66606e-007
		hillsFraction   0.850256
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25985
		craterFreq      0.217415
		craterDensity   0.878468
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   853.701
		volcanoTemp     1666.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.258, 0.193, 0.000)
		colorShelf     (0.323, 0.265, 0.221, 0.000)
		colorBeach     (0.380, 0.311, 0.262, 0.000)
		colorDesert    (0.412, 0.333, 0.255, 0.000)
		colorLowland   (0.452, 0.356, 0.290, 0.000)
		colorUpland    (0.501, 0.432, 0.352, 0.000)
		colorRock      (0.541, 0.470, 0.379, 0.000)
		colorSnow      (0.590, 0.500, 0.400, 1.000)
		BumpHeight      0.0175011
		BumpOffset      0.00350023
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.859556
		Period          2.27227
		Eccentricity    0.173256
		Inclination     1.97752
		AscendingNode   -97.1672
		ArgOfPericenter 120.009
		MeanAnomaly     -87.8486
	}
}

Asteroid	"S64"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.87683e-014
	Radius          0.234945
	InertiaMoment   0.398625

	RotationPeriod  4131.73
	Obliquity       6.80249
	EqAscendNode    188.729

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.710 0.706 0.703)

	Surface
	{
		SurfStyle       0.533139
		OceanStyle      0.024577
		Randomize      (-0.067, 0.117, 0.285)
		colorDistMagn   0.470793
		colorDistFreq   4.09824e-005
		detailScale     6.41556
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0782835
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453784
		terraceProb     0.117188
		erosion         0
		montesMagn      0.436105
		montesFreq      3.22151
		montesSpiky     0.790204
		montesFraction  0.0635352
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000141256
		hillsFraction   0.750834
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252633
		craterFreq      0.196455
		craterDensity   0.830221
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   268.881
		volcanoTemp     1061.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.240, 0.197, 0.000)
		colorShelf     (0.284, 0.247, 0.225, 0.000)
		colorBeach     (0.334, 0.289, 0.267, 0.000)
		colorDesert    (0.362, 0.311, 0.260, 0.000)
		colorLowland   (0.397, 0.332, 0.295, 0.000)
		colorUpland    (0.440, 0.402, 0.358, 0.000)
		colorRock      (0.476, 0.438, 0.387, 0.000)
		colorSnow      (0.518, 0.466, 0.408, 1.000)
		BumpHeight      0.21145
		BumpOffset      0.0422901
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.786724
		Period          1.98967
		Eccentricity    0.0967182
		Inclination     -4.87509
		AscendingNode   -41.2941
		ArgOfPericenter 79.319
		MeanAnomaly     -17.5629
	}
}

Asteroid	"S65"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.76185e-011
	Radius          2.51577
	InertiaMoment   0.399618

	RotationPeriod  1218.7
	Obliquity       195.756
	EqAscendNode    307.249

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.791 0.754 0.730)

	Surface
	{
		SurfStyle       0.35742
		OceanStyle      0.98765
		Randomize      (-0.259, 0.537, 0.344)
		colorDistMagn   0.46684
		colorDistFreq   0.00379958
		detailScale     68.6974
		colorConversion true
		snowLevel       2
		tropicLatitude  0.203946
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.654489
		terraceProb     0.147612
		erosion         0
		montesMagn      0.271471
		montesFreq      2.58223
		montesSpiky     0.731129
		montesFraction  0.606246
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0163738
		hillsFraction   0.713996
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229295
		craterFreq      0.192725
		craterDensity   0.801299
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   75.0546
		volcanoTemp     1283.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.301, 0.292, 0.000)
		colorShelf     (0.336, 0.320, 0.310, 0.000)
		colorBeach     (0.356, 0.339, 0.328, 0.000)
		colorDesert    (0.376, 0.358, 0.347, 0.000)
		colorLowland   (0.395, 0.377, 0.365, 0.000)
		colorUpland    (0.415, 0.396, 0.383, 0.000)
		colorRock      (0.435, 0.415, 0.401, 0.000)
		colorSnow      (0.455, 0.433, 0.420, 1.000)
		BumpHeight      2.2642
		BumpOffset      0.452839
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.886683
		Period          2.38068
		Eccentricity    0.198549
		Inclination     -3.99547
		AscendingNode   -3.01692
		ArgOfPericenter 48.9428
		MeanAnomaly     -102.2
	}
}

Asteroid	"S66"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.06422e-008
	Radius          30.3929
	InertiaMoment   0.397466

	RotationPeriod  393.927
	Obliquity       42.7674
	EqAscendNode    287.686

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.794 0.791 0.789)

	Surface
	{
		SurfStyle       0.254672
		OceanStyle      0.566234
		Randomize      (-0.499, -0.958, -0.805)
		colorDistMagn   0.333476
		colorDistFreq   0.619588
		detailScale     829.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.644788
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629086
		terraceProb     0.206349
		erosion         0
		montesMagn      0.677544
		montesFreq      2.58366
		montesSpiky     0.895377
		montesFraction  0.583212
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.38215
		hillsFraction   0.638144
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223401
		craterFreq      0.188549
		craterDensity   0.716146
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.6369
		volcanoTemp     1787.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.316, 0.316, 0.000)
		colorShelf     (0.338, 0.336, 0.335, 0.000)
		colorBeach     (0.357, 0.356, 0.355, 0.000)
		colorDesert    (0.377, 0.376, 0.375, 0.000)
		colorLowland   (0.397, 0.395, 0.395, 0.000)
		colorUpland    (0.417, 0.415, 0.414, 0.000)
		colorRock      (0.437, 0.435, 0.434, 0.000)
		colorSnow      (0.457, 0.455, 0.454, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.794414
		Period          2.01892
		Eccentricity    0.105462
		Inclination     3.12181
		AscendingNode   -147.925
		ArgOfPericenter -137.508
		MeanAnomaly     -11.7421
	}
}

Asteroid	"S67"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.38097e-016
	Radius          0.0515852
	InertiaMoment   0.39884

	RotationPeriod  8090.34
	Obliquity       38.9372
	EqAscendNode    -51.4091

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.490 0.420 0.379)

	Surface
	{
		SurfStyle       0.827841
		OceanStyle      0.243539
		Randomize      (-0.779, -0.020, 0.059)
		colorDistMagn   0.703956
		colorDistFreq   1.76456e-006
		detailScale     1.40862
		colorConversion true
		snowLevel       2
		tropicLatitude  0.615716
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.65343
		terraceProb     0.11441
		erosion         0
		montesMagn      0.621695
		montesFreq      2.55742
		montesSpiky     0.987436
		montesFraction  0.67035
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.22005e-006
		hillsFraction   0.641864
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229929
		craterFreq      0.209825
		craterDensity   0.809657
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   524.149
		volcanoTemp     1399.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.143, 0.106, 0.000)
		colorShelf     (0.196, 0.147, 0.121, 0.000)
		colorBeach     (0.230, 0.172, 0.144, 0.000)
		colorDesert    (0.250, 0.185, 0.140, 0.000)
		colorLowland   (0.274, 0.198, 0.159, 0.000)
		colorUpland    (0.304, 0.240, 0.193, 0.000)
		colorRock      (0.328, 0.261, 0.208, 0.000)
		colorSnow      (0.358, 0.277, 0.220, 1.000)
		BumpHeight      0.0464267
		BumpOffset      0.00928534
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.739051
		Period          1.81159
		Eccentricity    0.0384521
		Inclination     2.67982
		AscendingNode   -111.951
		ArgOfPericenter 150.099
		MeanAnomaly     -138.71
	}
}

Asteroid	"S68"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.50372e-013
	Radius          0.623257
	InertiaMoment   0.399796

	RotationPeriod  2690.58
	Obliquity       47.0063
	EqAscendNode    178.356

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.449 0.444 0.439)

	Surface
	{
		SurfStyle       0.565615
		OceanStyle      0.145375
		Randomize      (-0.525, 0.749, -0.438)
		colorDistMagn   0.340353
		colorDistFreq   0.00016965
		detailScale     17.0191
		colorConversion true
		snowLevel       2
		tropicLatitude  0.725111
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.337593
		terraceProb     0.35982
		erosion         0
		montesMagn      0.381413
		montesFreq      2.85709
		montesSpiky     0.877936
		montesFraction  0.432738
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00114562
		hillsFraction   0.739915
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244162
		craterFreq      0.235045
		craterDensity   0.749017
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   165.085
		volcanoTemp     1428.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.151, 0.123, 0.000)
		colorShelf     (0.180, 0.156, 0.140, 0.000)
		colorBeach     (0.211, 0.182, 0.167, 0.000)
		colorDesert    (0.229, 0.196, 0.162, 0.000)
		colorLowland   (0.252, 0.209, 0.184, 0.000)
		colorUpland    (0.279, 0.253, 0.224, 0.000)
		colorRock      (0.301, 0.276, 0.241, 0.000)
		colorSnow      (0.328, 0.293, 0.254, 1.000)
		BumpHeight      0.560931
		BumpOffset      0.112186
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.746459
		Period          1.8389
		Eccentricity    0.0479946
		Inclination     -0.634422
		AscendingNode   33.4711
		ArgOfPericenter 166.082
		MeanAnomaly     -108.383
	}
}

Asteroid	"S69"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.1559e-010
	Radius          6.67371
	InertiaMoment   0.397819

	RotationPeriod  766.852
	Obliquity       240.153
	EqAscendNode    207.738

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.486 0.441 0.384)

	Surface
	{
		SurfStyle       0.073553
		OceanStyle      0.0311763
		Randomize      (-0.045, -0.426, -0.223)
		colorDistMagn   0.597806
		colorDistFreq   0.00519231
		detailScale     182.237
		colorConversion true
		snowLevel       2
		tropicLatitude  0.882844
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.703849
		terraceProb     0.226387
		erosion         0
		montesMagn      0.512485
		montesFreq      3.5865
		montesSpiky     0.863265
		montesFraction  0.271163
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.10401
		hillsFraction   0.373224
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261354
		craterFreq      0.251463
		craterDensity   0.865759
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.0809
		volcanoTemp     1629.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.176, 0.154, 0.000)
		colorShelf     (0.206, 0.187, 0.163, 0.000)
		colorBeach     (0.218, 0.198, 0.173, 0.000)
		colorDesert    (0.231, 0.209, 0.183, 0.000)
		colorLowland   (0.243, 0.220, 0.192, 0.000)
		colorUpland    (0.255, 0.231, 0.202, 0.000)
		colorRock      (0.267, 0.242, 0.211, 0.000)
		colorSnow      (0.279, 0.253, 0.221, 1.000)
		BumpHeight      6.00634
		BumpOffset      1.20127
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.752129
		Period          1.85989
		Eccentricity    0.0551706
		Inclination     2.23493
		AscendingNode   -35.2004
		ArgOfPericenter 100.979
		MeanAnomaly     -2.34617
	}
}

Asteroid	"S70"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            7.58718e-007
	Radius          80.608
	InertiaMoment   0.399043

	RotationPeriod  243.065
	Obliquity       100.572
	EqAscendNode    211.415

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.649 0.646 0.639)

	Surface
	{
		SurfStyle       0.242843
		OceanStyle      0.93262
		Randomize      (-0.175, 0.927, 0.627)
		colorDistMagn   0.64825
		colorDistFreq   5.23413
		detailScale     2201.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.978709
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.636087
		terraceProb     0.393563
		erosion         0
		montesMagn      0.383911
		montesFreq      2.4516
		montesSpiky     0.880618
		montesFraction  0.910706
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.7194
		hillsFraction   0.675395
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227252
		craterFreq      0.168687
		craterDensity   1.03735
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   14.5092
		volcanoTemp     1445.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.258, 0.256, 0.000)
		colorShelf     (0.276, 0.274, 0.272, 0.000)
		colorBeach     (0.292, 0.291, 0.288, 0.000)
		colorDesert    (0.308, 0.307, 0.304, 0.000)
		colorLowland   (0.325, 0.323, 0.320, 0.000)
		colorUpland    (0.341, 0.339, 0.336, 0.000)
		colorRock      (0.357, 0.355, 0.352, 0.000)
		colorSnow      (0.373, 0.371, 0.368, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.79973
		Period          2.03922
		Eccentricity    0.111409
		Inclination     -2.1679
		AscendingNode   126.099
		ArgOfPericenter -35.3835
		MeanAnomaly     -106.167
	}
}

Asteroid	"S71"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.44486e-015
	Radius          0.136844
	InertiaMoment   0.399972

	RotationPeriod  4755.94
	Obliquity       182.228
	EqAscendNode    90.1422

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.608 0.604 0.597)

	Surface
	{
		SurfStyle       0.742594
		OceanStyle      0.703079
		Randomize      (0.401, 0.716, -0.302)
		colorDistMagn   0.411263
		colorDistFreq   1.2701e-005
		detailScale     3.73676
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0511503
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.424168
		terraceProb     0.337413
		erosion         0
		montesMagn      0.454919
		montesFreq      3.65977
		montesSpiky     0.829804
		montesFraction  0.81289
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.41415e-005
		hillsFraction   0.834199
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219832
		craterFreq      0.240746
		craterDensity   0.937141
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   321.813
		volcanoTemp     1577.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.205, 0.167, 0.000)
		colorShelf     (0.243, 0.211, 0.191, 0.000)
		colorBeach     (0.286, 0.248, 0.227, 0.000)
		colorDesert    (0.310, 0.266, 0.221, 0.000)
		colorLowland   (0.340, 0.284, 0.251, 0.000)
		colorUpland    (0.377, 0.344, 0.305, 0.000)
		colorRock      (0.407, 0.374, 0.329, 0.000)
		colorSnow      (0.444, 0.399, 0.346, 1.000)
		BumpHeight      0.12316
		BumpOffset      0.024632
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.823484
		Period          2.13074
		Eccentricity    0.13704
		Inclination     -2.79347
		AscendingNode   -70.4344
		ArgOfPericenter -25.719
		MeanAnomaly     -55.0886
	}
}

Asteroid	"S72"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.54082e-012
	Radius          1.65336
	InertiaMoment   0.398114

	RotationPeriod  1691.24
	Obliquity       95.9455
	EqAscendNode    96.8509

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.818 0.713 0.676)

	Surface
	{
		SurfStyle       0.460447
		OceanStyle      0.133919
		Randomize      (-0.782, 0.708, 0.322)
		colorDistMagn   0.83213
		colorDistFreq   0.00183774
		detailScale     45.1477
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994541
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570763
		terraceProb     0.322868
		erosion         0
		montesMagn      0.585718
		montesFreq      2.22846
		montesSpiky     0.917697
		montesFraction  0.469963
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00549288
		hillsFraction   0.711705
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251124
		craterFreq      0.253578
		craterDensity   0.971852
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   101.358
		volcanoTemp     1582.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.327, 0.285, 0.270, 0.000)
		colorShelf     (0.348, 0.303, 0.287, 0.000)
		colorBeach     (0.368, 0.321, 0.304, 0.000)
		colorDesert    (0.389, 0.339, 0.321, 0.000)
		colorLowland   (0.409, 0.357, 0.338, 0.000)
		colorUpland    (0.430, 0.374, 0.355, 0.000)
		colorRock      (0.450, 0.392, 0.372, 0.000)
		colorSnow      (0.471, 0.410, 0.389, 1.000)
		BumpHeight      1.48802
		BumpOffset      0.297605
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.72288
		Period          1.75246
		Eccentricity    0.016942
		Inclination     0.827582
		AscendingNode   -86.9024
		ArgOfPericenter 150.518
		MeanAnomaly     92.663
	}
}

Asteroid	"S73"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            9.62519e-009
	Radius          17.7032
	InertiaMoment   0.399236

	RotationPeriod  470.805
	Obliquity       314.974
	EqAscendNode    135.716

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.698 0.694 0.690)

	Surface
	{
		SurfStyle       0.727049
		OceanStyle      0.203216
		Randomize      (0.042, -0.596, -0.981)
		colorDistMagn   0.92446
		colorDistFreq   0.167795
		detailScale     483.415
		colorConversion true
		snowLevel       2
		tropicLatitude  0.700402
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.341538
		terraceProb     0.439056
		erosion         0
		montesMagn      0.523692
		montesFreq      2.6734
		montesSpiky     0.937175
		montesFraction  0.323196
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.733555
		hillsFraction   0.456709
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257409
		craterFreq      0.175428
		craterDensity   1.0857
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.2913
		volcanoTemp     1653.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.236, 0.193, 0.000)
		colorShelf     (0.279, 0.243, 0.221, 0.000)
		colorBeach     (0.328, 0.284, 0.262, 0.000)
		colorDesert    (0.356, 0.305, 0.255, 0.000)
		colorLowland   (0.391, 0.326, 0.290, 0.000)
		colorUpland    (0.433, 0.395, 0.352, 0.000)
		colorRock      (0.468, 0.430, 0.380, 0.000)
		colorSnow      (0.510, 0.458, 0.400, 1.000)
		BumpHeight      15.9329
		BumpOffset      3.18657
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.827894
		Period          2.14788
		Eccentricity    0.141637
		Inclination     5.37583
		AscendingNode   -81.2595
		ArgOfPericenter 89.768
		MeanAnomaly     157.364
	}
}

Asteroid	"S74"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.63878e-017
	Radius          0.0339015
	InertiaMoment   0.396226

	RotationPeriod  9418.05
	Obliquity       32.2146
	EqAscendNode    -32.7529

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.416 0.411 0.405)

	Surface
	{
		SurfStyle       0.42606
		OceanStyle      0.378877
		Randomize      (0.963, -0.068, -0.160)
		colorDistMagn   0.419356
		colorDistFreq   6.54888e-007
		detailScale     0.925738
		colorConversion true
		snowLevel       2
		tropicLatitude  0.529978
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.634895
		terraceProb     0.21043
		erosion         0
		montesMagn      0.496241
		montesFreq      2.80559
		montesSpiky     0.96853
		montesFraction  0.534477
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.14838e-006
		hillsFraction   0.654223
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24908
		craterFreq      0.239102
		craterDensity   0.863569
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   707.836
		volcanoTemp     1972.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.164, 0.162, 0.000)
		colorShelf     (0.177, 0.175, 0.172, 0.000)
		colorBeach     (0.187, 0.185, 0.182, 0.000)
		colorDesert    (0.198, 0.195, 0.192, 0.000)
		colorLowland   (0.208, 0.205, 0.203, 0.000)
		colorUpland    (0.218, 0.216, 0.213, 0.000)
		colorRock      (0.229, 0.226, 0.223, 0.000)
		colorSnow      (0.239, 0.236, 0.233, 1.000)
		BumpHeight      0.0305114
		BumpOffset      0.00610227
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.792103
		Period          2.01012
		Eccentricity    0.102853
		Inclination     -0.695475
		AscendingNode   -71.8432
		ArgOfPericenter 164.379
		MeanAnomaly     110.563
	}
}

Asteroid	"S75"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            8.29776e-014
	Radius          0.363017
	InertiaMoment   0.398373

	RotationPeriod  3034.7
	Obliquity       284.23
	EqAscendNode    89.7734

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.422 0.419 0.417)

	Surface
	{
		SurfStyle       0.102707
		OceanStyle      0.636995
		Randomize      (0.555, -0.515, -0.819)
		colorDistMagn   0.614165
		colorDistFreq   5.04182e-005
		detailScale     9.91279
		colorConversion true
		snowLevel       2
		tropicLatitude  0.981792
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.377319
		terraceProb     0.251913
		erosion         0
		montesMagn      0.419911
		montesFreq      2.65702
		montesSpiky     0.899606
		montesFraction  0.680496
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000337654
		hillsFraction   0.551147
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217788
		craterFreq      0.236397
		craterDensity   0.86348
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   197.584
		volcanoTemp     1733.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.167, 0.167, 0.000)
		colorShelf     (0.179, 0.178, 0.177, 0.000)
		colorBeach     (0.190, 0.188, 0.188, 0.000)
		colorDesert    (0.200, 0.199, 0.198, 0.000)
		colorLowland   (0.211, 0.209, 0.208, 0.000)
		colorUpland    (0.222, 0.220, 0.219, 0.000)
		colorRock      (0.232, 0.230, 0.229, 0.000)
		colorSnow      (0.243, 0.241, 0.240, 1.000)
		BumpHeight      0.326716
		BumpOffset      0.0653431
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.858262
		Period          2.26714
		Eccentricity    0.0434449
		Inclination     -5.88911
		AscendingNode   56.7232
		ArgOfPericenter 178.145
		MeanAnomaly     125.523
	}
}

Asteroid	"S76"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.22106e-010
	Radius          4.38597
	InertiaMoment   0.399422

	RotationPeriod  1021.66
	Obliquity       174.372
	EqAscendNode    79.1224

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.685 0.683 0.681)

	Surface
	{
		SurfStyle       0.815398
		OceanStyle      0.947044
		Randomize      (0.569, -0.456, -0.093)
		colorDistMagn   0.080725
		colorDistFreq   0.011552
		detailScale     119.766
		colorConversion true
		snowLevel       2
		tropicLatitude  0.10092
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.312233
		terraceProb     0.141061
		erosion         0
		montesMagn      0.450323
		montesFreq      3.14123
		montesSpiky     0.891818
		montesFraction  0.760769
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0522256
		hillsFraction   0.521468
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246773
		craterFreq      0.196549
		craterDensity   0.970147
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   62.2305
		volcanoTemp     1534.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.232, 0.191, 0.000)
		colorShelf     (0.274, 0.239, 0.218, 0.000)
		colorBeach     (0.322, 0.280, 0.259, 0.000)
		colorDesert    (0.350, 0.300, 0.252, 0.000)
		colorLowland   (0.384, 0.321, 0.286, 0.000)
		colorUpland    (0.425, 0.389, 0.347, 0.000)
		colorRock      (0.459, 0.423, 0.374, 0.000)
		colorSnow      (0.500, 0.451, 0.395, 1.000)
		BumpHeight      3.94738
		BumpOffset      0.789475
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.817838
		Period          2.10886
		Eccentricity    0.131083
		Inclination     0.290676
		AscendingNode   123.2
		ArgOfPericenter 6.47473
		MeanAnomaly     101.149
	}
}

Asteroid	"S77"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.79686e-007
	Radius          46.9565
	InertiaMoment   0.396967

	RotationPeriod  289.743
	Obliquity       25.2221
	EqAscendNode    50.15

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.771 0.700 0.623)

	Surface
	{
		SurfStyle       0.72162
		OceanStyle      0.0712449
		Randomize      (0.159, -0.281, -0.198)
		colorDistMagn   0.815639
		colorDistFreq   1.59744
		detailScale     1282.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.517075
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.353658
		terraceProb     0.572343
		erosion         0
		montesMagn      0.65437
		montesFreq      2.76847
		montesSpiky     0.900274
		montesFraction  0.36866
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.75505
		hillsFraction   0.776866
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27202
		craterFreq      0.17068
		craterDensity   0.893521
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   17.3678
		volcanoTemp     1408.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.238, 0.175, 0.000)
		colorShelf     (0.309, 0.245, 0.200, 0.000)
		colorBeach     (0.363, 0.287, 0.237, 0.000)
		colorDesert    (0.393, 0.308, 0.231, 0.000)
		colorLowland   (0.432, 0.329, 0.262, 0.000)
		colorUpland    (0.478, 0.399, 0.318, 0.000)
		colorRock      (0.517, 0.434, 0.343, 0.000)
		colorSnow      (0.563, 0.462, 0.362, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.812248
		Period          2.08728
		Eccentricity    0.125103
		Inclination     6.0154
		AscendingNode   -11.6218
		ArgOfPericenter -73.6089
		MeanAnomaly     170.104
	}
}

Asteroid	"S78"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.05266e-015
	Radius          0.0899335
	InertiaMoment   0.398607

	RotationPeriod  6417.15
	Obliquity       80.0313
	EqAscendNode    72.085

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.767 0.692 0.663)

	Surface
	{
		SurfStyle       0.796673
		OceanStyle      0.0608049
		Randomize      (-0.856, 0.547, 0.137)
		colorDistMagn   0.591176
		colorDistFreq   4.41517e-006
		detailScale     2.45578
		colorConversion true
		snowLevel       2
		tropicLatitude  0.9846
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.627678
		terraceProb     0.292947
		erosion         0
		montesMagn      0.549375
		montesFreq      2.64497
		montesSpiky     0.854413
		montesFraction  0.45788
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.71347e-005
		hillsFraction   0.446402
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239354
		craterFreq      0.263491
		craterDensity   0.937946
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   434.593
		volcanoTemp     1316.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.235, 0.186, 0.000)
		colorShelf     (0.307, 0.242, 0.212, 0.000)
		colorBeach     (0.360, 0.284, 0.252, 0.000)
		colorDesert    (0.391, 0.304, 0.245, 0.000)
		colorLowland   (0.429, 0.325, 0.278, 0.000)
		colorUpland    (0.475, 0.394, 0.338, 0.000)
		colorRock      (0.514, 0.429, 0.364, 0.000)
		colorSnow      (0.560, 0.456, 0.384, 1.000)
		BumpHeight      0.0809401
		BumpOffset      0.016188
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.775643
		Period          1.94778
		Eccentricity    0.0838137
		Inclination     0.883587
		AscendingNode   96.5521
		ArgOfPericenter -128.105
		MeanAnomaly     -67.694
	}
}

Asteroid	"S79"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.54905e-012
	Radius          0.963004
	InertiaMoment   0.399604

	RotationPeriod  1935.25
	Obliquity       47.0066
	EqAscendNode    15.4386

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.693 0.688 0.684)

	Surface
	{
		SurfStyle       0.00261552
		OceanStyle      0.837262
		Randomize      (0.166, 0.884, -0.466)
		colorDistMagn   0.614402
		colorDistFreq   0.000705911
		detailScale     26.2964
		colorConversion true
		snowLevel       2
		tropicLatitude  0.724588
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584467
		terraceProb     0.33173
		erosion         0
		montesMagn      0.4842
		montesFreq      2.78859
		montesSpiky     0.950286
		montesFraction  0.653151
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00237115
		hillsFraction   0.776611
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234645
		craterFreq      0.237683
		craterDensity   0.850495
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   121.311
		volcanoTemp     1385.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.275, 0.273, 0.000)
		colorShelf     (0.294, 0.292, 0.291, 0.000)
		colorBeach     (0.312, 0.310, 0.308, 0.000)
		colorDesert    (0.329, 0.327, 0.325, 0.000)
		colorLowland   (0.346, 0.344, 0.342, 0.000)
		colorUpland    (0.364, 0.361, 0.359, 0.000)
		colorRock      (0.381, 0.378, 0.376, 0.000)
		colorSnow      (0.398, 0.395, 0.393, 1.000)
		BumpHeight      0.866704
		BumpOffset      0.173341
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.842861
		Period          2.20639
		Eccentricity    0.156879
		Inclination     -2.59099
		AscendingNode   76.061
		ArgOfPericenter 146.351
		MeanAnomaly     96.9825
	}
}

Asteroid	"S80"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.27951e-009
	Radius          11.6348
	InertiaMoment   0.397435

	RotationPeriod  635.952
	Obliquity       229.284
	EqAscendNode    313.035

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.793 0.789 0.787)

	Surface
	{
		SurfStyle       0.656212
		OceanStyle      0.829966
		Randomize      (-0.072, -0.342, -0.543)
		colorDistMagn   0.918769
		colorDistFreq   0.104859
		detailScale     317.707
		colorConversion true
		snowLevel       2
		tropicLatitude  0.815912
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.609636
		terraceProb     0.23034
		erosion         0
		montesMagn      0.482257
		montesFreq      1.86069
		montesSpiky     0.857333
		montesFraction  0.658028
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.280016
		hillsFraction   0.688198
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249745
		craterFreq      0.251432
		craterDensity   0.949045
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.207
		volcanoTemp     1452.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.268, 0.220, 0.000)
		colorShelf     (0.317, 0.276, 0.252, 0.000)
		colorBeach     (0.373, 0.324, 0.299, 0.000)
		colorDesert    (0.405, 0.347, 0.291, 0.000)
		colorLowland   (0.444, 0.371, 0.331, 0.000)
		colorUpland    (0.492, 0.450, 0.401, 0.000)
		colorRock      (0.532, 0.489, 0.433, 0.000)
		colorSnow      (0.579, 0.521, 0.457, 1.000)
		BumpHeight      10.4713
		BumpOffset      2.09426
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.759478
		Period          1.88721
		Eccentricity    0.064314
		Inclination     5.46264
		AscendingNode   -9.49374
		ArgOfPericenter 156.714
		MeanAnomaly     37.0902
	}
}

Asteroid	"S81"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.33542e-017
	Radius          0.0197461
	InertiaMoment   0.398824

	RotationPeriod  10007.4
	Obliquity       32.479
	EqAscendNode    226.899

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.575 0.547)

	Surface
	{
		SurfStyle       0.227507
		OceanStyle      0.0250406
		Randomize      (-0.947, 0.008, 0.608)
		colorDistMagn   0.355636
		colorDistFreq   2.67598e-007
		detailScale     0.539199
		colorConversion true
		snowLevel       2
		tropicLatitude  0.545906
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605161
		terraceProb     0.270255
		erosion         0
		montesMagn      0.540277
		montesFreq      2.56338
		montesSpiky     0.876312
		montesFraction  0.570529
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.56784e-007
		hillsFraction   0.529094
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248469
		craterFreq      0.248927
		craterDensity   0.927837
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   847.183
		volcanoTemp     1422.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.230, 0.219, 0.000)
		colorShelf     (0.270, 0.244, 0.233, 0.000)
		colorBeach     (0.285, 0.259, 0.246, 0.000)
		colorDesert    (0.301, 0.273, 0.260, 0.000)
		colorLowland   (0.317, 0.288, 0.274, 0.000)
		colorUpland    (0.333, 0.302, 0.287, 0.000)
		colorRock      (0.349, 0.316, 0.301, 0.000)
		colorSnow      (0.365, 0.331, 0.315, 1.000)
		BumpHeight      0.0177715
		BumpOffset      0.00355429
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.876576
		Period          2.34009
		Eccentricity    0.189308
		Inclination     -0.62113
		AscendingNode   167.924
		ArgOfPericenter -0.786337
		MeanAnomaly     71.5577
	}
}

Asteroid	"S82"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.96514e-014
	Radius          0.238573
	InertiaMoment   0.399782

	RotationPeriod  4421.26
	Obliquity       109.027
	EqAscendNode    53.6393

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.529 0.525 0.520)

	Surface
	{
		SurfStyle       0.73293
		OceanStyle      0.984865
		Randomize      (0.440, 0.410, -0.091)
		colorDistMagn   0.776436
		colorDistFreq   2.8718e-005
		detailScale     6.51464
		colorConversion true
		snowLevel       2
		tropicLatitude  0.948046
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.321598
		terraceProb     0.596869
		erosion         0
		montesMagn      0.518366
		montesFreq      4.15394
		montesSpiky     0.896119
		montesFraction  0.87155
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00015219
		hillsFraction   0.45851
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225329
		craterFreq      0.142664
		craterDensity   0.949212
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   266.828
		volcanoTemp     1599.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.179, 0.146, 0.000)
		colorShelf     (0.212, 0.184, 0.166, 0.000)
		colorBeach     (0.249, 0.215, 0.197, 0.000)
		colorDesert    (0.270, 0.231, 0.192, 0.000)
		colorLowland   (0.296, 0.247, 0.218, 0.000)
		colorUpland    (0.328, 0.299, 0.265, 0.000)
		colorRock      (0.354, 0.326, 0.286, 0.000)
		colorSnow      (0.386, 0.347, 0.301, 1.000)
		BumpHeight      0.214716
		BumpOffset      0.0429432
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.72004
		Period          1.74214
		Eccentricity    0.0130647
		Inclination     5.68838
		AscendingNode   -93.8372
		ArgOfPericenter -125.165
		MeanAnomaly     152.211
	}
}

Asteroid	"S83"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.89181e-011
	Radius          2.55463
	InertiaMoment   0.397794

	RotationPeriod  1219.58
	Obliquity       99.433
	EqAscendNode    234.493

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.496 0.492 0.490)

	Surface
	{
		SurfStyle       0.858733
		OceanStyle      0.0608844
		Randomize      (0.018, 0.012, -0.247)
		colorDistMagn   0.606919
		colorDistFreq   0.00475988
		detailScale     69.7583
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984744
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.725571
		terraceProb     0.261659
		erosion         0
		montesMagn      0.356645
		montesFreq      4.04063
		montesSpiky     0.817222
		montesFraction  0.687934
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00881501
		hillsFraction   0.568532
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247377
		craterFreq      0.177453
		craterDensity   0.827621
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   74.4815
		volcanoTemp     1727.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.172, 0.196, 0.050)
		colorShelf     (0.199, 0.202, 0.226, 0.040)
		colorBeach     (0.228, 0.231, 0.255, 0.030)
		colorDesert    (0.258, 0.261, 0.289, 0.020)
		colorLowland   (0.288, 0.291, 0.319, 0.030)
		colorUpland    (0.318, 0.320, 0.348, 0.050)
		colorRock      (0.347, 0.350, 0.387, 0.020)
		colorSnow      (0.347, 0.350, 0.387, 1.000)
		BumpHeight      2.29916
		BumpOffset      0.459833
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.790479
		Period          2.00394
		Eccentricity    0.101009
		Inclination     0.700726
		AscendingNode   -32.9335
		ArgOfPericenter 110.281
		MeanAnomaly     57.3022
	}
}

Asteroid	"S84"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.25544e-008
	Radius          30.8623
	InertiaMoment   0.399027

	RotationPeriod  390.807
	Obliquity       300.236
	EqAscendNode    247.89

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.722 0.631 0.507)

	Surface
	{
		SurfStyle       0.104649
		OceanStyle      0.594419
		Randomize      (0.710, 0.936, -0.139)
		colorDistMagn   0.407703
		colorDistFreq   0.284088
		detailScale     842.746
		colorConversion true
		snowLevel       2
		tropicLatitude  0.905607
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.371816
		terraceProb     0.324297
		erosion         0
		montesMagn      0.521563
		montesFreq      3.82389
		montesSpiky     0.882767
		montesFraction  0.549545
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.73435
		hillsFraction   0.634057
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227025
		craterFreq      0.21955
		craterDensity   0.899402
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.4564
		volcanoTemp     1509.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.252, 0.203, 0.000)
		colorShelf     (0.307, 0.268, 0.216, 0.000)
		colorBeach     (0.325, 0.284, 0.228, 0.000)
		colorDesert    (0.343, 0.300, 0.241, 0.000)
		colorLowland   (0.361, 0.315, 0.254, 0.000)
		colorUpland    (0.379, 0.331, 0.266, 0.000)
		colorRock      (0.397, 0.347, 0.279, 0.000)
		colorSnow      (0.415, 0.363, 0.292, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.849166
		Period          2.23119
		Eccentricity    0.16314
		Inclination     5.24564
		AscendingNode   168.283
		ArgOfPericenter -112.922
		MeanAnomaly     20.9371
	}
}

Asteroid	"S85"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.49299e-016
	Radius          0.0523819
	InertiaMoment   0.399959

	RotationPeriod  7705.74
	Obliquity       34.9823
	EqAscendNode    -27.4328

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.503 0.498 0.496)

	Surface
	{
		SurfStyle       0.360009
		OceanStyle      0.316291
		Randomize      (-0.953, 0.033, 0.752)
		colorDistMagn   0.282062
		colorDistFreq   2.02166e-006
		detailScale     1.43037
		colorConversion true
		snowLevel       2
		tropicLatitude  0.565448
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.521977
		terraceProb     0.229632
		erosion         0
		montesMagn      0.287132
		montesFreq      2.0958
		montesSpiky     0.927619
		montesFraction  0.517508
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.75812e-006
		hillsFraction   0.5082
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262446
		craterFreq      0.197481
		craterDensity   0.937797
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   520.147
		volcanoTemp     1619.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.199, 0.198, 0.000)
		colorShelf     (0.214, 0.212, 0.211, 0.000)
		colorBeach     (0.226, 0.224, 0.223, 0.000)
		colorDesert    (0.239, 0.236, 0.236, 0.000)
		colorLowland   (0.252, 0.249, 0.248, 0.000)
		colorUpland    (0.264, 0.261, 0.260, 0.000)
		colorRock      (0.277, 0.274, 0.273, 0.000)
		colorSnow      (0.289, 0.286, 0.285, 1.000)
		BumpHeight      0.0471437
		BumpOffset      0.00942873
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.759637
		Period          1.88781
		Eccentricity    0.0645095
		Inclination     3.58027
		AscendingNode   -101.363
		ArgOfPericenter -46.4077
		MeanAnomaly     86.7284
	}
}

Asteroid	"S86"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.66857e-013
	Radius          0.632883
	InertiaMoment   0.398093

	RotationPeriod  2572.18
	Obliquity       266.297
	EqAscendNode    198.058

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.478 0.475 0.472)

	Surface
	{
		SurfStyle       0.306169
		OceanStyle      0.345407
		Randomize      (0.377, -0.729, 0.422)
		colorDistMagn   0.165428
		colorDistFreq   0.000159314
		detailScale     17.2819
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998972
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.670909
		terraceProb     0.341355
		erosion         0
		montesMagn      0.392996
		montesFreq      3.59126
		montesSpiky     0.980502
		montesFraction  0.272967
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00075467
		hillsFraction   0.726263
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221539
		craterFreq      0.26975
		craterDensity   0.933845
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   163.825
		volcanoTemp     1802.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.190, 0.189, 0.000)
		colorShelf     (0.203, 0.202, 0.201, 0.000)
		colorBeach     (0.215, 0.214, 0.212, 0.000)
		colorDesert    (0.227, 0.226, 0.224, 0.000)
		colorLowland   (0.239, 0.237, 0.236, 0.000)
		colorUpland    (0.251, 0.249, 0.248, 0.000)
		colorRock      (0.263, 0.261, 0.260, 0.000)
		colorSnow      (0.275, 0.273, 0.272, 1.000)
		BumpHeight      0.569595
		BumpOffset      0.113919
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.823409
		Period          2.13045
		Eccentricity    0.136962
		Inclination     -1.10741
		AscendingNode   176.233
		ArgOfPericenter -81.8415
		MeanAnomaly     75.2906
	}
}

Asteroid	"S87"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.3985e-010
	Radius          6.77678
	InertiaMoment   0.399221

	RotationPeriod  759.609
	Obliquity       156.687
	EqAscendNode    157.97

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.615 0.612 0.610)

	Surface
	{
		SurfStyle       0.537686
		OceanStyle      0.165699
		Randomize      (-0.827, -0.698, -0.923)
		colorDistMagn   0.126759
		colorDistFreq   0.0356792
		detailScale     185.051
		colorConversion true
		snowLevel       2
		tropicLatitude  0.408079
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.758663
		terraceProb     0.285643
		erosion         0
		montesMagn      0.592009
		montesFreq      2.99192
		montesSpiky     0.795114
		montesFraction  0.401432
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.121383
		hillsFraction   0.788109
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231187
		craterFreq      0.259999
		craterDensity   0.82551
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   45.7291
		volcanoTemp     1380.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.208, 0.171, 0.000)
		colorShelf     (0.246, 0.214, 0.195, 0.000)
		colorBeach     (0.289, 0.251, 0.232, 0.000)
		colorDesert    (0.313, 0.269, 0.226, 0.000)
		colorLowland   (0.344, 0.288, 0.256, 0.000)
		colorUpland    (0.381, 0.349, 0.311, 0.000)
		colorRock      (0.412, 0.380, 0.336, 0.000)
		colorSnow      (0.449, 0.404, 0.354, 1.000)
		BumpHeight      6.0991
		BumpOffset      1.21982
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.773432
		Period          1.93946
		Eccentricity    0.0811955
		Inclination     -2.33845
		AscendingNode   -73.2863
		ArgOfPericenter -112.859
		MeanAnomaly     -143.827
	}
}

Asteroid	"S88"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            7.94419e-007
	Radius          81.8525
	InertiaMoment   0.396142

	RotationPeriod  240.285
	Obliquity       6.86127
	EqAscendNode    157.99

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.665 0.661)

	Surface
	{
		SurfStyle       0.859983
		OceanStyle      0.971983
		Randomize      (0.848, -0.186, 0.222)
		colorDistMagn   0.747358
		colorDistFreq   4.52614
		detailScale     2235.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.137429
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.59582
		terraceProb     0.353526
		erosion         0
		montesMagn      0.496653
		montesFreq      2.7401
		montesSpiky     0.866084
		montesFraction  0.66131
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.4489
		hillsFraction   0.676916
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242335
		craterFreq      0.234979
		craterDensity   0.868367
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   14.3984
		volcanoTemp     1402.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.233, 0.264, 0.050)
		colorShelf     (0.267, 0.273, 0.304, 0.040)
		colorBeach     (0.308, 0.312, 0.344, 0.030)
		colorDesert    (0.348, 0.352, 0.390, 0.020)
		colorLowland   (0.388, 0.392, 0.430, 0.030)
		colorUpland    (0.428, 0.432, 0.469, 0.050)
		colorRock      (0.468, 0.472, 0.522, 0.020)
		colorSnow      (0.468, 0.472, 0.522, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.807525
		Period          2.0691
		Eccentricity    0.119986
		Inclination     -1.0482
		AscendingNode   171.337
		ArgOfPericenter 126.011
		MeanAnomaly     -136.173
	}
}

Asteroid	"S89"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.654e-015
	Radius          0.138958
	InertiaMoment   0.398354

	RotationPeriod  5296.53
	Obliquity       60.908
	EqAscendNode    164.918

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.600 0.597 0.593)

	Surface
	{
		SurfStyle       0.839455
		OceanStyle      0.856997
		Randomize      (-0.991, -0.879, 0.170)
		colorDistMagn   0.524293
		colorDistFreq   1.48527e-005
		detailScale     3.79447
		colorConversion true
		snowLevel       2
		tropicLatitude  0.839371
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464333
		terraceProb     0.26183
		erosion         0
		montesMagn      0.339542
		montesFreq      2.75518
		montesSpiky     0.978887
		montesFraction  0.207339
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.27717e-005
		hillsFraction   0.79371
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27468
		craterFreq      0.201784
		craterDensity   1.06866
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   319.356
		volcanoTemp     1290.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.203, 0.166, 0.000)
		colorShelf     (0.240, 0.209, 0.190, 0.000)
		colorBeach     (0.282, 0.245, 0.225, 0.000)
		colorDesert    (0.306, 0.263, 0.219, 0.000)
		colorLowland   (0.336, 0.280, 0.249, 0.000)
		colorUpland    (0.372, 0.340, 0.302, 0.000)
		colorRock      (0.402, 0.370, 0.326, 0.000)
		colorSnow      (0.438, 0.394, 0.344, 1.000)
		BumpHeight      0.125062
		BumpOffset      0.0250124
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.71703
		Period          1.73123
		Eccentricity    0.00892144
		Inclination     3.83896
		AscendingNode   177.212
		ArgOfPericenter 88.9612
		MeanAnomaly     -38.8446
	}
}

Asteroid	"S90"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.84861e-012
	Radius          1.6789
	InertiaMoment   0.399408

	RotationPeriod  1663.57
	Obliquity       28.0813
	EqAscendNode    58.2571

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.424 0.416 0.412)

	Surface
	{
		SurfStyle       0.628044
		OceanStyle      0.882392
		Randomize      (0.688, -0.284, -0.625)
		colorDistMagn   0.0627725
		colorDistFreq   0.000935747
		detailScale     45.8451
		colorConversion true
		snowLevel       2
		tropicLatitude  0.461958
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.634536
		terraceProb     0.141975
		erosion         0
		montesMagn      0.514773
		montesFreq      2.89967
		montesSpiky     0.949714
		montesFraction  0.400728
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00656688
		hillsFraction   0.617275
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218241
		craterFreq      0.254095
		craterDensity   0.922204
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   100.584
		volcanoTemp     1899.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.141, 0.115, 0.000)
		colorShelf     (0.169, 0.145, 0.132, 0.000)
		colorBeach     (0.199, 0.170, 0.157, 0.000)
		colorDesert    (0.216, 0.183, 0.152, 0.000)
		colorLowland   (0.237, 0.195, 0.173, 0.000)
		colorUpland    (0.263, 0.237, 0.210, 0.000)
		colorRock      (0.284, 0.258, 0.227, 0.000)
		colorSnow      (0.309, 0.274, 0.239, 1.000)
		BumpHeight      1.51101
		BumpOffset      0.302201
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.742231
		Period          1.82329
		Eccentricity    0.0425713
		Inclination     1.67255
		AscendingNode   -111.328
		ArgOfPericenter 173.887
		MeanAnomaly     -171.306
	}
}

Asteroid	"S91"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.00781e-008
	Radius          17.9766
	InertiaMoment   0.396924

	RotationPeriod  467.881
	Obliquity       217.769
	EqAscendNode    77.3645

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.813 0.747 0.684)

	Surface
	{
		SurfStyle       0.161311
		OceanStyle      0.544033
		Randomize      (0.752, -0.057, -0.093)
		colorDistMagn   0.693233
		colorDistFreq   0.122861
		detailScale     490.88
		colorConversion true
		snowLevel       2
		tropicLatitude  0.6052
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.339898
		terraceProb     0.176166
		erosion         0
		montesMagn      0.430179
		montesFreq      3.48513
		montesSpiky     0.901556
		montesFraction  0.563846
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.816287
		hillsFraction   0.461797
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265728
		craterFreq      0.242041
		craterDensity   1.00471
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.0753
		volcanoTemp     1583.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.325, 0.299, 0.274, 0.000)
		colorShelf     (0.345, 0.317, 0.291, 0.000)
		colorBeach     (0.366, 0.336, 0.308, 0.000)
		colorDesert    (0.386, 0.355, 0.325, 0.000)
		colorLowland   (0.406, 0.373, 0.342, 0.000)
		colorUpland    (0.427, 0.392, 0.359, 0.000)
		colorRock      (0.447, 0.411, 0.376, 0.000)
		colorSnow      (0.467, 0.429, 0.394, 1.000)
		BumpHeight      16.1789
		BumpOffset      3.23578
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.767127
		Period          1.9158
		Eccentricity    0.0736437
		Inclination     3.84318
		AscendingNode   -100.334
		ArgOfPericenter -25.1212
		MeanAnomaly     -0.904324
	}
}

Asteroid	"S92"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.90409e-017
	Radius          0.0344252
	InertiaMoment   0.39859

	RotationPeriod  9324.91
	Obliquity       14.1128
	EqAscendNode    88.4577

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.776 0.698 0.670)

	Surface
	{
		SurfStyle       0.509619
		OceanStyle      0.245742
		Randomize      (-0.294, -0.463, 0.988)
		colorDistMagn   0.731633
		colorDistFreq   4.1185e-007
		detailScale     0.940036
		colorConversion true
		snowLevel       2
		tropicLatitude  0.244404
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533264
		terraceProb     0.416024
		erosion         0
		montesMagn      0.630118
		montesFreq      2.88195
		montesSpiky     0.987917
		montesFraction  0.506143
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.63096e-006
		hillsFraction   0.515736
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266874
		craterFreq      0.254903
		craterDensity   0.939695
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   702.434
		volcanoTemp     1500.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.237, 0.188, 0.000)
		colorShelf     (0.311, 0.244, 0.214, 0.000)
		colorBeach     (0.365, 0.286, 0.255, 0.000)
		colorDesert    (0.396, 0.307, 0.248, 0.000)
		colorLowland   (0.435, 0.328, 0.281, 0.000)
		colorUpland    (0.481, 0.398, 0.342, 0.000)
		colorRock      (0.520, 0.433, 0.369, 0.000)
		colorSnow      (0.567, 0.461, 0.389, 1.000)
		BumpHeight      0.0309826
		BumpOffset      0.00619653
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.796501
		Period          2.02688
		Eccentricity    0.107806
		Inclination     -0.344519
		AscendingNode   94.9526
		ArgOfPericenter -58.698
		MeanAnomaly     171.469
	}
}

Asteroid	"S93"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            8.6882e-014
	Radius          0.368623
	InertiaMoment   0.39959

	RotationPeriod  3134.55
	Obliquity       162.627
	EqAscendNode    16.0337

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.796 0.763 0.731)

	Surface
	{
		SurfStyle       0.835746
		OceanStyle      0.917287
		Randomize      (-0.910, -0.558, -0.090)
		colorDistMagn   0.440499
		colorDistFreq   9.70517e-005
		detailScale     10.0659
		colorConversion true
		snowLevel       2
		tropicLatitude  0.326769
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.463932
		terraceProb     0.526389
		erosion         0
		montesMagn      0.562568
		montesFreq      2.76375
		montesSpiky     0.900967
		montesFraction  0.610332
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00028156
		hillsFraction   0.710255
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261714
		craterFreq      0.269048
		craterDensity   0.78596
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   196.076
		volcanoTemp     1509.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.259, 0.205, 0.000)
		colorShelf     (0.318, 0.267, 0.234, 0.000)
		colorBeach     (0.374, 0.313, 0.278, 0.000)
		colorDesert    (0.406, 0.336, 0.271, 0.000)
		colorLowland   (0.446, 0.359, 0.307, 0.000)
		colorUpland    (0.493, 0.435, 0.373, 0.000)
		colorRock      (0.533, 0.473, 0.402, 0.000)
		colorSnow      (0.581, 0.503, 0.424, 1.000)
		BumpHeight      0.331761
		BumpOffset      0.0663522
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.762785
		Period          1.89955
		Eccentricity    0.0683708
		Inclination     -1.9015
		AscendingNode   -27.984
		ArgOfPericenter -77.322
		MeanAnomaly     -56.579
	}
}

Asteroid	"S94"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.27851e-010
	Radius          4.45371
	InertiaMoment   0.397404

	RotationPeriod  1009.92
	Obliquity       87.3353
	EqAscendNode    6.49378

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.772 0.769 0.768)

	Surface
	{
		SurfStyle       0.87842
		OceanStyle      0.587752
		Randomize      (-0.639, -0.329, 0.636)
		colorDistMagn   0.0769495
		colorDistFreq   0.00657123
		detailScale     121.616
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99986
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.56813
		terraceProb     0.299069
		erosion         0
		montesMagn      0.448945
		montesFreq      2.70332
		montesSpiky     0.916472
		montesFraction  0.28536
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0644599
		hillsFraction   0.576856
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259448
		craterFreq      0.240213
		craterDensity   0.830628
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   61.7555
		volcanoTemp     1233.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.269, 0.307, 0.050)
		colorShelf     (0.309, 0.315, 0.353, 0.040)
		colorBeach     (0.355, 0.362, 0.399, 0.030)
		colorDesert    (0.401, 0.408, 0.453, 0.020)
		colorLowland   (0.447, 0.454, 0.499, 0.030)
		colorUpland    (0.494, 0.500, 0.545, 0.050)
		colorRock      (0.540, 0.546, 0.607, 0.020)
		colorSnow      (0.540, 0.546, 0.607, 1.000)
		BumpHeight      4.00834
		BumpOffset      0.801668
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.834034
		Period          2.17182
		Eccentricity    0.147956
		Inclination     -4.48936
		AscendingNode   -143.767
		ArgOfPericenter 137.791
		MeanAnomaly     134.047
	}
}

Asteroid	"S95"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.8814e-007
	Radius          47.6816
	InertiaMoment   0.398808

	RotationPeriod  289.357
	Obliquity       276.876
	EqAscendNode    338.464

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.545 0.543 0.538)

	Surface
	{
		SurfStyle       0.416525
		OceanStyle      0.619833
		Randomize      (0.572, -0.708, -0.355)
		colorDistMagn   0.667647
		colorDistFreq   1.33625
		detailScale     1302.02
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991591
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.691929
		terraceProb     0.412336
		erosion         0
		montesMagn      0.424831
		montesFreq      2.25557
		montesSpiky     0.773816
		montesFraction  0.395114
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.14654
		hillsFraction   0.769072
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218101
		craterFreq      0.221313
		craterDensity   0.960069
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   17.2352
		volcanoTemp     1440.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.217, 0.215, 0.000)
		colorShelf     (0.232, 0.231, 0.229, 0.000)
		colorBeach     (0.245, 0.244, 0.242, 0.000)
		colorDesert    (0.259, 0.258, 0.255, 0.000)
		colorLowland   (0.273, 0.271, 0.269, 0.000)
		colorUpland    (0.286, 0.285, 0.282, 0.000)
		colorRock      (0.300, 0.298, 0.296, 0.000)
		colorSnow      (0.314, 0.312, 0.309, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.741276
		Period          1.81978
		Eccentricity    0.0413377
		Inclination     0.72018
		AscendingNode   -38.9816
		ArgOfPericenter -42.7033
		MeanAnomaly     159.982
	}
}

Asteroid	"S96"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.10219e-015
	Radius          0.0913224
	InertiaMoment   0.399768

	RotationPeriod  6527.39
	Obliquity       40.1197
	EqAscendNode    61.9614

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.540 0.536 0.529)

	Surface
	{
		SurfStyle       0.934418
		OceanStyle      0.613383
		Randomize      (0.796, 0.914, 0.402)
		colorDistMagn   0.335083
		colorDistFreq   3.84489e-006
		detailScale     2.49371
		colorConversion true
		snowLevel       2
		tropicLatitude  0.665309
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.551305
		terraceProb     0.392213
		erosion         0
		montesMagn      0.524098
		montesFreq      2.52461
		montesSpiky     0.975879
		montesFraction  0.511217
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.18523e-005
		hillsFraction   0.736773
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254498
		craterFreq      0.228762
		craterDensity   0.943291
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   431.275
		volcanoTemp     1258.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.188, 0.211, 0.050)
		colorShelf     (0.216, 0.220, 0.243, 0.040)
		colorBeach     (0.248, 0.252, 0.275, 0.030)
		colorDesert    (0.281, 0.284, 0.312, 0.020)
		colorLowland   (0.313, 0.316, 0.344, 0.030)
		colorUpland    (0.345, 0.348, 0.375, 0.050)
		colorRock      (0.378, 0.380, 0.418, 0.020)
		colorSnow      (0.378, 0.380, 0.418, 1.000)
		BumpHeight      0.0821901
		BumpOffset      0.016438
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.759235
		Period          1.88631
		Eccentricity    0.0640138
		Inclination     2.86984
		AscendingNode   -57.8403
		ArgOfPericenter -44.0678
		MeanAnomaly     -48.9665
	}
}

Asteroid	"S97"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.62194e-012
	Radius          0.977876
	InertiaMoment   0.397769

	RotationPeriod  1935.7
	Obliquity       258.932
	EqAscendNode    262.183

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.493 0.450 0.392)

	Surface
	{
		SurfStyle       0.950598
		OceanStyle      0.113271
		Randomize      (-0.491, 0.914, 0.891)
		colorDistMagn   0.628919
		colorDistFreq   0.000455944
		detailScale     26.7025
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985461
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.458844
		terraceProb     0.312618
		erosion         0
		montesMagn      0.535961
		montesFreq      2.17184
		montesSpiky     0.971603
		montesFraction  0.717925
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00198433
		hillsFraction   0.619706
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218559
		craterFreq      0.250584
		craterDensity   0.867566
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   120.385
		volcanoTemp     1808.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.157, 0.157, 0.050)
		colorShelf     (0.197, 0.184, 0.180, 0.040)
		colorBeach     (0.227, 0.211, 0.204, 0.030)
		colorDesert    (0.257, 0.238, 0.231, 0.020)
		colorLowland   (0.286, 0.265, 0.255, 0.030)
		colorUpland    (0.316, 0.292, 0.278, 0.050)
		colorRock      (0.345, 0.319, 0.309, 0.020)
		colorSnow      (0.345, 0.319, 0.309, 1.000)
		BumpHeight      0.880088
		BumpOffset      0.176018
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.797005
		Period          2.0288
		Eccentricity    0.108371
		Inclination     2.48545
		AscendingNode   59.0525
		ArgOfPericenter 80.0012
		MeanAnomaly     15.8222
	}
}

Asteroid	"S98"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.38677e-009
	Radius          11.8144
	InertiaMoment   0.399012

	RotationPeriod  629.286
	Obliquity       144.631
	EqAscendNode    273.61

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.556 0.553 0.552)

	Surface
	{
		SurfStyle       0.904554
		OceanStyle      0.338511
		Randomize      (0.626, -0.782, -0.923)
		colorDistMagn   0.177495
		colorDistFreq   0.0490292
		detailScale     322.613
		colorConversion true
		snowLevel       2
		tropicLatitude  0.56346
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.294604
		terraceProb     0.252072
		erosion         0
		montesMagn      0.414382
		montesFreq      2.09923
		montesSpiky     0.805967
		montesFraction  0.393927
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.265755
		hillsFraction   0.378708
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259449
		craterFreq      0.234895
		craterDensity   0.871473
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.9153
		volcanoTemp     1559.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.194, 0.221, 0.050)
		colorShelf     (0.222, 0.227, 0.254, 0.040)
		colorBeach     (0.256, 0.260, 0.287, 0.030)
		colorDesert    (0.289, 0.293, 0.325, 0.020)
		colorLowland   (0.323, 0.326, 0.359, 0.030)
		colorUpland    (0.356, 0.359, 0.392, 0.050)
		colorRock      (0.389, 0.393, 0.436, 0.020)
		colorSnow      (0.389, 0.393, 0.436, 1.000)
		BumpHeight      10.633
		BumpOffset      2.1266
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.802465
		Period          2.04969
		Eccentricity    0.114437
		Inclination     3.54174
		AscendingNode   69.9548
		ArgOfPericenter 99.8648
		MeanAnomaly     76.2386
	}
}

Asteroid	"S99"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.39826e-017
	Radius          0.020051
	InertiaMoment   0.399945

	RotationPeriod  10529.8
	Obliquity       64.4661
	EqAscendNode    153.167

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.420 0.414 0.409)

	Surface
	{
		SurfStyle       0.448211
		OceanStyle      0.424899
		Randomize      (0.155, 0.198, 0.241)
		colorDistMagn   0.522926
		colorDistFreq   1.13924e-007
		detailScale     0.547526
		colorConversion true
		snowLevel       2
		tropicLatitude  0.897997
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.64671
		terraceProb     0.225852
		erosion         0
		montesMagn      0.462051
		montesFreq      2.44493
		montesSpiky     0.891112
		montesFraction  0.746436
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.4406e-007
		hillsFraction   0.644766
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241063
		craterFreq      0.183772
		craterDensity   0.87676
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   840.715
		volcanoTemp     1816.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.166, 0.164, 0.000)
		colorShelf     (0.179, 0.176, 0.174, 0.000)
		colorBeach     (0.189, 0.186, 0.184, 0.000)
		colorDesert    (0.200, 0.197, 0.194, 0.000)
		colorLowland   (0.210, 0.207, 0.204, 0.000)
		colorUpland    (0.221, 0.217, 0.215, 0.000)
		colorRock      (0.231, 0.228, 0.225, 0.000)
		colorSnow      (0.242, 0.238, 0.235, 1.000)
		BumpHeight      0.0180459
		BumpOffset      0.00360918
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.809467
		Period          2.07657
		Eccentricity    0.122097
		Inclination     0.920148
		AscendingNode   128.452
		ArgOfPericenter 63.7402
		MeanAnomaly     -55.8843
	}
}

Asteroid	"S100"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.05761e-014
	Radius          0.242258
	InertiaMoment   0.398071

	RotationPeriod  4250.59
	Obliquity       82.4028
	EqAscendNode    193.094

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.616 0.611 0.608)

	Surface
	{
		SurfStyle       0.324392
		OceanStyle      0.984856
		Randomize      (-0.795, -0.665, -0.567)
		colorDistMagn   0.882944
		colorDistFreq   1.08085e-005
		detailScale     6.61526
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993645
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.514081
		terraceProb     0.228298
		erosion         0
		montesMagn      0.388758
		montesFreq      3.9507
		montesSpiky     0.884619
		montesFraction  0.384095
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000104027
		hillsFraction   0.774605
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206432
		craterFreq      0.204433
		craterDensity   0.896046
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   264.791
		volcanoTemp     1472.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.245, 0.243, 0.000)
		colorShelf     (0.262, 0.260, 0.258, 0.000)
		colorBeach     (0.277, 0.275, 0.274, 0.000)
		colorDesert    (0.292, 0.290, 0.289, 0.000)
		colorLowland   (0.308, 0.306, 0.304, 0.000)
		colorUpland    (0.323, 0.321, 0.319, 0.000)
		colorRock      (0.339, 0.336, 0.334, 0.000)
		colorSnow      (0.354, 0.352, 0.350, 1.000)
		BumpHeight      0.218032
		BumpOffset      0.0436065
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.74071
		Period          1.81769
		Eccentricity    0.0406054
		Inclination     -1.265
		AscendingNode   153.69
		ArgOfPericenter 54.9009
		MeanAnomaly     -59.5688
	}
}

Comet	"C1"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.34075e-017
	Radius          0.039066
	InertiaMoment   0.397748

	Oblateness      0.00977232

	RotationPeriod  49.6862
	Obliquity       206.256
	EqAscendNode    270.532

	AbsMagn         5.26625
	SlopeParam      4.45005
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.594 0.589 0.586)

	Surface
	{
		SurfStyle       0.540595
		OceanStyle      0.325559
		Randomize      (0.172, -0.093, 0.936)
		colorDistMagn   0.312891
		colorDistFreq   5.04346e-007
		detailScale     1.06676
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994834
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.268758
		terraceProb     0.572512
		erosion         0
		montesMagn      0.392824
		montesFreq      2.83662
		montesSpiky     0.881779
		montesFraction  0.681747
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.20726e-006
		hillsFraction   0.497474
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22045
		craterFreq      0.200389
		craterDensity   0.928613
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1265.98
		volcanoTemp     1297.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.200, 0.164, 0.000)
		colorShelf     (0.238, 0.206, 0.188, 0.000)
		colorBeach     (0.279, 0.241, 0.223, 0.000)
		colorDesert    (0.303, 0.259, 0.217, 0.000)
		colorLowland   (0.333, 0.277, 0.246, 0.000)
		colorUpland    (0.368, 0.336, 0.299, 0.000)
		colorRock      (0.398, 0.365, 0.322, 0.000)
		colorSnow      (0.434, 0.389, 0.340, 1.000)
		BumpHeight      0.0351594
		BumpOffset      0.00703187
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00142341
		DustBright  0.241522
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.38888
		Period          10.5278
		Eccentricity    0.94329
		Inclination     -69.5778
		AscendingNode   -178.518
		ArgOfPericenter -97.5109
		MeanAnomaly     -45.8243
	}
}

Comet	"C2"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.8104e-013
	Radius          0.846586
	InertiaMoment   0.399606

	Oblateness      0.013946

	RotationPeriod  47.8764
	Obliquity       159.462
	EqAscendNode    255.109

	AbsMagn         6.77145
	SlopeParam      3.442
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.784 0.672 0.626)

	Surface
	{
		SurfStyle       0.532194
		OceanStyle      0.284781
		Randomize      (0.051, 0.763, -0.114)
		colorDistMagn   0.991158
		colorDistFreq   0.000519437
		detailScale     23.1174
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998601
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.422305
		terraceProb     0.205441
		erosion         0
		montesMagn      0.537127
		montesFreq      3.36222
		montesSpiky     0.979955
		montesFraction  0.490151
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00113472
		hillsFraction   0.822155
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205277
		craterFreq      0.193358
		craterDensity   0.887822
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   311.953
		volcanoTemp     1318.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.228, 0.175, 0.000)
		colorShelf     (0.314, 0.235, 0.200, 0.000)
		colorBeach     (0.369, 0.275, 0.238, 0.000)
		colorDesert    (0.400, 0.295, 0.232, 0.000)
		colorLowland   (0.439, 0.316, 0.263, 0.000)
		colorUpland    (0.486, 0.383, 0.319, 0.000)
		colorRock      (0.525, 0.416, 0.345, 0.000)
		colorSnow      (0.572, 0.443, 0.363, 1.000)
		BumpHeight      0.761927
		BumpOffset      0.152385
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.2894
		GasToDust   0.25
		Particles   1564
		GasBright   0.0472134
		DustBright  0.680218
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.19647
		Period          9.28191
		Eccentricity    0.988906
		Inclination     74.505
		AscendingNode   125.704
		ArgOfPericenter -82.7689
		MeanAnomaly     73.6167
	}
}

Comet	"C3"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.40022e-009
	Radius          15.2673
	InertiaMoment   0.398412

	Oblateness      0.0113719

	RotationPeriod  46.0663
	Obliquity       112.668
	EqAscendNode    239.687

	AbsMagn         8.11606
	SlopeParam      2.25321
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.516 0.388 0.308)

	Surface
	{
		SurfStyle       0.663236
		OceanStyle      0.519841
		Randomize      (0.145, 0.616, 0.726)
		colorDistMagn   0.327646
		colorDistFreq   0.155832
		detailScale     416.899
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988641
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423849
		terraceProb     0.29666
		erosion         0
		montesMagn      0.52612
		montesFreq      3.69903
		montesSpiky     0.973542
		montesFraction  0.315955
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.736793
		hillsFraction   0.773799
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250533
		craterFreq      0.222197
		craterDensity   1.00264
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.9691
		volcanoTemp     1681.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.132, 0.086, 0.000)
		colorShelf     (0.206, 0.136, 0.099, 0.000)
		colorBeach     (0.242, 0.159, 0.117, 0.000)
		colorDesert    (0.263, 0.171, 0.114, 0.000)
		colorLowland   (0.289, 0.182, 0.129, 0.000)
		colorUpland    (0.320, 0.221, 0.157, 0.000)
		colorRock      (0.346, 0.240, 0.169, 0.000)
		colorSnow      (0.377, 0.256, 0.179, 1.000)
		BumpHeight      13.7406
		BumpOffset      2.74811
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.770592
		GasToDust   0.25
		Particles   2536
		GasBright   0.051057
		DustBright  0.360861
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.9897
		Period          14.7397
		Eccentricity    0.959395
		Inclination     128.621
		AscendingNode   -57.1709
		ArgOfPericenter 15.0828
		MeanAnomaly     175.882
	}
}

Comet	"C4"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.31137e-017
	Radius          0.0524199
	InertiaMoment   0.394893

	Oblateness      0.0159882

	RotationPeriod  44.2514
	Obliquity       65.8735
	EqAscendNode    224.264

	AbsMagn         9.47431
	SlopeParam      5.93754
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.594 0.591 0.590)

	Surface
	{
		SurfStyle       0.57036
		OceanStyle      0.16775
		Randomize      (-0.855, 0.340, 0.839)
		colorDistMagn   0.656584
		colorDistFreq   9.35622e-007
		detailScale     1.43141
		colorConversion true
		snowLevel       2
		tropicLatitude  0.954155
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605602
		terraceProb     0.166653
		erosion         0
		montesMagn      0.629304
		montesFreq      2.84498
		montesSpiky     0.901474
		montesFraction  0.352875
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.60377e-006
		hillsFraction   0.648919
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22525
		craterFreq      0.201837
		craterDensity   0.931433
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1251.68
		volcanoTemp     1589.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.201, 0.165, 0.000)
		colorShelf     (0.238, 0.207, 0.189, 0.000)
		colorBeach     (0.279, 0.242, 0.224, 0.000)
		colorDesert    (0.303, 0.260, 0.218, 0.000)
		colorLowland   (0.333, 0.278, 0.248, 0.000)
		colorUpland    (0.368, 0.337, 0.301, 0.000)
		colorRock      (0.398, 0.366, 0.324, 0.000)
		colorSnow      (0.433, 0.390, 0.342, 1.000)
		BumpHeight      0.0471779
		BumpOffset      0.00943558
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.164037
		DustBright  0.732367
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.34922
		Period          10.2668
		Eccentricity    0.923179
		Inclination     -14.8568
		AscendingNode   114.16
		ArgOfPericenter 51.5032
		MeanAnomaly     145.329
	}
}

Comet	"C5"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.33454e-013
	Radius          0.945636
	InertiaMoment   0.398934

	Oblateness      0.0134035

	RotationPeriod  42.4268
	Obliquity       19.0792
	EqAscendNode    208.841

	AbsMagn         11.0348
	SlopeParam      4.68904
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.635 0.503 0.440)

	Surface
	{
		SurfStyle       0.8342
		OceanStyle      0.439068
		Randomize      (0.395, 0.385, 0.618)
		colorDistMagn   0.43485
		colorDistFreq   0.000365061
		detailScale     25.8222
		colorConversion true
		snowLevel       2
		tropicLatitude  0.843721
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.507409
		terraceProb     0.168258
		erosion         0
		montesMagn      0.425524
		montesFreq      3.01871
		montesSpiky     0.850942
		montesFraction  0.552786
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0018689
		hillsFraction   0.482433
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230886
		craterFreq      0.225191
		craterDensity   0.971524
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   256.751
		volcanoTemp     1630.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.171, 0.123, 0.000)
		colorShelf     (0.254, 0.176, 0.141, 0.000)
		colorBeach     (0.299, 0.206, 0.167, 0.000)
		colorDesert    (0.324, 0.221, 0.163, 0.000)
		colorLowland   (0.356, 0.236, 0.185, 0.000)
		colorUpland    (0.394, 0.287, 0.224, 0.000)
		colorRock      (0.426, 0.312, 0.242, 0.000)
		colorSnow      (0.464, 0.332, 0.255, 1.000)
		BumpHeight      0.851072
		BumpOffset      0.170214
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.322226
		GasToDust   0.25
		Particles   1630
		GasBright   0.140599
		DustBright  0.440292
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.31109
		Period          17.1792
		Eccentricity    0.951999
		Inclination     117.341
		AscendingNode   -69.2808
		ArgOfPericenter 2.92816
		MeanAnomaly     48.9426
	}
}

Comet	"C6"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.57902e-009
	Radius          20.4798
	InertiaMoment   0.397304

	Oblateness      0.0191179

	RotationPeriod  40.5878
	Obliquity       332.285
	EqAscendNode    193.419

	AbsMagn         13.3187
	SlopeParam      3.67712
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.532 0.528 0.520)

	Surface
	{
		SurfStyle       0.979211
		OceanStyle      0.0707754
		Randomize      (0.396, 0.074, 0.300)
		colorDistMagn   0.438766
		colorDistFreq   0.203133
		detailScale     559.236
		colorConversion true
		snowLevel       2
		tropicLatitude  0.589323
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.349296
		terraceProb     0.697652
		erosion         0
		montesMagn      0.654691
		montesFreq      2.86133
		montesSpiky     0.869829
		montesFraction  0.541746
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.787144
		hillsFraction   0.590324
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253361
		craterFreq      0.192678
		craterDensity   1.02025
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.2274
		volcanoTemp     1575.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.185, 0.208, 0.050)
		colorShelf     (0.213, 0.216, 0.239, 0.040)
		colorBeach     (0.245, 0.248, 0.270, 0.030)
		colorDesert    (0.277, 0.280, 0.307, 0.020)
		colorLowland   (0.308, 0.311, 0.338, 0.030)
		colorUpland    (0.340, 0.343, 0.369, 0.050)
		colorRock      (0.372, 0.375, 0.411, 0.020)
		colorSnow      (0.372, 0.375, 0.411, 1.000)
		BumpHeight      18.4319
		BumpOffset      3.68637
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.803417
		GasToDust   0.25
		Particles   2602
		GasBright   0.0799013
		DustBright  0.185476
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.73348
		Period          12.8861
		Eccentricity    0.956936
		Inclination     61.6216
		AscendingNode   -18.8956
		ArgOfPericenter 32.6234
		MeanAnomaly     81.1625
	}
}

Comet	"C7"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            7.94101e-017
	Radius          0.0585712
	InertiaMoment   0.399392

	Oblateness      0.016077

	RotationPeriod  38.7292
	Obliquity       285.491
	EqAscendNode    177.996

	AbsMagn         1.33978
	SlopeParam      2.56786
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.589 0.485 0.377)

	Surface
	{
		SurfStyle       0.0237188
		OceanStyle      0.775397
		Randomize      (0.668, 0.447, 0.510)
		colorDistMagn   0.669104
		colorDistFreq   1.02645e-006
		detailScale     1.59938
		colorConversion true
		snowLevel       2
		tropicLatitude  0.527026
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443652
		terraceProb     0.162079
		erosion         0
		montesMagn      0.557453
		montesFreq      3.20431
		montesSpiky     0.869935
		montesFraction  0.765073
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.6474e-006
		hillsFraction   0.649655
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.284812
		craterFreq      0.265597
		craterDensity   0.848716
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1030.51
		volcanoTemp     1505.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.194, 0.151, 0.000)
		colorShelf     (0.250, 0.206, 0.160, 0.000)
		colorBeach     (0.265, 0.218, 0.170, 0.000)
		colorDesert    (0.280, 0.230, 0.179, 0.000)
		colorLowland   (0.295, 0.243, 0.188, 0.000)
		colorUpland    (0.309, 0.255, 0.198, 0.000)
		colorRock      (0.324, 0.267, 0.207, 0.000)
		colorSnow      (0.339, 0.279, 0.217, 1.000)
		BumpHeight      0.0527141
		BumpOffset      0.0105428
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.270049
		DustBright  0.479815
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.67019
		Period          12.4412
		Eccentricity    0.912712
		Inclination     -105.975
		AscendingNode   -175.307
		ArgOfPericenter 66.106
		MeanAnomaly     73.1217
	}
}

Comet	"C8"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.14179e-013
	Radius          1.26813
	InertiaMoment   0.39811

	Oblateness      0.0231976

	RotationPeriod  36.8455
	Obliquity       238.696
	EqAscendNode    162.574

	AbsMagn         4.3409
	SlopeParam      6.34419
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.664 0.657 0.654)

	Surface
	{
		SurfStyle       0.0472161
		OceanStyle      0.643466
		Randomize      (-0.472, 0.513, 0.527)
		colorDistMagn   0.691568
		colorDistFreq   0.00106398
		detailScale     34.6283
		colorConversion true
		snowLevel       2
		tropicLatitude  0.815599
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.597009
		terraceProb     0.345531
		erosion         0
		montesMagn      0.436447
		montesFreq      3.24413
		montesSpiky     0.706837
		montesFraction  0.608766
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00429694
		hillsFraction   0.630115
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269473
		craterFreq      0.165396
		craterDensity   0.961541
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   253.701
		volcanoTemp     1262.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.263, 0.262, 0.000)
		colorShelf     (0.282, 0.279, 0.278, 0.000)
		colorBeach     (0.299, 0.296, 0.294, 0.000)
		colorDesert    (0.315, 0.312, 0.311, 0.000)
		colorLowland   (0.332, 0.328, 0.327, 0.000)
		colorUpland    (0.348, 0.345, 0.343, 0.000)
		colorRock      (0.365, 0.361, 0.360, 0.000)
		colorSnow      (0.382, 0.378, 0.376, 1.000)
		BumpHeight      1.14132
		BumpOffset      0.228263
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.355051
		GasToDust   0.25
		Particles   1697
		GasBright   0.182069
		DustBright  0.252282
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.91349
		Period          14.1797
		Eccentricity    0.939971
		Inclination     -175.895
		AscendingNode   170.825
		ArgOfPericenter 164.263
		MeanAnomaly     -168.072
	}
}

Comet	"C9"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.75024e-009
	Radius          22.8898
	InertiaMoment   0.39982

	Oblateness      0.0197513

	RotationPeriod  34.9308
	Obliquity       191.902
	EqAscendNode    147.151

	AbsMagn         6.04331
	SlopeParam      4.93832
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.669 0.662 0.659)

	Surface
	{
		SurfStyle       0.545823
		OceanStyle      0.0447416
		Randomize      (0.530, 0.661, 0.962)
		colorDistMagn   0.698582
		colorDistFreq   0.27428
		detailScale     625.044
		colorConversion true
		snowLevel       2
		tropicLatitude  0.707967
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.569552
		terraceProb     0.404694
		erosion         0
		montesMagn      0.639013
		montesFreq      3.54732
		montesSpiky     0.89596
		montesFraction  0.497643
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.09104
		hillsFraction   0.56144
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23169
		craterFreq      0.190071
		craterDensity   0.920263
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   52.0703
		volcanoTemp     1630.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.225, 0.185, 0.000)
		colorShelf     (0.268, 0.232, 0.211, 0.000)
		colorBeach     (0.315, 0.272, 0.251, 0.000)
		colorDesert    (0.341, 0.291, 0.244, 0.000)
		colorLowland   (0.375, 0.311, 0.277, 0.000)
		colorUpland    (0.415, 0.378, 0.336, 0.000)
		colorRock      (0.449, 0.411, 0.363, 0.000)
		colorSnow      (0.489, 0.437, 0.382, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.836243
		GasToDust   0.25
		Particles   2669
		GasBright   0.439407
		DustBright  0.47943
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.25273
		Period          16.7271
		Eccentricity    0.940924
		Inclination     -40.687
		AscendingNode   -105.413
		ArgOfPericenter -167.712
		MeanAnomaly     -134.393
	}
}

Comet	"C10"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.46263e-016
	Radius          0.0785244
	InertiaMoment   0.398688

	Oblateness      0.028932

	RotationPeriod  32.9784
	Obliquity       145.108
	EqAscendNode    131.728

	AbsMagn         7.44237
	SlopeParam      3.90784
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.474 0.470 0.465)

	Surface
	{
		SurfStyle       0.0123993
		OceanStyle      0.216945
		Randomize      (0.382, 0.231, 0.125)
		colorDistMagn   0.643946
		colorDistFreq   1.4716e-006
		detailScale     2.14424
		colorConversion true
		snowLevel       2
		tropicLatitude  0.80118
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.634613
		terraceProb     0.146085
		erosion         0
		montesMagn      0.508007
		montesFreq      3.59573
		montesSpiky     0.960394
		montesFraction  0.0957536
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.75206e-005
		hillsFraction   0.626777
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22759
		craterFreq      0.236581
		craterDensity   0.920785
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1017.99
		volcanoTemp     1599.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.188, 0.186, 0.000)
		colorShelf     (0.201, 0.200, 0.198, 0.000)
		colorBeach     (0.213, 0.212, 0.209, 0.000)
		colorDesert    (0.225, 0.223, 0.221, 0.000)
		colorLowland   (0.237, 0.235, 0.232, 0.000)
		colorUpland    (0.249, 0.247, 0.244, 0.000)
		colorRock      (0.261, 0.259, 0.256, 0.000)
		colorSnow      (0.272, 0.270, 0.267, 1.000)
		BumpHeight      0.070672
		BumpOffset      0.0141344
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0224836
		DustBright  0.58084
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.68231
		Period          12.526
		Eccentricity    0.957633
		Inclination     -136.977
		AscendingNode   -90.1804
		ArgOfPericenter -107.435
		MeanAnomaly     -20.6653
	}
}

Comet	"C11"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.13124e-012
	Radius          1.41774
	InertiaMoment   0.396663

	Oblateness      0.0247581

	RotationPeriod  30.9807
	Obliquity       98.3134
	EqAscendNode    116.306

	AbsMagn         8.77453
	SlopeParam      2.85047
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.651 0.554 0.490)

	Surface
	{
		SurfStyle       0.657695
		OceanStyle      0.779712
		Randomize      (-0.343, 0.994, -0.266)
		colorDistMagn   0.901375
		colorDistFreq   0.000771514
		detailScale     38.7139
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993992
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.69934
		terraceProb     0.290201
		erosion         0
		montesMagn      0.367137
		montesFreq      3.17362
		montesSpiky     0.865976
		montesFraction  0.481262
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00554316
		hillsFraction   0.751643
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270136
		craterFreq      0.237522
		craterDensity   0.897807
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   208.99
		volcanoTemp     1707.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.188, 0.137, 0.000)
		colorShelf     (0.261, 0.194, 0.157, 0.000)
		colorBeach     (0.306, 0.227, 0.186, 0.000)
		colorDesert    (0.332, 0.244, 0.181, 0.000)
		colorLowland   (0.365, 0.260, 0.206, 0.000)
		colorUpland    (0.404, 0.316, 0.250, 0.000)
		colorRock      (0.436, 0.344, 0.269, 0.000)
		colorSnow      (0.475, 0.366, 0.284, 1.000)
		BumpHeight      1.27597
		BumpOffset      0.255194
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.387877
		GasToDust   0.25
		Particles   1763
		GasBright   0.0277195
		DustBright  0.260091
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.94566
		Period          14.4153
		Eccentricity    0.948848
		Inclination     139.305
		AscendingNode   89.9842
		ArgOfPericenter -160.375
		MeanAnomaly     158.587
	}
}

Comet	"C12"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            8.74933e-009
	Radius          30.6798
	InertiaMoment   0.399172

	Oblateness      0.0375539

	RotationPeriod  28.9292
	Obliquity       51.5191
	EqAscendNode    100.883

	AbsMagn         10.2015
	SlopeParam      6.88149
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.490 0.485 0.481)

	Surface
	{
		SurfStyle       0.0544174
		OceanStyle      0.387353
		Randomize      (-0.032, 0.996, -0.147)
		colorDistMagn   0.0468262
		colorDistFreq   0.682083
		detailScale     837.762
		colorConversion true
		snowLevel       2
		tropicLatitude  0.65549
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.274558
		terraceProb     0.275685
		erosion         0
		montesMagn      0.483361
		montesFreq      2.68756
		montesSpiky     0.938468
		montesFraction  0.45958
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.7663
		hillsFraction   0.651993
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205616
		craterFreq      0.213458
		craterDensity   0.796608
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.4245
		volcanoTemp     1360.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.194, 0.192, 0.000)
		colorShelf     (0.208, 0.206, 0.204, 0.000)
		colorBeach     (0.220, 0.218, 0.216, 0.000)
		colorDesert    (0.233, 0.230, 0.228, 0.000)
		colorLowland   (0.245, 0.242, 0.240, 0.000)
		colorUpland    (0.257, 0.254, 0.253, 0.000)
		colorRock      (0.269, 0.267, 0.265, 0.000)
		colorSnow      (0.281, 0.279, 0.277, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.869069
		GasToDust   0.25
		Particles   2735
		GasBright   0.119982
		DustBright  0.652316
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.8113
		Period          13.4403
		Eccentricity    0.953833
		Inclination     87.5893
		AscendingNode   -2.50267
		ArgOfPericenter -114.711
		MeanAnomaly     -35.1775
	}
}

Comet	"C13"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.69399e-016
	Radius          0.0878117
	InertiaMoment   0.397758

	Oblateness      0.0331124

	RotationPeriod  26.8138
	Obliquity       4.72485
	EqAscendNode    85.4607

	AbsMagn         11.9972
	SlopeParam      5.20316
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.689 0.687)

	Surface
	{
		SurfStyle       0.940099
		OceanStyle      0.493813
		Randomize      (-0.247, -0.594, 0.515)
		colorDistMagn   0.687431
		colorDistFreq   2.51197e-006
		detailScale     2.39784
		colorConversion true
		snowLevel       2
		tropicLatitude  0.678203
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.650345
		terraceProb     0.143682
		erosion         0
		montesMagn      0.421188
		montesFreq      2.26722
		montesSpiky     0.968872
		montesFraction  0.531141
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.5441e-005
		hillsFraction   0.72326
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24496
		craterFreq      0.155722
		craterDensity   1.02262
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   838.804
		volcanoTemp     1958.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.241, 0.275, 0.050)
		colorShelf     (0.277, 0.283, 0.316, 0.040)
		colorBeach     (0.319, 0.324, 0.357, 0.030)
		colorDesert    (0.360, 0.365, 0.405, 0.020)
		colorLowland   (0.402, 0.407, 0.446, 0.030)
		colorUpland    (0.443, 0.448, 0.488, 0.050)
		colorRock      (0.485, 0.489, 0.543, 0.020)
		colorSnow      (0.485, 0.489, 0.543, 1.000)
		BumpHeight      0.0790305
		BumpOffset      0.0158061
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0979354
		DustBright  0.358848
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.21885
		Period          9.42413
		Eccentricity    0.92716
		Inclination     -39.6696
		AscendingNode   -127.828
		ArgOfPericenter 72.1427
		MeanAnomaly     -40.666
	}
}

Comet	"C14"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.08361e-012
	Radius          1.89978
	InertiaMoment   0.399611

	Oblateness      0.0517722

	RotationPeriod  24.6224
	Obliquity       317.931
	EqAscendNode    70.0381

	AbsMagn         15.732
	SlopeParam      4.13734
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.617 0.518 0.459)

	Surface
	{
		SurfStyle       0.738065
		OceanStyle      0.241382
		Randomize      (-0.966, -0.985, -0.016)
		colorDistMagn   0.693242
		colorDistFreq   0.00308109
		detailScale     51.8767
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982971
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.688086
		terraceProb     0.458028
		erosion         0
		montesMagn      0.472922
		montesFreq      2.68498
		montesSpiky     0.918196
		montesFraction  0.130027
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00892551
		hillsFraction   0.492205
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21452
		craterFreq      0.190209
		craterDensity   0.775064
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   206.349
		volcanoTemp     1498.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.176, 0.128, 0.000)
		colorShelf     (0.247, 0.181, 0.147, 0.000)
		colorBeach     (0.290, 0.213, 0.174, 0.000)
		colorDesert    (0.315, 0.228, 0.170, 0.000)
		colorLowland   (0.345, 0.244, 0.193, 0.000)
		colorUpland    (0.382, 0.295, 0.234, 0.000)
		colorRock      (0.413, 0.321, 0.252, 0.000)
		colorSnow      (0.450, 0.342, 0.266, 1.000)
		BumpHeight      1.7098
		BumpOffset      0.341961
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.420703
		GasToDust   0.25
		Particles   1829
		GasBright   0.257388
		DustBright  0.683883
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.91042
		Period          14.1574
		Eccentricity    0.986256
		Inclination     -113.187
		AscendingNode   -140.616
		ArgOfPericenter 83.447
		MeanAnomaly     120.888
	}
}

Comet	"C15"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.61152e-008
	Radius          34.3166
	InertiaMoment   0.398419

	Oblateness      0.047709

	RotationPeriod  22.3408
	Obliquity       271.136
	EqAscendNode    54.6155

	AbsMagn         3.16012
	SlopeParam      3.11175
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.562 0.557 0.555)

	Surface
	{
		SurfStyle       0.865275
		OceanStyle      0.887233
		Randomize      (0.686, 0.938, -0.555)
		colorDistMagn   0.618902
		colorDistFreq   0.546407
		detailScale     937.072
		colorConversion true
		snowLevel       2
		tropicLatitude  0.927168
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.590305
		terraceProb     0.334943
		erosion         0
		montesMagn      0.411157
		montesFreq      2.5814
		montesSpiky     0.93157
		montesFraction  0.507045
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.35131
		hillsFraction   0.68644
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276699
		craterFreq      0.202976
		craterDensity   0.886281
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.3831
		volcanoTemp     1544.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.195, 0.222, 0.050)
		colorShelf     (0.225, 0.228, 0.255, 0.040)
		colorBeach     (0.258, 0.262, 0.289, 0.030)
		colorDesert    (0.292, 0.295, 0.327, 0.020)
		colorLowland   (0.326, 0.329, 0.361, 0.030)
		colorUpland    (0.360, 0.362, 0.394, 0.050)
		colorRock      (0.393, 0.395, 0.438, 0.020)
		colorSnow      (0.393, 0.395, 0.438, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.901895
		GasToDust   0.25
		Particles   2801
		GasBright   0.20806
		DustBright  0.417697
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.39515
		Period          4.69872
		Eccentricity    0.886205
		Inclination     -143.792
		AscendingNode   -131.409
		ArgOfPericenter -132.374
		MeanAnomaly     32.7766
	}
}

Comet	"C16"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.96199e-016
	Radius          0.117642
	InertiaMoment   0.395019

	Oblateness      0.0772814

	RotationPeriod  19.9512
	Obliquity       224.342
	EqAscendNode    39.1929

	AbsMagn         5.24321
	SlopeParam      7.78904
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.608 0.606 0.603)

	Surface
	{
		SurfStyle       0.429329
		OceanStyle      0.435905
		Randomize      (0.128, -0.614, 0.032)
		colorDistMagn   0.943446
		colorDistFreq   1.0394e-005
		detailScale     3.2124
		colorConversion true
		snowLevel       2
		tropicLatitude  0.913715
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.561703
		terraceProb     0.210783
		erosion         0
		montesMagn      0.603371
		montesFreq      3.27901
		montesSpiky     0.873485
		montesFraction  0.519434
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.27845e-005
		hillsFraction   0.538462
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237855
		craterFreq      0.24595
		craterDensity   0.871646
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   828.016
		volcanoTemp     1625.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.242, 0.241, 0.000)
		colorShelf     (0.258, 0.257, 0.256, 0.000)
		colorBeach     (0.274, 0.272, 0.271, 0.000)
		colorDesert    (0.289, 0.288, 0.286, 0.000)
		colorLowland   (0.304, 0.303, 0.301, 0.000)
		colorUpland    (0.319, 0.318, 0.316, 0.000)
		colorRock      (0.334, 0.333, 0.331, 0.000)
		colorSnow      (0.350, 0.348, 0.346, 1.000)
		BumpHeight      0.105877
		BumpOffset      0.0211755
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.121472
		DustBright  0.188771
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.70865
		Period          20.3644
		Eccentricity    0.94072
		Inclination     -156.983
		AscendingNode   22.8243
		ArgOfPericenter -154.554
		MeanAnomaly     -55.088
	}
}

Comet	"C17"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.83774e-012
	Radius          2.12547
	InertiaMoment   0.39894

	Oblateness      0.0783457

	RotationPeriod  17.431
	Obliquity       177.548
	EqAscendNode    23.7703

	AbsMagn         6.75235
	SlopeParam      5.49106
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.778 0.655 0.602)

	Surface
	{
		SurfStyle       0.549469
		OceanStyle      0.945227
		Randomize      (0.818, -0.927, -0.177)
		colorDistMagn   0.941381
		colorDistFreq   0.00254331
		detailScale     58.0394
		colorConversion true
		snowLevel       2
		tropicLatitude  0.553368
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.379737
		terraceProb     0.423887
		erosion         0
		montesMagn      0.487329
		montesFreq      2.98418
		montesSpiky     0.911262
		montesFraction  0.925963
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0130753
		hillsFraction   0.771332
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2442
		craterFreq      0.199823
		craterDensity   0.86229
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   170.107
		volcanoTemp     1431.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.223, 0.169, 0.000)
		colorShelf     (0.311, 0.229, 0.193, 0.000)
		colorBeach     (0.366, 0.268, 0.229, 0.000)
		colorDesert    (0.397, 0.288, 0.223, 0.000)
		colorLowland   (0.436, 0.308, 0.253, 0.000)
		colorUpland    (0.482, 0.373, 0.307, 0.000)
		colorRock      (0.521, 0.406, 0.331, 0.000)
		colorSnow      (0.568, 0.432, 0.349, 1.000)
		BumpHeight      1.91292
		BumpOffset      0.382584
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.453529
		GasToDust   0.25
		Particles   1896
		GasBright   0.358092
		DustBright  0.436638
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.47536
		Period          11.1047
		Eccentricity    0.977353
		Inclination     -31.9817
		AscendingNode   -50.2108
		ArgOfPericenter -81.986
		MeanAnomaly     106.581
	}
}

Comet	"C18"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.96822e-008
	Radius          45.9645
	InertiaMoment   0.397317

	Oblateness      0.142182

	RotationPeriod  14.7512
	Obliquity       130.753
	EqAscendNode    8.34771

	AbsMagn         8.09785
	SlopeParam      4.36867
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.585 0.498 0.356)

	Surface
	{
		SurfStyle       0.167028
		OceanStyle      0.348595
		Randomize      (0.753, 0.769, 0.674)
		colorDistMagn   0.571818
		colorDistFreq   0.540737
		detailScale     1255.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.963504
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497258
		terraceProb     0.114286
		erosion         0
		montesMagn      0.504688
		montesFreq      2.89734
		montesSpiky     0.942533
		montesFraction  0.69945
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.52799
		hillsFraction   0.62563
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249979
		craterFreq      0.250224
		craterDensity   1.06184
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.8293
		volcanoTemp     1700.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.199, 0.142, 0.000)
		colorShelf     (0.249, 0.211, 0.151, 0.000)
		colorBeach     (0.263, 0.224, 0.160, 0.000)
		colorDesert    (0.278, 0.236, 0.169, 0.000)
		colorLowland   (0.292, 0.249, 0.178, 0.000)
		colorUpland    (0.307, 0.261, 0.187, 0.000)
		colorRock      (0.322, 0.274, 0.196, 0.000)
		colorSnow      (0.336, 0.286, 0.205, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.934721
		GasToDust   0.25
		Particles   2868
		GasBright   0.00461404
		DustBright  0.474603
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.61421
		Period          5.84775
		Eccentricity    0.938044
		Inclination     -42.1472
		AscendingNode   -64.8156
		ArgOfPericenter -176.272
		MeanAnomaly     175.49
	}
}

Comet	"C19"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            9.13934e-016
	Radius          0.131644
	InertiaMoment   0.399398

	Oblateness      0.16876

	RotationPeriod  11.8732
	Obliquity       83.9591
	EqAscendNode    352.925

	AbsMagn         9.45484
	SlopeParam      3.35864
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.641 0.636 0.632)

	Surface
	{
		SurfStyle       0.848444
		OceanStyle      0.174822
		Randomize      (0.330, -0.746, 0.887)
		colorDistMagn   0.0674158
		colorDistFreq   1.11042e-005
		detailScale     3.59476
		colorConversion true
		snowLevel       2
		tropicLatitude  0.85125
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.47053
		terraceProb     0.178724
		erosion         0
		montesMagn      0.537465
		montesFreq      2.36717
		montesSpiky     0.961976
		montesFraction  0.670112
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.21507e-005
		hillsFraction   0.921178
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212611
		craterFreq      0.234095
		craterDensity   0.92331
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   682.732
		volcanoTemp     1661.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.216, 0.177, 0.000)
		colorShelf     (0.256, 0.222, 0.202, 0.000)
		colorBeach     (0.301, 0.261, 0.240, 0.000)
		colorDesert    (0.327, 0.280, 0.234, 0.000)
		colorLowland   (0.359, 0.299, 0.265, 0.000)
		colorUpland    (0.397, 0.362, 0.322, 0.000)
		colorRock      (0.429, 0.394, 0.348, 0.000)
		colorSnow      (0.468, 0.419, 0.367, 1.000)
		BumpHeight      0.11848
		BumpOffset      0.023696
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0661809
		DustBright  0.897522
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.97571
		Period          7.91832
		Eccentricity    0.95654
		Inclination     136.363
		AscendingNode   -151.123
		ArgOfPericenter -117.711
		MeanAnomaly     -121.272
	}
}

Comet	"C20"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            7.06863e-012
	Radius          2.84635
	InertiaMoment   0.398118

	Oblateness      0.249

	RotationPeriod  8.74354
	Obliquity       37.1648
	EqAscendNode    337.503

	AbsMagn         11.0106
	SlopeParam      2.13336
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.468 0.463 0.459)

	Surface
	{
		SurfStyle       0.0990396
		OceanStyle      0.154158
		Randomize      (-0.194, 0.313, 0.299)
		colorDistMagn   0.944748
		colorDistFreq   0.00603495
		detailScale     77.7244
		colorConversion true
		snowLevel       2
		tropicLatitude  0.848837
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.416629
		terraceProb     0.379702
		erosion         0
		montesMagn      0.456219
		montesFreq      3.4611
		montesSpiky     0.907366
		montesFraction  0.405207
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0133669
		hillsFraction   0.760441
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231684
		craterFreq      0.227032
		craterDensity   0.945221
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   167.852
		volcanoTemp     1579.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.185, 0.184, 0.000)
		colorShelf     (0.199, 0.197, 0.195, 0.000)
		colorBeach     (0.211, 0.208, 0.207, 0.000)
		colorDesert    (0.222, 0.220, 0.218, 0.000)
		colorLowland   (0.234, 0.232, 0.230, 0.000)
		colorUpland    (0.246, 0.243, 0.241, 0.000)
		colorRock      (0.257, 0.255, 0.252, 0.000)
		colorSnow      (0.269, 0.266, 0.264, 1.000)
		BumpHeight      2.56172
		BumpOffset      0.512343
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.486355
		GasToDust   0.25
		Particles   1962
		GasBright   0.082786
		DustBright  0.565404
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.18281
		Period          9.19546
		Eccentricity    0.951391
		Inclination     150.816
		AscendingNode   124.556
		ArgOfPericenter 173.914
		MeanAnomaly     31.2592
	}
}

Comet	"C21"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.46708e-008
	Radius          51.4455
	InertiaMoment   0.399825

	Oblateness      0.249

	RotationPeriod  5.28506
	Obliquity       350.37
	EqAscendNode    322.08

	AbsMagn         13.2749
	SlopeParam      5.81383
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.455 0.448 0.443)

	Surface
	{
		SurfStyle       0.998225
		OceanStyle      0.296856
		Randomize      (-0.959, -0.600, -0.145)
		colorDistMagn   0.11312
		colorDistFreq   1.73583
		detailScale     1404.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.269049
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535799
		terraceProb     0.456272
		erosion         0
		montesMagn      0.505339
		montesFreq      3.60947
		montesSpiky     0.89555
		montesFraction  0.225731
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.82133
		hillsFraction   0.590832
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231989
		craterFreq      0.14368
		craterDensity   0.895327
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.4965
		volcanoTemp     1595.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.155, 0.157, 0.177, 0.050)
		colorShelf     (0.182, 0.184, 0.204, 0.040)
		colorBeach     (0.209, 0.211, 0.230, 0.030)
		colorDesert    (0.236, 0.238, 0.261, 0.020)
		colorLowland   (0.264, 0.265, 0.288, 0.030)
		colorUpland    (0.291, 0.291, 0.314, 0.050)
		colorRock      (0.318, 0.318, 0.350, 0.020)
		colorSnow      (0.318, 0.318, 0.350, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.967547
		GasToDust   0.25
		Particles   2934
		GasBright   0.062132
		DustBright  0.270544
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.37824
		Period          17.7045
		Eccentricity    0.961741
		Inclination     6.13455
		AscendingNode   163.479
		ArgOfPericenter -108.132
		MeanAnomaly     -132.408
	}
}

Comet	"C22"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.68335e-015
	Radius          0.176262
	InertiaMoment   0.398694

	Oblateness      0.00156016

	RotationPeriod  140.783
	Obliquity       303.576
	EqAscendNode    306.657

	AbsMagn         1.26584
	SlopeParam      4.60506
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.413 0.408 0.402)

	Surface
	{
		SurfStyle       0.944666
		OceanStyle      0.763806
		Randomize      (0.772, 0.258, -0.446)
		colorDistMagn   0.568442
		colorDistFreq   6.92846e-006
		detailScale     4.81313
		colorConversion true
		snowLevel       2
		tropicLatitude  0.956321
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.314552
		terraceProb     0.320274
		erosion         0
		montesMagn      0.481535
		montesFreq      3.29374
		montesSpiky     0.923784
		montesFraction  0.859866
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.62298e-005
		hillsFraction   0.560384
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252004
		craterFreq      0.23682
		craterDensity   0.989175
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   673.562
		volcanoTemp     1488.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.140, 0.143, 0.161, 0.050)
		colorShelf     (0.165, 0.167, 0.185, 0.040)
		colorBeach     (0.190, 0.192, 0.209, 0.030)
		colorDesert    (0.215, 0.216, 0.237, 0.020)
		colorLowland   (0.239, 0.241, 0.261, 0.030)
		colorUpland    (0.264, 0.265, 0.285, 0.050)
		colorRock      (0.289, 0.289, 0.318, 0.020)
		colorSnow      (0.289, 0.289, 0.318, 1.000)
		BumpHeight      0.158636
		BumpOffset      0.0317272
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0379892
		GasToDust   0.25
		Particles   1056
		GasBright   0.200866
		DustBright  0.616297
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.77159
		Period          6.72347
		Eccentricity    0.906923
		Inclination     150.262
		AscendingNode   62.9583
		ArgOfPericenter 136.439
		MeanAnomaly     52.225
	}
}

Comet	"C23"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.30195e-011
	Radius          3.18632
	InertiaMoment   0.396684

	Oblateness      0.00166811

	RotationPeriod  118.542
	Obliquity       256.782
	EqAscendNode    291.235

	AbsMagn         4.31316
	SlopeParam      3.5961
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.790 0.709 0.679)

	Surface
	{
		SurfStyle       0.742619
		OceanStyle      0.820726
		Randomize      (-0.406, -0.044, -0.312)
		colorDistMagn   0.887705
		colorDistFreq   0.0061099
		detailScale     87.0079
		colorConversion true
		snowLevel       2
		tropicLatitude  0.966313
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.59406
		terraceProb     0.278262
		erosion         0
		montesMagn      0.601604
		montesFreq      2.43283
		montesSpiky     0.975028
		montesFraction  0.43113
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0171252
		hillsFraction   0.64881
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245962
		craterFreq      0.230427
		craterDensity   0.874841
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   138.452
		volcanoTemp     1086.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.241, 0.190, 0.000)
		colorShelf     (0.316, 0.248, 0.217, 0.000)
		colorBeach     (0.371, 0.291, 0.258, 0.000)
		colorDesert    (0.403, 0.312, 0.251, 0.000)
		colorLowland   (0.442, 0.333, 0.285, 0.000)
		colorUpland    (0.490, 0.404, 0.347, 0.000)
		colorRock      (0.529, 0.440, 0.374, 0.000)
		colorSnow      (0.577, 0.468, 0.394, 1.000)
		BumpHeight      2.86769
		BumpOffset      0.573538
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.519181
		GasToDust   0.25
		Particles   2028
		GasBright   0.15293
		DustBright  0.348719
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.09369
		Period          15.5154
		Eccentricity    0.934321
		Inclination     -36.2192
		AscendingNode   140.186
		ArgOfPericenter -171.509
		MeanAnomaly     -55.4823
	}
}

Comet	"C24"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.00697e-007
	Radius          68.8706
	InertiaMoment   0.399177

	Oblateness      0.00259983

	RotationPeriod  109.006
	Obliquity       209.988
	EqAscendNode    275.812

	AbsMagn         6.02276
	SlopeParam      2.46289
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.715 0.653 0.612)

	Surface
	{
		SurfStyle       0.586286
		OceanStyle      0.406404
		Randomize      (-0.330, -0.531, 0.000)
		colorDistMagn   0.944867
		colorDistFreq   2.46863
		detailScale     1880.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.917037
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610121
		terraceProb     0.356723
		erosion         0
		montesMagn      0.44768
		montesFreq      2.84474
		montesSpiky     0.970186
		montesFraction  0.388654
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.6389
		hillsFraction   0.698338
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274576
		craterFreq      0.206856
		craterDensity   0.84906
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.0277
		volcanoTemp     1485.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.222, 0.171, 0.000)
		colorShelf     (0.286, 0.228, 0.196, 0.000)
		colorBeach     (0.336, 0.268, 0.233, 0.000)
		colorDesert    (0.365, 0.287, 0.226, 0.000)
		colorLowland   (0.400, 0.307, 0.257, 0.000)
		colorUpland    (0.443, 0.372, 0.312, 0.000)
		colorRock      (0.479, 0.405, 0.337, 0.000)
		colorSnow      (0.522, 0.431, 0.355, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.358855
		DustBright  0.627281
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.1543
		Period          9.01587
		Eccentricity    0.937438
		Inclination     -143.079
		AscendingNode   12.043
		ArgOfPericenter 70.6978
		MeanAnomaly     103.591
	}
}

Comet	"C25"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.10052e-015
	Radius          0.197347
	InertiaMoment   0.397768

	Oblateness      0.00223615

	RotationPeriod  102.472
	Obliquity       163.193
	EqAscendNode    260.39

	AbsMagn         7.42398
	SlopeParam      6.19259
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.447 0.443 0.439)

	Surface
	{
		SurfStyle       0.636107
		OceanStyle      0.141124
		Randomize      (-0.697, 0.133, -0.607)
		colorDistMagn   0.483033
		colorDistFreq   3.13745e-005
		detailScale     5.38888
		colorConversion true
		snowLevel       2
		tropicLatitude  0.685974
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.266278
		terraceProb     0.321246
		erosion         0
		montesMagn      0.4775
		montesFreq      3.03849
		montesSpiky     0.867652
		montesFraction  0.344313
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.93517e-005
		hillsFraction   0.405072
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205259
		craterFreq      0.271768
		craterDensity   0.855801
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   555.672
		volcanoTemp     1546.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.151, 0.123, 0.000)
		colorShelf     (0.179, 0.155, 0.140, 0.000)
		colorBeach     (0.210, 0.181, 0.167, 0.000)
		colorDesert    (0.228, 0.195, 0.162, 0.000)
		colorLowland   (0.250, 0.208, 0.184, 0.000)
		colorUpland    (0.277, 0.252, 0.224, 0.000)
		colorRock      (0.300, 0.274, 0.241, 0.000)
		colorSnow      (0.327, 0.292, 0.255, 1.000)
		BumpHeight      0.177612
		BumpOffset      0.0355224
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.070815
		GasToDust   0.25
		Particles   1122
		GasBright   0.283637
		DustBright  0.386986
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.51398
		Period          11.3656
		Eccentricity    0.950374
		Inclination     27.07
		AscendingNode   161.509
		ArgOfPericenter -25.3853
		MeanAnomaly     -131.1
	}
}

Comet	"C26"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.39803e-011
	Radius          4.26494
	InertiaMoment   0.399616

	Oblateness      0.00325536

	RotationPeriod  97.3594
	Obliquity       116.399
	EqAscendNode    244.967

	AbsMagn         8.75599
	SlopeParam      4.85024
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.409 0.405 0.402)

	Surface
	{
		SurfStyle       0.886616
		OceanStyle      0.040869
		Randomize      (-0.852, 0.561, 0.364)
		colorDistMagn   0.598754
		colorDistFreq   0.015188
		detailScale     116.461
		colorConversion true
		snowLevel       2
		tropicLatitude  0.896352
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.266624
		terraceProb     0.220914
		erosion         0
		montesMagn      0.550575
		montesFreq      2.97284
		montesSpiky     0.962588
		montesFraction  0.388746
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0359232
		hillsFraction   0.552018
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.191218
		craterFreq      0.233244
		craterDensity   0.920491
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   136.55
		volcanoTemp     1578.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.139, 0.142, 0.161, 0.050)
		colorShelf     (0.164, 0.166, 0.185, 0.040)
		colorBeach     (0.188, 0.190, 0.209, 0.030)
		colorDesert    (0.213, 0.215, 0.237, 0.020)
		colorLowland   (0.237, 0.239, 0.261, 0.030)
		colorUpland    (0.262, 0.263, 0.285, 0.050)
		colorRock      (0.286, 0.287, 0.317, 0.020)
		colorSnow      (0.286, 0.287, 0.317, 1.000)
		BumpHeight      3.83844
		BumpOffset      0.767688
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.552007
		GasToDust   0.25
		Particles   2094
		GasBright   0.171159
		DustBright  0.18395
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.96276
		Period          14.541
		Eccentricity    0.969794
		Inclination     179.917
		AscendingNode   11.2954
		ArgOfPericenter -178.319
		MeanAnomaly     102.088
	}
}

Comet	"C27"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.85471e-007
	Radius          77.1201
	InertiaMoment   0.398426

	Oblateness      0.00271023

	RotationPeriod  93.0845
	Obliquity       69.6047
	EqAscendNode    229.544

	AbsMagn         10.1804
	SlopeParam      3.82797
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.593 0.590 0.588)

	Surface
	{
		SurfStyle       0.778081
		OceanStyle      0.672017
		Randomize      (0.436, 0.097, -0.790)
		colorDistMagn   0.192241
		colorDistFreq   2.89983
		detailScale     2105.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.873531
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.664501
		terraceProb     0.465625
		erosion         0
		montesMagn      0.326247
		montesFreq      2.22466
		montesSpiky     0.949699
		montesFraction  0.610766
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.0341
		hillsFraction   0.674378
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206997
		craterFreq      0.143959
		craterDensity   0.868054
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.076
		volcanoTemp     1474.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.201, 0.165, 0.000)
		colorShelf     (0.237, 0.207, 0.188, 0.000)
		colorBeach     (0.279, 0.242, 0.223, 0.000)
		colorDesert    (0.302, 0.260, 0.217, 0.000)
		colorLowland   (0.332, 0.278, 0.247, 0.000)
		colorUpland    (0.368, 0.337, 0.300, 0.000)
		colorRock      (0.397, 0.366, 0.323, 0.000)
		colorSnow      (0.433, 0.390, 0.341, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0344533
		DustBright  0.805143
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.15764
		Period          9.03681
		Eccentricity    0.942977
		Inclination     -72.6431
		AscendingNode   -64.6662
		ArgOfPericenter 156.302
		MeanAnomaly     25.7619
	}
}

Comet	"C28"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.71078e-015
	Radius          0.264116
	InertiaMoment   0.395128

	Oblateness      0.00378891

	RotationPeriod  89.3654
	Obliquity       22.8104
	EqAscendNode    214.122

	AbsMagn         11.9673
	SlopeParam      2.75514
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.654 0.648 0.645)

	Surface
	{
		SurfStyle       0.735097
		OceanStyle      0.0833497
		Randomize      (-0.939, 0.376, -0.761)
		colorDistMagn   0.0593216
		colorDistFreq   4.52861e-005
		detailScale     7.21214
		colorConversion true
		snowLevel       2
		tropicLatitude  0.721868
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504284
		terraceProb     0.113634
		erosion         0
		montesMagn      0.431451
		montesFreq      3.32366
		montesSpiky     0.902373
		montesFraction  0.770477
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000173579
		hillsFraction   0.765695
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21443
		craterFreq      0.257364
		craterDensity   1.04346
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   547.966
		volcanoTemp     1750.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.220, 0.181, 0.000)
		colorShelf     (0.262, 0.227, 0.206, 0.000)
		colorBeach     (0.307, 0.266, 0.245, 0.000)
		colorDesert    (0.334, 0.285, 0.239, 0.000)
		colorLowland   (0.366, 0.305, 0.271, 0.000)
		colorUpland    (0.406, 0.369, 0.329, 0.000)
		colorRock      (0.438, 0.402, 0.355, 0.000)
		colorSnow      (0.477, 0.428, 0.374, 1.000)
		BumpHeight      0.237705
		BumpOffset      0.047541
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.103641
		GasToDust   0.25
		Particles   1189
		GasBright   0.0524506
		DustBright  0.471632
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.01271
		Period          14.9102
		Eccentricity    0.972757
		Inclination     25.277
		AscendingNode   -31.2614
		ArgOfPericenter -100.88
		MeanAnomaly     -135.2
	}
}

Comet	"C29"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.41688e-011
	Radius          4.77642
	InertiaMoment   0.398946

	Oblateness      0.00317067

	RotationPeriod  86.0421
	Obliquity       336.016
	EqAscendNode    198.699

	AbsMagn         15.6173
	SlopeParam      6.67261
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.680 0.677 0.673)

	Surface
	{
		SurfStyle       0.934612
		OceanStyle      0.135675
		Randomize      (-0.651, 0.643, 0.925)
		colorDistMagn   0.591419
		colorDistFreq   0.0173376
		detailScale     130.428
		colorConversion true
		snowLevel       2
		tropicLatitude  0.360002
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.617808
		terraceProb     0.300993
		erosion         0
		montesMagn      0.469571
		montesFreq      3.01134
		montesSpiky     0.89619
		montesFraction  0.84117
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0361365
		hillsFraction   0.673032
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242294
		craterFreq      0.225814
		craterDensity   0.876791
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   112.681
		volcanoTemp     1597.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.237, 0.269, 0.050)
		colorShelf     (0.272, 0.278, 0.310, 0.040)
		colorBeach     (0.313, 0.318, 0.350, 0.030)
		colorDesert    (0.354, 0.359, 0.397, 0.020)
		colorLowland   (0.394, 0.400, 0.437, 0.030)
		colorUpland    (0.435, 0.440, 0.478, 0.050)
		colorRock      (0.476, 0.481, 0.532, 0.020)
		colorSnow      (0.476, 0.481, 0.532, 1.000)
		BumpHeight      4.29878
		BumpOffset      0.859755
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.584833
		GasToDust   0.25
		Particles   2161
		GasBright   0.0331888
		DustBright  0.17538
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.96381
		Period          7.8469
		Eccentricity    0.90933
		Inclination     24.3483
		AscendingNode   -53.1277
		ArgOfPericenter -101.388
		MeanAnomaly     -154.17
	}
}

Comet	"C30"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.41614e-007
	Radius          103.201
	InertiaMoment   0.39733

	Oblateness      0.00441517

	RotationPeriod  83.0149
	Obliquity       289.222
	EqAscendNode    183.277

	AbsMagn         3.12205
	SlopeParam      5.10897
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.499 0.495 0.491)

	Surface
	{
		SurfStyle       0.210772
		OceanStyle      0.921949
		Randomize      (-0.037, -0.463, -0.622)
		colorDistMagn   0.0243505
		colorDistFreq   8.46485
		detailScale     2818.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.928378
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515531
		terraceProb     0.495509
		erosion         0
		montesMagn      0.536957
		montesFreq      2.53505
		montesSpiky     0.992792
		montesFraction  0.571518
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.5059
		hillsFraction   0.380492
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263516
		craterFreq      0.397265
		craterDensity   0.884083
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.6835
		volcanoTemp     1760.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.198, 0.196, 0.000)
		colorShelf     (0.212, 0.210, 0.208, 0.000)
		colorBeach     (0.225, 0.223, 0.221, 0.000)
		colorDesert    (0.237, 0.235, 0.233, 0.000)
		colorLowland   (0.249, 0.248, 0.245, 0.000)
		colorUpland    (0.262, 0.260, 0.258, 0.000)
		colorRock      (0.274, 0.272, 0.270, 0.000)
		colorSnow      (0.287, 0.285, 0.282, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.151205
		DustBright  0.541851
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.01218
		Period          8.13855
		Eccentricity    0.956487
		Inclination     -123.047
		AscendingNode   134.137
		ArgOfPericenter 69.1249
		MeanAnomaly     -119.508
	}
}

Comet	"C31"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.05185e-014
	Radius          0.295825
	InertiaMoment   0.399403

	Oblateness      0.00364535

	RotationPeriod  80.217
	Obliquity       242.427
	EqAscendNode    167.854

	AbsMagn         5.22008
	SlopeParam      4.05755
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.501 0.492 0.489)

	Surface
	{
		SurfStyle       0.649428
		OceanStyle      0.0161402
		Randomize      (0.921, 0.906, -0.134)
		colorDistMagn   0.0559986
		colorDistFreq   5.61012e-005
		detailScale     8.07798
		colorConversion true
		snowLevel       2
		tropicLatitude  0.853426
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.54919
		terraceProb     0.206437
		erosion         0
		montesMagn      0.290108
		montesFreq      3.79684
		montesSpiky     0.75987
		montesFraction  0.561989
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000229743
		hillsFraction   0.66333
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265809
		craterFreq      0.27752
		craterDensity   0.915516
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   452.233
		volcanoTemp     1601.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.167, 0.137, 0.000)
		colorShelf     (0.200, 0.172, 0.156, 0.000)
		colorBeach     (0.236, 0.202, 0.186, 0.000)
		colorDesert    (0.256, 0.216, 0.181, 0.000)
		colorLowland   (0.281, 0.231, 0.205, 0.000)
		colorUpland    (0.311, 0.280, 0.249, 0.000)
		colorRock      (0.336, 0.305, 0.269, 0.000)
		colorSnow      (0.366, 0.325, 0.283, 1.000)
		BumpHeight      0.266242
		BumpOffset      0.0532484
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.136467
		GasToDust   0.25
		Particles   1255
		GasBright   0.104661
		DustBright  0.272881
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.80756
		Period          6.92928
		Eccentricity    0.91947
		Inclination     173.369
		AscendingNode   53.116
		ArgOfPericenter -46.51
		MeanAnomaly     28.1155
	}
}

Comet	"C32"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            8.13535e-011
	Radius          6.39106
	InertiaMoment   0.398126

	Oblateness      0.00505416

	RotationPeriod  77.6014
	Obliquity       195.633
	EqAscendNode    152.431

	AbsMagn         6.73323
	SlopeParam      3.0229
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.806 0.728 0.700)

	Surface
	{
		SurfStyle       0.171793
		OceanStyle      0.688852
		Randomize      (-0.261, -0.330, -0.735)
		colorDistMagn   0.17143
		colorDistFreq   0.0311451
		detailScale     174.519
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971264
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.710774
		terraceProb     0.297323
		erosion         0
		montesMagn      0.360119
		montesFreq      2.67821
		montesSpiky     0.778802
		montesFraction  0.274922
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.092668
		hillsFraction   0.807845
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.198147
		craterFreq      0.224955
		craterDensity   1.04343
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   111.094
		volcanoTemp     1187.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.322, 0.291, 0.280, 0.000)
		colorShelf     (0.343, 0.309, 0.298, 0.000)
		colorBeach     (0.363, 0.328, 0.315, 0.000)
		colorDesert    (0.383, 0.346, 0.333, 0.000)
		colorLowland   (0.403, 0.364, 0.350, 0.000)
		colorUpland    (0.423, 0.382, 0.368, 0.000)
		colorRock      (0.443, 0.400, 0.385, 0.000)
		colorSnow      (0.464, 0.418, 0.403, 1.000)
		BumpHeight      5.75195
		BumpOffset      1.15039
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.617659
		GasToDust   0.25
		Particles   2227
		GasBright   0.289867
		DustBright  0.572161
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.83564
		Period          7.09137
		Eccentricity    0.922378
		Inclination     90.3341
		AscendingNode   154.697
		ArgOfPericenter 38.3251
		MeanAnomaly     123.44
	}
}

Comet	"C33"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.29209e-007
	Radius          115.601
	InertiaMoment   0.39983

	Oblateness      0.00415191

	RotationPeriod  75.1334
	Obliquity       148.839
	EqAscendNode    137.009

	AbsMagn         8.07964
	SlopeParam      7.39135
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.463 0.458 0.453)

	Surface
	{
		SurfStyle       0.849111
		OceanStyle      0.429705
		Randomize      (0.177, 0.572, -0.932)
		colorDistMagn   0.897421
		colorDistFreq   2.6607
		detailScale     3156.69
		colorConversion true
		snowLevel       2
		tropicLatitude  0.656321
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.659198
		terraceProb     0.538004
		erosion         0
		montesMagn      0.559163
		montesFreq      2.91505
		montesSpiky     0.908481
		montesFraction  0.90977
		dunesFraction   0
		hillsMagn       0
		hillsFreq       40.6699
		hillsFraction   0.814117
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215772
		craterFreq      0.457512
		craterDensity   0.811708
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.8492
		volcanoTemp     2000.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.156, 0.127, 0.000)
		colorShelf     (0.185, 0.160, 0.145, 0.000)
		colorBeach     (0.217, 0.188, 0.172, 0.000)
		colorDesert    (0.236, 0.201, 0.168, 0.000)
		colorLowland   (0.259, 0.215, 0.190, 0.000)
		colorUpland    (0.287, 0.261, 0.231, 0.000)
		colorRock      (0.310, 0.284, 0.249, 0.000)
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
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.216041
		DustBright  0.330474
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.54281
		Period          11.5616
		Eccentricity    0.953437
		Inclination     145.126
		AscendingNode   -100.21
		ArgOfPericenter 160.161
		MeanAnomaly     -75.008
	}
}

Comet	"C34"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.93738e-014
	Radius          0.395791
	InertiaMoment   0.398701

	Oblateness      0.00574194

	RotationPeriod  72.7868
	Obliquity       102.045
	EqAscendNode    121.586

	AbsMagn         9.43541
	SlopeParam      5.3878
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.653 0.649 0.646)

	Surface
	{
		SurfStyle       0.606192
		OceanStyle      0.577087
		Randomize      (0.866, -0.127, -0.692)
		colorDistMagn   0.702155
		colorDistFreq   8.17372e-005
		detailScale     10.8077
		colorConversion true
		snowLevel       2
		tropicLatitude  0.912868
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.273004
		terraceProb     0.172894
		erosion         0
		montesMagn      0.265716
		montesFreq      3.06129
		montesSpiky     0.942829
		montesFraction  0.365967
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000335886
		hillsFraction   0.890715
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225621
		craterFreq      0.271973
		craterDensity   1.00228
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   445.826
		volcanoTemp     1771.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.221, 0.181, 0.000)
		colorShelf     (0.261, 0.227, 0.207, 0.000)
		colorBeach     (0.307, 0.266, 0.245, 0.000)
		colorDesert    (0.333, 0.285, 0.239, 0.000)
		colorLowland   (0.366, 0.305, 0.271, 0.000)
		colorUpland    (0.405, 0.370, 0.329, 0.000)
		colorRock      (0.438, 0.402, 0.355, 0.000)
		colorSnow      (0.477, 0.428, 0.374, 1.000)
		BumpHeight      0.356212
		BumpOffset      0.0712425
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.169293
		GasToDust   0.25
		Particles   1321
		GasBright   0.104956
		DustBright  0.126046
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.32278
		Period          10.0939
		Eccentricity    0.948343
		Inclination     18.2631
		AscendingNode   -46.7253
		ArgOfPericenter 70.5116
		MeanAnomaly     149.759
	}
}

Comet	"C35"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.49842e-010
	Radius          7.1596
	InertiaMoment   0.396704

	Oblateness      0.00464381

	RotationPeriod  70.5412
	Obliquity       55.2503
	EqAscendNode    106.164

	AbsMagn         10.9865
	SlopeParam      4.2879
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.491 0.488 0.483)

	Surface
	{
		SurfStyle       0.421148
		OceanStyle      0.822186
		Randomize      (-0.975, 0.495, -0.334)
		colorDistMagn   0.280811
		colorDistFreq   0.00709194
		detailScale     195.505
		colorConversion true
		snowLevel       2
		tropicLatitude  0.816291
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.663201
		terraceProb     0.315028
		erosion         0
		montesMagn      0.494043
		montesFreq      3.21753
		montesSpiky     0.996029
		montesFraction  0.489942
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.136076
		hillsFraction   0.596791
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249659
		craterFreq      0.206912
		craterDensity   0.891703
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   91.7016
		volcanoTemp     1314.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.195, 0.193, 0.000)
		colorShelf     (0.209, 0.207, 0.205, 0.000)
		colorBeach     (0.221, 0.219, 0.217, 0.000)
		colorDesert    (0.233, 0.232, 0.229, 0.000)
		colorLowland   (0.246, 0.244, 0.241, 0.000)
		colorUpland    (0.258, 0.256, 0.253, 0.000)
		colorRock      (0.270, 0.268, 0.266, 0.000)
		colorSnow      (0.282, 0.280, 0.278, 1.000)
		BumpHeight      6.44364
		BumpOffset      1.28873
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.650485
		GasToDust   0.25
		Particles   2293
		GasBright   0.00958585
		DustBright  0.705903
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.52696
		Period          11.4537
		Eccentricity    0.932109
		Inclination     157.976
		AscendingNode   80.8036
		ArgOfPericenter 118.017
		MeanAnomaly     169.772
	}
}

Comet	"C36"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.61376e-018
	Radius          0.0245112
	InertiaMoment   0.399183

	Oblateness      0.00650046

	RotationPeriod  68.38
	Obliquity       8.45601
	EqAscendNode    90.7411

	AbsMagn         13.2318
	SlopeParam      3.27415
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.440 0.438 0.434)

	Surface
	{
		SurfStyle       0.266959
		OceanStyle      0.939341
		Randomize      (-0.981, -0.819, 0.241)
		colorDistMagn   0.387103
		colorDistFreq   3.00202e-007
		detailScale     0.669318
		colorConversion true
		snowLevel       2
		tropicLatitude  0.778195
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.398213
		terraceProb     0.158718
		erosion         0
		montesMagn      0.526943
		montesFreq      2.98836
		montesSpiky     0.881192
		montesFraction  0.705048
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.6053e-006
		hillsFraction   0.632703
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27595
		craterFreq      0.216708
		craterDensity   0.909313
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1789.13
		volcanoTemp     1720.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.175, 0.174, 0.000)
		colorShelf     (0.187, 0.186, 0.185, 0.000)
		colorBeach     (0.198, 0.197, 0.196, 0.000)
		colorDesert    (0.209, 0.208, 0.206, 0.000)
		colorLowland   (0.220, 0.219, 0.217, 0.000)
		colorUpland    (0.231, 0.230, 0.228, 0.000)
		colorRock      (0.242, 0.241, 0.239, 0.000)
		colorSnow      (0.253, 0.252, 0.250, 1.000)
		BumpHeight      0.02206
		BumpOffset      0.00441201
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0289753
		DustBright  0.371
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.35422
		Period          4.49347
		Eccentricity    0.914959
		Inclination     129.552
		AscendingNode   -90.9258
		ArgOfPericenter 95.7763
		MeanAnomaly     116.231
	}
}

Comet	"C37"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.56841e-014
	Radius          0.443416
	InertiaMoment   0.397777

	Oblateness      0.0052667

	RotationPeriod  66.29
	Obliquity       321.662
	EqAscendNode    75.3185

	AbsMagn         1.18952
	SlopeParam      2.00641
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.779 0.732 0.705)

	Surface
	{
		SurfStyle       0.599917
		OceanStyle      0.0365777
		Randomize      (0.772, 0.189, 0.063)
		colorDistMagn   0.787002
		colorDistFreq   7.18811e-005
		detailScale     12.1082
		colorConversion true
		snowLevel       2
		tropicLatitude  0.978882
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.403353
		terraceProb     0.14237
		erosion         0
		montesMagn      0.377728
		montesFreq      2.88602
		montesSpiky     0.884486
		montesFraction  0.556971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000444117
		hillsFraction   0.627588
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214556
		craterFreq      0.184996
		craterDensity   1.03709
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   368.027
		volcanoTemp     1518.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.249, 0.197, 0.000)
		colorShelf     (0.312, 0.256, 0.226, 0.000)
		colorBeach     (0.366, 0.300, 0.268, 0.000)
		colorDesert    (0.397, 0.322, 0.261, 0.000)
		colorLowland   (0.436, 0.344, 0.296, 0.000)
		colorUpland    (0.483, 0.417, 0.360, 0.000)
		colorRock      (0.522, 0.454, 0.388, 0.000)
		colorSnow      (0.569, 0.483, 0.409, 1.000)
		BumpHeight      0.399074
		BumpOffset      0.0798148
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.202119
		GasToDust   0.25
		Particles   1388
		GasBright   0.116296
		DustBright  0.768165
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.40552
		Period          17.9194
		Eccentricity    0.931967
		Inclination     82.6913
		AscendingNode   80.2078
		ArgOfPericenter 152.009
		MeanAnomaly     106.788
	}
}

Comet	"C38"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.75991e-010
	Radius          9.57778
	InertiaMoment   0.399622

	Oblateness      0.0073536

	RotationPeriod  64.2598
	Obliquity       274.867
	EqAscendNode    59.8959

	AbsMagn         4.28523
	SlopeParam      5.6967
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.608 0.563 0.508)

	Surface
	{
		SurfStyle       0.529549
		OceanStyle      0.301771
		Randomize      (0.633, 0.269, 0.850)
		colorDistMagn   0.0873535
		colorDistFreq   0.0357959
		detailScale     261.537
		colorConversion true
		snowLevel       2
		tropicLatitude  0.409625
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.537393
		terraceProb     0.124858
		erosion         0
		montesMagn      0.536782
		montesFreq      2.94105
		montesSpiky     0.790461
		montesFraction  0.738971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.189473
		hillsFraction   0.87328
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208367
		craterFreq      0.263222
		craterDensity   0.907936
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   90.3906
		volcanoTemp     1437.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.191, 0.142, 0.000)
		colorShelf     (0.243, 0.197, 0.163, 0.000)
		colorBeach     (0.286, 0.231, 0.193, 0.000)
		colorDesert    (0.310, 0.248, 0.188, 0.000)
		colorLowland   (0.340, 0.264, 0.213, 0.000)
		colorUpland    (0.377, 0.321, 0.259, 0.000)
		colorRock      (0.407, 0.349, 0.279, 0.000)
		colorSnow      (0.444, 0.371, 0.295, 1.000)
		BumpHeight      8.62
		BumpOffset      1.724
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.683311
		GasToDust   0.25
		Particles   2360
		GasBright   0.108404
		DustBright  0.460545
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.10567
		Period          8.71232
		Eccentricity    0.964587
		Inclination     -80.0026
		AscendingNode   -19.1464
		ArgOfPericenter -167.847
		MeanAnomaly     -158.37
	}
}

Comet	"C39"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            8.49798e-018
	Radius          0.0274619
	InertiaMoment   0.398433

	Oblateness      0.00596649

	RotationPeriod  62.2802
	Obliquity       228.073
	EqAscendNode    44.4733

	AbsMagn         6.00217
	SlopeParam      4.52213
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.642 0.639 0.634)

	Surface
	{
		SurfStyle       0.547458
		OceanStyle      0.967511
		Randomize      (-0.365, -0.983, -0.221)
		colorDistMagn   0.832423
		colorDistFreq   5.05025e-007
		detailScale     0.749892
		colorConversion true
		snowLevel       2
		tropicLatitude  0.493864
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.694948
		terraceProb     0.266627
		erosion         0
		montesMagn      0.594338
		montesFreq      3.5283
		montesSpiky     0.909085
		montesFraction  0.760586
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.33001e-006
		hillsFraction   0.623387
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266016
		craterFreq      0.240906
		craterDensity   0.867514
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1476.99
		volcanoTemp     1522.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.217, 0.178, 0.000)
		colorShelf     (0.257, 0.223, 0.203, 0.000)
		colorBeach     (0.302, 0.262, 0.241, 0.000)
		colorDesert    (0.327, 0.281, 0.235, 0.000)
		colorLowland   (0.359, 0.300, 0.266, 0.000)
		colorUpland    (0.398, 0.364, 0.323, 0.000)
		colorRock      (0.430, 0.396, 0.349, 0.000)
		colorSnow      (0.468, 0.421, 0.368, 1.000)
		BumpHeight      0.0247157
		BumpOffset      0.00494313
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0632519
		DustBright  0.190183
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.46768
		Period          18.4122
		Eccentricity    0.973231
		Inclination     -160.277
		AscendingNode   -163.356
		ArgOfPericenter 50.5392
		MeanAnomaly     103.966
	}
}

Comet	"C40"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.57258e-014
	Radius          0.593157
	InertiaMoment   0.395224

	Oblateness      0.00818162

	RotationPeriod  60.3428
	Obliquity       181.279
	EqAscendNode    29.0507

	AbsMagn         7.40558
	SlopeParam      3.51441
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.706 0.660 0.618)

	Surface
	{
		SurfStyle       0.614027
		OceanStyle      0.579066
		Randomize      (0.169, -0.397, 0.552)
		colorDistMagn   0.318561
		colorDistFreq   0.000146236
		detailScale     16.1971
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971929
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606749
		terraceProb     0.300851
		erosion         0
		montesMagn      0.391916
		montesFreq      2.63387
		montesSpiky     0.90284
		montesFraction  0.616726
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000737343
		hillsFraction   0.62417
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228365
		craterFreq      0.205864
		craterDensity   0.700292
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   362.75
		volcanoTemp     1544.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.224, 0.173, 0.000)
		colorShelf     (0.282, 0.231, 0.198, 0.000)
		colorBeach     (0.332, 0.270, 0.235, 0.000)
		colorDesert    (0.360, 0.290, 0.229, 0.000)
		colorLowland   (0.395, 0.310, 0.260, 0.000)
		colorUpland    (0.438, 0.376, 0.315, 0.000)
		colorRock      (0.473, 0.409, 0.340, 0.000)
		colorSnow      (0.515, 0.435, 0.359, 1.000)
		BumpHeight      0.533841
		BumpOffset      0.106768
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.234945
		GasToDust   0.25
		Particles   1454
		GasBright   0.22774
		DustBright  0.510181
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.91881
		Period          22.1197
		Eccentricity    0.954098
		Inclination     -104.103
		AscendingNode   -67.3726
		ArgOfPericenter -80.2418
		MeanAnomaly     -129.444
	}
}

Comet	"C41"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.08341e-010
	Radius          10.7311
	InertiaMoment   0.398952

	Oblateness      0.00677237

	RotationPeriod  58.4406
	Obliquity       134.485
	EqAscendNode    13.6281

	AbsMagn         8.73747
	SlopeParam      2.3535
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.733 0.730 0.728)

	Surface
	{
		SurfStyle       0.575423
		OceanStyle      0.293363
		Randomize      (-0.999, -0.407, -0.643)
		colorDistMagn   0.53741
		colorDistFreq   0.0807179
		detailScale     293.031
		colorConversion true
		snowLevel       2
		tropicLatitude  0.973702
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.524279
		terraceProb     0.437359
		erosion         0
		montesMagn      0.460586
		montesFreq      2.80499
		montesSpiky     0.932754
		montesFraction  0.505889
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.28212
		hillsFraction   0.531285
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254865
		craterFreq      0.168725
		craterDensity   0.738193
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   74.6231
		volcanoTemp     1643.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.248, 0.204, 0.000)
		colorShelf     (0.293, 0.256, 0.233, 0.000)
		colorBeach     (0.344, 0.299, 0.277, 0.000)
		colorDesert    (0.374, 0.321, 0.269, 0.000)
		colorLowland   (0.410, 0.343, 0.306, 0.000)
		colorUpland    (0.454, 0.416, 0.371, 0.000)
		colorRock      (0.491, 0.453, 0.401, 0.000)
		colorSnow      (0.535, 0.482, 0.422, 1.000)
		BumpHeight      9.658
		BumpOffset      1.9316
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.716137
		GasToDust   0.25
		Particles   2426
		GasBright   0.155306
		DustBright  0.267102
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.71097
		Period          12.7273
		Eccentricity    0.94648
		Inclination     -91.0328
		AscendingNode   -109.7
		ArgOfPericenter -104.151
		MeanAnomaly     107.907
	}
}

Comet	"C42"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.56522e-017
	Radius          0.0367347
	InertiaMoment   0.397343

	Oblateness      0.00936041

	RotationPeriod  56.5671
	Obliquity       87.6902
	EqAscendNode    358.206

	AbsMagn         10.1593
	SlopeParam      6.05263
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.776 0.774 0.773)

	Surface
	{
		SurfStyle       0.369736
		OceanStyle      0.000638978
		Randomize      (0.890, -0.222, 0.294)
		colorDistMagn   0.154363
		colorDistFreq   4.73747e-007
		detailScale     1.0031
		colorConversion true
		snowLevel       2
		tropicLatitude  0.876061
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.382007
		terraceProb     0.184531
		erosion         0
		montesMagn      0.498435
		montesFreq      3.07401
		montesSpiky     0.907092
		montesFraction  0.744779
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.15698e-006
		hillsFraction   0.714816
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242136
		craterFreq      0.262133
		craterDensity   0.830253
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1455.78
		volcanoTemp     1849.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.309, 0.309, 0.000)
		colorShelf     (0.330, 0.329, 0.328, 0.000)
		colorBeach     (0.349, 0.348, 0.348, 0.000)
		colorDesert    (0.368, 0.368, 0.367, 0.000)
		colorLowland   (0.388, 0.387, 0.386, 0.000)
		colorUpland    (0.407, 0.406, 0.406, 0.000)
		colorRock      (0.427, 0.426, 0.425, 0.000)
		colorSnow      (0.446, 0.445, 0.444, 1.000)
		BumpHeight      0.0330612
		BumpOffset      0.00661224
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.386985
		DustBright  0.51991
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.23008
		Period          9.49573
		Eccentricity    0.906452
		Inclination     70.0644
		AscendingNode   -58.1307
		ArgOfPericenter 107.431
		MeanAnomaly     -140.243
	}
}

Comet	"C43"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.21058e-013
	Radius          0.664594
	InertiaMoment   0.399409

	Oblateness      0.00771916

	RotationPeriod  54.7165
	Obliquity       40.8959
	EqAscendNode    342.783

	AbsMagn         11.9377
	SlopeParam      4.76379
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.797 0.795 0.792)

	Surface
	{
		SurfStyle       0.834523
		OceanStyle      0.215342
		Randomize      (-0.231, -0.294, -0.595)
		colorDistMagn   0.53821
		colorDistFreq   0.000252375
		detailScale     18.1478
		colorConversion true
		snowLevel       2
		tropicLatitude  0.834622
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.353554
		terraceProb     0.246239
		erosion         0
		montesMagn      0.520987
		montesFreq      2.2508
		montesSpiky     0.959122
		montesFraction  0.601274
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00116337
		hillsFraction   0.420033
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217413
		craterFreq      0.208204
		craterDensity   0.797372
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   299.478
		volcanoTemp     1441.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.270, 0.222, 0.000)
		colorShelf     (0.319, 0.278, 0.253, 0.000)
		colorBeach     (0.374, 0.326, 0.301, 0.000)
		colorDesert    (0.406, 0.350, 0.293, 0.000)
		colorLowland   (0.446, 0.374, 0.333, 0.000)
		colorUpland    (0.494, 0.453, 0.404, 0.000)
		colorRock      (0.534, 0.493, 0.436, 0.000)
		colorSnow      (0.581, 0.524, 0.459, 1.000)
		BumpHeight      0.598134
		BumpOffset      0.119627
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.267771
		GasToDust   0.25
		Particles   1520
		GasBright   0.287269
		DustBright  0.304112
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.45893
		Period          18.3426
		Eccentricity    0.974848
		Inclination     152.034
		AscendingNode   112.362
		ArgOfPericenter 106.91
		MeanAnomaly     -158.533
	}
}

Comet	"C44"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            9.363e-010
	Radius          14.3545
	InertiaMoment   0.398135

	Oblateness      0.0107143

	RotationPeriod  52.8835
	Obliquity       354.102
	EqAscendNode    327.36

	AbsMagn         15.5085
	SlopeParam      3.74783
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.418 0.415 0.413)

	Surface
	{
		SurfStyle       0.290072
		OceanStyle      0.864292
		Randomize      (0.494, -0.988, 0.310)
		colorDistMagn   0.155478
		colorDistFreq   0.115781
		detailScale     391.972
		colorConversion true
		snowLevel       2
		tropicLatitude  0.271205
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.66679
		terraceProb     0.125201
		erosion         0
		montesMagn      0.673895
		montesFreq      2.83311
		montesSpiky     0.950795
		montesFraction  0.724634
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.31416
		hillsFraction   0.525759
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205086
		craterFreq      0.179155
		craterDensity   0.961025
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   73.5504
		volcanoTemp     1732.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.166, 0.165, 0.000)
		colorShelf     (0.177, 0.176, 0.176, 0.000)
		colorBeach     (0.188, 0.187, 0.186, 0.000)
		colorDesert    (0.198, 0.197, 0.196, 0.000)
		colorLowland   (0.209, 0.208, 0.207, 0.000)
		colorUpland    (0.219, 0.218, 0.217, 0.000)
		colorRock      (0.230, 0.228, 0.227, 0.000)
		colorSnow      (0.240, 0.239, 0.238, 1.000)
		BumpHeight      12.919
		BumpOffset      2.5838
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.748963
		GasToDust   0.25
		Particles   2492
		GasBright   0.0123602
		DustBright  0.263507
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.36793
		Period          17.6235
		Eccentricity    0.953894
		Inclination     10.3446
		AscendingNode   150.216
		ArgOfPericenter -108.125
		MeanAnomaly     46.9624
	}
}

Comet	"C45"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.88294e-017
	Radius          0.0411589
	InertiaMoment   0.399836

	Oblateness      0.00885461

	RotationPeriod  51.0631
	Obliquity       307.307
	EqAscendNode    311.938

	AbsMagn         3.08353
	SlopeParam      2.65689
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.590 0.529 0.492)

	Surface
	{
		SurfStyle       0.310434
		OceanStyle      0.797906
		Randomize      (0.915, 0.422, 0.819)
		colorDistMagn   0.959677
		colorDistFreq   7.70522e-007
		detailScale     1.12391
		colorConversion true
		snowLevel       2
		tropicLatitude  0.814847
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.432748
		terraceProb     0.180353
		erosion         0
		montesMagn      0.648026
		montesFreq      3.08194
		montesSpiky     0.951982
		montesFraction  0.277522
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.91736e-006
		hillsFraction   0.705864
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218102
		craterFreq      0.249271
		craterDensity   0.993183
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1201.85
		volcanoTemp     1866.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.212, 0.197, 0.000)
		colorShelf     (0.251, 0.225, 0.209, 0.000)
		colorBeach     (0.265, 0.238, 0.221, 0.000)
		colorDesert    (0.280, 0.251, 0.234, 0.000)
		colorLowland   (0.295, 0.265, 0.246, 0.000)
		colorUpland    (0.310, 0.278, 0.258, 0.000)
		colorRock      (0.324, 0.291, 0.271, 0.000)
		colorSnow      (0.339, 0.304, 0.283, 1.000)
		BumpHeight      0.037043
		BumpOffset      0.0074086
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0789629
		DustBright  0.681391
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.54189
		Period          11.5554
		Eccentricity    0.940305
		Inclination     -172.992
		AscendingNode   -103.033
		ArgOfPericenter -25.182
		MeanAnomaly     -76.1703
	}
}

Comet	"C46"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.22975e-013
	Radius          0.888997
	InertiaMoment   0.398707

	Oblateness      0.0123485

	RotationPeriod  49.2505
	Obliquity       260.513
	EqAscendNode    296.515

	AbsMagn         5.19686
	SlopeParam      6.48941
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.614 0.524 0.445)

	Surface
	{
		SurfStyle       0.371275
		OceanStyle      0.0354394
		Randomize      (0.657, -0.165, 0.095)
		colorDistMagn   0.29407
		colorDistFreq   0.000427469
		detailScale     24.2755
		colorConversion true
		snowLevel       2
		tropicLatitude  0.827433
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.465726
		terraceProb     0.335604
		erosion         0
		montesMagn      0.453538
		montesFreq      3.51958
		montesSpiky     0.987909
		montesFraction  0.573642
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00193994
		hillsFraction   0.514121
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256275
		craterFreq      0.165596
		craterDensity   0.929425
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   295.174
		volcanoTemp     1600.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.210, 0.178, 0.000)
		colorShelf     (0.261, 0.223, 0.189, 0.000)
		colorBeach     (0.276, 0.236, 0.200, 0.000)
		colorDesert    (0.292, 0.249, 0.212, 0.000)
		colorLowland   (0.307, 0.262, 0.223, 0.000)
		colorUpland    (0.322, 0.275, 0.234, 0.000)
		colorRock      (0.338, 0.288, 0.245, 0.000)
		colorSnow      (0.353, 0.301, 0.256, 1.000)
		BumpHeight      0.800097
		BumpOffset      0.160019
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.300597
		GasToDust   0.25
		Particles   1587
		GasBright   0.0724625
		DustBright  0.372378
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.56838
		Period          5.60046
		Eccentricity    0.879671
		Inclination     80.6302
		AscendingNode   -123.331
		ArgOfPericenter 169.298
		MeanAnomaly     42.2074
	}
}

Comet	"C47"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.72455e-009
	Radius          16.083
	InertiaMoment   0.396725

	Oblateness      0.010113

	RotationPeriod  47.4411
	Obliquity       213.719
	EqAscendNode    281.093

	AbsMagn         6.71407
	SlopeParam      5.01718
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.634 0.630 0.623)

	Surface
	{
		SurfStyle       0.423183
		OceanStyle      0.958974
		Randomize      (-0.456, -0.323, 0.714)
		colorDistMagn   0.972424
		colorDistFreq   0.147066
		detailScale     439.173
		colorConversion true
		snowLevel       2
		tropicLatitude  0.377849
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.432654
		terraceProb     0.236512
		erosion         0
		montesMagn      0.446627
		montesFreq      2.77496
		montesSpiky     0.927428
		montesFraction  0.783937
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.70729
		hillsFraction   0.692126
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218037
		craterFreq      0.178897
		craterDensity   0.891959
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   60.7205
		volcanoTemp     1493.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.252, 0.249, 0.000)
		colorShelf     (0.269, 0.268, 0.265, 0.000)
		colorBeach     (0.285, 0.284, 0.280, 0.000)
		colorDesert    (0.301, 0.299, 0.296, 0.000)
		colorLowland   (0.317, 0.315, 0.312, 0.000)
		colorUpland    (0.333, 0.331, 0.327, 0.000)
		colorRock      (0.349, 0.347, 0.343, 0.000)
		colorSnow      (0.365, 0.362, 0.358, 1.000)
		BumpHeight      14.4747
		BumpOffset      2.89494
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.781788
		GasToDust   0.25
		Particles   2559
		GasBright   0.206256
		DustBright  0.723072
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.94033
		Period          7.70658
		Eccentricity    0.939046
		Inclination     -124.281
		AscendingNode   175.658
		ArgOfPericenter 90.6781
		MeanAnomaly     -46.9116
	}
}

Comet	"C48"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.31002e-017
	Radius          0.0550575
	InertiaMoment   0.399189

	Oblateness      0.0143755

	RotationPeriod  45.6302
	Obliquity       166.924
	EqAscendNode    265.67

	AbsMagn         8.06144
	SlopeParam      3.97785
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.733 0.727 0.725)

	Surface
	{
		SurfStyle       0.414471
		OceanStyle      0.419555
		Randomize      (0.006, 0.035, 0.218)
		colorDistMagn   0.591953
		colorDistFreq   2.48701e-006
		detailScale     1.50344
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99618
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.59175
		terraceProb     0.461943
		erosion         0
		montesMagn      0.412519
		montesFreq      3.04199
		montesSpiky     0.944565
		montesFraction  0.656311
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.43169e-006
		hillsFraction   0.610683
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227676
		craterFreq      0.236479
		craterDensity   0.824653
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1184.61
		volcanoTemp     1490.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.291, 0.290, 0.000)
		colorShelf     (0.311, 0.309, 0.308, 0.000)
		colorBeach     (0.330, 0.327, 0.326, 0.000)
		colorDesert    (0.348, 0.345, 0.344, 0.000)
		colorLowland   (0.366, 0.364, 0.362, 0.000)
		colorUpland    (0.385, 0.382, 0.381, 0.000)
		colorRock      (0.403, 0.400, 0.399, 0.000)
		colorSnow      (0.421, 0.418, 0.417, 1.000)
		BumpHeight      0.0495518
		BumpOffset      0.00991035
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.172473
		DustBright  0.441341
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.98095
		Period          14.6751
		Eccentricity    0.953306
		Inclination     -85.6231
		AscendingNode   93.2997
		ArgOfPericenter 139.553
		MeanAnomaly     -18.3374
	}
}

Comet	"C49"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.10691e-013
	Radius          0.996015
	InertiaMoment   0.397787

	Oblateness      0.011873

	RotationPeriod  43.8134
	Obliquity       120.13
	EqAscendNode    250.247

	AbsMagn         9.41601
	SlopeParam      2.93208
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.656 0.653 0.650)

	Surface
	{
		SurfStyle       0.742818
		OceanStyle      0.464065
		Randomize      (-0.730, 0.238, -0.391)
		colorDistMagn   0.825203
		colorDistFreq   0.00050989
		detailScale     27.1978
		colorConversion true
		snowLevel       2
		tropicLatitude  0.927777
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.656048
		terraceProb     0.345729
		erosion         0
		montesMagn      0.309895
		montesFreq      3.27878
		montesSpiky     0.884617
		montesFraction  0.53721
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00285153
		hillsFraction   0.681988
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26301
		craterFreq      0.267849
		craterDensity   0.943571
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   243.677
		volcanoTemp     1399.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.222, 0.182, 0.000)
		colorShelf     (0.263, 0.229, 0.208, 0.000)
		colorBeach     (0.308, 0.268, 0.247, 0.000)
		colorDesert    (0.335, 0.287, 0.241, 0.000)
		colorLowland   (0.368, 0.307, 0.273, 0.000)
		colorUpland    (0.407, 0.372, 0.332, 0.000)
		colorRock      (0.440, 0.405, 0.358, 0.000)
		colorSnow      (0.479, 0.431, 0.377, 1.000)
		BumpHeight      0.896413
		BumpOffset      0.179283
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.333422
		GasToDust   0.25
		Particles   1653
		GasBright   0.101431
		DustBright  0.196869
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.80866
		Period          13.4214
		Eccentricity    0.939367
		Inclination     -76.4979
		AscendingNode   54.3348
		ArgOfPericenter 25.9998
		MeanAnomaly     31.3232
	}
}

Comet	"C50"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.1764e-009
	Radius          21.5147
	InertiaMoment   0.399627

	Oblateness      0.0169651

	RotationPeriod  41.9858
	Obliquity       73.3359
	EqAscendNode    234.825

	AbsMagn         10.9625
	SlopeParam      7.09503
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.789 0.787 0.786)

	Surface
	{
		SurfStyle       0.457125
		OceanStyle      0.265377
		Randomize      (0.874, -0.995, -0.193)
		colorDistMagn   0.444723
		colorDistFreq   0.0797522
		detailScale     587.495
		colorConversion true
		snowLevel       2
		tropicLatitude  0.338711
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577209
		terraceProb     0.117019
		erosion         0
		montesMagn      0.558294
		montesFreq      3.78688
		montesSpiky     0.947449
		montesFraction  0.527146
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.63575
		hillsFraction   0.634337
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206325
		craterFreq      0.21843
		craterDensity   1.0546
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   59.8513
		volcanoTemp     1865.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.315, 0.315, 0.000)
		colorShelf     (0.335, 0.335, 0.334, 0.000)
		colorBeach     (0.355, 0.354, 0.354, 0.000)
		colorDesert    (0.375, 0.374, 0.374, 0.000)
		colorLowland   (0.395, 0.394, 0.393, 0.000)
		colorUpland    (0.414, 0.413, 0.413, 0.000)
		colorRock      (0.434, 0.433, 0.433, 0.000)
		colorSnow      (0.454, 0.453, 0.452, 1.000)
		BumpHeight      19.3632
		BumpOffset      3.87265
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.814614
		GasToDust   0.25
		Particles   2625
		GasBright   0.312392
		DustBright  0.470395
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.61391
		Period          12.0499
		Eccentricity    0.921075
		Inclination     -119.381
		AscendingNode   163.451
		ArgOfPericenter -97.2232
		MeanAnomaly     83.9621
	}
}

Comet	"C51"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            9.78036e-017
	Radius          0.0616822
	InertiaMoment   0.39844

	Oblateness      0.0141407

	RotationPeriod  40.1425
	Obliquity       26.5416
	EqAscendNode    219.402

	AbsMagn         13.1893
	SlopeParam      5.28812
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.621 0.563 0.491)

	Surface
	{
		SurfStyle       0.120313
		OceanStyle      0.998201
		Randomize      (0.935, 0.923, -0.848)
		colorDistMagn   0.853495
		colorDistFreq   3.08076e-006
		detailScale     1.68434
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999995
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.493728
		terraceProb     0.212887
		erosion         0
		montesMagn      0.383912
		montesFreq      3.784
		montesSpiky     0.948088
		montesFraction  0.538473
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.4988e-006
		hillsFraction   0.366185
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214298
		craterFreq      0.254603
		craterDensity   0.896176
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   977.887
		volcanoTemp     1648.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.225, 0.197, 0.000)
		colorShelf     (0.264, 0.239, 0.209, 0.000)
		colorBeach     (0.279, 0.253, 0.221, 0.000)
		colorDesert    (0.295, 0.267, 0.233, 0.000)
		colorLowland   (0.310, 0.281, 0.246, 0.000)
		colorUpland    (0.326, 0.296, 0.258, 0.000)
		colorRock      (0.341, 0.310, 0.270, 0.000)
		colorSnow      (0.357, 0.324, 0.282, 1.000)
		BumpHeight      0.055514
		BumpOffset      0.0111028
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.214068
		DustBright  0.253205
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.37191
		Period          26.0649
		Eccentricity    0.979934
		Inclination     71.4687
		AscendingNode   -47.2908
		ArgOfPericenter -94.4142
		MeanAnomaly     -27.8207
	}
}

Comet	"C52"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            7.56441e-013
	Radius          1.33247
	InertiaMoment   0.39531

	Oblateness      0.0200331

	RotationPeriod  38.2785
	Obliquity       339.747
	EqAscendNode    203.98

	AbsMagn         1.11064
	SlopeParam      4.20759
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.420 0.414 0.409)

	Surface
	{
		SurfStyle       0.771034
		OceanStyle      0.419125
		Randomize      (0.094, -0.057, -0.565)
		colorDistMagn   0.355819
		colorDistFreq   0.00123044
		detailScale     36.3853
		colorConversion true
		snowLevel       2
		tropicLatitude  0.845779
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.712315
		terraceProb     0.272961
		erosion         0
		montesMagn      0.442654
		montesFreq      3.0903
		montesSpiky     0.912979
		montesFraction  0.862275
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.005534
		hillsFraction   0.954512
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251396
		craterFreq      0.25256
		craterDensity   0.760768
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   240.202
		volcanoTemp     1472.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.141, 0.115, 0.000)
		colorShelf     (0.168, 0.145, 0.131, 0.000)
		colorBeach     (0.197, 0.170, 0.156, 0.000)
		colorDesert    (0.214, 0.182, 0.151, 0.000)
		colorLowland   (0.235, 0.194, 0.172, 0.000)
		colorUpland    (0.260, 0.236, 0.209, 0.000)
		colorRock      (0.281, 0.257, 0.225, 0.000)
		colorSnow      (0.307, 0.273, 0.237, 1.000)
		BumpHeight      1.19922
		BumpOffset      0.239845
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.366248
		GasToDust   0.25
		Particles   1719
		GasBright   0.0163388
		DustBright  0.935421
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.22432
		Period          3.86268
		Eccentricity    0.886496
		Inclination     142.484
		AscendingNode   2.44158
		ArgOfPericenter 108.535
		MeanAnomaly     49.0316
	}
}

Comet	"C53"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.85053e-009
	Radius          24.1018
	InertiaMoment   0.398959

	Oblateness      0.0171965

	RotationPeriod  36.3879
	Obliquity       292.953
	EqAscendNode    188.557

	AbsMagn         4.25712
	SlopeParam      3.18834
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.643 0.552 0.433)

	Surface
	{
		SurfStyle       0.201608
		OceanStyle      0.585738
		Randomize      (0.524, 0.226, -0.761)
		colorDistMagn   0.374495
		colorDistFreq   0.129011
		detailScale     658.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999851
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566379
		terraceProb     0.256583
		erosion         0
		montesMagn      0.613898
		montesFreq      1.80715
		montesSpiky     0.713867
		montesFraction  0.392042
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.25895
		hillsFraction   0.634413
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230503
		craterFreq      0.259968
		craterDensity   0.939583
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   49.4035
		volcanoTemp     1945.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.221, 0.173, 0.000)
		colorShelf     (0.273, 0.235, 0.184, 0.000)
		colorBeach     (0.289, 0.249, 0.195, 0.000)
		colorDesert    (0.305, 0.262, 0.206, 0.000)
		colorLowland   (0.321, 0.276, 0.217, 0.000)
		colorUpland    (0.338, 0.290, 0.227, 0.000)
		colorRock      (0.354, 0.304, 0.238, 0.000)
		colorSnow      (0.370, 0.318, 0.249, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.84744
		GasToDust   0.25
		Particles   2691
		GasBright   0.0484898
		DustBright  0.587757
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.39186
		Period          10.5475
		Eccentricity    0.929061
		Inclination     -78.731
		AscendingNode   86.2566
		ArgOfPericenter 112.923
		MeanAnomaly     150.945
	}
}

Comet	"C54"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.80142e-016
	Radius          0.0825243
	InertiaMoment   0.397355

	Oblateness      0.024841

	RotationPeriod  34.4648
	Obliquity       246.159
	EqAscendNode    173.134

	AbsMagn         5.98152
	SlopeParam      8.33391
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.429 0.420 0.417)

	Surface
	{
		SurfStyle       0.341542
		OceanStyle      0.357964
		Randomize      (0.559, -0.011, -0.698)
		colorDistMagn   0.915271
		colorDistFreq   2.95341e-006
		detailScale     2.25346
		colorConversion true
		snowLevel       2
		tropicLatitude  0.905443
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.383935
		terraceProb     0.547428
		erosion         0
		montesMagn      0.40714
		montesFreq      2.58551
		montesSpiky     0.902364
		montesFraction  0.759541
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.56094e-005
		hillsFraction   0.472463
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239468
		craterFreq      0.231703
		craterDensity   0.981806
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   964.007
		volcanoTemp     1335.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.168, 0.167, 0.000)
		colorShelf     (0.182, 0.179, 0.177, 0.000)
		colorBeach     (0.193, 0.189, 0.188, 0.000)
		colorDesert    (0.204, 0.200, 0.198, 0.000)
		colorLowland   (0.214, 0.210, 0.208, 0.000)
		colorUpland    (0.225, 0.221, 0.219, 0.000)
		colorRock      (0.236, 0.231, 0.229, 0.000)
		colorSnow      (0.247, 0.242, 0.240, 1.000)
		BumpHeight      0.0742719
		BumpOffset      0.0148544
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0433816
		DustBright  0.277352
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.54165
		Period          19.0045
		Eccentricity    0.967469
		Inclination     -171.788
		AscendingNode   100.767
		ArgOfPericenter 97.4598
		MeanAnomaly     99.4163
	}
}

Comet	"C55"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.39327e-012
	Radius          1.49257
	InertiaMoment   0.399414

	Oblateness      0.021532

	RotationPeriod  32.5022
	Obliquity       199.364
	EqAscendNode    157.712

	AbsMagn         7.38717
	SlopeParam      5.58512
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.579 0.575 0.568)

	Surface
	{
		SurfStyle       0.656939
		OceanStyle      0.863594
		Randomize      (0.837, 0.389, 0.891)
		colorDistMagn   0.777287
		colorDistFreq   0.00185698
		detailScale     40.7571
		colorConversion true
		snowLevel       2
		tropicLatitude  0.912189
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450307
		terraceProb     0.25106
		erosion         0
		montesMagn      0.61718
		montesFreq      3.19565
		montesSpiky     0.918132
		montesFraction  0.516392
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0062297
		hillsFraction   0.494049
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260968
		craterFreq      0.244887
		craterDensity   1.02856
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   198.254
		volcanoTemp     1823.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.195, 0.159, 0.000)
		colorShelf     (0.232, 0.201, 0.182, 0.000)
		colorBeach     (0.272, 0.236, 0.216, 0.000)
		colorDesert    (0.295, 0.253, 0.210, 0.000)
		colorLowland   (0.324, 0.270, 0.239, 0.000)
		colorUpland    (0.359, 0.328, 0.290, 0.000)
		colorRock      (0.388, 0.356, 0.313, 0.000)
		colorSnow      (0.423, 0.379, 0.330, 1.000)
		BumpHeight      1.34331
		BumpOffset      0.268662
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.399074
		GasToDust   0.25
		Particles   1786
		GasBright   0.156456
		DustBright  0.648763
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.78785
		Period          13.2725
		Eccentricity    0.948566
		Inclination     -127.642
		AscendingNode   50.6699
		ArgOfPericenter -151.928
		MeanAnomaly     37.1294
	}
}

Comet	"C56"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.0776e-008
	Radius          32.2485
	InertiaMoment   0.398143

	Oblateness      0.0317512

	RotationPeriod  30.4924
	Obliquity       152.57
	EqAscendNode    142.289

	AbsMagn         8.71896
	SlopeParam      4.4401
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.691 0.655 0.621)

	Surface
	{
		SurfStyle       0.509238
		OceanStyle      0.296783
		Randomize      (0.085, 0.446, 0.616)
		colorDistMagn   0.724781
		colorDistFreq   0.575671
		detailScale     880.598
		colorConversion true
		snowLevel       2
		tropicLatitude  0.93057
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.579939
		terraceProb     0.343967
		erosion         0
		montesMagn      0.287848
		montesFreq      3.47755
		montesSpiky     0.973914
		montesFraction  0.360367
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.36647
		hillsFraction   0.647902
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222753
		craterFreq      0.258038
		craterDensity   1.01777
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   48.7065
		volcanoTemp     1729.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.223, 0.174, 0.000)
		colorShelf     (0.277, 0.229, 0.199, 0.000)
		colorBeach     (0.325, 0.268, 0.236, 0.000)
		colorDesert    (0.353, 0.288, 0.230, 0.000)
		colorLowland   (0.387, 0.308, 0.261, 0.000)
		colorUpland    (0.429, 0.373, 0.317, 0.000)
		colorRock      (0.463, 0.406, 0.342, 0.000)
		colorSnow      (0.505, 0.432, 0.360, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.880266
		GasToDust   0.25
		Particles   2758
		GasBright   0.124066
		DustBright  0.36564
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.22921
		Period          9.49021
		Eccentricity    0.943487
		Inclination     -85.335
		AscendingNode   129.805
		ArgOfPericenter -64.6109
		MeanAnomaly     64.1093
	}
}

Comet	"C57"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.318e-016
	Radius          0.0924302
	InertiaMoment   0.399841

	Oblateness      0.0281162

	RotationPeriod  28.4264
	Obliquity       105.776
	EqAscendNode    126.867

	AbsMagn         10.1383
	SlopeParam      3.4319
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.576 0.570 0.565)

	Surface
	{
		SurfStyle       0.829668
		OceanStyle      0.0503025
		Randomize      (0.107, -0.623, -0.144)
		colorDistMagn   0.929242
		colorDistFreq   4.16251e-006
		detailScale     2.52396
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990574
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.434968
		terraceProb     0.172672
		erosion         0
		montesMagn      0.402674
		montesFreq      3.41457
		montesSpiky     0.904555
		montesFraction  0.616805
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.67991e-005
		hillsFraction   0.696014
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238849
		craterFreq      0.200331
		craterDensity   0.940952
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   795.576
		volcanoTemp     1519.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.194, 0.158, 0.000)
		colorShelf     (0.230, 0.200, 0.181, 0.000)
		colorBeach     (0.271, 0.234, 0.215, 0.000)
		colorDesert    (0.294, 0.251, 0.209, 0.000)
		colorLowland   (0.323, 0.268, 0.237, 0.000)
		colorUpland    (0.357, 0.325, 0.288, 0.000)
		colorRock      (0.386, 0.353, 0.311, 0.000)
		colorSnow      (0.421, 0.376, 0.328, 1.000)
		BumpHeight      0.0831871
		BumpOffset      0.0166374
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.304331
		DustBright  0.669862
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.75505
		Period          13.0389
		Eccentricity    0.969004
		Inclination     11.7624
		AscendingNode   -131.188
		ArgOfPericenter -61.9398
		MeanAnomaly     169.541
	}
}

Comet	"C58"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.56623e-012
	Radius          1.99728
	InertiaMoment   0.398714

	Oblateness      0.0426885

	RotationPeriod  26.2939
	Obliquity       58.9815
	EqAscendNode    111.444

	AbsMagn         11.9082
	SlopeParam      2.23894
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.707 0.704 0.698)

	Surface
	{
		SurfStyle       0.573592
		OceanStyle      0.698504
		Randomize      (0.756, 0.908, 0.667)
		colorDistMagn   0.409992
		colorDistFreq   0.00112217
		detailScale     54.539
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992928
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.462662
		terraceProb     0.418287
		erosion         0
		montesMagn      0.290629
		montesFreq      3.26234
		montesSpiky     0.965392
		montesFraction  0.300374
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00970889
		hillsFraction   0.570108
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246592
		craterFreq      0.188599
		craterDensity   0.939458
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   195.477
		volcanoTemp     1202.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.239, 0.195, 0.000)
		colorShelf     (0.283, 0.246, 0.223, 0.000)
		colorBeach     (0.332, 0.289, 0.265, 0.000)
		colorDesert    (0.360, 0.310, 0.258, 0.000)
		colorLowland   (0.396, 0.331, 0.293, 0.000)
		colorUpland    (0.438, 0.401, 0.356, 0.000)
		colorRock      (0.474, 0.436, 0.384, 0.000)
		colorSnow      (0.516, 0.464, 0.405, 1.000)
		BumpHeight      1.79755
		BumpOffset      0.35951
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.4319
		GasToDust   0.25
		Particles   1852
		GasBright   0.244659
		DustBright  0.414021
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.22298
		Period          9.45043
		Eccentricity    0.94645
		Inclination     103.349
		AscendingNode   90.0178
		ArgOfPericenter -139.99
		MeanAnomaly     104.879
	}
}

Comet	"C59"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.98479e-008
	Radius          36.115
	InertiaMoment   0.396745

	Oblateness      0.038614

	RotationPeriod  24.0823
	Obliquity       12.1872
	EqAscendNode    96.0215

	AbsMagn         15.4051
	SlopeParam      5.92207
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.691 0.558 0.469)

	Surface
	{
		SurfStyle       0.701242
		OceanStyle      0.454258
		Randomize      (-0.515, 0.543, -0.300)
		colorDistMagn   0.607691
		colorDistFreq   0.263854
		detailScale     986.179
		colorConversion true
		snowLevel       2
		tropicLatitude  0.471103
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.47683
		terraceProb     0.220541
		erosion         0
		montesMagn      0.576814
		montesFreq      2.30823
		montesSpiky     0.942623
		montesFraction  0.251539
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.79554
		hillsFraction   0.77572
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224269
		craterFreq      0.244267
		craterDensity   0.915699
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   40.1916
		volcanoTemp     1921.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.190, 0.131, 0.000)
		colorShelf     (0.276, 0.195, 0.150, 0.000)
		colorBeach     (0.325, 0.229, 0.178, 0.000)
		colorDesert    (0.352, 0.245, 0.174, 0.000)
		colorLowland   (0.387, 0.262, 0.197, 0.000)
		colorUpland    (0.428, 0.318, 0.239, 0.000)
		colorRock      (0.463, 0.346, 0.258, 0.000)
		colorSnow      (0.504, 0.368, 0.272, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.913092
		GasToDust   0.25
		Particles   2824
		GasBright   0.147727
		DustBright  0.195439
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.07
		Period          8.49186
		Eccentricity    0.96521
		Inclination     -163.656
		AscendingNode   -19.8296
		ArgOfPericenter 179.77
		MeanAnomaly     13.8669
	}
}

Comet	"C60"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.11132e-016
	Radius          0.1237
	InertiaMoment   0.399194

	Oblateness      0.0621992

	RotationPeriod  21.7765
	Obliquity       325.393
	EqAscendNode    80.5989

	AbsMagn         3.04456
	SlopeParam      4.67874
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.484 0.481 0.477)

	Surface
	{
		SurfStyle       0.190181
		OceanStyle      0.437042
		Randomize      (0.120, 0.472, 0.766)
		colorDistMagn   0.187277
		colorDistFreq   1.21301e-005
		detailScale     3.37784
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982359
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.485838
		terraceProb     0.264394
		erosion         0
		montesMagn      0.422401
		montesFreq      2.66377
		montesSpiky     0.899365
		montesFraction  0.346099
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.05655e-005
		hillsFraction   0.682594
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23887
		craterFreq      0.187412
		craterDensity   0.77179
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   784.528
		volcanoTemp     1522.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.192, 0.191, 0.000)
		colorShelf     (0.206, 0.204, 0.203, 0.000)
		colorBeach     (0.218, 0.216, 0.215, 0.000)
		colorDesert    (0.230, 0.228, 0.227, 0.000)
		colorLowland   (0.242, 0.240, 0.238, 0.000)
		colorUpland    (0.254, 0.252, 0.250, 0.000)
		colorRock      (0.266, 0.264, 0.262, 0.000)
		colorSnow      (0.278, 0.276, 0.274, 1.000)
		BumpHeight      0.11133
		BumpOffset      0.022266
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.40516
		DustBright  0.422493
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.99667
		Period          14.7913
		Eccentricity    0.938245
		Inclination     128.925
		AscendingNode   41.6551
		ArgOfPericenter 19.9997
		MeanAnomaly     -154.901
	}
}

Comet	"C61"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.72667e-012
	Radius          2.23643
	InertiaMoment   0.397797

	Oblateness      0.059829

	RotationPeriod  19.3577
	Obliquity       278.599
	EqAscendNode    65.1763

	AbsMagn         5.17354
	SlopeParam      3.66728
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.703 0.639 0.577)

	Surface
	{
		SurfStyle       0.394056
		OceanStyle      0.0920931
		Randomize      (0.238, 0.796, -0.726)
		colorDistMagn   0.498776
		colorDistFreq   0.00338075
		detailScale     61.0694
		colorConversion true
		snowLevel       2
		tropicLatitude  0.527262
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.329594
		terraceProb     0.191422
		erosion         0
		montesMagn      0.488912
		montesFreq      2.86798
		montesSpiky     0.806576
		montesFraction  0.289343
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0130328
		hillsFraction   0.82036
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220341
		craterFreq      0.218729
		craterDensity   1.00088
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   161.281
		volcanoTemp     1316.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.256, 0.231, 0.000)
		colorShelf     (0.299, 0.272, 0.245, 0.000)
		colorBeach     (0.316, 0.288, 0.260, 0.000)
		colorDesert    (0.334, 0.304, 0.274, 0.000)
		colorLowland   (0.351, 0.320, 0.288, 0.000)
		colorUpland    (0.369, 0.336, 0.303, 0.000)
		colorRock      (0.387, 0.352, 0.317, 0.000)
		colorSnow      (0.404, 0.368, 0.332, 1.000)
		BumpHeight      2.01278
		BumpOffset      0.402557
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.464726
		GasToDust   0.25
		Particles   1918
		GasBright   0.0248768
		DustBright  0.487263
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.85674
		Period          21.5963
		Eccentricity    0.97571
		Inclination     -112.432
		AscendingNode   172.808
		ArgOfPericenter -144.668
		MeanAnomaly     -17.2523
	}
}

Comet	"C62"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.65574e-008
	Radius          48.3398
	InertiaMoment   0.399632

	Oblateness      0.104403

	RotationPeriod  16.802
	Obliquity       231.804
	EqAscendNode    49.7537

	AbsMagn         6.69489
	SlopeParam      2.55528
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.565 0.558 0.552)

	Surface
	{
		SurfStyle       0.401962
		OceanStyle      0.476339
		Randomize      (0.936, -0.601, -0.317)
		colorDistMagn   0.587557
		colorDistFreq   1.29022
		detailScale     1320
		colorConversion true
		snowLevel       2
		tropicLatitude  0.866012
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571448
		terraceProb     0.328464
		erosion         0
		montesMagn      0.536314
		montesFreq      3.7991
		montesSpiky     0.888282
		montesFraction  0.41934
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.5236
		hillsFraction   0.761654
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22456
		craterFreq      0.195528
		craterDensity   0.893253
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   39.639
		volcanoTemp     1187.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.223, 0.221, 0.000)
		colorShelf     (0.240, 0.237, 0.235, 0.000)
		colorBeach     (0.254, 0.251, 0.249, 0.000)
		colorDesert    (0.268, 0.265, 0.262, 0.000)
		colorLowland   (0.283, 0.279, 0.276, 0.000)
		colorUpland    (0.297, 0.293, 0.290, 0.000)
		colorRock      (0.311, 0.307, 0.304, 0.000)
		colorSnow      (0.325, 0.321, 0.318, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.945918
		GasToDust   0.25
		Particles   2890
		GasBright   0.107256
		DustBright  0.889369
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.49872
		Period          11.2622
		Eccentricity    0.939158
		Inclination     100.227
		AscendingNode   -142.043
		ArgOfPericenter 146.662
		MeanAnomaly     -138.926
	}
}

Comet	"C63"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.12563e-015
	Radius          0.138489
	InertiaMoment   0.398448

	Oblateness      0.113059

	RotationPeriod  14.0785
	Obliquity       185.01
	EqAscendNode    34.3312

	AbsMagn         8.04323
	SlopeParam      6.325
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.665 0.620 0.582)

	Surface
	{
		SurfStyle       0.704561
		OceanStyle      0.00469118
		Randomize      (-0.258, 0.352, 0.025)
		colorDistMagn   0.521508
		colorDistFreq   1.53219e-005
		detailScale     3.78168
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993395
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453889
		terraceProb     0.113507
		erosion         0
		montesMagn      0.503859
		montesFreq      3.01603
		montesSpiky     0.974804
		montesFraction  0.754118
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.52129e-005
		hillsFraction   0.710842
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233299
		craterFreq      0.201259
		craterDensity   0.861166
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   647.179
		volcanoTemp     1734.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.211, 0.163, 0.000)
		colorShelf     (0.266, 0.217, 0.186, 0.000)
		colorBeach     (0.313, 0.254, 0.221, 0.000)
		colorDesert    (0.339, 0.273, 0.215, 0.000)
		colorLowland   (0.373, 0.292, 0.245, 0.000)
		colorUpland    (0.412, 0.354, 0.297, 0.000)
		colorRock      (0.446, 0.385, 0.320, 0.000)
		colorSnow      (0.486, 0.409, 0.338, 1.000)
		BumpHeight      0.12464
		BumpOffset      0.0249281
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0163602
		GasToDust   0.25
		Particles   1012
		GasBright   0.113517
		DustBright  0.567595
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.07795
		Period          15.3972
		Eccentricity    0.953178
		Inclination     -101.233
		AscendingNode   -22.1822
		ArgOfPericenter -19.9895
		MeanAnomaly     58.3592
	}
}

Comet	"C64"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            8.70594e-012
	Radius          2.99393
	InertiaMoment   0.395389

	Oblateness      0.232965

	RotationPeriod  11.1456
	Obliquity       138.216
	EqAscendNode    18.9086

	AbsMagn         9.39664
	SlopeParam      4.92749
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.450 0.445 0.439)

	Surface
	{
		SurfStyle       0.692901
		OceanStyle      0.550941
		Randomize      (-0.761, -0.276, -0.920)
		colorDistMagn   0.939406
		colorDistFreq   0.00421746
		detailScale     81.7542
		colorConversion true
		snowLevel       2
		tropicLatitude  0.850472
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.345224
		terraceProb     0.385735
		erosion         0
		montesMagn      0.568006
		montesFreq      2.70486
		montesSpiky     0.959213
		montesFraction  0.664111
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0123175
		hillsFraction   0.548008
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254595
		craterFreq      0.201689
		craterDensity   0.948491
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   159.089
		volcanoTemp     1781.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.151, 0.123, 0.000)
		colorShelf     (0.180, 0.156, 0.140, 0.000)
		colorBeach     (0.211, 0.183, 0.167, 0.000)
		colorDesert    (0.229, 0.196, 0.162, 0.000)
		colorLowland   (0.252, 0.209, 0.184, 0.000)
		colorUpland    (0.279, 0.254, 0.224, 0.000)
		colorRock      (0.301, 0.276, 0.241, 0.000)
		colorSnow      (0.328, 0.294, 0.254, 1.000)
		BumpHeight      2.69454
		BumpOffset      0.538907
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.497552
		GasToDust   0.25
		Particles   1984
		GasBright   0.0825194
		DustBright  0.28308
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.86988
		Period          13.8626
		Eccentricity    0.930478
		Inclination     -126.222
		AscendingNode   80.8588
		ArgOfPericenter -121.927
		MeanAnomaly     135.869
	}
}

Comet	"C65"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.73342e-008
	Radius          54.1093
	InertiaMoment   0.398965

	Oblateness      0.249

	RotationPeriod  7.94501
	Obliquity       91.4214
	EqAscendNode    3.48597

	AbsMagn         10.9386
	SlopeParam      3.89812
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.625 0.552 0.496)

	Surface
	{
		SurfStyle       0.68721
		OceanStyle      0.226546
		Randomize      (-0.925, 0.319, 0.790)
		colorDistMagn   0.677963
		colorDistFreq   0.943021
		detailScale     1477.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.453442
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.266054
		terraceProb     0.344035
		erosion         0
		montesMagn      0.530607
		montesFreq      2.71038
		montesSpiky     0.957963
		montesFraction  0.308632
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.30081
		hillsFraction   0.926204
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218269
		craterFreq      0.22291
		craterDensity   0.929563
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.6934
		volcanoTemp     1031.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.188, 0.139, 0.000)
		colorShelf     (0.250, 0.193, 0.159, 0.000)
		colorBeach     (0.294, 0.226, 0.189, 0.000)
		colorDesert    (0.319, 0.243, 0.184, 0.000)
		colorLowland   (0.350, 0.259, 0.208, 0.000)
		colorUpland    (0.388, 0.314, 0.253, 0.000)
		colorRock      (0.419, 0.342, 0.273, 0.000)
		colorSnow      (0.456, 0.364, 0.288, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.978744
		GasToDust   0.25
		Particles   2957
		GasBright   0.242066
		DustBright  0.608019
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.45448
		Period          18.3072
		Eccentricity    0.948091
		Inclination     -65.0946
		AscendingNode   166.276
		ArgOfPericenter 82.6013
		MeanAnomaly     57.4886
	}
}

Comet	"C66"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.07326e-015
	Radius          0.18543
	InertiaMoment   0.397368

	Oblateness      0.249

	RotationPeriod  4.39189
	Obliquity       44.6271
	EqAscendNode    348.063

	AbsMagn         13.1474
	SlopeParam      2.839
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.428 0.424 0.421)

	Surface
	{
		SurfStyle       0.601677
		OceanStyle      0.775968
		Randomize      (0.994, 0.566, 0.307)
		colorDistMagn   0.383932
		colorDistFreq   2.15228e-005
		detailScale     5.06347
		colorConversion true
		snowLevel       2
		tropicLatitude  0.707544
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.424824
		terraceProb     0.412426
		erosion         0
		montesMagn      0.561384
		montesFreq      2.95409
		montesSpiky     0.949824
		montesFraction  0.57788
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000116669
		hillsFraction   0.559707
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253975
		craterFreq      0.228117
		craterDensity   0.802471
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   638.496
		volcanoTemp     1628.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.144, 0.118, 0.000)
		colorShelf     (0.171, 0.148, 0.135, 0.000)
		colorBeach     (0.201, 0.174, 0.160, 0.000)
		colorDesert    (0.218, 0.186, 0.156, 0.000)
		colorLowland   (0.240, 0.199, 0.177, 0.000)
		colorUpland    (0.265, 0.242, 0.215, 0.000)
		colorRock      (0.287, 0.263, 0.232, 0.000)
		colorSnow      (0.312, 0.280, 0.244, 1.000)
		BumpHeight      0.166887
		BumpOffset      0.0333774
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.049186
		GasToDust   0.25
		Particles   1079
		GasBright   0.183786
		DustBright  0.350786
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.58624
		Period          19.3646
		Eccentricity    0.971512
		Inclination     -20.1974
		AscendingNode   -80.8092
		ArgOfPericenter 95.719
		MeanAnomaly     155.638
	}
}

Comet	"C67"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.60352e-011
	Radius          3.35058
	InertiaMoment   0.39942

	Oblateness      0.00128284

	RotationPeriod  132.017
	Obliquity       357.833
	EqAscendNode    332.641

	AbsMagn         1.02899
	SlopeParam      6.85434
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.523 0.442 0.380)

	Surface
	{
		SurfStyle       0.908541
		OceanStyle      0.646366
		Randomize      (-0.702, -0.943, -0.452)
		colorDistMagn   0.652959
		colorDistFreq   0.00548508
		detailScale     91.493
		colorConversion true
		snowLevel       2
		tropicLatitude  0.39956
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.405032
		terraceProb     0.320117
		erosion         0
		montesMagn      0.381603
		montesFreq      3.83328
		montesSpiky     0.925561
		montesFraction  0.597289
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0227856
		hillsFraction   0.806515
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230114
		craterFreq      0.204748
		craterDensity   0.936673
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   131.186
		volcanoTemp     1281.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.155, 0.152, 0.050)
		colorShelf     (0.209, 0.181, 0.175, 0.040)
		colorBeach     (0.241, 0.208, 0.198, 0.030)
		colorDesert    (0.272, 0.234, 0.224, 0.020)
		colorLowland   (0.304, 0.261, 0.247, 0.030)
		colorUpland    (0.335, 0.288, 0.270, 0.050)
		colorRock      (0.366, 0.314, 0.300, 0.020)
		colorSnow      (0.366, 0.314, 0.300, 1.000)
		BumpHeight      3.01552
		BumpOffset      0.603104
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.530378
		GasToDust   0.25
		Particles   2051
		GasBright   0.0882469
		DustBright  0.130812
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.74336
		Period          12.956
		Eccentricity    0.959302
		Inclination     -155.151
		AscendingNode   -51.3042
		ArgOfPericenter -41.6832
		MeanAnomaly     99.1128
	}
}

Comet	"C68"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.24021e-007
	Radius          72.4638
	InertiaMoment   0.398151

	Oblateness      0.00217085

	RotationPeriod  115.787
	Obliquity       311.039
	EqAscendNode    317.218

	AbsMagn         4.22882
	SlopeParam      5.19154
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.801 0.779 0.738)

	Surface
	{
		SurfStyle       0.746656
		OceanStyle      0.689536
		Randomize      (0.084, -0.729, -0.586)
		colorDistMagn   0.617057
		colorDistFreq   3.15289
		detailScale     1978.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.978643
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.345537
		terraceProb     0.538253
		erosion         0
		montesMagn      0.498371
		montesFreq      3.10019
		montesSpiky     0.957883
		montesFraction  0.306465
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.87123
		hillsFraction   0.64249
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251426
		craterFreq      0.188897
		craterDensity   0.693039
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.2611
		volcanoTemp     1409.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.265, 0.207, 0.000)
		colorShelf     (0.320, 0.273, 0.236, 0.000)
		colorBeach     (0.376, 0.319, 0.280, 0.000)
		colorDesert    (0.409, 0.343, 0.273, 0.000)
		colorLowland   (0.449, 0.366, 0.310, 0.000)
		colorUpland    (0.497, 0.444, 0.376, 0.000)
		colorRock      (0.537, 0.483, 0.406, 0.000)
		colorSnow      (0.585, 0.514, 0.428, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.324961
		DustBright  0.378584
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.97105
		Period          14.602
		Eccentricity    0.959237
		Inclination     140.746
		AscendingNode   -50.6154
		ArgOfPericenter -126.363
		MeanAnomaly     -71.5485
	}
}

Comet	"C69"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.8187e-015
	Radius          0.207472
	InertiaMoment   0.399846

	Oblateness      0.00194097

	RotationPeriod  107.25
	Obliquity       264.244
	EqAscendNode    301.796

	AbsMagn         5.96082
	SlopeParam      4.12761
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.692 0.688 0.683)

	Surface
	{
		SurfStyle       0.972077
		OceanStyle      0.255632
		Randomize      (0.470, 0.055, 0.318)
		colorDistMagn   0.255825
		colorDistFreq   2.60995e-005
		detailScale     5.66538
		colorConversion true
		snowLevel       2
		tropicLatitude  0.695053
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494688
		terraceProb     0.15149
		erosion         0
		montesMagn      0.512794
		montesFreq      3.08504
		montesSpiky     0.955422
		montesFraction  0.699525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000109784
		hillsFraction   0.691164
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232591
		craterFreq      0.199053
		craterDensity   1.07691
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   526.391
		volcanoTemp     1835.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.241, 0.273, 0.050)
		colorShelf     (0.277, 0.282, 0.314, 0.040)
		colorBeach     (0.318, 0.323, 0.355, 0.030)
		colorDesert    (0.360, 0.364, 0.403, 0.020)
		colorLowland   (0.401, 0.406, 0.444, 0.030)
		colorUpland    (0.443, 0.447, 0.485, 0.050)
		colorRock      (0.484, 0.488, 0.540, 0.020)
		colorSnow      (0.484, 0.488, 0.540, 1.000)
		BumpHeight      0.186725
		BumpOffset      0.037345
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.082012
		GasToDust   0.25
		Particles   1145
		GasBright   0.00812395
		DustBright  0.379908
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.60309
		Period          19.5012
		Eccentricity    0.945761
		Inclination     -93.8744
		AscendingNode   -43.0228
		ArgOfPericenter -85.8212
		MeanAnomaly     -165.523
	}
}

Comet	"C70"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.95349e-011
	Radius          4.48811
	InertiaMoment   0.39872

	Oblateness      0.00284447

	RotationPeriod  101.142
	Obliquity       217.45
	EqAscendNode    286.373

	AbsMagn         7.36874
	SlopeParam      3.10102
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.620 0.500 0.422)

	Surface
	{
		SurfStyle       0.653366
		OceanStyle      0.751186
		Randomize      (0.512, 0.300, 0.050)
		colorDistMagn   0.402526
		colorDistFreq   0.0159564
		detailScale     122.555
		colorConversion true
		snowLevel       2
		tropicLatitude  0.491913
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.365608
		terraceProb     0.190599
		erosion         0
		montesMagn      0.483412
		montesFreq      2.52179
		montesSpiky     0.914527
		montesFraction  0.431714
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0458066
		hillsFraction   0.454241
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242089
		craterFreq      0.21749
		craterDensity   0.687946
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   129.48
		volcanoTemp     1207.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.170, 0.118, 0.000)
		colorShelf     (0.248, 0.175, 0.135, 0.000)
		colorBeach     (0.291, 0.205, 0.160, 0.000)
		colorDesert    (0.316, 0.220, 0.156, 0.000)
		colorLowland   (0.347, 0.235, 0.177, 0.000)
		colorUpland    (0.384, 0.285, 0.215, 0.000)
		colorRock      (0.415, 0.310, 0.232, 0.000)
		colorSnow      (0.452, 0.330, 0.245, 1.000)
		BumpHeight      4.0393
		BumpOffset      0.80786
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.563204
		GasToDust   0.25
		Particles   2117
		GasBright   0.0697854
		DustBright  0.802733
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.24163
		Period          16.6416
		Eccentricity    0.950182
		Inclination     62.2874
		AscendingNode   158.675
		ArgOfPericenter -159.945
		MeanAnomaly     125.623
	}
}

Comet	"C71"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.28431e-007
	Radius          81.0576
	InertiaMoment   0.396764

	Oblateness      0.00237405

	RotationPeriod  96.2679
	Obliquity       170.656
	EqAscendNode    270.95

	AbsMagn         8.70047
	SlopeParam      7.73216
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.599 0.596 0.594)

	Surface
	{
		SurfStyle       0.0915257
		OceanStyle      0.0796699
		Randomize      (0.310, -0.331, -0.978)
		colorDistMagn   0.960418
		colorDistFreq   1.53988
		detailScale     2213.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.498684
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381344
		terraceProb     0.414437
		erosion         0
		montesMagn      0.434686
		montesFreq      3.04853
		montesSpiky     0.97702
		montesFraction  0.494695
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.9242
		hillsFraction   0.763624
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232924
		craterFreq      0.257755
		craterDensity   0.818437
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.5902
		volcanoTemp     1211.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.238, 0.238, 0.000)
		colorShelf     (0.255, 0.253, 0.253, 0.000)
		colorBeach     (0.270, 0.268, 0.267, 0.000)
		colorDesert    (0.285, 0.283, 0.282, 0.000)
		colorLowland   (0.299, 0.298, 0.297, 0.000)
		colorUpland    (0.314, 0.313, 0.312, 0.000)
		colorRock      (0.329, 0.328, 0.327, 0.000)
		colorSnow      (0.344, 0.342, 0.342, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0774386
		DustBright  0.479566
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.34721
		Period          17.4611
		Eccentricity    0.934907
		Inclination     142.195
		AscendingNode   -151.136
		ArgOfPericenter -133.091
		MeanAnomaly     39.6733
	}
}

Comet	"C72"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            7.03357e-015
	Radius          0.277977
	InertiaMoment   0.3992

	Oblateness      0.00342522

	RotationPeriod  92.1463
	Obliquity       123.861
	EqAscendNode    255.528

	AbsMagn         10.1173
	SlopeParam      5.47826
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.653 0.651 0.648)

	Surface
	{
		SurfStyle       0.10482
		OceanStyle      0.0982057
		Randomize      (0.130, -0.018, -0.457)
		colorDistMagn   0.178474
		colorDistFreq   1.2667e-005
		detailScale     7.59063
		colorConversion true
		snowLevel       2
		tropicLatitude  0.550994
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.484387
		terraceProb     0.133192
		erosion         0
		montesMagn      0.448938
		montesFreq      3.10368
		montesSpiky     0.872256
		montesFraction  0.706286
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000135656
		hillsFraction   0.713454
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.196973
		craterFreq      0.269316
		craterDensity   0.852419
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   519.669
		volcanoTemp     1240.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.260, 0.259, 0.000)
		colorShelf     (0.278, 0.277, 0.275, 0.000)
		colorBeach     (0.294, 0.293, 0.292, 0.000)
		colorDesert    (0.310, 0.309, 0.308, 0.000)
		colorLowland   (0.327, 0.325, 0.324, 0.000)
		colorUpland    (0.343, 0.342, 0.340, 0.000)
		colorRock      (0.359, 0.358, 0.356, 0.000)
		colorSnow      (0.376, 0.374, 0.372, 1.000)
		BumpHeight      0.250179
		BumpOffset      0.0500359
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.114838
		GasToDust   0.25
		Particles   1211
		GasBright   0.0478327
		DustBright  0.193659
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.08683
		Period          15.4639
		Eccentricity    0.965719
		Inclination     -23.1423
		AscendingNode   170.802
		ArgOfPericenter 71.536
		MeanAnomaly     -94.4585
	}
}

Comet	"C73"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.43996e-011
	Radius          5.01902
	InertiaMoment   0.397806

	Oblateness      0.00280907

	RotationPeriod  88.5341
	Obliquity       77.067
	EqAscendNode    240.105

	AbsMagn         11.879
	SlopeParam      4.3588
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.513 0.411 0.376)

	Surface
	{
		SurfStyle       0.17431
		OceanStyle      0.4852
		Randomize      (0.123, 0.052, -0.140)
		colorDistMagn   0.165411
		colorDistFreq   0.0179902
		detailScale     137.053
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988611
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.484582
		terraceProb     0.410787
		erosion         0
		montesMagn      0.510485
		montesFreq      3.43732
		montesSpiky     0.911163
		montesFraction  0.344
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0605686
		hillsFraction   0.452999
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226031
		craterFreq      0.183062
		craterDensity   0.862233
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   106.691
		volcanoTemp     1587.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.164, 0.150, 0.000)
		colorShelf     (0.218, 0.175, 0.160, 0.000)
		colorBeach     (0.231, 0.185, 0.169, 0.000)
		colorDesert    (0.244, 0.195, 0.178, 0.000)
		colorLowland   (0.257, 0.205, 0.188, 0.000)
		colorUpland    (0.270, 0.216, 0.197, 0.000)
		colorRock      (0.282, 0.226, 0.207, 0.000)
		colorSnow      (0.295, 0.236, 0.216, 1.000)
		BumpHeight      4.51712
		BumpOffset      0.903423
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.59603
		GasToDust   0.25
		Particles   2183
		GasBright   0.186662
		DustBright  0.539317
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.05591
		Period          15.2321
		Eccentricity    0.942458
		Inclination     112.213
		AscendingNode   -105.104
		ArgOfPericenter 173.319
		MeanAnomaly     90.7166
	}
}

Comet	"C74"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.20741e-007
	Radius          108.631
	InertiaMoment   0.399638

	Oblateness      0.00399546

	RotationPeriod  85.2896
	Obliquity       30.2727
	EqAscendNode    224.683

	AbsMagn         15.3063
	SlopeParam      3.34841
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.774 0.771 0.770)

	Surface
	{
		SurfStyle       0.91568
		OceanStyle      0.210347
		Randomize      (-0.566, 0.008, 0.662)
		colorDistMagn   0.115519
		colorDistFreq   7.65348
		detailScale     2966.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0.365155
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.614446
		terraceProb     0.6849
		erosion         0
		montesMagn      0.555096
		montesFreq      3.06986
		montesSpiky     0.854037
		montesFraction  0.335933
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.6059
		hillsFraction   0.692229
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228777
		craterFreq      0.449385
		craterDensity   0.755891
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.2575
		volcanoTemp     1940.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.270, 0.308, 0.050)
		colorShelf     (0.310, 0.316, 0.354, 0.040)
		colorBeach     (0.356, 0.363, 0.400, 0.030)
		colorDesert    (0.403, 0.409, 0.454, 0.020)
		colorLowland   (0.449, 0.455, 0.500, 0.030)
		colorUpland    (0.496, 0.501, 0.547, 0.050)
		colorRock      (0.542, 0.548, 0.608, 0.020)
		colorSnow      (0.542, 0.548, 0.608, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.129774
		DustBright  0.280691
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.51476
		Period          18.7884
		Eccentricity    0.954115
		Inclination     -140.347
		AscendingNode   -145.783
		ArgOfPericenter 79.6144
		MeanAnomaly     -20.0056
	}
}

Comet	"C75"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.29549e-014
	Radius          0.310767
	InertiaMoment   0.398455

	Oblateness      0.00324645

	RotationPeriod  82.3227
	Obliquity       343.478
	EqAscendNode    209.26

	AbsMagn         3.0051
	SlopeParam      2.1183
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.578 0.573 0.567)

	Surface
	{
		SurfStyle       0.882342
		OceanStyle      0.121814
		Randomize      (-0.487, -0.424, -0.350)
		colorDistMagn   0.532521
		colorDistFreq   2.98765e-005
		detailScale     8.486
		colorConversion true
		snowLevel       2
		tropicLatitude  0.925718
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.558207
		terraceProb     0.245345
		erosion         0
		montesMagn      0.413059
		montesFreq      2.64713
		montesSpiky     0.891088
		montesFraction  0.761463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000279153
		hillsFraction   0.740272
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252826
		craterFreq      0.185065
		craterDensity   0.867609
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   428.078
		volcanoTemp     2040.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.201, 0.227, 0.050)
		colorShelf     (0.231, 0.235, 0.261, 0.040)
		colorBeach     (0.266, 0.270, 0.295, 0.030)
		colorDesert    (0.301, 0.304, 0.335, 0.020)
		colorLowland   (0.335, 0.338, 0.369, 0.030)
		colorUpland    (0.370, 0.373, 0.403, 0.050)
		colorRock      (0.405, 0.407, 0.448, 0.020)
		colorSnow      (0.405, 0.407, 0.448, 1.000)
		BumpHeight      0.27969
		BumpOffset      0.055938
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.147664
		GasToDust   0.25
		Particles   1278
		GasBright   0.335793
		DustBright  0.559159
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.35816
		Period          10.3254
		Eccentricity    0.927212
		Inclination     -106.704
		AscendingNode   67.8605
		ArgOfPericenter -126.798
		MeanAnomaly     -38.8748
	}
}

Comet	"C76"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.00197e-010
	Radius          6.72829
	InertiaMoment   0.395461

	Oblateness      0.00450855

	RotationPeriod  79.5724
	Obliquity       296.684
	EqAscendNode    193.837

	AbsMagn         5.15012
	SlopeParam      5.79923
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.778 0.775 0.771)

	Surface
	{
		SurfStyle       0.625992
		OceanStyle      0.364909
		Randomize      (-0.150, 0.064, -0.123)
		colorDistMagn   0.152395
		colorDistFreq   0.0186076
		detailScale     183.727
		colorConversion true
		snowLevel       2
		tropicLatitude  0.793887
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.659173
		terraceProb     0.206582
		erosion         0
		montesMagn      0.416752
		montesFreq      3.44679
		montesSpiky     0.968322
		montesFraction  0.321311
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.133278
		hillsFraction   0.76526
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242226
		craterFreq      0.236879
		craterDensity   0.877537
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   105.386
		volcanoTemp     1451.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.264, 0.216, 0.000)
		colorShelf     (0.311, 0.271, 0.247, 0.000)
		colorBeach     (0.365, 0.318, 0.293, 0.000)
		colorDesert    (0.397, 0.341, 0.285, 0.000)
		colorLowland   (0.435, 0.364, 0.324, 0.000)
		colorUpland    (0.482, 0.442, 0.393, 0.000)
		colorRock      (0.521, 0.481, 0.424, 0.000)
		colorSnow      (0.568, 0.512, 0.447, 1.000)
		BumpHeight      6.05546
		BumpOffset      1.21109
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.628856
		GasToDust   0.25
		Particles   2250
		GasBright   0.251623
		DustBright  0.327815
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.62627
		Period          5.91342
		Eccentricity    0.920239
		Inclination     -162.849
		AscendingNode   -47.2167
		ArgOfPericenter 169.939
		MeanAnomaly     122.999
	}
}

Comet	"C77"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            7.74952e-007
	Radius          121.406
	InertiaMoment   0.398971

	Oblateness      0.00370632

	RotationPeriod  76.9951
	Obliquity       249.89
	EqAscendNode    178.415

	AbsMagn         6.67568
	SlopeParam      4.5949
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.581 0.573 0.570)

	Surface
	{
		SurfStyle       0.774668
		OceanStyle      0.544863
		Randomize      (0.408, -0.293, 0.866)
		colorDistMagn   0.0445135
		colorDistFreq   4.97141
		detailScale     3315.2
		colorConversion true
		snowLevel       2
		tropicLatitude  0.86134
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.43936
		terraceProb     0.328531
		erosion         0
		montesMagn      0.431072
		montesFreq      2.38913
		montesSpiky     0.993125
		montesFraction  0.58967
		dunesFraction   0
		hillsMagn       0
		hillsFreq       35.2783
		hillsFraction   0.601213
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208528
		craterFreq      0.549544
		craterDensity   1.01075
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.6227
		volcanoTemp     1512.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.195, 0.159, 0.000)
		colorShelf     (0.232, 0.201, 0.182, 0.000)
		colorBeach     (0.273, 0.235, 0.216, 0.000)
		colorDesert    (0.296, 0.252, 0.211, 0.000)
		colorLowland   (0.325, 0.269, 0.239, 0.000)
		colorUpland    (0.360, 0.327, 0.291, 0.000)
		colorRock      (0.389, 0.355, 0.313, 0.000)
		colorSnow      (0.424, 0.378, 0.330, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.130194
		DustBright  0.133731
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.72459
		Period          6.45766
		Eccentricity    0.960513
		Inclination     95.2859
		AscendingNode   -125.254
		ArgOfPericenter -95.277
		MeanAnomaly     -98.0021
	}
}

Comet	"C78"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.38614e-014
	Radius          0.41673
	InertiaMoment   0.39738

	Oblateness      0.00516067

	RotationPeriod  74.5585
	Obliquity       203.096
	EqAscendNode    162.992

	AbsMagn         8.02503
	SlopeParam      3.58618
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.437 0.434 0.432)

	Surface
	{
		SurfStyle       0.68151
		OceanStyle      0.190891
		Randomize      (0.814, -0.715, -0.972)
		colorDistMagn   0.654505
		colorDistFreq   0.000149953
		detailScale     11.3795
		colorConversion true
		snowLevel       2
		tropicLatitude  0.546535
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.344007
		terraceProb     0.448806
		erosion         0
		montesMagn      0.572302
		montesFreq      3.2547
		montesSpiky     0.960527
		montesFraction  0.498819
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000342063
		hillsFraction   0.510716
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23017
		craterFreq      0.178733
		craterDensity   0.883613
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   422.974
		volcanoTemp     1803.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.148, 0.121, 0.000)
		colorShelf     (0.175, 0.152, 0.138, 0.000)
		colorBeach     (0.205, 0.178, 0.164, 0.000)
		colorDesert    (0.223, 0.191, 0.160, 0.000)
		colorLowland   (0.245, 0.204, 0.181, 0.000)
		colorUpland    (0.271, 0.248, 0.220, 0.000)
		colorRock      (0.293, 0.269, 0.237, 0.000)
		colorSnow      (0.319, 0.287, 0.250, 1.000)
		BumpHeight      0.375057
		BumpOffset      0.0750115
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.18049
		GasToDust   0.25
		Particles   1344
		GasBright   0.0391745
		DustBright  0.709237
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.85319
		Period          13.7418
		Eccentricity    0.978059
		Inclination     -11.8727
		AscendingNode   -141.021
		ArgOfPericenter -146.088
		MeanAnomaly     122.131
	}
}

Comet	"C79"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.84551e-010
	Radius          7.5169
	InertiaMoment   0.399425

	Oblateness      0.00420369

	RotationPeriod  72.2379
	Obliquity       156.301
	EqAscendNode    147.57

	AbsMagn         9.37731
	SlopeParam      2.44981
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.635 0.628 0.625)

	Surface
	{
		SurfStyle       0.719591
		OceanStyle      0.146348
		Randomize      (0.328, 0.180, 0.792)
		colorDistMagn   0.513285
		colorDistFreq   0.00524971
		detailScale     205.262
		colorConversion true
		snowLevel       2
		tropicLatitude  0.274013
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.312001
		terraceProb     0.268705
		erosion         0
		montesMagn      0.408737
		montesFreq      3.57074
		montesSpiky     0.895478
		montesFraction  0.506639
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.110083
		hillsFraction   0.923927
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222666
		craterFreq      0.232736
		craterDensity   1.00908
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   86.7535
		volcanoTemp     1653.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.214, 0.175, 0.000)
		colorShelf     (0.254, 0.220, 0.200, 0.000)
		colorBeach     (0.298, 0.258, 0.238, 0.000)
		colorDesert    (0.324, 0.276, 0.231, 0.000)
		colorLowland   (0.356, 0.295, 0.263, 0.000)
		colorUpland    (0.394, 0.358, 0.319, 0.000)
		colorRock      (0.425, 0.389, 0.344, 0.000)
		colorSnow      (0.463, 0.415, 0.363, 1.000)
		BumpHeight      6.76521
		BumpOffset      1.35304
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.661682
		GasToDust   0.25
		Particles   2316
		GasBright   0.04822
		DustBright  0.384678
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.23375
		Period          9.5192
		Eccentricity    0.923692
		Inclination     -171.98
		AscendingNode   11.1974
		ArgOfPericenter 132.308
		MeanAnomaly     -35.4078
	}
}

Comet	"C80"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.68246e-018
	Radius          0.0258112
	InertiaMoment   0.398159

	Oblateness      0.0058562

	RotationPeriod  70.014
	Obliquity       109.507
	EqAscendNode    132.147

	AbsMagn         10.9148
	SlopeParam      6.17496
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.806 0.783 0.747)

	Surface
	{
		SurfStyle       0.777971
		OceanStyle      0.565509
		Randomize      (0.708, -0.504, 0.770)
		colorDistMagn   0.720135
		colorDistFreq   1.81214e-007
		detailScale     0.704817
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996751
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.409289
		terraceProb     0.238521
		erosion         0
		montesMagn      0.499432
		montesFreq      2.24439
		montesSpiky     0.841343
		montesFraction  0.422409
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.80375e-006
		hillsFraction   0.915773
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212939
		craterFreq      0.256233
		craterDensity   0.802499
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1697.64
		volcanoTemp     1416.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.266, 0.209, 0.000)
		colorShelf     (0.322, 0.274, 0.239, 0.000)
		colorBeach     (0.379, 0.321, 0.284, 0.000)
		colorDesert    (0.411, 0.345, 0.276, 0.000)
		colorLowland   (0.451, 0.368, 0.314, 0.000)
		colorUpland    (0.500, 0.447, 0.381, 0.000)
		colorRock      (0.540, 0.486, 0.411, 0.000)
		colorSnow      (0.588, 0.517, 0.433, 1.000)
		BumpHeight      0.0232301
		BumpOffset      0.00464601
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.156354
		DustBright  0.761031
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.32834
		Period          10.1302
		Eccentricity    0.950911
		Inclination     -102.83
		AscendingNode   89.601
		ArgOfPericenter 152.833
		MeanAnomaly     -147.651
	}
}

Comet	"C81"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.39497e-014
	Radius          0.465399
	InertiaMoment   0.399851

	Oblateness      0.00475341

	RotationPeriod  67.8711
	Obliquity       62.7126
	EqAscendNode    116.725

	AbsMagn         13.106
	SlopeParam      4.83963
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.685 0.610 0.546)

	Surface
	{
		SurfStyle       0.604728
		OceanStyle      0.451051
		Randomize      (0.649, -0.895, -0.509)
		colorDistMagn   0.568452
		colorDistFreq   7.84857e-005
		detailScale     12.7085
		colorConversion true
		snowLevel       2
		tropicLatitude  0.890502
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.395735
		terraceProb     0.512136
		erosion         0
		montesMagn      0.387813
		montesFreq      3.06553
		montesSpiky     0.980969
		montesFraction  0.492953
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000543391
		hillsFraction   0.712549
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22987
		craterFreq      0.274624
		craterDensity   0.746084
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   348.059
		volcanoTemp     1715.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.207, 0.153, 0.000)
		colorShelf     (0.274, 0.213, 0.175, 0.000)
		colorBeach     (0.322, 0.250, 0.207, 0.000)
		colorDesert    (0.349, 0.268, 0.202, 0.000)
		colorLowland   (0.384, 0.287, 0.229, 0.000)
		colorUpland    (0.425, 0.348, 0.278, 0.000)
		colorRock      (0.459, 0.378, 0.300, 0.000)
		colorSnow      (0.500, 0.403, 0.316, 1.000)
		BumpHeight      0.418859
		BumpOffset      0.0837718
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.213316
		GasToDust   0.25
		Particles   1410
		GasBright   0.138117
		DustBright  0.463754
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.26223
		Period          9.70184
		Eccentricity    0.960822
		Inclination     -178.907
		AscendingNode   78.466
		ArgOfPericenter -92.9645
		MeanAnomaly     85.4021
	}
}

Comet	"C82"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.39919e-010
	Radius          10.087
	InertiaMoment   0.398726

	Oblateness      0.00663023

	RotationPeriod  65.7964
	Obliquity       15.9183
	EqAscendNode    101.302

	AbsMagn         0.944328
	SlopeParam      3.81822
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.418 0.415 0.413)

	Surface
	{
		SurfStyle       0.258614
		OceanStyle      0.351246
		Randomize      (0.794, -0.446, -0.310)
		colorDistMagn   0.995575
		colorDistFreq   0.0884606
		detailScale     275.442
		colorConversion true
		snowLevel       2
		tropicLatitude  0.900916
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.666084
		terraceProb     0.324123
		erosion         0
		montesMagn      0.488378
		montesFreq      2.2001
		montesSpiky     0.971502
		montesFraction  0.511313
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.237615
		hillsFraction   0.847703
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228132
		craterFreq      0.269662
		craterDensity   0.900925
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   85.7789
		volcanoTemp     1219.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.166, 0.165, 0.000)
		colorShelf     (0.178, 0.177, 0.176, 0.000)
		colorBeach     (0.188, 0.187, 0.186, 0.000)
		colorDesert    (0.198, 0.197, 0.196, 0.000)
		colorLowland   (0.209, 0.208, 0.207, 0.000)
		colorUpland    (0.219, 0.218, 0.217, 0.000)
		colorRock      (0.230, 0.229, 0.227, 0.000)
		colorSnow      (0.240, 0.239, 0.238, 1.000)
		BumpHeight      9.0783
		BumpOffset      1.81566
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.694508
		GasToDust   0.25
		Particles   2382
		GasBright   0.0826211
		DustBright  0.203736
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.19734
		Period          9.2874
		Eccentricity    0.955324
		Inclination     120.697
		AscendingNode   103.97
		ArgOfPericenter 74.5336
		MeanAnomaly     -87.6729
	}
}

Comet	"C83"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.04663e-017
	Radius          0.0288138
	InertiaMoment   0.396784

	Oblateness      0.0053028

	RotationPeriod  63.7792
	Obliquity       329.124
	EqAscendNode    85.8793

	AbsMagn         4.20033
	SlopeParam      2.74333
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.481 0.410 0.366)

	Surface
	{
		SurfStyle       0.784566
		OceanStyle      0.679903
		Randomize      (-0.990, -0.031, -0.707)
		colorDistMagn   0.585727
		colorDistFreq   4.38278e-007
		detailScale     0.786808
		colorConversion true
		snowLevel       2
		tropicLatitude  0.948503
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.519517
		terraceProb     0.193503
		erosion         0
		montesMagn      0.505526
		montesFreq      2.91526
		montesSpiky     0.872449
		montesFraction  0.524991
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.19526e-006
		hillsFraction   0.951393
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250278
		craterFreq      0.187531
		craterDensity   1.04338
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1396.4
		volcanoTemp     1846.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.188, 0.139, 0.103, 0.000)
		colorShelf     (0.192, 0.143, 0.117, 0.000)
		colorBeach     (0.226, 0.168, 0.139, 0.000)
		colorDesert    (0.245, 0.180, 0.136, 0.000)
		colorLowland   (0.269, 0.193, 0.154, 0.000)
		colorUpland    (0.298, 0.234, 0.187, 0.000)
		colorRock      (0.322, 0.254, 0.201, 0.000)
		colorSnow      (0.351, 0.270, 0.212, 1.000)
		BumpHeight      0.0259324
		BumpOffset      0.00518648
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.267922
		DustBright  0.502922
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.99451
		Period          14.7753
		Eccentricity    0.94252
		Inclination     -103.876
		AscendingNode   -77.1351
		ArgOfPericenter -0.470015
		MeanAnomaly     13.7369
	}
}

Comet	"C84"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            8.09496e-014
	Radius          0.624766
	InertiaMoment   0.399206

	Oblateness      0.00750961

	RotationPeriod  61.8104
	Obliquity       282.33
	EqAscendNode    70.4568

	AbsMagn         5.94006
	SlopeParam      6.64908
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.674 0.670 0.665)

	Surface
	{
		SurfStyle       0.330192
		OceanStyle      0.359291
		Randomize      (0.409, -0.365, 0.093)
		colorDistMagn   0.945597
		colorDistFreq   0.000277536
		detailScale     17.0603
		colorConversion true
		snowLevel       2
		tropicLatitude  0.963247
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.673016
		terraceProb     0.554983
		erosion         0
		montesMagn      0.349785
		montesFreq      2.81657
		montesSpiky     0.920649
		montesFraction  0.767973
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00106092
		hillsFraction   0.703174
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245333
		craterFreq      0.255407
		craterDensity   1.0419
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   344.283
		volcanoTemp     1215.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.268, 0.266, 0.000)
		colorShelf     (0.287, 0.285, 0.283, 0.000)
		colorBeach     (0.303, 0.301, 0.299, 0.000)
		colorDesert    (0.320, 0.318, 0.316, 0.000)
		colorLowland   (0.337, 0.335, 0.333, 0.000)
		colorUpland    (0.354, 0.352, 0.349, 0.000)
		colorRock      (0.371, 0.368, 0.366, 0.000)
		colorSnow      (0.388, 0.385, 0.383, 1.000)
		BumpHeight      0.56229
		BumpOffset      0.112458
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.246142
		GasToDust   0.25
		Particles   1477
		GasBright   0.185144
		DustBright  0.270186
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.15627
		Period          15.9886
		Eccentricity    0.962804
		Inclination     165.469
		AscendingNode   104.63
		ArgOfPericenter -137.475
		MeanAnomaly     -56.7208
	}
}

Comet	"C85"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.26088e-010
	Radius          11.2555
	InertiaMoment   0.397816

	Oblateness      0.00601727

	RotationPeriod  59.8822
	Obliquity       235.535
	EqAscendNode    55.0342

	AbsMagn         7.3503
	SlopeParam      5.09766
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.831 0.804 0.765)

	Surface
	{
		SurfStyle       0.999045
		OceanStyle      0.803843
		Randomize      (0.145, 0.917, 0.300)
		colorDistMagn   0.729023
		colorDistFreq   0.0603691
		detailScale     307.349
		colorConversion true
		snowLevel       2
		tropicLatitude  0.835012
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.660872
		terraceProb     0.225324
		erosion         0
		montesMagn      0.516158
		montesFreq      3.71255
		montesSpiky     0.910673
		montesFraction  0.445096
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.260136
		hillsFraction   0.618664
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224518
		craterFreq      0.258381
		craterDensity   1.02093
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   70.5264
		volcanoTemp     1557.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.281, 0.306, 0.050)
		colorShelf     (0.332, 0.330, 0.352, 0.040)
		colorBeach     (0.382, 0.378, 0.398, 0.030)
		colorDesert    (0.432, 0.426, 0.451, 0.020)
		colorLowland   (0.482, 0.474, 0.497, 0.030)
		colorUpland    (0.532, 0.523, 0.543, 0.050)
		colorRock      (0.581, 0.571, 0.604, 0.020)
		colorSnow      (0.581, 0.571, 0.604, 1.000)
		BumpHeight      10.1299
		BumpOffset      2.02598
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.727334
		GasToDust   0.25
		Particles   2449
		GasBright   0.437636
		DustBright  0.502181
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.47555
		Period          18.4749
		Eccentricity    0.976316
		Inclination     151.519
		AscendingNode   -82.2788
		ArgOfPericenter 145.348
		MeanAnomaly     161.799
	}
}

Comet	"C86"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.92777e-017
	Radius          0.0386968
	InertiaMoment   0.399643

	Oblateness      0.00852743

	RotationPeriod  57.9874
	Obliquity       188.741
	EqAscendNode    39.6116

	AbsMagn         8.68199
	SlopeParam      4.04784
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.574 0.569 0.565)

	Surface
	{
		SurfStyle       0.465279
		OceanStyle      0.258248
		Randomize      (-0.533, 0.210, 0.883)
		colorDistMagn   0.807929
		colorDistFreq   1.13174e-006
		detailScale     1.05668
		colorConversion true
		snowLevel       2
		tropicLatitude  0.145597
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439236
		terraceProb     0.266705
		erosion         0
		montesMagn      0.572543
		montesFreq      2.42538
		montesSpiky     0.999898
		montesFraction  0.723193
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.41895e-006
		hillsFraction   0.525489
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239748
		craterFreq      0.161646
		craterDensity   0.795409
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1381.83
		volcanoTemp     1389.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.228, 0.226, 0.000)
		colorShelf     (0.244, 0.242, 0.240, 0.000)
		colorBeach     (0.258, 0.256, 0.254, 0.000)
		colorDesert    (0.273, 0.270, 0.268, 0.000)
		colorLowland   (0.287, 0.284, 0.282, 0.000)
		colorUpland    (0.301, 0.299, 0.296, 0.000)
		colorRock      (0.316, 0.313, 0.311, 0.000)
		colorSnow      (0.330, 0.327, 0.325, 1.000)
		BumpHeight      0.0348271
		BumpOffset      0.00696543
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0154238
		DustBright  0.60888
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.18165
		Period          16.1818
		Eccentricity    0.945286
		Inclination     179.607
		AscendingNode   -19.4463
		ArgOfPericenter -142.366
		MeanAnomaly     30.2899
	}
}

Comet	"C87"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.49099e-013
	Radius          0.696809
	InertiaMoment   0.398462

	Oblateness      0.00684262

	RotationPeriod  56.1199
	Obliquity       141.947
	EqAscendNode    24.189

	AbsMagn         10.0964
	SlopeParam      3.01194
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.516 0.468 0.398)

	Surface
	{
		SurfStyle       0.485937
		OceanStyle      0.671783
		Randomize      (-0.648, -0.082, 0.191)
		colorDistMagn   0.728478
		colorDistFreq   0.000233092
		detailScale     19.0275
		colorConversion true
		snowLevel       2
		tropicLatitude  0.677972
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.468218
		terraceProb     0.133143
		erosion         0
		montesMagn      0.409243
		montesFreq      3.31376
		montesSpiky     0.971226
		montesFraction  0.706982
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00111005
		hillsFraction   0.584529
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224281
		craterFreq      0.224985
		craterDensity   1.02661
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   282.932
		volcanoTemp     1322.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.187, 0.159, 0.000)
		colorShelf     (0.219, 0.199, 0.169, 0.000)
		colorBeach     (0.232, 0.211, 0.179, 0.000)
		colorDesert    (0.245, 0.222, 0.189, 0.000)
		colorLowland   (0.258, 0.234, 0.199, 0.000)
		colorUpland    (0.271, 0.246, 0.209, 0.000)
		colorRock      (0.284, 0.258, 0.219, 0.000)
		colorSnow      (0.296, 0.269, 0.229, 1.000)
		BumpHeight      0.627128
		BumpOffset      0.125426
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.278968
		GasToDust   0.25
		Particles   1543
		GasBright   0.0258615
		DustBright  0.282929
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.6894
		Period          12.5757
		Eccentricity    0.97474
		Inclination     99.7422
		AscendingNode   -172.171
		ArgOfPericenter 122.871
		MeanAnomaly     137.261
	}
}

Comet	"C88"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.15318e-009
	Radius          15.1229
	InertiaMoment   0.395527

	Oblateness      0.00956392

	RotationPeriod  54.274
	Obliquity       95.1526
	EqAscendNode    8.7664

	AbsMagn         11.85
	SlopeParam      7.35114
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.580 0.575 0.572)

	Surface
	{
		SurfStyle       0.250275
		OceanStyle      0.237804
		Randomize      (-0.709, 0.776, -0.775)
		colorDistMagn   0.86771
		colorDistFreq   0.0753768
		detailScale     412.956
		colorConversion true
		snowLevel       2
		tropicLatitude  0.95583
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.617045
		terraceProb     0.334313
		erosion         0
		montesMagn      0.509554
		montesFreq      3.299
		montesSpiky     0.940689
		montesFraction  0.446722
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.528524
		hillsFraction   0.824067
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211213
		craterFreq      0.252076
		craterDensity   0.714285
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   69.8221
		volcanoTemp     1391.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.230, 0.229, 0.000)
		colorShelf     (0.246, 0.244, 0.243, 0.000)
		colorBeach     (0.261, 0.259, 0.257, 0.000)
		colorDesert    (0.275, 0.273, 0.272, 0.000)
		colorLowland   (0.290, 0.287, 0.286, 0.000)
		colorUpland    (0.304, 0.302, 0.300, 0.000)
		colorRock      (0.319, 0.316, 0.314, 0.000)
		colorSnow      (0.333, 0.330, 0.329, 1.000)
		BumpHeight      13.6106
		BumpOffset      2.72212
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.76016
		GasToDust   0.25
		Particles   2515
		GasBright   0.113277
		DustBright  0.68
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.22371
		Period          9.45505
		Eccentricity    0.911956
		Inclination     -123.892
		AscendingNode   72.8458
		ArgOfPericenter 12.144
		MeanAnomaly     146.141
	}
}

Comet	"C89"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.55072e-017
	Radius          0.043137
	InertiaMoment   0.398977

	Oblateness      0.00782099

	RotationPeriod  52.4445
	Obliquity       48.3583
	EqAscendNode    353.344

	AbsMagn         15.2119
	SlopeParam      5.37547
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.644 0.536 0.351)

	Surface
	{
		SurfStyle       0.00688486
		OceanStyle      0.258226
		Randomize      (-0.306, 0.038, -0.563)
		colorDistMagn   0.545538
		colorDistFreq   1.0301e-006
		detailScale     1.17793
		colorConversion true
		snowLevel       2
		tropicLatitude  0.678244
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.280819
		terraceProb     0.102817
		erosion         0
		montesMagn      0.489735
		montesFreq      3.37432
		montesSpiky     0.981833
		montesFraction  0.347774
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.50958e-006
		hillsFraction   0.702878
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229131
		craterFreq      0.160075
		craterDensity   0.900138
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1135
		volcanoTemp     1670.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.215, 0.140, 0.000)
		colorShelf     (0.274, 0.228, 0.149, 0.000)
		colorBeach     (0.290, 0.241, 0.158, 0.000)
		colorDesert    (0.306, 0.255, 0.167, 0.000)
		colorLowland   (0.322, 0.268, 0.175, 0.000)
		colorUpland    (0.338, 0.282, 0.184, 0.000)
		colorRock      (0.354, 0.295, 0.193, 0.000)
		colorSnow      (0.370, 0.308, 0.202, 1.000)
		BumpHeight      0.0388233
		BumpOffset      0.00776465
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0964324
		DustBright  0.381331
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.50487
		Period          5.26379
		Eccentricity    0.900297
		Inclination     77.0779
		AscendingNode   -143.596
		ArgOfPericenter 43.6963
		MeanAnomaly     -1.65301
	}
}

Comet	"C90"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.74622e-013
	Radius          0.936688
	InertiaMoment   0.397393

	Oblateness      0.0110445

	RotationPeriod  50.6264
	Obliquity       1.56397
	EqAscendNode    337.921

	AbsMagn         2.96515
	SlopeParam      4.27809
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.801 0.730 0.688)

	Surface
	{
		SurfStyle       0.181659
		OceanStyle      0.898183
		Randomize      (0.779, -0.705, 0.517)
		colorDistMagn   0.0834962
		colorDistFreq   0.000563154
		detailScale     25.5778
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998942
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575707
		terraceProb     0.360359
		erosion         0
		montesMagn      0.496734
		montesFreq      3.53298
		montesSpiky     0.839301
		montesFraction  0.355
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00258079
		hillsFraction   0.787863
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256914
		craterFreq      0.185712
		craterDensity   0.978637
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   280.242
		volcanoTemp     1277.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.292, 0.275, 0.000)
		colorShelf     (0.341, 0.310, 0.292, 0.000)
		colorBeach     (0.361, 0.329, 0.310, 0.000)
		colorDesert    (0.381, 0.347, 0.327, 0.000)
		colorLowland   (0.401, 0.365, 0.344, 0.000)
		colorUpland    (0.421, 0.383, 0.361, 0.000)
		colorRock      (0.441, 0.402, 0.378, 0.000)
		colorSnow      (0.461, 0.420, 0.396, 1.000)
		BumpHeight      0.843019
		BumpOffset      0.168604
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.311793
		GasToDust   0.25
		Particles   1609
		GasBright   0.251038
		DustBright  0.711212
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.56209
		Period          11.6934
		Eccentricity    0.960577
		Inclination     88.8591
		AscendingNode   162.945
		ArgOfPericenter 56.4384
		MeanAnomaly     157.641
	}
}

Comet	"C91"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.124e-009
	Radius          16.8488
	InertiaMoment   0.399431

	Oblateness      0.00900775

	RotationPeriod  48.815
	Obliquity       314.77
	EqAscendNode    322.499

	AbsMagn         5.12661
	SlopeParam      3.26377
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.657 0.652 0.648)

	Surface
	{
		SurfStyle       0.324312
		OceanStyle      0.202031
		Randomize      (0.999, 0.640, -0.893)
		colorDistMagn   0.755975
		colorDistFreq   0.0234076
		detailScale     460.086
		colorConversion true
		snowLevel       2
		tropicLatitude  0.940843
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.737761
		terraceProb     0.578526
		erosion         0
		montesMagn      0.600584
		montesFreq      2.83658
		montesSpiky     0.954848
		montesFraction  0.26771
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.900738
		hillsFraction   0.634281
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241182
		craterFreq      0.247089
		craterDensity   0.84518
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.3189
		volcanoTemp     1536.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.261, 0.259, 0.000)
		colorShelf     (0.279, 0.277, 0.275, 0.000)
		colorBeach     (0.295, 0.294, 0.291, 0.000)
		colorDesert    (0.312, 0.310, 0.308, 0.000)
		colorLowland   (0.328, 0.326, 0.324, 0.000)
		colorUpland    (0.345, 0.342, 0.340, 0.000)
		colorRock      (0.361, 0.359, 0.356, 0.000)
		colorSnow      (0.378, 0.375, 0.372, 1.000)
		BumpHeight      15.164
		BumpOffset      3.03279
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.792985
		GasToDust   0.25
		Particles   2581
		GasBright   0.206912
		DustBright  0.439825
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.01365
		Period          14.9172
		Eccentricity    0.963088
		Inclination     -114.104
		AscendingNode   -85.466
		ArgOfPericenter -144.473
		MeanAnomaly     -88.5939
	}
}

Comet	"C92"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.53996e-017
	Radius          0.0580172
	InertiaMoment   0.398167

	Oblateness      0.0128205

	RotationPeriod  47.0057
	Obliquity       267.975
	EqAscendNode    307.076

	AbsMagn         6.65643
	SlopeParam      10.0915
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.788 0.786 0.784)

	Surface
	{
		SurfStyle       0.0702994
		OceanStyle      0.380148
		Randomize      (0.273, 0.953, 0.112)
		colorDistMagn   0.146194
		colorDistFreq   1.40149e-006
		detailScale     1.58426
		colorConversion true
		snowLevel       2
		tropicLatitude  0.976522
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.367688
		terraceProb     0.458759
		erosion         0
		montesMagn      0.578544
		montesFreq      3.45204
		montesSpiky     0.966161
		montesFraction  0.426028
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.50844e-006
		hillsFraction   0.416811
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264233
		craterFreq      0.267979
		craterDensity   1.06032
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1124.8
		volcanoTemp     1360.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.314, 0.314, 0.000)
		colorShelf     (0.335, 0.334, 0.333, 0.000)
		colorBeach     (0.355, 0.354, 0.353, 0.000)
		colorDesert    (0.374, 0.373, 0.372, 0.000)
		colorLowland   (0.394, 0.393, 0.392, 0.000)
		colorUpland    (0.414, 0.412, 0.412, 0.000)
		colorRock      (0.433, 0.432, 0.431, 0.000)
		colorSnow      (0.453, 0.452, 0.451, 1.000)
		BumpHeight      0.0522155
		BumpOffset      0.0104431
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.125526
		DustBright  0.205697
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.74359
		Period          20.6528
		Eccentricity    0.975476
		Inclination     121.155
		AscendingNode   -76.673
		ArgOfPericenter -41.8619
		MeanAnomaly     34.452
	}
}

Comet	"C93"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.05819e-013
	Radius          1.04297
	InertiaMoment   0.399857

	Oblateness      0.0104841

	RotationPeriod  45.1938
	Obliquity       221.181
	EqAscendNode    291.653

	AbsMagn         8.00682
	SlopeParam      5.68282
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.620 0.616 0.615)

	Surface
	{
		SurfStyle       0.616651
		OceanStyle      0.660382
		Randomize      (-0.066, 0.604, 0.800)
		colorDistMagn   0.706416
		colorDistFreq   0.000192625
		detailScale     28.4802
		colorConversion true
		snowLevel       2
		tropicLatitude  0.937708
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570566
		terraceProb     0.150236
		erosion         0
		montesMagn      0.470358
		montesFreq      3.37398
		montesSpiky     0.97018
		montesFraction  0.582308
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00216415
		hillsFraction   0.594261
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26497
		craterFreq      0.252405
		craterDensity   0.740367
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   229.923
		volcanoTemp     1631.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.209, 0.172, 0.000)
		colorShelf     (0.248, 0.216, 0.197, 0.000)
		colorBeach     (0.291, 0.253, 0.234, 0.000)
		colorDesert    (0.316, 0.271, 0.227, 0.000)
		colorLowland   (0.347, 0.290, 0.258, 0.000)
		colorUpland    (0.384, 0.351, 0.313, 0.000)
		colorRock      (0.415, 0.382, 0.338, 0.000)
		colorSnow      (0.452, 0.407, 0.356, 1.000)
		BumpHeight      0.938677
		BumpOffset      0.187735
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.344619
		GasToDust   0.25
		Particles   1675
		GasBright   0.357299
		DustBright  0.458411
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.1
		Period          8.67716
		Eccentricity    0.929274
		Inclination     69.4191
		AscendingNode   -6.86631
		ArgOfPericenter -142.438
		MeanAnomaly     10.9944
	}
}

Comet	"C94"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.91215e-009
	Radius          22.6736
	InertiaMoment   0.398733

	Oblateness      0.0150558

	RotationPeriod  43.3748
	Obliquity       174.387
	EqAscendNode    276.231

	AbsMagn         9.35801
	SlopeParam      4.51209
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.474 0.470 0.467)

	Surface
	{
		SurfStyle       0.847387
		OceanStyle      0.989596
		Randomize      (0.127, -0.764, 0.980)
		colorDistMagn   0.501762
		colorDistFreq   0.116743
		detailScale     619.141
		colorConversion true
		snowLevel       2
		tropicLatitude  0.932305
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.384372
		terraceProb     0.39174
		erosion         0
		montesMagn      0.558162
		montesFreq      3.68134
		montesSpiky     0.942355
		montesFraction  0.420917
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.34214
		hillsFraction   0.441754
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.281626
		craterFreq      0.223052
		craterDensity   0.911406
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   56.8354
		volcanoTemp     1439.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.160, 0.131, 0.000)
		colorShelf     (0.190, 0.165, 0.150, 0.000)
		colorBeach     (0.223, 0.193, 0.178, 0.000)
		colorDesert    (0.242, 0.207, 0.173, 0.000)
		colorLowland   (0.265, 0.221, 0.196, 0.000)
		colorUpland    (0.294, 0.268, 0.238, 0.000)
		colorRock      (0.318, 0.291, 0.257, 0.000)
		colorSnow      (0.346, 0.310, 0.271, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.825811
		GasToDust   0.25
		Particles   2648
		GasBright   0.248631
		DustBright  0.251565
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.12377
		Period          15.7423
		Eccentricity    0.925644
		Inclination     -113.287
		AscendingNode   110.709
		ArgOfPericenter -46.2563
		MeanAnomaly     -99.5828
	}
}

Comet	"C95"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.20458e-016
	Radius          0.0645595
	InertiaMoment   0.396803

	Oblateness      0.0122157

	RotationPeriod  41.5439
	Obliquity       127.592
	EqAscendNode    260.808

	AbsMagn         10.8911
	SlopeParam      3.5044
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.569 0.486 0.443)

	Surface
	{
		SurfStyle       0.214808
		OceanStyle      0.643603
		Randomize      (0.869, -0.811, -0.912)
		colorDistMagn   0.911072
		colorDistFreq   2.33609e-006
		detailScale     1.7629
		colorConversion true
		snowLevel       2
		tropicLatitude  0.942671
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52122
		terraceProb     0.66098
		erosion         0
		montesMagn      0.57281
		montesFreq      4.02552
		montesSpiky     0.941876
		montesFraction  0.376615
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.56127e-006
		hillsFraction   0.540779
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213217
		craterFreq      0.251571
		craterDensity   0.818602
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   922.249
		volcanoTemp     1592.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.194, 0.177, 0.000)
		colorShelf     (0.242, 0.206, 0.188, 0.000)
		colorBeach     (0.256, 0.218, 0.200, 0.000)
		colorDesert    (0.270, 0.231, 0.211, 0.000)
		colorLowland   (0.284, 0.243, 0.222, 0.000)
		colorUpland    (0.299, 0.255, 0.233, 0.000)
		colorRock      (0.313, 0.267, 0.244, 0.000)
		colorSnow      (0.327, 0.279, 0.255, 1.000)
		BumpHeight      0.0581035
		BumpOffset      0.0116207
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0552534
		DustBright  0.929429
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.30554
		Period          9.98174
		Eccentricity    0.947497
		Inclination     58.9873
		AscendingNode   -162.602
		ArgOfPericenter 68.3895
		MeanAnomaly     102.451
	}
}

Comet	"C96"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            9.31656e-013
	Radius          1.40438
	InertiaMoment   0.399211

	Oblateness      0.0179688

	RotationPeriod  39.6961
	Obliquity       80.7982
	EqAscendNode    245.386

	AbsMagn         13.0651
	SlopeParam      2.33983
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.695 0.692 0.688)

	Surface
	{
		SurfStyle       0.238423
		OceanStyle      0.817828
		Randomize      (-0.727, -0.247, 0.558)
		colorDistMagn   0.688645
		colorDistFreq   0.00104604
		detailScale     38.349
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97672
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.293817
		terraceProb     0.3568
		erosion         0
		montesMagn      0.433118
		montesFreq      2.73571
		montesSpiky     0.94666
		montesFraction  0.396092
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00398157
		hillsFraction   0.596695
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258024
		craterFreq      0.260658
		craterDensity   0.977374
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   228.12
		volcanoTemp     1266.38
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
		colorSnow      (0.400, 0.398, 0.396, 1.000)
		BumpHeight      1.26395
		BumpOffset      0.252789
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.377445
		GasToDust   0.25
		Particles   1742
		GasBright   0.0770603
		DustBright  0.592109
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.39876
		Period          17.8661
		Eccentricity    0.95111
		Inclination     3.18691
		AscendingNode   -178.247
		ArgOfPericenter 152.776
		MeanAnomaly     -72.6086
	}
}

Comet	"C97"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            7.2057e-009
	Radius          25.2131
	InertiaMoment   0.397825

	Oblateness      0.014729

	RotationPeriod  37.8262
	Obliquity       34.0039
	EqAscendNode    229.963

	AbsMagn         0.85638
	SlopeParam      6.03626
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.631 0.628 0.623)

	Surface
	{
		SurfStyle       0.196129
		OceanStyle      0.489644
		Randomize      (-0.746, 0.552, -0.751)
		colorDistMagn   0.779753
		colorDistFreq   0.264508
		detailScale     688.486
		colorConversion true
		snowLevel       2
		tropicLatitude  0.755776
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.447054
		terraceProb     0.387358
		erosion         0
		montesMagn      0.463337
		montesFreq      2.85727
		montesSpiky     0.942202
		montesFraction  0.669694
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.82207
		hillsFraction   0.540037
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2688
		craterFreq      0.25219
		craterDensity   0.82988
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.5687
		volcanoTemp     1281.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.251, 0.249, 0.000)
		colorShelf     (0.268, 0.267, 0.265, 0.000)
		colorBeach     (0.284, 0.283, 0.280, 0.000)
		colorDesert    (0.300, 0.298, 0.296, 0.000)
		colorLowland   (0.316, 0.314, 0.312, 0.000)
		colorUpland    (0.332, 0.330, 0.327, 0.000)
		colorRock      (0.347, 0.346, 0.343, 0.000)
		colorSnow      (0.363, 0.361, 0.358, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.858637
		GasToDust   0.25
		Particles   2714
		GasBright   0.0616081
		DustBright  0.292048
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.35398
		Period          10.298
		Eccentricity    0.944791
		Inclination     33.8239
		AscendingNode   83.755
		ArgOfPericenter -113.627
		MeanAnomaly     -73.0221
	}
}

Comet	"C98"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.21869e-016
	Radius          0.0869866
	InertiaMoment   0.399648

	Oblateness      0.0219234

	RotationPeriod  35.9284
	Obliquity       347.21
	EqAscendNode    214.54

	AbsMagn         4.17165
	SlopeParam      4.75335
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.664 0.659 0.656)

	Surface
	{
		SurfStyle       0.0461145
		OceanStyle      0.92598
		Randomize      (0.819, 0.686, 0.205)
		colorDistMagn   0.860688
		colorDistFreq   3.45178e-006
		detailScale     2.37531
		colorConversion true
		snowLevel       2
		tropicLatitude  0.426936
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53403
		terraceProb     0.33304
		erosion         0
		montesMagn      0.548088
		montesFreq      3.31712
		montesSpiky     0.922809
		montesFraction  0.116557
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.69892e-005
		hillsFraction   0.644841
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254659
		craterFreq      0.239391
		craterDensity   0.789004
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   915.609
		volcanoTemp     1310.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.264, 0.262, 0.000)
		colorShelf     (0.282, 0.280, 0.279, 0.000)
		colorBeach     (0.299, 0.297, 0.295, 0.000)
		colorDesert    (0.315, 0.313, 0.312, 0.000)
		colorLowland   (0.332, 0.330, 0.328, 0.000)
		colorUpland    (0.348, 0.346, 0.344, 0.000)
		colorRock      (0.365, 0.362, 0.361, 0.000)
		colorSnow      (0.382, 0.379, 0.377, 1.000)
		BumpHeight      0.0782879
		BumpOffset      0.0156576
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.195496
		DustBright  0.642647
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.79533
		Period          13.3259
		Eccentricity    0.945471
		Inclination     -161.814
		AscendingNode   -108.735
		ArgOfPericenter 74.4158
		MeanAnomaly     71.5672
	}
}

Comet	"C99"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.71599e-012
	Radius          1.56052
	InertiaMoment   0.398469

	Oblateness      0.0181984

	RotationPeriod  33.9964
	Obliquity       300.415
	EqAscendNode    199.118

	AbsMagn         5.91924
	SlopeParam      3.73803
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.671 0.556 0.503)

	Surface
	{
		SurfStyle       0.595753
		OceanStyle      0.544263
		Randomize      (-0.250, -0.086, -0.813)
		colorDistMagn   0.175275
		colorDistFreq   0.00210008
		detailScale     42.6127
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955717
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.683193
		terraceProb     0.341563
		erosion         0
		montesMagn      0.641382
		montesFreq      3.45523
		montesSpiky     0.905214
		montesFraction  0.779031
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0042611
		hillsFraction   0.520758
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201028
		craterFreq      0.250903
		craterDensity   0.852607
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   186.775
		volcanoTemp     1586.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.189, 0.141, 0.000)
		colorShelf     (0.269, 0.195, 0.161, 0.000)
		colorBeach     (0.316, 0.228, 0.191, 0.000)
		colorDesert    (0.342, 0.245, 0.186, 0.000)
		colorLowland   (0.376, 0.261, 0.211, 0.000)
		colorUpland    (0.416, 0.317, 0.256, 0.000)
		colorRock      (0.450, 0.345, 0.276, 0.000)
		colorSnow      (0.490, 0.367, 0.291, 1.000)
		BumpHeight      1.40447
		BumpOffset      0.280894
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.410271
		GasToDust   0.25
		Particles   1808
		GasBright   0.152761
		DustBright  0.369868
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.13039
		Period          8.86615
		Eccentricity    0.931885
		Inclination     13.3014
		AscendingNode   179.318
		ArgOfPericenter -157.454
		MeanAnomaly     -10.7843
	}
}

Comet	"C100"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.3272e-008
	Radius          33.9954
	InertiaMoment   0.395589

	Oblateness      0.0271211

	RotationPeriod  32.0232
	Obliquity       253.621
	EqAscendNode    183.695

	AbsMagn         7.33185
	SlopeParam      2.6447
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.477 0.399 0.334)

	Surface
	{
		SurfStyle       0.221486
		OceanStyle      0.862305
		Randomize      (-0.512, -0.571, -0.600)
		colorDistMagn   0.394813
		colorDistFreq   0.319445
		detailScale     928.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996971
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.587371
		terraceProb     0.15564
		erosion         0
		montesMagn      0.476876
		montesFreq      2.28036
		montesSpiky     0.919913
		montesFraction  0.376134
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.103
		hillsFraction   0.753844
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241879
		craterFreq      0.240152
		craterDensity   0.845879
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.2656
		volcanoTemp     1890.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.160, 0.134, 0.000)
		colorShelf     (0.203, 0.170, 0.142, 0.000)
		colorBeach     (0.214, 0.180, 0.150, 0.000)
		colorDesert    (0.226, 0.190, 0.159, 0.000)
		colorLowland   (0.238, 0.200, 0.167, 0.000)
		colorUpland    (0.250, 0.210, 0.176, 0.000)
		colorRock      (0.262, 0.220, 0.184, 0.000)
		colorSnow      (0.274, 0.230, 0.192, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.891463
		GasToDust   0.25
		Particles   2780
		GasBright   0.0727678
		DustBright  0.134348
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.29011
		Period          9.8817
		Eccentricity    0.908919
		Inclination     -12.2125
		AscendingNode   -167.096
		ArgOfPericenter -83.3538
		MeanAnomaly     12.3039
	}
}

Comet	"C101"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.08653e-016
	Radius          0.0965808
	InertiaMoment   0.398982

	Oblateness      0.0233073

	RotationPeriod  30.0008
	Obliquity       206.827
	EqAscendNode    168.273

	AbsMagn         8.66352
	SlopeParam      6.46847
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.663 0.657 0.654)

	Surface
	{
		SurfStyle       0.60168
		OceanStyle      0.496744
		Randomize      (0.568, 0.375, -0.624)
		colorDistMagn   0.818995
		colorDistFreq   1.7077e-006
		detailScale     2.6373
		colorConversion true
		snowLevel       2
		tropicLatitude  0.641316
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.520745
		terraceProb     0.114032
		erosion         0
		montesMagn      0.396641
		montesFreq      3.54913
		montesSpiky     0.91571
		montesFraction  0.382907
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.44097e-005
		hillsFraction   0.627303
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242638
		craterFreq      0.215179
		craterDensity   0.814381
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   749.065
		volcanoTemp     1495.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.223, 0.183, 0.000)
		colorShelf     (0.265, 0.230, 0.209, 0.000)
		colorBeach     (0.312, 0.269, 0.249, 0.000)
		colorDesert    (0.338, 0.289, 0.242, 0.000)
		colorLowland   (0.372, 0.309, 0.275, 0.000)
		colorUpland    (0.411, 0.375, 0.334, 0.000)
		colorRock      (0.444, 0.407, 0.360, 0.000)
		colorSnow      (0.484, 0.434, 0.379, 1.000)
		BumpHeight      0.0869228
		BumpOffset      0.0173846
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.283823
		DustBright  0.407779
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.99623
		Period          14.788
		Eccentricity    0.945717
		Inclination     141.706
		AscendingNode   -76.1599
		ArgOfPericenter 46.0001
		MeanAnomaly     67.3237
	}
}

Comet	"C102"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.16064e-012
	Radius          2.10566
	InertiaMoment   0.397405

	Oblateness      0.0358455

	RotationPeriod  27.9198
	Obliquity       160.032
	EqAscendNode    152.85

	AbsMagn         10.0755
	SlopeParam      5.00615
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.511 0.386 0.310)

	Surface
	{
		SurfStyle       0.567581
		OceanStyle      0.426466
		Randomize      (-0.970, -0.019, 0.867)
		colorDistMagn   0.328957
		colorDistFreq   0.0019909
		detailScale     57.4986
		colorConversion true
		snowLevel       2
		tropicLatitude  0.455536
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.37147
		terraceProb     0.284836
		erosion         0
		montesMagn      0.478486
		montesFreq      2.90366
		montesSpiky     0.950849
		montesFraction  0.69361
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0124351
		hillsFraction   0.65125
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234775
		craterFreq      0.26605
		craterDensity   0.982351
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   185.698
		volcanoTemp     1532.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.131, 0.087, 0.000)
		colorShelf     (0.204, 0.135, 0.099, 0.000)
		colorBeach     (0.240, 0.158, 0.118, 0.000)
		colorDesert    (0.261, 0.170, 0.115, 0.000)
		colorLowland   (0.286, 0.181, 0.130, 0.000)
		colorUpland    (0.317, 0.220, 0.158, 0.000)
		colorRock      (0.342, 0.239, 0.170, 0.000)
		colorSnow      (0.373, 0.255, 0.180, 1.000)
		BumpHeight      1.89509
		BumpOffset      0.379019
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.443097
		GasToDust   0.25
		Particles   1874
		GasBright   0.176547
		DustBright  0.199542
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.261
		Period          9.69391
		Eccentricity    0.946516
		Inclination     -172.446
		AscendingNode   -157.62
		ArgOfPericenter -42.1085
		MeanAnomaly     13.4553
	}
}

Comet	"C103"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.44453e-008
	Radius          37.7125
	InertiaMoment   0.399436

	Oblateness      0.0314938

	RotationPeriod  25.7695
	Obliquity       113.238
	EqAscendNode    137.428

	AbsMagn         11.8211
	SlopeParam      3.96814
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.546 0.448 0.310)

	Surface
	{
		SurfStyle       0.901651
		OceanStyle      0.743832
		Randomize      (0.578, 0.283, 0.557)
		colorDistMagn   0.190888
		colorDistFreq   0.782513
		detailScale     1029.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.890917
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57271
		terraceProb     0.480359
		erosion         0
		montesMagn      0.638348
		montesFreq      3.21266
		montesSpiky     0.974855
		montesFraction  0.471763
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.15913
		hillsFraction   0.743101
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21357
		craterFreq      0.190553
		craterDensity   0.810398
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.8175
		volcanoTemp     1402.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.157, 0.124, 0.050)
		colorShelf     (0.219, 0.184, 0.142, 0.040)
		colorBeach     (0.251, 0.211, 0.161, 0.030)
		colorDesert    (0.284, 0.237, 0.183, 0.020)
		colorLowland   (0.317, 0.264, 0.201, 0.030)
		colorUpland    (0.350, 0.291, 0.220, 0.050)
		colorRock      (0.383, 0.318, 0.245, 0.020)
		colorSnow      (0.383, 0.318, 0.245, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.924289
		GasToDust   0.25
		Particles   2847
		GasBright   0.0245049
		DustBright  0.83607
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.4044
		Period          17.9106
		Eccentricity    0.962682
		Inclination     5.50636
		AscendingNode   -45.8337
		ArgOfPericenter 1.77802
		MeanAnomaly     85.5575
	}
}

Comet	"C104"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            7.5269e-016
	Radius          0.130424
	InertiaMoment   0.398175

	Oblateness      0.0504768

	RotationPeriod  23.5367
	Obliquity       66.4438
	EqAscendNode    122.005

	AbsMagn         15.1213
	SlopeParam      2.92086
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.620 0.614 0.609)

	Surface
	{
		SurfStyle       0.374208
		OceanStyle      0.998369
		Randomize      (-0.545, 0.098, -0.281)
		colorDistMagn   0.877667
		colorDistFreq   1.28786e-005
		detailScale     3.56145
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999607
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.44528
		terraceProb     0.42104
		erosion         0
		montesMagn      0.471674
		montesFreq      2.77265
		montesSpiky     0.97498
		montesFraction  0.400117
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.0801e-005
		hillsFraction   0.498548
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251539
		craterFreq      0.266778
		craterDensity   0.782475
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   745.344
		volcanoTemp     1410.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.246, 0.244, 0.000)
		colorShelf     (0.264, 0.261, 0.259, 0.000)
		colorBeach     (0.279, 0.276, 0.274, 0.000)
		colorDesert    (0.295, 0.292, 0.289, 0.000)
		colorLowland   (0.310, 0.307, 0.304, 0.000)
		colorUpland    (0.326, 0.323, 0.320, 0.000)
		colorRock      (0.341, 0.338, 0.335, 0.000)
		colorSnow      (0.357, 0.353, 0.350, 1.000)
		BumpHeight      0.117382
		BumpOffset      0.0234764
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0477039
		DustBright  0.497358
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.17204
		Period          16.1086
		Eccentricity    0.957038
		Inclination     -143.951
		AscendingNode   -56.8377
		ArgOfPericenter -108.841
		MeanAnomaly     -172.802
	}
}

Comet	"C105"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.82151e-012
	Radius          2.33372
	InertiaMoment   0.399862

	Oblateness      0.0463536

	RotationPeriod  21.2056
	Obliquity       19.6495
	EqAscendNode    106.582

	AbsMagn         2.9247
	SlopeParam      7.06326
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.763 0.761 0.760)

	Surface
	{
		SurfStyle       0.659501
		OceanStyle      0.678968
		Randomize      (0.730, -0.767, 0.875)
		colorDistMagn   0.756657
		colorDistFreq   0.00422971
		detailScale     63.7262
		colorConversion true
		snowLevel       2
		tropicLatitude  0.721658
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.403865
		terraceProb     0.313086
		erosion         0
		montesMagn      0.389786
		montesFreq      3.03513
		montesSpiky     0.949504
		montesFraction  0.683763
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0142878
		hillsFraction   0.65825
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.293488
		craterFreq      0.183368
		craterDensity   0.965152
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   151.648
		volcanoTemp     1404.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.259, 0.213, 0.000)
		colorShelf     (0.305, 0.266, 0.243, 0.000)
		colorBeach     (0.358, 0.312, 0.289, 0.000)
		colorDesert    (0.389, 0.335, 0.281, 0.000)
		colorLowland   (0.427, 0.358, 0.319, 0.000)
		colorUpland    (0.473, 0.434, 0.388, 0.000)
		colorRock      (0.511, 0.472, 0.418, 0.000)
		colorSnow      (0.557, 0.502, 0.441, 1.000)
		BumpHeight      2.10035
		BumpOffset      0.42007
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.475923
		GasToDust   0.25
		Particles   1941
		GasBright   0.0336439
		DustBright  0.195905
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.35377
		Period          10.2966
		Eccentricity    0.935973
		Inclination     -136.886
		AscendingNode   91.1874
		ArgOfPericenter 161.262
		MeanAnomaly     109.347
	}
}

Comet	"C106"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.50252e-008
	Radius          50.9718
	InertiaMoment   0.398739

	Oblateness      0.0794851

	RotationPeriod  18.7562
	Obliquity       332.855
	EqAscendNode    91.1598

	AbsMagn         5.103
	SlopeParam      5.27619
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.490 0.488 0.485)

	Surface
	{
		SurfStyle       0.587853
		OceanStyle      0.222658
		Randomize      (-0.565, 0.269, 0.150)
		colorDistMagn   0.805125
		colorDistFreq   1.57364
		detailScale     1391.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.566171
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.537322
		terraceProb     0.39916
		erosion         0
		montesMagn      0.520344
		montesFreq      2.8907
		montesSpiky     0.90325
		montesFraction  0.489401
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.41598
		hillsFraction   0.58273
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251888
		craterFreq      0.231016
		craterDensity   0.841644
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.6624
		volcanoTemp     1143.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.166, 0.136, 0.000)
		colorShelf     (0.196, 0.171, 0.155, 0.000)
		colorBeach     (0.230, 0.200, 0.184, 0.000)
		colorDesert    (0.250, 0.215, 0.179, 0.000)
		colorLowland   (0.275, 0.229, 0.204, 0.000)
		colorUpland    (0.304, 0.278, 0.247, 0.000)
		colorRock      (0.329, 0.303, 0.267, 0.000)
		colorSnow      (0.358, 0.322, 0.281, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.957115
		GasToDust   0.25
		Particles   2913
		GasBright   0.146813
		DustBright  0.567222
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.2114
		Period          16.4093
		Eccentricity    0.94909
		Inclination     -169.149
		AscendingNode   -125.323
		ArgOfPericenter -109.322
		MeanAnomaly     -39.6407
	}
}

Comet	"C107"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.38636e-015
	Radius          0.144404
	InertiaMoment   0.396821

	Oblateness      0.0784729

	RotationPeriod  16.1634
	Obliquity       286.061
	EqAscendNode    75.7372

	AbsMagn         6.63715
	SlopeParam      4.19782
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.779 0.775 0.772)

	Surface
	{
		SurfStyle       0.228522
		OceanStyle      0.492413
		Randomize      (-0.564, -0.935, 0.350)
		colorDistMagn   0.439975
		colorDistFreq   1.27073e-005
		detailScale     3.9432
		colorConversion true
		snowLevel       2
		tropicLatitude  0.980511
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.699815
		terraceProb     0.501497
		erosion         0
		montesMagn      0.467592
		montesFreq      1.92347
		montesSpiky     0.908422
		montesFraction  0.733219
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.43494e-005
		hillsFraction   0.659907
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255399
		craterFreq      0.244362
		craterDensity   0.717112
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   608.062
		volcanoTemp     1359.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.310, 0.309, 0.000)
		colorShelf     (0.331, 0.329, 0.328, 0.000)
		colorBeach     (0.350, 0.349, 0.348, 0.000)
		colorDesert    (0.370, 0.368, 0.367, 0.000)
		colorLowland   (0.389, 0.388, 0.386, 0.000)
		colorUpland    (0.409, 0.407, 0.406, 0.000)
		colorRock      (0.428, 0.426, 0.425, 0.000)
		colorSnow      (0.448, 0.446, 0.444, 1.000)
		BumpHeight      0.129964
		BumpOffset      0.0259928
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0275572
		GasToDust   0.25
		Particles   1035
		GasBright   0.105471
		DustBright  0.29305
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.56438
		Period          5.57908
		Eccentricity    0.874479
		Inclination     -172.847
		AscendingNode   -130.708
		ArgOfPericenter 165.064
		MeanAnomaly     -177.126
	}
}

Comet	"C108"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.07225e-011
	Radius          3.1572
	InertiaMoment   0.399217

	Oblateness      0.15582

	RotationPeriod  13.3938
	Obliquity       239.267
	EqAscendNode    60.3146

	AbsMagn         7.98862
	SlopeParam      3.17779
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.688 0.686 0.685)

	Surface
	{
		SurfStyle       0.840622
		OceanStyle      0.696457
		Randomize      (-0.713, 0.293, 0.761)
		colorDistMagn   0.344292
		colorDistFreq   0.0053393
		detailScale     86.2126
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999923
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.636131
		terraceProb     0.332866
		erosion         0
		montesMagn      0.502532
		montesFreq      2.79936
		montesSpiky     0.93555
		montesFraction  0.487474
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.032471
		hillsFraction   0.393776
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248793
		craterFreq      0.154392
		craterDensity   1.00298
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   151.168
		volcanoTemp     1404.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.233, 0.192, 0.000)
		colorShelf     (0.275, 0.240, 0.219, 0.000)
		colorBeach     (0.324, 0.281, 0.260, 0.000)
		colorDesert    (0.351, 0.302, 0.254, 0.000)
		colorLowland   (0.386, 0.323, 0.288, 0.000)
		colorUpland    (0.427, 0.391, 0.349, 0.000)
		colorRock      (0.461, 0.425, 0.377, 0.000)
		colorSnow      (0.503, 0.453, 0.397, 1.000)
		BumpHeight      2.84148
		BumpOffset      0.568296
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.508749
		GasToDust   0.25
		Particles   2007
		GasBright   0.285831
		DustBright  0.597177
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.12736
		Period          15.7694
		Eccentricity    0.945918
		Inclination     -102.929
		AscendingNode   83.0127
		ArgOfPericenter 171.043
		MeanAnomaly     -96.754
	}
}

Comet	"C109"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            8.29308e-008
	Radius          56.3733
	InertiaMoment   0.397835

	Oblateness      0.189144

	RotationPeriod  10.4026
	Obliquity       192.472
	EqAscendNode    44.892

	AbsMagn         9.33875
	SlopeParam      8.23747
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.790 0.715 0.671)

	Surface
	{
		SurfStyle       0.972084
		OceanStyle      0.982854
		Randomize      (0.879, 0.071, 0.032)
		colorDistMagn   0.887109
		colorDistFreq   2.22861
		detailScale     1539.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.732005
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435559
		terraceProb     0.247829
		erosion         0
		montesMagn      0.560073
		montesFreq      2.86977
		montesSpiky     0.804354
		montesFraction  0.516631
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.1358
		hillsFraction   0.596609
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234375
		craterFreq      0.229335
		craterDensity   0.831516
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   30.6917
		volcanoTemp     1662.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.250, 0.268, 0.050)
		colorShelf     (0.316, 0.293, 0.309, 0.040)
		colorBeach     (0.363, 0.336, 0.349, 0.030)
		colorDesert    (0.411, 0.379, 0.396, 0.020)
		colorLowland   (0.458, 0.422, 0.436, 0.030)
		colorUpland    (0.505, 0.465, 0.476, 0.050)
		colorRock      (0.553, 0.507, 0.530, 0.020)
		colorSnow      (0.553, 0.507, 0.530, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.989941
		GasToDust   0.25
		Particles   2979
		GasBright   0.217207
		DustBright  0.350288
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.08694
		Period          8.59635
		Eccentricity    0.919218
		Inclination     -120.774
		AscendingNode   168.322
		ArgOfPericenter -101.58
		MeanAnomaly     9.15112
	}
}

Comet	"C110"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.5535e-015
	Radius          0.195558
	InertiaMoment   0.399654

	Oblateness      0.249

	RotationPeriod  7.12626
	Obliquity       145.678
	EqAscendNode    29.4694

	AbsMagn         10.8675
	SlopeParam      5.57186
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.807 0.750 0.728)

	Surface
	{
		SurfStyle       0.858347
		OceanStyle      0.359714
		Randomize      (0.162, 0.812, 0.977)
		colorDistMagn   0.360147
		colorDistFreq   1.84843e-005
		detailScale     5.34004
		colorConversion true
		snowLevel       2
		tropicLatitude  0.863146
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.720429
		terraceProb     0.192928
		erosion         0
		montesMagn      0.481472
		montesFreq      4.22791
		montesSpiky     0.994234
		montesFraction  0.598113
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.52046e-005
		hillsFraction   0.577988
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266993
		craterFreq      0.191631
		craterDensity   0.891744
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   606.756
		volcanoTemp     1604.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.263, 0.291, 0.050)
		colorShelf     (0.323, 0.308, 0.335, 0.040)
		colorBeach     (0.371, 0.353, 0.379, 0.030)
		colorDesert    (0.420, 0.398, 0.430, 0.020)
		colorLowland   (0.468, 0.443, 0.473, 0.030)
		colorUpland    (0.517, 0.488, 0.517, 0.050)
		colorRock      (0.565, 0.533, 0.575, 0.020)
		colorSnow      (0.565, 0.533, 0.575, 1.000)
		BumpHeight      0.176002
		BumpOffset      0.0352004
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.060383
		GasToDust   0.25
		Particles   1101
		GasBright   0.111323
		DustBright  0.140658
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.86974
		Period          7.28987
		Eccentricity    0.919115
		Inclination     28.3667
		AscendingNode   -145.874
		ArgOfPericenter 118.852
		MeanAnomaly     160.971
	}
}

Comet	"C111"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.97495e-011
	Radius          3.48757
	InertiaMoment   0.398476

	Oblateness      0.249

	RotationPeriod  3.47103
	Obliquity       98.8837
	EqAscendNode    14.0468

	AbsMagn         13.0248
	SlopeParam      4.43015
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.649 0.645 0.643)

	Surface
	{
		SurfStyle       0.269757
		OceanStyle      0.585218
		Randomize      (0.806, 0.803, 0.191)
		colorDistMagn   0.810676
		colorDistFreq   0.00718216
		detailScale     95.2339
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979292
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.538664
		terraceProb     0.558977
		erosion         0
		montesMagn      0.597384
		montesFreq      3.13759
		montesSpiky     0.937685
		montesFraction  0.521872
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0226855
		hillsFraction   0.655557
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236605
		craterFreq      0.179332
		craterDensity   1.08411
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   123.041
		volcanoTemp     1504.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.258, 0.257, 0.000)
		colorShelf     (0.276, 0.274, 0.273, 0.000)
		colorBeach     (0.292, 0.290, 0.289, 0.000)
		colorDesert    (0.308, 0.307, 0.305, 0.000)
		colorLowland   (0.324, 0.323, 0.321, 0.000)
		colorUpland    (0.341, 0.339, 0.338, 0.000)
		colorRock      (0.357, 0.355, 0.354, 0.000)
		colorSnow      (0.373, 0.371, 0.370, 1.000)
		BumpHeight      3.13881
		BumpOffset      0.627762
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.541575
		GasToDust   0.25
		Particles   2073
		GasBright   0.000616428
		DustBright  0.735852
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.31989
		Period          10.0751
		Eccentricity    0.936668
		Inclination     -2.82453
		AscendingNode   -171.978
		ArgOfPericenter 119.077
		MeanAnomaly     -87.3995
	}
}

Comet	"C112"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.52748e-007
	Radius          76.4276
	InertiaMoment   0.395647

	Oblateness      0.00171682

	RotationPeriod  126.482
	Obliquity       52.0894
	EqAscendNode    358.624

	AbsMagn         0.764835
	SlopeParam      3.42178
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.820 0.771 0.720)

	Surface
	{
		SurfStyle       0.00334967
		OceanStyle      0.847035
		Randomize      (0.005, 0.664, -0.305)
		colorDistMagn   0.39616
		colorDistFreq   2.82892
		detailScale     2086.98
		colorConversion true
		snowLevel       2
		tropicLatitude  0.961519
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.457498
		terraceProb     0.188275
		erosion         0
		montesMagn      0.694768
		montesFreq      2.59099
		montesSpiky     0.975519
		montesFraction  0.430403
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.1915
		hillsFraction   0.493733
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242985
		craterFreq      0.189047
		craterDensity   0.781093
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   30.6597
		volcanoTemp     1912.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.328, 0.308, 0.288, 0.000)
		colorShelf     (0.349, 0.328, 0.306, 0.000)
		colorBeach     (0.369, 0.347, 0.324, 0.000)
		colorDesert    (0.390, 0.366, 0.342, 0.000)
		colorLowland   (0.410, 0.385, 0.360, 0.000)
		colorUpland    (0.431, 0.405, 0.378, 0.000)
		colorRock      (0.451, 0.424, 0.396, 0.000)
		colorSnow      (0.472, 0.443, 0.414, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0252077
		DustBright  0.395747
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.43499
		Period          10.8341
		Eccentricity    0.924995
		Inclination     -59.5398
		AscendingNode   149.54
		ArgOfPericenter -123.152
		MeanAnomaly     167.285
	}
}

Comet	"C113"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.70323e-015
	Radius          0.215736
	InertiaMoment   0.398988

	Oblateness      0.00158031

	RotationPeriod  113.381
	Obliquity       5.29513
	EqAscendNode    343.202

	AbsMagn         4.14277
	SlopeParam      2.22459
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.413 0.407 0.402)

	Surface
	{
		SurfStyle       0.252996
		OceanStyle      0.375057
		Randomize      (0.483, -0.092, -0.617)
		colorDistMagn   0.952014
		colorDistFreq   3.11011e-005
		detailScale     5.89103
		colorConversion true
		snowLevel       2
		tropicLatitude  0.501939
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.415626
		terraceProb     0.422141
		erosion         0
		montesMagn      0.481296
		montesFreq      2.37114
		montesSpiky     0.867491
		montesFraction  0.524278
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000126807
		hillsFraction   0.671552
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249576
		craterFreq      0.214083
		craterDensity   0.942934
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   493.208
		volcanoTemp     1571.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.163, 0.161, 0.000)
		colorShelf     (0.175, 0.173, 0.171, 0.000)
		colorBeach     (0.186, 0.183, 0.181, 0.000)
		colorDesert    (0.196, 0.194, 0.191, 0.000)
		colorLowland   (0.206, 0.204, 0.201, 0.000)
		colorUpland    (0.217, 0.214, 0.211, 0.000)
		colorRock      (0.227, 0.224, 0.221, 0.000)
		colorSnow      (0.237, 0.234, 0.231, 1.000)
		BumpHeight      0.194162
		BumpOffset      0.0388325
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.093209
		GasToDust   0.25
		Particles   1168
		GasBright   0.107682
		DustBright  0.797759
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.73901
		Period          12.9252
		Eccentricity    0.943166
		Inclination     34.8548
		AscendingNode   -155.005
		ArgOfPericenter 137.684
		MeanAnomaly     -155.87
	}
}

Comet	"C114"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.63761e-011
	Radius          4.73398
	InertiaMoment   0.397417

	Oblateness      0.00247299

	RotationPeriod  105.624
	Obliquity       318.501
	EqAscendNode    327.779

	AbsMagn         5.89838
	SlopeParam      5.90672
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.697 0.638 0.550)

	Surface
	{
		SurfStyle       0.0442725
		OceanStyle      0.939821
		Randomize      (0.221, -0.476, 0.097)
		colorDistMagn   0.0485178
		colorDistFreq   0.00262861
		detailScale     129.269
		colorConversion true
		snowLevel       2
		tropicLatitude  0.427535
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.574444
		terraceProb     0.535768
		erosion         0
		montesMagn      0.537751
		montesFreq      3.13821
		montesSpiky     0.864028
		montesFraction  0.429859
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0466351
		hillsFraction   0.549461
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248755
		craterFreq      0.213277
		craterDensity   0.838816
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   123.062
		volcanoTemp     1685.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.255, 0.220, 0.000)
		colorShelf     (0.296, 0.271, 0.234, 0.000)
		colorBeach     (0.313, 0.287, 0.248, 0.000)
		colorDesert    (0.331, 0.303, 0.261, 0.000)
		colorLowland   (0.348, 0.319, 0.275, 0.000)
		colorUpland    (0.366, 0.335, 0.289, 0.000)
		colorRock      (0.383, 0.351, 0.303, 0.000)
		colorSnow      (0.401, 0.367, 0.316, 1.000)
		BumpHeight      4.26058
		BumpOffset      0.852116
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.574401
		GasToDust   0.25
		Particles   2140
		GasBright   0.104991
		DustBright  0.484937
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.39946
		Period          10.5978
		Eccentricity    0.963459
		Inclination     -162.849
		AscendingNode   -15.4477
		ArgOfPericenter 60.561
		MeanAnomaly     0.897763
	}
}

Comet	"C115"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.81342e-007
	Radius          84.1906
	InertiaMoment   0.399441

	Oblateness      0.00202664

	RotationPeriod  99.8811
	Obliquity       271.707
	EqAscendNode    312.356

	AbsMagn         7.31338
	SlopeParam      4.66846
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.621 0.565 0.475)

	Surface
	{
		SurfStyle       0.850603
		OceanStyle      0.779621
		Randomize      (-0.893, 0.954, 0.515)
		colorDistMagn   0.433531
		colorDistFreq   4.08612
		detailScale     2298.97
		colorConversion true
		snowLevel       2
		tropicLatitude  0.568013
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.385774
		terraceProb     0.38548
		erosion         0
		montesMagn      0.482431
		montesFreq      2.66127
		montesSpiky     0.874926
		montesFraction  0.790612
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.141
		hillsFraction   0.563154
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237661
		craterFreq      0.262819
		craterDensity   0.961276
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.8858
		volcanoTemp     1558.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.198, 0.190, 0.050)
		colorShelf     (0.248, 0.232, 0.219, 0.040)
		colorBeach     (0.286, 0.266, 0.247, 0.030)
		colorDesert    (0.323, 0.300, 0.280, 0.020)
		colorLowland   (0.360, 0.334, 0.309, 0.030)
		colorUpland    (0.397, 0.367, 0.338, 0.050)
		colorRock      (0.434, 0.401, 0.376, 0.020)
		colorSnow      (0.434, 0.401, 0.376, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0650411
		DustBright  0.209373
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.18339
		Period          16.1951
		Eccentricity    0.931687
		Inclination     74.3898
		AscendingNode   32.1569
		ArgOfPericenter 110.684
		MeanAnomaly     28.7131
	}
}

Comet	"C116"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            8.66277e-015
	Radius          0.293226
	InertiaMoment   0.398183

	Oblateness      0.00304538

	RotationPeriod  95.219
	Obliquity       224.912
	EqAscendNode    296.934

	AbsMagn         8.64507
	SlopeParam      3.65742
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.581 0.530 0.442)

	Surface
	{
		SurfStyle       0.246359
		OceanStyle      0.770187
		Randomize      (-0.645, -0.902, 0.894)
		colorDistMagn   0.610965
		colorDistFreq   4.29797e-005
		detailScale     8.00703
		colorConversion true
		snowLevel       2
		tropicLatitude  0.796298
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497486
		terraceProb     0.238352
		erosion         0
		montesMagn      0.531442
		montesFreq      2.63559
		montesSpiky     0.986346
		montesFraction  0.392637
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000188445
		hillsFraction   0.717011
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221989
		craterFreq      0.214716
		craterDensity   0.871598
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   493.947
		volcanoTemp     1744.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.212, 0.177, 0.000)
		colorShelf     (0.247, 0.225, 0.188, 0.000)
		colorBeach     (0.261, 0.239, 0.199, 0.000)
		colorDesert    (0.276, 0.252, 0.210, 0.000)
		colorLowland   (0.290, 0.265, 0.221, 0.000)
		colorUpland    (0.305, 0.278, 0.232, 0.000)
		colorRock      (0.319, 0.292, 0.243, 0.000)
		colorSnow      (0.334, 0.305, 0.254, 1.000)
		BumpHeight      0.263904
		BumpOffset      0.0527807
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.126035
		GasToDust   0.25
		Particles   1234
		GasBright   0.224683
		DustBright  0.534218
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.99046
		Period          8.00715
		Eccentricity    0.917152
		Inclination     -171.167
		AscendingNode   28.9327
		ArgOfPericenter -32.5546
		MeanAnomaly     144.315
	}
}

Comet	"C117"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.7e-011
	Radius          5.20638
	InertiaMoment   0.399867

	Oblateness      0.00241584

	RotationPeriod  91.2371
	Obliquity       178.118
	EqAscendNode    281.511

	AbsMagn         10.0547
	SlopeParam      2.54265
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.472 0.464 0.461)

	Surface
	{
		SurfStyle       0.643096
		OceanStyle      0.171997
		Randomize      (0.372, -0.058, 0.050)
		colorDistMagn   0.246218
		colorDistFreq   0.0124233
		detailScale     142.169
		colorConversion true
		snowLevel       2
		tropicLatitude  0.187973
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.582718
		terraceProb     0.692804
		erosion         0
		montesMagn      0.439201
		montesFreq      2.4436
		montesSpiky     0.814633
		montesFraction  0.456569
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0808462
		hillsFraction   0.669398
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24719
		craterFreq      0.181561
		craterDensity   0.861633
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   99.725
		volcanoTemp     1446.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.158, 0.129, 0.000)
		colorShelf     (0.189, 0.162, 0.147, 0.000)
		colorBeach     (0.222, 0.190, 0.175, 0.000)
		colorDesert    (0.241, 0.204, 0.170, 0.000)
		colorLowland   (0.264, 0.218, 0.194, 0.000)
		colorUpland    (0.293, 0.264, 0.235, 0.000)
		colorRock      (0.316, 0.288, 0.253, 0.000)
		colorSnow      (0.344, 0.306, 0.267, 1.000)
		BumpHeight      4.68574
		BumpOffset      0.937148
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.607227
		GasToDust   0.25
		Particles   2206
		GasBright   0.157451
		DustBright  0.285937
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.72421
		Period          6.45557
		Eccentricity    0.900919
		Inclination     170.946
		AscendingNode   20.6854
		ArgOfPericenter 25.7059
		MeanAnomaly     15.4659
	}
}

Comet	"C118"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.18197e-007
	Radius          114.599
	InertiaMoment   0.398746

	Oblateness      0.00358809

	RotationPeriod  87.7238
	Obliquity       131.324
	EqAscendNode    266.089

	AbsMagn         11.7925
	SlopeParam      6.30602
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.589 0.546 0.478)

	Surface
	{
		SurfStyle       0.603109
		OceanStyle      0.386167
		Randomize      (-0.931, 0.251, 0.966)
		colorDistMagn   0.868737
		colorDistFreq   9.51811
		detailScale     3129.31
		colorConversion true
		snowLevel       2
		tropicLatitude  0.765661
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.657538
		terraceProb     0.402442
		erosion         0
		montesMagn      0.492195
		montesFreq      4.30012
		montesSpiky     0.923153
		montesFraction  0.821509
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.2453
		hillsFraction   0.44909
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209052
		craterFreq      0.470213
		craterDensity   0.818799
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.9596
		volcanoTemp     1597.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.186, 0.134, 0.000)
		colorShelf     (0.235, 0.191, 0.153, 0.000)
		colorBeach     (0.277, 0.224, 0.182, 0.000)
		colorDesert    (0.300, 0.240, 0.177, 0.000)
		colorLowland   (0.330, 0.257, 0.201, 0.000)
		colorUpland    (0.365, 0.311, 0.244, 0.000)
		colorRock      (0.394, 0.339, 0.263, 0.000)
		colorSnow      (0.430, 0.360, 0.277, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.384283
		DustBright  0.543591
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.3514
		Period          25.8816
		Eccentricity    0.970239
		Inclination     -176.489
		AscendingNode   110.131
		ArgOfPericenter 38.5236
		MeanAnomaly     5.1583
	}
}

Comet	"C119"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.59557e-014
	Radius          0.321902
	InertiaMoment   0.39684

	Oblateness      0.00276025

	RotationPeriod  84.553
	Obliquity       84.5294
	EqAscendNode    250.666

	AbsMagn         15.0342
	SlopeParam      4.91669
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.536 0.531 0.525)

	Surface
	{
		SurfStyle       0.639403
		OceanStyle      0.0100636
		Randomize      (-0.960, 0.625, 0.547)
		colorDistMagn   0.479019
		colorDistFreq   5.36175e-005
		detailScale     8.79008
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999124
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501916
		terraceProb     0.447867
		erosion         0
		montesMagn      0.579288
		montesFreq      3.84928
		montesSpiky     0.968493
		montesFraction  0.491008
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000270686
		hillsFraction   0.78207
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243052
		craterFreq      0.232361
		craterDensity   0.937213
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   399.551
		volcanoTemp     1512.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.181, 0.147, 0.000)
		colorShelf     (0.215, 0.186, 0.168, 0.000)
		colorBeach     (0.252, 0.218, 0.199, 0.000)
		colorDesert    (0.274, 0.234, 0.194, 0.000)
		colorLowland   (0.300, 0.250, 0.220, 0.000)
		colorUpland    (0.333, 0.303, 0.268, 0.000)
		colorRock      (0.359, 0.329, 0.289, 0.000)
		colorSnow      (0.392, 0.351, 0.304, 1.000)
		BumpHeight      0.289712
		BumpOffset      0.0579424
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.158861
		GasToDust   0.25
		Particles   1300
		GasBright   0.289768
		DustBright  0.322592
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.30365
		Period          17.1214
		Eccentricity    0.957699
		Inclination     -150.004
		AscendingNode   -75.5232
		ArgOfPericenter 59.4505
		MeanAnomaly     90.2258
	}
}

Comet	"C120"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.23406e-010
	Radius          7.09837
	InertiaMoment   0.399223

	Oblateness      0.00414125

	RotationPeriod  81.6431
	Obliquity       37.7351
	EqAscendNode    235.243

	AbsMagn         2.88372
	SlopeParam      3.88839
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.730 0.726 0.724)

	Surface
	{
		SurfStyle       0.0468246
		OceanStyle      0.00351355
		Randomize      (0.035, 0.049, 0.874)
		colorDistMagn   0.705262
		colorDistFreq   0.0259596
		detailScale     193.833
		colorConversion true
		snowLevel       2
		tropicLatitude  0.96245
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58004
		terraceProb     0.413861
		erosion         0
		montesMagn      0.536124
		montesFreq      2.70042
		montesSpiky     0.981827
		montesFraction  0.758335
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0765564
		hillsFraction   0.598434
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230016
		craterFreq      0.265121
		craterDensity   0.737207
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   100.184
		volcanoTemp     1233.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.290, 0.290, 0.000)
		colorShelf     (0.310, 0.309, 0.308, 0.000)
		colorBeach     (0.329, 0.327, 0.326, 0.000)
		colorDesert    (0.347, 0.345, 0.344, 0.000)
		colorLowland   (0.365, 0.363, 0.362, 0.000)
		colorUpland    (0.383, 0.381, 0.380, 0.000)
		colorRock      (0.402, 0.399, 0.398, 0.000)
		colorSnow      (0.420, 0.418, 0.416, 1.000)
		BumpHeight      6.38853
		BumpOffset      1.27771
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.640053
		GasToDust   0.25
		Particles   2272
		GasBright   0.00957163
		DustBright  0.287275
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.76878
		Period          13.1365
		Eccentricity    0.94642
		Inclination     -109.687
		AscendingNode   -21.0219
		ArgOfPericenter -67.4749
		MeanAnomaly     -120
	}
}

Comet	"C121"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.79976e-018
	Radius          0.019898
	InertiaMoment   0.397844

	Oblateness      0.00315273

	RotationPeriod  78.9379
	Obliquity       350.941
	EqAscendNode    219.821

	AbsMagn         5.07929
	SlopeParam      2.82748
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.584 0.582 0.580)

	Surface
	{
		SurfStyle       0.711335
		OceanStyle      0.768924
		Randomize      (0.536, 0.639, -0.193)
		colorDistMagn   0.797859
		colorDistFreq   2.63905e-007
		detailScale     0.543348
		colorConversion true
		snowLevel       2
		tropicLatitude  0.787414
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.387723
		terraceProb     0.31396
		erosion         0
		montesMagn      0.33264
		montesFreq      2.83053
		montesSpiky     0.808053
		montesFraction  0.888781
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.85354e-007
		hillsFraction   0.602572
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261648
		craterFreq      0.22434
		craterDensity   1.06327
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1600.43
		volcanoTemp     1639.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.198, 0.162, 0.000)
		colorShelf     (0.234, 0.204, 0.186, 0.000)
		colorBeach     (0.275, 0.239, 0.220, 0.000)
		colorDesert    (0.298, 0.256, 0.214, 0.000)
		colorLowland   (0.327, 0.274, 0.243, 0.000)
		colorUpland    (0.362, 0.332, 0.296, 0.000)
		colorRock      (0.392, 0.361, 0.319, 0.000)
		colorSnow      (0.427, 0.384, 0.336, 1.000)
		BumpHeight      0.0179082
		BumpOffset      0.00358164
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0713276
		DustBright  0.710006
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.13632
		Period          8.90322
		Eccentricity    0.966592
		Inclination     -122.921
		AscendingNode   -52.9026
		ArgOfPericenter 148.085
		MeanAnomaly     10.6298
	}
}

Comet	"C122"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.93884e-014
	Radius          0.439681
	InertiaMoment   0.399659

	Oblateness      0.00472743

	RotationPeriod  76.397
	Obliquity       304.146
	EqAscendNode    204.398

	AbsMagn         6.61785
	SlopeParam      6.8277
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.504 0.498 0.491)

	Surface
	{
		SurfStyle       0.84375
		OceanStyle      0.555553
		Randomize      (0.465, 0.838, -0.211)
		colorDistMagn   0.679167
		colorDistFreq   0.000139946
		detailScale     12.0062
		colorConversion true
		snowLevel       2
		tropicLatitude  0.859882
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.315956
		terraceProb     0.10698
		erosion         0
		montesMagn      0.538132
		montesFreq      2.39583
		montesSpiky     0.966316
		montesFraction  0.204822
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000399451
		hillsFraction   0.704701
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26267
		craterFreq      0.230304
		craterDensity   0.756347
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   402.12
		volcanoTemp     1176.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.169, 0.137, 0.000)
		colorShelf     (0.202, 0.174, 0.157, 0.000)
		colorBeach     (0.237, 0.204, 0.187, 0.000)
		colorDesert    (0.257, 0.219, 0.182, 0.000)
		colorLowland   (0.282, 0.234, 0.206, 0.000)
		colorUpland    (0.312, 0.284, 0.250, 0.000)
		colorRock      (0.338, 0.309, 0.270, 0.000)
		colorSnow      (0.368, 0.328, 0.285, 1.000)
		BumpHeight      0.395713
		BumpOffset      0.0791426
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.191687
		GasToDust   0.25
		Particles   1367
		GasBright   0.070029
		DustBright  0.395791
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.97882
		Period          7.93705
		Eccentricity    0.886747
		Inclination     15.5102
		AscendingNode   97.8891
		ArgOfPericenter 132.528
		MeanAnomaly     -119.313
	}
}

Comet	"C123"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.27298e-010
	Radius          7.75825
	InertiaMoment   0.398483

	Oblateness      0.00356427

	RotationPeriod  73.9904
	Obliquity       257.352
	EqAscendNode    188.976

	AbsMagn         7.97041
	SlopeParam      5.17996
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.660 0.621 0.549)

	Surface
	{
		SurfStyle       0.863724
		OceanStyle      0.166434
		Randomize      (-0.212, 0.302, 0.204)
		colorDistMagn   0.787473
		colorDistFreq   0.0528293
		detailScale     211.852
		colorConversion true
		snowLevel       2
		tropicLatitude  0.976014
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.387547
		terraceProb     0.38371
		erosion         0
		montesMagn      0.596396
		montesFreq      2.88852
		montesSpiky     0.986909
		montesFraction  0.534039
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.187175
		hillsFraction   0.671737
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215649
		craterFreq      0.20846
		craterDensity   0.840454
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   80.681
		volcanoTemp     1273.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.217, 0.220, 0.050)
		colorShelf     (0.264, 0.255, 0.253, 0.040)
		colorBeach     (0.304, 0.292, 0.286, 0.030)
		colorDesert    (0.343, 0.329, 0.324, 0.020)
		colorLowland   (0.383, 0.366, 0.357, 0.030)
		colorUpland    (0.422, 0.404, 0.390, 0.050)
		colorRock      (0.462, 0.441, 0.434, 0.020)
		colorSnow      (0.462, 0.441, 0.434, 1.000)
		BumpHeight      6.98242
		BumpOffset      1.39648
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.672879
		GasToDust   0.25
		Particles   2339
		GasBright   0.198975
		DustBright  0.751332
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.12275
		Period          15.7345
		Eccentricity    0.958277
		Inclination     -179.925
		AscendingNode   11.237
		ArgOfPericenter -149.866
		MeanAnomaly     103.692
	}
}

Comet	"C124"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.99869e-018
	Radius          0.0272344
	InertiaMoment   0.395701

	Oblateness      0.00527788

	RotationPeriod  71.6946
	Obliquity       210.558
	EqAscendNode    173.553

	AbsMagn         9.31951
	SlopeParam      4.11788
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.463 0.454 0.451)

	Surface
	{
		SurfStyle       0.661707
		OceanStyle      0.321481
		Randomize      (0.722, -0.651, -0.438)
		colorDistMagn   0.819217
		colorDistFreq   3.93517e-007
		detailScale     0.743681
		colorConversion true
		snowLevel       2
		tropicLatitude  0.536524
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553971
		terraceProb     0.211942
		erosion         0
		montesMagn      0.50135
		montesFreq      3.43645
		montesSpiky     0.976102
		montesFraction  0.556387
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.5037e-006
		hillsFraction   0.52642
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243524
		craterFreq      0.240308
		craterDensity   0.7746
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1614.04
		volcanoTemp     1249.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.155, 0.126, 0.000)
		colorShelf     (0.185, 0.159, 0.144, 0.000)
		colorBeach     (0.218, 0.186, 0.171, 0.000)
		colorDesert    (0.236, 0.200, 0.167, 0.000)
		colorLowland   (0.259, 0.214, 0.189, 0.000)
		colorUpland    (0.287, 0.259, 0.230, 0.000)
		colorRock      (0.310, 0.282, 0.248, 0.000)
		colorSnow      (0.338, 0.300, 0.261, 1.000)
		BumpHeight      0.024511
		BumpOffset      0.00490219
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.170395
		DustBright  0.464399
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.41993
		Period          18.0333
		Eccentricity    0.976272
		Inclination     -28.9701
		AscendingNode   -68.4331
		ArgOfPericenter -114.902
		MeanAnomaly     143.171
	}
}

Comet	"C125"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.41297e-014
	Radius          0.479233
	InertiaMoment   0.398994

	Oblateness      0.00400681

	RotationPeriod  69.4915
	Obliquity       163.764
	EqAscendNode    158.131

	AbsMagn         10.844
	SlopeParam      3.09026
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.836 0.796 0.761)

	Surface
	{
		SurfStyle       0.093241
		OceanStyle      0.159023
		Randomize      (0.976, -0.548, 0.396)
		colorDistMagn   0.944189
		colorDistFreq   2.66336e-005
		detailScale     13.0862
		colorConversion true
		snowLevel       2
		tropicLatitude  0.825365
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.760551
		terraceProb     0.514388
		erosion         0
		montesMagn      0.628121
		montesFreq      3.83833
		montesSpiky     0.91834
		montesFraction  0.874258
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000626448
		hillsFraction   0.483314
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265099
		craterFreq      0.166002
		craterDensity   0.762635
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   322.949
		volcanoTemp     1409.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.334, 0.318, 0.304, 0.000)
		colorShelf     (0.355, 0.338, 0.323, 0.000)
		colorBeach     (0.376, 0.358, 0.342, 0.000)
		colorDesert    (0.397, 0.378, 0.361, 0.000)
		colorLowland   (0.418, 0.398, 0.380, 0.000)
		colorUpland    (0.439, 0.418, 0.399, 0.000)
		colorRock      (0.460, 0.438, 0.418, 0.000)
		colorSnow      (0.480, 0.458, 0.437, 1.000)
		BumpHeight      0.431309
		BumpOffset      0.0862619
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.224513
		GasToDust   0.25
		Particles   1433
		GasBright   0.104555
		DustBright  0.214725
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.20588
		Period          9.34156
		Eccentricity    0.962308
		Inclination     43.9635
		AscendingNode   130.662
		ArgOfPericenter -58.1336
		MeanAnomaly     45.8822
	}
}

Comet	"C126"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.18654e-010
	Radius          10.6438
	InertiaMoment   0.397429

	Oblateness      0.00600437

	RotationPeriod  67.3661
	Obliquity       116.969
	EqAscendNode    142.708

	AbsMagn         12.985
	SlopeParam      7.67814
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.666 0.563 0.408)

	Surface
	{
		SurfStyle       0.0569352
		OceanStyle      0.277761
		Randomize      (-0.725, 0.512, -0.333)
		colorDistMagn   0.792929
		colorDistFreq   0.0781698
		detailScale     290.648
		colorConversion true
		snowLevel       2
		tropicLatitude  0.96681
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.32659
		terraceProb     0.364643
		erosion         0
		montesMagn      0.545814
		montesFreq      3.64943
		montesSpiky     0.953452
		montesFraction  0.667832
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.14847
		hillsFraction   0.645772
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242376
		craterFreq      0.270473
		craterDensity   0.889461
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   81.5599
		volcanoTemp     1314
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.225, 0.163, 0.000)
		colorShelf     (0.283, 0.239, 0.173, 0.000)
		colorBeach     (0.300, 0.253, 0.184, 0.000)
		colorDesert    (0.317, 0.267, 0.194, 0.000)
		colorLowland   (0.333, 0.281, 0.204, 0.000)
		colorUpland    (0.350, 0.296, 0.214, 0.000)
		colorRock      (0.367, 0.310, 0.225, 0.000)
		colorSnow      (0.383, 0.324, 0.235, 1.000)
		BumpHeight      9.57946
		BumpOffset      1.91589
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.705705
		GasToDust   0.25
		Particles   2405
		GasBright   0.310668
		DustBright  0.493098
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.59719
		Period          11.9345
		Eccentricity    0.950415
		Inclination     15.4717
		AscendingNode   -139.795
		ArgOfPericenter 111.932
		MeanAnomaly     158.833
	}
}

Comet	"C127"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.28907e-017
	Radius          0.0295864
	InertiaMoment   0.399447

	Oblateness      0.00449045

	RotationPeriod  65.3061
	Obliquity       70.175
	EqAscendNode    127.285

	AbsMagn         0.669337
	SlopeParam      5.46553
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.466 0.380 0.339)

	Surface
	{
		SurfStyle       0.10949
		OceanStyle      0.451553
		Randomize      (0.585, 0.476, 0.708)
		colorDistMagn   0.942232
		colorDistFreq   5.30474e-007
		detailScale     0.807907
		colorConversion true
		snowLevel       2
		tropicLatitude  0.977053
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.641265
		terraceProb     0.423877
		erosion         0
		montesMagn      0.636526
		montesFreq      3.31767
		montesSpiky     0.928889
		montesFraction  0.303412
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.96186e-006
		hillsFraction   0.67669
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239215
		craterFreq      0.216534
		craterDensity   0.856621
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1291.99
		volcanoTemp     1755.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.152, 0.136, 0.000)
		colorShelf     (0.198, 0.162, 0.144, 0.000)
		colorBeach     (0.210, 0.171, 0.153, 0.000)
		colorDesert    (0.222, 0.181, 0.161, 0.000)
		colorLowland   (0.233, 0.190, 0.170, 0.000)
		colorUpland    (0.245, 0.200, 0.178, 0.000)
		colorRock      (0.256, 0.209, 0.187, 0.000)
		colorSnow      (0.268, 0.219, 0.195, 1.000)
		BumpHeight      0.0266278
		BumpOffset      0.00532556
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.217547
		DustBright  0.270707
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.0894
		Period          8.61151
		Eccentricity    0.926415
		Inclination     -141.907
		AscendingNode   84.6695
		ArgOfPericenter -14.8105
		MeanAnomaly     5.70401
	}
}

Comet	"C128"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            9.97001e-014
	Radius          0.659296
	InertiaMoment   0.398191

	Oblateness      0.00680563

	RotationPeriod  63.3014
	Obliquity       23.3807
	EqAscendNode    111.863

	AbsMagn         4.11369
	SlopeParam      4.34893
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.736 0.733 0.730)

	Surface
	{
		SurfStyle       0.924694
		OceanStyle      0.689341
		Randomize      (0.814, 0.291, -0.966)
		colorDistMagn   0.749347
		colorDistFreq   0.000177488
		detailScale     18.0032
		colorConversion true
		snowLevel       2
		tropicLatitude  0.964412
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.713341
		terraceProb     0.228488
		erosion         0
		montesMagn      0.597398
		montesFreq      3.51279
		montesSpiky     0.912964
		montesFraction  0.756935
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00115578
		hillsFraction   0.4791
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270244
		craterFreq      0.249442
		craterDensity   0.692764
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   327.37
		volcanoTemp     1451.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.257, 0.292, 0.050)
		colorShelf     (0.294, 0.300, 0.336, 0.040)
		colorBeach     (0.339, 0.344, 0.379, 0.030)
		colorDesert    (0.383, 0.388, 0.430, 0.020)
		colorLowland   (0.427, 0.432, 0.474, 0.030)
		colorUpland    (0.471, 0.476, 0.518, 0.050)
		colorRock      (0.515, 0.520, 0.576, 0.020)
		colorSnow      (0.515, 0.520, 0.576, 1.000)
		BumpHeight      0.593366
		BumpOffset      0.118673
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.257339
		GasToDust   0.25
		Particles   1499
		GasBright   0.00448077
		DustBright  0.968259
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.12213
		Period          8.81469
		Eccentricity    0.923892
		Inclination     -92.3767
		AscendingNode   -124.809
		ArgOfPericenter 133.995
		MeanAnomaly     108.318
	}
}

Comet	"C129"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            7.71109e-010
	Radius          11.5157
	InertiaMoment   0.399872

	Oblateness      0.00502474

	RotationPeriod  61.343
	Obliquity       336.586
	EqAscendNode    96.4402

	AbsMagn         5.87745
	SlopeParam      3.33816
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.849 0.790 0.735)

	Surface
	{
		SurfStyle       0.970228
		OceanStyle      0.883183
		Randomize      (0.382, -0.665, 0.122)
		colorDistMagn   0.859151
		colorDistFreq   0.0688599
		detailScale     314.455
		colorConversion true
		snowLevel       2
		tropicLatitude  0.879055
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.68903
		terraceProb     0.126019
		erosion         0
		montesMagn      0.552527
		montesFreq      2.96435
		montesSpiky     0.956156
		montesFraction  0.664771
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.295245
		hillsFraction   0.702579
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235427
		craterFreq      0.147828
		craterDensity   0.770817
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   65.0187
		volcanoTemp     1241.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.276, 0.294, 0.050)
		colorShelf     (0.340, 0.324, 0.338, 0.040)
		colorBeach     (0.391, 0.371, 0.382, 0.030)
		colorDesert    (0.441, 0.418, 0.434, 0.020)
		colorLowland   (0.492, 0.466, 0.478, 0.030)
		colorUpland    (0.543, 0.513, 0.522, 0.050)
		colorRock      (0.594, 0.561, 0.581, 0.020)
		colorSnow      (0.594, 0.561, 0.581, 1.000)
		BumpHeight      10.3641
		BumpOffset      2.07283
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.738531
		GasToDust   0.25
		Particles   2471
		GasBright   0.0418335
		DustBright  0.615393
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.43453
		Period          10.8311
		Eccentricity    0.92357
		Inclination     95.9438
		AscendingNode   -164.962
		ArgOfPericenter 148.038
		MeanAnomaly     -171.227
	}
}

Comet	"C130"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.3743e-017
	Radius          0.0408378
	InertiaMoment   0.398752

	Oblateness      0.00772326

	RotationPeriod  59.4234
	Obliquity       289.792
	EqAscendNode    81.0176

	AbsMagn         7.2949
	SlopeParam      2.10313
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.669 0.664 0.662)

	Surface
	{
		SurfStyle       0.857595
		OceanStyle      0.149804
		Randomize      (0.379, -0.396, 0.230)
		colorDistMagn   0.618915
		colorDistFreq   1.25134e-006
		detailScale     1.11515
		colorConversion true
		snowLevel       2
		tropicLatitude  0.952431
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.549908
		terraceProb     0.294628
		erosion         0
		montesMagn      0.641821
		montesFreq      3.51225
		montesSpiky     0.967426
		montesFraction  0.39306
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.43477e-006
		hillsFraction   0.718494
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249262
		craterFreq      0.182498
		craterDensity   0.842525
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1314.02
		volcanoTemp     1840.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.233, 0.265, 0.050)
		colorShelf     (0.268, 0.272, 0.304, 0.040)
		colorBeach     (0.308, 0.312, 0.344, 0.030)
		colorDesert    (0.348, 0.352, 0.391, 0.020)
		colorLowland   (0.388, 0.392, 0.430, 0.030)
		colorUpland    (0.428, 0.432, 0.470, 0.050)
		colorRock      (0.468, 0.472, 0.523, 0.020)
		colorSnow      (0.468, 0.472, 0.523, 1.000)
		BumpHeight      0.0367541
		BumpOffset      0.00735081
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0419271
		DustBright  0.299786
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.07371
		Period          15.3654
		Eccentricity    0.930926
		Inclination     -167.524
		AscendingNode   97.3091
		ArgOfPericenter 88.1645
		MeanAnomaly     -122.142
	}
}

Comet	"C131"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.83635e-013
	Radius          0.70944
	InertiaMoment   0.396858

	Oblateness      0.00554489

	RotationPeriod  57.5358
	Obliquity       242.998
	EqAscendNode    65.595

	AbsMagn         8.62664
	SlopeParam      5.78472
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.632 0.628 0.627)

	Surface
	{
		SurfStyle       0.531246
		OceanStyle      0.583381
		Randomize      (-0.299, -0.417, -0.825)
		colorDistMagn   0.680498
		colorDistFreq   0.000424245
		detailScale     19.3724
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972469
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.529023
		terraceProb     0.123856
		erosion         0
		montesMagn      0.530086
		montesFreq      3.08261
		montesSpiky     0.995601
		montesFraction  0.607766
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0009637
		hillsFraction   0.475605
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24151
		craterFreq      0.207941
		craterDensity   0.793213
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   259.563
		volcanoTemp     1632.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.214, 0.176, 0.000)
		colorShelf     (0.253, 0.220, 0.201, 0.000)
		colorBeach     (0.297, 0.258, 0.238, 0.000)
		colorDesert    (0.322, 0.276, 0.232, 0.000)
		colorLowland   (0.354, 0.295, 0.263, 0.000)
		colorUpland    (0.392, 0.358, 0.320, 0.000)
		colorRock      (0.423, 0.389, 0.345, 0.000)
		colorSnow      (0.461, 0.415, 0.364, 1.000)
		BumpHeight      0.638496
		BumpOffset      0.127699
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.290165
		GasToDust   0.25
		Particles   1565
		GasBright   0.150155
		DustBright  0.676044
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.60868
		Period          12.0138
		Eccentricity    0.941173
		Inclination     47.3968
		AscendingNode   -34.5171
		ArgOfPericenter 77.266
		MeanAnomaly     -134.607
	}
}

Comet	"C132"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.42029e-009
	Radius          15.9605
	InertiaMoment   0.399228

	Oblateness      0.00879623

	RotationPeriod  55.674
	Obliquity       196.203
	EqAscendNode    50.1724

	AbsMagn         10.034
	SlopeParam      4.58476
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.501 0.496 0.486)

	Surface
	{
		SurfStyle       0.91911
		OceanStyle      0.104743
		Randomize      (0.289, -0.742, -0.603)
		colorDistMagn   0.734135
		colorDistFreq   0.15061
		detailScale     435.827
		colorConversion true
		snowLevel       2
		tropicLatitude  0.281422
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.49522
		terraceProb     0.361604
		erosion         0
		montesMagn      0.484907
		montesFreq      3.20378
		montesSpiky     0.93501
		montesFraction  0.494332
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.62392
		hillsFraction   0.770742
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252207
		craterFreq      0.210939
		craterDensity   0.87143
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   66.3994
		volcanoTemp     1600.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.174, 0.195, 0.050)
		colorShelf     (0.200, 0.203, 0.224, 0.040)
		colorBeach     (0.230, 0.233, 0.253, 0.030)
		colorDesert    (0.260, 0.263, 0.287, 0.020)
		colorLowland   (0.291, 0.293, 0.316, 0.030)
		colorUpland    (0.321, 0.322, 0.345, 0.050)
		colorRock      (0.351, 0.352, 0.384, 0.020)
		colorSnow      (0.351, 0.352, 0.384, 1.000)
		BumpHeight      14.3644
		BumpOffset      2.87288
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.771356
		GasToDust   0.25
		Particles   2538
		GasBright   0.122967
		DustBright  0.387719
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.08841
		Period          15.4757
		Eccentricity    0.964519
		Inclination     -0.260523
		AscendingNode   -122.556
		ArgOfPericenter 36.368
		MeanAnomaly     78.1002
	}
}

Comet	"C133"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.37318e-017
	Radius          0.0435907
	InertiaMoment   0.397854

	Oblateness      0.00619292

	RotationPeriod  53.8325
	Obliquity       149.409
	EqAscendNode    34.7498

	AbsMagn         11.7641
	SlopeParam      3.57625
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.650 0.647 0.646)

	Surface
	{
		SurfStyle       0.842853
		OceanStyle      0.301051
		Randomize      (-0.075, 0.701, 0.264)
		colorDistMagn   0.218516
		colorDistFreq   7.88734e-007
		detailScale     1.19032
		colorConversion true
		snowLevel       2
		tropicLatitude  0.812775
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.300826
		terraceProb     0.438394
		erosion         0
		montesMagn      0.547778
		montesFreq      2.90562
		montesSpiky     0.970587
		montesFraction  0.781929
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.24787e-006
		hillsFraction   0.790959
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235382
		craterFreq      0.216165
		craterDensity   0.924852
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1033.48
		volcanoTemp     1217.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.220, 0.181, 0.000)
		colorShelf     (0.260, 0.227, 0.207, 0.000)
		colorBeach     (0.305, 0.265, 0.246, 0.000)
		colorDesert    (0.331, 0.285, 0.239, 0.000)
		colorLowland   (0.364, 0.304, 0.271, 0.000)
		colorUpland    (0.403, 0.369, 0.330, 0.000)
		colorRock      (0.435, 0.401, 0.356, 0.000)
		colorSnow      (0.474, 0.427, 0.375, 1.000)
		BumpHeight      0.0392316
		BumpOffset      0.00784632
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.298385
		DustBright  0.696787
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.85751
		Period          7.21845
		Eccentricity    0.892131
		Inclination     -96.5035
		AscendingNode   -16.3912
		ArgOfPericenter -135.965
		MeanAnomaly     -159.361
	}
}

Comet	"C134"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.38233e-013
	Radius          0.988621
	InertiaMoment   0.399664

	Oblateness      0.0100766

	RotationPeriod  52.0062
	Obliquity       102.615
	EqAscendNode    19.3273

	AbsMagn         14.9503
	SlopeParam      2.43666
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.720 0.622 0.486)

	Surface
	{
		SurfStyle       0.129739
		OceanStyle      0.663183
		Randomize      (-0.664, -0.841, 0.672)
		colorDistMagn   0.291438
		colorDistFreq   0.000793928
		detailScale     26.9959
		colorConversion true
		snowLevel       2
		tropicLatitude  0.954078
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.351557
		terraceProb     0.129986
		erosion         0
		montesMagn      0.650208
		montesFreq      2.80654
		montesSpiky     0.904104
		montesFraction  0.589072
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0028817
		hillsFraction   0.647445
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209676
		craterFreq      0.222398
		craterDensity   0.80283
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   266.519
		volcanoTemp     1660.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.249, 0.194, 0.000)
		colorShelf     (0.306, 0.265, 0.207, 0.000)
		colorBeach     (0.324, 0.280, 0.219, 0.000)
		colorDesert    (0.342, 0.296, 0.231, 0.000)
		colorLowland   (0.360, 0.311, 0.243, 0.000)
		colorUpland    (0.378, 0.327, 0.255, 0.000)
		colorRock      (0.396, 0.342, 0.267, 0.000)
		colorSnow      (0.414, 0.358, 0.279, 1.000)
		BumpHeight      0.889759
		BumpOffset      0.177952
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.32299
		GasToDust   0.25
		Particles   1632
		GasBright   0.243915
		DustBright  0.435744
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.50296
		Period          11.2909
		Eccentricity    0.952203
		Inclination     -5.14002
		AscendingNode   159.783
		ArgOfPericenter 87.2253
		MeanAnomaly     25.4382
	}
}

Comet	"C135"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.61599e-009
	Radius          16.7478
	InertiaMoment   0.39849

	Oblateness      0.00677076

	RotationPeriod  50.1901
	Obliquity       55.8206
	EqAscendNode    3.90466

	AbsMagn         2.84219
	SlopeParam      6.1575
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.604 0.569 0.511)

	Surface
	{
		SurfStyle       0.0516857
		OceanStyle      0.357579
		Randomize      (-0.645, 0.144, 0.980)
		colorDistMagn   0.653793
		colorDistFreq   0.172091
		detailScale     457.327
		colorConversion true
		snowLevel       2
		tropicLatitude  0.872536
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.321565
		terraceProb     0.367572
		erosion         0
		montesMagn      0.361008
		montesFreq      2.92056
		montesSpiky     0.975454
		montesFraction  0.778108
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.657868
		hillsFraction   0.692517
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211774
		craterFreq      0.187007
		craterDensity   0.884546
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.3388
		volcanoTemp     1324.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.228, 0.204, 0.000)
		colorShelf     (0.257, 0.242, 0.217, 0.000)
		colorBeach     (0.272, 0.256, 0.230, 0.000)
		colorDesert    (0.287, 0.270, 0.243, 0.000)
		colorLowland   (0.302, 0.285, 0.255, 0.000)
		colorUpland    (0.317, 0.299, 0.268, 0.000)
		colorRock      (0.332, 0.313, 0.281, 0.000)
		colorSnow      (0.347, 0.327, 0.294, 1.000)
		BumpHeight      15.073
		BumpOffset      3.0146
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.804182
		GasToDust   0.25
		Particles   2604
		GasBright   0.152185
		DustBright  0.211961
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.41001
		Period          17.9548
		Eccentricity    0.950597
		Inclination     73.7178
		AscendingNode   -114.638
		ArgOfPericenter -138.291
		MeanAnomaly     86.9305
	}
}

Comet	"C136"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            8.05482e-017
	Radius          0.061237
	InertiaMoment   0.395753

	Oblateness      0.0114509

	RotationPeriod  48.3796
	Obliquity       9.0263
	EqAscendNode    348.482

	AbsMagn         5.05547
	SlopeParam      4.82903
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.645 0.592 0.505)

	Surface
	{
		SurfStyle       0.542432
		OceanStyle      0.530168
		Randomize      (0.594, -0.316, -0.045)
		colorDistMagn   0.421297
		colorDistFreq   3.10714e-006
		detailScale     1.67218
		colorConversion true
		snowLevel       2
		tropicLatitude  0.650285
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404978
		terraceProb     0.282053
		erosion         0
		montesMagn      0.43753
		montesFreq      2.73274
		montesSpiky     0.943591
		montesFraction  0.446742
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.08499e-006
		hillsFraction   0.738834
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224769
		craterFreq      0.232781
		craterDensity   0.931938
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1069.77
		volcanoTemp     1514.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.201, 0.141, 0.000)
		colorShelf     (0.258, 0.207, 0.162, 0.000)
		colorBeach     (0.303, 0.243, 0.192, 0.000)
		colorDesert    (0.329, 0.261, 0.187, 0.000)
		colorLowland   (0.361, 0.278, 0.212, 0.000)
		colorUpland    (0.400, 0.338, 0.258, 0.000)
		colorRock      (0.432, 0.367, 0.278, 0.000)
		colorSnow      (0.470, 0.391, 0.293, 1.000)
		BumpHeight      0.0551133
		BumpOffset      0.0110227
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.404771
		DustBright  0.443861
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.07147
		Period          8.50094
		Eccentricity    0.94214
		Inclination     42.533
		AscendingNode   107.52
		ArgOfPericenter 90.1886
		MeanAnomaly     -114.163
	}
}

Comet	"C137"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.22983e-013
	Radius          1.56231
	InertiaMoment   0.399

	Oblateness      0.0268584

	RotationPeriod  46.5701
	Obliquity       322.232
	EqAscendNode    333.059

	AbsMagn         6.59851
	SlopeParam      3.80847
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.446 0.441 0.439)

	Surface
	{
		SurfStyle       0.301137
		OceanStyle      0.324008
		Randomize      (-0.067, -0.013, 0.338)
		colorDistMagn   0.75395
		colorDistFreq   0.00145935
		detailScale     42.6615
		colorConversion true
		snowLevel       2
		tropicLatitude  0.860616
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.328014
		terraceProb     0.244204
		erosion         0
		montesMagn      0.648452
		montesFreq      2.10759
		montesSpiky     0.861262
		montesFraction  0.636612
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00726332
		hillsFraction   0.668499
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241667
		craterFreq      0.160662
		craterDensity   0.82945
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   310.338
		volcanoTemp     1635.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.177, 0.176, 0.000)
		colorShelf     (0.190, 0.188, 0.187, 0.000)
		colorBeach     (0.201, 0.199, 0.198, 0.000)
		colorDesert    (0.212, 0.210, 0.209, 0.000)
		colorLowland   (0.223, 0.221, 0.220, 0.000)
		colorUpland    (0.234, 0.232, 0.231, 0.000)
		colorRock      (0.245, 0.243, 0.242, 0.000)
		colorSnow      (0.256, 0.254, 0.253, 1.000)
		BumpHeight      1.40608
		BumpOffset      0.281216
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.355816
		GasToDust   0.25
		Particles   1698
		GasBright   0.0191995
		DustBright  0.513919
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.25977
		Period          9.68598
		Eccentricity    0.950057
		Inclination     -104.269
		AscendingNode   -58.0142
		ArgOfPericenter 76.2382
		MeanAnomaly     99.1103
	}
}

Comet	"C138"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.81832e-009
	Radius          23.9331
	InertiaMoment   0.397441

	Oblateness      0.0134372

	RotationPeriod  44.7569
	Obliquity       275.438
	EqAscendNode    317.637

	AbsMagn         7.95221
	SlopeParam      2.73147
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.432 0.428 0.421)

	Surface
	{
		SurfStyle       0.214502
		OceanStyle      0.992282
		Randomize      (0.970, 0.443, 0.589)
		colorDistMagn   0.790734
		colorDistFreq   0.24128
		detailScale     653.533
		colorConversion true
		snowLevel       2
		tropicLatitude  0.934919
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.708022
		terraceProb     0.172828
		erosion         0
		montesMagn      0.561398
		montesFreq      3.71145
		montesSpiky     0.922129
		montesFraction  0.476807
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.65391
		hillsFraction   0.397652
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231083
		craterFreq      0.184162
		craterDensity   0.989552
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   54.0576
		volcanoTemp     1931.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.171, 0.168, 0.000)
		colorShelf     (0.184, 0.182, 0.179, 0.000)
		colorBeach     (0.194, 0.193, 0.189, 0.000)
		colorDesert    (0.205, 0.203, 0.200, 0.000)
		colorLowland   (0.216, 0.214, 0.211, 0.000)
		colorUpland    (0.227, 0.225, 0.221, 0.000)
		colorRock      (0.238, 0.235, 0.232, 0.000)
		colorSnow      (0.248, 0.246, 0.242, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.837008
		GasToDust   0.25
		Particles   2670
		GasBright   0.0206853
		DustBright  0.19692
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.30518
		Period          9.97941
		Eccentricity    0.94695
		Inclination     -137.28
		AscendingNode   -128.941
		ArgOfPericenter -17.8165
		MeanAnomaly     141.164
	}
}

Comet	"C139"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.4836e-016
	Radius          0.0935456
	InertiaMoment   0.399452

	Oblateness      0.0285316

	RotationPeriod  42.9355
	Obliquity       228.643
	EqAscendNode    302.214

	AbsMagn         9.3003
	SlopeParam      6.62591
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.732 0.729 0.725)

	Surface
	{
		SurfStyle       0.378554
		OceanStyle      0.33605
		Randomize      (-0.386, 0.543, 0.171)
		colorDistMagn   0.873099
		colorDistFreq   6.57296e-006
		detailScale     2.55442
		colorConversion true
		snowLevel       2
		tropicLatitude  0.436536
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.638602
		terraceProb     0.293655
		erosion         0
		montesMagn      0.612896
		montesFreq      3.00474
		montesSpiky     0.945124
		montesFraction  0.516637
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.5125e-005
		hillsFraction   0.489602
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240587
		craterFreq      0.147062
		craterDensity   0.953142
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1204.12
		volcanoTemp     1652.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.292, 0.290, 0.000)
		colorShelf     (0.311, 0.310, 0.308, 0.000)
		colorBeach     (0.330, 0.328, 0.326, 0.000)
		colorDesert    (0.348, 0.346, 0.344, 0.000)
		colorLowland   (0.366, 0.365, 0.362, 0.000)
		colorUpland    (0.384, 0.383, 0.381, 0.000)
		colorRock      (0.403, 0.401, 0.399, 0.000)
		colorSnow      (0.421, 0.419, 0.417, 1.000)
		BumpHeight      0.0841911
		BumpOffset      0.0168382
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.108195
		DustBright  0.593897
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.90319
		Period          14.1046
		Eccentricity    0.9794
		Inclination     57.669
		AscendingNode   149.47
		ArgOfPericenter -150.942
		MeanAnomaly     172.025
	}
}

Comet	"C140"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.14746e-012
	Radius          1.48247
	InertiaMoment   0.398199

	Oblateness      0.0159469

	RotationPeriod  41.101
	Obliquity       181.849
	EqAscendNode    286.792

	AbsMagn         10.8206
	SlopeParam      5.08639
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.613 0.607 0.605)

	Surface
	{
		SurfStyle       0.228028
		OceanStyle      0.36931
		Randomize      (0.964, -0.378, 0.325)
		colorDistMagn   0.0764697
		colorDistFreq   0.00171994
		detailScale     40.4812
		colorConversion true
		snowLevel       2
		tropicLatitude  0.378736
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.635309
		terraceProb     0.407725
		erosion         0
		montesMagn      0.516963
		montesFreq      3.83228
		montesSpiky     0.970886
		montesFraction  0.132514
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00582641
		hillsFraction   0.63482
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255509
		craterFreq      0.214257
		craterDensity   0.904279
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   216.981
		volcanoTemp     1875.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.243, 0.242, 0.000)
		colorShelf     (0.261, 0.258, 0.257, 0.000)
		colorBeach     (0.276, 0.273, 0.272, 0.000)
		colorDesert    (0.291, 0.289, 0.287, 0.000)
		colorLowland   (0.306, 0.304, 0.303, 0.000)
		colorUpland    (0.322, 0.319, 0.318, 0.000)
		colorRock      (0.337, 0.334, 0.333, 0.000)
		colorSnow      (0.352, 0.349, 0.348, 1.000)
		BumpHeight      1.33422
		BumpOffset      0.266844
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.388642
		GasToDust   0.25
		Particles   1764
		GasBright   0.082399
		DustBright  0.30418
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.79689
		Period          6.86798
		Eccentricity    0.886871
		Inclination     159.166
		AscendingNode   138.716
		ArgOfPericenter 66.749
		MeanAnomaly     178.015
	}
}

Comet	"C141"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            8.87474e-009
	Radius          35.8775
	InertiaMoment   0.399878

	Oblateness      0.0322526

	RotationPeriod  39.2484
	Obliquity       135.055
	EqAscendNode    271.369

	AbsMagn         12.9456
	SlopeParam      4.03812
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.456 0.448 0.442)

	Surface
	{
		SurfStyle       0.74509
		OceanStyle      0.000671846
		Randomize      (-0.241, 0.477, -0.273)
		colorDistMagn   0.837342
		colorDistFreq   0.690543
		detailScale     979.695
		colorConversion true
		snowLevel       2
		tropicLatitude  0.950193
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.721664
		terraceProb     0.527886
		erosion         0
		montesMagn      0.448587
		montesFreq      2.82431
		montesSpiky     0.940118
		montesFraction  0.463039
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.01608
		hillsFraction   0.6358
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235474
		craterFreq      0.231878
		craterDensity   1.02041
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   59.7105
		volcanoTemp     1684.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.152, 0.124, 0.000)
		colorShelf     (0.182, 0.157, 0.142, 0.000)
		colorBeach     (0.214, 0.184, 0.168, 0.000)
		colorDesert    (0.232, 0.197, 0.164, 0.000)
		colorLowland   (0.255, 0.210, 0.186, 0.000)
		colorUpland    (0.283, 0.255, 0.226, 0.000)
		colorRock      (0.305, 0.278, 0.243, 0.000)
		colorSnow      (0.333, 0.296, 0.257, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.869834
		GasToDust   0.25
		Particles   2737
		GasBright   0.237099
		DustBright  0.633966
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.42855
		Period          18.1015
		Eccentricity    0.947375
		Inclination     92.8903
		AscendingNode   60.5065
		ArgOfPericenter -7.52825
		MeanAnomaly     0.601791
	}
}

Comet	"C142"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.7326e-016
	Radius          0.091827
	InertiaMoment   0.398758

	Oblateness      0.019289

	RotationPeriod  37.3723
	Obliquity       88.2605
	EqAscendNode    255.947

	AbsMagn         0.569468
	SlopeParam      3.00095
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.630 0.627 0.625)

	Surface
	{
		SurfStyle       0.231985
		OceanStyle      0.0220112
		Randomize      (0.519, 0.897, -0.461)
		colorDistMagn   0.887584
		colorDistFreq   2.92035e-006
		detailScale     2.50749
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99998
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.733058
		terraceProb     0.501545
		erosion         0
		montesMagn      0.416518
		montesFreq      2.56398
		montesSpiky     0.839979
		montesFraction  0.528481
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.06083e-005
		hillsFraction   0.479299
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214378
		craterFreq      0.210954
		craterDensity   0.873236
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   870.941
		volcanoTemp     1500.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.251, 0.250, 0.000)
		colorShelf     (0.268, 0.266, 0.265, 0.000)
		colorBeach     (0.283, 0.282, 0.281, 0.000)
		colorDesert    (0.299, 0.298, 0.297, 0.000)
		colorLowland   (0.315, 0.313, 0.312, 0.000)
		colorUpland    (0.331, 0.329, 0.328, 0.000)
		colorRock      (0.346, 0.345, 0.344, 0.000)
		colorSnow      (0.362, 0.361, 0.359, 1.000)
		BumpHeight      0.0826443
		BumpOffset      0.0165289
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.184021
		DustBright  0.371531
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.00029
		Period          8.06654
		Eccentricity    0.962727
		Inclination     -99.5892
		AscendingNode   -90.0767
		ArgOfPericenter 145.679
		MeanAnomaly     -40.959
	}
}

Comet	"C143"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.11347e-012
	Radius          2.19358
	InertiaMoment   0.396876

	Oblateness      0.0374826

	RotationPeriod  35.4669
	Obliquity       41.4662
	EqAscendNode    240.524

	AbsMagn         4.0844
	SlopeParam      7.31225
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.518 0.515 0.513)

	Surface
	{
		SurfStyle       0.917066
		OceanStyle      0.677073
		Randomize      (0.778, 0.310, 0.704)
		colorDistMagn   0.275381
		colorDistFreq   0.00251766
		detailScale     59.8995
		colorConversion true
		snowLevel       2
		tropicLatitude  0.832095
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.561246
		terraceProb     0.137804
		erosion         0
		montesMagn      0.518043
		montesFreq      3.06109
		montesSpiky     0.998178
		montesFraction  0.650689
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0120501
		hillsFraction   0.635461
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234895
		craterFreq      0.191258
		craterDensity   1.00544
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   236.572
		volcanoTemp     1724.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.180, 0.205, 0.050)
		colorShelf     (0.207, 0.211, 0.236, 0.040)
		colorBeach     (0.238, 0.242, 0.267, 0.030)
		colorDesert    (0.269, 0.273, 0.302, 0.020)
		colorLowland   (0.300, 0.304, 0.333, 0.030)
		colorUpland    (0.331, 0.335, 0.364, 0.050)
		colorRock      (0.362, 0.366, 0.405, 0.020)
		colorSnow      (0.362, 0.366, 0.405, 1.000)
		BumpHeight      1.97423
		BumpOffset      0.394845
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.421468
		GasToDust   0.25
		Particles   1831
		GasBright   0.0936834
		DustBright  0.146355
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.5938
		Period          11.9111
		Eccentricity    0.943047
		Inclination     -52.7532
		AscendingNode   78.9432
		ArgOfPericenter 177.548
		MeanAnomaly     2.42584
	}
}

Comet	"C144"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.63462e-008
	Radius          35.8887
	InertiaMoment   0.399234

	Oblateness      0.0239634

	RotationPeriod  33.5257
	Obliquity       354.672
	EqAscendNode    225.101

	AbsMagn         5.85646
	SlopeParam      5.36319
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.516 0.435)

	Surface
	{
		SurfStyle       0.339752
		OceanStyle      0.190524
		Randomize      (-0.927, 0.715, 0.657)
		colorDistMagn   0.589641
		colorDistFreq   0.240394
		detailScale     980
		colorConversion true
		snowLevel       2
		tropicLatitude  0.186729
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.475165
		terraceProb     0.115436
		erosion         0
		montesMagn      0.3676
		montesFreq      2.3782
		montesSpiky     0.988986
		montesFraction  0.382057
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.75856
		hillsFraction   0.541595
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244027
		craterFreq      0.257361
		craterDensity   0.960387
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   44.0104
		volcanoTemp     1489.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.206, 0.174, 0.000)
		colorShelf     (0.295, 0.219, 0.185, 0.000)
		colorBeach     (0.312, 0.232, 0.196, 0.000)
		colorDesert    (0.329, 0.245, 0.207, 0.000)
		colorLowland   (0.347, 0.258, 0.218, 0.000)
		colorUpland    (0.364, 0.271, 0.228, 0.000)
		colorRock      (0.381, 0.284, 0.239, 0.000)
		colorSnow      (0.399, 0.297, 0.250, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.90266
		GasToDust   0.25
		Particles   2803
		GasBright   0.325551
		DustBright  0.398974
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.02512
		Period          15.0024
		Eccentricity    0.92734
		Inclination     -166.691
		AscendingNode   50.9308
		ArgOfPericenter 23.1616
		MeanAnomaly     96.7812
	}
}

Comet	"C145"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.0331e-016
	Radius          0.134536
	InertiaMoment   0.397863

	Oblateness      0.0460825

	RotationPeriod  31.5414
	Obliquity       307.878
	EqAscendNode    209.679

	AbsMagn         7.27641
	SlopeParam      4.26828
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.671 0.668 0.664)

	Surface
	{
		SurfStyle       0.258546
		OceanStyle      0.59558
		Randomize      (-0.420, -0.463, -0.273)
		colorDistMagn   0.480663
		colorDistFreq   5.28698e-006
		detailScale     3.67374
		colorConversion true
		snowLevel       2
		tropicLatitude  0.931179
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.379542
		terraceProb     0.440831
		erosion         0
		montesMagn      0.594037
		montesFreq      3.28025
		montesSpiky     0.934984
		montesFraction  0.621582
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.53082e-005
		hillsFraction   0.36401
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210531
		craterFreq      0.228542
		craterDensity   0.890216
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   940.215
		volcanoTemp     1558.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.267, 0.266, 0.000)
		colorShelf     (0.285, 0.284, 0.282, 0.000)
		colorBeach     (0.302, 0.301, 0.299, 0.000)
		colorDesert    (0.319, 0.317, 0.316, 0.000)
		colorLowland   (0.336, 0.334, 0.332, 0.000)
		colorUpland    (0.352, 0.351, 0.349, 0.000)
		colorRock      (0.369, 0.368, 0.365, 0.000)
		colorSnow      (0.386, 0.384, 0.382, 1.000)
		BumpHeight      0.121083
		BumpOffset      0.0242165
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00342574
		DustBright  0.405586
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.17765
		Period          16.1513
		Eccentricity    0.967128
		Inclination     -141.151
		AscendingNode   -103.265
		ArgOfPericenter -145.493
		MeanAnomaly     -37.1804
	}
}

Comet	"C146"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.89275e-012
	Radius          2.22302
	InertiaMoment   0.39967

	Oblateness      0.0309258

	RotationPeriod  29.5058
	Obliquity       261.083
	EqAscendNode    194.256

	AbsMagn         8.60822
	SlopeParam      3.25336
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.565 0.563 0.560)

	Surface
	{
		SurfStyle       0.677505
		OceanStyle      0.442845
		Randomize      (0.524, -0.445, 0.711)
		colorDistMagn   0.370773
		colorDistFreq   0.00280392
		detailScale     60.7034
		colorConversion true
		snowLevel       2
		tropicLatitude  0.950854
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.717393
		terraceProb     0.257615
		erosion         0
		montesMagn      0.504915
		montesFreq      3.27235
		montesSpiky     0.84581
		montesFraction  0.729689
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00945727
		hillsFraction   0.843462
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2542
		craterFreq      0.20924
		craterDensity   0.931452
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   176.653
		volcanoTemp     1785.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.191, 0.157, 0.000)
		colorShelf     (0.226, 0.197, 0.179, 0.000)
		colorBeach     (0.266, 0.231, 0.213, 0.000)
		colorDesert    (0.288, 0.248, 0.207, 0.000)
		colorLowland   (0.317, 0.265, 0.235, 0.000)
		colorUpland    (0.350, 0.321, 0.286, 0.000)
		colorRock      (0.379, 0.349, 0.308, 0.000)
		colorSnow      (0.413, 0.371, 0.325, 1.000)
		BumpHeight      2.00072
		BumpOffset      0.400144
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.454294
		GasToDust   0.25
		Particles   1897
		GasBright   0.0602405
		DustBright  0.833257
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.85832
		Period          21.6095
		Eccentricity    0.974045
		Inclination     -10.9575
		AscendingNode   33.0115
		ArgOfPericenter -57.5784
		MeanAnomaly     -30.0134
	}
}

Comet	"C147"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.01076e-008
	Radius          52.1635
	InertiaMoment   0.398497

	Oblateness      0.0596046

	RotationPeriod  27.4092
	Obliquity       214.289
	EqAscendNode    178.834

	AbsMagn         10.0133
	SlopeParam      9.47451
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.760 0.675 0.629)

	Surface
	{
		SurfStyle       0.905948
		OceanStyle      0.372671
		Randomize      (0.311, -0.651, -0.199)
		colorDistMagn   0.860819
		colorDistFreq   1.59548
		detailScale     1424.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.691462
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.442796
		terraceProb     0.372222
		erosion         0
		montesMagn      0.533181
		montesFreq      2.75698
		montesSpiky     0.946448
		montesFraction  0.458386
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.20297
		hillsFraction   0.605155
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222791
		craterFreq      0.223106
		craterDensity   0.882817
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.1341
		volcanoTemp     1888.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.236, 0.251, 0.050)
		colorShelf     (0.304, 0.277, 0.289, 0.040)
		colorBeach     (0.349, 0.317, 0.327, 0.030)
		colorDesert    (0.395, 0.358, 0.371, 0.020)
		colorLowland   (0.441, 0.398, 0.409, 0.030)
		colorUpland    (0.486, 0.439, 0.446, 0.050)
		colorRock      (0.532, 0.479, 0.497, 0.020)
		colorSnow      (0.532, 0.479, 0.497, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.935486
		GasToDust   0.25
		Particles   2869
		GasBright   0.0730955
		DustBright  0.504889
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.98757
		Period          7.9897
		Eccentricity    0.916897
		Inclination     -9.66994
		AscendingNode   -166.602
		ArgOfPericenter -174.389
		MeanAnomaly     42.4204
	}
}

Comet	"C148"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            9.27036e-016
	Radius          0.137699
	InertiaMoment   0.395801

	Oblateness      0.0415688

	RotationPeriod  25.2403
	Obliquity       167.495
	EqAscendNode    163.411

	AbsMagn         11.7358
	SlopeParam      5.66902
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.756 0.753 0.751)

	Surface
	{
		SurfStyle       0.00501189
		OceanStyle      0.650472
		Randomize      (-0.561, 0.826, 0.614)
		colorDistMagn   0.856823
		colorDistFreq   9.86254e-006
		detailScale     3.76011
		colorConversion true
		snowLevel       2
		tropicLatitude  0.219844
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.450035
		terraceProb     0.216547
		erosion         0
		montesMagn      0.420253
		montesFreq      3.00738
		montesSpiky     0.921617
		montesFraction  0.515989
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.0352e-005
		hillsFraction   0.526275
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263178
		craterFreq      0.234602
		craterDensity   0.851973
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   709.07
		volcanoTemp     1394.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.301, 0.301, 0.000)
		colorShelf     (0.321, 0.320, 0.319, 0.000)
		colorBeach     (0.340, 0.339, 0.338, 0.000)
		colorDesert    (0.359, 0.358, 0.357, 0.000)
		colorLowland   (0.378, 0.376, 0.376, 0.000)
		colorUpland    (0.397, 0.395, 0.394, 0.000)
		colorRock      (0.416, 0.414, 0.413, 0.000)
		colorSnow      (0.435, 0.433, 0.432, 1.000)
		BumpHeight      0.123929
		BumpOffset      0.0247859
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0486914
		DustBright  0.21378
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.99246
		Period          14.7601
		Eccentricity    0.973736
		Inclination     -178.361
		AscendingNode   93.1631
		ArgOfPericenter -125.141
		MeanAnomaly     2.45005
	}
}

Comet	"C149"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            7.16996e-012
	Radius          3.20975
	InertiaMoment   0.399006

	Oblateness      0.0830743

	RotationPeriod  22.9855
	Obliquity       120.7
	EqAscendNode    147.988

	AbsMagn         14.8693
	SlopeParam      4.50206
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.496 0.487 0.482)

	Surface
	{
		SurfStyle       0.0894524
		OceanStyle      0.0516484
		Randomize      (-0.544, 0.932, 0.528)
		colorDistMagn   0.820739
		colorDistFreq   0.00836053
		detailScale     87.6475
		colorConversion true
		snowLevel       2
		tropicLatitude  0.901881
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.672501
		terraceProb     0.103298
		erosion         0
		montesMagn      0.636938
		montesFreq      2.85941
		montesSpiky     0.999432
		montesFraction  0.565369
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.026544
		hillsFraction   0.672331
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236099
		craterFreq      0.182175
		craterDensity   1.03021
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   187.94
		volcanoTemp     1229.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.195, 0.193, 0.000)
		colorShelf     (0.211, 0.207, 0.205, 0.000)
		colorBeach     (0.223, 0.219, 0.217, 0.000)
		colorDesert    (0.235, 0.231, 0.229, 0.000)
		colorLowland   (0.248, 0.244, 0.241, 0.000)
		colorUpland    (0.260, 0.256, 0.253, 0.000)
		colorRock      (0.273, 0.268, 0.265, 0.000)
		colorSnow      (0.285, 0.280, 0.277, 1.000)
		BumpHeight      2.88877
		BumpOffset      0.577754
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.48712
		GasToDust   0.25
		Particles   1963
		GasBright   0.182673
		DustBright  0.564284
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.19864
		Period          9.29565
		Eccentricity    0.941123
		Inclination     173.614
		AscendingNode   37.9618
		ArgOfPericenter 150.559
		MeanAnomaly     -172.742
	}
}

Comet	"C150"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.54544e-008
	Radius          53.817
	InertiaMoment   0.397453

	Oblateness      0.0624973

	RotationPeriod  20.6279
	Obliquity       73.9061
	EqAscendNode    132.566

	AbsMagn         2.8001
	SlopeParam      3.49438
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.784 0.782 0.780)

	Surface
	{
		SurfStyle       0.682888
		OceanStyle      0.991355
		Randomize      (-0.905, -0.527, 0.626)
		colorDistMagn   0.197001
		colorDistFreq   1.73976
		detailScale     1469.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.099512
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48714
		terraceProb     0.369026
		erosion         0
		montesMagn      0.561661
		montesFreq      3.0917
		montesSpiky     0.986587
		montesFraction  0.576716
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.5296
		hillsFraction   0.642358
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25364
		craterFreq      0.176817
		craterDensity   0.776084
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.8309
		volcanoTemp     1507.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.266, 0.218, 0.000)
		colorShelf     (0.314, 0.274, 0.250, 0.000)
		colorBeach     (0.368, 0.320, 0.297, 0.000)
		colorDesert    (0.400, 0.344, 0.289, 0.000)
		colorLowland   (0.439, 0.367, 0.328, 0.000)
		colorUpland    (0.486, 0.446, 0.398, 0.000)
		colorRock      (0.525, 0.485, 0.429, 0.000)
		colorSnow      (0.572, 0.516, 0.453, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.968312
		GasToDust   0.25
		Particles   2935
		GasBright   0.130987
		DustBright  0.300457
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.08701
		Period          8.59678
		Eccentricity    0.9248
		Inclination     -101.015
		AscendingNode   177.312
		ArgOfPericenter -178.308
		MeanAnomaly     -175.666
	}
}

Comet	"C151"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.70748e-015
	Radius          0.197693
	InertiaMoment   0.399458

	Oblateness      0.130992

	RotationPeriod  18.1466
	Obliquity       27.1118
	EqAscendNode    117.143

	AbsMagn         5.03155
	SlopeParam      2.32608
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.501 0.497 0.495)

	Surface
	{
		SurfStyle       0.355251
		OceanStyle      0.408831
		Randomize      (0.831, 0.002, -0.804)
		colorDistMagn   0.809116
		colorDistFreq   2.89163e-005
		detailScale     5.39834
		colorConversion true
		snowLevel       2
		tropicLatitude  0.767116
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505625
		terraceProb     0.206517
		erosion         0
		montesMagn      0.365128
		montesFreq      2.46594
		montesSpiky     0.927526
		montesFraction  0.537646
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.95598e-005
		hillsFraction   0.711562
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.29089
		craterFreq      0.258777
		craterDensity   0.798375
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   750.102
		volcanoTemp     1523.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.199, 0.198, 0.000)
		colorShelf     (0.213, 0.211, 0.210, 0.000)
		colorBeach     (0.226, 0.223, 0.223, 0.000)
		colorDesert    (0.238, 0.236, 0.235, 0.000)
		colorLowland   (0.251, 0.248, 0.247, 0.000)
		colorUpland    (0.263, 0.261, 0.260, 0.000)
		colorRock      (0.276, 0.273, 0.272, 0.000)
		colorSnow      (0.288, 0.286, 0.285, 1.000)
		BumpHeight      0.177924
		BumpOffset      0.0355848
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0387539
		GasToDust   0.25
		Particles   1058
		GasBright   0.33216
		DustBright  0.583771
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.71365
		Period          6.39636
		Eccentricity    0.927873
		Inclination     127.181
		AscendingNode   73.4247
		ArgOfPericenter 144.373
		MeanAnomaly     101.336
	}
}

Comet	"C152"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.32061e-011
	Radius          3.33355
	InertiaMoment   0.398206

	Oblateness      0.110571

	RotationPeriod  15.5146
	Obliquity       340.318
	EqAscendNode    101.721

	AbsMagn         6.57913
	SlopeParam      6.02002
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.695 0.624 0.599)

	Surface
	{
		SurfStyle       0.401938
		OceanStyle      0.821085
		Randomize      (-0.529, -0.863, -0.734)
		colorDistMagn   0.606937
		colorDistFreq   0.00717739
		detailScale     91.0282
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998814
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.447485
		terraceProb     0.299464
		erosion         0
		montesMagn      0.454075
		montesFreq      3.77927
		montesSpiky     0.970205
		montesFraction  0.480967
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0255918
		hillsFraction   0.664014
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261048
		craterFreq      0.176469
		craterDensity   0.74297
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   143.822
		volcanoTemp     1415.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.249, 0.240, 0.000)
		colorShelf     (0.295, 0.265, 0.255, 0.000)
		colorBeach     (0.313, 0.281, 0.270, 0.000)
		colorDesert    (0.330, 0.296, 0.285, 0.000)
		colorLowland   (0.347, 0.312, 0.300, 0.000)
		colorUpland    (0.365, 0.327, 0.315, 0.000)
		colorRock      (0.382, 0.343, 0.330, 0.000)
		colorSnow      (0.399, 0.359, 0.345, 1.000)
		BumpHeight      3.0002
		BumpOffset      0.60004
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.519946
		GasToDust   0.25
		Particles   2030
		GasBright   0.253191
		DustBright  0.347226
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.77327
		Period          20.8989
		Eccentricity    0.967945
		Inclination     106.342
		AscendingNode   -13.9856
		ArgOfPericenter 48.0947
		MeanAnomaly     -124.002
	}
}

Comet	"C153"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.0214e-007
	Radius          76.8832
	InertiaMoment   0.399883

	Oblateness      0.249

	RotationPeriod  12.6963
	Obliquity       293.523
	EqAscendNode    86.298

	AbsMagn         7.934
	SlopeParam      4.74294
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.703 0.582 0.476)

	Surface
	{
		SurfStyle       0.439724
		OceanStyle      0.977048
		Randomize      (-0.613, -0.640, 0.168)
		colorDistMagn   0.878029
		colorDistFreq   3.88114
		detailScale     2099.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996393
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.328035
		terraceProb     0.387767
		erosion         0
		montesMagn      0.605916
		montesFreq      3.31671
		montesSpiky     0.933865
		montesFraction  0.623048
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.5408
		hillsFraction   0.572903
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256985
		craterFreq      0.208063
		craterDensity   1.02777
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.7172
		volcanoTemp     1668.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.233, 0.190, 0.000)
		colorShelf     (0.299, 0.247, 0.202, 0.000)
		colorBeach     (0.316, 0.262, 0.214, 0.000)
		colorDesert    (0.334, 0.276, 0.226, 0.000)
		colorLowland   (0.351, 0.291, 0.238, 0.000)
		colorUpland    (0.369, 0.305, 0.250, 0.000)
		colorRock      (0.386, 0.320, 0.262, 0.000)
		colorSnow      (0.404, 0.335, 0.274, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.136964
		DustBright  0.14794
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.12091
		Period          15.7206
		Eccentricity    0.942613
		Inclination     145.828
		AscendingNode   -36.2957
		ArgOfPericenter 107.79
		MeanAnomaly     141.702
	}
}

Comet	"C154"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.14497e-015
	Radius          0.206489
	InertiaMoment   0.398765

	Oblateness      0.249

	RotationPeriod  9.64318
	Obliquity       246.729
	EqAscendNode    70.8755

	AbsMagn         9.28112
	SlopeParam      3.72824
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.410 0.406 0.404)

	Surface
	{
		SurfStyle       0.583426
		OceanStyle      0.16439
		Randomize      (-0.280, -0.816, -0.734)
		colorDistMagn   0.298749
		colorDistFreq   3.58352e-005
		detailScale     5.63852
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97828
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.283037
		terraceProb     0.108814
		erosion         0
		montesMagn      0.439077
		montesFreq      3.60041
		montesSpiky     0.968851
		montesFraction  0.604706
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.65904e-005
		hillsFraction   0.694132
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23695
		craterFreq      0.245987
		craterDensity   0.852253
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   577.29
		volcanoTemp     1272.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.138, 0.113, 0.000)
		colorShelf     (0.164, 0.142, 0.129, 0.000)
		colorBeach     (0.193, 0.167, 0.154, 0.000)
		colorDesert    (0.209, 0.179, 0.149, 0.000)
		colorLowland   (0.229, 0.191, 0.170, 0.000)
		colorUpland    (0.254, 0.231, 0.206, 0.000)
		colorRock      (0.274, 0.252, 0.222, 0.000)
		colorSnow      (0.299, 0.268, 0.234, 1.000)
		BumpHeight      0.18584
		BumpOffset      0.037168
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.07158
		GasToDust   0.25
		Particles   1124
		GasBright   0.0306086
		DustBright  0.738782
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.24146
		Period          9.56852
		Eccentricity    0.959476
		Inclination     122.364
		AscendingNode   122.663
		ArgOfPericenter 169.841
		MeanAnomaly     -25.6704
	}
}

Comet	"C155"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.43241e-011
	Radius          4.74156
	InertiaMoment   0.396893

	Oblateness      0.249

	RotationPeriod  6.28582
	Obliquity       199.935
	EqAscendNode    55.4529

	AbsMagn         10.7973
	SlopeParam      2.63245
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.695 0.690 0.687)

	Surface
	{
		SurfStyle       0.614032
		OceanStyle      0.614191
		Randomize      (0.194, -0.648, 0.547)
		colorDistMagn   0.996966
		colorDistFreq   0.019314
		detailScale     129.476
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992624
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.264185
		terraceProb     0.553386
		erosion         0
		montesMagn      0.529359
		montesFreq      3.77012
		montesSpiky     0.943671
		montesFraction  0.457597
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0490195
		hillsFraction   0.667946
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233149
		craterFreq      0.171263
		craterDensity   0.646985
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   150.733
		volcanoTemp     1285.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.234, 0.192, 0.000)
		colorShelf     (0.278, 0.241, 0.220, 0.000)
		colorBeach     (0.327, 0.283, 0.261, 0.000)
		colorDesert    (0.355, 0.303, 0.254, 0.000)
		colorLowland   (0.389, 0.324, 0.289, 0.000)
		colorUpland    (0.431, 0.393, 0.350, 0.000)
		colorRock      (0.466, 0.428, 0.378, 0.000)
		colorSnow      (0.508, 0.455, 0.398, 1.000)
		BumpHeight      4.2674
		BumpOffset      0.853481
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.552772
		GasToDust   0.25
		Particles   2096
		GasBright   0.0448559
		DustBright  0.409021
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.61727
		Period          12.0731
		Eccentricity    0.960625
		Inclination     102.943
		AscendingNode   -176.908
		ArgOfPericenter 110.155
		MeanAnomaly     -103.963
	}
}

Comet	"C156"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.88129e-007
	Radius          80.7021
	InertiaMoment   0.39924

	Oblateness      0.249

	RotationPeriod  2.52007
	Obliquity       153.14
	EqAscendNode    40.0303

	AbsMagn         12.9068
	SlopeParam      6.4478
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.600 0.542 0.430)

	Surface
	{
		SurfStyle       0.766284
		OceanStyle      0.37298
		Randomize      (-0.421, 0.974, 0.556)
		colorDistMagn   0.451185
		colorDistFreq   2.73839
		detailScale     2203.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.344332
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.753862
		terraceProb     0.154629
		erosion         0
		montesMagn      0.393255
		montesFreq      3.50477
		montesSpiky     0.749165
		montesFraction  0.519166
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.2262
		hillsFraction   0.627887
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.196237
		craterFreq      0.211483
		craterDensity   0.990744
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.1718
		volcanoTemp     1573.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.184, 0.120, 0.000)
		colorShelf     (0.240, 0.190, 0.137, 0.000)
		colorBeach     (0.282, 0.222, 0.163, 0.000)
		colorDesert    (0.306, 0.239, 0.159, 0.000)
		colorLowland   (0.336, 0.255, 0.180, 0.000)
		colorUpland    (0.372, 0.309, 0.219, 0.000)
		colorRock      (0.402, 0.336, 0.236, 0.000)
		colorSnow      (0.438, 0.358, 0.249, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.148143
		DustBright  0.790221
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.8944
		Period          7.43454
		Eccentricity    0.956812
		Inclination     7.61186
		AscendingNode   24.1874
		ArgOfPericenter -27.5585
		MeanAnomaly     -118.433
	}
}

Comet	"C157"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.79264e-015
	Radius          0.292558
	InertiaMoment   0.397872

	Oblateness      0.0027365

	RotationPeriod  122.348
	Obliquity       106.346
	EqAscendNode    24.6077

	AbsMagn         0.464738
	SlopeParam      4.99514
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.484 0.479 0.475)

	Surface
	{
		SurfStyle       0.517795
		OceanStyle      0.547123
		Randomize      (0.684, 0.883, 0.987)
		colorDistMagn   0.271363
		colorDistFreq   2.57985e-005
		detailScale     7.98878
		colorConversion true
		snowLevel       2
		tropicLatitude  0.975142
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.700849
		terraceProb     0.301729
		erosion         0
		montesMagn      0.343056
		montesFreq      3.00085
		montesSpiky     0.879046
		montesFraction  0.299863
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000247788
		hillsFraction   0.678818
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243482
		craterFreq      0.273315
		craterDensity   0.97544
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   602.67
		volcanoTemp     1116.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.163, 0.133, 0.000)
		colorShelf     (0.194, 0.168, 0.152, 0.000)
		colorBeach     (0.228, 0.196, 0.181, 0.000)
		colorDesert    (0.247, 0.211, 0.176, 0.000)
		colorLowland   (0.271, 0.225, 0.200, 0.000)
		colorUpland    (0.300, 0.273, 0.242, 0.000)
		colorRock      (0.324, 0.297, 0.261, 0.000)
		colorSnow      (0.353, 0.316, 0.276, 1.000)
		BumpHeight      0.263302
		BumpOffset      0.0526604
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.104406
		GasToDust   0.25
		Particles   1190
		GasBright   0.135108
		DustBright  0.487742
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.55005
		Period          5.50258
		Eccentricity    0.884733
		Inclination     5.26386
		AscendingNode   -131.794
		ArgOfPericenter 144.806
		MeanAnomaly     -157.276
	}
}

Comet	"C158"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.4802e-011
	Radius          4.9989
	InertiaMoment   0.399675

	Oblateness      0.00214986

	RotationPeriod  111.235
	Obliquity       59.5518
	EqAscendNode    9.18509

	AbsMagn         4.0549
	SlopeParam      3.95843
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.453 0.446 0.440)

	Surface
	{
		SurfStyle       0.681119
		OceanStyle      0.984998
		Randomize      (-0.729, -0.280, -0.456)
		colorDistMagn   0.888252
		colorDistFreq   0.00501834
		detailScale     136.503
		colorConversion true
		snowLevel       2
		tropicLatitude  0.833035
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53428
		terraceProb     0.146037
		erosion         0
		montesMagn      0.51398
		montesFreq      4.082
		montesSpiky     0.93926
		montesFraction  0.312466
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0593971
		hillsFraction   0.577085
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242296
		craterFreq      0.190292
		craterDensity   0.966904
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   117.093
		volcanoTemp     1007.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.152, 0.123, 0.000)
		colorShelf     (0.181, 0.156, 0.141, 0.000)
		colorBeach     (0.213, 0.183, 0.167, 0.000)
		colorDesert    (0.231, 0.196, 0.163, 0.000)
		colorLowland   (0.253, 0.209, 0.185, 0.000)
		colorUpland    (0.281, 0.254, 0.224, 0.000)
		colorRock      (0.303, 0.276, 0.242, 0.000)
		colorSnow      (0.330, 0.294, 0.255, 1.000)
		BumpHeight      4.49901
		BumpOffset      0.899802
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.585598
		GasToDust   0.25
		Particles   2162
		GasBright   0.0848139
		DustBright  0.222523
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.32793
		Period          17.3105
		Eccentricity    0.958252
		Inclination     -174.433
		AscendingNode   -125.743
		ArgOfPericenter 162.789
		MeanAnomaly     76.6343
	}
}

Comet	"C159"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.4651e-007
	Radius          113.938
	InertiaMoment   0.398504

	Oblateness      0.00374087

	RotationPeriod  104.109
	Obliquity       12.7575
	EqAscendNode    353.763

	AbsMagn         5.83542
	SlopeParam      2.90961
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.798 0.710 0.663)

	Surface
	{
		SurfStyle       0.646052
		OceanStyle      0.212842
		Randomize      (-0.793, -0.319, -0.180)
		colorDistMagn   0.389391
		colorDistFreq   6.23587
		detailScale     3111.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.87636
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.367241
		terraceProb     0.252059
		erosion         0
		montesMagn      0.466028
		montesFreq      2.90793
		montesSpiky     0.997437
		montesFraction  0.519364
		dunesFraction   0
		hillsMagn       0
		hillsFreq       30.0751
		hillsFraction   0.702899
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224678
		craterFreq      0.434919
		craterDensity   0.9444
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   30.347
		volcanoTemp     1602.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.241, 0.186, 0.000)
		colorShelf     (0.319, 0.248, 0.212, 0.000)
		colorBeach     (0.375, 0.291, 0.252, 0.000)
		colorDesert    (0.407, 0.312, 0.245, 0.000)
		colorLowland   (0.447, 0.334, 0.279, 0.000)
		colorUpland    (0.495, 0.404, 0.338, 0.000)
		colorRock      (0.535, 0.440, 0.365, 0.000)
		colorSnow      (0.583, 0.468, 0.385, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.265268
		DustBright  0.526555
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.21791
		Period          9.41812
		Eccentricity    0.943781
		Inclination     -59.8545
		AscendingNode   92.4444
		ArgOfPericenter -143.027
		MeanAnomaly     -26.57
	}
}

Comet	"C160"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.06693e-014
	Radius          0.309645
	InertiaMoment   0.395848

	Oblateness      0.00268737

	RotationPeriod  98.6805
	Obliquity       325.963
	EqAscendNode    338.34

	AbsMagn         7.25789
	SlopeParam      7.03224
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.528 0.458 0.348)

	Surface
	{
		SurfStyle       0.633671
		OceanStyle      0.318435
		Randomize      (0.243, 0.157, -0.501)
		colorDistMagn   0.924787
		colorDistFreq   2.81949e-005
		detailScale     8.45536
		colorConversion true
		snowLevel       2
		tropicLatitude  0.899239
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.426288
		terraceProb     0.751607
		erosion         0
		montesMagn      0.382316
		montesFreq      3.26031
		montesSpiky     0.991265
		montesFraction  0.408796
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000216324
		hillsFraction   0.631561
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218797
		craterFreq      0.250249
		craterDensity   1.01678
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   470.004
		volcanoTemp     1747.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.156, 0.097, 0.000)
		colorShelf     (0.211, 0.160, 0.111, 0.000)
		colorBeach     (0.248, 0.188, 0.132, 0.000)
		colorDesert    (0.270, 0.202, 0.129, 0.000)
		colorLowland   (0.296, 0.215, 0.146, 0.000)
		colorUpland    (0.328, 0.261, 0.177, 0.000)
		colorRock      (0.354, 0.284, 0.191, 0.000)
		colorSnow      (0.386, 0.303, 0.202, 1.000)
		BumpHeight      0.27868
		BumpOffset      0.055736
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.137232
		GasToDust   0.25
		Particles   1257
		GasBright   0.187692
		DustBright  0.288618
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.5256
		Period          18.8755
		Eccentricity    0.953271
		Inclination     96.1496
		AscendingNode   18.9864
		ArgOfPericenter 173.293
		MeanAnomaly     -151.037
	}
}

Comet	"C161"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            8.25193e-011
	Radius          7.03499
	InertiaMoment   0.399012

	Oblateness      0.00452417

	RotationPeriod  94.2087
	Obliquity       279.169
	EqAscendNode    322.917

	AbsMagn         8.58981
	SlopeParam      5.26431
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.798 0.796 0.795)

	Surface
	{
		SurfStyle       0.0569915
		OceanStyle      0.961972
		Randomize      (-0.591, -0.616, -0.382)
		colorDistMagn   0.771325
		colorDistFreq   0.0430289
		detailScale     192.102
		colorConversion true
		snowLevel       2
		tropicLatitude  0.897733
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.294912
		terraceProb     0.382568
		erosion         0
		montesMagn      0.555238
		montesFreq      3.00342
		montesSpiky     0.981263
		montesFraction  0.376112
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0975244
		hillsFraction   0.738163
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255024
		craterFreq      0.145223
		craterDensity   1.09653
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   121.42
		volcanoTemp     1202.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.319, 0.318, 0.000)
		colorShelf     (0.339, 0.338, 0.338, 0.000)
		colorBeach     (0.359, 0.358, 0.358, 0.000)
		colorDesert    (0.379, 0.378, 0.378, 0.000)
		colorLowland   (0.399, 0.398, 0.398, 0.000)
		colorUpland    (0.419, 0.418, 0.418, 0.000)
		colorRock      (0.439, 0.438, 0.437, 0.000)
		colorSnow      (0.459, 0.458, 0.457, 1.000)
		BumpHeight      6.33149
		BumpOffset      1.2663
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.618424
		GasToDust   0.25
		Particles   2229
		GasBright   0.435337
		DustBright  0.52546
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.12976
		Period          3.42396
		Eccentricity    0.93163
		Inclination     135.327
		AscendingNode   -37.0623
		ArgOfPericenter 4.15966
		MeanAnomaly     58.1851
	}
}

Comet	"C162"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.38228e-007
	Radius          121.019
	InertiaMoment   0.397465

	Oblateness      0.00321847

	RotationPeriod  90.3547
	Obliquity       232.375
	EqAscendNode    307.495

	AbsMagn         9.99267
	SlopeParam      4.18807
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.440 0.432 0.428)

	Surface
	{
		SurfStyle       0.344836
		OceanStyle      0.648244
		Randomize      (-0.632, 0.226, -0.484)
		colorDistMagn   0.87285
		colorDistFreq   8.74703
		detailScale     3304.62
		colorConversion true
		snowLevel       2
		tropicLatitude  0.932873
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.473699
		terraceProb     0.307485
		erosion         0
		montesMagn      0.578408
		montesFreq      3.0269
		montesSpiky     0.9299
		montesFraction  0.340326
		dunesFraction   0
		hillsMagn       0
		hillsFreq       33.5855
		hillsFraction   0.514262
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219244
		craterFreq      0.366824
		craterDensity   1.01494
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.7504
		volcanoTemp     1442.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.173, 0.171, 0.000)
		colorShelf     (0.187, 0.184, 0.182, 0.000)
		colorBeach     (0.198, 0.194, 0.192, 0.000)
		colorDesert    (0.209, 0.205, 0.203, 0.000)
		colorLowland   (0.220, 0.216, 0.214, 0.000)
		colorUpland    (0.231, 0.227, 0.225, 0.000)
		colorRock      (0.242, 0.238, 0.235, 0.000)
		colorSnow      (0.253, 0.248, 0.246, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00783697
		DustBright  0.637446
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.28836
		Period          9.87039
		Eccentricity    0.929797
		Inclination     -158.266
		AscendingNode   45.1362
		ArgOfPericenter -141.472
		MeanAnomaly     -85.177
	}
}

Comet	"C163"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.96515e-014
	Radius          0.434487
	InertiaMoment   0.399463

	Oblateness      0.00526484

	RotationPeriod  86.9332
	Obliquity       185.58
	EqAscendNode    292.072

	AbsMagn         11.7078
	SlopeParam      3.16721
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.652 0.535 0.492)

	Surface
	{
		SurfStyle       0.341606
		OceanStyle      0.346849
		Randomize      (-1.000, -0.515, -0.111)
		colorDistMagn   0.417923
		colorDistFreq   0.000152814
		detailScale     11.8644
		colorConversion true
		snowLevel       2
		tropicLatitude  0.810473
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.375112
		terraceProb     0.243497
		erosion         0
		montesMagn      0.379176
		montesFreq      3.32282
		montesSpiky     0.988533
		montesFraction  0.507912
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000467956
		hillsFraction   0.778683
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255135
		craterFreq      0.259465
		craterDensity   0.906428
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   485.942
		volcanoTemp     1423.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.214, 0.197, 0.000)
		colorShelf     (0.277, 0.227, 0.209, 0.000)
		colorBeach     (0.294, 0.241, 0.221, 0.000)
		colorDesert    (0.310, 0.254, 0.234, 0.000)
		colorLowland   (0.326, 0.268, 0.246, 0.000)
		colorUpland    (0.342, 0.281, 0.258, 0.000)
		colorRock      (0.359, 0.294, 0.270, 0.000)
		colorSnow      (0.375, 0.308, 0.283, 1.000)
		BumpHeight      0.391038
		BumpOffset      0.0782077
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.170058
		GasToDust   0.25
		Particles   1323
		GasBright   0.0234764
		DustBright  0.306293
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.25956
		Period          16.7798
		Eccentricity    0.94994
		Inclination     51.1974
		AscendingNode   -59.9971
		ArgOfPericenter -110.96
		MeanAnomaly     112.958
	}
}

Comet	"C164"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.51991e-010
	Radius          7.49623
	InertiaMoment   0.398214

	Oblateness      0.00374186

	RotationPeriod  83.8314
	Obliquity       138.786
	EqAscendNode    276.65

	AbsMagn         14.7911
	SlopeParam      8.14998
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.518 0.514 0.509)

	Surface
	{
		SurfStyle       0.0828152
		OceanStyle      0.267069
		Randomize      (-0.553, -0.859, 0.761)
		colorDistMagn   0.244339
		colorDistFreq   0.0474635
		detailScale     204.697
		colorConversion true
		snowLevel       2
		tropicLatitude  0.940454
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.374552
		terraceProb     0.371438
		erosion         0
		montesMagn      0.640824
		montesFreq      2.67776
		montesSpiky     0.880864
		montesFraction  0.45425
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.145834
		hillsFraction   0.575774
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2602
		craterFreq      0.270998
		craterDensity   0.742757
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   95.3324
		volcanoTemp     1174.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.206, 0.204, 0.000)
		colorShelf     (0.220, 0.218, 0.216, 0.000)
		colorBeach     (0.233, 0.231, 0.229, 0.000)
		colorDesert    (0.246, 0.244, 0.242, 0.000)
		colorLowland   (0.259, 0.257, 0.255, 0.000)
		colorUpland    (0.272, 0.270, 0.267, 0.000)
		colorRock      (0.285, 0.283, 0.280, 0.000)
		colorSnow      (0.298, 0.296, 0.293, 1.000)
		BumpHeight      6.74661
		BumpOffset      1.34932
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.65125
		GasToDust   0.25
		Particles   2295
		GasBright   0.106045
		DustBright  0.708211
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.01436
		Period          14.9225
		Eccentricity    0.943452
		Inclination     145.664
		AscendingNode   40.8175
		ArgOfPericenter 44.3643
		MeanAnomaly     -163.847
	}
}

Comet	"C165"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.6799e-018
	Radius          0.0268406
	InertiaMoment   0.399888

	Oblateness      0.00601658

	RotationPeriod  80.9752
	Obliquity       91.9917
	EqAscendNode    261.227

	AbsMagn         2.75743
	SlopeParam      5.55866
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.756 0.754 0.752)

	Surface
	{
		SurfStyle       0.752845
		OceanStyle      0.350317
		Randomize      (-0.819, -0.262, -0.962)
		colorDistMagn   0.923594
		colorDistFreq   3.60574e-007
		detailScale     0.732927
		colorConversion true
		snowLevel       2
		tropicLatitude  0.675898
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.690106
		terraceProb     0.416222
		erosion         0
		montesMagn      0.436788
		montesFreq      3.16197
		montesSpiky     0.897192
		montesFraction  0.422274
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.69394e-006
		hillsFraction   0.534357
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264396
		craterFreq      0.208173
		craterDensity   1.0917
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1945.27
		volcanoTemp     1315.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.256, 0.211, 0.000)
		colorShelf     (0.302, 0.264, 0.241, 0.000)
		colorBeach     (0.355, 0.309, 0.286, 0.000)
		colorDesert    (0.385, 0.332, 0.278, 0.000)
		colorLowland   (0.423, 0.354, 0.316, 0.000)
		colorUpland    (0.469, 0.430, 0.383, 0.000)
		colorRock      (0.506, 0.467, 0.414, 0.000)
		colorSnow      (0.552, 0.497, 0.436, 1.000)
		BumpHeight      0.0241565
		BumpOffset      0.00483131
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0944024
		DustBright  0.40434
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.20331
		Period          9.32526
		Eccentricity    0.951413
		Inclination     105.558
		AscendingNode   139.096
		ArgOfPericenter 124.847
		MeanAnomaly     -10.2629
	}
}

Comet	"C166"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.61956e-014
	Radius          0.464336
	InertiaMoment   0.398771

	Oblateness      0.00428817

	RotationPeriod  78.3128
	Obliquity       45.1974
	EqAscendNode    245.804

	AbsMagn         5.00752
	SlopeParam      4.42022
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.717 0.671 0.598)

	Surface
	{
		SurfStyle       0.838009
		OceanStyle      0.125033
		Randomize      (0.741, -0.289, -0.756)
		colorDistMagn   0.837553
		colorDistFreq   6.0566e-005
		detailScale     12.6795
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998457
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.645981
		terraceProb     0.247597
		erosion         0
		montesMagn      0.533199
		montesFreq      2.78089
		montesSpiky     0.915229
		montesFraction  0.377078
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000457785
		hillsFraction   0.618183
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22564
		craterFreq      0.245759
		craterDensity   0.753265
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   382.658
		volcanoTemp     2038.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.228, 0.167, 0.000)
		colorShelf     (0.287, 0.235, 0.191, 0.000)
		colorBeach     (0.337, 0.275, 0.227, 0.000)
		colorDesert    (0.366, 0.295, 0.221, 0.000)
		colorLowland   (0.402, 0.315, 0.251, 0.000)
		colorUpland    (0.445, 0.383, 0.305, 0.000)
		colorRock      (0.480, 0.416, 0.329, 0.000)
		colorSnow      (0.523, 0.443, 0.347, 1.000)
		BumpHeight      0.417903
		BumpOffset      0.0835806
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.202884
		GasToDust   0.25
		Particles   1389
		GasBright   0.244161
		DustBright  0.739068
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.66723
		Period          12.4205
		Eccentricity    0.958422
		Inclination     -96.7325
		AscendingNode   78.6945
		ArgOfPericenter 129.619
		MeanAnomaly     -38.1154
	}
}

Comet	"C167"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.79947e-010
	Radius          10.4639
	InertiaMoment   0.396911

	Oblateness      0.00672451

	RotationPeriod  75.8066
	Obliquity       358.403
	EqAscendNode    230.382

	AbsMagn         6.55973
	SlopeParam      3.41164
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.613 0.559 0.518)

	Surface
	{
		SurfStyle       0.443608
		OceanStyle      0.0841209
		Randomize      (0.589, -0.053, -0.827)
		colorDistMagn   0.960637
		colorDistFreq   0.0412279
		detailScale     285.735
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999836
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496209
		terraceProb     0.279125
		erosion         0
		montesMagn      0.397299
		montesFreq      2.75108
		montesSpiky     0.943975
		montesFraction  0.507597
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.293082
		hillsFraction   0.417547
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242543
		craterFreq      0.193531
		craterDensity   1.0063
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   98.0535
		volcanoTemp     1206.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.223, 0.207, 0.000)
		colorShelf     (0.260, 0.237, 0.220, 0.000)
		colorBeach     (0.276, 0.251, 0.233, 0.000)
		colorDesert    (0.291, 0.265, 0.246, 0.000)
		colorLowland   (0.306, 0.279, 0.259, 0.000)
		colorUpland    (0.322, 0.293, 0.272, 0.000)
		colorRock      (0.337, 0.307, 0.285, 0.000)
		colorSnow      (0.352, 0.321, 0.298, 1.000)
		BumpHeight      9.41755
		BumpOffset      1.88351
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.684076
		GasToDust   0.25
		Particles   2361
		GasBright   0.205237
		DustBright  0.462479
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.68972
		Period          20.2087
		Eccentricity    0.962136
		Inclination     -89.1078
		AscendingNode   95.2651
		ArgOfPericenter -66.7366
		MeanAnomaly     -110.895
	}
}

Comet	"C168"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            8.61977e-018
	Radius          0.0287622
	InertiaMoment   0.399245

	Oblateness      0.00487651

	RotationPeriod  73.4286
	Obliquity       311.609
	EqAscendNode    214.959

	AbsMagn         7.9158
	SlopeParam      2.21014
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.589 0.583 0.578)

	Surface
	{
		SurfStyle       0.995355
		OceanStyle      0.397337
		Randomize      (0.405, -0.250, -0.220)
		colorDistMagn   0.616656
		colorDistFreq   5.36424e-007
		detailScale     0.785401
		colorConversion true
		snowLevel       2
		tropicLatitude  0.874516
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.383719
		terraceProb     0.187399
		erosion         0
		montesMagn      0.341705
		montesFreq      3.10673
		montesSpiky     0.872043
		montesFraction  0.627817
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.38282e-006
		hillsFraction   0.413897
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245658
		craterFreq      0.232894
		craterDensity   0.994711
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1535.96
		volcanoTemp     1612.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.204, 0.231, 0.050)
		colorShelf     (0.236, 0.239, 0.266, 0.040)
		colorBeach     (0.271, 0.274, 0.301, 0.030)
		colorDesert    (0.306, 0.309, 0.341, 0.020)
		colorLowland   (0.341, 0.344, 0.376, 0.030)
		colorUpland    (0.377, 0.379, 0.411, 0.050)
		colorRock      (0.412, 0.414, 0.457, 0.020)
		colorSnow      (0.412, 0.414, 0.457, 1.000)
		BumpHeight      0.025886
		BumpOffset      0.0051772
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.129053
		DustBright  0.22315
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.01414
		Period          8.15044
		Eccentricity    0.915233
		Inclination     -34.6272
		AscendingNode   81.6879
		ArgOfPericenter -59.8115
		MeanAnomaly     -28.2276
	}
}

Comet	"C169"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            6.66678e-014
	Radius          0.646661
	InertiaMoment   0.397881

	Oblateness      0.00759151

	RotationPeriod  71.1567
	Obliquity       264.814
	EqAscendNode    199.537

	AbsMagn         9.26198
	SlopeParam      5.89147
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.460 0.457 0.452)

	Surface
	{
		SurfStyle       0.322485
		OceanStyle      0.260285
		Randomize      (-0.871, 0.821, -0.284)
		colorDistMagn   0.762684
		colorDistFreq   0.000311073
		detailScale     17.6581
		colorConversion true
		snowLevel       2
		tropicLatitude  0.786001
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.471985
		terraceProb     0.349007
		erosion         0
		montesMagn      0.370812
		montesFreq      2.40933
		montesSpiky     0.878885
		montesFraction  0.579709
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000789646
		hillsFraction   0.586135
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244964
		craterFreq      0.15489
		craterDensity   0.912824
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   392.667
		volcanoTemp     1623.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.183, 0.181, 0.000)
		colorShelf     (0.195, 0.194, 0.192, 0.000)
		colorBeach     (0.207, 0.206, 0.204, 0.000)
		colorDesert    (0.218, 0.217, 0.215, 0.000)
		colorLowland   (0.230, 0.228, 0.226, 0.000)
		colorUpland    (0.241, 0.240, 0.237, 0.000)
		colorRock      (0.253, 0.251, 0.249, 0.000)
		colorSnow      (0.264, 0.263, 0.260, 1.000)
		BumpHeight      0.581994
		BumpOffset      0.116399
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.23571
		GasToDust   0.25
		Particles   1455
		GasBright   0.355979
		DustBright  0.48071
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.48772
		Period          18.5721
		Eccentricity    0.966206
		Inclination     -135.872
		AscendingNode   -9.89577
		ArgOfPericenter 134.812
		MeanAnomaly     -4.68019
	}
}

Comet	"C170"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.15627e-010
	Radius          11.2412
	InertiaMoment   0.39968

	Oblateness      0.00552477

	RotationPeriod  68.9735
	Obliquity       218.02
	EqAscendNode    184.114

	AbsMagn         10.7741
	SlopeParam      4.6582
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.817 0.777 0.734)

	Surface
	{
		SurfStyle       0.5145
		OceanStyle      0.0520562
		Randomize      (0.773, 0.943, 0.714)
		colorDistMagn   0.809799
		colorDistFreq   0.0536588
		detailScale     306.96
		colorConversion true
		snowLevel       2
		tropicLatitude  0.700011
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.474354
		terraceProb     0.157025
		erosion         0
		montesMagn      0.35463
		montesFreq      2.4201
		montesSpiky     0.877234
		montesFraction  0.282948
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.346021
		hillsFraction   0.577527
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258348
		craterFreq      0.201947
		craterDensity   0.878601
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   77.6159
		volcanoTemp     1377.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.264, 0.206, 0.000)
		colorShelf     (0.327, 0.272, 0.235, 0.000)
		colorBeach     (0.384, 0.319, 0.279, 0.000)
		colorDesert    (0.417, 0.342, 0.272, 0.000)
		colorLowland   (0.458, 0.365, 0.308, 0.000)
		colorUpland    (0.507, 0.443, 0.374, 0.000)
		colorRock      (0.548, 0.482, 0.404, 0.000)
		colorSnow      (0.597, 0.513, 0.426, 1.000)
		BumpHeight      10.1171
		BumpOffset      2.02342
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.716902
		GasToDust   0.25
		Particles   2428
		GasBright   0.252513
		DustBright  0.268662
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.42142
		Period          18.045
		Eccentricity    0.968129
		Inclination     -165.675
		AscendingNode   71.1777
		ArgOfPericenter 75.6943
		MeanAnomaly     142.722
	}
}

Comet	"C171"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.58766e-017
	Radius          0.0399693
	InertiaMoment   0.398511

	Oblateness      0.00854471

	RotationPeriod  66.8648
	Obliquity       171.226
	EqAscendNode    168.691

	AbsMagn         12.8684
	SlopeParam      3.64756
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.619 0.612 0.608)

	Surface
	{
		SurfStyle       0.916058
		OceanStyle      0.677263
		Randomize      (-0.346, 0.284, 0.557)
		colorDistMagn   0.970835
		colorDistFreq   1.28719e-006
		detailScale     1.09143
		colorConversion true
		snowLevel       2
		tropicLatitude  0.507577
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.445083
		terraceProb     0.169252
		erosion         0
		montesMagn      0.552077
		montesFreq      2.24278
		montesSpiky     0.980534
		montesFraction  0.753701
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.51844e-006
		hillsFraction   0.622769
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237409
		craterFreq      0.178141
		craterDensity   0.974268
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1572.73
		volcanoTemp     1372.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.214, 0.243, 0.050)
		colorShelf     (0.248, 0.251, 0.280, 0.040)
		colorBeach     (0.285, 0.288, 0.316, 0.030)
		colorDesert    (0.322, 0.324, 0.359, 0.020)
		colorLowland   (0.359, 0.361, 0.395, 0.030)
		colorUpland    (0.396, 0.398, 0.432, 0.050)
		colorRock      (0.434, 0.434, 0.481, 0.020)
		colorSnow      (0.434, 0.434, 0.481, 1.000)
		BumpHeight      0.0359723
		BumpOffset      0.00719447
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00895706
		DustBright  0.196705
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.35207
		Period          25.8876
		Eccentricity    0.952521
		Inclination     -31.0943
		AscendingNode   101.205
		ArgOfPericenter -48.2545
		MeanAnomaly     -46.108
	}
}

Comet	"C172"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.22794e-013
	Radius          0.696311
	InertiaMoment   0.395892

	Oblateness      0.00615508

	RotationPeriod  64.8191
	Obliquity       124.432
	EqAscendNode    153.269

	AbsMagn         0.354574
	SlopeParam      2.52995
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.731 0.729 0.726)

	Surface
	{
		SurfStyle       0.597902
		OceanStyle      0.59697
		Randomize      (-0.057, -0.246, -0.914)
		colorDistMagn   0.295558
		colorDistFreq   0.00023158
		detailScale     19.0139
		colorConversion true
		snowLevel       2
		tropicLatitude  0.875327
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.372687
		terraceProb     0.363124
		erosion         0
		montesMagn      0.441704
		montesFreq      3.59033
		montesSpiky     0.947733
		montesFraction  0.634069
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00148635
		hillsFraction   0.549429
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239612
		craterFreq      0.208613
		craterDensity   0.920262
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   311.545
		volcanoTemp     1349.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.248, 0.203, 0.000)
		colorShelf     (0.292, 0.255, 0.232, 0.000)
		colorBeach     (0.344, 0.299, 0.276, 0.000)
		colorDesert    (0.373, 0.321, 0.268, 0.000)
		colorLowland   (0.409, 0.342, 0.305, 0.000)
		colorUpland    (0.453, 0.415, 0.370, 0.000)
		colorRock      (0.490, 0.452, 0.399, 0.000)
		colorSnow      (0.534, 0.481, 0.421, 1.000)
		BumpHeight      0.62668
		BumpOffset      0.125336
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.268536
		GasToDust   0.25
		Particles   1522
		GasBright   0.0708076
		DustBright  0.619341
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.95233
		Period          7.77816
		Eccentricity    0.933607
		Inclination     -127.5
		AscendingNode   77.7067
		ArgOfPericenter 28.6206
		MeanAnomaly     -62.382
	}
}

Comet	"C173"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            9.4972e-010
	Radius          15.5897
	InertiaMoment   0.399018

	Oblateness      0.00961901

	RotationPeriod  62.8262
	Obliquity       77.6373
	EqAscendNode    137.846

	AbsMagn         4.02519
	SlopeParam      6.28724
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.742 0.656 0.621)

	Surface
	{
		SurfStyle       0.139217
		OceanStyle      0.127736
		Randomize      (-0.742, 0.044, -0.610)
		colorDistMagn   0.487361
		colorDistFreq   0.00289736
		detailScale     425.702
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988779
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.373194
		terraceProb     0.388889
		erosion         0
		montesMagn      0.359992
		montesFreq      2.57121
		montesSpiky     0.895145
		montesFraction  0.398628
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.332454
		hillsFraction   0.756129
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247656
		craterFreq      0.180073
		craterDensity   0.912289
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   79.3131
		volcanoTemp     1544.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.262, 0.248, 0.000)
		colorShelf     (0.315, 0.279, 0.264, 0.000)
		colorBeach     (0.334, 0.295, 0.279, 0.000)
		colorDesert    (0.352, 0.312, 0.295, 0.000)
		colorLowland   (0.371, 0.328, 0.311, 0.000)
		colorUpland    (0.389, 0.345, 0.326, 0.000)
		colorRock      (0.408, 0.361, 0.342, 0.000)
		colorSnow      (0.427, 0.377, 0.357, 1.000)
		BumpHeight      14.0307
		BumpOffset      2.80614
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.749727
		GasToDust   0.25
		Particles   2494
		GasBright   0.0605571
		DustBright  0.314078
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.12738
		Period          15.7695
		Eccentricity    0.953702
		Inclination     -149.658
		AscendingNode   -85.8873
		ArgOfPericenter -136.559
		MeanAnomaly     -8.33755
	}
}

Comet	"C174"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.92427e-017
	Radius          0.0431314
	InertiaMoment   0.397476

	Oblateness      0.00700536

	RotationPeriod  60.8779
	Obliquity       30.843
	EqAscendNode    122.424

	AbsMagn         5.81431
	SlopeParam      4.90592
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.629 0.437 0.353)

	Surface
	{
		SurfStyle       0.273249
		OceanStyle      0.48601
		Randomize      (0.856, -0.952, -0.280)
		colorDistMagn   0.469934
		colorDistFreq   1.54261e-006
		detailScale     1.17777
		colorConversion true
		snowLevel       2
		tropicLatitude  0.680121
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.513813
		terraceProb     0.127761
		erosion         0
		montesMagn      0.434508
		montesFreq      4.11056
		montesSpiky     0.978848
		montesFraction  0.560584
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.54551e-006
		hillsFraction   0.54593
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246564
		craterFreq      0.275768
		craterDensity   0.93377
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1250.52
		volcanoTemp     1191.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.175, 0.141, 0.000)
		colorShelf     (0.267, 0.186, 0.150, 0.000)
		colorBeach     (0.283, 0.197, 0.159, 0.000)
		colorDesert    (0.299, 0.208, 0.168, 0.000)
		colorLowland   (0.314, 0.219, 0.176, 0.000)
		colorUpland    (0.330, 0.230, 0.185, 0.000)
		colorRock      (0.346, 0.241, 0.194, 0.000)
		colorSnow      (0.361, 0.252, 0.203, 1.000)
		BumpHeight      0.0388182
		BumpOffset      0.00776365
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.189598
		DustBright  0.669524
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.21641
		Period          16.4477
		Eccentricity    0.984945
		Inclination     23.3223
		AscendingNode   74.1832
		ArgOfPericenter -164.044
		MeanAnomaly     36.6521
	}
}

Comet	"C175"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            2.26171e-013
	Radius          0.963835
	InertiaMoment   0.399469

	Oblateness      0.0108541

	RotationPeriod  58.9665
	Obliquity       344.049
	EqAscendNode    107.001

	AbsMagn         7.23937
	SlopeParam      3.87866
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.636 0.634 0.630)

	Surface
	{
		SurfStyle       0.833025
		OceanStyle      0.0890282
		Randomize      (0.073, -0.131, -0.595)
		colorDistMagn   0.98808
		colorDistFreq   0.000152314
		detailScale     26.3191
		colorConversion true
		snowLevel       2
		tropicLatitude  0.46901
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436441
		terraceProb     0.268169
		erosion         0
		montesMagn      0.614823
		montesFreq      3.87764
		montesSpiky     0.962602
		montesFraction  0.347577
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0026603
		hillsFraction   0.538446
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264101
		craterFreq      0.239753
		craterDensity   0.861593
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   317.754
		volcanoTemp     1193.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.215, 0.176, 0.000)
		colorShelf     (0.255, 0.222, 0.202, 0.000)
		colorBeach     (0.299, 0.260, 0.239, 0.000)
		colorDesert    (0.325, 0.279, 0.233, 0.000)
		colorLowland   (0.356, 0.298, 0.265, 0.000)
		colorUpland    (0.395, 0.361, 0.321, 0.000)
		colorRock      (0.426, 0.393, 0.346, 0.000)
		colorSnow      (0.465, 0.418, 0.365, 1.000)
		BumpHeight      0.867452
		BumpOffset      0.17349
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.301361
		GasToDust   0.25
		Particles   1588
		GasBright   0.152065
		DustBright  0.391543
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.12181
		Period          8.81265
		Eccentricity    0.911912
		Inclination     -37.7033
		AscendingNode   136.775
		ArgOfPericenter 74.2843
		MeanAnomaly     79.3807
	}
}

Comet	"C176"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            1.74927e-009
	Radius          16.8571
	InertiaMoment   0.398222

	Oblateness      0.00797335

	RotationPeriod  57.0856
	Obliquity       297.254
	EqAscendNode    91.5785

	AbsMagn         8.57141
	SlopeParam      2.81593
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.649 0.645 0.638)

	Surface
	{
		SurfStyle       0.801949
		OceanStyle      0.475493
		Randomize      (0.496, -0.894, 0.975)
		colorDistMagn   0.752081
		colorDistFreq   0.154833
		detailScale     460.312
		colorConversion true
		snowLevel       2
		tropicLatitude  0.930083
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.753409
		terraceProb     0.334903
		erosion         0
		montesMagn      0.493237
		montesFreq      2.51339
		montesSpiky     0.991301
		montesFraction  0.66121
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.687183
		hillsFraction   0.835728
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229208
		craterFreq      0.191427
		craterDensity   0.884823
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.1919
		volcanoTemp     1257.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.219, 0.179, 0.000)
		colorShelf     (0.259, 0.226, 0.204, 0.000)
		colorBeach     (0.305, 0.264, 0.243, 0.000)
		colorDesert    (0.331, 0.284, 0.236, 0.000)
		colorLowland   (0.363, 0.303, 0.268, 0.000)
		colorUpland    (0.402, 0.367, 0.325, 0.000)
		colorRock      (0.435, 0.400, 0.351, 0.000)
		colorSnow      (0.474, 0.425, 0.370, 1.000)
		BumpHeight      15.1714
		BumpOffset      3.03428
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.782553
		GasToDust   0.25
		Particles   2560
		GasBright   0.0772737
		DustBright  0.150821
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.74205
		Period          12.9468
		Eccentricity    0.942136
		Inclination     84.7785
		AscendingNode   -68.4155
		ArgOfPericenter -136.664
		MeanAnomaly     -108.849
	}
}

Comet	"C177"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            5.38612e-017
	Radius          0.0595961
	InertiaMoment   0.399893

	Oblateness      0.0123016

	RotationPeriod  55.2292
	Obliquity       250.46
	EqAscendNode    76.1559

	AbsMagn         9.97208
	SlopeParam      6.80156
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.446 0.440 0.436)

	Surface
	{
		SurfStyle       0.645426
		OceanStyle      0.362743
		Randomize      (0.031, -0.462, -0.501)
		colorDistMagn   0.357748
		colorDistFreq   2.67782e-006
		detailScale     1.62737
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998176
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48937
		terraceProb     0.383351
		erosion         0
		montesMagn      0.503593
		montesFreq      3.9514
		montesSpiky     0.906386
		montesFraction  0.391694
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.15498e-005
		hillsFraction   0.828726
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254896
		craterFreq      0.272061
		craterDensity   0.779214
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1273.17
		volcanoTemp     1267.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.150, 0.122, 0.000)
		colorShelf     (0.178, 0.154, 0.139, 0.000)
		colorBeach     (0.209, 0.180, 0.166, 0.000)
		colorDesert    (0.227, 0.194, 0.161, 0.000)
		colorLowland   (0.250, 0.207, 0.183, 0.000)
		colorUpland    (0.276, 0.251, 0.222, 0.000)
		colorRock      (0.299, 0.273, 0.240, 0.000)
		colorSnow      (0.325, 0.290, 0.253, 1.000)
		BumpHeight      0.0536365
		BumpOffset      0.0107273
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.283482
		DustBright  0.4291
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.03746
		Period          15.0944
		Eccentricity    0.936548
		Inclination     27.1377
		AscendingNode   56.4978
		ArgOfPericenter -5.93276
		MeanAnomaly     16.7832
	}
}

Comet	"C178"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            4.16578e-013
	Radius          1.04418
	InertiaMoment   0.398777

	Oblateness      0.00911547

	RotationPeriod  53.3919
	Obliquity       203.666
	EqAscendNode    60.7333

	AbsMagn         11.6799
	SlopeParam      5.16842
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.468 0.465 0.463)

	Surface
	{
		SurfStyle       0.412338
		OceanStyle      0.350185
		Randomize      (0.724, -0.185, -0.883)
		colorDistMagn   0.840113
		colorDistFreq   0.000402068
		detailScale     28.5129
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995413
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.647501
		terraceProb     0.434875
		erosion         0
		montesMagn      0.50265
		montesFreq      3.26472
		montesSpiky     0.872498
		montesFraction  0.371718
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00211963
		hillsFraction   0.857506
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231678
		craterFreq      0.224355
		craterDensity   0.960107
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   253.648
		volcanoTemp     1643.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.186, 0.185, 0.000)
		colorShelf     (0.199, 0.198, 0.197, 0.000)
		colorBeach     (0.211, 0.209, 0.208, 0.000)
		colorDesert    (0.222, 0.221, 0.220, 0.000)
		colorLowland   (0.234, 0.233, 0.231, 0.000)
		colorUpland    (0.246, 0.244, 0.243, 0.000)
		colorRock      (0.257, 0.256, 0.254, 0.000)
		colorSnow      (0.269, 0.267, 0.266, 1.000)
		BumpHeight      0.939758
		BumpOffset      0.187952
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.334187
		GasToDust   0.25
		Particles   1654
		GasBright   0.181408
		DustBright  0.21566
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.83277
		Period          13.5945
		Eccentricity    0.97172
		Inclination     95.4339
		AscendingNode   117.16
		ArgOfPericenter 161.678
		MeanAnomaly     159.906
	}
}

Comet	"C179"
{
	ParentBody     "Proxima"
	Class	       "Asteroid"

	Mass            3.22193e-009
	Radius          23.253
	InertiaMoment   0.396928

	Oblateness      0.0138562

	RotationPeriod  51.5685
	Obliquity       156.872
	EqAscendNode    45.3107

	AbsMagn         14.7154
	SlopeParam      4.10815
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.486 0.482 0.480)

	Surface
	{
		SurfStyle       0.116251
		OceanStyle      0.0499971
		Randomize      (0.238, -0.471, -0.082)
		colorDistMagn   0.841557
		colorDistFreq   0.190685
		detailScale     634.961
		colorConversion true
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.260975
		terraceProb     0.235059
		erosion         0
		montesMagn      0.414326
		montesFreq      3.41863
		montesSpiky     0.941394
		montesFraction  0.530167
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.29425
		hillsFraction   0.521113
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.290296
		craterFreq      0.191189
		craterDensity   0.851808
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   64.2282
		volcanoTemp     1341.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.193, 0.192, 0.000)
		colorShelf     (0.207, 0.205, 0.204, 0.000)
		colorBeach     (0.219, 0.217, 0.216, 0.000)
		colorDesert    (0.231, 0.229, 0.228, 0.000)
		colorLowland   (0.243, 0.241, 0.240, 0.000)
		colorUpland    (0.255, 0.253, 0.252, 0.000)
		colorRock      (0.267, 0.265, 0.264, 0.000)
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

	CometTail
	{
		MaxLength   0.815379
		GasToDust   0.25
		Particles   2627
		GasBright   0.0140294
		DustBright  0.867525
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.06597
		Period          15.3073
		Eccentricity    0.955957
		Inclination     108.007
		AscendingNode   -40.6001
		ArgOfPericenter 170.873
		MeanAnomaly     80.1712
	}
}

