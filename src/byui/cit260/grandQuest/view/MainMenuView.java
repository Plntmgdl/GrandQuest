/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

import byui.cit260.grandQuest.control.GameControl;
import grandquest.GrandQuest;
import java.util.Scanner;

/**
 *
 * @author devin_000
 */
public class MainMenuView {
    
        private final String MENU = "\n"
                + "\n--------------------------------------"
                + "\n| Main Menu                          |"
                + "\n--------------------------------------"
                + "\nN - Start New Game"
                + "\nG - Start Existing Game"
                + "\nH - Get help on how to play teh game"
                + "\nS - Save game"
                + "\nE - Exit"
                + "\n--------------------------------------";

        public void displayMenu() {
            
            char selection = ' ';
            do{
        
                System.out.println(MENU); // display the main menu
                
                String input = this.getInput(); // get the user's selection
                selection = input.charAt(0); // get first character of string
                
                this.doAction(selection); // do action based on selection
                
            } while (selection != 'E'); // a selection is not "Exit"
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
            case 'N': // create and start a new game
                this.startNewGame();
                break;
            case 'G': // get and start an existing game
                this.startExistingGame();
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'S': // save the current game
                this.saveGame();
                break;
            case 'E': // Exit the program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
    
    private void startNewGame() {
            // create a new game
        GameControl.createNewGame(GrandQuest.getplayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
    private void startExistingGame() {
        System.out.println("*** startExistingGame function is called ***");
    }
    
    private void saveGame() {
        System.out.println("*** saveGame function is called ***");
    }
    
    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function is called ***");
    }
    
}
