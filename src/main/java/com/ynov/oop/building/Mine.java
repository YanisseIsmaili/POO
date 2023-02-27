package com.ynov.oop.building;

import com.ynov.oop.ressource.Warehouse;
import com.ynov.oop.ressource.Cost;

public class Mine {
    
    public static Cost constructionCost = new Cost(1, 0, 0);

    public void effect(Warehouse w){
        w.getSteel().increase(1);
    }
}
