public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        int[] evenPrefix = new int[n];
        int[] oddPrefix = new int[n];
        
        // Step 1: Build prefix sums
        evenPrefix[0] = A.get(0);
        oddPrefix[0] = 0;
        
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                evenPrefix[i] = evenPrefix[i - 1] + A.get(i);
                oddPrefix[i] = oddPrefix[i - 1];
            } else {
                evenPrefix[i] = evenPrefix[i - 1];
                oddPrefix[i] = oddPrefix[i - 1] + A.get(i);
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            // total even and odd sum before index i
            int evenLeft = (i > 0) ? evenPrefix[i - 1] : 0;
            int oddLeft = (i > 0) ? oddPrefix[i - 1] : 0;

            // total even and odd sum after index i
            int evenRight = evenPrefix[n - 1] - evenPrefix[i];
            int oddRight = oddPrefix[n - 1] - oddPrefix[i];

            // after removing A[i], the indices after i shift
            int totalEven = evenLeft + oddRight;
            int totalOdd = oddLeft + evenRight;

            if (totalEven == totalOdd) {
                count++;
            }
        }

        return count;
    }
}
