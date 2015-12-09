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
                + "\nV - Display Map"
                + "\nI - View Inventory"
                + "\nC - View Characters"
                + "\nW - View Wagon Status"
                + "\nM - Return to main menu"
                + "\n--------------------------------------");
    }
    
    
   
 
    public boolean doAction(char selection) {
        
        switch (selection) {
            case 'V': // Travel to new location
                this.displayMap();
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
            case 'M':
                return true;
            default:
                System.out.println("Invalid selection");
                break;
            // ...
        }
        return false;
    }
    
    // BroJones Begin
    private void displayMap() {
        Map map = GrandQuest.GrandQuest.getGame().getMap();
    
        Location [][] locations = map.getLocations();
        
        for(int x = 0; x < map.getRowCount(); x++){
            for(int y = 0; y < map.getColumnCount(); y++)
            {
                if (locations[x][y].getScene().getMapSymbol()=="")
                    System.out.print("|    ");
                else 
                    System.out.print("| "+locations[x][y].getScene().getMapSymbol()+" ");
            }
            System.out.println("|");
        }
           
    }
    
    private void viewCharacters(){
        
    }
    
    private void viewWagonStatus(){
        
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

    @Override
    public boolean doAction(Object obj) {
        String value=(String)obj;
        value=value.toUpperCase();
        char selection=value.charAt(0);
        
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
            case 'E': // Exit to previous Menu
                return true;
        }
        return false;

   
    }

//    @Override
//    public void displayMenu() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
