package com.ynov.oop;

import com.ynov.oop.building.Builder;
import com.ynov.oop.globalparameter.Planet;
import com.ynov.oop.ressource.Warehouse;

public class Gameloop implements EndTurnAction, CheckVictoryCondition {

    private Warehouse warehouse;
    private Planet planet;
    private Builder builder;
    //tour nb
    private int currentGeneration;

    //constructor
    public Gameloop(Warehouse warehouse, Planet planet, Builder builder) {
        this.warehouse = warehouse;
        this.planet = planet;
        this.builder = builder;

    }

    @Override
    public boolean checkVictoryCondition() {
        return this.warehouse.checkVictoryCondition() && this.planet.checkVictoryCondition();
    }

    @Override
    public void endTurnAction() {
        warehouse.endTurnAction();
        this.currentGeneration += 1;
    }

    @Override
    public String toString() {
        return String.format("TURN N° %d \nWAREHOUSE \n%s \nPLANET \n%s\n ", this.currentGeneration,this.warehouse,this.planet);
    }

    public void createBuilding(String buildingToBuild) {
        switch (buildingToBuild) {
            case "city":
                this.builder.createCity(warehouse);
                break;
            case "forest":
                this.builder.createForest(warehouse, planet);
                break;
            case "greenhouse":
                this.builder.createGreenhouse(warehouse);
                break;
            case "mine":
                this.builder.createMine(warehouse);
                break;
            case "nuclearplant":
                this.builder.createNuclearPlant(warehouse, planet);
                break;
            default:
                System.out.println("Cannot create this building :(");
        }

    }

}