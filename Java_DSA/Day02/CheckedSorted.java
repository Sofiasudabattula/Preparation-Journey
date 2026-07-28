package Java_DSA.Day02;

public class CheckedSorted {
    public static boolean Checkifarraysorted(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int[] arr1={1,2,3,4,5};
        int[] arr2={5,4,6,7,8};
        System.out.println(Checkifarraysorted(arr1));
        System.out.println(Checkifarraysorted(arr2));
    }
}

