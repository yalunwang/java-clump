package com.yalunwang.innerclass;

/**
 * Created by Administrator on 2017/11/26.
 */
public class TestInnerClass {
    public static  void main(String[] args)
    {
//        Sequence sequence=new Sequence(5);
//        for (int i=0;i<5;i++){
//            sequence.add(i);
//        }
//        while (sequence.hasNext()){
//            System.out.println(sequence.next());
//        }

        Sequence1 sequence1=new Sequence1(5);
        for (int i=0;i<5;i++){
            sequence1.add(i);
        }
        Selector selector=sequence1.getSelector();
        while (selector.hasNext()){
            System.out.println(selector.next());
        }
        sequence1.log();
    }
}
