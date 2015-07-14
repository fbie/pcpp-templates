// -*- c-basic-offset: 2; indent-tabs-mode: nil -*-

public interface AbstractFactorCounter {

  // Count the factors of a number p.
  public static int countFactors(int p) {
    if (p < 2)
      return 0;
    int factorCount = 1, k = 2;
    while (p >= k * k) {
      if (p % k == 0) {
        factorCount++;
        p /= k;
      } else
        k++;
    }
    return factorCount;
  }

  public static int test(AbstractFactorCounter fc) {
    fc.startCounting();
    return fc.getCount();
  }

  // Start to count factors.
  void startCounting();

  // Get the current factor count.
  int getCount();
}
