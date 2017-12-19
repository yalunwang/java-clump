package com.yalunwang.xmlconfig;

import java.util.List;

/**
 * author yalunwang
 * 公交车
 */

public class BusCar implements Car {
    public BusCar(){

    }
    public BusCar(String carName,List<String> stationList){
        this.carName=carName;
        this.stationList=stationList;
    }
    private   List<String> stationList;

    public List<String> getStationList() {
        return stationList;
    }

    public void setStationList(List<String> stationList) {
        this.stationList = stationList;
    }

    private String carName="浦东25路";

    @Override
    public void notice() {
        System.out.println(this.carName+"南京西路到了");
    }

    @Override
    public void printStationList() {
        for (String item : this.getStationList())
        {
            System.out.println("站名："+item);
        }
    }
}
