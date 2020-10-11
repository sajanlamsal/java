package com.sujata.Java;


interface Plant
{
    String color = "Yellow";
    void growOut();
    void blooms();

}

public class InterfaceExample  implements  Plant {

    public static void main(String[] args) {

        InterfaceExample flower = new InterfaceExample();
        flower.growOut();
        flower.blooms();

        System.out.println("The flower is:"+color);

    }


    @Override
    public void growOut() {
        System.out.println("It has grown into a beautiful plant.");

    }

    @Override
    public void blooms() {
        System.out.println("Now it  started to bloom");

    }
}
