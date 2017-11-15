package com.cambrian.design.pattern.behavioral.command;

/**
 * @author Created by cambrian on 2017/11/14
 */
public interface Command {

    int value();

    int param();

    void execute();

    void undo();

}
