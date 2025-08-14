package collection.hashmap;


import java.util.*;

public class Solution {
    public static boolean wordPattern(String pattern, String s) {
        String arr[] = s.split(" ");
        
        // Corrected the condition to compare lengths of pattern and split array
        if (pattern.length() != arr.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            char currentPatternChar = pattern.charAt(i);

            if (map.containsKey(currentPatternChar)) { //a 
                // Use .equals() to compare string values
                if (!map.get(currentPatternChar).equals(arr[i])) {
                    return false;
                }
            } else {
                // Check if the value already exists in the map
                if (map.containsValue(arr[i])) {
                    return false; // Prevents two keys from mapping to the same value
                }
                map.put(currentPatternChar, arr[i]);
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(wordPattern("abba", "dog cat cat fish")); // false
    }
}
