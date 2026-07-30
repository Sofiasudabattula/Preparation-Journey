import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void Movezeroes(int[] nums){
        int k=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        while(k<n){
            nums[k]=0;
            k++;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String args[]){
        int[] nums={0,1,2,0,0,3,0,5};
        Movezeroes(nums);
    }
}
