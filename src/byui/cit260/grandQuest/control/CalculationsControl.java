/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.control;



import citbyui.cit260.grandQuest.exceptions.CalculationsControlException;

/**
 *
 * 
 */
public class CalculationsControl {

    public static double calcVolumeOfTub (double height, double diameter) 
            throws CalculationsControlException {
        
        if (height < 0) {// confirm height is true
	    throw new CalculationsControlException("Can't calculate"
                                                   + "because height is less than zero");
        }
       
	if (diameter < 0 || diameter > 5) {// confirm diameter is in range
	    throw new CalculationsControlException("Can't calculate"
                                                   + "because diameter is less than zero"
                                                   + " or greater than five.");
        }
        
        double radius = diameter/2;
                
        double volume = (Math.PI * Math.pow(radius,2) * height);
                
        return volume;
 
    }

    public static double CalculateVolumeOfTub() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
    
    
    
    
    
    public double calcStrengthOfRope (double diameter) 
            throws CalculationsControlException {
        
        if (diameter < 0) {
	    throw new CalculationsControlException("Can't calculate"
                                                   + "because diameter is less than zero");
        }
        
	if (diameter > 0 && diameter < 2) {
		throw new CalculationsControlException("Can't calculate"
                                                   + "because diameter is greater than zero"
                                                   + "and less than 2 inches");
        }
        
        double strength = (diameter * diameter)/200;
        
        return strength;


    }
    
    public double calcWagonWeight(double wagonWeight,double inventoryWeight) 
            throws CalculationsControlException {		

	if (inventoryWeight < 0) {
            throw new CalculationsControlException("Can't calculate"
                                                   + "because weight is less than zero");
        }
	if (inventoryWeight > 1500) {
            throw new CalculationsControlException("Can't calculate"
                                                   + "because weight is greater than 1500");
        }
        if (wagonWeight < 0){
           throw new CalculationsControlException("Can't calculate"
                                                   + "because wagon weight is less than zero");
        }
        wagonWeight = 500;
               
        double totalWeight = (wagonWeight + inventoryWeight);
        return totalWeight;
    }

   

}
