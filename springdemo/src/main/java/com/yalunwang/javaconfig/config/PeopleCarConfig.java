package com.yalunwang.javaconfig.config;


import com.yalunwang.javaconfig.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PeopleCarConfig {
    private int i=1;
    @Bean
    public Car busCar()
    {
        i=i+1;
        System.out.println(i);
        return new  BusCar();
    }
    @Bean(name="man")
    public People man()
    {
        return new Man( busCar());
    }
    @Bean(name="woman")
    public People woman(Car car)
    {
        return new Woman( car);
    }
}
