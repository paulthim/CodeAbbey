//61

import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;

public class PrimeNumberGeneration {

	private static ArrayList<Integer> primes = null;
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int[] primesIndex = new int[n];
        for (int i = 0; i < n; i++) {
            primesIndex[i] = in.nextInt();
        }
        primeIndex(primesIndex);
        in.close();
    }
    
    static {
        primes = new ArrayList<Integer>();
        primes.add(2);        
    }
    
    private static void populatePrimes(int length) {
        int start = primes.get(primes.size() - 1) + 1;
        for (int i = start; primes.size() < length; i++) {
            if (isPrime(i)) primes.add(i);
        }
    }
    
    public static boolean isPrime (int i) {
        if (i == 1) return false;
        int limit = (int) Math.floor(Math.sqrt(i));
        int counter = 0;
        while (counter < primes.size() && primes.get(counter) <= limit) {
            if (i % primes.get(counter) == 0) return false;
            counter++;
        }
        return true;
    }
    
    public static void primeIndex(int[] primesIndex) {
        populatePrimes(200000);
        for (int i = 0; i < primesIndex.length; i++) {
            System.out.println(primes.get(primesIndex[i]-1));
        }
	}
}