package com.ynov.oop.ressource;

public class Steel {
    private int value;
    private int production;

    public void use(int Steeluse){
        this.value = this.value - Steeluse ;
    }

    public void increase (int productionIncrease){
        this.production += productionIncrease ;
    }

    public void produce (){
        this.value = this.value + this.production ;
    }
    
    public Steel (){
        this.value = 1;
    }
}
