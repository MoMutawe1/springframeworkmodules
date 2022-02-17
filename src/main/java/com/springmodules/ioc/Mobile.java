package com.springmodules.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

    public static void main(String[] args) {

        // using Spring Framework IOC container to generate the beans - loosely coupled
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Sim sim = (Verizon)context.getBean("verizon", Verizon.class);
        sim.calling();
        sim.data();

        // using polymorphism to create an instance of Verizon object using Sim interface - tightly coupled
        //Sim vObj = new Verizon();
        //vObj.calling();
        //vObj.data();

        // using polymorphism to create an instance of Verizon object using Sim interface - tightly coupled
        //System.out.println();
        //Sim aObj = new Att();
        //aObj.calling();
        //aObj.data();

        // creating an instance of Verizon class using new operator - tightly coupled
        //Verizon verizonObj = new Verizon();
        //verizonObj.calling();
        //verizonObj.data();

        // creating an instance of Att class using new operator - tightly coupled
        //System.out.println();
        //Att attObj = new Att();
        //attObj.calling();
        //attObj.data();

    }
}
