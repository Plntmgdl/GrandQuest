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
public class Wagon implements Serializable {
    
    //class instance variables
    private String wagonDescription;
    private String playerChosenItems;
    private String mathEquationW;
    private String playerSolution;

    public Wagon() {
    }
    
    

    public String getWagonDescription() {
        return wagonDescription;
    }

    public void setWagonDescription(String wagonDescription) {
        this.wagonDescription = wagonDescription;
    }

    public String getPlayerChosenItems() {
        return playerChosenItems;
    }

    public void setPlayerChosenItems(String playerChosenItems) {
        this.playerChosenItems = playerChosenItems;
    }

    public String getMathEquationW() {
        return mathEquationW;
    }

    public void setMathEquationW(String mathEquationW) {
        this.mathEquationW = mathEquationW;
    }

    public String getPlayerSolution() {
        return playerSolution;
    }

    public void setPlayerSolution(String playerSolution) {
        this.playerSolution = playerSolution;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.wagonDescription);
        hash = 97 * hash + Objects.hashCode(this.playerChosenItems);
        hash = 97 * hash + Objects.hashCode(this.mathEquationW);
        hash = 97 * hash + Objects.hashCode(this.playerSolution);
        return hash;
    }

    @Override
    public String toString() {
        return "Wagon{" + "wagonDescription=" + wagonDescription + ", playerChosenItems=" + playerChosenItems + ", mathEquationW=" + mathEquationW + ", playerSolution=" + playerSolution + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Wagon other = (Wagon) obj;
        if (!Objects.equals(this.wagonDescription, other.wagonDescription)) {
            return false;
        }
        if (!Objects.equals(this.playerChosenItems, other.playerChosenItems)) {
            return false;
        }
        if (!Objects.equals(this.mathEquationW, other.mathEquationW)) {
            return false;
        }
        if (!Objects.equals(this.playerSolution, other.playerSolution)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
