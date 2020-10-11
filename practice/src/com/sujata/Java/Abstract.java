package com.sujata.Java;

abstract  class Dog{
    public void bark(){
        System.out.println("Dog says Woof-Woof");
    }
    public  abstract void waits();
}

public class Abstract extends  Dog {

    public static void main(String[] args) {
        Abstract dog = new Abstract();
        dog.waits();
        dog.bark();

    }

    @Override
    public void waits() {
        System.out.println("Dogs waits until you return home.");
    }
}
