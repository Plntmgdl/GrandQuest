/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.control;

import byui.cit260.grandQuest.model.Map;
import byui.cit260.grandQuest.model.Scene;

/**
 *
 * @author devin_000
 */

public class MapControl {
    
    public static Map createMap() {
        // create the map
        Map map = new Map(20, 20);
        
        // create the list of the different scenes in the game
//        Scene[] scenes = Scene.createScenes();
        
        // assign the diffeent scenes to locations in the map
//        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }

//    static void moveActorsToStartingLocation(Map map) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
}
