package com.hello;

public class Demo14 {

    public static void main(String[] args){

        System.out.println("demo 14");

        // 正则表达式
        // 检验qq
        // /^[1-9][0-9]${4-14}$/

        System.out.println(checkQQ("0281534481"));

        String regex = "[1-9]\\d{4,14}";
        System.out.println("0281534481".matches(regex)); // 匹配字符串

    }

    public static boolean checkQQ(String qq){
        boolean flag = true;
        if (qq.length() >= 5 && qq.length() <= 15){
            if (!qq.startsWith("0")){
                char[] arr = qq.toCharArray();
                for (int i = 0; i< arr.length;i++){
                    char ch = arr[i];
                    if (!(ch >= '0' && ch <= '9')){
                        flag = false;
                        break;
                    }
                }
            }else {
                flag = false;
            }

        }else {
            flag = false;
        }
        return flag;
    }

}
