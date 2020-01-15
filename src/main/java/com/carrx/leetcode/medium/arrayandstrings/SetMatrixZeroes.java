package com.carrx.leetcode.medium.arrayandstrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * [
 * [1,1,1],
 * [1,0,1],
 * [1,1,1]
 * ]
 * Output:
 * [
 * [1,0,1],
 * [0,0,0],
 * [1,0,1]
 * ]
 * Example 2:
 * <p>
 * Input:
 * [
 * [0,1,2,0],
 * [3,4,5,2],
 * [1,3,1,5]
 * ]
 * Output:
 * [
 * [0,0,0,0],
 * [0,4,5,0],
 * [0,3,1,0]
 * ]
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/13 14:17
 **/
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void setZeroes(int[][] matrix) {
        int rowLen = matrix.length;
        int columnLen = matrix[0].length;

        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>();

        for (int i = 0; i < rowLen; i++) {
            int[] arr = matrix[i];
            for (int j = 0; j < columnLen; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for (Integer row : rows) {
            for (int j = 0; j < columnLen; j++) {
                matrix[row][j] = 0;
            }
        }

        for (Integer column : columns) {
            for (int j = 0; j < rowLen; j++) {
                matrix[j][column] = 0;
            }
        }


//        for (int i = 0; i < matrix.length; i++) {
//            int[] arr = matrix[i];
//            for (int j = 0; j < arr.length; j++) {
//                if (rows.contains(i) || columns.contains(j)) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }

    }
}
