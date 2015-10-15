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
public class CastleMerchant implements Serializable {
    
    //class instance variables
    private String castleMerchantDescription;
    private String endingPointMerc;

    public CastleMerchant() {
    }
    
    

    public String getCastleMerchantDescription() {
        return castleMerchantDescription;
    }

    public void setCastleMerchantDescription(String castleMerchantDescription) {
        this.castleMerchantDescription = castleMerchantDescription;
    }

    public String getEndingPointMerc() {
        return endingPointMerc;
    }

    public void setEndingPointMerc(String endingPointMerc) {
        this.endingPointMerc = endingPointMerc;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.castleMerchantDescription);
        hash = 79 * hash + Objects.hashCode(this.endingPointMerc);
        return hash;
    }

    @Override
    public String toString() {
        return "CastleMerchant{" + "castleMerchantDescription=" + castleMerchantDescription + ", endingPointMerc=" + endingPointMerc + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CastleMerchant other = (CastleMerchant) obj;
        if (!Objects.equals(this.castleMerchantDescription, other.castleMerchantDescription)) {
            return false;
        }
        if (!Objects.equals(this.endingPointMerc, other.endingPointMerc)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
