package com.springmodules.ioc;

public class Att implements Sim{

    @Override
    public void calling() {
        System.out.println("Calling using Att Sim");
    }

    @Override
    public void data() {
        System.out.println("browsing internet using Att Sim");
    }
}
