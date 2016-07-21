//121

import java.util.Scanner;
import java.util.ArrayList;

public class InsertionsSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>(n);
        int nextNumber = in.nextInt();
        array.add(nextNumber);
        for (int i = 0; i < n-1; i++) {
            nextNumber = in.nextInt();
            int index = 0;
            for (int j = 0; j < array.size(); j++) {
                if (nextNumber > array.get(j)) {
                    index++;
                }
            }
            array.add(index, nextNumber);
            System.out.println(array.size() -1 - index + " ");
        }
		in.close();
	}
}