public class RemoveDuplicatesfromSortedArray{
    public static int Removeduplicates(int[] nums){
        int cnt=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i<n-1 && nums[i]==nums[i+1]){
                continue;
            }
            else{
                nums[cnt]=nums[i];
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String args[]){
        int[] nums={1,2,2,4,5,5,9};
        int k=Removeduplicates(nums);
        System.out.println("Number of unique elements: " + k);
        System.out.print("Unique Array: [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}