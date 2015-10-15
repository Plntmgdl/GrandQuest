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
public class Prince implements Serializable {
    
    //class instance variables
    private String tavernPrinceDescription;
    private String princeRequest;
    private String playerChoice;

    public Prince() {
    }
    
    

    public String getTavernPrinceDescription() {
        return tavernPrinceDescription;
    }

    public void setTavernPrinceDescription(String tavernPrinceDescription) {
        this.tavernPrinceDescription = tavernPrinceDescription;
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
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.tavernPrinceDescription);
        hash = 23 * hash + Objects.hashCode(this.princeRequest);
        hash = 23 * hash + Objects.hashCode(this.playerChoice);
        return hash;
    }

    @Override
    public String toString() {
        return "Prince{" + "tavernPrinceDescription=" + tavernPrinceDescription + ", princeRequest=" + princeRequest + ", playerChoice=" + playerChoice + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prince other = (Prince) obj;
        if (!Objects.equals(this.tavernPrinceDescription, other.tavernPrinceDescription)) {
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
