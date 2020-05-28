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
    int age;

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}

class Cat extends Animal{
    int age; // 父类已经定义完了，子类在定义已经没有意义了
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


    public Dog(){
        super(); // 这是一条语句，如果不写，系统默认会加上，用来访问父类中的空参构造
    }

    public void show(){
        // this 调用的是本类的， super 调用的父类的
        System.out.println(this.color+"..."+this.leg);
        System.out.println(super.color+"..."+super.leg);
    }

}

/**
 *
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
 *
 * java中类的继承特点
 * 如果想用这个体系中的所有功能用最底层的类创建对象
 * 如果想看这个体系的共性功能，看最顶层的类
 *
 * 继承的注意事项
 * 子类只能继承父类所有非私有的成员(成员方法和变量)
 * 子类不能继承父类的构造方法，但是可以通过super 关键字去访问父类构造方法
 * 不要为了部分功能而去继承
 *
 * 父类没有无参的构造方法，子类怎么办？
 * super 解决
 * this 解决
 * 注意事项 ： super(..) 或者 this(...) 必须出现在构造方法的第一天语句上
 *
 */
