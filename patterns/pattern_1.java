import java.util.Scanner;

public class pattern_1 {

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();           // number of test cases
        for (int t = 0; t < k; t++) {
            int c = sc.nextInt();       // size for this test case
            pattern(c);
            System.out.println();       // blank line between patterns
        }

        sc.close();
    }
}
