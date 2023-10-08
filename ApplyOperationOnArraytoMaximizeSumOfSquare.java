import java.util.ArrayList;

public class ApplyOperationOnArraytoMaximizeSumOfSquare {

    // this problem is very intutive in nature.

    public static int maximizeSumOfSquare(int[] arr, int k) {

        // take an arrayList ans store those element into the list whose bits are
        // already set.
        ArrayList<Integer> store = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                int number = arr[j];
                if (((number) & (1 << i)) == 1) {
                    count++;
                }
            }
            if (count > k) {
                count = k;
            }
            for (int j = 0; j < k; j++) {
                if (store.size() < j) {
                    store.add(0);
                } else {
                    store.set(j, store.get(j) | (1 << i));
                }
            }
        }
        int product = 0;
        for (int i : store) {
            product += (i * i);
        }
        return product;

    }

}
