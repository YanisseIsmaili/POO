package com.ynov.oop.ressource;

import com.ynov.oop.EndTurnAction;

public class Ressource implements EndTurnAction{

    private int value;
    private int production;

    protected Ressource(int value, int production){
        this.value = value;
        this.production = production;
    }

    @Override
    public void endTurnAction() {
        this.value = this.value + this.production;
    }

    public void use(int ressourceUsed) { 
        this.value = this.value - ressourceUsed; 
    }

    public void increaseProduction(int productionIncrease) { 
        this.production += productionIncrease;
    }
    
    public int getValue(){
        return this.value;
    }

    public int getProduction(){
        return this.production;
    }

}
