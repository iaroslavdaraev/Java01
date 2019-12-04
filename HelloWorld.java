package ru.geekbrains.java_one.lesson_01.online;

public class HelloWorld {
    public static void main(String[] args) {
    }

    public static int calculate(int a, int b, int c, int d) {
        int e = a * (b + (c / d));
        float f = e;
        return e;
    }

    public static boolean task10and20(int x1, int x2) {
        int sum = x1 + x2;
        return sum >= 10 && sum <= 20;
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число " + x + " - положительное");
        } else {
            System.out.println("Число " + x + " - отрицательное");
        }
    }

    public static void greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }

    private static boolean bigYear(int year) {
        return (year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0);
    }
}
