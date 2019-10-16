package com.gy.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyou
 * @date 2019/10/14 17:15
 */
public class Satff {

    private final List<Command> list = new ArrayList();

    public void addCommand(Command command) {
        list.add(command);
    }

    public void executeCommand() {

        for (Command command : list) {
            command.execute();
        }
        list.clear();
    }

}
