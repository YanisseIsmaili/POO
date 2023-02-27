package com.ynov.oop.building;

import com.ynov.oop.globalparameter.Planet;
import com.ynov.oop.ressource.Warehouse;
import com.ynov.oop.ressource.Cost;

public class Buildeur {
// 2.si cost et inferieur au resource de Warehouse alors un Build sinon on ne build pas 
/*
!=  |   ==
<   |   >=
>   |   <=
||  |   &&

!(a<b || c<*d || e<f)
a>=b && c>=d && e<=f
*/
    public boolean canBuild(Warehouse w, Cost c){ 
        return (
            w.getCredits().getvalue() >= c.credits
            && w.getPlants().getvalue() >= c.plants
            && w.getSteel().getvalue() >= c.steel
            );
    }

    private void useConstructionCost(Warehouse w,Cost c){
        w.getCredits().use(c.credits);
        w.getPlants().use(c.plants);
        w.getSteel().use(c.steel);
    }

    public City createCity(Warehouse w) {

        if(this.canBuild(w, City.constructionCost)){
            this.useConstructionCost(w, City.constructionCost);
            City newCity = new City();
            newCity.effect(w);
        }
        return null;
    }

    public Forest createForest(Warehouse w, Planet p) {

        if(this.canBuild(w, Forest.constructionCost)){
            this.useConstructionCost(w, Forest.constructionCost);
            Forest newForest = new Forest();
            newForest.effect(p);
        }
        return null;
    }

    public Greenhouse createGreenhouse(Warehouse w){

        if(this.canBuild(w, Greenhouse.constructionCost)){
            this.useConstructionCost(w, Greenhouse.constructionCost);
            Greenhouse newGreenhouse = new Greenhouse();
            newGreenhouse.effect(w);
        }
        return null;
    }

    public Mine createMine(Warehouse w){

        if(this.canBuild(w, Mine.constructionCost)){
            this.useConstructionCost(w, Mine.constructionCost);
            Mine newMine = new Mine();
            newMine.effect(w);
        }
        return null;
    }

    public Nuclearplant createNuclearplant(Warehouse w, Planet p){

        if(this.canBuild(w, Nuclearplant.constructionCost)){
            this.useConstructionCost(w, Nuclearplant.constructionCost);
            Nuclearplant newNuclearplant = new Nuclearplant();
            newNuclearplant.effect(p);
        }
        return null;
    }
}
