/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.control;

import GrandQuest.GrandQuest;
import byui.cit260.grandQuest.model.Player;

/**
 *
 * @author Jassen
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        
        if (name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        GrandQuest.setPlayer(player); // save the player
        
        return player;
     
    }
    
}
