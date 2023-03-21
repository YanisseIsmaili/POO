package com.ynov.oop.ressource;

public class Steel extends Ressource{



    //use to format the text, we can use %d for int, %s for string and %f for float
    @Override
    public String toString() {
        return String.format("actual steels =%d | steel production/turn  =+%d ", this.getValue(), this.getProduction() );
    }

    //constructor
    public Steel(){
        super(1,0);
    }
}