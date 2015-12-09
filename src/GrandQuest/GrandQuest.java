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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public static Player player;

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        GrandQuest.game = game;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        GrandQuest.player = player;
    }
    
    
    public static Game getCurrentGame() {
        return game;
    }
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        GrandQuest.logFile = logFile;
    }
    

    public static PrintWriter getOutfile() {
        return outFile;
    }

    public static void setOutfile(PrintWriter outfile) {
        GrandQuest.outFile = outfile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        GrandQuest.inFile = inFile;
    }
    
    
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();            
        try {
            GrandQuest.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            
            GrandQuest.outFile = new PrintWriter(System.out, true);
//            
//            String filePath = "log.txt";
//            GrandQuest.logFile = new PrintWriter(filePath);
// create StartProgramView and start the program
            startProgramView.startProgram();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
//            startProgramView.displayMenu();
        }
        
        finally {
            try {
                if (GrandQuest.inFile != null)
                    GrandQuest.inFile.close();
                if (GrandQuest.outFile != null)
                    GrandQuest.outFile.close();
                if (GrandQuest.logFile != null)
                    GrandQuest.logFile.close();
            } catch (IOException ex) {
               System.out.println("Error closing files");
               return;
          
            
        
                       }}}

    public static PrintWriter getOutFile() {
        return null;
        
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
