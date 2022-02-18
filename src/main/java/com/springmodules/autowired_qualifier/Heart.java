package com.springmodules.autowired_qualifier;

import org.springframework.stereotype.Component;

@Component
public class Heart {

    private String organism;
    private int numOfHeart;

    public String getOrganism() {
        return organism;
    }

    public void setOrganism(String organism) {
        this.organism = organism;
    }

    public int getNumOfHeart() {
        return numOfHeart;
    }

    public void setNumOfHeart(int numOfHeart) {
        this.numOfHeart = numOfHeart;
    }

    public void pump(){
        System.out.println("Heart Is Pumping.");
    }
}
