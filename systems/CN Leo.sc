Star	"CN Leo"
{
	ParentBody     "CN Leo"
	Class	       "M6 V"
	Luminosity      0.001
	MassSol         0.09
	RadSol          0.159885
	Teff            3050

	Age             5.12681

	InertiaMoment   0.0651237

	RotationPeriod  26.1633
	Obliquity       14.2627
	EqAscendNode    149.701

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.464 0.160)

	Surface
	{
		Randomize      (0.921, 0.227, 0.912)
		colorDistMagn   0.553299
		colorDistFreq   13.1592
		detailScale     286218
		colorConversion true
		tropicLatitude  0.614
		icecapLatitude  1.076
		mareFreq        19.0051
		mareDensity     0.0104463
		erosion         1
		montesFreq      537
		dunesMagn       0.635001
		hillsMagn       0.03
		hillsFreq       850.728
		craterOctaves   0
		BumpHeight      319.266
		BumpOffset      319.266
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
		Height          1112.8
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
		Radius      594594
		Period      0.020101
		Brightness  0.5
		RayDensity  2.53797
		RayCurv     8.81125
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     14.2627
		AscendingNode   149.701
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter	"1-1.1"
{
	ParentBody     "CN Leo"
	Mass            4.16185
	Radius          1856.83
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
		SemiMajorAxis   0.0168852
		Period          0.00731327
		Eccentricity    0.0960016
		Inclination     1.0841
		AscendingNode   -138.935
		ArgOfPericenter 350.485
		MeanAnomaly     52.3569
	}
}

Planet	"1"
{
	ParentBody     "1-1.1"
	Class	       "Desert"

	Mass            3.90692
	Radius          8142.11
	InertiaMoment   0.331475

	Oblateness      0.00807435

	Obliquity       0.703025
	EqAscendNode    179.819
	TidalLocked     true

	AlbedoBond      0.7
	AlbedoGeom      0.84
	Brightness      2
	Color          (0.654 0.602 0.537)

	Surface
	{
		SurfStyle       0.653663
		OceanStyle      0.647109
		Randomize      (0.895, 0.086, 0.124)
		colorDistMagn   0.0460699
		colorDistFreq   917.581
		detailScale     20942
		colorConversion true
		seaLevel        0.112811
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  10
		icecapHeight    0.235043
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.959532
		venusFreq       1.43785
		venusMagn       0.417199
		mareFreq        1.43309
		mareDensity     0.200296
		terraceProb     0.157349
		erosion         0
		montesMagn      0.187603
		montesFreq      349.703
		montesSpiky     0.975136
		montesFraction  0.576428
		dunesMagn       0.0444868
		dunesFreq       89.6733
		dunesFraction   0.504963
		hillsMagn       0.102735
		hillsFreq       646.962
		hillsFraction   0
		hills2Fraction  0
		riversMagn      52.6652
		riversFreq      2.82921
		riversSin       6.50216
		riversOctaves   0
		canyonsMagn     0.0371159
		canyonsFreq     199.078
		canyonFraction  0
		cracksMagn      0.0818012
		cracksFreq      0.586075
		cracksOctaves   0
		craterMagn      0.861642
		craterFreq      23.4132
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.708405
		volcanoFreq     2.89926
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.492959
		volcanoRadius   0.241605
		volcanoTemp     1583.14
		lavaCoverTidal  0.611799
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      1.84554
		twistMagn       0
		cycloneMagn     2.46669
		cycloneFreq     0.363267
		cycloneDensity  0.0103691
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
		BumpHeight      12.9168
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
		Height          23.6377
		BumpHeight      5.96124
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.922504
		mainOctaves     10
		Coverage        1
		twistZones      1.84554
		twistMagn       0
	}

	Clouds
	{
		Height          40.8169
		BumpHeight      6.48682
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.922504
		mainOctaves     10
		Coverage        1
		twistZones      1.84554
		twistMagn       0
	}

	Clouds
	{
		Height          57.9966
		BumpHeight      5.78116
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.922504
		mainOctaves     10
		Coverage        1
		twistZones      1.84554
		twistMagn       0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          220.192
		Density         765.053
		Pressure        2310.61
		Greenhouse      529.809
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0668233
		Saturation      0.633647

		Composition
		{
			H2O   	60.4491
			CO2   	38.6608
			SO2   	0.782729
			N2    	0.107346
			CO    	5.32356e-005
			He    	2.0431e-005
			Ar    	1.67634e-005
		}
	}

	Aurora
	{
		Height      148.07
		NorthLat    65.1654
		NorthLon    84.0818
		NorthRadius 2545.41
		NorthWidth  2815.74
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -74.6677
		SouthLon    257.073
		SouthRadius 1738.87
		SouthWidth  1803.18
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
		SemiMajorAxis   1.67692e-005
		Period          0.0012841
		Eccentricity    0.0340523
		Inclination     0.703025
		AscendingNode   179.819
		ArgOfPericenter 42.0182
		MeanAnomaly     -43.6022
	}
}

Moon	"1.1"
{
	ParentBody     "1-1.1"
	Class	       "Desert"

	Mass            0.254932
	Radius          3623.96
	InertiaMoment   0.332479

	Oblateness      0.0109509

	Obliquity       0.703025
	EqAscendNode    179.819
	TidalLocked     true

	AlbedoBond      0.383128
	AlbedoGeom      0.459754
	Brightness      2
	Color          (0.619 0.616 0.614)

	Surface
	{
		SurfStyle       0.711505
		OceanStyle      0.838106
		Randomize      (-0.274, 0.872, 0.636)
		colorDistMagn   0.0645626
		colorDistFreq   540.13
		detailScale     9321.03
		colorConversion true
		seaLevel        0.136571
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  10
		icecapHeight    0.158831
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.587073
		venusFreq       0.425933
		venusMagn       0.508553
		mareFreq        0.87516
		mareDensity     0.124775
		terraceProb     0.346934
		erosion         0
		montesMagn      0.251767
		montesFreq      222.498
		montesSpiky     0.829555
		montesFraction  0.569075
		dunesMagn       0.0240458
		dunesFreq       29.5954
		dunesFraction   0.492623
		hillsMagn       0.139236
		hillsFreq       434.583
		hillsFraction   0
		hills2Fraction  0
		riversMagn      59.9645
		riversFreq      3.79324
		riversSin       6.0113
		riversOctaves   0
		canyonsMagn     0.0482089
		canyonsFreq     92.0572
		canyonFraction  0
		cracksMagn      0.135779
		cracksFreq      0.231663
		cracksOctaves   0
		craterMagn      0.594079
		craterFreq      9.47861
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.674715
		volcanoFreq     3.75848
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.774088
		volcanoRadius   0.352459
		volcanoTemp     1458.53
		lavaCoverTidal  0.778857
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      2.66425
		twistMagn       0
		cycloneMagn     2.38809
		cycloneFreq     0.399222
		cycloneDensity  0.0107389
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
		Height          12.0513
		BumpHeight      5.89635
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.04093
		mainOctaves     10
		Coverage        0.366257
		twistZones      2.66425
		twistMagn       0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          181.198
		Density         0.562743
		Pressure        2.14529
		Greenhouse      103.084
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0450977
		Saturation      1

		Composition
		{
			H2O   	70.1947
			CO2   	20.82
			SO2   	8.91998
			N2    	0.0640661
			CO    	0.000903117
			Ne    	0.00028186
			Ar    	4.76184e-005
			Kr    	2.01368e-005
		}
	}

	Aurora
	{
		Height      54.2435
		NorthLat    57.9159
		NorthLon    -129.518
		NorthRadius 1015.61
		NorthWidth  949.503
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -41.7696
		SouthLon    14.13
		SouthRadius 729.249
		SouthWidth  883.997
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
		SemiMajorAxis   0.000256994
		Period          0.0012841
		Eccentricity    0.0340523
		Inclination     0.703025
		AscendingNode   179.819
		ArgOfPericenter -137.982
		MeanAnomaly     -43.6022
	}
}

Planet	"2"
{
	ParentBody     "CN Leo"
	Class	       "IceGiant"

	Mass            19.724
	Radius          22739.2
	InertiaMoment   0.291001

	RotationPeriod  206.634
	Obliquity       -1.52903
	EqAscendNode    -86.8954

	AlbedoBond      0.42229
	AlbedoGeom      0.506747
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.274753
		Randomize      (0.210, -0.691, 0.823)
		detailScale     58486.6
		colorConversion true
		tropicLatitude  0.0387365
		icecapLatitude  0.938736
		mainFreq        0.0607723
		venusFreq       3.48436
		venusMagn       0.34841
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.229146
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      4.9625
		twistMagn       1.42459
		cycloneMagn     5.44594
		cycloneFreq     0.306595
		cycloneDensity  0.0703838
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
		BumpHeight      16.0552
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          58.3223
		BumpHeight      65.4818
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.913729
		mainOctaves     10
		Coverage        0.111448
		twistZones      4.9625
		twistMagn       1.42459
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          227.392
		Density         1211.79
		Pressure        223170
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0147135
		Saturation      0.971573

		Composition
		{
			H2    	91.9957
			He    	7.61835
			CH4   	0.309223
			N2    	0.0345009
			NH3   	0.0285739
			O2    	0.00696168
			C2H2  	0.00295221
			C2H4  	0.00116443
			Ne    	0.000932182
			Ar    	0.000721999
			C2H6  	0.000599524
			C3H8  	0.000314014
		}
	}

	Aurora
	{
		Height      305.857
		NorthLat    46.9199
		NorthLon    -170.568
		NorthRadius 7637.33
		NorthWidth  7228.54
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -34.8398
		SouthLon    -4.26698
		SouthRadius 5341.79
		SouthWidth  6539.98
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
		SemiMajorAxis   0.0304131
		Period          0.0176737
		Eccentricity    0.0544516
		Inclination     -1.52903
		AscendingNode   -86.8954
		ArgOfPericenter 226.049
		MeanAnomaly     224.481
	}
}

DwarfMoon	"2.D1"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            4.73317e-010
	Radius          6.58027
	InertiaMoment   0.399082

	Oblateness      0.249

	Obliquity       -0.011825
	EqAscendNode    -141.899
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.767 0.763 0.761)

	Surface
	{
		SurfStyle       0.810537
		OceanStyle      0.574376
		Randomize      (-0.064, 0.125, 0.222)
		colorDistMagn   0.500287
		colorDistFreq   0.00661191
		detailScale     179.685
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.386222
		terraceProb     0.148736
		erosion         0
		montesMagn      0.542831
		montesFreq      2.81975
		montesSpiky     0.912227
		montesFraction  0.448192
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.103125
		hillsFraction   0.329718
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246821
		craterFreq      0.220628
		craterDensity   0.802677
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.4213
		volcanoTemp     1436.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.259, 0.213, 0.000)
		colorShelf     (0.307, 0.267, 0.244, 0.000)
		colorBeach     (0.360, 0.313, 0.289, 0.000)
		colorDesert    (0.391, 0.336, 0.282, 0.000)
		colorLowland   (0.429, 0.359, 0.320, 0.000)
		colorUpland    (0.475, 0.435, 0.388, 0.000)
		colorRock      (0.514, 0.473, 0.419, 0.000)
		colorSnow      (0.560, 0.503, 0.441, 1.000)
		BumpHeight      5.92224
		BumpOffset      1.18445
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000239577
		Period          0.000482892
		Eccentricity    7.40478e-005
		Inclination     -0.011825
		AscendingNode   -141.899
		ArgOfPericenter -161.433
		MeanAnomaly     75.4677
	}
}

DwarfMoon	"2.D2"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            6.98317e-010
	Radius          12.6701
	InertiaMoment   0.399991

	Oblateness      0.249

	Obliquity       -0.0149094
	EqAscendNode    -3.26677
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.840 0.771 0.748)

	Surface
	{
		SurfStyle       0.472197
		OceanStyle      0.552473
		Randomize      (0.320, -0.705, -0.296)
		colorDistMagn   0.898104
		colorDistFreq   0.00726257
		detailScale     345.978
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.316709
		terraceProb     0.410755
		erosion         0
		montesMagn      0.462126
		montesFreq      3.33335
		montesSpiky     0.963145
		montesFraction  0.807604
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.36816
		hillsFraction   0.700313
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.19915
		craterFreq      0.194283
		craterDensity   0.93692
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   75.1726
		volcanoTemp     1442.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.336, 0.309, 0.299, 0.000)
		colorShelf     (0.357, 0.328, 0.318, 0.000)
		colorBeach     (0.378, 0.347, 0.337, 0.000)
		colorDesert    (0.399, 0.366, 0.355, 0.000)
		colorLowland   (0.420, 0.386, 0.374, 0.000)
		colorUpland    (0.441, 0.405, 0.393, 0.000)
		colorRock      (0.462, 0.424, 0.412, 0.000)
		colorSnow      (0.483, 0.444, 0.430, 1.000)
		BumpHeight      11.4031
		BumpOffset      2.28062
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000364462
		Period          0.000906069
		Eccentricity    9.8781e-005
		Inclination     -0.0149094
		AscendingNode   -3.26677
		ArgOfPericenter 106.246
		MeanAnomaly     -93.5075
	}
}

DwarfMoon	"2.D3"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            1.01323e-009
	Radius          7.4216
	InertiaMoment   0.398116

	Oblateness      0.054978

	Obliquity       -2.77204e-005
	EqAscendNode    72.1834
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.416 0.414 0.411)

	Surface
	{
		SurfStyle       0.609671
		OceanStyle      0.960308
		Randomize      (-0.244, 0.653, 0.884)
		colorDistMagn   0.542307
		colorDistFreq   0.037188
		detailScale     202.659
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.751418
		terraceProb     0.299437
		erosion         0
		montesMagn      0.579774
		montesFreq      2.91644
		montesSpiky     0.873958
		montesFraction  0.869572
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.14166
		hillsFraction   0.648833
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258651
		craterFreq      0.213059
		craterDensity   0.880798
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   36.5551
		volcanoTemp     1486.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.141, 0.115, 0.000)
		colorShelf     (0.166, 0.145, 0.132, 0.000)
		colorBeach     (0.196, 0.170, 0.156, 0.000)
		colorDesert    (0.212, 0.182, 0.152, 0.000)
		colorLowland   (0.233, 0.195, 0.173, 0.000)
		colorUpland    (0.258, 0.236, 0.210, 0.000)
		colorRock      (0.279, 0.257, 0.226, 0.000)
		colorSnow      (0.304, 0.273, 0.238, 1.000)
		BumpHeight      6.67944
		BumpOffset      1.33589
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000376609
		Period          0.000951742
		Eccentricity    6.94731e-005
		Inclination     -2.77204e-005
		AscendingNode   72.1834
		ArgOfPericenter 21.8044
		MeanAnomaly     159.87
	}
}

DwarfMoon	"2.D4"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            1.44992e-009
	Radius          14.6596
	InertiaMoment   0.399219

	Oblateness      0.238752

	Obliquity       -0.006622
	EqAscendNode    -139.725
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.463 0.461 0.457)

	Surface
	{
		SurfStyle       0.884141
		OceanStyle      0.191806
		Randomize      (0.099, -0.528, 0.736)
		colorDistMagn   0.402583
		colorDistFreq   0.190128
		detailScale     400.306
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436625
		terraceProb     0.520887
		erosion         0
		montesMagn      0.396164
		montesFreq      2.89825
		montesSpiky     0.803822
		montesFraction  0.39895
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.293169
		hillsFraction   0.715132
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223372
		craterFreq      0.24595
		craterDensity   0.849905
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   60.361
		volcanoTemp     1263.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.157, 0.161, 0.183, 0.050)
		colorShelf     (0.185, 0.189, 0.210, 0.040)
		colorBeach     (0.213, 0.217, 0.237, 0.030)
		colorDesert    (0.241, 0.244, 0.269, 0.020)
		colorLowland   (0.269, 0.272, 0.297, 0.030)
		colorUpland    (0.296, 0.300, 0.324, 0.050)
		colorRock      (0.324, 0.327, 0.361, 0.020)
		colorSnow      (0.324, 0.327, 0.361, 1.000)
		BumpHeight      13.1937
		BumpOffset      2.63873
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000405182
		Period          0.00106208
		Eccentricity    4.15352e-005
		Inclination     -0.006622
		AscendingNode   -139.725
		ArgOfPericenter 101.25
		MeanAnomaly     135.144
	}
}

DwarfMoon	"2.D5"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            2.05095e-009
	Radius          10.8808
	InertiaMoment   0.396011

	Oblateness      0.0551606

	Obliquity       -0.00626844
	EqAscendNode    104.425
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.440 0.437 0.433)

	Surface
	{
		SurfStyle       0.647411
		OceanStyle      0.699846
		Randomize      (0.559, 0.250, 0.700)
		colorDistMagn   0.375698
		colorDistFreq   0.0366931
		detailScale     297.119
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.577956
		terraceProb     0.190379
		erosion         0
		montesMagn      0.374759
		montesFreq      2.84618
		montesSpiky     0.973757
		montesFraction  0.54942
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.224856
		hillsFraction   0.451128
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232719
		craterFreq      0.253373
		craterDensity   0.724218
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.6695
		volcanoTemp     1602.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.149, 0.121, 0.000)
		colorShelf     (0.176, 0.153, 0.139, 0.000)
		colorBeach     (0.207, 0.179, 0.164, 0.000)
		colorDesert    (0.224, 0.192, 0.160, 0.000)
		colorLowland   (0.246, 0.205, 0.182, 0.000)
		colorUpland    (0.273, 0.249, 0.221, 0.000)
		colorRock      (0.295, 0.271, 0.238, 0.000)
		colorSnow      (0.321, 0.288, 0.251, 1.000)
		BumpHeight      9.79273
		BumpOffset      1.95855
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000434861
		Period          0.00118089
		Eccentricity    6.51848e-005
		Inclination     -0.00626844
		AscendingNode   104.425
		ArgOfPericenter -145.959
		MeanAnomaly     27.2085
	}
}

DwarfMoon	"2.D6"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            2.87322e-009
	Radius          11.2459
	InertiaMoment   0.398303

	Oblateness      0.0418764

	Obliquity       0.00974561
	EqAscendNode    120.997
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.770 0.766 0.764)

	Surface
	{
		SurfStyle       0.103981
		OceanStyle      0.857536
		Randomize      (-0.340, 0.118, -0.751)
		colorDistMagn   0.433589
		colorDistFreq   0.0649038
		detailScale     307.088
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552354
		terraceProb     0.629053
		erosion         0
		montesMagn      0.550349
		montesFreq      3.73832
		montesSpiky     0.825784
		montesFraction  0.370272
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.413747
		hillsFraction   0.452908
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247667
		craterFreq      0.214438
		craterDensity   0.791523
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.894
		volcanoTemp     1769.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.308, 0.306, 0.306, 0.000)
		colorShelf     (0.327, 0.325, 0.325, 0.000)
		colorBeach     (0.347, 0.345, 0.344, 0.000)
		colorDesert    (0.366, 0.364, 0.363, 0.000)
		colorLowland   (0.385, 0.383, 0.382, 0.000)
		colorUpland    (0.404, 0.402, 0.401, 0.000)
		colorRock      (0.424, 0.421, 0.420, 0.000)
		colorSnow      (0.443, 0.440, 0.439, 1.000)
		BumpHeight      10.1213
		BumpOffset      2.02426
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00044158
		Period          0.00120836
		Eccentricity    9.80004e-005
		Inclination     0.00974561
		AscendingNode   120.997
		ArgOfPericenter -144.635
		MeanAnomaly     -38.6086
	}
}

Moon	"2.1"
{
	ParentBody     "2"
	Class	       "Selena"

	Mass            0.000459507
	Radius          462.561
	InertiaMoment   0.399688

	Oblateness      0.017032

	Obliquity       0.544299
	EqAscendNode    -169.704
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.500 0.492 0.487)

	Surface
	{
		SurfStyle       0.526186
		OceanStyle      0.210323
		Randomize      (-0.506, -0.099, -0.994)
		colorDistMagn   0.0455423
		colorDistFreq   56.0425
		detailScale     1189.73
		colorConversion true
		drivenDarkening 0
		seaLevel        0.16605
		snowLevel       2
		tropicLatitude  0.00169146
		icecapLatitude  10
		icecapHeight    0.139143
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.72431
		venusFreq       0.804961
		venusMagn       0
		mareFreq        0
		mareDensity     0.00103031
		terraceProb     0.164718
		erosion         0
		montesMagn      0.0713477
		montesFreq      21.9458
		montesSpiky     0.802064
		montesFraction  0.172755
		dunesMagn       0.0374558
		dunesFreq       609.443
		dunesFraction   0.901508
		hillsMagn       0.147243
		hillsFreq       55.6516
		hillsFraction   0.57465
		hills2Fraction  0
		riversMagn      65.4407
		riversFreq      2.62141
		riversSin       5.30407
		riversOctaves   0
		canyonsMagn     0.4972
		canyonsFreq     0.171759
		canyonFraction  0.84486
		cracksMagn      0.0457041
		cracksFreq      0.251533
		cracksOctaves   0
		craterMagn      0.66784
		craterFreq      1.06322
		craterDensity   0.864559
		craterOctaves   8.42022
		craterRayedFactor 0.432745
		volcanoMagn     0.222527
		volcanoFreq     2.51677
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.232923
		volcanoRadius   0.709563
		volcanoTemp     1323.16
		lavaCoverTidal  0.0715778
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.310, 0.300, 0.263, 0.000)
		colorDesert    (0.325, 0.305, 0.268, 0.000)
		colorLowland   (0.255, 0.226, 0.205, 0.000)
		colorUpland    (0.375, 0.349, 0.302, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
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
		SemiMajorAxis   0.000452409
		Period          0.00125307
		Eccentricity    0.00854129
		Inclination     0.544299
		AscendingNode   -169.704
		ArgOfPericenter -105.459
		MeanAnomaly     33.2812
	}
}

DwarfMoon	"2.D7"
{
	ParentBody     "2"
	Class	       "Asteroid"

	Mass            5.51231e-009
	Radius          12.2862
	InertiaMoment   0.39667

	Oblateness      0.00274003

	RotationPeriod  34.0343
	Obliquity       40.8548
	EqAscendNode    -30.9662

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.741 0.691 0.665)

	Surface
	{
		SurfStyle       0.437078
		OceanStyle      0.746119
		Randomize      (-0.389, -0.970, -0.602)
		colorDistMagn   0.661218
		colorDistFreq   0.0649054
		detailScale     335.494
		colorConversion true
		snowLevel       2
		tropicLatitude  0.978724
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.32123
		terraceProb     0.131432
		erosion         0
		montesMagn      0.491349
		montesFreq      3.02719
		montesSpiky     0.969096
		montesFraction  0.720227
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.30005
		hillsFraction   0.522797
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235561
		craterFreq      0.165622
		craterDensity   0.869343
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.9451
		volcanoTemp     1651.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.277, 0.266, 0.000)
		colorShelf     (0.315, 0.294, 0.282, 0.000)
		colorBeach     (0.334, 0.311, 0.299, 0.000)
		colorDesert    (0.352, 0.328, 0.316, 0.000)
		colorLowland   (0.371, 0.346, 0.332, 0.000)
		colorUpland    (0.389, 0.363, 0.349, 0.000)
		colorRock      (0.408, 0.380, 0.366, 0.000)
		colorSnow      (0.426, 0.398, 0.382, 1.000)
		BumpHeight      11.0575
		BumpOffset      2.21151
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00068401
		Period          0.00232957
		Eccentricity    0.288088
		Inclination     40.8548
		AscendingNode   -30.9662
		ArgOfPericenter -97.5195
		MeanAnomaly     128.374
	}
}

Planet	"3"
{
	ParentBody     "CN Leo"
	Class	       "IceGiant"

	Mass            19.4111
	Radius          22239.9
	InertiaMoment   0.200942

	Obliquity       -0.825319
	EqAscendNode    133.514
	TidalLocked     true

	AlbedoBond      0.515126
	AlbedoGeom      0.618151
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.375253
		Randomize      (0.228, -0.223, 0.353)
		detailScale     57202.3
		colorConversion true
		tropicLatitude  0.0113674
		icecapLatitude  0.911367
		mainFreq        0.0286718
		venusFreq       5.29855
		venusMagn       0.477018
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      7.69533
		twistMagn       0.805363
		cycloneMagn     12.3092
		cycloneFreq     0.373681
		cycloneDensity  0.121395
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
		BumpHeight      15.8286
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          36.4863
		BumpHeight      57.8238
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.02335
		mainOctaves     10
		Coverage        0.575631
		twistZones      7.69533
		twistMagn       0.805363
	}

	Clouds
	{
		Height          57.1426
		BumpHeight      66.0123
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.02335
		mainOctaves     10
		Coverage        0.575631
		twistZones      7.69533
		twistMagn       0.805363
	}

	Clouds
	{
		Height          77.7988
		BumpHeight      54.7294
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.02335
		mainOctaves     10
		Coverage        0.575631
		twistZones      7.69533
		twistMagn       0.805363
	}

	Clouds
	{
		Height          98.457
		BumpHeight      69.2382
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.02335
		mainOctaves     10
		Coverage        0.575631
		twistZones      7.69533
		twistMagn       0.805363
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          222.399
		Density         1285.03
		Pressure        236868
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0109345
		Saturation      0.74008

		Composition
		{
			H2    	92.1423
			He    	7.47185
			CH4   	0.299628
			N2    	0.0394671
			NH3   	0.0306964
			O2    	0.00806986
			C2H2  	0.00361256
			C2H4  	0.00139363
			Ne    	0.00109249
			Ar    	0.000956941
			C2H6  	0.000571982
			C3H8  	0.000337794
		}
	}

	Aurora
	{
		Height      172.744
		NorthLat    64.1739
		NorthLon    -112.806
		NorthRadius 5929.52
		NorthWidth  6278.31
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -90
		SouthLon    47.8916
		SouthRadius 6711.11
		SouthWidth  4580.53
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
		SemiMajorAxis   0.0482698
		Period          0.0353388
		Eccentricity    0.0108169
		Inclination     -0.825319
		AscendingNode   133.514
		ArgOfPericenter 349.307
		MeanAnomaly     245.536
	}
}

DwarfMoon	"3.D1"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.05523e-007
	Radius          82.9437
	InertiaMoment   0.399708

	Oblateness      0.249

	Obliquity       -0.00569471
	EqAscendNode    -179.374
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.559 0.556 0.552)

	Surface
	{
		SurfStyle       0.404918
		OceanStyle      0.62791
		Randomize      (-0.048, -0.293, 0.294)
		colorDistMagn   0.100323
		colorDistFreq   5.6658
		detailScale     2264.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.650813
		terraceProb     0.230912
		erosion         0
		montesMagn      0.437703
		montesFreq      3.00962
		montesSpiky     0.932404
		montesFraction  0.345574
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.2879
		hillsFraction   0.773219
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243219
		craterFreq      0.201268
		craterDensity   0.741973
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   40.0327
		volcanoTemp     1133.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.222, 0.221, 0.000)
		colorShelf     (0.237, 0.236, 0.235, 0.000)
		colorBeach     (0.251, 0.250, 0.249, 0.000)
		colorDesert    (0.265, 0.264, 0.262, 0.000)
		colorLowland   (0.279, 0.278, 0.276, 0.000)
		colorUpland    (0.293, 0.292, 0.290, 0.000)
		colorRock      (0.307, 0.306, 0.304, 0.000)
		colorSnow      (0.321, 0.320, 0.318, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000408088
		Period          0.00108214
		Eccentricity    3.35832e-005
		Inclination     -0.00569471
		AscendingNode   -179.374
		ArgOfPericenter -74.8601
		MeanAnomaly     17.1298
	}
}

DwarfMoon	"3.D2"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.44433e-007
	Radius          43.7658
	InertiaMoment   0.397619

	Oblateness      0.0545301

	Obliquity       -0.00449487
	EqAscendNode    99.7527
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.683 0.549 0.445)

	Surface
	{
		SurfStyle       0.712695
		OceanStyle      0.584342
		Randomize      (0.794, 0.962, -0.053)
		colorDistMagn   0.958944
		colorDistFreq   0.872785
		detailScale     1195.1
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57773
		terraceProb     0.239822
		erosion         0
		montesMagn      0.305521
		montesFreq      3.43204
		montesSpiky     0.880498
		montesFraction  0.349019
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.80638
		hillsFraction   0.572276
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23951
		craterFreq      0.187156
		craterDensity   1.01305
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   18.0554
		volcanoTemp     1534.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.187, 0.125, 0.000)
		colorShelf     (0.273, 0.192, 0.142, 0.000)
		colorBeach     (0.321, 0.225, 0.169, 0.000)
		colorDesert    (0.348, 0.241, 0.165, 0.000)
		colorLowland   (0.383, 0.258, 0.187, 0.000)
		colorUpland    (0.424, 0.313, 0.227, 0.000)
		colorRock      (0.458, 0.340, 0.245, 0.000)
		colorSnow      (0.499, 0.362, 0.258, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000423781
		Period          0.00114516
		Eccentricity    5.4698e-005
		Inclination     -0.00449487
		AscendingNode   99.7527
		ArgOfPericenter 6.0826
		MeanAnomaly     -58.9107
	}
}

DwarfMoon	"3.D3"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            1.986e-007
	Radius          82.8641
	InertiaMoment   0.398905

	Oblateness      0.221405

	Obliquity       0.00668283
	EqAscendNode    56.4083
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.590 0.585 0.578)

	Surface
	{
		SurfStyle       0.674582
		OceanStyle      0.245203
		Randomize      (0.376, 0.141, 0.032)
		colorDistMagn   0.352454
		colorDistFreq   5.01222
		detailScale     2262.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.365455
		terraceProb     0.323344
		erosion         0
		montesMagn      0.596208
		montesFreq      2.56525
		montesSpiky     0.939852
		montesFraction  0.702338
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.9371
		hillsFraction   0.76514
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235457
		craterFreq      0.236764
		craterDensity   0.908497
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.153
		volcanoTemp     1524.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.199, 0.162, 0.000)
		colorShelf     (0.236, 0.205, 0.185, 0.000)
		colorBeach     (0.277, 0.240, 0.220, 0.000)
		colorDesert    (0.301, 0.257, 0.214, 0.000)
		colorLowland   (0.330, 0.275, 0.243, 0.000)
		colorUpland    (0.366, 0.333, 0.295, 0.000)
		colorRock      (0.395, 0.363, 0.318, 0.000)
		colorSnow      (0.430, 0.386, 0.335, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00045302
		Period          0.0012657
		Eccentricity    8.38128e-005
		Inclination     0.00668283
		AscendingNode   56.4083
		ArgOfPericenter 122.126
		MeanAnomaly     24.7011
	}
}

DwarfMoon	"3.D4"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            2.74649e-007
	Radius          47.6404
	InertiaMoment   0.399834

	RotationPeriod  79.6409
	Obliquity       -79.0694
	EqAscendNode    -58.6707

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.696 0.695 0.692)

	Surface
	{
		SurfStyle       0.65639
		OceanStyle      0.308736
		Randomize      (-0.554, -0.580, -0.107)
		colorDistMagn   0.806158
		colorDistFreq   1.17248
		detailScale     1300.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0.885151
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399108
		terraceProb     0.315703
		erosion         0
		montesMagn      0.507032
		montesFreq      3.51809
		montesSpiky     0.961119
		montesFraction  0.563378
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.97893
		hillsFraction   0.792139
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.273788
		craterFreq      0.20388
		craterDensity   0.824667
		craterOctaves   14
		volcanoActivity 0.721295
		volcanoFlows    0
		volcanoRadius   14.2525
		volcanoTemp     1205.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.236, 0.194, 0.000)
		colorShelf     (0.278, 0.243, 0.222, 0.000)
		colorBeach     (0.327, 0.285, 0.263, 0.000)
		colorDesert    (0.355, 0.306, 0.256, 0.000)
		colorLowland   (0.390, 0.327, 0.291, 0.000)
		colorUpland    (0.432, 0.396, 0.353, 0.000)
		colorRock      (0.466, 0.431, 0.381, 0.000)
		colorSnow      (0.508, 0.459, 0.402, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00066899
		Period          0.00227135
		Eccentricity    0.276688
		Inclination     -79.0694
		AscendingNode   -58.6707
		ArgOfPericenter 116.815
		MeanAnomaly     -178.728
	}
}

DwarfMoon	"3.D5"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            3.82492e-007
	Radius          92.3109
	InertiaMoment   0.397856

	Oblateness      0.00172101

	RotationPeriod  106.409
	Obliquity       80.1999
	EqAscendNode    -128.962

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.450 0.444 0.437)

	Surface
	{
		SurfStyle       0.830715
		OceanStyle      0.294951
		Randomize      (-0.834, -0.746, 0.136)
		colorDistMagn   0.643974
		colorDistFreq   4.44832
		detailScale     2520.7
		colorConversion true
		snowLevel       2
		tropicLatitude  0.768739
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.644099
		terraceProb     0.694156
		erosion         0
		montesMagn      0.51404
		montesFreq      2.93947
		montesSpiky     0.925424
		montesFraction  0.626178
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.7622
		hillsFraction   0.870055
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232179
		craterFreq      0.355788
		craterDensity   0.930243
		craterOctaves   15
		volcanoActivity 0.367697
		volcanoFlows    0
		volcanoRadius   23.4017
		volcanoTemp     1608.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.151, 0.122, 0.000)
		colorShelf     (0.180, 0.156, 0.140, 0.000)
		colorBeach     (0.211, 0.182, 0.166, 0.000)
		colorDesert    (0.229, 0.196, 0.162, 0.000)
		colorLowland   (0.252, 0.209, 0.184, 0.000)
		colorUpland    (0.279, 0.253, 0.223, 0.000)
		colorRock      (0.301, 0.276, 0.240, 0.000)
		colorSnow      (0.328, 0.293, 0.253, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000983122
		Period          0.00404637
		Eccentricity    0.107039
		Inclination     80.1999
		AscendingNode   -128.962
		ArgOfPericenter -103.866
		MeanAnomaly     -52.374
	}
}

DwarfMoon	"3.D6"
{
	ParentBody     "3"
	Class	       "Asteroid"

	Mass            5.37212e-007
	Radius          68.688
	InertiaMoment   0.399047

	Obliquity       -32.1384
	EqAscendNode    -10.4675
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.550 0.414 0.321)

	Surface
	{
		SurfStyle       0.0168676
		OceanStyle      0.803396
		Randomize      (-0.370, 0.899, 0.772)
		colorDistMagn   0.566949
		colorDistFreq   2.76252
		detailScale     1875.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.898617
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615323
		terraceProb     0.456954
		erosion         0
		montesMagn      0.40696
		montesFreq      2.75597
		montesSpiky     0.927339
		montesFraction  0.632565
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.3366
		hillsFraction   0.620499
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209065
		craterFreq      0.274516
		craterDensity   0.96018
		craterOctaves   14
		volcanoActivity 0.128711
		volcanoFlows    0
		volcanoRadius   14.6931
		volcanoTemp     992.874
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.166, 0.128, 0.000)
		colorShelf     (0.234, 0.176, 0.136, 0.000)
		colorBeach     (0.247, 0.186, 0.144, 0.000)
		colorDesert    (0.261, 0.197, 0.152, 0.000)
		colorLowland   (0.275, 0.207, 0.160, 0.000)
		colorUpland    (0.289, 0.217, 0.168, 0.000)
		colorRock      (0.302, 0.228, 0.176, 0.000)
		colorSnow      (0.316, 0.238, 0.184, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00138684
		Period          0.00677942
		Eccentricity    0.375973
		Inclination     -32.1384
		AscendingNode   -10.4675
		ArgOfPericenter 176.822
		MeanAnomaly     -89.7466
	}
}

Planet	"4"
{
	ParentBody     "CN Leo"
	Class	       "Desert"

	Mass            0.0401683
	Radius          2569.98
	InertiaMoment   0.348005

	Obliquity       -1.21468
	EqAscendNode    29.1183
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.644 0.641 0.635)

	Surface
	{
		SurfStyle       0.58584
		OceanStyle      0.913699
		Randomize      (-0.400, -0.804, 0.261)
		colorDistMagn   0.0834384
		colorDistFreq   342.134
		detailScale     6610.13
		colorConversion true
		seaLevel        0.0543709
		snowLevel       2
		tropicLatitude  0.0410273
		icecapLatitude  0.903332
		icecapHeight    0.0590881
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.747638
		venusFreq       1.22229
		venusMagn       0.412292
		mareFreq        1.76808
		mareDensity     0.0122949
		terraceProb     0.316458
		erosion         0
		montesMagn      0.174065
		montesFreq      157.585
		montesSpiky     0.818638
		montesFraction  0.403208
		dunesMagn       0.0491095
		dunesFreq       27.8039
		dunesFraction   0.266276
		hillsMagn       0.147735
		hillsFreq       246.502
		hillsFraction   0
		hills2Fraction  0
		riversMagn      52.4578
		riversFreq      2.96694
		riversSin       6.18454
		riversOctaves   0
		canyonsMagn     0.0399737
		canyonsFreq     65.9579
		canyonFraction  0
		cracksMagn      0.0697726
		cracksFreq      0.176144
		cracksOctaves   0
		craterMagn      0.545862
		craterFreq      7.41256
		craterDensity   0.943191
		craterOctaves   11.4957
		volcanoMagn     0.538206
		volcanoFreq     0.892262
		volcanoDensity  0.137834
		volcanoOctaves  1
		volcanoActivity 0.214187
		volcanoFlows    0.501816
		volcanoRadius   0.448462
		volcanoTemp     1574.43
		lavaCoverTidal  0
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
		Hapke           0.965119
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
		Height          64.3915
		Density         0.00348811
		Pressure        0.00133684
		Greenhouse      0.16745
		Bright          5.11114
		Opacity         1
		SkyLight        1.70371
		Hue             0.00971795
		Saturation      1

		Composition
		{
			CO2   	97.1908
			C2H4  	1.07439
			C2H2  	0.697694
			CH4   	0.286942
			SO2   	0.285003
			NH3   	0.259369
			H2S   	0.119632
			N2    	0.0486749
			C2H6  	0.0151433
			H2O   	0.014568
			C3H8  	0.0075087
			Ar    	0.000213383
			CO    	1.92377e-005
			Ne    	1.58786e-005
			Cl2   	1.19059e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0987168
		Period          0.103387
		Eccentricity    0.0463541
		Inclination     -1.21468
		AscendingNode   29.1183
		ArgOfPericenter 111.409
		MeanAnomaly     306.264
	}
}

DwarfMoon	"4.D1"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            9.96079e-006
	Radius          165.405
	InertiaMoment   0.398872

	Oblateness      0.0334131

	Obliquity       0.309497
	EqAscendNode    72.8622
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.795 0.792 0.790)

	Surface
	{
		SurfStyle       0.808221
		OceanStyle      0.872909
		Randomize      (-0.143, -0.770, -0.633)
		colorDistMagn   0.467319
		colorDistFreq   8.14364
		detailScale     4516.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00869352
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.61779
		terraceProb     0.189521
		erosion         0
		montesMagn      0.545244
		montesFreq      3.33338
		montesSpiky     0.970072
		montesFraction  0.648877
		dunesFraction   0
		hillsMagn       0
		hillsFreq       49.5908
		hillsFraction   0.704423
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223533
		craterFreq      0.988626
		craterDensity   1.09318
		craterOctaves   16
		volcanoActivity 0.924591
		volcanoFlows    0
		volcanoRadius   8.2169
		volcanoTemp     1623.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.269, 0.221, 0.000)
		colorShelf     (0.318, 0.277, 0.253, 0.000)
		colorBeach     (0.374, 0.325, 0.300, 0.000)
		colorDesert    (0.406, 0.348, 0.292, 0.000)
		colorLowland   (0.445, 0.372, 0.332, 0.000)
		colorUpland    (0.493, 0.451, 0.403, 0.000)
		colorRock      (0.533, 0.491, 0.435, 0.000)
		colorSnow      (0.581, 0.523, 0.458, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.86923e-005
		Period          0.00129735
		Eccentricity    0.00494524
		Inclination     0.309497
		AscendingNode   72.8622
		ArgOfPericenter 63.2533
		MeanAnomaly     -73.1718
	}
}

DwarfMoon	"4.D2"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            1.34685e-010
	Radius          7.20037
	InertiaMoment   0.39942

	Oblateness      0.0139075

	Obliquity       49.7837
	EqAscendNode    40.0597
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.573 0.486 0.370)

	Surface
	{
		SurfStyle       0.893445
		OceanStyle      0.267087
		Randomize      (0.493, -0.973, 0.433)
		colorDistMagn   0.617256
		colorDistFreq   0.0360083
		detailScale     196.618
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999568
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.527406
		terraceProb     0.104318
		erosion         0
		montesMagn      0.578862
		montesFreq      2.1448
		montesSpiky     0.978497
		montesFraction  0.819025
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.137052
		hillsFraction   0.657931
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219105
		craterFreq      0.24128
		craterDensity   0.877615
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   97.2749
		volcanoTemp     1476.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.170, 0.148, 0.050)
		colorShelf     (0.229, 0.199, 0.170, 0.040)
		colorBeach     (0.263, 0.229, 0.192, 0.030)
		colorDesert    (0.298, 0.258, 0.218, 0.020)
		colorLowland   (0.332, 0.287, 0.240, 0.030)
		colorUpland    (0.366, 0.316, 0.263, 0.050)
		colorRock      (0.401, 0.345, 0.292, 0.020)
		colorSnow      (0.401, 0.345, 0.292, 1.000)
		BumpHeight      6.48034
		BumpOffset      1.29607
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000143724
		Period          0.004972
		Eccentricity    0.120263
		Inclination     49.7837
		AscendingNode   40.0597
		ArgOfPericenter 36.4843
		MeanAnomaly     139.291
	}
}

Planet	"5"
{
	ParentBody     "CN Leo"
	Class	       "GasGiant"

	Mass            121.469
	Radius          61947.9
	InertiaMoment   0.236906

	Obliquity       2.25556
	EqAscendNode    30.3319
	TidalLocked     true

	AlbedoBond      0.503636
	AlbedoGeom      0.604363
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.77988
		Randomize      (0.078, 0.675, 0.257)
		detailScale     159333
		colorConversion true
		tropicLatitude  0.0759172
		icecapLatitude  0.975917
		mainFreq        0.0517118
		venusFreq       7.5553
		venusMagn       0.300443
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      2.35906
		twistMagn       0.769171
		cycloneMagn     9.51295
		cycloneFreq     0.203059
		cycloneDensity  0.0966273
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
		BumpHeight      17.625
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          137.996
		BumpHeight      50.7172
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.538946
		mainOctaves     10
		Coverage        0.53636
		twistZones      2.35906
		twistMagn       0.769171
	}

	Clouds
	{
		Height          258.367
		BumpHeight      56.4978
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.538946
		mainOctaves     10
		Coverage        0.53636
		twistZones      2.35906
		twistMagn       0.769171
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          619.479
		Density         5400.14
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0239842
		Saturation      0.8571

		Composition
		{
			H2    	92.4902
			He    	7.14279
			CH4   	0.31723
			N2    	0.0356282
			O2    	0.00753502
			C2H2  	0.00309565
			C2H4  	0.00118408
			Ne    	0.000933187
			Ar    	0.000835825
			C2H6  	0.000565547
			NH3   	1.9201e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.171679
		Period          0.236635
		Eccentricity    0.0493423
		Inclination     2.25556
		AscendingNode   30.3319
		ArgOfPericenter 224.841
		MeanAnomaly     301.712
	}
}

DwarfMoon	"5.D1"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            4.94775e-009
	Radius          23.5409
	InertiaMoment   0.398833

	RotationPeriod  165.812
	Obliquity       -80.798
	EqAscendNode    148.456

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.579 0.573 0.568)

	Surface
	{
		SurfStyle       0.191702
		OceanStyle      0.463658
		Randomize      (-0.304, -0.172, 0.284)
		colorDistMagn   0.174804
		colorDistFreq   0.110147
		detailScale     642.824
		colorConversion true
		snowLevel       2
		tropicLatitude  0.516948
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.631926
		terraceProb     0.113536
		erosion         0
		montesMagn      0.352229
		montesFreq      4.74216
		montesSpiky     0.98053
		montesFraction  0.584063
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.67017
		hillsFraction   0.615529
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211123
		craterFreq      0.275861
		craterDensity   0.943935
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   52.4718
		volcanoTemp     1775.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.229, 0.227, 0.000)
		colorShelf     (0.246, 0.244, 0.242, 0.000)
		colorBeach     (0.260, 0.258, 0.256, 0.000)
		colorDesert    (0.275, 0.272, 0.270, 0.000)
		colorLowland   (0.289, 0.287, 0.284, 0.000)
		colorUpland    (0.304, 0.301, 0.298, 0.000)
		colorRock      (0.318, 0.315, 0.313, 0.000)
		colorSnow      (0.333, 0.330, 0.327, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00360317
		Period          0.0113494
		Eccentricity    0.458157
		Inclination     -80.798
		AscendingNode   148.456
		ArgOfPericenter -164.846
		MeanAnomaly     -22.3172
	}
}

DwarfMoon	"5.D2"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            6.8052e-009
	Radius          24.9079
	InertiaMoment   0.399773

	RotationPeriod  614.969
	Obliquity       -86.0606
	EqAscendNode    151.721

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.409 0.403 0.398)

	Surface
	{
		SurfStyle       0.169936
		OceanStyle      0.59887
		Randomize      (-0.491, 0.373, -0.865)
		colorDistMagn   0.502653
		colorDistFreq   0.14937
		detailScale     680.151
		colorConversion true
		snowLevel       2
		tropicLatitude  0.472716
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560302
		terraceProb     0.313016
		erosion         0
		montesMagn      0.398099
		montesFreq      3.50429
		montesSpiky     0.865837
		montesFraction  0.653488
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.6915
		hillsFraction   0.607616
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225228
		craterFreq      0.218043
		craterDensity   0.969054
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.3393
		volcanoTemp     1513.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.163, 0.161, 0.159, 0.000)
		colorShelf     (0.174, 0.171, 0.169, 0.000)
		colorBeach     (0.184, 0.181, 0.179, 0.000)
		colorDesert    (0.194, 0.192, 0.189, 0.000)
		colorLowland   (0.204, 0.202, 0.199, 0.000)
		colorUpland    (0.214, 0.212, 0.209, 0.000)
		colorRock      (0.225, 0.222, 0.219, 0.000)
		colorSnow      (0.235, 0.232, 0.229, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00415046
		Period          0.0140311
		Eccentricity    0.265285
		Inclination     -86.0606
		AscendingNode   151.721
		ArgOfPericenter 159.089
		MeanAnomaly     14.9918
	}
}

DwarfMoon	"5.D3"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            9.31658e-009
	Radius          32.3354
	InertiaMoment   0.397745

	Oblateness      0.0014934

	Obliquity       71.9569
	EqAscendNode    -111.036
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.802 0.689 0.649)

	Surface
	{
		SurfStyle       0.566237
		OceanStyle      0.656006
		Randomize      (-0.221, 0.916, 0.129)
		colorDistMagn   0.413749
		colorDistFreq   0.361054
		detailScale     882.973
		colorConversion true
		snowLevel       2
		tropicLatitude  0.907314
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553863
		terraceProb     0.466862
		erosion         0
		montesMagn      0.646491
		montesFreq      2.29719
		montesSpiky     0.966376
		montesFraction  0.423698
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.06309
		hillsFraction   0.409537
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250102
		craterFreq      0.156136
		craterDensity   0.956618
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   52.5238
		volcanoTemp     1615.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.234, 0.182, 0.000)
		colorShelf     (0.321, 0.241, 0.208, 0.000)
		colorBeach     (0.377, 0.282, 0.247, 0.000)
		colorDesert    (0.409, 0.303, 0.240, 0.000)
		colorLowland   (0.449, 0.324, 0.273, 0.000)
		colorUpland    (0.497, 0.393, 0.331, 0.000)
		colorRock      (0.538, 0.427, 0.357, 0.000)
		colorSnow      (0.586, 0.454, 0.377, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00477365
		Period          0.017307
		Eccentricity    0.0133133
		Inclination     71.9569
		AscendingNode   -111.036
		ArgOfPericenter 10.474
		MeanAnomaly     21.6031
	}
}

DwarfMoon	"5.D4"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.27089e-008
	Radius          33.7772
	InertiaMoment   0.398979

	Obliquity       -53.9414
	EqAscendNode    -175.347
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.486 0.381 0.317)

	Surface
	{
		SurfStyle       0.247689
		OceanStyle      0.0398553
		Randomize      (-0.823, -0.043, -0.050)
		colorDistMagn   0.538829
		colorDistFreq   0.577466
		detailScale     922.343
		colorConversion true
		snowLevel       2
		tropicLatitude  0.065599
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.393596
		terraceProb     0.612871
		erosion         0
		montesMagn      0.412913
		montesFreq      3.02297
		montesSpiky     0.863409
		montesFraction  0.311474
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.68582
		hillsFraction   0.810088
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242461
		craterFreq      0.250148
		craterDensity   0.789398
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.9759
		volcanoTemp     1545.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.152, 0.127, 0.000)
		colorShelf     (0.206, 0.162, 0.135, 0.000)
		colorBeach     (0.219, 0.171, 0.143, 0.000)
		colorDesert    (0.231, 0.181, 0.151, 0.000)
		colorLowland   (0.243, 0.190, 0.159, 0.000)
		colorUpland    (0.255, 0.200, 0.167, 0.000)
		colorRock      (0.267, 0.209, 0.175, 0.000)
		colorSnow      (0.279, 0.219, 0.183, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00534718
		Period          0.0205179
		Eccentricity    0.0898079
		Inclination     -53.9414
		AscendingNode   -175.347
		ArgOfPericenter -106.564
		MeanAnomaly     43.6115
	}
}

DwarfMoon	"5.D5"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.7291e-008
	Radius          35.9281
	InertiaMoment   0.399898

	RotationPeriod  1160.39
	Obliquity       1.70737
	EqAscendNode    130.613

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.675 0.632 0.602)

	Surface
	{
		SurfStyle       0.320083
		OceanStyle      0.256773
		Randomize      (0.895, 0.959, -0.542)
		colorDistMagn   0.79173
		colorDistFreq   0.604994
		detailScale     981.077
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0248932
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.343672
		terraceProb     0.173526
		erosion         0
		montesMagn      0.694805
		montesFreq      3.67906
		montesSpiky     0.848014
		montesFraction  0.315941
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.67865
		hillsFraction   0.679763
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244688
		craterFreq      0.17056
		craterDensity   0.995601
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.8382
		volcanoTemp     1871.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.253, 0.241, 0.000)
		colorShelf     (0.287, 0.269, 0.256, 0.000)
		colorBeach     (0.304, 0.284, 0.271, 0.000)
		colorDesert    (0.321, 0.300, 0.286, 0.000)
		colorLowland   (0.338, 0.316, 0.301, 0.000)
		colorUpland    (0.355, 0.332, 0.316, 0.000)
		colorRock      (0.371, 0.348, 0.331, 0.000)
		colorSnow      (0.388, 0.363, 0.346, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00561231
		Period          0.0220627
		Eccentricity    0.209242
		Inclination     1.70737
		AscendingNode   130.613
		ArgOfPericenter -60.9299
		MeanAnomaly     -6.6794
	}
}

DwarfMoon	"5.D6"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.34846e-008
	Radius          37.9957
	InertiaMoment   0.397967

	RotationPeriod  435.177
	Obliquity       -89.2165
	EqAscendNode    45.8145

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.559 0.554 0.548)

	Surface
	{
		SurfStyle       0.925542
		OceanStyle      0.279685
		Randomize      (0.626, 0.294, 0.991)
		colorDistMagn   0.90648
		colorDistFreq   0.815062
		detailScale     1037.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.717396
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.536579
		terraceProb     0.407624
		erosion         0
		montesMagn      0.512275
		montesFreq      2.90621
		montesSpiky     0.876314
		montesFraction  0.546375
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.47784
		hillsFraction   0.584985
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.299146
		craterFreq      0.277514
		craterDensity   1.04008
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.8731
		volcanoTemp     1382.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.194, 0.219, 0.050)
		colorShelf     (0.224, 0.227, 0.252, 0.040)
		colorBeach     (0.257, 0.260, 0.285, 0.030)
		colorDesert    (0.291, 0.294, 0.324, 0.020)
		colorLowland   (0.324, 0.327, 0.356, 0.030)
		colorUpland    (0.358, 0.360, 0.389, 0.050)
		colorRock      (0.392, 0.393, 0.433, 0.020)
		colorSnow      (0.392, 0.393, 0.433, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00607106
		Period          0.0248224
		Eccentricity    0.253495
		Inclination     -89.2165
		AscendingNode   45.8145
		ArgOfPericenter 90.3366
		MeanAnomaly     20.0293
	}
}

DwarfMoon	"5.D7"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            3.187e-008
	Radius          49.4304
	InertiaMoment   0.399118

	RotationPeriod  461.469
	Obliquity       20.8968
	EqAscendNode    -166.102

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.644 0.595 0.530)

	Surface
	{
		SurfStyle       0.783685
		OceanStyle      0.737657
		Randomize      (0.369, -0.196, 0.466)
		colorDistMagn   0.452951
		colorDistFreq   0.901822
		detailScale     1349.78
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0862253
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.694624
		terraceProb     0.224179
		erosion         0
		montesMagn      0.554474
		montesFreq      1.94689
		montesSpiky     0.924877
		montesFraction  0.309528
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.991
		hillsFraction   0.68407
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.195982
		craterFreq      0.171677
		craterDensity   0.926645
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   43.4119
		volcanoTemp     1644.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.202, 0.148, 0.000)
		colorShelf     (0.257, 0.208, 0.170, 0.000)
		colorBeach     (0.303, 0.244, 0.201, 0.000)
		colorDesert    (0.328, 0.262, 0.196, 0.000)
		colorLowland   (0.360, 0.280, 0.223, 0.000)
		colorUpland    (0.399, 0.339, 0.270, 0.000)
		colorRock      (0.431, 0.369, 0.292, 0.000)
		colorSnow      (0.470, 0.393, 0.308, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00631319
		Period          0.0263221
		Eccentricity    0.450826
		Inclination     20.8968
		AscendingNode   -166.102
		ArgOfPericenter 47.1162
		MeanAnomaly     -2.66759
	}
}

DwarfMoon	"5.D8"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            4.32504e-008
	Radius          51.138
	InertiaMoment   0.394801

	Obliquity       65.7614
	EqAscendNode    120.672
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.748 0.746 0.744)

	Surface
	{
		SurfStyle       0.271564
		OceanStyle      0.698287
		Randomize      (0.498, 0.451, -0.163)
		colorDistMagn   0.929067
		colorDistFreq   1.75047
		detailScale     1396.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.805432
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.531792
		terraceProb     0.395715
		erosion         0
		montesMagn      0.492063
		montesFreq      3.91475
		montesSpiky     0.986885
		montesFraction  0.763713
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.82645
		hillsFraction   0.681896
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242588
		craterFreq      0.239055
		craterDensity   0.783103
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.5527
		volcanoTemp     1496.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.298, 0.297, 0.000)
		colorShelf     (0.318, 0.317, 0.316, 0.000)
		colorBeach     (0.337, 0.336, 0.335, 0.000)
		colorDesert    (0.355, 0.354, 0.353, 0.000)
		colorLowland   (0.374, 0.373, 0.372, 0.000)
		colorUpland    (0.393, 0.392, 0.390, 0.000)
		colorRock      (0.411, 0.410, 0.409, 0.000)
		colorSnow      (0.430, 0.429, 0.428, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00686463
		Period          0.029845
		Eccentricity    0.0224372
		Inclination     65.7614
		AscendingNode   120.672
		ArgOfPericenter 36.3209
		MeanAnomaly     105.315
	}
}

DwarfMoon	"5.D9"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            5.87465e-008
	Radius          54.3167
	InertiaMoment   0.398167

	RotationPeriod  589.37
	Obliquity       -68.4883
	EqAscendNode    -135.803

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.811 0.719 0.682)

	Surface
	{
		SurfStyle       0.832583
		OceanStyle      0.611022
		Randomize      (-0.868, -0.047, 0.774)
		colorDistMagn   0.761081
		colorDistFreq   2.03248
		detailScale     1483.21
		colorConversion true
		snowLevel       2
		tropicLatitude  0.655712
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.326655
		terraceProb     0.169543
		erosion         0
		montesMagn      0.541396
		montesFreq      3.0819
		montesSpiky     0.890707
		montesFraction  0.448263
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.22411
		hillsFraction   0.664264
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262997
		craterFreq      0.159384
		craterDensity   0.821966
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   35.1357
		volcanoTemp     1291.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.316, 0.244, 0.191, 0.000)
		colorShelf     (0.324, 0.252, 0.218, 0.000)
		colorBeach     (0.381, 0.295, 0.259, 0.000)
		colorDesert    (0.414, 0.316, 0.252, 0.000)
		colorLowland   (0.454, 0.338, 0.287, 0.000)
		colorUpland    (0.503, 0.410, 0.348, 0.000)
		colorRock      (0.543, 0.446, 0.375, 0.000)
		colorSnow      (0.592, 0.474, 0.396, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00743155
		Period          0.0336175
		Eccentricity    0.401792
		Inclination     -68.4883
		AscendingNode   -135.803
		ArgOfPericenter -79.3261
		MeanAnomaly     -63.8687
	}
}

DwarfMoon	"5.D10"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            7.99356e-008
	Radius          57.6186
	InertiaMoment   0.399254

	RotationPeriod  832.775
	Obliquity       61.5842
	EqAscendNode    -3.93729

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.707 0.705 0.703)

	Surface
	{
		SurfStyle       0.148795
		OceanStyle      0.539411
		Randomize      (0.405, -0.812, 0.576)
		colorDistMagn   0.493745
		colorDistFreq   1.80442
		detailScale     1573.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.838256
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.261186
		terraceProb     0.40814
		erosion         0
		montesMagn      0.518491
		montesFreq      3.30237
		montesSpiky     0.85148
		montesFraction  0.377049
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.77604
		hillsFraction   0.801062
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211745
		craterFreq      0.194122
		craterDensity   0.957519
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.952
		volcanoTemp     1610.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.282, 0.281, 0.000)
		colorShelf     (0.301, 0.300, 0.299, 0.000)
		colorBeach     (0.318, 0.317, 0.316, 0.000)
		colorDesert    (0.336, 0.335, 0.334, 0.000)
		colorLowland   (0.354, 0.353, 0.352, 0.000)
		colorUpland    (0.371, 0.370, 0.369, 0.000)
		colorRock      (0.389, 0.388, 0.387, 0.000)
		colorSnow      (0.407, 0.406, 0.404, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00806429
		Period          0.0380011
		Eccentricity    0.243304
		Inclination     61.5842
		AscendingNode   -3.93729
		ArgOfPericenter -98.1213
		MeanAnomaly     171.728
	}
}

DwarfMoon	"5.D11"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.09059e-007
	Radius          75.9324
	InertiaMoment   0.396226

	Obliquity       -76.3323
	EqAscendNode    -61.8254
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.688 0.683 0.681)

	Surface
	{
		SurfStyle       0.23898
		OceanStyle      0.874352
		Randomize      (-0.338, 0.182, 0.380)
		colorDistMagn   0.572933
		colorDistFreq   3.61995
		detailScale     2073.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0.92083
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.617195
		terraceProb     0.481812
		erosion         0
		montesMagn      0.321149
		montesFreq      2.7085
		montesSpiky     0.924005
		montesFraction  0.709522
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.676
		hillsFraction   0.365568
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22981
		craterFreq      0.182624
		craterDensity   0.929149
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   36.0497
		volcanoTemp     1687.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.273, 0.272, 0.000)
		colorShelf     (0.292, 0.290, 0.289, 0.000)
		colorBeach     (0.310, 0.307, 0.306, 0.000)
		colorDesert    (0.327, 0.324, 0.323, 0.000)
		colorLowland   (0.344, 0.341, 0.340, 0.000)
		colorUpland    (0.361, 0.359, 0.357, 0.000)
		colorRock      (0.378, 0.376, 0.374, 0.000)
		colorSnow      (0.396, 0.393, 0.391, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00843257
		Period          0.0406337
		Eccentricity    0.112071
		Inclination     -76.3323
		AscendingNode   -61.8254
		ArgOfPericenter 53.3626
		MeanAnomaly     83.9305
	}
}

DwarfMoon	"5.D12"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            1.49338e-007
	Radius          77.8264
	InertiaMoment   0.398349

	RotationPeriod  1550.73
	Obliquity       -53.5028
	EqAscendNode    -143.114

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.472 0.470 0.467)

	Surface
	{
		SurfStyle       0.0074258
		OceanStyle      0.664981
		Randomize      (-0.512, 0.530, 0.253)
		colorDistMagn   0.974153
		colorDistFreq   1.49562
		detailScale     2125.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.491917
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.502143
		terraceProb     0.419815
		erosion         0
		montesMagn      0.489051
		montesFreq      2.62301
		montesSpiky     0.874918
		montesFraction  0.0574394
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.3599
		hillsFraction   0.767925
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22391
		craterFreq      0.256628
		craterDensity   0.873909
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.5753
		volcanoTemp     1423.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.188, 0.187, 0.000)
		colorShelf     (0.201, 0.200, 0.199, 0.000)
		colorBeach     (0.213, 0.211, 0.210, 0.000)
		colorDesert    (0.224, 0.223, 0.222, 0.000)
		colorLowland   (0.236, 0.235, 0.234, 0.000)
		colorUpland    (0.248, 0.247, 0.245, 0.000)
		colorRock      (0.260, 0.258, 0.257, 0.000)
		colorSnow      (0.272, 0.270, 0.269, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00892261
		Period          0.0442267
		Eccentricity    0.322046
		Inclination     -53.5028
		AscendingNode   -143.114
		ArgOfPericenter -36.4741
		MeanAnomaly     159.09
	}
}

DwarfMoon	"5.D13"
{
	ParentBody     "5"
	Class	       "Asteroid"

	Mass            2.05456e-007
	Radius          82.9117
	InertiaMoment   0.399387

	Obliquity       -25.6067
	EqAscendNode    -158.544
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.631 0.628)

	Surface
	{
		SurfStyle       0.190565
		OceanStyle      0.902422
		Randomize      (0.020, -0.238, 0.186)
		colorDistMagn   0.649092
		colorDistFreq   3.55517
		detailScale     2264.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.160377
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.699717
		terraceProb     0.104085
		erosion         0
		montesMagn      0.50363
		montesFreq      3.36253
		montesSpiky     0.964933
		montesFraction  0.633671
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.2152
		hillsFraction   0.676436
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239176
		craterFreq      0.266882
		craterDensity   0.981997
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.6789
		volcanoTemp     1203.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.253, 0.251, 0.000)
		colorShelf     (0.269, 0.268, 0.267, 0.000)
		colorBeach     (0.285, 0.284, 0.283, 0.000)
		colorDesert    (0.301, 0.300, 0.298, 0.000)
		colorLowland   (0.317, 0.316, 0.314, 0.000)
		colorUpland    (0.333, 0.331, 0.330, 0.000)
		colorRock      (0.349, 0.347, 0.345, 0.000)
		colorSnow      (0.364, 0.363, 0.361, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00933705
		Period          0.0473436
		Eccentricity    0.360819
		Inclination     -25.6067
		AscendingNode   -158.544
		ArgOfPericenter -136.86
		MeanAnomaly     -135.077
	}
}

Planet	"6"
{
	ParentBody     "CN Leo"
	Class	       "IceWorld"

	Mass            0.945844
	Radius          7506.28
	InertiaMoment   0.331899

	Oblateness      0.00751566

	RotationPeriod  21.0057
	Obliquity       -25.5417
	EqAscendNode    -170.282

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.559 0.425 0.350)

	Surface
	{
		SurfStyle       0.178227
		OceanStyle      0.00490663
		Randomize      (0.558, -0.938, -0.291)
		colorDistMagn   0.0524246
		colorDistFreq   935.093
		detailScale     19306.6
		colorConversion true
		drivenDarkening 0
		seaLevel        0.131338
		snowLevel       2
		tropicLatitude  0.395807
		icecapLatitude  1
		icecapHeight    0.131338
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.04963
		venusFreq       1.15575
		venusMagn       0.137109
		mareFreq        1.96175
		mareDensity     0.0787826
		terraceProb     0.233259
		erosion         0
		montesMagn      0.154072
		montesFreq      392.422
		montesSpiky     0.958983
		montesFraction  0.284863
		dunesMagn       0.0212515
		dunesFreq       9932.96
		dunesFraction   0.00916773
		hillsMagn       0.114035
		hillsFreq       994.331
		hillsFraction   0.15978
		hills2Fraction  0.00210703
		riversMagn      63.3436
		riversFreq      3.54656
		riversSin       3.97244
		riversOctaves   0
		canyonsMagn     0.564394
		canyonsFreq     2.44731
		canyonFraction  0
		cracksMagn      0.0307959
		cracksFreq      4.67212
		cracksOctaves   6
		craterMagn      0.512631
		craterFreq      26.475
		craterDensity   0.389654
		craterOctaves   6.07306
		craterRayedFactor 0.0880421
		volcanoMagn     0.693772
		volcanoFreq     1.10621
		volcanoDensity  0.0638837
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.326722
		volcanoRadius   0.334655
		volcanoTemp     1672.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.559, 0.425, 0.350, 0.500)
		colorShelf     (0.531, 0.403, 0.332, 0.500)
		colorBeach     (0.391, 0.297, 0.245, 0.750)
		colorDesert    (0.475, 0.361, 0.297, 1.000)
		colorLowland   (0.492, 0.374, 0.308, 1.000)
		colorUpland    (0.520, 0.395, 0.325, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.492, 0.374, 0.308, 1.000)
		colorUpPlants  (0.520, 0.395, 0.325, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0
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
		Height          28.4814
		Density         0.119015
		Pressure        0.0396757
		Greenhouse      1.9879
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.206576
		Saturation      1

		Composition
		{
			N2    	99.6733
			Ar    	0.253732
			CO    	0.0497103
			Ne    	0.013078
			He    	0.0100805
			Kr    	4.97332e-005
			CO2   	2.92069e-005
		}
	}

	Aurora
	{
		Height      171.552
		NorthLat    57.8347
		NorthLon    -22.0843
		NorthRadius 1679.87
		NorthWidth  1721.27
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -42.2748
		SouthLon    153.038
		SouthRadius 1763.61
		SouthWidth  1539.33
		SouthRings  5
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     8590.28
		OuterRadius     18017
		RotationPeriod  4.37149
		RotationOffset  0
		FrontBright     0.751639
		BackBright      0.963566
		Density         0.851317
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.316959
		Period          0.594809
		Eccentricity    0.0167637
		Inclination     -2.2843
		AscendingNode   -167.514
		ArgOfPericenter 284.428
		MeanAnomaly     310.468
	}
}

DwarfMoon	"6.D1"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.36339e-011
	Radius          3.30135
	InertiaMoment   0.398796

	Oblateness      0.215902

	Obliquity       -0.00859565
	EqAscendNode    -40.3848
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.847 0.795 0.732)

	Surface
	{
		SurfStyle       0.451343
		OceanStyle      0.680935
		Randomize      (-0.946, -0.376, 0.371)
		colorDistMagn   0.501513
		colorDistFreq   0.00151415
		detailScale     90.1489
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.343079
		terraceProb     0.430286
		erosion         0
		montesMagn      0.613771
		montesFreq      2.94692
		montesSpiky     0.985408
		montesFraction  0.257715
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0296003
		hillsFraction   0.763152
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216753
		craterFreq      0.217923
		craterDensity   0.822705
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   140.18
		volcanoTemp     860.439
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.339, 0.318, 0.293, 0.000)
		colorShelf     (0.360, 0.338, 0.311, 0.000)
		colorBeach     (0.381, 0.358, 0.329, 0.000)
		colorDesert    (0.402, 0.378, 0.348, 0.000)
		colorLowland   (0.424, 0.397, 0.366, 0.000)
		colorUpland    (0.445, 0.417, 0.384, 0.000)
		colorRock      (0.466, 0.437, 0.402, 0.000)
		colorSnow      (0.487, 0.457, 0.421, 1.000)
		BumpHeight      2.97122
		BumpOffset      0.594243
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000162332
		Period          0.00122991
		Eccentricity    9.89096e-005
		Inclination     -0.00859565
		AscendingNode   -40.3848
		ArgOfPericenter -17.0452
		MeanAnomaly     14.4901
	}
}

Moon	"6.1"
{
	ParentBody     "6"
	Class	       "IceWorld"

	Mass            8.86162e-005
	Radius          393.322
	InertiaMoment   0.399519

	Oblateness      0.00951198

	Obliquity       0.715726
	EqAscendNode    -169.282
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.492 0.481 0.474)

	Surface
	{
		SurfStyle       0.0680237
		OceanStyle      0.413271
		Randomize      (-0.455, 0.961, -0.354)
		colorDistMagn   0.0747462
		colorDistFreq   39.4643
		detailScale     1011.65
		colorConversion true
		drivenDarkening 0
		seaLevel        0.254135
		snowLevel       2
		tropicLatitude  0.00234171
		icecapLatitude  0.53669
		icecapHeight    0.287769
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.80622
		venusFreq       0.596725
		venusMagn       0.157345
		mareFreq        0
		mareDensity     9.08835e-005
		terraceProb     0.353911
		erosion         0
		montesMagn      0.0563004
		montesFreq      22.4977
		montesSpiky     0.886861
		montesFraction  0.486636
		dunesMagn       0.0430434
		dunesFreq       508.931
		dunesFraction   0.76921
		hillsMagn       0.134391
		hillsFreq       42.6169
		hillsFraction   0.659185
		hills2Fraction  0.187846
		riversMagn      65.8997
		riversFreq      2.37577
		riversSin       4.43314
		riversOctaves   0
		canyonsMagn     0.396593
		canyonsFreq     0.126844
		canyonFraction  0
		cracksMagn      0.0381499
		cracksFreq      0.120385
		cracksOctaves   0
		craterMagn      0.66391
		craterFreq      1.40618
		craterDensity   0.760544
		craterOctaves   9
		craterRayedFactor 0.141966
		volcanoMagn     0.205095
		volcanoFreq     1.03911
		volcanoDensity  0.0635389
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.245611
		volcanoRadius   1.70177
		volcanoTemp     1465.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.492, 0.481, 0.474, 0.500)
		colorShelf     (0.467, 0.456, 0.451, 0.500)
		colorBeach     (0.344, 0.336, 0.332, 0.750)
		colorDesert    (0.418, 0.408, 0.403, 1.000)
		colorLowland   (0.433, 0.423, 0.417, 1.000)
		colorUpland    (0.457, 0.447, 0.441, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.433, 0.423, 0.417, 1.000)
		colorUpPlants  (0.457, 0.447, 0.441, 1.000)
		BumpHeight      19.6661
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
		SemiMajorAxis   0.000293696
		Period          0.00299292
		Eccentricity    0.0461144
		Inclination     0.715726
		AscendingNode   -169.282
		ArgOfPericenter -143.279
		MeanAnomaly     100.723
	}
}

DwarfMoon	"6.D2"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            5.02149e-011
	Radius          5.67325
	InertiaMoment   0.397685

	RotationPeriod  1312.55
	Obliquity       -21.5105
	EqAscendNode    63.9565

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.674 0.537 0.464)

	Surface
	{
		SurfStyle       0.972919
		OceanStyle      0.0796549
		Randomize      (-0.606, 0.820, -0.508)
		colorDistMagn   0.867788
		colorDistFreq   0.0234344
		detailScale     154.918
		colorConversion true
		snowLevel       2
		tropicLatitude  0.591205
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.310264
		terraceProb     0.181752
		erosion         0
		montesMagn      0.420877
		montesFreq      3.10579
		montesSpiky     0.96554
		montesFraction  0.4836
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.104978
		hillsFraction   0.774616
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.199596
		craterFreq      0.255896
		craterDensity   0.931848
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   125.522
		volcanoTemp     1656.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.188, 0.186, 0.050)
		colorShelf     (0.270, 0.220, 0.213, 0.040)
		colorBeach     (0.310, 0.253, 0.241, 0.030)
		colorDesert    (0.350, 0.285, 0.274, 0.020)
		colorLowland   (0.391, 0.317, 0.302, 0.030)
		colorUpland    (0.431, 0.349, 0.329, 0.050)
		colorRock      (0.472, 0.382, 0.366, 0.020)
		colorSnow      (0.472, 0.382, 0.366, 1.000)
		BumpHeight      5.10592
		BumpOffset      1.02118
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00136372
		Period          0.0299471
		Eccentricity    0.181877
		Inclination     -21.5105
		AscendingNode   63.9564
		ArgOfPericenter 97.2452
		MeanAnomaly     152.86
	}
}

DwarfMoon	"6.D3"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            8.63784e-011
	Radius          6.4003
	InertiaMoment   0.398942

	Obliquity       13.416
	EqAscendNode    -150.764
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.792 0.791 0.789)

	Surface
	{
		SurfStyle       0.845461
		OceanStyle      0.903623
		Randomize      (-0.129, 0.502, 0.285)
		colorDistMagn   0.415973
		colorDistFreq   0.0315717
		detailScale     174.771
		colorConversion true
		snowLevel       2
		tropicLatitude  0.11691
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.257049
		terraceProb     0.416823
		erosion         0
		montesMagn      0.438838
		montesFreq      3.08199
		montesSpiky     0.95078
		montesFraction  0.44873
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0799804
		hillsFraction   0.725821
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247024
		craterFreq      0.254107
		craterDensity   0.948601
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   107.97
		volcanoTemp     1358.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.269, 0.221, 0.000)
		colorShelf     (0.317, 0.277, 0.253, 0.000)
		colorBeach     (0.372, 0.324, 0.300, 0.000)
		colorDesert    (0.404, 0.348, 0.292, 0.000)
		colorLowland   (0.444, 0.372, 0.331, 0.000)
		colorUpland    (0.491, 0.451, 0.402, 0.000)
		colorRock      (0.531, 0.490, 0.434, 0.000)
		colorSnow      (0.578, 0.522, 0.458, 1.000)
		BumpHeight      5.76027
		BumpOffset      1.15205
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00158193
		Period          0.0374155
		Eccentricity    0.0543398
		Inclination     13.416
		AscendingNode   -150.764
		ArgOfPericenter 104.922
		MeanAnomaly     -82.2542
	}
}

DwarfMoon	"6.D4"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            1.41635e-010
	Radius          7.24458
	InertiaMoment   0.399867

	Obliquity       8.08394
	EqAscendNode    -37.5443
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.776 0.716 0.655)

	Surface
	{
		SurfStyle       0.457643
		OceanStyle      0.305992
		Randomize      (0.764, -0.684, -0.343)
		colorDistMagn   0.737057
		colorDistFreq   0.0191902
		detailScale     197.825
		colorConversion true
		snowLevel       2
		tropicLatitude  0.263916
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.635716
		terraceProb     0.391451
		erosion         0
		montesMagn      0.436504
		montesFreq      2.36279
		montesSpiky     0.976636
		montesFraction  0.757179
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.118879
		hillsFraction   0.787975
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242523
		craterFreq      0.191344
		craterDensity   0.832882
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   95.4408
		volcanoTemp     1743.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.286, 0.262, 0.000)
		colorShelf     (0.330, 0.304, 0.278, 0.000)
		colorBeach     (0.349, 0.322, 0.295, 0.000)
		colorDesert    (0.369, 0.340, 0.311, 0.000)
		colorLowland   (0.388, 0.358, 0.328, 0.000)
		colorUpland    (0.407, 0.376, 0.344, 0.000)
		colorRock      (0.427, 0.394, 0.360, 0.000)
		colorSnow      (0.446, 0.412, 0.377, 1.000)
		BumpHeight      6.52012
		BumpOffset      1.30402
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00179158
		Period          0.0450945
		Eccentricity    0.445192
		Inclination     8.08394
		AscendingNode   -37.5443
		ArgOfPericenter 153.14
		MeanAnomaly     145.899
	}
}

DwarfMoon	"6.D5"
{
	ParentBody     "6"
	Class	       "Asteroid"

	Mass            2.23802e-010
	Radius          8.05917
	InertiaMoment   0.397913

	Obliquity       37.4586
	EqAscendNode    143.257
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.657 0.654 0.650)

	Surface
	{
		SurfStyle       0.365872
		OceanStyle      0.831374
		Randomize      (-0.593, -0.493, -0.136)
		colorDistMagn   0.737927
		colorDistFreq   0.0564688
		detailScale     220.069
		colorConversion true
		snowLevel       2
		tropicLatitude  0.376266
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.758447
		terraceProb     0.214716
		erosion         0
		montesMagn      0.607824
		montesFreq      2.95904
		montesSpiky     0.958129
		montesFraction  0.805014
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.200798
		hillsFraction   0.418462
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216707
		craterFreq      0.19775
		craterDensity   1.02672
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   84.4627
		volcanoTemp     1446.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.262, 0.260, 0.000)
		colorShelf     (0.279, 0.278, 0.276, 0.000)
		colorBeach     (0.296, 0.294, 0.292, 0.000)
		colorDesert    (0.312, 0.311, 0.309, 0.000)
		colorLowland   (0.328, 0.327, 0.325, 0.000)
		colorUpland    (0.345, 0.343, 0.341, 0.000)
		colorRock      (0.361, 0.360, 0.357, 0.000)
		colorSnow      (0.378, 0.376, 0.373, 1.000)
		BumpHeight      7.25325
		BumpOffset      1.45065
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00201248
		Period          0.0536867
		Eccentricity    0.0654085
		Inclination     37.4586
		AscendingNode   143.257
		ArgOfPericenter -92.7438
		MeanAnomaly     138.4
	}
}

Planet	"7"
{
	ParentBody     "CN Leo"
	Class	       "GasGiant"

	Mass            841.43
	Radius          77260.7
	InertiaMoment   0.185174

	Oblateness      0.0404179

	RotationPeriod  7.79814
	Obliquity       -7.055
	EqAscendNode    175.019

	AlbedoBond      0.464666
	AlbedoGeom      0.557599
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.545603
		Randomize      (0.852, -0.027, 0.290)
		detailScale     198719
		colorConversion true
		tropicLatitude  0.143312
		icecapLatitude  1
		mainFreq        0.0239676
		venusFreq       1.70667
		venusMagn       0.340086
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      8.50945
		twistMagn       0.841137
		cycloneMagn     9.37567
		cycloneFreq     0.294546
		cycloneDensity  0.0792045
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
		BumpHeight      8.35191
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          35.1328
		BumpHeight      66.9832
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.696613
		mainOctaves     10
		Coverage        0.146658
		twistZones      8.50945
		twistMagn       0.841137
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          142.251
		Density         6827.61
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.609236
		Saturation      0.97412

		Composition
		{
			H2    	93.0773
			He    	6.84573
			N2    	0.0426442
			CH4   	0.025436
			O2    	0.00705366
			Ne    	0.00105688
			Ar    	0.00073191
		}
	}

	Aurora
	{
		Height      6647.35
		NorthLat    83.7074
		NorthLon    -65.3257
		NorthRadius 28163.8
		NorthWidth  14635
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -82.4557
		SouthLon    118.377
		SouthRadius 22356
		SouthWidth  12575.3
		SouthRings  5
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     112538
		OuterRadius     261079
		RotationPeriod  7.71204
		RotationOffset  0
		FrontBright     0.708283
		BackBright      0.773518
		Density         0.888852
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.679751
		Period          1.84254
		Eccentricity    0.0593935
		Inclination     1.19509
		AscendingNode   171.767
		ArgOfPericenter 307.47
		MeanAnomaly     250.091
	}
}

DwarfMoon	"7.D1"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            7.0361e-009
	Radius          24.5183
	InertiaMoment   0.396554

	Oblateness      0.249

	Obliquity       -0.0125826
	EqAscendNode    -77.7424
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.413 0.410 0.407)

	Surface
	{
		SurfStyle       0.128023
		OceanStyle      0.2553
		Randomize      (-0.707, -0.198, -0.610)
		colorDistMagn   0.127624
		colorDistFreq   0.287001
		detailScale     669.513
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.428083
		terraceProb     0.482445
		erosion         0
		montesMagn      0.385306
		montesFreq      2.9725
		montesSpiky     0.928504
		montesFraction  0.535768
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.33048
		hillsFraction   0.64045
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216568
		craterFreq      0.22076
		craterDensity   0.634501
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   45.828
		volcanoTemp     1317.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.164, 0.163, 0.000)
		colorShelf     (0.176, 0.174, 0.173, 0.000)
		colorBeach     (0.186, 0.184, 0.183, 0.000)
		colorDesert    (0.196, 0.195, 0.193, 0.000)
		colorLowland   (0.206, 0.205, 0.204, 0.000)
		colorUpland    (0.217, 0.215, 0.214, 0.000)
		colorRock      (0.227, 0.225, 0.224, 0.000)
		colorSnow      (0.237, 0.236, 0.234, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00111869
		Period          0.000745989
		Eccentricity    9.48789e-005
		Inclination     -0.0125826
		AscendingNode   -77.7425
		ArgOfPericenter -62.6404
		MeanAnomaly     -10.7482
	}
}

DwarfMoon	"7.D2"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            9.62859e-009
	Radius          32.018
	InertiaMoment   0.398438

	Oblateness      0.249

	Obliquity       -0.0041842
	EqAscendNode    38.8723
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.756 0.723 0.672)

	Surface
	{
		SurfStyle       0.224093
		OceanStyle      0.244588
		Randomize      (-0.095, 0.425, -0.288)
		colorDistMagn   0.387118
		colorDistFreq   0.642879
		detailScale     874.305
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532932
		terraceProb     0.254353
		erosion         0
		montesMagn      0.494447
		montesFreq      3.16177
		montesSpiky     0.932734
		montesFraction  0.507193
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.1529
		hillsFraction   0.627366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24887
		craterFreq      0.208997
		craterDensity   0.954399
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.1586
		volcanoTemp     1482.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.289, 0.269, 0.000)
		colorShelf     (0.321, 0.307, 0.285, 0.000)
		colorBeach     (0.340, 0.325, 0.302, 0.000)
		colorDesert    (0.359, 0.344, 0.319, 0.000)
		colorLowland   (0.378, 0.362, 0.336, 0.000)
		colorUpland    (0.397, 0.380, 0.353, 0.000)
		colorRock      (0.416, 0.398, 0.369, 0.000)
		colorSnow      (0.435, 0.416, 0.386, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00129304
		Period          0.00092702
		Eccentricity    4.57011e-006
		Inclination     -0.0041842
		AscendingNode   38.8723
		ArgOfPericenter 93.5825
		MeanAnomaly     74.4649
	}
}

DwarfMoon	"7.D3"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.31303e-008
	Radius          33.7529
	InertiaMoment   0.399454

	Oblateness      0.249

	Obliquity       0.000372026
	EqAscendNode    -160.749
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.748 0.744 0.741)

	Surface
	{
		SurfStyle       0.500584
		OceanStyle      0.0171332
		Randomize      (0.724, -0.290, -0.919)
		colorDistMagn   0.235119
		colorDistFreq   0.415533
		detailScale     921.679
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.648449
		terraceProb     0.34745
		erosion         0
		montesMagn      0.570484
		montesFreq      3.77593
		montesSpiky     0.820932
		montesFraction  0.564658
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.93437
		hillsFraction   0.574112
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234515
		craterFreq      0.215654
		craterDensity   0.904759
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.1827
		volcanoTemp     1776.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.253, 0.208, 0.000)
		colorShelf     (0.299, 0.260, 0.237, 0.000)
		colorBeach     (0.351, 0.305, 0.282, 0.000)
		colorDesert    (0.381, 0.327, 0.274, 0.000)
		colorLowland   (0.419, 0.350, 0.311, 0.000)
		colorUpland    (0.464, 0.424, 0.378, 0.000)
		colorRock      (0.501, 0.461, 0.408, 0.000)
		colorSnow      (0.546, 0.491, 0.430, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00151509
		Period          0.00117579
		Eccentricity    3.04245e-005
		Inclination     0.000372026
		AscendingNode   -160.749
		ArgOfPericenter -119.7
		MeanAnomaly     -162.922
	}
}

Moon	"7.1"
{
	ParentBody     "7"
	Class	       "Desert"

	Mass            0.40462
	Radius          5793.77
	InertiaMoment   0.32964

	Oblateness      0.00748521

	Obliquity       0.250485
	EqAscendNode    -41.6916
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.735 0.732 0.727)

	Surface
	{
		SurfStyle       0.799182
		OceanStyle      0.311305
		Randomize      (0.914, 0.825, 0.909)
		colorDistMagn   0.057829
		colorDistFreq   763.961
		detailScale     14901.9
		colorConversion true
		seaLevel        0.181294
		snowLevel       2
		tropicLatitude  0.00817044
		icecapLatitude  10
		icecapHeight    0.107357
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.779339
		venusFreq       0.541867
		venusMagn       0
		mareFreq        0.986083
		mareDensity     0.0491952
		terraceProb     0.113793
		erosion         0
		montesMagn      0.20914
		montesFreq      246.072
		montesSpiky     0.978734
		montesFraction  0.519118
		dunesMagn       0.0469902
		dunesFreq       68.3651
		dunesFraction   0.211921
		hillsMagn       0.129846
		hillsFreq       523.467
		hillsFraction   0
		hills2Fraction  0
		riversMagn      58.8185
		riversFreq      3.01089
		riversSin       8.00454
		riversOctaves   0
		canyonsMagn     0.0491863
		canyonsFreq     136.911
		canyonFraction  0
		cracksMagn      0.110076
		cracksFreq      0.594718
		cracksOctaves   0
		craterMagn      0.650951
		craterFreq      13.6781
		craterDensity   0.407731
		craterOctaves   5.46965
		volcanoMagn     0.708601
		volcanoFreq     3.14661
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.742583
		volcanoRadius   0.37446
		volcanoTemp     1628.08
		lavaCoverTidal  0.574902
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
		Hapke           0.983288
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
		Height          130.469
		Density         0.00167122
		Pressure        0.00242362
		Greenhouse      2.09444
		Bright          4.41171
		Opacity         1
		SkyLight        1.47057
		Hue             0
		Saturation      1

		Composition
		{
			H2O   	75.4879
			CO2   	9.13053
			H2    	6.84055
			C2H2  	2.36452
			SO2   	1.90843
			CH4   	1.39495
			C2H4  	1.34779
			NH3   	1.01432
			H2S   	0.275916
			C2H6  	0.184366
			N2    	0.0441571
			C3H8  	0.00621008
			CO    	0.000163436
			He    	0.0001453
			Ne    	3.03642e-005
			Ar    	2.17822e-005
			O2    	1.03815e-005
		}
	}

	Aurora
	{
		Height      99.1567
		NorthLat    56.8786
		NorthLon    23.3423
		NorthRadius 1198.84
		NorthWidth  1201.64
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -28.9854
		SouthLon    227.065
		SouthRadius 1359.04
		SouthWidth  1055.78
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
		SemiMajorAxis   0.00249176
		Period          0.00247928
		Eccentricity    0.00749142
		Inclination     0.250485
		AscendingNode   -41.6916
		ArgOfPericenter -95.1994
		MeanAnomaly     -168.589
	}
}

Moon	"7.2"
{
	ParentBody     "7"
	Class	       "Selena"

	Mass            0.046841
	Radius          3108.55
	InertiaMoment   0.343997

	Oblateness      0.0027582

	Obliquity       0.368671
	EqAscendNode    39.0152
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.547 0.543 0.541)

	Surface
	{
		SurfStyle       0.832083
		OceanStyle      0.581807
		Randomize      (0.791, 0.383, -0.216)
		colorDistMagn   0.072172
		colorDistFreq   398.134
		detailScale     7995.37
		colorConversion true
		drivenDarkening 0
		seaLevel        0.185061
		snowLevel       2
		tropicLatitude  0.0121284
		icecapLatitude  0.776063
		icecapHeight    0.191278
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.92701
		venusFreq       1.00672
		venusMagn       0
		mareFreq        2.03855
		mareDensity     0.00563185
		terraceProb     0.109292
		erosion         0
		montesMagn      0.2267
		montesFreq      159.693
		montesSpiky     0.911199
		montesFraction  0.396486
		dunesMagn       0.0476233
		dunesFreq       4127.7
		dunesFraction   0.745521
		hillsMagn       0.130667
		hillsFreq       380.475
		hillsFraction   0.491207
		hills2Fraction  0
		riversMagn      60.6934
		riversFreq      2.96402
		riversSin       5.19528
		riversOctaves   0
		canyonsMagn     0.382544
		canyonsFreq     1.31164
		canyonFraction  0.867877
		cracksMagn      0.0641068
		cracksFreq      1.25489
		cracksOctaves   0
		craterMagn      0.562009
		craterFreq      10.6378
		craterDensity   0.603187
		craterOctaves   8.0993
		craterRayedFactor 0.124992
		volcanoMagn     0.631843
		volcanoFreq     3.0938
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.22371
		volcanoRadius   0.58058
		volcanoTemp     1429.74
		lavaCoverTidal  0.361176
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.306, 0.255, 0.227, 0.000)
		colorDesert    (0.279, 0.239, 0.200, 0.000)
		colorLowland   (0.213, 0.185, 0.152, 0.000)
		colorUpland    (0.361, 0.326, 0.281, 0.000)
		colorRock      (0.670, 0.620, 0.550, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.981442
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
		Height          216.524
		Density         0.00185583
		Pressure        0.000738274
		Greenhouse      0.120374
		Bright          4.50513
		Opacity         0
		SkyLight        1.50171
		Hue             -0.0334254
		Saturation      1

		Composition
		{
			CO2   	78.2189
			NH3   	12.7996
			CH4   	7.52885
			C2H4  	0.604116
			H2S   	0.572836
			C2H2  	0.132516
			SO2   	0.0746566
			N2    	0.0335425
			C2H6  	0.0204867
			C3H8  	0.008231
			H2O   	0.00600317
			CO    	0.000116921
			He    	5.80968e-005
			Ar    	3.42175e-005
			Cl2   	1.42803e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00389339
		Period          0.0048434
		Eccentricity    0.0291928
		Inclination     0.368671
		AscendingNode   39.0152
		ArgOfPericenter 103.798
		MeanAnomaly     -17.9934
	}
}

Moon	"7.3"
{
	ParentBody     "7"
	Class	       "IceWorld"

	Mass            0.0541994
	Radius          3064.41
	InertiaMoment   0.339363

	Obliquity       1.46309
	EqAscendNode    67.4107
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.685 0.483 0.356)

	Surface
	{
		SurfStyle       0.0188556
		OceanStyle      0.810118
		Randomize      (-0.877, 0.779, 0.202)
		colorDistMagn   0.045453
		colorDistFreq   410.274
		detailScale     7881.85
		colorConversion true
		drivenDarkening 0
		seaLevel        0.216468
		snowLevel       2
		tropicLatitude  0.0424723
		icecapLatitude  1
		icecapHeight    0.216468
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.65186
		venusFreq       1.15946
		venusMagn       0.251952
		mareFreq        2.13453
		mareDensity     0.00807282
		terraceProb     0.364022
		erosion         0
		montesMagn      0.168835
		montesFreq      103.667
		montesSpiky     0.770266
		montesFraction  0.530402
		dunesMagn       0.0435543
		dunesFreq       4025.52
		dunesFraction   0.746913
		hillsMagn       0.121882
		hillsFreq       318.145
		hillsFraction   0.455178
		hills2Fraction  0.0194484
		riversMagn      53.394
		riversFreq      2.9454
		riversSin       5.96576
		riversOctaves   0
		canyonsMagn     0.473747
		canyonsFreq     1.10209
		canyonFraction  0
		cracksMagn      0.0425977
		cracksFreq      1.53832
		cracksOctaves   3
		craterMagn      0.574986
		craterFreq      7.16473
		craterDensity   0.905267
		craterOctaves   12
		craterRayedFactor 0.24212
		volcanoMagn     0.753506
		volcanoFreq     0.799771
		volcanoDensity  0.0577949
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.249875
		volcanoRadius   0.412631
		volcanoTemp     1212.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.685, 0.483, 0.356, 0.500)
		colorShelf     (0.651, 0.459, 0.338, 0.500)
		colorBeach     (0.479, 0.338, 0.249, 0.750)
		colorDesert    (0.582, 0.410, 0.302, 1.000)
		colorLowland   (0.603, 0.425, 0.313, 1.000)
		colorUpland    (0.637, 0.449, 0.331, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.603, 0.425, 0.313, 1.000)
		colorUpPlants  (0.637, 0.449, 0.331, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.975638
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
		Height          133.191
		Density         0.00243623
		Pressure        0.000982439
		Greenhouse      0.607879
		Bright          4.75712
		Opacity         0
		SkyLight        1.58571
		Hue             -0.025674
		Saturation      1

		Composition
		{
			CH4   	99.936
			N2    	0.0621805
			Ar    	0.00117943
			He    	0.000322325
			CO    	0.000204127
			Ne    	9.94538e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00608346
		Period          0.00945981
		Eccentricity    0.00155064
		Inclination     1.46309
		AscendingNode   67.4107
		ArgOfPericenter 32.6642
		MeanAnomaly     -85.6673
	}
}

DwarfMoon	"7.D4"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            4.46692e-008
	Radius          51.0702
	InertiaMoment   0.397346

	Obliquity       -1.92579
	EqAscendNode    112.626
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.733 0.728 0.727)

	Surface
	{
		SurfStyle       0.180825
		OceanStyle      0.615514
		Randomize      (-0.190, 0.440, -0.035)
		colorDistMagn   0.0842192
		colorDistFreq   1.27684
		detailScale     1394.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0372728
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.619733
		terraceProb     0.204794
		erosion         0
		montesMagn      0.54937
		montesFreq      2.60221
		montesSpiky     0.884015
		montesFraction  0.385496
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.16764
		hillsFraction   0.526958
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25114
		craterFreq      0.159973
		craterDensity   1.09803
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.8852
		volcanoTemp     1735.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.291, 0.291, 0.000)
		colorShelf     (0.311, 0.310, 0.309, 0.000)
		colorBeach     (0.330, 0.328, 0.327, 0.000)
		colorDesert    (0.348, 0.346, 0.345, 0.000)
		colorLowland   (0.366, 0.364, 0.363, 0.000)
		colorUpland    (0.385, 0.382, 0.382, 0.000)
		colorRock      (0.403, 0.401, 0.400, 0.000)
		colorSnow      (0.421, 0.419, 0.418, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0269083
		Period          0.0880036
		Eccentricity    0.114672
		Inclination     -1.92579
		AscendingNode   112.626
		ArgOfPericenter -111.232
		MeanAnomaly     -163.504
	}
}

DwarfMoon	"7.D5"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            6.06825e-008
	Radius          54.3213
	InertiaMoment   0.398758

	RotationPeriod  2356.68
	Obliquity       0.556397
	EqAscendNode    -162.231

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.768 0.735 0.709)

	Surface
	{
		SurfStyle       0.632738
		OceanStyle      0.574521
		Randomize      (-0.641, 0.318, 0.823)
		colorDistMagn   0.771726
		colorDistFreq   1.20038
		detailScale     1483.33
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0029901
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503514
		terraceProb     0.501253
		erosion         0
		montesMagn      0.348356
		montesFreq      2.43956
		montesSpiky     0.967953
		montesFraction  0.567739
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.60909
		hillsFraction   0.814179
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230137
		craterFreq      0.210905
		craterDensity   1.09364
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.5736
		volcanoTemp     1676.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.250, 0.199, 0.000)
		colorShelf     (0.307, 0.257, 0.227, 0.000)
		colorBeach     (0.361, 0.301, 0.269, 0.000)
		colorDesert    (0.392, 0.323, 0.262, 0.000)
		colorLowland   (0.430, 0.345, 0.298, 0.000)
		colorUpland    (0.476, 0.419, 0.362, 0.000)
		colorRock      (0.515, 0.456, 0.390, 0.000)
		colorSnow      (0.561, 0.485, 0.411, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.027236
		Period          0.0896162
		Eccentricity    0.470112
		Inclination     0.556397
		AscendingNode   -162.231
		ArgOfPericenter 141.171
		MeanAnomaly     177.891
	}
}

DwarfMoon	"7.D6"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            8.25896e-008
	Radius          57.301
	InertiaMoment   0.399709

	Obliquity       78.6588
	EqAscendNode    149.739
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.696 0.550 0.486)

	Surface
	{
		SurfStyle       0.0350719
		OceanStyle      0.332074
		Randomize      (-0.091, 0.024, 0.476)
		colorDistMagn   0.981359
		colorDistFreq   1.74854
		detailScale     1564.7
		colorConversion true
		snowLevel       2
		tropicLatitude  0.494792
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.29017
		terraceProb     0.20461
		erosion         0
		montesMagn      0.541651
		montesFreq      3.41766
		montesSpiky     0.903766
		montesFraction  0.620412
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.47436
		hillsFraction   0.653625
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263074
		craterFreq      0.251295
		craterDensity   0.799624
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.2612
		volcanoTemp     1424.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.220, 0.194, 0.000)
		colorShelf     (0.296, 0.234, 0.207, 0.000)
		colorBeach     (0.313, 0.248, 0.219, 0.000)
		colorDesert    (0.331, 0.261, 0.231, 0.000)
		colorLowland   (0.348, 0.275, 0.243, 0.000)
		colorUpland    (0.366, 0.289, 0.255, 0.000)
		colorRock      (0.383, 0.303, 0.267, 0.000)
		colorSnow      (0.400, 0.316, 0.280, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0277035
		Period          0.0919332
		Eccentricity    0.162528
		Inclination     78.6588
		AscendingNode   149.739
		ArgOfPericenter -134.549
		MeanAnomaly     90.7198
	}
}

DwarfMoon	"7.D7"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.12718e-007
	Radius          74.3333
	InertiaMoment   0.397622

	Obliquity       -70.4453
	EqAscendNode    -83.4575
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.578 0.575 0.572)

	Surface
	{
		SurfStyle       0.703795
		OceanStyle      0.354949
		Randomize      (-0.124, 0.839, 0.867)
		colorDistMagn   0.587123
		colorDistFreq   4.16685
		detailScale     2029.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999941
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539921
		terraceProb     0.26321
		erosion         0
		montesMagn      0.590136
		montesFreq      3.04161
		montesSpiky     0.809967
		montesFraction  0.356908
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.2615
		hillsFraction   0.670518
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250265
		craterFreq      0.247746
		craterDensity   1.06287
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.713
		volcanoTemp     1702.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.196, 0.160, 0.000)
		colorShelf     (0.231, 0.201, 0.183, 0.000)
		colorBeach     (0.272, 0.236, 0.217, 0.000)
		colorDesert    (0.295, 0.253, 0.212, 0.000)
		colorLowland   (0.324, 0.270, 0.240, 0.000)
		colorUpland    (0.358, 0.328, 0.292, 0.000)
		colorRock      (0.387, 0.357, 0.315, 0.000)
		colorSnow      (0.422, 0.380, 0.332, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.028108
		Period          0.0939538
		Eccentricity    0.327336
		Inclination     -70.4453
		AscendingNode   -83.4575
		ArgOfPericenter 26.638
		MeanAnomaly     -170.632
	}
}

DwarfMoon	"7.D8"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.54417e-007
	Radius          77.7038
	InertiaMoment   0.398906

	Obliquity       -79.2818
	EqAscendNode    136.288
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.700 0.697 0.694)

	Surface
	{
		SurfStyle       0.360646
		OceanStyle      0.732204
		Randomize      (-0.152, 0.389, -0.812)
		colorDistMagn   0.441915
		colorDistFreq   3.86495
		detailScale     2121.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0.680859
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.398644
		terraceProb     0.381249
		erosion         0
		montesMagn      0.681711
		montesFreq      3.02427
		montesSpiky     0.858684
		montesFraction  0.380496
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.4089
		hillsFraction   0.510581
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224475
		craterFreq      0.191924
		craterDensity   0.966255
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.0027
		volcanoTemp     1419.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.279, 0.278, 0.000)
		colorShelf     (0.298, 0.296, 0.295, 0.000)
		colorBeach     (0.315, 0.314, 0.312, 0.000)
		colorDesert    (0.333, 0.331, 0.330, 0.000)
		colorLowland   (0.350, 0.349, 0.347, 0.000)
		colorUpland    (0.368, 0.366, 0.365, 0.000)
		colorRock      (0.385, 0.383, 0.382, 0.000)
		colorSnow      (0.403, 0.401, 0.399, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0286474
		Period          0.0966713
		Eccentricity    0.0190546
		Inclination     -79.2818
		AscendingNode   136.288
		ArgOfPericenter 73.2263
		MeanAnomaly     143.003
	}
}

DwarfMoon	"7.D9"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.12564e-007
	Radius          82.9687
	InertiaMoment   0.399835

	Obliquity       60.9728
	EqAscendNode    24.6949
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.828 0.777 0.681)

	Surface
	{
		SurfStyle       0.0409239
		OceanStyle      0.166627
		Randomize      (-0.115, -0.881, 0.070)
		colorDistMagn   0.386087
		colorDistFreq   3.44152
		detailScale     2265.6
		colorConversion true
		snowLevel       2
		tropicLatitude  0.888338
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.358998
		terraceProb     0.120273
		erosion         0
		montesMagn      0.461834
		montesFreq      3.54247
		montesSpiky     0.955165
		montesFraction  0.578796
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.5705
		hillsFraction   0.701922
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227225
		craterFreq      0.274137
		craterDensity   1.07173
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.2147
		volcanoTemp     1376.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.331, 0.311, 0.273, 0.000)
		colorShelf     (0.352, 0.330, 0.290, 0.000)
		colorBeach     (0.373, 0.349, 0.307, 0.000)
		colorDesert    (0.393, 0.369, 0.324, 0.000)
		colorLowland   (0.414, 0.388, 0.341, 0.000)
		colorUpland    (0.435, 0.408, 0.358, 0.000)
		colorRock      (0.456, 0.427, 0.375, 0.000)
		colorSnow      (0.476, 0.447, 0.392, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0288691
		Period          0.0977959
		Eccentricity    0.22415
		Inclination     60.9728
		AscendingNode   24.6949
		ArgOfPericenter 13.3927
		MeanAnomaly     -145.291
	}
}

DwarfMoon	"7.D10"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.94363e-007
	Radius          88.34
	InertiaMoment   0.397858

	Obliquity       -25.3375
	EqAscendNode    18.8646
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.623 0.621 0.618)

	Surface
	{
		SurfStyle       0.432548
		OceanStyle      0.407118
		Randomize      (0.157, 0.689, 0.207)
		colorDistMagn   0.525192
		colorDistFreq   3.21329
		detailScale     2412.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.765398
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498868
		terraceProb     0.331659
		erosion         0
		montesMagn      0.614455
		montesFreq      2.58298
		montesSpiky     0.959074
		montesFraction  0.57385
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.3746
		hillsFraction   0.56087
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238244
		craterFreq      0.237438
		craterDensity   0.983652
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.5283
		volcanoTemp     1560.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.248, 0.247, 0.000)
		colorShelf     (0.265, 0.264, 0.263, 0.000)
		colorBeach     (0.280, 0.279, 0.278, 0.000)
		colorDesert    (0.296, 0.295, 0.293, 0.000)
		colorLowland   (0.312, 0.310, 0.309, 0.000)
		colorUpland    (0.327, 0.326, 0.324, 0.000)
		colorRock      (0.343, 0.341, 0.340, 0.000)
		colorSnow      (0.358, 0.357, 0.355, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0291561
		Period          0.0992576
		Eccentricity    0.0455093
		Inclination     -25.3375
		AscendingNode   18.8646
		ArgOfPericenter -0.71421
		MeanAnomaly     78.5155
	}
}

DwarfMoon	"7.D11"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            4.10628e-007
	Radius          116.083
	InertiaMoment   0.399048

	Obliquity       50.9477
	EqAscendNode    85.2701
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.649 0.643 0.639)

	Surface
	{
		SurfStyle       0.59364
		OceanStyle      0.100722
		Randomize      (-0.403, 0.051, -0.273)
		colorDistMagn   0.927896
		colorDistFreq   6.31224
		detailScale     3169.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.937787
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.526442
		terraceProb     0.243585
		erosion         0
		montesMagn      0.527796
		montesFreq      2.75999
		montesSpiky     0.988813
		montesFraction  0.779605
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.6392
		hillsFraction   0.377136
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219967
		craterFreq      0.566486
		craterDensity   0.825054
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.4021
		volcanoTemp     1491.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.219, 0.179, 0.000)
		colorShelf     (0.260, 0.225, 0.205, 0.000)
		colorBeach     (0.305, 0.264, 0.243, 0.000)
		colorDesert    (0.331, 0.283, 0.236, 0.000)
		colorLowland   (0.363, 0.302, 0.268, 0.000)
		colorUpland    (0.402, 0.367, 0.326, 0.000)
		colorRock      (0.435, 0.399, 0.351, 0.000)
		colorSnow      (0.474, 0.425, 0.371, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0293694
		Period          0.100349
		Eccentricity    0.077677
		Inclination     50.9477
		AscendingNode   85.2701
		ArgOfPericenter -26.2256
		MeanAnomaly     55.4856
	}
}

DwarfMoon	"7.D12"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            5.77881e-007
	Radius          121.431
	InertiaMoment   0.39996

	Obliquity       -16.8348
	EqAscendNode    -23.306
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.563 0.524 0.454)

	Surface
	{
		SurfStyle       0.784666
		OceanStyle      0.475105
		Randomize      (0.851, -0.587, -0.798)
		colorDistMagn   0.349391
		colorDistFreq   4.47744
		detailScale     3315.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.54399
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.401942
		terraceProb     0.291608
		erosion         0
		montesMagn      0.503946
		montesFreq      3.10611
		montesSpiky     0.995602
		montesFraction  0.756806
		dunesFraction   0
		hillsMagn       0
		hillsFreq       37.4184
		hillsFraction   0.923805
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239829
		craterFreq      0.492037
		craterDensity   0.786097
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.0448
		volcanoTemp     1524.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.178, 0.127, 0.000)
		colorShelf     (0.225, 0.183, 0.145, 0.000)
		colorBeach     (0.265, 0.215, 0.173, 0.000)
		colorDesert    (0.287, 0.231, 0.168, 0.000)
		colorLowland   (0.315, 0.246, 0.191, 0.000)
		colorUpland    (0.349, 0.299, 0.232, 0.000)
		colorRock      (0.377, 0.325, 0.250, 0.000)
		colorSnow      (0.411, 0.346, 0.263, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.029978
		Period          0.103484
		Eccentricity    0.052649
		Inclination     -16.8348
		AscendingNode   -23.306
		ArgOfPericenter 64.274
		MeanAnomaly     -135.048
	}
}

DwarfMoon	"7.D13"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            8.21896e-007
	Radius          130.958
	InertiaMoment   0.398068

	Obliquity       14.4085
	EqAscendNode    -55.4898
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.728 0.726 0.724)

	Surface
	{
		SurfStyle       0.658026
		OceanStyle      0.0993932
		Randomize      (-0.489, -0.067, -0.251)
		colorDistMagn   0.513501
		colorDistFreq   7.46143
		detailScale     3576.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.429636
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.426631
		terraceProb     0.190554
		erosion         0
		montesMagn      0.297063
		montesFreq      3.65793
		montesSpiky     0.950297
		montesFraction  0.901577
		dunesFraction   0
		hillsMagn       0
		hillsFreq       33.6416
		hillsFraction   0.576736
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262475
		craterFreq      0.749778
		craterDensity   0.858417
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.6481
		volcanoTemp     1297.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.247, 0.203, 0.000)
		colorShelf     (0.291, 0.254, 0.232, 0.000)
		colorBeach     (0.342, 0.298, 0.275, 0.000)
		colorDesert    (0.371, 0.320, 0.268, 0.000)
		colorLowland   (0.408, 0.341, 0.304, 0.000)
		colorUpland    (0.452, 0.414, 0.369, 0.000)
		colorRock      (0.488, 0.450, 0.398, 0.000)
		colorSnow      (0.532, 0.479, 0.420, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0303376
		Period          0.105352
		Eccentricity    0.127901
		Inclination     14.4085
		AscendingNode   -55.4898
		ArgOfPericenter -21.356
		MeanAnomaly     103.641
	}
}

DwarfMoon	"7.D14"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.18383e-006
	Radius          141.608
	InertiaMoment   0.399186

	Obliquity       -66.0524
	EqAscendNode    -56.0066
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.680 0.613 0.528)

	Surface
	{
		SurfStyle       0.92433
		OceanStyle      0.775925
		Randomize      (-0.926, -0.026, -0.374)
		colorDistMagn   0.845809
		colorDistFreq   4.70144
		detailScale     3866.85
		colorConversion true
		snowLevel       2
		tropicLatitude  0.953236
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.702645
		terraceProb     0.366087
		erosion         0
		montesMagn      0.424116
		montesFreq      2.33235
		montesSpiky     0.974375
		montesFraction  0.773861
		dunesFraction   0
		hillsMagn       0
		hillsFreq       34.8395
		hillsFraction   0.720852
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249384
		craterFreq      0.842337
		craterDensity   0.865228
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   20.4057
		volcanoTemp     1636.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.214, 0.211, 0.050)
		colorShelf     (0.272, 0.251, 0.243, 0.040)
		colorBeach     (0.313, 0.288, 0.275, 0.030)
		colorDesert    (0.354, 0.325, 0.312, 0.020)
		colorLowland   (0.395, 0.362, 0.343, 0.030)
		colorUpland    (0.435, 0.398, 0.375, 0.050)
		colorRock      (0.476, 0.435, 0.417, 0.020)
		colorSnow      (0.476, 0.435, 0.417, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0308449
		Period          0.108005
		Eccentricity    0.274287
		Inclination     -66.0524
		AscendingNode   -56.0066
		ArgOfPericenter -97.8068
		MeanAnomaly     153.67
	}
}

DwarfMoon	"7.D15"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.73122e-006
	Radius          191.304
	InertiaMoment   0.395758

	Obliquity       -12.0021
	EqAscendNode    16.9839
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.509 0.503 0.501)

	Surface
	{
		SurfStyle       0.416901
		OceanStyle      0.840222
		Randomize      (0.208, -0.292, -0.922)
		colorDistMagn   0.539153
		colorDistFreq   15.2275
		detailScale     5223.86
		colorConversion true
		snowLevel       2
		tropicLatitude  0.402543
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.517898
		terraceProb     0.481214
		erosion         0
		montesMagn      0.649027
		montesFreq      3.07816
		montesSpiky     0.999626
		montesFraction  0.632847
		dunesFraction   0
		hillsMagn       0
		hillsFreq       91.3121
		hillsFraction   0.581422
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259267
		craterFreq      0.86042
		craterDensity   0.84879
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.7957
		volcanoTemp     1256.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.201, 0.200, 0.000)
		colorShelf     (0.216, 0.214, 0.213, 0.000)
		colorBeach     (0.229, 0.226, 0.225, 0.000)
		colorDesert    (0.242, 0.239, 0.238, 0.000)
		colorLowland   (0.254, 0.251, 0.250, 0.000)
		colorUpland    (0.267, 0.264, 0.263, 0.000)
		colorRock      (0.280, 0.276, 0.275, 0.000)
		colorSnow      (0.292, 0.289, 0.288, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0311017
		Period          0.109357
		Eccentricity    0.284107
		Inclination     -12.0021
		AscendingNode   16.9839
		ArgOfPericenter 102.685
		MeanAnomaly     171.508
	}
}

DwarfMoon	"7.D16"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.57852e-006
	Radius          201.304
	InertiaMoment   0.398258

	Obliquity       -83.6369
	EqAscendNode    170.806
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.659 0.654 0.651)

	Surface
	{
		SurfStyle       0.143306
		OceanStyle      0.842509
		Randomize      (0.078, -0.502, 0.612)
		colorDistMagn   0.132297
		colorDistFreq   16.1191
		detailScale     5496.93
		colorConversion true
		snowLevel       2
		tropicLatitude  0.158798
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532243
		terraceProb     0.395241
		erosion         0
		montesMagn      0.531326
		montesFreq      4.00119
		montesSpiky     0.990508
		montesFraction  0.503428
		dunesFraction   0
		hillsMagn       0
		hillsFreq       97.5374
		hillsFraction   0.540173
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212061
		craterFreq      1.41453
		craterDensity   0.770453
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   19.6549
		volcanoTemp     1390.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.262, 0.261, 0.000)
		colorShelf     (0.280, 0.278, 0.277, 0.000)
		colorBeach     (0.296, 0.294, 0.293, 0.000)
		colorDesert    (0.313, 0.311, 0.309, 0.000)
		colorLowland   (0.329, 0.327, 0.326, 0.000)
		colorUpland    (0.346, 0.343, 0.342, 0.000)
		colorRock      (0.362, 0.360, 0.358, 0.000)
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
		SemiMajorAxis   0.0317655
		Period          0.112877
		Eccentricity    0.0405919
		Inclination     -83.6369
		AscendingNode   170.806
		ArgOfPericenter 93.003
		MeanAnomaly     32.7038
	}
}

Moon	"7.4"
{
	ParentBody     "7"
	Class	       "IceWorld"

	Mass            3.92709e-006
	Radius          221.814
	InertiaMoment   0.39932

	RotationPeriod  2540.96
	Obliquity       41.2497
	EqAscendNode    -133.619

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.797 0.626 0.569)

	Surface
	{
		SurfStyle       0.130812
		OceanStyle      0.636147
		Randomize      (-0.467, -0.065, 0.458)
		colorDistMagn   0.0540407
		colorDistFreq   27.4885
		detailScale     570.517
		colorConversion true
		drivenDarkening 0.223579
		seaLevel        0.293143
		snowLevel       2
		tropicLatitude  0.501471
		icecapLatitude  1
		icecapHeight    0.293143
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.74176
		venusFreq       1.05027
		venusMagn       0.188482
		mareFreq        0
		mareDensity     1.71062e-006
		terraceProb     0.187404
		erosion         0
		montesMagn      0.0458293
		montesFreq      13.4395
		montesSpiky     0.951781
		montesFraction  0.858237
		dunesMagn       0.0525736
		dunesFreq       290.936
		dunesFraction   0.355908
		hillsMagn       0.124818
		hillsFreq       22.4067
		hillsFraction   0.71128
		hills2Fraction  0.0981617
		riversMagn      49.6482
		riversFreq      2.60096
		riversSin       5.31007
		riversOctaves   0
		canyonsMagn     0.454877
		canyonsFreq     0.0732256
		canyonFraction  0
		cracksMagn      0.0537503
		cracksFreq      0.130796
		cracksOctaves   0
		craterMagn      1.05096
		craterFreq      0.63552
		craterDensity   0.98769
		craterOctaves   8
		craterRayedFactor 0.249721
		volcanoMagn     0.207374
		volcanoFreq     0.944781
		volcanoDensity  0.0654064
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.342243
		volcanoRadius   4.14505
		volcanoTemp     1513.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.797, 0.626, 0.569, 0.500)
		colorShelf     (0.757, 0.595, 0.541, 0.500)
		colorBeach     (0.558, 0.438, 0.399, 0.750)
		colorDesert    (0.677, 0.532, 0.484, 1.000)
		colorLowland   (0.701, 0.551, 0.501, 1.000)
		colorUpland    (0.741, 0.582, 0.529, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.701, 0.551, 0.501, 1.000)
		colorUpPlants  (0.741, 0.582, 0.529, 1.000)
		BumpHeight      11.0907
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
		SemiMajorAxis   0.0323393
		Period          0.115949
		Eccentricity    0.159796
		Inclination     41.2497
		AscendingNode   -133.619
		ArgOfPericenter 60.851
		MeanAnomaly     26.1776
	}
}

Moon	"7.5"
{
	ParentBody     "7"
	Class	       "IceWorld"

	Mass            6.1476e-006
	Radius          246.989
	InertiaMoment   0.396542

	RotationPeriod  3130.6
	Obliquity       15.6709
	EqAscendNode    0.732408

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.606 0.602 0.596)

	Surface
	{
		SurfStyle       0.141501
		OceanStyle      0.00685511
		Randomize      (-0.646, 0.098, 0.077)
		colorDistMagn   0.0735504
		colorDistFreq   26.3565
		detailScale     635.27
		colorConversion true
		drivenDarkening 0.219684
		seaLevel        0.212914
		snowLevel       2
		tropicLatitude  0.520134
		icecapLatitude  1
		icecapHeight    0.212914
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.62689
		venusFreq       0.745713
		venusMagn       0.219269
		mareFreq        0
		mareDensity     2.37625e-006
		terraceProb     0.379574
		erosion         0
		montesMagn      0.0473533
		montesFreq      10.033
		montesSpiky     0.90598
		montesFraction  0.802715
		dunesMagn       0.0506659
		dunesFreq       322.587
		dunesFraction   0.316025
		hillsMagn       0.120568
		hillsFreq       33.7808
		hillsFraction   0.355434
		hills2Fraction  0.0562268
		riversMagn      64.2353
		riversFreq      2.18096
		riversSin       5.15097
		riversOctaves   0
		canyonsMagn     0.657569
		canyonsFreq     0.0845598
		canyonFraction  0
		cracksMagn      0.0553101
		cracksFreq      0.130457
		cracksOctaves   0
		craterMagn      1.11984
		craterFreq      0.721637
		craterDensity   0.918384
		craterOctaves   8
		craterRayedFactor 0.494456
		volcanoMagn     0.245767
		volcanoFreq     1.26501
		volcanoDensity  0.0618831
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.14232
		volcanoRadius   4.93929
		volcanoTemp     1382.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.606, 0.602, 0.596, 0.500)
		colorShelf     (0.576, 0.572, 0.566, 0.500)
		colorBeach     (0.424, 0.421, 0.417, 0.750)
		colorDesert    (0.515, 0.512, 0.507, 1.000)
		colorLowland   (0.533, 0.530, 0.524, 1.000)
		colorUpland    (0.563, 0.560, 0.554, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.533, 0.530, 0.524, 1.000)
		colorUpPlants  (0.563, 0.560, 0.554, 1.000)
		BumpHeight      12.3494
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
		SemiMajorAxis   0.0329126
		Period          0.119046
		Eccentricity    0.321285
		Inclination     15.6709
		AscendingNode   0.732408
		ArgOfPericenter 53.3353
		MeanAnomaly     -123.143
	}
}

DwarfMoon	"7.D17"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.02494e-011
	Radius          4.4844
	InertiaMoment   0.398434

	Obliquity       62.6982
	EqAscendNode    127.413
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.514 0.509 0.500)

	Surface
	{
		SurfStyle       0.991467
		OceanStyle      0.180614
		Randomize      (-0.542, 0.297, -0.184)
		colorDistMagn   0.926463
		colorDistFreq   0.00864039
		detailScale     122.454
		colorConversion true
		snowLevel       2
		tropicLatitude  0.723698
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.518918
		terraceProb     0.185946
		erosion         0
		montesMagn      0.446459
		montesFreq      3.20326
		montesSpiky     0.982045
		montesFraction  0.444575
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0590321
		hillsFraction   0.677135
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220012
		craterFreq      0.221643
		craterDensity   0.80325
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   156.244
		volcanoTemp     1257.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.178, 0.200, 0.050)
		colorShelf     (0.206, 0.209, 0.230, 0.040)
		colorBeach     (0.237, 0.239, 0.260, 0.030)
		colorDesert    (0.267, 0.270, 0.295, 0.020)
		colorLowland   (0.298, 0.301, 0.325, 0.030)
		colorUpland    (0.329, 0.331, 0.355, 0.050)
		colorRock      (0.360, 0.362, 0.395, 0.020)
		colorSnow      (0.360, 0.362, 0.395, 1.000)
		BumpHeight      4.03596
		BumpOffset      0.807192
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0333913
		Period          0.121653
		Eccentricity    0.0454121
		Inclination     62.6982
		AscendingNode   127.413
		ArgOfPericenter -78.9896
		MeanAnomaly     -137.761
	}
}

DwarfMoon	"7.D18"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            3.85333e-011
	Radius          4.99534
	InertiaMoment   0.399451

	Obliquity       12.1564
	EqAscendNode    -152.509
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.743 0.661 0.563)

	Surface
	{
		SurfStyle       0.531434
		OceanStyle      0.134724
		Randomize      (0.933, -0.493, -0.450)
		colorDistMagn   0.696609
		colorDistFreq   0.00343431
		detailScale     136.406
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0999473
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.511379
		terraceProb     0.360387
		erosion         0
		montesMagn      0.559735
		montesFreq      2.29701
		montesSpiky     0.959133
		montesFraction  0.466008
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.066846
		hillsFraction   0.472394
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258825
		craterFreq      0.176875
		craterDensity   0.90537
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   126.169
		volcanoTemp     1515.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.225, 0.158, 0.000)
		colorShelf     (0.297, 0.231, 0.180, 0.000)
		colorBeach     (0.349, 0.271, 0.214, 0.000)
		colorDesert    (0.379, 0.291, 0.208, 0.000)
		colorLowland   (0.416, 0.311, 0.236, 0.000)
		colorUpland    (0.461, 0.377, 0.287, 0.000)
		colorRock      (0.498, 0.410, 0.310, 0.000)
		colorSnow      (0.543, 0.437, 0.326, 1.000)
		BumpHeight      4.4958
		BumpOffset      0.899161
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0337568
		Period          0.123655
		Eccentricity    0.136595
		Inclination     12.1564
		AscendingNode   -152.509
		ArgOfPericenter -160.685
		MeanAnomaly     -25.8053
	}
}

DwarfMoon	"7.D19"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            6.80671e-011
	Radius          5.7729
	InertiaMoment   0.397

	Obliquity       -18.8343
	EqAscendNode    96.5457
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.405 0.403 0.401)

	Surface
	{
		SurfStyle       0.956331
		OceanStyle      0.878578
		Randomize      (0.532, 0.440, 0.317)
		colorDistMagn   0.91936
		colorDistFreq   0.00802257
		detailScale     157.639
		colorConversion true
		snowLevel       2
		tropicLatitude  0.419706
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.556083
		terraceProb     0.167901
		erosion         0
		montesMagn      0.341823
		montesFreq      2.86716
		montesSpiky     0.811456
		montesFraction  0.381145
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0717573
		hillsFraction   0.698129
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229269
		craterFreq      0.160563
		craterDensity   0.974415
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   109.706
		volcanoTemp     1298.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.138, 0.141, 0.160, 0.050)
		colorShelf     (0.162, 0.165, 0.184, 0.040)
		colorBeach     (0.187, 0.189, 0.208, 0.030)
		colorDesert    (0.211, 0.213, 0.236, 0.020)
		colorLowland   (0.235, 0.238, 0.261, 0.030)
		colorUpland    (0.259, 0.262, 0.285, 0.050)
		colorRock      (0.284, 0.286, 0.317, 0.020)
		colorSnow      (0.284, 0.286, 0.317, 1.000)
		BumpHeight      5.19561
		BumpOffset      1.03912
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0342817
		Period          0.12655
		Eccentricity    0.114873
		Inclination     -18.8343
		AscendingNode   96.5457
		ArgOfPericenter 80.679
		MeanAnomaly     -87.5192
	}
}

DwarfMoon	"7.D20"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.13868e-010
	Radius          6.57846
	InertiaMoment   0.398599

	RotationPeriod  1879.9
	Obliquity       6.05211
	EqAscendNode    -3.42987

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.719 0.715 0.711)

	Surface
	{
		SurfStyle       0.514111
		OceanStyle      0.00405464
		Randomize      (-0.558, 0.993, 0.351)
		colorDistMagn   0.585352
		colorDistFreq   0.0109064
		detailScale     179.636
		colorConversion true
		snowLevel       2
		tropicLatitude  0.209598
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606756
		terraceProb     0.1218
		erosion         0
		montesMagn      0.376716
		montesFreq      2.74372
		montesSpiky     0.895775
		montesFraction  0.751612
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.107492
		hillsFraction   0.682776
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225972
		craterFreq      0.208455
		craterDensity   0.89094
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   96.656
		volcanoTemp     1305.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.243, 0.199, 0.000)
		colorShelf     (0.288, 0.250, 0.227, 0.000)
		colorBeach     (0.338, 0.293, 0.270, 0.000)
		colorDesert    (0.367, 0.314, 0.263, 0.000)
		colorLowland   (0.403, 0.336, 0.299, 0.000)
		colorUpland    (0.446, 0.407, 0.363, 0.000)
		colorRock      (0.482, 0.443, 0.391, 0.000)
		colorSnow      (0.525, 0.472, 0.412, 1.000)
		BumpHeight      5.92061
		BumpOffset      1.18412
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0346643
		Period          0.128675
		Eccentricity    0.400165
		Inclination     6.05211
		AscendingNode   -3.42987
		ArgOfPericenter 71.6596
		MeanAnomaly     -141.191
	}
}

DwarfMoon	"7.D21"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.82756e-010
	Radius          10.7328
	InertiaMoment   0.39958

	Obliquity       -44.1855
	EqAscendNode    82.9293
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.760 0.757 0.756)

	Surface
	{
		SurfStyle       0.368382
		OceanStyle      0.616969
		Randomize      (-0.959, -0.186, -0.136)
		colorDistMagn   0.2961
		colorDistFreq   0.0652354
		detailScale     293.077
		colorConversion true
		snowLevel       2
		tropicLatitude  0.89079
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.45214
		terraceProb     0.243148
		erosion         0
		montesMagn      0.376447
		montesFreq      3.54459
		montesSpiky     0.9793
		montesFraction  0.907551
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.285788
		hillsFraction   0.692293
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24153
		craterFreq      0.265496
		craterDensity   0.874924
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   124.475
		volcanoTemp     1506.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.303, 0.302, 0.000)
		colorShelf     (0.323, 0.322, 0.321, 0.000)
		colorBeach     (0.342, 0.341, 0.340, 0.000)
		colorDesert    (0.361, 0.360, 0.359, 0.000)
		colorLowland   (0.380, 0.379, 0.378, 0.000)
		colorUpland    (0.399, 0.397, 0.397, 0.000)
		colorRock      (0.418, 0.416, 0.416, 0.000)
		colorSnow      (0.437, 0.435, 0.434, 1.000)
		BumpHeight      9.65951
		BumpOffset      1.9319
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0349409
		Period          0.130218
		Eccentricity    0.0659401
		Inclination     -44.1855
		AscendingNode   82.9293
		ArgOfPericenter -91.5408
		MeanAnomaly     -42.1447
	}
}

DwarfMoon	"7.D22"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.83945e-010
	Radius          9.79952
	InertiaMoment   0.39734

	Obliquity       -14.3818
	EqAscendNode    100.034
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.462 0.453 0.449)

	Surface
	{
		SurfStyle       0.0889369
		OceanStyle      0.866793
		Randomize      (0.124, 0.851, -0.660)
		colorDistMagn   0.659564
		colorDistFreq   0.0680799
		detailScale     267.592
		colorConversion true
		snowLevel       2
		tropicLatitude  0.315109
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562157
		terraceProb     0.143084
		erosion         0
		montesMagn      0.394738
		montesFreq      4.03636
		montesSpiky     0.834846
		montesFraction  0.569516
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.168422
		hillsFraction   0.607361
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.283612
		craterFreq      0.187996
		craterDensity   0.989244
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   91.1788
		volcanoTemp     1685.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.181, 0.180, 0.000)
		colorShelf     (0.196, 0.193, 0.191, 0.000)
		colorBeach     (0.208, 0.204, 0.202, 0.000)
		colorDesert    (0.219, 0.215, 0.213, 0.000)
		colorLowland   (0.231, 0.227, 0.225, 0.000)
		colorUpland    (0.242, 0.238, 0.236, 0.000)
		colorRock      (0.254, 0.249, 0.247, 0.000)
		colorSnow      (0.266, 0.260, 0.258, 1.000)
		BumpHeight      8.81957
		BumpOffset      1.76391
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0352601
		Period          0.132007
		Eccentricity    0.365914
		Inclination     -14.3818
		AscendingNode   100.034
		ArgOfPericenter 103.73
		MeanAnomaly     -169.893
	}
}

DwarfMoon	"7.D23"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            4.29826e-010
	Radius          10.7315
	InertiaMoment   0.398754

	Obliquity       17.9342
	EqAscendNode    64.2475
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.824 0.793 0.767)

	Surface
	{
		SurfStyle       0.644191
		OceanStyle      0.713245
		Randomize      (0.574, -0.335, -0.475)
		colorDistMagn   0.581751
		colorDistFreq   0.101784
		detailScale     293.042
		colorConversion true
		snowLevel       2
		tropicLatitude  0.503516
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.516404
		terraceProb     0.409434
		erosion         0
		montesMagn      0.391882
		montesFreq      2.59878
		montesSpiky     0.965606
		montesFraction  0.427178
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.202678
		hillsFraction   0.76274
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232835
		craterFreq      0.27016
		craterDensity   0.856161
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   81.156
		volcanoTemp     1440.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.269, 0.215, 0.000)
		colorShelf     (0.329, 0.277, 0.245, 0.000)
		colorBeach     (0.387, 0.325, 0.291, 0.000)
		colorDesert    (0.420, 0.349, 0.284, 0.000)
		colorLowland   (0.461, 0.373, 0.322, 0.000)
		colorUpland    (0.511, 0.452, 0.391, 0.000)
		colorRock      (0.552, 0.491, 0.422, 0.000)
		colorSnow      (0.601, 0.523, 0.445, 1.000)
		BumpHeight      9.65836
		BumpOffset      1.93167
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0354769
		Period          0.133226
		Eccentricity    0.268152
		Inclination     17.9342
		AscendingNode   64.2475
		ArgOfPericenter -173.487
		MeanAnomaly     -30.2581
	}
}

DwarfMoon	"7.D24"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            6.37014e-010
	Radius          11.7514
	InertiaMoment   0.399707

	Obliquity       -39.9496
	EqAscendNode    -50.2327
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.541 0.370 0.299)

	Surface
	{
		SurfStyle       0.226162
		OceanStyle      0.186989
		Randomize      (0.876, 0.506, 0.703)
		colorDistMagn   0.949579
		colorDistFreq   0.104359
		detailScale     320.892
		colorConversion true
		snowLevel       2
		tropicLatitude  0.946075
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.306748
		terraceProb     0.372786
		erosion         0
		montesMagn      0.391661
		montesFreq      2.5784
		montesSpiky     0.962661
		montesFraction  0.773075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.430059
		hillsFraction   0.770192
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250083
		craterFreq      0.251774
		craterDensity   0.866724
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   72.9998
		volcanoTemp     1536.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.148, 0.119, 0.000)
		colorShelf     (0.230, 0.157, 0.127, 0.000)
		colorBeach     (0.243, 0.167, 0.134, 0.000)
		colorDesert    (0.257, 0.176, 0.142, 0.000)
		colorLowland   (0.271, 0.185, 0.149, 0.000)
		colorUpland    (0.284, 0.194, 0.157, 0.000)
		colorRock      (0.298, 0.204, 0.164, 0.000)
		colorSnow      (0.311, 0.213, 0.172, 1.000)
		BumpHeight      10.5763
		BumpOffset      2.11525
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0359689
		Period          0.136007
		Eccentricity    0.00627852
		Inclination     -39.9496
		AscendingNode   -50.2327
		ArgOfPericenter -27.5411
		MeanAnomaly     136.389
	}
}

DwarfMoon	"7.D25"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            9.2774e-010
	Radius          12.4663
	InertiaMoment   0.397616

	Obliquity       -49.6201
	EqAscendNode    22.1717
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.707 0.705 0.703)

	Surface
	{
		SurfStyle       0.0837317
		OceanStyle      0.793176
		Randomize      (0.964, 0.919, -0.050)
		colorDistMagn   0.766654
		colorDistFreq   0.063645
		detailScale     340.414
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993053
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.354049
		terraceProb     0.284689
		erosion         0
		montesMagn      0.356203
		montesFreq      3.1919
		montesSpiky     0.990136
		montesFraction  0.508285
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.396626
		hillsFraction   0.690121
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26939
		craterFreq      0.154643
		craterDensity   0.946229
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   64.1699
		volcanoTemp     1685.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.282, 0.281, 0.000)
		colorShelf     (0.300, 0.299, 0.299, 0.000)
		colorBeach     (0.318, 0.317, 0.316, 0.000)
		colorDesert    (0.336, 0.335, 0.334, 0.000)
		colorLowland   (0.353, 0.352, 0.351, 0.000)
		colorUpland    (0.371, 0.370, 0.369, 0.000)
		colorRock      (0.389, 0.388, 0.387, 0.000)
		colorSnow      (0.406, 0.405, 0.404, 1.000)
		BumpHeight      11.2197
		BumpOffset      2.24394
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0365186
		Period          0.139136
		Eccentricity    0.0659358
		Inclination     -49.6201
		AscendingNode   22.1717
		ArgOfPericenter -107.637
		MeanAnomaly     27.4484
	}
}

DwarfMoon	"7.D26"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.33172e-009
	Radius          16.5507
	InertiaMoment   0.398903

	Obliquity       52.3913
	EqAscendNode    116.181
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.699 0.695 0.692)

	Surface
	{
		SurfStyle       0.710945
		OceanStyle      0.372512
		Randomize      (-0.788, -0.363, -0.664)
		colorDistMagn   0.564281
		colorDistFreq   0.22047
		detailScale     451.943
		colorConversion true
		snowLevel       2
		tropicLatitude  0.760521
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.645817
		terraceProb     0.645772
		erosion         0
		montesMagn      0.523982
		montesFreq      2.93197
		montesSpiky     0.991504
		montesFraction  0.252961
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.594247
		hillsFraction   0.682147
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260537
		craterFreq      0.19569
		craterDensity   1.01558
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   71.1075
		volcanoTemp     1731.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.236, 0.194, 0.000)
		colorShelf     (0.280, 0.243, 0.221, 0.000)
		colorBeach     (0.329, 0.285, 0.263, 0.000)
		colorDesert    (0.357, 0.306, 0.256, 0.000)
		colorLowland   (0.391, 0.327, 0.291, 0.000)
		colorUpland    (0.433, 0.396, 0.353, 0.000)
		colorRock      (0.468, 0.431, 0.381, 0.000)
		colorSnow      (0.510, 0.459, 0.401, 1.000)
		BumpHeight      14.8956
		BumpOffset      2.97912
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0371006
		Period          0.142476
		Eccentricity    0.114422
		Inclination     52.3913
		AscendingNode   116.181
		ArgOfPericenter -91.1932
		MeanAnomaly     60.1022
	}
}

DwarfMoon	"7.D27"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.88864e-009
	Radius          17.6799
	InertiaMoment   0.399832

	RotationPeriod  5069.49
	Obliquity       -58.0718
	EqAscendNode    -5.84664

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.536 0.528 0.525)

	Surface
	{
		SurfStyle       0.961169
		OceanStyle      0.849064
		Randomize      (-0.533, -0.637, -0.148)
		colorDistMagn   0.617882
		colorDistFreq   0.0564144
		detailScale     482.78
		colorConversion true
		snowLevel       2
		tropicLatitude  0.899521
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.745057
		terraceProb     0.385549
		erosion         0
		montesMagn      0.515801
		montesFreq      2.54032
		montesSpiky     0.934734
		montesFraction  0.235801
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.526535
		hillsFraction   0.425978
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218837
		craterFreq      0.148058
		craterDensity   0.997396
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   63.7841
		volcanoTemp     1177.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.185, 0.210, 0.050)
		colorShelf     (0.214, 0.217, 0.241, 0.040)
		colorBeach     (0.246, 0.248, 0.273, 0.030)
		colorDesert    (0.279, 0.280, 0.310, 0.020)
		colorLowland   (0.311, 0.312, 0.341, 0.030)
		colorUpland    (0.343, 0.343, 0.372, 0.050)
		colorRock      (0.375, 0.375, 0.414, 0.020)
		colorSnow      (0.375, 0.375, 0.414, 1.000)
		BumpHeight      15.9119
		BumpOffset      3.18239
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0374652
		Period          0.144581
		Eccentricity    0.245068
		Inclination     -58.0718
		AscendingNode   -5.84664
		ArgOfPericenter -153.273
		MeanAnomaly     86.5662
	}
}

DwarfMoon	"7.D28"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.65157e-009
	Radius          19.017
	InertiaMoment   0.397853

	Obliquity       -29.6023
	EqAscendNode    -87.8755
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.754 0.634 0.551)

	Surface
	{
		SurfStyle       0.689678
		OceanStyle      0.00904947
		Randomize      (-0.563, -0.640, -0.913)
		colorDistMagn   0.528359
		colorDistFreq   0.205069
		detailScale     519.292
		colorConversion true
		snowLevel       2
		tropicLatitude  0.664891
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.268546
		terraceProb     0.503366
		erosion         0
		montesMagn      0.483335
		montesFreq      2.87739
		montesSpiky     0.938004
		montesFraction  0.878111
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.825629
		hillsFraction   0.572052
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234648
		craterFreq      0.208873
		craterDensity   0.906494
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.9025
		volcanoTemp     1154.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.294, 0.216, 0.154, 0.000)
		colorShelf     (0.302, 0.222, 0.176, 0.000)
		colorBeach     (0.354, 0.260, 0.209, 0.000)
		colorDesert    (0.384, 0.279, 0.204, 0.000)
		colorLowland   (0.422, 0.298, 0.231, 0.000)
		colorUpland    (0.467, 0.361, 0.281, 0.000)
		colorRock      (0.505, 0.393, 0.303, 0.000)
		colorSnow      (0.550, 0.419, 0.320, 1.000)
		BumpHeight      17.1153
		BumpOffset      3.42307
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0380855
		Period          0.148187
		Eccentricity    0.0781233
		Inclination     -29.6023
		AscendingNode   -87.8755
		ArgOfPericenter -90.2884
		MeanAnomaly     23.561
	}
}

DwarfMoon	"7.D29"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            3.69153e-009
	Radius          20.0913
	InertiaMoment   0.399045

	Obliquity       -50.0395
	EqAscendNode    171.822
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.645 0.561 0.510)

	Surface
	{
		SurfStyle       0.371713
		OceanStyle      0.306406
		Randomize      (-0.896, -0.112, -0.679)
		colorDistMagn   0.984914
		colorDistFreq   0.0614822
		detailScale     548.627
		colorConversion true
		snowLevel       2
		tropicLatitude  0.109145
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544466
		terraceProb     0.279203
		erosion         0
		montesMagn      0.639951
		montesFreq      3.73667
		montesSpiky     0.959771
		montesFraction  0.638145
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.25711
		hillsFraction   0.481096
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251757
		craterFreq      0.210426
		craterDensity   1.0649
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.8455
		volcanoTemp     1451.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.224, 0.204, 0.000)
		colorShelf     (0.274, 0.239, 0.217, 0.000)
		colorBeach     (0.290, 0.253, 0.229, 0.000)
		colorDesert    (0.306, 0.267, 0.242, 0.000)
		colorLowland   (0.322, 0.281, 0.255, 0.000)
		colorUpland    (0.338, 0.295, 0.268, 0.000)
		colorRock      (0.355, 0.309, 0.280, 0.000)
		colorSnow      (0.371, 0.323, 0.293, 1.000)
		BumpHeight      18.0822
		BumpOffset      3.61644
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0386267
		Period          0.151357
		Eccentricity    0.236813
		Inclination     -50.0395
		AscendingNode   171.822
		ArgOfPericenter 132.267
		MeanAnomaly     -45.5496
	}
}

DwarfMoon	"7.D30"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            5.10376e-009
	Radius          26.1646
	InertiaMoment   0.399957

	Obliquity       -89.7993
	EqAscendNode    156.739
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.629 0.625 0.621)

	Surface
	{
		SurfStyle       0.494761
		OceanStyle      0.799984
		Randomize      (0.961, 0.617, 0.901)
		colorDistMagn   0.856549
		colorDistFreq   0.352708
		detailScale     714.469
		colorConversion true
		snowLevel       2
		tropicLatitude  0.394922
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.691981
		terraceProb     0.224214
		erosion         0
		montesMagn      0.517433
		montesFreq      2.26271
		montesSpiky     0.956529
		montesFraction  0.730637
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.67004
		hillsFraction   0.751328
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260884
		craterFreq      0.18468
		craterDensity   1.00044
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.4216
		volcanoTemp     1448.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.250, 0.249, 0.000)
		colorShelf     (0.267, 0.265, 0.264, 0.000)
		colorBeach     (0.283, 0.281, 0.280, 0.000)
		colorDesert    (0.299, 0.297, 0.295, 0.000)
		colorLowland   (0.314, 0.312, 0.311, 0.000)
		colorUpland    (0.330, 0.328, 0.326, 0.000)
		colorRock      (0.346, 0.344, 0.342, 0.000)
		colorSnow      (0.362, 0.359, 0.357, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0392374
		Period          0.154961
		Eccentricity    0.271992
		Inclination     -89.7993
		AscendingNode   156.739
		ArgOfPericenter -14.1395
		MeanAnomaly     16.4503
	}
}

DwarfMoon	"7.D31"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            7.01629e-009
	Radius          27.5471
	InertiaMoment   0.398064

	RotationPeriod  918.209
	Obliquity       -6.66449
	EqAscendNode    1.34985

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.749 0.719 0.693)

	Surface
	{
		SurfStyle       0.372727
		OceanStyle      0.783194
		Randomize      (0.614, -0.571, -0.499)
		colorDistMagn   0.102514
		colorDistFreq   0.508842
		detailScale     752.218
		colorConversion true
		snowLevel       2
		tropicLatitude  0.230526
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.680986
		terraceProb     0.214045
		erosion         0
		montesMagn      0.553537
		montesFreq      2.80553
		montesSpiky     0.944114
		montesFraction  0.229937
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.1457
		hillsFraction   0.731081
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265294
		craterFreq      0.267778
		craterDensity   0.960437
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.5617
		volcanoTemp     1282.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.288, 0.277, 0.000)
		colorShelf     (0.319, 0.306, 0.295, 0.000)
		colorBeach     (0.337, 0.324, 0.312, 0.000)
		colorDesert    (0.356, 0.342, 0.329, 0.000)
		colorLowland   (0.375, 0.360, 0.347, 0.000)
		colorUpland    (0.393, 0.378, 0.364, 0.000)
		colorRock      (0.412, 0.396, 0.381, 0.000)
		colorSnow      (0.431, 0.413, 0.399, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0396017
		Period          0.157123
		Eccentricity    0.377483
		Inclination     -6.66449
		AscendingNode   1.34985
		ArgOfPericenter 99.9595
		MeanAnomaly     -174.52
	}
}

DwarfMoon	"7.D32"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            9.60183e-009
	Radius          29.3731
	InertiaMoment   0.399183

	Obliquity       -43.5867
	EqAscendNode    -167.686
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.676 0.574 0.408)

	Surface
	{
		SurfStyle       0.326571
		OceanStyle      0.673226
		Randomize      (-0.490, -0.961, 0.380)
		colorDistMagn   0.349576
		colorDistFreq   0.348606
		detailScale     802.08
		colorConversion true
		snowLevel       2
		tropicLatitude  0.147488
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.300548
		terraceProb     0.107988
		erosion         0
		montesMagn      0.392372
		montesFreq      3.11066
		montesSpiky     0.989224
		montesFraction  0.570528
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.10463
		hillsFraction   0.632004
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228644
		craterFreq      0.220247
		craterDensity   0.781339
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.9978
		volcanoTemp     1458.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.229, 0.163, 0.000)
		colorShelf     (0.287, 0.244, 0.174, 0.000)
		colorBeach     (0.304, 0.258, 0.184, 0.000)
		colorDesert    (0.321, 0.272, 0.194, 0.000)
		colorLowland   (0.338, 0.287, 0.204, 0.000)
		colorUpland    (0.355, 0.301, 0.214, 0.000)
		colorRock      (0.372, 0.316, 0.225, 0.000)
		colorSnow      (0.389, 0.330, 0.235, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0401749
		Period          0.160547
		Eccentricity    0.274584
		Inclination     -43.5867
		AscendingNode   -167.686
		ArgOfPericenter -23.4839
		MeanAnomaly     84.216
	}
}

DwarfMoon	"7.D33"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.30942e-008
	Radius          30.9983
	InertiaMoment   0.395732

	RotationPeriod  8598.24
	Obliquity       -81.7135
	EqAscendNode    0.12083

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.618 0.616 0.613)

	Surface
	{
		SurfStyle       0.634083
		OceanStyle      0.523915
		Randomize      (0.269, 0.809, 0.856)
		colorDistMagn   0.726754
		colorDistFreq   0.287876
		detailScale     846.461
		colorConversion true
		snowLevel       2
		tropicLatitude  0.285245
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.593815
		terraceProb     0.311785
		erosion         0
		montesMagn      0.52735
		montesFreq      3.35463
		montesSpiky     0.786663
		montesFraction  0.667919
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.98979
		hillsFraction   0.495601
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252317
		craterFreq      0.231636
		craterDensity   0.858459
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.4722
		volcanoTemp     1371.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.209, 0.172, 0.000)
		colorShelf     (0.247, 0.216, 0.196, 0.000)
		colorBeach     (0.290, 0.252, 0.233, 0.000)
		colorDesert    (0.315, 0.271, 0.227, 0.000)
		colorLowland   (0.346, 0.289, 0.257, 0.000)
		colorUpland    (0.383, 0.351, 0.313, 0.000)
		colorRock      (0.414, 0.382, 0.337, 0.000)
		colorSnow      (0.451, 0.406, 0.356, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0406628
		Period          0.163481
		Eccentricity    0.293136
		Inclination     -81.7135
		AscendingNode   0.12083
		ArgOfPericenter -124.541
		MeanAnomaly     -31.025
	}
}

DwarfMoon	"7.D34"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.78114e-008
	Radius          40.1621
	InertiaMoment   0.398254

	RotationPeriod  1935.5
	Obliquity       -70.7924
	EqAscendNode    -64.7998

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.462 0.459 0.457)

	Surface
	{
		SurfStyle       0.20047
		OceanStyle      0.794368
		Randomize      (0.384, 0.779, 0.957)
		colorDistMagn   0.280514
		colorDistFreq   0.7985
		detailScale     1096.69
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962449
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.529748
		terraceProb     0.330727
		erosion         0
		montesMagn      0.431813
		montesFreq      2.88983
		montesSpiky     0.901206
		montesFraction  0.234211
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.71637
		hillsFraction   0.493238
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249588
		craterFreq      0.257999
		craterDensity   0.759431
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.1816
		volcanoTemp     1533.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.184, 0.183, 0.000)
		colorShelf     (0.196, 0.195, 0.194, 0.000)
		colorBeach     (0.208, 0.207, 0.206, 0.000)
		colorDesert    (0.219, 0.218, 0.217, 0.000)
		colorLowland   (0.231, 0.230, 0.228, 0.000)
		colorUpland    (0.242, 0.241, 0.240, 0.000)
		colorRock      (0.254, 0.253, 0.251, 0.000)
		colorSnow      (0.265, 0.264, 0.263, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0410136
		Period          0.1656
		Eccentricity    0.171607
		Inclination     -70.7925
		AscendingNode   -64.7998
		ArgOfPericenter -58.105
		MeanAnomaly     165.645
	}
}

DwarfMoon	"7.D35"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.41886e-008
	Radius          41.8745
	InertiaMoment   0.399317

	RotationPeriod  3667.38
	Obliquity       62.9476
	EqAscendNode    -106.819

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.797 0.795 0.794)

	Surface
	{
		SurfStyle       0.997268
		OceanStyle      0.389722
		Randomize      (-0.424, -0.299, 0.919)
		colorDistMagn   0.516395
		colorDistFreq   1.02099
		detailScale     1143.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.899777
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.624469
		terraceProb     0.353674
		erosion         0
		montesMagn      0.509559
		montesFreq      2.25628
		montesSpiky     0.956198
		montesFraction  0.308163
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.5736
		hillsFraction   0.641276
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224626
		craterFreq      0.229392
		craterDensity   0.821585
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.2134
		volcanoTemp     1949.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.278, 0.317, 0.050)
		colorShelf     (0.319, 0.326, 0.365, 0.040)
		colorBeach     (0.367, 0.374, 0.413, 0.030)
		colorDesert    (0.415, 0.421, 0.468, 0.020)
		colorLowland   (0.462, 0.469, 0.516, 0.030)
		colorUpland    (0.510, 0.517, 0.564, 0.050)
		colorRock      (0.558, 0.564, 0.627, 0.020)
		colorSnow      (0.558, 0.564, 0.627, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0413018
		Period          0.167349
		Eccentricity    0.225044
		Inclination     62.9476
		AscendingNode   -106.819
		ArgOfPericenter 87.8912
		MeanAnomaly     6.6406
	}
}

DwarfMoon	"7.D36"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            3.28242e-008
	Radius          44.5007
	InertiaMoment   0.396529

	Obliquity       -0.527682
	EqAscendNode    87.6835
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.557 0.555 0.553)

	Surface
	{
		SurfStyle       0.247325
		OceanStyle      0.574177
		Randomize      (0.232, -0.425, -0.949)
		colorDistMagn   0.824267
		colorDistFreq   0.574664
		detailScale     1215.17
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0132869
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.576577
		terraceProb     0.216222
		erosion         0
		montesMagn      0.206862
		montesFreq      3.31246
		montesSpiky     0.97364
		montesFraction  0.436996
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.17061
		hillsFraction   0.739851
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245671
		craterFreq      0.268556
		craterDensity   0.882015
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.5102
		volcanoTemp     1643.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.222, 0.221, 0.000)
		colorShelf     (0.237, 0.236, 0.235, 0.000)
		colorBeach     (0.251, 0.250, 0.249, 0.000)
		colorDesert    (0.265, 0.264, 0.262, 0.000)
		colorLowland   (0.279, 0.278, 0.276, 0.000)
		colorUpland    (0.293, 0.291, 0.290, 0.000)
		colorRock      (0.307, 0.305, 0.304, 0.000)
		colorSnow      (0.320, 0.319, 0.318, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0416107
		Period          0.169231
		Eccentricity    0.199688
		Inclination     -0.527682
		AscendingNode   87.6835
		ArgOfPericenter 14.5587
		MeanAnomaly     -56.6473
	}
}

DwarfMoon	"7.D37"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            4.45474e-008
	Radius          47.0575
	InertiaMoment   0.398431

	RotationPeriod  2267.99
	Obliquity       -81.7871
	EqAscendNode    -97.8598

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.457 0.452 0.446)

	Surface
	{
		SurfStyle       0.847691
		OceanStyle      0.349708
		Randomize      (-0.256, 0.876, -0.622)
		colorDistMagn   0.812095
		colorDistFreq   1.16875
		detailScale     1284.98
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988014
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.290714
		terraceProb     0.223812
		erosion         0
		montesMagn      0.594949
		montesFreq      3.12936
		montesSpiky     0.969653
		montesFraction  0.665063
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.11843
		hillsFraction   0.636937
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248871
		craterFreq      0.273055
		craterDensity   0.780398
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.9562
		volcanoTemp     1156.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.154, 0.125, 0.000)
		colorShelf     (0.183, 0.158, 0.143, 0.000)
		colorBeach     (0.215, 0.185, 0.170, 0.000)
		colorDesert    (0.233, 0.199, 0.165, 0.000)
		colorLowland   (0.256, 0.212, 0.187, 0.000)
		colorUpland    (0.284, 0.257, 0.228, 0.000)
		colorRock      (0.306, 0.280, 0.245, 0.000)
		colorSnow      (0.334, 0.298, 0.259, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.042143
		Period          0.172488
		Eccentricity    0.415729
		Inclination     -81.7871
		AscendingNode   -97.8598
		ArgOfPericenter 106.945
		MeanAnomaly     -90.8134
	}
}

DwarfMoon	"7.D38"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            6.05163e-008
	Radius          61.2681
	InertiaMoment   0.399448

	RotationPeriod  4607.38
	Obliquity       -13.8707
	EqAscendNode    -35.2884

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.539 0.529 0.526)

	Surface
	{
		SurfStyle       0.550808
		OceanStyle      0.489887
		Randomize      (-0.406, -0.184, 0.883)
		colorDistMagn   0.779704
		colorDistFreq   1.39276
		detailScale     1673.03
		colorConversion true
		snowLevel       2
		tropicLatitude  0.444824
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.437854
		terraceProb     0.119696
		erosion         0
		montesMagn      0.426598
		montesFreq      2.68477
		montesSpiky     0.963007
		montesFraction  0.612917
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.2083
		hillsFraction   0.531158
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220412
		craterFreq      0.254099
		craterDensity   0.921173
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   39.0485
		volcanoTemp     1283.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.180, 0.147, 0.000)
		colorShelf     (0.216, 0.185, 0.168, 0.000)
		colorBeach     (0.253, 0.217, 0.200, 0.000)
		colorDesert    (0.275, 0.233, 0.195, 0.000)
		colorLowland   (0.302, 0.249, 0.221, 0.000)
		colorUpland    (0.334, 0.302, 0.268, 0.000)
		colorRock      (0.361, 0.328, 0.289, 0.000)
		colorSnow      (0.393, 0.349, 0.305, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.042584
		Period          0.175203
		Eccentricity    0.32007
		Inclination     -13.8707
		AscendingNode   -35.2884
		ArgOfPericenter -72.2791
		MeanAnomaly     20.3065
	}
}

DwarfMoon	"7.D39"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            8.23618e-008
	Radius          63.4098
	InertiaMoment   0.396992

	Obliquity       11.6493
	EqAscendNode    -99.5711
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.674 0.613 0.582)

	Surface
	{
		SurfStyle       0.342283
		OceanStyle      0.708296
		Randomize      (-0.171, -0.427, 0.587)
		colorDistMagn   0.164939
		colorDistFreq   1.91409
		detailScale     1731.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.258514
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.454854
		terraceProb     0.474624
		erosion         0
		montesMagn      0.350922
		montesFreq      2.864
		montesSpiky     0.822103
		montesFraction  0.666543
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.40346
		hillsFraction   0.632552
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203132
		craterFreq      0.228685
		craterDensity   0.916856
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.6417
		volcanoTemp     1854.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.245, 0.233, 0.000)
		colorShelf     (0.286, 0.260, 0.247, 0.000)
		colorBeach     (0.303, 0.276, 0.262, 0.000)
		colorDesert    (0.320, 0.291, 0.277, 0.000)
		colorLowland   (0.337, 0.306, 0.291, 0.000)
		colorUpland    (0.354, 0.322, 0.306, 0.000)
		colorRock      (0.371, 0.337, 0.320, 0.000)
		colorSnow      (0.388, 0.352, 0.335, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0429231
		Period          0.1773
		Eccentricity    0.347853
		Inclination     11.6493
		AscendingNode   -99.5711
		ArgOfPericenter 75.1347
		MeanAnomaly     61.0819
	}
}

DwarfMoon	"7.D40"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.12404e-007
	Radius          67.4538
	InertiaMoment   0.398595

	Obliquity       -66.6563
	EqAscendNode    -69.411
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.731 0.639 0.589)

	Surface
	{
		SurfStyle       0.275957
		OceanStyle      0.466503
		Randomize      (0.423, 0.651, -0.247)
		colorDistMagn   0.450096
		colorDistFreq   2.74657
		detailScale     1841.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990231
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.756282
		terraceProb     0.291604
		erosion         0
		montesMagn      0.395666
		montesFreq      3.43113
		montesSpiky     0.974841
		montesFraction  0.731275
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.4646
		hillsFraction   0.714472
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244841
		craterFreq      0.21741
		craterDensity   0.871532
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.5444
		volcanoTemp     1317.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.256, 0.236, 0.000)
		colorShelf     (0.311, 0.271, 0.250, 0.000)
		colorBeach     (0.329, 0.287, 0.265, 0.000)
		colorDesert    (0.347, 0.303, 0.280, 0.000)
		colorLowland   (0.366, 0.319, 0.295, 0.000)
		colorUpland    (0.384, 0.335, 0.309, 0.000)
		colorRock      (0.402, 0.351, 0.324, 0.000)
		colorSnow      (0.421, 0.367, 0.339, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0434636
		Period          0.180659
		Eccentricity    0.278256
		Inclination     -66.6563
		AscendingNode   -69.411
		ArgOfPericenter 50.7105
		MeanAnomaly     20.8182
	}
}

DwarfMoon	"7.D41"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.53981e-007
	Radius          71.7233
	InertiaMoment   0.399577

	Obliquity       -77.1728
	EqAscendNode    106.969
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.718 0.629 0.590)

	Surface
	{
		SurfStyle       0.11752
		OceanStyle      0.382798
		Randomize      (-0.156, -0.281, -0.697)
		colorDistMagn   0.371841
		colorDistFreq   2.95874
		detailScale     1958.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94511
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.70978
		terraceProb     0.130504
		erosion         0
		montesMagn      0.599234
		montesFreq      2.84359
		montesSpiky     0.928546
		montesFraction  0.729483
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.5837
		hillsFraction   0.627255
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218465
		craterFreq      0.198327
		craterDensity   0.971834
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.6572
		volcanoTemp     1146.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.252, 0.236, 0.000)
		colorShelf     (0.305, 0.267, 0.251, 0.000)
		colorBeach     (0.323, 0.283, 0.266, 0.000)
		colorDesert    (0.341, 0.299, 0.280, 0.000)
		colorLowland   (0.359, 0.315, 0.295, 0.000)
		colorUpland    (0.377, 0.330, 0.310, 0.000)
		colorRock      (0.395, 0.346, 0.325, 0.000)
		colorSnow      (0.413, 0.362, 0.339, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0437754
		Period          0.182606
		Eccentricity    0.125628
		Inclination     -77.1728
		AscendingNode   106.969
		ArgOfPericenter -67.2655
		MeanAnomaly     131.159
	}
}

DwarfMoon	"7.D42"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.11953e-007
	Radius          94.8851
	InertiaMoment   0.397333

	Obliquity       65.8127
	EqAscendNode    -156.825
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.825 0.791 0.762)

	Surface
	{
		SurfStyle       0.453881
		OceanStyle      0.998903
		Randomize      (-0.505, 0.505, -0.986)
		colorDistMagn   0.58929
		colorDistFreq   4.29339
		detailScale     2591
		colorConversion true
		snowLevel       2
		tropicLatitude  0.360263
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.421099
		terraceProb     0.490565
		erosion         0
		montesMagn      0.598622
		montesFreq      2.62396
		montesSpiky     0.921672
		montesFraction  0.686449
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.0031
		hillsFraction   0.717651
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22225
		craterFreq      0.303298
		craterDensity   0.73661
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.3135
		volcanoTemp     1534.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.330, 0.316, 0.305, 0.000)
		colorShelf     (0.351, 0.336, 0.324, 0.000)
		colorBeach     (0.371, 0.356, 0.343, 0.000)
		colorDesert    (0.392, 0.376, 0.362, 0.000)
		colorLowland   (0.412, 0.395, 0.381, 0.000)
		colorUpland    (0.433, 0.415, 0.400, 0.000)
		colorRock      (0.454, 0.435, 0.419, 0.000)
		colorSnow      (0.474, 0.455, 0.438, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.044036
		Period          0.184239
		Eccentricity    0.277568
		Inclination     65.8127
		AscendingNode   -156.825
		ArgOfPericenter 167.874
		MeanAnomaly     96.2511
	}
}

DwarfMoon	"7.D43"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.935e-007
	Radius          97.5252
	InertiaMoment   0.398751

	Obliquity       75.975
	EqAscendNode    -102.215
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.642 0.498 0.368)

	Surface
	{
		SurfStyle       0.443817
		OceanStyle      0.475925
		Randomize      (0.988, 0.506, -0.277)
		colorDistMagn   0.948821
		colorDistFreq   7.89735
		detailScale     2663.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0.966175
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.303447
		terraceProb     0.134262
		erosion         0
		montesMagn      0.572608
		montesFreq      2.74261
		montesSpiky     0.998116
		montesFraction  0.837105
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.5255
		hillsFraction   0.493202
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21345
		craterFreq      0.235785
		craterDensity   0.872847
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   28.224
		volcanoTemp     1456.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.199, 0.147, 0.000)
		colorShelf     (0.273, 0.212, 0.157, 0.000)
		colorBeach     (0.289, 0.224, 0.166, 0.000)
		colorDesert    (0.305, 0.237, 0.175, 0.000)
		colorLowland   (0.321, 0.249, 0.184, 0.000)
		colorUpland    (0.337, 0.262, 0.193, 0.000)
		colorRock      (0.353, 0.274, 0.203, 0.000)
		colorSnow      (0.369, 0.287, 0.212, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0446981
		Period          0.18841
		Eccentricity    0.173832
		Inclination     75.975
		AscendingNode   -102.215
		ArgOfPericenter 161.042
		MeanAnomaly     23.5945
	}
}

DwarfMoon	"7.D44"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            4.09394e-007
	Radius          104.367
	InertiaMoment   0.399704

	RotationPeriod  3357.75
	Obliquity       10.5691
	EqAscendNode    -177.631

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.709 0.532 0.466)

	Surface
	{
		SurfStyle       0.499399
		OceanStyle      0.950407
		Randomize      (-0.246, 0.679, 0.519)
		colorDistMagn   0.937056
		colorDistFreq   2.08467
		detailScale     2849.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00758011
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.707435
		terraceProb     0.182041
		erosion         0
		montesMagn      0.475587
		montesFreq      3.31355
		montesSpiky     0.99369
		montesFraction  0.622674
		dunesFraction   0
		hillsMagn       0
		hillsFreq       28.8213
		hillsFraction   0.60548
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220063
		craterFreq      0.343801
		craterDensity   0.864937
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.574
		volcanoTemp     1871.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.213, 0.186, 0.000)
		colorShelf     (0.301, 0.226, 0.198, 0.000)
		colorBeach     (0.319, 0.239, 0.210, 0.000)
		colorDesert    (0.337, 0.253, 0.221, 0.000)
		colorLowland   (0.355, 0.266, 0.233, 0.000)
		colorUpland    (0.372, 0.279, 0.245, 0.000)
		colorRock      (0.390, 0.292, 0.256, 0.000)
		colorSnow      (0.408, 0.306, 0.268, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0451895
		Period          0.191526
		Eccentricity    0.488654
		Inclination     10.5691
		AscendingNode   -177.631
		ArgOfPericenter -32.3165
		MeanAnomaly     60.168
	}
}

DwarfMoon	"7.D45"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            5.76096e-007
	Radius          112.15
	InertiaMoment   0.397611

	RotationPeriod  3413.42
	Obliquity       -60.0292
	EqAscendNode    143.946

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.704 0.560 0.462)

	Surface
	{
		SurfStyle       0.703355
		OceanStyle      0.732702
		Randomize      (-0.507, -0.846, 0.900)
		colorDistMagn   0.756093
		colorDistFreq   5.38237
		detailScale     3062.44
		colorConversion true
		snowLevel       2
		tropicLatitude  0.516546
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.701877
		terraceProb     0.268697
		erosion         0
		montesMagn      0.400375
		montesFreq      2.81065
		montesSpiky     0.971706
		montesFraction  0.604825
		dunesFraction   0
		hillsMagn       0
		hillsFreq       34.2516
		hillsFraction   0.623053
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221398
		craterFreq      0.37773
		craterDensity   1.04574
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   23.1664
		volcanoTemp     1438.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.190, 0.129, 0.000)
		colorShelf     (0.281, 0.196, 0.148, 0.000)
		colorBeach     (0.331, 0.230, 0.176, 0.000)
		colorDesert    (0.359, 0.246, 0.171, 0.000)
		colorLowland   (0.394, 0.263, 0.194, 0.000)
		colorUpland    (0.436, 0.319, 0.236, 0.000)
		colorRock      (0.471, 0.347, 0.254, 0.000)
		colorSnow      (0.514, 0.370, 0.268, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0456875
		Period          0.1947
		Eccentricity    0.32572
		Inclination     -60.0292
		AscendingNode   143.946
		ArgOfPericenter 28.4596
		MeanAnomaly     -126.539
	}
}

DwarfMoon	"7.D46"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            8.19271e-007
	Radius          153.629
	InertiaMoment   0.398899

	RotationPeriod  2609.03
	Obliquity       -26.033
	EqAscendNode    -23.0044

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.476 0.470 0.463)

	Surface
	{
		SurfStyle       0.914354
		OceanStyle      0.351184
		Randomize      (-0.292, -0.755, 0.401)
		colorDistMagn   0.653059
		colorDistFreq   8.87261
		detailScale     4195.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.776536
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.38737
		terraceProb     0.302154
		erosion         0
		montesMagn      0.683217
		montesFreq      3.13162
		montesSpiky     0.967335
		montesFraction  0.548257
		dunesFraction   0
		hillsMagn       0
		hillsFreq       52.4602
		hillsFraction   0.615572
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253053
		craterFreq      0.626016
		craterDensity   0.724732
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.6113
		volcanoTemp     1665.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.165, 0.185, 0.050)
		colorShelf     (0.190, 0.193, 0.213, 0.040)
		colorBeach     (0.219, 0.221, 0.241, 0.030)
		colorDesert    (0.247, 0.249, 0.273, 0.020)
		colorLowland   (0.276, 0.277, 0.301, 0.030)
		colorUpland    (0.304, 0.306, 0.329, 0.050)
		colorRock      (0.333, 0.334, 0.366, 0.020)
		colorSnow      (0.333, 0.334, 0.366, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0462683
		Period          0.198425
		Eccentricity    0.300566
		Inclination     -26.033
		AscendingNode   -23.0044
		ArgOfPericenter -67.1925
		MeanAnomaly     53.0643
	}
}

DwarfMoon	"7.D47"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.1799e-006
	Radius          156.222
	InertiaMoment   0.39983

	RotationPeriod  2356.14
	Obliquity       -8.78882
	EqAscendNode    115.319

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.519 0.516 0.512)

	Surface
	{
		SurfStyle       0.862378
		OceanStyle      0.292569
		Randomize      (0.761, 0.126, 0.414)
		colorDistMagn   0.643182
		colorDistFreq   8.37387
		detailScale     4265.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0.162925
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.590405
		terraceProb     0.180127
		erosion         0
		montesMagn      0.431781
		montesFreq      3.32462
		montesSpiky     0.783132
		montesFraction  0.655475
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.8417
		hillsFraction   0.611779
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213163
		craterFreq      0.938643
		craterDensity   0.949193
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.5489
		volcanoTemp     1764.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.181, 0.205, 0.050)
		colorShelf     (0.208, 0.212, 0.236, 0.040)
		colorBeach     (0.239, 0.243, 0.266, 0.030)
		colorDesert    (0.270, 0.273, 0.302, 0.020)
		colorLowland   (0.301, 0.304, 0.333, 0.030)
		colorUpland    (0.332, 0.335, 0.364, 0.050)
		colorRock      (0.363, 0.366, 0.405, 0.020)
		colorSnow      (0.363, 0.366, 0.405, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0467591
		Period          0.20159
		Eccentricity    0.172422
		Inclination     -8.78882
		AscendingNode   115.319
		ArgOfPericenter 5.84207
		MeanAnomaly     135.191
	}
}

DwarfMoon	"7.D48"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.72523e-006
	Radius          169.53
	InertiaMoment   0.397848

	Obliquity       58.7904
	EqAscendNode    -49.8131
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.465 0.457 0.453)

	Surface
	{
		SurfStyle       0.731913
		OceanStyle      0.352855
		Randomize      (-0.204, -0.617, 0.500)
		colorDistMagn   0.67072
		colorDistFreq   4.23211
		detailScale     4629.3
		colorConversion true
		snowLevel       2
		tropicLatitude  0.97907
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.684123
		terraceProb     0.124717
		erosion         0
		montesMagn      0.397359
		montesFreq      3.29176
		montesSpiky     0.845354
		montesFraction  0.786646
		dunesFraction   0
		hillsMagn       0
		hillsFreq       56.1891
		hillsFraction   0.590588
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251423
		craterFreq      0.970216
		craterDensity   0.903929
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   20.2362
		volcanoTemp     1704.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.155, 0.127, 0.000)
		colorShelf     (0.186, 0.160, 0.145, 0.000)
		colorBeach     (0.218, 0.187, 0.172, 0.000)
		colorDesert    (0.237, 0.201, 0.167, 0.000)
		colorLowland   (0.260, 0.215, 0.190, 0.000)
		colorUpland    (0.288, 0.260, 0.231, 0.000)
		colorRock      (0.311, 0.283, 0.249, 0.000)
		colorSnow      (0.339, 0.302, 0.262, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0472454
		Period          0.204743
		Eccentricity    0.236319
		Inclination     58.7904
		AscendingNode   -49.8131
		ArgOfPericenter -156.177
		MeanAnomaly     -163.528
	}
}

DwarfMoon	"7.D49"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.56913e-006
	Radius          185.832
	InertiaMoment   0.399042

	RotationPeriod  5443.41
	Obliquity       -72.0647
	EqAscendNode    20.0014

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.424 0.418 0.415)

	Surface
	{
		SurfStyle       0.0982171
		OceanStyle      0.00778108
		Randomize      (-0.630, 0.280, 0.941)
		colorDistMagn   0.768425
		colorDistFreq   15.739
		detailScale     5074.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.654866
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.349344
		terraceProb     0.308806
		erosion         0
		montesMagn      0.461417
		montesFreq      3.46833
		montesSpiky     0.973771
		montesFraction  0.232292
		dunesFraction   0
		hillsMagn       0
		hillsFreq       90.1849
		hillsFraction   0.635676
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233665
		craterFreq      1.37764
		craterDensity   0.820901
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   18.1774
		volcanoTemp     1674.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.167, 0.166, 0.000)
		colorShelf     (0.180, 0.178, 0.176, 0.000)
		colorBeach     (0.191, 0.188, 0.187, 0.000)
		colorDesert    (0.202, 0.199, 0.197, 0.000)
		colorLowland   (0.212, 0.209, 0.207, 0.000)
		colorUpland    (0.223, 0.220, 0.218, 0.000)
		colorRock      (0.233, 0.230, 0.228, 0.000)
		colorSnow      (0.244, 0.241, 0.239, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.047591
		Period          0.206994
		Eccentricity    0.410363
		Inclination     -72.0647
		AscendingNode   20.0014
		ArgOfPericenter -81.1274
		MeanAnomaly     169.331
	}
}

Moon	"7.6"
{
	ParentBody     "7"
	Class	       "IceWorld"

	Mass            3.91192e-006
	Radius          289.22
	InertiaMoment   0.399955

	RotationPeriod  7318.46
	Obliquity       18.3013
	EqAscendNode    -147.798

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.641 0.635 0.633)

	Surface
	{
		SurfStyle       0.648749
		OceanStyle      0.0864986
		Randomize      (0.653, -0.442, -0.009)
		colorDistMagn   0.061374
		colorDistFreq   36.8979
		detailScale     743.891
		colorConversion true
		drivenDarkening 0.151088
		seaLevel        0.193253
		snowLevel       2
		tropicLatitude  0.173511
		icecapLatitude  0.943255
		icecapHeight    0.197659
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.7085
		venusFreq       1.44505
		venusMagn       0.216966
		mareFreq        0
		mareDensity     5.14659e-007
		terraceProb     0.255353
		erosion         0
		montesMagn      0.0510838
		montesFreq      18.044
		montesSpiky     0.816873
		montesFraction  0.313756
		dunesMagn       0.0283849
		dunesFreq       373.277
		dunesFraction   0.706638
		hillsMagn       0.116218
		hillsFreq       29.1886
		hillsFraction   0.605989
		hills2Fraction  0.212315
		riversMagn      57.0932
		riversFreq      3.52413
		riversSin       6.4705
		riversOctaves   0
		canyonsMagn     0.652783
		canyonsFreq     0.0995742
		canyonFraction  0
		cracksMagn      0.0272536
		cracksFreq      0.145876
		cracksOctaves   0
		craterMagn      0.855627
		craterFreq      0.794136
		craterDensity   0.948865
		craterOctaves   8
		craterRayedFactor 0.372232
		volcanoMagn     0.197847
		volcanoFreq     0.862241
		volcanoDensity  0.0544867
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.219181
		volcanoRadius   4.94206
		volcanoTemp     1569.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.121, 0.070, 1.000)
		colorShelf     (0.218, 0.165, 0.101, 1.000)
		colorBeach     (0.353, 0.216, 0.108, 0.200)
		colorDesert    (0.385, 0.241, 0.127, 0.200)
		colorLowland   (0.417, 0.254, 0.133, 0.200)
		colorUpland    (0.449, 0.305, 0.158, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.417, 0.254, 0.133, 0.200)
		colorUpPlants  (0.449, 0.305, 0.158, 0.200)
		BumpHeight      14.461
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
		SemiMajorAxis   0.0478555
		Period          0.208722
		Eccentricity    0.390402
		Inclination     18.3013
		AscendingNode   -147.798
		ArgOfPericenter 163.909
		MeanAnomaly     -170.868
	}
}

Moon	"7.7"
{
	ParentBody     "7"
	Class	       "IceWorld"

	Mass            6.1222e-006
	Radius          272.64
	InertiaMoment   0.398059

	RotationPeriod  5552.76
	Obliquity       71.9353
	EqAscendNode    -81.8744

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.688 0.533 0.460)

	Surface
	{
		SurfStyle       0.456675
		OceanStyle      0.810953
		Randomize      (-0.136, -0.917, -0.894)
		colorDistMagn   0.0654969
		colorDistFreq   42.3451
		detailScale     701.245
		colorConversion true
		drivenDarkening 0.149926
		seaLevel        0.171052
		snowLevel       2
		tropicLatitude  0.999501
		icecapLatitude  1
		icecapHeight    0.171052
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.00683
		venusFreq       1.21897
		venusMagn       0.206962
		mareFreq        0
		mareDensity     1.25354e-006
		terraceProb     0.153827
		erosion         0
		montesMagn      0.0481074
		montesFreq      17.1155
		montesSpiky     0.978493
		montesFraction  0.332376
		dunesMagn       0.0458673
		dunesFreq       363.482
		dunesFraction   0.125416
		hillsMagn       0.120011
		hillsFreq       30.1342
		hillsFraction   0.875845
		hills2Fraction  0.0956261
		riversMagn      55.0731
		riversFreq      3.95571
		riversSin       7.80315
		riversOctaves   0
		canyonsMagn     0.466854
		canyonsFreq     0.104358
		canyonFraction  0
		cracksMagn      0.0234999
		cracksFreq      0.142758
		cracksOctaves   0
		craterMagn      0.866593
		craterFreq      0.662215
		craterDensity   0.828148
		craterOctaves   8
		craterRayedFactor 0.303528
		volcanoMagn     0.188299
		volcanoFreq     1.1316
		volcanoDensity  0.0625483
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.366047
		volcanoRadius   4.88736
		volcanoTemp     1545.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.133, 0.101, 0.000)
		colorShelf     (0.255, 0.165, 0.129, 0.000)
		colorBeach     (0.386, 0.250, 0.193, 0.200)
		colorDesert    (0.351, 0.234, 0.170, 0.500)
		colorLowland   (0.268, 0.181, 0.129, 0.800)
		colorUpland    (0.454, 0.320, 0.239, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.268, 0.181, 0.129, 0.800)
		colorUpPlants  (0.454, 0.320, 0.239, 1.000)
		BumpHeight      13.632
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
		SemiMajorAxis   0.0482262
		Period          0.211152
		Eccentricity    0.320683
		Inclination     71.9353
		AscendingNode   -81.8744
		ArgOfPericenter 48.2623
		MeanAnomaly     50.1083
	}
}

DwarfMoon	"7.D50"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.01249e-011
	Radius          3.86684
	InertiaMoment   0.39918

	Obliquity       -14.8601
	EqAscendNode    -40.2285
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.836 0.779 0.753)

	Surface
	{
		SurfStyle       0.527316
		OceanStyle      0.595595
		Randomize      (-0.198, 0.818, -0.399)
		colorDistMagn   0.491422
		colorDistFreq   0.00140938
		detailScale     105.591
		colorConversion true
		snowLevel       2
		tropicLatitude  0.467461
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.542377
		terraceProb     0.258576
		erosion         0
		montesMagn      0.476995
		montesFreq      3.11912
		montesSpiky     0.95454
		montesFraction  0.499054
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0279856
		hillsFraction   0.583532
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266962
		craterFreq      0.277845
		craterDensity   1.05415
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   135.144
		volcanoTemp     1738.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.326, 0.265, 0.211, 0.000)
		colorShelf     (0.335, 0.273, 0.241, 0.000)
		colorBeach     (0.393, 0.320, 0.286, 0.000)
		colorDesert    (0.427, 0.343, 0.279, 0.000)
		colorLowland   (0.468, 0.366, 0.316, 0.000)
		colorUpland    (0.519, 0.444, 0.384, 0.000)
		colorRock      (0.560, 0.483, 0.414, 0.000)
		colorSnow      (0.611, 0.514, 0.437, 1.000)
		BumpHeight      3.48016
		BumpOffset      0.696032
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0485011
		Period          0.21296
		Eccentricity    0.124866
		Inclination     -14.8601
		AscendingNode   -40.2285
		ArgOfPericenter -91.2843
		MeanAnomaly     -123.92
	}
}

DwarfMoon	"7.D51"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            3.83266e-011
	Radius          4.60343
	InertiaMoment   0.395705

	Obliquity       -22.0419
	EqAscendNode    -57.2739
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.671 0.668 0.665)

	Surface
	{
		SurfStyle       0.14259
		OceanStyle      0.526888
		Randomize      (-0.683, 0.750, -0.805)
		colorDistMagn   0.505806
		colorDistFreq   0.00465605
		detailScale     125.704
		colorConversion true
		snowLevel       2
		tropicLatitude  0.621995
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453274
		terraceProb     0.330308
		erosion         0
		montesMagn      0.5389
		montesFreq      1.90224
		montesSpiky     0.915564
		montesFraction  0.450585
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0562453
		hillsFraction   0.599852
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236921
		craterFreq      0.246162
		craterDensity   0.936283
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   116.584
		volcanoTemp     1128.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.267, 0.266, 0.000)
		colorShelf     (0.285, 0.284, 0.283, 0.000)
		colorBeach     (0.302, 0.300, 0.299, 0.000)
		colorDesert    (0.319, 0.317, 0.316, 0.000)
		colorLowland   (0.336, 0.334, 0.333, 0.000)
		colorUpland    (0.352, 0.351, 0.349, 0.000)
		colorRock      (0.369, 0.367, 0.366, 0.000)
		colorSnow      (0.386, 0.384, 0.382, 1.000)
		BumpHeight      4.14309
		BumpOffset      0.828617
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0489227
		Period          0.215743
		Eccentricity    0.428838
		Inclination     -22.0419
		AscendingNode   -57.2739
		ArgOfPericenter -84.4098
		MeanAnomaly     -47.1532
	}
}

DwarfMoon	"7.D52"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            6.774e-011
	Radius          5.20489
	InertiaMoment   0.39825

	Obliquity       18.6379
	EqAscendNode    158.398
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.551 0.544 0.538)

	Surface
	{
		SurfStyle       0.772595
		OceanStyle      0.0117462
		Randomize      (0.379, -0.049, -0.838)
		colorDistMagn   0.747246
		colorDistFreq   0.0152057
		detailScale     142.128
		colorConversion true
		snowLevel       2
		tropicLatitude  0.119563
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622004
		terraceProb     0.37664
		erosion         0
		montesMagn      0.347327
		montesFreq      3.49475
		montesSpiky     0.906082
		montesFraction  0.510864
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0550448
		hillsFraction   0.803881
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207891
		craterFreq      0.171112
		craterDensity   1.08876
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   99.1506
		volcanoTemp     1651.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.185, 0.151, 0.000)
		colorShelf     (0.220, 0.190, 0.172, 0.000)
		colorBeach     (0.259, 0.223, 0.204, 0.000)
		colorDesert    (0.281, 0.239, 0.199, 0.000)
		colorLowland   (0.308, 0.256, 0.226, 0.000)
		colorUpland    (0.341, 0.310, 0.274, 0.000)
		colorRock      (0.369, 0.337, 0.296, 0.000)
		colorSnow      (0.402, 0.359, 0.312, 1.000)
		BumpHeight      4.6844
		BumpOffset      0.936881
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0494844
		Period          0.219469
		Eccentricity    0.00565276
		Inclination     18.6379
		AscendingNode   158.398
		ArgOfPericenter -27.2953
		MeanAnomaly     -59.999
	}
}

DwarfMoon	"7.D53"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.13369e-010
	Radius          7.2775
	InertiaMoment   0.399314

	Obliquity       -55.4155
	EqAscendNode    -20.7231
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.677 0.672 0.670)

	Surface
	{
		SurfStyle       0.888804
		OceanStyle      0.445767
		Randomize      (-0.568, -0.356, -0.035)
		colorDistMagn   0.718618
		colorDistFreq   0.00590746
		detailScale     198.724
		colorConversion true
		snowLevel       2
		tropicLatitude  0.950161
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.347487
		terraceProb     0.474869
		erosion         0
		montesMagn      0.611914
		montesFreq      3.52849
		montesSpiky     0.925242
		montesFraction  0.486888
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.128278
		hillsFraction   0.604822
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231006
		craterFreq      0.244606
		craterDensity   0.978957
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   107.162
		volcanoTemp     1129.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.235, 0.268, 0.050)
		colorShelf     (0.271, 0.276, 0.308, 0.040)
		colorBeach     (0.312, 0.316, 0.349, 0.030)
		colorDesert    (0.352, 0.356, 0.396, 0.020)
		colorLowland   (0.393, 0.397, 0.436, 0.030)
		colorUpland    (0.433, 0.437, 0.476, 0.050)
		colorRock      (0.474, 0.477, 0.530, 0.020)
		colorSnow      (0.474, 0.477, 0.530, 1.000)
		BumpHeight      6.54975
		BumpOffset      1.30995
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0499506
		Period          0.222578
		Eccentricity    0.0785423
		Inclination     -55.4155
		AscendingNode   -20.7231
		ArgOfPericenter -113.64
		MeanAnomaly     92.8523
	}
}

DwarfMoon	"7.D54"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.82014e-010
	Radius          8.1036
	InertiaMoment   0.396517

	RotationPeriod  5936.53
	Obliquity       57.2417
	EqAscendNode    -66.4884

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.468 0.464 0.461)

	Surface
	{
		SurfStyle       0.31133
		OceanStyle      0.362018
		Randomize      (0.183, 0.537, -0.716)
		colorDistMagn   0.625694
		colorDistFreq   0.0491741
		detailScale     221.282
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999943
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.34118
		terraceProb     0.153317
		erosion         0
		montesMagn      0.518449
		montesFreq      3.9538
		montesSpiky     0.971409
		montesFraction  0.476481
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.186744
		hillsFraction   0.73923
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238177
		craterFreq      0.233721
		craterDensity   0.902532
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   94.1742
		volcanoTemp     1276.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.186, 0.185, 0.000)
		colorShelf     (0.199, 0.197, 0.196, 0.000)
		colorBeach     (0.210, 0.209, 0.208, 0.000)
		colorDesert    (0.222, 0.221, 0.219, 0.000)
		colorLowland   (0.234, 0.232, 0.231, 0.000)
		colorUpland    (0.246, 0.244, 0.242, 0.000)
		colorRock      (0.257, 0.255, 0.254, 0.000)
		colorSnow      (0.269, 0.267, 0.265, 1.000)
		BumpHeight      7.29324
		BumpOffset      1.45865
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0504234
		Period          0.225746
		Eccentricity    0.146184
		Inclination     57.2417
		AscendingNode   -66.4884
		ArgOfPericenter -148.859
		MeanAnomaly     11.9403
	}
}

DwarfMoon	"7.D55"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.82864e-010
	Radius          9.01669
	InertiaMoment   0.398427

	RotationPeriod  6014
	Obliquity       18.9393
	EqAscendNode    -34.1534

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.548 0.542 0.540)

	Surface
	{
		SurfStyle       0.604803
		OceanStyle      0.731248
		Randomize      (-0.109, 0.459, -0.240)
		colorDistMagn   0.504349
		colorDistFreq   0.0713549
		detailScale     246.216
		colorConversion true
		snowLevel       2
		tropicLatitude  0.589893
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.626461
		terraceProb     0.218299
		erosion         0
		montesMagn      0.5653
		montesFreq      2.9992
		montesSpiky     0.905459
		montesFraction  0.322012
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.232418
		hillsFraction   0.613515
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219593
		craterFreq      0.182827
		craterDensity   0.850561
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   84.0551
		volcanoTemp     1540.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.184, 0.151, 0.000)
		colorShelf     (0.219, 0.190, 0.173, 0.000)
		colorBeach     (0.258, 0.222, 0.205, 0.000)
		colorDesert    (0.280, 0.239, 0.200, 0.000)
		colorLowland   (0.307, 0.255, 0.227, 0.000)
		colorUpland    (0.340, 0.309, 0.275, 0.000)
		colorRock      (0.367, 0.336, 0.297, 0.000)
		colorSnow      (0.400, 0.358, 0.313, 1.000)
		BumpHeight      8.11502
		BumpOffset      1.623
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0508611
		Period          0.228691
		Eccentricity    0.232587
		Inclination     18.9393
		AscendingNode   -34.1534
		ArgOfPericenter -160.677
		MeanAnomaly     -20.672
	}
}

DwarfMoon	"7.D56"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            4.2828e-010
	Radius          9.79276
	InertiaMoment   0.399445

	Obliquity       -34.9005
	EqAscendNode    36.0806
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.783 0.779 0.777)

	Surface
	{
		SurfStyle       0.512642
		OceanStyle      0.151271
		Randomize      (0.823, -0.384, 0.903)
		colorDistMagn   0.665823
		colorDistFreq   0.0494073
		detailScale     267.408
		colorConversion true
		snowLevel       2
		tropicLatitude  0.912949
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.36384
		terraceProb     0.207061
		erosion         0
		montesMagn      0.461544
		montesFreq      3.74225
		montesSpiky     0.995375
		montesFraction  0.798284
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.210914
		hillsFraction   0.708419
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217122
		craterFreq      0.196113
		craterDensity   1.02709
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   74.1903
		volcanoTemp     1176.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.265, 0.218, 0.000)
		colorShelf     (0.313, 0.273, 0.249, 0.000)
		colorBeach     (0.368, 0.320, 0.295, 0.000)
		colorDesert    (0.399, 0.343, 0.287, 0.000)
		colorLowland   (0.438, 0.366, 0.326, 0.000)
		colorUpland    (0.485, 0.444, 0.396, 0.000)
		colorRock      (0.524, 0.483, 0.427, 0.000)
		colorSnow      (0.571, 0.514, 0.451, 1.000)
		BumpHeight      8.81348
		BumpOffset      1.7627
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0511347
		Period          0.230539
		Eccentricity    0.0943991
		Inclination     -34.9005
		AscendingNode   36.0806
		ArgOfPericenter -30.3749
		MeanAnomaly     86.9543
	}
}

DwarfMoon	"7.D57"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            6.34832e-010
	Radius          13.0541
	InertiaMoment   0.396983

	Obliquity       47.8535
	EqAscendNode    -154.473
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.494 0.489 0.484)

	Surface
	{
		SurfStyle       0.437278
		OceanStyle      0.0125273
		Randomize      (0.774, -0.146, 0.555)
		colorDistMagn   0.474562
		colorDistFreq   0.086434
		detailScale     356.465
		colorConversion true
		snowLevel       2
		tropicLatitude  0.323186
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.414562
		terraceProb     0.677975
		erosion         0
		montesMagn      0.522594
		montesFreq      3.28389
		montesSpiky     0.965379
		montesFraction  0.80279
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.513663
		hillsFraction   0.456911
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278426
		craterFreq      0.260254
		craterDensity   0.928811
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   81.2315
		volcanoTemp     1770.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.196, 0.194, 0.000)
		colorShelf     (0.210, 0.208, 0.206, 0.000)
		colorBeach     (0.222, 0.220, 0.218, 0.000)
		colorDesert    (0.235, 0.232, 0.230, 0.000)
		colorLowland   (0.247, 0.245, 0.242, 0.000)
		colorUpland    (0.259, 0.257, 0.254, 0.000)
		colorRock      (0.272, 0.269, 0.266, 0.000)
		colorSnow      (0.284, 0.281, 0.278, 1.000)
		BumpHeight      11.7487
		BumpOffset      2.34974
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0515797
		Period          0.233555
		Eccentricity    0.152302
		Inclination     47.8535
		AscendingNode   -154.473
		ArgOfPericenter 134.834
		MeanAnomaly     -106.878
	}
}

DwarfMoon	"7.D58"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            9.24695e-010
	Radius          14.0146
	InertiaMoment   0.398592

	Obliquity       -15.1503
	EqAscendNode    28.3454
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.693 0.689 0.686)

	Surface
	{
		SurfStyle       0.774736
		OceanStyle      0.0811743
		Randomize      (-0.018, -0.391, -0.203)
		colorDistMagn   0.893426
		colorDistFreq   0.0619096
		detailScale     382.692
		colorConversion true
		snowLevel       2
		tropicLatitude  0.490255
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544944
		terraceProb     0.180464
		erosion         0
		montesMagn      0.672469
		montesFreq      3.0535
		montesSpiky     0.883773
		montesFraction  0.37716
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.301064
		hillsFraction   0.759438
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229503
		craterFreq      0.260746
		craterDensity   0.963091
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   72.2582
		volcanoTemp     1431.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.234, 0.192, 0.000)
		colorShelf     (0.277, 0.241, 0.220, 0.000)
		colorBeach     (0.326, 0.282, 0.261, 0.000)
		colorDesert    (0.354, 0.303, 0.254, 0.000)
		colorLowland   (0.388, 0.324, 0.288, 0.000)
		colorUpland    (0.430, 0.393, 0.350, 0.000)
		colorRock      (0.465, 0.427, 0.377, 0.000)
		colorSnow      (0.506, 0.455, 0.398, 1.000)
		BumpHeight      12.6131
		BumpOffset      2.52263
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0521608
		Period          0.237513
		Eccentricity    0.031005
		Inclination     -15.1503
		AscendingNode   28.3454
		ArgOfPericenter 40.1758
		MeanAnomaly     123.301
	}
}

DwarfMoon	"7.D59"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.3275e-009
	Radius          15.1842
	InertiaMoment   0.399574

	Obliquity       -0.60964
	EqAscendNode    -95.1336
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.718 0.716 0.712)

	Surface
	{
		SurfStyle       0.855806
		OceanStyle      0.912102
		Randomize      (0.891, -0.235, 0.525)
		colorDistMagn   0.984627
		colorDistFreq   0.0699374
		detailScale     414.629
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0143563
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.744113
		terraceProb     0.140577
		erosion         0
		montesMagn      0.407493
		montesFreq      2.6365
		montesSpiky     0.768392
		montesFraction  0.495097
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.690525
		hillsFraction   0.58863
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218362
		craterFreq      0.208818
		craterDensity   0.845402
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   65.3401
		volcanoTemp     1706.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.251, 0.285, 0.050)
		colorShelf     (0.287, 0.293, 0.327, 0.040)
		colorBeach     (0.330, 0.336, 0.370, 0.030)
		colorDesert    (0.373, 0.379, 0.420, 0.020)
		colorLowland   (0.417, 0.422, 0.463, 0.030)
		colorUpland    (0.460, 0.465, 0.505, 0.050)
		colorRock      (0.503, 0.508, 0.562, 0.020)
		colorSnow      (0.503, 0.508, 0.562, 1.000)
		BumpHeight      13.6658
		BumpOffset      2.73315
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.052495
		Period          0.239799
		Eccentricity    0.0858724
		Inclination     -0.60964
		AscendingNode   -95.1336
		ArgOfPericenter 113.698
		MeanAnomaly     -16.284
	}
}

DwarfMoon	"7.D60"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.88285e-009
	Radius          16.232
	InertiaMoment   0.397326

	Obliquity       -75.8227
	EqAscendNode    108.429
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.648 0.644 0.641)

	Surface
	{
		SurfStyle       0.540458
		OceanStyle      0.134303
		Randomize      (-0.039, 0.846, -0.286)
		colorDistMagn   0.668027
		colorDistFreq   0.178465
		detailScale     443.243
		colorConversion true
		snowLevel       2
		tropicLatitude  0.934046
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.739051
		terraceProb     0.543222
		erosion         0
		montesMagn      0.493697
		montesFreq      2.37956
		montesSpiky     0.809333
		montesFraction  0.833296
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.66525
		hillsFraction   0.474417
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230901
		craterFreq      0.216973
		craterDensity   0.790968
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   58.6505
		volcanoTemp     1682.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.219, 0.179, 0.000)
		colorShelf     (0.259, 0.226, 0.205, 0.000)
		colorBeach     (0.304, 0.264, 0.243, 0.000)
		colorDesert    (0.330, 0.283, 0.237, 0.000)
		colorLowland   (0.363, 0.303, 0.269, 0.000)
		colorUpland    (0.402, 0.367, 0.327, 0.000)
		colorRock      (0.434, 0.399, 0.352, 0.000)
		colorSnow      (0.473, 0.425, 0.372, 1.000)
		BumpHeight      14.6088
		BumpOffset      2.92177
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0530459
		Period          0.243584
		Eccentricity    0.343628
		Inclination     -75.8227
		AscendingNode   108.429
		ArgOfPericenter -24.167
		MeanAnomaly     -149.313
	}
}

DwarfMoon	"7.D61"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            2.64365e-009
	Radius          21.2513
	InertiaMoment   0.398748

	RotationPeriod  4327.9
	Obliquity       -56.2187
	EqAscendNode    -13.3796

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.711 0.598 0.481)

	Surface
	{
		SurfStyle       0.552924
		OceanStyle      0.55433
		Randomize      (0.239, 0.692, 0.326)
		colorDistMagn   0.903573
		colorDistFreq   0.233037
		detailScale     580.301
		colorConversion true
		snowLevel       2
		tropicLatitude  0.931819
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.748161
		terraceProb     0.24876
		erosion         0
		montesMagn      0.390822
		montesFreq      2.5217
		montesSpiky     0.963787
		montesFraction  0.399016
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.996235
		hillsFraction   0.890487
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220882
		craterFreq      0.259271
		craterDensity   0.915208
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   64.8021
		volcanoTemp     1775.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.203, 0.135, 0.000)
		colorShelf     (0.284, 0.209, 0.154, 0.000)
		colorBeach     (0.334, 0.245, 0.183, 0.000)
		colorDesert    (0.363, 0.263, 0.178, 0.000)
		colorLowland   (0.398, 0.281, 0.202, 0.000)
		colorUpland    (0.441, 0.341, 0.245, 0.000)
		colorRock      (0.476, 0.371, 0.265, 0.000)
		colorSnow      (0.519, 0.395, 0.279, 1.000)
		BumpHeight      19.1261
		BumpOffset      3.82523
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0535208
		Period          0.246862
		Eccentricity    0.126565
		Inclination     -56.2187
		AscendingNode   -13.3796
		ArgOfPericenter -152.695
		MeanAnomaly     7.55682
	}
}

DwarfMoon	"7.D62"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            3.68076e-009
	Radius          22.3492
	InertiaMoment   0.399701

	Obliquity       -88.6311
	EqAscendNode    54.7456
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.468 0.461 0.457)

	Surface
	{
		SurfStyle       0.704594
		OceanStyle      0.836771
		Randomize      (0.191, -0.053, 0.019)
		colorDistMagn   0.678934
		colorDistFreq   0.066709
		detailScale     610.281
		colorConversion true
		snowLevel       2
		tropicLatitude  0.817233
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.426589
		terraceProb     0.302251
		erosion         0
		montesMagn      0.619916
		montesFreq      2.70291
		montesSpiky     0.832188
		montesFraction  0.930585
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.16643
		hillsFraction   0.756283
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203757
		craterFreq      0.157711
		craterDensity   1.04598
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.7562
		volcanoTemp     1773.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.157, 0.128, 0.000)
		colorShelf     (0.187, 0.161, 0.146, 0.000)
		colorBeach     (0.220, 0.189, 0.174, 0.000)
		colorDesert    (0.239, 0.203, 0.169, 0.000)
		colorLowland   (0.262, 0.217, 0.192, 0.000)
		colorUpland    (0.290, 0.263, 0.233, 0.000)
		colorRock      (0.314, 0.286, 0.251, 0.000)
		colorSnow      (0.342, 0.304, 0.265, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0541472
		Period          0.251209
		Eccentricity    0.131559
		Inclination     -88.6311
		AscendingNode   54.7456
		ArgOfPericenter 7.16753
		MeanAnomaly     132.283
	}
}

DwarfMoon	"7.D63"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            5.08916e-009
	Radius          23.9002
	InertiaMoment   0.397605

	Obliquity       -39.8094
	EqAscendNode    135.192
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.597 0.536 0.440)

	Surface
	{
		SurfStyle       0.236122
		OceanStyle      0.536154
		Randomize      (-0.008, 0.549, -0.781)
		colorDistMagn   0.886891
		colorDistFreq   0.368484
		detailScale     652.635
		colorConversion true
		snowLevel       2
		tropicLatitude  0.473279
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589533
		terraceProb     0.131486
		erosion         0
		montesMagn      0.564692
		montesFreq      1.83037
		montesSpiky     0.993738
		montesFraction  0.722285
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.68197
		hillsFraction   0.420378
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215019
		craterFreq      0.222093
		craterDensity   0.911087
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   52.5272
		volcanoTemp     1266.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.214, 0.176, 0.000)
		colorShelf     (0.254, 0.228, 0.187, 0.000)
		colorBeach     (0.269, 0.241, 0.198, 0.000)
		colorDesert    (0.284, 0.255, 0.209, 0.000)
		colorLowland   (0.299, 0.268, 0.220, 0.000)
		colorUpland    (0.314, 0.281, 0.231, 0.000)
		colorRock      (0.329, 0.295, 0.242, 0.000)
		colorSnow      (0.343, 0.308, 0.253, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0546964
		Period          0.25504
		Eccentricity    0.42412
		Inclination     -39.8094
		AscendingNode   135.192
		ArgOfPericenter -127.957
		MeanAnomaly     101.805
	}
}

DwarfMoon	"7.D64"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            6.99653e-009
	Radius          25.3789
	InertiaMoment   0.398896

	Obliquity       -17.893
	EqAscendNode    -139.889
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.732 0.681 0.596)

	Surface
	{
		SurfStyle       0.27289
		OceanStyle      0.816723
		Randomize      (-0.238, -0.580, 0.225)
		colorDistMagn   0.010301
		colorDistFreq   0.210856
		detailScale     693.013
		colorConversion true
		snowLevel       2
		tropicLatitude  0.209549
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539556
		terraceProb     0.163363
		erosion         0
		montesMagn      0.538078
		montesFreq      2.36108
		montesSpiky     0.904877
		montesFraction  0.55765
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.03747
		hillsFraction   0.708059
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245688
		craterFreq      0.17008
		craterDensity   1.01456
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.5705
		volcanoTemp     1375.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.272, 0.238, 0.000)
		colorShelf     (0.311, 0.289, 0.253, 0.000)
		colorBeach     (0.330, 0.306, 0.268, 0.000)
		colorDesert    (0.348, 0.323, 0.283, 0.000)
		colorLowland   (0.366, 0.340, 0.298, 0.000)
		colorUpland    (0.384, 0.357, 0.313, 0.000)
		colorRock      (0.403, 0.374, 0.328, 0.000)
		colorSnow      (0.421, 0.391, 0.343, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0551305
		Period          0.258083
		Eccentricity    0.377461
		Inclination     -17.893
		AscendingNode   -139.889
		ArgOfPericenter 116.305
		MeanAnomaly     -121.193
	}
}

DwarfMoon	"7.D65"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            9.57514e-009
	Radius          33.1121
	InertiaMoment   0.399827

	RotationPeriod  5745.33
	Obliquity       78.1784
	EqAscendNode    -124.908

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.761 0.716 0.658)

	Surface
	{
		SurfStyle       0.182972
		OceanStyle      0.873308
		Randomize      (0.321, 0.130, -0.177)
		colorDistMagn   0.682761
		colorDistFreq   0.829469
		detailScale     904.182
		colorConversion true
		snowLevel       2
		tropicLatitude  0.807245
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.400101
		terraceProb     0.446451
		erosion         0
		montesMagn      0.366005
		montesFreq      2.57548
		montesSpiky     0.984327
		montesFraction  0.436911
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.30696
		hillsFraction   0.755634
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25818
		craterFreq      0.199569
		craterDensity   0.8949
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   53.0543
		volcanoTemp     1582.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.286, 0.263, 0.000)
		colorShelf     (0.323, 0.304, 0.280, 0.000)
		colorBeach     (0.343, 0.322, 0.296, 0.000)
		colorDesert    (0.362, 0.340, 0.312, 0.000)
		colorLowland   (0.381, 0.358, 0.329, 0.000)
		colorUpland    (0.400, 0.376, 0.345, 0.000)
		colorRock      (0.419, 0.394, 0.362, 0.000)
		colorSnow      (0.438, 0.412, 0.378, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0557111
		Period          0.26217
		Eccentricity    0.352846
		Inclination     78.1784
		AscendingNode   -124.908
		ArgOfPericenter 141.06
		MeanAnomaly     131.887
	}
}

DwarfMoon	"7.D66"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.30581e-008
	Radius          34.3087
	InertiaMoment   0.397844

	Obliquity       48.7441
	EqAscendNode    -132.552
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.513 0.449 0.345)

	Surface
	{
		SurfStyle       0.211883
		OceanStyle      0.304304
		Randomize      (-0.040, -0.496, 0.874)
		colorDistMagn   0.847743
		colorDistFreq   0.30496
		detailScale     936.855
		colorConversion true
		snowLevel       2
		tropicLatitude  0.576594
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.317687
		terraceProb     0.112824
		erosion         0
		montesMagn      0.494265
		montesFreq      2.87433
		montesSpiky     0.967457
		montesFraction  0.82512
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.85125
		hillsFraction   0.654796
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274448
		craterFreq      0.155027
		craterDensity   0.855158
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.0727
		volcanoTemp     1328.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.179, 0.138, 0.000)
		colorShelf     (0.218, 0.191, 0.147, 0.000)
		colorBeach     (0.231, 0.202, 0.155, 0.000)
		colorDesert    (0.244, 0.213, 0.164, 0.000)
		colorLowland   (0.256, 0.224, 0.173, 0.000)
		colorUpland    (0.269, 0.236, 0.181, 0.000)
		colorRock      (0.282, 0.247, 0.190, 0.000)
		colorSnow      (0.295, 0.258, 0.199, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0562542
		Period          0.266013
		Eccentricity    0.146811
		Inclination     48.7441
		AscendingNode   -132.552
		ArgOfPericenter 33.6873
		MeanAnomaly     82.7332
	}
}

DwarfMoon	"7.D67"
{
	ParentBody     "7"
	Class	       "Asteroid"

	Mass            1.77627e-008
	Radius          36.4586
	InertiaMoment   0.399039

	Obliquity       -44.8665
	EqAscendNode    145.654
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.655 0.652 0.651)

	Surface
	{
		SurfStyle       0.865191
		OceanStyle      0.584728
		Randomize      (0.647, 0.687, -0.552)
		colorDistMagn   0.716651
		colorDistFreq   0.678561
		detailScale     995.564
		colorConversion true
		snowLevel       2
		tropicLatitude  0.407449
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.37817
		terraceProb     0.493653
		erosion         0
		montesMagn      0.589081
		montesFreq      3.09175
		montesSpiky     0.975757
		montesFraction  0.837836
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.42728
		hillsFraction   0.742489
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275796
		craterFreq      0.262685
		craterDensity   0.836738
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.8896
		volcanoTemp     1676.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.228, 0.260, 0.050)
		colorShelf     (0.262, 0.267, 0.299, 0.040)
		colorBeach     (0.301, 0.307, 0.338, 0.030)
		colorDesert    (0.341, 0.346, 0.384, 0.020)
		colorLowland   (0.380, 0.385, 0.423, 0.030)
		colorUpland    (0.419, 0.424, 0.462, 0.050)
		colorRock      (0.459, 0.463, 0.514, 0.020)
		colorSnow      (0.459, 0.463, 0.514, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0568435
		Period          0.270204
		Eccentricity    0.0385
		Inclination     -44.8665
		AscendingNode   145.654
		ArgOfPericenter -39.646
		MeanAnomaly     -64.0713
	}
}

Planet	"8"
{
	ParentBody     "CN Leo"
	Class	       "IceGiant"

	Mass            23.1284
	Radius          22630.6
	InertiaMoment   0.206237

	Oblateness      0.0301262

	RotationPeriod  8.9342
	Obliquity       22.0951
	EqAscendNode    55.9228

	AlbedoBond      0.417347
	AlbedoGeom      0.500816
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.618318
		Randomize      (-0.798, 0.568, -0.897)
		detailScale     58207.2
		colorConversion true
		tropicLatitude  0.37506
		icecapLatitude  1
		mainFreq        0.0282211
		venusFreq       6.98928
		venusMagn       0.313783
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      6.62348
		twistMagn       0.670665
		cycloneMagn     8.8793
		cycloneFreq     0.357012
		cycloneDensity  0.102507
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
		BumpHeight      14.7557
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          57.0664
		BumpHeight      52.226
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.925206
		mainOctaves     10
		Coverage        0.0867341
		twistZones      6.62348
		twistMagn       0.670665
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          226.306
		Density         4900.76
		Pressure        388779
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0263623
		Saturation      0.53263

		Composition
		{
			H2    	92.3612
			He    	7.62369
			N2    	0.0139292
			Ne    	0.00111257
			O2    	3.18144e-005
			Ar    	1.06326e-005
		}
	}

	Aurora
	{
		Height      477.792
		NorthLat    76.8346
		NorthLon    144.372
		NorthRadius 6187.58
		NorthWidth  7077.16
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -90
		SouthLon    331.768
		SouthRadius 4973.99
		SouthWidth  6122.36
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
		SemiMajorAxis   1.39862
		Period          5.5114
		Eccentricity    0.0578327
		Inclination     -0.118322
		AscendingNode   55.3682
		ArgOfPericenter 203.533
		MeanAnomaly     235.663
	}
}

DwarfMoon	"8.D1"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            3.51908e-007
	Radius          97.0058
	InertiaMoment   0.398383

	Oblateness      0.249

	Obliquity       0.00947038
	EqAscendNode    -67.725
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.782 0.730 0.638)

	Surface
	{
		SurfStyle       0.359299
		OceanStyle      0.817373
		Randomize      (0.561, -0.391, 0.977)
		colorDistMagn   0.270828
		colorDistFreq   5.37662
		detailScale     2648.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53998
		terraceProb     0.450527
		erosion         0
		montesMagn      0.580378
		montesFreq      3.50065
		montesSpiky     0.93656
		montesFraction  0.518691
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.8927
		hillsFraction   0.618218
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266237
		craterFreq      0.287611
		craterDensity   0.847364
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.6383
		volcanoTemp     1488.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.292, 0.255, 0.000)
		colorShelf     (0.332, 0.310, 0.271, 0.000)
		colorBeach     (0.352, 0.329, 0.287, 0.000)
		colorDesert    (0.371, 0.347, 0.303, 0.000)
		colorLowland   (0.391, 0.365, 0.319, 0.000)
		colorUpland    (0.411, 0.383, 0.335, 0.000)
		colorRock      (0.430, 0.402, 0.351, 0.000)
		colorSnow      (0.450, 0.420, 0.367, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000368319
		Period          0.000850048
		Eccentricity    9.12712e-006
		Inclination     0.00947038
		AscendingNode   -67.725
		ArgOfPericenter -98.5018
		MeanAnomaly     -107.27
	}
}

DwarfMoon	"8.D2"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            4.9314e-007
	Radius          102.713
	InertiaMoment   0.399412

	Oblateness      0.249

	Obliquity       0.00789552
	EqAscendNode    -122.116
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.698 0.573 0.475)

	Surface
	{
		SurfStyle       0.702281
		OceanStyle      0.891348
		Randomize      (0.256, -0.378, -0.566)
		colorDistMagn   0.580562
		colorDistFreq   5.76825
		detailScale     2804.75
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.501063
		terraceProb     0.279817
		erosion         0
		montesMagn      0.491441
		montesFreq      2.54057
		montesSpiky     0.881333
		montesFraction  0.408006
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.223
		hillsFraction   0.513183
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241772
		craterFreq      0.456855
		craterDensity   0.785232
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.9323
		volcanoTemp     1341.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.195, 0.133, 0.000)
		colorShelf     (0.279, 0.200, 0.152, 0.000)
		colorBeach     (0.328, 0.235, 0.180, 0.000)
		colorDesert    (0.356, 0.252, 0.176, 0.000)
		colorLowland   (0.391, 0.269, 0.199, 0.000)
		colorUpland    (0.432, 0.326, 0.242, 0.000)
		colorRock      (0.467, 0.355, 0.261, 0.000)
		colorSnow      (0.509, 0.378, 0.275, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000391897
		Period          0.000932964
		Eccentricity    4.92415e-006
		Inclination     0.00789552
		AscendingNode   -122.116
		ArgOfPericenter -169.821
		MeanAnomaly     -88.7076
	}
}

DwarfMoon	"8.D3"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            6.97801e-007
	Radius          134.799
	InertiaMoment   0.39688

	Oblateness      0.249

	Obliquity       0.00809905
	EqAscendNode    34.4883
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.733 0.706 0.671)

	Surface
	{
		SurfStyle       0.609487
		OceanStyle      0.258681
		Randomize      (-0.020, -0.346, 0.007)
		colorDistMagn   0.803106
		colorDistFreq   6.8005
		detailScale     3680.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.698259
		terraceProb     0.148547
		erosion         0
		montesMagn      0.585942
		montesFreq      2.81842
		montesSpiky     0.920247
		montesFraction  0.64129
		dunesFraction   0
		hillsMagn       0
		hillsFreq       42.2663
		hillsFraction   0.529295
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261443
		craterFreq      0.496982
		craterDensity   0.768618
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.3003
		volcanoTemp     1425.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.286, 0.240, 0.188, 0.000)
		colorShelf     (0.293, 0.247, 0.215, 0.000)
		colorBeach     (0.345, 0.289, 0.255, 0.000)
		colorDesert    (0.374, 0.311, 0.248, 0.000)
		colorLowland   (0.411, 0.332, 0.282, 0.000)
		colorUpland    (0.455, 0.402, 0.342, 0.000)
		colorRock      (0.491, 0.438, 0.369, 0.000)
		colorSnow      (0.535, 0.466, 0.389, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000445115
		Period          0.00112931
		Eccentricity    5.97594e-005
		Inclination     0.00809905
		AscendingNode   34.4883
		ArgOfPericenter -3.55334
		MeanAnomaly     -3.09413
	}
}

DwarfMoon	"8.D4"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            9.98964e-007
	Radius          143.848
	InertiaMoment   0.398551

	Oblateness      0.205086

	Obliquity       -0.00764956
	EqAscendNode    -114.607
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.443 0.441 0.438)

	Surface
	{
		SurfStyle       0.393144
		OceanStyle      0.545533
		Randomize      (-0.248, 0.437, 0.642)
		colorDistMagn   0.654315
		colorDistFreq   12.9086
		detailScale     3928
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532685
		terraceProb     0.228251
		erosion         0
		montesMagn      0.522944
		montesFreq      2.60804
		montesSpiky     0.834099
		montesFraction  0.789661
		dunesFraction   0
		hillsMagn       0
		hillsFreq       45.24
		hillsFraction   0.522304
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225293
		craterFreq      0.646928
		craterDensity   0.805101
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   22.5649
		volcanoTemp     1812
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.177, 0.176, 0.175, 0.000)
		colorShelf     (0.188, 0.187, 0.186, 0.000)
		colorBeach     (0.199, 0.198, 0.197, 0.000)
		colorDesert    (0.210, 0.209, 0.208, 0.000)
		colorLowland   (0.222, 0.220, 0.219, 0.000)
		colorUpland    (0.233, 0.231, 0.230, 0.000)
		colorRock      (0.244, 0.242, 0.241, 0.000)
		colorSnow      (0.255, 0.253, 0.252, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000498946
		Period          0.00134025
		Eccentricity    5.06488e-005
		Inclination     -0.00764956
		AscendingNode   -114.607
		ArgOfPericenter 169.648
		MeanAnomaly     -8.86475
	}
}

Moon	"8.1"
{
	ParentBody     "8"
	Class	       "Selena"

	Mass            0.00976334
	Radius          1864.36
	InertiaMoment   0.378991

	Oblateness      0.0141345

	Obliquity       -0.433857
	EqAscendNode    159.975
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.765 0.690 0.569)

	Surface
	{
		SurfStyle       0.409655
		OceanStyle      0.82695
		Randomize      (-0.233, 0.441, 0.033)
		colorDistMagn   0.0873865
		colorDistFreq   246.776
		detailScale     4795.25
		colorConversion true
		drivenDarkening 0
		seaLevel        0.0829357
		snowLevel       2
		tropicLatitude  0.00262947
		icecapLatitude  0.918666
		icecapHeight    0.0871072
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.99127
		venusFreq       1.57306
		venusMagn       0
		mareFreq        1.17454
		mareDensity     0.00184733
		terraceProb     0.430107
		erosion         0
		montesMagn      0.0973831
		montesFreq      78.1693
		montesSpiky     0.958734
		montesFraction  0.675681
		dunesMagn       0.0445796
		dunesFreq       2461.28
		dunesFraction   0.711239
		hillsMagn       0.124322
		hillsFreq       211.493
		hillsFraction   0.869557
		hills2Fraction  0
		riversMagn      67.1234
		riversFreq      2.20371
		riversSin       5.26362
		riversOctaves   0
		canyonsMagn     0.487898
		canyonsFreq     0.744373
		canyonFraction  0.334739
		cracksMagn      0.0766872
		cracksFreq      0.975068
		cracksOctaves   0
		craterMagn      0.656149
		craterFreq      3.95282
		craterDensity   0.699258
		craterOctaves   7.91283
		craterRayedFactor 0.104316
		volcanoMagn     0.310147
		volcanoFreq     3.12603
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.452043
		volcanoRadius   0.770636
		volcanoTemp     1757.38
		lavaCoverTidal  0.311836
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.421, 0.393, 0.341, 0.000)
		colorDesert    (0.367, 0.317, 0.262, 0.000)
		colorLowland   (0.467, 0.421, 0.319, 0.000)
		colorUpland    (0.498, 0.449, 0.347, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.994883
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
		Height          93.2182
		Density         0.000511749
		Pressure        0.000203514
		Greenhouse      0.0734989
		Bright          3.48186
		Opacity         0
		SkyLight        1.16062
		Hue             -0.0232937
		Saturation      1

		Composition
		{
			CO2   	77.8832
			CH4   	8.72828
			NH3   	7.12972
			C2H2  	2.35559
			SO2   	1.33068
			H2S   	0.972366
			C2H6  	0.609741
			N2    	0.489243
			C2H4  	0.226704
			H2O   	0.21415
			C3H8  	0.0591483
			CO    	0.00109369
			Cl2   	6.35031e-005
			Ar    	2.26036e-005
			Ne    	2.05419e-005
			Kr    	1.21467e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000720009
		Period          0.00232286
		Eccentricity    0.0114139
		Inclination     -0.433857
		AscendingNode   159.975
		ArgOfPericenter -176.525
		MeanAnomaly     61.8625
	}
}

Moon	"8.2"
{
	ParentBody     "8"
	Class	       "Selena"

	Mass            0.0120898
	Radius          1881.38
	InertiaMoment   0.37353

	Oblateness      0.00145722

	Obliquity       1.08531
	EqAscendNode    -129.987
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.507 0.423 0.379)

	Surface
	{
		SurfStyle       0.589252
		OceanStyle      0.100377
		Randomize      (-0.997, 0.198, 0.559)
		colorDistMagn   0.0813602
		colorDistFreq   291.579
		detailScale     4839.02
		colorConversion true
		drivenDarkening 0
		seaLevel        0.174448
		snowLevel       2
		tropicLatitude  0.0160126
		icecapLatitude  0.940539
		icecapHeight    0.178812
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.89291
		venusFreq       1.29241
		venusMagn       0
		mareFreq        0.956302
		mareDensity     0.00222379
		terraceProb     0.489676
		erosion         0
		montesMagn      0.0791232
		montesFreq      111.743
		montesSpiky     0.961314
		montesFraction  0.985061
		dunesMagn       0.0562662
		dunesFreq       2466.64
		dunesFraction   0.786034
		hillsMagn       0.132834
		hillsFreq       180.366
		hillsFraction   0.463042
		hills2Fraction  0
		riversMagn      58.5692
		riversFreq      1.63805
		riversSin       5.78901
		riversOctaves   0
		canyonsMagn     0.627335
		canyonsFreq     0.629995
		canyonFraction  0.828926
		cracksMagn      0.0363823
		cracksFreq      0.930264
		cracksOctaves   0
		craterMagn      0.660872
		craterFreq      4.90266
		craterDensity   0.648136
		craterOctaves   9.03056
		craterRayedFactor 0.293688
		volcanoMagn     0.306799
		volcanoFreq     2.94136
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.311286
		volcanoRadius   0.657568
		volcanoTemp     1135.47
		lavaCoverTidal  0.198933
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.314, 0.258, 0.204, 0.000)
		colorDesert    (0.330, 0.262, 0.208, 0.000)
		colorLowland   (0.259, 0.195, 0.159, 0.000)
		colorUpland    (0.380, 0.300, 0.235, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.994696
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
		Height          141.104
		Density         0.000530426
		Pressure        0.00030729
		Greenhouse      0.55419
		Bright          3.50691
		Opacity         0
		SkyLight        1.16897
		Hue             -0.0155423
		Saturation      1

		Composition
		{
			CH4   	98.951
			N2    	0.786277
			C2H4  	0.21344
			C2H2  	0.0442924
			C2H6  	0.00273069
			CO    	0.00165537
			Ne    	0.000503494
			Ar    	7.51242e-005
			Kr    	1.96894e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00143326
		Period          0.00652348
		Eccentricity    0.044529
		Inclination     1.08531
		AscendingNode   -129.987
		ArgOfPericenter 86.8514
		MeanAnomaly     52.423
	}
}

Moon	"8.3"
{
	ParentBody     "8"
	Class	       "Selena"

	Mass            0.0152735
	Radius          2158.67
	InertiaMoment   0.367862

	Obliquity       -0.567793
	EqAscendNode    67.6848
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.467 0.461 0.457)

	Surface
	{
		SurfStyle       0.397581
		OceanStyle      0.455743
		Randomize      (0.239, -0.585, -0.188)
		colorDistMagn   0.0603103
		colorDistFreq   229.653
		detailScale     5552.23
		colorConversion true
		drivenDarkening 0
		seaLevel        0.313875
		snowLevel       2
		tropicLatitude  0.0164604
		icecapLatitude  0.846119
		icecapHeight    0.322513
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.02355
		venusFreq       1.22585
		venusMagn       0
		mareFreq        1.4677
		mareDensity     0.00258342
		terraceProb     0.393448
		erosion         0
		montesMagn      0.124489
		montesFreq      84.8033
		montesSpiky     0.899002
		montesFraction  0.271667
		dunesMagn       0.04342
		dunesFreq       2816.19
		dunesFraction   0.254183
		hillsMagn       0.133825
		hillsFreq       220.293
		hillsFraction   0.461592
		hills2Fraction  0
		riversMagn      62.5333
		riversFreq      3.2314
		riversSin       5.56884
		riversOctaves   0
		canyonsMagn     0.46174
		canyonsFreq     0.631156
		canyonFraction  0.1564
		cracksMagn      0.0696912
		cracksFreq      0.766506
		cracksOctaves   0
		craterMagn      0.558809
		craterFreq      5.18296
		craterDensity   0.748345
		craterOctaves   10.9219
		craterRayedFactor 0.401425
		volcanoMagn     0.446106
		volcanoFreq     3.15189
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.0517581
		volcanoRadius   0.719305
		volcanoTemp     1701.5
		lavaCoverTidal  0.00789261
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.257, 0.263, 0.274, 0.000)
		colorDesert    (0.224, 0.212, 0.210, 0.000)
		colorLowland   (0.285, 0.281, 0.256, 0.000)
		colorUpland    (0.304, 0.299, 0.279, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999453
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
		Height          161.9
		Density         5.47298e-005
		Pressure        9.64366e-006
		Greenhouse      0.0377716
		Bright          2.22661
		Opacity         0
		SkyLight        0.742204
		Hue             -0.00779094
		Saturation      1

		Composition
		{
			N2    	96.6788
			CH4   	3.08279
			CO    	0.122497
			Ar    	0.109755
			Ne    	0.00603361
			O2    	7.41966e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00202217
		Period          0.0109317
		Eccentricity    0.0216433
		Inclination     -0.567793
		AscendingNode   67.6848
		ArgOfPericenter -32.7583
		MeanAnomaly     109.505
	}
}

Planet	"9"
{
	ParentBody     "CN Leo"
	Class	       "IceGiant"

	Mass            21.1812
	Radius          22045
	InertiaMoment   0.223898

	Oblateness      0.0286395

	RotationPeriod  9.47669
	Obliquity       50.6647
	EqAscendNode    39.1857

	AlbedoBond      0.412171
	AlbedoGeom      0.494606
	Brightness      2
	Color          (1.000 1.000 1.000)

	Surface
	{
		SurfStyle       0.513215
		Randomize      (-0.304, -0.164, 0.782)
		detailScale     56700.9
		colorConversion true
		tropicLatitude  0.755046
		icecapLatitude  1
		mainFreq        0.0268994
		venusFreq       4.07569
		venusMagn       0.474611
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      6.63628
		twistMagn       0.685604
		cycloneMagn     14.4076
		cycloneFreq     0.232614
		cycloneDensity  0.10161
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
		BumpHeight      15.02
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          56.1055
		BumpHeight      57.4687
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.88492
		mainOctaves     10
		Coverage        0.0608564
		twistZones      6.63628
		twistMagn       0.685604
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          220.45
		Density         5806.96
		Pressure        330218
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.00617828
		Saturation      0.59114

		Composition
		{
			H2    	91.5208
			He    	8.47803
			Ne    	0.00116953
		}
	}

	Aurora
	{
		Height      355.54
		NorthLat    55.9399
		NorthLon    -148.011
		NorthRadius 4825.53
		NorthWidth  2639.59
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -62.2499
		SouthLon    36.0826
		SouthRadius 6328
		SouthWidth  4383.18
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
		SemiMajorAxis   2.83874
		Period          15.9373
		Eccentricity    0.00303004
		Inclination     -2.19856
		AscendingNode   41.3335
		ArgOfPericenter 245.618
		MeanAnomaly     21.0872
	}
}

DwarfMoon	"9.D1"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            6.6106e-010
	Radius          12.9943
	InertiaMoment   0.397955

	Oblateness      0.249

	Obliquity       0.00280637
	EqAscendNode    -126.249
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.598 0.593 0.590)

	Surface
	{
		SurfStyle       0.537125
		OceanStyle      0.0429311
		Randomize      (-0.566, -0.903, -0.686)
		colorDistMagn   0.166563
		colorDistFreq   0.0943323
		detailScale     354.83
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.620369
		terraceProb     0.169026
		erosion         0
		montesMagn      0.588781
		montesFreq      3.16632
		montesSpiky     0.901685
		montesFraction  0.728078
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.36629
		hillsFraction   0.686923
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266962
		craterFreq      0.202234
		craterDensity   0.999543
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   79.2388
		volcanoTemp     1702.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.202, 0.165, 0.000)
		colorShelf     (0.239, 0.208, 0.189, 0.000)
		colorBeach     (0.281, 0.243, 0.224, 0.000)
		colorDesert    (0.305, 0.261, 0.218, 0.000)
		colorLowland   (0.335, 0.279, 0.248, 0.000)
		colorUpland    (0.371, 0.338, 0.301, 0.000)
		colorRock      (0.401, 0.368, 0.324, 0.000)
		colorSnow      (0.436, 0.391, 0.342, 1.000)
		BumpHeight      11.6948
		BumpOffset      2.33897
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000381779
		Period          0.000937395
		Eccentricity    5.91937e-005
		Inclination     0.00280637
		AscendingNode   -126.249
		ArgOfPericenter -80.6385
		MeanAnomaly     43.0089
	}
}

DwarfMoon	"9.D2"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            9.61299e-010
	Radius          14.0387
	InertiaMoment   0.399111

	Oblateness      0.249

	Obliquity       -0.0114966
	EqAscendNode    98.605
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.461 0.452 0.448)

	Surface
	{
		SurfStyle       0.645659
		OceanStyle      0.338263
		Randomize      (0.589, -0.360, 0.784)
		colorDistMagn   0.918615
		colorDistFreq   0.144675
		detailScale     383.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.474539
		terraceProb     0.15209
		erosion         0
		montesMagn      0.541294
		montesFreq      3.48911
		montesSpiky     0.964648
		montesFraction  0.558416
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.585681
		hillsFraction   0.782622
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216376
		craterFreq      0.229835
		craterDensity   0.758601
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   70.9911
		volcanoTemp     1379.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.154, 0.125, 0.000)
		colorShelf     (0.184, 0.158, 0.143, 0.000)
		colorBeach     (0.217, 0.185, 0.170, 0.000)
		colorDesert    (0.235, 0.199, 0.166, 0.000)
		colorLowland   (0.258, 0.212, 0.188, 0.000)
		colorUpland    (0.286, 0.258, 0.229, 0.000)
		colorRock      (0.309, 0.280, 0.246, 0.000)
		colorSnow      (0.337, 0.298, 0.260, 1.000)
		BumpHeight      12.6348
		BumpOffset      2.52697
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000433608
		Period          0.00113462
		Eccentricity    6.42359e-005
		Inclination     -0.0114966
		AscendingNode   98.6049
		ArgOfPericenter 40.7698
		MeanAnomaly     11.8505
	}
}

Moon	"9.1"
{
	ParentBody     "9"
	Class	       "IceWorld"

	Mass            0.000289534
	Radius          548.685
	InertiaMoment   0.399968

	Oblateness      0.00978499

	Obliquity       -1.22307
	EqAscendNode    -100.689
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.587 0.580 0.575)

	Surface
	{
		SurfStyle       0.547724
		OceanStyle      0.794603
		Randomize      (-0.353, -0.584, -0.732)
		colorDistMagn   0.060383
		colorDistFreq   62.9922
		detailScale     1411.25
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.203147
		snowLevel       2
		tropicLatitude  0.0272408
		icecapLatitude  0.459518
		icecapHeight    0.21241
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.64163
		venusFreq       0.682259
		venusMagn       0
		mareFreq        0
		mareDensity     0.000202953
		terraceProb     0.510493
		erosion         0
		montesMagn      0.0554129
		montesFreq      22.3501
		montesSpiky     0.924188
		montesFraction  0.936657
		dunesMagn       0.0378395
		dunesFreq       730.048
		dunesFraction   0.479906
		hillsMagn       0.108638
		hillsFreq       58.1675
		hillsFraction   0.179138
		hills2Fraction  0.214224
		riversMagn      61.5185
		riversFreq      3.66527
		riversSin       7.76224
		riversOctaves   0
		canyonsMagn     0.538358
		canyonsFreq     0.223946
		canyonFraction  0
		cracksMagn      0.0710099
		cracksFreq      0.124199
		cracksOctaves   0
		craterMagn      0.539579
		craterFreq      1.32828
		craterDensity   0.905179
		craterOctaves   9
		craterRayedFactor 0.423004
		volcanoMagn     0.210194
		volcanoFreq     0.790985
		volcanoDensity  0.0586574
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.255762
		volcanoRadius   0.999741
		volcanoTemp     1886.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.145, 0.127, 0.000)
		colorShelf     (0.217, 0.180, 0.161, 0.000)
		colorBeach     (0.329, 0.273, 0.242, 0.200)
		colorDesert    (0.299, 0.255, 0.213, 0.500)
		colorLowland   (0.229, 0.197, 0.161, 0.800)
		colorUpland    (0.387, 0.348, 0.299, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.229, 0.197, 0.161, 0.800)
		colorUpPlants  (0.387, 0.348, 0.299, 1.000)
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
		SemiMajorAxis   0.000771356
		Period          0.00269206
		Eccentricity    0.0137982
		Inclination     -1.22307
		AscendingNode   -100.689
		ArgOfPericenter 75.143
		MeanAnomaly     171.946
	}
}

Moon	"9.2"
{
	ParentBody     "9"
	Class	       "IceWorld"

	Mass            0.00034566
	Radius          618.224
	InertiaMoment   0.399505

	Oblateness      0.00278879

	Obliquity       -0.570537
	EqAscendNode    22.9895
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.683 0.676 0.673)

	Surface
	{
		SurfStyle       0.351949
		OceanStyle      0.010479
		Randomize      (0.796, -0.800, 0.545)
		colorDistMagn   0.0729928
		colorDistFreq   74.7666
		detailScale     1590.11
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.155312
		snowLevel       2
		tropicLatitude  0.0195151
		icecapLatitude  0.970132
		icecapHeight    0.156681
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.61008
		venusFreq       1.54778
		venusMagn       0
		mareFreq        0.013945
		mareDensity     0.000259143
		terraceProb     0.246927
		erosion         0
		montesMagn      0.072
		montesFreq      29.2975
		montesSpiky     0.942543
		montesFraction  0.0794929
		dunesMagn       0.0539776
		dunesFreq       829.722
		dunesFraction   0.115226
		hillsMagn       0.135151
		hillsFreq       72.5482
		hillsFraction   0.469358
		hills2Fraction  0.0706218
		riversMagn      61.0284
		riversFreq      2.65066
		riversSin       6.17514
		riversOctaves   0
		canyonsMagn     0.520984
		canyonsFreq     0.242307
		canyonFraction  0
		cracksMagn      0.0661521
		cracksFreq      0.241397
		cracksOctaves   0
		craterMagn      0.551031
		craterFreq      2.0412
		craterDensity   0.964305
		craterOctaves   9
		craterRayedFactor 0.497565
		volcanoMagn     0.223815
		volcanoFreq     0.818025
		volcanoDensity  0.0486334
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.135675
		volcanoRadius   1.06619
		volcanoTemp     1769.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.683, 0.676, 0.673, 0.500)
		colorShelf     (0.648, 0.642, 0.639, 0.500)
		colorBeach     (0.478, 0.473, 0.471, 0.750)
		colorDesert    (0.580, 0.575, 0.572, 1.000)
		colorLowland   (0.601, 0.595, 0.592, 1.000)
		colorUpland    (0.635, 0.629, 0.626, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.601, 0.595, 0.592, 1.000)
		colorUpPlants  (0.635, 0.629, 0.626, 1.000)
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
		SemiMajorAxis   0.00124421
		Period          0.00551492
		Eccentricity    0.0387495
		Inclination     -0.570537
		AscendingNode   22.9895
		ArgOfPericenter -13.105
		MeanAnomaly     160.215
	}
}

Moon	"9.3"
{
	ParentBody     "9"
	Class	       "IceWorld"

	Mass            0.00409524
	Radius          1318.43
	InertiaMoment   0.395368

	Obliquity       -0.203717
	EqAscendNode    128.289
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.601 0.569 0.501)

	Surface
	{
		SurfStyle       0.567916
		OceanStyle      0.23854
		Randomize      (-0.699, 0.909, 0.473)
		colorDistMagn   0.0545684
		colorDistFreq   199.874
		detailScale     3391.07
		colorConversion true
		drivenDarkening 0
		seaLevel        0.238807
		snowLevel       2
		tropicLatitude  0.0031074
		icecapLatitude  0.633921
		icecapHeight    0.272006
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.66793
		venusFreq       1.28145
		venusMagn       0.130666
		mareFreq        0.496739
		mareDensity     0.00140726
		terraceProb     0.123106
		erosion         0
		montesMagn      0.0528192
		montesFreq      50.8758
		montesSpiky     0.993523
		montesFraction  0.645664
		dunesMagn       0.031112
		dunesFreq       1700.61
		dunesFraction   0.963745
		hillsMagn       0.137759
		hillsFreq       165.214
		hillsFraction   0.0715559
		hills2Fraction  0.270066
		riversMagn      54.6465
		riversFreq      3.7226
		riversSin       7.10459
		riversOctaves   0
		canyonsMagn     0.486509
		canyonsFreq     0.425856
		canyonFraction  0
		cracksMagn      0.0457706
		cracksFreq      0.40367
		cracksOctaves   1
		craterMagn      0.662732
		craterFreq      3.39769
		craterDensity   0.863665
		craterOctaves   11
		craterRayedFactor 0.156107
		volcanoMagn     0.185052
		volcanoFreq     0.987649
		volcanoDensity  0.0661975
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.269389
		volcanoRadius   0.797564
		volcanoTemp     1272.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.142, 0.110, 0.000)
		colorShelf     (0.223, 0.176, 0.140, 0.000)
		colorBeach     (0.337, 0.268, 0.210, 0.200)
		colorDesert    (0.307, 0.250, 0.185, 0.500)
		colorLowland   (0.235, 0.194, 0.140, 0.800)
		colorUpland    (0.397, 0.342, 0.260, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.235, 0.194, 0.140, 0.800)
		colorUpPlants  (0.397, 0.342, 0.260, 1.000)
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
		Height          98.8822
		Density         5.3638e-008
		Pressure        6.26777e-009
		Greenhouse      0.00133632
		Bright          0.55705
		Opacity         0
		SkyLight        0.185683
		Hue             -0.0325052
		Saturation      1

		Composition
		{
			N2    	96.9766
			Ne    	3.02131
			Ar    	0.00195228
			CO    	7.81321e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00200692
		Period          0.0112968
		Eccentricity    0.0182362
		Inclination     -0.203717
		AscendingNode   128.289
		ArgOfPericenter 82.8183
		MeanAnomaly     166.68
	}
}

Moon	"9.4"
{
	ParentBody     "9"
	Class	       "IceWorld"

	Mass            0.000482206
	Radius          690.432
	InertiaMoment   0.398454

	Obliquity       -1.15908
	EqAscendNode    49.4446
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.629 0.517 0.458)

	Surface
	{
		SurfStyle       0.201621
		OceanStyle      0.142682
		Randomize      (-0.698, -0.131, -0.398)
		colorDistMagn   0.0899636
		colorDistFreq   94.9964
		detailScale     1775.83
		colorConversion true
		drivenDarkening 0.637302
		seaLevel        0.212913
		snowLevel       2
		tropicLatitude  0.0367432
		icecapLatitude  0.828345
		icecapHeight    0.22955
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.604
		venusFreq       0.94898
		venusMagn       0.132553
		mareFreq        0.0647364
		mareDensity     0.000263371
		terraceProb     0.402749
		erosion         0
		montesMagn      0.0504171
		montesFreq      36.5107
		montesSpiky     0.915602
		montesFraction  0.880242
		dunesMagn       0.0578434
		dunesFreq       895.346
		dunesFraction   0.516076
		hillsMagn       0.146619
		hillsFreq       82.61
		hillsFraction   0.324676
		hills2Fraction  0.182094
		riversMagn      65.4117
		riversFreq      3.0701
		riversSin       4.26348
		riversOctaves   0
		canyonsMagn     0.275185
		canyonsFreq     0.263264
		canyonFraction  0
		cracksMagn      0.0385382
		cracksFreq      0.193508
		cracksOctaves   0
		craterMagn      0.560113
		craterFreq      1.77497
		craterDensity   0.739346
		craterOctaves   9
		craterRayedFactor 0.192186
		volcanoMagn     0.212354
		volcanoFreq     0.947831
		volcanoDensity  0.0603465
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.463452
		volcanoRadius   1.1681
		volcanoTemp     1377.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.629, 0.517, 0.458, 0.500)
		colorShelf     (0.598, 0.491, 0.435, 0.500)
		colorBeach     (0.441, 0.362, 0.321, 0.750)
		colorDesert    (0.535, 0.439, 0.389, 1.000)
		colorLowland   (0.554, 0.455, 0.403, 1.000)
		colorUpland    (0.585, 0.480, 0.426, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.554, 0.455, 0.403, 1.000)
		colorUpPlants  (0.585, 0.480, 0.426, 1.000)
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
		SemiMajorAxis   0.00323718
		Period          0.0231446
		Eccentricity    0.00818196
		Inclination     -1.15908
		AscendingNode   49.4446
		ArgOfPericenter 103.353
		MeanAnomaly     117.827
	}
}

Moon	"9.5"
{
	ParentBody     "9"
	Class	       "IceWorld"

	Mass            0.00056498
	Radius          684.926
	InertiaMoment   0.397734

	Obliquity       0.705915
	EqAscendNode    125.979
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.777 0.649 0.604)

	Surface
	{
		SurfStyle       0.783475
		OceanStyle      0.70418
		Randomize      (-0.829, -0.621, -0.899)
		colorDistMagn   0.06387
		colorDistFreq   95.549
		detailScale     1761.67
		colorConversion true
		drivenDarkening 0.395101
		seaLevel        0.17468
		snowLevel       2
		tropicLatitude  0.0111931
		icecapLatitude  0.546307
		icecapHeight    0.190538
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.59122
		venusFreq       1.2318
		venusMagn       0
		mareFreq        0.0747877
		mareDensity     0.000360104
		terraceProb     0.448328
		erosion         0
		montesMagn      0.0610445
		montesFreq      40.3474
		montesSpiky     0.895868
		montesFraction  0.665993
		dunesMagn       0.0353354
		dunesFreq       898.971
		dunesFraction   0.052877
		hillsMagn       0.116143
		hillsFreq       79.6563
		hillsFraction   0.338169
		hills2Fraction  0.23122
		riversMagn      62.7594
		riversFreq      3.106
		riversSin       6.5631
		riversOctaves   0
		canyonsMagn     0.387634
		canyonsFreq     0.182862
		canyonFraction  0
		cracksMagn      0.0725345
		cracksFreq      0.27447
		cracksOctaves   0
		craterMagn      0.624677
		craterFreq      1.47401
		craterDensity   0.929248
		craterOctaves   9
		craterRayedFactor 0.257105
		volcanoMagn     0.17864
		volcanoFreq     0.799922
		volcanoDensity  0.054256
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.259745
		volcanoRadius   0.903484
		volcanoTemp     1697.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.497, 0.415, 0.405, 0.250)
		colorShelf     (0.544, 0.474, 0.459, 0.250)
		colorBeach     (0.443, 0.351, 0.351, 0.200)
		colorDesert    (0.412, 0.318, 0.308, 0.200)
		colorLowland   (0.303, 0.247, 0.254, 0.200)
		colorUpland    (0.575, 0.480, 0.459, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.303, 0.247, 0.254, 0.200)
		colorUpPlants  (0.575, 0.480, 0.459, 0.250)
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
		SemiMajorAxis   0.0052216
		Period          0.0474137
		Eccentricity    0.0138976
		Inclination     0.705915
		AscendingNode   125.979
		ArgOfPericenter -72.5351
		MeanAnomaly     -125.084
	}
}

Moon	"9.6"
{
	ParentBody     "9"
	Class	       "IceWorld"

	Mass            0.000659351
	Radius          765.917
	InertiaMoment   0.396435

	Obliquity       -0.389547
	EqAscendNode    158.379
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.765 0.674 0.524)

	Surface
	{
		SurfStyle       0.930803
		OceanStyle      0.534197
		Randomize      (0.130, 0.832, 0.385)
		colorDistMagn   0.0650274
		colorDistFreq   77.4533
		detailScale     1969.98
		colorConversion true
		drivenDarkening 0.244946
		seaLevel        0.193689
		snowLevel       2
		tropicLatitude  0.00256057
		icecapLatitude  0.686943
		icecapHeight    0.20994
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.88722
		venusFreq       1.01222
		venusMagn       0.19916
		mareFreq        0.121806
		mareDensity     0.00031817
		terraceProb     0.218805
		erosion         0
		montesMagn      0.0562778
		montesFreq      37.52
		montesSpiky     0.848163
		montesFraction  0.33588
		dunesMagn       0.0504735
		dunesFreq       997.467
		dunesFraction   0.20734
		hillsMagn       0.121713
		hillsFreq       90.9895
		hillsFraction   0.304495
		hills2Fraction  0.115693
		riversMagn      61.2091
		riversFreq      2.88292
		riversSin       5.78449
		riversOctaves   0
		canyonsMagn     0.663876
		canyonsFreq     0.284049
		canyonFraction  0
		cracksMagn      0.0438955
		cracksFreq      0.526504
		cracksOctaves   0
		craterMagn      0.603684
		craterFreq      1.92367
		craterDensity   0.829327
		craterOctaves   10
		craterRayedFactor 0.445529
		volcanoMagn     0.207701
		volcanoFreq     1.10402
		volcanoDensity  0.0602347
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.0549421
		volcanoRadius   1.29077
		volcanoTemp     1748.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.581, 0.479, 0.304, 1.000)
		colorShelf     (0.581, 0.479, 0.304, 1.000)
		colorBeach     (0.535, 0.418, 0.262, 1.000)
		colorDesert    (0.535, 0.418, 0.262, 1.000)
		colorLowland   (0.650, 0.546, 0.398, 1.000)
		colorUpland    (0.681, 0.600, 0.451, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.650, 0.546, 0.398, 1.000)
		colorUpPlants  (0.681, 0.600, 0.451, 1.000)
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
		SemiMajorAxis   0.00842249
		Period          0.0971312
		Eccentricity    0.0046293
		Inclination     -0.389547
		AscendingNode   158.379
		ArgOfPericenter -82.6335
		MeanAnomaly     -120.419
	}
}

DwarfMoon	"9.D3"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            9.89548e-009
	Radius          32.6465
	InertiaMoment   0.396769

	RotationPeriod  14368
	Obliquity       30.5385
	EqAscendNode    43.094

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.802 0.800 0.798)

	Surface
	{
		SurfStyle       0.910343
		OceanStyle      0.186274
		Randomize      (0.883, -0.158, 0.735)
		colorDistMagn   0.672262
		colorDistFreq   0.0689846
		detailScale     891.467
		colorConversion true
		snowLevel       2
		tropicLatitude  0.832994
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427531
		terraceProb     0.364185
		erosion         0
		montesMagn      0.550953
		montesFreq      3.03827
		montesSpiky     0.968857
		montesFraction  0.628313
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.50376
		hillsFraction   0.391909
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255695
		craterFreq      0.278681
		craterDensity   0.932886
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.4546
		volcanoTemp     1334.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.280, 0.319, 0.050)
		colorShelf     (0.321, 0.328, 0.367, 0.040)
		colorBeach     (0.369, 0.376, 0.415, 0.030)
		colorDesert    (0.417, 0.424, 0.471, 0.020)
		colorLowland   (0.465, 0.472, 0.519, 0.030)
		colorUpland    (0.513, 0.520, 0.567, 0.050)
		colorRock      (0.561, 0.568, 0.630, 0.020)
		colorSnow      (0.561, 0.568, 0.630, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0349071
		Period          0.81955
		Eccentricity    0.326356
		Inclination     30.5385
		AscendingNode   43.094
		ArgOfPericenter -179.744
		MeanAnomaly     39.5778
	}
}

DwarfMoon	"9.D4"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            1.34908e-008
	Radius          34.2666
	InertiaMoment   0.39851

	Obliquity       -13.942
	EqAscendNode    -48.5657
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.615 0.612 0.607)

	Surface
	{
		SurfStyle       0.773467
		OceanStyle      0.85251
		Randomize      (-0.825, 0.770, -0.597)
		colorDistMagn   0.965046
		colorDistFreq   0.526199
		detailScale     935.706
		colorConversion true
		snowLevel       2
		tropicLatitude  0.428521
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.662707
		terraceProb     0.401562
		erosion         0
		montesMagn      0.419648
		montesFreq      2.04464
		montesSpiky     0.875703
		montesFraction  0.475478
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.28912
		hillsFraction   0.468463
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219209
		craterFreq      0.264775
		craterDensity   0.826964
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   46.255
		volcanoTemp     1532.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.208, 0.170, 0.000)
		colorShelf     (0.246, 0.214, 0.194, 0.000)
		colorBeach     (0.289, 0.251, 0.231, 0.000)
		colorDesert    (0.314, 0.269, 0.225, 0.000)
		colorLowland   (0.344, 0.288, 0.255, 0.000)
		colorUpland    (0.381, 0.349, 0.310, 0.000)
		colorRock      (0.412, 0.380, 0.334, 0.000)
		colorSnow      (0.449, 0.404, 0.352, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0353091
		Period          0.833746
		Eccentricity    0.147735
		Inclination     -13.942
		AscendingNode   -48.5657
		ArgOfPericenter 102.34
		MeanAnomaly     -95.4938
	}
}

DwarfMoon	"9.D5"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            1.83473e-008
	Radius          36.4612
	InertiaMoment   0.399509

	Obliquity       9.08006
	EqAscendNode    72.1494
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.650 0.647 0.644)

	Surface
	{
		SurfStyle       0.838587
		OceanStyle      0.785884
		Randomize      (0.929, -0.599, -0.062)
		colorDistMagn   0.503058
		colorDistFreq   0.518812
		detailScale     995.634
		colorConversion true
		snowLevel       2
		tropicLatitude  0.253023
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.583352
		terraceProb     0.386206
		erosion         0
		montesMagn      0.659302
		montesFreq      3.94159
		montesSpiky     0.986387
		montesFraction  0.592119
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.40342
		hillsFraction   0.491558
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243222
		craterFreq      0.223402
		craterDensity   0.879897
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.2038
		volcanoTemp     1424.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.220, 0.180, 0.000)
		colorShelf     (0.260, 0.226, 0.206, 0.000)
		colorBeach     (0.305, 0.265, 0.245, 0.000)
		colorDesert    (0.331, 0.285, 0.238, 0.000)
		colorLowland   (0.364, 0.304, 0.271, 0.000)
		colorUpland    (0.403, 0.369, 0.328, 0.000)
		colorRock      (0.435, 0.401, 0.354, 0.000)
		colorSnow      (0.474, 0.427, 0.374, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0358772
		Period          0.85395
		Eccentricity    0.172881
		Inclination     9.08006
		AscendingNode   72.1494
		ArgOfPericenter 138.059
		MeanAnomaly     -61.6186
	}
}

DwarfMoon	"9.D6"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            2.49135e-008
	Radius          38.4335
	InertiaMoment   0.397163

	RotationPeriod  15306.5
	Obliquity       66.3499
	EqAscendNode    23.5581

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.490 0.485 0.483)

	Surface
	{
		SurfStyle       0.399255
		OceanStyle      0.269673
		Randomize      (-0.594, 0.820, -0.529)
		colorDistMagn   0.519017
		colorDistFreq   1.07805
		detailScale     1049.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.793766
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.643342
		terraceProb     0.368707
		erosion         0
		montesMagn      0.481167
		montesFreq      3.14031
		montesSpiky     0.902773
		montesFraction  0.48523
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.14544
		hillsFraction   0.782186
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239909
		craterFreq      0.27836
		craterDensity   0.873758
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.1767
		volcanoTemp     1513.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.194, 0.193, 0.000)
		colorShelf     (0.208, 0.206, 0.205, 0.000)
		colorBeach     (0.220, 0.218, 0.217, 0.000)
		colorDesert    (0.233, 0.230, 0.230, 0.000)
		colorLowland   (0.245, 0.242, 0.242, 0.000)
		colorUpland    (0.257, 0.255, 0.254, 0.000)
		colorRock      (0.269, 0.267, 0.266, 0.000)
		colorSnow      (0.282, 0.279, 0.278, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0364111
		Period          0.873082
		Eccentricity    0.449291
		Inclination     66.3499
		AscendingNode   23.5581
		ArgOfPericenter 169.683
		MeanAnomaly     104.221
	}
}

DwarfMoon	"9.D7"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            3.3807e-008
	Radius          49.7637
	InertiaMoment   0.39867

	Obliquity       -87.2858
	EqAscendNode    25.3147
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.837 0.759 0.707)

	Surface
	{
		SurfStyle       0.809232
		OceanStyle      0.652676
		Randomize      (0.515, 0.215, 0.591)
		colorDistMagn   0.0252434
		colorDistFreq   1.4753
		detailScale     1358.88
		colorConversion true
		snowLevel       2
		tropicLatitude  0.436502
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.403487
		terraceProb     0.193264
		erosion         0
		montesMagn      0.608131
		montesFreq      3.16204
		montesSpiky     0.955146
		montesFraction  0.774746
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.99423
		hillsFraction   0.525665
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25001
		craterFreq      0.227628
		craterDensity   0.880698
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   42.4341
		volcanoTemp     1393.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.326, 0.258, 0.198, 0.000)
		colorShelf     (0.335, 0.266, 0.226, 0.000)
		colorBeach     (0.393, 0.311, 0.269, 0.000)
		colorDesert    (0.427, 0.334, 0.262, 0.000)
		colorLowland   (0.469, 0.357, 0.297, 0.000)
		colorUpland    (0.519, 0.433, 0.361, 0.000)
		colorRock      (0.561, 0.471, 0.389, 0.000)
		colorSnow      (0.611, 0.501, 0.410, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0369365
		Period          0.892046
		Eccentricity    0.348445
		Inclination     -87.2858
		AscendingNode   25.3147
		ArgOfPericenter -42.778
		MeanAnomaly     103.721
	}
}

DwarfMoon	"9.D8"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            4.58838e-008
	Radius          51.8551
	InertiaMoment   0.399637

	RotationPeriod  19962.5
	Obliquity       -0.325422
	EqAscendNode    54.3656

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.736 0.733 0.728)

	Surface
	{
		SurfStyle       0.612794
		OceanStyle      0.647474
		Randomize      (0.342, 0.960, -0.985)
		colorDistMagn   0.855229
		colorDistFreq   1.71418
		detailScale     1415.99
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0101074
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.752693
		terraceProb     0.132729
		erosion         0
		montesMagn      0.400382
		montesFreq      2.76445
		montesSpiky     0.973402
		montesFraction  0.147225
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.67018
		hillsFraction   0.844635
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249084
		craterFreq      0.258806
		craterDensity   0.802968
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   37.9549
		volcanoTemp     1233.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.249, 0.204, 0.000)
		colorShelf     (0.294, 0.256, 0.233, 0.000)
		colorBeach     (0.346, 0.300, 0.277, 0.000)
		colorDesert    (0.375, 0.322, 0.270, 0.000)
		colorLowland   (0.412, 0.344, 0.306, 0.000)
		colorUpland    (0.456, 0.418, 0.372, 0.000)
		colorRock      (0.493, 0.454, 0.401, 0.000)
		colorSnow      (0.537, 0.484, 0.423, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0374558
		Period          0.910924
		Eccentricity    0.221508
		Inclination     -0.325422
		AscendingNode   54.3656
		ArgOfPericenter -168.292
		MeanAnomaly     -176.489
	}
}

DwarfMoon	"9.D9"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            6.23405e-008
	Radius          55.1273
	InertiaMoment   0.39747

	RotationPeriod  40325.3
	Obliquity       86.9102
	EqAscendNode    -130.661

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.577 0.500 0.470)

	Surface
	{
		SurfStyle       0.00847736
		OceanStyle      0.0164517
		Randomize      (0.546, 0.009, 0.905)
		colorDistMagn   0.423135
		colorDistFreq   2.59776
		detailScale     1505.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.757703
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411187
		terraceProb     0.666826
		erosion         0
		montesMagn      0.549647
		montesFreq      3.36247
		montesSpiky     0.871855
		montesFraction  0.439072
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.98596
		hillsFraction   0.493563
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215589
		craterFreq      0.203592
		craterDensity   0.91274
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   34.6168
		volcanoTemp     1700.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.200, 0.188, 0.000)
		colorShelf     (0.245, 0.213, 0.200, 0.000)
		colorBeach     (0.260, 0.225, 0.211, 0.000)
		colorDesert    (0.274, 0.238, 0.223, 0.000)
		colorLowland   (0.289, 0.250, 0.235, 0.000)
		colorUpland    (0.303, 0.263, 0.247, 0.000)
		colorRock      (0.317, 0.275, 0.258, 0.000)
		colorSnow      (0.332, 0.288, 0.270, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0377057
		Period          0.920059
		Eccentricity    0.409719
		Inclination     86.9102
		AscendingNode   -130.661
		ArgOfPericenter 32.0652
		MeanAnomaly     -104.996
	}
}

DwarfMoon	"9.D10"
{
	ParentBody     "9"
	Class	       "Asteroid"

	Mass            8.48637e-008
	Radius          58.3635
	InertiaMoment   0.398822

	Obliquity       85.8813
	EqAscendNode    115.747
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.494 0.487 0.480)

	Surface
	{
		SurfStyle       0.937002
		OceanStyle      0.714902
		Randomize      (0.126, 0.619, 0.466)
		colorDistMagn   0.317143
		colorDistFreq   2.83447
		detailScale     1593.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.899307
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.521191
		terraceProb     0.421277
		erosion         0
		montesMagn      0.555444
		montesFreq      3.46472
		montesSpiky     0.924761
		montesFraction  0.532823
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.87784
		hillsFraction   0.600708
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21401
		craterFreq      0.182922
		craterDensity   0.860361
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.4113
		volcanoTemp     1381.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.170, 0.192, 0.050)
		colorShelf     (0.197, 0.200, 0.221, 0.040)
		colorBeach     (0.227, 0.229, 0.250, 0.030)
		colorDesert    (0.257, 0.258, 0.283, 0.020)
		colorLowland   (0.286, 0.287, 0.312, 0.030)
		colorUpland    (0.316, 0.316, 0.341, 0.050)
		colorRock      (0.346, 0.346, 0.380, 0.020)
		colorSnow      (0.346, 0.346, 0.380, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0381519
		Period          0.936439
		Eccentricity    0.0938047
		Inclination     85.8813
		AscendingNode   115.747
		ArgOfPericenter -153.179
		MeanAnomaly     -22.6888
	}
}

Comet	"C1"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.62446e-013
	Radius          0.771859
	InertiaMoment   0.399967

	Oblateness      0.0419369

	RotationPeriod  25.3908
	Obliquity       145.187
	EqAscendNode    142.031

	AbsMagn         7.6805
	SlopeParam      7.16089
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.601 0.596 0.591)

	Surface
	{
		SurfStyle       0.51844
		OceanStyle      0.884148
		Randomize      (-0.300, -0.130, -0.603)
		colorDistMagn   0.329503
		colorDistFreq   0.000468835
		detailScale     21.0769
		colorConversion true
		snowLevel       2
		tropicLatitude  0.850861
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.312344
		terraceProb     0.357575
		erosion         0
		montesMagn      0.570155
		montesFreq      2.05807
		montesSpiky     0.864857
		montesFraction  0.395284
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00121104
		hillsFraction   0.519961
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26768
		craterFreq      0.225485
		craterDensity   1.02116
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   300.255
		volcanoTemp     1419.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.203, 0.166, 0.000)
		colorShelf     (0.240, 0.209, 0.189, 0.000)
		colorBeach     (0.282, 0.244, 0.225, 0.000)
		colorDesert    (0.306, 0.262, 0.219, 0.000)
		colorLowland   (0.336, 0.280, 0.248, 0.000)
		colorUpland    (0.372, 0.340, 0.301, 0.000)
		colorRock      (0.402, 0.369, 0.325, 0.000)
		colorSnow      (0.438, 0.393, 0.343, 1.000)
		BumpHeight      0.694673
		BumpOffset      0.138935
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.283575
		GasToDust   0.25
		Particles   1552
		GasBright   0.100023
		DustBright  0.151235
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.78202
		Period          7.92953
		Eccentricity    0.939464
		Inclination     -93.6376
		AscendingNode   33.8265
		ArgOfPericenter 120.371
		MeanAnomaly     0.0504493
	}
}

Comet	"C2"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.2564e-009
	Radius          18.344
	InertiaMoment   0.398865

	Oblateness      0.0872544

	RotationPeriod  23.1423
	Obliquity       98.3932
	EqAscendNode    126.608

	AbsMagn         9.01725
	SlopeParam      5.31207
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.579 0.577 0.572)

	Surface
	{
		SurfStyle       0.493378
		OceanStyle      0.921879
		Randomize      (-0.048, 0.966, 0.922)
		colorDistMagn   0.897444
		colorDistFreq   0.195014
		detailScale     500.912
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987314
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.713088
		terraceProb     0.599765
		erosion         0
		montesMagn      0.492027
		montesFreq      2.83465
		montesSpiky     0.894291
		montesFraction  0.34188
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.745597
		hillsFraction   0.797691
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258414
		craterFreq      0.270595
		craterDensity   0.978728
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   81.14
		volcanoTemp     1752.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.231, 0.229, 0.000)
		colorShelf     (0.246, 0.245, 0.243, 0.000)
		colorBeach     (0.261, 0.259, 0.257, 0.000)
		colorDesert    (0.275, 0.274, 0.271, 0.000)
		colorLowland   (0.290, 0.288, 0.286, 0.000)
		colorUpland    (0.304, 0.303, 0.300, 0.000)
		colorRock      (0.319, 0.317, 0.314, 0.000)
		colorSnow      (0.333, 0.332, 0.329, 1.000)
		BumpHeight      16.5096
		BumpOffset      3.30191
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.764767
		GasToDust   0.25
		Particles   2524
		GasBright   0.336333
		DustBright  0.399412
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.55162
		Period          13.5864
		Eccentricity    0.951274
		Inclination     179.162
		AscendingNode   152.481
		ArgOfPericenter -81.6038
		MeanAnomaly     81.4486
	}
}

Comet	"C3"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            3.86855e-017
	Radius          0.0478106
	InertiaMoment   0.397148

	Oblateness      0.0617551

	RotationPeriod  20.7923
	Obliquity       51.5989
	EqAscendNode    111.185

	AbsMagn         10.4825
	SlopeParam      4.22709
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.445 0.437 0.434)

	Surface
	{
		SurfStyle       0.102497
		OceanStyle      0.904647
		Randomize      (0.848, -0.754, 0.996)
		colorDistMagn   0.0734484
		colorDistFreq   1.81699e-006
		detailScale     1.30555
		colorConversion true
		snowLevel       2
		tropicLatitude  0.908774
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.626316
		terraceProb     0.383954
		erosion         0
		montesMagn      0.498263
		montesFreq      3.27479
		montesSpiky     0.975047
		montesFraction  0.274591
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.85628e-006
		hillsFraction   0.772089
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231412
		craterFreq      0.237204
		craterDensity   0.923667
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1205.19
		volcanoTemp     1393.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.175, 0.174, 0.000)
		colorShelf     (0.189, 0.186, 0.184, 0.000)
		colorBeach     (0.200, 0.197, 0.195, 0.000)
		colorDesert    (0.211, 0.208, 0.206, 0.000)
		colorLowland   (0.222, 0.218, 0.217, 0.000)
		colorUpland    (0.234, 0.229, 0.228, 0.000)
		colorRock      (0.245, 0.240, 0.239, 0.000)
		colorSnow      (0.256, 0.251, 0.250, 1.000)
		BumpHeight      0.0430296
		BumpOffset      0.00860592
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00679846
		DustBright  0.413433
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.32713
		Period          20.2295
		Eccentricity    0.965275
		Inclination     -85.9796
		AscendingNode   -61.4401
		ArgOfPericenter -130.73
		MeanAnomaly     161.743
	}
}

Comet	"C4"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.99204e-013
	Radius          1.12625
	InertiaMoment   0.399329

	Oblateness      0.135543

	RotationPeriod  18.3202
	Obliquity       4.8046
	EqAscendNode    95.7628

	AbsMagn         12.4082
	SlopeParam      3.20935
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.667 0.662 0.660)

	Surface
	{
		SurfStyle       0.665707
		OceanStyle      0.679634
		Randomize      (0.555, 0.701, -0.778)
		colorDistMagn   0.706533
		colorDistFreq   0.000588191
		detailScale     30.754
		colorConversion true
		snowLevel       2
		tropicLatitude  0.123844
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.480931
		terraceProb     0.263776
		erosion         0
		montesMagn      0.48484
		montesFreq      2.74927
		montesSpiky     0.895281
		montesFraction  0.308793
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0023755
		hillsFraction   0.746842
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26709
		craterFreq      0.238175
		craterDensity   0.93471
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   322.816
		volcanoTemp     1703.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.225, 0.185, 0.000)
		colorShelf     (0.267, 0.232, 0.211, 0.000)
		colorBeach     (0.313, 0.271, 0.251, 0.000)
		colorDesert    (0.340, 0.291, 0.244, 0.000)
		colorLowland   (0.373, 0.311, 0.277, 0.000)
		colorUpland    (0.413, 0.377, 0.336, 0.000)
		colorRock      (0.447, 0.410, 0.363, 0.000)
		colorSnow      (0.487, 0.437, 0.383, 1.000)
		BumpHeight      1.01362
		BumpOffset      0.202724
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.316401
		GasToDust   0.25
		Particles   1618
		GasBright   0.0680557
		DustBright  0.836662
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.85933
		Period          8.45113
		Eccentricity    0.909467
		Inclination     2.56996
		AscendingNode   -32.0799
		ArgOfPericenter 1.74752
		MeanAnomaly     81.1967
	}
}

Comet	"C5"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.31413e-009
	Radius          18.6858
	InertiaMoment   0.398015

	Oblateness      0.108452

	RotationPeriod  15.6995
	Obliquity       318.01
	EqAscendNode    80.3402

	AbsMagn         18.985
	SlopeParam      8.5635
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.589 0.586 0.582)

	Surface
	{
		SurfStyle       0.762872
		OceanStyle      0.796036
		Randomize      (0.232, 0.940, -0.902)
		colorDistMagn   0.557903
		colorDistFreq   0.117853
		detailScale     510.247
		colorConversion true
		snowLevel       2
		tropicLatitude  0.942912
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.369063
		terraceProb     0.350688
		erosion         0
		montesMagn      0.637682
		montesFreq      3.16251
		montesSpiky     0.829565
		montesFraction  0.364491
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.047
		hillsFraction   0.809353
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241367
		craterFreq      0.214025
		craterDensity   0.935912
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   60.9009
		volcanoTemp     1432.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.199, 0.163, 0.000)
		colorShelf     (0.236, 0.205, 0.186, 0.000)
		colorBeach     (0.277, 0.240, 0.221, 0.000)
		colorDesert    (0.300, 0.258, 0.215, 0.000)
		colorLowland   (0.330, 0.275, 0.244, 0.000)
		colorUpland    (0.365, 0.334, 0.297, 0.000)
		colorRock      (0.394, 0.363, 0.320, 0.000)
		colorSnow      (0.430, 0.387, 0.338, 1.000)
		BumpHeight      16.8172
		BumpOffset      3.36345
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.797593
		GasToDust   0.25
		Particles   2591
		GasBright   0.0791116
		DustBright  0.510093
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.82731
		Period          8.23373
		Eccentricity    0.924589
		Inclination     -85.2949
		AscendingNode   -114.083
		ArgOfPericenter 65.4759
		MeanAnomaly     -81.8256
	}
}

Comet	"C6"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            7.12539e-017
	Radius          0.0692575
	InertiaMoment   0.39976

	Oblateness      0.249

	RotationPeriod  12.8953
	Obliquity       271.216
	EqAscendNode    64.9177

	AbsMagn         3.61984
	SlopeParam      5.6118
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.694 0.691 0.688)

	Surface
	{
		SurfStyle       0.324742
		OceanStyle      0.448638
		Randomize      (0.124, 0.087, 0.000)
		colorDistMagn   0.942092
		colorDistFreq   3.49458e-006
		detailScale     1.89119
		colorConversion true
		snowLevel       2
		tropicLatitude  0.765923
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570115
		terraceProb     0.494697
		erosion         0
		montesMagn      0.639767
		montesFreq      2.60908
		montesSpiky     0.938131
		montesFraction  0.758571
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.23531e-006
		hillsFraction   0.596364
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237914
		craterFreq      0.191676
		craterDensity   1.00768
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1286.38
		volcanoTemp     1468.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.278, 0.276, 0.275, 0.000)
		colorShelf     (0.295, 0.294, 0.292, 0.000)
		colorBeach     (0.312, 0.311, 0.309, 0.000)
		colorDesert    (0.330, 0.328, 0.327, 0.000)
		colorLowland   (0.347, 0.345, 0.344, 0.000)
		colorUpland    (0.364, 0.363, 0.361, 0.000)
		colorRock      (0.382, 0.380, 0.378, 0.000)
		colorSnow      (0.399, 0.397, 0.395, 1.000)
		BumpHeight      0.0623317
		BumpOffset      0.0124663
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0529082
		DustBright  0.220783
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.60206
		Period          6.75925
		Eccentricity    0.938106
		Inclination     -80.0501
		AscendingNode   48.9574
		ArgOfPericenter 159.964
		MeanAnomaly     -80.5312
	}
}

Comet	"C7"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            5.51098e-013
	Radius          1.15744
	InertiaMoment   0.398613

	Oblateness      0.249

	RotationPeriod  9.86009
	Obliquity       224.422
	EqAscendNode    49.4951

	AbsMagn         5.53608
	SlopeParam      4.45998
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.655 0.579 0.501)

	Surface
	{
		SurfStyle       0.267344
		OceanStyle      0.332521
		Randomize      (0.863, 0.019, 0.645)
		colorDistMagn   0.787399
		colorDistFreq   0.000935869
		detailScale     31.6059
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99928
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.426074
		terraceProb     0.400296
		erosion         0
		montesMagn      0.543417
		montesFreq      2.90294
		montesSpiky     0.942844
		montesFraction  0.340837
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00233871
		hillsFraction   0.52924
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239574
		craterFreq      0.244766
		craterDensity   0.841858
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   244.451
		volcanoTemp     1432.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.232, 0.200, 0.000)
		colorShelf     (0.278, 0.246, 0.213, 0.000)
		colorBeach     (0.295, 0.261, 0.226, 0.000)
		colorDesert    (0.311, 0.275, 0.238, 0.000)
		colorLowland   (0.327, 0.289, 0.251, 0.000)
		colorUpland    (0.344, 0.304, 0.263, 0.000)
		colorRock      (0.360, 0.318, 0.276, 0.000)
		colorSnow      (0.376, 0.333, 0.288, 1.000)
		BumpHeight      1.0417
		BumpOffset      0.20834
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.349227
		GasToDust   0.25
		Particles   1685
		GasBright   0.191333
		DustBright  0.566845
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.14487
		Period          10.4708
		Eccentricity    0.917969
		Inclination     -99.5698
		AscendingNode   76.8787
		ArgOfPericenter -95.7869
		MeanAnomaly     -0.742788
	}
}

Comet	"C8"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            4.26234e-009
	Radius          26.9023
	InertiaMoment   0.396394

	Oblateness      0.249

	RotationPeriod  6.52627
	Obliquity       177.627
	EqAscendNode    34.0725

	AbsMagn         6.9986
	SlopeParam      3.45205
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.742 0.738 0.735)

	Surface
	{
		SurfStyle       0.521233
		OceanStyle      0.157113
		Randomize      (-0.373, 0.822, -0.300)
		colorDistMagn   0.469726
		colorDistFreq   0.395538
		detailScale     734.613
		colorConversion true
		snowLevel       2
		tropicLatitude  0.893899
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.380663
		terraceProb     0.169652
		erosion         0
		montesMagn      0.496164
		montesFreq      3.03453
		montesSpiky     0.98981
		montesFraction  0.899834
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.99825
		hillsFraction   0.830724
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21503
		craterFreq      0.267621
		craterDensity   0.817716
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   64.6058
		volcanoTemp     1286.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.251, 0.206, 0.000)
		colorShelf     (0.297, 0.258, 0.235, 0.000)
		colorBeach     (0.349, 0.303, 0.279, 0.000)
		colorDesert    (0.379, 0.325, 0.272, 0.000)
		colorLowland   (0.416, 0.347, 0.309, 0.000)
		colorUpland    (0.460, 0.421, 0.375, 0.000)
		colorRock      (0.497, 0.458, 0.404, 0.000)
		colorSnow      (0.542, 0.487, 0.426, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.830419
		GasToDust   0.25
		Particles   2657
		GasBright   0.137847
		DustBright  0.304817
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.10788
		Period          10.2012
		Eccentricity    0.949154
		Inclination     -63.9291
		AscendingNode   104.266
		ArgOfPericenter 112.637
		MeanAnomaly     -40.183
	}
}

Comet	"C9"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.31241e-016
	Radius          0.0716948
	InertiaMoment   0.399106

	Oblateness      0.249

	RotationPeriod  2.79275
	Obliquity       130.833
	EqAscendNode    18.6499

	AbsMagn         8.3349
	SlopeParam      2.26733
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.776 0.733 0.673)

	Surface
	{
		SurfStyle       0.585157
		OceanStyle      0.0493087
		Randomize      (0.470, -0.505, 0.116)
		colorDistMagn   0.538962
		colorDistFreq   3.63546e-006
		detailScale     1.95775
		colorConversion true
		snowLevel       2
		tropicLatitude  0.879721
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.608655
		terraceProb     0.150446
		erosion         0
		montesMagn      0.443726
		montesFreq      2.62248
		montesSpiky     0.871623
		montesFraction  0.349022
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.00625e-005
		hillsFraction   0.724734
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236538
		craterFreq      0.246624
		craterDensity   0.868959
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   981.204
		volcanoTemp     1461.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.249, 0.189, 0.000)
		colorShelf     (0.310, 0.256, 0.215, 0.000)
		colorBeach     (0.365, 0.300, 0.256, 0.000)
		colorDesert    (0.396, 0.322, 0.249, 0.000)
		colorLowland   (0.434, 0.344, 0.283, 0.000)
		colorUpland    (0.481, 0.418, 0.343, 0.000)
		colorRock      (0.520, 0.454, 0.370, 0.000)
		colorSnow      (0.566, 0.484, 0.391, 1.000)
		BumpHeight      0.0645254
		BumpOffset      0.0129051
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.343462
		DustBright  0.583688
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.82992
		Period          8.25137
		Eccentricity    0.924739
		Inclination     12.6454
		AscendingNode   168.846
		ArgOfPericenter -127.104
		MeanAnomaly     -122.876
	}
}

Comet	"C10"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.01505e-012
	Radius          1.65759
	InertiaMoment   0.397642

	Oblateness      0.0027888

	RotationPeriod  123.421
	Obliquity       84.0388
	EqAscendNode    3.2273

	AbsMagn         9.71082
	SlopeParam      5.95307
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.491 0.488 0.482)

	Surface
	{
		SurfStyle       0.872021
		OceanStyle      0.0591374
		Randomize      (-0.510, -0.055, 0.593)
		colorDistMagn   0.92446
		colorDistFreq   0.00177857
		detailScale     45.2632
		colorConversion true
		snowLevel       2
		tropicLatitude  0.96071
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.699891
		terraceProb     0.167717
		erosion         0
		montesMagn      0.654843
		montesFreq      3.36121
		montesSpiky     0.913178
		montesFraction  0.475505
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00371378
		hillsFraction   0.508217
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220631
		craterFreq      0.254406
		craterDensity   0.785051
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   257.952
		volcanoTemp     1121.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.171, 0.193, 0.050)
		colorShelf     (0.196, 0.200, 0.222, 0.040)
		colorBeach     (0.226, 0.229, 0.251, 0.030)
		colorDesert    (0.255, 0.258, 0.284, 0.020)
		colorLowland   (0.285, 0.288, 0.313, 0.030)
		colorUpland    (0.314, 0.317, 0.342, 0.050)
		colorRock      (0.344, 0.346, 0.381, 0.020)
		colorSnow      (0.344, 0.346, 0.381, 1.000)
		BumpHeight      1.49183
		BumpOffset      0.298366
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.382053
		GasToDust   0.25
		Particles   1751
		GasBright   0.262695
		DustBright  0.348942
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.30451
		Period          11.6613
		Eccentricity    0.964386
		Inclination     -106.698
		AscendingNode   105.072
		ArgOfPericenter 11.2735
		MeanAnomaly     -175.542
	}
}

Comet	"C11"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            7.8507e-009
	Radius          28.0205
	InertiaMoment   0.39955

	Oblateness      0.00213719

	RotationPeriod  111.82
	Obliquity       37.2445
	EqAscendNode    347.805

	AbsMagn         11.3348
	SlopeParam      4.69931
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.589 0.587 0.583)

	Surface
	{
		SurfStyle       0.829409
		OceanStyle      0.867725
		Randomize      (0.762, 0.232, -0.743)
		colorDistMagn   0.324585
		colorDistFreq   0.28675
		detailScale     765.147
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996026
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.51135
		terraceProb     0.447988
		erosion         0
		montesMagn      0.478092
		montesFreq      1.70566
		montesSpiky     0.899344
		montesFraction  0.431458
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.1635
		hillsFraction   0.721572
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232965
		craterFreq      0.166694
		craterDensity   0.757691
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   49.5824
		volcanoTemp     1490.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.200, 0.163, 0.000)
		colorShelf     (0.236, 0.205, 0.186, 0.000)
		colorBeach     (0.277, 0.241, 0.221, 0.000)
		colorDesert    (0.300, 0.258, 0.216, 0.000)
		colorLowland   (0.330, 0.276, 0.245, 0.000)
		colorUpland    (0.365, 0.334, 0.297, 0.000)
		colorRock      (0.395, 0.364, 0.320, 0.000)
		colorSnow      (0.430, 0.387, 0.338, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.863245
		GasToDust   0.25
		Particles   2723
		GasBright   0.144668
		DustBright  0.151456
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.82759
		Period          8.23566
		Eccentricity    0.949043
		Inclination     -75.8105
		AscendingNode   -118.971
		ArgOfPericenter -98.7915
		MeanAnomaly     -2.85814
	}
}

Comet	"C12"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.41728e-016
	Radius          0.102199
	InertiaMoment   0.398336

	Oblateness      0.00383643

	RotationPeriod  104.528
	Obliquity       350.45
	EqAscendNode    332.382

	AbsMagn         13.9024
	SlopeParam      3.68692
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.652 0.650 0.646)

	Surface
	{
		SurfStyle       0.314128
		OceanStyle      0.493886
		Randomize      (-0.250, -0.744, 0.225)
		colorDistMagn   0.541694
		colorDistFreq   5.40545e-006
		detailScale     2.7907
		colorConversion true
		snowLevel       2
		tropicLatitude  0.485064
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448606
		terraceProb     0.188464
		erosion         0
		montesMagn      0.518609
		montesFreq      3.45597
		montesSpiky     0.945116
		montesFraction  0.467806
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.36591e-005
		hillsFraction   0.753339
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24681
		craterFreq      0.149193
		craterDensity   0.918001
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1030.59
		volcanoTemp     1314.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.260, 0.258, 0.000)
		colorShelf     (0.277, 0.276, 0.274, 0.000)
		colorBeach     (0.293, 0.292, 0.291, 0.000)
		colorDesert    (0.310, 0.309, 0.307, 0.000)
		colorLowland   (0.326, 0.325, 0.323, 0.000)
		colorUpland    (0.342, 0.341, 0.339, 0.000)
		colorRock      (0.359, 0.357, 0.355, 0.000)
		colorSnow      (0.375, 0.374, 0.371, 1.000)
		BumpHeight      0.0919788
		BumpOffset      0.0183958
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0371455
		DustBright  0.743465
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.83311
		Period          15.8955
		Eccentricity    0.954677
		Inclination     34.8144
		AscendingNode   46.7901
		ArgOfPericenter -139.374
		MeanAnomaly     -128.462
	}
}

Comet	"C13"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.8696e-012
	Radius          1.73566
	InertiaMoment   0.399972

	Oblateness      0.00272456

	RotationPeriod  99.0149
	Obliquity       303.656
	EqAscendNode    316.96

	AbsMagn         2.08908
	SlopeParam      2.58034
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.784 0.721 0.695)

	Surface
	{
		SurfStyle       0.937013
		OceanStyle      0.582117
		Randomize      (0.382, -0.025, -0.896)
		colorDistMagn   0.697847
		colorDistFreq   0.0017503
		detailScale     47.3951
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974188
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.585609
		terraceProb     0.138016
		erosion         0
		montesMagn      0.461979
		montesFreq      2.38329
		montesSpiky     0.969157
		montesFraction  0.692167
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00766847
		hillsFraction   0.737605
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263023
		craterFreq      0.229621
		craterDensity   0.879481
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   199.02
		volcanoTemp     1622.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.253, 0.278, 0.050)
		colorShelf     (0.314, 0.296, 0.319, 0.040)
		colorBeach     (0.361, 0.339, 0.361, 0.030)
		colorDesert    (0.408, 0.382, 0.410, 0.020)
		colorLowland   (0.455, 0.426, 0.451, 0.030)
		colorUpland    (0.502, 0.469, 0.493, 0.050)
		colorRock      (0.549, 0.512, 0.549, 0.020)
		colorSnow      (0.549, 0.512, 0.549, 1.000)
		BumpHeight      1.56209
		BumpOffset      0.312419
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.414879
		GasToDust   0.25
		Particles   1817
		GasBright   0.0495935
		DustBright  0.415504
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.75034
		Period          7.71902
		Eccentricity    0.946566
		Inclination     43.7436
		AscendingNode   -107.665
		ArgOfPericenter -126.322
		MeanAnomaly     161.429
	}
}

Comet	"C14"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.446e-008
	Radius          39.7775
	InertiaMoment   0.398871

	Oblateness      0.00463682

	RotationPeriod  94.4913
	Obliquity       256.862
	EqAscendNode    301.537

	AbsMagn         4.66121
	SlopeParam      6.36353
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.626 0.622 0.620)

	Surface
	{
		SurfStyle       0.29728
		OceanStyle      0.64916
		Randomize      (-0.683, 0.222, -0.454)
		colorDistMagn   0.499796
		colorDistFreq   0.528289
		detailScale     1086.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.733812
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.508263
		terraceProb     0.363486
		erosion         0
		montesMagn      0.46393
		montesFreq      3.56792
		montesSpiky     0.888676
		montesFraction  0.766036
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.56564
		hillsFraction   0.636634
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24951
		craterFreq      0.254897
		craterDensity   0.941523
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   51.8633
		volcanoTemp     1556.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.249, 0.248, 0.000)
		colorShelf     (0.266, 0.264, 0.263, 0.000)
		colorBeach     (0.282, 0.280, 0.279, 0.000)
		colorDesert    (0.297, 0.296, 0.294, 0.000)
		colorLowland   (0.313, 0.311, 0.310, 0.000)
		colorUpland    (0.329, 0.327, 0.325, 0.000)
		colorRock      (0.344, 0.342, 0.341, 0.000)
		colorSnow      (0.360, 0.358, 0.356, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.896071
		GasToDust   0.25
		Particles   2790
		GasBright   0.157323
		DustBright  0.792261
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.78751
		Period          7.96624
		Eccentricity    0.92369
		Inclination     150.288
		AscendingNode   3.17072
		ArgOfPericenter -137.479
		MeanAnomaly     -95.0995
	}
}

Comet	"C15"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            4.45234e-016
	Radius          0.107511
	InertiaMoment   0.397162

	Oblateness      0.00321344

	RotationPeriod  90.6021
	Obliquity       210.067
	EqAscendNode    286.114

	AbsMagn         6.28606
	SlopeParam      4.94913
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.816 0.792 0.764)

	Surface
	{
		SurfStyle       0.490145
		OceanStyle      0.89711
		Randomize      (-0.792, 0.794, 0.935)
		colorDistMagn   0.709045
		colorDistFreq   2.34833e-006
		detailScale     2.93577
		colorConversion true
		snowLevel       2
		tropicLatitude  0.354704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.760937
		terraceProb     0.282926
		erosion         0
		montesMagn      0.557704
		montesFreq      3.32583
		montesSpiky     0.94962
		montesFraction  0.409828
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.99609e-005
		hillsFraction   0.772993
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227707
		craterFreq      0.253821
		craterDensity   1.02812
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   798.85
		volcanoTemp     1687.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.326, 0.317, 0.305, 0.000)
		colorShelf     (0.347, 0.336, 0.325, 0.000)
		colorBeach     (0.367, 0.356, 0.344, 0.000)
		colorDesert    (0.387, 0.376, 0.363, 0.000)
		colorLowland   (0.408, 0.396, 0.382, 0.000)
		colorUpland    (0.428, 0.416, 0.401, 0.000)
		colorRock      (0.449, 0.435, 0.420, 0.000)
		colorSnow      (0.469, 0.455, 0.439, 1.000)
		BumpHeight      0.0967601
		BumpOffset      0.019352
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.142489
		DustBright  0.491581
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.89718
		Period          8.71052
		Eccentricity    0.93921
		Inclination     -137.216
		AscendingNode   151.765
		ArgOfPericenter -15.2408
		MeanAnomaly     -175.132
	}
}

Comet	"C16"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            3.44357e-012
	Radius          2.45478
	InertiaMoment   0.399335

	Oblateness      0.00538837

	RotationPeriod  87.1553
	Obliquity       163.273
	EqAscendNode    270.692

	AbsMagn         7.66224
	SlopeParam      3.91753
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.525 0.516 0.511)

	Surface
	{
		SurfStyle       0.138616
		OceanStyle      0.425514
		Randomize      (0.907, -0.207, 0.374)
		colorDistMagn   0.917178
		colorDistFreq   0.00518945
		detailScale     67.032
		colorConversion true
		snowLevel       2
		tropicLatitude  0.320677
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.679817
		terraceProb     0.275676
		erosion         0
		montesMagn      0.359681
		montesFreq      3.58456
		montesSpiky     0.992294
		montesFraction  0.467224
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0166203
		hillsFraction   0.715045
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239301
		craterFreq      0.248196
		craterDensity   0.858039
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   207.403
		volcanoTemp     1317.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.210, 0.206, 0.204, 0.000)
		colorShelf     (0.223, 0.219, 0.217, 0.000)
		colorBeach     (0.236, 0.232, 0.230, 0.000)
		colorDesert    (0.249, 0.245, 0.243, 0.000)
		colorLowland   (0.262, 0.258, 0.256, 0.000)
		colorUpland    (0.276, 0.271, 0.268, 0.000)
		colorRock      (0.289, 0.284, 0.281, 0.000)
		colorSnow      (0.302, 0.296, 0.294, 1.000)
		BumpHeight      2.20931
		BumpOffset      0.441861
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.447705
		GasToDust   0.25
		Particles   1884
		GasBright   0.0903957
		DustBright  0.228161
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.52455
		Period          13.3708
		Eccentricity    0.942432
		Inclination     -175.891
		AscendingNode   112.936
		ArgOfPericenter -117.818
		MeanAnomaly     156.349
	}
}

Comet	"C17"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.66335e-008
	Radius          42.0187
	InertiaMoment   0.398023

	Oblateness      0.00373993

	RotationPeriod  84.0344
	Obliquity       116.479
	EqAscendNode    255.269

	AbsMagn         8.99846
	SlopeParam      2.86186
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.790 0.788 0.787)

	Surface
	{
		SurfStyle       0.857536
		OceanStyle      0.271228
		Randomize      (0.432, 0.709, -0.063)
		colorDistMagn   0.506431
		colorDistFreq   0.768912
		detailScale     1147.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998557
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.464924
		terraceProb     0.47427
		erosion         0
		montesMagn      0.497544
		montesFreq      2.90137
		montesSpiky     0.858052
		montesFraction  0.692642
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.0387
		hillsFraction   0.39894
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240044
		craterFreq      0.183339
		craterDensity   0.793393
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   40.3678
		volcanoTemp     1255.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.276, 0.315, 0.050)
		colorShelf     (0.316, 0.323, 0.362, 0.040)
		colorBeach     (0.364, 0.371, 0.409, 0.030)
		colorDesert    (0.411, 0.418, 0.465, 0.020)
		colorLowland   (0.458, 0.465, 0.512, 0.030)
		colorUpland    (0.506, 0.512, 0.559, 0.050)
		colorRock      (0.553, 0.560, 0.622, 0.020)
		colorSnow      (0.553, 0.560, 0.622, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.928897
		GasToDust   0.25
		Particles   2856
		GasBright   0.275292
		DustBright  0.527751
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.14131
		Period          10.4448
		Eccentricity    0.950956
		Inclination     -74.9635
		AscendingNode   -78.7009
		ArgOfPericenter -143.593
		MeanAnomaly     -56.3745
	}
}

Comet	"C18"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            8.20063e-016
	Radius          0.151544
	InertiaMoment   0.399765

	Oblateness      0.00614848

	RotationPeriod  81.1633
	Obliquity       69.6844
	EqAscendNode    239.847

	AbsMagn         10.4605
	SlopeParam      6.90907
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.550 0.545 0.542)

	Surface
	{
		SurfStyle       0.986967
		OceanStyle      0.40453
		Randomize      (-0.219, -0.546, -0.029)
		colorDistMagn   0.57728
		colorDistFreq   6.53481e-006
		detailScale     4.13817
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994324
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622655
		terraceProb     0.265276
		erosion         0
		montesMagn      0.557228
		montesFreq      3.32282
		montesSpiky     0.935689
		montesFraction  0.781159
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.86789e-005
		hillsFraction   0.645873
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235751
		craterFreq      0.250307
		craterDensity   1.01692
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   829.702
		volcanoTemp     1718.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.191, 0.217, 0.050)
		colorShelf     (0.220, 0.223, 0.249, 0.040)
		colorBeach     (0.253, 0.256, 0.282, 0.030)
		colorDesert    (0.286, 0.289, 0.320, 0.020)
		colorLowland   (0.319, 0.322, 0.352, 0.030)
		colorUpland    (0.352, 0.354, 0.385, 0.050)
		colorRock      (0.385, 0.387, 0.428, 0.020)
		colorSnow      (0.385, 0.387, 0.428, 1.000)
		BumpHeight      0.13639
		BumpOffset      0.027278
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.195917
		DustBright  0.291613
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.66486
		Period          7.16053
		Eccentricity    0.889359
		Inclination     146.079
		AscendingNode   138.922
		ArgOfPericenter -162.935
		MeanAnomaly     -139.586
	}
}

Comet	"C19"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            6.3426e-012
	Radius          2.60275
	InertiaMoment   0.398619

	Oblateness      0.00428805

	RotationPeriod  78.489
	Obliquity       22.8901
	EqAscendNode    224.424

	AbsMagn         12.375
	SlopeParam      5.21477
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.710 0.705 0.703)

	Surface
	{
		SurfStyle       0.772422
		OceanStyle      0.52303
		Randomize      (-0.423, -0.084, -0.909)
		colorDistMagn   0.587086
		colorDistFreq   0.00104044
		detailScale     71.0724
		colorConversion true
		snowLevel       2
		tropicLatitude  0.69782
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.426741
		terraceProb     0.163311
		erosion         0
		montesMagn      0.49944
		montesFreq      3.19446
		montesSpiky     0.987857
		montesFraction  0.650767
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0155828
		hillsFraction   0.617696
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248657
		craterFreq      0.225712
		craterDensity   0.998119
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   162.033
		volcanoTemp     1551.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.240, 0.197, 0.000)
		colorShelf     (0.284, 0.247, 0.225, 0.000)
		colorBeach     (0.334, 0.289, 0.267, 0.000)
		colorDesert    (0.362, 0.310, 0.260, 0.000)
		colorLowland   (0.397, 0.331, 0.295, 0.000)
		colorUpland    (0.440, 0.402, 0.358, 0.000)
		colorRock      (0.476, 0.437, 0.386, 0.000)
		colorSnow      (0.518, 0.465, 0.407, 1.000)
		BumpHeight      2.34247
		BumpOffset      0.468495
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.480531
		GasToDust   0.25
		Particles   1950
		GasBright   0.448004
		DustBright  0.524012
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.71199
		Period          7.46674
		Eccentricity    0.954137
		Inclination     -141.573
		AscendingNode   -88.7114
		ArgOfPericenter 18.1566
		MeanAnomaly     -103.836
	}
}

Comet	"C20"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            4.90555e-008
	Radius          59.0467
	InertiaMoment   0.39642

	Oblateness      0.00685243

	RotationPeriod  75.9732
	Obliquity       336.096
	EqAscendNode    209.001

	AbsMagn         18.3512
	SlopeParam      4.14704
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.772 0.676 0.606)

	Surface
	{
		SurfStyle       0.950545
		OceanStyle      0.808561
		Randomize      (0.617, -0.069, 0.437)
		colorDistMagn   0.512463
		colorDistFreq   1.55998
		detailScale     1612.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.493586
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.523641
		terraceProb     0.15512
		erosion         0
		montesMagn      0.457085
		montesFreq      3.07649
		montesSpiky     0.781446
		montesFraction  0.495282
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.70308
		hillsFraction   0.650217
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278376
		craterFreq      0.229932
		craterDensity   1.01683
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   41.7982
		volcanoTemp     1392.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.237, 0.242, 0.050)
		colorShelf     (0.309, 0.277, 0.279, 0.040)
		colorBeach     (0.355, 0.318, 0.315, 0.030)
		colorDesert    (0.402, 0.358, 0.357, 0.020)
		colorLowland   (0.448, 0.399, 0.394, 0.030)
		colorUpland    (0.494, 0.439, 0.430, 0.050)
		colorRock      (0.541, 0.480, 0.478, 0.020)
		colorSnow      (0.541, 0.480, 0.478, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.961723
		GasToDust   0.25
		Particles   2922
		GasBright   0.0130954
		DustBright  0.643408
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.15726
		Period          10.5617
		Eccentricity    0.932498
		Inclination     44.6142
		AscendingNode   39.7185
		ArgOfPericenter -71.8171
		MeanAnomaly     -98.3803
	}
}

Comet	"C21"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.51046e-015
	Radius          0.161221
	InertiaMoment   0.399112

	Oblateness      0.00487758

	RotationPeriod  73.5871
	Obliquity       289.302
	EqAscendNode    193.579

	AbsMagn         3.58654
	SlopeParam      3.12241
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.657 0.652 0.650)

	Surface
	{
		SurfStyle       0.629019
		OceanStyle      0.801472
		Randomize      (-0.019, 0.070, -0.143)
		colorDistMagn   0.91342
		colorDistFreq   1.3283e-005
		detailScale     4.40241
		colorConversion true
		snowLevel       2
		tropicLatitude  0.717008
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553663
		terraceProb     0.292861
		erosion         0
		montesMagn      0.431399
		montesFreq      2.81436
		montesSpiky     0.993231
		montesFraction  0.534685
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.13568e-005
		hillsFraction   0.602784
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274818
		craterFreq      0.272566
		craterDensity   0.849677
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   650.39
		volcanoTemp     1305.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.222, 0.182, 0.000)
		colorShelf     (0.263, 0.228, 0.208, 0.000)
		colorBeach     (0.309, 0.267, 0.247, 0.000)
		colorDesert    (0.335, 0.287, 0.241, 0.000)
		colorLowland   (0.368, 0.307, 0.273, 0.000)
		colorUpland    (0.407, 0.372, 0.332, 0.000)
		colorRock      (0.440, 0.404, 0.358, 0.000)
		colorSnow      (0.479, 0.431, 0.377, 1.000)
		BumpHeight      0.145099
		BumpOffset      0.0290198
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0321646
		GasToDust   0.25
		Particles   1044
		GasBright   0.0269356
		DustBright  0.314054
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.81359
		Period          8.14121
		Eccentricity    0.981485
		Inclination     29.5373
		AscendingNode   28.3479
		ArgOfPericenter -10.2956
		MeanAnomaly     -83.2403
	}
}

Comet	"C22"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.16823e-011
	Radius          3.64721
	InertiaMoment   0.397652

	Oblateness      0.00773291

	RotationPeriod  71.3086
	Obliquity       242.507
	EqAscendNode    178.156

	AbsMagn         5.51404
	SlopeParam      7.84893
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.626 0.621 0.615)

	Surface
	{
		SurfStyle       0.243628
		OceanStyle      0.762117
		Randomize      (0.939, -0.209, -0.470)
		colorDistMagn   0.969254
		colorDistFreq   0.00710008
		detailScale     99.5931
		colorConversion true
		snowLevel       2
		tropicLatitude  0.826174
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.308248
		terraceProb     0.735425
		erosion         0
		montesMagn      0.44172
		montesFreq      3.15726
		montesSpiky     0.942532
		montesFraction  0.40653
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0191249
		hillsFraction   0.886444
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.194018
		craterFreq      0.194921
		craterDensity   0.949848
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   167.302
		volcanoTemp     1101.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.249, 0.246, 0.000)
		colorShelf     (0.266, 0.264, 0.262, 0.000)
		colorBeach     (0.282, 0.280, 0.277, 0.000)
		colorDesert    (0.297, 0.295, 0.292, 0.000)
		colorLowland   (0.313, 0.311, 0.308, 0.000)
		colorUpland    (0.329, 0.326, 0.323, 0.000)
		colorRock      (0.344, 0.342, 0.338, 0.000)
		colorSnow      (0.360, 0.357, 0.354, 1.000)
		BumpHeight      3.28249
		BumpOffset      0.656498
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.513357
		GasToDust   0.25
		Particles   2016
		GasBright   0.113947
		DustBright  0.711529
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.74691
		Period          7.69638
		Eccentricity    0.954127
		Inclination     -157.551
		AscendingNode   113.812
		ArgOfPericenter -6.06827
		MeanAnomaly     174.248
	}
}

Comet	"C23"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            9.0354e-008
	Radius          63.0103
	InertiaMoment   0.399555

	Oblateness      0.00552656

	RotationPeriod  69.1198
	Obliquity       195.713
	EqAscendNode    162.734

	AbsMagn         6.97981
	SlopeParam      5.50386
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.784 0.781 0.778)

	Surface
	{
		SurfStyle       0.733477
		OceanStyle      0.425467
		Randomize      (0.957, 0.497, 0.099)
		colorDistMagn   0.0361589
		colorDistFreq   1.27719
		detailScale     1720.6
		colorConversion true
		snowLevel       2
		tropicLatitude  0.32156
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.291114
		terraceProb     0.274823
		erosion         0
		montesMagn      0.525187
		montesFreq      3.45182
		montesSpiky     0.9878
		montesFraction  0.67005
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.4436
		hillsFraction   0.653444
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229368
		craterFreq      0.157359
		craterDensity   0.926867
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   32.8658
		volcanoTemp     1628.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.265, 0.218, 0.000)
		colorShelf     (0.314, 0.273, 0.249, 0.000)
		colorBeach     (0.368, 0.320, 0.295, 0.000)
		colorDesert    (0.400, 0.344, 0.288, 0.000)
		colorLowland   (0.439, 0.367, 0.327, 0.000)
		colorUpland    (0.486, 0.445, 0.397, 0.000)
		colorRock      (0.525, 0.484, 0.428, 0.000)
		colorSnow      (0.572, 0.515, 0.451, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.994548
		GasToDust   0.25
		Particles   2988
		GasBright   0.100505
		DustBright  0.409458
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.21732
		Period          11.0058
		Eccentricity    0.948233
		Inclination     -19.4433
		AscendingNode   -64.2559
		ArgOfPericenter 165.982
		MeanAnomaly     41.5168
	}
}

Comet	"C24"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.78207e-015
	Radius          0.225331
	InertiaMoment   0.398343

	Oblateness      0.00869475

	RotationPeriod  67.0065
	Obliquity       148.919
	EqAscendNode    147.311

	AbsMagn         8.31664
	SlopeParam      4.37852
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.722 0.719 0.718)

	Surface
	{
		SurfStyle       0.0173989
		OceanStyle      0.189509
		Randomize      (-0.459, -0.574, 0.473)
		colorDistMagn   0.535224
		colorDistFreq   3.13821e-005
		detailScale     6.15303
		colorConversion true
		snowLevel       2
		tropicLatitude  0.831052
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.494739
		terraceProb     0.215062
		erosion         0
		montesMagn      0.538752
		montesFreq      4.13548
		montesSpiky     0.837847
		montesFraction  0.618309
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.77428e-005
		hillsFraction   0.58759
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211849
		craterFreq      0.269324
		craterDensity   0.961185
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   669.795
		volcanoTemp     1675.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.288, 0.287, 0.000)
		colorShelf     (0.307, 0.306, 0.305, 0.000)
		colorBeach     (0.325, 0.324, 0.323, 0.000)
		colorDesert    (0.343, 0.342, 0.341, 0.000)
		colorLowland   (0.361, 0.359, 0.359, 0.000)
		colorUpland    (0.379, 0.377, 0.377, 0.000)
		colorRock      (0.397, 0.395, 0.395, 0.000)
		colorSnow      (0.415, 0.413, 0.413, 1.000)
		BumpHeight      0.202798
		BumpOffset      0.0405595
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0649906
		GasToDust   0.25
		Particles   1111
		GasBright   0.254707
		DustBright  0.739743
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.56358
		Period          6.51717
		Eccentricity    0.918256
		Inclination     154.842
		AscendingNode   -3.77704
		ArgOfPericenter 146.423
		MeanAnomaly     -65.3948
	}
}

Comet	"C25"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.15173e-011
	Radius          3.90303
	InertiaMoment   0.399977

	Oblateness      0.00625502

	RotationPeriod  64.9568
	Obliquity       102.124
	EqAscendNode    131.888

	AbsMagn         9.6909
	SlopeParam      3.36882
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.719 0.567 0.493)

	Surface
	{
		SurfStyle       0.550942
		OceanStyle      0.0713221
		Randomize      (-0.645, -0.721, -0.826)
		colorDistMagn   0.795002
		colorDistFreq   0.00750915
		detailScale     106.579
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983519
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.540948
		terraceProb     0.369379
		erosion         0
		montesMagn      0.547266
		montesFreq      2.47928
		montesSpiky     0.863546
		montesFraction  0.706553
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0452673
		hillsFraction   0.620205
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214392
		craterFreq      0.177463
		craterDensity   0.876207
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   131.921
		volcanoTemp     1354.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.193, 0.138, 0.000)
		colorShelf     (0.288, 0.198, 0.158, 0.000)
		colorBeach     (0.338, 0.232, 0.187, 0.000)
		colorDesert    (0.367, 0.249, 0.182, 0.000)
		colorLowland   (0.403, 0.266, 0.207, 0.000)
		colorUpland    (0.446, 0.323, 0.251, 0.000)
		colorRock      (0.482, 0.351, 0.271, 0.000)
		colorSnow      (0.525, 0.374, 0.286, 1.000)
		BumpHeight      3.51273
		BumpOffset      0.702545
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.546182
		GasToDust   0.25
		Particles   2083
		GasBright   0.213983
		DustBright  0.464953
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.2273
		Period          11.0802
		Eccentricity    0.965846
		Inclination     128.736
		AscendingNode   -93.7124
		ArgOfPericenter -55.2652
		MeanAnomaly     -113.116
	}
}

Comet	"C26"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.66421e-007
	Radius          87.8543
	InertiaMoment   0.398877

	Oblateness      0.00977711

	RotationPeriod  62.9606
	Obliquity       55.3301
	EqAscendNode    116.466

	AbsMagn         11.3091
	SlopeParam      2.14827
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.527 0.425 0.299)

	Surface
	{
		SurfStyle       0.669997
		OceanStyle      0.871802
		Randomize      (-0.589, -0.878, -0.481)
		colorDistMagn   0.789974
		colorDistFreq   5.08217
		detailScale     2399.01
		colorConversion true
		snowLevel       2
		tropicLatitude  0.969107
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.451446
		terraceProb     0.29073
		erosion         0
		montesMagn      0.463395
		montesFreq      3.49613
		montesSpiky     0.98268
		montesFraction  0.456992
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.3645
		hillsFraction   0.566567
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.283858
		craterFreq      0.320995
		craterDensity   0.83668
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   33.7649
		volcanoTemp     1236.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.144, 0.084, 0.000)
		colorShelf     (0.211, 0.149, 0.096, 0.000)
		colorBeach     (0.248, 0.174, 0.114, 0.000)
		colorDesert    (0.269, 0.187, 0.111, 0.000)
		colorLowland   (0.295, 0.200, 0.125, 0.000)
		colorUpland    (0.327, 0.242, 0.152, 0.000)
		colorRock      (0.353, 0.263, 0.164, 0.000)
		colorSnow      (0.384, 0.280, 0.173, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.136
		DustBright  0.227423
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.61925
		Period          6.86832
		Eccentricity    0.947824
		Inclination     90.2729
		AscendingNode   107.649
		ArgOfPericenter 170.308
		MeanAnomaly     65.7862
	}
}

Comet	"C27"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            5.12422e-015
	Radius          0.241764
	InertiaMoment   0.397176

	Oblateness      0.00700247

	RotationPeriod  61.0095
	Obliquity       8.53576
	EqAscendNode    101.043

	AbsMagn         13.8489
	SlopeParam      5.82848
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.589 0.584 0.577)

	Surface
	{
		SurfStyle       0.210089
		OceanStyle      0.143093
		Randomize      (0.320, -0.138, 0.645)
		colorDistMagn   0.652097
		colorDistFreq   3.78541e-005
		detailScale     6.60177
		colorConversion true
		snowLevel       2
		tropicLatitude  0.866133
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446734
		terraceProb     0.126871
		erosion         0
		montesMagn      0.344344
		montesFreq      3.06969
		montesSpiky     0.908116
		montesFraction  0.75771
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000148469
		hillsFraction   0.791253
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264799
		craterFreq      0.231174
		craterDensity   0.798809
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   529.522
		volcanoTemp     1532.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.233, 0.231, 0.000)
		colorShelf     (0.250, 0.248, 0.245, 0.000)
		colorBeach     (0.265, 0.263, 0.260, 0.000)
		colorDesert    (0.280, 0.277, 0.274, 0.000)
		colorLowland   (0.295, 0.292, 0.289, 0.000)
		colorUpland    (0.309, 0.306, 0.303, 0.000)
		colorRock      (0.324, 0.321, 0.317, 0.000)
		colorSnow      (0.339, 0.336, 0.332, 1.000)
		BumpHeight      0.217588
		BumpOffset      0.0435175
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0978164
		GasToDust   0.25
		Particles   1177
		GasBright   0.367368
		DustBright  0.480541
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.76527
		Period          15.328
		Eccentricity    0.936483
		Inclination     -111.661
		AscendingNode   167.723
		ArgOfPericenter 16.6038
		MeanAnomaly     -19.3298
	}
}

Comet	"C28"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            3.96321e-011
	Radius          5.42973
	InertiaMoment   0.39934

	Oblateness      0.0110204

	RotationPeriod  59.0958
	Obliquity       321.741
	EqAscendNode    85.6207

	AbsMagn         2.03428
	SlopeParam      4.61519
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.806 0.736 0.690)

	Surface
	{
		SurfStyle       0.1935
		OceanStyle      0.6012
		Randomize      (-0.990, 0.846, 0.491)
		colorDistMagn   0.660029
		colorDistFreq   0.0177996
		detailScale     148.268
		colorConversion true
		snowLevel       2
		tropicLatitude  0.296894
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.56944
		terraceProb     0.22014
		erosion         0
		montesMagn      0.573056
		montesFreq      4.01068
		montesSpiky     0.885447
		montesFraction  0.525437
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0775097
		hillsFraction   0.616223
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263307
		craterFreq      0.250646
		craterDensity   0.804689
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   135.226
		volcanoTemp     1459.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.322, 0.295, 0.276, 0.000)
		colorShelf     (0.343, 0.313, 0.293, 0.000)
		colorBeach     (0.363, 0.331, 0.311, 0.000)
		colorDesert    (0.383, 0.350, 0.328, 0.000)
		colorLowland   (0.403, 0.368, 0.345, 0.000)
		colorUpland    (0.423, 0.387, 0.362, 0.000)
		colorRock      (0.443, 0.405, 0.380, 0.000)
		colorSnow      (0.463, 0.423, 0.397, 1.000)
		BumpHeight      4.88676
		BumpOffset      0.977352
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.579008
		GasToDust   0.25
		Particles   2149
		GasBright   0.262103
		DustBright  0.270292
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.57004
		Period          6.55759
		Eccentricity    0.9259
		Inclination     153.654
		AscendingNode   156.105
		ArgOfPericenter -155.891
		MeanAnomaly     54.942
	}
}

Comet	"C29"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            3.06526e-007
	Radius          94.4892
	InertiaMoment   0.398032

	Oblateness      0.00797221

	RotationPeriod  57.213
	Obliquity       274.947
	EqAscendNode    70.1981

	AbsMagn         4.63535
	SlopeParam      3.60597
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.548 0.401 0.334)

	Surface
	{
		SurfStyle       0.222744
		OceanStyle      0.712731
		Randomize      (0.234, 0.409, -0.570)
		colorDistMagn   0.729652
		colorDistFreq   5.61666
		detailScale     2580.18
		colorConversion true
		snowLevel       2
		tropicLatitude  0.64486
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.697079
		terraceProb     0.373501
		erosion         0
		montesMagn      0.632601
		montesFreq      3.65869
		montesSpiky     0.749634
		montesFraction  0.757609
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.6803
		hillsFraction   0.406132
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250843
		craterFreq      0.231101
		craterDensity   1.00873
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   26.758
		volcanoTemp     1706.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.160, 0.134, 0.000)
		colorShelf     (0.233, 0.170, 0.142, 0.000)
		colorBeach     (0.246, 0.181, 0.150, 0.000)
		colorDesert    (0.260, 0.191, 0.159, 0.000)
		colorLowland   (0.274, 0.201, 0.167, 0.000)
		colorUpland    (0.287, 0.211, 0.175, 0.000)
		colorRock      (0.301, 0.221, 0.184, 0.000)
		colorSnow      (0.315, 0.231, 0.192, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0111379
		DustBright  0.205744
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.55797
		Period          6.48212
		Eccentricity    0.942958
		Inclination     135.099
		AscendingNode   -179.381
		ArgOfPericenter 177.699
		MeanAnomaly     -34.4407
	}
}

Comet	"C30"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            9.43818e-015
	Radius          0.335629
	InertiaMoment   0.39977

	Oblateness      0.0124766

	RotationPeriod  55.3552
	Obliquity       228.153
	EqAscendNode    54.7755

	AbsMagn         6.26608
	SlopeParam      2.47586
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.788 0.786 0.785)

	Surface
	{
		SurfStyle       0.323601
		OceanStyle      0.575063
		Randomize      (0.324, 0.476, -0.466)
		colorDistMagn   0.820297
		colorDistFreq   1.72737e-005
		detailScale     9.1649
		colorConversion true
		snowLevel       2
		tropicLatitude  0.899762
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5836
		terraceProb     0.10155
		erosion         0
		montesMagn      0.484584
		montesFreq      2.37469
		montesSpiky     0.961387
		montesFraction  0.526628
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000281227
		hillsFraction   0.775855
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23685
		craterFreq      0.255548
		craterDensity   0.806236
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   541.653
		volcanoTemp     1445.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.314, 0.314, 0.000)
		colorShelf     (0.335, 0.334, 0.334, 0.000)
		colorBeach     (0.355, 0.354, 0.353, 0.000)
		colorDesert    (0.374, 0.373, 0.373, 0.000)
		colorLowland   (0.394, 0.393, 0.392, 0.000)
		colorUpland    (0.414, 0.413, 0.412, 0.000)
		colorRock      (0.433, 0.432, 0.432, 0.000)
		colorSnow      (0.453, 0.452, 0.451, 1.000)
		BumpHeight      0.302066
		BumpOffset      0.0604131
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.130642
		GasToDust   0.25
		Particles   1243
		GasBright   0.077431
		DustBright  0.623938
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.08441
		Period          10.0312
		Eccentricity    0.919484
		Inclination     132.026
		AscendingNode   91.0615
		ArgOfPericenter -175.954
		MeanAnomaly     123.044
	}
}

Comet	"C31"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            7.29976e-011
	Radius          5.85292
	InertiaMoment   0.398626

	Oblateness      0.00911358

	RotationPeriod  53.5167
	Obliquity       181.359
	EqAscendNode    39.3529

	AbsMagn         7.64396
	SlopeParam      6.21032
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.796 0.794 0.792)

	Surface
	{
		SurfStyle       0.111614
		OceanStyle      0.47641
		Randomize      (0.791, -0.344, -0.067)
		colorDistMagn   0.00406486
		colorDistFreq   0.0176589
		detailScale     159.824
		colorConversion true
		snowLevel       2
		tropicLatitude  0.909895
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.743866
		terraceProb     0.281543
		erosion         0
		montesMagn      0.426766
		montesFreq      2.85169
		montesSpiky     0.82855
		montesFraction  0.642744
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0833238
		hillsFraction   0.400366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238093
		craterFreq      0.244705
		craterDensity   0.766423
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   107.405
		volcanoTemp     1664.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.318, 0.317, 0.000)
		colorShelf     (0.338, 0.337, 0.337, 0.000)
		colorBeach     (0.358, 0.357, 0.357, 0.000)
		colorDesert    (0.378, 0.377, 0.376, 0.000)
		colorLowland   (0.398, 0.397, 0.396, 0.000)
		colorUpland    (0.418, 0.417, 0.416, 0.000)
		colorRock      (0.438, 0.437, 0.436, 0.000)
		colorSnow      (0.458, 0.456, 0.456, 1.000)
		BumpHeight      5.26762
		BumpOffset      1.05352
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.611834
		GasToDust   0.25
		Particles   2215
		GasBright   0.0653813
		DustBright  0.320474
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.04892
		Period          3.58091
		Eccentricity    0.966879
		Inclination     -66.8334
		AscendingNode   8.76107
		ArgOfPericenter -135.318
		MeanAnomaly     155.127
	}
}

Comet	"C32"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            5.64583e-007
	Radius          130.917
	InertiaMoment   0.396446

	Oblateness      0.014019

	RotationPeriod  51.6924
	Obliquity       134.564
	EqAscendNode    23.9303

	AbsMagn         8.97969
	SlopeParam      4.86085
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.732 0.730 0.725)

	Surface
	{
		SurfStyle       0.223541
		OceanStyle      0.227451
		Randomize      (-0.742, 0.298, -0.210)
		colorDistMagn   0.445886
		colorDistFreq   15.0328
		detailScale     3574.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.946701
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.643281
		terraceProb     0.504648
		erosion         0
		montesMagn      0.625896
		montesFreq      3.38067
		montesSpiky     0.978415
		montesFraction  0.0917617
		dunesFraction   0
		hillsMagn       0
		hillsFreq       48.537
		hillsFraction   0.646924
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.197084
		craterFreq      0.710894
		craterDensity   0.868471
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   27.3174
		volcanoTemp     1565.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.292, 0.290, 0.000)
		colorShelf     (0.311, 0.310, 0.308, 0.000)
		colorBeach     (0.330, 0.328, 0.326, 0.000)
		colorDesert    (0.348, 0.347, 0.344, 0.000)
		colorLowland   (0.366, 0.365, 0.362, 0.000)
		colorUpland    (0.384, 0.383, 0.381, 0.000)
		colorRock      (0.403, 0.401, 0.399, 0.000)
		colorSnow      (0.421, 0.420, 0.417, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.198865
		DustBright  0.671477
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.69508
		Period          7.35636
		Eccentricity    0.912376
		Inclination     -117.234
		AscendingNode   -89.9105
		ArgOfPericenter -149.636
		MeanAnomaly     -132.85
	}
}

Comet	"C33"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.7384e-014
	Radius          0.362546
	InertiaMoment   0.399118

	Oblateness      0.0104902

	RotationPeriod  49.8777
	Obliquity       87.77
	EqAscendNode    8.50773

	AbsMagn         10.4385
	SlopeParam      3.83768
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.455 0.447 0.442)

	Surface
	{
		SurfStyle       0.476015
		OceanStyle      0.553347
		Randomize      (-0.481, 0.597, -0.569)
		colorDistMagn   0.771588
		colorDistFreq   2.74088e-005
		detailScale     9.89991
		colorConversion true
		snowLevel       2
		tropicLatitude  0.599703
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.631639
		terraceProb     0.611957
		erosion         0
		montesMagn      0.5085
		montesFreq      2.61601
		montesSpiky     0.96573
		montesFraction  0.346396
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000328268
		hillsFraction   0.696674
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257608
		craterFreq      0.219296
		craterDensity   0.837749
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   431.116
		volcanoTemp     1516.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.179, 0.177, 0.000)
		colorShelf     (0.194, 0.190, 0.188, 0.000)
		colorBeach     (0.205, 0.201, 0.199, 0.000)
		colorDesert    (0.216, 0.212, 0.210, 0.000)
		colorLowland   (0.228, 0.224, 0.221, 0.000)
		colorUpland    (0.239, 0.235, 0.232, 0.000)
		colorRock      (0.250, 0.246, 0.243, 0.000)
		colorSnow      (0.262, 0.257, 0.254, 1.000)
		BumpHeight      0.326291
		BumpOffset      0.0652582
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.163468
		GasToDust   0.25
		Particles   1310
		GasBright   0.159533
		DustBright  0.395296
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.88553
		Period          8.63039
		Eccentricity    0.909188
		Inclination     124.569
		AscendingNode   -177.961
		ArgOfPericenter -27.6607
		MeanAnomaly     -37.6462
	}
}

Comet	"C34"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.34452e-010
	Radius          8.09446
	InertiaMoment   0.397663

	Oblateness      0.0161651

	RotationPeriod  48.0677
	Obliquity       40.9757
	EqAscendNode    353.085

	AbsMagn         12.342
	SlopeParam      2.76686
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.765 0.764 0.762)

	Surface
	{
		SurfStyle       0.969994
		OceanStyle      0.165773
		Randomize      (0.530, -0.893, 0.990)
		colorDistMagn   0.139484
		colorDistFreq   0.0023932
		detailScale     221.033
		colorConversion true
		snowLevel       2
		tropicLatitude  0.901239
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.356972
		terraceProb     0.470602
		erosion         0
		montesMagn      0.559689
		montesFreq      2.53875
		montesSpiky     0.973066
		montesFraction  0.373282
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.16923
		hillsFraction   0.773842
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255864
		craterFreq      0.187607
		craterDensity   0.731121
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   109.449
		volcanoTemp     1430.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.267, 0.305, 0.050)
		colorShelf     (0.306, 0.313, 0.351, 0.040)
		colorBeach     (0.352, 0.359, 0.396, 0.030)
		colorDesert    (0.398, 0.405, 0.450, 0.020)
		colorLowland   (0.444, 0.451, 0.496, 0.030)
		colorUpland    (0.489, 0.496, 0.541, 0.050)
		colorRock      (0.535, 0.542, 0.602, 0.020)
		colorSnow      (0.535, 0.542, 0.602, 1.000)
		BumpHeight      7.28501
		BumpOffset      1.457
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.64466
		GasToDust   0.25
		Particles   2282
		GasBright   0.082942
		DustBright  0.156373
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.51802
		Period          6.23444
		Eccentricity    0.93802
		Inclination     144.286
		AscendingNode   117.997
		ArgOfPericenter 36.162
		MeanAnomaly     -104.83
	}
}

Comet	"C35"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            4.13988e-018
	Radius          0.022457
	InertiaMoment   0.399561

	Oblateness      0.0121921

	RotationPeriod  46.2578
	Obliquity       354.181
	EqAscendNode    337.663

	AbsMagn         17.9036
	SlopeParam      6.69643
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.458 0.418 0.363)

	Surface
	{
		SurfStyle       0.526489
		OceanStyle      0.966082
		Randomize      (-0.593, 0.145, 0.395)
		colorDistMagn   0.477293
		colorDistFreq   5.70309e-008
		detailScale     0.613226
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991374
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.684276
		terraceProb     0.355019
		erosion         0
		montesMagn      0.412229
		montesFreq      3.4225
		montesSpiky     0.904249
		montesFraction  0.256783
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.26324e-006
		hillsFraction   0.625822
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216579
		craterFreq      0.266572
		craterDensity   0.774332
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1730.47
		volcanoTemp     1558.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.142, 0.102, 0.000)
		colorShelf     (0.183, 0.146, 0.116, 0.000)
		colorBeach     (0.215, 0.171, 0.138, 0.000)
		colorDesert    (0.234, 0.184, 0.134, 0.000)
		colorLowland   (0.257, 0.196, 0.153, 0.000)
		colorUpland    (0.284, 0.238, 0.185, 0.000)
		colorRock      (0.307, 0.259, 0.200, 0.000)
		colorSnow      (0.335, 0.276, 0.211, 1.000)
		BumpHeight      0.0202113
		BumpOffset      0.00404226
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.293593
		DustBright  0.430209
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.69489
		Period          14.7465
		Eccentricity    0.962675
		Inclination     101.158
		AscendingNode   51.8404
		ArgOfPericenter -166.336
		MeanAnomaly     40.6456
	}
}

Comet	"C36"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            3.2019e-014
	Radius          0.500525
	InertiaMoment   0.398351

	Oblateness      0.0188218

	RotationPeriod  44.4436
	Obliquity       307.387
	EqAscendNode    322.24

	AbsMagn         3.55292
	SlopeParam      5.12027
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.759 0.756 0.754)

	Surface
	{
		SurfStyle       0.527559
		OceanStyle      0.826455
		Randomize      (-0.358, 0.970, -0.013)
		colorDistMagn   0.0888819
		colorDistFreq   0.00014166
		detailScale     13.6677
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997064
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.655035
		terraceProb     0.14162
		erosion         0
		montesMagn      0.468516
		montesFreq      2.38157
		montesSpiky     0.964279
		montesFraction  0.780087
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000411812
		hillsFraction   0.604481
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226075
		craterFreq      0.249175
		craterDensity   0.749473
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   438.559
		volcanoTemp     1163.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.257, 0.211, 0.000)
		colorShelf     (0.303, 0.265, 0.241, 0.000)
		colorBeach     (0.357, 0.310, 0.287, 0.000)
		colorDesert    (0.387, 0.333, 0.279, 0.000)
		colorLowland   (0.425, 0.355, 0.317, 0.000)
		colorUpland    (0.470, 0.431, 0.385, 0.000)
		colorRock      (0.508, 0.469, 0.415, 0.000)
		colorSnow      (0.554, 0.499, 0.437, 1.000)
		BumpHeight      0.450472
		BumpOffset      0.0900944
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.196294
		GasToDust   0.25
		Particles   1376
		GasBright   0.18972
		DustBright  0.218568
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.37381
		Period          5.36745
		Eccentricity    0.883472
		Inclination     129.243
		AscendingNode   -41.5268
		ArgOfPericenter -161.278
		MeanAnomaly     -26.8689
	}
}

Comet	"C37"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.47644e-010
	Radius          8.77693
	InertiaMoment   0.399983

	Oblateness      0.0143561

	RotationPeriod  42.6202
	Obliquity       260.593
	EqAscendNode    306.817

	AbsMagn         5.49192
	SlopeParam      4.06723
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.697 0.613 0.530)

	Surface
	{
		SurfStyle       0.346728
		OceanStyle      0.0992442
		Randomize      (0.338, 0.021, -0.945)
		colorDistMagn   0.607674
		colorDistFreq   0.0122602
		detailScale     239.669
		colorConversion true
		snowLevel       2
		tropicLatitude  0.984401
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.334019
		terraceProb     0.368513
		erosion         0
		montesMagn      0.425508
		montesFreq      3.15027
		montesSpiky     0.994153
		montesFraction  0.364709
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.127341
		hillsFraction   0.740587
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242968
		craterFreq      0.23622
		craterDensity   0.870291
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   87.4449
		volcanoTemp     1380.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.245, 0.212, 0.000)
		colorShelf     (0.296, 0.261, 0.225, 0.000)
		colorBeach     (0.314, 0.276, 0.238, 0.000)
		colorDesert    (0.331, 0.291, 0.252, 0.000)
		colorLowland   (0.348, 0.307, 0.265, 0.000)
		colorUpland    (0.366, 0.322, 0.278, 0.000)
		colorRock      (0.383, 0.337, 0.291, 0.000)
		colorSnow      (0.401, 0.353, 0.305, 1.000)
		BumpHeight      7.89923
		BumpOffset      1.57985
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.677486
		GasToDust   0.25
		Particles   2348
		GasBright   0.0211736
		DustBright  0.871601
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.5203
		Period          6.24846
		Eccentricity    0.953559
		Inclination     -0.934348
		AscendingNode   38.9392
		ArgOfPericenter 162.434
		MeanAnomaly     -142.656
	}
}

Comet	"C38"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            7.62515e-018
	Radius          0.0309532
	InertiaMoment   0.398883

	Oblateness      0.0222428

	RotationPeriod  40.783
	Obliquity       213.798
	EqAscendNode    291.395

	AbsMagn         6.96099
	SlopeParam      3.03379
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.610 0.608 0.605)

	Surface
	{
		SurfStyle       0.0127497
		OceanStyle      0.448856
		Randomize      (-0.350, 0.164, -0.707)
		colorDistMagn   0.183975
		colorDistFreq   7.82317e-007
		detailScale     0.84523
		colorConversion true
		snowLevel       2
		tropicLatitude  0.555593
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.416448
		terraceProb     0.382761
		erosion         0
		montesMagn      0.452983
		montesFreq      3.43661
		montesSpiky     0.957399
		montesFraction  0.646438
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.15113e-006
		hillsFraction   0.475905
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24568
		craterFreq      0.275262
		craterDensity   0.908514
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1757.47
		volcanoTemp     1521.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.243, 0.242, 0.000)
		colorShelf     (0.259, 0.258, 0.257, 0.000)
		colorBeach     (0.275, 0.274, 0.272, 0.000)
		colorDesert    (0.290, 0.289, 0.287, 0.000)
		colorLowland   (0.305, 0.304, 0.303, 0.000)
		colorUpland    (0.321, 0.319, 0.318, 0.000)
		colorRock      (0.336, 0.334, 0.333, 0.000)
		colorSnow      (0.351, 0.350, 0.348, 1.000)
		BumpHeight      0.0278579
		BumpOffset      0.00557158
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0477752
		DustBright  0.529486
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.15181
		Period          10.5217
		Eccentricity    0.957729
		Inclination     -179.767
		AscendingNode   -101.775
		ArgOfPericenter 113.337
		MeanAnomaly     164.945
	}
}

Comet	"C39"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            5.89751e-014
	Radius          0.543666
	InertiaMoment   0.397191

	Oblateness      0.0169963

	RotationPeriod  38.9267
	Obliquity       167.004
	EqAscendNode    275.972

	AbsMagn         8.29838
	SlopeParam      7.43281
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.708 0.705 0.702)

	Surface
	{
		SurfStyle       0.657838
		OceanStyle      0.649588
		Randomize      (0.275, -0.264, -0.926)
		colorDistMagn   0.0840073
		colorDistFreq   8.1654e-005
		detailScale     14.8457
		colorConversion true
		snowLevel       2
		tropicLatitude  0.730533
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539707
		terraceProb     0.256628
		erosion         0
		montesMagn      0.205722
		montesFreq      3.60736
		montesSpiky     0.928025
		montesFraction  0.743238
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000735753
		hillsFraction   0.635641
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239704
		craterFreq      0.254993
		craterDensity   0.842534
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   350.998
		volcanoTemp     1698.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.240, 0.197, 0.000)
		colorShelf     (0.283, 0.247, 0.225, 0.000)
		colorBeach     (0.333, 0.289, 0.267, 0.000)
		colorDesert    (0.361, 0.310, 0.260, 0.000)
		colorLowland   (0.396, 0.331, 0.295, 0.000)
		colorUpland    (0.439, 0.402, 0.358, 0.000)
		colorRock      (0.474, 0.437, 0.386, 0.000)
		colorSnow      (0.517, 0.465, 0.407, 1.000)
		BumpHeight      0.4893
		BumpOffset      0.09786
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.22912
		GasToDust   0.25
		Particles   1442
		GasBright   0.0371177
		DustBright  0.22463
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.23509
		Period          11.1384
		Eccentricity    0.961583
		Inclination     35.6578
		AscendingNode   -146.112
		ArgOfPericenter 78.2874
		MeanAnomaly     59.7451
	}
}

Comet	"C40"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            4.5613e-010
	Radius          12.0789
	InertiaMoment   0.399346

	Oblateness      0.0268248

	RotationPeriod  37.046
	Obliquity       120.21
	EqAscendNode    260.55

	AbsMagn         9.67101
	SlopeParam      5.40014
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.579 0.572 0.569)

	Surface
	{
		SurfStyle       0.170474
		OceanStyle      0.0535944
		Randomize      (0.631, 0.656, 0.771)
		colorDistMagn   0.357004
		colorDistFreq   0.0915975
		detailScale     329.833
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972198
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.634881
		terraceProb     0.157943
		erosion         0
		montesMagn      0.577898
		montesFreq      3.04562
		montesSpiky     0.916252
		montesFraction  0.758451
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.377076
		hillsFraction   0.710368
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201993
		craterFreq      0.225028
		craterDensity   0.872763
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   88.6722
		volcanoTemp     1441.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.229, 0.228, 0.000)
		colorShelf     (0.246, 0.243, 0.242, 0.000)
		colorBeach     (0.261, 0.258, 0.256, 0.000)
		colorDesert    (0.275, 0.272, 0.270, 0.000)
		colorLowland   (0.290, 0.286, 0.284, 0.000)
		colorUpland    (0.304, 0.300, 0.299, 0.000)
		colorRock      (0.319, 0.315, 0.313, 0.000)
		colorSnow      (0.333, 0.329, 0.327, 1.000)
		BumpHeight      10.871
		BumpOffset      2.17419
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.710312
		GasToDust   0.25
		Particles   2414
		GasBright   0.149883
		DustBright  0.596352
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.87434
		Period          8.55367
		Eccentricity    0.932829
		Inclination     128.003
		AscendingNode   83.6223
		ArgOfPericenter -30.3651
		MeanAnomaly     -75.3289
	}
}

Comet	"C41"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.40446e-017
	Radius          0.0336762
	InertiaMoment   0.39804

	Oblateness      0.0208875

	RotationPeriod  35.1349
	Obliquity       73.4156
	EqAscendNode    245.127

	AbsMagn         11.2835
	SlopeParam      4.29767
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.523 0.404 0.303)

	Surface
	{
		SurfStyle       0.728125
		OceanStyle      0.366282
		Randomize      (0.334, -0.350, -0.756)
		colorDistMagn   0.30638
		colorDistFreq   3.12797e-007
		detailScale     0.919584
		colorConversion true
		snowLevel       2
		tropicLatitude  0.900065
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.569769
		terraceProb     0.127314
		erosion         0
		montesMagn      0.470265
		montesFreq      3.42576
		montesSpiky     0.881411
		montesFraction  0.706538
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.9821e-006
		hillsFraction   0.711489
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247246
		craterFreq      0.167811
		craterDensity   0.855764
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1408.88
		volcanoTemp     1358.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.137, 0.085, 0.000)
		colorShelf     (0.209, 0.141, 0.097, 0.000)
		colorBeach     (0.246, 0.165, 0.115, 0.000)
		colorDesert    (0.267, 0.178, 0.112, 0.000)
		colorLowland   (0.293, 0.190, 0.127, 0.000)
		colorUpland    (0.324, 0.230, 0.155, 0.000)
		colorRock      (0.350, 0.250, 0.167, 0.000)
		colorSnow      (0.382, 0.266, 0.176, 1.000)
		BumpHeight      0.0303085
		BumpOffset      0.00606171
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.111943
		DustBright  0.318778
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.1867
		Period          10.7786
		Eccentricity    0.959865
		Inclination     -131.015
		AscendingNode   -110.094
		ArgOfPericenter 94.3029
		MeanAnomaly     -86.3861
	}
}

Comet	"C42"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.08625e-013
	Radius          0.747104
	InertiaMoment   0.399776

	Oblateness      0.0332671

	RotationPeriod  33.1868
	Obliquity       26.6213
	EqAscendNode    229.704

	AbsMagn         13.7964
	SlopeParam      3.28447
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.687 0.684 0.683)

	Surface
	{
		SurfStyle       0.928335
		OceanStyle      0.862419
		Randomize      (-0.050, 0.360, 0.929)
		colorDistMagn   0.690274
		colorDistFreq   0.000305958
		detailScale     20.4009
		colorConversion true
		snowLevel       2
		tropicLatitude  0.255598
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.364489
		terraceProb     0.412753
		erosion         0
		montesMagn      0.605153
		montesFreq      1.861
		montesSpiky     0.99267
		montesFraction  0.454997
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00129101
		hillsFraction   0.603651
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241503
		craterFreq      0.226715
		craterDensity   1.00895
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   355.404
		volcanoTemp     1369.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.239, 0.273, 0.050)
		colorShelf     (0.275, 0.280, 0.314, 0.040)
		colorBeach     (0.316, 0.321, 0.355, 0.030)
		colorDesert    (0.357, 0.362, 0.403, 0.020)
		colorLowland   (0.399, 0.403, 0.444, 0.030)
		colorUpland    (0.440, 0.445, 0.485, 0.050)
		colorRock      (0.481, 0.486, 0.539, 0.020)
		colorSnow      (0.481, 0.486, 0.539, 1.000)
		BumpHeight      0.672393
		BumpOffset      0.134479
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.261946
		GasToDust   0.25
		Particles   1508
		GasBright   0.291899
		DustBright  0.623309
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.07764
		Period          9.98237
		Eccentricity    0.940854
		Inclination     -167.852
		AscendingNode   169.834
		ArgOfPericenter -49.586
		MeanAnomaly     -178.716
	}
}

Comet	"C43"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            8.40133e-010
	Radius          13.1617
	InertiaMoment   0.398633

	Oblateness      0.0265037

	RotationPeriod  31.1943
	Obliquity       339.827
	EqAscendNode    214.282

	AbsMagn         1.97834
	SlopeParam      2.02225
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.769 0.764 0.763)

	Surface
	{
		SurfStyle       0.853811
		OceanStyle      0.54932
		Randomize      (-0.460, 0.978, 0.323)
		colorDistMagn   0.164011
		colorDistFreq   0.00681848
		detailScale     359.402
		colorConversion true
		snowLevel       2
		tropicLatitude  0.854157
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.542743
		terraceProb     0.282241
		erosion         0
		montesMagn      0.399736
		montesFreq      3.27822
		montesSpiky     0.992221
		montesFraction  0.389826
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.461315
		hillsFraction   0.820334
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249465
		craterFreq      0.268285
		craterDensity   0.872748
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   71.1941
		volcanoTemp     1572.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.268, 0.305, 0.050)
		colorShelf     (0.307, 0.313, 0.351, 0.040)
		colorBeach     (0.354, 0.359, 0.397, 0.030)
		colorDesert    (0.400, 0.405, 0.450, 0.020)
		colorLowland   (0.446, 0.451, 0.496, 0.030)
		colorUpland    (0.492, 0.497, 0.542, 0.050)
		colorRock      (0.538, 0.543, 0.603, 0.020)
		colorSnow      (0.538, 0.543, 0.603, 1.000)
		BumpHeight      11.8455
		BumpOffset      2.36911
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.743138
		GasToDust   0.25
		Particles   2481
		GasBright   0.226677
		DustBright  0.373017
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.40049
		Period          5.52456
		Eccentricity    0.933816
		Inclination     139.739
		AscendingNode   28.275
		ArgOfPericenter -92.9226
		MeanAnomaly     -105.799
	}
}

Comet	"C44"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.58683e-017
	Radius          0.0462135
	InertiaMoment   0.396471

	Oblateness      0.0423296

	RotationPeriod  29.1489
	Obliquity       293.033
	EqAscendNode    198.859

	AbsMagn         4.60935
	SlopeParam      5.7106
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.481 0.476 0.473)

	Surface
	{
		SurfStyle       0.969333
		OceanStyle      0.0742952
		Randomize      (-0.160, 0.919, -0.100)
		colorDistMagn   0.48666
		colorDistFreq   1.01414e-006
		detailScale     1.26194
		colorConversion true
		snowLevel       2
		tropicLatitude  0.321075
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.537505
		terraceProb     0.710608
		erosion         0
		montesMagn      0.580504
		montesFreq      2.45819
		montesSpiky     0.976629
		montesFraction  0.579369
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.7738e-006
		hillsFraction   0.573528
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224418
		craterFreq      0.228908
		craterDensity   0.897567
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1424.59
		volcanoTemp     1328.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.167, 0.189, 0.050)
		colorShelf     (0.192, 0.195, 0.217, 0.040)
		colorBeach     (0.221, 0.224, 0.246, 0.030)
		colorDesert    (0.250, 0.252, 0.279, 0.020)
		colorLowland   (0.279, 0.281, 0.307, 0.030)
		colorUpland    (0.308, 0.310, 0.336, 0.050)
		colorRock      (0.337, 0.338, 0.374, 0.020)
		colorSnow      (0.337, 0.338, 0.374, 1.000)
		BumpHeight      0.0415922
		BumpOffset      0.00831843
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.124197
		DustBright  0.159984
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.10401
		Period          10.1731
		Eccentricity    0.929246
		Inclination     104.316
		AscendingNode   162.473
		ArgOfPericenter 12.9652
		MeanAnomaly     135.938
	}
}

Comet	"C45"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.00073e-013
	Radius          0.81527
	InertiaMoment   0.399123

	Oblateness      0.0352653

	RotationPeriod  27.0407
	Obliquity       246.238
	EqAscendNode    183.437

	AbsMagn         6.24606
	SlopeParam      4.53215
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.516 0.510 0.504)

	Surface
	{
		SurfStyle       0.594906
		OceanStyle      0.638222
		Randomize      (-0.090, -0.687, -0.921)
		colorDistMagn   0.273586
		colorDistFreq   0.000226087
		detailScale     22.2623
		colorConversion true
		snowLevel       2
		tropicLatitude  0.175567
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.507852
		terraceProb     0.254007
		erosion         0
		montesMagn      0.59192
		montesFreq      3.30272
		montesSpiky     0.995778
		montesFraction  0.24168
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00187145
		hillsFraction   0.662805
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228962
		craterFreq      0.200566
		craterDensity   0.894797
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   285.768
		volcanoTemp     1465.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.201, 0.173, 0.141, 0.000)
		colorShelf     (0.206, 0.178, 0.161, 0.000)
		colorBeach     (0.242, 0.209, 0.192, 0.000)
		colorDesert    (0.263, 0.224, 0.187, 0.000)
		colorLowland   (0.289, 0.239, 0.212, 0.000)
		colorUpland    (0.320, 0.290, 0.257, 0.000)
		colorRock      (0.345, 0.316, 0.277, 0.000)
		colorSnow      (0.376, 0.336, 0.293, 1.000)
		BumpHeight      0.733743
		BumpOffset      0.146749
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.294772
		GasToDust   0.25
		Particles   1575
		GasBright   0.381319
		DustBright  0.387348
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.08413
		Period          10.0292
		Eccentricity    0.906899
		Inclination     75.7008
		AscendingNode   176.223
		ArgOfPericenter -10.6962
		MeanAnomaly     69.7554
	}
}

Comet	"C46"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.54742e-009
	Radius          18.038
	InertiaMoment   0.397673

	Oblateness      0.0581202

	RotationPeriod  24.8581
	Obliquity       199.444
	EqAscendNode    168.014

	AbsMagn         7.62568
	SlopeParam      3.52436
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.566 0.559 0.554)

	Surface
	{
		SurfStyle       0.283998
		OceanStyle      0.678984
		Randomize      (0.605, -0.466, 0.257)
		colorDistMagn   0.743786
		colorDistFreq   0.172701
		detailScale     492.557
		colorConversion true
		snowLevel       2
		tropicLatitude  0.755592
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.324624
		terraceProb     0.122652
		erosion         0
		montesMagn      0.628276
		montesFreq      3.1826
		montesSpiky     0.892459
		montesFraction  0.228438
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.864999
		hillsFraction   0.505042
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218705
		craterFreq      0.277339
		craterDensity   0.949026
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   71.8935
		volcanoTemp     1296.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.226, 0.224, 0.222, 0.000)
		colorShelf     (0.240, 0.238, 0.236, 0.000)
		colorBeach     (0.255, 0.252, 0.249, 0.000)
		colorDesert    (0.269, 0.266, 0.263, 0.000)
		colorLowland   (0.283, 0.280, 0.277, 0.000)
		colorUpland    (0.297, 0.294, 0.291, 0.000)
		colorRock      (0.311, 0.308, 0.305, 0.000)
		colorSnow      (0.325, 0.322, 0.319, 1.000)
		BumpHeight      16.2342
		BumpOffset      3.24683
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.775964
		GasToDust   0.25
		Particles   2547
		GasBright   0.0249796
		DustBright  0.428174
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.89403
		Period          16.411
		Eccentricity    0.966015
		Inclination     53.9123
		AscendingNode   111.734
		ArgOfPericenter -127.097
		MeanAnomaly     -68.2663
	}
}

Comet	"C47"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            4.76462e-017
	Radius          0.0504999
	InertiaMoment   0.399566

	Oblateness      0.0505271

	RotationPeriod  22.5868
	Obliquity       152.65
	EqAscendNode    152.591

	AbsMagn         8.96094
	SlopeParam      2.36704
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.756 0.754 0.752)

	Surface
	{
		SurfStyle       0.248266
		OceanStyle      0.595249
		Randomize      (-0.936, 0.828, 0.985)
		colorDistMagn   0.899526
		colorDistFreq   2.11822e-006
		detailScale     1.37898
		colorConversion true
		snowLevel       2
		tropicLatitude  0.74397
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.349523
		terraceProb     0.415878
		erosion         0
		montesMagn      0.365552
		montesFreq      3.05817
		montesSpiky     0.944823
		montesFraction  0.540891
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.16304e-006
		hillsFraction   0.667094
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255528
		craterFreq      0.191566
		craterDensity   0.763268
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1147.05
		volcanoTemp     1779.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.302, 0.301, 0.000)
		colorShelf     (0.321, 0.321, 0.320, 0.000)
		colorBeach     (0.340, 0.339, 0.338, 0.000)
		colorDesert    (0.359, 0.358, 0.357, 0.000)
		colorLowland   (0.378, 0.377, 0.376, 0.000)
		colorUpland    (0.397, 0.396, 0.395, 0.000)
		colorRock      (0.416, 0.415, 0.414, 0.000)
		colorSnow      (0.435, 0.434, 0.432, 1.000)
		BumpHeight      0.0454499
		BumpOffset      0.00908998
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.10705
		DustBright  0.830591
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.78034
		Period          15.4535
		Eccentricity    0.954543
		Inclination     158.699
		AscendingNode   17.32
		ArgOfPericenter 144.849
		MeanAnomaly     37.5453
	}
}

Comet	"C48"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            3.68509e-013
	Radius          1.11592
	InertiaMoment   0.398358

	Oblateness      0.0876528

	RotationPeriod  20.2095
	Obliquity       105.856
	EqAscendNode    137.169

	AbsMagn         10.4166
	SlopeParam      6.06909
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.718 0.714 0.712)

	Surface
	{
		SurfStyle       0.941366
		OceanStyle      0.107546
		Randomize      (0.897, 0.032, -0.511)
		colorDistMagn   0.724385
		colorDistFreq   0.00026436
		detailScale     30.4721
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991413
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.725324
		terraceProb     0.367961
		erosion         0
		montesMagn      0.470196
		montesFreq      2.99274
		montesSpiky     0.810507
		montesFraction  0.466991
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00317503
		hillsFraction   0.675177
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254476
		craterFreq      0.16544
		craterDensity   0.844718
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   288.215
		volcanoTemp     1659.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.250, 0.285, 0.050)
		colorShelf     (0.287, 0.293, 0.327, 0.040)
		colorBeach     (0.330, 0.335, 0.370, 0.030)
		colorDesert    (0.373, 0.378, 0.420, 0.020)
		colorLowland   (0.416, 0.421, 0.463, 0.030)
		colorUpland    (0.459, 0.464, 0.505, 0.050)
		colorRock      (0.502, 0.507, 0.562, 0.020)
		colorSnow      (0.502, 0.507, 0.562, 1.000)
		BumpHeight      1.00433
		BumpOffset      0.200866
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.327598
		GasToDust   0.25
		Particles   1641
		GasBright   0.107761
		DustBright  0.514366
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.70443
		Period          14.825
		Eccentricity    0.957644
		Inclination     -143.699
		AscendingNode   99.0333
		ArgOfPericenter -89.5087
		MeanAnomaly     -164.017
	}
}

Comet	"C49"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.85016e-009
	Radius          19.7369
	InertiaMoment   0.399988

	Oblateness      0.0822031

	RotationPeriod  17.7043
	Obliquity       59.0612
	EqAscendNode    121.746

	AbsMagn         12.3093
	SlopeParam      4.77421
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.609 0.517 0.405)

	Surface
	{
		SurfStyle       0.939322
		OceanStyle      0.979727
		Randomize      (-0.426, -0.884, -0.647)
		colorDistMagn   0.793852
		colorDistFreq   0.12857
		detailScale     538.95
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997299
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.409389
		terraceProb     0.132497
		erosion         0
		montesMagn      0.514948
		montesFreq      2.96016
		montesSpiky     0.942751
		montesFraction  0.570979
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.949633
		hillsFraction   0.807675
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259288
		craterFreq      0.197817
		craterDensity   0.884787
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   57.9631
		volcanoTemp     1801.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.181, 0.162, 0.050)
		colorShelf     (0.244, 0.212, 0.186, 0.040)
		colorBeach     (0.280, 0.243, 0.210, 0.030)
		colorDesert    (0.317, 0.274, 0.239, 0.020)
		colorLowland   (0.353, 0.305, 0.263, 0.030)
		colorUpland    (0.390, 0.336, 0.287, 0.050)
		colorRock      (0.426, 0.367, 0.320, 0.020)
		colorSnow      (0.426, 0.367, 0.320, 1.000)
		BumpHeight      17.7632
		BumpOffset      3.55265
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.80879
		GasToDust   0.25
		Particles   2613
		GasBright   0.071214
		DustBright  0.2354
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.58281
		Period          13.8362
		Eccentricity    0.962047
		Inclination     134.061
		AscendingNode   134.367
		ArgOfPericenter 66.3337
		MeanAnomaly     52.3684
	}
}

Comet	"C50"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            8.77585e-017
	Radius          0.069041
	InertiaMoment   0.398889

	Oblateness      0.157633

	RotationPeriod  15.0431
	Obliquity       12.2669
	EqAscendNode    106.324

	AbsMagn         17.5536
	SlopeParam      3.75758
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.535 0.500 0.434)

	Surface
	{
		SurfStyle       0.66678
		OceanStyle      0.551448
		Randomize      (0.366, 0.527, -0.700)
		colorDistMagn   0.998452
		colorDistFreq   1.72792e-006
		detailScale     1.88528
		colorConversion true
		snowLevel       2
		tropicLatitude  0.926026
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581756
		terraceProb     0.268266
		erosion         0
		montesMagn      0.550662
		montesFreq      2.72914
		montesSpiky     0.897016
		montesFraction  0.351549
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.48196e-005
		hillsFraction   0.569799
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207035
		craterFreq      0.161073
		craterDensity   0.886594
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1155.5
		volcanoTemp     1485.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.170, 0.121, 0.000)
		colorShelf     (0.214, 0.175, 0.139, 0.000)
		colorBeach     (0.251, 0.205, 0.165, 0.000)
		colorDesert    (0.273, 0.220, 0.160, 0.000)
		colorLowland   (0.299, 0.235, 0.182, 0.000)
		colorUpland    (0.331, 0.285, 0.221, 0.000)
		colorRock      (0.358, 0.310, 0.238, 0.000)
		colorSnow      (0.390, 0.330, 0.251, 1.000)
		BumpHeight      0.0621369
		BumpOffset      0.0124274
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.230451
		DustBright  0.560649
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.91419
		Period          8.82789
		Eccentricity    0.953333
		Inclination     -56.4894
		AscendingNode   156.153
		ArgOfPericenter 119.475
		MeanAnomaly     -105.026
	}
}

Comet	"C51"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            6.78748e-013
	Radius          1.22255
	InertiaMoment   0.397205

	Oblateness      0.171301

	RotationPeriod  12.1882
	Obliquity       325.473
	EqAscendNode    90.9011

	AbsMagn         3.51899
	SlopeParam      2.66899
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.761 0.713 0.650)

	Surface
	{
		SurfStyle       0.777431
		OceanStyle      0.935295
		Randomize      (0.225, -0.529, -0.287)
		colorDistMagn   0.379777
		colorDistFreq   0.000945419
		detailScale     33.3839
		colorConversion true
		snowLevel       2
		tropicLatitude  0.682898
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.588864
		terraceProb     0.586287
		erosion         0
		montesMagn      0.537073
		montesFreq      3.67222
		montesSpiky     0.884616
		montesFraction  0.613827
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00423326
		hillsFraction   0.668999
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.279053
		craterFreq      0.212487
		craterDensity   0.693143
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   232.659
		volcanoTemp     1388.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.242, 0.182, 0.000)
		colorShelf     (0.305, 0.249, 0.208, 0.000)
		colorBeach     (0.358, 0.292, 0.247, 0.000)
		colorDesert    (0.388, 0.314, 0.241, 0.000)
		colorLowland   (0.426, 0.335, 0.273, 0.000)
		colorUpland    (0.472, 0.406, 0.332, 0.000)
		colorRock      (0.510, 0.442, 0.358, 0.000)
		colorSnow      (0.556, 0.470, 0.377, 1.000)
		BumpHeight      1.1003
		BumpOffset      0.22006
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.360424
		GasToDust   0.25
		Particles   1707
		GasBright   0.166622
		DustBright  0.308965
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.39719
		Period          12.3718
		Eccentricity    0.965607
		Inclination     -77.4359
		AscendingNode   -175.215
		ArgOfPericenter 95.2073
		MeanAnomaly     107.57
	}
}

Comet	"C52"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            5.24963e-009
	Radius          26.9528
	InertiaMoment   0.399351

	Oblateness      0.249

	RotationPeriod  9.08831
	Obliquity       278.678
	EqAscendNode    75.4785

	AbsMagn         5.46972
	SlopeParam      6.51054
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.606 0.603 0.599)

	Surface
	{
		SurfStyle       0.545993
		OceanStyle      0.790706
		Randomize      (0.421, 0.385, -0.887)
		colorDistMagn   0.50325
		colorDistFreq   0.464488
		detailScale     735.991
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988404
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.480935
		terraceProb     0.397314
		erosion         0
		montesMagn      0.559553
		montesFreq      4.00006
		montesSpiky     0.985915
		montesFraction  0.341904
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.5062
		hillsFraction   0.663727
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241305
		craterFreq      0.182245
		craterDensity   0.995993
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   58.3238
		volcanoTemp     1602.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.205, 0.168, 0.000)
		colorShelf     (0.242, 0.211, 0.192, 0.000)
		colorBeach     (0.285, 0.247, 0.228, 0.000)
		colorDesert    (0.309, 0.265, 0.222, 0.000)
		colorLowland   (0.339, 0.283, 0.251, 0.000)
		colorUpland    (0.376, 0.344, 0.305, 0.000)
		colorRock      (0.406, 0.374, 0.329, 0.000)
		colorSnow      (0.442, 0.398, 0.347, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.841616
		GasToDust   0.25
		Particles   2680
		GasBright   0.39305
		DustBright  0.567024
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.9907
		Period          17.24
		Eccentricity    0.950997
		Inclination     -142.568
		AscendingNode   116.88
		ArgOfPericenter -21.5949
		MeanAnomaly     61.2387
	}
}

Comet	"C53"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.6164e-016
	Radius          0.075728
	InertiaMoment   0.398049

	Oblateness      0.249

	RotationPeriod  5.66925
	Obliquity       231.884
	EqAscendNode    60.0559

	AbsMagn         6.94215
	SlopeParam      5.02821
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.653 0.651 0.649)

	Surface
	{
		SurfStyle       0.809811
		OceanStyle      0.582374
		Randomize      (0.038, -0.269, 0.544)
		colorDistMagn   0.644287
		colorDistFreq   2.68253e-006
		detailScale     2.06788
		colorConversion true
		snowLevel       2
		tropicLatitude  0.741826
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.526268
		terraceProb     0.18721
		erosion         0
		montesMagn      0.516453
		montesFreq      3.68078
		montesSpiky     0.745317
		montesFraction  0.50827
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.32959e-005
		hillsFraction   0.526686
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257828
		craterFreq      0.254556
		craterDensity   1.01259
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   933.874
		volcanoTemp     1333.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.221, 0.182, 0.000)
		colorShelf     (0.261, 0.228, 0.208, 0.000)
		colorBeach     (0.307, 0.267, 0.247, 0.000)
		colorDesert    (0.333, 0.286, 0.240, 0.000)
		colorLowland   (0.366, 0.306, 0.272, 0.000)
		colorUpland    (0.405, 0.371, 0.331, 0.000)
		colorRock      (0.438, 0.403, 0.357, 0.000)
		colorSnow      (0.477, 0.429, 0.376, 1.000)
		BumpHeight      0.0681552
		BumpOffset      0.013631
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.301938
		DustBright  0.342622
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.71677
		Period          7.49801
		Eccentricity    0.922453
		Inclination     -165.108
		AscendingNode   -111.489
		ArgOfPericenter 24.329
		MeanAnomaly     -151.44
	}
}

Comet	"C54"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.25017e-012
	Radius          1.66772
	InertiaMoment   0.399781

	Oblateness      0.00162795

	RotationPeriod  147.486
	Obliquity       185.09
	EqAscendNode    44.6333

	AbsMagn         8.28013
	SlopeParam      3.98753
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.793 0.722 0.666)

	Surface
	{
		SurfStyle       0.101789
		OceanStyle      0.919394
		Randomize      (-0.830, 0.264, 0.283)
		colorDistMagn   0.608911
		colorDistFreq   0.00158194
		detailScale     45.5399
		colorConversion true
		snowLevel       2
		tropicLatitude  0.091076
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571017
		terraceProb     0.380269
		erosion         0
		montesMagn      0.517591
		montesFreq      2.99719
		montesSpiky     0.87312
		montesFraction  0.754342
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00599977
		hillsFraction   0.645653
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267248
		craterFreq      0.19987
		craterDensity   0.802305
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   233.854
		volcanoTemp     1629.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.289, 0.266, 0.000)
		colorShelf     (0.337, 0.307, 0.283, 0.000)
		colorBeach     (0.357, 0.325, 0.300, 0.000)
		colorDesert    (0.377, 0.343, 0.316, 0.000)
		colorLowland   (0.396, 0.361, 0.333, 0.000)
		colorUpland    (0.416, 0.379, 0.350, 0.000)
		colorRock      (0.436, 0.397, 0.366, 0.000)
		colorSnow      (0.456, 0.415, 0.383, 1.000)
		BumpHeight      1.50095
		BumpOffset      0.30019
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.39325
		GasToDust   0.25
		Particles   1774
		GasBright   0.00904414
		DustBright  0.320002
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.19271
		Period          10.8231
		Eccentricity    0.916696
		Inclination     5.52852
		AscendingNode   121.143
		ArgOfPericenter -35.5323
		MeanAnomaly     73.3171
	}
}

Comet	"C55"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            9.66915e-009
	Radius          29.5968
	InertiaMoment   0.398639

	Oblateness      0.00177265

	RotationPeriod  119.895
	Obliquity       138.295
	EqAscendNode    29.2107

	AbsMagn         9.65117
	SlopeParam      2.94322
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.413 0.409 0.406)

	Surface
	{
		SurfStyle       0.588174
		OceanStyle      0.836504
		Randomize      (-0.260, 0.465, 0.570)
		colorDistMagn   0.715366
		colorDistFreq   0.26254
		detailScale     808.189
		colorConversion true
		snowLevel       2
		tropicLatitude  0.902176
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.617589
		terraceProb     0.206587
		erosion         0
		montesMagn      0.576006
		montesFreq      2.88392
		montesSpiky     0.963552
		montesFraction  0.387515
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.27157
		hillsFraction   0.644612
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2219
		craterFreq      0.211681
		craterDensity   1.07559
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.1907
		volcanoTemp     1748.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.161, 0.139, 0.114, 0.000)
		colorShelf     (0.165, 0.143, 0.130, 0.000)
		colorBeach     (0.194, 0.168, 0.154, 0.000)
		colorDesert    (0.211, 0.180, 0.150, 0.000)
		colorLowland   (0.231, 0.192, 0.171, 0.000)
		colorUpland    (0.256, 0.233, 0.207, 0.000)
		colorRock      (0.277, 0.254, 0.223, 0.000)
		colorSnow      (0.301, 0.270, 0.236, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.874442
		GasToDust   0.25
		Particles   2746
		GasBright   0.070396
		DustBright  0.743137
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.76157
		Period          15.2972
		Eccentricity    0.959979
		Inclination     88.585
		AscendingNode   -51.6205
		ArgOfPericenter -96.9555
		MeanAnomaly     38.825
	}
}

Comet	"C56"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.9772e-016
	Radius          0.103196
	InertiaMoment   0.396496

	Oblateness      0.00288516

	RotationPeriod  109.825
	Obliquity       91.5011
	EqAscendNode    13.7882

	AbsMagn         11.2581
	SlopeParam      7.12747
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.649 0.645 0.638)

	Surface
	{
		SurfStyle       0.423893
		OceanStyle      0.506221
		Randomize      (0.892, -0.521, 0.744)
		colorDistMagn   0.613838
		colorDistFreq   5.59873e-006
		detailScale     2.81795
		colorConversion true
		snowLevel       2
		tropicLatitude  0.950186
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.456626
		terraceProb     0.105338
		erosion         0
		montesMagn      0.544824
		montesFreq      2.84002
		montesSpiky     0.788996
		montesFraction  0.538247
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.44324e-005
		hillsFraction   0.722623
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214915
		craterFreq      0.183372
		craterDensity   0.779251
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   937.704
		volcanoTemp     1124.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.258, 0.255, 0.000)
		colorShelf     (0.276, 0.274, 0.271, 0.000)
		colorBeach     (0.292, 0.290, 0.287, 0.000)
		colorDesert    (0.308, 0.306, 0.303, 0.000)
		colorLowland   (0.325, 0.322, 0.319, 0.000)
		colorUpland    (0.341, 0.339, 0.335, 0.000)
		colorRock      (0.357, 0.355, 0.351, 0.000)
		colorSnow      (0.373, 0.371, 0.367, 1.000)
		BumpHeight      0.0928767
		BumpOffset      0.0185753
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0724999
		DustBright  0.42552
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.45601
		Period          5.85634
		Eccentricity    0.882531
		Inclination     -160.967
		AscendingNode   -28.3404
		ArgOfPericenter 29.8127
		MeanAnomaly     168.023
	}
}

Comet	"C57"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.30265e-012
	Radius          1.83329
	InertiaMoment   0.399129

	Oblateness      0.00239767

	RotationPeriod  103.081
	Obliquity       44.7068
	EqAscendNode    358.366

	AbsMagn         13.7449
	SlopeParam      5.30005
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.672 0.669 0.667)

	Surface
	{
		SurfStyle       0.0927947
		OceanStyle      0.271789
		Randomize      (-0.757, -0.406, -0.407)
		colorDistMagn   0.792926
		colorDistFreq   0.00148906
		detailScale     50.0611
		colorConversion true
		snowLevel       2
		tropicLatitude  0.551707
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.499184
		terraceProb     0.208641
		erosion         0
		montesMagn      0.556846
		montesFreq      2.68777
		montesSpiky     0.955015
		montesFraction  0.760784
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0074408
		hillsFraction   0.41733
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249058
		craterFreq      0.22896
		craterDensity   0.864098
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   189.419
		volcanoTemp     1327.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.268, 0.267, 0.000)
		colorShelf     (0.286, 0.284, 0.283, 0.000)
		colorBeach     (0.303, 0.301, 0.300, 0.000)
		colorDesert    (0.319, 0.318, 0.317, 0.000)
		colorLowland   (0.336, 0.335, 0.333, 0.000)
		colorUpland    (0.353, 0.351, 0.350, 0.000)
		colorRock      (0.370, 0.368, 0.367, 0.000)
		colorSnow      (0.387, 0.385, 0.383, 1.000)
		BumpHeight      1.64996
		BumpOffset      0.329993
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.426076
		GasToDust   0.25
		Particles   1840
		GasBright   0.201042
		DustBright  0.781464
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.6359
		Period          14.2651
		Eccentricity    0.950659
		Inclination     -12.5044
		AscendingNode   23.0229
		ArgOfPericenter -35.2353
		MeanAnomaly     178.446
	}
}

Comet	"C58"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.78093e-008
	Radius          40.2925
	InertiaMoment   0.397684

	Oblateness      0.00363242

	RotationPeriod  97.8535
	Obliquity       357.913
	EqAscendNode    342.943

	AbsMagn         1.9212
	SlopeParam      4.21732
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.731 0.728 0.724)

	Surface
	{
		SurfStyle       0.78786
		OceanStyle      0.041379
		Randomize      (-0.290, -0.539, -0.757)
		colorDistMagn   0.701692
		colorDistFreq   0.994517
		detailScale     1100.25
		colorConversion true
		snowLevel       2
		tropicLatitude  0.262921
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.348332
		terraceProb     0.111847
		erosion         0
		montesMagn      0.646658
		montesFreq      2.65266
		montesSpiky     0.884143
		montesFraction  0.237767
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.7141
		hillsFraction   0.756275
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245402
		craterFreq      0.24308
		craterDensity   0.939987
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   47.3376
		volcanoTemp     1623.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.247, 0.203, 0.000)
		colorShelf     (0.292, 0.255, 0.232, 0.000)
		colorBeach     (0.344, 0.298, 0.275, 0.000)
		colorDesert    (0.373, 0.320, 0.268, 0.000)
		colorLowland   (0.409, 0.342, 0.304, 0.000)
		colorUpland    (0.453, 0.415, 0.369, 0.000)
		colorRock      (0.490, 0.451, 0.398, 0.000)
		colorSnow      (0.534, 0.480, 0.420, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.907268
		GasToDust   0.25
		Particles   2812
		GasBright   0.175864
		DustBright  0.491129
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.1582
		Period          18.7085
		Eccentricity    0.995661
		Inclination     13.6531
		AscendingNode   -136.928
		ArgOfPericenter 80.3812
		MeanAnomaly     105.209
	}
}

Comet	"C59"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            5.48362e-016
	Radius          0.113558
	InertiaMoment   0.399571

	Oblateness      0.00291275

	RotationPeriod  93.5066
	Obliquity       311.118
	EqAscendNode    327.52

	AbsMagn         4.58321
	SlopeParam      3.19884
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.794 0.793 0.792)

	Surface
	{
		SurfStyle       0.103487
		OceanStyle      0.630182
		Randomize      (-0.082, -0.496, -0.415)
		colorDistMagn   0.910289
		colorDistFreq   1.0816e-005
		detailScale     3.1009
		colorConversion true
		snowLevel       2
		tropicLatitude  0.779715
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.523364
		terraceProb     0.551598
		erosion         0
		montesMagn      0.393498
		montesFreq      2.85875
		montesSpiky     0.990071
		montesFraction  0.800076
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.08817e-005
		hillsFraction   0.577568
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227854
		craterFreq      0.150605
		craterDensity   1.01551
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   760.31
		volcanoTemp     1341.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.318, 0.317, 0.317, 0.000)
		colorShelf     (0.338, 0.337, 0.337, 0.000)
		colorBeach     (0.357, 0.357, 0.356, 0.000)
		colorDesert    (0.377, 0.377, 0.376, 0.000)
		colorLowland   (0.397, 0.397, 0.396, 0.000)
		colorUpland    (0.417, 0.416, 0.416, 0.000)
		colorRock      (0.437, 0.436, 0.436, 0.000)
		colorSnow      (0.457, 0.456, 0.455, 1.000)
		BumpHeight      0.102202
		BumpOffset      0.0204405
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.113427
		DustBright  0.238053
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.60583
		Period          14.0216
		Eccentricity    0.95911
		Inclination     3.73997
		AscendingNode   -127.744
		ArgOfPericenter 37.0433
		MeanAnomaly     -164.884
	}
}

Comet	"C60"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            4.24119e-012
	Radius          2.49347
	InertiaMoment   0.398365

	Oblateness      0.00430931

	RotationPeriod  89.7376
	Obliquity       264.324
	EqAscendNode    312.098

	AbsMagn         6.226
	SlopeParam      8.44118
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.740 0.645 0.606)

	Surface
	{
		SurfStyle       0.586283
		OceanStyle      0.0608931
		Randomize      (-0.303, 0.187, -0.918)
		colorDistMagn   0.638137
		colorDistFreq   0.00351099
		detailScale     68.0882
		colorConversion true
		snowLevel       2
		tropicLatitude  0.677348
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.703878
		terraceProb     0.298881
		erosion         0
		montesMagn      0.547532
		montesFreq      3.4311
		montesSpiky     0.9023
		montesFraction  0.50433
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0206606
		hillsFraction   0.721368
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255089
		craterFreq      0.213671
		craterDensity   0.785526
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   189.83
		volcanoTemp     1512.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.219, 0.170, 0.000)
		colorShelf     (0.296, 0.226, 0.194, 0.000)
		colorBeach     (0.348, 0.264, 0.230, 0.000)
		colorDesert    (0.377, 0.284, 0.224, 0.000)
		colorLowland   (0.414, 0.303, 0.255, 0.000)
		colorUpland    (0.459, 0.368, 0.309, 0.000)
		colorRock      (0.496, 0.400, 0.333, 0.000)
		colorSnow      (0.540, 0.426, 0.351, 1.000)
		BumpHeight      2.24412
		BumpOffset      0.448824
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.458902
		GasToDust   0.25
		Particles   1906
		GasBright   0.319136
		DustBright  0.51683
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.09954
		Period          3.84321
		Eccentricity    0.871905
		Inclination     -107.223
		AscendingNode   -36.4087
		ArgOfPericenter -62.7658
		MeanAnomaly     105.034
	}
}

Comet	"C61"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            3.28026e-008
	Radius          44.3819
	InertiaMoment   0.399993

	Oblateness      0.00341184

	RotationPeriod  86.378
	Obliquity       217.53
	EqAscendNode    296.675

	AbsMagn         7.6074
	SlopeParam      5.5984
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.674 0.606 0.559)

	Surface
	{
		SurfStyle       0.928272
		OceanStyle      0.754052
		Randomize      (0.951, -0.454, 0.398)
		colorDistMagn   0.0116867
		colorDistFreq   0.778377
		detailScale     1211.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.946946
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.360679
		terraceProb     0.277758
		erosion         0
		montesMagn      0.557956
		montesFreq      2.81969
		montesSpiky     0.910715
		montesFraction  0.414201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.10025
		hillsFraction   0.603767
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.298004
		craterFreq      0.165317
		craterDensity   0.744925
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.42
		volcanoTemp     1635.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.212, 0.224, 0.050)
		colorShelf     (0.270, 0.248, 0.257, 0.040)
		colorBeach     (0.310, 0.285, 0.291, 0.030)
		colorDesert    (0.350, 0.321, 0.330, 0.020)
		colorLowland   (0.391, 0.357, 0.363, 0.030)
		colorUpland    (0.431, 0.394, 0.397, 0.050)
		colorRock      (0.472, 0.430, 0.442, 0.020)
		colorSnow      (0.472, 0.430, 0.442, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.940094
		GasToDust   0.25
		Particles   2878
		GasBright   0.229417
		DustBright  0.291036
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.90556
		Period          8.76826
		Eccentricity    0.919919
		Inclination     -77.8486
		AscendingNode   74.9672
		ArgOfPericenter -125.845
		MeanAnomaly     87.6499
	}
}

Comet	"C62"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.01002e-015
	Radius          0.154312
	InertiaMoment   0.398896

	Oblateness      0.0049847

	RotationPeriod  83.3231
	Obliquity       170.735
	EqAscendNode    281.253

	AbsMagn         8.94221
	SlopeParam      4.45002
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.472 0.464 0.461)

	Surface
	{
		SurfStyle       0.228718
		OceanStyle      0.668822
		Randomize      (0.528, 0.858, -0.549)
		colorDistMagn   0.381784
		colorDistFreq   1.61379e-005
		detailScale     4.21375
		colorConversion true
		snowLevel       2
		tropicLatitude  0.940475
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503833
		terraceProb     0.282517
		erosion         0
		montesMagn      0.583045
		montesFreq      3.43761
		montesSpiky     0.786378
		montesFraction  0.266563
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.225e-005
		hillsFraction   0.59617
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234702
		craterFreq      0.214703
		craterDensity   0.835902
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   761.276
		volcanoTemp     1714.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.186, 0.184, 0.000)
		colorShelf     (0.201, 0.197, 0.196, 0.000)
		colorBeach     (0.213, 0.209, 0.207, 0.000)
		colorDesert    (0.224, 0.221, 0.219, 0.000)
		colorLowland   (0.236, 0.232, 0.230, 0.000)
		colorUpland    (0.248, 0.244, 0.242, 0.000)
		colorRock      (0.260, 0.255, 0.253, 0.000)
		colorSnow      (0.272, 0.267, 0.265, 1.000)
		BumpHeight      0.138881
		BumpOffset      0.0277762
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0105356
		GasToDust   0.25
		Particles   1001
		GasBright   0.102438
		DustBright  0.102501
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.58422
		Period          6.64665
		Eccentricity    0.925652
		Inclination     113.173
		AscendingNode   -70.8671
		ArgOfPericenter -139.62
		MeanAnomaly     97.7277
	}
}

Comet	"C63"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            7.81175e-012
	Radius          2.74911
	InertiaMoment   0.397218

	Oblateness      0.0038794

	RotationPeriod  80.5034
	Obliquity       123.941
	EqAscendNode    265.83

	AbsMagn         10.3948
	SlopeParam      3.44196
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.557 0.550 0.544)

	Surface
	{
		SurfStyle       0.260833
		OceanStyle      0.404093
		Randomize      (0.260, -0.437, -0.590)
		colorDistMagn   0.951943
		colorDistFreq   0.00284883
		detailScale     75.069
		colorConversion true
		snowLevel       2
		tropicLatitude  0.865718
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.618783
		terraceProb     0.246335
		erosion         0
		montesMagn      0.583075
		montesFreq      2.8967
		montesSpiky     0.935124
		montesFraction  0.674448
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0157121
		hillsFraction   0.454161
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259536
		craterFreq      0.170204
		craterDensity   0.969143
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   154.214
		volcanoTemp     1293.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.220, 0.218, 0.000)
		colorShelf     (0.237, 0.234, 0.231, 0.000)
		colorBeach     (0.251, 0.247, 0.245, 0.000)
		colorDesert    (0.265, 0.261, 0.259, 0.000)
		colorLowland   (0.279, 0.275, 0.272, 0.000)
		colorUpland    (0.293, 0.289, 0.286, 0.000)
		colorRock      (0.307, 0.302, 0.299, 0.000)
		colorSnow      (0.321, 0.316, 0.313, 1.000)
		BumpHeight      2.4742
		BumpOffset      0.494839
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.491728
		GasToDust   0.25
		Particles   1973
		GasBright   0.0406025
		DustBright  0.648823
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.70881
		Period          7.44595
		Eccentricity    0.900353
		Inclination     -112.766
		AscendingNode   159.513
		ArgOfPericenter 52.1749
		MeanAnomaly     42.007
	}
}

Comet	"C64"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            6.04183e-008
	Radius          60.2578
	InertiaMoment   0.399357

	Oblateness      0.00569084

	RotationPeriod  77.8703
	Obliquity       77.1468
	EqAscendNode    250.407

	AbsMagn         12.277
	SlopeParam      2.25316
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.764 0.733 0.680)

	Surface
	{
		SurfStyle       0.257499
		OceanStyle      0.358295
		Randomize      (-0.876, 0.434, -0.720)
		colorDistMagn   0.784979
		colorDistFreq   1.88778
		detailScale     1645.44
		colorConversion true
		snowLevel       2
		tropicLatitude  0.886326
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.488608
		terraceProb     0.234801
		erosion         0
		montesMagn      0.479045
		montesFreq      3.88064
		montesSpiky     0.953004
		montesFraction  0.610956
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.52697
		hillsFraction   0.406927
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237982
		craterFreq      0.16108
		craterDensity   0.931712
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   38.4357
		volcanoTemp     1544.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.305, 0.293, 0.272, 0.000)
		colorShelf     (0.325, 0.312, 0.289, 0.000)
		colorBeach     (0.344, 0.330, 0.306, 0.000)
		colorDesert    (0.363, 0.348, 0.323, 0.000)
		colorLowland   (0.382, 0.367, 0.340, 0.000)
		colorUpland    (0.401, 0.385, 0.357, 0.000)
		colorRock      (0.420, 0.403, 0.374, 0.000)
		colorSnow      (0.439, 0.422, 0.391, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.97292
		GasToDust   0.25
		Particles   2945
		GasBright   0.0440986
		DustBright  0.329814
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.47068
		Period          5.94505
		Eccentricity    0.938414
		Inclination     133.193
		AscendingNode   149.963
		ArgOfPericenter -164.896
		MeanAnomaly     165.855
	}
}

Comet	"C65"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.86033e-015
	Radius          0.170285
	InertiaMoment   0.398057

	Oblateness      0.00442863

	RotationPeriod  75.3881
	Obliquity       30.3525
	EqAscendNode    234.985

	AbsMagn         17.2644
	SlopeParam      5.93748
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.713 0.712 0.709)

	Surface
	{
		SurfStyle       0.899817
		OceanStyle      0.429474
		Randomize      (0.063, -0.058, -0.581)
		colorDistMagn   0.48807
		colorDistFreq   4.78274e-006
		detailScale     4.64993
		colorConversion true
		snowLevel       2
		tropicLatitude  0.669288
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.43621
		terraceProb     0.409154
		erosion         0
		montesMagn      0.387356
		montesFreq      3.38795
		montesSpiky     0.778288
		montesFraction  0.647241
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.84678e-005
		hillsFraction   0.592874
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230507
		craterFreq      0.190992
		craterDensity   0.884513
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   618.997
		volcanoTemp     1222.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.249, 0.284, 0.050)
		colorShelf     (0.285, 0.292, 0.326, 0.040)
		colorBeach     (0.328, 0.335, 0.369, 0.030)
		colorDesert    (0.371, 0.377, 0.418, 0.020)
		colorLowland   (0.414, 0.420, 0.461, 0.030)
		colorUpland    (0.457, 0.463, 0.503, 0.050)
		colorRock      (0.499, 0.505, 0.560, 0.020)
		colorSnow      (0.499, 0.505, 0.560, 1.000)
		BumpHeight      0.153257
		BumpOffset      0.0306514
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0433616
		GasToDust   0.25
		Particles   1067
		GasBright   0.151923
		DustBright  0.706476
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.54817
		Period          13.5588
		Eccentricity    0.970951
		Inclination     32.6146
		AscendingNode   -93.3976
		ArgOfPericenter -173.446
		MeanAnomaly     -60.1981
	}
}

Comet	"C66"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.43882e-011
	Radius          3.72942
	InertiaMoment   0.399786

	Oblateness      0.00645157

	RotationPeriod  73.0298
	Obliquity       343.558
	EqAscendNode    219.562

	AbsMagn         3.48473
	SlopeParam      4.689
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.709 0.704 0.702)

	Surface
	{
		SurfStyle       0.0877748
		OceanStyle      0.627121
		Randomize      (0.616, 0.374, -0.046)
		colorDistMagn   0.650457
		colorDistFreq   0.00563846
		detailScale     101.838
		colorConversion true
		snowLevel       2
		tropicLatitude  0.926297
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.64024
		terraceProb     0.31973
		erosion         0
		montesMagn      0.5993
		montesFreq      3.64923
		montesSpiky     0.948223
		montesFraction  0.588227
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0372549
		hillsFraction   0.688068
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223811
		craterFreq      0.260432
		craterDensity   0.987179
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   154.15
		volcanoTemp     1293
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.281, 0.281, 0.000)
		colorShelf     (0.301, 0.299, 0.298, 0.000)
		colorBeach     (0.319, 0.317, 0.316, 0.000)
		colorDesert    (0.337, 0.334, 0.333, 0.000)
		colorLowland   (0.354, 0.352, 0.351, 0.000)
		colorUpland    (0.372, 0.369, 0.368, 0.000)
		colorRock      (0.390, 0.387, 0.386, 0.000)
		colorSnow      (0.408, 0.405, 0.404, 1.000)
		BumpHeight      3.35648
		BumpOffset      0.671296
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.524553
		GasToDust   0.25
		Particles   2039
		GasBright   0.128137
		DustBright  0.414749
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.97289
		Period          9.23708
		Eccentricity    0.987717
		Inclination     123.478
		AscendingNode   49.835
		ArgOfPericenter 140.794
		MeanAnomaly     19.0842
	}
}

Comet	"C67"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.11283e-007
	Radius          66.5521
	InertiaMoment   0.398646

	Oblateness      0.00502571

	RotationPeriod  70.7743
	Obliquity       296.764
	EqAscendNode    204.14

	AbsMagn         5.44745
	SlopeParam      3.67708
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.642 0.639 0.638)

	Surface
	{
		SurfStyle       0.688961
		OceanStyle      0.394855
		Randomize      (-0.209, 0.733, -0.264)
		colorDistMagn   0.49538
		colorDistFreq   1.97852
		detailScale     1817.32
		colorConversion true
		snowLevel       2
		tropicLatitude  0.636449
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581723
		terraceProb     0.241351
		erosion         0
		montesMagn      0.394427
		montesFreq      3.07735
		montesSpiky     0.965221
		montesFraction  0.626051
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.5015
		hillsFraction   0.664074
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2416
		craterFreq      0.256434
		craterDensity   0.925534
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.2791
		volcanoTemp     1332.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.217, 0.179, 0.000)
		colorShelf     (0.257, 0.224, 0.204, 0.000)
		colorBeach     (0.302, 0.262, 0.242, 0.000)
		colorDesert    (0.328, 0.281, 0.236, 0.000)
		colorLowland   (0.360, 0.300, 0.268, 0.000)
		colorUpland    (0.398, 0.364, 0.325, 0.000)
		colorRock      (0.430, 0.396, 0.351, 0.000)
		colorSnow      (0.469, 0.422, 0.370, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0670916
		DustBright  0.16028
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.68435
		Period          14.6601
		Eccentricity    0.960625
		Inclination     132.998
		AscendingNode   -135.306
		ArgOfPericenter -127.8
		MeanAnomaly     59.3215
	}
}

Comet	"C68"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            3.42648e-015
	Radius          0.230826
	InertiaMoment   0.39652

	Oblateness      0.00718994

	RotationPeriod  68.6049
	Obliquity       249.97
	EqAscendNode    188.717

	AbsMagn         6.92329
	SlopeParam      2.56782
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.686 0.631 0.556)

	Surface
	{
		SurfStyle       0.824039
		OceanStyle      0.954989
		Randomize      (0.604, 0.943, 0.618)
		colorDistMagn   0.667487
		colorDistFreq   1.11219e-005
		detailScale     6.30309
		colorConversion true
		snowLevel       2
		tropicLatitude  0.939638
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.456514
		terraceProb     0.462137
		erosion         0
		montesMagn      0.59061
		montesFreq      3.19134
		montesSpiky     0.951104
		montesFraction  0.589858
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000118038
		hillsFraction   0.920877
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254613
		craterFreq      0.211753
		craterDensity   0.806029
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   618.254
		volcanoTemp     1509.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.214, 0.156, 0.000)
		colorShelf     (0.274, 0.221, 0.178, 0.000)
		colorBeach     (0.322, 0.259, 0.211, 0.000)
		colorDesert    (0.350, 0.278, 0.206, 0.000)
		colorLowland   (0.384, 0.296, 0.234, 0.000)
		colorUpland    (0.425, 0.360, 0.284, 0.000)
		colorRock      (0.459, 0.391, 0.306, 0.000)
		colorSnow      (0.500, 0.416, 0.323, 1.000)
		BumpHeight      0.207743
		BumpOffset      0.0415487
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0761873
		GasToDust   0.25
		Particles   1133
		GasBright   0.252083
		DustBright  0.459776
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.23958
		Period          11.172
		Eccentricity    0.932793
		Inclination     0.159513
		AscendingNode   -82.3671
		ArgOfPericenter -37.7299
		MeanAnomaly     21.4504
	}
}

Comet	"C69"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.65014e-011
	Radius          4.12237
	InertiaMoment   0.399135

	Oblateness      0.00569

	RotationPeriod  66.5079
	Obliquity       203.175
	EqAscendNode    173.294

	AbsMagn         8.26188
	SlopeParam      6.34412
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.456 0.452 0.446)

	Surface
	{
		SurfStyle       0.389622
		OceanStyle      0.85189
		Randomize      (0.327, -0.237, 0.323)
		colorDistMagn   0.146369
		colorDistFreq   0.01153
		detailScale     112.568
		colorConversion true
		snowLevel       2
		tropicLatitude  0.371263
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.740345
		terraceProb     0.142894
		erosion         0
		montesMagn      0.46613
		montesFreq      3.45047
		montesSpiky     0.877916
		montesFraction  0.489433
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0351315
		hillsFraction   0.860713
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238963
		craterFreq      0.191794
		craterDensity   1.02783
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   125.55
		volcanoTemp     1556.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.181, 0.178, 0.000)
		colorShelf     (0.194, 0.192, 0.190, 0.000)
		colorBeach     (0.205, 0.203, 0.201, 0.000)
		colorDesert    (0.216, 0.215, 0.212, 0.000)
		colorLowland   (0.228, 0.226, 0.223, 0.000)
		colorUpland    (0.239, 0.237, 0.234, 0.000)
		colorRock      (0.251, 0.248, 0.245, 0.000)
		colorSnow      (0.262, 0.260, 0.257, 1.000)
		BumpHeight      3.71013
		BumpOffset      0.742026
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.557379
		GasToDust   0.25
		Particles   2105
		GasBright   0.163756
		DustBright  0.232589
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.44345
		Period          12.7317
		Eccentricity    0.965004
		Inclination     -1.38272
		AscendingNode   -2.1173
		ArgOfPericenter -173.947
		MeanAnomaly     89.0411
	}
}

Comet	"C70"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.04969e-007
	Radius          90.1451
	InertiaMoment   0.397694

	Oblateness      0.00814213

	RotationPeriod  64.4719
	Obliquity       156.381
	EqAscendNode    157.872

	AbsMagn         9.63136
	SlopeParam      4.93828
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.722 0.632 0.598)

	Surface
	{
		SurfStyle       0.344683
		OceanStyle      0.819619
		Randomize      (0.103, 0.111, -0.992)
		colorDistMagn   0.893627
		colorDistFreq   5.70856
		detailScale     2461.56
		colorConversion true
		snowLevel       2
		tropicLatitude  0.857728
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.692741
		terraceProb     0.159611
		erosion         0
		montesMagn      0.367762
		montesFreq      2.40843
		montesSpiky     0.906829
		montesFraction  0.53876
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.6417
		hillsFraction   0.350085
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274195
		craterFreq      0.233127
		craterDensity   0.853253
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   31.2179
		volcanoTemp     1337.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.253, 0.239, 0.000)
		colorShelf     (0.307, 0.269, 0.254, 0.000)
		colorBeach     (0.325, 0.284, 0.269, 0.000)
		colorDesert    (0.343, 0.300, 0.284, 0.000)
		colorLowland   (0.361, 0.316, 0.299, 0.000)
		colorUpland    (0.379, 0.332, 0.314, 0.000)
		colorRock      (0.397, 0.347, 0.329, 0.000)
		colorSnow      (0.415, 0.363, 0.344, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.415938
		DustBright  0.464894
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.31207
		Period          5.00975
		Eccentricity    0.901531
		Inclination     -79.4386
		AscendingNode   151.51
		ArgOfPericenter 163.614
		MeanAnomaly     171.122
	}
}

Comet	"C71"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            6.31115e-015
	Radius          0.255347
	InertiaMoment   0.399577

	Oblateness      0.00644324

	RotationPeriod  62.4873
	Obliquity       109.587
	EqAscendNode    142.449

	AbsMagn         11.2328
	SlopeParam      3.90781
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.681 0.559 0.479)

	Surface
	{
		SurfStyle       0.83883
		OceanStyle      0.283654
		Randomize      (0.049, -0.510, -0.373)
		colorDistMagn   0.826355
		colorDistFreq   4.56429e-005
		detailScale     6.97266
		colorConversion true
		snowLevel       2
		tropicLatitude  0.886245
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.674178
		terraceProb     0.54402
		erosion         0
		montesMagn      0.517967
		montesFreq      2.97355
		montesSpiky     0.937049
		montesFraction  0.711601
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000177526
		hillsFraction   0.705731
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.27994
		craterFreq      0.237166
		craterDensity   0.830041
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   503.943
		volcanoTemp     1394.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.266, 0.190, 0.134, 0.000)
		colorShelf     (0.272, 0.196, 0.153, 0.000)
		colorBeach     (0.320, 0.229, 0.182, 0.000)
		colorDesert    (0.347, 0.246, 0.177, 0.000)
		colorLowland   (0.381, 0.263, 0.201, 0.000)
		colorUpland    (0.422, 0.319, 0.244, 0.000)
		colorRock      (0.456, 0.346, 0.264, 0.000)
		colorSnow      (0.497, 0.369, 0.278, 1.000)
		BumpHeight      0.229812
		BumpOffset      0.0459624
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.109013
		GasToDust   0.25
		Particles   1200
		GasBright   0.0176692
		DustBright  0.547649
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.5997
		Period          13.9722
		Eccentricity    0.951475
		Inclination     -107.81
		AscendingNode   66.2902
		ArgOfPericenter -7.83296
		MeanAnomaly     53.6393
	}
}

Comet	"C72"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            4.88122e-011
	Radius          5.57972
	InertiaMoment   0.398373

	Oblateness      0.00921696

	RotationPeriod  60.5458
	Obliquity       62.7924
	EqAscendNode    127.027

	AbsMagn         13.6943
	SlopeParam      2.85043
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.439 0.435 0.429)

	Surface
	{
		SurfStyle       0.593164
		OceanStyle      0.641155
		Randomize      (0.960, 0.211, -0.861)
		colorDistMagn   0.791572
		colorDistFreq   0.00987311
		detailScale     152.364
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988472
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.626425
		terraceProb     0.113771
		erosion         0
		montesMagn      0.610651
		montesFreq      3.20521
		montesSpiky     0.89729
		montesFraction  0.651615
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0923852
		hillsFraction   0.584031
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214488
		craterFreq      0.222671
		craterDensity   0.913155
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   125.214
		volcanoTemp     1276.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.171, 0.148, 0.120, 0.000)
		colorShelf     (0.176, 0.152, 0.137, 0.000)
		colorBeach     (0.206, 0.178, 0.163, 0.000)
		colorDesert    (0.224, 0.191, 0.159, 0.000)
		colorLowland   (0.246, 0.204, 0.180, 0.000)
		colorUpland    (0.272, 0.248, 0.219, 0.000)
		colorRock      (0.294, 0.270, 0.236, 0.000)
		colorSnow      (0.321, 0.287, 0.249, 1.000)
		BumpHeight      5.02175
		BumpOffset      1.00435
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.590205
		GasToDust   0.25
		Particles   2172
		GasBright   0.0225575
		DustBright  0.227247
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.36607
		Period          5.32219
		Eccentricity    0.923389
		Inclination     81.4059
		AscendingNode   75.5301
		ArgOfPericenter 144.495
		MeanAnomaly     -87.3321
	}
}

Comet	"C73"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            3.77527e-007
	Radius          99.7959
	InertiaMoment   0.399998

	Oblateness      0.00731296

	RotationPeriod  58.6402
	Obliquity       15.9981
	EqAscendNode    111.604

	AbsMagn         1.86279
	SlopeParam      6.88138
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.585 0.580 0.574)

	Surface
	{
		SurfStyle       0.739205
		OceanStyle      0.161578
		Randomize      (0.586, -0.242, 0.045)
		colorDistMagn   0.776528
		colorDistFreq   7.3614
		detailScale     2725.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0.973114
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.374524
		terraceProb     0.556879
		erosion         0
		montesMagn      0.658663
		montesFreq      2.57263
		montesSpiky     0.91418
		montesFraction  0.415853
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.7853
		hillsFraction   0.700626
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244182
		craterFreq      0.356517
		craterDensity   0.855587
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.4651
		volcanoTemp     1831.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.197, 0.161, 0.000)
		colorShelf     (0.234, 0.203, 0.184, 0.000)
		colorBeach     (0.275, 0.238, 0.218, 0.000)
		colorDesert    (0.298, 0.255, 0.212, 0.000)
		colorLowland   (0.328, 0.273, 0.241, 0.000)
		colorUpland    (0.363, 0.331, 0.293, 0.000)
		colorRock      (0.392, 0.360, 0.316, 0.000)
		colorSnow      (0.427, 0.383, 0.333, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.109663
		DustBright  0.624628
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.10009
		Period          10.1446
		Eccentricity    0.948312
		Inclination     -111.632
		AscendingNode   -61.0423
		ArgOfPericenter 9.28428
		MeanAnomaly     -87.4859
	}
}

Comet	"C74"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.16244e-014
	Radius          0.345379
	InertiaMoment   0.398902

	Oblateness      0.0104636

	RotationPeriod  56.7639
	Obliquity       329.204
	EqAscendNode    96.1815

	AbsMagn         4.55691
	SlopeParam      5.20311
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.722 0.717 0.714)

	Surface
	{
		SurfStyle       0.581777
		OceanStyle      0.42005
		Randomize      (0.021, 0.599, 0.684)
		colorDistMagn   0.871348
		colorDistFreq   0.000101373
		detailScale     9.43115
		colorConversion true
		snowLevel       2
		tropicLatitude  0.514373
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637047
		terraceProb     0.236978
		erosion         0
		montesMagn      0.355785
		montesFreq      3.26568
		montesSpiky     0.965482
		montesFraction  0.761437
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000362208
		hillsFraction   0.606394
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26765
		craterFreq      0.275522
		craterDensity   0.985984
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   502.247
		volcanoTemp     1315.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.244, 0.200, 0.000)
		colorShelf     (0.289, 0.251, 0.229, 0.000)
		colorBeach     (0.339, 0.294, 0.271, 0.000)
		colorDesert    (0.368, 0.315, 0.264, 0.000)
		colorLowland   (0.404, 0.337, 0.300, 0.000)
		colorUpland    (0.448, 0.409, 0.364, 0.000)
		colorRock      (0.484, 0.444, 0.393, 0.000)
		colorSnow      (0.527, 0.473, 0.414, 1.000)
		BumpHeight      0.310841
		BumpOffset      0.0621682
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.141839
		GasToDust   0.25
		Particles   1266
		GasBright   0.0872696
		DustBright  0.331508
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.86044
		Period          16.126
		Eccentricity    0.956058
		Inclination     179.515
		AscendingNode   -71.191
		ArgOfPericenter -61.0015
		MeanAnomaly     -138.181
	}
}

Comet	"C75"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            8.99059e-011
	Radius          6.18151
	InertiaMoment   0.397232

	Oblateness      0.00823689

	RotationPeriod  54.9112
	Obliquity       282.409
	EqAscendNode    80.7589

	AbsMagn         6.20589
	SlopeParam      4.13731
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.677 0.547 0.490)

	Surface
	{
		SurfStyle       0.334254
		OceanStyle      0.848404
		Randomize      (-0.869, 0.722, 0.423)
		colorDistMagn   0.787664
		colorDistFreq   0.0305529
		detailScale     168.797
		colorConversion true
		snowLevel       2
		tropicLatitude  0.817873
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.457061
		terraceProb     0.465942
		erosion         0
		montesMagn      0.51627
		montesFreq      2.78536
		montesSpiky     0.847539
		montesFraction  0.473234
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.111237
		hillsFraction   0.661827
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224458
		craterFreq      0.158456
		craterDensity   0.766404
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   102.213
		volcanoTemp     1084.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.219, 0.196, 0.000)
		colorShelf     (0.288, 0.233, 0.208, 0.000)
		colorBeach     (0.305, 0.246, 0.221, 0.000)
		colorDesert    (0.322, 0.260, 0.233, 0.000)
		colorLowland   (0.339, 0.274, 0.245, 0.000)
		colorUpland    (0.355, 0.287, 0.258, 0.000)
		colorRock      (0.372, 0.301, 0.270, 0.000)
		colorSnow      (0.389, 0.315, 0.282, 1.000)
		BumpHeight      5.56336
		BumpOffset      1.11267
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.623031
		GasToDust   0.25
		Particles   2238
		GasBright   0.241566
		DustBright  0.661699
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.77259
		Period          2.26362
		Eccentricity    0.910803
		Inclination     -24.3059
		AscendingNode   -160.765
		ArgOfPericenter -119.084
		MeanAnomaly     -9.20161
	}
}

Comet	"C76"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            6.95358e-007
	Radius          134.893
	InertiaMoment   0.399362

	Oblateness      0.0119403

	RotationPeriod  53.0766
	Obliquity       235.615
	EqAscendNode    65.3363

	AbsMagn         7.5891
	SlopeParam      3.11171
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.785 0.726 0.699)

	Surface
	{
		SurfStyle       0.314202
		OceanStyle      0.436253
		Randomize      (0.959, 0.374, 0.797)
		colorDistMagn   0.14164
		colorDistFreq   9.69078
		detailScale     3683.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.869129
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53565
		terraceProb     0.350807
		erosion         0
		montesMagn      0.567004
		montesFreq      3.75676
		montesSpiky     0.920389
		montesFraction  0.609683
		dunesFraction   0
		hillsMagn       0
		hillsFreq       37.7362
		hillsFraction   0.727083
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257999
		craterFreq      0.538506
		craterDensity   0.996689
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   25.3625
		volcanoTemp     1418.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.290, 0.280, 0.000)
		colorShelf     (0.334, 0.309, 0.297, 0.000)
		colorBeach     (0.353, 0.327, 0.315, 0.000)
		colorDesert    (0.373, 0.345, 0.332, 0.000)
		colorLowland   (0.392, 0.363, 0.349, 0.000)
		colorUpland    (0.412, 0.381, 0.367, 0.000)
		colorRock      (0.432, 0.399, 0.384, 0.000)
		colorSnow      (0.451, 0.417, 0.402, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.19189
		DustBright  0.395861
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.49847
		Period          13.1641
		Eccentricity    0.965342
		Inclination     -24.9858
		AscendingNode   -92.8462
		ArgOfPericenter -3.045
		MeanAnomaly     42.7383
	}
}

Comet	"C77"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.14105e-014
	Radius          0.382892
	InertiaMoment   0.398065

	Oblateness      0.00946393

	RotationPeriod  51.2551
	Obliquity       188.821
	EqAscendNode    49.9138

	AbsMagn         8.92351
	SlopeParam      7.78882
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.794 0.792 0.789)

	Surface
	{
		SurfStyle       0.1064
		OceanStyle      0.069942
		Randomize      (0.216, 0.157, -0.803)
		colorDistMagn   0.881144
		colorDistFreq   0.000100822
		detailScale     10.4555
		colorConversion true
		snowLevel       2
		tropicLatitude  0.136109
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.610428
		terraceProb     0.150171
		erosion         0
		montesMagn      0.534061
		montesFreq      3.2136
		montesSpiky     0.867242
		montesFraction  0.481994
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000313223
		hillsFraction   0.736716
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23847
		craterFreq      0.228648
		craterDensity   0.900182
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   410.268
		volcanoTemp     1461.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.317, 0.317, 0.316, 0.000)
		colorShelf     (0.337, 0.337, 0.335, 0.000)
		colorBeach     (0.357, 0.356, 0.355, 0.000)
		colorDesert    (0.377, 0.376, 0.375, 0.000)
		colorLowland   (0.397, 0.396, 0.395, 0.000)
		colorUpland    (0.417, 0.416, 0.414, 0.000)
		colorRock      (0.436, 0.436, 0.434, 0.000)
		colorSnow      (0.456, 0.455, 0.454, 1.000)
		BumpHeight      0.344602
		BumpOffset      0.0689205
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.174665
		GasToDust   0.25
		Particles   1332
		GasBright   0.104955
		DustBright  0.167283
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.25232
		Period          11.2674
		Eccentricity    0.920402
		Inclination     -178.948
		AscendingNode   162.672
		ArgOfPericenter 127.918
		MeanAnomaly     82.8754
	}
}

Comet	"C78"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.65596e-010
	Radius          8.3502
	InertiaMoment   0.399791

	Oblateness      0.013728

	RotationPeriod  49.4419
	Obliquity       142.027
	EqAscendNode    34.4912

	AbsMagn         10.3731
	SlopeParam      5.49101
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.643 0.638 0.634)

	Surface
	{
		SurfStyle       0.478516
		OceanStyle      0.269081
		Randomize      (0.714, 0.185, -0.569)
		colorDistMagn   0.218419
		colorDistFreq   0.0520538
		detailScale     228.016
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999842
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.70066
		terraceProb     0.306934
		erosion         0
		montesMagn      0.541537
		montesFreq      3.17286
		montesSpiky     0.974356
		montesFraction  0.303321
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.139423
		hillsFraction   0.644274
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22176
		craterFreq      0.216494
		craterDensity   1.00126
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   101.737
		volcanoTemp     1520.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.255, 0.254, 0.000)
		colorShelf     (0.273, 0.271, 0.269, 0.000)
		colorBeach     (0.289, 0.287, 0.285, 0.000)
		colorDesert    (0.305, 0.303, 0.301, 0.000)
		colorLowland   (0.321, 0.319, 0.317, 0.000)
		colorUpland    (0.338, 0.335, 0.333, 0.000)
		colorRock      (0.354, 0.351, 0.349, 0.000)
		colorSnow      (0.370, 0.367, 0.365, 1.000)
		BumpHeight      7.51518
		BumpOffset      1.50304
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.655857
		GasToDust   0.25
		Particles   2304
		GasBright   0.336418
		DustBright  0.420306
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.34336
		Period          11.9574
		Eccentricity    0.971458
		Inclination     -122.965
		AscendingNode   -142.796
		ArgOfPericenter 87.7677
		MeanAnomaly     37.7837
	}
}

Comet	"C79"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            5.0988e-018
	Radius          0.0237168
	InertiaMoment   0.398652

	Oblateness      0.0109597

	RotationPeriod  47.6323
	Obliquity       95.2323
	EqAscendNode    19.0686

	AbsMagn         12.2449
	SlopeParam      4.36863
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.459 0.455 0.452)

	Surface
	{
		SurfStyle       0.0579009
		OceanStyle      0.675481
		Randomize      (-0.302, 0.255, 0.375)
		colorDistMagn   0.888547
		colorDistFreq   1.85195e-007
		detailScale     0.647627
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990084
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553334
		terraceProb     0.306733
		erosion         0
		montesMagn      0.514783
		montesFreq      3.01714
		montesSpiky     0.969954
		montesFraction  0.740736
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.1485e-006
		hillsFraction   0.666894
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253411
		craterFreq      0.261234
		craterDensity   1.00604
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1646.75
		volcanoTemp     1579.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.182, 0.181, 0.000)
		colorShelf     (0.195, 0.193, 0.192, 0.000)
		colorBeach     (0.207, 0.205, 0.203, 0.000)
		colorDesert    (0.218, 0.216, 0.215, 0.000)
		colorLowland   (0.230, 0.227, 0.226, 0.000)
		colorUpland    (0.241, 0.239, 0.237, 0.000)
		colorRock      (0.252, 0.250, 0.249, 0.000)
		colorSnow      (0.264, 0.261, 0.260, 1.000)
		BumpHeight      0.0213451
		BumpOffset      0.00426903
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.00159598
		DustBright  0.439615
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.59543
		Period          13.9378
		Eccentricity    0.94937
		Inclination     -3.37822
		AscendingNode   147.409
		ArgOfPericenter -16.4272
		MeanAnomaly     108.395
	}
}

Comet	"C80"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            3.94356e-014
	Radius          0.516908
	InertiaMoment   0.396543

	Oblateness      0.015728

	RotationPeriod  45.8219
	Obliquity       48.438
	EqAscendNode    3.64599

	AbsMagn         17.0168
	SlopeParam      3.3586
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.724 0.675 0.619)

	Surface
	{
		SurfStyle       0.665669
		OceanStyle      0.640357
		Randomize      (0.944, 0.108, -0.871)
		colorDistMagn   0.205505
		colorDistFreq   0.000153507
		detailScale     14.115
		colorConversion true
		snowLevel       2
		tropicLatitude  0.410803
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.714907
		terraceProb     0.178736
		erosion         0
		montesMagn      0.550757
		montesFreq      2.22206
		montesSpiky     0.956132
		montesFraction  0.564223
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00044612
		hillsFraction   0.396374
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238002
		craterFreq      0.153299
		craterDensity   0.948861
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   408.108
		volcanoTemp     1379.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.229, 0.173, 0.000)
		colorShelf     (0.290, 0.236, 0.198, 0.000)
		colorBeach     (0.340, 0.277, 0.235, 0.000)
		colorDesert    (0.369, 0.297, 0.229, 0.000)
		colorLowland   (0.406, 0.317, 0.260, 0.000)
		colorUpland    (0.449, 0.385, 0.316, 0.000)
		colorRock      (0.485, 0.418, 0.341, 0.000)
		colorSnow      (0.529, 0.445, 0.359, 1.000)
		BumpHeight      0.465217
		BumpOffset      0.0930435
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.207491
		GasToDust   0.25
		Particles   1398
		GasBright   0.0580065
		DustBright  0.867691
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.02129
		Period          9.57902
		Eccentricity    0.931492
		Inclination     111.917
		AscendingNode   -16.9267
		ArgOfPericenter -153.259
		MeanAnomaly     -30.2251
	}
}

Comet	"C81"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            3.05006e-010
	Radius          9.26907
	InertiaMoment   0.399141

	Oblateness      0.0128373

	RotationPeriod  44.0059
	Obliquity       1.64371
	EqAscendNode    348.223

	AbsMagn         3.45014
	SlopeParam      2.13331
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.657 0.574 0.448)

	Surface
	{
		SurfStyle       0.159271
		OceanStyle      0.224075
		Randomize      (0.932, -0.028, 0.216)
		colorDistMagn   0.868123
		colorDistFreq   0.0330762
		detailScale     253.107
		colorConversion true
		snowLevel       2
		tropicLatitude  0.180919
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.385845
		terraceProb     0.134948
		erosion         0
		montesMagn      0.539565
		montesFreq      2.81573
		montesSpiky     0.86567
		montesFraction  0.735108
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.221583
		hillsFraction   0.625802
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255424
		craterFreq      0.273018
		craterDensity   0.934805
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   83.2123
		volcanoTemp     1405.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.230, 0.179, 0.000)
		colorShelf     (0.279, 0.244, 0.190, 0.000)
		colorBeach     (0.296, 0.258, 0.202, 0.000)
		colorDesert    (0.312, 0.273, 0.213, 0.000)
		colorLowland   (0.329, 0.287, 0.224, 0.000)
		colorUpland    (0.345, 0.301, 0.235, 0.000)
		colorRock      (0.361, 0.316, 0.246, 0.000)
		colorSnow      (0.378, 0.330, 0.257, 1.000)
		BumpHeight      8.34216
		BumpOffset      1.66843
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.688683
		GasToDust   0.25
		Particles   2371
		GasBright   0.0742641
		DustBright  0.53592
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.5984
		Period          6.7361
		Eccentricity    0.940499
		Inclination     -10.6688
		AscendingNode   77.0663
		ArgOfPericenter 111.164
		MeanAnomaly     160.787
	}
}

Comet	"C82"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            9.39137e-018
	Radius          0.0319993
	InertiaMoment   0.397704

	Oblateness      0.0185714

	RotationPeriod  42.1796
	Obliquity       314.849
	EqAscendNode    332.801

	AbsMagn         5.42509
	SlopeParam      5.81377
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.597 0.591 0.585)

	Surface
	{
		SurfStyle       0.842065
		OceanStyle      0.740587
		Randomize      (0.889, -0.011, -0.128)
		colorDistMagn   0.213088
		colorDistFreq   1.32221e-007
		detailScale     0.873795
		colorConversion true
		snowLevel       2
		tropicLatitude  0.894185
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.596045
		terraceProb     0.361894
		erosion         0
		montesMagn      0.479199
		montesFreq      1.99947
		montesSpiky     0.941507
		montesFraction  0.774041
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.74497e-006
		hillsFraction   0.542337
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220292
		craterFreq      0.248291
		craterDensity   0.856091
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1637.13
		volcanoTemp     1275.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.201, 0.164, 0.000)
		colorShelf     (0.239, 0.207, 0.187, 0.000)
		colorBeach     (0.281, 0.242, 0.222, 0.000)
		colorDesert    (0.305, 0.260, 0.217, 0.000)
		colorLowland   (0.335, 0.278, 0.246, 0.000)
		colorUpland    (0.370, 0.337, 0.298, 0.000)
		colorRock      (0.400, 0.367, 0.322, 0.000)
		colorSnow      (0.436, 0.390, 0.339, 1.000)
		BumpHeight      0.0287994
		BumpOffset      0.00575988
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0532626
		DustBright  0.241408
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.41396
		Period          12.5019
		Eccentricity    0.965373
		Inclination     -86.0836
		AscendingNode   45.4877
		ArgOfPericenter -116.093
		MeanAnomaly     156.759
	}
}

Comet	"C83"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            7.26355e-014
	Radius          0.574136
	InertiaMoment   0.399582

	Oblateness      0.0152713

	RotationPeriod  40.3383
	Obliquity       268.055
	EqAscendNode    317.378

	AbsMagn         6.9044
	SlopeParam      4.60502
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.727 0.692 0.638)

	Surface
	{
		SurfStyle       0.738267
		OceanStyle      0.884147
		Randomize      (0.356, 0.192, 0.662)
		colorDistMagn   0.609711
		colorDistFreq   0.000263635
		detailScale     15.6777
		colorConversion true
		snowLevel       2
		tropicLatitude  0.967155
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595873
		terraceProb     0.129208
		erosion         0
		montesMagn      0.327293
		montesFreq      2.50861
		montesSpiky     0.977708
		montesFraction  0.341245
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000751673
		hillsFraction   0.545682
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215039
		craterFreq      0.197768
		craterDensity   0.837218
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   334
		volcanoTemp     1589.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.235, 0.179, 0.000)
		colorShelf     (0.291, 0.242, 0.204, 0.000)
		colorBeach     (0.342, 0.284, 0.242, 0.000)
		colorDesert    (0.371, 0.305, 0.236, 0.000)
		colorLowland   (0.407, 0.325, 0.268, 0.000)
		colorUpland    (0.451, 0.395, 0.325, 0.000)
		colorRock      (0.487, 0.429, 0.351, 0.000)
		colorSnow      (0.531, 0.457, 0.370, 1.000)
		BumpHeight      0.516722
		BumpOffset      0.103344
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.240317
		GasToDust   0.25
		Particles   1465
		GasBright   0.186841
		DustBright  0.592317
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.26971
		Period          4.76908
		Eccentricity    0.927778
		Inclination     -167.19
		AscendingNode   176.137
		ArgOfPericenter 124.055
		MeanAnomaly     -51.7184
	}
}

Comet	"C84"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            5.61783e-010
	Radius          12.4991
	InertiaMoment   0.39838

	Oblateness      0.0222909

	RotationPeriod  38.4766
	Obliquity       221.261
	EqAscendNode    301.956

	AbsMagn         8.24364
	SlopeParam      3.59606
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.494 0.489 0.480)

	Surface
	{
		SurfStyle       0.161335
		OceanStyle      0.831773
		Randomize      (0.831, -0.771, -0.003)
		colorDistMagn   0.933705
		colorDistFreq   0.0989987
		detailScale     341.308
		colorConversion true
		snowLevel       2
		tropicLatitude  0.606013
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615119
		terraceProb     0.271395
		erosion         0
		montesMagn      0.463027
		montesFreq      2.20998
		montesSpiky     0.948213
		montesFraction  0.569622
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.436886
		hillsFraction   0.554725
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207931
		craterFreq      0.17389
		craterDensity   0.818305
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   82.6798
		volcanoTemp     1494.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.195, 0.192, 0.000)
		colorShelf     (0.210, 0.208, 0.204, 0.000)
		colorBeach     (0.222, 0.220, 0.216, 0.000)
		colorDesert    (0.235, 0.232, 0.228, 0.000)
		colorLowland   (0.247, 0.244, 0.240, 0.000)
		colorUpland    (0.259, 0.257, 0.252, 0.000)
		colorRock      (0.272, 0.269, 0.264, 0.000)
		colorSnow      (0.284, 0.281, 0.276, 1.000)
		BumpHeight      11.2492
		BumpOffset      2.24983
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.721509
		GasToDust   0.25
		Particles   2437
		GasBright   0.138557
		DustBright  0.325087
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.9816
		Period          9.29832
		Eccentricity    0.906307
		Inclination     -21.5993
		AscendingNode   -66.5716
		ArgOfPericenter -144.644
		MeanAnomaly     159.274
	}
}

Comet	"C85"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.72977e-017
	Radius          0.0355625
	InertiaMoment   0.39364

	Oblateness      0.0181143

	RotationPeriod  36.5892
	Obliquity       174.467
	EqAscendNode    286.533

	AbsMagn         9.6116
	SlopeParam      2.46284
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.525 0.521 0.519)

	Surface
	{
		SurfStyle       0.997554
		OceanStyle      0.0293275
		Randomize      (0.589, -0.567, -0.831)
		colorDistMagn   0.917735
		colorDistFreq   3.43869e-007
		detailScale     0.971092
		colorConversion true
		snowLevel       2
		tropicLatitude  0.5459
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.544909
		terraceProb     0.200943
		erosion         0
		montesMagn      0.372419
		montesFreq      4.02811
		montesSpiky     0.986671
		montesFraction  0.41195
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.17668e-006
		hillsFraction   0.766904
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243772
		craterFreq      0.151552
		craterDensity   0.948975
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1340.61
		volcanoTemp     1550.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.182, 0.208, 0.050)
		colorShelf     (0.210, 0.214, 0.239, 0.040)
		colorBeach     (0.241, 0.245, 0.270, 0.030)
		colorDesert    (0.273, 0.276, 0.306, 0.020)
		colorLowland   (0.304, 0.307, 0.338, 0.030)
		colorUpland    (0.336, 0.338, 0.369, 0.050)
		colorRock      (0.367, 0.370, 0.410, 0.020)
		colorSnow      (0.367, 0.370, 0.410, 1.000)
		BumpHeight      0.0320062
		BumpOffset      0.00640124
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.339325
		DustBright  0.608805
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.61006
		Period          14.0558
		Eccentricity    0.992495
		Inclination     -38.1564
		AscendingNode   157.876
		ArgOfPericenter -91.7295
		MeanAnomaly     147.419
	}
}

Comet	"C86"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.33785e-013
	Radius          0.773791
	InertiaMoment   0.398908

	Oblateness      0.0274081

	RotationPeriod  34.6698
	Obliquity       127.672
	EqAscendNode    271.11

	AbsMagn         11.2076
	SlopeParam      6.19252
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.500 0.496 0.492)

	Surface
	{
		SurfStyle       0.752129
		OceanStyle      0.593274
		Randomize      (-0.133, -0.684, -0.380)
		colorDistMagn   0.327282
		colorDistFreq   0.000445303
		detailScale     21.1297
		colorConversion true
		snowLevel       2
		tropicLatitude  0.780522
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.726479
		terraceProb     0.404562
		erosion         0
		montesMagn      0.475865
		montesFreq      3.42355
		montesSpiky     0.845311
		montesFraction  0.521222
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00127881
		hillsFraction   0.562396
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221111
		craterFreq      0.232883
		craterDensity   0.966459
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   331.685
		volcanoTemp     1172.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.169, 0.138, 0.000)
		colorShelf     (0.200, 0.174, 0.157, 0.000)
		colorBeach     (0.235, 0.203, 0.187, 0.000)
		colorDesert    (0.255, 0.218, 0.182, 0.000)
		colorLowland   (0.280, 0.233, 0.207, 0.000)
		colorUpland    (0.310, 0.283, 0.251, 0.000)
		colorRock      (0.335, 0.307, 0.271, 0.000)
		colorSnow      (0.365, 0.327, 0.285, 1.000)
		BumpHeight      0.696412
		BumpOffset      0.139282
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.273143
		GasToDust   0.25
		Particles   1531
		GasBright   0.26376
		DustBright  0.368857
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.7924
		Period          7.99894
		Eccentricity    0.931453
		Inclination     -102.441
		AscendingNode   168.272
		ArgOfPericenter -22.9352
		MeanAnomaly     100.119
	}
}

Comet	"C87"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.03473e-009
	Radius          13.8985
	InertiaMoment   0.397246

	Oblateness      0.0229235

	RotationPeriod  32.7117
	Obliquity       80.8779
	EqAscendNode    255.688

	AbsMagn         13.6446
	SlopeParam      4.8502
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.549 0.406 0.359)

	Surface
	{
		SurfStyle       0.0532547
		OceanStyle      0.0667973
		Randomize      (0.302, -0.176, 0.951)
		colorDistMagn   0.526925
		colorDistFreq   0.110452
		detailScale     379.522
		colorConversion true
		snowLevel       2
		tropicLatitude  0.957936
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.537713
		terraceProb     0.259272
		erosion         0
		montesMagn      0.521931
		montesFreq      3.03601
		montesSpiky     0.887361
		montesFraction  0.797687
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.47449
		hillsFraction   0.701957
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.195164
		craterFreq      0.200238
		craterDensity   0.894854
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   67.7423
		volcanoTemp     1967.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.163, 0.143, 0.000)
		colorShelf     (0.233, 0.173, 0.152, 0.000)
		colorBeach     (0.247, 0.183, 0.161, 0.000)
		colorDesert    (0.261, 0.193, 0.170, 0.000)
		colorLowland   (0.275, 0.203, 0.179, 0.000)
		colorUpland    (0.288, 0.213, 0.188, 0.000)
		colorRock      (0.302, 0.223, 0.197, 0.000)
		colorSnow      (0.316, 0.234, 0.206, 1.000)
		BumpHeight      12.5087
		BumpOffset      2.50173
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.754335
		GasToDust   0.25
		Particles   2503
		GasBright   0.150935
		DustBright  0.166169
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.4569
		Period          12.8369
		Eccentricity    0.965337
		Inclination     9.32378
		AscendingNode   144.69
		ArgOfPericenter 67.569
		MeanAnomaly     -90.9292
	}
}

Comet	"C88"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            3.18602e-017
	Radius          0.0479048
	InertiaMoment   0.399368

	Oblateness      0.0348717

	RotationPeriod  30.7073
	Obliquity       34.0836
	EqAscendNode    240.265

	AbsMagn         1.80304
	SlopeParam      3.82794
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.547 0.388 0.331)

	Surface
	{
		SurfStyle       0.178362
		OceanStyle      0.951574
		Randomize      (0.239, 0.149, 0.424)
		colorDistMagn   0.122793
		colorDistFreq   1.8268e-006
		detailScale     1.30812
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995425
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.409447
		terraceProb     0.171215
		erosion         0
		montesMagn      0.551723
		montesFreq      3.00016
		montesSpiky     0.946246
		montesFraction  0.347569
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.87765e-006
		hillsFraction   0.659899
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23748
		craterFreq      0.23988
		craterDensity   0.798298
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1330.64
		volcanoTemp     1462.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.155, 0.133, 0.000)
		colorShelf     (0.232, 0.165, 0.141, 0.000)
		colorBeach     (0.246, 0.175, 0.149, 0.000)
		colorDesert    (0.260, 0.184, 0.157, 0.000)
		colorLowland   (0.273, 0.194, 0.166, 0.000)
		colorUpland    (0.287, 0.204, 0.174, 0.000)
		colorRock      (0.301, 0.214, 0.182, 0.000)
		colorSnow      (0.314, 0.223, 0.191, 1.000)
		BumpHeight      0.0431143
		BumpOffset      0.00862287
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0280753
		DustBright  0.773515
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.17815
		Period          10.7155
		Eccentricity    0.918893
		Inclination     -61.3999
		AscendingNode   -179.571
		ArgOfPericenter -138.779
		MeanAnomaly     -63.3856
	}
}

Comet	"C89"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.46416e-013
	Radius          0.860882
	InertiaMoment   0.398074

	Oblateness      0.0299185

	RotationPeriod  28.6478
	Obliquity       347.289
	EqAscendNode    224.843

	AbsMagn         4.53047
	SlopeParam      2.75509
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.558 0.552 0.547)

	Surface
	{
		SurfStyle       0.942273
		OceanStyle      0.258013
		Randomize      (-0.844, -0.428, -0.396)
		colorDistMagn   0.813162
		colorDistFreq   0.000435005
		detailScale     23.5078
		colorConversion true
		snowLevel       2
		tropicLatitude  0.617506
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530461
		terraceProb     0.100507
		erosion         0
		montesMagn      0.425409
		montesFreq      3.47467
		montesSpiky     0.844351
		montesFraction  0.639407
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00168544
		hillsFraction   0.735034
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240738
		craterFreq      0.271299
		craterDensity   0.941562
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   271.904
		volcanoTemp     1751.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.193, 0.219, 0.050)
		colorShelf     (0.223, 0.226, 0.251, 0.040)
		colorBeach     (0.257, 0.260, 0.284, 0.030)
		colorDesert    (0.290, 0.293, 0.323, 0.020)
		colorLowland   (0.324, 0.326, 0.355, 0.030)
		colorUpland    (0.357, 0.359, 0.388, 0.050)
		colorRock      (0.391, 0.392, 0.432, 0.020)
		colorSnow      (0.391, 0.392, 0.432, 1.000)
		BumpHeight      0.774794
		BumpOffset      0.154959
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.305969
		GasToDust   0.25
		Particles   1597
		GasBright   0.0457251
		DustBright  0.440352
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.37961
		Period          12.2359
		Eccentricity    0.933373
		Inclination     145.704
		AscendingNode   81.0309
		ArgOfPericenter 51.0257
		MeanAnomaly     -123.05
	}
}

Comet	"C90"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.90585e-009
	Radius          18.713
	InertiaMoment   0.399797

	Oblateness      0.0466516

	RotationPeriod  26.5228
	Obliquity       300.495
	EqAscendNode    209.42

	AbsMagn         6.18574
	SlopeParam      6.67252
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.416 0.412 0.410)

	Surface
	{
		SurfStyle       0.648175
		OceanStyle      0.573277
		Randomize      (0.055, 0.938, -0.604)
		colorDistMagn   0.36366
		colorDistFreq   0.241062
		detailScale     510.99
		colorConversion true
		snowLevel       2
		tropicLatitude  0.758359
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515177
		terraceProb     0.124919
		erosion         0
		montesMagn      0.56
		montesFreq      3.34838
		montesSpiky     0.957653
		montesFraction  0.685027
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.707124
		hillsFraction   0.597264
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207796
		craterFreq      0.212925
		craterDensity   0.681773
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   67.2055
		volcanoTemp     1772.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.140, 0.115, 0.000)
		colorShelf     (0.166, 0.144, 0.131, 0.000)
		colorBeach     (0.195, 0.169, 0.156, 0.000)
		colorDesert    (0.212, 0.181, 0.152, 0.000)
		colorLowland   (0.233, 0.194, 0.172, 0.000)
		colorUpland    (0.258, 0.235, 0.209, 0.000)
		colorRock      (0.279, 0.255, 0.225, 0.000)
		colorSnow      (0.303, 0.272, 0.238, 1.000)
		BumpHeight      16.8417
		BumpOffset      3.36834
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.787161
		GasToDust   0.25
		Particles   2570
		GasBright   0.148608
		DustBright  0.821955
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.11472
		Period          10.2508
		Eccentricity    0.905615
		Inclination     -35.5394
		AscendingNode   118.489
		ArgOfPericenter 75.0548
		MeanAnomaly     -74.6279
	}
}

Comet	"C91"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            5.86826e-017
	Radius          0.0533234
	InertiaMoment   0.398659

	Oblateness      0.0415166

	RotationPeriod  24.3202
	Obliquity       253.701
	EqAscendNode    193.997

	AbsMagn         7.5708
	SlopeParam      5.10893
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.642 0.639 0.636)

	Surface
	{
		SurfStyle       0.515976
		OceanStyle      0.898152
		Randomize      (-0.338, -0.596, -0.848)
		colorDistMagn   0.982591
		colorDistFreq   1.92106e-006
		detailScale     1.45609
		colorConversion true
		snowLevel       2
		tropicLatitude  0.564943
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.353749
		terraceProb     0.269568
		erosion         0
		montesMagn      0.398731
		montesFreq      2.41163
		montesSpiky     0.902768
		montesFraction  0.632072
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.1844e-006
		hillsFraction   0.576147
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213859
		craterFreq      0.209644
		craterDensity   0.977898
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1091.36
		volcanoTemp     1359.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.217, 0.178, 0.000)
		colorShelf     (0.257, 0.224, 0.204, 0.000)
		colorBeach     (0.302, 0.262, 0.242, 0.000)
		colorDesert    (0.327, 0.281, 0.235, 0.000)
		colorLowland   (0.359, 0.300, 0.267, 0.000)
		colorUpland    (0.398, 0.364, 0.324, 0.000)
		colorRock      (0.430, 0.396, 0.350, 0.000)
		colorSnow      (0.468, 0.422, 0.369, 1.000)
		BumpHeight      0.0479911
		BumpOffset      0.00959822
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.138976
		DustBright  0.516074
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.29055
		Period          11.5555
		Eccentricity    0.941374
		Inclination     -79.0472
		AscendingNode   158.784
		ArgOfPericenter 83.1084
		MeanAnomaly     -81.3685
	}
}

Comet	"C92"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            4.53867e-013
	Radius          1.15855
	InertiaMoment   0.396567

	Oblateness      0.0666013

	RotationPeriod  22.0252
	Obliquity       206.906
	EqAscendNode    178.575

	AbsMagn         8.90482
	SlopeParam      4.05752
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.550 0.489 0.420)

	Surface
	{
		SurfStyle       0.0606369
		OceanStyle      0.865673
		Randomize      (-0.947, -0.163, -0.943)
		colorDistMagn   0.101647
		colorDistFreq   0.000529665
		detailScale     31.6362
		colorConversion true
		snowLevel       2
		tropicLatitude  0.439413
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452752
		terraceProb     0.226409
		erosion         0
		montesMagn      0.518215
		montesFreq      3.76579
		montesSpiky     0.900439
		montesFraction  0.664326
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00306494
		hillsFraction   0.438284
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253298
		craterFreq      0.233091
		craterDensity   0.948717
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   269.623
		volcanoTemp     1664.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.196, 0.168, 0.000)
		colorShelf     (0.234, 0.208, 0.178, 0.000)
		colorBeach     (0.248, 0.220, 0.189, 0.000)
		colorDesert    (0.261, 0.232, 0.199, 0.000)
		colorLowland   (0.275, 0.244, 0.210, 0.000)
		colorUpland    (0.289, 0.257, 0.220, 0.000)
		colorRock      (0.303, 0.269, 0.231, 0.000)
		colorSnow      (0.316, 0.281, 0.241, 1.000)
		BumpHeight      1.0427
		BumpOffset      0.208539
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.338795
		GasToDust   0.25
		Particles   1664
		GasBright   0.0920842
		DustBright  0.247452
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.64683
		Period          7.04452
		Eccentricity    0.910086
		Inclination     177.004
		AscendingNode   70.8562
		ArgOfPericenter -57.8333
		MeanAnomaly     119.558
	}
}

Comet	"C93"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            3.51033e-009
	Radius          20.8397
	InertiaMoment   0.399146

	Oblateness      0.0637767

	RotationPeriod  19.6193
	Obliquity       160.112
	EqAscendNode    163.152

	AbsMagn         10.3514
	SlopeParam      3.02286
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.781 0.739 0.724)

	Surface
	{
		SurfStyle       0.084141
		OceanStyle      0.0223685
		Randomize      (-0.486, -0.490, -0.626)
		colorDistMagn   0.405425
		colorDistFreq   0.180133
		detailScale     569.062
		colorConversion true
		snowLevel       2
		tropicLatitude  0.38243
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.43388
		terraceProb     0.286773
		erosion         0
		montesMagn      0.204791
		montesFreq      3.11209
		montesSpiky     0.941983
		montesFraction  0.477465
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.41182
		hillsFraction   0.600607
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245329
		craterFreq      0.224409
		craterDensity   1.00276
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   55.1471
		volcanoTemp     1503.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.296, 0.289, 0.000)
		colorShelf     (0.332, 0.314, 0.308, 0.000)
		colorBeach     (0.351, 0.332, 0.326, 0.000)
		colorDesert    (0.371, 0.351, 0.344, 0.000)
		colorLowland   (0.390, 0.369, 0.362, 0.000)
		colorUpland    (0.410, 0.388, 0.380, 0.000)
		colorRock      (0.430, 0.406, 0.398, 0.000)
		colorSnow      (0.449, 0.425, 0.416, 1.000)
		BumpHeight      18.7557
		BumpOffset      3.75114
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.819987
		GasToDust   0.25
		Particles   2636
		GasBright   0.272134
		DustBright  0.551889
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.80386
		Period          15.65
		Eccentricity    0.965335
		Inclination     9.00452
		AscendingNode   95.1582
		ArgOfPericenter 56.2561
		MeanAnomaly     -150.935
	}
}

Comet	"C94"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.08086e-016
	Radius          0.071729
	InertiaMoment   0.397714

	Oblateness      0.110852

	RotationPeriod  17.0795
	Obliquity       113.318
	EqAscendNode    147.73

	AbsMagn         12.213
	SlopeParam      7.39119
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.447 0.441 0.439)

	Surface
	{
		SurfStyle       0.437154
		OceanStyle      0.783364
		Randomize      (-0.840, 0.151, -0.784)
		colorDistMagn   0.422166
		colorDistFreq   3.46783e-006
		detailScale     1.95868
		colorConversion true
		snowLevel       2
		tropicLatitude  0.863632
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.598496
		terraceProb     0.117691
		erosion         0
		montesMagn      0.513202
		montesFreq      3.52446
		montesSpiky     0.88544
		montesFraction  0.74517
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.36614e-005
		hillsFraction   0.6484
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262935
		craterFreq      0.208616
		craterDensity   0.891627
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1081.73
		volcanoTemp     1544.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.177, 0.176, 0.000)
		colorShelf     (0.190, 0.188, 0.187, 0.000)
		colorBeach     (0.201, 0.199, 0.198, 0.000)
		colorDesert    (0.212, 0.210, 0.209, 0.000)
		colorLowland   (0.223, 0.221, 0.220, 0.000)
		colorUpland    (0.235, 0.232, 0.231, 0.000)
		colorRock      (0.246, 0.243, 0.242, 0.000)
		colorSnow      (0.257, 0.254, 0.253, 1.000)
		BumpHeight      0.0645561
		BumpOffset      0.0129112
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.197961
		DustBright  0.310549
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.69556
		Period          14.752
		Eccentricity    0.955482
		Inclination     82.7238
		AscendingNode   -60.107
		ArgOfPericenter -133.646
		MeanAnomaly     -21.3404
	}
}

Comet	"C95"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            8.35965e-013
	Radius          1.29081
	InertiaMoment   0.399587

	Oblateness      0.118735

	RotationPeriod  14.3755
	Obliquity       66.5236
	EqAscendNode    132.307

	AbsMagn         16.7995
	SlopeParam      5.38775
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.655 0.654 0.652)

	Surface
	{
		SurfStyle       0.658405
		OceanStyle      0.116518
		Randomize      (0.412, 0.564, 0.531)
		colorDistMagn   0.540058
		colorDistFreq   0.000941833
		detailScale     35.2477
		colorConversion true
		snowLevel       2
		tropicLatitude  0.820555
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.614864
		terraceProb     0.369558
		erosion         0
		montesMagn      0.398885
		montesFreq      3.22793
		montesSpiky     0.954268
		montesFraction  0.513483
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00484521
		hillsFraction   0.756448
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220134
		craterFreq      0.260017
		craterDensity   1.07414
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   221.347
		volcanoTemp     1523.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.222, 0.182, 0.000)
		colorShelf     (0.262, 0.229, 0.209, 0.000)
		colorBeach     (0.308, 0.268, 0.248, 0.000)
		colorDesert    (0.334, 0.288, 0.241, 0.000)
		colorLowland   (0.367, 0.307, 0.274, 0.000)
		colorUpland    (0.406, 0.373, 0.332, 0.000)
		colorRock      (0.439, 0.405, 0.358, 0.000)
		colorSnow      (0.478, 0.432, 0.378, 1.000)
		BumpHeight      1.16173
		BumpOffset      0.232346
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.371621
		GasToDust   0.25
		Particles   1730
		GasBright   0.445201
		DustBright  0.547795
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.5329
		Period          6.32629
		Eccentricity    0.918246
		Inclination     14.7147
		AscendingNode   143.08
		ArgOfPericenter 65.9573
		MeanAnomaly     -93.4092
	}
}

Comet	"C96"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            6.46559e-009
	Radius          28.0209
	InertiaMoment   0.398387

	Oblateness      0.2457

	RotationPeriod  11.4671
	Obliquity       19.7293
	EqAscendNode    116.885

	AbsMagn         3.4152
	SlopeParam      4.28786
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.807 0.786 0.765)

	Surface
	{
		SurfStyle       0.500424
		OceanStyle      0.0450554
		Randomize      (-0.809, 0.449, 0.287)
		colorDistMagn   0.0896767
		colorDistFreq   0.60536
		detailScale     765.159
		colorConversion true
		snowLevel       2
		tropicLatitude  0.350961
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.561993
		terraceProb     0.229797
		erosion         0
		montesMagn      0.547071
		montesFreq      3.16205
		montesSpiky     0.895213
		montesFraction  0.314541
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.76136
		hillsFraction   0.4231
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254789
		craterFreq      0.218438
		craterDensity   0.901346
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   54.6367
		volcanoTemp     1534.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.315, 0.267, 0.214, 0.000)
		colorShelf     (0.323, 0.275, 0.245, 0.000)
		colorBeach     (0.379, 0.322, 0.291, 0.000)
		colorDesert    (0.412, 0.346, 0.283, 0.000)
		colorLowland   (0.452, 0.369, 0.321, 0.000)
		colorUpland    (0.501, 0.448, 0.390, 0.000)
		colorRock      (0.541, 0.487, 0.420, 0.000)
		colorSnow      (0.589, 0.519, 0.443, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.852813
		GasToDust   0.25
		Particles   2702
		GasBright   0.00500429
		DustBright  0.672478
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.81635
		Period          8.15979
		Eccentricity    0.920992
		Inclination     0.950688
		AscendingNode   -31.44
		ArgOfPericenter -102.06
		MeanAnomaly     -109.25
	}
}

Comet	"C97"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.99081e-016
	Radius          0.0799527
	InertiaMoment   0.394172

	Oblateness      0.249

	RotationPeriod  8.29822
	Obliquity       332.935
	EqAscendNode    101.462

	AbsMagn         5.40266
	SlopeParam      3.27411
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.592 0.589 0.588)

	Surface
	{
		SurfStyle       0.731372
		OceanStyle      0.939899
		Randomize      (0.230, 0.450, -0.176)
		colorDistMagn   0.73657
		colorDistFreq   4.2323e-006
		detailScale     2.18324
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986886
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.617119
		terraceProb     0.270943
		erosion         0
		montesMagn      0.501173
		montesFreq      3.92705
		montesSpiky     0.974183
		montesFraction  0.662729
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.19013e-005
		hillsFraction   0.636398
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240165
		craterFreq      0.176466
		craterDensity   0.731564
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   888.433
		volcanoTemp     1485.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.200, 0.165, 0.000)
		colorShelf     (0.237, 0.206, 0.188, 0.000)
		colorBeach     (0.278, 0.241, 0.223, 0.000)
		colorDesert    (0.302, 0.259, 0.217, 0.000)
		colorLowland   (0.331, 0.277, 0.247, 0.000)
		colorUpland    (0.367, 0.336, 0.300, 0.000)
		colorRock      (0.397, 0.365, 0.323, 0.000)
		colorSnow      (0.432, 0.389, 0.341, 1.000)
		BumpHeight      0.0719574
		BumpOffset      0.0143915
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0240463
		DustBright  0.337923
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.59098
		Period          13.902
		Eccentricity    0.979628
		Inclination     -96.6876
		AscendingNode   -125.921
		ArgOfPericenter 68.3277
		MeanAnomaly     -98.5429
	}
}

Comet	"C98"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.53975e-012
	Radius          1.73491
	InertiaMoment   0.398914

	Oblateness      0.249

	RotationPeriod  4.78754
	Obliquity       286.141
	EqAscendNode    86.0394

	AbsMagn         6.88549
	SlopeParam      2.00635
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.698 0.696 0.695)

	Surface
	{
		SurfStyle       0.949869
		OceanStyle      0.0843655
		Randomize      (0.201, 0.020, -0.045)
		colorDistMagn   0.871982
		colorDistFreq   0.00189093
		detailScale     47.3747
		colorConversion true
		snowLevel       2
		tropicLatitude  0.923887
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446994
		terraceProb     0.194011
		erosion         0
		montesMagn      0.538549
		montesFreq      3.57274
		montesSpiky     0.908365
		montesFraction  0.319664
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00547939
		hillsFraction   0.721405
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250177
		craterFreq      0.212314
		craterDensity   0.935852
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   219.209
		volcanoTemp     1667.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.244, 0.278, 0.050)
		colorShelf     (0.279, 0.285, 0.320, 0.040)
		colorBeach     (0.321, 0.327, 0.361, 0.030)
		colorDesert    (0.363, 0.369, 0.410, 0.020)
		colorLowland   (0.405, 0.411, 0.452, 0.030)
		colorUpland    (0.447, 0.453, 0.494, 0.050)
		colorRock      (0.489, 0.494, 0.549, 0.020)
		colorSnow      (0.489, 0.494, 0.549, 1.000)
		BumpHeight      1.56142
		BumpOffset      0.312284
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.404447
		GasToDust   0.25
		Particles   1796
		GasBright   0.106211
		DustBright  0.740245
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.34539
		Period          11.973
		Eccentricity    0.932735
		Inclination     74.551
		AscendingNode   119.557
		ArgOfPericenter -57.3964
		MeanAnomaly     -72.7453
	}
}

Comet	"C99"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.19088e-008
	Radius          31.2465
	InertiaMoment   0.397259

	Oblateness      0.00132402

	RotationPeriod  135.25
	Obliquity       239.346
	EqAscendNode    70.6168

	AbsMagn         8.22541
	SlopeParam      5.69665
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.651 0.648 0.645)

	Surface
	{
		SurfStyle       0.278513
		OceanStyle      0.830248
		Randomize      (-0.709, -0.341, -0.174)
		colorDistMagn   0.0866167
		colorDistFreq   0.641316
		detailScale     853.239
		colorConversion true
		snowLevel       2
		tropicLatitude  0.780499
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535316
		terraceProb     0.418199
		erosion         0
		montesMagn      0.601372
		montesFreq      3.83304
		montesSpiky     0.938035
		montesFraction  0.7559
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.68847
		hillsFraction   0.621376
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201526
		craterFreq      0.264393
		craterDensity   0.955689
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   44.8925
		volcanoTemp     1275.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.259, 0.258, 0.000)
		colorShelf     (0.277, 0.275, 0.274, 0.000)
		colorBeach     (0.293, 0.292, 0.290, 0.000)
		colorDesert    (0.309, 0.308, 0.306, 0.000)
		colorLowland   (0.325, 0.324, 0.322, 0.000)
		colorUpland    (0.342, 0.340, 0.338, 0.000)
		colorRock      (0.358, 0.356, 0.355, 0.000)
		colorSnow      (0.374, 0.373, 0.371, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.885639
		GasToDust   0.25
		Particles   2768
		GasBright   0.0979707
		DustBright  0.432972
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.93001
		Period          8.93754
		Eccentricity    0.932983
		Inclination     12.3532
		AscendingNode   133.684
		ArgOfPericenter 100.189
		MeanAnomaly     -83.1665
	}
}

Comet	"C100"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            3.66682e-016
	Radius          0.107419
	InertiaMoment   0.399374

	Oblateness      0.00235526

	RotationPeriod  116.948
	Obliquity       192.552
	EqAscendNode    55.1942

	AbsMagn         9.59188
	SlopeParam      4.5221
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.589 0.582 0.578)

	Surface
	{
		SurfStyle       0.651462
		OceanStyle      0.254812
		Randomize      (0.849, -0.720, 0.560)
		colorDistMagn   0.876877
		colorDistFreq   3.18441e-006
		detailScale     2.93324
		colorConversion true
		snowLevel       2
		tropicLatitude  0.385932
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.60751
		terraceProb     0.107385
		erosion         0
		montesMagn      0.439779
		montesFreq      3.11138
		montesSpiky     0.823827
		montesFraction  0.408422
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.78482e-005
		hillsFraction   0.691308
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245583
		craterFreq      0.231881
		craterDensity   0.859539
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   879.51
		volcanoTemp     1782.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.198, 0.162, 0.000)
		colorShelf     (0.236, 0.204, 0.185, 0.000)
		colorBeach     (0.277, 0.239, 0.220, 0.000)
		colorDesert    (0.300, 0.256, 0.214, 0.000)
		colorLowland   (0.330, 0.274, 0.243, 0.000)
		colorUpland    (0.365, 0.332, 0.295, 0.000)
		colorRock      (0.395, 0.361, 0.318, 0.000)
		colorSnow      (0.430, 0.384, 0.335, 1.000)
		BumpHeight      0.0966767
		BumpOffset      0.0193353
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0524715
		DustBright  0.162957
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.57049
		Period          13.7373
		Eccentricity    0.933447
		Inclination     23.1325
		AscendingNode   106.962
		ArgOfPericenter 172.703
		MeanAnomaly     150.217
	}
}

Comet	"C101"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.83602e-012
	Radius          1.9354
	InertiaMoment   0.398082

	Oblateness      0.00207825

	RotationPeriod  108.004
	Obliquity       145.758
	EqAscendNode    39.7716

	AbsMagn         11.1825
	SlopeParam      3.51437
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.724 0.722 0.720)

	Surface
	{
		SurfStyle       0.147537
		OceanStyle      0.569231
		Randomize      (-0.038, -0.067, -0.742)
		colorDistMagn   0.793289
		colorDistFreq   0.00147529
		detailScale     52.8492
		colorConversion true
		snowLevel       2
		tropicLatitude  0.599336
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.59511
		terraceProb     0.33311
		erosion         0
		montesMagn      0.528965
		montesFreq      2.45241
		montesSpiky     0.938146
		montesFraction  0.382773
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00826508
		hillsFraction   0.781665
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234246
		craterFreq      0.260359
		craterDensity   0.914601
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   180.186
		volcanoTemp     1733.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.289, 0.288, 0.000)
		colorShelf     (0.308, 0.307, 0.306, 0.000)
		colorBeach     (0.326, 0.325, 0.324, 0.000)
		colorDesert    (0.344, 0.343, 0.342, 0.000)
		colorLowland   (0.362, 0.361, 0.360, 0.000)
		colorUpland    (0.380, 0.379, 0.378, 0.000)
		colorRock      (0.398, 0.397, 0.396, 0.000)
		colorSnow      (0.416, 0.415, 0.414, 1.000)
		BumpHeight      1.74186
		BumpOffset      0.348371
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.437273
		GasToDust   0.25
		Particles   1863
		GasBright   0.211803
		DustBright  0.488112
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.83351
		Period          8.27571
		Eccentricity    0.9534
		Inclination     6.17245
		AscendingNode   -110.69
		ArgOfPericenter -18.3547
		MeanAnomaly     42.3281
	}
}

Comet	"C102"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.19345e-008
	Radius          41.965
	InertiaMoment   0.399802

	Oblateness      0.00310825

	RotationPeriod  101.718
	Obliquity       98.9635
	EqAscendNode    24.349

	AbsMagn         13.5957
	SlopeParam      2.35345
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.784 0.782 0.779)

	Surface
	{
		SurfStyle       0.324082
		OceanStyle      0.0444487
		Randomize      (-0.179, -0.300, 0.039)
		colorDistMagn   0.181411
		colorDistFreq   1.3665
		detailScale     1145.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988357
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.764995
		terraceProb     0.523174
		erosion         0
		montesMagn      0.524322
		montesFreq      2.84908
		montesSpiky     0.90745
		montesFraction  0.699181
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.85229
		hillsFraction   0.875647
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233958
		craterFreq      0.252597
		craterDensity   0.814993
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   44.4252
		volcanoTemp     1672.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.313, 0.312, 0.000)
		colorShelf     (0.333, 0.332, 0.331, 0.000)
		colorBeach     (0.353, 0.352, 0.351, 0.000)
		colorDesert    (0.372, 0.372, 0.370, 0.000)
		colorLowland   (0.392, 0.391, 0.389, 0.000)
		colorUpland    (0.412, 0.411, 0.409, 0.000)
		colorRock      (0.431, 0.430, 0.428, 0.000)
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

	CometTail
	{
		MaxLength   0.918465
		GasToDust   0.25
		Particles   2835
		GasBright   0.139022
		DustBright  0.24538
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.39311
		Period          12.3403
		Eccentricity    0.985578
		Inclination     -1.25355
		AscendingNode   80.3737
		ArgOfPericenter -158.891
		MeanAnomaly     -47.9363
	}
}

Comet	"C103"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            6.7538e-016
	Radius          0.119877
	InertiaMoment   0.398666

	Oblateness      0.00259032

	RotationPeriod  96.7418
	Obliquity       52.1692
	EqAscendNode    8.92642

	AbsMagn         1.74187
	SlopeParam      6.05257
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.659 0.515 0.433)

	Surface
	{
		SurfStyle       0.766497
		OceanStyle      0.352515
		Randomize      (0.621, 0.808, 0.538)
		colorDistMagn   0.6942
		colorDistFreq   3.23841e-006
		detailScale     3.27344
		colorConversion true
		snowLevel       2
		tropicLatitude  0.662587
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.682556
		terraceProb     0.137936
		erosion         0
		montesMagn      0.551504
		montesFreq      2.75856
		montesSpiky     0.962728
		montesFraction  0.230719
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.74741e-005
		hillsFraction   0.710101
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269682
		craterFreq      0.231274
		craterDensity   1.06989
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   723.215
		volcanoTemp     1106.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.175, 0.121, 0.000)
		colorShelf     (0.264, 0.180, 0.138, 0.000)
		colorBeach     (0.310, 0.211, 0.164, 0.000)
		colorDesert    (0.336, 0.227, 0.160, 0.000)
		colorLowland   (0.369, 0.242, 0.182, 0.000)
		colorUpland    (0.409, 0.294, 0.221, 0.000)
		colorRock      (0.442, 0.320, 0.238, 0.000)
		colorSnow      (0.481, 0.340, 0.251, 1.000)
		BumpHeight      0.107889
		BumpOffset      0.0215778
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.365544
		DustBright  0.503344
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.55143
		Period          6.44135
		Eccentricity    0.905555
		Inclination     12.8385
		AscendingNode   -149.351
		ArgOfPericenter -58.8355
		MeanAnomaly     -139.998
	}
}

Comet	"C104"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            5.22358e-012
	Radius          2.59838
	InertiaMoment   0.396589

	Oblateness      0.00369729

	RotationPeriod  92.5547
	Obliquity       5.37488
	EqAscendNode    353.504

	AbsMagn         4.50388
	SlopeParam      4.76375
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.768 0.765 0.762)

	Surface
	{
		SurfStyle       0.676633
		OceanStyle      0.392573
		Randomize      (-0.976, -0.805, -0.087)
		colorDistMagn   0.414814
		colorDistFreq   0.000964187
		detailScale     70.9531
		colorConversion true
		snowLevel       2
		tropicLatitude  0.326629
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.485857
		terraceProb     0.204239
		erosion         0
		montesMagn      0.433411
		montesFreq      3.87373
		montesSpiky     0.907031
		montesFraction  0.721552
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0151069
		hillsFraction   0.722654
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224988
		craterFreq      0.173097
		craterDensity   0.722815
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   178.248
		volcanoTemp     1258.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.260, 0.213, 0.000)
		colorShelf     (0.307, 0.268, 0.244, 0.000)
		colorBeach     (0.361, 0.314, 0.289, 0.000)
		colorDesert    (0.391, 0.336, 0.282, 0.000)
		colorLowland   (0.430, 0.359, 0.320, 0.000)
		colorUpland    (0.476, 0.436, 0.388, 0.000)
		colorRock      (0.514, 0.474, 0.419, 0.000)
		colorSnow      (0.560, 0.505, 0.442, 1.000)
		BumpHeight      2.33854
		BumpOffset      0.467708
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.470099
		GasToDust   0.25
		Particles   1929
		GasBright   0.265481
		DustBright  0.287894
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.05527
		Period          9.82165
		Eccentricity    0.926984
		Inclination     24.0915
		AscendingNode   161.552
		ArgOfPericenter -102.471
		MeanAnomaly     27.8699
	}
}

Comet	"C105"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            4.04007e-008
	Radius          46.849
	InertiaMoment   0.399152

	Oblateness      0.0030666

	RotationPeriod  88.8966
	Obliquity       318.581
	EqAscendNode    338.081

	AbsMagn         6.16554
	SlopeParam      3.74779
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.729 0.728 0.726)

	Surface
	{
		SurfStyle       0.220081
		OceanStyle      0.444595
		Randomize      (-0.337, 0.374, -0.918)
		colorDistMagn   0.878053
		colorDistFreq   1.73649
		detailScale     1279.29
		colorConversion true
		snowLevel       2
		tropicLatitude  0.668661
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.278854
		terraceProb     0.51443
		erosion         0
		montesMagn      0.511972
		montesFreq      3.99849
		montesSpiky     0.875306
		montesFraction  0.516114
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.02798
		hillsFraction   0.553329
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23416
		craterFreq      0.221212
		craterDensity   0.881055
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   36.5436
		volcanoTemp     1479.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.291, 0.290, 0.000)
		colorShelf     (0.310, 0.309, 0.308, 0.000)
		colorBeach     (0.328, 0.327, 0.326, 0.000)
		colorDesert    (0.346, 0.346, 0.345, 0.000)
		colorLowland   (0.365, 0.364, 0.363, 0.000)
		colorUpland    (0.383, 0.382, 0.381, 0.000)
		colorRock      (0.401, 0.400, 0.399, 0.000)
		colorSnow      (0.419, 0.418, 0.417, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.951291
		GasToDust   0.25
		Particles   2901
		GasBright   0.00922758
		DustBright  0.228634
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.33104
		Period          5.11877
		Eccentricity    0.900958
		Inclination     -16.3942
		AscendingNode   -97.4371
		ArgOfPericenter 3.15297
		MeanAnomaly     -157.113
	}
}

Comet	"C106"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.24397e-015
	Radius          0.160888
	InertiaMoment   0.397724

	Oblateness      0.00432534

	RotationPeriod  85.6181
	Obliquity       271.786
	EqAscendNode    322.659

	AbsMagn         7.55248
	SlopeParam      2.65684
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.773 0.772 0.769)

	Surface
	{
		SurfStyle       0.142526
		OceanStyle      0.20188
		Randomize      (-0.046, -0.736, -0.428)
		colorDistMagn   0.847079
		colorDistFreq   1.75146e-005
		detailScale     4.39331
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999721
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439673
		terraceProb     0.232967
		erosion         0
		montesMagn      0.48806
		montesFreq      4.02492
		montesSpiky     0.958908
		montesFraction  0.476078
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.74052e-005
		hillsFraction   0.625542
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23982
		craterFreq      0.246402
		craterDensity   0.872658
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   715.196
		volcanoTemp     936.559
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.309, 0.308, 0.000)
		colorShelf     (0.328, 0.328, 0.327, 0.000)
		colorBeach     (0.348, 0.347, 0.346, 0.000)
		colorDesert    (0.367, 0.367, 0.366, 0.000)
		colorLowland   (0.386, 0.386, 0.385, 0.000)
		colorUpland    (0.406, 0.405, 0.404, 0.000)
		colorRock      (0.425, 0.424, 0.423, 0.000)
		colorSnow      (0.444, 0.444, 0.442, 1.000)
		BumpHeight      0.144799
		BumpOffset      0.0289598
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0217326
		GasToDust   0.25
		Particles   1023
		GasBright   0.0706739
		DustBright  0.651674
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.16759
		Period          10.6376
		Eccentricity    0.961679
		Inclination     173.216
		AscendingNode   -86.4418
		ArgOfPericenter 47.3394
		MeanAnomaly     140.126
	}
}

Comet	"C107"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            9.6212e-012
	Radius          2.90177
	InertiaMoment   0.399593

	Oblateness      0.00354787

	RotationPeriod  82.6252
	Obliquity       224.992
	EqAscendNode    307.236

	AbsMagn         8.88616
	SlopeParam      6.48933
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.770 0.769 0.767)

	Surface
	{
		SurfStyle       0.775742
		OceanStyle      0.0175408
		Randomize      (-0.574, -0.069, 0.031)
		colorDistMagn   0.555757
		colorDistFreq   0.006231
		detailScale     79.2377
		colorConversion true
		snowLevel       2
		tropicLatitude  0.671916
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.640965
		terraceProb     0.343877
		erosion         0
		montesMagn      0.556906
		montesFreq      2.47669
		montesSpiky     0.886935
		montesFraction  0.690595
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0207762
		hillsFraction   0.538008
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239532
		craterFreq      0.23421
		craterDensity   0.809406
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   146.674
		volcanoTemp     1437.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.261, 0.215, 0.000)
		colorShelf     (0.308, 0.269, 0.245, 0.000)
		colorBeach     (0.362, 0.315, 0.291, 0.000)
		colorDesert    (0.393, 0.338, 0.284, 0.000)
		colorLowland   (0.431, 0.361, 0.322, 0.000)
		colorUpland    (0.477, 0.438, 0.391, 0.000)
		colorRock      (0.516, 0.477, 0.422, 0.000)
		colorSnow      (0.562, 0.507, 0.445, 1.000)
		BumpHeight      2.61159
		BumpOffset      0.522319
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.502925
		GasToDust   0.25
		Particles   1995
		GasBright   0.0638261
		DustBright  0.343009
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.09797
		Period          10.1293
		Eccentricity    0.969761
		Inclination     154.868
		AscendingNode   70.4717
		ArgOfPericenter -61.9643
		MeanAnomaly     -14.0021
	}
}

Comet	"C108"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            7.44129e-008
	Radius          62.8565
	InertiaMoment   0.398395

	Oblateness      0.00496922

	RotationPeriod  79.8543
	Obliquity       178.198
	EqAscendNode    291.813

	AbsMagn         10.3298
	SlopeParam      5.01714
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.724 0.721 0.719)

	Surface
	{
		SurfStyle       0.68333
		OceanStyle      0.86699
		Randomize      (0.583, -0.805, 0.249)
		colorDistMagn   0.859029
		colorDistFreq   2.22372
		detailScale     1716.4
		colorConversion true
		snowLevel       2
		tropicLatitude  0.818952
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366282
		terraceProb     0.503811
		erosion         0
		montesMagn      0.694265
		montesFreq      3.22812
		montesSpiky     0.974556
		montesFraction  0.329562
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.99636
		hillsFraction   0.428475
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215981
		craterFreq      0.196068
		craterDensity   1.04293
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   36.127
		volcanoTemp     1878.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.245, 0.201, 0.000)
		colorShelf     (0.290, 0.252, 0.230, 0.000)
		colorBeach     (0.340, 0.296, 0.273, 0.000)
		colorDesert    (0.369, 0.317, 0.266, 0.000)
		colorLowland   (0.405, 0.339, 0.302, 0.000)
		colorUpland    (0.449, 0.411, 0.367, 0.000)
		colorRock      (0.485, 0.447, 0.396, 0.000)
		colorSnow      (0.528, 0.476, 0.417, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.984116
		GasToDust   0.25
		Particles   2967
		GasBright   0.192463
		DustBright  0.698859
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.01117
		Period          9.50721
		Eccentricity    0.924521
		Inclination     54.7219
		AscendingNode   -97.6061
		ArgOfPericenter -27.0917
		MeanAnomaly     -123.998
	}
}

Comet	"C109"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.29124e-015
	Radius          0.179732
	InertiaMoment   0.394467

	Oblateness      0.00397168

	RotationPeriod  77.2604
	Obliquity       131.403
	EqAscendNode    276.391

	AbsMagn         12.1815
	SlopeParam      3.97782
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.432 0.427 0.424)

	Surface
	{
		SurfStyle       0.950132
		OceanStyle      0.287067
		Randomize      (-0.774, 0.408, -0.460)
		colorDistMagn   0.721815
		colorDistFreq   1.31171e-005
		detailScale     4.90787
		colorConversion true
		snowLevel       2
		tropicLatitude  0.74612
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.728888
		terraceProb     0.402975
		erosion         0
		montesMagn      0.523809
		montesFreq      2.4812
		montesSpiky     0.983104
		montesFraction  0.366976
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.66538e-005
		hillsFraction   0.506762
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243754
		craterFreq      0.163534
		craterDensity   0.834723
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   588.702
		volcanoTemp     1233.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.147, 0.149, 0.169, 0.050)
		colorShelf     (0.173, 0.175, 0.195, 0.040)
		colorBeach     (0.199, 0.201, 0.220, 0.030)
		colorDesert    (0.225, 0.226, 0.250, 0.020)
		colorLowland   (0.251, 0.252, 0.275, 0.030)
		colorUpland    (0.276, 0.277, 0.301, 0.050)
		colorRock      (0.302, 0.303, 0.335, 0.020)
		colorSnow      (0.302, 0.303, 0.335, 1.000)
		BumpHeight      0.161758
		BumpOffset      0.0323517
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0545586
		GasToDust   0.25
		Particles   1090
		GasBright   0.158333
		DustBright  0.417475
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.41697
		Period          12.5253
		Eccentricity    0.944006
		Inclination     92.6101
		AscendingNode   -21.7545
		ArgOfPericenter 134.834
		MeanAnomaly     -10.149
	}
}

Comet	"C110"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.7721e-011
	Radius          3.89209
	InertiaMoment   0.39892

	Oblateness      0.00565557

	RotationPeriod  74.8102
	Obliquity       84.6091
	EqAscendNode    260.968

	AbsMagn         16.6055
	SlopeParam      2.93203
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.513 0.508 0.501)

	Surface
	{
		SurfStyle       0.403904
		OceanStyle      0.656878
		Randomize      (0.366, 0.920, 0.657)
		colorDistMagn   0.454689
		colorDistFreq   0.00604356
		detailScale     106.28
		colorConversion true
		snowLevel       2
		tropicLatitude  0.78099
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498473
		terraceProb     0.210959
		erosion         0
		montesMagn      0.342987
		montesFreq      3.63502
		montesSpiky     0.987278
		montesFraction  0.360578
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0354369
		hillsFraction   0.57164
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22625
		craterFreq      0.230426
		craterDensity   0.753694
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   144.959
		volcanoTemp     1431.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.203, 0.200, 0.000)
		colorShelf     (0.218, 0.216, 0.213, 0.000)
		colorBeach     (0.231, 0.229, 0.225, 0.000)
		colorDesert    (0.244, 0.241, 0.238, 0.000)
		colorLowland   (0.257, 0.254, 0.250, 0.000)
		colorUpland    (0.269, 0.267, 0.263, 0.000)
		colorRock      (0.282, 0.280, 0.275, 0.000)
		colorSnow      (0.295, 0.292, 0.288, 1.000)
		BumpHeight      3.50288
		BumpOffset      0.700577
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.53575
		GasToDust   0.25
		Particles   2062
		GasBright   0.0869437
		DustBright  0.173351
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.76545
		Period          7.81918
		Eccentricity    0.942277
		Inclination     117.467
		AscendingNode   -48.8555
		ArgOfPericenter 37.4283
		MeanAnomaly     -122.887
	}
}

Comet	"C111"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.37059e-007
	Radius          70.2398
	InertiaMoment   0.397273

	Oblateness      0.00455071

	RotationPeriod  72.4784
	Obliquity       37.8148
	EqAscendNode    245.546

	AbsMagn         3.37991
	SlopeParam      7.0949
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.773 0.769 0.766)

	Surface
	{
		SurfStyle       0.754134
		OceanStyle      0.681384
		Randomize      (-0.229, -0.454, -0.372)
		colorDistMagn   0.609324
		colorDistFreq   1.66428
		detailScale     1918.02
		colorConversion true
		snowLevel       2
		tropicLatitude  0.798986
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592369
		terraceProb     0.268855
		erosion         0
		montesMagn      0.292492
		montesFreq      2.28185
		montesSpiky     0.993076
		montesFraction  0.504777
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.3477
		hillsFraction   0.43548
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224799
		craterFreq      0.146925
		craterDensity   0.906196
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.7464
		volcanoTemp     1522.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.261, 0.215, 0.000)
		colorShelf     (0.309, 0.269, 0.245, 0.000)
		colorBeach     (0.363, 0.315, 0.291, 0.000)
		colorDesert    (0.394, 0.338, 0.284, 0.000)
		colorLowland   (0.433, 0.361, 0.322, 0.000)
		colorUpland    (0.479, 0.438, 0.391, 0.000)
		colorRock      (0.518, 0.477, 0.421, 0.000)
		colorSnow      (0.564, 0.508, 0.444, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.292748
		DustBright  0.452033
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.38016
		Period          5.40474
		Eccentricity    0.908951
		Inclination     -80.6358
		AscendingNode   38.5946
		ArgOfPericenter 156.242
		MeanAnomaly     -83.5215
	}
}

Comet	"C112"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            4.22016e-015
	Radius          0.241002
	InertiaMoment   0.399379

	Oblateness      0.00640605

	RotationPeriod  70.245
	Obliquity       351.021
	EqAscendNode    230.123

	AbsMagn         5.38014
	SlopeParam      5.28807
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.682 0.613 0.541)

	Surface
	{
		SurfStyle       0.249633
		OceanStyle      0.156879
		Randomize      (0.655, -0.731, 0.410)
		colorDistMagn   0.560902
		colorDistFreq   9.23613e-006
		detailScale     6.58097
		colorConversion true
		snowLevel       2
		tropicLatitude  0.957481
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.392059
		terraceProb     0.406284
		erosion         0
		montesMagn      0.523255
		montesFreq      2.93939
		montesSpiky     0.972978
		montesFraction  0.717118
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.01845e-005
		hillsFraction   0.717089
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.20394
		craterFreq      0.191232
		craterDensity   0.992293
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   581.652
		volcanoTemp     1793.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.245, 0.217, 0.000)
		colorShelf     (0.290, 0.261, 0.230, 0.000)
		colorBeach     (0.307, 0.276, 0.244, 0.000)
		colorDesert    (0.324, 0.291, 0.257, 0.000)
		colorLowland   (0.341, 0.307, 0.271, 0.000)
		colorUpland    (0.358, 0.322, 0.284, 0.000)
		colorRock      (0.375, 0.337, 0.298, 0.000)
		colorSnow      (0.392, 0.353, 0.311, 1.000)
		BumpHeight      0.216902
		BumpOffset      0.0433804
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.0873843
		GasToDust   0.25
		Particles   1156
		GasBright   0.194077
		DustBright  0.235191
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.19779
		Period          10.8607
		Eccentricity    0.950785
		Inclination     98.7694
		AscendingNode   -153.382
		ArgOfPericenter 31.2426
		MeanAnomaly     -58.212
	}
}

Comet	"C113"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            3.26399e-011
	Radius          4.35052
	InertiaMoment   0.39809

	Oblateness      0.00515989

	RotationPeriod  68.0942
	Obliquity       304.226
	EqAscendNode    214.701

	AbsMagn         6.86655
	SlopeParam      4.20755
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.580 0.573 0.568)

	Surface
	{
		SurfStyle       0.904221
		OceanStyle      0.220701
		Randomize      (-0.266, 0.088, 0.442)
		colorDistMagn   0.823021
		colorDistFreq   0.0110379
		detailScale     118.798
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997296
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.513743
		terraceProb     0.465488
		erosion         0
		montesMagn      0.616163
		montesFreq      3.93693
		montesSpiky     0.907054
		montesFraction  0.61285
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0616474
		hillsFraction   0.658834
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241725
		craterFreq      0.193104
		craterDensity   0.826724
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   119.391
		volcanoTemp     1313.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.197, 0.201, 0.227, 0.050)
		colorShelf     (0.232, 0.235, 0.261, 0.040)
		colorBeach     (0.267, 0.269, 0.295, 0.030)
		colorDesert    (0.302, 0.304, 0.335, 0.020)
		colorLowland   (0.336, 0.338, 0.369, 0.030)
		colorUpland    (0.371, 0.373, 0.403, 0.050)
		colorRock      (0.406, 0.407, 0.448, 0.020)
		colorSnow      (0.406, 0.407, 0.448, 1.000)
		BumpHeight      3.91546
		BumpOffset      0.783093
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.568576
		GasToDust   0.25
		Particles   2128
		GasBright   0.0101938
		DustBright  0.903561
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.10072
		Period          10.1492
		Eccentricity    0.912858
		Inclination     123.66
		AscendingNode   55.9604
		ArgOfPericenter 16.2095
		MeanAnomaly     -122.056
	}
}

Comet	"C114"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.52446e-007
	Radius          94.1597
	InertiaMoment   0.399807

	Oblateness      0.00724358

	RotationPeriod  66.0128
	Obliquity       257.432
	EqAscendNode    199.278

	AbsMagn         8.20718
	SlopeParam      3.1883
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.652 0.576 0.532)

	Surface
	{
		SurfStyle       0.655036
		OceanStyle      0.258203
		Randomize      (0.104, -0.955, -0.781)
		colorDistMagn   0.962262
		colorDistFreq   6.63929
		detailScale     2571.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999646
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.466258
		terraceProb     0.469958
		erosion         0
		montesMagn      0.592617
		montesFreq      3.5897
		montesSpiky     0.937177
		montesFraction  0.911366
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.5397
		hillsFraction   0.609214
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239266
		craterFreq      0.207416
		craterDensity   1.03205
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   29.3824
		volcanoTemp     1517.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.196, 0.149, 0.000)
		colorShelf     (0.261, 0.202, 0.170, 0.000)
		colorBeach     (0.307, 0.236, 0.202, 0.000)
		colorDesert    (0.333, 0.254, 0.197, 0.000)
		colorLowland   (0.365, 0.271, 0.223, 0.000)
		colorUpland    (0.405, 0.329, 0.271, 0.000)
		colorRock      (0.437, 0.357, 0.293, 0.000)
		colorSnow      (0.476, 0.380, 0.309, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0419972
		DustBright  0.556244
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.99698
		Period          9.40678
		Eccentricity    0.939165
		Inclination     15.1089
		AscendingNode   -21.5128
		ArgOfPericenter -79.3268
		MeanAnomaly     119.83
	}
}

Comet	"C115"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            7.77301e-015
	Radius          0.269461
	InertiaMoment   0.398672

	Oblateness      0.00584264

	RotationPeriod  63.99
	Obliquity       210.638
	EqAscendNode    183.855

	AbsMagn         9.57219
	SlopeParam      8.33352
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.486 0.390 0.358)

	Surface
	{
		SurfStyle       0.10134
		OceanStyle      0.860431
		Randomize      (-0.288, 0.618, -0.677)
		colorDistMagn   0.874395
		colorDistFreq   4.5356e-005
		detailScale     7.35809
		colorConversion true
		snowLevel       2
		tropicLatitude  0.75681
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.676101
		terraceProb     0.125138
		erosion         0
		montesMagn      0.439696
		montesFreq      4.28645
		montesSpiky     0.976849
		montesFraction  0.477931
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000140949
		hillsFraction   0.530318
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247238
		craterFreq      0.189945
		craterDensity   0.759858
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   479.19
		volcanoTemp     1415.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.156, 0.143, 0.000)
		colorShelf     (0.206, 0.166, 0.152, 0.000)
		colorBeach     (0.219, 0.175, 0.161, 0.000)
		colorDesert    (0.231, 0.185, 0.170, 0.000)
		colorLowland   (0.243, 0.195, 0.179, 0.000)
		colorUpland    (0.255, 0.205, 0.188, 0.000)
		colorRock      (0.267, 0.214, 0.197, 0.000)
		colorSnow      (0.279, 0.224, 0.206, 1.000)
		BumpHeight      0.242515
		BumpOffset      0.048503
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.12021
		GasToDust   0.25
		Particles   1222
		GasBright   0.0365415
		DustBright  0.246186
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.19681
		Period          10.8535
		Eccentricity    0.904578
		Inclination     -48.022
		AscendingNode   -78.0944
		ArgOfPericenter -139.986
		MeanAnomaly     -162.64
	}
}

Comet	"C116"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            6.01185e-011
	Radius          5.83061
	InertiaMoment   0.396612

	Oblateness      0.00808531

	RotationPeriod  62.0165
	Obliquity       163.843
	EqAscendNode    168.433

	AbsMagn         11.1576
	SlopeParam      5.58506
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.707 0.641 0.539)

	Surface
	{
		SurfStyle       0.994447
		OceanStyle      0.441651
		Randomize      (-0.356, 0.201, 0.555)
		colorDistMagn   0.190118
		colorDistFreq   0.0213332
		detailScale     159.214
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982129
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489248
		terraceProb     0.179323
		erosion         0
		montesMagn      0.580164
		montesFreq      2.30521
		montesSpiky     0.984243
		montesFraction  0.688231
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0511602
		hillsFraction   0.546954
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257055
		craterFreq      0.183914
		craterDensity   0.823446
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   117.901
		volcanoTemp     1608.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.224, 0.216, 0.050)
		colorShelf     (0.283, 0.263, 0.248, 0.040)
		colorBeach     (0.325, 0.301, 0.280, 0.030)
		colorDesert    (0.368, 0.340, 0.318, 0.020)
		colorLowland   (0.410, 0.378, 0.350, 0.030)
		colorUpland    (0.452, 0.416, 0.383, 0.050)
		colorRock      (0.495, 0.455, 0.426, 0.020)
		colorSnow      (0.495, 0.455, 0.426, 1.000)
		BumpHeight      5.24755
		BumpOffset      1.04951
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.601402
		GasToDust   0.25
		Particles   2194
		GasBright   0.14446
		DustBright  0.622754
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.35376
		Period          12.0371
		Eccentricity    0.969412
		Inclination     95.3314
		AscendingNode   110.928
		ArgOfPericenter 79.3494
		MeanAnomaly     119.788
	}
}

Comet	"C117"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            4.64974e-007
	Radius          105.305
	InertiaMoment   0.399158

	Oblateness      0.00662405

	RotationPeriod  60.0843
	Obliquity       117.049
	EqAscendNode    153.01

	AbsMagn         13.5477
	SlopeParam      4.44006
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.815 0.791 0.748)

	Surface
	{
		SurfStyle       0.0185415
		OceanStyle      0.0716531
		Randomize      (0.974, -0.541, 0.792)
		colorDistMagn   0.262
		colorDistFreq   7.385
		detailScale     2875.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.795244
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.641899
		terraceProb     0.111711
		erosion         0
		montesMagn      0.418524
		montesFreq      2.34658
		montesSpiky     0.982607
		montesFraction  0.52885
		dunesFraction   0
		hillsMagn       0
		hillsFreq       35.3976
		hillsFraction   0.613897
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23829
		craterFreq      0.459388
		craterDensity   1.05533
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   24.2126
		volcanoTemp     1431.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.326, 0.316, 0.299, 0.000)
		colorShelf     (0.346, 0.336, 0.318, 0.000)
		colorBeach     (0.367, 0.356, 0.336, 0.000)
		colorDesert    (0.387, 0.376, 0.355, 0.000)
		colorLowland   (0.407, 0.395, 0.374, 0.000)
		colorUpland    (0.428, 0.415, 0.393, 0.000)
		colorRock      (0.448, 0.435, 0.411, 0.000)
		colorSnow      (0.468, 0.455, 0.430, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.111722
		DustBright  0.339978
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.13343
		Period          10.3872
		Eccentricity    0.931721
		Inclination     143.205
		AscendingNode   -116.995
		ArgOfPericenter -153.158
		MeanAnomaly     -117.6
	}
}

Comet	"C118"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.43169e-014
	Radius          0.361051
	InertiaMoment   0.397734

	Oblateness      0.00919643

	RotationPeriod  58.1863
	Obliquity       70.2547
	EqAscendNode    137.588

	AbsMagn         1.67921
	SlopeParam      3.43186
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.537 0.533 0.529)

	Surface
	{
		SurfStyle       0.862253
		OceanStyle      0.900089
		Randomize      (0.386, -0.077, 0.077)
		colorDistMagn   0.584559
		colorDistFreq   0.000108557
		detailScale     9.85909
		colorConversion true
		snowLevel       2
		tropicLatitude  0.903434
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512335
		terraceProb     0.283439
		erosion         0
		montesMagn      0.436267
		montesFreq      2.86702
		montesSpiky     0.963759
		montesFraction  0.633106
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000331922
		hillsFraction   0.718949
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256576
		craterFreq      0.267602
		craterDensity   0.859282
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   473.096
		volcanoTemp     1386.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.186, 0.212, 0.050)
		colorShelf     (0.215, 0.218, 0.243, 0.040)
		colorBeach     (0.247, 0.250, 0.275, 0.030)
		colorDesert    (0.279, 0.282, 0.312, 0.020)
		colorLowland   (0.311, 0.314, 0.344, 0.030)
		colorUpland    (0.344, 0.346, 0.376, 0.050)
		colorRock      (0.376, 0.378, 0.418, 0.020)
		colorSnow      (0.376, 0.378, 0.418, 1.000)
		BumpHeight      0.324946
		BumpOffset      0.0649891
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.153036
		GasToDust   0.25
		Particles   1288
		GasBright   0.286831
		DustBright  0.649356
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.2054
		Period          10.9172
		Eccentricity    0.96536
		Inclination     16.3518
		AscendingNode   -113.239
		ArgOfPericenter -77.9644
		MeanAnomaly     -91.2847
	}
}

Comet	"C119"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.10731e-010
	Radius          6.52231
	InertiaMoment   0.399598

	Oblateness      0.00753546

	RotationPeriod  56.3162
	Obliquity       23.4604
	EqAscendNode    122.165

	AbsMagn         4.47713
	SlopeParam      2.23889
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.626 0.572 0.518)

	Surface
	{
		SurfStyle       0.967708
		OceanStyle      0.710708
		Randomize      (0.781, 0.241, -0.698)
		colorDistMagn   0.625737
		colorDistFreq   0.0334514
		detailScale     178.102
		colorConversion true
		snowLevel       2
		tropicLatitude  0.797059
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.424364
		terraceProb     0.239636
		erosion         0
		montesMagn      0.480896
		montesFreq      3.70795
		montesSpiky     0.849029
		montesFraction  0.143388
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.106696
		hillsFraction   0.662922
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265574
		craterFreq      0.238245
		craterDensity   0.989619
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   97.1791
		volcanoTemp     1568.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.200, 0.207, 0.050)
		colorShelf     (0.251, 0.235, 0.238, 0.040)
		colorBeach     (0.288, 0.269, 0.269, 0.030)
		colorDesert    (0.326, 0.303, 0.306, 0.020)
		colorLowland   (0.363, 0.337, 0.337, 0.030)
		colorUpland    (0.401, 0.372, 0.368, 0.050)
		colorRock      (0.438, 0.406, 0.409, 0.020)
		colorSnow      (0.438, 0.406, 0.409, 1.000)
		BumpHeight      5.87008
		BumpOffset      1.17402
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.634228
		GasToDust   0.25
		Particles   2261
		GasBright   0.226811
		DustBright  0.393863
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.69631
		Period          7.36439
		Eccentricity    0.969445
		Inclination     -74.4144
		AscendingNode   21.2377
		ArgOfPericenter -125.132
		MeanAnomaly     -108.683
	}
}

Comet	"C120"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            3.40948e-018
	Radius          0.0223576
	InertiaMoment   0.398402

	Oblateness      0.0104905

	RotationPeriod  54.4683
	Obliquity       336.666
	EqAscendNode    106.742

	AbsMagn         6.14529
	SlopeParam      5.92201
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.559 0.554 0.551)

	Surface
	{
		SurfStyle       0.894696
		OceanStyle      0.443658
		Randomize      (0.631, -0.523, 0.889)
		colorDistMagn   0.123474
		colorDistFreq   6.12975e-008
		detailScale     0.610513
		colorConversion true
		snowLevel       2
		tropicLatitude  0.877655
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.528989
		terraceProb     0.560994
		erosion         0
		montesMagn      0.46498
		montesFreq      2.19563
		montesSpiky     0.846813
		montesFraction  0.302876
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.33746e-006
		hillsFraction   0.59963
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218773
		craterFreq      0.214739
		craterDensity   0.762336
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1898.4
		volcanoTemp     1454.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.194, 0.220, 0.050)
		colorShelf     (0.224, 0.227, 0.253, 0.040)
		colorBeach     (0.257, 0.260, 0.287, 0.030)
		colorDesert    (0.291, 0.294, 0.325, 0.020)
		colorLowland   (0.324, 0.327, 0.358, 0.030)
		colorUpland    (0.358, 0.360, 0.391, 0.050)
		colorRock      (0.391, 0.393, 0.435, 0.020)
		colorSnow      (0.391, 0.393, 0.435, 1.000)
		BumpHeight      0.0201219
		BumpOffset      0.00402438
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.129532
		DustBright  0.175628
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.89661
		Period          8.70657
		Eccentricity    0.944096
		Inclination     -38.6433
		AscendingNode   -15.9054
		ArgOfPericenter -19.0403
		MeanAnomaly     64.4424
	}
}

Comet	"C121"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.63699e-014
	Radius          0.403971
	InertiaMoment   0.394675

	Oblateness      0.00844849

	RotationPeriod  52.6373
	Obliquity       289.872
	EqAscendNode    91.3198

	AbsMagn         7.53416
	SlopeParam      4.6787
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.701 0.698 0.696)

	Surface
	{
		SurfStyle       0.396374
		OceanStyle      0.0784544
		Randomize      (0.358, 0.534, -0.277)
		colorDistMagn   0.371431
		colorDistFreq   6.51813e-005
		detailScale     11.0311
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99961
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.575258
		terraceProb     0.31593
		erosion         0
		montesMagn      0.603069
		montesFreq      2.08093
		montesSpiky     0.96755
		montesFraction  0.438727
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000449052
		hillsFraction   0.780051
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262861
		craterFreq      0.155504
		craterDensity   0.83547
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   390.033
		volcanoTemp     1123.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.279, 0.278, 0.000)
		colorShelf     (0.298, 0.297, 0.296, 0.000)
		colorBeach     (0.315, 0.314, 0.313, 0.000)
		colorDesert    (0.333, 0.332, 0.331, 0.000)
		colorLowland   (0.350, 0.349, 0.348, 0.000)
		colorUpland    (0.368, 0.367, 0.365, 0.000)
		colorRock      (0.385, 0.384, 0.383, 0.000)
		colorSnow      (0.403, 0.401, 0.400, 1.000)
		BumpHeight      0.363574
		BumpOffset      0.0727148
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.185862
		GasToDust   0.25
		Particles   1355
		GasBright   0.381809
		DustBright  0.407838
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.86206
		Period          8.46975
		Eccentricity    0.921804
		Inclination     156.174
		AscendingNode   26.8739
		ArgOfPericenter -131.17
		MeanAnomaly     31.4579
	}
}

Comet	"C122"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.03952e-010
	Radius          8.73553
	InertiaMoment   0.398926

	Oblateness      0.0120406

	RotationPeriod  50.8182
	Obliquity       243.078
	EqAscendNode    75.8972

	AbsMagn         8.86751
	SlopeParam      3.66724
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.784 0.781 0.779)

	Surface
	{
		SurfStyle       0.850185
		OceanStyle      0.695156
		Randomize      (-0.042, 0.607, -0.422)
		colorDistMagn   0.552602
		colorDistFreq   0.0665427
		detailScale     238.538
		colorConversion true
		snowLevel       2
		tropicLatitude  0.760153
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.313567
		terraceProb     0.350822
		erosion         0
		montesMagn      0.565589
		montesFreq      2.47385
		montesSpiky     0.960674
		montesFraction  0.811041
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.110472
		hillsFraction   0.757091
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246093
		craterFreq      0.20069
		craterDensity   0.928227
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   95.9027
		volcanoTemp     1361.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.273, 0.312, 0.050)
		colorShelf     (0.314, 0.320, 0.358, 0.040)
		colorBeach     (0.361, 0.367, 0.405, 0.030)
		colorDesert    (0.408, 0.414, 0.460, 0.020)
		colorLowland   (0.455, 0.461, 0.507, 0.030)
		colorUpland    (0.502, 0.508, 0.553, 0.050)
		colorRock      (0.549, 0.555, 0.616, 0.020)
		colorSnow      (0.549, 0.555, 0.616, 1.000)
		BumpHeight      7.86198
		BumpOffset      1.5724
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.667054
		GasToDust   0.25
		Particles   2327
		GasBright   0.0201807
		DustBright  0.453953
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.64749
		Period          7.04879
		Eccentricity    0.917554
		Inclination     -99.492
		AscendingNode   -34.5384
		ArgOfPericenter -135.359
		MeanAnomaly     80.3381
	}
}

Comet	"C123"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            6.27985e-018
	Radius          0.0250206
	InertiaMoment   0.397286

	Oblateness      0.00982007

	RotationPeriod  49.0063
	Obliquity       196.283
	EqAscendNode    60.4746

	AbsMagn         10.3083
	SlopeParam      2.55524
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.420 0.414 0.408)

	Surface
	{
		SurfStyle       0.960371
		OceanStyle      0.301129
		Randomize      (0.396, 0.423, 0.896)
		colorDistMagn   0.750283
		colorDistFreq   1.43165e-007
		detailScale     0.683228
		colorConversion true
		snowLevel       2
		tropicLatitude  0.325224
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.4101
		terraceProb     0.108741
		erosion         0
		montesMagn      0.440651
		montesFreq      3.18918
		montesSpiky     0.945985
		montesFraction  0.462973
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.56866e-006
		hillsFraction   0.422956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.193311
		craterFreq      0.230727
		craterDensity   0.971387
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1565.41
		volcanoTemp     1498.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.143, 0.145, 0.163, 0.050)
		colorShelf     (0.168, 0.170, 0.188, 0.040)
		colorBeach     (0.193, 0.195, 0.212, 0.030)
		colorDesert    (0.219, 0.219, 0.241, 0.020)
		colorLowland   (0.244, 0.244, 0.265, 0.030)
		colorUpland    (0.269, 0.269, 0.290, 0.050)
		colorRock      (0.294, 0.294, 0.323, 0.020)
		colorSnow      (0.294, 0.294, 0.323, 1.000)
		BumpHeight      0.0225185
		BumpOffset      0.0045037
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.0974039
		DustBright  0.861216
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.52428
		Period          13.3686
		Eccentricity    0.944639
		Inclination     2.79036
		AscendingNode   -16.1305
		ArgOfPericenter -89.8884
		MeanAnomaly     -69.7196
	}
}

Comet	"C124"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            4.85701e-014
	Radius          0.54095
	InertiaMoment   0.399385

	Oblateness      0.0139434

	RotationPeriod  47.197
	Obliquity       149.489
	EqAscendNode    45.052

	AbsMagn         12.1501
	SlopeParam      6.32492
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.719 0.716 0.712)

	Surface
	{
		SurfStyle       0.302719
		OceanStyle      0.873082
		Randomize      (-0.553, 0.949, 0.263)
		colorDistMagn   0.996413
		colorDistFreq   0.000184564
		detailScale     14.7715
		colorConversion true
		snowLevel       2
		tropicLatitude  0.824031
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.67721
		terraceProb     0.656568
		erosion         0
		montesMagn      0.374872
		montesFreq      2.95931
		montesSpiky     0.880835
		montesFraction  0.332932
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000774104
		hillsFraction   0.767736
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245305
		craterFreq      0.215642
		craterDensity   0.757172
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   384.839
		volcanoTemp     1704.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.286, 0.285, 0.000)
		colorShelf     (0.306, 0.304, 0.303, 0.000)
		colorBeach     (0.324, 0.322, 0.320, 0.000)
		colorDesert    (0.342, 0.340, 0.338, 0.000)
		colorLowland   (0.360, 0.358, 0.356, 0.000)
		colorUpland    (0.378, 0.376, 0.374, 0.000)
		colorRock      (0.396, 0.394, 0.392, 0.000)
		colorSnow      (0.414, 0.412, 0.409, 1.000)
		BumpHeight      0.486855
		BumpOffset      0.097371
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.218688
		GasToDust   0.25
		Particles   1421
		GasBright   0.103317
		DustBright  0.539789
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.54627
		Period          6.40928
		Eccentricity    0.937635
		Inclination     -25.8543
		AscendingNode   19.4622
		ArgOfPericenter 19.2189
		MeanAnomaly     22.5764
	}
}

Comet	"C125"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            3.75654e-010
	Radius          9.77781
	InertiaMoment   0.398099

	Oblateness      0.0114578

	RotationPeriod  45.3856
	Obliquity       102.695
	EqAscendNode    29.6294

	AbsMagn         16.4298
	SlopeParam      4.92745
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.490 0.482 0.476)

	Surface
	{
		SurfStyle       0.989302
		OceanStyle      0.591532
		Randomize      (-0.073, -0.782, -0.355)
		colorDistMagn   0.266401
		colorDistFreq   0.0746817
		detailScale     266.999
		colorConversion true
		snowLevel       2
		tropicLatitude  0.784529
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.258874
		terraceProb     0.645575
		erosion         0
		montesMagn      0.540927
		montesFreq      2.93365
		montesSpiky     0.956144
		montesFraction  0.701098
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.224745
		hillsFraction   0.597235
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257654
		craterFreq      0.241231
		craterDensity   1.04128
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   79.0957
		volcanoTemp     1034.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.169, 0.190, 0.050)
		colorShelf     (0.196, 0.198, 0.219, 0.040)
		colorBeach     (0.226, 0.227, 0.247, 0.030)
		colorDesert    (0.255, 0.256, 0.281, 0.020)
		colorLowland   (0.284, 0.285, 0.309, 0.030)
		colorUpland    (0.314, 0.313, 0.338, 0.050)
		colorRock      (0.343, 0.342, 0.376, 0.020)
		colorSnow      (0.343, 0.342, 0.376, 1.000)
		BumpHeight      8.80002
		BumpOffset      1.76
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.69988
		GasToDust   0.25
		Particles   2393
		GasBright   0.0719719
		DustBright  0.255621
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.71658
		Period          7.49678
		Eccentricity    0.91666
		Inclination     128.471
		AscendingNode   7.7545
		ArgOfPericenter -150.685
		MeanAnomaly     118.867
	}
}

Comet	"C126"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.15667e-017
	Radius          0.0334988
	InertiaMoment   0.399812

	Oblateness      0.0163434

	RotationPeriod  43.5675
	Obliquity       55.9003
	EqAscendNode    14.2068

	AbsMagn         3.34426
	SlopeParam      3.89808
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.746 0.742 0.739)

	Surface
	{
		SurfStyle       0.386043
		OceanStyle      0.0389294
		Randomize      (0.457, 0.806, 0.559)
		colorDistMagn   0.302008
		colorDistFreq   3.71767e-007
		detailScale     0.91474
		colorConversion true
		snowLevel       2
		tropicLatitude  0.834335
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.259019
		terraceProb     0.212549
		erosion         0
		montesMagn      0.430706
		montesFreq      3.668
		montesSpiky     0.818294
		montesFraction  0.224718
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.59013e-006
		hillsFraction   0.692159
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237522
		craterFreq      0.233321
		craterDensity   0.922382
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1544.3
		volcanoTemp     1638.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.297, 0.296, 0.000)
		colorShelf     (0.317, 0.315, 0.314, 0.000)
		colorBeach     (0.336, 0.334, 0.332, 0.000)
		colorDesert    (0.354, 0.352, 0.351, 0.000)
		colorLowland   (0.373, 0.371, 0.369, 0.000)
		colorUpland    (0.392, 0.389, 0.388, 0.000)
		colorRock      (0.410, 0.408, 0.406, 0.000)
		colorSnow      (0.429, 0.427, 0.425, 1.000)
		BumpHeight      0.0301489
		BumpOffset      0.00602978
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.226363
		DustBright  0.585717
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.30445
		Period          11.6608
		Eccentricity    0.924546
		Inclination     178.491
		AscendingNode   114.904
		ArgOfPericenter 92.2795
		MeanAnomaly     139.902
	}
}

Comet	"C127"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            8.94598e-014
	Radius          0.605596
	InertiaMoment   0.398679

	Oblateness      0.0135456

	RotationPeriod  41.7381
	Obliquity       9.10604
	EqAscendNode    358.784

	AbsMagn         5.35754
	SlopeParam      2.83895
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.599 0.592 0.588)

	Surface
	{
		SurfStyle       0.272226
		OceanStyle      0.883826
		Randomize      (0.110, -0.228, 0.147)
		colorDistMagn   0.113476
		colorDistFreq   0.000300213
		detailScale     16.5368
		colorConversion true
		snowLevel       2
		tropicLatitude  0.773459
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448504
		terraceProb     0.355465
		erosion         0
		montesMagn      0.425293
		montesFreq      2.60003
		montesSpiky     0.985726
		montesFraction  0.879239
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000697884
		hillsFraction   0.486159
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245571
		craterFreq      0.267658
		craterDensity   0.994376
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   317.45
		volcanoTemp     1488.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.237, 0.235, 0.000)
		colorShelf     (0.254, 0.252, 0.250, 0.000)
		colorBeach     (0.269, 0.266, 0.265, 0.000)
		colorDesert    (0.284, 0.281, 0.279, 0.000)
		colorLowland   (0.299, 0.296, 0.294, 0.000)
		colorUpland    (0.314, 0.311, 0.309, 0.000)
		colorRock      (0.329, 0.326, 0.323, 0.000)
		colorSnow      (0.344, 0.340, 0.338, 1.000)
		BumpHeight      0.545037
		BumpOffset      0.109007
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.251514
		GasToDust   0.25
		Particles   1487
		GasBright   0.167735
		DustBright  0.328831
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.62267
		Period          14.1578
		Eccentricity    0.95176
		Inclination     138.422
		AscendingNode   176.025
		ArgOfPericenter -158.658
		MeanAnomaly     -12.0597
	}
}

Comet	"C128"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            6.91909e-010
	Radius          13.089
	InertiaMoment   0.396633

	Oblateness      0.0192088

	RotationPeriod  39.8924
	Obliquity       322.312
	EqAscendNode    343.362

	AbsMagn         6.84759
	SlopeParam      6.85423
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.449 0.446 0.443)

	Surface
	{
		SurfStyle       0.866987
		OceanStyle      0.11598
		Randomize      (0.204, 0.420, 0.690)
		colorDistMagn   0.151794
		colorDistFreq   0.129253
		detailScale     357.416
		colorConversion true
		snowLevel       2
		tropicLatitude  0.935592
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.676686
		terraceProb     0.195653
		erosion         0
		montesMagn      0.47778
		montesFreq      2.70295
		montesSpiky     0.926623
		montesFraction  0.53233
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.495285
		hillsFraction   0.839679
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241931
		craterFreq      0.209727
		craterDensity   0.803402
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   78.0166
		volcanoTemp     1352.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.153, 0.156, 0.177, 0.050)
		colorShelf     (0.180, 0.183, 0.204, 0.040)
		colorBeach     (0.207, 0.210, 0.231, 0.030)
		colorDesert    (0.233, 0.236, 0.262, 0.020)
		colorLowland   (0.260, 0.263, 0.288, 0.030)
		colorUpland    (0.287, 0.290, 0.315, 0.050)
		colorRock      (0.314, 0.317, 0.350, 0.020)
		colorSnow      (0.314, 0.317, 0.350, 1.000)
		BumpHeight      11.7801
		BumpOffset      2.35601
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.732706
		GasToDust   0.25
		Particles   2460
		GasBright   0.389316
		DustBright  0.591737
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.35136
		Period          5.23644
		Eccentricity    0.876713
		Inclination     73.8503
		AscendingNode   167.443
		ArgOfPericenter 19.1859
		MeanAnomaly     -134.103
	}
}

Comet	"C129"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            2.13044e-017
	Radius          0.0375079
	InertiaMoment   0.399164

	Oblateness      0.0163115

	RotationPeriod  38.0251
	Obliquity       275.517
	EqAscendNode    327.939

	AbsMagn         8.18895
	SlopeParam      5.1915
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.774 0.773 0.772)

	Surface
	{
		SurfStyle       0.302834
		OceanStyle      0.590115
		Randomize      (0.574, 0.197, -0.986)
		colorDistMagn   0.474834
		colorDistFreq   5.60087e-007
		detailScale     1.02422
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971938
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.534932
		terraceProb     0.3354
		erosion         0
		montesMagn      0.632796
		montesFreq      2.72503
		montesSpiky     0.77762
		montesFraction  0.470784
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.57966e-006
		hillsFraction   0.671952
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249707
		craterFreq      0.252167
		craterDensity   0.880029
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1274.07
		volcanoTemp     1451.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.309, 0.309, 0.000)
		colorShelf     (0.329, 0.329, 0.328, 0.000)
		colorBeach     (0.348, 0.348, 0.347, 0.000)
		colorDesert    (0.368, 0.367, 0.367, 0.000)
		colorLowland   (0.387, 0.387, 0.386, 0.000)
		colorUpland    (0.407, 0.406, 0.405, 0.000)
		colorRock      (0.426, 0.425, 0.425, 0.000)
		colorSnow      (0.445, 0.445, 0.444, 1.000)
		BumpHeight      0.0337571
		BumpOffset      0.00675142
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

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
		GasBright   0.303406
		DustBright  0.362133
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.24295
		Period          11.1972
		Eccentricity    0.919601
		Inclination     9.47467
		AscendingNode   31.0311
		ArgOfPericenter 2.97323
		MeanAnomaly     176.382
	}
}

Comet	"C130"
{
	ParentBody     "CN Leo"
	Class	       "Asteroid"

	Mass            1.64774e-013
	Radius          0.810561
	InertiaMoment   0.397744

	Oblateness      0.02345

	RotationPeriod  36.1305
	Obliquity       228.723
	EqAscendNode    312.516

	AbsMagn         9.55255
	SlopeParam      4.12757
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.620 0.474 0.361)

	Surface
	{
		SurfStyle       0.23755
		OceanStyle      0.831574
		Randomize      (-0.193, 0.202, 0.915)
		colorDistMagn   0.640064
		colorDistFreq   0.000380518
		detailScale     22.1337
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997413
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.447911
		terraceProb     0.171835
		erosion         0
		montesMagn      0.428391
		montesFreq      3.22051
		montesSpiky     0.99001
		montesFraction  0.721813
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00160624
		hillsFraction   0.772144
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214575
		craterFreq      0.212325
		craterDensity   0.974776
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   313.074
		volcanoTemp     1483.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.190, 0.144, 0.000)
		colorShelf     (0.263, 0.202, 0.153, 0.000)
		colorBeach     (0.279, 0.213, 0.162, 0.000)
		colorDesert    (0.294, 0.225, 0.171, 0.000)
		colorLowland   (0.310, 0.237, 0.180, 0.000)
		colorUpland    (0.325, 0.249, 0.189, 0.000)
		colorRock      (0.341, 0.261, 0.198, 0.000)
		colorSnow      (0.356, 0.273, 0.207, 1.000)
		BumpHeight      0.729505
		BumpOffset      0.145901
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.28434
		GasToDust   0.25
		Particles   1554
		GasBright   0.00522423
		DustBright  0.344802
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.15376
		Period          4.13096
		Eccentricity    0.922485
		Inclination     -44.6834
		AscendingNode   138.725
		ArgOfPericenter -128.096
		MeanAnomaly     173.744
	}
}

