import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String na = sc.nextLine();
        int x = 0, y = 0, c = 0;
        int n = na.length();
        for (int i = 0; i < n; i++) {
            if (na.charAt(i) == '0')
                x++;
            else
                y++;
            if (x == y)
                c++;

        }
        if (x != y)
            c = -1;
    }
}