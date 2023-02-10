package com.ynov.oop.ressource;

public class Credits {
    private int value;
    private int production;

    public void use(int credituse){
        this.value = this.value - credituse ;
    }

    public void increase (int productionIncrease){
        this.production += productionIncrease ;
    }

    public void produce (){
        this.value = this.value + this.production ;
    }
    public Credits (){
        this.value = 2;
        this.production = 1;
    }
}
