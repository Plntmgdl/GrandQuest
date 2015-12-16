/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

import byui.cit260.grandQuest.control.CalculationsControl;
import citbyui.cit260.grandQuest.exceptions.CalculationsControlException;
import java.util.Scanner;

/**
 *
 * @author devin_000
 */
public class WagonLoadingView {
     
    private double getPoundsOfFlour() {   
    //get the PoundsOfFlour of the tub from the user
       
        boolean valid = false;
        double poundsOfFlour = 0;
        Scanner keyboard = new Scanner(System.in);
        
        try{
        while (!valid) {    //while an valid number has not been retrieved
            
            System.out.println("Enter the Pounds Of Flour you want to load.");
            
            //Get the number from the keyboard
            poundsOfFlour = keyboard.nextDouble();
            
            //If the number is invalid (Less than one or greater than 5)
            if (poundsOfFlour < 0 || poundsOfFlour > 1500 ){
                System.out.println("Invalid number - Number must be larger than 0, but less than 1500");
                continue; // And repeat again
            }
            break; // out of the repitiion
        }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    return poundsOfFlour; //Return the PoundsOfFlour
    }
    
    
    
    private double getPoundsOfGrain() {   
    //get the PoundsOfGrain of the tub from the user
       
        boolean valid = false;
        double poundsOfGrain = 0;
        Scanner keyboard = new Scanner(System.in);
        
        try{
        while (!valid) {    //while an valid number has not been retrieved
            
            System.out.println("Enter the Pounds Of Grain you want to load");
            
            //Get the number from the keyboard
            poundsOfGrain = keyboard.nextDouble();
            
            //If the number is invalid (Less than one or greater than 5)
            if (poundsOfGrain < 0 || poundsOfGrain > 1500 ){
                System.out.println("Invalid number - Number must be between 1 and 5");
                continue; // And repeat again
            }
            break; // out of the repitiion
        }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    return poundsOfGrain; //Return the PoundsOfGrain
    }
    
    private double getBasketsOfSilk() {   
    //get the PoundsOfSilk of the tub from the user
       
        boolean valid = false;
        double basketsOfSilk = 0;
        Scanner keyboard = new Scanner(System.in);
        
        try{
        while (!valid) {    //while an valid number has not been retrieved
            
            System.out.println("Enter the baskets Of Silk you want to load.  "
                    + "Remember that 1 basket of silk is equal to 1 pound.");
            
            //Get the number from the keyboard
            basketsOfSilk = keyboard.nextDouble();
            
            //If the number is invalid (Less than one or greater than 5)
            if (basketsOfSilk < 0 || basketsOfSilk > 1500 ){
                System.out.println("Invalid number - Number must be between 1 and 5");
                continue; // And repeat again
            }
            break; // out of the repitiion
        }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    return basketsOfSilk; //Return the basketsOfSilk
    }
    
    private double getGift() {   
    //get the PoundsOfFlour of the tub from the user
       
        boolean valid = false;
        double gift = 0;
        Scanner keyboard = new Scanner(System.in);
        
        try{
        while (!valid) {    //while an valid number has not been retrieved
            
            System.out.println("There is only one gift here and it weighs"
                    + " 300 pounds.  You must select 1.");
            
            //Get the response from the keyboard
            gift = keyboard.nextDouble();
            
            //If the number is invalid (Less than one or greater than 5)
            if (gift < 1 || gift > 1 ){
                System.out.println("Invalid number - You must take one.");
                continue; // And repeat again
            }
            break; // out of the repitiion
        }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        
    return gift; //Return the gift
    }
 
   //call calcWagonWeight to perform calculations
    private double calcWeight(double wagonWeight, double poundsOfFlour, double poundsOfGrain, double basketsOfSilk, double gift) {
        CalculationsControl calculationsControl = new CalculationsControl();
        double totalWeight = calculationsControl.calcWagonWeight(wagonWeight, poundsOfFlour, poundsOfGrain, basketsOfSilk, gift);
        return totalWeight;
    
    
    }
    
    void displayMenu() {
        double wagonWeight = 500;
        double poundsOfFlour = this.getPoundsOfFlour();
        double poundsOfGrain = this.getPoundsOfGrain();
        double basketsOfSilk = this.getBasketsOfSilk();
        double gift = this.getGift();
        double totalWeight = this.calcWeight(wagonWeight, poundsOfFlour, poundsOfGrain, basketsOfSilk, gift);
        System.out.println("The total weight of your wagon is " + totalWeight + " pounds. Looks like your wagon will hold this just fine.  Travel safe."
                + " The Merchant joins you and it's time to start your journey to the castle.  'Let us be on our way!' He exclaims joyfully." );
        
        this.displayJourneyMenuView();
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        private void displayJourneyMenuView() {
        JourneyMenuView journeyMenuView = new JourneyMenuView();
        journeyMenuView.displayMenu();
     }

//    private double getpoundsOfFlour() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private double getpoundsOfGrain() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

  
}
    

