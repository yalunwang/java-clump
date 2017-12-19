package com.yalunwang.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


public class WoMan implements People {
    private String userName ="小红";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Resource(name = "train")
    private Car car;

    @Override
    public void drive() {
        //System.out.println("driver：");
        System.out.println("女司机:"+this.userName);
        car.notice();
    }
}
