package com.gy.behavioral.mediator;

/**
 * @author guoyou
 * @date 2019/10/15 10:38
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {

        StudyGroup.showMessage(this, message);
    }
}
