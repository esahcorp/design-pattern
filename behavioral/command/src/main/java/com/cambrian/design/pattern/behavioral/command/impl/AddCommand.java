package com.cambrian.design.pattern.behavioral.command.impl;

import com.cambrian.design.pattern.behavioral.command.Command;

/**
 * @author Created by cambrian on 2017/11/14
 */
public class AddCommand implements Command {

    @Override
    public int value() {
        return 0;
    }

    @Override
    public int param() {
        return 0;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
