package com.hello;

public class Demo11_toString {

    public static void main(String[] args){
        System.out.println("demo 11 to string");

        Student student = new Student();
        String s = student.toString();
        System.out.println(s);  // com.hello.Student@610455d6

    }

}
