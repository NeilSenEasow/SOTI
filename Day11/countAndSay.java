public class Solution {
    public String countAndSay(int A) {

        String result = "1";
    
        for (int i = 2; i <= A; i++) {
            StringBuilder nextTerm = new StringBuilder();
            
            int pointer = 0;

            while (pointer < result.length()) {
                char currentChar = result.charAt(pointer);
                
                int count = 1;

                while (pointer + 1 < result.length() && result.charAt(pointer + 1) == currentChar) {
                    count++;
                    pointer++;
                }

                nextTerm.append(count);
                nextTerm.append(currentChar);

                pointer++;
            }

            result = nextTerm.toString();
        }
        return result;
    }
}

