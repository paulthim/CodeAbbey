import java.util.*;
import java.io.*;

class sumsInLoop {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int a;
		int b;
        int sum;
        for(int i=0; i<n; i++) {
			a = in.nextInt();
			b = in.nextInt();
            sum = a + b;
			System.out.println(sum + " ");
        }
        in.close();
    }
}