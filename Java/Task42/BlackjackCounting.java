//42

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class BlackjackCounting {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
               while (in.hasNextLine()) {
                   String hand = in.nextLine();
                   int sum = 0;
                   for (int j = 0; j < hand.length(); j++) {
                       if (hand.charAt(j) == 'T' || hand.charAt(j) == 'J' || hand.charAt(j) == 'Q' || hand.charAt(j) == 'K') {
                           sum += 10;
                       } else if (hand.charAt(j) == 'A' && sum <= 10) {
                           sum += 11;
                       } else if (hand.charAt(j) == 'A' && sum > 10) {
                           sum += 1;
                       } else if (Character.getNumericValue(hand.charAt(j)) > 0) {
                           sum += Character.getNumericValue(hand.charAt(j));
                       }
                   }
                   if (sum <= 21 && sum > 0) {
                       System.out.println(sum);
                   } else if (sum > 21) {
                       System.out.println("Bust");
                   }
               }
        }
		in.close();
	}
}