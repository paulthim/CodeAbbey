//13

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class WeightedSumOfDigits {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int wholeNumber;
        String integerString = new String();
        String digitString = new String();
        char[] integerArray;
        int digit;
        int weightedSum;
        for (int i = 0; i < n; i++) {
            weightedSum = 0;
            wholeNumber = in.nextInt();
            integerString = String.valueOf(wholeNumber);
            integerArray = integerString.toCharArray();
            for (int a = 0; a < integerArray.length; a++) {
                digitString = String.valueOf(integerArray[a]);
                digit = Integer.parseInt(digitString);
                weightedSum += (digit * (a+1));
            } System.out.println(weightedSum + " ");
        }
		in.close();
	}
}