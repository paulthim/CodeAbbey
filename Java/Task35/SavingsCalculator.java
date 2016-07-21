//35

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class SavingsCalculator {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            double accountSum = in.nextDouble();
            double finalSum = in.nextDouble();
            double interest = in.nextDouble();
            int years = 0;
            while (accountSum < finalSum) {
                double interestSum = accountSum * (interest/100);
                int roundedInterest = (int)(interestSum*100);
                interestSum = roundedInterest;
                interestSum = interestSum/100;
                accountSum = accountSum + interestSum;
                years++;
            }
            System.out.println(years);
        }
		in.close();
	}
}