import java.util.*;
import java.io.*;

class minOfTwo {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int a;
        int b;
        for(int i=0; i<n; i++) {
            a = in.nextInt();
            b = in.nextInt();
            if (a < b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
        in.close();
    }
}