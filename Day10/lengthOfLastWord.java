public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        
        //Step 0:
        String trimmed = A.trim();
        
        //Step 1: Add the string to an arrayList
        ArrayList<String> tempArray = new ArrayList<>(Arrays.asList(trimmed.split(" ")));
        int sizeofTempArray = tempArray.size()-1;
        //Step 2: Finding the last word 
        String lastWord = tempArray.get((sizeofTempArray));
        
        //Step 3: Find the length of lastWord
        return lastWord.length();
        
    }
}
