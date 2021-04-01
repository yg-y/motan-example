package com.young.motan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author young
 * @version 1.0
 * @date 2021/4/1 9:20 上午
 * @description
 */
public class QuickStartServer {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:motan_server.xml");
        System.out.println("server start...");
    }
}
