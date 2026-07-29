public class RemoveElement_27 {
    public static int removeElement(int[] nums, int val) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String args[]){
        int[] nums={1,2,2,4,5,5,9};
        int val=5;
        int k=removeElement(nums,val);
        System.out.println(k);
        for(int i=0;i<k;i++){
            System.out.print(nums[i] + (i < k - 1 ? ", " : ""));
        }
        
    }
}
