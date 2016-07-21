//49

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class RockPaperScissors {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            while (in.hasNextLine()) {
                String record = in.nextLine();
                int r = 0;
                Scanner s = new Scanner(record);
                while (s.hasNext()) {
                    String m = s.next();
                    if (m.equals("PR") || m.equals("RS") || m.equals("SP")) {
                        r++;
                    } else if (m.equals("RP") || m.equals("SR") || m.equals("PS")) {
                        r--;
                    }
                }
                s.close();
                if (r > 0) {
                    System.out.println(1);
                } else if (r < 0) {
                    System.out.println(2);
                }
            }
        }
		in.close();
	}
}