/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.control;

/**
 *
 * @author Jassen
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
}
    