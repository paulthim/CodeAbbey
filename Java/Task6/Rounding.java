import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Rounding {
	public static void main (String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double a;
		double b;
		int[] doubleRound = new int[n];
		for (int i = 0; i < n; i++) {
			a = in.nextInt();
			b = in.nextInt();
			double divide = a / b;
			double averageDouble = Math.round(divide);
			int averageInt = (int)averageDouble;
			System.out.println(averageInt + " ");
		}
		in.close();
	}
}
			