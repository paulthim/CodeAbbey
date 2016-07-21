//73

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class HexagonalGrid {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            double x = 0;
            double y = 0;
            char move;
            String moveSeries = in.next();
            for (int j = 0; j < moveSeries.length(); j++) {
                move = moveSeries.charAt(j);
                switch (move) {
                    case 'A': x += 1;
                        break;
                    case 'B': x += 0.5;
                            y += Math.sqrt(0.75);
                        break;
                    case 'C': x -= 0.5;
                            y += Math.sqrt(0.75);
                        break;
                    case 'D': x -= 1;
                        break;
                    case 'E': x -= 0.5;
                           y -= Math.sqrt(0.75);
                        break;
                    case 'F': x += 0.5;
                           y -= Math.sqrt(0.75);
                        break;
                    default: break;
                }
            }
            System.out.println(Math.sqrt(Math.pow(y, 2) + Math.pow(x, 2)));
        }
		in.close();
	}
}