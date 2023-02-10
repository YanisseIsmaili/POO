package com.ynov.oop.ressource;

public class Steel {
    private int value;
    private int production;

    public void use(int Steeluse){ //utilise le fer
        this.value = this.value - Steeluse ;
    }

    public void increase (int productionIncrease){ //la production de fer augmente
        this.production += productionIncrease ;
    }

    public void produce (){ // et la production par vageu de fer
        this.value = this.value + this.production ;
    }

    public Steel (){ // un construteur
        this.value = 1; // determine le nombre de fer par defaut
        this.production = 0; // la production ( les batimen qui produise du fer)
    }
}
