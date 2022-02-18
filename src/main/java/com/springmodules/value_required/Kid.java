package com.springmodules.value_required;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

import java.lang.annotation.Repeatable;

public class Kid {
    @Value("${kid.name}")
    private String name;
    @Value("${kid.age}")
    private int age;
    @Value("${kid.hobby}")
    private String hobby;

    public String getName() {
        return name;
    }

    public Kid() {
    }

    public Kid(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    //@Value("${kid.name}")
    //@Required  annotation is deprecated, the constructor injection is the replacement for @Required annotation.
    //We can replace the setter method by adding the @Value annotation in the properties
    //public void setName(String name) {
       // this.name = name;
    //}

    public int getAge() {
        return age;
    }

    //@Value("${kid.age}")
    //@Required  annotation is deprecated, the constructor injection is the replacement for @Required annotation.
    //We can replace the setter method by adding the @Value annotation in the properties
    //public void setAge(int age) {
        //this.age = age;
    //}

    public String getHobby() {
        return hobby;
    }

    //@Value("${kid.hobby}")
    //We can replace the setter method by adding the @Value annotation in the properties
    //public void setHobby(String hobby) {
        //this.hobby = hobby;
    //}

    public void displayKidInfo(){
        System.out.println("Kid name: " + name);
        System.out.println("Kid age: " + age);
        System.out.println("Kid hobby: " + hobby);
    }
}
