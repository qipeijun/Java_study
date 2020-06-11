package com.hello;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo14_Pattern {

    public static void main(String[] args){

        Pattern p = Pattern.compile("a*b");  // 获取到正则表达式
        Matcher m = p.matcher("aaaad"); // 获取匹配器
        boolean b = m.matches();  // 正则检验
        System.out.println(b);

        // 提取手机号
        String s = "我的号码是18126072587";
        String regex = "1[35789]\\d{9}";  // 手机号码正则表达式
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s);
//        boolean b1 = m1.matches();
        boolean b1 = m1.find();  // 需要先找 在获取
        String s1 = m1.group(); // 提取出手机号

        System.out.println(b1);
        System.out.println(s1);

    }

}
