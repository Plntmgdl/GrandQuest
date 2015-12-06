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
public abstract class View implements ViewInterface {
    
    
    protected String displayMessage;
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    public void display() {
        String value = "";
        boolean done = false;
        
        do {
            this.console.println(this.displayMessage);
            value = this.Input();
            done = this.doAction(value);
        }
    while (!done);
    
}
    
@Override
public String getInput() {
    boolean valid = false;
    String selection = null;
    
    while (!valid) {
        
        selection = this.keyboard.readLine();
        selection = selection.trim();
        
        if (selection.length() < 1) {
            this.console.println("You must enter a value.");
            continue;
        }
        
        break;
    }
    
    return selection;
}

    private String Input() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
