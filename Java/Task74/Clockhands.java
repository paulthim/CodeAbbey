//75

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Clockhands {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i ++) {
            String analogTime = in.next();
            Scanner timeParse = new Scanner(analogTime);
            timeParse.useDelimiter(":");
            double hour = timeParse.nextDouble();
            if (hour > 12) {
                hour = hour - 12;
            } else if (hour == 0) {
                hour = 12;
            }
            double minute = timeParse.nextDouble();
            double hourAngle = (((60*hour) + minute)/2);
            if (hourAngle >= 360) {
                hourAngle -= 360;
            }
            hourAngle = Math.toRadians(hourAngle);
            double minuteAngle = ((((double)minute)/60) * 360);
            minuteAngle = Math.toRadians(minuteAngle);
            double hourY = Math.cos(hourAngle)*6 + 10;
            double hourX = Math.sin(hourAngle)*6 + 10;
            double minuteY = Math.cos(minuteAngle)*9 + 10;
            double minuteX = Math.sin(minuteAngle)*9 + 10;
            System.out.println(hourX + " " + hourY + " " + minuteX + " " + minuteY);
        }
        in.close();
    }
}