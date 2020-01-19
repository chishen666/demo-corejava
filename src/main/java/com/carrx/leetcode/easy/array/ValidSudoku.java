package com.carrx.leetcode.easy.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * <p>
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * <p>
 * A partially filled sudoku which is valid.
 * <p>
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/8 14:14
 **/
public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'1', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        int m, n;
        Set<Character> rowsSet = new HashSet<>();
        Set<Character> columnsSet = new HashSet<>();
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Set<Character> set3 = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                n = j / 3;
                if ('.' != board[i][j]) {
                    if (!rowsSet.add(board[i][j])) {
                        return false;
                    }

                    switch (n) {
                        case 0:
                            if (!set1.add(board[i][j])) {
                                return false;
                            }
                            break;
                        case 1:
                            if (!set2.add(board[i][j])) {
                                return false;
                            }
                            break;
                        case 2:
                            if (!set3.add(board[i][j])) {
                                return false;
                            }
                            break;
                        default:
                    }
                }


                if ('.' != board[j][i] && !columnsSet.add(board[j][i])) {
                    return false;
                }
            }
            rowsSet.clear();
            columnsSet.clear();
            if (i % 3 == 2) {
                set1.clear();
                set2.clear();
                set3.clear();
            }
        }

        return true;
    }
}
