//58

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class CardNames {

	private static String[] suits = {
        "Clubs",
        "Spades",
        "Diamonds",
        "Hearts"
    };
    private static String[] ranks = {
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
        "Jack",
        "Queen",
        "King",
        "Ace"
    };

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
            int c = in.nextInt();
            int s = c/13;
            int r = c%13;
            System.out.println(ranks[r]+"-of-"+suits[s]);
        }
		in.close();
	}
}