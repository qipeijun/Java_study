package com.hello;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo16_Generic {

    public static void main(String[] args){

        System.out.println("DEMO 16 generic");

        /**
         * 泛型的好处
         *  提高安全性
         *  省去强转的麻烦
         *
         * 泛型的基本使用
         *  <>中放的必须是引用数据类型
         *
         *  泛型的注意事项
         *  前后的泛型必须一致，或者后面的泛型可以省略不写
         *
         *  泛型一般不定义Object  没什么意义
         */

        ArrayList list = new ArrayList();
        ArrayList<String> list1 = new ArrayList();

        list.add(110);
        list.add("戚培俊");

        Iterator it = list.iterator();
        while (it.hasNext()){
//            System.out.println(it.next());

        }






    }

}

// todo 16-11

