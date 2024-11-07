package com.max.test;

public abstract class Animal {

    public String name;
    public int legs;
    public void jump() {
        System.out.println("Jump");
    }

    public Animal (String name, int legs)  {
        this.legs = legs;
        this.name = name;
    }

    public abstract void doTrick();
}
