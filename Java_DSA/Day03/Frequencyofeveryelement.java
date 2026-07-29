package Java_DSA.Day03;

public class Frequencyofeveryelement {
    public static void frequencycount(int[] nums){
        int n=nums.length;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            int cnt=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    visited[j]=true;
                    cnt++;
                }
            }
            System.out.println(nums[i]+" "+cnt);
        }
        
    }
    public static void main(String args[]){
        int[] nums={10,5,10,15,10,5};
        frequencycount(nums);
    }
}
