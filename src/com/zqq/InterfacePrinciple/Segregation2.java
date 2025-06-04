package com.zqq.InterfacePrinciple;

public class Segregation2 {
    public static void main(String[] args) {
        AI ai = new AI();
        ai.depend1(new IB());  //A类通过接口去依赖B类
        ai.depend2(new IB());
        ai.depend3(new IB());
        CI ci = new CI();
        ci.depend1(new ID());  //C类通过接口去依赖D类
        ci.depend4(new ID());
        ci.depend5(new ID());
    }
}
interface Interface_1{   //接口1
    void operation1();
}
interface Interface_2{   //接口2
    void operation2();
    void operation3();
}
interface Interface_3{   //接口3
    void operation4();
    void operation5();
}
class IB implements Interface_1,Interface_2{
    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }
    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }
    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }
}
class ID implements Interface_1,Interface_3{
    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }
    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }
    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}
class AI{     //AI 类通过接口 Interface_1,Interface_2 依赖（使用）B类，但是只会用到1，2，3方法
    public void depend1(Interface_1 i){
        i.operation1();
    }
    public void depend2(Interface_2 i){
        i.operation2();
    }
    public void depend3(Interface_2 i){
        i.operation3();
    }
}
class CI{     //CI 类通过接口 Interface_1,Interface_3 依赖（使用）D类，但是只会用到1，4，5方法
    public void depend1(Interface_1 i){
        i.operation1();
    }
    public void depend4(Interface_3 i){
        i.operation4();
    }
    public void depend5(Interface_3 i){
        i.operation5();
    }
}
