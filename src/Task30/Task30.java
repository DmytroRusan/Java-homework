package Task30;

import java.util.Arrays;
import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число m: ");
        int m = scanner.nextInt();
        String text = "mama ama kriminal";
        String[] words = text.split(" ");

        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != m) {
                counter++;
            }
        }

        String[] finalArray = new String[counter];
        int counterForArray = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != m) {
                finalArray[counterForArray] = words[i];
                counterForArray++;
            }
        }

        System.out.println(Arrays.toString(finalArray));
    }
}
