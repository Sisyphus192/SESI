Star	"RS 8476-1353-8-11843423-178"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "L0.9 V"
	Luminosity      0.000125894
	MassSol         0.0692681
	RadSol          0.0600913
	Teff            1933

	Age             1.79609

	InertiaMoment   0.234975

	RotationPeriod  6.18337
	Obliquity       83.1977
	EqAscendNode    316.436

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.218 0.005)

	Surface
	{
		SurfStyle       0.284111
		Randomize      (-0.152, 0.610, 0.233)
		colorDistMagn   0.620425
		colorDistFreq   9.54549
		detailScale     107573
		colorConversion true
		tropicLatitude  0.74804
		icecapLatitude  1.16536
		mainFreq        0.0737128
		venusFreq       6.90572
		venusMagn       0.167686
		mareFreq        5.75568
		mareDensity     0.00292813
		erosion         0.970368
		montesFreq      22.4149
		dunesMagn       1.20142
		hillsMagn       0.03
		hillsFreq       22.4149
		craterOctaves   0
		twistZones      5.28634
		twistMagn       0.959786
		cycloneMagn     10.2078
		cycloneFreq     0.193452
		cycloneDensity  0.054848
		cycloneOctaves  2
		colorLayer0    (0.280, 0.260, 0.250, 1.000)
		colorLayer1    (0.220, 0.200, 0.200, 0.900)
		colorLayer2    (0.100, 0.060, 0.060, 0.600)
		colorLayer3    (0.080, 0.040, 0.040, 0.000)
		colorLayer4    (0.050, 0.020, 0.020, 0.000)
		colorLayer5    (0.080, 0.040, 0.040, 0.600)
		colorLayer6    (0.160, 0.100, 0.060, 0.900)
		colorLayer7    (0.220, 0.220, 0.220, 1.000)
		colorLowPlants (0.050, 0.020, 0.020, 0.000)
		colorUpPlants  (0.080, 0.040, 0.040, 0.600)
		BumpHeight      41.8235
		BumpOffset      41.8235
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          25.0938
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.658173
		mainOctaves     10
		Coverage        0.0296323
		twistZones      5.28634
		twistMagn       0.959786
	}

	Clouds
	{
		Height          50.1875
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.658173
		mainOctaves     10
		Coverage        0.0296323
		twistZones      5.28634
		twistMagn       0.959786
	}

	Clouds
	{
		Height          75.2813
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.658173
		mainOctaves     10
		Coverage        0.0296323
		twistZones      5.28634
		twistMagn       0.959786
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          418.235
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
		Height      1052.51
		NorthLat    79.6567
		NorthLon    41.6767
		NorthRadius 25772
		NorthWidth  4110.18
		NorthRings  2
		NorthBright 10
		NorthParticles 5000
		SouthLat    -78.9288
		SouthLon    226.108
		SouthRadius 21491.9
		SouthWidth  3961.16
		SouthRings  5
		SouthBright 10
		SouthParticles 5000
		TopColor    (1.000 0.000 0.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	Corona
	{
		Radius      217969
		Period      0.000964712
		Brightness  0.25
		RayDensity  2.0766
		RayCurv     3.67184
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     83.1977
		AscendingNode   316.436
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Planet	"1"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Desert"

	Mass            0.09309
	Radius          2634.73
	InertiaMoment   0.33272

	RotationPeriod  42.535
	Obliquity       -2.37402
	EqAscendNode    53.0026

	AlbedoBond      0.7
	AlbedoGeom      0.84
	Brightness      2
	Color          (0.805 0.770 0.748)

	Surface
	{
		SurfStyle       0.715014
		OceanStyle      0.0938989
		Randomize      (-0.681, 0.444, 0.545)
		colorDistMagn   0.0773527
		colorDistFreq   351.704
		detailScale     6776.68
		colorConversion true
		seaLevel        0.111056
		snowLevel       2
		tropicLatitude  0.074089
		icecapLatitude  10
		icecapHeight    0.161548
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.21625
		venusFreq       0.900974
		venusMagn       0
		mareFreq        1.43943
		mareDensity     0.0601485
		terraceProb     0.21305
		erosion         0
		montesMagn      0.194658
		montesFreq      156.545
		montesSpiky     0.937123
		montesFraction  0.989612
		dunesMagn       0.0526096
		dunesFreq       33.9906
		dunesFraction   0.0795508
		hillsMagn       0.10791
		hillsFreq       270.326
		hillsFraction   0
		hills2Fraction  0
		riversMagn      63.1169
		riversFreq      3.00076
		riversSin       5.02698
		riversOctaves   0
		canyonsMagn     0.0320613
		canyonsFreq     73.9015
		canyonFraction  0
		cracksMagn      0.0734196
		cracksFreq      0.237672
		cracksOctaves   0
		craterMagn      0.573057
		craterFreq      6.88274
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.632511
		volcanoFreq     3.23557
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.57595
		volcanoRadius   0.365057
		volcanoTemp     1323.14
		lavaCoverTidal  0.309296
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      2.13995
		twistMagn       0.190187
		cycloneMagn     3.1121
		cycloneFreq     0.387988
		cycloneDensity  0.00636169
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

	Clouds
	{
		Height          28.9802
		BumpHeight      5.24059
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.05949
		mainOctaves     10
		Coverage        1
		twistZones      2.13995
		twistMagn       0.190187
	}

	Clouds
	{
		Height          47.9602
		BumpHeight      6.58783
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.05949
		mainOctaves     10
		Coverage        1
		twistZones      2.13995
		twistMagn       0.190187
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          131.737
		Density         66.1327
		Pressure        139.498
		Greenhouse      368.918
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.067961
		Saturation      0.664438

		Composition
		{
			CO2   	77.8267
			H2O   	18.0943
			SO2   	4.02025
			N2    	0.0550928
			CO    	0.00273214
			Ar    	0.000516851
			Ne    	0.000371832
		}
	}

	Aurora
	{
		Height      70.3488
		NorthLat    56.2499
		NorthLon    -73.1563
		NorthRadius 563.694
		NorthWidth  645.368
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -66.6456
		SouthLon    103.863
		SouthRadius 927.42
		SouthWidth  1123.31
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
		SemiMajorAxis   0.0154244
		Period          0.00727855
		Eccentricity    0.0764948
		Inclination     -2.37402
		AscendingNode   53.0026
		ArgOfPericenter 11.3948
		MeanAnomaly     65.5503
	}
}

DwarfMoon	"1.D1"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            1.90434e-010
	Radius          4.94736
	InertiaMoment   0.398705

	Oblateness      0.249

	Obliquity       -0.000462359
	EqAscendNode    10.3711
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.644 0.588 0.557)

	Surface
	{
		SurfStyle       0.304546
		OceanStyle      0.116617
		Randomize      (-0.442, 0.688, 0.167)
		colorDistMagn   0.74017
		colorDistFreq   0.0152145
		detailScale     135.096
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495745
		terraceProb     0.271629
		erosion         0
		montesMagn      0.445028
		montesFreq      3.03899
		montesSpiky     0.874496
		montesFraction  0.688084
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0562753
		hillsFraction   0.716438
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203866
		craterFreq      0.231704
		craterDensity   0.967474
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   56.2092
		volcanoTemp     1235.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.235, 0.223, 0.000)
		colorShelf     (0.274, 0.250, 0.237, 0.000)
		colorBeach     (0.290, 0.265, 0.251, 0.000)
		colorDesert    (0.306, 0.279, 0.265, 0.000)
		colorLowland   (0.322, 0.294, 0.278, 0.000)
		colorUpland    (0.338, 0.309, 0.292, 0.000)
		colorRock      (0.354, 0.323, 0.306, 0.000)
		colorSnow      (0.370, 0.338, 0.320, 1.000)
		BumpHeight      4.45263
		BumpOffset      0.890525
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.47553e-005
		Period          0.000388382
		Eccentricity    1.39151e-005
		Inclination     -0.000462359
		AscendingNode   10.3711
		ArgOfPericenter 81.2452
		MeanAnomaly     -10.847
	}
}

Planet	"2"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Desert"

	Mass            0.292715
	Radius          4250.11
	InertiaMoment   0.33327

	Obliquity       0.318992
	EqAscendNode    88.1115
	TidalLocked     true

	AlbedoBond      0.364003
	AlbedoGeom      0.436804
	Brightness      2
	Color          (0.413 0.406 0.402)

	Surface
	{
		SurfStyle       0.791275
		OceanStyle      0.473695
		Randomize      (0.005, 0.949, -0.627)
		colorDistMagn   0.0676824
		colorDistFreq   487.856
		detailScale     10931.5
		colorConversion true
		seaLevel        0.171743
		snowLevel       2
		tropicLatitude  0.0080009
		icecapLatitude  10
		icecapHeight    0.133287
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.0693
		venusFreq       0.534781
		venusMagn       0.522113
		mareFreq        1.4851
		mareDensity     0.08804
		terraceProb     0.345763
		erosion         0
		montesMagn      0.256102
		montesFreq      253.602
		montesSpiky     0.988689
		montesFraction  0.693861
		dunesMagn       0.0560068
		dunesFreq       25.7384
		dunesFraction   0.762506
		hillsMagn       0.170891
		hillsFreq       433.474
		hillsFraction   0
		hills2Fraction  0
		riversMagn      61.257
		riversFreq      2.09832
		riversSin       4.45871
		riversOctaves   0
		canyonsMagn     0.02535
		canyonsFreq     125.588
		canyonFraction  0
		cracksMagn      0.0835115
		cracksFreq      0.501736
		cracksOctaves   0
		craterMagn      0.546954
		craterFreq      11.3767
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.765677
		volcanoFreq     2.8783
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.361021
		volcanoRadius   0.295419
		volcanoTemp     1551.19
		lavaCoverTidal  0.134353
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      1
		twistMagn       3.5
		cycloneMagn     1.39672
		cycloneDensity  0.340259
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

	Clouds
	{
		Height          12.5322
		BumpHeight      6.42813
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.939025
		mainOctaves     10
		Coverage        0.328006
		twistZones      1
		twistMagn       3.5
	}

	Clouds
	{
		Height          15.0649
		BumpHeight      6.29028
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.939025
		mainOctaves     10
		Coverage        0.328006
		twistZones      1
		twistMagn       3.5
	}

	Clouds
	{
		Height          17.5972
		BumpHeight      6.92939
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.939025
		mainOctaves     10
		Coverage        0.328006
		twistZones      1
		twistMagn       3.5
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          193.121
		Density         1.3648
		Pressure        2.01116
		Greenhouse      38.5504
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0192969
		Saturation      1.02961

		Composition
		{
			H2O   	66.6438
			CO2   	28.7889
			SO2   	3.69996
			H2S   	0.32841
			NH3   	0.171806
			N2    	0.164032
			C2H4  	0.0952436
			CH4   	0.0625484
			C3H8  	0.0214918
			C2H2  	0.0174751
			C2H6  	0.00287991
			Ar    	0.00251609
			CO    	0.000912726
			Ne    	2.24722e-005
			Kr    	1.69109e-005
		}
	}

	Aurora
	{
		Height      124.805
		NorthLat    86.8897
		NorthLon    -132.133
		NorthRadius 1220.71
		NorthWidth  1576.24
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -90
		SouthLon    20.2491
		SouthRadius 932.742
		SouthWidth  982.625
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
		SemiMajorAxis   0.0332752
		Period          0.0230628
		Eccentricity    0.0809541
		Inclination     0.318992
		AscendingNode   88.1115
		ArgOfPericenter 89.4057
		MeanAnomaly     35.6236
	}
}

Moon	"2.1"
{
	ParentBody     "2"
	Class	       "Selena"

	Mass            0.000810982
	Radius          558.391
	InertiaMoment   0.397151

	Oblateness      0.0161291

	Obliquity       1.45401
	EqAscendNode    -6.92292
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.634 0.630 0.623)

	Surface
	{
		SurfStyle       0.319234
		OceanStyle      0.889113
		Randomize      (0.549, 0.934, -0.241)
		colorDistMagn   0.06287
		colorDistFreq   71.4042
		detailScale     1436.21
		colorConversion true
		drivenDarkening 0
		seaLevel        0.205949
		snowLevel       2
		tropicLatitude  0.0506404
		icecapLatitude  10
		icecapHeight    0.204186
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.72153
		venusFreq       1.63973
		venusMagn       0
		mareFreq        0
		mareDensity     0.00151416
		terraceProb     0.481094
		erosion         0
		montesMagn      0.0697433
		montesFreq      26.4874
		montesSpiky     0.973211
		montesFraction  0.402567
		dunesMagn       0.0332934
		dunesFreq       725.87
		dunesFraction   0.35576
		hillsMagn       0.122533
		hillsFreq       55.1629
		hillsFraction   0.140737
		hills2Fraction  0
		riversMagn      57.7075
		riversFreq      3.66846
		riversSin       7.30572
		riversOctaves   0
		canyonsMagn     0.472298
		canyonsFreq     0.176373
		canyonFraction  0.324215
		cracksMagn      0.0285028
		cracksFreq      0.196155
		cracksOctaves   0
		craterMagn      0.533242
		craterFreq      1.24615
		craterDensity   0.614103
		craterOctaves   7.63
		craterRayedFactor 0.117704
		volcanoMagn     0.214229
		volcanoFreq     2.90313
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.321568
		volcanoRadius   0.743746
		volcanoTemp     1783.92
		lavaCoverTidal  0.169136
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.349, 0.359, 0.374, 0.000)
		colorDesert    (0.304, 0.290, 0.287, 0.000)
		colorLowland   (0.387, 0.384, 0.349, 0.000)
		colorUpland    (0.412, 0.410, 0.380, 0.000)
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
		SemiMajorAxis   0.000112837
		Period          0.00127948
		Eccentricity    0.0125741
		Inclination     1.45401
		AscendingNode   -6.92292
		ArgOfPericenter 124.917
		MeanAnomaly     -55.5778
	}
}

DwarfMoon	"2.D1"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            8.6015e-009
	Radius          15.8327
	InertiaMoment   0.399107

	Oblateness      0.0239428

	Obliquity       -78.4764
	EqAscendNode    34.4319
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.462 0.458 0.454)

	Surface
	{
		SurfStyle       0.938113
		OceanStyle      0.518799
		Randomize      (0.062, 0.782, -0.237)
		colorDistMagn   0.688537
		colorDistFreq   0.151094
		detailScale     432.338
		colorConversion true
		snowLevel       2
		tropicLatitude  0.659193
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.385221
		terraceProb     0.114568
		erosion         0
		montesMagn      0.439374
		montesFreq      2.11217
		montesSpiky     0.890025
		montesFraction  0.709734
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.670227
		hillsFraction   0.780902
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237183
		craterFreq      0.227829
		craterDensity   1.07615
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.7654
		volcanoTemp     1498.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.157, 0.160, 0.182, 0.050)
		colorShelf     (0.185, 0.188, 0.209, 0.040)
		colorBeach     (0.212, 0.215, 0.236, 0.030)
		colorDesert    (0.240, 0.243, 0.268, 0.020)
		colorLowland   (0.268, 0.270, 0.295, 0.030)
		colorUpland    (0.295, 0.298, 0.322, 0.050)
		colorRock      (0.323, 0.325, 0.359, 0.020)
		colorSnow      (0.323, 0.325, 0.359, 1.000)
		BumpHeight      14.2494
		BumpOffset      2.84989
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000127846
		Period          0.00154521
		Eccentricity    0.044044
		Inclination     -78.4764
		AscendingNode   34.4319
		ArgOfPericenter -104.286
		MeanAnomaly     128.929
	}
}

Planet	"3"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Oceania"

	Mass            0.90828
	Radius          6839.77
	InertiaMoment   0.328018

	RotationPeriod  986.558
	Obliquity       -0.631558
	EqAscendNode    -174.994

	AlbedoBond      0.339102
	AlbedoGeom      0.406923
	Brightness      2
	Color          (0.845 0.798 0.750)

	Surface
	{
		SurfStyle       0.713707
		OceanStyle      0.946098
		Randomize      (0.209, 0.064, -0.663)
		colorDistMagn   0.0740787
		colorDistFreq   874.708
		detailScale     17592.3
		colorConversion true
		seaLevel        0.884617
		snowLevel       2
		tropicLatitude  0.000976562
		icecapLatitude  10
		icecapHeight    1.00839
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.492716
		venusFreq       1.5483
		venusMagn       0.319545
		mareFreq        0
		mareDensity     0
		terraceProb     0.350413
		erosion         0
		montesMagn      0.212151
		montesFreq      390.493
		montesSpiky     0.932165
		montesFraction  0.212757
		dunesMagn       0.0486246
		dunesFreq       51.4443
		dunesFraction   0.0291179
		hillsMagn       0.101919
		hillsFreq       850.198
		hillsFraction   0.768548
		hills2Fraction  0.0301716
		riversMagn      59.628
		riversFreq      2.84665
		riversSin       4.31027
		riversOctaves   0
		canyonsMagn     0.0181334
		canyonsFreq     182.434
		canyonFraction  0.543269
		cracksMagn      0.0931695
		cracksFreq      0.570716
		cracksOctaves   2
		craterMagn      0.0581365
		craterFreq      63.0053
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.645895
		volcanoFreq     14.9926
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0
		volcanoRadius   1.40583
		volcanoTemp     1560.03
		lavaCoverTidal  0.1025
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      1.93735
		twistMagn       0.787066
		cycloneMagn     1.89886
		cycloneFreq     0.370726
		cycloneDensity  0.0117498
		colorSea       (0.170, 0.070, 0.040, 1.000)
		colorShelf     (0.320, 0.110, 0.000, 1.000)
		colorBeach     (0.950, 0.950, 0.950, 1.308)
		colorDesert    (0.770, 0.770, 0.470, 1.308)
		colorLowland   (0.880, 0.880, 0.880, 1.308)
		colorUpland    (1.000, 1.000, 1.000, 1.308)
		colorRock      (1.000, 1.000, 1.000, 1.308)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		BumpHeight      34.0372
		BumpOffset      30.1099
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
		Height          2.27295
		BumpHeight      5.74925
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.01245
		mainOctaves     10
		Coverage        0.231837
		twistZones      1.93735
		twistMagn       0.787066
	}

	Ocean
	{
		Height          30.1099
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          77.8479
		Density         2.67075
		Pressure        1.9105
		Greenhouse      5.47985
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0493674
		Saturation      0.909738

		Composition
		{
			CO2   	91.9215
			NH3   	3.03176
			H2O   	2.56341
			SO2   	0.858899
			CH4   	0.480181
			H2S   	0.456478
			C2H2  	0.290665
			C2H6  	0.268731
			C2H4  	0.0811916
			H2    	0.0253286
			N2    	0.0130731
			CO    	0.00437499
			C3H8  	0.00303018
			Ar    	0.00130117
			Ne    	3.39127e-005
			He    	2.3418e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0519722
		Period          0.0450176
		Eccentricity    0.0957289
		Inclination     -0.631558
		AscendingNode   -174.994
		ArgOfPericenter 279.035
		MeanAnomaly     40.0111
	}
}

DwarfMoon	"3.D1"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.64342e-007
	Radius          41.3008
	InertiaMoment   0.398466

	Oblateness      0.165652

	Obliquity       -0.00437431
	EqAscendNode    7.87613
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.668 0.664 0.661)

	Surface
	{
		SurfStyle       0.701312
		OceanStyle      0.17381
		Randomize      (0.633, -0.262, -0.124)
		colorDistMagn   0.45064
		colorDistFreq   0.485253
		detailScale     1127.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.551751
		terraceProb     0.263078
		erosion         0
		montesMagn      0.500391
		montesFreq      2.79422
		montesSpiky     0.894302
		montesFraction  0.460559
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.70521
		hillsFraction   0.776475
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228937
		craterFreq      0.165384
		craterDensity   0.830161
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   15.9731
		volcanoTemp     1464.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.226, 0.185, 0.000)
		colorShelf     (0.267, 0.232, 0.211, 0.000)
		colorBeach     (0.314, 0.272, 0.251, 0.000)
		colorDesert    (0.341, 0.292, 0.245, 0.000)
		colorLowland   (0.374, 0.312, 0.278, 0.000)
		colorUpland    (0.414, 0.379, 0.337, 0.000)
		colorRock      (0.448, 0.412, 0.363, 0.000)
		colorSnow      (0.488, 0.438, 0.383, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.54118e-005
		Period          0.000565553
		Eccentricity    1.83797e-007
		Inclination     -0.00437431
		AscendingNode   7.87613
		ArgOfPericenter 169.506
		MeanAnomaly     -13.4524
	}
}

DwarfMoon	"3.D2"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            2.26469e-007
	Radius          43.1227
	InertiaMoment   0.399476

	Oblateness      0.056241

	Obliquity       -0.0144935
	EqAscendNode    37.7838
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.587 0.581 0.579)

	Surface
	{
		SurfStyle       0.435627
		OceanStyle      0.257293
		Randomize      (-0.221, 0.181, 0.173)
		colorDistMagn   0.681713
		colorDistFreq   1.30194
		detailScale     1177.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552999
		terraceProb     0.104835
		erosion         0
		montesMagn      0.586403
		montesFreq      2.89358
		montesSpiky     0.839928
		montesFraction  0.420732
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.36634
		hillsFraction   0.4954
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229457
		craterFreq      0.236996
		craterDensity   0.853369
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   14.2072
		volcanoTemp     1591.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.232, 0.231, 0.000)
		colorShelf     (0.249, 0.247, 0.246, 0.000)
		colorBeach     (0.264, 0.262, 0.260, 0.000)
		colorDesert    (0.279, 0.276, 0.275, 0.000)
		colorLowland   (0.293, 0.291, 0.289, 0.000)
		colorUpland    (0.308, 0.305, 0.304, 0.000)
		colorRock      (0.323, 0.320, 0.318, 0.000)
		colorSnow      (0.337, 0.334, 0.333, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000128487
		Period          0.000883806
		Eccentricity    6.37914e-005
		Inclination     -0.0144935
		AscendingNode   37.7838
		ArgOfPericenter 76.7998
		MeanAnomaly     -168.331
	}
}

DwarfPlanet	"4"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Selena"

	Mass            0.00255008
	Radius          1042.41
	InertiaMoment   0.398217

	Obliquity       0.837662
	EqAscendNode    -5.88914
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.810 0.738 0.706)

	Surface
	{
		SurfStyle       0.932606
		OceanStyle      0.520838
		Randomize      (0.347, 0.355, 0.802)
		colorDistMagn   0.0730074
		colorDistFreq   120.091
		detailScale     2681.14
		colorConversion true
		drivenDarkening 0
		seaLevel        0.131947
		snowLevel       2
		tropicLatitude  0.029198
		icecapLatitude  10
		icecapHeight    0.1628
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.51678
		venusFreq       1.32131
		venusMagn       0
		mareFreq        0.347375
		mareDensity     0.00122103
		terraceProb     0.170325
		erosion         0
		montesMagn      0.0608947
		montesFreq      39.9026
		montesSpiky     0.919122
		montesFraction  0.682286
		dunesMagn       0.0507285
		dunesFreq       1373.08
		dunesFraction   0.651997
		hillsMagn       0.144042
		hillsFreq       103.524
		hillsFraction   0.993684
		hills2Fraction  0
		riversMagn      59.7358
		riversFreq      3.03863
		riversSin       6.51507
		riversOctaves   0
		canyonsMagn     0.516706
		canyonsFreq     0.376334
		canyonFraction  0.784747
		cracksMagn      0.0713505
		cracksFreq      0.44363
		cracksOctaves   0
		craterMagn      0.617633
		craterFreq      2.36799
		craterDensity   0.804443
		craterOctaves   10
		craterRayedFactor 0.280849
		volcanoMagn     0.195095
		volcanoFreq     1.21107
		volcanoDensity  0.0498276
		volcanoOctaves  1
		volcanoActivity 0
		volcanoFlows    0.135938
		volcanoRadius   0.979887
		volcanoTemp     1598.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.440, 0.450, 0.370, 0.000)
		colorShelf     (0.580, 0.550, 0.430, 0.000)
		colorBeach     (0.575, 0.487, 0.409, 0.000)
		colorDesert    (0.672, 0.568, 0.452, 0.000)
		colorLowland   (0.535, 0.428, 0.339, 0.000)
		colorUpland    (0.478, 0.384, 0.318, 0.000)
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
		SemiMajorAxis   0.0821476
		Period          0.0894595
		Eccentricity    0.0484091
		Inclination     1.48734
		AscendingNode   -5.27262
		ArgOfPericenter 6.19473
		MeanAnomaly     61.1352
	}
}

