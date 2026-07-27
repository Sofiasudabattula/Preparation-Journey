package Day01;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        // Loop through the array sequentially
        for (int i = 0; i < arr.length; i++) {
            // Check if current element matches the target
            if (arr[i] == target) {
                return i; // Return index immediately upon match
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 45, 30, 85, 60};
        int targetValue = 30;

        int resultIndex = linearSearch(numbers, targetValue);

        if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
