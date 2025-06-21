public class Solution {
    public int maxSubArray(final List<Integer> A) {
        int maxEndingHere = A.get(0);
        int maxSoFar = A.get(0);
        for (int i = 1; i < A.size(); i++) {
                maxEndingHere = Math.max(A.get(i), maxEndingHere + A.get(i));
                maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}