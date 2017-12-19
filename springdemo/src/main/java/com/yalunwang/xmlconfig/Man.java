package com.yalunwang.xmlconfig;



/**
 * author yalunwang
 * 男人
 */

public class Man implements People {
    public Man () {

    }

    private String userName ="小明";

    private Car car;
    public Man(Car car)
    {
        this.car=car;
    }


    @Override
    public void drive() {
        //System.out.println("driver：");
        System.out.println("男司机:" + this.userName);
        car.notice();
    }

    @Override
    public void printCertificateList() {

    }
}
