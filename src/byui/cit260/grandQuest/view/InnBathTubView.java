/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

import byui.cit260.grandQuest.control.CalculationsControl;
import java.util.Scanner;

/**
 *
 * @author devin_000
 */
public class InnBathTubView {
    
    private double getHeight() {   
    //get the height of the tub from the user
       
        boolean valid = false;
        double height = 0;
        Scanner keyboard = new Scanner(System.in);
        
        try{
        while (!valid) {    //while an valid number has not been retrieved
            
            System.out.println("Enter the height of the tub. 1 - 5 measured in feet");
            
            //Get the number from the keyboard
            height = keyboard.nextDouble();
            
            //If the number is invalid (Less than one or greater than 5)
            if (height < 1 || height > 5 ){
                System.out.println("Invalid number - Number must be between 1 and 5");
                continue; // And repeat again
            }
            break; // out of the repitiion
        }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    return height; //Return the height
    }
    
    
    
    private double getDiameter() {   
    //get the Diameter of the tub from the user
       
        boolean valid = false;
        double diameter = 0;
        Scanner keyboard = new Scanner(System.in);
        
        try{
        while (!valid) {    //while an valid number has not been retrieved
            
            System.out.println("Enter the diameter of the tub. 1 - 5 measured in feet");
            
            //Get the number from the keyboard
            diameter = keyboard.nextDouble();
            
            //If the number is invalid (Less than one or greater than 5)
            if (diameter < 1 || diameter > 5 ){
                System.out.println("Invalid number - Number must be between 1 and 5");
                continue; // And repeat again
            }
            break; // out of the repitiion
        }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    return diameter; //Return the Diameter
    }
    
   //call calcVolumeOfTub to perform calculations
    private double calcTub(double height, double diameter) {
        CalculationsControl calculationsControl = new CalculationsControl();
        double waterLevel = calculationsControl.calcVolumeOfTub(height, diameter);
        return waterLevel;
    
    
    }
   

    void displayMenu() {
        double height = this.getHeight();
        double diameter = this.getDiameter();
        double waterLevel = this.calcTub(height, diameter);
        System.out.println("You fill the tub with " + waterLevel + " cubic feet of hot water. You enjoy a relaxing hot bath, feel well rested, and are ready for bed." );
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double CalculateVolumeOfTub() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
 
