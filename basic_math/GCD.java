import java.util.Scanner;

public class GCD {
    public static void main(String args[]) {
        int gcd = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int n = sc.nextInt();
        System.out.println("enter the second number");
        int m = sc.nextInt();
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        System.out.println("the GCD of " + n + " and " + m + " is: " + gcd);
        sc.close();
    }
}
