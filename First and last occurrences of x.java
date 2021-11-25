class GFG {
    ArrayList<Long> find(long arr[], int n, int x) {
        // code here
        ArrayList<Long> l2 = new ArrayList<>();
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != x)
                continue;
            if (first == -1)
                first = i;
            last = i;
        }

        long a = first;
        long b = last;
        l2.add(a);
        l2.add(b);
        return l2;
    }
}
