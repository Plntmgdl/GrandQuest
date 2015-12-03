/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.control;

import GrandQuest.GrandQuest;
import byui.cit260.grandQuest.model.Game;
import byui.cit260.grandQuest.model.Map;
import byui.cit260.grandQuest.model.Player;
import byui.cit260.grandQuest.model.InventoryItem;
import byui.cit260.grandQuest.model.Location;
import byui.cit260.grandQuest.model.Scene;
import byui.cit260.grandQuest.model.SceneType;
import byui.cit260.grandQuest.model.Wagon;


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
        InventoryItem[] inventoryList = InventoryItem.createInventoryList();
        game.setInventory(inventoryList);
        
        Wagon wagon = new Wagon(); //create new wagon
        game.setWagon(wagon); // save wagon in game
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game
        
        // move actors to the starting position in the map
        MapControl.moveActorsToStartingLocation(map);
    }
    
//    public static void startNewGame(){
//        System.out.println("\n*** startNewGame stub function called ***"); 
//    }

//    public static void displayVillageMenuView() {
//        
//    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location [][] locations = map.getLocations();
        locations[2][2].setScene(scenes[SceneType.bathtub.ordinal()]);
        locations[2][2].setVisited(false);
        locations[2][3].setScene(scenes[SceneType.inn.ordinal()]);
        locations[2][3].setVisited(false);
        locations[3][3].setScene(scenes[SceneType.marketplace.ordinal()]);
        locations[3][3].setVisited(false);
        locations[3][2].setScene(scenes[SceneType.tavern.ordinal()]);
        locations[3][2].setVisited(false);
        locations[4][4].setScene(scenes[SceneType.bridge.ordinal()]);
        locations[4][4].setVisited(false);
        locations[5][5].setScene(scenes[SceneType.road.ordinal()]);
        locations[5][5].setVisited(false);
        locations[6][6].setScene(scenes[SceneType.forest.ordinal()]);
        locations[6][6].setVisited(false);
        locations[7][7].setScene(scenes[SceneType.village.ordinal()]);
        locations[7][7].setVisited(false);
        locations[1][1].setScene(scenes[SceneType.start.ordinal()]);
        locations[1][1].setVisited(false);
        locations[8][8].setScene(scenes[SceneType.finish.ordinal()]);
        locations[8][8].setVisited(false);
        
        
    }

        
    
    
    public static InventoryItem[] getSortedInventoryList () {
        System.out.println();
        return null;
    }
    
   
   
    }
