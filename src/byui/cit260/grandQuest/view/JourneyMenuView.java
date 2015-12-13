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
public class JourneyMenuView extends View {
    
    private Player currentPlayer;
    
    public JourneyMenuView(){
    super ("\n"
               
                + "\n| Journey Menu                         |"
                + "\n--------------------------------------"
                + "\nF - Forest"
                + "\nR - Road"
                + "\nV - Village"
                + "\nE - Exit"
                + "\n--------------------------------------");
    }
    

    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
       
        switch (choice) {
            case 'F': 
                this.displayForest();
                break;
            case 'R': 
                this.displayRoad();
                break;
            case 'V': 
                this.Village();
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

    private void displayForest() {
        throw new UnsupportedOperationException("Forest Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayRoad() {
        throw new UnsupportedOperationException("Road Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Village() {
        throw new UnsupportedOperationException("Village Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
}
