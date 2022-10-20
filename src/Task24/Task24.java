package Task24;

import java.util.Arrays;
import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введіть число більше 3");
            n = scanner.nextInt();
        } while (3 >= n);

        int[] array = new int[n];
        int newArrayLength = 0;
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * (n + 1));
            if (array[i] % 2 == 0 && array[i] != 0) {
                newArrayLength++;
            }
        }
        System.out.println(Arrays.toString(array));

        int elementForNewArray = 0;
        int[] newArray = new int[newArrayLength];
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                newArray[elementForNewArray] = array[i];
                elementForNewArray++;
            }
        }
        System.out.println(Arrays.toString(newArray));

    }
}
