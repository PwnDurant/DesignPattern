package com.zqq.Liskov.improve;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));
        System.out.println("-------------------");
        B b = new B();
//        因为 B 类不再继承 A 类，因此调用者不会再认为 func1 是求减法，所以调用完成的功能就会很明确了
        System.out.println("11+3="+b.func1(11,3));
        System.out.println("1+8="+b.func1(1,8));
        System.out.println("11+3+9="+b.func2(11,3));
//        使用组合仍然可以使用到 A 的相关方法
        System.out.println("11-3="+b.func3(11,3));
    }
}
class Base{   //创建一个更加基础的基类
//    把更基础的方法和成员写到 Base 类
}
class A extends Base{
    public int func1(int num1,int num2){
        return num1-num2;
    }
}
class B extends Base{    //B类继承了A，增加一个新的功能：完成两个数相加然后和9求和
    private A a = new A();   //    如果 B 需要使用 A 的方式，使用组合的关系
    public int func1(int a,int b){   //重写了 A 类的方法，可能是无意识的
        return a+b;
    }
    public int func2(int a,int b){
        return func1(a,b)+9;
    }
    public int func3(int a,int b){   //    加入我们仍然想使用 A 的方法
        return this.a.func1(a,b);
    }
}