package com.stone.core.work.test;

import javax.annotation.Resource;

import org.junit.Test;

import com.stone.core.work.entity.Car;
import com.stone.core.work.test.cache.Foo;
import com.taobao.itest.ITestSpringContextBaseCase;
import com.taobao.itest.annotation.ITestSpringContext;

@ITestSpringContext({ "/appContext.xml" })
public class CacheTest extends ITestSpringContextBaseCase {

    @Resource
    private Foo foo;

    @Test
    public void testCache() {
        Car car = new Car();
        car.setId(1039034l);
        car.setCarNo(239849l);
        car.setCarMode("MD002");
        car.setCarName("SpaceX");
        foo.b(car);
    }

    @Test
    public void test2() {
        Car car = new Car();
        car.setId(1039034l);
        car.setCarNo(210391l);
        car.setCarMode("MD002");
        car.setCarName("SpaceX");
        foo.a(car);
    }

}
