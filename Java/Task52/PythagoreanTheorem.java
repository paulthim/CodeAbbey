//52

import java.util.Scanner;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.IOException;

public class PythagoreanTheorem {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int[] sides = new int[]{
                in.nextInt(),
                in.nextInt(),
                in.nextInt()
            };
            Arrays.sort(sides);
            int h = (sides[0] * sides[0]) + (sides[1] * sides[1]);
            if (Math.sqrt(h) == sides[2]) {
                System.out.println("R ");
            } else if (Math.sqrt(h) > sides[2]) {
                System.out.println("A ");
            } else {
                System.out.println("O ");
            }
        }
		in.close();
	}
}