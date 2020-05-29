package com.hello;

public class Demo8_phone {

    public static void main(String[] args){
        System.out.println("demo 8 phone");

        Ios8 ios8 = new Ios8();
        ios8.siri();

    }
}


class Ios7 {
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
    public void siri() {
        super.siri();
        System.out.println("说中文");
    }
}
