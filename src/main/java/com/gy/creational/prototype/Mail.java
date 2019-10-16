package com.gy.creational.prototype;

/**
 * @author guoyou
 * @date 2019/9/16 14:22
 */
public class Mail implements Cloneable{

    private String name;

    private String address;

    private String content;

    public Mail(){
        System.out.println(" new class mail construction ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", content='" + content + '\'' +
                super.toString()+
                '}';
    }
   @Override
   public  Object clone() throws CloneNotSupportedException {
       System.out.println("clone mail class");
       return super.clone();
   }
}
