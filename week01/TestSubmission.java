// -*- c-basic-offset: 2; indent-tabs-mode: nil -*-

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.concurrent.atomic.AtomicInteger;

public class TestSubmission {

  @Test
  public void testDoNTimes() {
    final AtomicInteger i = new AtomicInteger();
    Doing.doNTimes(177, () -> i.incrementAndGet());
    assertEquals(177, i.get());
  }


  @Test
  public void testWrite14Times() {
    assertEquals("ssssssssssssss", Doing.write14Times("s"));
  }

}
