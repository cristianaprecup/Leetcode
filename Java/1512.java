public class Main {
    public static int numIdenticalPairs(int[] nums) {
        int num=0;
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>=i;j--){
                if(nums[i]==nums[j]&&i!=j){
                    num+=1;

                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] num={1,2,3,1,1,3};
        int nuums=numIdenticalPairs(num);
        System.out.println(nuums);
    }

}