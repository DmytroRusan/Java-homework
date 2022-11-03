package Task26;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть суму на депозит");
        int m = scanner.nextInt();
        int years = 0;
        double num = m * 0.20;
        for (double i = num; i <= m; i = i + num) {
            years ++;
        }
        System.out.println(years);
    }
}
