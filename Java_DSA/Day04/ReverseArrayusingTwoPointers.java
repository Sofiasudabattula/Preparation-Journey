import java.util.Arrays;

public class ReverseArrayusingTwoPointers{
    public static void Reverse(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String args[]){
        int[] nums={10,5,10,15,10,5};
        Reverse(nums);
        
    }
}