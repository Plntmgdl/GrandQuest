/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.model;

import GrandQuest.GrandQuest;

/**
 *
 * @author devin_000
 */
class SceneX {
    
    private static SceneX[] createScenes() {
        Game game = GrandQuest.getCurrentGame();
        
        SceneX[] scenes = new SceneX[SceneType.values().length];
                
        SceneX startingScene = new SceneX();
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
        
        SceneX villageScene = new SceneX();
        villageScene.setDescription(
                    "*\n***                                  *"
                    + "\n       Welcome to the Village."
                    + "\n Where would you like to go first? ***");
        villageScene.seetMapSymbol(" VG ");
        villageScene.setBlocked(false);
        villageScene.setTravelTime(240);
        scenes[SceneType.village.ordinal()] = villageScene;
        
         SceneX marketplaceScene = new SceneX();
        marketplaceScene.setDescription(
                    "\nBlah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah");
        marketplaceScene.seetMapSymbol(" MP ");
        marketplaceScene.setBlocked(false);
        marketplaceScene.setTravelTime(240);
        scenes[SceneType.marketplace.ordinal()] = marketplaceScene;
        
        SceneX tavernScene = new SceneX();
        tavernScene.setDescription(
                    "\nBlah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah");
        tavernScene.seetMapSymbol(" FN ");
        tavernScene.setBlocked(false);
        tavernScene.setTravelTime(240);
        scenes[SceneType.finish.ordinal()] = tavernScene;
        
        SceneX innScene = new SceneX();
        innScene.setDescription(
                    "\nBlah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah");
        innScene.seetMapSymbol(" IN ");
        innScene.setBlocked(false);
        innScene.setTravelTime(240);
        scenes[SceneType.inn.ordinal()] = innScene;
        
        SceneX bathtubScene = new SceneX();
        bathtubScene.setDescription(
                    "\nBlah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah");
        bathtubScene.seetMapSymbol(" BT ");
        bathtubScene.setBlocked(false);
        bathtubScene.setTravelTime(240);
        scenes[SceneType.bathtub.ordinal()] = bathtubScene;
        
        SceneX roadScene = new SceneX();
        roadScene.setDescription(
                    "\nBlah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah");
        roadScene.seetMapSymbol(" RD ");
        roadScene.setBlocked(false);
        roadScene.setTravelTime(240);
        scenes[SceneType.road.ordinal()] = roadScene;
        
        SceneX bridgeScene = new SceneX();
        bridgeScene.setDescription(
                    "\nBlah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah");
        bridgeScene.seetMapSymbol(" BG ");
        bridgeScene.setBlocked(false);
        bridgeScene.setTravelTime(240);
        scenes[SceneType.bridge.ordinal()] = bridgeScene;
        
        SceneX forestScene = new SceneX();
        forestScene.setDescription(
                    "\nBlah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah");
        forestScene.seetMapSymbol(" FT ");
        forestScene.setBlocked(false);
        forestScene.setTravelTime(240);
        scenes[SceneType.forest.ordinal()] = forestScene;
        
        SceneX finishScene = new SceneX();
        finishScene.setDescription(
                    "\nBlah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah"
                    + "blah blah blah blah blah blah blah blah blah");
        finishScene.seetMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
         
    }

    private void setDescription(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setMapSymbol(String _st_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setBlocked(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTravelTime(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void seetMapSymbol(String _vg_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTravelTime(double POSITIVE_INFINITY) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
