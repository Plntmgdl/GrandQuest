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
public class Forest implements Serializable{
    
    private String environment;
    private String playerChoice;
    private String encounterChance;
    private String arriveAtCastle;

    public Forest() {
    }
    
    

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
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
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.environment);
        hash = 23 * hash + Objects.hashCode(this.playerChoice);
        hash = 23 * hash + Objects.hashCode(this.encounterChance);
        hash = 23 * hash + Objects.hashCode(this.arriveAtCastle);
        return hash;
    }

    @Override
    public String toString() {
        return "Forest{" + "environment=" + environment + ", playerChoice=" + playerChoice + ", encounterChance=" + encounterChance + ", arriveAtCastle=" + arriveAtCastle + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Forest other = (Forest) obj;
        if (!Objects.equals(this.environment, other.environment)) {
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
