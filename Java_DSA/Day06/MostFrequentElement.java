import java.util.HashMap;
import java.util.Map;
public class MostFrequentElement {

    public static int findMostFrequent(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxFreq=0;
        int mostFrequentElement=-1;
        for (int num : nums) {
    
            int currentFreq = map.getOrDefault(num, 0) + 1;
            map.put(num, currentFreq);

    
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                mostFrequentElement = num;
            }
        }
       
        
        return mostFrequentElement; 
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1, 4, 1, 3, 3, 3};
        
        int mostFrequent = findMostFrequent(nums);
        System.out.println("Most Frequent Element: " + mostFrequent);
    }
}