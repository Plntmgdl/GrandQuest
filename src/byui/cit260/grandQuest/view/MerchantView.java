/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

import byui.cit260.grandQuest.model.Player;

/**
 *
 * @author devin_000
 */
public class MerchantView extends View {
    
    private Player currentPlayer;
    
    public MerchantView(){
    super ("\n"
                + "\n--------------------------------------"
                + "\nY - Help the Merchant"
                + "\nN - Choose not to help the Merchant"
                + "\nE - Exit"
                + "\n--------------------------------------");
    }
    

     @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
 
        switch (choice) {
            case 'Y': 
                this.displayHelp();
                break;
            case 'N': 
                this.displayRefuse();
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

    private void displayHelp() {
        System.out.println ("\n---------------------------------------"
                   + "\n As you look at the poor figure in front of you"
                   + "\n you see a desparate man and your generous heart"
                   + "\n opens and you gladly say you will help."
                   + "\n 'Thank you so much, my good sir. We will leave in the morning"
                   + "\n please retire to the Inn and relax and we will meet here in the morning.");
   
    this.displayVillageMenu();
    }
    
    public void displayVillageMenu() {
         //Display the village menu 
    VillageMenuView villageMenu = new VillageMenuView() ;
    villageMenu.displayMenu();
    }  
    

    private void displayRefuse() {
        System.out.println ("\n--------------------------------------"
                    + "\n You turn to see a pathetic looking man who appears severly distraught."
                    + "\n You would like to help but you really want to get home and"
                    + "\n this Prince is not your Pince. So you politely refuse and"
                    + "\n leave the man sobbing in the street.");
    
        
      this.displayVillageMenu();
      
    
    }
}
