/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeabbey.SolvedTasks.luhnAlgorithm;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author paulthim
 */
public class LuhnAlgorithm {
    private static char[] creditArray;
    public static void main(String[] args) throws IOException { //This will take in the number count as well as initiate the necessary algorithm on each number
            Scanner in = new Scanner(new FileInputStream("input.txt"));
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                    String credit = in.next();
                    creditArray = credit.toCharArray();
                    if (variableCheck(creditArray)) {
                        variableFind();
                        System.out.println(creditArray);
                    } else {
                        digitSwap();
                        System.out.println(creditArray);
                    }
            }
            in.close();
	}
    
    private static boolean variableCheck(char[] cnArray) {
        boolean varFound = false;
        for (int i = 0; i < cnArray.length; i++) {
            if (Character.getNumericValue(cnArray[i]) < 0) {
                varFound = true;
            }
        }
        return varFound;
    }
    
    private static void variableFind() {
        int sum = 0;
        int varInd = 0;
        int difference = 0;
        for (int i = creditArray.length; i > 0; i--) {
            int c = Character.getNumericValue(creditArray[i-1]);
            if (c >= 0) {
                if (i%2 == 0) {
                    sum += c;
                } else {
                    if (c>4) {
                        sum = sum + (c*2-9);
                    } else {
                        sum = sum + (c*2);
                    }
                }
            } else {
                varInd = i-1;
            }
        }
        do {
            difference++;
            sum ++;
        } while (sum%10 != 0);
        char variable;
        if (varInd%2 != 0) {
            variable = Character.forDigit(difference, 10);
            creditArray[varInd] = variable;
        } else {
            if (difference%2 == 0) {
                variable = Character.forDigit(difference/2, 10);
                creditArray[varInd] = variable;
            } else {
                variable = Character.forDigit((difference+9)/2, 10);
                creditArray[varInd] = variable;
            }
        }
    }
    
    private static void digitSwap() {
        char a;
        int sum;
        int i = 0;
        char[] tempArray = new char[creditArray.length];
        do {
            System.arraycopy(creditArray, 0, tempArray, 0, creditArray.length);
            a = tempArray[i];
            tempArray[i] = tempArray[i+1];
            tempArray[i+1] = a;
            i++;
            sum = sumNumber(tempArray);
        } while (sum%10 != 0);
        creditArray = tempArray;
                
        /*for (int i = 0; i < creditArray.length; i++) {
            char[] tempArray = new char[creditArray.length];
            System.arraycopy(creditArray, 0, tempArray, 0, creditArray.length);
            a = tempArray[i];
            tempArray[i] = tempArray[i+1];
            tempArray[i+1] = a;
            sum = sumNumber(tempArray);
            if (sum%10 == 0) {
                creditArray = tempArray;
                break;
            }
        }
        */
    }
    
    private static int sumNumber(char[] creditNumber) {
        int sum = 0;
        for (int j = creditNumber.length; j > 0; j--) {
                int c = Character.getNumericValue(creditNumber[j-1]);
                if (j%2 == 0) {
                    sum += c;
                } else {
                    if (c>4) {
                        sum = sum + (c*2-9);
                    } else {
                        sum = sum + (c*2);
                    }
                }
            }
        return sum;
    }
}
