/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

import GrandQuest.GrandQuest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jassen
 */
public abstract class View implements ViewInterface {
    
   
    private String promptMessage;
    
    
    protected final BufferedReader keyboard = GrandQuest.getInFile();
    protected final PrintWriter console = GrandQuest.getOutFile();
   
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String message) {
        this.promptMessage = message;
    }
    @Override
    public void displayMenu() {
        String value = "";
        boolean done = false;
        
        do {
            this.console.println(this.promptMessage);
            value = this.getInput();
            done = this.doAction(value);
        } while (!done);
    }
    
    @Override
    public String getInput() {
        
        boolean valid = false;
        String value = null;
        
        try {
            
            while (!valid) {
                value = this.keyboard.readLine();
                value = value.trim();
                
                if (value.length()<1) {
                this.console.println("You must enter a value.");
                continue;
            }
            break;
            }
        }catch (Exception e) {
                ErrorView.display(this.getClass().getName(),
                        "Error reading input: " + e.getMessage());
            }
            return value ;
    }
            
           

    
//    private boolean doAction(char value) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
        
    
    

