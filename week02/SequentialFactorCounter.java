// -*- c-basic-offset: 2; indent-tabs-mode: nil -*-

// An example implementation of a sequential factor counter.
public class SequentialFactorCounter implements AbstractFactorCounter {

  private AbstractInteger count;

  public SequentialFactorCounter(AbstractInteger count) {
    if (count.get() != 0)
      throw new IllegalArgumentException("count must be 0!");
    this.count = count;
  }

  @Override
  public void startCounting() {
    for (int i = 0; i <= 4_999_999; ++i)
      count.addAndGet(AbstractFactorCounter.countFactors(i));
  }

  @Override
  public int getCount() {
    return count.get();
  }

  public static void main(String[] args) {
    int result = AbstractFactorCounter.test(new SequentialFactorCounter(new UselessInteger()));
    System.out.println(result);
  }

}
