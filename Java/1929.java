public class Main{
    public static int[] getConcatenation(int[] nums) {
        int[] ans=new int[nums.length*2];
        for(int i=0;i<ans.length;i++){
            if(i< nums.length){
                ans[i]=nums[i];
            }
            else{
                ans[i]=nums[i-nums.length];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] num={1, 2, 1};
        int[] ans=getConcatenation(num);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}