package com.cambrian.design.pattern.structual.proxy;

import com.cambrian.design.pattern.structual.proxy.impl.NormalFile;
import com.cambrian.design.pattern.structual.proxy.impl.SecuredFile;

/**
 * @author Created by cambrian on 2017/11/14
 */
class FileTest {
    private File securedFile;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        File normalFile = new NormalFile();
        securedFile = new SecuredFile(normalFile, "secret");
    }

    @org.junit.jupiter.api.Test
    void read() {
        securedFile.read("file name");
    }

}