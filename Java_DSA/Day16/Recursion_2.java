import java.util.Scanner;

public class Recursion_2 {
    public static void printNto1UsingRecursion(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        printNto1UsingRecursion(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number N:");
        int n=sc.nextInt();
        printNto1UsingRecursion(n);
    }
}
