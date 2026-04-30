import java.util.Scanner;

public class pattern_20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 0; i < 2 * n - 1; i++) {
            int spaces = 2 * n - 2;
            int stars = i + 1;
            if (i >= n) {
                spaces = spaces + 2;
                stars = stars - 1;
            } else {
                spaces = spaces - 2;
                stars = stars + 1;
            }
            for (int j = 0; j < stars; j++) {

                System.out.print("*");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
