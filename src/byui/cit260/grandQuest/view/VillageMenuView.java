/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

import byui.cit260.grandQuest.model.Player;
import java.util.Scanner;

/**
 *
 * @author Jassen
 */
public  class VillageMenuView extends View {
    
    
    private Player currentPlayer;
    
    public VillageMenuView(){
    super ("\n"
                + "\n--------------------------------------"
                + "\n| Village menu                          |"
                + "\n--------------------------------------"
                + "\nI - Inn"
                + "\nT - Tavern"
                + "\nM - Market Place"
                + "\nG - Game Menu"
                + "\nE - Exit"
                + "\n--------------------------------------");
    }
    

    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
       
        switch (choice) {
            case 'I': 
                this.displayInn();
                break;
            case 'T': 
                this.displayTavern();
                break;
            case 'M': 
                this.displayMarketPlace();
                break;
             case 'G':
                this.displayGameMenu();
                break;   
            case 'E': // Exit the program
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayInn() {
        System.out.println ("\n*** As you walk in you are struck with a feeling of rest and relaxation. "
                + "\n        You notice a small lounge area that has a couple of... "
                + "\n       You walk up to the InnKeeper and ask for a room and bath... "
                + "\n        You slowly walk upstairs and to your room. ***");
        
        this.displayInnMenuView();
    }  
            
            private void displayInnMenuView() {
         
            InnMenuView innMenu = new InnMenuView() ;
            innMenu.displayMenu();
    
    
    }

    private void displayTavern() {
         System.out.println ("\n*** As you walk in you are hit with the smells of... "
                + "\n        You spy many patrons sitting at tables... "
                + "\n        You walk to a table and order food and drink looking forward... "
                + "\n        As you finish you start to feel a little sleepy and decide to go to the Inn"
                + "\n        to get a room and a bath. ***");
     
        this.displayInn();
    }

    private void displayMarketPlace() {
        System.out.println ("\n*** As you round the corner and spy the market you see items from... "
                + "\n        The first booth you stop at has trinkets from far off lands... "
                + "\n        You check your pockets and buy a couple of items for your family... "
                + "\n        You feel a slight tug on your cloak and turn around to see a man..."
                + "\n        Excuse me would you care to help me take something to my Prince?***");
             
        this.displayMerchantView();
    }
    
            public void displayMerchantView() {
         
            MerchantView merchantView = new MerchantView() ;
            merchantView.displayMenu();
    }  

     private void displayGameMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }       
}
