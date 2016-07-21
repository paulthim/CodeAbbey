//81

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class BitCount {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int intToBit = in.nextInt();
            int ones = bitsInInt(intToBit);
            System.out.println(ones);
        }
        in.close();
    }
    
    private static int bitsInInt(int intToBit) {
        String bitString = Integer.toBinaryString(intToBit);
        int ones = 0;
        for (int i = 0; i < bitString.length(); i++) {
            if (bitString.charAt(i) == '1') ones++;
        }
        return ones;
    }
}