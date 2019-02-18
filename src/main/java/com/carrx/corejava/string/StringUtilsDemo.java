package com.carrx.corejava.string;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsDemo {

    public static void main(String[] args) {
        System.out.println(StringUtils.isNoneBlank("a", " b", null));
    }

}
