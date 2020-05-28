package com.hello;

public class Demo6_Car {

    public static void main(String[] args) {

        System.out.println("demo 6 car");

        Mazda m1 = new Mazda();
        method(m1);
        m1.run();

        Mazda m2 = new Mazda();
        method(m2);
        m2.run();

        Audi audi = new Audi();
        audi.setColor("珍珠白");
        audi.setSpeed(-140);
        audi.setSpeed(130);
        audi.run();

        Iphone iphone = new Iphone();
        iphone.setBrand("iPhone 11");
        iphone.setPrice(5999);
        iphone.playGame();


    }

    //    抽取方法，提高代码的复用性
    public static void method(Mazda cc) {
        cc.color = "水晶魂动红";
        cc.speed = 120;
    }

}


class Mazda {
    String color;
    int speed;

    public void run() {
        System.out.println("120km/h");
    }

}

class Audi {
    private String color;
    private int speed;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("速度不合理");
            return;
        }
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void run() {
        System.out.println(speed + "km/h");
    }
}


class Iphone {
    private String brand;
    private int price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("价格不合理");
            return;
        }
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void playGame() {
        System.out.println("王者荣耀，启动...");
    }
}

