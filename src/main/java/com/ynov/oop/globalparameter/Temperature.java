package com.ynov.oop.globalparameter;

public class Temperature {
    private int value;
    private int production;

    public void use(int temperatureuse){
        this.value = this.value - temperatureuse ;
    }

    public void produce (){
        this.value = this.value + this.production ;
    }
}
