package com.yalunwang.autowiring;


import org.springframework.stereotype.Component;


public class Train implements Car {
    private String carName="G1次高铁";

    @Override
    public void notice() {
        System.out.println(this.carName+"上海站到了");
    }
}
