import java.util.*;

public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);  // Sort the array
        int n = A.length;

        for (int i = 0; i < n - 1; i++) {
            // Skip duplicates
            if (A[i] == A[i + 1]) continue;

            int countGreater = n - i - 1;

            if (A[i] == countGreater) {
                return 1;
            }
        }

        // Special case: last element is 0
        if (A[n - 1] == 0) return 1;

        return -1;
    }
}
