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
public class Building {
    private Indoors in; // agrregate object - aggregation
    private Outdoors out; // agrregate object - aggregation
    
 
    
    public Building() {
        System.out.println("This is the building");
      
    }

    public Indoors getIn() {
        return in;
    }

    public void setIn(Indoors in) {
        this.in = in;
    }

    public Outdoors getOut() {
        return out;
    }

    public void setOut(Outdoors out) {
        this.out = out;
    }
}
