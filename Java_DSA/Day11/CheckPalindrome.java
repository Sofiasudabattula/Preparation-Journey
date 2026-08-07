public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = true;
        int low = 0, high = str.length() - 1;
        
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        
        System.out.println(str + " is palindrome: " + isPalindrome);
    }
}