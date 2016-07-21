//55

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileInputStream;
import java.io.IOException;

public class MatchingWords {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		ArrayList<String> l = new ArrayList<String>();
        ArrayList<String> pL = new ArrayList<String>();
        while (in.hasNext()) {
            String s = in.next();
            if (s == "end") {
                break;
            } else {
                if (l.contains(s) && !pL.contains(s)) {
                    pL.add(s);
                } else {
                    l.add(s);
                }
            }
        }
        Collections.sort(pL);
        for (String s: pL) {
            System.out.println(s + " ");
        }
		in.close();
	}
}