public class Solution {
    public int solve(String A) {
        String[] words = A.split(" "); 
        int count = 0;

        for (String word : words) {
            int i = 0;
            int j = word.length() - 1;
            boolean isPalindrome = true;

            while (i < j) {
                if (word.charAt(i) != word.charAt(j)) {
                    isPalindrome = false;
                    break;
                }
                i++;
                j--;
            }

            if (isPalindrome && word.length() > 0) {
                count++;
            }
        }

        return count;
    }
}
