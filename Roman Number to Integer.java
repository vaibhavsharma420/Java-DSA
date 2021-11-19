class Solution {

    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        char ch;
        int r = 0;
        int n = 0;
        int n2 = 0;
        Hashmap<Character, Integer> fun = new HashMap<>();
        fun.put('I', 1);
        fun.put('V', 5);
        fun.put('X', 10);
        fun.put('L', 50);
        fun.put('C', 100);
        fun.put('D', 500);
        fun.put('M', 1000);
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (fun.containsKey(ch))
                n = fun.get(ch);
            if (i + 1 < str.length()) {
                if (n > fun.containsKey(str.charAt(i + 1))) {
                    r = r + fun.containsKey(str.charAt(i + 1)) - n;
                    i++;
                } else
                    r = r + n;
            } else
                r = r + n;

        }
        return r;

    }
}