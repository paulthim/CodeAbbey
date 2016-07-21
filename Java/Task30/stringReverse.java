package codeabbey.SolvedTasks;

import java.io.*;
import java.util.*;

public class stringReverse {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileInputStream("input.txt"));
        List<Character> s = new LinkedList<>();
        String wordList = in.nextLine();
        for (int i = 0; i < wordList.length(); i++) {
            s.add(0, wordList.charAt(i));
        }
        for (char c : s) {
            System.out.print(c);
        }
        in.close();
    }
}
