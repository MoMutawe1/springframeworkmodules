package com.springmodules.value_required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NinjaAcademy {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Kid kid = context.getBean("kidbean", Kid.class);
        kid.displayKidInfo();
    }
}
