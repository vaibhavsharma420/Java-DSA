class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int j = m - 1;
        while (j >= 0 && arr[0][j] == 1)
            j--;
        int row = 0;
        for (int i = 1; i < n; i++) {
            while (j >= 0 && arr[i][j] == 1) {
                j--;
                row = i;
            }

        }
        // code here
        if (j == m - 1)
            return -1;
        else
            return row;
    }
}