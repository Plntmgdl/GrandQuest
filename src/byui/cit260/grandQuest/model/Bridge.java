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
public class Bridge implements Serializable{
    
    private String appearance;
    private double mathEquationB;
    private double ropeLength;
    private double ropeStrength;
    private double playerSolution;

    public Bridge() {
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public double getMathEquationB() {
        return mathEquationB;
    }

    public void setMathEquationB(double mathEquationB) {
        this.mathEquationB = mathEquationB;
    }

    public double getRopeLength() {
        return ropeLength;
    }

    public void setRopeLength(double ropeLength) {
        this.ropeLength = ropeLength;
    }

    public double getRopeStrength() {
        return ropeStrength;
    }

    public void setRopeStrength(double ropeStrength) {
        this.ropeStrength = ropeStrength;
    }

    public double getPlayerSolution() {
        return playerSolution;
    }

    public void setPlayerSolution(double playerSolution) {
        this.playerSolution = playerSolution;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.appearance);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.mathEquationB) ^ (Double.doubleToLongBits(this.mathEquationB) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.ropeLength) ^ (Double.doubleToLongBits(this.ropeLength) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.ropeStrength) ^ (Double.doubleToLongBits(this.ropeStrength) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.playerSolution) ^ (Double.doubleToLongBits(this.playerSolution) >>> 32));
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
        if (Double.doubleToLongBits(this.mathEquationB) != Double.doubleToLongBits(other.mathEquationB)) {
            return false;
        }
        if (Double.doubleToLongBits(this.ropeLength) != Double.doubleToLongBits(other.ropeLength)) {
            return false;
        }
        if (Double.doubleToLongBits(this.ropeStrength) != Double.doubleToLongBits(other.ropeStrength)) {
            return false;
        }
        if (Double.doubleToLongBits(this.playerSolution) != Double.doubleToLongBits(other.playerSolution)) {
            return false;
        }
        return true;
    }
    
    
    
}