DwarfPlanet	"5"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Selena"

	Mass            0.00943105
	Radius          1734.36
	InertiaMoment   0.378281

	Obliquity       -0.627367
	EqAscendNode    -90.5849
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.744 0.658 0.621)

	Surface
	{
		SurfStyle       0.361858
		OceanStyle      0.440204
		Randomize      (0.224, 0.497, -0.073)
		colorDistMagn   0.0592893
		colorDistFreq   247.609
		detailScale     4460.88
		colorConversion true
		drivenDarkening 0
		seaLevel        0.217065
		snowLevel       2
		tropicLatitude  0.0154056
		icecapLatitude  0.755347
		icecapHeight    0.23131
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.82434
		venusFreq       1.29978
		venusMagn       0
		mareFreq        0.718319
		mareDensity     0.00229095
		terraceProb     0.172721
		erosion         0
		montesMagn      0.0821153
		montesFreq      73.6323
		montesSpiky     0.818365
		montesFraction  0.517082
		dunesMagn       0.0491162
		dunesFreq       2293.6
		dunesFraction   0.720909
		hillsMagn       0.127897
		hillsFreq       219.34
		hillsFraction   0.600733
		hills2Fraction  0
		riversMagn      60.2139
		riversFreq      2.79109
		riversSin       6.35115
		riversOctaves   0
		canyonsMagn     0.582505
		canyonsFreq     0.533582
		canyonFraction  0.630677
		cracksMagn      0.0390615
		cracksFreq      1.08193
		cracksOctaves   0
		craterMagn      0.537427
		craterFreq      5.3556
		craterDensity   0.991936
		craterOctaves   11
		craterRayedFactor 0.43798
		volcanoMagn     0.314899
		volcanoFreq     1.30094
		volcanoDensity  0.065639
		volcanoOctaves  1
		volcanoActivity 0
		volcanoFlows    0.329268
		volcanoRadius   0.910676
		volcanoTemp     1202.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.409, 0.375, 0.373, 0.000)
		colorDesert    (0.357, 0.302, 0.286, 0.000)
		colorLowland   (0.454, 0.401, 0.348, 0.000)
		colorUpland    (0.484, 0.427, 0.379, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.99937
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
		Height          86.7182
		Density         6.29819e-005
		Pressure        2.34768e-005
		Greenhouse      0.0326239
		Bright          2.29004
		Opacity         0
		SkyLight        0.763347
		Hue             -0.0150239
		Saturation      1

		Composition
		{
			CO2   	98.797
			C2H4  	0.433263
			C3H8  	0.310354
			SO2   	0.222587
			H2S   	0.146174
			C2H6  	0.076296
			N2    	0.00718306
			C2H2  	0.00706329
			CO    	3.91386e-005
			Ar    	3.72606e-005
			Cl2   	3.29164e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.161302
		Period          0.246147
		Eccentricity    0.0306747
		Inclination     -0.973959
		AscendingNode   -92.5631
		ArgOfPericenter 357.315
		MeanAnomaly     296.023
	}
}

DwarfMoon	"5.D1"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.03951e-009
	Radius          13.5869
	InertiaMoment   0.39532

	Oblateness      0.249

	Obliquity       -0.00828625
	EqAscendNode    5.38115
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.754 0.750 0.747)

	Surface
	{
		SurfStyle       0.287087
		OceanStyle      0.998041
		Randomize      (0.987, -0.474, 0.488)
		colorDistMagn   0.957232
		colorDistFreq   0.100284
		detailScale     371.014
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536318
		terraceProb     0.298462
		erosion         0
		montesMagn      0.49929
		montesFreq      3.15311
		montesSpiky     0.965297
		montesFraction  0.777532
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.434937
		hillsFraction   0.492956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213791
		craterFreq      0.187165
		craterDensity   1.01774
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   66.0714
		volcanoTemp     1630.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.300, 0.299, 0.000)
		colorShelf     (0.320, 0.319, 0.317, 0.000)
		colorBeach     (0.339, 0.338, 0.336, 0.000)
		colorDesert    (0.358, 0.356, 0.355, 0.000)
		colorLowland   (0.377, 0.375, 0.373, 0.000)
		colorUpland    (0.396, 0.394, 0.392, 0.000)
		colorRock      (0.415, 0.413, 0.411, 0.000)
		colorSnow      (0.433, 0.431, 0.429, 1.000)
		BumpHeight      12.2282
		BumpOffset      2.44565
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.55089e-005
		Period          0.000767252
		Eccentricity    8.64525e-005
		Inclination     -0.00828625
		AscendingNode   5.38115
		ArgOfPericenter -102.232
		MeanAnomaly     -16.0579
	}
}

Asteroid	"S1"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.84091e-012
	Radius          0.828753
	InertiaMoment   0.396024

	Obliquity       -2.59841
	EqAscendNode    -126.435
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.520 0.418 0.376)

	Surface
	{
		SurfStyle       0.312504
		OceanStyle      0.274626
		Randomize      (0.530, 0.977, -0.944)
		colorDistMagn   0.798296
		colorDistFreq   0.000308368
		detailScale     22.6305
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0408484
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435137
		terraceProb     0.355354
		erosion         0
		montesMagn      0.485816
		montesFreq      2.74701
		montesSpiky     0.907486
		montesFraction  0.500914
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00170561
		hillsFraction   0.595295
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.20584
		craterFreq      0.234494
		craterDensity   0.630774
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   95.7668
		volcanoTemp     1383.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.167, 0.150, 0.000)
		colorShelf     (0.221, 0.178, 0.160, 0.000)
		colorBeach     (0.234, 0.188, 0.169, 0.000)
		colorDesert    (0.247, 0.199, 0.179, 0.000)
		colorLowland   (0.260, 0.209, 0.188, 0.000)
		colorUpland    (0.273, 0.219, 0.197, 0.000)
		colorRock      (0.286, 0.230, 0.207, 0.000)
		colorSnow      (0.299, 0.240, 0.216, 1.000)
		BumpHeight      0.745878
		BumpOffset      0.149176
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0836272
		Period          0.0918873
		Eccentricity    0.0427259
		Inclination     -2.59841
		AscendingNode   -126.435
		ArgOfPericenter -0.820253
		MeanAnomaly     87.6089
	}
}

Asteroid	"S2"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.709e-009
	Radius          10.7263
	InertiaMoment   0.398329

	Obliquity       1.36019
	EqAscendNode    -149.362
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.712 0.709 0.706)

	Surface
	{
		SurfStyle       0.957635
		OceanStyle      0.250068
		Randomize      (-0.728, -0.005, -0.938)
		colorDistMagn   0.714406
		colorDistFreq   0.0157232
		detailScale     292.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0125439
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.334153
		terraceProb     0.227159
		erosion         0
		montesMagn      0.497539
		montesFreq      2.32944
		montesSpiky     0.975874
		montesFraction  0.581326
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.238134
		hillsFraction   0.751328
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260707
		craterFreq      0.242792
		craterDensity   0.958708
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.3112
		volcanoTemp     1170.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.248, 0.282, 0.050)
		colorShelf     (0.285, 0.291, 0.325, 0.040)
		colorBeach     (0.328, 0.333, 0.367, 0.030)
		colorDesert    (0.370, 0.376, 0.417, 0.020)
		colorLowland   (0.413, 0.419, 0.459, 0.030)
		colorUpland    (0.456, 0.461, 0.501, 0.050)
		colorRock      (0.499, 0.504, 0.558, 0.020)
		colorSnow      (0.499, 0.504, 0.558, 1.000)
		BumpHeight      9.6537
		BumpOffset      1.93074
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0835148
		Period          0.0917021
		Eccentricity    0.100998
		Inclination     1.36019
		AscendingNode   -149.362
		ArgOfPericenter 12.9
		MeanAnomaly     149.071
	}
}

Asteroid	"S3"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.58703e-017
	Radius          0.0169933
	InertiaMoment   0.39939

	Obliquity       -1.63714
	EqAscendNode    -69.147
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.754 0.751 0.747)

	Surface
	{
		SurfStyle       0.512979
		OceanStyle      0.11508
		Randomize      (-0.267, -0.969, -0.184)
		colorDistMagn   0.291326
		colorDistFreq   1.6855e-007
		detailScale     0.464029
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0470359
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.415651
		terraceProb     0.404147
		erosion         0
		montesMagn      0.436789
		montesFreq      3.16978
		montesSpiky     0.879449
		montesFraction  0.784353
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.36536e-007
		hillsFraction   0.617216
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220519
		craterFreq      0.182061
		craterDensity   0.86525
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   668.791
		volcanoTemp     1267.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.255, 0.209, 0.000)
		colorShelf     (0.302, 0.263, 0.239, 0.000)
		colorBeach     (0.354, 0.308, 0.284, 0.000)
		colorDesert    (0.385, 0.331, 0.276, 0.000)
		colorLowland   (0.422, 0.353, 0.314, 0.000)
		colorUpland    (0.467, 0.428, 0.381, 0.000)
		colorRock      (0.505, 0.466, 0.411, 0.000)
		colorSnow      (0.550, 0.496, 0.433, 1.000)
		BumpHeight      0.0152939
		BumpOffset      0.00305879
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0860994
		Period          0.0959919
		Eccentricity    0.116571
		Inclination     -1.63714
		AscendingNode   -69.147
		ArgOfPericenter -154.108
		MeanAnomaly     -29.3419
	}
}

Asteroid	"S4"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.33539e-014
	Radius          0.172079
	InertiaMoment   0.396866

	RotationPeriod  1042.57
	Obliquity       4.86903
	EqAscendNode    -94.0255

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.473 0.469 0.467)

	Surface
	{
		SurfStyle       0.16833
		OceanStyle      0.223975
		Randomize      (-0.362, -0.304, 0.610)
		colorDistMagn   0.504401
		colorDistFreq   1.42495e-005
		detailScale     4.69891
		colorConversion true
		snowLevel       2
		tropicLatitude  0.115552
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.748873
		terraceProb     0.375664
		erosion         0
		montesMagn      0.470128
		montesFreq      2.36226
		montesSpiky     0.959982
		montesFraction  0.573673
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.13255e-005
		hillsFraction   0.648564
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220672
		craterFreq      0.190531
		craterDensity   0.980826
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   176.545
		volcanoTemp     1472.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.187, 0.187, 0.000)
		colorShelf     (0.201, 0.199, 0.198, 0.000)
		colorBeach     (0.213, 0.211, 0.210, 0.000)
		colorDesert    (0.225, 0.223, 0.222, 0.000)
		colorLowland   (0.236, 0.234, 0.233, 0.000)
		colorUpland    (0.248, 0.246, 0.245, 0.000)
		colorRock      (0.260, 0.258, 0.257, 0.000)
		colorSnow      (0.272, 0.270, 0.268, 1.000)
		BumpHeight      0.154871
		BumpOffset      0.0309743
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0757984
		Period          0.079291
		Eccentricity    0.135646
		Inclination     4.86903
		AscendingNode   -94.0255
		ArgOfPericenter 82.6574
		MeanAnomaly     -148.207
	}
}

Asteroid	"S5"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            3.43666e-011
	Radius          2.19849
	InertiaMoment   0.398567

	Obliquity       -2.26924
	EqAscendNode    178.065
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.786 0.692 0.619)

	Surface
	{
		SurfStyle       0.728095
		OceanStyle      0.042987
		Randomize      (0.422, 0.522, -0.879)
		colorDistMagn   0.99676
		colorDistFreq   0.00267303
		detailScale     60.0334
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00133721
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.477901
		terraceProb     0.482783
		erosion         0
		montesMagn      0.607991
		montesFreq      3.94008
		montesSpiky     0.96188
		montesFraction  0.523865
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0100369
		hillsFraction   0.571305
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219813
		craterFreq      0.2371
		craterDensity   1.06628
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   58.798
		volcanoTemp     1695.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.235, 0.173, 0.000)
		colorShelf     (0.314, 0.242, 0.198, 0.000)
		colorBeach     (0.369, 0.284, 0.235, 0.000)
		colorDesert    (0.401, 0.304, 0.229, 0.000)
		colorLowland   (0.440, 0.325, 0.260, 0.000)
		colorUpland    (0.487, 0.394, 0.316, 0.000)
		colorRock      (0.526, 0.429, 0.340, 0.000)
		colorSnow      (0.574, 0.457, 0.359, 1.000)
		BumpHeight      1.97864
		BumpOffset      0.395728
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0684588
		Period          0.0680578
		Eccentricity    0.0429765
		Inclination     -2.26924
		AscendingNode   178.065
		ArgOfPericenter 77.0287
		MeanAnomaly     -176.591
	}
}

Asteroid	"S6"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            5.05721e-008
	Radius          28.4523
	InertiaMoment   0.399572

	Obliquity       -2.61579
	EqAscendNode    -150.345
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.475 0.468 0.465)

	Surface
	{
		SurfStyle       0.776977
		OceanStyle      0.23298
		Randomize      (0.933, 0.905, -0.163)
		colorDistMagn   0.413469
		colorDistFreq   0.349204
		detailScale     776.936
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0233569
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.596419
		terraceProb     0.149339
		erosion         0
		montesMagn      0.434397
		montesFreq      3.00627
		montesSpiky     0.886322
		montesFraction  0.80617
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.31149
		hillsFraction   0.705736
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242799
		craterFreq      0.245518
		craterDensity   0.991844
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   19.8366
		volcanoTemp     1508.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.159, 0.130, 0.000)
		colorShelf     (0.190, 0.164, 0.149, 0.000)
		colorBeach     (0.223, 0.192, 0.177, 0.000)
		colorDesert    (0.242, 0.206, 0.172, 0.000)
		colorLowland   (0.266, 0.220, 0.195, 0.000)
		colorUpland    (0.294, 0.267, 0.237, 0.000)
		colorRock      (0.318, 0.290, 0.256, 0.000)
		colorSnow      (0.347, 0.309, 0.269, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0939792
		Period          0.109467
		Eccentricity    0.0456539
		Inclination     -2.61579
		AscendingNode   -150.345
		ArgOfPericenter -151.776
		MeanAnomaly     -167.909
	}
}

Asteroid	"S7"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.9627e-016
	Radius          0.0450794
	InertiaMoment   0.397363

	Obliquity       5.56064
	EqAscendNode    -45.0347
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.588 0.582 0.579)

	Surface
	{
		SurfStyle       0.108557
		OceanStyle      0.687874
		Randomize      (-0.442, 0.981, 0.480)
		colorDistMagn   0.689319
		colorDistFreq   1.37745e-006
		detailScale     1.23097
		colorConversion true
		snowLevel       2
		tropicLatitude  0.178305
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.579319
		terraceProb     0.293708
		erosion         0
		montesMagn      0.503909
		montesFreq      2.30949
		montesSpiky     0.98096
		montesFraction  0.744828
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.73928e-006
		hillsFraction   0.573613
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229662
		craterFreq      0.257253
		craterDensity   0.820947
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   410.62
		volcanoTemp     1656.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.235, 0.233, 0.232, 0.000)
		colorShelf     (0.250, 0.248, 0.246, 0.000)
		colorBeach     (0.265, 0.262, 0.261, 0.000)
		colorDesert    (0.279, 0.277, 0.275, 0.000)
		colorLowland   (0.294, 0.291, 0.290, 0.000)
		colorUpland    (0.309, 0.306, 0.304, 0.000)
		colorRock      (0.323, 0.320, 0.319, 0.000)
		colorSnow      (0.338, 0.335, 0.333, 1.000)
		BumpHeight      0.0405715
		BumpOffset      0.00811429
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.103144
		Period          0.125863
		Eccentricity    0.0523614
		Inclination     5.56064
		AscendingNode   -45.0347
		ArgOfPericenter 33.566
		MeanAnomaly     -38.6495
	}
}

Asteroid	"S8"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            4.35977e-013
	Radius          0.512747
	InertiaMoment   0.398787

	Obliquity       0.825822
	EqAscendNode    -120.035
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.576 0.573 0.568)

	Surface
	{
		SurfStyle       0.958303
		OceanStyle      0.12957
		Randomize      (-0.952, 0.965, 0.444)
		colorDistMagn   0.932887
		colorDistFreq   0.00016577
		detailScale     14.0014
		colorConversion true
		snowLevel       2
		tropicLatitude  0.014406
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.593203
		terraceProb     0.519155
		erosion         0
		montesMagn      0.542058
		montesFreq      2.44143
		montesSpiky     0.97722
		montesFraction  0.583917
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00086578
		hillsFraction   0.646292
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246858
		craterFreq      0.226337
		craterDensity   0.865179
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   121.752
		volcanoTemp     1396.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.201, 0.227, 0.050)
		colorShelf     (0.230, 0.235, 0.261, 0.040)
		colorBeach     (0.265, 0.269, 0.296, 0.030)
		colorDesert    (0.300, 0.304, 0.335, 0.020)
		colorLowland   (0.334, 0.338, 0.369, 0.030)
		colorUpland    (0.369, 0.372, 0.404, 0.050)
		colorRock      (0.403, 0.407, 0.449, 0.020)
		colorSnow      (0.403, 0.407, 0.449, 1.000)
		BumpHeight      0.461472
		BumpOffset      0.0922944
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0741513
		Period          0.0767206
		Eccentricity    0.116446
		Inclination     0.825822
		AscendingNode   -120.035
		ArgOfPericenter -116.286
		MeanAnomaly     77.4477
	}
}

Asteroid	"S9"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            6.41564e-010
	Radius          5.83202
	InertiaMoment   0.399751

	Obliquity       3.06351
	EqAscendNode    53.2646
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.667 0.621 0.544)

	Surface
	{
		SurfStyle       0.553971
		OceanStyle      0.362093
		Randomize      (-0.399, 0.406, -0.149)
		colorDistMagn   0.766021
		colorDistFreq   0.0173098
		detailScale     159.253
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0954363
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.526268
		terraceProb     0.1476
		erosion         0
		montesMagn      0.61675
		montesFreq      3.56292
		montesSpiky     0.957538
		montesFraction  0.594632
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0871681
		hillsFraction   0.469856
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245704
		craterFreq      0.18956
		craterDensity   0.896817
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   36.0998
		volcanoTemp     1458.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.211, 0.152, 0.000)
		colorShelf     (0.267, 0.217, 0.174, 0.000)
		colorBeach     (0.313, 0.255, 0.207, 0.000)
		colorDesert    (0.340, 0.273, 0.201, 0.000)
		colorLowland   (0.373, 0.292, 0.229, 0.000)
		colorUpland    (0.413, 0.354, 0.278, 0.000)
		colorRock      (0.447, 0.385, 0.299, 0.000)
		colorSnow      (0.487, 0.410, 0.316, 1.000)
		BumpHeight      5.24882
		BumpOffset      1.04976
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.102485
		Period          0.124658
		Eccentricity    0.05425
		Inclination     3.06351
		AscendingNode   53.2646
		ArgOfPericenter 12.7589
		MeanAnomaly     -138.051
	}
}

Asteroid	"S10"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            3.75852e-018
	Radius          0.00936012
	InertiaMoment   0.397736

	Obliquity       -2.80126
	EqAscendNode    165.322
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.596 0.495 0.423)

	Surface
	{
		SurfStyle       0.310958
		OceanStyle      0.414324
		Randomize      (-0.088, 0.533, 0.465)
		colorDistMagn   0.953068
		colorDistFreq   3.70579e-008
		detailScale     0.255594
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0124868
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.682028
		terraceProb     0.210034
		erosion         0
		montesMagn      0.395962
		montesFreq      3.55149
		montesSpiky     0.899382
		montesFraction  0.529562
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.30918e-007
		hillsFraction   0.771278
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246777
		craterFreq      0.257859
		craterDensity   0.917034
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   756.971
		volcanoTemp     1363.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.198, 0.169, 0.000)
		colorShelf     (0.253, 0.211, 0.180, 0.000)
		colorBeach     (0.268, 0.223, 0.190, 0.000)
		colorDesert    (0.283, 0.235, 0.201, 0.000)
		colorLowland   (0.298, 0.248, 0.211, 0.000)
		colorUpland    (0.313, 0.260, 0.222, 0.000)
		colorRock      (0.328, 0.272, 0.232, 0.000)
		colorSnow      (0.343, 0.285, 0.243, 1.000)
		BumpHeight      0.00842411
		BumpOffset      0.00168482
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0818353
		Period          0.0889498
		Eccentricity    0.199408
		Inclination     -2.80126
		AscendingNode   165.322
		ArgOfPericenter 73.7621
		MeanAnomaly     -52.843
	}
}

Asteroid	"S11"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            5.53086e-015
	Radius          0.119586
	InertiaMoment   0.398992

	RotationPeriod  1429.69
	Obliquity       5.45619
	EqAscendNode    30.4853

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.487 0.485 0.480)

	Surface
	{
		SurfStyle       0.429153
		OceanStyle      0.797665
		Randomize      (-0.119, -0.292, -0.048)
		colorDistMagn   0.926906
		colorDistFreq   6.74857e-006
		detailScale     3.26549
		colorConversion true
		snowLevel       2
		tropicLatitude  0.182706
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.641166
		terraceProb     0.293375
		erosion         0
		montesMagn      0.471675
		montesFreq      3.18746
		montesSpiky     0.937462
		montesFraction  0.636369
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.17969e-005
		hillsFraction   0.600785
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241816
		craterFreq      0.220241
		craterDensity   0.878968
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   252.109
		volcanoTemp     1434.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.194, 0.192, 0.000)
		colorShelf     (0.207, 0.206, 0.204, 0.000)
		colorBeach     (0.219, 0.218, 0.216, 0.000)
		colorDesert    (0.231, 0.230, 0.228, 0.000)
		colorLowland   (0.244, 0.242, 0.240, 0.000)
		colorUpland    (0.256, 0.254, 0.252, 0.000)
		colorRock      (0.268, 0.267, 0.264, 0.000)
		colorSnow      (0.280, 0.279, 0.276, 1.000)
		BumpHeight      0.107627
		BumpOffset      0.0215254
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0772308
		Period          0.0815493
		Eccentricity    0.127741
		Inclination     5.45619
		AscendingNode   30.4853
		ArgOfPericenter 68.8933
		MeanAnomaly     110.239
	}
}

