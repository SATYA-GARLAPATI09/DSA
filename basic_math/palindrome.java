
import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int revnum = 0;
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        int m = n;
        while (n > 0) {
            int ld = n % 10;
            n = n / 10;
            revnum = revnum * 10 + ld;

        }

        if (revnum == m) {
            System.out.println("the number is a palindrome");
        } else {
            System.out.println("the number is not a palindrome");
        }
        sc.close();
    }
}
