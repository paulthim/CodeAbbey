//72

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class FunnyWordGenerator {

	private static final char[] vowels = {
        'a',
        'e',
        'i',
        'o',
        'u'
    };
    
    private static final char[] consonants = {
        'b',
        'c',
        'd',
        'f',
        'g',
        'h',
        'j',
        'k',
        'l',
        'm',
        'n',
        'p',
        'r',
        's',
        't',
        'v',
        'w',
        'x',
        'z'
    };

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int x = in.nextInt();
        int a = 445;
        int c = 700001;
        int m = 2097152;
        for (int i = 0; i < n; i++) {
            int l = in.nextInt();
            char[] word = new char[l];
            for (int j = 0; j < word.length; j++) {
                x = (a * x + c) % m;
                if (j%2 == 0) {
                    System.out.print(consonants[x%19]);
                } else {
                    System.out.print(vowels[x%5]);
                }
            }
            System.out.println();
        }
		in.close();
	}
}