package com.carrx.corejava.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        testArrayList();
    }

    static void testArrayList() {

        // 1.数组转集合
        String[] vegetablesArr = {"potato", "tomato", "cucumber"};

        List<String> vegetablesList = Arrays.asList(vegetablesArr);
        System.out.println("vegetablesList size = " + vegetablesList.size());

        // 2.集合转数组(必须使用有参)
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("apple");
        fruitsList.add("orange");
        fruitsList.add("banana");
        String[] fruitsArr = new String[fruitsList.size()];
        fruitsArr = fruitsList.toArray(fruitsArr);
        System.out.println("fruitsArr length = " + fruitsArr.length);

        // 3直接建立集合赋值(此为可变集合,final不可变集合需要工具类)
        List<String> animalsList = Arrays.asList(new String[]{"dog", "cat", "pig"});
        System.out.println("animalsList size = " + animalsList.size());

    }
}
