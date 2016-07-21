//75

import java.util.Scanner;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.IOException;

public class YachtPoker {

	private static final int[] diceRolls = new int[5];

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < diceRolls.length; j++) {
                    diceRolls[j] = in.nextInt();
                }
                Arrays.sort(diceRolls);
                String hand = handLabel();
                System.out.println(hand);
            }
		in.close();
	}

	private static int matchFinder(int roll) {
        int matches = 0;
        for (int i = 0; i < diceRolls.length; i++) {
            if (diceRolls[i] == roll) {
                matches++;
            }
        }
        return matches;
    }
    
    private static String handLabel() {
        String hand = "none";
        int[] smallStraight = {1, 2, 3, 4, 5};
        int[] bigStraight = {2, 3, 4, 5, 6};
        for (int j = 0; j < diceRolls.length; j++) {
            int roll = diceRolls[j];
            int matches = matchFinder(roll);
            if (matches > 1) {
                if (matches > 2) {
                    if (matches > 3) {
                        if (matches > 4) {
                            hand = "yacht";
                            break;
                        } else {
                            hand = "four";
                            break;
                        }
                    }
                    for (int k = 0; k < diceRolls.length; k++) {
                        if (diceRolls[k] != roll) {
                            int secondaryMatch = matchFinder(diceRolls[k]);
                            if (secondaryMatch > 1) {
                                hand = "full-house";
                                break;
                            }
                        } else {
                            hand = "three";
                            break;
                        }
                    }
                } else {
                    for (int k = 0; k < diceRolls.length; k++) {
                        if (diceRolls[k] != roll) {
                            int secondaryMatch = matchFinder(diceRolls[k]);
                            if (secondaryMatch > 1) {
                                if (secondaryMatch > 2) {
                                    hand = "full-house";
                                    break;
                                } else {
                                    hand = "two-pairs";
                                    break;
                                }
                            }
                        } else {
                            hand = "pair";
                            break;
                        }
                    }
                }
            } else if (Arrays.equals(diceRolls, smallStraight)) {
                hand = "small-straight";
            } else if (Arrays.equals(diceRolls, bigStraight)) {
                hand = "big-straight";
            }
        }
        return hand;
    }
}