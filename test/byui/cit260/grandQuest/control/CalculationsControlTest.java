/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jassen
 */
public class CalculationsControlTest {
    
    public CalculationsControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcVolumeOfTub method, of class CalculationsControl.
     */
    @Test
    public void testCalcVolumeOfTub() {
        System.out.println("calcVolumeOfTub");
        
        /*************************************
         * test case one
         *************************************/
        System.out.println("\tTest case #1");
        
        //input values for test case one
        double height = 3.0;
        double diameter = 5.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = 58.9048;
        double result = instance.calcVolumeOfTub(height, diameter);
        assertEquals(expResult, result, 0.0001);
       
    }
    
    { System.out.println("calcVolumeOfTub");
        
        /*************************************
         * test case two
        *************************************/
        System.out.println("\tTest case #2");
        
        //input values for test case two
        double height = -2.0;
        double diameter = 4.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = -1.0;
        double result = instance.calcVolumeOfTub(height, diameter);
        assertEquals(expResult, result, 0.0001);
       
    }
    
    { System.out.println("calcVolumeOfTub");
        
        /*************************************
         * test case three
        *************************************/
        System.out.println("\tTest case #3");
        
        //input values for test case three
        double height = 3.0;
        double diameter = -4.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = -1.0;
        double result = instance.calcVolumeOfTub(height, diameter);
        assertEquals(expResult, result, 0.0001);
       
    }
    
    { System.out.println("calcVolumeOfTub");
        
        /*************************************
         * test case four
        *************************************/
        System.out.println("\tTest case #4");
        
        //input values for test case four
        double height = 3.0;
        double diameter = 20.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = -1.0;
        double result = instance.calcVolumeOfTub(height, diameter);
        assertEquals(expResult, result, 0.0001);
       
    }
    
    { System.out.println("calcVolumeOfTub");
        
        /*************************************
         * test case five
        *************************************/
        System.out.println("\tTest case #5");
        
        //input values for test case five
        double height = 0.0;
        double diameter = 5.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = 0.0;
        double result = instance.calcVolumeOfTub(height, diameter);
        assertEquals(expResult, result, 0.0001);
       
    }
    
    { System.out.println("calcVolumeOfTub");
        
        /*************************************
         * test case six
        *************************************/
        System.out.println("\tTest case #6");
        
        //input values for test case six
        double height = 3.0;
        double diameter = 0.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = 0.0;
        double result = instance.calcVolumeOfTub(height, diameter);
        assertEquals(expResult, result, 0.0001);
       
    }
    
    { System.out.println("calcVolumeOfTub");
        
        /*************************************
         * test case seven
        *************************************/
        System.out.println("\tTest case #7");
        
        //input values for test case seven
        double height = 3.0;
        double diameter = 4.5;
        CalculationsControl instance = new CalculationsControl();
        double expResult = 47.7129;
        double result = instance.calcVolumeOfTub(height, diameter);
        assertEquals(expResult, result, 0.0001);
       
    }

    /**
     * Test of calcStrengthOfRope method, of class CalculationsControl.
     */
         @Test
    public void testCalcStrengthOfRope() {
        System.out.println("calcStrengthOfRope");
        
         /*************************************
         * test case one
         *************************************/
        System.out.println("\tTest case #1");
        
        //input values for test case one
        double diameter = 3.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = 0.045;
        double result = instance.calcStrengthOfRope(diameter);
        assertEquals(expResult, result, 0.0001);
    }
    
    { System.out.println("calcStrengthOfRope");
        
         /*************************************
         * test case two
         *************************************/
        System.out.println("\tTest case #2");
        
        //input values for test case two
        double diameter = -5.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = -1.0;
        double result = instance.calcStrengthOfRope(diameter);
        assertEquals(expResult, result, 0.0001);
    } 
    
    { System.out.println("calcStrengthOfRope");
        
         /*************************************
         * test case three
         *************************************/
        System.out.println("\tTest case #3");
        
        //input values for test case three
        double diameter = 0.01;
        CalculationsControl instance = new CalculationsControl();
        double expResult = -1.0;
        double result = instance.calcStrengthOfRope(diameter);
        assertEquals(expResult, result, 0.0001);
    } 
    
