public class Solution {
    public int solve(String A) {
        int n = A.length();
        int[] freq = new int[26]; // only need 26 for lowercase letters

        // Count frequency of each character
        for (int i = 0; i < n; i++) {
            freq[A.charAt(i) - 'a']++;
        }

        int oddCount = 0;

        // Count characters that have odd frequencies
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
            }
        }

        // A string can be rearranged into a palindrome if oddCount <= 1
        return (oddCount <= 1) ? 1 : 0;
    }
}
