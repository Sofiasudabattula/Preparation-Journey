public class SumOfArrayUsingRecursion {
    public static int sumOfArray(int[] arr,int n){
        if(n==0){
            return 0;
        }
        return n+sumOfArray(arr,n-1);
    }
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        System.out.println(sumOfArray(arr,n));
    }
}
