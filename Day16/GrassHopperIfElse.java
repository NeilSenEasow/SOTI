package Day16;

public class GrassHopperIfElse {
    public static boolean checkAlive(int health) {
      if(health<=0)  return false;
      else  return true;
  }
}

class GrassHopperIfElseTest {
    public void test1() {
        assertEquals(false,
        GrassHopperIfElse.checkAlive(0));
    }
    public void test2() {
        assertEquals(false,
        GrassHopperIfElse.checkAlive(-5));
    }
    private void assertEquals(boolean expected, boolean actual) {
        if (expected != actual) {
            throw new AssertionError("Expected: " + expected + " but was: " + actual);
        }
    }
    public void test3() {
        assertEquals(true,
        GrassHopperIfElse.checkAlive(5));
    }
}
