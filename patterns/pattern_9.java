import java.util.Scanner;

public class pattern_9 {

    static void diamond(int n) {

        for (int i = 1; i <= 2 * n - 1; i++) {

            int row = (i <= n) ? i : 2 * n - i;

            // spaces
            for (int j = 1; j <= n - row; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= 2 * row - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        diamond(n);
    }
}