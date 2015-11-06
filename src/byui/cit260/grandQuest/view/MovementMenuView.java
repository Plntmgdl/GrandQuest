/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;

/**
 *
 * @author devin_000
 */
public class MovementMenuView {
    
    private final String MENU = "\n"
                + "\n--------------------------------------"
                + "\n|         Choose your Path           |"
                + "\n--------------------------------------"
                + "\nL - Go Left"
                + "\nS - Go Straight"
                + "\nR - Go Right"
                + "\nE - Save and End Game"
                + "\n--------------------------------------";

        public void displayMenu() {
            
            char selection = ' ';
            do{
        
                System.out.println(MENU); // display the main menu
                
                String input = this.getInput(); // get the user's selection
                selection = input.charAt(0); // get first character of string
                
                this.doAction(selection); // do action based on selection
                
            } while (selection != 'E'); // a selection is not "Save and End Game"
    }
        
         private String getInput() {
           
        boolean valid = false; // Indicates if Name has been retreived 
        String entry = null;
        Scanner keyboard = new Scanner(System.in); //Keyboard input stream
        
        while(!valid)  {  //while a valid entry has not been retreived
            
            // prompt for menu selection
            System.out.println("Enter your menu option below:");
            
            //Get the name from the keyboard and trim off the blanks
            entry = keyboard.nextLine();
            entry = entry.trim();
            
            break; // Out of the (exit) the repetition
        }
      return entry; //Return the selection
    }

    private void doAction(char choice) {
        switch (choice) {
            case 'L': // Move to the Left
                this.displayMoveLeft();
                break;
            case 'S': // Move Straight
                this.displayMoveStraight();
                break;
            case 'R': // Move to the Right
                this.displayMoveRight();
                break;
            case 'E': // save game and return to main menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
    
    private void displayMoveLeft() {
       System.out.println ("\n---------------------------------------"
                   + "\n | You turned left and continued on your Quest |"
                   + "\n-------------------------------------------"
                   + "\n Choose your path"
                   + "\n Left, Right, Straight");
    }
    
    private void displayMoveStraight() {
       System.out.println ("\n---------------------------------------"
                   + "\n | You went sraight and continued on your Quest |"
                   + "\n-------------------------------------------"
                   + "\n Choose your path"
                   + "\n Left, Right, Straight");
     
    }
    
    private void displayMoveRight(){
        System.out.println ("\n---------------------------------------"
                   + "\n | You turned right and continued on your Quest |"
                   + "\n-------------------------------------------"
                   + "\n Choose your path"
                   + "\n Left, Right, Straight");
     
    }
    
}

    

