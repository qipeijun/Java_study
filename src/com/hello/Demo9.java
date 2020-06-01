package com.hello;

public class Demo9 {

    public static void main(String[] args){
        System.out.println("demo 9");

        Catss catss = new Catss();
        catss.eat();

        // 父类引用 指向 子类对象
        Animalss animalss = new Catss();
        animalss.eat();
//        强制类型转换(不强制转换不能使用子类的属性和方法)
        Catss ct = (Catss)animalss;
        ct.show();

        Chouxiang chouxiang = new Chouxiang() {
            @Override
            public void show() {
               System.out.println("抽象类方法");
            }
        };

        chouxiang.show();
        chouxiang.speak();



    }

}

/**
 *
 * 多态概述
 * 事务存在多种形体
 *
 * 多态前提：
 * 1.要有继承关系
 * 2.要有方法重写
 * 3.要有父类引用指向子类对象
 *
 */


abstract class Animalss {

    public Animalss(){};

    public abstract void eat();

//    public void eat(){
//        System.out.println("动物吃饭");
//    }

}

class Catss extends Animalss {

    public Catss(){};

    @Override
    public void eat() {
//        super.eat();
        System.out.println("猫吃鱼");
    }

    public void show(){
        System.out.println("show");
    }
}

/**
 *
 * 多态向上 转型
 * 向下转型 (Catss)强转 向下转型
 *
 */



/**
 * 抽象类 abstract
 * 抽象类不能被实例化
 * 抽象方法 强制子类要做的事
 */
abstract class Chouxiang {
    // 抽象方法,子类需要强制重新写
    public abstract void show();

    public void speak(){
        System.out.println("说句话");
    }

}