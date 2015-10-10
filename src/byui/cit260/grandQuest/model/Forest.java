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
    private double playerChoice;
    private double encounterChance;
    private double arriveAtCastle;

    public Forest() {
    }
    
    

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
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
        hash = 89 * hash + Objects.hashCode(this.environment);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.playerChoice) ^ (Double.doubleToLongBits(this.playerChoice) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.encounterChance) ^ (Double.doubleToLongBits(this.encounterChance) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.arriveAtCastle) ^ (Double.doubleToLongBits(this.arriveAtCastle) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Forest{" + "environmrnt=" + environment + ", playerChoice=" + playerChoice + ", encounterChance=" + encounterChance + ", arriveAtCastle=" + arriveAtCastle + '}';
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
        if (Objects.equals(this.environment, other.environment)) {
        } else {
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