Asteroid	"S12"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            8.13895e-012
	Radius          1.54782
	InertiaMoment   0.399928

	RotationPeriod  3022.4
	Obliquity       -1.62688
	EqAscendNode    17.0122

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.574 0.571 0.569)

	Surface
	{
		SurfStyle       0.798278
		OceanStyle      0.207001
		Randomize      (0.523, -0.868, -0.205)
		colorDistMagn   0.728334
		colorDistFreq   0.00130835
		detailScale     42.2657
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0561344
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.487137
		terraceProb     0.308282
		erosion         0
		montesMagn      0.533448
		montesFreq      3.60528
		montesSpiky     0.962218
		montesFraction  0.532871
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00365244
		hillsFraction   0.838114
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.281376
		craterFreq      0.211372
		craterDensity   0.868508
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   85.063
		volcanoTemp     1397.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.194, 0.159, 0.000)
		colorShelf     (0.229, 0.200, 0.182, 0.000)
		colorBeach     (0.270, 0.234, 0.216, 0.000)
		colorDesert    (0.293, 0.251, 0.210, 0.000)
		colorLowland   (0.321, 0.268, 0.239, 0.000)
		colorUpland    (0.356, 0.325, 0.290, 0.000)
		colorRock      (0.384, 0.354, 0.313, 0.000)
		colorSnow      (0.419, 0.377, 0.330, 1.000)
		BumpHeight      1.39303
		BumpOffset      0.278607
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.109629
		Period          0.137918
		Eccentricity    0.132292
		Inclination     -1.62688
		AscendingNode   17.0122
		ArgOfPericenter -17.1176
		MeanAnomaly     145.876
	}
}

Asteroid	"S13"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.19769e-008
	Radius          17.6042
	InertiaMoment   0.398043

	Obliquity       0.930391
	EqAscendNode    89.6162
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.563 0.558 0.553)

	Surface
	{
		SurfStyle       0.734982
		OceanStyle      0.846882
		Randomize      (-0.836, -0.662, -0.398)
		colorDistMagn   0.809995
		colorDistFreq   0.18288
		detailScale     480.712
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0230384
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.407606
		terraceProb     0.286327
		erosion         0
		montesMagn      0.602075
		montesFreq      4.44027
		montesSpiky     0.929063
		montesFraction  0.225288
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.65116
		hillsFraction   0.472791
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232837
		craterFreq      0.222902
		craterDensity   0.953633
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.2203
		volcanoTemp     1785.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.190, 0.155, 0.000)
		colorShelf     (0.225, 0.195, 0.177, 0.000)
		colorBeach     (0.265, 0.229, 0.210, 0.000)
		colorDesert    (0.287, 0.245, 0.205, 0.000)
		colorLowland   (0.316, 0.262, 0.232, 0.000)
		colorUpland    (0.349, 0.318, 0.282, 0.000)
		colorRock      (0.377, 0.346, 0.304, 0.000)
		colorSnow      (0.411, 0.368, 0.321, 1.000)
		BumpHeight      15.8438
		BumpOffset      3.16876
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.109546
		Period          0.137762
		Eccentricity    0.0413516
		Inclination     0.930391
		AscendingNode   89.6162
		ArgOfPericenter 108.738
		MeanAnomaly     9.13797
	}
}

Asteroid	"S14"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            7.01651e-017
	Radius          0.034328
	InertiaMoment   0.399188

	Obliquity       2.99302
	EqAscendNode    151.444
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.629 0.625)

	Surface
	{
		SurfStyle       0.493129
		OceanStyle      0.131765
		Randomize      (-0.207, 0.631, -0.286)
		colorDistMagn   0.893894
		colorDistFreq   6.64191e-007
		detailScale     0.937383
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0257521
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503988
		terraceProb     0.164496
		erosion         0
		montesMagn      0.440786
		montesFreq      3.73199
		montesSpiky     0.943181
		montesFraction  0.763068
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.9369e-006
		hillsFraction   0.435288
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.283658
		craterFreq      0.225719
		craterDensity   0.81853
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   642.53
		volcanoTemp     1732.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.251, 0.250, 0.000)
		colorShelf     (0.270, 0.267, 0.266, 0.000)
		colorBeach     (0.285, 0.283, 0.281, 0.000)
		colorDesert    (0.301, 0.299, 0.297, 0.000)
		colorLowland   (0.317, 0.314, 0.312, 0.000)
		colorUpland    (0.333, 0.330, 0.328, 0.000)
		colorRock      (0.349, 0.346, 0.344, 0.000)
		colorSnow      (0.365, 0.361, 0.359, 1.000)
		BumpHeight      0.0308952
		BumpOffset      0.00617904
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.15024
		Period          0.221265
		Eccentricity    0.0252501
		Inclination     2.99302
		AscendingNode   151.444
		ArgOfPericenter 167.979
		MeanAnomaly     3.40513
	}
}

Asteroid	"S15"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.03251e-013
	Radius          0.317234
	InertiaMoment   0.39592

	Obliquity       -0.234162
	EqAscendNode    -65.7178
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.709 0.673 0.641)

	Surface
	{
		SurfStyle       0.445834
		OceanStyle      0.0906352
		Randomize      (-0.433, -0.095, 0.129)
		colorDistMagn   0.99425
		colorDistFreq   8.35621e-005
		detailScale     8.66261
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00686201
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.278904
		terraceProb     0.165088
		erosion         0
		montesMagn      0.342547
		montesFreq      3.17299
		montesSpiky     0.808726
		montesFraction  0.650684
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00023034
		hillsFraction   0.630136
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235848
		craterFreq      0.268641
		craterDensity   1.03943
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   154.788
		volcanoTemp     1771.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.269, 0.256, 0.000)
		colorShelf     (0.301, 0.286, 0.272, 0.000)
		colorBeach     (0.319, 0.303, 0.288, 0.000)
		colorDesert    (0.337, 0.320, 0.304, 0.000)
		colorLowland   (0.355, 0.337, 0.320, 0.000)
		colorUpland    (0.372, 0.354, 0.336, 0.000)
		colorRock      (0.390, 0.370, 0.352, 0.000)
		colorSnow      (0.408, 0.387, 0.368, 1.000)
		BumpHeight      0.285511
		BumpOffset      0.0571022
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0845224
		Period          0.0933667
		Eccentricity    0.0544804
		Inclination     -0.234162
		AscendingNode   -65.7178
		ArgOfPericenter 86.8653
		MeanAnomaly     3.1263
	}
}

Asteroid	"S16"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.5194e-010
	Radius          3.21239
	InertiaMoment   0.39831

	Obliquity       -4.33501
	EqAscendNode    177.943
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.778 0.776 0.772)

	Surface
	{
		SurfStyle       0.277864
		OceanStyle      0.017063
		Randomize      (-0.693, 0.027, -0.590)
		colorDistMagn   0.79818
		colorDistFreq   0.00351812
		detailScale     87.7197
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00271863
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.723438
		terraceProb     0.347146
		erosion         0
		montesMagn      0.53
		montesFreq      3.11944
		montesSpiky     0.793006
		montesFraction  0.450153
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0340008
		hillsFraction   0.554582
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261749
		craterFreq      0.229947
		craterDensity   0.902225
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   40.86
		volcanoTemp     1645.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.310, 0.309, 0.000)
		colorShelf     (0.331, 0.330, 0.328, 0.000)
		colorBeach     (0.350, 0.349, 0.347, 0.000)
		colorDesert    (0.370, 0.368, 0.367, 0.000)
		colorLowland   (0.389, 0.388, 0.386, 0.000)
		colorUpland    (0.409, 0.407, 0.405, 0.000)
		colorRock      (0.428, 0.427, 0.424, 0.000)
		colorSnow      (0.448, 0.446, 0.444, 1.000)
		BumpHeight      2.89115
		BumpOffset      0.57823
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0677232
		Period          0.0669638
		Eccentricity    0.032582
		Inclination     -4.33501
		AscendingNode   177.943
		ArgOfPericenter 81.9845
		MeanAnomaly     39.5853
	}
}

Asteroid	"S17"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.23588e-007
	Radius          41.0335
	InertiaMoment   0.399376

	Obliquity       3.82715
	EqAscendNode    -134.563
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.623 0.619 0.618)

	Surface
	{
		SurfStyle       0.73052
		OceanStyle      0.861928
		Randomize      (-0.201, -0.389, 0.819)
		colorDistMagn   0.25628
		colorDistFreq   0.452385
		detailScale     1120.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0515388
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.518427
		terraceProb     0.145236
		erosion         0
		montesMagn      0.456819
		montesFreq      3.87265
		montesSpiky     0.921995
		montesFraction  0.580717
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.24759
		hillsFraction   0.532633
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240581
		craterFreq      0.200333
		craterDensity   0.750797
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   13.6057
		volcanoTemp     1457.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.211, 0.173, 0.000)
		colorShelf     (0.249, 0.217, 0.198, 0.000)
		colorBeach     (0.293, 0.254, 0.235, 0.000)
		colorDesert    (0.317, 0.273, 0.229, 0.000)
		colorLowland   (0.349, 0.291, 0.260, 0.000)
		colorUpland    (0.386, 0.353, 0.315, 0.000)
		colorRock      (0.417, 0.384, 0.340, 0.000)
		colorSnow      (0.454, 0.409, 0.359, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.091115
		Period          0.104501
		Eccentricity    0.0402593
		Inclination     3.82715
		AscendingNode   -134.563
		ArgOfPericenter -85.0365
		MeanAnomaly     -53.786
	}
}

Asteroid	"S18"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.30986e-015
	Radius          0.0841923
	InertiaMoment   0.396818

	RotationPeriod  1923.98
	Obliquity       2.49648
	EqAscendNode    -144.805

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.725 0.649 0.556)

	Surface
	{
		SurfStyle       0.245078
		OceanStyle      0.542109
		Randomize      (0.855, 0.431, 0.810)
		colorDistMagn   0.431168
		colorDistFreq   2.88215e-006
		detailScale     2.29901
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0263355
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.713064
		terraceProb     0.373381
		erosion         0
		montesMagn      0.421229
		montesFreq      2.35596
		montesSpiky     0.94215
		montesFraction  0.566315
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.91838e-005
		hillsFraction   0.472521
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247038
		craterFreq      0.253915
		craterDensity   1.04117
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   364.726
		volcanoTemp     1511.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.259, 0.222, 0.000)
		colorShelf     (0.308, 0.276, 0.236, 0.000)
		colorBeach     (0.326, 0.292, 0.250, 0.000)
		colorDesert    (0.344, 0.308, 0.264, 0.000)
		colorLowland   (0.363, 0.324, 0.278, 0.000)
		colorUpland    (0.381, 0.340, 0.292, 0.000)
		colorRock      (0.399, 0.357, 0.306, 0.000)
		colorSnow      (0.417, 0.373, 0.319, 1.000)
		BumpHeight      0.0757731
		BumpOffset      0.0151546
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0718405
		Period          0.0731624
		Eccentricity    0.0880258
		Inclination     2.49648
		AscendingNode   -144.805
		ArgOfPericenter -150.563
		MeanAnomaly     -95.0647
	}
}

Asteroid	"S19"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.92753e-012
	Radius          0.841552
	InertiaMoment   0.39855

	Obliquity       5.24272
	EqAscendNode    99.0666
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.709 0.706 0.701)

	Surface
	{
		SurfStyle       0.411329
		OceanStyle      0.982042
		Randomize      (0.795, -0.056, 0.616)
		colorDistMagn   0.188505
		colorDistFreq   0.000354177
		detailScale     22.98
		colorConversion true
		snowLevel       2
		tropicLatitude  0.118397
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.551822
		terraceProb     0.144622
		erosion         0
		montesMagn      0.47693
		montesFreq      2.73312
		montesSpiky     0.991318
		montesFraction  0.522561
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00171639
		hillsFraction   0.702898
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221766
		craterFreq      0.234774
		craterDensity   0.944535
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   95.0357
		volcanoTemp     1437.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.282, 0.280, 0.000)
		colorShelf     (0.301, 0.300, 0.298, 0.000)
		colorBeach     (0.319, 0.318, 0.315, 0.000)
		colorDesert    (0.337, 0.335, 0.333, 0.000)
		colorLowland   (0.354, 0.353, 0.350, 0.000)
		colorUpland    (0.372, 0.371, 0.368, 0.000)
		colorRock      (0.390, 0.388, 0.385, 0.000)
		colorSnow      (0.408, 0.406, 0.403, 1.000)
		BumpHeight      0.757397
		BumpOffset      0.151479
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0974417
		Period          0.115572
		Eccentricity    0.147683
		Inclination     5.24272
		AscendingNode   99.0666
		ArgOfPericenter -145.869
		MeanAnomaly     76.9794
	}
}

Asteroid	"S20"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.83646e-009
	Radius          9.57173
	InertiaMoment   0.399558

	Obliquity       4.44052
	EqAscendNode    27.4414
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.641 0.562 0.488)

	Surface
	{
		SurfStyle       0.616221
		OceanStyle      0.388699
		Randomize      (0.586, 0.434, -0.874)
		colorDistMagn   0.305842
		colorDistFreq   0.0466196
		detailScale     261.372
		colorConversion true
		snowLevel       2
		tropicLatitude  0.150003
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391776
		terraceProb     0.335088
		erosion         0
		montesMagn      0.396554
		montesFreq      4.07207
		montesSpiky     0.873537
		montesFraction  0.55765
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.207564
		hillsFraction   0.763353
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250348
		craterFreq      0.216239
		craterDensity   0.936499
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.1779
		volcanoTemp     1597.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.191, 0.137, 0.000)
		colorShelf     (0.256, 0.197, 0.156, 0.000)
		colorBeach     (0.301, 0.231, 0.185, 0.000)
		colorDesert    (0.327, 0.247, 0.181, 0.000)
		colorLowland   (0.359, 0.264, 0.205, 0.000)
		colorUpland    (0.397, 0.320, 0.249, 0.000)
		colorRock      (0.429, 0.349, 0.268, 0.000)
		colorSnow      (0.468, 0.371, 0.283, 1.000)
		BumpHeight      8.61456
		BumpOffset      1.72291
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0816759
		Period          0.08869
		Eccentricity    0.197846
		Inclination     4.44052
		AscendingNode   27.4414
		ArgOfPericenter 52.3505
		MeanAnomaly     -157.119
	}
}

Asteroid	"S21"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.6617e-017
	Radius          0.0196358
	InertiaMoment   0.39733

	RotationPeriod  964.349
	Obliquity       -1.28356
	EqAscendNode    137.559

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.717 0.715 0.713)

	Surface
	{
		SurfStyle       0.0988143
		OceanStyle      0.0859575
		Randomize      (0.146, -0.016, -0.001)
		colorDistMagn   0.53383
		colorDistFreq   2.33226e-007
		detailScale     0.536188
		colorConversion true
		snowLevel       2
		tropicLatitude  0.016216
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.521885
		terraceProb     0.219122
		erosion         0
		montesMagn      0.362316
		montesFreq      4.46821
		montesSpiky     0.881908
		montesFraction  0.735376
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.99581e-007
		hillsFraction   0.398642
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250919
		craterFreq      0.195202
		craterDensity   0.813279
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   755.228
		volcanoTemp     1745.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.286, 0.285, 0.000)
		colorShelf     (0.305, 0.304, 0.303, 0.000)
		colorBeach     (0.323, 0.322, 0.321, 0.000)
		colorDesert    (0.341, 0.340, 0.339, 0.000)
		colorLowland   (0.359, 0.357, 0.357, 0.000)
		colorUpland    (0.377, 0.375, 0.374, 0.000)
		colorRock      (0.394, 0.393, 0.392, 0.000)
		colorSnow      (0.412, 0.411, 0.410, 1.000)
		BumpHeight      0.0176722
		BumpOffset      0.00353444
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0719579
		Period          0.0733418
		Eccentricity    0.089514
		Inclination     -1.28356
		AscendingNode   137.559
		ArgOfPericenter -7.5206
		MeanAnomaly     167.601
	}
}

Asteroid	"S22"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.44528e-014
	Radius          0.223344
	InertiaMoment   0.39877

	RotationPeriod  1717.86
	Obliquity       -2.49119
	EqAscendNode    -107.014

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.468 0.466 0.463)

	Surface
	{
		SurfStyle       0.105402
		OceanStyle      0.391629
		Randomize      (-0.673, -0.673, 0.002)
		colorDistMagn   0.777944
		colorDistFreq   2.98295e-005
		detailScale     6.09877
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0516829
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.628403
		terraceProb     0.126383
		erosion         0
		montesMagn      0.224431
		montesFreq      3.19736
		montesSpiky     0.917472
		montesFraction  0.575048
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.10668e-005
		hillsFraction   0.617673
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.280465
		craterFreq      0.217538
		craterDensity   0.860549
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   223.932
		volcanoTemp     1535.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.186, 0.185, 0.000)
		colorShelf     (0.199, 0.198, 0.197, 0.000)
		colorBeach     (0.211, 0.209, 0.208, 0.000)
		colorDesert    (0.222, 0.221, 0.220, 0.000)
		colorLowland   (0.234, 0.233, 0.231, 0.000)
		colorUpland    (0.246, 0.244, 0.243, 0.000)
		colorRock      (0.257, 0.256, 0.255, 0.000)
		colorSnow      (0.269, 0.268, 0.266, 1.000)
		BumpHeight      0.201009
		BumpOffset      0.0402019
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0872881
		Period          0.0979866
		Eccentricity    0.162891
		Inclination     -2.49119
		AscendingNode   -107.014
		ArgOfPericenter 49.4588
		MeanAnomaly     90.5374
	}
}

Asteroid	"S23"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            3.59836e-011
	Radius          2.54037
	InertiaMoment   0.399737

	Obliquity       -2.58119
	EqAscendNode    162.733
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.650 0.588 0.479)

	Surface
	{
		SurfStyle       0.280751
		OceanStyle      0.844271
		Randomize      (-0.413, 0.460, 0.242)
		colorDistMagn   0.778188
		colorDistFreq   0.00281107
		detailScale     69.3689
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0135181
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.376819
		terraceProb     0.26179
		erosion         0
		montesMagn      0.43701
		montesFreq      3.54778
		montesSpiky     0.996084
		montesFraction  0.479181
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0145877
		hillsFraction   0.529554
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.193021
		craterFreq      0.184444
		craterDensity   0.861495
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   66.3973
		volcanoTemp     1153.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.235, 0.191, 0.000)
		colorShelf     (0.276, 0.250, 0.203, 0.000)
		colorBeach     (0.293, 0.265, 0.215, 0.000)
		colorDesert    (0.309, 0.280, 0.227, 0.000)
		colorLowland   (0.325, 0.294, 0.239, 0.000)
		colorUpland    (0.341, 0.309, 0.251, 0.000)
		colorRock      (0.358, 0.324, 0.263, 0.000)
		colorSnow      (0.374, 0.338, 0.275, 1.000)
		BumpHeight      2.28633
		BumpOffset      0.457266
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.119275
		Period          0.156517
		Eccentricity    0.0667673
		Inclination     -2.58119
		AscendingNode   162.733
		ArgOfPericenter -45.3811
		MeanAnomaly     -27.4215
	}
}

Asteroid	"S24"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            5.29517e-008
	Radius          28.8916
	InertiaMoment   0.39771

	Obliquity       -2.51064
	EqAscendNode    44.9431
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.567 0.560 0.557)

	Surface
	{
		SurfStyle       0.867688
		OceanStyle      0.435904
		Randomize      (0.710, -0.020, -0.365)
		colorDistMagn   0.117144
		colorDistFreq   0.710236
		detailScale     788.934
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0808912
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.599716
		terraceProb     0.496433
		erosion         0
		montesMagn      0.452182
		montesFreq      3.41524
		montesSpiky     0.923032
		montesFraction  0.562102
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.0743
		hillsFraction   0.634249
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21265
		craterFreq      0.147555
		craterDensity   1.01372
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   19.6851
		volcanoTemp     1363.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.196, 0.223, 0.050)
		colorShelf     (0.227, 0.230, 0.256, 0.040)
		colorBeach     (0.261, 0.263, 0.290, 0.030)
		colorDesert    (0.295, 0.297, 0.329, 0.020)
		colorLowland   (0.329, 0.331, 0.362, 0.030)
		colorUpland    (0.363, 0.364, 0.396, 0.050)
		colorRock      (0.397, 0.398, 0.440, 0.020)
		colorSnow      (0.397, 0.398, 0.440, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0925989
		Period          0.107064
		Eccentricity    0.132487
		Inclination     -2.51064
		AscendingNode   44.9431
		ArgOfPericenter -133.669
		MeanAnomaly     -25.4245
	}
}

Asteroid	"S25"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            3.1021e-016
	Radius          0.0457756
	InertiaMoment   0.398977

	RotationPeriod  1943.53
	Obliquity       4.49436
	EqAscendNode    -41.4158

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.555 0.548 0.545)

	Surface
	{
		SurfStyle       0.0548511
		OceanStyle      0.23359
		Randomize      (-0.804, 0.004, -0.742)
		colorDistMagn   0.746927
		colorDistFreq   9.13437e-007
		detailScale     1.24998
		colorConversion true
		snowLevel       2
		tropicLatitude  0.146203
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.347333
		terraceProb     0.219045
		erosion         0
		montesMagn      0.610586
		montesFreq      3.10732
		montesSpiky     0.899837
		montesFraction  0.255886
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.84601e-006
		hillsFraction   0.691571
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256075
		craterFreq      0.27122
		craterDensity   0.771668
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   407.485
		volcanoTemp     1092.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.219, 0.218, 0.000)
		colorShelf     (0.236, 0.233, 0.232, 0.000)
		colorBeach     (0.250, 0.247, 0.245, 0.000)
		colorDesert    (0.263, 0.260, 0.259, 0.000)
		colorLowland   (0.277, 0.274, 0.273, 0.000)
		colorUpland    (0.291, 0.288, 0.286, 0.000)
		colorRock      (0.305, 0.301, 0.300, 0.000)
		colorSnow      (0.319, 0.315, 0.314, 1.000)
		BumpHeight      0.041198
		BumpOffset      0.0082396
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0947742
		Period          0.110859
		Eccentricity    0.123281
		Inclination     4.49436
		AscendingNode   -41.4158
		ArgOfPericenter -22.7019
		MeanAnomaly     -121.189
	}
}

Asteroid	"S26"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            4.56491e-013
	Radius          0.640841
	InertiaMoment   0.399914

	RotationPeriod  4039.42
	Obliquity       0.0979103
	EqAscendNode    129.983

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.683 0.601 0.561)

	Surface
	{
		SurfStyle       0.0471507
		OceanStyle      0.736583
		Randomize      (-0.120, 0.731, -0.615)
		colorDistMagn   0.28489
		colorDistFreq   0.000217457
		detailScale     17.4992
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00146484
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.486333
		terraceProb     0.285255
		erosion         0
		montesMagn      0.490388
		montesFreq      2.08836
		montesSpiky     0.99768
		montesFraction  0.549575
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00112806
		hillsFraction   0.785165
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259507
		craterFreq      0.255278
		craterDensity   0.901212
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   148.71
		volcanoTemp     1268.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.240, 0.225, 0.000)
		colorShelf     (0.290, 0.255, 0.239, 0.000)
		colorBeach     (0.307, 0.270, 0.253, 0.000)
		colorDesert    (0.325, 0.285, 0.267, 0.000)
		colorLowland   (0.342, 0.300, 0.281, 0.000)
		colorUpland    (0.359, 0.315, 0.295, 0.000)
		colorRock      (0.376, 0.330, 0.309, 0.000)
		colorSnow      (0.393, 0.345, 0.323, 1.000)
		BumpHeight      0.576757
		BumpOffset      0.115351
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.117792
		Period          0.153605
		Eccentricity    0.145507
		Inclination     0.0979103
		AscendingNode   129.983
		ArgOfPericenter 40.4539
		MeanAnomaly     -20.7651
	}
}

