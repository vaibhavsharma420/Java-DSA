class Solution {
    public void reverseString(char[] s) {
        char se[] = new char[s.length];
        int j = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            se[j] = s[i];
            j++;

        }
        s[s.length - 1] = se[s.length - 1];
        for (int i = 0; i < s.length - 1; i++) {
            s[i] = se[i];

        }

    }
}