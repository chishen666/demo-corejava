package com.carrx.corejava.genericparadigm;

/**
 * @author Carl.Xiang
 * @date 2019/12/24
 */
public class GenericClass<T> implements IGeneric<T> {

    private T t;

    @Override
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

}
