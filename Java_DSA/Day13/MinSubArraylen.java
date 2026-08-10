public class MinSubArraylen {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            
            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= nums[left];
                left++;
            }
        }
        
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        MinSubArraylen solver = new MinSubArraylen();

        //Standard case where a small subarray matches target
        int target1 = 7;
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        System.out.println("Test 1 Result: " + solver.minSubArrayLen(target1, nums1)); // Output: 2 (subarray:)

        //Single element matches target exactly
        int target2 = 4;
        int[] nums2 = {1, 4, 4};
        System.out.println("Test 2 Result: " + solver.minSubArrayLen(target2, nums2)); // Output: 1 (subarray:)

        //No valid subarray exists
        int target3 = 11;
        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("Test 3 Result: " + solver.minSubArrayLen(target3, nums3)); // Output: 0
    }
}
