//10

import java.util.Scanner;

public class LinearFunction {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int a = (y2 - y1)/(x2 - x1);
            int b = y1 - (x1 * a);
            System.out.println("(" + a + " " + b + ") ");
        }
		in.close();
	}
}