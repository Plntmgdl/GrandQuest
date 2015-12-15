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
public class JourneyMenuViewTwo extends View {
    
    private Player currentPlayer;
    
    public JourneyMenuViewTwo(){
    super ("\n"
               
                + "\n| Journey Menu                         |"
                + "\n--------------------------------------"
                + "\nF - Forest"
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
                + "\n There is no way anything could go wrong on this journey."
                + "\n As you keep traveling down the path the sound of rushing water reaches your ears,"
                + "\n there must be a river ahead. Sure enough you come across a river and what a surprise"
                + "\n the bridge is out. Luckily however you have some rope with you, but which size to use."
                + "\n What size rope are you going to use?");
        
//        this.displayStrengthOfRope();
//       }
//    
//    private void displayStrengthOfRope() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 
    this.displayJourneyMenuViewThree();
    } 
     private void displayJourneyMenuViewThree() {
        JourneyMenuViewThree journeyMenuViewThree = new JourneyMenuViewThree();
        journeyMenuViewThree.displayMenu();
}

    private void Village() {
        System.out.println("You change your mind and, since you are"
                + "\n a coward and a wimp, you go back to the village.");
        this.displayVillageMenu();
    }    
        public void displayVillageMenu() {
         //Display the village menu 
            VillageMenuView villageMenu = new VillageMenuView() ;
            villageMenu.displayMenu();
   

        }   
}