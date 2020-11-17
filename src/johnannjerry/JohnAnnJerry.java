/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnannjerry;

import models.House;
import models.Indoors;
import models.Outdoors;

/**
 *
 * @author George.Pasparakis
 */
public class JohnAnnJerry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Indoors in = new Indoors();
//        Outdoors out = new Outdoors();
//        House myHouse = new House(in,out);
        
        House house = new House(); // simple instantiation 
        house.humanOpensDoor(house.getIn().getHuman(), 
                             house.getIn().getWall().getDoor());
        house.humanWalksToTheGarden(house.getIn().getHuman(), house.getOut());
//        Building building = new House(); // polymorphism

        
      
        
        
    }
    
}
