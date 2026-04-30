import java.util.Scanner;

public class pattern_16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows:");
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(ch + " ");

            }
            ch++;
            System.out.println();
        }
        sc.close();
    }
}
