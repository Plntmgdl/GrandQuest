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
public class TavernMenuView extends View {
    
    
    private Player currentPlayer;
    
        public TavernMenuView() {    
            super ("\n"
                + "\n--------------------------------------"
                + "\n| Tavern menu                          |"
                + "\n--------------------------------------"
                + "\nL - Look around"
                + "\nB - Talk to barkeeper"
                + "\nD - Get a drink and meal"
                + "\nM - Talk to merchant"
                + "\nI - Go to Inn"
                + "\nS - Go to MarketPlace"
                + "\nE - Exit"
                + "\n--------------------------------------");
        }
@Override        
        public boolean doAction(Object obj) {
    
               String value = (String) obj;
               value = value.toUpperCase();
               char choice = value.charAt(0);

        

        switch (choice) {
            case 'L': 
                System.out.println("As you enter the common area the smell of"
                        + "smoked meat and sound of laughter almost brings you to your knees."
                        + "The memories of home are vivid and clear but the grumbling of your stomach "
                        + "brings you back to the moment and you find a table to sit in.");
                break;
            case 'B': 
                System.out.println("You walk up to the bar and the barkeeper greets "
                        + "you with a friendly smile and hello.");
                break;
            case 'S': 
                this.displayMarketPlace();
                break;
            case 'E': // Exit the program
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayMarketPlace() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
