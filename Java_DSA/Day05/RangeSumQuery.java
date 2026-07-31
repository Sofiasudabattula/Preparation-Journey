import java.util.Arrays;

public class RangeSumQuery {

    // Task 1: Build and return the prefix sum array
    public static int[] buildPrefixSum(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        
        return prefix;
    }

    // Task 2: Calculate sum between index L and R using the prefix array
    public static int getRangeSum(int[] prefix, int L, int R) {
      if (L == 0) {
            return prefix[R];
        }
        return prefix[R] - prefix[L - 1];
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2, 8, 5};
        System.out.println("Original Array: " + Arrays.toString(nums));

        // 1. Build Prefix Array
        int[] prefix = buildPrefixSum(nums);
        System.out.println("Prefix Array:   " + Arrays.toString(prefix));

        // 2. Test Range Queries
        
        int sum1 = getRangeSum(prefix, 1, 3);
        System.out.println("Sum from index 1 to 3: " + sum1);

        
        int sum2 = getRangeSum(prefix, 0, 4);
        System.out.println("Sum from index 0 to 4: " + sum2);

        
        int sum3 = getRangeSum(prefix, 2, 5);
        System.out.println("Sum from index 2 to 5: " + sum3);
    }
}