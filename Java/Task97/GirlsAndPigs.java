//97

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class GirlsAndPigs {

	private static final int lG = 2;
    private static final int lP = 4;
    private static final int bG = 2;

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int legsTotal = in.nextInt();
            int breastsTotal = in.nextInt();
            int possibleSolutions = 0;
            for (int pigs = 1; pigs <= (legsTotal/lP); pigs++) {
                int girls = (legsTotal-(pigs*lP))/2;
                if ((breastsTotal - (girls*bG))%pigs == 0 && girls > 0) {
                    int bP = (breastsTotal - (girls*bG))/pigs;
                    if (bP%2 == 0) {
                        possibleSolutions++;
                    }
                }
            }
            System.out.println(possibleSolutions);
        }
		in.close();
	}
}