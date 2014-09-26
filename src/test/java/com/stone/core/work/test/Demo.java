package com.stone.core.work.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {
        String[] configLocations = { "classpath:spring/spring-test.xml" };
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
        System.out.println(context.getBean("edison"));
        System.out.println(context.getBean("lusa"));
    }

}
