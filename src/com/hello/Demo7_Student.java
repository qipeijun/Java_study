package com.hello;

import java.util.Scanner;

public class Demo7_Student {

    public static void main(String[] args) {

        System.out.println("DEMO 7 STUDENT");

        Studentss studentss = new Studentss("戚培俊", 25);
        studentss.show();
        studentss.setName("qpj");
        studentss.show();

        Rectangle rectangle = new Rectangle(100,100);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getArea());

        rectangle.setWidth(200);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getArea());

    }
}

/**
 * 成员变量
 *
 * 构造方法
 *  无参数  有参数
 *
 *  成员方法
 *  setxxx  getxxx
 */
class Studentss {
    private String name;
    private int age;

    public Studentss() {
    } // 空参数构造

    public Studentss(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(this.name + "===" + this.age);
    }
}


/**
 * 求矩形面积和周长
 */

class Rectangle {
    private int width;
    private int height;

    public Rectangle(){}

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return this.width*this.height;
    }

    public int getLength() {
        return (this.width+this.height) * 2;
    }
}


