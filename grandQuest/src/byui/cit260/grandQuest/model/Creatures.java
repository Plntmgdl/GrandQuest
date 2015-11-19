/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jassen
 */
public enum Creatures implements Serializable{
    
    Robbers("Dressed in raggedy clothes weilding knives and glaring in a threatening manner."),
    GiantSpiders(""),
    WildBoars(""),
    PoisonousMushrooms(""),
    Dragon("");
        
    private final String descriptions;
    
    Creatures(String descriptions) {
        this.descriptions = descriptions;
    }
    
    

    public String getDescription() {
        return descriptions;
    }

    
}
