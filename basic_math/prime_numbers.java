import java.util.*;

public class prime_numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) {
                    count++;
                }
            }
        }
        if (count == 2) {
            System.out.println(n + "is a prime number");
        } else {
            System.out.println(n + "is not a prime number");
        }
        sc.close();
    }
}
