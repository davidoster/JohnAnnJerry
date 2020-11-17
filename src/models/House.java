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
public class House extends Building {
    
    public House() {
        System.out.println("This is the house");
        this.setIn(new Indoors(new Human("John")));
        this.setOut(new Outdoors());
    }
    
    public House(Indoors in, Outdoors out) {
        System.out.println("This is the house");
        this.setIn(in);
        this.setOut(out);
    }
    
}
