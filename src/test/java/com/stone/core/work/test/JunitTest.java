package com.stone.core.work.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.stone.core.work.entity.City;
import com.stone.core.work.service.CityService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class JunitTest {

    @Resource
    private CityService cityService;

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-biz.xml");
        System.out.println(context.getBean("testBean"));
    }

    @Test
    public void testCity() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CityService cs = (CityService) context.getBean("cityService");
        long c = cs.countCityByCondition(new City());
        System.out.println(c + "=================");
    }

    @Test
    public void testCity2() {
        long c = cityService.countCityByCondition(new City());
        System.out.println(c + "=================");
    }

}
