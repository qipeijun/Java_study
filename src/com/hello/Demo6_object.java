package com.hello;

import java.util.Objects;

public class Demo6_object {

    public static void main(String[] args) {

        System.out.println("Demo6 object");

//        创建对象的格式
//        对象名的命名，其实就是合法的标识符,如果的一个单词，所有字母小写，如果是多个单词，从第二个单词开始首字母大写
        Student student = new Student();
        student.name = "戚培俊";
        student.age = 25;
        student.gender = "男";
        student.study();
        student.showName();

        Phone phone = new Phone();
        phone.brand = "iPhone 11";
        phone.price = 5999;
        phone.call();
        phone.sendMessage();
        phone.playGame();

        Car car = new Car();
        car.color = "水晶魂动红";
        car.num = 4;
        car.run();

        Car car1 = car;  // 引用对象
        car1.run();


    }


}


// 单独定义一个学生类
class Student {

    //    属性描述
    String name;
    int age;
    String gender;

    public void showName() {
        System.out.println(name);
    }

    //    行为
    public void study() {  // 定义学习的方法
        System.out.println("学习方法");
    }

    public void sleep() {
        System.out.println("学生睡觉");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}

class Phone {

    String brand;
    int price;

    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage() {
        System.out.println("发信息");
    }

    public void playGame() {
        System.out.println("玩游戏");
    }

}


class Car {

    String color;  // 颜色
    int num;  // 轮胎数量

    public void run() {
        System.out.println(color + " ... " + num);
    }

}

// todo 看到了第八节
