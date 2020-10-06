package com.sujata.test;

public class MammalTest {
    public static void main(String[] args) {
        Animal a = new Horse();
        Mammal m = new Human();
        m.doesBreastFeed();

        Human h = new Human();
        h.shouldBeIntelligent();
        h.doesBreastFeed();
        h.breathe();
        // This compiles without any error
        // because mammal is also an animal,
        // subtype reference variable m
        // is assigned to the super type
        // reference variable  a
        a = m;
    }
}
