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
public class MarketPlace implements Serializable {
    
    //class instance variables
    private String marketPlaceDescription;
    private String items;

    public MarketPlace() {
    }
    
    

    public String getMarketPlaceDescription() {
        return marketPlaceDescription;
    }

    public void setMarketPlaceDescription(String marketPlaceDescription) {
        this.marketPlaceDescription = marketPlaceDescription;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.marketPlaceDescription);
        hash = 29 * hash + Objects.hashCode(this.items);
        return hash;
    }

    @Override
    public String toString() {
        return "MarketPlace{" + "marketPlaceDescription=" + marketPlaceDescription + ", items=" + items + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MarketPlace other = (MarketPlace) obj;
        if (!Objects.equals(this.marketPlaceDescription, other.marketPlaceDescription)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
