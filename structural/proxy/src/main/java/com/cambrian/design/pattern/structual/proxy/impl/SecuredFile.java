package com.cambrian.design.pattern.structual.proxy.impl;

import com.cambrian.design.pattern.structual.proxy.File;

/**
 * 代理对象
 * @author Created by cambrian on 2017/11/14
 */
public class SecuredFile implements File {
    private File normalFile;
    private String password = "";

    public SecuredFile(File normalFile, String password) {
        this.normalFile = normalFile;
        this.password = password;
    }

    @Override
    public void read(String name) {
        if ("secret".equals(password)) {
            System.out.println("Password is correct: " + password);
            // 调用被代理对象的方法
            normalFile.read(name);
        } else {
            System.out.println("Incorrect password. Access denied!");
        }
    }
}
