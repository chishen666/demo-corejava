package com.carrx.corejava.enumeration;

public enum SeasonEnum {
//    SPRING, SUMMER, FALL, WINTER;
    SPRING("春"), SUMMER("夏"), FALL("秋"), WINTER("冬");

    private final String cnName;
    private String enName;

    private SeasonEnum(String cnName) {
        this.cnName = cnName;
    }
}
