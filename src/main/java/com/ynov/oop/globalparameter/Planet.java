package com.ynov.oop.globalparameter;

public class Planet {
    private Temperature temperature; 
    private Oxygen oxygen;

    public Planet(Temperature c,Oxygen p) {
        this.temperature = c;
        this.oxygen = p;
    }

    public void produce(){
    this.temperature.produce();
    this.oxygen.produce();
    }
}

