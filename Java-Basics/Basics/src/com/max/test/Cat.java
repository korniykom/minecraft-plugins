package com.max.test;

public class Cat extends Animal {
    public Cat(String name, int legs) {
        super(name, legs);
    }
    private void meow() {
        System.out.println("Meows");
    }
    @Override
    public void doTrick() {
        System.out.println("Cat trick");
    }
}
