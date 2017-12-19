package com.yalunwang.javaconfig;

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