Asteroid	"S27"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            6.7175e-010
	Radius          5.92209
	InertiaMoment   0.398021

	RotationPeriod  2707.87
	Obliquity       0.655361
	EqAscendNode    158.995

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.652 0.646 0.643)

	Surface
	{
		SurfStyle       0.488752
		OceanStyle      0.328672
		Randomize      (-0.923, -0.496, -0.990)
		colorDistMagn   0.0817786
		colorDistFreq   0.0170419
		detailScale     161.713
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00417187
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.676251
		terraceProb     0.518178
		erosion         0
		montesMagn      0.435392
		montesFreq      2.53205
		montesSpiky     0.989786
		montesFraction  0.762905
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0932776
		hillsFraction   0.61336
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245907
		craterFreq      0.233086
		craterDensity   0.863858
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.8243
		volcanoTemp     1390
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.258, 0.257, 0.000)
		colorShelf     (0.277, 0.275, 0.273, 0.000)
		colorBeach     (0.293, 0.291, 0.289, 0.000)
		colorDesert    (0.310, 0.307, 0.305, 0.000)
		colorLowland   (0.326, 0.323, 0.321, 0.000)
		colorUpland    (0.342, 0.339, 0.338, 0.000)
		colorRock      (0.358, 0.355, 0.354, 0.000)
		colorSnow      (0.375, 0.371, 0.370, 1.000)
		BumpHeight      5.32988
		BumpOffset      1.06598
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.074478
		Period          0.0772283
		Eccentricity    0.120323
		Inclination     0.655361
		AscendingNode   158.995
		ArgOfPericenter -130.894
		MeanAnomaly     -125.615
	}
}

Asteroid	"S28"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            3.93536e-018
	Radius          0.0121486
	InertiaMoment   0.399173

	RotationPeriod  4142.57
	Obliquity       -1.74595
	EqAscendNode    -92.396

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.579 0.577 0.575)

	Surface
	{
		SurfStyle       0.54245
		OceanStyle      0.470143
		Randomize      (-0.692, -0.471, -0.218)
		colorDistMagn   0.666854
		colorDistFreq   6.88722e-008
		detailScale     0.331737
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0421683
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.426251
		terraceProb     0.47235
		erosion         0
		montesMagn      0.519878
		montesFreq      2.81764
		montesSpiky     0.938242
		montesFraction  0.375781
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.65383e-007
		hillsFraction   0.750601
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.197637
		craterFreq      0.267714
		craterDensity   0.828804
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   960.151
		volcanoTemp     1720.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.196, 0.161, 0.000)
		colorShelf     (0.232, 0.202, 0.184, 0.000)
		colorBeach     (0.272, 0.237, 0.219, 0.000)
		colorDesert    (0.296, 0.254, 0.213, 0.000)
		colorLowland   (0.324, 0.271, 0.242, 0.000)
		colorUpland    (0.359, 0.329, 0.293, 0.000)
		colorRock      (0.388, 0.358, 0.316, 0.000)
		colorSnow      (0.423, 0.381, 0.334, 1.000)
		BumpHeight      0.0109337
		BumpOffset      0.00218674
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.085215
		Period          0.0945166
		Eccentricity    0.117675
		Inclination     -1.74595
		AscendingNode   -92.396
		ArgOfPericenter -133.338
		MeanAnomaly     -62.5427
	}
}

Asteroid	"S29"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            5.79109e-015
	Radius          0.108109
	InertiaMoment   0.395804

	RotationPeriod  4407.17
	Obliquity       5.8594
	EqAscendNode    -147.386

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.711 0.707 0.704)

	Surface
	{
		SurfStyle       0.580054
		OceanStyle      0.449928
		Randomize      (-0.756, 0.657, -0.700)
		colorDistMagn   0.0262426
		colorDistFreq   5.88781e-006
		detailScale     2.9521
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0573053
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.386862
		terraceProb     0.315602
		erosion         0
		montesMagn      0.404499
		montesFreq      3.08433
		montesSpiky     0.886536
		montesFraction  0.845747
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.08251e-005
		hillsFraction   0.8632
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255814
		craterFreq      0.232188
		craterDensity   0.881532
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   222.735
		volcanoTemp     1439.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.240, 0.197, 0.000)
		colorShelf     (0.284, 0.247, 0.225, 0.000)
		colorBeach     (0.334, 0.290, 0.268, 0.000)
		colorDesert    (0.363, 0.311, 0.261, 0.000)
		colorLowland   (0.398, 0.332, 0.296, 0.000)
		colorUpland    (0.441, 0.403, 0.359, 0.000)
		colorRock      (0.476, 0.438, 0.387, 0.000)
		colorSnow      (0.519, 0.466, 0.408, 1.000)
		BumpHeight      0.0972983
		BumpOffset      0.0194597
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0786421
		Period          0.0837948
		Eccentricity    0.166901
		Inclination     5.8594
		AscendingNode   -147.386
		ArgOfPericenter 4.20733
		MeanAnomaly     151.249
	}
}

Asteroid	"S30"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            8.5219e-012
	Radius          1.57172
	InertiaMoment   0.39829

	Obliquity       7.15341
	EqAscendNode    172.617
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.605 0.600 0.599)

	Surface
	{
		SurfStyle       0.499371
		OceanStyle      0.817056
		Randomize      (-0.731, -0.116, 0.140)
		colorDistMagn   0.817834
		colorDistFreq   0.001404
		detailScale     42.9184
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0160349
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.420167
		terraceProb     0.142615
		erosion         0
		montesMagn      0.626846
		montesFreq      2.58041
		montesSpiky     0.95511
		montesFraction  0.217303
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0047719
		hillsFraction   0.591492
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231975
		craterFreq      0.206173
		craterDensity   0.969515
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   84.4136
		volcanoTemp     1539.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.240, 0.239, 0.000)
		colorShelf     (0.257, 0.255, 0.254, 0.000)
		colorBeach     (0.272, 0.270, 0.269, 0.000)
		colorDesert    (0.287, 0.285, 0.284, 0.000)
		colorLowland   (0.302, 0.300, 0.299, 0.000)
		colorUpland    (0.317, 0.315, 0.314, 0.000)
		colorRock      (0.333, 0.330, 0.329, 0.000)
		colorSnow      (0.348, 0.345, 0.344, 1.000)
		BumpHeight      1.41455
		BumpOffset      0.282909
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.115494
		Period          0.149133
		Eccentricity    0.194425
		Inclination     7.15341
		AscendingNode   172.617
		ArgOfPericenter 6.78729
		MeanAnomaly     116.025
	}
}

Asteroid	"S31"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.25404e-008
	Radius          15.7093
	InertiaMoment   0.399361

	Obliquity       4.43963
	EqAscendNode    -133.825
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.642 0.639 0.638)

	Surface
	{
		SurfStyle       0.78626
		OceanStyle      0.961814
		Randomize      (-0.708, -0.570, -0.482)
		colorDistMagn   0.862966
		colorDistFreq   0.0865915
		detailScale     428.968
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0606821
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.461307
		terraceProb     0.176364
		erosion         0
		montesMagn      0.545716
		montesFreq      3.53609
		montesSpiky     0.860767
		montesFraction  0.674286
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.529062
		hillsFraction   0.855419
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218423
		craterFreq      0.211555
		craterDensity   0.67253
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.9941
		volcanoTemp     1423.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.217, 0.179, 0.000)
		colorShelf     (0.257, 0.224, 0.204, 0.000)
		colorBeach     (0.302, 0.262, 0.242, 0.000)
		colorDesert    (0.328, 0.281, 0.236, 0.000)
		colorLowland   (0.360, 0.301, 0.268, 0.000)
		colorUpland    (0.398, 0.365, 0.325, 0.000)
		colorRock      (0.430, 0.396, 0.351, 0.000)
		colorSnow      (0.469, 0.422, 0.370, 1.000)
		BumpHeight      14.1384
		BumpOffset      2.82767
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0915415
		Period          0.105235
		Eccentricity    0.143127
		Inclination     4.43963
		AscendingNode   -133.825
		ArgOfPericenter 53.1035
		MeanAnomaly     39.5137
	}
}

Asteroid	"S32"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            7.34665e-017
	Radius          0.0322276
	InertiaMoment   0.396769

	RotationPeriod  3360.04
	Obliquity       -5.24347
	EqAscendNode    179.711

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.510 0.505 0.501)

	Surface
	{
		SurfStyle       0.282864
		OceanStyle      0.136394
		Randomize      (0.439, 0.107, -0.217)
		colorDistMagn   0.621451
		colorDistFreq   5.243e-007
		detailScale     0.880028
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.733058
		terraceProb     0.329565
		erosion         0
		montesMagn      0.576151
		montesFreq      2.59561
		montesSpiky     0.843714
		montesFraction  0.192865
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.12295e-006
		hillsFraction   0.763817
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267111
		craterFreq      0.266623
		craterDensity   0.720589
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   589.507
		volcanoTemp     1375.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.202, 0.201, 0.000)
		colorShelf     (0.217, 0.215, 0.213, 0.000)
		colorBeach     (0.229, 0.227, 0.226, 0.000)
		colorDesert    (0.242, 0.240, 0.238, 0.000)
		colorLowland   (0.255, 0.253, 0.251, 0.000)
		colorUpland    (0.268, 0.265, 0.263, 0.000)
		colorRock      (0.280, 0.278, 0.276, 0.000)
		colorSnow      (0.293, 0.290, 0.288, 1.000)
		BumpHeight      0.0290048
		BumpOffset      0.00580097
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.104183
		Period          0.127771
		Eccentricity    0.133105
		Inclination     -5.24347
		AscendingNode   179.711
		ArgOfPericenter 85.549
		MeanAnomaly     -56.1029
	}
}

Asteroid	"S33"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.0811e-013
	Radius          0.322134
	InertiaMoment   0.398532

	RotationPeriod  2662.74
	Obliquity       3.02109
	EqAscendNode    -48.6703

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.474 0.467 0.463)

	Surface
	{
		SurfStyle       0.911847
		OceanStyle      0.14363
		Randomize      (0.449, 0.774, 0.052)
		colorDistMagn   0.560708
		colorDistFreq   8.43958e-005
		detailScale     8.79641
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0959312
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.656799
		terraceProb     0.261738
		erosion         0
		montesMagn      0.488281
		montesFreq      3.59191
		montesSpiky     0.890507
		montesFraction  0.865279
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000284729
		hillsFraction   0.625245
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223977
		craterFreq      0.150693
		craterDensity   0.662104
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   153.607
		volcanoTemp     1396.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.161, 0.163, 0.185, 0.050)
		colorShelf     (0.189, 0.192, 0.213, 0.040)
		colorBeach     (0.218, 0.220, 0.241, 0.030)
		colorDesert    (0.246, 0.248, 0.273, 0.020)
		colorLowland   (0.275, 0.276, 0.301, 0.030)
		colorUpland    (0.303, 0.304, 0.329, 0.050)
		colorRock      (0.332, 0.332, 0.366, 0.020)
		colorSnow      (0.332, 0.332, 0.366, 1.000)
		BumpHeight      0.289921
		BumpOffset      0.0579842
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0736482
		Period          0.0759411
		Eccentricity    0.110411
		Inclination     3.02109
		AscendingNode   -48.6703
		ArgOfPericenter 39.834
		MeanAnomaly     -159.177
	}
}

Asteroid	"S34"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.59089e-010
	Radius          4.16939
	InertiaMoment   0.399544

	Obliquity       -0.0169593
	EqAscendNode    93.4878
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.826 0.779 0.735)

	Surface
	{
		SurfStyle       0.838379
		OceanStyle      0.537244
		Randomize      (-0.464, 0.909, 0.843)
		colorDistMagn   0.364121
		colorDistFreq   0.0119443
		detailScale     113.852
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.333275
		terraceProb     0.433971
		erosion         0
		montesMagn      0.315276
		montesFreq      2.16386
		montesSpiky     0.948522
		montesFraction  0.450191
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0483983
		hillsFraction   0.709359
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247167
		craterFreq      0.2066
		craterDensity   0.825744
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.8273
		volcanoTemp     1336.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.322, 0.265, 0.206, 0.000)
		colorShelf     (0.330, 0.273, 0.235, 0.000)
		colorBeach     (0.388, 0.319, 0.279, 0.000)
		colorDesert    (0.421, 0.343, 0.272, 0.000)
		colorLowland   (0.463, 0.366, 0.309, 0.000)
		colorUpland    (0.512, 0.444, 0.375, 0.000)
		colorRock      (0.554, 0.483, 0.404, 0.000)
		colorSnow      (0.603, 0.514, 0.426, 1.000)
		BumpHeight      3.75245
		BumpOffset      0.750491
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0771508
		Period          0.0814226
		Eccentricity    0.043324
		Inclination     -0.0169593
		AscendingNode   93.4878
		ArgOfPericenter 75.0586
		MeanAnomaly     -177.811
	}
}

Asteroid	"S35"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.34108e-007
	Radius          47.4143
	InertiaMoment   0.397296

	Obliquity       0.865055
	EqAscendNode    -158.951
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.803 0.746 0.722)

	Surface
	{
		SurfStyle       0.0898984
		OceanStyle      0.406772
		Randomize      (-0.261, -0.839, -0.616)
		colorDistMagn   0.399733
		colorDistFreq   1.29668
		detailScale     1294.73
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00551345
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.564345
		terraceProb     0.211231
		erosion         0
		montesMagn      0.35753
		montesFreq      2.27629
		montesSpiky     0.929651
		montesFraction  0.684219
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.00156
		hillsFraction   0.84413
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231969
		craterFreq      0.241649
		craterDensity   0.981897
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   15.3641
		volcanoTemp     1234.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.299, 0.289, 0.000)
		colorShelf     (0.341, 0.317, 0.307, 0.000)
		colorBeach     (0.361, 0.336, 0.325, 0.000)
		colorDesert    (0.381, 0.355, 0.343, 0.000)
		colorLowland   (0.402, 0.373, 0.361, 0.000)
		colorUpland    (0.422, 0.392, 0.379, 0.000)
		colorRock      (0.442, 0.410, 0.397, 0.000)
		colorSnow      (0.462, 0.429, 0.415, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.111135
		Period          0.140771
		Eccentricity    0.0662809
		Inclination     0.865055
		AscendingNode   -158.951
		ArgOfPericenter 87.444
		MeanAnomaly     -72.3166
	}
}

Asteroid	"S36"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.37149e-015
	Radius          0.0854925
	InertiaMoment   0.398754

	RotationPeriod  2500.93
	Obliquity       5.03634
	EqAscendNode    12.9124

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.716 0.679 0.609)

	Surface
	{
		SurfStyle       0.486085
		OceanStyle      0.350956
		Randomize      (-0.555, 0.895, -0.707)
		colorDistMagn   0.430688
		colorDistFreq   4.54136e-006
		detailScale     2.33452
		colorConversion true
		snowLevel       2
		tropicLatitude  0.173797
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.492021
		terraceProb     0.114149
		erosion         0
		montesMagn      0.500301
		montesFreq      3.43964
		montesSpiky     0.929868
		montesFraction  0.463219
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.62095e-005
		hillsFraction   0.663929
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238534
		craterFreq      0.243404
		craterDensity   1.07712
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   361.941
		volcanoTemp     1677.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.272, 0.244, 0.000)
		colorShelf     (0.304, 0.289, 0.259, 0.000)
		colorBeach     (0.322, 0.306, 0.274, 0.000)
		colorDesert    (0.340, 0.323, 0.289, 0.000)
		colorLowland   (0.358, 0.340, 0.304, 0.000)
		colorUpland    (0.376, 0.357, 0.320, 0.000)
		colorRock      (0.394, 0.374, 0.335, 0.000)
		colorSnow      (0.412, 0.391, 0.350, 1.000)
		BumpHeight      0.0769433
		BumpOffset      0.0153887
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.112124
		Period          0.142653
		Eccentricity    0.132745
		Inclination     5.03634
		AscendingNode   12.9124
		ArgOfPericenter -64.6358
		MeanAnomaly     146.957
	}
}

Asteroid	"S37"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.01822e-012
	Radius          0.972417
	InertiaMoment   0.399723

	Obliquity       2.68617
	EqAscendNode    82.3021
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.418 0.416 0.413)

	Surface
	{
		SurfStyle       0.491225
		OceanStyle      0.274077
		Randomize      (0.514, -0.923, -0.242)
		colorDistMagn   0.904811
		colorDistFreq   0.000500548
		detailScale     26.5535
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0705334
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443339
		terraceProb     0.387027
		erosion         0
		montesMagn      0.52515
		montesFreq      3.48127
		montesSpiky     0.968916
		montesFraction  0.798924
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00301793
		hillsFraction   0.709998
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249213
		craterFreq      0.208989
		craterDensity   0.888691
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   107.318
		volcanoTemp     1676.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.166, 0.165, 0.000)
		colorShelf     (0.178, 0.177, 0.176, 0.000)
		colorBeach     (0.188, 0.187, 0.186, 0.000)
		colorDesert    (0.199, 0.198, 0.196, 0.000)
		colorLowland   (0.209, 0.208, 0.206, 0.000)
		colorUpland    (0.220, 0.218, 0.217, 0.000)
		colorRock      (0.230, 0.229, 0.227, 0.000)
		colorSnow      (0.240, 0.239, 0.237, 1.000)
		BumpHeight      0.875175
		BumpOffset      0.175035
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0713948
		Period          0.0724827
		Eccentricity    0.0823338
		Inclination     2.68617
		AscendingNode   82.3021
		ArgOfPericenter 44.3409
		MeanAnomaly     -52.7978
	}
}

Asteroid	"S38"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.96992e-009
	Radius          8.65315
	InertiaMoment   0.397683

	Obliquity       3.63961
	EqAscendNode    -101.98
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.484 0.426 0.319)

	Surface
	{
		SurfStyle       0.864385
		OceanStyle      0.255314
		Randomize      (-0.326, 0.868, 0.005)
		colorDistMagn   0.533543
		colorDistFreq   0.0519326
		detailScale     236.289
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0798526
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.672531
		terraceProb     0.184686
		erosion         0
		montesMagn      0.403628
		montesFreq      3.58868
		montesSpiky     0.961379
		montesFraction  0.357821
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.153803
		hillsFraction   0.680836
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233019
		craterFreq      0.241455
		craterDensity   1.03607
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.8947
		volcanoTemp     1440.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.149, 0.127, 0.050)
		colorShelf     (0.194, 0.174, 0.147, 0.040)
		colorBeach     (0.223, 0.200, 0.166, 0.030)
		colorDesert    (0.252, 0.226, 0.188, 0.020)
		colorLowland   (0.281, 0.251, 0.207, 0.030)
		colorUpland    (0.310, 0.277, 0.226, 0.050)
		colorRock      (0.339, 0.302, 0.252, 0.020)
		colorSnow      (0.339, 0.302, 0.252, 1.000)
		BumpHeight      7.78784
		BumpOffset      1.55757
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0661138
		Period          0.064591
		Eccentricity    0.00903165
		Inclination     3.63961
		AscendingNode   -101.98
		ArgOfPericenter -129.327
		MeanAnomaly     -115.452
	}
}

Asteroid	"S39"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.73989e-017
	Radius          0.0175222
	InertiaMoment   0.398961

	RotationPeriod  3401.38
	Obliquity       3.23256
	EqAscendNode    -165.413

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.459 0.454 0.447)

	Surface
	{
		SurfStyle       0.547239
		OceanStyle      0.0300888
		Randomize      (-0.437, -0.004, 0.703)
		colorDistMagn   0.97468
		colorDistFreq   1.98481e-007
		detailScale     0.478473
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0143147
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.561424
		terraceProb     0.524325
		erosion         0
		montesMagn      0.520006
		montesFreq      3.45868
		montesSpiky     0.983158
		montesFraction  0.650075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.45694e-007
		hillsFraction   0.398284
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218245
		craterFreq      0.213394
		craterDensity   0.725485
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   658.62
		volcanoTemp     1658.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.154, 0.125, 0.000)
		colorShelf     (0.184, 0.159, 0.143, 0.000)
		colorBeach     (0.216, 0.186, 0.170, 0.000)
		colorDesert    (0.234, 0.200, 0.165, 0.000)
		colorLowland   (0.257, 0.213, 0.188, 0.000)
		colorUpland    (0.285, 0.259, 0.228, 0.000)
		colorRock      (0.308, 0.281, 0.246, 0.000)
		colorSnow      (0.335, 0.300, 0.259, 1.000)
		BumpHeight      0.01577
		BumpOffset      0.003154
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0867054
		Period          0.097007
		Eccentricity    0.150048
		Inclination     3.23256
		AscendingNode   -165.413
		ArgOfPericenter -174.068
		MeanAnomaly     -125.985
	}
}

Asteroid	"S40"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.56034e-014
	Radius          0.226793
	InertiaMoment   0.3999

	RotationPeriod  5264.91
	Obliquity       3.28812
	EqAscendNode    -148.351

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.543 0.539 0.534)

	Surface
	{
		SurfStyle       0.0135952
		OceanStyle      0.869136
		Randomize      (0.651, -0.689, -0.293)
		colorDistMagn   0.546236
		colorDistFreq   4.0426e-005
		detailScale     6.19297
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0312767
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584865
		terraceProb     0.29942
		erosion         0
		montesMagn      0.560759
		montesFreq      2.73029
		montesSpiky     0.693301
		montesFraction  0.103303
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000114431
		hillsFraction   0.704217
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230596
		craterFreq      0.240727
		craterDensity   1.04246
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   222.222
		volcanoTemp     1587.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.216, 0.214, 0.000)
		colorShelf     (0.231, 0.229, 0.227, 0.000)
		colorBeach     (0.244, 0.243, 0.240, 0.000)
		colorDesert    (0.258, 0.256, 0.254, 0.000)
		colorLowland   (0.271, 0.270, 0.267, 0.000)
		colorUpland    (0.285, 0.283, 0.280, 0.000)
		colorRock      (0.299, 0.296, 0.294, 0.000)
		colorSnow      (0.312, 0.310, 0.307, 1.000)
		BumpHeight      0.204114
		BumpOffset      0.0408228
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0999839
		Period          0.120124
		Eccentricity    0.129209
		Inclination     3.28812
		AscendingNode   -148.351
		ArgOfPericenter 42.8097
		MeanAnomaly     -143.615
	}
}

Asteroid	"S41"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            3.76767e-011
	Radius          2.26692
	InertiaMoment   0.397999

	RotationPeriod  1750.8
	Obliquity       -2.24052
	EqAscendNode    -108.6

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.783 0.781 0.780)

	Surface
	{
		SurfStyle       0.69646
		OceanStyle      0.358272
		Randomize      (-0.477, 0.288, -0.194)
		colorDistMagn   0.907657
		colorDistFreq   0.00102446
		detailScale     61.9021
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0456143
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661887
		terraceProb     0.283606
		erosion         0
		montesMagn      0.607769
		montesFreq      3.71607
		montesSpiky     0.983369
		montesFraction  0.738048
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0139729
		hillsFraction   0.605974
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258207
		craterFreq      0.215465
		craterDensity   0.801607
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.9036
		volcanoTemp     1365.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.266, 0.218, 0.000)
		colorShelf     (0.313, 0.274, 0.249, 0.000)
		colorBeach     (0.368, 0.320, 0.296, 0.000)
		colorDesert    (0.399, 0.344, 0.288, 0.000)
		colorLowland   (0.439, 0.367, 0.327, 0.000)
		colorUpland    (0.485, 0.445, 0.398, 0.000)
		colorRock      (0.525, 0.484, 0.429, 0.000)
		colorSnow      (0.572, 0.516, 0.452, 1.000)
		BumpHeight      2.04023
		BumpOffset      0.408046
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0884002
		Period          0.0998652
		Eccentricity    0.111949
		Inclination     -2.24052
		AscendingNode   -108.6
		ArgOfPericenter 11.1313
		MeanAnomaly     140.623
	}
}

