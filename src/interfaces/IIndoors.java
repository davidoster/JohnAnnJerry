/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import models.Door;
import models.Human;

/**
 *
 * @author George.Pasparakis
 */
public interface IIndoors {
    
    void humanOpensDoor(Human human, Door door);
    
}
