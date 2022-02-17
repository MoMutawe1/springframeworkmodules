package com.springmodules.injectingobjects;

public class Tesla {

    int teslaId;
    Battery battery;

    public Tesla() {
        System.out.println("New Tesla car is created.");
    }

    public void setTeslaId(int teslaId) {
        this.teslaId = teslaId;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
