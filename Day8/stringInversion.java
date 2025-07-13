public class Solution {
    public String solve(String A) {
        StringBuilder result = new StringBuilder(A);

        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            if (Character.isUpperCase(c)) {
                result.setCharAt(i, Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.setCharAt(i, Character.toUpperCase(c));
            }
        }

        return result.toString();
    }
}
