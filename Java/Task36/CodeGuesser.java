//36

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;

public class CodeGuesser {

	private static ArrayList<int[]> guesses = new ArrayList<>();
    private static ArrayList<Integer> responses = new ArrayList<>();
    private static List<Integer> possibleFirstDigit = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
    private static List<Integer> possibleSecondDigit = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
    private static List<Integer> possibleThirdDigit = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
    private static List<Integer> possibleFourthDigit = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
    private static boolean[] digitKnownAtPos = {false, false, false, false};
    private static List<Integer> finalNumber = new ArrayList<>(Arrays.asList(0,0,0,0));

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            while (in.hasNextLine()) {
                String guessAsString = in.next();
                int[] guess = stringToIntArray(guessAsString);
                int response = in.nextInt();
                if (response == 3) {
                    for (int k = 0; k < 4; k++) {
                        System.out.print(guess[k]);
                    }
                    break;
                } else if (response == 0) {
                    removeGuessOption(guess);
                } else {
                    guesses.add(guess);
                    responses.add(response);
                }
            };
        }
        for (int i = 0; i < responses.size(); i++) {
            if (responses.get(i) == 1) {
                int[] guess = guesses.get(i);
                boolean digitFound = singleDigitMatch(guess);
                if (digitFound) {
                    responses.remove(i);
                    guesses.remove(i);
                    i--;
                }
            }
        }
        for (int i = 0; i < responses.size(); i++) {
            if (responses.get(i) == 1) {
                int[] guess = guesses.get(i);
                boolean digitFound = singleDigitMatch(guess);
                if (digitFound) {
                    responses.remove(i);
                    guesses.remove(i);
                    i--;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(finalNumber.get(i));
        }
		in.close();
	}

	private static int[] stringToIntArray(String string) {
        String[] guessAsStringArray = string.split("");
        int[] separatedDigits = new int[4];
        for (int i = 0; i < 4; i++) {
            separatedDigits[i] = Integer.parseInt(guessAsStringArray[i]);
        }
        return separatedDigits;
    }
    
    // takes a four-digit guess and removes all its corresponding digits
    private static void removeGuessOption(int[] guess) {
        for (int i = 0; i < 4; i++) {
            if (isPossibleDigit(guess[i], (i+1)) && !digitKnownAtPos[i]) {
                removeDigitOption(guess[i], (i+1));
            }
        }
    }
    
    // removes an individual digit and removes it from the list of possibles in its position
    private static void removeDigitOption(int digitToRemove, int position) {
        int index;
        switch (position) {
            case 1: index = possibleFirstDigit.indexOf(digitToRemove);
                    possibleFirstDigit.remove(index);
                    break;
            case 2: index = possibleSecondDigit.indexOf(digitToRemove);
                        possibleSecondDigit.remove(index);
                    break;
            case 3: index = possibleThirdDigit.indexOf(digitToRemove);
                        possibleThirdDigit.remove(index);
                    break;
            case 4: index = possibleFourthDigit.indexOf(digitToRemove);
                        possibleFourthDigit.remove(index);
                    break;
        }
    }
    
    // checks if a digit is still a viable option for a given position
    private static boolean isPossibleDigit(int digit, int pos) {
        switch (pos) {
        case 1: if (possibleFirstDigit.indexOf(digit) >= 0) {
                return true;
                } else {return false;}
        case 2: if (possibleSecondDigit.indexOf(digit) >= 0) {
                return true;
                } else {return false;}
        case 3: if (possibleThirdDigit.indexOf(digit) >= 0) {
                return true;
                } else {return false;}
        case 4: if (possibleFourthDigit.indexOf(digit) >= 0) {
                return true;
                } else {return false;}
        default : return false;
        }
    }
    
    // deletes all digits from a targeted array except for the desired digit 
    private static void trimArrayToDigit(int digit, int pos) {
        switch (pos) {
        case 1: possibleFirstDigit.clear();
                possibleFirstDigit.add(digit);
                break;
        case 2: possibleSecondDigit.clear();
                possibleSecondDigit.add(digit);
                break;
        case 3: possibleThirdDigit.clear();
                possibleThirdDigit.add(digit);
                break;
        case 4: possibleFourthDigit.clear();
                possibleFourthDigit.add(digit);
                break;
        }
    }
    
    // checks if a guess has only one possible digit. if it does, calls trimArrayToDigit()
    private static boolean singleDigitMatch(int[] guess) {
        boolean digitFound = false;
        int posMatch = 0;
        int tally = 0;
        for (int i = 0; i < 4; i++) {
            if (isPossibleDigit(guess[i], (i+1)) && !digitKnownAtPos[i]) {
                tally++;
                posMatch = i;
            }
        }
        if (tally == 1) {
            trimArrayToDigit(guess[posMatch], (posMatch+1));
            finalNumber.add(posMatch, guess[posMatch]);
            digitFound = true;
        } 
        return digitFound;
    }
}