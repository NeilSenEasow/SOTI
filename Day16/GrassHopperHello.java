package Day16;

import java.util.Random;
// import static org.junit.Assert.assertEquals;
// import org.junit.Test;

public class GrassHopperHello {
    public static String sayHello(String name) {
       return "Hello, "+name;
    }
}

class GrassHopperTest {
    @Test
    public void test1() {
        assertEquals("Hello, Mr. Spock",
        GrassHopperHello.sayHello("Mr. Spock"));
    }
    @Test
    public void test2() {
        assertEquals("Hello, Captain Kirk",
        GrassHopperHello.sayHello("Captain Kirk"));
    }
    private void assertEquals(String string, Object sayHello) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }
    @Test
    public void test3() {
        assertEquals("Hello, Liutenant Uhura",
        GrassHopperHello.sayHello("Liutenant Uhura"));
    }
    @Test
    public void test4() {
        assertEquals("Hello, Dr. McCoy",
        GrassHopperHello.sayHello("Dr. McCoy"));
    }
}
