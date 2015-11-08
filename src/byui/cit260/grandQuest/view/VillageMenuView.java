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
public class VillageMenuView {
    
    
    private Player currentPlayer;
    
    private final String VillageMenu = "\n"
                + "\n--------------------------------------"
                + "\n| Village menu                          |"
                + "\n--------------------------------------"
                + "\nI - Inn"
                + "\nT - Tavern"
                + "\nM - Market Place"
                + "\nE - Exit"
                + "\n--------------------------------------";
    

        public void displayVillageMenu(Player player) {
            
            currentPlayer = player;
            
            char selection = ' ';
            do{
        
                System.out.println(VillageMenu); // display the village menu
                
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
            case 'I': // create and start a new game
                this.displayInn();
                break;
            case 'T': // get and start an existing game
                this.displayTavern();
                break;
            case 'M': // display the help menu
                this.displayMarketPlace();
                break;
            case 'E': // Exit the program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void displayInn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayTavern() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMarketPlace() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayVillageMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   
    }
