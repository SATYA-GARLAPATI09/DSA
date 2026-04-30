import java.util.Scanner;

public class pattern_8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows:");
        int n = sc.nextInt();
        for (int i = 0; i < 2 * n + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n + 1 - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        sc.close();
    }

}
