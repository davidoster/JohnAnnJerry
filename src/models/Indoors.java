/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.IIndoors;

/**
 *
 * @author George.Pasparakis
 */
public class Indoors implements IIndoors{
    private Wall wall = new Wall();
    private Human human;
    
    public Indoors() {
        System.out.println("This is Indoors!");
//        wall = new Wall();
    }
    
    public Indoors(Human human) {
        this();
        this.human = human;
    }

    @Override
    public void humanOpensDoor(Human human, Door door) {
        human.openDoor(door);
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
    
    
}
