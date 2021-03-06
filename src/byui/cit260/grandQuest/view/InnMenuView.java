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
public class InnMenuView extends View {
    private Player currentPlayer;
    
    public InnMenuView() {
        super ("\n"
                + "\n--------------------------------------"
                + "\nB - Take a bath"
                + "\nS - Sleep"
                + "\nE - Exit"
                + "\n--------------------------------------");
    }
    

     @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
 
        switch (choice) {
            case 'B': 
                this.displayBath();
                break;
            case 'S': 
                this.displaySleep();
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

    private void displayBath() {
        System.out.println ("\n---------------------------------------"
                   + "\n As you look at the deep round tubs in front of you"
                   + "\n you wonder how much water each one holds, because you are really tired."
                   + "\n Of course you are also really weary from the day and a soak would feel good."
                   + "\n So you pick a tub and start filling it up.");
        
        
    this.displayInnBathTubView();
//    
    }
    
    private void displayInnBathTubView() {
         
            InnBathTubView innBathTub = new InnBathTubView() ;
            innBathTub.displayMenu();
        }

    private void displaySleep() {
        System.out.println ("\n--------------------------------------"
                    + "\n You close your eyes and drift off."
                    + "\n zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"
                    + "\n zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"
                    + "\n cock-a-doodle-doo!!!!"
                    + "\n You wake up to the crowing of the rooster "
                    + "\n excited for a new day");
    
        
      this.displayVillageMenu();
    }
    
    public void displayVillageMenu() {
         //Display the village menu 
    VillageMenuView villageMenu = new VillageMenuView() ;
    villageMenu.displayMenu();
    } 
    
    
}


