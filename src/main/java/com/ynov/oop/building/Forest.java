package com.ynov.oop.building;

import com.ynov.oop.ressource.Warehouse;
import com.ynov.oop.globalparameter.Planet;
import com.ynov.oop.ressource.Cost;

public class Forest { 

   public static Cost constructionCost = new Cost(0, 3, 0);

   public void effect (Planet p) {
     p.getOxygen().increase(1);
   }

    /* 
     * cout 3 plants
     * gain d'oxygen
     */
}
