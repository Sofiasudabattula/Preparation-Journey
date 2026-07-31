public class PivotIndex{
     public static int pivotIndex(int[] nums) {
      int Totalsum=0;
      int rightsum=0;
      int leftsum=0;
      for(int i=0;i<nums.length;i++){
        Totalsum+=nums[i];
      } 
      for(int i=0;i<nums.length;i++){
        rightsum=Totalsum-leftsum-nums[i];
        if(leftsum==rightsum){
            return i;
        }
        leftsum+=nums[i];
      } 
      return -1;
    }
    public static void main(String args[]){
        int[] nums={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}