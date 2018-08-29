package org.deer.benchmark.cases.enums;

import static org.deer.benchmark.enums.SmallEnum.A;
import static org.deer.benchmark.enums.SmallEnum.B;
import static org.deer.benchmark.enums.SmallEnum.C;
import static org.deer.benchmark.enums.SmallEnum.D;
import static org.deer.benchmark.enums.SmallEnum.E;
import static org.deer.benchmark.enums.SmallEnum.F;
import static org.deer.benchmark.enums.SmallEnum.G;
import static org.deer.benchmark.enums.SmallEnum.H;
import static org.deer.benchmark.enums.SmallEnum.I;
import static org.deer.benchmark.enums.SmallEnum.J;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.deer.benchmark.enums.SmallEnum;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

@Fork(1)
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Benchmark)
@Warmup(iterations = 100, time = 50, timeUnit = TimeUnit.MILLISECONDS)
@Threads(Threads.MAX)
@Measurement(iterations = 200, time = 50, timeUnit = TimeUnit.MILLISECONDS)
public class SmallEnumBenchmark {

  @Param({"0", "4", "9"})
  private int enumConstantIndex;

  private SmallEnum current;
  private EnumMap<SmallEnum, SmallEnum> enumMap;
  private HashMap<SmallEnum, SmallEnum> hashMap;

  @Setup
  public void init() {
    current = SmallEnum.values()[enumConstantIndex];
    enumMap = new EnumMap<>(SmallEnum.class);
    hashMap = new HashMap<>(SmallEnum.values().length);
    for (SmallEnum enumConstant : SmallEnum.values()) {
      enumMap.put(enumConstant, enumConstant);
      hashMap.put(enumConstant, enumConstant);
    }
  }

  @Benchmark
  public void enumEnumMapLookup(Blackhole blackhole) {
    blackhole.consume(enumMap.get(current));
  }


  @Benchmark
  public void enumHashMapLookup(Blackhole blackhole) {
    blackhole.consume(hashMap.get(current));
  }

  @Benchmark
  public void enumSwitch(Blackhole blackhole) {
    switch (current) {
      case A:
        blackhole.consume(A);
        break;
      case B:
        blackhole.consume(B);
        break;
      case C:
        blackhole.consume(C);
        break;
      case D:
        blackhole.consume(D);
        break;
      case E:
        blackhole.consume(E);
        break;
      case F:
        blackhole.consume(F);
        break;
      case G:
        blackhole.consume(G);
        break;
      case H:
        blackhole.consume(H);
        break;
      case I:
        blackhole.consume(I);
        break;
      case J:
        blackhole.consume(J);
        break;
    }
  }
}
