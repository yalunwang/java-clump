package com.yalunwang.xmlconfig;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-test.xml"})
public class Test {
    @Autowired
    private Car car;
    @org.junit.Test
    public void testBusCar()
    {
        car.notice();
        car.printStationList();
    }
    @Autowired
    private People people;
    @org.junit.Test
    public void testPeople()
    {
        people.drive();
        people.printCertificateList();
    }

}
