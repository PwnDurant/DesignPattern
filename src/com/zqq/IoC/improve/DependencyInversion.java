package com.zqq.IoC.improve;

public class DependencyInversion {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.receive(new Email());   //客户端不需要做任何改变
        person1.receive(new WeChat());
    }
}
interface IReceiver{   //先定义一个接口
    public String getInfo();
}
class Email implements IReceiver{
    public String getInfo(){
        return "电子邮件信息：hello world";
    }
}
class WeChat implements IReceiver{
    public String getInfo(){
        return "微信信息:hello WeChat";
    }
}
class Person1{   //完成 Person 接受消息的功能
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}