Asteroid	"S42"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            5.54432e-008
	Radius          25.7817
	InertiaMoment   0.399158

	RotationPeriod  474.758
	Obliquity       -2.33419
	EqAscendNode    -67.7447

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.745 0.639 0.542)

	Surface
	{
		SurfStyle       0.0290897
		OceanStyle      0.835949
		Randomize      (-0.840, -0.866, 0.499)
		colorDistMagn   0.978524
		colorDistFreq   0.261467
		detailScale     704.012
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0675931
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.607737
		terraceProb     0.428163
		erosion         0
		montesMagn      0.640776
		montesFreq      3.88033
		montesSpiky     0.987198
		montesFraction  0.384748
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.60572
		hillsFraction   0.655225
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.277152
		craterFreq      0.261254
		craterDensity   0.948172
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   17.167
		volcanoTemp     1516.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.256, 0.217, 0.000)
		colorShelf     (0.316, 0.272, 0.231, 0.000)
		colorBeach     (0.335, 0.288, 0.244, 0.000)
		colorDesert    (0.354, 0.304, 0.258, 0.000)
		colorLowland   (0.372, 0.320, 0.271, 0.000)
		colorUpland    (0.391, 0.336, 0.285, 0.000)
		colorRock      (0.410, 0.352, 0.298, 0.000)
		colorSnow      (0.428, 0.368, 0.312, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0770357
		Period          0.0812404
		Eccentricity    0.149529
		Inclination     -2.33419
		AscendingNode   -67.7448
		ArgOfPericenter -122.426
		MeanAnomaly     108.035
	}
}

Asteroid	"S43"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            3.24807e-016
	Radius          0.0464826
	InertiaMoment   0.395673

	Obliquity       1.71048
	EqAscendNode    96.4979
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.599 0.529 0.430)

	Surface
	{
		SurfStyle       0.270991
		OceanStyle      0.665013
		Randomize      (0.578, -0.379, -0.931)
		colorDistMagn   0.657688
		colorDistFreq   9.18944e-007
		detailScale     1.26928
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0397444
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.587872
		terraceProb     0.56551
		erosion         0
		montesMagn      0.437014
		montesFreq      3.42987
		montesSpiky     0.918016
		montesFraction  0.6205
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.00906e-006
		hillsFraction   0.767101
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235311
		craterFreq      0.245811
		craterDensity   0.882898
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   404.374
		volcanoTemp     1592.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.212, 0.172, 0.000)
		colorShelf     (0.255, 0.225, 0.183, 0.000)
		colorBeach     (0.270, 0.238, 0.194, 0.000)
		colorDesert    (0.285, 0.251, 0.204, 0.000)
		colorLowland   (0.300, 0.265, 0.215, 0.000)
		colorUpland    (0.315, 0.278, 0.226, 0.000)
		colorRock      (0.330, 0.291, 0.237, 0.000)
		colorSnow      (0.345, 0.304, 0.247, 1.000)
		BumpHeight      0.0418343
		BumpOffset      0.00836687
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.102614
		Period          0.124895
		Eccentricity    0.0699454
		Inclination     1.71048
		AscendingNode   96.4979
		ArgOfPericenter 114.445
		MeanAnomaly     56.5586
	}
}

Asteroid	"S44"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            4.7797e-013
	Radius          0.601632
	InertiaMoment   0.398271

	Obliquity       -2.11427
	EqAscendNode    -131.853
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.652 0.650 0.648)

	Surface
	{
		SurfStyle       0.37828
		OceanStyle      0.560946
		Randomize      (-0.418, 0.724, 0.619)
		colorDistMagn   0.960112
		colorDistFreq   0.000273567
		detailScale     16.4286
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0300943
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.654785
		terraceProb     0.275413
		erosion         0
		montesMagn      0.616931
		montesFreq      2.72921
		montesSpiky     0.825349
		montesFraction  0.421482
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00079049
		hillsFraction   0.557485
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239494
		craterFreq      0.263785
		craterDensity   0.866525
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   136.438
		volcanoTemp     1486.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.260, 0.259, 0.000)
		colorShelf     (0.277, 0.276, 0.275, 0.000)
		colorBeach     (0.294, 0.293, 0.291, 0.000)
		colorDesert    (0.310, 0.309, 0.308, 0.000)
		colorLowland   (0.326, 0.325, 0.324, 0.000)
		colorUpland    (0.342, 0.341, 0.340, 0.000)
		colorRock      (0.359, 0.358, 0.356, 0.000)
		colorSnow      (0.375, 0.374, 0.372, 1.000)
		BumpHeight      0.541469
		BumpOffset      0.108294
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0780946
		Period          0.0829212
		Eccentricity    0.078668
		Inclination     -2.11427
		AscendingNode   -131.853
		ArgOfPericenter 168.438
		MeanAnomaly     -71.1357
	}
}

Asteroid	"S45"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            7.03359e-010
	Radius          6.84301
	InertiaMoment   0.399347

	Obliquity       1.19724
	EqAscendNode    51.1771
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.594 0.591 0.589)

	Surface
	{
		SurfStyle       0.941057
		OceanStyle      0.713085
		Randomize      (0.477, 0.199, -0.922)
		colorDistMagn   0.758131
		colorDistFreq   0.0206327
		detailScale     186.86
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0376828
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.384604
		terraceProb     0.380546
		erosion         0
		montesMagn      0.578074
		montesFreq      2.68874
		montesSpiky     0.876208
		montesFraction  0.409908
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.112601
		hillsFraction   0.741714
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241326
		craterFreq      0.22288
		craterDensity   0.828844
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   40.4543
		volcanoTemp     1654.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.207, 0.236, 0.050)
		colorShelf     (0.237, 0.242, 0.271, 0.040)
		colorBeach     (0.273, 0.278, 0.306, 0.030)
		colorDesert    (0.309, 0.313, 0.348, 0.020)
		colorLowland   (0.344, 0.349, 0.383, 0.030)
		colorUpland    (0.380, 0.384, 0.418, 0.050)
		colorRock      (0.416, 0.419, 0.465, 0.020)
		colorSnow      (0.416, 0.419, 0.465, 1.000)
		BumpHeight      6.15871
		BumpOffset      1.23174
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.111956
		Period          0.142333
		Eccentricity    0.103343
		Inclination     1.19724
		AscendingNode   51.1771
		ArgOfPericenter 103.936
		MeanAnomaly     73.1104
	}
}

Asteroid	"S46"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            4.12052e-018
	Radius          0.0123362
	InertiaMoment   0.396718

	RotationPeriod  2457.15
	Obliquity       0.944605
	EqAscendNode    -158.851

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.758 0.724 0.693)

	Surface
	{
		SurfStyle       0.429891
		OceanStyle      0.168724
		Randomize      (-0.740, 0.831, 0.023)
		colorDistMagn   0.963788
		colorDistFreq   4.53599e-009
		detailScale     0.336861
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00604954
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.477822
		terraceProb     0.41133
		erosion         0
		montesMagn      0.368339
		montesFreq      2.37588
		montesSpiky     0.890242
		montesFraction  0.597601
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.93196e-007
		hillsFraction   0.703457
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261244
		craterFreq      0.225487
		craterDensity   0.945947
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   952.822
		volcanoTemp     1453.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.289, 0.277, 0.000)
		colorShelf     (0.322, 0.308, 0.295, 0.000)
		colorBeach     (0.341, 0.326, 0.312, 0.000)
		colorDesert    (0.360, 0.344, 0.329, 0.000)
		colorLowland   (0.379, 0.362, 0.347, 0.000)
		colorUpland    (0.398, 0.380, 0.364, 0.000)
		colorRock      (0.417, 0.398, 0.381, 0.000)
		colorSnow      (0.436, 0.416, 0.399, 1.000)
		BumpHeight      0.0111026
		BumpOffset      0.00222052
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.110811
		Period          0.140156
		Eccentricity    0.12365
		Inclination     0.944604
		AscendingNode   -158.851
		ArgOfPericenter -151.983
		MeanAnomaly     5.97151
	}
}

Asteroid	"S47"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            6.06357e-015
	Radius          0.123308
	InertiaMoment   0.398514

	RotationPeriod  513.563
	Obliquity       -2.00939
	EqAscendNode    5.43031

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.523 0.413 0.324)

	Surface
	{
		SurfStyle       0.445261
		OceanStyle      0.711664
		Randomize      (0.930, -0.534, -0.809)
		colorDistMagn   0.427431
		colorDistFreq   6.72809e-006
		detailScale     3.36713
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0700045
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.649902
		terraceProb     0.108787
		erosion         0
		montesMagn      0.327293
		montesFreq      3.57274
		montesSpiky     0.888132
		montesFraction  0.588804
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.32982e-005
		hillsFraction   0.530717
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219728
		craterFreq      0.192194
		craterDensity   0.786209
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   248.275
		volcanoTemp     1638.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.165, 0.129, 0.000)
		colorShelf     (0.222, 0.175, 0.137, 0.000)
		colorBeach     (0.235, 0.186, 0.146, 0.000)
		colorDesert    (0.248, 0.196, 0.154, 0.000)
		colorLowland   (0.261, 0.206, 0.162, 0.000)
		colorUpland    (0.274, 0.217, 0.170, 0.000)
		colorRock      (0.287, 0.227, 0.178, 0.000)
		colorSnow      (0.301, 0.237, 0.186, 1.000)
		BumpHeight      0.110977
		BumpOffset      0.0221955
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0811782
		Period          0.0878807
		Eccentricity    0.0804676
		Inclination     -2.00939
		AscendingNode   5.43031
		ArgOfPericenter 105.852
		MeanAnomaly     -119.576
	}
}

Asteroid	"S48"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            8.92287e-012
	Radius          1.40254
	InertiaMoment   0.39953

	RotationPeriod  442.153
	Obliquity       3.4807
	EqAscendNode    61.3642

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.675 0.671 0.667)

	Surface
	{
		SurfStyle       0.0496613
		OceanStyle      0.722931
		Randomize      (-0.159, -0.172, 0.839)
		colorDistMagn   0.827394
		colorDistFreq   0.000765332
		detailScale     38.2987
		colorConversion true
		snowLevel       2
		tropicLatitude  0.104284
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530195
		terraceProb     0.499976
		erosion         0
		montesMagn      0.363294
		montesFreq      3.46163
		montesSpiky     0.959416
		montesFraction  0.328561
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0048475
		hillsFraction   0.640772
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25066
		craterFreq      0.248157
		craterDensity   0.892644
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   73.6154
		volcanoTemp     1443.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.268, 0.267, 0.000)
		colorShelf     (0.287, 0.285, 0.284, 0.000)
		colorBeach     (0.304, 0.302, 0.300, 0.000)
		colorDesert    (0.320, 0.319, 0.317, 0.000)
		colorLowland   (0.337, 0.335, 0.334, 0.000)
		colorUpland    (0.354, 0.352, 0.350, 0.000)
		colorRock      (0.371, 0.369, 0.367, 0.000)
		colorSnow      (0.388, 0.386, 0.384, 1.000)
		BumpHeight      1.26229
		BumpOffset      0.252457
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0734669
		Period          0.075661
		Eccentricity    0.108216
		Inclination     3.4807
		AscendingNode   61.3642
		ArgOfPericenter -156.603
		MeanAnomaly     91.9011
	}
}

Asteroid	"S49"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.31305e-008
	Radius          15.9519
	InertiaMoment   0.397262

	Obliquity       -1.54986
	EqAscendNode    -62.8901
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.792 0.771 0.733)

	Surface
	{
		SurfStyle       0.964105
		OceanStyle      0.698484
		Randomize      (0.536, -0.892, 0.095)
		colorDistMagn   0.574387
		colorDistFreq   0.195199
		detailScale     435.593
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0461374
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.30699
		terraceProb     0.168807
		erosion         0
		montesMagn      0.609434
		montesFreq      3.04592
		montesSpiky     0.944095
		montesFraction  0.570394
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.439019
		hillsFraction   0.826345
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239869
		craterFreq      0.232291
		craterDensity   0.996504
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.8262
		volcanoTemp     1613.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.270, 0.293, 0.050)
		colorShelf     (0.317, 0.316, 0.337, 0.040)
		colorBeach     (0.364, 0.362, 0.381, 0.030)
		colorDesert    (0.412, 0.409, 0.433, 0.020)
		colorLowland   (0.459, 0.455, 0.477, 0.030)
		colorUpland    (0.507, 0.501, 0.521, 0.050)
		colorRock      (0.554, 0.548, 0.579, 0.020)
		colorSnow      (0.554, 0.548, 0.579, 1.000)
		BumpHeight      14.3567
		BumpOffset      2.87134
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0973778
		Period          0.115458
		Eccentricity    0.103634
		Inclination     -1.54986
		AscendingNode   -62.8901
		ArgOfPericenter 120.661
		MeanAnomaly     -179.02
	}
}

Asteroid	"S50"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            7.69232e-017
	Radius          0.0327253
	InertiaMoment   0.398737

	RotationPeriod  1379.84
	Obliquity       -0.657477
	EqAscendNode    -103.249

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.663 0.660)

	Surface
	{
		SurfStyle       0.83631
		OceanStyle      0.605423
		Randomize      (0.523, -0.357, 0.263)
		colorDistMagn   0.779076
		colorDistFreq   6.36097e-007
		detailScale     0.893619
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0142479
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.646585
		terraceProb     0.280065
		erosion         0
		montesMagn      0.555109
		montesFreq      2.81616
		montesSpiky     0.940324
		montesFraction  0.705713
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.22421e-006
		hillsFraction   0.498136
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229975
		craterFreq      0.255184
		craterDensity   0.930658
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   585.007
		volcanoTemp     1554.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.225, 0.185, 0.000)
		colorShelf     (0.267, 0.232, 0.211, 0.000)
		colorBeach     (0.314, 0.272, 0.251, 0.000)
		colorDesert    (0.341, 0.292, 0.244, 0.000)
		colorLowland   (0.374, 0.312, 0.277, 0.000)
		colorUpland    (0.414, 0.378, 0.337, 0.000)
		colorRock      (0.448, 0.411, 0.363, 0.000)
		colorSnow      (0.488, 0.438, 0.383, 1.000)
		BumpHeight      0.0294528
		BumpOffset      0.00589055
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0988349
		Period          0.118059
		Eccentricity    0.168075
		Inclination     -0.657477
		AscendingNode   -103.249
		ArgOfPericenter 39.2584
		MeanAnomaly     -167.594
	}
}

Asteroid	"S51"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.13197e-013
	Radius          0.327109
	InertiaMoment   0.39971

	Obliquity       2.87774
	EqAscendNode    71.7127
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.607 0.600 0.596)

	Surface
	{
		SurfStyle       0.757015
		OceanStyle      0.964726
		Randomize      (-0.313, -0.923, 0.638)
		colorDistMagn   0.65031
		colorDistFreq   7.15404e-005
		detailScale     8.93226
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0813131
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.611877
		terraceProb     0.14113
		erosion         0
		montesMagn      0.518047
		montesFreq      1.79302
		montesSpiky     0.950512
		montesFraction  0.465949
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000232175
		hillsFraction   0.678415
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274244
		craterFreq      0.219174
		craterDensity   0.944706
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   152.434
		volcanoTemp     1414.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.204, 0.167, 0.000)
		colorShelf     (0.243, 0.210, 0.191, 0.000)
		colorBeach     (0.285, 0.246, 0.226, 0.000)
		colorDesert    (0.309, 0.264, 0.220, 0.000)
		colorLowland   (0.340, 0.282, 0.250, 0.000)
		colorUpland    (0.376, 0.342, 0.304, 0.000)
		colorRock      (0.406, 0.372, 0.328, 0.000)
		colorSnow      (0.443, 0.396, 0.345, 1.000)
		BumpHeight      0.294398
		BumpOffset      0.0588796
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0841874
		Period          0.0928121
		Eccentricity    0.0853068
		Inclination     2.87774
		AscendingNode   71.7127
		ArgOfPericenter 165.127
		MeanAnomaly     -89.616
	}
}

Asteroid	"S52"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.66575e-010
	Radius          4.57936
	InertiaMoment   0.397656

	Obliquity       -5.63775
	EqAscendNode    124.252
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.729 0.726 0.725)

	Surface
	{
		SurfStyle       0.767926
		OceanStyle      0.0042536
		Randomize      (-0.690, 0.201, 0.860)
		colorDistMagn   0.587096
		colorDistFreq   0.0162535
		detailScale     125.047
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0917616
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.517878
		terraceProb     0.108076
		erosion         0
		montesMagn      0.557762
		montesFreq      2.61799
		montesSpiky     0.920935
		montesFraction  0.692137
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0476286
		hillsFraction   0.708754
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238041
		craterFreq      0.214427
		craterDensity   0.692698
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   55.6296
		volcanoTemp     1727
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.247, 0.203, 0.000)
		colorShelf     (0.292, 0.254, 0.232, 0.000)
		colorBeach     (0.343, 0.298, 0.276, 0.000)
		colorDesert    (0.372, 0.320, 0.268, 0.000)
		colorLowland   (0.408, 0.341, 0.305, 0.000)
		colorUpland    (0.452, 0.414, 0.370, 0.000)
		colorRock      (0.489, 0.450, 0.399, 0.000)
		colorSnow      (0.532, 0.479, 0.421, 1.000)
		BumpHeight      4.12143
		BumpOffset      0.824285
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.121445
		Period          0.160806
		Eccentricity    0.0444277
		Inclination     -5.63775
		AscendingNode   124.252
		ArgOfPericenter 165.28
		MeanAnomaly     -29.2864
	}
}

Asteroid	"S53"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.45124e-007
	Radius          48.1464
	InertiaMoment   0.398946

	RotationPeriod  417.806
	Obliquity       3.93385
	EqAscendNode    -156.439

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.414 0.409 0.405)

	Surface
	{
		SurfStyle       0.391122
		OceanStyle      0.977357
		Randomize      (0.529, -0.461, -0.261)
		colorDistMagn   0.208596
		colorDistFreq   0.943446
		detailScale     1314.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0280107
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.454133
		terraceProb     0.20845
		erosion         0
		montesMagn      0.373807
		montesFreq      3.00148
		montesSpiky     0.959738
		montesFraction  0.945253
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.99837
		hillsFraction   0.567671
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214114
		craterFreq      0.235262
		craterDensity   0.922226
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   15.2467
		volcanoTemp     1615.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.164, 0.162, 0.000)
		colorShelf     (0.176, 0.174, 0.172, 0.000)
		colorBeach     (0.186, 0.184, 0.182, 0.000)
		colorDesert    (0.197, 0.194, 0.192, 0.000)
		colorLowland   (0.207, 0.204, 0.202, 0.000)
		colorUpland    (0.217, 0.215, 0.213, 0.000)
		colorRock      (0.228, 0.225, 0.223, 0.000)
		colorSnow      (0.238, 0.235, 0.233, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0707446
		Period          0.0714947
		Eccentricity    0.0738988
		Inclination     3.93385
		AscendingNode   -156.439
		ArgOfPericenter 123.36
		MeanAnomaly     15.5134
	}
}

Asteroid	"S54"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.43603e-015
	Radius          0.0679198
	InertiaMoment   0.399887

	Obliquity       -0.166563
	EqAscendNode    -34.3513
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.427 0.421 0.415)

	Surface
	{
		SurfStyle       0.264267
		OceanStyle      0.019423
		Randomize      (-0.643, -0.241, -0.091)
		colorDistMagn   0.774084
		colorDistFreq   2.2395e-006
		detailScale     1.85466
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00555653
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.355878
		terraceProb     0.242617
		erosion         0
		montesMagn      0.575473
		montesFreq      3.26966
		montesSpiky     0.882478
		montesFraction  0.815179
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.07553e-006
		hillsFraction   0.809082
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225943
		craterFreq      0.176556
		craterDensity   0.95847
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   281.01
		volcanoTemp     1570.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.169, 0.166, 0.000)
		colorShelf     (0.181, 0.179, 0.176, 0.000)
		colorBeach     (0.192, 0.190, 0.187, 0.000)
		colorDesert    (0.203, 0.200, 0.197, 0.000)
		colorLowland   (0.213, 0.211, 0.207, 0.000)
		colorUpland    (0.224, 0.221, 0.218, 0.000)
		colorRock      (0.235, 0.232, 0.228, 0.000)
		colorSnow      (0.245, 0.242, 0.238, 1.000)
		BumpHeight      0.0611278
		BumpOffset      0.0122256
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0754378
		Period          0.078726
		Eccentricity    0.108598
		Inclination     -0.166563
		AscendingNode   -34.3513
		ArgOfPericenter -15.9735
		MeanAnomaly     -29.1016
	}
}

Asteroid	"S55"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.11319e-012
	Radius          0.867747
	InertiaMoment   0.397976

	RotationPeriod  954.002
	Obliquity       -2.24964
	EqAscendNode    129.511

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.775 0.772 0.770)

	Surface
	{
		SurfStyle       0.355853
		OceanStyle      0.809308
		Randomize      (-0.861, -0.352, -0.256)
		colorDistMagn   0.548351
		colorDistFreq   0.000481668
		detailScale     23.6953
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0334773
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615864
		terraceProb     0.168767
		erosion         0
		montesMagn      0.666909
		montesFreq      3.58146
		montesSpiky     0.976795
		montesFraction  0.708311
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.001577
		hillsFraction   0.689893
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252287
		craterFreq      0.206121
		craterDensity   0.882811
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   93.5902
		volcanoTemp     1697.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.309, 0.308, 0.000)
		colorShelf     (0.329, 0.328, 0.327, 0.000)
		colorBeach     (0.349, 0.347, 0.346, 0.000)
		colorDesert    (0.368, 0.367, 0.366, 0.000)
		colorLowland   (0.388, 0.386, 0.385, 0.000)
		colorUpland    (0.407, 0.405, 0.404, 0.000)
		colorRock      (0.426, 0.424, 0.423, 0.000)
		colorSnow      (0.446, 0.444, 0.443, 1.000)
		BumpHeight      0.780973
		BumpOffset      0.156195
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0772781
		Period          0.0816242
		Eccentricity    0.152197
		Inclination     -2.24964
		AscendingNode   129.511
		ArgOfPericenter 9.03871
		MeanAnomaly     -66.1701
	}
}

Asteroid	"S56"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            3.10966e-009
	Radius          11.231
	InertiaMoment   0.399143

	RotationPeriod  1202.23
	Obliquity       -4.73328
	EqAscendNode    153.714

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.434 0.430 0.428)

	Surface
	{
		SurfStyle       0.00736639
		OceanStyle      0.775166
		Randomize      (0.832, -0.916, 0.214)
		colorDistMagn   0.739553
		colorDistFreq   0.058225
		detailScale     306.681
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0375196
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.473443
		terraceProb     0.184797
		erosion         0
		montesMagn      0.500019
		montesFreq      2.53865
		montesSpiky     0.879199
		montesFraction  0.603083
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.324459
		hillsFraction   0.475865
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273914
		craterFreq      0.212311
		craterDensity   0.988981
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.5768
		volcanoTemp     1971.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.172, 0.171, 0.000)
		colorShelf     (0.185, 0.183, 0.182, 0.000)
		colorBeach     (0.195, 0.194, 0.192, 0.000)
		colorDesert    (0.206, 0.204, 0.203, 0.000)
		colorLowland   (0.217, 0.215, 0.214, 0.000)
		colorUpland    (0.228, 0.226, 0.224, 0.000)
		colorRock      (0.239, 0.237, 0.235, 0.000)
		colorSnow      (0.250, 0.247, 0.246, 1.000)
		BumpHeight      10.1079
		BumpOffset      2.02158
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0776979
		Period          0.0822902
		Eccentricity    0.156777
		Inclination     -4.73328
		AscendingNode   153.714
		ArgOfPericenter -115.057
		MeanAnomaly     77.5085
	}
}

