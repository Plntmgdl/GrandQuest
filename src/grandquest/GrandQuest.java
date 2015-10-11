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
import byui.cit260.grandQuest.model.Creatures;
import byui.cit260.grandQuest.model.EncounterResults;

import byui.cit260.grandQuest.model.Encounters;
import byui.cit260.grandQuest.model.PlayerReaction;
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
            
       Encounters random = new Encounters ();
       
            random.setRandom("You encounter");
       
            String encountersInfo;
            encountersInfo = random.toString();
            System.out.println(encountersInfo); 
            
       Creatures monsters = new Creatures ();
       
            monsters.setMonsters("this monster is ugly");
       
            String creaturesInfo;
            creaturesInfo = monsters.toString();
            System.out.println(creaturesInfo);
       
        EncounterResults eulogy = new EncounterResults ();
       
            eulogy.setEulogy("You have died");
       
            String encounterResultsInfo;
            encounterResultsInfo = eulogy.toString();
            System.out.println(encounterResultsInfo);
            
       PlayerReaction decision = new PlayerReaction();
       
            decision.setDecision("Are you sure?");
            
            String playerReactionInfo;
            playerReactionInfo = decision.toString();
            System.out.println(playerReactionInfo);
    }
    
}
