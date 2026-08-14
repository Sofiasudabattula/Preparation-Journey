public class ArrayEleUsingRecursion{
    public static void printArrayElements(int[] arr,int i){
        if(i>=arr.length){
            return;
        }
        System.out.println(arr[i]);
        printArrayElements(arr,i+1);
    }
    public static void main(String args[]){
        int[] arr={10,20,30,40,50};
         printArrayElements(arr,0);
    }
}