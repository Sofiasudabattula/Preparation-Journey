package Java_DSA.Day09;

public class BinarySearchRecursive {
    public static int binarySearch(int[] arr, int low,int high,int target) {
       

        if(low > high) {
            return -1;
        }
            // Avoid integer overflow
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; 
            }

            if (arr[mid] < target) {
                return binarySearch(arr,mid+1,high,target);
            } else {
                return binarySearch(arr,low,mid-1,target); 
            }
        

       
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 38;

        int result = binarySearch(arr,0,arr.length-1 ,target);

        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }

}
