/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeabbey.SolvedTasks;

import java.io.*;
import java.math.*;
import java.util.*;

/**
 *
 * @author paulthim
 */
public class fibonacciDiv {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileInputStream("input.txt"));
        int n = in.nextInt();
        int[] inputData = new int[n];
        for (int i = 0; i < n; i++) {
            BigInteger input = new BigInteger(in.next());
            LinkedList<BigInteger> fibonacci = new LinkedList<>();
            fibonacci.add(BigInteger.ZERO);
            fibonacci.add(0, BigInteger.ONE);
            while (fibonacci.get(0).remainder(input) != BigInteger.ZERO) {
                fibonacci.add(0, (fibonacci.get(0)).add(fibonacci.get(1)));
            }
            System.out.println(fibonacci.size()-1);
        }
    }
}
