package Java_DSA.Day02;

public class SecondLargest {
    public static int secondLargestelement(int[] arr){
        int large=Integer.MIN_VALUE;
        int secondlarge=Integer.MIN_VALUE;
        if(arr.length<2){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                secondlarge=large;
                large=arr[i];
            }
            else if(arr[i]>secondlarge && arr[i]!=large){
                secondlarge=arr[i];
            }
        }
        return secondlarge;
    }
    public static void main(String args[]){
        int[] arr={1,2,4,7,7,5};
        System.out.println("Second largest element is"+secondLargestelement(arr));
    }
}
