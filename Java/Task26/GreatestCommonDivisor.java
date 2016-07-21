//26

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class GreatestCommonDivisor {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int bigger = Math.max(a, b);
            int smaller = Math.min(a, b);
            int denom = 0;
            int mult;
            while (bigger != smaller) {
                denom = bigger-smaller;
                bigger = Math.max(denom, smaller);
                smaller = Math.min(denom, smaller);
            }
            mult = (a*b)/denom;
            System.out.println("(" + denom + " " + mult + ") ");
        }
		in.close();
	}
}