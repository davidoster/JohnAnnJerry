/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author George.Pasparakis
 */
public class Wall {
    private Door door;
    public Wall() {
        System.out.println("This is the Wall");
        door = new Door(" to the garden");
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }
    
}
