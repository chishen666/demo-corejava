package com.carrx.corejava.genericparadigm;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型演示类
 */
public class GenericParadigmDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add(1);
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
