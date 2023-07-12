package Task34;

import java.util.Arrays;

public class Task34 {
    public static void main(String[] args) {
        String text = "no pain no gain";
        String[] arrayOfText = text.split(" ");
        Arrays.sort(arrayOfText);
        System.out.println(Arrays.toString(arrayOfText));

    }
}
