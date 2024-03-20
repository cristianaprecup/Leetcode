public class Main {
    public static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                x+=1;
            }
            else{
                x-=1;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String[] a={"--X","X++","X++"};
        int x=finalValueAfterOperations(a);
        System.out.println(x);
    }
}