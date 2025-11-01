package Day16;

public class FirstNonConsecutive {
    static Integer find(final int[] array) {
        int flag = 0;
        int value = 0;
        for(int i=1 ; i<=(array.length)-1 ; i++) {
            if(array[i]-array[i-1] != 1)  {
                value = array[i];
                flag = 1;
                break;
            }
        }
        if(flag == 1) {
            return value;
        }else{
            return null;
        }
    }
}

public class FirstNonConsecutiveTest {
    public void test1() {
        assertEquals((Integer)6,
        FirstNonConsecutive.find(new int[] {1,2,3,4,6,7,8}));
    }
    public void test2() {
        assertEquals(null,
        FirstNonConsecutive.find(new int[] {1,2,3,4,5,6,7,8}));
    }
    private void assertEquals(Integer expected, Integer actual) {
        if ((expected == null && actual != null) || (expected != null && !expected.equals(actual))) {
            throw new AssertionError("Expected: " + expected + " but was: " + actual);
        }
    }
}
