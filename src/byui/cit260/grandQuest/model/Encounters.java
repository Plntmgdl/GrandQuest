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
public class Encounters implements Serializable{
    
        private String random;
        private double monsterType;
        private double playerReaction;
        private double monsterReaction;
        private double encounterResults;

    public Encounters() {
    }
        
        

    public String getRandom() {
        return random;
    }

    public void setRandom(String random) {
        this.random = random;
    }

    public double getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(double monsterType) {
        this.monsterType = monsterType;
    }

    public double getPlayerReaction() {
        return playerReaction;
    }

    public void setPlayerReaction(double playerReaction) {
        this.playerReaction = playerReaction;
    }

    public double getMonsterReaction() {
        return monsterReaction;
    }

    public void setMonsterReaction(double monsterReaction) {
        this.monsterReaction = monsterReaction;
    }

    public double getEncounterResults() {
        return encounterResults;
    }

    public void setEncounterResults(double encounterResults) {
        this.encounterResults = encounterResults;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.random);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.monsterType) ^ (Double.doubleToLongBits(this.monsterType) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.playerReaction) ^ (Double.doubleToLongBits(this.playerReaction) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.monsterReaction) ^ (Double.doubleToLongBits(this.monsterReaction) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.encounterResults) ^ (Double.doubleToLongBits(this.encounterResults) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Encounters{" + "random=" + random + ", monsterType=" + monsterType + ", playerReaction=" + playerReaction + ", monsterReaction=" + monsterReaction + ", encounterResults=" + encounterResults + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Encounters other = (Encounters) obj;
        if (!Objects.equals(this.random, other.random)) {
            return false;
        }
        if (Double.doubleToLongBits(this.monsterType) != Double.doubleToLongBits(other.monsterType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.playerReaction) != Double.doubleToLongBits(other.playerReaction)) {
            return false;
        }
        if (Double.doubleToLongBits(this.monsterReaction) != Double.doubleToLongBits(other.monsterReaction)) {
            return false;
        }
        if (Double.doubleToLongBits(this.encounterResults) != Double.doubleToLongBits(other.encounterResults)) {
            return false;
        }
        return true;
    }
        
        
    
}
