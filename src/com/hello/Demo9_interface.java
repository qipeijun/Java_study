package com.hello;

public class Demo9_interface {

    public static void main(String[] args){
        System.out.println("demo 9 interface");

        // 接口不能被实例化，没有意义
//        Inter inter = new Inter();

        Demo9_inter demo9_inter = new Demo9_inter();
        demo9_inter.print();
    }
}


/**
 *
 * 对外提供规则的都是接口
 *
 * 接口用interface 关键字表示
 *
 * 接口的子类，可以是抽象类，但是意义不大
 * 可以的具体类，要重写接口中所有的抽象方法 （推荐）
 *
 */



interface Inter {
    // 接口中的方法都是抽象的
    public abstract void print();
}

class Demo9_inter implements Inter{
    @Override
    public void print() {
        System.out.println("接口");
    }
}

// todo 9-17