Asteroid	"S57"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.82175e-017
	Radius          0.0158406
	InertiaMoment   0.395519

	Obliquity       -1.03573
	EqAscendNode    61.3474
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.635 0.496 0.402)

	Surface
	{
		SurfStyle       0.893547
		OceanStyle      0.0575657
		Randomize      (0.733, 0.634, -0.155)
		colorDistMagn   0.757736
		colorDistFreq   2.16188e-007
		detailScale     0.432555
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0310894
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.375197
		terraceProb     0.145151
		erosion         0
		montesMagn      0.424249
		montesFreq      2.38182
		montesSpiky     0.836595
		montesFraction  0.67463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.76982e-007
		hillsFraction   0.88316
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241656
		craterFreq      0.238255
		craterDensity   0.807944
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   581.881
		volcanoTemp     1419.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.174, 0.161, 0.050)
		colorShelf     (0.254, 0.204, 0.185, 0.040)
		colorBeach     (0.292, 0.233, 0.209, 0.030)
		colorDesert    (0.330, 0.263, 0.237, 0.020)
		colorLowland   (0.368, 0.293, 0.261, 0.030)
		colorUpland    (0.406, 0.323, 0.285, 0.050)
		colorRock      (0.444, 0.352, 0.318, 0.020)
		colorSnow      (0.444, 0.352, 0.318, 1.000)
		BumpHeight      0.0142566
		BumpOffset      0.00285131
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0737187
		Period          0.0760502
		Eccentricity    0.111261
		Inclination     -1.03573
		AscendingNode   61.3474
		ArgOfPericenter -156.274
		MeanAnomaly     148.668
	}
}

Asteroid	"S58"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.6808e-014
	Radius          0.249093
	InertiaMoment   0.398251

	Obliquity       -0.20969
	EqAscendNode    115.032
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.476 0.471 0.464)

	Surface
	{
		SurfStyle       0.863847
		OceanStyle      0.44028
		Randomize      (-0.900, -0.752, -0.818)
		colorDistMagn   0.395423
		colorDistFreq   4.62078e-005
		detailScale     6.80191
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00393664
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.280316
		terraceProb     0.298754
		erosion         0
		montesMagn      0.646592
		montesFreq      3.60551
		montesSpiky     0.89786
		montesFraction  0.333197
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000137583
		hillsFraction   0.564398
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254884
		craterFreq      0.200911
		craterDensity   0.846647
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   238.526
		volcanoTemp     1595.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.165, 0.186, 0.050)
		colorShelf     (0.191, 0.193, 0.214, 0.040)
		colorBeach     (0.219, 0.222, 0.242, 0.030)
		colorDesert    (0.248, 0.250, 0.274, 0.020)
		colorLowland   (0.276, 0.278, 0.302, 0.030)
		colorUpland    (0.305, 0.306, 0.330, 0.050)
		colorRock      (0.334, 0.335, 0.367, 0.020)
		colorSnow      (0.334, 0.335, 0.367, 1.000)
		BumpHeight      0.224184
		BumpOffset      0.0448368
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.136191
		Period          0.190965
		Eccentricity    0.0597792
		Inclination     -0.20969
		AscendingNode   115.032
		ArgOfPericenter 31.6666
		MeanAnomaly     24.1323
	}
}

Asteroid	"S59"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            3.94495e-011
	Radius          2.61944
	InertiaMoment   0.399332

	Obliquity       4.83
	EqAscendNode    -54.7278
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.843 0.807 0.747)

	Surface
	{
		SurfStyle       0.795234
		OceanStyle      0.675601
		Randomize      (0.078, -0.618, 0.194)
		colorDistMagn   0.72071
		colorDistFreq   0.0022493
		detailScale     71.5282
		colorConversion true
		snowLevel       2
		tropicLatitude  0.149137
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.490352
		terraceProb     0.592182
		erosion         0
		montesMagn      0.400357
		montesFreq      3.89757
		montesSpiky     0.924106
		montesFraction  0.538808
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0176294
		hillsFraction   0.665784
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257774
		craterFreq      0.252771
		craterDensity   1.03298
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   65.3874
		volcanoTemp     1829.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.329, 0.275, 0.209, 0.000)
		colorShelf     (0.337, 0.283, 0.239, 0.000)
		colorBeach     (0.396, 0.331, 0.284, 0.000)
		colorDesert    (0.430, 0.355, 0.276, 0.000)
		colorLowland   (0.472, 0.379, 0.314, 0.000)
		colorUpland    (0.522, 0.460, 0.381, 0.000)
		colorRock      (0.565, 0.501, 0.411, 0.000)
		colorSnow      (0.615, 0.533, 0.433, 1.000)
		BumpHeight      2.3575
		BumpOffset      0.471499
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0730394
		Period          0.0750014
		Eccentricity    0.102995
		Inclination     4.83
		AscendingNode   -54.7278
		ArgOfPericenter 174.775
		MeanAnomaly     145.957
	}
}

Asteroid	"S60"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            5.8052e-008
	Radius          23.3074
	InertiaMoment   0.396664

	RotationPeriod  935.812
	Obliquity       0.823528
	EqAscendNode    127.634

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.743 0.742 0.741)

	Surface
	{
		SurfStyle       0.979855
		OceanStyle      0.0159855
		Randomize      (-0.975, 0.919, -0.415)
		colorDistMagn   0.804176
		colorDistFreq   0.478611
		detailScale     636.448
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0126857
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.271694
		terraceProb     0.341598
		erosion         0
		montesMagn      0.512014
		montesFreq      3.39233
		montesSpiky     0.933147
		montesFraction  0.420509
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.21402
		hillsFraction   0.754723
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256206
		craterFreq      0.169208
		craterDensity   0.723974
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   15.1667
		volcanoTemp     1789.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.260, 0.296, 0.050)
		colorShelf     (0.297, 0.304, 0.341, 0.040)
		colorBeach     (0.342, 0.349, 0.385, 0.030)
		colorDesert    (0.386, 0.393, 0.437, 0.020)
		colorLowland   (0.431, 0.438, 0.481, 0.030)
		colorUpland    (0.476, 0.482, 0.526, 0.050)
		colorRock      (0.520, 0.527, 0.585, 0.020)
		colorSnow      (0.520, 0.527, 0.585, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0705312
		Period          0.0711715
		Eccentricity    0.0710967
		Inclination     0.823528
		AscendingNode   127.634
		ArgOfPericenter -113.813
		MeanAnomaly     -167.487
	}
}

Asteroid	"S61"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            3.4009e-016
	Radius          0.0472004
	InertiaMoment   0.398496

	RotationPeriod  1476.17
	Obliquity       -3.40478
	EqAscendNode    28.7793

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.563 0.426 0.322)

	Surface
	{
		SurfStyle       0.524978
		OceanStyle      0.631852
		Randomize      (-0.522, 0.137, -0.573)
		colorDistMagn   0.64402
		colorDistFreq   1.78686e-006
		detailScale     1.28889
		colorConversion true
		snowLevel       2
		tropicLatitude  0.114863
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.58492
		terraceProb     0.211401
		erosion         0
		montesMagn      0.633554
		montesFreq      2.44899
		montesSpiky     0.838071
		montesFraction  0.469717
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.08729e-006
		hillsFraction   0.681529
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231749
		craterFreq      0.197215
		craterDensity   0.805489
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   401.287
		volcanoTemp     1291.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.145, 0.090, 0.000)
		colorShelf     (0.225, 0.149, 0.103, 0.000)
		colorBeach     (0.265, 0.175, 0.122, 0.000)
		colorDesert    (0.287, 0.187, 0.119, 0.000)
		colorLowland   (0.315, 0.200, 0.135, 0.000)
		colorUpland    (0.349, 0.243, 0.164, 0.000)
		colorRock      (0.377, 0.264, 0.177, 0.000)
		colorSnow      (0.411, 0.281, 0.187, 1.000)
		BumpHeight      0.0424804
		BumpOffset      0.00849608
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0788959
		Period          0.0842008
		Eccentricity    0.169582
		Inclination     -3.40478
		AscendingNode   28.7793
		ArgOfPericenter -36.5432
		MeanAnomaly     110.699
	}
}

Asteroid	"S62"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            5.0046e-013
	Radius          0.610924
	InertiaMoment   0.399516

	Obliquity       -0.86758
	EqAscendNode    106.779
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.622 0.491 0.427)

	Surface
	{
		SurfStyle       0.136146
		OceanStyle      0.466631
		Randomize      (-0.507, -0.366, 0.026)
		colorDistMagn   0.702653
		colorDistFreq   0.00025355
		detailScale     16.6823
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0180591
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.431595
		terraceProb     0.381949
		erosion         0
		montesMagn      0.544966
		montesFreq      2.63674
		montesSpiky     0.919923
		montesFraction  0.627177
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000879334
		hillsFraction   0.795618
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244804
		craterFreq      0.247423
		craterDensity   0.703064
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   135.397
		volcanoTemp     1402.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.196, 0.171, 0.000)
		colorShelf     (0.264, 0.209, 0.182, 0.000)
		colorBeach     (0.280, 0.221, 0.192, 0.000)
		colorDesert    (0.296, 0.233, 0.203, 0.000)
		colorLowland   (0.311, 0.245, 0.214, 0.000)
		colorUpland    (0.327, 0.258, 0.224, 0.000)
		colorRock      (0.342, 0.270, 0.235, 0.000)
		colorSnow      (0.358, 0.282, 0.246, 1.000)
		BumpHeight      0.549831
		BumpOffset      0.109966
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0715566
		Period          0.0727291
		Eccentricity    0.055987
		Inclination     -0.86758
		AscendingNode   106.779
		ArgOfPericenter -173.182
		MeanAnomaly     118.712
	}
}

Asteroid	"S63"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            7.36454e-010
	Radius          6.10643
	InertiaMoment   0.397227

	Obliquity       0.196543
	EqAscendNode    -80.6653
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.486 0.482 0.477)

	Surface
	{
		SurfStyle       0.658267
		OceanStyle      0.892937
		Randomize      (-0.154, -0.172, -0.657)
		colorDistMagn   0.158743
		colorDistFreq   0.0264656
		detailScale     166.746
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00522482
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.376024
		terraceProb     0.349973
		erosion         0
		montesMagn      0.431688
		montesFreq      2.64375
		montesSpiky     0.943852
		montesFraction  0.487193
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.106599
		hillsFraction   0.737636
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232604
		craterFreq      0.187918
		craterDensity   0.910622
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.2794
		volcanoTemp     1371.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.164, 0.134, 0.000)
		colorShelf     (0.194, 0.169, 0.153, 0.000)
		colorBeach     (0.228, 0.198, 0.181, 0.000)
		colorDesert    (0.248, 0.212, 0.177, 0.000)
		colorLowland   (0.272, 0.227, 0.201, 0.000)
		colorUpland    (0.301, 0.275, 0.243, 0.000)
		colorRock      (0.325, 0.299, 0.263, 0.000)
		colorSnow      (0.355, 0.318, 0.277, 1.000)
		BumpHeight      5.49579
		BumpOffset      1.09916
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0837599
		Period          0.0921061
		Eccentricity    0.0744452
		Inclination     0.196543
		AscendingNode   -80.6653
		ArgOfPericenter -118.103
		MeanAnomaly     -60.9518
	}
}

Asteroid	"S64"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            4.31442e-018
	Radius          0.0125268
	InertiaMoment   0.39872

	Obliquity       5.82548
	EqAscendNode    123.353
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.703 0.624 0.559)

	Surface
	{
		SurfStyle       0.818994
		OceanStyle      0.0547047
		Randomize      (-0.613, -0.339, 0.114)
		colorDistMagn   0.71849
		colorDistFreq   1.31451e-007
		detailScale     0.342064
		colorConversion true
		snowLevel       2
		tropicLatitude  0.096201
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.664531
		terraceProb     0.186083
		erosion         0
		montesMagn      0.336242
		montesFreq      3.23435
		montesSpiky     0.996466
		montesFraction  0.425719
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.24096e-007
		hillsFraction   0.329317
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240868
		craterFreq      0.225424
		craterDensity   1.03452
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   945.548
		volcanoTemp     1635.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.212, 0.157, 0.000)
		colorShelf     (0.281, 0.218, 0.179, 0.000)
		colorBeach     (0.330, 0.256, 0.212, 0.000)
		colorDesert    (0.359, 0.275, 0.207, 0.000)
		colorLowland   (0.394, 0.293, 0.235, 0.000)
		colorUpland    (0.436, 0.356, 0.285, 0.000)
		colorRock      (0.471, 0.387, 0.308, 0.000)
		colorSnow      (0.513, 0.412, 0.324, 1.000)
		BumpHeight      0.0112741
		BumpOffset      0.00225482
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0954086
		Period          0.111974
		Eccentricity    0.0790531
		Inclination     5.82548
		AscendingNode   123.353
		ArgOfPericenter 10.1558
		MeanAnomaly     -143.859
	}
}

Asteroid	"S65"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            6.34887e-015
	Radius          0.142483
	InertiaMoment   0.399696

	Obliquity       -1.20411
	EqAscendNode    138.057
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.833 0.779 0.719)

	Surface
	{
		SurfStyle       0.0622966
		OceanStyle      0.481217
		Randomize      (-0.414, -0.625, 0.836)
		colorDistMagn   0.790936
		colorDistFreq   2.47274e-006
		detailScale     3.89074
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0150415
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.620523
		terraceProb     0.182354
		erosion         0
		montesMagn      0.558512
		montesFreq      2.87738
		montesSpiky     0.960166
		montesFraction  0.543798
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.34533e-005
		hillsFraction   0.706713
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221654
		craterFreq      0.252165
		craterDensity   0.7356
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   280.363
		volcanoTemp     1381.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.333, 0.311, 0.288, 0.000)
		colorShelf     (0.354, 0.331, 0.306, 0.000)
		colorBeach     (0.375, 0.350, 0.324, 0.000)
		colorDesert    (0.396, 0.370, 0.342, 0.000)
		colorLowland   (0.416, 0.389, 0.360, 0.000)
		colorUpland    (0.437, 0.409, 0.378, 0.000)
		colorRock      (0.458, 0.428, 0.396, 0.000)
		colorSnow      (0.479, 0.448, 0.414, 1.000)
		BumpHeight      0.128235
		BumpOffset      0.025647
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.119748
		Period          0.157447
		Eccentricity    0.0853308
		Inclination     -1.20411
		AscendingNode   138.057
		ArgOfPericenter 178.883
		MeanAnomaly     26.578
	}
}

Asteroid	"S66"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            9.34273e-012
	Radius          1.62064
	InertiaMoment   0.397629

	RotationPeriod  1765.97
	Obliquity       3.01554
	EqAscendNode    158.916

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.437 0.434 0.431)

	Surface
	{
		SurfStyle       0.744866
		OceanStyle      0.910539
		Randomize      (0.960, 0.961, 0.621)
		colorDistMagn   0.963214
		colorDistFreq   0.00150672
		detailScale     44.2544
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0192475
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.636988
		terraceProb     0.138311
		erosion         0
		montesMagn      0.574791
		montesFreq      3.11247
		montesSpiky     0.970819
		montesFraction  0.67445
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00848779
		hillsFraction   0.536313
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22089
		craterFreq      0.256266
		craterDensity   1.05613
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   83.1297
		volcanoTemp     1432.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.148, 0.121, 0.000)
		colorShelf     (0.175, 0.152, 0.138, 0.000)
		colorBeach     (0.206, 0.178, 0.164, 0.000)
		colorDesert    (0.223, 0.191, 0.159, 0.000)
		colorLowland   (0.245, 0.204, 0.181, 0.000)
		colorUpland    (0.271, 0.247, 0.220, 0.000)
		colorRock      (0.293, 0.269, 0.237, 0.000)
		colorSnow      (0.319, 0.287, 0.250, 1.000)
		BumpHeight      1.45858
		BumpOffset      0.291716
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.107707
		Period          0.134307
		Eccentricity    0.105072
		Inclination     3.01554
		AscendingNode   158.916
		ArgOfPericenter -137.493
		MeanAnomaly     -170.462
	}
}

Asteroid	"S67"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.37483e-008
	Radius          16.1982
	InertiaMoment   0.39893

	RotationPeriod  1273.43
	Obliquity       0.487247
	EqAscendNode    7.57466

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.619 0.617 0.614)

	Surface
	{
		SurfStyle       0.821203
		OceanStyle      0.333895
		Randomize      (-0.562, 0.850, -0.224)
		colorDistMagn   0.84365
		colorDistFreq   0.196175
		detailScale     442.319
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0169702
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481145
		terraceProb     0.521205
		erosion         0
		montesMagn      0.522152
		montesFreq      2.88359
		montesSpiky     0.997256
		montesFraction  0.333542
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.588022
		hillsFraction   0.680871
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201572
		craterFreq      0.190209
		craterDensity   0.879928
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.6595
		volcanoTemp     1797.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.210, 0.172, 0.000)
		colorShelf     (0.248, 0.216, 0.197, 0.000)
		colorBeach     (0.291, 0.253, 0.233, 0.000)
		colorDesert    (0.316, 0.271, 0.227, 0.000)
		colorLowland   (0.347, 0.290, 0.258, 0.000)
		colorUpland    (0.384, 0.351, 0.313, 0.000)
		colorRock      (0.415, 0.382, 0.338, 0.000)
		colorSnow      (0.452, 0.407, 0.356, 1.000)
		BumpHeight      14.5784
		BumpOffset      2.91568
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0714957
		Period          0.0726364
		Eccentricity    0.0836286
		Inclination     0.487247
		AscendingNode   7.57466
		ArgOfPericenter -78.0152
		MeanAnomaly     27.7345
	}
}

Asteroid	"S68"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            8.05425e-017
	Radius          0.0332307
	InertiaMoment   0.399873

	RotationPeriod  2520.99
	Obliquity       -0.489273
	EqAscendNode    101.958

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.638 0.632 0.627)

	Surface
	{
		SurfStyle       0.835541
		OceanStyle      0.731359
		Randomize      (0.352, 0.412, 0.790)
		colorDistMagn   0.670108
		colorDistFreq   8.18757e-007
		detailScale     0.907419
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0107531
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.704527
		terraceProb     0.264239
		erosion         0
		montesMagn      0.324083
		montesFreq      2.66737
		montesSpiky     0.996059
		montesFraction  0.654921
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.61731e-006
		hillsFraction   0.763763
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278094
		craterFreq      0.186673
		craterDensity   0.907133
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   580.541
		volcanoTemp     1322.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.215, 0.176, 0.000)
		colorShelf     (0.255, 0.221, 0.201, 0.000)
		colorBeach     (0.300, 0.259, 0.238, 0.000)
		colorDesert    (0.325, 0.278, 0.232, 0.000)
		colorLowland   (0.357, 0.297, 0.263, 0.000)
		colorUpland    (0.395, 0.360, 0.320, 0.000)
		colorRock      (0.427, 0.392, 0.345, 0.000)
		colorSnow      (0.466, 0.417, 0.364, 1.000)
		BumpHeight      0.0299076
		BumpOffset      0.00598152
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0971412
		Period          0.115037
		Eccentricity    0.137065
		Inclination     -0.489273
		AscendingNode   101.958
		ArgOfPericenter -13.6584
		MeanAnomaly     21.6651
	}
}

Asteroid	"S69"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.18523e-013
	Radius          0.295717
	InertiaMoment   0.397953

	Obliquity       4.4057
	EqAscendNode    -131.108
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.665 0.662 0.660)

	Surface
	{
		SurfStyle       0.429807
		OceanStyle      0.957409
		Randomize      (0.199, -0.866, 0.612)
		colorDistMagn   0.287387
		colorDistFreq   5.24774e-005
		detailScale     8.07504
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0635486
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504423
		terraceProb     0.120908
		erosion         0
		montesMagn      0.571673
		montesFreq      3.06417
		montesSpiky     0.947777
		montesFraction  0.323061
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0002646
		hillsFraction   0.620444
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272933
		craterFreq      0.166071
		craterDensity   0.859466
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   134.673
		volcanoTemp     1354.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.265, 0.264, 0.000)
		colorShelf     (0.283, 0.282, 0.281, 0.000)
		colorBeach     (0.299, 0.298, 0.297, 0.000)
		colorDesert    (0.316, 0.315, 0.314, 0.000)
		colorLowland   (0.333, 0.331, 0.330, 0.000)
		colorUpland    (0.349, 0.348, 0.347, 0.000)
		colorRock      (0.366, 0.364, 0.363, 0.000)
		colorSnow      (0.383, 0.381, 0.380, 1.000)
		BumpHeight      0.266145
		BumpOffset      0.053229
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0732326
		Period          0.0752992
		Eccentricity    0.0618868
		Inclination     4.4057
		AscendingNode   -131.108
		ArgOfPericenter -150.773
		MeanAnomaly     28.0643
	}
}

Asteroid	"S70"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.74412e-010
	Radius          3.77806
	InertiaMoment   0.399128

	Obliquity       1.75259
	EqAscendNode    43.8356
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.610 0.604 0.602)

	Surface
	{
		SurfStyle       0.438244
		OceanStyle      0.376415
		Randomize      (0.599, 0.126, -0.622)
		colorDistMagn   0.43696
		colorDistFreq   0.00546821
		detailScale     103.166
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0567229
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.588898
		terraceProb     0.228669
		erosion         0
		montesMagn      0.369451
		montesFreq      2.71943
		montesSpiky     0.917686
		montesFraction  0.475283
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0373913
		hillsFraction   0.745409
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251742
		craterFreq      0.249108
		craterDensity   0.820561
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   44.8525
		volcanoTemp     1434.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.242, 0.241, 0.000)
		colorShelf     (0.259, 0.257, 0.256, 0.000)
		colorBeach     (0.275, 0.272, 0.271, 0.000)
		colorDesert    (0.290, 0.287, 0.286, 0.000)
		colorLowland   (0.305, 0.302, 0.301, 0.000)
		colorUpland    (0.321, 0.317, 0.316, 0.000)
		colorRock      (0.336, 0.332, 0.331, 0.000)
		colorSnow      (0.351, 0.347, 0.346, 1.000)
		BumpHeight      3.40026
		BumpOffset      0.680051
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0723907
		Period          0.0740045
		Eccentricity    0.0949571
		Inclination     1.75259
		AscendingNode   43.8356
		ArgOfPericenter 94.5314
		MeanAnomaly     -61.8758
	}
}

Asteroid	"S71"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.56657e-007
	Radius          42.9637
	InertiaMoment   0.395332

	Obliquity       0.216788
	EqAscendNode    119.969
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.675 0.672 0.668)

	Surface
	{
		SurfStyle       0.557742
		OceanStyle      0.489072
		Randomize      (0.427, 0.391, 0.157)
		colorDistMagn   0.894282
		colorDistFreq   1.39046
		detailScale     1173.2
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0037822
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.672683
		terraceProb     0.325232
		erosion         0
		montesMagn      0.554844
		montesFreq      3.29533
		montesSpiky     0.930195
		montesFraction  0.565176
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.94407
		hillsFraction   0.843885
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203097
		craterFreq      0.201885
		craterDensity   0.873336
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   13.2963
		volcanoTemp     1652.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.229, 0.187, 0.000)
		colorShelf     (0.270, 0.235, 0.214, 0.000)
		colorBeach     (0.317, 0.276, 0.254, 0.000)
		colorDesert    (0.344, 0.296, 0.247, 0.000)
		colorLowland   (0.378, 0.316, 0.280, 0.000)
		colorUpland    (0.419, 0.383, 0.341, 0.000)
		colorRock      (0.452, 0.417, 0.367, 0.000)
		colorSnow      (0.493, 0.444, 0.387, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0889434
		Period          0.100787
		Eccentricity    0.0922607
		Inclination     0.216788
		AscendingNode   119.969
		ArgOfPericenter -139.646
		MeanAnomaly     52.109
	}
}

