package com.sujata.test;

import java.util.ArrayList;

public class Wrapper {
    public static void main(String[] args) {
        ArrayList<Integer> myTest = new ArrayList<Integer>();
        myTest.add(5);
        myTest.add(10);
        myTest.add(20);
        for (int i: myTest){
            System.out.println(i);
        }
        System.out.println("================");
        Car car1 = new Car();

        Car toyota = new Car("toyoat","afds");
        Car subaru= new Car("subarut","afds");


        ArrayList<Car>  listOfCars ;
        listOfCars = new ArrayList<Car>();
        listOfCars.add(car1);
        listOfCars.add(toyota);
        listOfCars.add(new Car("honda civic","fasdf"));

        for(Car  i: listOfCars) {
            System.out.println(i.getName());
            System.out.println(i.getModel());
        }

    }

}

