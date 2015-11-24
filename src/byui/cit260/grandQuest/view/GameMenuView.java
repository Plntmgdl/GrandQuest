/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

import GrandQuest.GrandQuest;
import byui.cit260.grandQuest.control.GameControl;

/**
 *
 * @author devin_000
 */
public abstract class GameMenuView extends View{

    public GameMenuView(String promptMessage) {
        super(promptMessage);
    }

    
    
   
      
  public void newGame(){

    //Display the banner screen
    this.displayIntro(); 

    this.displayVillageMenu();
    }
    
      
        
  
    public void displayIntro() {   
        System.out.println("\n*** As the morning sun slowly "
                + "\n        crests the mountain tops it illuminates "
                + "\n       the small valley lying below. You are "
                + "\n        struck with a sense of… As you come "
                + "\n        closer to the settlement you spy the "
                + "\n        Tavern, the Inn, and the Market Place. ***");
        
        System.out.println("*\n***                                  *"
                + "\n       Welcome to the Village."
                + "\n Where would you like to go first? ***");
        
    }
    
    public void displayVillageMenu() {
         //Display the village menu 
    VillageMenuView villageMenu = new VillageMenuView();
    villageMenu.displayVillageMenu();

   
       
 }
    
    public void doAction(char selection) {
        
        switch (selection) {
            case 'V': // Travel to new location
                this.displayMap();
                break;
            case 'I': // View list of items in inventory
                this.viewInventory();
                break;
            case 'C': // View list of actors
                this.viewCharacters();
                break;
            case 'W': // View the wagon's status
                this.viewWagonStatus();
                break;
            // ...
        }
    }
    // BroJones Begin
    private void displayMap() {
    
    }
    
    private void viewCharacters(){
        
    }
    
    private void viewWagonStatus(){
        
    }
    // BroJones END

    private void viewInventory() {
        // get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        Sytsem.out.println("Description" + "\t" +
                           "Required" + "\t" +
                           "In Stock");
        
        // for each inventory item
        for (InventoryItem inventoryItem : inventory) {
            // DISPLAY the description, the required amount and amount in stock
            System.out.println(inventoryItem.getDescription() + "\t    " +
                               inventoryItem.getRequiredAmount() + "\t   " +
                               inventoryItem.getQuantityInStock());
        }
    }
    
    public static InventoryItem[] getSortedInventoryList() {
        
        // get inventory list for teh current game
        InventoryItem[] originalInventoryList =
                GrandQuest.getCurrentGame().getInventory();
        
        // clone (make a copy) originalList
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        // using a BubbleSort to sort the list of inventoryList by name
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++) {
                if (inventoryList[j].getDescription().
                        compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList [j + 1];
                    inventoryList[j + 1] = tempInventoryItem;
                }
            }
        }
        return inventoryList;
    }
}