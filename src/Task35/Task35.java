package Task35;

public class Task35 {
    public static void main(String[] args) {
        salaryForOneWeek(10, 50);
    }

    public static void salaryForOneWeek(double salaryForOneHour, int amountHours) {
        if (amountHours > 60) {
            System.out.println("Працівник не може працювати більше 60 годин на тиждень");
            return;
        }
        if (salaryForOneHour < 8) {
            System.out.println("Працівник не може отримувати нижче 8 доларів за годину");
            return;
        }

        double salaryForWeek = 0.0;
        for (int i = 1; i <= amountHours; i++) {
            if (i <= 40) {
                salaryForWeek = salaryForWeek + salaryForOneHour;
            }
            if (i > 40) {
                salaryForWeek = salaryForWeek + (salaryForOneHour * 1.5);
            }
        }
        System.out.println(salaryForWeek);

    }
}
