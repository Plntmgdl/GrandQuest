/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

import byui.cit260.grandQuest.control.GameControl;
import byui.cit260.grandQuest.model.Player;

import GrandQuest.GrandQuest;
import static byui.cit260.grandQuest.view.GameMenuView.gameMenu;
import java.util.Scanner;

/**
 *
 * @author devin_000
 */
public abstract class MainMenuView extends View {
     
    public MainMenuView() {
          super("\n"
                + "\n--------------------------------------"
                + "\n| Main Menu                          |"
                + "\n--------------------------------------"
                + "\nN - Start New Game"
                + "\nG - Start Existing Game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nE - Exit"
                + "\n--------------------------------------");
    }
    @Override
    public boolean doAction(Object obj) {
        String value = (String)obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
  
   
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
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    private void startNewGame() {
            // create a new game
            GameControl.createNewGame(GrandQuest.getPlayer());   
            
            // display the game menu
            // GameMenuView.gameMenu = new GameMenuView() {};         
 }
    
    
    private void saveGame() {
        this.console.println("\n\nEnter the file path for file where the game"
                                + "is to be saved");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(GrandQuest.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
    private void startExistingGame() {
        this.console.println("\n\nEnter the file path for file where the game"
                                + "is to be saved");
        String filePath = this.getInput();
        
        try {
            GameControl.getSavedGame(GrandQuest.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
//    void display(Player player) {
//        
//    }

//    void displayMenu(Player player) {
//        
//    }

//    private static class GrandQuest {
//
//        private static Player getPlayer() {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        public GrandQuest() {
//        }
//    }

//    void display(Player player) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    

    
}
