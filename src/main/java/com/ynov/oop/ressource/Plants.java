package com.ynov.oop.ressource;

import com.ynov.oop.CheckVictoryCondition;
import com.ynov.oop.EndTurnAction;

public class Plants implements EndTurnAction, CheckVictoryCondition {

    private int value;
    private int production;

    // this is used at the end of each turn to increase the current value of this ressource
    @Override
    public void endTurnAction() {
        this.value = this.value + this.production;
    }
    //condition of win
    @Override
    public boolean checkVictoryCondition() {
        return this.value >= 4;
    }
    //use to format the text, we can use %d for int, %s for string and %f for float
    @Override
    public String toString() {
        return String.format("actual plants =%d | plants production/turn  =+%d ", this.value, this.production );
    }

    //constructor
    public Plants(){
        this.value = 0;
        this.production = 0;
    }
    //this method will be used by a building (city, forest, ...) to construct itself
    public void use(int plantUsed) { 
        this.value = this.value - plantUsed; 
    }
    //this method increase the production of this ressource every turn
    public void increaseProduction(int productionIncrease) { 
        this.production += productionIncrease;
    }

    public int getValue(){
        return this.value;
    }
}