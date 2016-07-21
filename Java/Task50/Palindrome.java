
package codeabbey.SolvedTasks;
import java.util.*;
import java.io.*;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileInputStream("input.txt"));
        int n = in.nextInt();
        String str = in.nextLine();
        for (int i = 0; i < n; i++) {
            str = in.nextLine();
            str = str.toLowerCase();
            List<Character> letters = new LinkedList<>();
            for (int j = 0; j < str.length(); j++) {
                if (Character.isLetter(str.charAt(j))) {
                    letters.add(str.charAt(j));
                }
            }
            if(isPalindrome(letters)) {
                System.out.print("Y ");
            };
        }
        in.close();
    }
    
    private static boolean isPalindrome(List<Character> lettersInput) {
        List<Character> letters = lettersInput;
        boolean pal = true;
        for (int i = 0; i < letters.size()/2; i++) {
            char a = letters.get(i);
            char b = letters.get(letters.size()-i-1);
            if (a != b) {
                System.out.print("N ");
                pal = false;
                break;
            }
        }
        return pal;
    }
}
