package com.hello;

public class Demo10_noInnerClass {

    public static void main(String[] args){
        System.out.println("匿名内部类");

        Outerss outerss = new Outerss();
        outerss.method();

    }

}


interface Inner{
    public void print();
}

class Outerss{
    class Innerss implements Inner{
        @Override
        public void print() {
            System.out.println("重写print");
        }
    }



    public void method(){
//        Innerss innerss = new Innerss();
//        innerss.print();
//        new Innerss(){
//
//            // 重写抽象方法
//            @Override
//            public void print() {
//                super.print();
//            }
//        }.print();
        new Inner(){
            @Override
            public void print() {  // 重写抽象方法
                System.out.println("实现Inner 接口");
            }
        }.print();
    }
}


/**
 * 匿名内部类 只针对 重写一个方法使用
 */