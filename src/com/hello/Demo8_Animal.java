package com.hello;

public class Demo8_Animal {

    public static void main(String[] args){

        System.out.println("demo 8 animal");

        Cats cats = new Cats("橘色",4);
        cats.eat();
        cats.catchMouse();

        Dogs dogs = new Dogs("白色",4);
        dogs.eat();
        dogs.run();

    }

}



class Animals {
    private String color; // 毛的颜色
    private int leg;  // 腿的个数

    public Animals(){}

    public Animals(String color, int leg){
        this.color = color;
        this.leg = leg;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getLeg() {
        return leg;
    }

    public void eat(){
        System.out.println("吃饭");
    }
}


class Cats extends Animals {

    public Cats(){}

    public Cats(String color,int leg){
        super(color, leg);
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}


class Dogs extends Animals {

    public Dogs() {}

    public Dogs(String color,int leg){
        super(color, leg);
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("狗吃肉");
    }

    public void run(){
        System.out.println("遛狗");
    }
}


/**
 *
 * final 概述
 * final 是最终的
 *
 * final 修饰特点
 * 修饰类，类不能被继承
 * 修饰变量，变量就变成了常量，只能被赋值一次
 * 修饰方法，方法不能被重写
 * final 初始化必须要赋值，不然没有意义
 */

