import java.util.Scanner;

public class Recursion_1{
    public static void print1toNUsingRecursion(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        print1toNUsingRecursion(i+1,n);
    }
    public static void main(String args[]){
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number N:");
        int n=sc.nextInt();
        print1toNUsingRecursion(i,n);
    }
}