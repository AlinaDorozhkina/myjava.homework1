package ru.geekbrains.java.homework.lesson1;

public class JavaHome {

    public static void main(String[] args) {
        System.out.println(calculation(5, 10, 15, 20));
        System.out.println("Результат " + result(10, 50));
        System.out.println("Результат " + result(5, 15));
        PositiveNegative(5);
        PositiveNegative(-20);
        System.out.println(OnlyNegative(20));
        System.out.println(OnlyNegative(-2));
        SayHi("Alina");
        LeapYear(2020);
    }

    public static double calculation(double a, double b, double c, double d) {
        return a * (b + (c / d));

    }

    public static boolean result(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void PositiveNegative(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " положительное");
        } else {
            System.out.println("Число " + number + " отрицательное");
        }
    }

    public static boolean OnlyNegative(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void SayHi(String name) {
        System.out.println("Hi, " + name + "!");

    }

    public static void LeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным");

        } else {
            System.out.println("Год " + year + " не является високосным");
        }

    }
}
