public class Solution {
    public String longestCommonPrefix(String[] A) {
        if (A == null || A.length == 0) {
            return ""; // Handle edge case: empty or null array
        }
        
        // Start with the first string as the initial common prefix
        String prefix = A[0];
        
        // Iterate through the rest of the strings in the array
        for (int i = 1; i < A.length; i++) {
            // Keep shortening the prefix until it is a prefix of the current string
            // The indexOf() method returns 0 if the string starts with the prefix.
            while (A[i].indexOf(prefix) != 0) {
                // Shorten the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes an empty string, there's no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}