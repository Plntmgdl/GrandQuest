/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

/**
 *
 * @author Jassen
 */
class MarketView {

    void displayMarket() {
        System.out.println("\n You walk over, hop in the wagon seat, and take the wagon to the market."
                + "\n The early morning air starts to fill with the smells of..."
                + "\n You approach the shop you were told to go to and..."
                + "\n 'Good morrow adventurer. How may I help you?'"
                + "\n He hands you a list of items and you start to think what you may need."
                + "\n You remember the merchant saying that the wgaon can only carry a total of two thousand pounds"
                + "\n and that includes the wagon which is five hundred by itself. So start to load the wagon.");
 
        this.displayWagonLoadingView();
        //this.displayJourneyMenuView();
    }  
    
        private void displayWagonLoadingView() {
          
            WagonLoadingView wagonLoading = new WagonLoadingView();
            wagonLoading.displayMenu();
        }
     
    
    
    
//    private void displayJourneyMenuView() {
//        JourneyMenuView journeyMenuView = new JourneyMenuView();
//        journeyMenuView.displayMenu();
//     }

}  