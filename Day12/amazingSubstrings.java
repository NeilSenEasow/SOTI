public class Solution {
    public int solve(String A) {
        
        //Declarations
        int count = 0;
        int stringLength = A.length();
        int i = 0;
        
        StringBuilder newArray = new StringBuilder(A);
        
        //Loop to find the number of subarrays
        while(i<stringLength) {
            
            //Check if character is a vowel
            if(newArray.charAt(i) == 'A' || newArray.charAt(i) == 'E' || newArray.charAt(i) == 'I' 
            || newArray.charAt(i) == 'O' || newArray.charAt(i) == 'U' || newArray.charAt(i) == 'a' 
            || newArray.charAt(i) == 'e' || newArray.charAt(i) == 'i' || newArray.charAt(i) == 'o' 
            || newArray.charAt(i) == 'u' )  {
                
                count += stringLength - i;
                
            }
            
            i++;
            
        }
        
        return count%10003;
    }
}
