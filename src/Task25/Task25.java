package Task25;

import java.util.Arrays;
import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть довжину масиву: ");
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("Ваш масив не може бути пустим");
        } else if (n < 0) {
            System.out.println("Ваш масив не може бути менше нуля");
        } else {
            int[] array = new int[n];
            if (array.length % 2 == 0) {
                int num = array.length / 2 - 1;
                for (int i = 0; i < array.length / 2; i++) {
                    array[i] = num;
                    num--;
                }
                num = 0;
                for (int i = array.length / 2; i < array.length; i++) {
                    array[i] = num;
                    num++;
                }
            } else if (array.length % 2 != 0) {
                int num = array.length / 2;
                for (int i = 0; i < array.length / 2; i++) {
                    array[i] = num;
                    num--;
                }
                num = array.length / 2;
                for (int i = 0; i <= array.length / 2; i++) {
                    array[num] = i;
                    num++;
                }
            }
            System.out.println(Arrays.toString(array));
        }

    }
}
