package Task32;

import java.util.Arrays;

public class Task32 {
    public static void main(String[] args) {
        String text = "Жили у бабусі два веселих гусі оауоауоау хопхейлал алей";
        String[] words = text.split(" ");
        int lengthOfTheBiggestWord = 0;
        int theBiggestWord = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (lengthOfTheBiggestWord < words[i].length()) {
                lengthOfTheBiggestWord = words[i].length();
            }
        }
        String theBiggestWords = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == lengthOfTheBiggestWord) {
                theBiggestWords += words[i] + " ";
            }
        }
        theBiggestWords = theBiggestWords.replace("а", "%");
        theBiggestWords = theBiggestWords.replace("о", "%");
        theBiggestWords = theBiggestWords.replace("у", "%");
        System.out.println(theBiggestWords);
    }
}
