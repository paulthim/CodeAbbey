//57

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class SmoothTheWeather {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        double[] unprocessed = new double[n];
        double[] processed = new double[n];
        for (int i = 0; i < n; i++) {
            unprocessed[i] = in.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            if (i > 0 && i < n - 1) {
                processed[i] = (unprocessed[i-1] + unprocessed[i] + unprocessed[i+1])/3;
            } else {
                processed[i] = unprocessed[i];
            }
            System.out.println(processed[i]);
        }
		in.close();
	}
}