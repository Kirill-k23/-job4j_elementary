package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row == cell;
                boolean right = size - 1 - row == cell;
                if (left) {
                    System.out.print("O");
                } else if (right) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 10");
        draw(10);
        System.out.println("Draw by 15");
        draw(15);
        System.out.println("Draw by 12");
        draw(12);
    }
}
