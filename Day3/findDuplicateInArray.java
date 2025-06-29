public class Solution {
    public int repeatedNumber(final int[] A) {
        int slow = A[0];
        int fast = A[0];
        do {
            slow = A[slow];
            fast = A[A[fast]];
        } while (slow != fast);
        fast = A[0];
        while (slow != fast) {
            slow = A[slow];
            fast = A[fast];
        }
        return slow;
    }
}
