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
        double diameter = 3.0;
        CalculationsControl instance = new CalculationsControl();
        double expResult = 0.045;
        double result = instance.calcStrengthOfRope(diameter);
        assertEquals(expResult, result, 0.0001);
       
    }
    
}
