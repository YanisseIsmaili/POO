package com.ynov.oop.building;

import com.ynov.oop.ressource.Warehouse;
import com.ynov.oop.ressource.Cost;

public class City {



    public void effect (Warehouse w){
        //this.Warehouse(c) += this.Warehouse(c);
        w.getCredits().increase(1);
    }

    public static Cost constructionCost = new Cost(1, 0, 0);
}
// "static" est un mot cle qui permet de ne pas instancer la
// ore de lobject le cost et associer a la classe et seulmen la classe