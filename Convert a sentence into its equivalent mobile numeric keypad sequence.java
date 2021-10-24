import java.util.*;

public class Main {

    public static void main(String args[]) {
        String a[] = new String[] { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66",
                "666", "7", "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };

        Scanner sc = new Scanner(System.in);
        String na = sc.nextLine().toUpperCase();
        String out = " ";
        int pos = 0;
        for (int i = 0; i < na.length(); i++) {
            char ch = na.charAt(i);
            if (ch == ' ')
                out = out + "0";
            else {
                pos = ch - 'A';
                out = out + a[pos];

            }
        }
        System.out.println(out);
    }
}