package com.ynov.oop.globalparameter;



public class Planet {
    private Temperature temperature; 
    private Oxygen oxygen;

    public Planet(Temperature t,Oxygen o) {
        this.temperature = t;
        this.oxygen = o;
    }
    public boolean isMax(){
        return this.oxygen.isMax() && this.temperature.isMax();

    }
}

