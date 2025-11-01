package Day16;

// import static org.junit.Assert.*;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
      
        String snew = "";
        int n = repeat;
        String s = string;
      
        for(int i=0 ; i<n ; i++)  {
            snew+=s;
        }
      
        return snew;
    }
}

class StringRepeatTest {
    @Test public void test4a() {
        assertEquals("aaaa", StringRepeat.repeatStr(4, "a"));
    }
    private void assertEquals(String string, String repeatStr) {
        if (!string.equals(repeatStr)) {
            throw new AssertionError("Expected: " + string + ", but was: " + repeatStr);
        }
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", StringRepeat.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", StringRepeat.repeatStr(5, ""));
    }
    @Test public void test0kata() {
        assertEquals("", StringRepeat.repeatStr(0, "kata"));
    }
    @Test public void test0empty() {
        assertEquals("", StringRepeat.repeatStr(0, ""));
    }
    @Test public void test6I() {
        assertEquals("IIIIII", StringRepeat.repeatStr(6, "I"));
    }
    @Test public void test5Hello() {
        assertEquals("HelloHelloHelloHelloHello", StringRepeat.repeatStr(5, "Hello"));
    }
}