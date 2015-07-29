// -*- c-basic-offset: 4; indent-tabs-mode: nil -*-
package pcpp.week01;

public class LongCounter {
  private long count = 0;
  public synchronized void increment() {
    count = count + 1;
  }
  public synchronized long get() {
    return count;
  }
}
