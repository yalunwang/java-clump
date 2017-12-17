package com.yalunwang.autowiring;

import com.yalunwang.autowiring.config.PeopleCarConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PeopleCarConfig.class)
public class TestCar {
    @Autowired
    private BusCar busCar;
    @Test
    public void testCar()
    {
        System.out.println(busCar);
    }
}
