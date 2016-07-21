package codeabbey.SolvedTasks;
import java.util.*;
import java.io.*;

public class mortgageCalculator {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileInputStream("input.txt"));
        double originalLoan = in.nextInt();
        double rate = in.nextInt();
        double term = in.nextInt();
        double interest = (rate/12)/100;
        double payment = originalLoan*interest/((1-Math.pow((1+interest), (-term))));
        System.out.print((int)Math.ceil(payment));
    }
}