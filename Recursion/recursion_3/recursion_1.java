
// through recursion reversing an array by using two pointers
import java.util.Scanner;

public class recursion_1 {
    static void f(int arr[], int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        f(arr, left + 1, right - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements in array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        f(arr, 0, n - 1);
        System.out.print("the reversed array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}