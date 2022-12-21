package Task28;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть годину: ");
        int h = scanner.nextInt();
        System.out.println("Введіть хвилину: ");
        int m = scanner.nextInt();
        System.out.println("Введіть секунду: ");
        int s = scanner.nextInt();

        s++;

        if (s == 60) {
            s = 0;
            m++;
        }
        if (m == 60) {
            m = 0;
            h++;
        }
        if (h == 24) {
            h = 0;
        }

        String hString;
        hString = (h < 10) ? "0" + h : "" + h;
        String mString;
        mString = (m < 10) ? "0" + m : "" + m;
        String sString;
        sString = (s < 10) ? "0" + s : "" + s;
        System.out.println("Ваш час через одну секунду буде: " + hString + ":" + mString + ":" + sString);
    }
}
