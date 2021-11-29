class Solution {
    static int majorityElement(int a[], int size) {
        // your code here
        int d = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        if (a.length > 1) {
            for (int i = 0; i < a.length; i++) {
                if (map.containsKey(a[i])) {
                    int count = map.get(a[i]) + 1;
                    if (count > a.length / 2) {
                        d = a[i];

                    } else
                        map.put(a[i], count);
                } else
                    map.put(a[i], 1);
            }
        } else {
            d = a[0];
        }
        return d;
    }
}