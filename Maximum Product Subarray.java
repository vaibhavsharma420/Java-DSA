
class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        if (n == 0)
            return 0;
        if (n == 1)
            return arr[0];
        long max = 1;
        long min = 1;
        long res = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                max = max * arr[i];
                min = Math.min(1, arr[i] * min);
            } else if (arr[i] == 0) {
                min = 1;
                max = 1;
            } else {
                long temp = min;
                min = max;
                max = temp;
                min = min * arr[i];
                max = Math.max(1, arr[i] * max);
            }
            res = Math.max(max, res);
        }
        return res;
    }
}