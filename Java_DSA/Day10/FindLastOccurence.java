public class FindLastOccurence {

   

    public static int findLastOccurrence(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;     // Save current match as potential answer
                low = mid + 1; // Keep looking to the right
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

        
        System.out.println("Last occurrence of 2: Index " + findLastOccurrence(nums, 2));
        System.out.println("Last occurrence of 4: Index " + findLastOccurrence(nums, 4));
        System.out.println("Last occurrence of 6: Index " + findLastOccurrence(nums, 6));
    }
}
