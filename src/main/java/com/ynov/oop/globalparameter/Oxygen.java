package com.ynov.oop.globalparameter;

public class Oxygen {
    private int value;
    private int production;

    public void use(int oxygenuse){
        this.value = this.value - oxygenuse ;
    }

    public void produce (){
        this.value = this.value + this.production ;
    }
}

