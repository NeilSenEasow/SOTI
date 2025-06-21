public class Solution {
    public int[] solve(int[] A) {
        int n = A.length;
        int[] finalArray = new int[n];
        int index = 0;

        // Add positive non-zero elements in order
        for (int i = 0; i < n; i++) {
            if (A[i] > 0) {
                finalArray[index++] = A[i];
            }
        }

        // Remaining elements are already 0 by default in Java arrays
        return finalArray;
    }
}
