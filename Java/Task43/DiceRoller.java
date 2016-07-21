//CodeAbbey Exercise #43

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class DiceRoller {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int side = 6;
		double randVal;
		int diceVal;
		for (int i = 0; i < n; i++) {
			randVal = in.nextDouble();
			randVal = Math.floor(randVal * side);
			diceVal = (int)randVal + 1;
			System.out.println(diceVal + " ");
		}
		in.close();
	}
}