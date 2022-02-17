package com.springmodules.ioc;

public class Verizon implements Sim{

    Verizon(){
        System.out.println("You are using a verizon sim.");
    }

    @Override
    public void calling() {

        System.out.println("Calling using Verison Sim");
    }

    @Override
    public void data() {
        System.out.println("browsing internet using Verison Sim");
    }
}
