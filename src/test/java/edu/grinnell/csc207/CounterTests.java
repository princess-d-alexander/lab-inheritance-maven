package edu.grinnell.csc207;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.grinnell.csc207.util.BasicCounter;
import edu.grinnell.csc207.util.Counter;
import edu.grinnell.csc207.util.NamedCounter;
import edu.grinnell.csc207.util.Tally;

/**
 * Tests of our counter class.
 *
 * @author Samuel A. Rebelsky
 * @author Princess Alexander
 */
public class CounterTests {
  /**
   * Some basic tests of our BasicCounter objects.
   */
  @Test
  public void test1() throws Exception {
    // Counter alpha = new BasicCounter(0);
    Counter alpha = new NamedCounter("alfa", 0);
    Counter beta = new BasicCounter(123);
    Counter gamma = new BasicCounter(-5);
    assertEquals(0, alpha.get(), "original alpha");
    assertEquals(123, beta.get(), "original beta");
    assertEquals(-5, gamma.get(), "original gamma");
    for (int i = 0; i < 10; i++) {
      alpha.increment();
      beta.increment();
      gamma.increment();
    } // for
    assertEquals(10, alpha.get(), "updated alpha");
    assertEquals(133, beta.get(), "updated beta");
    assertEquals(5, gamma.get(), "updated gamma");
    alpha.reset();
    beta.reset();
    gamma.reset();
    assertEquals(0, alpha.get(), "reset alpha");
    assertEquals(123, beta.get(), "reset beta");
    assertEquals(-5, gamma.get(), "reset gamma");
  } // test1()

  /**
   * Tests to check to see if Tally is implemented correctly and extends
   * the Basic Counter Class
   */
  @Test
  public void testTallyInheritance() throws Exception {
    Counter alpha = new Tally(0);
    assertEquals(0, alpha.get(), "original alpha");
    alpha.increment();
    assertEquals(1, alpha.get(), "incremented alpha");
    alpha.reset();
    assertEquals(0, alpha.get(), "reset alpha");
}
} // class CounterTests
