package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result;
        if (first >= second && first >= third) {
            result = first;
        } else if (second >= first && second >= third) {
            result = second;
        } else {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(10, 5, 1));
        System.out.println(max(10, 50, 1));
        System.out.println(max(1, 5, 100));
        System.out.println(max(1, 1, 1));
        System.out.println(max(10, 10, 1));
        System.out.println(max(100, 1, 100));
        System.out.println(max(1, 100, 100));
    }
}
