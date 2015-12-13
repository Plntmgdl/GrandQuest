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
        System.out.println("\n The morning is bright and beautiful as you start down the forest path."
                + "\n There is no way anything could go wrong on this journey");
    }

    private void displayRoad() {
        System.out.println("\n As you start down the road a man walks up to you"
                + "\n and informs you that the road is currently closed and you will"
                + "\n have to take the forest.");
        this.displayForest();
    }

    private void Village() {
        System.out.println("You change your mind and, since you are"
                + "\n a coward and wimp, you go back to the village.");
        this.displayVillageMenu();
    }    
        public void displayVillageMenu() {
         //Display the village menu 
            VillageMenuView villageMenu = new VillageMenuView() ;
            villageMenu.displayMenu();
    }  
}
