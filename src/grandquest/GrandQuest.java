/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandquest;

import byui.cit260.grandQuest.model.Player;

import byui.cit260.grandQuest.model.Road;

import byui.cit260.grandQuest.model.Forest;

import byui.cit260.grandQuest.model.Bridge;

import byui.cit260.grandQuest.model.Encounters;
/**
 *
 * @author Jassen
 */
public class GrandQuest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Player playerOne = new Player();
       
            playerOne.setName("Me");
       
            String playerInfo = playerOne.toString();
            System.out.println(playerInfo);
    
       Road description = new Road ();
       
            description.setDescription("long and winding");
       
            String roadInfo = description.toString();
            System.out.println(roadInfo);
       
       Forest environment = new Forest ();
       
            environment.setEnvironment("lots of trees");
       
            String forestInfo;
            forestInfo = environment.toString();
            System.out.println(forestInfo);
       
       Bridge appearance = new Bridge ();
       
            appearance.setAppearance("washed out");
       
            String bridgeInfo;
            bridgeInfo = appearance.toString();
            System.out.println(bridgeInfo);
            
       Encounters monster = new Encounters ();
       
       monster.setMonster("You encounter");
       
       String encountersInfo;
        encountersInfo = monster.toString();
       System.out.println(encountersInfo);     
    }
    
}
