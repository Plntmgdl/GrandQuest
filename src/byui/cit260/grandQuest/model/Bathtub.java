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
public class Bathtub implements Serializable {
    
    //class instance variables
    private String bathtubDescription;
    private String mathEquationT;
    private String playerSolution;

    public Bathtub() {
    }
    
    

    public String getBathtubDescription() {
        return bathtubDescription;
    }

    public void setBathtubDescription(String bathtubDescription) {
        this.bathtubDescription = bathtubDescription;
    }

    public String getMathEquationT() {
        return mathEquationT;
    }

    public void setMathEquationT(String mathEquationT) {
        this.mathEquationT = mathEquationT;
    }

    public String getPlayerSolution() {
        return playerSolution;
    }

    public void setPlayerSolution(String playerSolution) {
        this.playerSolution = playerSolution;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.bathtubDescription);
        hash = 79 * hash + Objects.hashCode(this.mathEquationT);
        return hash;
    }

    @Override
    public String toString() {
        return "Bathtub{" + "bathtubDescription=" + bathtubDescription + ", mathEquationT=" + mathEquationT + ", playerSolution=" + playerSolution + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bathtub other = (Bathtub) obj;
        if (!Objects.equals(this.bathtubDescription, other.bathtubDescription)) {
            return false;
        }
        if (!Objects.equals(this.mathEquationT, other.mathEquationT)) {
            return false;
        }
        if (!Objects.equals(this.playerSolution, other.playerSolution)) {
            return false;
        }
        return true;
    }
    
    
    
}
