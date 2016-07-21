//120

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            int limit = n-i;
            int index = findMaxNumber(array, limit);
            System.out.println(index);
            int swap = array[limit-1];
            array[limit-1] = array[index];
            array[index] = swap;

        }
        in.close();
    }
    
    private static int findMaxNumber (int[] arrayToScan, int length) {
        int[] array = arrayToScan;
        int n = length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > array[index]) {
                index = i;
            }
        }
        return index;
	}
}