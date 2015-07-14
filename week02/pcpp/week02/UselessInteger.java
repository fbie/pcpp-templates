// -*- c-basic-offset: 2; indent-tabs-mode: nil -*-
package pcpp.week02;

public class UselessInteger implements AbstractInteger {

  private int val;

  public UselessInteger() {
    val = 0;
  }

  @Override
  public int addAndGet(int k) {
    return val += k;
  }

  @Override
  public int get() {
    return val;
  }

  @Override
  public void set(int k) {
    val = k;
  }
}
