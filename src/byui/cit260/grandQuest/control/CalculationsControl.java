/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.control;

/**
 *
 * 
 */
public class CalculationsControl {
    
    public double calcVolumeOfTub (double height, double diameter) {
        
        if (height < 0) {// confirm height is true
	    return -1;
        }
       
	if (diameter < 0 || diameter > 5) {// confirm diameter is in range
	    return -1;
        }
        
        double radius = diameter/2;
                
        double volume = (Math.PI * Math.pow(radius,2) * height);
                
        return volume;
 
    }
    
    
    
    
    
    
    
    
    public double calcStrengthOfRope (double diameter) {
        
        if (diameter < 0) {
	    return -1;
        }
        
	if (diameter > 0 && diameter < 2) {
		return -1;
        }
        
        double strength = (diameter * diameter)/200;
        
        return strength;


    }
    
    public double calcWagonWeight(double wagonWeight,double inventoryWeight) {		

	if (inventoryWeight < 0) {
            return -1;
        }
	if (inventoryWeight > 1500) {
            return -1;
        }
        if (wagonWeight < 0){
            return -1;
        }
        wagonWeight = 500;
               
        double totalWeight = (wagonWeight + inventoryWeight);
        return totalWeight;
    }

}
