package com.carrx.designpattern.singleton;

/**
 * 单例模式（懒汉式）
 *
 * @Author: Carl.Xiang
 * @Date: 2020/2/2 11:15
 **/
public class SingletonLazy {

    private static SingletonLazy instance = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
}
