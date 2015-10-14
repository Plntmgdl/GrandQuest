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
public class Merchant implements Serializable {
    
    //class instance variables
    private String merchantDescription;
    private String merchantRequest;
    private String playerChoice;

    public Merchant() {
    }
    
    

    public String getMerchantDescription() {
        return merchantDescription;
    }

    public void setMerchantDescription(String merchantDescription) {
        this.merchantDescription = merchantDescription;
    }

    public String getMerchantRequest() {
        return merchantRequest;
    }

    public void setMerchantRequest(String merchantRequest) {
        this.merchantRequest = merchantRequest;
    }

    public String getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(String playerChoice) {
        this.playerChoice = playerChoice;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.merchantDescription);
        hash = 67 * hash + Objects.hashCode(this.merchantRequest);
        hash = 67 * hash + Objects.hashCode(this.playerChoice);
        return hash;
    }

    @Override
    public String toString() {
        return "Merchant{" + "merchantDescription=" + merchantDescription + ", merchantRequest=" + merchantRequest + ", playerChoice=" + playerChoice + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Merchant other = (Merchant) obj;
        if (!Objects.equals(this.merchantDescription, other.merchantDescription)) {
            return false;
        }
        if (!Objects.equals(this.merchantRequest, other.merchantRequest)) {
            return false;
        }
        if (!Objects.equals(this.playerChoice, other.playerChoice)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
