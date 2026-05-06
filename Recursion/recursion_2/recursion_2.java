import java.util.Scanner;

// sum of fist n number by functional way
public class recursion_2 {
    static int f(int n) {
        if (n == 0) {
            return 0;
        }
        return f(n - 1) + n;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        System.out.println(f(n));
        sc.close();
    }
}
