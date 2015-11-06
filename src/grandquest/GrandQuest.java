/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandquest;


import byui.cit260.grandQuest.model.Game;
import byui.cit260.grandQuest.model.Player;
import byui.cit260.grandQuest.view.StartProgramView;
/**
 *
 * @author Jassen
 */
public class GrandQuest {
    
    private static Game currentGame = null;
    private static Player player = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Start Program View and start program
      
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
    }

    public static Game getCurretGame() {
        return currentGame;
    }

    public static void setCurretGame(Game curretGame) {
        GrandQuest.currentGame = curretGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        GrandQuest.player = player;
    }

    public static Player getplayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}