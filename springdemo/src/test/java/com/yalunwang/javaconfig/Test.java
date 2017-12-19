package com.yalunwang.javaconfig;

import com.yalunwang.javaconfig.config.PeopleCarConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

 public class Test {
     public static void main( String[] args)
     {
        ApplicationContext ac1= new AnnotationConfigApplicationContext(PeopleCarConfig.class);
        People people=ac1.getBean(Man.class);
        People people1=ac1.getBean(Woman.class);
        people.drive(); people1.drive();

    }
}
