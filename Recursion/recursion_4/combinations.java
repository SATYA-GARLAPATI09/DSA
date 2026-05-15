import java.util.*;

public class combinations {

    static boolean f(int ind, int[] arr, List<Integer> list, int sum, int s) {

        // base case
        if (ind == arr.length) {

            if (sum == s) {
                System.out.println(list);
                return true;
            }

            return false;
        }

        // take
        list.add(arr[ind]);

        if (f(ind + 1, arr, list, sum + arr[ind], s) == true) {
            return true;
        }

        // backtrack
        list.remove(list.size() - 1);

        // not take
        if (f(ind + 1, arr, list, sum, s) == true) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int s = 2;

        int arr[] = { 1, 2, 1 };

        List<Integer> list = new ArrayList<>();

        f(0, arr, list, 0, s);
    }
}