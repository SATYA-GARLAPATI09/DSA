
import java.util.Scanner;

public class count_the_digits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input: ");
        int n = sc.nextInt();
        int ct = 0;
        while (n > 0) {
            int ld = n % 10;
            System.out.print(ld);
            n = n / 10;
            ct++;
        }
        System.out.println();
        System.out.println("the count of digits is: " + ct);
        sc.close();
    }
}
