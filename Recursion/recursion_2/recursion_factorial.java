import java.util.Scanner;

// factorail problem 
public class recursion_factorial {
    static int f(int n) {
        if (n == 0) {
            return 0;
        }
        return n + f(n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        System.out.println("the factorial of " + n + " is: " + f(n));
        sc.close();
    }
}
