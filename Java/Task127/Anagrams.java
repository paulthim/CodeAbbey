//127

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Anagrams {

	private static final List<String> dictionaryArray = new ArrayList<>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();
        populateDictionary();
        while (in.hasNext()) {
            String wordToCheck = in.next();
            char[] letterArrayToCheck = wordToCheck.toCharArray();
            List<Character> letterArrayList = new ArrayList<>();
            for (char c : letterArrayToCheck) {
                letterArrayList.add(c);
            }
            letterArrayList.sort(null);
            char[] sortedArrayToString = new char[letterArrayList.size()];
            for (int i = 0; i < letterArrayList.size(); i++) {
                sortedArrayToString[i] = letterArrayList.get(i);
            }
            String stringToCheck = new String(sortedArrayToString);
            int anagramSum = anagramCounter(stringToCheck);
            System.out.println(anagramSum);
        }
		in.close();
	}
	
	private static void populateDictionary() throws IOException {
        Scanner in = new Scanner(new FileInputStream("words.txt"));
        while (in.hasNext()) {
            String word = in.nextLine();
            char[] letterArray = word.toCharArray();
            List<Character> letterArrayList = new ArrayList<>();
            for (char c : letterArray) {
                letterArrayList.add(c);
            }
            letterArrayList.sort(null);
            char[] sortedArray = new char[letterArrayList.size()];
            for (int i = 0; i < letterArrayList.size(); i++) {
                sortedArray[i] = letterArrayList.get(i);
            }
            String stringToAdd = new String(sortedArray);
            dictionaryArray.add(stringToAdd);
        }
        dictionaryArray.sort(null);
        in.close();
    }
    
    private static int anagramCounter(String wordToCheck) {
        int sum = -1;
        Iterator it = dictionaryArray.iterator();
        while (it.hasNext()) {
            Object word = it.next();
            if (wordToCheck.equals(word)) {
                int i = dictionaryArray.indexOf(word);
                sum++;
            }
        }
        return sum;
    }
}