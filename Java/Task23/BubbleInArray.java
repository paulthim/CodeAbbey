//23

import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;

public class BubbleInArray {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> swapArray = new ArrayList<Integer>();
        while (in.hasNextInt()) {
            swapArray.add(in.nextInt());
        }
        swapArray.remove(swapArray.indexOf(-1));
        int length = swapArray.size();
        int swaps = 0;
        for (int i = 0; i < length-1; i++) {
            if (swapArray.get(i) > swapArray.get(i+1)) {
                int swapSpace = swapArray.get(i);
                swapArray.set(i, swapArray.get(i+1));
                swapArray.set(i+1, swapSpace);
                swaps++;
            }
        }
        int result = 0;
        for (int i = 0; i < length; i++) {
            result = (result + swapArray.get(i)) * 113;
            result = result%10000007;
        }
        System.out.println(swaps + " " + result);
		in.close();
	}
}