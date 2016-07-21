//128

import java.util.Scanner;

public class CombinationsCounting {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
        for (int i = 0; i < tests; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            //System.out.println(k);
            if (k == 0) {
                System.out.println(1);
            } else {
                double a = factorial(n);
                double b = factorial(k);
                double c = factorial(n-k);
                double combinations = a/(b*c);
                System.out.printf("%1.0f%n", combinations);
            }
        }
		in.close();
	}

	private static double factorial (int x) {
        double factoredX = x;
        for (int i = x-1; i > 1; i--) {
            factoredX = factoredX * i;
        }
        return factoredX;
    }
}