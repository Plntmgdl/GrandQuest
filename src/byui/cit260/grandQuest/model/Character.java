/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author devin_000
 */
public enum Character implements Serializable {
    
    InnKeeper("He oversees the inn."),
    Merchant("He works for the king."),
    BarKeep("He oversees the tavern."),
    Prince("He is the son of the king.");
    
    
    private final String description;
    private final Point coordinates;
    
    Character(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getdescription() {
        return description;
    }

    public Point getcoordinates() {
        return coordinates;
    }
}
