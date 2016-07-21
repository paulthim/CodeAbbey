import java.util.*;
import java.io.*;

public class IntegerFactoring {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> primesList = new ArrayList<Integer>(1);
            int prime = 2;
            long number = in.nextLong();
            while (number > prime) {
                if (number%prime == 0) {
                    primesList.add(prime);
                    number = number/prime;
                } else {
                    prime++;
                }
            }
            for (Object primesList1 : primesList) {
                System.out.print(primesList1 + "*");
            }
            System.out.println(number);
        }
        in.close();
    }
}
