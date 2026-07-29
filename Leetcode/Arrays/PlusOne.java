import java.util.Arrays;

public class PlusOne {
     public static int[] plusOne(int[] digits) {
      for (int i = digits.length - 1; i >= 0; i--) {
	    if (digits[i] < 9) {
		digits[i]++;
		return digits;
	    }
	    digits[i] = 0;
    }

    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;
    }
    public static void main(String args[]){
        int[] digits1={4,3,2,2};
        int[] digits2={9};
        int[] digits3={9,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits1)));
        System.out.println(Arrays.toString(plusOne(digits2)));
        System.out.println(Arrays.toString(plusOne(digits3)));
    }
}
