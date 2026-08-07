import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> freqMap = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        
        System.out.println("Character Frequencies: " + freqMap);
    }
}