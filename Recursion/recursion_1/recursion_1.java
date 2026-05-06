import java.util.Scanner;

public class recursion_1 {

    static void f(int n, int s) {
        if (n == s) {
            return;
        }
        System.out.println(n);
        n++;
        f(n, s);
    }

    public static void main(String args[]) {
        int n = 0;
        int s;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        s = sc.nextInt();
        f(n, s);
        sc.close();

    }
}