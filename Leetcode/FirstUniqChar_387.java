
public class FirstUniqChar_387 {
     public int firstUniqChar(String s) {
        if(s==null || s.isEmpty()){
            return -1;
        }
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
        arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String s="swiss";
        firstUniqChar(s);

    }
}
