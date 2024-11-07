package com.max.test;

public class Dog extends Animal {
    public Dog(String name, int legs) {
        super(name, legs);
    }

    private void bark() {
        System.out.println("Bark");
    }

    @Override
    public void doTrick() {
        System.out.println("Dog trick");
    }
}
