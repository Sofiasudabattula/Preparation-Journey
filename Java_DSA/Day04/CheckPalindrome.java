public class CheckPalindrome{
    public static boolean Checkpalindrome(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            if(nums[start]!=nums[end]){
               return false;
            }
            else{
                start++;
                end--;
            }

        }
        return true;
    }
    public static void main(String args[]){
        int[] nums={1,2,3,3,2,1};
        int[] nums1={1,2,3,4,3,2,1};
        int[] nums2={1,2,4,3,2,1};
        System.out.println(Checkpalindrome(nums));
        System.out.println(Checkpalindrome(nums1));
        System.out.println(Checkpalindrome(nums2));
    }
}