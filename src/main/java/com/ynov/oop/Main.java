package com.ynov.oop;

import java.util.Scanner;

import com.ynov.oop.building.Builder;
import com.ynov.oop.globalparameter.Oxygen;
import com.ynov.oop.globalparameter.Planet;
import com.ynov.oop.globalparameter.Temperature;
import com.ynov.oop.ressource.Credits;
import com.ynov.oop.ressource.Plants;
import com.ynov.oop.ressource.Steel;
import com.ynov.oop.ressource.Warehouse;

public class Main {

    public static void main(String[] args) {
        Credits credits = new Credits();
        Plants plants = new Plants();
        Steel steel = new Steel();
        Warehouse warehouse = new Warehouse(credits, plants, steel);

        Oxygen oxygen = new Oxygen();
        Temperature temperature = new Temperature();
        Planet planet = new Planet(temperature, oxygen);

        Builder builder = new Builder();
        Gameloop gameloop = new Gameloop(warehouse, planet, builder);
        Scanner scanner = new Scanner(System.in);
        Terminal terminal = new Terminal(gameloop, scanner);

        terminal.execute();
    }
}