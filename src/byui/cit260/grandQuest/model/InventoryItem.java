/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.model;

/**
 *
 * @author devin_000
 */
class InventoryItem {
    
    public static InventoryItem[] createInventoryList() {
        
        // created array (list) of inventory items
        InventoryItem[] inventory =
                new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem flour = new InventoryItem();
        flour.setDescription("Flour");
        flour.setQuantityInStock(0);
        flour.setRequiredAmount("0");
        inventory[Item.flour.ordinal()] = flour;
        
        InventoryItem grain = new InventoryItem();
        grain.setDescription("Grain");
        grain.setQuantityInStock(0);
        grain.setRequiredAmount("0");
        inventory[Item.grain.ordinal()] = grain;
        
        InventoryItem silk = new InventoryItem();
        silk.setDescription("Silk");
        silk.setQuantityInStock(0);
        silk.setRequiredAmount("0");
        inventory[Item.silk.ordinal()] = silk;
        
        InventoryItem gift = new InventoryItem();
        gift.setDescription("Gift");
        gift.setQuantityInStock(0);
        gift.setRequiredAmount("0");
        inventory[Item.gift.ordinal()] = gift;
        
        return inventory;
    }

    private void setDescription(String flour) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setQuantityInStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setRequiredAmount(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
