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
public class EncounterResults implements Serializable{
    
    private String eulogy;
    private double nothing;

    public EncounterResults() {
    }
    
    

    public String getEulogy() {
        return eulogy;
    }

    public void setEulogy(String eulogy) {
        this.eulogy = eulogy;
    }

    public double getNothing() {
        return nothing;
    }

    public void setNothing(double nothing) {
        this.nothing = nothing;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.eulogy);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.nothing) ^ (Double.doubleToLongBits(this.nothing) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "EncounterResults{" + "eulogy=" + eulogy + ", nothing=" + nothing + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EncounterResults other = (EncounterResults) obj;
        if (!Objects.equals(this.eulogy, other.eulogy)) {
            return false;
        }
        if (Double.doubleToLongBits(this.nothing) != Double.doubleToLongBits(other.nothing)) {
            return false;
        }
        return true;
    }

    public void setEncounterResults(String this_monster_is_ugly) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
