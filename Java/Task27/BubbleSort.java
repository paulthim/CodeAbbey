//27

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class BubbleSort {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int runCount = 1;
        int swap = 0;
        int pass = 0;
        int[] bubbleList = new int[n];
        for (int i = 0; i < n; i++) {
            bubbleList[i] = in.nextInt();
        }
        while (runCount > 0) {
            runCount = 0;
            for (int i = 0; i < n-1; i++) {
                if (bubbleList[i] > bubbleList[i+1]) {
                    int t = bubbleList[i];
                    bubbleList[i] = bubbleList[i+1];
                    bubbleList[i+1] = t;
                    swap++;
                    runCount++;
                }
            } pass++;
        }
         System.out.println(pass + " " + swap);
		in.close();
	}
}