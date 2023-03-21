package com.ynov.oop.globalparameter;

import com.ynov.oop.CheckVictoryCondition;

public class Oxygen implements CheckVictoryCondition{
     private int value;

     //constructor
    public Oxygen() {
        this.value = 0;
    }
     //increase the value of oxygen
    public void increaseOxygen (int increment) {
        this.value += increment;
    }
    //condition of win
    @Override
    public boolean checkVictoryCondition() {
        return this.value >= 14;
    }
    //use to format the text, we can use %d for int, %s for string and %f for float
    @Override
    public String toString() {
        return String.format("oxygen amount = %d%% ", this.value );
    }
}
    
