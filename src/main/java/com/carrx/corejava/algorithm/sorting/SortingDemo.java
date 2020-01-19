package com.carrx.corejava.algorithm.sorting;

import java.util.Arrays;

/**
 * @Author: Carl.Xiang
 * @Date: 2020/1/8 14:55
 **/
public class SortingDemo {

    public static void main(String[] args) {
        int[] nums = {42, 1, 4, 6, 22, 3, 2, 66, 8, 55, 8, 444, 6, 4, 3, 2, 2, 44, 44, 77, 8, 55, 4, 8, 6, 333, 4, 0};
//        int[] nums = {3, 2, 1};
//        selectSort(nums);
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 排序算法1：插入排序
     *
     * @Author: Carl.Xiang
     * @Date: 2020/1/9 16:21
     **/
    public static void insertSort(int[] nums) {
        int i, j, temp;
        for (i = 1; i < nums.length; i++) {
            temp = nums[i];
            for (j = i; j > 0 && nums[j - 1] > temp; j--) {
                nums[j] = nums[j - 1];
            }
            nums[j] = temp;
        }
    }

    /**
     * 排序算法3：选择排序
     *
     * @param nums
     */
    public static void selectSort(int[] nums) {
        int i, j, minIndex;
        for (i = 0; i < nums.length; i++) {
            minIndex = i;
            for (j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                exchange(nums, i, minIndex);
            }
        }
    }

    /**
     * 排序算法4：冒泡排序
     *
     * @param nums
     */
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    exchange(nums, j, j - 1);
                }
            }
        }
    }

    /**
     * 排序算法6：快速排序
     *
     * @param nums
     */
    public static void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = nums[low];
        int first = low;
        int last = high;
        while (first < last) {
            while (first < last && nums[last] >= mid) {
                last--;
            }
            nums[first] = nums[last];
            while (first < last && nums[first] <= mid) {
                first++;
            }
            nums[last] = nums[first];
        }
        nums[first] = mid;
        quickSort(nums, low, first - 1);
        quickSort(nums, first + 1, high);

    }


    /**
     * 交换数组x下标和y小标的值
     *
     * @param nums
     * @param x
     * @param y
     */
    private static void exchange(int[] nums, int x, int y) {
        nums[x] = nums[x] ^ nums[y];
        nums[y] = nums[x] ^ nums[y];
        nums[x] = nums[x] ^ nums[y];
    }

}
