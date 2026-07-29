package Java_DSA.Day03;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Listmethods {
    public static void ArrayListMethods(List<Integer> nums){
        nums.add(1);
        nums.add(2);
        nums.add(5);
        nums.add(7);
        nums.add(9);
        for(int i:nums){
            System.out.println(i);
        }
        nums.remove(2);
        nums.set(2, 10);
        Collections.sort(nums);
        for(int i:nums){
            System.out.println(i);
        }
        if(nums.contains(9)){
            System.out.println("Arraylist contains element 9");
        }
    }
    public static void main(String args[]){
        List<Integer> nums=new ArrayList<>();
        ArrayListMethods(nums);
    }
}
