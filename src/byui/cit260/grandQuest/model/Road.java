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
    private String playerChoice;
    private String encounterChance;
    private String arriveAtCastle;

    public Road() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(String playerChoice) {
        this.playerChoice = playerChoice;
    }

    public String getEncounterChance() {
        return encounterChance;
    }

    public void setEncounterChance(String encounterChance) {
        this.encounterChance = encounterChance;
    }

    public String getArriveAtCastle() {
        return arriveAtCastle;
    }

    public void setArriveAtCastle(String arriveAtCastle) {
        this.arriveAtCastle = arriveAtCastle;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.description);
        hash = 41 * hash + Objects.hashCode(this.playerChoice);
        hash = 41 * hash + Objects.hashCode(this.encounterChance);
        hash = 41 * hash + Objects.hashCode(this.arriveAtCastle);
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
        if (!Objects.equals(this.playerChoice, other.playerChoice)) {
            return false;
        }
        if (!Objects.equals(this.encounterChance, other.encounterChance)) {
            return false;
        }
        if (!Objects.equals(this.arriveAtCastle, other.arriveAtCastle)) {
            return false;
        }
        return true;
    }
    
    
}
