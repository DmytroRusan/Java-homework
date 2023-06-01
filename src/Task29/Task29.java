package Task29;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть пароль. Пароль має складатися з 8 букв або цифр.\n" +
                "Хоча б одна буква має бути великою. Має бути хоча б одна цифра. ");
        String password = scanner.nextLine();

        password = password.trim();

        boolean[] flags = new boolean[4];           // 1) length; 2) lower; 3) upper; 4) digit;

        if (password.length() >= 8) {
            flags[0] = true;
        }

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                flags[1] = true;
            } else if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                flags[2] = true;
            } else if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                flags[3] = true;
            }
        }

        boolean finalResult = true;
        for (int i = 0; i < flags.length; i++) {
            finalResult = finalResult && flags[i];
        }

        if (finalResult) {
            System.out.println("Пароль вірний!");
        } else {
            System.out.println("Пароль не вірний!");
        }
    }
}
