package com.ynov.oop.building;

import com.ynov.oop.ressource.Cost;
import com.ynov.oop.ressource.ResourceStockpile;

public class City {

    // we can use this one everywhere
    public static Cost constructionCost = new Cost(1,0,0);
    //add 1 credits in the total of credits every turn
    public void effect(ResourceStockpile resourceStockpile){
        resourceStockpile.getCredits().increaseProduction(1);
    }
}