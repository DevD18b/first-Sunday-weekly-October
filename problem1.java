public class problem1 {
    public static int solver(int[] arr, int m) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i : arr) {
            if (i % m == 0) {
                sum1 += i;
            } else if (i % m != 0) {
                sum2 += i;
            }
        }
        return sum2 - sum1;
    }
    // first thing can be integer can overflow.
    // just in case if constraints are 10^5 then long can be taken into
    // consideration.
    // if range of the number goes upto 10^9
    // then what can be done in this case is simplyyy be the mathematical problem.
    // this is AP.
}