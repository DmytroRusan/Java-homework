package Task22;

import java.util.Arrays;

public class Task22 {
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 31 - 15);
        }
        System.out.println(Arrays.toString(array));
        int maxNum = array[0];
        int lastElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxNum <= array[i]) {
                maxNum = array[i];
                lastElement = i;
            }
        }
        System.out.println(maxNum);
        System.out.println(lastElement);
    }
}
