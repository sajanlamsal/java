package com.sujata.test;

public class Car {

    private String name;
    private String model;
    private String silencer;
    private  int mirror = 3;

    public Car() {
    }

    //constructor
    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public Car(String name, String model, String silencer, int mirror) {
        this.name = name;
        this.model = model;
        this.silencer = silencer;
        this.mirror = mirror;
    }


    public int getMirror() {
        return mirror;
    }

    public void setMirror(int mirror) {
        this.mirror = mirror;
    }

    public String getSilencer()
    {
        return silencer;
    }

    public void setSilencer(String silencer)
    {
        this.silencer = silencer;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void speed(int maxSpeed){
        System.out.println("Max speed is :" + maxSpeed);
    }

}
