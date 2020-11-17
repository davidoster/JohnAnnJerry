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
public class Indoors {
    Wall wall; // = new Wall();
    Human human;
    
    public Indoors() {
        System.out.println("This is Indoors!");
        wall = new Wall();
    }
    
    public Indoors(Human human) {
        this();
        this.human = human;
    }
}
