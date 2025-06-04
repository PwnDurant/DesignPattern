package com.zqq.IoC;

public class DependencyInversion {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.receive(new Email());
    }
}
class Email{
    public String getInfo(){
        return "电子邮件信息：hello world";
    }
}
class Person1{   //完成 Person 接受消息的功能
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}