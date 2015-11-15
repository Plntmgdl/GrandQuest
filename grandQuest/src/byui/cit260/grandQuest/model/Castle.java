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
public class Castle implements Serializable{
    
    private String castleDescription;
    private String merchantThank;
    private String princeThank;
    private String rewardCertificate;

    public Castle() {
    }
    
    

    public String getCastleDescription() {
        return castleDescription;
    }

    public void setCastleDescription(String castleDescription) {
        this.castleDescription = castleDescription;
    }

    public String getMerchantThank() {
        return merchantThank;
    }

    public void setMerchantThank(String merchantThank) {
        this.merchantThank = merchantThank;
    }

    public String getPrinceThank() {
        return princeThank;
    }

    public void setPrinceThank(String princeThank) {
        this.princeThank = princeThank;
    }

    public String getRewardCertificate() {
        return rewardCertificate;
    }

    public void setRewardCertificate(String rewardCertificate) {
        this.rewardCertificate = rewardCertificate;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.castleDescription);
        hash = 29 * hash + Objects.hashCode(this.merchantThank);
        hash = 29 * hash + Objects.hashCode(this.princeThank);
        hash = 29 * hash + Objects.hashCode(this.rewardCertificate);
        return hash;
    }

    @Override
    public String toString() {
        return "Castle{" + "castleDescription=" + castleDescription + ", merchantThank=" + merchantThank + ", princeThank=" + princeThank + ", rewardCertificate=" + rewardCertificate + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Castle other = (Castle) obj;
        if (!Objects.equals(this.castleDescription, other.castleDescription)) {
            return false;
        }
        if (!Objects.equals(this.merchantThank, other.merchantThank)) {
            return false;
        }
        if (!Objects.equals(this.princeThank, other.princeThank)) {
            return false;
        }
        if (!Objects.equals(this.rewardCertificate, other.rewardCertificate)) {
            return false;
        }
        return true;
    }
    
    
    
}
