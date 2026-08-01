import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                return true;
            }
            map.put(num, 1);
        }
        
        return false; 
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        
        System.out.println("nums1 has duplicate? " + hasDuplicate(nums1) + " (Expected: true)");
        System.out.println("nums2 has duplicate? " + hasDuplicate(nums2) + " (Expected: false)");
    }
} 
    