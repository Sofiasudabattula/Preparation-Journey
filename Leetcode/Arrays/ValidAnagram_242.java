import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> freqMap = new HashMap<>();

        // Increment for s, decrement for t
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            freqMap.put(charS, freqMap.getOrDefault(charS, 0) + 1);
            freqMap.put(charT, freqMap.getOrDefault(charT, 0) - 1);
        }

        // If all frequencies are 0, they are anagrams
        for (int count : freqMap.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); 
        System.out.println(isAnagram("rat", "car"));       
    }
}
