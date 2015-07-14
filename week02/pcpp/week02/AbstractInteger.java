// -*- c-basic-offset: 2; indent-tabs-mode: nil -*-
package pcpp.week02;

// Defines a class that holds an integer
public interface AbstractInteger {

  /**
   * Add k to the current value and return the new value.
   * @param k The value to add.
   * @return The new value.
   */
  int addAndGet(int k);

  /**
   * @return The current value.
   */
  int get();

  /**
   * Set the current value to k.
   * @param k The new value.
   */
  void set(int k);
}
