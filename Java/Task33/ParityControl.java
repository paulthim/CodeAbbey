//33

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class ParityControl {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
            char c = (char)in.nextInt();
            int b = 0;
            for (int i = 0; i < 8; i++) {
                b += ((c >> i) & 1);
            }
            if (b%2 == 0) {
                int k = (int)c;
                String binaryString = Integer.toBinaryString(k);
                String decodedBinaryString;
                if (binaryString.length() < 8) {
                    decodedBinaryString = "0" + binaryString;
                    k = Integer.parseInt(decodedBinaryString, 2);
                    c = (char)k;
                    System.out.print(c);
                } else if (binaryString.length() == 8 && binaryString.charAt(0) == '1') {
                    decodedBinaryString = "0" + binaryString.substring(1);
                    k = Integer.parseInt(decodedBinaryString, 2);
                    c = (char)k;
                    System.out.print(c);
                }
            }
        }
		in.close();
	}
}