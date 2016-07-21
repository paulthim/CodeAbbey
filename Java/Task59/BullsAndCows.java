//59

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class BullsAndCows {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String k = in.next();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String g = in.next();
            int a = 0;
            int b = 0;
            for (int j = 0; j < g.length(); j++) {
                if (g.charAt(j) == k.charAt(j)) {
                    a++;
                } else if (k.indexOf(g.charAt(j)) >= 0) {
                    b++;
                }
            }
            System.out.println(a + "-" + b);
        }
		in.close();
	}
}