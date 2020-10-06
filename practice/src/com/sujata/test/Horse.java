package com.sujata.test;

// Horse which implements the
// Animal
public class Horse implements Animal , KaloGhoda{
    @Override
    public CarbonDiOxide breathe() {
        return  new CarbonDiOxide();
    }

    @Override
    public Boolean shouldBeBlack() {
        //ye ghoda lai kalo rang laide hai

        //rang kinyo
        //
        return  true;
    }
    // body
}
