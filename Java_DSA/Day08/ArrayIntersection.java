package Java_DSA.Day08;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

    public static Set<Integer> findIntersection(int[] A, int[] B) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        
        for (int num : A) {
            setA.add(num);
        }

        
        for (int num : B) {
            if (setA.contains(num)) {
                resultSet.add(num); 
            }
        }

        return resultSet;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {2, 3, 5};

        Set<Integer> result = findIntersection(A, B);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}