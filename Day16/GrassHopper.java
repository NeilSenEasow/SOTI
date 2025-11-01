package Day16;

import java.util.Random;
// import static org.junit.Assert.assertEquals;
// import org.junit.Test;

public class GrassHopper {
    public static int summation(int n) {
        
        int num = n;
        int sum = 0;
      
        for(int i=0 ; i<n ; i++)  {
            sum+=num;
            num--;
        }
      
        return sum;
    }
}

class GrassHopperTest {
    public void test1() {
        assertEquals(1,
        GrassHopper.summation(1));
    }
    public void test2() {
        assertEquals(36,
        GrassHopper.summation(8));
    }
    private void assertEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Expected: " + expected + " but was: " + actual);
        }
    }
}