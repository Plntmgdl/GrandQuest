/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandquest;

import byui.cit260.grandQuest.model.Player;

/**
 *
 * @author devin_000
 */
public class GrandQuest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Bob");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
