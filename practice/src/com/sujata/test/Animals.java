package com.sujata.test;
//abstract class
abstract class Animals { //abstract class can have constructor  and treats parent class as super class,  cant have obj
   // so  child class make object to call abstract method having no body,   abstract method must have abstract class
    public abstract void sound();
    public abstract  void color();

    void Legs(){
        //concrete method can have body
        System.out.println("They have 4 legs");
    }
    //no body in abstract method
    //cant create abstract class obj
}

 class Dog extends Animals{
    @Override
    public void sound(){
        System.out.println("Woof Woof");
     }

     @Override
     public void color() {
         System.out.println("Black and White");
     }




     public static void main(String[] args) {
         Animals objDog = new Dog();
         objDog.sound();
         objDog.color();
         objDog.Legs();
         System.out.println("====================");
         Animals myObj = new Cat();
         myObj.color();
         myObj.sound();
         //myObj.Legs();
         //concrete method is not compulsary to call

     }
 }
