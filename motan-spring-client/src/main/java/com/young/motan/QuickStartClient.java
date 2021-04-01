package com.young.motan;

import com.young.motan.service.FooService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author young
 * @version 1.0
 * @date 2021/4/1 9:31 上午
 * @description
 */
public class QuickStartClient {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:motan_client.xml");
        FooService service = (FooService) ctx.getBean("remoteService");
        System.out.println(service.hello("motan"));
    }
}
