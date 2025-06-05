package com.zqq.Liskov;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));
        System.out.println("-------------------");
        B b = new B();
        System.out.println("11-3="+b.func1(11,3));
        System.out.println("1-8="+b.func1(1,8));
        System.out.println("11+3+9="+b.func2(11,3));
    }
}
class A{
    public int func1(int num1,int num2){
        return num1-num2;
    }
}
class B extends A{    //B类继承了A，增加一个新的功能：完成两个数相加然后和9求和
    public int func1(int a,int b){   //重写了 A 类的方法，可能是无意识的
        return a+b;
    }
    public int func2(int a,int b){
        return func1(a,b)+9;
    }
}