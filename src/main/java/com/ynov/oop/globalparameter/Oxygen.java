package com.ynov.oop.globalparameter;

public class Oxygen {
    private int value;

    public void increase (int increment){
        this.value = this.value + increment ;
    }

    public boolean isMax (){
        return this.value >= 14; 
    }
    
    public Oxygen () {
        this.value = 0;
    }

}

