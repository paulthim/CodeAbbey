//21

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class ArrayCounters {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int m = in.nextInt();
        int a;
        int digitCount = 0;
        int[] count = new int[n];
        int[] total = new int[m+1];
        for (int i = 0; i < n; i++) {
            count[i] = in.nextInt();
            for (int j = 0; j <= m; j++) {
                if (count[i] == j) {
                total[j] = total[j] + 1;
                }
            }
        } for (int i = 1; i <= m; i++) {
            System.out.println(total[i] + " ");
        }
		in.close();
	}
}