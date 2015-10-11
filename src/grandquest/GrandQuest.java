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
import byui.cit260.grandQuest.model.CastlePrince;
import byui.cit260.grandQuest.model.Creatures;
import byui.cit260.grandQuest.model.EncounterResults;

import byui.cit260.grandQuest.model.Encounters;
import byui.cit260.grandQuest.model.MonsterReaction;
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
            
            //Jassen
    
       Road description = new Road();
       
            description.setDescription("long and winding");
            description.setPlayerChoice("you chose this direction");
            description.setEncounterChance("As you continue on your way...");
            description.setArriveAtCastle("As you turn the corner and the trees clear...");
            
            String roadInfo = description.toString();
            System.out.println(roadInfo);
            
            //Jassen
       
       Forest environment = new Forest ();
       
            environment.setEnvironment("lots of trees");
       
            String forestInfo;
            forestInfo = environment.toString();
            System.out.println(forestInfo);
            
            //Jassen
       
       Bridge appearance = new Bridge ();
       
            appearance.setAppearance("washed out");
       
            String bridgeInfo;
            bridgeInfo = appearance.toString();
            System.out.println(bridgeInfo);
            
            //Jassen
            
       Encounters random = new Encounters ();
       
            random.setRandom("You encounter");
       
            String encountersInfo;
            encountersInfo = random.toString();
            System.out.println(encountersInfo); 
            
            //Jassen
            
       Creatures monsters = new Creatures ();
       
            monsters.setMonsters("this monster is ugly");
       
            String creaturesInfo;
            creaturesInfo = monsters.toString();
            System.out.println(creaturesInfo);
            
            //Jassen
       
        EncounterResults eulogy = new EncounterResults ();
       
            eulogy.setEulogy("You have died");
       
            String encounterResultsInfo;
            encounterResultsInfo = eulogy.toString();
            System.out.println(encounterResultsInfo);
            
            //Jassen
            
       PlayerReaction decision = new PlayerReaction();
       
            decision.setDecision("Are you sure?");
            
            String playerReactionInfo;
            playerReactionInfo = decision.toString();
            System.out.println(playerReactionInfo);
            
            //Jassen
            
       MonsterReaction reaction = new MonsterReaction();
       
            reaction.setReaction("The monster does this");
            reaction.setRobber("Give us you goods!");
            reaction.setBoar("Oink!");
            reaction.setSpider("Clicking of the mandibles");
            reaction.setDragn("Time to die!");
            reaction.setMushroom("Poof! You are enveloped in a cloud of poisonous gas");
            String monsterReactionInfo;
            monsterReactionInfo = reaction.toString();
            System.out.println(monsterReactionInfo);
            
            //Jassen
            
       CastlePrince princeDescription = new CastlePrince();
            
            princeDescription.setPrinceDescription("Dreamy");
            princeDescription.setPrinceWords("Thank you");
            String castlePrinceInfo;
            castlePrinceInfo = princeDescription.toString();
            System.out.println(castlePrinceInfo);
            
            //Jassen done
    }
    
}
