import java.util.*;
import java.io.*;

public class maxOfArray {

	public static void main (String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int n;
		for (int i=0;i<300;i++) {
			n = in.nextInt();
			if (n > max) {
				max = n;
			} else if (n < min) {
				min = n;
			}
		} System.out.println(max + " " + min);
		in.close();
	}
}