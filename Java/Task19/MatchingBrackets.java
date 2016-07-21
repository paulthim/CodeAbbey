//19

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;

public class MatchingBrackets {
	private static final List<Character> openBrackets = Arrays.asList(
        '(',
        '{',
        '[',
        '<'
    );
    private static final List<Character> closeBrackets = Arrays.asList(
        ')',
        '}',
        ']',
        '>'
    );
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        String s = in.nextLine();
        for (int i = 0; i < n; i++) {
            while (in.hasNextLine()) {
                s = in.nextLine();
                if (isBracketComplete(s)) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
		in.close();
	}

	private static boolean isBracketComplete(String s) {
        List<Character> bracketTally = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (openBrackets.contains(c)) {
                bracketTally.add(0, c);
            } else if (closeBrackets.contains(c)) {
                if (openBrackets.get(closeBrackets.indexOf(c)) == bracketTally.get(0)) {
                    bracketTally.remove(0);
                } else {
                    return false;
                }
            }
        }
        if (bracketTally.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}