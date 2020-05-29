package com.hello;

public class Demo9 {

    public static void main(String[] args){
        System.out.println("demo 9");

        Catss catss = new Catss();
        catss.eat();

        // 父类引用 指向 子类对象
        Animalss animalss = new Catss();
        animalss.eat();

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


class Animalss {

    public void eat(){
        System.out.println("动物吃饭");
    }

}

class Catss extends Animalss {
    @Override
    public void eat() {
//        super.eat();
        System.out.println("猫吃鱼");
    }
}

// TODO 9-5 节