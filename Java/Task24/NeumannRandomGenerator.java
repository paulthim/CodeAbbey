//24

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class NeumannRandomGenerator {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int count;
        int seed;
        for (int i = 0; i < n; i++) {
            seed = in.nextInt();
            count = 0;
            int[] iter = new int[200];
            Arrays.sort(iter);
            System.out.println(seed);
            while (Arrays.binarySearch(iter,seed) < 0) {
                iter[count] = seed;
                Arrays.sort(iter);
                seed = seed * seed;
                seed = seed/100;
                seed = seed%10000;
                count++;
            }
            if (count == 1) {
                count += 1;
            }
            System.out.println(count + " ");
            }
		in.close();
	}
}