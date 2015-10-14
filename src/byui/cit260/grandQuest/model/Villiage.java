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
public class Villiage implements Serializable {
    
    //class instance variables
    private String villageDescription;
    private String startingPoint;

    public Villiage() {
    }
    
    

    public String getDescription() {
        return villageDescription;
    }

    public void setDescription(String description) {
        this.villageDescription = description;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.villageDescription);
        hash = 11 * hash + Objects.hashCode(this.startingPoint);
        return hash;
    }

    @Override
    public String toString() {
        return "Villiage{" + "villageDescription=" + villageDescription + ", startingPoint=" + startingPoint + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Villiage other = (Villiage) obj;
        if (!Objects.equals(this.villageDescription, other.villageDescription)) {
            return false;
        }
        if (!Objects.equals(this.startingPoint, other.startingPoint)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
