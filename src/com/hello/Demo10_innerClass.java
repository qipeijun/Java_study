package com.hello;

public class Demo10_innerClass {

    public static void main(String[] args){
        System.out.println("内部类");

        Outer outer = new Outer();
        outer.print();
//        Outer.Inner outer.new Inner();
//        Outer.Inner oi = new Outer().new Inner();  // 创建内部类对象
//        oi.method();


//        访问静态内部类  外部类名.内部类名 对象名 = 外部类名.内部对象
        Outers.Inners oi = new Outers.Inners();
        oi.method();


    }

}


class Outer{

    private int num = 10;

    // 内部类看成成员方法
//    class Inner{
//        public void method(){
//            System.out.println("内部类"+num);
//        }
//    }

    private class Inner{

        public int num = 20;

        public void method(){
            System.out.println("内部类"+num);
        }

        public void show(){

            int num = 30;

            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);

        }

    }

    public void print(){
        Inner inner = new Inner();
        inner.method();
    }
}


class Outers {
    static class Inners{
        public void method(){
            System.out.println("静态内部类");
        }
    }
}



