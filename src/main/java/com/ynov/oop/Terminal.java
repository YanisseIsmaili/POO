package com.ynov.oop;

import java.util.Scanner;

public class Terminal {

    private Gameloop game;
    private Scanner scanner;

    //constructor
    public Terminal (Gameloop newGame, Scanner scanner) {
        this.game = newGame;
        this.scanner = scanner;
    }
    
    //Main part of the game. each turn, he check the player interaction and execute the end action tour. stay on the loop if the player didn't win
    public void execute() {
        while (game.checkVictoryCondition() == false) {
            this.playerInteraction();
            game.endTurnAction();
        }
        System.out.println("gg you win, you are a crackito :)");

    }
    private void playerInteraction() {
        int actionPlayer = -1;
        do {
            System.out.println(this.game);
            System.out.println("Possible actions:");
            System.out.println("1/ Build a City [1 Steel]");
            System.out.println("2/ Plant a Forest [3 Plants]");
            System.out.println("3/ Build a Greenhouse [2 credits]");
            System.out.println("4/ Create a Mine [1 credits]");
            System.out.println("5/ Build a NuclearPlant [4 steels and 2 credits]");
            System.out.println("6/ Start the next loop");
            actionPlayer = this.scanner.nextInt();
            switch (actionPlayer) {
                case 1:
                    this.game.createBuilding("city");
                    break;
                case 2:
                    this.game.createBuilding("forest");
                    break;
                case 3:
                    this.game.createBuilding("greenhouse");
                    break;
                case 4:
                    this.game.createBuilding("mine");
                    break;
                case 5:
                    this.game.createBuilding("nuclearplant");
                    break;
                case 6:
                    break;
                default:
                System.out.println("This is not an action");
            }
        } while (actionPlayer != 6);
    }
    
}
