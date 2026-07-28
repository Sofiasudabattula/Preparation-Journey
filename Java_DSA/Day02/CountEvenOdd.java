package Java_DSA.Day02;

public class CountEvenOdd {
    public static void Countevenodd(int[] arr){
        int n=arr.length;
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("The Array has"+" "+evencount+" "+"Even numbers"+" "+"And"+" "+oddcount+" "+"Odd numbers"); 
    }
    public static void main(String args[]){
        int[] arr={22,45,67,11,98,100};
        Countevenodd(arr);
    }
}
