package com.zqq.IoC;

public class DependencyPass {
    public static void main(String[] args) {
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(new AppleTV());
//        openAndClose.open(new SMTV());

//        OpenAndClose openAndClose1 = new OpenAndClose(new AppleTV());
//        openAndClose1.open();
//        OpenAndClose openAndClose2 = new OpenAndClose(new SMTV());
//        openAndClose2.open();

        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(new AppleTV());
        openAndClose.open();
        OpenAndClose openAndClose1 = new OpenAndClose();
        openAndClose1.setTv(new AppleTV());
        openAndClose1.open();
    }
}
//1,通过接口传递实现依赖
//开关的接口
//interface IOpenAndClose{
//    public void open(ITV tv); //抽象方法，接收接口
//}
//interface ITV{   //ITV 实现接口
//    public void play();
//}
//class OpenAndClose implements IOpenAndClose{  //实现接口
//    public void open(ITV tv){
//        tv.play();
//    }
//}
class AppleTV implements ITV{
    @Override
    public void play() {
        System.out.println("遥控打开 AppleTV...");
    }
}
class SMTV implements ITV{
    @Override
    public void play() {
        System.out.println("手动打开 三星电视...");
    }
}
//2,通过构造方法依赖传递
//interface IOpenAndClose{
//    public void open();  //抽象方法
//}
//interface ITV{
//    public void play();  //ITV 接口
//}
//class OpenAndClose implements IOpenAndClose{
//    public ITV itv;
//    public OpenAndClose(ITV itv) {
//        this.itv=itv;
//    }
//    @Override
//    public void open() {
//        this.itv.play();
//    }
//}
//3，通过 setter 方法传递
interface IOpenAndClose{
    public void open(); //抽象方法
    public void setTv(ITV tv);
}
interface ITV{   //ITV 接口
    public void play();
}
class OpenAndClose implements IOpenAndClose{
    private ITV itv;
    @Override
    public void open() {
        this.itv.play();
    }
    @Override
    public void setTv(ITV tv) {
        this.itv=tv;
    }
}
