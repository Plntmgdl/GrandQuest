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
import byui.cit260.grandQuest.model.Castle;
import byui.cit260.grandQuest.model.CastleMerchant;
import byui.cit260.grandQuest.model.CastlePrince;
import byui.cit260.grandQuest.model.Creatures;
import byui.cit260.grandQuest.model.EncounterResults;

import byui.cit260.grandQuest.model.Encounters;
import byui.cit260.grandQuest.model.Game;
import byui.cit260.grandQuest.model.Inn;
import byui.cit260.grandQuest.model.Map;
import byui.cit260.grandQuest.model.MarketPlace;
import byui.cit260.grandQuest.model.Menu;
import byui.cit260.grandQuest.model.Merchant;
import byui.cit260.grandQuest.model.MonsterReaction;
import byui.cit260.grandQuest.model.PlayerReaction;
import byui.cit260.grandQuest.model.Prince;
import byui.cit260.grandQuest.model.Tavern;
import byui.cit260.grandQuest.model.Village;
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
            
    
       Road description = new Road();
       
            description.setRoadDescription("long and winding");
            description.setPlayerChoice("you chose this direction");
            description.setEncounterChance("As you continue on your way...");
            description.setArriveAtCastle("As you turn the corner and the trees clear...");
            
            String roadInfo = description.toString();
            System.out.println(roadInfo);
            
       
       Forest environment = new Forest ();
       
            environment.setEnvironment("lots of trees");
            environment.setPlayerChoice("You choose...");
            environment.setEncounterChance("You run into...");
            environment.setArriveAtCastle("As you round the corner and the trees thin you see...");
       
            String forestInfo;
            forestInfo = environment.toString();
            System.out.println(forestInfo);
            
       
       Bridge appearance = new Bridge ();
       
            appearance.setAppearance("washed out");
            appearance.setPlayerSolution("You try to calculate...");
            appearance.setMathEquationB("You calculate the...");
            appearance.setRopeLength("You figure you need this much rope...");
            appearance.setRopeStrength("The cart weighs this much...");
       
            String bridgeInfo;
            bridgeInfo = appearance.toString();
            System.out.println(bridgeInfo);
            
            
       Encounters random = new Encounters ();
       
            random.setRandom("You encounter");
            random.setEncounterResults("As you are walking towards...");
            random.setPlayerReaction("What do you do?");
            random.setMonsterType("You see before you...");
            random.setMonsterReaction("the creature starts...");
       
            String encountersInfo;
            encountersInfo = random.toString();
            System.out.println(encountersInfo); 
            
            
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
            
       
        EncounterResults eulogy = new EncounterResults ();
       
            eulogy.setEulogy("You have died");
            eulogy.setNothing("You continue down the path.");
       
            String encounterResultsInfo;
            encounterResultsInfo = eulogy.toString();
            System.out.println(encounterResultsInfo);
            
            
       PlayerReaction decision = new PlayerReaction();
       
            decision.setDecision("Are you sure?");
            decision.setPlayerReaction("You calmly ...");
            decision.setMonsterReaction("GRRRRRRR!");
            
            String playerReactionInfo;
            playerReactionInfo = decision.toString();
            System.out.println(playerReactionInfo);
            
            
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
            
                        
       CastlePrince princeDescription = new CastlePrince();
            
            princeDescription.setPrinceDescription("Dreamy");
            princeDescription.setPrinceWords("Thank you");
            String castlePrinceInfo;
            castlePrinceInfo = princeDescription.toString();
            System.out.println(castlePrinceInfo);
            
            
       Bathtub bathtubDescription = new Bathtub();
       
            bathtubDescription.setBathtubDescription("Big wooden tub, looks really relaxing.");
            bathtubDescription.setMathEquationT("How long do you want to soak...");
            bathtubDescription.setPlayerSolution("You start to fill the tub");
            String bathtubInfo;
            bathtubInfo = bathtubDescription.toString();
            System.out.println(bathtubInfo);
            
           
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
            
       Village villageDescription = new Village();
       
            villageDescription.setVillageDescription("A lovely place");
            villageDescription.setStartingPoint("Welcome");
            String villageInfo;
            villageInfo = villageDescription.toString();
            System.out.println(villageInfo);
            
            
       MarketPlace marketPlaceDescription = new MarketPlace();
       
            marketPlaceDescription.setMarketPlaceDescription("many vendors...");
            marketPlaceDescription.setItems("food,water,spices,rope");
            String marketPlaceInfo;
            marketPlaceInfo = marketPlaceDescription.toString();
            System.out.println(marketPlaceDescription);
            
       Prince tavernPrinceDescription = new Prince();
            
            tavernPrinceDescription.setTavernPrinceDescription("Dreamy");
            tavernPrinceDescription.setPrinceRequest("Make me a sandwhich");
            tavernPrinceDescription.setPlayerChoice("Yes");
            String princeInfo;
            princeInfo = tavernPrinceDescription.toString();
            System.out.println(princeInfo);
            
       Tavern tavernDescription = new Tavern();
            
            tavernDescription.setTavernDescription("What a dump");
            tavernDescription.setPrinceRequest("Bring me a drink");
            tavernDescription.setPlayerChoice("Yes");
            String tavernInfo;
            tavernInfo = tavernDescription.toString();
            System.out.println(tavernInfo);
            
       Menu menuHelp = new Menu();
       
            menuHelp.setHelp("map");
            menuHelp.setMap("Map");
            menuHelp.setRestart("Restart");
            menuHelp.setDoOver("Do over");
            String menuInfo;
            menuInfo = menuHelp.toString();
            System.out.println(menuInfo);
            
            
       Merchant merchantDescription = new Merchant();
       
            merchantDescription.setMerchantDescription("Big and Jolly");
            merchantDescription.setMerchantRequest("Assist with wagon");
            merchantDescription.setPlayerChoice("load wagon");
            String merchantInfo;
            merchantInfo = merchantDescription.toString();
            System.out.println(merchantInfo);
            
       Castle castleDescription = new Castle();
       
          castleDescription.setCastleDescription("As you round the corner there before you on a...");
          castleDescription.setMerchantThank("The merchant reveals himself to be...");
          castleDescription.setPrinceThank("The man reveals himself to be...");
          castleDescription.setRewardCertificate("Here is your reward");
          String castleInfo;
          castleInfo = castleDescription.toString();
          System.out.println(castleInfo);


    }
    
}
