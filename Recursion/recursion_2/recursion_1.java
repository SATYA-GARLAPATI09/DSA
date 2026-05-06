import java.util.Scanner;

// the problem was sum of first n numbers
// by parameterised way
public class recursion_1 {
    static void f(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        f(i - 1, sum + i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        f(n, 0);
        sc.close();
    }
}
