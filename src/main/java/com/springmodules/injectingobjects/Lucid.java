package com.springmodules.injectingobjects;

public class Lucid {

    Battery battery;

    public Lucid() {
        System.out.println("New Lucid car is created.");
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
