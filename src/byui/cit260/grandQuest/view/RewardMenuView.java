/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.grandQuest.view;
import byui.cit260.grandQuest.model.Player;

/**
 *
 * @author Jassen
 */
public class RewardMenuView extends View {
    
    private Player currentPlayer;
    
    public RewardMenuView(){
    super ("\n"
               
                + "\n Choose your reward:                        |"
                + "\n--------------------------------------"
                + "\nG - Gold"
                + "\nL - Land"
                + "\nK - Knighthood"
                + "\nN - Nothing"
                + "\nE - Exit"
                + "\n--------------------------------------");
    }
    

    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
       
        switch (choice) {
            case 'G': 
                this.displayGold();
                break;
            case 'L': 
                this.displayLand();
                break;
            case 'K': 
                this.displayKnighthood();
                break;
            case 'N': 
                this.displayNothing();
                break;    
            case 'E': // Exit the program
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayGold() {
        System.out.println("\n As you make your request for gold you are"
                + "\n thrown in chains and put in a dark cell to spend the rest of your days"
                + "\n That will teach you for being greedy."
                + "\n THE END***"
                + "\n"
                + "\n"
                + "\n");
    this.displayStartProgramView();
}
    private void displayStartProgramView() {     
        
        StartProgramView startProgramView = new StartProgramView();
       startProgramView.startProgram();
}
    private void displayLand() {
        System.out.println("You make your request for a parcel of land."
                + "\n The prince gladly gives you a small chunk of land where"
                + "\n you spend the rest of your days working to pay the"
                + "\n heavy taxes the Prince places on his subjects."
                + "\n What? You were expecting him to be nice?"
                + "\n THE END***"
                + "\n"
                + "\n"
                + "\n");
        
        
    this.displayStartProgramView();
}
    
    private void displayKnighthood() {
        System.out.println("You request to be made a knight in his court."
                + "\n He gladly makes you one because a dragon has been terrorizing"
                + "\n the villagers. You take it upon yourself to beat this dragon"
                + "\n and on your very first encounter the dragon roasts you alive"
                + "\n and crunches on your bones. MMMMMM You taste just like chicken."
                + "\n THE END***"
                + "\n"
                + "\n"
                + "\n");
        
        
    this.displayStartProgramView();
}
    
    private void displayNothing() {
        System.out.println("You get down on one knee and say it was your pleasure to help"
                + "\n and you request nothing more than to continue on your journey home."
                + "\n The Prince amazed at your humility gives you supplies and a horse to"
                + "\n help you on your way. You mount up thank the Prince again and go "
                + "\n home to see the family you have missed ever so much."
                + "\n THE END***"
                + "\n"
                + "\n"
                + "\n");
        
        
    this.displayStartProgramView();
}
    

    
}
