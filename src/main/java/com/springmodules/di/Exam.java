package com.springmodules.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

    public static void main(String[] args) {

        // using Spring IOC container to get the beans
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // using a setter injection
        Student student = (Student) context.getBean("student",Student.class);
        student.displayStudentInfo();

        // using a setter injection
        //Student student = (Student) context.getBean("student",Student.class);
        //no need to initialize the student name properties in the code, it's configured in the xml file using the property tag.
        //student.displayStudentInfo();

        // legacy way of creating objects - tightly coupled
        //Student student = new Student();
        //student.setStudentName("Meepo");
        //student.displayStudentInfo();
    }
}
