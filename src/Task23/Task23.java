package Task23;

import java.util.Arrays;
import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число n (кількість елементів масиву)");
        int n = scanner.nextInt();
        System.out.println("Введіть число m");
        int m = scanner.nextInt();

        int[] array = new int[n];
        if (n < 0) {
            System.out.println("Масив не може бути менше нуля");
            return;
        } else {
            int newM = m;
            for (int i = 0; i < n; i++) {
                array[i] = newM;
                newM = newM - 2;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
