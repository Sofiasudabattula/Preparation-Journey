public class ReverseString {
    public static void reverseString(char[] arr,int left,int right){
      if(left>=right){
        return;
      }
      char temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      reverseString(arr,left+1,right-1);
    }
    public static void main(String args[]){
        String s="Sofia";
        char[] arr=s.toCharArray();
        int n=arr.length;
        reverseString(arr,0,n-1);
        String reversed = new String(arr);
        System.out.println(reversed);
    }
}
