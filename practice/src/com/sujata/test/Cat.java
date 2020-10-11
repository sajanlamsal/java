package com.sujata.test;



//if you don't need to implement every method of parent(Animals) class then declare Cat as abstract class
public class Cat  extends Animals{
    @Override
    public void sound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void color() {
        System.out.println("White");
    }

//    @Override
//    public void Legs(){
//        System.out.println("4");
//    }

}
