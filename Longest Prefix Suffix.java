class Solution {
    int lps(String s) {
        // code here
        int len = 0;
        int i = 1;
        int n = s.length();
        ArrayList<Integer> lps = new ArrayList<>();
        lps.add(0);
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                lps.add(i, len + 1);
                len++;
                i++;

            } else if (len != 0)
                len = lps.get(len - 1);
            else {
                lps.add(i, 0);
                i++;
            }
        }

        return Collections.max(lps);

    }
}