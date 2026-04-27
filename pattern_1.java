import java.util.Scanner;

public class pattern_1 {

    // ✅ FIX 1: method must be 'static' to call from main
    // ✅ FIX 2: method must accept 'int n' as parameter
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // ✅ FIX 3: Scanner must be INSIDE a method, not at class level
        // ✅ FIX 4: 'System.in' not 'system.in' (capital S)
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
