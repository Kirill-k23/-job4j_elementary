package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] loop = new int[5];
        for (int index = 0; index < loop.length; index++) {
            loop[index] = index * 2 + 3;
        }
        for (int index = 0; index < loop.length; index++) {
            System.out.println(loop[index]);
        }
    }
}
