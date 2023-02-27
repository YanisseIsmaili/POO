package com.ynov.oop.building;

import com.ynov.oop.globalparameter.Planet;
import com.ynov.oop.ressource.Warehouse;
import com.ynov.oop.ressource.Cost;

public class Nuclearplant {

    public static Cost constructionCost = new Cost(4, 0, 2);

    public void effect(Planet p){
        p.getTemperature().increase(2);
    }
}
