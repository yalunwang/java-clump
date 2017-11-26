package com.yalunwang.innerclass;

/**
 * Sequence需要继承的业务
 */
public class SequenceBiz {
    public void log()
    {
        //dosomestring 一些需要Sequence继承的业务
        System.out.println(this.getClass().getName()+"我记录了日志");
    }
}
