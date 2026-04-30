import java.util.Scanner;

public class pattern_12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            for (int j = 0; j < 2 * n - (2 * i + 2); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print((i - j + 1));
            }
            System.out.println();
        }

        sc.close();
    }
}
