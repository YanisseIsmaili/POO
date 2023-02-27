package com.ynov.oop.globalparameter;

import com.ynov.oop.CheckVictoriCondition;

public class Planet implements CheckVictoriCondition{ //
    private Temperature temperature; 
    private Oxygen oxygen;

    @Override
    public boolean isWin(){
    return this.oxygen.isWin() && this.temperature.isWin();
}


    public Planet(Temperature t,Oxygen o) {
        this.temperature = t;
        this.oxygen = o;
    }

    public Oxygen getOxygen() {
        return this.oxygen;
    }

    public Temperature getTemperature() {
        return this.temperature;
    }
}

