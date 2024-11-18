package edu.grinnell.csc207.util;

/**
 * Counters that you can decrement.
 */
public class DecrementableCounter extends BasicCounter {
  /**
   * Create a new decrementable counter.
   *
   * @param start
   *   The initial value of the counter.
   */
  public DecrementableCounter(int start) {
    super(start);
  } // DecrementableCounter(int)

  /**
   * Decrement the counter by 1.
   */
  public void decrement() {
    count--; // Subtract 1 from the count
  } // Decrement
} // class DecrementableCounter