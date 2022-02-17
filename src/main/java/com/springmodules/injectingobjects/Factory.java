package com.springmodules.injectingobjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Factory {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //Battery battery = new LongBatteryRange();
        Tesla myTesla = context.getBean("tesla", Tesla.class);
        myTesla.battery.longestRange();
        Rivian myRivian = context.getBean("rivian", Rivian.class);
        myRivian.battery.longestRange();
        Lucid myLucid = context.getBean("lucid", Lucid.class);
        myLucid.battery.longestRange();
    }
}
