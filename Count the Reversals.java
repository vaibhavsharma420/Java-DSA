class Sol {
    int countRev(String s) {
        // your code here
        if (s.length() % 2 != 0)
            return -1;
        int open = 0, close = 0, rev = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{')
                open++;
            else {
                if (open == 0)
                    close++;
                else
                    open--;
            }
        }
        rev = (int) (Math.ceil(open / 2.0) + Math.ceil(close / 2.0));
        return rev;
    }
}