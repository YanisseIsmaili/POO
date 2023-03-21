package com.ynov.oop.building;

import com.ynov.oop.globalparameter.HaveGlobalParameter;
import com.ynov.oop.ressource.Cost;
import com.ynov.oop.ressource.ResourceStockpile;

public class Builder {

    //verification of the quantity of resource of the warehouse
    public boolean canBuild(ResourceStockpile resourceStockpile, Cost constructionCost){
        return resourceStockpile.getCredits().getValue() >= constructionCost.credits
                && resourceStockpile.getPlants().getValue() >= constructionCost.plants
                && resourceStockpile.getSteel().getValue() >= constructionCost.steel
        ;
    }
    //method to use the ressources
    private void useConstructionCost(ResourceStockpile resourceStockpile, Cost constructionCost) {
        resourceStockpile.getCredits().use(constructionCost.credits);
        resourceStockpile.getPlants().use(constructionCost.plants);
        resourceStockpile.getSteel().use(constructionCost.steel);
    }
    //create a city
    public City createCity(ResourceStockpile resourceStockpile){
        if(this.canBuild(resourceStockpile, City.constructionCost)) { 
        this.useConstructionCost(resourceStockpile, City.constructionCost);
        City newCity = new City();
        newCity.effect(resourceStockpile);
        return newCity;
        }
    return null;
    }


    //create a forest
    public Forest createForest(ResourceStockpile resourceStockpile, HaveGlobalParameter haveGlobalParameter){
        if(this.canBuild(resourceStockpile, Forest.constructionCost)) { 
        this.useConstructionCost(resourceStockpile, Forest.constructionCost);
        Forest newForest = new Forest();
        newForest.effect(haveGlobalParameter);
        return newForest;
        }
        return null;
    }
    //create a greenhouse
    public Greenhouse createGreenhouse(ResourceStockpile resourceStockpile){
        if(this.canBuild(resourceStockpile, Greenhouse.constructionCost)) { 
        this.useConstructionCost(resourceStockpile, Greenhouse.constructionCost);
        Greenhouse newGreenhouse = new Greenhouse();
        newGreenhouse.effect(resourceStockpile);
        return newGreenhouse;
        }
        return null;
    }
    //create a mine
    public Mine createMine(ResourceStockpile resourceStockpile){
        if(this.canBuild(resourceStockpile, Mine.constructionCost)) {
        this.useConstructionCost(resourceStockpile, Mine.constructionCost);
        Mine newMine = new Mine();
        newMine.effect(resourceStockpile);
        return newMine;
        }
        return null;
    }
    //create a NuclearPlant
    public NuclearPlant createNuclearPlant(ResourceStockpile resourceStockpile, HaveGlobalParameter haveGlobalParameter){
        if(this.canBuild(resourceStockpile, NuclearPlant.constructionCost)) {
        this.useConstructionCost(resourceStockpile, NuclearPlant.constructionCost);
        NuclearPlant newNuclearPlant = new NuclearPlant();
        newNuclearPlant.effect(haveGlobalParameter);
        return newNuclearPlant;
        }
        return null;
    }
}