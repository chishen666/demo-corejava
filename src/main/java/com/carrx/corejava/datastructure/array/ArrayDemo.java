package com.carrx.corejava.datastructure.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {
        //数组的三种定义方式(其中第3种是第2种的简写，不放在return语句中)
        int[] array1 = new int[3];
        int[] array2 = new int[]{5, 78, 4, 8, 2, 44, 22, 1};
        int[] array3 = {5, 78, 4, 8, 2, 44, 22, 1};

        String[] fruits = {"apple", "banana", "orange", "peach"};

        //1.sort,parallelSort,toString,deepToString
        Arrays.sort(array2);
//        Arrays.parallelSort(array2);
        print(array2);

        Arrays.sort(array3, 1, array3.length - 1);
//        Arrays.parallelSort(array3, 1, array3.length - 1);
        print(array3);

        Arrays.sort(fruits, Comparator.comparingInt(String::length));
        print(fruits);

//        2.asList
        List list1 = Arrays.asList(array2);

//        3.binarySearch
        System.out.println(Arrays.binarySearch(array2, 1, array2.length - 1, 5));

//        4.copyOf,copyOfRange
        int[] a = Arrays.copyOf(array2, 10);
        int[] b = Arrays.copyOfRange(array2, 2, 4);
        print(a);
        print(b);

//        5.equals, deepEquals
        System.out.println(Arrays.equals(a, b));

//        6.fill
        Arrays.fill(a, 2, a.length - 2, 3);
        print(a);

    }

    private static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void print(Object[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void print(int[][] array) {
        System.out.println(Arrays.deepToString(array));
    }
}

