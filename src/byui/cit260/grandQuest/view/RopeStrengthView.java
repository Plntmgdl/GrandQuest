/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;


import java.util.Scanner;

/**
 *
 * @author Jassen
 */
class RopeStrengthView {
    private double getDiameter() {   
    //get the height of the tub from the user
       
        boolean valid = false;
        double diameter = 0;
        Scanner keyboard = new Scanner(System.in);
        
        try{
        while (!valid) {    //while an valid number has not been retrieved
            
            System.out.println("\nEnter the diameter of the rope. The ropes you have to choose from"
                    + "\n are a half inch rope, a two inch rope and a sturdy three inch rope. ");
            
            //Get the number from the keyboard
            diameter = keyboard.nextDouble();
            
            //If the number is invalid (Less than one or greater than 5)
            if (diameter > 0 && diameter < 2){
                
                System.out.println("Invalid number - Number must be between 0 and 3");
                continue; // And repeat again
            }
            break; // out of the repitiion
        }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    return diameter; //Return the strength
    }
    
    
    
    void displayMenu() {
        double diameter = this.getDiameter();
        double strength = (diameter * diameter)/200;
        System.out.println("You rope will hold " + strength + " pounds of cargo. "
                + "\n You swim across and tie the rope to the anchor post on the other side."
                + "\n Then you slowly guide the wagon across until you are safely on the other side." );
 
    
    this.displayJourneyMenuViewThree();{
    }

   
}

    private void displayJourneyMenuViewThree() {
        JourneyMenuViewThree journeyMenuViewThree = new JourneyMenuViewThree();
        journeyMenuViewThree.displayMenu();}
    }

