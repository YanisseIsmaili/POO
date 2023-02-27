package com.ynov.oop.building;

import com.ynov.oop.ressource.Warehouse;
import com.ynov.oop.ressource.Cost;

public class Greenhouse {

    public static Cost constructionCost = new Cost(2, 0, 0);

    public void effect(Warehouse w) {
        w.getPlants().increase(1);
    }
}
