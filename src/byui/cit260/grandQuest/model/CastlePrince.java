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
public class CastlePrince implements Serializable{
    
    private String princeDescription;
    private String princeWords;

    public CastlePrince() {
    }
    
    

    public String getPrinceDescription() {
        return princeDescription;
    }

    public void setPrinceDescription(String princeDescription) {
        this.princeDescription = princeDescription;
    }

    public String getPrinceWords() {
        return princeWords;
    }

    public void setPrinceWords(String princeWords) {
        this.princeWords = princeWords;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.princeDescription);
        hash = 83 * hash + Objects.hashCode(this.princeWords);
        return hash;
    }

    @Override
    public String toString() {
        return "CastlePrince{" + "princeDescription=" + princeDescription + ", princeWords=" + princeWords + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CastlePrince other = (CastlePrince) obj;
        if (!Objects.equals(this.princeDescription, other.princeDescription)) {
            return false;
        }
        if (!Objects.equals(this.princeWords, other.princeWords)) {
            return false;
        }
        return true;
    }
    
    
}
