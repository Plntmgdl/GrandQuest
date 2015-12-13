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
public class MovementMenuView extends View{
        
        public MovementMenuView() {
            super ("\n"
                + "\n--------------------------------------"
                + "\n|         Choose a Region           |"
                + "\n--------------------------------------"
                + "\nV - Go to Village"
                + "\nR - Go to Road"
                + "\nF - Go to Forest"
                + "\nE - Save and End Game"
                + "\n--------------------------------------");
        }
        
        public boolean doAction (Object obj) {
            
            String value = (String) obj;
            value = value.toUpperCase();
            char choice = value.charAt(0);
            return false;
        }
        

    private void doAction(char choice) {
        switch (choice) {
            case 'V': // Go to the Village Region
                this.displayMenuVillage();
                break;
            case 'R': // Go to the Road Region
                this.displayRegionRoad();
                break;
            case 'F': // Go to the Forest Region
                this.displayRegionForest();
                break;
            case 'E': // save game and return to main menu
                return ;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
    
    private void displayMenuVillage() {
       // display the game menu
        VillageMenuView villageRegion = new VillageMenuView() {};
        villageRegion.displayMenu();
    }
    
    private void displayRegionRoad() {
       this.console.println ("\n---------------------------------------"
                   + "\n | Launch RegionRoad menu |"
                   + "\n-------------------------------------------");
     
    }
    
    private void displayRegionForest(){
        this.console.println ("\n---------------------------------------"
                   + "\n | Launch RegionForest menu |"
                   + "\n-------------------------------------------");
     
    }
    
}

    

