import java.util.HashMap;
import java.util.Map;

public class FrequencyCounterUsingHashMap {

    public static Map<Integer, Integer> countFrequencies(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        return map;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 4, 5, 2, 3, 4, 2};
        
        Map<Integer, Integer> freqMap = countFrequencies(nums);
        
        System.out.println("Element Frequencies:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
        }
    }
}