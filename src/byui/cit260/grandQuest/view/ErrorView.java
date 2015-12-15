/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

import GrandQuest.GrandQuest;
import java.io.PrintWriter;

/**
 *
 * @author Jassen
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = GrandQuest.getOutFile();
    private static final PrintWriter logFile = GrandQuest.getLogFile();
    
    public static void display(String className, String errorMessage) {
        errorFile.println(
                       "-----------------------------------"
                        + "\n- Error - " + errorMessage
                        + "\n------------------------------");
        
        logFile.println(className + " - " + errorMessage);
    }

    static class display {

        public display() {
        }
    }
}
