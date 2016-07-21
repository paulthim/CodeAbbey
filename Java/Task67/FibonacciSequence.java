//67

import java.util.*;
import java.math.BigInteger;
import java.io.FileInputStream;
import java.io.IOException;

public class FibonacciSequence {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            BigInteger seed = new BigInteger(in.next());
            List<BigInteger> fibonacci = new LinkedList<BigInteger>();
            fibonacci.add(BigInteger.ZERO);
            fibonacci.add(BigInteger.ONE);
            while ((fibonacci.get(0)).compareTo(seed) < 0) {
                fibonacci.add(0, (fibonacci.get(0)).add(fibonacci.get(1)));
            }
            System.out.println(fibonacci.size()-2);
        }
		in.close();
	}
}