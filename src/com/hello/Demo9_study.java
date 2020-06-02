package com.hello;

public class Demo9_study {

    public static void main(String[] args) {
        System.out.println("demo 9 study");

        Cat1 cat1 = new Cat1("蓝猫", 1);
        cat1.hige();

        Dog1 dog1 = new Dog1("哈士奇", 1);
        dog1.hige();

    }

}


class Anima {
    String name;
    int age;

    // 空参数构造
    public Anima() {
    }

    ;

    // 有参数构造
    public Anima(String name, int age) {
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
        System.out.println(this.name + "。。。。" + this.age);
    }
}

interface Hige {
    // 跳高
    public abstract void hige();
}

class Cat1 extends Anima implements Hige {

    public Cat1() {
    }

    ;

    public Cat1(String name, int age) {
        super(name, age);
    }

    @Override
    public void hige() {
        System.out.println("猫能跳50cm");
    }
}

class Dog1 extends Anima implements Hige {

    public Dog1() {
    };

    public Dog1(String name, int age) {
        super(name, age);
    }

    @Override
    public void hige() {
        System.out.println("狗能跳100cm");
    }
}


