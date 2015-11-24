/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.control;

import byui.cit260.grandQuest.model.Map;
import byui.cit260.grandQuest.model.Player;
import byui.cit260.grandQuest.model.;


/**
 *
 * @author devin_000
 */
public class GameControl {
    
    InventoryItem[] inventoryList;
    
    public static void createNewGame(Player player) {
        
        Game game = new Game(); // creat new game
        GrandQuest.setCurrentGame(game); // save in GrandQuest
        
        game.setPlayer(player); // save player in game
        
        // create the inventory list adn save in the game
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Wagon wagon = new Wagon(); //create new wagon
        game.setWagon(wagon); // save wagon in game
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game
        
        // move actors to the starting position in the map
        MapControl.moveActorsToStartingLocation(map);
    }
    
    public static void startNewGame(){
        System.out.println("\n*** startNewGame stub function called ***"); 
    }
    
    public static InventoryItem[] createInventoryList() {
        System.out.println("*** called createInventoryList() in GameControl ***");
    }

    public static void displayVillageMenuView() {
        
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    }