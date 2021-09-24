class Solution {
    int isPalindrome(String S) {
        String g = "";
        int c = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            char ch = S.charAt(i);
            g = g + ch;

        }
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == g.charAt(i))
                c++;
        }
        if (c == S.length())
            return 1;

        return 0;

    }
};