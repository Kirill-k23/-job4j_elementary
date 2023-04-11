package ru.job4j.condition;

public class SqArea {

    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * p;
        return l * h;

    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);

        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result2);
        double result3 = SqArea.square(7, 3);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result3);

    }
}
