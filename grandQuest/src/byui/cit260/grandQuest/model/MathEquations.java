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
public class MathEquations implements Serializable{
    
    private double bathTubEquation;
    private double wagonEquation;
    private double bridgeEquation;

    public MathEquations() {
    }
    
    

    public double getBathTubEquation() {
        return bathTubEquation;
    }

    public void setBathTubEquation(double bathTubEquation) {
        this.bathTubEquation = bathTubEquation;
    }

    public double getWagonEquation() {
        return wagonEquation;
    }

    public void setWagonEquation(double wagonEquation) {
        this.wagonEquation = wagonEquation;
    }

    public double getBridgeEquation() {
        return bridgeEquation;
    }

    public void setBridgeEquation(double bridgeEquation) {
        this.bridgeEquation = bridgeEquation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.bathTubEquation) ^ (Double.doubleToLongBits(this.bathTubEquation) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.wagonEquation) ^ (Double.doubleToLongBits(this.wagonEquation) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.bridgeEquation) ^ (Double.doubleToLongBits(this.bridgeEquation) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "MathEquations{" + "bathTubEquation=" + bathTubEquation + ", wagonEquation=" + wagonEquation + ", bridgeEquation=" + bridgeEquation + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MathEquations other = (MathEquations) obj;
        if (Double.doubleToLongBits(this.bathTubEquation) != Double.doubleToLongBits(other.bathTubEquation)) {
            return false;
        }
        if (Double.doubleToLongBits(this.wagonEquation) != Double.doubleToLongBits(other.wagonEquation)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bridgeEquation) != Double.doubleToLongBits(other.bridgeEquation)) {
            return false;
        }
        return true;
    }
    
}
