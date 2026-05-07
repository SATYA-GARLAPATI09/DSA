import java.util.*;

public class subsequence_sum_k {

    static void f(int ind, int[] arr, List<Integer> list, int sum, int s) {

        // base case
        if (ind == arr.length) {

            if (sum == s) {
                System.out.println(list);
            }

            return;
        }

        // take
        list.add(arr[ind]);
        f(ind + 1, arr, list, sum + arr[ind], s);

        // backtrack
        list.remove(list.size() - 1);

        // not take
        f(ind + 1, arr, list, sum, s);
    }

    public static void main(String[] args) {

        int s = 2;

        int arr[] = { 1, 2, 1 };

        List<Integer> list = new ArrayList<>();

        f(0, arr, list, 0, s);
    }
}