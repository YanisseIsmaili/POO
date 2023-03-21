package com.ynov.oop.building;

import com.ynov.oop.ressource.Cost;
import com.ynov.oop.ressource.ResourceStockpile;

public class Greenhouse extends Building{

    public Greenhouse(){
        super("tous verre");
    }

    public static Cost constructionCost = new Cost(0,2,0);

    //add 1 plants in the total of plants every turn
    public void effect(ResourceStockpile resourceStockpile){
        resourceStockpile.getPlants().increaseProduction(1);
    }
}