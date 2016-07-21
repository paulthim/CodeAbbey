package codeabbey.SolvedTasks.quadraticSolver;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author paulthim
 */
public class quadraticSolver {
    public static void main(String[] args) throws IOException { //This will take in the number count as well as initiate the necessary algorithm on each number
            Scanner in = new Scanner(new FileInputStream("input.txt"));
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                double dA = in.nextDouble();
                double dB = in.nextDouble();
                double dC = in.nextDouble();
                if ((dB*dB-4*dA*dC) < 0) {
                    double doubleSol = (dB*dB-4*dA*dC);
                    int intA = (int)(-dB/(2*dA));
                    int intB = (int)(Math.sqrt(-1*(dB*dB-4*dA*dC))/(2*dA));
                    System.out.print(intA + "+" + intB + "i " + intA + "-" + intB + "i");
                    if (i<n-1) {
                        System.out.print("; ");
                    }
                } else {
                    double doubleSolA = (-dB + Math.sqrt(dB*dB - 4*dA*dC))/(2*dA);
                    double doubleSolB = (-dB - Math.sqrt(dB*dB - 4*dA*dC))/(2*dA);
                    System.out.print((int)doubleSolA + " " + (int)doubleSolB);
                    if (i < n-1) {
                        System.out.print("; ");
                    }
                }
            }
    }
}