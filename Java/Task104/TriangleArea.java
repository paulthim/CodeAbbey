//104

import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int[] x = new int[3];
            int[] y = new int[3];
            for (int j = 0; j < 3; j++) {
                x[j] = in.nextInt();
                y[j] = in.nextInt();
            }
            double sA = Math.sqrt(Math.pow((x[1]-x[0]),2) + Math.pow((y[1]-y[0]),2));
            double sB = Math.sqrt(Math.pow((x[2]-x[1]),2) + Math.pow((y[2]-y[1]),2));
            double sC = Math.sqrt(Math.pow((x[0]-x[2]),2) + Math.pow((y[0]-y[2]),2));
            double a = (Math.sqrt((4*sA*sA*sB*sB)-Math.pow(((sA*sA)+(sB*sB)-(sC*sC)),2)))/4;
            System.out.println(a);
        }
		in.close();
	}
}