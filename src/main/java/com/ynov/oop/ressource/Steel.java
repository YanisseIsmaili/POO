package com.ynov.oop.ressource;

import com.ynov.oop.EndTurnAction;

public class Steel implements EndTurnAction{

    private int value;
    private int production;

    // this is used at the end of each turn to increase the current value of this ressource
    @Override
    public void endTurnAction() {
        this.value = this.value + this.production;
    }
    //use to format the text, we can use %d for int, %s for string and %f for float
    @Override
    public String toString() {
        return String.format("actual steels =%d | steel production/turn  =+%d ", this.value, this.production );
    }

    //constructor
    public Steel(){
        this.value = 1;
        this.production = 0;
    }
    //this method will be used by a building (city, forest, ...) to construct itself
    public void use(int steelUsed) { 
        this.value = this.value - steelUsed; 
    }
    //this method increase the production of this ressource every turn
    public void increaseProduction(int productionIncrease) { 
        this.production += productionIncrease;
    }

    public int getValue(){
        return this.value;
    }
}