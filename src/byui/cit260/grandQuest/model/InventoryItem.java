/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.model;

import java.io.Serializable;

/**
 *
 * @author devin_000
 */
public class InventoryItem implements Serializable{
    
    static int NUMBER_OF_INVENTORY_ITEMS = 4;
    private String description;
    private int quantityInStock;
    private int requiredAmount;
    public static InventoryItem[] createInventoryList() {
        
        // created array (list) of inventory items
        InventoryItem[] inventory =
                new InventoryItem[NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem flour = new InventoryItem();
        flour.setDescription("Flour");
        flour.setQuantityInStock(0);
        flour.setRequiredAmount(0);
        inventory[Item.flour.ordinal()] = flour;
        
        InventoryItem grain = new InventoryItem();
        grain.setDescription("Grain");
        grain.setQuantityInStock(0);
        grain.setRequiredAmount(0);
        inventory[Item.grain.ordinal()] = grain;
        
        InventoryItem silk = new InventoryItem();
        silk.setDescription("Silk");
        silk.setQuantityInStock(0);
        silk.setRequiredAmount(0);
        inventory[Item.silk.ordinal()] = silk;
        
        InventoryItem gift = new InventoryItem();
        gift.setDescription("Gift");
        gift.setQuantityInStock(0);
        gift.setRequiredAmount(0);
        inventory[Item.gift.ordinal()] = gift;
        
        return inventory;
    }

    private void setDescription(String desc) {
        description=desc;
    }

    private void setQuantityInStock(int i) {
        quantityInStock=i;
    }

    private void setRequiredAmount(int i) {
        requiredAmount=i;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.NUMBER_OF_INVENTORY_ITEMS;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryItem other = (InventoryItem) obj;
        if (this.NUMBER_OF_INVENTORY_ITEMS != other.NUMBER_OF_INVENTORY_ITEMS) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "NUMBER_OF_INVENTORY_ITEMS=" + NUMBER_OF_INVENTORY_ITEMS + '}';
    }

    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getRequiredAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getQuantityInStock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
