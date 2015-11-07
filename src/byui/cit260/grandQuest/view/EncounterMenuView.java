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
public class EncounterMenuView {
     
    private final String Encounter = "\n"
                + "\n--------------------------------------"
                + "\n| What will you do?                          |"
                + "\n--------------------------------------"
                + "\nR - Run away"
                + "\nS - Stand your ground"
                + "\nA - Attack"
                + "\n--------------------------------------";

        public void displayEncounterMenu() {
            
            char selection = ' ';
            do{
        
                System.out.println(Encounter); // display the encounter menu
                
                String input = this.getInput(); // get the user's selection
                selection = input.charAt(0); // get first character of string
                
                this.doAction(selection); // do action based on selection
                
            } while (selection != 'E'); // a selection is not "Exit"
    }
        
         private String getInput() {
           
        boolean valid = false; // Indicates if choice has been retreived 
        String entry = null;
        Scanner keyboard = new Scanner(System.in); //Keyboard input stream
        
        while(!valid)  {  //while a valid entry has not been retreived
            
            // prompt for menu selection
            System.out.println("Enter your menu option below:");
            
            //Get the selection from the keyboard and trim off the blanks
            entry = keyboard.nextLine();
            entry = entry.trim();
            
            break; // Out of the (exit) the repetition
        }
      return entry; //Return the selection
    }

    private void doAction(char choice) {
        switch (choice) {
            case 'R': // Player runs away and screen displays previous screen
                this.displayMonsterReaction();
                break;
            case 'S': // player stands ground and screen displays monster reaction
                this.displayMonsterReaction();
                break;
            case 'A': // Player attacks and screen goes to monster reaction
                this.displayMonsterReaction();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
    
      
          
    private void displayMonsterReaction() {
       //display monster reaction
        System.out.println ("\n---------------------------------------"
                   + "\n |    The monster runs away        |");
  
  }

    
}
