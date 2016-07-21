//51

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.io.FileInputStream;
import java.io.IOException;

public class DNDDice {

	public static int[] diceSets = {2, 4, 6, 8, 10, 12};

    public static double[] diceSetAverage;

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
            int diceCount = 0;
            int diceSize = 0;
            List<Integer> sampleRolls = new LinkedList<>();
            for (int j = 0; j < 101; j++) {
                int n = in.nextInt();
                if (n != 0) {
                    sampleRolls.add(n);
                }
            }
            sampleRolls.sort(null);
            double sum = 0;
            for (int r : sampleRolls) sum += r;
            double inputSetAverageRoll = sum/sampleRolls.size();
            double trialSetAverageRoll = 0;
            for (int j = 1; j <5; j++) {
                for (int k = 0; k < diceSets.length; k++) {
                    
                    if (Math.abs(inputSetAverageRoll - trialSetAverageRoll) > Math.abs(inputSetAverageRoll - diceAverager(j,k))) {
                        if (j*diceSets[k] >= sampleRolls.get(99)) {
                            trialSetAverageRoll = diceAverager(j,k);
                            diceCount = j;
                            diceSize = diceSets[k];
                        }
                    }
                }
            }
            System.out.println(diceCount + "d" + diceSize);
        }
		in.close();
	}

	private static double diceAverager(int count, int size) {
        double setAverage;
        int diceCount = count;
        int dieSize = diceSets[size];
        
        double trialAverage = 0;
        for (int trialRun = 0; trialRun < 4; trialRun++) {
            double sum = 0;
            for (int i = 0; i < 100; i++) {
                int roll = (int)(Math.random()*dieSize + 1) * count;
                sum += roll;
            }
            trialAverage += (sum/100);
            
        }
        setAverage = (trialAverage/4);
        return setAverage;
    }
}