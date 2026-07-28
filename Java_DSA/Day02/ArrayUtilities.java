import java.util.Arrays;

public class ArrayUtilities{
    public static void main(String args[]){
        int[] originalStock={45,12,89,3,27};
        int[] sortedStock=Arrays.copyOf(originalStock,originalStock.length);
        Arrays.sort(sortedStock);
         System.out.println("OriginalStock Array:"+Arrays.toString(originalStock));
        System.out.println("sortedStock Array:"+Arrays.toString(sortedStock));
        boolean isEqual = Arrays.equals(originalStock, sortedStock);
        System.out.println("Are both arrays identical in order? " + isEqual);
        Arrays.fill(sortedStock, 0);
        System.out.println("Cleared Stock"+Arrays.toString(sortedStock));
    }
}