import java.util.Arrays;
public class RunningSum1DArray_1480 {
    public static int[] runningSum(int[] nums) {
       int n=nums.length;
       int sum=0;
       int[] runningsum=new int[n];
       for(int i=0;i<n;i++){
        runningsum[i]=sum+nums[i];
        sum+=nums[i];
       }
       return runningsum; 
    }
    public static void main(String args[]){
        int[] nums={1,2,3,4,5};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
