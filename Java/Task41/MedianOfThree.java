import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class MedianOfThree {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String check = new String(in.nextLine());
		int vowels;
		for (int i = 0; i < n; i++) {
			vowels = 0;
			check = in.nextLine();
				for (int a = 0; a < check.length(); a++) {
					char ch = check.charAt(a);
					if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
						vowels++;
					}
				} System.out.println(vowels + " ");
		}
		in.close();
	}
}