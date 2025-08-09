public class Solution {
    public int isPalindrome(String A) {
        
        int flag=1;
        ArrayList<Character> tempArray = new ArrayList<>();
        
        //Convert string and filter out special characters
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                tempArray.add(c);
            }
        }
        
        //Defining the pointers
        int left = 0;
        int right = tempArray.size() - 1;
        
        //Checking for isPalindrome or not
        for(int i = 0 ; i < tempArray.size() - 1; i++)    {
            
            
            if(Character.toLowerCase(tempArray.get(left)) != Character.toLowerCase(tempArray.get(right)))   {
                flag = 0;
            }
            
            left++;
            right--;
        }
        
        if(flag == 1)   {
            return 1;
        }
        else{
            return 0;
        }
    }
}