    { System.out.println("calcStrengthOfRope");
        
         /*************************************
         * test case four
         *************************************/
        System.out.println("\tTest case #4");
        
        //input values for test case four
        double diameter = 0.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = 0.0;
        double result = instance.calcStrengthOfRope(diameter);
        assertEquals(expResult, result, 0.0001);
    } 
    
    { System.out.println("calcStrengthOfRope");
        
         /*************************************
         * test case five
         *************************************/
        System.out.println("\tTest case #5");
        
        //input values for test case five
        double diameter = 2.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = 0.02;
        double result = instance.calcStrengthOfRope(diameter);
        assertEquals(expResult, result, 0.0001);
    } 
    
    { System.out.println("calcStrengthOfRope");
        
         /*************************************
         * test case six
         *************************************/
        System.out.println("\tTest case #6");
        
        //input values for test case six
        double diameter = 1.9;
        CalculationsControl instance = new CalculationsControl();
        double expResult = -1.0;
        double result = instance.calcStrengthOfRope(diameter);
        assertEquals(expResult, result, 0.0001);
    }
    
    { System.out.println("calcStrengthOfRope");
        
         /*************************************
         * test case seven
         *************************************/
        System.out.println("\tTest case #7");
        
        //input values for test case seven
        double diameter = 10.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = 0.5;
        double result = instance.calcStrengthOfRope(diameter);
        assertEquals(expResult, result, 0.0001);
    } 

    { System.out.println("calcWagonWeight");
        
         /*************************************
         * test case #1
         *************************************/
        System.out.println("\tTest case #1");
        
        //input values for test case #1
        double wagonWeight = 500.0;
        double inventoryWeight= 1000.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = 1500.0;
        double result = instance.calcWagonWeight(wagonWeight,inventoryWeight);
        assertEquals(expResult, result, 0.0001);
    } 
    
    { System.out.println("calcWagonWeight");
        
         /*************************************
         * test case #2
         *************************************/
        System.out.println("\tTest case #2");
        
        //input values for test case #2
        double wagonWeight = 500.0;
        double inventoryWeight= -50.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = -1;
        double result = instance.calcWagonWeight(wagonWeight,inventoryWeight);
        assertEquals(expResult, result, 0.0001);
    } 
    
    { System.out.println("calcWagonWeight");
        
         /*************************************
         * test case #3
         *************************************/
        System.out.println("\tTest case #3");
        
        //input values for test case #3
        double wagonWeight = -500.0;
        double inventoryWeight= 1000.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = -1;
        double result = instance.calcWagonWeight(wagonWeight,inventoryWeight);
        assertEquals(expResult, result, 0.0001);
    } 
    
    { System.out.println("calcWagonWeight");
        
         /*************************************
         * test case #4
         *************************************/
        System.out.println("\tTest case #4");
        
        //input values for test case #4
        double wagonWeight = 500.0;
        double inventoryWeight= 3000.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = -1;
        double result = instance.calcWagonWeight(wagonWeight,inventoryWeight);
        assertEquals(expResult, result, 0.0001);
    } 
    
    { System.out.println("calcWagonWeight");
        
         /*************************************
         * test case #5
         *************************************/
        System.out.println("\tTest case #5");
        
        //input values for test case #5
        double wagonWeight = 500.0;
        double inventoryWeight= 1.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = 501.0;
        double result = instance.calcWagonWeight(wagonWeight,inventoryWeight);
        assertEquals(expResult, result, 0.0001);
    } 
    
    { System.out.println("calcWagonWeight");
        
         /*************************************
         * test case #6
         *************************************/
        System.out.println("\tTest case #6");
        
        //input values for test case #6
        double wagonWeight = 500.0;
        double inventoryWeight= 1500.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = 2000.0;
        double result = instance.calcWagonWeight(wagonWeight,inventoryWeight);
        assertEquals(expResult, result, 0.0001);
    } 
    
    { System.out.println("calcWagonWeight");
        
         /*************************************
         * test case #7
         *************************************/
        System.out.println("\tTest case #7");
        
        //input values for test case #7
        double wagonWeight = 500.0;
        double inventoryWeight= 100.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = 600.0;
        double result = instance.calcWagonWeight(wagonWeight,inventoryWeight);
        assertEquals(expResult, result, 0.0001);
    } 

}
