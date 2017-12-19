package com.yalunwang.autowiring;

import com.yalunwang.autowiring.config.PeopleCarConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

    public static void   main( String[] args)
    {
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring-autowiring.xml") ;
        People people=ac.getBean(Man.class);
        people.drive();

        ApplicationContext ac1= new AnnotationConfigApplicationContext(PeopleCarConfig.class);
        People people1=ac1.getBean(Man.class);
        people.drive();
    }
}
