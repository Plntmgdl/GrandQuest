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
public class Bridge implements Serializable{
    
    private String appearance;
    private String mathEquationB;
    private String ropeLength;
    private String ropeStrength;
    private String playerSolution;

    public Bridge() {
    }
    
    

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getMathEquationB() {
        return mathEquationB;
    }

    public void setMathEquationB(String mathEquationB) {
        this.mathEquationB = mathEquationB;
    }

    public String getRopeLength() {
        return ropeLength;
    }

    public void setRopeLength(String ropeLength) {
        this.ropeLength = ropeLength;
    }

    public String getRopeStrength() {
        return ropeStrength;
    }

    public void setRopeStrength(String ropeStrength) {
        this.ropeStrength = ropeStrength;
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
        hash = 31 * hash + Objects.hashCode(this.appearance);
        hash = 31 * hash + Objects.hashCode(this.mathEquationB);
        hash = 31 * hash + Objects.hashCode(this.ropeLength);
        hash = 31 * hash + Objects.hashCode(this.ropeStrength);
        hash = 31 * hash + Objects.hashCode(this.playerSolution);
        return hash;
    }

    @Override
    public String toString() {
        return "Bridge{" + "appearance=" + appearance + ", mathEquationB=" + mathEquationB + ", ropeLength=" + ropeLength + ", ropeStrength=" + ropeStrength + ", playerSolution=" + playerSolution + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bridge other = (Bridge) obj;
        if (!Objects.equals(this.appearance, other.appearance)) {
            return false;
        }
        if (!Objects.equals(this.mathEquationB, other.mathEquationB)) {
            return false;
        }
        if (!Objects.equals(this.ropeLength, other.ropeLength)) {
            return false;
        }
        if (!Objects.equals(this.ropeStrength, other.ropeStrength)) {
            return false;
        }
        if (!Objects.equals(this.playerSolution, other.playerSolution)) {
            return false;
        }
        return true;
    }
    
    
}
