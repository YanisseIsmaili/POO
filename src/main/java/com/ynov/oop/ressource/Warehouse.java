package com.ynov.oop.ressource;

import com.ynov.oop.CheckVictoryCondition;
import com.ynov.oop.EndTurnAction;

public class Warehouse implements EndTurnAction, CheckVictoryCondition, ResourceStockpile {

    private Credits credits;
    private Plants plants;
    private Steel steel;

    //constructor
    public Warehouse(Credits c,Plants p,Steel s) {
        this.credits = c;
        this.plants = p;
        this.steel = s;
    }
    //at the end of the turn, the warehouse will produce for each of it(s ressource)
    @Override
    public void endTurnAction() {
        this.credits.endTurnAction();
        this.plants.endTurnAction();
        this.steel.endTurnAction();
    }
    //condition of win the game
    @Override
    public boolean checkVictoryCondition() {
        return this.credits.checkVictoryCondition() && this.plants.checkVictoryCondition();
    }
    //getter of credits
    @Override
    public Credits getCredits(){
        return this.credits;
    }
    //getter of plants
    @Override
    public Plants getPlants(){
        return this.plants;
    }
    //getter of steel
    @Override
    public Steel getSteel(){
        return this.steel;
    }
    //use to format the text, we can use %d for int, %s for string and %f for float
    @Override
    public String toString() {
        return String.format("%s\n%s\n%s", this.credits,this.plants,this.steel );
    }
}