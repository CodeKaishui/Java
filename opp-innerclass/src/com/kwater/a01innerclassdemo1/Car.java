package com.kwater.a01innerclassdemo1;

import org.w3c.dom.ls.LSOutput;

public class Car {
    private String brand;
    private int CarAge;
    private String CarColor;

    public void show(){
        System.out.println(brand);
        Engine e = new Engine();
        System.out.println(e.engineBrand);
    }


    class Engine{
        private String engineBrand;
        private int engineAge;
        public void show(){
            System.out.println(brand);
        }


    }
}
