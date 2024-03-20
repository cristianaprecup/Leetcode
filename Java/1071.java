import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        String result = gcdOfStrings(str1, str2);
        System.out.println("GCD of the strings: " + result);
    }

    public static String gcdOfStrings(String str1, String str2) {
        int i = 1;
        boolean a = true;
        while (a) {
            if (str1.contains(str2)) {
                return str2;
            }
            if (str2.contains(str1)) {
                return str1;
            }
            if (str1.length() >= i || str2.length() >= i) {
                str1 = str1.substring(0, i );
                str2 = str2.substring(0, i );
            } else {
                a = false;
            }
            i++;
        }
        return "";
    }
}
