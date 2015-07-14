// -*- c-basic-offset: 2; indent-tabs-mode: nil -*-

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TestSubmission {

  public static final int THREADS = 500;
  public static final int REPEAT = 1000;
  public static final int COUNT = 18703729;

  @Test
  public void testMutableInteger() {
    // final AbstractInteger i = new UselessInteger();
    final AbstractInteger i = new MutableInteger();
    CyclicBarrier b = new CyclicBarrier(THREADS + 1);
    for (int t = 0; t < THREADS; ++t) {
      new Thread(() -> {
          try { b.await(); } catch (InterruptedException | BrokenBarrierException ignored) {}
          for (int j = 0; j < REPEAT; ++j)
            i.addAndGet(1);
      }).start();
    }
    try { b.await(); } catch (InterruptedException | BrokenBarrierException ignored) {}
    assertEquals(THREADS * REPEAT, i.get());
  }

  @Test
  public void testParallelFactorCounter() {
    // AbstractFactorCounter fc = new SequentialFactorCounter(new UselessInteger());
    AbstractFactorCounter fc = new ParallelFactorCounter(new MutableInteger());
    fc.startCounting();
    assertEquals(COUNT, fc.getCount());
  }

}
