package com.ynov.oop.ressource;

public class Plants {
    private int value;
    private int production;

    public void use(int plantsuse){
        this.value = this.value - plantsuse ;
    }

    public void increase (int productionIncrease){
        this.production += productionIncrease ;
    }

    public void produce (){
        this.value = this.value + this.production ;
    }
    public Plants () {
        this.value = 0;
    }
}
