//31

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class RotateString {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int k = in.nextInt();
            String s = in.next();
            if (k > 0) {
                s = s.substring(k,s.length()) + s.substring(0,k);
            } else {
                s = s.substring(s.length()+k,s.length()) + s.substring(0,s.length()+k);
            }
            System.out.println(s + " ");
        }
		in.close();
	}
}