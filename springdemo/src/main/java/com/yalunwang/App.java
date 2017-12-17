package com.yalunwang;


import com.yalunwang.soundsystem.CdPlayer;

import com.yalunwang.soundsystem.Com;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml") ;
        CdPlayer cdPlayer1=ac.getBean(CdPlayer.class);
        CdPlayer cdPlayer2=(CdPlayer)ac.getBean("cdPlayer");
        System.out.println(cdPlayer1);
        System.out.println(cdPlayer2.getJdbcurl());
        System.out.println(cdPlayer2.getUsername());
        System.out.println(cdPlayer2.getPassword());
        Com com1=ac.getBean(Com.class);
        System.out.println(com1 );

        System.out.println(com1.cdPlayer );
    }
}
