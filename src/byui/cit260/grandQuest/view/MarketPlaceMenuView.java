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
public abstract class MarketPlaceMenuView extends View {
    
    private Player currentPlayer;
    
    public MarketPlaceMenuView(){
    super ("\n"
                + "\n--------------------------------------"
                + "\n| Market Place Menu                          |"
                + "\n--------------------------------------"
                + "\nI - Look Around"
                + "\nT - Go to the Inn"
                + "\nM - Go to the Tavern"
                + "\nE - Exit"
                + "\n--------------------------------------");
    }
    

        public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        return false;
    }

    private void doAction(char choice) {
        switch (choice) {
            case 'I': // create and start a new game
                this.displayLookAround();
                break;
            case 'T': // get and start an existing game
                this.displayInn();
                break;
            case 'M': // display the help menu
                this.displayTavern();
                break;
            case 'E': // Exit the program
                return;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void displayLookAround() {
        this.console.println ("\n---------------------------------------"
                   + "\n As you look around the market place you see"
                   + "\n all kinds of shops and merchants, animals"
                   + "\n of all different kinds.  You smell spices"
                   + "\n mixed in with the foul smell of animal dung,"
                   + "\n and nothing seems capture your attention .");
    }

    private void displayInn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayTavern() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayMarketPlaceMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   
    }
