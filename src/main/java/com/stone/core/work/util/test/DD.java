package com.stone.core.work.util.test;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DD {
    private static Logger logger = LoggerFactory.getLogger(DD.class);

    public static void main(String[] args) {

        //		System.out.println(String.valueOf(null)+"---");

        String ass = "\u4E2D\u4FE1\u94F6\u884C";
        ass = "\u9518";
        String out = Native2AsciiUtils.ascii2Native(ass);

        System.out.println(out + "=======");

        abc a = new abc();
        a.setB(20l);

        //		long aa = a.getA();
        //		
        //		long bb = a.getB();
        //		
        //		System.out.println(aa);
        //		
        //		System.out.println(bb);

        ef e = new ef();
        e.setC(a.getA());

        System.out.println("===" + e.getC());

        System.out.println("abc : " + ToStringBuilder.reflectionToString(a));

    }

}

class abc {
    private Long a;
    private Long b;

    public Long getA() {
        return a;
    }

    public void setA(Long a) {
        this.a = a;
    }

    public Long getB() {
        return b;
    }

    public void setB(Long b) {
        this.b = b;
    }

}

class ef {
    private Long c;
    private Long d;

    public Long getC() {
        return c;
    }

    public void setC(Long c) {
        this.c = c;
    }

    public Long getD() {
        return d;
    }

    public void setD(Long d) {
        this.d = d;
    }
}
