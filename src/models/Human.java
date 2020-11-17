/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.IHuman;

/**
 *
 * @author George.Pasparakis
 */
public class Human extends Mammal implements IHuman {

    public Human() {
        System.out.println("This is a human");
    }
    
    public Human(String name) {
        this.setName(name);
        System.out.println("This is human " + this.getName());
    }
    
    @Override
    public void look() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void openDoor(Door door) {
        System.out.println("Human " + this.getName() + " opens the door " + door.getName());
    }
    
}
