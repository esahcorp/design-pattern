package com.cambrian.design.pattern.structual.proxy.impl;

import com.cambrian.design.pattern.structual.proxy.File;

/**
 * 被代理对象
 *
 * @author Created by cambrian on 2017/11/14
 */
public class NormalFile implements File {

    @Override
    public void read(String name) {
        System.out.println("Reading file: " + name);
    }
}
