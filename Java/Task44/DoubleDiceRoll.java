//44

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class DoubleDiceRoll {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = (a%6) + (b%6) + 2;
            System.out.println(c + " ");
        }
		in.close();
	}
}