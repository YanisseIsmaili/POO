package com.ynov.oop.building;

import com.ynov.oop.ressource.Cost;
import com.ynov.oop.ressource.ResourceStockpile;

public class Mine extends Building{

    public Mine(){
        super("mine simulator");
    }
    public static Cost constructionCost = new Cost(0,1,0);

    //add 1 steel in the total of steel every turn
    public void effect(ResourceStockpile resourceStockpile){
        resourceStockpile.getSteel().increaseProduction(1);
    }
}