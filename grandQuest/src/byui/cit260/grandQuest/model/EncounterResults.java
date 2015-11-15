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
public class EncounterResults implements Serializable{
    
    private String eulogy;
    private String nothing;

    public EncounterResults() {
    }
    
    

    public String getEulogy() {
        return eulogy;
    }

    public void setEulogy(String eulogy) {
        this.eulogy = eulogy;
    }

    public String getNothing() {
        return nothing;
    }

    public void setNothing(String nothing) {
        this.nothing = nothing;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.eulogy);
        hash = 59 * hash + Objects.hashCode(this.nothing);
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
        if (!Objects.equals(this.nothing, other.nothing)) {
            return false;
        }
        return true;
    }
    
    
}
