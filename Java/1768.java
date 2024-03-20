import java.util.Scanner;

class Main{
    public static void main(String[] args) {5
        String word1;
        String word2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce the first String:");
        word1 = scan.nextLine();
        System.out.println("Introduce the second String");
        word2 = scan.nextLine();
        scan.close();
        StringBuffer s=new StringBuffer();
        Character a;
        int minLength=Math.min(word1.length(),word2.length());
        for (int i = 0; i < minLength; i++) {

                s.append(word1.charAt(i));
                s.append(word2.charAt(i));
        }

        if (word1.length() > minLength) {
            s.append(word1.substring(minLength));
        } else if (word2.length() > minLength) {
            s.append(word2.substring(minLength));
        }

        System.out.println(s.toString());
    }
}