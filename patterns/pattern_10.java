import java.util.Scanner;

public class pattern_10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int n = sc.nextInt();
        for (int i = 0; i < 2 * n - 1; i++) {
            int stars = i + 1;
            if (i >= n) {
                stars = 2 * n - i - 1; // this line
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");

            }

            System.out.println();
        }

    }

}
