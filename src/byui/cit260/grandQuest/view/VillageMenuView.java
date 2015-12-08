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
public abstract class VillageMenuView extends View {
    
    
    private Player currentPlayer;
    
    public VillageMenuView(){
    super ("\n"
                + "\n--------------------------------------"
                + "\n| Village menu                          |"
                + "\n--------------------------------------"
                + "\nI - Inn"
                + "\nT - Tavern"
                + "\nM - Market Place"
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
        this.console.println ("\n*** As you walk in you are struck with a feeling of rest and relaxation. "
                + "\n        You notice a small lounge area that has a couple of... "
                + "\n       You walk up to the InnKeeper and ask for a room and bath... "
                + "\n        You slowly walk upstairs and to your room. ***");
     
    }

    private void displayTavern() {
         this.console.println ("\n*** As you walk in you are hit with the smells of... "
                + "\n        You spy many patrons sitting at tables... "
                + "\n        You walk to a table and order food and drink looking forward... "
                + "\n        As you finish you start to fel a little sleepy and decide to go to sleep. ***");
     
    }

    private void displayMarketPlace() {
        this.console.println ("\n*** As you round the corner and spy the market you see items from... "
                + "\n        The first booth you stop at has trinkets from far off lands... "
                + "\n        You check your pockets and buy a couple of items for you family... "
                + "\n        You feel a slight tug on your cloak and turn around to see a man... ***");
     
    }

//    void displayVillageMenu() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    
   
   
    }
