package com.springmodules.injectingobjects;

public class Rivian {

    Battery battery;

    public Rivian() {
        System.out.println("New Rivian car is created.");
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
