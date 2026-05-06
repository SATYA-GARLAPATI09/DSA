
import java.util.*;

public class subsequemce_sum_k {
    static void f(int ind, int arr[], List<Integer> list) {

        if (ind == arr.length) {
            System.out.println(list);
            return;
        }

        // take
        list.add(arr[ind]);
        f(ind + 1, arr, list);

        // backtrack
        list.remove(list.size() - 1);

        // not take
        f(ind + 1, arr, list);
    }

    public static void main(String[] args) {

        int arr[] = { 3, 1, 2 };

        List<Integer> list = new ArrayList<>();

        f(0, arr, list);
    }
}
