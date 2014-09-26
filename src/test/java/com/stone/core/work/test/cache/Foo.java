package com.stone.core.work.test.cache;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.stone.core.work.entity.Car;

@Repository(value = "foo")
public class Foo {

    private static final Logger logger = LoggerFactory.getLogger(Foo.class);

    @Cacheable(value = "default", key = "#car.id+#car.carNo")
    public String c(Car car) {
        logger.debug("Foo.c()" + ToStringBuilder.reflectionToString(car));
        return "c";
    }

    @Cacheable(value = "default", key = "#car.id+''+#car.carNo")
    public String a(Car car) {
        logger.debug("Foo.a()" + ToStringBuilder.reflectionToString(car));
        return "a";
    }

    @Cacheable(value = "default", key = "T(com.stone.core.work.util.test.MD5Utils).md5(#car.id)+T(com.stone.core.work.util.test.MD5Utils).md5(#car.carNo)")
    public String b(Car car) {
        logger.debug("Foo.b()" + ToStringBuilder.reflectionToString(car));
        return "b";
    }

}
