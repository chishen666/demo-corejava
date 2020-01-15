package com.carrx.corejava.genericparadigm;

/**
 * 泛型演示类
 */
public class GenericParadigmDemo {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add("a");
//        list.add(1);
//        for (Object o : list) {
//            System.out.println(o);
//        }

        System.out.println(test(1));
    }

    public static <K extends Number, V extends Number> V test(K k) {
        return (V) k;
    }
}
