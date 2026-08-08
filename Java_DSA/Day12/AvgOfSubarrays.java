import java.util.Arrays;

public class AvgOfSubarrays {
    public static double[] averageOfKEle(int[] nums, int k) {
        double[] result = new double[nums.length - k + 1];
        double currsum = 0;
        
        for (int i = 0; i < k; i++) {
            currsum += nums[i];
        }
        result[0] = Math.round((currsum / k) * 100.0) / 100.0;
        
        
        for (int i = k; i < nums.length; i++) {
            currsum += nums[i] - nums[i - k];
            result[i - k + 1] = Math.round((currsum / k) * 100.0) / 100.0;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(Arrays.toString(averageOfKEle(nums, k)));
    }
}