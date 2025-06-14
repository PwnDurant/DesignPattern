package com.zqq.ocp;

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
        if(s.m_type == 1) drawRectangle(s);
        else if (s.m_type==2) drawCircle(s);
        else if (s.m_type==3) drawTriangle(s);
    }
    public void drawRectangle(Shape r){
        System.out.println("矩形");
    }
    public void drawCircle(Shape r){
        System.out.println("圆形");
    }
    public void drawTriangle(Shape r){
        System.out.println("三角形");
    }
}
class Shape{   // Shape 类，基类
    int m_type;
}
class Rectangle extends Shape{
    Rectangle(){
        super.m_type=1;
    }
}
class Circle extends Shape{
    Circle(){
        super.m_type=2;
    }
}
class Triangle extends Shape{
    Triangle(){
        super.m_type=3;
    }
}
