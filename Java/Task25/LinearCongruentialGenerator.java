//25

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LinearCongruentialGenerator {

	private static int[][] linearArray;

    public static void main(String[] args) {
        try{
        	int n = populateArray();
        	for (int i = 0; i < n; i++) {
            	int pseudoRandom = generatePseudoRandom(i);
            	System.out.println(pseudoRandom);
        	}
        }
        catch (IOException e) {
        	System.out.println("Could Not Populate Array");
        }
    }

	private static int populateArray() throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        linearArray = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
            linearArray[i][j] = in.nextInt();
            }
        }
        in.close();
        return n;
    }
    
    private static int generatePseudoRandom(int n) {
            int a = linearArray[n][0];
            int c = linearArray[n][1];
            int m = linearArray[n][2];
            int x = linearArray[n][3];
            int finalIndex = linearArray[n][4];
            int count = 0;
            while (count < finalIndex) {
                x = (a * x + c) % m;
                count++;
            }
            return x;
    }
}