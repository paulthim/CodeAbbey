package codeabbey;
import java.io.*;
import java.util.*;


class pythagoreanTriple {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileInputStream("input.txt"));
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long sum = in.nextLong();
            // Attempt: kx(x+y) = sum/2
            List<Integer> l = new LinkedList<>();
            for (int j = 2; j < sum; j++) {
                if (sum%j == 0) {
                 l.add(j);
                }
            }
            Collections.sort(l);
            for (int x : l) {
                for (int s : l) {
                    if ((n/2)%(x*s) == 0) {
                        if (x<s && s<x*2) {
                            long y = s-x;
                            long k = ((sum/2)/x)/s;
                            long c = k*(x*x + y*y);
                            System.out.println(c*c);
                        }
                    }
                }
            }
        }
        in.close();
    }
}
