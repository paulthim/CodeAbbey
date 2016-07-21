//29

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class SortWithIndex {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int[] unsortedArray = new int[n];
        for (int i = 0; i < n; i++) {
            unsortedArray[i] = in.nextInt();
        }
        int[] sortedArray = Arrays.copyOf(unsortedArray,n);
        int[] indexArray = new int[n];
        Arrays.sort(sortedArray);
        for (int i = 0; i < n; i++) {
            int loc = Arrays.binarySearch(sortedArray, unsortedArray[i]);
            indexArray[loc] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(indexArray[i] + " ");
        }
		in.close();
	}
}