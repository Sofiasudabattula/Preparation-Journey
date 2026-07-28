import java.util.*;
public class FindNumbersWithEvenNumberOfDigits_1295 {
    public static int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int no_of_digits=(int)(Math.log10(nums[i])+1);
            if(no_of_digits%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
