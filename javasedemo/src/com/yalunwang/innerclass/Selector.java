package com.yalunwang.innerclass;

/**
 * Selector迭代器
 */
public abstract class Selector<T> {
    public  void ff(){
        System.out.println(this.getClass().getName());
    }
    abstract boolean hasNext();
    abstract T next();
}
