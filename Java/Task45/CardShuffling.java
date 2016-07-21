//45

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;

public class CardShuffling {

	private static final char[] rankArray = {
        'A',
        '2',
        '3',
        '4',
        '5',
        '6',
        '7',
        '8',
        '9',
        'T',
        'J',
        'Q',
        'K'
    };
    
    private static final char[] suitArray = {
        'C',
        'D',
        'H',
        'S'
    };

	public static void main(String[] args) throws IOException {
		List<String> deck = new ArrayList<String>();
        for (int i = 0; i < suitArray.length; i++) {
            for (int j = 0; j < rankArray.length; j++) {
                String card = new StringBuilder().append("").append(suitArray[i]).append(rankArray[j]).toString();
                deck.add(card);
            }
        }
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
            for (int i = 0; i < deck.size(); i++) {
                int n = in.nextInt();
                if (n > 52) {
                    n = n%52;
                }
                String cardToMove = deck.get(i);
                String cardToReplace = deck.get(n);
                deck.set(n, cardToMove);
                deck.set(i, cardToReplace);
            }
        }
        for (String card : deck) {
            System.out.println(card);
        }
		in.close();
	}
}