public class Solution {
    public int solve(String A) {
        int l = 0, r = A.length() - 1;

        while (l < r) {
            if (A.charAt(l) == A.charAt(r)) {
                l++;
                r--;
            } else {
                // try removing either left or right char
                if (isPalindrome(A, l + 1, r) || isPalindrome(A, l, r - 1)) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
        // reached here means already palindrome, removing one char still works
        return 1;
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
