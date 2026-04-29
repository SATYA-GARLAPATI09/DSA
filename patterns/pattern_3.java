import java.util.Scanner;

public class pattern_3 {
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int t = 0; t < k; t++) {
            int n = sc.nextInt();
            pattern(n);
        }
    }
}