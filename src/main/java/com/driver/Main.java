package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name = "aman";
        obj.setName("amir");
        System.out.print(obj.getName());


    }
}