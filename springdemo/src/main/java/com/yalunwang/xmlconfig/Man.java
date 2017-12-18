package com.yalunwang.xmlconfig;

import com.yalunwang.javaconfig.Car;

/**
 * author yalunwang
 * 男人
 */

public class Man implements People {
    public Man () {
        System.out.println("我是man构造函数");
    }

    private String userName ="小明";

    private com.yalunwang.javaconfig.Car car;
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
