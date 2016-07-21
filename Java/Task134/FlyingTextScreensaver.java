//134

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class FlyingTextScreensaver {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int width = in.nextInt();
        int height = in.nextInt();
        int stringLength = in.nextInt();
        int stringX = 0;
        int stringY = 0;
        int initX = 1;
        int initY = 1;
        for (int i = 0; i <= 100; i++) {
            System.out.println(stringX + " " + stringY);
            stringX += initX;
            stringY += initY;
            if (stringX == width - stringLength || stringX == 0) {
                initX = -initX;
            }
            if (stringY == height - 1 || stringY == 0) {
                initY = -initY;
            }

        }
		in.close();
	}
}