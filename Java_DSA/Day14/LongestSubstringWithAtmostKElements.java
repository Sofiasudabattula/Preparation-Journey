package Java_DSA.Day14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithAtmostKElements {
     public static int longestSubstring(String s,int k){
        int n=s.length();
        if(n==0||s==null||k==0){
            return 0;
        }
        int left=0;
        int maxlength=0;
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch, 0)+1);
            while(map.size()>k){
                char chl=s.charAt(left);
                map.put(chl,map.get(chl)-1);
                if(map.get(chl)==0){
                    map.remove(chl);
                }
                left++;
            }
    
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
    public static void main(String args[]){
        String s="adhiwkliaspjnfois";
        int k=4;
        System.out.println(longestSubstring(s,k));
    }
}
