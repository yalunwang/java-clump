package com.yalunwang.innerclass;

/**
 * 用类包装一个Object的数组,并使用内部类通过继承Selector迭代遍历
 * 继承SequenceBiz 来处理其他业务
 */
public class Sequence1 extends SequenceBiz{
    private Object  [] items;
    private int next =0;

    public Sequence1(int size){
        items=new Object[size];
    }
    public void add(int x){
        if(next <items.length){
            items[next]=x;
            next++;
        }
    }
    private class SequenceSelector extends Selector<Integer>{
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

    /**
     * 返回迭代器
     * @return
     */
    public  Selector getSelector()
    {
        return new SequenceSelector();
    }

}
