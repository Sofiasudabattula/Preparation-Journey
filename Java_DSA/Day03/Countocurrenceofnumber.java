package Java_DSA.Day03;

public class Countocurrenceofnumber {
    public static int countoccurence(int[] nums,int target){
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String args[]){
        int[] nums={10,5,10,15,10,5};
        int target=10;
        System.out.println(countoccurence(nums,target));
    }
}
