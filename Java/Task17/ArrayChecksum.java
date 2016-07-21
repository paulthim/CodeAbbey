//17

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class ArrayChecksum {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        long[] list = new long[n];
        for (int i = 0; i < n; i++) {
            list[i] = in.nextLong();
        }
        long result = 0;
        for (int i =0; i < n; i++) {
            result = (result + list[i]) * 113;
            result = result%10000007;
        } System.out.println(result);
		in.close();
	}
}