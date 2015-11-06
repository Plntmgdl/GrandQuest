/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

import java.util.Scanner;

/**
 *
 * @author Jassen
 */
    public class HelpMenuView {
    
        private final String MENU = "\n"
                + "\n--------------------------------------"
                + "\n| Help Menu                          |"
                + "\n--------------------------------------"
                + "\nJ - Journey directions"
                + "\nE - Encounter directions"
                + "\nC - Calculation directions"
                + "\nO - Object of game"
                + "\nR - Return to main menu"
                + "\n--------------------------------------";

        public void displayMenu() {
            
            char selection = ' ';
            do{
        
                System.out.println(MENU); // display the main menu
                
                String input = this.getInput(); // get the user's selection
                selection = input.charAt(0); // get first character of string
                
                this.doAction(selection); // do action based on selection
                
            } while (selection != 'R'); // a selection is not "Exit"
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
            case 'J': // display journey directions
                this.displayJourneyDirections();
                break;
            case 'E': // display encounter directions
                this.displayEncounterDirections();
                break;
            case 'C': // display calculation directions
                this.displayCalculationDirections();
                break;
            case 'O': // display object of game
                this.displayObjectOfGame();
                break;
            case 'R': // return to main menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
    
    private void displayJourneyDirections() {
       System.out.println ("\n---------------------------------------"
                   + "\n |    Journey Directions        |"
                   + "\n-------------------------------------------"
                   + "\n Choose your path"
                   + "\n Left, Right, Straight");
    }
    
    private void displayEncounterDirections() {
       System.out.println ("\n---------------------------------------"
                   + "\n |    Encounter Directions        |"
                   + "\n-------------------------------------------"
                   + "\n Choose your action"
                   + "\n Run, Stand still, Attack");
     
    }
    
    private void displayCalculationDirections(){
        System.out.println ("\n---------------------------------------"
                   + "\n |    Calculation Directions        |"
                   + "\n-------------------------------------------"
                   + "\n Input your numbers"
                   + "\n Hit enter to calculate");
     
    }
    
    private void displayObjectOfGame () {
        System.out.println ("\n---------------------------------------"
                   + "\n |    Object Of Game        |"
                   + "\n-------------------------------------------"
                   + "\n You are hired to assist a merchant"
                   + "\n in bringing the Prince his birthday gift.");
    }
}
