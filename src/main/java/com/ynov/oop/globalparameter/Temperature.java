package com.ynov.oop.globalparameter;

import com.ynov.oop.CheckVictoryCondition;

public class Temperature implements CheckVictoryCondition{
    private int value;

    //constructor
    public Temperature() {
        this.value = -30;
    }
    //increase the value of temperature
    public void increaseTemperature (int increment) {
        this.value += increment;
    }
    //condition of win
    @Override
    public boolean checkVictoryCondition() {
        return this.value >= 8;
    }
    //use to format the text, we can use %d for int, %s for string and %f for float
    @Override
    public String toString() {
        return String.format("actual temperature = %d°C ", this.value );
    }
}