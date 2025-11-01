package Day16;

public class AreaOrPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        if(l==w) {
            return l*l;
        }else{
            return 2*(l+w);
        }
    }
}

class AreaOrPerimeterTest {
    public void test1() {
        assertEquals(16,
        AreaOrPerimeter.areaOrPerimeter(4, 4));
    }
    public void test2() {
        assertEquals(14,
        AreaOrPerimeter.areaOrPerimeter(6, 10));
    }
    private void assertEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Expected: " + expected + " but was: " + actual);
        }
    }
}