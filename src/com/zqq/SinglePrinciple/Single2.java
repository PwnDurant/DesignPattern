package com.zqq.SinglePrinciple;

public class Single2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路运行");
    }
}
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在天空运行");
    }
}
class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在水中运行");
    }
}

