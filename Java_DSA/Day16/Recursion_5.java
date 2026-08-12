package Java_DSA.Day16;

import java.util.Arrays;

public class Recursion_5 {
    public static void reverseArrayUsingRecursion(int[] nums,int left,int right){
        if(left>=right){
            return;
        }
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        reverseArrayUsingRecursion(nums,left+1,right-1);
    }
    public static void main(String args[]){
        int[] nums={1,2,3,4,5};
        int left=0;
        int right=nums.length-1;
        reverseArrayUsingRecursion(nums,left,right);
        System.out.println("Reversed Array:"+Arrays.toString(nums));
    }
    
}
