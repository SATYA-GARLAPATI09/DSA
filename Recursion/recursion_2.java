import java.util.Scanner;

public class recursion_2 {
    static void f(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        f(i + 1, n);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        f(1, n);
        sc.close();
    }
}
