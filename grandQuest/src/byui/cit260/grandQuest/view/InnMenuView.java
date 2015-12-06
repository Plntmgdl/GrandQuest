/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

import byui.cit260.grandQuest.model.Player;

/**
 *
 * @author Jassen
 */
public class InnMenuView extends View{
 private Player currentPlayer;
    
        public InnMenuView() {    
            super ("\n"
                + "\n--------------------------------------"
                + "\n Welcome to the Inn of Village                        |"
                + "\n--------------------------------------"
                + "\nL - Look around"
                + "\nT - Talk to the Innkeeper"
                + "\nR - Get a room and go to sleep"
                + "\nB - Take a bath"
                + "\nT - Go to the Tavern for dinner"
                + "\nM - Go to the Market place for sight seeing"
                + "\nE - Exit"
                + "\n--------------------------------------");
        }
@Override        
        public boolean doAction(Object obj) {
    
               String value = (String) obj;
               value = value.toUpperCase();
               char choice = value.charAt(0);

        

        switch (choice) {
            case 'L': 
                this.console.println("As you look around you notice how quaint"
                        + " and cozy it is. "
                        + "A small little sitting area near the window gives it a "
                        + "peaceful feeling."
                        + "behind a small counter stands an elderly man that smiles as you enter."
                        + "Not wanting to disturb you he patiently waits as you wander around.");
                break;
            case 'T': 
                this.console.println("As you approach the Innkeeper he asks "
                        + "how he can help you and if you are doing well."
                        + "You...");
                break;
            case 'R': // display the help menu
                this.console.println("You kindly request a room and retire up stairs "
                        + "exhausted from your travels.");
                break;
            case 'B':
                this.console.println("The tub is about five feet in diameter"
                        + "which is a surprise and a welcome one at that."
                        + "Your tired muscles start to tremble with excitement"
                        + "at the thought of a nice, warm, soak."
                        + "You start the water heating up and start filling the tub.");
            case 'E': // Exit the program
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayTavern() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMarketPlace() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      
    }
   

