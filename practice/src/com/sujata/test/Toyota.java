package com.sujata.test;

public class Toyota extends Car implements DoubleEngine {

    private int tyre;
    private int mirror;

    public int getTyre() {
        return tyre;
    }

    public void setTyre(int tyre) {
        this.tyre = tyre;
    }

    @Override
    public void setMirror(int mirror) {
        this.mirror = mirror;
    }

    @Override
    public int getMirror() {
        return mirror;
    }


    public void setMirror(int mirror, int color) {
        this.mirror = mirror;
    }

    @Override
    public Car getOilchamber() {
        return new Car();
    }

    @Override
    public void test() {

    }
}
