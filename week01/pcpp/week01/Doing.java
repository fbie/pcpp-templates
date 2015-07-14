// -*- c-basic-offset: 2; indent-tabs-mode: nil -*-

public class Doing {

  public static void doTwice(Runnable r) {
    r.run();
    r.run();
  }

  public static void doNTimes(int n, Runnable r) {
    throw new RuntimeException("TODO: Implement!");
  }

  public static String write14Times(String s) {
    throw new RuntimeException("TODO: Implement!");
  }
}
