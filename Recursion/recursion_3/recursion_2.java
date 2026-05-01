import java.util.Scanner;

// check the string is palindrome or not
public class recursion_2 {

    static boolean ispal(int i, String s, int n) {
        if (i >= n / 2) {
            return true;
        }

        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
        }

        return ispal(i + 1, s, n);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string: ");
        String s = sc.nextLine();

        int n = s.length();

        boolean result = ispal(0, s, n);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}