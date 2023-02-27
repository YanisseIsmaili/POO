package com.ynov.oop.globalparameter;

import com.ynov.oop.CheckVictoriCondition;

public class Temperature implements CheckVictoriCondition{
    private int value;
   
    @Override
    public boolean isWin(){
        return this.value <= 8;
    }

    public void increase (int increment){
        this.value = this.value + increment ;
    }

    public boolean isMax(){
        return this.value <= 8;
    }
    
    public Temperature () {
        this.value = -30;
    }
}
