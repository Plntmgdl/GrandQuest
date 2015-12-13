/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

import byui.cit260.grandQuest.control.ProgramControl;
import byui.cit260.grandQuest.model.Player;
import java.util.Scanner;
/**
 *
 * @author devin_000
 */
public class StartProgramView { 
//    private Object keyboard;
//extends View{

    public StartProgramView(){//String promptMessage) {
//        super(promptMessage);
    }

public void startProgram (){

    //Display the banner screen
    this.displayBanner(); 

    //Prompt player to enter their name and retrieve name of player
    String playersName = this.getPlayersName();
    
    //Create and save the player object
    Player player = ProgramControl.createPlayer(playersName);
   
    //Display personalized welcome message
    this.displayWelcomeMessage(player);
    
    //Display the main menu
    MainMenuView mainMenu = new MainMenuView() {};
   
    mainMenu.displayMenu();
        
    }

    public void displayBanner() {
        System.out.println("\n\n**************************************");
        
        System.out.println("*                                  *"
                        + "\n* This is the Game of Grand Quest   *"
                        + "\n* In This Game You Will Accompany the Merchant to the Castle   *"
                        + "\n* To Bring the Prince His Birthday Present   *");
        
        System.out.println("*                                  *"
                        + "\n* Your First Stop Will Be the Village   *"
                        + "\n* Where You Will Meet the Merchant in the Marketplace   *"
                        + "\n* There You Will Have To Choose Your Inventory   *"
                        + "\n* Making Sure You Don't Overload The Wagon   *"
                        + "\n* Then After A Peaceful Bath And Full Night's Rest   *"
                        + "\n* You Will Start Your Journey   *");
        
        System.out.println("*                                  *"
                        + "\n* Good Luck and Have A Grand Adventure   *"
                        + "\n*                                 *");
        
        
    }

    private String getPlayersName() {
           
        boolean valid = false; // Indicates if Name has been retreived 
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        try {
        
        while(!valid)  {  //while a valid name has not been retreived
            
            // prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            //Get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            //If the name is invalid ( < 2 characters in length)
            if (playersName.length() < 2 ) {
                ErrorView.display(this.getClass().getName(),
                        "invalid name - the name must not be blank");
                continue; // And repeat again
            }
            break; // Out of the (exit) the repetition
        }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
      return playersName; //Return the name
    }

    private void displayWelcomeMessage(Player player) {
         System.out.println("\n\n==================================================");
         System.out.println("\tWelcome adventurer " + player.getName());
         System.out.println("\tEnjoy your grand quest");
         System.out.println("==================================================");
    }

//    @Override
//    public void displayMenu() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean doAction(Object obj) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    @Override
//    public boolean doAction(Object obj) {
//        
//        String value = (String) obj;
//            this.console.println("start program view do action =" + value);
//            return true;
//    }

   
}
