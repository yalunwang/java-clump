package com.yalunwang.placeholder;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:placeholder/spring-placeholder.xml"})
public class PlaceholdeTest {

    @Autowired
    private Car car;
    @Test
    public void testpro(){
        System.out.println(car.getLength());
        System.out.println(car.getName());
        System.out.println(car.getWidth());
    }

}
