import java.io.*;
import java.util.*;

class sumInLoop {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int[] list = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++) {
            list[i] = in.nextInt();
            sum += list[i];
        }
        System.out.println(sum);
        in.close();
    }
}