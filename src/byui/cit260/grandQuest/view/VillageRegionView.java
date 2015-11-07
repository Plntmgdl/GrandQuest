/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

import java.util.Scanner;

/**
 *
 * @author devin_000
 */
public class VillageRegionView {

    private final String MENU = "\n"
                + "\n--------------------------------------"
                + "\n|         Choose a Region           |"
                + "\n--------------------------------------"
                + "\nC - Go to Castle"
                + "\nI - Go to Inn"
                + "\nM - Go to Market Place"
                + "\nT - Go to Tavern"
                + "\nR - Return to Region Map"
                + "\n--------------------------------------";

        public void displayMenu() {
            
            char selection = ' ';
            do{
        
                System.out.println(MENU); // display the main menu
                
                String input = this.getInput(); // get the user's selection
                selection = input.charAt(0); // get first character of string
                
                this.doAction(selection); // do action based on selection
                
            } while (selection != 'R'); // a selection is not "Save and End Game"
    }
        
         private String getInput() {
           
        boolean valid = false; // Indicates if Name has been retreived 
        String entry = null;
        Scanner keyboard = new Scanner(System.in); //Keyboard input stream
        
        while(!valid)  {  //while a valid entry has not been retreived
            
            // prompt for menu selection
            System.out.println("Enter your menu option below:");
            
            //Get the name from the keyboard and trim off the blanks
            entry = keyboard.nextLine();
            entry = entry.trim();
            
            break; // Out of the (exit) the repetition
        }
      return entry; //Return the selection
    }

    private void doAction(char choice) {
        switch (choice) {
            case 'C': // Go to Castle
                this.displayCastleView();
                break;
            case 'I': // Go to Inn
                this.displayInnView();
                break;
            case 'M': // Go to Marketplace
                this.displayMarketPlaceView();
                break;
            case 'T': // Go to Tavern
                this.displayTavernView();
                break;
            case 'E': // save game and return to main menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
    
    private void displayCastleView() {
       System.out.println ("\n---------------------------------------"
                   + "\n | Going to the Castle |"
                   + "\n-------------------------------------------");
    }
    
    private void displayInnView() {
       System.out.println ("\n---------------------------------------"
                   + "\n | Going to the Inn |"
                   + "\n-------------------------------------------");
     
    }
    
    private void displayMarketPlaceView(){
        System.out.println ("\n---------------------------------------"
                   + "\n | Going to the Marketplace|"
                   + "\n-------------------------------------------");
     
    }
    
    private void displayTavernView(){
        System.out.println ("\n---------------------------------------"
                   + "\n | Going to the Tavern |"
                   + "\n-------------------------------------------");
     
    }
}

    

