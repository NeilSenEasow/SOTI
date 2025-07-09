public class Solution {
    public int solve(int[] A) {
        int largest = A[0];
        int smallest = A[0];
        
        for (int i = 1; i < A.length; i++) {
            if (A[i] > largest) {
                largest = A[i];
            }
            if (A[i] < smallest) {
                smallest = A[i];
            }
        }
        return largest + smallest;
    }
}
