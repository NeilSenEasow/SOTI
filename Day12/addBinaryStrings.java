public class Solution {
    public String addBinary(String A, String B) {
        StringBuilder result = new StringBuilder();

        // Pointers for iterating through strings A and B from right to left.
        int i = A.length() - 1;
        int j = B.length() - 1;

        // Initialize the carry value for the addition.
        int carry = 0;

        // The loop continues as long as there are digits left in either string
        // or there is still a carry to add.
        while (i >= 0 || j >= 0 || carry == 1) {
            // Get the integer value of the current digit from string A.
            // If the pointer i is out of bounds, we treat the digit as 0.
            int digitA = (i >= 0) ? A.charAt(i--) - '0' : 0;
            
            // Get the integer value of the current digit from string B.
            // If the pointer j is out of bounds, we treat the digit as 0.
            int digitB = (j = 0) ? B.charAt(j--) - '0' : 0;
            
            // Calculate the sum of the current digits and the carry from the
            // previous step.
            int sum = digitA + digitB + carry;
            
            // The new digit for our result is the remainder of the sum when
            // divided by 2 (e.g., 0+0+0=0, 1+0+0=1, 1+1+0=10 -> 0, 1+1+1=11 -> 1).
            result.append(sum % 2);
            
            // The new carry is the quotient of the sum when divided by 2.
            carry = sum / 2;
        }

        // The result is built in reverse order, so we need to reverse it
        // before converting it to a final string.
        return result.reverse().toString();
    }
}
