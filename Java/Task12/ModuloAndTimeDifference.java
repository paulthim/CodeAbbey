//12

import java.util.Scanner;

public class ModuloAndTimeDifference {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++){
			//take in first days, calculate to seconds
			int startingSeconds = in.nextInt() * 60 * 60 * 24;
			//take in first hours, calculate to seconds
			startingSeconds += in.nextInt() * 60 * 60;
			//take in first minutes, calculate to seconds;
			startingSeconds += in.nextInt() * 60;
			//take in first seconds
			startingSeconds += in.nextInt();
			//take in final days, do as above
			int finalSeconds = in.nextInt() * 60 * 60 * 24;
			finalSeconds += in.nextInt() * 60 * 60;
			finalSeconds += in.nextInt() * 60;
			finalSeconds += in.nextInt();
			int timeDifference = finalSeconds - startingSeconds;
			int finalDays = timeDifference/86400;
			timeDifference = timeDifference%86400;
			int finalHours = timeDifference/3600;
			timeDifference = timeDifference%3600;
			int finalMinutes = timeDifference/60;
			timeDifference = timeDifference%60;
			finalSeconds = timeDifference;
			System.out.println("(" + finalDays + " " + finalHours + " " + finalMinutes + " " + finalSeconds + ") ");
		}
		in.close();
		in.close();
	}
}