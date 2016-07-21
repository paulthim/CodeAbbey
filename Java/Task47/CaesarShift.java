//47

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.String;
import java.lang.StringBuilder;

public class CaesarShift {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int k = in.nextInt();
        for (int i = 0; i <= n; i++) {
            String s = in.nextLine();
            StringBuilder str = new StringBuilder(s);
            for (int j = 0; j < str.length()-1; j++) {
                char c = str.charAt(j);
                if (c >= (char)('A' + k) && c <= 'Z') {
                    str.setCharAt(j,((char)(c-k)));
                } else if (c >= 'A' && c < (char)('A' + k)) {
                    str.setCharAt(j,((char)(c + (26-k))));
                }
            }
            System.out.println(str + " ");
        }
		in.close();
	}
}