package com.yalunwang.innerclass;

/**
 * 用类包装一个Integer的数组,并实现添加 通过继承Selector迭代遍历
 */
public class Sequence  extends Selector<Integer>{
    private Object  [] items;
    private int next =0;

    public Sequence(int size){
        items=new Object[size];
    }
    public void add(int x){
        if(next <items.length){
            items[next]=x;
            next++;
        }
    }

    /************************************实现抽象类*/

    private  int index=0;
    @Override
    public boolean hasNext() {
        return !(index==items.length);
    }

    @Override
   public Integer next() {
        Integer value=null;
        if( hasNext()){
            value=Integer.parseInt(items[index].toString()) ;
            index++;
        }
        return value;

    }
}
