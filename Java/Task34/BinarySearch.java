//34

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class BinarySearch {
	
	private static final double EPSILON = 1E-10;

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        double[] values = new double[4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                values[j] = in.nextDouble();
            }
            double solution = solutionFromGivenArray(values);
            System.out.println(solution);
        }
		in.close();
	}

	private static double solutionFromGivenArray (double[] arrayToUse) {
        double[] values = arrayToUse;
        double min = 0;
        double max = 100;
        double x = 0;
        boolean valueFound = false;
        while (valueFound == false) {
            x = (max + min)/2;
            double solution = (values[0]*x) + (values[1]*Math.sqrt(x*x*x)) - (values[2] * Math.exp((-x)/50)) - values[3];
            if (Math.abs(solution-0) > EPSILON && solution > 0) {
                max = x;
            }
            else if (Math.abs(solution-0) > EPSILON && solution < 0) {
                min = x;
            }
            else if (Math.abs(solution-0) < EPSILON) {
                valueFound = true;
            }
        }
        return x;
    }
}