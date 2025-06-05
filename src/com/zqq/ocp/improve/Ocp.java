package com.zqq.ocp.improve;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}
class GraphicEditor{  //这是一个用于绘图的类
    public void drawShape(Shape s){   //接收 Shape 对象，然后根据 type，来绘制不同图形
        s.draw();
    }
}
abstract class Shape{   // Shape 类，基类
    public abstract void draw();  //抽象方法
}
class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
