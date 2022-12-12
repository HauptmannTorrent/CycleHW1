public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i = i + 1)
            System.out.println("Итерация цикла " + i);

        // Задача 2
        System.out.println("Задача 2");
        for (int a = 10; a >= 0; a = a - 1)
            System.out.println("Итерация цикла " + a);

        // Задача 3
        System.out.println("Задача 3");
        for (int x = 0; x <= 17; x = x + 2)
            System.out.println("Итерация цикла " + x);

        // Задача 4
        System.out.println("Задача 4");
        for (int e = 10; e >= -10; e = e - 1)
            System.out.println("Итерация цикла " + e);

        // Задача 5
        System.out.println("Задача 5");
        for (int j = 1904; j < 2096; j = j + 4)
            System.out.println(j + " год является високосным.");

        // Задача 6
        System.out.println("Задача 6");
        for (int s = 7; s <= 98; s = s + 7)
            System.out.println(s);

        // Задача 7
        System.out.println("Задача 7");
        for (int t = 1; t <= 512; t = t * 2)
            System.out.println(t);

        // Задача 8
        System.out.println("Задача 8");
        int month2 = 0;
        int bankbDeposit2 = 29000;
        int total12 = 0;
        for (month2 = 0; month2 <= 12; month2 = month2 + 1) {
            total12 = total12 + bankbDeposit2;
            System.out.println("Месяц " + month2 + " сума накоплений равна " + total12 + " руб");
        }

        // Задача 9
        System.out.println("Задача 9");
        int month = 0;
        int bankbDeposit = 29000;
        int total1 = 0;
        for (month = 0; month <= 12; month = month + 1) {
            bankbDeposit = bankbDeposit + bankbDeposit / 100;
            total1 = total1 + bankbDeposit;
            System.out.println("Месяц " + month + " сума накоплений равна " + total1 + " руб");
        }

        // Задача 10
        System.out.println("Задача 10");
        for (int i = 2; i <= 2; i++) {
        for (int j = 1; j <= 10; j++) {
           System.out.println(i + " x " + j + " = " + (i * j));
            }

        }
    }
}