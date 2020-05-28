package com.hello;

public class Demo8_extends {

    public static void main(String[] args){
        System.out.println("demo8 extends");

        Dog dog = new Dog();
        dog.color = "white";
        dog.leg = 4;
        dog.sleep();
        dog.eat();
        dog.show();
        Cat cat = new Cat();
        cat.sleep();


    }

}


class Animal {
    String color;  // 动物的颜色
    int leg;  // 动物腿的个数

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}

class Cat extends Animal{
//    String color;  // 动物的颜色
//    int leg;  // 动物腿的个数
//
//    public void eat(){
//        System.out.println("吃饭");
//    }
//
//    public void sleep(){
//        System.out.println("睡觉");
//    }
}

class Dog extends Animal{

    public void show(){
        System.out.println(this.color+"..."+this.leg);
    }

}

/**
 * 继承的好处 :
 * 提高了代码的复用性
 * 提高的代码的维护性
 * 让类与类之间产生了关系，是多态的前提
 *
 * 继承的缺点
 * 耦合性特别强
 *
 * 开发的原则，高内聚 低耦合
 *
 * java 中继承的特点:
 * 只支持单继承
 *
 * 多继承有安全隐患
 */
