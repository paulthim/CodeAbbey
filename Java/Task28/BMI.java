import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class BMI {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		double n = in.nextInt();
		double weight;
		double height;
		double bmi;
		for (int i = 0; i < n; i++) {
			weight = in.nextDouble();
			height = in.nextDouble();
			bmi = (weight)/(height*height);
			if (bmi < 18.5) {
				System.out.println("under ");
			} else if (bmi < 25) {
				System.out.println("normal ");
			} else if (bmi < 30) {
				System.out.println("over ");
			} else {
				System.out.println("obese ");
			}
		}
		in.close();
	}
}