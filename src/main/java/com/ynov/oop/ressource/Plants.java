package com.ynov.oop.ressource;

import com.ynov.oop.Endturnaction;
import javax.xml.stream.events.EndDocument;

public class Plants implements Endturnaction{
    
    private int value;
    private int production;

    @Override
    public void endTurnAction(){
        this.value += this.production;
    }

    public void use(int plantsuse){
        this.value = this.value - plantsuse ;
    }

    public void increase (int productionIncrease){
        this.production += productionIncrease ;
    }

    public Plants () {
        this.value = 0;
        this.production = 0;
    }

    public int getvalue() {
        return this.value;
    }
}
