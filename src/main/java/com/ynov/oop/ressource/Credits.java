package com.ynov.oop.ressource;

import com.ynov.oop.Endturnaction;

public class Credits implements Endturnaction{
    private int value;
    private int production;

    @Override
    public void endTurnAction(){
        this.value += this.production;
    }
    public void use(int credituse){
        this.value = this.value - credituse ;
    }

    public void increase (int productionIncrease){
        this.production += productionIncrease ;
    }
    
    public Credits (){
        this.value = 2;
        this.production = 1;
    }

    public int getvalue() {
        return this.value;
    }
}