Asteroid	"S72"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.50359e-015
	Radius          0.0689689
	InertiaMoment   0.398231

	Obliquity       2.044
	EqAscendNode    -27.2213
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.665 0.659 0.656)

	Surface
	{
		SurfStyle       0.984759
		OceanStyle      0.817279
		Randomize      (-0.554, -0.603, -0.666)
		colorDistMagn   0.987147
		colorDistFreq   2.89935e-006
		detailScale     1.88331
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0692891
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.667532
		terraceProb     0.304019
		erosion         0
		montesMagn      0.532327
		montesFreq      3.61244
		montesSpiky     0.907886
		montesFraction  0.574354
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.14357e-005
		hillsFraction   0.729366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237181
		craterFreq      0.232976
		craterDensity   1.02096
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   278.865
		volcanoTemp     1584.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.231, 0.262, 0.050)
		colorShelf     (0.266, 0.270, 0.302, 0.040)
		colorBeach     (0.306, 0.310, 0.341, 0.030)
		colorDesert    (0.346, 0.350, 0.387, 0.020)
		colorLowland   (0.386, 0.389, 0.426, 0.030)
		colorUpland    (0.426, 0.429, 0.466, 0.050)
		colorRock      (0.465, 0.468, 0.518, 0.020)
		colorSnow      (0.465, 0.468, 0.518, 1.000)
		BumpHeight      0.062072
		BumpOffset      0.0124144
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0742373
		Period          0.0768541
		Eccentricity    0.11747
		Inclination     2.044
		AscendingNode   -27.2213
		ArgOfPericenter 122.063
		MeanAnomaly     -32.2247
	}
}

Asteroid	"S73"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.21262e-012
	Radius          0.88115
	InertiaMoment   0.399318

	RotationPeriod  2629.53
	Obliquity       -4.69601
	EqAscendNode    51.2263

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.501 0.495 0.491)

	Surface
	{
		SurfStyle       0.534495
		OceanStyle      0.310125
		Randomize      (0.010, 0.845, 0.334)
		colorDistMagn   0.449861
		colorDistFreq   0.000335533
		detailScale     24.0613
		colorConversion true
		snowLevel       2
		tropicLatitude  0.147245
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453744
		terraceProb     0.102052
		erosion         0
		montesMagn      0.462268
		montesFreq      2.84001
		montesSpiky     0.922298
		montesFraction  0.704298
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00144658
		hillsFraction   0.59412
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224358
		craterFreq      0.227327
		craterDensity   0.74686
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   92.8758
		volcanoTemp     1661.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.168, 0.138, 0.000)
		colorShelf     (0.200, 0.173, 0.157, 0.000)
		colorBeach     (0.236, 0.203, 0.187, 0.000)
		colorDesert    (0.256, 0.218, 0.182, 0.000)
		colorLowland   (0.281, 0.233, 0.206, 0.000)
		colorUpland    (0.311, 0.282, 0.251, 0.000)
		colorRock      (0.336, 0.307, 0.270, 0.000)
		colorSnow      (0.366, 0.327, 0.285, 1.000)
		BumpHeight      0.793035
		BumpOffset      0.158607
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0999097
		Period          0.11999
		Eccentricity    0.0867499
		Inclination     -4.69601
		AscendingNode   51.2263
		ArgOfPericenter -82.1316
		MeanAnomaly     -111.673
	}
}

Asteroid	"S74"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            3.25598e-009
	Radius          11.4045
	InertiaMoment   0.396608

	RotationPeriod  2432.95
	Obliquity       1.65227
	EqAscendNode    162.654

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.576 0.570 0.567)

	Surface
	{
		SurfStyle       0.846969
		OceanStyle      0.727633
		Randomize      (-0.708, 0.753, 0.065)
		colorDistMagn   0.0325182
		colorDistFreq   0.00726517
		detailScale     311.418
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00869352
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.728424
		terraceProb     0.308948
		erosion         0
		montesMagn      0.519222
		montesFreq      2.57052
		montesSpiky     0.876468
		montesFraction  0.655543
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.28136
		hillsFraction   0.772825
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209358
		craterFreq      0.210434
		craterDensity   0.843193
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.3357
		volcanoTemp     1555.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.194, 0.159, 0.000)
		colorShelf     (0.230, 0.200, 0.181, 0.000)
		colorBeach     (0.271, 0.234, 0.215, 0.000)
		colorDesert    (0.294, 0.251, 0.210, 0.000)
		colorLowland   (0.322, 0.268, 0.238, 0.000)
		colorUpland    (0.357, 0.325, 0.289, 0.000)
		colorRock      (0.386, 0.353, 0.312, 0.000)
		colorSnow      (0.420, 0.376, 0.329, 1.000)
		BumpHeight      10.264
		BumpOffset      2.0528
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0840087
		Period          0.0925168
		Eccentricity    0.0720391
		Inclination     1.65227
		AscendingNode   162.654
		ArgOfPericenter 134.003
		MeanAnomaly     89.2356
	}
}

Asteroid	"S75"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.90747e-017
	Radius          0.0160853
	InertiaMoment   0.398478

	Obliquity       3.65593
	EqAscendNode    -57.0536
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.494 0.409 0.362)

	Surface
	{
		SurfStyle       0.937289
		OceanStyle      0.863135
		Randomize      (-0.993, -0.317, -0.107)
		colorDistMagn   0.474541
		colorDistFreq   1.0699e-007
		detailScale     0.439236
		colorConversion true
		snowLevel       2
		tropicLatitude  0.11187
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.46969
		terraceProb     0.532142
		erosion         0
		montesMagn      0.294426
		montesFreq      2.79737
		montesSpiky     0.906772
		montesFraction  0.451876
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.89976e-007
		hillsFraction   0.449996
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237099
		craterFreq      0.263543
		craterDensity   0.839494
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   577.438
		volcanoTemp     1153.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.143, 0.145, 0.050)
		colorShelf     (0.197, 0.168, 0.166, 0.040)
		colorBeach     (0.227, 0.192, 0.188, 0.030)
		colorDesert    (0.257, 0.217, 0.213, 0.020)
		colorLowland   (0.286, 0.241, 0.235, 0.030)
		colorUpland    (0.316, 0.266, 0.257, 0.050)
		colorRock      (0.345, 0.291, 0.286, 0.020)
		colorSnow      (0.345, 0.291, 0.286, 1.000)
		BumpHeight      0.0144768
		BumpOffset      0.00289535
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0758134
		Period          0.0793147
		Eccentricity    0.135818
		Inclination     3.65593
		AscendingNode   -57.0536
		ArgOfPericenter 164.215
		MeanAnomaly     90.5656
	}
}

Asteroid	"S76"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.80695e-014
	Radius          0.233853
	InertiaMoment   0.399502

	Obliquity       -0.615492
	EqAscendNode    22.4427
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.806 0.780 0.754)

	Surface
	{
		SurfStyle       0.936303
		OceanStyle      0.767344
		Randomize      (-0.799, -0.184, 0.483)
		colorDistMagn   0.356754
		colorDistFreq   3.30318e-005
		detailScale     6.38574
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0210714
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48461
		terraceProb     0.231773
		erosion         0
		montesMagn      0.502079
		montesFreq      2.74454
		montesSpiky     0.998536
		montesFraction  0.73433
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.44667e-005
		hillsFraction   0.696454
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247117
		craterFreq      0.218112
		craterDensity   0.714065
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   218.842
		volcanoTemp     1487.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.273, 0.301, 0.050)
		colorShelf     (0.322, 0.320, 0.347, 0.040)
		colorBeach     (0.371, 0.367, 0.392, 0.030)
		colorDesert    (0.419, 0.413, 0.445, 0.020)
		colorLowland   (0.467, 0.460, 0.490, 0.030)
		colorUpland    (0.516, 0.507, 0.535, 0.050)
		colorRock      (0.564, 0.554, 0.595, 0.020)
		colorSnow      (0.564, 0.554, 0.595, 1.000)
		BumpHeight      0.210468
		BumpOffset      0.0420935
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.100239
		Period          0.120584
		Eccentricity    0.131032
		Inclination     -0.615492
		AscendingNode   22.4427
		ArgOfPericenter 12.2971
		MeanAnomaly     -139.61
	}
}

Asteroid	"S77"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            4.13057e-011
	Radius          2.33749
	InertiaMoment   0.397191

	RotationPeriod  1718.34
	Obliquity       -0.768006
	EqAscendNode    -131.067

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.701 0.659 0.633)

	Surface
	{
		SurfStyle       0.0905581
		OceanStyle      0.374578
		Randomize      (0.427, -0.017, -0.771)
		colorDistMagn   0.597658
		colorDistFreq   0.00201596
		detailScale     63.8289
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0111022
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.500514
		terraceProb     0.307562
		erosion         0
		montesMagn      0.451657
		montesFreq      3.29975
		montesSpiky     0.976693
		montesFraction  0.495831
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0155776
		hillsFraction   0.577289
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.270465
		craterFreq      0.199118
		craterDensity   0.81053
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.023
		volcanoTemp     1270.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.264, 0.253, 0.000)
		colorShelf     (0.298, 0.280, 0.269, 0.000)
		colorBeach     (0.315, 0.297, 0.285, 0.000)
		colorDesert    (0.333, 0.313, 0.300, 0.000)
		colorLowland   (0.350, 0.330, 0.316, 0.000)
		colorUpland    (0.368, 0.346, 0.332, 0.000)
		colorRock      (0.385, 0.363, 0.348, 0.000)
		colorSnow      (0.403, 0.379, 0.364, 1.000)
		BumpHeight      2.10374
		BumpOffset      0.420747
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.105761
		Period          0.130685
		Eccentricity    0.151106
		Inclination     -0.768006
		AscendingNode   -131.067
		ArgOfPericenter -154.005
		MeanAnomaly     -24.0286
	}
}

Asteroid	"S78"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            6.07836e-008
	Radius          30.2509
	InertiaMoment   0.398704

	Obliquity       -2.53687
	EqAscendNode    45.07
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.429 0.420 0.416)

	Surface
	{
		SurfStyle       0.173692
		OceanStyle      0.643958
		Randomize      (-0.158, -0.590, 0.223)
		colorDistMagn   0.599685
		colorDistFreq   0.671485
		detailScale     826.05
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0816972
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.419444
		terraceProb     0.281704
		erosion         0
		montesMagn      0.571521
		montesFreq      3.44662
		montesSpiky     0.910064
		montesFraction  0.617944
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.15587
		hillsFraction   0.6923
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223852
		craterFreq      0.181905
		craterDensity   0.783144
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   19.2376
		volcanoTemp     1275.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.168, 0.166, 0.000)
		colorShelf     (0.182, 0.179, 0.177, 0.000)
		colorBeach     (0.193, 0.189, 0.187, 0.000)
		colorDesert    (0.204, 0.200, 0.198, 0.000)
		colorLowland   (0.214, 0.210, 0.208, 0.000)
		colorUpland    (0.225, 0.221, 0.219, 0.000)
		colorRock      (0.236, 0.231, 0.229, 0.000)
		colorSnow      (0.246, 0.242, 0.239, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0842718
		Period          0.0929517
		Eccentricity    0.111346
		Inclination     -2.53687
		AscendingNode   45.07
		ArgOfPericenter -135.062
		MeanAnomaly     -99.7774
	}
}

Asteroid	"S79"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            3.56092e-016
	Radius          0.0479295
	InertiaMoment   0.399682

	Obliquity       2.20629
	EqAscendNode    -177.598
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.414 0.411 0.409)

	Surface
	{
		SurfStyle       0.220275
		OceanStyle      0.832794
		Randomize      (0.925, -0.943, 0.642)
		colorDistMagn   0.405309
		colorDistFreq   1.50746e-006
		detailScale     1.30879
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00161945
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610508
		terraceProb     0.226333
		erosion         0
		montesMagn      0.444183
		montesFreq      2.69556
		montesSpiky     0.962597
		montesFraction  0.407867
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.46668e-006
		hillsFraction   0.591578
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259658
		craterFreq      0.243581
		craterDensity   0.819537
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   398.224
		volcanoTemp     1637.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.165, 0.163, 0.000)
		colorShelf     (0.176, 0.175, 0.174, 0.000)
		colorBeach     (0.186, 0.185, 0.184, 0.000)
		colorDesert    (0.197, 0.195, 0.194, 0.000)
		colorLowland   (0.207, 0.206, 0.204, 0.000)
		colorUpland    (0.217, 0.216, 0.215, 0.000)
		colorRock      (0.228, 0.226, 0.225, 0.000)
		colorSnow      (0.238, 0.237, 0.235, 1.000)
		BumpHeight      0.0431365
		BumpOffset      0.00862731
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0766297
		Period          0.080599
		Eccentricity    0.145023
		Inclination     2.20629
		AscendingNode   -177.598
		ArgOfPericenter 161.658
		MeanAnomaly     -155.76
	}
}

Asteroid	"S80"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            5.24008e-013
	Radius          0.62036
	InertiaMoment   0.397601

	RotationPeriod  6732.43
	Obliquity       -1.27194
	EqAscendNode    82.8822

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.506 0.500 0.495)

	Surface
	{
		SurfStyle       0.387264
		OceanStyle      0.133378
		Randomize      (0.991, -0.391, 0.080)
		colorDistMagn   0.942758
		colorDistFreq   0.00011088
		detailScale     16.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0332756
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.409544
		terraceProb     0.331574
		erosion         0
		montesMagn      0.543435
		montesFreq      3.71097
		montesSpiky     0.965167
		montesFraction  0.635182
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00101822
		hillsFraction   0.547871
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238376
		craterFreq      0.209542
		craterDensity   0.90034
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   134.363
		volcanoTemp     1500.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.200, 0.198, 0.000)
		colorShelf     (0.215, 0.212, 0.210, 0.000)
		colorBeach     (0.228, 0.225, 0.223, 0.000)
		colorDesert    (0.240, 0.237, 0.235, 0.000)
		colorLowland   (0.253, 0.250, 0.247, 0.000)
		colorUpland    (0.266, 0.262, 0.260, 0.000)
		colorRock      (0.278, 0.275, 0.272, 0.000)
		colorSnow      (0.291, 0.287, 0.285, 1.000)
		BumpHeight      0.558324
		BumpOffset      0.111665
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.104311
		Period          0.128006
		Eccentricity    0.114351
		Inclination     -1.27194
		AscendingNode   82.8822
		ArgOfPericenter 101.739
		MeanAnomaly     3.10468
	}
}

Asteroid	"S81"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            7.71106e-010
	Radius          6.20074
	InertiaMoment   0.398914

	Obliquity       3.70475
	EqAscendNode    -173.634
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.713 0.712 0.710)

	Surface
	{
		SurfStyle       0.261308
		OceanStyle      0.385033
		Randomize      (-0.280, -0.919, 0.839)
		colorDistMagn   0.651371
		colorDistFreq   0.0177047
		detailScale     169.321
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00717619
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.475926
		terraceProb     0.459339
		erosion         0
		montesMagn      0.428434
		montesFreq      3.98986
		montesSpiky     0.948166
		montesFraction  0.360052
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.106561
		hillsFraction   0.47408
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240903
		craterFreq      0.187128
		craterDensity   0.892263
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.01
		volcanoTemp     1838.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.285, 0.284, 0.000)
		colorShelf     (0.303, 0.303, 0.302, 0.000)
		colorBeach     (0.321, 0.320, 0.320, 0.000)
		colorDesert    (0.339, 0.338, 0.337, 0.000)
		colorLowland   (0.357, 0.356, 0.355, 0.000)
		colorUpland    (0.374, 0.374, 0.373, 0.000)
		colorRock      (0.392, 0.392, 0.391, 0.000)
		colorSnow      (0.410, 0.409, 0.408, 1.000)
		BumpHeight      5.58066
		BumpOffset      1.11613
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0951457
		Period          0.111511
		Eccentricity    0.0490934
		Inclination     3.70475
		AscendingNode   -173.634
		ArgOfPericenter -51.9875
		MeanAnomaly     35.3637
	}
}

Asteroid	"S82"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            4.51742e-018
	Radius          0.0127202
	InertiaMoment   0.399859

	RotationPeriod  3600.71
	Obliquity       2.11067
	EqAscendNode    -105.894

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.768 0.764 0.762)

	Surface
	{
		SurfStyle       0.0397708
		OceanStyle      0.722932
		Randomize      (0.544, -0.573, -0.461)
		colorDistMagn   0.974274
		colorDistFreq   1.41675e-007
		detailScale     0.347347
		colorConversion true
		snowLevel       2
		tropicLatitude  0.044373
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381067
		terraceProb     0.275787
		erosion         0
		montesMagn      0.477699
		montesFreq      2.93373
		montesSpiky     0.91712
		montesFraction  0.666165
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.11512e-007
		hillsFraction   0.525003
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259115
		craterFreq      0.271329
		craterDensity   0.989203
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   938.329
		volcanoTemp     1602.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.305, 0.305, 0.000)
		colorShelf     (0.326, 0.325, 0.324, 0.000)
		colorBeach     (0.346, 0.344, 0.343, 0.000)
		colorDesert    (0.365, 0.363, 0.362, 0.000)
		colorLowland   (0.384, 0.382, 0.381, 0.000)
		colorUpland    (0.403, 0.401, 0.400, 0.000)
		colorRock      (0.422, 0.420, 0.419, 0.000)
		colorSnow      (0.442, 0.439, 0.438, 1.000)
		BumpHeight      0.0114482
		BumpOffset      0.00228964
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.109101
		Period          0.136923
		Eccentricity    0.140653
		Inclination     2.11067
		AscendingNode   -105.894
		ArgOfPericenter 143.752
		MeanAnomaly     7.42421
	}
}

Asteroid	"S83"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            6.64763e-015
	Radius          0.127146
	InertiaMoment   0.39793

	RotationPeriod  3654.77
	Obliquity       0.208666
	EqAscendNode    114.251

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.680 0.502 0.419)

	Surface
	{
		SurfStyle       0.203681
		OceanStyle      0.357315
		Randomize      (-0.414, 0.021, 0.193)
		colorDistMagn   0.883176
		colorDistFreq   3.23773e-006
		detailScale     3.47194
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00395175
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.387236
		terraceProb     0.410616
		erosion         0
		montesMagn      0.380891
		montesFreq      3.51588
		montesSpiky     0.822042
		montesFraction  0.577435
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.4724e-005
		hillsFraction   0.613299
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227242
		craterFreq      0.200916
		craterDensity   0.85231
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   244.499
		volcanoTemp     1664.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.201, 0.168, 0.000)
		colorShelf     (0.289, 0.213, 0.178, 0.000)
		colorBeach     (0.306, 0.226, 0.189, 0.000)
		colorDesert    (0.323, 0.239, 0.199, 0.000)
		colorLowland   (0.340, 0.251, 0.210, 0.000)
		colorUpland    (0.357, 0.264, 0.220, 0.000)
		colorRock      (0.374, 0.276, 0.231, 0.000)
		colorSnow      (0.391, 0.289, 0.241, 1.000)
		BumpHeight      0.114432
		BumpOffset      0.0228864
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0909598
		Period          0.104234
		Eccentricity    0.0867214
		Inclination     0.208666
		AscendingNode   114.251
		ArgOfPericenter 105.828
		MeanAnomaly     144.927
	}
}

Asteroid	"S84"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            9.78232e-012
	Radius          1.64567
	InertiaMoment   0.399113

	Obliquity       -5.28905
	EqAscendNode    -137.34
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.721 0.685 0.656)

	Surface
	{
		SurfStyle       0.509011
		OceanStyle      0.216798
		Randomize      (-0.563, -0.346, -0.116)
		colorDistMagn   0.695414
		colorDistFreq   0.000553957
		detailScale     44.9378
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0670215
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.682427
		terraceProb     0.662538
		erosion         0
		montesMagn      0.521202
		montesFreq      2.77368
		montesSpiky     0.796072
		montesFraction  0.284874
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00743309
		hillsFraction   0.539251
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246976
		craterFreq      0.26082
		craterDensity   1.00453
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   82.4952
		volcanoTemp     1803.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.233, 0.184, 0.000)
		colorShelf     (0.288, 0.240, 0.210, 0.000)
		colorBeach     (0.339, 0.281, 0.249, 0.000)
		colorDesert    (0.368, 0.301, 0.243, 0.000)
		colorLowland   (0.404, 0.322, 0.275, 0.000)
		colorUpland    (0.447, 0.390, 0.334, 0.000)
		colorRock      (0.483, 0.425, 0.361, 0.000)
		colorSnow      (0.526, 0.452, 0.380, 1.000)
		BumpHeight      1.48111
		BumpOffset      0.296221
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.101115
		Period          0.122169
		Eccentricity    0.0897054
		Inclination     -5.28905
		AscendingNode   -137.34
		ArgOfPericenter -139.041
		MeanAnomaly     145.646
	}
}

Asteroid	"S85"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.43952e-008
	Radius          14.6437
	InertiaMoment   0.395094

	Obliquity       2.4503
	EqAscendNode    29.6393
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.532 0.527 0.521)

	Surface
	{
		SurfStyle       0.196588
		OceanStyle      0.929946
		Randomize      (-0.341, 0.277, 0.503)
		colorDistMagn   0.498879
		colorDistFreq   0.119172
		detailScale     399.871
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0825911
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.698791
		terraceProb     0.578431
		erosion         0
		montesMagn      0.48225
		montesFreq      2.14118
		montesSpiky     0.874462
		montesFraction  0.181429
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.398426
		hillsFraction   0.684453
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221421
		craterFreq      0.278007
		craterDensity   0.866992
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   19.1359
		volcanoTemp     1544.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.211, 0.208, 0.000)
		colorShelf     (0.226, 0.224, 0.221, 0.000)
		colorBeach     (0.240, 0.237, 0.234, 0.000)
		colorDesert    (0.253, 0.250, 0.247, 0.000)
		colorLowland   (0.266, 0.264, 0.260, 0.000)
		colorUpland    (0.280, 0.277, 0.273, 0.000)
		colorRock      (0.293, 0.290, 0.286, 0.000)
		colorSnow      (0.306, 0.303, 0.299, 1.000)
		BumpHeight      13.1793
		BumpOffset      2.63587
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0760921
		Period          0.0797523
		Eccentricity    0.138982
		Inclination     2.4503
		AscendingNode   29.6393
		ArgOfPericenter 168.081
		MeanAnomaly     -49.8894
	}
}

