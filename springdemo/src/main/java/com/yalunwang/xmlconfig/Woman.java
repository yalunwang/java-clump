package com.yalunwang.xmlconfig;

import com.yalunwang.javaconfig.Car;
import com.yalunwang.javaconfig.People;

public class Woman implements People {
    private Car car;
    public Woman(Car car){
        this.car=car;
    }
    private String userName ="小红";
    @Override
    public void drive() {
        System.out.println("女司机:" + this.userName);
        car.notice();
    }
}
