import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {

    public static void subsetRecur(int start, int[] arr, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> subset) {
        // Add current subset at each step
        res.add(new ArrayList<>(subset));

        for (int i = start; i < arr.length; i++) {
            // Skip duplicates at the same recursive level
            if (i > start && arr[i] == arr[i - 1]) continue;

            subset.add(arr[i]);
            subsetRecur(i + 1, arr, res, subset); // Move forward
            subset.remove(subset.size() - 1);     // Backtrack
        }
    }

    public static ArrayList<ArrayList<Integer>> subsets(int[] arr) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(arr); // Ensure inputs are sorted
        subsetRecur(0, arr, res, new ArrayList<>());
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> res = subsets(arr);

        for (ArrayList<Integer> subset : res) {
            System.out.println(subset);
        }
    }
}