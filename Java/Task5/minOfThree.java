import java.util.*;
import java.io.*;

public class minOfThree {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int a;
		int b;
		int c;
        for(int i=0; i<n; i++) {
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			if (a < b && a < c) {
				System.out.println(a);
			} else if (b < c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		}
		in.close();
    }
}