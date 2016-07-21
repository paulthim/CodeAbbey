//22
//Have to recreate the god damn Printer class

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class TwoPrinters {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int k = in.nextInt();
            printer printerX = new printer(x);
            printer printerY = new printer(y);
            while (k > 0) {
                if (printerX.next() < printerY.next()) {
                    printerX.queuePage();
                    k--;
                } else {
                    printerY.queuePage();
                    k--;
                }
            }
            System.out.println(Math.max(printerX.finishTime(), printerY.finishTime()));
        }
		in.close();
	}
}