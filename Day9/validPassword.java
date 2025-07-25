public class Solution {
    public int solve(String A) {
        int n = A.length();
        
        // Length check
        if (n < 8 || n > 15) {
            return 0;
        }

        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;

        String specialChars = "@#%&!$*";

        for (int i = 0; i < n; i++) {
            char ch = A.charAt(i);

            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (specialChars.indexOf(ch) != -1) {
                hasSpecial = true;
            }
        }

        if (hasDigit && hasLower && hasUpper && hasSpecial) {
            return 1; // valid password
        } else {
            return 0; // invalid
        }
    }
}