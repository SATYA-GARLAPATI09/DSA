
import java.util.Scanner;

public class reverse_number_without_zeros {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int revnum = 0;
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        while (n > 0) {
            int ld = n % 10;
            n = n / 10;
            revnum = revnum * 10 + ld;

        }
        System.out.println(revnum);
        sc.close();
    }
}
