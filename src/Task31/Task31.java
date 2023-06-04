package Task31;

import java.util.Arrays;

public class Task31 {
    public static void main(String[] args) {
        String text = "qqqqqqq опа опа wwwwwww опана ррррррр ггггггг";
        String[] words = text.split(" ");
        int lengthOfMinWord = words[0].length();
        int lengthOfMaxWord = words[0].length();

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > lengthOfMaxWord) {
                lengthOfMaxWord = words[i].length();
            } else if (words[i].length() < lengthOfMinWord) {
                lengthOfMinWord = words[i].length();
            }
        }

        String theBiggestWords = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == lengthOfMaxWord) {
                theBiggestWords += words[i] + " ";
            }
        }

        String[] arrayOfTheBiggestWords = theBiggestWords.split(" ");
        int indexOfRandomMaxWord = (int) (Math.random() * arrayOfTheBiggestWords.length);
        String theBiggestRandomWord = arrayOfTheBiggestWords[indexOfRandomMaxWord];
        System.out.println("Найбільше випадкове слово: " + theBiggestRandomWord);

        String[] finalArray = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == lengthOfMinWord) {
                finalArray[i] = theBiggestRandomWord;
            } else {
                finalArray[i] = words[i];
            }
        }

        System.out.println(Arrays.toString(finalArray));
    }
}
