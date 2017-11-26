package com.yalunwang;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class testlogback {

    protected final static Logger logger = LoggerFactory.getLogger(testlogback.class);


    public static void main(String[] args) {
       logger.info("logback 详细日志");
        logger.error("logback 错误日志");
        System.out.println("helloworld");
    }
}
