# benchmark

##Enums

These benchmarks compare switching on enum based on switch statement,HashMap#get and EnumMap#get.
Benchmarks use 3 enums
* SmallEnum - 10 items, 2 letter names
* BigEnum - 400 items,2 letter names
* LongNamesEnum - 400 items,100 letter names


### Run complete. Total time: 00:11:58

Benchmark                                 (enumConstantIndex)   Mode  Cnt    Score    Error   Units
BigEnumBenchmark.enumEnumMapLookup                          0  thrpt  200  577,335 ± 31,905  ops/us
BigEnumBenchmark.enumEnumMapLookup                        200  thrpt  200  737,989 ± 31,531  ops/us
BigEnumBenchmark.enumEnumMapLookup                        399  thrpt  200  711,679 ± 33,396  ops/us
BigEnumBenchmark.enumHashMapLookup                          0  thrpt  200  531,082 ± 17,535  ops/us
BigEnumBenchmark.enumHashMapLookup                        200  thrpt  200  518,935 ± 19,470  ops/us
BigEnumBenchmark.enumHashMapLookup                        399  thrpt  200  447,635 ± 20,910  ops/us
BigEnumBenchmark.enumSwitch                                 0  thrpt  200  580,256 ± 25,217  ops/us
BigEnumBenchmark.enumSwitch                               200  thrpt  200  569,434 ± 21,448  ops/us
BigEnumBenchmark.enumSwitch                               399  thrpt  200  521,560 ± 27,748  ops/us

LongNamesEnumBenchmark.enumEnumMapLookup                    0  thrpt  200  670,613 ± 41,131  ops/us
LongNamesEnumBenchmark.enumEnumMapLookup                  200  thrpt  200  750,033 ± 26,163  ops/us
LongNamesEnumBenchmark.enumEnumMapLookup                  399  thrpt  200  746,359 ± 32,053  ops/us
LongNamesEnumBenchmark.enumHashMapLookup                    0  thrpt  200  515,996 ± 17,164  ops/us
LongNamesEnumBenchmark.enumHashMapLookup                  200  thrpt  200  514,283 ± 18,298  ops/us
LongNamesEnumBenchmark.enumHashMapLookup                  399  thrpt  200  522,851 ± 18,363  ops/us
LongNamesEnumBenchmark.enumSwitch                           0  thrpt  200  595,455 ± 18,984  ops/us
LongNamesEnumBenchmark.enumSwitch                         200  thrpt  200  590,794 ± 20,777  ops/us
LongNamesEnumBenchmark.enumSwitch                         399  thrpt  200  597,855 ± 23,285  ops/us

SmallEnumBenchmark.enumEnumMapLookup                        0  thrpt  200  756,714 ± 28,788  ops/us
SmallEnumBenchmark.enumEnumMapLookup                        4  thrpt  200  783,142 ± 24,472  ops/us
SmallEnumBenchmark.enumEnumMapLookup                        9  thrpt  200  778,195 ± 26,009  ops/us
SmallEnumBenchmark.enumHashMapLookup                        0  thrpt  200  510,586 ± 15,805  ops/us
SmallEnumBenchmark.enumHashMapLookup                        4  thrpt  200  465,022 ± 14,872  ops/us
SmallEnumBenchmark.enumHashMapLookup                        9  thrpt  200  526,378 ± 17,149  ops/us
SmallEnumBenchmark.enumSwitch                               0  thrpt  200  747,351 ± 22,453  ops/us
SmallEnumBenchmark.enumSwitch                               4  thrpt  200  732,764 ± 21,175  ops/us
SmallEnumBenchmark.enumSwitch                               9  thrpt  200  730,821 ± 25,498  ops/us

