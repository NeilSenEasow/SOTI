public class Solution {
    static final int MOD = 1000000007;

    public int solve(String A) {
        int n = A.length();
        long result = 0;

        int totalVowels = 0;
        for (int i = 0; i < n; i++) {
            if (isVowel(A.charAt(i))) {
                totalVowels++;
            }
        }
        int totalConsonants = n - totalVowels;

        int remainingVowels = totalVowels;
        int remainingConsonants = totalConsonants;

        for (int i = 0; i < n; i++) {
            char c = A.charAt(i);
            if (isVowel(c)) {
                remainingVowels--;
                result += remainingConsonants; 
            } else {
                remainingConsonants--;
                result += remainingVowels;
            }
            result %= MOD;
        }

        return (int) result;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
