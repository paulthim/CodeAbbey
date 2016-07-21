//68

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class BicycleRace {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            double s = in.nextDouble();
            double a = in.nextDouble();
            double b = in.nextDouble();
            double d = s/(a+b);
            System.out.println(a*d);
        }
		in.close();
	}
}