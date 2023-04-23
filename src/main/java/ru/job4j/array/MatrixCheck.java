package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(char[][]board, int colum) {
        for (int j = 0; j < board[colum].length; j++) {
            if (board[j][colum] != 'X') {
                return false;
            }
        }
        return true;
    }
}
