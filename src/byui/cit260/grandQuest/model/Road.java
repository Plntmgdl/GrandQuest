/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.model;

import java.util.Objects;

/**
 *
 * @author Jassen
 */
public class Road implements Serializable{
    
    private String description;
    private double playerChoice;
    private double encounterChance;
    private double arriveAtCastle;

    public Road() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(double playerChoice) {
        this.playerChoice = playerChoice;
    }

    public double getEncounterChance() {
        return encounterChance;
    }

    public void setEncounterChance(double encounterChance) {
        this.encounterChance = encounterChance;
    }

    public double getArriveAtCastle() {
        return arriveAtCastle;
    }

    public void setArriveAtCastle(double arriveAtCastle) {
        this.arriveAtCastle = arriveAtCastle;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.playerChoice) ^ (Double.doubleToLongBits(this.playerChoice) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.encounterChance) ^ (Double.doubleToLongBits(this.encounterChance) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.arriveAtCastle) ^ (Double.doubleToLongBits(this.arriveAtCastle) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Road{" + "description=" + description + ", playerChoice=" + playerChoice + ", encounterChance=" + encounterChance + ", arriveAtCastle=" + arriveAtCastle + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Road other = (Road) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.playerChoice) != Double.doubleToLongBits(other.playerChoice)) {
            return false;
        }
        if (Double.doubleToLongBits(this.encounterChance) != Double.doubleToLongBits(other.encounterChance)) {
            return false;
        }
        if (Double.doubleToLongBits(this.arriveAtCastle) != Double.doubleToLongBits(other.arriveAtCastle)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
