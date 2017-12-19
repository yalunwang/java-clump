package com.yalunwang.javaconfig;

import org.springframework.stereotype.Component;

/**
 * author yalunwang
 * 公交车
 */

public class BusCar implements Car {

    public BusCar(){
        System.out.println("buscar构造函数");
    }

    private String carName="浦东25路";

    @Override
    public void notice() {
        System.out.println(this.carName+"南京西路到了");
    }
}
