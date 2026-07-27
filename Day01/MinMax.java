package Day01;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1, 423, 6, 46, 34, 23, 13, 53, 4};

        // Implemented inbuilt function to sort the array
        Arrays.sort(arr);

        
        System.out.println("Minimum element of array: " + arr[0]);
        System.out.println("Maximum element of array: " + arr[arr.length - 1]);
    }
}
