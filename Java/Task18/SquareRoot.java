//18

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class SquareRoot {

	final static double EPSILON = 1E-12;
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            double square = in.nextDouble();
            double root = 1;
            int limit = in.nextInt();
            int steps = 0;
            while (steps < limit) {
                root = approximateRoot(square, root, limit);
                steps++;    
            }
            if (root == (int)root) {
                System.out.printf("%d%n ", (int)root);
            } else {
                System.out.printf("%5.4g%n ", root);
            }
        }
        in.close();
    }
    
    private static double approximateRoot(double square, double root, int limit) {
        double d = square/root;
        if (Math.abs(d - root) > EPSILON) {
            root = (d+root)/2;
        }
        return root;
    }
}