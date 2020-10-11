package com.sujata.test;

import java.util.Scanner;

public class Enum {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.HIGH;
        System.out.println(myVar);
        System.out.println("================");

        for (Level myNum : Level.values()) {
            System.out.println(myNum);
        }
        System.out.println("==================");

        //User input using scanner
        Scanner myObj = new Scanner(System.in);
            String userNAme;

            System.out.println("Enter username:");
            userNAme = myObj.nextLine();

            System.out.println("Username is:" + userNAme);
    }
}


