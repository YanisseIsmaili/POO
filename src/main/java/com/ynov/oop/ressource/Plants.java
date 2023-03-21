package com.ynov.oop.ressource;

import com.ynov.oop.CheckVictoryCondition;

public class Plants extends Ressource implements CheckVictoryCondition {

    //condition of win
    @Override
    public boolean checkVictoryCondition() {
        return this.getValue() >= 4;
    }
    //use to format the text, we can use %d for int, %s for string and %f for float
    @Override
    public String toString() {
        return String.format("actual plants =%d | plants production/turn  =+%d ", this.getValue(), this.getProduction() );
    }

    //constructor
    public Plants(){
        super(0, 0);
    }
}