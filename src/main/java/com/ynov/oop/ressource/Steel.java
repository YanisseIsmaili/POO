package com.ynov.oop.ressource;

import com.ynov.oop.Endturnaction;

public class Steel implements Endturnaction{
    
    private int value;
    private int production;

    @Override
    public void endTurnAction(){
        this.value += this.production;
    }

    public void use(int Steeluse){ //utilise le fer
        this.value = this.value - Steeluse ;
    }

    public void increase (int productionIncrease){ //la production de fer augmente
        this.production += productionIncrease ;
    }


    public Steel (){ // un construteur
        this.value = 1; // determine le nombre de fer par defaut
        this.production = 0; // la production ( les batimen qui produise du fer)
    }

    public int getvalue() {
        return this.value;
    }
}
