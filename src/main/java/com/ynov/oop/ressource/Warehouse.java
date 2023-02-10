package com.ynov.oop.ressource;

public class Warehouse {
    private Credits credits; 
    private Plants plants;
    private Steel steel;

    public Warehouse(Credits c,Plants p,Steel s) {
        this.credits = c;
        this.plants = p;
        this.steel = s;
    }

    public void produce(){
    this.credits.produce();
    this.plants.produce();
    this.steel.produce();
    }

    public Credits getCredits() {
        return this.credits;
    }

    public Plants getPlants() {
        return this.plants;
    }

    public Steel getSteel() {
        return this.steel;
    }

}
