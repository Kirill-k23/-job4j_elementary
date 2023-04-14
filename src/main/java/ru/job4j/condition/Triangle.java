package ru.job4j.condition;

public class Triangle {
        public static boolean exist(double ab, double ac, double bc) {
            return ab + ac > ac && ac + bc > ab && ab + bc > ac;
        }

    public static void main(String[] args) {
        System.out.println(exist(2.0, 2.0, 2.0));
        System.out.println(exist(8.0, 3.0, 2.0));
    }
}
