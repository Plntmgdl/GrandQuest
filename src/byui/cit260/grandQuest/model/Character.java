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
 * @author devin_000
 */
public enum Character implements Serializable {
    
    InnKeeper("He oversees the inn."),
    Merchant("He oversees the marketplace."),
    BarKeep("He oversees the tavern."),
    Prince("He is the son of the king.");
    
    // class instance variables
    private final String description;
    private final String coordinates;
    
    Character(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getdescription() {
        return description;
    }

    public String getcoordinates() {
        return coordinates;
    }
}
