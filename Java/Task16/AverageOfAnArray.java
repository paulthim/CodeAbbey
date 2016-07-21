//#16

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class AverageOfAnArray {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        double a;
        double sum = 0;
        double count = 0;
        for (int i = 0; i < n; i++) {
            a = in.nextInt();
            while (a > 0) {
                sum += a;
                count++;
                a = in.nextInt();
            } System.out.println(Math.round(sum/count) + " ");
            sum = 0;
            count = 0;
        }
		in.close();
	}
}