public class FindFirstOccurence {

    public static int findFirstOccurrence(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;      
                high = mid - 1; 
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 4, 5};

        // Example 1: Multiple occurrences
        System.out.println("First occurrence of 2: Index " + findFirstOccurrence(nums, 2));

        // Example 2: Single occurrence
        System.out.println("First occurrence of 4: Index " + findFirstOccurrence(nums, 4));

        // Example 3: Target does not exist
        System.out.println("First occurrence of 6: Index " + findFirstOccurrence(nums, 6));
    }
}