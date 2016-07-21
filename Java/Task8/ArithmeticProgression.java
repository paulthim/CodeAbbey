//8

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class ArithmeticProgression {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int finalTotal = 0;
            for (int j = 0; j < c; j++) {
                finalTotal += a + (b*j);
            }
            System.out.println(finalTotal);
        }
		in.close();
	}
}