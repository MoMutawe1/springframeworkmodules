package com.springmodules.autowired_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    private Heart heart;

    public Human() {
    }

    public Human(Heart heart) {
        this.heart = heart;
    }

    public Heart getHeart() {
        return heart;
    }

    @Autowired
    @Qualifier("humanHeart")
    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void startPumping(){
        if(heart!=null) {
            heart.pump();
            System.out.println("name of the organism is " + heart.getOrganism() +
                    " and the number of hearts it has is: " + heart.getNumOfHeart());
        }
        else
            System.out.println("you're still dead..");
    }
}
