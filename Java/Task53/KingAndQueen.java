//53

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class KingAndQueen {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String k = in.next();
            String q = in.next();
            int x1 = k.charAt(0) - 0;
            int x2 = q.charAt(0) - 0;
            int y1 = k.charAt(1) - 0;
            int y2 = q.charAt(1) - 0;
            if (Math.abs(x1-x2) == Math.abs(y1-y2)) {
                System.out.println("Y");
            } else if (Math.abs(x1-x2) == 0 && Math.abs(y1-y2) != 0) {
                System.out.println("Y");
            } else if (Math.abs(x1-x2) != 0 && Math.abs(y1-y2) == 0) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
		in.close();
	}
}