public class CheckStringPalindrome {
    public static boolean checkStringPalindrome(String s,int i){
        int n=s.length();
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        return checkStringPalindrome(s, i+1);
    }
    public static void main(String args[]){
        String s1="madam";
        String s2="hello";
        int i=0;
        System.out.println(checkStringPalindrome(s1,i));
        System.out.println(checkStringPalindrome(s2,i));
    }
}
