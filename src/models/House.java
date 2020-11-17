/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.IIndoors;
import java.util.List;

/**
 *
 * @author George.Pasparakis
 */
public class House extends Building implements IIndoors {
    private Human human;
    private List<Animal> animals;
    
    public House() {
        System.out.println("This is the house");
        human = new Human("John");
        this.setIn(new Indoors(human));
        this.setOut(new Outdoors());
    }
    
    public House(Indoors in, Outdoors out) {
        System.out.println("This is the house");
        this.setIn(in);
        this.setOut(out);
    }

    @Override
    public void humanOpensDoor(Human human, Door door) {
       human.openDoor(door);
    }
    
    public void humanWalksToTheGarden(Human human, Outdoors out) {
        out.human = human;
        getIn().setHuman(null);
        System.out.println("Human " + this.getOut().human.getName() + " walks to " + this.getOut().getName());
    }
    
}
