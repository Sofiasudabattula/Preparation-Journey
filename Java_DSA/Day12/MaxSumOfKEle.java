public class MaxSumOfKEle{
    public static int maximumSumOfKEle(int[] nums,int k){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<k;i++){
            currsum+=nums[i];
        }
        
        for(int i=k;i<nums.length;i++){
            currsum+=nums[i]-nums[i-k];
            maxsum=Math.max(currsum,maxsum);
        }
        
        return maxsum;

    }
    public static void main(String args[]){
        int[] nums={2,1,5,1,3,2};
        int k=3;
        System.out.println(maximumSumOfKEle(nums,k));
    }
}