class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int l = num1.indexOf("+");
        int r1 = Integer.parseInt(num1.substring(0, l));
        int i1 = Integer.parseInt(num1.substring(l + 1, num1.length() - 1));
        l = num2.indexOf("+");
        int r2 = Integer.parseInt(num2.substring(0, l));
        int i2 = Integer.parseInt(num2.substring(l + 1, num2.length() - 1));

        int r3 = (r1 * r2) - (i1 * i2);
        int i3 = (r1 * i2) + (i1 * r2);
        return r3 + "+" + i3 + "i";

    }
}