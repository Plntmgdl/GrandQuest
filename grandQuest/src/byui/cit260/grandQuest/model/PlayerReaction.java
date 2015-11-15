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
public class PlayerReaction implements Serializable{
    
    private String decision;
    private String playerReaction;
    private String monsterReaction;

    public PlayerReaction() {
    }
    
    

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.decision);
        hash = 41 * hash + Objects.hashCode(this.playerReaction);
        hash = 41 * hash + Objects.hashCode(this.monsterReaction);
        return hash;
    }

    @Override
    public String toString() {
        return "PlayerReaction{" + "decision=" + decision + ", playerReaction=" + playerReaction + ", monsterReaction=" + monsterReaction + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PlayerReaction other = (PlayerReaction) obj;
        if (!Objects.equals(this.decision, other.decision)) {
            return false;
        }
        if (!Objects.equals(this.playerReaction, other.playerReaction)) {
            return false;
        }
        if (!Objects.equals(this.monsterReaction, other.monsterReaction)) {
            return false;
        }
        return true;
    }
    
    
}
