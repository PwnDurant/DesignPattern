package com.zqq.SinglePrinciple;


public class Single1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}
//交通工具类
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"有一个交通工具在公路上运行...");
    }
}
