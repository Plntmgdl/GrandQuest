/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jassen
 */
public abstract class EncounterMenuView extends View {
    
    public EncounterMenuView() {
    super ("\n"
                + "\n--------------------------------------"
                + "\n| What will you do?                          |"
                + "\n--------------------------------------"
                + "\nR - Run away"
                + "\nS - Stand your ground"
                + "\nA - Attack"
                + "\nP - Print"
                + "\n--------------------------------------");
}
    
    public boolean doAction(Object obj) {
        
        String value = (String)obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        return false;
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
        }
        }
                  ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");

    private void displayMonsterReaction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
          
    
      
          
   

   
}
