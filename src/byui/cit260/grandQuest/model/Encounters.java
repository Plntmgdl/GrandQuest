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
        private String monsterType;
        private String playerReaction;
        private String monsterReaction;
        private String encounterResults;

    public Encounters() {
    }
        
        

    public String getRandom() {
        return random;
    }

    public void setRandom(String random) {
        this.random = random;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }

    public String getPlayerReaction() {
        return playerReaction;
    }

    public void setPlayerReaction(String playerReaction) {
        this.playerReaction = playerReaction;
    }

    public String getMonsterReaction() {
        return monsterReaction;
    }

    public void setMonsterReaction(String monsterReaction) {
        this.monsterReaction = monsterReaction;
    }

    public String getEncounterResults() {
        return encounterResults;
    }

    public void setEncounterResults(String encounterResults) {
        this.encounterResults = encounterResults;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.random);
        hash = 53 * hash + Objects.hashCode(this.monsterType);
        hash = 53 * hash + Objects.hashCode(this.playerReaction);
        hash = 53 * hash + Objects.hashCode(this.monsterReaction);
        hash = 53 * hash + Objects.hashCode(this.encounterResults);
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
        if (!Objects.equals(this.monsterType, other.monsterType)) {
            return false;
        }
        if (!Objects.equals(this.playerReaction, other.playerReaction)) {
            return false;
        }
        if (!Objects.equals(this.monsterReaction, other.monsterReaction)) {
            return false;
        }
        if (!Objects.equals(this.encounterResults, other.encounterResults)) {
            return false;
        }
        return true;
    }
        
        
}
