Star	"Barnard's Star"
{
	ParentBody     "Barnard's Star"
	Class	       "M4 V"
	Luminosity      0.000438359
	MassSol         0.144
	RadSol          0.196
	Teff            3134

	Age             3.709

	InertiaMoment   0.053475

	RotationPeriod  114.366
	Obliquity       331.455
	EqAscendNode    325.055

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.481 0.177)

	Surface
	{
		Randomize      (-0.105, -0.011, -0.413)
		colorDistMagn   0.522621
		colorDistFreq   9.66695
		detailScale     350870
		colorConversion true
		tropicLatitude  0.60392
		icecapLatitude  1.06928
		mareFreq        14.4049
		mareDensity     0.0114364
		erosion         1
		montesFreq      537
		dunesMagn       0.618463
		hillsMagn       0.03
		hillsFreq       823.192
		craterOctaves   0
		BumpHeight      309.415
		BumpOffset      309.415
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
		Height          1364.16
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
		Radius      764694
		Period      0.0171174
		Brightness  0.5
		RayDensity  2.10493
		RayCurv     7.7622
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     331.455
		AscendingNode   325.055
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Planet	"1"
{
	ParentBody     "Barnard's Star"
	Class	       "Terra"

	Mass            0.137703
	Radius          2984.6
	InertiaMoment   0.331532

	Obliquity       0.670469
	EqAscendNode    -95.0007
	TidalLocked     true

	AlbedoBond      0.26
	AlbedoGeom      0.312
	Brightness      2
	Color          (0.806 0.707 0.658)

	Surface
	{
		SurfStyle       0.450407
		OceanStyle      0.47691
		Randomize      (-0.090, 0.158, 0.023)
		colorDistMagn   0.0452915
		colorDistFreq   384.608
		detailScale     7676.56
		colorConversion true
		seaLevel        0.102983
		snowLevel       0.85
		tropicLatitude  0.0158103
		icecapLatitude  1
		icecapHeight    0.102983
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.21014
		venusFreq       1.57411
		venusMagn       0.383188
		mareFreq        3.94053
		mareDensity     0.0242453
		terraceProb     0.308938
		erosion         0.122237
		montesMagn      0.150296
		montesFreq      102.407
		montesSpiky     0.956286
		montesFraction  0.668041
		dunesMagn       0.0524535
		dunesFreq       23.8413
		dunesFraction   0.619104
		hillsMagn       0.140124
		hillsFreq       321.198
		hillsFraction   0.930194
		hills2Fraction  0.343872
		riversMagn      59.9482
		riversFreq      4.24724
		riversSin       6.61911
		riversOctaves   2
		canyonsMagn     0.0448597
		canyonsFreq     76.3366
		canyonFraction  0.398111
		cracksMagn      0.0895953
		cracksFreq      0.285652
		cracksOctaves   0
		craterMagn      0.537458
		craterFreq      7.51328
		craterDensity   0
		craterOctaves   0.959919
		volcanoMagn     0.715839
		volcanoFreq     3.43504
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.816152
		volcanoRadius   0.360969
		volcanoTemp     1317.14
		lavaCoverTidal  0.317181
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      1
		twistMagn       3.5
		cycloneMagn     1.03497
		cycloneDensity  0.32465
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.400, 0.330, 0.280, 0.000)
		colorDesert    (0.260, 0.240, 0.220, 0.000)
		colorLowland   (0.500, 0.420, 0.350, 0.000)
		colorUpland    (0.240, 0.210, 0.210, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.500, 0.420, 0.350, 0.000)
		colorUpPlants  (0.240, 0.210, 0.210, 0.000)
		BumpHeight      20
		BumpOffset      2.05966
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
		Height          2.30566
		BumpHeight      5.58261
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.910778
		mainOctaves     10
		Coverage        0.1
		twistZones      1
		twistMagn       3.5
	}

	Ocean
	{
		Height          2.05966
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          80.1823
		Density         0.68244
		Pressure        0.461473
		Greenhouse      2.88782
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0253671
		Saturation      1

		Composition
		{
			CO2   	89.2775
			H2O   	9.78001
			SO2   	0.34226
			H2S   	0.329341
			C2H4  	0.129814
			C2H2  	0.0528159
			NH3   	0.048823
			C3H8  	0.0195308
			C2H6  	0.0121941
			N2    	0.00751398
			Ar    	0.00010632
			CO    	5.56105e-005
			Ne    	1.08572e-005
		}
	}

	Aurora
	{
		Height      48.0194
		NorthLat    70.4784
		NorthLon    99.9197
		NorthRadius 764.645
		NorthWidth  851.363
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -84.8182
		SouthLon    287.51
		SouthRadius 849.283
		SouthWidth  981.788
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
		SemiMajorAxis   0.0202887
		Period          0.00761552
		Eccentricity    0.0628522
		Inclination     0.670469
		AscendingNode   -95.0007
		ArgOfPericenter 0.862819
		MeanAnomaly     23.1839
	}
}

DwarfMoon	"1.D1"
{
	ParentBody     "1"
	Class	       "Asteroid"

	Mass            2.79101e-010
	Radius          5.03963
	InertiaMoment   0.399924

	Oblateness      0.249

	Obliquity       0.00732273
	EqAscendNode    -64.8002
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.575 0.402 0.343)

	Surface
	{
		SurfStyle       0.244704
		OceanStyle      0.178255
		Randomize      (0.998, -0.198, 0.023)
		colorDistMagn   0.752054
		colorDistFreq   0.0140845
		detailScale     137.616
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5887
		terraceProb     0.212837
		erosion         0
		montesMagn      0.509889
		montesFreq      3.10011
		montesSpiky     0.96073
		montesFraction  0.723466
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0588559
		hillsFraction   0.636635
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261657
		craterFreq      0.260916
		craterDensity   0.876127
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.296
		volcanoTemp     1497.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.161, 0.137, 0.000)
		colorShelf     (0.244, 0.171, 0.146, 0.000)
		colorBeach     (0.259, 0.181, 0.154, 0.000)
		colorDesert    (0.273, 0.191, 0.163, 0.000)
		colorLowland   (0.287, 0.201, 0.171, 0.000)
		colorUpland    (0.302, 0.211, 0.180, 0.000)
		colorRock      (0.316, 0.221, 0.189, 0.000)
		colorSnow      (0.330, 0.231, 0.197, 1.000)
		BumpHeight      4.53567
		BumpOffset      0.907134
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.97422e-005
		Period          0.000390468
		Eccentricity    4.93385e-005
		Inclination     0.00732273
		AscendingNode   -64.8002
		ArgOfPericenter 14.8482
		MeanAnomaly     -106.236
	}
}

Planet	"2"
{
	ParentBody     "Barnard's Star"
	Class	       "GasGiant"

	Mass            294.213
	Radius          72138.7
	InertiaMoment   0.29471

	Obliquity       0.751704
	EqAscendNode    33.1757
	TidalLocked     true

	AlbedoBond      0.497705
	AlbedoGeom      0.597246
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.460848
		Randomize      (-0.453, -0.651, 0.813)
		detailScale     185545
		colorConversion true
		tropicLatitude  0.0251457
		icecapLatitude  0.925146
		mainFreq        0.0434952
		venusFreq       7.66765
		venusMagn       0.363875
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.559768
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      2.52785
		twistMagn       0.944971
		cycloneMagn     9.00503
		cycloneFreq     0.396267
		cycloneDensity  0.0357639
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
		BumpHeight      13.1878
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          71.0156
		BumpHeight      50.6979
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.766988
		mainOctaves     10
		Coverage        0.477047
		twistZones      2.52785
		twistMagn       0.944971
	}

	Clouds
	{
		Height          128.844
		BumpHeight      63.5371
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.766988
		mainOctaves     10
		Coverage        0.477047
		twistZones      2.52785
		twistMagn       0.944971
	}

	Clouds
	{
		Height          186.664
		BumpHeight      67.1655
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.766988
		mainOctaves     10
		Coverage        0.477047
		twistZones      2.52785
		twistMagn       0.944971
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          446.887
		Density         5418.78
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0324634
		Saturation      0.539629

		Composition
		{
			H2    	92.332
			He    	7.26602
			CH4   	0.327316
			N2    	0.0353118
			NH3   	0.0245836
			O2    	0.0069973
			C2H2  	0.00360129
			C2H4  	0.00140179
			Ne    	0.00108743
			Ar    	0.000858352
			C2H6  	0.000527003
			C3H8  	0.000323575
		}
	}

	Aurora
	{
		Height      2889.35
		NorthLat    87.0587
		NorthLon    -60.7281
		NorthRadius 21575.7
		NorthWidth  11786.8
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -87.8182
		SouthLon    117.044
		SouthRadius 15389.2
		SouthWidth  9073.29
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
		SemiMajorAxis   0.035012
		Period          0.0172117
		Eccentricity    0.0409342
		Inclination     0.751704
		AscendingNode   33.1757
		ArgOfPericenter 149.626
		MeanAnomaly     245.277
	}
}

DwarfMoon	"2.D1"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            8.25584e-009
	Radius          15.2089
	InertiaMoment   0.399383

	Oblateness      0.111604

	Obliquity       0.00536676
	EqAscendNode    113.952
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.726 0.723 0.721)

	Surface
	{
		SurfStyle       0.426734
		OceanStyle      0.422875
		Randomize      (0.454, -0.141, -0.317)
		colorDistMagn   0.687847
		colorDistFreq   0.0662595
		detailScale     415.303
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.75901
		terraceProb     0.190898
		erosion         0
		montesMagn      0.341383
		montesFreq      3.19972
		montesSpiky     0.979403
		montesFraction  0.643125
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.690304
		hillsFraction   0.757719
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241553
		craterFreq      0.240164
		craterDensity   1.07399
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.2435
		volcanoTemp     1343.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.289, 0.288, 0.000)
		colorShelf     (0.309, 0.307, 0.306, 0.000)
		colorBeach     (0.327, 0.325, 0.324, 0.000)
		colorDesert    (0.345, 0.343, 0.342, 0.000)
		colorLowland   (0.363, 0.361, 0.360, 0.000)
		colorUpland    (0.381, 0.380, 0.378, 0.000)
		colorRock      (0.400, 0.398, 0.397, 0.000)
		colorSnow      (0.418, 0.416, 0.415, 1.000)
		BumpHeight      13.688
		BumpOffset      2.73759
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000746827
		Period          0.000688143
		Eccentricity    9.24728e-005
		Inclination     0.00536676
		AscendingNode   113.952
		ArgOfPericenter 58.9787
		MeanAnomaly     72.4611
	}
}

DwarfMoon	"2.D2"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            1.12763e-008
	Radius          29.7468
	InertiaMoment   0.396781

	Oblateness      0.249

	Obliquity       0.00378323
	EqAscendNode    -119.846
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.625 0.622 0.620)

	Surface
	{
		SurfStyle       0.694307
		OceanStyle      0.0773242
		Randomize      (0.720, -0.360, -0.366)
		colorDistMagn   0.636501
		colorDistFreq   0.356751
		detailScale     812.285
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.736989
		terraceProb     0.236699
		erosion         0
		montesMagn      0.517787
		montesFreq      3.21613
		montesSpiky     0.921836
		montesFraction  0.506244
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.90398
		hillsFraction   0.496094
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.289379
		craterFreq      0.222114
		craterDensity   0.927269
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   43.92
		volcanoTemp     1518.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.211, 0.174, 0.000)
		colorShelf     (0.250, 0.218, 0.198, 0.000)
		colorBeach     (0.294, 0.255, 0.236, 0.000)
		colorDesert    (0.319, 0.273, 0.229, 0.000)
		colorLowland   (0.350, 0.292, 0.260, 0.000)
		colorUpland    (0.387, 0.354, 0.316, 0.000)
		colorRock      (0.419, 0.385, 0.341, 0.000)
		colorSnow      (0.456, 0.410, 0.359, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000781382
		Period          0.000736451
		Eccentricity    2.12275e-005
		Inclination     0.00378323
		AscendingNode   -119.846
		ArgOfPericenter -170.184
		MeanAnomaly     -39.3617
	}
}

DwarfMoon	"2.D3"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            1.53557e-008
	Radius          22.1127
	InertiaMoment   0.398514

	Oblateness      0.13071

	Obliquity       0.00841047
	EqAscendNode    -12.1836
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.677 0.590 0.544)

	Surface
	{
		SurfStyle       0.0654054
		OceanStyle      0.0986643
		Randomize      (0.279, -0.025, 0.172)
		colorDistMagn   0.433027
		colorDistFreq   0.387406
		detailScale     603.824
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.66491
		terraceProb     0.384682
		erosion         0
		montesMagn      0.487318
		montesFreq      3.15591
		montesSpiky     0.869691
		montesFraction  0.62499
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.06947
		hillsFraction   0.498368
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231974
		craterFreq      0.216698
		craterDensity   0.875686
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.9778
		volcanoTemp     1637.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.236, 0.218, 0.000)
		colorShelf     (0.288, 0.251, 0.231, 0.000)
		colorBeach     (0.305, 0.266, 0.245, 0.000)
		colorDesert    (0.322, 0.280, 0.259, 0.000)
		colorLowland   (0.339, 0.295, 0.272, 0.000)
		colorUpland    (0.355, 0.310, 0.286, 0.000)
		colorRock      (0.372, 0.325, 0.299, 0.000)
		colorSnow      (0.389, 0.339, 0.313, 1.000)
		BumpHeight      19.9014
		BumpOffset      3.98029
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000836721
		Period          0.000816055
		Eccentricity    5.9853e-005
		Inclination     0.00841047
		AscendingNode   -12.1836
		ArgOfPericenter -82.1531
		MeanAnomaly     133.375
	}
}

DwarfMoon	"2.D4"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            2.08678e-008
	Radius          40.1024
	InertiaMoment   0.399513

	Oblateness      0.249

	Obliquity       0.0118797
	EqAscendNode    131.271
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.646 0.487 0.368)

	Surface
	{
		SurfStyle       0.098411
		OceanStyle      0.781595
		Randomize      (-0.751, 0.665, -0.234)
		colorDistMagn   0.582222
		colorDistFreq   1.29865
		detailScale     1095.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.42482
		terraceProb     0.243397
		erosion         0
		montesMagn      0.426174
		montesFreq      3.43194
		montesSpiky     0.859705
		montesFraction  0.629037
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.7086
		hillsFraction   0.865483
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250347
		craterFreq      0.261343
		craterDensity   0.740809
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   43.5249
		volcanoTemp     1370.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.195, 0.147, 0.000)
		colorShelf     (0.275, 0.207, 0.157, 0.000)
		colorBeach     (0.291, 0.219, 0.166, 0.000)
		colorDesert    (0.307, 0.231, 0.175, 0.000)
		colorLowland   (0.323, 0.243, 0.184, 0.000)
		colorUpland    (0.339, 0.256, 0.193, 0.000)
		colorRock      (0.355, 0.268, 0.203, 0.000)
		colorSnow      (0.372, 0.280, 0.212, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000903858
		Period          0.000916218
		Eccentricity    8.66318e-005
		Inclination     0.0118797
		AscendingNode   131.271
		ArgOfPericenter 133.825
		MeanAnomaly     179.452
	}
}

DwarfMoon	"2.D5"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            2.83251e-008
	Radius          23.1289
	InertiaMoment   0.397172

	Oblateness      0.0608248

	Obliquity       -0.00943995
	EqAscendNode    92.2728
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.701 0.699 0.697)

	Surface
	{
		SurfStyle       0.0650444
		OceanStyle      0.179248
		Randomize      (-0.365, -0.333, -0.356)
		colorDistMagn   0.600406
		colorDistFreq   0.185221
		detailScale     631.574
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453568
		terraceProb     0.259565
		erosion         0
		montesMagn      0.482562
		montesFreq      2.88632
		montesSpiky     0.966197
		montesFraction  0.229423
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.12887
		hillsFraction   0.743429
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248159
		craterFreq      0.223945
		craterDensity   0.960145
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   21.5464
		volcanoTemp     1128.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.280, 0.279, 0.000)
		colorShelf     (0.298, 0.297, 0.296, 0.000)
		colorBeach     (0.315, 0.315, 0.314, 0.000)
		colorDesert    (0.333, 0.332, 0.331, 0.000)
		colorLowland   (0.350, 0.350, 0.349, 0.000)
		colorUpland    (0.368, 0.367, 0.366, 0.000)
		colorRock      (0.385, 0.385, 0.383, 0.000)
		colorSnow      (0.403, 0.402, 0.401, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000919337
		Period          0.000939854
		Eccentricity    2.43655e-005
		Inclination     -0.00943995
		AscendingNode   92.2728
		ArgOfPericenter 14.4066
		MeanAnomaly     106.024
	}
}

DwarfMoon	"2.D6"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            3.84354e-008
	Radius          45.1316
	InertiaMoment   0.398674

	Oblateness      0.249

	Obliquity       -0.000754478
	EqAscendNode    -47.9334
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.621 0.617 0.613)

	Surface
	{
		SurfStyle       0.848294
		OceanStyle      0.0199218
		Randomize      (-0.921, -0.276, -0.184)
		colorDistMagn   0.927251
		colorDistFreq   1.78978
		detailScale     1232.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.521952
		terraceProb     0.292233
		erosion         0
		montesMagn      0.412197
		montesFreq      2.85843
		montesSpiky     0.958048
		montesFraction  0.409251
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.25137
		hillsFraction   0.651062
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252794
		craterFreq      0.182725
		craterDensity   0.735622
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   36.0928
		volcanoTemp     1498.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.210, 0.172, 0.000)
		colorShelf     (0.248, 0.216, 0.196, 0.000)
		colorBeach     (0.292, 0.253, 0.233, 0.000)
		colorDesert    (0.317, 0.272, 0.227, 0.000)
		colorLowland   (0.348, 0.290, 0.257, 0.000)
		colorUpland    (0.385, 0.352, 0.313, 0.000)
		colorRock      (0.416, 0.383, 0.337, 0.000)
		colorSnow      (0.453, 0.407, 0.356, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00100715
		Period          0.00107768
		Eccentricity    1.62213e-005
		Inclination     -0.000754478
		AscendingNode   -47.9334
		ArgOfPericenter 96.7911
		MeanAnomaly     -179.299
	}
}

DwarfMoon	"2.D7"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            5.21832e-008
	Radius          34.0154
	InertiaMoment   0.39964

	Oblateness      0.0691193

	Obliquity       0.0118472
	EqAscendNode    56.9719
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.626 0.622 0.618)

	Surface
	{
		SurfStyle       0.221969
		OceanStyle      0.42812
		Randomize      (-0.231, -0.233, -0.883)
		colorDistMagn   0.803928
		colorDistFreq   0.668793
		detailScale     928.848
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.574925
		terraceProb     0.484768
		erosion         0
		montesMagn      0.551424
		montesFreq      2.08634
		montesSpiky     0.845446
		montesFraction  0.918202
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.84137
		hillsFraction   0.707353
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238213
		craterFreq      0.192298
		craterDensity   0.993619
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.3462
		volcanoTemp     1870.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.249, 0.247, 0.000)
		colorShelf     (0.266, 0.264, 0.263, 0.000)
		colorBeach     (0.282, 0.280, 0.278, 0.000)
		colorDesert    (0.297, 0.295, 0.294, 0.000)
		colorLowland   (0.313, 0.311, 0.309, 0.000)
		colorUpland    (0.329, 0.326, 0.324, 0.000)
		colorRock      (0.344, 0.342, 0.340, 0.000)
		colorSnow      (0.360, 0.358, 0.355, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00106017
		Period          0.00116389
		Eccentricity    3.18784e-005
		Inclination     0.0118472
		AscendingNode   56.9719
		ArgOfPericenter -128.023
		MeanAnomaly     -14.7168
	}
}

DwarfMoon	"2.D8"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            7.09492e-008
	Radius          60.7173
	InertiaMoment   0.397478

	Oblateness      0.249

	Obliquity       0.00837604
	EqAscendNode    -96.4664
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.521 0.517 0.510)

	Surface
	{
		SurfStyle       0.375523
		OceanStyle      0.603426
		Randomize      (-0.994, -0.349, -0.545)
		colorDistMagn   0.210588
		colorDistFreq   0.32644
		detailScale     1657.99
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.754552
		terraceProb     0.121852
		erosion         0
		montesMagn      0.508203
		montesFreq      3.69817
		montesSpiky     0.983278
		montesFraction  0.671207
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.65381
		hillsFraction   0.612261
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260892
		craterFreq      0.21699
		craterDensity   0.922657
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.7392
		volcanoTemp     1596.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.207, 0.204, 0.000)
		colorShelf     (0.221, 0.220, 0.217, 0.000)
		colorBeach     (0.234, 0.232, 0.230, 0.000)
		colorDesert    (0.247, 0.245, 0.242, 0.000)
		colorLowland   (0.260, 0.258, 0.255, 0.000)
		colorUpland    (0.273, 0.271, 0.268, 0.000)
		colorRock      (0.286, 0.284, 0.281, 0.000)
		colorSnow      (0.299, 0.297, 0.293, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00109093
		Period          0.00121492
		Eccentricity    3.92147e-005
		Inclination     0.00837604
		AscendingNode   -96.4664
		ArgOfPericenter -155.946
		MeanAnomaly     172.291
	}
}

DwarfMoon	"2.D9"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            9.66877e-008
	Radius          35.1147
	InertiaMoment   0.398826

	Oblateness      0.035735

	Obliquity       -0.00604114
	EqAscendNode    129.953
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.618 0.616 0.613)

	Surface
	{
		SurfStyle       0.687966
		OceanStyle      0.626717
		Randomize      (-0.377, 0.132, 0.670)
		colorDistMagn   0.94669
		colorDistFreq   0.7373
		detailScale     958.866
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.636744
		terraceProb     0.223647
		erosion         0
		montesMagn      0.232239
		montesFreq      2.74869
		montesSpiky     0.858868
		montesFraction  0.369686
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.53636
		hillsFraction   0.705195
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260407
		craterFreq      0.247626
		craterDensity   1.02574
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   17.7056
		volcanoTemp     1397.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.209, 0.172, 0.000)
		colorShelf     (0.247, 0.216, 0.196, 0.000)
		colorBeach     (0.290, 0.253, 0.233, 0.000)
		colorDesert    (0.315, 0.271, 0.227, 0.000)
		colorLowland   (0.346, 0.290, 0.258, 0.000)
		colorUpland    (0.383, 0.351, 0.313, 0.000)
		colorRock      (0.414, 0.382, 0.337, 0.000)
		colorSnow      (0.451, 0.407, 0.356, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0011091
		Period          0.00124538
		Eccentricity    2.99996e-005
		Inclination     -0.00604114
		AscendingNode   129.953
		ArgOfPericenter -24.8194
		MeanAnomaly     -95.9334
	}
}

DwarfMoon	"2.D10"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            1.32195e-007
	Radius          68.6217
	InertiaMoment   0.399767

	Oblateness      0.168963

	Obliquity       0.0105436
	EqAscendNode    123.363
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.750 0.747 0.743)

	Surface
	{
		SurfStyle       0.532058
		OceanStyle      0.619706
		Randomize      (0.659, -0.153, 0.095)
		colorDistMagn   0.626431
		colorDistFreq   1.73773
		detailScale     1873.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.333224
		terraceProb     0.288898
		erosion         0
		montesMagn      0.496481
		montesFreq      2.5568
		montesSpiky     0.84605
		montesFraction  0.446862
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.9176
		hillsFraction   0.644359
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212269
		craterFreq      0.207863
		craterDensity   0.86674
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.591
		volcanoTemp     994.421
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.254, 0.208, 0.000)
		colorShelf     (0.300, 0.261, 0.238, 0.000)
		colorBeach     (0.353, 0.306, 0.282, 0.000)
		colorDesert    (0.383, 0.329, 0.275, 0.000)
		colorLowland   (0.420, 0.351, 0.312, 0.000)
		colorUpland    (0.465, 0.426, 0.379, 0.000)
		colorRock      (0.503, 0.463, 0.409, 0.000)
		colorSnow      (0.548, 0.493, 0.431, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00116485
		Period          0.00134046
		Eccentricity    8.42478e-005
		Inclination     0.0105436
		AscendingNode   123.363
		ArgOfPericenter -162.214
		MeanAnomaly     171.312
	}
}

DwarfMoon	"2.D11"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            1.81517e-007
	Radius          53.0634
	InertiaMoment   0.397733

	Oblateness      0.00314432

	Obliquity       -84.7596
	EqAscendNode    150.288
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.614 0.610 0.608)

	Surface
	{
		SurfStyle       0.00416082
		OceanStyle      0.0215585
		Randomize      (-0.697, -0.608, 0.787)
		colorDistMagn   0.384644
		colorDistFreq   2.35328
		detailScale     1448.98
		colorConversion true
		snowLevel       2
		tropicLatitude  0.493707
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.355905
		terraceProb     0.258382
		erosion         0
		montesMagn      0.421777
		montesFreq      3.04787
		montesSpiky     0.945635
		montesFraction  0.196258
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.17692
		hillsFraction   0.492274
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249959
		craterFreq      0.196698
		craterDensity   0.989227
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   19.5273
		volcanoTemp     1555.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.244, 0.243, 0.000)
		colorShelf     (0.261, 0.259, 0.258, 0.000)
		colorBeach     (0.276, 0.274, 0.274, 0.000)
		colorDesert    (0.291, 0.290, 0.289, 0.000)
		colorLowland   (0.307, 0.305, 0.304, 0.000)
		colorUpland    (0.322, 0.320, 0.319, 0.000)
		colorRock      (0.338, 0.335, 0.334, 0.000)
		colorSnow      (0.353, 0.350, 0.350, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00216998
		Period          0.00340824
		Eccentricity    0.0754086
		Inclination     -84.7596
		AscendingNode   150.288
		ArgOfPericenter -154.952
		MeanAnomaly     -44.8495
	}
}

Planet	"3"
{
	ParentBody     "Barnard's Star"
	Class	       "Desert"

	Mass            3.14694
	Radius          11369.4
	InertiaMoment   0.32833

	Obliquity       0.36359
	EqAscendNode    30.5497
	TidalLocked     true

	AlbedoBond      0.276092
	AlbedoGeom      0.33131
	Brightness      2
	Color          (0.812 0.795 0.765)

	Surface
	{
		SurfStyle       0.71662
		OceanStyle      0.381322
		Randomize      (-0.350, -0.793, -0.297)
		colorDistMagn   0.0746338
		colorDistFreq   1635.98
		detailScale     29242.8
		colorConversion true
		seaLevel        0.0686746
		snowLevel       2
		tropicLatitude  0.0122409
		icecapLatitude  0.873947
		icecapHeight    0.0808174
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.736434
		venusFreq       0.732302
		venusMagn       0.238427
		mareFreq        1.20901
		mareDensity     0.205142
		terraceProb     0.111004
		erosion         0
		montesMagn      0.151186
		montesFreq      717.47
		montesSpiky     0.998017
		montesFraction  0.18058
		dunesMagn       0.0535196
		dunesFreq       83.0617
		dunesFraction   0.684418
		hillsMagn       0.147942
		hillsFreq       1548.4
		hillsFraction   0
		hills2Fraction  0
		riversMagn      69.5983
		riversFreq      2.72889
		riversSin       6.82974
		riversOctaves   0
		canyonsMagn     0.0418704
		canyonsFreq     321.788
		canyonFraction  0
		cracksMagn      0.105852
		cracksFreq      0.823947
		cracksOctaves   0
		craterMagn      0.677506
		craterFreq      28.5215
		craterDensity   0.215983
		craterOctaves   3.04703
		volcanoMagn     0.687542
		volcanoFreq     3.41388
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.834297
		volcanoRadius   0.285869
		volcanoTemp     1377.46
		lavaCoverTidal  0.136224
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      1
		twistMagn       3.5
		cycloneMagn     0.723756
		cycloneDensity  0.372912
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
		Height          12.5195
		BumpHeight      6.25298
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.03936
		mainOctaves     10
		Coverage        0.152184
		twistZones      1
		twistMagn       3.5
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          23.6698
		Density         0.521866
		Pressure        0.180231
		Greenhouse      1.03482
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      0.81397

		Composition
		{
			CO2   	91.3841
			CH4   	3.98055
			H2S   	2.40265
			C2H2  	2.1454
			C2H4  	0.0382577
			N2    	0.0248737
			C2H6  	0.0127053
			NH3   	0.0100517
			C3H8  	0.000950913
			SO2   	0.000198246
			CO    	0.000134974
			Ar    	0.000113672
			Ne    	4.69875e-005
		}
	}

	Aurora
	{
		Height      288.552
		NorthLat    66.0706
		NorthLon    92.3112
		NorthRadius 3189.91
		NorthWidth  4359.8
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -76.2954
		SouthLon    268.054
		SouthRadius 3647.46
		SouthWidth  3046.31
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
		SemiMajorAxis   0.0714319
		Period          0.0503088
		Eccentricity    0.0425329
		Inclination     0.36359
		AscendingNode   30.5497
		ArgOfPericenter 280.783
		MeanAnomaly     63.1494
	}
}

DwarfMoon	"3.D1"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.00766e-011
	Radius          3.3204
	InertiaMoment   0.395992

	Oblateness      0.249

	Obliquity       -0.0125565
	EqAscendNode    154.146
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.599 0.595 0.589)

	Surface
	{
		SurfStyle       0.470546
		OceanStyle      0.30931
		Randomize      (-0.508, 0.638, 0.375)
		colorDistMagn   0.874631
		colorDistFreq   0.0031993
		detailScale     90.669
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.275743
		terraceProb     0.212959
		erosion         0
		montesMagn      0.509014
		montesFreq      3.18932
		montesSpiky     0.942648
		montesFraction  0.450579
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0231497
		hillsFraction   0.496008
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25309
		craterFreq      0.250294
		craterDensity   0.825989
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   163.998
		volcanoTemp     1619.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.238, 0.236, 0.000)
		colorShelf     (0.255, 0.253, 0.250, 0.000)
		colorBeach     (0.270, 0.268, 0.265, 0.000)
		colorDesert    (0.285, 0.283, 0.280, 0.000)
		colorLowland   (0.300, 0.298, 0.295, 0.000)
		colorUpland    (0.314, 0.313, 0.309, 0.000)
		colorRock      (0.329, 0.327, 0.324, 0.000)
		colorSnow      (0.344, 0.342, 0.339, 1.000)
		BumpHeight      2.98836
		BumpOffset      0.597672
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00019102
		Period          0.000860701
		Eccentricity    1.49617e-005
		Inclination     -0.0125565
		AscendingNode   154.146
		ArgOfPericenter 57.1185
		MeanAnomaly     -107.505
	}
}

DwarfMoon	"3.D2"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            2.11783e-011
	Radius          4.00525
	InertiaMoment   0.398299

	Oblateness      0.249

	Obliquity       0.00235776
	EqAscendNode    86.8972
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.695 0.650 0.571)

	Surface
	{
		SurfStyle       0.649669
		OceanStyle      0.549521
		Randomize      (0.026, -0.782, 0.702)
		colorDistMagn   0.50822
		colorDistFreq   0.0110999
		detailScale     109.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.341667
		terraceProb     0.166618
		erosion         0
		montesMagn      0.517017
		montesFreq      1.98313
		montesSpiky     0.911762
		montesFraction  0.641171
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0403492
		hillsFraction   0.597382
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272815
		craterFreq      0.198928
		craterDensity   0.835424
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   136.455
		volcanoTemp     1796.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.221, 0.160, 0.000)
		colorShelf     (0.278, 0.228, 0.183, 0.000)
		colorBeach     (0.327, 0.267, 0.217, 0.000)
		colorDesert    (0.354, 0.286, 0.211, 0.000)
		colorLowland   (0.389, 0.306, 0.240, 0.000)
		colorUpland    (0.431, 0.371, 0.291, 0.000)
		colorRock      (0.466, 0.403, 0.314, 0.000)
		colorSnow      (0.507, 0.429, 0.331, 1.000)
		BumpHeight      3.60472
		BumpOffset      0.720945
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000200254
		Period          0.000923865
		Eccentricity    9.6677e-005
		Inclination     0.00235776
		AscendingNode   86.8972
		ArgOfPericenter 26.6441
		MeanAnomaly     101.493
	}
}

DwarfMoon	"3.D3"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            4.00725e-011
	Radius          4.75532
	InertiaMoment   0.399349

	Oblateness      0.249

	Obliquity       0.0028433
	EqAscendNode    87.8888
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.730 0.669 0.561)

	Surface
	{
		SurfStyle       0.203646
		OceanStyle      0.636806
		Randomize      (0.812, -0.944, -0.375)
		colorDistMagn   0.684174
		colorDistFreq   0.0157222
		detailScale     129.852
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.651371
		terraceProb     0.541614
		erosion         0
		montesMagn      0.402767
		montesFreq      1.54274
		montesSpiky     0.970377
		montesFraction  0.503335
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.052899
		hillsFraction   0.351223
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237733
		craterFreq      0.214355
		craterDensity   0.949395
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   117.778
		volcanoTemp     1374.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.267, 0.224, 0.000)
		colorShelf     (0.310, 0.284, 0.239, 0.000)
		colorBeach     (0.329, 0.301, 0.253, 0.000)
		colorDesert    (0.347, 0.318, 0.267, 0.000)
		colorLowland   (0.365, 0.334, 0.281, 0.000)
		colorUpland    (0.383, 0.351, 0.295, 0.000)
		colorRock      (0.402, 0.368, 0.309, 0.000)
		colorSnow      (0.420, 0.385, 0.323, 1.000)
		BumpHeight      4.27979
		BumpOffset      0.855958
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000217377
		Period          0.00104486
		Eccentricity    7.95548e-005
		Inclination     0.0028433
		AscendingNode   87.8888
		ArgOfPericenter -82.7292
		MeanAnomaly     28.4649
	}
}

DwarfMoon	"3.D4"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            7.04986e-011
	Radius          5.48244
	InertiaMoment   0.39666

	Oblateness      0.239088

	Obliquity       -0.00877606
	EqAscendNode    -1.79128
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.716 0.652 0.605)

	Surface
	{
		SurfStyle       0.511901
		OceanStyle      0.0679626
		Randomize      (-0.694, -0.209, -0.431)
		colorDistMagn   0.0338389
		colorDistFreq   0.0160145
		detailScale     149.707
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.56231
		terraceProb     0.482041
		erosion         0
		montesMagn      0.462337
		montesFreq      2.97378
		montesSpiky     0.891322
		montesFraction  0.73363
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0877142
		hillsFraction   0.76628
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242686
		craterFreq      0.219915
		craterDensity   0.866034
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   102.374
		volcanoTemp     1709.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.222, 0.169, 0.000)
		colorShelf     (0.286, 0.228, 0.194, 0.000)
		colorBeach     (0.336, 0.267, 0.230, 0.000)
		colorDesert    (0.365, 0.287, 0.224, 0.000)
		colorLowland   (0.401, 0.306, 0.254, 0.000)
		colorUpland    (0.444, 0.372, 0.309, 0.000)
		colorRock      (0.480, 0.404, 0.333, 0.000)
		colorSnow      (0.523, 0.430, 0.351, 1.000)
		BumpHeight      4.93419
		BumpOffset      0.986838
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000224351
		Period          0.00109554
		Eccentricity    3.64456e-005
		Inclination     -0.00877606
		AscendingNode   -1.79128
		ArgOfPericenter 26.1395
		MeanAnomaly     -25.242
	}
}

DwarfMoon	"3.D5"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.17577e-010
	Radius          7.64145
	InertiaMoment   0.398472

	Oblateness      0.249

	Obliquity       -0.00289205
	EqAscendNode    -97.9001
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.609 0.605 0.600)

	Surface
	{
		SurfStyle       0.322987
		OceanStyle      0.991631
		Randomize      (-0.466, -0.439, 0.151)
		colorDistMagn   0.813539
		colorDistFreq   0.0144657
		detailScale     208.663
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.484267
		terraceProb     0.397737
		erosion         0
		montesMagn      0.453376
		montesFreq      2.70452
		montesSpiky     0.97804
		montesFraction  0.446121
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.160145
		hillsFraction   0.410321
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271031
		craterFreq      0.232839
		craterDensity   0.921517
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   110.489
		volcanoTemp     1406.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.242, 0.240, 0.000)
		colorShelf     (0.259, 0.257, 0.255, 0.000)
		colorBeach     (0.274, 0.272, 0.270, 0.000)
		colorDesert    (0.289, 0.287, 0.285, 0.000)
		colorLowland   (0.304, 0.302, 0.300, 0.000)
		colorUpland    (0.320, 0.317, 0.315, 0.000)
		colorRock      (0.335, 0.333, 0.330, 0.000)
		colorSnow      (0.350, 0.348, 0.345, 1.000)
		BumpHeight      6.8773
		BumpOffset      1.37546
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00023593
		Period          0.00118144
		Eccentricity    7.41246e-005
		Inclination     -0.00289205
		AscendingNode   -97.9001
		ArgOfPericenter 33.1255
		MeanAnomaly     98.0063
	}
}

DwarfMoon	"3.D6"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.88264e-010
	Radius          8.35126
	InertiaMoment   0.39948

	Oblateness      0.145774

	RotationPeriod  14.2242
	Obliquity       -83.373
	EqAscendNode    149.371

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.748 0.707 0.682)

	Surface
	{
		SurfStyle       0.639468
		OceanStyle      0.719682
		Randomize      (0.857, 0.615, 0.157)
		colorDistMagn   0.471982
		colorDistFreq   0.0298516
		detailScale     228.045
		colorConversion true
		snowLevel       2
		tropicLatitude  0.506326
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.61037
		terraceProb     0.464679
		erosion         0
		montesMagn      0.440297
		montesFreq      3.48591
		montesSpiky     0.952802
		montesFraction  0.460729
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.15806
		hillsFraction   0.822053
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228677
		craterFreq      0.195206
		craterDensity   0.927872
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   95.4277
		volcanoTemp     1348.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.240, 0.191, 0.000)
		colorShelf     (0.299, 0.247, 0.218, 0.000)
		colorBeach     (0.351, 0.290, 0.259, 0.000)
		colorDesert    (0.381, 0.311, 0.252, 0.000)
		colorLowland   (0.419, 0.332, 0.286, 0.000)
		colorUpland    (0.464, 0.403, 0.348, 0.000)
		colorRock      (0.501, 0.438, 0.375, 0.000)
		colorSnow      (0.546, 0.467, 0.395, 1.000)
		BumpHeight      7.51613
		BumpOffset      1.50323
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000381999
		Period          0.00243404
		Eccentricity    0.396166
		Inclination     -83.373
		AscendingNode   149.371
		ArgOfPericenter 88.1666
		MeanAnomaly     -35.2397
	}
}

Planet	"4"
{
	ParentBody     "Barnard's Star"
	Class	       "GasGiant"

	Mass            2530.73
	Radius          73920
	InertiaMoment   0.219734

	RotationPeriod  2320.92
	Obliquity       1.42617
	EqAscendNode    -17.2452

	AlbedoBond      0.50757
	AlbedoGeom      0.609084
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.804004
		Randomize      (0.562, -0.901, -0.457)
		detailScale     190126
		colorConversion true
		tropicLatitude  0.0491999
		icecapLatitude  0.9492
		mainFreq        0.0164636
		venusFreq       10.1227
		venusMagn       0.372124
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.054938
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      4.80891
		twistMagn       0.70531
		cycloneMagn     10.5017
		cycloneFreq     0.218861
		cycloneDensity  0.123672
		cycloneOctaves  2
		colorLayer0    (0.190, 0.430, 0.850, 1.100)
		colorLayer1    (0.170, 0.450, 0.800, 0.600)
		colorLayer2    (0.180, 0.450, 0.830, 0.100)
		colorLayer3    (0.160, 0.460, 0.890, 0.000)
		colorLayer4    (0.180, 0.480, 0.860, 0.000)
		colorLayer5    (0.100, 0.450, 0.830, 0.000)
		colorLayer6    (0.190, 0.440, 0.860, 0.000)
		colorLayer7    (0.180, 0.430, 0.850, 1.000)
		colorLowPlants (0.180, 0.480, 0.860, 0.000)
		colorUpPlants  (0.100, 0.450, 0.830, 0.000)
		BumpHeight      4.60761
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          23.6875
		BumpHeight      64.1392
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.06309
		mainOctaves     10
		Coverage        0.575703
		twistZones      4.80891
		twistMagn       0.70531
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          100
		Density         5353.31
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.00169575
		Saturation      0.526461

		Composition
		{
			H2    	93.2769
			He    	6.38296
			CH4   	0.293303
			N2    	0.036558
			O2    	0.0068109
			C2H4  	0.00134238
			Ne    	0.00105042
			Ar    	0.000782185
			C2H2  	0.000190385
			C2H6  	0.000108357
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.136148
		Period          0.129038
		Eccentricity    0.091391
		Inclination     1.42617
		AscendingNode   -17.2452
		ArgOfPericenter 27.3787
		MeanAnomaly     335.256
	}
}

DwarfMoon	"4.D1"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            6.22585e-009
	Radius          26.3163
	InertiaMoment   0.398902

	Oblateness      0.249

	Obliquity       -0.00716416
	EqAscendNode    42.5234
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.479 0.428 0.336)

	Surface
	{
		SurfStyle       0.167893
		OceanStyle      0.4783
		Randomize      (0.318, 0.410, 0.183)
		colorDistMagn   0.902375
		colorDistFreq   0.470625
		detailScale     718.609
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489679
		terraceProb     0.125738
		erosion         0
		montesMagn      0.483298
		montesFreq      3.62162
		montesSpiky     0.994373
		montesFraction  0.866071
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.57388
		hillsFraction   0.520348
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24337
		craterFreq      0.206123
		craterDensity   0.934854
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   52.2914
		volcanoTemp     1527.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.171, 0.135, 0.000)
		colorShelf     (0.204, 0.182, 0.143, 0.000)
		colorBeach     (0.216, 0.193, 0.151, 0.000)
		colorDesert    (0.228, 0.204, 0.160, 0.000)
		colorLowland   (0.240, 0.214, 0.168, 0.000)
		colorUpland    (0.251, 0.225, 0.177, 0.000)
		colorRock      (0.263, 0.236, 0.185, 0.000)
		colorSnow      (0.275, 0.246, 0.193, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0018818
		Period          0.000938464
		Eccentricity    6.72225e-006
		Inclination     -0.00716416
		AscendingNode   42.5234
		ArgOfPericenter -80.5366
		MeanAnomaly     23.5333
	}
}

DwarfMoon	"4.D2"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            8.53364e-009
	Radius          28.081
	InertiaMoment   0.399831

	Oblateness      0.217253

	Obliquity       -0.0148735
	EqAscendNode    83.5048
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.847 0.756 0.723)

	Surface
	{
		SurfStyle       0.444326
		OceanStyle      0.536361
		Randomize      (-0.827, 0.857, 0.239)
		colorDistMagn   0.374907
		colorDistFreq   0.553302
		detailScale     766.799
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571187
		terraceProb     0.409364
		erosion         0
		montesMagn      0.540487
		montesFreq      3.83779
		montesSpiky     0.972903
		montesFraction  0.858144
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.86568
		hillsFraction   0.804254
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224031
		craterFreq      0.259754
		craterDensity   1.08458
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.6597
		volcanoTemp     1508.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.339, 0.302, 0.289, 0.000)
		colorShelf     (0.360, 0.321, 0.307, 0.000)
		colorBeach     (0.381, 0.340, 0.326, 0.000)
		colorDesert    (0.402, 0.359, 0.344, 0.000)
		colorLowland   (0.423, 0.378, 0.362, 0.000)
		colorUpland    (0.445, 0.397, 0.380, 0.000)
		colorRock      (0.466, 0.416, 0.398, 0.000)
		colorSnow      (0.487, 0.434, 0.416, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00223917
		Period          0.00121811
		Eccentricity    3.47441e-005
		Inclination     -0.0148735
		AscendingNode   83.5048
		ArgOfPericenter -179.865
		MeanAnomaly     -49.0942
	}
}

DwarfMoon	"4.D3"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.16515e-008
	Radius          29.4805
	InertiaMoment   0.397852

	Oblateness      0.00773502

	Obliquity       53.6139
	EqAscendNode    -16.1637
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.574 0.567 0.563)

	Surface
	{
		SurfStyle       0.86395
		OceanStyle      0.444071
		Randomize      (-0.122, -0.336, 0.459)
		colorDistMagn   0.879795
		colorDistFreq   0.751842
		detailScale     805.015
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962705
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633022
		terraceProb     0.265252
		erosion         0
		montesMagn      0.518133
		montesFreq      2.99031
		montesSpiky     0.99438
		montesFraction  0.451254
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.75103
		hillsFraction   0.750669
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257363
		craterFreq      0.234945
		craterDensity   1.01352
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.8203
		volcanoTemp     1248.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.198, 0.225, 0.050)
		colorShelf     (0.230, 0.232, 0.259, 0.040)
		colorBeach     (0.264, 0.266, 0.293, 0.030)
		colorDesert    (0.298, 0.300, 0.332, 0.020)
		colorLowland   (0.333, 0.334, 0.366, 0.030)
		colorUpland    (0.367, 0.369, 0.400, 0.050)
		colorRock      (0.402, 0.403, 0.445, 0.020)
		colorSnow      (0.402, 0.403, 0.445, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00642521
		Period          0.0059209
		Eccentricity    0.0426797
		Inclination     53.6139
		AscendingNode   -16.1637
		ArgOfPericenter -2.38816
		MeanAnomaly     -176.488
	}
}

DwarfMoon	"4.D4"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.58625e-008
	Radius          38.1932
	InertiaMoment   0.399044

	Oblateness      0.0112222

	Obliquity       53.328
	EqAscendNode    -128.328
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.508 0.432 0.396)

	Surface
	{
		SurfStyle       0.739506
		OceanStyle      0.74057
		Randomize      (-0.165, 0.106, -0.609)
		colorDistMagn   0.75007
		colorDistFreq   0.972859
		detailScale     1042.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.654978
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.374153
		terraceProb     0.108023
		erosion         0
		montesMagn      0.624065
		montesFreq      2.67021
		montesSpiky     0.926944
		montesFraction  0.893528
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.02604
		hillsFraction   0.822914
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239176
		craterFreq      0.202463
		craterDensity   0.935776
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.5451
		volcanoTemp     1529.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.147, 0.111, 0.000)
		colorShelf     (0.203, 0.151, 0.127, 0.000)
		colorBeach     (0.239, 0.177, 0.150, 0.000)
		colorDesert    (0.259, 0.190, 0.146, 0.000)
		colorLowland   (0.285, 0.203, 0.166, 0.000)
		colorUpland    (0.315, 0.246, 0.202, 0.000)
		colorRock      (0.341, 0.268, 0.218, 0.000)
		colorSnow      (0.371, 0.285, 0.230, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0066443
		Period          0.00622631
		Eccentricity    0.0998005
		Inclination     53.328
		AscendingNode   -128.328
		ArgOfPericenter -53.588
		MeanAnomaly     -156.461
	}
}

DwarfMoon	"4.D5"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            2.15529e-008
	Radius          40.05
	InertiaMoment   0.399956

	Oblateness      0.00834419

	Obliquity       1.85054
	EqAscendNode    167.336
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.763 0.705 0.587)

	Surface
	{
		SurfStyle       0.414132
		OceanStyle      0.307155
		Randomize      (-0.459, -0.332, -0.028)
		colorDistMagn   0.944669
		colorDistFreq   0.962755
		detailScale     1093.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00712618
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57915
		terraceProb     0.185148
		erosion         0
		montesMagn      0.218017
		montesFreq      3.06458
		montesSpiky     0.880527
		montesFraction  0.537072
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.96673
		hillsFraction   0.694709
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213107
		craterFreq      0.23827
		craterDensity   0.796123
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.7717
		volcanoTemp     1689.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.282, 0.235, 0.000)
		colorShelf     (0.324, 0.299, 0.250, 0.000)
		colorBeach     (0.344, 0.317, 0.264, 0.000)
		colorDesert    (0.363, 0.335, 0.279, 0.000)
		colorLowland   (0.382, 0.352, 0.294, 0.000)
		colorUpland    (0.401, 0.370, 0.308, 0.000)
		colorRock      (0.420, 0.388, 0.323, 0.000)
		colorSnow      (0.439, 0.405, 0.338, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00695156
		Period          0.00666316
		Eccentricity    0.0727471
		Inclination     1.85054
		AscendingNode   167.336
		ArgOfPericenter 77.7242
		MeanAnomaly     -118.04
	}
}

DwarfMoon	"4.D6"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            2.92529e-008
	Radius          42.5872
	InertiaMoment   0.398062

	Oblateness      0.00163912

	RotationPeriod  123.594
	Obliquity       -0.271481
	EqAscendNode    -95.2756

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.590 0.583 0.580)

	Surface
	{
		SurfStyle       0.695066
		OceanStyle      0.75817
		Randomize      (-0.211, -0.943, -0.751)
		colorDistMagn   0.563625
		colorDistFreq   0.568696
		detailScale     1162.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00638507
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.3762
		terraceProb     0.278919
		erosion         0
		montesMagn      0.586718
		montesFreq      2.77582
		montesSpiky     0.824789
		montesFraction  0.369844
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.5789
		hillsFraction   0.627688
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244624
		craterFreq      0.185299
		craterDensity   1.03797
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   39.0391
		volcanoTemp     1579.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.198, 0.162, 0.000)
		colorShelf     (0.236, 0.204, 0.185, 0.000)
		colorBeach     (0.277, 0.239, 0.220, 0.000)
		colorDesert    (0.301, 0.257, 0.214, 0.000)
		colorLowland   (0.331, 0.274, 0.243, 0.000)
		colorUpland    (0.366, 0.332, 0.296, 0.000)
		colorRock      (0.395, 0.362, 0.319, 0.000)
		colorSnow      (0.431, 0.385, 0.336, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00721794
		Period          0.0070498
		Eccentricity    0.126222
		Inclination     -0.271481
		AscendingNode   -95.2756
		ArgOfPericenter 92.7741
		MeanAnomaly     138.932
	}
}

DwarfMoon	"4.D7"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            3.96951e-008
	Radius          44.8739
	InertiaMoment   0.399182

	Oblateness      0.00455558

	Obliquity       -22.4272
	EqAscendNode    91.9908
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.492 0.487 0.484)

	Surface
	{
		SurfStyle       0.233239
		OceanStyle      0.952689
		Randomize      (0.748, 0.028, 0.309)
		colorDistMagn   0.823909
		colorDistFreq   1.10502
		detailScale     1225.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0.511124
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.268502
		terraceProb     0.140172
		erosion         0
		montesMagn      0.448317
		montesFreq      2.09283
		montesSpiky     0.882
		montesFraction  0.349741
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.80333
		hillsFraction   0.766489
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251935
		craterFreq      0.202523
		craterDensity   1.00977
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.3128
		volcanoTemp     1424.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.195, 0.194, 0.000)
		colorShelf     (0.209, 0.207, 0.206, 0.000)
		colorBeach     (0.221, 0.219, 0.218, 0.000)
		colorDesert    (0.234, 0.231, 0.230, 0.000)
		colorLowland   (0.246, 0.244, 0.242, 0.000)
		colorUpland    (0.258, 0.256, 0.254, 0.000)
		colorRock      (0.271, 0.268, 0.266, 0.000)
		colorSnow      (0.283, 0.280, 0.278, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00776704
		Period          0.00786938
		Eccentricity    0.0638185
		Inclination     -22.4272
		AscendingNode   91.9908
		ArgOfPericenter 23.7327
		MeanAnomaly     179.14
	}
}

DwarfMoon	"4.D8"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            5.38993e-008
	Radius          58.1089
	InertiaMoment   0.395723

	Oblateness      0.0016139

	RotationPeriod  145.613
	Obliquity       76.7871
	EqAscendNode    35.9794

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.676 0.670 0.667)

	Surface
	{
		SurfStyle       0.53028
		OceanStyle      0.0125397
		Randomize      (-0.221, 0.078, -0.961)
		colorDistMagn   0.719097
		colorDistFreq   2.53025
		detailScale     1586.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.699425
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.580268
		terraceProb     0.432715
		erosion         0
		montesMagn      0.676924
		montesFreq      3.75682
		montesSpiky     0.975067
		montesFraction  0.608283
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.58731
		hillsFraction   0.74983
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235303
		craterFreq      0.216877
		craterDensity   0.723384
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   39.2426
		volcanoTemp     1183.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.228, 0.187, 0.000)
		colorShelf     (0.271, 0.234, 0.213, 0.000)
		colorBeach     (0.318, 0.275, 0.254, 0.000)
		colorDesert    (0.345, 0.295, 0.247, 0.000)
		colorLowland   (0.379, 0.315, 0.280, 0.000)
		colorUpland    (0.419, 0.382, 0.340, 0.000)
		colorRock      (0.453, 0.415, 0.367, 0.000)
		colorSnow      (0.494, 0.442, 0.387, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00805156
		Period          0.00830572
		Eccentricity    0.488311
		Inclination     76.7871
		AscendingNode   35.9794
		ArgOfPericenter 39.9159
		MeanAnomaly     -132.891
	}
}

DwarfMoon	"4.D9"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            7.32971e-008
	Radius          60.6047
	InertiaMoment   0.398253

	RotationPeriod  314.218
	Obliquity       -5.45854
	EqAscendNode    -70.5198

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.609 0.606 0.602)

	Surface
	{
		SurfStyle       0.482222
		OceanStyle      0.0193492
		Randomize      (-0.712, 0.129, 0.586)
		colorDistMagn   0.330032
		colorDistFreq   2.10288
		detailScale     1654.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0.154879
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661811
		terraceProb     0.236538
		erosion         0
		montesMagn      0.624679
		montesFreq      3.13691
		montesSpiky     0.929259
		montesFraction  0.646339
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.29878
		hillsFraction   0.725032
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264962
		craterFreq      0.245752
		craterDensity   0.816766
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.0969
		volcanoTemp     1532.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.242, 0.241, 0.000)
		colorShelf     (0.259, 0.258, 0.256, 0.000)
		colorBeach     (0.274, 0.273, 0.271, 0.000)
		colorDesert    (0.289, 0.288, 0.286, 0.000)
		colorLowland   (0.304, 0.303, 0.301, 0.000)
		colorUpland    (0.319, 0.318, 0.316, 0.000)
		colorRock      (0.335, 0.333, 0.331, 0.000)
		colorSnow      (0.350, 0.349, 0.346, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00846996
		Period          0.00896146
		Eccentricity    0.308762
		Inclination     -5.45854
		AscendingNode   -70.5198
		ArgOfPericenter 56.4559
		MeanAnomaly     145.812
	}
}

DwarfMoon	"4.D10"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            9.99175e-008
	Radius          64.502
	InertiaMoment   0.399316

	Oblateness      0.00365791

	Obliquity       -29.2256
	EqAscendNode    169.268
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.448 0.445 0.442)

	Surface
	{
		SurfStyle       0.596933
		OceanStyle      0.951905
		Randomize      (-0.484, -0.721, -0.113)
		colorDistMagn   0.570761
		colorDistFreq   2.80893
		detailScale     1761.33
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0912238
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.511979
		terraceProb     0.343529
		erosion         0
		montesMagn      0.393556
		montesFreq      2.25372
		montesSpiky     0.971802
		montesFraction  0.45387
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.6452
		hillsFraction   0.686272
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24404
		craterFreq      0.219572
		craterDensity   1.01036
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.9933
		volcanoTemp     1353.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.151, 0.124, 0.000)
		colorShelf     (0.179, 0.156, 0.141, 0.000)
		colorBeach     (0.210, 0.182, 0.168, 0.000)
		colorDesert    (0.228, 0.196, 0.164, 0.000)
		colorLowland   (0.251, 0.209, 0.186, 0.000)
		colorUpland    (0.278, 0.253, 0.225, 0.000)
		colorRock      (0.300, 0.276, 0.243, 0.000)
		colorSnow      (0.327, 0.293, 0.256, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00883167
		Period          0.00954161
		Eccentricity    0.00438354
		Inclination     -29.2256
		AscendingNode   169.268
		ArgOfPericenter -41.4311
		MeanAnomaly     -48.3192
	}
}

DwarfMoon	"4.D11"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.36666e-007
	Radius          68.3903
	InertiaMoment   0.396525

	Obliquity       -21.85
	EqAscendNode    168.101
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.538 0.530 0.524)

	Surface
	{
		SurfStyle       0.095087
		OceanStyle      0.869217
		Randomize      (0.701, -0.221, 0.197)
		colorDistMagn   0.767899
		colorDistFreq   1.67771
		detailScale     1867.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0770964
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.327483
		terraceProb     0.312412
		erosion         0
		montesMagn      0.497674
		montesFreq      2.53418
		montesSpiky     0.930098
		montesFraction  0.921363
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.8459
		hillsFraction   0.848137
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261329
		craterFreq      0.262317
		craterDensity   1.00536
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.0049
		volcanoTemp     1506.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.212, 0.210, 0.000)
		colorShelf     (0.228, 0.225, 0.223, 0.000)
		colorBeach     (0.242, 0.239, 0.236, 0.000)
		colorDesert    (0.255, 0.252, 0.249, 0.000)
		colorLowland   (0.269, 0.265, 0.262, 0.000)
		colorUpland    (0.282, 0.278, 0.275, 0.000)
		colorRock      (0.296, 0.292, 0.288, 0.000)
		colorSnow      (0.309, 0.305, 0.301, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00915167
		Period          0.0100649
		Eccentricity    0.135253
		Inclination     -21.85
		AscendingNode   168.101
		ArgOfPericenter -11.0562
		MeanAnomaly     -174.789
	}
}

DwarfMoon	"4.D12"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.87753e-007
	Radius          89.3938
	InertiaMoment   0.398429

	Oblateness      0.00384238

	Obliquity       -9.88348
	EqAscendNode    -152.949
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.756 0.686 0.584)

	Surface
	{
		SurfStyle       0.00965052
		OceanStyle      0.773766
		Randomize      (-0.515, 0.457, 0.846)
		colorDistMagn   0.142185
		colorDistFreq   4.70829
		detailScale     2441.05
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0802238
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.625821
		terraceProb     0.346706
		erosion         0
		montesMagn      0.431512
		montesFreq      3.67259
		montesSpiky     0.993
		montesFraction  0.52563
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.826
		hillsFraction   0.691138
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217304
		craterFreq      0.303785
		craterDensity   0.777278
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.3459
		volcanoTemp     1696.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.274, 0.234, 0.000)
		colorShelf     (0.321, 0.291, 0.248, 0.000)
		colorBeach     (0.340, 0.309, 0.263, 0.000)
		colorDesert    (0.359, 0.326, 0.277, 0.000)
		colorLowland   (0.378, 0.343, 0.292, 0.000)
		colorUpland    (0.397, 0.360, 0.306, 0.000)
		colorRock      (0.416, 0.377, 0.321, 0.000)
		colorSnow      (0.435, 0.394, 0.336, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00974671
		Period          0.0110623
		Eccentricity    0.446606
		Inclination     -9.88348
		AscendingNode   -152.949
		ArgOfPericenter 164.999
		MeanAnomaly     -160.416
	}
}

DwarfMoon	"4.D13"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            2.59366e-007
	Radius          92.9578
	InertiaMoment   0.399447

	Oblateness      0.00292261

	Obliquity       10.237
	EqAscendNode    27.6055
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.654 0.547 0.373)

	Surface
	{
		SurfStyle       0.810021
		OceanStyle      0.979762
		Randomize      (-0.345, 0.312, -0.335)
		colorDistMagn   0.938254
		colorDistFreq   4.70751
		detailScale     2538.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.339997
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508265
		terraceProb     0.103191
		erosion         0
		montesMagn      0.536549
		montesFreq      3.35738
		montesSpiky     0.910226
		montesFraction  0.389444
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.1997
		hillsFraction   0.522348
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262407
		craterFreq      0.239126
		craterDensity   0.908795
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.6178
		volcanoTemp     1492.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.186, 0.104, 0.000)
		colorShelf     (0.262, 0.192, 0.119, 0.000)
		colorBeach     (0.308, 0.224, 0.142, 0.000)
		colorDesert    (0.334, 0.241, 0.138, 0.000)
		colorLowland   (0.367, 0.257, 0.157, 0.000)
		colorUpland    (0.406, 0.312, 0.190, 0.000)
		colorRock      (0.438, 0.339, 0.205, 0.000)
		colorSnow      (0.478, 0.361, 0.216, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00998215
		Period          0.0114655
		Eccentricity    0.0158205
		Inclination     10.237
		AscendingNode   27.6055
		ArgOfPericenter 98.4454
		MeanAnomaly     133.739
	}
}

DwarfMoon	"4.D14"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            3.60728e-007
	Radius          99.5091
	InertiaMoment   0.396989

	Oblateness      0.0022097

	Obliquity       -54.6698
	EqAscendNode    156.965
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.561 0.557 0.554)

	Surface
	{
		SurfStyle       0.206648
		OceanStyle      0.768418
		Randomize      (-0.673, 0.425, -0.794)
		colorDistMagn   0.277868
		colorDistFreq   4.04146
		detailScale     2717.26
		colorConversion true
		snowLevel       2
		tropicLatitude  0.321435
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589943
		terraceProb     0.27865
		erosion         0
		montesMagn      0.547776
		montesFreq      3.60201
		montesSpiky     0.885718
		montesFraction  0.237095
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.5074
		hillsFraction   0.720223
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228814
		craterFreq      0.365782
		craterDensity   0.651316
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.9764
		volcanoTemp     1251.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.223, 0.222, 0.000)
		colorShelf     (0.238, 0.237, 0.235, 0.000)
		colorBeach     (0.252, 0.251, 0.249, 0.000)
		colorDesert    (0.266, 0.264, 0.263, 0.000)
		colorLowland   (0.280, 0.278, 0.277, 0.000)
		colorUpland    (0.294, 0.292, 0.291, 0.000)
		colorRock      (0.308, 0.306, 0.305, 0.000)
		colorSnow      (0.323, 0.320, 0.319, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0104759
		Period          0.0123265
		Eccentricity    0.0590453
		Inclination     -54.6698
		AscendingNode   156.965
		ArgOfPericenter -113.637
		MeanAnomaly     159.74
	}
}

DwarfMoon	"4.D15"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            5.05835e-007
	Radius          106.639
	InertiaMoment   0.398594

	RotationPeriod  333.564
	Obliquity       19.6614
	EqAscendNode    -1.01772

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.644 0.640 0.634)

	Surface
	{
		SurfStyle       0.630656
		OceanStyle      0.482222
		Randomize      (-0.716, 0.883, 0.900)
		colorDistMagn   0.777873
		colorDistFreq   7.16556
		detailScale     2911.97
		colorConversion true
		snowLevel       2
		tropicLatitude  0.633668
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.294024
		terraceProb     0.409053
		erosion         0
		montesMagn      0.662916
		montesFreq      4.42572
		montesSpiky     0.986328
		montesFraction  0.936265
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.4768
		hillsFraction   0.890233
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239777
		craterFreq      0.464564
		craterDensity   0.91899
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.5082
		volcanoTemp     1716.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.218, 0.178, 0.000)
		colorShelf     (0.258, 0.224, 0.203, 0.000)
		colorBeach     (0.303, 0.263, 0.241, 0.000)
		colorDesert    (0.328, 0.282, 0.235, 0.000)
		colorLowland   (0.361, 0.301, 0.266, 0.000)
		colorUpland    (0.399, 0.365, 0.323, 0.000)
		colorRock      (0.432, 0.397, 0.349, 0.000)
		colorSnow      (0.470, 0.423, 0.368, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0106776
		Period          0.0126843
		Eccentricity    0.0726447
		Inclination     19.6614
		AscendingNode   -1.01772
		ArgOfPericenter -52.6656
		MeanAnomaly     -129.044
	}
}

DwarfMoon	"4.D16"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            7.16335e-007
	Radius          142.472
	InertiaMoment   0.399576

	Obliquity       -22.9491
	EqAscendNode    168.859
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.598 0.591 0.588)

	Surface
	{
		SurfStyle       0.340948
		OceanStyle      0.419393
		Randomize      (0.019, 0.847, -0.824)
		colorDistMagn   0.848168
		colorDistFreq   13.184
		detailScale     3890.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0756443
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.387217
		terraceProb     0.328179
		erosion         0
		montesMagn      0.59449
		montesFreq      2.4801
		montesSpiky     0.89313
		montesFraction  0.91504
		dunesFraction   0
		hillsMagn       0
		hillsFreq       64.8831
		hillsFraction   0.573455
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276874
		craterFreq      0.791333
		craterDensity   1.03128
		craterOctaves   16
		volcanoActivity 0.146516
		volcanoFlows    0
		volcanoRadius   26.3923
		volcanoTemp     1615.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.236, 0.235, 0.000)
		colorShelf     (0.254, 0.251, 0.250, 0.000)
		colorBeach     (0.269, 0.266, 0.265, 0.000)
		colorDesert    (0.284, 0.281, 0.279, 0.000)
		colorLowland   (0.299, 0.295, 0.294, 0.000)
		colorUpland    (0.314, 0.310, 0.309, 0.000)
		colorRock      (0.329, 0.325, 0.323, 0.000)
		colorSnow      (0.344, 0.340, 0.338, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0108981
		Period          0.0130792
		Eccentricity    0.432782
		Inclination     -22.9491
		AscendingNode   168.859
		ArgOfPericenter 166.206
		MeanAnomaly     -55.8334
	}
}

DwarfMoon	"4.D17"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.02647e-006
	Radius          148.059
	InertiaMoment   0.397331

	RotationPeriod  201.516
	Obliquity       -85.0518
	EqAscendNode    61.1523

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.515 0.509 0.507)

	Surface
	{
		SurfStyle       0.26543
		OceanStyle      0.657498
		Randomize      (0.633, -0.402, 0.270)
		colorDistMagn   0.652492
		colorDistFreq   13.849
		detailScale     4043
		colorConversion true
		snowLevel       2
		tropicLatitude  0.881891
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.718349
		terraceProb     0.243008
		erosion         0
		montesMagn      0.406276
		montesFreq      3.29696
		montesSpiky     0.850335
		montesFraction  0.639893
		dunesFraction   0
		hillsMagn       0
		hillsFreq       75.2435
		hillsFraction   0.818743
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228233
		craterFreq      0.707941
		craterDensity   0.833431
		craterOctaves   16
		volcanoActivity 0.243809
		volcanoFlows    0
		volcanoRadius   22.9123
		volcanoTemp     1356.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.204, 0.203, 0.000)
		colorShelf     (0.219, 0.216, 0.216, 0.000)
		colorBeach     (0.232, 0.229, 0.228, 0.000)
		colorDesert    (0.244, 0.242, 0.241, 0.000)
		colorLowland   (0.257, 0.255, 0.254, 0.000)
		colorUpland    (0.270, 0.267, 0.266, 0.000)
		colorRock      (0.283, 0.280, 0.279, 0.000)
		colorSnow      (0.296, 0.293, 0.292, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0112912
		Period          0.0137933
		Eccentricity    0.479867
		Inclination     -85.0518
		AscendingNode   61.1523
		ArgOfPericenter -31.9657
		MeanAnomaly     1.39687
	}
}

DwarfMoon	"4.D18"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.49183e-006
	Radius          160.625
	InertiaMoment   0.39875

	RotationPeriod  381.971
	Obliquity       38.0755
	EqAscendNode    -138.003

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.554 0.550 0.544)

	Surface
	{
		SurfStyle       0.27024
		OceanStyle      0.184749
		Randomize      (-0.784, 0.791, -0.856)
		colorDistMagn   0.493296
		colorDistFreq   10.0663
		detailScale     4386.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.431054
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.549761
		terraceProb     0.632075
		erosion         0
		montesMagn      0.642998
		montesFreq      2.55925
		montesSpiky     0.938233
		montesFraction  0.759715
		dunesFraction   0
		hillsMagn       0
		hillsFreq       67.3156
		hillsFraction   0.69647
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233301
		craterFreq      0.879524
		craterDensity   0.901451
		craterOctaves   16
		volcanoActivity 0.035398
		volcanoFlows    0
		volcanoRadius   20.6186
		volcanoTemp     1736.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.220, 0.217, 0.000)
		colorShelf     (0.235, 0.234, 0.231, 0.000)
		colorBeach     (0.249, 0.248, 0.245, 0.000)
		colorDesert    (0.263, 0.261, 0.258, 0.000)
		colorLowland   (0.277, 0.275, 0.272, 0.000)
		colorUpland    (0.291, 0.289, 0.285, 0.000)
		colorRock      (0.305, 0.303, 0.299, 0.000)
		colorSnow      (0.318, 0.316, 0.313, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0116871
		Period          0.014525
		Eccentricity    0.298576
		Inclination     38.0755
		AscendingNode   -138.003
		ArgOfPericenter -42.7289
		MeanAnomaly     43.8273
	}
}

DwarfMoon	"4.D19"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            2.20537e-006
	Radius          175.468
	InertiaMoment   0.399703

	RotationPeriod  265.381
	Obliquity       -4.93883
	EqAscendNode    108.238

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.792 0.687 0.638)

	Surface
	{
		SurfStyle       0.0354093
		OceanStyle      0.951736
		Randomize      (0.544, 0.940, -0.815)
		colorDistMagn   0.267422
		colorDistFreq   21.4773
		detailScale     4791.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.10079
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.657554
		terraceProb     0.38833
		erosion         0
		montesMagn      0.407999
		montesFreq      2.98912
		montesSpiky     0.875989
		montesFraction  0.604179
		dunesFraction   0
		hillsMagn       0
		hillsFreq       81.2125
		hillsFraction   0.509893
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273901
		craterFreq      1.16119
		craterDensity   0.685937
		craterOctaves   16
		volcanoActivity 0.0274873
		volcanoFlows    0
		volcanoRadius   18.5252
		volcanoTemp     1536.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.275, 0.255, 0.000)
		colorShelf     (0.337, 0.292, 0.271, 0.000)
		colorBeach     (0.356, 0.309, 0.287, 0.000)
		colorDesert    (0.376, 0.326, 0.303, 0.000)
		colorLowland   (0.396, 0.343, 0.319, 0.000)
		colorUpland    (0.416, 0.360, 0.335, 0.000)
		colorRock      (0.436, 0.378, 0.351, 0.000)
		colorSnow      (0.455, 0.395, 0.367, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0120132
		Period          0.0151372
		Eccentricity    0.286893
		Inclination     -4.93883
		AscendingNode   108.238
		ArgOfPericenter 94.1349
		MeanAnomaly     -149.312
	}
}

Moon	"4.1"
{
	ParentBody     "4"
	Class	       "IceWorld"

	Mass            3.32818e-006
	Radius          245.381
	InertiaMoment   0.397609

	RotationPeriod  848.661
	Obliquity       57.6686
	EqAscendNode    -26.3301

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.614 0.608 0.601)

	Surface
	{
		SurfStyle       0.695808
		OceanStyle      0.552134
		Randomize      (0.805, -0.841, -0.165)
		colorDistMagn   0.0910983
		colorDistFreq   29.2033
		detailScale     631.133
		colorConversion true
		drivenDarkening -0.551834
		seaLevel        0.232354
		snowLevel       2
		tropicLatitude  0.935294
		icecapLatitude  1
		icecapHeight    0.232354
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.73476
		venusFreq       1.24254
		venusMagn       0.196812
		mareFreq        0
		mareDensity     6.54898e-007
		terraceProb     0.192148
		erosion         0
		montesMagn      0.066323
		montesFreq      12.3236
		montesSpiky     0.880923
		montesFraction  0.614005
		dunesMagn       0.0332958
		dunesFreq       327.961
		dunesFraction   0.321714
		hillsMagn       0.105394
		hillsFreq       24.2422
		hillsFraction   0.61894
		hills2Fraction  0.26698
		riversMagn      61.8147
		riversFreq      2.36741
		riversSin       4.16453
		riversOctaves   0
		canyonsMagn     0.342937
		canyonsFreq     0.105228
		canyonFraction  0
		cracksMagn      0.0594058
		cracksFreq      0.110257
		cracksOctaves   0
		craterMagn      0.999349
		craterFreq      0.757619
		craterDensity   0.817149
		craterOctaves   8
		craterRayedFactor 0.170418
		volcanoMagn     0.21885
		volcanoFreq     0.80575
		volcanoDensity  0.0536595
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.271252
		volcanoRadius   4.24798
		volcanoTemp     1607.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.393, 0.389, 0.403, 0.250)
		colorShelf     (0.430, 0.444, 0.457, 0.250)
		colorBeach     (0.350, 0.328, 0.349, 0.200)
		colorDesert    (0.325, 0.298, 0.307, 0.200)
		colorLowland   (0.239, 0.231, 0.252, 0.200)
		colorUpland    (0.454, 0.450, 0.457, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.239, 0.231, 0.252, 0.200)
		colorUpPlants  (0.454, 0.450, 0.457, 0.250)
		BumpHeight      12.269
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
		SemiMajorAxis   0.0125359
		Period          0.0161358
		Eccentricity    0.457671
		Inclination     57.6686
		AscendingNode   -26.3301
		ArgOfPericenter -42.8719
		MeanAnomaly     24.8096
	}
}

Moon	"4.2"
{
	ParentBody     "4"
	Class	       "IceWorld"

	Mass            5.15136e-006
	Radius          255.376
	InertiaMoment   0.398898

	RotationPeriod  442.339
	Obliquity       -57.0687
	EqAscendNode    170.923

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.798 0.741 0.653)

	Surface
	{
		SurfStyle       0.380212
		OceanStyle      0.862529
		Randomize      (-0.035, -0.258, 0.572)
		colorDistMagn   0.0591114
		colorDistFreq   36.4589
		detailScale     656.841
		colorConversion true
		drivenDarkening -0.536753
		seaLevel        0.141151
		snowLevel       2
		tropicLatitude  0.132536
		icecapLatitude  1
		icecapHeight    0.141151
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.83869
		venusFreq       0.73704
		venusMagn       0.217358
		mareFreq        0
		mareDensity     1.43633e-006
		terraceProb     0.232141
		erosion         0
		montesMagn      0.0508859
		montesFreq      14.9973
		montesSpiky     0.9642
		montesFraction  0.324747
		dunesMagn       0.0546211
		dunesFreq       340.674
		dunesFraction   0.167018
		hillsMagn       0.102016
		hillsFreq       23.7966
		hillsFraction   0.087785
		hills2Fraction  0.182203
		riversMagn      57.0292
		riversFreq      3.36184
		riversSin       4.62055
		riversOctaves   0
		canyonsMagn     0.289423
		canyonsFreq     0.101649
		canyonFraction  0
		cracksMagn      0.0459527
		cracksFreq      0.12182
		cracksOctaves   0
		craterMagn      0.910684
		craterFreq      0.576553
		craterDensity   0.949776
		craterOctaves   8
		craterRayedFactor 0.31382
		volcanoMagn     0.212699
		volcanoFreq     0.892394
		volcanoDensity  0.0597437
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.230833
		volcanoRadius   3.93569
		volcanoTemp     1362.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.798, 0.741, 0.653, 0.500)
		colorShelf     (0.758, 0.704, 0.620, 0.500)
		colorBeach     (0.559, 0.519, 0.457, 0.750)
		colorDesert    (0.679, 0.630, 0.555, 1.000)
		colorLowland   (0.703, 0.652, 0.574, 1.000)
		colorUpland    (0.742, 0.689, 0.607, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.703, 0.652, 0.574, 1.000)
		colorUpPlants  (0.742, 0.689, 0.607, 1.000)
		BumpHeight      12.7688
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
		SemiMajorAxis   0.0128881
		Period          0.0168206
		Eccentricity    0.439767
		Inclination     -57.0687
		AscendingNode   170.923
		ArgOfPericenter 103.454
		MeanAnomaly     -101.118
	}
}

DwarfMoon	"4.D20"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.53818e-011
	Radius          3.5158
	InertiaMoment   0.399829

	Obliquity       -71.3486
	EqAscendNode    -174.866
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.684 0.634 0.595)

	Surface
	{
		SurfStyle       0.316927
		OceanStyle      0.713111
		Randomize      (0.388, 0.068, -0.114)
		colorDistMagn   0.774799
		colorDistFreq   0.0088961
		detailScale     96.0048
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0847911
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.294631
		terraceProb     0.599896
		erosion         0
		montesMagn      0.592222
		montesFreq      3.38904
		montesSpiky     0.934927
		montesFraction  0.922269
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0250756
		hillsFraction   0.703157
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204794
		craterFreq      0.250334
		craterDensity   0.816804
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   140.549
		volcanoTemp     1404.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.253, 0.238, 0.000)
		colorShelf     (0.291, 0.269, 0.253, 0.000)
		colorBeach     (0.308, 0.285, 0.268, 0.000)
		colorDesert    (0.325, 0.301, 0.283, 0.000)
		colorLowland   (0.342, 0.317, 0.298, 0.000)
		colorUpland    (0.359, 0.333, 0.313, 0.000)
		colorRock      (0.376, 0.349, 0.327, 0.000)
		colorSnow      (0.394, 0.364, 0.342, 1.000)
		BumpHeight      3.16422
		BumpOffset      0.632844
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0135056
		Period          0.0180438
		Eccentricity    0.259121
		Inclination     -71.3486
		AscendingNode   -174.866
		ArgOfPericenter 96.0805
		MeanAnomaly     -44.165
	}
}

DwarfMoon	"4.D21"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            3.03623e-011
	Radius          4.23352
	InertiaMoment   0.397847

	Obliquity       55.0377
	EqAscendNode    137.102
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.685 0.683 0.681)

	Surface
	{
		SurfStyle       0.208931
		OceanStyle      0.850572
		Randomize      (-0.785, 0.621, -0.753)
		colorDistMagn   0.784402
		colorDistFreq   0.0146272
		detailScale     115.603
		colorConversion true
		snowLevel       2
		tropicLatitude  0.571814
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404766
		terraceProb     0.119717
		erosion         0
		montesMagn      0.436518
		montesFreq      3.2441
		montesSpiky     0.998476
		montesFraction  0.448756
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.054005
		hillsFraction   0.474806
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241367
		craterFreq      0.237364
		craterDensity   0.681339
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   120.459
		volcanoTemp     1376.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.273, 0.272, 0.000)
		colorShelf     (0.291, 0.290, 0.289, 0.000)
		colorBeach     (0.308, 0.307, 0.306, 0.000)
		colorDesert    (0.325, 0.325, 0.323, 0.000)
		colorLowland   (0.343, 0.342, 0.340, 0.000)
		colorUpland    (0.360, 0.359, 0.357, 0.000)
		colorRock      (0.377, 0.376, 0.374, 0.000)
		colorSnow      (0.394, 0.393, 0.391, 1.000)
		BumpHeight      3.81017
		BumpOffset      0.762033
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0138119
		Period          0.0186611
		Eccentricity    0.212253
		Inclination     55.0377
		AscendingNode   137.102
		ArgOfPericenter 176.84
		MeanAnomaly     169.445
	}
}

DwarfMoon	"4.D22"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            5.50377e-011
	Radius          7.06904
	InertiaMoment   0.399041

	RotationPeriod  348.828
	Obliquity       -25.6016
	EqAscendNode    69.2709

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.672 0.630 0.560)

	Surface
	{
		SurfStyle       0.950796
		OceanStyle      0.321618
		Randomize      (-0.655, -0.395, -0.033)
		colorDistMagn   0.935276
		colorDistFreq   0.037042
		detailScale     193.032
		colorConversion true
		snowLevel       2
		tropicLatitude  0.66461
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515675
		terraceProb     0.391891
		erosion         0
		montesMagn      0.431045
		montesFreq      3.31431
		montesSpiky     0.872717
		montesFraction  0.562624
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.133725
		hillsFraction   0.598571
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259242
		craterFreq      0.230166
		craterDensity   0.80738
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   149.395
		volcanoTemp     1115.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.221, 0.224, 0.050)
		colorShelf     (0.269, 0.258, 0.258, 0.040)
		colorBeach     (0.309, 0.296, 0.291, 0.030)
		colorDesert    (0.349, 0.334, 0.331, 0.020)
		colorLowland   (0.390, 0.372, 0.364, 0.030)
		colorUpland    (0.430, 0.410, 0.398, 0.050)
		colorRock      (0.470, 0.448, 0.443, 0.020)
		colorSnow      (0.470, 0.448, 0.443, 1.000)
		BumpHeight      6.36214
		BumpOffset      1.27243
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0144152
		Period          0.0198971
		Eccentricity    0.101757
		Inclination     -25.6016
		AscendingNode   69.2709
		ArgOfPericenter 78.6354
		MeanAnomaly     -50.2846
	}
}

DwarfMoon	"4.D23"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            9.38555e-011
	Radius          6.77421
	InertiaMoment   0.399954

	Obliquity       -23.7363
	EqAscendNode    -96.7383
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.572 0.482 0.325)

	Surface
	{
		SurfStyle       0.51821
		OceanStyle      0.248599
		Randomize      (0.095, 0.343, 0.505)
		colorDistMagn   0.551166
		colorDistFreq   0.0369875
		detailScale     184.981
		colorConversion true
		snowLevel       2
		tropicLatitude  0.515346
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.459121
		terraceProb     0.256515
		erosion         0
		montesMagn      0.285227
		montesFreq      2.59769
		montesSpiky     0.936204
		montesFraction  0.473168
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.116615
		hillsFraction   0.840087
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228764
		craterFreq      0.213806
		craterDensity   0.721809
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   109.631
		volcanoTemp     1512.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.164, 0.091, 0.000)
		colorShelf     (0.229, 0.169, 0.104, 0.000)
		colorBeach     (0.269, 0.198, 0.124, 0.000)
		colorDesert    (0.292, 0.212, 0.120, 0.000)
		colorLowland   (0.320, 0.226, 0.137, 0.000)
		colorUpland    (0.355, 0.275, 0.166, 0.000)
		colorRock      (0.383, 0.299, 0.179, 0.000)
		colorSnow      (0.418, 0.318, 0.189, 1.000)
		BumpHeight      6.09679
		BumpOffset      1.21936
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0150631
		Period          0.0212533
		Eccentricity    0.156732
		Inclination     -23.7363
		AscendingNode   -96.7383
		ArgOfPericenter -168.242
		MeanAnomaly     168.404
	}
}

DwarfMoon	"4.D24"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.52878e-010
	Radius          7.60242
	InertiaMoment   0.398058

	Oblateness      0.00163135

	RotationPeriod  129.255
	Obliquity       -80.2127
	EqAscendNode    -176.863

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.681 0.680 0.678)

	Surface
	{
		SurfStyle       0.42886
		OceanStyle      0.277367
		Randomize      (0.634, 0.036, -0.536)
		colorDistMagn   0.655363
		colorDistFreq   0.0174591
		detailScale     207.597
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0539216
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.317184
		terraceProb     0.109657
		erosion         0
		montesMagn      0.483688
		montesFreq      3.06464
		montesSpiky     0.91827
		montesFraction  0.556133
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.124523
		hillsFraction   0.765829
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249721
		craterFreq      0.228434
		craterDensity   0.815203
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   96.4018
		volcanoTemp     1346.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.272, 0.271, 0.000)
		colorShelf     (0.290, 0.289, 0.288, 0.000)
		colorBeach     (0.307, 0.306, 0.305, 0.000)
		colorDesert    (0.324, 0.323, 0.322, 0.000)
		colorLowland   (0.341, 0.340, 0.339, 0.000)
		colorUpland    (0.358, 0.357, 0.356, 0.000)
		colorRock      (0.375, 0.374, 0.373, 0.000)
		colorSnow      (0.392, 0.391, 0.390, 1.000)
		BumpHeight      6.84218
		BumpOffset      1.36844
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0154689
		Period          0.0221181
		Eccentricity    0.332413
		Inclination     -80.2127
		AscendingNode   -176.863
		ArgOfPericenter 45.2066
		MeanAnomaly     166.522
	}
}

DwarfMoon	"4.D25"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            2.40312e-010
	Radius          8.48988
	InertiaMoment   0.399179

	RotationPeriod  618.451
	Obliquity       -68.1907
	EqAscendNode    -142.03

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.642 0.541 0.397)

	Surface
	{
		SurfStyle       0.637299
		OceanStyle      0.829772
		Randomize      (-0.950, -0.502, 0.706)
		colorDistMagn   0.218461
		colorDistFreq   0.0221506
		detailScale     231.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.57586
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.635581
		terraceProb     0.634088
		erosion         0
		montesMagn      0.346626
		montesFreq      2.54761
		montesSpiky     0.931595
		montesFraction  0.159677
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.179443
		hillsFraction   0.394977
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241839
		craterFreq      0.211382
		craterDensity   0.993465
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   85.8658
		volcanoTemp     1132.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.184, 0.111, 0.000)
		colorShelf     (0.257, 0.189, 0.127, 0.000)
		colorBeach     (0.302, 0.222, 0.151, 0.000)
		colorDesert    (0.328, 0.238, 0.147, 0.000)
		colorLowland   (0.360, 0.254, 0.167, 0.000)
		colorUpland    (0.398, 0.309, 0.203, 0.000)
		colorRock      (0.430, 0.336, 0.218, 0.000)
		colorSnow      (0.469, 0.357, 0.230, 1.000)
		BumpHeight      7.6409
		BumpOffset      1.52818
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0161147
		Period          0.0235175
		Eccentricity    0.186942
		Inclination     -68.1907
		AscendingNode   -142.03
		ArgOfPericenter -34.804
		MeanAnomaly     21.7276
	}
}

DwarfMoon	"4.D26"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            3.67215e-010
	Radius          9.1482
	InertiaMoment   0.395696

	Obliquity       -63.6929
	EqAscendNode    -156.149
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.651 0.533 0.493)

	Surface
	{
		SurfStyle       0.331864
		OceanStyle      0.384897
		Randomize      (-0.724, 0.109, -0.437)
		colorDistMagn   0.25842
		colorDistFreq   0.0173816
		detailScale     249.807
		colorConversion true
		snowLevel       2
		tropicLatitude  0.364069
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.730687
		terraceProb     0.107912
		erosion         0
		montesMagn      0.691255
		montesFreq      3.58704
		montesSpiky     0.989278
		montesFraction  0.716562
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.227448
		hillsFraction   0.683728
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241668
		craterFreq      0.248599
		craterDensity   1.00945
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   74.8482
		volcanoTemp     1399.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.213, 0.197, 0.000)
		colorShelf     (0.277, 0.226, 0.210, 0.000)
		colorBeach     (0.293, 0.240, 0.222, 0.000)
		colorDesert    (0.309, 0.253, 0.234, 0.000)
		colorLowland   (0.326, 0.266, 0.246, 0.000)
		colorUpland    (0.342, 0.280, 0.259, 0.000)
		colorRock      (0.358, 0.293, 0.271, 0.000)
		colorSnow      (0.374, 0.306, 0.283, 1.000)
		BumpHeight      8.23338
		BumpOffset      1.64668
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0165502
		Period          0.0244772
		Eccentricity    0.0635181
		Inclination     -63.6929
		AscendingNode   -156.149
		ArgOfPericenter 130.643
		MeanAnomaly     109.899
	}
}

DwarfMoon	"4.D27"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            5.48425e-010
	Radius          12.3108
	InertiaMoment   0.398249

	RotationPeriod  441.484
	Obliquity       -17.8281
	EqAscendNode    -29.8108

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.753 0.626 0.550)

	Surface
	{
		SurfStyle       0.633555
		OceanStyle      0.159478
		Randomize      (0.480, 0.636, 0.107)
		colorDistMagn   0.886257
		colorDistFreq   0.0591065
		detailScale     336.166
		colorConversion true
		snowLevel       2
		tropicLatitude  0.565231
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.323496
		terraceProb     0.252739
		erosion         0
		montesMagn      0.416051
		montesFreq      3.44386
		montesSpiky     0.972394
		montesFraction  0.574017
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.337786
		hillsFraction   0.723891
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239638
		craterFreq      0.221322
		craterDensity   0.749243
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   82.42
		volcanoTemp     1359.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.213, 0.154, 0.000)
		colorShelf     (0.301, 0.219, 0.176, 0.000)
		colorBeach     (0.354, 0.256, 0.209, 0.000)
		colorDesert    (0.384, 0.275, 0.203, 0.000)
		colorLowland   (0.422, 0.294, 0.231, 0.000)
		colorUpland    (0.467, 0.357, 0.280, 0.000)
		colorRock      (0.505, 0.388, 0.302, 0.000)
		colorSnow      (0.550, 0.413, 0.319, 1.000)
		BumpHeight      11.0797
		BumpOffset      2.21594
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0168664
		Period          0.0251821
		Eccentricity    0.263204
		Inclination     -17.8281
		AscendingNode   -29.8108
		ArgOfPericenter -177.842
		MeanAnomaly     -91.0661
	}
}

DwarfPlanet	"5"
{
	ParentBody     "Barnard's Star"
	Class	       "IceWorld"

	Mass            0.00582054
	Radius          1572.99
	InertiaMoment   0.388276

	RotationPeriod  13060.5
	Obliquity       -1.17514
	EqAscendNode    82.6918

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.580 0.503 0.403)

	Surface
	{
		SurfStyle       0.602321
		OceanStyle      0.217633
		Randomize      (0.892, -0.497, 0.347)
		colorDistMagn   0.0517666
		colorDistFreq   209.188
		detailScale     4045.83
		colorConversion true
		drivenDarkening 0
		seaLevel        0.208624
		snowLevel       2
		tropicLatitude  0.0307891
		icecapLatitude  0.625509
		icecapHeight    0.239241
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.65233
		venusFreq       0.914645
		venusMagn       0.208109
		mareFreq        0.77841
		mareDensity     0.00121806
		terraceProb     0.287901
		erosion         0
		montesMagn      0.0521631
		montesFreq      55.2561
		montesSpiky     0.943886
		montesFraction  0.665631
		dunesMagn       0.0358595
		dunesFreq       2060.04
		dunesFraction   0.446331
		hillsMagn       0.148462
		hillsFreq       199.229
		hillsFraction   0.79732
		hills2Fraction  0.111387
		riversMagn      56.756
		riversFreq      3.2895
		riversSin       6.64957
		riversOctaves   0
		canyonsMagn     0.447133
		canyonsFreq     0.624737
		canyonFraction  0
		cracksMagn      0.0313115
		cracksFreq      0.460505
		cracksOctaves   0
		craterMagn      0.604132
		craterFreq      4.79186
		craterDensity   0.990836
		craterOctaves   11
		craterRayedFactor 0.380087
		volcanoMagn     0.242691
		volcanoFreq     1.06265
		volcanoDensity  0.0520697
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.3284
		volcanoRadius   0.858781
		volcanoTemp     1450.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.151, 0.096, 0.044, 1.000)
		colorShelf     (0.197, 0.131, 0.064, 1.000)
		colorBeach     (0.319, 0.171, 0.069, 0.200)
		colorDesert    (0.348, 0.191, 0.081, 0.200)
		colorLowland   (0.377, 0.201, 0.085, 0.200)
		colorUpland    (0.406, 0.241, 0.101, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.377, 0.201, 0.085, 0.200)
		colorUpPlants  (0.406, 0.241, 0.101, 0.200)
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
		SemiMajorAxis   0.271347
		Period          0.372484
		Eccentricity    0.0601888
		Inclination     -0.412369
		AscendingNode   81.0704
		ArgOfPericenter 198.952
		MeanAnomaly     356.514
	}
}

Planet	"6"
{
	ParentBody     "Barnard's Star"
	Class	       "IceGiant"

	Mass            45.7941
	Radius          27268.2
	InertiaMoment   0.260474

	Oblateness      0.0343391

	RotationPeriod  8.61325
	Obliquity       -75.8141
	EqAscendNode    157.231

	AlbedoBond      0.413124
	AlbedoGeom      0.495748
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.507922
		Randomize      (-0.852, -0.811, -0.406)
		detailScale     70135.5
		colorConversion true
		tropicLatitude  0.971401
		icecapLatitude  1
		mainFreq        0.0253966
		venusFreq       1.45499
		venusMagn       0.424024
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      7.17267
		twistMagn       0.663207
		cycloneMagn     19.0465
		cycloneFreq     0.320711
		cycloneDensity  0.106321
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
		BumpHeight      12.6354
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          62.6016
		BumpHeight      64.508
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.902885
		mainOctaves     10
		Coverage        0.0656181
		twistZones      7.17267
		twistMagn       0.663207
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          262.471
		Density         8469.32
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.00230091
		Saturation      0.773669

		Composition
		{
			H2    	93.2989
			He    	6.65929
			N2    	0.0381666
			O2    	0.00162581
			Ne    	0.00105232
			Ar    	0.000868507
			CH4   	0.000105861
		}
	}

	Aurora
	{
		Height      410.725
		NorthLat    69.1966
		NorthLon    -150.261
		NorthRadius 6043.43
		NorthWidth  6287.22
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -87.6771
		SouthLon    -13.3173
		SouthRadius 5450.07
		SouthWidth  5400.82
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
		SemiMajorAxis   0.589673
		Period          1.1927
		Eccentricity    0.0735625
		Inclination     0.484076
		AscendingNode   158.365
		ArgOfPericenter 138.565
		MeanAnomaly     354.856
	}
}

DwarfMoon	"6.D1"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.94215e-007
	Radius          88.13
	InertiaMoment   0.398973

	Oblateness      0.249

	Obliquity       0.00379199
	EqAscendNode    -46.2241
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.515 0.512 0.507)

	Surface
	{
		SurfStyle       0.358535
		OceanStyle      0.447761
		Randomize      (0.937, -0.213, 0.869)
		colorDistMagn   0.845257
		colorDistFreq   5.81553
		detailScale     2406.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.499754
		terraceProb     0.213669
		erosion         0
		montesMagn      0.698002
		montesFreq      3.56621
		montesSpiky     0.924312
		montesFraction  0.948661
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.9351
		hillsFraction   0.532282
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256126
		craterFreq      0.241625
		craterDensity   0.791807
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.3537
		volcanoTemp     1468.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.205, 0.203, 0.000)
		colorShelf     (0.219, 0.218, 0.216, 0.000)
		colorBeach     (0.232, 0.231, 0.228, 0.000)
		colorDesert    (0.245, 0.243, 0.241, 0.000)
		colorLowland   (0.258, 0.256, 0.254, 0.000)
		colorUpland    (0.271, 0.269, 0.266, 0.000)
		colorRock      (0.283, 0.282, 0.279, 0.000)
		colorSnow      (0.296, 0.295, 0.292, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000488981
		Period          0.000924087
		Eccentricity    2.68127e-005
		Inclination     0.00379199
		AscendingNode   -46.2241
		ArgOfPericenter 65.1018
		MeanAnomaly     -132.385
	}
}

DwarfMoon	"6.D2"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.68467e-007
	Radius          92.8988
	InertiaMoment   0.399893

	Oblateness      0.249

	Obliquity       0.00969303
	EqAscendNode    74.7368
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.811 0.773 0.715)

	Surface
	{
		SurfStyle       0.61996
		OceanStyle      0.533773
		Randomize      (0.303, -0.967, -0.471)
		colorDistMagn   0.0280935
		colorDistFreq   4.88672
		detailScale     2536.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.429354
		terraceProb     0.10766
		erosion         0
		montesMagn      0.693924
		montesFreq      3.71395
		montesSpiky     0.877725
		montesFraction  0.165073
		dunesFraction   0
		hillsMagn       0
		hillsFreq       26.0148
		hillsFraction   0.626325
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222973
		craterFreq      0.332121
		craterDensity   1.0028
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.1106
		volcanoTemp     1664.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.263, 0.200, 0.000)
		colorShelf     (0.324, 0.270, 0.229, 0.000)
		colorBeach     (0.381, 0.317, 0.272, 0.000)
		colorDesert    (0.413, 0.340, 0.265, 0.000)
		colorLowland   (0.454, 0.363, 0.300, 0.000)
		colorUpland    (0.503, 0.440, 0.365, 0.000)
		colorRock      (0.543, 0.479, 0.393, 0.000)
		colorSnow      (0.592, 0.510, 0.415, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000527473
		Period          0.00103532
		Eccentricity    4.51228e-005
		Inclination     0.00969303
		AscendingNode   74.7368
		ArgOfPericenter -14.1369
		MeanAnomaly     155.788
	}
}

DwarfMoon	"6.D3"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.73684e-007
	Radius          99.6134
	InertiaMoment   0.397958

	Oblateness      0.233988

	Obliquity       -0.00284081
	EqAscendNode    136.635
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.683 0.677 0.674)

	Surface
	{
		SurfStyle       0.835441
		OceanStyle      0.762808
		Randomize      (0.070, -0.435, 0.157)
		colorDistMagn   0.872551
		colorDistFreq   8.32998
		detailScale     2720.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.62214
		terraceProb     0.346936
		erosion         0
		montesMagn      0.498607
		montesFreq      2.41876
		montesSpiky     0.97173
		montesFraction  0.675299
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.2409
		hillsFraction   0.696612
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230498
		craterFreq      0.313351
		craterDensity   0.848897
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.5488
		volcanoTemp     1472.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.230, 0.189, 0.000)
		colorShelf     (0.273, 0.237, 0.216, 0.000)
		colorBeach     (0.321, 0.278, 0.256, 0.000)
		colorDesert    (0.348, 0.298, 0.249, 0.000)
		colorLowland   (0.382, 0.318, 0.283, 0.000)
		colorUpland    (0.423, 0.386, 0.344, 0.000)
		colorRock      (0.457, 0.420, 0.371, 0.000)
		colorSnow      (0.498, 0.447, 0.391, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000575834
		Period          0.00118092
		Eccentricity    9.71183e-005
		Inclination     -0.00284081
		AscendingNode   136.635
		ArgOfPericenter 174.185
		MeanAnomaly     76.9292
	}
}

DwarfMoon	"6.D4"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            5.24505e-007
	Radius          106.199
	InertiaMoment   0.399113

	Oblateness      0.170616

	Obliquity       0.0128902
	EqAscendNode    157.484
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.592 0.589 0.585)

	Surface
	{
		SurfStyle       0.191352
		OceanStyle      0.754943
		Randomize      (0.833, -0.360, -0.735)
		colorDistMagn   0.507972
		colorDistFreq   8.70689
		detailScale     2899.95
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.672139
		terraceProb     0.196007
		erosion         0
		montesMagn      0.406136
		montesFreq      3.09744
		montesSpiky     0.826155
		montesFraction  0.401196
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.0195
		hillsFraction   0.703211
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252054
		craterFreq      0.391392
		craterDensity   0.817281
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.9907
		volcanoTemp     1629.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.236, 0.234, 0.000)
		colorShelf     (0.252, 0.250, 0.249, 0.000)
		colorBeach     (0.267, 0.265, 0.263, 0.000)
		colorDesert    (0.281, 0.280, 0.278, 0.000)
		colorLowland   (0.296, 0.295, 0.293, 0.000)
		colorUpland    (0.311, 0.309, 0.307, 0.000)
		colorRock      (0.326, 0.324, 0.322, 0.000)
		colorSnow      (0.341, 0.339, 0.337, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000610058
		Period          0.00128775
		Eccentricity    8.63114e-007
		Inclination     0.0128902
		AscendingNode   157.484
		ArgOfPericenter 156.572
		MeanAnomaly     76.1755
	}
}

Moon	"6.1"
{
	ParentBody     "6"
	Class	       "Selena"

	Mass            0.0135931
	Radius          2077.91
	InertiaMoment   0.369392

	Oblateness      0.0164987

	Obliquity       0.622389
	EqAscendNode    134.331
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.660 0.658 0.656)

	Surface
	{
		SurfStyle       0.935223
		OceanStyle      0.28446
		Randomize      (-0.289, -0.570, -0.592)
		colorDistMagn   0.0539133
		colorDistFreq   294.91
		detailScale     5344.49
		colorConversion true
		drivenDarkening 0
		seaLevel        0.240036
		snowLevel       2
		tropicLatitude  0.00842897
		icecapLatitude  10
		icecapHeight    0.158935
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.00319
		venusFreq       1.40161
		venusMagn       0
		mareFreq        0.925757
		mareDensity     0.00211488
		terraceProb     0.250917
		erosion         0
		montesMagn      0.130518
		montesFreq      111.225
		montesSpiky     0.991381
		montesFraction  0.827272
		dunesMagn       0.0321967
		dunesFreq       2832.73
		dunesFraction   0.0254896
		hillsMagn       0.135423
		hillsFreq       269.04
		hillsFraction   0.354988
		hills2Fraction  0
		riversMagn      59.7572
		riversFreq      2.29222
		riversSin       6.03416
		riversOctaves   0
		canyonsMagn     0.646122
		canyonsFreq     0.783516
		canyonFraction  0.173345
		cracksMagn      0.0695532
		cracksFreq      0.681103
		cracksOctaves   0
		craterMagn      0.625569
		craterFreq      5.85793
		craterDensity   0.441191
		craterOctaves   6.22718
		craterRayedFactor 0.0537542
		volcanoMagn     0.40015
		volcanoFreq     2.81166
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.112919
		volcanoRadius   0.654717
		volcanoTemp     1512.08
		lavaCoverTidal  0.482103
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.440, 0.450, 0.370, 0.000)
		colorShelf     (0.580, 0.550, 0.430, 0.000)
		colorBeach     (0.469, 0.434, 0.380, 0.000)
		colorDesert    (0.548, 0.507, 0.420, 0.000)
		colorLowland   (0.436, 0.382, 0.315, 0.000)
		colorUpland    (0.389, 0.342, 0.295, 0.000)
		colorRock      (0.330, 0.250, 0.230, 0.000)
		colorSnow      (0.940, 0.910, 0.870, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999989
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
		Height          155.843
		Density         1.06517e-006
		Pressure        5.3587e-007
		Greenhouse      0.00484388
		Bright          1.01271
		Opacity         0
		SkyLight        0.337569
		Hue             -0.0140142
		Saturation      1

		Composition
		{
			SO2   	99.9958
			Cl2   	0.00388314
			Kr    	0.000282983
			Xe    	2.7726e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000846872
		Period          0.00210589
		Eccentricity    0.0234385
		Inclination     0.622389
		AscendingNode   134.331
		ArgOfPericenter -150.835
		MeanAnomaly     -142.087
	}
}

Moon	"6.2"
{
	ParentBody     "6"
	Class	       "IceWorld"

	Mass            0.016412
	Radius          2079.12
	InertiaMoment   0.364243

	Oblateness      0.00190917

	Obliquity       -0.346109
	EqAscendNode    23.0728
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.864 0.770 0.712)

	Surface
	{
		SurfStyle       0.603008
		OceanStyle      0.605535
		Randomize      (-0.236, -0.780, 0.029)
		colorDistMagn   0.0430913
		colorDistFreq   315.824
		detailScale     5347.62
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.19974
		snowLevel       2
		tropicLatitude  0.0118349
		icecapLatitude  0.708135
		icecapHeight    0.208249
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.85232
		venusFreq       1.14878
		venusMagn       0
		mareFreq        1.2023
		mareDensity     0.00403348
		terraceProb     0.141047
		erosion         0
		montesMagn      0.147398
		montesFreq      89.2899
		montesSpiky     0.958293
		montesFraction  0.555299
		dunesMagn       0.0425196
		dunesFreq       2819.92
		dunesFraction   0.551107
		hillsMagn       0.138675
		hillsFreq       232.939
		hillsFraction   0.718876
		hills2Fraction  0.283947
		riversMagn      61.7354
		riversFreq      3.86676
		riversSin       5.16414
		riversOctaves   0
		canyonsMagn     0.529325
		canyonsFreq     0.709645
		canyonFraction  0
		cracksMagn      0.0562858
		cracksFreq      1.08079
		cracksOctaves   2
		craterMagn      0.607905
		craterFreq      4.88146
		craterDensity   0.872264
		craterOctaves   11
		craterRayedFactor 0.0781893
		volcanoMagn     0.377792
		volcanoFreq     1.14141
		volcanoDensity  0.0525497
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.030659
		volcanoRadius   0.726086
		volcanoTemp     1610.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.146, 0.078, 1.000)
		colorShelf     (0.294, 0.200, 0.114, 1.000)
		colorBeach     (0.475, 0.262, 0.121, 0.200)
		colorDesert    (0.519, 0.292, 0.142, 0.200)
		colorLowland   (0.562, 0.308, 0.150, 0.200)
		colorUpland    (0.605, 0.369, 0.178, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.562, 0.308, 0.150, 0.200)
		colorUpPlants  (0.605, 0.369, 0.178, 0.200)
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
		SemiMajorAxis   0.00162265
		Period          0.00558516
		Eccentricity    0.000610364
		Inclination     -0.346109
		AscendingNode   23.0728
		ArgOfPericenter 87.3836
		MeanAnomaly     173.89
	}
}

DwarfMoon	"6.D5"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.55336e-006
	Radius          161.079
	InertiaMoment   0.399249

	Obliquity       -62.412
	EqAscendNode    152.773
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.841 0.751 0.709)

	Surface
	{
		SurfStyle       0.19003
		OceanStyle      0.665158
		Randomize      (0.682, -0.979, -0.329)
		colorDistMagn   0.600095
		colorDistFreq   9.07425
		detailScale     4398.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.408043
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.477964
		terraceProb     0.424627
		erosion         0
		montesMagn      0.380221
		montesFreq      2.27936
		montesSpiky     0.957714
		montesFraction  0.431165
		dunesFraction   0
		hillsMagn       0
		hillsFreq       79.866
		hillsFraction   0.602506
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.198948
		craterFreq      0.859564
		craterDensity   0.902957
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   20.2633
		volcanoTemp     1369.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.336, 0.300, 0.284, 0.000)
		colorShelf     (0.357, 0.319, 0.301, 0.000)
		colorBeach     (0.378, 0.338, 0.319, 0.000)
		colorDesert    (0.399, 0.357, 0.337, 0.000)
		colorLowland   (0.420, 0.375, 0.354, 0.000)
		colorUpland    (0.441, 0.394, 0.372, 0.000)
		colorRock      (0.462, 0.413, 0.390, 0.000)
		colorSnow      (0.483, 0.432, 0.408, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00744927
		Period          0.0549471
		Eccentricity    0.0418525
		Inclination     -62.412
		AscendingNode   152.773
		ArgOfPericenter 179.946
		MeanAnomaly     -64.9149
	}
}

DwarfMoon	"6.D6"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.30091e-006
	Radius          175.439
	InertiaMoment   0.396194

	Obliquity       4.62771
	EqAscendNode    174.792
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.430 0.425 0.423)

	Surface
	{
		SurfStyle       0.642494
		OceanStyle      0.908053
		Randomize      (-0.509, -0.171, -0.940)
		colorDistMagn   0.929161
		colorDistFreq   14.4118
		detailScale     4790.65
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0073323
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512508
		terraceProb     0.184109
		erosion         0
		montesMagn      0.478527
		montesFreq      3.29856
		montesSpiky     0.936787
		montesFraction  0.779223
		dunesFraction   0
		hillsMagn       0
		hillsFreq       79.9037
		hillsFraction   0.537282
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245311
		craterFreq      1.00326
		craterDensity   0.916094
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   18.1335
		volcanoTemp     1729.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.145, 0.118, 0.000)
		colorShelf     (0.172, 0.149, 0.135, 0.000)
		colorBeach     (0.202, 0.174, 0.161, 0.000)
		colorDesert    (0.219, 0.187, 0.156, 0.000)
		colorLowland   (0.241, 0.200, 0.177, 0.000)
		colorUpland    (0.267, 0.242, 0.216, 0.000)
		colorRock      (0.288, 0.264, 0.232, 0.000)
		colorSnow      (0.314, 0.281, 0.245, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00779971
		Period          0.0588698
		Eccentricity    0.433626
		Inclination     4.62771
		AscendingNode   174.792
		ArgOfPericenter -26.1956
		MeanAnomaly     126.954
	}
}

Moon	"6.3"
{
	ParentBody     "6"
	Class	       "IceWorld"

	Mass            3.48081e-006
	Radius          237.015
	InertiaMoment   0.398342

	Obliquity       32.3673
	EqAscendNode    55.6106
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.566 0.559 0.555)

	Surface
	{
		SurfStyle       0.580364
		OceanStyle      0.436842
		Randomize      (-0.092, -0.397, -0.360)
		colorDistMagn   0.0643351
		colorDistFreq   26.2363
		detailScale     609.615
		colorConversion true
		drivenDarkening 0.316692
		seaLevel        0.259185
		snowLevel       2
		tropicLatitude  0.834152
		icecapLatitude  1
		icecapHeight    0.259185
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76813
		venusFreq       1.41666
		venusMagn       0
		mareFreq        0
		mareDensity     9.70213e-007
		terraceProb     0.462578
		erosion         0
		montesMagn      0.056443
		montesFreq      13.1859
		montesSpiky     0.790504
		montesFraction  0.156273
		dunesMagn       0.0322825
		dunesFreq       312.44
		dunesFraction   0.05678
		hillsMagn       0.113211
		hillsFreq       24.0147
		hillsFraction   0.0275504
		hills2Fraction  0.190501
		riversMagn      63.7659
		riversFreq      3.06946
		riversSin       6.40939
		riversOctaves   0
		canyonsMagn     0.473722
		canyonsFreq     0.0829218
		canyonFraction  0
		cracksMagn      0.0442528
		cracksFreq      0.0998105
		cracksOctaves   0
		craterMagn      1.04953
		craterFreq      0.634131
		craterDensity   0.911178
		craterOctaves   8
		craterRayedFactor 0.23558
		volcanoMagn     0.223211
		volcanoFreq     0.970284
		volcanoDensity  0.0623812
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.354065
		volcanoRadius   4.83147
		volcanoTemp     1261.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.140, 0.122, 0.000)
		colorShelf     (0.209, 0.173, 0.155, 0.000)
		colorBeach     (0.317, 0.263, 0.233, 0.200)
		colorDesert    (0.288, 0.246, 0.205, 0.500)
		colorLowland   (0.221, 0.190, 0.155, 0.800)
		colorUpland    (0.373, 0.336, 0.289, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.221, 0.190, 0.155, 0.800)
		colorUpPlants  (0.373, 0.336, 0.289, 1.000)
		BumpHeight      11.8507
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
		SemiMajorAxis   0.00805792
		Period          0.0618171
		Eccentricity    0.207447
		Inclination     32.3673
		AscendingNode   55.6106
		ArgOfPericenter 133.404
		MeanAnomaly     -59.8666
	}
}

Moon	"6.4"
{
	ParentBody     "6"
	Class	       "IceWorld"

	Mass            5.40379e-006
	Radius          255.969
	InertiaMoment   0.399381

	Obliquity       45.4885
	EqAscendNode    -84.0819
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.543 0.380 0.289)

	Surface
	{
		SurfStyle       0.930652
		OceanStyle      0.624115
		Randomize      (0.352, 0.917, -0.882)
		colorDistMagn   0.0457985
		colorDistFreq   32.2899
		detailScale     658.367
		colorConversion true
		drivenDarkening 0.298293
		seaLevel        0.16597
		snowLevel       2
		tropicLatitude  0.898467
		icecapLatitude  1
		icecapHeight    0.16597
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.79948
		venusFreq       0.380418
		venusMagn       0.219038
		mareFreq        0
		mareDensity     1.31772e-006
		terraceProb     0.16033
		erosion         0
		montesMagn      0.0549444
		montesFreq      8.15531
		montesSpiky     0.886588
		montesFraction  0.684127
		dunesMagn       0.0566121
		dunesFreq       332.861
		dunesFraction   0.499914
		hillsMagn       0.105845
		hillsFreq       32.9012
		hillsFraction   0.869904
		hills2Fraction  0.00440653
		riversMagn      56.8426
		riversFreq      3.9722
		riversSin       6.14127
		riversOctaves   0
		canyonsMagn     0.50235
		canyonsFreq     0.102667
		canyonFraction  0
		cracksMagn      0.0779444
		cracksFreq      0.0673028
		cracksOctaves   0
		craterMagn      1.01209
		craterFreq      0.569809
		craterDensity   0.957054
		craterOctaves   8
		craterRayedFactor 0.204807
		volcanoMagn     0.213037
		volcanoFreq     0.539641
		volcanoDensity  0.0556346
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.28913
		volcanoRadius   2.32911
		volcanoTemp     1615.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.412, 0.270, 0.168, 1.000)
		colorShelf     (0.412, 0.270, 0.168, 1.000)
		colorBeach     (0.380, 0.236, 0.144, 1.000)
		colorDesert    (0.380, 0.236, 0.144, 1.000)
		colorLowland   (0.461, 0.308, 0.220, 1.000)
		colorUpland    (0.483, 0.338, 0.248, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.461, 0.308, 0.220, 1.000)
		colorUpPlants  (0.483, 0.338, 0.248, 1.000)
		BumpHeight      12.7984
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
		SemiMajorAxis   0.00855493
		Period          0.0676237
		Eccentricity    0.435181
		Inclination     45.4885
		AscendingNode   -84.0819
		ArgOfPericenter -147.219
		MeanAnomaly     -157.696
	}
}

DwarfMoon	"6.D7"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.66107e-011
	Radius          3.56878
	InertiaMoment   0.396775

	Obliquity       -42.9747
	EqAscendNode    106.906
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.708 0.665 0.608)

	Surface
	{
		SurfStyle       0.133744
		OceanStyle      0.917717
		Randomize      (0.574, -0.117, -0.530)
		colorDistMagn   0.957455
		colorDistFreq   0.00183285
		detailScale     97.4515
		colorConversion true
		snowLevel       2
		tropicLatitude  0.741958
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.547301
		terraceProb     0.149692
		erosion         0
		montesMagn      0.453695
		montesFreq      2.52702
		montesSpiky     0.90425
		montesFraction  0.577283
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0383391
		hillsFraction   0.670956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212269
		craterFreq      0.186157
		craterDensity   0.933359
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   137.288
		volcanoTemp     1461.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.266, 0.243, 0.000)
		colorShelf     (0.301, 0.283, 0.258, 0.000)
		colorBeach     (0.319, 0.299, 0.274, 0.000)
		colorDesert    (0.336, 0.316, 0.289, 0.000)
		colorLowland   (0.354, 0.332, 0.304, 0.000)
		colorUpland    (0.372, 0.349, 0.319, 0.000)
		colorRock      (0.389, 0.366, 0.334, 0.000)
		colorSnow      (0.407, 0.382, 0.350, 1.000)
		BumpHeight      3.2119
		BumpOffset      0.642381
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00882503
		Period          0.0708514
		Eccentricity    0.0372687
		Inclination     -42.9747
		AscendingNode   106.906
		ArgOfPericenter -7.20717
		MeanAnomaly     -174.087
	}
}

DwarfMoon	"6.D8"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.24439e-011
	Radius          4.27202
	InertiaMoment   0.398512

	Obliquity       -24.7245
	EqAscendNode    -6.51973
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.434 0.426 0.422)

	Surface
	{
		SurfStyle       0.79216
		OceanStyle      0.507648
		Randomize      (-0.171, 0.391, 0.915)
		colorDistMagn   0.882608
		colorDistFreq   0.00680336
		detailScale     116.655
		colorConversion true
		snowLevel       2
		tropicLatitude  0.758857
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.761517
		terraceProb     0.56135
		erosion         0
		montesMagn      0.688892
		montesFreq      3.83351
		montesSpiky     0.997655
		montesFraction  0.468267
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0403879
		hillsFraction   0.68196
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229146
		craterFreq      0.251213
		craterDensity   0.954102
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   117.591
		volcanoTemp     1712.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.145, 0.118, 0.000)
		colorShelf     (0.173, 0.149, 0.135, 0.000)
		colorBeach     (0.204, 0.175, 0.160, 0.000)
		colorDesert    (0.221, 0.187, 0.156, 0.000)
		colorLowland   (0.243, 0.200, 0.177, 0.000)
		colorUpland    (0.269, 0.243, 0.215, 0.000)
		colorRock      (0.290, 0.264, 0.232, 0.000)
		colorSnow      (0.317, 0.281, 0.245, 1.000)
		BumpHeight      3.84482
		BumpOffset      0.768963
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00924236
		Period          0.0759362
		Eccentricity    0.360385
		Inclination     -24.7245
		AscendingNode   -6.51973
		ArgOfPericenter -119.32
		MeanAnomaly     32.0607
	}
}

DwarfMoon	"6.D9"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            5.83782e-011
	Radius          6.19268
	InertiaMoment   0.399511

	Obliquity       -56.2107
	EqAscendNode    139.072
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.550 0.547 0.545)

	Surface
	{
		SurfStyle       0.516586
		OceanStyle      0.354381
		Randomize      (-0.244, 0.640, -0.678)
		colorDistMagn   0.975579
		colorDistFreq   0.0183514
		detailScale     169.101
		colorConversion true
		snowLevel       2
		tropicLatitude  0.556055
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443828
		terraceProb     0.218844
		erosion         0
		montesMagn      0.571221
		montesFreq      3.69633
		montesSpiky     0.937315
		montesFraction  0.61769
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0938958
		hillsFraction   0.590732
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265626
		craterFreq      0.214332
		craterDensity   0.931308
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   127.075
		volcanoTemp     1668.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.186, 0.153, 0.000)
		colorShelf     (0.220, 0.191, 0.174, 0.000)
		colorBeach     (0.258, 0.224, 0.207, 0.000)
		colorDesert    (0.280, 0.241, 0.202, 0.000)
		colorLowland   (0.308, 0.257, 0.229, 0.000)
		colorUpland    (0.341, 0.312, 0.278, 0.000)
		colorRock      (0.368, 0.339, 0.300, 0.000)
		colorSnow      (0.401, 0.361, 0.316, 1.000)
		BumpHeight      5.57341
		BumpOffset      1.11468
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00976552
		Period          0.0824741
		Eccentricity    0.132202
		Inclination     -56.2107
		AscendingNode   139.072
		ArgOfPericenter 109.282
		MeanAnomaly     26.4259
	}
}

DwarfMoon	"6.D10"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            9.90108e-011
	Radius          6.79527
	InertiaMoment   0.397168

	Obliquity       12.0267
	EqAscendNode    -102.498
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.477 0.473 0.469)

	Surface
	{
		SurfStyle       0.746524
		OceanStyle      0.361718
		Randomize      (0.370, -0.513, 0.076)
		colorDistMagn   0.411976
		colorDistFreq   0.0105914
		detailScale     185.556
		colorConversion true
		snowLevel       2
		tropicLatitude  0.258623
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.516556
		terraceProb     0.11175
		erosion         0
		montesMagn      0.490521
		montesFreq      2.75832
		montesSpiky     0.999798
		montesFraction  0.527696
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.14486
		hillsFraction   0.7512
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256586
		craterFreq      0.233204
		craterDensity   0.940681
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   107.071
		volcanoTemp     1441.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.161, 0.131, 0.000)
		colorShelf     (0.191, 0.166, 0.150, 0.000)
		colorBeach     (0.224, 0.194, 0.178, 0.000)
		colorDesert    (0.243, 0.208, 0.174, 0.000)
		colorLowland   (0.267, 0.222, 0.197, 0.000)
		colorUpland    (0.295, 0.270, 0.239, 0.000)
		colorRock      (0.319, 0.293, 0.258, 0.000)
		colorSnow      (0.348, 0.312, 0.272, 1.000)
		BumpHeight      6.11574
		BumpOffset      1.22315
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0102931
		Period          0.0892465
		Eccentricity    0.263994
		Inclination     12.0267
		AscendingNode   -102.498
		ArgOfPericenter -111.247
		MeanAnomaly     51.0311
	}
}

DwarfMoon	"6.D11"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.60603e-010
	Radius          7.64562
	InertiaMoment   0.398672

	Obliquity       32.62
	EqAscendNode    137.867
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.608 0.603 0.598)

	Surface
	{
		SurfStyle       0.822864
		OceanStyle      0.155116
		Randomize      (0.765, -0.534, 0.245)
		colorDistMagn   0.148443
		colorDistFreq   0.0374315
		detailScale     208.776
		colorConversion true
		snowLevel       2
		tropicLatitude  0.380189
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606405
		terraceProb     0.293724
		erosion         0
		montesMagn      0.605227
		montesFreq      2.20288
		montesSpiky     0.978939
		montesFraction  0.781466
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.13567
		hillsFraction   0.480742
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235308
		craterFreq      0.172895
		craterDensity   0.837138
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   94.5893
		volcanoTemp     1441.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.205, 0.167, 0.000)
		colorShelf     (0.243, 0.211, 0.191, 0.000)
		colorBeach     (0.286, 0.247, 0.227, 0.000)
		colorDesert    (0.310, 0.265, 0.221, 0.000)
		colorLowland   (0.340, 0.283, 0.251, 0.000)
		colorUpland    (0.377, 0.344, 0.305, 0.000)
		colorRock      (0.407, 0.374, 0.329, 0.000)
		colorSnow      (0.443, 0.398, 0.347, 1.000)
		BumpHeight      6.88106
		BumpOffset      1.37621
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0109206
		Period          0.097531
		Eccentricity    0.210376
		Inclination     32.62
		AscendingNode   137.867
		ArgOfPericenter 73.7179
		MeanAnomaly     -107.325
	}
}

DwarfMoon	"6.D12"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.51626e-010
	Radius          8.51662
	InertiaMoment   0.399639

	RotationPeriod  5433.77
	Obliquity       -32.2186
	EqAscendNode    -5.57709

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.779 0.777 0.775)

	Surface
	{
		SurfStyle       0.109046
		OceanStyle      0.341793
		Randomize      (0.055, -0.224, 0.341)
		colorDistMagn   0.262436
		colorDistFreq   0.0264485
		detailScale     232.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.901468
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.703868
		terraceProb     0.127602
		erosion         0
		montesMagn      0.470197
		montesFreq      3.66366
		montesSpiky     0.895343
		montesFraction  0.496231
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.147569
		hillsFraction   0.855706
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246782
		craterFreq      0.200394
		craterDensity   1.00871
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   84.1774
		volcanoTemp     1574.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.311, 0.310, 0.000)
		colorShelf     (0.331, 0.330, 0.330, 0.000)
		colorBeach     (0.350, 0.350, 0.349, 0.000)
		colorDesert    (0.370, 0.369, 0.368, 0.000)
		colorLowland   (0.389, 0.388, 0.388, 0.000)
		colorUpland    (0.409, 0.408, 0.407, 0.000)
		colorRock      (0.428, 0.427, 0.426, 0.000)
		colorSnow      (0.448, 0.447, 0.446, 1.000)
		BumpHeight      7.66496
		BumpOffset      1.53299
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0113481
		Period          0.103314
		Eccentricity    0.308808
		Inclination     -32.2186
		AscendingNode   -5.57709
		ArgOfPericenter -132.76
		MeanAnomaly     -154.967
	}
}

DwarfMoon	"6.D13"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.83485e-010
	Radius          11.9982
	InertiaMoment   0.397474

	Obliquity       64.448
	EqAscendNode    57.9471
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.534 0.431 0.352)

	Surface
	{
		SurfStyle       0.102024
		OceanStyle      0.403426
		Randomize      (-0.875, -0.123, 0.097)
		colorDistMagn   0.532189
		colorDistFreq   0.114524
		detailScale     327.632
		colorConversion true
		snowLevel       2
		tropicLatitude  0.96929
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.511517
		terraceProb     0.497113
		erosion         0
		montesMagn      0.373186
		montesFreq      3.30745
		montesSpiky     0.977864
		montesFraction  0.765534
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.333906
		hillsFraction   0.517279
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273197
		craterFreq      0.178631
		craterDensity   0.83416
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   96.0614
		volcanoTemp     1156.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.172, 0.141, 0.000)
		colorShelf     (0.227, 0.183, 0.149, 0.000)
		colorBeach     (0.240, 0.194, 0.158, 0.000)
		colorDesert    (0.253, 0.205, 0.167, 0.000)
		colorLowland   (0.267, 0.215, 0.176, 0.000)
		colorUpland    (0.280, 0.226, 0.185, 0.000)
		colorRock      (0.293, 0.237, 0.193, 0.000)
		colorSnow      (0.307, 0.248, 0.202, 1.000)
		BumpHeight      10.7984
		BumpOffset      2.15968
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0118052
		Period          0.109618
		Eccentricity    0.0681837
		Inclination     64.448
		AscendingNode   57.9471
		ArgOfPericenter -53.9796
		MeanAnomaly     54.9135
	}
}

DwarfMoon	"6.D14"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            5.7149e-010
	Radius          12.2808
	InertiaMoment   0.398824

	Obliquity       8.45553
	EqAscendNode    -55.2471
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.574 0.568 0.565)

	Surface
	{
		SurfStyle       0.121662
		OceanStyle      0.362134
		Randomize      (0.715, 0.422, 0.587)
		colorDistMagn   0.485243
		colorDistFreq   0.0174732
		detailScale     335.348
		colorConversion true
		snowLevel       2
		tropicLatitude  0.258341
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.368468
		terraceProb     0.165498
		erosion         0
		montesMagn      0.664205
		montesFreq      1.94031
		montesSpiky     0.915076
		montesFraction  0.533309
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.538072
		hillsFraction   0.805463
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242286
		craterFreq      0.259907
		craterDensity   0.998171
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   80.5432
		volcanoTemp     1590.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.227, 0.226, 0.000)
		colorShelf     (0.244, 0.242, 0.240, 0.000)
		colorBeach     (0.258, 0.256, 0.254, 0.000)
		colorDesert    (0.272, 0.270, 0.268, 0.000)
		colorLowland   (0.287, 0.284, 0.282, 0.000)
		colorUpland    (0.301, 0.298, 0.297, 0.000)
		colorRock      (0.315, 0.313, 0.311, 0.000)
		colorSnow      (0.330, 0.327, 0.325, 1.000)
		BumpHeight      11.0527
		BumpOffset      2.21055
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0121103
		Period          0.113896
		Eccentricity    0.062571
		Inclination     8.45553
		AscendingNode   -55.2471
		ArgOfPericenter 179.743
		MeanAnomaly     44.879
	}
}

DwarfMoon	"6.D15"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            8.36126e-010
	Radius          13.3261
	InertiaMoment   0.399765

	Obliquity       72.6512
	EqAscendNode    -76.1814
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.641 0.534 0.485)

	Surface
	{
		SurfStyle       0.159409
		OceanStyle      0.203111
		Randomize      (-0.835, 0.050, 0.943)
		colorDistMagn   0.967674
		colorDistFreq   0.129641
		detailScale     363.892
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991684
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.358729
		terraceProb     0.204605
		erosion         0
		montesMagn      0.50837
		montesFreq      2.53359
		montesSpiky     0.76451
		montesFraction  0.819267
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.326758
		hillsFraction   0.674604
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244135
		craterFreq      0.227083
		craterDensity   0.997257
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   72.256
		volcanoTemp     1492.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.214, 0.194, 0.000)
		colorShelf     (0.272, 0.227, 0.206, 0.000)
		colorBeach     (0.288, 0.241, 0.218, 0.000)
		colorDesert    (0.304, 0.254, 0.230, 0.000)
		colorLowland   (0.320, 0.267, 0.242, 0.000)
		colorUpland    (0.336, 0.281, 0.254, 0.000)
		colorRock      (0.352, 0.294, 0.266, 0.000)
		colorSnow      (0.368, 0.307, 0.279, 1.000)
		BumpHeight      11.9935
		BumpOffset      2.3987
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0124276
		Period          0.118401
		Eccentricity    0.472918
		Inclination     72.6512
		AscendingNode   -76.1814
		ArgOfPericenter 73.633
		MeanAnomaly     -30.5525
	}
}

DwarfMoon	"6.D16"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.20478e-009
	Radius          14.4494
	InertiaMoment   0.39773

	RotationPeriod  1824.32
	Obliquity       -80.8518
	EqAscendNode    -18.6427

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.679 0.595 0.527)

	Surface
	{
		SurfStyle       0.524246
		OceanStyle      0.480938
		Randomize      (-0.918, 0.808, -0.141)
		colorDistMagn   0.623374
		colorDistFreq   0.14107
		detailScale     394.566
		colorConversion true
		snowLevel       2
		tropicLatitude  0.439378
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.355586
		terraceProb     0.366342
		erosion         0
		montesMagn      0.504818
		montesFreq      3.35171
		montesSpiky     0.84007
		montesFraction  0.81632
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.47775
		hillsFraction   0.656346
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212838
		craterFreq      0.192707
		craterDensity   0.97346
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   65.2683
		volcanoTemp     1467.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.202, 0.148, 0.000)
		colorShelf     (0.272, 0.208, 0.169, 0.000)
		colorBeach     (0.319, 0.244, 0.200, 0.000)
		colorDesert    (0.346, 0.262, 0.195, 0.000)
		colorLowland   (0.380, 0.280, 0.221, 0.000)
		colorUpland    (0.421, 0.339, 0.269, 0.000)
		colorRock      (0.455, 0.369, 0.290, 0.000)
		colorSnow      (0.496, 0.393, 0.306, 1.000)
		BumpHeight      13.0045
		BumpOffset      2.6009
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0128763
		Period          0.12487
		Eccentricity    0.448553
		Inclination     -80.8518
		AscendingNode   -18.6427
		ArgOfPericenter -93.0203
		MeanAnomaly     -166.245
	}
}

DwarfMoon	"6.D17"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.71406e-009
	Radius          14.604
	InertiaMoment   0.398969

	Obliquity       49.6643
	EqAscendNode    -158.723
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.738 0.735 0.734)

	Surface
	{
		SurfStyle       0.815946
		OceanStyle      0.936191
		Randomize      (0.852, -0.945, 0.370)
		colorDistMagn   0.767602
		colorDistFreq   0.104516
		detailScale     398.785
		colorConversion true
		snowLevel       2
		tropicLatitude  0.27864
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.297347
		terraceProb     0.371795
		erosion         0
		montesMagn      0.569886
		montesFreq      3.33204
		montesSpiky     0.924319
		montesFraction  0.808987
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.450341
		hillsFraction   0.774828
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238103
		craterFreq      0.208654
		craterDensity   0.897216
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   55.305
		volcanoTemp     1229.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.250, 0.206, 0.000)
		colorShelf     (0.295, 0.257, 0.235, 0.000)
		colorBeach     (0.347, 0.301, 0.279, 0.000)
		colorDesert    (0.377, 0.324, 0.272, 0.000)
		colorLowland   (0.414, 0.346, 0.308, 0.000)
		colorUpland    (0.458, 0.419, 0.374, 0.000)
		colorRock      (0.495, 0.456, 0.404, 0.000)
		colorSnow      (0.539, 0.485, 0.426, 1.000)
		BumpHeight      13.1436
		BumpOffset      2.62871
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0130987
		Period          0.12812
		Eccentricity    0.277192
		Inclination     49.6643
		AscendingNode   -158.723
		ArgOfPericenter -60.0398
		MeanAnomaly     -68.2286
	}
}

DwarfMoon	"6.D18"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.41285e-009
	Radius          20.011
	InertiaMoment   0.39989

	Obliquity       -86.5265
	EqAscendNode    99.4185
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.695 0.693 0.689)

	Surface
	{
		SurfStyle       0.191003
		OceanStyle      0.981163
		Randomize      (-0.425, 0.132, -0.234)
		colorDistMagn   0.555675
		colorDistFreq   0.0175882
		detailScale     546.433
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986005
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.617892
		terraceProb     0.351602
		erosion         0
		montesMagn      0.604813
		montesFreq      2.28451
		montesSpiky     0.924857
		montesFraction  0.706168
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.707954
		hillsFraction   0.753435
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242118
		craterFreq      0.172524
		craterDensity   0.890077
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.8718
		volcanoTemp     1562.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.277, 0.275, 0.000)
		colorShelf     (0.296, 0.294, 0.293, 0.000)
		colorBeach     (0.313, 0.312, 0.310, 0.000)
		colorDesert    (0.330, 0.329, 0.327, 0.000)
		colorLowland   (0.348, 0.346, 0.344, 0.000)
		colorUpland    (0.365, 0.364, 0.361, 0.000)
		colorRock      (0.382, 0.381, 0.379, 0.000)
		colorSnow      (0.400, 0.398, 0.396, 1.000)
		BumpHeight      18.0099
		BumpOffset      3.60197
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0133314
		Period          0.13155
		Eccentricity    0.109376
		Inclination     -86.5265
		AscendingNode   99.4185
		ArgOfPericenter -120.649
		MeanAnomaly     167.906
	}
}

DwarfMoon	"6.D19"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.3666e-009
	Radius          21.3221
	InertiaMoment   0.397954

	RotationPeriod  808.417
	Obliquity       18.2974
	EqAscendNode    137.833

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.647 0.640 0.637)

	Surface
	{
		SurfStyle       0.200215
		OceanStyle      0.0274916
		Randomize      (0.742, 0.975, -0.266)
		colorDistMagn   0.15974
		colorDistFreq   0.0316721
		detailScale     582.235
		colorConversion true
		snowLevel       2
		tropicLatitude  0.224428
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.611856
		terraceProb     0.296839
		erosion         0
		montesMagn      0.512226
		montesFreq      2.98044
		montesSpiky     0.942799
		montesFraction  0.391094
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.896619
		hillsFraction   0.842656
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231941
		craterFreq      0.20434
		craterDensity   0.770645
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.6156
		volcanoTemp     1523.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.256, 0.255, 0.000)
		colorShelf     (0.275, 0.272, 0.271, 0.000)
		colorBeach     (0.291, 0.288, 0.287, 0.000)
		colorDesert    (0.307, 0.304, 0.303, 0.000)
		colorLowland   (0.323, 0.320, 0.319, 0.000)
		colorUpland    (0.339, 0.336, 0.335, 0.000)
		colorRock      (0.356, 0.352, 0.351, 0.000)
		colorSnow      (0.372, 0.368, 0.367, 1.000)
		BumpHeight      19.1899
		BumpOffset      3.83797
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.013786
		Period          0.138336
		Eccentricity    0.11498
		Inclination     18.2974
		AscendingNode   137.833
		ArgOfPericenter -111.744
		MeanAnomaly     157.631
	}
}

DwarfMoon	"6.D20"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            4.66298e-009
	Radius          22.8284
	InertiaMoment   0.39911

	RotationPeriod  5184.86
	Obliquity       -67.2671
	EqAscendNode    -18.38

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.666 0.664)

	Surface
	{
		SurfStyle       0.486925
		OceanStyle      0.679141
		Randomize      (-0.347, -0.012, -0.999)
		colorDistMagn   0.522498
		colorDistFreq   0.340741
		detailScale     623.367
		colorConversion true
		snowLevel       2
		tropicLatitude  0.753071
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.649667
		terraceProb     0.19628
		erosion         0
		montesMagn      0.527396
		montesFreq      2.84374
		montesSpiky     0.899216
		montesFraction  0.662257
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.28
		hillsFraction   0.647099
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226841
		craterFreq      0.265206
		craterDensity   0.874385
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   52.4142
		volcanoTemp     1215.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.267, 0.266, 0.000)
		colorShelf     (0.284, 0.283, 0.282, 0.000)
		colorBeach     (0.301, 0.300, 0.299, 0.000)
		colorDesert    (0.318, 0.317, 0.315, 0.000)
		colorLowland   (0.334, 0.333, 0.332, 0.000)
		colorUpland    (0.351, 0.350, 0.348, 0.000)
		colorRock      (0.368, 0.367, 0.365, 0.000)
		colorSnow      (0.385, 0.383, 0.382, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0144125
		Period          0.147872
		Eccentricity    0.318006
		Inclination     -67.2671
		AscendingNode   -18.38
		ArgOfPericenter -85.9421
		MeanAnomaly     69.6234
	}
}

DwarfMoon	"6.D21"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            6.4198e-009
	Radius          23.7974
	InertiaMoment   0.394519

	Obliquity       72.7471
	EqAscendNode    -45.2245
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.535 0.530 0.528)

	Surface
	{
		SurfStyle       0.557861
		OceanStyle      0.458216
		Randomize      (-0.644, -0.477, -0.058)
		colorDistMagn   0.500853
		colorDistFreq   0.455577
		detailScale     649.828
		colorConversion true
		snowLevel       2
		tropicLatitude  0.832245
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.729606
		terraceProb     0.358102
		erosion         0
		montesMagn      0.65547
		montesFreq      3.01711
		montesSpiky     0.986423
		montesFraction  0.302888
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.68089
		hillsFraction   0.339845
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244405
		craterFreq      0.243017
		craterDensity   0.943275
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.5666
		volcanoTemp     1577.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.180, 0.148, 0.000)
		colorShelf     (0.214, 0.185, 0.169, 0.000)
		colorBeach     (0.251, 0.217, 0.200, 0.000)
		colorDesert    (0.273, 0.233, 0.195, 0.000)
		colorLowland   (0.300, 0.249, 0.222, 0.000)
		colorUpland    (0.332, 0.302, 0.269, 0.000)
		colorRock      (0.358, 0.328, 0.290, 0.000)
		colorSnow      (0.390, 0.350, 0.306, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0148105
		Period          0.154038
		Eccentricity    0.132041
		Inclination     72.7471
		AscendingNode   -45.2245
		ArgOfPericenter 6.78211
		MeanAnomaly     -155.32
	}
}

DwarfMoon	"6.D22"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            8.79579e-009
	Radius          31.0768
	InertiaMoment   0.398154

	Obliquity       16.3591
	EqAscendNode    98.1631
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.651 0.518 0.401)

	Surface
	{
		SurfStyle       0.340496
		OceanStyle      0.599305
		Randomize      (-0.719, -0.791, 0.014)
		colorDistMagn   0.802608
		colorDistFreq   0.280353
		detailScale     848.605
		colorConversion true
		snowLevel       2
		tropicLatitude  0.362628
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.410188
		terraceProb     0.198015
		erosion         0
		montesMagn      0.432103
		montesFreq      3.39093
		montesSpiky     0.994565
		montesFraction  0.307335
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.81642
		hillsFraction   0.60172
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.281915
		craterFreq      0.226878
		craterDensity   0.970653
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.9524
		volcanoTemp     1462
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.207, 0.160, 0.000)
		colorShelf     (0.277, 0.220, 0.170, 0.000)
		colorBeach     (0.293, 0.233, 0.180, 0.000)
		colorDesert    (0.309, 0.246, 0.190, 0.000)
		colorLowland   (0.325, 0.259, 0.200, 0.000)
		colorUpland    (0.342, 0.272, 0.210, 0.000)
		colorRock      (0.358, 0.285, 0.220, 0.000)
		colorSnow      (0.374, 0.298, 0.230, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0152047
		Period          0.160229
		Eccentricity    0.0311805
		Inclination     16.3591
		AscendingNode   98.1631
		ArgOfPericenter -168.179
		MeanAnomaly     49.3597
	}
}

DwarfMoon	"6.D23"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.20056e-008
	Radius          32.7667
	InertiaMoment   0.399246

	Obliquity       33.4853
	EqAscendNode    39.8751
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.613 0.607 0.604)

	Surface
	{
		SurfStyle       0.142441
		OceanStyle      0.799114
		Randomize      (-0.778, -0.562, 0.497)
		colorDistMagn   0.896397
		colorDistFreq   0.424401
		detailScale     894.749
		colorConversion true
		snowLevel       2
		tropicLatitude  0.886884
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.694416
		terraceProb     0.196577
		erosion         0
		montesMagn      0.55679
		montesFreq      3.56236
		montesSpiky     0.84669
		montesFraction  0.43474
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.1759
		hillsFraction   0.739583
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240924
		craterFreq      0.248291
		craterDensity   0.784604
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.8865
		volcanoTemp     1213.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.243, 0.242, 0.000)
		colorShelf     (0.260, 0.258, 0.257, 0.000)
		colorBeach     (0.276, 0.273, 0.272, 0.000)
		colorDesert    (0.291, 0.288, 0.287, 0.000)
		colorLowland   (0.306, 0.303, 0.302, 0.000)
		colorUpland    (0.322, 0.319, 0.317, 0.000)
		colorRock      (0.337, 0.334, 0.332, 0.000)
		colorSnow      (0.352, 0.349, 0.347, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0157334
		Period          0.168659
		Eccentricity    0.344458
		Inclination     33.4853
		AscendingNode   39.8751
		ArgOfPericenter -77.6868
		MeanAnomaly     -69.9121
	}
}

DwarfMoon	"6.D24"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.63408e-008
	Radius          34.8823
	InertiaMoment   0.396178

	Obliquity       -64.9086
	EqAscendNode    -140.941
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.556 0.445 0.318)

	Surface
	{
		SurfStyle       0.463449
		OceanStyle      0.302736
		Randomize      (0.357, 0.726, -0.940)
		colorDistMagn   0.781017
		colorDistFreq   0.243778
		detailScale     952.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.577072
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.487469
		terraceProb     0.302229
		erosion         0
		montesMagn      0.591954
		montesFreq      2.53212
		montesSpiky     0.958066
		montesFraction  0.392218
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.0013
		hillsFraction   0.657554
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22197
		craterFreq      0.236568
		craterDensity   0.978782
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.7834
		volcanoTemp     1493.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.178, 0.127, 0.000)
		colorShelf     (0.236, 0.189, 0.135, 0.000)
		colorBeach     (0.250, 0.200, 0.143, 0.000)
		colorDesert    (0.264, 0.212, 0.151, 0.000)
		colorLowland   (0.278, 0.223, 0.159, 0.000)
		colorUpland    (0.292, 0.234, 0.167, 0.000)
		colorRock      (0.306, 0.245, 0.175, 0.000)
		colorSnow      (0.320, 0.256, 0.183, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0163428
		Period          0.178552
		Eccentricity    0.321102
		Inclination     -64.9086
		AscendingNode   -140.941
		ArgOfPericenter -61.6686
		MeanAnomaly     110.453
	}
}

DwarfMoon	"6.D25"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.21996e-008
	Radius          36.575
	InertiaMoment   0.398338

	RotationPeriod  3225.01
	Obliquity       -25.6429
	EqAscendNode    90.8417

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.497 0.494 0.492)

	Surface
	{
		SurfStyle       0.682457
		OceanStyle      0.13253
		Randomize      (-0.418, -0.744, 0.251)
		colorDistMagn   0.967657
		colorDistFreq   0.247224
		detailScale     998.741
		colorConversion true
		snowLevel       2
		tropicLatitude  0.5788
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.740655
		terraceProb     0.24141
		erosion         0
		montesMagn      0.399912
		montesFreq      3.09298
		montesSpiky     0.958978
		montesFraction  0.183033
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.50784
		hillsFraction   0.604072
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216085
		craterFreq      0.269242
		craterDensity   0.840608
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.4873
		volcanoTemp     1461.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.168, 0.138, 0.000)
		colorShelf     (0.199, 0.173, 0.157, 0.000)
		colorBeach     (0.234, 0.203, 0.187, 0.000)
		colorDesert    (0.254, 0.218, 0.182, 0.000)
		colorLowland   (0.278, 0.232, 0.206, 0.000)
		colorUpland    (0.308, 0.282, 0.251, 0.000)
		colorRock      (0.333, 0.306, 0.270, 0.000)
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
		SemiMajorAxis   0.0166708
		Period          0.183954
		Eccentricity    0.441465
		Inclination     -25.6429
		AscendingNode   90.8417
		ArgOfPericenter 37.0976
		MeanAnomaly     41.0104
	}
}

DwarfMoon	"6.D26"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            3.01288e-008
	Radius          47.3293
	InertiaMoment   0.399378

	Obliquity       -89.2356
	EqAscendNode    -94.2049
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.715 0.711 0.707)

	Surface
	{
		SurfStyle       0.903251
		OceanStyle      0.470724
		Randomize      (-0.714, 0.708, 0.271)
		colorDistMagn   0.892763
		colorDistFreq   1.81122
		detailScale     1292.4
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997296
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.671758
		terraceProb     0.480425
		erosion         0
		montesMagn      0.571178
		montesFreq      3.00634
		montesSpiky     0.866772
		montesFraction  0.362187
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.91393
		hillsFraction   0.639421
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233258
		craterFreq      0.196656
		craterDensity   0.954155
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.7508
		volcanoTemp     1254.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.249, 0.283, 0.050)
		colorShelf     (0.286, 0.291, 0.325, 0.040)
		colorBeach     (0.329, 0.334, 0.368, 0.030)
		colorDesert    (0.372, 0.377, 0.417, 0.020)
		colorLowland   (0.414, 0.419, 0.460, 0.030)
		colorUpland    (0.457, 0.462, 0.502, 0.050)
		colorRock      (0.500, 0.505, 0.559, 0.020)
		colorSnow      (0.500, 0.505, 0.559, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0169248
		Period          0.188174
		Eccentricity    0.361579
		Inclination     -89.2356
		AscendingNode   -94.2049
		ArgOfPericenter -79.2747
		MeanAnomaly     0.141131
	}
}

DwarfMoon	"6.D27"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            4.08847e-008
	Radius          49.5953
	InertiaMoment   0.396765

	Obliquity       -84.0516
	EqAscendNode    -62.099
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.632 0.626 0.624)

	Surface
	{
		SurfStyle       0.26406
		OceanStyle      0.214029
		Randomize      (0.100, -0.993, 0.123)
		colorDistMagn   0.284076
		colorDistFreq   1.16393
		detailScale     1354.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0.891927
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562921
		terraceProb     0.135347
		erosion         0
		montesMagn      0.565142
		montesFreq      2.11597
		montesSpiky     0.979317
		montesFraction  0.374374
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.03255
		hillsFraction   0.606412
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230063
		craterFreq      0.2345
		craterDensity   0.922754
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.4562
		volcanoTemp     1479.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.251, 0.250, 0.000)
		colorShelf     (0.269, 0.266, 0.265, 0.000)
		colorBeach     (0.285, 0.282, 0.281, 0.000)
		colorDesert    (0.300, 0.298, 0.296, 0.000)
		colorLowland   (0.316, 0.313, 0.312, 0.000)
		colorUpland    (0.332, 0.329, 0.328, 0.000)
		colorRock      (0.348, 0.344, 0.343, 0.000)
		colorSnow      (0.364, 0.360, 0.359, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0172971
		Period          0.194418
		Eccentricity    0.0931794
		Inclination     -84.0516
		AscendingNode   -62.099
		ArgOfPericenter 121.415
		MeanAnomaly     28.6132
	}
}

Barycenter	"7-7.1"
{
	ParentBody     "Barnard's Star"
	Mass            0.166197
	Radius          1608.46
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
		SemiMajorAxis   1.05039
		Period          2.83689
		Eccentricity    0.0596799
		Inclination     -1.39604
		AscendingNode   119.302
		ArgOfPericenter 314.334
		MeanAnomaly     225.633
	}
}

Planet	"7"
{
	ParentBody     "7-7.1"
	Class	       "IceWorld"

	Mass            0.1601
	Radius          4610.48
	InertiaMoment   0.326697

	Oblateness      0.00251614

	Obliquity       0.586273
	EqAscendNode    -130.349
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.723 0.523 0.454)

	Surface
	{
		SurfStyle       0.501653
		OceanStyle      0.884597
		Randomize      (0.423, 0.352, -0.836)
		colorDistMagn   0.0412322
		colorDistFreq   456.28
		detailScale     11858.4
		colorConversion true
		drivenDarkening 0
		seaLevel        0.214194
		snowLevel       2
		tropicLatitude  0.00859006
		icecapLatitude  0.591249
		icecapHeight    0.227443
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.53629
		venusFreq       0.778838
		venusMagn       0.232108
		mareFreq        1.84807
		mareDensity     0.0140895
		terraceProb     0.578538
		erosion         0
		montesMagn      0.151944
		montesFreq      274.847
		montesSpiky     0.992794
		montesFraction  0.88698
		dunesMagn       0.043394
		dunesFreq       5846.53
		dunesFraction   0.634052
		hillsMagn       0.121259
		hillsFreq       416.048
		hillsFraction   0.375406
		hills2Fraction  0.200844
		riversMagn      55.1373
		riversFreq      2.97707
		riversSin       5.75629
		riversOctaves   0
		canyonsMagn     0.524648
		canyonsFreq     1.50056
		canyonFraction  0
		cracksMagn      0.0524289
		cracksFreq      1.65695
		cracksOctaves   2
		craterMagn      0.510419
		craterFreq      8.2807
		craterDensity   0.70408
		craterOctaves   13
		craterRayedFactor 0.12691
		volcanoMagn     0.764342
		volcanoFreq     2.61764
		volcanoDensity  0.4
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0.266499
		volcanoRadius   0.394082
		volcanoTemp     1167.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.131, 0.100, 0.000)
		colorShelf     (0.267, 0.162, 0.127, 0.000)
		colorBeach     (0.405, 0.246, 0.191, 0.200)
		colorDesert    (0.369, 0.230, 0.168, 0.500)
		colorLowland   (0.282, 0.178, 0.127, 0.800)
		colorUpland    (0.477, 0.314, 0.236, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.282, 0.178, 0.127, 0.800)
		colorUpPlants  (0.477, 0.314, 0.236, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.998925
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
		Height          102.48
		Density         0.000107482
		Pressure        1.48824e-005
		Greenhouse      0.0357416
		Bright          2.5484
		Opacity         0
		SkyLight        0.849465
		Hue             0.0164359
		Saturation      1

		Composition
		{
			N2    	99.993
			Ar    	0.00621251
			Ne    	0.000652782
			CO    	0.000123689
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.26869e-006
		Period          0.00479994
		Eccentricity    0.00954545
		Inclination     0.586274
		AscendingNode   -130.349
		ArgOfPericenter 349.042
		MeanAnomaly     -117.567
	}
}

Moon	"7.1"
{
	ParentBody     "7-7.1"
	Class	       "Selena"

	Mass            0.00609744
	Radius          1597.23
	InertiaMoment   0.385456

	Oblateness      0.00341443

	Obliquity       0.586273
	EqAscendNode    -130.349
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.627 0.623 0.620)

	Surface
	{
		SurfStyle       0.0642807
		OceanStyle      0.0983623
		Randomize      (-0.041, -0.852, 0.997)
		colorDistMagn   0.0793335
		colorDistFreq   186.467
		detailScale     4108.16
		colorConversion true
		drivenDarkening 0
		seaLevel        0.266785
		snowLevel       2
		tropicLatitude  0.00859006
		icecapLatitude  0.473002
		icecapHeight    0.288045
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.88672
		venusFreq       0.97128
		venusMagn       0
		mareFreq        0.678994
		mareDensity     0.00182659
		terraceProb     0.39548
		erosion         0
		montesMagn      0.0627084
		montesFreq      79.1649
		montesSpiky     0.796742
		montesFraction  0.665709
		dunesMagn       0.0323492
		dunesFreq       2104.79
		dunesFraction   0.272131
		hillsMagn       0.132368
		hillsFreq       198.106
		hillsFraction   0.560908
		hills2Fraction  0
		riversMagn      54.3927
		riversFreq      3.12588
		riversSin       6.6936
		riversOctaves   0
		canyonsMagn     0.628502
		canyonsFreq     0.627235
		canyonFraction  0.110734
		cracksMagn      0.0624801
		cracksFreq      1.0578
		cracksOctaves   0
		craterMagn      0.633782
		craterFreq      5.86052
		craterDensity   0.901407
		craterOctaves   10.3786
		craterRayedFactor 0.395574
		volcanoMagn     0.233776
		volcanoFreq     2.67734
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.337877
		volcanoRadius   0.715518
		volcanoTemp     1814.37
		lavaCoverTidal  0.0627676
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.314, 0.311, 0.310, 0.000)
		colorDesert    (0.389, 0.374, 0.354, 0.200)
		colorLowland   (0.420, 0.399, 0.397, 0.500)
		colorUpland    (0.439, 0.417, 0.409, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
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
		SemiMajorAxis   0.00021711
		Period          0.00479994
		Eccentricity    0.00954545
		Inclination     0.586274
		AscendingNode   -130.349
		ArgOfPericenter 169.042
		MeanAnomaly     -117.567
	}
}

Barycenter	"8-8.1"
{
	ParentBody     "Barnard's Star"
	Mass            0.973611
	Radius          3963.81
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
		SemiMajorAxis   2.1057
		Period          8.05215
		Eccentricity    0.0454904
		Inclination     -0.189745
		AscendingNode   67.0002
		ArgOfPericenter 195.492
		MeanAnomaly     12.6936
	}
}

Planet	"8"
{
	ParentBody     "8-8.1"
	Class	       "IceWorld"

	Mass            0.764346
	Radius          7039.53
	InertiaMoment   0.32872

	Obliquity       0.990582
	EqAscendNode    -89.1446
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.821 0.655 0.586)

	Surface
	{
		SurfStyle       0.554596
		OceanStyle      0.53277
		Randomize      (-0.926, 0.121, -0.485)
		colorDistMagn   0.0632512
		colorDistFreq   1057.69
		detailScale     18106.1
		colorConversion true
		drivenDarkening 0
		seaLevel        0.190434
		snowLevel       2
		tropicLatitude  0.0246285
		icecapLatitude  1
		icecapHeight    0.190434
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.81226
		venusFreq       0.892156
		venusMagn       0.166201
		mareFreq        1.87908
		mareDensity     0.0589631
		terraceProb     0.323952
		erosion         0
		montesMagn      0.16088
		montesFreq      384.065
		montesSpiky     0.943103
		montesFraction  0.233204
		dunesMagn       0.033053
		dunesFreq       9197.21
		dunesFraction   0.772156
		hillsMagn       0.131802
		hillsFreq       758.689
		hillsFraction   0.377485
		hills2Fraction  0.13453
		riversMagn      60.2704
		riversFreq      3.48852
		riversSin       4.37986
		riversOctaves   0
		canyonsMagn     0.591861
		canyonsFreq     2.52186
		canyonFraction  0
		cracksMagn      0.0506175
		cracksFreq      4.83553
		cracksOctaves   5
		craterMagn      0.605897
		craterFreq      16.1549
		craterDensity   0.701568
		craterOctaves   13
		craterRayedFactor 0.275785
		volcanoMagn     0.737774
		volcanoFreq     2.0773
		volcanoDensity  0.4
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0.207493
		volcanoRadius   0.218536
		volcanoTemp     1536.06
		lavaCoverTidal  0.0687904
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.164, 0.129, 0.000)
		colorShelf     (0.304, 0.203, 0.164, 0.000)
		colorBeach     (0.460, 0.308, 0.246, 0.200)
		colorDesert    (0.419, 0.288, 0.217, 0.500)
		colorLowland   (0.320, 0.223, 0.164, 0.800)
		colorUpland    (0.542, 0.393, 0.305, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.320, 0.223, 0.164, 0.800)
		colorUpPlants  (0.542, 0.393, 0.305, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.992201
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
		Height          93.9817
		Density         0.00077993
		Pressure        0.00041849
		Greenhouse      0.243405
		Bright          3.78801
		Opacity         0
		SkyLight        1.26267
		Hue             0.0281379
		Saturation      1

		Composition
		{
			He    	89.4491
			Ne    	10.5446
			N2    	0.00634986
		}
	}

	Aurora
	{
		Height      64.6182
		NorthLat    62.3452
		NorthLon    -169.676
		NorthRadius 1346.82
		NorthWidth  1582.55
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -47.7498
		SouthLon    8.08337
		SouthRadius 1225.78
		SouthWidth  1499.1
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
		SemiMajorAxis   0.000146885
		Period          0.0104709
		Eccentricity    0.0122486
		Inclination     0.990582
		AscendingNode   -89.1446
		ArgOfPericenter 81.1721
		MeanAnomaly     15.5064
	}
}

Moon	"8.1"
{
	ParentBody     "8-8.1"
	Class	       "Selena"

	Mass            0.209265
	Radius          5018.38
	InertiaMoment   0.334176

	Obliquity       0.990582
	EqAscendNode    -89.1446
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.562 0.556 0.549)

	Surface
	{
		SurfStyle       0.173375
		OceanStyle      0.280055
		Randomize      (0.345, -0.432, -0.416)
		colorDistMagn   0.0761647
		colorDistFreq   679
		detailScale     12907.6
		colorConversion true
		drivenDarkening 0
		seaLevel        0.219325
		snowLevel       2
		tropicLatitude  0.0246285
		icecapLatitude  0.821573
		icecapHeight    0.228544
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.98616
		venusFreq       1.39015
		venusMagn       0
		mareFreq        1.81179
		mareDensity     0.017795
		terraceProb     0.33517
		erosion         0
		montesMagn      0.211907
		montesFreq      184.949
		montesSpiky     0.943498
		montesFraction  0.0581359
		dunesMagn       0.0414762
		dunesFreq       6609.58
		dunesFraction   0.951124
		hillsMagn       0.118148
		hillsFreq       512.652
		hillsFraction   0.823248
		hills2Fraction  0
		riversMagn      61.6464
		riversFreq      2.79464
		riversSin       6.63012
		riversOctaves   0
		canyonsMagn     0.483824
		canyonsFreq     1.21209
		canyonFraction  0.565851
		cracksMagn      0.0413714
		cracksFreq      2.62083
		cracksOctaves   0
		craterMagn      0.630427
		craterFreq      18.2108
		craterDensity   0.653819
		craterOctaves   11.1605
		craterRayedFactor 0.310293
		volcanoMagn     0.672535
		volcanoFreq     2.92511
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.187109
		volcanoRadius   0.419258
		volcanoTemp     1613.59
		lavaCoverTidal  0.157218
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.281, 0.278, 0.274, 0.000)
		colorDesert    (0.348, 0.334, 0.313, 0.200)
		colorLowland   (0.376, 0.356, 0.351, 0.500)
		colorUpland    (0.393, 0.373, 0.362, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.998569
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
		Height          107.158
		Density         0.000143101
		Pressure        2.39011e-005
		Greenhouse      0.0535759
		Bright          2.69854
		Opacity         0
		SkyLight        0.899513
		Hue             -0.00841487
		Saturation      1

		Composition
		{
			N2    	76.1653
			Ar    	10.9564
			CO    	8.43183
			CH4   	4.3043
			Ne    	0.141825
			O2    	0.000308109
		}
	}

	Aurora
	{
		Height      47.5779
		NorthLat    68.3847
		NorthLon    -83.2789
		NorthRadius 1876.86
		NorthWidth  2111.15
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -52.9235
		SouthLon    95.5426
		SouthRadius 1355.12
		SouthWidth  865.796
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
		SemiMajorAxis   0.0005365
		Period          0.0104709
		Eccentricity    0.0122486
		Inclination     0.990582
		AscendingNode   -89.1446
		ArgOfPericenter -98.8279
		MeanAnomaly     15.5064
	}
}

Barycenter	"9-9.1"
{
	ParentBody     "Barnard's Star"
	Mass            5.6228
	Radius          14593.7
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
		SemiMajorAxis   3.45642
		Period          16.9334
		Eccentricity    0.0163278
		Inclination     0.370866
		AscendingNode   146.204
		ArgOfPericenter 246.874
		MeanAnomaly     48.6185
	}
}

Planet	"9"
{
	ParentBody     "9-9.1"
	Class	       "IceWorld"

	Mass            3.65918
	Radius          11860.3
	InertiaMoment   0.329865

	Obliquity       -0.365188
	EqAscendNode    -47.613
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.629 0.425 0.192)

	Surface
	{
		SurfStyle       0.830397
		OceanStyle      0.325031
		Randomize      (-0.949, -0.917, -0.125)
		colorDistMagn   0.0729137
		colorDistFreq   1501.38
		detailScale     30505.5
		colorConversion true
		drivenDarkening 0
		seaLevel        0.229544
		snowLevel       2
		tropicLatitude  0.0116625
		icecapLatitude  0.786568
		icecapHeight    0.243269
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.82083
		venusFreq       1.19365
		venusMagn       0
		mareFreq        1.70814
		mareDensity     0.146012
		terraceProb     0.618763
		erosion         0
		montesMagn      0.258086
		montesFreq      394.208
		montesSpiky     0.976116
		montesFraction  0.179975
		dunesMagn       0.0305583
		dunesFreq       15683.1
		dunesFraction   0.487319
		hillsMagn       0.121083
		hillsFreq       1538.96
		hillsFraction   0.172914
		hills2Fraction  0.150064
		riversMagn      57.5948
		riversFreq      3.42321
		riversSin       5.43143
		riversOctaves   0
		canyonsMagn     0.613789
		canyonsFreq     4.75546
		canyonFraction  0
		cracksMagn      0.0420193
		cracksFreq      6.70047
		cracksOctaves   8
		craterMagn      0.583058
		craterFreq      22.4721
		craterDensity   0.836328
		craterOctaves   14
		craterRayedFactor 0.278491
		volcanoMagn     0.604832
		volcanoFreq     4.11781
		volcanoDensity  0.4
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0.435396
		volcanoRadius   0.343151
		volcanoTemp     1390.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.672, 0.454, 0.330, 0.000)
		colorShelf     (0.639, 0.431, 0.313, 0.000)
		colorBeach     (0.336, 0.227, 0.165, 0.000)
		colorDesert    (0.571, 0.386, 0.281, 0.000)
		colorLowland   (0.544, 0.400, 0.313, 0.000)
		colorUpland    (0.625, 0.422, 0.307, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.544, 0.400, 0.313, 0.000)
		colorUpPlants  (0.625, 0.422, 0.307, 0.000)
		BumpHeight      19.442
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.998787
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
		Height          77.2375
		Density         0.000121268
		Pressure        7.41195e-005
		Greenhouse      0.11519
		Bright          2.61065
		Opacity         0
		SkyLight        0.870218
		Hue             0.0398399
		Saturation      1

		Composition
		{
			He    	95.5358
			Ne    	4.45539
			N2    	0.00881094
		}
	}

	Aurora
	{
		Height      120.913
		NorthLat    54.4576
		NorthLon    -47.6188
		NorthRadius 3194.36
		NorthWidth  4434.58
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -44.1666
		SouthLon    108.022
		SouthRadius 2727.37
		SouthWidth  2877.13
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
		SemiMajorAxis   0.00107012
		Period          0.041371
		Eccentricity    0.0216121
		Inclination     -0.365188
		AscendingNode   -47.613
		ArgOfPericenter 93.8968
		MeanAnomaly     42.89
	}
}

Moon	"9.1"
{
	ParentBody     "9-9.1"
	Class	       "Selena"

	Mass            1.96362
	Radius          9932.97
	InertiaMoment   0.329121

	Obliquity       -0.365188
	EqAscendNode    -47.613
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.930 0.700 0.337)

	Surface
	{
		SurfStyle       0.209332
		OceanStyle      0.152293
		Randomize      (-0.889, -0.996, 0.144)
		colorDistMagn   0.040225
		colorDistFreq   1285.23
		detailScale     25548.2
		colorConversion true
		drivenDarkening 0
		seaLevel        0.241702
		snowLevel       2
		tropicLatitude  0.0116625
		icecapLatitude  0.808288
		icecapHeight    0.255925
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.92678
		venusFreq       0.876458
		venusMagn       0
		mareFreq        2.16144
		mareDensity     0.0927818
		terraceProb     0.420554
		erosion         0
		montesMagn      0.194318
		montesFreq      526.015
		montesSpiky     0.985783
		montesFraction  0.918185
		dunesMagn       0.0429148
		dunesFreq       13077.9
		dunesFraction   0.579467
		hillsMagn       0.117188
		hillsFreq       1128.32
		hillsFraction   0.651552
		hills2Fraction  0
		riversMagn      65.8615
		riversFreq      1.94966
		riversSin       6.84015
		riversOctaves   0
		canyonsMagn     0.606077
		canyonsFreq     3.00178
		canyonFraction  0.640656
		cracksMagn      0.0507348
		cracksFreq      6.36995
		cracksOctaves   0
		craterMagn      0.607135
		craterFreq      22.4677
		craterDensity   0.812111
		craterOctaves   13.8679
		craterRayedFactor 0.183528
		volcanoMagn     0.761901
		volcanoFreq     3.21952
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.0775961
		volcanoRadius   0.298172
		volcanoTemp     1282.27
		lavaCoverTidal  0.0104873
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.337, 0.290, 0.265, 0.000)
		colorDesert    (0.418, 0.348, 0.302, 0.200)
		colorLowland   (0.452, 0.371, 0.339, 0.500)
		colorUpland    (0.472, 0.389, 0.349, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.995473
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
		Height          202.637
		Density         0.000452708
		Pressure        0.00064761
		Greenhouse      0.272877
		Bright          3.39753
		Opacity         0
		SkyLight        1.13251
		Hue             -0.0408805
		Saturation      1

		Composition
		{
			H2    	99.8897
			He    	0.106526
			Ne    	0.00377906
		}
	}

	Aurora
	{
		Height      136.179
		NorthLat    80.3451
		NorthLon    -133.598
		NorthRadius 2104.69
		NorthWidth  1946.84
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -83.3558
		SouthLon    30.5609
		SouthRadius 2552.12
		SouthWidth  3646.6
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
		SemiMajorAxis   0.00199416
		Period          0.041371
		Eccentricity    0.0216121
		Inclination     -0.365188
		AscendingNode   -47.613
		ArgOfPericenter -86.1032
		MeanAnomaly     42.89
	}
}

Comet	"C1"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            8.51332e-008
	Radius          57.7844
	InertiaMoment   0.399755

	Oblateness      0.00334086

	RotationPeriod  80.461
	Obliquity       118.827
	EqAscendNode    71.1148

	AbsMagn         7.6215
	SlopeParam      3.72284
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.840 0.784 0.745)

	Surface
	{
		SurfStyle       0.882668
		OceanStyle      0.644055
		Randomize      (-0.847, -0.751, 0.936)
		colorDistMagn   0.892308
		colorDistFreq   2.33424
		detailScale     1577.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0.218746
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.442122
		terraceProb     0.371628
		erosion         0
		montesMagn      0.369488
		montesFreq      2.89694
		montesSpiky     0.983061
		montesFraction  0.60296
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.46422
		hillsFraction   0.655622
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241541
		craterFreq      0.214242
		craterDensity   0.867324
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.0504
		volcanoTemp     1421.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.274, 0.298, 0.050)
		colorShelf     (0.336, 0.321, 0.343, 0.040)
		colorBeach     (0.386, 0.368, 0.388, 0.030)
		colorDesert    (0.437, 0.415, 0.440, 0.020)
		colorLowland   (0.487, 0.463, 0.485, 0.030)
		colorUpland    (0.537, 0.510, 0.529, 0.050)
		colorRock      (0.588, 0.557, 0.589, 0.020)
		colorSnow      (0.588, 0.557, 0.589, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.99135
		GasToDust   0.25
		Particles   2982
		GasBright   0.0116712
		DustBright  0.44982
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.67749
		Period          11.5455
		Eccentricity    0.873295
		Inclination     -106.492
		AscendingNode   -2.97725
		ArgOfPericenter 142.68
		MeanAnomaly     -71.7161
	}
}

Comet	"C2"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.62131e-015
	Radius          0.198794
	InertiaMoment   0.398607

	Oblateness      0.00470131

	RotationPeriod  77.8306
	Obliquity       72.0326
	EqAscendNode    55.6922

	AbsMagn         8.95665
	SlopeParam      2.62569
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.814 0.775 0.755)

	Surface
	{
		SurfStyle       0.662377
		OceanStyle      0.672678
		Randomize      (0.882, -0.040, 0.306)
		colorDistMagn   0.58404
		colorDistFreq   2.10054e-005
		detailScale     5.4284
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0150929
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610243
		terraceProb     0.390784
		erosion         0
		montesMagn      0.481497
		montesFreq      3.81109
		montesSpiky     0.944585
		montesFraction  0.3713
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.7564e-005
		hillsFraction   0.564993
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250913
		craterFreq      0.174779
		craterDensity   0.994071
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   608.766
		volcanoTemp     1798.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.264, 0.211, 0.000)
		colorShelf     (0.326, 0.271, 0.242, 0.000)
		colorBeach     (0.383, 0.318, 0.287, 0.000)
		colorDesert    (0.415, 0.341, 0.279, 0.000)
		colorLowland   (0.456, 0.364, 0.317, 0.000)
		colorUpland    (0.505, 0.442, 0.385, 0.000)
		colorRock      (0.546, 0.481, 0.415, 0.000)
		colorSnow      (0.595, 0.512, 0.438, 1.000)
		BumpHeight      0.178915
		BumpOffset      0.0357829
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0617916
		GasToDust   0.25
		Particles   1104
		GasBright   0.0797794
		DustBright  0.866199
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.02048
		Period          21.244
		Eccentricity    0.953078
		Inclination     -108.322
		AscendingNode   179.17
		ArgOfPericenter -157.244
		MeanAnomaly     -3.55394
	}
}

Comet	"C3"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.0274e-011
	Radius          3.57718
	InertiaMoment   0.396371

	Oblateness      0.00374714

	RotationPeriod  75.3505
	Obliquity       25.2383
	EqAscendNode    40.2696

	AbsMagn         10.4116
	SlopeParam      6.43654
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.495 0.488 0.485)

	Surface
	{
		SurfStyle       0.204398
		OceanStyle      0.0296417
		Randomize      (0.832, -0.714, 0.228)
		colorDistMagn   0.771862
		colorDistFreq   0.00708766
		detailScale     97.6809
		colorConversion true
		snowLevel       2
		tropicLatitude  0.6363
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508157
		terraceProb     0.441864
		erosion         0
		montesMagn      0.554417
		montesFreq      1.83812
		montesSpiky     0.914372
		montesFraction  0.364557
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0261006
		hillsFraction   0.521229
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238446
		craterFreq      0.167747
		craterDensity   0.867376
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   124.56
		volcanoTemp     1760.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.195, 0.194, 0.000)
		colorShelf     (0.210, 0.208, 0.206, 0.000)
		colorBeach     (0.223, 0.220, 0.218, 0.000)
		colorDesert    (0.235, 0.232, 0.231, 0.000)
		colorLowland   (0.247, 0.244, 0.243, 0.000)
		colorUpland    (0.260, 0.256, 0.255, 0.000)
		colorRock      (0.272, 0.269, 0.267, 0.000)
		colorSnow      (0.285, 0.281, 0.279, 1.000)
		BumpHeight      3.21946
		BumpOffset      0.643893
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.542984
		GasToDust   0.25
		Particles   2076
		GasBright   0.0903964
		DustBright  0.540068
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.5745
		Period          10.8857
		Eccentricity    0.938709
		Inclination     -15.3539
		AscendingNode   -153.25
		ArgOfPericenter 170.761
		MeanAnomaly     152.254
	}
}

Comet	"C4"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.56805e-007
	Radius          77.6899
	InertiaMoment   0.399101

	Oblateness      0.00534312

	RotationPeriod  72.9939
	Obliquity       338.444
	EqAscendNode    24.847

	AbsMagn         12.3019
	SlopeParam      4.9891
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.471 0.466 0.460)

	Surface
	{
		SurfStyle       0.363955
		OceanStyle      0.185488
		Randomize      (0.250, -0.089, -0.567)
		colorDistMagn   0.200654
		colorDistFreq   4.5003
		detailScale     2121.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.482724
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.462271
		terraceProb     0.438792
		erosion         0
		montesMagn      0.567619
		montesFreq      2.93832
		montesSpiky     0.871698
		montesFraction  0.493338
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.445
		hillsFraction   0.606322
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238274
		craterFreq      0.249154
		craterDensity   0.945225
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   30.7603
		volcanoTemp     1472.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.186, 0.184, 0.000)
		colorShelf     (0.200, 0.198, 0.196, 0.000)
		colorBeach     (0.212, 0.210, 0.207, 0.000)
		colorDesert    (0.224, 0.221, 0.219, 0.000)
		colorLowland   (0.236, 0.233, 0.230, 0.000)
		colorUpland    (0.247, 0.245, 0.242, 0.000)
		colorRock      (0.259, 0.256, 0.253, 0.000)
		colorSnow      (0.271, 0.268, 0.265, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0637543
		DustBright  0.251197
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.21148
		Period          8.66652
		Eccentricity    0.839241
		Inclination     30.0901
		AscendingNode   67.3121
		ArgOfPericenter 38.0863
		MeanAnomaly     48.3574
	}
}

Comet	"C5"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            4.82813e-015
	Radius          0.22144
	InertiaMoment   0.397633

	Oblateness      0.00425504

	RotationPeriod  70.7399
	Obliquity       291.65
	EqAscendNode    9.42443

	AbsMagn         17.483
	SlopeParam      3.95308
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.517 0.512 0.508)

	Surface
	{
		SurfStyle       0.581773
		OceanStyle      0.665672
		Randomize      (0.791, 0.960, -0.973)
		colorDistMagn   0.57028
		colorDistFreq   2.34162e-005
		detailScale     6.04679
		colorConversion true
		snowLevel       2
		tropicLatitude  0.854076
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.392969
		terraceProb     0.271263
		erosion         0
		montesMagn      0.419625
		montesFreq      2.09516
		montesSpiky     0.832297
		montesFraction  0.397186
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000143333
		hillsFraction   0.644806
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229925
		craterFreq      0.264485
		craterDensity   0.819319
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   499.658
		volcanoTemp     1637.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.174, 0.142, 0.000)
		colorShelf     (0.207, 0.179, 0.163, 0.000)
		colorBeach     (0.243, 0.210, 0.193, 0.000)
		colorDesert    (0.264, 0.225, 0.188, 0.000)
		colorLowland   (0.289, 0.241, 0.213, 0.000)
		colorUpland    (0.320, 0.292, 0.259, 0.000)
		colorRock      (0.346, 0.317, 0.279, 0.000)
		colorSnow      (0.377, 0.338, 0.295, 1.000)
		BumpHeight      0.199296
		BumpOffset      0.0398592
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0946176
		GasToDust   0.25
		Particles   1170
		GasBright   0.20903
		DustBright  0.590408
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.09129
		Period          14.3229
		Eccentricity    0.939054
		Inclination     -145.447
		AscendingNode   65.7761
		ArgOfPericenter -10.661
		MeanAnomaly     45.7223
	}
}

Comet	"C6"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.73421e-011
	Radius          4.81202
	InertiaMoment   0.399545

	Oblateness      0.00605131

	RotationPeriod  68.5717
	Obliquity       244.855
	EqAscendNode    354.002

	AbsMagn         3.51118
	SlopeParam      2.9034
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.738 0.736 0.735)

	Surface
	{
		SurfStyle       0.931953
		OceanStyle      0.853171
		Randomize      (-0.891, 0.646, 0.345)
		colorDistMagn   0.75671
		colorDistFreq   0.00316066
		detailScale     131.4
		colorConversion true
		snowLevel       2
		tropicLatitude  0.963255
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.347364
		terraceProb     0.454437
		erosion         0
		montesMagn      0.557861
		montesFreq      2.55742
		montesSpiky     0.86927
		montesFraction  0.92193
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0589532
		hillsFraction   0.574859
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263344
		craterFreq      0.275659
		craterDensity   0.807527
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   123.462
		volcanoTemp     1512.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.258, 0.294, 0.050)
		colorShelf     (0.295, 0.302, 0.338, 0.040)
		colorBeach     (0.339, 0.346, 0.382, 0.030)
		colorDesert    (0.384, 0.390, 0.433, 0.020)
		colorLowland   (0.428, 0.434, 0.478, 0.030)
		colorUpland    (0.472, 0.478, 0.522, 0.050)
		colorRock      (0.516, 0.522, 0.580, 0.020)
		colorSnow      (0.516, 0.522, 0.580, 1.000)
		BumpHeight      4.33082
		BumpOffset      0.866164
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.57581
		GasToDust   0.25
		Particles   2143
		GasBright   0.155106
		DustBright  0.328819
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.43573
		Period          24.6188
		Eccentricity    0.977169
		Inclination     167.001
		AscendingNode   -135.578
		ArgOfPericenter -29.0008
		MeanAnomaly     -40.1051
	}
}

Comet	"C7"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.88814e-007
	Radius          86.4878
	InertiaMoment   0.39833

	Oblateness      0.00481167

	RotationPeriod  66.4757
	Obliquity       198.061
	EqAscendNode    338.579

	AbsMagn         5.46463
	SlopeParam      7.01548
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.571 0.567 0.564)

	Surface
	{
		SurfStyle       0.619976
		OceanStyle      0.0578614
		Randomize      (0.570, -0.790, 0.730)
		colorDistMagn   0.946303
		colorDistFreq   5.89546
		detailScale     2361.69
		colorConversion true
		snowLevel       2
		tropicLatitude  0.582472
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498586
		terraceProb     0.406532
		erosion         0
		montesMagn      0.589689
		montesFreq      3.30161
		montesSpiky     0.905301
		montesFraction  0.318398
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.4316
		hillsFraction   0.603658
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233706
		craterFreq      0.319636
		craterDensity   0.859113
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.232
		volcanoTemp     1231.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.193, 0.158, 0.000)
		colorShelf     (0.228, 0.198, 0.181, 0.000)
		colorBeach     (0.268, 0.232, 0.214, 0.000)
		colorDesert    (0.291, 0.249, 0.209, 0.000)
		colorLowland   (0.320, 0.266, 0.237, 0.000)
		colorUpland    (0.354, 0.323, 0.288, 0.000)
		colorRock      (0.382, 0.351, 0.310, 0.000)
		colorSnow      (0.417, 0.374, 0.327, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.367572
		DustBright  0.600839
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.35226
		Period          16.1743
		Eccentricity    0.917252
		Inclination     18.9822
		AscendingNode   -31.2936
		ArgOfPericenter -84.2613
		MeanAnomaly     30.8961
	}
}

Comet	"C8"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            8.89283e-015
	Radius          0.298052
	InertiaMoment   0.399968

	Oblateness      0.00684794

	RotationPeriod  64.4406
	Obliquity       151.267
	EqAscendNode    323.157

	AbsMagn         6.93784
	SlopeParam      5.25779
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.442 0.440 0.435)

	Surface
	{
		SurfStyle       0.299172
		OceanStyle      0.537706
		Randomize      (0.733, -0.086, -0.825)
		colorDistMagn   0.237473
		colorDistFreq   5.00069e-005
		detailScale     8.1388
		colorConversion true
		snowLevel       2
		tropicLatitude  0.875975
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.599634
		terraceProb     0.547287
		erosion         0
		montesMagn      0.596267
		montesFreq      2.15285
		montesSpiky     0.935036
		montesFraction  0.409837
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00022713
		hillsFraction   0.780437
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221682
		craterFreq      0.250722
		craterDensity   0.858935
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   495.539
		volcanoTemp     1479.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.176, 0.174, 0.000)
		colorShelf     (0.188, 0.187, 0.185, 0.000)
		colorBeach     (0.199, 0.198, 0.196, 0.000)
		colorDesert    (0.210, 0.209, 0.207, 0.000)
		colorLowland   (0.221, 0.220, 0.217, 0.000)
		colorUpland    (0.232, 0.231, 0.228, 0.000)
		colorRock      (0.243, 0.242, 0.239, 0.000)
		colorSnow      (0.254, 0.253, 0.250, 1.000)
		BumpHeight      0.268247
		BumpOffset      0.0536493
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.127444
		GasToDust   0.25
		Particles   1237
		GasBright   0.286365
		DustBright  0.366532
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.36251
		Period          16.2485
		Eccentricity    0.934599
		Inclination     -47.9874
		AscendingNode   -72.9837
		ArgOfPericenter -91.9712
		MeanAnomaly     -130.126
	}
}

Comet	"C9"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            6.87795e-011
	Radius          5.35346
	InertiaMoment   0.398866

	Oblateness      0.0054392

	RotationPeriod  62.4567
	Obliquity       104.473
	EqAscendNode    307.734

	AbsMagn         8.27596
	SlopeParam      4.1827
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.814 0.748 0.671)

	Surface
	{
		SurfStyle       0.500674
		OceanStyle      0.858466
		Randomize      (0.189, 0.754, -0.987)
		colorDistMagn   0.417282
		colorDistFreq   0.0120046
		detailScale     146.185
		colorConversion true
		snowLevel       2
		tropicLatitude  0.516566
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.438542
		terraceProb     0.389072
		erosion         0
		montesMagn      0.525922
		montesFreq      2.47856
		montesSpiky     0.88057
		montesFraction  0.351102
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0719697
		hillsFraction   0.741611
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.281335
		craterFreq      0.166615
		craterDensity   0.893961
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   101.207
		volcanoTemp     1372.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.254, 0.188, 0.000)
		colorShelf     (0.325, 0.262, 0.215, 0.000)
		colorBeach     (0.382, 0.307, 0.255, 0.000)
		colorDesert    (0.415, 0.329, 0.248, 0.000)
		colorLowland   (0.456, 0.351, 0.282, 0.000)
		colorUpland    (0.504, 0.426, 0.342, 0.000)
		colorRock      (0.545, 0.464, 0.369, 0.000)
		colorSnow      (0.594, 0.494, 0.389, 1.000)
		BumpHeight      4.81811
		BumpOffset      0.963623
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.608635
		GasToDust   0.25
		Particles   2209
		GasBright   0.1679
		DustBright  0.169484
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.28969
		Period          9.13029
		Eccentricity    0.907824
		Inclination     -97.1885
		AscendingNode   -157.498
		ArgOfPericenter 26.662
		MeanAnomaly     -134.36
	}
}

Comet	"C10"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            5.3196e-007
	Radius          116.481
	InertiaMoment   0.39715

	Oblateness      0.0076667

	RotationPeriod  60.5159
	Obliquity       57.6783
	EqAscendNode    292.311

	AbsMagn         9.64663
	SlopeParam      3.16138
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.662 0.659 0.658)

	Surface
	{
		SurfStyle       0.87479
		OceanStyle      0.909609
		Randomize      (-0.704, 0.831, 0.510)
		colorDistMagn   0.945765
		colorDistFreq   6.6873
		detailScale     3180.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.275385
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.476805
		terraceProb     0.173945
		erosion         0
		montesMagn      0.385607
		montesFreq      2.85829
		montesSpiky     0.988701
		montesFraction  0.730061
		dunesFraction   0
		hillsMagn       0
		hillsFreq       29.6621
		hillsFraction   0.755744
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211619
		craterFreq      0.389435
		craterDensity   0.910419
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.0394
		volcanoTemp     1278.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.231, 0.263, 0.050)
		colorShelf     (0.265, 0.270, 0.303, 0.040)
		colorBeach     (0.305, 0.310, 0.342, 0.030)
		colorDesert    (0.344, 0.349, 0.388, 0.020)
		colorLowland   (0.384, 0.389, 0.428, 0.030)
		colorUpland    (0.424, 0.428, 0.467, 0.050)
		colorRock      (0.463, 0.468, 0.520, 0.020)
		colorSnow      (0.463, 0.468, 0.520, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.046598
		DustBright  0.775273
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.129
		Period          14.5857
		Eccentricity    0.929954
		Inclination     107.016
		AscendingNode   5.09765
		ArgOfPericenter 49.8135
		MeanAnomaly     -95.7872
	}
}

Comet	"C11"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.63794e-014
	Radius          0.331355
	InertiaMoment   0.39933

	Oblateness      0.00616074

	RotationPeriod  58.6107
	Obliquity       10.884
	EqAscendNode    276.889

	AbsMagn         11.2523
	SlopeParam      8.10503
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.786 0.782 0.780)

	Surface
	{
		SurfStyle       0.915342
		OceanStyle      0.00238081
		Randomize      (-0.198, 0.712, -0.722)
		colorDistMagn   0.9568
		colorDistFreq   6.8126e-005
		detailScale     9.0482
		colorConversion true
		snowLevel       2
		tropicLatitude  0.38202
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.561499
		terraceProb     0.104545
		erosion         0
		montesMagn      0.629774
		montesFreq      3.34622
		montesSpiky     0.961948
		montesFraction  0.455195
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000260508
		hillsFraction   0.699421
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227968
		craterFreq      0.254214
		craterDensity   0.828845
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   405.929
		volcanoTemp     1582.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.274, 0.312, 0.050)
		colorShelf     (0.314, 0.320, 0.359, 0.040)
		colorBeach     (0.361, 0.367, 0.405, 0.030)
		colorDesert    (0.409, 0.414, 0.460, 0.020)
		colorLowland   (0.456, 0.461, 0.507, 0.030)
		colorUpland    (0.503, 0.508, 0.554, 0.050)
		colorRock      (0.550, 0.555, 0.616, 0.020)
		colorSnow      (0.550, 0.555, 0.616, 1.000)
		BumpHeight      0.29822
		BumpOffset      0.0596439
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.160269
		GasToDust   0.25
		Particles   1303
		GasBright   0.0586072
		DustBright  0.44775
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.39072
		Period          24.245
		Eccentricity    0.952203
		Inclination     11.9947
		AscendingNode   21.8691
		ArgOfPericenter 18.266
		MeanAnomaly     64.4923
	}
}

Comet	"C12"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.26683e-010
	Radius          7.21479
	InertiaMoment   0.398016

	Oblateness      0.00873206

	RotationPeriod  56.7349
	Obliquity       324.09
	EqAscendNode    261.466

	AbsMagn         13.7332
	SlopeParam      5.55143
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.470 0.462 0.458)

	Surface
	{
		SurfStyle       0.660756
		OceanStyle      0.717815
		Randomize      (0.534, 0.627, -0.758)
		colorDistMagn   0.23252
		colorDistFreq   0.0335652
		detailScale     197.012
		colorConversion true
		snowLevel       2
		tropicLatitude  0.288144
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.670954
		terraceProb     0.161111
		erosion         0
		montesMagn      0.413173
		montesFreq      3.33096
		montesSpiky     0.96654
		montesFraction  0.842025
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.136153
		hillsFraction   0.549581
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25426
		craterFreq      0.159845
		craterDensity   0.888805
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   100.501
		volcanoTemp     1524.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.157, 0.128, 0.000)
		colorShelf     (0.188, 0.162, 0.146, 0.000)
		colorBeach     (0.221, 0.189, 0.174, 0.000)
		colorDesert    (0.240, 0.203, 0.169, 0.000)
		colorLowland   (0.263, 0.217, 0.192, 0.000)
		colorUpland    (0.291, 0.263, 0.233, 0.000)
		colorRock      (0.315, 0.286, 0.252, 0.000)
		colorSnow      (0.343, 0.305, 0.265, 1.000)
		BumpHeight      6.49331
		BumpOffset      1.29866
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.641461
		GasToDust   0.25
		Particles   2275
		GasBright   0.173188
		DustBright  0.817656
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.99101
		Period          13.6316
		Eccentricity    0.960298
		Inclination     19.3914
		AscendingNode   -6.19996
		ArgOfPericenter -137.576
		MeanAnomaly     123.196
	}
}

Comet	"C13"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.90067e-018
	Radius          0.0205083
	InertiaMoment   0.399761

	Oblateness      0.00700635

	RotationPeriod  54.8825
	Obliquity       277.295
	EqAscendNode    246.044

	AbsMagn         1.90795
	SlopeParam      4.41476
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.596 0.594 0.589)

	Surface
	{
		SurfStyle       0.0964372
		OceanStyle      0.295043
		Randomize      (-0.282, -0.129, -0.421)
		colorDistMagn   0.510705
		colorDistFreq   2.71144e-007
		detailScale     0.560014
		colorConversion true
		snowLevel       2
		tropicLatitude  0.985442
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.596103
		terraceProb     0.225765
		erosion         0
		montesMagn      0.540942
		montesFreq      2.49059
		montesSpiky     0.982894
		montesFraction  0.312273
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.10364e-006
		hillsFraction   0.837971
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233999
		craterFreq      0.214943
		craterDensity   0.962497
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1628.05
		volcanoTemp     1232.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.237, 0.236, 0.000)
		colorShelf     (0.253, 0.252, 0.251, 0.000)
		colorBeach     (0.268, 0.267, 0.265, 0.000)
		colorDesert    (0.283, 0.282, 0.280, 0.000)
		colorLowland   (0.298, 0.297, 0.295, 0.000)
		colorUpland    (0.313, 0.312, 0.309, 0.000)
		colorRock      (0.328, 0.326, 0.324, 0.000)
		colorSnow      (0.343, 0.341, 0.339, 1.000)
		BumpHeight      0.0184575
		BumpOffset      0.0036915
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.157915
		DustBright  0.517416
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.24641
		Period          15.4143
		Eccentricity    0.946862
		Inclination     168.016
		AscendingNode   -102.846
		ArgOfPericenter -11.2583
		MeanAnomaly     -167.823
	}
}

Comet	"C14"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.01689e-014
	Radius          0.446881
	InertiaMoment   0.398614

	Oblateness      0.00998883

	RotationPeriod  53.0481
	Obliquity       230.501
	EqAscendNode    230.621

	AbsMagn         4.5772
	SlopeParam      3.40606
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.670 0.555 0.504)

	Surface
	{
		SurfStyle       0.27749
		OceanStyle      0.966624
		Randomize      (0.011, 0.647, 0.873)
		colorDistMagn   0.0725528
		colorDistFreq   0.000150901
		detailScale     12.2028
		colorConversion true
		snowLevel       2
		tropicLatitude  0.796134
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.613614
		terraceProb     0.191794
		erosion         0
		montesMagn      0.484564
		montesFreq      2.67136
		montesSpiky     0.916179
		montesFraction  0.715533
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000509772
		hillsFraction   0.820825
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223054
		craterFreq      0.191119
		craterDensity   0.85925
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   403.383
		volcanoTemp     1577.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.222, 0.202, 0.000)
		colorShelf     (0.285, 0.236, 0.214, 0.000)
		colorBeach     (0.302, 0.250, 0.227, 0.000)
		colorDesert    (0.318, 0.264, 0.240, 0.000)
		colorLowland   (0.335, 0.278, 0.252, 0.000)
		colorUpland    (0.352, 0.291, 0.265, 0.000)
		colorRock      (0.369, 0.305, 0.277, 0.000)
		colorSnow      (0.386, 0.319, 0.290, 1.000)
		BumpHeight      0.402193
		BumpOffset      0.0804385
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.193095
		GasToDust   0.25
		Particles   1369
		GasBright   0.105383
		DustBright  0.254434
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.73301
		Period          11.9064
		Eccentricity    0.935454
		Inclination     37.7144
		AscendingNode   -102.473
		ArgOfPericenter 131.191
		MeanAnomaly     -138.756
	}
}

Comet	"C15"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.33335e-010
	Radius          8.00834
	InertiaMoment   0.396398

	Oblateness      0.00790471

	RotationPeriod  51.2268
	Obliquity       183.707
	EqAscendNode    215.199

	AbsMagn         6.2214
	SlopeParam      2.20215
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.474 0.428 0.364)

	Surface
	{
		SurfStyle       0.781512
		OceanStyle      0.995706
		Randomize      (-0.558, -0.905, -0.429)
		colorDistMagn   0.599086
		colorDistFreq   0.0550742
		detailScale     218.681
		colorConversion true
		snowLevel       2
		tropicLatitude  0.968127
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.760298
		terraceProb     0.325492
		erosion         0
		montesMagn      0.560276
		montesFreq      3.34886
		montesSpiky     0.895182
		montesFraction  0.586547
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.197687
		hillsFraction   0.650222
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222382
		craterFreq      0.201162
		craterDensity   0.801475
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   82.1976
		volcanoTemp     1598.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.146, 0.102, 0.000)
		colorShelf     (0.189, 0.150, 0.116, 0.000)
		colorBeach     (0.223, 0.176, 0.138, 0.000)
		colorDesert    (0.242, 0.189, 0.135, 0.000)
		colorLowland   (0.265, 0.201, 0.153, 0.000)
		colorUpland    (0.294, 0.244, 0.186, 0.000)
		colorRock      (0.317, 0.266, 0.200, 0.000)
		colorSnow      (0.346, 0.283, 0.211, 1.000)
		BumpHeight      7.20751
		BumpOffset      1.4415
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.674287
		GasToDust   0.25
		Particles   2341
		GasBright   0.29713
		DustBright  0.547173
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.93989
		Period          13.2836
		Eccentricity    0.930858
		Inclination     -75.1585
		AscendingNode   94.7273
		ArgOfPericenter -16.6079
		MeanAnomaly     149.623
	}
}

Comet	"C16"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            7.18455e-018
	Radius          0.0276797
	InertiaMoment   0.399107

	Oblateness      0.0115088

	RotationPeriod  49.4137
	Obliquity       136.912
	EqAscendNode    199.776

	AbsMagn         7.60321
	SlopeParam      5.88313
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.605 0.500 0.458)

	Surface
	{
		SurfStyle       0.83702
		OceanStyle      0.132632
		Randomize      (0.587, 0.831, -0.602)
		colorDistMagn   0.807276
		colorDistFreq   2.81746e-007
		detailScale     0.75584
		colorConversion true
		snowLevel       2
		tropicLatitude  0.687344
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.357397
		terraceProb     0.279611
		erosion         0
		montesMagn      0.593227
		montesFreq      2.59176
		montesSpiky     0.969509
		montesFraction  0.872802
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.83309e-006
		hillsFraction   0.578442
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224938
		craterFreq      0.266251
		craterDensity   0.907878
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1619.08
		volcanoTemp     1576.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.170, 0.128, 0.000)
		colorShelf     (0.242, 0.175, 0.146, 0.000)
		colorBeach     (0.284, 0.205, 0.174, 0.000)
		colorDesert    (0.309, 0.220, 0.169, 0.000)
		colorLowland   (0.339, 0.235, 0.192, 0.000)
		colorUpland    (0.375, 0.285, 0.233, 0.000)
		colorRock      (0.405, 0.310, 0.252, 0.000)
		colorSnow      (0.442, 0.330, 0.265, 1.000)
		BumpHeight      0.0249117
		BumpOffset      0.00498234
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.217316
		DustBright  0.311474
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.67808
		Period          11.5493
		Eccentricity    0.941312
		Inclination     -170.043
		AscendingNode   86.5923
		ArgOfPericenter 177.034
		MeanAnomaly     59.1723
	}
}

Comet	"C17"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            5.55673e-014
	Radius          0.495595
	InertiaMoment   0.397644

	Oblateness      0.00915234

	RotationPeriod  47.6041
	Obliquity       90.1182
	EqAscendNode    184.353

	AbsMagn         8.93793
	SlopeParam      4.65256
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.772 0.770 0.769)

	Surface
	{
		SurfStyle       0.497108
		OceanStyle      0.612525
		Randomize      (0.974, -0.343, -0.615)
		colorDistMagn   0.910688
		colorDistFreq   0.000199295
		detailScale     13.5331
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999998
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.45215
		terraceProb     0.419779
		erosion         0
		montesMagn      0.454095
		montesFreq      2.73287
		montesSpiky     0.922433
		montesFraction  0.793812
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000420091
		hillsFraction   0.870416
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234451
		craterFreq      0.275049
		craterDensity   0.987185
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   329.628
		volcanoTemp     1643.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.308, 0.308, 0.000)
		colorShelf     (0.328, 0.327, 0.327, 0.000)
		colorBeach     (0.348, 0.347, 0.346, 0.000)
		colorDesert    (0.367, 0.366, 0.366, 0.000)
		colorLowland   (0.386, 0.385, 0.385, 0.000)
		colorUpland    (0.405, 0.404, 0.404, 0.000)
		colorRock      (0.425, 0.424, 0.423, 0.000)
		colorSnow      (0.444, 0.443, 0.442, 1.000)
		BumpHeight      0.446036
		BumpOffset      0.0892071
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.225921
		GasToDust   0.25
		Particles   1436
		GasBright   0.100243
		DustBright  0.113034
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.62918
		Period          11.2344
		Eccentricity    0.953175
		Inclination     88.3745
		AscendingNode   -90.1187
		ArgOfPericenter 102.21
		MeanAnomaly     132.479
	}
}

Comet	"C18"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            4.29773e-010
	Radius          10.8176
	InertiaMoment   0.399551

	Oblateness      0.013394

	RotationPeriod  45.7936
	Obliquity       43.3239
	EqAscendNode    168.931

	AbsMagn         10.3898
	SlopeParam      3.64213
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.764 0.762 0.760)

	Surface
	{
		SurfStyle       0.805748
		OceanStyle      0.70792
		Randomize      (-0.161, -0.100, 0.291)
		colorDistMagn   0.47433
		colorDistFreq   0.0591624
		detailScale     295.393
		colorConversion true
		snowLevel       2
		tropicLatitude  0.722907
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.548687
		terraceProb     0.607777
		erosion         0
		montesMagn      0.434826
		montesFreq      2.67701
		montesSpiky     0.886944
		montesFraction  0.703198
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.223336
		hillsFraction   0.678561
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226069
		craterFreq      0.2253
		craterDensity   0.955488
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   81.8121
		volcanoTemp     1375.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.259, 0.213, 0.000)
		colorShelf     (0.306, 0.267, 0.243, 0.000)
		colorBeach     (0.359, 0.313, 0.289, 0.000)
		colorDesert    (0.390, 0.335, 0.281, 0.000)
		colorLowland   (0.428, 0.358, 0.319, 0.000)
		colorUpland    (0.474, 0.435, 0.388, 0.000)
		colorRock      (0.512, 0.473, 0.418, 0.000)
		colorSnow      (0.558, 0.503, 0.441, 1.000)
		BumpHeight      9.73585
		BumpOffset      1.94717
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.707113
		GasToDust   0.25
		Particles   2408
		GasBright   0.0202766
		DustBright  0.677487
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.24492
		Period          15.4037
		Eccentricity    0.970468
		Inclination     4.19015
		AscendingNode   46.3617
		ArgOfPericenter -44.7112
		MeanAnomaly     -51.0356
	}
}

Comet	"C19"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.3233e-017
	Radius          0.0306677
	InertiaMoment   0.398337

	Oblateness      0.0106982

	RotationPeriod  43.9775
	Obliquity       356.53
	EqAscendNode    153.508

	AbsMagn         12.2696
	SlopeParam      2.52294
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.741 0.693 0.596)

	Surface
	{
		SurfStyle       0.608833
		OceanStyle      0.400295
		Randomize      (0.094, 0.056, -0.177)
		colorDistMagn   0.233306
		colorDistFreq   5.67617e-007
		detailScale     0.837431
		colorConversion true
		snowLevel       2
		tropicLatitude  0.888646
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.644718
		terraceProb     0.246407
		erosion         0
		montesMagn      0.438875
		montesFreq      2.85604
		montesSpiky     0.915331
		montesFraction  0.403988
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.65624e-006
		hillsFraction   0.701238
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252644
		craterFreq      0.253629
		craterDensity   0.906179
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1321.77
		volcanoTemp     1534.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.236, 0.167, 0.000)
		colorShelf     (0.297, 0.242, 0.191, 0.000)
		colorBeach     (0.348, 0.284, 0.226, 0.000)
		colorDesert    (0.378, 0.305, 0.220, 0.000)
		colorLowland   (0.415, 0.326, 0.250, 0.000)
		colorUpland    (0.460, 0.395, 0.304, 0.000)
		colorRock      (0.497, 0.430, 0.328, 0.000)
		colorSnow      (0.541, 0.457, 0.345, 1.000)
		BumpHeight      0.0276009
		BumpOffset      0.00552018
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.033678
		DustBright  0.348572
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.69544
		Period          18.7205
		Eccentricity    0.967594
		Inclination     -61.5931
		AscendingNode   72.2156
		ArgOfPericenter 89.9555
		MeanAnomaly     -17.8736
	}
}

Comet	"C20"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.02348e-013
	Radius          0.670043
	InertiaMoment   0.399973

	Oblateness      0.0158003

	RotationPeriod  42.151
	Obliquity       309.735
	EqAscendNode    138.086

	AbsMagn         17.2046
	SlopeParam      6.27699
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.711 0.708 0.705)

	Surface
	{
		SurfStyle       0.0547474
		OceanStyle      0.579371
		Randomize      (-0.758, 0.973, 0.062)
		colorDistMagn   0.555071
		colorDistFreq   0.000276626
		detailScale     18.2966
		colorConversion true
		snowLevel       2
		tropicLatitude  0.921795
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.609055
		terraceProb     0.304346
		erosion         0
		montesMagn      0.5107
		montesFreq      2.49174
		montesSpiky     0.964369
		montesFraction  0.22306
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000920308
		hillsFraction   0.624888
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238778
		craterFreq      0.219354
		craterDensity   0.856137
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   328.374
		volcanoTemp     1692.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.283, 0.282, 0.000)
		colorShelf     (0.302, 0.301, 0.300, 0.000)
		colorBeach     (0.320, 0.319, 0.317, 0.000)
		colorDesert    (0.338, 0.336, 0.335, 0.000)
		colorLowland   (0.356, 0.354, 0.353, 0.000)
		colorUpland    (0.373, 0.372, 0.370, 0.000)
		colorRock      (0.391, 0.390, 0.388, 0.000)
		colorSnow      (0.409, 0.407, 0.406, 1.000)
		BumpHeight      0.603039
		BumpOffset      0.120608
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.258747
		GasToDust   0.25
		Particles   1502
		GasBright   0.12754
		DustBright  0.739196
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.40692
		Period          16.5715
		Eccentricity    0.943612
		Inclination     151.79
		AscendingNode   -61.1077
		ArgOfPericenter -162.964
		MeanAnomaly     -28.9677
	}
}

Comet	"C21"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            7.91587e-010
	Radius          11.9729
	InertiaMoment   0.398872

	Oblateness      0.0126925

	RotationPeriod  40.3094
	Obliquity       262.941
	EqAscendNode    122.663

	AbsMagn         3.47685
	SlopeParam      4.9
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.774 0.727 0.667)

	Surface
	{
		SurfStyle       0.963929
		OceanStyle      0.490155
		Randomize      (0.993, -0.403, 0.929)
		colorDistMagn   0.727411
		colorDistFreq   0.0823017
		detailScale     326.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.865245
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610573
		terraceProb     0.237282
		erosion         0
		montesMagn      0.528389
		montesFreq      3.12749
		montesSpiky     0.963708
		montesFraction  0.593578
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.350848
		hillsFraction   0.778499
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244293
		craterFreq      0.210018
		craterDensity   0.816291
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   66.72
		volcanoTemp     1305.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.254, 0.267, 0.050)
		colorShelf     (0.310, 0.298, 0.307, 0.040)
		colorBeach     (0.356, 0.342, 0.347, 0.030)
		colorDesert    (0.403, 0.385, 0.394, 0.020)
		colorLowland   (0.449, 0.429, 0.434, 0.030)
		colorUpland    (0.495, 0.472, 0.474, 0.050)
		colorRock      (0.542, 0.516, 0.527, 0.020)
		colorSnow      (0.542, 0.516, 0.527, 1.000)
		BumpHeight      10.7756
		BumpOffset      2.15512
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.739939
		GasToDust   0.25
		Particles   2474
		GasBright   0.11366
		DustBright  0.437564
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.19949
		Period          15.0813
		Eccentricity    0.954599
		Inclination     -126.927
		AscendingNode   43.5299
		ArgOfPericenter -151.263
		MeanAnomaly     89.1998
	}
}

Comet	"C22"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.43736e-017
	Radius          0.0415026
	InertiaMoment   0.397165

	Oblateness      0.0187522

	RotationPeriod  38.4474
	Obliquity       216.147
	EqAscendNode    107.24

	AbsMagn         5.44234
	SlopeParam      3.87331
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.768 0.766 0.763)

	Surface
	{
		SurfStyle       0.765157
		OceanStyle      0.360462
		Randomize      (0.463, -0.408, 0.913)
		colorDistMagn   0.853099
		colorDistFreq   4.08472e-007
		detailScale     1.1333
		colorConversion true
		snowLevel       2
		tropicLatitude  0.539975
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.486367
		terraceProb     0.171701
		erosion         0
		montesMagn      0.540122
		montesFreq      1.94333
		montesSpiky     0.770527
		montesFraction  0.502624
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.89923e-006
		hillsFraction   0.478195
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214794
		craterFreq      0.230975
		craterDensity   0.832193
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1318.02
		volcanoTemp     1390.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.261, 0.214, 0.000)
		colorShelf     (0.307, 0.268, 0.244, 0.000)
		colorBeach     (0.361, 0.314, 0.290, 0.000)
		colorDesert    (0.392, 0.337, 0.282, 0.000)
		colorLowland   (0.430, 0.360, 0.320, 0.000)
		colorUpland    (0.476, 0.437, 0.389, 0.000)
		colorRock      (0.515, 0.475, 0.420, 0.000)
		colorSnow      (0.561, 0.506, 0.442, 1.000)
		BumpHeight      0.0373524
		BumpOffset      0.00747048
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0625197
		DustBright  0.17319
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.2564
		Period          15.4855
		Eccentricity    0.938787
		Inclination     153.138
		AscendingNode   -62.9262
		ArgOfPericenter -127.072
		MeanAnomaly     123.984
	}
}

Comet	"C23"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.88512e-013
	Radius          0.740763
	InertiaMoment   0.399336

	Oblateness      0.0153713

	RotationPeriod  36.5595
	Obliquity       169.352
	EqAscendNode    91.8178

	AbsMagn         6.91897
	SlopeParam      2.80956
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.706 0.704 0.701)

	Surface
	{
		SurfStyle       0.965311
		OceanStyle      0.245635
		Randomize      (0.361, 0.394, 0.987)
		colorDistMagn   0.861677
		colorDistFreq   0.000317931
		detailScale     20.2278
		colorConversion true
		snowLevel       2
		tropicLatitude  0.926713
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.524035
		terraceProb     0.190131
		erosion         0
		montesMagn      0.63172
		montesFreq      3.34641
		montesSpiky     0.997246
		montesFraction  0.329132
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00114865
		hillsFraction   0.735718
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220637
		craterFreq      0.205001
		craterDensity   0.994037
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   267.495
		volcanoTemp     1484.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.246, 0.280, 0.050)
		colorShelf     (0.283, 0.288, 0.322, 0.040)
		colorBeach     (0.325, 0.331, 0.364, 0.030)
		colorDesert    (0.367, 0.373, 0.414, 0.020)
		colorLowland   (0.410, 0.415, 0.456, 0.030)
		colorUpland    (0.452, 0.457, 0.498, 0.050)
		colorRock      (0.495, 0.500, 0.554, 0.020)
		colorSnow      (0.495, 0.500, 0.554, 1.000)
		BumpHeight      0.666686
		BumpOffset      0.133337
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.291573
		GasToDust   0.25
		Particles   1568
		GasBright   0.233549
		DustBright  0.486647
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.27139
		Period          15.5926
		Eccentricity    0.93319
		Inclination     115.802
		AscendingNode   -71.7858
		ArgOfPericenter 153.084
		MeanAnomaly     -110.402
	}
}

Comet	"C24"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.45801e-009
	Radius          16.22
	InertiaMoment   0.398025

	Oblateness      0.0231272

	RotationPeriod  34.6396
	Obliquity       122.558
	EqAscendNode    76.3952

	AbsMagn         8.25771
	SlopeParam      6.78737
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.813 0.753 0.690)

	Surface
	{
		SurfStyle       0.802601
		OceanStyle      0.59361
		Randomize      (-0.196, 0.194, -0.121)
		colorDistMagn   0.691931
		colorDistFreq   0.109395
		detailScale     442.913
		colorConversion true
		snowLevel       2
		tropicLatitude  0.89954
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.726987
		terraceProb     0.280152
		erosion         0
		montesMagn      0.501116
		montesFreq      3.0677
		montesSpiky     0.811533
		montesFraction  0.484275
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.30462
		hillsFraction   0.49574
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253916
		craterFreq      0.176294
		craterDensity   0.920065
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   66.6002
		volcanoTemp     1600.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.256, 0.193, 0.000)
		colorShelf     (0.325, 0.263, 0.221, 0.000)
		colorBeach     (0.382, 0.309, 0.262, 0.000)
		colorDesert    (0.415, 0.331, 0.255, 0.000)
		colorLowland   (0.455, 0.354, 0.290, 0.000)
		colorUpland    (0.504, 0.429, 0.352, 0.000)
		colorRock      (0.545, 0.467, 0.380, 0.000)
		colorSnow      (0.594, 0.497, 0.400, 1.000)
		BumpHeight      14.598
		BumpOffset      2.91959
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.772765
		GasToDust   0.25
		Particles   2540
		GasBright   0.155127
		DustBright  0.249555
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.35816
		Period          9.54288
		Eccentricity    0.920588
		Inclination     65.8247
		AscendingNode   -148.731
		ArgOfPericenter -20.481
		MeanAnomaly     -133.11
	}
}

Comet	"C25"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            4.48931e-017
	Radius          0.0458261
	InertiaMoment   0.399766

	Oblateness      0.0191553

	RotationPeriod  32.6808
	Obliquity       75.7638
	EqAscendNode    60.9726

	AbsMagn         9.62684
	SlopeParam      5.16209
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.478 0.474 0.472)

	Surface
	{
		SurfStyle       0.374069
		OceanStyle      0.893494
		Randomize      (0.225, -0.875, 0.494)
		colorDistMagn   0.856392
		colorDistFreq   1.61127e-006
		detailScale     1.25136
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99999
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.559054
		terraceProb     0.180835
		erosion         0
		montesMagn      0.335328
		montesFreq      2.82825
		montesSpiky     0.893555
		montesFraction  0.783491
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.2838e-006
		hillsFraction   0.740181
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222798
		craterFreq      0.228734
		craterDensity   0.932105
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1072.33
		volcanoTemp     1490.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.190, 0.189, 0.000)
		colorShelf     (0.203, 0.201, 0.201, 0.000)
		colorBeach     (0.215, 0.213, 0.212, 0.000)
		colorDesert    (0.227, 0.225, 0.224, 0.000)
		colorLowland   (0.239, 0.237, 0.236, 0.000)
		colorUpland    (0.251, 0.249, 0.248, 0.000)
		colorRock      (0.263, 0.261, 0.260, 0.000)
		colorSnow      (0.275, 0.273, 0.271, 1.000)
		BumpHeight      0.0412435
		BumpOffset      0.00824871
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.393347
		DustBright  0.495822
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.43589
		Period          24.6202
		Eccentricity    0.943274
		Inclination     164.772
		AscendingNode   156.139
		ArgOfPericenter -32.4683
		MeanAnomaly     73.0026
	}
}

Comet	"C26"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.47216e-013
	Radius          1.00467
	InertiaMoment   0.39862

	Oblateness      0.0294942

	RotationPeriod  30.6756
	Obliquity       28.9695
	EqAscendNode    45.55

	AbsMagn         11.227
	SlopeParam      4.1028
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.541 0.537 0.532)

	Surface
	{
		SurfStyle       0.159858
		OceanStyle      0.0507426
		Randomize      (0.337, 0.089, 0.039)
		colorDistMagn   0.825927
		colorDistFreq   0.000796695
		detailScale     27.4343
		colorConversion true
		snowLevel       2
		tropicLatitude  0.460162
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.690546
		terraceProb     0.312195
		erosion         0
		montesMagn      0.477044
		montesFreq      3.32642
		montesSpiky     0.971325
		montesFraction  0.767248
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00248345
		hillsFraction   0.484382
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219911
		craterFreq      0.232655
		craterDensity   0.826887
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   267.32
		volcanoTemp     1198.71
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
		BumpHeight      0.904205
		BumpOffset      0.180841
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.324399
		GasToDust   0.25
		Particles   1635
		GasBright   0.00081545
		DustBright  0.57284
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.08719
		Period          14.2944
		Eccentricity    0.954252
		Inclination     35.3541
		AscendingNode   128.455
		ArgOfPericenter -31.9074
		MeanAnomaly     -65.9546
	}
}

Comet	"C27"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.68546e-009
	Radius          17.8852
	InertiaMoment   0.396425

	Oblateness      0.0245214

	RotationPeriod  28.6152
	Obliquity       342.175
	EqAscendNode    30.1275

	AbsMagn         13.6828
	SlopeParam      3.07353
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.526 0.521 0.516)

	Surface
	{
		SurfStyle       0.353269
		OceanStyle      0.783476
		Randomize      (0.361, -0.607, 0.617)
		colorDistMagn   0.633258
		colorDistFreq   0.211096
		detailScale     488.386
		colorConversion true
		snowLevel       2
		tropicLatitude  0.744284
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48579
		terraceProb     0.2501
		erosion         0
		montesMagn      0.503892
		montesFreq      2.94866
		montesSpiky     0.997607
		montesFraction  0.110264
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.708171
		hillsFraction   0.641594
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251734
		craterFreq      0.266403
		craterDensity   0.918222
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   54.1117
		volcanoTemp     1612.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.208, 0.206, 0.000)
		colorShelf     (0.224, 0.221, 0.219, 0.000)
		colorBeach     (0.237, 0.234, 0.232, 0.000)
		colorDesert    (0.250, 0.248, 0.245, 0.000)
		colorLowland   (0.263, 0.261, 0.258, 0.000)
		colorUpland    (0.276, 0.274, 0.271, 0.000)
		colorRock      (0.289, 0.287, 0.284, 0.000)
		colorSnow      (0.302, 0.300, 0.297, 1.000)
		BumpHeight      16.0967
		BumpOffset      3.21934
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.805591
		GasToDust   0.25
		Particles   2607
		GasBright   0.015609
		DustBright  0.242533
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.28981
		Period          15.7244
		Eccentricity    0.976242
		Inclination     64.8639
		AscendingNode   18.0482
		ArgOfPericenter 86.694
		MeanAnomaly     -136.108
	}
}

Comet	"C28"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            8.26873e-017
	Radius          0.0622301
	InertiaMoment   0.399113

	Oblateness      0.0395438

	RotationPeriod  26.4891
	Obliquity       295.381
	EqAscendNode    14.7049

	AbsMagn         1.84924
	SlopeParam      7.59936
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.664 0.536 0.464)

	Surface
	{
		SurfStyle       0.153931
		OceanStyle      0.989632
		Randomize      (0.060, 0.082, -0.341)
		colorDistMagn   0.0548358
		colorDistFreq   2.38945e-006
		detailScale     1.6993
		colorConversion true
		snowLevel       2
		tropicLatitude  0.977113
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.547135
		terraceProb     0.259113
		erosion         0
		montesMagn      0.46063
		montesFreq      3.49122
		montesSpiky     0.849011
		montesFraction  0.58048
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.1573e-005
		hillsFraction   0.656224
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265756
		craterFreq      0.251443
		craterDensity   0.887214
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1072.97
		volcanoTemp     1545.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.214, 0.186, 0.000)
		colorShelf     (0.282, 0.228, 0.197, 0.000)
		colorBeach     (0.299, 0.241, 0.209, 0.000)
		colorDesert    (0.315, 0.255, 0.220, 0.000)
		colorLowland   (0.332, 0.268, 0.232, 0.000)
		colorUpland    (0.348, 0.281, 0.244, 0.000)
		colorRock      (0.365, 0.295, 0.255, 0.000)
		colorSnow      (0.382, 0.308, 0.267, 1.000)
		BumpHeight      0.056007
		BumpOffset      0.0112014
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0887531
		DustBright  0.653876
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.88832
		Period          20.2052
		Eccentricity    0.963621
		Inclination     -131.655
		AscendingNode   -96.1368
		ArgOfPericenter 135.989
		MeanAnomaly     -57.7593
	}
}

Comet	"C29"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            6.39527e-013
	Radius          1.10615
	InertiaMoment   0.397654

	Oblateness      0.0339763

	RotationPeriod  24.2852
	Obliquity       248.587
	EqAscendNode    359.282

	AbsMagn         4.55088
	SlopeParam      5.44591
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.617 0.565 0.526)

	Surface
	{
		SurfStyle       0.0519807
		OceanStyle      0.35085
		Randomize      (0.289, -0.389, -0.547)
		colorDistMagn   0.582475
		colorDistFreq   0.000550797
		detailScale     30.2053
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994417
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399939
		terraceProb     0.267039
		erosion         0
		montesMagn      0.546815
		montesFreq      2.61713
		montesSpiky     0.849437
		montesFraction  0.814694
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00310982
		hillsFraction   0.730457
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233185
		craterFreq      0.178972
		craterDensity   1.03078
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   216.866
		volcanoTemp     1794.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.226, 0.210, 0.000)
		colorShelf     (0.262, 0.240, 0.223, 0.000)
		colorBeach     (0.278, 0.254, 0.236, 0.000)
		colorDesert    (0.293, 0.268, 0.250, 0.000)
		colorLowland   (0.308, 0.282, 0.263, 0.000)
		colorUpland    (0.324, 0.296, 0.276, 0.000)
		colorRock      (0.339, 0.311, 0.289, 0.000)
		colorSnow      (0.355, 0.325, 0.302, 1.000)
		BumpHeight      0.995536
		BumpOffset      0.199107
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.357225
		GasToDust   0.25
		Particles   1701
		GasBright   0.0762646
		DustBright  0.350851
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.75402
		Period          12.044
		Eccentricity    0.957869
		Inclination     -97.8887
		AscendingNode   93.4453
		ArgOfPericenter 137.844
		MeanAnomaly     175.057
	}
}

Comet	"C30"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            4.94628e-009
	Radius          24.3208
	InertiaMoment   0.399556

	Oblateness      0.057363

	RotationPeriod  21.9886
	Obliquity       201.792
	EqAscendNode    343.86

	AbsMagn         6.20128
	SlopeParam      4.33366
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.710 0.706 0.703)

	Surface
	{
		SurfStyle       0.814677
		OceanStyle      0.486234
		Randomize      (0.353, 0.213, 0.988)
		colorDistMagn   0.415322
		colorDistFreq   0.350236
		detailScale     664.119
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999485
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.375308
		terraceProb     0.13659
		erosion         0
		montesMagn      0.450542
		montesFreq      3.34482
		montesSpiky     0.893586
		montesFraction  0.607786
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.30873
		hillsFraction   0.594201
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249096
		craterFreq      0.26614
		craterDensity   0.956831
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   54.218
		volcanoTemp     1407.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.240, 0.197, 0.000)
		colorShelf     (0.284, 0.247, 0.225, 0.000)
		colorBeach     (0.334, 0.289, 0.267, 0.000)
		colorDesert    (0.362, 0.311, 0.260, 0.000)
		colorLowland   (0.398, 0.332, 0.295, 0.000)
		colorUpland    (0.440, 0.402, 0.359, 0.000)
		colorRock      (0.476, 0.438, 0.387, 0.000)
		colorSnow      (0.519, 0.466, 0.408, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.838417
		GasToDust   0.25
		Particles   2673
		GasBright   0.216599
		DustBright  0.695003
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.10811
		Period          14.4399
		Eccentricity    0.924713
		Inclination     68.2369
		AscendingNode   25.1188
		ArgOfPericenter -99.5672
		MeanAnomaly     70.5232
	}
}

Comet	"C31"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.523e-016
	Radius          0.0684007
	InertiaMoment   0.398345

	Oblateness      0.0520261

	RotationPeriod  19.5808
	Obliquity       154.998
	EqAscendNode    328.437

	AbsMagn         7.58491
	SlopeParam      3.32223
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.636 0.578 0.503)

	Surface
	{
		SurfStyle       0.697443
		OceanStyle      0.0518546
		Randomize      (-0.273, -0.476, 0.932)
		colorDistMagn   0.163681
		colorDistFreq   4.04043e-006
		detailScale     1.8678
		colorConversion true
		snowLevel       2
		tropicLatitude  0.618016
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.404928
		terraceProb     0.133108
		erosion         0
		montesMagn      0.39257
		montesFreq      2.50587
		montesSpiky     0.958776
		montesFraction  0.293173
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.35047e-005
		hillsFraction   0.604422
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230542
		craterFreq      0.230011
		craterDensity   0.866158
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   868.994
		volcanoTemp     1424.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.197, 0.141, 0.000)
		colorShelf     (0.254, 0.202, 0.161, 0.000)
		colorBeach     (0.299, 0.237, 0.191, 0.000)
		colorDesert    (0.324, 0.254, 0.186, 0.000)
		colorLowland   (0.356, 0.272, 0.211, 0.000)
		colorUpland    (0.394, 0.330, 0.257, 0.000)
		colorRock      (0.426, 0.358, 0.277, 0.000)
		colorSnow      (0.464, 0.382, 0.292, 1.000)
		BumpHeight      0.0615606
		BumpOffset      0.0123121
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.176828
		DustBright  0.41926
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.91321
		Period          6.97369
		Eccentricity    0.856566
		Inclination     40.6571
		AscendingNode   -69.0117
		ArgOfPericenter 105.991
		MeanAnomaly     33.6191
	}
}

Comet	"C32"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.17793e-012
	Radius          1.50645
	InertiaMoment   0.399978

	Oblateness      0.0954853

	RotationPeriod  17.0387
	Obliquity       108.204
	EqAscendNode    313.014

	AbsMagn         8.91923
	SlopeParam      2.07938
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.573 0.569 0.565)

	Surface
	{
		SurfStyle       0.379634
		OceanStyle      0.671277
		Randomize      (-0.562, 0.668, 0.590)
		colorDistMagn   0.159078
		colorDistFreq   0.000791446
		detailScale     41.1362
		colorConversion true
		snowLevel       2
		tropicLatitude  0.9746
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.644877
		terraceProb     0.294518
		erosion         0
		montesMagn      0.490101
		montesFreq      2.5705
		montesSpiky     0.914775
		montesFraction  0.519837
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00547833
		hillsFraction   0.606849
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234626
		craterFreq      0.152075
		craterDensity   0.922808
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   217.621
		volcanoTemp     1573.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.228, 0.226, 0.000)
		colorShelf     (0.243, 0.242, 0.240, 0.000)
		colorBeach     (0.258, 0.256, 0.254, 0.000)
		colorDesert    (0.272, 0.270, 0.268, 0.000)
		colorLowland   (0.286, 0.284, 0.283, 0.000)
		colorUpland    (0.301, 0.299, 0.297, 0.000)
		colorRock      (0.315, 0.313, 0.311, 0.000)
		colorSnow      (0.329, 0.327, 0.325, 1.000)
		BumpHeight      1.35581
		BumpOffset      0.271161
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.390051
		GasToDust   0.25
		Particles   1767
		GasBright   0.0997987
		DustBright  0.180777
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.78316
		Period          27.5671
		Eccentricity    0.951996
		Inclination     13.4887
		AscendingNode   -111.116
		ArgOfPericenter -125.137
		MeanAnomaly     -27.5355
	}
}

Comet	"C33"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            9.11043e-009
	Radius          26.6819
	InertiaMoment   0.398878

	Oblateness      0.0965561

	RotationPeriod  14.3318
	Obliquity       61.4094
	EqAscendNode    297.592

	AbsMagn         10.3681
	SlopeParam      5.76241
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.696 0.691 0.689)

	Surface
	{
		SurfStyle       0.527518
		OceanStyle      0.77756
		Randomize      (0.037, -0.558, 0.717)
		colorDistMagn   0.431997
		colorDistFreq   0.584571
		detailScale     728.595
		colorConversion true
		snowLevel       2
		tropicLatitude  0.283017
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.525743
		terraceProb     0.285881
		erosion         0
		montesMagn      0.425399
		montesFreq      3.33754
		montesSpiky     0.88864
		montesFraction  0.413989
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.49557
		hillsFraction   0.87049
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253324
		craterFreq      0.249383
		craterDensity   1.00146
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   43.8282
		volcanoTemp     1543.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.235, 0.193, 0.000)
		colorShelf     (0.278, 0.242, 0.220, 0.000)
		colorBeach     (0.327, 0.283, 0.262, 0.000)
		colorDesert    (0.355, 0.304, 0.255, 0.000)
		colorLowland   (0.390, 0.325, 0.289, 0.000)
		colorUpland    (0.431, 0.394, 0.351, 0.000)
		colorRock      (0.466, 0.428, 0.379, 0.000)
		colorSnow      (0.508, 0.456, 0.400, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.871243
		GasToDust   0.25
		Particles   2739
		GasBright   0.3173
		DustBright  0.447762
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.62708
		Period          18.2035
		Eccentricity    0.940436
		Inclination     -57.7951
		AscendingNode   -18.6216
		ArgOfPericenter -98.5391
		MeanAnomaly     -40.4584
	}
}

Comet	"C34"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.80518e-016
	Radius          0.0933112
	InertiaMoment   0.397179

	Oblateness      0.209906

	RotationPeriod  11.4198
	Obliquity       14.6151
	EqAscendNode    282.169

	AbsMagn         12.2375
	SlopeParam      4.56906
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.598 0.591 0.586)

	Surface
	{
		SurfStyle       0.576356
		OceanStyle      0.165169
		Randomize      (-0.595, 0.035, -0.863)
		colorDistMagn   0.303282
		colorDistFreq   5.68751e-006
		detailScale     2.54802
		colorConversion true
		snowLevel       2
		tropicLatitude  0.759111
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57058
		terraceProb     0.121526
		erosion         0
		montesMagn      0.677333
		montesFreq      2.16758
		montesSpiky     0.966075
		montesFraction  0.658475
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.87762e-005
		hillsFraction   0.357187
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206146
		craterFreq      0.246884
		craterDensity   0.828675
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   873.494
		volcanoTemp     1464.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.201, 0.164, 0.000)
		colorShelf     (0.239, 0.207, 0.188, 0.000)
		colorBeach     (0.281, 0.242, 0.223, 0.000)
		colorDesert    (0.305, 0.260, 0.217, 0.000)
		colorLowland   (0.335, 0.278, 0.246, 0.000)
		colorUpland    (0.371, 0.337, 0.299, 0.000)
		colorRock      (0.401, 0.366, 0.322, 0.000)
		colorSnow      (0.436, 0.390, 0.340, 1.000)
		BumpHeight      0.0839801
		BumpOffset      0.016796
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.212989
		DustBright  0.23656
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.67824
		Period          18.59
		Eccentricity    0.959665
		Inclination     118.286
		AscendingNode   -30.0031
		ArgOfPericenter -172.239
		MeanAnomaly     -39.0744
	}
}

Comet	"C35"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.16959e-012
	Radius          1.64916
	InertiaMoment   0.399341

	Oblateness      0.249

	RotationPeriod  8.24634
	Obliquity       327.821
	EqAscendNode    266.747

	AbsMagn         16.9647
	SlopeParam      3.56084
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.669 0.665 0.662)

	Surface
	{
		SurfStyle       0.26765
		OceanStyle      0.58854
		Randomize      (-0.121, -0.377, 0.098)
		colorDistMagn   0.617684
		colorDistFreq   0.00181949
		detailScale     45.033
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998983
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479764
		terraceProb     0.418019
		erosion         0
		montesMagn      0.550994
		montesFreq      3.33505
		montesSpiky     0.833957
		montesFraction  0.293598
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00654284
		hillsFraction   0.451487
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241279
		craterFreq      0.179094
		craterDensity   0.838008
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   175.541
		volcanoTemp     1299.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.266, 0.265, 0.000)
		colorShelf     (0.284, 0.283, 0.281, 0.000)
		colorBeach     (0.301, 0.299, 0.298, 0.000)
		colorDesert    (0.318, 0.316, 0.315, 0.000)
		colorLowland   (0.335, 0.333, 0.331, 0.000)
		colorUpland    (0.351, 0.349, 0.348, 0.000)
		colorRock      (0.368, 0.366, 0.364, 0.000)
		colorSnow      (0.385, 0.382, 0.381, 1.000)
		BumpHeight      1.48424
		BumpOffset      0.296849
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.422877
		GasToDust   0.25
		Particles   1834
		GasBright   0.0306632
		DustBright  0.903372
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.21911
		Period          15.2203
		Eccentricity    0.919674
		Inclination     -112.028
		AscendingNode   -137.249
		ArgOfPericenter -150.029
		MeanAnomaly     56.649
	}
}

Comet	"C36"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.67803e-008
	Radius          36.4681
	InertiaMoment   0.398033

	Oblateness      0.249

	RotationPeriod  4.7295
	Obliquity       281.027
	EqAscendNode    251.324

	AbsMagn         3.44218
	SlopeParam      2.41614
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.800 0.798 0.797)

	Surface
	{
		SurfStyle       0.491666
		OceanStyle      0.0414271
		Randomize      (-0.044, 0.716, -0.864)
		colorDistMagn   0.531294
		colorDistFreq   0.633875
		detailScale     995.822
		colorConversion true
		snowLevel       2
		tropicLatitude  0.653972
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.416323
		terraceProb     0.2924
		erosion         0
		montesMagn      0.542628
		montesFreq      3.74089
		montesSpiky     0.856387
		montesFraction  0.603637
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.22341
		hillsFraction   0.651038
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226416
		craterFreq      0.162206
		craterDensity   0.610814
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   44.1387
		volcanoTemp     1473.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.319, 0.319, 0.000)
		colorShelf     (0.340, 0.339, 0.339, 0.000)
		colorBeach     (0.360, 0.359, 0.359, 0.000)
		colorDesert    (0.380, 0.379, 0.379, 0.000)
		colorLowland   (0.400, 0.399, 0.399, 0.000)
		colorUpland    (0.420, 0.419, 0.418, 0.000)
		colorRock      (0.440, 0.439, 0.438, 0.000)
		colorSnow      (0.460, 0.459, 0.458, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.904069
		GasToDust   0.25
		Particles   2806
		GasBright   0.0568261
		DustBright  0.561696
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.95971
		Period          13.4181
		Eccentricity    0.928996
		Inclination     55.7423
		AscendingNode   -36.8877
		ArgOfPericenter 83.9758
		MeanAnomaly     145.323
	}
}

Comet	"C37"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            5.16677e-016
	Radius          0.101898
	InertiaMoment   0.399771

	Oblateness      0.00107669

	RotationPeriod  134.727
	Obliquity       234.232
	EqAscendNode    235.902

	AbsMagn         5.41997
	SlopeParam      6.13075
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.586 0.584 0.581)

	Surface
	{
		SurfStyle       0.0489403
		OceanStyle      0.613746
		Randomize      (0.974, -0.409, 0.606)
		colorDistMagn   0.595427
		colorDistFreq   3.1991e-006
		detailScale     2.7825
		colorConversion true
		snowLevel       2
		tropicLatitude  0.551286
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.425987
		terraceProb     0.211869
		erosion         0
		montesMagn      0.544406
		montesFreq      3.21038
		montesSpiky     0.920865
		montesFraction  0.404671
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.45632e-005
		hillsFraction   0.66088
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233699
		craterFreq      0.180949
		craterDensity   0.8782
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   702.85
		volcanoTemp     1239.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.233, 0.232, 0.000)
		colorShelf     (0.249, 0.248, 0.247, 0.000)
		colorBeach     (0.264, 0.263, 0.262, 0.000)
		colorDesert    (0.278, 0.277, 0.276, 0.000)
		colorLowland   (0.293, 0.292, 0.291, 0.000)
		colorUpland    (0.307, 0.306, 0.305, 0.000)
		colorRock      (0.322, 0.321, 0.320, 0.000)
		colorSnow      (0.337, 0.336, 0.334, 1.000)
		BumpHeight      0.0917083
		BumpOffset      0.0183417
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0457298
		DustBright  0.257278
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.85245
		Period          12.6954
		Eccentricity    0.941253
		Inclination     -156.856
		AscendingNode   158.565
		ArgOfPericenter -54.7906
		MeanAnomaly     16.1411
	}
}

Comet	"C38"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.99613e-012
	Radius          2.25888
	InertiaMoment   0.398627

	Oblateness      0.00201012

	RotationPeriod  116.772
	Obliquity       187.438
	EqAscendNode    220.479

	AbsMagn         6.90007
	SlopeParam      4.81265
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.707 0.653 0.620)

	Surface
	{
		SurfStyle       0.85951
		OceanStyle      0.567765
		Randomize      (0.263, 0.663, -0.223)
		colorDistMagn   0.43691
		colorDistFreq   0.00251578
		detailScale     61.6825
		colorConversion true
		snowLevel       2
		tropicLatitude  0.89066
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.767037
		terraceProb     0.397551
		erosion         0
		montesMagn      0.613124
		montesFreq      3.73852
		montesSpiky     0.995905
		montesFraction  0.336754
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0114006
		hillsFraction   0.531418
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256649
		craterFreq      0.254663
		craterDensity   0.780841
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   177.166
		volcanoTemp     1522.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.229, 0.248, 0.050)
		colorShelf     (0.283, 0.268, 0.285, 0.040)
		colorBeach     (0.325, 0.307, 0.322, 0.030)
		colorDesert    (0.367, 0.346, 0.366, 0.020)
		colorLowland   (0.410, 0.385, 0.403, 0.030)
		colorUpland    (0.452, 0.424, 0.440, 0.050)
		colorRock      (0.495, 0.464, 0.490, 0.020)
		colorSnow      (0.495, 0.464, 0.490, 1.000)
		BumpHeight      2.03299
		BumpOffset      0.406599
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.455703
		GasToDust   0.25
		Particles   1900
		GasBright   0.165346
		DustBright  0.622149
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.63955
		Period          18.2975
		Eccentricity    0.938921
		Inclination     -116.398
		AscendingNode   96.8426
		ArgOfPericenter -111.445
		MeanAnomaly     41.3932
	}
}

Comet	"C39"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.09071e-008
	Radius          39.7081
	InertiaMoment   0.39645

	Oblateness      0.00164032

	RotationPeriod  107.891
	Obliquity       140.644
	EqAscendNode    205.056

	AbsMagn         8.23947
	SlopeParam      3.79334
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.524 0.393 0.283)

	Surface
	{
		SurfStyle       0.98915
		OceanStyle      0.684506
		Randomize      (0.836, 0.209, 0.262)
		colorDistMagn   0.531301
		colorDistFreq   0.962916
		detailScale     1084.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0.101667
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.460869
		terraceProb     0.125877
		erosion         0
		montesMagn      0.48937
		montesFreq      2.12305
		montesSpiky     0.928899
		montesFraction  0.516535
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.66332
		hillsFraction   0.514112
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262478
		craterFreq      0.265417
		craterDensity   0.837167
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.4125
		volcanoTemp     1265.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.138, 0.113, 0.050)
		colorShelf     (0.210, 0.161, 0.130, 0.040)
		colorBeach     (0.241, 0.185, 0.147, 0.030)
		colorDesert    (0.272, 0.208, 0.167, 0.020)
		colorLowland   (0.304, 0.232, 0.184, 0.030)
		colorUpland    (0.335, 0.255, 0.201, 0.050)
		colorRock      (0.367, 0.279, 0.223, 0.020)
		colorSnow      (0.367, 0.279, 0.223, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.936895
		GasToDust   0.25
		Particles   2872
		GasBright   0.126968
		DustBright  0.345014
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.12195
		Period          22.0533
		Eccentricity    0.955787
		Inclination     143.826
		AscendingNode   -172.004
		ArgOfPericenter 23.9157
		MeanAnomaly     -47.3912
	}
}

Comet	"C40"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            9.51655e-016
	Radius          0.139918
	InertiaMoment   0.399119

	Oblateness      0.00265305

	RotationPeriod  101.632
	Obliquity       93.8494
	EqAscendNode    189.634

	AbsMagn         9.60709
	SlopeParam      2.71301
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.762 0.760 0.758)

	Surface
	{
		SurfStyle       0.607855
		OceanStyle      0.588251
		Randomize      (-0.381, 0.823, -0.479)
		colorDistMagn   0.465487
		colorDistFreq   6.3181e-006
		detailScale     3.82071
		colorConversion true
		snowLevel       2
		tropicLatitude  0.685679
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479279
		terraceProb     0.529923
		erosion         0
		montesMagn      0.402602
		montesFreq      3.57424
		montesSpiky     0.981806
		montesFraction  0.787921
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.91116e-005
		hillsFraction   0.780192
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250334
		craterFreq      0.153361
		craterDensity   0.877752
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   711.117
		volcanoTemp     1566.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.258, 0.212, 0.000)
		colorShelf     (0.305, 0.266, 0.243, 0.000)
		colorBeach     (0.358, 0.312, 0.288, 0.000)
		colorDesert    (0.389, 0.334, 0.281, 0.000)
		colorLowland   (0.427, 0.357, 0.318, 0.000)
		colorUpland    (0.473, 0.433, 0.387, 0.000)
		colorRock      (0.511, 0.471, 0.417, 0.000)
		colorSnow      (0.556, 0.502, 0.440, 1.000)
		BumpHeight      0.125927
		BumpOffset      0.0251853
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.313774
		DustBright  0.642694
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.01952
		Period          7.56296
		Eccentricity    0.91934
		Inclination     112.446
		AscendingNode   -139.601
		ArgOfPericenter -66.9276
		MeanAnomaly     93.4604
	}
}

Comet	"C41"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            7.36037e-012
	Radius          2.45091
	InertiaMoment   0.397665

	Oblateness      0.00202665

	RotationPeriod  96.6714
	Obliquity       47.0551
	EqAscendNode    174.211

	AbsMagn         11.2018
	SlopeParam      6.59067
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.601 0.475 0.408)

	Surface
	{
		SurfStyle       0.928916
		OceanStyle      0.29117
		Randomize      (-0.456, -0.410, 0.926)
		colorDistMagn   0.492511
		colorDistFreq   0.0049926
		detailScale     66.9262
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999993
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605698
		terraceProb     0.353276
		erosion         0
		montesMagn      0.326927
		montesFreq      3.06162
		montesSpiky     0.981297
		montesFraction  0.667655
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0138209
		hillsFraction   0.475549
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264106
		craterFreq      0.193438
		craterDensity   0.753174
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   141.639
		volcanoTemp     1465.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.166, 0.163, 0.050)
		colorShelf     (0.240, 0.195, 0.188, 0.040)
		colorBeach     (0.276, 0.223, 0.212, 0.030)
		colorDesert    (0.312, 0.252, 0.241, 0.020)
		colorLowland   (0.348, 0.280, 0.265, 0.030)
		colorUpland    (0.384, 0.309, 0.290, 0.050)
		colorRock      (0.421, 0.337, 0.322, 0.020)
		colorSnow      (0.421, 0.337, 0.322, 1.000)
		BumpHeight      2.20582
		BumpOffset      0.441164
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.488529
		GasToDust   0.25
		Particles   1966
		GasBright   0.248114
		DustBright  0.392841
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.44684
		Period          10.0862
		Eccentricity    0.927488
		Inclination     46.4976
		AscendingNode   28.8258
		ArgOfPericenter 143.455
		MeanAnomaly     -87.4505
	}
}

Comet	"C42"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            5.69271e-008
	Radius          54.6835
	InertiaMoment   0.399561

	Oblateness      0.00320188

	RotationPeriod  92.4941
	Obliquity       0.260757
	EqAscendNode    158.789

	AbsMagn         13.6333
	SlopeParam      5.06898
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.437 0.435 0.432)

	Surface
	{
		SurfStyle       0.0529417
		OceanStyle      0.032013
		Randomize      (0.659, 0.784, 0.950)
		colorDistMagn   0.907208
		colorDistFreq   1.61167
		detailScale     1493.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.063714
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.497535
		terraceProb     0.360495
		erosion         0
		montesMagn      0.554313
		montesFreq      3.28906
		montesSpiky     0.907175
		montesFraction  0.72412
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.29233
		hillsFraction   0.687953
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23811
		craterFreq      0.185846
		craterDensity   0.927582
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.9338
		volcanoTemp     1552.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.174, 0.173, 0.000)
		colorShelf     (0.186, 0.185, 0.184, 0.000)
		colorBeach     (0.197, 0.196, 0.195, 0.000)
		colorDesert    (0.208, 0.206, 0.205, 0.000)
		colorLowland   (0.219, 0.217, 0.216, 0.000)
		colorUpland    (0.230, 0.228, 0.227, 0.000)
		colorRock      (0.240, 0.239, 0.238, 0.000)
		colorSnow      (0.251, 0.250, 0.249, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.969721
		GasToDust   0.25
		Particles   2938
		GasBright   0.145194
		DustBright  0.180247
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.22022
		Period          8.71793
		Eccentricity    0.905922
		Inclination     -3.61087
		AscendingNode   -97.2706
		ArgOfPericenter 44.4555
		MeanAnomaly     69.1997
	}
}

Comet	"C43"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.75282e-015
	Radius          0.151137
	InertiaMoment   0.398352

	Oblateness      0.00236885

	RotationPeriod  88.8428
	Obliquity       313.466
	EqAscendNode    143.366

	AbsMagn         1.78917
	SlopeParam      4.02306
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.567 0.563 0.558)

	Surface
	{
		SurfStyle       0.343835
		OceanStyle      0.818082
		Randomize      (-0.631, -0.913, 0.366)
		colorDistMagn   0.411698
		colorDistFreq   1.28856e-005
		detailScale     4.12704
		colorConversion true
		snowLevel       2
		tropicLatitude  0.795651
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.461752
		terraceProb     0.695878
		erosion         0
		montesMagn      0.418013
		montesFreq      2.23557
		montesSpiky     0.978948
		montesFraction  0.757489
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.46692e-005
		hillsFraction   0.712166
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237133
		craterFreq      0.267587
		craterDensity   1.07288
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   565.987
		volcanoTemp     1223.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.225, 0.223, 0.000)
		colorShelf     (0.241, 0.239, 0.237, 0.000)
		colorBeach     (0.255, 0.253, 0.251, 0.000)
		colorDesert    (0.269, 0.268, 0.265, 0.000)
		colorLowland   (0.284, 0.282, 0.279, 0.000)
		colorUpland    (0.298, 0.296, 0.293, 0.000)
		colorRock      (0.312, 0.310, 0.307, 0.000)
		colorSnow      (0.326, 0.324, 0.321, 1.000)
		BumpHeight      0.136023
		BumpOffset      0.0272046
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0401626
		GasToDust   0.25
		Particles   1060
		GasBright   0.00420419
		DustBright  0.805723
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.16386
		Period          22.3905
		Eccentricity    0.944524
		Inclination     -100.037
		AscendingNode   -47.1685
		ArgOfPericenter 81.8996
		MeanAnomaly     -144.617
	}
}

Comet	"C44"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.35568e-011
	Radius          3.38719
	InertiaMoment   0.399984

	Oblateness      0.0037393

	RotationPeriod  85.5695
	Obliquity       266.672
	EqAscendNode    127.943

	AbsMagn         4.5244
	SlopeParam      2.98386
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.767 0.697 0.584)

	Surface
	{
		SurfStyle       0.278617
		OceanStyle      0.476328
		Randomize      (-0.580, 0.361, -0.793)
		colorDistMagn   0.480766
		colorDistFreq   0.00565338
		detailScale     92.4928
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999477
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.47464
		terraceProb     0.356858
		erosion         0
		montesMagn      0.56408
		montesFreq      3.54829
		montesSpiky     0.997811
		montesFraction  0.570392
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0319422
		hillsFraction   0.538986
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250271
		craterFreq      0.211262
		craterDensity   0.920038
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   144.233
		volcanoTemp     1540.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.279, 0.234, 0.000)
		colorShelf     (0.326, 0.296, 0.248, 0.000)
		colorBeach     (0.345, 0.314, 0.263, 0.000)
		colorDesert    (0.364, 0.331, 0.277, 0.000)
		colorLowland   (0.383, 0.348, 0.292, 0.000)
		colorUpland    (0.403, 0.366, 0.307, 0.000)
		colorRock      (0.422, 0.383, 0.321, 0.000)
		colorSnow      (0.441, 0.401, 0.336, 1.000)
		BumpHeight      3.04847
		BumpOffset      0.609694
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.521355
		GasToDust   0.25
		Particles   2033
		GasBright   0.0317592
		DustBright  0.462655
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.43796
		Period          10.0313
		Eccentricity    0.933537
		Inclination     166.29
		AscendingNode   -95.8361
		ArgOfPericenter -43.686
		MeanAnomaly     86.9046
	}
}

Comet	"C45"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.04852e-007
	Radius          58.7101
	InertiaMoment   0.398884

	Oblateness      0.00269206

	RotationPeriod  82.5804
	Obliquity       219.878
	EqAscendNode    112.521

	AbsMagn         6.18112
	SlopeParam      7.25432
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.577 0.575 0.571)

	Surface
	{
		SurfStyle       0.0516652
		OceanStyle      0.294821
		Randomize      (0.332, 0.310, 0.539)
		colorDistMagn   0.647051
		colorDistFreq   1.72147
		detailScale     1603.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.900173
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.45286
		terraceProb     0.395236
		erosion         0
		montesMagn      0.532297
		montesFreq      2.54136
		montesSpiky     0.82126
		montesFraction  0.273834
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.47125
		hillsFraction   0.623521
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201711
		craterFreq      0.202597
		craterDensity   0.850348
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.4269
		volcanoTemp     1634.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.230, 0.228, 0.000)
		colorShelf     (0.245, 0.244, 0.243, 0.000)
		colorBeach     (0.260, 0.259, 0.257, 0.000)
		colorDesert    (0.274, 0.273, 0.271, 0.000)
		colorLowland   (0.289, 0.287, 0.285, 0.000)
		colorUpland    (0.303, 0.302, 0.300, 0.000)
		colorRock      (0.318, 0.316, 0.314, 0.000)
		colorSnow      (0.332, 0.331, 0.328, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.12068
		DustBright  0.858221
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.82263
		Period          19.6953
		Eccentricity    0.934027
		Inclination     99.8093
		AscendingNode   153.678
		ArgOfPericenter 120.604
		MeanAnomaly     106.968
	}
}

Comet	"C46"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.22849e-015
	Radius          0.209808
	InertiaMoment   0.397193

	Oblateness      0.00424473

	RotationPeriod  79.8126
	Obliquity       173.084
	EqAscendNode    97.0982

	AbsMagn         7.56661
	SlopeParam      5.34426
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.856 0.806 0.740)

	Surface
	{
		SurfStyle       0.551926
		OceanStyle      0.267173
		Randomize      (0.987, 0.270, 0.923)
		colorDistMagn   0.77808
		colorDistFreq   3.14169e-005
		detailScale     5.72916
		colorConversion true
		snowLevel       2
		tropicLatitude  0.856743
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.517105
		terraceProb     0.1789
		erosion         0
		montesMagn      0.337661
		montesFreq      2.99838
		montesSpiky     0.864548
		montesFraction  0.573518
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.41139e-005
		hillsFraction   0.591738
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224368
		craterFreq      0.247847
		craterDensity   0.94694
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   578.934
		volcanoTemp     1510.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.334, 0.274, 0.207, 0.000)
		colorShelf     (0.342, 0.282, 0.237, 0.000)
		colorBeach     (0.402, 0.330, 0.281, 0.000)
		colorDesert    (0.437, 0.355, 0.274, 0.000)
		colorLowland   (0.479, 0.379, 0.311, 0.000)
		colorUpland    (0.531, 0.459, 0.377, 0.000)
		colorRock      (0.574, 0.500, 0.407, 0.000)
		colorSnow      (0.625, 0.532, 0.429, 1.000)
		BumpHeight      0.188827
		BumpOffset      0.0377655
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0729886
		GasToDust   0.25
		Particles   1127
		GasBright   0.120953
		DustBright  0.542434
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.12653
		Period          22.09
		Eccentricity    0.961769
		Inclination     -114.55
		AscendingNode   -19.4491
		ArgOfPericenter -77.2321
		MeanAnomaly     -44.7486
	}
}

Comet	"C47"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.497e-011
	Radius          3.60159
	InertiaMoment   0.399347

	Oblateness      0.00298968

	RotationPeriod  77.2212
	Obliquity       126.289
	EqAscendNode    81.6757

	AbsMagn         8.90055
	SlopeParam      4.2531
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.731 0.727 0.724)

	Surface
	{
		SurfStyle       0.315354
		OceanStyle      0.160378
		Randomize      (-0.244, -0.096, 0.278)
		colorDistMagn   0.883376
		colorDistFreq   0.000175967
		detailScale     98.3475
		colorConversion true
		snowLevel       2
		tropicLatitude  0.668669
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.463395
		terraceProb     0.585006
		erosion         0
		montesMagn      0.460803
		montesFreq      3.62443
		montesSpiky     0.939839
		montesFraction  0.460191
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.034274
		hillsFraction   0.5341
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258748
		craterFreq      0.243744
		craterDensity   0.899245
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   113.003
		volcanoTemp     1625.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.291, 0.290, 0.000)
		colorShelf     (0.311, 0.309, 0.308, 0.000)
		colorBeach     (0.329, 0.327, 0.326, 0.000)
		colorDesert    (0.347, 0.345, 0.344, 0.000)
		colorLowland   (0.365, 0.363, 0.362, 0.000)
		colorUpland    (0.384, 0.381, 0.380, 0.000)
		colorRock      (0.402, 0.400, 0.398, 0.000)
		colorSnow      (0.420, 0.418, 0.416, 1.000)
		BumpHeight      3.24143
		BumpOffset      0.648287
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.554181
		GasToDust   0.25
		Particles   2099
		GasBright   0.083967
		DustBright  0.263907
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.46187
		Period          16.9741
		Eccentricity    0.960519
		Inclination     65.3535
		AscendingNode   47.3087
		ArgOfPericenter -130.716
		MeanAnomaly     125.615
	}
}

Comet	"C48"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.93125e-007
	Radius          81.9986
	InertiaMoment   0.398042

	Oblateness      0.0048417

	RotationPeriod  74.773
	Obliquity       79.495
	EqAscendNode    66.2531

	AbsMagn         10.3465
	SlopeParam      3.2372
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.769 0.767 0.763)

	Surface
	{
		SurfStyle       0.16622
		OceanStyle      0.220779
		Randomize      (-0.398, -0.198, -0.731)
		colorDistMagn   0.900773
		colorDistFreq   2.71156
		detailScale     2239.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.649098
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.265213
		terraceProb     0.285068
		erosion         0
		montesMagn      0.493695
		montesFreq      2.71178
		montesSpiky     0.925846
		montesFraction  0.424904
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.7125
		hillsFraction   0.551735
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225546
		craterFreq      0.17705
		craterDensity   0.747884
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.2545
		volcanoTemp     1147.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.307, 0.307, 0.305, 0.000)
		colorShelf     (0.327, 0.326, 0.324, 0.000)
		colorBeach     (0.346, 0.345, 0.343, 0.000)
		colorDesert    (0.365, 0.364, 0.362, 0.000)
		colorLowland   (0.384, 0.383, 0.381, 0.000)
		colorUpland    (0.403, 0.402, 0.400, 0.000)
		colorRock      (0.423, 0.422, 0.419, 0.000)
		colorSnow      (0.442, 0.441, 0.439, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.250055
		DustBright  0.582305
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.02581
		Period          13.8702
		Eccentricity    0.964837
		Inclination     87.818
		AscendingNode   -140.1
		ArgOfPericenter 94.7756
		MeanAnomaly     65.5658
	}
}

Comet	"C49"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            5.94648e-015
	Radius          0.215757
	InertiaMoment   0.399776

	Oblateness      0.00307167

	RotationPeriod  72.4428
	Obliquity       32.7007
	EqAscendNode    50.8305

	AbsMagn         12.2058
	SlopeParam      9.01249
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.463 0.460 0.458)

	Surface
	{
		SurfStyle       0.119362
		OceanStyle      0.334853
		Randomize      (0.703, 0.452, 0.183)
		colorDistMagn   0.727676
		colorDistFreq   2.15908e-005
		detailScale     5.8916
		colorConversion true
		snowLevel       2
		tropicLatitude  0.54619
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.382277
		terraceProb     0.27462
		erosion         0
		montesMagn      0.475695
		montesFreq      2.84393
		montesSpiky     0.978538
		montesFraction  0.47221
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.58453e-005
		hillsFraction   0.60527
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239546
		craterFreq      0.232836
		craterDensity   0.875207
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   438.672
		volcanoTemp     1595.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.184, 0.183, 0.000)
		colorShelf     (0.197, 0.195, 0.195, 0.000)
		colorBeach     (0.208, 0.207, 0.206, 0.000)
		colorDesert    (0.220, 0.218, 0.218, 0.000)
		colorLowland   (0.232, 0.230, 0.229, 0.000)
		colorUpland    (0.243, 0.241, 0.240, 0.000)
		colorRock      (0.255, 0.253, 0.252, 0.000)
		colorSnow      (0.266, 0.264, 0.263, 1.000)
		BumpHeight      0.194181
		BumpOffset      0.0388362
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.105815
		GasToDust   0.25
		Particles   1193
		GasBright   0.185787
		DustBright  0.33106
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.29766
		Period          23.4783
		Eccentricity    0.9719
		Inclination     119.101
		AscendingNode   24.8342
		ArgOfPericenter 173.598
		MeanAnomaly     -99.3945
	}
}

Comet	"C50"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            4.59917e-011
	Radius          5.07915
	InertiaMoment   0.398634

	Oblateness      0.00549233

	RotationPeriod  70.2109
	Obliquity       345.906
	EqAscendNode    35.4079

	AbsMagn         16.7533
	SlopeParam      5.64779
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.731 0.729 0.727)

	Surface
	{
		SurfStyle       0.4321
		OceanStyle      0.708077
		Randomize      (0.541, -0.397, 0.443)
		colorDistMagn   0.847422
		colorDistFreq   0.0162123
		detailScale     138.695
		colorConversion true
		snowLevel       2
		tropicLatitude  0.493318
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.639568
		terraceProb     0.518208
		erosion         0
		montesMagn      0.453777
		montesFreq      3.81512
		montesSpiky     0.947059
		montesFraction  0.618941
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.066762
		hillsFraction   0.562871
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232981
		craterFreq      0.239008
		craterDensity   0.875896
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   117.424
		volcanoTemp     1548.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.292, 0.291, 0.000)
		colorShelf     (0.311, 0.310, 0.309, 0.000)
		colorBeach     (0.329, 0.328, 0.327, 0.000)
		colorDesert    (0.347, 0.346, 0.345, 0.000)
		colorLowland   (0.366, 0.365, 0.364, 0.000)
		colorUpland    (0.384, 0.383, 0.382, 0.000)
		colorRock      (0.402, 0.401, 0.400, 0.000)
		colorSnow      (0.420, 0.419, 0.418, 1.000)
		BumpHeight      4.57124
		BumpOffset      0.914247
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.587007
		GasToDust   0.25
		Particles   2165
		GasBright   0.0842597
		DustBright  0.117074
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.05593
		Period          14.0778
		Eccentricity    0.907655
		Inclination     -41.3082
		AscendingNode   151.521
		ArgOfPericenter 98.9617
		MeanAnomaly     -123.412
	}
}

Comet	"C51"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.55713e-007
	Radius          127.75
	InertiaMoment   0.396475

	Oblateness      0.0119271

	RotationPeriod  68.0612
	Obliquity       299.112
	EqAscendNode    19.9853

	AbsMagn         3.40716
	SlopeParam      4.48654
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.520 0.377 0.307)

	Surface
	{
		SurfStyle       0.0813157
		OceanStyle      0.292632
		Randomize      (0.936, 0.804, -0.727)
		colorDistMagn   0.810129
		colorDistFreq   10.8511
		detailScale     3488.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.859788
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.549606
		terraceProb     0.250577
		erosion         0
		montesMagn      0.583972
		montesFreq      2.20258
		montesSpiky     0.791792
		montesFraction  0.366111
		dunesFraction   0
		hillsMagn       0
		hillsFreq       48.5977
		hillsFraction   0.429353
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231094
		craterFreq      0.579566
		craterDensity   0.901205
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   33.5827
		volcanoTemp     1401.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.151, 0.123, 0.000)
		colorShelf     (0.221, 0.160, 0.131, 0.000)
		colorBeach     (0.234, 0.170, 0.138, 0.000)
		colorDesert    (0.247, 0.179, 0.146, 0.000)
		colorLowland   (0.260, 0.188, 0.154, 0.000)
		colorUpland    (0.273, 0.198, 0.161, 0.000)
		colorRock      (0.286, 0.207, 0.169, 0.000)
		colorSnow      (0.299, 0.217, 0.177, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.327515
		DustBright  0.358305
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.35051
		Period          16.1617
		Eccentricity    0.933536
		Inclination     148.694
		AscendingNode   -102.075
		ArgOfPericenter -174.78
		MeanAnomaly     23.2048
	}
}

Comet	"C52"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.09526e-014
	Radius          0.314613
	InertiaMoment   0.399124

	Oblateness      0.00621791

	RotationPeriod  65.9808
	Obliquity       252.318
	EqAscendNode    4.5627

	AbsMagn         5.39751
	SlopeParam      3.47881
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.572 0.567 0.565)

	Surface
	{
		SurfStyle       0.717207
		OceanStyle      0.772539
		Randomize      (-0.671, 0.450, 0.087)
		colorDistMagn   0.865758
		colorDistFreq   2.804e-005
		detailScale     8.59102
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993951
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.297612
		terraceProb     0.361129
		erosion         0
		montesMagn      0.498674
		montesFreq      3.21397
		montesSpiky     0.955475
		montesFraction  0.257236
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000241434
		hillsFraction   0.642195
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238196
		craterFreq      0.153133
		craterDensity   0.963268
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   471.327
		volcanoTemp     1532.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.193, 0.158, 0.000)
		colorShelf     (0.229, 0.199, 0.181, 0.000)
		colorBeach     (0.269, 0.233, 0.215, 0.000)
		colorDesert    (0.292, 0.250, 0.209, 0.000)
		colorLowland   (0.320, 0.267, 0.237, 0.000)
		colorUpland    (0.355, 0.323, 0.288, 0.000)
		colorRock      (0.383, 0.352, 0.311, 0.000)
		colorSnow      (0.418, 0.374, 0.328, 1.000)
		BumpHeight      0.283151
		BumpOffset      0.0566303
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.13864
		GasToDust   0.25
		Particles   1259
		GasBright   0.0135525
		DustBright  0.356754
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.04528
		Period          14.0043
		Eccentricity    0.916111
		Inclination     17.9235
		AscendingNode   -52.3324
		ArgOfPericenter -101.054
		MeanAnomaly     111.737
	}
}

Comet	"C53"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            8.47108e-011
	Radius          7.70352
	InertiaMoment   0.397675

	Oblateness      0.0124922

	RotationPeriod  63.9589
	Obliquity       205.523
	EqAscendNode    349.14

	AbsMagn         6.88116
	SlopeParam      2.30462
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.579 0.576 0.573)

	Surface
	{
		SurfStyle       0.465911
		OceanStyle      0.39449
		Randomize      (-0.089, 0.159, 0.863)
		colorDistMagn   0.644224
		colorDistFreq   0.0347613
		detailScale     210.357
		colorConversion true
		snowLevel       2
		tropicLatitude  0.9274
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.384806
		terraceProb     0.141775
		erosion         0
		montesMagn      0.617972
		montesFreq      2.93659
		montesSpiky     0.99962
		montesFraction  0.173269
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.103085
		hillsFraction   0.689038
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208556
		craterFreq      0.197103
		craterDensity   0.835727
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   131.228
		volcanoTemp     1279.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.230, 0.229, 0.000)
		colorShelf     (0.246, 0.245, 0.243, 0.000)
		colorBeach     (0.261, 0.259, 0.258, 0.000)
		colorDesert    (0.275, 0.274, 0.272, 0.000)
		colorLowland   (0.290, 0.288, 0.286, 0.000)
		colorUpland    (0.304, 0.302, 0.301, 0.000)
		colorRock      (0.319, 0.317, 0.315, 0.000)
		colorSnow      (0.333, 0.331, 0.329, 1.000)
		BumpHeight      6.93317
		BumpOffset      1.38663
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.619832
		GasToDust   0.25
		Particles   2231
		GasBright   0.0817553
		DustBright  0.773038
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.46874
		Period          17.0246
		Eccentricity    0.953704
		Inclination     91.369
		AscendingNode   156.701
		ArgOfPericenter 34.4217
		MeanAnomaly     70.1792
	}
}

Comet	"C54"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            6.55177e-007
	Radius          122.959
	InertiaMoment   0.399567

	Oblateness      0.00704254

	RotationPeriod  61.9861
	Obliquity       158.729
	EqAscendNode    333.718

	AbsMagn         8.22124
	SlopeParam      5.9951
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.415 0.409 0.404)

	Surface
	{
		SurfStyle       0.0305817
		OceanStyle      0.163387
		Randomize      (0.671, 0.416, 0.455)
		colorDistMagn   0.714961
		colorDistFreq   5.41997
		detailScale     3357.61
		colorConversion true
		snowLevel       2
		tropicLatitude  0.412647
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494741
		terraceProb     0.270439
		erosion         0
		montesMagn      0.404963
		montesFreq      2.61613
		montesSpiky     0.866779
		montesFraction  0.518735
		dunesFraction   0
		hillsMagn       0
		hillsFreq       36.231
		hillsFraction   0.507545
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245391
		craterFreq      0.569473
		craterDensity   0.780931
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.8171
		volcanoTemp     1283.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.164, 0.162, 0.000)
		colorShelf     (0.177, 0.174, 0.172, 0.000)
		colorBeach     (0.187, 0.184, 0.182, 0.000)
		colorDesert    (0.197, 0.194, 0.192, 0.000)
		colorLowland   (0.208, 0.205, 0.202, 0.000)
		colorUpland    (0.218, 0.215, 0.212, 0.000)
		colorRock      (0.228, 0.225, 0.222, 0.000)
		colorSnow      (0.239, 0.235, 0.232, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0834205
		DustBright  0.45586
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.60806
		Period          18.0605
		Eccentricity    0.945211
		Inclination     -174.379
		AscendingNode   117.674
		ArgOfPericenter 139.17
		MeanAnomaly     28.88
	}
}

Comet	"C55"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.01734e-014
	Radius          0.469394
	InertiaMoment   0.398359

	Oblateness      0.0134948

	RotationPeriod  60.0544
	Obliquity       111.935
	EqAscendNode    318.295

	AbsMagn         9.58737
	SlopeParam      4.72683
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.761 0.701 0.675)

	Surface
	{
		SurfStyle       0.40568
		OceanStyle      0.526101
		Randomize      (0.333, 0.846, 0.381)
		colorDistMagn   0.960326
		colorDistFreq   0.000164926
		detailScale     12.8176
		colorConversion true
		snowLevel       2
		tropicLatitude  0.975497
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.713268
		terraceProb     0.356839
		erosion         0
		montesMagn      0.548713
		montesFreq      2.97437
		montesSpiky     0.930162
		montesFraction  0.643857
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00041746
		hillsFraction   0.73425
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241565
		craterFreq      0.215773
		craterDensity   0.889254
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   518.148
		volcanoTemp     1535.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.281, 0.270, 0.000)
		colorShelf     (0.323, 0.298, 0.287, 0.000)
		colorBeach     (0.343, 0.316, 0.304, 0.000)
		colorDesert    (0.362, 0.333, 0.321, 0.000)
		colorLowland   (0.381, 0.351, 0.338, 0.000)
		colorUpland    (0.400, 0.368, 0.354, 0.000)
		colorRock      (0.419, 0.386, 0.371, 0.000)
		colorSnow      (0.438, 0.403, 0.388, 1.000)
		BumpHeight      0.422454
		BumpOffset      0.0844909
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.171466
		GasToDust   0.25
		Particles   1326
		GasBright   0.0478265
		DustBright  0.17594
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.37747
		Period          9.66035
		Eccentricity    0.95024
		Inclination     80.9075
		AscendingNode   -79.8775
		ArgOfPericenter 105.148
		MeanAnomaly     -20.1891
	}
}

Comet	"C56"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.56027e-010
	Radius          7.61637
	InertiaMoment   0.399989

	Oblateness      0.00799689

	RotationPeriod  58.1569
	Obliquity       65.1406
	EqAscendNode    302.872

	AbsMagn         11.1768
	SlopeParam      3.71303
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.769 0.766 0.763)

	Surface
	{
		SurfStyle       0.718611
		OceanStyle      0.592873
		Randomize      (0.443, 0.105, -0.762)
		colorDistMagn   0.630829
		colorDistFreq   0.0316402
		detailScale     207.978
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995268
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.282108
		terraceProb     0.276198
		erosion         0
		montesMagn      0.440874
		montesFreq      2.82933
		montesSpiky     0.993964
		montesFraction  0.814853
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.105581
		hillsFraction   0.638821
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247095
		craterFreq      0.221267
		craterDensity   0.802303
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   95.5993
		volcanoTemp     1232.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.261, 0.214, 0.000)
		colorShelf     (0.308, 0.268, 0.244, 0.000)
		colorBeach     (0.362, 0.314, 0.290, 0.000)
		colorDesert    (0.392, 0.337, 0.282, 0.000)
		colorLowland   (0.431, 0.360, 0.321, 0.000)
		colorUpland    (0.477, 0.437, 0.389, 0.000)
		colorRock      (0.515, 0.475, 0.420, 0.000)
		colorSnow      (0.562, 0.506, 0.443, 1.000)
		BumpHeight      6.85474
		BumpOffset      1.37095
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.652658
		GasToDust   0.25
		Particles   2298
		GasBright   0.193197
		DustBright  0.515056
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.93304
		Period          20.5547
		Eccentricity    0.963116
		Inclination     30.3524
		AscendingNode   54.5994
		ArgOfPericenter 171.228
		MeanAnomaly     -157.406
	}
}

Comet	"C57"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            4.80419e-018
	Radius          0.0287341
	InertiaMoment   0.39889

	Oblateness      0.0148266

	RotationPeriod  56.2872
	Obliquity       18.3463
	EqAscendNode    287.45

	AbsMagn         13.5846
	SlopeParam      2.61337
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.436 0.432 0.424)

	Surface
	{
		SurfStyle       0.516241
		OceanStyle      0.669551
		Randomize      (0.208, -0.350, 0.553)
		colorDistMagn   0.367091
		colorDistFreq   6.8363e-007
		detailScale     0.784633
		colorConversion true
		snowLevel       2
		tropicLatitude  0.892569
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.405209
		terraceProb     0.432464
		erosion         0
		montesMagn      0.378498
		montesFreq      2.5421
		montesSpiky     0.948029
		montesFraction  0.754756
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.77808e-006
		hillsFraction   0.660181
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206766
		craterFreq      0.16836
		craterDensity   0.906524
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   2055.39
		volcanoTemp     1404.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.147, 0.119, 0.000)
		colorShelf     (0.175, 0.151, 0.136, 0.000)
		colorBeach     (0.205, 0.177, 0.161, 0.000)
		colorDesert    (0.223, 0.190, 0.157, 0.000)
		colorLowland   (0.244, 0.203, 0.178, 0.000)
		colorUpland    (0.271, 0.246, 0.216, 0.000)
		colorRock      (0.292, 0.268, 0.233, 0.000)
		colorSnow      (0.319, 0.285, 0.246, 1.000)
		BumpHeight      0.0258607
		BumpOffset      0.00517214
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.130321
		DustBright  0.262419
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.64549
		Period          11.3391
		Eccentricity    0.937832
		Inclination     -102.911
		AscendingNode   -141.119
		ArgOfPericenter 152.597
		MeanAnomaly     100.414
	}
}

Comet	"C58"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.7157e-014
	Radius          0.471775
	InertiaMoment   0.397207

	Oblateness      0.00901328

	RotationPeriod  54.4396
	Obliquity       331.552
	EqAscendNode    272.027

	AbsMagn         1.72767
	SlopeParam      6.41626
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.488 0.484 0.476)

	Surface
	{
		SurfStyle       0.949932
		OceanStyle      0.460918
		Randomize      (-0.216, 0.925, 0.412)
		colorDistMagn   0.900022
		colorDistFreq   9.78288e-005
		detailScale     12.8826
		colorConversion true
		snowLevel       2
		tropicLatitude  0.793899
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544985
		terraceProb     0.127611
		erosion         0
		montesMagn      0.691871
		montesFreq      3.6244
		montesSpiky     0.999158
		montesFraction  0.616706
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00051514
		hillsFraction   0.589672
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21983
		craterFreq      0.231647
		craterDensity   0.83143
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   383.726
		volcanoTemp     1302.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.169, 0.190, 0.050)
		colorShelf     (0.195, 0.198, 0.219, 0.040)
		colorBeach     (0.225, 0.227, 0.247, 0.030)
		colorDesert    (0.254, 0.257, 0.281, 0.020)
		colorLowland   (0.283, 0.286, 0.309, 0.030)
		colorUpland    (0.313, 0.315, 0.338, 0.050)
		colorRock      (0.342, 0.344, 0.376, 0.020)
		colorSnow      (0.342, 0.344, 0.376, 1.000)
		BumpHeight      0.424598
		BumpOffset      0.0849195
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.204292
		GasToDust   0.25
		Particles   1392
		GasBright   0.342881
		DustBright  0.534345
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.99461
		Period          21.0393
		Eccentricity    0.941598
		Inclination     119.847
		AscendingNode   114.365
		ArgOfPericenter -117.309
		MeanAnomaly     18.9337
	}
}

Comet	"C59"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.87382e-010
	Radius          11.1276
	InertiaMoment   0.399352

	Oblateness      0.0165069

	RotationPeriod  52.6088
	Obliquity       284.758
	EqAscendNode    256.605

	AbsMagn         4.49777
	SlopeParam      4.97814
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.820 0.787 0.766)

	Surface
	{
		SurfStyle       0.934478
		OceanStyle      0.465103
		Randomize      (-0.865, 0.335, 0.653)
		colorDistMagn   0.501702
		colorDistFreq   0.00991243
		detailScale     303.857
		colorConversion true
		snowLevel       2
		tropicLatitude  0.344563
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.377418
		terraceProb     0.437754
		erosion         0
		montesMagn      0.578547
		montesFreq      2.09522
		montesSpiky     0.951469
		montesFraction  0.803948
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.316071
		hillsFraction   0.699925
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219841
		craterFreq      0.210075
		craterDensity   0.746532
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   102.915
		volcanoTemp     1693.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.276, 0.306, 0.050)
		colorShelf     (0.328, 0.323, 0.352, 0.040)
		colorBeach     (0.377, 0.370, 0.398, 0.030)
		colorDesert    (0.426, 0.417, 0.452, 0.020)
		colorLowland   (0.476, 0.465, 0.498, 0.030)
		colorUpland    (0.525, 0.512, 0.544, 0.050)
		colorRock      (0.574, 0.559, 0.605, 0.020)
		colorSnow      (0.574, 0.559, 0.605, 1.000)
		BumpHeight      10.0148
		BumpOffset      2.00296
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.685484
		GasToDust   0.25
		Particles   2364
		GasBright   0.252723
		DustBright  0.30899
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.56828
		Period          17.7626
		Eccentricity    0.909258
		Inclination     -122.355
		AscendingNode   10.7894
		ArgOfPericenter 63.2967
		MeanAnomaly     -88.6508
	}
}

Comet	"C60"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            8.84869e-018
	Radius          0.0292228
	InertiaMoment   0.39805

	Oblateness      0.010367

	RotationPeriod  50.7899
	Obliquity       237.963
	EqAscendNode    241.182

	AbsMagn         6.16091
	SlopeParam      3.94337
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.565 0.491 0.445)

	Surface
	{
		SurfStyle       0.878577
		OceanStyle      0.545289
		Randomize      (0.433, -0.289, -0.984)
		colorDistMagn   0.564752
		colorDistFreq   6.41048e-007
		detailScale     0.797977
		colorConversion true
		snowLevel       2
		tropicLatitude  0.593092
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.364972
		terraceProb     0.139504
		erosion         0
		montesMagn      0.37917
		montesFreq      2.71192
		montesSpiky     0.980286
		montesFraction  0.421495
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.05851e-006
		hillsFraction   0.73648
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262182
		craterFreq      0.257647
		craterDensity   0.855709
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1540.24
		volcanoTemp     1608.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.172, 0.178, 0.050)
		colorShelf     (0.226, 0.201, 0.205, 0.040)
		colorBeach     (0.260, 0.231, 0.231, 0.030)
		colorDesert    (0.294, 0.260, 0.262, 0.020)
		colorLowland   (0.328, 0.290, 0.289, 0.030)
		colorUpland    (0.361, 0.319, 0.316, 0.050)
		colorRock      (0.395, 0.348, 0.351, 0.020)
		colorSnow      (0.395, 0.348, 0.351, 1.000)
		BumpHeight      0.0263005
		BumpOffset      0.0052601
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00220599
		DustBright  0.243993
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.6531
		Period          11.388
		Eccentricity    0.924335
		Inclination     154.202
		AscendingNode   27.3976
		ArgOfPericenter -71.5612
		MeanAnomaly     -37.3041
	}
}

Comet	"C61"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            6.84382e-014
	Radius          0.684132
	InertiaMoment   0.399782

	Oblateness      0.0186148

	RotationPeriod  48.9781
	Obliquity       191.169
	EqAscendNode    225.759

	AbsMagn         7.54829
	SlopeParam      2.8921
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.705 0.699 0.697)

	Surface
	{
		SurfStyle       0.219224
		OceanStyle      0.665181
		Randomize      (-0.006, -0.709, 0.523)
		colorDistMagn   0.341688
		colorDistFreq   0.000244695
		detailScale     18.6814
		colorConversion true
		snowLevel       2
		tropicLatitude  0.870262
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.767685
		terraceProb     0.246106
		erosion         0
		montesMagn      0.40594
		montesFreq      2.85625
		montesSpiky     0.987665
		montesFraction  0.37318
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00104778
		hillsFraction   0.57029
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213566
		craterFreq      0.234987
		craterDensity   1.0225
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   410.012
		volcanoTemp     1425.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.280, 0.279, 0.000)
		colorShelf     (0.299, 0.297, 0.296, 0.000)
		colorBeach     (0.317, 0.315, 0.314, 0.000)
		colorDesert    (0.335, 0.332, 0.331, 0.000)
		colorLowland   (0.352, 0.350, 0.348, 0.000)
		colorUpland    (0.370, 0.367, 0.366, 0.000)
		colorRock      (0.388, 0.385, 0.383, 0.000)
		colorSnow      (0.405, 0.402, 0.401, 1.000)
		BumpHeight      0.615719
		BumpOffset      0.123144
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.237118
		GasToDust   0.25
		Particles   1458
		GasBright   0.0496906
		DustBright  0.680995
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.37594
		Period          16.346
		Eccentricity    0.934397
		Inclination     52.7112
		AscendingNode   48.6727
		ArgOfPericenter 97.6845
		MeanAnomaly     96.5417
	}
}

Comet	"C62"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            5.29322e-010
	Radius          11.4212
	InertiaMoment   0.39864

	Oblateness      0.0120222

	RotationPeriod  47.1687
	Obliquity       144.375
	EqAscendNode    210.337

	AbsMagn         8.88189
	SlopeParam      6.98556
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.565 0.496 0.393)

	Surface
	{
		SurfStyle       0.250604
		OceanStyle      0.0431597
		Randomize      (-0.413, 0.539, 0.843)
		colorDistMagn   0.855438
		colorDistFreq   0.0715446
		detailScale     311.874
		colorConversion true
		snowLevel       2
		tropicLatitude  0.59485
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.417293
		terraceProb     0.244517
		erosion         0
		montesMagn      0.621536
		montesFreq      3.99852
		montesSpiky     0.879848
		montesFraction  0.502868
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.312866
		hillsFraction   0.737032
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246597
		craterFreq      0.275037
		craterDensity   1.00002
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   77.8316
		volcanoTemp     1538.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.198, 0.157, 0.000)
		colorShelf     (0.240, 0.211, 0.167, 0.000)
		colorBeach     (0.254, 0.223, 0.177, 0.000)
		colorDesert    (0.268, 0.236, 0.187, 0.000)
		colorLowland   (0.283, 0.248, 0.197, 0.000)
		colorUpland    (0.297, 0.260, 0.206, 0.000)
		colorRock      (0.311, 0.273, 0.216, 0.000)
		colorSnow      (0.325, 0.285, 0.226, 1.000)
		BumpHeight      10.279
		BumpOffset      2.05581
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.71831
		GasToDust   0.25
		Particles   2430
		GasBright   0.0527479
		DustBright  0.362425
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.7083
		Period          18.8184
		Eccentricity    0.957093
		Inclination     1.58101
		AscendingNode   122.768
		ArgOfPericenter 4.48559
		MeanAnomaly     57.1862
	}
}

Comet	"C63"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.62982e-017
	Radius          0.042111
	InertiaMoment   0.3965

	Oblateness      0.0209966

	RotationPeriod  45.3573
	Obliquity       97.5805
	EqAscendNode    194.914

	AbsMagn         10.3249
	SlopeParam      5.24598
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.781 0.753 0.720)

	Surface
	{
		SurfStyle       0.847968
		OceanStyle      0.703859
		Randomize      (0.315, -0.272, -0.140)
		colorDistMagn   0.748759
		colorDistFreq   2.98665e-007
		detailScale     1.14991
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97517
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.29149
		terraceProb     0.33073
		erosion         0
		montesMagn      0.624092
		montesFreq      3.14501
		montesSpiky     0.949112
		montesFraction  0.698067
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.60336e-006
		hillsFraction   0.470344
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225458
		craterFreq      0.236242
		craterDensity   1.0025
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1635.43
		volcanoTemp     1895.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.256, 0.202, 0.000)
		colorShelf     (0.313, 0.264, 0.230, 0.000)
		colorBeach     (0.367, 0.309, 0.274, 0.000)
		colorDesert    (0.399, 0.331, 0.266, 0.000)
		colorLowland   (0.438, 0.354, 0.302, 0.000)
		colorUpland    (0.484, 0.429, 0.367, 0.000)
		colorRock      (0.524, 0.467, 0.396, 0.000)
		colorSnow      (0.570, 0.497, 0.417, 1.000)
		BumpHeight      0.0378999
		BumpOffset      0.00757998
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.167423
		DustBright  0.732236
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.23619
		Period          15.3416
		Eccentricity    0.936819
		Inclination     21.7823
		AscendingNode   -159.241
		ArgOfPericenter -104.816
		MeanAnomaly     50.4939
	}
}

Comet	"C64"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.26055e-013
	Radius          0.707453
	InertiaMoment   0.39913

	Oblateness      0.0141076

	RotationPeriod  43.5391
	Obliquity       50.7862
	EqAscendNode    179.492

	AbsMagn         12.1743
	SlopeParam      4.17295
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.494 0.488 0.483)

	Surface
	{
		SurfStyle       0.822036
		OceanStyle      0.68295
		Randomize      (0.301, 0.494, -0.525)
		colorDistMagn   0.175468
		colorDistFreq   0.000377147
		detailScale     19.3182
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991159
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553902
		terraceProb     0.175576
		erosion         0
		montesMagn      0.656941
		montesFreq      3.18916
		montesSpiky     0.952332
		montesFraction  0.381258
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000922368
		hillsFraction   0.531616
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249013
		craterFreq      0.253574
		craterDensity   0.875087
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   312.409
		volcanoTemp     1535.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.166, 0.135, 0.000)
		colorShelf     (0.198, 0.171, 0.155, 0.000)
		colorBeach     (0.232, 0.200, 0.184, 0.000)
		colorDesert    (0.252, 0.215, 0.179, 0.000)
		colorLowland   (0.277, 0.229, 0.203, 0.000)
		colorUpland    (0.306, 0.278, 0.246, 0.000)
		colorRock      (0.331, 0.303, 0.266, 0.000)
		colorSnow      (0.361, 0.322, 0.280, 1.000)
		BumpHeight      0.636708
		BumpOffset      0.127342
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.269944
		GasToDust   0.25
		Particles   1525
		GasBright   0.143198
		DustBright  0.440948
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.44071
		Period          10.0483
		Eccentricity    0.944183
		Inclination     36.4211
		AscendingNode   -35.1654
		ArgOfPericenter -155.691
		MeanAnomaly     -143.516
	}
}

Comet	"C65"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            9.74944e-010
	Radius          16.3693
	InertiaMoment   0.397685

	Oblateness      0.024489

	RotationPeriod  41.7095
	Obliquity       3.99192
	EqAscendNode    164.069

	AbsMagn         16.5638
	SlopeParam      3.15076
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.480 0.476 0.473)

	Surface
	{
		SurfStyle       0.0323586
		OceanStyle      0.965449
		Randomize      (-0.479, -0.003, -0.951)
		colorDistMagn   0.561416
		colorDistFreq   0.048382
		detailScale     446.992
		colorConversion true
		snowLevel       2
		tropicLatitude  0.90388
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577799
		terraceProb     0.651641
		erosion         0
		montesMagn      0.580545
		montesFreq      2.13769
		montesSpiky     0.933251
		montesFraction  0.489973
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.622652
		hillsFraction   0.669809
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224052
		craterFreq      0.208054
		craterDensity   0.911539
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   82.1954
		volcanoTemp     1539.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.190, 0.189, 0.000)
		colorShelf     (0.204, 0.202, 0.201, 0.000)
		colorBeach     (0.216, 0.214, 0.213, 0.000)
		colorDesert    (0.228, 0.226, 0.225, 0.000)
		colorLowland   (0.240, 0.238, 0.237, 0.000)
		colorUpland    (0.252, 0.250, 0.248, 0.000)
		colorRock      (0.264, 0.262, 0.260, 0.000)
		colorSnow      (0.276, 0.273, 0.272, 1.000)
		BumpHeight      14.7324
		BumpOffset      2.94648
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.751136
		GasToDust   0.25
		Particles   2497
		GasBright   0.0817143
		DustBright  0.186918
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.8774
		Period          12.8623
		Eccentricity    0.938121
		Inclination     -66.8369
		AscendingNode   -56.4309
		ArgOfPericenter -158.215
		MeanAnomaly     176.803
	}
}

Comet	"C66"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.00193e-017
	Radius          0.0438214
	InertiaMoment   0.399572

	Oblateness      0.0168232

	RotationPeriod  39.8634
	Obliquity       317.198
	EqAscendNode    148.646

	AbsMagn         3.37179
	SlopeParam      8.0283
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.789 0.758 0.719)

	Surface
	{
		SurfStyle       0.847484
		OceanStyle      0.716114
		Randomize      (0.485, 0.417, 0.352)
		colorDistMagn   0.334064
		colorDistFreq   1.08696e-006
		detailScale     1.19662
		colorConversion true
		snowLevel       2
		tropicLatitude  0.980559
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577645
		terraceProb     0.184415
		erosion         0
		montesMagn      0.667107
		montesFreq      4.09501
		montesSpiky     0.924236
		montesFraction  0.464061
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.84672e-006
		hillsFraction   0.788315
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255011
		craterFreq      0.221893
		craterDensity   0.97975
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1253.98
		volcanoTemp     1473.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.258, 0.201, 0.000)
		colorShelf     (0.316, 0.265, 0.230, 0.000)
		colorBeach     (0.371, 0.311, 0.273, 0.000)
		colorDesert    (0.403, 0.333, 0.266, 0.000)
		colorLowland   (0.442, 0.356, 0.302, 0.000)
		colorUpland    (0.489, 0.432, 0.366, 0.000)
		colorRock      (0.529, 0.470, 0.395, 0.000)
		colorSnow      (0.576, 0.500, 0.417, 1.000)
		BumpHeight      0.0394393
		BumpOffset      0.00788785
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.273557
		DustBright  0.479562
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.65015
		Period          11.3691
		Eccentricity    0.931355
		Inclination     60.1342
		AscendingNode   162.38
		ArgOfPericenter 57.6795
		MeanAnomaly     -9.79201
	}
}

Comet	"C67"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.32177e-013
	Radius          1.00916
	InertiaMoment   0.398367

	Oblateness      0.0291089

	RotationPeriod  37.9957
	Obliquity       270.403
	EqAscendNode    133.224

	AbsMagn         5.37498
	SlopeParam      5.53834
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.778 0.674 0.635)

	Surface
	{
		SurfStyle       0.572368
		OceanStyle      0.797745
		Randomize      (-0.839, 0.269, 0.665)
		colorDistMagn   0.964181
		colorDistFreq   0.00082856
		detailScale     27.5567
		colorConversion true
		snowLevel       2
		tropicLatitude  0.87606
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.270272
		terraceProb     0.307892
		erosion         0
		montesMagn      0.65846
		montesFreq      3.38977
		montesSpiky     0.988169
		montesFraction  0.591262
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00213658
		hillsFraction   0.495312
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244493
		craterFreq      0.177525
		craterDensity   0.776773
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   328.364
		volcanoTemp     1648.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.229, 0.178, 0.000)
		colorShelf     (0.311, 0.236, 0.203, 0.000)
		colorBeach     (0.366, 0.276, 0.241, 0.000)
		colorDesert    (0.397, 0.297, 0.235, 0.000)
		colorLowland   (0.436, 0.317, 0.267, 0.000)
		colorUpland    (0.482, 0.384, 0.324, 0.000)
		colorRock      (0.521, 0.418, 0.349, 0.000)
		colorSnow      (0.568, 0.445, 0.368, 1.000)
		BumpHeight      0.908242
		BumpOffset      0.181648
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.30277
		GasToDust   0.25
		Particles   1591
		GasBright   0.184791
		DustBright  0.252815
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.80087
		Period          19.5274
		Eccentricity    0.954655
		Inclination     45.923
		AscendingNode   -132.691
		ArgOfPericenter 120.118
		MeanAnomaly     -20.8233
	}
}

Comet	"C68"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.79572e-009
	Radius          17.1267
	InertiaMoment   0.399994

	Oblateness      0.0205041

	RotationPeriod  36.1007
	Obliquity       223.609
	EqAscendNode    117.801

	AbsMagn         6.86221
	SlopeParam      4.40484
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.688 0.643 0.572)

	Surface
	{
		SurfStyle       0.14203
		OceanStyle      0.259721
		Randomize      (-0.533, -0.360, -0.599)
		colorDistMagn   0.904755
		colorDistFreq   0.242128
		detailScale     467.674
		colorConversion true
		snowLevel       2
		tropicLatitude  0.350838
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.379272
		terraceProb     0.108278
		erosion         0
		montesMagn      0.520843
		montesFreq      3.60321
		montesSpiky     0.957567
		montesFraction  0.63837
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.852274
		hillsFraction   0.495199
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234007
		craterFreq      0.216455
		craterDensity   1.05588
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.3667
		volcanoTemp     1347.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.257, 0.229, 0.000)
		colorShelf     (0.292, 0.273, 0.243, 0.000)
		colorBeach     (0.310, 0.289, 0.257, 0.000)
		colorDesert    (0.327, 0.306, 0.272, 0.000)
		colorLowland   (0.344, 0.322, 0.286, 0.000)
		colorUpland    (0.361, 0.338, 0.300, 0.000)
		colorRock      (0.378, 0.354, 0.314, 0.000)
		colorSnow      (0.396, 0.370, 0.329, 1.000)
		BumpHeight      15.4141
		BumpOffset      3.08281
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.783962
		GasToDust   0.25
		Particles   2563
		GasBright   0.443823
		DustBright  0.478269
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.79529
		Period          6.339
		Eccentricity    0.901425
		Inclination     44.3102
		AscendingNode   150.253
		ArgOfPericenter -68.015
		MeanAnomaly     -139.218
	}
}

Comet	"C69"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            5.52916e-017
	Radius          0.0622471
	InertiaMoment   0.398897

	Oblateness      0.0355349

	RotationPeriod  34.1721
	Obliquity       176.815
	EqAscendNode    102.379

	AbsMagn         8.20301
	SlopeParam      3.3959
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.432 0.427 0.423)

	Surface
	{
		SurfStyle       0.28633
		OceanStyle      0.441414
		Randomize      (0.200, -0.612, 0.804)
		colorDistMagn   0.957507
		colorDistFreq   4.72487e-007
		detailScale     1.69976
		colorConversion true
		snowLevel       2
		tropicLatitude  0.692485
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.484941
		terraceProb     0.403183
		erosion         0
		montesMagn      0.522082
		montesFreq      3.83697
		montesSpiky     0.944543
		montesFraction  0.714024
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.06783e-005
		hillsFraction   0.520271
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223813
		craterFreq      0.219285
		craterDensity   0.979772
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1312.49
		volcanoTemp     1530.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.173, 0.171, 0.169, 0.000)
		colorShelf     (0.184, 0.181, 0.180, 0.000)
		colorBeach     (0.195, 0.192, 0.190, 0.000)
		colorDesert    (0.205, 0.203, 0.201, 0.000)
		colorLowland   (0.216, 0.213, 0.211, 0.000)
		colorUpland    (0.227, 0.224, 0.222, 0.000)
		colorRock      (0.238, 0.235, 0.233, 0.000)
		colorSnow      (0.249, 0.245, 0.243, 1.000)
		BumpHeight      0.0560224
		BumpOffset      0.0112045
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.024486
		DustBright  0.582093
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.55666
		Period          10.7728
		Eccentricity    0.932347
		Inclination     -45.6514
		AscendingNode   -126.241
		ArgOfPericenter -37.9625
		MeanAnomaly     -135.053
	}
}

Comet	"C70"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            4.27641e-013
	Radius          1.06087
	InertiaMoment   0.397221

	Oblateness      0.0254502

	RotationPeriod  32.2029
	Obliquity       130.02
	EqAscendNode    86.9561

	AbsMagn         9.56769
	SlopeParam      2.18755
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.746 0.742 0.740)

	Surface
	{
		SurfStyle       0.376164
		OceanStyle      0.00458389
		Randomize      (0.526, -0.733, -0.332)
		colorDistMagn   0.913919
		colorDistFreq   0.00095935
		detailScale     28.9689
		colorConversion true
		snowLevel       2
		tropicLatitude  0.736461
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.565154
		terraceProb     0.279775
		erosion         0
		montesMagn      0.562045
		montesFreq      2.28326
		montesSpiky     0.904313
		montesFraction  0.358263
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00263595
		hillsFraction   0.687991
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.180115
		craterFreq      0.164551
		craterDensity   0.933451
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   254.349
		volcanoTemp     1808.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.297, 0.296, 0.000)
		colorShelf     (0.317, 0.315, 0.315, 0.000)
		colorBeach     (0.336, 0.334, 0.333, 0.000)
		colorDesert    (0.354, 0.353, 0.352, 0.000)
		colorLowland   (0.373, 0.371, 0.370, 0.000)
		colorUpland    (0.392, 0.390, 0.389, 0.000)
		colorRock      (0.410, 0.408, 0.407, 0.000)
		colorSnow      (0.429, 0.427, 0.426, 1.000)
		BumpHeight      0.954786
		BumpOffset      0.190957
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.335596
		GasToDust   0.25
		Particles   1657
		GasBright   0.0289356
		DustBright  0.26213
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.18976
		Period          8.53913
		Eccentricity    0.946416
		Inclination     176.421
		AscendingNode   -136.486
		ArgOfPericenter 116.063
		MeanAnomaly     133.202
	}
}

Comet	"C71"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.30749e-009
	Radius          24.2364
	InertiaMoment   0.399358

	Oblateness      0.0450159

	RotationPeriod  30.1853
	Obliquity       83.2261
	EqAscendNode    71.5335

	AbsMagn         11.1519
	SlopeParam      5.86805
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.571 0.567 0.565)

	Surface
	{
		SurfStyle       0.504286
		OceanStyle      0.899585
		Randomize      (0.612, 0.003, -0.200)
		colorDistMagn   0.465427
		colorDistFreq   0.499627
		detailScale     661.815
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999557
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.284195
		terraceProb     0.551958
		erosion         0
		montesMagn      0.651749
		montesFreq      4.20343
		montesSpiky     0.893398
		montesFraction  0.674765
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.37149
		hillsFraction   0.49453
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247482
		craterFreq      0.227189
		craterDensity   0.948095
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   66.0731
		volcanoTemp     1519.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.193, 0.158, 0.000)
		colorShelf     (0.229, 0.199, 0.181, 0.000)
		colorBeach     (0.269, 0.233, 0.215, 0.000)
		colorDesert    (0.291, 0.250, 0.209, 0.000)
		colorLowland   (0.320, 0.267, 0.238, 0.000)
		colorUpland    (0.354, 0.323, 0.288, 0.000)
		colorRock      (0.383, 0.352, 0.311, 0.000)
		colorSnow      (0.417, 0.375, 0.328, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.816788
		GasToDust   0.25
		Particles   2629
		GasBright   0.122892
		DustBright  0.652659
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.44843
		Period          16.8753
		Eccentricity    0.937692
		Inclination     -5.10323
		AscendingNode   -173.336
		ArgOfPericenter -16.3051
		MeanAnomaly     -178.913
	}
}

Comet	"C72"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.0184e-016
	Radius          0.0657132
	InertiaMoment   0.398059

	Oblateness      0.0334388

	RotationPeriod  28.11
	Obliquity       36.4318
	EqAscendNode    56.1109

	AbsMagn         13.5368
	SlopeParam      4.64233
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.766 0.737 0.701)

	Surface
	{
		SurfStyle       0.397335
		OceanStyle      0.542976
		Randomize      (0.363, -0.965, 0.127)
		colorDistMagn   0.436416
		colorDistFreq   1.71964e-006
		detailScale     1.79441
		colorConversion true
		snowLevel       2
		tropicLatitude  0.673611
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.375124
		terraceProb     0.636709
		erosion         0
		montesMagn      0.323218
		montesFreq      3.03622
		montesSpiky     0.859933
		montesFraction  0.488424
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.48551e-005
		hillsFraction   0.746525
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229336
		craterFreq      0.226171
		craterDensity   1.05671
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1020.94
		volcanoTemp     1218.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.295, 0.280, 0.000)
		colorShelf     (0.326, 0.313, 0.298, 0.000)
		colorBeach     (0.345, 0.332, 0.315, 0.000)
		colorDesert    (0.364, 0.350, 0.333, 0.000)
		colorLowland   (0.383, 0.368, 0.350, 0.000)
		colorUpland    (0.402, 0.387, 0.368, 0.000)
		colorRock      (0.421, 0.405, 0.385, 0.000)
		colorSnow      (0.441, 0.424, 0.403, 1.000)
		BumpHeight      0.0591419
		BumpOffset      0.0118284
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.10006
		DustBright  0.359978
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.58046
		Period          17.8537
		Eccentricity    0.95142
		Inclination     -151.979
		AscendingNode   -95.9329
		ArgOfPericenter 106.525
		MeanAnomaly     -62.7013
	}
}

Comet	"C73"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            7.87662e-013
	Radius          1.49614
	InertiaMoment   0.399787

	Oblateness      0.0601872

	RotationPeriod  25.9664
	Obliquity       349.638
	EqAscendNode    40.6883

	AbsMagn         1.66465
	SlopeParam      3.63226
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.763 0.760 0.758)

	Surface
	{
		SurfStyle       0.00758275
		OceanStyle      0.913297
		Randomize      (-0.966, -0.418, 0.697)
		colorDistMagn   0.7589
		colorDistFreq   0.00117843
		detailScale     40.8547
		colorConversion true
		snowLevel       2
		tropicLatitude  0.317457
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.62666
		terraceProb     0.703263
		erosion         0
		montesMagn      0.380171
		montesFreq      1.70587
		montesSpiky     0.840186
		montesFraction  0.816981
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00391457
		hillsFraction   0.658948
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233454
		craterFreq      0.202236
		craterDensity   1.05716
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   264.307
		volcanoTemp     1477.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.304, 0.303, 0.000)
		colorShelf     (0.324, 0.323, 0.322, 0.000)
		colorBeach     (0.343, 0.342, 0.341, 0.000)
		colorDesert    (0.363, 0.361, 0.360, 0.000)
		colorLowland   (0.382, 0.380, 0.379, 0.000)
		colorUpland    (0.401, 0.399, 0.398, 0.000)
		colorRock      (0.420, 0.418, 0.417, 0.000)
		colorSnow      (0.439, 0.437, 0.436, 1.000)
		BumpHeight      1.34653
		BumpOffset      0.269306
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.368422
		GasToDust   0.25
		Particles   1724
		GasBright   0.261207
		DustBright  0.683318
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.17449
		Period          8.45
		Eccentricity    0.875861
		Inclination     155.648
		AscendingNode   134.626
		ArgOfPericenter 43.1204
		MeanAnomaly     2.72824
	}
}

Comet	"C74"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            6.09199e-009
	Radius          25.6828
	InertiaMoment   0.398647

	Oblateness      0.0468853

	RotationPeriod  23.7417
	Obliquity       302.843
	EqAscendNode    25.2657

	AbsMagn         4.47098
	SlopeParam      2.51016
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.500 0.491 0.488)

	Surface
	{
		SurfStyle       0.0445704
		OceanStyle      0.817027
		Randomize      (0.820, 0.165, -0.056)
		colorDistMagn   0.646483
		colorDistFreq   0.263416
		detailScale     701.311
		colorConversion true
		snowLevel       2
		tropicLatitude  0.667072
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502843
		terraceProb     0.109036
		erosion         0
		montesMagn      0.391958
		montesFreq      2.64784
		montesSpiky     0.809097
		montesFraction  0.488668
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.29027
		hillsFraction   0.721818
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252236
		craterFreq      0.153705
		craterDensity   0.819578
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.5904
		volcanoTemp     1577.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.196, 0.195, 0.000)
		colorShelf     (0.213, 0.209, 0.207, 0.000)
		colorBeach     (0.225, 0.221, 0.220, 0.000)
		colorDesert    (0.238, 0.233, 0.232, 0.000)
		colorLowland   (0.250, 0.246, 0.244, 0.000)
		colorUpland    (0.263, 0.258, 0.256, 0.000)
		colorRock      (0.275, 0.270, 0.268, 0.000)
		colorSnow      (0.288, 0.282, 0.281, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.849614
		GasToDust   0.25
		Particles   2696
		GasBright   0.211092
		DustBright  0.417919
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.94656
		Period          13.3288
		Eccentricity    0.903104
		Inclination     -94.5445
		AscendingNode   -160.192
		ArgOfPericenter -103.412
		MeanAnomaly     -57.4949
	}
}

Comet	"C75"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.87577e-016
	Radius          0.0923867
	InertiaMoment   0.396524

	Oblateness      0.086385

	RotationPeriod  21.4202
	Obliquity       256.049
	EqAscendNode    9.84313

	AbsMagn         6.14065
	SlopeParam      6.25852
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.476 0.471 0.468)

	Surface
	{
		SurfStyle       0.950959
		OceanStyle      0.701603
		Randomize      (0.170, -0.659, 0.267)
		colorDistMagn   0.449853
		colorDistFreq   3.83643e-006
		detailScale     2.52277
		colorConversion true
		snowLevel       2
		tropicLatitude  0.959206
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.698612
		terraceProb     0.54266
		erosion         0
		montesMagn      0.55088
		montesFreq      2.81842
		montesSpiky     0.983752
		montesFraction  0.759994
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.8239e-005
		hillsFraction   0.651749
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241687
		craterFreq      0.191749
		craterDensity   0.870653
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1057.61
		volcanoTemp     1761.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.165, 0.187, 0.050)
		colorShelf     (0.191, 0.193, 0.215, 0.040)
		colorBeach     (0.219, 0.221, 0.243, 0.030)
		colorDesert    (0.248, 0.250, 0.276, 0.020)
		colorLowland   (0.276, 0.278, 0.304, 0.030)
		colorUpland    (0.305, 0.306, 0.332, 0.050)
		colorRock      (0.333, 0.334, 0.370, 0.020)
		colorSnow      (0.333, 0.334, 0.370, 1.000)
		BumpHeight      0.0831481
		BumpOffset      0.0166296
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.123719
		DustBright  0.189779
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.53751
		Period          10.652
		Eccentricity    0.922421
		Inclination     88.2598
		AscendingNode   106.492
		ArgOfPericenter -179.701
		MeanAnomaly     -5.8273
	}
}

Comet	"C76"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.45077e-012
	Radius          1.59086
	InertiaMoment   0.399136

	Oblateness      0.0733301

	RotationPeriod  18.9824
	Obliquity       209.255
	EqAscendNode    354.421

	AbsMagn         7.52996
	SlopeParam      4.88926
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.403 0.400 0.397)

	Surface
	{
		SurfStyle       0.196992
		OceanStyle      0.256284
		Randomize      (-0.106, 0.099, -0.414)
		colorDistMagn   0.97134
		colorDistFreq   0.00179941
		detailScale     43.4411
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999031
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.569072
		terraceProb     0.529436
		erosion         0
		montesMagn      0.458683
		montesFreq      2.56164
		montesSpiky     0.937447
		montesFraction  0.500097
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00643345
		hillsFraction   0.706742
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251086
		craterFreq      0.24498
		craterDensity   0.886831
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   207.08
		volcanoTemp     1606.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.161, 0.160, 0.159, 0.000)
		colorShelf     (0.171, 0.170, 0.169, 0.000)
		colorBeach     (0.181, 0.180, 0.179, 0.000)
		colorDesert    (0.192, 0.190, 0.189, 0.000)
		colorLowland   (0.202, 0.200, 0.199, 0.000)
		colorUpland    (0.212, 0.210, 0.209, 0.000)
		colorRock      (0.222, 0.220, 0.219, 0.000)
		colorSnow      (0.232, 0.230, 0.229, 1.000)
		BumpHeight      1.43177
		BumpOffset      0.286355
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.401248
		GasToDust   0.25
		Particles   1790
		GasBright   0.362033
		DustBright  0.435952
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.59182
		Period          10.9958
		Eccentricity    0.909262
		Inclination     -116.942
		AscendingNode   36.2594
		ArgOfPericenter 27.402
		MeanAnomaly     145.123
	}
}

Comet	"C77"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.12207e-008
	Radius          36.0046
	InertiaMoment   0.397696

	Oblateness      0.146391

	RotationPeriod  16.4037
	Obliquity       162.46
	EqAscendNode    338.998

	AbsMagn         8.86325
	SlopeParam      3.86358
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.604 0.536 0.429)

	Surface
	{
		SurfStyle       0.527024
		OceanStyle      0.532379
		Randomize      (0.204, -0.941, -0.543)
		colorDistMagn   0.641753
		colorDistFreq   0.857332
		detailScale     983.165
		colorConversion true
		snowLevel       2
		tropicLatitude  0.85899
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.579773
		terraceProb     0.372255
		erosion         0
		montesMagn      0.577155
		montesFreq      3.93768
		montesSpiky     0.877129
		montesFraction  0.7212
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.35361
		hillsFraction   0.671185
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239727
		craterFreq      0.215094
		craterDensity   0.862781
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   53.2911
		volcanoTemp     1502.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.182, 0.120, 0.000)
		colorShelf     (0.242, 0.188, 0.137, 0.000)
		colorBeach     (0.284, 0.220, 0.163, 0.000)
		colorDesert    (0.308, 0.236, 0.159, 0.000)
		colorLowland   (0.338, 0.252, 0.180, 0.000)
		colorUpland    (0.374, 0.306, 0.219, 0.000)
		colorRock      (0.405, 0.333, 0.236, 0.000)
		colorSnow      (0.441, 0.354, 0.249, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.88244
		GasToDust   0.25
		Particles   2762
		GasBright   0.00614161
		DustBright  0.47633
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.04219
		Period          21.4163
		Eccentricity    0.948563
		Inclination     -137.581
		AscendingNode   -160.751
		ArgOfPericenter -40.249
		MeanAnomaly     -17.5887
	}
}

Comet	"C78"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.45493e-016
	Radius          0.098542
	InertiaMoment   0.399578

	Oblateness      0.14173

	RotationPeriod  13.6517
	Obliquity       115.666
	EqAscendNode    323.575

	AbsMagn         10.3033
	SlopeParam      2.79794
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.494 0.491 0.487)

	Surface
	{
		SurfStyle       0.235557
		OceanStyle      0.373109
		Randomize      (0.819, 0.665, 0.926)
		colorDistMagn   0.778782
		colorDistFreq   3.33723e-006
		detailScale     2.69085
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0567376
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.339892
		terraceProb     0.373218
		erosion         0
		montesMagn      0.520127
		montesFreq      3.08879
		montesSpiky     0.847616
		montesFraction  0.583547
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.65064e-005
		hillsFraction   0.691366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24247
		craterFreq      0.217012
		craterDensity   1.01217
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   831.205
		volcanoTemp     1310.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.196, 0.195, 0.000)
		colorShelf     (0.210, 0.209, 0.207, 0.000)
		colorBeach     (0.222, 0.221, 0.219, 0.000)
		colorDesert    (0.235, 0.233, 0.231, 0.000)
		colorLowland   (0.247, 0.246, 0.243, 0.000)
		colorUpland    (0.259, 0.258, 0.256, 0.000)
		colorRock      (0.272, 0.270, 0.268, 0.000)
		colorSnow      (0.284, 0.282, 0.280, 1.000)
		BumpHeight      0.0886878
		BumpOffset      0.0177376
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0694031
		DustBright  0.897555
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.21745
		Period          15.2086
		Eccentricity    0.979073
		Inclination     -61.1443
		AscendingNode   -179.283
		ArgOfPericenter 41.8748
		MeanAnomaly     -71.9146
	}
}

Comet	"C79"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.67214e-012
	Radius          2.22435
	InertiaMoment   0.398374

	Oblateness      0.249

	RotationPeriod  10.6827
	Obliquity       68.8718
	EqAscendNode    308.153

	AbsMagn         12.143
	SlopeParam      6.76195
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.736 0.684 0.620)

	Surface
	{
		SurfStyle       0.739452
		OceanStyle      0.57367
		Randomize      (-0.327, 0.809, -0.883)
		colorDistMagn   0.326319
		colorDistFreq   0.00122249
		detailScale     60.7396
		colorConversion true
		snowLevel       2
		tropicLatitude  0.853178
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584313
		terraceProb     0.471962
		erosion         0
		montesMagn      0.480972
		montesFreq      4.31691
		montesSpiky     0.878793
		montesFraction  0.361913
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0114382
		hillsFraction   0.620194
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240593
		craterFreq      0.190259
		craterDensity   0.805772
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   213.344
		volcanoTemp     1389.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.233, 0.174, 0.000)
		colorShelf     (0.294, 0.239, 0.198, 0.000)
		colorBeach     (0.346, 0.280, 0.236, 0.000)
		colorDesert    (0.375, 0.301, 0.229, 0.000)
		colorLowland   (0.412, 0.321, 0.260, 0.000)
		colorUpland    (0.456, 0.390, 0.316, 0.000)
		colorRock      (0.493, 0.424, 0.341, 0.000)
		colorSnow      (0.537, 0.451, 0.360, 1.000)
		BumpHeight      2.00192
		BumpOffset      0.400383
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.434074
		GasToDust   0.25
		Particles   1856
		GasBright   0.0852219
		DustBright  0.566222
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.75729
		Period          19.1925
		Eccentricity    0.954959
		Inclination     22.7949
		AscendingNode   -121.591
		ArgOfPericenter 175.606
		MeanAnomaly     -116.862
	}
}

Comet	"C80"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.06671e-008
	Radius          38.5134
	InertiaMoment   0.399999

	Oblateness      0.249

	RotationPeriod  7.43534
	Obliquity       22.0775
	EqAscendNode    292.73

	AbsMagn         16.3919
	SlopeParam      5.15061
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.433 0.428 0.426)

	Surface
	{
		SurfStyle       0.762381
		OceanStyle      0.730105
		Randomize      (-0.605, 0.253, 0.522)
		colorDistMagn   0.606016
		colorDistFreq   1.15895
		detailScale     1051.67
		colorConversion true
		snowLevel       2
		tropicLatitude  0.956446
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.744573
		terraceProb     0.506995
		erosion         0
		montesMagn      0.54399
		montesFreq      3.14079
		montesSpiky     0.90954
		montesFraction  0.733333
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.94453
		hillsFraction   0.916587
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251495
		craterFreq      0.155013
		craterDensity   1.02723
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.0028
		volcanoTemp     1339.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.146, 0.119, 0.000)
		colorShelf     (0.173, 0.150, 0.136, 0.000)
		colorBeach     (0.203, 0.176, 0.162, 0.000)
		colorDesert    (0.221, 0.188, 0.158, 0.000)
		colorLowland   (0.242, 0.201, 0.179, 0.000)
		colorUpland    (0.268, 0.244, 0.217, 0.000)
		colorRock      (0.290, 0.266, 0.235, 0.000)
		colorSnow      (0.316, 0.283, 0.247, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.915266
		GasToDust   0.25
		Particles   2828
		GasBright   0.0637816
		DustBright  0.272149
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.79818
		Period          12.3348
		Eccentricity    0.958801
		Inclination     -67.2253
		AscendingNode   -101.116
		ArgOfPericenter 21.004
		MeanAnomaly     33.2269
	}
}

Comet	"C81"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            6.36356e-016
	Radius          0.137447
	InertiaMoment   0.398903

	Oblateness      0.249

	RotationPeriod  3.81927
	Obliquity       335.283
	EqAscendNode    277.308

	AbsMagn         3.33605
	SlopeParam      4.09308
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.467 0.463 0.460)

	Surface
	{
		SurfStyle       0.452986
		OceanStyle      0.398245
		Randomize      (0.354, -0.525, 0.726)
		colorDistMagn   0.365243
		colorDistFreq   1.52078e-005
		detailScale     3.75321
		colorConversion true
		snowLevel       2
		tropicLatitude  0.802206
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.486886
		terraceProb     0.511109
		erosion         0
		montesMagn      0.543312
		montesFreq      3.57312
		montesSpiky     0.940517
		montesFraction  0.882114
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.6349e-005
		hillsFraction   0.623524
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22366
		craterFreq      0.156488
		craterDensity   0.914016
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   854.259
		volcanoTemp     1374.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.185, 0.184, 0.000)
		colorShelf     (0.199, 0.197, 0.196, 0.000)
		colorBeach     (0.210, 0.208, 0.207, 0.000)
		colorDesert    (0.222, 0.220, 0.219, 0.000)
		colorLowland   (0.234, 0.232, 0.230, 0.000)
		colorUpland    (0.245, 0.243, 0.242, 0.000)
		colorRock      (0.257, 0.255, 0.253, 0.000)
		colorSnow      (0.269, 0.266, 0.265, 1.000)
		BumpHeight      0.123702
		BumpOffset      0.0247404
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.204211
		DustBright  0.616207
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.41087
		Period          16.6003
		Eccentricity    0.9316
		Inclination     -131.506
		AscendingNode   90.9033
		ArgOfPericenter 79.186
		MeanAnomaly     19.2677
	}
}

Comet	"C82"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            4.92175e-012
	Radius          2.38562
	InertiaMoment   0.397235

	Oblateness      0.00158331

	RotationPeriod  128.338
	Obliquity       288.489
	EqAscendNode    261.885

	AbsMagn         5.35236
	SlopeParam      3.0627
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.503 0.500 0.497)

	Surface
	{
		SurfStyle       0.87611
		OceanStyle      0.597071
		Randomize      (-0.627, 0.997, -0.830)
		colorDistMagn   0.615207
		colorDistFreq   0.00284198
		detailScale     65.1434
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979691
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.524693
		terraceProb     0.254516
		erosion         0
		montesMagn      0.511041
		montesFreq      3.09507
		montesSpiky     0.988773
		montesFraction  0.610787
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.012213
		hillsFraction   0.847442
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22202
		craterFreq      0.238362
		craterDensity   0.904812
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   168.596
		volcanoTemp     1245.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.175, 0.199, 0.050)
		colorShelf     (0.201, 0.205, 0.229, 0.040)
		colorBeach     (0.231, 0.235, 0.258, 0.030)
		colorDesert    (0.261, 0.265, 0.293, 0.020)
		colorLowland   (0.292, 0.295, 0.323, 0.030)
		colorUpland    (0.322, 0.325, 0.353, 0.050)
		colorRock      (0.352, 0.355, 0.392, 0.020)
		colorSnow      (0.352, 0.355, 0.392, 1.000)
		BumpHeight      2.14706
		BumpOffset      0.429412
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.4669
		GasToDust   0.25
		Particles   1923
		GasBright   0.155488
		DustBright  0.349416
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.03547
		Period          21.3629
		Eccentricity    0.949854
		Inclination     -32.6604
		AscendingNode   24.0175
		ArgOfPericenter 162.704
		MeanAnomaly     -33.9552
	}
}

Comet	"C83"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.80662e-008
	Radius          53.5967
	InertiaMoment   0.399363

	Oblateness      0.00295285

	RotationPeriod  114.248
	Obliquity       241.695
	EqAscendNode    246.462

	AbsMagn         6.84324
	SlopeParam      7.55136
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.631 0.627 0.623)

	Surface
	{
		SurfStyle       0.197915
		OceanStyle      0.0384633
		Randomize      (-0.285, 0.165, -0.187)
		colorDistMagn   0.536725
		colorDistFreq   0.676405
		detailScale     1463.55
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993295
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566039
		terraceProb     0.261281
		erosion         0
		montesMagn      0.371138
		montesFreq      3.70219
		montesSpiky     0.937207
		montesFraction  0.35193
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.53259
		hillsFraction   0.662924
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250911
		craterFreq      0.183018
		craterDensity   0.98711
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   43.07
		volcanoTemp     1713.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.251, 0.249, 0.000)
		colorShelf     (0.268, 0.267, 0.265, 0.000)
		colorBeach     (0.284, 0.282, 0.280, 0.000)
		colorDesert    (0.300, 0.298, 0.296, 0.000)
		colorLowland   (0.316, 0.314, 0.312, 0.000)
		colorUpland    (0.331, 0.329, 0.327, 0.000)
		colorRock      (0.347, 0.345, 0.343, 0.000)
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
		MaxLength   0.948092
		GasToDust   0.25
		Particles   2895
		GasBright   0.363107
		DustBright  0.626283
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.12775
		Period          14.577
		Eccentricity    0.952111
		Inclination     75.0116
		AscendingNode   -89.5269
		ArgOfPericenter -150.921
		MeanAnomaly     111.947
	}
}

Comet	"C84"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.17208e-015
	Radius          0.147772
	InertiaMoment   0.398067

	Oblateness      0.00231397

	RotationPeriod  106.219
	Obliquity       194.9
	EqAscendNode    231.04

	AbsMagn         8.18478
	SlopeParam      5.43332
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.590 0.478 0.409)

	Surface
	{
		SurfStyle       0.607459
		OceanStyle      0.0886211
		Randomize      (-0.736, -0.963, -0.752)
		colorDistMagn   0.268436
		colorDistFreq   1.93787e-005
		detailScale     4.03515
		colorConversion true
		snowLevel       2
		tropicLatitude  0.601523
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.588009
		terraceProb     0.278273
		erosion         0
		montesMagn      0.552983
		montesFreq      3.35315
		montesSpiky     0.986974
		montesFraction  0.27977
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.16303e-005
		hillsFraction   0.414194
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259799
		craterFreq      0.265344
		craterDensity   0.843862
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   676.734
		volcanoTemp     1359.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.163, 0.114, 0.000)
		colorShelf     (0.236, 0.167, 0.131, 0.000)
		colorBeach     (0.277, 0.196, 0.155, 0.000)
		colorDesert    (0.301, 0.211, 0.151, 0.000)
		colorLowland   (0.330, 0.225, 0.172, 0.000)
		colorUpland    (0.366, 0.273, 0.209, 0.000)
		colorRock      (0.395, 0.297, 0.225, 0.000)
		colorSnow      (0.431, 0.316, 0.237, 1.000)
		BumpHeight      0.132995
		BumpOffset      0.0265989
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0185336
		GasToDust   0.25
		Particles   1017
		GasBright   0.287103
		DustBright  0.386774
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.35624
		Period          16.2032
		Eccentricity    0.956967
		Inclination     -129.121
		AscendingNode   -161.435
		ArgOfPericenter -156.868
		MeanAnomaly     -167.033
	}
}

Comet	"C85"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            9.06525e-012
	Radius          3.31291
	InertiaMoment   0.399792

	Oblateness      0.00380195

	RotationPeriod  100.346
	Obliquity       148.106
	EqAscendNode    215.617

	AbsMagn         9.54806
	SlopeParam      4.32381
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.748 0.746 0.744)

	Surface
	{
		SurfStyle       0.836566
		OceanStyle      0.177016
		Randomize      (0.585, 0.857, -0.044)
		colorDistMagn   0.351303
		colorDistFreq   0.00436771
		detailScale     90.4644
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997063
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.522244
		terraceProb     0.256614
		erosion         0
		montesMagn      0.641986
		montesFreq      3.7441
		montesSpiky     0.96467
		montesFraction  0.492508
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.02193
		hillsFraction   0.529258
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245774
		craterFreq      0.185259
		craterDensity   0.972981
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   172.514
		volcanoTemp     1357.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.254, 0.208, 0.000)
		colorShelf     (0.299, 0.261, 0.238, 0.000)
		colorBeach     (0.352, 0.306, 0.283, 0.000)
		colorDesert    (0.381, 0.328, 0.275, 0.000)
		colorLowland   (0.419, 0.350, 0.313, 0.000)
		colorUpland    (0.464, 0.425, 0.380, 0.000)
		colorRock      (0.501, 0.462, 0.409, 0.000)
		colorSnow      (0.546, 0.492, 0.432, 1.000)
		BumpHeight      2.98161
		BumpOffset      0.596323
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.499726
		GasToDust   0.25
		Particles   1989
		GasBright   0.173839
		DustBright  0.184525
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.66017
		Period          11.4336
		Eccentricity    0.916988
		Inclination     -61.3155
		AscendingNode   -44.4415
		ArgOfPericenter 23.7208
		MeanAnomaly     -175.923
	}
}

Comet	"C86"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            7.01131e-008
	Radius          57.754
	InertiaMoment   0.398654

	Oblateness      0.00285674

	RotationPeriod  95.607
	Obliquity       101.312
	EqAscendNode    200.195

	AbsMagn         11.1272
	SlopeParam      3.31194
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.688 0.685 0.683)

	Surface
	{
		SurfStyle       0.838778
		OceanStyle      0.430054
		Randomize      (-0.023, -0.380, 0.955)
		colorDistMagn   0.802614
		colorDistFreq   1.72009
		detailScale     1577.07
		colorConversion true
		snowLevel       2
		tropicLatitude  0.905784
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.546154
		terraceProb     0.202313
		erosion         0
		montesMagn      0.446184
		montesFreq      3.08766
		montesSpiky     0.950561
		montesFraction  0.665287
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.32003
		hillsFraction   0.651392
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228403
		craterFreq      0.21716
		craterDensity   0.788317
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.197
		volcanoTemp     1196.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.233, 0.191, 0.000)
		colorShelf     (0.275, 0.240, 0.219, 0.000)
		colorBeach     (0.323, 0.281, 0.260, 0.000)
		colorDesert    (0.351, 0.301, 0.253, 0.000)
		colorLowland   (0.385, 0.322, 0.287, 0.000)
		colorUpland    (0.426, 0.390, 0.348, 0.000)
		colorRock      (0.461, 0.425, 0.376, 0.000)
		colorSnow      (0.502, 0.452, 0.396, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.980918
		GasToDust   0.25
		Particles   2961
		GasBright   0.0372007
		DustBright  0.80565
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.56629
		Period          17.7478
		Eccentricity    0.952519
		Inclination     143.227
		AscendingNode   8.30704
		ArgOfPericenter 120.521
		MeanAnomaly     131.118
	}
}

Comet	"C87"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.15883e-015
	Radius          0.204804
	InertiaMoment   0.396547

	Oblateness      0.00447427

	RotationPeriod  91.5743
	Obliquity       54.5174
	EqAscendNode    184.772

	AbsMagn         13.4897
	SlopeParam      2.06393
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.571 0.568 0.567)

	Surface
	{
		SurfStyle       0.462045
		OceanStyle      0.974163
		Randomize      (0.986, 0.516, 0.723)
		colorDistMagn   0.519965
		colorDistFreq   2.61365e-005
		detailScale     5.59252
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994254
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.420204
		terraceProb     0.124824
		erosion         0
		montesMagn      0.530818
		montesFreq      3.01153
		montesSpiky     0.975559
		montesFraction  0.62591
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000126217
		hillsFraction   0.889469
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22045
		craterFreq      0.251583
		craterDensity   0.936106
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   691.09
		volcanoTemp     1504.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.227, 0.227, 0.000)
		colorShelf     (0.243, 0.241, 0.241, 0.000)
		colorBeach     (0.257, 0.256, 0.255, 0.000)
		colorDesert    (0.271, 0.270, 0.269, 0.000)
		colorLowland   (0.285, 0.284, 0.283, 0.000)
		colorUpland    (0.300, 0.298, 0.297, 0.000)
		colorRock      (0.314, 0.312, 0.312, 0.000)
		colorSnow      (0.328, 0.327, 0.326, 1.000)
		BumpHeight      0.184324
		BumpOffset      0.0368647
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0513596
		GasToDust   0.25
		Particles   1083
		GasBright   0.0544117
		DustBright  0.472925
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.32495
		Period          23.7024
		Eccentricity    0.974426
		Inclination     43.6457
		AscendingNode   -20.3098
		ArgOfPericenter 56.4704
		MeanAnomaly     136.321
	}
}

Comet	"C88"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.6697e-011
	Radius          3.57744
	InertiaMoment   0.399142

	Oblateness      0.00336949

	RotationPeriod  88.0249
	Obliquity       7.72309
	EqAscendNode    169.349

	AbsMagn         1.60002
	SlopeParam      5.74813
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.531 0.369 0.294)

	Surface
	{
		SurfStyle       0.227784
		OceanStyle      0.0508195
		Randomize      (0.915, 0.421, -0.123)
		colorDistMagn   0.73791
		colorDistFreq   0.0107252
		detailScale     97.6879
		colorConversion true
		snowLevel       2
		tropicLatitude  0.757786
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.582784
		terraceProb     0.360378
		erosion         0
		montesMagn      0.450102
		montesFreq      1.57999
		montesSpiky     0.813859
		montesFraction  0.192957
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0328095
		hillsFraction   0.860956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238258
		craterFreq      0.187919
		craterDensity   0.957773
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   137.265
		volcanoTemp     1705.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.148, 0.118, 0.000)
		colorShelf     (0.226, 0.157, 0.125, 0.000)
		colorBeach     (0.239, 0.166, 0.132, 0.000)
		colorDesert    (0.252, 0.175, 0.140, 0.000)
		colorLowland   (0.265, 0.185, 0.147, 0.000)
		colorUpland    (0.279, 0.194, 0.154, 0.000)
		colorRock      (0.292, 0.203, 0.162, 0.000)
		colorSnow      (0.305, 0.212, 0.169, 1.000)
		BumpHeight      3.21969
		BumpOffset      0.643939
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.532552
		GasToDust   0.25
		Particles   2055
		GasBright   0.0343635
		DustBright  0.17746
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.93235
		Period          13.2325
		Eccentricity    0.950472
		Inclination     43.9286
		AscendingNode   48.997
		ArgOfPericenter -38.498
		MeanAnomaly     -149.418
	}
}

Comet	"C89"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.2914e-007
	Radius          79.8953
	InertiaMoment   0.397706

	Oblateness      0.00519751

	RotationPeriod  84.827
	Obliquity       320.929
	EqAscendNode    153.927

	AbsMagn         4.44404
	SlopeParam      4.55895
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.546 0.540 0.534)

	Surface
	{
		SurfStyle       0.607484
		OceanStyle      0.736168
		Randomize      (0.713, -0.938, -0.114)
		colorDistMagn   0.123862
		colorDistFreq   3.13963
		detailScale     2181.67
		colorConversion true
		snowLevel       2
		tropicLatitude  0.792551
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.344361
		terraceProb     0.161133
		erosion         0
		montesMagn      0.424773
		montesFreq      2.1016
		montesSpiky     0.978592
		montesFraction  0.178947
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.743
		hillsFraction   0.861982
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226823
		craterFreq      0.199551
		craterDensity   0.884392
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.8576
		volcanoTemp     1315.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.184, 0.150, 0.000)
		colorShelf     (0.218, 0.189, 0.171, 0.000)
		colorBeach     (0.257, 0.221, 0.203, 0.000)
		colorDesert    (0.278, 0.238, 0.198, 0.000)
		colorLowland   (0.306, 0.254, 0.224, 0.000)
		colorUpland    (0.338, 0.308, 0.272, 0.000)
		colorRock      (0.366, 0.335, 0.294, 0.000)
		colorSnow      (0.399, 0.356, 0.310, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.154074
		DustBright  0.542236
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.70363
		Period          18.7828
		Eccentricity    0.937959
		Inclination     -88.7235
		AscendingNode   -5.62028
		ArgOfPericenter -46.8101
		MeanAnomaly     155.626
	}
}

Comet	"C90"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.97631e-015
	Radius          0.221596
	InertiaMoment   0.399583

	Oblateness      0.00389132

	RotationPeriod  81.8962
	Obliquity       274.134
	EqAscendNode    138.504

	AbsMagn         6.12035
	SlopeParam      3.55089
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.704 0.702 0.700)

	Surface
	{
		SurfStyle       0.890948
		OceanStyle      0.764478
		Randomize      (-0.909, -0.078, -0.952)
		colorDistMagn   0.928307
		colorDistFreq   8.57389e-006
		detailScale     6.05105
		colorConversion true
		snowLevel       2
		tropicLatitude  0.940835
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.289023
		terraceProb     0.32601
		erosion         0
		montesMagn      0.301597
		montesFreq      2.40943
		montesSpiky     0.989927
		montesFraction  0.367693
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00013902
		hillsFraction   0.39236
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.186824
		craterFreq      0.243658
		craterDensity   0.79466
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   550.97
		volcanoTemp     1465.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.246, 0.280, 0.050)
		colorShelf     (0.281, 0.288, 0.322, 0.040)
		colorBeach     (0.324, 0.330, 0.364, 0.030)
		colorDesert    (0.366, 0.372, 0.413, 0.020)
		colorLowland   (0.408, 0.414, 0.455, 0.030)
		colorUpland    (0.450, 0.456, 0.497, 0.050)
		colorRock      (0.493, 0.498, 0.553, 0.020)
		colorSnow      (0.493, 0.498, 0.553, 1.000)
		BumpHeight      0.199437
		BumpOffset      0.0398873
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0841856
		GasToDust   0.25
		Particles   1149
		GasBright   0.106744
		DustBright  0.274053
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.87161
		Period          20.0751
		Eccentricity    0.927913
		Inclination     22.9399
		AscendingNode   45.5024
		ArgOfPericenter -130.063
		MeanAnomaly     89.1718
	}
}

Comet	"C91"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.07538e-011
	Radius          4.94028
	InertiaMoment   0.398381

	Oblateness      0.00593809

	RotationPeriod  79.1744
	Obliquity       227.34
	EqAscendNode    123.082

	AbsMagn         7.51163
	SlopeParam      2.40282
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.464 0.460 0.458)

	Surface
	{
		SurfStyle       0.309858
		OceanStyle      0.185312
		Randomize      (-0.683, -0.397, -0.223)
		colorDistMagn   0.901549
		colorDistFreq   0.0110236
		detailScale     134.903
		colorConversion true
		snowLevel       2
		tropicLatitude  0.778101
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.742061
		terraceProb     0.173134
		erosion         0
		montesMagn      0.628042
		montesFreq      3.03889
		montesSpiky     0.875124
		montesFraction  0.345052
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.070024
		hillsFraction   0.524321
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223209
		craterFreq      0.243889
		craterDensity   0.884533
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   139.672
		volcanoTemp     1629.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.184, 0.183, 0.000)
		colorShelf     (0.197, 0.195, 0.195, 0.000)
		colorBeach     (0.209, 0.207, 0.206, 0.000)
		colorDesert    (0.221, 0.218, 0.217, 0.000)
		colorLowland   (0.232, 0.230, 0.229, 0.000)
		colorUpland    (0.244, 0.241, 0.240, 0.000)
		colorRock      (0.255, 0.253, 0.252, 0.000)
		colorSnow      (0.267, 0.264, 0.263, 1.000)
		BumpHeight      4.44625
		BumpOffset      0.88925
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.565377
		GasToDust   0.25
		Particles   2121
		GasBright   0.293645
		DustBright  0.571638
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.57292
		Period          10.8758
		Eccentricity    0.906307
		Inclination     -7.84019
		AscendingNode   -115.49
		ArgOfPericenter -47.6782
		MeanAnomaly     156.236
	}
}

Comet	"C92"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.37859e-007
	Radius          86.6068
	InertiaMoment   0.393769

	Oblateness      0.00434112

	RotationPeriod  76.6201
	Obliquity       180.546
	EqAscendNode    107.659

	AbsMagn         8.84462
	SlopeParam      6.1137
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.681 0.678 0.676)

	Surface
	{
		SurfStyle       0.938955
		OceanStyle      0.173964
		Randomize      (-0.796, 0.339, -0.587)
		colorDistMagn   0.893415
		colorDistFreq   2.77061
		detailScale     2364.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.550429
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.567896
		terraceProb     0.243346
		erosion         0
		montesMagn      0.514713
		montesFreq      2.77409
		montesSpiky     0.848156
		montesFraction  0.1499
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.1182
		hillsFraction   0.582125
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214871
		craterFreq      0.213034
		craterDensity   0.696958
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.8419
		volcanoTemp     1356.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.237, 0.271, 0.050)
		colorShelf     (0.273, 0.278, 0.311, 0.040)
		colorBeach     (0.313, 0.319, 0.352, 0.030)
		colorDesert    (0.354, 0.360, 0.399, 0.020)
		colorLowland   (0.395, 0.400, 0.440, 0.030)
		colorUpland    (0.436, 0.441, 0.480, 0.050)
		colorRock      (0.477, 0.482, 0.534, 0.020)
		colorSnow      (0.477, 0.482, 0.534, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.219033
		DustBright  0.330737
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.77531
		Period          12.1839
		Eccentricity    0.934579
		Inclination     -146.166
		AscendingNode   143.445
		ArgOfPericenter -41.7571
		MeanAnomaly     -140.308
	}
}

Comet	"C93"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            7.32384e-015
	Radius          0.30551
	InertiaMoment   0.398909

	Oblateness      0.00672699

	RotationPeriod  74.2024
	Obliquity       133.752
	EqAscendNode    92.2365

	AbsMagn         10.2819
	SlopeParam      4.80212
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.680 0.677 0.676)

	Surface
	{
		SurfStyle       0.608564
		OceanStyle      0.0615906
		Randomize      (-0.200, -0.075, -0.124)
		colorDistMagn   0.30634
		colorDistFreq   2.34467e-005
		detailScale     8.34246
		colorConversion true
		snowLevel       2
		tropicLatitude  0.725234
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489736
		terraceProb     0.153765
		erosion         0
		montesMagn      0.587597
		montesFreq      3.45588
		montesSpiky     0.766808
		montesFraction  0.548508
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000205229
		hillsFraction   0.703383
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233262
		craterFreq      0.232211
		craterDensity   0.634246
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   559.708
		volcanoTemp     1263.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.265, 0.230, 0.189, 0.000)
		colorShelf     (0.272, 0.237, 0.216, 0.000)
		colorBeach     (0.320, 0.278, 0.257, 0.000)
		colorDesert    (0.347, 0.298, 0.250, 0.000)
		colorLowland   (0.381, 0.318, 0.284, 0.000)
		colorUpland    (0.421, 0.386, 0.345, 0.000)
		colorRock      (0.455, 0.420, 0.372, 0.000)
		colorSnow      (0.496, 0.447, 0.392, 1.000)
		BumpHeight      0.274959
		BumpOffset      0.0549918
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.117011
		GasToDust   0.25
		Particles   1216
		GasBright   0.107161
		DustBright  0.127095
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.47625
		Period          17.0799
		Eccentricity    0.950974
		Inclination     80.5334
		AscendingNode   36.2274
		ArgOfPericenter 47.4671
		MeanAnomaly     53.2097
	}
}

Comet	"C94"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            5.66448e-011
	Radius          5.36466
	InertiaMoment   0.397248

	Oblateness      0.00498488

	RotationPeriod  71.8975
	Obliquity       86.9573
	EqAscendNode    76.8139

	AbsMagn         12.112
	SlopeParam      3.78357
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.620 0.615 0.612)

	Surface
	{
		SurfStyle       0.957605
		OceanStyle      0.953629
		Randomize      (0.967, 0.341, 0.982)
		colorDistMagn   0.362628
		colorDistFreq   0.0163106
		detailScale     146.491
		colorConversion true
		snowLevel       2
		tropicLatitude  0.919424
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.719802
		terraceProb     0.2756
		erosion         0
		montesMagn      0.435721
		montesFreq      3.06276
		montesSpiky     0.814457
		montesFraction  0.131374
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0686687
		hillsFraction   0.505869
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236995
		craterFreq      0.272638
		craterDensity   0.89521
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   111.755
		volcanoTemp     1405.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.215, 0.245, 0.050)
		colorShelf     (0.248, 0.252, 0.282, 0.040)
		colorBeach     (0.285, 0.289, 0.318, 0.030)
		colorDesert    (0.323, 0.326, 0.361, 0.020)
		colorLowland   (0.360, 0.363, 0.398, 0.030)
		colorUpland    (0.397, 0.400, 0.435, 0.050)
		colorRock      (0.434, 0.437, 0.484, 0.020)
		colorSnow      (0.434, 0.437, 0.484, 1.000)
		BumpHeight      4.8282
		BumpOffset      0.965639
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.598203
		GasToDust   0.25
		Particles   2188
		GasBright   0.0118584
		DustBright  0.706884
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.43172
		Period          9.99284
		Eccentricity    0.913403
		Inclination     29.5009
		AscendingNode   -26.6591
		ArgOfPericenter 21.2246
		MeanAnomaly     -70.2932
	}
}

Comet	"C95"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            4.38106e-007
	Radius          119.217
	InertiaMoment   0.399369

	Oblateness      0.00758941

	RotationPeriod  69.6866
	Obliquity       40.163
	EqAscendNode    61.3913

	AbsMagn         16.2341
	SlopeParam      2.70104
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.677 0.522 0.435)

	Surface
	{
		SurfStyle       0.97792
		OceanStyle      0.232473
		Randomize      (-0.287, 0.908, -0.196)
		colorDistMagn   0.828141
		colorDistFreq   3.15426
		detailScale     3255.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997841
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.549344
		terraceProb     0.468849
		erosion         0
		montesMagn      0.524003
		montesFreq      3.30531
		montesSpiky     0.913511
		montesFraction  0.493562
		dunesFraction   0
		hillsMagn       0
		hillsFreq       38.4791
		hillsFraction   0.803526
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213001
		craterFreq      0.383657
		craterDensity   0.918277
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.2394
		volcanoTemp     1526.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.183, 0.174, 0.050)
		colorShelf     (0.271, 0.214, 0.200, 0.040)
		colorBeach     (0.312, 0.245, 0.226, 0.030)
		colorDesert    (0.352, 0.276, 0.257, 0.020)
		colorLowland   (0.393, 0.308, 0.283, 0.030)
		colorUpland    (0.434, 0.339, 0.309, 0.050)
		colorRock      (0.474, 0.370, 0.344, 0.020)
		colorSnow      (0.474, 0.370, 0.344, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0304616
		DustBright  0.372768
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.64247
		Period          18.3195
		Eccentricity    0.930442
		Inclination     -88.757
		AscendingNode   97.3292
		ArgOfPericenter 72.464
		MeanAnomaly     148.431
	}
}

Comet	"C96"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.34896e-014
	Radius          0.332301
	InertiaMoment   0.398075

	Oblateness      0.00565258

	RotationPeriod  67.5547
	Obliquity       353.369
	EqAscendNode    45.9687

	AbsMagn         3.29994
	SlopeParam      6.56836
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.731 0.729 0.726)

	Surface
	{
		SurfStyle       0.255093
		OceanStyle      0.617571
		Randomize      (0.999, 0.968, -0.373)
		colorDistMagn   0.896923
		colorDistFreq   9.09789e-005
		detailScale     9.07404
		colorConversion true
		snowLevel       2
		tropicLatitude  0.800625
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.700362
		terraceProb     0.255803
		erosion         0
		montesMagn      0.387639
		montesFreq      3.17005
		montesSpiky     0.983148
		montesFraction  0.600227
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000190583
		hillsFraction   0.727678
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237392
		craterFreq      0.215384
		craterDensity   0.938917
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   448.578
		volcanoTemp     1520.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.292, 0.290, 0.000)
		colorShelf     (0.311, 0.310, 0.309, 0.000)
		colorBeach     (0.329, 0.328, 0.327, 0.000)
		colorDesert    (0.347, 0.346, 0.345, 0.000)
		colorLowland   (0.366, 0.365, 0.363, 0.000)
		colorUpland    (0.384, 0.383, 0.381, 0.000)
		colorRock      (0.402, 0.401, 0.399, 0.000)
		colorSnow      (0.420, 0.419, 0.418, 1.000)
		BumpHeight      0.299071
		BumpOffset      0.0598142
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.149837
		GasToDust   0.25
		Particles   1282
		GasBright   0.119477
		DustBright  0.768239
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.61486
		Period          18.1116
		Eccentricity    0.968232
		Inclination     -59.6449
		AscendingNode   167.243
		ArgOfPericenter 172.398
		MeanAnomaly     -66.1977
	}
}

Comet	"C97"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.04333e-010
	Radius          7.37376
	InertiaMoment   0.399798

	Oblateness      0.0085521

	RotationPeriod  65.4893
	Obliquity       306.574
	EqAscendNode    30.5461

	AbsMagn         5.32965
	SlopeParam      5.0578
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.762 0.666 0.623)

	Surface
	{
		SurfStyle       0.806979
		OceanStyle      0.972491
		Randomize      (-0.495, 0.997, 0.890)
		colorDistMagn   0.654527
		colorDistFreq   0.0165858
		detailScale     201.353
		colorConversion true
		snowLevel       2
		tropicLatitude  0.252441
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.266243
		terraceProb     0.437224
		erosion         0
		montesMagn      0.529509
		montesFreq      2.69095
		montesSpiky     0.847184
		montesFraction  0.372537
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.146551
		hillsFraction   0.589871
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238605
		craterFreq      0.248485
		craterDensity   1.00628
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   113.184
		volcanoTemp     1565.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.227, 0.174, 0.000)
		colorShelf     (0.305, 0.233, 0.199, 0.000)
		colorBeach     (0.358, 0.273, 0.237, 0.000)
		colorDesert    (0.388, 0.293, 0.230, 0.000)
		colorLowland   (0.427, 0.313, 0.262, 0.000)
		colorUpland    (0.472, 0.380, 0.318, 0.000)
		colorRock      (0.510, 0.413, 0.343, 0.000)
		colorSnow      (0.556, 0.440, 0.361, 1.000)
		BumpHeight      6.63638
		BumpOffset      1.32728
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.631029
		GasToDust   0.25
		Particles   2254
		GasBright   0.110798
		DustBright  0.461404
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.83029
		Period          19.7546
		Eccentricity    0.942805
		Inclination     139.195
		AscendingNode   -169.843
		ArgOfPericenter -11.0349
		MeanAnomaly     -170.868
	}
}

Comet	"C98"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.21248e-018
	Radius          0.0205836
	InertiaMoment   0.39866

	Oblateness      0.00640274

	RotationPeriod  63.48
	Obliquity       259.78
	EqAscendNode    15.1236

	AbsMagn         6.82425
	SlopeParam      4.01335
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.778 0.775 0.775)

	Surface
	{
		SurfStyle       0.713186
		OceanStyle      0.0995605
		Randomize      (0.869, 0.695, 0.997)
		colorDistMagn   0.0554667
		colorDistFreq   1.45351e-007
		detailScale     0.56207
		colorConversion true
		snowLevel       2
		tropicLatitude  0.764466
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.47705
		terraceProb     0.374873
		erosion         0
		montesMagn      0.536845
		montesFreq      3.02974
		montesSpiky     0.950092
		montesFraction  0.520983
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.16641e-006
		hillsFraction   0.550503
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258744
		craterFreq      0.268594
		craterDensity   0.830989
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1800.56
		volcanoTemp     1636.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.264, 0.217, 0.000)
		colorShelf     (0.311, 0.271, 0.248, 0.000)
		colorBeach     (0.365, 0.318, 0.294, 0.000)
		colorDesert    (0.397, 0.341, 0.287, 0.000)
		colorLowland   (0.435, 0.364, 0.325, 0.000)
		colorUpland    (0.482, 0.442, 0.395, 0.000)
		colorRock      (0.521, 0.481, 0.426, 0.000)
		colorSnow      (0.568, 0.512, 0.449, 1.000)
		BumpHeight      0.0185253
		BumpOffset      0.00370505
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0648602
		DustBright  0.191829
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.58452
		Period          25.8678
		Eccentricity    0.956239
		Inclination     35.0347
		AscendingNode   -152.12
		ArgOfPericenter -117.177
		MeanAnomaly     -81.6443
	}
}

Comet	"C99"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.48462e-014
	Radius          0.456113
	InertiaMoment   0.396571

	Oblateness      0.00951626

	RotationPeriod  61.5178
	Obliquity       212.986
	EqAscendNode    359.701

	AbsMagn         8.16656
	SlopeParam      2.97279
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.574 0.570 0.568)

	Surface
	{
		SurfStyle       0.662134
		OceanStyle      0.661287
		Randomize      (-0.848, -0.254, -0.400)
		colorDistMagn   0.899577
		colorDistFreq   0.000104632
		detailScale     12.4549
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999018
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.625166
		terraceProb     0.150909
		erosion         0
		montesMagn      0.560993
		montesFreq      3.98007
		montesSpiky     0.9847
		montesFraction  0.496374
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000560177
		hillsFraction   0.614003
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.204008
		craterFreq      0.214335
		craterDensity   0.860226
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   453.678
		volcanoTemp     1527.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.194, 0.159, 0.000)
		colorShelf     (0.230, 0.199, 0.182, 0.000)
		colorBeach     (0.270, 0.234, 0.216, 0.000)
		colorDesert    (0.293, 0.251, 0.210, 0.000)
		colorLowland   (0.321, 0.268, 0.239, 0.000)
		colorUpland    (0.356, 0.325, 0.290, 0.000)
		colorRock      (0.384, 0.353, 0.313, 0.000)
		colorSnow      (0.419, 0.376, 0.330, 1.000)
		BumpHeight      0.410502
		BumpOffset      0.0821003
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.182663
		GasToDust   0.25
		Particles   1348
		GasBright   0.231043
		DustBright  0.510133
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.94313
		Period          13.3055
		Eccentricity    0.951335
		Inclination     101.311
		AscendingNode   -103.012
		ArgOfPericenter 16.5166
		MeanAnomaly     -21.1001
	}
}

Comet	"C100"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.92167e-010
	Radius          8.04473
	InertiaMoment   0.399147

	Oblateness      0.00726344

	RotationPeriod  59.595
	Obliquity       166.192
	EqAscendNode    344.278

	AbsMagn         9.52846
	SlopeParam      7.21835
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.727 0.724 0.722)

	Surface
	{
		SurfStyle       0.447982
		OceanStyle      0.75602
		Randomize      (0.032, -0.202, 0.104)
		colorDistMagn   0.720244
		colorDistFreq   0.035935
		detailScale     219.675
		colorConversion true
		snowLevel       2
		tropicLatitude  0.841081
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539173
		terraceProb     0.147059
		erosion         0
		montesMagn      0.59316
		montesFreq      2.34577
		montesSpiky     0.895647
		montesFraction  0.390538
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.2062
		hillsFraction   0.733131
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226598
		craterFreq      0.219902
		craterDensity   0.950994
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   90.9866
		volcanoTemp     1570.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.290, 0.289, 0.000)
		colorShelf     (0.309, 0.308, 0.307, 0.000)
		colorBeach     (0.327, 0.326, 0.325, 0.000)
		colorDesert    (0.345, 0.344, 0.343, 0.000)
		colorLowland   (0.363, 0.362, 0.361, 0.000)
		colorUpland    (0.382, 0.380, 0.379, 0.000)
		colorRock      (0.400, 0.398, 0.397, 0.000)
		colorSnow      (0.418, 0.416, 0.415, 1.000)
		BumpHeight      7.24025
		BumpOffset      1.44805
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.663855
		GasToDust   0.25
		Particles   2320
		GasBright   0.157823
		DustBright  0.267839
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.72167
		Period          18.9202
		Eccentricity    0.925693
		Inclination     43.6062
		AscendingNode   170.298
		ArgOfPericenter 102.426
		MeanAnomaly     -161.201
	}
}

Comet	"C101"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            5.91696e-018
	Radius          0.0282154
	InertiaMoment   0.397716

	Oblateness      0.0107972

	RotationPeriod  57.7047
	Obliquity       119.397
	EqAscendNode    328.856

	AbsMagn         11.1025
	SlopeParam      5.33211
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.645 0.643 0.640)

	Surface
	{
		SurfStyle       0.510373
		OceanStyle      0.399774
		Randomize      (-0.720, 0.266, 0.396)
		colorDistMagn   0.654161
		colorDistFreq   6.38012e-007
		detailScale     0.770468
		colorConversion true
		snowLevel       2
		tropicLatitude  0.932658
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.548586
		terraceProb     0.232498
		erosion         0
		montesMagn      0.62655
		montesFreq      3.66958
		montesSpiky     0.910368
		montesFraction  0.554063
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.87351e-006
		hillsFraction   0.740971
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227077
		craterFreq      0.205015
		craterDensity   0.926619
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1818.62
		volcanoTemp     1391.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.219, 0.179, 0.000)
		colorShelf     (0.258, 0.225, 0.205, 0.000)
		colorBeach     (0.303, 0.264, 0.243, 0.000)
		colorDesert    (0.329, 0.283, 0.237, 0.000)
		colorLowland   (0.361, 0.302, 0.269, 0.000)
		colorUpland    (0.400, 0.366, 0.326, 0.000)
		colorRock      (0.432, 0.399, 0.352, 0.000)
		colorSnow      (0.471, 0.424, 0.371, 1.000)
		BumpHeight      0.0253938
		BumpOffset      0.00507877
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.391196
		DustBright  0.518953
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.05683
		Period          21.5327
		Eccentricity    0.968432
		Inclination     -79.0217
		AscendingNode   57.9206
		ArgOfPericenter -114.864
		MeanAnomaly     101.202
	}
}

Comet	"C102"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            4.57635e-014
	Radius          0.498311
	InertiaMoment   0.399588

	Oblateness      0.00826997

	RotationPeriod  55.8408
	Obliquity       72.6029
	EqAscendNode    313.433

	AbsMagn         13.4434
	SlopeParam      4.24331
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.670 0.665 0.662)

	Surface
	{
		SurfStyle       0.76817
		OceanStyle      0.572443
		Randomize      (-0.898, -0.010, 0.303)
		colorDistMagn   0.691319
		colorDistFreq   0.000199809
		detailScale     13.6072
		colorConversion true
		snowLevel       2
		tropicLatitude  0.892642
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532423
		terraceProb     0.291175
		erosion         0
		montesMagn      0.659327
		montesFreq      3.21852
		montesSpiky     0.965721
		montesFraction  0.337332
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000842565
		hillsFraction   0.739882
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24375
		craterFreq      0.198036
		craterDensity   0.752732
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   365.213
		volcanoTemp     1509.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.226, 0.185, 0.000)
		colorShelf     (0.268, 0.233, 0.212, 0.000)
		colorBeach     (0.315, 0.272, 0.252, 0.000)
		colorDesert    (0.342, 0.292, 0.245, 0.000)
		colorLowland   (0.375, 0.312, 0.278, 0.000)
		colorUpland    (0.415, 0.379, 0.338, 0.000)
		colorRock      (0.449, 0.412, 0.364, 0.000)
		colorSnow      (0.489, 0.439, 0.384, 1.000)
		BumpHeight      0.44848
		BumpOffset      0.0896959
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.215489
		GasToDust   0.25
		Particles   1415
		GasBright   0.290694
		DustBright  0.303941
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.67463
		Period          5.71079
		Eccentricity    0.915394
		Inclination     103.268
		AscendingNode   -124.001
		ArgOfPericenter -176.166
		MeanAnomaly     -110.616
	}
}

Comet	"C103"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.53949e-010
	Radius          11.0136
	InertiaMoment   0.398389

	Oblateness      0.0122904

	RotationPeriod  53.9978
	Obliquity       25.8086
	EqAscendNode    298.011

	AbsMagn         1.53367
	SlopeParam      3.22674
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.520 0.458 0.386)

	Surface
	{
		SurfStyle       0.65623
		OceanStyle      0.0215779
		Randomize      (0.438, -0.022, 0.235)
		colorDistMagn   0.708041
		colorDistFreq   0.0716686
		detailScale     300.744
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999903
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.335635
		terraceProb     0.349363
		erosion         0
		montesMagn      0.420625
		montesFreq      4.01778
		montesSpiky     0.949346
		montesFraction  0.641099
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.24726
		hillsFraction   0.601313
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239336
		craterFreq      0.229303
		craterDensity   0.882814
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   91.7835
		volcanoTemp     1838.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.156, 0.108, 0.000)
		colorShelf     (0.208, 0.160, 0.123, 0.000)
		colorBeach     (0.244, 0.188, 0.147, 0.000)
		colorDesert    (0.265, 0.201, 0.143, 0.000)
		colorLowland   (0.291, 0.215, 0.162, 0.000)
		colorUpland    (0.322, 0.261, 0.197, 0.000)
		colorRock      (0.348, 0.284, 0.212, 0.000)
		colorSnow      (0.380, 0.302, 0.224, 1.000)
		BumpHeight      9.91222
		BumpOffset      1.98244
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.696681
		GasToDust   0.25
		Particles   2387
		GasBright   0.0133717
		DustBright  0.26575
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.25505
		Period          15.4759
		Eccentricity    0.938584
		Inclination     115.006
		AscendingNode   -178.728
		ArgOfPericenter 90.3887
		MeanAnomaly     -124.606
	}
}

Comet	"C104"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.08983e-017
	Radius          0.0308666
	InertiaMoment   0.394233

	Oblateness      0.00926759

	RotationPeriod  52.1703
	Obliquity       339.014
	EqAscendNode    282.588

	AbsMagn         4.41693
	SlopeParam      8.81434
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.667 0.664 0.662)

	Surface
	{
		SurfStyle       0.177501
		OceanStyle      0.21792
		Randomize      (0.704, 0.013, -0.613)
		colorDistMagn   0.607398
		colorDistFreq   5.70213e-007
		detailScale     0.842865
		colorConversion true
		snowLevel       2
		tropicLatitude  0.849648
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.65512
		terraceProb     0.263319
		erosion         0
		montesMagn      0.547431
		montesFreq      3.08488
		montesSpiky     0.642786
		montesFraction  0.526535
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.36104e-006
		hillsFraction   0.657702
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.197772
		craterFreq      0.214091
		craterDensity   0.816815
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1465.94
		volcanoTemp     1037.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.265, 0.265, 0.000)
		colorShelf     (0.284, 0.282, 0.281, 0.000)
		colorBeach     (0.300, 0.299, 0.298, 0.000)
		colorDesert    (0.317, 0.315, 0.314, 0.000)
		colorLowland   (0.334, 0.332, 0.331, 0.000)
		colorUpland    (0.350, 0.348, 0.347, 0.000)
		colorRock      (0.367, 0.365, 0.364, 0.000)
		colorSnow      (0.384, 0.382, 0.380, 1.000)
		BumpHeight      0.02778
		BumpOffset      0.005556
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.081669
		DustBright  0.68194
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.62677
		Period          11.219
		Eccentricity    0.936432
		Inclination     106.551
		AscendingNode   139.584
		ArgOfPericenter 48.6985
		MeanAnomaly     -134.548
	}
}

Comet	"C105"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            8.42907e-014
	Radius          0.681392
	InertiaMoment   0.398915

	Oblateness      0.0140826

	RotationPeriod  50.3535
	Obliquity       292.22
	EqAscendNode    267.165

	AbsMagn         6.09999
	SlopeParam      5.63419
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.576 0.573 0.567)

	Surface
	{
		SurfStyle       0.665997
		OceanStyle      0.243525
		Randomize      (0.941, -0.209, -0.022)
		colorDistMagn   0.673803
		colorDistFreq   0.000327143
		detailScale     18.6065
		colorConversion true
		snowLevel       2
		tropicLatitude  0.887954
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.303686
		terraceProb     0.596027
		erosion         0
		montesMagn      0.654264
		montesFreq      3.06525
		montesSpiky     0.841926
		montesFraction  0.650453
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00105365
		hillsFraction   0.522248
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256577
		craterFreq      0.219329
		craterDensity   0.83426
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   367.971
		volcanoTemp     1015.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.195, 0.159, 0.000)
		colorShelf     (0.231, 0.201, 0.182, 0.000)
		colorBeach     (0.271, 0.235, 0.216, 0.000)
		colorDesert    (0.294, 0.252, 0.210, 0.000)
		colorLowland   (0.323, 0.269, 0.238, 0.000)
		colorUpland    (0.357, 0.327, 0.289, 0.000)
		colorRock      (0.386, 0.355, 0.312, 0.000)
		colorSnow      (0.421, 0.378, 0.329, 1.000)
		BumpHeight      0.613253
		BumpOffset      0.122651
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.248315
		GasToDust   0.25
		Particles   1481
		GasBright   0.0743823
		DustBright  0.373713
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.65883
		Period          18.4431
		Eccentricity    0.933311
		Inclination     143.076
		AscendingNode   106.464
		ArgOfPericenter 110.97
		MeanAnomaly     105.239
	}
}

Comet	"C106"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            6.51928e-010
	Radius          12.0636
	InertiaMoment   0.397262

	Oblateness      0.010805

	RotationPeriod  48.5427
	Obliquity       245.426
	EqAscendNode    251.743

	AbsMagn         7.49328
	SlopeParam      4.47654
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.482 0.474 0.469)

	Surface
	{
		SurfStyle       0.96601
		OceanStyle      0.46448
		Randomize      (0.755, -0.491, 0.826)
		colorDistMagn   0.993761
		colorDistFreq   0.0490593
		detailScale     329.418
		colorConversion true
		snowLevel       2
		tropicLatitude  0.620298
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.673067
		terraceProb     0.359487
		erosion         0
		montesMagn      0.485048
		montesFreq      2.70888
		montesSpiky     0.997115
		montesFraction  0.406869
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.335814
		hillsFraction   0.350561
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216902
		craterFreq      0.207842
		craterDensity   0.826798
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   74.0772
		volcanoTemp     1418.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.166, 0.188, 0.050)
		colorShelf     (0.193, 0.194, 0.216, 0.040)
		colorBeach     (0.222, 0.223, 0.244, 0.030)
		colorDesert    (0.251, 0.251, 0.277, 0.020)
		colorLowland   (0.280, 0.280, 0.305, 0.030)
		colorUpland    (0.309, 0.308, 0.333, 0.050)
		colorRock      (0.338, 0.337, 0.371, 0.020)
		colorSnow      (0.338, 0.337, 0.371, 1.000)
		BumpHeight      10.8573
		BumpOffset      2.17145
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.729507
		GasToDust   0.25
		Particles   2453
		GasBright   0.20987
		DustBright  0.722712
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.37609
		Period          16.3471
		Eccentricity    0.916192
		Inclination     152.027
		AscendingNode   -12.1053
		ArgOfPericenter 36.5246
		MeanAnomaly     78.1915
	}
}

Comet	"C107"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.00734e-017
	Radius          0.042159
	InertiaMoment   0.399374

	Oblateness      0.0162883

	RotationPeriod  46.7332
	Obliquity       198.631
	EqAscendNode    236.32

	AbsMagn         8.82602
	SlopeParam      3.46876
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.650 0.645 0.641)

	Surface
	{
		SurfStyle       0.331076
		OceanStyle      0.317126
		Randomize      (-0.127, -0.467, 0.661)
		colorDistMagn   0.095232
		colorDistFreq   6.28984e-007
		detailScale     1.15122
		colorConversion true
		snowLevel       2
		tropicLatitude  0.391582
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.314472
		terraceProb     0.241628
		erosion         0
		montesMagn      0.693926
		montesFreq      3.08531
		montesSpiky     0.922548
		montesFraction  0.764651
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.95282e-006
		hillsFraction   0.563898
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252485
		craterFreq      0.235172
		craterDensity   0.929608
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1475.32
		volcanoTemp     1564.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.258, 0.257, 0.000)
		colorShelf     (0.276, 0.274, 0.273, 0.000)
		colorBeach     (0.292, 0.290, 0.289, 0.000)
		colorDesert    (0.309, 0.306, 0.305, 0.000)
		colorLowland   (0.325, 0.322, 0.321, 0.000)
		colorUpland    (0.341, 0.339, 0.337, 0.000)
		colorRock      (0.357, 0.355, 0.353, 0.000)
		colorSnow      (0.374, 0.371, 0.369, 1.000)
		BumpHeight      0.0379431
		BumpOffset      0.00758862
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.175301
		DustBright  0.441767
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.73301
		Period          6.01204
		Eccentricity    0.872301
		Inclination     -140.304
		AscendingNode   159.414
		ArgOfPericenter 68.7779
		MeanAnomaly     179.923
	}
}

Comet	"C108"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.55253e-013
	Radius          0.747251
	InertiaMoment   0.398084

	Oblateness      0.0126312

	RotationPeriod  44.9206
	Obliquity       151.837
	EqAscendNode    220.898

	AbsMagn         10.2605
	SlopeParam      2.29066
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.555 0.549 0.543)

	Surface
	{
		SurfStyle       0.333973
		OceanStyle      0.180364
		Randomize      (-0.007, -0.786, -0.391)
		colorDistMagn   0.705339
		colorDistFreq   0.00019563
		detailScale     20.4049
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967537
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.663255
		terraceProb     0.407878
		erosion         0
		montesMagn      0.376502
		montesFreq      2.25061
		montesSpiky     0.997972
		montesFraction  0.521413
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00131747
		hillsFraction   0.784852
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240053
		craterFreq      0.234373
		craterDensity   0.869383
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   297.34
		volcanoTemp     1245.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.220, 0.217, 0.000)
		colorShelf     (0.236, 0.233, 0.231, 0.000)
		colorBeach     (0.250, 0.247, 0.244, 0.000)
		colorDesert    (0.264, 0.261, 0.258, 0.000)
		colorLowland   (0.278, 0.275, 0.271, 0.000)
		colorUpland    (0.292, 0.288, 0.285, 0.000)
		colorRock      (0.305, 0.302, 0.298, 0.000)
		colorSnow      (0.319, 0.316, 0.312, 1.000)
		BumpHeight      0.672526
		BumpOffset      0.134505
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.281141
		GasToDust   0.25
		Particles   1547
		GasBright   0.103473
		DustBright  0.198082
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.01469
		Period          21.1982
		Eccentricity    0.938266
		Inclination     -62.4936
		AscendingNode   -68.3511
		ArgOfPericenter -124
		MeanAnomaly     -138.087
	}
}

Comet	"C109"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.20077e-009
	Radius          16.4591
	InertiaMoment   0.399803

	Oblateness      0.01908

	RotationPeriod  43.1001
	Obliquity       105.043
	EqAscendNode    205.475

	AbsMagn         12.0813
	SlopeParam      5.97919
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.562 0.558 0.551)

	Surface
	{
		SurfStyle       0.570977
		OceanStyle      0.0752196
		Randomize      (0.653, 0.634, 0.929)
		colorDistMagn   0.366429
		colorDistFreq   0.106519
		detailScale     449.443
		colorConversion true
		snowLevel       2
		tropicLatitude  0.428376
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.725151
		terraceProb     0.201141
		erosion         0
		montesMagn      0.477321
		montesFreq      3.11633
		montesSpiky     0.959815
		montesFraction  0.655632
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.786437
		hillsFraction   0.809954
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207355
		craterFreq      0.248098
		craterDensity   0.989628
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   74.4702
		volcanoTemp     1767.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.190, 0.154, 0.000)
		colorShelf     (0.225, 0.195, 0.176, 0.000)
		colorBeach     (0.264, 0.229, 0.209, 0.000)
		colorDesert    (0.287, 0.246, 0.204, 0.000)
		colorLowland   (0.315, 0.262, 0.231, 0.000)
		colorUpland    (0.349, 0.318, 0.281, 0.000)
		colorRock      (0.377, 0.346, 0.303, 0.000)
		colorSnow      (0.411, 0.368, 0.320, 1.000)
		BumpHeight      14.8132
		BumpOffset      2.96264
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.762333
		GasToDust   0.25
		Particles   2519
		GasBright   0.316128
		DustBright  0.469913
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.5772
		Period          17.8293
		Eccentricity    0.943423
		Inclination     -91.3432
		AscendingNode   160.428
		ArgOfPericenter 71.4969
		MeanAnomaly     -32.4303
	}
}

Comet	"C110"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            3.69725e-017
	Radius          0.0462865
	InertiaMoment   0.398667

	Oblateness      0.0149694

	RotationPeriod  41.267
	Obliquity       58.2486
	EqAscendNode    190.052

	AbsMagn         16.0882
	SlopeParam      4.71646
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.506 0.381 0.319)

	Surface
	{
		SurfStyle       0.556045
		OceanStyle      0.931525
		Randomize      (0.562, -0.565, 0.082)
		colorDistMagn   0.837612
		colorDistFreq   1.35746e-006
		detailScale     1.26393
		colorConversion true
		snowLevel       2
		tropicLatitude  0.966369
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.670253
		terraceProb     0.208948
		erosion         0
		montesMagn      0.506968
		montesFreq      2.28813
		montesSpiky     0.967754
		montesFraction  0.419538
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.49524e-006
		hillsFraction   0.649804
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244777
		craterFreq      0.271996
		craterDensity   0.879162
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1193.5
		volcanoTemp     1566.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.129, 0.089, 0.000)
		colorShelf     (0.203, 0.133, 0.102, 0.000)
		colorBeach     (0.238, 0.156, 0.121, 0.000)
		colorDesert    (0.258, 0.167, 0.118, 0.000)
		colorLowland   (0.284, 0.179, 0.134, 0.000)
		colorUpland    (0.314, 0.217, 0.163, 0.000)
		colorRock      (0.339, 0.236, 0.176, 0.000)
		colorSnow      (0.370, 0.251, 0.185, 1.000)
		BumpHeight      0.0416579
		BumpOffset      0.00833157
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.217018
		DustBright  0.25351
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.70003
		Period          18.7555
		Eccentricity    0.958456
		Inclination     -24.2568
		AscendingNode   129.587
		ArgOfPericenter 18.824
		MeanAnomaly     153.808
	}
}

Comet	"C111"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.85956e-013
	Radius          1.01846
	InertiaMoment   0.396593

	Oblateness      0.0224249

	RotationPeriod  39.4162
	Obliquity       11.4543
	EqAscendNode    174.63

	AbsMagn         3.26343
	SlopeParam      3.70322
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.667 0.662 0.658)

	Surface
	{
		SurfStyle       0.407932
		OceanStyle      0.77672
		Randomize      (0.052, -0.641, -0.886)
		colorDistMagn   0.657498
		colorDistFreq   0.000783087
		detailScale     27.8107
		colorConversion true
		snowLevel       2
		tropicLatitude  0.51813
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.68213
		terraceProb     0.166993
		erosion         0
		montesMagn      0.417202
		montesFreq      3.0254
		montesSpiky     0.965758
		montesFraction  0.577074
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00302352
		hillsFraction   0.609839
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259898
		craterFreq      0.269471
		craterDensity   0.937883
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   298.607
		volcanoTemp     1386.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.265, 0.263, 0.000)
		colorShelf     (0.284, 0.282, 0.280, 0.000)
		colorBeach     (0.300, 0.298, 0.296, 0.000)
		colorDesert    (0.317, 0.315, 0.312, 0.000)
		colorLowland   (0.334, 0.331, 0.329, 0.000)
		colorUpland    (0.350, 0.348, 0.345, 0.000)
		colorRock      (0.367, 0.364, 0.362, 0.000)
		colorSnow      (0.384, 0.381, 0.378, 1.000)
		BumpHeight      0.916613
		BumpOffset      0.183323
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.313967
		GasToDust   0.25
		Particles   1614
		GasBright   0.0193564
		DustBright  0.935658
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.30546
		Period          15.8368
		Eccentricity    0.945169
		Inclination     -20.0219
		AscendingNode   164.59
		ArgOfPericenter 117.671
		MeanAnomaly     21.2557
	}
}

Comet	"C112"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            2.21166e-009
	Radius          18.0901
	InertiaMoment   0.399153

	Oblateness      0.0180833

	RotationPeriod  37.5425
	Obliquity       324.66
	EqAscendNode    159.207

	AbsMagn         5.30686
	SlopeParam      2.60099
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.733 0.705 0.667)

	Surface
	{
		SurfStyle       0.483048
		OceanStyle      0.99618
		Randomize      (-0.883, 0.028, 0.529)
		colorDistMagn   0.783935
		colorDistFreq   0.0868648
		detailScale     493.982
		colorConversion true
		snowLevel       2
		tropicLatitude  0.897183
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.588809
		terraceProb     0.141846
		erosion         0
		montesMagn      0.495136
		montesFreq      2.7596
		montesSpiky     0.841189
		montesFraction  0.686533
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.726755
		hillsFraction   0.36352
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201615
		craterFreq      0.257466
		craterDensity   0.903467
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   60.3099
		volcanoTemp     1604.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.282, 0.267, 0.000)
		colorShelf     (0.312, 0.300, 0.283, 0.000)
		colorBeach     (0.330, 0.317, 0.300, 0.000)
		colorDesert    (0.348, 0.335, 0.317, 0.000)
		colorLowland   (0.367, 0.353, 0.333, 0.000)
		colorUpland    (0.385, 0.370, 0.350, 0.000)
		colorRock      (0.403, 0.388, 0.367, 0.000)
		colorSnow      (0.422, 0.406, 0.383, 1.000)
		BumpHeight      16.2811
		BumpOffset      3.25623
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.795159
		GasToDust   0.25
		Particles   2586
		GasBright   0.050721
		DustBright  0.58878
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.50653
		Period          25.2105
		Eccentricity    0.952532
		Inclination     -47.3609
		AscendingNode   -74.8924
		ArgOfPericenter -63.9681
		MeanAnomaly     66.2182
	}
}

Comet	"C113"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            6.80988e-017
	Radius          0.0630233
	InertiaMoment   0.397726

	Oblateness      0.0274083

	RotationPeriod  35.64
	Obliquity       277.866
	EqAscendNode    143.785

	AbsMagn         6.80523
	SlopeParam      6.39624
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.410 0.405 0.400)

	Surface
	{
		SurfStyle       0.571832
		OceanStyle      0.200286
		Randomize      (0.842, 0.012, -0.389)
		colorDistMagn   0.0783994
		colorDistFreq   1.22624e-006
		detailScale     1.72096
		colorConversion true
		snowLevel       2
		tropicLatitude  0.9847
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.259607
		terraceProb     0.522339
		erosion         0
		montesMagn      0.514628
		montesFreq      3.60092
		montesSpiky     0.890284
		montesFraction  0.572039
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.15232e-006
		hillsFraction   0.529869
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251068
		craterFreq      0.267147
		craterDensity   0.762756
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1197.39
		volcanoTemp     1437.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.138, 0.112, 0.000)
		colorShelf     (0.164, 0.142, 0.128, 0.000)
		colorBeach     (0.193, 0.166, 0.152, 0.000)
		colorDesert    (0.209, 0.178, 0.148, 0.000)
		colorLowland   (0.230, 0.190, 0.168, 0.000)
		colorUpland    (0.254, 0.231, 0.204, 0.000)
		colorRock      (0.275, 0.251, 0.220, 0.000)
		colorSnow      (0.300, 0.267, 0.232, 1.000)
		BumpHeight      0.056721
		BumpOffset      0.0113442
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0448265
		DustBright  0.279161
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.57933
		Period          10.9164
		Eccentricity    0.962798
		Inclination     -30.6321
		AscendingNode   54.6513
		ArgOfPericenter -155.714
		MeanAnomaly     97.5277
	}
}

Comet	"C114"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            5.26696e-013
	Radius          1.12055
	InertiaMoment   0.399594

	Oblateness      0.0224308

	RotationPeriod  33.7022
	Obliquity       231.071
	EqAscendNode    128.362

	AbsMagn         8.14834
	SlopeParam      4.9672
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.636 0.428 0.354)

	Surface
	{
		SurfStyle       0.258018
		OceanStyle      0.625513
		Randomize      (0.785, -0.186, -0.653)
		colorDistMagn   0.152966
		colorDistFreq   0.000703633
		detailScale     30.5984
		colorConversion true
		snowLevel       2
		tropicLatitude  0.889012
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.260134
		terraceProb     0.128956
		erosion         0
		montesMagn      0.584969
		montesFreq      2.0413
		montesSpiky     0.877615
		montesFraction  0.698264
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00355717
		hillsFraction   0.500476
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227287
		craterFreq      0.195693
		craterDensity   0.803485
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   242.078
		volcanoTemp     1379.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.171, 0.141, 0.000)
		colorShelf     (0.270, 0.182, 0.150, 0.000)
		colorBeach     (0.286, 0.193, 0.159, 0.000)
		colorDesert    (0.302, 0.203, 0.168, 0.000)
		colorLowland   (0.318, 0.214, 0.177, 0.000)
		colorUpland    (0.334, 0.225, 0.186, 0.000)
		colorRock      (0.350, 0.235, 0.195, 0.000)
		colorSnow      (0.366, 0.246, 0.203, 1.000)
		BumpHeight      1.00849
		BumpOffset      0.201698
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.346793
		GasToDust   0.25
		Particles   1680
		GasBright   0.159596
		DustBright  0.648878
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.0982
		Period          21.863
		Eccentricity    0.972204
		Inclination     -12.054
		AscendingNode   -164.587
		ArgOfPericenter -143.173
		MeanAnomaly     51.3987
	}
}

Comet	"C115"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            4.07361e-009
	Radius          24.608
	InertiaMoment   0.398396

	Oblateness      0.0345152

	RotationPeriod  31.7222
	Obliquity       184.277
	EqAscendNode    112.94

	AbsMagn         9.50889
	SlopeParam      3.93365
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.582 0.441 0.360)

	Surface
	{
		SurfStyle       0.228773
		OceanStyle      0.0871287
		Randomize      (-0.455, 0.990, -0.621)
		colorDistMagn   0.275824
		colorDistFreq   0.384153
		detailScale     671.964
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972852
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.310082
		terraceProb     0.320714
		erosion         0
		montesMagn      0.253228
		montesFreq      3.93749
		montesSpiky     0.811827
		montesFraction  0.564452
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.60127
		hillsFraction   0.627828
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263154
		craterFreq      0.173445
		craterDensity   0.846452
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   60.4496
		volcanoTemp     1089.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.176, 0.144, 0.000)
		colorShelf     (0.247, 0.187, 0.153, 0.000)
		colorBeach     (0.262, 0.198, 0.162, 0.000)
		colorDesert    (0.277, 0.209, 0.171, 0.000)
		colorLowland   (0.291, 0.220, 0.180, 0.000)
		colorUpland    (0.306, 0.231, 0.189, 0.000)
		colorRock      (0.320, 0.242, 0.198, 0.000)
		colorSnow      (0.335, 0.253, 0.207, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.827985
		GasToDust   0.25
		Particles   2652
		GasBright   0.126419
		DustBright  0.366541
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.84496
		Period          19.8681
		Eccentricity    0.938308
		Inclination     80.1727
		AscendingNode   146.423
		ArgOfPericenter -83.1551
		MeanAnomaly     -52.5832
	}
}

Comet	"C116"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            1.2543e-016
	Radius          0.0694091
	InertiaMoment   0.394507

	Oblateness      0.0282966

	RotationPeriod  29.6916
	Obliquity       137.483
	EqAscendNode    97.5169

	AbsMagn         11.078
	SlopeParam      2.88076
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.687 0.575 0.527)

	Surface
	{
		SurfStyle       0.55375
		OceanStyle      0.48233
		Randomize      (-0.877, 0.615, -0.625)
		colorDistMagn   0.798613
		colorDistFreq   3.97382e-006
		detailScale     1.89533
		colorConversion true
		snowLevel       2
		tropicLatitude  0.706553
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.61193
		terraceProb     0.526754
		erosion         0
		montesMagn      0.393501
		montesFreq      2.79521
		montesSpiky     0.837152
		montesFraction  0.466023
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.14133e-006
		hillsFraction   0.729996
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245602
		craterFreq      0.248154
		craterDensity   0.890669
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   971.677
		volcanoTemp     1147.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.195, 0.148, 0.000)
		colorShelf     (0.275, 0.201, 0.169, 0.000)
		colorBeach     (0.323, 0.236, 0.200, 0.000)
		colorDesert    (0.350, 0.253, 0.195, 0.000)
		colorLowland   (0.385, 0.270, 0.221, 0.000)
		colorUpland    (0.426, 0.328, 0.269, 0.000)
		colorRock      (0.460, 0.356, 0.290, 0.000)
		colorSnow      (0.501, 0.379, 0.306, 1.000)
		BumpHeight      0.0624682
		BumpOffset      0.0124936
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.308379
		DustBright  0.669068
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.55527
		Period          10.764
		Eccentricity    0.903854
		Inclination     118.469
		AscendingNode   -126.853
		ArgOfPericenter -170.093
		MeanAnomaly     138.785
	}
}

Comet	"C117"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            9.70107e-013
	Radius          1.5229
	InertiaMoment   0.398921

	Oblateness      0.0454659

	RotationPeriod  27.6009
	Obliquity       90.6885
	EqAscendNode    82.0943

	AbsMagn         13.3978
	SlopeParam      6.95628
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.559 0.558 0.555)

	Surface
	{
		SurfStyle       0.581386
		OceanStyle      0.846642
		Randomize      (-0.907, 0.059, 0.873)
		colorDistMagn   0.676397
		colorDistFreq   0.000733421
		detailScale     41.5853
		colorConversion true
		snowLevel       2
		tropicLatitude  0.975363
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443219
		terraceProb     0.669187
		erosion         0
		montesMagn      0.456646
		montesFreq      2.53636
		montesSpiky     0.980776
		montesFraction  0.774752
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00651014
		hillsFraction   0.45016
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2314
		craterFreq      0.233484
		craterDensity   0.870873
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   242.419
		volcanoTemp     1522.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.190, 0.155, 0.000)
		colorShelf     (0.224, 0.195, 0.178, 0.000)
		colorBeach     (0.263, 0.229, 0.211, 0.000)
		colorDesert    (0.285, 0.245, 0.205, 0.000)
		colorLowland   (0.313, 0.262, 0.233, 0.000)
		colorUpland    (0.347, 0.318, 0.283, 0.000)
		colorRock      (0.375, 0.346, 0.305, 0.000)
		colorSnow      (0.408, 0.368, 0.322, 1.000)
		BumpHeight      1.37061
		BumpOffset      0.274122
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.379619
		GasToDust   0.25
		Particles   1746
		GasBright   0.247921
		DustBright  0.414014
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.49348
		Period          10.376
		Eccentricity    0.920568
		Inclination     -132.168
		AscendingNode   -73.3347
		ArgOfPericenter 21.9462
		MeanAnomaly     -140.045
	}
}

Comet	"C118"
{
	ParentBody     "Barnard's Star"
	Class	       "Asteroid"

	Mass            7.50308e-009
	Radius          27.127
	InertiaMoment   0.397275

	Oblateness      0.0388708

	RotationPeriod  25.4391
	Obliquity       43.8942
	EqAscendNode    66.6718

	AbsMagn         1.46549
	SlopeParam      5.23421
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.451 0.448 0.447)

	Surface
	{
		SurfStyle       0.483813
		OceanStyle      0.67084
		Randomize      (0.537, -0.872, -0.226)
		colorDistMagn   0.577478
		colorDistFreq   0.509492
		detailScale     740.749
		colorConversion true
		snowLevel       2
		tropicLatitude  0.540237
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.74672
		terraceProb     0.179173
		erosion         0
		montesMagn      0.455515
		montesFreq      2.6323
		montesSpiky     0.985944
		montesFraction  0.881545
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.59173
		hillsFraction   0.644736
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259701
		craterFreq      0.231151
		craterDensity   1.08143
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   49.1008
		volcanoTemp     1369.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.179, 0.179, 0.000)
		colorShelf     (0.192, 0.191, 0.190, 0.000)
		colorBeach     (0.203, 0.202, 0.201, 0.000)
		colorDesert    (0.214, 0.213, 0.212, 0.000)
		colorLowland   (0.226, 0.224, 0.223, 0.000)
		colorUpland    (0.237, 0.235, 0.234, 0.000)
		colorRock      (0.248, 0.247, 0.246, 0.000)
		colorSnow      (0.259, 0.258, 0.257, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.860811
		GasToDust   0.25
		Particles   2718
		GasBright   0.150203
		DustBright  0.196218
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.47747
		Period          17.0889
		Eccentricity    0.944053
		Inclination     163.768
		AscendingNode   -39.4653
		ArgOfPericenter 67.2921
		MeanAnomaly     84.76
	}
}

