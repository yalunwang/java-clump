package com.yalunwang.autowiring;

import org.springframework.stereotype.Component;

/**
 * author yalunwang
 * 公交车
 */
@Component("busCar")
public class BusCar implements Car {
    private String carName="浦东25路";

    @Override
    public void notice() {
        System.out.println(this.carName+"南京西路到了");
    }
}
