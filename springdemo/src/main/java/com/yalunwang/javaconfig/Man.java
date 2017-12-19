package com.yalunwang.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * author yalunwang
 * 男人
 */

public class Man implements People {
    public Man () {
        System.out.println("我是man构造函数");
    }

    private String userName ="小明";

    private Car car;
    public Man( Car car)
    {
        this.car=car;
    }


    @Override
    public void drive() {
        //System.out.println("driver：");
        System.out.println("男司机:" + this.userName);
        car.notice();
    }
}
