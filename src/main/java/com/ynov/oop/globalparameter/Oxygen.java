package com.ynov.oop.globalparameter;

import com.ynov.oop.CheckVictoriCondition;

public class Oxygen implements CheckVictoriCondition{
    private int value;


    @Override
    public boolean isWin(){
        return this.value >= 14;
    }

    public void increase (int increment){
        this.value = this.value + increment ;
    }

    public boolean isMax (){
        return this.value >= 14; 
    }
    
    public Oxygen () {
        this.value = 0;
    }

}

