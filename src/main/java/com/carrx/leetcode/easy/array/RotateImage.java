package com.carrx.leetcode.easy.array;

import java.util.Arrays;

/**
 * You are given an n x n 2D matrix representing an image.
 * <p>
 * Rotate the image by 90 degrees (clockwise).
 * <p>
 * Note:
 * <p>
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 * <p>
 * Example 1:
 * <p>
 * Given input matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * <p>
 * rotate the input matrix in-place such that it becomes:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 * Example 2:
 * <p>
 * Given input matrix =
 * [
 * [ 5, 1, 9,11],
 * [ 2, 4, 8,10],
 * [13, 3, 6, 7],
 * [15,14,12,16]
 * ],
 * <p>
 * rotate the input matrix in-place such that it becomes:
 * [
 * [15,13, 2, 5],
 * [14, 3, 4, 1],
 * [12, 6, 8, 9],
 * [16, 7,10,11]
 * ]
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/19 11:16
 **/
public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
        ;
    }

    public static void rotate(int[][] matrix) {
        int len = matrix.length - 1;
        int limit = 0;
        while (limit < matrix.length / 2) {
            for (int i = limit; i < len - limit; i++) {
                int temp = matrix[limit][i];
                matrix[limit][i] = matrix[len - i][limit];
                matrix[len - i][limit] = matrix[len - limit][len - i];
                matrix[len - limit][len - i] = matrix[i][len - limit];
                matrix[i][len - limit] = temp;
            }
            limit++;
        }
    }
}
