package com.world;

public class Test {
    public static void main(String[] args){
        System.out.println("test world");
    }

    public void show(){
        System.out.println("show");
    }

//  protected 修饰   在不同包下的无关类，访问不了，
    protected void print(){
        System.out.println("protected print");
    }
}
