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
public class Tavern implements Serializable {
    
    //class instance variables
    private String tavernDescription;
    private String princeRequest;
    private String playerChoice;

    public Tavern() {
    }
    
    

    public String getTavernDescription() {
        return tavernDescription;
    }

    public void setTavernDescription(String tavernDescription) {
        this.tavernDescription = tavernDescription;
    }

    public String getPrinceRequest() {
        return princeRequest;
    }

    public void setPrinceRequest(String princeRequest) {
        this.princeRequest = princeRequest;
    }

    public String getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(String playerChoice) {
        this.playerChoice = playerChoice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.tavernDescription);
        hash = 53 * hash + Objects.hashCode(this.princeRequest);
        hash = 53 * hash + Objects.hashCode(this.playerChoice);
        return hash;
    }

    @Override
    public String toString() {
        return "Tavern{" + "tavernDescription=" + tavernDescription + ", princeRequest=" + princeRequest + ", playerChoice=" + playerChoice + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tavern other = (Tavern) obj;
        if (!Objects.equals(this.tavernDescription, other.tavernDescription)) {
            return false;
        }
        if (!Objects.equals(this.princeRequest, other.princeRequest)) {
            return false;
        }
        if (!Objects.equals(this.playerChoice, other.playerChoice)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
