package com.hello;

public class Demo7 {

    public static void main(String[] args){
        System.out.println("Demo 7");
        Persons persons = new Persons();  // 在一创建对象的时候，系统就帮我调用了构造方法
//        persons.Persons() // 构造方法不能用对象调用
        persons.show();

        PersonRe personRe = new PersonRe("戚培俊",25);
        personRe.show();

        Personss personss = new Personss("戚培俊",25);
        personss.setName("qipeijun");
        personss.show();

    }



}


class Persons {
    private String name;
    private int age;

//    构造方法
    public Persons(){
//        System.out.println("hello 7");
//        return; // 构造方法也是有return 语句的，格式是return;
        name = "戚培俊";
        age = 23;
    }

    public void show() {
        System.out.println(name+" "+ age);
    }
}


// 构造方法的重载
class PersonRe {
    private String name;
    private int age;

    public PersonRe(){
        System.out.println("空参数的构造");
    }

    public PersonRe(String name,int age){
        System.out.println("有参数的构造");
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name+" "+ age);
    }
}


class Personss {
    private String name;
    private int age;

    public Personss() {

    }

    public Personss (String name, int age){
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
        System.out.println(name+" "+ age);
    }
}
