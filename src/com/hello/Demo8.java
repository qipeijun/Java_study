package com.hello;

public class Demo8 {

    public static void main(String[] args) {

        System.out.println("demo 8");

        /** 局部代码块 作用：限定了变量的生命周期 */
        {
            int x = 10;
            System.out.println(x);
        }

        /** 在代码块范围外访问不到 */
//        System.out.println(x);

        /**  */

        Student_demo8 student_demo8 = new Student_demo8();
        student_demo8.setName("戚培俊");
        student_demo8.setAge(25);

        System.out.println(student_demo8.getName());

    }

//    静态代码块 优先于主方法执行
    static {
        System.out.println("我是在主方法执行的代码块");
    }
}


class Student_demo8{
    private String name;
    private int age;

    public Student_demo8() {
//        study();
    }

    public Student_demo8(String name,int age){
//        study();
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


    // 构造代码块，每次创建一次对象就会执行一次，优先于构造函数执行
    {
        study();
        System.out.println("构造代码块");
    }

//    随着类的加载而加载，只执行一次 作用：用来给类执行初始化值，一般用来加载驱动
    static {
        System.out.println("我是静态代码块");
    }

    public void study(){
        System.out.println("学生学习");
    }
}
