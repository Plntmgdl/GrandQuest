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
public class Scene implements Serializable {
    static int SCENE_TYPE_ITEMS = 10;
    private String description;
    private String mapSymbol;
    private Integer travelTime;
    private boolean blocked;

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public Integer getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Integer travelTime) {
        this.travelTime = travelTime;
    }
    
    public static Scene[] createScenes() {
        Scene[] scenes = new Scene[SCENE_TYPE_ITEMS];
                
        Scene startingScene = new Scene();
        startingScene.setDescription(
                    "\n*** As the morning sun slowly "
                    + "\n crests the mountain tops it illuminates "
                    + "\n the small valley lying below. You are "
                    + "\n struck with a sense of… As you come "
                    + "\n closer to the settlement you spy the "
                    + "\n Tavern, the Inn, and the Market Place. ***");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene villageScene = new Scene();
        villageScene.setDescription(
                    "*\n***                                  *"
                    + "\n       Welcome to the Village."
                    + "\n Where would you like to go first? ***");
        villageScene.setMapSymbol(" VG ");
        villageScene.setBlocked(false);
        villageScene.setTravelTime(240);
        scenes[SceneType.village.ordinal()] = villageScene;
        
         Scene marketplaceScene = new Scene();
        marketplaceScene.setDescription(
                    "\nBlah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah");
        marketplaceScene.setMapSymbol(" MP ");
        marketplaceScene.setBlocked(false);
        marketplaceScene.setTravelTime(240);
        scenes[SceneType.marketplace.ordinal()] = marketplaceScene;
        
        Scene tavernScene = new Scene();
        tavernScene.setDescription(
                    "\nBlah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah");
        tavernScene.setMapSymbol(" FN ");
        tavernScene.setBlocked(false);
        tavernScene.setTravelTime(240);
        scenes[SceneType.finish.ordinal()] = tavernScene;
        
        Scene innScene = new Scene();
        innScene.setDescription(
                    "\nBlah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah");
        innScene.setMapSymbol(" IN ");
        innScene.setBlocked(false);
        innScene.setTravelTime(240);
        scenes[SceneType.inn.ordinal()] = innScene;
        
        Scene bathtubScene = new Scene();
        bathtubScene.setDescription(
                    "\nBlah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah");
        bathtubScene.setMapSymbol(" BT ");
        bathtubScene.setBlocked(false);
        bathtubScene.setTravelTime(240);
        scenes[SceneType.bathtub.ordinal()] = bathtubScene;
        
        Scene roadScene = new Scene();
        roadScene.setDescription(
                    "\nBlah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah");
        roadScene.setMapSymbol(" RD ");
        roadScene.setBlocked(false);
        roadScene.setTravelTime(240);
        scenes[SceneType.road.ordinal()] = roadScene;
        
        Scene bridgeScene = new Scene();
        bridgeScene.setDescription(
                    "\nBlah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah");
        bridgeScene.setMapSymbol(" BG ");
        bridgeScene.setBlocked(false);
        bridgeScene.setTravelTime(240);
        scenes[SceneType.bridge.ordinal()] = bridgeScene;
        
        Scene forestScene = new Scene();
        forestScene.setDescription(
                    "\nBlah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah");
        forestScene.setMapSymbol(" FT ");
        forestScene.setBlocked(false);
        forestScene.setTravelTime(240);
        scenes[SceneType.forest.ordinal()] = forestScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                    "\nBlah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(0);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
         
    }
    
//    private void displayAllScenes(){
//        for (Scene thisScene: Scenes)
//    }

    

//    private static class GrandQuest {
//
//        private static Game getCurrentGame() {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        public GrandQuest() {
//        }
//    }
    
    
    
}
