public class Solution {
    public int solve(String A, int B) {
        int maxA = 0;
        int n = A.length();

        for (int i = 0; i < n; i += B) {
            int end = Math.min(i + B, n); // handle last substring
            String sub = A.substring(i, end);

            int countA = 0;
            for (int j = 0; j < sub.length(); j++) {
                if (sub.charAt(j) == 'a') {
                    countA++;
                }
            }

            maxA = Math.max(maxA, countA);
        }

        return maxA;
    }
}