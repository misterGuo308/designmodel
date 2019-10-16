package com.gy.creational.prototype.clone;

import java.util.Date;

/**
 * @author guoyou
 * @date 2019/9/16 15:19
 */
public class Pig implements  Cloneable {

    private  String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

  @Override
    protected Object clone() throws CloneNotSupportedException {

       Pig pig = (Pig) super.clone();
       //当有引用对象时需要进行深克隆
       pig.birthday = (Date) pig.birthday.clone();
        return pig;

    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}'+  super.toString();
    }
}

