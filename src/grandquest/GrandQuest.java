/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandquest;

import byui.cit260.grandQuest.model.Bathtub;
import byui.cit260.grandQuest.model.Player;

import byui.cit260.grandQuest.model.Road;

import byui.cit260.grandQuest.model.Forest;

import byui.cit260.grandQuest.model.Bridge;
import byui.cit260.grandQuest.model.CastleMerchant;
import byui.cit260.grandQuest.model.CastlePrince;
import byui.cit260.grandQuest.model.Creatures;
import byui.cit260.grandQuest.model.EncounterResults;

import byui.cit260.grandQuest.model.Encounters;
import byui.cit260.grandQuest.model.Game;
import byui.cit260.grandQuest.model.Inn;
import byui.cit260.grandQuest.model.Map;
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
            
       Encounters random = new Encounters ();
       
            random.setRandom("You encounter");
            random.setEncounterResults("As you are walking towards...");
            random.setPlayerReaction("What do you do?");
            random.setMonsterType("You see before you...");
            random.setMonsterReaction("the creature starts...");
       
            String encountersInfo;
            encountersInfo = random.toString();
            System.out.println(encountersInfo); 
            
            //Jassen
            
       Creatures monsters = new Creatures ();
       
            monsters.setMonsters("this monster is ugly");
            monsters.setDragon("You feel fear...");
            monsters.setRobbers("All dressed in black they come out of the shadows.");
            monsters.setGiantSpiders("A primitive fear starts to take control...");
            monsters.setPoisonousMushrooms("You try not to laugh as they...");
            monsters.setWildBoars("Out of the bushes they come...");
       
            String creaturesInfo;
            creaturesInfo = monsters.toString();
            System.out.println(creaturesInfo);
            
            //Jassen
       
        EncounterResults eulogy = new EncounterResults ();
       
            eulogy.setEulogy("You have died");
            eulogy.setNothing("You continue down the path.");
       
            String encounterResultsInfo;
            encounterResultsInfo = eulogy.toString();
            System.out.println(encounterResultsInfo);
            
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
            
       CastlePrince princeDescription = new CastlePrince();
            
            princeDescription.setPrinceDescription("Dreamy");
            princeDescription.setPrinceWords("Thank you");
            String castlePrinceInfo;
            castlePrinceInfo = princeDescription.toString();
            System.out.println(castlePrinceInfo);
            
            //Jassen
            
       Bathtub bathtubDescription = new Bathtub();
       
            bathtubDescription.setBathtubDescription("Big wooden tub, looks really relaxing.");
            bathtubDescription.setMathEquationT("How long do you want to soak...");
            bathtubDescription.setPlayerSolution("You start to fill the tub");
            String bathtubInfo;
            bathtubInfo = bathtubDescription.toString();
            System.out.println(bathtubInfo);
            
            //Jassen
            
       CastleMerchant castleMerchantDescription = new CastleMerchant();
       
            castleMerchantDescription.setCastleMerchantDescription("A robust individual who smells like spices...");
            castleMerchantDescription.setEndingPointMerc("You start off as a mercenary, protecting...");
            String castleMerchantInfo;
            castleMerchantInfo = castleMerchantDescription.toString();
            System.out.println(castleMerchantInfo);
            
            
       Game gameDescription = new Game();
       
            gameDescription.setGameDescription("Welcom to Grand Quest and epic adventure filled with...");
            gameDescription.setGameType("Choose you path");
            String gameInfo;
            gameInfo = gameDescription.toString();
            System.out.println(gameInfo);
            
       Inn innDescription = new Inn();
       
            innDescription.setInnDescription("A moderate sized two-story building...");
            innDescription.setPlayerChoice("Do you want to bath and rest, then continue...");
            innDescription.setReturnToStart("You chose to...");
            String innInfo;
            innInfo = innDescription.toString();
            System.out.println(innInfo);
            
       Map mapRowCount = new Map();
       
            mapRowCount.setColumnCount("welcome to town");
            mapRowCount.setDisplayMap("welcome to town");
            mapRowCount.setRowCount("welcome");
            String mapInfo;
            mapInfo = mapRowCount.toString();
            System.out.println(mapInfo);
            //Jassen done
    }
    
}
