package com.yalunwang.xmlconfig;


import java.util.List;

public class Woman implements People {
    private Car car;
    public Woman(){

    }
    public void setCar(Car car)
    {
        this.car=car;
    }
    private String userName ="小红";

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void drive() {
        System.out.println("女司机:" + this.userName);
        car.notice();
    }
    private List<String>certificateList;

    public void setCertificateList(List<String> certificateList) {
        this.certificateList = certificateList;
    }

    @Override
    public void printCertificateList() {
        for (String item : this.certificateList) {
            System.out.println("证书:"+item);
        }
    }
}
