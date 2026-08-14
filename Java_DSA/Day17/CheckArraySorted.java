public class CheckArraySorted {
    public static boolean checkArraySorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<=arr[i+1] && checkArraySorted(arr,i+1);
    }
     public static void main(String args[]){
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,3,2,4};
        System.out.println(checkArraySorted(arr1,0));
       System.out.println(checkArraySorted(arr2,0));
        

    }
}
