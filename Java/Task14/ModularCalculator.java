//14

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class ModularCalculator {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        char oper = in.next().charAt(0);
        int i = 0;
        while (i < 1) {
            if (oper == '+') {
            n = n + in.nextInt();
            oper = in.next().charAt(0);
            } else if (oper == '*') {
            n = n * in.nextInt();
            oper = in.next().charAt(0);
            } else if (oper == '%') {
            n = n % in.nextInt();
            System.out.println(n);
            i++;
            }
        }
		in.close();
	}
}