//62

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;

public class PrimeRanges {

	private static final List<Integer> primesBeforeIndex = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        populatePrimes();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(primesBeforeIndex.indexOf(b) - primesBeforeIndex.indexOf(a) + 1);
        }
		in.close();
	}

	private static void populatePrimes() {
        primesBeforeIndex.add(2);
        for (int i = 3; i < 3000000; i++) {
            if (isPrime(i)) {
                primesBeforeIndex.add(i);
            }
        }
    }

    public static boolean isPrime(int possiblePrime) {
        int rootLimit = (int) Math.floor(Math.sqrt(possiblePrime));
        for (int j = 0; j < rootLimit; j++) {
            if (possiblePrime % primesBeforeIndex.get(j) == 0) {
                return false;
            }
        }
        return true;
    }
}