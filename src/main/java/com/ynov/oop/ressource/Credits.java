package com.ynov.oop.ressource;

import com.ynov.oop.CheckVictoryCondition;

public class Credits extends Ressource implements CheckVictoryCondition {


    //condition of win
    @Override
    public boolean checkVictoryCondition() {
        return this.getValue() >= 10;
    }
    //use to format the text, we can use %d for int, %s for string and %f for float
    @Override
    public String toString() {
        return String.format("actual credit =%d | credit production/turn  =+%d ", this.getValue(), this.getProduction() );
    }

     //constructor
     public Credits(){
        super(2,1);
    }
}