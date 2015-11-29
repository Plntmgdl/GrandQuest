/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrandQuest;

import byui.cit260.grandQuest.model.Player;

import byui.cit260.grandQuest.model.Road;

import byui.cit260.grandQuest.model.Forest;

import byui.cit260.grandQuest.model.Bridge;

import byui.cit260.grandQuest.model.Game;
import byui.cit260.grandQuest.model.MonsterReaction;
import byui.cit260.grandQuest.model.PlayerReaction;
import byui.cit260.grandQuest.view.StartProgramView;
/**
 *
 * @author Jassen
 */
public class GrandQuest {

    /**
     * @param args the command line arguments
     */
    
    public static Game game;
    public static void setCurrentGame(Game myGame) {
        game = myGame;
    }
    
    public static Game getCurrentGame() {
        return game;
    }
    
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();            
        try {
            // create StartProgramView and start the program
            startProgramView.startProgram();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
        }
      
   
    
    void testClass() {
         Player playerOne = new Player();
       
            playerOne.setName("Me");
       
            String playerInfo = playerOne.toString();
            System.out.println(playerInfo);
            
            //Jassen starts here
    
       Road description = new Road();
       
            description.setRoadDescription("long and winding");
            description.setPlayerChoice("you chose this direction");
            description.setEncounterChance("As you continue on your way...");
            description.setArriveAtCastle("As you turn the corner and the trees clear...");
            
            String roadInfo = description.toString();
            System.out.println(roadInfo);
            
            //Jassen
       
       Forest environment = new Forest ();
       
            environment.setEnvironment("lots of trees");
            environment.setPlayerChoice("You choose...");
            environment.setEncounterChance("You run into...");
            environment.setArriveAtCastle("As you round the corner and the trees thin you see...");
       
            String forestInfo;
            forestInfo = environment.toString();
            System.out.println(forestInfo);
            
            //Jassen
       
       Bridge appearance = new Bridge ();
       
            appearance.setAppearance("washed out");
            appearance.setPlayerSolution("You try to calculate...");
            appearance.setMathEquationB("You calculate the...");
            appearance.setRopeLength("You figure you need this much rope...");
            appearance.setRopeStrength("The cart weighs this much...");
       
            String bridgeInfo;
            bridgeInfo = appearance.toString();
            System.out.println(bridgeInfo);
            
            //Jassen
            
      
            
            //Jassen
            
       PlayerReaction decision = new PlayerReaction();
       
            decision.setDecision("Are you sure?");
            decision.setPlayerReaction("You calmly ...");
            decision.setMonsterReaction("GRRRRRRR!");
            
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
            
       
}
    
}
