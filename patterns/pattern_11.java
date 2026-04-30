import java.util.Scanner;

public class pattern_11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int n = sc.nextInt();
        int st = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                st = 0;
            } else {
                st = 1;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(st + " ");
                st = 1 - st;

            }

            System.out.println();
        }

        sc.close();
    }
}
