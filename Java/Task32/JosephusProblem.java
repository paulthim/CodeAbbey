//32

import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;

public class JosephusProblem {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int step = in.nextInt();
        ArrayList<Integer> army = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            army.add(i+1);
        }
        int deadSoldier = 0;
        while(army.size() > 1) {
            deadSoldier = (deadSoldier + step - 1) % army.size();
            army.remove(deadSoldier);
        }
        System.out.println(army.get(0));
		in.close();
	}
}