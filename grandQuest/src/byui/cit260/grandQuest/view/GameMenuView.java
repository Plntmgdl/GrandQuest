/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

/**
 *
 * @author devin_000
 */
public class GameMenuView extends View{
    
   public GameMenuView() {   
        super("\n*** As the morning sun slowly "
                + "\n        crests the mountain tops it illuminates "
                + "\n       the small valley lying below. You are "
                + "\n        struck with a sense of… As you come "
                + "\n        closer to the settlement you spy the "
                + "\n        Tavern, the Inn, and the Market Place. ***");
        
        this.console.println("*\n***                                  *"
                + "\n       Welcome to the Village.  ***");
        
    }
   @Override
   public boolean doAction(Object obj) {
       return false;
       
       
   
   }   
}