package com.springmodules.injectingobjects;

public class ShortBatteryRange implements Battery{
    @Override
    public void longestRange() {
        System.out.println("longest Range for small battery is 300 mile..");
    }
}
