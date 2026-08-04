public class BinarySearchCount {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 9, 12, 15, 18, 21, 25, 28, 31, 35, 40, 45, 50, 55};
        int target = 45;

        int low = 0;
        int high = arr.length - 1;
        int comparisons = 0;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            comparisons++; // Count each iteration

            if (arr[mid] == target) {
                result = mid;
                break;
            }

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Target Index: " + result);
        System.out.println("Total Comparisons: " + comparisons);
    }
}