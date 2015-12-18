/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.control;

import GrandQuest.GrandQuest;
import byui.cit260.grandQuest.model.Map;
import byui.cit260.grandQuest.model.Scene;
import citbyui.cit260.grandQuest.exceptions.MapControlException;
import java.awt.Point;

/**
 *
 * @author devin_000
 */

public class MapControl {
        
    static Map createMap() {
        // create the map
        Map map = new Map(10, 10);
        
        // create the list of the different scenes in the game
        Scene[] scenes = Scene.createScenes();
        
        // assign the diffeent scenes to locations in the map
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }

    public static void moveActorsToStartingLocation(Character character, Point coordinates) {
           
        
       int newRow = coordinates.x-1;
       int newColumn = coordinates.y-1;
       
//       if (newRow < 0 || newRow >= map.getNoOfRows()||
//           newColumn < 0 || newColumn >= map.getNoOfColumns()) {
//        throws MapControlException {
           
           }
       }
//    }
//
//    private static class map {
//
//        private static int getNoOfRows() {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        private static int getNoOfColumns() {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        public map() {
//        }
//    }