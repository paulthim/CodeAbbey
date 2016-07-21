
import java.util.*;
import java.io.*;

public class triangleSides {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if (a > b && a > c) {
                if ((b+c) >= a) {
                System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            } else if (b > a && b > c) {
                if ((a+c) >= b) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            } else if ((a+b) >= c) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
        in.close();
    }
}
