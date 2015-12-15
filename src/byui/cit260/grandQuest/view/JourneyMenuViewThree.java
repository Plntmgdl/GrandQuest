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
public class JourneyMenuViewThree extends View {
    
    private Player currentPlayer;
    
    public JourneyMenuViewThree(){
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
                + "\n As you keep traveling down the path the sound of trumpets and fanfare reach your ears,"
                + "\n there must be a castle ahead. Sure enough as you come around the bend"
                + "\n there on the hill is a massive castle. The merchant and you both sigh in relief and"
                + "\n continue through the gates into the courtyard where a big celebration is going on."
                + "\n You stop the wagon and watch as the merchant takes the gift to his Prince,"
                + "\n The Prince is obviously in tears as he looks up to you and bekons you over."
                + "\n 'I want to thank you for what you have done. This gift is a family heirloom"
                + "\n that was lost years ago. I want to thank you and offer to help you in anyway I can."
                + "\n So you may choose you reward.");
        
    this.displayRewardMenuView();
    } 
     private void displayRewardMenuView() {
        RewardMenuView rewardMenuView = new RewardMenuView();
        rewardMenuView.displayMenu();
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