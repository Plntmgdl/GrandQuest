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
public class EncounterMenuView extends View {
    
    public EncounterMenuView() { 
            super("\n"
                + "\n--------------------------------------"
                + "\n| What will you do?                          |"
                + "\n--------------------------------------"
                + "\nR - Run away"
                + "\nS - Stand your ground"
                + "\nA - Attack"
                + "\n--------------------------------------");
    }
    @Override
    public boolean doAction(Object obj) {
    
    String value = (String) obj;
    value = value.toUpperCase();
    char choice = value.charAt(0);

       

       

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
        return false;
}
    
    
      
          
    private void displayMonsterReaction() {
       //display monster reaction
        System.out.println ("\n---------------------------------------"
                   + "\n |    The monster runs away        |");
  
  }

    
}
