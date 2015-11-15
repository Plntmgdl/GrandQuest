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
public class Inn implements Serializable {
    
    //class instance variables
    private String innDescription;
    private String playerChoice;
    private String returnToStart;

    public Inn() {
    }
    
    

    public String getInnDescription() {
        return innDescription;
    }

    public void setInnDescription(String innDescription) {
        this.innDescription = innDescription;
    }

    public String getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(String playerChoice) {
        this.playerChoice = playerChoice;
    }

    public String getReturnToStart() {
        return returnToStart;
    }

    public void setReturnToStart(String returnToStart) {
        this.returnToStart = returnToStart;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.innDescription);
        hash = 67 * hash + Objects.hashCode(this.playerChoice);
        hash = 67 * hash + Objects.hashCode(this.returnToStart);
        return hash;
    }

    @Override
    public String toString() {
        return "Inn{" + "innDescription=" + innDescription + ", playerChoice=" + playerChoice + ", returnToStart=" + returnToStart + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inn other = (Inn) obj;
        if (!Objects.equals(this.innDescription, other.innDescription)) {
            return false;
        }
        if (!Objects.equals(this.playerChoice, other.playerChoice)) {
            return false;
        }
        if (!Objects.equals(this.returnToStart, other.returnToStart)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
