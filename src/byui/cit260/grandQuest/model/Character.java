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
public enum Character implements Serializable {
    
    InnKeeper("He oversees the inn."),
    Merchant("He oversees the marketplace."),
    BarKeep("He oversees the tavern."),
    Prince("He is the son of the king.");
    
    // class instance variables
    private final String description;
    private final String coordinates;
    
    Character(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getdescription() {
        return description;
    }

    public String getcoordinates() {
        return coordinates;
    }
    
    public static InventoryItem[] createInventoryList() {
        
        // created array (list) of inventory items
        InventoryItem[] inventory =
                new InventoryItem[4];
        
        InventoryItem flour = new InventoryItem();
        flour.setDescription("Flour");
        flour.setQuantityInStock(0);
        flour.setRequiredAmount("0");
        inventory[0] = flour;
        
        InventoryItem grain = new InventoryItem();
        grain.setDescription("Grain");
        grain.setQuantityInStock(0);
        grain.setRequiredAmount("0");
        inventory[0] = grain;
        
        InventoryItem silk = new InventoryItem();
        silk.setDescription("Silk");
        silk.setQuantityInStock(0);
        silk.setRequiredAmount("0");
        inventory[0] = silk;
        
        InventoryItem gift = new InventoryItem();
        gift.setDescription("Gift");
        gift.setQuantityInStock(0);
        gift.setRequiredAmount("0");
        inventory[0] = gift;
        
        return inventory;
    }

}
