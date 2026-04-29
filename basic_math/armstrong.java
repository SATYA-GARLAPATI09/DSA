
import java.util.Scanner;

public class armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;
            n = n / 10;
            sum = sum + (ld * ld * ld);
        }

        if (sum == m) {
            System.out.println("the number is a armstrong");
        } else {
            System.out.println("the number is not a armstrong");
        }
        sc.close();
    }
}
