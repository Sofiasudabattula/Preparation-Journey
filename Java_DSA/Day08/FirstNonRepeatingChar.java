package Java_DSA.Day08;

import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static char findFirstNonRepeating(String str) {
        if (str == null || str.isEmpty()) {
            return '_'; 
        }

        int[] freq = new int[26];

        
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i) - 'a'] == 1) {
                return str.charAt(i); 
            }
        }

        return '_'; 
    }

    public static void main(String[] args) {
        String str = "apple";
        char result = findFirstNonRepeating(str);

        System.out.println("First non-repeating character: " + result); // Output: a
    }
}
