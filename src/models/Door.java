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
public class Door extends Naming{
    
    public Door() {
        System.out.println("This is the Door");
    }
    
    public Door(String name) {
        this.setName(name);
        System.out.println("This is the door " + this.getName());
    }
    
}
