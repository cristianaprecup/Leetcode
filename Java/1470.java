public class Main {
    public static int[] shuffle(int[] nums, int n) {
        int[] x=new int[nums.length];
        for(int i=0;i<x.length;i++){
            if(i%2==0){
                x[i]=nums[i/2];
            }
            else {
                x[i]=nums[i/2+n];
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[] a={2,5,1,3,4,7};
        int[] x=shuffle(a,3);
        for(int i=0;i<a.length;i++){
            System.out.print(x[i]+" ");
        }
    }
}