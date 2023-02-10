package com.ynov.oop.globalparameter;

public class Temperature {
    private int value;

    public void increase (int increment){
        this.value = this.value + increment ;
    }

    public boolean isMax(){
        return this.value <= 8;
    }
    
    public Temperature () {
        this.value = -30;
    }
}
