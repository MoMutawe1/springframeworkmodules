package com.springmodules.injectingobjects;

public class LongBatteryRange implements Battery {

    @Override
    public void longestRange() {
        System.out.println("longest Range for large battery is 700 mile..");
    }
}
