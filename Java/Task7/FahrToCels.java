import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class FahrToCels {
	public static void main (String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int f;
		double doubleTemp;
		int c;
		for (int i = 0; i < n; i++) {
			f = in.nextInt();
			doubleTemp = Math.round((f-32)/1.8);
			System.out.println((int)doubleTemp + " ");
			
		}
		in.close();
	}
}