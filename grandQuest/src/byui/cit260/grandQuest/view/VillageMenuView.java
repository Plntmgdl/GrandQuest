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
public class VillageMenuView extends View {
    
    
    private Player currentPlayer;
    
        public VillageMenuView() {    
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
            case 'I': // go to Inn
                this.InnMenu();
                break;
            case 'T': // get and start an existing game
                this.displayTavernMenu();
                break;
            case 'M': // display the help menu
                this.displayMarketPlace();
                break;
            case 'E': // Exit the program
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void InnMenu() {
        InnMenuView InnMenu = new InnMenuView();
        InnMenu.displayMenu();
    }
   private void displayTavernMenu() {
        TavernMenuView TavernMenu = new TavernMenuView();
        TavernMenu.display();
   }

    private void displayMarketPlace() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    }
