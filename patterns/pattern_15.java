import java.util.Scanner;

public class pattern_15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch < 'A' + n - i; ch++) {
                System.out.print(ch + " ");

            }
            System.out.println();
        }
        sc.close();
    }
}
