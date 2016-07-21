package codeabbey.SolvedTasks;

import java.io.*;
import java.util.*;

public class SharePriceVolatility {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileInputStream("input.txt"));
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String ticker = in.next();
            List<Double> prices = new ArrayList<>();
            Double mean = 0.0;
            while (in.hasNextDouble()) {
                Double x = in.nextDouble();
                prices.add(x);
                mean += x;
            }
            mean = mean/prices.size();
            double sum = 0.0;
            for (double price : prices) {
                sum += Math.pow((price - mean), 2);
            }
            Double sD = Math.sqrt(sum/(prices.size()-1));
            if (sD > (mean*0.04)) {
                System.out.println(ticker);
            }
        }
        in.close();
    }
}
