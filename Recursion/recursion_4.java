import java.util.Scanner;

public class recursion_4 {
    static void f(int i, int n) {
        if (i < 1) {
            return;
        }
        f(i - 1, n);
        System.out.println(i);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        f(n, n);
    }
}
