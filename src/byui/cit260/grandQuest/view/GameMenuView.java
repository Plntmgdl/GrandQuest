/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

import byui.cit260.grandQuest.control.GameControl;
import byui.cit260.grandQuest.model.InventoryItem;
import byui.cit260.grandQuest.model.Location;
import byui.cit260.grandQuest.model.Map;
/**
 *
 * @author devin_000
 */
public class GameMenuView extends View{

    static GameMenuView gameMenu;
    public GameMenuView() {
        super ("\n"
                + "\n--------------------------------------"
                + "\n| Game Menu                          |"
                + "\n--------------------------------------"
                + "\nM - Display Map"
                + "\nP - Print Locations in Map"
                + "\nI - Inventory"
                + "\nC - Characters"
                + "\nW - Wagon Status"
                + "\nE - Return to previous menu"
                + "\n--------------------------------------");
    }
    
    
   @Override
    public boolean doAction(Object obj) {
        String value=(String)obj;
        value=value.toUpperCase();
        char selection=value.charAt(0);
        
        switch (selection) {
            case 'M': // Travel to new location
                this.displayMap();
                break;
            case 'P':
                System.out.println();
                break;
            case 'I': // View list of items in inventory
                GameMenuView.viewInventory();
                break;
            case 'C': // View list of actors
                this.viewCharacters();
                break;
            case 'W': // View the wagon's status
                this.viewWagonStatus();
                break;
            case 'E': // Exit to previous Menu
                return true;
        }
        return false;

   
    }

 
//   
    
    // BroJones Begin
    private void displayMap() {
        Map map = GrandQuest.GrandQuest.getGame().getMap();
           System.out.println("\nThe Land");
            
        Location [][] locations = map.getLocations();
        
        for(int x = 0; x < map.getRowCount(); x++){
            for(int y = 0; y < map.getColumnCount(); y++)
            {
                if ((locations[x][y].getScene()== null)||
                        (locations[x][y].getScene().getMapSymbol()==""))
                   System.out.print("|    ");
                else 
                    System.out.print("| "+locations[x][y].getScene().getMapSymbol()+" ");
            }
            System.out.println("|");
        }
           
    }
    
    
 public static void viewInventory() {
        // get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" +
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

    private void viewCharacters(){
        
    }
    
    private void viewWagonStatus(){
        
    }

}
