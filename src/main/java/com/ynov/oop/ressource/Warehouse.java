package com.ynov.oop.ressource;

import com.ynov.oop.Endturnaction;

public class Warehouse implements Endturnaction {
    private Credits credits; 
    private Plants plants;
    private Steel steel;

    public Warehouse(Credits c,Plants p,Steel s) {
        this.credits = c;
        this.plants = p;
        this.steel = s;
    }

    public void endTurnAction(){
    this.credits.endTurnAction();
    this.plants.endTurnAction();
    this.steel.endTurnAction();
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
