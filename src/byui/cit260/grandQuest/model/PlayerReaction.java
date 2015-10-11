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
public class PlayerReaction implements Serializable{
    
    private String decision;
    private double playerReaction;
    private double monsterReaction;

    public PlayerReaction() {
    }
    
    

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.decision);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.playerReaction) ^ (Double.doubleToLongBits(this.playerReaction) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.monsterReaction) ^ (Double.doubleToLongBits(this.monsterReaction) >>> 32));
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
        if (Double.doubleToLongBits(this.playerReaction) != Double.doubleToLongBits(other.playerReaction)) {
            return false;
        }
        if (Double.doubleToLongBits(this.monsterReaction) != Double.doubleToLongBits(other.monsterReaction)) {
            return false;
        }
        return true;
    }
    
    
    
}
