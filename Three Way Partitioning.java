class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b) {
        // code here
        int n = array.length;
        int start = 0;
        int end = n - 1;
        for (int i = 0; i <= end;) {
            if (array[i] < a) {
                int temp = array[start];
                array[start] = array[i];
                array[i] = temp;
                start++;
                i++;
            } else if (array[i] > b) {
                int dem = array[end];
                array[end] = array[i];
                array[i] = dem;
                end--;

            } else
                i++;
        }
    }
}