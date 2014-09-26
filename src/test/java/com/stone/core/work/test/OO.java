/*
 * Copyright 2014 Zhongan.com All right reserved. This software is the
 * confidential and proprietary information of Zhongan.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.com.
 */
package com.stone.core.work.test;

import com.taobao.diamond.md5.MD5;

/**
 * 类OO.java的实现描述：TODO 类实现描述
 * 
 * @author liulei 2014年9月11日 下午2:03:50
 */
public class OO {

    public static void main(String[] args) {

        String aa = MD5.getInstance().getMD5String("213412341");
        System.out.println(aa);

    }

}
