package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int index = 0; index < post.length; index++) {
            if (word[word.length - post.length + index] != post[index]) {
                return false;
            }
        }
        return true;
    }
}

