import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {
    public static int longestSubstring(String s){
        int n=s.length();
        if(n==0||s==null){
            return 0;
        }
        int left=0;
        int maxlength=0;
        Set<Character> set=new HashSet<>();
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
    public static void main(String args[]){
        String s="adhiwkliaspjnfois";
        System.out.println(longestSubstring(s));
    }
}
