//CodeAbbey #11

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a;
		int b;
		int c;
		int value;
		int sum;
		for (int i = 0; i < n; i++) {
			value = 0;
			sum = 0;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			value = a * b + c;
			while (value > 0) {
				sum += value%10;
				value = value/10;
			} System.out.println(sum + " ");
		}
		in.close();
	}
}