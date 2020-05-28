package com.hello;

public class Demo6_Person {

    public static void main(String[] args) {

        System.out.println("Demo 6 person");

        Person person = new Person();
        person.name = "戚培俊";
        person.speak();

        print(10);

        Students s = new Students();
        print(s);

        Student student = new Student();
        student.showName();

        Mzd m = new Mzd();  // 创建有名函数对象
        m.color = "钢铁灰";
        m.run();
        m.showColor();

        new Mzd().run(); // 匿名函数对象， 匿名对象只适合对方法的一次调用，因为调用多次就会产生多个对象

        // 匿名对象 是否可以调用属性并赋值？
        // 匿名对象可以赋值，但是调用完之后就变成辣鸡了，没有保存下来
        new Mzd().color = "水晶魂动红";
        new Mzd().showColor();

    }

    public static void print(int x) {  // 基本数据类型
        System.out.println(x);
    }

    public static void print(Students s) {  // 引用数据类型当做形式参数
        s.name = "戚培俊";
        s.age = 25;
        s.speak();
    }
}


class Person {
    String name;

    public void speak() {
        int num = 10;  // x 和 num 都是局部变量
        System.out.println(name);
        System.out.println(num);
    }
}


class Students {
    String name;
    int age;

    public void speak() {
        System.out.println(name + " " + age);
    }
}

class Mzd {
    String color;
    int num;

    public void run() {
        System.out.println("120km/h");
    }

    public void showColor() {
        System.out.println(color);
    }
}