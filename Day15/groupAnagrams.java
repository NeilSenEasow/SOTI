import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to store grouped anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Sort the string to form the key
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            // Add the string to the correct group
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        
        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }
}
