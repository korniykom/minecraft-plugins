package com.max.test;

public abstract class Vehicle {

    public String test = "test String";

    public void test() {};

    private int wheels;

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public abstract void activateBreaks();

}
