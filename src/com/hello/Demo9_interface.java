package com.hello;

public class Demo9_interface {

    public static void main(String[] args) {
        System.out.println("demo 9 interface");

        // 接口不能被实例化，没有意义
//        Inter inter = new Inter();

        Demo9_inter demo9_inter = new Demo9_inter();
        demo9_inter.print();
        demo9_inter.show();
    }
}


/**
 * 对外提供规则的都是接口
 * <p>
 * 接口用interface 关键字表示
 * <p>
 * 接口的子类，可以是抽象类，但是意义不大
 * 可以的具体类，要重写接口中所有的抽象方法 （推荐）
 * <p>
 * 成员变量 只能是常量，并且是静态的并公共的，
 * 默认修饰符 ： public static final 三个关键字可以相互交换，建议手动给出
 * <p>
 * 构造方法 接口中没有构造方法
 * <p>
 * 一个接口不写继承任何类，默认继承Object
 *
 * 接口与接口的关系，可以单继承，也可以多继承
 */


interface Inter {
    // 接口中的方法都是抽象的
    public abstract void print();

    public abstract void show();

    public static final int num = 10;

//    public void prints(){} // 接口中不能定义非抽象方法

//    public Inter(){} // 接口中没有构造方法
}

interface InterA {
//    public static final int nums = 10;
    public abstract void showMe();
}

// 接口继承，可以多继承
interface InterB extends InterA,Inter{

}

class Demo9_inter implements Inter,InterA {
    @Override
    public void print() {
        System.out.println(num);
        System.out.println("接口");
    }

    @Override
    public void show() {
        System.out.println("重写show方法");
    }

    @Override
    public void showMe() {
        System.out.println("重写show ME");
    }
}






