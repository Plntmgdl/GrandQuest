/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Jassen
 */
public class EncounterMenuView extends View {
    
    public EncounterMenuView() {
    super ("\n"
                + "\n--------------------------------------"
                + "\n| What will you do?                          |"
                + "\n--------------------------------------"
                + "\nR - Run away"
                + "\nS - Stand your ground"
                + "\nA - Attack"
                + "\nE - Exit"
                + "\n--------------------------------------");
}
     @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
       
        switch (choice) {
            case 'R': 
                this.MonsterReaction();
                break;
            case 'S': 
                this.MonsterReaction();
                break;
            case 'A': 
                this.MonsterReaction();
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


    private void MonsterReaction() {
        System.out.println("The robbers say boo and leave. So you continue on your way.");
 
    this.displayJourneyMenuViewTwo();
    } 
     private void displayJourneyMenuViewTwo() {
        JourneyMenuViewTwo journeyMenuViewTwo = new JourneyMenuViewTwo();
        journeyMenuViewTwo.displayMenu();
     }   

    
}

    

    

   