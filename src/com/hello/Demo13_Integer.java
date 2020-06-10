package com.hello;

public class Demo13_Integer {

    public static void main(String[] args) {

        System.out.println("demo13 Integer");

        // int 转 string
        int i = 100;
        String s = i + "";
        String s1 = String.valueOf(i);
        String s2 = Integer.toString(i);
        System.out.println(s);


        // string => int
        String s3 = "100";
        Integer i2 = new Integer(s3);
        int i3 = i2.intValue();
        int i4 = Integer.parseInt(s3);  // 开发 推荐用这种
        System.out.println(i3);

        String t = "true";
        boolean tt = Boolean.parseBoolean(t);
        System.out.println(tt);

    }

}

