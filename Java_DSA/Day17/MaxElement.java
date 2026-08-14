public class MaxElement {
    public static int maxElement(int[] arr,int i){
        int maxi=0;
        int n=arr.length;
        if(i==n-1){
            return arr[i];
        }
        maxi=maxElement(arr,i+1);
        return Math.max(arr[i],maxi);
    }
        
    public static void main(String args[]){
        int[] arr={4,7,2,9,1};
        int result=maxElement(arr,0);
        System.out.println(result);

    }
}
