package com.ynov.oop.globalparameter;

import com.ynov.oop.CheckVictoryCondition;

public class Planet implements CheckVictoryCondition, HaveGlobalParameter{
    private Oxygen oxygen;
    private Temperature temperature;

    //constructor
    public Planet(Temperature t, Oxygen o) {
        this.temperature = t;
        this.oxygen = o;
    }
    //condition of win the game
    @Override
    public boolean checkVictoryCondition() {
        return this.oxygen.checkVictoryCondition() && this.temperature.checkVictoryCondition();
    }
    //getter of oxygen
    @Override
    public Oxygen getOxygen(){
        return this.oxygen;
    }
    //getter of temperature
    @Override
    public Temperature getTemperature(){
        return this.temperature;
    }
    //use to format the text, we can use %d for int, %s for string and %f for float
    @Override
    public String toString() {
        return String.format("%s\n%s", this.oxygen, this.temperature );
    }
}