import java.util.Scanner;

public class Recursion_3 {
    public static int sumOfNnumbers(int n){
        if(n==0){
            return 0;
        }
        return n+sumOfNnumbers(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number N:");
        int n=sc.nextInt();
        int sum=sumOfNnumbers(n);
         System.out.println("The sum is: " + sum);
    }
}
