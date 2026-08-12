import java.util.Scanner;

public class Recursion_4 {
    public static int FactorialOfNnumbers(int n){
        if(n==0){
            return 1;
        }
        return n*FactorialOfNnumbers(n-1);
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number N:");
        int n=sc.nextInt();
        int fact=FactorialOfNnumbers(n);
         System.out.println("The Factorial is: " + fact);
    }
}
