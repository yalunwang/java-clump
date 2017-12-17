package com.yalunwang.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * author yalunwang
 * 男人
 */
@Component
public class Man implements People {
    private String userName ="小明";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Autowired
    private Car car;


    private Car car1;
    //构造器注入
    @Autowired
    public Man(Car car) {
        this.car1=car;
    }


    private Car car2;

    public Car getCar2() {
        return car2;
    }
    //set方法注入
    @Autowired
    public void setCar2(Car car2) {
        this.car2 = car2;
    }

    @Override
    public void drive() {
        //System.out.println("driver：");
        System.out.println("男司机:" + this.userName);
        car1.notice();
    }
}
