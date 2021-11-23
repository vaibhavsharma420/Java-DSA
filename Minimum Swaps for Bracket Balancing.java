class Solution {
    static int minimumNumberOfSwaps(String S) {
        // code here
        int swap = 0;
        int c = 0;
        int o = 0;
        int ub = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '[') {
                o++;
                if (ub > 0) {
                    swap += ub;
                    ub--;

                }
            }

            else if (ch == ']') {
                c++;
                ub = c - o;
            }

        }
        return swap;
    }
}