//48

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class CollatzSequence {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int count;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            count = 0;
            while (a > 1) {
                if((a%2)==0) {
                    a = a/2;
                    count++;
                } else {
                    a = 3 * a + 1;
                    count++;
                }
            } System.out.println(count + " ");
        }
		in.close();
	}
}