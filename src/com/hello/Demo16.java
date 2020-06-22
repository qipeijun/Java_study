package com.hello;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Demo16 {

    public static void main(String[] args){

        System.out.println("DEMO 16");

        // 去重
        List list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

//        System.out.println(list);

//        System.out.println(getSingle((ArrayList) list));
        ArrayList newList = getSingle((ArrayList) list);
        System.out.println(newList);


        ArrayList pList = new ArrayList();
        pList.add(new Per("戚培俊",25));
        pList.add(new Per("李四",25));
        pList.add(new Per("王五",25));
        pList.add(new Per("王五",25));
        pList.add(new Per("李四",25));

        System.out.println(pList);

        ArrayList newP = getSingleObj(pList);

        System.out.println(newP);


    }

    @SuppressWarnings("rawtypes")
    private static ArrayList getSingleObj(ArrayList pList) {
        ArrayList newList = new ArrayList();  // 创建新集合
        Iterator it = pList.iterator();
        while (it.hasNext()){
            Object o = it.next();
            if (!newList.contains(o)){
                newList.add(o);
            }
        }
        return newList;
    }

    @SuppressWarnings("rawtypes")
    public static ArrayList getSingle(ArrayList list){
        ArrayList newList = new ArrayList();  // 创建新集合
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object item = it.next();
            if (!newList.contains(item)){
                newList.add(item);
            }
        }
        return newList;
    }



}


class Per{
    private String name;
    private int age;

    public Per(){}

    public Per(String name,int age){
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Per per = (Per) o;
        return this.name.equals(per.name) && this.age == per.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
