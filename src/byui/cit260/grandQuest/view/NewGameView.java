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
public class NewGameView {
   
    public void newGame(){

    //Display the banner screen
    this.displayIntro(); 

    
    }
    
      
        
  
    public void displayIntro() {   
        System.out.println("\n*** As the morning sun slowly "
                + "\n        crests the mountain tops it illuminates "
                + "\n       the small valley lying below. You are "
                + "\n        struck with a sense of… As you come "
                + "\n        closer to the settlement you spy the "
                + "\n        Tavern, the Inn, and the Market Place. ***");
        
        System.out.println("*\n***                                  *"
                + "\n       Welcome to the Village."
                + "\n Where would you like to go first? ***");
        
        this.displayVillageMenu();
    }
    
    public void displayVillageMenu() {
         //Display the village menu 
    VillageMenuView villageMenu = new VillageMenuView() ;
    villageMenu.displayMenu();
    }  
    
}
