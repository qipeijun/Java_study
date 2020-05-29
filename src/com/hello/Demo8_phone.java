package com.hello;

public class Demo8_phone {

    public static void main(String[] args){
        System.out.println("demo 8 phone");

        Ios8 ios8 = new Ios8("test");
        ios8.siri();
        ios8.showName();
        Ios8.speak();  // 静态方法可以直接调用

    }
}


class Ios7 {

    private String name;
    public Ios7(){}

    public Ios7(String name){
        this.name = name;
    }

    public void showName(){
        System.out.println(this.name);
    }

    public void call(){
        System.out.println("打电话");
    }

    public void siri(){
        System.out.println("说英文");
    }
}


/**
 * 方法重写的应用：
 *  当子类需要父类的功能，而功能主体子类有自己特有内容，可以重写父类中的方法
 *  这样沿袭了父类的功能
 */

class Ios8 extends Ios7 {

    public Ios8() {}

    public Ios8(String name){
        super(name);
    }

    public static void speak(){
        System.out.println("说话");
    }

    public void siri() {
        super.siri();
        System.out.println("说中文");
    }
}


/**
 *
 * 父类中，私有方法不能被重写
 * 因为父类私有方法，子类继承不到
 *
 * 子类重写父类方法，访问权限不能更低 最好一致
 *
 * 父类是静态方法，子类也必须通过静态方法进行重写，(静态只能覆盖静态)
 *
 * 子类重写父类方法的时候，最好声明一模一样
 *
 */