Asteroid	"S86"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            8.43325e-017
	Radius          0.0364983
	InertiaMoment   0.398211

	Obliquity       0.414824
	EqAscendNode    85.1144
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.512 0.507 0.499)

	Surface
	{
		SurfStyle       0.00486
		OceanStyle      0.82832
		Randomize      (-0.916, 0.109, -0.691)
		colorDistMagn   0.441652
		colorDistFreq   2.64102e-007
		detailScale     0.996647
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0106641
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.559034
		terraceProb     0.520551
		erosion         0
		montesMagn      0.50099
		montesFreq      2.90851
		montesSpiky     0.981858
		montesFraction  0.444089
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.41842e-006
		hillsFraction   0.702929
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239749
		craterFreq      0.208556
		craterDensity   0.78568
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   623.134
		volcanoTemp     1305.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.203, 0.199, 0.000)
		colorShelf     (0.217, 0.215, 0.212, 0.000)
		colorBeach     (0.230, 0.228, 0.224, 0.000)
		colorDesert    (0.243, 0.241, 0.237, 0.000)
		colorLowland   (0.256, 0.253, 0.249, 0.000)
		colorUpland    (0.269, 0.266, 0.262, 0.000)
		colorRock      (0.281, 0.279, 0.274, 0.000)
		colorSnow      (0.294, 0.291, 0.287, 1.000)
		BumpHeight      0.0328485
		BumpOffset      0.0065697
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.105933
		Period          0.131003
		Eccentricity    0.0289013
		Inclination     0.414824
		AscendingNode   85.1144
		ArgOfPericenter 87.5506
		MeanAnomaly     -15.9827
	}
}

Asteroid	"S87"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.241e-013
	Radius          0.383814
	InertiaMoment   0.399304

	RotationPeriod  1330.06
	Obliquity       6.1225
	EqAscendNode    99.4005

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.553 0.548 0.545)

	Surface
	{
		SurfStyle       0.719878
		OceanStyle      0.18219
		Randomize      (0.115, -0.257, 0.765)
		colorDistMagn   0.500272
		colorDistFreq   7.47624e-005
		detailScale     10.4807
		colorConversion true
		snowLevel       2
		tropicLatitude  0.137637
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.662033
		terraceProb     0.375797
		erosion         0
		montesMagn      0.669901
		montesFreq      3.43787
		montesSpiky     0.991022
		montesFraction  0.676888
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000307684
		hillsFraction   0.745246
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239421
		craterFreq      0.201454
		craterDensity   0.883513
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   170.821
		volcanoTemp     1773.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.186, 0.153, 0.000)
		colorShelf     (0.221, 0.192, 0.175, 0.000)
		colorBeach     (0.260, 0.225, 0.207, 0.000)
		colorDesert    (0.282, 0.241, 0.202, 0.000)
		colorLowland   (0.310, 0.258, 0.229, 0.000)
		colorUpland    (0.343, 0.312, 0.278, 0.000)
		colorRock      (0.371, 0.340, 0.300, 0.000)
		colorSnow      (0.404, 0.362, 0.316, 1.000)
		BumpHeight      0.345433
		BumpOffset      0.0690865
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0735999
		Period          0.0758665
		Eccentricity    0.109827
		Inclination     6.1225
		AscendingNode   99.4005
		ArgOfPericenter -131.325
		MeanAnomaly     8.35079
	}
}

Asteroid	"S88"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.82619e-010
	Radius          3.41548
	InertiaMoment   0.396549

	RotationPeriod  2210.52
	Obliquity       -3.43698
	EqAscendNode    75.9909

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.668 0.666 0.665)

	Surface
	{
		SurfStyle       0.668446
		OceanStyle      0.788642
		Randomize      (0.536, -0.559, 0.487)
		colorDistMagn   0.274786
		colorDistFreq   0.00419003
		detailScale     93.2655
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0943842
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.425811
		terraceProb     0.254563
		erosion         0
		montesMagn      0.52373
		montesFreq      3.35847
		montesSpiky     0.855492
		montesFraction  0.598744
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0312356
		hillsFraction   0.808026
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209012
		craterFreq      0.234768
		craterDensity   0.913977
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   39.6265
		volcanoTemp     1654.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.227, 0.186, 0.000)
		colorShelf     (0.267, 0.233, 0.213, 0.000)
		colorBeach     (0.314, 0.273, 0.253, 0.000)
		colorDesert    (0.341, 0.293, 0.246, 0.000)
		colorLowland   (0.374, 0.313, 0.279, 0.000)
		colorUpland    (0.414, 0.380, 0.339, 0.000)
		colorRock      (0.448, 0.413, 0.366, 0.000)
		colorSnow      (0.488, 0.440, 0.385, 1.000)
		BumpHeight      3.07394
		BumpOffset      0.614787
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.078807
		Period          0.0840584
		Eccentricity    0.141026
		Inclination     -3.43698
		AscendingNode   75.9909
		ArgOfPericenter 108.543
		MeanAnomaly     149.709
	}
}

Asteroid	"S89"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.68734e-007
	Radius          49.6447
	InertiaMoment   0.39846

	RotationPeriod  5123.35
	Obliquity       -3.18627
	EqAscendNode    144.5

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.665 0.572 0.516)

	Surface
	{
		SurfStyle       0.793818
		OceanStyle      0.314328
		Randomize      (0.695, -0.214, 0.969)
		colorDistMagn   0.773685
		colorDistFreq   1.15106
		detailScale     1355.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0338841
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504581
		terraceProb     0.24336
		erosion         0
		montesMagn      0.57132
		montesFreq      3.98442
		montesSpiky     0.991319
		montesFraction  0.388019
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.42252
		hillsFraction   0.726078
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245498
		craterFreq      0.261296
		craterDensity   0.793026
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   15.0147
		volcanoTemp     1758.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.194, 0.144, 0.000)
		colorShelf     (0.266, 0.200, 0.165, 0.000)
		colorBeach     (0.313, 0.234, 0.196, 0.000)
		colorDesert    (0.339, 0.252, 0.191, 0.000)
		colorLowland   (0.373, 0.269, 0.217, 0.000)
		colorUpland    (0.412, 0.326, 0.263, 0.000)
		colorRock      (0.446, 0.355, 0.284, 0.000)
		colorSnow      (0.486, 0.377, 0.299, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.113932
		Period          0.146118
		Eccentricity    0.139181
		Inclination     -3.18627
		AscendingNode   144.5
		ArgOfPericenter 107.168
		MeanAnomaly     -103.416
	}
}

Asteroid	"S90"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.57434e-015
	Radius          0.0895153
	InertiaMoment   0.399488

	RotationPeriod  5872.76
	Obliquity       5.47549
	EqAscendNode    98.4074

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.789 0.706 0.632)

	Surface
	{
		SurfStyle       0.52498
		OceanStyle      0.638756
		Randomize      (0.197, -0.373, 0.667)
		colorDistMagn   0.910025
		colorDistFreq   1.93747e-006
		detailScale     2.44436
		colorConversion true
		snowLevel       2
		tropicLatitude  0.124447
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571773
		terraceProb     0.19662
		erosion         0
		montesMagn      0.535561
		montesFreq      2.88397
		montesSpiky     0.916036
		montesFraction  0.365947
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.81205e-005
		hillsFraction   0.632827
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252551
		craterFreq      0.220386
		craterDensity   0.879404
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   353.715
		volcanoTemp     1408.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.240, 0.177, 0.000)
		colorShelf     (0.316, 0.247, 0.202, 0.000)
		colorBeach     (0.371, 0.289, 0.240, 0.000)
		colorDesert    (0.402, 0.311, 0.234, 0.000)
		colorLowland   (0.442, 0.332, 0.265, 0.000)
		colorUpland    (0.489, 0.402, 0.322, 0.000)
		colorRock      (0.529, 0.438, 0.347, 0.000)
		colorSnow      (0.576, 0.466, 0.366, 1.000)
		BumpHeight      0.0805638
		BumpOffset      0.0161128
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.107539
		Period          0.133993
		Eccentricity    0.114134
		Inclination     5.47549
		AscendingNode   98.4074
		ArgOfPericenter 148.082
		MeanAnomaly     -126.314
	}
}

Asteroid	"S91"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.31672e-012
	Radius          0.796587
	InertiaMoment   0.397154

	Obliquity       -3.98609
	EqAscendNode    170.001
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.415 0.411 0.405)

	Surface
	{
		SurfStyle       0.74191
		OceanStyle      0.426606
		Randomize      (0.658, 0.618, 0.236)
		colorDistMagn   0.848837
		colorDistFreq   0.000200285
		detailScale     21.7521
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0121137
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.673985
		terraceProb     0.265432
		erosion         0
		montesMagn      0.429745
		montesFreq      3.63934
		montesSpiky     0.904316
		montesFraction  0.557966
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00145048
		hillsFraction   0.552328
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2453
		craterFreq      0.193372
		craterDensity   0.777457
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   82.0544
		volcanoTemp     1476.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.140, 0.113, 0.000)
		colorShelf     (0.166, 0.144, 0.129, 0.000)
		colorBeach     (0.195, 0.169, 0.154, 0.000)
		colorDesert    (0.211, 0.181, 0.150, 0.000)
		colorLowland   (0.232, 0.193, 0.170, 0.000)
		colorUpland    (0.257, 0.234, 0.206, 0.000)
		colorRock      (0.278, 0.255, 0.223, 0.000)
		colorSnow      (0.303, 0.271, 0.235, 1.000)
		BumpHeight      0.716928
		BumpOffset      0.143386
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0699079
		Period          0.0702301
		Eccentricity    0.0628146
		Inclination     -3.98609
		AscendingNode   170.001
		ArgOfPericenter -161.356
		MeanAnomaly     -175.342
	}
}

Asteroid	"S92"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            3.40918e-009
	Radius          11.5806
	InertiaMoment   0.398687

	Obliquity       -3.60253
	EqAscendNode    133.831
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.791 0.790 0.786)

	Surface
	{
		SurfStyle       0.814288
		OceanStyle      0.955113
		Randomize      (-0.815, -0.255, 0.266)
		colorDistMagn   0.757748
		colorDistFreq   0.0708145
		detailScale     316.227
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0492579
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.471721
		terraceProb     0.242684
		erosion         0
		montesMagn      0.541603
		montesFreq      3.30019
		montesSpiky     0.965778
		montesFraction  0.665069
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.362941
		hillsFraction   0.683112
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211837
		craterFreq      0.208277
		craterDensity   0.948298
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.0965
		volcanoTemp     1401.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.268, 0.220, 0.000)
		colorShelf     (0.317, 0.276, 0.252, 0.000)
		colorBeach     (0.372, 0.324, 0.299, 0.000)
		colorDesert    (0.404, 0.347, 0.291, 0.000)
		colorLowland   (0.443, 0.371, 0.330, 0.000)
		colorUpland    (0.491, 0.450, 0.401, 0.000)
		colorRock      (0.530, 0.489, 0.433, 0.000)
		colorSnow      (0.578, 0.521, 0.456, 1.000)
		BumpHeight      10.4225
		BumpOffset      2.0845
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0802265
		Period          0.0863397
		Eccentricity    0.0447147
		Inclination     -3.60253
		AscendingNode   133.831
		ArgOfPericenter -178.927
		MeanAnomaly     161.552
	}
}

Asteroid	"S93"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            1.99722e-017
	Radius          0.0183467
	InertiaMoment   0.399668

	Obliquity       -0.436447
	EqAscendNode    -77.3104
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.670 0.667 0.662)

	Surface
	{
		SurfStyle       0.2608
		OceanStyle      0.844965
		Randomize      (0.194, -0.789, -0.116)
		colorDistMagn   0.782606
		colorDistFreq   2.52831e-007
		detailScale     0.500986
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0118952
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.573086
		terraceProb     0.349103
		erosion         0
		montesMagn      0.44844
		montesFreq      2.37839
		montesSpiky     0.911765
		montesFraction  0.401124
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.22e-007
		hillsFraction   0.616853
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.281489
		craterFreq      0.210778
		craterDensity   0.799927
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   643.65
		volcanoTemp     1774.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.267, 0.265, 0.000)
		colorShelf     (0.285, 0.283, 0.281, 0.000)
		colorBeach     (0.301, 0.300, 0.298, 0.000)
		colorDesert    (0.318, 0.317, 0.315, 0.000)
		colorLowland   (0.335, 0.334, 0.331, 0.000)
		colorUpland    (0.352, 0.350, 0.348, 0.000)
		colorRock      (0.368, 0.367, 0.364, 0.000)
		colorSnow      (0.385, 0.384, 0.381, 1.000)
		BumpHeight      0.016512
		BumpOffset      0.0033024
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0860183
		Period          0.0958563
		Eccentricity    0.129832
		Inclination     -0.436447
		AscendingNode   -77.3104
		ArgOfPericenter 159.974
		MeanAnomaly     -95.6422
	}
}

Asteroid	"S94"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            2.93902e-014
	Radius          0.256847
	InertiaMoment   0.397573

	Obliquity       3.41348
	EqAscendNode    -105.098
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.532 0.477 0.408)

	Surface
	{
		SurfStyle       0.364688
		OceanStyle      0.599708
		Randomize      (0.960, 0.358, -0.265)
		colorDistMagn   0.684321
		colorDistFreq   2.7061e-005
		detailScale     7.01363
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0723648
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.559101
		terraceProb     0.344798
		erosion         0
		montesMagn      0.535365
		montesFreq      3.28827
		montesSpiky     0.95266
		montesFraction  0.448743
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000221754
		hillsFraction   0.670318
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268987
		craterFreq      0.203581
		craterDensity   0.932073
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   234.898
		volcanoTemp     1527.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.191, 0.163, 0.000)
		colorShelf     (0.226, 0.203, 0.174, 0.000)
		colorBeach     (0.239, 0.214, 0.184, 0.000)
		colorDesert    (0.253, 0.226, 0.194, 0.000)
		colorLowland   (0.266, 0.238, 0.204, 0.000)
		colorUpland    (0.279, 0.250, 0.214, 0.000)
		colorRock      (0.293, 0.262, 0.225, 0.000)
		colorSnow      (0.306, 0.274, 0.235, 1.000)
		BumpHeight      0.231162
		BumpOffset      0.0462325
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.111269
		Period          0.141025
		Eccentricity    0.0160145
		Inclination     3.41348
		AscendingNode   -105.098
		ArgOfPericenter 98.2303
		MeanAnomaly     -65.5127
	}
}

Asteroid	"S95"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            4.32493e-011
	Radius          2.37359
	InertiaMoment   0.398898

	RotationPeriod  2475.48
	Obliquity       -2.71019
	EqAscendNode    -76.1282

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.773 0.771 0.769)

	Surface
	{
		SurfStyle       0.798353
		OceanStyle      0.695314
		Randomize      (0.694, 0.052, -0.650)
		colorDistMagn   0.706612
		colorDistFreq   0.00480205
		detailScale     64.8148
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0744037
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.500537
		terraceProb     0.242814
		erosion         0
		montesMagn      0.66075
		montesFreq      2.22368
		montesSpiky     0.956916
		montesFraction  0.397865
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0156432
		hillsFraction   0.654663
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265575
		craterFreq      0.268777
		craterDensity   0.95191
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   56.5877
		volcanoTemp     1715.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.262, 0.215, 0.000)
		colorShelf     (0.309, 0.270, 0.246, 0.000)
		colorBeach     (0.363, 0.316, 0.292, 0.000)
		colorDesert    (0.394, 0.339, 0.285, 0.000)
		colorLowland   (0.433, 0.362, 0.323, 0.000)
		colorUpland    (0.479, 0.439, 0.392, 0.000)
		colorRock      (0.518, 0.478, 0.423, 0.000)
		colorSnow      (0.564, 0.509, 0.446, 1.000)
		BumpHeight      2.13623
		BumpOffset      0.427246
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0701535
		Period          0.0706006
		Eccentricity    0.0660963
		Inclination     -2.71019
		AscendingNode   -76.1282
		ArgOfPericenter -33.313
		MeanAnomaly     128.018
	}
}

Asteroid	"S96"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            6.36435e-008
	Radius          33.2254
	InertiaMoment   0.399846

	Obliquity       1.82485
	EqAscendNode    131.417
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.477 0.472 0.471)

	Surface
	{
		SurfStyle       0.169036
		OceanStyle      0.496748
		Randomize      (0.236, 0.334, 0.763)
		colorDistMagn   0.0585141
		colorDistFreq   0.79229
		detailScale     907.275
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0261971
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.41909
		terraceProb     0.227348
		erosion         0
		montesMagn      0.480884
		montesFreq      3.0976
		montesSpiky     0.876411
		montesFraction  0.363318
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.23005
		hillsFraction   0.548654
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239729
		craterFreq      0.188232
		craterDensity   0.871448
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   20.649
		volcanoTemp     1349.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.189, 0.188, 0.000)
		colorShelf     (0.203, 0.201, 0.200, 0.000)
		colorBeach     (0.214, 0.212, 0.212, 0.000)
		colorDesert    (0.226, 0.224, 0.224, 0.000)
		colorLowland   (0.238, 0.236, 0.235, 0.000)
		colorUpland    (0.250, 0.248, 0.247, 0.000)
		colorRock      (0.262, 0.260, 0.259, 0.000)
		colorSnow      (0.274, 0.272, 0.271, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.103248
		Period          0.126055
		Eccentricity    0.0326166
		Inclination     1.82485
		AscendingNode   131.417
		ArgOfPericenter -177.149
		MeanAnomaly     -29.2732
	}
}

Asteroid	"S97"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            3.72846e-016
	Radius          0.0433297
	InertiaMoment   0.397907

	RotationPeriod  1290.15
	Obliquity       -4.462
	EqAscendNode    -1.35475

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.532 0.524 0.518)

	Surface
	{
		SurfStyle       0.308408
		OceanStyle      0.804111
		Randomize      (0.781, -0.898, -0.537)
		colorDistMagn   0.109771
		colorDistFreq   1.48719e-006
		detailScale     1.18319
		colorConversion true
		snowLevel       2
		tropicLatitude  0.155113
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.403243
		terraceProb     0.398548
		erosion         0
		montesMagn      0.545371
		montesFreq      3.36288
		montesSpiky     0.993252
		montesFraction  0.340033
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.48586e-006
		hillsFraction   0.70763
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225196
		craterFreq      0.190872
		craterDensity   0.880976
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   351.825
		volcanoTemp     1583.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.209, 0.207, 0.000)
		colorShelf     (0.226, 0.223, 0.220, 0.000)
		colorBeach     (0.239, 0.236, 0.233, 0.000)
		colorDesert    (0.252, 0.249, 0.246, 0.000)
		colorLowland   (0.266, 0.262, 0.259, 0.000)
		colorUpland    (0.279, 0.275, 0.272, 0.000)
		colorRock      (0.292, 0.288, 0.285, 0.000)
		colorSnow      (0.306, 0.301, 0.298, 1.000)
		BumpHeight      0.0389968
		BumpOffset      0.00779935
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0721201
		Period          0.07359
		Eccentricity    0.0915625
		Inclination     -4.462
		AscendingNode   -1.35475
		ArgOfPericenter 111.128
		MeanAnomaly     10.4346
	}
}

Asteroid	"S98"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            5.48663e-013
	Radius          0.62994
	InertiaMoment   0.399098

	RotationPeriod  694.714
	Obliquity       -4.84554
	EqAscendNode    -5.8565

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.794 0.790 0.788)

	Surface
	{
		SurfStyle       0.728975
		OceanStyle      0.731889
		Randomize      (0.155, -0.035, 0.338)
		colorDistMagn   0.774284
		colorDistFreq   0.00026163
		detailScale     17.2016
		colorConversion true
		snowLevel       2
		tropicLatitude  0.168118
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535668
		terraceProb     0.11899
		erosion         0
		montesMagn      0.500319
		montesFreq      3.37736
		montesSpiky     0.909959
		montesFraction  0.350558
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000681871
		hillsFraction   0.702372
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.279829
		craterFreq      0.243681
		craterDensity   0.93642
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   133.337
		volcanoTemp     1257.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.269, 0.221, 0.000)
		colorShelf     (0.317, 0.277, 0.252, 0.000)
		colorBeach     (0.373, 0.324, 0.299, 0.000)
		colorDesert    (0.405, 0.348, 0.291, 0.000)
		colorLowland   (0.444, 0.371, 0.331, 0.000)
		colorUpland    (0.492, 0.451, 0.402, 0.000)
		colorRock      (0.532, 0.490, 0.433, 0.000)
		colorSnow      (0.579, 0.522, 0.457, 1.000)
		BumpHeight      0.566946
		BumpOffset      0.113389
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.099292
		Period          0.118879
		Eccentricity    0.111532
		Inclination     -4.84554
		AscendingNode   -5.8565
		ArgOfPericenter -132.083
		MeanAnomaly     117.284
	}
}

Asteroid	"S99"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            8.07389e-010
	Radius          7.16499
	InertiaMoment   0.394755

	Obliquity       -0.38434
	EqAscendNode    13.9617
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.636 0.530 0.383)

	Surface
	{
		SurfStyle       0.650863
		OceanStyle      0.105555
		Randomize      (0.651, 0.141, 0.415)
		colorDistMagn   0.663769
		colorDistFreq   0.0340455
		detailScale     195.652
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0133182
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595498
		terraceProb     0.240683
		erosion         0
		montesMagn      0.486606
		montesFreq      2.52539
		montesSpiky     0.901278
		montesFraction  0.539189
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.153748
		hillsFraction   0.841214
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211099
		craterFreq      0.201334
		craterDensity   0.987353
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   39.5349
		volcanoTemp     1362.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.180, 0.107, 0.000)
		colorShelf     (0.254, 0.186, 0.123, 0.000)
		colorBeach     (0.299, 0.217, 0.146, 0.000)
		colorDesert    (0.324, 0.233, 0.142, 0.000)
		colorLowland   (0.356, 0.249, 0.161, 0.000)
		colorUpland    (0.394, 0.302, 0.195, 0.000)
		colorRock      (0.426, 0.329, 0.211, 0.000)
		colorSnow      (0.464, 0.350, 0.222, 1.000)
		BumpHeight      6.44849
		BumpOffset      1.2897
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0708622
		Period          0.0716732
		Eccentricity    0.0754366
		Inclination     -0.38434
		AscendingNode   13.9617
		ArgOfPericenter -165.022
		MeanAnomaly     -122.807
	}
}

Asteroid	"S100"
{
	ParentBody     "RS 8476-1353-8-11843423-178"
	Class	       "Asteroid"

	Mass            4.72997e-018
	Radius          0.0129167
	InertiaMoment   0.39819

	Obliquity       -1.92119
	EqAscendNode    -163.378
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.648 0.570 0.487)

	Surface
	{
		SurfStyle       0.117211
		OceanStyle      0.259351
		Randomize      (-0.246, -0.759, -0.596)
		colorDistMagn   0.784005
		colorDistFreq   1.35602e-007
		detailScale     0.352711
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00969199
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446316
		terraceProb     0.788058
		erosion         0
		montesMagn      0.505665
		montesFreq      2.66888
		montesSpiky     0.948049
		montesFraction  0.807112
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.2025e-007
		hillsFraction   0.712546
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235664
		craterFreq      0.240744
		craterDensity   1.00979
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   931.166
		volcanoTemp     1272.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.228, 0.195, 0.000)
		colorShelf     (0.275, 0.242, 0.207, 0.000)
		colorBeach     (0.291, 0.256, 0.219, 0.000)
		colorDesert    (0.308, 0.271, 0.231, 0.000)
		colorLowland   (0.324, 0.285, 0.243, 0.000)
		colorUpland    (0.340, 0.299, 0.256, 0.000)
		colorRock      (0.356, 0.313, 0.268, 0.000)
		colorSnow      (0.372, 0.328, 0.280, 1.000)
		BumpHeight      0.011625
		BumpOffset      0.002325
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0853026
		Period          0.0946624
		Eccentricity    0.166138
		Inclination     -1.92119
		AscendingNode   -163.378
		ArgOfPericenter -82.7942
		MeanAnomaly     -155.689
	}
}

