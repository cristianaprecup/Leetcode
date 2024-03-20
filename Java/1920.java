public class Solution {
    public static int[] buildArray(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] num = {5,0,1,2,3,4};
        int[] ans=buildArray(num);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}