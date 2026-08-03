package Java_DSA.Day08;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static Map<Character, Integer> countCharFrequency(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return map;

    }
    public static void main(String args[]){
        String str="apple";
     Map<Character, Integer> frequencies = countCharFrequency(str);

        // Display frequencies
        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            System.out.println("'" + entry.getKey() + "' -> " + entry.getValue());
        }
    }
}
